import os, glob
root = r'C:\\temp\\MobileSDK'
paths = sorted(glob.glob(os.path.join(root, 'se_dumps', 'latest', 'zstd_out_*.bin')))
if not paths:
    raise SystemExit('No zstd_out_*.bin files found')

out_md = os.path.join(root, 'analysis', 'zstd_out_byte_parity.md')

with open(out_md, 'w', encoding='ascii') as f:
    f.write('# ZSTD out byte parity stats\n\n')
    for path in paths:
        data = open(path, 'rb').read()
        name = os.path.basename(path)
        even = data[0::2]
        odd = data[1::2]
        def ratio_zero(buf):
            return buf.count(0) / max(1, len(buf))
        f.write('- {0}: even_zero={1:.3f}, odd_zero={2:.3f}, size={3}\n'.format(
            name, ratio_zero(even), ratio_zero(odd), len(data)
        ))

print('Wrote', out_md)
