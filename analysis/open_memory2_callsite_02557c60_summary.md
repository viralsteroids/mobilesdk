# archive_read_open_memory2 callsite (0x02557c60)

Source: `analysis/open_memory2_callsite_02557c60.txt`

## Callsite setup (decoded)
```
0x02557c48: LDR  X8, [X19,#0x40]
0x02557c50: LDP  X2, X9, [X19,#0x48]
0x02557c54: MOV  X0, X20
0x02557c58: ADD  X1, X8, X9
0x02557c5c: MOV  X3, X2
0x02557c60: BL   0x02767080  ; archive_read_open_memory2
```

## Inferred argument mapping
- `X0` = archive handle (`X20`)
- `X1` = buffer pointer (`*(X19+0x40)` + `*(X19+0x50)`)
- `X2` = buffer size (`*(X19+0x48)`)
- `X3` = read_size (set equal to `X2`)

Interpretation: `X19` points to a buffer descriptor with fields at `+0x40/+0x48/+0x50`. This call aligns with the 4?arg `archive_read_open_memory2(archive, buff, size, read_size)` signature.

## Note on earlier mapping
The call at `0x026eaf44` is **not** `archive_read_open_memory2`; with corrected PLT mapping (PLT0 size = 0x20), `0x02767070` resolves to `__open_2`. The only static BL to `archive_read_open_memory2` is at `0x02557c60`.
