import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME = "bundle_analysis"
PROGRAM_NAME = "libjnimultiengine.so"
OUT_PATH = Path(r"C:\\temp\\MobileSDK\\analysis\\from_embedded_call_targets.txt")

TARGET = 0x0104d20c

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program = project.openProgram("/", PROGRAM_NAME, False)
fm = program.getFunctionManager()
listing = program.getListing()
addr_factory = program.getAddressFactory()

lines = []
func = fm.getFunctionContaining(addr_factory.getAddress(hex(TARGET)))
if func is None:
    lines.append('no function')
else:
    lines.append(f"function {func.getName()} @ {func.getEntryPoint()}")
    for instr in listing.getInstructions(func.getBody(), True):
        if not instr.getFlowType().isCall():
            continue
        flows = instr.getFlows()
        if not flows:
            lines.append(f"  {instr.getAddress()} call (no flow)")
            continue
        for f in flows:
            ffunc = fm.getFunctionAt(f)
            if ffunc is not None:
                lines.append(f"  {instr.getAddress()} -> {ffunc.getName()} {ffunc.getEntryPoint()}")
            else:
                lines.append(f"  {instr.getAddress()} -> {f}")

OUT_PATH.write_text("\n".join(lines), encoding='utf-8')
project.close()
