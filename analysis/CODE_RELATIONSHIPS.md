# SmartEngines SDK - Полная карта взаимосвязей кода

## 1. Архитектурный обзор

```
┌─────────────────────────────────────────────────────────────────────────────┐
│                           APPLICATION LAYER                                  │
│  ┌─────────────────────────────────────────────────────────────────────┐    │
│  │  Kotlin/Java Application                                             │    │
│  │  ├── EngineLoader.load(context, "jnidocengine", bundle, callback)   │    │
│  │  ├── DocEngine.CreateSessionSettings()                               │    │
│  │  ├── DocEngine.SpawnSession(settings, feedback)                      │    │
│  │  └── DocSession.ProcessImage(image)                                  │    │
│  └─────────────────────────────────────────────────────────────────────┘    │
│                                    │                                         │
│                                    ▼                                         │
│  ┌─────────────────────────────────────────────────────────────────────┐    │
│  │  SWIG Wrapper Layer (Java)                                           │    │
│  │  ├── DocEngine.java          → jnidocengineJNI.java                 │    │
│  │  ├── IdEngine.java           → jniidengineJNI.java                  │    │
│  │  ├── TextEngine.java         → jnitextengineJNI.java                │    │
│  │  ├── CodeEngine.java         → jnicodeengineJNI.java                │    │
│  │  └── Image.java              → jnisecommonJNI.java                  │    │
│  └─────────────────────────────────────────────────────────────────────┘    │
│                                    │                                         │
│                                    ▼ JNI                                     │
├─────────────────────────────────────────────────────────────────────────────┤
│                           NATIVE LAYER                                       │
│  ┌─────────────────────────────────────────────────────────────────────┐    │
│  │  libjnimultiengine.so (42 MB, ARM64)                                │    │
│  │  ├── JNI Entrypoints (2,185 native methods)                         │    │
│  │  │   ├── Java_biz_smartengines_doc_*                                │    │
│  │  │   ├── Java_biz_smartengines_id_*                                 │    │
│  │  │   ├── Java_biz_smartengines_text_*                               │    │
│  │  │   └── Java_biz_smartengines_code_*                               │    │
│  │  │                                                                   │    │
│  │  ├── Bundle Loader                                                   │    │
│  │  │   ├── XOR Decrypt (key @ 0x3737888, 128 bytes)                   │    │
│  │  │   ├── ZSTD Decompress                                             │    │
│  │  │   └── TAR Extract                                                 │    │
│  │  │                                                                   │    │
│  │  ├── Engine Classes                                                  │    │
│  │  │   ├── DocEngine, IdEngine, TextEngine, CodeEngine                │    │
│  │  │   └── Session, Settings, Feedback implementations                │    │
│  │  │                                                                   │    │
│  │  ├── Neural Network Runtime                                          │    │
│  │  │   ├── Conv2D, Pool, RNN, CTC layers                              │    │
│  │  │   └── INT8 Quantized inference                                   │    │
│  │  │                                                                   │    │
│  │  └── Dependencies                                                    │    │
│  │      ├── libarchive (tar handling)                                  │    │
│  │      ├── zstd (compression)                                          │    │
│  │      └── OpenCV (image processing)                                   │    │
│  └─────────────────────────────────────────────────────────────────────┘    │
│                                    │                                         │
│                                    ▼                                         │
├─────────────────────────────────────────────────────────────────────────────┤
│                           DATA LAYER                                         │
│  ┌─────────────────────────────────────────────────────────────────────┐    │
│  │  .se Bundles (Encrypted)                                             │    │
│  │  ├── bundle_codeengine_full.se        (5.8 MB → 18 MB)              │    │
│  │  ├── bundle_international_faces_liveness.se (119 MB → 545 MB)       │    │
│  │  ├── bundle_newdocengine_demo_hiring_dsn.se (57 MB → 286 MB)        │    │
│  │  └── bundle_textengine.se             (27 MB → 70 MB)               │    │
│  └─────────────────────────────────────────────────────────────────────┘    │
└─────────────────────────────────────────────────────────────────────────────┘
```

