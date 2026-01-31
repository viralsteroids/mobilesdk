import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME = "bundle_analysis"
PROGRAM_NAME = "libjnimultiengine.so"
OUT_PATH = Path(r"C:\\temp\\MobileSDK\\analysis\\xor_candidate_instr_counts.txt")

CANDIDATES = [
    0x014099e0,
    0x027de380,
    0x02801674,
    0x00c9448c,
]
RANGE_LEN = 0x1000

pyghidra.start(install_dir=str(GHIDRA_INSTALL))

from ghidra.base.project import GhidraProject
from ghidra.util.task import ConsoleTaskMonitor

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program = project.openProgram("/", PROGRAM_NAME, False)

listing = program.getListing()
addr_factory = program.getAddressFactory()

lines = []
for addr in CANDIDATES:
    start = addr_factory.getAddress(hex(addr))
    end = addr_factory.getAddress(hex(addr + RANGE_LEN))
    instr = listing.getInstructionAt(start)
    counts = {}
    while instr is not None and instr.getAddress().compareTo(end) <= 0:
        mnem = instr.getMnemonicString()
        counts[mnem] = counts.get(mnem, 0) + 1
        instr = instr.getNext()
    lines.append("Candidate 0x%08x range 0x%x" % (addr, RANGE_LEN))
    for k in sorted(counts.keys()):
        lines.append("  %s: %d" % (k, counts[k]))
    lines.append("")

OUT_PATH.write_text("\n".join(lines), encoding="utf-8")
print("wrote", OUT_PATH)

project.close()
