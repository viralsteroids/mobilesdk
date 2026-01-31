import glob
for path in sorted(glob.glob('analysis/bundles/*.se')):
    data = open(path,'rb').read(80)
    ascii_hdr = data[:59]
    parts = ascii_hdr.split(b'~')
    hex_ascii = parts[2]
    print(path.split('\\')[-1], len(hex_ascii), hex_ascii)
