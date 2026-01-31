import struct
from pathlib import Path
from elftools.elf.elffile import ELFFile

LIB = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
OUT = Path(r"C:\temp\MobileSDK\analysis\vtable_candidates_cluster.md")

CLUSTER_RANGE = (0x02550000, 0x02700000)
MIN_PTRS = 3
CHECK_OFFSETS = [0x0, 0x8, 0x10, 0x18]


def get_exec_ranges(elf):
    ranges = []
    for seg in elf.iter_segments():
        if seg['p_type'] != 'PT_LOAD':
            continue
        if (seg['p_flags'] & 0x1) == 0:
            continue
        start = seg['p_vaddr']
        end = start + seg['p_memsz']
        ranges.append((start, end))
    return ranges


def in_ranges(val, ranges):
    for start, end in ranges:
        if start <= val < end:
            return True
    return False


def scan_section(sec, exec_ranges):
    data = sec.data()
    base = sec['sh_addr']
    hits = []
    for off in range(0, len(data) - 8 * MIN_PTRS, 8):
        ptrs = []
        ok = True
        for i in range(MIN_PTRS):
            val = struct.unpack_from('<Q', data, off + i * 8)[0]
            ptrs.append(val)
            if not in_ranges(val, exec_ranges):
                ok = False
                break
        if not ok:
            continue
        hits.append((base + off, off, ptrs))
    return hits


with LIB.open('rb') as f:
    elf = ELFFile(f)
    exec_ranges = get_exec_ranges(elf)
    if not exec_ranges:
        OUT.write_text("No executable ranges found.\n", encoding="utf-8")
        raise SystemExit(0)

    candidates = []
    for sec_name in ('.rodata', '.data.rel.ro', '.data', '.data.rel.ro.local'):
        sec = elf.get_section_by_name(sec_name)
        if sec is None:
            continue
        hits = scan_section(sec, exec_ranges)
        for vt_addr, off, ptrs in hits:
            for offchk in CHECK_OFFSETS:
                if offchk // 8 < len(ptrs):
                    val = ptrs[offchk // 8]
                else:
                    # fetch additional ptr for offset
                    val = struct.unpack_from('<Q', sec.data(), off + offchk)[0]
                if CLUSTER_RANGE[0] <= val < CLUSTER_RANGE[1]:
                    candidates.append((sec_name, vt_addr, off, offchk, val, ptrs))
                    break

    out = [
        "# Vtable candidate scan (cluster entry in first 4 slots)",
        "",
        f"Library: {LIB}",
        f"Cluster range: 0x{CLUSTER_RANGE[0]:08x}..0x{CLUSTER_RANGE[1]-1:08x}",
        f"Min consecutive exec pointers: {MIN_PTRS}",
        f"Checked offsets: {', '.join(hex(x) for x in CHECK_OFFSETS)}",
        "",
    ]

    if not candidates:
        out.append("No vtable candidates with cluster entry in first 4 slots found.")
    else:
        out.append(f"Candidates: {len(candidates)}")
        for sec_name, vt_addr, off, offchk, val, ptrs in candidates[:200]:
            out.append(
                f"- {sec_name} vaddr=0x{vt_addr:08x} off=0x{off:x} hit@+0x{offchk:x}=0x{val:08x} ptrs="
                + ",".join(f"0x{x:08x}" for x in ptrs)
            )
        if len(candidates) > 200:
            out.append(f"(truncated; total {len(candidates)})")

    OUT.write_text("\n".join(out), encoding="utf-8")
    print(f"Wrote {OUT}")
