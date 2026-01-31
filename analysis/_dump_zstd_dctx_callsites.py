import struct
from pathlib import Path

lib_path = Path(r"C:\temp\MobileSDK\analysis\libjnimultiengine.so")
if not lib_path.exists():
    lib_path = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")

data = lib_path.read_bytes()

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
    if (insn & 0xFFC00000) != 0xF9400000:
        return None
    rt = insn & 0x1F
    rn = (insn >> 5) & 0x1F
    imm12 = (insn >> 10) & 0xFFF
    imm = imm12 << 3
    return f"LDR {decode_reg(rt)}, [{decode_reg(rn)}, #0x{imm:x}]"


def decode_ldp(insn):
    if (insn & 0xFFC00000) != 0xA9400000:
        return None
    rt = insn & 0x1F
    rt2 = (insn >> 10) & 0x1F
    rn = (insn >> 5) & 0x1F
    imm7 = (insn >> 15) & 0x7F
    if imm7 & 0x40:
        imm7 -= 0x80
    imm = imm7 << 3
    return f"LDP {decode_reg(rt)}, {decode_reg(rt2)}, [{decode_reg(rn)}, #0x{imm:x}]"


def decode_add_imm(insn):
    if (insn & 0xFF000000) != 0x91000000:
        return None
    rd = insn & 0x1F
    rn = (insn >> 5) & 0x1F
    imm12 = (insn >> 10) & 0xFFF
    shift = (insn >> 22) & 0x3
    imm = imm12 << (12 if shift == 1 else 0)
    return f"ADD {decode_reg(rd)}, {decode_reg(rn)}, #0x{imm:x}"


def decode_mov_reg(insn):
    if (insn & 0x7FE0FFE0) == 0xAA0003E0:
        rd = insn & 0x1F
        rn = (insn >> 5) & 0x1F
        return f"MOV {decode_reg(rd)}, {decode_reg(rn)}"
    return None


def decode_bl(insn, pc):
    if (insn & 0xFC000000) != 0x94000000:
        return None
    imm26 = insn & 0x03FFFFFF
    if imm26 & 0x02000000:
        imm26 -= 0x04000000
    target = pc + imm26 * 4
    return f"BL 0x{target:x}"


def decode_misc(insn):
    if (insn & 0x7F800000) == 0x52800000:
        rd = insn & 0x1F
        imm16 = (insn >> 5) & 0xFFFF
        shift = (insn >> 21) & 0x3
        return f"MOVZ {decode_reg(rd)}, #0x{imm16:x}, LSL {shift*16}"
    if (insn & 0x7F800000) == 0x72800000:
        rd = insn & 0x1F
        imm16 = (insn >> 5) & 0xFFFF
        shift = (insn >> 21) & 0x3
        return f"MOVK {decode_reg(rd)}, #0x{imm16:x}, LSL {shift*16}"
    return None


def decode(insn, pc):
    for fn in (decode_ldr_imm, decode_ldp, decode_add_imm, decode_mov_reg, decode_misc):
        out = fn(insn)
        if out:
            return out
    out = decode_bl(insn, pc)
    if out:
        return out
    return "?"


mapping = Path(r"C:\temp\MobileSDK\zstd_callsite_mapping.txt").read_text(encoding="ascii", errors="ignore").splitlines()
callsites = []
for line in mapping:
    line = line.strip()
    if not line or "ZSTD_decompressDCtx" not in line:
        continue
    # format: 0x11f834c -> ZSTD_decompressDCtx  in UNKNOWN
    try:
        addr = int(line.split()[0], 16)
        callsites.append(addr)
    except Exception:
        continue

# keep a small subset to avoid huge output
callsites = sorted(callsites)[:8]

WINDOW = 10
lines = []
lines.append("# ZSTD_decompressDCtx callsites (decoded windows)")
lines.append("")
for pc in callsites:
    off = vaddr_to_offset(pc)
    if off is None:
        lines.append(f"Callsite @0x{pc:x} -> (vaddr not mapped)")
        continue
    lines.append(f"Callsite @0x{pc:x}")
    for back in range(WINDOW, 0, -1):
        a = pc - back * 4
        o = vaddr_to_offset(a)
        if o is None or o + 4 > len(data):
            continue
        ins = struct.unpack("<I", data[o:o+4])[0]
        lines.append(f"  0x{a:x}: {ins:08x} {decode(ins, a)}")
    insn = struct.unpack("<I", data[off:off+4])[0]
    lines.append(f"  0x{pc:x}: {insn:08x} {decode(insn, pc)}")
    for fwd in range(1, WINDOW + 1):
        a = pc + fwd * 4
        o = vaddr_to_offset(a)
        if o is None or o + 4 > len(data):
            continue
        ins = struct.unpack("<I", data[o:o+4])[0]
        lines.append(f"  0x{a:x}: {ins:08x} {decode(ins, a)}")
    lines.append("")

Path(r"C:\temp\MobileSDK\analysis\zstd_dctx_callsites.md").write_text(
    "\n".join(lines), encoding="ascii", errors="ignore"
)
print(r"C:\temp\MobileSDK\analysis\zstd_dctx_callsites.md")
