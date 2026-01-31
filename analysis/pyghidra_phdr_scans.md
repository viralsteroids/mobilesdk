# PyGhidra PHDR scans (headless, noanalysis)

## Bundle loader scan
- Script: `ghidra_scripts/find_bundle_loader_pyghidra.py`
- Result: no fopen/read/open xrefs; no `.se` or bundle string refs detected.
- Log: `ghidra_output_phdr_bundle_loader.txt`

## Decryption scan
- Script: `ghidra_scripts/find_decryption_functions_pyghidra.py`
- Result: no AES S-box, no cipher-related functions, no high-XOR functions.
- Constant arrays reported match ELF/strings/insn blocks (same as key scan).
- Log: `ghidra_output_phdr_decryption_scan.txt`

## Notes
- These scans run without autoanalysis, so they are negative signals only.
- Lock issues can block runs; stop leftover `java.exe` and delete `.lock` files before running headless.
