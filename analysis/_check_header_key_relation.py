import os
import binascii

ROOT = r"C:\temp\MobileSDK"
BUNDLE_DIR = os.path.join(ROOT, 'extracted_bundles', 'assets')
XOR_DIR = os.path.join(ROOT, 'offline_xor_out')
REPORT = os.path.join(ROOT, 'analysis', 'header_key_relation_check.md')

# map bundle base name to offline_xor_out file
xor_map = {}
if os.path.isdir(XOR_DIR):
    for f in os.listdir(XOR_DIR):
        if f.endswith('_last_attempt.bin'):
            base = f.replace('_last_attempt.bin', '')
            xor_map[base] = os.path.join(XOR_DIR, f)

rows = []

for f in sorted(os.listdir(BUNDLE_DIR)):
    if not f.endswith('.se'):
        continue
    path = os.path.join(BUNDLE_DIR, f)
    data = open(path, 'rb').read()
    try:
        header_end = data.index(b'~', data.index(b'~', data.index(b'~') + 1) + 1)
    except ValueError:
        continue
    header = data[:header_end+1].decode('ascii', errors='ignore')
    parts = header.split('~')
    if len(parts) < 3:
        continue
    version = parts[1]
    hexid = parts[2]
    lic20 = binascii.unhexlify(hexid)[:20]
    bin_hdr = data[header_end+1:header_end+1+36]
    key20 = bin_hdr[:20]
    const16 = bin_hdr[20:36]

    base = f.replace('.se', '')
    xor_path = xor_map.get(base)
    postxor = None
    if xor_path and os.path.exists(xor_path):
        postxor = open(xor_path, 'rb').read(36)

    key_xor_lic = bytes([a ^ b for a,b in zip(key20, lic20)])
    pfx20 = postxor[:20] if postxor else None
    pfx36 = postxor[:36] if postxor else None

    rows.append({
        'bundle': f,
        'version': version,
        'lic20': lic20.hex(),
        'key20': key20.hex(),
        'key_xor_lic': key_xor_lic.hex(),
        'postxor_pfx20': pfx20.hex() if pfx20 else '-',
        'postxor_const16': postxor[20:36].hex() if pfx36 else '-',
        'const16': const16.hex(),
        'key_xor_lic_eq_postxor_pfx20': pfx20 is not None and key_xor_lic == pfx20,
        'postxor_const_eq_key_const': pfx36 is not None and postxor[20:36] == const16,
    })

with open(REPORT, 'w', encoding='ascii') as out:
    out.write('# Header key vs post-XOR payload relation\n\n')
    out.write('Checks whether key20 XOR lic20 equals post-XOR payload[0:20], and whether post-XOR[20:36] equals header const16.\n\n')
    out.write('| bundle | version | key^lic == postxor[0:20] | postxor[20:36]==const16 |\n')
    out.write('| --- | --- | --- | --- |\n')
    for r in rows:
        out.write(f"| {r['bundle']} | {r['version']} | {r['key_xor_lic_eq_postxor_pfx20']} | {r['postxor_const_eq_key_const']} |\n")

    out.write('\n## Details\n\n')
    for r in rows:
        out.write(f"### {r['bundle']}\n")
        out.write(f"- version: {r['version']}\n")
        out.write(f"- lic20: {r['lic20']}\n")
        out.write(f"- key20: {r['key20']}\n")
        out.write(f"- key^lic: {r['key_xor_lic']}\n")
        out.write(f"- postxor[0:20]: {r['postxor_pfx20']}\n")
        out.write(f"- const16: {r['const16']}\n")
        out.write(f"- postxor[20:36]: {r['postxor_const16']}\n\n")

print('Wrote', REPORT)
