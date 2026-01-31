import csv
import lzma
from pathlib import Path

ROOT = Path(r"C:\temp\MobileSDK")
INPUT_DIRS = [
    ROOT / "decrypted_bundles",
    ROOT / "offline_xor_out",
]
ANALYSIS_DIR = ROOT / "analysis"
ANALYSIS_DIR.mkdir(parents=True, exist_ok=True)

OUT_MD = ANALYSIS_DIR / "postxor_alt_compression_probe.md"
OUT_CSV = ANALYSIS_DIR / "postxor_alt_compression_hits.csv"

MAGICS = [
    ("lz4_frame", bytes.fromhex("04 22 4D 18")),
    ("xz", bytes.fromhex("FD 37 7A 58 5A 00")),
    ("lzma_alone", bytes.fromhex("5D 00 00 80 00")),
    ("snappy_framed", bytes.fromhex("FF 06 00 00 73 4E 61 50 70 59")),
    ("7z", bytes.fromhex("37 7A BC AF 27 1C")),
    ("brotli_heuristic", bytes.fromhex("CE B2 CF 81")),
    ("brotli_ascii_lower", b"brotli"),
    ("brotli_ascii_upper", b"Brotli"),
]

MAX_HITS_PER_MAGIC = 40
MAX_ATTEMPTS_PER_TYPE = 5
CHUNK_SIZE = 4 * 1024 * 1024
MAX_DECOMPRESS_OUT = 1024 * 1024
MAX_DECOMPRESS_IN = 16 * 1024 * 1024


def scan_file(path: Path):
    counts = {name: 0 for name, _ in MAGICS}
    offsets = {name: [] for name, _ in MAGICS}
    max_len = max(len(m) for _, m in MAGICS)
    tail = b""
    total = 0
    with path.open("rb") as f:
        while True:
            chunk = f.read(CHUNK_SIZE)
            if not chunk:
                break
            data = tail + chunk
            tail_len = len(tail)
            base = total - tail_len
            for name, magic in MAGICS:
                start = 0
                mlen = len(magic)
                while True:
                    idx = data.find(magic, start)
                    if idx == -1:
                        break
                    if tail_len and idx + mlen <= tail_len:
                        start = idx + 1
                        continue
                    abs_off = base + idx
                    counts[name] += 1
                    if len(offsets[name]) < MAX_HITS_PER_MAGIC:
                        offsets[name].append(abs_off)
                    start = idx + 1
            total += len(chunk)
            if max_len > 1:
                tail = data[-(max_len - 1):]
            else:
                tail = b""
    return counts, offsets, total


def attempt_lzma(path: Path, offset: int, fmt_name: str):
    if fmt_name == "xz":
        fmt = lzma.FORMAT_XZ
    else:
        fmt = lzma.FORMAT_ALONE
    out_len = 0
    in_len = 0
    eof = False
    error = ""
    status = "unknown"
    try:
        dec = lzma.LZMADecompressor(format=fmt)
        with path.open("rb") as f:
            f.seek(offset)
            while True:
                if in_len >= MAX_DECOMPRESS_IN:
                    status = "input_limit"
                    break
                if out_len >= MAX_DECOMPRESS_OUT:
                    status = "output_limit"
                    break
                chunk = f.read(min(CHUNK_SIZE, MAX_DECOMPRESS_IN - in_len))
                if not chunk:
                    status = "eod"
                    break
                in_len += len(chunk)
                out = dec.decompress(chunk, MAX_DECOMPRESS_OUT - out_len)
                out_len += len(out)
                if dec.eof:
                    eof = True
                    status = "ok_eof"
                    break
        if not eof and status in ("eod", "input_limit", "output_limit"):
            status = f"partial_{status}"
    except Exception as exc:
        error = f"{type(exc).__name__}: {exc}"
        status = "fail"
    return {
        "offset": offset,
        "format": fmt_name,
        "status": status,
        "out_len": out_len,
        "in_len": in_len,
        "eof": eof,
        "error": error,
    }


