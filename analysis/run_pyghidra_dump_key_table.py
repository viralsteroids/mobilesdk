import pyghidra
from pathlib import Path

GHIDRA_INSTALL=Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR=Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME="bundle_analysis"
PROGRAM_NAME="libjnimultiengine.so"
OUT_BIN=Path(r"C:\\temp\\MobileSDK\\analysis\\key_table_004909cf.bin")
OUT_TXT=Path(r"C:\\temp\\MobileSDK\\analysis\\key_table_004909cf.txt")

ADDR=0x004909cf
SIZE=0x80

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project=GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program=project.openProgram("/", PROGRAM_NAME, False)
mem=program.getMemory()
addr_factory=program.getAddressFactory()

addr=addr_factory.getAddress(hex(ADDR))
buf=bytearray(SIZE)
mem.getBytes(addr, buf)
OUT_BIN.write_bytes(bytes(buf))
hex_lines=[]
for i in range(0,SIZE,16):
    chunk=buf[i:i+16]
    hex_lines.append(f"{ADDR+i:08x}: "+" ".join(f"{b:02x}" for b in chunk))
OUT_TXT.write_text("\n".join(hex_lines), encoding='utf-8')

project.close()
