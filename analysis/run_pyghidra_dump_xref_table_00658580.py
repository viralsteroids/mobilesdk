import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME = "bundle_analysis"
PROGRAM_NAME = "libjnimultiengine.so"
OUT_PATH = Path(r"C:\\temp\\MobileSDK\\analysis\\xref_table_00658580_dump.txt")

BASE = 0x00658580
COUNT = 20
REBASE = 0x02300000

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program = project.openProgram("/", PROGRAM_NAME, False)
mem = program.getMemory()
fm = program.getFunctionManager()
addr_factory = program.getAddressFactory()

lines = [f"base {hex(BASE)} rebase {hex(REBASE)}"]
for i in range(COUNT):
    addr = addr_factory.getAddress(hex(BASE + i*8))
    try:
        v = mem.getLong(addr)
    except Exception:
        break
    name = ''
    if v != 0:
        try:
            f = fm.getFunctionAt(addr_factory.getAddress(hex(v)))
            name = f.getName() if f else ''
        except Exception:
            name = ''
    lines.append(f"  {addr} -> 0x{v:016x} {name}")

OUT_PATH.write_text("\n".join(lines), encoding='utf-8')
project.close()
