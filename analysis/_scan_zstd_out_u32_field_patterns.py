import os, glob, struct

root = r"C:\\temp\\MobileSDK"
paths = sorted(glob.glob(os.path.join(root, "se_dumps", "latest", "zstd_out_*.bin")))
if not paths:
    raise SystemExit("No zstd_out_*.bin files found")

files = [open(p, "rb").read() for p in paths]
min_len = min(len(d) for d in files)

# collect variable u32 offsets
var_u32 = []
for off in range(0, min_len - 4 + 1, 4):
    vals = [struct.unpack('<I', d[off:off+4])[0] for d in files]
    if len(set(vals)) > 1:
        var_u32.append((off, vals))

out_md = os.path.join(root, "analysis", "zstd_out_u32_field_patterns.md")
with open(out_md, "w", encoding="ascii") as f:
    f.write("# ZSTD out u32 field patterns\n\n")
    f.write(f"Files: {len(files)}; common length: {min_len}\n\n")
    f.write("| offset | values | hi8 | hi16 | lo16 |\n| --- | --- | --- | --- | --- |\n")
    for off, vals in var_u32[:120]:
        uniq = list(dict.fromkeys(vals))
        hi8 = sorted({(v >> 24) & 0xFF for v in uniq})
        hi16 = sorted({(v >> 16) & 0xFFFF for v in uniq})
        lo16 = sorted({v & 0xFFFF for v in uniq})
        def fmt_list(lst, width):
            return ','.join(f"0x{v:0{width}x}" for v in lst[:6]) + ("..." if len(lst) > 6 else "")
        val_str = ', '.join(f"0x{v:08x}" for v in uniq[:6]) + ("..." if len(uniq) > 6 else "")
        f.write(f"| 0x{off:x} | {val_str} | {fmt_list(hi8,2)} | {fmt_list(hi16,4)} | {fmt_list(lo16,4)} |\n")
    if len(var_u32) > 120:
        f.write(f"\n... {len(var_u32)-120} more variable u32 offsets omitted\n")

print("Wrote", out_md)
