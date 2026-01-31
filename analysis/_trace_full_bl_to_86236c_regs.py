import struct
from pathlib import Path
from elftools.elf.elffile import ELFFile

path = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
func_start = 0x1285658
callsite = 0x12876d0

with path.open('rb') as f:
    elf = ELFFile(f)
    text = elf.get_section_by_name('.text')
    if not text:
        raise SystemExit('no .text')
    text_addr = text['sh_addr']
    data = text.data()

# decode a small subset

def sign_extend(val, bits):
    sign = 1 << (bits - 1)
    return (val & (sign - 1)) - (val & sign)


def decode_mov_reg(insn):
    if (insn & 0xFFE0FFE0) == 0xAA0003E0:
        rd = insn & 0x1F
        rm = (insn >> 16) & 0x1F
        return (rd, rm)
    return None


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


def decode_ldr_imm(insn):
    if (insn & 0xFFC00000) == 0xF9400000:
        rt = insn & 0x1F
        rn = (insn >> 5) & 0x1F
        imm12 = (insn >> 10) & 0xFFF
        off = imm12 * 8
        return (rt, rn, off)
    return None


def decode_str_imm(insn):
    if (insn & 0xFFC00000) == 0xF9000000:
        rt = insn & 0x1F
        rn = (insn >> 5) & 0x1F
        imm12 = (insn >> 10) & 0xFFF
        off = imm12 * 8
        return (rt, rn, off)
    return None


def decode_stp(insn):
    if (insn & 0xFFC00000) == 0xA9000000:
        rt = insn & 0x1F
        rt2 = (insn >> 10) & 0x1F
        rn = (insn >> 5) & 0x1F
        imm7 = (insn >> 15) & 0x7F
        off = imm7 * 8
        return (rt, rt2, rn, off)
    return None


def reg_label(r):
    return 'SP' if r == 31 else f"X{r}"

expr = {i: reg_label(i) for i in range(31)}
stack = {}

for addr in range(func_start, callsite, 4):
    off = addr - text_addr
    insn = int.from_bytes(data[off:off+4], 'little')
    mv = decode_mov_reg(insn)
    if mv:
        rd, rm = mv
        expr[rd] = expr.get(rm, reg_label(rm))
        continue
    adrp = decode_adrp(insn, addr)
    if adrp:
        rd, base = adrp
        expr[rd] = f"0x{base:x}"
        continue
    addi = decode_add_imm(insn)
    if addi:
        rd, rn, imm = addi
        expr[rd] = f"{expr.get(rn, reg_label(rn))}+0x{imm:x}"
        continue
    ldr = decode_ldr_imm(insn)
    if ldr:
        rt, rn, offb = ldr
        expr[rt] = f"MEM[{expr.get(rn, reg_label(rn))}+0x{offb:x}]"
        continue
    stp = decode_stp(insn)
    if stp:
        rt, rt2, rn, offb = stp
        if rn == 31:
            stack[offb] = expr.get(rt, reg_label(rt))
            stack[offb+8] = expr.get(rt2, reg_label(rt2))
        continue
    st = decode_str_imm(insn)
    if st:
        rt, rn, offb = st
        if rn == 31:
            stack[offb] = expr.get(rt, reg_label(rt))
        continue

# report some registers
regs = [19,20,21,22,23,24,25,26,27]
lines = []
lines.append(f"Function 0x{func_start:x} -> callsite 0x{callsite:x}")
for r in regs:
    lines.append(f"X{r} = {expr.get(r)}")
lines.append(f"SP+0x58 = {stack.get(0x58)}")

out_path = Path(r"C:\temp\MobileSDK\analysis\full_bl_to_86236c_reg_snapshot.md")
out_path.write_text("\n".join(lines), encoding='utf-8')
print(out_path)
