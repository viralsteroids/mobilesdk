from pathlib import Path
lib = Path(r"C:\temp\MobileSDK\analysis\libjnimultiengine.so")
if not lib.exists():
    lib = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
data = lib.read_bytes()
# parse ELF64 program headers
import struct
if data[:4] != b'\x7fELF' or data[4] != 2 or data[5] != 1:
    raise SystemExit('Unsupported ELF')
phoff = struct.unpack('<Q', data[0x20:0x28])[0]
phentsize = struct.unpack('<H', data[0x36:0x38])[0]
phnum = struct.unpack('<H', data[0x38:0x3a])[0]
segs = []
for i in range(phnum):
    off = phoff + i*phentsize
    p_type = struct.unpack('<I', data[off:off+4])[0]
    if p_type != 1:
        continue
    p_flags = struct.unpack('<I', data[off+4:off+8])[0]
    p_offset = struct.unpack('<Q', data[off+0x08:off+0x10])[0]
    p_vaddr = struct.unpack('<Q', data[off+0x10:off+0x18])[0]
    p_filesz = struct.unpack('<Q', data[off+0x20:off+0x28])[0]
    segs.append((p_offset, p_vaddr, p_filesz, p_flags))

def vaddr_to_offset(vaddr):
    for p_offset, p_vaddr, p_filesz, p_flags in segs:
        if p_vaddr <= vaddr < p_vaddr + p_filesz:
            return p_offset + (vaddr - p_vaddr)
    return None

addrs = {
    'TextEngineImpl::InitFromOwnedZipBuffer': 0x0126c380,
    'FUN_02558a08': 0x02558a08,
    'FUN_02557a14': 0x02557a14,
    'FUN_02557a90': 0x02557a90,
    'FUN_026eaef0': 0x026eaef0,
}

out_lines = []
for name, vaddr in addrs.items():
    off = vaddr_to_offset(vaddr)
    if off is None:
        out_lines.append(f'{name} @ 0x{vaddr:x} -> offset N/A')
        continue
    bytes8 = data[off:off+8]
    out_lines.append(f'{name} @ 0x{vaddr:x} -> file+0x{off:x} bytes={bytes8.hex()}')

Path(r"C:\temp\MobileSDK\analysis\decoder_chain_offsets.md").write_text("\n".join(out_lines), encoding='ascii', errors='ignore')
print(r"C:\temp\MobileSDK\analysis\decoder_chain_offsets.md")
