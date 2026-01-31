import csv
import hashlib
from pathlib import Path


def find_tildes(buf):
    positions = []
    for i, b in enumerate(buf):
        if b == 0x7e:
            positions.append(i)
            if len(positions) == 3:
                break
    return positions


def parse_header(buf):
    if not buf.startswith(b'sebundle'):
        raise ValueError('missing sebundle prefix')
    tildes = find_tildes(buf)
    if len(tildes) < 3:
        raise ValueError('missing header delimiters')
    t1, t2, t3 = tildes
    fmtver_str = buf[8:t1].decode('ascii', errors='ignore')
    fmtver = int(fmtver_str) if fmtver_str.isdigit() else None
    engine_version = buf[t1+1:t2].decode('ascii', errors='ignore')
    token = buf[t2+1:t3].decode('ascii', errors='ignore')
    if len(token) < 42:
        raise ValueError('token too short')
    token_dec = token[40:]
    if not token_dec.isdigit():
        raise ValueError('token tail not decimal')
    dec_len = int(token_dec)
    header_end = t3 + 1
    return {'fmtver': fmtver, 'engine_version': engine_version, 'dec_len': dec_len, 'header_end': header_end}


def key_prefix_from_bundle(data):
    info = parse_header(data)
    payload = data[info['header_end'] :]
    sha1 = hashlib.sha1(data[: info['header_end']]).digest()
    key_prefix = bytes(payload[i] ^ sha1[i] for i in range(0x14))
    return info, payload, key_prefix


def main():
    bundles = [
        Path('extracted_bundles/assets/bundle_codeengine_full.se'),
        Path('extracted_bundles/assets/bundle_international_faces_liveness.se'),
        Path('extracted_bundles/assets/bundle_newdocengine_demo_hiring_dsn.se'),
        Path('extracted_bundles/assets/bundle_textengine.se'),
    ]
    lib_paths = [p for p in Path('.').rglob('libjnimultiengine.so')]

    guesses = [
        b'se_demo\x00\x00\x00',
        b'se_demo~\x00\x00',
        b'se_demo~00',
        b'se_demo~1\x00',
        b'se_demo\x00\x00\x00',
    ]

    rows = []
    for bundle in bundles:
        if not bundle.exists():
            continue
        data = bundle.read_bytes()
        info, payload, key_prefix = key_prefix_from_bundle(data)
        if info['dec_len'] != 10:
            continue
        for guess in guesses:
            if len(guess) != info['dec_len']:
                continue
            key_mid = bytes(payload[0x14 + i] ^ guess[i] for i in range(info['dec_len']))
            key_sig = key_prefix + key_mid
            for lib in lib_paths:
                data_lib = lib.read_bytes()
                off = data_lib.find(key_sig)
                if off != -1:
                    rows.append({
                        'bundle': str(bundle),
                        'engine_version': info['engine_version'],
                        'guess': guess.hex(),
                        'lib_path': str(lib),
                        'offset': off,
                    })

    out_csv = Path('analysis/key_table_guess_scan.csv')
    out_csv.parent.mkdir(parents=True, exist_ok=True)
    with out_csv.open('w', newline='', encoding='utf-8') as f:
        writer = csv.DictWriter(f, fieldnames=['bundle','engine_version','guess','lib_path','offset'])
        writer.writeheader()
        writer.writerows(rows)

    out_md = Path('analysis/key_table_guess_scan.md')
    lines = ['# Key table guess scan (prefix + mini-header guess)', '']
    lines.append(f'- Matches: {len(rows)}')
    lines.append('')
    if rows:
        lines.append('| bundle | engine_version | guess | lib_path | offset |')
        lines.append('| --- | --- | --- | --- | --- |')
        for r in rows[:50]:
            lines.append(f"| {r['bundle']} | {r['engine_version']} | {r['guess']} | {r['lib_path']} | {r['offset']} |")
    out_md.write_text('\n'.join(lines), encoding='utf-8')


if __name__ == '__main__':
    main()
