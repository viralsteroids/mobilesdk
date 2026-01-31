# Post-XOR layer2 decompression probe

Summary: Tested zlib/gzip/bzip2 at the earliest magic offsets extracted from `analysis/postxor_magic_scan.md`. All zlib attempts failed across zlib/raw/gzip wbits variants (most `incorrect header check`, a few `unknown compression method`). All gzip attempts failed with `incorrect header check`. Bzip2 magic hits in two bundles failed with `Invalid data stream`, and no LZ4 frame magic bytes were observed. This points to false positives in high-entropy data or compressed payloads that require additional framing/offset adjustments before they can be decoded.

Method: attempt gzip/zlib/bzip2 decompression at magic offsets from postxor_magic_scan.md. For zlib, test zlib/raw/gzip wbits variants and record first that yields output (up to 1 MiB) and whether EOF is reached.

## bundle_codeengine_full
- Input file: bundle_codeengine_full_last_attempt.bin (5850833 bytes)
- ZLIB offsets tested (first 10): 3049, 10092, 21359, 22841, 42304, 75745, 105600, 115572, 136974, 141221
  - zlib @ 3049: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 10092: FAIL (error: Error -3 while decompressing data: unknown compression method)
  - zlib @ 21359: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 22841: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 42304: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 75745: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 105600: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 115572: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 136974: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 141221: FAIL (error: Error -3 while decompressing data: incorrect header check)
- GZIP offsets tested: none
- BZIP2 magic hits tested: none
- LZ4 frame magic hits: none

## bundle_international_faces_liveness
- Input file: bundle_international_faces_liveness_last_attempt.bin (118987012 bytes)
- ZLIB offsets tested (first 10): 14472, 74758, 84038, 203377, 241296, 264855, 272461, 280848, 285484, 310225
  - zlib @ 14472: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 74758: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 84038: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 203377: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 241296: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 264855: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 272461: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 280848: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 285484: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 310225: FAIL (error: Error -3 while decompressing data: incorrect header check)
- GZIP offsets tested (first 6): 11676313, 30883181, 32165804, 41513031, 64761743, 116383459
  - gzip @ 11676313: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - gzip @ 30883181: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - gzip @ 32165804: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - gzip @ 41513031: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - gzip @ 64761743: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - gzip @ 116383459: FAIL (error: Error -3 while decompressing data: incorrect header check)
- BZIP2 magic hits tested (first 5): 16801632, 36252683, 43647933, 68063373, 75343072
  - bzip2 @ 16801632: FAIL (OSError: Invalid data stream)
  - bzip2 @ 36252683: FAIL (OSError: Invalid data stream)
  - bzip2 @ 43647933: FAIL (OSError: Invalid data stream)
  - bzip2 @ 68063373: FAIL (OSError: Invalid data stream)
  - bzip2 @ 75343072: FAIL (OSError: Invalid data stream)
- LZ4 frame magic hits: none

## bundle_newdocengine_demo_hiring_dsn
- Input file: bundle_newdocengine_demo_hiring_dsn_last_attempt.bin (56878241 bytes)
- ZLIB offsets tested (first 10): 56913, 78744, 94290, 104995, 113715, 122303, 146778, 150074, 176144, 184416
  - zlib @ 56913: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 78744: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 94290: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 104995: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 113715: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 122303: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 146778: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 150074: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 176144: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 184416: FAIL (error: Error -3 while decompressing data: incorrect header check)
- GZIP offsets tested (first 8): 3449957, 5908464, 10594371, 11719951, 22989732, 32839856, 44152771, 56655533
  - gzip @ 3449957: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - gzip @ 5908464: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - gzip @ 10594371: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - gzip @ 11719951: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - gzip @ 22989732: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - gzip @ 32839856: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - gzip @ 44152771: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - gzip @ 56655533: FAIL (error: Error -3 while decompressing data: incorrect header check)
- BZIP2 magic hits tested (first 2): 34395733, 56259153
  - bzip2 @ 34395733: FAIL (OSError: Invalid data stream)
  - bzip2 @ 56259153: FAIL (OSError: Invalid data stream)
- LZ4 frame magic hits: none

## bundle_textengine
- Input file: bundle_textengine_last_attempt.bin (27200898 bytes)
- ZLIB offsets tested (first 10): 18187, 40253, 51991, 55154, 101331, 166733, 185799, 218115, 304226, 307459
  - zlib @ 18187: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 40253: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 51991: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 55154: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 101331: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 166733: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 185799: FAIL (error: Error -3 while decompressing data: unknown compression method)
  - zlib @ 218115: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 304226: FAIL (error: Error -3 while decompressing data: incorrect header check)
  - zlib @ 307459: FAIL (error: Error -3 while decompressing data: incorrect header check)
- GZIP offsets tested: none
- BZIP2 magic hits tested: none
- LZ4 frame magic hits: none
