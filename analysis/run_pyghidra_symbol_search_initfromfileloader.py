import pyghidra
from pathlib import Path

GHIDRA_INSTALL=Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR=Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME="bundle_analysis"
PROGRAM_NAME="libjnimultiengine.so"
OUT_PATH=Path(r"C:\\temp\\MobileSDK\\analysis\\symbol_search_initfromfileloader.txt")

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project=GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program=project.openProgram("/", PROGRAM_NAME, False)

symtab=program.getSymbolTable()
results=[]
for sym in symtab.getAllSymbols(True):
    name=sym.getName()
    if "InitFromFileLoader" in name or "FromFileLoader" in name:
        results.append(f"{name} @ {sym.getAddress()} type={sym.getSymbolType()}")

OUT_PATH.write_text("\n".join(results), encoding='utf-8')
project.close()
