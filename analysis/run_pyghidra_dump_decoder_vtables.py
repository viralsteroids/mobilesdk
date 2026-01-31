import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME = "bundle_analysis"
PROGRAM_NAME = "libjnimultiengine.so"
OUT_PATH = Path(r"C:\\temp\\MobileSDK\\analysis\\decoder_chain_vtable_refs.txt")

BASES = [0x0062e050, 0x0062e140, 0x0068170c, 0x0068171c, 0x0068173c]

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program = project.openProgram("/", PROGRAM_NAME, False)
mem = program.getMemory()
fm = program.getFunctionManager()
addr_factory = program.getAddressFactory()

lines = []
for base in BASES:
    a = addr_factory.getAddress(hex(base))
    lines.append(f"base {hex(base)}")
    for i in range(0, 20):
        addr = a.add(i*8)
        try:
            val = mem.getLong(addr)
        except Exception:
            break
        name = ''
        if val != 0:
            try:
                f = fm.getFunctionAt(addr_factory.getAddress(hex(val)))
                name = f.getName() if f else ''
            except Exception:
                name = ''
        lines.append(f"  {addr} -> {hex(val)} {name}")
    lines.append("")

OUT_PATH.write_text("\n".join(lines), encoding='utf-8')
project.close()
