import struct
from pathlib import Path
from elftools.elf.elffile import ELFFile

path = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")

with path.open('rb') as f:
    elf = ELFFile(f)
    text = elf.get_section_by_name('.text')
    if not text:
        raise SystemExit('no .text')
    text_addr = text['sh_addr']
    data = text.data()

# search for BLR X27 (opcode 0xD63F0360) and BLR X? general mask

def find_blr_x27(data, base):
    hits = []
    for off in range(0, len(data), 4):
        insn = int.from_bytes(data[off:off+4], 'little')
        if insn == 0xD63F0360:  # BLR X27
            hits.append(base + off)
    return hits

hits = find_blr_x27(data, text_addr)

out_lines = []
out_lines.append(f"Binary: {path}")
out_lines.append(f"BLR X27 hits: {len(hits)}")
for a in hits[:200]:
    out_lines.append(f"  - 0x{a:x}")
if len(hits) > 200:
    out_lines.append(f"  ... +{len(hits)-200} more")

out_path = Path(r"C:\temp\MobileSDK\analysis\full_blr_x27_hits.md")
out_path.write_text("\n".join(out_lines), encoding='utf-8')
print(out_path)
