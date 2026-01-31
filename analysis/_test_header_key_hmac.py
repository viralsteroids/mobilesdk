import os
import hmac
import hashlib
import binascii

ROOT = r"C:\temp\MobileSDK"
BUNDLE_DIR = os.path.join(ROOT, 'extracted_bundles', 'assets')
REPORT = os.path.join(ROOT, 'analysis', 'header_key_hmac_hypotheses.md')

files = []
if os.path.isdir(BUNDLE_DIR):
    for f in os.listdir(BUNDLE_DIR):
        if f.endswith('.se'):
            files.append(os.path.join(BUNDLE_DIR, f))
files.sort()

CONST16 = bytes.fromhex('76f6f2fb17591a73192c515d55b72060')
TAIL10 = bytes([0x10])

# Candidate builders

def b_hexid_ascii(hdr, ver, hexid):
    return hexid.encode('ascii')

def b_hexid_bytes(hdr, ver, hexid):
    return binascii.unhexlify(hexid)

def b_version_ascii(hdr, ver, hexid):
    return ver.encode('ascii')

def b_header_ascii(hdr, ver, hexid):
    return hdr.encode('ascii')

bases = {
    'hexid_ascii': b_hexid_ascii,
    'hexid_bytes': b_hexid_bytes,
    'version_ascii': b_version_ascii,
    'header_ascii': b_header_ascii,
    'const16': lambda h, v, x: CONST16,
}

# message candidates
msgs = [
    ('version_ascii', b_version_ascii),
    ('hexid_ascii', b_hexid_ascii),
    ('hexid_bytes', b_hexid_bytes),
    ('header_ascii', b_header_ascii),
    ('version+const16', lambda h, v, x: b_version_ascii(h, v, x) + CONST16),
    ('header+const16', lambda h, v, x: b_header_ascii(h, v, x) + CONST16),
    ('hexid_bytes+const16', lambda h, v, x: b_hexid_bytes(h, v, x) + CONST16),
    ('version+tail10', lambda h, v, x: b_version_ascii(h, v, x) + TAIL10),
]

results = []

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
    bin_hdr = data[header_end+1:header_end+1+36]
    key20 = bin_hdr[:20]
    key20_hex = key20.hex()

    matches = []
    for kname, kfn in bases.items():
        for mname, mfn in msgs:
            try:
                key = kfn(header, version, hexid)
                msg = mfn(header, version, hexid)
            except Exception:
                continue
            try:
                h = hmac.new(key, msg, hashlib.sha1).digest().hex()
            except Exception:
                continue
            if h == key20_hex:
                matches.append(f'hmac_sha1(key={kname}, msg={mname})')

    results.append((os.path.basename(path), version, hexid, key20_hex, matches))

with open(REPORT, 'w', encoding='ascii') as out:
    out.write('# Header key HMAC-SHA1 hypotheses\n\n')
    out.write('Tested HMAC-SHA1 with key candidates (hexid/version/header/const16) and message candidates (version/hexid/header + const16/tail).\n\n')
    out.write('| bundle | version | hexid | key20 | matches |\n')
    out.write('| --- | --- | --- | --- | --- |\n')
    for name, ver, hexid, keyhex, matches in results:
        out.write(f'| {name} | {ver} | {hexid} | {keyhex} | {", ".join(matches) if matches else "-"} |\n')

print('Wrote', REPORT)
