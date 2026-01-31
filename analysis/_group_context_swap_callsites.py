from pathlib import Path
from bisect import bisect_right
from elftools.elf.elffile import ELFFile
import re

LIB = Path(r"C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so")
CALLS_FILE = Path(r"C:\temp\MobileSDK\analysis\bl_callers_0074a7e0_0074a810.md")
OUT = Path(r"C:\temp\MobileSDK\analysis\context_swap_callsite_groups.md")


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


def load_callsites(path: Path):
    hits = []
    if not path.exists():
        return hits
    for line in path.read_text(encoding="utf-8", errors="ignore").splitlines():
        m = re.search(r"call @ 0x([0-9a-fA-F]+)", line)
        if m:
            hits.append(int(m.group(1), 16))
    return sorted(set(hits))


callsites = load_callsites(CALLS_FILE)

with LIB.open('rb') as f:
    elf = ELFFile(f)
    text = elf.get_section_by_name('.text')
    if not text:
        raise SystemExit(".text not found")
    base = text['sh_addr']
    data = text.data()

prologues = []
for off in range(0, len(data), 4):
    insn = int.from_bytes(data[off:off+4], 'little')
    stp = decode_stp_pre(insn)
    if not stp:
        continue
    rt, rt2, rn, offb = stp
    if rn == 31 and rt == 29 and rt2 == 30:
        prologues.append(base + off)

prologues.sort()

# group callsites by nearest prologue
from collections import defaultdict

groups = defaultdict(list)
for cs in callsites:
    idx = bisect_right(prologues, cs) - 1
    if idx < 0:
        groups[None].append(cs)
    else:
        groups[prologues[idx]].append(cs)

lines = [
    "# Context-swap helper callsites grouped by nearest prologue",
    "",
    f"Library: {LIB}",
    f"Calls list: {CALLS_FILE}",
    "Heuristic: group by nearest STP X29,X30, [SP, -imm]! before the callsite.",
    "Function range is approximated as [prologue .. next_prologue).",
    "",
]

for pro in sorted(k for k in groups.keys() if k is not None):
    idx = prologues.index(pro)
    next_pro = prologues[idx + 1] if idx + 1 < len(prologues) else None
    rng = f"0x{pro:08x}..0x{(next_pro-1):08x}" if next_pro else f"0x{pro:08x}..end"
    lines.append(f"## Prologue 0x{pro:08x} (approx range {rng})")
    for cs in sorted(groups[pro]):
        delta = cs - pro
        lines.append(f"- call @ 0x{cs:08x} (+0x{delta:x})")
    lines.append("")

if None in groups:
    lines.append("## Calls with no prior prologue")
    for cs in sorted(groups[None]):
        lines.append(f"- call @ 0x{cs:08x}")
    lines.append("")

OUT.write_text("\n".join(lines), encoding="utf-8")
print(f"Wrote {OUT}")
