import pyghidra
from pathlib import Path

GHIDRA_INSTALL=Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR=Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME="bundle_analysis"
PROGRAM_NAME="libjnimultiengine.so"
OUT_PATH=Path(r"C:\\temp\\MobileSDK\\analysis\\block_info_xrefs_02557bc0.txt")

ADDRESSES=[0x0068172c,0x008900cc,0x0062e0d0,0x0062e0ef,0x028cc0f8]

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project=GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program=project.openProgram("/", PROGRAM_NAME, False)
mem=program.getMemory()
addr_factory=program.getAddressFactory()

lines=[]
for a in ADDRESSES:
    addr=addr_factory.getAddress(hex(a))
    block=mem.getBlock(addr)
    if block:
        lines.append(f"{addr} block={block.getName()} start={block.getStart()} init={block.isInitialized()} len=0x{block.getSize():x}")
    else:
        lines.append(f"{addr} block=None")

OUT_PATH.write_text("\n".join(lines), encoding='utf-8')
project.close()
