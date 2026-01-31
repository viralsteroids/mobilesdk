import os
import struct

DUMP_DIR = r"C:\temp\MobileSDK\se_dumps\latest"
REPORT = r"C:\temp\MobileSDK\analysis\zstd_out_struct_parse.md"

KIND_SET = set([0x01, 0x04, 0x05, 0x06, 0x07])

files = sorted([f for f in os.listdir(DUMP_DIR) if f.startswith('zstd_out_') and f.endswith('.bin')])

with open(REPORT, 'w', encoding='ascii') as out:
    out.write('# zstd_out struct parse (latest)\n\n')
    for f in files:
        path = os.path.join(DUMP_DIR, f)
        data = open(path, 'rb').read()
        size = len(data)
        if size < 64:
            out.write(f'## {f}\n- size: {size} bytes (too small)\n\n')
            continue

        ptrs = [struct.unpack_from('<Q', data, i)[0] for i in range(0, 32, 8)]
        d0 = struct.unpack_from('<I', data, 0x20)[0]
        d1 = struct.unpack_from('<I', data, 0x24)[0]

        # parse record list from 0x28 onward
        recs = []
        off = 0x28
        while off + 8 <= size:
            val = struct.unpack_from('<I', data, off)[0]
            idx = struct.unpack_from('<I', data, off + 4)[0]
            kind = (val >> 24) & 0xff
            if kind not in KIND_SET:
                break
            if idx > 0x1000:
                break
            recs.append((val, idx))
            off += 8

        # kind distribution
        kind_counts = {}
        for val, idx in recs:
            k = (val >> 24) & 0xff
            kind_counts[k] = kind_counts.get(k, 0) + 1

        out.write(f'## {f}\n')
        out.write(f'- size: {size} bytes\n')
        out.write('- ptrs: ' + ', '.join([f"0x{x:016x}" for x in ptrs]) + '\n')
        out.write(f'- d0: {d0} (0x{d0:x}), d1: {d1} (0x{d1:x})\n')
        out.write(f'- records_from_0x28: {len(recs)}\n')
        if recs:
            out.write('- kind_counts: ' + ', '.join([f"0x{k:02x}:{v}" for k,v in sorted(kind_counts.items())]) + '\n')
            out.write('- first_records:')
            for val, idx in recs[:10]:
                kind = (val >> 24) & 0xff
                mid = (val >> 16) & 0xff
                lo = val & 0xffff
                out.write(f"  - val=0x{val:08x} kind=0x{kind:02x} mid=0x{mid:02x} lo=0x{lo:04x} idx={idx}\n")
        out.write('\n')

print('Wrote', REPORT)
