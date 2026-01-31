import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
BIN_PATH = Path(r"C:\\temp\\MobileSDK\\SmartEngines_full\\lib\\arm64-v8a\\libjnimultiengine.so")
OUT_PATH = Path(r"C:\\temp\\MobileSDK\\analysis\\pyghidra_decompile_targets.md")

TARGETS = [
    0x027de380,
    0x014099e0,
    0x02801674,
    0x00c9448c,
    0x01309f00,
]
RANGE_LEN = 0x2000

pyghidra.start(install_dir=str(GHIDRA_INSTALL))

from ghidra.app.decompiler import DecompInterface, DecompileOptions
from ghidra.program.model.address import AddressSet
from ghidra.util.task import ConsoleTaskMonitor
from ghidra.program.model.symbol import SourceType

with pyghidra.open_program(str(BIN_PATH), analyze=False) as flat_api:
    program = flat_api.getCurrentProgram()
    addr_factory = program.getAddressFactory()
    monitor = ConsoleTaskMonitor()

    out = []
    out.append('# PyGhidra decompile targets')

    decomp = DecompInterface()
    decomp.openProgram(program)
    decomp.setOptions(DecompileOptions())

    for addr in TARGETS:
        start = addr_factory.getAddress(hex(addr))
        end = addr_factory.getAddress(hex(addr + RANGE_LEN))
        addr_set = AddressSet(start, end)

        out.append('\n## 0x%08x' % addr)

        with pyghidra.transaction(program):
            try:
                flat_api.disassemble(start)
            except Exception as e:
                out.append('disassemble failed: %s' % e)

            func = program.getFunctionManager().getFunctionContaining(start)
            if func is None:
                try:
                    func = program.getFunctionManager().createFunction(None, start, addr_set, SourceType.USER_DEFINED)
                except Exception as e:
                    out.append('createFunction failed: %s' % e)
                    func = program.getFunctionManager().getFunctionContaining(start)

        if func is None:
            out.append('Function: <not found>')
            continue

        out.append('Function: %s @ %s' % (func.getName(), func.getEntryPoint()))
        res = decomp.decompileFunction(func, 120, monitor)
        if not res.decompileCompleted() or res.getDecompiledFunction() is None:
            out.append('Decompile: <failed>')
            continue
        out.append('```c')
        out.append(res.getDecompiledFunction().getC())
        out.append('```')

    OUT_PATH.write_text('\n'.join(out), encoding='utf-8')
    print('wrote', OUT_PATH)
