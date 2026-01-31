import math
import csv
from pathlib import Path

ROOT = Path(r"C:\temp\MobileSDK")
IN_DIR = ROOT / "extracted_bundles" / "assets"
ANALYSIS_DIR = ROOT / "analysis"
ANALYSIS_DIR.mkdir(parents=True, exist_ok=True)

SAMPLE_LIMIT = 8 * 1024 * 1024  # 8MB
BLOCK = 16


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
for p in sorted(IN_DIR.glob("*.se")):
    data = p.read_bytes()
    payload = data[95:]
    size = len(payload)
    sample = payload[:SAMPLE_LIMIT]
    n_blocks = len(sample) // BLOCK
    blocks = [sample[i*BLOCK:(i+1)*BLOCK] for i in range(n_blocks)]
    uniq = len(set(blocks)) if blocks else 0
    repeat = n_blocks - uniq

    rows.append({
        "bundle": p.name,
        "payload_len": size,
        "mod16": size % 16,
        "mod8": size % 8,
        "mod4": size % 4,
        "sample_bytes": len(sample),
        "sample_blocks": n_blocks,
        "unique_blocks": uniq,
        "repeat_blocks": repeat,
        "repeat_ratio": f"{(repeat / n_blocks) if n_blocks else 0:.6f}",
        "entropy_sample": f"{entropy(sample):.5f}",
    })

out_csv = ANALYSIS_DIR / "ciphertext_block_stats.csv"
with out_csv.open("w", newline="", encoding="utf-8") as f:
    w = csv.writer(f)
    w.writerow(["bundle","payload_len","mod16","mod8","mod4","sample_bytes","sample_blocks","unique_blocks","repeat_blocks","repeat_ratio","entropy_sample"])
    for r in rows:
        w.writerow([r[k] for k in [
            "bundle","payload_len","mod16","mod8","mod4","sample_bytes","sample_blocks","unique_blocks","repeat_blocks","repeat_ratio","entropy_sample"
        ]])

out_md = ANALYSIS_DIR / "ciphertext_block_stats.md"
lines = []
lines.append("# Ciphertext block stats (payloads from on-disk bundles)")
lines.append("")
lines.append(f"Sample window: {SAMPLE_LIMIT} bytes, block size: {BLOCK} bytes")
lines.append("")
for r in rows:
    lines.append(
        f"- {r['bundle']}: len={r['payload_len']} mod16={r['mod16']} repeat_ratio={r['repeat_ratio']} ent={r['entropy_sample']}"
    )

out_md.write_text("\n".join(lines), encoding="ascii", errors="ignore")
print(str(out_csv))
print(str(out_md))
