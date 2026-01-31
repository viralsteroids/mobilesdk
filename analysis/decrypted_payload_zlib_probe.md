# Decrypted payload zlib/gzip probe (fast)

Goal: check whether apparent zlib/gzip headers in decrypted payloads are real by attempting quick decompression on early hits.

Method:
- Script: `analysis/_test_decompressed_magics_fast.py`
- For each file in `decrypted_bundles/*.bin`, scan first 2,000 zlib/gzip magic hits.
- Attempt decompression on first 120 hits using 256 KB input window and 256 KB output cap.

Result (29 Jan 2026):
- No successful decompressions on the first 120 hits for any file:
  - `bundle_codeengine_full_decrypted_raw.bin`
  - `bundle_codeengine_full_last_attempt.bin`
  - `bundle_international_faces_liveness_decrypted_raw.bin`
  - `bundle_international_faces_liveness_last_attempt.bin`
  - `bundle_newdocengine_demo_hiring_dsn_decrypted_raw.bin`
  - `bundle_newdocengine_demo_hiring_dsn_last_attempt.bin`
  - `bundle_textengine_decrypted_raw.bin`
  - `bundle_textengine_last_attempt.bin`

Interpretation:
- The repeated zlib/gzip magic bytes in decrypted payloads are likely false positives (high-entropy data).
- This does not fully rule out real compressed blocks; deeper scanning with known offsets would still be needed.
