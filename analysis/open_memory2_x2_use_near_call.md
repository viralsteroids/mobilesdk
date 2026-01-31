# X2 usage near open_memory2

NOTE: With corrected PLT mapping (PLT0 size 0x20), the call at 0x026eaf44 targets __open_2 (PLT 0x02767070), not archive_read_open_memory2. The true open_memory2 callsite is 0x02557c60.

Window: 0x026eae44..0x026eaf44
- 0x026eae54: 0xd0fedb02 (rd=2, rn=24, rm=30)
- 0x026eae58: 0x91377842 (rd=2, rn=2, rm=23)
- 0x026eae7c: 0x90fedca2 (rd=2, rn=5, rm=30)
- 0x026eae80: 0x912df042 (rd=2, rn=2, rm=13)
- 0x026eaeb4: 0xa9425ff8 (rd=24, rn=31, rm=2)
- 0x026eaebc: 0x1401f055 (rd=21, rn=2, rm=1)
- 0x026eaec0: 0xf0fedc22 (rd=2, rn=1, rm=30)
- 0x026eaec4: 0x91329c42 (rd=2, rn=2, rm=18)
- 0x026eaed0: 0x9401f058 (rd=24, rn=2, rm=1)
- 0x026eaee4: 0xa9425ff8 (rd=24, rn=31, rm=2)
- 0x026eaf04: 0x910243fd (rd=29, rn=31, rm=2)
- 0x026eaf08: 0xd53bd057 (rd=23, rn=2, rm=27)
- 0x026eaf44: 0x9401f04b (rd=11, rn=2, rm=1)

Note: This scan only shows raw register fields; some entries are false positives due to generic rd/rn/rm extraction.
Use Ghidra to confirm the last live X2 assignment before 0x026eaf44.