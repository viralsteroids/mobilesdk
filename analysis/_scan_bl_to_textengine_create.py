import struct
from pathlib import Path
from elftools.elf.elffile import ELFFile

LIB = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
OUT = Path(r"C:\temp\MobileSDK\analysis\bl_callers_textengine_create.md")

TARGETS = {
    0x0114662c: "TextEngine::Create(char*,bool)",
    0x011466b8: "TextEngine::Create(uchar*,int,bool)",
}


def get_text_section(elf):
    sec = elf.get_section_by_name('.text')
    if sec is None:
        # fallback to exec PT_LOAD
        for seg in elf.iter_segments():
            if seg['p_type'] == 'PT_LOAD' and (seg['p_flags'] & 1):
                return seg
    return sec


def iter_bl(data, base_vaddr):
    for i in range(0, len(data), 4):
        word = struct.unpack_from('<I', data, i)[0]
        if (word & 0xFC000000) == 0x94000000:
            imm26 = word & 0x03FFFFFF
            if imm26 & (1 << 25):
                imm26 -= 1 << 26
            target = (base_vaddr + i) + (imm26 << 2)
            yield (base_vaddr + i, target)


with LIB.open('rb') as f:
    elf = ELFFile(f)
    sec = get_text_section(elf)
    if sec is None:
        OUT.write_text("No .text or exec segment found.\n", encoding="utf-8")
        raise SystemExit(0)

    if hasattr(sec, 'data'):
        data = sec.data()
        base = sec['sh_addr']
    else:
        data = sec.data()
        base = sec['p_vaddr']

    hits = {t: [] for t in TARGETS}
    for call_site, target in iter_bl(data, base):
        if target in hits:
            hits[target].append(call_site)

    out = [
        "# BL callers of TextEngine::Create", "", f"Library: {LIB}", ""
    ]

    for target, name in TARGETS.items():
        out.append(f"## {name} @ 0x{target:08x}")
        if not hits[target]:
            out.append("- No BL callers found")
            out.append("")
            continue
        out.append(f"- Callers: {len(hits[target])}")
        for cs in hits[target]:
            out.append(f"  - call @ 0x{cs:08x}")
        out.append("")

    OUT.write_text("\n".join(out), encoding="utf-8")
    print(f"Wrote {OUT}")
