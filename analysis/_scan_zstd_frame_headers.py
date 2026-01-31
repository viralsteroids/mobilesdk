import argparse
import csv
from collections import Counter, defaultdict
from pathlib import Path

ZSTD_MAGIC = b"\x28\xb5\x2f\xfd"
SKIPPABLE_MAGIC_BASE = 0x184D2A50
SKIPPABLE_MAGIC_MAX = 0x184D2A5F


def parse_frame_content_size(fcs_flag, single_segment, buf, pos):
    if single_segment:
        size_map = {0: 1, 1: 2, 2: 4, 3: 8}
    else:
        size_map = {0: 0, 1: 2, 2: 4, 3: 8}
    fcs_size = size_map[fcs_flag]
    if fcs_size == 0:
        return fcs_size, None, pos, None
    if pos + fcs_size > len(buf):
        return fcs_size, None, pos, "truncated frame content size"
    fcs_value = int.from_bytes(buf[pos:pos + fcs_size], "little")
    if not single_segment and fcs_flag == 1 and fcs_size == 2:
        fcs_value += 256
    pos += fcs_size
    return fcs_size, fcs_value, pos, None


def parse_zstd_frame(buf, offset):
    end = len(buf)
    if offset + 5 > end:
        return None, offset, "truncated frame header"
    if buf[offset:offset + 4] != ZSTD_MAGIC:
        return None, offset, "missing zstd magic"

    pos = offset + 4
    fhd = buf[pos]
    pos += 1
    fcs_flag = fhd & 0x3
    single_segment = (fhd >> 2) & 0x1
    checksum_flag = (fhd >> 4) & 0x1
    dict_id_flag = (fhd >> 5) & 0x3

    window_desc = None
    window_size = None
    if single_segment == 0:
        if pos >= end:
            return None, offset, "truncated window descriptor"
        window_desc = buf[pos]
        pos += 1
        window_log = 10 + (window_desc >> 3)
        window_base = 1 << window_log
        window_add = (window_base >> 3) * (window_desc & 7)
        window_size = window_base + window_add

    dict_id_size = {0: 0, 1: 1, 2: 2, 3: 4}[dict_id_flag]
    dict_id = None
    if dict_id_size:
        if pos + dict_id_size > end:
            return None, offset, "truncated dictionary id"
        dict_id = int.from_bytes(buf[pos:pos + dict_id_size], "little")
        pos += dict_id_size

    fcs_size, fcs_value, pos, fcs_error = parse_frame_content_size(
        fcs_flag, single_segment, buf, pos
    )
    if fcs_error:
        return None, offset, fcs_error

    block_count = 0
    while True:
        if pos + 3 > end:
            return None, offset, "truncated block header"
        header = int.from_bytes(buf[pos:pos + 3], "little")
        pos += 3
        last_block = header & 1
        block_type = (header >> 1) & 3
        block_size = header >> 3
        block_count += 1
        if block_type == 3:
            return None, offset, "reserved block type"
        if block_type == 1:
            data_size = 1
        else:
            data_size = block_size
        if pos + data_size > end:
            return None, offset, "truncated block data"
        pos += data_size
        if last_block:
            break

    checksum = None
    if checksum_flag:
        if pos + 4 > end:
            return None, offset, "truncated checksum"
        checksum = int.from_bytes(buf[pos:pos + 4], "little")
        pos += 4

    info = {
        "frame_type": "zstd",
        "fhd": fhd,
        "single_segment": single_segment,
        "checksum_flag": checksum_flag,
        "dict_id_flag": dict_id_flag,
        "dict_id": dict_id,
        "window_desc": window_desc,
        "window_size": window_size,
        "fcs_flag": fcs_flag,
        "fcs_size": fcs_size,
        "fcs_value": fcs_value,
        "block_count": block_count,
        "checksum": checksum,
    }
    return info, pos, None


