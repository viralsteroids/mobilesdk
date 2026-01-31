# Extended payload statistical tests (sampled)

Sample size: 4194304 bytes (per file, from start of payload).

| file | kind | length | sample_len | entropy | ioc | chi_square | corr1 | corr2 | corr4 | corr8 | corr16 | corr32 | zlib_ratio_sample_4m |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| bundle_codeengine_full.se | ciphertext_payload | 5850797 | 4194304 | 7.99993 | 0.003907 | 383.15 | -0.000346 | -0.000822 | -0.000769 | -0.000079 | 0.000046 | 0.000013 | 1.0003 |
| bundle_international_faces_liveness.se | ciphertext_payload | 118986976 | 4194304 | 7.99986 | 0.003907 | 816.05 | -0.000258 | -0.000257 | 0.000017 | -0.000229 | 0.000396 | -0.000565 | 1.0003 |
| bundle_newdocengine_demo_hiring_dsn.se | ciphertext_payload | 56878205 | 4194304 | 7.99992 | 0.003907 | 474.28 | -0.000538 | 0.000552 | -0.000860 | 0.000015 | 0.000194 | 0.000023 | 1.0003 |
| bundle_textengine.se | ciphertext_payload | 27200862 | 4194304 | 7.99988 | 0.003907 | 691.42 | 0.000047 | -0.000515 | -0.002093 | 0.000229 | -0.000316 | -0.000384 | 1.0003 |
| bundle_codeengine_full_last_attempt.bin | postxor_payload | 5850797 | 4194304 | 7.99992 | 0.003907 | 462.08 | 0.000137 | -0.000413 | 0.000521 | -0.000078 | -0.000215 | -0.000124 | 1.0003 |
| bundle_international_faces_liveness_last_attempt.bin | postxor_payload | 118986976 | 4194304 | 7.99988 | 0.003907 | 684.15 | 0.000631 | -0.000250 | 0.001230 | -0.000160 | -0.000202 | -0.000650 | 1.0003 |
| bundle_newdocengine_demo_hiring_dsn_last_attempt.bin | postxor_payload | 56878205 | 4194304 | 7.99992 | 0.003907 | 455.17 | 0.000276 | -0.000728 | 0.001508 | -0.000013 | -0.000349 | 0.000001 | 1.0003 |
| bundle_textengine_last_attempt.bin | postxor_payload | 27200862 | 4194304 | 7.99990 | 0.003907 | 564.67 | -0.000739 | -0.000135 | 0.001511 | -0.000095 | 0.000197 | -0.000057 | 1.0003 |
