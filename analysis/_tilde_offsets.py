import glob
for path in sorted(glob.glob('analysis/bundles/*.se')):
    data = open(path,'rb').read(100)
    tildes = [i for i,b in enumerate(data[:80]) if b==0x7e]
    print(path.split('\\')[-1], tildes)
