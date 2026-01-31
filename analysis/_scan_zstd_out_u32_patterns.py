import os, glob
root = r'C:\\temp\\MobileSDK'
paths = sorted(glob.glob(os.path.join(root, 'se_dumps', 'latest', 'zstd_out_*.bin')))
if not paths:
    raise SystemExit('No zstd_out_*.bin files found')

out_md = os.path.join(root, 'analysis', 'zstd_out_u32_patterns.md')

def u32s(data, limit=4096):
    n = min(len(data), limit)
    out = []
    for i in range(0, n-3, 4):
        out.append(int.from_bytes(data[i:i+4], 'little'))
    return out

with open(out_md, 'w', encoding='ascii') as f:
    f.write('# ZSTD out u32 pattern scan (first 4KB)\n\n')
    for path in paths:
        data = open(path, 'rb').read()
        vals = u32s(data)
        name = os.path.basename(path)
        # count high-byte buckets
        buckets = {}
        for v in vals:
            hi = (v >> 24) & 0xff
            buckets[hi] = buckets.get(hi, 0) + 1
        top = sorted(buckets.items(), key=lambda x: x[1], reverse=True)[:10]
        f.write('## {0}\n'.format(name))
        f.write('top_hi_bytes: ' + ', '.join('0x%02x:%d' % (b,c) for b,c in top) + '\n')
        # sample sequence of (hi, low16)
        seq = []
        for v in vals[:32]:
            seq.append('(%02x,%04x)' % ((v>>24)&0xff, v & 0xffff))
        f.write('seq32: ' + ' '.join(seq) + '\n\n')

print('Wrote', out_md)
