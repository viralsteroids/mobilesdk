# open_memory2 arg trace

NOTE: With corrected PLT mapping (PLT0 size 0x20), the call at 0x026eaf44 targets __open_2 (PLT 0x02767070), not archive_read_open_memory2. The true open_memory2 callsite is 0x02557c60.

Function start: 0x026eaef0
Callsite: 0x026eaf44

## Register state at callsite
- X0: unknown
- X1: 0x00080000
- X2: unknown
- X3: unknown

## Trace log
- 0x026eaf04: 0x910243fd ADD X29=X31+0x90
- 0x026eaf0c: 0xaa0103f4 MOV X20=X1 (unknown)
- 0x026eaf34: 0x9100c296 ADD X22=X20+0x30
- 0x026eaf38: 0xaa0003f5 MOV X21=X0 (unknown)
- 0x026eaf3c: 0x52a00101 MOVZ W1=0x80000
- 0x026eaf40: 0xaa1603e0 MOV X0=X22 (unknown)

## Inference
- X20 captures incoming arg1 (original X1) at function entry.
- X22 = X20 + 0x30 and X0 = X22 just before the callsite, suggesting
  the archive handle is a field at offset +0x30 inside the caller-provided
  context struct passed as argument 1 to 0x026eaef0.
- X1 is set to 0x80000 at the callsite (likely buffer size or flags).
- X2/X3 are set earlier in the function and need manual Ghidra tracing.