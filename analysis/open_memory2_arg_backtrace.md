# open_memory2 arg backtrace

NOTE: With corrected PLT mapping (PLT0 size 0x20), the call at 0x026eaf44 targets __open_2 (PLT 0x02767070), not archive_read_open_memory2. The true open_memory2 callsite is 0x02557c60.

Function start: 0x026eaef0
Callsite: 0x026eaf44

## Backtrace (naive)
- X0: MOV from X22 at 0x026eaf40 -> X22: ADD X20+0x30 at 0x026eaf34 -> X20: MOV from X1 at 0x026eaf0c
- X1: MOVZ imm 0x80000 at 0x026eaf3c
- X2: <unknown>
- X3: <unknown>

## Interpretation
- The MOV `X20 = X1` occurs **before** `W1` is overwritten to 0x80000, so X20 likely holds the original argument 1 passed into `0x026eaef0` (context pointer).
- X22 = X20 + 0x30, and `X0 = X22` just before the call, so the archive handle is likely stored at offset +0x30 inside that context struct.
- X1 is set to 0x80000 immediately before the call (likely size/flags).
- X2/X3 are set earlier and require manual Ghidra tracing.