# Loader/Decoder Chain (task 3)

Purpose: map the native loader/decoder chain from embedded bundle entry points into the
libarchive/ZSTD cluster, including memory-buffer and file-path variants.

## Entry points (dynsym, SmartEngines_full)
- `se::doc::DocEngine::CreateFromEmbeddedBundle(bool)` @ `0x0086588c`
- `se::text::TextEngine::CreateFromEmbeddedBundle(bool)` @ `0x01046748`
- `se::text::TextEngineImpl::FromEmbeddedBundle(bool)` @ `0x0104e9c0`
- `se::text::TextEngineImpl::InitFromOwnedZipBuffer(...)` @ `0x01047838`

`IdEngine`/`CodeEngine` `CreateFromEmbeddedBundle` exports were **not** present in the
SmartEngines_full dynsym (they appeared in prior builds). JNI wrappers are exported:
`Java_*CreateFromEmbeddedBundle*` @ `0x007d4984`, `0x007d4d74`, `0x00836da8`, `0x008371a4`.

Verified via pyelftools from `SmartEngines_full/lib/arm64-v8a/libjnimultiengine.so`;
see `analysis/libjnimultiengine_decode_map.md` for symbol table + file offsets.

String anchors for Ghidra navigation (SmartEngines_full):
- `bundle_filename` @ `0x001f6399`
- `BUNDLE_PATH` @ `0x001fdfb3`
- `smartid.json` @ `0x0025d528`
- `Failed to get bundle mainfile name from archive` @ `0x002240bf`
See `analysis/libjnimultiengine_bundle_strings.md` for the full list.

String anchors in this build (from `strings -tx`):
`_ZN2se3doc9DocEngine24CreateFromEmbeddedBundleEb` `0x0004c2bd`,
`_ZN2se4text10TextEngine24CreateFromEmbeddedBundleEb` `0x000551e2`,
`_ZN2se4text14TextEngineImpl18FromEmbeddedBundleEb` `0x00065e95`,
`_ZN2se4text14TextEngineImpl22InitFromOwnedZipBuffer...` `0x0006637c`,
`_ZNK2se4text14TextEngineImpl21GetBundleMainFilename...` `0x000664ae`.

## Address remapping note (analyzed project)

In the analyzed `bundle_analysis` project, symbol addresses are rebased:
- `se::doc::DocEngine::CreateFromEmbeddedBundle(bool)` @ `0x00acdc3c`
- `se::text::TextEngine::CreateFromEmbeddedBundle(bool)` @ `0x0136b290`
- JNI SWIG wrappers @ `0x00a246c4/0x00a24ab4` (DocEngine) and `0x00a9f224/0x00a9f620` (TextEngine)

The decompiled bodies show DocEngine’s embedded-bundle path throws an error, while
TextEngine forwards to `TextEngineImpl::FromEmbeddedBundle` and returns a version string.
See `decompiled_code/bundle_analysis_symbol_*.c` and `analysis/bundle_analysis_symbol_search.txt`.

## Vtable rebasing hint (loader functions)

Data tables near `0x0068170c` contain **pairs** of u32 values. Interpreting the second
u32 in each pair as a **rebased pointer** (add `0x02300000`) resolves to loader
functions in the `0x02557xxx` range (e.g., `FUN_02557344`). This suggests a vtable-like
dispatch table with addresses stored as 32-bit offsets from a base.

See `analysis/decoder_chain_vtable_u32.txt` and `analysis/decoder_chain_vtable_funcs_rebased.txt`.

### BLR sites inside `TextEngineImpl::FromEmbeddedBundle`

The main `FromEmbeddedBundle` implementation (`FUN_0104d20c`) contains multiple `BLR` calls
with **no static flow**. These are likely vtable dispatches on an object at `x20+0x10`:

- `ldr x8, [x20,#0x10]` → `ldr x8, [x8,#0x50]` → `blr x8`
- `ldr x8, [x20,#0x10]` → `ldr x8, [x8,#0x48]` → `blr x8`

The BLR windows are captured in `analysis/from_embedded_call_no_flow_windows.txt`.
Direct call targets from this function show **no** direct calls into the loader chain
(`0x02558a08`, `0x02557a14`, `0x026eaa78`) — see `analysis/from_embedded_call_targets.txt`.

## Memory-buffer path (embedded bundle -> libarchive)

