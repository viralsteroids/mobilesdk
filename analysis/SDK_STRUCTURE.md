# SmartEngines SDK - Полная структура

## 1. Архитектура системы

```
┌─────────────────────────────────────────────────────────────────┐
│                        Android APK                               │
├─────────────────────────────────────────────────────────────────┤
│  Java/Kotlin Layer                                               │
│  ├── com.smartengines.app.*        (UI приложения)              │
│  ├── com.smartengines.common.*     (утилиты, EngineLoader)      │
│  └── biz.smartengines.smartid.*    (SWIG JNI обёртки)           │
├─────────────────────────────────────────────────────────────────┤
│  Native Layer (libjnimultiengine.so - 42 MB)                    │
│  ├── JNI entrypoints              (Java_biz_smartengines_*)     │
│  ├── Engine classes               (TextEngine, IdEngine, etc.)  │
│  ├── Bundle loader                (XOR decrypt + ZSTD + TAR)    │
│  ├── libarchive                   (archive handling)            │
│  ├── ZSTD                         (compression)                 │
│  └── Neural network runtime       (inference engine)            │
├─────────────────────────────────────────────────────────────────┤
│  Assets (зашифрованные .se бандлы)                              │
│  ├── bundle_codeengine_full.se           (5.8 MB)               │
│  ├── bundle_international_faces_liveness.se (119 MB)            │
│  ├── bundle_newdocengine_demo_hiring_dsn.se (57 MB)             │
│  └── bundle_textengine.se                (27 MB)                │
└─────────────────────────────────────────────────────────────────┘
```

## 2. Формат .se бандла

### 2.1 Структура файла

```
┌──────────────────────────────────────┐
│ HEADER (59 bytes)                    │
│ "sebundle1~{ver}~{hash}{len}~"       │
├──────────────────────────────────────┤
│ SHA1 CHECKSUM (20 bytes, XOR)        │
├──────────────────────────────────────┤
│ MINI SECTION ({len} bytes, XOR)      │
│ Содержит: "1~se_demo~"               │
├──────────────────────────────────────┤
│ BODY (остаток файла, XOR)            │
│ После XOR: ZSTD compressed TAR       │
└──────────────────────────────────────┘
```

### 2.2 Цепочка декодирования

```
.se file
    │
    ▼ XOR decrypt (128-byte key @ 0x3737888)
    │
ZSTD stream (magic: 28 B5 2F FD)
    │
    ▼ ZSTD decompress (no dictionary)
    │
TAR archive (PAX format)
    │
    ▼ Extract
    │
Bundle contents (JSON + models)
```

## 3. Типы бандлов

### 3.1 codeengine_bundle (5.8 MB → 18 MB)
**Назначение**: Распознавание штрих-кодов и банковских карт

```
bundle_codeengine_full/
├── bundle_codeengine_full.json   # Манифест
├── codeengine.json               # Конфиг движка
├── docs/
│   ├── barcode/                  # QR, PDF417, DataMatrix, ISBN
│   ├── card/                     # Банковские карты (номер, срок)
│   ├── card_number_lines/        # OCR номеров карт
│   ├── code_text_line/           # Распознавание текста
│   │   ├── container_seal/       # Контейнерные коды
│   │   ├── vin/                  # VIN номера
│   │   └── phone_number_card_number/
│   └── iban_lines/, inn_lines/, kpp_lines/  # Банковские реквизиты
├── ffe/                          # Feature extractors
├── integrator/                   # Интеграторы полей
├── mixangler/                    # Угловые детекторы
├── mrz-data/                     # MRZ справочники
├── netdata/                      # Нейросети (.tar.zst)
└── postprocessor/                # Постобработка
```

**Engines**: `barcode`, `card`, `card_number`, `iban`, `inn`, `kpp`, `vin`, `rus_bank_account`

### 3.2 smartid_bundle (119 MB → 545 MB)
**Назначение**: Распознавание документов и лиц (face liveness)

