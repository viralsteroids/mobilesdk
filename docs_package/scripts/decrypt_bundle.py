import argparse
import csv
import hashlib
import struct
from pathlib import Path

KEY_VADDR = 0x004909cf
KEY_SIZE = 0x80
MAGICS = {
    'zip_local': b'PK\x03\x04',
    'zip_spanned': b'PK\x07\x08',
    'zip_cdir': b'PK\x01\x02',
    'zip_eocd': b'PK\x05\x06',
    'zstd': b'\x28\xb5\x2f\xfd',
    'gzip': b'\x1f\x8b',
    'bz2': b'BZh',
    'xz': b'\xfd7zXZ\x00',
    'sqlite': b'SQLite format 3\x00',
    'json_obj': b'{"',
    'json_arr': b'["',
}


def vaddr_to_offset(elf_bytes, vaddr):
    e_phoff = struct.unpack_from('<Q', elf_bytes, 0x20)[0]
    e_phentsize = struct.unpack_from('<H', elf_bytes, 0x36)[0]
    e_phnum = struct.unpack_from('<H', elf_bytes, 0x38)[0]
    for i in range(e_phnum):
        off = e_phoff + i * e_phentsize
        p_type, p_flags = struct.unpack_from('<II', elf_bytes, off)
        if p_type != 1:
            continue
        p_offset, p_vaddr, p_paddr, p_filesz, p_memsz, p_align = struct.unpack_from('<QQQQQQ', elf_bytes, off + 8)
        if p_vaddr <= vaddr < p_vaddr + p_memsz:
            delta = vaddr - p_vaddr
            if delta < p_filesz:
                return p_offset + delta
            return None
    return None


def load_key_table(path, vaddr=KEY_VADDR, size=KEY_SIZE):
    p = Path(path)
    data = p.read_bytes()
    if p.suffix.lower() == '.bin':
        if len(data) < size:
            raise ValueError('key table bin too small')
        return data[:size]
    if data[:4] != b'\x7fELF':
        raise ValueError('unsupported key table source')
    if data[4] != 2:
        raise ValueError('ELF is not 64-bit')
    off = vaddr_to_offset(data, vaddr)
    if off is None:
        raise ValueError('vaddr not file-backed')
    return data[off:off + size]


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
    engine_version = buf[t1 + 1:t2].decode('ascii', errors='ignore')
    token = buf[t2 + 1:t3].decode('ascii', errors='ignore')
    if len(token) < 42:
        raise ValueError('token too short')
    token_hex = token[:40]
    token_dec = token[40:]
    if not token_dec.isdigit():
        raise ValueError('token tail not decimal')
    token_bytes = bytes.fromhex(token_hex)
    dec_len = int(token_dec)
    header_end = t3 + 1
    return {
        'fmtver': fmtver,
        'engine_version': engine_version,
        'token_hex': token_hex,
        'token_dec': token_dec,
        'token_bytes': token_bytes,
        'dec_len': dec_len,
        'header_end': header_end,
    }


def decrypt_sebundle(data, key_table):
    info = parse_header(data)
    payload = data[info['header_end'] :]
    if len(payload) < 0x14 + info['dec_len']:
        raise ValueError('payload too short')

    sha1 = hashlib.sha1(data[: info['header_end']]).digest()
    header_xor = bytes(payload[i] ^ key_table[i] for i in range(0x14))
    header_ok = header_xor == sha1

    dec_len = info['dec_len']
    mini = bytes(payload[0x14 + i] ^ key_table[0x14 + i] for i in range(dec_len)) if dec_len else b''

    start = 0x14 + dec_len
    body = bytearray(payload[start:])
    for i in range(len(body)):
        key_idx = (start + i) & 0x7f
        body[i] ^= key_table[key_idx]
    return info, header_ok, sha1, header_xor, mini, bytes(body)


def scan_magics(buf):
    hits = []
    for name, magic in MAGICS.items():
        off = buf.find(magic)
        if off != -1:
            hits.append(f"{name}@{off}")
    return ';'.join(hits)


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('--key', required=True)
    ap.add_argument('--out-csv', required=True)
    ap.add_argument('--out-md', required=True)
    ap.add_argument('paths', nargs='+')
    args = ap.parse_args()

    key_table = load_key_table(args.key)
    rows = []
    scanned = 0
    parsed = 0
    sha1_ok = 0

    for root in args.paths:
        root_path = Path(root)
        if root_path.is_file():
            files = [root_path]
        else:
            files = [p for p in root_path.rglob('*') if p.is_file()]
        for p in files:
            scanned += 1
            try:
                data = p.read_bytes()
            except Exception:
                continue
            if not data.startswith(b'sebundle'):
                continue
            try:
                info, header_ok, sha1, header_xor, mini, body = decrypt_sebundle(data, key_table)
            except Exception:
                continue
            parsed += 1
            if header_ok:
                sha1_ok += 1
            rows.append({
                'path': str(p),
                'size': len(data),
                'header_end': info['header_end'],
                'fmtver': info['fmtver'],
                'engine_version': info['engine_version'],
                'token_dec': info['token_dec'],
                'dec_len': info['dec_len'],
                'header_sha1_ok': header_ok,
                'mini_hex': mini.hex(),
                'body_len': len(body),
                'magic_hits': scan_magics(body),
            })

    out_csv = Path(args.out_csv)
    out_csv.parent.mkdir(parents=True, exist_ok=True)
    with out_csv.open('w', newline='', encoding='utf-8') as f:
        writer = csv.DictWriter(f, fieldnames=[
            'path', 'size', 'header_end', 'fmtver', 'engine_version', 'token_dec', 'dec_len',
            'header_sha1_ok', 'mini_hex', 'body_len', 'magic_hits'
        ])
        writer.writeheader()
        for row in rows:
            writer.writerow(row)

    out_md = Path(args.out_md)
    out_md.parent.mkdir(parents=True, exist_ok=True)
    lines = []
    lines.append('# Batch sebundle decrypt scan')
    lines.append('')
    lines.append(f'- Scanned files: {scanned}')
    lines.append(f'- Parsed sebundle headers: {parsed}')
    lines.append(f'- header_sha1_ok: {sha1_ok}')
    lines.append('')
    lines.append('Top results (first 10):')
    lines.append('')
    lines.append('| path | size | fmtver | engine | token_dec | dec_len | header_sha1_ok | body_len | magic_hits |')
    lines.append('| --- | --- | --- | --- | --- | --- | --- | --- | --- |')
    for row in rows[:10]:
        lines.append('| {path} | {size} | {fmtver} | {engine_version} | {token_dec} | {dec_len} | {header_sha1_ok} | {body_len} | {magic_hits} |'.format(**row))
    out_md.write_text('\n'.join(lines), encoding='utf-8')


if __name__ == '__main__':
    main()
