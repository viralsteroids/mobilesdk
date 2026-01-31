# JNI Create BLR backtrace (heuristic)

Library: C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so
Scan window: 0x2000 bytes
Backtrack: 24 instructions

## TextEngine::Create(char*,bool) @ 0x0114662c
- BLR sites: 12
  - blr x8 @ 0x01146c48: ldr_imm from [x21+0x0] @ 0x01146c3c
  - blr x8 @ 0x011478e4: ldr_imm from [sp+0x580] @ 0x011478c4
  - blr x8 @ 0x01147904: ldr_imm from [sp+0x580] @ 0x011478f0
  - blr x8 @ 0x01147920: ldr_imm from [sp+0x580] @ 0x01147910
  - blr x8 @ 0x01147940: ldr_imm from [sp+0x580] @ 0x0114792c
  - blr x8 @ 0x01147d20: ldr_imm from [x19+0x0] @ 0x01147d14
  - blr x8 @ 0x01147d54: ldr_imm from [x19+0x0] @ 0x01147d48
  - blr x8 @ 0x01147e88: ldr_imm from [x19+0x0] @ 0x01147e7c
  - blr x8 @ 0x01147ec8: ldr_imm from [x19+0x0] @ 0x01147ebc
  - blr x8 @ 0x01148190: ldr_imm from [x19+0x0] @ 0x01148184
  - blr x8 @ 0x011481f8: ldr_imm from [x19+0x0] @ 0x011481ec
  - blr x8 @ 0x011482a8: ldr_imm from [x19+0x0] @ 0x0114829c

## TextEngine::Create(uchar*,int,bool) @ 0x011466b8
- BLR sites: 12
  - blr x8 @ 0x01146c48: ldr_imm from [x21+0x0] @ 0x01146c3c
  - blr x8 @ 0x011478e4: ldr_imm from [sp+0x580] @ 0x011478c4
  - blr x8 @ 0x01147904: ldr_imm from [sp+0x580] @ 0x011478f0
  - blr x8 @ 0x01147920: ldr_imm from [sp+0x580] @ 0x01147910
  - blr x8 @ 0x01147940: ldr_imm from [sp+0x580] @ 0x0114792c
  - blr x8 @ 0x01147d20: ldr_imm from [x19+0x0] @ 0x01147d14
  - blr x8 @ 0x01147d54: ldr_imm from [x19+0x0] @ 0x01147d48
  - blr x8 @ 0x01147e88: ldr_imm from [x19+0x0] @ 0x01147e7c
  - blr x8 @ 0x01147ec8: ldr_imm from [x19+0x0] @ 0x01147ebc
  - blr x8 @ 0x01148190: ldr_imm from [x19+0x0] @ 0x01148184
  - blr x8 @ 0x011481f8: ldr_imm from [x19+0x0] @ 0x011481ec
  - blr x8 @ 0x011482a8: ldr_imm from [x19+0x0] @ 0x0114829c
