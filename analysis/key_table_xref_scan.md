# Key table ADRP+ADD xref scan

ELF: C:\temp\MobileSDK\analysis\libjnimultiengine.so

## Key table offsets
- file offset 0x3909cf -> vaddr 0x3909cf
- file offset 0x390920 -> vaddr 0x390920

## ADRP+ADD hits
| pc | rd | base | imm | target | file_offset |
| --- | --- | --- | --- | --- | --- |
| 0x26db7f8 | x23 | 0x390000 | 0x920 | 0x390920 | 0x390920 |
| 0x26dcfdc | x8 | 0x390000 | 0x9cf | 0x3909cf | 0x3909cf |
| 0x26dd008 | x8 | 0x390000 | 0x9cf | 0x3909cf | 0x3909cf |
| 0x26dd034 | x8 | 0x390000 | 0x9cf | 0x3909cf | 0x3909cf |
