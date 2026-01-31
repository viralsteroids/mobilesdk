from elftools.elf.elffile import ELFFile
import os

ROOT = r"C:\temp\MobileSDK"
LIB = os.path.join(ROOT, 'SmartEngines_full', 'lib', 'arm64-v8a', 'libjnimultiengine.so')
REPORT = os.path.join(ROOT, 'analysis', 'sha1_constants_scan.md')
OFFSET = 0x2db3d4

with open(LIB, 'rb') as f:
    elf = ELFFile(f)
    vaddr = None
    seg_name = None
    for seg in elf.iter_segments():
        if seg['p_type'] != 'PT_LOAD':
            continue
        off = seg['p_offset']
        size = seg['p_filesz']
        if off <= OFFSET < off + size:
            vaddr = seg['p_vaddr'] + (OFFSET - off)
            seg_name = f"PT_LOAD flags=0x{seg['p_flags']:x}"
            break

# Append mapping to report
if os.path.exists(REPORT):
    lines = open(REPORT, 'r', encoding='ascii', errors='ignore').read().splitlines()
else:
    lines = []

extra = []
extra.append('')
extra.append('## Offset mapping')
if vaddr is None:
    extra.append(f'- 0x{OFFSET:x}: no PT_LOAD mapping found')
else:
    extra.append(f'- 0x{OFFSET:x} -> vaddr 0x{vaddr:x} ({seg_name})')

# remove old mapping section if exists
out_lines = []
skip = False
for line in lines:
    if line.strip() == '## Offset mapping':
        skip = True
        continue
    if skip:
        # skip until blank line or EOF
        if line.strip() == '':
            skip = False
            continue
        else:
            continue
    out_lines.append(line)

out_lines += extra

with open(REPORT, 'w', encoding='ascii') as f:
    f.write('\n'.join(out_lines) + '\n')

print('Updated', REPORT)
