import os
import csv
import bz2

ROOT = r"C:\temp\MobileSDK"
MAGIC_CSV = os.path.join(ROOT, 'analysis', 'extra_magic_scan.csv')
REPORT = os.path.join(ROOT, 'analysis', 'bzip2_extract_report.md')

paths = {}
# resolve file names to actual path
for base in [os.path.join(ROOT, 'offline_xor_out'), os.path.join(ROOT, 'decrypted_bundles')]:
    if not os.path.isdir(base):
        continue
    for f in os.listdir(base):
        if f.endswith('.bin'):
            paths[f] = os.path.join(base, f)

attempts = []
with open(MAGIC_CSV, newline='', encoding='ascii') as f:
    r = csv.reader(f)
    next(r, None)
    for row in r:
        if not row:
            continue
        fname, size, magic, offset = row
        if magic != 'bzip2':
            continue
        offset = int(offset)
        path = paths.get(fname)
        if not path or not os.path.exists(path):
            attempts.append((fname, offset, 'missing', 0, None))
            continue
        data = open(path, 'rb').read()
        chunk = data[offset:]
        try:
            out = bz2.decompress(chunk)
            if len(out) > 1024 * 1024:
                out = out[:1024*1024]
            sample = out[:64]
            attempts.append((fname, offset, 'ok', len(out), sample))
        except Exception as e:
            attempts.append((fname, offset, f'error:{e}', 0, None))

with open(REPORT, 'w', encoding='ascii') as out:
    out.write('# bzip2 extraction report\n\n')
    if not attempts:
        out.write('No bzip2 offsets to test.\n')
    else:
        out.write('| file | offset | status | out_bytes | sample_hex | sample_ascii |\n')
        out.write('| --- | --- | --- | --- | --- | --- |\n')
        for fname, offset, status, out_bytes, sample in attempts:
            if sample is None:
                sample_hex = '-'
                sample_ascii = '-'
            else:
                sample_hex = sample.hex()
                sample_ascii = ''.join(chr(b) if 32 <= b < 127 else '.' for b in sample)
            out.write(f'| {fname} | {offset} | {status} | {out_bytes} | {sample_hex} | {sample_ascii} |\n')

print('Wrote', REPORT)
