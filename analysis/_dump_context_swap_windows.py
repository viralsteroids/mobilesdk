from pathlib import Path
import re
import struct
from elftools.elf.elffile import ELFFile

LIB = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
X22_MAP = Path(r"C:\temp\MobileSDK\analysis\x22_context_prologue_map.md")
CALL_GROUPS = Path(r"C:\temp\MobileSDK\analysis\context_swap_callsite_groups.md")
OUT = Path(r"C:\temp\MobileSDK\analysis\context_swap_key_windows.txt")

WINDOW = 0x40
TARGET_PROLOGUES = {0x01143948, 0x011493c0}

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


def decode(word, pc):
    # LDR/STR unsigned imm 64-bit
    if (word & 0xFFC00000) == 0xF9400000:
        imm12 = (word >> 10) & 0xFFF
        rn = (word >> 5) & 0x1F
        rt = word & 0x1F
        return f"ldr {reg_name(rt)}, [{reg_name(rn, True)}+0x{imm12*8:x}]"
    if (word & 0xFFC00000) == 0xF9000000:
        imm12 = (word >> 10) & 0xFFF
        rn = (word >> 5) & 0x1F
        rt = word & 0x1F
        return f"str {reg_name(rt)}, [{reg_name(rn, True)}+0x{imm12*8:x}]"
    # LDR/STR unsigned imm 32-bit
    if (word & 0xFFC00000) == 0xB9400000:
        imm12 = (word >> 10) & 0xFFF
        rn = (word >> 5) & 0x1F
        rt = word & 0x1F
        return f"ldr w{rt}, [{reg_name(rn, True)}+0x{imm12*4:x}]"
    if (word & 0xFFC00000) == 0xB9000000:
        imm12 = (word >> 10) & 0xFFF
        rn = (word >> 5) & 0x1F
        rt = word & 0x1F
        return f"str w{rt}, [{reg_name(rn, True)}+0x{imm12*4:x}]"
    # BL
    if (word & 0xFC000000) == 0x94000000:
        imm26 = word & 0x03FFFFFF
        if imm26 & (1 << 25):
            imm26 -= 1 << 26
        target = pc + (imm26 << 2)
        return f"bl 0x{target:08x}"
    # BLR
    if (word & 0xFFFFFC1F) == 0xD63F0000:
        rn = (word >> 5) & 0x1F
        return f"blr {reg_name(rn)}"
    # ADRP
    if (word & 0x9F000000) == 0x90000000:
        immlo = (word >> 29) & 0x3
        immhi = (word >> 5) & 0x7FFFF
        rd = word & 0x1F
        imm = sign_extend((immhi << 2) | immlo, 21) << 12
        target = (pc & ~0xFFF) + imm
        return f"adrp {reg_name(rd)}, 0x{target:08x}"
    # ADD imm
    if (word & 0xFFC00000) == 0x91000000:
        imm12 = (word >> 10) & 0xFFF
        shift = (word >> 22) & 0x3
        rn = (word >> 5) & 0x1F
        rd = word & 0x1F
        imm = imm12 << (12 if shift == 1 else 0)
        return f"add {reg_name(rd)}, {reg_name(rn)}, 0x{imm:x}"
    return ""


def parse_x22_map(path: Path):
    by_pro = {}
    cur = None
    for line in path.read_text(encoding="utf-8", errors="ignore").splitlines():
        m = re.match(r"## Prologue 0x([0-9a-fA-F]+)", line)
        if m:
            cur = int(m.group(1), 16)
            by_pro.setdefault(cur, [])
            continue
        m = re.match(r"- (LDR|STR) X(\d+), \[X22\+0x([0-9a-fA-F]+)\] @ 0x([0-9a-fA-F]+)", line)
        if m and cur is not None:
            kind = m.group(1)
            rt = int(m.group(2))
            offb = int(m.group(3), 16)
            addr = int(m.group(4), 16)
            by_pro[cur].append((addr, kind, rt, offb))
    return by_pro


def parse_call_groups(path: Path):
    by_pro = {}
    cur = None
    for line in path.read_text(encoding="utf-8", errors="ignore").splitlines():
        m = re.match(r"## Prologue 0x([0-9a-fA-F]+)", line)
        if m:
            cur = int(m.group(1), 16)
            by_pro.setdefault(cur, [])
            continue
        m = re.match(r"- call @ 0x([0-9a-fA-F]+)", line)
        if m and cur is not None:
            by_pro[cur].append(int(m.group(1), 16))
    return by_pro


x22_by_pro = parse_x22_map(X22_MAP) if X22_MAP.exists() else {}
call_by_pro = parse_call_groups(CALL_GROUPS) if CALL_GROUPS.exists() else {}

with LIB.open('rb') as f:
    elf = ELFFile(f)
    lines = [
        "# Context-swap key windows (TextEngine ranges)",
        "",
        f"Library: {LIB}",
        f"Window: +/- 0x{WINDOW:x}",
        "",
    ]

    for pro in sorted(TARGET_PROLOGUES):
        lines.append(f"## Prologue 0x{pro:08x}")

        # x22 context accesses
        xhits = x22_by_pro.get(pro, [])
        lines.append(f"### x22 context accesses ({len(xhits)})")
        if not xhits:
            lines.append("- none")
        for addr, kind, rt, offb in xhits:
            lines.append(f"#### {kind} X{rt}, [X22+0x{offb:x}] @ 0x{addr:08x}")
            off = vaddr_to_offset(elf, addr - WINDOW)
            if off is None:
                lines.append("(no PT_LOAD)")
                continue
            f.seek(off)
            data = f.read(WINDOW * 2)
            for i in range(0, len(data), 4):
                pc = (addr - WINDOW) + i
                word = struct.unpack_from('<I', data, i)[0]
                asm = decode(word, pc)
                marker = " <-" if pc == addr else ""
                if asm:
                    lines.append(f"0x{pc:08x}: {word:08x}  {asm}{marker}")
                else:
                    lines.append(f"0x{pc:08x}: {word:08x}{marker}")
            lines.append("")

        # context-swap helper callsites
        chits = call_by_pro.get(pro, [])
        lines.append(f"### context-swap helper callsites ({len(chits)})")
        if not chits:
            lines.append("- none")
        for addr in chits:
            lines.append(f"#### call @ 0x{addr:08x}")
            off = vaddr_to_offset(elf, addr - WINDOW)
            if off is None:
                lines.append("(no PT_LOAD)")
                continue
            f.seek(off)
            data = f.read(WINDOW * 2)
            for i in range(0, len(data), 4):
                pc = (addr - WINDOW) + i
                word = struct.unpack_from('<I', data, i)[0]
                asm = decode(word, pc)
                marker = " <-" if pc == addr else ""
                if asm:
                    lines.append(f"0x{pc:08x}: {word:08x}  {asm}{marker}")
                else:
                    lines.append(f"0x{pc:08x}: {word:08x}{marker}")
            lines.append("")

    OUT.write_text("\n".join(lines), encoding="utf-8")
    print(f"Wrote {OUT}")