---

## 2. JNI Биндинги (Java → Native)

### 2.1 Модули и количество методов

| Модуль | JNI Class | Native Methods | Назначение |
|--------|-----------|----------------|------------|
| **Document** | `jnidocengineJNI` | 939 | OCR документов, извлечение полей |
| **ID/Face** | `jniidengineJNI` | 641 | Паспорта, ID карты, liveness |
| **Common** | `jnisecommonJNI` | 329 | Image, Point, Polygon, Serializer |
| **Code** | `jnicodeengineJNI` | 187 | Штрих-коды, QR, банковские карты |
| **Text** | `jnitextengineJNI` | 89 | Полнотекстовый OCR |
| **TOTAL** | | **2,185** | |

### 2.2 SWIG паттерны генерации

```java
// Паттерн конструктора (перегрузки)
DocEngine_Create__SWIG_0(String signature, boolean debug)  // из файла подписи
DocEngine_Create__SWIG_1(String signature)                  // без debug
DocEngine_Create__SWIG_2(byte[] bundle, boolean debug)      // из byte[]
DocEngine_Create__SWIG_3(byte[] bundle)                     // без debug
DocEngine_CreateFromEmbeddedBundle__SWIG_0(boolean debug)   // встроенный бандл

// Паттерн деструктора
delete_DocEngine(long cPtr)

// Паттерн getter/setter
ClassName_fieldName_get(long cPtr)
ClassName_fieldName_set(long cPtr, value)

// Паттерн итератора
ClassName_Begin(long cPtr) → Iterator
Iterator_Advance(long iterPtr)
ClassName_End(long cPtr) → Iterator
```

### 2.3 Маппинг классов

```
Java Class                          → Native Function Prefix
─────────────────────────────────────────────────────────────
com.smartengines.doc.DocEngine      → Java_com_smartengines_doc_jnidocengineJNI_DocEngine_*
com.smartengines.doc.DocSession     → Java_com_smartengines_doc_jnidocengineJNI_DocSession_*
com.smartengines.id.IdEngine        → Java_com_smartengines_id_jniidengineJNI_IdEngine_*
com.smartengines.common.Image       → Java_com_smartengines_common_jnisecommonJNI_Image_*
```

---

## 3. Формат бандлов и расшифровка

### 3.1 Структура .se файла

```
┌────────────────────────────────────────────────────────────┐
│ HEADER (59 bytes)                                          │
│ "sebundle1~{version}~{license_hash}{dec_len}~"            │
│ Пример: sebundle1~2.7.2~2688f026b0f34dea31b377bfe5fd1f6ecf2b98481010~
├────────────────────────────────────────────────────────────┤
│ SHA1 CHECKSUM (20 bytes) - XOR encrypted                   │
│ Проверка: SHA1(header) == XOR(payload[0:20], key[0:20])   │
├────────────────────────────────────────────────────────────┤
│ MINI SECTION ({dec_len} bytes) - XOR encrypted             │
│ Содержит: "1~se_demo~" (идентификатор лицензии)           │
├────────────────────────────────────────────────────────────┤
│ BODY (остаток файла) - XOR encrypted                       │
│ После расшифровки: ZSTD compressed TAR archive            │
└────────────────────────────────────────────────────────────┘
```

### 3.2 XOR ключ

```
Расположение: libjnimultiengine.so @ file offset 0x3737888
Размер: 128 bytes (0x80)

Первые 32 байта:
90 d2 2f 0b cc 1c a0 58 0d 34 88 41 74 6b b2 cb
93 eb 36 9d 47 88 81 9e 48 3d 7f 1e 76 52 79 e8
...
```

### 3.3 Код расшифровки

