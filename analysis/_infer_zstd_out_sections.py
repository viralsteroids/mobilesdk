import os, glob, struct
from collections import Counter

root = r"C:\\temp\\MobileSDK"
paths = sorted(glob.glob(os.path.join(root, "se_dumps", "latest", "zstd_out_*.bin")))
if not paths:
    raise SystemExit("No zstd_out_*.bin files found")

out_md = os.path.join(root, "analysis", "zstd_out_section_inference.md")

# Heuristics
MAX_KIND = 0x08
MAX_SIZE = 0x2000
MAX_IDX = 0x2000

with open(out_md, "w", encoding="ascii") as f:
    f.write("# zstd_out section inference (heuristic)\n\n")
    f.write("Heuristic record rule: kind<=0x08, size<=0x2000, idx<=0x2000.\n\n")
    for p in paths:
        data = open(p, "rb").read()
        n = len(data)
        f.write(f"## {os.path.basename(p)}\n\n")
        if n < 0x30:
            f.write("Too small to parse.\n\n")
            continue
        # Header
        ptrs = [struct.unpack('<Q', data[i:i+8])[0] for i in range(0, 0x20, 8)]
        d0 = struct.unpack('<I', data[0x20:0x24])[0]
        d1 = struct.unpack('<I', data[0x24:0x28])[0]
        f.write("Header:\n\n")
        for i, v in enumerate(ptrs):
            f.write(f"- ptr{i}: 0x{v:016x}\n")
        f.write(f"- d0: 0x{d0:08x}\n- d1: 0x{d1:08x}\n\n")

        # Record table from 0x28
        recs = []
        off = 0x28
        while off + 8 <= n:
            val = struct.unpack('<I', data[off:off+4])[0]
            idx = struct.unpack('<I', data[off+4:off+8])[0]
            kind = (val >> 24) & 0xff
            size = val & 0xffff
            if kind <= MAX_KIND and size <= MAX_SIZE and idx <= MAX_IDX:
                recs.append((off, val, idx, kind, size))
                off += 8
                continue
            break
        end_off = off
        f.write(f"Record table: {len(recs)} records; end offset 0x{end_off:03x}\n\n")
        if recs:
            kc = Counter(r[3] for r in recs)
            f.write("Kind counts:\n\n")
            for k in sorted(kc.keys()):
                f.write(f"- 0x{k:02x}: {kc[k]}\n")
            f.write("\nFirst 10 records:\n\n```")
            for r in recs[:10]:
                _, val, idx, kind, size = r
                f.write(f"\nval=0x{val:08x} idx=0x{idx:08x} kind=0x{kind:02x} size=0x{size:04x}")
            f.write("\n```\n\n")
        else:
            f.write("No records found under heuristic.\n\n")

        # u16 pattern scan on remainder (end_off..)
        if end_off + 2 <= n:
            start = end_off
            # sliding windows of u16, step 0x20 bytes, window 0x100 bytes
            win = 0x100
            step = 0x20
            best = []
            for woff in range(start, max(start, n - win), step):
                chunk = data[woff:woff+win]
                if len(chunk) < 2:
                    continue
                u16 = [struct.unpack('<H', chunk[i:i+2])[0] for i in range(0, len(chunk)-1, 2)]
                if not u16:
                    continue
                hi08 = sum(1 for v in u16 if (v >> 8) == 0x08)
                ratio = hi08 / len(u16)
                best.append((ratio, woff, len(u16), hi08))
            best.sort(reverse=True)
            f.write("Top u16 windows with high byte==0x08 (potential u16 table region):\n\n")
            for ratio, woff, total, hi08 in best[:5]:
                f.write(f"- off 0x{woff:03x}: ratio={ratio:.2f} ({hi08}/{total})\n")
            f.write("\n")
        else:
            f.write("No remainder for u16 scan.\n\n")

print("Wrote", out_md)
