# zstd_out run comparison

Record runs are contiguous 8-byte sequences matching kind/size/idx predicate.
We show top runs by length and by nonzero density.

## zstd_out_1769666284656.bin

Top by length:

- Run 1: off 0x4838..0x6000 records=761 nonzero=1 (0.00)
  kinds: 0x00:760, 0x02:1
- Run 2: off 0x0020..0x1090 records=526 nonzero=525 (1.00)
  kinds: 0x01:183, 0x00:98, 0x06:82, 0x05:77, 0x03:33, 0x07:24

Top by nonzero count (nz_ratio>=0.10):

- Run 1: off 0x0020..0x1090 records=526 nonzero=525 (1.00)
  kinds: 0x01:183, 0x00:98, 0x06:82, 0x05:77, 0x03:33, 0x07:24
- Run 2: off 0x1820..0x2838 records=515 nonzero=515 (1.00)
  kinds: 0x03:225, 0x01:138, 0x02:45, 0x04:41, 0x08:19, 0x09:18
Run1 vs Run2 overlap: 9 pairs; Jaccard=0.010

## zstd_out_1769666284704.bin

Top by length:

- Run 1: off 0x0020..0x1090 records=526 nonzero=524 (1.00)
  kinds: 0x00:196, 0x01:130, 0x05:68, 0x06:51, 0x03:33, 0x07:22
- Run 2: off 0x1820..0x2838 records=515 nonzero=515 (1.00)
  kinds: 0x03:228, 0x01:117, 0x02:68, 0x07:26, 0x04:22, 0x09:18

Top by nonzero count (nz_ratio>=0.10):

- Run 1: off 0x0020..0x1090 records=526 nonzero=524 (1.00)
  kinds: 0x00:196, 0x01:130, 0x05:68, 0x06:51, 0x03:33, 0x07:22
- Run 2: off 0x1820..0x2838 records=515 nonzero=515 (1.00)
  kinds: 0x03:228, 0x01:117, 0x02:68, 0x07:26, 0x04:22, 0x09:18
Run1 vs Run2 overlap: 11 pairs; Jaccard=0.013

## zstd_out_1769666284714.bin

Top by length:

- Run 1: off 0x0020..0x0c90 records=398 nonzero=396 (0.99)
  kinds: 0x00:137, 0x01:121, 0x05:50, 0x06:38, 0x03:23, 0x04:14

Top by nonzero count (nz_ratio>=0.10):

- Run 1: off 0x0020..0x0c90 records=398 nonzero=396 (0.99)
  kinds: 0x00:137, 0x01:121, 0x05:50, 0x06:38, 0x03:23, 0x04:14

## zstd_out_1769666284717.bin

Top by length:

- Run 1: off 0x0020..0x0aa8 records=337 nonzero=336 (1.00)
  kinds: 0x01:113, 0x00:110, 0x05:42, 0x06:32, 0x03:16, 0x04:14

Top by nonzero count (nz_ratio>=0.10):

- Run 1: off 0x0020..0x0aa8 records=337 nonzero=336 (1.00)
  kinds: 0x01:113, 0x00:110, 0x05:42, 0x06:32, 0x03:16, 0x04:14

## zstd_out_1769666284722.bin

Top by length:

- Run 1: off 0x0020..0x1058 records=519 nonzero=517 (1.00)
  kinds: 0x00:207, 0x01:121, 0x05:63, 0x06:53, 0x03:35, 0x04:18
- Run 2: off 0x1260..0x12c0 records=12 nonzero=12 (1.00)
  kinds: 0x04:6, 0x06:3, 0x05:3

Top by nonzero count (nz_ratio>=0.10):

- Run 1: off 0x0020..0x1058 records=519 nonzero=517 (1.00)
  kinds: 0x00:207, 0x01:121, 0x05:63, 0x06:53, 0x03:35, 0x04:18
- Run 2: off 0x1260..0x12c0 records=12 nonzero=12 (1.00)
  kinds: 0x04:6, 0x06:3, 0x05:3
Run1 vs Run2 overlap: 0 pairs; Jaccard=0.000

