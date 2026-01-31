import os, glob
root = r'C:\\temp\\MobileSDK'
paths = sorted(glob.glob(os.path.join(root, 'se_dumps', 'latest', '*.bin')))
if not paths:
    raise SystemExit('No dumps found')

BIN_CONST = bytes.fromhex('76 f6 f2 fb 17 59 1a 73 19 2c 51 5d 55 b7 20 60')
POST_CONST = bytes.fromhex('66 20 f5 7c 1a b4 0e 76 f0 d4 f2 84 73 3f d0 46')
ZSTD_MAGIC = bytes.fromhex('28 b5 2f fd')
ZIP_LFH = b'PK\x03\x04'

out_md = os.path.join(root, 'analysis', 'dump_marker_scan_extended.md')

with open(out_md, 'w', encoding='ascii') as f:
    f.write('# Dump marker scan (extended)\n\n')
    for path in paths:
        data = open(path, 'rb').read()
        name = os.path.basename(path)
        f.write('## ' + name + '\n')
        f.write('size=' + str(len(data)) + '\n')
        for label, needle in [('BIN_CONST', BIN_CONST), ('POST_CONST', POST_CONST), ('ZSTD_MAGIC', ZSTD_MAGIC), ('ZIP_LFH', ZIP_LFH)]:
            off = 0
            hits = []
            while True:
                idx = data.find(needle, off)
                if idx == -1:
                    break
                hits.append(idx)
                off = idx + 1
            if hits:
                f.write('- ' + label + ': ' + ', '.join('0x%08x' % x for x in hits[:10]) + '\n')
            else:
                f.write('- ' + label + ': none\n')
        f.write('\n')

print('Wrote', out_md)
