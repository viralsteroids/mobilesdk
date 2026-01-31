import os, glob, struct
from collections import Counter

root = r"C:\\temp\\MobileSDK"
paths = sorted(glob.glob(os.path.join(root, "se_dumps", "latest", "zstd_out_*.bin")))
if not paths:
    raise SystemExit("No zstd_out_*.bin files found")

out_md = os.path.join(root, "analysis", "zstd_out_run_compare.md")

MAX_KIND = 0x10
MAX_SIZE = 0x4000
MAX_IDX = 0x4000


def find_runs(data):
    runs = []
    n = len(data)
    off = 0
    in_run = False
    run_start = 0
    run_count = 0
    run_nonzero = 0
    run_kinds = Counter()
    run_vals = []

    def close_run(end_off):
        runs.append((run_start, end_off, run_count, run_nonzero, dict(run_kinds), run_vals.copy()))

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
                run_vals = []
            run_count += 1
            if val != 0 or idx != 0:
                run_nonzero += 1
            run_kinds[kind] += 1
            run_vals.append((val, idx))
        else:
            if in_run:
                close_run(off)
                in_run = False
        off += 8
    if in_run:
        close_run(off)
    return runs


def kind_summary(kdict):
    kc = Counter(kdict)
    return ", ".join([f"0x{k:02x}:{c}" for k, c in kc.most_common(6)])


def fmt_run(run):
    rs, re, cnt, nz, kinds, vals = run
    nz_ratio = (nz / cnt) if cnt else 0
    return rs, re, cnt, nz, nz_ratio, kinds, vals


with open(out_md, "w", encoding="ascii") as f:
    f.write("# zstd_out run comparison\n\n")
    f.write("Record runs are contiguous 8-byte sequences matching kind/size/idx predicate.\n")
    f.write("We show top runs by length and by nonzero density.\n\n")

    for p in paths:
        data = open(p, "rb").read()
        runs = [fmt_run(r) for r in find_runs(data)]
        f.write(f"## {os.path.basename(p)}\n\n")
        if not runs:
            f.write("No runs found.\n\n")
            continue

        # Top by length
        top_len = sorted(runs, key=lambda r: r[2], reverse=True)[:2]
        f.write("Top by length:\n\n")
        for i, (rs, re, cnt, nz, nz_ratio, kinds, vals) in enumerate(top_len):
            f.write(f"- Run {i+1}: off 0x{rs:04x}..0x{re:04x} records={cnt} nonzero={nz} ({nz_ratio:.2f})\n")
            f.write(f"  kinds: {kind_summary(kinds)}\n")
        f.write("\n")

        # Top by nonzero count (ignore runs with nz_ratio < 0.1)
        dense = [r for r in runs if r[4] >= 0.10]
        top_nz = sorted(dense, key=lambda r: r[3], reverse=True)[:2]
        f.write("Top by nonzero count (nz_ratio>=0.10):\n\n")
        if not top_nz:
            f.write("- None\n\n")
        else:
            for i, (rs, re, cnt, nz, nz_ratio, kinds, vals) in enumerate(top_nz):
                f.write(f"- Run {i+1}: off 0x{rs:04x}..0x{re:04x} records={cnt} nonzero={nz} ({nz_ratio:.2f})\n")
                f.write(f"  kinds: {kind_summary(kinds)}\n")
            # Compare top two dense runs
            if len(top_nz) >= 2:
                vals1 = set(top_nz[0][6])
                vals2 = set(top_nz[1][6])
                inter = len(vals1 & vals2)
                union = len(vals1 | vals2)
                jacc = (inter / union) if union else 0.0
                f.write(f"Run1 vs Run2 overlap: {inter} pairs; Jaccard={jacc:.3f}\n")
        f.write("\n")

print("Wrote", out_md)
