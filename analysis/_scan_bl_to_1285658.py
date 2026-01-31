from pathlib import Path
from elftools.elf.elffile import ELFFile

path = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
TARGET = 0x1285658

with path.open('rb') as f:
    elf = ELFFile(f)
    text = elf.get_section_by_name('.text')
    if not text:
        raise SystemExit('no .text')
    base = text['sh_addr']
    data = text.data()


def sign_extend(val, bits):
    sign = 1 << (bits - 1)
    return (val & (sign - 1)) - (val & sign)

hits = []
for addr in range(base, base + len(data), 4):
    insn = int.from_bytes(data[addr-base:addr-base+4], 'little')
    if (insn & 0xFC000000) == 0x94000000:
        imm26 = insn & 0x03FFFFFF
        off = sign_extend(imm26, 26) << 2
        tgt = (addr + off) & 0xFFFFFFFFFFFFFFFF
        if tgt == TARGET:
            hits.append(addr)

out_lines = [f"BL callsites to 0x{TARGET:x} ({len(hits)})"]
for h in hits:
    out_lines.append(f"0x{h:x}")

out = Path(r"C:\temp\MobileSDK\analysis\bl_to_1285658.md")
out.write_text("\n".join(out_lines), encoding='utf-8')
print(out)
