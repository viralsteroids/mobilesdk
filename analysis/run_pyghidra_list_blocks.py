import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
BIN_PATH = Path(r"C:\\temp\\MobileSDK\\SmartEngines_full\\lib\\arm64-v8a\\libjnimultiengine.so")

pyghidra.start(install_dir=str(GHIDRA_INSTALL))

with pyghidra.open_program(str(BIN_PATH), analyze=False) as flat_api:
    program = flat_api.getCurrentProgram()
    blocks = list(program.getMemory().getBlocks())
    print('blocks', len(blocks))
    for b in blocks:
        if b.isExecute():
            print('EXEC', b.getName(), b.getStart(), b.getEnd())
    # check target
    addr_factory = program.getAddressFactory()
    target = addr_factory.getAddress('01309f00')
    if target is None:
        print('target parse failed')
    else:
        print('target', target, 'in memory', program.getMemory().contains(target))
