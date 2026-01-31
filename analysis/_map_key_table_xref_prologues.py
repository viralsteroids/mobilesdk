from pathlib import Path
from elftools.elf.elffile import ELFFile
import bisect

LIB_PATH = Path(r'C:\temp\MobileSDK\analysis\libjnimultiengine.so')
OUT_MD = Path(r'C:\temp\MobileSDK\analysis\key_table_xref_prologues.md')
TARGET_PCS = [
    0x026db7f8,
    0x026dcfdc,
    0x026dd008,
    0x026dd034,
]

with LIB_PATH.open('rb') as f:
    elf = ELFFile(f)
    text = elf.get_section_by_name('.text')
    if not text:
        raise SystemExit('no .text')
    text_addr = text['sh_addr']
    data = text.data()

# mov x29, sp is encoded as ADD X29, SP, #0 (0x910003FD)
mov_x29_sp = 0x910003FD
starts = []
for off in range(0, len(data) - 4, 4):
    insn = int.from_bytes(data[off:off+4], 'little')
    if insn == mov_x29_sp and off >= 4:
        starts.append(text_addr + off - 4)  # assume preceding insn is stp x29,x30, [sp,#-imm]!

starts.sort()

def find_start(addr):
    idx = bisect.bisect_right(starts, addr) - 1
    if idx < 0:
        return None
    return starts[idx]

lines = []
lines.append('# Key table xref ? nearest prologue')
lines.append('')
lines.append(f'ELF: {LIB_PATH}')
lines.append('')
lines.append(f'Prologue markers (mov x29, sp) found: {len(starts)}')
lines.append('')
lines.append('| xref_pc | nearest_prologue | delta |')
lines.append('| --- | --- | --- |')
for pc in TARGET_PCS:
    start = find_start(pc)
    if start is None:
        lines.append(f'| 0x{pc:x} | - | - |')
    else:
        delta = pc - start
        lines.append(f'| 0x{pc:x} | 0x{start:x} | 0x{delta:x} |')

OUT_MD.write_text('\n'.join(lines), encoding='ascii', errors='ignore')
print(OUT_MD)
