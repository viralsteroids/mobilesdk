import struct
from pathlib import Path
from elftools.elf.elffile import ELFFile

path = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
center = 0x1285658
WINDOW = 80  # instructions before

with path.open('rb') as f:
    elf = ELFFile(f)
    text = elf.get_section_by_name('.text')
    if not text:
        raise SystemExit('no .text')
    text_addr = text['sh_addr']
    data = text.data()

# minimal decoders

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


def decode_sub_sp(insn):
    # SUB SP, SP, #imm
    if (insn & 0x7F8003FF) == 0xD10003FF:
        imm12 = (insn >> 10) & 0xFFF
        shift = (insn >> 22) & 0x1
        imm = imm12 << (12 if shift else 0)
        return imm
    return None


def decode_ldr_imm(insn):
    if (insn & 0xFFC00000) == 0xF9400000:
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


def reg_label(r, kind='x'):
    if kind == 'w':
        return f"W{r}"
    return 'SP' if r == 31 else f"X{r}"


def decode_line(pc, insn):
    sub = decode_sub_sp(insn)
    if sub is not None:
        return f"SUB SP, SP, 0x{sub:x}"
    adrp = decode_adrp(insn, pc)
    if adrp:
        rd, base = adrp
        return f"ADRP {reg_label(rd)}, 0x{base:x}"
    addi = decode_add_imm(insn)
    if addi:
        rd, rn, imm = addi
        return f"ADD {reg_label(rd)}, {reg_label(rn)}, 0x{imm:x}"
    movr = decode_mov_reg(insn)
    if movr:
        kind, rd, rm = movr
        return f"MOV {reg_label(rd, kind)}, {reg_label(rm, kind)}"
    ldr = decode_ldr_imm(insn)
    if ldr:
        rt, rn, off = ldr
        return f"LDR {reg_label(rt)}, [{reg_label(rn)}, 0x{off:x}]"
    stp = decode_stp(insn)
    if stp:
        rt, rt2, rn, off = stp
        return f"STP {reg_label(rt)}, {reg_label(rt2)}, [{reg_label(rn)}, 0x{off:x}]"
    return ""

lines = []
lines.append(f"Window before 0x{center:x}")

start = center - WINDOW*4
for addr in range(start, center+4, 4):
    if addr < text_addr or addr+4 > text_addr+len(data):
        continue
    insn = int.from_bytes(data[addr-text_addr:addr-text_addr+4], 'little')
    dec = decode_line(addr, insn)
    if dec:
        tag = '<CENTER>' if addr == center else ''
        lines.append(f"0x{addr:x}: {insn:08x} {dec} {tag}")

out_path = Path(r"C:\temp\MobileSDK\analysis\full_1285658_pre_context.txt")
out_path.write_text("\n".join(lines), encoding='utf-8')
print(out_path)
