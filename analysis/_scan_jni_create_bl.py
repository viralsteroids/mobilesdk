import struct
from pathlib import Path
from collections import Counter
from elftools.elf.elffile import ELFFile

LIB = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
OUT = Path(r"C:\temp\MobileSDK\analysis\jni_create_bl_scan.md")

TARGETS = {
    "DocEngine::Create(char*,bool)": 0x00965160,
    "DocEngine::Create(uchar*,int,bool)": 0x009655dc,
    "TextEngine::Create(char*,bool)": 0x0114662c,
    "TextEngine::Create(uchar*,int,bool)": 0x011466b8,
}

SCAN_BYTES = 0x2000
CLUSTER_RANGE = (0x02550000, 0x02700000)
WATCH_TARGETS = {
    0x02558a08: "FUN_02558a08 (InitFromOwnedZipBuffer callee)",
    0x02557a14: "FUN_02557a14 (archive/zstd wrapper)",
    0x02557a90: "FUN_02557a90 (libarchive wrapper)",
    0x026eaef0: "FUN_026eaef0 (archive_open)",
}


def vaddr_to_offset(elf, vaddr):
    for seg in elf.iter_segments():
        if seg['p_type'] != 'PT_LOAD':
            continue
        start = seg['p_vaddr']
        end = start + seg['p_memsz']
        if start <= vaddr < end:
            return seg['p_offset'] + (vaddr - start)
    return None


def decode_bl_targets(data, base_vaddr):
    hits = []
    blr_count = 0
    for i in range(0, len(data), 4):
        if i + 4 > len(data):
            break
        word = struct.unpack_from('<I', data, i)[0]
        # BL immediate
        if (word & 0xFC000000) == 0x94000000:
            imm26 = word & 0x03FFFFFF
            if imm26 & (1 << 25):
                imm26 -= 1 << 26
            target = (base_vaddr + i) + (imm26 << 2)
            hits.append((base_vaddr + i, target))
        # BLR register
        if (word & 0xFFFFFC1F) == 0xD63F0000:
            blr_count += 1
    return hits, blr_count


with LIB.open('rb') as f:
    elf = ELFFile(f)
    out_lines = [
        "# JNI create() BL target scan",
        "",
        f"Library: {LIB}",
        f"Scan window: 0x{SCAN_BYTES:x} bytes",
        "",
    ]

    for name, vaddr in TARGETS.items():
        off = vaddr_to_offset(elf, vaddr)
        if off is None:
            out_lines.append(f"## {name} @ 0x{vaddr:08x}")
            out_lines.append("- ERROR: vaddr not in any PT_LOAD segment")
            out_lines.append("")
            continue

        f.seek(off)
        data = f.read(SCAN_BYTES)
        bl_hits, blr_count = decode_bl_targets(data, vaddr)
        targets = [t for _, t in bl_hits]
        counts = Counter(targets)
        cluster_hits = [(cs, t) for cs, t in bl_hits if CLUSTER_RANGE[0] <= t < CLUSTER_RANGE[1]]
        watch_hits = [(cs, t) for cs, t in bl_hits if t in WATCH_TARGETS]

        out_lines.append(f"## {name} @ 0x{vaddr:08x}")
        out_lines.append(f"- File offset: 0x{off:x}")
        out_lines.append(f"- BL count: {len(bl_hits)}")
        out_lines.append(f"- Unique BL targets: {len(counts)}")
        out_lines.append(f"- BLR count (within window): {blr_count}")

        if cluster_hits:
            out_lines.append("- Targets in archive/ZSTD cluster range:")
            for call_site, target in cluster_hits:
                out_lines.append(f"  - call @ 0x{call_site:08x} -> 0x{target:08x}")
        else:
            out_lines.append("- Targets in archive/ZSTD cluster range: none")

        if watch_hits:
            out_lines.append("- Watch targets hit:")
            for call_site, target in watch_hits:
                out_lines.append(f"  - call @ 0x{call_site:08x} -> 0x{target:08x} ({WATCH_TARGETS[target]})")
        else:
            out_lines.append("- Watch targets hit: none")

        # top 10 targets by frequency
        top = counts.most_common(10)
        out_lines.append("- Top BL targets (by frequency):")
        for tgt, cnt in top:
            out_lines.append(f"  - 0x{tgt:08x}: {cnt}")
        out_lines.append("")

OUT.write_text("\n".join(out_lines), encoding="utf-8")
print(f"Wrote {OUT}")
