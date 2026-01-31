# Decrypted bundle ZIP magic scan

Updated: 2026-01-29

## Scan scope
- Directory: `C:\temp\MobileSDK\decrypted_bundles`
- Signatures: `PK\x03\x04`, `PK\x05\x06`, `PK\x07\x08`

## Findings
- `PK\x07\x08` found at offset 20,107,319 in:
  `decrypted_bundles\bundle_international_faces_liveness_last_attempt.bin`
- No ZIP signatures found in raw `se_dumps` inputs/outputs.

## Implication
ZIP payloads may appear after successful decryption; current decrypted outputs still contain many false zlib/gzip hits and are not yet cleanly decompressible.
