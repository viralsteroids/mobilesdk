import os,binascii
ROOT=r"C:\temp\MobileSDK"
DIR=os.path.join(ROOT,"offline_xor_out")
REPORT=os.path.join(ROOT,"analysis","payload_head_compare.md")
files=sorted([f for f in os.listdir(DIR) if f.endswith('.bin')])
contents={}
for f in files:
    with open(os.path.join(DIR,f),'rb') as fh:
        contents[f]=fh.read()

# common prefix length
common=0
if files:
    min_len=min(len(contents[f]) for f in files)
    for i in range(1,min_len+1):
        b=contents[files[0]][i-1]
        if all(contents[f][i-1]==b for f in files[1:]):
            common=i
        else:
            break

with open(REPORT,'w',encoding='ascii') as out:
    out.write('# Payload head comparison (offline_xor_out)\n\n')
    out.write(f'Files: {len(files)}. Common prefix length: {common} bytes.\n\n')
    out.write('## First 64 bytes (hex)\n\n')
    for f in files:
        data=contents[f]
        head=data[:64]
        out.write(f'- {f} (size={len(data)}): {binascii.hexlify(head).decode("ascii")}\n')

print('Wrote', REPORT)
