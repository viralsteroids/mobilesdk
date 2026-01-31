import os, glob

root = r'C:\\temp\\MobileSDK'

bundles = sorted(glob.glob(os.path.join(root, 'extracted_bundles', 'assets', '*.se')))
if not bundles:
    raise SystemExit('No .se bundles found')

out_md = os.path.join(root, 'analysis', 'payload_header_encrypted_match.md')
out_csv = os.path.join(root, 'analysis', 'payload_header_encrypted_match.csv')

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

    key_part = bin_header[:20]
    const_part = bin_header[20:36]
    enc_key = payload[:20]
    enc_const = payload[20:36]

    key_match = enc_key == key_part
    const_match = enc_const == const_part

    rows.append((
        name,
        text_len,
        'OK',
        key_part.hex(),
        const_part.hex(),
        enc_key.hex(),
        enc_const.hex(),
        'key=' + ('YES' if key_match else 'NO') + ';const=' + ('YES' if const_match else 'NO')
    ))

with open(out_csv, 'w', encoding='utf-8') as f:
    f.write('file,text_header_len,status,header_key_hex,header_const_hex,enc_key_hex,enc_const_hex,match\n')
    for r in rows:
        f.write(','.join('"'+str(x).replace('"','""')+'"' for x in r) + '\n')

with open(out_md, 'w', encoding='ascii') as f:
    f.write('# Encrypted payload vs header (first 36 bytes)\n\n')
    f.write('Check whether the first 36 bytes of **encrypted payload** match the 36-byte binary header.\n')
    f.write('We compare key part (bytes 0..19) and const part (bytes 20..35) separately.\n\n')
    for r in rows:
        name, text_len, status, key_hex, const_hex, enc_key_hex, enc_const_hex, match = r
        f.write('- {0}: text_header_len={1}, status={2}, {3}\n'.format(name, text_len, status, match))

print('Wrote', out_md, 'and', out_csv)
