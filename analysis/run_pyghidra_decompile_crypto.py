import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
BIN_PATH = Path(r"C:\\temp\\MobileSDK\\SmartEngines_full\\lib\\arm64-v8a\\libjnimultiengine.so")
OUT_PATH = Path(r"C:\\temp\\MobileSDK\\analysis\\crypto_cluster_pyghidra_decompile.txt")

pyghidra.start(install_dir=str(GHIDRA_INSTALL))

from ghidra.app.decompiler import DecompInterface, DecompileOptions
from ghidra.program.model.address import AddressSet
from ghidra.util.task import ConsoleTaskMonitor
from ghidra.program.model.symbol import SourceType

with pyghidra.open_program(str(BIN_PATH), analyze=False) as flat_api:
    program = flat_api.getCurrentProgram()
    addr_factory = program.getAddressFactory()
    monitor = ConsoleTaskMonitor()

    start = addr_factory.getAddress("01309f00")
    end = addr_factory.getAddress("0130a3e4")
    addr_set = AddressSet(start, end)

    out = []
    out.append('Crypto Cluster Decompile (pyghidra)')
    out.append('Program: %s' % program.getName())
    out.append('Range: 0x01309f00-0x0130a3e4')
    out.append('')

    # perform modifications in a transaction
    with pyghidra.transaction(program):
        try:
            flat_api.disassemble(start)
        except Exception as e:
            out.append('disassemble failed: %s' % e)

        func = program.getFunctionManager().getFunctionAt(start)
        if func is None:
            try:
                func = program.getFunctionManager().createFunction(None, start, addr_set, SourceType.USER_DEFINED)
            except Exception as e:
                out.append('createFunction failed: %s' % e)
                func = program.getFunctionManager().getFunctionAt(start)

    if func is None:
        out.append('Failed to create function at 0x01309f00')
    else:
        out.append('FUNCTION: %s' % func.getName())
        out.append('ADDRESS:  %s' % func.getEntryPoint())
        out.append('SIZE:     %d bytes' % func.getBody().getNumAddresses())
        out.append('')

        decomp = DecompInterface()
        decomp.openProgram(program)
        decomp.setOptions(DecompileOptions())
        res = decomp.decompileFunction(func, 120, monitor)
        out.append('DECOMPILED CODE:')
        out.append('--------------------------------------------------------------------------------')
        if res.decompileCompleted() and res.getDecompiledFunction() is not None:
            out.append(res.getDecompiledFunction().getC())
        else:
            out.append('// Decompile failed: %s' % res.getErrorMessage())

    OUT_PATH.write_text('\n'.join(out), encoding='utf-8')
    print('wrote', OUT_PATH)
