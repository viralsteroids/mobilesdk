# Ghidra trace worksheet (bundle -> libarchive path)

Use this as a step-by-step guide to inspect callsites and argument setup for the bundle decode path.
Addresses are for `analysis/libjnimultiengine.so` (ARM64).

## Entry chain to libarchive
1) `TextEngineImpl::InitFromOwnedZipBuffer` @ `0x0126c380`
2) BL to `0x02558a08`
3) BL to `0x02557a14` (calls `archive_read_support_filter_zstd`)
4) Flows into `0x02557a90` (libarchive wrapper)

Reference: `analysis/function_direct_calls.md`, `analysis/plt_callsites.md`, `analysis/callsite_context_archive_wrapper.md`.

## JNI Create → BLR vtable trace (TextEngine::Create)
Use these addresses to locate the vtable-style dispatch that likely jumps into the decode chain.

### Entry points
- `se::text::TextEngine::Create(char*, bool)` @ `0x0114662c`
- `se::text::TextEngine::Create(uchar*, int, bool)` @ `0x011466b8`

### BLR callsites (vtable-style)
All of these follow the pattern `ldr x8, [x8+0x10]; blr x8`.
- `0x01146c48`
- `0x011478e4`
- `0x01147904`
- `0x01147920`
- `0x01147940`
- `0x01147d20`
- `0x01147d54`
- `0x01147e88`
- `0x01147ec8`
- `0x01148190`
- `0x011481f8`
- `0x011482a8`

### Annotated BLR windows (quick glance)
- `analysis/jni_create_blr_windows.txt` contains +/- 0x40 annotated windows for each BLR site.

### Concrete source loads for the vtable pointer
These are the nearest non-self LDRs feeding the vtable pointer chain; inspect the source objects/stack slots.
- `ldr x21, [x22+0x248]` @ `0x01146c00` (used at `0x01146c48`)
- `ldr x8, [sp+0x580]` @ `0x011478c4/0x011478f0/0x01147910/0x0114792c` (feeds `0x011478e4`..`0x01147940`)
- `ldr x19, [sp+0x520]` @ `0x01147880/0x01147d30/0x01147e98`
- `ldr x19, [sp+0x9d0]` @ `0x0114780c/0x01147e0c/0x011481b0`
- `ldr x19, [sp+0x158]` @ `0x01148284`
- Additional `sp+0x158` loads later in the function: `0x01148bc0/0x01148bd8/0x01148ce0/0x01148ef4/0x01148f64/0x01148f7c/0x01149004/0x01149014` (see `analysis/jni_create_stack_offset_trace_wide.md`).
- Another context load: `ldr x23, [x22+0x248]` @ `0x0114a570` (see `analysis/jni_create_stack_offset_trace_wide.md`).
- `ldr x21, [x22+0x248]` @ `0x01146c00` and `ldr x19, [x22+0x248]` @ `0x01148128` occur inside `TextEngine::Create`; surrounding windows show companion accesses to `x22+0x230/0x240/0x248` and calls to `0x0074a7e0/0x0074a810` (see `analysis/x22_248_ref_windows.txt`).
- Stores to `x22+0x248` appear at `0x00b23c78`, `0x01121320`, `0x0132dae4`, `0x0137dd38` and follow a swap pattern (load old pointer → store new pointer → call `0x0074a7e0/0x0074a810`), suggesting a scoped context switch around the decoder pointer. See `analysis/x22_248_store_windows.txt`.
- BL callsites to the context-swap helpers (focus ranges) provide extra trace anchors inside `TextEngine::Create`:
  - `0x0074a7e0` calls at `0x01149928`, `0x0114a0e0`.
  - `0x0074a810` calls at `0x011461b4`, `0x0114638c`, `0x01146c14`, `0x01147874`, `0x0114789c`, `0x01147e74`, `0x01147eb4`, `0x0114817c`, `0x011481c0`, `0x01148294`, `0x01149024`, `0x0114a584`.
  - Full summary: `analysis/bl_callers_0074a7e0_0074a810.md`.
  - Nearest-prologue map for these callsites (to jump to likely function starts): `analysis/context_swap_callsite_prologues.md`.
  - Grouped by prologue (approx function ranges + call offsets): `analysis/context_swap_callsite_groups.md`.
  - x22 field access map (0x230/0x240/0x248) tied to those same prologues: `analysis/x22_context_prologue_map.md`.
  - Local windows around x22 accesses + helper callsites for the two main TextEngine ranges: `analysis/context_swap_key_windows.txt`.
  - Ghidra auto-trace script (x22 field accesses + CALLIND ops): `ghidra_scripts/auto_trace_textengine_vtable.py`.

