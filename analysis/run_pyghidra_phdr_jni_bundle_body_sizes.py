import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\\temp\\MobileSDK\\ghidra_project_phdr")
PROJECT_NAME = "so_files_decompiled_phdr"
PROGRAM_NAME = "libjnimultiengine.so"
OUT_PATH = Path(r"C:\\temp\\MobileSDK\\analysis\\phdr_jni_bundle_body_sizes.txt")

TARGETS = [0x008d4984,0x008d4d74,0x00936da8,0x009371a4]

pyghidra.start(install_dir=str(GHIDRA_INSTALL))
from ghidra.base.project import GhidraProject

project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
program = project.openProgram("/", PROGRAM_NAME, False)
fm = program.getFunctionManager()
listing = program.getListing()
addr_factory = program.getAddressFactory()

lines = []
for addr in TARGETS:
    a = addr_factory.getAddress(hex(addr))
    func = fm.getFunctionContaining(a) or fm.getFunctionAt(a)
    if func is None:
        lines.append(f"no function at {hex(addr)}")
        continue
    body = func.getBody()
    inst_count = 0
    for _ in listing.getInstructions(body, True):
        inst_count += 1
    lines.append(f"{func.getName()} @ {func.getEntryPoint()} body={body} instr={inst_count}")

OUT_PATH.write_text("\n".join(lines), encoding='utf-8')
project.close()
