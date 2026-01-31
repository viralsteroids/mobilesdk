import sys
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

blr_hits = [0x863990, 0x863e24, 0x863ffc]
WINDOW = 300


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
    if (insn & 0xFFE0FFE0) != 0xAA0003E0:
        return None
    rd = insn & 0x1F
    rm = (insn >> 16) & 0x1F
    return (rd, rm)


def decode_ldr_imm(insn):
    if (insn & 0xFFC00000) != 0xF9400000:
        return None
    rt = insn & 0x1F
    rn = (insn >> 5) & 0x1F
    imm12 = (insn >> 10) & 0xFFF
    off = imm12 * 8
    return (rt, rn, off)


def reg_label(r):
    return 'SP' if r == 31 else f"X{r}"

lines = []
lines.append(f"Binary: {path}")
lines.append("")

for addr in blr_hits:
    start = max(text_addr, addr - WINDOW * 4)
    end = addr
    expr = {i: reg_label(i) for i in range(31)}
    last = {i: None for i in range(31)}
    for a in range(start, end, 4):
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
            base_expr = expr.get(rn, reg_label(rn))
            expr[rd] = f"{base_expr}+0x{imm:x}"
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
            base_expr = expr.get(rn, reg_label(rn))
            expr[rt] = f"MEM[{base_expr}+0x{off:x}]"
            last[rt] = a
            continue
    x26_expr = expr.get(26)
    x26_set = last.get(26)
    set_str = f"0x{x26_set:x}" if x26_set is not None else "None"
    lines.append(f"BLR X27 @0x{addr:x}: X26={x26_expr} (set @{set_str})")

out_path = Path(r"C:\temp\MobileSDK\analysis\full_blr_x27_x26_sources.md")
out_path.write_text("\n".join(lines), encoding='utf-8')
print(out_path)
