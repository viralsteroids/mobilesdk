# Header key HMAC-SHA1 hypotheses

Tested HMAC-SHA1 with key candidates (hexid/version/header/const16) and message candidates (version/hexid/header + const16/tail).

| bundle | version | hexid | key20 | matches |
| --- | --- | --- | --- | --- |
| bundle_codeengine_full.se | 2.7.2 | 2688f026b0f34dea31b377bfe5fd1f6ecf2b984810 | a6d01f9528847cd118d154e96dd9fd2cd16f7a77 | - |
| bundle_international_faces_liveness.se | 2.7.2 | 2688f026b0f34dea31b377bfe5fd1f6ecf2b984810 | a6d01f9528847cd118d154e96dd9fd2cd16f7a77 | - |
| bundle_newdocengine_demo_hiring_dsn.se | 3.2.0 | 2688f026b0f34dea31b377bfe5fd1f6ecf2b984810 | c2ac4db5c62062bb0d7554d55613991b059fee8a | - |
| bundle_textengine.se | 2.6.4 | 2688f026b0f34dea31b377bfe5fd1f6ecf2b984810 | 3cb11e8c45e443f30057c9e6559c48cbd02c3c16 | - |
