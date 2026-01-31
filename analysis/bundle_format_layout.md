# Offline bundle format recon (task 1)

Scope: on-disk .se bundles and offline dumps only (no runtime instrumentation).

## Observations (samples)
- All sampled bundles start with ASCII text header: `sebundle1~<version>~<hexid>~`.
- Header end is at the 3rd tilde (offsets 9, 15, 58 in this sample set), so ASCII header length = 59 bytes.
- The `<hexid>` field is 42 hex chars (21 bytes) in all samples and is identical across the 4 bundles.
- Immediately after the text header, the next 36 bytes are a binary header:
  - Bytes 0..19: version-specific key (constant per version).
  - Bytes 20..35: constant `76f6f2fb17591a73192c515d55b72060`.
- The 36-byte block appears unencrypted (stable values by version/bundle).

### Header samples (ASCII + binary header)
| Bundle | Version | Hexid (42 hex) | ASCII header len | Key[0..19] | Const[20..35] |
| --- | --- | --- | --- | --- | --- |
| bundle_codeengine_full.se | 2.7.2 | 2688f026b0f34dea31b377bfe5fd1f6ecf2b984810 | 59 | a6d01f9528847cd118d154e96dd9fd2cd16f7a77 | 76f6f2fb17591a73192c515d55b72060 |
| bundle_international_faces_liveness.se | 2.7.2 | 2688f026b0f34dea31b377bfe5fd1f6ecf2b984810 | 59 | a6d01f9528847cd118d154e96dd9fd2cd16f7a77 | 76f6f2fb17591a73192c515d55b72060 |
| bundle_newdocengine_demo_hiring_dsn.se | 3.2.0 | 2688f026b0f34dea31b377bfe5fd1f6ecf2b984810 | 59 | c2ac4db5c62062bb0d7554d55613991b059fee8a | 76f6f2fb17591a73192c515d55b72060 |
| bundle_textengine.se | 2.6.4 | 2688f026b0f34dea31b377bfe5fd1f6ecf2b984810 | 59 | 3cb11e8c45e443f30057c9e6559c48cbd02c3c16 | 76f6f2fb17591a73192c515d55b72060 |

## Inferred layout (current best hypothesis)
```
0x00 .. 0x3A  Text header (59 bytes): sebundle1~<version>~<hexid>~
0x3B .. 0x5E  Binary header (36 bytes): 20-byte version key + 16-byte constant
0x5F .. EOF   Encrypted payload (high entropy)
```
- Payload offset (encrypted) = 59 + 36 = 95 bytes (0x5F).
- Payload length = file_size - 95 bytes.
- Offline XOR layer applies to **all bytes after 0x3B** (text header end), so the first 36 bytes of post‑XOR output are the XORed binary header (see `analysis/postxor_constant_derivation.md`).

## Chunk table / internal structure
- No clear monotonic table or repeating block structure is visible in the encrypted payload.
- Any chunk table is likely inside encrypted data and not recoverable offline without decryption.

## ZSTD / JSON indicators (offline scan)
- No ZSTD magic (28 B5 2F FD) found in sampled bundles.
- Occasional printable runs with '[' or '{' appear, but look like false positives.

## Notes on decrypted outputs
- `decrypted_bundles/*_decrypted_raw.bin` sizes are smaller than on-disk bundles by 64–87 bytes (bundle-dependent).
- With the confirmed 59-byte ASCII header + 36-byte binary header (total 95 bytes), the dump step likely trims a header subset rather than a clean payload boundary.
- Treat these as `payload minus some header bytes`, not a fully decoded payload.

## XOR-zero check (retested)
- Verified across the 4 unique bundles in `extracted_bundles/assets`: `payload[0:64] XOR post_header[0:64]` is **not** all zeros.
- `payload[0:64]` also does **not** equal the 64-byte post-header.
- This contradicts the earlier XOR-zero hypothesis; any keystream derivation is still unknown.

## Decrypted payload scan (decrypted_bundles)
- Scanned `*_decrypted_raw.bin` files show ~8.0 entropy, no long ASCII runs, and many incidental gzip/zlib signatures.
- These signatures are consistent with random data (false positives), not clear compressed blocks.
- 1MB window stats across decrypted outputs show uniform high entropy/IoC and zlib ratio ~1.000 throughout (see `analysis/decrypted_window_stats.md`).
- Sampled 4MB stats show entropy ~7.99995, IoC ~1/256, near-zero autocorrelation and zlib ratio ~1.000, reinforcing pseudo-random behavior (see `analysis/decrypted_stat_extended.md`).

## Table scan (monotonic u32 windows)
- Sliding-window monotonic u32 scan over `*_decrypted_raw.bin` finds only weak monotonic prefixes (7–8 u32s).
- No strong table region identified without real decryption.

## Alignment check (decrypted outputs vs on-disk bundles)
- `*_decrypted_raw.bin` files do not match any simple slice of the on-disk bundles (no match at diff offset or payload offset).
- Best 4KB match scores are low, indicating these outputs are transformed rather than just trimmed.

## XOR probe (same-version bundles)
- XOR of payloads from two v2.7.2 bundles stays high entropy with only incidental zlib signatures.
- This does not indicate a shared keystream with meaningful plaintext leakage.

## Ciphertext block stats
- 16-byte block repeat ratios in the first 8MB are ~0, suggesting no ECB-style repetition.
- Payload lengths are not consistently 16-byte aligned (mods vary), which is consistent with stream-like encryption or padding/truncation.

## Ciphertext statistical tests
- Bit-ones ratio ~0.500 and low short-lag autocorrelation across samples indicate pseudo-random ciphertext.
- No obvious bias suggesting simple XOR with short repeating key.
- Extended sampled stats (first 4MB) show IoC ~1/256, chi-square near uniform, and zlib compression ratios ~1.000, consistent with incompressible pseudo-random data (see `analysis/payload_stat_extended.md`).

## Entropy profile (payload windows)
- Sliding 64KB window entropy remains ~7.992–7.996 across all bundles.
- No low-entropy regions detected that would suggest unencrypted tables or headers.
- Additional 1MB window stats (start/25%/50%/75%/end) show entropy ~7.9997–7.9998, IoC ~1/256, and zlib ratio ~1.000 throughout (see `analysis/payload_window_stats.md`).

## Keystream match probe (ciphertext vs decrypted_raw)
- XOR-derived keystreams from payload vs `*_decrypted_raw.bin` do not match across bundles (match ratios ~1%).
- This further suggests `*_decrypted_raw.bin` are transformed outputs, not a shared-keystream XOR of the payload.

## Next steps (offline)
- Confirm the 64-byte binary header across more bundle variants (other versions/licenses if available).
- If an offline decrypt step is found, re-scan decrypted payload for real tables or compression headers.
