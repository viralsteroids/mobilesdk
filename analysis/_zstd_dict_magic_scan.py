import struct
from pathlib import Path

paths = [
    Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so"),
    Path(r"C:\temp\MobileSDK\SmartEngines_apktool\lib\arm64-v8a\libjnimultiengine.so"),
]

MAGICS = {
    'zstd_frame': bytes.fromhex('28 B5 2F FD'),
    'zstd_dict': bytes.fromhex('37 A4 30 EC'),
}

def find_all(data, pat):
    out = []
    start = 0
    while True:
        idx = data.find(pat, start)
        if idx == -1:
            break
        out.append(idx)
        start = idx + 1
    return out

lines = []
for path in paths:
    if not path.exists():
        lines.append(f"{path} :: missing")
        continue
    data = path.read_bytes()
    lines.append(f"{path} size={len(data)}")
    for name, pat in MAGICS.items():
        offs = find_all(data, pat)
        if offs:
            sample = ', '.join(hex(o) for o in offs[:20])
            extra = '' if len(offs) <= 20 else f" (+{len(offs)-20} more)"
            lines.append(f"  - {name}: {sample}{extra}")
        else:
            lines.append(f"  - {name}: none")

out_path = Path(r"C:\temp\MobileSDK\analysis\zstd_dict_magic_scan.md")
out_path.write_text("\n".join(lines), encoding='utf-8')
print(out_path)
