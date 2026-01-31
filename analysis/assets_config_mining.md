# Assets/Config Mining (APK/assets)

## Summary
Assets were already extracted in `SmartEngines_apktool/assets` (full set) with duplicate `.se` bundles mirrored under `extracted_assets/assets`. I scanned for `.dict/.zdict/.zstd/.json/.bin/.dat` candidates, ZSTD dictionary/frame magic bytes, and ASCII keyword hits (`zstd`, `dict`, `key`, `salt`, `iv`, `bundle`). No ZSTD dictionary files or ZSTD dict/frame magic bytes were found inside assets, and keyword hits inside `.se` bundles were limited to the `sebundle1~...` header plus incidental short `IV/KEY` substrings in random binary data. The only text-like assets are UI/config JSON/JS/CSS and two `.mock` samples; none contain embedded keys, salts, IVs, or base64/hex byte arrays.

## Status
Progress: asset extraction verified; inventory + keyword/magic scans complete; report written. Blockers: none.

## Asset inventory (APK/assets)
| Path | Size (bytes) | Description |
| --- | --- | --- |
| SmartEngines_apktool/assets/bundle_codeengine_full.se | 5,850,892 | Encrypted/packed SE bundle (header `sebundle1~2.7.2~2688f026b0f34dea31b377bfe5fd1f6ecf2b984810~`). |
| SmartEngines_apktool/assets/bundle_international_faces_liveness.se | 118,987,071 | Encrypted/packed SE bundle (header `sebundle1~2.7.2~2688f026b0f34dea31b377bfe5fd1f6ecf2b984810~`). |
| SmartEngines_apktool/assets/bundle_newdocengine_demo_hiring_dsn.se | 56,878,300 | Encrypted/packed SE bundle (header `sebundle1~3.2.0~2688f026b0f34dea31b377bfe5fd1f6ecf2b984810~`). |
| SmartEngines_apktool/assets/bundle_textengine.se | 27,200,957 | Encrypted/packed SE bundle (header `sebundle1~2.6.4~2688f026b0f34dea31b377bfe5fd1f6ecf2b984810~`). |
| SmartEngines_apktool/assets/dg1-igor.mock | 93 | MRZ sample string for document testing (contains `7114238741RUS7110276M2007221`). |
| SmartEngines_apktool/assets/dg2-igor.mock | 11,569 | Binary DG2 sample; contains `JasPer Version 1.701.0` at offset 0x96 (JPEG2000/JP2 indicator). |
| SmartEngines_apktool/assets/doc-autoselection-modes.json | 705 | UI/config list of document selection modes (EN/RU labels). |
| SmartEngines_apktool/assets/doc-document-types.json | 9,487 | UI/config list of document types (EN/RU labels). |
| SmartEngines_apktool/assets/text-languages.json | 6,173 | UI/config list of language labels. |
| SmartEngines_apktool/assets/doc-result.css | 4,179 | UI stylesheet (no secrets). |
| SmartEngines_apktool/assets/doc-result.js | 4,861 | UI logic (no secrets). |
| SmartEngines_apktool/assets/text-result.css | 1,678 | UI stylesheet (no secrets). |
| SmartEngines_apktool/assets/text-result.js | 3,411 | UI logic (no secrets). |
| SmartEngines_apktool/assets/dexopt/baseline.prof | 10,966 | Baseline profile (dexopt metadata). |
| SmartEngines_apktool/assets/dexopt/baseline.profm | 508 | Baseline profile metadata. |
| extracted_assets/assets/*.se | same sizes | Duplicate `.se` bundles extracted earlier (mirror of apktool assets). |

## Suspicious strings/constants (with locations)
- `sebundle1~<version>~2688f026b0f34dea31b377bfe5fd1f6ecf2b984810~` at offset 0x0 in all four `.se` bundles (bundle header/version + 40-hex token). This is the only stable ASCII header string found.
- `KEY_AI` at offset 0xF428E in `SmartEngines_apktool/assets/bundle_textengine.se` (short ASCII substring inside binary data; likely incidental without surrounding structure).
- `KEYj^` at offset 0x14D0A6 in `SmartEngines_apktool/assets/bundle_textengine.se` (short ASCII substring inside binary data; likely incidental without surrounding structure).
- `JasPer Version 1.701.0` at offset 0x96 in `SmartEngines_apktool/assets/dg2-igor.mock` (JP2/JPEG2000 marker from test sample, not a key).
- MRZ sample line in `SmartEngines_apktool/assets/dg1-igor.mock` (single-line test data; no key material).

## ZSTD dictionary requirement
No `.dict/.zdict/.zstd` files were present in assets and no ZSTD dict magic (`0xEC30A437`) or ZSTD frame magic (`0x28B52FFD`) was found inside any asset file. Based on assets alone, there is no embedded dictionary and decompression should not require an external dict from `assets/`. If a ZSTD dictionary is required at runtime, it is more likely embedded in native libraries or generated/derived on the fly.
