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


def reg_label(r):
    return "SP" if r == 31 else f"X{r}"


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
    if (insn & 0xFFE0FC00) == 0xAA0003E0:
        rd = insn & 0x1F
        rm = (insn >> 16) & 0x1F
        return (rd, rm)
    return None


def decode_movz_movk(insn):
    if (insn & 0x7F800000) == 0xD2800000:
        rd = insn & 0x1F
        imm16 = (insn >> 5) & 0xFFFF
        shift = (insn >> 21) & 0x3
        return ('movz', rd, imm16 << (shift * 16), 0xFFFF << (shift * 16))
    if (insn & 0x7F800000) == 0xF2800000:
        rd = insn & 0x1F
        imm16 = (insn >> 5) & 0xFFFF
        shift = (insn >> 21) & 0x3
        return ('movk', rd, imm16 << (shift * 16), 0xFFFF << (shift * 16))
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


def decode_ldr_lit(insn, pc):
    if (insn & 0xFF000000) == 0x58000000:
        rt = insn & 0x1F
        imm19 = (insn >> 5) & 0x7FFFF
        off = sign_extend(imm19, 19) << 2
        addr = pc + off
        return (rt, addr)
    return None


def analyze_callsite(call_addr, window=300):
    start = call_addr - window * 4
    if start < text_addr:
        start = text_addr
    end = call_addr

    expr = {i: reg_label(i) for i in range(31)}
    imm = {i: None for i in range(31)}
    imm_mask = {i: 0 for i in range(31)}
    last_set = {i: None for i in range(31)}

    for addr in range(start, end, 4):
        off = addr - text_addr
        insn = int.from_bytes(data[off:off+4], 'little')

        adrp = decode_adrp(insn, addr)
        if adrp:
            rd, base = adrp
            expr[rd] = f"0x{base:x}"
            imm[rd] = base
            imm_mask[rd] = 0xFFFFFFFFFFFFFFFF
            last_set[rd] = addr
            continue

        addi = decode_add_imm(insn)
        if addi:
            rd, rn, immv = addi
            base_expr = expr.get(rn, reg_label(rn))
            expr[rd] = f"{base_expr}+0x{immv:x}"
            if imm[rn] is not None:
                imm[rd] = imm[rn] + immv
                imm_mask[rd] = 0xFFFFFFFFFFFFFFFF
            else:
                imm[rd] = None
                imm_mask[rd] = 0
            last_set[rd] = addr
            continue

        movr = decode_mov_reg(insn)
        if movr:
            rd, rm = movr
            expr[rd] = expr.get(rm, reg_label(rm))
            imm[rd] = imm.get(rm)
            imm_mask[rd] = imm_mask.get(rm, 0)
            last_set[rd] = addr
            continue

        movi = decode_movz_movk(insn)
        if movi:
            kind, rd, val, mask = movi
            if kind == 'movz':
                imm[rd] = val
                imm_mask[rd] = mask
            else:
                cur = imm.get(rd) or 0
                cur_mask = imm_mask.get(rd, 0)
                cur = (cur & ~mask) | (val & mask)
                cur_mask |= mask
                imm[rd] = cur
                imm_mask[rd] = cur_mask
            expr[rd] = f"0x{imm[rd]:x}"
            last_set[rd] = addr
            continue

        ldr = decode_ldr_imm(insn)
        if ldr:
            kind, rt, rn, off = ldr
            base_expr = expr.get(rn, reg_label(rn))
            expr[rt] = f"MEM[{base_expr}+0x{off:x}]"
            imm[rt] = None
            imm_mask[rt] = 0
            last_set[rt] = addr
            continue

        ldp = decode_ldp(insn)
        if ldp:
            rt, rt2, rn, off = ldp
            base_expr = expr.get(rn, reg_label(rn))
            expr[rt] = f"MEM[{base_expr}+0x{off:x}]"
            expr[rt2] = f"MEM[{base_expr}+0x{off+8:x}]"
            imm[rt] = imm[rt2] = None
            imm_mask[rt] = imm_mask[rt2] = 0
            last_set[rt] = last_set[rt2] = addr
            continue

        ldrl = decode_ldr_lit(insn, addr)
        if ldrl:
            rt, target = ldrl
            expr[rt] = f"MEM[0x{target:x}]"
            imm[rt] = None
            imm_mask[rt] = 0
            last_set[rt] = addr
            continue

    reg_info = {}
    for r in range(5):
        reg_info[r] = (expr[r], last_set[r])
    return reg_info

lines = []
lines.append(f"Binary: {so_path}")
lines.append("")

for target in focus:
    calls = [c for t, _, c in entries if t == target]
    if not calls:
        continue
    lines.append(f"{target} callsites={len(calls)}")
    for caddr in calls:
        info = analyze_callsite(caddr)
        parts = []
        for r in range(5):
            expr, last = info[r]
            if last is not None:
                parts.append(f"X{r}={expr} (set @0x{last:x})")
        if not parts:
            parts = ['(no X0-X4 assignments in window)']
        lines.append(f"  - 0x{caddr:x}: " + "; ".join(parts))
    lines.append("")

out_path = Path(r"C:\temp\MobileSDK\analysis\apktool_zstd_dict_callsite_arg_scan_v3.md")
out_path.write_text("\n".join(lines), encoding='utf-8')
print(out_path)
