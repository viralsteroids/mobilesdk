import os, glob, struct, csv

root = r'C:\\temp\\MobileSDK'
paths = sorted(glob.glob(os.path.join(root, 'se_dumps', 'latest', 'zstd_out_*.bin')))
if not paths:
    raise SystemExit('No zstd_out_*.bin files found')

out_csv = os.path.join(root, 'analysis', 'zstd_out_toc_candidates.csv')
out_md = os.path.join(root, 'analysis', 'zstd_out_toc_candidates.md')

rows = []

for path in paths:
    data = open(path, 'rb').read()
    n = len(data)
    best = 0
    for align in range(0, 8):
        i = align
        while i + 8 <= n:
            run = 0
            last_off = -1
            j = i
            while j + 8 <= n:
                off = struct.unpack_from('<I', data, j)[0]
                size = struct.unpack_from('<I', data, j+4)[0]
                if off == 0 or size == 0:
                    break
                if size < 4:
                    break
                if off % 4 != 0:
                    break
                if off >= n or off + size > n:
                    break
                if last_off != -1 and off <= last_off:
                    break
                table_end = j + 8
                if off < table_end:
                    break
                last_off = off
                run += 1
                j += 8
            if run >= 8:
                rows.append([os.path.basename(path), align, f'0x{i:08x}', run, f'0x{last_off:08x}'])
                if run > best:
                    best = run
                i = j
            else:
                i += 8
    if best == 0:
        rows.append([os.path.basename(path), '', '', 0, ''])

with open(out_csv, 'w', encoding='utf-8', newline='') as f:
    w = csv.writer(f)
    w.writerow(['file','align','start_offset','pairs_run','last_offset'])
    for r in rows:
        w.writerow(r)

with open(out_md, 'w', encoding='ascii') as f:
    f.write('# ZSTD out TOC candidate scan (filtered v2)\n\n')
    if not rows:
        f.write('No files scanned.\n')
    else:
        by_file = {}
        for r in rows:
            by_file.setdefault(r[0], 0)
            by_file[r[0]] = max(by_file[r[0]], int(r[3]))
        for name, best in by_file.items():
            f.write('- {0}: best_run={1}\n'.format(name, best))

print('Wrote', out_md, 'and', out_csv)
