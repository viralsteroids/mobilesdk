import os
from pathlib import Path

ROOT = Path(r"C:\temp\MobileSDK")

FILES = []
# .se bundles
FILES += list((ROOT / "extracted_bundles" / "assets").glob("*.se"))
# decrypted outputs
FILES += list((ROOT / "decrypted_bundles").glob("*.bin"))
FILES += list((ROOT / "offline_xor_out").glob("*.bin"))
# zstd_out dumps
FILES += list((ROOT / "se_dumps" / "latest").glob("*.bin"))
# bundle init input dumps (optional)
FILES += list((ROOT / "se_dumps" / "files").glob("bundle_init_input_*.bin"))

MAGICS = {
    "zstd_frame": bytes.fromhex("28 B5 2F FD"),
    "zstd_dict": bytes.fromhex("37 A4 30 EC"),
    "zlib_78_9c": bytes.fromhex("78 9C"),
    "zlib_78_da": bytes.fromhex("78 DA"),
    "zlib_78_01": bytes.fromhex("78 01"),
    "gzip": bytes.fromhex("1F 8B 08"),
    "zip_lfh": bytes.fromhex("50 4B 03 04"),
    "zip_cdir": bytes.fromhex("50 4B 01 02"),
    "zip_eocd": bytes.fromhex("50 4B 05 06"),
    "lz4_frame": bytes.fromhex("04 22 4D 18"),
    "lzma": bytes.fromhex("5D 00 00 80 00"),
    "xz": bytes.fromhex("FD 37 7A 58 5A 00"),
    "bzip2": bytes.fromhex("42 5A 68"),
}


def find_all(data: bytes, pat: bytes):
    out = []
    start = 0
    while True:
        idx = data.find(pat, start)
        if idx == -1:
            break
        out.append(idx)
        start = idx + 1
    return out

lines = []

for path in sorted(set(FILES)):
    try:
        data = path.read_bytes()
    except Exception as e:
        lines.append(f"{path} :: read error: {e}")
        continue
    hits = []
    for name, pat in MAGICS.items():
        offs = find_all(data, pat)
        if offs:
            hits.append((name, offs))
    if hits:
        lines.append(f"{path} (size={len(data)})")
        for name, offs in hits:
            # limit to first 10 offsets per pattern
            sample = ", ".join(hex(o) for o in offs[:10])
            extra = "" if len(offs) <= 10 else f" (+{len(offs)-10} more)"
            lines.append(f"  - {name}: {sample}{extra}")
    else:
        lines.append(f"{path} (size={len(data)}) :: no magic hits")

out_path = ROOT / "analysis" / "magic_scan_v2.md"
out_path.write_text("\n".join(lines), encoding="utf-8")
print(str(out_path))