### Minimal Ghidra checklist (JNI Create → decoder)
1) Jump to `0x01146c48` and inspect the object behind `x21` (`ldr x21, [x22+0x248]` @ `0x01146c00`). Resolve the vtable pointer and the function pointer at `+0x10`.
2) For stack‑backed vtable sources (`sp+0x580`, `sp+0x520`, `sp+0x9d0`, `sp+0x158`), define stack variables and trace their writes to recover the object/vtable being staged.
3) For each BLR site, follow the resolved vtable target and check for calls into the archive/ZSTD cluster (`0x0255xxxx–0x026fxxxx`) or into `InitFromOwnedZipBuffer`.
4) If the vtable target is still unclear, locate RTTI strings near the vtable pointer and follow xrefs to class constructors.

Record findings in `FUNCTION_ANALYSIS.md` under the JNI create path.

### What to capture in Ghidra
1) At each BLR site, inspect the concrete object behind `x8` (the vtable pointer) and identify the function pointer at `+0x10`.
2) Trace the origin of `x19`, `x21`, and stack slots (`sp+0x580`, `sp+0x520`, `sp+0x9d0`, `sp+0x158`) to locate the decoder object or its wrapper.
3) Once the vtable function target is resolved, follow it to see whether it calls into the archive/ZSTD cluster (`0x0255xxxx–0x026fxxxx`).

Reference: `analysis/jni_create_blr_backtrace.md`, `analysis/jni_create_blr_vtable_sources.md`, `analysis/jni_create_stack_offset_trace.md`.

## Key callsites and argument setup
### `archive_read_support_filter_zstd` @ PLT `0x02766a80`
- Callsite: `0x02557a78` (inside `0x02557a14`)
- Context shows `MOV X0, X21` just before the call.
  - Likely `X0 = archive*` (handle).

### `archive_read_open_filenames` @ PLT `0x02767030`
- Callsite: `0x02557c10` (inside `0x02557a90`)
  - `ADRP/ADD X2, ...` (pointer constant)
  - `MOV X0, X20` (archive handle)
  - `MOV W1, #0xC` (0x52800181)
- Callsites inside `0x026eaef0` (open wrapper):
  - `0x026eaf94`, `0x026eb050`, `0x026eb074`, `0x026eb14c`, `0x026eb1c8`, `0x026eb1fc`,
    `0x026eb2e8`, `0x026eb31c`, `0x026eb4b0`, `0x026eb4e4`, `0x026eb778`, `0x026eb7b4`,
    `0x026eb958`, `0x026eb9d0`, `0x026ebb94`, `0x026ebe04`, `0x026ebfe0`, `0x026ec00c`,
    `0x026ec148`, `0x026ec21c`.
