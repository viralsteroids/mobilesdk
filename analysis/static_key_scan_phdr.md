# Static key scan (PHDR, PyGhidra headless)

## Setup
- Project: C:\temp\MobileSDK\ghidra_project_phdr\so_files_decompiled_phdr
- Binary: libjnimultiengine.so (PHDR-mapped)
- Script: ghidra_scripts\extract_static_keys_pyghidra.py
- Run mode: pyghidraRun.bat -H, -noanalysis

## Findings
- No high-entropy arrays (>=7.0) were found in 16..256 byte ranges.
- No string-like key candidates ("key", "secret", "password") were found.
- Repeating patterns are dominated by ELF header blocks, zero runs, and EH frame data.
- Top "key candidates" are mostly string fragments or instruction sequences; none look like fixed keys/IVs.

## Artifacts
- Output log: C:\temp\MobileSDK\ghidra_output_phdr_keys.txt
- Extracted list: C:\temp\MobileSDK\extracted_keys.txt

## Notes
- This scan is heuristic and ran without full analysis; it is useful as a negative signal only.
- If needed, rerun with full auto-analysis or restrict scanning to .rodata/.data with tighter entropy bounds.
