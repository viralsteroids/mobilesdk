import csv
from pathlib import Path
import struct

ROOT = Path(r"C:\temp\MobileSDK")
INPUT_DIR = ROOT / "decrypted_bundles"
ANALYSIS_DIR = ROOT / "analysis"
ANALYSIS_DIR.mkdir(parents=True, exist_ok=True)

WINDOW = 4096  # bytes
STEP = 512     # bytes
MAX_WORDS = 256


def scan_monotonic(buf: bytes, file_size: int):
    # interpret as LE u32
    n = min(len(buf) // 4, MAX_WORDS)
    if n < 8:
        return 0, 0, 0
    vals = struct.unpack("<" + "I" * n, buf[:n*4])
    mono = 0
    prev = -1
    for v in vals:
        if v >= prev:
            mono += 1
            prev = v
        else:
            break
    # count plausible offsets
    lt_size = sum(1 for v in vals if v < file_size)
    align4 = sum(1 for v in vals if v % 4 == 0)
    align16 = sum(1 for v in vals if v % 16 == 0)
    return mono, lt_size, align4, align16

rows = []
for p in sorted(INPUT_DIR.glob("*_decrypted_raw.bin")):
    data = p.read_bytes()
    size = len(data)
    best = (0, 0, 0, 0, 0)  # mono, lt_size, align4, align16, offset
    for off in range(0, max(1, size - WINDOW), STEP):
        buf = data[off:off+WINDOW]
        mono, lt_size, a4, a16 = scan_monotonic(buf, size)
        score = (mono, lt_size, a16, a4)
        if score > best[:4]:
            best = (mono, lt_size, a4, a16, off)
    rows.append({
        "file": p.name,
        "size": size,
        "best_mono": best[0],
        "best_lt_size": best[1],
        "best_align4": best[2],
        "best_align16": best[3],
        "best_offset": best[4],
    })

out_csv = ANALYSIS_DIR / "decrypted_payload_table_scan.csv"
with out_csv.open("w", newline="", encoding="utf-8") as f:
    w = csv.writer(f)
    w.writerow(["file","size","best_mono","best_lt_size","best_align4","best_align16","best_offset"])
    for r in rows:
        w.writerow([r[k] for k in ["file","size","best_mono","best_lt_size","best_align4","best_align16","best_offset"]])

out_md = ANALYSIS_DIR / "decrypted_payload_table_scan.md"
lines = []
lines.append("# Decrypted payload table scan (monotonic u32 windows)")
lines.append("")
lines.append(f"Window: {WINDOW} bytes, step: {STEP} bytes, max words: {MAX_WORDS}")
lines.append("")
for r in rows:
    lines.append(
        f"- {r['file']}: best_mono={r['best_mono']} lt_size={r['best_lt_size']} "
        f"align16={r['best_align16']} offset=0x{int(r['best_offset']):x}"
    )

out_md.write_text("\n".join(lines), encoding="ascii", errors="ignore")
print(str(out_csv))
print(str(out_md))
