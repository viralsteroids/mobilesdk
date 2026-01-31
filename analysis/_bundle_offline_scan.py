from pathlib import Path
import csv
import re
import json

ROOT = Path(r"C:\temp\MobileSDK")
ANALYSIS_DIR = ROOT / "analysis"
OUTPUT_DIR = ROOT / "decrypted_bundles"

ANALYSIS_DIR.mkdir(parents=True, exist_ok=True)

# Map decrypted outputs by base name
output_map = {}  # base -> (path, size, priority)
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

# Gather all .se inputs
inputs = list(ROOT.rglob("*.se"))

pairs = []
for p in inputs:
    base = p.stem
    if base not in output_map:
        continue
    out_path, out_size, _prio = output_map[base]
    in_size = p.stat().st_size
    diff = in_size - out_size
    pairs.append((abs(diff), diff, p, in_size, out_path, out_size))

pairs.sort(key=lambda x: (-x[0], -x[3], str(x[2])))

# Top 35
TOP_N = 35
selected = pairs[:TOP_N]

# Build a smaller sample set for detailed scans (dedupe by base name)
sample_map = {}
for entry in pairs:
    _absdiff, _diff, p, _in_size, _out_path, _out_size = entry
    base = p.stem
    if base not in sample_map:
        sample_map[base] = entry
samples = list(sample_map.values())

# Write size-diff CSV
pair_csv = ANALYSIS_DIR / "bundle_pair_size_diff.csv"
with pair_csv.open("w", newline="", encoding="utf-8") as f:
    w = csv.writer(f)
    w.writerow(["input_path","input_size","output_path","output_size","diff"])
    for _absdiff, diff, p, in_size, out_path, out_size in selected:
        w.writerow([str(p), in_size, str(out_path), out_size, diff])

# Scan for zstd/json offsets in sample inputs
ZSTD_MAGIC = bytes.fromhex("28 b5 2f fd")
CONST = bytes.fromhex("76f6f2fb17591a73192c515d55b72060")
PRINTABLE = re.compile(rb"[\x20-\x7E]{16,}")

sample_csv = ANALYSIS_DIR / "bundle_zstd_json_offsets.csv"
with sample_csv.open("w", newline="", encoding="utf-8") as f:
    w = csv.writer(f)
    w.writerow([
        "input_path","input_size","header_end","payload_offset","const_match",
        "zstd_offsets","json_offsets","json_sample"
    ])
    for _absdiff, diff, p, in_size, out_path, out_size in samples:
        data = p.read_bytes()
        tilde_positions = [i for i,b in enumerate(data) if b == 0x7e]
        header_end = tilde_positions[2] + 1 if len(tilde_positions) >= 3 else None
        const_match = False
        payload_offset = header_end
        if header_end is not None and header_end + 36 <= len(data):
            if data[header_end+20:header_end+36] == CONST:
                const_match = True
                payload_offset = header_end + 36
        # zstd offsets
        zstd_offsets = []
        start = 0
        while True:
            idx = data.find(ZSTD_MAGIC, start)
            if idx == -1:
                break
            zstd_offsets.append(idx)
            start = idx + 1
        # json offsets + sample
        json_offsets = []
        json_sample = ""
        for m in PRINTABLE.finditer(data):
            chunk = data[m.start():m.end()]
            if b"{" in chunk or b"[" in chunk:
                json_offsets.append(m.start())
                if not json_sample:
                    try:
                        json_sample = chunk[:80].decode("ascii", "replace")
                    except Exception:
                        json_sample = ""
                if len(json_offsets) >= 5:
                    break
        w.writerow([
            str(p), in_size, header_end, payload_offset, int(const_match),
            json.dumps(zstd_offsets[:10]), json.dumps(json_offsets[:5]), json_sample
        ])

print(str(pair_csv))
print(str(sample_csv))