- Concrete register/value notes (from `callsite_context_archive_wrapper.md`):
  - `0x026eaf94`: `W1 = [X0]` (LDR), `X2 = ADRP+ADD`, `X0 = X21`, `X3 = X22`.
  - `0x026eb050`: `W1 = 0xFFFFFFFF` (0x12800001), `X2 = ADRP+ADD`, `X0` inherited.
  - `0x026eb074`: `W1 = [X0]` (LDR), `X2 = ADRP+ADD`, `X0 = X21`, `X3 = X22`.
  - `0x026eb14c`: `W1 = 0xC` (0x52800181), `X2 = ADRP+ADD`, `X0 = X21`.
  - `0x026eb1c8`: `X2 = ADRP+ADD`, `X0 = X20` (no nearby `W1` set).
  - `0x026eb1fc`: `X2 = ADRP+ADD`, `X3 = ADD ...`, `X0 = X20` (no nearby `W1` set).
  - `0x026eb2e8`: `X2 = ADRP+ADD`, `X0 = X20` (no nearby `W1` set).
  - `0x026eb31c`: `X2 = ADRP+ADD`, `X3 = ADD ...`, `X0 = X20` (no nearby `W1` set).
  - `0x026eb4b0`: `X2 = ADRP+ADD`, `X0 = X19` (no nearby `W1` set).
  - `0x026eb4e4`: `X2 = ADRP+ADD`, `X3 = ADD ...`, `X0 = X19` (no nearby `W1` set).
  - `0x026eb778`: `W1 = 0xC` (0x52800181), `X2 = ADRP+ADD`, `X0 = X19`.
  - `0x026eb7b4`: `W1 = 0x16` (0x528002c1), `X2 = ADRP+ADD`, `X0 = X19`.
  - `0x026eb958`: `W1 = 0xC` (0x52800181), `X2 = ADRP+ADD`, `X0 = X19`.
  - `0x026eb9d0`: `W1 = 0xC` (0x52800181), `X2 = ADRP+ADD`, `X0 = X19`.
  - `0x026ebb94`: `W1 = 0xC` (0x52800181), `X2 = ADRP+ADD`, `X0 = X19`.
  - `0x026ebe04`: `W1 = 0xC` (0x52800181), `X2 = ADRP+ADD`, `X0 = [X?]` (LDR at `0x026ebdf4`).
  - `0x026ebfe0`: `W1 = 0xFFFFFFFF` (0x12800001), `X2 = ADRP+ADD`, `X0 = [X?]` (LDR at `0x026ebfd0`).
  - `0x026ec00c`: `W1 = 0xFFFFFFFF` (0x12800001), `X2 = ADRP+ADD`, `X0 = X19`, `X3 = X0` (MOV at `0x026ebff8`).
  - `0x026ec148`: `W1 = 0xC` (0x52800181), `X2 = ADRP+ADD`, `X0 = X19`.
  - `0x026ec21c`: `W1 = 0xC` (0x52800181), `X2 = ADRP+ADD`, `X0 = X19`.
- Likely signature: `archive_read_open_filenames(archive*, paths, block_size_or_flags, [optional])`.

### `archive_read_data` @ PLT `0x02766a90`
- Callsite: `0x02557bb4` and `0x02557c18` (inside `0x02557a90`)
- Context shows `MOV X0, X20` (archive handle) before calls.

### `archive_entry_pathname` @ PLT `0x02766aa0`
- Callsite: `0x02557e04` (inside `0x02557a90`)
- Context:
  - `MOV X0, X20`
  - `MOV X1, X22`
  - `MOV X2, X23`
- Likely `archive_entry_pathname(entry)` or wrapper that writes into buffers.

### `archive_read_open_memory2` @ PLT `0x02767080`
- Callsite: `0x02557c60` (inside `0x02557a90`)
- Context (decoded):
  - `LDR X8, [X19,#0x40]`
  - `LDP X2, X9, [X19,#0x48]`
  - `MOV X0, X20`
  - `ADD X1, X8, X9`
  - `MOV X3, X2`
- Interpretation: `X1 = buffer`, `X2 = size`, `X3 = read_size` (equal to size). See `analysis/open_memory2_callsite_02557c60_summary.md`.

### `__open_2` @ PLT `0x02767070`
- Callsite: `0x026eaf44` (inside `0x026eaef0`)
- Context:
  - `MOV X0, X22` where `X22 = (orig X1) + 0x30`
  - `MOV W1, #0x80000` (0x52a00101)
- This call was previously mis-attributed to `archive_read_open_memory2` before PLT0 correction (see `analysis/open_memory2_callsite_summary.md`).

