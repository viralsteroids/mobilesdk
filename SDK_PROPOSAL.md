# Proposal: Minimal Document Scanner SDK

## Целевой функционал

| Модуль | Функция | Источник моделей |
|--------|---------|------------------|
| **RU Passport** | Распознавание паспорта РФ | smartid_bundle |
| **Registration** | Распознавание прописки (стр. 5-12) | smartid_bundle |
| **Barcodes** | QR, PDF417, DataMatrix, EAN | codeengine_bundle |
| **Bank Cards** | Номер, срок, имя | codeengine_bundle |
| **OCR Phone** | Извлечение телефонных номеров | textengine_bundle |

**Платформы**: Android (arm64-v8a, armeabi-v7a), iOS (arm64)

---

## 1. Архитектура SDK

```
┌─────────────────────────────────────────────────────────────────────────┐
│                        HOST APPLICATION                                  │
├─────────────────────────────────────────────────────────────────────────┤
│                                                                          │
│  ┌─────────────────────────────────────────────────────────────────┐    │
│  │                    DocumentScannerSDK                            │    │
│  │  ┌─────────────┐ ┌─────────────┐ ┌─────────────┐                │    │
│  │  │ Passport    │ │ Barcode     │ │ BankCard    │                │    │
│  │  │ Scanner     │ │ Scanner     │ │ Scanner     │                │    │
│  │  └──────┬──────┘ └──────┬──────┘ └──────┬──────┘                │    │
│  │         │               │               │                        │    │
│  │  ┌──────┴───────────────┴───────────────┴──────┐                │    │
│  │  │              Unified Engine                  │                │    │
│  │  │  ┌─────────────────────────────────────┐    │                │    │
│  │  │  │         Native Core (C++)            │    │                │    │
│  │  │  │  • Image preprocessing               │    │                │    │
│  │  │  │  • Neural network inference          │    │                │    │
│  │  │  │  • Post-processing & validation      │    │                │    │
│  │  │  └─────────────────────────────────────┘    │                │    │
│  │  └──────────────────────────────────────────────┘                │    │
│  └─────────────────────────────────────────────────────────────────┘    │
│                                                                          │
│  ┌─────────────────────────────────────────────────────────────────┐    │
│  │                     Model Bundle (~15 MB)                        │    │
│  │  passport.bundle | barcode.bundle | card.bundle | ocr.bundle    │    │
│  └─────────────────────────────────────────────────────────────────┘    │
│                                                                          │
└─────────────────────────────────────────────────────────────────────────┘
```

---

## 2. Структура файлов SDK

