import os, glob, csv

root = r'C:\\temp\\MobileSDK'
paths = []
paths += glob.glob(os.path.join(root, 'se_dumps', 'latest', '*.bin'))
paths += glob.glob(os.path.join(root, 'se_dumps', 'files', 'bundle_init_input_*.bin'))

BIN_CONST = bytes.fromhex('76 f6 f2 fb 17 59 1a 73 19 2c 51 5d 55 b7 20 60')
POST_CONST = bytes.fromhex('66 20 f5 7c 1a b4 0e 76 f0 d4 f2 84 73 3f d0 46')

out_csv = os.path.join(root, 'analysis', 'dump_header_marker_scan.csv')
out_md = os.path.join(root, 'analysis', 'dump_header_marker_scan.md')

rows = []

for path in sorted(paths):
    with open(path, 'rb') as f:
        data = f.read()
    for label, needle in [('BIN_CONST', BIN_CONST), ('POST_CONST', POST_CONST)]:
        off = 0
        while True:
            idx = data.find(needle, off)
            if idx == -1:
                break
            header_start = idx - 0x14
            preview = ''
            if header_start >= 0 and header_start + 32 <= len(data):
                preview = data[header_start:header_start+16].hex()
            rows.append([os.path.basename(path), label, f'0x{idx:08x}', idx, f'0x{header_start:08x}', header_start, preview])
            off = idx + 1

with open(out_csv, 'w', encoding='utf-8', newline='') as f:
    w = csv.writer(f)
    w.writerow(['file','marker','marker_offset_hex','marker_offset_dec','header_start_hex','header_start_dec','header_preview_hex'])
    for r in rows:
        w.writerow(r)

with open(out_md, 'w', encoding='ascii') as f:
    f.write('# Dump header marker scan\n\n')
    f.write('Scanned se_dumps/latest/*.bin and se_dumps/files/bundle_init_input_*.bin for header markers.\n\n')
    if not rows:
        f.write('No BIN_CONST or POST_CONST markers found.\n')
    else:
        for r in rows:
            f.write('- {0}: {1} @ {2}, header_start={3}, preview={4}\n'.format(r[0], r[1], r[2], r[4], r[6]))

print('Wrote', out_md, 'and', out_csv)
