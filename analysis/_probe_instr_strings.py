import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\temp\MobileSDK\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\temp\MobileSDK\ghidra_project")
PROJECT_NAME = "bundle_analysis"
PROGRAM_NAME = "libjnimultiengine.so"

addrs = [0x01146bf4, 0x01146c00, 0x01148128, 0x0114a564, 0x0114a570]

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject
from ghidra.program.flatapi import FlatProgramAPI

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program = project.openProgram("/", PROGRAM_NAME, False)
flat = FlatProgramAPI(program)
listing = program.getListing()

print("Program:", program.getName())
for a in addrs:
    addr = flat.toAddr(a)
    instr = listing.getInstructionAt(addr)
    print(hex(a), "->", instr.toString() if instr else "None")

project.close()
