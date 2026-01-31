import os, zipfile
root = r"C:\\temp\\MobileSDK"
rows = []
for dirpath, _, filenames in os.walk(root):
    for fn in filenames:
        if fn.lower().endswith('.apk'):
            path = os.path.join(dirpath, fn)
            try:
                with zipfile.ZipFile(path) as z:
                    names = z.namelist()
                    if any('frida-gadget' in n for n in names):
                        cfg = [n for n in names if 'gadget.config' in n or 'gadget.config.so' in n]
                        rows.append((path, cfg))
            except Exception:
                pass

print('found', len(rows), 'apks with frida-gadget')
for path, cfg in rows[:30]:
    print(path, 'config:', cfg)

out = os.path.join(root, 'analysis', 'apk_frida_gadget_scan.txt')
os.makedirs(os.path.dirname(out), exist_ok=True)
with open(out, 'w', encoding='utf-8') as f:
    for path, cfg in rows:
        f.write(path + "\n")
        for c in cfg:
            f.write("  " + c + "\n")
        f.write("\n")
print('wrote', out)
