import os, glob, math

root = r"C:\\temp\\MobileSDK"
paths = sorted(glob.glob(os.path.join(root, "se_dumps", "latest", "zstd_out_*.bin")))
if not paths:
    raise SystemExit("No zstd_out_*.bin files found")

files = [open(p, "rb").read() for p in paths]
min_len = min(len(d) for d in files)

out_md = os.path.join(root, "analysis", "zstd_out_cross_stats.md")

def entropy(data):
    if not data:
        return 0.0
    freq = [0]*256
    for b in data:
        freq[b] += 1
    ent = 0.0
    n = len(data)
    for c in freq:
        if c:
            p = c / n
            ent -= p * math.log2(p)
    return ent

# Per-file stats
file_stats = []
for p, data in zip(paths, files):
    z = data.count(0)
    ff = data.count(0xFF)
    ent = entropy(data)
    file_stats.append((os.path.basename(p), len(data), ent, z/len(data), ff/len(data)))

# Cross-file constant bytes
const_byte = [None] * min_len
for i in range(min_len):
    b = files[0][i]
    same = True
    for data in files[1:]:
        if data[i] != b:
            same = False
            break
    if same:
        const_byte[i] = b

# Summarize constant byte runs
runs = []
start = None
for i, b in enumerate(const_byte):
    if b is not None:
        if start is None:
            start = i
            val = b
        elif b != val:
            runs.append((start, i - start, val))
            start = i
            val = b
    else:
        if start is not None:
            runs.append((start, i - start, val))
            start = None
if start is not None:
    runs.append((start, min_len - start, val))

runs.sort(key=lambda x: x[1], reverse=True)

# Constant u32 at aligned offsets
const_u32 = []
for off in range(0, min_len - 4 + 1, 4):
    v0 = int.from_bytes(files[0][off:off+4], "little")
    same = True
    for data in files[1:]:
        if int.from_bytes(data[off:off+4], "little") != v0:
            same = False
            break
    if same:
        const_u32.append((off, v0))

# Build markdown
with open(out_md, "w", encoding="ascii") as f:
    f.write("# ZSTD out cross-file stats\n\n")
    f.write("Files scanned:\n")
    for name, size, ent, zratio, ffratio in file_stats:
        f.write(f"- {name}: size={size}, entropy={ent:.3f}, zero_ratio={zratio:.3f}, ff_ratio={ffratio:.3f}\n")
    f.write("\n")
    f.write(f"Common length used for cross-stats: {min_len} bytes\n\n")

    total_const = sum(1 for b in const_byte if b is not None)
    f.write(f"Constant byte positions across all files: {total_const} ({total_const/min_len:.2%} of common length)\n\n")

    f.write("## Top constant-byte runs (across all files)\n\n")
    if runs:
        f.write("| offset | length | byte |\n| --- | --- | --- |\n")
        for off, ln, val in runs[:30]:
            f.write(f"| 0x{off:x} | {ln} | 0x{val:02x} |\n")
    else:
        f.write("No constant runs found.\n")

    f.write("\n## Constant u32 values at 4-byte aligned offsets\n\n")
    if const_u32:
        f.write("| offset | u32 |\n| --- | --- |\n")
        for off, v in const_u32[:80]:
            f.write(f"| 0x{off:x} | 0x{v:08x} |\n")
        if len(const_u32) > 80:
            f.write(f"\n... {len(const_u32)-80} more entries omitted\n")
    else:
        f.write("No constant u32 values found.\n")

print("Wrote", out_md)
