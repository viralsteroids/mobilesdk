import struct
from pathlib import Path
from elftools.elf.elffile import ELFFile

LIB = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
OUT = Path(r"C:\temp\MobileSDK\analysis\jni_create_blr_backtrace.md")

TARGETS = {
    "TextEngine::Create(char*,bool)": 0x0114662c,
    "TextEngine::Create(uchar*,int,bool)": 0x011466b8,
}

SCAN_BYTES = 0x2000
BACKTRACK_INSNS = 24

REG_NAMES = [f"x{i}" for i in range(31)] + ["xzr"]


def reg_name(idx, for_base=False):
    if for_base and idx == 31:
        return "sp"
    if idx < len(REG_NAMES):
        return REG_NAMES[idx]
    return f"x{idx}"


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


def decode_ldr_imm(word):
    # LDR (unsigned immediate) 64-bit
    if (word & 0xFFC00000) == 0xF9400000:
        imm12 = (word >> 10) & 0xFFF
        rn = (word >> 5) & 0x1F
        rt = word & 0x1F
        return {"kind": "ldr_imm64", "rn": rn, "rt": rt, "offset": imm12 * 8}
    # LDR (unsigned immediate) 32-bit
    if (word & 0xFFC00000) == 0xB9400000:
        imm12 = (word >> 10) & 0xFFF
        rn = (word >> 5) & 0x1F
        rt = word & 0x1F
        return {"kind": "ldr_imm32", "rn": rn, "rt": rt, "offset": imm12 * 4}
    return None


def decode_ldr_literal(word, pc):
    if (word & 0xFF000000) == 0x58000000 or (word & 0xFF000000) == 0x18000000:
        imm19 = (word >> 5) & 0x7FFFF
        rt = word & 0x1F
        off = sign_extend(imm19, 19) << 2
        return {"kind": "ldr_literal", "rt": rt, "target": pc + off}
    return None


def decode_mov_reg(word):
    # MOV Xd, Xm (alias of ORR Xd, XZR, Xm)
    if (word & 0xFFE0FC00) == 0xAA0003E0:
        rd = word & 0x1F
        rn = (word >> 5) & 0x1F
        rm = (word >> 16) & 0x1F
        if rn == 31:
            return {"kind": "mov", "rd": rd, "rm": rm}
    return None


def decode_blr(word):
    if (word & 0xFFFFFC1F) == 0xD63F0000:
        rn = (word >> 5) & 0x1F
        return rn
    return None


with LIB.open('rb') as f:
    elf = ELFFile(f)
    out_lines = [
        "# JNI Create BLR backtrace (heuristic)",
        "",
        f"Library: {LIB}",
        f"Scan window: 0x{SCAN_BYTES:x} bytes",
        f"Backtrack: {BACKTRACK_INSNS} instructions",
        "",
    ]

    for name, vaddr in TARGETS.items():
        off = vaddr_to_offset(elf, vaddr)
        out_lines.append(f"## {name} @ 0x{vaddr:08x}")
        if off is None:
            out_lines.append("- ERROR: vaddr not in PT_LOAD")
            out_lines.append("")
            continue
        f.seek(off)
        data = f.read(SCAN_BYTES)
        blr_sites = []
        for i in range(0, len(data), 4):
            word = struct.unpack_from('<I', data, i)[0]
            rn = decode_blr(word)
            if rn is None:
                continue
            call_vaddr = vaddr + i
            last = None
            prev = None
            for j in range(1, BACKTRACK_INSNS + 1):
                idx = i - j * 4
                if idx < 0:
                    break
                wprev = struct.unpack_from('<I', data, idx)[0]
                pc = vaddr + idx
                di = decode_ldr_imm(wprev)
                if di and di["rt"] == rn:
                    last = ("imm", pc, di)
                    if di["rn"] == rn:
                        continue
                    break
                dl = decode_ldr_literal(wprev, pc)
                if dl and dl["rt"] == rn:
                    last = ("lit", pc, dl)
                    break
                dm = decode_mov_reg(wprev)
                if dm and dm["rd"] == rn:
                    last = ("mov", pc, dm)
                    break

            if last and last[0] == "imm" and last[2]["rn"] == rn:
                for j in range(1, BACKTRACK_INSNS * 2 + 1):
                    idx = i - j * 4
                    if idx < 0:
                        break
                    wprev = struct.unpack_from('<I', data, idx)[0]
                    pc = vaddr + idx
                    di = decode_ldr_imm(wprev)
                    if di and di["rt"] == rn and di["rn"] != rn:
                        prev = ("imm", pc, di)
                        break
                    dl = decode_ldr_literal(wprev, pc)
                    if dl and dl["rt"] == rn:
                        prev = ("lit", pc, dl)
                        break
                    dm = decode_mov_reg(wprev)
                    if dm and dm["rd"] == rn:
                        prev = ("mov", pc, dm)
                        break

            blr_sites.append((call_vaddr, rn, last, prev))

        out_lines.append(f"- BLR sites: {len(blr_sites)}")
        for call_vaddr, rn, last, prev in blr_sites:
            reg = reg_name(rn)
            if last is None:
                out_lines.append(f"  - blr {reg} @ 0x{call_vaddr:08x}: no recent write found")
                continue
            kind, pc, info = last
            detail = ""
            if kind == "imm":
                base = reg_name(info["rn"], for_base=True)
                off = info["offset"]
                detail = f"ldr_imm from [{base}+0x{off:x}] @ 0x{pc:08x}"
            elif kind == "lit":
                detail = f"ldr_literal -> 0x{info['target']:08x} @ 0x{pc:08x}"
            else:
                detail = f"mov {reg_name(info['rm'])} -> {reg_name(info['rd'])} @ 0x{pc:08x}"

            if prev:
                pkind, ppc, pinfo = prev
                if pkind == "imm":
                    pbase = reg_name(pinfo["rn"], for_base=True)
                    poff = pinfo["offset"]
                    detail += f" | prev: ldr_imm from [{pbase}+0x{poff:x}] @ 0x{ppc:08x}"
                elif pkind == "lit":
                    detail += f" | prev: ldr_literal -> 0x{pinfo['target']:08x} @ 0x{ppc:08x}"
                else:
                    detail += f" | prev: mov {reg_name(pinfo['rm'])} -> {reg_name(pinfo['rd'])} @ 0x{ppc:08x}"

            out_lines.append(f"  - blr {reg} @ 0x{call_vaddr:08x}: {detail}")
        out_lines.append("")

OUT.write_text("\n".join(out_lines), encoding="utf-8")
print(f"Wrote {OUT}")