```
TextEngineImpl::InitFromOwnedZipBuffer @ 0x01047838
  -> FUN_02558a08 @ 0x02558a08
       -> FUN_02557a14 @ 0x02557a14
            -> archive_read_support_filter_zstd (PLT 0x02766a80)
       -> FUN_02557a90 @ 0x02557a90   (libarchive wrapper)
            -> archive_read_support_filter_zstd (0x02766a90)
            -> archive_read_support_format_zip_streamable (0x027670c0)
            -> archive_read_support_format_zip_seekable   (0x027670d0)
            -> archive_read_open_memory2 (0x02767080) @ callsite 0x02557c60
            -> archive_read_open_filenames (0x02767040) @ callsite 0x02557c10
            -> archive_read_data (0x02766aa0)
            -> archive_entry_pathname (0x02766ab0)
```

Callsite detail for `archive_read_open_memory2`:
```
0x02557c48: LDR  X8, [X19,#0x40]
0x02557c50: LDP  X2, X9, [X19,#0x48]
0x02557c54: MOV  X0, X20           ; archive handle
0x02557c58: ADD  X1, X8, X9        ; buffer pointer
0x02557c5c: MOV  X3, X2            ; read_size = size
0x02557c60: BL   0x02767080        ; archive_read_open_memory2
```
(From `analysis/open_memory2_callsite_02557c60_summary.md`.)

**Interpretation:** `X19` is a buffer descriptor (base/size/offset at `+0x40/+0x48/+0x50`).
This is the best static evidence for an embedded-bundle -> libarchive -> zip path.

Evidence: direct BL to `FUN_02558a08` from within `InitFromOwnedZipBuffer` and additional
callers in `analysis/decoder_chain_callers.md`. Dynsym mapping of those callsites suggests
they sit in other engine classes (destructors/serialize paths), so this path appears reused
across multiple engine types (see `analysis/decoder_chain_callers_dynsym.md`).

BLR notes (unresolved):
- `FUN_02557a90` contains 6 BLR sites using `X8` (likely vtable/callback dispatch).
- `FUN_026eaef0` contains 2 BLR sites using `X27` (likely callback dispatch).
See `analysis/blr_resolution_decoder_funcs.txt` and `analysis/blr_decoder_windows.txt` for context.

Vtable slot inference (from LDR chains):
- `FUN_02557a90` loads vtable from `[X20 + 0x8]`, then calls slots:
  - `vtable+0x0`, `vtable+0x8`, `vtable+0x30`, `vtable+0x40` (multiple sites).
- One site uses a secondary vtable-like pointer at `[X20 + 0x818]`, then calls slot `+0x30`.
- `FUN_026eaef0` calls function pointers from `[X21 + 0x6ac8]` (twice), with context at `[X21 + 0x6ad0]`.
See `analysis/blr_vtable_slots.md` for the exact LDR chain addresses.

## File-path variant (archive_read_open_filenames + __open_2)

```
FUN_026eaef0 @ 0x026eaef0
  -> archive_read_open_filenames (0x02767040)
  -> __open_2 (0x02767070) @ callsite 0x026eaf44
  -> __read_chk (0x02766bf0)
  -> fstat64 (0x02767050)
  -> lseek64 (0x02767060)
  -> close (0x02766bd0)
  -> ZSTD_decompressStream (0x027670b0)
```

This path uses file descriptors and is likely the on-disk/filename entry point (not the
embedded buffer path). The earlier mapping that treated 0x026eaf44 as
`archive_read_open_memory2` was corrected; that call is `__open_2`.

## ZSTD_decompressStream callsites (dynsym-mapped)
- `0x26ebf74` inside `archive_read_support_filter_zstd` (symbol @ `0x26ebadc`).
- `0x26f55b8` inside `archive_read_support_format_zip_seekable` (symbol @ `0x26f34b4`).
- `0x27108a4` inside `ZSTD_decompressStream_simpleArgs` (symbol @ `0x271085c`).

Decoded windows show the expected call signature:
`X0 = ZSTD_DStream*`, `X1 = outBuffer* (stack)`, `X2 = inBuffer* (stack)`.
See `analysis/zstd_decompress_stream_callsites.md` and `analysis/zstd_stream_callers_dynsym.md`.

## Supporting artifacts
- `analysis/function_direct_calls.md`
- `analysis/function_plt_targets_resolved.md`
- `analysis/plt_symbol_map_v2.txt`
- `analysis/open_memory2_callsite_02557c60_summary.md`
- `analysis/callsite_context_archive_wrapper.md`
- `analysis/loader_chain.md`
- `analysis/decoder_chain_offsets.md`
