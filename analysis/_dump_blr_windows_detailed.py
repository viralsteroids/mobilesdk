import struct
from pathlib import Path

lib_path = Path(r"C:\temp\MobileSDK\analysis\libjnimultiengine.so")
if not lib_path.exists():
    lib_path = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")

data = lib_path.read_bytes()

# ELF64 LE
if data[:4] != b"\x7fELF" or data[4] != 2 or data[5] != 1:
    print("Unsupported ELF")
    raise SystemExit(1)

phoff = struct.unpack("<Q", data[0x20:0x28])[0]
phentsize = struct.unpack("<H", data[0x36:0x38])[0]
phnum = struct.unpack("<H", data[0x38:0x3A])[0]

segs = []
for i in range(phnum):
    off = phoff + i * phentsize
    p_type = struct.unpack("<I", data[off : off + 4])[0]
    if p_type != 1:
        continue
    p_flags = struct.unpack("<I", data[off + 4 : off + 8])[0]
    p_offset = struct.unpack("<Q", data[off + 0x08 : off + 0x10])[0]
    p_vaddr = struct.unpack("<Q", data[off + 0x10 : off + 0x18])[0]
    p_filesz = struct.unpack("<Q", data[off + 0x20 : off + 0x28])[0]
    segs.append((p_offset, p_vaddr, p_filesz, p_flags))


def vaddr_to_offset(vaddr):
    for p_offset, p_vaddr, p_filesz, _ in segs:
        if p_vaddr <= vaddr < p_vaddr + p_filesz:
            return p_offset + (vaddr - p_vaddr)
    return None


def decode_reg(r):
    return f"X{r}"


def decode_ldr_imm(insn):
    # LDR Xt, [Xn, #imm] 64-bit
    if (insn & 0xffc00000) != 0xf9400000:
        return None
    rt = insn & 0x1F
    rn = (insn >> 5) & 0x1F
    imm12 = (insn >> 10) & 0xFFF
    imm = imm12 << 3
    return f"LDR {decode_reg(rt)}, [{decode_reg(rn)}, #0x{imm:x}]"


def decode_ldp(insn):
    # LDP Xt1, Xt2, [Xn, #imm]
    if (insn & 0xffc00000) != 0xa9400000:
        return None
    rt = insn & 0x1F
    rt2 = (insn >> 10) & 0x1F
    rn = (insn >> 5) & 0x1F
    imm7 = (insn >> 15) & 0x7F
    # sign-extend imm7
    if imm7 & 0x40:
        imm7 -= 0x80
    imm = imm7 << 3
    return f"LDP {decode_reg(rt)}, {decode_reg(rt2)}, [{decode_reg(rn)}, #0x{imm:x}]"


def decode_add_imm(insn):
    # ADD Xd, Xn, #imm (64-bit)
    if (insn & 0xFF000000) != 0x91000000:
        return None
    rd = insn & 0x1F
    rn = (insn >> 5) & 0x1F
    imm12 = (insn >> 10) & 0xFFF
    shift = (insn >> 22) & 0x3
    imm = imm12 << (12 if shift == 1 else 0)
    return f"ADD {decode_reg(rd)}, {decode_reg(rn)}, #0x{imm:x}"


def decode_mov_reg(insn):
    # MOV Xd, Xn (alias for ORR)
    if (insn & 0x7fe0ffe0) == 0xaa0003e0:
        rd = insn & 0x1F
        rn = (insn >> 5) & 0x1F
        return f"MOV {decode_reg(rd)}, {decode_reg(rn)}"
    return None


def decode_bl(insn, pc):
    if (insn & 0xfc000000) != 0x94000000:
        return None
    imm26 = insn & 0x03ffffff
    if imm26 & 0x02000000:
        imm26 -= 0x04000000
    target = pc + imm26 * 4
    return f"BL 0x{target:x}"


def decode_blr(insn):
    if (insn & 0xfffffc1f) != 0xd63f0000:
        return None
    reg = (insn >> 5) & 0x1F
    return f"BLR {decode_reg(reg)}"


def decode_misc(insn):
    # MOVZ/MOVK
    if (insn & 0x7f800000) == 0x52800000:
        rd = insn & 0x1F
        imm16 = (insn >> 5) & 0xFFFF
        shift = (insn >> 21) & 0x3
        return f"MOVZ {decode_reg(rd)}, #0x{imm16:x}, LSL {shift*16}"
    if (insn & 0x7f800000) == 0x72800000:
        rd = insn & 0x1F
        imm16 = (insn >> 5) & 0xFFFF
        shift = (insn >> 21) & 0x3
        return f"MOVK {decode_reg(rd)}, #0x{imm16:x}, LSL {shift*16}"
    return None


def decode(insn, pc):
    for fn in (decode_ldr_imm, decode_ldp, decode_add_imm, decode_mov_reg, decode_bl, decode_blr, decode_misc):
        out = fn(insn, pc) if fn is decode_bl else fn(insn)
        if out:
            return out
    return "?"


def is_blr(insn):
    return (insn & 0xfffffc1f) == 0xd63f0000


FUNS = [
    ("FUN_02558a08", 0x02558a08, 0x1a4),
    ("FUN_02557a14", 0x02557a14, 0x7c),
    ("FUN_02557a90", 0x02557a90, 0xa98),
    ("FUN_026eaef0", 0x026eaef0, 0x2000),
]

WINDOW = 10

lines = []
for name, start, size in FUNS:
    end = start + size
    lines.append(f"{name} 0x{start:x}-0x{end:x}")
    found = False
    for addr in range(start, end, 4):
        off = vaddr_to_offset(addr)
        if off is None or off + 4 > len(data):
            continue
        insn = struct.unpack("<I", data[off:off+4])[0]
        if not is_blr(insn):
            continue
        found = True
        lines.append(f"  BLR @0x{addr:x}")
        for back in range(WINDOW, 0, -1):
            a = addr - back * 4
            if a < start:
                continue
            o = vaddr_to_offset(a)
            if o is None or o + 4 > len(data):
                continue
            ins = struct.unpack("<I", data[o:o+4])[0]
            lines.append(f"    0x{a:x}: {ins:08x} {decode(ins, a)}")
        lines.append(f"    0x{addr:x}: {insn:08x} {decode(insn, addr)}")
        for fwd in range(1, WINDOW + 1):
            a = addr + fwd * 4
            if a >= end:
                break
            o = vaddr_to_offset(a)
            if o is None or o + 4 > len(data):
                continue
            ins = struct.unpack("<I", data[o:o+4])[0]
            lines.append(f"    0x{a:x}: {ins:08x} {decode(ins, a)}")
    if not found:
        lines.append("  (no BLR found)")
    lines.append("")

Path(r"C:\temp\MobileSDK\analysis\blr_decoder_windows_detailed.txt").write_text(
    "\n".join(lines), encoding="ascii", errors="ignore"
)
print(r"C:\temp\MobileSDK\analysis\blr_decoder_windows_detailed.txt")
