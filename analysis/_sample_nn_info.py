import json
from pathlib import Path


def main():
    base = Path('analysis/nested_tar_all')
    out = []
    out.append('# Model nn_info key summary (sample)')
    out.append('')
    count = 0
    for nn_info in base.rglob('nn_info.json'):
        try:
            data = json.loads(nn_info.read_text(encoding='utf-8'))
        except Exception:
            continue
        bundle = nn_info.parts[nn_info.parts.index('nested_tar_all') + 1]
        rel = nn_info.relative_to(base / bundle)
        out.append(f'## {bundle} :: {rel}')
        if isinstance(data, dict):
            keys = sorted(data.keys())
            out.append(f'- keys: {", ".join(keys)}')
            for k in keys:
                if isinstance(data[k], (str, int, float, bool)):
                    out.append(f'- {k}: {data[k]}')
        out.append('')
        count += 1
        if count >= 20:
            break
    Path('analysis/nn_info_sample.md').write_text('\n'.join(out), encoding='utf-8')


if __name__ == '__main__':
    main()
