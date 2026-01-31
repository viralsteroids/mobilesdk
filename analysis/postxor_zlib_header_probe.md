# Post-XOR zlib header probe

Heuristic: scan for valid zlib headers where CMF/FLG checksum matches (CMF*256+FLG) % 31 == 0, CMF method=8 (deflate).
Attempt decompression with zlib (wbits=+15) and raw deflate (wbits=-15) at candidate offsets; cap output to 2MB.

## bundle_codeengine_full_decrypted_raw.bin
- size: 5850828
- candidate zlib headers: 2001 (first 10: [309, 1115, 1867, 2261, 2323, 2383, 2464, 3330, 3623, 3910])
  - no successful zlib/raw-deflate decompressions in first 200 candidates

## bundle_codeengine_full_last_attempt.bin
- size: 5850833
- candidate zlib headers: 2001 (first 10: [352, 527, 1016, 1380, 1481, 2371, 2990, 3075, 3152, 3724])
  - no successful zlib/raw-deflate decompressions in first 200 candidates

## bundle_international_faces_liveness_decrypted_raw.bin
- size: 118986984
- candidate zlib headers: 2001 (first 10: [110, 377, 821, 1218, 1676, 1701, 2641, 3137, 3547, 3961])
  - no successful zlib/raw-deflate decompressions in first 200 candidates

## bundle_international_faces_liveness_last_attempt.bin
- size: 118987012
- candidate zlib headers: 2001 (first 10: [151, 158, 616, 695, 721, 912, 1012, 1072, 1354, 1680])
  - no successful zlib/raw-deflate decompressions in first 200 candidates

## bundle_newdocengine_demo_hiring_dsn_decrypted_raw.bin
- size: 56878236
- candidate zlib headers: 2001 (first 10: [212, 261, 429, 889, 2695, 2736, 3035, 3138, 3257, 3378])
  - no successful zlib/raw-deflate decompressions in first 200 candidates

## bundle_newdocengine_demo_hiring_dsn_last_attempt.bin
- size: 56878241
- candidate zlib headers: 2001 (first 10: [1555, 1957, 1981, 2069, 2171, 2175, 2216, 2766, 2853, 3727])
  - no successful zlib/raw-deflate decompressions in first 200 candidates

## bundle_textengine_decrypted_raw.bin
- size: 27200880
- candidate zlib headers: 2001 (first 10: [555, 744, 1579, 1706, 1831, 4414, 4744, 4789, 4815, 5058])
  - no successful zlib/raw-deflate decompressions in first 200 candidates

## bundle_textengine_last_attempt.bin
- size: 27200898
- candidate zlib headers: 2001 (first 10: [823, 2708, 2963, 3983, 4685, 5101, 5471, 6054, 6091, 7242])
  - no successful zlib/raw-deflate decompressions in first 200 candidates
