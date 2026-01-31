# Offline bundle structure summary (verified)

## On-disk header (all bundles)
- Text header (59 bytes): `sebundle1~<version>~<license_hash>~` (3rd tilde at offset 58).
- Binary header (36 bytes) immediately after text header:
  - Bytes 0..19: version-specific key.
    - v2.7.2 = `a6d01f9528847cd118d154e96dd9fd2cd16f7a77`
    - v3.2.0 = `c2ac4db5c62062bb0d7554d55613991b059fee8a`
    - v2.6.4 = `3cb11e8c45e443f30057c9e6559c48cbd02c3c16`
  - Bytes 20..35: constant `76f6f2fb17591a73192c515d55b72060`
- Encrypted payload offset = 95 (0x5F). Payload length = file_size - 95.
  - Note: the XOR layer is applied starting at the **text header end** (offset 59). The first 36 bytes of the XOR output are the XORed binary header.

## Confirmed offline XOR layer
- XOR is applied to **all bytes after the text header** (offset 59), i.e., binary header + payload. Output length = file_size − 59.
- Key = license-hash bytes (21) + 11-byte tail:
  - `26 88 f0 26 b0 f3 4d ea 31 b3 77 bf e5 fd 1f 6e cf 2b 98 48 10 d6 07 87 0d ed 14 05 e9 f8 a3 d9`
- Post-XOR constant at offsets 0x14..0x23 (in post-XOR view): `66 20 f5 7c 1a b4 0e 76 f0 d4 f2 84 73 3f d0 46` (shared across all `*_last_attempt.bin`).
- Post-XOR bytes 0x00..0x13 equal `key20 XOR license_hash20`, confirming XOR key alignment and header derivation (see `analysis/header_key_relation_check.md`).
  - When XORed with the key slice at 0x14..0x23, this yields `76 f6 f2 fb 17 59 1a 73 19 2c 51 5d 55 b7 20 60`, i.e., the same 16‑byte constant from the on‑disk binary header (see `analysis/postxor_constant_derivation.md`).

## Payload characteristics (pre- and post-XOR)
- Near-max entropy in 64KB windows; 16-byte block repeat ratios near zero.
- No ZSTD/ZIP magic in on-disk payloads or post-XOR artifacts.
- No u32/u64 size markers in the first 512 bytes.

## Likely internal container (requires real decrypt)
- Static loader chain uses libarchive on a memory buffer and enables ZIP + ZSTD filters.
- Hypothesis: decrypted buffer is ZIP (central directory near end) or ZSTD-compressed container
  with internal tables (see `analysis/bundle_internal_layout_notes.md`).
