import pyghidra
from pathlib import Path

GHIDRA_INSTALL=Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR=Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME="bundle_analysis"
PROGRAM_NAME="libjnimultiengine.so"
OUT_PATH=Path(r"C:\\temp\\MobileSDK\\analysis\\header_const_pattern_hits.txt")

PAT=bytes.fromhex('76 f6 f2 fb 17 59 1a 73 19 2c 51 5d 55 b7 20 60')

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject
from ghidra.util.task import ConsoleTaskMonitor

project=GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program=project.openProgram("/", PROGRAM_NAME, False)
mem=program.getMemory()
addr_factory=program.getAddressFactory()

lines=[]
for block in mem.getBlocks():
    if not block.isInitialized():
        continue
    if not block.isRead():
        continue
    size=block.getSize()
    if size<=0:
        continue
    try:
        buf=bytearray(size)
        mem.getBytes(block.getStart(), buf)
    except Exception:
        continue
    data=bytes(buf)
    start=0
    while True:
        idx=data.find(PAT, start)
        if idx==-1:
            break
        addr=block.getStart().add(idx)
        lines.append(f"hit {addr} block={block.getName()} offset=0x{idx:x}")
        start=idx+1

OUT_PATH.write_text("\n".join(lines), encoding='utf-8')
project.close()
