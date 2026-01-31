# Crypto Algorithm Identification Report

## Summary

Анализ libjnimultiengine.so выявил следующие криптографические компоненты:

## Идентифицированные алгоритмы

### 1. Hash Functions

| Функция | Алгоритм | Константы | Назначение |
|---------|----------|-----------|------------|
| FUN_014099e0 | **MD5** | 0xD76AA478, 0x242070db (T-table) | License hash |
| FUN_027de380 | **SHA-1** | 0x5a827999, 0x6ed9eba1 (round constants) | Key derivation |
| FUN_027db64c | SHA-1 wrapper | 0xc3d2e1f0 (H4 initial) | Hashing data blocks |
| FUN_00c9448c | **xxHash64** | 0x9ae16a3b2f90404f (seed) | Fast checksum |

### 2. Encryption (Candidate)

| Offset | Pattern | Вероятный алгоритм |
|--------|---------|-------------------|
| 0x38c92e | RC4 S-box init [0..255] | **RC4** stream cipher |
| 0x38de50 | Custom 256-byte permutation | Modified S-box / custom cipher |

### 3. EOR Instructions

- ~2226 EOR (XOR) инструкций в бинарнике
- Указывает на активное использование XOR-based операций

## Crypto Chain Hypothesis

```
Bundle file (.se)
       │
       ▼
┌──────────────────┐
│ License Check    │ ← MD5 hash verification
│ (MD5)            │
└──────────────────┘
       │
       ▼
┌──────────────────┐
│ Key Derivation   │ ← SHA-1 based KDF
│ (SHA-1)          │
└──────────────────┘
       │
       ▼
┌──────────────────┐
│ Layer 1: XOR     │ ← 32-byte key (license_hash + tail)
│ decrypt          │
└──────────────────┘
       │
       ▼
┌──────────────────┐
│ Layer 2: RC4?    │ ← Потенциальный второй слой
│ decrypt          │   (нужно подтверждение)
└──────────────────┘
       │
       ▼
┌──────────────────┐
│ ZSTD decompress  │ ← Final decompression
└──────────────────┘
       │
       ▼
    Plaintext
```

## Key Addresses

- RC4 S-box init: `0x0038c92e`
- Custom S-box: `0x0038de50`
- Related string: "11MinImgGuard" @ `0x0038c920`
- SHA-1 function: `0x027de380`
- SHA-1 wrapper: `0x027db64c`
- MD5 function: `0x014099e0`
- xxHash64: `0x00c9448c`
- XOR cluster: `0x0130958c`

## Next Steps

1. **Подтвердить RC4**: Найти функцию, использующую S-box @ 0x38c92e
2. **Trace MinImgGuard**: Что за класс и как связан с шифрованием
3. **Ghidra GUI**: DATA xrefs к S-box адресам
4. **Dynamic analysis**: Перехватить RC4 keystream (когда устройство разблокируется)

## Files

- Decompiled crypto functions: `C:\temp\MobileSDK\decompiled_code\`
- Analysis scripts: `C:\temp\MobileSDK\analysis\_scan_cipher_patterns.py`
