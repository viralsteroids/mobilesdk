from pathlib import Path
import csv

ROOT = Path(r"C:\temp\MobileSDK")
IN_DIR = ROOT / "extracted_bundles" / "assets"
OUT_DIR = ROOT / "decrypted_bundles"
ANALYSIS_DIR = ROOT / "analysis"
ANALYSIS_DIR.mkdir(parents=True, exist_ok=True)

pairs = []
for inp in sorted(IN_DIR.glob("*.se")):
    base = inp.stem
    out = OUT_DIR / f"{base}_decrypted_raw.bin"
    if not out.exists():
        continue
    pairs.append((base, inp, out))

rows = []
for base, inp, out in pairs:
    in_data = inp.read_bytes()
    out_data = out.read_bytes()
    in_size = len(in_data)
    out_size = len(out_data)
    diff = in_size - out_size
    # direct strip check
    strip_ok = False
    if diff >= 0 and diff + out_size <= in_size:
        strip_ok = in_data[diff:diff+out_size] == out_data
    # payload check (offset 95)
    payload_off = 95
    payload_ok = False
    if payload_off + out_size <= in_size:
        payload_ok = in_data[payload_off:payload_off+out_size] == out_data

    # best small-offset match on first 4096 bytes
    best = (0, 0)  # matches, offset
    win = 4096
    max_off = 256
    for off in range(0, max_off+1):
        if off + win > in_size or win > out_size:
            continue
        in_slice = in_data[off:off+win]
        out_slice = out_data[:win]
        matches = sum(1 for a,b in zip(in_slice, out_slice) if a == b)
        if matches > best[0]:
            best = (matches, off)

    rows.append({
        "bundle": base,
        "input_size": in_size,
        "output_size": out_size,
        "diff": diff,
        "strip_match": int(strip_ok),
        "payload_match": int(payload_ok),
        "best_match_4096": best[0],
        "best_offset": best[1],
    })

out_csv = ANALYSIS_DIR / "decrypted_alignment_check.csv"
with out_csv.open("w", newline="", encoding="utf-8") as f:
    w = csv.writer(f)
    w.writerow(["bundle","input_size","output_size","diff","strip_match","payload_match","best_match_4096","best_offset"])
    for r in rows:
        w.writerow([r[k] for k in [
            "bundle","input_size","output_size","diff","strip_match","payload_match","best_match_4096","best_offset"
        ]])

out_md = ANALYSIS_DIR / "decrypted_alignment_check.md"
lines = []
lines.append("# Decrypted output alignment check")
lines.append("")
for r in rows:
    lines.append(
        f"- {r['bundle']}: diff={r['diff']} strip_match={r['strip_match']} payload_match={r['payload_match']} "
        f"best_offset={r['best_offset']} best_match_4096={r['best_match_4096']}"
    )

out_md.write_text("\n".join(lines), encoding="ascii", errors="ignore")
print(str(out_csv))
print(str(out_md))
