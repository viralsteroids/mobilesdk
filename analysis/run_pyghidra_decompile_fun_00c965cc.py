import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME = "bundle_analysis"
PROGRAM_NAME = "libjnimultiengine.so"
OUT_DIR = Path(r"C:\\temp\\MobileSDK\\decompiled_code")
TARGETS = [0x00c965cc]

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject
from ghidra.app.decompiler import DecompInterface
from ghidra.util.task import ConsoleTaskMonitor

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program = project.openProgram("/", PROGRAM_NAME, False)
fm = program.getFunctionManager()
addr_factory = program.getAddressFactory()
monitor = ConsoleTaskMonitor()
iface = DecompInterface()
iface.openProgram(program)
OUT_DIR.mkdir(exist_ok=True)

for addr in TARGETS:
    a = addr_factory.getAddress(hex(addr))
    func = fm.getFunctionContaining(a) or fm.getFunctionAt(a)
    if func is None:
        print('no function at', hex(addr))
        continue
    print('decomp', hex(addr), func.getName())
    res = iface.decompileFunction(func, 120, monitor)
    if not res.decompileCompleted() or res.getDecompiledFunction() is None:
        print('decompile failed', hex(addr))
        continue
    out_file = OUT_DIR / f"bundle_analysis_symbol_{addr:08x}.c"
    out_file.write_text(res.getDecompiledFunction().getC(), encoding='utf-8')
    print('wrote', out_file)

iface.closeProgram()
project.close()
