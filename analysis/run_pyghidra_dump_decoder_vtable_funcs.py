import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME = "bundle_analysis"
PROGRAM_NAME = "libjnimultiengine.so"
OUT_PATH = Path(r"C:\\temp\\MobileSDK\\analysis\\decoder_chain_vtable_funcs.txt")

BASE = 0x0068170c
COUNT = 20

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program = project.openProgram("/", PROGRAM_NAME, False)
mem = program.getMemory()
fm = program.getFunctionManager()
addr_factory = program.getAddressFactory()

lines = [f"base {hex(BASE)}"]
for i in range(COUNT):
    addr = addr_factory.getAddress(hex(BASE + i*8 + 4))
    try:
        val = mem.getInt(addr) & 0xffffffff
    except Exception:
        break
    name = ''
    if val != 0:
        try:
            f = fm.getFunctionAt(addr_factory.getAddress(hex(val)))
            name = f.getName() if f else ''
        except Exception:
            name = ''
    lines.append(f"  {addr} -> 0x{val:08x} {name}")

OUT_PATH.write_text("\n".join(lines), encoding='utf-8')
project.close()
