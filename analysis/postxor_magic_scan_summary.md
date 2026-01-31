# Post-XOR magic scan summary

Summary of counts and earliest offsets per magic type.
Note: ZLIB/JSON hits can be high due to random matches in high-entropy data.

## bundle_codeengine_full.se
- JSON: count=84, earliest_offset=205062
- ZLIB_78_01: count=92, earliest_offset=3049
- ZLIB_78_9C: count=92, earliest_offset=21359
- ZLIB_78_DA: count=74, earliest_offset=42304

## bundle_international_faces_liveness.se
- GZIP: count=6, earliest_offset=11676313
- JSON: count=1840, earliest_offset=77008
- ZIP_SPAN: count=1, earliest_offset=20107378
- ZLIB_78_01: count=1738, earliest_offset=366750
- ZLIB_78_9C: count=1823, earliest_offset=241296
- ZLIB_78_DA: count=1789, earliest_offset=14472

## bundle_newdocengine_demo_hiring_dsn.se
- GZIP: count=8, earliest_offset=3449957
- JSON: count=876, earliest_offset=41792
- ZLIB_78_01: count=809, earliest_offset=56913
- ZLIB_78_9C: count=855, earliest_offset=104995
- ZLIB_78_DA: count=887, earliest_offset=94290

## bundle_textengine.se
- JSON: count=425, earliest_offset=8356
- ZLIB_78_01: count=417, earliest_offset=18187
- ZLIB_78_9C: count=381, earliest_offset=40253
- ZLIB_78_DA: count=388, earliest_offset=101331

## Decompression probe results (2026-01-29)
- Tested gzip/zlib/bzip2 at magic offsets using `analysis/postxor_layer2_probe.md` (first 10 zlib offsets per bundle + all gzip offsets from scan).
- ZLIB: all tested offsets failed across zlib/raw/gzip wbits variants with `incorrect header check` (and a few `unknown compression method`).
- GZIP: all tested offsets failed with `incorrect header check`.
- BZIP2: random `BZh` hits in `bundle_international_faces_liveness` and `bundle_newdocengine_demo_hiring_dsn` failed with `Invalid data stream`.
- LZ4: no frame magic (`0x04 0x22 0x4D 0x18`) observed in any `_last_attempt.bin`.
- ZLIB header checksum scan (CMF/FLG valid) across all decrypted/post‑XOR outputs found no successful zlib/raw‑deflate decompressions in the first 200 candidates per file (see `analysis/postxor_zlib_header_probe.md`).
- Alt compression probe (LZ4/XZ/LZMA/Snappy/7z/Brotli heuristics) across decrypted_bundles and offline_xor_out found zero magic hits (see analysis/postxor_alt_compression_probe.md).

## Scan v2 notes (2026-01-29)
- `analysis/magic_scan_v2.md` scanned raw `.se` bundles, decrypted outputs, offline XOR outputs, and `se_dumps` files.
- No ZSTD frame (`0x28B52FFD`) or ZSTD dictionary (`0x37A430EC`) magic was found in any scanned file.
- One LZ4 frame magic hit appears in raw `bundle_newdocengine_demo_hiring_dsn.se` at `0x2b9343`, but the same file shows many zlib/gzip/bzip2 signatures; treat as a likely false positive until a real decompressor succeeds.
- ZLIB/GZIP/BZIP2 magic hits are abundant even in raw `.se` bundles, reinforcing that these signatures are not reliable indicators under high-entropy/encrypted data.
