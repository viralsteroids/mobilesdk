import re
from pathlib import Path
from elftools.elf.elffile import ELFFile

so_path = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
calls_path = Path(r"C:\temp\MobileSDK\analysis\full_bl_to_86236c.md")

# parse callsites list
calls = []
for line in calls_path.read_text(encoding='utf-8').splitlines():
    m = re.match(r"\s*- 0x([0-9a-fA-F]+)", line)
    if m:
        calls.append(int(m.group(1), 16))

# filter range near text engine
RANGE_START = 0x1200000
RANGE_END = 0x1300000
calls = [c for c in calls if RANGE_START <= c <= RANGE_END]

with so_path.open('rb') as f:
    elf = ELFFile(f)
    text = elf.get_section_by_name('.text')
    if not text:
        raise SystemExit('no .text')
    text_addr = text['sh_addr']
    data = text.data()

WINDOW = 80  # instructions back


def sign_extend(val, bits):
    sign = 1 << (bits - 1)
    return (val & (sign - 1)) - (val & sign)


def decode_adrp(insn, pc):
    if (insn & 0x9F000000) != 0x90000000:
        return None
    immlo = (insn >> 29) & 0x3
    immhi = (insn >> 5) & 0x7FFFF
    imm = (immhi << 2) | immlo
    imm = sign_extend(imm, 21)
    rd = insn & 0x1F
    base = (pc & ~0xFFF) + (imm << 12)
    return (rd, base)


def decode_add_imm(insn):
    if (insn & 0x7F000000) != 0x91000000:
        return None
    rd = insn & 0x1F
    rn = (insn >> 5) & 0x1F
    imm12 = (insn >> 10) & 0xFFF
    shift = (insn >> 22) & 0x1
    imm = imm12 << (12 if shift else 0)
    return (rd, rn, imm)


def decode_mov_reg(insn):
    if (insn & 0xFFE0FFE0) == 0xAA0003E0:
        rd = insn & 0x1F
        rm = (insn >> 16) & 0x1F
        return (rd, rm)
    return None


def decode_ldr_imm(insn):
    if (insn & 0xFFC00000) == 0xF9400000:
        rt = insn & 0x1F
        rn = (insn >> 5) & 0x1F
        imm12 = (insn >> 10) & 0xFFF
        off = imm12 * 8
        return (rt, rn, off)
    return None


def reg_label(r):
    return 'SP' if r == 31 else f"X{r}"

lines = []
lines.append(f"Binary: {so_path}")
lines.append(f"Callsites in range 0x{RANGE_START:x}-0x{RANGE_END:x}: {len(calls)}")

for c in calls:
    start = max(text_addr, c - WINDOW*4)
    expr = {i: reg_label(i) for i in range(31)}
    last = {i: None for i in range(31)}
    for a in range(start, c, 4):
        off = a - text_addr
        if off < 0 or off+4 > len(data):
            continue
        insn = int.from_bytes(data[off:off+4], 'little')
        adrp = decode_adrp(insn, a)
        if adrp:
            rd, base = adrp
            expr[rd] = f"0x{base:x}"
            last[rd] = a
            continue
        addi = decode_add_imm(insn)
        if addi:
            rd, rn, imm = addi
            expr[rd] = f"{expr.get(rn, reg_label(rn))}+0x{imm:x}"
            last[rd] = a
            continue
        movr = decode_mov_reg(insn)
        if movr:
            rd, rm = movr
            expr[rd] = expr.get(rm, reg_label(rm))
            last[rd] = a
            continue
        ldr = decode_ldr_imm(insn)
        if ldr:
            rt, rn, off = ldr
            expr[rt] = f"MEM[{expr.get(rn, reg_label(rn))}+0x{off:x}]"
            last[rt] = a
            continue
    x19_expr = expr.get(19)
    x19_set = last.get(19)
    x0_expr = expr.get(0)
    x0_set = last.get(0)
    lines.append(f"0x{c:x}: X19={x19_expr} (set @{x19_set if x19_set else 'None'}); X0={x0_expr} (set @{x0_set if x0_set else 'None'})")

out_path = Path(r"C:\temp\MobileSDK\analysis\full_bl_to_86236c_x19_range.md")
out_path.write_text("\n".join(lines), encoding='utf-8')
print(out_path)
