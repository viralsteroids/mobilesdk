#!/usr/bin/env python3
"""Find ZSTD dictionary in libjnimultiengine.so"""
import struct
import os

SO_PATH = r"C:\temp\MobileSDK\SmartEngines_apktool\lib\arm64-v8a\libjnimultiengine.so"

# ZSTD dictionary magic
ZSTD_DICT_MAGIC = bytes([0xEC, 0x30, 0xA4, 0x37])  # 0x37A430EC little-endian
ZSTD_FRAME_MAGIC = bytes([0x28, 0xB5, 0x2F, 0xFD])  # Standard ZSTD frame

with open(SO_PATH, "rb") as f:
    data = f.read()

print(f"Scanning {len(data):,} bytes for ZSTD patterns...\n")

# 1. Search for ZSTD dictionary magic
print("=== ZSTD Dictionary Magic (0x37A430EC) ===")
idx = 0
dict_locations = []
while True:
    pos = data.find(ZSTD_DICT_MAGIC, idx)
    if pos == -1:
        break
    dict_locations.append(pos)
    # Show context
    context = data[pos:pos+32]
    hex_str = ' '.join(f'{b:02x}' for b in context)
    print(f"  0x{pos:08x}: {hex_str}")
    idx = pos + 1
    if len(dict_locations) >= 20:
        break

if not dict_locations:
    print("  No ZSTD dictionary magic found")

# 2. Search for ZSTD frame magic
print("\n=== ZSTD Frame Magic (0x28B52FFD) ===")
idx = 0
frame_locations = []
while True:
    pos = data.find(ZSTD_FRAME_MAGIC, idx)
    if pos == -1:
        break
    frame_locations.append(pos)
    # Show context
    context = data[pos:pos+32]
    hex_str = ' '.join(f'{b:02x}' for b in context)
    print(f"  0x{pos:08x}: {hex_str}")
    idx = pos + 1
    if len(frame_locations) >= 20:
        break

if not frame_locations:
    print("  No ZSTD frame magic found")

# 3. Look for dictionary-related strings
print("\n=== Dictionary-related strings ===")
dict_strings = [b"dict", b"Dict", b"DICT", b"dictionary", b"Dictionary", b"ZSTD_DDict", b"DDict"]
for s in dict_strings:
    idx = 0
    while True:
        pos = data.find(s, idx)
        if pos == -1:
            break
        # Check if it's a readable string
        start = pos
        while start > 0 and data[start-1] >= 0x20 and data[start-1] < 0x7f:
            start -= 1
        end = pos + len(s)
        while end < len(data) and data[end] >= 0x20 and data[end] < 0x7f:
            end += 1
        string = data[start:end].decode('ascii', errors='ignore')
        if len(string) > len(s):
            print(f"  0x{pos:08x}: {string[:60]}")
        idx = pos + 1
        if idx > pos + 100:
            break

# 4. Look for potential raw dictionary patterns
# ZSTD dictionaries often contain repeated patterns
print("\n=== Potential raw dictionary regions (high repetition) ===")

# Find regions with high byte-pair repetition (common in dictionaries)
window_size = 4096
best_regions = []

for i in range(0, len(data) - window_size, window_size):
    window = data[i:i+window_size]
    # Count unique 3-byte sequences
    trigrams = set()
    for j in range(len(window) - 3):
        trigrams.add(window[j:j+3])

    # Dictionaries tend to have moderate repetition (not random, not trivial)
    ratio = len(trigrams) / (window_size - 3)
    if 0.3 < ratio < 0.7:  # Between highly repetitive and random
        best_regions.append((i, ratio, window[:16]))

# Sort by ratio and show best candidates
best_regions.sort(key=lambda x: abs(x[1] - 0.5))
print(f"Found {len(best_regions)} candidate regions")
for addr, ratio, preview in best_regions[:10]:
    hex_str = ' '.join(f'{b:02x}' for b in preview)
    print(f"  0x{addr:08x}: ratio={ratio:.2f}, {hex_str}...")

# 5. Check for embedded files/resources with ZSTD content
print("\n=== Searching for ZSTD content indicators ===")
indicators = [b"ZSTD", b"zstd", b"zstandard", b"libzstd"]
for ind in indicators:
    positions = []
    idx = 0
    while True:
        pos = data.find(ind, idx)
        if pos == -1:
            break
        positions.append(pos)
        idx = pos + 1
        if len(positions) >= 5:
            break
    if positions:
        print(f"  '{ind.decode()}': found at {[hex(p) for p in positions[:5]]}")

print("\n=== Done ===")
