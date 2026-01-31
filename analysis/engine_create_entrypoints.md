# Engine.createEngine -> native entrypoints (smali)

## Engine wrappers
All Engine wrappers call static Create(...) methods on the corresponding SWIG Java classes:

- `CodeEngineWrapper.createEngine([B)`:
  - if bundle != null: `CodeEngine.Create([B, true)`
  - else: `CodeEngine.CreateFromEmbeddedBundle(true)`

- `DocEngineWrapper.createEngine([B)`:
  - if bundle != null: `DocEngine.Create([B, true)`
  - else: `DocEngine.CreateFromEmbeddedBundle(true)`

- `TextEngineWrapper.createEngine([B)`:
  - if bundle != null: `TextEngine.Create([B, true)`
  - else: `TextEngine.CreateFromEmbeddedBundle(true)`

- `IdEngineWrapper.createEngine([B)`:
  - calls private `createEngine([B, Z, I, Z)` with `(true, 0, true)`
  - which calls `IdEngine.Create([B, Z, I, Z)` or `IdEngine.CreateFromEmbeddedBundle(Z, I, Z)`

## Java -> JNI mapping
- `TextEngine.Create([BZ)` > `jnitextengineJNI.TextEngine_Create__SWIG_2([BZ)`
- `DocEngine.Create([BZ)` > `jnidocengineJNI.DocEngine_Create__SWIG_2([BZ)`
- `CodeEngine.Create([BZ)` > `jnicodeengineJNI.CodeEngine_Create__SWIG_2([BZ)`
- `IdEngine.Create([BZIZ)` > `jniidengineJNI.IdEngine_Create__SWIG_4([BZIZ)`

These JNI entrypoints are the concrete native targets that receive raw bundle bytes.
