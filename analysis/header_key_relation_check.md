# Header key vs post-XOR payload relation

Checks whether key20 XOR lic20 equals post-XOR payload[0:20], and whether post-XOR[20:36] equals header const16.

| bundle | version | key^lic == postxor[0:20] | postxor[20:36]==const16 |
| --- | --- | --- | --- |
| bundle_codeengine_full.se | 2.7.2 | True | False |
| bundle_international_faces_liveness.se | 2.7.2 | True | False |
| bundle_newdocengine_demo_hiring_dsn.se | 3.2.0 | True | False |
| bundle_textengine.se | 2.6.4 | True | False |

## Details

### bundle_codeengine_full.se
- version: 2.7.2
- lic20: 2688f026b0f34dea31b377bfe5fd1f6ecf2b9848
- key20: a6d01f9528847cd118d154e96dd9fd2cd16f7a77
- key^lic: 8058efb39877313b296223568824e2421e44e23f
- postxor[0:20]: 8058efb39877313b296223568824e2421e44e23f
- const16: 76f6f2fb17591a73192c515d55b72060
- postxor[20:36]: 6620f57c1ab40e76f0d4f284733fd046

### bundle_international_faces_liveness.se
- version: 2.7.2
- lic20: 2688f026b0f34dea31b377bfe5fd1f6ecf2b9848
- key20: a6d01f9528847cd118d154e96dd9fd2cd16f7a77
- key^lic: 8058efb39877313b296223568824e2421e44e23f
- postxor[0:20]: 8058efb39877313b296223568824e2421e44e23f
- const16: 76f6f2fb17591a73192c515d55b72060
- postxor[20:36]: 6620f57c1ab40e76f0d4f284733fd046

### bundle_newdocengine_demo_hiring_dsn.se
- version: 3.2.0
- lic20: 2688f026b0f34dea31b377bfe5fd1f6ecf2b9848
- key20: c2ac4db5c62062bb0d7554d55613991b059fee8a
- key^lic: e424bd9376d32f513cc6236ab3ee8675cab476c2
- postxor[0:20]: e424bd9376d32f513cc6236ab3ee8675cab476c2
- const16: 76f6f2fb17591a73192c515d55b72060
- postxor[20:36]: 6620f57c1ab40e76f0d4f284733fd046

### bundle_textengine.se
- version: 2.6.4
- lic20: 2688f026b0f34dea31b377bfe5fd1f6ecf2b9848
- key20: 3cb11e8c45e443f30057c9e6559c48cbd02c3c16
- key^lic: 1a39eeaaf5170e1931e4be59b06157a51f07a45e
- postxor[0:20]: 1a39eeaaf5170e1931e4be59b06157a51f07a45e
- const16: 76f6f2fb17591a73192c515d55b72060
- postxor[20:36]: 6620f57c1ab40e76f0d4f284733fd046

