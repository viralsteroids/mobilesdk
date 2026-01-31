import os, glob
root = r'C:\\temp\\MobileSDK'
paths = sorted(glob.glob(os.path.join(root, 'se_dumps', 'latest', '*.bin')))
if not paths:
    raise SystemExit('No dumps found')

out_md = os.path.join(root, 'analysis', 'dump_u32_stats.md')

with open(out_md, 'w', encoding='ascii') as f:
    f.write('# Dump u32 stats\n\n')
    for path in paths:
        data = open(path, 'rb').read()
        name = os.path.basename(path)
        n = len(data)
        if n < 4:
            f.write('- {0}: size={1}\n'.format(name, n))
            continue
        # count u32 zeros and small values
        zeros = 0
        small = 0
        total = 0
        for i in range(0, n-3, 4):
            val = int.from_bytes(data[i:i+4], 'little')
            total += 1
            if val == 0:
                zeros += 1
            if val < 0x100:
                small += 1
        f.write('- {0}: u32_total={1}, u32_zero_ratio={2:.3f}, u32_lt256_ratio={3:.3f}\n'.format(name, total, zeros/total if total else 0, small/total if total else 0))

print('Wrote', out_md)
