import math
import csv
from pathlib import Path

ROOT = Path(r"C:\temp\MobileSDK")
IN_DIR = ROOT / "extracted_bundles" / "assets"
ANALYSIS_DIR = ROOT / "analysis"
ANALYSIS_DIR.mkdir(parents=True, exist_ok=True)

WINDOW = 64 * 1024
STEP = 4096
TOP_N = 5


def entropy(data: bytes) -> float:
    if not data:
        return 0.0
    counts = [0] * 256
    for b in data:
        counts[b] += 1
    n = len(data)
    ent = 0.0
    for c in counts:
        if c:
            p = c / n
            ent -= p * math.log2(p)
    return ent

rows = []
summary = []
for p in sorted(IN_DIR.glob("*.se")):
    data = p.read_bytes()[95:]
    size = len(data)
    if size < WINDOW:
        ent = entropy(data)
        rows.append({
            "bundle": p.name,
            "offset": 0,
            "window": size,
            "entropy": f"{ent:.5f}",
        })
        summary.append((p.name, [(0, ent)]))
        continue

    best = []
    for off in range(0, size - WINDOW + 1, STEP):
        chunk = data[off:off+WINDOW]
        ent = entropy(chunk)
        best.append((ent, off))
    best.sort(key=lambda x: x[0])
    top = best[:TOP_N]
    summary.append((p.name, [(off, ent) for ent, off in top]))
    for ent, off in top:
        rows.append({
            "bundle": p.name,
            "offset": off,
            "window": WINDOW,
            "entropy": f"{ent:.5f}",
        })

out_csv = ANALYSIS_DIR / "payload_entropy_profile.csv"
with out_csv.open("w", newline="", encoding="utf-8") as f:
    w = csv.writer(f)
    w.writerow(["bundle","offset","window","entropy"])
    for r in rows:
        w.writerow([r["bundle"], r["offset"], r["window"], r["entropy"]])

out_md = ANALYSIS_DIR / "payload_entropy_profile.md"
lines = []
lines.append("# Payload entropy profile (64KB windows, step 4KB)")
lines.append("")
for name, entries in summary:
    parts = ", ".join([f"0x{off:x}: {ent:.5f}" for off, ent in entries])
    lines.append(f"- {name}: {parts}")

out_md.write_text("\n".join(lines), encoding="ascii", errors="ignore")
print(str(out_csv))
print(str(out_md))
