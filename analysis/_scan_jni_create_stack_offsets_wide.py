import struct
from pathlib import Path
from elftools.elf.elffile import ELFFile

LIB = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
OUT = Path(r"C:\temp\MobileSDK\analysis\jni_create_stack_offset_trace_wide.md")

TARGETS = {
    "TextEngine::Create(char*,bool)": 0x0114662c,
    "TextEngine::Create(uchar*,int,bool)": 0x011466b8,
}

SCAN_BYTES = 0x6000
INTEREST_OFFSETS = {0x580, 0x520, 0x9D0, 0x158, 0x248}

REG_NAMES = [f"x{i}" for i in range(31)] + ["xzr"]


def reg_name(idx):
    return "sp" if idx == 31 else (REG_NAMES[idx] if idx < len(REG_NAMES) else f"x{idx}")


def vaddr_to_offset(elf, vaddr):
    for seg in elf.iter_segments():
        if seg['p_type'] != 'PT_LOAD':
            continue
        start = seg['p_vaddr']
        end = start + seg['p_memsz']
        if start <= vaddr < end:
            return seg['p_offset'] + (vaddr - start)
    return None


def decode_ldr_str_imm(word):
    if (word & 0xFFC00000) == 0xF9400000:
        imm12 = (word >> 10) & 0xFFF
        rn = (word >> 5) & 0x1F
        rt = word & 0x1F
        return ("ldr", rn, rt, imm12 * 8)
    if (word & 0xFFC00000) == 0xF9000000:
        imm12 = (word >> 10) & 0xFFF
        rn = (word >> 5) & 0x1F
        rt = word & 0x1F
        return ("str", rn, rt, imm12 * 8)
    return None


with LIB.open('rb') as f:
    elf = ELFFile(f)
    out = [
        "# JNI Create stack/context offset scan (wide)",
        "",
        f"Library: {LIB}",
        f"Scan window: 0x{SCAN_BYTES:x} bytes",
        "Offsets of interest: " + ", ".join(f"0x{x:x}" for x in sorted(INTEREST_OFFSETS)),
        "",
    ]

    for name, vaddr in TARGETS.items():
        off = vaddr_to_offset(elf, vaddr)
        out.append(f"## {name} @ 0x{vaddr:08x}")
        if off is None:
            out.append("- ERROR: vaddr not in PT_LOAD")
            out.append("")
            continue
        f.seek(off)
        data = f.read(SCAN_BYTES)
        hits = []
        for i in range(0, len(data), 4):
            word = struct.unpack_from('<I', data, i)[0]
            di = decode_ldr_str_imm(word)
            if not di:
                continue
            kind, rn, rt, offimm = di
            if offimm in INTEREST_OFFSETS:
                hits.append((vaddr + i, kind, rn, rt, offimm))
        if not hits:
            out.append("- No LDR/STR imm hits for offsets of interest")
            out.append("")
            continue
        out.append(f"- Hits: {len(hits)}")
        for addr, kind, rn, rt, offimm in hits:
            out.append(f"  - {kind} {reg_name(rt)}, [{reg_name(rn)}+0x{offimm:x}] @ 0x{addr:08x}")
        out.append("")

OUT.write_text("\n".join(out), encoding="utf-8")
print(f"Wrote {OUT}")