def parse_skippable_frame(buf, offset):
    end = len(buf)
    if offset + 8 > end:
        return None, offset, "truncated skippable header"
    magic = int.from_bytes(buf[offset:offset + 4], "little")
    size = int.from_bytes(buf[offset + 4:offset + 8], "little")
    frame_end = offset + 8 + size
    if frame_end > end:
        return None, offset, "truncated skippable payload"
    info = {
        "frame_type": "skippable",
        "skippable_magic": magic,
        "skippable_size": size,
    }
    return info, frame_end, None


def is_skippable_magic(buf, offset):
    if offset + 4 > len(buf):
        return False
    magic = int.from_bytes(buf[offset:offset + 4], "little")
    return SKIPPABLE_MAGIC_BASE <= magic <= SKIPPABLE_MAGIC_MAX


def scan_file(path):
    data = Path(path).read_bytes()
    offset = 0
    frames = []
    errors = []
    while offset < len(data):
        if data[offset:offset + 4] == ZSTD_MAGIC:
            info, next_offset, error = parse_zstd_frame(data, offset)
        elif is_skippable_magic(data, offset):
            info, next_offset, error = parse_skippable_frame(data, offset)
        else:
            errors.append(f"no zstd magic at offset {offset}")
            break

        if error:
            errors.append(f"{error} at offset {offset}")
            break

        if next_offset <= offset:
            errors.append(f"non-advancing parse at offset {offset}")
            break

        info["frame_offset"] = offset
        info["frame_end"] = next_offset
        info["frame_size"] = next_offset - offset
        frames.append(info)
        offset = next_offset

    return data, frames, errors


def normalize_path(path, root):
    try:
        return str(Path(path).resolve().relative_to(Path(root).resolve()))
    except ValueError:
        return str(path)


