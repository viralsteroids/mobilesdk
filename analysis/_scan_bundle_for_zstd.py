#!/usr/bin/env python3
"""Scan .se bundle files for ZSTD patterns after XOR decryption"""
import os
import glob

BUNDLE_DIR = r"C:\temp\MobileSDK\SmartEngines_apktool\assets"
DECRYPTED_DIR = r"C:\temp\MobileSDK\decrypted_bundles"

# ZSTD patterns
ZSTD_DICT_MAGIC = bytes([0xEC, 0x30, 0xA4, 0x37])
ZSTD_FRAME_MAGIC = bytes([0x28, 0xB5, 0x2F, 0xFD])
ZIP_MAGIC = bytes([0x50, 0x4B, 0x03, 0x04])

def scan_file(path, name):
    """Scan a file for ZSTD patterns"""
    try:
        with open(path, "rb") as f:
            data = f.read()
    except:
        return

    results = []

    # Check for ZSTD dict magic
    pos = data.find(ZSTD_DICT_MAGIC)
    if pos != -1:
        results.append(f"ZSTD_DICT @ 0x{pos:x}")

    # Check for ZSTD frame magic
    pos = data.find(ZSTD_FRAME_MAGIC)
    if pos != -1:
        results.append(f"ZSTD_FRAME @ 0x{pos:x}")

    # Check for ZIP magic
    pos = data.find(ZIP_MAGIC)
    if pos != -1:
        results.append(f"ZIP @ 0x{pos:x}")

    # Check first bytes
    first_bytes = ' '.join(f'{b:02x}' for b in data[:16])

    if results:
        print(f"\n{name}:")
        print(f"  Size: {len(data):,} bytes")
        print(f"  First 16: {first_bytes}")
        for r in results:
            print(f"  Found: {r}")
    else:
        print(f"{name}: No ZSTD/ZIP magic (first: {first_bytes[:23]}...)")

print("=== Scanning raw .se bundles ===\n")
for bundle in glob.glob(os.path.join(BUNDLE_DIR, "*.se")):
    scan_file(bundle, os.path.basename(bundle))

print("\n\n=== Scanning decrypted bundles ===\n")
if os.path.exists(DECRYPTED_DIR):
    for f in os.listdir(DECRYPTED_DIR):
        path = os.path.join(DECRYPTED_DIR, f)
        if os.path.isfile(path):
            scan_file(path, f)
else:
    print(f"Directory not found: {DECRYPTED_DIR}")

# Also check offline XOR outputs
print("\n\n=== Scanning offline XOR outputs ===\n")
XOR_OUT_DIR = r"C:\temp\MobileSDK\offline_xor_out"
if os.path.exists(XOR_OUT_DIR):
    for f in os.listdir(XOR_OUT_DIR)[:10]:
        path = os.path.join(XOR_OUT_DIR, f)
        if os.path.isfile(path):
            scan_file(path, f)
else:
    print(f"Directory not found: {XOR_OUT_DIR}")
