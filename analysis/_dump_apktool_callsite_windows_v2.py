import re
from pathlib import Path
from elftools.elf.elffile import ELFFile

calls_path = Path(r"C:\temp\MobileSDK\analysis\apktool_plt_callsites_zstd_archive.md")
so_path = Path(r"C:\temp\MobileSDK\SmartEngines_apktool\lib\arm64-v8a\libjnimultiengine.so")

entries = []
current = None
for line in calls_path.read_text(encoding='utf-8').splitlines():
    m = re.match(r"^([A-Za-z0-9_]+) @ 0x([0-9a-fA-F]+) :: callsites=(\d+)", line.strip())
    if m:
        current = (m.group(1), int(m.group(2), 16))
        continue
    m2 = re.match(r"^\s*- 0x([0-9a-fA-F]+)", line)
    if m2 and current:
        entries.append((current[0], current[1], int(m2.group(1), 16)))

focus = ['ZSTD_createDDict_advanced', 'ZSTD_DCtx_refDDict']

with so_path.open('rb') as f:
    elf = ELFFile(f)
    text = elf.get_section_by_name('.text')
    if not text:
        raise SystemExit('no .text')
    text_addr = text['sh_addr']
    data = text.data()


def sign_extend(val, bits):
    sign = 1 << (bits - 1)
    return (val & (sign - 1)) - (val & sign)


def decode_bl(insn, pc):
    if (insn & 0xFC000000) != 0x94000000:
        return None
    imm26 = insn & 0x03FFFFFF
    if imm26 & (1 << 25):
        imm26 -= 1 << 26
    target = pc + (imm26 << 2)
    return target


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
    if (insn & 0x7F000000) == 0x91000000:
        rd = insn & 0x1F
        rn = (insn >> 5) & 0x1F
        imm12 = (insn >> 10) & 0xFFF
        shift = (insn >> 22) & 0x1
        imm = imm12 << (12 if shift else 0)
        return (rd, rn, imm)
    return None


def decode_mov_reg(insn):
    # MOV Xd, Xm (ORR Xd, XZR, Xm)
    if (insn & 0xFFE0FC00) == 0xAA0003E0:
        rd = insn & 0x1F
        rm = (insn >> 16) & 0x1F
        return ('x', rd, rm)
    # MOV Wd, Wm (ORR Wd, WZR, Wm)
    if (insn & 0xFFE0FC00) == 0x2A0003E0:
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


def decode_ldp(insn):
    if (insn & 0xFFC00000) == 0xA9400000:
        rt = insn & 0x1F
        rt2 = (insn >> 10) & 0x1F
        rn = (insn >> 5) & 0x1F
        imm7 = (insn >> 15) & 0x7F
        off = imm7 * 8
        return (rt, rt2, rn, off)
    return None


def reg_name(r, kind='x'):
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
        return f"ADRP {reg_name(rd)}, 0x{base:x}"
    addi = decode_add_imm(insn)
    if addi:
        rd, rn, imm = addi
        return f"ADD {reg_name(rd)}, {reg_name(rn)}, 0x{imm:x}"
    movr = decode_mov_reg(insn)
    if movr:
        kind, rd, rm = movr
        return f"MOV {reg_name(rd, kind)}, {reg_name(rm, kind)}"
    ldr = decode_ldr_imm(insn)
    if ldr:
        kind, rt, rn, off = ldr
        return f"LDR {reg_name(rt)}, [{reg_name(rn)}, 0x{off:x}]"
    ldp = decode_ldp(insn)
    if ldp:
        rt, rt2, rn, off = ldp
        return f"LDP {reg_name(rt)}, {reg_name(rt2)}, [{reg_name(rn)}, 0x{off:x}]"
    return ""

lines = []
lines.append(f"Binary: {so_path}")
lines.append("")

WINDOW = 16

for target in focus:
    calls = [c for t, _, c in entries if t == target]
    if not calls:
        continue
    lines.append(f"{target} callsites={len(calls)}")
    for caddr in calls:
        lines.append(f"  Callsite 0x{caddr:x}")
        for i in range(-WINDOW, WINDOW+1):
            addr = caddr + i*4
            if addr < text_addr or addr+4 > text_addr+len(data):
                continue
            off = addr - text_addr
            insn = int.from_bytes(data[off:off+4], 'little')
            dec = decode_line(addr, insn)
            tag = "<CALL>" if addr == caddr else ""
            lines.append(f"    0x{addr:x}: {insn:08x} {dec} {tag}")
        lines.append("")

out_path = Path(r"C:\temp\MobileSDK\analysis\apktool_zstd_dict_callsite_windows_v2.txt")
out_path.write_text("\n".join(lines), encoding='utf-8')
print(out_path)
