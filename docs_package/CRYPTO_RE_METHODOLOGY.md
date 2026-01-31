# Методология реверс-инжиниринга зашифрованных SDK

## Руководство для агентов по анализу криптографически защищённых мобильных SDK

---

## 1. Фазы проекта

```
┌─────────────────────────────────────────────────────────────────────────┐
│  ФАЗА 1: РАЗВЕДКА (2-4 часа)                                           │
│  ├── Инвентаризация файлов                                              │
│  ├── Идентификация форматов                                             │
│  └── Поиск известных сигнатур                                           │
├─────────────────────────────────────────────────────────────────────────┤
│  ФАЗА 2: СТАТИЧЕСКИЙ АНАЛИЗ (4-8 часов)                                │
│  ├── Декомпиляция APK/SO                                                │
│  ├── Поиск криптографических констант                                   │
│  └── Маппинг JNI/Native функций                                         │
├─────────────────────────────────────────────────────────────────────────┤
│  ФАЗА 3: ДИНАМИЧЕСКИЙ АНАЛИЗ (4-8 часов)                               │
│  ├── Frida хуки на crypto API                                           │
│  ├── Дамп памяти в ключевых точках                                      │
│  └── Трассировка вызовов                                                │
├─────────────────────────────────────────────────────────────────────────┤
│  ФАЗА 4: РЕКОНСТРУКЦИЯ (2-4 часа)                                      │
│  ├── Реализация декриптора                                              │
│  ├── Валидация на всех файлах                                           │
│  └── Документирование формата                                           │
└─────────────────────────────────────────────────────────────────────────┘
```

---

## 2. Фаза 1: Разведка

### 2.1 Инвентаризация файлов

```python
# Скрипт сканирования структуры APK
import zipfile
import os

def scan_apk(apk_path):
    """Полная инвентаризация APK"""
    inventory = {
        'native_libs': [],      # .so файлы
        'assets': [],           # assets/*
        'dex': [],              # classes*.dex
        'resources': [],        # res/*
        'unknown_formats': []   # Неизвестные форматы
    }

    with zipfile.ZipFile(apk_path) as apk:
        for name in apk.namelist():
            info = apk.getinfo(name)
            entry = {
                'path': name,
                'size': info.file_size,
                'compressed': info.compress_size
            }

            # Классификация
            if name.startswith('lib/') and name.endswith('.so'):
                inventory['native_libs'].append(entry)
            elif name.startswith('assets/'):
                # Проверка magic bytes
                data = apk.read(name)[:64]
                entry['magic'] = data[:16].hex()
                entry['entropy'] = calculate_entropy(data)
                inventory['assets'].append(entry)
            # ... продолжение классификации

    return inventory
```

### 2.2 Идентификация форматов

**Проверочный список magic bytes:**

| Magic | Формат | Действие |
|-------|--------|----------|
| `50 4B 03 04` | ZIP/JAR | Распаковать, проверить вложенные |
| `28 B5 2F FD` | ZSTD | Декомпрессия zstd |
| `1F 8B 08` | GZIP | Декомпрессия gzip |
| `FD 37 7A 58 5A` | XZ | Декомпрессия xz |
| `7F 45 4C 46` | ELF | Анализ Ghidra/IDA |
| `CA FE BA BE` | Java class | Декомпиляция |
| `64 65 78 0A` | DEX | Декомпиляция smali |
| Высокая энтропия (>7.5) | Encrypted | Требует расшифровки |
| ASCII текст | Config/Script | Прямой анализ |

### 2.3 Анализ энтропии

```python
import math
from collections import Counter

def calculate_entropy(data: bytes) -> float:
    """Shannon entropy: 0 = uniform, 8 = random/encrypted"""
    if not data:
        return 0
    freq = Counter(data)
    length = len(data)
    return -sum(
        (count/length) * math.log2(count/length)
        for count in freq.values()
    )

def entropy_map(data: bytes, block_size: int = 4096) -> list:
    """Карта энтропии по блокам"""
    return [
        (i, calculate_entropy(data[i:i+block_size]))
        for i in range(0, len(data), block_size)
    ]

# Интерпретация:
# < 4.0 - текст, код, структурированные данные
# 4.0-6.0 - сжатые данные
# 6.0-7.5 - сильно сжатые данные
# > 7.5 - зашифрованные или случайные данные
```

