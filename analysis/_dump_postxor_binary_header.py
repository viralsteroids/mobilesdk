import os,struct,binascii
ROOT=r"C:\temp\MobileSDK"
DIR=os.path.join(ROOT,'offline_xor_out')
REPORT=os.path.join(ROOT,'analysis','postxor_binary_header_compare.md')
files=sorted([f for f in os.listdir(DIR) if f.endswith('.bin')])
with open(REPORT,'w',encoding='ascii') as out:
    out.write('# Post-XOR binary header (first 36 bytes)\n\n')
    for f in files:
        path=os.path.join(DIR,f)
        data=open(path,'rb').read(36)
        out.write(f'## {f}\n')
        out.write(f'- hex: {binascii.hexlify(data).decode("ascii")}\n')
        # split into u32 LE
        if len(data) >= 36:
            u32=[struct.unpack_from('<I',data,i)[0] for i in range(0,36,4)]
            out.write(f'- u32_le: {u32}\n')
        out.write('\n')
print('Wrote', REPORT)
