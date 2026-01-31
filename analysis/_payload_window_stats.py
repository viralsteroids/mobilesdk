import os
import csv
import math
import zlib

ROOT = r"C:\temp\MobileSDK"
BUNDLE_DIR = os.path.join(ROOT, 'extracted_bundles', 'assets')
POSTXOR_DIR = os.path.join(ROOT, 'offline_xor_out')
OUT_CSV = os.path.join(ROOT, 'analysis', 'payload_window_stats.csv')
OUT_MD = os.path.join(ROOT, 'analysis', 'payload_window_stats.md')

ASCII_HDR_LEN = 59
BIN_HDR_LEN = 36
PAYLOAD_OFFSET = ASCII_HDR_LEN + BIN_HDR_LEN
WINDOW = 1024 * 1024  # 1MB


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
    # clamp
    offs = [max(0, min(n - WINDOW, o)) for o in offs]
    # dedup preserve order
    seen = set()
    out = []
    for o in offs:
        if o not in seen:
            seen.add(o)
            out.append(o)
    return out


def add_rows(rows, name, kind, data):
    n = len(data)
    for off in window_offsets(n):
        chunk = data[off:off + WINDOW]
        rows.append({
            'file': name,
            'kind': kind,
            'offset': off,
            'length': len(chunk),
            'entropy': entropy(chunk),
            'ioc': ioc(chunk),
            'chi_square': chi_square_uniform(chunk),
            'zlib_ratio': zlib_ratio(chunk),
        })

rows = []

if os.path.isdir(BUNDLE_DIR):
    for f in sorted(os.listdir(BUNDLE_DIR)):
        if not f.endswith('.se'):
            continue
        data = open(os.path.join(BUNDLE_DIR, f), 'rb').read()
        if len(data) <= PAYLOAD_OFFSET:
            continue
        payload = data[PAYLOAD_OFFSET:]
        add_rows(rows, f, 'ciphertext_payload', payload)

if os.path.isdir(POSTXOR_DIR):
    for f in sorted(os.listdir(POSTXOR_DIR)):
        if not f.endswith('.bin'):
            continue
        data = open(os.path.join(POSTXOR_DIR, f), 'rb').read()
        if len(data) <= BIN_HDR_LEN:
            continue
        payload = data[BIN_HDR_LEN:]
        add_rows(rows, f, 'postxor_payload', payload)

with open(OUT_CSV, 'w', newline='', encoding='ascii') as f:
    if rows:
        w = csv.DictWriter(f, fieldnames=list(rows[0].keys()))
        w.writeheader()
        for r in rows:
            w.writerow(r)

with open(OUT_MD, 'w', encoding='ascii') as out:
    out.write('# Payload window statistics (1MB windows)\n\n')
    out.write(f'Window size: {WINDOW} bytes. Offsets: 0, 25%, 50%, 75%, last-1MB (deduped).\n\n')
    if not rows:
        out.write('No payloads found.\n')
    else:
        out.write('| file | kind | offset | length | entropy | ioc | chi_square | zlib_ratio |\n')
        out.write('| --- | --- | --- | --- | --- | --- | --- | --- |\n')
        for r in rows:
            out.write(f"| {r['file']} | {r['kind']} | {r['offset']} | {r['length']} | {r['entropy']:.5f} | {r['ioc']:.6f} | {r['chi_square']:.2f} | {r['zlib_ratio']:.4f} |\n")

print('Wrote', OUT_CSV)
print('Wrote', OUT_MD)
