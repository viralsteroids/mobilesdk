import argparse
import io
import zipfile
from pathlib import Path

import zstandard as zstd


def try_zip_listing(data):
    if b'PK\x03\x04' not in data and b'PK\x05\x06' not in data:
        return None
    try:
        with zipfile.ZipFile(io.BytesIO(data)) as zf:
            return zf.namelist()
    except Exception:
        return None


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('--in-dir', required=True)
    ap.add_argument('--out-dir', required=True)
    ap.add_argument('--out-md', required=True)
    args = ap.parse_args()

    in_dir = Path(args.in_dir)
    out_dir = Path(args.out_dir)
    out_dir.mkdir(parents=True, exist_ok=True)

    lines = ['# ZSTD decompression results', '']
    for p in sorted(in_dir.glob('*.body')):
        data = p.read_bytes()
        dctx = zstd.ZstdDecompressor()
        try:
            out = dctx.decompress(data)
        except Exception:
            try:
                with dctx.stream_reader(data) as reader:
                    out = reader.read()
            except Exception as exc:
                lines.append(f'## {p.name}')
                lines.append(f'- decompress: failed ({exc})')
                lines.append('')
                continue
        out_path = out_dir / (p.name + '.decompressed')
        out_path.write_bytes(out)
        lines.append(f'## {p.name}')
        lines.append(f'- decompressed_bytes: {len(out)}')
        lines.append(f'- head_magic: {out[:8].hex()}')
        names = try_zip_listing(out)
        if names is not None:
            lines.append(f'- zip_entries: {len(names)}')
            for name in names[:50]:
                lines.append(f'  - {name}')
        lines.append('')

    Path(args.out_md).write_text('\n'.join(lines), encoding='utf-8')


if __name__ == '__main__':
    main()
