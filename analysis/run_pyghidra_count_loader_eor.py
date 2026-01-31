import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME = "bundle_analysis"
PROGRAM_NAME = "libjnimultiengine.so"
OUT_PATH = Path(r"C:\\temp\\MobileSDK\\analysis\\loader_func_eor_counts.txt")

TARGETS = [
    0x02558224,
    0x02557344,
    0x026eaa78,
    0x02557a78,
]

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program = project.openProgram("/", PROGRAM_NAME, False)
fm = program.getFunctionManager()
listing = program.getListing()
addr_factory = program.getAddressFactory()

lines = []
for addr in TARGETS:
    a = addr_factory.getAddress(hex(addr))
    func = fm.getFunctionContaining(a) or fm.getFunctionAt(a)
    if func is None:
        lines.append(f"no function at {hex(addr)}")
        continue
    eor = 0
    total = 0
    for instr in listing.getInstructions(func.getBody(), True):
        total += 1
        if instr.getMnemonicString().upper() == 'EOR':
            eor += 1
    lines.append(f"{func.getName()} @ {func.getEntryPoint()} instr={total} eor={eor}")

OUT_PATH.write_text("\n".join(lines), encoding="utf-8")
project.close()
