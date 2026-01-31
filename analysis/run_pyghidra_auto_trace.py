#!/usr/bin/env python3
"""
Headless PyGhidra runner for auto-trace of TextEngine vtable dispatch.
Requires an already analyzed project.
"""

from pathlib import Path
import pyghidra

GHIDRA_INSTALL = Path(r"C:\temp\MobileSDK\ghidra_12.0.1_PUBLIC")
PROJECT_DIR = Path(r"C:\temp\MobileSDK\ghidra_project")
PROJECT_NAME = "bundle_analysis"
PROGRAM_NAME = "libjnimultiengine.so"
OUT = Path(r"C:\temp\MobileSDK\analysis\ghidra_auto_vtable_trace.md")

ADDRS = [
    0x01146c14, 0x011461b4, 0x0114638c, 0x01147874, 0x0114789c,
    0x01147e74, 0x01147eb4, 0x0114817c, 0x011481c0, 0x01148294,
    0x01149024, 0x01149928, 0x0114a0e0, 0x0114a584,
    0x01146c00, 0x01148128, 0x0114a570, 0x01146bf4, 0x0114816c, 0x0114a564,
]

X22_OFFSETS = ["0x230", "0x240", "0x248"]


def instr_uses_x22_offset(instr):
    s = instr.toString().lower().replace(" ", "")
    if "x22" not in s:
        return False
    for off in X22_OFFSETS:
        if off in s:
            return True
    return False


def fmt_addr(addr):
    if addr is None:
        return "n/a"
    return "0x{:08x}".format(int(addr.getOffset()))


def main():
    pyghidra.start(install_dir=str(GHIDRA_INSTALL))

    from ghidra.base.project import GhidraProject
    from ghidra.program.flatapi import FlatProgramAPI
    from ghidra.app.decompiler import DecompInterface
    from ghidra.util.task import ConsoleTaskMonitor
    from ghidra.program.model.pcode import PcodeOp

    project = GhidraProject.openProject(str(PROJECT_DIR), PROJECT_NAME)
    program = project.openProgram("/", PROGRAM_NAME, False)
    if program is None:
        raise SystemExit("Could not open program")

    flat = FlatProgramAPI(program)
    listing = program.getListing()
    monitor = ConsoleTaskMonitor()

    funcs = {}
    for addr in ADDRS:
        a = flat.toAddr(addr)
        fn = flat.getFunctionContaining(a)
        if fn is not None:
            funcs[fn.getEntryPoint()] = fn

    lines = []
    lines.append("# Ghidra auto-trace: TextEngine vtable dispatch (pyghidra)")
    lines.append("")
    lines.append("Program: {}".format(program.getName()))
    lines.append("Functions: {}".format(len(funcs)))
    lines.append("")

    ifc = DecompInterface()
    ifc.openProgram(program)

    for entry, fn in sorted(funcs.items()):
        lines.append("## Function {} @ {}".format(fn.getName(), fmt_addr(entry)))
        lines.append("- range: {}..{}".format(fmt_addr(fn.getBody().getMinAddress()), fmt_addr(fn.getBody().getMaxAddress())))

        lines.append("- x22 field accesses (0x230/0x240/0x248):")
        any_x22 = False
        it = listing.getInstructions(fn.getBody(), True)
        while it.hasNext():
            instr = it.next()
            if instr_uses_x22_offset(instr):
                any_x22 = True
                lines.append("  - {}: {}".format(fmt_addr(instr.getAddress()), instr.toString()))
        if not any_x22:
            lines.append("  - none")

        lines.append("- CALLIND pcode ops:")
        res = ifc.decompileFunction(fn, 60, monitor)
        if not res or not res.decompileCompleted():
            lines.append("  - decompile failed")
        else:
            hf = res.getHighFunction()
            itp = hf.getPcodeOps()
            count = 0
            while itp.hasNext():
                op = itp.next()
                if op.getOpcode() == PcodeOp.CALLIND:
                    count += 1
                    seq = op.getSeqnum()
                    addr = seq.getTarget()
                    lines.append("  - CALLIND @ {}: {}".format(fmt_addr(addr), op))
            if count == 0:
                lines.append("  - none")
        lines.append("")

    OUT.write_text("\n".join(lines), encoding="utf-8")
    print("Wrote {}".format(OUT))

    project.save(program)
    project.close()


if __name__ == "__main__":
    main()
