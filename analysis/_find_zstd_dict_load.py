#!/usr/bin/env python3
"""Find ZSTD dictionary loading functions and embedded dictionaries in SO"""
import struct
import re

SO_PATH = r"C:\temp\MobileSDK\SmartEngines_apktool\lib\arm64-v8a\libjnimultiengine.so"

# ZSTD dictionary magic
ZSTD_DICT_MAGIC = bytes([0xEC, 0x30, 0xA4, 0x37])  # 0x37A430EC LE
ZSTD_FRAME_MAGIC = bytes([0x28, 0xB5, 0x2F, 0xFD])

with open(SO_PATH, "rb") as f:
    data = f.read()

print(f"Scanning {len(data):,} bytes for ZSTD patterns\n")

# 1. Search for ZSTD API strings
print("=== ZSTD API Strings ===")
zstd_strings = [
    b"ZSTD_createDCtx",
    b"ZSTD_decompress",
    b"ZSTD_decompressDCtx",
    b"ZSTD_DCtx_loadDictionary",
    b"ZSTD_DDict",
    b"ZSTD_createDDict",
    b"ZSTD_freeDDict",
    b"ZSTD_decompress_usingDDict",
    b"ZSTD_getDictID_fromDict",
    b"ZSTD_getDictID_fromDDict",
    b"ZSTD_getDictID_fromFrame",
    b"ZSTD_compress_usingDict",
    b"ZSTD_decompress_usingDict",
    b"ZSTD_CDict",
    b"ZSTD_trainFromBuffer",
    b"ZSTD_DStream",
    b"ZSTD_initDStream",
    b"ZSTD_decompressStream",
    b"archive_read_support_filter_zstd",
    b"archive_read_add_passphrase",
    b"zstd",
    b"ZSTD",
]

for s in zstd_strings:
    positions = []
    idx = 0
    while True:
        pos = data.find(s, idx)
        if pos == -1:
            break
        positions.append(pos)
        idx = pos + 1
        if len(positions) >= 10:
            break
    if positions:
        print(f"  '{s.decode()}': {[hex(p) for p in positions[:5]]}")

# 2. Search for embedded dictionaries by looking for magic at various offsets
print("\n=== Searching for Embedded Dictionary Magic ===")

# The dictionary might be XOR'd or otherwise obfuscated
# Let's look for the magic bytes 0x37A430EC

# Direct search
positions = []
idx = 0
while True:
    pos = data.find(ZSTD_DICT_MAGIC, idx)
    if pos == -1:
        break
    positions.append(pos)
    idx = pos + 1
    if len(positions) >= 20:
        break

if positions:
    print(f"ZSTD_DICT_MAGIC found at: {[hex(p) for p in positions]}")
else:
    print("ZSTD_DICT_MAGIC not found directly")

# Search for ZSTD frame magic
positions = []
idx = 0
while True:
    pos = data.find(ZSTD_FRAME_MAGIC, idx)
    if pos == -1:
        break
    positions.append(pos)
    idx = pos + 1
    if len(positions) >= 20:
        break

if positions:
    print(f"ZSTD_FRAME_MAGIC found at: {[hex(p) for p in positions]}")
else:
    print("ZSTD_FRAME_MAGIC not found directly")

# 3. Search for dictionary-related constants
# ZSTD dictionaries typically start with magic then dictionary ID (4 bytes)
print("\n=== Searching for Dictionary ID Patterns ===")

# Look for patterns like EC 30 A4 37 XX XX XX XX where XXXX is dict ID
for i in range(0, len(data) - 8):
    chunk = data[i:i+4]
    if chunk == ZSTD_DICT_MAGIC:
        dict_id = struct.unpack('<I', data[i+4:i+8])[0]
        context = data[i:i+32]
        hex_str = ' '.join(f'{b:02x}' for b in context)
        print(f"  0x{i:08x}: magic + dictID=0x{dict_id:08x}")
        print(f"    {hex_str}")

# 4. Look for large embedded data blobs that could be dictionaries
# ZSTD dictionaries are typically 32KB-128KB in size
print("\n=== Searching for Large Embedded Data (potential dicts) ===")

# Find sections of data with dictionary-like entropy (moderate, not random)
window = 32768  # 32KB
candidates = []

for i in range(0, len(data) - window, window // 4):
    chunk = data[i:i+window]

    # Calculate byte frequency
    freq = {}
    for b in chunk:
        freq[b] = freq.get(b, 0) + 1

    # Dictionaries have moderate entropy - more varied than code, less than random
    unique_bytes = len(freq)
    max_freq = max(freq.values())
    min_freq = min(freq.values())

    # Heuristic: dictionaries have 200-256 unique bytes, not dominated by any single byte
    if unique_bytes > 200 and max_freq < window // 10:
        # Check if it contains printable sequences (common in text dictionaries)
        printable_runs = re.findall(rb'[\x20-\x7e]{8,}', chunk)
        total_printable = sum(len(r) for r in printable_runs)
        printable_ratio = total_printable / window

        if printable_ratio > 0.1:  # At least 10% printable
            candidates.append((i, unique_bytes, printable_ratio, printable_runs[:3]))

print(f"Found {len(candidates)} potential dictionary regions")
for addr, unique, ratio, samples in candidates[:10]:
    print(f"  0x{addr:08x}: unique_bytes={unique}, printable={ratio:.2%}")
    for s in samples[:2]:
        print(f"    Sample: {s[:40].decode('ascii', 'replace')}")

# 5. Search for archive_read functions with dictionary support
print("\n=== Archive Functions with Filter Support ===")
archive_funcs = [
    b"archive_read_support_filter_all",
    b"archive_read_support_filter_zstd",
    b"archive_read_support_format_zip",
    b"archive_read_set_passphrase_callback",
    b"archive_read_add_passphrase",
    b"archive_entry_pathname",
]

for s in archive_funcs:
    pos = data.find(s)
    if pos != -1:
        # Get context around the string
        start = max(0, pos - 20)
        end = min(len(data), pos + len(s) + 20)
        context = data[start:end]
        print(f"  0x{pos:08x}: {s.decode()}")

# 6. Look for dictionary loading patterns in code
# ADRP+ADD to load dictionary address, then call to ZSTD function
print("\n=== Potential Dictionary Reference Patterns ===")

# Find all "dict" related strings and their references
dict_refs = []
idx = 0
while True:
    pos = data.find(b"dict", idx)
    if pos == -1:
        break
    # Get surrounding context
    start = max(0, pos - 4)
    end = min(len(data), pos + 20)
    context = data[start:end]

    # Check if it's a readable string
    try:
        s = context.decode('ascii', errors='ignore')
        if 'dict' in s.lower() and any(c.isalpha() for c in s):
            dict_refs.append((pos, s.strip('\x00').strip()))
    except:
        pass

    idx = pos + 1
    if len(dict_refs) >= 50:
        break

print(f"Found {len(dict_refs)} 'dict' related strings:")
for pos, s in dict_refs[:20]:
    print(f"  0x{pos:08x}: {s[:60]}")

print("\n=== Done ===")
