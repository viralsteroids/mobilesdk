import os

root = r'C:\\temp\\MobileSDK'
needle = bytes.fromhex('66 20 f5 7c 1a b4 0e 76 f0 d4 f2 84 73 3f d0 46')

files = [
    os.path.join(root, 'SmartEngines_full', 'lib', 'arm64-v8a', 'libjnimultiengine.so'),
    os.path.join(root, 'analysis', 'libjnimultiengine_current.so'),
    os.path.join(root, 'analysis', 'libjnimultiengine.so'),
]
files = [p for p in files if os.path.exists(p)]

out_md = os.path.join(root, 'analysis', 'postxor_constant_xref.md')
out_csv = os.path.join(root, 'analysis', 'postxor_constant_xref.csv')

rows = []
for path in files:
    with open(path, 'rb') as f:
        data = f.read()
    off = 0
    while True:
        idx = data.find(needle, off)
        if idx == -1:
            break
        rows.append((os.path.basename(path), idx))
        off = idx + 1

with open(out_csv, 'w', encoding='utf-8') as f:
    f.write('file,offset_hex,offset_dec\n')
    for name, idx in rows:
        f.write(f'{name},0x{idx:08x},{idx}\n')

with open(out_md, 'w', encoding='utf-8') as f:
    f.write('# Post-XOR 16-byte constant search\n\n')
    f.write('Pattern: 66 20 f5 7c 1a b4 0e 76 f0 d4 f2 84 73 3f d0 46\n\n')
    if not rows:
        f.write('No matches found in scanned binaries.\n')
    else:
        for name, idx in rows:
            f.write(f'- {name}: 0x{idx:08x} ({idx})\n')

print('Wrote', out_md, 'and', out_csv)
