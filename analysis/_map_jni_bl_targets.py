import struct
from pathlib import Path
from collections import Counter
from elftools.elf.elffile import ELFFile

LIB = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
OUT = Path(r"C:\temp\MobileSDK\analysis\jni_create_bl_targets_mapped.md")

TARGETS = {
    "DocEngine::Create(char*,bool)": 0x00965160,
    "DocEngine::Create(uchar*,int,bool)": 0x009655dc,
    "TextEngine::Create(char*,bool)": 0x0114662c,
    "TextEngine::Create(uchar*,int,bool)": 0x011466b8,
}

SCAN_BYTES = 0x2000
CLUSTER_RANGE = (0x02550000, 0x02700000)


def vaddr_to_offset(elf, vaddr):
    for seg in elf.iter_segments():
        if seg['p_type'] != 'PT_LOAD':
            continue
        start = seg['p_vaddr']
        end = start + seg['p_memsz']
        if start <= vaddr < end:
            return seg['p_offset'] + (vaddr - start)
    return None


def decode_bl_targets(data, base_vaddr):
    hits = []
    for i in range(0, len(data), 4):
        if i + 4 > len(data):
            break
        word = struct.unpack_from('<I', data, i)[0]
        if (word & 0xFC000000) == 0x94000000:
            imm26 = word & 0x03FFFFFF
            if imm26 & (1 << 25):
                imm26 -= 1 << 26
            target = (base_vaddr + i) + (imm26 << 2)
            hits.append((base_vaddr + i, target))
    return hits


def load_symbols(elf):
    syms = []
    for sec_name in ('.symtab', '.dynsym'):
        sec = elf.get_section_by_name(sec_name)
        if sec is None:
            continue
        for sym in sec.iter_symbols():
            st_value = sym['st_value']
            st_size = sym['st_size']
            if st_value == 0:
                continue
            name = sym.name
            syms.append((st_value, st_size, name, sec_name))
    syms.sort(key=lambda x: x[0])
    return syms


def find_symbol(syms, addr):
    # binary search for last symbol with value <= addr
    lo, hi = 0, len(syms)
    while lo < hi:
        mid = (lo + hi) // 2
        if syms[mid][0] <= addr:
            lo = mid + 1
        else:
            hi = mid
    idx = lo - 1
    if idx < 0:
        return None, None
    st_value, st_size, name, sec_name = syms[idx]
    in_range = False
    if st_size and addr < st_value + st_size:
        in_range = True
    return (st_value, st_size, name, sec_name), in_range


def section_for_addr(elf, addr):
    for sec in elf.iter_sections():
        sh_addr = sec['sh_addr']
        sh_size = sec['sh_size']
        if sh_addr <= addr < sh_addr + sh_size:
            return sec.name
    return None


with LIB.open('rb') as f:
    elf = ELFFile(f)
    syms = load_symbols(elf)
    out = [
        "# JNI create() BL targets mapped to symbols",
        "",
        f"Library: {LIB}",
        f"Scan window: 0x{SCAN_BYTES:x} bytes",
        f"Symbol sources: {', '.join(sorted(set(s[3] for s in syms)))}" if syms else "Symbol sources: (none)",
        "",
    ]

    for name, vaddr in TARGETS.items():
        off = vaddr_to_offset(elf, vaddr)
        out.append(f"## {name} @ 0x{vaddr:08x}")
        if off is None:
            out.append("- ERROR: vaddr not in any PT_LOAD segment")
            out.append("")
            continue
        f.seek(off)
        data = f.read(SCAN_BYTES)
        hits = decode_bl_targets(data, vaddr)
        targets = [t for _, t in hits]
        counts = Counter(targets)
        out.append(f"- BL count: {len(hits)}")
        out.append(f"- Unique targets: {len(counts)}")

        # top targets mapped
        out.append("- Top targets (mapped):")
        for target, cnt in counts.most_common(12):
            sec_name = section_for_addr(elf, target)
            sym, in_range = find_symbol(syms, target) if syms else (None, None)
            sym_str = ""
            if sym:
                st_value, st_size, sname, ssec = sym
                if in_range:
                    sym_str = f"{sname} (+0x{target - st_value:x})"
                else:
                    sym_str = f"nearest {sname} @ 0x{st_value:08x}"
            cluster = " cluster" if (CLUSTER_RANGE[0] <= target < CLUSTER_RANGE[1]) else ""
            out.append(f"  - 0x{target:08x}: {cnt} | sec={sec_name} | sym={sym_str}{cluster}")
        out.append("")

OUT.write_text("\n".join(out), encoding="utf-8")
print(f"Wrote {OUT}")