---

## 3. Фаза 2: Статический анализ

### 3.1 Декомпиляция APK

```bash
# 1. Извлечение APK
apktool d app.apk -o app_decoded/

# 2. Структура результата
app_decoded/
├── AndroidManifest.xml    # Разрешения, компоненты
├── smali_classes*/        # Байткод Dalvik
├── res/                   # Ресурсы
├── assets/                # Бинарные ассеты
└── lib/                   # Native библиотеки
```

### 3.2 Поиск криптографических констант

```python
# Известные криптографические константы
CRYPTO_SIGNATURES = {
    # AES S-box (первые байты)
    bytes.fromhex('637c777bf26b6fc53001672bfed7ab76'): 'AES S-box',

    # SHA-1 initial values
    bytes.fromhex('67452301efcdab8998badcfe10325476'): 'SHA-1 IV',

    # SHA-256 initial values
    bytes.fromhex('6a09e667bb67ae853c6ef372a54ff53a'): 'SHA-256 IV',

    # MD5 initial values
    bytes.fromhex('01234567'): 'MD5 IV (partial)',

    # RC4 identity permutation (начало)
    bytes([i for i in range(256)][:16]): 'RC4 S-box init',

    # ZSTD dictionary magic
    bytes.fromhex('ec30a437'): 'ZSTD dictionary',

    # ChaCha20 constant "expand 32-byte k"
    b'expand 32-byte k': 'ChaCha20 constant',
}

def scan_for_crypto(data: bytes) -> list:
    """Сканирование на криптографические константы"""
    findings = []
    for sig, name in CRYPTO_SIGNATURES.items():
        pos = data.find(sig)
        if pos != -1:
            findings.append({
                'type': name,
                'offset': hex(pos),
                'context': data[pos:pos+64].hex()
            })
    return findings
```

### 3.3 Ghidra анализ native библиотек

```python
# Ghidra headless скрипт для анализа .so
# Сохранить как analyze_crypto.py

from ghidra.program.model.symbol import SymbolType
from ghidra.app.decompiler import DecompInterface

def find_crypto_functions():
    """Поиск криптографических функций"""
    crypto_keywords = [
        'crypt', 'cipher', 'aes', 'sha', 'md5', 'hash',
        'encrypt', 'decrypt', 'key', 'xor', 'zstd',
        'decompress', 'inflate', 'decode'
    ]

    results = []
    symbol_table = currentProgram.getSymbolTable()

    for symbol in symbol_table.getAllSymbols(True):
        name = symbol.getName().lower()
        if any(kw in name for kw in crypto_keywords):
            results.append({
                'name': symbol.getName(),
                'address': symbol.getAddress(),
                'type': symbol.getSymbolType()
            })

    return results

def decompile_function(addr):
    """Декомпиляция функции"""
    decompiler = DecompInterface()
    decompiler.openProgram(currentProgram)

    func = getFunctionAt(addr)
    if func:
        result = decompiler.decompileFunction(func, 60, monitor)
        if result.decompileCompleted():
            return result.getDecompiledFunction().getC()
    return None
```

### 3.4 Маппинг JNI функций

```bash
# Извлечение JNI символов из .so
# Паттерн: Java_<package>_<class>_<method>

strings libnative.so | grep "^Java_" | sort -u > jni_methods.txt

# Пример результата:
# Java_com_example_Crypto_decrypt
# Java_com_example_Crypto_encrypt
# Java_com_example_Bundle_load
```

```python
# Маппинг JNI на smali
def map_jni_to_smali(jni_symbol: str) -> dict:
    """Преобразование JNI символа в Java сигнатуру"""
    # Java_com_example_Crypto_decrypt
    parts = jni_symbol.replace('Java_', '').split('_')

    # Восстановление package/class
    # Обработка escape-последовательностей (_1 = _, _2 = ;, _3 = [)
    package_class = '.'.join(parts[:-1])
    method = parts[-1]

    return {
        'jni': jni_symbol,
        'class': package_class,
        'method': method,
        'smali_path': f"smali_classes*/{package_class.replace('.', '/')}.smali"
    }
```

---

## 4. Фаза 3: Динамический анализ

### 4.1 Frida setup

