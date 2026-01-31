# ZIP offset validation

Parsed `_offline_layer2_probe.csv` and resolved the four bundle files in `offline_xor_out`. For each `zip` keyword offset, I scanned a +/-16384-byte window for `PK\x03\x04`, `PK\x01\x02`, and `PK\x05\x06` signatures, plus a near-EOF scan of the last 131072 bytes. No ZIP signatures were found in any of the per-offset windows or in the EOF windows.

Per file (offsets from CSV): `bundle_codeengine_full_last_attempt.bin` @ 1584141, `bundle_international_faces_liveness_last_attempt.bin` @ 35286330, `bundle_newdocengine_demo_hiring_dsn_last_attempt.bin` @ 13744512, `bundle_textengine_last_attempt.bin` @ 6543094 -- all had zero hits for the three ZIP signatures in both the local windows and the EOF windows.

Files:
- `analysis/_scan_zip_offsets.py`
- `analysis/zip_offset_validation.md`
