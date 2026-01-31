# Dynamic dump scan (latest)

Scanned `se_dumps/latest` (five `zstd_out_*.bin` dumps, 2.7-24.6 KB). No `sebundle1~` header and no ZSTD frame magic (`0x28B52FFD`) were found. Printable ratios are low (5.3-16.3%) with zero ASCII runs >=6 bytes, so there are no visible JSON strings/keys.

Zlib CMF/FLG-valid header candidates appear in three files (59, 51, and 1 hits) and cluster at offset `0x0FE0` (4064), but quick zlib/raw-deflate probes on the first 10 candidates per file yielded no successful decompressions. Overall the dumps still look high-entropy/packed rather than decoded bundle payloads.

Changed files:
- analysis/dynamic_dump_scan.md
- analysis/artifact_index.md
