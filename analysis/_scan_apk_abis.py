import os
import zipfile

root = r"C:\\temp\\MobileSDK"
rows = []

for dirpath, _, filenames in os.walk(root):
    for fn in filenames:
        if fn.lower().endswith('.apk'):
            path = os.path.join(dirpath, fn)
            try:
                with zipfile.ZipFile(path) as z:
                    libs = [n for n in z.namelist() if n.endswith('libjnimultiengine.so') and n.startswith('lib/')]
                    if libs:
                        for lib in libs:
                            parts = lib.split('/')
                            abi = parts[1] if len(parts) > 2 else ''
                            rows.append((path, abi, lib))
            except Exception:
                pass

rows.sort()
print('found', len(rows), 'entries')
for path, abi, lib in rows:
    print(f"{path}\t{abi}\t{lib}")

out_path = os.path.join(root, 'analysis', 'apk_libjnimultiengine_abis.tsv')
os.makedirs(os.path.dirname(out_path), exist_ok=True)
with open(out_path, 'w', encoding='utf-8') as f:
    f.write('apk_path\tabi\tentry\n')
    for path, abi, lib in rows:
        f.write(f"{path}\t{abi}\t{lib}\n")
print('wrote', out_path)
