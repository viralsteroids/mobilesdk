from elftools.elf.elffile import ELFFile
path = r"C:\\temp\\MobileSDK\\analysis\\libjnimultiengine_current.so"
with open(path, 'rb') as f:
    elf = ELFFile(f)
    dynsym = elf.get_section_by_name('.dynsym')
    if not dynsym:
        print('no dynsym')
    else:
        zstd = []
        bundles = []
        for sym in dynsym.iter_symbols():
            name = sym.name
            if not name:
                continue
            if name.startswith('ZSTD_decompress'):
                zstd.append(name)
            if 'CreateFromEmbeddedBundle' in name:
                bundles.append(name)
        print('ZSTD exports count:', len(zstd))
        print('ZSTD exports sample:', zstd[:10])
        print('Bundle exports sample:', bundles[:10])
