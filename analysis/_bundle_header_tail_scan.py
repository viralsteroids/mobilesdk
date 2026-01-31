import struct
from pathlib import Path

root = Path(r"C:\temp\MobileSDK")
assets = root / "extracted_bundles" / "assets"

out_lines = []
rows = []

for path in sorted(assets.glob("*.se")):
    data = path.read_bytes()
    size = len(data)
    # find header end: ASCII header ends at first 0x00? but known length 59
    # Use known payload offset 0x7B if matches "sebundle1" prefix
    if not data.startswith(b"sebundle1~"):
        out_lines.append(f"{path} :: missing sebundle1 prefix")
        continue
    header_ascii_len = 59  # from prior analysis
    bin_hdr = data[header_ascii_len:header_ascii_len+64]
    if len(bin_hdr) < 64:
        out_lines.append(f"{path} :: short bin header")
        continue
    version_key = bin_hdr[0:20]
    const16 = bin_hdr[20:36]
    tail28 = bin_hdr[36:64]
    payload_off = header_ascii_len + 64
    payload_len = size - payload_off

    # interpret tail as 7 u32 LE and BE
    u32le = [struct.unpack_from('<I', tail28, i)[0] for i in range(0, 28, 4)]
    u32be = [struct.unpack_from('>I', tail28, i)[0] for i in range(0, 28, 4)]

    # check for matches to size or payload_len in u32s
    matches = []
    for idx, val in enumerate(u32le):
        if val in (size, payload_len, payload_off):
            matches.append(f"le[{idx}]={val}")
    for idx, val in enumerate(u32be):
        if val in (size, payload_len, payload_off):
            matches.append(f"be[{idx}]={val}")

    rows.append((path.name, size, payload_off, payload_len, u32le, u32be, tail28))

    out_lines.append(f"{path.name} size={size} payload_off=0x{payload_off:x} payload_len={payload_len}")
    out_lines.append(f"  tail28 hex={tail28.hex()}")
    out_lines.append(f"  u32le={u32le}")
    out_lines.append(f"  u32be={u32be}")
    if matches:
        out_lines.append(f"  matches: {', '.join(matches)}")

# Build a small table to see if any u32le correlates with payload_len by diff
if rows:
    out_lines.append("\n## Diff to payload_len (u32le)")
    for name, size, payload_off, payload_len, u32le, u32be, tail28 in rows:
        diffs = [payload_len - v for v in u32le]
        out_lines.append(f"{name} payload_len={payload_len} diffs={diffs}")

out_path = root / "analysis" / "bundle_header_tail_scan.md"
out_path.write_text("\n".join(out_lines), encoding='utf-8')
print(out_path)
