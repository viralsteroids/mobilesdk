import os
from elftools.elf.elffile import ELFFile

ROOT = r"C:\temp\MobileSDK"
LIB = os.path.join(ROOT, 'SmartEngines_full', 'lib', 'arm64-v8a', 'libjnimultiengine.so')
REPORT = os.path.join(ROOT, 'analysis', 'postxor_markers_in_lib.md')

# post-XOR header bytes (key20 XOR lic20) per version
POSTXOR_KEYS = {
    'v2.7.2_postxor20': bytes.fromhex('8058efb39877313b296223568824e2421e44e23f'),
    'v3.2.0_postxor20': bytes.fromhex('e424bd9376d32f513cc6236ab3ee8675cab476c2'),
    'v2.6.4_postxor20': bytes.fromhex('1a39eeaaf5170e1931e4be59b06157a51f07a45e'),
}
POSTXOR_CONST16 = bytes.fromhex('6620f57c1ab40e76f0d4f284733fd046')

if not os.path.exists(LIB):
    raise SystemExit('lib not found: ' + LIB)

with open(LIB, 'rb') as f:
    blob = f.read()

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
for name, pat in POSTXOR_KEYS.items():
    for off in find_all(pat):
        sec, vaddr = map_offset(off)
        hits.append((name, 'postxor20', off, vaddr, sec))

for off in find_all(POSTXOR_CONST16):
    sec, vaddr = map_offset(off)
    hits.append(('postxor_const16', 'postxor_const16', off, vaddr, sec))

with open(REPORT, 'w', encoding='ascii') as out:
    out.write('# Post-XOR header markers in libjnimultiengine.so\n\n')
    out.write(f'File: {LIB}\n\n')
    if not hits:
        out.write('No matches for post-XOR header markers.\n')
    else:
        out.write('| label | type | file_offset | vaddr | section |\n')
        out.write('| --- | --- | --- | --- | --- |\n')
        for label, typ, off, vaddr, sec in sorted(hits, key=lambda x: x[2]):
            out.write(f'| {label} | {typ} | 0x{off:x} | 0x{(vaddr or 0):x} | {sec or "-"} |\n')

print('Wrote', REPORT)
