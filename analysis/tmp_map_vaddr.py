from pathlib import Path
import struct

path = Path(r"C:\\temp\\MobileSDK\\SmartEngines_full\\lib\\arm64-v8a\\libjnimultiengine.so")
blob = path.read_bytes()

if blob[4] != 2:
    raise SystemExit('not ELF64')

(e_phoff,) = struct.unpack_from('<Q', blob, 0x20)
(e_phentsize,) = struct.unpack_from('<H', blob, 0x36)
(e_phnum,) = struct.unpack_from('<H', blob, 0x38)

vaddr = 0x004909cf
file_off = None
for i in range(e_phnum):
    off = e_phoff + i*e_phentsize
    p_type, p_flags = struct.unpack_from('<II', blob, off)
    if p_type != 1:
        continue
    p_offset, p_vaddr, p_paddr, p_filesz, p_memsz, p_align = struct.unpack_from('<QQQQQQ', blob, off+8)
    if p_vaddr <= vaddr < p_vaddr + p_memsz:
        delta = vaddr - p_vaddr
        if delta < p_filesz:
            file_off = p_offset + delta
        print(f"PT_LOAD hit: vaddr=0x{p_vaddr:x} off=0x{p_offset:x} filesz=0x{p_filesz:x} memsz=0x{p_memsz:x} -> file_off={file_off}")
        break

if file_off is None:
    print('vaddr not in file-backed segment or beyond filesz')
else:
    chunk = blob[file_off:file_off+0x80]
    print('bytes:', chunk.hex())
