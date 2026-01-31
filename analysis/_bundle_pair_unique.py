import csv
from pathlib import Path

ROOT = Path(r"C:\temp\MobileSDK")
OUTPUT_DIR = ROOT / "decrypted_bundles"

# Map decrypted outputs by base name
output_map = {}
for f in OUTPUT_DIR.glob("*.bin"):
    name = f.name
    base = None
    priority = None
    if name.endswith("_decrypted_raw.bin"):
        base = name[:-len("_decrypted_raw.bin")]
        priority = 0
    elif name.endswith("_last_attempt.bin"):
        base = name[:-len("_last_attempt.bin")]
        priority = 1
    if base is None:
        continue
    size = f.stat().st_size
    prev = output_map.get(base)
    if prev is None or priority < prev[2]:
        output_map[base] = (f, size, priority)

# Build pairs from all .se inputs
inputs = list(ROOT.rglob("*.se"))
pairs = []
for p in inputs:
    base = p.stem
    if base not in output_map:
        continue
    out_path, out_size, _prio = output_map[base]
    in_size = p.stat().st_size
    diff = in_size - out_size
    pairs.append((base, p, in_size, out_path, out_size, diff))

# Unique by bundle name (pick first occurrence)
unique = {}
for base, p, in_size, out_path, out_size, diff in pairs:
    if base not in unique:
        unique[base] = (p, in_size, out_path, out_size, diff)

out_csv = Path(r"C:\temp\MobileSDK\analysis\bundle_pair_size_diff_unique.csv")
with out_csv.open("w", newline="", encoding="utf-8") as f:
    w = csv.writer(f)
    w.writerow(["bundle_name","input_path","input_size","output_path","output_size","diff"])
    for base, (p, in_size, out_path, out_size, diff) in sorted(unique.items()):
        w.writerow([base, str(p), in_size, str(out_path), out_size, diff])

# Summary
summary = Path(r"C:\temp\MobileSDK\analysis\bundle_pair_size_diff_summary.md")
lines = []
lines.append("# Bundle size diff summary (unique bundles)")
lines.append("")
lines.append(f"Unique bundles with outputs: {len(unique)}")
lines.append("")
lines.append("## Diffs")
for base, (p, in_size, out_path, out_size, diff) in sorted(unique.items()):
    lines.append(f"- {base}: input {in_size} bytes, output {out_size} bytes, diff {diff} bytes")
lines.append("")
lines.append("Notes:")
lines.append("- Only bundles with matching decrypted outputs are listed.")
lines.append("- The top-35 size-diff list is dominated by duplicates across multiple APKs.")
summary.write_text("\n".join(lines), encoding="ascii", errors="ignore")

print(str(out_csv))
print(str(summary))
