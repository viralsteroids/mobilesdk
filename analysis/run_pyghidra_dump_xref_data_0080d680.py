import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME = "bundle_analysis"
PROGRAM_NAME = "libjnimultiengine.so"
OUT_PATH = Path(r"C:\\temp\\MobileSDK\\analysis\\xref_data_0080d680_dump.txt")

BASE = 0x0080d680
COUNT = 40

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program = project.openProgram("/", PROGRAM_NAME, False)
mem = program.getMemory()
addr_factory = program.getAddressFactory()

lines = [f"base {hex(BASE)}"]
for i in range(COUNT):
    addr = addr_factory.getAddress(hex(BASE + i*4))
    try:
        v = mem.getInt(addr) & 0xffffffff
    except Exception:
        break
    lines.append(f"  {addr} -> 0x{v:08x}")

OUT_PATH.write_text("\n".join(lines), encoding='utf-8')
project.close()
