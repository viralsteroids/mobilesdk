import os, glob, struct
from collections import Counter

root = r"C:\\temp\\MobileSDK"
paths = sorted(glob.glob(os.path.join(root, "se_dumps", "latest", "zstd_out_*.bin")))
if not paths:
    raise SystemExit("No zstd_out_*.bin files found")

out_md = os.path.join(root, "analysis", "zstd_out_record_runs.md")

MAX_KIND = 0x10
MAX_SIZE = 0x4000
MAX_IDX = 0x4000

with open(out_md, "w", encoding="ascii") as f:
    f.write("# zstd_out record runs (8-byte table scan)\n\n")
    f.write("Predicate: kind<=0x10, size<=0x4000, idx<=0x4000.\n\n")

    for p in paths:
        data = open(p, "rb").read()
        n = len(data)
        f.write(f"## {os.path.basename(p)}\n\n")
        if n < 0x30:
            f.write("Too small.\n\n")
            continue

        runs = []
        in_run = False
        run_start = 0
        run_count = 0
        run_nonzero = 0
        run_kinds = Counter()

        def close_run(end_off):
            runs.append((run_start, end_off, run_count, run_nonzero, dict(run_kinds)))

        off = 0
        while off + 8 <= n:
            val = struct.unpack('<I', data[off:off+4])[0]
            idx = struct.unpack('<I', data[off+4:off+8])[0]
            kind = (val >> 24) & 0xff
            size = val & 0xffff
            ok = (kind <= MAX_KIND and size <= MAX_SIZE and idx <= MAX_IDX)
            if ok:
                if not in_run:
                    in_run = True
                    run_start = off
                    run_count = 0
                    run_nonzero = 0
                    run_kinds = Counter()
                run_count += 1
                if val != 0 or idx != 0:
                    run_nonzero += 1
                run_kinds[kind] += 1
            else:
                if in_run:
                    close_run(off)
                    in_run = False
            off += 8
        if in_run:
            close_run(off)

        runs.sort(key=lambda r: r[2], reverse=True)
        f.write(f"Total runs: {len(runs)}\n\n")
        for i, (rs, re, cnt, nz, kinds) in enumerate(runs[:5]):
            nz_ratio = (nz / cnt) if cnt else 0
            f.write(f"- Run {i+1}: off 0x{rs:04x}..0x{re:04x} records={cnt} nonzero={nz} ({nz_ratio:.2f})\n")
            kc = Counter(kinds)
            top = ", ".join([f"0x{k:02x}:{c}" for k, c in kc.most_common(5)])
            f.write(f"  kinds: {top}\n")
        f.write("\n")

print("Wrote", out_md)
