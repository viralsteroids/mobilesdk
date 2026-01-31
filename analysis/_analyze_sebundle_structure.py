#!/usr/bin/env python3
"""Deep analysis of .se bundle structure to find dictionary location"""
import struct
import os

BUNDLE_DIR = r"C:\temp\MobileSDK\SmartEngines_apktool\assets"

def analyze_bundle(path):
    """Analyze bundle structure"""
    name = os.path.basename(path)
    with open(path, 'rb') as f:
        data = f.read()

    print(f"\n{'='*70}")
    print(f"BUNDLE: {name}")
    print(f"{'='*70}")
    print(f"Total size: {len(data):,} bytes")

    # Header (first 64 bytes)
    print(f"\n--- HEADER (first 64 bytes) ---")
    for i in range(0, 64, 16):
        hex_part = ' '.join(f'{b:02x}' for b in data[i:i+16])
        ascii_part = ''.join(chr(b) if 32 <= b < 127 else '.' for b in data[i:i+16])
        print(f"  {i:04x}: {hex_part}  {ascii_part}")

    # Parse header as integers
    print(f"\n--- HEADER VALUES (LE) ---")
    for i in range(0, 64, 8):
        val64 = struct.unpack('<Q', data[i:i+8])[0]
        val32_a = struct.unpack('<I', data[i:i+4])[0]
        val32_b = struct.unpack('<I', data[i+4:i+8])[0]
        print(f"  +{i:02d}: {val64:016x} ({val64:>20,}) | {val32_a:08x} {val32_b:08x}")

    # Known header structure:
    # Offset 0: magic "sebundle1~" (10 bytes)
    # After that: various fields

    # Check for sebundle magic
    if data[:10] == b"sebundle1~":
        print("\n--- SEBUNDLE1 FORMAT ---")
        print(f"  Magic: sebundle1~")

        # Try to parse fields after magic
        # At offset 10: likely version or flags
        # At offset 14 or so: size fields?

        if len(data) > 64:
            # Look at bytes 10-63
            for i in range(10, 64, 4):
                val = struct.unpack('<I', data[i:i+4])[0]
                if val > 0 and val < len(data):
                    print(f"  +{i:02d}: {val:08x} ({val:,}) <- potential offset/size")
    else:
        print(f"  Magic: {data[:10].hex()}")

    # Look for markers after header
    print(f"\n--- SEARCHING FOR MARKERS ---")

    # ZSTD magic at various offsets
    zstd_frame = bytes([0x28, 0xB5, 0x2F, 0xFD])
    zstd_dict = bytes([0xEC, 0x30, 0xA4, 0x37])

    for offset in [64, 128, 256, 512, 1024, 2048, 4096]:
        if offset < len(data):
            chunk = data[offset:offset+16]
            hex_str = ' '.join(f'{b:02x}' for b in chunk)
            print(f"  @{offset:5d} (0x{offset:04x}): {hex_str}")

            if chunk[:4] == zstd_frame:
                print(f"    *** ZSTD FRAME MAGIC! ***")
            if chunk[:4] == zstd_dict:
                print(f"    *** ZSTD DICT MAGIC! ***")
            if chunk[:4] == b"PK\x03\x04":
                print(f"    *** ZIP LOCAL FILE! ***")

    # Search for ZSTD magic anywhere in file
    print(f"\n--- ZSTD MAGIC SEARCH ---")

    # Frame magic
    idx = 0
    frame_positions = []
    while True:
        pos = data.find(zstd_frame, idx)
        if pos == -1:
            break
        frame_positions.append(pos)
        idx = pos + 1
        if len(frame_positions) >= 10:
            break

    if frame_positions:
        print(f"  ZSTD Frame magic found at: {[f'0x{p:x}' for p in frame_positions]}")
    else:
        print(f"  ZSTD Frame magic: NOT FOUND")

    # Dict magic
    idx = 0
    dict_positions = []
    while True:
        pos = data.find(zstd_dict, idx)
        if pos == -1:
            break
        dict_positions.append(pos)
        idx = pos + 1
        if len(dict_positions) >= 10:
            break

    if dict_positions:
        print(f"  ZSTD Dict magic found at: {[f'0x{p:x}' for p in dict_positions]}")
    else:
        print(f"  ZSTD Dict magic: NOT FOUND")

    # Search for ZIP signatures
    print(f"\n--- ZIP SIGNATURE SEARCH ---")
    zip_local = b"PK\x03\x04"
    zip_central = b"PK\x01\x02"
    zip_end = b"PK\x05\x06"

    for sig, name in [(zip_local, "LOCAL"), (zip_central, "CENTRAL"), (zip_end, "END")]:
        pos = data.find(sig)
        if pos != -1:
            print(f"  ZIP {name} @ 0x{pos:x}")
            # Show context
            ctx = data[pos:pos+32]
            print(f"    Context: {ctx.hex()}")

    # XOR key analysis
    # The header might contain the XOR key
    print(f"\n--- POTENTIAL XOR KEY IN HEADER ---")

    # Look for repeating patterns that might be keys
    # Common key locations: after magic (offset 10+), or at specific offsets

    # Check if bytes 16-31 or 32-47 look like a key (varied, non-zero)
    for start in [16, 32, 48]:
        chunk = data[start:start+16]
        unique = len(set(chunk))
        zeros = chunk.count(0)
        print(f"  Bytes {start:02d}-{start+15}: unique={unique:2d}, zeros={zeros:2d}, hex={chunk.hex()[:32]}...")

    # Entropy analysis at different offsets
    print(f"\n--- ENTROPY AT DIFFERENT OFFSETS ---")
    import math

    for start in [0, 64, 128, 256, 512, 1024, 4096, 65536]:
        if start + 1024 <= len(data):
            chunk = data[start:start+1024]
            freq = {}
            for b in chunk:
                freq[b] = freq.get(b, 0) + 1
            ent = 0
            for c in freq.values():
                p = c / 1024
                if p > 0:
                    ent -= p * math.log2(p)
            print(f"  @{start:6d}: entropy={ent:.3f}/8.0")

    # Look for dictionary-like patterns
    # Dictionaries often have JSON structure or repeated short patterns
    print(f"\n--- SEARCHING FOR JSON/STRUCTURED DATA ---")

    json_markers = [b'{"', b'":', b'"}', b'[{', b'}]', b'"version"', b'"data"']
    for marker in json_markers:
        pos = data.find(marker)
        if pos != -1:
            ctx = data[max(0, pos-10):pos+40]
            printable = ''.join(chr(b) if 32 <= b < 127 else '.' for b in ctx)
            print(f"  '{marker.decode()}' @ 0x{pos:x}: {printable}")

    # Check last 64 bytes (often contain footer/trailer)
    print(f"\n--- TRAILER (last 64 bytes) ---")
    trailer = data[-64:]
    for i in range(0, 64, 16):
        hex_part = ' '.join(f'{b:02x}' for b in trailer[i:i+16])
        print(f"  -{64-i:04d}: {hex_part}")

# Analyze all bundles
for bundle in os.listdir(BUNDLE_DIR):
    if bundle.endswith('.se'):
        analyze_bundle(os.path.join(BUNDLE_DIR, bundle))
