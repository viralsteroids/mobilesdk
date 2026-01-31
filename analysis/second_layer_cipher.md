# Second Layer Cipher Analysis (Task G3)

## Executive Summary

After comprehensive analysis of the SmartEngines bundle decryption pipeline, the evidence strongly suggests there is **no traditional second cipher layer** between the XOR decryption and ZSTD/ZIP decompression. Instead, the data flow appears to be:

```
Encrypted .se bundle
    |
    v
XOR Layer (32-byte key = license_hash_21 + tail_11)
    |
    v
Decrypted buffer (still high-entropy because it's compressed)
    |
    v
libarchive (ZIP container with ZSTD filter)
    |
    v
Decompressed payload (model data)
```

The post-XOR data remains high-entropy (~7.99/8.0) because **it is compressed (ZSTD-compressed ZIP archive)**, not because there is additional encryption.

---

## Analysis Evidence

### 1. Post-XOR Magic Scan Results

Source: `analysis/postxor_layer2_probe.md`, `analysis/postxor_magic_scan_summary.md`

Tested decompression at apparent magic byte offsets in post-XOR data:
- **ZLIB offsets**: All failed with "incorrect header check"
- **GZIP offsets**: All failed with "incorrect header check"
- **BZIP2 offsets**: All failed with "Invalid data stream"
- **LZ4 frame magic**: Not found
- **ZSTD frame magic (0x28B52FFD)**: Not found directly in post-XOR data

**Interpretation**: Magic byte hits in high-entropy data are statistical false positives, not real compression headers.

### 2. Crypto Constant Scan

Source: `analysis/crypto_constants_scan.md`

Scanned `libjnimultiengine.so` for standard cipher constants:
- **AES S-box**: Not found
- **AES inverse S-box**: Not found
- **SHA-256 K constants**: Not found (SHA-1 K constants are present for header validation)
- **ChaCha/Salsa constants**: Not found
- **BLAKE2s IV**: Not found

**Interpretation**: No evidence of a standard block cipher or stream cipher implementation between XOR and decompression.

### 3. High-XOR Function Analysis

Source: `DECRYPTION_FUNCTION_ANALYSIS.md`, decompiled_code/xor_*.c

Candidate functions with high XOR instruction counts:

| Address | Function | XOR count | Analysis |
|---------|----------|-----------|----------|
| 0x027dc8e0 | FUN_027dc8e0 | High | **sebundle parser - implements XOR layer 1** |
| 0x014099e0 | FUN_014099e0 | 49 | **MD5 hash** (T-table constants 0xD76AA478, 0xE8C7B756) |
| 0x02801674 | FUN_02801674 | 46 | **CRC32** (table-based with ~param_1 inversion) |
| 0x00c9448c | FUN_00c9448c | 36 | **Hash function** (xxHash-style mixing with 0x9E3779B97F4A7C15) |
| 0x027de380 | FUN_027de380 | 83 | Byte shuffle / endianness conversion |
| 0x0130958c | FUN_0130958c | Large | Data processing, not crypto (called via indirection) |

**Key finding**: All high-XOR functions are either:
1. The known XOR layer (FUN_027dc8e0)
2. Hash functions (MD5, CRC32, xxHash)
3. Data manipulation utilities

No second cipher layer implementation was found.

### 4. Decoder Chain Evidence

Source: `analysis/decoder_chain.md`, `analysis/loader_chain.md`

Static call chain analysis:
```
TextEngineImpl::InitFromOwnedZipBuffer @ 0x01047838
    -> FUN_02558a08 @ 0x02558a08
        -> FUN_02557a14 @ 0x02557a14
            -> archive_read_support_filter_zstd (PLT)
        -> FUN_02557a90 @ 0x02557a90 (libarchive wrapper)
            -> archive_read_open_memory2 @ 0x02557c60
            -> archive_read_support_format_zip_streamable
            -> archive_read_support_format_zip_seekable
            -> archive_read_data
            -> archive_entry_pathname
```

The `archive_read_open_memory2` call at `0x02557c60` directly receives the decrypted buffer:
- `X0` = archive handle
- `X1` = buffer pointer (from `X19+0x40` + `X19+0x50`)
- `X2` = buffer size (`X19+0x48`)
- `X3` = read_size (equals X2)

**Interpretation**: The decrypted buffer (post-XOR) is passed directly to libarchive without any intermediate cipher transformation.

