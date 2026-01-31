import json
import re
from pathlib import Path

REF_EXTS = ('.tar.zst', '.tar', '.json', '.idx', '.dict')


def collect_refs(obj, refs):
    if isinstance(obj, dict):
        for k, v in obj.items():
            collect_refs(k, refs)
            collect_refs(v, refs)
    elif isinstance(obj, list):
        for v in obj:
            collect_refs(v, refs)
    elif isinstance(obj, str):
        low = obj.lower()
        if low.endswith(REF_EXTS):
            refs.add(obj)


def main():
    out_md = Path('analysis/manifest_engine_refs.md')
    lines = ['# Manifest engine references', '']
    for p in sorted(Path('analysis/manifests').glob('*.json')):
        try:
            data = json.loads(p.read_text(encoding='utf-8'))
        except Exception:
            continue
        lines.append(f'## {p.name}')
        refs = set()
        collect_refs(data, refs)
        refs = sorted(refs)
        lines.append(f'- total_refs: {len(refs)}')
        for r in refs[:200]:
            lines.append(f'  - {r}')
        if len(refs) > 200:
            lines.append(f'  - ... ({len(refs)-200} more)')
        lines.append('')
    out_md.write_text('\n'.join(lines), encoding='utf-8')


if __name__ == '__main__':
    main()