### `archive_open_FUN_026eaef0` @ `0x026eaef0`
- `__open_2` callsite: `0x026eaf44`.
- `archive_read_open_filenames` callsites: `0x026eaf94`, `0x026eb050`, `0x026eb074`, `0x026eb14c`, `0x026eb1c8`,
  `0x026eb1fc`, `0x026eb2e8`, `0x026eb31c`, `0x026eb4b0`, `0x026eb4e4`, `0x026eb778`, `0x026eb7b4`,
  `0x026eb958`, `0x026eb9d0`, `0x026ebb94`, `0x026ebe04`, `0x026ebfe0`, `0x026ec00c`,
  `0x026ec148`, `0x026ec21c`.
- Arguments typically: `X2` built via `ADRP/ADD` (constant pointer), `X0` from saved handle regs.

## What to extract in Ghidra
- For each callsite above, note the register values (`X0..X3`) and their origins.
- Identify the buffer source that feeds `archive_read_open_memory2` at `0x02557c60` (likely the decrypted bundle bytes).
- Trace how the output of `archive_read_data` is consumed (should lead to Zip entry buffers or ZSTD stream init).

## Expected X0..X3 roles (open_filenames / open_memory2)
- `X0`: archive handle (`archive*`) or caller-provided handle reg (`X19`/`X20`/`X21`/`X22`).
- `X1`: size/flags or count (often `0xC`, `0x16`, `0xFFFFFFFF`, or `0x80000` for file open); for open_memory2 at `0x02557c60`, `X1` is the computed buffer pointer.
- `X2`: pointer constant built via `ADRP/ADD` (filename list or string table).
- `X3`: optional extra argument (caller context or secondary pointer; set in some callsites via `MOV`/`ADD`).

## Files to consult
- `analysis/callsite_context_archive_wrapper.md`
- `analysis/plt_callsites.md`
- `analysis/function_direct_calls.md`
- `analysis/function_bl_scan_archive_cluster.md`
- `analysis/open_memory2_arg_backtrace_detailed.md`

## ZSTD dictionary callsites (SmartEngines_apktool)
- `ZSTD_createDDict_advanced` callsites: `0x270d910`, `0x270da50`, `0x270db90`, `0x270dcb4`, `0x270df60`, `0x2710bac`, `0x2710c04`.
- Nearest prologue starts (for Ghidra navigation): `0x270d6e8`, `0x270dd28`, `0x2710b18`.
- `ZSTD_DCtx_refDDict` callsite: `0x270e658` (prologue `~0x270e63c`).
- See `analysis/apktool_zstd_dict_callsite_prologue_map.md` and `analysis/apktool_plt_callsites_zstd_archive.md`.

## ZSTD dict arg hints (heuristic, apktool)
- Several `ZSTD_createDDict_advanced` callsites set `X1` from stack (`MEM[SP+0x8]`), implying dict size stored in a local stack slot.
- Two callsites show `X0`/`X1` sourced from nested pointers off `SP+0x18` -> `+0x10` -> `+0x6ad0`, then deref for size; inspect that structure in Ghidra for dict buffer/size fields.
- See `analysis/apktool_zstd_dict_callsite_arg_scan_v3.md` for the exact expressions and callsite addresses.

## ZSTD dict helper/vtable hints (apktool)
- Before several `ZSTD_createDDict_advanced` callsites, code loads `X27` from `[X20+0x6ac8]` and `X21` from `[X20+0x6ad0]`, then does `BLR X27` with `X0=X21` and `X1=X8` (where `X8` is `[X20+0x0]`). This looks like a vtable/helper method that returns or prepares dict data.
- For Ghidra: inspect the struct at `X20` (offsets `0x0`, `0x6ac8`, `0x6ad0`) in the function windows near `0x270d9c0` and `0x270db00` (see `analysis/apktool_zstd_dict_x25x26_sources.txt`).

