# Header structure validation (2026-01-30)

Summary from `analysis/batch_decrypt_results_key3737888.csv`:

- Bundles scanned: 4 (from `extracted_bundles/assets`).
- Format version: `1` for all.
- Header length: `59` bytes for all.
- Token tail `dec_len`: `10` for all.
- Mini header plaintext (using key table at offset `0x3909cf`): `1~se_demo~`.
- Engine versions observed: `2.6.4`, `2.7.2`, `3.2.0`.

See `analysis/batch_decrypt_results_key3737888.md` for per-file details.
