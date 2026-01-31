import csv
import os
from pathlib import Path

ROOT = Path(r"C:\temp\MobileSDK")
OUT_MD = ROOT / "analysis" / "zstd_dict_skippable_scan.md"
OUT_CSV = ROOT / "analysis" / "zstd_dict_skippable_scan.csv"

TARGET_DIRS = [
    ("extracted_bundles/assets", ROOT / "extracted_bundles" / "assets"),
    ("decrypted_bundles", ROOT / "decrypted_bundles"),
    ("offline_xor_out", ROOT / "offline_xor_out"),
]

DICT_MAGIC = 0xEC30A437
DICT_MAGIC_BYTES = DICT_MAGIC.to_bytes(4, "little")
SKIPPABLE_MIN = 0x184D2A50
SKIPPABLE_MAX = 0x184D2A5F
SKIPPABLE_TAIL = b"\x2a\x4d\x18"

CHUNK_SIZE = 1024 * 1024


def rel_path(path: Path) -> str:
    try:
        return str(path.relative_to(ROOT)).replace("\\", "/")
    except ValueError:
        return str(path)


def scan_file(path: Path):
    hits = []
    with path.open("rb") as f:
        offset = 0
        tail = b""
        while True:
            chunk = f.read(CHUNK_SIZE)
            if not chunk:
                break
            data = tail + chunk
            base = offset - len(tail)

            start = 0
            while True:
                idx = data.find(DICT_MAGIC_BYTES, start)
                if idx == -1:
                    break
                hits.append((base + idx, DICT_MAGIC, "ZSTD dictionary magic"))
                start = idx + 1

            start = 0
            while True:
                idx = data.find(SKIPPABLE_TAIL, start)
                if idx == -1:
                    break
                if idx > 0:
                    low = data[idx - 1]
                    if 0x50 <= low <= 0x5F:
                        val = 0x184D2A00 | low
                        hits.append((base + idx - 1, val, "ZSTD skippable frame magic"))
                start = idx + 1

            tail = data[-3:] if len(data) >= 3 else data
            offset += len(chunk)

    dedup = []
    seen = set()
    for off, magic, desc in hits:
        key = (off, magic)
        if key in seen:
            continue
        seen.add(key)
        dedup.append((off, magic, desc))
    return dedup


def main():
    results = []
    missing = []
    total_files = 0
    for label, directory in TARGET_DIRS:
        if not directory.is_dir():
            missing.append(label)
            continue
        for root, _, files in os.walk(directory):
            for name in files:
                path = Path(root) / name
                if not path.is_file():
                    continue
                total_files += 1
                size = path.stat().st_size
                for off, magic, desc in scan_file(path):
                    results.append(
                        {
                            "file": rel_path(path),
                            "size": size,
                            "offset": off,
                            "magic": f"0x{magic:08X}",
                            "description": desc,
                        }
                    )

    results.sort(key=lambda r: (r["file"], r["offset"], r["magic"]))

    with OUT_CSV.open("w", newline="", encoding="ascii") as f:
        writer = csv.writer(f)
        writer.writerow(["file", "size", "offset", "magic", "description"])
        for row in results:
            writer.writerow(
                [row["file"], row["size"], row["offset"], row["magic"], row["description"]]
            )

    with OUT_MD.open("w", encoding="ascii") as f:
        f.write("# ZSTD dictionary + skippable magic scan\n\n")
        f.write("Targets:\n")
        for label, _ in TARGET_DIRS:
            f.write(f"- {label}\n")
        f.write("\n")
        if missing:
            f.write("Missing directories (skipped): " + ", ".join(missing) + "\n\n")
        f.write(f"Files scanned: {total_files}\n")
        f.write(f"Total hits: {len(results)}\n\n")
        if not results:
            f.write("No ZSTD dictionary or skippable frame magic hits found.\n")
        else:
            f.write("| file | size | offset | magic | description |\n")
            f.write("| --- | --- | --- | --- | --- |\n")
            for row in results:
                f.write(
                    f"| {row['file']} | {row['size']} | {row['offset']} | {row['magic']} | {row['description']} |\n"
                )

    print("Wrote", OUT_MD)
    print("Wrote", OUT_CSV)


if __name__ == "__main__":
    main()
