import hashlib

hex_token = bytes.fromhex('2688f026b0f34dea31b377bfe5fd1f6ecf2b984810')
hex_prefix = bytes.fromhex('2688f026b0f34dea31b377bfe5fd1f6ecf2b9848')
versions = {
    '2.7.2': bytes.fromhex('a6d01f9528847cd118d154e96dd9fd2cd16f7a77'),
    '3.2.0': bytes.fromhex('c2ac4db5c62062bb0d7554d55613991b059fee8a'),
    '2.6.4': bytes.fromhex('3cb11e8c45e443f30057c9e6559c48cbd02c3c16'),
}

candidates = [
    (b'ver', lambda v: v.encode()),
    (b'hex_token', lambda v: hex_token),
    (b'hex_prefix', lambda v: hex_prefix),
    (b'ver+hex_token', lambda v: v.encode()+hex_token),
    (b'ver+hex_prefix', lambda v: v.encode()+hex_prefix),
    (b'hex_token+ver', lambda v: hex_token+v.encode()),
    (b'hex_prefix+ver', lambda v: hex_prefix+v.encode()),
]

def check(name, digest):
    for ver, key in versions.items():
        if digest(ver) == key:
            return ver
    return None

hashes = {
    'sha1': lambda b: hashlib.sha1(b).digest(),
    'sha256': lambda b: hashlib.sha256(b).digest()[:20],
    'md5': lambda b: hashlib.md5(b).digest() + b''
}

for hname, hfn in hashes.items():
    for cname, cfn in candidates:
        def dig(v):
            return hfn(cfn(v))
        match = [ver for ver,key in versions.items() if dig(ver) == key]
        if match:
            print(f'{hname} of {cname.decode()} matches {match}')

print('done')
