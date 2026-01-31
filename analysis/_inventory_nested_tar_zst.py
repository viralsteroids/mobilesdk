import csv
from pathlib import Path


def main():
    base = Path('analysis/extracted_tar')
    rows = []
    for bundle_dir in sorted(base.iterdir()):
        if not bundle_dir.is_dir():
            continue
        files = list(bundle_dir.rglob('*.tar.zst'))
        total_size = sum(p.stat().st_size for p in files)
        rows.append({
            'bundle': bundle_dir.name,
            'count': len(files),
            'total_size': total_size,
        })

    out_csv = Path('analysis/nested_tar_zst_inventory.csv')
    out_md = Path('analysis/nested_tar_zst_inventory.md')
    out_csv.parent.mkdir(parents=True, exist_ok=True)

    with out_csv.open('w', newline='', encoding='utf-8') as f:
        writer = csv.DictWriter(f, fieldnames=['bundle','count','total_size'])
        writer.writeheader()
        writer.writerows(rows)

    lines = ['# Nested .tar.zst inventory', '']
    for row in rows:
        lines.append(f"- {row['bundle']}: {row['count']} files, total_size={row['total_size']}")
    lines.append('')
    out_md.write_text('\n'.join(lines), encoding='utf-8')


if __name__ == '__main__':
    main()
