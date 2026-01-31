import csv
import hashlib
import tarfile
from pathlib import Path

import zstandard as zstd


def safe_path(base, rel_path, suffix):
    target = base / rel_path
    if suffix:
        target = target.with_suffix(suffix)
    try:
        target.parent.mkdir(parents=True, exist_ok=True)
        return target
    except OSError:
        # fallback to hashed filename
        h = hashlib.sha1(str(rel_path).encode('utf-8')).hexdigest()[:16]
        target = base / f'hashed_{h}{suffix}'
        target.parent.mkdir(parents=True, exist_ok=True)
        return target


def decompress_zst_to_tar(zst_path, out_tar_path):
    dctx = zstd.ZstdDecompressor()
    with zst_path.open('rb') as fsrc, out_tar_path.open('wb') as fdst:
        with dctx.stream_reader(fsrc) as reader:
            while True:
                chunk = reader.read(1024 * 1024)
                if not chunk:
                    break
                fdst.write(chunk)


def extract_tar(tar_path, out_dir):
    out_dir.mkdir(parents=True, exist_ok=True)
    with tarfile.open(tar_path) as tf:
        tf.extractall(out_dir)
        return len(tf.getmembers())


def main():
    base = Path('analysis/extracted_tar')
    out_root = Path('analysis/nested_tar_all')
    out_root.mkdir(parents=True, exist_ok=True)

    rows = []
    files = sorted(base.rglob('*.tar.zst'))
    for p in files:
        rel = p.relative_to(base)
        bundle = rel.parts[0]
        rel_no_zst = Path(*rel.parts[1:])
        rel_no_zst = rel_no_zst.with_suffix('')  # drop .zst
        rel_no_zst = rel_no_zst.with_suffix('')  # drop .tar

        tar_out = safe_path(out_root / bundle / '_tars', rel_no_zst, '.tar')
        extract_dir = safe_path(out_root / bundle / '_extracted', rel_no_zst, '')

        status = 'ok'
        entry_count = 0
        try:
            if not tar_out.exists():
                decompress_zst_to_tar(p, tar_out)
            if not extract_dir.exists():
                entry_count = extract_tar(tar_out, extract_dir)
            else:
                entry_count = sum(1 for _ in extract_dir.rglob('*') if _.is_file())
        except Exception as exc:
            status = f'error: {exc}'

        rows.append({
            'bundle': bundle,
            'file': str(rel),
            'zst_size': p.stat().st_size,
            'tar_path': str(tar_out),
            'extract_dir': str(extract_dir),
            'entries': entry_count,
            'status': status,
        })

    out_csv = Path('analysis/nested_tar_all.csv')
    out_md = Path('analysis/nested_tar_all.md')
    out_csv.parent.mkdir(parents=True, exist_ok=True)

    with out_csv.open('w', newline='', encoding='utf-8') as f:
        writer = csv.DictWriter(f, fieldnames=['bundle','file','zst_size','tar_path','extract_dir','entries','status'])
        writer.writeheader()
        writer.writerows(rows)

    lines = ['# Nested .tar.zst full extraction', '']
    lines.append(f'- total_files: {len(rows)}')
    lines.append('')
    for row in rows[:50]:
        lines.append(f"- {row['file']} -> {row['extract_dir']} ({row['entries']} entries) [{row['status']}]")
    if len(rows) > 50:
        lines.append(f'- ... ({len(rows)-50} more)')
    out_md.write_text('\n'.join(lines), encoding='utf-8')


if __name__ == '__main__':
    main()
