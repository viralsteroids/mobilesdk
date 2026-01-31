import csv
import struct
from collections import defaultdict
from pathlib import Path

ROOT = Path(r"C:\temp\MobileSDK")
INPUT_DIR = ROOT / "decrypted_bundles"
ANALYSIS_DIR = ROOT / "analysis"
ANALYSIS_DIR.mkdir(parents=True, exist_ok=True)

PAIR_PREVIEW = 20
MIN_PAIRS = 8
ALIGNMENTS = list(range(8))


def iter_input_files():
    files = []
    seen = set()
    for p in sorted(INPUT_DIR.glob("*last_attempt.bin")):
        if p not in seen:
            files.append(p)
            seen.add(p)
    for p in sorted(INPUT_DIR.glob("*_decrypted_raw.bin")):
        if p not in seen:
            files.append(p)
            seen.add(p)
    return files


def scan_file(path: Path):
    data = path.read_bytes()
    size = len(data)
    candidates = []
    for base in ALIGNMENTS:
        limit = size - ((size - base) % 8)
        if limit <= base:
            continue
        chunk = data[base:limit]
        pos = base
        run_start = None
        run_count = 0
        preview = []
        prev_off = None
        for off, sz in struct.iter_unpack("<II", chunk):
            valid = (
                0 < off < size
                and sz > 0
                and off + sz <= size
                and (prev_off is None or off >= prev_off)
            )
            if valid:
                if run_start is None:
                    run_start = pos
                    run_count = 1
                    preview = []
                else:
                    run_count += 1
                if len(preview) < PAIR_PREVIEW:
                    preview.append((off, sz))
                prev_off = off
            else:
                if run_start is not None and run_count >= MIN_PAIRS:
                    candidates.append({
                        "start": run_start,
                        "alignment": base,
                        "count": run_count,
                        "preview": preview,
                    })
                run_start = None
                run_count = 0
                preview = []
                prev_off = None
            pos += 8
        if run_start is not None and run_count >= MIN_PAIRS:
            candidates.append({
                "start": run_start,
                "alignment": base,
                "count": run_count,
                "preview": preview,
            })
    return size, candidates


def main():
    files = iter_input_files()
    rows = []
    per_file = []
    offset_hits = defaultdict(set)

    for p in files:
        size, candidates = scan_file(p)
        per_file.append({"file": p.name, "size": size, "candidates": candidates})
        for idx, cand in enumerate(candidates, 1):
            offset_hits[cand["start"]].add(p.name)
            row = {
                "file": p.name,
                "file_size": size,
                "candidate_index": idx,
                "start_offset": cand["start"],
                "start_offset_hex": f"0x{cand['start']:x}",
                "pair_count": cand["count"],
                "alignment": cand["alignment"],
            }
            for i in range(PAIR_PREVIEW):
                if i < len(cand["preview"]):
                    off, sz = cand["preview"][i]
                else:
                    off, sz = "", ""
                row[f"off_{i + 1:02d}"] = off
                row[f"size_{i + 1:02d}"] = sz
            rows.append(row)

    out_csv = ANALYSIS_DIR / "toc_candidates.csv"
    header = [
        "file",
        "file_size",
        "candidate_index",
        "start_offset",
        "start_offset_hex",
        "pair_count",
        "alignment",
    ]
    for i in range(PAIR_PREVIEW):
        header.append(f"off_{i + 1:02d}")
        header.append(f"size_{i + 1:02d}")

    with out_csv.open("w", newline="", encoding="utf-8") as f:
        w = csv.writer(f)
        w.writerow(header)
        for row in rows:
            w.writerow([row.get(col, "") for col in header])

    out_md = ANALYSIS_DIR / "toc_candidates.md"
    lines = []
    lines.append("# TOC candidate scan (u32 offset,size LE)")
    lines.append("")
    lines.append(
        f"Files scanned: {len(files)}. Candidates (>= {MIN_PAIRS} pairs): {len(rows)}. "
        f"Alignments scanned: {', '.join(str(a) for a in ALIGNMENTS)}."
    )

    repeated = sorted(
        [(start, len(names)) for start, names in offset_hits.items() if len(names) >= 2],
        key=lambda x: (-x[1], x[0]),
    )
    if repeated:
        top = ", ".join(f"0x{start:x} (files={count})" for start, count in repeated[:5])
        lines.append(
            "Repeated start offsets across files suggest possible stable TOC locations. "
            f"Top repeats: {top}."
        )
    else:
        lines.append(
            "No start offsets repeat across multiple files, so there is no strong cross-file "
            "TOC location signal in this scan."
        )

    lines.append("")
    lines.append("## Files")
    for entry in per_file:
        name = entry["file"]
        size = entry["size"]
        cands = entry["candidates"]
        count = len(cands)
        longest = max((c["count"] for c in cands), default=0)
        first_start = f"0x{cands[0]['start']:x}" if cands else "n/a"
        lines.append(
            f"- {name}: size={size} candidates={count} longest={longest} first_start={first_start}"
        )

    out_md.write_text("\n".join(lines), encoding="ascii", errors="ignore")
    print(str(out_csv))
    print(str(out_md))


if __name__ == "__main__":
    main()
