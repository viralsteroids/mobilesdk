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
page = TARGET & ~0xfff

hits = []
for p_offset, p_vaddr, p_filesz, p_flags in segs:
    if not (p_flags & 1):
        continue
    seg = data[p_offset:p_offset+p_filesz]
    for i in range(0, len(seg)-8, 4):
        insn1 = struct.unpack('<I', seg[i:i+4])[0]
        insn2 = struct.unpack('<I', seg[i+4:i+8])[0]
        if (insn1 & 0x9f000000) != 0x90000000:
            continue
        if (insn2 & 0x7f000000) != 0x91000000:
            continue
        rd1 = insn1 & 0x1f
        rd2 = insn2 & 0x1f
        rn2 = (insn2 >> 5) & 0x1f
        if rd1 != rd2 or rd1 != rn2:
            continue
        immlo = (insn1 >> 29) & 0x3
        immhi = (insn1 >> 5) & 0x7ffff
        imm = (immhi << 2) | immlo
        if imm & (1 << 20):
            imm -= 1 << 21
        adrp_addr = ((p_vaddr + i) & ~0xfff) + (imm << 12)
        imm12 = (insn2 >> 10) & 0xfff
        shift = (insn2 >> 22) & 0x3
        add_imm = imm12 << (12 if shift == 1 else 0)
        final = adrp_addr + add_imm
        if final == TARGET:
            hits.append(p_vaddr + i)

out_path = Path(r'C:\temp\MobileSDK\analysis\sha1_iv_adrp_add_hits.txt')
out_path.write_text('\n'.join([f'0x{v:x}' for v in hits]), encoding='ascii', errors='ignore')
print(f'ELF: {lib_path}')
print(f'ADRP+ADD hits to 0x{TARGET:x}: {len(hits)}')
for v in hits[:200]:
    print(f'  seq_vaddr=0x{v:x}')
