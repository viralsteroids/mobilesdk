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

focus = ['ZSTD_createDDict_advanced']

with so_path.open('rb') as f:
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
    return "SP" if r == 31 else f"X{r}"


def decode_line(pc, insn):
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
        rd, rm = movr
        return f"MOV {reg_label(rd)}, {reg_label(rm)}"
    ldr = decode_ldr_imm(insn)
    if ldr:
        rt, rn, off = ldr
        return f"LDR {reg_label(rt)}, [{reg_label(rn)}, 0x{off:x}]"
    return ""


def find_last_sets(call_addr, window=500):
    start = max(text_addr, call_addr - window * 4)
    end = call_addr
    expr = {i: reg_label(i) for i in range(31)}
    last = {i: None for i in range(31)}
    for addr in range(start, end, 4):
        off = addr - text_addr
        insn = int.from_bytes(data[off:off+4], 'little')
        adrp = decode_adrp(insn, addr)
        if adrp:
            rd, base = adrp
            expr[rd] = f"0x{base:x}"
            last[rd] = addr
            continue
        addi = decode_add_imm(insn)
        if addi:
            rd, rn, imm = addi
            expr[rd] = f"{expr.get(rn, reg_label(rn))}+0x{imm:x}"
            last[rd] = addr
            continue
        movr = decode_mov_reg(insn)
        if movr:
            rd, rm = movr
            expr[rd] = expr.get(rm, reg_label(rm))
            last[rd] = addr
            continue
        ldr = decode_ldr_imm(insn)
        if ldr:
            rt, rn, off = ldr
            expr[rt] = f"MEM[{expr.get(rn, reg_label(rn))}+0x{off:x}]"
            last[rt] = addr
            continue
    return expr, last

lines = []
lines.append(f"Binary: {so_path}")
lines.append("")

for target in focus:
    calls = [c for t, _, c in entries if t == target]
    if not calls:
        continue
    lines.append(f"{target} callsites={len(calls)}")
    for caddr in calls:
        expr, last = find_last_sets(caddr)
        x25 = last.get(25)
        x26 = last.get(26)
        x25_str = f"0x{x25:x}" if x25 is not None else "None"
        x26_str = f"0x{x26:x}" if x26 is not None else "None"
        lines.append(f"  - 0x{caddr:x}: X25={expr.get(25)} (set @{x25_str}); X26={expr.get(26)} (set @{x26_str})")
        for reg, addr in [('X25', x25), ('X26', x26)]:
            if addr is None:
                continue
            lines.append(f"    {reg} set window around 0x{addr:x}:")
            for i in range(-6, 7):
                a = addr + i*4
                off = a - text_addr
                if off < 0 or off+4 > len(data):
                    continue
                insn = int.from_bytes(data[off:off+4], 'little')
                dec = decode_line(a, insn)
                lines.append(f"      0x{a:x}: {insn:08x} {dec}")
    lines.append("")

out_path = Path(r"C:\temp\MobileSDK\analysis\apktool_zstd_dict_x25x26_sources.txt")
out_path.write_text("\n".join(lines), encoding='utf-8')
print(out_path)
