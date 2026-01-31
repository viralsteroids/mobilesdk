# EngineLoader bundle flow (smali)

## Model static config
- `jniLibrary` = "jnimultiengine" in `com/smartengines/app/Model.<clinit>`.
- Bundles are constructed as `EngineBundle$File` with fixed filenames:
  - `bundle_codeengine_full.se`
  - `bundle_international_faces_liveness.se`
  - `bundle_newdocengine_demo_hiring_dsn.se`
  - `bundle_textengine.se`

## Model.load > EngineLoader.load
`Model.load(context)` obtains each EngineStaff loader and calls:

```
EngineLoader.load(context, jniLibrary, bundleX, onLoaded)
```

All four bundles are passed as `EngineBundle$File`, not `Embedded` or `FirstFound`.

## EngineLoader$load$1 (coroutine)
1) `System.loadLibrary(jniLibrary)`
2) Switch on bundle type:
   - **EngineBundle$File**:
     - `UtilsKt.readAssetsFile(context, filePath)`
   - **EngineBundle$FirstFound**:
     - `AssetManager.list(dir)` then pick first file ending with `fileExtension`
     - `UtilsKt.readAssetsFile(context, dir + File.separator + filename)`
     - If no match: throws `Exception("bundle file not found, dir: \"assets/<dir>\" file extension: \"<ext>\"")`
   - **EngineBundle$Embedded**:
     - Passes `null` bundle data
3) `engine.createEngine(byte[] data)` is invoked. For Embedded, `data` is null; otherwise bytes read from assets.

## Implication
In this build, the engine is always created from asset bytes (File path). The embedded-bundle path is present but unused by `Model.load`.
