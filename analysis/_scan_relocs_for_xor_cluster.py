import struct
from pathlib import Path

lib_path = Path(r"C:\temp\MobileSDK\analysis\libjnimultiengine.so")
if not lib_path.exists():
    lib_path = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")

data = lib_path.read_bytes()
if data[:4] != b"\x7fELF" or data[4] != 2 or data[5] != 1:
    raise SystemExit("Unsupported ELF")

(e_shoff,) = struct.unpack('<Q', data[0x28:0x30])
(e_shentsize,) = struct.unpack('<H', data[0x3a:0x3c])
(e_shnum,) = struct.unpack('<H', data[0x3c:0x3e])
(e_shstrndx,) = struct.unpack('<H', data[0x3e:0x40])

shdrs = []
for i in range(e_shnum):
    off = e_shoff + i * e_shentsize
    shdrs.append(struct.unpack('<IIQQQQIIQQ', data[off:off+64]))

shstr = b''
if e_shstrndx < len(shdrs):
    sh = shdrs[e_shstrndx]
    shstr = data[sh[4]:sh[4]+sh[5]]

def sh_name(idx):
    if idx >= len(shstr):
        return ''
    end = shstr.find(b'\x00', idx)
    if end == -1:
        return ''
    return shstr[idx:end].decode('ascii','ignore')

# collect relocation sections
relocs = []
for i, sh in enumerate(shdrs):
    name = sh_name(sh[0])
    sh_type = sh[1]
    if sh_type in (4, 9):  # SHT_RELA=4, SHT_REL=9
        relocs.append((name, sh))

TARGET_START = 0x1309f00
TARGET_END = 0x130a3e4

lines = []
lines.append("# Relocation scan for XOR cluster refs")
lines.append("")

for name, sh in relocs:
    sh_offset = sh[4]
    sh_size = sh[5]
    sh_entsize = sh[9]
    if sh_entsize == 0:
        continue
    count = sh_size // sh_entsize
    hits = []
    for idx in range(count):
        off = sh_offset + idx * sh_entsize
        if sh[1] == 4:  # RELA
            r_offset, r_info, r_addend = struct.unpack('<QQq', data[off:off+24])
            if TARGET_START <= r_addend <= TARGET_END:
                hits.append((r_offset, r_info, r_addend))
        else:  # REL
            r_offset, r_info = struct.unpack('<QQ', data[off:off+16])
            # REL has no addend in entry; can't check
            continue
    if hits:
        lines.append(f"## {name} (hits={len(hits)})")
        for r_offset, r_info, r_addend in hits[:20]:
            lines.append(f"- r_offset=0x{r_offset:x} r_info=0x{r_info:x} r_addend=0x{r_addend:x}")
        lines.append("")

Path(r"C:\temp\MobileSDK\analysis\xor_cluster_reloc_refs.md").write_text("\n".join(lines), encoding='ascii', errors='ignore')
print(r"C:\temp\MobileSDK\analysis\xor_cluster_reloc_refs.md")
