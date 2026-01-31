# BLR Sites Summary (decoder path)

## Inputs
- `blr_sites.txt` (first 200 BLR hits across exec segments)
- `blr_resolution_fun_00af449c_010f9624.txt` (targeted BLR scan in key decoder functions)
- `_fun_00af*.txt` decompile dumps (context + string anchors)

## High-level observations
- `blr_sites.txt` contains 200 BLR sites in the range `0x6ddee4` ? `0x6f5a50`. These addresses do **not** overlap the decoder chain functions (`FUN_00af449c` @ `0x00af449c-0x00af74c8`, `FUN_010f9624` @ `0x010f9624-0x010fe704`). The list is an early, partial scan and is not sufficient for decoder analysis by itself.
- Targeted scan results:
  - `FUN_00af449c`: 47 BLR sites (mostly `x8`, a few `x9`).
  - `FUN_010f9624`: 37 BLR sites (all `x8`).
- A few BLR sites resolve through ADRP/ADD/LDR chains to .rodata/vtable-looking bases (`0x238d000`, `0x2395000`, `0x239b000`, `0x2447000`). One resolves to `0xffffffff00000000` (invalid) and one to `0x65536e776170533a` (ASCII-like; not a code pointer). Treat those two as **non-code** or unresolved.
- `_fun_00af7d04`, `_fun_00af802c`, `_fun_00af820c`, `_fun_00af83ec` are container helpers (string/vector/map) called from `FUN_00af449c`; they are not primary decode dispatch points but sit inside the same config/registry loops.

## FUN_00af449c (config + engine/processor registry)
Role from decompile: applies `BUNDLE_PATH`, `INIT_CONCURRENCY`, forensics flags (`enableForensics`, `lockForensics`), checks `smartid_engine`, builds string maps, then calls `FUN_010f9624`.

BLR groups (addresses ? context/hypothesis):

- **Group A (no resolved base; `x8/x9`):**
  - `0xaf44b0, 0xaf44d8, 0xaf4534, 0xaf4568, 0xaf458c, 0xaf4708, 0xaf4968, 0xaf4984, 0xaf49a8, 0xaf4a04, 0xaf4df0, 0xaf4e0c, 0xaf4e28, 0xaf5048, 0xaf5070, 0xaf5090, 0xaf50a4, 0xaf50bc, 0xaf50d0, 0xaf50ec, 0xaf5de4, 0xaf6830, 0xaf6840, 0xaf6a84, 0xaf6b3c, 0xaf70e4, 0xaf70f4, 0xaf7120, 0xaf7170, 0xaf7290, 0xaf7318`
  - **Context:** early/central sections where old engine objects at `param_1+0x58/0x60` are replaced, forensics flags are applied, and map/iterator loops run.
  - **Hypothesis:** vtable dispatch for object lifecycle + flag setters + per-entry callbacks. These are likely *pre-decode* setup calls that gate which engine/processor will handle the bundle.

- **Group B (via `0x238d000`, `x8`):**
  - `0xaf546c, 0xaf5498, 0xaf54b0, 0xaf54c8`
  - **Context:** repeated BLR to the same base implies a single interface/vtable used multiple times.
  - **Hypothesis:** per-processor registration/validation (string-map driven), likely tied to `smartid_engine` discovery.

- **Group C (via `0x2395000`, `x8`):**
  - `0xaf56c4, 0xaf56d8, 0xaf56f8, 0xaf5710, 0xaf5728`
  - **Hypothesis:** second interface for the same registry loop (e.g., init/attach hooks).

- **Group D (via `0x239b000`, `x8`):**
  - `0xaf6348, 0xaf6584, 0xaf6888, 0xaf7000`
  - **Context:** later in the function, after map construction and iteration.
  - **Hypothesis:** engine-specific init stage; likely the last dynamic step before entering `FUN_010f9624`.

- **Group E (via `0x2447000`, `x8`):**
  - `0xaf64a0, 0xaf68f4`
  - **Hypothesis:** alternate engine/processor vtable (different type or mode).

- **Group F (via `0x265000` ? `0xffffffff00000000`):**
  - `0xaf46c8`
  - **Hypothesis:** bogus resolution (sentinel/null-like), treat as unresolved.

## FUN_010f9624 (bundle initialization + processor config)
Role from decompile: large initializer with explicit bundle error strings (e.g., ?Bundle initialization: processor configs must be paths?, ?no such default processor?, ?multiple-mode bundle must have a default mode?). Heavy virtual dispatch across processor lists.

BLR groups:

- **Group A (no resolved base; early setup):**
  - `0x10f9e84, 0x10fa064, 0x10fa088, 0x10fa4c0, 0x10fa64c, 0x10fa668, 0x10fa68c, 0x10fa6b0, 0x10fa710, 0x10fa72c, 0x10fa78c, 0x10fa7a8, 0x10fa7f0`
  - **Context:** front of the function, before the bundle-specific error checks.
  - **Hypothesis:** vtable calls on helper/container objects and cleanup routines; likely not the core decode step yet.

- **Group B (via `0x20d000` ? `0x65536e776170533a`):**
  - `0x10fa8a0`
  - **Hypothesis:** pointer resolves into ASCII-like data (not a code address). Treat as unresolved data reference, not a real call target.

- **Group C (dense cluster; likely bundle/processor dispatch):**
  - `0x10fa994, 0x10fadc0, 0x10faddc, 0x10fae58, 0x10fae74, 0x10fae98, 0x10faee0, 0x10faf3c, 0x10faf90, 0x10fafb4, 0x10fafd8, 0x10faffc, 0x10fb020, 0x10fb044, 0x10fb068, 0x10fb08c, 0x10fb0b0, 0x10fb0d4, 0x10fb0f8`
  - **Context:** matches the code region that throws the bundle/processor init errors.
  - **Hypothesis:** per-processor virtual calls that likely branch into engine-specific decode paths (e.g., `CreateFromEmbeddedBundle` / `InitFromOwnedZipBuffer` in downstream classes).

- **Group D (late-stage dispatch / finalization):**
  - `0x10fba18, 0x10fc674, 0x10fd5d0, 0x10fd7b0`
  - **Hypothesis:** finalize/init-complete steps, or cleanup on failure paths.

## Decoder path inference
The static BL chain to libarchive/ZSTD begins *after* these virtual dispatches. The BLR clusters inside `FUN_00af449c` (config/registry) and `FUN_010f9624` (bundle initialization) are the most plausible handoff points into engine-specific decode implementations (e.g., `CreateFromEmbeddedBundle` ? `InitFromOwnedZipBuffer`). The vtable-like bases (`0x238d000`, `0x2395000`, `0x239b000`, `0x2447000`) are likely the concrete class tables for those engine/processor types.
