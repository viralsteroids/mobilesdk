import json
import tarfile
from pathlib import Path

TARGET_NAMES = {
    'smartid.json',
    'sdr.json',
    'bundle_textengine.json',
}


def main():
    in_dir = Path('analysis/decompressed_bodies')
    out_dir = Path('analysis/manifests')
    out_dir.mkdir(parents=True, exist_ok=True)
    report = []
    report.append('# Manifest extraction from TAR bundles')
    report.append('')

    for tar_path in sorted(in_dir.glob('*.decompressed')):
        report.append(f'## {tar_path.name}')
        report.append(f'- size: {tar_path.stat().st_size}')
        found = []
        try:
            with tarfile.open(tar_path) as tf:
                members = tf.getmembers()
                report.append(f'- entries: {len(members)}')
                for m in members:
                    name = m.name
                    if name in TARGET_NAMES or name.endswith('.json') and name.startswith('bundle_'):
                        found.append(name)
                        try:
                            f = tf.extractfile(m)
                            if f:
                                data = f.read()
                                (out_dir / (tar_path.name + '__' + name.replace('/', '_'))).write_bytes(data)
                        except Exception:
                            pass
        except Exception as exc:
            report.append(f'- error: {exc}')
            report.append('')
            continue

        if found:
            report.append('- manifests:')
            for name in sorted(found):
                report.append(f'  - {name}')
        else:
            report.append('- manifests: none found')
        report.append('')

    Path('analysis/tar_manifest_extraction.md').write_text('\n'.join(report), encoding='utf-8')


if __name__ == '__main__':
    main()