```
DocumentScannerSDK/
├── android/
│   ├── sdk/
│   │   ├── build.gradle
│   │   └── src/main/
│   │       ├── java/com/scanner/sdk/
│   │       │   ├── DocumentScanner.kt           # Main entry point
│   │       │   ├── PassportScanner.kt           # Passport API
│   │       │   ├── BarcodeScanner.kt            # Barcode API
│   │       │   ├── CardScanner.kt               # Bank card API
│   │       │   ├── OcrScanner.kt                # OCR API
│   │       │   ├── models/                      # Data classes
│   │       │   │   ├── PassportResult.kt
│   │       │   │   ├── BarcodeResult.kt
│   │       │   │   ├── CardResult.kt
│   │       │   │   └── OcrResult.kt
│   │       │   └── internal/                    # Internal implementation
│   │       │       ├── NativeEngine.kt
│   │       │       └── ImageUtils.kt
│   │       ├── jniLibs/
│   │       │   ├── arm64-v8a/libscanner.so      # ~8 MB
│   │       │   └── armeabi-v7a/libscanner.so    # ~6 MB
│   │       └── assets/
│   │           └── models/                       # ~15 MB total
│   │               ├── passport.bin
│   │               ├── barcode.bin
│   │               ├── card.bin
│   │               └── ocr.bin
│   └── sample/                                   # Demo app
│
├── ios/
│   ├── DocumentScannerSDK/
│   │   ├── DocumentScannerSDK.xcframework/
│   │   │   └── ios-arm64/
│   │   │       └── DocumentScannerSDK.framework/
│   │   │           ├── Headers/
│   │   │           │   └── DocumentScanner.h
│   │   │           ├── Modules/
│   │   │           └── DocumentScannerSDK        # Binary ~10 MB
│   │   ├── Resources/
│   │   │   └── models/                           # ~15 MB
│   │   └── Sources/
│   │       ├── DocumentScanner.swift
│   │       ├── PassportScanner.swift
│   │       ├── BarcodeScanner.swift
│   │       ├── CardScanner.swift
│   │       └── OcrScanner.swift
│   ├── DocumentScannerSDK.podspec
│   └── Package.swift                             # SPM support
│
├── core/                                         # Shared C++ code
│   ├── CMakeLists.txt
│   ├── include/
│   │   ├── scanner.h
│   │   ├── passport_engine.h
│   │   ├── barcode_engine.h
│   │   ├── card_engine.h
│   │   └── ocr_engine.h
│   ├── src/
│   │   ├── scanner.cpp
│   │   ├── passport_engine.cpp
│   │   ├── barcode_engine.cpp
│   │   ├── card_engine.cpp
│   │   ├── ocr_engine.cpp
│   │   ├── image_processor.cpp
│   │   ├── nn_runtime.cpp                        # Neural network inference
│   │   └── postprocessor.cpp
│   └── third_party/
│       ├── onnxruntime/                          # or TFLite
│       └── opencv/                               # Image processing
│
├── models/                                       # Source models
│   ├── passport/
│   │   ├── detector.onnx                         # Document detector
│   │   ├── segmenter.onnx                        # Field segmentation
│   │   ├── ocr_cyrillic.onnx                     # Cyrillic OCR
│   │   └── mrz_reader.onnx                       # MRZ recognition
│   ├── barcode/
│   │   ├── detector.onnx
│   │   └── decoder.onnx
│   ├── card/
│   │   ├── detector.onnx
│   │   ├── number_ocr.onnx
│   │   └── expiry_ocr.onnx
│   └── ocr/
│       ├── text_detector.onnx
│       └── phone_extractor.onnx
│
├── tools/
│   ├── model_converter.py                        # Convert from SmartEngines format
│   ├── model_packager.py                         # Create .bin bundles
│   └── test_runner.py
│
└── docs/
    ├── INTEGRATION.md
    ├── API_REFERENCE.md
    └── MODEL_FORMAT.md
```

---

## 3. API Design

### 3.1 Android (Kotlin)

```kotlin
// === Инициализация ===
val scanner = DocumentScanner.Builder(context)
    .setModelsPath("models/")           // или assets по умолчанию
    .enablePassport(true)
    .enableBarcode(true)
    .enableBankCard(true)
    .enableOcr(true)
    .build()

// === Сканирование паспорта ===
val passportScanner = scanner.passport()

// Из Bitmap
val result: PassportResult = passportScanner.scan(bitmap)

// Из CameraX ImageProxy
passportScanner.scan(imageProxy) { result ->
    result.onSuccess { passport ->
        println("ФИО: ${passport.fullName}")
        println("Серия/номер: ${passport.series} ${passport.number}")
        println("Дата рождения: ${passport.birthDate}")
        println("Прописка: ${passport.registration?.address}")
    }
    result.onFailure { error ->
        println("Ошибка: ${error.message}")
    }
}

// === Сканирование штрих-кода ===
val barcodeScanner = scanner.barcode()
barcodeScanner.scan(bitmap) { result ->
    result.onSuccess { barcodes ->
        for (barcode in barcodes) {
            println("${barcode.type}: ${barcode.value}")
        }
    }
}

// === Сканирование банковской карты ===
val cardScanner = scanner.card()
cardScanner.scan(bitmap) { result ->
    result.onSuccess { card ->
        println("Номер: ${card.number}")          // 4276 **** **** 1234
        println("Срок: ${card.expiry}")           // 12/25
        println("Имя: ${card.holderName}")        // IVAN PETROV
        println("Тип: ${card.cardType}")          // VISA, MASTERCARD, MIR
    }
}

// === OCR для извлечения телефона ===
val ocrScanner = scanner.ocr()
ocrScanner.extractPhones(bitmap) { result ->
    result.onSuccess { phones ->
        // ["+7 (999) 123-45-67", "8-800-555-35-35"]
        phones.forEach { println(it) }
    }
}

// === Освобождение ресурсов ===
scanner.release()
```

### 3.2 iOS (Swift)

