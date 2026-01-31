import re
from pathlib import Path
from elftools.elf.elffile import ELFFile

calls_path = Path(r"C:\temp\MobileSDK\analysis\apktool_plt_callsites_zstd_archive.md")
so_path = Path(r"C:\temp\MobileSDK\SmartEngines_apktool\lib\arm64-v8a\libjnimultiengine.so")

# parse callsites
entries = []
current = None
for line in calls_path.read_text(encoding='utf-8').splitlines():
    m = re.match(r"^([A-Za-z0-9_]+) @ 0x([0-9a-fA-F]+) :: callsites=(\d+)", line.strip())
    if m:
        current = (m.group(1), int(m.group(2), 16))
        continue
    m2 = re.match(r"^\s*- 0x([0-9a-fA-F]+)", line)
    if m2 and current:
        entries.append((current[0], current[1], int(m2.group(1), 16)))

focus = ['ZSTD_createDDict_advanced', 'ZSTD_DCtx_refDDict']

with so_path.open('rb') as f:
    elf = ELFFile(f)
    text = elf.get_section_by_name('.text')
    if not text:
        raise SystemExit('no .text')
    text_addr = text['sh_addr']
    data = text.data()

# find mov x29, sp (add x29, sp, #0) = 0x910003FD
mov_x29_sp = 0x910003FD
starts = []
for off in range(0, len(data), 4):
    insn = int.from_bytes(data[off:off+4], 'little')
    if insn == mov_x29_sp and off >= 4:
        starts.append(text_addr + off - 4)  # previous instruction likely stp x29, x30

starts.sort()

def find_start(addr):
    # nearest start <= addr
    import bisect
    idx = bisect.bisect_right(starts, addr) - 1
    if idx < 0:
        return None
    return starts[idx]

lines = []
lines.append(f"Binary: {so_path}")
lines.append(f"Found prologue markers (mov x29, sp): {len(starts)}")
lines.append("")

for target in focus:
    calls = [c for t, _, c in entries if t == target]
    if not calls:
        continue
    lines.append(f"{target} callsites={len(calls)}")
    for caddr in calls:
        saddr = find_start(caddr)
        if saddr is None:
            lines.append(f"  - 0x{caddr:x}: prologue not found")
        else:
            lines.append(f"  - 0x{caddr:x}: function_start~=0x{saddr:x}")
    lines.append("")

out_path = Path(r"C:\temp\MobileSDK\analysis\apktool_zstd_dict_callsite_prologue_map.md")
out_path.write_text("\n".join(lines), encoding='utf-8')
print(out_path)
