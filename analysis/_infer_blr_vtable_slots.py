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


def decode_ldr_imm(insn):
    # LDR Xt, [Xn, #imm] 64-bit
    if (insn & 0xFFC00000) != 0xF9400000:
        return None
    rt = insn & 0x1F
    rn = (insn >> 5) & 0x1F
    imm12 = (insn >> 10) & 0xFFF
    imm = imm12 << 3
    return rt, rn, imm


def is_blr(insn):
    return (insn & 0xFFFFFC1F) == 0xD63F0000


FUNS = [
    ("FUN_02557a90", 0x02557a90, 0x0A98),
    ("FUN_026eaef0", 0x026eaef0, 0x2000),
]

WINDOW = 12

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
        reg = (insn >> 5) & 0x1F
        # backtrack for two LDRs into reg
        chain = []
        for back in range(1, WINDOW + 1):
            a = addr - back * 4
            if a < start:
                break
            o = vaddr_to_offset(a)
            if o is None or o + 4 > len(data):
                continue
            ins = struct.unpack("<I", data[o:o+4])[0]
            ldr = decode_ldr_imm(ins)
            if ldr and ldr[0] == reg:
                chain.append((a, ldr[1], ldr[2]))
                if len(chain) >= 2:
                    break
        lines.append(f"  BLR @0x{addr:x} X{reg}")
        if len(chain) >= 2:
            # chain[0] is closest to BLR
            l0 = chain[0]
            l1 = chain[1]
            lines.append(
                f"    LDR1 @0x{l0[0]:x}: X{reg} <- [X{l0[1]}, #0x{l0[2]:x}]"
            )
            lines.append(
                f"    LDR2 @0x{l1[0]:x}: X{reg} <- [X{l1[1]}, #0x{l1[2]:x}]"
            )
        elif len(chain) == 1:
            l0 = chain[0]
            lines.append(
                f"    LDR @0x{l0[0]:x}: X{reg} <- [X{l0[1]}, #0x{l0[2]:x}]"
            )
        else:
            lines.append("    (no LDR chain found in window)")
    if not found:
        lines.append("  (no BLR found)")
    lines.append("")

Path(r"C:\temp\MobileSDK\analysis\blr_vtable_slots.md").write_text(
    "\n".join(lines), encoding="ascii", errors="ignore"
)
print(r"C:\temp\MobileSDK\analysis\blr_vtable_slots.md")
