import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\\temp\\MobileSDK\\ghidra_project_phdr")
PROJECT_NAME = "so_files_decompiled_phdr"
PROGRAM_NAME = "libjnimultiengine.so"
OUT_DIR = Path(r"C:\\temp\\MobileSDK\\decompiled_code")

TARGETS = [
    0x0096588c,  # DocEngine::CreateFromEmbeddedBundle
    0x01146748,  # TextEngine::CreateFromEmbeddedBundle
]

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject
from ghidra.app.decompiler import DecompInterface
from ghidra.util.task import ConsoleTaskMonitor

OUT_DIR.mkdir(exist_ok=True)

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program = project.openProgram("/", PROGRAM_NAME, False)
fm = program.getFunctionManager()
addr_factory = program.getAddressFactory()
monitor = ConsoleTaskMonitor()

iface = DecompInterface()
iface.openProgram(program)

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
    c_code = res.getDecompiledFunction().getC()
    out_file = OUT_DIR / f"phdr_bundle_symbol_{addr:08x}.c"
    out_file.write_text(c_code, encoding='utf-8')
    print('wrote', out_file)

iface.closeProgram()
project.close()
