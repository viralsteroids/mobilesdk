import struct
from pathlib import Path

path = Path(r"C:\temp\MobileSDK\analysis\libjnimultiengine.so")
if not path.exists():
    path = Path(r"C:\temp\MobileSDK\analysis\libjnimultiengine_current.so")
if not path.exists():
    path = Path(r"C:\temp\MobileSDK\SmartEngines_apktool\lib\arm64-v8a\libjnimultiengine.so")

data = path.read_bytes()

CONST = bytes.fromhex('76f6f2fb17591a73192c515d55b72060')
KEYS = {
    'v2.7.2': bytes.fromhex('a6d01f9528847cd118d154e96dd9fd2cd16f7a77'),
    'v3.2.0': bytes.fromhex('c2ac4db5c62062bb0d7554d55613991b059fee8a'),
    'v2.6.4': bytes.fromhex('3cb11e8c45e443f30057c9e6559c48cbd02c3c16'),
}
HEX42 = bytes.fromhex('2688f026b0f34dea31b377bfe5fd1f6ecf2b984810')

# parse ELF64 program headers to map file offset -> vaddr
phoff = struct.unpack_from('<Q', data, 0x20)[0]
phentsize = struct.unpack_from('<H', data, 0x36)[0]
phnum = struct.unpack_from('<H', data, 0x38)[0]
PT_LOAD = 1
segs = []
for i in range(phnum):
    off = phoff + i*phentsize
    p_type = struct.unpack_from('<I', data, off)[0]
    if p_type != PT_LOAD:
        continue
    p_offset = struct.unpack_from('<Q', data, off+8)[0]
    p_vaddr = struct.unpack_from('<Q', data, off+0x10)[0]
    p_filesz = struct.unpack_from('<Q', data, off+0x20)[0]
    p_flags = struct.unpack_from('<I', data, off+4)[0]
    segs.append((p_offset, p_vaddr, p_filesz, p_flags))


def map_vaddr(file_off):
    for p_offset, p_vaddr, p_filesz, _ in segs:
        if p_offset <= file_off < p_offset + p_filesz:
            return p_vaddr + (file_off - p_offset)
    return None


def find_all(needle):
    hits = []
    start = 0
    while True:
        idx = data.find(needle, start)
        if idx == -1:
            break
        hits.append(idx)
        start = idx + 1
    return hits

print(f"ELF: {path} size={len(data)}")
for name, needle in [("const", CONST), ("hex42", HEX42)]:
    hits = find_all(needle)
    print(f"{name} hits: {len(hits)}")
    for idx in hits[:20]:
        v = map_vaddr(idx)
        print(f"  file=0x{idx:x} vaddr={('0x%x'%v) if v else 'n/a'}")

for kname, key in KEYS.items():
    hits = find_all(key)
    print(f"key {kname} hits: {len(hits)}")
    for idx in hits[:20]:
        v = map_vaddr(idx)
        print(f"  file=0x{idx:x} vaddr={('0x%x'%v) if v else 'n/a'}")
