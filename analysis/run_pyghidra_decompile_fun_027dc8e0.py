import pyghidra
from pathlib import Path

GHIDRA_INSTALL=Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR=Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME="bundle_analysis"
PROGRAM_NAME="libjnimultiengine.so"
OUT_DIR=Path(r"C:\\temp\\MobileSDK\\decompiled_code")
TARGET=0x027dc8e0

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject
from ghidra.app.decompiler import DecompInterface
from ghidra.util.task import ConsoleTaskMonitor

project=GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program=project.openProgram("/", PROGRAM_NAME, False)
fm=program.getFunctionManager()
addr_factory=program.getAddressFactory()
monitor=ConsoleTaskMonitor()
iface=DecompInterface(); iface.openProgram(program)
OUT_DIR.mkdir(exist_ok=True)

addr=addr_factory.getAddress(hex(TARGET))
func=fm.getFunctionContaining(addr) or fm.getFunctionAt(addr)
if func:
    res=iface.decompileFunction(func, 120, monitor)
    if res.decompileCompleted() and res.getDecompiledFunction():
        out=OUT_DIR/ f"bundle_analysis_symbol_{TARGET:08x}.c"
        out.write_text(res.getDecompiledFunction().getC(), encoding='utf-8')
        print('wrote', out)
    else:
        print('decompile failed')
else:
    print('no function')

iface.closeProgram(); project.close()
