import re
from pathlib import Path

text = Path('decompiled_decrypt_functions.txt').read_text(errors='ignore')

# find all function headers
pattern = re.compile(r'^FUNCTION: (.+)$', re.MULTILINE)

matches = list(pattern.finditer(text))

# map function name to slice
blocks = {}
for i,m in enumerate(matches):
    name = m.group(1).strip()
    start = m.start()
    end = matches[i+1].start() if i+1 < len(matches) else len(text)
    blocks[name] = text[start:end]

wanted = ['FUN_01a9e194','FUN_01a7a4f8','FUN_02442ea4','FUN_00afdcb4','FUN_010f9624','FUN_00af449c','FUN_00af296c']

out = []
for w in wanted:
    b = blocks.get(w)
    if not b:
        continue
    out.append('='*80)
    out.append(b.strip())
    out.append('')

Path('analysis/phdr_decompiled_key_funcs.txt').write_text('\n'.join(out), encoding='utf-8')
print('wrote analysis/phdr_decompiled_key_funcs.txt')
