import os, glob, csv

root = r'C:\\temp\\MobileSDK'
files = sorted(glob.glob(os.path.join(root, 'decrypted_bundles', '*last_attempt.bin')))
if not files:
    raise SystemExit('No last_attempt.bin files found')

# read buffers
bufs = []
for p in files:
    with open(p, 'rb') as f:
        bufs.append(f.read())

names = [os.path.basename(p) for p in files]
min_len = min(len(b) for b in bufs)
limit = min(1024 * 1024, min_len)

# compute unique-count per offset for first limit bytes
unique_counts = []
values = []
for i in range(limit):
    bs = [b[i] for b in bufs]
    unique_counts.append(len(set(bs)))
    values.append(bs)

# find runs where all bytes equal across bundles
runs_all = []
start = None
for i, u in enumerate(unique_counts):
    if u == 1:
        if start is None:
            start = i
    else:
        if start is not None:
            if i - start >= 8:
                runs_all.append((start, i))
            start = None
if start is not None and limit - start >= 8:
    runs_all.append((start, limit))

# runs where <=2 unique values (potential version split)
runs_two = []
start = None
for i, u in enumerate(unique_counts):
    if u <= 2:
        if start is None:
            start = i
    else:
        if start is not None:
            if i - start >= 16:
                runs_two.append((start, i))
            start = None
if start is not None and limit - start >= 16:
    runs_two.append((start, limit))

out_csv = os.path.join(root, 'analysis', 'postxor_common_offsets.csv')
out_md = os.path.join(root, 'analysis', 'postxor_common_offsets.md')

with open(out_csv, 'w', newline='', encoding='utf-8') as f:
    w = csv.writer(f)
    w.writerow(['offset', 'unique_count'] + names)
    for i in range(limit):
        row = [f'0x{i:06x}', unique_counts[i]] + [f'{b:02x}' for b in values[i]]
        w.writerow(row)

# helper: dump bytes for a run (first 64 bytes)

def run_preview(start, end):
    length = end - start
    out = []
    for i in range(start, min(end, start + 64)):
        out.append(values[i][0])
    return bytes(out).hex()

with open(out_md, 'w', encoding='utf-8') as f:
    f.write('# Post-XOR common offset scan\n\n')
    f.write('Files: ' + ', '.join(names) + '\n\n')
    f.write('Scanned first {0} bytes (min_len={1}).\n\n'.format(limit, min_len))
    f.write('## Runs where all bundles share identical bytes (len>=8)\n\n')
    if not runs_all:
        f.write('No runs >= 8 bytes.\n')
    else:
        for start, end in runs_all[:200]:
            f.write('- 0x{0:06x}..0x{1:06x} len={2} preview={3}\n'.format(start, end, end - start, run_preview(start, end)))
    f.write('\n## Runs where <=2 unique byte values across bundles (len>=16)\n\n')
    if not runs_two:
        f.write('No runs >= 16 bytes.\n')
    else:
        for start, end in runs_two[:200]:
            f.write('- 0x{0:06x}..0x{1:06x} len={2} preview={3}\n'.format(start, end, end - start, run_preview(start, end)))

print('Wrote', out_csv, 'and', out_md)
