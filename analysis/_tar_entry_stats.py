import csv
import os
import tarfile
from pathlib import Path
from collections import Counter, defaultdict

BASE = Path(__file__).resolve().parents[1]
input_dir = BASE / 'analysis' / 'decompressed_bodies'

entries = []
per_bundle = {}
ext_counts = Counter()
ext_sizes = Counter()

for tar_path in sorted(input_dir.glob('*.decompressed')):
    bundle = tar_path.name
    total_size = 0
    file_count = 0
    try:
        with tarfile.open(tar_path, 'r:*') as tf:
            for m in tf.getmembers():
                # normalize type
                if m.isfile():
                    typ = 'file'
                elif m.isdir():
                    typ = 'dir'
                elif m.issym():
                    typ = 'symlink'
                elif m.islnk():
                    typ = 'hardlink'
                else:
                    typ = 'other'

                size = m.size if m.isfile() else 0
                if m.isfile():
                    file_count += 1
                    total_size += size

                # extension stats
                name = m.name
                ext = ''
                base = name.rsplit('/', 1)[-1]
                if '.' in base and not base.startswith('.') and base != '.':
                    ext = base.rsplit('.', 1)[-1].lower()
                ext_counts[ext] += 1
                if size:
                    ext_sizes[ext] += size

                entries.append({
                    'bundle': bundle,
                    'path': name,
                    'type': typ,
                    'size': size,
                    'ext': ext,
                })
    except tarfile.TarError as e:
        entries.append({
            'bundle': bundle,
            'path': '',
            'type': 'error',
            'size': 0,
            'ext': '',
            'error': str(e),
        })
        per_bundle[bundle] = {'file_count': 0, 'total_size': 0, 'error': str(e)}
        continue

    per_bundle[bundle] = {'file_count': file_count, 'total_size': total_size}

# write per-entry CSV
out_csv = BASE / 'analysis' / 'tar_entry_stats.csv'
with out_csv.open('w', newline='') as f:
    fieldnames = ['bundle', 'path', 'type', 'size', 'ext']
    w = csv.DictWriter(f, fieldnames=fieldnames)
    w.writeheader()
    for e in entries:
        w.writerow({k: e.get(k, '') for k in fieldnames})

# markdown summary
lines = []
lines.append('# TAR entry stats')
lines.append('')
lines.append('Summary of entries and sizes across decompressed TAR bundles.')
lines.append('')
lines.append('## Per-bundle totals')
lines.append('')
lines.append('| bundle | file_count | total_size |')
lines.append('| --- | --- | --- |')
for bundle, stats in per_bundle.items():
    if 'error' in stats:
        lines.append(f"| {bundle} | 0 | 0 |")
    else:
        lines.append(f"| {bundle} | {stats['file_count']} | {stats['total_size']} |")

lines.append('')
lines.append('## Top extensions (by count)')
lines.append('')
lines.append('| ext | count | total_size |')
lines.append('| --- | --- | --- |')
for ext, count in ext_counts.most_common(20):
    lines.append(f"| {ext or '(none)'} | {count} | {ext_sizes.get(ext, 0)} |")

# Top largest entries
largest = sorted([e for e in entries if e['type'] == 'file'], key=lambda x: x['size'], reverse=True)[:20]
lines.append('')
lines.append('## Top 20 largest files')
lines.append('')
lines.append('| bundle | path | size | ext |')
lines.append('| --- | --- | --- | --- |')
for e in largest:
    lines.append(f"| {e['bundle']} | {e['path']} | {e['size']} | {e['ext'] or '(none)'} |")

out_md = BASE / 'analysis' / 'tar_entry_stats.md'
out_md.write_text('\n'.join(lines), encoding='utf-8')
print('Wrote', out_csv, out_md)
