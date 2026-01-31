import json
import tarfile
from collections import Counter, defaultdict
from pathlib import Path

ROOT = Path(r'C:\temp\MobileSDK')
TAR_DIR = ROOT / 'analysis' / 'decompressed_bodies'
MANIFEST_DIR = ROOT / 'analysis' / 'manifests'
OUT_MD = ROOT / 'analysis' / 'decompressed_tar_content_scan.md'

if not TAR_DIR.exists():
    raise SystemExit(f'Missing {TAR_DIR}')

report = []

ext_counter = Counter()
per_tar = []
compressed_hits = defaultdict(list)

for tar_path in sorted(TAR_DIR.glob('*.decompressed')):
    try:
        with tarfile.open(tar_path, 'r:*') as tf:
            members = tf.getmembers()
            total_size = sum(m.size for m in members)
            exts = Counter()
            nested = []
            for m in members:
                name = m.name
                suffix = Path(name).suffix.lower()
                if suffix:
                    exts[suffix] += 1
                    ext_counter[suffix] += 1
                lower = name.lower()
                if lower.endswith(('.tar.zst', '.tar.zstd', '.zst', '.zstd', '.zstdict', '.dict')):
                    nested.append(name)
                    compressed_hits[tar_path.name].append(name)
            per_tar.append((tar_path.name, len(members), total_size, exts, nested))
    except tarfile.ReadError:
        per_tar.append((tar_path.name, 0, 0, Counter(), ['<not a tar>']))

# Scan manifests for dictionary/codec hints
manifest_hits = []
if MANIFEST_DIR.exists():
    for p in sorted(MANIFEST_DIR.glob('*.json')):
        text = p.read_text(encoding='utf-8', errors='ignore')
        lower = text.lower()
        hits = []
        for key in ('zstd', 'zst', 'dict', 'dictionary', 'tar.zst', '.zst'):
            if key in lower:
                hits.append(key)
        if hits:
            manifest_hits.append((p.name, sorted(set(hits))))

with OUT_MD.open('w', encoding='ascii', errors='ignore') as md:
    md.write('# Decompressed TAR content scan\n\n')
    md.write(f'Source dir: {TAR_DIR}\n\n')
    md.write('## Per-TAR summary\n')
    if not per_tar:
        md.write('- No decompressed TAR files found.\n')
    else:
        md.write('| tar | entries | total_size | notable nested compressed assets |\n')
        md.write('| --- | --- | --- | --- |\n')
        for name, count, total_size, _, nested in per_tar:
            nested_str = ', '.join(nested) if nested else '-'
            md.write(f'| {name} | {count} | {total_size} | {nested_str} |\n')

    md.write('\n## Extension counts (all TARs)\n')
    if ext_counter:
        md.write('| ext | count |\n')
        md.write('| --- | --- |\n')
        for ext, cnt in ext_counter.most_common():
            md.write(f'| {ext} | {cnt} |\n')
    else:
        md.write('- No file extensions detected.\n')

    md.write('\n## Manifest hints\n')
    if manifest_hits:
        md.write('| manifest | hits |\n')
        md.write('| --- | --- |\n')
        for name, hits in manifest_hits:
            md.write(f'| {name} | {", ".join(hits)} |\n')
    else:
        md.write('- No manifest references to zstd/dictionary keywords found.\n')

    md.write('\n## Notes\n')
    md.write('- This scan only inspects tar entry names and manifest keyword hits; it does not parse nested archives.\n')

print(f'Wrote {OUT_MD}')
