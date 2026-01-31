import os, glob
root = r'C:\\temp\\MobileSDK'
paths = sorted(glob.glob(os.path.join(root, 'se_dumps', 'latest', 'zstd_out_*.bin')))
if not paths:
    raise SystemExit('No zstd_out_*.bin files found')

out_md = os.path.join(root, 'analysis', 'zstd_out_repeat4_scan.md')

def scan(data, window=4096):
    n = min(len(data), window)
    counts = {}
    for i in range(0, n-4+1, 4):
        w = data[i:i+4]
        counts[w] = counts.get(w, 0) + 1
    top = sorted(counts.items(), key=lambda x: x[1], reverse=True)[:10]
    return top, len(counts), n

with open(out_md, 'w', encoding='ascii') as f:
    f.write('# ZSTD out 4-byte repeat scan (first 4KB)\n\n')
    for path in paths:
        data = open(path, 'rb').read()
        top, uniq, n = scan(data)
        f.write('## {0} (size={1})\n'.format(os.path.basename(path), len(data)))
        f.write('unique_4byte={0}\n'.format(uniq))
        for w,c in top:
            f.write('- {0} x{1}\n'.format(w.hex(), c))
        f.write('\n')

print('Wrote', out_md)
