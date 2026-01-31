from pathlib import Path
import csv
from collections import Counter

BASE = Path(__file__).resolve().parents[1]
root = BASE / 'analysis' / 'extracted_tar'

ZSTD_MAGIC = b"\x28\xb5\x2f\xfd"
SKIPPABLE_MAGIC_BASE = 0x184D2A50
SKIPPABLE_MAGIC_MAX = 0x184D2A5F


def parse_frame_header(buf, offset=0):
    end = len(buf)
    if offset + 5 > end:
        return None, offset, 'truncated header'
    magic = buf[offset:offset+4]
    if magic != ZSTD_MAGIC:
        return None, offset, 'missing zstd magic'
    pos = offset + 4
    fhd = buf[pos]
    pos += 1
    fcs_flag = fhd & 0x3
    single_segment = (fhd >> 2) & 0x1
    checksum_flag = (fhd >> 4) & 0x1
    dict_id_flag = (fhd >> 5) & 0x3

    window_desc = None
    if single_segment == 0:
        if pos >= end:
            return None, offset, 'truncated window descriptor'
        window_desc = buf[pos]
        pos += 1

    dict_id_size = {0: 0, 1: 1, 2: 2, 3: 4}[dict_id_flag]
    dict_id = None
    if dict_id_size:
        if pos + dict_id_size > end:
            return None, offset, 'truncated dict id'
        dict_id = int.from_bytes(buf[pos:pos + dict_id_size], 'little')
        pos += dict_id_size

    # Frame content size
    if single_segment:
        size_map = {0: 1, 1: 2, 2: 4, 3: 8}
    else:
        size_map = {0: 0, 1: 2, 2: 4, 3: 8}
    fcs_size = size_map[fcs_flag]
    fcs_value = None
    if fcs_size:
        if pos + fcs_size > end:
            return None, offset, 'truncated frame content size'
        fcs_value = int.from_bytes(buf[pos:pos + fcs_size], 'little')
        if not single_segment and fcs_flag == 1 and fcs_size == 2:
            fcs_value += 256
        pos += fcs_size

    info = {
        'fhd': fhd,
        'single_segment': single_segment,
        'checksum_flag': checksum_flag,
        'dict_id_flag': dict_id_flag,
        'dict_id': dict_id,
        'window_desc': window_desc,
        'fcs_flag': fcs_flag,
        'fcs_size': fcs_size,
        'fcs_value': fcs_value,
        'header_len': pos - offset,
    }
    return info, pos, None


def is_skippable(buf):
    if len(buf) < 4:
        return False
    magic = int.from_bytes(buf[0:4], 'little')
    return SKIPPABLE_MAGIC_BASE <= magic <= SKIPPABLE_MAGIC_MAX


def scan_file(path):
    size = path.stat().st_size
    with path.open('rb') as f:
        head = f.read(64)
    if head.startswith(ZSTD_MAGIC):
        info, _, error = parse_frame_header(head, 0)
        return info, error, None
    if is_skippable(head):
        if len(head) < 8:
            return None, 'truncated skippable header', None
        skip_size = int.from_bytes(head[4:8], 'little')
        # attempt to read header after skippable frame
        with path.open('rb') as f:
            f.seek(8 + skip_size)
            head2 = f.read(64)
        if head2.startswith(ZSTD_MAGIC):
            info, _, error = parse_frame_header(head2, 0)
            return info, error, skip_size
        return None, 'skippable frame then missing zstd magic', skip_size
    return None, 'missing zstd magic', None


def bundle_from_path(path):
    try:
        rel = path.relative_to(root)
        parts = rel.parts
        if parts:
            return parts[0]
    except ValueError:
        return ''
    return ''