```
bundle_international_faces_liveness/
├── bundle_international_faces_liveness.json
├── smartid.json                  # Вторичный манифест
├── alphabet/                     # Алфавиты (60+ языков)
├── content_detector/             # Детектор содержимого
├── correct_color_detector/       # Цветокоррекция
├── deskewer/                     # Выравнивание документа
├── docengine/                    # Движок документов
├── docengine_docs/               # Шаблоны документов
│   └── docs/
│       ├── alb/, arg/, arm/...   # По странам (150+)
│       └── *_id_*, *_passport_*, *_dl_*  # Типы документов
├── docs/                         # Конфиги полей
├── face_config/                  # Конфиг распознавания лиц
├── ffe/                          # Feature extractors
├── forensics/                    # Проверка подлинности
├── fulltext/                     # Полнотекстовый OCR
├── liveness_config/              # Anti-spoofing
├── netdata/                      # Нейросети (149 моделей)
├── photo_retriever/              # Извлечение фото
├── recstr/                       # Recognition strategies
├── sdr_docs/                     # SDR templates
├── segmenter/                    # Сегментация
└── vocs/                         # Словари и n-граммы
```

**Engines**: 699 типов документов (паспорта, ID, водительские, визы...)

### 3.3 sdr_bundle (57 MB → 286 MB)
**Назначение**: Распознавание российских документов (Smart Document Reader)

```
bundle_newdocengine_demo_hiring_dsn/
├── bundle_newdocengine_demo_hiring_dsn.json
├── sdr.json                      # Вторичный манифест
├── content_detector/
├── designer/                     # Визуальный дизайнер шаблонов
├── docengine_newcore_docs/       # Новый движок документов
│   └── rigid_forms/              # Жёсткие формы (бланки)
├── docengine_docs/               # Классические шаблоны
├── forensics/                    # Проверка подлинности
├── fulltext/                     # Полнотекстовый OCR
├── netdata/                      # Нейросети (87 моделей)
├── sdr_docs/                     # SDR специфичные шаблоны
│   └── docs/
│       └── rus/                  # Российские документы
│           ├── rus.2ndfl         # 2-НДФЛ
│           ├── rus.passport.*    # Паспорт
│           ├── rus.snils         # СНИЛС
│           ├── rus.invoice.*     # Счета-фактуры
│           └── ...               # 100+ типов
└── vocs/                         # Словари
```

**Engines**: `newdocengine`, `legacydocengine`, `mrz`, `barcode`, `textline`, `pdfextractor`, `fulltext`

### 3.4 textengine_bundle (27 MB → 70 MB)
**Назначение**: Полнотекстовый OCR (сканирование страниц)

```
bundle_textengine/
├── bundle_textengine.json
├── deskewer/                     # Выравнивание страницы
├── docengine/                    # Движок документов
├── ffe/                          # Feature extractors
├── field_processing_workflow/    # Обработка полей
├── fulltext/                     # Полнотекстовый OCR
├── mixangler/                    # Угловые детекторы
├── netdata/                      # Нейросети (11 моделей)
├── postprocessor/                # Постобработка
├── recstr/                       # Recognition strategies
│   ├── lines_printed_eng.json    # Английский печатный
│   └── lines_printed_rus.json    # Русский печатный
├── sdr_docs/                     # SDR шаблоны
├── textengine_docs/              # Документация языков
└── vocs/                         # Словари и n-граммы
    └── n-grams/
        ├── eng_cormen_3.ngr      # Английские n-граммы
        └── rus_cormen_3.ngr      # Русские n-граммы
```

## 4. Структура нейросетей

### 4.1 Формат модели (.tar.zst)

```
model_name.tar.zst
    │
    ▼ ZSTD decompress
    │
model_name.tar
├── nn_info.json          # Метаданные модели
└── weights/
    ├── conv1.pb          # Свёрточные слои
    ├── conv2.pb
    ├── fc1.pb            # Полносвязные слои
    └── ...
```

### 4.2 nn_info.json структура

```json
{
  "epoch": 244,                    // Эпоха обучения
  "weight_updates": 292800,        // Количество обновлений
  "shape_map": {                   // Размеры входов/выходов
    "main_data": [128, 32, 1],
    "type": [128, 1, 1]
  },
  "alphabet": [[115, 112, 104]],   // Алфавит (коды символов)
  "layers": [                      // Слои сети
    {
      "type": "conv",
      "name": "conv1",
      "dt_src": "Real32",
      "dt_dst": "LinQuantU8",      // Квантизация INT8
      "fparams": {...}
    }
  ]
}
```

