import binascii
import glob

for path in sorted(glob.glob('analysis/bundles/*.se')):
    with open(path,'rb') as f:
        data = f.read(95)
    ascii_hdr = data[:59]
    bin_hdr = data[59:95]
    key_bin = bin_hdr[:20]
    const = bin_hdr[20:]
    # extract hex between tildes
    parts = ascii_hdr.split(b'~')
    if len(parts) >= 4:
        hex_ascii = parts[2]
        try:
            key_ascii = binascii.unhexlify(hex_ascii)
        except Exception:
            key_ascii = None
    else:
        hex_ascii = b''
        key_ascii = None
    print(path.split('/')[-1])
    print('  ascii:', ascii_hdr)
    print('  hex_ascii:', hex_ascii)
    print('  key_bin :', key_bin.hex())
    if key_ascii:
        print('  key_ascii:', key_ascii.hex())
        print('  match:', key_ascii == key_bin)
    print('  const   :', const.hex())
