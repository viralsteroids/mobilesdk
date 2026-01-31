import pyghidra
from pathlib import Path

GHIDRA_INSTALL=Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR=Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME="bundle_analysis"
PROGRAM_NAME="libjnimultiengine.so"
OUT_PATH=Path(r"C:\\temp\\MobileSDK\\analysis\\data_at_xrefs_02557bc0.txt")

ADDRESSES=[0x0068172c,0x008900cc,0x0062e0d0,0x0062e0d2,0x0062e0ef,0x0062e0fa,0x028cc0f8]

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project=GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program=project.openProgram("/", PROGRAM_NAME, False)
mem=program.getMemory()
addr_factory=program.getAddressFactory()

lines=[]
for a in ADDRESSES:
    addr=addr_factory.getAddress(hex(a))
    try:
        buf=bytearray(8)
        mem.getBytes(addr, buf)
        v=int.from_bytes(bytes(buf), 'little', signed=False)
        line=f"{addr} bytes={list(buf)} u64=0x{v:016x} u32=0x{(v & 0xffffffff):08x}"
    except Exception as e:
        line=f"{addr} <error> {e}"
    lines.append(line)

OUT_PATH.write_text("\n".join(lines), encoding='utf-8')
project.close()
