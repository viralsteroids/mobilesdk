from pathlib import Path
import csv
import math

ROOT = Path(r"C:\temp\MobileSDK")
INPUT_DIR = ROOT / "extracted_bundles" / "assets"
ANALYSIS_DIR = ROOT / "analysis"
ANALYSIS_DIR.mkdir(parents=True, exist_ok=True)

# Known version keys from BUNDLE_FORMAT_SPECIFICATION
KNOWN_KEYS = {
    "2.7.2": "a6d01f9528847cd118d154e96dd9fd2cd16f7a77",
    "3.2.0": "c2ac4db5c62062bb0d7554d55613991b059fee8a",
    "2.6.4": "3cb11e8c45e443f30057c9e6559c48cbd02c3c16",
}
CONST_HEX = "76f6f2fb17591a73192c515d55b72060"


def entropy(data: bytes) -> float:
    if not data:
        return 0.0
    counts = [0]*256
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
for p in sorted(INPUT_DIR.glob("*.se")):
    data = p.read_bytes()
    tildes = [i for i,b in enumerate(data) if b == 0x7e][:3]
    if len(tildes) < 3:
        rows.append({
            "bundle": p.name,
            "size": len(data),
            "version": "N/A",
            "license": "N/A",
            "header_end": "",
            "payload_offset": "",
            "payload_len": "",
            "key_hex": "",
            "const_hex": "",
            "const_match": 0,
            "key_match": 0,
            "xor_zero": 0,
            "xor_nonzero": "",
            "entropy_1m": "",
        })
        continue
    version = data[tildes[0]+1:tildes[1]].decode("ascii", "ignore")
    lic = data[tildes[1]+1:tildes[2]].decode("ascii", "ignore")
    header_end = tildes[2] + 1
    key = data[header_end:header_end+20]
    const = data[header_end+20:header_end+36]
    payload_off = header_end + 36
    payload = data[payload_off:]
    # xor test: payload[0:36] ^ (key+const) == 0?
    test = bytes(a ^ b for a,b in zip(payload[:36], key + const))
    xor_nonzero = sum(1 for b in test if b != 0)
    ent1 = entropy(payload[:1024*1024])

    key_hex = key.hex()
    const_hex = const.hex()
    key_match = 1 if KNOWN_KEYS.get(version) == key_hex else 0
    const_match = 1 if const_hex == CONST_HEX else 0

    rows.append({
        "bundle": p.name,
        "size": len(data),
        "version": version,
        "license": lic,
        "header_end": header_end,
        "payload_offset": payload_off,
        "payload_len": len(payload),
        "key_hex": key_hex,
        "const_hex": const_hex,
        "const_match": const_match,
        "key_match": key_match,
        "xor_zero": 1 if xor_nonzero == 0 else 0,
        "xor_nonzero": xor_nonzero,
        "entropy_1m": f"{ent1:.5f}",
    })

out_csv = ANALYSIS_DIR / "bundle_header_table.csv"
with out_csv.open("w", newline="", encoding="utf-8") as f:
    w = csv.writer(f)
    w.writerow([
        "bundle","size","version","license","header_end","payload_offset","payload_len",
        "key_hex","const_hex","const_match","key_match","xor_zero","xor_nonzero","entropy_1m"
    ])
    for r in rows:
        w.writerow([r[k] for k in [
            "bundle","size","version","license","header_end","payload_offset","payload_len",
            "key_hex","const_hex","const_match","key_match","xor_zero","xor_nonzero","entropy_1m"
        ]])

# Write a short markdown summary
out_md = ANALYSIS_DIR / "bundle_header_table.md"
lines = []
lines.append("# Bundle header table (extracted_bundles/assets)")
lines.append("")
lines.append(f"Bundles scanned: {len(rows)}")
lines.append("")
lines.append("## Checks")
lines.append("- header_end expected 59, payload_offset expected 95")
lines.append("- const_match=1 means bytes 20..35 match 76f6f2fb17591a73192c515d55b72060")
lines.append("- key_match=1 means version key matches known table")
lines.append("- xor_zero=1 means payload[0:36] XOR (key+const) == 0x00 * 36")
lines.append("")
for r in rows:
    lines.append(
        f"- {r['bundle']}: ver={r['version']} size={r['size']} header_end={r['header_end']} "
        f"payload_off={r['payload_offset']} const_match={r['const_match']} key_match={r['key_match']} "
        f"xor_zero={r['xor_zero']} entropy_1m={r['entropy_1m']}"
    )

out_md.write_text("\n".join(lines), encoding="ascii", errors="ignore")
print(str(out_csv))
print(str(out_md))
