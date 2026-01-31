# ZSTD out dumps: magic + deflate probe

Files: `C:\temp\MobileSDK\se_dumps\latest\zstd_out_*.bin`

## Magic scan
- zlib/deflate magic found at offsets 4064/8768/9696 in `zstd_out_1769666284656.bin` and `zstd_out_1769666284704.bin`.
- zlib/deflate magic found at offset 4064 in `zstd_out_1769666284722.bin`.
- No obvious magics in `zstd_out_1769666284714.bin` and `zstd_out_1769666284717.bin`.

## Deflate test
- Attempted `zlib.decompress` on each detected header (256 KB window) -> all failed.
- Conclusion: these zlib signatures are likely false positives in the current zstd_out dumps.

Scripts:
- `analysis/_scan_zstd_out_magics.py`
- `analysis/_test_zstd_out_deflate.py`
