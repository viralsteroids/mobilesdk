import tarfile
from pathlib import Path


def main():
    src = Path('analysis/decompressed_bodies')
    out_root = Path('analysis/extracted_tar')
    out_root.mkdir(parents=True, exist_ok=True)
    report = []
    report.append('# TAR extraction summary')
    report.append('')
    for tar_path in sorted(src.glob('*.decompressed')):
        bundle_name = tar_path.name.replace('.se.body.decompressed', '')
        out_dir = out_root / bundle_name
        out_dir.mkdir(parents=True, exist_ok=True)
        report.append(f'## {bundle_name}')
        try:
            with tarfile.open(tar_path) as tf:
                tf.extractall(out_dir)
                report.append(f'- extracted_to: {out_dir}')
                report.append(f'- entries: {len(tf.getmembers())}')
        except Exception as exc:
            report.append(f'- error: {exc}')
        report.append('')
    Path('analysis/tar_extraction_summary.md').write_text('\n'.join(report), encoding='utf-8')


if __name__ == '__main__':
    main()
