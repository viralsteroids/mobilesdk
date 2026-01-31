import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME = "bundle_analysis"
PROGRAM_NAME = "libjnimultiengine.so"
TARGETS = [0x014099e0, 0x027de380, 0x02801674, 0x00c9448c]

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program = project.openProgram("/", PROGRAM_NAME, False)
fm = program.getFunctionManager()
addr_factory = program.getAddressFactory()

for addr in TARGETS:
    a = addr_factory.getAddress(hex(addr))
    func = fm.getFunctionContaining(a) or fm.getFunctionAt(a)
    if func is None:
        print(hex(addr), '->', 'no function')
    else:
        print(hex(addr), '->', func.getName(), func.getEntryPoint(), 'size', func.getBody().getNumAddresses())

project.close()
