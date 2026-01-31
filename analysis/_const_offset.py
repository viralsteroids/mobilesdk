import binascii, glob
CONST = binascii.unhexlify('76f6f2fb17591a73192c515d55b72060')
for path in sorted(glob.glob('analysis/bundles/*.se')):
    data = open(path,'rb').read(200)
    off = data.find(CONST)
    print(path, off)
