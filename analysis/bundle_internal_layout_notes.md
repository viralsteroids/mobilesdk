# Bundle internal layout notes (raw)

Date: 2026-01-29
Scope: on-disk bundles in extracted_bundles/assets + offline reports only.

## Sample set (extracted_bundles/assets)
Source: analysis/bundle_header_table.csv

| bundle | version | size | payload_len | header_end | payload_offset | entropy_1m |
| --- | --- | ---: | ---: | ---: | ---: | ---: |
| bundle_codeengine_full.se | 2.7.2 | 5,850,892 | 5,850,797 | 59 | 95 | 7.99980 |
| bundle_international_faces_liveness.se | 2.7.2 | 118,987,071 | 118,986,976 | 59 | 95 | 7.99970 |
| bundle_newdocengine_demo_hiring_dsn.se | 3.2.0 | 56,878,300 | 56,878,205 | 59 | 95 | 7.99974 |
| bundle_textengine.se | 2.6.4 | 27,200,957 | 27,200,862 | 59 | 95 | 7.99981 |

## Verified header constants
Source: bundle_header_postdump_all.txt, bundle_header_table.csv

- Text header (59 bytes): sebundle1~<version>~<license_hash>~
  - tilde positions: 9, 15, 58 (header_end = 59)
- Binary header (36 bytes) immediately after text header:
  - bytes 0..19: version key
    - v2.7.2: a6d01f9528847cd118d154e96dd9fd2cd16f7a77
    - v3.2.0: c2ac4db5c62062bb0d7554d55613991b059fee8a
    - v2.6.4: 3cb11e8c45e443f30057c9e6559c48cbd02c3c16
  - bytes 20..35: constant 76f6f2fb17591a73192c515d55b72060
- Encrypted payload offset: 59 + 36 = 95 (0x5F)
  - XOR layer applies starting at offset 59 (text header end), so post‑XOR output begins with the XORed binary header.

## XOR layer (offline, confirmed)
Source: DECRYPTION_ANALYSIS_REPORT.md, analysis/bundle_structure.md

- 32-byte repeating XOR key (payload -> *_last_attempt.bin):
  - license hash (21 bytes) + 11-byte tail
  - full key: 26 88 f0 26 b0 f3 4d ea 31 b3 77 bf e5 fd 1f 6e cf 2b 98 48 10 d6 07 87 0d ed 14 05 e9 f8 a3 d9
- Verified across all bytes of all four bundles.
- Post-XOR constant sequence (all bundles), at post-XOR offset 0x4F..0x5E:
  - 66 20 f5 7c 1a b4 0e 76 f0 d4 f2 84 73 3f d0 46
  - Source: analysis/postxor_header_diff.md

## Entropy and block stats (payload)
Sources: analysis/payload_entropy_profile.md, analysis/ciphertext_block_stats.md

- 64KB window entropy samples are ~7.992-7.996 (near-max) for all bundles.
- 16-byte block repeat ratios in first 8MB are ~0 (no ECB-style repetition).
- Payload length mod16: codeengine=13, faces=0, newdoc=13, text=14.

## Size-marker scan
Source: bundle_size_marker_scan.txt

- No u32/u64 fields equal to file size or payload size in the first 512 bytes.

## Magic hits (likely false positives in high-entropy data)
Sources: analysis/bundle_offsets_table.csv, analysis/bundle_zstd_json_offsets.csv, analysis/postxor_magic_scan_summary.md

### On-disk .se payload (gzip offsets)
- bundle_international_faces_liveness.se: 4131046, 6036951, 18665960, 30170591, 38221182, 95011596, 102847553, 111988702
- bundle_newdocengine_demo_hiring_dsn.se: 7018657, 34927576
- bundle_textengine.se: 5897270, 7169610, 16640213
- bundle_codeengine_full.se: none
- ZSTD magic (28 b5 2f fd) not found in any bundle (bundle_zstd_json_offsets.csv).

### Post-XOR (*_last_attempt.bin) gzip offsets
- faces_liveness_last_attempt: 11676254, 30883122, 32165745, 41512972, 64761684, 116383400
- newdoc_last_attempt: 3449898, 5908405, 10594312, 11719892, 22989673, 32839797, 44152712, 56655474
- codeengine_last_attempt, textengine_last_attempt: none

### decrypted_raw (zlib/gzip offsets)
- These files remain ~8.0 entropy and do not decompress; signatures are likely random.
  - Example: bundle_codeengine_full_decrypted_raw.bin gzip offsets at 180777 and 4503271.

## Candidate IV/key offsets in raw payload
Source: analysis/bundle_structure.md

- IV-like 16-byte values in raw payload:
  - codeengine_full: 99808
  - textengine: 43948
  - faces_liveness: 37566
  - newdoc: 17006
- 32-byte key-like values in raw payload:
  - faces_liveness: 30152203
  - newdoc: 31347594
- These offsets do not align in *_last_attempt.bin, implying XOR is applied before this layer.

## Decoder chain evidence for internal container
Sources: analysis/decoder_chain.md, analysis/open_memory2_x19_layout.md

- archive_read_open_memory2 is called with a buffer descriptor (base + offset, size) at callsite 0x02557c60.
- archive_read_support_format_zip_streamable/seekable and archive_read_support_filter_zstd are invoked in the wrapper.
- This strongly implies the decrypted buffer is an archive container processed by libarchive.

## Tentative internal file-table layout (hypotheses)

Hypothesis A: ZIP container after full decrypt
- Layout: [optional custom header] + ZIP local file headers/data + central directory + EOCD.
- File table is the ZIP central directory near the end of the buffer.
- Evidence: libarchive ZIP support + memory buffer path; no ZIP magic visible pre-decrypt.

Hypothesis B: ZSTD-compressed blob with internal table
- ZSTD outputs (se_dumps/latest/zstd_out_*.bin) show:
  - 4 x u64 pointer-like values, then 2 x u32 flags, then many 8-byte records [u32 value][u32 index], then a u16 table region, then padding.
- Potential file-table: the 8-byte records act as descriptors (type/size/index).
- Evidence: analysis/zstd_out_structure_notes.md.

Hypothesis C: Custom table only visible after full decrypt
- No size markers or monotonic u32 tables are present in encrypted or post-XOR data; any table is likely inside the real decrypted payload.