def fmt_offsets(values):
    if not values:
        return "none"
    return ", ".join(f"0x{v:x}" for v in values)


def fmt_attempt_short(att):
    return f"0x{att['offset']:x} {att['format']} {att['status']}"


def main():
    inputs = []
    for d in INPUT_DIRS:
        if d.exists():
            inputs.extend(sorted(p for p in d.iterdir() if p.is_file()))

    rows = []
    file_results = []
    report_lines = []
    report_lines.append("# Post-XOR alt compression probe")
    report_lines.append("")

    for path in inputs:
        counts, offsets, size = scan_file(path)
        xz_offsets = offsets["xz"][:MAX_ATTEMPTS_PER_TYPE]
        lzma_offsets = offsets["lzma_alone"][:MAX_ATTEMPTS_PER_TYPE]
        attempts = []
        for off in xz_offsets:
            attempts.append(attempt_lzma(path, off, "xz"))
        for off in lzma_offsets:
            attempts.append(attempt_lzma(path, off, "lzma"))

        file_results.append({
            "path": path,
            "size": size,
            "counts": counts,
            "offsets": offsets,
            "attempts": attempts,
        })

        for name, _ in MAGICS:
            rows.append({
                "file": str(path.relative_to(ROOT)),
                "size": size,
                "magic": name,
                "count": counts[name],
                "offsets": ",".join(str(o) for o in offsets[name]),
            })
        for att in attempts:
            rows.append({
                "file": str(path.relative_to(ROOT)),
                "size": size,
                "magic": f"lzma_attempt_{att['format']}",
                "count": 1,
                "offsets": str(att["offset"]),
                "status": att["status"],
                "out_len": att["out_len"],
                "in_len": att["in_len"],
                "eof": att["eof"],
                "error": att["error"],
            })

    total_files = len(file_results)
    hit_entries = []
    for result in file_results:
        rel = str(result["path"].relative_to(ROOT))
        for name, _ in MAGICS:
            if result["counts"][name]:
                offs = result["offsets"][name][:6]
                hit_entries.append(
                    f"{rel} {name}={result['counts'][name]} offsets={fmt_offsets(offs)}"
                )

    attempt_entries = []
    for result in file_results:
        rel = str(result["path"].relative_to(ROOT))
        for att in result["attempts"]:
            attempt_entries.append(f"{rel} {fmt_attempt_short(att)}")

    summary = (
        "Summary: scanned decrypted_bundles and offline_xor_out for LZ4 frame, XZ, "
        "LZMA (alone), Snappy framed, 7z, and Brotli heuristics (no fixed Brotli "
        "magic exists, so both a heuristic 0xCEB2CF81 and ASCII Brotli tokens were used). "
        f"Files scanned: {total_files}. "
    )
    if hit_entries:
        summary += "Magic hits: " + "; ".join(hit_entries) + "."
    else:
        summary += "Magic hits: none."

    if attempt_entries:
        attempts_line = "LZMA attempts: " + "; ".join(attempt_entries) + "."
    else:
        attempts_line = "LZMA attempts: none (no XZ/LZMA signatures detected)."

    report_lines.append(summary)
    report_lines.append("")
    report_lines.append(attempts_line)
    report_lines.append("")
    report_lines.append("Files changed:")
    report_lines.append("- analysis/_scan_alt_compression.py")
    report_lines.append("- analysis/postxor_alt_compression_probe.md")
    report_lines.append("- analysis/postxor_alt_compression_hits.csv")

    OUT_MD.write_text("\n".join(report_lines), encoding="ascii", errors="ignore")

    fieldnames = ["file", "size", "magic", "count", "offsets", "status", "out_len", "in_len", "eof", "error"]
    with OUT_CSV.open("w", newline="", encoding="utf-8") as f:
        w = csv.DictWriter(f, fieldnames=fieldnames)
        w.writeheader()
        for row in rows:
            w.writerow({k: row.get(k, "") for k in fieldnames})

    print(str(OUT_MD))
    print(str(OUT_CSV))


if __name__ == "__main__":
    main()
