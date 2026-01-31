import pyghidra
from pathlib import Path
from collections import defaultdict

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME = "bundle_analysis"
PROGRAM_NAME = "libjnimultiengine.so"
OUT_PATH = Path(r"C:\\temp\\MobileSDK\\analysis\\xrefs_to_xor_tables.txt")

RANGE_START = 0x005536a0
RANGE_END = 0x00553900
TARGETS = [0x0065858c]

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program = project.openProgram("/", PROGRAM_NAME, False)
rm = program.getReferenceManager()
fm = program.getFunctionManager()
addr_factory = program.getAddressFactory()

hits = defaultdict(set)

# range refs
addr = addr_factory.getAddress(hex(RANGE_START))
end = addr_factory.getAddress(hex(RANGE_END))
cur = addr
while cur.compareTo(end) < 0:
    for ref in rm.getReferencesTo(cur):
        fa = ref.getFromAddress()
        func = fm.getFunctionContaining(fa)
        hits[cur.toString()].add((fa.toString(), func.getName() if func else '??', ref.getReferenceType().toString()))
    cur = cur.add(4)

# specific target refs
for t in TARGETS:
    a = addr_factory.getAddress(hex(t))
    for ref in rm.getReferencesTo(a):
        fa = ref.getFromAddress()
        func = fm.getFunctionContaining(fa)
        hits[a.toString()].add((fa.toString(), func.getName() if func else '??', ref.getReferenceType().toString()))

lines = []
for k in sorted(hits.keys()):
    lines.append(f"target {k}")
    for fa, fname, rtype in sorted(hits[k]):
        lines.append(f"  {fa} in {fname} type={rtype}")
    lines.append("")

OUT_PATH.write_text("\n".join(lines), encoding='utf-8')
project.close()
