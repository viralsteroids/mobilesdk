import struct
from pathlib import Path
from elftools.elf.elffile import ELFFile

path = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
candidates = [0x12876d0, 0x12876e8, 0x1287760, 0x1287778, 0x1280f24]

with path.open('rb') as f:
    elf = ELFFile(f)
    text = elf.get_section_by_name('.text')
    if not text:
        raise SystemExit('no .text')
    text_addr = text['sh_addr']
    data = text.data()

WINDOW = 20


def sign_extend(val, bits):
    sign = 1 << (bits - 1)
    return (val & (sign - 1)) - (val & sign)


def decode_bl(insn, pc):
    if (insn & 0xFC000000) != 0x94000000:
        return None
    imm26 = insn & 0x03FFFFFF
    if imm26 & (1 << 25):
        imm26 -= 1 << 26
    return pc + (imm26 << 2)


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
        return ('x', rd, rm)
    if (insn & 0xFFE0FFE0) == 0x2A0003E0:
        rd = insn & 0x1F
        rm = (insn >> 16) & 0x1F
        return ('w', rd, rm)
    return None


def decode_ldr_imm(insn):
    if (insn & 0xFFC00000) == 0xF9400000:
        rt = insn & 0x1F
        rn = (insn >> 5) & 0x1F
        imm12 = (insn >> 10) & 0xFFF
        off = imm12 * 8
        return ('ldr', rt, rn, off)
    if (insn & 0xFFC00000) == 0xB9400000:
        rt = insn & 0x1F
        rn = (insn >> 5) & 0x1F
        imm12 = (insn >> 10) & 0xFFF
        off = imm12 * 4
        return ('ldr_w', rt, rn, off)
    return None


def reg_label(r, kind='x'):
    if kind == 'w':
        return f"W{r}"
    return 'SP' if r == 31 else f"X{r}"


def decode_line(pc, insn):
    bl = decode_bl(insn, pc)
    if bl is not None:
        return f"BL 0x{bl:x}"
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
        kind, rt, rn, off = ldr
        return f"LDR {reg_label(rt)}, [{reg_label(rn)}, 0x{off:x}]"
    if insn == 0xD63F0360:
        return "BLR X27"
    return ""

out_lines = []
out_lines.append(f"Binary: {path}")

for addr in candidates:
    out_lines.append("")
    out_lines.append(f"Callsite 0x{addr:x} (BL -> 0x86236c)")
    for i in range(-WINDOW, WINDOW+1):
        a = addr + i*4
        if a < text_addr or a+4 > text_addr + len(data):
            continue
        off = a - text_addr
        insn = int.from_bytes(data[off:off+4], 'little')
        dec = decode_line(a, insn)
        tag = "<CALL>" if a == addr else ""
        out_lines.append(f"  0x{a:x}: {insn:08x} {dec} {tag}")

out_path = Path(r"C:\temp\MobileSDK\analysis\full_bl_to_86236c_candidate_windows.txt")
out_path.write_text("\n".join(out_lines), encoding='utf-8')
print(out_path)
