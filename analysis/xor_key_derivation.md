# XOR key derivation / 12-byte constant (static)

## Summary
Static scanning of `SmartEngines_full/lib/arm64-v8a/libjnimultiengine.so` finds the 20-byte license hash embedded in `.rodata` and confirms the XOR-cluster constants match the 11-byte tail used in the offline XOR layer. The 12-byte constant used in key assembly is best explained as **0x10 + 11-byte constant tail**, where the `0x10` byte is carried in the bundle header (21-byte license hash field) and the remaining 11 bytes come from the XOR cluster's immediate-constant table.

## Evidence: license hash in .rodata
- **File**: `SmartEngines_full/lib/arm64-v8a/libjnimultiengine.so`
- **Location**: file offset `0x002db30f` (ELF VA `0x002db30f`), section `.rodata`
- **Bytes (20)**: `26 88 f0 26 b0 f3 4d ea 31 b3 77 bf e5 fd 1f 6e cf 2b 98 48`
- **Hex**: `2688f026b0f34dea31b377bfe5fd1f6ecf2b9848`
- **Context**: immediately follows ASCII string `se_client_id__se_demo` at `0x002db2f9`.

Annotated hexdump around the hash (file offsets):
```
002db2ef  3b 26 6f f9 cd 00 00 00 03 00 73 65 5f 63 6c 69  ;&o.......se_cli
002db2ff  65 6e 74 5f 69 64 5f 5f 73 65 5f 64 65 6d 6f 00  ent_id__se_demo.
002db30f  26 88 f0 26 b0 f3 4d ea 31 b3 77 bf e5 fd 1f 6e  &..&..M.1.w....n
002db31f  cf 2b 98 48 90 d2 2f 0b cc 1c a0 58 0d 34 88 41  .+.H../....X.4.A
```

**Xrefs**: no direct 8-byte pointer hits or ADRP+ADD references to `0x002db30f` (or `0x002db2f9`) were found in a quick scan. This suggests the value is either accessed via relative addressing in non-standard patterns, loaded through indirect tables, or copied into memory by a higher-level routine.

## Evidence: XOR cluster constants
- **XOR cluster**: `0x1309f00-0x130a3e4` (file offsets equal VA)
- **Immediate constants loaded** reconstruct a 40-byte table (little-endian):
  `d6 07 87 0d ed 14 05 e9 f8 a3 d9 02 8a 4c 81 f6 22 61 0c 38 44 ea a9 cf 60 4b 70 bc c6 7e fa 27 85 30 05 1d 39 d0 e5 99`
- **Key fact**: the **first 11 bytes** match the XOR tail used in offline decryption:
  `d6 07 87 0d ed 14 05 e9 f8 a3 d9`

## 12-byte constant assembly (hypothesis)
Observed bundle headers contain a **42-hex-character license field** (21 bytes). Example:
```
sebundle1~3.2.0~2688f026b0f34dea31b377bfe5fd1f6ecf2b984810~
```
That is a 20-byte SHA-1 hash (`...9848`) **plus a trailing byte `0x10`**.

This reconciles the two key-assembly variants:
- **Variant A (21+11)**: `key = license_hash_21 + const11`
- **Variant B (20+12)**: `key = license_hash_20 + (0x10 || const11)`

So the **12-byte constant** is best explained as:
```
const12 = 0x10 d6 07 87 0d ed 14 05 e9 f8 a3 d9
         ^^^^ from header license field
              ^^^^^^^^^^^^^^^^^^^^^ from XOR cluster constants
```

This matches the offline XOR implementation exactly and links the header's extra `0x10` byte to the constant tail used by the XOR cluster.

## Correlation to XOR cluster
- The XOR cluster provides the **11-byte tail** through its immediate-constant table.
- The bundle header provides the **leading 0x10** byte to extend the tail to 12 bytes when using a 20-byte SHA-1 license.
- The 20-byte license hash is embedded in `.rodata` (likely a default/known license ID), but the runtime key likely uses the bundle header value rather than the embedded copy.

## Next static steps
1. In Ghidra, define `0x002db2f9` as string and locate **data references** to `se_client_id__se_demo`; follow into nearby functions for license lookup or key assembly.
2. Disassemble and type the XOR cluster (`0x1309f00`) to track where the constant bytes are placed (stack vs. global buffer); look for key-buffer construction and XOR loop setup.
3. Search for **memcmp/sha1 compare** against the 20-byte hash value to identify license validation points.
4. Scan for callers passing a 32-byte key buffer into the XOR cluster (likely via indirect calls/BLR).
