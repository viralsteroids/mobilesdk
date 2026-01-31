import csv
import os
import ast
import zlib

BASE = os.path.dirname(os.path.abspath(__file__))
ROOT = os.path.dirname(BASE)
CSV_PATH = os.path.join(ROOT, '_offline_layer2_probe.csv')
BUNDLE_DIR = os.path.join(ROOT, 'offline_xor_out')
REPORT_PATH = os.path.join(BASE, 'stream_extract_sliding_report.md')

WINDOW = 16  # +/- bytes to slide
OUT_LIMIT = 256 * 1024


def parse_zip_list(field):
    # field like "[('zip', 1584141)]" or "[]"
    try:
        val = ast.literal_eval(field)
        if isinstance(val, list):
            return val
    except Exception:
        return []
    return []


def parse_magic_list(field):
    # field like "[(21300, 'zlib'), ...]"
    try:
        val = ast.literal_eval(field)
        if isinstance(val, list):
            return val
    except Exception:
        return []
    return []


def decompress_try(data, mode):
    if mode == 'gzip':
        return zlib.decompress(data, wbits=16 + zlib.MAX_WBITS)
    if mode == 'zlib':
        return zlib.decompress(data, wbits=zlib.MAX_WBITS)
    if mode == 'raw':
        return zlib.decompress(data, wbits=-zlib.MAX_WBITS)
    raise ValueError(mode)


rows = []
with open(CSV_PATH, newline='', encoding='utf-8') as f:
    reader = csv.reader(f)
    header = next(reader, None)
    for row in reader:
        if not row:
            continue
        # columns: filename,size,sha256,entropy..., magic_hits, gzip_hits?, zip_hits
        # magic_hits is at index 11, zip_hits last
        fname = row[0]
        magic_hits = parse_magic_list(row[11]) if len(row) > 11 else []
        zip_hits = parse_zip_list(row[-1]) if row else []
        offsets = [off for off, _ in magic_hits]
        rows.append((fname, offsets, zip_hits))

results = []
for fname, offsets, zip_hits in rows:
    path = os.path.join(BUNDLE_DIR, fname)
    if not os.path.exists(path):
        # fallback: try in root
        alt = os.path.join(ROOT, fname)
        if os.path.exists(alt):
            path = alt
        else:
            results.append((fname, None, None, 'missing', 0, None))
            continue
    with open(path, 'rb') as f:
        data = f.read()
    for off in offsets:
        found = False
        for delta in range(-WINDOW, WINDOW + 1):
            cur = off + delta
            if cur < 0 or cur >= len(data):
                continue
            chunk = data[cur:]
            for mode in ('gzip', 'zlib', 'raw'):
                try:
                    out = decompress_try(chunk, mode)
                    if len(out) > OUT_LIMIT:
                        out = out[:OUT_LIMIT]
                    sample = out[:64]
                    results.append((fname, off, cur, f'{mode}:ok', len(out), sample))
                    found = True
                    break
                except Exception:
                    continue
            if found:
                break
        if not found:
            results.append((fname, off, None, 'no_success', 0, None))

with open(REPORT_PATH, 'w', encoding='utf-8') as f:
    f.write('# Sliding stream extract report\n\n')
    f.write(f'Window: +/-{WINDOW} bytes, output cap {OUT_LIMIT} bytes.\n\n')
    f.write('| file | hint_offset | found_offset | status | out_bytes | sample_hex | sample_ascii |\n')
    f.write('| --- | --- | --- | --- | --- | --- | --- |\n')
    for fname, hint, found_off, status, out_bytes, sample in results:
        if sample is None:
            sample_hex = '-'
            sample_ascii = '-'
        else:
            sample_hex = sample.hex()
            sample_ascii = ''.join(chr(b) if 32 <= b < 127 else '.' for b in sample)
        f.write(f'| {os.path.basename(fname)} | {hint} | {found_off} | {status} | {out_bytes} | {sample_hex} | {sample_ascii} |\n')

print('Wrote', REPORT_PATH)