def summarize(frames):
    summary = Counter()
    fhd_counts = Counter()
    window_counts = Counter()
    dict_ids = Counter()
    for frame in frames:
        if frame["frame_type"] != "zstd":
            summary["skippable_frames"] += 1
            continue
        summary["zstd_frames"] += 1
        if frame.get("dict_id") is not None:
            summary["dict_id_frames"] += 1
            dict_ids[frame["dict_id"]] += 1
        if frame.get("checksum_flag"):
            summary["checksum_frames"] += 1
        if frame.get("fcs_size", 0):
            summary["fcs_frames"] += 1
        fhd_counts[frame.get("fhd")] += 1
        window_counts[frame.get("window_desc")] += 1
    return summary, fhd_counts, window_counts, dict_ids


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--input-dir", default="analysis/decrypted_bodies")
    ap.add_argument("--out-csv", default="analysis/zstd_frame_header_stats.csv")
    ap.add_argument("--out-md", default="analysis/zstd_frame_header_stats.md")
    args = ap.parse_args()

    input_dir = Path(args.input_dir)
    files = sorted([p for p in input_dir.rglob("*") if p.is_file()])

    rows = []
    file_summaries = []
    all_frames = []

    for path in files:
        data, frames, errors = scan_file(path)
        rel_path = normalize_path(path, Path.cwd())
        frame_count = len(frames)
        file_summaries.append({
            "path": rel_path,
            "size": len(data),
            "frames": frame_count,
            "errors": "; ".join(errors),
        })
        if not frames:
            rows.append({
                "path": rel_path,
                "frame_index": 0,
                "frame_offset": 0,
                "frame_size": 0,
                "frame_type": "none",
                "frames_in_file": 0,
                "fhd": "",
                "single_segment": "",
                "checksum_flag": "",
                "dict_id_flag": "",
                "dict_id_present": "",
                "dict_id": "",
                "window_desc": "",
                "window_size": "",
                "fcs_flag": "",
                "fcs_size": "",
                "fcs_value": "",
                "block_count": "",
                "parse_error": "; ".join(errors),
            })
            continue
        for idx, frame in enumerate(frames, start=1):
            all_frames.append(frame)
            rows.append({
                "path": rel_path,
                "frame_index": idx,
                "frame_offset": frame.get("frame_offset"),
                "frame_size": frame.get("frame_size"),
                "frame_type": frame.get("frame_type"),
                "frames_in_file": frame_count,
                "fhd": frame.get("fhd", ""),
                "single_segment": frame.get("single_segment", ""),
                "checksum_flag": frame.get("checksum_flag", ""),
                "dict_id_flag": frame.get("dict_id_flag", ""),
                "dict_id_present": frame.get("dict_id") is not None,
                "dict_id": frame.get("dict_id", ""),
                "window_desc": frame.get("window_desc", ""),
                "window_size": frame.get("window_size", ""),
                "fcs_flag": frame.get("fcs_flag", ""),
                "fcs_size": frame.get("fcs_size", ""),
                "fcs_value": frame.get("fcs_value", ""),
                "block_count": frame.get("block_count", ""),
                "parse_error": "",
            })

    out_csv = Path(args.out_csv)
    out_csv.parent.mkdir(parents=True, exist_ok=True)
    with out_csv.open("w", newline="", encoding="utf-8") as f:
        writer = csv.DictWriter(
            f,
            fieldnames=[
                "path",
                "frame_index",
                "frame_offset",
                "frame_size",
                "frame_type",
                "frames_in_file",
                "fhd",
                "single_segment",
                "checksum_flag",
                "dict_id_flag",
                "dict_id_present",
                "dict_id",
                "window_desc",
                "window_size",
                "fcs_flag",
                "fcs_size",
                "fcs_value",
                "block_count",
                "parse_error",
            ],
        )
        writer.writeheader()
        writer.writerows(rows)

    summary, fhd_counts, window_counts, dict_ids = summarize(all_frames)
    total_files = len(files)
    total_frames = len(all_frames)
    multi_frame_files = sum(1 for item in file_summaries if item["frames"] > 1)

    out_md = Path(args.out_md)
    out_md.parent.mkdir(parents=True, exist_ok=True)
    lines = ["# ZSTD frame header stats", ""]
    lines.append(f"- files scanned: {total_files}")
    lines.append(f"- total frames: {total_frames}")
    lines.append(f"- files with multiple frames: {multi_frame_files}")
    lines.append(f"- frames with dict id: {summary.get('dict_id_frames', 0)}")
    lines.append(f"- frames with checksum: {summary.get('checksum_frames', 0)}")
    lines.append(f"- frames with frame content size: {summary.get('fcs_frames', 0)}")
    lines.append("")

    lines.append("## Per-file frame counts")
    lines.append("")
    lines.append("| file | size (bytes) | frames | errors |")
    lines.append("| --- | ---: | ---: | --- |")
    for item in file_summaries:
        errors = item["errors"] if item["errors"] else ""
        lines.append(f"| {item['path']} | {item['size']} | {item['frames']} | {errors} |")
    lines.append("")

    if fhd_counts:
        lines.append("## FHD byte distribution")
        lines.append("")
        lines.append("| fhd | frames |")
        lines.append("| ---: | ---: |")
        for fhd, count in sorted(fhd_counts.items()):
            lines.append(f"| {fhd} | {count} |")
        lines.append("")

    if window_counts:
        lines.append("## Window descriptor distribution")
        lines.append("")
        lines.append("| window_desc | frames |")
        lines.append("| ---: | ---: |")
        for window_desc, count in sorted(window_counts.items()):
            if window_desc is None:
                label = ""
            else:
                label = str(window_desc)
            lines.append(f"| {label} | {count} |")
        lines.append("")

    if dict_ids:
        lines.append("## Dictionary IDs")
        lines.append("")
        lines.append("| dict_id | frames |")
        lines.append("| ---: | ---: |")
        for dict_id, count in sorted(dict_ids.items()):
            lines.append(f"| {dict_id} | {count} |")
        lines.append("")

    out_md.write_text("\n".join(lines), encoding="utf-8")


if __name__ == "__main__":
    main()
