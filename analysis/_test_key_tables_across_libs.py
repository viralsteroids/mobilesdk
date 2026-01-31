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


def load_key_table_from_elf(path, vaddr=KEY_VADDR, size=KEY_SIZE):
    data = Path(path).read_bytes()
    if data[:4] != b'\x7fELF' or data[4] != 2:
        raise ValueError('not 64-bit ELF')
    off = vaddr_to_offset(data, vaddr)
    if off is None:
        raise ValueError('vaddr not file-backed')
    return data[off:off+size]


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
    token_hex = token[:40]
    token_dec = token[40:]
    if not token_dec.isdigit():
        raise ValueError('token tail not decimal')
    dec_len = int(token_dec)
    header_end = t3 + 1
    return {'fmtver': fmtver, 'engine_version': engine_version, 'dec_len': dec_len, 'header_end': header_end}


def header_sha1_ok(data, key_table):
    info = parse_header(data)
    payload = data[info['header_end'] :]
    if len(payload) < 0x14 + info['dec_len']:
        return info, False
    sha1 = hashlib.sha1(data[: info['header_end']]).digest()
    header_xor = bytes(payload[i] ^ key_table[i] for i in range(0x14))
    return info, header_xor == sha1


def main():
    root = Path('.')
    lib_paths = [p for p in root.rglob('libjnimultiengine.so')]
    bundles = [
        Path('extracted_bundles/assets/bundle_codeengine_full.se'),
        Path('extracted_bundles/assets/bundle_international_faces_liveness.se'),
        Path('extracted_bundles/assets/bundle_newdocengine_demo_hiring_dsn.se'),
        Path('extracted_bundles/assets/bundle_textengine.se'),
    ]
    out_csv = Path('analysis/key_table_crosscheck.csv')
    rows = []
    for lib in lib_paths:
        try:
            key_table = load_key_table_from_elf(lib)
        except Exception:
            continue
        for bundle in bundles:
            if not bundle.exists():
                continue
            data = bundle.read_bytes()
            try:
                info, ok = header_sha1_ok(data, key_table)
            except Exception:
                continue
            rows.append({
                'lib_path': str(lib),
                'bundle': str(bundle),
                'engine_version': info['engine_version'],
                'dec_len': info['dec_len'],
                'header_sha1_ok': ok,
            })
    out_csv.parent.mkdir(parents=True, exist_ok=True)
    with out_csv.open('w', newline='', encoding='utf-8') as f:
        writer = csv.DictWriter(f, fieldnames=['lib_path','bundle','engine_version','dec_len','header_sha1_ok'])
        writer.writeheader()
        writer.writerows(rows)

    # simple md summary
    out_md = Path('analysis/key_table_crosscheck.md')
    ok_rows = [r for r in rows if r['header_sha1_ok']]
    lines = ['# Key table cross-check', '']
    lines.append(f'- Libraries scanned: {len(lib_paths)}')
    lines.append(f'- Bundle checks: {len(rows)}')
    lines.append(f'- header_sha1_ok hits: {len(ok_rows)}')
    lines.append('')
    if ok_rows:
        lines.append('Matches:')
        lines.append('')
        lines.append('| lib_path | bundle | engine_version | dec_len |')
        lines.append('| --- | --- | --- | --- |')
        for r in ok_rows:
            lines.append(f"| {r['lib_path']} | {r['bundle']} | {r['engine_version']} | {r['dec_len']} |")
    out_md.write_text('\n'.join(lines), encoding='utf-8')


if __name__ == '__main__':
    main()
