# JNI create() BL targets mapped to symbols

Library: C:\temp\MobileSDK\SmartEngines_full\lib\arm64-v8a\libjnimultiengine.so
Scan window: 0x2000 bytes
Symbol sources: .dynsym

## DocEngine::Create(char*,bool) @ 0x00965160
- BL count: 364
- Unique targets: 4
- Top targets (mapped):
  - 0x02380d30: 232 | sec=.plt | sym=nearest pcre2_get_match_data_heapframes_size_16 @ 0x0236c3c8
  - 0x02380d90: 81 | sec=.plt | sym=nearest pcre2_get_match_data_heapframes_size_16 @ 0x0236c3c8
  - 0x01ccfc40: 41 | sec=.text | sym=nearest _ZN2se4text13TextChunkImpl13SetProcOcrstrERKNS_3ocr9OcrStringE @ 0x010820b0
  - 0x01d02dbc: 10 | sec=.text | sym=nearest _ZN2se4text13TextChunkImpl13SetProcOcrstrERKNS_3ocr9OcrStringE @ 0x010820b0

## DocEngine::Create(uchar*,int,bool) @ 0x009655dc
- BL count: 358
- Unique targets: 5
- Top targets (mapped):
  - 0x02380d30: 250 | sec=.plt | sym=nearest pcre2_get_match_data_heapframes_size_16 @ 0x0236c3c8
  - 0x02380d90: 59 | sec=.plt | sym=nearest pcre2_get_match_data_heapframes_size_16 @ 0x0236c3c8
  - 0x01ccfc40: 41 | sec=.text | sym=nearest _ZN2se4text13TextChunkImpl13SetProcOcrstrERKNS_3ocr9OcrStringE @ 0x010820b0
  - 0x01d02dbc: 7 | sec=.text | sym=nearest _ZN2se4text13TextChunkImpl13SetProcOcrstrERKNS_3ocr9OcrStringE @ 0x010820b0
  - 0x02380d00: 1 | sec=.plt | sym=nearest pcre2_get_match_data_heapframes_size_16 @ 0x0236c3c8

## TextEngine::Create(char*,bool) @ 0x0114662c
- BL count: 113
- Unique targets: 40
- Top targets (mapped):
  - 0x02381b90: 14 | sec=.plt | sym=nearest pcre2_get_match_data_heapframes_size_16 @ 0x0236c3c8
  - 0x02380d30: 13 | sec=.plt | sym=nearest pcre2_get_match_data_heapframes_size_16 @ 0x0236c3c8
  - 0x0074a810: 8 | sec=.text | sym=nearest __emutls_get_address @ 0x00749d94
  - 0x02381f50: 8 | sec=.plt | sym=nearest pcre2_get_match_data_heapframes_size_16 @ 0x0236c3c8
  - 0x02380d90: 5 | sec=.plt | sym=nearest pcre2_get_match_data_heapframes_size_16 @ 0x0236c3c8
  - 0x008440f8: 5 | sec=.text | sym=nearest _ZN2se6common23SerializationParametersC1ERKS1_ @ 0x00843a5c
  - 0x00ac2b64: 5 | sec=.text | sym=nearest _ZNK2se3doc28DocMultiStringTextObjectImpl21ImplSerializeSpecificERNS_6common18SerializerImplBaseE @ 0x009ebaa4
  - 0x00ac2554: 4 | sec=.text | sym=nearest _ZNK2se3doc28DocMultiStringTextObjectImpl21ImplSerializeSpecificERNS_6common18SerializerImplBaseE @ 0x009ebaa4
  - 0x0114caac: 4 | sec=.text | sym=nearest _ZN2se4text13TextChunkImpl13SetProcOcrstrERKNS_3ocr9OcrStringE @ 0x010820b0
  - 0x02381390: 3 | sec=.plt | sym=nearest pcre2_get_match_data_heapframes_size_16 @ 0x0236c3c8
  - 0x0219cb8c: 2 | sec=.text | sym=nearest _ZN2se4text13TextChunkImpl13SetProcOcrstrERKNS_3ocr9OcrStringE @ 0x010820b0
  - 0x00e9f1f8: 2 | sec=.text | sym=nearest _ZNK2se3doc28DocMultiStringTextObjectImpl21ImplSerializeSpecificERNS_6common18SerializerImplBaseE @ 0x009ebaa4

## TextEngine::Create(uchar*,int,bool) @ 0x011466b8
- BL count: 118
- Unique targets: 42
- Top targets (mapped):
  - 0x02381b90: 14 | sec=.plt | sym=nearest pcre2_get_match_data_heapframes_size_16 @ 0x0236c3c8
  - 0x02380d30: 13 | sec=.plt | sym=nearest pcre2_get_match_data_heapframes_size_16 @ 0x0236c3c8
  - 0x0074a810: 8 | sec=.text | sym=nearest __emutls_get_address @ 0x00749d94
  - 0x02381f50: 8 | sec=.plt | sym=nearest pcre2_get_match_data_heapframes_size_16 @ 0x0236c3c8
  - 0x02380d90: 5 | sec=.plt | sym=nearest pcre2_get_match_data_heapframes_size_16 @ 0x0236c3c8
  - 0x008440f8: 5 | sec=.text | sym=nearest _ZN2se6common23SerializationParametersC1ERKS1_ @ 0x00843a5c
  - 0x00ac2b64: 5 | sec=.text | sym=nearest _ZNK2se3doc28DocMultiStringTextObjectImpl21ImplSerializeSpecificERNS_6common18SerializerImplBaseE @ 0x009ebaa4
  - 0x00ac2554: 4 | sec=.text | sym=nearest _ZNK2se3doc28DocMultiStringTextObjectImpl21ImplSerializeSpecificERNS_6common18SerializerImplBaseE @ 0x009ebaa4
  - 0x0114caac: 4 | sec=.text | sym=nearest _ZN2se4text13TextChunkImpl13SetProcOcrstrERKNS_3ocr9OcrStringE @ 0x010820b0
  - 0x02381390: 3 | sec=.plt | sym=nearest pcre2_get_match_data_heapframes_size_16 @ 0x0236c3c8
  - 0x023813b0: 3 | sec=.plt | sym=nearest pcre2_get_match_data_heapframes_size_16 @ 0x0236c3c8
  - 0x0083f398: 3 | sec=.text | sym=nearest _ZN2se6common5Image16GetNumberOfPagesEPKc @ 0x0083ef20
