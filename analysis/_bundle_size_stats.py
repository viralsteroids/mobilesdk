import csv
import os
from pathlib import Path

BASE = Path(__file__).resolve().parents[1]
assets_dir = BASE / 'extracted_bundles' / 'assets'
decrypted_dir = BASE / 'analysis' / 'decrypted_bodies'
decompressed_dir = BASE / 'analysis' / 'decompressed_bodies'

rows = []
for se_path in sorted(assets_dir.glob('*.se')):
    name = se_path.name
    dec_body = decrypted_dir / f"{name}.body"
    decomp = decompressed_dir / f"{name}.body.decompressed"
    se_size = se_path.stat().st_size if se_path.exists() else None
    dec_size = dec_body.stat().st_size if dec_body.exists() else None
    decomp_size = decomp.stat().st_size if decomp.exists() else None

    ratio_dec_to_decomp = None
    ratio_decomp_to_dec = None
    ratio_se_to_decomp = None
    if dec_size and decomp_size:
        ratio_dec_to_decomp = dec_size / decomp_size
        ratio_decomp_to_dec = decomp_size / dec_size
    if se_size and decomp_size:
        ratio_se_to_decomp = se_size / decomp_size

    rows.append({
        'bundle': name,
        'se_size': se_size,
        'decrypted_body_size': dec_size,
        'decompressed_tar_size': decomp_size,
        'ratio_decrypted_to_decompressed': ratio_dec_to_decomp,
        'ratio_decompressed_to_decrypted': ratio_decomp_to_dec,
        'ratio_se_to_decompressed': ratio_se_to_decomp,
    })

out_csv = BASE / 'analysis' / 'bundle_size_stats.csv'
with out_csv.open('w', newline='') as f:
    w = csv.DictWriter(f, fieldnames=rows[0].keys())
    w.writeheader()
    for r in rows:
        w.writerow(r)

# Markdown summary
lines = []
lines.append('# Bundle size stats')
lines.append('')
lines.append('Per-bundle sizes and compression ratios.')
lines.append('')
lines.append('| bundle | se_size | decrypted_body_size | decompressed_tar_size | dec/decomp | decomp/dec | se/decomp |')
lines.append('| --- | --- | --- | --- | --- | --- | --- |')
for r in rows:
    lines.append('| {bundle} | {se_size} | {decrypted_body_size} | {decompressed_tar_size} | {ratio_decrypted_to_decompressed:.4f} | {ratio_decompressed_to_decrypted:.4f} | {ratio_se_to_decompressed:.6f} |'.format(**r))

# Aggregate stats
sizes_dec = [r['decrypted_body_size'] for r in rows if r['decrypted_body_size']]
sizes_decomp = [r['decompressed_tar_size'] for r in rows if r['decompressed_tar_size']]
if sizes_dec and sizes_decomp:
    import statistics
    lines.append('')
    lines.append('## Aggregate')
    lines.append('')
    lines.append(f"decrypted_body_size: min={min(sizes_dec)}, max={max(sizes_dec)}, mean={statistics.mean(sizes_dec):.2f}")
    lines.append(f"decompressed_tar_size: min={min(sizes_decomp)}, max={max(sizes_decomp)}, mean={statistics.mean(sizes_decomp):.2f}")

out_md = BASE / 'analysis' / 'bundle_size_stats.md'
out_md.write_text('\n'.join(lines), encoding='utf-8')

print('Wrote', out_csv, out_md)
