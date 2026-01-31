import json
from pathlib import Path

out = []
out.append('# Manifest key summary')
out.append('')
for p in sorted(Path('analysis/manifests').glob('*.json')):
    try:
        data = json.loads(p.read_text(encoding='utf-8'))
    except Exception:
        continue
    out.append(f'## {p.name}')
    if isinstance(data, dict):
        keys = sorted(data.keys())
        out.append(f'- top_keys: {", ".join(keys[:50])}')
        for k in keys:
            if 'main' in k.lower() or 'entry' in k.lower() or 'bundle' in k.lower():
                out.append(f'- key: {k} = {data[k]}')
    else:
        out.append(f'- type: {type(data).__name__}')
    out.append('')

Path('analysis/manifest_key_summary.md').write_text('\n'.join(out), encoding='utf-8')
