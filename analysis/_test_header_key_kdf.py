import os
import hashlib
import binascii

ROOT = r"C:\temp\MobileSDK"
BUNDLE_DIR = os.path.join(ROOT, 'extracted_bundles', 'assets')
REPORT = os.path.join(ROOT, 'analysis', 'header_key_kdf_hypotheses.md')

files = []
if os.path.isdir(BUNDLE_DIR):
    for f in os.listdir(BUNDLE_DIR):
        if f.endswith('.se'):
            files.append(os.path.join(BUNDLE_DIR, f))
files.sort()

# Candidate input builders

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
}

# combinations to test: base1 + base2 and base2 + base1
pairs = []
base_keys = list(bases.keys())
for i in range(len(base_keys)):
    for j in range(len(base_keys)):
        if i == j:
            continue
        pairs.append((base_keys[i], base_keys[j]))

# also test base + constant (16-byte header const) and base + licensehash tail 0x10
CONST16 = bytes.fromhex('76f6f2fb17591a73192c515d55b72060')
TAIL10 = bytes([0x10])

results = []

for path in files:
    data = open(path, 'rb').read()
    # parse ASCII header
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
    # single bases
    for name, fn in bases.items():
        try:
            h = hashlib.sha1(fn(header, version, hexid)).digest().hex()
        except Exception:
            continue
        if h == key20_hex:
            matches.append(f'sha1({name})')

    # pair concatenations
    for a,b in pairs:
        try:
            inp = bases[a](header, version, hexid) + bases[b](header, version, hexid)
            h = hashlib.sha1(inp).digest().hex()
        except Exception:
            continue
        if h == key20_hex:
            matches.append(f'sha1({a}+{b})')

    # base + const16
    for name, fn in bases.items():
        try:
            inp = fn(header, version, hexid) + CONST16
            h = hashlib.sha1(inp).digest().hex()
        except Exception:
            continue
        if h == key20_hex:
            matches.append(f'sha1({name}+const16)')

    # base + tail 0x10
    for name, fn in bases.items():
        try:
            inp = fn(header, version, hexid) + TAIL10
            h = hashlib.sha1(inp).digest().hex()
        except Exception:
            continue
        if h == key20_hex:
            matches.append(f'sha1({name}+0x10)')

    # sha1(hexid_bytes + version_ascii)
    try:
        h = hashlib.sha1(b_hexid_bytes(header, version, hexid) + b_version_ascii(header, version, hexid)).digest().hex()
        if h == key20_hex:
            matches.append('sha1(hexid_bytes+version_ascii)')
    except Exception:
        pass

    results.append((os.path.basename(path), version, hexid, key20_hex, matches))

with open(REPORT, 'w', encoding='ascii') as out:
    out.write('# Header key KDF hypotheses (SHA1 combos)\n\n')
    out.write('Tested SHA1 on concatenations of hexid/version/header, plus const16 and tail 0x10.\n\n')
    out.write('| bundle | version | hexid | key20 | matches |\n')
    out.write('| --- | --- | --- | --- | --- |\n')
    for name, ver, hexid, keyhex, matches in results:
        out.write(f'| {name} | {ver} | {hexid} | {keyhex} | {", ".join(matches) if matches else "-"} |\n')

print('Wrote', REPORT)
