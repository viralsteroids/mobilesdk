import os
import csv
import math
import zlib

ROOT = r"C:\temp\MobileSDK"
DECRYPTED_DIR = os.path.join(ROOT, 'decrypted_bundles')
OUT_CSV = os.path.join(ROOT, 'analysis', 'decrypted_stat_extended.csv')
OUT_MD = os.path.join(ROOT, 'analysis', 'decrypted_stat_extended.md')

SAMPLE_SIZE = 4 * 1024 * 1024


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


def serial_corr(data, lag):
    n = len(data)
    if n <= lag:
        return 0.0
    mean = sum(data) / n
    num = 0.0
    den = 0.0
    for i in range(n - lag):
        a = data[i] - mean
        b = data[i + lag] - mean
        num += a * b
    for i in range(n):
        a = data[i] - mean
        den += a * a
    return num / den if den != 0 else 0.0


def zlib_ratio_sample(data, sample_size=SAMPLE_SIZE):
    if not data:
        return 0.0
    sample = data[:min(len(data), sample_size)]
    comp = zlib.compress(sample, 6)
    return len(comp) / len(sample)


def add_row(rows, name, data):
    sample = data[:min(len(data), SAMPLE_SIZE)]
    rows.append({
        'file': name,
        'length': len(data),
        'sample_len': len(sample),
        'entropy': entropy(sample),
        'ioc': ioc(sample),
        'chi_square': chi_square_uniform(sample),
        'corr_lag1': serial_corr(sample, 1),
        'corr_lag2': serial_corr(sample, 2),
        'corr_lag4': serial_corr(sample, 4),
        'corr_lag8': serial_corr(sample, 8),
        'corr_lag16': serial_corr(sample, 16),
        'corr_lag32': serial_corr(sample, 32),
        'zlib_ratio_sample_4m': zlib_ratio_sample(sample),
    })

rows = []

if os.path.isdir(DECRYPTED_DIR):
    for f in sorted(os.listdir(DECRYPTED_DIR)):
        if not f.endswith('_decrypted_raw.bin'):
            continue
        data = open(os.path.join(DECRYPTED_DIR, f), 'rb').read()
        add_row(rows, f, data)

with open(OUT_CSV, 'w', newline='', encoding='ascii') as f:
    if rows:
        w = csv.DictWriter(f, fieldnames=list(rows[0].keys()))
        w.writeheader()
        for r in rows:
            w.writerow(r)

with open(OUT_MD, 'w', encoding='ascii') as out:
    out.write('# Decrypted payload statistical tests (sampled)\n\n')
    out.write(f'Sample size: {SAMPLE_SIZE} bytes (per file, from start).\n\n')
    if not rows:
        out.write('No decrypted_raw payloads found.\n')
    else:
        out.write('| file | length | sample_len | entropy | ioc | chi_square | corr1 | corr2 | corr4 | corr8 | corr16 | corr32 | zlib_ratio_sample_4m |\n')
        out.write('| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |\n')
        for r in rows:
            out.write(f"| {r['file']} | {r['length']} | {r['sample_len']} | {r['entropy']:.5f} | {r['ioc']:.6f} | {r['chi_square']:.2f} | {r['corr_lag1']:.6f} | {r['corr_lag2']:.6f} | {r['corr_lag4']:.6f} | {r['corr_lag8']:.6f} | {r['corr_lag16']:.6f} | {r['corr_lag32']:.6f} | {r['zlib_ratio_sample_4m']:.4f} |\n")

print('Wrote', OUT_CSV)
print('Wrote', OUT_MD)
