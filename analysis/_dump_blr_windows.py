import struct
from pathlib import Path

lib_path = Path(r"C:\temp\MobileSDK\analysis\libjnimultiengine.so")
if not lib_path.exists():
    lib_path = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")

data = lib_path.read_bytes()

# ELF64 LE
if data[:4] != b'\x7fELF' or data[4] != 2 or data[5] != 1:
    print('Unsupported ELF')
    raise SystemExit(1)

phoff = struct.unpack('<Q', data[0x20:0x28])[0]
phentsize = struct.unpack('<H', data[0x36:0x38])[0]
phnum = struct.unpack('<H', data[0x38:0x3a])[0]

segs = []
for i in range(phnum):
    off = phoff + i * phentsize
    p_type = struct.unpack('<I', data[off:off+4])[0]
    if p_type != 1:
        continue
    p_flags = struct.unpack('<I', data[off+4:off+8])[0]
    p_offset = struct.unpack('<Q', data[off+0x08:off+0x10])[0]
    p_vaddr = struct.unpack('<Q', data[off+0x10:off+0x18])[0]
    p_filesz = struct.unpack('<Q', data[off+0x20:off+0x28])[0]
    segs.append((p_offset, p_vaddr, p_filesz, p_flags))


def vaddr_to_offset(vaddr):
    for p_offset, p_vaddr, p_filesz, _ in segs:
        if p_vaddr <= vaddr < p_vaddr + p_filesz:
            return p_offset + (vaddr - p_vaddr)
    return None


def decode(insn, pc):
    # Minimal decode for context readability
    if (insn & 0x9f000000) == 0x90000000:
        return "ADRP"
    if (insn & 0x7f000000) == 0x91000000:
        return "ADD"
    if (insn & 0xffc00000) == 0xf9400000:
        return "LDR"
    if (insn & 0xff000000) == 0x58000000:
        return "LDR literal"
    if (insn & 0xfffffc1f) == 0xd63f0000:
        reg = (insn >> 5) & 0x1f
        return f"BLR X{reg}"
    if (insn & 0xfffffc00) == 0xaa000000:
        return "MOV"
    if (insn & 0x7f800000) == 0x52800000:
        return "MOVZ"
    if (insn & 0x7f800000) == 0x72800000:
        return "MOVK"
    if (insn & 0xfc000000) == 0x14000000:
        return "B"
    if (insn & 0xfc000000) == 0x94000000:
        return "BL"
    return "?"


def is_blr(insn):
    return (insn & 0xfffffc1f) == 0xd63f0000


FUNS = [
    ("FUN_02558a08", 0x02558a08, 0x1a4),
    ("FUN_02557a14", 0x02557a14, 0x7c),
    ("FUN_02557a90", 0x02557a90, 0xa98),
    ("FUN_026eaef0", 0x026eaef0, 0x2000),
]

WINDOW = 12  # instructions before/after BLR

lines = []
for name, start, size in FUNS:
    end = start + size
    lines.append(f"{name} 0x{start:x}-0x{end:x}")
    found = False
    for addr in range(start, end, 4):
        off = vaddr_to_offset(addr)
        if off is None or off + 4 > len(data):
            continue
        insn = struct.unpack('<I', data[off:off+4])[0]
        if not is_blr(insn):
            continue
        found = True
        reg = (insn >> 5) & 0x1f
        lines.append(f"  BLR @0x{addr:x} X{reg}")
        for back in range(WINDOW, 0, -1):
            a = addr - back * 4
            if a < start:
                continue
            o = vaddr_to_offset(a)
            if o is None or o + 4 > len(data):
                continue
            ins = struct.unpack('<I', data[o:o+4])[0]
            lines.append(f"    0x{a:x}: {ins:08x} {decode(ins, a)}")
        # current
        lines.append(f"    0x{addr:x}: {insn:08x} {decode(insn, addr)}")
        for fwd in range(1, WINDOW + 1):
            a = addr + fwd * 4
            if a >= end:
                break
            o = vaddr_to_offset(a)
            if o is None or o + 4 > len(data):
                continue
            ins = struct.unpack('<I', data[o:o+4])[0]
            lines.append(f"    0x{a:x}: {ins:08x} {decode(ins, a)}")
    if not found:
        lines.append("  (no BLR found)")
    lines.append("")

Path(r"C:\temp\MobileSDK\analysis\blr_decoder_windows.txt").write_text(
    "\n".join(lines), encoding="ascii", errors="ignore"
)
print(r"C:\temp\MobileSDK\analysis\blr_decoder_windows.txt")
