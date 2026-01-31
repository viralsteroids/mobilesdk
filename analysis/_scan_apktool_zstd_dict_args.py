import re
from pathlib import Path
from elftools.elf.elffile import ELFFile

calls_path = Path(r"C:\temp\MobileSDK\analysis\apktool_plt_callsites_zstd_archive.md")
so_path = Path(r"C:\temp\MobileSDK\SmartEngines_apktool\lib\arm64-v8a\libjnimultiengine.so")

# Parse callsite report
entries = []  # (target_name, target_addr, callsite_addr)
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
    text_data = text.data()


def sign_extend(val, bits):
    sign = 1 << (bits - 1)
    return (val & (sign - 1)) - (val & sign)


def reg_name(reg, is_w=False):
    return ("W" if is_w else "X") + str(reg)


def decode_adrp(insn, pc):
    if (insn & 0x9F000000) != 0x90000000:
        return None
    immlo = (insn >> 29) & 0x3
    immhi = (insn >> 5) & 0x7FFFF
    imm = (immhi << 2) | immlo
    imm = sign_extend(imm, 21)  # 21 bits
    rd = insn & 0x1F
    base = (pc & ~0xFFF) + (imm << 12)
    return (rd, base)


def decode_add_imm(insn):
    if (insn & 0x7F000000) not in (0x91000000, 0xB1000000):
        return None
    rd = insn & 0x1F
    rn = (insn >> 5) & 0x1F
    imm12 = (insn >> 10) & 0xFFF
    shift = (insn >> 22) & 0x1
    imm = imm12 << (12 if shift else 0)
    return (rd, rn, imm)


def decode_movz_movk(insn):
    # 64-bit
    if (insn & 0x7F800000) == 0xD2800000:  # MOVZ X
        rd = insn & 0x1F
        imm16 = (insn >> 5) & 0xFFFF
        shift = (insn >> 21) & 0x3
        return ('movz', rd, imm16 << (shift * 16), 0xFFFF << (shift * 16), False)
    if (insn & 0x7F800000) == 0xF2800000:  # MOVK X
        rd = insn & 0x1F
        imm16 = (insn >> 5) & 0xFFFF
        shift = (insn >> 21) & 0x3
        return ('movk', rd, imm16 << (shift * 16), 0xFFFF << (shift * 16), False)
    # 32-bit
    if (insn & 0x7F800000) == 0x52800000:  # MOVZ W
        rd = insn & 0x1F
        imm16 = (insn >> 5) & 0xFFFF
        shift = (insn >> 21) & 0x3
        return ('movz', rd, imm16 << (shift * 16), 0xFFFF << (shift * 16), True)
    if (insn & 0x7F800000) == 0x72800000:  # MOVK W
        rd = insn & 0x1F
        imm16 = (insn >> 5) & 0xFFFF
        shift = (insn >> 21) & 0x3
        return ('movk', rd, imm16 << (shift * 16), 0xFFFF << (shift * 16), True)
    return None


def analyze_callsite(call_addr, window=32):
    # window in instructions
    start = call_addr - window * 4
    if start < text_addr:
        start = text_addr
    end = call_addr  # exclude BL itself
    # track registers
    reg_addr = {}
    reg_imm = {}
    reg_imm_mask = {}

    for addr in range(start, end, 4):
        off = addr - text_addr
        insn = int.from_bytes(text_data[off:off+4], 'little')

        adrp = decode_adrp(insn, addr)
        if adrp:
            rd, base = adrp
            reg_addr[rd] = base
            continue

        addi = decode_add_imm(insn)
        if addi:
            rd, rn, imm = addi
            if rn in reg_addr:
                reg_addr[rd] = reg_addr[rn] + imm
            continue

        mov = decode_movz_movk(insn)
        if mov:
            kind, rd, val, mask, is_w = mov
            key = (rd, is_w)
            if kind == 'movz':
                reg_imm[key] = val
                reg_imm_mask[key] = mask
            else:
                cur = reg_imm.get(key, 0)
                cur_mask = reg_imm_mask.get(key, 0)
                # apply mask
                cur = (cur & ~mask) | (val & mask)
                cur_mask |= mask
                reg_imm[key] = cur
                reg_imm_mask[key] = cur_mask
            continue

    # Build report for X0/X1/W1
    report = []
    if 0 in reg_addr:
        report.append(f"X0=0x{reg_addr[0]:x}")
    if 1 in reg_addr:
        report.append(f"X1=0x{reg_addr[1]:x}")
    if (1, True) in reg_imm:
        report.append(f"W1=0x{reg_imm[(1, True)]:x}")
    if (1, False) in reg_imm:
        report.append(f"X1=0x{reg_imm[(1, False)]:x}")
    if (0, False) in reg_imm:
        report.append(f"X0=0x{reg_imm[(0, False)]:x}")
    return report

lines = []
lines.append(f"Binary: {so_path}")
lines.append("")

for target in focus:
    calls = [c for t, _, c in entries if t == target]
    if not calls:
        continue
    lines.append(f"{target} callsites={len(calls)}")
    for caddr in calls:
        rep = analyze_callsite(caddr)
        rep_str = '; '.join(rep) if rep else '(no X0/X1 immediate/ADRP addr found)'
        lines.append(f"  - 0x{caddr:x}: {rep_str}")
    lines.append("")

out_path = Path(r"C:\temp\MobileSDK\analysis\apktool_zstd_dict_callsite_arg_scan.md")
out_path.write_text("\n".join(lines), encoding='utf-8')
print(out_path)
