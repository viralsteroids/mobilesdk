import os, glob
import struct

root = r"C:\\temp\\MobileSDK"
paths = sorted(glob.glob(os.path.join(root, "se_dumps", "latest", "zstd_out_*.bin")))
if not paths:
    raise SystemExit("No zstd_out_*.bin files found")

files = [open(p, "rb").read() for p in paths]
min_len = min(len(d) for d in files)

# For each 4-byte aligned offset, see if values are sequential (0..n-1) across files
seq_offsets = []
for off in range(0, min_len - 4 + 1, 4):
    vals = [struct.unpack('<I', d[off:off+4])[0] for d in files]
    uniq = sorted(set(vals))
    if len(uniq) >= 3:
        # check if uniq is a contiguous small range
        if uniq == list(range(min(uniq), max(uniq)+1)) and max(uniq) - min(uniq) <= 10:
            seq_offsets.append((off, uniq))

out_md = os.path.join(root, "analysis", "zstd_out_u32_seq_offsets.md")
with open(out_md, "w", encoding="ascii") as f:
    f.write("# ZSTD out u32 sequential offsets\n\n")
    f.write(f"Files: {len(files)}; common length: {min_len}\n\n")
    if not seq_offsets:
        f.write("No u32 offsets with contiguous small ranges found.\n")
    else:
        f.write("| offset | values |\n| --- | --- |\n")
        for off, uniq in seq_offsets[:120]:
            f.write(f"| 0x{off:x} | {', '.join(hex(v) for v in uniq)} |\n")
        if len(seq_offsets) > 120:
            f.write(f"\n... {len(seq_offsets)-120} more omitted\n")

print("Wrote", out_md)
