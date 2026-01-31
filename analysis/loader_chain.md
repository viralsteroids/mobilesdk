# Loader/Decrypt Call Chain (SmartEngines)

## Java → JNI → Native

```
EngineLoader.load()
  → UtilsKt.readAssetsFile()  // reads .se bundle bytes
  → DocEngine.Create(byte[], boolean)
  → jnidocengineJNI.DocEngine_Create__SWIG_2
  → se::doc::DocEngine::Create @ 0x009655dc
     → memcpy bundle to internal buffer
     → FUN_00af296c (bundle processor / config loader)
```

## Native chain (confirmed)

```
FUN_00af296c (0x00af296c)
  → FUN_01a9d744 (parse config header "3.0.0")
  → FUN_022bb10c (build in‑memory file loader)
  → reads sdr.json / smartid.json
  → FUN_00af4268 (bundle path resolution)
  → FUN_00af449c (engine init wrapper)
      → FUN_010f9624 (bundle initialization)
```

## Observations

- `FUN_00af296c` parses a **config header**, constructs a file loader, and reads JSON metadata (`sdr.json`, `bundle_filename`, `smartid.json`).
- `FUN_00af449c` and `FUN_010f9624` are **configuration-heavy**; no explicit crypto/decompression in the decompiled bodies.
- Potential decrypt/decompress helpers are referenced in analysis but remain unlinked:
  - `FUN_00af7c1c` (possible cipher helper, unconfirmed)
  - `FUN_00afecc8` (data processing/decompression, unconfirmed)
- Dynsym + BL scans suggest an embedded-bundle path that reaches the libarchive/ZSTD cluster:
  - `TextEngineImpl::InitFromOwnedZipBuffer` @ `0x0126c380` has a BL target at `0x02558a08`.
  - Nearby functions `0x0255a61c` and `0x0255ae88` call `archive_read_support_filter_zstd` via PLT (see `analysis/function_bl_scan_archive_cluster.md`).
  - Direct call mapping shows `0x02558a08` calls into `0x02557a14`, which in turn calls `archive_read_support_filter_zstd` (`0x02766a80` PLT) and then into `0x02557a90`, the main libarchive wrapper (see `analysis/function_direct_calls.md`).

## Native decompress callsites (static scan)

```
FUN_026eaef0 (0x026eaef0)  // file open wrapper (libarchive path)
  → __open_2 @ 0x026eaf44 (callsite +0x54)
  → PLT calls include archive_read_open_filenames and __open_2 (see `analysis/function_plt_targets_resolved.md`)

Likely libarchive wrapper:
- FUN_02557a90 (start @ 0x02557a90) calls `archive_read_open_filenames`, `archive_read_data`, and `archive_entry_pathname` (see `analysis/plt_callsites_function_map.md`).
- No direct `archive_read_open_memory2` call from `FUN_026eaef0`; the earlier mapping was a PLT shift issue. The call at `0x026eaf44` resolves to `__open_2` (see `analysis/plt_symbol_map_v2.txt` and `analysis/open_memory2_callsite_summary.md`).
- The true `archive_read_open_memory2` callsite is `0x02557c60` inside `FUN_02557a90`; it passes `buffer`, `size`, and `read_size` (see `analysis/open_memory2_callsite_02557c60_summary.md`).
- The `0x80000` constant observed at `0x026eaf3c` is thus tied to `__open_2` path, not `archive_read_open_memory2`.
- The older callsite at `0x0095f658` is a false positive for `archive_read_open_memory2`; it actually calls `Image::GetImagePageName(const char*, int)` and is unrelated to bundle loading (see `analysis/open_memory2_callsite_0095f658_summary.md`).
- Callsite instruction context is in `analysis/callsite_context_archive_wrapper.md` and a trace checklist in `analysis/ghidra_trace_worksheet.md`.

FUN_0255ae88 (0x0255ae88)  // libarchive support init helper
  → archive_read_support_filter_zstd @ 0x0255aec4 (callsite +0x3c)

Unmapped cluster (likely libarchive init helpers near FUN_025576f0 / FUN_0255a61c):
  → archive_read_support_filter_zstd @
     0x025579c8, 0x025579ec, 0x02557a10, 0x02557a78,
     0x025592a0, 0x0255969c, 0x02559b04, 0x02559b88,
     0x0255a88c, 0x0255ace4, 0x0255b028

thunk_FUN_02763c50 (0x026f5538)  // thunk stub; mapping likely truncated
  → ZSTD_decompressStream @ 0x026f5538
```

## Gaps

- Actual decrypt/decompress routine not identified in this call chain.
- Static mapping to `ZSTD_*` / `archive_*` callsites remains inconclusive due to Ghidra memory-map mismatch (see `DECRYPTION_ANALYSIS_REPORT.md`).
- `ZSTD_decompressDCtx` callsites from `zstd_callsite_mapping.txt` still do not land inside any decompiled function ranges.

## References

- `DECRYPTION_FUNCTION_ANALYSIS.md`
- `decompiled_decrypt_functions.txt`
- `_fun_00af296c.txt`, `_fun_00af449c.txt`, `_fun_010f9624.txt`
- `tmp_zstd_callsites.py`
- `zstd_callsite_mapping.txt`
