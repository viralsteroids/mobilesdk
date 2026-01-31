# Decoder chain update (SmartEngines_full lib)

## Scope
- Binary: `SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so` (AArch64).
- Static sources: `analysis/function_direct_calls.md`, `analysis/function_plt_targets_resolved.md`, `analysis/plt_callsites_function_map.md`, `analysis/open_memory2_callsite_02557c60_summary.md`, `analysis/decoder_chain_offsets.md`, `zstd_callsite_mapping.txt`.

## Bundle loader > decoder chain (confirmed + inferred)

```
EngineLoader.load()
  > UtilsKt.readAssetsFile()
  > DocEngine.Create(...) > jnidocengineJNI.DocEngine_Create__SWIG_2
  > se::doc::DocEngine::Create @ 0x009655dc
     > FUN_00af296c
        > FUN_00af449c
           > FUN_010f9624
              > (indirect/virtual dispatch, unresolved)
                 > CreateFromEmbeddedBundle:
                    - se::doc::DocEngine::CreateFromEmbeddedBundle @ 0x009cdc3c
                    - se::id::IdEngine::CreateFromEmbeddedBundle @ 0x0117aaa0
                    - se::code::CodeEngine::CreateFromEmbeddedBundle @ 0x011e0678
                    - se::text::TextEngine::CreateFromEmbeddedBundle @ 0x0126b290
                 > se::text::TextEngineImpl::FromEmbeddedBundle @ 0x01275ebc
                 > se::text::TextEngineImpl::InitFromOwnedZipBuffer @ 0x0126c380
                    > FUN_02558a08 @ 0x02558a08
                       > FUN_02557a14 @ 0x02557a14
                          > archive_read_support_filter_zstd @ PLT 0x02766a80
                       > FUN_02557a90 @ 0x02557a90  (libarchive wrapper)
                          > archive_read_open_memory2 @ PLT 0x02767080 (callsite 0x02557c60)
                          > archive_read_open_filenames @ PLT 0x02767040 (callsite 0x02557c10)
                          > archive_read_data @ PLT 0x02766aa0
                          > archive_entry_pathname @ PLT 0x02766ab0
```

Notes:
- The direct BL from `InitFromOwnedZipBuffer` to `FUN_02558a08` is at `0x0126c3ec`.
- `FUN_00af449c` and `FUN_010f9624` contain many BLR sites; no direct BL to the decoder cluster is visible in static scans.

## File-path variant (libarchive + ZSTD stream path)

```
FUN_026eaef0 @ 0x026eaef0
  > archive_read_open_filenames @ PLT 0x02767040 (multiple callsites in 0x026eaf94+ region)
  > __open_2 @ PLT 0x02767070 (callsite 0x026eaf44)
  > ZSTD_decompressStream @ PLT 0x027670b0 (callsite 0x026f5538)
  > ZSTD_freeDCtx @ PLT 0x02767160
```

## PLT stubs (libarchive/ZSTD)
- `archive_read_open_filenames` > PLT `0x02767040` (GOT `0x027dae28`)
- `archive_read_open_memory2` > PLT `0x02767080` (GOT `0x027dae48`)
- `ZSTD_decompressStream` > PLT `0x027670b0` (GOT `0x027dae60`)
- `ZSTD_decompressContinue` > PLT `0x02767190` (GOT `0x027daed0`, no static callsites observed)

## Callsite inventory (static)

### `archive_read_open_memory2`
- `0x02557c60` (inside `FUN_02557a90`).

### `archive_read_open_filenames`
```
0x02557c10 0x026e8324 0x026e85d0 0x026e8790 0x026e8b44 0x026e8d94 0x026e9068 0x026e9528 0x026e96b4 0x026e99c4
0x026e9b14 0x026e9c34 0x026e9cc8 0x026e9d30 0x026e9e20 0x026ea0b4 0x026ea1dc 0x026ea354 0x026ea51c 0x026ea8f4
0x026eac18 0x026eaed0 0x026eaf94 0x026eb050 0x026eb074 0x026eb14c 0x026eb1c8 0x026eb1fc 0x026eb2e8 0x026eb31c
0x026eb4b0 0x026eb4e4 0x026eb778 0x026eb7b4 0x026eb958 0x026eb9d0 0x026ebb94 0x026ebe04 0x026ebfe0 0x026ec00c
0x026ec148 0x026ec21c 0x026ed30c 0x026ed62c 0x026ed8a4 0x026ed940 0x026ed970 0x026edb64 0x026edc2c 0x026edd0c
0x026edda0 0x026ede14 0x026edf48 0x026edfe0 0x026ee370 0x026ee4a0 0x026ee5c8 0x026ee644 0x026ee6b8 0x026ee980
0x026ee9ac 0x026ee9d4 0x026ee9f0 0x026eea1c 0x026eeb00 0x026eecc0 0x026eed98 0x026eede0 0x026eefdc 0x026ef9a8
0x026ef9fc 0x026efb0c 0x026efb2c 0x026efda8 0x026efdc8 0x026efe28 0x026eff4c 0x026f0088 0x026f00b8 0x026f0100
0x026f01f8 0x026f0418 0x026f097c 0x026f0b80 0x026f0c80 0x026f0cc4 0x026f1078 0x026f141c 0x026f1678 0x026f1b44
0x026f1b68 0x026f1cd8 0x026f1d84 0x026f1edc 0x026f2174 0x026f22fc 0x026f2324 0x026f25f8 0x026f26a8 0x026f26d0
```

### `ZSTD_decompressStream`
- `0x026f5538` (thunk stub; PLT target `0x027670b0`).

### `ZSTD_decompressDCtx` (unmapped)
```
0x984bf4 0x11f834c 0x11f9f84 0x11fa170 0x11fa2d8 0x11fae2c 0x11faff4 0x11fb744 0x11fd698
0x11fe5b4 0x12006e8 0x12008c0 0x12012e4 0x12045b4 0x12046f0 0x120474c 0x1204788 0x12047bc
```

## Offsets (vaddr > file)
```
TextEngineImpl::InitFromOwnedZipBuffer @ 0x0126c380 > file+0x126c380
FUN_02558a08 @ 0x02558a08 > file+0x2558a08
FUN_02557a14 @ 0x02557a14 > file+0x2557a14
FUN_02557a90 @ 0x02557a90 > file+0x2557a90
FUN_026eaef0 @ 0x026eaef0 > file+0x26eaef0
```

## Gaps / unresolved
- No static BL path from `FUN_00af449c` / `FUN_010f9624` into the embedded-bundle decoder cluster; likely reached via BLR/vtable dispatch in engine-specific init.
- `ZSTD_decompressDCtx` callsites are not mapped into named functions or connected to the bundle path.
- Many `archive_read_open_filenames` callsites sit inside the `0x026e8xxx–0x026f26xx` libarchive cluster; their callers are not yet linked to the bundle loader chain.

## Symbolized build cross-check (SmartEngines_apktool)
- A PLT-based BL scan of the symbolized `SmartEngines_apktool` build confirms the same archive/ZSTD cluster and callsites at `0x02557c60` (archive_read_open_memory2) and `0x02557bb4/0x02557c18` (archive_read_support_filter_zstd). See `analysis/apktool_plt_callsites_zstd_archive.md`.
- ZSTD dictionary usage is visible: `ZSTD_createDDict_advanced` and `ZSTD_DCtx_refDDict` are called (multiple callsites), implying a dictionary is constructed and referenced during decompression in that build.
