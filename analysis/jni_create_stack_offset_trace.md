# JNI Create stack/context offset scan (LDR/STR imm)

Library: C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so
Scan window: 0x2000 bytes
Offsets of interest: 0x158, 0x248, 0x520, 0x580, 0x9d0

## TextEngine::Create(char*,bool) @ 0x0114662c
- Hits: 13
  - ldr x21, [x22+0x248] @ 0x01146c00
  - ldr x19, [sp+0x9d0] @ 0x0114780c
  - ldr x19, [sp+0x520] @ 0x01147880
  - ldr x8, [sp+0x580] @ 0x011478c4
  - ldr x8, [sp+0x580] @ 0x011478f0
  - ldr x8, [sp+0x580] @ 0x01147910
  - ldr x8, [sp+0x580] @ 0x0114792c
  - ldr x19, [sp+0x520] @ 0x01147d30
  - ldr x19, [sp+0x9d0] @ 0x01147e0c
  - ldr x19, [sp+0x520] @ 0x01147e98
  - ldr x19, [x22+0x248] @ 0x01148128
  - ldr x19, [sp+0x9d0] @ 0x011481b0
  - ldr x19, [sp+0x158] @ 0x01148284

## TextEngine::Create(uchar*,int,bool) @ 0x011466b8
- Hits: 13
  - ldr x21, [x22+0x248] @ 0x01146c00
  - ldr x19, [sp+0x9d0] @ 0x0114780c
  - ldr x19, [sp+0x520] @ 0x01147880
  - ldr x8, [sp+0x580] @ 0x011478c4
  - ldr x8, [sp+0x580] @ 0x011478f0
  - ldr x8, [sp+0x580] @ 0x01147910
  - ldr x8, [sp+0x580] @ 0x0114792c
  - ldr x19, [sp+0x520] @ 0x01147d30
  - ldr x19, [sp+0x9d0] @ 0x01147e0c
  - ldr x19, [sp+0x520] @ 0x01147e98
  - ldr x19, [x22+0x248] @ 0x01148128
  - ldr x19, [sp+0x9d0] @ 0x011481b0
  - ldr x19, [sp+0x158] @ 0x01148284
