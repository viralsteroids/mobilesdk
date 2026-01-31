import os
import binascii

ROOT = r"C:\temp\MobileSDK"
BUNDLE_DIR = os.path.join(ROOT, 'extracted_bundles', 'assets')
REPORT = os.path.join(ROOT, 'analysis', 'header_key_xor_analysis.md')

files = []
if os.path.isdir(BUNDLE_DIR):
    for f in os.listdir(BUNDLE_DIR):
        if f.endswith('.se'):
            files.append(os.path.join(BUNDLE_DIR, f))
files.sort()

rows = []
for path in files:
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

    xor = bytes([a ^ b for a,b in zip(key20, lic20)])
    rows.append((os.path.basename(path), version, binascii.hexlify(lic20).decode('ascii'), key20.hex(), xor.hex()))

with open(REPORT, 'w', encoding='ascii') as out:
    out.write('# Header key XOR analysis\n\n')
    out.write('Computed key20 XOR license_hash20 (first 20 bytes of hexid).\n\n')
    out.write('| bundle | version | lic20 | key20 | key^lic |\n')
    out.write('| --- | --- | --- | --- | --- |\n')
    for row in rows:
        out.write(f'| {row[0]} | {row[1]} | {row[2]} | {row[3]} | {row[4]} |\n')

print('Wrote', REPORT)
