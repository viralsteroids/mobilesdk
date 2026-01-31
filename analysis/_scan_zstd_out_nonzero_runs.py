import os, glob

root = r'C:\\temp\\MobileSDK'
paths = sorted(glob.glob(os.path.join(root, 'se_dumps', 'latest', 'zstd_out_*.bin')))
if not paths:
    raise SystemExit('No zstd_out_*.bin files found')

out_md = os.path.join(root, 'analysis', 'zstd_out_nonzero_runs.md')

with open(out_md, 'w', encoding='ascii') as f:
    f.write('# ZSTD out nonzero runs\n\n')
    for path in paths:
        data = open(path, 'rb').read()
        name = os.path.basename(path)
        runs = []
        i = 0
        n = len(data)
        while i < n:
            if data[i] == 0:
                i += 1
                continue
            start = i
            while i < n and data[i] != 0:
                i += 1
            end = i
            runs.append((start, end))
        f.write('## {0} (size={1})\n'.format(name, n))
        f.write('nonzero_runs={0}\n'.format(len(runs)))
        if runs:
            # summarize first 20 runs
            for start, end in runs[:20]:
                f.write('- 0x{0:08x}..0x{1:08x} len={2}\n'.format(start, end, end-start))
        f.write('\n')

print('Wrote', out_md)
