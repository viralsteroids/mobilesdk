# archive_read_open_filenames arg scan

Heuristic: locate ADRP/ADD for X2 before callsite and decode string at that address.

## callsite 0x02557c10
- X2 addr: 0x0020e3a1
- str: Can't allocate tar data

## callsite 0x026eaf94
- X2 addr: 0x0026bdda
- str: Can't stat '%s'

## callsite 0x026eb050
- X2 addr: 0x00271c42
- str: Unexpedted operation in archive_read_open_filename

## callsite 0x026eb074
- X2 addr: 0x002914f1
- str: Failed to open '%s'

## callsite 0x026eb14c
- X2 addr: 0x00271ca7
- str: No memory

## callsite 0x026eb1c8
- X2 addr: 0x002b052a
- str: Error reading stdin

## callsite 0x026eb1fc
- X2 addr: 0x00227154
- str: Error reading '%ls'

## callsite 0x026eb2e8
- X2 addr: 0x0020e38a
- str: Error seeking in stdin

## callsite 0x026eb31c
- X2 addr: 0x0028b5e4
- str: Error seeking in '%ls'

## callsite 0x026eb4b0
- X2 addr: 0x0020e38a
- str: Error seeking in stdin

## callsite 0x026eb4e4
- X2 addr: 0x0028b5e4
- str: Error seeking in '%ls'

## callsite 0x026eb778
- X2 addr: 0x00271ca7
- str: No memory

## callsite 0x026eb7b4
- X2 addr: 0x0025f2fe
- str: Failed to convert a wide-character filename to a multi-byte filename

## callsite 0x026eb958
- X2 addr: 0x00271ca7
- str: No memory

## callsite 0x026eb9d0
- X2 addr: 0x0024cdff
- str: No memory.

## callsite 0x026ebb94
- X2 addr: 0x0029798f
- str: Not enough slots for filter registration

## callsite 0x026ebe04
- X2 addr: 0x0023a307
- str: Can't allocate data for zstd decompression

## callsite 0x026ebfe0
- X2 addr: 0x00220cac
- str: Truncated zstd input

## callsite 0x026ec00c
- X2 addr: 0x002a3fb9
- str: Zstd decompression failed: %s

## callsite 0x026ec148
- X2 addr: 0x0020e3a1
- str: Can't allocate tar data

## callsite 0x026ec21c
- X2 addr: 0x0020e3a1
- str: Can't allocate tar data
