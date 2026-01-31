import zipfile
path = r"C:\\temp\\MobileSDK\\smartengines_frida2.apk"
with zipfile.ZipFile(path) as z:
    data = z.read('lib/arm64-v8a/libfrida-gadget.config.so')
print(data.decode('utf-8', errors='replace'))
