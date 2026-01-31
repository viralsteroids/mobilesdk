import csv
from pathlib import Path

ROOT = Path(r"C:\temp\MobileSDK")
ASSETS_DIR = ROOT / "extracted_bundles" / "assets"
DECRYPTED_DIR = ROOT / "decrypted_bundles"

TAIL_LEN = 64 * 1024
MIN_STR_LEN = 6
MAX_STR_PREVIEW = 200
MAX_JSON_BRACES = 50

MAGICS = {
    b"PK\x03\x04": "ZIP_LOCAL",
    b"PK\x05\x06": "ZIP_EOCD",
    b"PK\x07\x08": "ZIP_SPANNED",
    b"\x28\xb5\x2f\xfd": "ZSTD_FRAME",
    b"\x50\x2a\x4d\x18": "ZSTD_SKIPPABLE",
    b"\x1f\x8b": "GZIP",
    b"BZh": "BZIP2",
}


def safe_text(text, max_len=MAX_STR_PREVIEW):
    if len(text) > max_len:
        text = text[:max_len] + "...(trunc)"
    return text.encode("unicode_escape").decode("ascii")


def ascii_preview(data):
    return "".join(chr(b) if 32 <= b <= 126 else "." for b in data)


def decode_utf8_char(data, idx):
    if idx >= len(data):
        return None, 1
    b0 = data[idx]
    if b0 < 0x20:
        return None, 1
    if b0 < 0x80:
        return chr(b0), 1
    if 0xC2 <= b0 <= 0xDF:
        if idx + 1 >= len(data):
            return None, 1
        b1 = data[idx + 1]
        if (b1 & 0xC0) != 0x80:
            return None, 1
        ch = bytes([b0, b1]).decode("utf-8", errors="ignore")
        return (ch if ch else None), 2
    if 0xE0 <= b0 <= 0xEF:
        if idx + 2 >= len(data):
            return None, 1
        b1 = data[idx + 1]
        b2 = data[idx + 2]
        if (b1 & 0xC0) != 0x80 or (b2 & 0xC0) != 0x80:
            return None, 1
        if b0 == 0xE0 and b1 < 0xA0:
            return None, 1
        if b0 == 0xED and b1 > 0x9F:
            return None, 1
        ch = bytes([b0, b1, b2]).decode("utf-8", errors="ignore")
        return (ch if ch else None), 3
    if 0xF0 <= b0 <= 0xF4:
        if idx + 3 >= len(data):
            return None, 1
        b1 = data[idx + 1]
        b2 = data[idx + 2]
        b3 = data[idx + 3]
        if (b1 & 0xC0) != 0x80 or (b2 & 0xC0) != 0x80 or (b3 & 0xC0) != 0x80:
            return None, 1
        if b0 == 0xF0 and b1 < 0x90:
            return None, 1
        if b0 == 0xF4 and b1 > 0x8F:
            return None, 1
        ch = bytes([b0, b1, b2, b3]).decode("utf-8", errors="ignore")
        return (ch if ch else None), 4
    return None, 1


def extract_text_strings(data, min_len=MIN_STR_LEN):
    results = []
    i = 0
    while i < len(data):
        j = i
        chars = []
        while j < len(data):
            ch, size = decode_utf8_char(data, j)
            if ch is None or not ch.isprintable():
                break
            chars.append(ch)
            j += size
        if len(chars) >= min_len:
            results.append((i, "".join(chars)))
            i = j
        else:
            i += 1
    return results


def header_payload_size(data):
    if not data.startswith(b"sebundle1~"):
        return None
    tildes = [i for i, b in enumerate(data[:256]) if b == ord("~")]
    if len(tildes) >= 3:
        header_ascii_len = tildes[2] + 1
    else:
        header_ascii_len = 59
    payload_off = header_ascii_len + 64
    if payload_off > len(data):
        return None
    return len(data) - payload_off


