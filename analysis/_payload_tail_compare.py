import os
import binascii

ROOT = r"C:\temp\MobileSDK"
DIR = os.path.join(ROOT, "offline_xor_out")
REPORT = os.path.join(ROOT, "analysis", "payload_tail_compare.md")

files = [f for f in os.listdir(DIR) if f.endswith(".bin")]
files.sort()

contents = {}
for f in files:
    path = os.path.join(DIR, f)
    with open(path, "rb") as fh:
        data = fh.read()
    contents[f] = data

# compute common suffix length
if files:
    min_len = min(len(contents[f]) for f in files)
    common = 0
    for i in range(1, min_len + 1):
        b = contents[files[0]][-i]
        if all(contents[f][-i] == b for f in files[1:]):
            common = i
        else:
            break
else:
    common = 0

with open(REPORT, "w", encoding="ascii") as out:
    out.write("# Payload tail comparison (offline_xor_out)\n\n")
    out.write(f"Files: {len(files)}. Common suffix length: {common} bytes.\n\n")
    out.write("## Last 64 bytes (hex)\n\n")
    for f in files:
        data = contents[f]
        tail = data[-64:]
        out.write(f"- {f} (size={len(data)}): {binascii.hexlify(tail).decode('ascii')}\n")

print("Wrote", REPORT)
