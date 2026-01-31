import argparse
import csv
import hashlib
import struct
from pathlib import Path

KEY_VADDR = 0x004909cf
KEY_SIZE = 0x80


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
    return info, header_ok, mini, bytes(body)


def parse_zstd_frame(body, max_blocks=5, full_blocks=False):
    if len(body) < 5:
        return None
    if body[:4] != b'\x28\xb5\x2f\xfd':
        return None
    pos = 4
    fhd = body[pos]
    pos += 1
    fcs_flag = fhd & 0x3
    single_segment = (fhd >> 2) & 0x1
    checksum_flag = (fhd >> 4) & 0x1
    dict_id_flag = (fhd >> 5) & 0x3

    window_desc = None
    window_size = None
    if single_segment == 0:
        if pos >= len(body):
            return None
        window_desc = body[pos]
        pos += 1
        window_log = 10 + (window_desc >> 3)
        window_base = 1 << window_log
        window_add = (window_base >> 3) * (window_desc & 7)
        window_size = window_base + window_add

    dict_id_size = {0: 0, 1: 1, 2: 2, 3: 4}[dict_id_flag]
    dict_id = None
    if dict_id_size:
        if pos + dict_id_size > len(body):
            return None
        dict_id = int.from_bytes(body[pos:pos + dict_id_size], 'little')
        pos += dict_id_size

    if single_segment == 1:
        fcs_size = {0: 1, 1: 2, 2: 4, 3: 8}[fcs_flag]
    else:
        fcs_size = {0: 0, 1: 2, 2: 4, 3: 8}[fcs_flag]

    fcs_raw = None
    fcs_value = None
    if fcs_size:
        if pos + fcs_size > len(body):
            return None
        fcs_raw = body[pos:pos + fcs_size]
        fcs_value = int.from_bytes(fcs_raw, 'little')
        if single_segment == 0 and fcs_size == 2 and fcs_flag == 1:
            fcs_value += 256
        pos += fcs_size

    blocks = []
    block_count = 0
    last_found = False
    while True:
        if pos + 3 > len(body):
            break
        header = int.from_bytes(body[pos:pos + 3], 'little')
        pos += 3
        last_block = header & 1
        block_type = (header >> 1) & 3
        block_size = header >> 3
        if len(blocks) < max_blocks:
            blocks.append((last_block, block_type, block_size))
        block_count += 1
        if pos + block_size > len(body):
            break
        pos += block_size
        if last_block:
            last_found = True
            break
        if not full_blocks and block_count >= max_blocks:
            break

    checksum = ''
    if last_found and checksum_flag:
        if pos + 4 <= len(body):
            checksum = body[pos:pos + 4].hex()
            pos += 4

    return {
        'fhd': fhd,
        'single_segment': single_segment,
        'checksum_flag': checksum_flag,
        'dict_id_flag': dict_id_flag,
        'dict_id': dict_id,
        'fcs_flag': fcs_flag,
        'fcs_size': fcs_size,
        'fcs_raw': fcs_raw.hex() if fcs_raw else '',
        'fcs_value': fcs_value if fcs_value is not None else '',
        'window_desc': window_desc if window_desc is not None else '',
        'window_size': window_size if window_size is not None else '',
        'blocks': blocks,
        'block_count': block_count,
        'last_found': last_found,
        'frame_end': pos,
        'checksum': checksum,
    }


