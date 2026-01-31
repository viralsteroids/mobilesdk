import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME = "bundle_analysis"
PROGRAM_NAME = "libjnimultiengine.so"
OUT_PATH = Path(r"C:\\temp\\MobileSDK\\analysis\\loader_callees_eor_counts.csv")

TARGET = 0x02558224

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program = project.openProgram("/", PROGRAM_NAME, False)
fm = program.getFunctionManager()
listing = program.getListing()
addr_factory = program.getAddressFactory()

root_addr = addr_factory.getAddress(hex(TARGET))
root_func = fm.getFunctionContaining(root_addr) or fm.getFunctionAt(root_addr)
if root_func is None:
    OUT_PATH.write_text('no function at target', encoding='utf-8')
    project.close()
    raise SystemExit()

called_funcs = {}
for instr in listing.getInstructions(root_func.getBody(), True):
    if not instr.getFlowType().isCall():
        continue
    flows = instr.getFlows()
    if not flows:
        continue
    for f in flows:
        ffunc = fm.getFunctionAt(f)
        if ffunc is None:
            continue
        called_funcs[ffunc.getEntryPoint()] = ffunc

rows = ["entry,name,instr,eor"]
for ep, func in sorted(called_funcs.items(), key=lambda x: str(x[0])):
    eor = 0
    total = 0
    for instr in listing.getInstructions(func.getBody(), True):
        total += 1
        if instr.getMnemonicString().upper() == 'EOR':
            eor += 1
    rows.append(f"{func.getEntryPoint()},{func.getName()},{total},{eor}")

OUT_PATH.write_text("\n".join(rows), encoding='utf-8')
project.close()
