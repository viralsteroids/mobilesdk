# sebundle1 header analysis (static)

Scope: on-disk .se bundles in extracted_bundles/assets (4 samples). Observations are from static bytes only.

## ASCII header (text)
Format: sebundle1~<version>~<hexid>~
- Magic: "sebundle1" (9 bytes, ASCII).
- Separator: "~" (0x7E) after magic and after version.
- Version: ASCII string (5 bytes in samples: 2.6.4, 2.7.2, 3.2.0).
- Hexid: 42 hex chars (21 bytes) in all samples; identical across this set.
- Trailer: trailing "~" (0x7E) terminator (3rd tilde).
- ASCII header length = 59 bytes (0x3B) for the sample set.
- Length formula: 9 + 1 + len(version) + 1 + len(hexid) + 1.

Example header strings:
- sebundle1~2.7.2~2688f026b0f34dea31b377bfe5fd1f6ecf2b984810~
- sebundle1~3.2.0~2688f026b0f34dea31b377bfe5fd1f6ecf2b984810~

## Binary post-header (64 bytes)
Immediately after the ASCII header (offset 0x3B), there is a 64-byte binary header:
- Bytes 0..19: 20-byte version key (constant per version; identical across both v2.7.2 bundles).
- Bytes 20..35: constant 16 bytes: 76f6f2fb17591a73192c515d55b72060.
- Bytes 36..63: 28-byte per-bundle tail (no constant bytes across samples).

No other constant bytes were observed in the 64-byte post-header across the 4 bundles.

## Header layout (offsets)
Offsets below reflect the sample set (version length 5, hexid length 42). If version length changes, the separators and hexid offsets shift accordingly.
| Offset (hex) | Length | Field | Notes |
| --- | --- | --- | --- |
| 0x00 | 9 | magic | "sebundle1" ASCII |
| 0x09 | 1 | sep_1 | 0x7E (~) |
| 0x0A | var | version | 5 bytes in samples |
| 0x0F | 1 | sep_2 | 0x7E (~) |
| 0x10 | 42 | hexid | 42 hex chars (21 bytes) |
| 0x3A | 1 | trailer | 0x7E (~) |
| 0x3B | 20 | vkey | version-specific key |
| 0x4F | 16 | const_16 | 76f6f2fb17591a73192c515d55b72060 |
| 0x5F | 28 | tail | per-bundle bytes |
| 0x7B | ... | payload | encrypted payload start |

## Sample table
| Bundle | Version | Hexid | ASCII len | Post64 vkey (0..19) | Post64 tail (36..63) |
| --- | --- | --- | --- | --- | --- |
| bundle_codeengine_full.se | 2.7.2 | 2688f026b0f34dea31b377bfe5fd1f6ecf2b984810 | 59 | a6d01f9528847cd118d154e96dd9fd2cd16f7a77 | 4cb8409b55e14fd5e59d1230eb56172f52ae9a1717a82ecf28f24309 |
| bundle_international_faces_liveness.se | 2.7.2 | 2688f026b0f34dea31b377bfe5fd1f6ecf2b984810 | 59 | a6d01f9528847cd118d154e96dd9fd2cd16f7a77 | b4e04ff1f15942ca60045350a769306098fd7ae3c5435fa0a121b177 |
| bundle_newdocengine_demo_hiring_dsn.se | 3.2.0 | 2688f026b0f34dea31b377bfe5fd1f6ecf2b984810 | 59 | c2ac4db5c62062bb0d7554d55613991b059fee8a | ec764fed4a8779bb1beec2d68b265c4c7089747a93b03c33b2d47f59 |
| bundle_textengine.se | 2.6.4 | 2688f026b0f34dea31b377bfe5fd1f6ecf2b984810 | 59 | 3cb11e8c45e443f30057c9e6559c48cbd02c3c16 | 94c44f51ff67508aa0a9aebf75d11808b28a8b4466c7c23fd750fd46 |
