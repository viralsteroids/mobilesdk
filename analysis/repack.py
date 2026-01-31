import zipfile
src = r"C:\\temp\\MobileSDK\\smartengines_complete_aligned.apk"
dst = r"C:\\temp\\MobileSDK\\smartengines_complete_stored.apk"
with zipfile.ZipFile(src, 'r') as zin, zipfile.ZipFile(dst, 'w') as zout:
    for item in zin.infolist():
        data = zin.read(item.filename)
        compress = zipfile.ZIP_STORED if item.filename.startswith('lib/arm64-v8a/') else zipfile.ZIP_DEFLATED
        zi = zipfile.ZipInfo(item.filename)
        zi.date_time = item.date_time
        zi.external_attr = item.external_attr
        zi.create_system = item.create_system
        zi.flag_bits = item.flag_bits
        zout.writestr(zi, data, compress_type=compress)
print('written', dst)