### 4.3 Типы слоёв

| Тип | Описание |
|-----|----------|
| `conv` | Свёртка 2D |
| `pool` | Max/Avg pooling |
| `crop` | Обрезка тензора |
| `concat` | Конкатенация |
| `convert` | Преобразование типов (FP32 ↔ INT8) |
| `rnn` | Рекуррентный слой (LSTM/GRU) |
| `ctc` | CTC decoder для OCR |

### 4.4 Статистика моделей

| Бандл | Моделей | Весов (.pb) | Размер |
|-------|---------|-------------|--------|
| codeengine_full | 33 | ~100 | 5 MB |
| international_faces_liveness | 149 | ~2500 | 400 MB |
| newdocengine_demo_hiring_dsn | 87 | ~1000 | 200 MB |
| textengine | 11 | ~200 | 50 MB |

## 5. Система шаблонов документов

### 5.1 Иерархия шаблонов

```
docs/
├── {country_code}/              # Код страны (rus, usa, deu...)
│   ├── {doc_type}.json          # Шаблон документа
│   └── {doc_type}/
│       ├── fields.json          # Поля документа
│       ├── zones.json           # Зоны распознавания
│       └── samples/             # Примеры (опционально)
```

### 5.2 Структура шаблона документа

```json
{
  "type": "rus.passport.main",
  "name": {"en": "Russian passport", "ru": "Паспорт РФ"},
  "fields": [
    {
      "name": "surname",
      "type": "text",
      "zone": "surname_zone",
      "postprocessor": "cyrillic_uppercase"
    },
    {
      "name": "birth_date",
      "type": "date",
      "format": "DD.MM.YYYY"
    }
  ],
  "mrz": {
    "type": "TD3",
    "lines": 2
  },
  "visual_zone": {
    "photo": {...},
    "signature": {...}
  }
}
```

## 6. XOR ключ шифрования

### 6.1 Расположение

```
libjnimultiengine.so
├── File offset: 0x3737888
├── Size: 128 bytes (0x80)
└── Section: .rodata
```

### 6.2 Алгоритм XOR

```python
def decrypt(payload, key):
    result = bytearray(len(payload))
    for i, byte in enumerate(payload):
        key_idx = i & 0x7F  # Циклический индекс 0-127
        result[i] = byte ^ key[key_idx]
    return bytes(result)
```

## 7. Криптографические компоненты

| Алгоритм | Назначение | Адрес в SO |
|----------|------------|------------|
| SHA-1 | Верификация заголовка | 0x027de380 |
| MD5 | Хеширование лицензии | 0x014099e0 |
| xxHash64 | Быстрые контрольные суммы | 0x00c9448c |
| XOR-128 | Шифрование бандла | Key @ 0x3737888 |

## 8. Процесс загрузки бандла

```
1. Java: UtilsKt.readAssetsFile("bundle_*.se")
       ↓
2. Java: AssetManager.open() → byte[]
       ↓
3. JNI: Java_biz_smartengines_*_create([B)
       ↓
4. Native: XOR decrypt (key @ 0x3737888)
       ↓
5. Native: archive_read_open_memory2()
       ↓
6. Native: ZSTD decompress (libarchive filter)
       ↓
7. Native: TAR extract to memory
       ↓
8. Native: Parse manifest JSON
       ↓
9. Native: Load neural networks (.tar.zst → .pb)
       ↓
10. Native: Initialize engine
```

## 9. Поддерживаемые форматы

### 9.1 Типы документов
- **Паспорта**: 150+ стран
- **ID карты**: 200+ типов
- **Водительские**: 100+ стран
- **Визы**: 50+ типов
- **Банковские карты**: Visa, MC, Amex, Mir
- **Штрих-коды**: QR, PDF417, DataMatrix, EAN, UPC, Aztec

### 9.2 Языки OCR
- **Латиница**: EN, DE, FR, ES, IT, PT, PL, CZ, ...
- **Кириллица**: RU, UA, BG, SR, MK, ...
- **Арабица**: AR, FA, UR, ...
- **CJK**: ZH, JA, KO (ограниченно)

---

*Документ создан: 2026-01-31*
*На основе анализа SmartEngines SDK v2.7.2 / v3.2.0*