```swift
// === Инициализация ===
let scanner = try DocumentScanner(
    configuration: .init(
        modelsPath: Bundle.main.resourcePath,
        enablePassport: true,
        enableBarcode: true,
        enableBankCard: true,
        enableOcr: true
    )
)

// === Сканирование паспорта ===
let passportScanner = scanner.passport

// Синхронно
let result = try passportScanner.scan(image: uiImage)

// Асинхронно (Swift Concurrency)
Task {
    let passport = try await passportScanner.scan(image: uiImage)
    print("ФИО: \(passport.fullName)")
    print("Прописка: \(passport.registration?.address ?? "N/A")")
}

// Из CMSampleBuffer (камера)
passportScanner.scan(sampleBuffer: buffer) { result in
    switch result {
    case .success(let passport):
        print("Серия: \(passport.series)")
    case .failure(let error):
        print("Error: \(error)")
    }
}

// === Штрих-коды ===
let barcodes = try scanner.barcode.scan(image: uiImage)
for barcode in barcodes {
    print("\(barcode.type): \(barcode.value)")
}

// === Банковская карта ===
let card = try scanner.card.scan(image: uiImage)
print("Номер: \(card.maskedNumber)")  // 4276 **** **** 1234

// === OCR телефонов ===
let phones = try scanner.ocr.extractPhones(from: uiImage)
// ["+7 (999) 123-45-67"]

// === Освобождение ===
scanner.release()
```

---

## 4. Data Models

### 4.1 PassportResult

```kotlin
data class PassportResult(
    // Основные данные (страница 2-3)
    val surname: String,              // Фамилия
    val name: String,                 // Имя
    val patronymic: String?,          // Отчество
    val fullName: String,             // Полное ФИО
    val birthDate: LocalDate,         // Дата рождения
    val birthPlace: String,           // Место рождения
    val gender: Gender,               // Пол
    val series: String,               // Серия (4 цифры)
    val number: String,               // Номер (6 цифр)
    val issueDate: LocalDate,         // Дата выдачи
    val issuedBy: String,             // Кем выдан
    val departmentCode: String,       // Код подразделения

    // MRZ (машиночитаемая зона)
    val mrz: MrzData?,

    // Прописка (страницы 5-12)
    val registration: RegistrationData?,

    // Метаданные
    val confidence: Float,            // Уверенность 0-1
    val pageType: PassportPage,       // Какая страница
    val documentImage: Bitmap?,       // Выровненное изображение
    val facePhoto: Bitmap?            // Фото из паспорта
)

data class RegistrationData(
    val address: String,              // Полный адрес
    val region: String?,              // Регион/область
    val city: String?,                // Город
    val street: String?,              // Улица
    val house: String?,               // Дом
    val apartment: String?,           // Квартира
    val registrationDate: LocalDate?, // Дата регистрации
    val confidence: Float
)

data class MrzData(
    val line1: String,
    val line2: String,
    val documentNumber: String,
    val nationality: String,
    val birthDate: LocalDate,
    val expiryDate: LocalDate?,
    val checksumValid: Boolean
)

enum class PassportPage {
    MAIN,           // Страницы 2-3 (основные данные)
    REGISTRATION,   // Страницы 5-12 (прописка)
    CHILDREN,       // Страница 16-17 (дети)
    UNKNOWN
}
```

### 4.2 BarcodeResult

```kotlin
data class BarcodeResult(
    val type: BarcodeType,
    val value: String,
    val rawBytes: ByteArray?,
    val bounds: RectF,                // Позиция на изображении
    val confidence: Float,

    // Интерпретированные данные
    val parsed: ParsedBarcode?
)

enum class BarcodeType {
    QR_CODE,
    PDF417,
    DATA_MATRIX,
    EAN_13,
    EAN_8,
    CODE_128,
    CODE_39,
    AZTEC,
    UPC_A,
    UPC_E
}

sealed class ParsedBarcode {
    data class Url(val url: String) : ParsedBarcode()
    data class Phone(val number: String) : ParsedBarcode()
    data class Email(val address: String) : ParsedBarcode()
    data class WiFi(val ssid: String, val password: String?, val type: String) : ParsedBarcode()
    data class VCard(val name: String, val phone: String?, val email: String?) : ParsedBarcode()
    data class Text(val text: String) : ParsedBarcode()
}
```

### 4.3 CardResult

