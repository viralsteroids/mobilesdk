import io
import json
import tarfile
import zipfile
from pathlib import Path


def try_tar_listing(data):
    try:
        with tarfile.open(fileobj=io.BytesIO(data)) as tf:
            return [m.name for m in tf.getmembers()]
    except Exception:
        return None


def try_zip_listing(data):
    try:
        with zipfile.ZipFile(io.BytesIO(data)) as zf:
            return zf.namelist()
    except Exception:
        return None


def main():
    in_dir = Path('analysis/decompressed_bodies')
    out_md = Path('analysis/decompressed_body_inspection.md')
    lines = ['# Decompressed body inspection', '']
    for p in sorted(in_dir.glob('*.decompressed')):
        data = p.read_bytes()
        lines.append(f'## {p.name}')
        lines.append(f'- size: {len(data)}')
        lines.append(f'- head_ascii: {data[:64].decode("utf-8", errors="replace")}')
        tar_names = try_tar_listing(data)
        if tar_names is not None:
            lines.append(f'- tar_entries: {len(tar_names)}')
            for name in tar_names[:50]:
                lines.append(f'  - {name}')
        else:
            zip_names = try_zip_listing(data)
            if zip_names is not None:
                lines.append(f'- zip_entries: {len(zip_names)}')
                for name in zip_names[:50]:
                    lines.append(f'  - {name}')
        lines.append('')
    out_md.write_text('\n'.join(lines), encoding='utf-8')


if __name__ == '__main__':
    main()
