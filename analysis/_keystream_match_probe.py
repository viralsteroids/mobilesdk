import csv
from pathlib import Path

ROOT = Path(r"C:\temp\MobileSDK")
IN_DIR = ROOT / "extracted_bundles" / "assets"
OUT_DIR = ROOT / "decrypted_bundles"
ANALYSIS_DIR = ROOT / "analysis"
ANALYSIS_DIR.mkdir(parents=True, exist_ok=True)

MAX_OFF = 256
WIN = 4096

# Collect bundles with decrypted outputs
bundles = []
for inp in sorted(IN_DIR.glob("*.se")):
    base = inp.stem
    out = OUT_DIR / f"{base}_decrypted_raw.bin"
    if not out.exists():
        continue
    data = inp.read_bytes()
    payload = data[95:]
    dec = out.read_bytes()
    bundles.append((base, payload, dec))

rows = []

# Compare keystreams between all pairs (same version assumed by name group)
# Use keystream = payload[offset:offset+WIN] XOR dec[0:WIN]
for i in range(len(bundles)):
    base_a, pay_a, dec_a = bundles[i]
    for j in range(i+1, len(bundles)):
        base_b, pay_b, dec_b = bundles[j]
        best = (0.0, 0, 0)  # match_ratio, off_a, off_b
        for off_a in range(0, min(MAX_OFF, len(pay_a) - WIN) + 1):
            if off_a + WIN > len(pay_a) or WIN > len(dec_a):
                continue
            ks_a = bytes(a ^ b for a,b in zip(pay_a[off_a:off_a+WIN], dec_a[:WIN]))
            for off_b in range(0, min(MAX_OFF, len(pay_b) - WIN) + 1):
                if off_b + WIN > len(pay_b) or WIN > len(dec_b):
                    continue
                ks_b = bytes(a ^ b for a,b in zip(pay_b[off_b:off_b+WIN], dec_b[:WIN]))
                matches = sum(1 for a,b in zip(ks_a, ks_b) if a == b)
                ratio = matches / WIN
                if ratio > best[0]:
                    best = (ratio, off_a, off_b)
        rows.append({
            "bundle_a": base_a,
            "bundle_b": base_b,
            "best_match_ratio": f"{best[0]:.5f}",
            "best_offset_a": best[1],
            "best_offset_b": best[2],
        })

out_csv = ANALYSIS_DIR / "keystream_match_probe.csv"
with out_csv.open("w", newline="", encoding="utf-8") as f:
    w = csv.writer(f)
    w.writerow(["bundle_a","bundle_b","best_match_ratio","best_offset_a","best_offset_b"])
    for r in rows:
        w.writerow([r[k] for k in ["bundle_a","bundle_b","best_match_ratio","best_offset_a","best_offset_b"]])

out_md = ANALYSIS_DIR / "keystream_match_probe.md"
lines = []
lines.append("# Keystream match probe")
lines.append("")
lines.append(f"Window: {WIN} bytes, offsets 0..{MAX_OFF}")
lines.append("")
if not rows:
    lines.append("No bundle pairs found.")
else:
    for r in rows:
        lines.append(
            f"- {r['bundle_a']} vs {r['bundle_b']}: best_match_ratio={r['best_match_ratio']} "
            f"off_a={r['best_offset_a']} off_b={r['best_offset_b']}"
        )

out_md.write_text("\n".join(lines), encoding="ascii", errors="ignore")
print(str(out_csv))
print(str(out_md))