```python
import hashlib
import zstandard as zstd
import tarfile
import io

def decrypt_sebundle(data: bytes, key_table: bytes) -> tuple[bytes, bytes]:
    """Расшифровка .se бандла"""

    # 1. Парсинг заголовка
    header_end = data.index(b'~', data.index(b'~', data.index(b'~') + 1) + 1) + 1
    header = data[:header_end].decode('ascii')

    # Извлечение dec_len
    parts = header.split('~')
    token = parts[2]
    dec_len = int(token[40:])  # После 40 hex символов

    payload = data[header_end:]

    # 2. Проверка SHA1
    sha1 = hashlib.sha1(data[:header_end]).digest()
    header_xor = bytes(payload[i] ^ key_table[i] for i in range(20))
    assert header_xor == sha1, "Header checksum mismatch"

    # 3. Расшифровка mini section
    mini = bytes(payload[20 + i] ^ key_table[20 + i] for i in range(dec_len))

    # 4. Расшифровка body
    body_start = 20 + dec_len
    body = bytearray()
    for i, b in enumerate(payload[body_start:]):
        key_idx = (body_start + i) & 0x7F  # Циклический 128 байт
        body.append(b ^ key_table[key_idx])

    return mini, bytes(body)

def decompress_bundle(body: bytes) -> bytes:
    """ZSTD декомпрессия"""
    dctx = zstd.ZstdDecompressor()
    return dctx.decompress(body)

def extract_bundle(tar_data: bytes, output_dir: str):
    """Извлечение TAR архива"""
    with tarfile.open(fileobj=io.BytesIO(tar_data)) as tar:
        tar.extractall(output_dir)
```

---

## 4. Структура бандлов

### 4.1 codeengine_bundle (Штрих-коды и карты)

```
bundle_codeengine_full/
├── bundle_codeengine_full.json       # Главный манифест
├── codeengine.json                   # Конфиг движка
│
├── docs/
│   ├── barcode/                      # QR, PDF417, DataMatrix
│   │   └── barcode_engine.json
│   ├── card/                         # Банковские карты
│   │   ├── card_engine.json
│   │   ├── card_embossed_number_recstr.json
│   │   └── card_indent_number_recstr.json
│   ├── code_text_line/               # VIN, контейнеры
│   ├── iban_lines/                   # IBAN
│   ├── inn_lines/                    # ИНН
│   └── license_plate/                # Номерные знаки
│
├── recstr/
│   ├── netdata/final/                # Нейросети
│   │   ├── synthetic/
│   │   │   ├── blines/blines.tar.zst           # Детектор линий
│   │   │   ├── eng/eng_101_mrz_fcr.tar.zst     # MRZ распознавание
│   │   │   └── mlang/cyrillic_111_all_fcr.tar.zst  # Кириллица
│   │   └── natural/
│   │       └── face/face_detector_yolo.tar.zst # Детектор лиц
│   └── special_nn/
│       ├── card_emb_bdig_fcr.tar.zst           # Эмбоссированные цифры
│       ├── card_indent_symdig_fcr.tar.zst      # Индентные цифры
│       └── card_type.tar.zst                    # Классификатор типа карты
│
├── postprocessor/                    # Постобработка
│   ├── email_interpreter.json
│   ├── gs1_interpreter.json
│   ├── isbn_interpreter.json
│   └── vcard_interpreter.json
│
└── mrz-data/                         # MRZ справочники
    └── mrz_engine_new/mrz_engine_common_pure.json
```

### 4.2 smartid_bundle (200+ стран документов)

```
bundle_international_faces_liveness/
├── bundle_international_faces_liveness.json
├── smartid.json
│
├── smartid_root_files/               # Конфиги по странам
│   ├── rus.json                      # Россия
│   ├── usa.json                      # США
│   ├── deu.json                      # Германия
│   └── ... (200+ файлов)
│
├── documents/                        # Списки документов
│   ├── rus_documents.json
│   │   └── [":/docs/rus.passport.main.json",
│   │        ":/docs/rus.passport.national.json",
│   │        ":/docs/rus.drvlic.type1.json", ...]
│   └── ...
│
├── docs/                             # Шаблоны документов
│   ├── rus.passport.main/
│   │   ├── rus.passport.main.json    # Определение полей
│   │   └── templates/
│   │       └── rus.passport.main.page23.common.json
│   ├── rus.drvlic.type1/
│   └── ... (699+ типов документов)
│
├── recstr/
│   ├── netdata/final/                # 149 нейросетей
│   └── special_nn/
│       └── screen_bounds_detector/   # Детектор границ экрана
│
├── liveness_config/                  # Anti-spoofing
│   └── osl_config.json
│
├── forensics/                        # Проверка подлинности
│
└── vocs/                             # Словари
    └── n-grams/
```

