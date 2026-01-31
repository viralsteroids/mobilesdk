# Post-XOR constant derivation

Observed in all `*_last_attempt.bin` files:
- post?XOR bytes at offset `0x14..0x23`:
  `66 20 f5 7c 1a b4 0e 76 f0 d4 f2 84 73 3f d0 46`

Using the confirmed XOR key (32 bytes = license hash + tail), the key slice for offsets 0x14..0x23 is:
- `10 d6 07 87 0d ed 14 05 e9 f8 a3 d9 26 88 f0 26`

XORing the post?XOR block with this key slice yields:
- `76 f6 f2 fb 17 59 1a 73 19 2c 51 5d 55 b7 20 60`

This **matches the 16?byte constant in the binary header** (bytes 20..35).

Implication:
- The payload bytes at offset `0x14..0x23` (pre?XOR) equal the header constant.
- This also validates the XOR key alignment (offset mapping) and suggests a fixed marker or header inside the payload.
