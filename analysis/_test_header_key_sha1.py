import os
import hashlib
import binascii

ROOT = r"C:\temp\MobileSDK"
BUNDLE_DIR = os.path.join(ROOT, 'extracted_bundles', 'assets')
REPORT = os.path.join(ROOT, 'analysis', 'header_key_sha1_report.md')

candidates = [
    ('hexid_ascii', lambda hdr, ver, hexid: hexid.encode('ascii')),
    ('hexid_bytes', lambda hdr, ver, hexid: binascii.unhexlify(hexid)),
    ('version_ascii', lambda hdr, ver, hexid: ver.encode('ascii')),
    ('header_ascii', lambda hdr, ver, hexid: hdr.encode('ascii')),
]

files = []
if os.path.isdir(BUNDLE_DIR):
    for f in os.listdir(BUNDLE_DIR):
        if f.endswith('.se'):
            files.append(os.path.join(BUNDLE_DIR, f))
files.sort()

rows = []

for path in files:
    data = open(path, 'rb').read()
    # parse ASCII header: 'sebundle1~<version>~<hexid>~'
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
    # binary header starts immediately after ASCII header
    bin_hdr = data[header_end+1:header_end+1+36]
    key20 = bin_hdr[:20]
    key20_hex = key20.hex()

    match = None
    for name, fn in candidates:
        try:
            h = hashlib.sha1(fn(header, version, hexid)).digest().hex()
        except Exception:
            continue
        if h == key20_hex:
            match = name
            break

    rows.append((os.path.basename(path), version, hexid, key20_hex, match))

with open(REPORT, 'w', encoding='ascii') as out:
    out.write('# Header key SHA1 tests\n\n')
    out.write('Tested if 20-byte key equals SHA1 of: hexid_ascii, hexid_bytes, version_ascii, header_ascii.\n\n')
    if not rows:
        out.write('No .se bundles parsed.\n')
    else:
        out.write('| bundle | version | hexid | key20 | sha1_match |\n')
        out.write('| --- | --- | --- | --- | --- |\n')
        for row in rows:
            out.write(f'| {row[0]} | {row[1]} | {row[2]} | {row[3]} | {row[4] or "-"} |\n')

print('Wrote', REPORT)
