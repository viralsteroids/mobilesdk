# Crypto cluster PHDR decompile status

We attempted to decompile the XOR/ADD cluster at `0x01309f00` and helper at `0x013099e0` via headless Ghidra.

Results:
- `analysis/crypto_cluster_phdr_decompile.txt` exists, but output looks invalid:
  - function sizes reported as 1 byte
  - decompilation shows PIC warnings and nonsensical control flow
  - likely due to running with `-noanalysis` (no auto-analysis on new functions)

Next required:
- Run analysis (or GUI) so Ghidra can properly analyze these functions, then re-run the decompile script.
- Alternatively, extend the script to trigger AutoAnalysisManager on the specific address set.

Scripts:
- `C:\Users\Asus\ghidra_scripts\DecompileCryptoCluster.java`
- Headless log: `C:\temp\MobileSDK\ghidra_output_phdr_cluster.txt`

Update 2026-01-29:
- Attempted to run DecompileCryptoCluster with analyzeChanges(currentProgram) but headless often fails to lock the PHDR project (LockException) even after deleting the .lock file.
- This blocks re-running the script to verify whether analyzeChanges improves output.

Update 2026-01-29 (PyGhidra):
- Java headless scripts now fail to load (`class could not be found`), so I used PyGhidra to create/decompile at 0x01309f00.
- Output in `analysis/crypto_cluster_pyghidra_decompile.txt` still looks like a destructor-style function (no XOR), likely due to missing analysis / incorrect function boundaries.
- Added raw disassembly windows for bundle symbols in `analysis/pyghidra_disasm_bundle_symbols.txt` for further manual tracing.
