import pyghidra
from pathlib import Path

GHIDRA_INSTALL=Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR=Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME="bundle_analysis"
PROGRAM_NAME="libjnimultiengine.so"
OUT_PATH=Path(r"C:\\temp\\MobileSDK\\analysis\\u32_offset_0257bc0_hits.txt")

TARGET=0x00257bc0
RANGES=[(0x00680000,0x00690000),(0x0062e000,0x00630000)]

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project=GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program=project.openProgram("/", PROGRAM_NAME, False)
mem=program.getMemory()
addr_factory=program.getAddressFactory()

lines=[]
for start,end in RANGES:
    a=addr_factory.getAddress(hex(start))
    e=addr_factory.getAddress(hex(end))
    cur=a
    while cur.compareTo(e)<0:
        try:
            v=mem.getInt(cur)&0xffffffff
        except Exception:
            break
        if v==TARGET:
            lines.append(f"hit {cur} -> 0x{v:08x}")
        cur=cur.add(4)

OUT_PATH.write_text("\n".join(lines), encoding='utf-8')
project.close()
