import struct
from pathlib import Path
from elftools.elf.elffile import ELFFile

path = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
TARGET = 0x1285658

with path.open('rb') as f:
    elf = ELFFile(f)
    text = elf.get_section_by_name('.text')
    if not text:
        raise SystemExit('no .text')
    text_addr = text['sh_addr']
    data = text.data()

# find BL callsites to TARGET
calls = []
for off in range(0, len(data), 4):
    insn = int.from_bytes(data[off:off+4], 'little')
    if (insn & 0xFC000000) == 0x94000000:
        imm26 = insn & 0x03FFFFFF
        if imm26 & (1 << 25):
            imm26 -= 1 << 26
        target = text_addr + off + (imm26 << 2)
        if target == TARGET:
            calls.append(text_addr + off)

WINDOW = 80

# decode helpers

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
lines.append(f"Binary: {path}")
lines.append(f"Target: 0x{TARGET:x} BL callsites: {len(calls)}")
lines.append("")

# filter to range near TextEngine
RANGE_START = 0x1200000
RANGE_END = 0x1300000
calls = [c for c in calls if RANGE_START <= c <= RANGE_END]

for c in calls:
    start = max(text_addr, c - WINDOW*4)
    expr = {i: reg_label(i) for i in range(31)}
    last = {i: None for i in range(31)}
    for a in range(start, c, 4):
        off = a - text_addr
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
            rt, rn, offb = ldr
            expr[rt] = f"MEM[{expr.get(rn, reg_label(rn))}+0x{offb:x}]"
            last[rt] = a
            continue
    x23_expr = expr.get(23)
    x23_set = last.get(23)
    set_str = f"0x{x23_set:x}" if x23_set is not None else "None"
    lines.append(f"0x{c:x}: X23={x23_expr} (set @{set_str})")

out_path = Path(r"C:\temp\MobileSDK\analysis\full_bl_to_1285658_x23_range.md")
out_path.write_text("\n".join(lines), encoding='utf-8')
print(out_path)
