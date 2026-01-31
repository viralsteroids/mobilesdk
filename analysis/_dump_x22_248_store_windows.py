import struct
from pathlib import Path
from elftools.elf.elffile import ELFFile

LIB = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
INP = Path(r"C:\temp\MobileSDK\analysis\x22_248_store_scan.md")
OUT = Path(r"C:\temp\MobileSDK\analysis\x22_248_store_windows.txt")

WINDOW = 0x20

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
    # LDR/STR unsigned imm 64-bit
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
    # BL
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
    # ADRP
    if (word & 0x9F000000) == 0x90000000:
        immlo = (word >> 29) & 0x3
        immhi = (word >> 5) & 0x7FFFF
        rd = word & 0x1F
        imm = sign_extend((immhi << 2) | immlo, 21) << 12
        target = (pc & ~0xFFF) + imm
        return f"adrp {reg_name(rd)}, 0x{target:08x}"
    # ADD imm
    if (word & 0xFFC00000) == 0x91000000:
        imm12 = (word >> 10) & 0xFFF
        shift = (word >> 22) & 0x3
        rn = (word >> 5) & 0x1F
        rd = word & 0x1F
        imm = imm12 << (12 if shift == 1 else 0)
        return f"add {reg_name(rd)}, {reg_name(rn)}, 0x{imm:x}"
    return ""


def parse_hits(text):
    addrs = []
    for line in text.splitlines():
        line = line.strip()
        if line.startswith('- 0x'):
            try:
                addrs.append(int(line.split()[1], 16))
            except Exception:
                continue
    return addrs


text = INP.read_text(encoding='utf-8')
addrs = parse_hits(text)

with LIB.open('rb') as f:
    elf = ELFFile(f)
    lines = ["# STR [x22+0x248] windows", "", f"Library: {LIB}", f"Window: +/- 0x{WINDOW:x}", ""]
    for addr in addrs:
        off = vaddr_to_offset(elf, addr - WINDOW)
        if off is None:
            lines.append(f"## 0x{addr:08x}: ERROR (no PT_LOAD)")
            continue
        f.seek(off)
        data = f.read(WINDOW * 2)
        lines.append(f"## 0x{addr:08x}")
        for i in range(0, len(data), 4):
            pc = (addr - WINDOW) + i
            word = struct.unpack_from('<I', data, i)[0]
            asm = decode(word, pc)
            marker = " <-" if pc == addr else ""
            if asm:
                lines.append(f"0x{pc:08x}: {word:08x}  {asm}{marker}")
            else:
                lines.append(f"0x{pc:08x}: {word:08x}{marker}")
        lines.append("")

OUT.write_text("\n".join(lines), encoding='utf-8')
print(f"Wrote {OUT}")