### 5. sebundle Parser (FUN_027dc8e0) Analysis

Source: `decompiled_code/bundle_analysis_symbol_027dc8e0.c`

The sebundle parser implements:
1. **Header parsing**: Validates "sebundle" magic, parses version, extracts license hash
2. **SHA-1 validation**: Verifies header integrity using FUN_027db64c
3. **Mini-header XOR**: Decrypts first `dec_len` bytes using key table
4. **License validation**: Checks for "se_demo" string
5. **Payload XOR**: XORs remaining bytes using 128-byte key table (DAT_004909cf)

The XOR loop applies directly to the payload with a **128-byte cyclic key** (key index wraps at `& 0x7f`):
```c
uVar31 = uVar22 & 0x7f;  // key index mod 128
*pbVar21 = *(byte *)((long)puVar1 + uVar31) ^ *pbVar21;
```

After XOR, the output is passed to the archive subsystem. **No second cipher is invoked**.

### 6. ZSTD Dictionary Usage

Source: `analysis/zstd_dict_callsites_full.md`, `analysis/compression_crypto.md`

ZSTD dictionary APIs are present in the symbolized build (SmartEngines_apktool):
- `ZSTD_createDDict_advanced` callsites
- `ZSTD_DCtx_refDDict` callsites

No ZSTD dictionary magic (0x37A430EC) was found in the binary, suggesting the dictionary is either:
- Embedded in the bundle payload
- Constructed at runtime from bundle data

This explains why direct ZSTD decompression of post-XOR data fails - a **dictionary is required**.

---

## Conclusion: No Second Cipher Layer

The evidence indicates the decryption pipeline is:

1. **XOR Layer** (FUN_027dc8e0): 32-byte repeating key applied to entire payload
2. **libarchive decompression**: ZSTD-filtered ZIP archive processing

The post-XOR data is not further encrypted. It is a **ZSTD-compressed ZIP archive** that:
- Requires a dictionary for ZSTD decompression
- Has no recognizable magic bytes because ZSTD compression scrambles the ZIP headers
- Maintains high entropy because compression (not encryption) produces near-random byte distribution

---

## Functions to Exclude (Per Task)

As specified in the task:
- **FUN_014099e0** (0x014099e0): MD5 implementation - NOT a cipher
- **FUN_0130958c** (0x0130958c): XOR layer 1 cluster - already known

---

## Candidate Functions for Further Investigation

While no second cipher was found, these functions warrant investigation for understanding the full decompression pipeline:

| Address | Function | Role |
|---------|----------|------|
| 0x02557a90 | FUN_02557a90 | libarchive wrapper - handles archive_read_open_memory2 |
| 0x026eaef0 | FUN_026eaef0 | File-path archive opener (alternative to memory buffer) |
| 0x02558a08 | FUN_02558a08 | Entry point from InitFromOwnedZipBuffer |

---

## Data Flow Summary

```
.se bundle file
    |
    +-- Text header (59 bytes): sebundle1~version~license_hash~
    |
    +-- Binary header (36 bytes, XORed)
    |
    +-- Encrypted payload (XORed)
            |
            v
    [XOR with 32-byte key]
            |
            v
    ZSTD-compressed ZIP archive
            |
            v
    [libarchive: ZSTD filter + ZIP format]
            |
            v
    Decompressed model files
```

---

## Next Steps

To complete bundle extraction:

1. **Capture ZSTD dictionary** via Frida hook on `ZSTD_createDDict_advanced`
2. **Dump post-XOR buffer** at `archive_read_open_memory2` callsite
3. **Extract with dictionary**: Use captured dictionary for ZSTD decompression
4. **Parse ZIP**: Process the decompressed ZIP container

---

## References

- `C:\temp\MobileSDK\DECRYPTION_FUNCTION_ANALYSIS.md`
- `C:\temp\MobileSDK\analysis\decoder_chain.md`
- `C:\temp\MobileSDK\analysis\postxor_layer2_probe.md`
- `C:\temp\MobileSDK\analysis\crypto_constants_scan.md`
- `C:\temp\MobileSDK\decompiled_code\bundle_analysis_symbol_027dc8e0.c`
- `C:\temp\MobileSDK\analysis\open_memory2_callsite_02557c60_summary.md`
- `C:\temp\MobileSDK\analysis\apktool_plt_callsites_zstd_archive.md`
