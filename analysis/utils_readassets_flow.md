# UtilsKt.readAssetsFile (smali)

## Summary
- `readAssetsFile(context, filePath)` opens the asset with `AssetManager.open(filePath, 2)` (STREAMING mode) and then calls `readFromStream4`.
- `readFromStream4` does a single `available()` call, allocates a byte array of that exact size, reads once, and closes the stream. If the number of bytes read differs, it throws `Exception("stream reading error")`.
- No decompression or transformation is applied in Java/Kotlin before passing bytes into `engine.createEngine([B)`.

## Implication
All decoding, decryption, and container handling happens in native (`libjnimultiengine.so`) after `Engine.createEngine(byte[])`.
