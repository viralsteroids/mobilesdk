import os
import struct

DIR = r"C:\temp\MobileSDK\se_dumps\latest"
REPORT = r"C:\temp\MobileSDK\analysis\zstd_out_u64_head.md"
files = sorted([f for f in os.listdir(DIR) if f.startswith('zstd_out_') and f.endswith('.bin')])

with open(REPORT, 'w', encoding='ascii') as out:
    out.write('# zstd_out head as u64 LE\n\n')
    for f in files:
        data = open(os.path.join(DIR,f),'rb').read(64)
        u64s = [struct.unpack_from('<Q', data, i)[0] for i in range(0, len(data), 8)]
        out.write(f'## {f}\n')
        out.write('- u64_le: ' + ', '.join([f"0x{x:016x}" for x in u64s]) + '\n')
        out.write('\n')

print('Wrote', REPORT)
