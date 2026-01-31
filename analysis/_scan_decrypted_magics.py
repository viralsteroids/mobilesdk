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
    b"\x89PNG\r\n\x1a\n": "png",
    b"\xff\xd8\xff": "jpeg",
    b"GIF87a": "gif87",
    b"GIF89a": "gif89",
    b"\x25PDF": "pdf",
    b"\x7fELF": "elf",
    b"ustar": "tar ustar",
}

def scan(path):
    data = open(path,'rb').read()
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
    return hits

files = sorted(glob.glob('decrypted_bundles/*.bin'))
for f in files:
    hits = scan(f)
    print(os.path.basename(f))
    if not hits:
        print('  (no magics)')
        continue
    for off,name in hits[:40]:
        print(f'  {off:10d}  {name}')
    if len(hits) > 40:
        print(f'  ... {len(hits)-40} more')
