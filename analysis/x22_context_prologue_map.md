# x22 context-field access map (offsets 0x230/0x240/0x248)

Library: C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so
Heuristic: map LDR/STR [X22+imm] to nearest STP X29,X30 prologue.

## Prologue 0x00b23808 [context-swap prologue] (approx range 0x00b23808..0x00b2401b)
- STR X9, [X22+0x230] @ 0x00b23c5c
- LDR X23, [X22+0x248] @ 0x00b23c70
- STR X25, [X22+0x240] @ 0x00b23c74
- STR X21, [X22+0x248] @ 0x00b23c78

## Prologue 0x00eb3fc0 (approx range 0x00eb3fc0..0x00eb6c97)
- STR X8, [X22+0x230] @ 0x00eb595c

## Prologue 0x011106e0 (approx range 0x011106e0..0x01119ddb)
- LDR X26, [X22+0x240] @ 0x01113ee4
- LDR X25, [X22+0x240] @ 0x01113f24
- LDR X0, [X22+0x240] @ 0x01113f60

## Prologue 0x01120f50 [context-swap prologue] (approx range 0x01120f50..0x0112175f)
- STR X9, [X22+0x230] @ 0x011212fc
- LDR X21, [X22+0x248] @ 0x01121318
- STR X27, [X22+0x240] @ 0x0112131c
- STR X23, [X22+0x248] @ 0x01121320

## Prologue 0x01143948 [context-swap prologue] (approx range 0x01143948..0x011490d3)
- STR X9, [X22+0x230] @ 0x01146bf4
- LDR X21, [X22+0x248] @ 0x01146c00
- LDR X19, [X22+0x248] @ 0x01148128
- STR X9, [X22+0x230] @ 0x0114816c

## Prologue 0x011493c0 [context-swap prologue] (approx range 0x011493c0..0x0114cc9b)
- STR X9, [X22+0x230] @ 0x0114a564
- LDR X23, [X22+0x248] @ 0x0114a570

## Prologue 0x0114cc9c (approx range 0x0114cc9c..0x0114cf6b)
- STR X8, [X22+0x230] @ 0x0114cec0

## Prologue 0x0129d1b0 (approx range 0x0129d1b0..0x0129d853)
- STR X8, [X22+0x230] @ 0x0129d5b8

## Prologue 0x012a2f4c (approx range 0x012a2f4c..0x012a5cc7)
- STR X8, [X22+0x230] @ 0x012a48ec

## Prologue 0x0130a28c (approx range 0x0130a28c..0x0130a927)
- LDR X21, [X22+0x240] @ 0x0130a584

## Prologue 0x0130dbf4 (approx range 0x0130dbf4..0x0130e38b)
- LDR X9, [X22+0x230] @ 0x0130dff0
- LDR X19, [X22+0x248] @ 0x0130dffc
- LDR X23, [X22+0x240] @ 0x0130e000

## Prologue 0x0132b588 [context-swap prologue] (approx range 0x0132b588..0x0132e8ab)
- STR X9, [X22+0x230] @ 0x0132dac8
- LDR X23, [X22+0x248] @ 0x0132dadc
- STR X20, [X22+0x240] @ 0x0132dae0
- STR X19, [X22+0x248] @ 0x0132dae4

## Prologue 0x01340a68 (approx range 0x01340a68..0x01342863)
- LDR X10, [X22+0x240] @ 0x01341d60
- LDR X20, [X22+0x240] @ 0x01341d80

## Prologue 0x01345804 (approx range 0x01345804..0x01346f83)
- LDR X23, [X22+0x248] @ 0x013468b4
- STR X9, [X22+0x230] @ 0x013468e0

## Prologue 0x0134c72c (approx range 0x0134c72c..0x0134daf3)
- LDR X23, [X22+0x248] @ 0x0134d11c
- STR X9, [X22+0x230] @ 0x0134d148

