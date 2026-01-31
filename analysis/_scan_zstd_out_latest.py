import os
import re
import math

DIR = r"C:\temp\MobileSDK\se_dumps\latest"
REPORT = r"C:\temp\MobileSDK\analysis\zstd_out_latest_scan.md"

files = [f for f in os.listdir(DIR) if f.startswith('zstd_out_') and f.endswith('.bin')]
files.sort()


def entropy(data):
    if not data:
        return 0.0
    counts = [0]*256
    for b in data:
        counts[b] += 1
    ent = 0.0
    n = len(data)
    for c in counts:
        if c == 0:
            continue
        p = c / n
        ent -= p * math.log(p, 2)
    return ent


def ascii_runs(data, min_len=4):
    runs = []
    cur = bytearray()
    for b in data:
        if 32 <= b < 127:
            cur.append(b)
        else:
            if len(cur) >= min_len:
                runs.append(cur.decode('ascii', errors='ignore'))
            cur = bytearray()
    if len(cur) >= min_len:
        runs.append(cur.decode('ascii', errors='ignore'))
    return runs

with open(REPORT, 'w', encoding='ascii') as out:
    out.write('# zstd_out latest dump scan\n\n')
    for f in files:
        path = os.path.join(DIR, f)
        data = open(path, 'rb').read()
        ent = entropy(data)
        out.write(f'## {f}\n')
        out.write(f'- size: {len(data)} bytes\n')
        out.write(f'- entropy: {ent:.5f}\n')
        # magic checks
        magic = data[:8].hex()
        out.write(f'- head: {magic}\n')
        # search for JSON braces or known tokens
        runs = ascii_runs(data, min_len=6)
        # keep unique short list
        hits = []
        for s in runs:
            if any(k in s for k in ['{', '}', '[', ']', 'json', 'PNG', 'JFIF', 'IHDR', 'ZIP', 'sebundle', 'smart', 'engine']):
                hits.append(s)
            if len(hits) >= 10:
                break
        if hits:
            out.write('- ascii_hits:\n')
            for s in hits:
                out.write(f'  - {s[:120]}\n')
        else:
            out.write('- ascii_hits: <none>\n')
        out.write('\n')

print('Wrote', REPORT)
