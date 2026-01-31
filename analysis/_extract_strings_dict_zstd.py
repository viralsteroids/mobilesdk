import re
from pathlib import Path

path = Path(r"C:\temp\MobileSDK\SmartEngines_apktool\lib\arm64-v8a\libjnimultiengine.so")
data = path.read_bytes()
# extract ASCII strings length>=4
strings = re.findall(rb"[\x20-\x7e]{4,}", data)

def filt(s):
    sl = s.lower()
    return b'dict' in sl or b'zstd' in sl

hits = [s.decode('ascii', errors='ignore') for s in strings if filt(s)]

out_path = Path(r"C:\temp\MobileSDK\analysis\apktool_strings_dict_zstd.txt")
out_path.write_text("\n".join(sorted(set(hits))), encoding='utf-8')
print(out_path)
