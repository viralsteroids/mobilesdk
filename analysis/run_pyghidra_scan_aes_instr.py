import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME = "bundle_analysis"
PROGRAM_NAME = "libjnimultiengine.so"
OUT_PATH = Path(r"C:\\temp\\MobileSDK\\analysis\\aes_instr_hits.txt")

MNEMS = {"AESE","AESD","AESMC","AESIMC"}

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program = project.openProgram("/", PROGRAM_NAME, False)
listing = program.getListing()

lines = []
count = 0
for instr in listing.getInstructions(True):
    m = instr.getMnemonicString().upper()
    if m in MNEMS:
        lines.append(f"{instr.getAddress()} {m} {instr.toString()}")
        count += 1

lines.insert(0, f"total={count}")
OUT_PATH.write_text("\n".join(lines), encoding="utf-8")
project.close()
