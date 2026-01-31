import struct
from pathlib import Path

lib = Path(r"C:\temp\MobileSDK\analysis\libjnimultiengine.so")
if not lib.exists():
    lib = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")

TARGETS = {
    0x1309f00: "xor_cluster_start",
    0x13099e0: "xor_cluster_helper",
}
TARGET_RANGE = (0x1309f00, 0x130a3e4)

raw = lib.read_bytes()
if raw[:4] != b'\x7fELF' or raw[4] != 2 or raw[5] != 1:
    raise SystemExit('Unsupported ELF')

phoff = struct.unpack('<Q', raw[0x20:0x28])[0]
phentsize = struct.unpack('<H', raw[0x36:0x38])[0]
phnum = struct.unpack('<H', raw[0x38:0x3a])[0]
segs = []
for i in range(phnum):
    off = phoff + i * phentsize
    p_type = struct.unpack('<I', raw[off:off+4])[0]
    if p_type != 1:
        continue
    p_flags = struct.unpack('<I', raw[off+4:off+8])[0]
    p_offset = struct.unpack('<Q', raw[off+0x08:off+0x10])[0]
    p_vaddr = struct.unpack('<Q', raw[off+0x10:off+0x18])[0]
    p_filesz = struct.unpack('<Q', raw[off+0x20:off+0x28])[0]
    segs.append((p_offset, p_vaddr, p_filesz, p_flags))

# helpers

def off_to_vaddr(off):
    for p_offset, p_vaddr, p_filesz, _ in segs:
        if p_offset <= off < p_offset + p_filesz:
            return p_vaddr + (off - p_offset)
    return None

# Scan data segments for 8-byte LE pointers to target range
ptr_hits = []
for p_offset, p_vaddr, p_filesz, p_flags in segs:
    # data segments typically RW (flags 2/4), but scan all non-exec too
    if p_flags & 1:
        continue
    seg = raw[p_offset:p_offset+p_filesz]
    for i in range(0, len(seg) - 8, 8):
        val = struct.unpack('<Q', seg[i:i+8])[0]
        if TARGET_RANGE[0] <= val <= TARGET_RANGE[1] or val in TARGETS:
            off = p_offset + i
            vaddr = off_to_vaddr(off)
            ptr_hits.append((off, vaddr, val))

# Scan executable segments for ADRP+ADD to target page
adrp_hits = []

def sign_extend(value, bits):
    sign_bit = 1 << (bits - 1)
    return (value & (sign_bit - 1)) - (value & sign_bit)

for p_offset, p_vaddr, p_filesz, p_flags in segs:
    if not (p_flags & 1):
        continue
    seg = raw[p_offset:p_offset+p_filesz]
    insn_count = (len(seg) // 4)
    for i in range(insn_count):
        insn = struct.unpack('<I', seg[i*4:i*4+4])[0]
        if (insn & 0x9F000000) != 0x90000000:  # ADRP
            continue
        rd = insn & 0x1f
        immlo = (insn >> 29) & 0x3
        immhi = (insn >> 5) & 0x7ffff
        imm = sign_extend((immhi << 2) | immlo, 21) << 12
        pc = p_vaddr + i*4
        page = (pc & ~0xfff) + imm
        # check for target page
        if (page & ~0xfff) != (TARGET_RANGE[0] & ~0xfff):
            continue
        # scan next few instructions for ADD (immediate) using same base reg
        for j in range(1, 6):
            if i + j >= insn_count:
                break
            insn2 = struct.unpack('<I', seg[(i+j)*4:(i+j)*4+4])[0]
            # ADD (immediate) 64-bit: 0x91000000 mask 0x7f000000
            if (insn2 & 0x7F000000) != 0x91000000:
                continue
            rn = (insn2 >> 5) & 0x1f
            rd2 = insn2 & 0x1f
            if rn != rd:
                continue
            imm12 = (insn2 >> 10) & 0xfff
            shift = (insn2 >> 22) & 0x1
            add_imm = imm12 << (12 if shift else 0)
            target = page + add_imm
            if TARGET_RANGE[0] <= target <= TARGET_RANGE[1] or target in TARGETS:
                adrp_hits.append((pc, pc + j*4, rd, target))

out = []
out.append('# XOR cluster reference scan')
out.append('')

out.append('## Pointer hits (data segments, 8-byte LE)')
if not ptr_hits:
    out.append('- (none found)')
else:
    for off, vaddr, val in ptr_hits:
        vstr = f'0x{vaddr:x}' if vaddr is not None else 'N/A'
        out.append(f'- file+0x{off:x} vaddr={vstr} -> 0x{val:x}')

out.append('')
out.append('## ADRP+ADD hits (exec segments)')
if not adrp_hits:
    out.append('- (none found)')
else:
    for pc, pc2, rd, target in adrp_hits:
        out.append(f'- ADRP @0x{pc:x} + ADD @0x{pc2:x} (X{rd}) -> 0x{target:x}')

Path(r"C:\temp\MobileSDK\analysis\xor_cluster_ref_scan.md").write_text("\n".join(out), encoding='ascii', errors='ignore')
print(r"C:\temp\MobileSDK\analysis\xor_cluster_ref_scan.md")
