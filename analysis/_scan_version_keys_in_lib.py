import os
from elftools.elf.elffile import ELFFile

ROOT = r"C:\temp\MobileSDK"
LIB = os.path.join(ROOT, 'SmartEngines_full', 'lib', 'arm64-v8a', 'libjnimultiengine.so')
REPORT = os.path.join(ROOT, 'analysis', 'version_key_locations.md')

# keys per version from bundle headers
KEYS = {
    'v2.7.2': bytes.fromhex('a6d01f9528847cd118d154e96dd9fd2cd16f7a77'),
    'v3.2.0': bytes.fromhex('c2ac4db5c62062bb0d7554d55613991b059fee8a'),
    'v2.6.4': bytes.fromhex('3cb11e8c45e443f30057c9e6559c48cbd02c3c16'),
}
CONST16 = bytes.fromhex('76f6f2fb17591a73192c515d55b72060')
LIC20 = bytes.fromhex('2688f026b0f34dea31b377bfe5fd1f6ecf2b9848')

if not os.path.exists(LIB):
    raise SystemExit('lib not found: ' + LIB)

with open(LIB, 'rb') as f:
    blob = f.read()

# load section map for offsets
sections = []
with open(LIB, 'rb') as f:
    elf = ELFFile(f)
    for sec in elf.iter_sections():
        if sec['sh_size'] == 0:
            continue
        sections.append((sec.name, sec['sh_offset'], sec['sh_offset'] + sec['sh_size'], sec['sh_addr']))


def map_offset(off):
    for name, start, end, vaddr in sections:
        if start <= off < end:
            return name, vaddr + (off - start)
    return None, None


def find_all(pat):
    offs = []
    start = 0
    while True:
        idx = blob.find(pat, start)
        if idx == -1:
            break
        offs.append(idx)
        start = idx + 1
    return offs

hits = []
for name, key in KEYS.items():
    for off in find_all(key):
        sec, vaddr = map_offset(off)
        hits.append((name, 'key20', off, vaddr, sec))

for off in find_all(CONST16):
    sec, vaddr = map_offset(off)
    hits.append(('const16', 'const16', off, vaddr, sec))

for off in find_all(LIC20):
    sec, vaddr = map_offset(off)
    hits.append(('license20', 'license20', off, vaddr, sec))

with open(REPORT, 'w', encoding='ascii') as out:
    out.write('# Version key / const locations in libjnimultiengine.so\n\n')
    out.write(f'File: {LIB}\n\n')
    if not hits:
        out.write('No matches for version keys / const16 / license20.\n')
    else:
        out.write('| label | type | file_offset | vaddr | section |\n')
        out.write('| --- | --- | --- | --- | --- |\n')
        for label, typ, off, vaddr, sec in sorted(hits, key=lambda x: x[2]):
            out.write(f'| {label} | {typ} | 0x{off:x} | 0x{(vaddr or 0):x} | {sec or "-"} |\n')

print('Wrote', REPORT)
