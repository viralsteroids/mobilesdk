import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME = "bundle_analysis"
PROGRAM_NAME = "libjnimultiengine.so"
OUT_PATH = Path(r"C:\\temp\\MobileSDK\\analysis\\reloc_refs_68170c.txt")

TARGET = 0x0068170c
RANGE = (0x0068170c, 0x00681800)

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program = project.openProgram("/", PROGRAM_NAME, False)
relocs = program.getRelocationTable()
addr_factory = program.getAddressFactory()

lines = []
for r in relocs.getRelocations():
    try:
        val = r.getValue()
    except Exception:
        val = None
    if val is not None:
        try:
            v = int(val)
        except Exception:
            v = None
        if v is not None and RANGE[0] <= v < RANGE[1]:
            lines.append(f"reloc at {r.getAddress()} val=0x{v:x} type={r.getType()}")

OUT_PATH.write_text("\n".join(lines), encoding='utf-8')
project.close()
