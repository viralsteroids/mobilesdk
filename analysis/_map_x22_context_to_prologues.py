from pathlib import Path
from bisect import bisect_right
from collections import defaultdict
import struct
import re
from elftools.elf.elffile import ELFFile

LIB = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
CALL_GROUPS = Path(r"C:\temp\MobileSDK\analysis\context_swap_callsite_groups.md")
OUT = Path(r"C:\temp\MobileSDK\analysis\x22_context_prologue_map.md")

OFFSETS = {0x230, 0x240, 0x248}
REG = 22


def sign_extend(val, bits):
    sign = 1 << (bits - 1)
    return (val & (sign - 1)) - (val & sign)


def decode_stp_pre(insn):
    if (insn & 0xFFC00000) == 0xA9800000:
        rt = insn & 0x1F
        rt2 = (insn >> 10) & 0x1F
        rn = (insn >> 5) & 0x1F
        imm7 = (insn >> 15) & 0x7F
        off = sign_extend(imm7, 7) * 8
        return (rt, rt2, rn, off)
    return None


def decode_ldr_imm(word):
    if (word & 0xFFC00000) == 0xF9400000:
        imm12 = (word >> 10) & 0xFFF
        rn = (word >> 5) & 0x1F
        rt = word & 0x1F
        return (rn, rt, imm12 * 8)
    return None


def decode_str_imm(word):
    if (word & 0xFFC00000) == 0xF9000000:
        imm12 = (word >> 10) & 0xFFF
        rn = (word >> 5) & 0x1F
        rt = word & 0x1F
        return (rn, rt, imm12 * 8)
    return None


def load_context_swap_prologues(path: Path):
    prologues = set()
    if not path.exists():
        return prologues
    for line in path.read_text(encoding="utf-8", errors="ignore").splitlines():
        m = re.match(r"## Prologue 0x([0-9a-fA-F]+)", line.strip())
        if m:
            prologues.add(int(m.group(1), 16))
    return prologues


with LIB.open('rb') as f:
    elf = ELFFile(f)
    text = elf.get_section_by_name('.text')
    if not text:
        raise SystemExit(".text not found")
    base = text['sh_addr']
    data = text.data()

prologues = []
for off in range(0, len(data), 4):
    insn = struct.unpack_from('<I', data, off)[0]
    stp = decode_stp_pre(insn)
    if not stp:
        continue
    rt, rt2, rn, offb = stp
    if rn == 31 and rt == 29 and rt2 == 30:
        prologues.append(base + off)
prologues.sort()

context_prologues = load_context_swap_prologues(CALL_GROUPS)

hits_by_prologue = defaultdict(list)
for off in range(0, len(data), 4):
    insn = struct.unpack_from('<I', data, off)[0]
    ldr = decode_ldr_imm(insn)
    if ldr:
        rn, rt, offb = ldr
        if rn == REG and offb in OFFSETS:
            addr = base + off
            idx = bisect_right(prologues, addr) - 1
            pro = prologues[idx] if idx >= 0 else None
            hits_by_prologue[pro].append((addr, "LDR", rt, offb))
        continue
    stri = decode_str_imm(insn)
    if stri:
        rn, rt, offb = stri
        if rn == REG and offb in OFFSETS:
            addr = base + off
            idx = bisect_right(prologues, addr) - 1
            pro = prologues[idx] if idx >= 0 else None
            hits_by_prologue[pro].append((addr, "STR", rt, offb))

lines = [
    "# x22 context-field access map (offsets 0x230/0x240/0x248)",
    "",
    f"Library: {LIB}",
    "Heuristic: map LDR/STR [X22+imm] to nearest STP X29,X30 prologue.",
    "",
]

for pro in sorted(k for k in hits_by_prologue.keys() if k is not None):
    idx = prologues.index(pro)
    next_pro = prologues[idx + 1] if idx + 1 < len(prologues) else None
    rng = f"0x{pro:08x}..0x{(next_pro-1):08x}" if next_pro else f"0x{pro:08x}..end"
    tag = " [context-swap prologue]" if pro in context_prologues else ""
    lines.append(f"## Prologue 0x{pro:08x}{tag} (approx range {rng})")
    for addr, kind, rt, offb in sorted(hits_by_prologue[pro]):
        lines.append(f"- {kind} X{rt}, [X22+0x{offb:x}] @ 0x{addr:08x}")
    lines.append("")

if None in hits_by_prologue:
    lines.append("## Accesses with no prior prologue")
    for addr, kind, rt, offb in sorted(hits_by_prologue[None]):
        lines.append(f"- {kind} X{rt}, [X22+0x{offb:x}] @ 0x{addr:08x}")
    lines.append("")

OUT.write_text("\n".join(lines), encoding="utf-8")
print(f"Wrote {OUT}")
