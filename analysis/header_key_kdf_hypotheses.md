# Header key KDF hypotheses (SHA1 combos)

Tested SHA1 on concatenations of hexid/version/header, plus const16 and tail 0x10.

| bundle | version | hexid | key20 | matches |
| --- | --- | --- | --- | --- |
| bundle_codeengine_full.se | 2.7.2 | 2688f026b0f34dea31b377bfe5fd1f6ecf2b984810 | a6d01f9528847cd118d154e96dd9fd2cd16f7a77 | - |
| bundle_international_faces_liveness.se | 2.7.2 | 2688f026b0f34dea31b377bfe5fd1f6ecf2b984810 | a6d01f9528847cd118d154e96dd9fd2cd16f7a77 | - |
| bundle_newdocengine_demo_hiring_dsn.se | 3.2.0 | 2688f026b0f34dea31b377bfe5fd1f6ecf2b984810 | c2ac4db5c62062bb0d7554d55613991b059fee8a | - |
| bundle_textengine.se | 2.6.4 | 2688f026b0f34dea31b377bfe5fd1f6ecf2b984810 | 3cb11e8c45e443f30057c9e6559c48cbd02c3c16 | - |
