# InitFromOwnedZipBuffer Call Chain Trace

## Target Function

```
se::text::TextEngineImpl::InitFromOwnedZipBuffer
Address: 0x0126c380
Size: 0x340
Mangled: _ZN2se4text14TextEngineImpl22InitFromOwnedZipBufferENS_4arch17UniqueBytesBufferEmbi
```

## Executive Summary

`InitFromOwnedZipBuffer` is **NOT called directly via BL** from any function in the binary.
It is invoked through **virtual method dispatch** (vtable) or indirection. The function
itself calls into the BundleLoader subsystem which ultimately interfaces with libarchive
for ZSTD-compressed ZIP extraction.

---

## Call Graph Analysis

### 1. Entry Points (JNI Layer)

```
Java_com_smartengines_text_jnitextengineJNI_TextEngine_1CreateFromEmbeddedBundle_1_1SWIG_10 @ 0x0099f224
Java_com_smartengines_text_jnitextengineJNI_TextEngine_1CreateFromEmbeddedBundle_1_1SWIG_11 @ 0x0099f620
```

These JNI wrappers use **indirect calls** via JNIEnv function pointers. They eventually
call `se::text::TextEngine::CreateFromEmbeddedBundle(bool)`.

### 2. Native CreateFromEmbeddedBundle Path

```
se::text::TextEngine::CreateFromEmbeddedBundle @ 0x0126b290
    -> PLT stub (indirect dispatch)
    -> TextEngineImpl::FromEmbeddedBundle @ 0x01275ebc
        -> Version/capability checks
        -> (Vtable dispatch to Init methods)
```

### 3. InitFromOwnedZipBuffer Callers (Indirect)

No direct BL callers found. The function is invoked via vtable when:
- The engine detects a ZIP-format bundle
- The buffer contains a ZSTD-compressed archive

### 4. Functions that Call BundleLoader (0x02558a08)

These are the functional equivalents across engine types:

| Address | Likely Engine Type | Calls BundleLoader At |
|---------|-------------------|----------------------|
| 0x00b86c24 | DocEngine | 0x00b86ca8 |
| 0x0118ff14 | IdEngine | 0x01190020 |
| 0x011e66d0 | CodeEngine | 0x011e6750 |
| 0x0126c380 | TextEngine (InitFromOwnedZipBuffer) | 0x0126c3ec |

---

## Buffer Transformation Chain

### Complete Flow: .se File to Decompressed Content

```
1. Java Layer
   UtilsKt.readAssetsFile(context, "bundle_*.se")
      -> AssetManager.open() -> InputStream -> byte[]

2. JNI Bridge
   Engine.createEngine(byte[])
      -> JNI GetByteArrayElements
      -> Native buffer pointer

3. InitFromOwnedZipBuffer (0x0126c380)
   Input: UniqueBytesBuffer (owned memory), size, flags
      -> BundleLoader @ 0x02558a08

4. BundleLoader (0x02558a08)
   Function Range: 0x02558a08 - 0x02558c78

   Key Calls:
   - 0x02558a94: BL 0x009ae364 (validation/setup)
   - 0x02558ac4: BL 0x02558ba8 (helper function)
   - 0x02558ad8: BL 0x02557a8c (Archive Wrapper)

5. Archive Wrapper (0x02557a8c)
   Sets up libarchive for ZSTD+ZIP extraction:

   - 0x02557bb4: BL archive_read_support_filter_zstd
   - 0x02557bbc: BL archive_read_support_format_zip_streamable
   - 0x02557c18: BL archive_read_support_filter_zstd
   - 0x02557c20: BL archive_read_support_format_zip_streamable
   - 0x02557c2c: BL archive_read_support_format_zip_seekable
   - 0x02557c60: BL archive_read_open_memory2  <-- BUFFER PASSED HERE

6. archive_read_open_memory2 Callsite (0x02557c60)
   Argument setup:

   0x02557c48: LDR  X8, [X19,#0x40]    ; base pointer
   0x02557c50: LDP  X2, X9, [X19,#0x48] ; size, offset
   0x02557c54: MOV  X0, X20            ; archive handle
   0x02557c58: ADD  X1, X8, X9         ; buffer = base + offset
   0x02557c5c: MOV  X3, X2             ; read_size = size
   0x02557c60: BL   0x02767080         ; archive_read_open_memory2

   X19 = Buffer descriptor structure:
     +0x40: Base pointer
     +0x48: Size
     +0x50: Current offset
```

