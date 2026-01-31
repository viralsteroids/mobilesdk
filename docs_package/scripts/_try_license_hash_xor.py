#!/usr/bin/env python3
"""Try XOR decryption using license hash from bundle header"""
import os
import struct
import hashlib

BUNDLE_PATH = r"C:\temp\MobileSDK\SmartEngines_apktool\assets\bundle_textengine.se"
OUTPUT_DIR = r"C:\temp\MobileSDK\decrypted_bundles"

# License hash from header (ASCII hex)
LICENSE_HASH_HEX = "2688f026b0f34dea31b377bfe5fd1f6ecf2b984810"

# Convert to various key formats
LICENSE_HASH_BYTES = bytes.fromhex(LICENSE_HASH_HEX)  # 20 bytes
LICENSE_HASH_ASCII = LICENSE_HASH_HEX.encode('ascii')  # 40 bytes

print(f"License hash (hex): {LICENSE_HASH_HEX}")
print(f"License hash (bytes): {LICENSE_HASH_BYTES.hex()}")
print(f"License hash length: {len(LICENSE_HASH_BYTES)} bytes")

# Read bundle
with open(BUNDLE_PATH, 'rb') as f:
    data = f.read()

print(f"\nBundle size: {len(data):,} bytes")
print(f"Header: {data[:64]}")

# Data starts at offset 64
DATA_START = 64
encrypted_data = data[DATA_START:]
print(f"Encrypted data size: {len(encrypted_data):,} bytes")

def xor_decrypt(data, key):
    """XOR decrypt with repeating key"""
    result = bytearray(len(data))
    key_len = len(key)
    for i, b in enumerate(data):
        result[i] = b ^ key[i % key_len]
    return bytes(result)

def entropy(data):
    """Calculate Shannon entropy"""
    if not data:
        return 0
    freq = {}
    for b in data:
        freq[b] = freq.get(b, 0) + 1
    ent = 0
    import math
    for c in freq.values():
        p = c / len(data)
        if p > 0:
            ent -= p * math.log2(p)
    return ent

def check_decrypted(data, name):
    """Check if decrypted data looks valid"""
    print(f"\n=== {name} ===")

    # First 64 bytes
    print(f"First 64 bytes:")
    for i in range(0, 64, 16):
        hex_part = ' '.join(f'{b:02x}' for b in data[i:i+16])
        ascii_part = ''.join(chr(b) if 32 <= b < 127 else '.' for b in data[i:i+16])
        print(f"  {i:04x}: {hex_part}  {ascii_part}")

    # Check for magic bytes
    zstd_frame = bytes([0x28, 0xB5, 0x2F, 0xFD])
    zstd_dict = bytes([0xEC, 0x30, 0xA4, 0x37])
    zip_local = b"PK\x03\x04"

    if data[:4] == zstd_frame:
        print("  *** ZSTD FRAME MAGIC AT START! ***")
    if data[:4] == zstd_dict:
        print("  *** ZSTD DICT MAGIC AT START! ***")
    if data[:4] == zip_local:
        print("  *** ZIP LOCAL AT START! ***")

    # Search for magic
    for magic, name_m in [(zstd_frame, "ZSTD_FRAME"), (zstd_dict, "ZSTD_DICT"), (zip_local, "ZIP")]:
        pos = data.find(magic)
        if pos != -1 and pos < 10000:
            print(f"  Found {name_m} @ 0x{pos:x}")

    # Entropy
    ent = entropy(data[:4096])
    print(f"  Entropy (first 4KB): {ent:.3f}/8.0")

    # Check for printable ratio
    printable = sum(1 for b in data[:4096] if 32 <= b < 127 or b in (9, 10, 13))
    print(f"  Printable ratio (first 4KB): {printable/4096:.1%}")

    return data

# Try different key derivations
print("\n" + "="*70)
print("TRYING DIFFERENT KEY DERIVATIONS")
print("="*70)

