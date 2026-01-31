import struct
from pathlib import Path
from elftools.elf.elffile import ELFFile

LIB = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
OUT = Path(r"C:\temp\MobileSDK\analysis\jni_create_stackframe.md")

TARGETS = {
    "TextEngine::Create(char*,bool)": 0x0114662c,
    "TextEngine::Create(uchar*,int,bool)": 0x011466b8,
}

SCAN_BYTES = 0x80


def vaddr_to_offset(elf, vaddr):
    for seg in elf.iter_segments():
        if seg['p_type'] != 'PT_LOAD':
            continue
        start = seg['p_vaddr']
        end = start + seg['p_memsz']
        if start <= vaddr < end:
            return seg['p_offset'] + (vaddr - start)
    return None


def sign_extend(value, bits):
    sign = 1 << (bits - 1)
    return (value ^ sign) - sign


def decode_stp_pre(word):
    # STP pre-index (64-bit): 0xA9800000 with Wn? use 0xA9800000 mask? For simplicity check bits.
    # STP Xn, Xm, [SP, #-imm]! : opc=10, imm7, base=31, writeback=1
    if (word & 0xFFC00000) == 0xA9800000:
        imm7 = (word >> 15) & 0x7F
        rn = (word >> 5) & 0x1F
        rt = word & 0x1F
        rt2 = (word >> 10) & 0x1F
        off = sign_extend(imm7, 7) * 8
        return ("stp_pre", rn, rt, rt2, off)
    return None


def decode_sub_sp(word):
    # SUB (immediate) 64-bit: 0xD1000000
    if (word & 0xFFC00000) == 0xD1000000:
        imm12 = (word >> 10) & 0xFFF
        shift = (word >> 22) & 0x3
        rn = (word >> 5) & 0x1F
        rd = word & 0x1F
        imm = imm12 << (12 if shift == 1 else 0)
        return ("sub", rd, rn, imm)
    return None


def decode_add_sp(word):
    if (word & 0xFFC00000) == 0x91000000:
        imm12 = (word >> 10) & 0xFFF
        shift = (word >> 22) & 0x3
        rn = (word >> 5) & 0x1F
        rd = word & 0x1F
        imm = imm12 << (12 if shift == 1 else 0)
        return ("add", rd, rn, imm)
    return None


with LIB.open('rb') as f:
    elf = ELFFile(f)
    out = [
        "# JNI Create stackframe probes", "",
        f"Library: {LIB}",
        f"Scan window: 0x{SCAN_BYTES:x} bytes",
        "",
    ]

    for name, vaddr in TARGETS.items():
        off = vaddr_to_offset(elf, vaddr)
        out.append(f"## {name} @ 0x{vaddr:08x}")
        if off is None:
            out.append("- ERROR: vaddr not in PT_LOAD")
            out.append("")
            continue
        f.seek(off)
        data = f.read(SCAN_BYTES)
        stp_pre = None
        sub_sp = None
        add_sp = None
        for i in range(0, len(data), 4):
            word = struct.unpack_from('<I', data, i)[0]
            pc = vaddr + i
            d1 = decode_stp_pre(word)
            if d1 and d1[1] == 31:  # base sp
                stp_pre = (pc, d1)
            d2 = decode_sub_sp(word)
            if d2 and d2[1] == 31 and d2[2] == 31:
                sub_sp = (pc, d2)
            d3 = decode_add_sp(word)
            if d3 and d3[1] == 31 and d3[2] == 31:
                add_sp = (pc, d3)

        if stp_pre:
            pc, (_, rn, rt, rt2, offimm) = stp_pre
            out.append(f"- STP pre-index at 0x{pc:08x}: off={offimm} (saves x{rt}/x{rt2})")
        else:
            out.append("- STP pre-index (sp) not found in first window")
        if sub_sp:
            pc, (_, rd, rn, imm) = sub_sp
            out.append(f"- SUB sp, sp, 0x{imm:x} at 0x{pc:08x}")
        else:
            out.append("- SUB sp, sp, imm not found in first window")
        if add_sp:
            pc, (_, rd, rn, imm) = add_sp
            out.append(f"- ADD sp, sp, 0x{imm:x} at 0x{pc:08x}")
        out.append("")

OUT.write_text("\n".join(out), encoding="utf-8")
print(f"Wrote {OUT}")
