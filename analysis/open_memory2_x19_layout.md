# X19 buffer descriptor layout (inferred from 0x02557a90..0x02558000)

Sources:
- `analysis/open_memory2_02557a90_window.txt`
- `analysis/open_memory2_x19_field_refs.txt`
- `analysis/open_memory2_callsite_02557c60_summary.md`

## Observed X19 field accesses
Offsets used in this function:
- `+0x08` (LDR) : referenced at 0x02557bc8 and 0x02557c34 (bit/flag checks around file-size logic)
- `+0x10` (LDR) : referenced at 0x02557bdc (used to build local buffer pointer)
- `+0x40` (LDR) : referenced at 0x02557c48 (buffer base)
- `+0x48` (LDP) : referenced at 0x02557c50 (size + offset; LDP loads X2 and X9)
- `+0x58` (LDR) : referenced at 0x02557f64 (control value; CBZ gate)
- `+0x60` (LDR) : referenced at 0x02557f0c (loaded into X28)

## open_memory2 callsite (0x02557c60)
```
0x02557c48: LDR  X8, [X19,#0x40]
0x02557c50: LDP  X2, X9, [X19,#0x48]
0x02557c58: ADD  X1, X8, X9     ; buffer = base + offset
0x02557c5c: MOV  X3, X2         ; read_size = size
0x02557c60: BL   0x02767080     ; archive_read_open_memory2
```
Inferred:
- `X19+0x40` = base pointer
- `X19+0x48` = size (X2)
- `X19+0x50` = offset (X9)
- computed buffer pointer = base + offset

## Hypothesized layout (partial)
```
struct BufDesc {
  ...
  u64 field_08;   // flags/size gating in file-logic
  u64 field_10;   // pointer used in buffer setup
  ...
  u64 base;       // +0x40
  u64 size;       // +0x48
  u64 offset;     // +0x50
  u64 field_58;   // gating value
  u64 field_60;   // pointer or size
}
```

This descriptor likely belongs to the libarchive wrapper path. The base/size/offset triplet feeds `archive_read_open_memory2` directly, making it a prime target for tracing the decrypted bundle buffer in Ghidra.