```bash
# Установка Frida
pip install frida-tools

# Загрузка frida-server для Android
wget https://github.com/frida/frida/releases/download/16.x.x/frida-server-android-arm64

# На устройстве (root)
adb push frida-server /data/local/tmp/
adb shell chmod +x /data/local/tmp/frida-server
adb shell /data/local/tmp/frida-server &
```

### 4.2 Универсальный хук шифрования

```javascript
// frida_crypto_hook.js
// Хук всех потенциальных криптографических операций

const CRYPTO_FUNCTIONS = [
    // OpenSSL
    'EVP_DecryptInit_ex', 'EVP_EncryptInit_ex',
    'EVP_CipherInit_ex', 'EVP_DecryptUpdate',
    'AES_set_decrypt_key', 'AES_cbc_encrypt',

    // ZSTD
    'ZSTD_decompress', 'ZSTD_decompressDCtx',
    'ZSTD_DCtx_loadDictionary', 'ZSTD_decompress_usingDDict',

    // libarchive
    'archive_read_open_memory', 'archive_read_data',

    // Общие паттерны
    'decrypt', 'decode', 'decompress', 'unpack'
];

function hookCryptoFunction(moduleName, funcName) {
    const addr = Module.findExportByName(moduleName, funcName);
    if (!addr) return;

    Interceptor.attach(addr, {
        onEnter: function(args) {
            console.log(`[${funcName}] Called`);
            console.log(`  arg0: ${args[0]}`);
            console.log(`  arg1: ${args[1]}`);

            // Дамп буфера если это указатель на данные
            if (args[1].toInt32() > 0 && args[1].toInt32() < 0x10000) {
                // args[1] вероятно размер, args[0] - буфер
                const size = Math.min(args[1].toInt32(), 256);
                console.log(`  Buffer: ${hexdump(args[0], {length: size})}`);
            }

            this.startTime = Date.now();
        },
        onLeave: function(retval) {
            const elapsed = Date.now() - this.startTime;
            console.log(`[${funcName}] Returned: ${retval} (${elapsed}ms)`);
        }
    });

    console.log(`Hooked: ${funcName} @ ${addr}`);
}

// Хук при загрузке библиотеки
function hookOnLibraryLoad(libPattern) {
    const libs = Process.enumerateModules();
    for (const lib of libs) {
        if (lib.name.includes(libPattern)) {
            console.log(`Found library: ${lib.name} @ ${lib.base}`);

            // Хук всех экспортов
            const exports = lib.enumerateExports();
            for (const exp of exports) {
                const nameLower = exp.name.toLowerCase();
                if (CRYPTO_FUNCTIONS.some(f => nameLower.includes(f.toLowerCase()))) {
                    hookCryptoFunction(lib.name, exp.name);
                }
            }
        }
    }
}

// Запуск
Java.perform(function() {
    console.log("Frida crypto hook started");
    hookOnLibraryLoad('jni');
    hookOnLibraryLoad('crypto');
    hookOnLibraryLoad('ssl');
});
```

### 4.3 Дамп памяти в ключевых точках

```javascript
// frida_memory_dump.js
// Дамп расшифрованных данных

function dumpOnMagicBytes(ptr, size, magicPatterns) {
    """Дамп когда обнаружены известные magic bytes"""
    const data = ptr.readByteArray(Math.min(size, 16));
    const bytes = new Uint8Array(data);

    for (const [magic, name] of Object.entries(magicPatterns)) {
        const magicBytes = hexToBytes(magic);
        if (bytesMatch(bytes, magicBytes)) {
            console.log(`[!] Found ${name} at ${ptr}`);

            // Полный дамп
            const fullData = ptr.readByteArray(size);
            const filename = `/data/local/tmp/dump_${name}_${Date.now()}.bin`;

            const file = new File(filename, 'wb');
            file.write(fullData);
            file.close();

            console.log(`[+] Dumped ${size} bytes to ${filename}`);
            return true;
        }
    }
    return false;
}

const MAGIC_PATTERNS = {
    '504B0304': 'ZIP',
    '28B52FFD': 'ZSTD',
    '1F8B08': 'GZIP',
    '7573746172': 'TAR',  // "ustar"
    '7B22': 'JSON',       // {"
};

// Хук на memcpy для отслеживания копирования данных
Interceptor.attach(Module.findExportByName(null, 'memcpy'), {
    onEnter: function(args) {
        const dest = args[0];
        const src = args[1];
        const size = args[2].toInt32();

        if (size > 1024 && size < 100000000) {
            dumpOnMagicBytes(src, size, MAGIC_PATTERNS);
        }
    }
});
```

