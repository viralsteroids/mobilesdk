import pyghidra
from pathlib import Path

GHIDRA_INSTALL=Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR=Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME="bundle_analysis"
PROGRAM_NAME="libjnimultiengine.so"
OUT_PATH=Path(r"C:\\temp\\MobileSDK\\analysis\\table_006ca680_dump.txt")

BASE=0x006ca680
COUNT=40
REBASE=0x02300000

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project=GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program=project.openProgram("/", PROGRAM_NAME, False)
mem=program.getMemory()
fm=program.getFunctionManager()
addr_factory=program.getAddressFactory()

lines=[f"base {hex(BASE)}"]
for i in range(COUNT):
    addr=addr_factory.getAddress(hex(BASE + i*4))
    try:
        v=mem.getInt(addr) & 0xffffffff
    except Exception:
        break
    name=''
    reb=v+REBASE
    try:
        f=fm.getFunctionContaining(addr_factory.getAddress(hex(reb)))
        name=f.getName() if f else ''
    except Exception:
        name=''
    lines.append(f"  {addr} -> 0x{v:08x} + base = 0x{reb:08x} {name}")

OUT_PATH.write_text("\n".join(lines), encoding='utf-8')
project.close()
