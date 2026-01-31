import os
ROOT=r"C:\temp\MobileSDK"
DIR=os.path.join(ROOT,'offline_xor_out')
files=sorted([f for f in os.listdir(DIR) if f.endswith('.bin')])
contents=[open(os.path.join(DIR,f),'rb').read() for f in files]
min_len=min(len(c) for c in contents)
# analyze first 512 bytes
limit=512
positions=[]
for i in range(min(limit,min_len)):
    b=contents[0][i]
    if all(c[i]==b for c in contents[1:]):
        positions.append(i)

# group into ranges
ranges=[]
if positions:
    start=positions[0]
    prev=positions[0]
    for i in positions[1:]:
        if i==prev+1:
            prev=i
        else:
            ranges.append((start,prev))
            start=prev=i
    ranges.append((start,prev))

print('Common byte positions in first', limit, 'bytes:', len(positions))
print('Ranges:', ranges)
if positions:
    # print first 64 common bytes as hex
    print('Sample common bytes:')
    for start,end in ranges[:5]:
        data=contents[0][start:end+1]
        print(start,end,data.hex())
