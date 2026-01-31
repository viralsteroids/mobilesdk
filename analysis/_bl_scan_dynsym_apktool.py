import bisect
from collections import defaultdict
from elftools.elf.elffile import ELFFile

path = r"C:\temp\MobileSDK\SmartEngines_apktool\lib\arm64-v8a\libjnimultiengine.so"

with open(path, 'rb') as f:
    elf = ELFFile(f)
    plt = elf.get_section_by_name('.plt') or elf.get_section_by_name('.plt.sec')
    rela = elf.get_section_by_name('.rela.plt') or elf.get_section_by_name('.rela.plt.sec')
    text = elf.get_section_by_name('.text')

    if not plt or not rela or not text:
        raise SystemExit('missing plt/rela/text')

    plt_addr = plt['sh_addr']
    plt_size = plt['sh_size']
    entry_size = 0x10  # AArch64
    rel_count = rela.num_relocations()
    plt0_size = plt_size - rel_count * entry_size

    # Build list of symbols for relocations in order
    dynsym = elf.get_section(rela['sh_link'])
    rel_syms = []
    for rel in rela.iter_relocations():
        sym = dynsym.get_symbol(rel.entry.r_info_sym)
        rel_syms.append(sym)

    plt_entries = []
    for idx, sym in enumerate(rel_syms):
        addr = plt_addr + plt0_size + idx * entry_size
        plt_entries.append((addr, sym.name))

    # Build lookup: symbol name -> plt addr
    plt_by_name = {name: addr for addr, name in plt_entries if name}
    plt_by_addr = {addr: name for addr, name in plt_entries if name}

    # Build function symbol table from .symtab if present
    symtab = elf.get_section_by_name('.symtab')
    func_addrs = []
    func_names = []
    if symtab:
        for sym in symtab.iter_symbols():
            if sym['st_info']['type'] == 'STT_FUNC' and sym['st_size'] > 0:
                func_addrs.append(sym['st_value'])
                func_names.append(sym.name)
        # sort
        pairs = sorted(zip(func_addrs, func_names))
        func_addrs = [p[0] for p in pairs]
        func_names = [p[1] for p in pairs]

    def func_for_addr(addr):
        if not func_addrs:
            return None
        idx = bisect.bisect_right(func_addrs, addr) - 1
        if idx >= 0:
            return func_names[idx] or None
        return None

    # Identify interesting PLT addresses
    interesting = {}
    for name, addr in plt_by_name.items():
        low = name.lower()
        if low.startswith('zstd_') or low.startswith('archive_'):
            interesting[addr] = name

    # Scan .text for BL to interesting targets
    text_addr = text['sh_addr']
    data = text.data()
    callsites = defaultdict(list)

    for off in range(0, len(data), 4):
        insn = int.from_bytes(data[off:off+4], 'little')
        if insn & 0xFC000000 == 0x94000000:  # BL
            imm26 = insn & 0x03FFFFFF
            # sign-extend 26 bits
            if imm26 & (1 << 25):
                imm26 -= 1 << 26
            target = text_addr + off + (imm26 << 2)
            if target in interesting:
                callsites[target].append(text_addr + off)

    # Emit report
    lines = []
    lines.append(f"PLT0 size: 0x{plt0_size:x} (plt_size=0x{plt_size:x}, rel_count={rel_count})")
    lines.append("")

    for target, name in sorted(interesting.items(), key=lambda x: x[1]):
        calls = callsites.get(target, [])
        lines.append(f"{name} @ 0x{target:x} :: callsites={len(calls)}")
        for c in calls:
            fn = func_for_addr(c)
            if fn:
                lines.append(f"  - 0x{c:x} in {fn}")
            else:
                lines.append(f"  - 0x{c:x}")
        if not calls:
            lines.append("  - (no direct BL in .text)")
        lines.append("")

out_path = r"C:\temp\MobileSDK\analysis\apktool_plt_callsites_zstd_archive.md"
with open(out_path, 'w', encoding='utf-8') as f:
    f.write("\n".join(lines))
print(out_path)
