from pathlib import Path
import struct

TARGETS = [
    Path(r"C:\temp\MobileSDK\decrypted_bundles\bundle_codeengine_full_decrypted_raw.bin"),
    Path(r"C:\temp\MobileSDK\decrypted_bundles\bundle_international_faces_liveness_decrypted_raw.bin"),
    Path(r"C:\temp\MobileSDK\extracted_bundles\assets\bundle_international_faces_liveness.se"),
]

OUT = Path(r"C:\temp\MobileSDK\analysis\zstd_skippable_validation.md")

SKIP_BASE = 0x184D2A50
SKIP_LAST = 0x184D2A5F
ZSTD_MAGIC = 0xFD2FB528


def find_skippable(data: bytes):
    hits = []
    for magic in range(SKIP_BASE, SKIP_LAST + 1):
        pat = struct.pack('<I', magic)
        start = 0
        while True:
            off = data.find(pat, start)
            if off < 0:
                break
            hits.append((off, magic))
            start = off + 1
    hits.sort()
    return hits


def fmt_hex(b: bytes):
    return " ".join(f"{x:02x}" for x in b)


lines = [
    "# ZSTD skippable frame validation",
    "",
    "Skippable magic range: 0x184D2A50..0x184D2A5F",
    "ZSTD frame magic: 0xFD2FB528",
    "",
]

hit_counter = 0
for path in TARGETS:
    if not path.exists():
        continue
    data = path.read_bytes()
    hits = find_skippable(data)
    hit_counter += len(hits)
    lines.append(f"## {path.name}")
    lines.append(f"- size: {len(data)}")
    if not hits:
        lines.append("- skippable hits: none")
        lines.append("")
        continue
    lines.append(f"- skippable hits: {len(hits)}")
    lines.append("")
    for off, magic in hits:
        size = None
        end = None
        ok = False
        if off + 8 <= len(data):
            size = struct.unpack_from('<I', data, off + 4)[0]
            end = off + 8 + size
            ok = end <= len(data)
        preview = data[off:off+32]
        post = data[end:end+4] if ok and end is not None and end + 4 <= len(data) else b""
        post_u32 = struct.unpack('<I', post)[0] if len(post) == 4 else None
        size_str = "?" if size is None else str(size)
        end_str = "?" if end is None else f"0x{end:08x}"
        lines.append(
            f"- offset 0x{off:08x} magic=0x{magic:08x} size={size_str} end={end_str} within_file={ok}"
        )
        lines.append(f"  - header+data preview: {fmt_hex(preview)}")
        if post_u32 is not None:
            if post_u32 == ZSTD_MAGIC:
                lines.append("  - next_u32: ZSTD frame magic (0xFD2FB528)")
            elif SKIP_BASE <= post_u32 <= SKIP_LAST:
                lines.append(f"  - next_u32: skippable magic (0x{post_u32:08x})")
            else:
                lines.append(f"  - next_u32: 0x{post_u32:08x}")
        lines.append("")

lines.insert(5, f"Total skippable hits scanned: {hit_counter}")
lines.insert(6, "")

OUT.write_text("\n".join(lines), encoding="utf-8")
print(f"Wrote {OUT}")
