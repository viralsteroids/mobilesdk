import re
from collections import defaultdict
from elftools.elf.elffile import ELFFile

path = r"C:\temp\MobileSDK\SmartEngines_apktool\lib\arm64-v8a\libjnimultiengine.so"

patterns = {
    'zstd': re.compile(r'zstd', re.I),
    'archive/zip': re.compile(r'archive|zip', re.I),
    'zlib/inflate/deflate': re.compile(r'zlib|inflate|deflate', re.I),
    'lz4': re.compile(r'lz4', re.I),
    'lzma/xz': re.compile(r'lzma|xz', re.I),
    'bzip2': re.compile(r'bz2|bzip', re.I),
    'aes': re.compile(r'\baes\b', re.I),
    'chacha': re.compile(r'chacha', re.I),
    'crypto/evp/mbedtls/openssl': re.compile(r'crypto|evp|mbedtls|openssl', re.I),
}

with open(path, 'rb') as f:
    elf = ELFFile(f)
    dyn = elf.get_section_by_name('.dynamic')
    needed = []
    if dyn:
        for tag in dyn.iter_tags():
            if tag.entry.d_tag == 'DT_NEEDED':
                needed.append(tag.needed)

    dynsym = elf.get_section_by_name('.dynsym')
    names = []
    if dynsym:
        for sym in dynsym.iter_symbols():
            if sym.name:
                names.append(sym.name)

hits = defaultdict(list)
for n in names:
    for label, rx in patterns.items():
        if rx.search(n):
            hits[label].append(n)

print('NEEDED:')
for n in needed:
    print(f'- {n}')

print('\nMATCHED SYMBOLS:')
for label in patterns:
    vals = sorted(set(hits[label]))
    print(f'\n[{label}] {len(vals)}')
    for v in vals[:80]:
        print(v)
    if len(vals) > 80:
        print(f'... {len(vals)-80} more')
