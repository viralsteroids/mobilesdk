import struct
from pathlib import Path

lib_path = Path(r"C:\temp\MobileSDK\analysis\libjnimultiengine.so")
if not lib_path.exists():
    lib_path = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")

data = lib_path.read_bytes()
if data[:4] != b"\x7fELF" or data[4] != 2 or data[5] != 1:
    raise SystemExit('Unsupported ELF')

phoff = struct.unpack('<Q', data[0x20:0x28])[0]
phentsize = struct.unpack('<H', data[0x36:0x38])[0]
phnum = struct.unpack('<H', data[0x38:0x3a])[0]

segs = []
for i in range(phnum):
    off = phoff + i * phentsize
    p_type = struct.unpack('<I', data[off:off+4])[0]
    if p_type != 1:
        continue
    p_flags = struct.unpack('<I', data[off+4:off+8])[0]
    p_offset = struct.unpack('<Q', data[off+0x08:off+0x10])[0]
    p_vaddr = struct.unpack('<Q', data[off+0x10:off+0x18])[0]
    p_filesz = struct.unpack('<Q', data[off+0x20:off+0x28])[0]
    segs.append((p_offset, p_vaddr, p_filesz, p_flags))

TARGETS = {
    0x02557a90: "FUN_02557a90",
    0x02557a14: "FUN_02557a14",
    0x02558a08: "FUN_02558a08",
    0x026eaef0: "FUN_026eaef0",
    0x026ebadc: "archive_read_support_filter_zstd",
    0x026f34b4: "archive_read_support_format_zip_seekable",
    0x271085c: "ZSTD_decompressStream_simpleArgs",
}

callers = {k: [] for k in TARGETS}

for p_offset, p_vaddr, p_filesz, p_flags in segs:
    if not (p_flags & 1):
        continue
    seg = data[p_offset:p_offset+p_filesz]
    for i in range(0, len(seg) - 4, 4):
        insn = struct.unpack('<I', seg[i:i+4])[0]
        if (insn & 0xFC000000) != 0x94000000:
            continue
        imm26 = insn & 0x03FFFFFF
        if imm26 & 0x02000000:
            imm26 -= 0x04000000
        pc = p_vaddr + i
        target = pc + imm26 * 4
        if target in TARGETS:
            callers[target].append(pc)

lines = []
lines.append('# BL xrefs to decoder/decoder-adjacent targets')
for target, name in TARGETS.items():
    lines.append(f"\n## {name} @ 0x{target:x}")
    xs = callers[target]
    if not xs:
        lines.append('- (no direct BL callsites found)')
    else:
        for x in xs:
            lines.append(f"- callsite 0x{x:x}")

Path(r"C:\temp\MobileSDK\analysis\decoder_chain_bl_xrefs.md").write_text("\n".join(lines), encoding='ascii', errors='ignore')
print(r"C:\temp\MobileSDK\analysis\decoder_chain_bl_xrefs.md")
