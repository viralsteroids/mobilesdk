import argparse
import bz2
import gzip
import hashlib
import io
import struct
import zlib
from pathlib import Path

KEY_VADDR = 0x004909cf
KEY_SIZE = 0x80

MAGICS = {
    'gzip': b'\x1f\x8b',
    'bz2': b'BZh',
    'zstd': b'\x28\xb5\x2f\xfd',
    'zip': b'PK\x03\x04',
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
    return info, header_ok, mini, bytes(body)


def scan_hits(buf):
    hits = {}
    for name, magic in MAGICS.items():
        off = buf.find(magic)
        if off != -1:
            hits[name] = off
    return hits


def try_decompress(kind, data):
    try:
        if kind == 'gzip':
            return gzip.decompress(data)
        if kind == 'bz2':
            return bz2.decompress(data)
        if kind == 'zip':
            return None
    except Exception:
        return None
    return None


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('--key', required=True)
    ap.add_argument('--out-md', required=True)
    ap.add_argument('paths', nargs='+')
    args = ap.parse_args()

    key_table = load_key_table(args.key)
    lines = []
    lines.append('# Decrypted body magic probe')
    lines.append('')

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
            hits = scan_hits(body)
            if not hits:
                continue
            lines.append(f'## {p}')
            lines.append(f'- header_sha1_ok: {header_ok}')
            lines.append(f'- dec_len: {info["dec_len"]}, mini_hex: {mini.hex()}')
            for kind, off in hits.items():
                lines.append(f'- {kind} magic at {off}')
                if kind in ('gzip','bz2'):
                    chunk = body[off:off+200000]
                    out = try_decompress(kind, chunk)
                    if out is None:
                        lines.append('  - decompress: failed')
                    else:
                        lines.append(f'  - decompress: ok ({len(out)} bytes)')
            lines.append('')

    Path(args.out_md).write_text('\n'.join(lines), encoding='utf-8')


if __name__ == '__main__':
    main()
