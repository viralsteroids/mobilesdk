import re
from pathlib import Path

ROOT = Path(r'C:\temp\MobileSDK\PassportScanner_apk')
patterns = [
    re.compile(r'\.se\b', re.IGNORECASE),
    re.compile(r'sebundle', re.IGNORECASE),
    re.compile(r'bundle_', re.IGNORECASE),
    re.compile(r'CreateFromEmbeddedBundle', re.IGNORECASE),
    re.compile(r'InitFromOwnedZipBuffer', re.IGNORECASE),
]

smali_dirs = [p for p in ROOT.iterdir() if p.is_dir() and p.name.startswith('smali')]

hits = []
for sdir in smali_dirs:
    for path in sdir.rglob('*.smali'):
        try:
            lines = path.read_text(encoding='utf-8', errors='ignore').splitlines()
        except Exception:
            continue
        file_hits = []
        for i, line in enumerate(lines, 1):
            for pat in patterns:
                if pat.search(line):
                    file_hits.append((i, line.strip()))
                    break
            if len(file_hits) >= 12:
                break
        if file_hits:
            hits.append((path, file_hits))

out_md = Path(r'C:\temp\MobileSDK\analysis\smali_bundle_refs.md')
out_csv = Path(r'C:\temp\MobileSDK\analysis\smali_bundle_refs.csv')

with out_md.open('w', encoding='ascii', errors='ignore') as md:
    md.write('# Smali bundle references\n\n')
    md.write(f'Total files with hits: {len(hits)}\n\n')
    for path, file_hits in hits:
        md.write(f'## {path}\n')
        for ln, txt in file_hits:
            md.write(f'- L{ln}: {txt}\n')
        md.write('\n')

with out_csv.open('w', encoding='ascii', errors='ignore') as csv:
    csv.write('file,line,text\n')
    for path, file_hits in hits:
        for ln, txt in file_hits:
            safe = txt.replace('"','""')
            csv.write(f'"{path}",{ln},"{safe}"\n')

print(f'Wrote {out_md} and {out_csv} ({len(hits)} files)')
