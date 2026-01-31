#!/usr/bin/env python3
"""Scan dynamic dumps from se_dumps for ZSTD patterns"""
import os
import glob
import struct

# Magic bytes
ZSTD_DICT_MAGIC = bytes([0xEC, 0x30, 0xA4, 0x37])  # 0x37A430EC LE
ZSTD_FRAME_MAGIC = bytes([0x28, 0xB5, 0x2F, 0xFD])
ZIP_MAGIC = bytes([0x50, 0x4B, 0x03, 0x04])
ZIP_CENTRAL = bytes([0x50, 0x4B, 0x01, 0x02])

DUMPS_DIR = r"C:\temp\MobileSDK\se_dumps"

def scan_file(path):
    """Scan a single file for magic patterns"""
    try:
        with open(path, "rb") as f:
            data = f.read()
    except Exception as e:
        return None, str(e)

    results = {
        "size": len(data),
        "first_16": data[:16] if len(data) >= 16 else data,
        "findings": []
    }

    # Check for ZSTD dictionary magic
    pos = 0
    while True:
        idx = data.find(ZSTD_DICT_MAGIC, pos)
        if idx == -1:
            break
        results["findings"].append(f"ZSTD_DICT @ 0x{idx:x}")
        pos = idx + 1
        if pos > 1000000:  # Safety limit
            break

    # Check for ZSTD frame magic
    pos = 0
    while True:
        idx = data.find(ZSTD_FRAME_MAGIC, pos)
        if idx == -1:
            break
        results["findings"].append(f"ZSTD_FRAME @ 0x{idx:x}")
        pos = idx + 1
        if pos > 1000000:
            break

    # Check for ZIP magic
    pos = 0
    while True:
        idx = data.find(ZIP_MAGIC, pos)
        if idx == -1:
            break
        results["findings"].append(f"ZIP_LOCAL @ 0x{idx:x}")
        pos = idx + 1
        if pos > 1000000:
            break

    # Check for ZIP central directory
    idx = data.find(ZIP_CENTRAL)
    if idx != -1:
        results["findings"].append(f"ZIP_CENTRAL @ 0x{idx:x}")

    return results, None

def main():
    print("=== Scanning se_dumps for ZSTD/ZIP patterns ===\n")

    # Collect all .bin files
    files_dir = os.path.join(DUMPS_DIR, "files")
    latest_dir = os.path.join(DUMPS_DIR, "latest")

    all_files = []

    if os.path.exists(files_dir):
        all_files.extend(glob.glob(os.path.join(files_dir, "*.bin")))

    if os.path.exists(latest_dir):
        all_files.extend(glob.glob(os.path.join(latest_dir, "*.bin")))

    print(f"Found {len(all_files)} .bin files to scan\n")

    files_with_findings = []

    for fpath in sorted(all_files):
        fname = os.path.basename(fpath)
        results, error = scan_file(fpath)

        if error:
            print(f"ERROR: {fname}: {error}")
            continue

        first_hex = ' '.join(f'{b:02x}' for b in results["first_16"])

        if results["findings"]:
            files_with_findings.append((fpath, results))
            print(f"\n*** FOUND: {fname} ***")
            print(f"    Size: {results['size']:,} bytes")
            print(f"    First 16: {first_hex}")
            for finding in results["findings"]:
                print(f"    -> {finding}")
        else:
            print(f"{fname}: {results['size']:,} bytes, no magic (first: {first_hex[:23]}...)")

    print("\n" + "="*60)
    print(f"\nSUMMARY: {len(files_with_findings)}/{len(all_files)} files contain ZSTD/ZIP magic")

    if files_with_findings:
        print("\nFiles with findings:")
        for fpath, results in files_with_findings:
            print(f"  {os.path.basename(fpath)}: {results['findings']}")

    # Additional analysis on zstd_out files
    print("\n\n=== Detailed analysis of zstd_out_*.bin files ===\n")
    zstd_out_files = [f for f in all_files if "zstd_out" in f]

    for fpath in sorted(zstd_out_files):
        fname = os.path.basename(fpath)
        try:
            with open(fpath, "rb") as f:
                data = f.read()

            print(f"\n{fname}:")
            print(f"  Size: {len(data):,} bytes")

            # First 64 bytes hex dump
            print(f"  First 64 bytes:")
            for i in range(0, min(64, len(data)), 16):
                hex_part = ' '.join(f'{b:02x}' for b in data[i:i+16])
                ascii_part = ''.join(chr(b) if 32 <= b < 127 else '.' for b in data[i:i+16])
                print(f"    {i:04x}: {hex_part:<48} {ascii_part}")

            # Try to detect structure
            if len(data) >= 4:
                first_int = struct.unpack('<I', data[:4])[0]
                print(f"  First 4 bytes as LE uint32: 0x{first_int:08x} ({first_int})")

        except Exception as e:
            print(f"  Error: {e}")

    # Additional analysis on bundle_init_input files
    print("\n\n=== Sample analysis of bundle_init_input_*.bin files ===\n")
    init_files = [f for f in all_files if "bundle_init_input" in f][:5]  # First 5

    for fpath in sorted(init_files):
        fname = os.path.basename(fpath)
        try:
            with open(fpath, "rb") as f:
                data = f.read()

            print(f"\n{fname}:")
            print(f"  Size: {len(data):,} bytes")

            # First 64 bytes hex dump
            print(f"  First 64 bytes:")
            for i in range(0, min(64, len(data)), 16):
                hex_part = ' '.join(f'{b:02x}' for b in data[i:i+16])
                ascii_part = ''.join(chr(b) if 32 <= b < 127 else '.' for b in data[i:i+16])
                print(f"    {i:04x}: {hex_part:<48} {ascii_part}")

        except Exception as e:
            print(f"  Error: {e}")

if __name__ == "__main__":
    main()
