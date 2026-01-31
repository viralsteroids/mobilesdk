import os
import binascii

ROOT=r"C:\temp\MobileSDK"
DIR=os.path.join(ROOT,'offline_xor_out')
REPORT=os.path.join(ROOT,'analysis','payload_common_bytes.md')

files=sorted([f for f in os.listdir(DIR) if f.endswith('.bin')])
contents=[open(os.path.join(DIR,f),'rb').read() for f in files]
min_len=min(len(c) for c in contents)
limit=256

common_positions=[]
for i in range(min(limit,min_len)):
    b=contents[0][i]
    if all(c[i]==b for c in contents[1:]):
        common_positions.append(i)

ranges=[]
if common_positions:
    start=common_positions[0]
    prev=common_positions[0]
    for i in common_positions[1:]:
        if i==prev+1:
            prev=i
        else:
            ranges.append((start,prev))
            start=prev=i
    ranges.append((start,prev))

with open(REPORT,'w',encoding='ascii') as out:
    out.write('# Common bytes in XOR payloads (offline_xor_out)\n\n')
    out.write(f'Analyzed first {limit} bytes of {len(files)} files.\n\n')
    out.write(f'Common positions count: {len(common_positions)}. Ranges: {ranges}.\n\n')
    if ranges:
        out.write('## Common ranges (hex)\n\n')
        for start,end in ranges:
            data=contents[0][start:end+1]
            out.write(f'- 0x{start:02x}-0x{end:02x} ({end-start+1} bytes): {binascii.hexlify(data).decode("ascii")}\n')
    out.write('\n## Per-file first 64 bytes (hex)\n\n')
    for f,c in zip(files,contents):
        head=c[:64]
        out.write(f'- {f}: {binascii.hexlify(head).decode("ascii")}\n')

print('Wrote', REPORT)
