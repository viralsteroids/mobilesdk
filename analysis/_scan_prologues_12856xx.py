from pathlib import Path
from elftools.elf.elffile import ELFFile

path = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
start = 0x1270000
end = 0x1288000
callsite = 0x12876d0

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


def decode_stp_pre(insn):
    # STP pre-index, 64-bit: mask 0xFFC00000 == 0xA9800000
    if (insn & 0xFFC00000) == 0xA9800000:
        rt = insn & 0x1F
        rt2 = (insn >> 10) & 0x1F
        rn = (insn >> 5) & 0x1F
        imm7 = (insn >> 15) & 0x7F
        off = sign_extend(imm7, 7) * 8
        return (rt, rt2, rn, off)
    return None


def decode_sub_sp(insn):
    if (insn & 0x7F8003FF) == 0xD10003FF:
        imm12 = (insn >> 10) & 0xFFF
        shift = (insn >> 22) & 0x1
        imm = imm12 << (12 if shift else 0)
        return imm
    return None

lines = []
lines.append(f"Scan range 0x{start:x}..0x{end:x}")
prologues = []
for addr in range(start, end, 4):
    off = addr - base
    if off < 0 or off+4 > len(data):
        continue
    insn = int.from_bytes(data[off:off+4], 'little')
    stp = decode_stp_pre(insn)
    if stp:
        rt, rt2, rn, offb = stp
        if rn == 31:
            lines.append(f"0x{addr:x}: STP pre X{rt}, X{rt2}, [SP, {offb}]!")
            if rt == 29 and rt2 == 30:
                prologues.append(addr)
        continue
    sub = decode_sub_sp(insn)
    if sub is not None:
        lines.append(f"0x{addr:x}: SUB SP, SP, 0x{sub:x}")
        continue

if prologues:
    prev = max(a for a in prologues if a < callsite)
    lines.append(f"Nearest STP X29,X30 pre-index before 0x{callsite:x}: 0x{prev:x}")
else:
    lines.append(f"No STP X29,X30 pre-index found before 0x{callsite:x}")

out = Path(r"C:\temp\MobileSDK\analysis\full_1285658_prologue_scan.md")
out.write_text("\n".join(lines), encoding='utf-8')
print(out)
