import glob

def dump(path):
    data = open(path,'rb').read(100)
    print(path.split('\\')[-1])
    for i in range(50, 90):
        b = data[i]
        ch = chr(b) if 32 <= b < 127 else '.'
        print(f'{i:02d}: {b:02x} {ch}')

for path in sorted(glob.glob('analysis/bundles/*.se')):
    dump(path)
    print()
