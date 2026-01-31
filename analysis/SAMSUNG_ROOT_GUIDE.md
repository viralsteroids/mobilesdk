
## Samsung A32 (SM-A325F) root path (Odin)

This device does **not** support fastboot. Rooting uses **Download Mode + Odin** and requires OEM unlocking.

### Before you proceed
- **Backup:** bootloader unlock will wipe user data.
- **OEM unlocking toggle must be enabled** in Developer Options.

### High-level steps
1) **Download firmware** matching your build: `A325FXXSCDYB2` (region-specific). You need at least the `AP_*.tar.md5` file.
2) **Extract boot image** from the AP package (Magisk can patch AP directly).
3) **Patch with Magisk** on the phone:
   - Copy `AP_*.tar.md5` to the phone.
   - Magisk > Install > “Select and Patch a File” > choose AP tar.
   - Pull `magisk_patched-*.tar` back to PC.
4) **Bootloader unlock** (Download Mode):
   - Power off > hold **Vol Up + Vol Down** and plug USB to enter Download Mode.
   - Long press **Vol Up** to unlock bootloader (this wipes data).
5) **Flash patched AP** with Odin:
   - BL -> original BL
   - AP -> `magisk_patched-*.tar`
   - CP -> original CP
   - CSC -> use **HOME_CSC** to preserve data (after unlock wipe, either CSC ok)
6) **Boot system**, open Magisk, complete setup.
7) Verify root: `adb shell su -c id` should work.

### After root
- Push/run `frida-server` and run Frida hooks.

### What I need from you now
- Confirm **OEM unlocking is enabled**.
- Confirm **data wipe OK**.
- Provide the **firmware package** for A325FXXSCDYB2 (or tell me where you’ll download it).

If you want, I can guide you step-by-step through Odin/Magisk once you have the firmware/AP file.