## Full build BLR X27 pattern
- `SmartEngines_full` has BLR X27 windows at `0x863990`, `0x863e24`, `0x863ffc` that load `X27` from `[X26+0x210]` and `X24` from `[X26+0x218]`, then call `BLR X27` with `X0=X24`, `X1=X25`. This is analogous to the apktool dict-helper pattern (different offsets). See `analysis/full_blr_x27_windows_summary.md`.
- A local linear trace shows that, in two of these windows, `X26 = MEM[X19+0x0]` and the call arguments are `X0 = MEM[X26+0x218]`, `X1 = MEM[X26+0x8]`, `X27 = MEM[X26+0x210]`. This suggests the helper receives two fields from a vtable-backed object (possibly dict buffer + size) stored at offsets `+0x218` and `+0x8` (see `analysis/full_blr_x27_arg_trace.md`).

## Full build X26 source hint
- In the `SmartEngines_full` BLR X27 windows, X26 is loaded from `MEM[X19+0x0]` before the helper call. That implies X19 points to a wrapper object and X26 is likely a vtable/interface pointer for a dict helper (see `analysis/full_blr_x27_x26_sources.md`).

## Full build caller candidates (0x86236c)
- Function start for BLR X27 windows is `~0x86236c` (callee-saves X19; not set locally). Caller must populate X19 (see `analysis/full_blr_x27_prologue_scan.md`).
- Most promising callsites in TextEngine range: `0x12876d0`, `0x12876e8`, `0x1287760`, `0x1287778` (loop cluster). These load `X8` from `[X19+0x10]`, then `MOV X19, X8` before calling `0x86236c` (see `analysis/full_bl_to_86236c_candidate_windows.txt`).
- Another candidate: `0x1280f24`, where X19 is `MEM[X21+0x40]` and X0 is `MEM[X25+0x8]` prior to BL (see `analysis/full_bl_to_86236c_candidates.md`).

## Stack chain for 0x12876d0 cluster (full)
- `SP+0x58` is set from `MEM[X23+0x28]`, and then `X19 = MEM[MEM[MEM[SP+0x58]+0x28]+0x10]` before BL to `0x86236c` (see `analysis/full_bl_to_86236c_sp58_trace.md` and `analysis/full_bl_to_86236c_reg_snapshot.md`). This is the concrete object chain to inspect in Ghidra.
- Early in the routine around `0x1285658`, the code loads `X8 = [X23+0x28]` and saves registers, implying `X23` is the inbound context pointer for this routine (see `analysis/full_1285658_prologue_detail.txt`).
- Wider trace (v3) suggests `X23` at callsite is loaded from a stack slot: `X23 = MEM[SP+0xd8]`, where `SP+0xd8 = MEM[MEM[SP+0x20]+0x28]` (see `analysis/full_bl_to_86236c_arg_chain_v3.md`). This implies the context pointer is nested in a caller-allocated structure.
- Note: a prologue scan over 0x1270000..0x1285800 found no `SUB SP, SP, #imm` or `STP ... [SP, #-imm]!` patterns, and no direct BL into `0x1285658`, so this block is likely inside a larger function with a prologue outside this window. Treat SP-relative chains as provisional until the true function entry is identified (see `analysis/full_1285658_prologue_scan.md` and `analysis/bl_to_1285658.md`).
- Updated scan with correct STP-pre decoding shows a real prologue at `0x1285650` (`STP X29, X30, [SP, -48]!`) before the `0x12876d0` cluster. Re-tracing from that prologue still yields a stack-heavy chain where `SP+0xd8` stores `SP` and `X23 = MEM[SP+0xd8]` (i.e., `X23` looks stack-based). This needs Ghidra validation; the linear trace may be missing ADD/SP-based address construction (see `analysis/full_bl_to_86236c_arg_chain_v4.md`).
- A SP0-normalized trace (v5) confirms `SP+0xd8 (SP0) = SP0` at this site, so the chain simplifies to `X23 = SP0` and `X19 = MEM[MEM[MEM[SP0]+0x28]+0x10]`. That implies the X19 object is derived from data stored at the base of the stack frame; verify in Ghidra by inspecting locals/args near `SP` at `0x12876d0` (see `analysis/full_bl_to_86236c_arg_chain_v5.md`).
