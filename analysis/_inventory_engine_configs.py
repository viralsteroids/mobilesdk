import json
from pathlib import Path


def main():
    out = []
    out.append('# Engine configs in extracted TAR bundles')
    out.append('')
    for bundle_dir in sorted(Path('analysis/extracted_tar').iterdir()):
        if not bundle_dir.is_dir():
            continue
        out.append(f'## {bundle_dir.name}')
        configs = []
        for path in bundle_dir.rglob('*.json'):
            if path.name.endswith('_engine.json') or 'engine' in path.parts:
                configs.append(path)
        out.append(f'- engine_config_count: {len(configs)}')
        for p in sorted(configs)[:100]:
            rel = p.relative_to(bundle_dir)
            out.append(f'  - {rel}')
        if len(configs) > 100:
            out.append(f'  - ... ({len(configs)-100} more)')
        out.append('')
    Path('analysis/engine_config_inventory.md').write_text('\n'.join(out), encoding='utf-8')


if __name__ == '__main__':
    main()
