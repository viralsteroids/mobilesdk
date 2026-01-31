import re
from pathlib import Path

path = Path(r"C:\temp\MobileSDK\analysis\full_bl_to_86236c_x19_range.md")
lines = path.read_text(encoding='utf-8').splitlines()

candidates = []
for line in lines:
    m = re.match(r"^(0x[0-9a-fA-F]+):\s+X19=([^;]+);\s+X0=([^;]+)", line)
    if not m:
        continue
    addr = m.group(1)
    x19 = m.group(2)
    x0 = m.group(3)
    score = 0
    if 'MEM[MEM' in x19:
        score += 3
    elif 'MEM[' in x19 and 'SP' not in x19:
        score += 2
    elif 'MEM[SP' in x19:
        score += 1
    if 'MEM[MEM' in x0:
        score += 2
    if 'MEM[' in x0 and 'SP' not in x0:
        score += 1
    candidates.append((score, addr, x19, x0))

candidates.sort(reverse=True)

out_lines = []
out_lines.append("Candidates for BL to 0x86236c (ranked by pointer-depth)")
for score, addr, x19, x0 in candidates:
    if score >= 3:
        out_lines.append(f"{addr} score={score} X19={x19} X0={x0}")

out_path = Path(r"C:\temp\MobileSDK\analysis\full_bl_to_86236c_candidates.md")
out_path.write_text("\n".join(out_lines), encoding='utf-8')
print(out_path)
