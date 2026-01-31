import csv
import tarfile
from pathlib import Path

import zstandard as zstd


def decompress_zst_to_tar(zst_path, out_tar_path):
    dctx = zstd.ZstdDecompressor()
    with zst_path.open('rb') as fsrc, out_tar_path.open('wb') as fdst:
        with dctx.stream_reader(fsrc) as reader:
            while True:
                chunk = reader.read(1024 * 1024)
                if not chunk:
                    break
                fdst.write(chunk)


def list_tar_entries(tar_path, max_entries=50):
    try:
        with tarfile.open(tar_path) as tf:
            names = [m.name for m in tf.getmembers()]
    except Exception:
        return None
    return names[:max_entries], len(names)


def main():
    base = Path('analysis/extracted_tar')
    out_dir = Path('analysis/nested_tar')
    out_dir.mkdir(parents=True, exist_ok=True)
    rows = []

    max_size_mb = 5
    max_files = 20
    processed = 0

    files = sorted(base.rglob('*.tar.zst'), key=lambda p: p.stat().st_size)
    for p in files:
        size_mb = p.stat().st_size / (1024 * 1024)
        if size_mb > max_size_mb:
            continue
        bundle = p.parts[p.parts.index('extracted_tar') + 1]
        out_tar = out_dir / (p.name + '.tar')
        try:
            decompress_zst_to_tar(p, out_tar)
            entries, total = list_tar_entries(out_tar)
            rows.append({
                'bundle': bundle,
                'file': str(p.relative_to(base)),
                'zst_size': p.stat().st_size,
                'tar_size': out_tar.stat().st_size if out_tar.exists() else 0,
                'entry_count': total if entries is not None else '',
                'entries_preview': ';'.join(entries) if entries is not None else '',
            })
        except Exception:
            rows.append({
                'bundle': bundle,
                'file': str(p.relative_to(base)),
                'zst_size': p.stat().st_size,
                'tar_size': 0,
                'entry_count': '',
                'entries_preview': 'error',
            })
        processed += 1
        if processed >= max_files:
            break

    out_csv = Path('analysis/nested_tar_sample.csv')
    out_md = Path('analysis/nested_tar_sample.md')
    with out_csv.open('w', newline='', encoding='utf-8') as f:
        writer = csv.DictWriter(f, fieldnames=['bundle','file','zst_size','tar_size','entry_count','entries_preview'])
        writer.writeheader()
        writer.writerows(rows)

    lines = ['# Nested .tar.zst sample (small files)', '']
    lines.append(f'- max_size_mb: {max_size_mb}, max_files: {max_files}')
    lines.append(f'- processed: {processed}')
    lines.append('')
    for row in rows:
        lines.append(f"## {row['file']}")
        lines.append(f"- bundle: {row['bundle']}")
        lines.append(f"- zst_size: {row['zst_size']} tar_size: {row['tar_size']} entry_count: {row['entry_count']}")
        if row['entries_preview']:
            lines.append(f"- entries_preview: {row['entries_preview']}")
        lines.append('')
    out_md.write_text('\n'.join(lines), encoding='utf-8')


if __name__ == '__main__':
    main()
