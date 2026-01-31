import math
import itertools
import csv
import re
from pathlib import Path

ROOT = Path(r"C:\temp\MobileSDK")
IN_DIR = ROOT / "extracted_bundles" / "assets"
ANALYSIS_DIR = ROOT / "analysis"
ANALYSIS_DIR.mkdir(parents=True, exist_ok=True)

MAGICS = {
    bytes.fromhex("28 b5 2f fd"): "zstd",
    bytes.fromhex("1f 8b 08"): "gzip",
    bytes.fromhex("78 9c"): "zlib",
    bytes.fromhex("78 da"): "zlib",
    b"PK\x03\x04": "zip",
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


def find_magics(data: bytes, limit=6):
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


def ascii_sample(data: bytes):
    m = PRINTABLE.search(data)
    if not m:
        return ""
    return data[m.start():m.start()+120].decode("ascii", "replace")


def parse_version(data: bytes):
    t = [i for i,b in enumerate(data) if b == 0x7e][:3]
    if len(t) < 2:
        return ""
    return data[t[0]+1:t[1]].decode("ascii", "ignore")

bundles = []
for p in sorted(IN_DIR.glob("*.se")):
    data = p.read_bytes()
    ver = parse_version(data)
    payload = data[95:]
    bundles.append((p.name, ver, payload))

# group by version
by_ver = {}
for name, ver, payload in bundles:
    by_ver.setdefault(ver, []).append((name, payload))

rows = []
for ver, items in sorted(by_ver.items()):
    for (name_a, payload_a), (name_b, payload_b) in itertools.combinations(items, 2):
        n = min(len(payload_a), len(payload_b))
        xor = bytes(a ^ b for a,b in zip(payload_a[:n], payload_b[:n]))
        ent = entropy(xor)
        printable = sum(1 for b in xor if 32 <= b < 127 or b in (9,10,13)) / max(1, n)
        magics = find_magics(xor)
        sample = ascii_sample(xor)
        rows.append({
            "version": ver,
            "file_a": name_a,
            "file_b": name_b,
            "xor_len": n,
            "entropy": f"{ent:.5f}",
            "printable_ratio": f"{printable:.5f}",
            "magic_hits": str(magics),
            "ascii_sample": sample,
        })

out_csv = ANALYSIS_DIR / "payload_xor_probe.csv"
with out_csv.open("w", newline="", encoding="utf-8") as f:
    w = csv.writer(f)
    w.writerow(["version","file_a","file_b","xor_len","entropy","printable_ratio","magic_hits","ascii_sample"])
    for r in rows:
        w.writerow([r[k] for k in ["version","file_a","file_b","xor_len","entropy","printable_ratio","magic_hits","ascii_sample"]])

out_md = ANALYSIS_DIR / "payload_xor_probe.md"
lines = []
lines.append("# Payload XOR probe (same-version bundles)")
lines.append("")
if not rows:
    lines.append("No same-version pairs found.")
else:
    for r in rows:
        lines.append(
            f"- ver={r['version']} {r['file_a']} XOR {r['file_b']}: ent={r['entropy']} printable={r['printable_ratio']} magics={r['magic_hits']}"
        )

out_md.write_text("\n".join(lines), encoding="ascii", errors="ignore")
print(str(out_csv))
print(str(out_md))