def scan_file(path, source, payload_size):
    data = path.read_bytes()
    file_size = len(data)
    tail_len = min(TAIL_LEN, file_size)
    tail = data[-tail_len:]
    tail_base = file_size - tail_len
    rows = []
    stats = {
        "magic_hits": 0,
        "text_hits": 0,
        "json_hits": 0,
        "brace_hits": 0,
        "u32_hits": 0,
        "u64_hits": 0,
        "magic_types": set(),
    }

    for magic, name in MAGICS.items():
        start = 0
        while True:
            idx = tail.find(magic, start)
            if idx == -1:
                break
            rows.append(
                {
                    "file": path.name,
                    "source": source,
                    "file_size": file_size,
                    "payload_size": payload_size if payload_size is not None else "",
                    "tail_offset": idx,
                    "abs_offset": tail_base + idx,
                    "kind": "magic",
                    "subtype": name,
                    "value": "",
                    "endian": "",
                    "width": len(magic),
                    "target": "",
                    "text": "",
                    "preview": ascii_preview(tail[idx : idx + 32]),
                }
            )
            stats["magic_hits"] += 1
            stats["magic_types"].add(name)
            start = idx + 1

    text_strings = extract_text_strings(tail, MIN_STR_LEN)
    for off, s in text_strings:
        rows.append(
            {
                "file": path.name,
                "source": source,
                "file_size": file_size,
                "payload_size": payload_size if payload_size is not None else "",
                "tail_offset": off,
                "abs_offset": tail_base + off,
                "kind": "text",
                "subtype": "utf8",
                "value": len(s),
                "endian": "",
                "width": "",
                "target": "",
                "text": safe_text(s),
                "preview": "",
            }
        )
        stats["text_hits"] += 1

    for off, s in text_strings:
        if ("{" in s or "[" in s) and (":" in s or '":' in s):
            rows.append(
                {
                    "file": path.name,
                    "source": source,
                    "file_size": file_size,
                    "payload_size": payload_size if payload_size is not None else "",
                    "tail_offset": off,
                    "abs_offset": tail_base + off,
                    "kind": "json_like",
                    "subtype": "text_match",
                    "value": len(s),
                    "endian": "",
                    "width": "",
                    "target": "",
                    "text": safe_text(s),
                    "preview": "",
                }
            )
            stats["json_hits"] += 1

    brace_positions = []
    for i, b in enumerate(tail):
        if b in (ord("{"), ord("[")):
            brace_positions.append(i)
    stats["brace_hits"] = len(brace_positions)
    for idx in brace_positions[:MAX_JSON_BRACES]:
        window = tail[max(0, idx - 16) : idx + 48]
        rows.append(
            {
                "file": path.name,
                "source": source,
                "file_size": file_size,
                "payload_size": payload_size if payload_size is not None else "",
                "tail_offset": idx,
                "abs_offset": tail_base + idx,
                "kind": "json_brace",
                "subtype": chr(tail[idx]),
                "value": "",
                "endian": "",
                "width": "",
                "target": "",
                "text": "",
                "preview": ascii_preview(window),
            }
        )

    targets = []
    targets.append((file_size, "file_size"))
    if payload_size is not None:
        targets.append((payload_size, "payload_size"))

    for i in range(0, len(tail) - 3):
        chunk = tail[i : i + 4]
        le = int.from_bytes(chunk, "little")
        be = int.from_bytes(chunk, "big")
        for val, label in targets:
            if le == val:
                rows.append(
                    {
                        "file": path.name,
                        "source": source,
                        "file_size": file_size,
                        "payload_size": payload_size if payload_size is not None else "",
                        "tail_offset": i,
                        "abs_offset": tail_base + i,
                        "kind": "u32",
                        "subtype": "",
                        "value": le,
                        "endian": "le",
                        "width": 4,
                        "target": label,
                        "text": "",
                        "preview": "",
                    }
                )
                stats["u32_hits"] += 1
            if be == val:
                rows.append(
                    {
                        "file": path.name,
                        "source": source,
                        "file_size": file_size,
                        "payload_size": payload_size if payload_size is not None else "",
                        "tail_offset": i,
                        "abs_offset": tail_base + i,
                        "kind": "u32",
                        "subtype": "",
                        "value": be,
                        "endian": "be",
                        "width": 4,
                        "target": label,
                        "text": "",
                        "preview": "",
                    }
                )
                stats["u32_hits"] += 1

    for i in range(0, len(tail) - 7):
        chunk = tail[i : i + 8]
        le = int.from_bytes(chunk, "little")
        be = int.from_bytes(chunk, "big")
        for val, label in targets:
            if le == val:
                rows.append(
                    {
                        "file": path.name,
                        "source": source,
                        "file_size": file_size,
                        "payload_size": payload_size if payload_size is not None else "",
                        "tail_offset": i,
                        "abs_offset": tail_base + i,
                        "kind": "u64",
                        "subtype": "",
                        "value": le,
                        "endian": "le",
                        "width": 8,
                        "target": label,
                        "text": "",
                        "preview": "",
                    }
                )
                stats["u64_hits"] += 1
            if be == val:
                rows.append(
                    {
                        "file": path.name,
                        "source": source,
                        "file_size": file_size,
                        "payload_size": payload_size if payload_size is not None else "",
                        "tail_offset": i,
                        "abs_offset": tail_base + i,
                        "kind": "u64",
                        "subtype": "",
                        "value": be,
                        "endian": "be",
                        "width": 8,
                        "target": label,
                        "text": "",
                        "preview": "",
                    }
                )
                stats["u64_hits"] += 1

    return rows, stats, tail_len


