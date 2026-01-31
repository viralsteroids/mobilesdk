# Payload header mirror check

Check whether the first 36 bytes of **post-XOR payload** match the 36-byte binary header.
We compare key part (bytes 0..19) and const part (bytes 20..35) separately.

- bundle_codeengine_full.se: text_header_len=59, status=OK, key=NO;const=NO
- bundle_international_faces_liveness.se: text_header_len=59, status=OK, key=NO;const=NO
- bundle_newdocengine_demo_hiring_dsn.se: text_header_len=59, status=OK, key=NO;const=NO
- bundle_textengine.se: text_header_len=59, status=OK, key=NO;const=NO