```kotlin
data class CardResult(
    val number: String,               // Полный номер (16 цифр)
    val maskedNumber: String,         // 4276 **** **** 1234
    val expiry: String?,              // MM/YY
    val expiryMonth: Int?,
    val expiryYear: Int?,
    val holderName: String?,          // IVAN PETROV
    val cardType: CardType,           // VISA, MASTERCARD, MIR, etc.
    val issuer: String?,              // Sberbank, Tinkoff, etc.
    val bounds: RectF,
    val confidence: Float,
    val cardImage: Bitmap?            // Выровненное изображение карты
)

enum class CardType {
    VISA,
    MASTERCARD,
    MIR,
    MAESTRO,
    AMERICAN_EXPRESS,
    UNIONPAY,
    JCB,
    UNKNOWN
}
```

### 4.4 OcrResult

```kotlin
data class OcrResult(
    val fullText: String,             // Весь распознанный текст
    val lines: List<TextLine>,        // Построчно
    val phones: List<PhoneNumber>,    // Найденные телефоны
    val emails: List<String>,         // Найденные email
    val confidence: Float
)

data class TextLine(
    val text: String,
    val bounds: RectF,
    val confidence: Float
)

data class PhoneNumber(
    val raw: String,                  // Как в тексте
    val normalized: String,           // +7XXXXXXXXXX
    val formatted: String,            // +7 (XXX) XXX-XX-XX
    val bounds: RectF
)
```

---

## 5. Выделение моделей из SmartEngines

### 5.1 Необходимые модели

```
ИЗ bundle_international_faces_liveness.se:
├── docs/rus.passport.main/          # Шаблон паспорта
├── docs/rus.passport.registration/  # Шаблон прописки
├── recstr/netdata/final/synthetic/
│   ├── rus/rus_fcr.tar.zst          # Кириллица FCR
│   ├── eng/eng_101_mrz_fcr.tar.zst  # MRZ
│   └── blines/blines.tar.zst        # Детектор линий
├── recstr/special_nn/
│   └── face_detector_yolo.tar.zst   # Детектор лиц
└── postprocessor/
    └── date/                         # Постобработка дат

ИЗ bundle_codeengine_full.se:
├── docs/barcode/                     # Конфиг штрих-кодов
├── docs/card/                        # Конфиг карт
├── recstr/special_nn/
│   ├── card_emb_bdig_fcr.tar.zst    # Эмбоссированные цифры
│   ├── card_indent_symdig_fcr.tar.zst
│   └── card_type.tar.zst            # Классификатор карт
└── recstr/netdata/final/synthetic/
    └── text_detector/txtdet_common.tar.zst

ИЗ bundle_textengine.se:
├── recstr/netdata/final/
│   └── synthetic/rus/               # Русский OCR
└── vocs/n-grams/rus_cormen_3.ngr    # N-граммы
```

### 5.2 Скрипт экстракции

```python
#!/usr/bin/env python3
"""Extract minimal models for SDK"""

import os
import shutil
import json
from pathlib import Path

SOURCE_BUNDLES = {
    'passport': 'extracted_bundles/bundle_international_faces_liveness/',
    'barcode': 'extracted_bundles/bundle_codeengine_full/',
    'card': 'extracted_bundles/bundle_codeengine_full/',
    'ocr': 'extracted_bundles/bundle_textengine/'
}

MODELS_TO_EXTRACT = {
    'passport': [
        'recstr/netdata/final/synthetic/rus/',
        'recstr/netdata/final/synthetic/eng/eng_101_mrz_fcr.tar.zst',
        'recstr/special_nn/face_detector_yolo.tar.zst',
        'docs/rus.passport.main/',
        'postprocessor/date/',
    ],
    'registration': [
        'docs/rus.passport.registration/',
        # Uses same OCR models as passport
    ],
    'barcode': [
        'docs/barcode/',
        'recstr/netdata/final/synthetic/blines/',
    ],
    'card': [
        'docs/card/',
        'recstr/special_nn/card_emb_bdig_fcr.tar.zst',
        'recstr/special_nn/card_indent_symdig_fcr.tar.zst',
        'recstr/special_nn/card_type.tar.zst',
    ],
    'ocr': [
        'recstr/netdata/final/synthetic/rus/',
        'recstr/netdata/final/synthetic/text_detector/',
        'vocs/n-grams/rus_cormen_3.ngr',
    ]
}

def extract_models(output_dir: Path):
    """Extract required models"""
    output_dir.mkdir(parents=True, exist_ok=True)

    for module, paths in MODELS_TO_EXTRACT.items():
        module_dir = output_dir / module
        module_dir.mkdir(exist_ok=True)

        source_base = Path(SOURCE_BUNDLES.get(module, SOURCE_BUNDLES['passport']))

        for rel_path in paths:
            src = source_base / rel_path
            if src.exists():
                dst = module_dir / Path(rel_path).name
                if src.is_dir():
                    shutil.copytree(src, dst, dirs_exist_ok=True)
                else:
                    shutil.copy2(src, dst)
                print(f"  Copied: {rel_path}")

    # Calculate total size
    total_size = sum(f.stat().st_size for f in output_dir.rglob('*') if f.is_file())
    print(f"\nTotal size: {total_size / 1024 / 1024:.1f} MB")

if __name__ == '__main__':
    extract_models(Path('sdk_models'))
```

