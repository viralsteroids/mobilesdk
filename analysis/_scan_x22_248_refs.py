import struct
from pathlib import Path
from elftools.elf.elffile import ELFFile

LIB = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
OUT = Path(r"C:\temp\MobileSDK\analysis\x22_248_ref_scan.md")

REG = 22
OFFSET = 0x248

REG_NAMES = [f"x{i}" for i in range(31)] + ["xzr"]


def reg_name(idx):
    return "sp" if idx == 31 else (REG_NAMES[idx] if idx < len(REG_NAMES) else f"x{idx}")


def get_text_section(elf):
    sec = elf.get_section_by_name('.text')
    if sec is None:
        for seg in elf.iter_segments():
            if seg['p_type'] == 'PT_LOAD' and (seg['p_flags'] & 1):
                return seg
    return sec


def decode_ldr_imm(word):
    if (word & 0xFFC00000) == 0xF9400000:
        imm12 = (word >> 10) & 0xFFF
        rn = (word >> 5) & 0x1F
        rt = word & 0x1F
        return (rn, rt, imm12 * 8)
    return None


with LIB.open('rb') as f:
    elf = ELFFile(f)
    sec = get_text_section(elf)
    if sec is None:
        OUT.write_text("No .text or exec PT_LOAD found.\n", encoding="utf-8")
        raise SystemExit(0)

    if hasattr(sec, 'data'):
        data = sec.data()
        base = sec['sh_addr']
    else:
        data = sec.data()
        base = sec['p_vaddr']

    hits = []
    for i in range(0, len(data), 4):
        word = struct.unpack_from('<I', data, i)[0]
        di = decode_ldr_imm(word)
        if not di:
            continue
        rn, rt, off = di
        if rn == REG and off == OFFSET:
            hits.append(base + i)

    out = [
        f"# LDR [{reg_name(REG)}+0x{OFFSET:x}] reference scan", "",
        f"Library: {LIB}", f"Scan window: full .text", "",
    ]
    if not hits:
        out.append("No hits.")
    else:
        out.append(f"Hits: {len(hits)}")
        for addr in hits:
            out.append(f"- 0x{addr:08x}")
    OUT.write_text("\n".join(out), encoding="utf-8")
    print(f"Wrote {OUT}")
