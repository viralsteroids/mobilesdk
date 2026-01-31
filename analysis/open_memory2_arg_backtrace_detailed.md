# open_memory2 arg backtrace (detailed)

NOTE: With corrected PLT mapping (PLT0 size 0x20), the call at 0x026eaf44 targets __open_2 (PLT 0x02767070), not archive_read_open_memory2. The true open_memory2 callsite is 0x02557c60.

Function start: 0x026eaef0
Callsite: 0x026eaf44

## Symbolic expressions at callsite
- X0 = (X1 + 0x30)
- X1 = 0x80000
- X2 = X2
- X3 = X3

## Recent writes to X2/X3 (within 0x100 bytes)
- X2:
  - 0x026eae54: 0xd0fedb02 ADRP
  - 0x026eae58: 0x91377842 ADD
  - 0x026eae7c: 0x90fedca2 ADRP
  - 0x026eae80: 0x912df042 ADD
  - 0x026eaec0: 0xf0fedc22 ADRP
  - 0x026eaec4: 0x91329c42 ADD
- X3: none

## Interpretation
- The symbolic `X0 = (X1 + 0x30)` is based on last assignment to X1 *before* the callsite, but X1 is overwritten to `0x80000` right before the call. The earlier trace shows `X20 = original X1` at `0x026eaf0c` and then `X22 = X20 + 0x30`, `X0 = X22`.
- So treat `X0` as `arg1 + 0x30` (context pointer + offset), not `0x80000 + 0x30`.
- X2 is built from ADRP/ADD earlier in the function and should be recovered in Ghidra; X3 is likely passed through or set in a wider window.