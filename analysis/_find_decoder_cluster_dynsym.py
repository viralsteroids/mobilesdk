import struct
from pathlib import Path

lib = Path(r"C:\temp\MobileSDK\analysis\libjnimultiengine.so")
if not lib.exists():
    lib = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
raw = lib.read_bytes()
if raw[:4] != b'\x7fELF' or raw[4] != 2 or raw[5] != 1:
    raise SystemExit('Unsupported ELF')

(e_shoff,) = struct.unpack('<Q', raw[0x28:0x30])
(e_shentsize,) = struct.unpack('<H', raw[0x3a:0x3c])
(e_shnum,) = struct.unpack('<H', raw[0x3c:0x3e])
(e_shstrndx,) = struct.unpack('<H', raw[0x3e:0x40])

shdrs = []
for i in range(e_shnum):
    off = e_shoff + i * e_shentsize
    shdrs.append(struct.unpack('<IIQQQQIIQQ', raw[off:off+64]))

shstr = b''
if e_shstrndx < len(shdrs):
    sh = shdrs[e_shstrndx]
    shstr = raw[sh[4]:sh[4]+sh[5]]

def sh_name(idx):
    if idx >= len(shstr):
        return ''
    end = shstr.find(b'\x00', idx)
    if end == -1:
        return ''
    return shstr[idx:end].decode('ascii','ignore')

idx_dynsym = None
idx_dynstr = None
for i, sh in enumerate(shdrs):
    name = sh_name(sh[0])
    if name == '.dynsym':
        idx_dynsym = i
    elif name == '.dynstr':
        idx_dynstr = i
if idx_dynsym is None or idx_dynstr is None:
    raise SystemExit('dynsym/dynstr not found')

sh_dynsym = shdrs[idx_dynsym]
sh_dynstr = shdrs[idx_dynstr]

dynsym = raw[sh_dynsym[4]:sh_dynsym[4]+sh_dynsym[5]]
dynstr = raw[sh_dynstr[4]:sh_dynstr[4]+sh_dynstr[5]]
entsize = sh_dynsym[9]

symbols = []
for off in range(0, len(dynsym), entsize):
    st_name, st_info, st_other, st_shndx, st_value, st_size = struct.unpack('<IBBHQQ', dynsym[off:off+24])
    if st_name >= len(dynstr):
        continue
    end = dynstr.find(b'\x00', st_name)
    if end == -1:
        continue
    name = dynstr[st_name:end].decode('ascii','ignore')
    st_type = st_info & 0xF
    if st_type != 2:
        continue
    symbols.append((st_value, st_size, name))

symbols.sort(key=lambda x: x[0])

TARGET_RANGES = [
    (0x02557a00, 0x02558600, 'archive wrapper cluster'),
    (0x026ea000, 0x026ecef0, 'archive file-path cluster'),
]

lines = []
lines.append('# Dynsym symbols near decoder clusters')
for start, end, label in TARGET_RANGES:
    lines.append(f"\n## {label} 0x{start:x}-0x{end:x}")
    hits = [s for s in symbols if start <= s[0] < end]
    if not hits:
        lines.append('- (no dynsym symbols in range)')
    else:
        for v, sz, name in hits:
            lines.append(f"- {name} @ 0x{v:x} size=0x{sz:x}")

Path(r"C:\temp\MobileSDK\analysis\decoder_cluster_dynsym.md").write_text("\n".join(lines), encoding='ascii', errors='ignore')
print(r"C:\temp\MobileSDK\analysis\decoder_cluster_dynsym.md")
