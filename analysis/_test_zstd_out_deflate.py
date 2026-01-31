import os, glob, zlib
base = r"C:\temp\MobileSDK\se_dumps\latest"
files = sorted(glob.glob(os.path.join(base, "zstd_out_*.bin")))
MAGICS = [b"\x78\x9c", b"\x78\x01", b"\x78\xda"]

for f in files:
    data = open(f,'rb').read()
    print(os.path.basename(f))
    hits = []
    for m in MAGICS:
        start = 0
        while True:
            idx = data.find(m, start)
            if idx == -1:
                break
            hits.append(idx)
            start = idx + 1
    hits = sorted(set(hits))
    if not hits:
        print('  (no zlib headers)')
        continue
    for off in hits:
        chunk = data[off:off+256*1024]
        try:
            out = zlib.decompress(chunk)
            print(f'  {off:6d}  ok  out={len(out)}')
        except Exception as e:
            print(f'  {off:6d}  fail  {type(e).__name__}')
