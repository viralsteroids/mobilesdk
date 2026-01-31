#!/usr/bin/env python3
"""Analyze the RC4 S-box region in detail"""
import struct

SO_PATH = r"C:\temp\MobileSDK\SmartEngines_apktool\lib\arm64-v8a\libjnimultiengine.so"
RC4_OFFSET = 0x38c92e

with open(SO_PATH, "rb") as f:
    data = f.read()

print(f"=== Region around RC4 S-box (0x{RC4_OFFSET:08x}) ===\n")

# Show context before
print("Before S-box (-64 bytes):")
for i in range(4):
    off = RC4_OFFSET - 64 + i * 16
    chunk = data[off:off+16]
    hex_str = ' '.join(f'{b:02x}' for b in chunk)
    ascii_str = ''.join(chr(b) if 32 <= b < 127 else '.' for b in chunk)
    print(f"  0x{off:08x}: {hex_str}  |{ascii_str}|")

print("\nRC4 S-box (first 32 bytes):")
chunk = data[RC4_OFFSET:RC4_OFFSET+32]
hex_str = ' '.join(f'{b:02x}' for b in chunk)
print(f"  {hex_str}")

print("\nAfter S-box (+256 bytes):")
for i in range(4):
    off = RC4_OFFSET + 256 + i * 16
    chunk = data[off:off+16]
    hex_str = ' '.join(f'{b:02x}' for b in chunk)
    ascii_str = ''.join(chr(b) if 32 <= b < 127 else '.' for b in chunk)
    print(f"  0x{off:08x}: {hex_str}  |{ascii_str}|")

# Check for code references to this address
# In ARM64, this would be via ADRP + ADD pattern
base_page = (RC4_OFFSET >> 12) << 12
page_offset = RC4_OFFSET & 0xfff

print(f"\n=== Address encoding ===")
print(f"Base page: 0x{base_page:08x}")
print(f"Page offset: 0x{page_offset:03x}")
print(f"For ADRP+ADD reference pattern")

# Also check the interesting S-box at 0x38de50
print("\n=== Custom S-box at 0x0038de50 ===")
custom_sbox = data[0x38de50:0x38de50+256]
hex_preview = ' '.join(f'{b:02x}' for b in custom_sbox[:32])
print(f"First 32: {hex_preview}")

# Analyze custom S-box
byte_counts = {}
for b in custom_sbox:
    byte_counts[b] = byte_counts.get(b, 0) + 1

duplicates = {k: v for k, v in byte_counts.items() if v > 1}
if duplicates:
    print(f"Duplicates found: {len(duplicates)} values")
else:
    print("Full permutation (no duplicates)")
    # Show permutation analysis
    print(f"Min: {min(custom_sbox)}, Max: {max(custom_sbox)}, Unique: {len(set(custom_sbox))}")
