# Post-XOR alt compression probe

Summary: scanned decrypted_bundles and offline_xor_out for LZ4 frame, XZ, LZMA (alone), Snappy framed, 7z, and Brotli heuristics (no fixed Brotli magic exists, so both a heuristic 0xCEB2CF81 and ASCII Brotli tokens were used). Files scanned: 12. Magic hits: none.

LZMA attempts: none (no XZ/LZMA signatures detected).

Files changed:
- analysis/_scan_alt_compression.py
- analysis/postxor_alt_compression_probe.md
- analysis/postxor_alt_compression_hits.csv