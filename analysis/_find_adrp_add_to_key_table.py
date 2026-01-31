import struct
from pathlib import Path

LIB_PATH = Path(r'C:\temp\MobileSDK\analysis\libjnimultiengine.so')
OUT_MD = Path(r'C:\temp\MobileSDK\analysis\key_table_xref_scan.md')
OUT_TXT = Path(r'C:\temp\MobileSDK\analysis\key_table_xref_hits.txt')
KEY_TABLE_OFFSETS = [0x3909cf, 0x390920]  # observed candidates

if not LIB_PATH.exists():
    raise SystemExit(f'Missing {LIB_PATH}')

data = LIB_PATH.read_bytes()
if data[:4] != b'\x7fELF' or data[4] != 2 or data[5] != 1:
    raise SystemExit('Unsupported ELF')

# ELF header fields
phoff = struct.unpack_from('<Q', data, 0x20)[0]
phentsize = struct.unpack_from('<H', data, 0x36)[0]
phnum = struct.unpack_from('<H', data, 0x38)[0]

segs = []
for i in range(phnum):
    off = phoff + i * phentsize
    p_type = struct.unpack_from('<I', data, off)[0]
    if p_type != 1:
        continue
    p_flags = struct.unpack_from('<I', data, off + 4)[0]
    p_offset = struct.unpack_from('<Q', data, off + 0x08)[0]
    p_vaddr = struct.unpack_from('<Q', data, off + 0x10)[0]
    p_filesz = struct.unpack_from('<Q', data, off + 0x20)[0]
    segs.append((p_offset, p_vaddr, p_filesz, p_flags))

# Resolve file offset -> vaddr

def file_to_vaddr(file_off):
    for p_offset, p_vaddr, p_filesz, _ in segs:
        if p_offset <= file_off < p_offset + p_filesz:
            return p_vaddr + (file_off - p_offset)
    return None

# Identify executable segment ranges for scan
exec_ranges = []
for p_offset, p_vaddr, p_filesz, p_flags in segs:
    if p_flags & 1:
        exec_ranges.append((p_offset, p_vaddr, p_filesz))

# Target vaddrs
key_vaddrs = []
for off in KEY_TABLE_OFFSETS:
    vaddr = file_to_vaddr(off)
    key_vaddrs.append((off, vaddr))

# ADRP/ADD scan
# ADRP encoding: op=0b10000 at [31:24] with mask 0x9F000000 == 0x90000000
# ADD (immediate, 64-bit): 0x91000000 with mask 0xFFC00000

def decode_adrp(word, pc):
    immlo = (word >> 29) & 0x3
    immhi = (word >> 5) & 0x7FFFF
    imm = (immhi << 2) | immlo
    if imm & (1 << 20):
        imm -= 1 << 21
    base = (pc & ~0xFFF) + (imm << 12)
    rd = word & 0x1F
    return rd, base


def decode_add_imm(word):
    imm12 = (word >> 10) & 0xFFF
    shift = (word >> 22) & 0x3
    rn = (word >> 5) & 0x1F
    rd = word & 0x1F
    if shift == 1:
        imm = imm12 << 12
    else:
        imm = imm12
    return rd, rn, imm

hits = []
for p_offset, p_vaddr, p_filesz in exec_ranges:
    seg = data[p_offset:p_offset + p_filesz]
    for i in range(0, len(seg) - 4, 4):
        word = struct.unpack_from('<I', seg, i)[0]
        if (word & 0x9F000000) != 0x90000000:
            continue
        pc = p_vaddr + i
        rd, base = decode_adrp(word, pc)
        # look ahead a few instructions for add
        for j in range(1, 5):
            off2 = i + 4 * j
            if off2 + 4 > len(seg):
                break
            word2 = struct.unpack_from('<I', seg, off2)[0]
            if (word2 & 0xFFC00000) != 0x91000000:
                continue
            rd2, rn2, imm = decode_add_imm(word2)
            if rn2 != rd:
                continue
            target = base + imm
            for file_off, vaddr in key_vaddrs:
                if vaddr is None:
                    continue
                if target == vaddr:
                    hits.append((pc, rd, base, imm, target, file_off))

hits.sort()

with OUT_TXT.open('w', encoding='ascii', errors='ignore') as f:
    for pc, rd, base, imm, target, file_off in hits:
        f.write(f'0x{pc:x} rd={rd} base=0x{base:x} imm=0x{imm:x} -> target=0x{target:x} (file+0x{file_off:x})\n')

with OUT_MD.open('w', encoding='ascii', errors='ignore') as md:
    md.write('# Key table ADRP+ADD xref scan\n\n')
    md.write(f'ELF: {LIB_PATH}\n\n')
    md.write('## Key table offsets\n')
    for off, vaddr in key_vaddrs:
        md.write(f'- file offset 0x{off:x} -> vaddr {("0x%x"%vaddr) if vaddr is not None else "?"}\n')
    md.write('\n## ADRP+ADD hits\n')
    if not hits:
        md.write('- No ADRP+ADD sequences resolved to the key table address.\n')
    else:
        md.write('| pc | rd | base | imm | target | file_offset |\n')
        md.write('| --- | --- | --- | --- | --- | --- |\n')
        for pc, rd, base, imm, target, file_off in hits:
            md.write(f'| 0x{pc:x} | x{rd} | 0x{base:x} | 0x{imm:x} | 0x{target:x} | 0x{file_off:x} |\n')

print(f'Wrote {OUT_MD} and {OUT_TXT} (hits={len(hits)})')