### 4.3 Иерархия конфигурации

```
Level 1: Bundle Manifest
         bundle_international_faces_liveness.json
                        │
                        ▼
Level 2: Engine Config
         smartid_root_files/rus.json
         ├── documents: documents/rus_documents.json
         ├── tplfinder: :/tplfinder/forms1500_tplfinder_mobile.json
         └── highlight_detector: :/highlight_detector/hld_common.json
                        │
                        ▼
Level 3: Document List
         documents/rus_documents.json
         └── [":/docs/rus.passport.main.json", ...]
                        │
                        ▼
Level 4: Document Definition
         docs/rus.passport.main/rus.passport.main.json
         ├── output_fields: ["surname", "name", "birth_date", ...]
         ├── postprocessors: [...]
         └── templates: {"rus.passport.main:page23": ...}
                        │
                        ▼
Level 5: Template
         docs/rus.passport.main/templates/rus.passport.main.page23.common.json
         ├── size_mm: [125.0, 88.0]
         ├── features: {descriptor_size: 128, ...}
         └── linked_templates: {...}
                        │
                        ▼
Level 6: Neural Networks
         recstr/netdata/final/synthetic/rus/rus_fcr.tar.zst
         recstr/special_nn/face_detector_yolo.tar.zst
```

---

## 5. Формат нейросетей

### 5.1 Структура модели (.tar.zst)

```
model_name.tar.zst
    │
    ▼ ZSTD decompress
    │
model_name.tar
├── nn_info.json              # Метаданные модели
└── weights/
    ├── conv1.pb              # Свёрточные слои (Protobuf)
    ├── conv2.pb
    ├── fc1.pb                # Полносвязные слои
    └── ...
```

### 5.2 nn_info.json

```json
{
  "epoch": 244,
  "weight_updates": 292800,
  "shape_map": {
    "main_data": [128, 32, 1],
    "type": [128, 1, 1]
  },
  "alphabet": [[115, 112, 104]],
  "layers": [
    {
      "type": "conv",
      "name": "conv1",
      "dt_src": "Real32",
      "dt_dst": "LinQuantU8",
      "fparams": {
        "kernel": [3, 3],
        "stride": [1, 1],
        "padding": [1, 1]
      }
    },
    {
      "type": "pool",
      "name": "pool1",
      "fparams": {"size": [2, 2], "type": "max"}
    },
    {
      "type": "rnn",
      "name": "lstm1",
      "fparams": {"hidden_size": 256}
    },
    {
      "type": "ctc",
      "name": "ctc_decoder"
    }
  ]
}
```

### 5.3 Типы слоёв

| Тип | Описание | Параметры |
|-----|----------|-----------|
| `conv` | Свёртка 2D | kernel, stride, padding |
| `pool` | Max/Avg pooling | size, type |
| `crop` | Обрезка тензора | offset, size |
| `concat` | Конкатенация | axis |
| `convert` | FP32 ↔ INT8 | dt_src, dt_dst |
| `rnn` | LSTM/GRU | hidden_size, bidirectional |
| `ctc` | CTC decoder | blank_label |

---

## 6. Потоки данных

### 6.1 Загрузка бандла

```
1. Java: EngineLoader.load(context, "jnidocengine", bundle)
         │
         ▼
2. Java: System.loadLibrary("jnimultiengine")
         │
         ▼
3. Java: AssetManager.open("bundle_*.se") → byte[]
         │
         ▼
4. JNI:  DocEngine.Create(byte[] bundle, boolean debug)
         │
         ▼
5. Native: XOR decrypt (key @ 0x3737888)
         │
         ▼
6. Native: ZSTD decompress → TAR
         │
         ▼
7. Native: TAR extract to memory
         │
         ▼
8. Native: Parse bundle_*.json manifest
         │
         ▼
9. Native: Load neural networks (.tar.zst → memory)
         │
         ▼
10. Native: Initialize engine instance
         │
         ▼
11. Java: callback(engine) invoked
```

