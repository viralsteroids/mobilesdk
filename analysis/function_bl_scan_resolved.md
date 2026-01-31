# Function BL scan (PLT-resolved)

BL targets resolved to PLT symbols where possible.
PLT section: True, addr=0x02763c50 ent=16 entries=1149

## DocEngine::CreateFromEmbeddedBundle @ 0x009cdc3c
- file offset: 0x009cdc3c
- PLT call: _ZN2se2id15IdBaseFieldInfoC1Ebd
- PLT call: _ZNSt13runtime_errorC1EPKc
- PLT call: __cxa_guard_acquire
- PLT call: vsprintf

## IdEngine::CreateFromEmbeddedBundle @ 0x0117aaa0
- file offset: 0x0117aaa0
- PLT call: _ZN2se2id15IdBaseFieldInfoC1Ebd

## CodeEngine::CreateFromEmbeddedBundle @ 0x011e0678
- file offset: 0x011e0678
- PLT call: _ZN2se2id15IdBaseFieldInfoC1Ebd
- PLT call: _ZNSt9exceptionD2Ev
- PLT call: __cxa_free_exception
- PLT call: __cxa_throw
- PLT call: strcpy

## TextEngine::CreateFromEmbeddedBundle @ 0x0126b290
- file offset: 0x0126b290
- PLT call: _ZN2se4text12TextIteratorC1ERKNS0_16TextIteratorBaseE
- PLT call: _ZN2se4text14TextEngineImpl10GetVersionEv

## TextEngineImpl::FromEmbeddedBundle @ 0x01275ebc
- file offset: 0x01275ebc
- PLT call: _ZNSt9exceptionD2Ev
- PLT call: __cxa_free_exception
- PLT call: __cxa_throw
- PLT call: strcpy

## TextEngineImpl::InitFromOwnedZipBuffer @ 0x0126c380
- file offset: 0x0126c380
- PLT call: _ZN2se2id15IdBaseFieldInfoC1ERKS1_
- PLT call: _ZN2se2id15IdBaseFieldInfoC1Ebd
- PLT call: _ZN2se4text14TextEngineImpl4InitERKNS_4arch8FilePathEb
- PLT call: _ZNK2se4text14TextEngineImpl16ImplSpawnSessionERKNS0_23TextSessionSettingsImplEPKcPNS0_12TextFeedbackENSt6__ndk16vectorIhNS9_9allocatorIhEEEE
- PLT call: _ZNK2se4text14TextEngineImpl21GetBundleMainFilenameERKNS_4arch8FilePathE
- PLT call: _ZNSt12length_errorD1Ev
- PLT call: _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKc
- PLT call: _ZNSt6__ndk112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEEaSERKS5_
- PLT call: _ZNSt6__ndk115recursive_mutexD1Ev
- PLT call: _ZNSt6__ndk119__shared_weak_countD2Ev
- PLT call: _ZNSt9exceptionD2Ev
- PLT call: _ZSt9terminatev
- PLT call: __cxa_free_exception
- PLT call: __cxa_guard_acquire
- PLT call: __cxa_throw
- PLT call: strcpy
- PLT call: vsprintf