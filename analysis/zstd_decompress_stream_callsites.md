# ZSTD_decompressStream callsites (decoded windows)

Callsite @0x26ebf74 -> ZSTD_decompressStream
  0x26ebf44: d10043a2 ?
  0x26ebf48: 52800021 MOVZ X1, #0x1, LSL 0
  0x26ebf4c: 97fff397 BL 0x26e8da8
  0x26ebf50: f85f03a8 ?
  0x26ebf54: f90003e0 ?
  0x26ebf58: b7fff928 ?
  0x26ebf5c: b5000040 ?
  0x26ebf60: b4000348 ?
  0x26ebf64: f9400300 LDR X0, [X24, #0x0]
  0x26ebf68: 910063e1 ADD X1, X31, #0x18
  0x26ebf6c: 910003e2 ADD X2, X31, #0x0
  0x26ebf70: a900ffe8 ?
  0x26ebf74: 9401ec4f BL 0x27670b0
  0x26ebf78: aa0003f5 ?
  0x26ebf7c: b101dc1f ?
  0x26ebf80: 54000362 ?
  0x26ebf84: f9400a80 LDR X0, [X20, #0x10]
  0x26ebf88: f9400be1 LDR X1, [X31, #0x10]
  0x26ebf8c: 97fff94f BL 0x26ea4c8
  0x26ebf90: a94267e9 LDP X9, X25, [X31, #0x20]
  0x26ebf94: f10002bf ?
  0x26ebf98: 1a9f07e8 ?
  0x26ebf9c: 39008308 ?
  0x26ebfa0: eb09033f ?
  0x26ebfa4: 54000062 ?

Callsite @0x26f55b8 -> ZSTD_decompressStream
  0x26f5588: 9a88b128 ?
  0x26f558c: f100011f ?
  0x26f5590: 5400054d ?
  0x26f5594: f90427e8 ?
  0x26f5598: a94aa6e8 LDP X8, X9, [X23, #0xa8]
  0x26f559c: f90423e0 ?
  0x26f55a0: 910103e1 ADD X1, X31, #0x40
  0x26f55a4: 912103e2 ADD X2, X31, #0x840
  0x26f55a8: f9409ae0 LDR X0, [X23, #0x130]
  0x26f55ac: f9042bff ?
  0x26f55b0: a90427e8 ?
  0x26f55b4: f9002bff ?
  0x26f55b8: 9401c6be BL 0x27670b0
  0x26f55bc: b101dc1f ?
  0x26f55c0: 54001382 ?
  0x26f55c4: f9442bf6 LDR X22, [X31, #0x850]
  0x26f55c8: f9402bfa LDR X26, [X31, #0x50]
  0x26f55cc: b5000180 ?
  0x26f55d0: f94427e8 LDR X8, [X31, #0x848]
  0x26f55d4: eb0802df ?
  0x26f55d8: 54000121 ?
  0x26f55dc: f94027e8 LDR X8, [X31, #0x48]
  0x26f55e0: eb08035f ?
  0x26f55e4: 540000c2 ?
  0x26f55e8: f9409ae0 LDR X0, [X23, #0x130]

Callsite @0x27108a4 -> ZSTD_decompressStream
  0x2710874: aa0603f3 ?
  0x2710878: aa0303f4 ?
  0x271087c: f94016a8 LDR X8, [X21, #0x28]
  0x2710880: f81f83a8 ?
  0x2710884: f9400068 LDR X8, [X3, #0x0]
  0x2710888: f94000c9 LDR X9, [X6, #0x0]
  0x271088c: a9020be1 ?
  0x2710890: 910083e1 ADD X1, X31, #0x20
  0x2710894: 910023e2 ADD X2, X31, #0x8
  0x2710898: a90097e4 ?
  0x271089c: f9001be8 ?
  0x27108a0: f9000fe9 ?
  0x27108a4: 94015a03 BL 0x27670b0
  0x27108a8: f9401be8 LDR X8, [X31, #0x30]
  0x27108ac: f9400fe9 LDR X9, [X31, #0x18]
  0x27108b0: f9000288 ?
  0x27108b4: f9000269 ?
  0x27108b8: f94016a8 LDR X8, [X21, #0x28]
  0x27108bc: f85f83a9 ?
  0x27108c0: eb09011f ?
  0x27108c4: 540000c1 ?
  0x27108c8: a9464ff4 LDP X20, X19, [X31, #0x60]
  0x27108cc: f9402bf5 LDR X21, [X31, #0x50]
  0x27108d0: a9447bfd LDP X29, X30, [X31, #0x40]
  0x27108d4: 9101c3ff ADD X31, X31, #0x70