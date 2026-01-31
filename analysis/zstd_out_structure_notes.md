# zstd_out structure notes

## Observations
- All dumps begin with four 64-bit values that look like pointers; the first three files share identical addresses (e.g., `0x000071b7fc5b7920`, `0x000071b7fc5b9130`, `0x000071b7fc5b8928`, `0x000071b7fc5ba138`).
  - Pointer block confirmed identical in 4/5 dumps; one dump has a different first pointer (`0x000071b77f5f8b3c`). See `analysis/zstd_out_ptr_header.md`.
- Immediately after the pointer block are two 32-bit fields with small values (`d0` in {0,1}, `d1` in {6,7,8}).
- From roughly `0x30` onward, data is dominated by 8-byte records that read cleanly as `[u32 value][u32 index]`. Early records in `zstd_out_1769666284656.bin` show `value = 0x01000000 + even`, `index = 0`. Later records use `value` like `0x04000030`, `0x04000040`, `0x06000040`, `0x07000080` with small indices (`1, 3, 5, 7, 10, 12`).
- The "first_json_brace" offset is a false positive. Around offset `12109`, bytes are repeating `{ 0x08` sequences, which decode as 16-bit values like `0x087b`, `0x087d`, `0x087e` rather than actual JSON text.
- A few zlib/deflate magic patterns appear (e.g., offsets 4064/8768/9696 in some dumps), but `zlib.decompress` tests on those offsets fail; likely false positives.
- `zstd_out_1769666284656.bin` ends with ~6084 zero bytes, suggesting padding to a fixed allocation size; other files have little or no trailing zero padding.
- `zstd_out_1769666284656.bin` size is exactly 24576 bytes, which matches common image-like layouts (e.g., 128x96x2, 256x48x2). Other dumps are not divisible by 2, so this may be a special case.
- Latest `se_dumps/latest` scan shows the same header shape (4 pointers + packed u64 fields like `0x0000000700000000`, `0x0000000001000034`) and low entropy (2.3–4.1) with no ASCII hits (see `analysis/zstd_out_latest_scan.md`, `analysis/zstd_out_u64_head.md`).
- Structured parse confirms a header layout: 4 x u64 pointers, then `d0`/`d1` u32 at 0x20/0x24, followed by a short record list from 0x28 where `value` is `0x01xxxxxx` and `idx` is small (mostly 0). Example: for `zstd_out_1769666284704.bin` we get 17 records with kinds `0x01` and `0x07` (see `analysis/zstd_out_struct_parse.md`).
- Early record table (0x28..0x340) shows per-file kind buckets and size ranges: some dumps use only `kind=0x01` with sequential sizes (0x34..0x3e or 0x62..0x7e), while others mix kinds `{0x04,0x05,0x06,0x07}` and occasional `kind=0x00` small counters. Index fields are small but not monotonic in any file. See `analysis/zstd_out_u32_early_table.md` and `analysis/zstd_out_record_kinds.md`.
- Heuristic section inference suggests the record table extends far beyond 0x340: end offsets cluster at 0x1020 (511 records) for three dumps, and shorter ends at 0x0c90 (397 records) and 0x0aa8 (336 records) for two others. See `analysis/zstd_out_section_inference.md`.
- Record-run scan across full files reveals multiple 8-byte record regions in some dumps: a primary run around 0x0020..0x10xx (500+ records) and a second run around 0x1820..0x2838 (≈515 records). Other dumps only show the primary run. This suggests multiple tables/sections rather than a single contiguous list. See `analysis/zstd_out_record_runs.md`.
- Run-compare confirms the second large run appears in two dumps (4656/4704) with very low overlap with the primary run (Jaccard ~0.01), implying different table semantics rather than a duplicate. A large tail run of mostly-zero records appears in one dump (4656), likely padding. See `analysis/zstd_out_run_compare.md`.

## Working hypothesis
`zstd_out_*.bin` looks like a decompressed in-memory struct rather than a serialized container. A plausible layout is:
`[4 x ptr][u32 flag][u32 count][table A of 8-byte records][table B of 8-byte records][u16 LUT/range table][optional payload][padding]`.
The `value` field in each 8-byte record likely packs a type/width in the high byte and a size/offset in the low word, while the `index` field is a logical id or table slot.

## Next parser steps
- Implement a small parser that reads the header (`4 x u64 + 2 x u32`) and then iterates 8-byte records while `value>>24` remains in a small set (e.g., `0x01`, `0x04`, `0x05`, `0x06`, `0x07`) and the index stays monotonic/small.
- Decode each `value` into `kind = value >> 24`, `size = value & 0xffff`, `mid = (value >> 16) & 0xff`; chart distributions across files to determine which fields are stable.
- Locate the 16-bit region by scanning for runs where every other byte is `0x08`; parse as `u16` and test for monotonic or repeating patterns.
- Compare inferred table sizes across files to test whether `d1` is a table count or section count, and whether trailing zeros indicate fixed-size segments.

## Cross-file stats (zstd_out)
- New cross-file scan shows 87.6% of bytes are identical across all zstd_out dumps (common length 2735), with many zero runs and constant u32s; suggests heavily structured/zero-padded buffer.
- Details: `analysis/zstd_out_cross_stats.md`.

## Offset entropy heatmap
- Most 0x40 blocks show uniq_avg ~= 1.0 and entropy ~= 0.0 from 0x0440 onward, indicating near-constant/padded regions across dumps.
- Variable region is concentrated in the first ~0x400 bytes (low entropy overall).
- Details: `analysis/zstd_out_offset_entropy.md`.

## Variable offsets
- 12.43% of bytes vary across dumps; variability concentrated in short runs, mainly early offsets.
- Two u32 offsets show contiguous small ranges across files: 0x24 (0x6..0x8) and 0x204 (0x0..0x2).
- Details: `analysis/zstd_out_variable_offsets.md` and `analysis/zstd_out_u32_seq_offsets.md`.
