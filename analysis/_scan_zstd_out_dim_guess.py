import os, glob
root = r'C:\\temp\\MobileSDK'
paths = sorted(glob.glob(os.path.join(root, 'se_dumps', 'latest', 'zstd_out_*.bin')))
if not paths:
    raise SystemExit('No zstd_out_*.bin files found')

widths = [32, 48, 64, 80, 96, 112, 128, 144, 160, 176, 192, 208, 224, 240, 256, 320, 384, 512, 640, 768, 1024]

out_md = os.path.join(root, 'analysis', 'zstd_out_dim_guess.md')

with open(out_md, 'w', encoding='ascii') as f:
    f.write('# ZSTD out dimension guesses\n\n')
    for path in paths:
        size = os.path.getsize(path)
        name = os.path.basename(path)
        f.write('## {0} (size={1})\n'.format(name, size))
        for bpp in (1,2,4):
            matches = []
            if size % bpp != 0:
                f.write('- bpp={0}: size not divisible\n'.format(bpp))
                continue
            pixels = size // bpp
            for w in widths:
                if pixels % w == 0:
                    h = pixels // w
                    matches.append((w,h))
            if matches:
                f.write('- bpp={0}: '.format(bpp) + ', '.join('{0}x{1}'.format(w,h) for w,h in matches[:12]) + (' ...' if len(matches)>12 else '') + '\n')
            else:
                f.write('- bpp={0}: no common width matches\n'.format(bpp))
        f.write('\n')

print('Wrote', out_md)
