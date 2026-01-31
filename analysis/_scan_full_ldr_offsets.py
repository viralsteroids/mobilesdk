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

# imm12 for offsets 0x6ac8 and 0x6ad0 in LDR Xt, [Xn, #imm12*8]
imm_target = {0x6ac8: 0x6ac8 // 8, 0x6ad0: 0x6ad0 // 8}

hits = {k: [] for k in imm_target}

for off in range(0, len(data), 4):
    insn = int.from_bytes(data[off:off+4], 'little')
    if (insn & 0xFFC00000) == 0xF9400000:
        imm12 = (insn >> 10) & 0xFFF
        for off_bytes, imm in imm_target.items():
            if imm12 == imm:
                hits[off_bytes].append(text_addr + off)

out_lines = []
out_lines.append(f"Binary: {path}")
out_lines.append(f".text addr=0x{text_addr:x} size=0x{len(data):x}")
for off_bytes, addrs in hits.items():
    out_lines.append("")
    out_lines.append(f"LDR Xt, [Xn, #{off_bytes:#x}] hits={len(addrs)}")
    for a in addrs[:50]:
        out_lines.append(f"  - 0x{a:x}")
    if len(addrs) > 50:
        out_lines.append(f"  ... +{len(addrs)-50} more")

out_path = Path(r"C:\temp\MobileSDK\analysis\full_ldr_offset_6ac8_6ad0_hits.md")
out_path.write_text("\n".join(out_lines), encoding='utf-8')
print(out_path)
