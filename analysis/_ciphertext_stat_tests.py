import math
import csv
from pathlib import Path

ROOT = Path(r"C:\temp\MobileSDK")
IN_DIR = ROOT / "extracted_bundles" / "assets"
ANALYSIS_DIR = ROOT / "analysis"
ANALYSIS_DIR.mkdir(parents=True, exist_ok=True)

SAMPLE_LIMIT = 8 * 1024 * 1024


def bit_bias(data: bytes):
    total_bits = len(data) * 8
    ones = 0
    for b in data:
        ones += bin(b).count("1")
    p1 = ones / total_bits if total_bits else 0.0
    return p1


def autocorr(data: bytes, lag: int):
    if lag <= 0 or len(data) <= lag:
        return 0.0
    matches = sum(1 for i in range(len(data)-lag) if data[i] == data[i+lag])
    return matches / (len(data) - lag)

rows = []
for p in sorted(IN_DIR.glob("*.se")):
    data = p.read_bytes()
    payload = data[95:]
    sample = payload[:SAMPLE_LIMIT]
    p1 = bit_bias(sample)
    ac1 = autocorr(sample, 1)
    ac2 = autocorr(sample, 2)
    ac4 = autocorr(sample, 4)
    ac8 = autocorr(sample, 8)
    rows.append({
        "bundle": p.name,
        "payload_len": len(payload),
        "sample_bytes": len(sample),
        "bit_ones_ratio": f"{p1:.6f}",
        "autocorr_lag1": f"{ac1:.6f}",
        "autocorr_lag2": f"{ac2:.6f}",
        "autocorr_lag4": f"{ac4:.6f}",
        "autocorr_lag8": f"{ac8:.6f}",
    })

out_csv = ANALYSIS_DIR / "ciphertext_stat_tests.csv"
with out_csv.open("w", newline="", encoding="utf-8") as f:
    w = csv.writer(f)
    w.writerow(["bundle","payload_len","sample_bytes","bit_ones_ratio","autocorr_lag1","autocorr_lag2","autocorr_lag4","autocorr_lag8"])
    for r in rows:
        w.writerow([r[k] for k in [
            "bundle","payload_len","sample_bytes","bit_ones_ratio","autocorr_lag1","autocorr_lag2","autocorr_lag4","autocorr_lag8"
        ]])

out_md = ANALYSIS_DIR / "ciphertext_stat_tests.md"
lines = []
lines.append("# Ciphertext statistical tests (payloads from on-disk bundles)")
lines.append("")
lines.append(f"Sample window: {SAMPLE_LIMIT} bytes")
lines.append("")
for r in rows:
    lines.append(
        f"- {r['bundle']}: p1={r['bit_ones_ratio']} ac1={r['autocorr_lag1']} ac2={r['autocorr_lag2']} ac4={r['autocorr_lag4']} ac8={r['autocorr_lag8']}"
    )

out_md.write_text("\n".join(lines), encoding="ascii", errors="ignore")
print(str(out_csv))
print(str(out_md))