### 6.2 Распознавание изображения

```
1. DocSession.ProcessImage(image)
         │
         ▼
2. Preprocessing
   ├── Deskew (выравнивание)
   ├── Color correction
   └── Resize to working size
         │
         ▼
3. Document Detection
   ├── Template matching (tplfinder)
   ├── Edge detection
   └── Corner detection
         │
         ▼
4. Field Localization
   ├── Zone detection (YOLO)
   └── Text line detection
         │
         ▼
5. OCR Recognition
   ├── Character segmentation
   ├── CNN feature extraction
   ├── LSTM sequence modeling
   └── CTC decoding
         │
         ▼
6. Postprocessing
   ├── Field validation
   ├── Checksum verification
   └── Dictionary lookup
         │
         ▼
7. DocFeedback.ResultReceived(DocResult)
```

---

## 7. API использования

### 7.1 Создание движка

```kotlin
// Kotlin
val engineLoader = EngineLoader(DocEngineWrapper())
engineLoader.load(
    context = applicationContext,
    jniLibrary = "jnimultiengine",
    bundle = EngineBundle.File("bundle_newdocengine_demo_hiring_dsn.se")
) { engine ->
    // Engine готов к использованию
    startRecognition(engine as DocEngineWrapper)
}

// Отслеживание состояния
engineLoader.loadingState.collect { state ->
    when (state) {
        is EngineLoadingState.Loading -> showProgress()
        is EngineLoadingState.Loaded -> hideProgress()
        is EngineLoadingState.Error -> showError(state.throwable)
    }
}
```

### 7.2 Настройка сессии

```kotlin
fun startRecognition(engine: DocEngineWrapper) {
    val docEngine = engine.docEngine

    // Создание настроек
    val settings = docEngine.CreateSessionSettings()

    // Включение типов документов
    settings.AddEnabledDocumentTypes("rus.passport.*")
    settings.AddEnabledDocumentTypes("rus.drvlic.*")

    // Опции
    settings.SetOption("enable_forensics", "true")
    settings.SetOption("timeout_ms", "5000")

    // Создание сессии
    val session = docEngine.SpawnSession(settings, "main_session", myFeedback)
}
```

### 7.3 Обработка изображений

```kotlin
class MyFeedback : DocFeedback() {
    override fun ResultReceived(result: DocResult) {
        // Получение распознанных полей
        val doc = result.GetDocument(0)

        // Итерация по полям
        val fieldsIter = doc.TextFieldsBegin()
        while (!fieldsIter.Equals(doc.TextFieldsEnd())) {
            val field = fieldsIter.GetValue()
            val name = field.GetName()
            val value = field.GetValue().GetFirstString()
            val confidence = field.GetConfidence()

            Log.d("OCR", "$name = $value (${confidence * 100}%)")

            fieldsIter.Advance()
        }
    }

    override fun FeedbackReceived(container: DocFeedbackContainer) {
        // Промежуточные результаты
    }
}

// Обработка кадра
fun processFrame(bitmap: Bitmap) {
    val image = Image.CreateFromBitmap(bitmap)
    val procSettings = session.CreateProcessingSettings()
    session.ProcessImage(image, procSettings)
}
```

---

## 8. Расположение файлов

### 8.1 Исходный код (декомпилированный)

```
C:\temp\MobileSDK\SmartEngines\java_src\com\smartengines\
├── engine\                      # EngineLoader, Engine, wrappers
│   ├── EngineLoader.java
│   ├── Engine.java
│   ├── EngineBundle.java
│   ├── doc\DocEngineWrapper.java
│   └── id\IdEngineWrapper.java
├── doc\                         # DocEngine API
│   ├── DocEngine.java
│   ├── DocSession.java
│   ├── DocSessionSettings.java
│   ├── DocResult.java
│   └── jnidocengineJNI.java
├── id\                          # IdEngine API
├── text\                        # TextEngine API
├── code\                        # CodeEngine API
└── common\                      # Общие типы
    ├── Image.java
    └── jnisecommonJNI.java
```

