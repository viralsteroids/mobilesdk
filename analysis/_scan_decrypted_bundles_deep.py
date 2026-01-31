#!/usr/bin/env python3
"""Deep scan of decrypted bundles for ZSTD patterns and structure"""
import os
import struct
import glob

# Magic bytes
ZSTD_DICT_MAGIC = bytes([0xEC, 0x30, 0xA4, 0x37])
ZSTD_FRAME_MAGIC = bytes([0x28, 0xB5, 0x2F, 0xFD])
ZIP_LOCAL = bytes([0x50, 0x4B, 0x03, 0x04])
ZIP_CENTRAL = bytes([0x50, 0x4B, 0x01, 0x02])
ZIP_END = bytes([0x50, 0x4B, 0x05, 0x06])
SEBUNDLE_MAGIC = b"sebundle1~"

DECRYPTED_DIR = r"C:\temp\MobileSDK\decrypted_bundles"
OFFLINE_XOR_DIR = r"C:\temp\MobileSDK\offline_xor_out"

def entropy(data):
    """Calculate Shannon entropy of data"""
    if not data:
        return 0
    freq = {}
    for b in data:
        freq[b] = freq.get(b, 0) + 1
    ent = 0
    for c in freq.values():
        p = c / len(data)
        if p > 0:
            import math
            ent -= p * math.log2(p)
    return ent

def find_patterns(data, name):
    """Find interesting patterns in data"""
    print(f"\n{'='*60}")
    print(f"FILE: {name}")
    print(f"{'='*60}")
    print(f"Size: {len(data):,} bytes")

    # First 128 bytes hex dump
    print(f"\nFirst 128 bytes:")
    for i in range(0, min(128, len(data)), 16):
        hex_part = ' '.join(f'{b:02x}' for b in data[i:i+16])
        ascii_part = ''.join(chr(b) if 32 <= b < 127 else '.' for b in data[i:i+16])
        print(f"  {i:04x}: {hex_part:<48} {ascii_part}")

    # Entropy of first 1KB, middle, last
    chunk_size = min(1024, len(data))
    ent_first = entropy(data[:chunk_size])
    ent_last = entropy(data[-chunk_size:]) if len(data) > chunk_size else ent_first
    ent_mid = entropy(data[len(data)//2:len(data)//2+chunk_size]) if len(data) > chunk_size else ent_first
    print(f"\nEntropy: first={ent_first:.2f}, mid={ent_mid:.2f}, last={ent_last:.2f} (max 8.0)")

    # Search for magic bytes
    findings = []

    # ZSTD dict
    idx = 0
    while True:
        pos = data.find(ZSTD_DICT_MAGIC, idx)
        if pos == -1:
            break
        findings.append(f"ZSTD_DICT @ 0x{pos:x}")
        idx = pos + 1
        if idx > 10000000:
            break

    # ZSTD frame
    idx = 0
    while True:
        pos = data.find(ZSTD_FRAME_MAGIC, idx)
        if pos == -1:
            break
        findings.append(f"ZSTD_FRAME @ 0x{pos:x}")
        idx = pos + 1
        if idx > 10000000:
            break

    # ZIP local
    idx = 0
    while True:
        pos = data.find(ZIP_LOCAL, idx)
        if pos == -1:
            break
        findings.append(f"ZIP_LOCAL @ 0x{pos:x}")
        idx = pos + 1
        if len(findings) > 100:
            break

    # ZIP end
    pos = data.find(ZIP_END)
    if pos != -1:
        findings.append(f"ZIP_END @ 0x{pos:x}")

    # sebundle magic
    pos = data.find(SEBUNDLE_MAGIC)
    if pos != -1:
        findings.append(f"SEBUNDLE @ 0x{pos:x}")

    # JSON patterns
    for pattern in [b'{"', b'":', b'"}']:
        pos = data.find(pattern)
        if pos != -1:
            findings.append(f"JSON pattern '{pattern.decode()}' @ 0x{pos:x}")

    # Archive signatures
    for sig, name_sig in [
        (b'\x1f\x8b', 'GZIP'),
        (b'BZ', 'BZIP2'),
        (b'\xfd7zXZ', 'XZ'),
        (b'LZMA', 'LZMA'),
        (b'PK', 'ZIP/PKWare'),
        (b'Rar', 'RAR'),
        (b'7z\xbc\xaf\x27\x1c', '7ZIP'),
    ]:
        pos = data.find(sig)
        if pos != -1:
            findings.append(f"{name_sig} sig @ 0x{pos:x}")

    if findings:
        print(f"\nFindings:")
        for f in findings[:30]:
            print(f"  {f}")
        if len(findings) > 30:
            print(f"  ... and {len(findings)-30} more")
    else:
        print("\nNo magic signatures found")

    # Look for readable strings (longer than 8 chars)
    import re
    strings = re.findall(rb'[\x20-\x7E]{8,}', data[:100000])  # First 100KB
    if strings:
        print(f"\nReadable strings (first 10):")
        for s in strings[:10]:
            pos = data.find(s)
            print(f"  0x{pos:x}: {s[:60].decode('ascii', 'replace')}")

    # Try to identify structure at offset 64 (after header)
    if len(data) > 128:
        print(f"\nBytes at offset 64:")
        hex64 = ' '.join(f'{b:02x}' for b in data[64:80])
        print(f"  {hex64}")

        # Check if there are any repeated patterns (indicating encryption/compression)
        if len(data) > 1000:
            # Check for 0x00 bytes frequency
            zero_count = data[:10000].count(0)
            ff_count = data[:10000].count(0xff)
            print(f"\n  In first 10KB: zero bytes={zero_count}, 0xff bytes={ff_count}")

def main():
    # Scan decrypted bundles
    print("=== SCANNING DECRYPTED BUNDLES ===\n")

    if os.path.exists(DECRYPTED_DIR):
        for f in sorted(os.listdir(DECRYPTED_DIR)):
            if f.endswith('.bin'):
                path = os.path.join(DECRYPTED_DIR, f)
                with open(path, 'rb') as fp:
                    data = fp.read()
                find_patterns(data, f)

    # Scan offline XOR output
    print("\n\n=== SCANNING OFFLINE XOR OUTPUT ===\n")

    if os.path.exists(OFFLINE_XOR_DIR):
        for f in sorted(os.listdir(OFFLINE_XOR_DIR)):
            if f.endswith('.bin'):
                path = os.path.join(OFFLINE_XOR_DIR, f)
                with open(path, 'rb') as fp:
                    data = fp.read()
                find_patterns(data, f)

    # Scan key clusters
    print("\n\n=== SCANNING KEY CLUSTERS ===\n")
    key_files = glob.glob(r"C:\temp\MobileSDK\extracted_key_cluster_*.bin")
    for path in sorted(key_files):
        with open(path, 'rb') as fp:
            data = fp.read()
        print(f"\n{os.path.basename(path)}: {len(data)} bytes")
        hex_str = ' '.join(f'{b:02x}' for b in data[:64])
        print(f"  {hex_str}")

if __name__ == "__main__":
    main()
