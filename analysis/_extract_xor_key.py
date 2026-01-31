#!/usr/bin/env python3
"""Extract XOR key from libjnimultiengine.so"""
import struct

SO_PATH = r"C:\temp\MobileSDK\SmartEngines_apktool\lib\arm64-v8a\libjnimultiengine.so"
KEY_VADDR = 0x004909cf
KEY_SIZE = 0x80

def vaddr_to_offset(elf_bytes, vaddr):
    """Convert virtual address to file offset"""
    e_phoff = struct.unpack_from('<Q', elf_bytes, 0x20)[0]
    e_phentsize = struct.unpack_from('<H', elf_bytes, 0x36)[0]
    e_phnum = struct.unpack_from('<H', elf_bytes, 0x38)[0]

    print(f"ELF program header: offset=0x{e_phoff:x}, entry_size={e_phentsize}, count={e_phnum}")

    for i in range(e_phnum):
        off = e_phoff + i * e_phentsize
        p_type, p_flags = struct.unpack_from('<II', elf_bytes, off)
        if p_type != 1:  # PT_LOAD
            continue
        p_offset, p_vaddr, p_paddr, p_filesz, p_memsz, p_align = struct.unpack_from('<QQQQQQ', elf_bytes, off + 8)

        print(f"  LOAD segment {i}: vaddr=0x{p_vaddr:x}, offset=0x{p_offset:x}, filesz=0x{p_filesz:x}, memsz=0x{p_memsz:x}")

        if p_vaddr <= vaddr < p_vaddr + p_memsz:
            delta = vaddr - p_vaddr
            if delta < p_filesz:
                file_offset = p_offset + delta
                print(f"  -> Found in segment! vaddr 0x{vaddr:x} -> file offset 0x{file_offset:x}")
                return file_offset
            else:
                print(f"  -> vaddr in BSS (uninitialized data)")
                return None
    return None

# Load SO file
with open(SO_PATH, 'rb') as f:
    data = f.read()

print(f"SO file size: {len(data):,} bytes")
print(f"Looking for key at vaddr 0x{KEY_VADDR:x}")
print()

# Check ELF header
if data[:4] != b'\x7fELF':
    print("ERROR: Not an ELF file!")
    exit(1)

if data[4] != 2:
    print("ERROR: Not 64-bit ELF!")
    exit(1)

print("ELF64 file detected")
print()

# Get file offset
offset = vaddr_to_offset(data, KEY_VADDR)

if offset is None:
    print("ERROR: Could not find vaddr in any LOAD segment")
    exit(1)

# Extract key
key = data[offset:offset + KEY_SIZE]
print(f"\nExtracted key from offset 0x{offset:x}:")
for i in range(0, KEY_SIZE, 16):
    hex_part = ' '.join(f'{b:02x}' for b in key[i:i+16])
    ascii_part = ''.join(chr(b) if 32 <= b < 127 else '.' for b in key[i:i+16])
    print(f"  {i:04x}: {hex_part}  {ascii_part}")

# Check if key is all zeros
if all(b == 0 for b in key):
    print("\nWARNING: Key is all zeros!")
    print("The key might be in a different location or computed at runtime.")

    # Try to search for non-zero patterns near this address
    print("\nSearching for non-zero data near this address...")
    for search_offset in [offset - 0x100, offset, offset + 0x100]:
        if 0 <= search_offset < len(data) - KEY_SIZE:
            chunk = data[search_offset:search_offset + KEY_SIZE]
            non_zero = sum(1 for b in chunk if b != 0)
            if non_zero > 0:
                print(f"  Offset 0x{search_offset:x}: {non_zero} non-zero bytes")
                print(f"    First 32 bytes: {chunk[:32].hex()}")

# Also check the section headers for .rodata, .data
print("\n=== Checking section headers ===")
e_shoff = struct.unpack_from('<Q', data, 0x28)[0]
e_shentsize = struct.unpack_from('<H', data, 0x3a)[0]
e_shnum = struct.unpack_from('<H', data, 0x3c)[0]
e_shstrndx = struct.unpack_from('<H', data, 0x3e)[0]

print(f"Section headers: offset=0x{e_shoff:x}, entry_size={e_shentsize}, count={e_shnum}")

# Get string table for section names
if e_shstrndx < e_shnum:
    sh_strtab_off = e_shoff + e_shstrndx * e_shentsize
    strtab_off = struct.unpack_from('<Q', data, sh_strtab_off + 0x18)[0]

    for i in range(min(e_shnum, 30)):
        sh_off = e_shoff + i * e_shentsize
        sh_name_idx = struct.unpack_from('<I', data, sh_off)[0]
        sh_type = struct.unpack_from('<I', data, sh_off + 4)[0]
        sh_addr = struct.unpack_from('<Q', data, sh_off + 0x10)[0]
        sh_offset = struct.unpack_from('<Q', data, sh_off + 0x18)[0]
        sh_size = struct.unpack_from('<Q', data, sh_off + 0x20)[0]

        # Get section name
        name_end = data.find(b'\x00', strtab_off + sh_name_idx)
        name = data[strtab_off + sh_name_idx:name_end].decode('ascii', 'ignore') if name_end > strtab_off + sh_name_idx else f"<{i}>"

        if sh_addr <= KEY_VADDR < sh_addr + sh_size:
            print(f"  SECTION {i}: {name} vaddr=0x{sh_addr:x} offset=0x{sh_offset:x} size=0x{sh_size:x} <- KEY IS HERE")
        elif name in ['.rodata', '.data', '.bss']:
            print(f"  SECTION {i}: {name} vaddr=0x{sh_addr:x} offset=0x{sh_offset:x} size=0x{sh_size:x}")

# Save key to file if non-zero
if not all(b == 0 for b in key):
    key_path = r"C:\temp\MobileSDK\analysis\extracted_key_from_so.bin"
    with open(key_path, 'wb') as f:
        f.write(key)
    print(f"\nKey saved to: {key_path}")
