# License Hash / KDF Notes (FUN_010f9624)

## SHA1-style integrity check (strong evidence)

- Function: `FUN_010f9624` @ `0x010f9624`.
- Stack locals are initialized with the SHA1 IV:
  - `local_1a0 = 0xefcdab8967452301` (H0=0x67452301, H1=0xefcdab89)
  - `uStack_198 = 0x1032547698badcfe` (H2=0x98badcfe, H3=0x10325476)
  - `local_190 = 0xc3d2e1f0` (H4)
- Immediately after this init, the code calls `FUN_01a9f044(&local_1f0, &local_250)`.
- The output buffer `local_250` is compared against a 20-byte constant:
  - `0xea4df3b026f08826` (decompiler shows `-0x15b20c4fd90f77da`)
  - `0x6e1ffde5bf77b331`
  - `0x48982bcf`
- On mismatch, it throws:
  - `InternalException("Failed to initialize IdEngine: invalid internal library data")`.

Pseudo-structure:

```c
sha1_iv = { 0x67452301, 0xefcdab89, 0x98badcfe, 0x10325476, 0xc3d2e1f0 };
FUN_01a9f044(&seed_blob, &digest_20b);
if (digest_20b != CONST_20B) {
    throw InternalException("Failed to initialize IdEngine: invalid internal library data");
}
```

Interpretation: `FUN_01a9f044` is very likely a SHA1 (or SHA1-like) hash over a small static blob seeded on the stack. The digest length and IV constants line up exactly with SHA1. This looks like an integrity check, not a license KDF.

## Negative evidence (no KDF loops/tables here)

- No SHA1 round constants (`0x5a827999`, `0x6ed9eba1`, `0x8f1bbcdc`, `0xca62c1d6`) appear inside `FUN_010f9624`.
- No PBKDF2/HMAC-style iteration loops or S-box tables appear in this function.
- The body is predominantly config/map parsing; crypto seems delegated to `FUN_01a9f044`.

## FUN_00af449c

- Only string comparisons (`memcmp`) and configuration parsing are visible.
- No hash/KDF constants, round loops, or tables present in this wrapper.