# 1. Raw license hash bytes (20 bytes)
decrypted = xor_decrypt(encrypted_data, LICENSE_HASH_BYTES)
check_decrypted(decrypted, "XOR with raw hash bytes (20B)")

# 2. License hash as ASCII (40 bytes)
decrypted = xor_decrypt(encrypted_data, LICENSE_HASH_ASCII)
check_decrypted(decrypted, "XOR with ASCII hash (40B)")

# 3. MD5 of license hash
md5_key = hashlib.md5(LICENSE_HASH_BYTES).digest()
decrypted = xor_decrypt(encrypted_data, md5_key)
check_decrypted(decrypted, "XOR with MD5(hash)")

# 4. SHA256 of license hash
sha256_key = hashlib.sha256(LICENSE_HASH_BYTES).digest()
decrypted = xor_decrypt(encrypted_data, sha256_key)
check_decrypted(decrypted, "XOR with SHA256(hash)")

# 5. SHA256 of ASCII hash
sha256_ascii_key = hashlib.sha256(LICENSE_HASH_ASCII).digest()
decrypted = xor_decrypt(encrypted_data, sha256_ascii_key)
check_decrypted(decrypted, "XOR with SHA256(ASCII hash)")

# 6. Just first 16 bytes of hash
decrypted = xor_decrypt(encrypted_data, LICENSE_HASH_BYTES[:16])
check_decrypted(decrypted, "XOR with hash[:16]")

# 7. Just first 8 bytes of hash
decrypted = xor_decrypt(encrypted_data, LICENSE_HASH_BYTES[:8])
check_decrypted(decrypted, "XOR with hash[:8]")

# 8. XOR with the 5 binary bytes after header (offset 59-63)
tail_bytes = data[59:64]
print(f"\nHeader tail bytes (59-63): {tail_bytes.hex()}")
decrypted = xor_decrypt(encrypted_data, tail_bytes)
check_decrypted(decrypted, "XOR with header tail (5B)")

# 9. Combine: XOR with hash then with tail
combined_key = LICENSE_HASH_BYTES + tail_bytes
decrypted = xor_decrypt(encrypted_data, combined_key)
check_decrypted(decrypted, "XOR with hash+tail (25B)")

# 10. Try known ZSTD frame header XOR to find key
# If we assume output should start with ZSTD magic
expected_start = bytes([0x28, 0xB5, 0x2F, 0xFD])
actual_start = encrypted_data[:4]
derived_key = bytes(a ^ b for a, b in zip(actual_start, expected_start))
print(f"\nIf output should be ZSTD frame, XOR key starts with: {derived_key.hex()}")

# 11. Try if output should be ZIP
expected_zip = b"PK\x03\x04"
derived_key_zip = bytes(a ^ b for a, b in zip(actual_start, expected_zip))
print(f"If output should be ZIP, XOR key starts with: {derived_key_zip.hex()}")

# Check if derived keys match anything in header
print(f"\nLooking for key {derived_key.hex()} in header...")
pos = data.find(derived_key)
if pos != -1:
    print(f"  Found at offset {pos}!")
else:
    print("  Not found in header")

print(f"\nLooking for key {derived_key_zip.hex()} in header...")
pos = data.find(derived_key_zip)
if pos != -1:
    print(f"  Found at offset {pos}!")
else:
    print("  Not found in header")

# 12. What if the first 4 bytes at offset 64 ARE the XOR key pattern?
# Check if they repeat
print(f"\nFirst bytes at offset 64: {data[64:68].hex()}")
print(f"Bytes 64-68 vs 68-72: same={data[64:68] == data[68:72]}")

# Look for repeated patterns
for key_len in [4, 8, 16, 20, 32]:
    key = data[64:64+key_len]
    # Check if XOR with this produces valid magic at some offset
    for test_offset in [0, 64, 128, 256]:
        test_data = encrypted_data[test_offset:test_offset+64]
        decrypted_test = xor_decrypt(test_data, key)
        if decrypted_test[:4] in [expected_start, expected_zip, zstd_dict]:
            print(f"  Found valid magic at offset {test_offset} with key length {key_len}!")
