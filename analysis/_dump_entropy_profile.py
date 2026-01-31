import os, glob
root = r'C:\\temp\\MobileSDK'
paths = sorted(glob.glob(os.path.join(root, 'se_dumps', 'latest', '*.bin')))
if not paths:
    raise SystemExit('No dumps found')

out_md = os.path.join(root, 'analysis', 'dump_entropy_profile.md')

try:
    import math
    def entropy(buf):
        if not buf: return 0.0
        counts = [0]*256
        for b in buf:
            counts[b]+=1
        ent = 0.0
        n = len(buf)
        for c in counts:
            if c:
                p = c/n
                ent -= p*math.log2(p)
        return ent
except Exception:
    def entropy(buf): return 0.0

with open(out_md, 'w', encoding='ascii') as f:
    f.write('# Dump entropy profile\n\n')
    for path in paths:
        data = open(path, 'rb').read()
        name = os.path.basename(path)
        size = len(data)
        window = min(4096, size)
        ent = entropy(data[:window])
        zeros = data.count(0)
        f.write('- {0}: size={1}, entropy_4k={2:.4f}, zero_ratio={3:.4f}\n'.format(name, size, ent, zeros/size if size else 0))

print('Wrote', out_md)
