# X2 write sequence near open_memory2

NOTE: With corrected PLT mapping (PLT0 size 0x20), the call at 0x026eaf44 targets __open_2 (PLT 0x02767070), not archive_read_open_memory2. The true open_memory2 callsite is 0x02557c60.

Window: 0x026eae44..0x026eaf44
- 0x026eae54: 0xd0fedb02 ADRP
- 0x026eae58: 0x91377842 ADD
- 0x026eae7c: 0x90fedca2 ADRP
- 0x026eae80: 0x912df042 ADD
- 0x026eaec0: 0xf0fedc22 ADRP
- 0x026eaec4: 0x91329c42 ADD