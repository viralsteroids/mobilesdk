# dynsym current bundle targets

Source: `C:\\temp\\MobileSDK\\analysis\\libjnimultiengine_current.so` (pyelftools dynsym scan, 2026-01-29 18:27).
Addresses are symbol VAs; file offsets are derived from section file offsets when possible.

## Matches

| Symbol | Vaddr | File offset | Section | Tags |
| --- | --- | --- | --- | --- |
| `Java_com_smartengines_code_jnicodeengineJNI_CodeEngine_1CreateFromEmbeddedBundle_1_1SWIG_10` | `0x0098c344` | `0x0098c344` | `.text` | CreateFromEmbeddedBundle, JNI, SWIG |
| `Java_com_smartengines_code_jnicodeengineJNI_CodeEngine_1CreateFromEmbeddedBundle_1_1SWIG_11` | `0x0098c738` | `0x0098c738` | `.text` | CreateFromEmbeddedBundle, JNI, SWIG |
| `Java_com_smartengines_code_jnicodeengineJNI_swig_1module_1init` | `0x0098decc` | `0x0098decc` | `.text` | JNI, SWIG |
| `Java_com_smartengines_doc_jnidocengineJNI_DocEngine_1CreateFromEmbeddedBundle_1_1SWIG_10` | `0x009246c4` | `0x009246c4` | `.text` | CreateFromEmbeddedBundle, JNI, SWIG |
| `Java_com_smartengines_doc_jnidocengineJNI_DocEngine_1CreateFromEmbeddedBundle_1_1SWIG_11` | `0x00924ab4` | `0x00924ab4` | `.text` | CreateFromEmbeddedBundle, JNI, SWIG |
| `Java_com_smartengines_doc_jnidocengineJNI_swig_1module_1init` | `0x009435a8` | `0x009435a8` | `.text` | JNI, SWIG |
| `Java_com_smartengines_id_jniidengineJNI_IdEngine_1CreateFromEmbeddedBundle_1_1SWIG_10` | `0x00898afc` | `0x00898afc` | `.text` | CreateFromEmbeddedBundle, JNI, SWIG |
| `Java_com_smartengines_id_jniidengineJNI_IdEngine_1CreateFromEmbeddedBundle_1_1SWIG_11` | `0x00898e48` | `0x00898e48` | `.text` | CreateFromEmbeddedBundle, JNI, SWIG |
| `Java_com_smartengines_id_jniidengineJNI_IdEngine_1CreateFromEmbeddedBundle_1_1SWIG_12` | `0x00899194` | `0x00899194` | `.text` | CreateFromEmbeddedBundle, JNI, SWIG |
| `Java_com_smartengines_id_jniidengineJNI_IdEngine_1CreateFromEmbeddedBundle_1_1SWIG_13` | `0x008994e0` | `0x008994e0` | `.text` | CreateFromEmbeddedBundle, JNI, SWIG |
| `Java_com_smartengines_id_jniidengineJNI_swig_1module_1init` | `0x00899840` | `0x00899840` | `.text` | JNI, SWIG |
| `Java_com_smartengines_text_jnitextengineJNI_TextEngine_1CreateFromEmbeddedBundle_1_1SWIG_10` | `0x0099f224` | `0x0099f224` | `.text` | CreateFromEmbeddedBundle, JNI, SWIG |
| `Java_com_smartengines_text_jnitextengineJNI_TextEngine_1CreateFromEmbeddedBundle_1_1SWIG_11` | `0x0099f620` | `0x0099f620` | `.text` | CreateFromEmbeddedBundle, JNI, SWIG |
| `Java_com_smartengines_text_jnitextengineJNI_swig_1module_1init` | `0x0099fd94` | `0x0099fd94` | `.text` | JNI, SWIG |
| `_ZN2se2id8IdEngine24CreateFromEmbeddedBundleEbib` | `0x0117aaa0` | `0x0117aaa0` | `.text` | CreateFromEmbeddedBundle |
| `_ZN2se3doc9DocEngine24CreateFromEmbeddedBundleEb` | `0x009cdc3c` | `0x009cdc3c` | `.text` | CreateFromEmbeddedBundle |
| `_ZN2se4code10CodeEngine24CreateFromEmbeddedBundleEb` | `0x011e0678` | `0x011e0678` | `.text` | CreateFromEmbeddedBundle |
| `_ZN2se4text10TextEngine24CreateFromEmbeddedBundleEb` | `0x0126b290` | `0x0126b290` | `.text` | CreateFromEmbeddedBundle |
| `_ZN2se4text14TextEngineImpl18InitFromFileLoaderENSt6__ndk110shared_ptrINS_4arch18AbstractFileLoaderEEERKNS2_12basic_stringIcNS2_11char_traitsIcEENS2_9allocatorIcEEEEb` | `0x0126c6c0` | `0x0126c6c0` | `.text` | Engine init |
| `_ZN2se4text14TextEngineImpl19InitFromOwnedBufferENS_4arch17UniqueBytesBufferEbi` | `0x0126c148` | `0x0126c148` | `.text` | Engine init |
| `_ZN2se4text14TextEngineImpl22InitFromOwnedZipBufferENS_4arch17UniqueBytesBufferEmbi` | `0x0126c380` | `0x0126c380` | `.text` | InitFromOwnedZipBuffer, Engine init |
| `_ZN2se4text14TextEngineImpl31InitFromJsonFilePathIfPermittedERNS_4arch8FilePathEb` | `0x0126c0f8` | `0x0126c0f8` | `.text` | Engine init |
| `_ZN2se4text14TextEngineImpl4InitERKNS_4arch8FilePathEb` | `0x0126d478` | `0x0126d478` | `.text` | Engine init |

## Notes

- JNI SWIG exports include the `Java_*CreateFromEmbeddedBundle*_SWIG_*` entry points and the `*_swig_module_init` functions shown above.