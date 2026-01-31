import os, glob, zlib
MAGICS = [
    (b"\x1f\x8b", "gzip"),
    (b"\x78\x9c", "zlib"),
    (b"\x78\x01", "zlib"),
    (b"\x78\xda", "zlib"),
]

MAX_HITS = 2000
MAX_TRIES = 120
CHUNK = 256*1024
OUT_LIMIT = 256*1024


def try_decompress(data, off, kind):
    chunk = data[off:off+CHUNK]
    try:
        if kind == "gzip":
            obj = zlib.decompressobj(16 + zlib.MAX_WBITS)
        else:
            obj = zlib.decompressobj(zlib.MAX_WBITS)
        out = obj.decompress(chunk, OUT_LIMIT)
        consumed = len(chunk) - len(obj.unconsumed_tail) - len(obj.unused_data)
        if len(out) == 0:
            return False, 0, 0
        return True, len(out), consumed
    except Exception:
        return False, 0, 0


for path in sorted(glob.glob('decrypted_bundles/*.bin')):
    data = open(path,'rb').read()
    print(os.path.basename(path), flush=True)
    hits = []
    for m, kind in MAGICS:
        start = 0
        while True:
            idx = data.find(m, start)
            if idx == -1:
                break
            hits.append((idx, kind))
            start = idx + 1
            if len(hits) >= MAX_HITS:
                break
        if len(hits) >= MAX_HITS:
            break
    hits.sort()
    if not hits:
        print('  (no zlib/gzip headers)', flush=True)
        continue
    tested = 0
    for off, kind in hits:
        ok, out_len, consumed = try_decompress(data, off, kind)
        if ok:
            print(f"  {off:10d}  {kind:4s}  out={out_len:7d}  in={consumed:7d}", flush=True)
        tested += 1
        if tested >= MAX_TRIES:
            print(f"  ... capped at {MAX_TRIES} tries", flush=True)
            break
