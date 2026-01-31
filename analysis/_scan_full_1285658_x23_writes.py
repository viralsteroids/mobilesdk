import struct
from pathlib import Path
from elftools.elf.elffile import ELFFile

path = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
start = 0x1285658
end = 0x12876d0

with path.open('rb') as f:
    elf = ELFFile(f)
    text = elf.get_section_by_name('.text')
    if not text:
        raise SystemExit('no .text')
    text_addr = text['sh_addr']
    data = text.data()

# decoders

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
lines.append(f"Writes to X23 between 0x{start:x} and 0x{end:x}")

for addr in range(start, end, 4):
    if addr < text_addr or addr+4 > text_addr+len(data):
        continue
    insn = int.from_bytes(data[addr-text_addr:addr-text_addr+4], 'little')
    adrp = decode_adrp(insn, addr)
    if adrp and adrp[0] == 23:
        lines.append(f"0x{addr:x}: ADRP X23, 0x{adrp[1]:x}")
        continue
    addi = decode_add_imm(insn)
    if addi and addi[0] == 23:
        lines.append(f"0x{addr:x}: ADD X23, {reg_label(addi[1])}, 0x{addi[2]:x}")
        continue
    movr = decode_mov_reg(insn)
    if movr and movr[0] == 23:
        lines.append(f"0x{addr:x}: MOV X23, {reg_label(movr[1])}")
        continue
    ldr = decode_ldr_imm(insn)
    if ldr and ldr[0] == 23:
        lines.append(f"0x{addr:x}: LDR X23, [{reg_label(ldr[1])}, 0x{ldr[2]:x}]")
        continue

out_path = Path(r"C:\temp\MobileSDK\analysis\full_1285658_x23_writes.md")
out_path.write_text("\n".join(lines), encoding='utf-8')
print(out_path)
