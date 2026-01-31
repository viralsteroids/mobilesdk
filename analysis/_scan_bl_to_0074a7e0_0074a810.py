import struct
from pathlib import Path
from elftools.elf.elffile import ELFFile

LIB = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
OUT = Path(r"C:\temp\MobileSDK\analysis\bl_callers_0074a7e0_0074a810.md")

TARGETS = {
    0x0074a7e0: "func_0074a7e0",
    0x0074a810: "func_0074a810",
}

FOCUS_RANGES = [
    (0x01146000, 0x0114a800),  # TextEngine::Create region
    (0x00b23c40, 0x00b23cb0),  # x22+0x248 store window
    (0x01121300, 0x01121350),
    (0x0132dad0, 0x0132db10),
    (0x0137dd20, 0x0137dd60),
]


def in_ranges(addr, ranges):
    for start, end in ranges:
        if start <= addr < end:
            return True
    return False


def get_text_section(elf):
    sec = elf.get_section_by_name('.text')
    if sec is None:
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
    focus = {t: [] for t in TARGETS}
    for call_site, target in iter_bl(data, base):
        if target in hits:
            hits[target].append(call_site)
            if in_ranges(call_site, FOCUS_RANGES):
                focus[target].append(call_site)

    out = [
        "# BL callers for 0x0074a7e0 / 0x0074a810 (summary)", "", f"Library: {LIB}", "",
        "Focus ranges:",
    ]
    for start, end in FOCUS_RANGES:
        out.append(f"- 0x{start:08x}..0x{end-1:08x}")
    out.append("")

    for target, name in TARGETS.items():
        out.append(f"## {name} @ 0x{target:08x}")
        out.append(f"- Total callers: {len(hits[target])}")
        if not focus[target]:
            out.append("- Callers in focus ranges: none")
        else:
            out.append(f"- Callers in focus ranges: {len(focus[target])}")
            for cs in focus[target]:
                out.append(f"  - call @ 0x{cs:08x}")
        out.append("")

    OUT.write_text("\n".join(out), encoding="utf-8")
    print(f"Wrote {OUT}")
