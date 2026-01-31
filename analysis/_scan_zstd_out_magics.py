import os, glob
MAGICS = {
    b"PK\x03\x04": "ZIP local",
    b"PK\x05\x06": "ZIP end",
    b"PK\x07\x08": "ZIP spanned",
    b"\x1f\x8b": "gzip",
    b"\x78\x9c": "zlib/deflate",
    b"\x78\x01": "zlib/deflate",
    b"\x78\xda": "zlib/deflate",
    b"\x28\xb5\x2f\xfd": "zstd",
    b"\x04\x22\x4d\x18": "lz4 frame",
    b"\x5d\x00\x00\x80": "lzma",
    b"7z\xbc\xaf\x27\x1c": "7z",
    b"ustar": "tar ustar",
    b"\x7fELF": "elf",
}

base = r"C:\temp\MobileSDK\se_dumps\latest"
files = sorted(glob.glob(os.path.join(base, "*.bin")))
for f in files:
    data = open(f,'rb').read()
    hits = []
    for m, name in MAGICS.items():
        start = 0
        while True:
            idx = data.find(m, start)
            if idx == -1:
                break
            hits.append((idx, name))
            start = idx + 1
    hits.sort()
    print(os.path.basename(f))
    if not hits:
        print('  (no magics)')
        continue
    for off,name in hits[:40]:
        print(f'  {off:10d}  {name}')
    if len(hits) > 40:
        print(f'  ... {len(hits)-40} more')
