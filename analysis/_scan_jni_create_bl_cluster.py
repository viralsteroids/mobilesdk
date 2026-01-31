import struct
from pathlib import Path
from elftools.elf.elffile import ELFFile

LIB = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
OUT = Path(r"C:\temp\MobileSDK\analysis\jni_create_bl_cluster_hits.md")

TARGETS = {
    "DocEngine::Create(char*,bool)": 0x00965160,
    "DocEngine::Create(uchar*,int,bool)": 0x009655dc,
    "TextEngine::Create(char*,bool)": 0x0114662c,
    "TextEngine::Create(uchar*,int,bool)": 0x011466b8,
}

SCAN_BYTES = 0x10000
CLUSTER_RANGE = (0x02550000, 0x02700000)


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
    for i in range(0, len(data), 4):
        if i + 4 > len(data):
            break
        word = struct.unpack_from('<I', data, i)[0]
        if (word & 0xFC000000) == 0x94000000:
            imm26 = word & 0x03FFFFFF
            if imm26 & (1 << 25):
                imm26 -= 1 << 26
            target = (base_vaddr + i) + (imm26 << 2)
            hits.append((base_vaddr + i, target))
    return hits


with LIB.open('rb') as f:
    elf = ELFFile(f)
    out = [
        "# JNI create() BL targets in archive/ZSTD cluster range",
        "",
        f"Library: {LIB}",
        f"Scan window: 0x{SCAN_BYTES:x} bytes",
        f"Cluster range: 0x{CLUSTER_RANGE[0]:08x}..0x{CLUSTER_RANGE[1]-1:08x}",
        "",
    ]

    for name, vaddr in TARGETS.items():
        off = vaddr_to_offset(elf, vaddr)
        out.append(f"## {name} @ 0x{vaddr:08x}")
        if off is None:
            out.append("- ERROR: vaddr not in any PT_LOAD segment")
            out.append("")
            continue
        f.seek(off)
        data = f.read(SCAN_BYTES)
        hits = decode_bl_targets(data, vaddr)
        cluster_hits = [(cs, t) for cs, t in hits if CLUSTER_RANGE[0] <= t < CLUSTER_RANGE[1]]
        out.append(f"- BL count: {len(hits)}")
        out.append(f"- Cluster hits: {len(cluster_hits)}")
        if cluster_hits:
            out.append("- Calls into cluster range:")
            for call_site, target in cluster_hits:
                out.append(f"  - call @ 0x{call_site:08x} -> 0x{target:08x}")
        else:
            out.append("- Calls into cluster range: none")
        out.append("")

OUT.write_text("\n".join(out), encoding="utf-8")
print(f"Wrote {OUT}")
