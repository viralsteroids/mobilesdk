import struct
from pathlib import Path
from elftools.elf.elffile import ELFFile

LIB = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
OUT = Path(r"C:\temp\MobileSDK\analysis\jni_create_blr_vtable_sources.md")

TARGETS = {
    "TextEngine::Create(char*,bool)": 0x0114662c,
    "TextEngine::Create(uchar*,int,bool)": 0x011466b8,
}

SCAN_BYTES = 0x2000
BACKTRACK_INSNS = 60

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
    if (word & 0xFFC00000) == 0xF9400000:
        imm12 = (word >> 10) & 0xFFF
        rn = (word >> 5) & 0x1F
        rt = word & 0x1F
        return {"kind": "ldr_imm64", "rn": rn, "rt": rt, "offset": imm12 * 8}
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
    if (word & 0xFFE0FC00) == 0xAA0003E0:
        rd = word & 0x1F
        rn = (word >> 5) & 0x1F
        rm = (word >> 16) & 0x1F
        if rn == 31:
            return {"kind": "mov", "rd": rd, "rm": rm}
    return None


def decode_add_imm(word):
    if (word & 0xFFC00000) == 0x91000000:
        imm12 = (word >> 10) & 0xFFF
        shift = (word >> 22) & 0x3
        rn = (word >> 5) & 0x1F
        rd = word & 0x1F
        imm = imm12 << (12 if shift == 1 else 0)
        return {"kind": "add_imm", "rn": rn, "rd": rd, "imm": imm}
    return None


def decode_blr(word):
    if (word & 0xFFFFFC1F) == 0xD63F0000:
        rn = (word >> 5) & 0x1F
        return rn
    return None


def find_last_write(data, base_vaddr, idx, reg):
    for j in range(1, BACKTRACK_INSNS + 1):
        pos = idx - j * 4
        if pos < 0:
            break
        word = struct.unpack_from('<I', data, pos)[0]
        pc = base_vaddr + pos
        di = decode_ldr_imm(word)
        if di and di["rt"] == reg:
            return ("ldr_imm", pc, di)
        dl = decode_ldr_literal(word, pc)
        if dl and dl["rt"] == reg:
            return ("ldr_literal", pc, dl)
        dm = decode_mov_reg(word)
        if dm and dm["rd"] == reg:
            return ("mov", pc, dm)
        da = decode_add_imm(word)
        if da and da["rd"] == reg:
            return ("add_imm", pc, da)
    return None


def find_prev_nonself_ldr(data, base_vaddr, idx, reg):
    # find last write to reg ignoring self-referential ldr reg, [reg+off]
    for j in range(1, BACKTRACK_INSNS + 1):
        pos = idx - j * 4
        if pos < 0:
            break
        word = struct.unpack_from('<I', data, pos)[0]
        pc = base_vaddr + pos
        di = decode_ldr_imm(word)
        if di and di["rt"] == reg:
            if di["rn"] == reg:
                # skip self
                continue
            return ("ldr_imm", pc, di)
        dl = decode_ldr_literal(word, pc)
        if dl and dl["rt"] == reg:
            return ("ldr_literal", pc, dl)
        dm = decode_mov_reg(word)
        if dm and dm["rd"] == reg:
            return ("mov", pc, dm)
        da = decode_add_imm(word)
        if da and da["rd"] == reg:
            return ("add_imm", pc, da)
    return None


with LIB.open('rb') as f:
    elf = ELFFile(f)
    out = [
        "# JNI Create BLR vtable source tracing (heuristic)",
        "",
        f"Library: {LIB}",
        f"Scan window: 0x{SCAN_BYTES:x} bytes",
        f"Backtrack: {BACKTRACK_INSNS} instructions",
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

        for i in range(0, len(data), 4):
            word = struct.unpack_from('<I', data, i)[0]
            rn = decode_blr(word)
            if rn is None:
                continue
            call_vaddr = vaddr + i
            last_any = find_last_write(data, vaddr, i, rn)
            prev_nonself = find_prev_nonself_ldr(data, vaddr, i, rn)

            out.append(f"- blr {reg_name(rn)} @ 0x{call_vaddr:08x}")
            if last_any:
                kind, pc, info = last_any
                if kind == "ldr_imm":
                    out.append(f"  - last write: ldr {reg_name(info['rt'])}, [{reg_name(info['rn'], True)}+0x{info['offset']:x}] @ 0x{pc:08x}")
                elif kind == "ldr_literal":
                    out.append(f"  - last write: ldr_literal {reg_name(info['rt'])}, 0x{info['target']:08x} @ 0x{pc:08x}")
                elif kind == "mov":
                    out.append(f"  - last write: mov {reg_name(info['rd'])}, {reg_name(info['rm'])} @ 0x{pc:08x}")
                else:
                    out.append(f"  - last write: add {reg_name(info['rd'])}, {reg_name(info['rn'])}, 0x{info['imm']:x} @ 0x{pc:08x}")
            else:
                out.append("  - last write: not found")

            if prev_nonself:
                kind, pc, info = prev_nonself
                if kind == "ldr_imm":
                    base = reg_name(info['rn'], True)
                    out.append(f"  - prev non-self: ldr {reg_name(info['rt'])}, [{base}+0x{info['offset']:x}] @ 0x{pc:08x}")
                    # trace base reg source
                    base_reg = info['rn']
                    src = find_last_write(data, vaddr, i, base_reg)
                    if src:
                        skind, spc, sinfo = src
                        if skind == "ldr_imm":
                            out.append(f"    - base {reg_name(base_reg)} <= [{reg_name(sinfo['rn'], True)}+0x{sinfo['offset']:x}] @ 0x{spc:08x}")
                        elif skind == "mov":
                            out.append(f"    - base {reg_name(base_reg)} <= {reg_name(sinfo['rm'])} @ 0x{spc:08x}")
                        elif skind == "add_imm":
                            out.append(f"    - base {reg_name(base_reg)} <= {reg_name(sinfo['rn'])}+0x{sinfo['imm']:x} @ 0x{spc:08x}")
                        else:
                            out.append(f"    - base {reg_name(base_reg)} <= literal 0x{sinfo['target']:08x} @ 0x{spc:08x}")
                    else:
                        out.append(f"    - base {reg_name(base_reg)} source not found")
                elif kind == "ldr_literal":
                    out.append(f"  - prev non-self: ldr_literal {reg_name(info['rt'])}, 0x{info['target']:08x} @ 0x{pc:08x}")
                elif kind == "mov":
                    out.append(f"  - prev non-self: mov {reg_name(info['rd'])}, {reg_name(info['rm'])} @ 0x{pc:08x}")
                else:
                    out.append(f"  - prev non-self: add {reg_name(info['rd'])}, {reg_name(info['rn'])}, 0x{info['imm']:x} @ 0x{pc:08x}")
            else:
                out.append("  - prev non-self: not found")

        out.append("")

OUT.write_text("\n".join(out), encoding="utf-8")
print(f"Wrote {OUT}")
