import csv
import json
from pathlib import Path


def main():
    base = Path('analysis/nested_tar_all')
    out_csv = Path('analysis/model_index.csv')
    out_md = Path('analysis/model_index.md')

    rows = []
    for bundle_dir in sorted(base.iterdir()):
        if not bundle_dir.is_dir():
            continue
        bundle = bundle_dir.name
        extracted_root = bundle_dir / '_extracted'
        if not extracted_root.exists():
            continue
        for model_dir in extracted_root.rglob('weights'):
            if not model_dir.is_dir():
                continue
            rel_model = model_dir.parent
            nn_info = rel_model / 'nn_info.json'
            nn_info_data = None
            if nn_info.exists():
                try:
                    nn_info_data = json.loads(nn_info.read_text(encoding='utf-8'))
                except Exception:
                    nn_info_data = None
            weight_files = sorted([p for p in model_dir.glob('*.pb')])
            rows.append({
                'bundle': bundle,
                'model_path': str(rel_model.relative_to(extracted_root)),
                'weights_count': len(weight_files),
                'weights_files': ';'.join([p.name for p in weight_files[:20]]),
                'nn_info_present': bool(nn_info.exists()),
                'nn_info_keys': ';'.join(sorted(nn_info_data.keys())) if isinstance(nn_info_data, dict) else '',
            })

    with out_csv.open('w', newline='', encoding='utf-8') as f:
        writer = csv.DictWriter(f, fieldnames=[
            'bundle','model_path','weights_count','weights_files','nn_info_present','nn_info_keys'
        ])
        writer.writeheader()
        writer.writerows(rows)

    lines = ['# Model index (nested TAR extraction)', '']
    lines.append(f'- total_models: {len(rows)}')
    lines.append('')
    for row in rows[:50]:
        lines.append(f"- {row['bundle']} :: {row['model_path']} (weights={row['weights_count']}, nn_info={row['nn_info_present']})")
    if len(rows) > 50:
        lines.append(f'- ... ({len(rows)-50} more)')
    out_md.write_text('\n'.join(lines), encoding='utf-8')


if __name__ == '__main__':
    main()
