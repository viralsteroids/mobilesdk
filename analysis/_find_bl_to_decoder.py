import struct
from pathlib import Path

lib = Path(r"C:\temp\MobileSDK\analysis\libjnimultiengine.so")
if not lib.exists():
    lib = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")

TARGETS = {
    0x02558a08: "FUN_02558a08",
    0x02557a14: "FUN_02557a14",
    0x02557a90: "FUN_02557a90",
    0x026eaef0: "FUN_026eaef0",
}

# ELF64 LE program headers
raw = lib.read_bytes()
if raw[:4] != b'\x7fELF' or raw[4] != 2 or raw[5] != 1:
    raise SystemExit('Unsupported ELF')
phoff = struct.unpack('<Q', raw[0x20:0x28])[0]
phentsize = struct.unpack('<H', raw[0x36:0x38])[0]
phnum = struct.unpack('<H', raw[0x38:0x3a])[0]
segs = []
for i in range(phnum):
    off = phoff + i * phentsize
    p_type = struct.unpack('<I', raw[off:off+4])[0]
    if p_type != 1:
        continue
    p_flags = struct.unpack('<I', raw[off+4:off+8])[0]
    p_offset = struct.unpack('<Q', raw[off+0x08:off+0x10])[0]
    p_vaddr = struct.unpack('<Q', raw[off+0x10:off+0x18])[0]
    p_filesz = struct.unpack('<Q', raw[off+0x20:off+0x28])[0]
    segs.append((p_offset, p_vaddr, p_filesz, p_flags))

callers = {t: [] for t in TARGETS}

for p_offset, p_vaddr, p_filesz, p_flags in segs:
    if not (p_flags & 1):
        continue
    seg = raw[p_offset:p_offset+p_filesz]
    for i in range(0, len(seg) - 4, 4):
        insn = struct.unpack('<I', seg[i:i+4])[0]
        if (insn & 0xfc000000) != 0x94000000:  # BL
            continue
        imm26 = insn & 0x03ffffff
        if imm26 & 0x02000000:
            imm26 -= 0x04000000
        target = (p_vaddr + i) + imm26 * 4
        if target in TARGETS:
            callers[target].append(p_vaddr + i)

out = []
out.append('# Decoder chain callers (BL xrefs)')
for target, name in TARGETS.items():
    xs = callers[target]
    out.append(f"\n## {name} @ 0x{target:x}")
    if not xs:
        out.append('- (no direct BL callsites found)')
        continue
    for x in xs:
        out.append(f"- callsite 0x{x:x}")

Path(r"C:\temp\MobileSDK\analysis\decoder_chain_callers.md").write_text("\n".join(out), encoding='ascii', errors='ignore')
print(r"C:\temp\MobileSDK\analysis\decoder_chain_callers.md")
