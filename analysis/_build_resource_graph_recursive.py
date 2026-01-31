import csv
import json
from collections import deque
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


def main():
    extracted_tar = Path('analysis/extracted_tar')
    manifests_dir = Path('analysis/manifests')
    nested_root = Path('analysis/nested_tar_all')

    rows = []
    model_rows = []

    for manifest_path in sorted(manifests_dir.glob('*.json')):
        bundle_name = manifest_path.name.split('.se.body.decompressed__')[-1].replace('.json', '')
        bundle_dir = extracted_tar / bundle_name
        if not bundle_dir.exists():
            continue
        start_json = bundle_dir / manifest_path.name.split('__')[-1]
        if not start_json.exists():
            continue

        queue = deque()
        queue.append((start_json, 0))
        visited = set()

        while queue:
            current, depth = queue.popleft()
            if current in visited:
                continue
            visited.add(current)
            try:
                data = json.loads(current.read_text(encoding='utf-8'))
            except Exception:
                continue
            refs = set()
            collect_refs(data, refs)
            for ref in sorted(refs):
                ref_path = bundle_dir / ref
                exists_in_tar = ref_path.exists()
                ref_type = 'other'
                if ref.endswith('.json'):
                    ref_type = 'json'
                elif ref.endswith('.tar.zst'):
                    ref_type = 'tar.zst'
                rows.append({
                    'bundle': bundle_name,
                    'source_json': str(current.relative_to(bundle_dir)),
                    'ref': ref,
                    'ref_type': ref_type,
                    'exists_in_tar': exists_in_tar,
                    'depth': depth,
                })

                if ref_type == 'json' and exists_in_tar:
                    queue.append((ref_path, depth + 1))

                if ref_type == 'tar.zst':
                    model_root = ref.replace('.tar.zst', '')
                    nested_model_dir = nested_root / bundle_name / '_extracted' / model_root
                    model_rows.append({
                        'bundle': bundle_name,
                        'ref': ref,
                        'model_root': model_root,
                        'exists_in_nested': nested_model_dir.exists(),
                    })

    out_csv = Path('analysis/resource_graph_recursive.csv')
    out_md = Path('analysis/resource_graph_recursive.md')
    out_models = Path('analysis/resource_graph_models.csv')

    with out_csv.open('w', newline='', encoding='utf-8') as f:
        writer = csv.DictWriter(f, fieldnames=['bundle','source_json','ref','ref_type','exists_in_tar','depth'])
        writer.writeheader()
        writer.writerows(rows)

    with out_models.open('w', newline='', encoding='utf-8') as f:
        writer = csv.DictWriter(f, fieldnames=['bundle','ref','model_root','exists_in_nested'])
        writer.writeheader()
        writer.writerows(model_rows)

    lines = ['# Resource graph (recursive)', '']
    lines.append(f'- total_refs: {len(rows)}')
    lines.append(f'- model_refs: {len(model_rows)}')
    lines.append('')

    for bundle in sorted({r['bundle'] for r in rows}):
        b_rows = [r for r in rows if r['bundle'] == bundle]
        b_models = [r for r in model_rows if r['bundle'] == bundle]
        lines.append(f'## {bundle}')
        lines.append(f'- refs: {len(b_rows)}')
        lines.append(f'- model_refs: {len(b_models)}')
        missing_json = [r for r in b_rows if r['ref_type'] == 'json' and not r['exists_in_tar']]
        lines.append(f'- missing_json_refs: {len(missing_json)}')
        lines.append('')

    out_md.write_text('\n'.join(lines), encoding='utf-8')


if __name__ == '__main__':
    main()
