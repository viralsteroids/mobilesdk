import sys
from pathlib import Path

apk_path = Path(r"C:\temp\MobileSDK\SmartEngines_apktool\lib\arm64-v8a\libjnimultiengine.so")
full_path = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")

# callsites to map
callsites = [
    0x270d910,
    0x270da50,
    0x270db90,
    0x270dcb4,
    0x270df60,
    0x2710bac,
    0x2710c04,
    0x270e658,
]

apk = apk_path.read_bytes()
full = full_path.read_bytes()

WINDOW = 32  # bytes before and after

lines = []
lines.append(f"APK: {apk_path}")
lines.append(f"FULL: {full_path}")
lines.append(f"window=0x{WINDOW:x}")
lines.append("")

for addr in callsites:
    start = addr - WINDOW
    end = addr + WINDOW
    if start < 0 or end > len(apk):
        lines.append(f"0x{addr:x}: out of range")
        continue
    sig = apk[start:end]
    # search full for sig
    hits = []
    idx = 0
    while True:
        pos = full.find(sig, idx)
        if pos == -1:
            break
        hits.append(pos)
        idx = pos + 1
    lines.append(f"0x{addr:x} :: sig_len={len(sig)} hits={len(hits)}")
    if hits:
        lines.append("  " + ", ".join(hex(h) for h in hits[:10]) + ("" if len(hits) <= 10 else f" (+{len(hits)-10} more)"))
    else:
        lines.append("  (no matches)")

out_path = Path(r"C:\temp\MobileSDK\analysis\apktool_callsite_signature_map.md")
out_path.write_text("\n".join(lines), encoding='utf-8')
print(out_path)