### 4.4 Трассировка XOR операций

```javascript
// frida_xor_trace.js
// Обнаружение XOR шифрования

// Хук на инструкции XOR в целевой функции
function traceXorInFunction(moduleName, funcOffset) {
    const base = Module.findBaseAddress(moduleName);
    const funcAddr = base.add(funcOffset);

    Stalker.follow(Process.getCurrentThreadId(), {
        transform: function(iterator) {
            let instruction;
            while ((instruction = iterator.next()) !== null) {
                // Ищем XOR инструкции
                if (instruction.mnemonic === 'eor' ||
                    instruction.mnemonic === 'xor') {

                    iterator.putCallout(function(context) {
                        console.log(`XOR @ ${instruction.address}`);
                        console.log(`  Operands: ${instruction.opStr}`);
                        // Дамп регистров
                        console.log(`  X0=${context.x0} X1=${context.x1}`);
                    });
                }
                iterator.keep();
            }
        }
    });
}

// Альтернатива: эвристический поиск XOR ключа
function findXorKey(encrypted, knownPlaintext) {
    """Восстановление XOR ключа по известному plaintext"""
    const keyLen = 256; // Максимальная длина ключа
    const key = new Uint8Array(keyLen);

    for (let i = 0; i < Math.min(encrypted.length, knownPlaintext.length); i++) {
        key[i % keyLen] = encrypted[i] ^ knownPlaintext[i];
    }

    // Поиск повторяющегося паттерна
    for (let len = 1; len <= 128; len++) {
        let isRepeating = true;
        for (let i = len; i < keyLen; i++) {
            if (key[i] !== key[i % len]) {
                isRepeating = false;
                break;
            }
        }
        if (isRepeating) {
            console.log(`Found repeating key of length ${len}`);
            return key.slice(0, len);
        }
    }

    return key;
}
```

---

## 5. Типичные схемы шифрования

### 5.1 XOR с фиксированным ключом

**Признаки:**
- Ключ статически вшит в бинарник
- Низкая энтропия ключа (часто ASCII или структурированные данные)
- Одинаковый результат при повторном запуске

**Подход к взлому:**
```python
def crack_xor_key(ciphertext: bytes, known_plaintext: bytes) -> bytes:
    """Восстановление ключа при известном plaintext"""
    key = bytes(c ^ p for c, p in zip(ciphertext, known_plaintext))

    # Поиск длины ключа (периода)
    for key_len in range(1, 257):
        if all(key[i] == key[i % key_len] for i in range(len(key))):
            return key[:key_len]

    return key

# Использование с известным magic bytes
# Если знаем, что plaintext начинается с ZSTD magic (28 B5 2F FD)
known = bytes([0x28, 0xB5, 0x2F, 0xFD])
key_fragment = crack_xor_key(ciphertext[:4], known)
```

### 5.2 AES-CBC/CTR

**Признаки:**
- Размер блока 16 байт
- Наличие IV в начале данных
- Высокая равномерность энтропии

**Поиск ключа:**
```javascript
// Frida хук на AES функции OpenSSL
Interceptor.attach(Module.findExportByName(null, 'AES_set_decrypt_key'), {
    onEnter: function(args) {
        const keyPtr = args[0];
        const bits = args[1].toInt32();
        const keyLen = bits / 8;

        console.log(`AES key (${bits} bits):`);
        console.log(hexdump(keyPtr, {length: keyLen}));

        // Сохранение ключа
        const key = keyPtr.readByteArray(keyLen);
        send({type: 'aes_key', key: key, bits: bits});
    }
});
```

### 5.3 Многослойное шифрование

**Признаки:**
- После первого слоя расшифровки данные всё ещё имеют высокую энтропию
- Несколько вызовов криптографических функций
- Промежуточные буферы

**Подход:**
```
Layer 1: Custom XOR/scrambling
    ↓
Layer 2: AES/ChaCha20
    ↓
Layer 3: ZSTD/GZIP compression
    ↓
Layer 4: Container format (TAR/ZIP)
```

