import re
path = r"C:\\temp\\MobileSDK\\frida-gadget-arm64.so"
with open(path, 'rb') as f:
    data = f.read()

# extract ascii strings >=4
strings = re.findall(rb"[\x20-\x7E]{4,}", data)
keys = [s.decode('utf-8', 'ignore') for s in strings if b"interaction" in s or b"script" in s or b"on_load" in s or b"listen" in s]
# de-dup
seen = set()
for s in keys:
    if s in seen:
        continue
    seen.add(s)
    print(s)
