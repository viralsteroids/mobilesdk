import argparse
import ast
from pathlib import Path


SIG_LOCAL = b"PK\x03\x04"
SIG_CDIR = b"PK\x01\x02"
SIG_EOCD = b"PK\x05\x06"
SIGS = {
    "PK03_04": SIG_LOCAL,
    "PK01_02": SIG_CDIR,
    "PK05_06": SIG_EOCD,
}


def find_file(root: Path, name: str) -> Path | None:
    candidates = [
        root / name,
        root / "offline_xor_out" / name,
        root / "decrypted_bundles" / name,
    ]
    for cand in candidates:
        if cand.is_file():
            return cand
    hits = list(root.rglob(name))
    for hit in hits:
        if hit.is_file():
            return hit
    return None


def scan_window(data: bytes, base_offset: int):
    hits = {k: [] for k in SIGS}
    for label, sig in SIGS.items():
        start = 0
        while True:
            idx = data.find(sig, start)
            if idx == -1:
                break
            hits[label].append(base_offset + idx)
            start = idx + 1
    return hits


def format_hits(hits, anchor):
    parts = []
    for label in ("PK03_04", "PK01_02", "PK05_06"):
        offs = hits.get(label, [])
        if not offs:
            continue
        offs_fmt = ", ".join(f"{o} (delta {o - anchor:+d})" for o in offs)
        parts.append(f"{label}: {offs_fmt}")
    return "; ".join(parts) if parts else "no signatures found"


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--csv", type=Path, default=Path(__file__).resolve().parent.parent / "_offline_layer2_probe.csv")
    parser.add_argument("--root", type=Path, default=Path(__file__).resolve().parent.parent)
    parser.add_argument("--window", type=int, default=0x4000, help="bytes around each offset (±window)")
    parser.add_argument("--eof-window", type=int, default=0x20000, help="bytes from EOF to scan")
    args = parser.parse_args()

    lines = args.csv.read_text(encoding="utf-8").splitlines()
    if not lines:
        print(f"{args.csv}: empty file")
        return
    for line in lines[1:]:
        if not line.strip():
            continue
        name = line.split(",", 1)[0].strip()
        if not name:
            continue
        last_open = line.rfind("[")
        last_close = line.rfind("]")
        keyword_hits = []
        try:
            if last_open != -1 and last_close > last_open:
                keyword_hits = ast.literal_eval(line[last_open : last_close + 1])
        except Exception:
            keyword_hits = []
        file_path = find_file(args.root, name)
        if file_path is None:
            print(f"{name}: file not found")
            continue
        zip_offsets = [off for kw, off in keyword_hits if kw == "zip"]
        if not zip_offsets:
            print(f"{file_path}: no zip offsets in CSV")
            continue

        size = file_path.stat().st_size
        print(f"FILE: {file_path} (size {size} bytes)")
        print(f"  zip offsets: {', '.join(str(o) for o in zip_offsets)}")
        with file_path.open("rb") as f:
            for off in zip_offsets:
                start = max(0, off - args.window)
                end = min(size, off + args.window)
                f.seek(start)
                data = f.read(end - start)
                hits = scan_window(data, start)
                print(f"  window @ {off} +/-{args.window}: {format_hits(hits, off)}")
            eof_start = max(0, size - args.eof_window)
            f.seek(eof_start)
            eof_data = f.read(size - eof_start)
            eof_hits = scan_window(eof_data, eof_start)
            eof_summary = []
            for label in ("PK03_04", "PK01_02", "PK05_06"):
                offs = eof_hits.get(label, [])
                if offs:
                    eof_summary.append(f"{label}: {', '.join(str(o) for o in offs)}")
            if eof_summary:
                print(f"  EOF window (last {size - eof_start} bytes): " + "; ".join(eof_summary))
            else:
                print(f"  EOF window (last {size - eof_start} bytes): no signatures found")
        print("")


if __name__ == "__main__":
    main()
