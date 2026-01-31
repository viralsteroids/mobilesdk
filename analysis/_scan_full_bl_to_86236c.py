import struct
from pathlib import Path
from elftools.elf.elffile import ELFFile

path = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
TARGET = 0x86236c

with path.open('rb') as f:
    elf = ELFFile(f)
    text = elf.get_section_by_name('.text')
    if not text:
        raise SystemExit('no .text')
    text_addr = text['sh_addr']
    data = text.data()

hits = []
for off in range(0, len(data), 4):
    insn = int.from_bytes(data[off:off+4], 'little')
    if (insn & 0xFC000000) == 0x94000000:  # BL
        imm26 = insn & 0x03FFFFFF
        if imm26 & (1 << 25):
            imm26 -= 1 << 26
        target = text_addr + off + (imm26 << 2)
        if target == TARGET:
            hits.append(text_addr + off)

out_lines = []
out_lines.append(f"Binary: {path}")
out_lines.append(f"Target: 0x{TARGET:x}")
out_lines.append(f"BL callsites: {len(hits)}")
for h in hits:
    out_lines.append(f"  - 0x{h:x}")

out_path = Path(r"C:\temp\MobileSDK\analysis\full_bl_to_86236c.md")
out_path.write_text("\n".join(out_lines), encoding='utf-8')
print(out_path)
