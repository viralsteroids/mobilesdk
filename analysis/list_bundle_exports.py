from elftools.elf.elffile import ELFFile
path = r"C:\\temp\\MobileSDK\\analysis\\libjnimultiengine_current.so"
with open(path, 'rb') as f:
    elf = ELFFile(f)
    dynsym = elf.get_section_by_name('.dynsym')
    names = []
    for sym in dynsym.iter_symbols():
        name = sym.name
        if name and 'CreateFromEmbeddedBundle' in name:
            names.append(name)
    for n in sorted(names):
        print(n)
