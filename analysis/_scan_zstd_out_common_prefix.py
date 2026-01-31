import os
import binascii

DIR = r"C:\temp\MobileSDK\se_dumps\latest"
REPORT = r"C:\temp\MobileSDK\analysis\zstd_out_common_prefix.md"
files = sorted([f for f in os.listdir(DIR) if f.startswith('zstd_out_') and f.endswith('.bin')])
if not files:
    raise SystemExit('no files')

contents = [open(os.path.join(DIR,f), 'rb').read() for f in files]
min_len = min(len(c) for c in contents)
common = 0
for i in range(min_len):
    b = contents[0][i]
    if all(c[i]==b for c in contents[1:]):
        common += 1
    else:
        break

with open(REPORT, 'w', encoding='ascii') as out:
    out.write('# zstd_out common prefix\n\n')
    out.write(f'Files: {len(files)}. Common prefix length: {common} bytes.\n\n')
    out.write('## First 64 bytes (hex)\n\n')
    for f,c in zip(files, contents):
        out.write(f'- {f}: {binascii.hexlify(c[:64]).decode("ascii")}\n')

print('Wrote', REPORT)
