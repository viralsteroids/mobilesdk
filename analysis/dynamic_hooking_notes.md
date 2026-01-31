# Dynamic Hooking Stability Notes (Emulator)

## Observed instability
- SIGSEGV / protection faults when reading buffers or scanning memory ranges without validating mappings. Current hooks guard reads with Process.findRangeByAddress and range protection checks.
- Emulator ANRs/hangs when verbose hex dumps or global scans are enabled; keep console output low and cap dump sizes.
- AAsset/read/open hooks can destabilize the process (bad pointers or high I/O). Use only in short, targeted runs.

## Safe hook set (stable on emulator)
- libjnimultiengine.so bundle path: BUNDLE_PROCESSOR (0x00af296c), ENGINE_INIT (0x00af449c), BUNDLE_INIT (0x010f9624).
- ZSTD/ZLIB hooks are OK with MAX_DUMP_SIZE caps and readable-range checks.

## Risky hooks
- Asset hooks: AAssetManager_open / AAsset_read / AAsset_close (libandroid).
- libc open/openat/read hooks (high volume, arbitrary buffers).
- Global sebundle scan across rw- ranges (heavy, can stall emulator).

## App Control fallback (no frida.exe)
- If Windows Application Control blocks frida.exe, use Python with the frida module to spawn/attach and load the JS hook script.
- See DYNAMIC_ANALYSIS_GUIDE.md for a minimal python+frida helper snippet.

## Recommended toggles/sequence (tools/frida/frida_bundle_decrypt_hook.js)
1) Baseline: ENABLE_ASSET_HOOKS=false, ENABLE_OPEN_HOOKS=false, ENABLE_GLOBAL_SEBUNDLE_SCAN=false, VERBOSE_HEX=false, MIN_LOG_SIZE=1024, MAX_DUMP_SIZE=50MB, ENABLE_ZSTD_HOOKS=true, ENABLE_ZLIB_HOOKS=true, ENABLE_SEBUNDLE_SCAN=true.
2) Run once to capture bundle init/processor buffers; verify dumps first.
3) If stable, enable global scan briefly for a single run only.
4) If still missing inputs, enable AAsset hooks in a separate run; only then try open/openat/read with strict size caps.
5) If SIGSEGV/protection returns, revert to baseline, reduce dump sizes, or attach after app init.
