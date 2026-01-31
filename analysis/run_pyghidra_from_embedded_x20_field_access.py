import pyghidra
from pathlib import Path

GHIDRA_INSTALL=Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR=Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME="bundle_analysis"
PROGRAM_NAME="libjnimultiengine.so"
OUT_PATH=Path(r"C:\\temp\\MobileSDK\\analysis\\from_embedded_x20_field_access.txt")

TARGET=0x0104d20c
PATTERNS=["[x20, #0x10]","[x20,#0x10]","[x20, #0x18]","[x20,#0x18]"]

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project=GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program=project.openProgram("/", PROGRAM_NAME, False)
fm=program.getFunctionManager()
listing=program.getListing()
addr_factory=program.getAddressFactory()

func=fm.getFunctionContaining(addr_factory.getAddress(hex(TARGET)))
lines=[]
if func:
    for instr in listing.getInstructions(func.getBody(), True):
        s=str(instr)
        if any(p in s for p in PATTERNS):
            lines.append(f"{instr.getAddress()} {s}")

OUT_PATH.write_text("\n".join(lines), encoding='utf-8')
project.close()
