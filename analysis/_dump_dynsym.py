import sys
from elftools.elf.elffile import ELFFile

path = r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so"

with open(path, 'rb') as f:
    elf = ELFFile(f)
    dyn = elf.get_section_by_name('.dynamic')
    needed = []
    if dyn:
        for tag in dyn.iter_tags():
            if tag.entry.d_tag == 'DT_NEEDED':
                needed.append(tag.needed)

    dynsym = elf.get_section_by_name('.dynsym')
    symbols = []
    if dynsym:
        for sym in dynsym.iter_symbols():
            name = sym.name
            if not name:
                continue
            symbols.append(name)

print('NEEDED:')
for n in needed:
    print(n)

print('\nZSTD-like symbols:')
for n in sorted(s for s in symbols if 'ZSTD' in s or 'zstd' in s):
    print(n)

print('\nARCHIVE-like symbols:')
for n in sorted(s for s in symbols if 'archive' in s or 'Archive' in s or 'ARCHIVE' in s):
    print(n)

print('\nCRYPTO-like symbols:')
for n in sorted(s for s in symbols if 'AES' in s or 'ChaCha' in s or 'EVP' in s or 'mbedtls' in s or 'crypto' in s):
    print(n)
