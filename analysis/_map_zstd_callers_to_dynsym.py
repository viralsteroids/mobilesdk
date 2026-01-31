import struct
from pathlib import Path

lib_path = Path(r"C:\temp\MobileSDK\analysis\libjnimultiengine.so")
if not lib_path.exists():
    lib_path = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")

data = lib_path.read_bytes()
if data[:4] != b'\x7fELF' or data[4] != 2 or data[5] != 1:
    raise SystemExit('Unsupported ELF')

(e_shoff,) = struct.unpack('<Q', data[0x28:0x30])
(e_shentsize,) = struct.unpack('<H', data[0x3a:0x3c])
(e_shnum,) = struct.unpack('<H', data[0x3c:0x3e])
(e_shstrndx,) = struct.unpack('<H', data[0x3e:0x40])

shdrs = []
for i in range(e_shnum):
    off = e_shoff + i * e_shentsize
    sh = struct.unpack('<IIQQQQIIQQ', data[off:off+64])
    shdrs.append(sh)

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
    return shstr[idx:end].decode('ascii', 'ignore')

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

dynsym = data[sh_dynsym[4]:sh_dynsym[4]+sh_dynsym[5]]
dynstr = data[sh_dynstr[4]:sh_dynstr[4]+sh_dynstr[5]]
entsize = sh_dynsym[9]

symbols = []
for off in range(0, len(dynsym), entsize):
    st_name, st_info, st_other, st_shndx, st_value, st_size = struct.unpack('<IBBHQQ', dynsym[off:off+24])
    if st_name >= len(dynstr):
        continue
    end = dynstr.find(b'\x00', st_name)
    if end == -1:
        continue
    name = dynstr[st_name:end].decode('ascii', 'ignore')
    st_type = st_info & 0xF
    if st_type != 2:
        continue
    symbols.append((st_value, st_size, name))

symbols.sort(key=lambda x: x[0])

callsites = [0x26ebf74, 0x26f55b8, 0x27108a4]

lines = []
lines.append('# ZSTD_decompressStream callsite dynsym mapping')
lines.append('')
for addr in callsites:
    lo = 0
    hi = len(symbols) - 1
    best = None
    while lo <= hi:
        mid = (lo + hi) // 2
        if symbols[mid][0] <= addr:
            best = symbols[mid]
            lo = mid + 1
        else:
            hi = mid - 1
    if best:
        base, size, name = best
        lines.append(f'- 0x{addr:x} -> {name} @ 0x{base:x} (size=0x{size:x})')
    else:
        lines.append(f'- 0x{addr:x} -> (no dynsym match)')

Path(r"C:\temp\MobileSDK\analysis\zstd_stream_callers_dynsym.md").write_text("\n".join(lines), encoding='ascii', errors='ignore')
print(r"C:\temp\MobileSDK\analysis\zstd_stream_callers_dynsym.md")
