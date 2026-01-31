import os, glob

root = r'C:\\temp\\MobileSDK'
key = bytes.fromhex('2688f026b0f34dea31b377bfe5fd1f6ecf2b984810d607870ded1405e9f8a3d9')

bundles = sorted(glob.glob(os.path.join(root, 'extracted_bundles', 'assets', '*.se')))
if not bundles:
    raise SystemExit('No .se bundles found')

out_md = os.path.join(root, 'analysis', 'payload_header_mirror.md')
out_csv = os.path.join(root, 'analysis', 'payload_header_mirror.csv')

rows = []

for path in bundles:
    name = os.path.basename(path)
    with open(path, 'rb') as f:
        data = f.read()
    tilde_offsets = [i for i,b in enumerate(data[:128]) if b == 0x7e]
    if len(tilde_offsets) < 3:
        rows.append((name, 'ERR', 'tilde<3', '', '', '', '', ''))
        continue
    text_len = tilde_offsets[2] + 1
    bin_header = data[text_len:text_len+36]
    payload = data[text_len+36:]
    if len(payload) < 36:
        rows.append((name, text_len, 'payload<36', '', '', '', '', ''))
        continue

    # post-XOR = encrypted payload XOR key
    post = bytes([payload[i] ^ key[i % len(key)] for i in range(36)])

    key_part = bin_header[:20]
    const_part = bin_header[20:36]

    key_match = post[:20] == key_part
    const_match = post[20:36] == const_part

    rows.append((
        name,
        text_len,
        'OK',
        key_part.hex(),
        const_part.hex(),
        post[:20].hex(),
        post[20:36].hex(),
        'key=' + ('YES' if key_match else 'NO') + ';const=' + ('YES' if const_match else 'NO')
    ))

with open(out_csv, 'w', encoding='utf-8') as f:
    f.write('file,text_header_len,status,header_key_hex,header_const_hex,post_key_hex,post_const_hex,match\n')
    for r in rows:
        f.write(','.join('"'+str(x).replace('"','""')+'"' for x in r) + '\n')

with open(out_md, 'w', encoding='ascii') as f:
    f.write('# Payload header mirror check\n\n')
    f.write('Check whether the first 36 bytes of **post-XOR payload** match the 36-byte binary header.\n')
    f.write('We compare key part (bytes 0..19) and const part (bytes 20..35) separately.\n\n')
    for r in rows:
        name, text_len, status, key_hex, const_hex, post_key_hex, post_const_hex, match = r
        f.write('- {0}: text_header_len={1}, status={2}, {3}\n'.format(name, text_len, status, match))

print('Wrote', out_md, 'and', out_csv)
