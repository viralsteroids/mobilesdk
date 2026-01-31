Binary: C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so

BLR X27 window around 0x863990
  0x863970: LDR X25, [X26, 0x8]
  0x863974: LDR X27, [X26, 0x210]
  0x863978: LDR X24, [X26, 0x218]
  0x86397c: MOV X0, X25
  0x863988: MOV X0, X24
  0x86398c: MOV X1, X25
  0x863990: BLR X27

BLR X27 window around 0x863e24
  0x863e04: LDR X25, [X26, 0x8]
  0x863e08: LDR X27, [X26, 0x210]
  0x863e0c: LDR X24, [X26, 0x218]
  0x863e1c: MOV X0, X24
  0x863e20: MOV X1, X25
  0x863e24: BLR X27

BLR X27 window around 0x863ffc
  0x863fdc: LDR X25, [X26, 0x8]
  0x863fe0: LDR X27, [X26, 0x210]
  0x863fe4: LDR X24, [X26, 0x218]
  0x863ff4: MOV X0, X24
  0x863ff8: MOV X1, X25
  0x863ffc: BLR X27

Note: offsets 0x210/0x218 resemble the apktool offsets 0x6ac8/0x6ad0 but much smaller in this build.
