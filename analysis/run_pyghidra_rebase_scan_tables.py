import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME = "bundle_analysis"
PROGRAM_NAME = "libjnimultiengine.so"
OUT_PATH = Path(r"C:\\temp\\MobileSDK\\analysis\\decoder_chain_tables_rebase_scan.txt")

TABLES = [0x0062e050, 0x0062e140]
COUNT = 40
REBASE = 0x02300000

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program = project.openProgram("/", PROGRAM_NAME, False)
mem = program.getMemory()
fm = program.getFunctionManager()
addr_factory = program.getAddressFactory()

lines = [f"rebase={hex(REBASE)}"]
for base in TABLES:
    lines.append(f"table {hex(base)}")
    a = addr_factory.getAddress(hex(base))
    for i in range(COUNT):
        addr = a.add(i*8)
        try:
            v0 = mem.getInt(addr) & 0xffffffff
            v1 = mem.getInt(addr.add(4)) & 0xffffffff
        except Exception:
            break
        fn_addr = v1 + REBASE
        name = ''
        try:
            f = fm.getFunctionContaining(addr_factory.getAddress(hex(fn_addr)))
            name = f.getName() if f else ''
        except Exception:
            name = ''
        lines.append(f"  {addr} pair=0x{v0:08x},0x{v1:08x} -> 0x{fn_addr:08x} {name}")
    lines.append("")

OUT_PATH.write_text("\n".join(lines), encoding='utf-8')
project.close()
