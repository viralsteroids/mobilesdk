import struct
from pathlib import Path

lib_path = Path(r'C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so')
if not lib_path.exists():
    lib_path = Path(r'C:\temp\MobileSDK\SmartEngines_apktool\lib\arm64-v8a\libjnimultiengine.so')

data = lib_path.read_bytes()

# ELF64 LE
if data[:4] != b'\x7fELF' or data[4] != 2 or data[5] != 1:
    raise SystemExit('Unsupported ELF')

phoff = struct.unpack('<Q', data[0x20:0x28])[0]
phentsize = struct.unpack('<H', data[0x36:0x38])[0]
phnum = struct.unpack('<H', data[0x38:0x3a])[0]

segs = []
for i in range(phnum):
    off = phoff + i*phentsize
    p_type = struct.unpack('<I', data[off:off+4])[0]
    if p_type != 1:
        continue
    p_flags = struct.unpack('<I', data[off+4:off+8])[0]
    p_offset = struct.unpack('<Q', data[off+0x08:off+0x10])[0]
    p_vaddr = struct.unpack('<Q', data[off+0x10:off+0x18])[0]
    p_filesz = struct.unpack('<Q', data[off+0x20:off+0x28])[0]
    segs.append((p_offset, p_vaddr, p_filesz, p_flags))

TARGET = 0x2db3d4
PAGE = TARGET & ~0xfff

hits_literal = []
hits_adrp_ldr = []

for p_offset, p_vaddr, p_filesz, p_flags in segs:
    if not (p_flags & 1):
        continue
    seg = data[p_offset:p_offset+p_filesz]

    # Literal LDR / LDRSW / PRFM (mask class)
    for i in range(0, len(seg)-4, 4):
        insn = struct.unpack('<I', seg[i:i+4])[0]
        if (insn & 0x3B000000) == 0x18000000:
            imm19 = (insn >> 5) & 0x7ffff
            if imm19 & (1 << 18):
                imm19 -= 1 << 19
            target = (p_vaddr + i) + (imm19 << 2)
            if target == TARGET:
                hits_literal.append(p_vaddr + i)

    # ADRP + LDR (unsigned immediate)
    for i in range(0, len(seg)-8, 4):
        insn1 = struct.unpack('<I', seg[i:i+4])[0]
        insn2 = struct.unpack('<I', seg[i+4:i+8])[0]
        # ADRP Xn, imm
        if (insn1 & 0x9F000000) != 0x90000000:
            continue
        rd = insn1 & 0x1f
        # LDR (unsigned immediate) class: op0 0b1111100101 for 64-bit, 0b1011100101 for 32-bit
        # Use mask for load/store unsigned immediate: 0x3B000000 == 0x39000000
        if (insn2 & 0x3B000000) != 0x39000000:
            continue
        rn = (insn2 >> 5) & 0x1f
        if rn != rd:
            continue
        imm12 = (insn2 >> 10) & 0xfff
        size = (insn2 >> 30) & 0x3
        scale = 1 << size  # 00=1, 01=2, 10=4, 11=8
        # Decode ADRP
        immlo = (insn1 >> 29) & 0x3
        immhi = (insn1 >> 5) & 0x7ffff
        imm = (immhi << 2) | immlo
        if imm & (1 << 20):
            imm -= 1 << 21
        adrp_addr = ((p_vaddr + i) & ~0xfff) + (imm << 12)
        addr = adrp_addr + imm12 * scale
        if addr == TARGET:
            hits_adrp_ldr.append(p_vaddr + i)

out_txt = Path(r'C:\temp\MobileSDK\analysis\sha1_iv_xref_hits.txt')
lines = []
lines.append(f'ELF: {lib_path}')
lines.append(f'LDR literal hits: {len(hits_literal)}')
for v in hits_literal:
    lines.append(f'  literal_vaddr=0x{v:x}')
lines.append(f'ADRP+LDR hits: {len(hits_adrp_ldr)}')
for v in hits_adrp_ldr:
    lines.append(f'  adrp_ldr_vaddr=0x{v:x}')

out_txt.write_text('\n'.join(lines), encoding='ascii', errors='ignore')

print('\n'.join(lines))
