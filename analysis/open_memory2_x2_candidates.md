# open_memory2 X2 candidates

NOTE: With corrected PLT mapping (PLT0 size 0x20), the call at 0x026eaf44 targets __open_2 (PLT 0x02767070), not archive_read_open_memory2. The true open_memory2 callsite is 0x02557c60.

X2 ADRP/ADD targets near callsite; likely callback names or error strings.
- 0x026eae54+0x026eae58 -> 0x0024cdde : archive_read_set_switch_callback
- 0x026eae7c+0x026eae80 -> 0x0027eb7c : archive_read_set_seek_callback
- 0x026eaec0+0x026eaec4 -> 0x00271ca7 : No memory

Interpretation: X2 is loaded with libarchive callback name strings (e.g., archive_read_set_*), not bundle data.