def main():
    rows = []
    fhd_counts = Counter()
    window_counts = Counter()
    dict_flag_counts = Counter()
    checksum_counts = Counter()
    fcs_flag_counts = Counter()
    dict_ids = Counter()
    skippable_counts = Counter()
    errors = Counter()

    for zst_path in sorted(root.rglob('*.tar.zst')):
        info, error, skipped = scan_file(zst_path)
        rel = zst_path.relative_to(root)
        bundle = bundle_from_path(zst_path)
        size = zst_path.stat().st_size

        row = {
            'bundle': bundle,
            'path': str(rel).replace('\\', '/'),
            'size': size,
            'fhd': '',
            'single_segment': '',
            'checksum_flag': '',
            'dict_id_flag': '',
            'dict_id': '',
            'window_desc': '',
            'fcs_flag': '',
            'fcs_size': '',
            'fcs_value': '',
            'header_len': '',
            'skippable_size': skipped if skipped is not None else '',
            'error': error or '',
        }

        if info:
            row.update({
                'fhd': info['fhd'],
                'single_segment': info['single_segment'],
                'checksum_flag': info['checksum_flag'],
                'dict_id_flag': info['dict_id_flag'],
                'dict_id': info['dict_id'] if info['dict_id'] is not None else '',
                'window_desc': info['window_desc'] if info['window_desc'] is not None else '',
                'fcs_flag': info['fcs_flag'],
                'fcs_size': info['fcs_size'],
                'fcs_value': info['fcs_value'] if info['fcs_value'] is not None else '',
                'header_len': info['header_len'],
            })
            fhd_counts[info['fhd']] += 1
            if info['window_desc'] is not None:
                window_counts[info['window_desc']] += 1
            dict_flag_counts[info['dict_id_flag']] += 1
            checksum_counts[info['checksum_flag']] += 1
            fcs_flag_counts[info['fcs_flag']] += 1
            if info['dict_id'] is not None:
                dict_ids[info['dict_id']] += 1
        else:
            errors[error or 'unknown'] += 1

        if skipped is not None:
            skippable_counts[skipped] += 1

        rows.append(row)

    out_csv = BASE / 'analysis' / 'nested_zst_header_scan.csv'
    with out_csv.open('w', newline='') as f:
        fieldnames = [
            'bundle','path','size','fhd','single_segment','checksum_flag','dict_id_flag','dict_id',
            'window_desc','fcs_flag','fcs_size','fcs_value','header_len','skippable_size','error'
        ]
        w = csv.DictWriter(f, fieldnames=fieldnames)
        w.writeheader()
        for r in rows:
            w.writerow(r)

    lines = []
    lines.append('# Nested .tar.zst header scan')
    lines.append('')
    lines.append(f'Root: {root}')
    lines.append(f'Total .tar.zst files: {len(rows)}')
    lines.append('')

    if errors:
        lines.append('## Errors')
        lines.append('')
        lines.append('| error | count |')
        lines.append('| --- | --- |')
        for err, count in errors.most_common():
            lines.append(f'| {err} | {count} |')
        lines.append('')

    lines.append('## Frame header summary')
    lines.append('')
    lines.append('| metric | counts |')
    lines.append('| --- | --- |')
    lines.append(f'| fhd values | {dict(fhd_counts)} |')
    lines.append(f'| window_desc values | {dict(window_counts)} |')
    lines.append(f'| dict_id_flag values | {dict(dict_flag_counts)} |')
    lines.append(f'| checksum_flag values | {dict(checksum_counts)} |')
    lines.append(f'| fcs_flag values | {dict(fcs_flag_counts)} |')

    if dict_ids:
        lines.append('')
        lines.append('## Dict IDs (top 20)')
        lines.append('')
        lines.append('| dict_id | count |')
        lines.append('| --- | --- |')
        for did, count in dict_ids.most_common(20):
            lines.append(f'| {did} | {count} |')

    out_md = BASE / 'analysis' / 'nested_zst_header_scan.md'
    out_md.write_text('\n'.join(lines), encoding='utf-8')

    print(f'Wrote {out_csv} and {out_md}')


if __name__ == '__main__':
    main()
