# Bundle header table (extracted_bundles/assets)

Bundles scanned: 4

## Checks
- header_end expected 59, payload_offset expected 95
- const_match=1 means bytes 20..35 match 76f6f2fb17591a73192c515d55b72060
- key_match=1 means version key matches known table
- xor_zero=1 means payload[0:36] XOR (key+const) == 0x00 * 36

- bundle_codeengine_full.se: ver=2.7.2 size=5850892 header_end=59 payload_off=95 const_match=1 key_match=1 xor_zero=0 entropy_1m=7.99980
- bundle_international_faces_liveness.se: ver=2.7.2 size=118987071 header_end=59 payload_off=95 const_match=1 key_match=1 xor_zero=0 entropy_1m=7.99970
- bundle_newdocengine_demo_hiring_dsn.se: ver=3.2.0 size=56878300 header_end=59 payload_off=95 const_match=1 key_match=1 xor_zero=0 entropy_1m=7.99974
- bundle_textengine.se: ver=2.6.4 size=27200957 header_end=59 payload_off=95 const_match=1 key_match=1 xor_zero=0 entropy_1m=7.99981