```python
def peel_layers(data: bytes) -> list:
    """Послойное снятие защиты"""
    layers = []
    current = data

    while True:
        layer_info = {'input_size': len(current)}

        # Попытка ZSTD
        if current[:4] == b'\x28\xB5\x2F\xFD':
            import zstandard
            current = zstandard.decompress(current)
            layer_info['type'] = 'ZSTD'
            layers.append(layer_info)
            continue

        # Попытка GZIP
        if current[:2] == b'\x1f\x8b':
            import gzip
            current = gzip.decompress(current)
            layer_info['type'] = 'GZIP'
            layers.append(layer_info)
            continue

        # Попытка XOR (если известен ключ)
        # ...

        # Больше слоёв не обнаружено
        break

    return layers, current
```

---

## 6. Координация агентов

### 6.1 Параллельные задачи

```
┌─────────────────────────────────────────────────────────────────────────┐
│  AGENT COORDINATOR                                                       │
├─────────────────────────────────────────────────────────────────────────┤
│                                                                          │
│  ┌──────────────┐  ┌──────────────┐  ┌──────────────┐                   │
│  │  AGENT A     │  │  AGENT B     │  │  AGENT C     │                   │
│  │  Static      │  │  Dynamic     │  │  Documentation│                  │
│  │  Analysis    │  │  Analysis    │  │  & Reporting │                   │
│  ├──────────────┤  ├──────────────┤  ├──────────────┤                   │
│  │ • Ghidra     │  │ • Frida      │  │ • Format docs│                   │
│  │ • Strings    │  │ • Memory dump│  │ • API mapping│                   │
│  │ • Crypto scan│  │ • Trace calls│  │ • Code struct│                   │
│  └──────┬───────┘  └──────┬───────┘  └──────┬───────┘                   │
│         │                 │                 │                            │
│         └────────────┬────┴────────────────┘                            │
│                      ▼                                                   │
│              SHARED FINDINGS                                             │
│              (AGENT_TASKS.md)                                            │
│                                                                          │
└─────────────────────────────────────────────────────────────────────────┘
```

### 6.2 Формат задач

```markdown
# AGENT_TASKS.md

## Активные задачи

### [TASK-001] Извлечение XOR ключа
- **Статус**: IN_PROGRESS
- **Агент**: A (Static)
- **Приоритет**: HIGH
- **Блокирует**: TASK-002, TASK-003
- **Прогресс**:
  - [x] Найдены криптографические константы
  - [x] Идентифицирован offset в .so
  - [ ] Извлечение и валидация ключа

### [TASK-002] Декомпрессия бандлов
- **Статус**: BLOCKED
- **Агент**: B (Dynamic)
- **Зависит от**: TASK-001
- **Заметки**: Ожидание XOR ключа

### [TASK-003] Документация формата
- **Статус**: IN_PROGRESS
- **Агент**: C (Docs)
- **Прогресс**:
  - [x] Структура заголовка
  - [ ] Полная схема шифрования
```

### 6.3 Протокол обмена находками

```python
# shared_findings.py
# Централизованное хранилище находок

import json
from datetime import datetime
from pathlib import Path

FINDINGS_FILE = Path("analysis/FINDINGS.json")

def add_finding(agent: str, category: str, data: dict):
    """Добавление находки"""
    findings = load_findings()

    finding = {
        'id': len(findings) + 1,
        'agent': agent,
        'category': category,
        'timestamp': datetime.now().isoformat(),
        'data': data
    }

    findings.append(finding)
    save_findings(findings)

    # Уведомление других агентов
    notify_agents(finding)

def load_findings() -> list:
    if FINDINGS_FILE.exists():
        return json.loads(FINDINGS_FILE.read_text())
    return []

def save_findings(findings: list):
    FINDINGS_FILE.write_text(json.dumps(findings, indent=2))

# Примеры использования:
add_finding(
    agent="A",
    category="crypto_key",
    data={
        "type": "XOR",
        "offset": "0x3737888",
        "size": 128,
        "file": "libjnimultiengine.so"
    }
)

add_finding(
    agent="B",
    category="api_trace",
    data={
        "function": "ZSTD_decompress",
        "input_size": 5800000,
        "output_size": 18000000
    }
)
```

