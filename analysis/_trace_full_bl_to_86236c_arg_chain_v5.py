from pathlib import Path
from elftools.elf.elffile import ELFFile

path = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
func_start = 0x1285650
callsite = 0x12876d0

with path.open('rb') as f:
    elf = ELFFile(f)
    text = elf.get_section_by_name('.text')
    if not text:
        raise SystemExit('no .text')
    text_addr = text['sh_addr']
    data = text.data()

expr = {i: f"ARG{i}" if i < 8 else f"X{i}" for i in range(31)}
stack = {}
sp_off = 0  # SP_current = SP0 + sp_off


def sign_extend(val, bits):
    sign = 1 << (bits - 1)
    return (val & (sign - 1)) - (val & sign)


def sp_expr(delta=0):
    total = sp_off + delta
    if total == 0:
        return "SP0"
    sign = "+" if total >= 0 else "-"
    return f"SP0{sign}0x{abs(total):x}"


def add_imm_expr(base_expr, imm):
    if base_expr == "SP0" or base_expr.startswith("SP0+") or base_expr.startswith("SP0-"):
        # parse SP0 offset
        off = 0
        if base_expr != "SP0":
            sign = 1 if base_expr[3] == "+" else -1
            off = sign * int(base_expr[5:], 16)
        total = off + imm
        if total == 0:
            return "SP0"
        sign = "+" if total >= 0 else "-"
        return f"SP0{sign}0x{abs(total):x}"
    return f"{base_expr}+0x{imm:x}"


def decode_mov_reg(insn):
    if (insn & 0xFFE0FFE0) == 0xAA0003E0:
        rd = insn & 0x1F
        rm = (insn >> 16) & 0x1F
        return ('x', rd, rm)
    if (insn & 0xFFE0FFE0) == 0x2A0003E0:
        rd = insn & 0x1F
        rm = (insn >> 16) & 0x1F
        return ('w', rd, rm)
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
        return ('ldr', rt, rn, off)
    return None


def decode_str_imm(insn):
    if (insn & 0xFFC00000) == 0xF9000000:
        rt = insn & 0x1F
        rn = (insn >> 5) & 0x1F
        imm12 = (insn >> 10) & 0xFFF
        off = imm12 * 8
        return ('str', rt, rn, off)
    return None


def decode_pair_offset(insn):
    if (insn & 0xFFC00000) in (0xA9000000, 0xA9400000):  # STP/LDP offset
        rt = insn & 0x1F
        rt2 = (insn >> 10) & 0x1F
        rn = (insn >> 5) & 0x1F
        imm7 = (insn >> 15) & 0x7F
        off = sign_extend(imm7, 7) * 8
        return (rt, rt2, rn, off)
    return None


def decode_pair_pre(insn):
    if (insn & 0xFFC00000) == 0xA9800000:  # STP pre-index
        rt = insn & 0x1F
        rt2 = (insn >> 10) & 0x1F
        rn = (insn >> 5) & 0x1F
        imm7 = (insn >> 15) & 0x7F
        off = sign_extend(imm7, 7) * 8
        return (rt, rt2, rn, off)
    return None


def decode_pair_post(insn):
    if (insn & 0xFFC00000) == 0xA8C00000:  # STP post-index
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


def decode_add_sp(insn):
    if (insn & 0x7F8003FF) == 0x910003FF:
        imm12 = (insn >> 10) & 0xFFF
        shift = (insn >> 22) & 0x1
        imm = imm12 << (12 if shift else 0)
        return imm
    return None


def reg_label(r):
    return 'SP' if r == 31 else f"X{r}"

for addr in range(func_start, callsite, 4):
    off = addr - text_addr
    if off < 0 or off+4 > len(data):
        continue
    insn = int.from_bytes(data[off:off+4], 'little')

    sub = decode_sub_sp(insn)
    if sub is not None:
        sp_off -= sub
        continue
    addsp = decode_add_sp(insn)
    if addsp is not None:
        sp_off += addsp
        continue

    mv = decode_mov_reg(insn)
    if mv:
        _, rd, rm = mv
        if rm == 31:
            expr[rd] = sp_expr(0)
        else:
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
        if rn == 31:
            expr[rd] = sp_expr(imm)
        else:
            expr[rd] = add_imm_expr(expr.get(rn, reg_label(rn)), imm)
        continue

    ldr = decode_ldr_imm(insn)
    if ldr:
        _, rt, rn, offb = ldr
        base_expr = sp_expr(0) if rn == 31 else expr.get(rn, reg_label(rn))
        expr[rt] = f"MEM[{base_expr}+0x{offb:x}]"
        continue

    pair = decode_pair_pre(insn)
    if pair:
        rt, rt2, rn, offb = pair
        if rn == 31:
            sp_off += offb
            stack[sp_off + 0] = expr.get(rt, reg_label(rt))
            stack[sp_off + 8] = expr.get(rt2, reg_label(rt2))
        continue

    pair = decode_pair_post(insn)
    if pair:
        rt, rt2, rn, offb = pair
        if rn == 31:
            stack[sp_off + 0] = expr.get(rt, reg_label(rt))
            stack[sp_off + 8] = expr.get(rt2, reg_label(rt2))
            sp_off += offb
        continue

    pair = decode_pair_offset(insn)
    if pair:
        rt, rt2, rn, offb = pair
        if rn == 31:
            stack[sp_off + offb] = expr.get(rt, reg_label(rt))
            stack[sp_off + offb + 8] = expr.get(rt2, reg_label(rt2))
        continue

    st = decode_str_imm(insn)
    if st:
        _, rt, rn, offb = st
        if rn == 31:
            stack[sp_off + offb] = expr.get(rt, reg_label(rt))
        continue

slots = [0x58, 0xd8, 0x100, 0x108, 0x110, 0x120, 0x1a0]
lines = []
lines.append(f"Function window 0x{func_start:x} -> callsite 0x{callsite:x}")
lines.append("Argument mapping (initial): X0=ARG0, X1=ARG1, X2=ARG2 ...")
lines.append(f"SP offset at callsite (relative SP0) = 0x{sp_off:x}")
for s in slots:
    lines.append(f"SP+0x{s:x} (SP0) = {stack.get(s)}")
lines.append(f"X23 at callsite = {expr.get(23)}")
lines.append(f"X19 at callsite = {expr.get(19)}")

for s in sorted(k for k in stack.keys() if 0x40 <= k <= 0x140):
    lines.append(f"stack[0x{s:x}] = {stack[s]}")

out_path = Path(r"C:\temp\MobileSDK\analysis\full_bl_to_86236c_arg_chain_v5.md")
out_path.write_text("\n".join(lines), encoding='utf-8')
print(out_path)
