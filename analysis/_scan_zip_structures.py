import os, glob, struct

root = r'C:\\temp\\MobileSDK'
inputs = []
inputs += glob.glob(os.path.join(root, 'se_dumps', 'latest', '*.bin'))
inputs += glob.glob(os.path.join(root, 'decrypted_bundles', '*last_attempt.bin'))
inputs = sorted(set(inputs))

ZIP_LFH = b'PK\x03\x04'
ZIP_CDH = b'PK\x01\x02'
ZIP_EOCD = b'PK\x05\x06'

out_csv = os.path.join(root, 'analysis', 'zip_structure_scan.csv')
out_md = os.path.join(root, 'analysis', 'zip_structure_scan.md')

rows = []

for path in inputs:
    data = open(path, 'rb').read()
    size = len(data)
    lfh_count = data.count(ZIP_LFH)
    cdh_count = data.count(ZIP_CDH)
    eocd_positions = []
    off = 0
    while True:
        idx = data.find(ZIP_EOCD, off)
        if idx == -1:
            break
        eocd_positions.append(idx)
        off = idx + 1

    valid_eocd = []
    for idx in eocd_positions:
        if idx + 22 > size:
            continue
        # EOCD layout
        # 0: sig, 4: disk, 6: cdisk, 8: entries_disk, 10: entries_total
        # 12: cd_size, 16: cd_offset, 20: comment_len
        try:
            disk, cdisk, ent_disk, ent_total, cd_size, cd_offset, cmt_len = struct.unpack_from('<HHHHIIH', data, idx + 4)
        except Exception:
            continue
        if cd_offset + cd_size <= size and cd_offset >= 0 and cd_size >= 0:
            valid_eocd.append((idx, ent_total, cd_size, cd_offset, cmt_len))

    # try parse first valid EOCD (smallest offset from end)
    parsed_names = []
    if valid_eocd:
        # choose EOCD nearest end
        valid_eocd.sort(key=lambda x: x[0], reverse=True)
        idx, ent_total, cd_size, cd_offset, cmt_len = valid_eocd[0]
        # parse central directory
        ptr = cd_offset
        for _ in range(min(ent_total, 1000)):
            if ptr + 46 > size:
                break
            if data[ptr:ptr+4] != ZIP_CDH:
                break
            # central dir header
            # skip to name lengths
            (ver_made, ver_need, flags, comp, mtime, mdate, crc, csize, usize,
             nlen, xlen, clen, disk_start, int_attr, ext_attr, lfh_off) = struct.unpack_from('<HHHHHHIIIHHHHHII', data, ptr+4)
            name = data[ptr+46:ptr+46+nlen]
            try:
                parsed_names.append(name.decode('utf-8', 'replace'))
            except Exception:
                parsed_names.append(name.hex())
            ptr = ptr + 46 + nlen + xlen + clen
        # mark parse status
        parse_status = 'ok' if parsed_names else 'no_entries'
    else:
        parse_status = 'no_eocd'
        idx = ent_total = cd_size = cd_offset = cmt_len = None

    rows.append([
        os.path.basename(path), size, lfh_count, cdh_count, len(eocd_positions),
        '1' if valid_eocd else '0',
        f'0x{idx:08x}' if idx is not None else '',
        ent_total if ent_total is not None else '',
        cd_size if cd_size is not None else '',
        cd_offset if cd_offset is not None else '',
        parse_status,
        ';'.join(parsed_names[:20])
    ])

with open(out_csv, 'w', encoding='utf-8', newline='') as f:
    f.write('file,size,lfh_count,cdh_count,eocd_hits,valid_eocd,chosen_eocd,entries_total,cd_size,cd_offset,parse_status,filenames\n')
    for r in rows:
        f.write(','.join('"'+str(x).replace('"','""')+'"' for x in r) + '\n')

with open(out_md, 'w', encoding='ascii') as f:
    f.write('# ZIP structure scan\n\n')
    f.write('Scanned zstd_out dumps and post-XOR outputs for ZIP signatures and EOCD-based structures.\n\n')
    for r in rows:
        f.write('- {0}: size={1}, lfh={2}, cdh={3}, eocd_hits={4}, valid_eocd={5}, parse={6}\n'.format(
            r[0], r[1], r[2], r[3], r[4], r[5], r[10]
        ))

print('Wrote', out_md, 'and', out_csv)
