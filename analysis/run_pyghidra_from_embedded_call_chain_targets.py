import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\\temp\\MobileSDK\\ghidra_project")
PROJECT_NAME = "bundle_analysis"
PROGRAM_NAME = "libjnimultiengine.so"
OUT_PATH = Path(r"C:\\temp\\MobileSDK\\analysis\\from_embedded_call_chain_targets.txt")

TARGETS = [
    0x0104cbc4, 0x0104cb18,
    0x00ac4730, 0x00ac4878, 0x00ac9df0, 0x00aca188, 0x00ac9500,
    0x00c719d4, 0x00c777dc, 0x00c77da8, 0x00c7a60c, 0x00c70b6c, 0x00c72c3c, 0x00c49548,
    0x0267235c, 0x026b2f1c,
]

HIGHLIGHT = {0x02558a08,0x02557a14,0x02557a78,0x026eaa78,0x02767080,0x02767040,0x027670c0,0x027670d0,0x02766aa0,0x02766ab0,0x02766a90}

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
    lines.append(f"function {func.getName()} @ {func.getEntryPoint()}")
    for instr in listing.getInstructions(func.getBody(), True):
        if not instr.getFlowType().isCall():
            continue
        flows = instr.getFlows()
        if not flows:
            lines.append(f"  {instr.getAddress()} call (no flow)")
            continue
        for f in flows:
            ffunc = fm.getFunctionAt(f)
            tag = "" 
            try:
                foff = int(str(f),16)
                if foff in HIGHLIGHT:
                    tag = " **HIT**"
            except Exception:
                pass
            if ffunc is not None:
                lines.append(f"  {instr.getAddress()} -> {ffunc.getName()} {ffunc.getEntryPoint()}{tag}")
            else:
                lines.append(f"  {instr.getAddress()} -> {f}{tag}")
    lines.append("")

OUT_PATH.write_text("\n".join(lines), encoding='utf-8')
project.close()
