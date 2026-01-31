#!/usr/bin/env python3
import csv
from collections import Counter, defaultdict
from pathlib import Path


HEADER_LEN = 128
HEADER_SIZES = (0x3B, 0x24, 0x7B)


def _fmt_hex(value: int, width: int) -> str:
    return f"0x{value:0{width * 2}x}"


def _scan_bundle(path: Path, data: bytes, repeat_map):
    file_size = path.stat().st_size
    payload_size = file_size - 0x7B if file_size >= 0x7B else None
    targets = {"file_size": file_size}
    if payload_size is not None:
        targets["payload_size"] = payload_size

    rows = []
    for width in (4, 8):
        for offset in range(0, max(0, len(data) - width + 1)):
            val = int.from_bytes(data[offset : offset + width], "little", signed=False)
            match_types = []
            for name, target_val in targets.items():
                if val == target_val:
                    match_types.append(name)
            if val in HEADER_SIZES:
                match_types.append(f"header_size_{_fmt_hex(val, width)}")
            if val in repeat_map.get((width, offset), set()):
                match_types.append("repeat")
            if match_types:
                rows.append(
                    {
                        "bundle": path.name,
                        "offset": f"0x{offset:02x}",
                        "width": str(width),
                        "value": _fmt_hex(val, width),
                        "match_type": "|".join(match_types),
                    }
                )
    return rows


def main() -> int:
    root = Path(__file__).resolve().parents[1]
    asset_dir = root / "extracted_bundles" / "assets"
    out_csv = root / "analysis" / "header_size_offset_scan.csv"
    out_md = root / "analysis" / "header_size_offset_scan.md"

    bundles = sorted(asset_dir.glob("*.se"))
    all_rows = []
    per_type_offset_bundles = defaultdict(set)
    type_counts = Counter()
    headers = {bundle.name: bundle.read_bytes()[:HEADER_LEN] for bundle in bundles}

    repeat_map = defaultdict(set)
    repeat_offset_counts = Counter()
    all_same_offsets = defaultdict(list)
    if len(bundles) > 1:
        for width in (4, 8):
            for offset in range(0, max(0, HEADER_LEN - width + 1)):
                values = [
                    int.from_bytes(headers[bundle.name][offset : offset + width], "little")
                    for bundle in bundles
                ]
                counts = Counter(values)
                repeats_here = False
                for val, count in counts.items():
                    if count > 1:
                        repeat_map[(width, offset)].add(val)
                        repeats_here = True
                if repeats_here:
                    repeat_offset_counts[width] += 1
                if len(counts) == 1:
                    all_same_offsets[width].append((offset, values[0]))

    for bundle in bundles:
        rows = _scan_bundle(bundle, headers[bundle.name], repeat_map)
        all_rows.extend(rows)
        for row in rows:
            match_types = row["match_type"].split("|")
            offset = row["offset"]
            width = row["width"]
            for match_type in match_types:
                type_counts[match_type] += 1
                per_type_offset_bundles[(match_type, width, offset)].add(row["bundle"])

    out_csv.parent.mkdir(parents=True, exist_ok=True)
    with out_csv.open("w", newline="") as f:
        writer = csv.DictWriter(
            f, fieldnames=["bundle", "offset", "width", "value", "match_type"]
        )
        writer.writeheader()
        writer.writerows(all_rows)

    target_types = [
        "file_size",
        "payload_size",
        "header_size_0x3b",
        "header_size_0x24",
        "header_size_0x7b",
    ]

    candidate_lines = []
    for match_type in target_types:
        candidates = []
        for (m_type, width, offset), bundle_set in per_type_offset_bundles.items():
            if m_type != match_type:
                continue
            if len(bundle_set) >= 2:
                candidates.append((len(bundle_set), width, offset))
        if candidates:
            candidates.sort(key=lambda x: (-x[0], int(x[2], 16), int(x[1])))
            parts = [
                f"{offset} (u{width}, bundles={count})"
                for count, width, offset in candidates
            ]
            candidate_lines.append(f"{match_type}: " + "; ".join(parts))

    summary_lines = []
    summary = (
        f"Scanned {len(bundles)} bundle(s) in `extracted_bundles/assets` and parsed u32/u64 LE values from the first {HEADER_LEN} bytes. "
        f"Generated {len(all_rows)} match rows (values shown in hex). "
        f"Match counts: file_size={type_counts.get('file_size', 0)}, "
        f"payload_size={type_counts.get('payload_size', 0)}, "
        f"header_size_0x3b={type_counts.get('header_size_0x3b', 0)}, "
        f"header_size_0x24={type_counts.get('header_size_0x24', 0)}, "
        f"header_size_0x7b={type_counts.get('header_size_0x7b', 0)}, "
        f"repeat={type_counts.get('repeat', 0)}."
    )
    if len(bundles) > 1:
        summary += (
            " Offsets with repeated values across bundles: "
            f"u32={repeat_offset_counts.get(4, 0)}, "
            f"u64={repeat_offset_counts.get(8, 0)} (counted by offset/width)."
        )
    summary_lines.append(summary)
    if candidate_lines:
        summary_lines.append(
            "Candidate offsets with consistent appearances across bundles: "
            + " | ".join(candidate_lines)
            + "."
        )
    else:
        summary_lines.append(
            "No offsets for file/payload/header-size matches repeated across multiple bundles."
        )

    with out_md.open("w", encoding="ascii") as f:
        f.write("\n\n".join(summary_lines).strip() + "\n\n")
        f.write("Files scanned:\n")
        for bundle in bundles:
            f.write(f"- {bundle.name}\n")

    return 0


if __name__ == "__main__":
    raise SystemExit(main())
