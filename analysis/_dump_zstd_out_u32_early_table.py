import os, glob, struct

root = r"C:\\temp\\MobileSDK"
paths = sorted(glob.glob(os.path.join(root, "se_dumps", "latest", "zstd_out_*.bin")))
if not paths:
    raise SystemExit("No zstd_out_*.bin files found")

files = [open(p, "rb").read() for p in paths]
min_len = min(len(d) for d in files)

# Focus on early region (0x000..0x340)
end = min(0x340, min_len - (min_len % 4))
rows = []
for off in range(0, end, 4):
    vals = [struct.unpack('<I', d[off:off+4])[0] for d in files]
    uniq = list(dict.fromkeys(vals))
    rows.append((off, vals, uniq))

out_md = os.path.join(root, "analysis", "zstd_out_u32_early_table.md")
with open(out_md, "w", encoding="ascii") as f:
    f.write("# ZSTD out u32 table (0x000..0x340)\n\n")
    f.write(f"Files: {len(files)}; common length: {min_len}\n\n")
    f.write("| offset | v0 | v1 | v2 | v3 | v4 | uniq |\n| --- | --- | --- | --- | --- | --- | --- |\n")
    for off, vals, uniq in rows:
        vals_hex = [f"0x{v:08x}" for v in vals]
        uniq_hex = ','.join(f"0x{v:08x}" for v in uniq)
        while len(vals_hex) < 5:
            vals_hex.append("")
        f.write(f"| 0x{off:03x} | {vals_hex[0]} | {vals_hex[1]} | {vals_hex[2]} | {vals_hex[3]} | {vals_hex[4]} | {uniq_hex} |\n")

print("Wrote", out_md)
