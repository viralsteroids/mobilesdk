import json
from pathlib import Path


def main():
    base = Path('analysis/extracted_tar')
    out = []
    out.append('# Manifest path resolution check')
    out.append('')
    for manifest_path in sorted(Path('analysis/manifests').glob('*.json')):
        try:
            data = json.loads(manifest_path.read_text(encoding='utf-8'))
        except Exception:
            continue
        bundle_name = manifest_path.name.split('.se.body.decompressed__')[-1].replace('.json','')
        bundle_dir = base / bundle_name
        if not bundle_dir.exists():
            continue
        refs = set()
        def collect(obj):
            if isinstance(obj, dict):
                for k,v in obj.items():
                    collect(k); collect(v)
            elif isinstance(obj, list):
                for v in obj: collect(v)
            elif isinstance(obj, str) and obj.startswith(':/'):
                refs.add(obj[2:])
        collect(data)
        refs = sorted(refs)
        missing = []
        for r in refs:
            if not (bundle_dir / r).exists():
                missing.append(r)
        out.append(f'## {manifest_path.name}')
        out.append(f'- bundle_dir: {bundle_dir}')
        out.append(f'- refs_total: {len(refs)}')
        out.append(f'- missing: {len(missing)}')
        for r in missing[:50]:
            out.append(f'  - {r}')
        if len(missing) > 50:
            out.append(f'  - ... ({len(missing)-50} more)')
        out.append('')

    Path('analysis/manifest_path_resolution.md').write_text('\n'.join(out), encoding='utf-8')


if __name__ == '__main__':
    main()
