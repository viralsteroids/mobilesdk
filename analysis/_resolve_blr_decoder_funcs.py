import struct
from pathlib import Path

lib_path = Path(r"C:\temp\MobileSDK\analysis\libjnimultiengine.so")
if not lib_path.exists():
    lib_path = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")

data = lib_path.read_bytes()

# ELF64 LE
if data[:4] != b'\x7fELF' or data[4] != 2 or data[5] != 1:
    print('Unsupported ELF')
    raise SystemExit(1)

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


def vaddr_to_offset(vaddr):
    for p_offset, p_vaddr, p_filesz, _ in segs:
        if p_vaddr <= vaddr < p_vaddr + p_filesz:
            return p_offset + (vaddr - p_vaddr)
    return None


def read_u64(vaddr):
    off = vaddr_to_offset(vaddr)
    if off is None or off + 8 > len(data):
        return None
    return struct.unpack('<Q', data[off:off+8])[0]


# AArch64 decode helpers

def decode_adrp(insn, pc):
    # returns (rd, addr) or None
    if (insn & 0x9f000000) != 0x90000000:
        return None
    rd = insn & 0x1f
    immlo = (insn >> 29) & 0x3
    immhi = (insn >> 5) & 0x7ffff
    imm = (immhi << 2) | immlo
    if imm & (1 << 20):
        imm -= 1 << 21
    page = (pc & ~0xfff) + (imm << 12)
    return rd, page


def decode_add_imm(insn):
    if (insn & 0x7f000000) != 0x91000000:
        return None
    rd = insn & 0x1f
    rn = (insn >> 5) & 0x1f
    imm12 = (insn >> 10) & 0xfff
    shift = (insn >> 22) & 0x3
    imm = imm12 << (12 if shift == 1 else 0)
    return rd, rn, imm


def decode_ldr_imm(insn):
    if (insn & 0xffc00000) != 0xf9400000:
        return None
    rt = insn & 0x1f
    rn = (insn >> 5) & 0x1f
    imm12 = (insn >> 10) & 0xfff
    imm = imm12 << 3
    return rt, rn, imm


def decode_ldr_lit(insn, pc):
    if (insn & 0xff000000) != 0x58000000:
        return None
    rt = insn & 0x1f
    imm19 = (insn >> 5) & 0x7ffff
    if imm19 & (1 << 18):
        imm19 -= 1 << 19
    addr = pc + (imm19 << 2)
    return rt, addr


def is_blr(insn):
    return (insn & 0xfffffc1f) == 0xd63f0000


def analyze_function(name, start, size):
    end = start + size
    off = vaddr_to_offset(start)
    if off is None:
        return [f'{name}: start vaddr 0x{start:x} not mapped']
    lines = []
    lines.append(f'{name} 0x{start:x}-0x{end:x}')
    for addr in range(start, end, 4):
        off = vaddr_to_offset(addr)
        if off is None or off + 4 > len(data):
            continue
        insn = struct.unpack('<I', data[off:off+4])[0]
        if not is_blr(insn):
            continue
        reg = (insn >> 5) & 0x1f
        resolved = None
        got_addr = None
        regval = {}
        for back in range(1, 41):
            a = addr - back * 4
            if a < start:
                break
            o = vaddr_to_offset(a)
            if o is None or o + 4 > len(data):
                continue
            ins = struct.unpack('<I', data[o:o+4])[0]
            pc = a
            adrp = decode_adrp(ins, pc)
            if adrp:
                rd, page = adrp
                regval[rd] = page
            addi = decode_add_imm(ins)
            if addi:
                rd, rn, imm = addi
                if rn in regval:
                    regval[rd] = regval[rn] + imm
            ldr = decode_ldr_imm(ins)
            if ldr:
                rt, rn, imm = ldr
                if rn in regval:
                    addr_mem = regval[rn] + imm
                    regval[rt] = addr_mem
            ldr_lit = decode_ldr_lit(ins, pc)
            if ldr_lit:
                rt, addr_mem = ldr_lit
                regval[rt] = addr_mem
            if reg in regval:
                got_addr = regval[reg]
                ptr = read_u64(got_addr)
                if ptr is not None and ptr != 0:
                    resolved = ptr
                break
        line = f'  BLR @0x{addr:x} x{reg}'
        if got_addr is not None:
            line += f' via 0x{got_addr:x}'
        if resolved is not None:
            line += f' -> 0x{resolved:x}'
        lines.append(line)
    return lines


FUNS = [
    ('FUN_02558a08', 0x02558a08, 0x1a4),
    ('FUN_02557a14', 0x02557a14, 0x7c),
    ('FUN_02557a90', 0x02557a90, 0xa98),
    ('FUN_026eaef0', 0x026eaef0, 0x2000),
]

out = []
for name, start, size in FUNS:
    out.extend(analyze_function(name, start, size))

Path(r"C:\temp\MobileSDK\analysis\blr_resolution_decoder_funcs.txt").write_text(
    '\n'.join(out), encoding='ascii', errors='ignore'
)
print(r"C:\temp\MobileSDK\analysis\blr_resolution_decoder_funcs.txt")
