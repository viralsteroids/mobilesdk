import struct
from pathlib import Path
from elftools.elf.elffile import ELFFile

LIB = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
OUT = Path(r"C:\temp\MobileSDK\analysis\jni_create_blr_windows.txt")

CALLSITES = [
    0x01146c48,
    0x011478e4,
    0x01147904,
    0x01147920,
    0x01147940,
    0x01147d20,
    0x01147d54,
    0x01147e88,
    0x01147ec8,
    0x01148190,
    0x011481f8,
    0x011482a8,
]

WINDOW = 0x40

REG_NAMES = [f"x{i}" for i in range(31)] + ["xzr"]


def reg_name(idx, for_base=False):
    if for_base and idx == 31:
        return "sp"
    if idx < len(REG_NAMES):
        return REG_NAMES[idx]
    return f"x{idx}"


def vaddr_to_offset(elf, vaddr):
    for seg in elf.iter_segments():
        if seg['p_type'] != 'PT_LOAD':
            continue
        start = seg['p_vaddr']
        end = start + seg['p_memsz']
        if start <= vaddr < end:
            return seg['p_offset'] + (vaddr - start)
    return None


def sign_extend(value, bits):
    sign = 1 << (bits - 1)
    return (value ^ sign) - sign


def decode(word, pc):
    # BL immediate
    if (word & 0xFC000000) == 0x94000000:
        imm26 = word & 0x03FFFFFF
        if imm26 & (1 << 25):
            imm26 -= 1 << 26
        target = pc + (imm26 << 2)
        return f"bl 0x{target:08x}"
    # BLR
    if (word & 0xFFFFFC1F) == 0xD63F0000:
        rn = (word >> 5) & 0x1F
        return f"blr {reg_name(rn)}"
    # RET
    if word == 0xD65F03C0:
        return "ret"
    # LDR/STR unsigned immediate 64-bit
    if (word & 0xFFC00000) == 0xF9400000:
        imm12 = (word >> 10) & 0xFFF
        rn = (word >> 5) & 0x1F
        rt = word & 0x1F
        return f"ldr {reg_name(rt)}, [{reg_name(rn, True)}+0x{imm12*8:x}]"
    if (word & 0xFFC00000) == 0xF9000000:
        imm12 = (word >> 10) & 0xFFF
        rn = (word >> 5) & 0x1F
        rt = word & 0x1F
        return f"str {reg_name(rt)}, [{reg_name(rn, True)}+0x{imm12*8:x}]"
    # LDP/STP (64-bit, unsigned imm)
    if (word & 0xFFC00000) == 0xA9400000:
        imm7 = (word >> 15) & 0x7F
        rn = (word >> 5) & 0x1F
        rt = word & 0x1F
        rt2 = (word >> 10) & 0x1F
        off = sign_extend(imm7, 7) * 8
        return f"ldp {reg_name(rt)}, {reg_name(rt2)}, [{reg_name(rn, True)}+0x{off:x}]"
    if (word & 0xFFC00000) == 0xA9000000:
        imm7 = (word >> 15) & 0x7F
        rn = (word >> 5) & 0x1F
        rt = word & 0x1F
        rt2 = (word >> 10) & 0x1F
        off = sign_extend(imm7, 7) * 8
        return f"stp {reg_name(rt)}, {reg_name(rt2)}, [{reg_name(rn, True)}+0x{off:x}]"
    # ADD (immediate) 64-bit
    if (word & 0xFFC00000) == 0x91000000:
        imm12 = (word >> 10) & 0xFFF
        shift = (word >> 22) & 0x3
        rn = (word >> 5) & 0x1F
        rd = word & 0x1F
        imm = imm12 << (12 if shift == 1 else 0)
        return f"add {reg_name(rd)}, {reg_name(rn)}, 0x{imm:x}"
    # MOV (ORR alias)
    if (word & 0xFFE0FC00) == 0xAA0003E0:
        rd = word & 0x1F
        rn = (word >> 5) & 0x1F
        rm = (word >> 16) & 0x1F
        if rn == 31:
            return f"mov {reg_name(rd)}, {reg_name(rm)}"
    # ADRP
    if (word & 0x9F000000) == 0x90000000:
        immlo = (word >> 29) & 0x3
        immhi = (word >> 5) & 0x7FFFF
        rd = word & 0x1F
        imm = sign_extend((immhi << 2) | immlo, 21) << 12
        target = (pc & ~0xFFF) + imm
        return f"adrp {reg_name(rd)}, 0x{target:08x}"
    return ""


with LIB.open('rb') as f:
    elf = ELFFile(f)
    lines = ["# BLR callsite windows (TextEngine::Create)", "", f"Library: {LIB}", f"Window: +/- 0x{WINDOW:x}", ""]
    for cs in CALLSITES:
        off = vaddr_to_offset(elf, cs - WINDOW)
        if off is None:
            lines.append(f"## 0x{cs:08x}: ERROR (no PT_LOAD)")
            continue
        f.seek(off)
        data = f.read(WINDOW * 2)
        lines.append(f"## 0x{cs:08x}")
        for i in range(0, len(data), 4):
            pc = (cs - WINDOW) + i
            word = struct.unpack_from('<I', data, i)[0]
            asm = decode(word, pc)
            marker = " <-" if pc == cs else ""
            if asm:
                lines.append(f"0x{pc:08x}: {word:08x}  {asm}{marker}")
            else:
                lines.append(f"0x{pc:08x}: {word:08x}{marker}")
        lines.append("")

OUT.write_text("\n".join(lines), encoding="utf-8")
print(f"Wrote {OUT}")
