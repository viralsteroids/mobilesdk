# SmartEngines .se Bundle Format - Complete Analysis

## Overview

The `.se` bundle files used by SmartEngines SDK contain encrypted and compressed data with machine learning models, configuration files, and other resources.

## File Structure

```
+------------------+
|     HEADER       |  (Variable length, ~59-65 bytes)
+------------------+
|  SHA1 CHECKSUM   |  (20 bytes, XOR encrypted)
+------------------+
|   MINI SECTION   |  (dec_len bytes, XOR encrypted)
+------------------+
|      BODY        |  (Rest of file, XOR encrypted)
+------------------+
```

## Header Format

```
sebundle1~{version}~{license_hash}{dec_len}~
```

Example:
```
sebundle1~2.7.2~2688f026b0f34dea31b377bfe5fd1f6ecf2b98481010~
```

Fields:
- **Magic**: `sebundle1~` (10 bytes)
- **Version**: Engine version (e.g., `2.7.2`, `3.2.0`, `2.6.4`)
- **License Hash**: 40 hex characters (20-byte SHA1 of license)
- **dec_len**: Decimal number indicating mini section length (e.g., `10`)

### Finding Delimiters

The header uses `~` (0x7e) as delimiter:
- After `sebundle`, before format version
- After format version, before engine version
- After engine version, before license hash + dec_len
- After dec_len (end of header)

Total header ends after the 3rd `~` character.

## Encryption

### XOR Key

- **Location**: File offset `0x3737888` in `libjnimultiengine.so`
- **Size**: 128 bytes (0x80)
- **Key bytes** (first 32):
  ```
  90 d2 2f 0b cc 1c a0 58 0d 34 88 41 74 6b b2 cb
  93 eb 36 9d 47 88 81 9e 48 3d 7f 1e 76 52 79 e8
  ```

### Decryption Algorithm

1. **Header checksum verification** (first 20 bytes of payload):
   ```python
   header_sha1 = SHA1(header_bytes)
   decrypted_checksum = payload[0:20] XOR key[0:20]
   assert decrypted_checksum == header_sha1
   ```

2. **Mini section decryption** (next `dec_len` bytes):
   ```python
   mini = payload[20:20+dec_len] XOR key[20:20+dec_len]
   # Example result: "1~se_demo~"
   ```

3. **Body decryption** (rest of payload):
   ```python
   body_start = 20 + dec_len
   for i, byte in enumerate(payload[body_start:]):
       key_index = (body_start + i) & 0x7F  # Cyclic, 128 bytes
       decrypted_body[i] = byte XOR key[key_index]
   ```

## Compression

After XOR decryption, the body is ZSTD-compressed:
- **ZSTD frame magic**: `28 B5 2F FD` at offset 0 of decrypted body
- **No dictionary required** for basic decompression
- Standard ZSTD decompression produces a TAR archive

## Archive Contents

The decompressed data is a TAR archive containing:

### Directory Structure
```
bundle_name/
├── bundle_name.json          # Main manifest
├── netdata/                  # Neural network models
│   └── final/
│       └── synthetic/
│           ├── blines/       # Baseline detection
│           ├── rus/          # Russian text recognition
│           └── ...
├── docs/                     # Document configurations
│   ├── barcode/
│   ├── card/
│   └── ...
├── deskewer/                 # Deskewing configs
├── vocs/                     # Vocabularies and n-grams
└── ...
```

### File Types
- **JSON configs**: Document type definitions, postprocessors, field selectors
- **TAR.ZST models**: Neural network weights (nested ZSTD-compressed TARs)
- **NGR files**: N-gram frequency tables for OCR

## Complete Decryption Code

```python
import hashlib
import zstandard as zstd
import tarfile
import io

def decrypt_sebundle(data, key_table):
    # Parse header
    header_end = data.index(b'~', data.index(b'~', data.index(b'~') + 1) + 1) + 1

    # Extract dec_len from header
    header = data[:header_end].decode('ascii')
    parts = header.split('~')
    token = parts[2]
    dec_len = int(token[40:])  # After 40 hex chars

    payload = data[header_end:]

    # Verify header SHA1
    sha1 = hashlib.sha1(data[:header_end]).digest()
    header_xor = bytes(payload[i] ^ key_table[i] for i in range(20))
    assert header_xor == sha1, "Header checksum mismatch"

    # Decrypt mini section
    mini = bytes(payload[20 + i] ^ key_table[20 + i] for i in range(dec_len))

    # Decrypt body
    body_start = 20 + dec_len
    body = bytearray()
    for i, b in enumerate(payload[body_start:]):
        key_idx = (body_start + i) & 0x7F
        body.append(b ^ key_table[key_idx])

    return mini, bytes(body)

def decompress_body(body):
    dctx = zstd.ZstdDecompressor()
    return dctx.decompress(body)

def extract_tar(tar_data, output_dir):
    with tarfile.open(fileobj=io.BytesIO(tar_data)) as tar:
        tar.extractall(output_dir)
```

## Key Locations Summary

| Component | Location | Size |
|-----------|----------|------|
| XOR Key Table | `libjnimultiengine.so` @ offset 0x3737888 | 128 bytes |
| Bundle Files | `assets/*.se` | Variable |

## Security Notes

- The XOR key is static and embedded in the shared library
- SHA1 checksum provides integrity verification only
- No ZSTD dictionary is needed for decompression
- Mini section appears to contain demo/license identifier

## Tested Bundle Versions

| Bundle | Version | Size | Status |
|--------|---------|------|--------|
| bundle_codeengine_full.se | 2.7.2 | 5.85 MB | ✓ Decrypted |
| bundle_international_faces_liveness.se | 2.7.2 | 119 MB | ✓ Decrypted |
| bundle_newdocengine_demo_hiring_dsn.se | 3.2.0 | 57 MB | ✓ Decrypted |
| bundle_textengine.se | 2.6.4 | 27 MB | ✓ Decrypted |

---
*Analysis completed: 2026-01-31*
