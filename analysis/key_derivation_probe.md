# Key derivation probe (offline)

Goal: test if per-version 20-byte keys are simple hashes of version/license tokens.

Inputs:
- Version keys (20 bytes) from bundle headers
- ASCII header token: `2688f026b0f34dea31b377bfe5fd1f6ecf2b984810` (21 bytes)
- Prefix (20 bytes): `2688f026b0f34dea31b377bfe5fd1f6ecf2b9848`

Tested (stdlib `hashlib`):
- SHA1, SHA256 (truncated to 20), MD5
- Data candidates: `version`, `hex_token`, `hex_prefix`, `version+hex_token`, `version+hex_prefix`, `hex_token+version`, `hex_prefix+version`

Result:
- **No matches** for any version key.

Script: `analysis/_test_key_hashes.py`
