import re
import math
import json
from pathlib import Path
import csv

ROOT = Path(r"C:\temp\MobileSDK")
INPUT_DIR = ROOT / "decrypted_bundles"
ANALYSIS_DIR = ROOT / "analysis"
ANALYSIS_DIR.mkdir(parents=True, exist_ok=True)

MAGICS = {
    bytes.fromhex("28 b5 2f fd"): "zstd",
    bytes.fromhex("1f 8b 08"): "gzip",
    bytes.fromhex("78 9c"): "zlib",
    bytes.fromhex("78 da"): "zlib",
    b"PK\x03\x04": "zip",
    bytes.fromhex("04 22 4d 18"): "lz4",
    b"FD7zXZ\x00": "xz",
    b"7z\xbc\xaf\x27\x1c": "7z",
    b"BZh": "bzip2",
    bytes.fromhex("5d 00 00 80"): "lzma",
    b"%PDF": "pdf",
    b"\x89PNG\r\n\x1a\n": "png",
    bytes.fromhex("ff d8 ff"): "jpeg",
    b"OggS": "ogg",
    b"fLaC": "flac",
    b"RIFF": "riff",
}

PRINTABLE = re.compile(rb"[\x20-\x7E\t\r\n]{64,}")


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


def find_magics(data: bytes, limit=8):
    hits = []
    for magic, name in MAGICS.items():
        start = 0
        while True:
            idx = data.find(magic, start)
            if idx == -1:
                break
            hits.append((idx, name))
            if len(hits) >= limit:
                return sorted(hits, key=lambda x: x[0])
            start = idx + 1
    return sorted(hits, key=lambda x: x[0])


def ascii_snips(data: bytes, limit=3):
    out = []
    sample = ""
    for m in PRINTABLE.finditer(data):
        if len(out) >= limit:
            break
        out.append(m.start())
        if not sample:
            chunk = data[m.start():m.end()][:120]
            try:
                sample = chunk.decode("ascii", "replace")
            except Exception:
                sample = ""
    return out, sample


def u32_stats(buf: bytes, file_size: int, max_words=256):
    n = min(len(buf) // 4, max_words)
    vals = [int.from_bytes(buf[i*4:i*4+4], "little") for i in range(n)]
    # monotonic prefix
    mono = 0
    prev = -1
    for v in vals:
        if v >= prev:
            mono += 1
            prev = v
        else:
            break
    lt_size = sum(1 for v in vals if v < file_size)
    align4 = sum(1 for v in vals if v % 4 == 0)
    align16 = sum(1 for v in vals if v % 16 == 0)
    align4096 = sum(1 for v in vals if v % 4096 == 0)
    return mono, lt_size, align4, align16, align4096

rows = []
files = sorted(INPUT_DIR.glob("*_decrypted_raw.bin"))

for p in files:
    data = p.read_bytes()
    size = len(data)
    ent_total = entropy(data)
    ent_1m = entropy(data[:1024*1024])
    zero_ratio = data.count(0) / max(1, size)
    printable = sum(1 for b in data if 32 <= b < 127 or b in (9,10,13))
    printable_ratio = printable / max(1, size)

    magics = find_magics(data, limit=8)
    ascii_offsets, ascii_sample = ascii_snips(data, limit=3)
    mono, lt_size, a4, a16, a4096 = u32_stats(data[:4096], size)

    rows.append({
        "file": p.name,
        "size": size,
        "entropy_total": f"{ent_total:.5f}",
        "entropy_1m": f"{ent_1m:.5f}",
        "zero_ratio": f"{zero_ratio:.5f}",
        "printable_ratio": f"{printable_ratio:.5f}",
        "head_hex": data[:16].hex(),
        "magic_hits": json.dumps(magics),
        "ascii_offsets": json.dumps(ascii_offsets),
        "ascii_sample": ascii_sample,
        "u32_mono_prefix": mono,
        "u32_lt_size_count": lt_size,
        "u32_align4": a4,
        "u32_align16": a16,
        "u32_align4096": a4096,
    })

out_csv = ANALYSIS_DIR / "decrypted_payload_scan.csv"
with out_csv.open("w", newline="", encoding="utf-8") as f:
    w = csv.writer(f)
    w.writerow([
        "file","size","entropy_total","entropy_1m","zero_ratio","printable_ratio",
        "head_hex","magic_hits","ascii_offsets","ascii_sample",
        "u32_mono_prefix","u32_lt_size_count","u32_align4","u32_align16","u32_align4096"
    ])
    for r in rows:
        w.writerow([r[k] for k in [
            "file","size","entropy_total","entropy_1m","zero_ratio","printable_ratio",
            "head_hex","magic_hits","ascii_offsets","ascii_sample",
            "u32_mono_prefix","u32_lt_size_count","u32_align4","u32_align16","u32_align4096"
        ]])

out_md = ANALYSIS_DIR / "decrypted_payload_scan.md"
lines = []
lines.append("# Decrypted payload scan (decrypted_bundles/*_decrypted_raw.bin)")
lines.append("")
lines.append(f"Files scanned: {len(rows)}")
lines.append("")
for r in rows:
    lines.append(
        f"- {r['file']}: size={r['size']} ent={r['entropy_total']} zero={r['zero_ratio']} "
        f"printable={r['printable_ratio']} magics={r['magic_hits']} ascii={r['ascii_offsets']}"
    )

out_md.write_text("\n".join(lines), encoding="ascii", errors="ignore")
print(str(out_csv))
print(str(out_md))
