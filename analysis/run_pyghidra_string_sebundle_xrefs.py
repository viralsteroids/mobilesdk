import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME = "bundle_analysis"
PROGRAM_NAME = "libjnimultiengine.so"
OUT_PATH = Path(r"C:\\temp\\MobileSDK\\analysis\\string_sebundle_xrefs.txt")

TARGET_STR = "sebundle1"

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject
from ghidra.program.model.data import StringDataInstance

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program = project.openProgram("/", PROGRAM_NAME, False)
listing = program.getListing()
rm = program.getReferenceManager()
fm = program.getFunctionManager()

lines = []
# iterate defined data for strings
for data in listing.getDefinedData(True):
    try:
        s = data.getValue()
    except Exception:
        continue
    if s is None:
        continue
    if isinstance(s, str) and TARGET_STR in s:
        addr = data.getAddress()
        lines.append(f"string {s} @ {addr}")
        for ref in rm.getReferencesTo(addr):
            fa = ref.getFromAddress()
            func = fm.getFunctionContaining(fa)
            lines.append(f"  xref {fa} in {func.getName() if func else '??'} type={ref.getReferenceType()}")
        lines.append("")

OUT_PATH.write_text("\n".join(lines), encoding='utf-8')
project.close()
