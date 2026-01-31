import os, glob, struct

root = r"C:\\temp\\MobileSDK"
paths = sorted(glob.glob(os.path.join(root, "se_dumps", "latest", "zstd_out_*.bin")))
if not paths:
    raise SystemExit("No zstd_out_*.bin files found")

files = [open(p, "rb").read() for p in paths]
min_len = min(len(d) for d in files)

# Collect variable offsets (byte-level)
variable_offsets = []
const_offsets = []
for i in range(min_len):
    vals = {d[i] for d in files}
    if len(vals) == 1:
        const_offsets.append(i)
    else:
        variable_offsets.append((i, vals))

# Group variable offsets into runs
runs = []
start = None
prev = None
for i, _ in variable_offsets:
    if start is None:
        start = i
        prev = i
    elif i == prev + 1:
        prev = i
    else:
        runs.append((start, prev - start + 1))
        start = i
        prev = i
if start is not None:
    runs.append((start, prev - start + 1))

# u32 alignment variability (by 4-byte chunks)
var_u32 = []
for off in range(0, min_len - 4 + 1, 4):
    vals = set(struct.unpack('<I', d[off:off+4])[0] for d in files)
    if len(vals) > 1:
        var_u32.append((off, vals))

out_md = os.path.join(root, "analysis", "zstd_out_variable_offsets.md")
with open(out_md, "w", encoding="ascii") as f:
    f.write("# ZSTD out variable offsets (byte-level)\n\n")
    f.write(f"Files: {len(files)}; common length: {min_len} bytes\n\n")
    f.write(f"Variable byte positions: {len(variable_offsets)} ({len(variable_offsets)/min_len:.2%})\n\n")
    f.write("## Variable runs (contiguous ranges)\n\n")
    f.write("| offset | length |\n| --- | --- |\n")
    for off, ln in runs[:200]:
        f.write(f"| 0x{off:x} | {ln} |\n")
    if len(runs) > 200:
        f.write(f"\n... {len(runs)-200} more runs omitted\n")

    f.write("\n## Variable u32 offsets (aligned)\n\n")
    f.write("| offset | values |\n| --- | --- |\n")
    for off, vals in var_u32[:120]:
        vals_list = sorted(vals)
        sample = ', '.join(f"0x{v:08x}" for v in vals_list[:6])
        if len(vals_list) > 6:
            sample += ', ...'
        f.write(f"| 0x{off:x} | {sample} |\n")
    if len(var_u32) > 120:
        f.write(f"\n... {len(var_u32)-120} more u32 offsets omitted\n")

print("Wrote", out_md)
