import os, glob
root = r'C:\\temp\\MobileSDK'
paths = sorted(glob.glob(os.path.join(root, 'se_dumps', 'latest', 'zstd_out_*.bin')))
if not paths:
    raise SystemExit('No zstd_out_*.bin files found')

out_md = os.path.join(root, 'analysis', 'zstd_out_ptr_header.md')

with open(out_md, 'w', encoding='ascii') as f:
    f.write('# ZSTD out header pointer blocks\n\n')
    for path in paths:
        data = open(path, 'rb').read(64)
        name = os.path.basename(path)
        if len(data) < 32:
            f.write('## {0}: too small\n\n'.format(name))
            continue
        vals = [int.from_bytes(data[i:i+8], 'little') for i in range(0, 32, 8)]
        f.write('## {0}\n'.format(name))
        for i,v in enumerate(vals):
            f.write('- qword{0}: 0x{1:016x}\n'.format(i, v))
        f.write('\n')

print('Wrote', out_md)
