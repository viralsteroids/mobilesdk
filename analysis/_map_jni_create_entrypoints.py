import struct
from pathlib import Path

LIB_CANDIDATES = [
    Path(r'C:\temp\MobileSDK\analysis\libjnimultiengine.so'),
    Path(r'C:\temp\MobileSDK\analysis\libjnimultiengine_current.so'),
    Path(r'C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so'),
    Path(r'C:\temp\MobileSDK\SmartEngines_apktool\lib\arm64-v8a\libjnimultiengine.so'),
]

TARGET_NAMES = {
    'Java_com_smartengines_text_jnitextengineJNI_TextEngine_1Create_1_1SWIG_12',
    'Java_com_smartengines_doc_jnidocengineJNI_DocEngine_1Create_1_1SWIG_12',
    'Java_com_smartengines_code_jnicodeengineJNI_CodeEngine_1Create_1_1SWIG_12',
    'Java_com_smartengines_id_jniidengineJNI_IdEngine_1Create_1_1SWIG_14',
}

def load_entries(path):
    data = path.read_bytes()

    # ELF64 LE
    if data[:4] != b'\x7fELF' or data[4] != 2 or data[5] != 1:
        raise SystemExit('Unsupported ELF format')

    # ELF header
    (e_shoff,) = struct.unpack_from('<Q', data, 0x28)
    (e_shentsize,) = struct.unpack_from('<H', data, 0x3A)
    (e_shnum,) = struct.unpack_from('<H', data, 0x3C)
    (e_shstrndx,) = struct.unpack_from('<H', data, 0x3E)

    # Read section headers
    sections = []
    for i in range(e_shnum):
        off = e_shoff + i * e_shentsize
        sh = struct.unpack_from('<IIQQQQIIQQ', data, off)
        sections.append(sh)

    # Load section header string table
    sh_name, sh_type, sh_flags, sh_addr, sh_offset, sh_size, sh_link, sh_info, sh_addralign, sh_entsize = sections[e_shstrndx]
    shstrtab = data[sh_offset:sh_offset + sh_size]

    def get_sh_name(name_off):
        end = shstrtab.find(b'\x00', name_off)
        if end == -1:
            return ''
        return shstrtab[name_off:end].decode('ascii', errors='ignore')

    # Find dynsym and dynstr
    idx_dynsym = None
    idx_dynstr = None
    for i, sh in enumerate(sections):
        name = get_sh_name(sh[0])
        if name == '.dynsym':
            idx_dynsym = i
        elif name == '.dynstr':
            idx_dynstr = i

    if idx_dynsym is None or idx_dynstr is None:
        return []

    sh_dynsym = sections[idx_dynsym]
    sh_dynstr = sections[idx_dynstr]

    _, _, _, _, dynsym_off, dynsym_size, _, _, _, dynsym_entsize = sh_dynsym
    _, _, _, _, dynstr_off, dynstr_size, _, _, _, _ = sh_dynstr

    if dynsym_entsize == 0:
        dynsym_entsize = 24

    dynstr = data[dynstr_off:dynstr_off + dynstr_size]

    def get_str(off):
        if off >= len(dynstr):
            return ''
        end = dynstr.find(b'\x00', off)
        if end == -1:
            return ''
        return dynstr[off:end].decode('ascii', errors='ignore')

    # PT_LOAD segments for vaddr->file offset mapping
    phoff = struct.unpack_from('<Q', data, 0x20)[0]
    phentsize = struct.unpack_from('<H', data, 0x36)[0]
    phnum = struct.unpack_from('<H', data, 0x38)[0]
    segs = []
    for i in range(phnum):
        off = phoff + i * phentsize
        p_type = struct.unpack_from('<I', data, off)[0]
        if p_type != 1:
            continue
        p_offset = struct.unpack_from('<Q', data, off + 8)[0]
        p_vaddr = struct.unpack_from('<Q', data, off + 0x10)[0]
        p_filesz = struct.unpack_from('<Q', data, off + 0x20)[0]
        p_flags = struct.unpack_from('<I', data, off + 4)[0]
        segs.append((p_offset, p_vaddr, p_filesz, p_flags))

    def vaddr_to_file(vaddr):
        for p_offset, p_vaddr, p_filesz, _ in segs:
            if p_vaddr <= vaddr < p_vaddr + p_filesz:
                return p_offset + (vaddr - p_vaddr)
        return None

    entries = []
    for off in range(dynsym_off, dynsym_off + dynsym_size, dynsym_entsize):
        st_name, st_info, st_other, st_shndx, st_value, st_size = struct.unpack_from('<IBBHQQ', data, off)
        name = get_str(st_name)
        if not name:
            continue
        if name in TARGET_NAMES:
            file_off = vaddr_to_file(st_value)
            entries.append((name, st_value, st_size, file_off))

    entries.sort(key=lambda x: x[0])
    return entries


best_path = None
best_entries = []
first_existing = None

for p in LIB_CANDIDATES:
    if not p.exists():
        continue
    if first_existing is None:
        first_existing = p
    entries = load_entries(p)
    if len(entries) > len(best_entries):
        best_entries = entries
        best_path = p
    if len(entries) == len(TARGET_NAMES):
        best_entries = entries
        best_path = p
        break

if best_path is None:
    if first_existing is None:
        raise SystemExit('libjnimultiengine.so not found')
    best_path = first_existing

entries = best_entries
lib_path = best_path

if not entries:
    raise SystemExit('No target JNI symbols found in dynsym for candidate libs')

out_md = Path(r'C:\temp\MobileSDK\analysis\jni_create_entrypoints.md')
out_csv = Path(r'C:\temp\MobileSDK\analysis\jni_create_entrypoints.csv')

with out_md.open('w', encoding='ascii', errors='ignore') as md:
    md.write('# JNI create entrypoints (dynsym)\n\n')
    md.write(f'ELF: {lib_path}\n\n')
    md.write('| symbol | vaddr | file_offset | size |\n')
    md.write('| --- | --- | --- | --- |\n')
    for name, vaddr, size, file_off in entries:
        vaddr_hex = f'0x{vaddr:x}' if vaddr else '0x0'
        file_hex = f'0x{file_off:x}' if file_off is not None else '-'
        md.write(f'| {name} | {vaddr_hex} | {file_hex} | 0x{size:x} |\n')

with out_csv.open('w', encoding='ascii', errors='ignore') as csv:
    csv.write('symbol,vaddr,file_offset,size\n')
    for name, vaddr, size, file_off in entries:
        csv.write(f'"{name}",0x{vaddr:x},"{("0x%x"%file_off) if file_off is not None else ""}",0x{size:x}\n')

print(f'Wrote {out_md} and {out_csv} ({len(entries)} symbols)')
