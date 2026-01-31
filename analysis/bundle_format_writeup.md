# Bundle format recon (offline) - verified summary

Scope: on-disk .se bundles + offline dumps only (no runtime instrumentation).

## Verified on-disk layout
- Text header (59 bytes): `sebundle1~<version>~<hex42>~` (tildes at offsets 9, 15, 58).
  - `<hex42>` is **42 hex chars** (21 bytes) and is constant across tested bundles.
  - It does **not** match the 20-byte binary key that follows the header.
- Binary header (36 bytes) immediately after text header:
  - Bytes 0..19: version-specific key (one per version).
  - Bytes 20..35: constant `76f6f2fb17591a73192c515d55b72060`.
- Encrypted payload offset = 95 bytes (0x5F). Payload length = file_size - 95.
- Payload shows near-max entropy and no repeating 16-byte blocks (no ECB patterns).

## Layering beyond header (offline)
- Confirmed XOR obfuscation layer: XOR is applied to **all bytes after the text header** (offset 59),
  i.e., binary header + payload. This yields the `*_last_attempt.bin` artifacts (length = file_size − 59).
- Post-XOR data remains high-entropy; no ZSTD/ZIP magic found and no size fields in the first 512 bytes.
- Quick zlib/gzip decompression checks on `*_decrypted_raw.bin` and `*_last_attempt.bin` found
  no successful streams in the first 120 header hits per file (likely false positives).
- `*_decrypted_raw.bin` outputs do not align to a simple slice of the on-disk bundles.

## Tentative internal container (needs real decrypt)
- Static loader chain uses libarchive with ZIP and ZSTD support on a memory buffer
  (`archive_read_open_memory2`), implying the decrypted payload is an archive container.
- If ZIP: expect local file headers + central directory + EOCD near the end (file table at tail).
- If ZSTD: decompressed dumps show pointer blocks and u32-pair tables that could be a file index.

See `analysis/bundle_internal_layout_notes.md` for offsets, magic-hit tables, entropy samples,
and the evidence trail for the container hypotheses.
