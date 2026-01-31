import pyghidra
from pathlib import Path

GHIDRA_INSTALL=Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR=Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME="bundle_analysis"
PROGRAM_NAME="libjnimultiengine.so"
OUT_PATH=Path(r"C:\\temp\\MobileSDK\\analysis\\xrefs_fun_0104fc84.txt")

TARGET=0x0104fc84

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project=GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program=project.openProgram("/", PROGRAM_NAME, False)
rm=program.getReferenceManager()
fm=program.getFunctionManager()
addr_factory=program.getAddressFactory()

lines=[]
a=addr_factory.getAddress(hex(TARGET))
for ref in rm.getReferencesTo(a):
    fa=ref.getFromAddress()
    func=fm.getFunctionContaining(fa)
    lines.append(f"{fa} in {func.getName() if func else '??'} type={ref.getReferenceType()}")

OUT_PATH.write_text("\n".join(lines), encoding='utf-8')
project.close()