---

## Intermediate Functions

### BundleLoader (0x02558a08)

```c
// Pseudocode reconstruction
void BundleLoader(void* context, UniqueBytesBuffer* buffer, size_t size, int flags) {
    // Setup and validation
    FUN_02765c40(...);      // Memory/context setup
    FUN_02763d00(...);      // String/error handling

    // Validate bundle header
    FUN_009ae364(...);      // Header validation

    // Initialize archive reading
    FUN_02558ba8(...);      // Helper setup
    FUN_02557a8c(...);      // Main archive wrapper

    // Process archive contents
    // ... additional processing ...
}
```

### Archive Wrapper (0x02557a8c)

```c
// Pseudocode reconstruction
int ArchiveWrapper(void* context, void* buffer, size_t size) {
    archive* ar;

    // Initialize archive
    ar = archive_new();
    archive_read_support_filter_zstd(ar);
    archive_read_support_format_zip_streamable(ar);
    archive_read_support_format_zip_seekable(ar);

    // Open from memory buffer
    archive_read_open_memory2(ar, buffer, size, size);

    // Read and process entries
    while (archive_read_next_header(ar, &entry) == ARCHIVE_OK) {
        // Process each file in the archive
        FUN_02700250(...);  // Entry processing
    }

    return status;
}
```

---

## Key Addresses Summary

| Component | Address | Description |
|-----------|---------|-------------|
| InitFromOwnedZipBuffer | 0x0126c380 | Main entry point |
| BundleLoader | 0x02558a08 | Core bundle processing |
| Archive Wrapper | 0x02557a8c | libarchive interface |
| archive_read_open_memory2 | 0x02767080 (PLT) | External library call |
| archive_read_support_filter_zstd | 0x02766a90 (PLT) | ZSTD decompression filter |
| Buffer Descriptor Access | X19+0x40/0x48/0x50 | Base/Size/Offset fields |

---

## Buffer Source Analysis

### X0 (Buffer Pointer) Argument to InitFromOwnedZipBuffer

The buffer passed to `InitFromOwnedZipBuffer` originates from:

1. **Java/Kotlin Code**: `UtilsKt.readAssetsFile()` reads the entire `.se` bundle
2. **JNI Layer**: `GetByteArrayElements` provides native pointer to Java byte[]
3. **Ownership**: `UniqueBytesBuffer` takes ownership of the allocated memory
4. **No Pre-Decryption**: The buffer is passed directly to archive processing

### Bundle Format

The `.se` files are ZSTD-compressed ZIP archives containing:
- `smartid.json` or `sdr.json` (configuration)
- Model data files
- Internal bundle structure

The ZSTD compression is handled by libarchive's filter chain, not by custom
decryption code in the SDK.

---

## Cross-Engine Equivalents

Similar initialization paths exist for other engine types:

| Engine | Init Function Start | BundleLoader Call Site |
|--------|--------------------|-----------------------|
| TextEngine | 0x0126c380 | 0x0126c3ec |
| DocEngine | 0x00b86c24 | 0x00b86ca8 |
| IdEngine | 0x0118ff14 | 0x01190020 |
| CodeEngine | 0x011e66d0 | 0x011e6750 |

All paths converge on the same BundleLoader (0x02558a08) and Archive Wrapper (0x02557a8c).

---

## Decryption Analysis

### XOR Instruction Scan

Analysis found **33 XOR (EOR) instructions** in the bundle loading area (0x02555000-0x02560000):

| Function | XOR Count | Description |
|----------|-----------|-------------|
| 0x02557a8c | 6 | Archive Wrapper (main) |
| 0x025587d8 | 2 | Secondary helper |
| 0x02559f34 | 6 | Support function |
| 0x0255a8ac | 2 | Support function |
| 0x0255b688 | 16 | **Heavy XOR usage** - likely crypto/hash |
| 0x0255dcac | 1 | Misc function |

### Function 0x0255b688 (Crypto/Hash Pattern)

This function contains a distinctive XOR pattern at 0x0255b758-0x0255b774:

