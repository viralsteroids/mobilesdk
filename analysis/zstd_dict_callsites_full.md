# ZSTD dictionary API callsites (SmartEngines_full)

Target: C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so
.text: 0x6cf590 size=0x1cb1740

## Dynsym/PLT targets
- ZSTD_createDDict_advanced: not in dynsym/PLT
- ZSTD_createDDict: not in dynsym/PLT
- ZSTD_DCtx_refDDict: not in dynsym/PLT
- ZSTD_DCtx_loadDictionary: not in dynsym/PLT
- ZSTD_loadDictionary: not in dynsym/PLT
- ZSTD_freeDDict: not in dynsym/PLT

PLT0 size: 0x20 (plt_size=0x3e60, rel_count=996)

## BL callsites in .text
- ZSTD_createDDict_advanced: no address to scan
- ZSTD_createDDict: no address to scan
- ZSTD_DCtx_refDDict: no address to scan
- ZSTD_DCtx_loadDictionary: no address to scan
- ZSTD_loadDictionary: no address to scan
- ZSTD_freeDDict: no address to scan

## Fallback: string/PLT checks
- No ZSTD dictionary symbol strings found in binary
- No ZSTD*Dict PLT entries