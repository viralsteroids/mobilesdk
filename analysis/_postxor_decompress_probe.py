import argparse
import bz2
import gzip
import re
import zlib
from pathlib import Path

MAGIC_REGEX = re.compile(r"^##\s+(?P<bundle>.+?)\.se$", re.M)
LINE_REGEX = re.compile(r"^-\s+(?P<magic>[^:]+):\s+(?P<offsets>.+)$")

ZLIB_TYPES = {"ZLIB_78_01", "ZLIB_78_9C", "ZLIB_78_DA"}
GZIP_TYPE = "GZIP"

LZ4_MAGIC = b"\x04\x22\x4d\x18"
BZIP2_MAGIC = b"BZh"


def parse_magic_scan(text):
    bundles = {}
    current = None
    for line in text.splitlines():
        m = MAGIC_REGEX.match(line.strip())
        if m:
            current = m.group("bundle")
            bundles[current] = {}
            continue
        if not current:
            continue
        line = line.strip()
        if not line.startswith("-"):
            continue
        m = LINE_REGEX.match(line)
        if not m:
            continue
        magic = m.group("magic").strip()
        offsets = []
        for tok in m.group("offsets").split(","):
            tok = tok.strip()
            if not tok:
                continue
            try:
                offsets.append(int(tok))
            except ValueError:
                pass
        bundles[current][magic] = offsets
    return bundles


def map_bundle_to_file(bundle_name, in_dir):
    candidate = f"{bundle_name}_last_attempt.bin"
    path = Path(in_dir) / candidate
    if path.exists():
        return path
    # fallback: some names might already include bundle_ prefix
    for p in Path(in_dir).glob("*_last_attempt.bin"):
        if p.name.startswith(bundle_name):
            return p
    return None


def stream_decompress(decomp, data, max_out=1024 * 1024):
    out = bytearray()
    view = memoryview(data)
    idx = 0
    chunk = 256 * 1024
    while idx < len(view) and len(out) < max_out:
        piece = view[idx:idx + chunk]
        try:
            out.extend(decomp.decompress(piece, max_out - len(out)))
        except Exception as exc:
            return None, exc, False
        idx += len(piece)
        if getattr(decomp, "eof", False):
            return bytes(out), None, True
    return bytes(out), None, getattr(decomp, "eof", False)


def try_zlib_variants(data):
    variants = [
        ("zlib", zlib.MAX_WBITS),
        ("raw", -zlib.MAX_WBITS),
        ("gzip", zlib.MAX_WBITS + 16),
    ]
    for label, wbits in variants:
        decomp = zlib.decompressobj(wbits)
        out, err, eof = stream_decompress(decomp, data)
        if err is None:
            return label, out, eof
    return None, None, False


def try_gzip(data):
    try:
        out = gzip.decompress(data)
        return "gzip", out, True, None
    except Exception as exc:
        return None, None, False, exc


def try_bzip2(data):
    decomp = bz2.BZ2Decompressor()
    out, err, eof = stream_decompress(decomp, data)
    return out, err, eof


