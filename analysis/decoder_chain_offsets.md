# Decoder chain offsets (ELF vaddr -> file offsets)

These offsets let you jump to the exact functions in a hex viewer or Ghidra
when the memory map is incorrect.

```
TextEngineImpl::InitFromOwnedZipBuffer @ 0x0126c380 -> file+0x126c380
FUN_02558a08 @ 0x02558a08 -> file+0x2558a08
FUN_02557a14 @ 0x02557a14 -> file+0x2557a14
FUN_02557a90 @ 0x02557a90 -> file+0x2557a90
FUN_026eaef0 @ 0x026eaef0 -> file+0x26eaef0
```

(Computed from PT_LOAD segments.)
