import csv
import json
from pathlib import Path


def collect_refs(obj, refs):
    if isinstance(obj, dict):
        for k, v in obj.items():
            collect_refs(k, refs)
            collect_refs(v, refs)
    elif isinstance(obj, list):
        for v in obj:
            collect_refs(v, refs)
    elif isinstance(obj, str):
        if obj.startswith(':/'):
            refs.add(obj[2:])


def build_model_map(base_dir):
    model_map = {}
    extracted_root = base_dir / '_extracted'
    if not extracted_root.exists():
        return model_map
    for weights_dir in extracted_root.rglob('weights'):
        if not weights_dir.is_dir():
            continue
        model_root = weights_dir.parent
        rel = model_root.relative_to(extracted_root)
        model_map[str(rel)] = {
            'model_root': str(rel),
            'weights_dir': str(weights_dir.relative_to(extracted_root)),
            'nn_info': str((model_root / 'nn_info.json').relative_to(extracted_root)) if (model_root / 'nn_info.json').exists() else '',
        }
    return model_map


def main():
    base = Path('analysis/extracted_tar')
    model_base = Path('analysis/nested_tar_all')
    out_csv = Path('analysis/resource_graph.csv')
    out_md = Path('analysis/resource_graph.md')

    rows = []
    for manifest_path in sorted(Path('analysis/manifests').glob('*.json')):
        try:
            data = json.loads(manifest_path.read_text(encoding='utf-8'))
        except Exception:
            continue
        bundle_name = manifest_path.name.split('.se.body.decompressed__')[-1].replace('.json', '')
        bundle_dir = base / bundle_name
        model_dir = model_base / bundle_name
        model_map = build_model_map(model_dir)
        refs = set()
        collect_refs(data, refs)
        for ref in sorted(refs):
            resolved = bundle_dir / ref
            exists = resolved.exists()
            rel_model = ''
            if ref.endswith('.tar.zst'):
                rel_model = ref.replace('.tar.zst', '')
                # model paths are in nested tar, but we can map via rel_model
                if rel_model not in model_map:
                    rel_model = ''
            rows.append({
                'bundle': bundle_name,
                'manifest': manifest_path.name,
                'ref': ref,
                'exists_in_tar': exists,
                'model_root': rel_model,
            })

    with out_csv.open('w', newline='', encoding='utf-8') as f:
        writer = csv.DictWriter(f, fieldnames=['bundle','manifest','ref','exists_in_tar','model_root'])
        writer.writeheader()
        writer.writerows(rows)

    lines = ['# Resource graph (manifest refs -> TAR files / models)', '']
    lines.append(f'- total_refs: {len(rows)}')
    lines.append('')
    # summary per bundle
    bundles = sorted(set(r['bundle'] for r in rows))
    for b in bundles:
        b_rows = [r for r in rows if r['bundle'] == b]
        model_refs = [r for r in b_rows if r['model_root']]
        lines.append(f'## {b}')
        lines.append(f'- refs: {len(b_rows)}')
        lines.append(f'- model_refs: {len(model_refs)}')
        lines.append('')
    out_md.write_text('\n'.join(lines), encoding='utf-8')


if __name__ == '__main__':
    main()
