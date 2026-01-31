import struct
from pathlib import Path
from elftools.elf.elffile import ELFFile

path = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")

with path.open('rb') as f:
    elf = ELFFile(f)
    text = elf.get_section_by_name('.text')
    if not text:
        raise SystemExit('no .text')
    text_addr = text['sh_addr']
    data = text.data()

blr_hits = [0x863990, 0x863e24, 0x863ffc]

mov_x29_sp = 0x910003FD

# find all mov x29, sp
prologues = []
for off in range(0, len(data), 4):
    insn = int.from_bytes(data[off:off+4], 'little')
    if insn == mov_x29_sp:
        prologues.append(text_addr + off - 4)  # likely stp x29,x30 before

prologues.sort()


def find_prologue(addr):
    # nearest prologue <= addr
    import bisect
    idx = bisect.bisect_right(prologues, addr) - 1
    if idx < 0:
        return None
    return prologues[idx]


def reg_label(r):
    return 'SP' if r == 31 else f"X{r}"


def decode_mov_reg(insn):
    if (insn & 0xFFE0FFE0) == 0xAA0003E0:
        rd = insn & 0x1F
        rm = (insn >> 16) & 0x1F
        return (rd, rm)
    return None


def decode_ldp(insn):
    # LDP Xt, Xt2, [Xn, #imm7*8]
    if (insn & 0xFFC00000) == 0xA9400000:
        rt = insn & 0x1F
        rt2 = (insn >> 10) & 0x1F
        rn = (insn >> 5) & 0x1F
        imm7 = (insn >> 15) & 0x7F
        off = imm7 * 8
        return (rt, rt2, rn, off)
    return None


def decode_stp(insn):
    # STP Xt, Xt2, [Xn, #imm7*8]!
    if (insn & 0xFFC00000) == 0xA9000000:
        rt = insn & 0x1F
        rt2 = (insn >> 10) & 0x1F
        rn = (insn >> 5) & 0x1F
        imm7 = (insn >> 15) & 0x7F
        off = imm7 * 8
        return (rt, rt2, rn, off)
    return None

lines = []
lines.append(f"Binary: {path}")
lines.append("")

for addr in blr_hits:
    start = find_prologue(addr)
    lines.append(f"BLR X27 @0x{addr:x}: function_start~=0x{start:x}" if start else f"BLR X27 @0x{addr:x}: function_start~=None")
    if not start:
        lines.append("")
        continue
    # dump first 40 instructions for X19 init clues
    for i in range(0, 40):
        a = start + i*4
        if a < text_addr or a+4 > text_addr+len(data):
            break
        insn = int.from_bytes(data[a-text_addr:a-text_addr+4], 'little')
        dec = []
        mv = decode_mov_reg(insn)
        if mv:
            dec.append(f"MOV {reg_label(mv[0])}, {reg_label(mv[1])}")
        ldp = decode_ldp(insn)
        if ldp:
            dec.append(f"LDP {reg_label(ldp[0])}, {reg_label(ldp[1])}, [{reg_label(ldp[2])}, 0x{ldp[3]:x}]")
        stp = decode_stp(insn)
        if stp:
            dec.append(f"STP {reg_label(stp[0])}, {reg_label(stp[1])}, [{reg_label(stp[2])}, 0x{stp[3]:x}]")
        if dec:
            lines.append(f"  0x{a:x}: {insn:08x} {'; '.join(dec)}")
    lines.append("")

out_path = Path(r"C:\temp\MobileSDK\analysis\full_blr_x27_prologue_scan.md")
out_path.write_text("\n".join(lines), encoding='utf-8')
print(out_path)