### 8.2 Smali байткод

```
C:\temp\MobileSDK\SmartEngines_apktool\smali_classes3\com\smartengines\
├── doc\                         # Document engine
├── p006id\                      # ID engine (obfuscated package)
├── text\                        # Text engine
├── code\                        # Code engine
└── common\                      # Common types
```

### 8.3 Native библиотека

```
C:\temp\MobileSDK\SmartEngines_apktool\lib\
├── arm64-v8a\libjnimultiengine.so    # 42 MB, ARM64
├── armeabi-v7a\libjnimultiengine.so  # ARM32
└── x86_64\libjnimultiengine.so       # x86_64 (эмулятор)
```

### 8.4 Расшифрованные бандлы

```
C:\temp\MobileSDK\extracted_bundles\
├── bundle_codeengine_full\           # 18 MB, 1,200+ файлов
├── bundle_international_faces_liveness\  # 545 MB, 45,000+ файлов
├── bundle_newdocengine_demo_hiring_dsn\  # 286 MB, 25,000+ файлов
└── bundle_textengine\                # 70 MB, 5,000+ файлов
```

### 8.5 Ключи и утилиты

```
C:\temp\MobileSDK\analysis\
├── key_table_offset_3737888.bin      # 128-byte XOR ключ
├── _batch_decrypt_sebundle_real.py   # Скрипт расшифровки
├── BUNDLE_FORMAT_FINAL.md            # Документация формата
└── SDK_STRUCTURE.md                  # Документация SDK
```

---

## 9. Практическое использование

### 9.1 Расшифровка нового бандла

```python
# 1. Загрузить ключ
with open('analysis/key_table_offset_3737888.bin', 'rb') as f:
    key = f.read()

# 2. Расшифровать бандл
with open('assets/bundle_new.se', 'rb') as f:
    encrypted = f.read()

mini, body = decrypt_sebundle(encrypted, key)
tar_data = decompress_bundle(body)
extract_bundle(tar_data, 'extracted/bundle_new/')
```

### 9.2 Использование нейросети

```python
import tarfile
import zstandard as zstd
import json

# 1. Распаковать модель
with open('netdata/final/synthetic/eng/eng_101_mrz_fcr.tar.zst', 'rb') as f:
    dctx = zstd.ZstdDecompressor()
    tar_data = dctx.decompress(f.read())

with tarfile.open(fileobj=io.BytesIO(tar_data)) as tar:
    tar.extractall('model_extracted/')

# 2. Прочитать метаданные
with open('model_extracted/nn_info.json') as f:
    nn_info = json.load(f)

print(f"Layers: {len(nn_info['layers'])}")
print(f"Input shape: {nn_info['shape_map']['main_data']}")

# 3. Загрузить веса (формат: custom protobuf)
# Каждый .pb файл содержит тензор весов для слоя
```

### 9.3 Добавление нового типа документа

```json
// docs/custom.document/custom.document.json
{
  "type": "custom.document",
  "name": {"en": "Custom Document", "ru": "Пользовательский документ"},
  "output_fields": ["field1", "field2", "field3"],
  "templates": {
    "custom.document:main": {
      "path": "templates/custom.document.main.json"
    }
  },
  "postprocessors": [
    {
      "input_fields": ["field1"],
      "postprocessor": ":/postprocessor/date/default_date.json"
    }
  ]
}
```

---

## 10. Статистика

| Компонент | Количество |
|-----------|------------|
| JNI native methods | 2,185 |
| Поддерживаемые страны | 200+ |
| Типы документов | 699+ |
| Нейросетевые модели | 280+ |
| Файлов в бандлах | 77,000+ |
| Размер SO библиотеки | 42 MB |
| Размер бандлов (сжатые) | 210 MB |
| Размер бандлов (распакованные) | 920 MB |

---

*Документ создан: 2026-01-31*
*На основе анализа SmartEngines SDK v2.7.2 / v3.2.0*
