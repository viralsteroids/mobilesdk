# AES-CTR probe (raw/post-XOR key/IV)

## bundle_international_faces_liveness
- raw_payload + raw key/iv: key=ecf01836caf811101d06798c374c7d855d72b8eb3151a56368b89cf74b666f39 iv=5b28de2011d0df5e8ad1f27da4c8b8d8
  - big-endian: hits=[('json', 295)] printable_runs=[]
  - little-endian: hits=[('json', 265)] printable_runs=[]
- raw_payload + post key/iv: key=5315e529a4373a885516af8bb0419091589b4048e8772d934e086fbaa157dc4e iv=f8f1f8a8e1f66fadc73bc3ced3775d25
  - big-endian: hits=[('json', 88)] printable_runs=[]
  - little-endian: hits=[('json', 171)] printable_runs=[]
- post_xor + raw key/iv: key=ecf01836caf811101d06798c374c7d855d72b8eb3151a56368b89cf74b666f39 iv=5b28de2011d0df5e8ad1f27da4c8b8d8
  - big-endian: hits=[('json', 224)] printable_runs=[]
  - little-endian: hits=[('json', 437)] printable_runs=[]
- post_xor + post key/iv: key=5315e529a4373a885516af8bb0419091589b4048e8772d934e086fbaa157dc4e iv=f8f1f8a8e1f66fadc73bc3ced3775d25
  - big-endian: hits=[('json', 117)] printable_runs=[]
  - little-endian: hits=[('json', 47)] printable_runs=[]

## bundle_newdocengine_demo_hiring_dsn
- raw_payload + raw key/iv: key=d7af366dd4f0eb9b73961f324bce78e51673bcd39b7d26dae29400d3ffa1cbe9 iv=1fc4975b91e7f7b884c9cf460a21afdd
  - big-endian: hits=[('json', 89)] printable_runs=[]
  - little-endian: hits=[('json', 389)] printable_runs=[]
- raw_payload + post key/iv: key=a010d390cb9e24b0ebde0fe44c4975080276552b38a4005212b2b020b24bfa5a iv=00aa587009afe76e834ec2ab1e244625
  - big-endian: hits=[('json', 194)] printable_runs=[]
  - little-endian: hits=[('json', 121)] printable_runs=[]
- post_xor + raw key/iv: key=d7af366dd4f0eb9b73961f324bce78e51673bcd39b7d26dae29400d3ffa1cbe9 iv=1fc4975b91e7f7b884c9cf460a21afdd
  - big-endian: hits=[('json', 212)] printable_runs=[]
  - little-endian: hits=[('gzip', 362479), ('json', 87)] printable_runs=[]
- post_xor + post key/iv: key=a010d390cb9e24b0ebde0fe44c4975080276552b38a4005212b2b020b24bfa5a iv=00aa587009afe76e834ec2ab1e244625
  - big-endian: hits=[('json', 341)] printable_runs=[]
  - little-endian: hits=[('json', 258)] printable_runs=[]
