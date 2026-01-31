import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME = "bundle_analysis"
PROGRAM_NAME = "libjnimultiengine.so"
OUT_PATH = Path(r"C:\\temp\\MobileSDK\\analysis\\addr_immediate_hits_68170c.txt")

RANGES = [(0x00681000,0x00682000),(0x0062e000,0x0062f000)]

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject
from ghidra.program.model.scalar import Scalar

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program = project.openProgram("/", PROGRAM_NAME, False)
listing = program.getListing()

lines = []
count = 0
for instr in listing.getInstructions(True):
    # only .text
    addr = instr.getAddress()
    if not addr.isMemoryAddress():
        continue
    # inspect scalar operands
    for op_index in range(instr.getNumOperands()):
        objs = instr.getOpObjects(op_index)
        for obj in objs:
            if isinstance(obj, Scalar):
                val = obj.getValue()
                for lo,hi in RANGES:
                    if lo <= val < hi:
                        lines.append(f"{addr} {instr} scalar=0x{val:x}")
                        count += 1
                        break

lines.insert(0, f"hits={count}")
OUT_PATH.write_text("\n".join(lines), encoding='utf-8')
project.close()
