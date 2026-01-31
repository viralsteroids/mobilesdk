# open_memory2 callsite summary (static)

Sources:
- `analysis/open_memory2_window_disasm_v3.txt`
- `analysis/open_memory2_caller_window_v2.txt`
- `analysis/open_memory2_caller_window_wide.txt`
- `analysis/plt_symbol_map_v2.txt`
- `analysis/open_memory2_callsite_02557c60_summary.md`

## Correction (PLT mapping)
The earlier assumption that `0x026eaf44` calls `archive_read_open_memory2` was based on a PLT map that assumed a 0x10 PLT0 size. Disassembly shows PLT0 is 0x20 bytes, shifting symbol↔PLT entry mapping by one. With the corrected map (`analysis/plt_symbol_map_v2.txt`), `0x02767070` resolves to `__open_2`, and the only static BL to `archive_read_open_memory2` is at `0x02557c60` (see `analysis/open_memory2_callsite_02557c60_summary.md`).

## Observed callsite (0x026eaf44)
Within `FUN_026eaef0`:
- `X20 = X1` (function arg1)
- `X22 = X20 + 0x30`
- `X0 = X22`
- `W1 = 0x80000` (via `MOVZ W1, #0x8, LSL #16`)
- `X2` and `X3` are not modified in the function body before the call.
- Call: `BL 0x02767070` (resolved to `__open_2` with corrected PLT map).

Implication: the `__open_2` call at `0x026eaf44` receives:
- `X0 = arg1 + 0x30`
- `X1 = 0x80000`
- `X2 = arg2` (unchanged)
- `X3 = arg3` (unchanged)
- `X4..X7` pass through from the caller (no local assignments observed).

## Immediate caller (branch at 0x026eb448)
`FUN_026eb3b4` branches to `FUN_026eaef0` without BL (tail-call style). Just before the branch:
- `X0 = X21` (original X0 to `FUN_026eb3b4`)
- `X1 = X20` (original X2 to `FUN_026eb3b4`)
- `X2 = *(X19 + 0x8)` where `X19` was set to original X1
- `X3 = ~0` via `MOVN X3, #0x0`
- `X4..X7` are not set in the visible window, so they likely arrive as incoming args to `FUN_026eb3b4`.

This suggests the open_memory2 wrapper is called with:
- `X0 = orig X0`
- `X1 = orig X2`
- `X2 = *(orig X1 + 0x8)`
- `X3 = 0xFFFFFFFFFFFFFFFF`

Additional caller context (decoded window):
- `orig X1` looks like a file/buffer struct:
  - `[+0x0]` used as signed fd (bit31 check via `TBNZ W8,#31`).
  - `[+0x18]` is masked with `AND W8,#0xF000` and compared to `0x2000/0x6000/0x8000` to gate a `write` loop.
  - `[+0x8]` and `[+0x10]` are loaded together before `write` (via `LDP X2, X1, [X19,#0x8]`), matching `write(fd, buf, size)` ordering.
  - `[+0x2c]` gates a follow-up call (`fstat`-like via PLT 0x02766bd0).
Interpretation: `orig X2` appears to be a context struct (since `+0x30` is used to reach the archive handle), while `*(orig X1 + 0x8)` is a candidate size value (buffer length). The `0x80000` constant in `X1` at the callsite is still unresolved (could be a fixed read-size or limit); require Ghidra to resolve the exact `archive_read_open_memory2` signature and live registers.
