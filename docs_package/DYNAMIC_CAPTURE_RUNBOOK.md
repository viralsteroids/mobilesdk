# Dynamic capture runbook (arm64 emulator)

This is a minimal, repeatable path to get fresh dumps using the updated Frida hooks.

## 1) Start emulator and wait for boot

If you have an AVD named `arm64_device`:

```powershell
C:\Users\Asus\AppData\Local\Android\Sdk\emulator\emulator.exe -avd arm64_device -no-snapshot
```

Then verify ADB sees the device:

```powershell
C:\temp\MobileSDK\platform-tools\adb.exe devices
```

## 2) Run the helper script (optional)

```powershell
powershell -File C:\temp\MobileSDK\analysis\run_dynamic_capture.ps1 -StartEmulator
```

This will:
- wait for boot
- create `/data/local/tmp/se_dumps`
- install the APK (if found)
- print the Frida command to run

## 3) Run Frida with bundle hooks (Python runner)

Use the Python API to avoid a blocked frida.exe:

```powershell
python C:\temp\MobileSDK\analysis\run_frida_capture.py --package com.smartengines.se --spawn --log C:\temp\MobileSDK\analysis_out\frida_capture.log
```

To attach to an already running process:

```powershell
python C:\temp\MobileSDK\analysis\run_frida_capture.py --package com.smartengines.se --attach --log C:\temp\MobileSDK\analysis_out\frida_capture.log
```

The log file captures script messages and errors. Leave the runner open while you trigger bundle loading in the UI.

### Gadget mode (no frida-server)
If you injected `libfrida-gadget.so` into the APK, forward the gadget port and connect via `--remote`:

```powershell
C:\temp\MobileSDK\analysis\deploy_gadget_script.ps1
C:\temp\MobileSDK\platform-tools\adb.exe forward tcp:27042 tcp:27042
python C:\temp\MobileSDK\analysis\run_frida_capture.py --package com.smartengines.se --attach --remote 127.0.0.1:27042 --log C:\temp\MobileSDK\analysis_out\frida_capture.log
```

If logcat shows `Failed to start: Unable to create socket: Operation not permitted`, the gadget is blocked by device policy (SELinux). Use an emulator or rooted device.

## 3b) Run Frida with bundle hooks (frida_tools)

```powershell
python -m frida_tools.repl -U -f com.smartengines.se -l C:\temp\MobileSDK\tools/frida/frida_bundle_decrypt_hook.js --no-pause
```

Trigger bundle loading in the UI (tap any feature that initializes the engine).

## 4) Pull and scan dumps

```powershell
powershell -File C:\temp\MobileSDK\analysis\pull_and_scan_dumps.ps1
```

This now also runs `analysis/validate_dump_signatures.py`.

## Expected outputs
- `C:\temp\MobileSDK\se_dumps\latest\` contains new `zstd_out_*`, `zstd_stream_out_*`, `archive_open_memory2_in_*`, etc.
- `analysis\dump_signature_validation.md` updated with signatures.

## Notes
- Hooks now include ZSTD DCtx variants, stream simpleArgs, and archive_read_support_filter_zstd.
- If Frida logs show `[ARCHIVE_OPEN_MEMORY2]` and `[ZSTD_TRACE]`, hooks are active.

## Frida (Python runner)

If `frida.exe` is not on PATH, use the Python runner:

```powershell
python C:\temp\MobileSDK\analysis\run_frida_capture.py --package com.smartengines.se --attach --wait 120 --monkey --log C:\temp\MobileSDK\frida_capture_dynamic.log
```

Notes:
- On non-root physical devices, `--spawn` may fail and `--attach` may be blocked (permission denied). Use an emulator or a rooted device.

## Host limitation

If you see `FATAL | QEMU2 emulator does not support arm64 CPU architecture`, this host cannot run arm64 system images. Use an ARM host (M1/M2) or a rooted arm64 device instead.

## Gadget (no-root) alternative

If you install `smartengines_frida2.apk` (includes Frida Gadget listening on 127.0.0.1:27042), you can try attaching via port-forward:

```powershell
C:\temp\MobileSDK\platform-tools\adb.exe install -r C:\temp\MobileSDK\smartengines_frida2.apk
C:\temp\MobileSDK\platform-tools\adb.exe forward tcp:27042 tcp:27042
python C:\temp\MobileSDK\analysis\run_gadget_capture.py --package com.smartengines.se --script C:\temp\MobileSDK\tools/frida/frida_bundle_decrypt_hook.js --wait 120 --monkey
```

If gadget fails to bind ("Operation not permitted"), root is still required.