def scan_magic_offsets(data, magic, limit=20):
    hits = []
    start = 0
    while True:
        idx = data.find(magic, start)
        if idx == -1:
            break
        hits.append(idx)
        if len(hits) >= limit:
            break
        start = idx + 1
    return hits


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--magic-scan", default=r"C:\\temp\\MobileSDK\\analysis\\postxor_magic_scan.md")
    ap.add_argument("--in-dir", default=r"C:\\temp\\MobileSDK\\decrypted_bundles")
    ap.add_argument("--out", default=r"C:\\temp\\MobileSDK\\analysis\\postxor_layer2_probe_results.md")
    ap.add_argument("--max-per-type", type=int, default=10)
    args = ap.parse_args()

    text = Path(args.magic_scan).read_text(encoding="utf-8")
    bundles = parse_magic_scan(text)

    lines = []
    lines.append("# Post-XOR layer2 decompression probe")
    lines.append("")
    lines.append("Method: attempt gzip/zlib/bzip2 decompression at magic offsets from postxor_magic_scan.md. For zlib, test zlib/raw/gzip wbits variants and record first that yields output (up to 1 MiB) and whether EOF is reached.")
    lines.append("")

    for bundle, magics in bundles.items():
        in_path = map_bundle_to_file(bundle, args.in_dir)
        lines.append(f"## {bundle}")
        if not in_path:
            lines.append("- Input file: MISSING")
            lines.append("")
            continue
        data = in_path.read_bytes()
        lines.append(f"- Input file: {in_path.name} ({len(data)} bytes)")

        # zlib offsets
        zlib_offsets = []
        for m in ZLIB_TYPES:
            zlib_offsets.extend(magics.get(m, []))
        zlib_offsets = sorted(set(zlib_offsets))[: args.max_per_type]
        if zlib_offsets:
            lines.append(f"- ZLIB offsets tested (first {len(zlib_offsets)}): {', '.join(str(o) for o in zlib_offsets)}")
            for off in zlib_offsets:
                label, out, eof = try_zlib_variants(data[off:])
                if label:
                    status = "eof" if eof else "partial"
                    lines.append(f"  - zlib @ {off}: OK via {label}, out_len={len(out)} ({status})")
                else:
                    # try to capture a representative error
                    try:
                        zlib.decompress(data[off:])
                    except Exception as exc:
                        lines.append(f"  - zlib @ {off}: FAIL ({type(exc).__name__}: {exc})")
        else:
            lines.append("- ZLIB offsets tested: none")

        # gzip offsets
        gzip_offsets = sorted(magics.get(GZIP_TYPE, []))[: args.max_per_type]
        if gzip_offsets:
            lines.append(f"- GZIP offsets tested (first {len(gzip_offsets)}): {', '.join(str(o) for o in gzip_offsets)}")
            for off in gzip_offsets:
                label, out, eof, err = try_gzip(data[off:])
                if label:
                    lines.append(f"  - gzip @ {off}: OK, out_len={len(out)}")
                else:
                    # try zlib wbits=31 fallback
                    try:
                        out = zlib.decompress(data[off:], zlib.MAX_WBITS + 16)
                        lines.append(f"  - gzip @ {off}: OK via zlib(wbits=31), out_len={len(out)}")
                    except Exception as exc:
                        lines.append(f"  - gzip @ {off}: FAIL ({type(exc).__name__}: {exc})")
        else:
            lines.append("- GZIP offsets tested: none")

        # bzip2 scan
        bzip_hits = scan_magic_offsets(data, BZIP2_MAGIC, limit=args.max_per_type)
        if bzip_hits:
            lines.append(f"- BZIP2 magic hits tested (first {len(bzip_hits)}): {', '.join(str(o) for o in bzip_hits)}")
            for off in bzip_hits:
                out, err, eof = try_bzip2(data[off:])
                if err is None:
                    status = "eof" if eof else "partial"
                    lines.append(f"  - bzip2 @ {off}: OK, out_len={len(out)} ({status})")
                else:
                    lines.append(f"  - bzip2 @ {off}: FAIL ({type(err).__name__}: {err})")
        else:
            lines.append("- BZIP2 magic hits tested: none")

        # lz4 scan (no stdlib decoder)
        lz4_hits = scan_magic_offsets(data, LZ4_MAGIC, limit=args.max_per_type)
        if lz4_hits:
            lines.append(f"- LZ4 frame magic hits: {', '.join(str(o) for o in lz4_hits)} (lz4 module not available in stdlib)")
        else:
            lines.append("- LZ4 frame magic hits: none")

        lines.append("")

    Path(args.out).write_text("\n".join(lines), encoding="utf-8")
    print(args.out)


if __name__ == "__main__":
    main()