### 5.3 Конвертация в ONNX

```python
#!/usr/bin/env python3
"""Convert SmartEngines models to ONNX format"""

import json
import struct
import numpy as np
from pathlib import Path

def load_smartengines_model(model_dir: Path) -> dict:
    """Load nn_info.json and weights"""
    with open(model_dir / 'nn_info.json') as f:
        info = json.load(f)

    weights = {}
    weights_dir = model_dir / 'weights'
    for pb_file in weights_dir.glob('*.pb'):
        # SmartEngines uses custom protobuf-like format
        # Each .pb contains: [4 bytes len][data]
        data = pb_file.read_bytes()
        # Parse tensor shape and values
        weights[pb_file.stem] = parse_weight_tensor(data)

    return {'info': info, 'weights': weights}

def convert_to_onnx(model: dict, output_path: Path):
    """Convert to ONNX format"""
    import onnx
    from onnx import helper, TensorProto

    info = model['info']
    weights = model['weights']

    # Build ONNX graph based on layer info
    nodes = []
    initializers = []

    for layer in info['layers']:
        layer_type = layer['type']
        layer_name = layer['name']

        if layer_type == 'conv':
            # Add Conv node
            node = helper.make_node(
                'Conv',
                inputs=[f'{layer_name}_input', f'{layer_name}_weight', f'{layer_name}_bias'],
                outputs=[f'{layer_name}_output'],
                kernel_shape=layer['fparams']['kernel'],
                strides=layer['fparams'].get('stride', [1, 1]),
                pads=layer['fparams'].get('padding', [0, 0, 0, 0])
            )
            nodes.append(node)

            # Add weight initializer
            if layer_name in weights:
                w = weights[layer_name]
                initializers.append(
                    helper.make_tensor(
                        f'{layer_name}_weight',
                        TensorProto.FLOAT,
                        w.shape,
                        w.flatten().tolist()
                    )
                )

        elif layer_type == 'pool':
            # Add MaxPool/AveragePool
            pool_type = 'MaxPool' if layer['fparams'].get('type') == 'max' else 'AveragePool'
            node = helper.make_node(
                pool_type,
                inputs=[f'{layer_name}_input'],
                outputs=[f'{layer_name}_output'],
                kernel_shape=layer['fparams']['size']
            )
            nodes.append(node)

        # ... handle other layer types

    # Create graph
    graph = helper.make_graph(
        nodes,
        'smartengines_model',
        inputs=[...],
        outputs=[...],
        initializer=initializers
    )

    # Create model
    onnx_model = helper.make_model(graph)
    onnx.save(onnx_model, str(output_path))

# Альтернатива: использовать TFLite
def convert_to_tflite(model: dict, output_path: Path):
    """Convert to TensorFlow Lite format"""
    import tensorflow as tf

    # Build TF model from layer info
    # ...
    converter = tf.lite.TFLiteConverter.from_keras_model(tf_model)
    converter.optimizations = [tf.lite.Optimize.DEFAULT]
    tflite_model = converter.convert()

    output_path.write_bytes(tflite_model)
```

---

## 6. Оценка размеров

### 6.1 Модели (минимальный набор)

