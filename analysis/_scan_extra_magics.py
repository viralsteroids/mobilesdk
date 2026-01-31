import os
import csv

ROOT = r"C:\temp\MobileSDK"
OUT_MD = os.path.join(ROOT, 'analysis', 'extra_magic_scan.md')
OUT_CSV = os.path.join(ROOT, 'analysis', 'extra_magic_scan.csv')

MAGICS = {
    'lz4_frame': bytes.fromhex('04224d18'),
    'lz4_skippable_base': bytes.fromhex('2a4d18'),  # 0x184D2A50..5F, handled separately
    'xz': bytes.fromhex('fd377a585a00'),
    'lzma_alone': bytes.fromhex('5d00008000'),
    'bzip2': b'BZh',
    'lzip': bytes.fromhex('4c5a4950'),  # LZIP
    'lzo': bytes.fromhex('894c5a4f000d0a1a0a'),
}

TARGET_DIRS = [
    os.path.join(ROOT, 'offline_xor_out'),
    os.path.join(ROOT, 'decrypted_bundles'),
]

files = []
for d in TARGET_DIRS:
    if not os.path.isdir(d):
        continue
    for f in os.listdir(d):
        if f.endswith('.bin'):
            files.append(os.path.join(d, f))

results = []

for path in sorted(files):
    data = open(path, 'rb').read()
    name = os.path.basename(path)
    size = len(data)

    # scan fixed magics
    for label, magic in MAGICS.items():
        if label == 'lz4_skippable_base':
            continue
        start = 0
        while True:
            idx = data.find(magic, start)
            if idx == -1:
                break
            results.append([name, size, label, idx])
            start = idx + 1

    # scan lz4 skippable frames 0x184D2A50..0x184D2A5F (little endian in stream)
    start = 0
    while True:
        idx = data.find(b'\x50\x2a\x4d\x18', start)
        if idx == -1:
            break
        b = data[idx + 3]  # 0x18 expected
        # verify upper byte range by checking full 4-byte little-endian value
        val = int.from_bytes(data[idx:idx+4], 'little')
        if 0x184D2A50 <= val <= 0x184D2A5F:
            results.append([name, size, 'lz4_skippable', idx])
        start = idx + 1

dedup = {}
for name, size, magic, offset in results:
    key = (name, magic, offset)
    if key not in dedup:
        dedup[key] = [name, size, magic, offset]

rows = [dedup[k] for k in sorted(dedup.keys())]

with open(OUT_CSV, 'w', newline='', encoding='ascii') as f:
    w = csv.writer(f)
    w.writerow(['file', 'size', 'magic', 'offset'])
    for row in rows:
        w.writerow(row)

with open(OUT_MD, 'w', encoding='ascii') as f:
    f.write('# Extra magic scan (offline_xor_out + decrypted_bundles)\n\n')
    f.write('Magics: lz4 frame/skippable, xz, lzma-alone, bzip2, lzip, lzo.\n\n')
    if not rows:
        f.write('No hits for the scanned magic values.\n')
    else:
        f.write('| file | size | magic | offset |\n')
        f.write('| --- | --- | --- | --- |\n')
        for row in rows:
            f.write(f'| {row[0]} | {row[1]} | {row[2]} | {row[3]} |\n')

print('Wrote', OUT_MD)
print('Wrote', OUT_CSV)
