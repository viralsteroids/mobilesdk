import csv
from pathlib import Path


def main():
    rows = []
    with Path('analysis/resource_graph_recursive.csv').open(newline='', encoding='utf-8') as f:
        reader = csv.DictReader(f)
        for row in reader:
            rows.append(row)

    nodes = set()
    edges = []

    for r in rows:
        bundle = r['bundle']
        src = f"{bundle}:{r['source_json']}"
        ref = r['ref']
        ref_type = r['ref_type']
        dst = f"{bundle}:{ref}"
        nodes.add(src)
        nodes.add(dst)
        edges.append((src, dst, ref_type))

    out = []
    out.append('digraph ResourceGraph {')
    out.append('  rankdir=LR;')
    out.append('  node [shape=box, fontsize=10];')

    # simple styling by type
    for src, dst, ref_type in edges:
        color = 'black'
        if ref_type == 'json':
            color = 'blue'
        elif ref_type == 'tar.zst':
            color = 'red'
        out.append(f'  "{src}" -> "{dst}" [color={color}];')

    out.append('}')

    Path('analysis/resource_graph.dot').write_text('\n'.join(out), encoding='utf-8')

    # summary
    Path('analysis/resource_graph_note.md').write_text(
        '# Resource graph DOT\n\n'
        '- Generated `analysis/resource_graph.dot` from recursive manifest references.\n'
        '- Edge colors: blue=json, red=tar.zst, black=other.\n',
        encoding='utf-8'
    )


if __name__ == '__main__':
    main()
