import os
import sys
from pathlib import Path

ROOT = Path("C:/temp/MobileSDK")
DUMP_ROOTS = [ROOT / "se_dumps" / "latest", ROOT / "se_dumps"]

MAGICS = {
    "ZSTD": b"\x28\xB5\x2F\xFD",
    "GZIP": b"\x1F\x8B",
    "ZLIB_78_9C": b"\x78\x9C",
    "ZLIB_78_01": b"\x78\x01",
    "ZLIB_78_DA": b"\x78\xDA",
    "ZIP_LOCAL": b"PK\x03\x04",
    "ZIP_EOCD": b"PK\x05\x06",
    "ZIP_SPAN": b"PK\x07\x08",
    "LZ4_FRAME": b"\x04\x22\x4D\x18",
}

JSON_MARKERS = [b"{\"", b"{\"version\"", b"{\"data\"", b"{" ]

PRINTABLE_MIN = 32
PRINTABLE_MAX = 126


def find_all(data, needle, limit=5):
    hits = []
    start = 0
    while True:
        idx = data.find(needle, start)
        if idx == -1:
            break
        hits.append(idx)
        if len(hits) >= limit:
            break
        start = idx + 1
    return hits


def ascii_runs(data, min_len=32, limit=5):
    runs = []
    i = 0
    n = len(data)
    while i < n:
        if PRINTABLE_MIN <= data[i] <= PRINTABLE_MAX:
            j = i + 1
            while j < n and PRINTABLE_MIN <= data[j] <= PRINTABLE_MAX:
                j += 1
            if (j - i) >= min_len:
                runs.append((i, j - i))
                if len(runs) >= limit:
                    break
            i = j
        else:
            i += 1
    return runs


def gather_files():
    files = []
    for root in DUMP_ROOTS:
        if root.exists():
            for p in root.rglob("*"):
                if p.is_file():
                    files.append(p)
    return sorted(set(files))


def main():
    files = gather_files()
    if not files:
        print("No dump files found in se_dumps.")
        return 1

    report_lines = []
    report_lines.append("# Dump signature validation")
    report_lines.append("")
    report_lines.append("Scanned directories:")
    for root in DUMP_ROOTS:
        report_lines.append(f"- {root}")
    report_lines.append("")

    table = []
    table.append("| File | Size | Magics | JSON hits | ASCII runs |")
    table.append("| --- | --- | --- | --- | --- |")

    for p in files:
        data = p.read_bytes()
        magics_found = []
        for name, sig in MAGICS.items():
            hits = find_all(data, sig, limit=3)
            if hits:
                magics_found.append(f"{name}@{','.join(hex(h) for h in hits)}")
        json_hits = []
        for marker in JSON_MARKERS:
            hits = find_all(data, marker, limit=2)
            if hits:
                json_hits.append(f"{marker[:8]!r}@{','.join(hex(h) for h in hits)}")
        runs = ascii_runs(data, min_len=32, limit=3)
        run_str = "; ".join([f"{hex(off)}+{length}" for off, length in runs]) if runs else "-"
        magics_str = "; ".join(magics_found) if magics_found else "-"
        json_str = "; ".join(json_hits) if json_hits else "-"
        table.append(f"| {p} | {len(data)} | {magics_str} | {json_str} | {run_str} |")

    report_lines.extend(table)
    report_lines.append("")
    report_lines.append("## Notes")
    report_lines.append("- JSON hits are raw marker occurrences; verify manually before treating as JSON documents.")
    report_lines.append("- ASCII runs are printable-byte sequences (32..126) with length >= 32.")

    out_md = ROOT / "analysis" / "dump_signature_validation.md"
    out_md.write_text("\n".join(report_lines), encoding="utf-8")
    print(f"Wrote: {out_md}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