## Prologue 0x01351b68 (approx range 0x01351b68..0x013523eb)
- LDR X23, [X22+0x248] @ 0x01351df4
- STR X9, [X22+0x230] @ 0x01351e20

## Prologue 0x01353fe0 (approx range 0x01353fe0..0x013546c7)
- LDR X23, [X22+0x248] @ 0x013540f8
- STR X9, [X22+0x230] @ 0x01354124

## Prologue 0x01356100 (approx range 0x01356100..0x013575b7)
- LDR X19, [X22+0x240] @ 0x01356aec
- LDR X21, [X22+0x240] @ 0x01356c6c

## Prologue 0x0135ac84 (approx range 0x0135ac84..0x0135beab)
- LDR X23, [X22+0x248] @ 0x0135b324
- STR X9, [X22+0x230] @ 0x0135b350

## Prologue 0x0135e888 (approx range 0x0135e888..0x0135ed4b)
- LDR X23, [X22+0x248] @ 0x0135e970
- STR X9, [X22+0x230] @ 0x0135e99c

## Prologue 0x0137bee0 [context-swap prologue] (approx range 0x0137bee0..0x013899db)
- STR X9, [X22+0x230] @ 0x0137dd1c
- LDR X23, [X22+0x248] @ 0x0137dd30
- STR X20, [X22+0x240] @ 0x0137dd34
- STR X19, [X22+0x248] @ 0x0137dd38

## Prologue 0x0138b80c (approx range 0x0138b80c..0x0138c09f)
- LDR X23, [X22+0x248] @ 0x0138ba44
- STR X9, [X22+0x230] @ 0x0138ba70

## Prologue 0x0138c4b0 (approx range 0x0138c4b0..0x0138f5f3)
- LDR X23, [X22+0x248] @ 0x0138df30
- STR X9, [X22+0x230] @ 0x0138df5c

## Prologue 0x01394170 (approx range 0x01394170..0x0139682b)
- LDR X23, [X22+0x248] @ 0x01395160
- STR X9, [X22+0x230] @ 0x0139518c

## Prologue 0x01396ccc (approx range 0x01396ccc..0x0139905f)
- LDR X23, [X22+0x248] @ 0x01397e7c
- STR X9, [X22+0x230] @ 0x01397ea8

## Prologue 0x013a18c0 (approx range 0x013a18c0..0x013a1ccb)
- LDR X23, [X22+0x248] @ 0x013a1990
- STR X9, [X22+0x230] @ 0x013a19bc

## Prologue 0x013bfb84 (approx range 0x013bfb84..0x013c04ff)
- LDR X23, [X22+0x248] @ 0x013bfe60
- STR X9, [X22+0x230] @ 0x013bfe8c

## Prologue 0x013c60a8 (approx range 0x013c60a8..0x013c7d13)
- LDR X23, [X22+0x248] @ 0x013c6b8c
- STR X9, [X22+0x230] @ 0x013c6bb8

## Prologue 0x013dd95c (approx range 0x013dd95c..0x013de07f)
- LDR X23, [X22+0x248] @ 0x013ddaac
- STR X9, [X22+0x230] @ 0x013ddad8

## Prologue 0x013ed3ec (approx range 0x013ed3ec..0x013eddff)
- LDR X24, [X22+0x240] @ 0x013ed5c8
- LDR X0, [X22+0x240] @ 0x013ed7c4

## Prologue 0x01849988 (approx range 0x01849988..0x01849ceb)
- STR X8, [X22+0x230] @ 0x01849c40

## Prologue 0x0187f14c (approx range 0x0187f14c..0x0187f527)
- LDR X23, [X22+0x248] @ 0x0187f24c
- STR X9, [X22+0x230] @ 0x0187f278

## Prologue 0x01c75ec8 (approx range 0x01c75ec8..0x01c77fe7)
- LDR X0, [X22+0x230] @ 0x01c7659c
