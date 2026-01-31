import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME = "bundle_analysis"
PROGRAM_NAME = "libjnimultiengine.so"
OUT_PATH = Path(r"C:\\temp\\MobileSDK\\analysis\\decoder_chain_xrefs_updated.txt")

TARGETS = [0x02558a08, 0x02557a14, 0x02557a90, 0x026eaef0, 0x02557c60]

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program = project.openProgram("/", PROGRAM_NAME, False)
rm = program.getReferenceManager()
fm = program.getFunctionManager()
addr_factory = program.getAddressFactory()

lines = []
for addr in TARGETS:
    a = addr_factory.getAddress(hex(addr))
    func = fm.getFunctionAt(a) or fm.getFunctionContaining(a)
    lines.append(f"target {hex(addr)} func={func.getName() if func else 'none'}")
    refs = rm.getReferencesTo(a)
    for ref in refs:
        from_addr = ref.getFromAddress()
        from_func = fm.getFunctionContaining(from_addr)
        lines.append(f"  {from_addr} in {from_func.getName() if from_func else '??'} type={ref.getReferenceType()}")
    lines.append("")

OUT_PATH.write_text("\n".join(lines), encoding='utf-8')
project.close()
