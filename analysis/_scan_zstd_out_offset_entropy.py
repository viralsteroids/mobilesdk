import os, glob, math

root = r"C:\\temp\\MobileSDK"
paths = sorted(glob.glob(os.path.join(root, "se_dumps", "latest", "zstd_out_*.bin")))
if not paths:
    raise SystemExit("No zstd_out_*.bin files found")

files = [open(p, "rb").read() for p in paths]
min_len = min(len(d) for d in files)

# per-offset stats
unique_counts = [0] * min_len
zero_counts = [0] * min_len
entropy_vals = [0.0] * min_len

for i in range(min_len):
    vals = [d[i] for d in files]
    uniq = len(set(vals))
    unique_counts[i] = uniq
    zero_counts[i] = sum(1 for v in vals if v == 0)
    # entropy over the sample values
    freq = {}
    for v in vals:
        freq[v] = freq.get(v, 0) + 1
    ent = 0.0
    n = len(vals)
    for c in freq.values():
        p = c / n
        ent -= p * math.log2(p)
    entropy_vals[i] = ent

# summarize by 0x40 blocks
block = 0x40
out_md = os.path.join(root, "analysis", "zstd_out_offset_entropy.md")
with open(out_md, "w", encoding="ascii") as f:
    f.write("# ZSTD out offset entropy/variance (across dumps)\n\n")
    f.write(f"Files: {len(files)}; common length: {min_len} bytes\n\n")
    f.write("| block | uniq_avg | zero_ratio | entropy_avg |\n| --- | --- | --- | --- |\n")
    for b in range(0, min_len, block):
        end = min(min_len, b + block)
        span = end - b
        uniq_avg = sum(unique_counts[b:end]) / span
        zero_ratio = sum(zero_counts[b:end]) / (span * len(files))
        ent_avg = sum(entropy_vals[b:end]) / span
        f.write(f"| 0x{b:04x} | {uniq_avg:.2f} | {zero_ratio:.2f} | {ent_avg:.2f} |\n")

print("Wrote", out_md)
