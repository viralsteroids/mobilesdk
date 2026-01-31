import os, glob, zlib
MAGICS = [
    (b"\x1f\x8b", "gzip"),
    (b"\x78\x9c", "zlib"),
    (b"\x78\x01", "zlib"),
    (b"\x78\xda", "zlib"),
]

MAX_TEST = 200


def try_decompress(data, off, kind):
    chunk = data[off:]
    try:
        if kind == "gzip":
            obj = zlib.decompressobj(16 + zlib.MAX_WBITS)
        else:
            obj = zlib.decompressobj(zlib.MAX_WBITS)
        out = obj.decompress(chunk, 1024*1024)
        consumed = len(chunk) - len(obj.unconsumed_tail) - len(obj.unused_data)
        return True, len(out), consumed
    except Exception:
        return False, 0, 0


for path in sorted(glob.glob('decrypted_bundles/*.bin')):
    data = open(path,'rb').read()
    print(os.path.basename(path))
    hits = []
    for m, kind in MAGICS:
        start = 0
        while True:
            idx = data.find(m, start)
            if idx == -1:
                break
            hits.append((idx, kind))
            start = idx + 1
    hits.sort()
    if not hits:
        print('  (no zlib/gzip headers)')
        continue
    tested = 0
    for off, kind in hits:
        ok, out_len, consumed = try_decompress(data, off, kind)
        if ok and out_len > 0:
            print(f"  {off:10d}  {kind:4s}  out={out_len:8d}  in={consumed:8d}")
            tested += 1
        if tested >= MAX_TEST:
            print(f"  ... capped at {MAX_TEST} successes")
            break
    if tested == 0:
        print('  (no successful decompress)')
