#!/usr/bin/env python3
"""Scan libjnimultiengine.so for cipher patterns"""
import struct
import os

SO_PATH = r"C:\temp\MobileSDK\SmartEngines_apktool\lib\arm64-v8a\libjnimultiengine.so"

# Known crypto constants
PATTERNS = {
    "AES_SBOX_START": bytes([0x63, 0x7c, 0x77, 0x7b, 0xf2, 0x6b, 0x6f, 0xc5]),
    "AES_RCON": bytes([0x01, 0x02, 0x04, 0x08, 0x10, 0x20, 0x40, 0x80]),
    "ChaCha20_SIGMA": b"expand 32-byte k",
    "ChaCha20_TAU": b"expand 16-byte k",
    "Salsa20_SIGMA": b"expa" + b"nd 3" + b"2-by" + b"te k",
    "RC4_256_PATTERN": bytes(range(256)),  # Initial S-box
    "ZSTD_MAGIC": bytes([0x28, 0xb5, 0x2f, 0xfd]),
    "ZIP_MAGIC": bytes([0x50, 0x4b, 0x03, 0x04]),
}

# Look for specific byte patterns that indicate encryption
def find_pattern(data, pattern, name):
    results = []
    idx = 0
    while True:
        pos = data.find(pattern, idx)
        if pos == -1:
            break
        results.append(pos)
        idx = pos + 1
        if len(results) >= 10:
            break
    return results

def scan_for_256_byte_tables(data):
    """Look for potential S-boxes (256-byte permutation tables)"""
    tables = []
    for i in range(0, len(data) - 256, 16):
        chunk = data[i:i+256]
        # Check if it's a permutation (all values 0-255 appear exactly once)
        if len(set(chunk)) == 256 and set(chunk) == set(range(256)):
            tables.append(i)
            if len(tables) >= 20:
                break
    return tables

def main():
    print(f"Scanning: {SO_PATH}")

    with open(SO_PATH, "rb") as f:
        data = f.read()

    print(f"File size: {len(data):,} bytes\n")

    print("=== Known Crypto Patterns ===")
    for name, pattern in PATTERNS.items():
        results = find_pattern(data, pattern, name)
        if results:
            print(f"{name}: found at {[hex(r) for r in results]}")

    print("\n=== 256-byte Permutation Tables (potential S-boxes) ===")
    sbox_tables = scan_for_256_byte_tables(data)
    if sbox_tables:
        for addr in sbox_tables[:10]:
            # Show first 16 bytes
            chunk = data[addr:addr+16]
            hex_str = ' '.join(f'{b:02x}' for b in chunk)
            print(f"  0x{addr:08x}: {hex_str} ...")
    else:
        print("  No 256-byte permutation tables found")

    print("\n=== Search for XOR-based stream cipher patterns ===")
    # Look for sequences like: LDR, EOR, STR (load-xor-store)
    # In ARM64: pattern around EOR instruction (0x4a in opcode)

    # Count EOR instructions (basic check)
    eor_count = 0
    for i in range(0, len(data) - 4, 4):
        instr = struct.unpack('<I', data[i:i+4])[0]
        # Check for EOR (exclusive or) instruction pattern
        if (instr & 0x7f200000) == 0x4a000000:  # EOR pattern
            eor_count += 1
    print(f"  EOR instructions found: ~{eor_count}")

    print("\n=== Done ===")

if __name__ == "__main__":
    main()
