import struct
from pathlib import Path
from elftools.elf.elffile import ELFFile

LIB = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
OUT = Path(r"C:\temp\MobileSDK\analysis\jni_create_stack_offset_pairs.md")

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


def sign_extend(value, bits):
    sign = 1 << (bits - 1)
    return (value ^ sign) - sign


def decode_ldp_stp(word):
    # LDP/STP (64-bit) - unsigned immediate (scaled)
    if (word & 0xFFC00000) == 0xA9400000:
        imm7 = (word >> 15) & 0x7F
        rn = (word >> 5) & 0x1F
        rt = word & 0x1F
        rt2 = (word >> 10) & 0x1F
        off = sign_extend(imm7, 7) * 8
        return ("ldp", rn, rt, rt2, off)
    if (word & 0xFFC00000) == 0xA9000000:
        imm7 = (word >> 15) & 0x7F
        rn = (word >> 5) & 0x1F
        rt = word & 0x1F
        rt2 = (word >> 10) & 0x1F
        off = sign_extend(imm7, 7) * 8
        return ("stp", rn, rt, rt2, off)
    return None


with LIB.open('rb') as f:
    elf = ELFFile(f)
    out = [
        "# JNI Create stack/context offset scan (LDP/STP)",
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
            di = decode_ldp_stp(word)
            if not di:
                continue
            kind, rn, rt, rt2, offimm = di
            if offimm in INTEREST_OFFSETS:
                hits.append((vaddr + i, kind, rn, rt, rt2, offimm))
        if not hits:
            out.append("- No LDP/STP hits for offsets of interest")
            out.append("")
            continue
        out.append(f"- Hits: {len(hits)}")
        for addr, kind, rn, rt, rt2, offimm in hits:
            out.append(f"  - {kind} {reg_name(rt)}, {reg_name(rt2)}, [{reg_name(rn)}+0x{offimm:x}] @ 0x{addr:08x}")
        out.append("")

OUT.write_text("\n".join(out), encoding="utf-8")
print(f"Wrote {OUT}")