| Модуль | Модели | Размер (сжатый) |
|--------|--------|-----------------|
| Passport | detector, segmenter, ocr_cyr, mrz | ~4 MB |
| Registration | (использует passport модели) | ~0.5 MB |
| Barcode | detector, decoder | ~1.5 MB |
| Card | detector, number_ocr, type_classifier | ~2 MB |
| OCR | text_detector, phone_extractor | ~3 MB |
| **Shared** | face_detector, blines | ~3 MB |
| **TOTAL** | | **~15 MB** |

### 6.2 Native библиотека

| Платформа | Размер |
|-----------|--------|
| Android arm64-v8a | ~8 MB |
| Android armeabi-v7a | ~6 MB |
| iOS arm64 | ~10 MB |

### 6.3 Итоговый размер SDK

| Конфигурация | Размер |
|--------------|--------|
| Android (arm64 only) | ~23 MB |
| Android (arm64 + arm32) | ~29 MB |
| iOS | ~25 MB |

---

## 7. Альтернативные подходы

### 7.1 Вариант A: Переиспользование libjnimultiengine.so

**Плюсы:**
- Не нужно конвертировать модели
- Гарантированная совместимость
- Быстрая реализация

**Минусы:**
- Большой размер (42 MB)
- Включает все ненужные модули
- Зависимость от SmartEngines формата

```
SDK размер: ~60 MB (SO + все бандлы)
```

### 7.2 Вариант B: Минимальная native библиотека + ONNX Runtime

**Плюсы:**
- Компактный размер
- Стандартный формат моделей
- Легко обновлять модели

**Минусы:**
- Требует конвертации моделей
- Потенциальная потеря точности

```
SDK размер: ~25 MB
```

### 7.3 Вариант C: Использование ML Kit + кастомные модели

**Плюсы:**
- Google/Apple оптимизации
- Минимальный размер SDK
- Аппаратное ускорение

**Минусы:**
- Ограниченная кастомизация
- Зависимость от платформы

```
SDK размер: ~15 MB (только модели)
```

---

## 8. Рекомендуемый план реализации

### Этап 1: Прототип (1-2 недели)
1. Извлечь необходимые модели из бандлов
2. Создать обёртку над libjnimultiengine.so
3. Реализовать базовый API для Android

### Этап 2: Оптимизация (2-3 недели)
1. Конвертировать модели в ONNX/TFLite
2. Написать минимальный inference runtime
3. Удалить неиспользуемый код

### Этап 3: iOS порт (1-2 недели)
1. Скомпилировать core под iOS
2. Создать Swift API
3. Интегрировать с Camera API

### Этап 4: Финализация (1 неделя)
1. Оптимизация производительности
2. Документация
3. Примеры интеграции

---

## 9. Quick Start для разработчика

### Android (Gradle)

```groovy
// build.gradle (app)
dependencies {
    implementation 'com.scanner:document-sdk:1.0.0'
}
```

```kotlin
// MainActivity.kt
class MainActivity : AppCompatActivity() {
    private lateinit var scanner: DocumentScanner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        scanner = DocumentScanner.Builder(this)
            .enableAll()
            .build()

        // Использование с CameraX
        cameraProvider.bindToLifecycle(this, cameraSelector,
            ImageAnalysis.Builder().build().also { analysis ->
                analysis.setAnalyzer(executor) { imageProxy ->
                    scanner.passport().scan(imageProxy) { result ->
                        result.onSuccess { passport ->
                            runOnUiThread {
                                showResult(passport)
                            }
                        }
                    }
                }
            }
        )
    }

    override fun onDestroy() {
        scanner.release()
        super.onDestroy()
    }
}
```

### iOS (Swift Package Manager)

```swift
// Package.swift
dependencies: [
    .package(url: "https://github.com/example/DocumentScannerSDK", from: "1.0.0")
]
```

```swift
// ViewController.swift
import DocumentScannerSDK
import AVFoundation

class ScannerViewController: UIViewController {
    let scanner = try! DocumentScanner()
    let captureSession = AVCaptureSession()

    override func viewDidLoad() {
        super.viewDidLoad()
        setupCamera()
    }

    func captureOutput(_ output: AVCaptureOutput,
                       didOutput sampleBuffer: CMSampleBuffer,
                       from connection: AVCaptureConnection) {
        scanner.passport.scan(sampleBuffer: sampleBuffer) { result in
            if case .success(let passport) = result {
                DispatchQueue.main.async {
                    self.showResult(passport)
                }
            }
        }
    }
}
```

---

*Proposal Version: 1.0*
*Date: 2026-01-31*