def blocks_summary(blocks):
    parts = []
    for last_block, block_type, block_size in blocks:
        parts.append(f'{block_type}:{block_size}:{last_block}')
    return ';'.join(parts)


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('--key', required=True)
    ap.add_argument('--out-md', required=True)
    ap.add_argument('--out-csv', required=True)
    ap.add_argument('--dump-dir', default=None)
    ap.add_argument('--full-blocks', action='store_true')
    ap.add_argument('paths', nargs='+')
    args = ap.parse_args()

    key_table = load_key_table(args.key)
    dump_dir = Path(args.dump_dir) if args.dump_dir else None
    if dump_dir:
        dump_dir.mkdir(parents=True, exist_ok=True)

    rows = []
    for root in args.paths:
        root_path = Path(root)
        files = [root_path] if root_path.is_file() else [p for p in root_path.rglob('*') if p.is_file()]
        for p in files:
            data = p.read_bytes()
            if not data.startswith(b'sebundle'):
                continue
            try:
                info, header_ok, mini, body = decrypt_sebundle(data, key_table)
            except Exception:
                continue
            if dump_dir:
                out_name = p.name + '.body'
                (dump_dir / out_name).write_bytes(body)
            zstd_info = parse_zstd_frame(body, full_blocks=args.full_blocks)
            rows.append({
                'path': str(p),
                'size': len(data),
                'header_sha1_ok': header_ok,
                'mini_hex': mini.hex(),
                'zstd_magic': body[:4].hex(),
                'fhd': zstd_info['fhd'] if zstd_info else '',
                'single_segment': zstd_info['single_segment'] if zstd_info else '',
                'dict_id_flag': zstd_info['dict_id_flag'] if zstd_info else '',
                'dict_id': zstd_info['dict_id'] if zstd_info else '',
                'fcs_flag': zstd_info['fcs_flag'] if zstd_info else '',
                'fcs_size': zstd_info['fcs_size'] if zstd_info else '',
                'fcs_raw': zstd_info['fcs_raw'] if zstd_info else '',
                'fcs_value': zstd_info['fcs_value'] if zstd_info else '',
                'window_desc': zstd_info['window_desc'] if zstd_info else '',
                'window_size': zstd_info['window_size'] if zstd_info else '',
                'blocks_summary': blocks_summary(zstd_info['blocks']) if zstd_info else '',
                'block_count': zstd_info['block_count'] if zstd_info else '',
                'last_block_found': zstd_info['last_found'] if zstd_info else '',
                'frame_end': zstd_info['frame_end'] if zstd_info else '',
                'checksum': zstd_info['checksum'] if zstd_info else '',
            })

    out_csv = Path(args.out_csv)
    out_csv.parent.mkdir(parents=True, exist_ok=True)
    with out_csv.open('w', newline='', encoding='utf-8') as f:
        writer = csv.DictWriter(f, fieldnames=[
            'path', 'size', 'header_sha1_ok', 'mini_hex', 'zstd_magic', 'fhd', 'single_segment',
            'dict_id_flag', 'dict_id', 'fcs_flag', 'fcs_size', 'fcs_raw', 'fcs_value',
            'window_desc', 'window_size', 'blocks_summary', 'block_count', 'last_block_found',
            'frame_end', 'checksum'
        ])
        writer.writeheader()
        for row in rows:
            writer.writerow(row)

    out_md = Path(args.out_md)
    lines = ['# ZSTD frame header scan', '']
    lines.append(f'- bundles scanned: {len(rows)}')
    lines.append('')
    for row in rows:
        lines.append(f"## {row['path']}")
        lines.append(f"- header_sha1_ok: {row['header_sha1_ok']}")
        lines.append(f"- mini_hex: {row['mini_hex']}")
        lines.append(f"- zstd_magic: {row['zstd_magic']}")
        if row['fhd'] != '':
            lines.append(f"- fhd: {row['fhd']}")
            lines.append(f"- single_segment: {row['single_segment']} dict_id_flag: {row['dict_id_flag']} dict_id: {row['dict_id']}")
            lines.append(f"- fcs_flag: {row['fcs_flag']} fcs_size: {row['fcs_size']} fcs_raw: {row['fcs_raw']} fcs_value: {row['fcs_value']}")
            lines.append(f"- window_desc: {row['window_desc']} window_size: {row['window_size']}")
            lines.append(f"- blocks: {row['blocks_summary']}")
            lines.append(f"- block_count: {row['block_count']} last_block_found: {row['last_block_found']} frame_end: {row['frame_end']} checksum: {row['checksum']}")
        lines.append('')
    out_md.write_text('\n'.join(lines), encoding='utf-8')


if __name__ == '__main__':
    main()