def main():
    rows = []
    summaries = {}
    scanned_files = []

    for path in sorted(ASSETS_DIR.glob("*.se")):
        payload_size = header_payload_size(path.read_bytes())
        file_rows, stats, tail_len = scan_file(path, "se", payload_size)
        rows.extend(file_rows)
        summaries[path.name] = (stats, tail_len)
        scanned_files.append(path)

    for path in sorted(DECRYPTED_DIR.glob("*last_attempt.bin")):
        payload_size = len(path.read_bytes())
        file_rows, stats, tail_len = scan_file(path, "last_attempt", payload_size)
        rows.extend(file_rows)
        summaries[path.name] = (stats, tail_len)
        scanned_files.append(path)

    out_csv = ROOT / "analysis" / "bundle_footer_scan.csv"
    out_md = ROOT / "analysis" / "bundle_footer_scan.md"

    fieldnames = [
        "file",
        "source",
        "file_size",
        "payload_size",
        "tail_offset",
        "abs_offset",
        "kind",
        "subtype",
        "value",
        "endian",
        "width",
        "target",
        "text",
        "preview",
    ]

    with out_csv.open("w", newline="", encoding="utf-8") as f:
        writer = csv.DictWriter(f, fieldnames=fieldnames)
        writer.writeheader()
        for row in rows:
            writer.writerow(row)

    total_magic = sum(s[0]["magic_hits"] for s in summaries.values())
    total_text = sum(s[0]["text_hits"] for s in summaries.values())
    total_json = sum(s[0]["json_hits"] for s in summaries.values())
    total_brace = sum(s[0]["brace_hits"] for s in summaries.values())
    total_u32 = sum(s[0]["u32_hits"] for s in summaries.values())
    total_u64 = sum(s[0]["u64_hits"] for s in summaries.values())
    magic_types = {}
    for stats, _tail_len in summaries.values():
        for name in stats["magic_types"]:
            magic_types[name] = magic_types.get(name, 0) + 1
    if magic_types:
        magic_detail = ", ".join(f"{k}={v}" for k, v in sorted(magic_types.items()))
    else:
        magic_detail = "none"

    lines = []
    lines.append(
        "Scanned last 64KB tails for extracted .se assets and decrypted last_attempt bins. "
        "Magic signatures (ZIP/ZSTD/GZIP/BZIP2) hits: %d (%s); text strings (len>=6): %d; "
        "JSON-like text hits: %d; brace bytes: %d." % (total_magic, magic_detail, total_text, total_json, total_brace)
    )
    lines.append(
        "Size matches inside tails: u32 hits=%d, u64 hits=%d against file_size and payload_size. "
        "See CSV for offsets and previews." % (total_u32, total_u64)
    )
    lines.append("")
    lines.append("Files scanned:")
    for path in scanned_files:
        stats, tail_len = summaries[path.name]
        lines.append(
            f"- {path.name} (size={path.stat().st_size}, tail={tail_len}, "
            f"magic={stats['magic_hits']}, text={stats['text_hits']}, "
            f"json_like={stats['json_hits']}, braces={stats['brace_hits']}, "
            f"u32={stats['u32_hits']}, u64={stats['u64_hits']})"
        )

    out_md.write_text("\n".join(lines), encoding="utf-8")
    print(out_csv)
    print(out_md)


if __name__ == "__main__":
    main()
