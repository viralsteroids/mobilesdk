import pyghidra
from pathlib import Path
from collections import deque

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME = "bundle_analysis"
PROGRAM_NAME = "libjnimultiengine.so"
OUT_PATH = Path(r"C:\\temp\\MobileSDK\\analysis\\from_embedded_call_no_flow_windows.txt")

TARGET = 0x0104d20c

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program = project.openProgram("/", PROGRAM_NAME, False)
fm = program.getFunctionManager()
listing = program.getListing()
addr_factory = program.getAddressFactory()

func = fm.getFunctionContaining(addr_factory.getAddress(hex(TARGET)))
lines = []
if func is None:
    lines.append('no function')
else:
    lines.append(f"function {func.getName()} @ {func.getEntryPoint()}")
    window = deque(maxlen=6)
    for instr in listing.getInstructions(func.getBody(), True):
        window.append(instr)
        if instr.getFlowType().isCall():
            flows = instr.getFlows()
            if not flows or len(flows) == 0:
                lines.append("")
                lines.append(f"call no flow @ {instr.getAddress()} {instr}")
                for w in list(window):
                    lines.append(f"  {w.getAddress()} {w}")

OUT_PATH.write_text("\n".join(lines), encoding='utf-8')
project.close()
