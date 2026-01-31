import pyghidra
from pathlib import Path

GHIDRA_INSTALL = Path(r"C:\\temp\\MobileSDK\\ghidra_12.0.1_PUBLIC")
BIN_PATH = Path(r"C:\\temp\\MobileSDK\\SmartEngines_full\\lib\\arm64-v8a\\libjnimultiengine.so")
OUT_PATH = Path(r"C:\\temp\\MobileSDK\\analysis\\pyghidra_disasm_bundle_symbols.txt")

TARGETS = [
    0x01047838,
    0x010483b8,
    0x0104e9c0,
    0x0104ea10,
    0x0086588c,
    0x01046748,
]
INSTR_COUNT = 200

pyghidra.start(install_dir=str(GHIDRA_INSTALL))

with pyghidra.open_program(str(BIN_PATH), analyze=False) as flat_api:
    program = flat_api.getCurrentProgram()
    listing = program.getListing()
    addr_factory = program.getAddressFactory()

    lines = []
    for addr in TARGETS:
        start = addr_factory.getAddress(hex(addr))
        lines.append("=== 0x%08x ===" % addr)
        try:
            flat_api.disassemble(start)
        except Exception as e:
            lines.append('disassemble failed: %s' % e)

        instr = listing.getInstructionAt(start)
        count = 0
        while instr is not None and count < INSTR_COUNT:
            lines.append("%s\t%s" % (instr.getAddress(), instr.toString()))
            instr = instr.getNext()
            count += 1
        lines.append('')

    OUT_PATH.write_text('\n'.join(lines), encoding='utf-8')
    print('wrote', OUT_PATH)
