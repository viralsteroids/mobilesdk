import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME = "bundle_analysis"
PROGRAM_NAME = "libjnimultiengine.so"
OUT_PATH = Path(r"C:\\temp\\MobileSDK\\analysis\\disasm_02557c60.txt")

START = 0x02557c20
END = 0x02557d20

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program = project.openProgram("/", PROGRAM_NAME, False)
listing = program.getListing()
addr_factory = program.getAddressFactory()

lines = []
addr = addr_factory.getAddress(hex(START))
end = addr_factory.getAddress(hex(END))

instr = listing.getInstructionAt(addr)
while instr is not None and instr.getAddress().compareTo(end) < 0:
    lines.append(f"{instr.getAddress()} {instr}")
    instr = instr.getNext()

OUT_PATH.write_text("\n".join(lines), encoding="utf-8")
project.close()