---

## 7. Чеклисты

### 7.1 Начало проекта

- [ ] Создать рабочую директорию с структурой:
  ```
  project/
  ├── analysis/           # Скрипты анализа
  ├── extracted/          # Извлечённые данные
  ├── dumps/              # Дампы памяти
  ├── docs/               # Документация
  └── tools/              # Утилиты
  ```

- [ ] Инвентаризация всех файлов
- [ ] Расчёт энтропии для всех бинарных файлов
- [ ] Поиск известных magic bytes
- [ ] Экспорт строк из native библиотек

### 7.2 Статический анализ

- [ ] Декомпиляция APK (apktool)
- [ ] Анализ AndroidManifest.xml
- [ ] Поиск JNI native методов
- [ ] Ghidra анализ .so файлов
- [ ] Поиск криптографических констант
- [ ] Маппинг функций загрузки ассетов

### 7.3 Динамический анализ

- [ ] Подготовка устройства (root, Frida)
- [ ] Хуки на System.loadLibrary
- [ ] Хуки на AssetManager.open
- [ ] Хуки на криптографические функции
- [ ] Дамп расшифрованных данных
- [ ] Трассировка XOR/AES операций

### 7.4 Финализация

- [ ] Реализация автономного декриптора
- [ ] Валидация на всех файлах
- [ ] Документация формата
- [ ] Карта взаимосвязей кода
- [ ] Коммит и бэкап

---

## 8. Типичные ошибки

### 8.1 Технические

| Ошибка | Решение |
|--------|---------|
| Неверный offset ключа | Использовать file offset, не virtual address |
| Ключ всё время нули | Проверить сегмент .bss (неинициализированные данные) |
| ZSTD требует dictionary | Поиск ZSTD_DCtx_loadDictionary в трейсе |
| Данные после XOR всё ещё зашифрованы | Возможно многослойное шифрование |

### 8.2 Методологические

| Ошибка | Решение |
|--------|---------|
| Слишком ранний переход к динамике | Сначала исчерпать статический анализ |
| Игнорирование документации | Проверять существующие анализы (AGENTS.md, etc.) |
| Работа без бэкапов | Коммитить после каждого значимого шага |
| Отсутствие валидации | Проверять декриптор на ВСЕХ файлах |

---

## 9. Инструменты

### 9.1 Обязательные

| Инструмент | Назначение |
|------------|------------|
| apktool | Декомпиляция APK |
| Ghidra | Анализ native кода |
| Frida | Динамическая инструментация |
| Python 3 + zstandard | Скрипты анализа |
| adb | Взаимодействие с устройством |

### 9.2 Рекомендуемые

| Инструмент | Назначение |
|------------|------------|
| jadx | Декомпиляция DEX в Java |
| radare2/rizin | Быстрый анализ бинарников |
| binwalk | Поиск вложенных форматов |
| 010 Editor | Hex-редактор с шаблонами |
| Wireshark | Анализ сетевого трафика |

---

## 10. Шаблоны документации

### 10.1 Формат файла

```markdown
# [FORMAT_NAME] File Format Specification

## Overview
Brief description of the format purpose.

## Structure

| Offset | Size | Field | Description |
|--------|------|-------|-------------|
| 0x00 | 4 | magic | Magic bytes |
| 0x04 | 4 | version | Format version |
| ... | ... | ... | ... |

## Encryption/Compression
- Layer 1: [Algorithm] with [key source]
- Layer 2: [Algorithm]

## Decryption Code
```python
# Minimal working decryptor
```

## Validation
- Checksum: [algorithm] at [offset]
- Magic bytes: [bytes] at [offset]
```

### 10.2 Функция native

```markdown
# Function: [name]

## Location
- File: `lib/arm64-v8a/libname.so`
- Offset: `0x12345678`
- Virtual address: `0x87654321`

## Signature
```c
return_type function_name(arg1_type arg1, arg2_type arg2, ...)
```

## Purpose
Description of what the function does.

## Called by
- `parent_function` @ 0x...
- `another_caller` @ 0x...

## Calls
- `child_function` @ 0x...

## Key operations
1. Step 1
2. Step 2
3. Step 3
```

---

*Методология разработана на основе анализа SmartEngines SDK*
*Версия: 1.0 | Дата: 2026-01-31*
