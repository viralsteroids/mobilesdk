import os
import struct

ROOT = r"C:\temp\MobileSDK"
LIB = os.path.join(ROOT, 'SmartEngines_full', 'lib', 'arm64-v8a', 'libjnimultiengine.so')
REPORT = os.path.join(ROOT, 'analysis', 'sha1_constants_scan.md')

SHA1_IV = [0x67452301, 0xEFCDAB89, 0x98BADCFE, 0x10325476, 0xC3D2E1F0]
SHA1_K = [0x5A827999, 0x6ED9EBA1, 0x8F1BBCDC, 0xCA62C1D6]

blob = open(LIB, 'rb').read()

hits = []

# Search IV sequence in little-endian 32-bit words
iv_bytes = b''.join(struct.pack('<I', x) for x in SHA1_IV)
start = 0
while True:
    idx = blob.find(iv_bytes, start)
    if idx == -1:
        break
    hits.append(('sha1_iv_seq', idx, len(iv_bytes)))
    start = idx + 1

# Search each K constant individually (LE)
for k in SHA1_K:
    pat = struct.pack('<I', k)
    start = 0
    while True:
        idx = blob.find(pat, start)
        if idx == -1:
            break
        hits.append((f'sha1_k_{k:08x}', idx, 4))
        start = idx + 1

# Write report
with open(REPORT, 'w', encoding='ascii') as out:
    out.write('# SHA1 constants scan (libjnimultiengine.so)\n\n')
    out.write(f'File: {LIB}\n\n')
    if not hits:
        out.write('No SHA1 IV sequence or K constants found.\n')
    else:
        out.write('| pattern | file_offset | length |\n')
        out.write('| --- | --- | --- |\n')
        for name, idx, length in hits:
            out.write(f'| {name} | 0x{idx:x} | {length} |\n')

print('Wrote', REPORT)
