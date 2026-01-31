import os, glob
root = r'C:\\temp\\MobileSDK'
paths = sorted(glob.glob(os.path.join(root, 'se_dumps', 'latest', 'zstd_out_*.bin')))
if not paths:
    raise SystemExit('No zstd_out_*.bin files found')

out_md = os.path.join(root, 'analysis', 'zstd_out_u16_stats.md')

with open(out_md, 'w', encoding='ascii') as f:
    f.write('# ZSTD out u16 stats\n\n')
    for path in paths:
        data = open(path, 'rb').read()
        name = os.path.basename(path)
        n = len(data) // 2
        if n == 0:
            f.write('- {0}: size=0\n'.format(name))
            continue
        zeros = 0
        small = 0
        for i in range(0, n*2, 2):
            val = int.from_bytes(data[i:i+2], 'little')
            if val == 0:
                zeros += 1
            if val < 0x100:
                small += 1
        f.write('- {0}: u16_total={1}, u16_zero_ratio={2:.3f}, u16_lt256_ratio={3:.3f}\n'.format(
            name, n, zeros/n, small/n
        ))

print('Wrote', out_md)
