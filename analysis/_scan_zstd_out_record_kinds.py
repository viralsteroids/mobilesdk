import os, glob, struct
from collections import Counter, defaultdict

root = r"C:\\temp\\MobileSDK"
paths = sorted(glob.glob(os.path.join(root, "se_dumps", "latest", "zstd_out_*.bin")))
if not paths:
    raise SystemExit("No zstd_out_*.bin files found")

out_md = os.path.join(root, "analysis", "zstd_out_record_kinds.md")

with open(out_md, "w", encoding="ascii") as f:
    f.write("# ZSTD out early record kinds (0x28..0x340)\n\n")
    f.write(f"Files: {len(paths)}\n\n")
    for p in paths:
        data = open(p, "rb").read()
        end = min(0x340, len(data) - (len(data) % 8))
        recs = []
        for off in range(0x28, end, 8):
            val = struct.unpack('<I', data[off:off+4])[0]
            idx = struct.unpack('<I', data[off+4:off+8])[0]
            kind = (val >> 24) & 0xff
            mid = (val >> 16) & 0xff
            size = val & 0xffff
            recs.append((off, val, idx, kind, mid, size))
        kind_counts = Counter(r[3] for r in recs)
        idx_vals = [r[2] for r in recs]
        idx_min = min(idx_vals) if idx_vals else 0
        idx_max = max(idx_vals) if idx_vals else 0
        monotonic = all(b >= a for a, b in zip(idx_vals, idx_vals[1:]))
        by_kind = defaultdict(list)
        for _, _, _, k, _, size in recs:
            by_kind[k].append(size)
        f.write(f"## {os.path.basename(p)}\n\n")
        f.write(f"Records parsed: {len(recs)} (offsets 0x28..0x{end-1:03x})\n\n")
        f.write(f"Index range: {idx_min}..{idx_max}; monotonic nondecreasing: {monotonic}\n\n")
        f.write("Kind counts (kind -> count):\n\n")
        for k, c in sorted(kind_counts.items()):
            f.write(f"- 0x{k:02x}: {c}\n")
        f.write("\nSize ranges by kind:\n\n")
        for k in sorted(by_kind.keys()):
            sizes = by_kind[k]
            f.write(f"- 0x{k:02x}: min=0x{min(sizes):04x} max=0x{max(sizes):04x}\n")
        f.write("\nFirst 12 records (off, val, idx, kind, mid, size):\n\n")
        f.write("```")
        for off, val, idx, kind, mid, size in recs[:12]:
            f.write(f"\n0x{off:03x} val=0x{val:08x} idx=0x{idx:08x} kind=0x{kind:02x} mid=0x{mid:02x} size=0x{size:04x}")
        f.write("\n```\n\n")

print("Wrote", out_md)
