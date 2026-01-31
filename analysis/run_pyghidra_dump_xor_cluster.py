import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME = "bundle_analysis"
PROGRAM_NAME = "libjnimultiengine.so"
OUT_PATH = Path(r"C:\\temp\\MobileSDK\\analysis\\xor_cluster_instr_dump.txt")

START = 0x01309f00
END = 0x0130a3e4

pyghidra.start(install_dir=str(GHIDRA_INSTALL))

from ghidra.base.project import GhidraProject
from ghidra.util.task import ConsoleTaskMonitor

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program = project.openProgram("/", PROGRAM_NAME, False)
monitor = ConsoleTaskMonitor()

listing = program.getListing()
addr_factory = program.getAddressFactory()
start = addr_factory.getAddress(hex(START))
end = addr_factory.getAddress(hex(END))

instr = listing.getInstructionAt(start)
lines = []
counts = {}
while instr is not None and instr.getAddress().compareTo(end) <= 0:
    mnem = instr.getMnemonicString()
    counts[mnem] = counts.get(mnem, 0) + 1
    lines.append("%s\t%s" % (instr.getAddress(), instr.toString()))
    instr = instr.getNext()

summary = ["XOR cluster instruction dump", "Range: 0x%08x-0x%08x" % (START, END), "", "Mnemonic counts:"]
for k in sorted(counts.keys()):
    summary.append("%s: %d" % (k, counts[k]))
summary.append("")
summary.extend(lines)

OUT_PATH.write_text("\n".join(summary), encoding="utf-8")
print("wrote", OUT_PATH)

project.close()
