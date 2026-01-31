import os
import csv
import math
import zlib

ROOT = r"C:\temp\MobileSDK"
DECRYPTED_DIR = os.path.join(ROOT, 'decrypted_bundles')
OUT_CSV = os.path.join(ROOT, 'analysis', 'decrypted_window_stats.csv')
OUT_MD = os.path.join(ROOT, 'analysis', 'decrypted_window_stats.md')

WINDOW = 1024 * 1024


def entropy(data):
    if not data:
        return 0.0
    counts = [0] * 256
    for b in data:
        counts[b] += 1
    n = len(data)
    ent = 0.0
    for c in counts:
        if c == 0:
            continue
        p = c / n
        ent -= p * math.log(p, 2)
    return ent


def ioc(data):
    if not data:
        return 0.0
    counts = [0] * 256
    for b in data:
        counts[b] += 1
    n = len(data)
    return sum((c / n) ** 2 for c in counts)


def chi_square_uniform(data):
    if not data:
        return 0.0
    counts = [0] * 256
    for b in data:
        counts[b] += 1
    n = len(data)
    expected = n / 256.0
    chi = 0.0
    for c in counts:
        diff = c - expected
        chi += (diff * diff) / expected
    return chi


def zlib_ratio(data):
    if not data:
        return 0.0
    comp = zlib.compress(data, 6)
    return len(comp) / len(data)


def window_offsets(n):
    if n <= WINDOW:
        return [0]
    offs = [0, n // 4, n // 2, (3 * n) // 4, n - WINDOW]
    offs = [max(0, min(n - WINDOW, o)) for o in offs]
    seen = set()
    out = []
    for o in offs:
        if o not in seen:
            seen.add(o)
            out.append(o)
    return out

rows = []

if os.path.isdir(DECRYPTED_DIR):
    for f in sorted(os.listdir(DECRYPTED_DIR)):
        if not f.endswith('_decrypted_raw.bin'):
            continue
        path = os.path.join(DECRYPTED_DIR, f)
        data = open(path, 'rb').read()
        n = len(data)
        for off in window_offsets(n):
            chunk = data[off:off + WINDOW]
            rows.append({
                'file': f,
                'offset': off,
                'length': len(chunk),
                'entropy': entropy(chunk),
                'ioc': ioc(chunk),
                'chi_square': chi_square_uniform(chunk),
                'zlib_ratio': zlib_ratio(chunk),
            })

with open(OUT_CSV, 'w', newline='', encoding='ascii') as f:
    if rows:
        w = csv.DictWriter(f, fieldnames=list(rows[0].keys()))
        w.writeheader()
        for r in rows:
            w.writerow(r)

with open(OUT_MD, 'w', encoding='ascii') as out:
    out.write('# Decrypted payload window statistics (1MB windows)\n\n')
    out.write(f'Window size: {WINDOW} bytes. Offsets: 0, 25%, 50%, 75%, last-1MB (deduped).\n\n')
    if not rows:
        out.write('No decrypted_raw payloads found.\n')
    else:
        out.write('| file | offset | length | entropy | ioc | chi_square | zlib_ratio |\n')
        out.write('| --- | --- | --- | --- | --- | --- | --- |\n')
        for r in rows:
            out.write(f"| {r['file']} | {r['offset']} | {r['length']} | {r['entropy']:.5f} | {r['ioc']:.6f} | {r['chi_square']:.2f} | {r['zlib_ratio']:.4f} |\n")

print('Wrote', OUT_CSV)
print('Wrote', OUT_MD)