```asm
0x0255b758: EOR X8, X8, X9    ; XOR swap pattern
0x0255b760: EOR X9, X9, X8    ; Classic 3-XOR swap
0x0255b764: EOR X8, X9, X8    ; No temp register needed
0x0255b774: EOR X8, X8, X8    ; Zero register
```

This function calls:
- 0x02767240 (external library)
- 0x02751d70 (internal processing)
- 0x0275a024 (data transform)

### Archive Wrapper XOR Usage

The Archive Wrapper (0x02557a8c) contains 6 XOR operations used for:
- Checksum/CRC calculations during archive validation
- NOT for pre-decryption of the bundle data

### Key Finding

**The XOR operations in the bundle loading chain appear to be for:**
1. CRC/checksum validation (archive format)
2. Hash calculations (integrity checks)
3. Internal state management (swap patterns)

**NOT for:**
- Pre-decryption of the .se bundle content
- XOR-based cipher operations on raw data

The ZSTD decompression via libarchive filter chain handles the compression layer directly.

---

## Visual Call Graph

```
                          Java/Kotlin Layer
                               |
                   UtilsKt.readAssetsFile("bundle_*.se")
                               |
                               v
                   Engine.createEngine(byte[])
                               |
        +----------------------+----------------------+
        |                      |                      |
        v                      v                      v
   TextEngine            DocEngine              IdEngine
   (SWIG_10/11)         (SWIG_10/11)          (SWIG_10/11)
        |                      |                      |
        v                      v                      v
[CreateFromEmbeddedBundle] [CreateFromEmbeddedBundle] [CreateFromEmbeddedBundle]
   0x0126b290              0x009cdc3c              0x0117aaa0
        |                      |                      |
        v                      v                      v
 [FromEmbeddedBundle]          |                      |
   0x01275ebc                  |                      |
        |                      |                      |
        v                      v                      v
        +----------------------+----------------------+
                               |
                    [Vtable Dispatch]
                               |
        +----------------------+----------------------+
        |                      |                      |
        v                      v                      v
[InitFromOwnedZipBuffer] [DocEngine Init]    [IdEngine Init]
   0x0126c380              0x00b86c24           0x0118ff14
        |                      |                      |
        v                      v                      v
        +----------------------+----------------------+
                               |
                       [BundleLoader]
                        0x02558a08
                               |
              +----------------+----------------+
              |                |                |
              v                v                v
      [Header Validation] [Helper Setup]  [Archive Wrapper]
        0x009ae364         0x02558ba8      0x02557a8c
                                                |
                           +--------------------+--------------------+
                           |                    |                    |
                           v                    v                    v
                  archive_read_      archive_read_support_  archive_read_support_
                  support_filter_    format_zip_           format_zip_
                  zstd (PLT)         streamable (PLT)      seekable (PLT)
                   0x02766a90         0x027670c0            0x027670d0
                                                |
                                                v
                                   +------------------------+
                                   |                        |
                                   v                        v
                         [Memory Buffer Path]      [File Path]
                        archive_read_open_memory2  archive_read_open_filenames
                           0x02767080 (PLT)          0x02767040 (PLT)
                                   |
                                   v
                        +----------+----------+
                        |                     |
                        v                     v
                   [Buffer Desc]        [ZSTD Decompress]
                  X19+0x40 (base)       ZSTD_decompressStream
                  X19+0x48 (size)          0x027670b0
                  X19+0x50 (offset)            |
                                               v
                                     [Extracted Bundle Data]
                                     (JSON configs, models)
```

---

## Related Files

- `C:\temp\MobileSDK\analysis\decoder_chain.md` - Overall decoder architecture
- `C:\temp\MobileSDK\analysis\loader_chain.md` - Loader call chain
- `C:\temp\MobileSDK\analysis\open_memory2_callsite_02557c60_summary.md` - Buffer passing
- `C:\temp\MobileSDK\SmartEngines_apktool\lib\arm64-v8a\libjnimultiengine.so` - Binary analyzed

---

## Methodology Notes

1. Direct BL scan found 0 callers of InitFromOwnedZipBuffer
2. Vtable analysis showed function pointers are set via relocations
3. Cross-reference through BundleLoader identified the call chain
4. PLT/GOT analysis confirmed libarchive symbol bindings
