import struct
from pathlib import Path

LIB_PATH = Path(r'C:\temp\MobileSDK\analysis\libjnimultiengine.so')
OUT_MD = Path(r'C:\temp\MobileSDK\analysis\key_table_xref_symbol_map.md')

# key-table ADRP+ADD hits (vaddr PCs) from key_table_xref_scan.md
TARGET_PCS = [
    0x026db7f8,
    0x026dcfdc,
    0x026dd008,
    0x026dd034,
]

if not LIB_PATH.exists():
    raise SystemExit(f'Missing {LIB_PATH}')

data = LIB_PATH.read_bytes()
if data[:4] != b'\x7fELF' or data[4] != 2 or data[5] != 1:
    raise SystemExit('Unsupported ELF')

# ELF header
(e_shoff,) = struct.unpack_from('<Q', data, 0x28)
(e_shentsize,) = struct.unpack_from('<H', data, 0x3A)
(e_shnum,) = struct.unpack_from('<H', data, 0x3C)
(e_shstrndx,) = struct.unpack_from('<H', data, 0x3E)

sections = []
for i in range(e_shnum):
    off = e_shoff + i * e_shentsize
    sections.append(struct.unpack_from('<IIQQQQIIQQ', data, off))

sh_name, sh_type, sh_flags, sh_addr, sh_offset, sh_size, sh_link, sh_info, sh_addralign, sh_entsize = sections[e_shstrndx]
shstrtab = data[sh_offset:sh_offset + sh_size]


def get_sh_name(name_off):
    end = shstrtab.find(b'\x00', name_off)
    if end == -1:
        return ''
    return shstrtab[name_off:end].decode('ascii', errors='ignore')

idx_dynsym = None
idx_dynstr = None
for i, sh in enumerate(sections):
    name = get_sh_name(sh[0])
    if name == '.dynsym':
        idx_dynsym = i
    elif name == '.dynstr':
        idx_dynstr = i

if idx_dynsym is None or idx_dynstr is None:
    raise SystemExit('Missing .dynsym or .dynstr')

sh_dynsym = sections[idx_dynsym]
sh_dynstr = sections[idx_dynstr]

_, _, _, _, dynsym_off, dynsym_size, _, _, _, dynsym_entsize = sh_dynsym
_, _, _, _, dynstr_off, dynstr_size, _, _, _, _ = sh_dynstr

if dynsym_entsize == 0:
    dynsym_entsize = 24

# dynstr
_dynstr = data[dynstr_off:dynstr_off + dynstr_size]


def get_str(off):
    if off >= len(_dynstr):
        return ''
    end = _dynstr.find(b'\x00', off)
    if end == -1:
        return ''
    return _dynstr[off:end].decode('ascii', errors='ignore')

# Load dynsym entries
symbols = []
for off in range(dynsym_off, dynsym_off + dynsym_size, dynsym_entsize):
    st_name, st_info, st_other, st_shndx, st_value, st_size = struct.unpack_from('<IBBHQQ', data, off)
    name = get_str(st_name)
    if not name:
        continue
    symbols.append((st_value, st_size, name))

symbols.sort()


def find_nearest(vaddr):
    # binary search for largest st_value <= vaddr
    lo, hi = 0, len(symbols) - 1
    best = None
    while lo <= hi:
        mid = (lo + hi) // 2
        val, size, name = symbols[mid]
        if val <= vaddr:
            best = (val, size, name)
            lo = mid + 1
        else:
            hi = mid - 1
    return best

with OUT_MD.open('w', encoding='ascii', errors='ignore') as md:
    md.write('# Key table xref ? dynsym map\n\n')
    md.write(f'ELF: {LIB_PATH}\n\n')
    md.write('| xref_pc | nearest_symbol | symbol_vaddr | symbol_size | offset_into_symbol |\n')
    md.write('| --- | --- | --- | --- | --- |\n')
    for pc in TARGET_PCS:
        sym = find_nearest(pc)
        if sym:
            val, size, name = sym
            delta = pc - val
            md.write(f'| 0x{pc:x} | {name} | 0x{val:x} | 0x{size:x} | 0x{delta:x} |\n')
        else:
            md.write(f'| 0x{pc:x} | - | - | - | - |\n')

print(f'Wrote {OUT_MD}')
