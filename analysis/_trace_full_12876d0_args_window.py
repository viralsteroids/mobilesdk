from pathlib import Path
from elftools.elf.elffile import ELFFile

path = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
start = 0x1286000
end = 0x12877f0
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
    if (insn & 0xFFC00000) == 0xA9C00000:  # STP pre-index
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


def decode_movz(insn):
    # MOVZ Xd, imm16, shift (64-bit)
    if (insn & 0x7F800000) == 0xD2800000:
        rd = insn & 0x1F
        imm16 = (insn >> 5) & 0xFFFF
        shift = (insn >> 21) & 0x3
        return (rd, imm16 << (shift * 16))
    return None


def reg_label(r):
    return 'SP' if r == 31 else f"X{r}"

expr = {i: reg_label(i) for i in range(31)}
stack = {}
sp_off = 0

for addr in range(start, callsite, 4):
    off = addr - base
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
        expr[rd] = expr.get(rm, reg_label(rm))
        continue

    mvz = decode_movz(insn)
    if mvz:
        rd, imm = mvz
        expr[rd] = f"0x{imm:x}"
        continue

    adrp = decode_adrp(insn, addr)
    if adrp:
        rd, base_addr = adrp
        expr[rd] = f"0x{base_addr:x}"
        continue

    addi = decode_add_imm(insn)
    if addi:
        rd, rn, imm = addi
        expr[rd] = f"{expr.get(rn, reg_label(rn))}+0x{imm:x}"
        continue

    ldr = decode_ldr_imm(insn)
    if ldr:
        _, rt, rn, offb = ldr
        expr[rt] = f"MEM[{expr.get(rn, reg_label(rn))}+0x{offb:x}]"
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

lines = []
lines.append(f"Window 0x{start:x}..0x{callsite:x}")
lines.append(f"SP offset at callsite (relative SP0) = 0x{sp_off:x}")
for r in [19,20,21,22,23,24,25,26,27]:
    lines.append(f"X{r} = {expr.get(r)}")
lines.append("Stack slots (0x0..0x200):")
for s in sorted(k for k in stack.keys() if 0x0 <= k <= 0x200):
    lines.append(f"  SP+0x{s:x} = {stack[s]}")

out = Path(r"C:\temp\MobileSDK\analysis\full_12876d0_arg_trace.md")
out.write_text("\n".join(lines), encoding='utf-8')
print(out)
