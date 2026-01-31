# Context-swap helper callsites grouped by nearest prologue

Library: C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so
Calls list: C:\temp\MobileSDK\analysis\bl_callers_0074a7e0_0074a810.md
Heuristic: group by nearest STP X29,X30, [SP, -imm]! before the callsite.
Function range is approximated as [prologue .. next_prologue).

## Prologue 0x00b23808 (approx range 0x00b23808..0x00b2401b)
- call @ 0x00b23c6c (+0x464)
- call @ 0x00b23c88 (+0x480)

## Prologue 0x01120f50 (approx range 0x01120f50..0x0112175f)
- call @ 0x01121314 (+0x3c4)
- call @ 0x01121330 (+0x3e0)

## Prologue 0x01143948 (approx range 0x01143948..0x011490d3)
- call @ 0x011461b4 (+0x286c)
- call @ 0x0114638c (+0x2a44)
- call @ 0x01146c14 (+0x32cc)
- call @ 0x01147874 (+0x3f2c)
- call @ 0x0114789c (+0x3f54)
- call @ 0x01147e74 (+0x452c)
- call @ 0x01147eb4 (+0x456c)
- call @ 0x0114817c (+0x4834)
- call @ 0x011481c0 (+0x4878)
- call @ 0x01148294 (+0x494c)
- call @ 0x01149024 (+0x56dc)

## Prologue 0x011493c0 (approx range 0x011493c0..0x0114cc9b)
- call @ 0x01149928 (+0x568)
- call @ 0x0114a0e0 (+0xd20)
- call @ 0x0114a584 (+0x11c4)

## Prologue 0x0132b588 (approx range 0x0132b588..0x0132e8ab)
- call @ 0x0132dad8 (+0x2550)
- call @ 0x0132daf4 (+0x256c)

## Prologue 0x0137bee0 (approx range 0x0137bee0..0x013899db)
- call @ 0x0137dd2c (+0x1e4c)
- call @ 0x0137dd48 (+0x1e68)
