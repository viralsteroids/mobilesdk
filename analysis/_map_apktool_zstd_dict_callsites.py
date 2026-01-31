import re
from pathlib import Path
from elftools.elf.elffile import ELFFile

calls_path = Path(r"C:\temp\MobileSDK\analysis\apktool_plt_callsites_zstd_archive.md")
so_path = Path(r"C:\temp\MobileSDK\SmartEngines_apktool\lib\arm64-v8a\libjnimultiengine.so")

if not calls_path.exists():
    raise SystemExit('missing callsite report')
if not so_path.exists():
    raise SystemExit('missing so')

# Parse callsite report
entries = []  # (target_name, target_addr, callsite_addr)
current = None
for line in calls_path.read_text(encoding='utf-8').splitlines():
    m = re.match(r"^([A-Za-z0-9_]+) @ 0x([0-9a-fA-F]+) :: callsites=(\d+)", line.strip())
    if m:
        current = (m.group(1), int(m.group(2), 16))
        continue
    m2 = re.match(r"^\s*- 0x([0-9a-fA-F]+)", line)
    if m2 and current:
        entries.append((current[0], current[1], int(m2.group(1), 16)))

# Load symbols
with so_path.open('rb') as f:
    elf = ELFFile(f)
    symtab = elf.get_section_by_name('.symtab')
    text = elf.get_section_by_name('.text')
    if not symtab:
        raise SystemExit('no .symtab')
    text_start = text['sh_addr'] if text else None
    text_end = text_start + text['sh_size'] if text else None

    funcs = []
    for sym in symtab.iter_symbols():
        if sym['st_info']['type'] == 'STT_FUNC':
            name = sym.name
            addr = sym['st_value']
            size = sym['st_size']
            if addr:
                funcs.append((addr, size, name))

funcs.sort()
addrs = [f[0] for f in funcs]

import bisect

def find_func(addr):
    idx = bisect.bisect_right(addrs, addr) - 1
    if idx < 0:
        return None
    faddr, fsize, name = funcs[idx]
    if fsize and addr >= faddr + fsize:
        # address past function size
        return None
    return faddr, fsize, name

# Filter to ZSTD dict-related callsites
focus_targets = set(['ZSTD_createDDict_advanced', 'ZSTD_DCtx_refDDict', 'ZSTD_createDDict', 'ZSTD_createDDict_byReference', 'ZSTD_createDDict_advanced'])

lines = []
lines.append(f"Binary: {so_path}")
lines.append(f"Total callsites parsed: {len(entries)}")
lines.append("")

# Group by target
from collections import defaultdict
by_target = defaultdict(list)
for target, taddr, caddr in entries:
    by_target[target].append((taddr, caddr))

for target in sorted(by_target.keys()):
    if target not in focus_targets:
        continue
    calls = by_target[target]
    lines.append(f"{target} callsites={len(calls)}")
    for taddr, caddr in calls:
        fn = find_func(caddr)
        if fn:
            faddr, fsize, name = fn
            lines.append(f"  - 0x{caddr:x} in {name} (func=0x{faddr:x}, size=0x{fsize:x})")
        else:
            lines.append(f"  - 0x{caddr:x} (no symtab match)")
    lines.append("")

out_path = Path(r"C:\temp\MobileSDK\analysis\apktool_zstd_dict_callsites_symbols.md")
out_path.write_text("\n".join(lines), encoding='utf-8')
print(out_path)
