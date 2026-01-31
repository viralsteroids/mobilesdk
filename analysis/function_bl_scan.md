# Function BL scan

BL call targets for bundle entry points (ARM64).

## Interest symbol addresses
- archive_read_open_memory2: 0x026eb810
- archive_read_support_filter_zstd: 0x026ebadc
- archive_read_support_format_zip: 0x026f3388
- archive_read_next_header: 0x02701320
- archive_read_data: 0x026e9f20
- ZSTD_decompressStream: 0x0270eac0
- ZSTD_decompressDCtx: 0x0270c984
- ZSTD_decompress: 0x0270ca8c

## DocEngine::CreateFromEmbeddedBundle @ 0x009cdc3c
- file offset: 0x009cdc3c
- direct BL hits: none
- sample BL targets:
  - 0x00b965cc
  - 0x027657e0
  - 0x02763cb0
  - 0x0081875c
  - 0x02768420
  - 0x02763d00

## IdEngine::CreateFromEmbeddedBundle @ 0x0117aaa0
- file offset: 0x0117aaa0
- direct BL hits: none
- sample BL targets:
  - 0x0119d90c
  - 0x02763d00

## CodeEngine::CreateFromEmbeddedBundle @ 0x011e0678
- file offset: 0x011e0678
- direct BL hits: none
- sample BL targets:
  - 0x02764700
  - 0x02765570
  - 0x02764720
  - 0x02764710
  - 0x0081875c
  - 0x02763d00

## TextEngine::CreateFromEmbeddedBundle @ 0x0126b290
- file offset: 0x0126b290
- direct BL hits: none
- sample BL targets:
  - 0x027660a0
  - 0x027660b0

## TextEngineImpl::FromEmbeddedBundle @ 0x01275ebc
- file offset: 0x01275ebc
- direct BL hits: none
- sample BL targets:
  - 0x02764700
  - 0x02765570
  - 0x02764720
  - 0x02764710
  - 0x0081875c

## TextEngineImpl::InitFromOwnedZipBuffer @ 0x0126c380
- file offset: 0x0126c380
- direct BL hits: none
- sample BL targets:
  - 0x02763d00
  - 0x02558a08
  - 0x02764760
  - 0x02766130
  - 0x00818500
  - 0x02764700
  - 0x02765570
  - 0x02764720
  - 0x00b88284
  - 0x02763cb0
  - 0x02763c90
  - 0x0082114c
  - 0x027657d0
  - 0x02764710
  - 0x02763d20
  - 0x0081875c
  - 0x02768420
  - 0x0081cae8
  - 0x02765c60
  - 0x02765b70