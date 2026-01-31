# Сборка минимального SDK на базе libjnimultiengine.so

## Целевые функции

| Функция | Исходный бандл | Размер моделей |
|---------|---------------|----------------|
| Паспорт РФ (стр. 2-3) | international_faces_liveness | ~2 MB |
| Прописка (стр. 5-12) | international_faces_liveness | ~1 MB |
| Штрих-коды | codeengine_full | ~1 MB |
| Банковские карты | codeengine_full | ~1 MB |
| OCR телефонов | textengine + codeengine | ~17 MB |

**Итого моделей**: ~22 MB (вместо 200+ MB)

---

## 1. Структура минимального SDK

```
MinimalDocumentSDK/
├── android/
│   ├── sdk/
│   │   ├── build.gradle.kts
│   │   └── src/main/
│   │       ├── kotlin/com/docscan/sdk/
│   │       │   ├── DocumentScanner.kt          # Главный API
│   │       │   ├── PassportScanner.kt          # Паспорт + прописка
│   │       │   ├── BarcodeScanner.kt           # Штрих-коды
│   │       │   ├── CardScanner.kt              # Банковские карты
│   │       │   ├── PhoneOcrScanner.kt          # OCR телефонов
│   │       │   ├── models/                     # Data classes
│   │       │   └── internal/                   # Обёртки над SmartEngines
│   │       │       ├── EngineManager.kt
│   │       │       └── BundleLoader.kt
│   │       ├── jniLibs/
│   │       │   ├── arm64-v8a/
│   │       │   │   └── libjnimultiengine.so    # 42 MB (оригинал)
│   │       │   └── armeabi-v7a/
│   │       │       └── libjnimultiengine.so    # ~35 MB
│   │       └── assets/
│   │           └── bundles/
│   │               ├── passport.se             # ~3 MB (кастомный)
│   │               ├── barcode_card.se         # ~2 MB (кастомный)
│   │               └── phone_ocr.se            # ~18 MB (кастомный)
│   └── sample/
│
└── ios/
    └── (аналогичная структура)
```

---

## 2. Файлы для извлечения из бандлов

### 2.1 Паспорт РФ (страницы 2-3)

**Из `bundle_international_faces_liveness/`:**

```
ОБЯЗАТЕЛЬНЫЕ:
├── docs/rus.passport.national/
│   ├── rus.passport.national_anywhere.json
│   ├── templates/
│   │   ├── rus.passport.national.page2.common.json
│   │   └── rus.passport.national.page3.common.json
│   ├── objed_classifiers/*.pb
│   ├── field_processors/
│   ├── postprocessors/
│   └── tplfinder_config_common.json
│
├── ffe/YOLO_roi/
│   ├── yolo_rus_psp_pages_roi.tar.zst      # 480 KB - детектор страниц
│   ├── yolo_rus_psp_pages23.tar.zst        # 360 KB - страницы 2-3
│   └── yolo_mrz_anywhere.tar.zst           # 392 KB - MRZ детектор
│
├── recstr/netdata/final/synthetic/
│   ├── rus/                                 # Кириллица OCR
│   └── eng/eng_101_mrz_fcr.tar.zst         # MRZ OCR
│
└── smartid_root_files/rus.json             # Корневой конфиг России

УДАЛИТЬ:
├── docs/ (все страны кроме rus.passport.*)
├── ffe/YOLO_roi/ (все кроме rus_psp_*, mrz_*)
├── liveness_config/                         # Liveness не нужен
├── face_config/                             # Сравнение лиц не нужно
└── forensics/                               # Проверка подлинности (опционально)
```

### 2.2 Прописка (страницы 5-12)

**Из `bundle_international_faces_liveness/`:**

```
ОБЯЗАТЕЛЬНЫЕ:
├── docs/rus.passport.registration/
│   ├── templates/
│   │   ├── rus.registration.handwritten.type1_*.json
│   │   ├── rus.registration.handwritten.type2_*.json
│   │   ├── rus.registration.printed.type1_*.json
│   │   └── rus.registration.printed.type2_*.json
│   ├── field_processors/
│   ├── postprocessors/
│   └── tplfinder_config.json
│
├── ffe/YOLO_roi/
│   ├── yolo_rus_psp_stamps.tar.zst         # 288 KB - детектор штампов
│   └── stamp_classifier.tar.zst            # 92 KB - классификатор
│
└── recstr/special_nn/
    └── rus_psp_reg_hw_classifier.tar.zst   # 444 KB - рукописный/печатный
```

### 2.3 Штрих-коды

**Из `bundle_codeengine_full/`:**

```
ОБЯЗАТЕЛЬНЫЕ:
├── docs/barcode/
│   ├── barcode_engine.json
│   ├── barcode_detector_micropdf417.json
│   ├── pdf417_quad_locator.json
│   └── segment_detection_*.json
│
├── ffe/YOLO_roi/
│   ├── yolo_barcode_anywhere_v03.tar.zst   # 484 KB
│   └── yolo_barcode_kp_classifier_v01.tar.zst # 84 KB
│
└── postprocessor/
    ├── gs1_interpreter.json
    ├── url_interpreter.json
    ├── vcard_interpreter.json
    ├── tel_interpreter.json
    └── payment_interpreter.json

УДАЛИТЬ:
├── docs/vin/                                # VIN номера
├── docs/license_plate/                      # Номерные знаки
├── docs/shipping_container/                 # Контейнеры
├── docs/iban_lines/                         # IBAN (оставить если нужно)
├── docs/inn_lines/                          # ИНН
└── docs/kpp_lines/                          # КПП
```

### 2.4 Банковские карты

**Из `bundle_codeengine_full/`:**

```
ОБЯЗАТЕЛЬНЫЕ:
├── docs/card/
│   ├── card_engine.json
│   ├── card_finder.json
│   ├── card_orient.tar.zst                 # 440 KB
│   └── dictionaries/
│
├── ffe/YOLO_roi/
│   └── yolo_cards_2.tar.zst                # 188 KB
│
├── recstr/special_nn/
│   ├── card_type.tar.zst                   # 24 KB
│   ├── card_embossed_symdig_fcr.tar.zst    # 100 KB
│   ├── card_indent_symdig_fcr.tar.zst      # 68 KB
│   ├── card_freeform.tar.zst               # 96 KB
│   └── card_text_detector.tar.zst          # 12 KB
│
└── postprocessor/
    ├── card_number_postprocessor_embossed.json
    ├── card_number_postprocessor_indent.json
    ├── card_name_extractor.json
    └── card_expiry_date_extractor.json
```

### 2.5 OCR телефонов

**Из `bundle_textengine/`:**

```
ОБЯЗАТЕЛЬНЫЕ:
├── textengine_docs/
│   ├── textengine_languages_base.json
│   ├── character_translation.json
│   └── languages_translation.json
│
├── recstr/netdata/final/synthetic/
│   ├── rus/rus_printed_111.tar.zst         # 8.5 MB ⚠️ большой
│   ├── text_detector/txtdet_common.tar.zst
│   └── digits/dig_printed.tar.zst
│
├── deskewer/                                # Выравнивание
└── mixangler/                               # Коррекция угла

**Из `bundle_codeengine_full/`:**
├── docs/phone.lines/
│   └── postprocessors/
│       ├── phone_line_alph_rus.json
│       ├── phone_number_final_selector.json
│       └── punctuation_filter.json
```

---

## 3. Скрипт сборки минимальных бандлов

```python
#!/usr/bin/env python3
"""Build minimal bundles for Document Scanner SDK"""

import os
import shutil
import tarfile
import hashlib
import zstandard as zstd
from pathlib import Path

# Пути
EXTRACTED_DIR = Path("C:/temp/MobileSDK/extracted_bundles")
OUTPUT_DIR = Path("C:/temp/MobileSDK/minimal_sdk/bundles")
KEY_FILE = Path("C:/temp/MobileSDK/analysis/key_table_offset_3737888.bin")

# Файлы для каждого модуля
PASSPORT_FILES = [
    "bundle_international_faces_liveness/docs/rus.passport.national/**/*",
    "bundle_international_faces_liveness/ffe/YOLO_roi/yolo_rus_psp_pages_roi.tar.zst",
    "bundle_international_faces_liveness/ffe/YOLO_roi/yolo_rus_psp_pages23.tar.zst",
    "bundle_international_faces_liveness/ffe/YOLO_roi/yolo_mrz_anywhere.tar.zst",
    "bundle_international_faces_liveness/ffe/YOLO_roi/yolo_mrz_zone.tar.zst",
    "bundle_international_faces_liveness/recstr/netdata/final/synthetic/rus/**/*",
    "bundle_international_faces_liveness/recstr/netdata/final/synthetic/eng/eng_101_mrz_*.tar.zst",
    "bundle_international_faces_liveness/smartid_root_files/rus.json",
    "bundle_international_faces_liveness/smartid.json",
]

REGISTRATION_FILES = [
    "bundle_international_faces_liveness/docs/rus.passport.registration/**/*",
    "bundle_international_faces_liveness/ffe/YOLO_roi/yolo_rus_psp_stamps.tar.zst",
    "bundle_international_faces_liveness/ffe/YOLO_roi/stamp_classifier.tar.zst",
    "bundle_international_faces_liveness/recstr/special_nn/rus_psp_reg_hw_classifier.tar.zst",
]

BARCODE_FILES = [
    "bundle_codeengine_full/docs/barcode/**/*",
    "bundle_codeengine_full/ffe/YOLO_roi/yolo_barcode_anywhere_v03.tar.zst",
    "bundle_codeengine_full/ffe/YOLO_roi/yolo_barcode_kp_classifier_v01.tar.zst",
    "bundle_codeengine_full/postprocessor/gs1_interpreter.json",
    "bundle_codeengine_full/postprocessor/url_interpreter.json",
    "bundle_codeengine_full/postprocessor/vcard_interpreter.json",
    "bundle_codeengine_full/postprocessor/tel_interpreter.json",
    "bundle_codeengine_full/codeengine.json",
]

CARD_FILES = [
    "bundle_codeengine_full/docs/card/**/*",
    "bundle_codeengine_full/ffe/YOLO_roi/yolo_cards_2.tar.zst",
    "bundle_codeengine_full/recstr/special_nn/card_*.tar.zst",
    "bundle_codeengine_full/postprocessor/card_*.json",
]

PHONE_OCR_FILES = [
    "bundle_textengine/textengine_docs/**/*",
    "bundle_textengine/recstr/netdata/final/synthetic/rus/rus_printed_111.tar.zst",
    "bundle_textengine/recstr/netdata/final/synthetic/text_detector/txtdet_common.tar.zst",
    "bundle_textengine/recstr/netdata/final/synthetic/digits/dig_printed.tar.zst",
    "bundle_textengine/deskewer/**/*",
    "bundle_textengine/bundle_textengine.json",
    "bundle_codeengine_full/docs/phone.lines/**/*",
]

def collect_files(patterns: list, base_dir: Path) -> list:
    """Collect files matching glob patterns"""
    files = []
    for pattern in patterns:
        if "**" in pattern:
            # Recursive glob
            parts = pattern.split("**")
            base = base_dir / parts[0].rstrip("/")
            if base.exists():
                for f in base.rglob("*"):
                    if f.is_file():
                        files.append(f)
        else:
            path = base_dir / pattern
            if path.exists():
                if path.is_file():
                    files.append(path)
                else:
                    for f in path.rglob("*"):
                        if f.is_file():
                            files.append(f)
    return files

def create_tar_zstd(files: list, base_dir: Path, output_path: Path, bundle_name: str):
    """Create TAR.ZSTD archive"""
    import io

    # Create TAR in memory
    tar_buffer = io.BytesIO()
    with tarfile.open(fileobj=tar_buffer, mode='w') as tar:
        for f in files:
            rel_path = f.relative_to(base_dir)
            # Rebase to bundle_name/
            arcname = f"{bundle_name}/{rel_path}"
            tar.add(f, arcname=arcname)

    tar_data = tar_buffer.getvalue()

    # Compress with ZSTD
    cctx = zstd.ZstdCompressor(level=19)
    compressed = cctx.compress(tar_data)

    return compressed

def create_sebundle(compressed_body: bytes, version: str, license_hash: str, output_path: Path, key: bytes):
    """Create .se bundle with XOR encryption"""

    # Build header
    dec_len = 10  # Length of mini section "1~se_demo~"
    header = f"sebundle1~{version}~{license_hash}{dec_len}~".encode('ascii')

    # Calculate SHA1 of header
    header_sha1 = hashlib.sha1(header).digest()

    # Mini section
    mini = b"1~se_demo~"

    # Build payload
    payload = bytearray()

    # 1. XOR encrypt SHA1 checksum (20 bytes)
    for i, b in enumerate(header_sha1):
        payload.append(b ^ key[i])

    # 2. XOR encrypt mini section
    for i, b in enumerate(mini):
        payload.append(b ^ key[20 + i])

    # 3. XOR encrypt body
    body_start = 20 + dec_len
    for i, b in enumerate(compressed_body):
        key_idx = (body_start + i) & 0x7F
        payload.append(b ^ key[key_idx])

    # Write final bundle
    with open(output_path, 'wb') as f:
        f.write(header)
        f.write(bytes(payload))

    print(f"Created: {output_path} ({output_path.stat().st_size / 1024 / 1024:.2f} MB)")

def build_minimal_bundles():
    """Build all minimal bundles"""

    OUTPUT_DIR.mkdir(parents=True, exist_ok=True)

    # Load XOR key
    key = KEY_FILE.read_bytes()

    # Bundle configurations
    bundles = [
        {
            'name': 'passport_rus',
            'patterns': PASSPORT_FILES + REGISTRATION_FILES,
            'version': '2.7.2',
            'output': 'passport_rus.se'
        },
        {
            'name': 'barcode_card',
            'patterns': BARCODE_FILES + CARD_FILES,
            'version': '2.7.2',
            'output': 'barcode_card.se'
        },
        {
            'name': 'phone_ocr',
            'patterns': PHONE_OCR_FILES,
            'version': '2.6.4',
            'output': 'phone_ocr.se'
        }
    ]

    license_hash = "2688f026b0f34dea31b377bfe5fd1f6ecf2b9848"

    for bundle in bundles:
        print(f"\nBuilding {bundle['name']}...")

        # Collect files
        files = collect_files(bundle['patterns'], EXTRACTED_DIR)
        print(f"  Collected {len(files)} files")

        if not files:
            print(f"  WARNING: No files found!")
            continue

        # Calculate total size
        total_size = sum(f.stat().st_size for f in files)
        print(f"  Total uncompressed: {total_size / 1024 / 1024:.2f} MB")

        # Create compressed archive
        compressed = create_tar_zstd(files, EXTRACTED_DIR, None, bundle['name'])
        print(f"  Compressed: {len(compressed) / 1024 / 1024:.2f} MB")

        # Create .se bundle
        output_path = OUTPUT_DIR / bundle['output']
        create_sebundle(compressed, bundle['version'], license_hash, output_path, key)

if __name__ == '__main__':
    build_minimal_bundles()
```

---

## 4. Java/Kotlin обёртка

### 4.1 Главный API

```kotlin
// DocumentScanner.kt
package com.docscan.sdk

import android.content.Context
import kotlinx.coroutines.flow.StateFlow

class DocumentScanner private constructor(
    private val context: Context,
    private val config: Config
) {
    private val engineManager = EngineManager(context)

    val loadingState: StateFlow<LoadingState> = engineManager.loadingState

    suspend fun initialize() {
        engineManager.loadBundles(config.enabledModules)
    }

    fun passport(): PassportScanner = PassportScanner(engineManager)
    fun barcode(): BarcodeScanner = BarcodeScanner(engineManager)
    fun card(): CardScanner = CardScanner(engineManager)
    fun phoneOcr(): PhoneOcrScanner = PhoneOcrScanner(engineManager)

    fun release() {
        engineManager.release()
    }

    data class Config(
        val enabledModules: Set<Module> = Module.values().toSet()
    )

    enum class Module {
        PASSPORT,      // Паспорт + прописка
        BARCODE,       // Штрих-коды
        CARD,          // Банковские карты
        PHONE_OCR      // OCR телефонов
    }

    sealed class LoadingState {
        object Idle : LoadingState()
        data class Loading(val module: Module, val progress: Float) : LoadingState()
        object Ready : LoadingState()
        data class Error(val exception: Throwable) : LoadingState()
    }

    class Builder(private val context: Context) {
        private var enabledModules = mutableSetOf<Module>()

        fun enablePassport() = apply { enabledModules.add(Module.PASSPORT) }
        fun enableBarcode() = apply { enabledModules.add(Module.BARCODE) }
        fun enableCard() = apply { enabledModules.add(Module.CARD) }
        fun enablePhoneOcr() = apply { enabledModules.add(Module.PHONE_OCR) }
        fun enableAll() = apply { enabledModules.addAll(Module.values()) }

        fun build(): DocumentScanner {
            return DocumentScanner(context, Config(enabledModules))
        }
    }
}
```

### 4.2 Менеджер движков

```kotlin
// internal/EngineManager.kt
package com.docscan.sdk.internal

import android.content.Context
import com.smartengines.code.CodeEngine
import com.smartengines.doc.DocEngine
import com.smartengines.p006id.IdEngine
import com.smartengines.text.TextEngine
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

internal class EngineManager(private val context: Context) {

    private val _loadingState = MutableStateFlow<DocumentScanner.LoadingState>(
        DocumentScanner.LoadingState.Idle
    )
    val loadingState: StateFlow<DocumentScanner.LoadingState> = _loadingState

    // Движки (lazy initialization)
    var idEngine: IdEngine? = null
        private set
    var codeEngine: CodeEngine? = null
        private set
    var textEngine: TextEngine? = null
        private set

    init {
        System.loadLibrary("jnimultiengine")
    }

    suspend fun loadBundles(modules: Set<DocumentScanner.Module>) {
        try {
            for (module in modules) {
                _loadingState.value = DocumentScanner.LoadingState.Loading(module, 0f)

                when (module) {
                    DocumentScanner.Module.PASSPORT -> loadPassportBundle()
                    DocumentScanner.Module.BARCODE,
                    DocumentScanner.Module.CARD -> loadBarcodeCardBundle()
                    DocumentScanner.Module.PHONE_OCR -> loadPhoneOcrBundle()
                }
            }
            _loadingState.value = DocumentScanner.LoadingState.Ready

        } catch (e: Exception) {
            _loadingState.value = DocumentScanner.LoadingState.Error(e)
            throw e
        }
    }

    private suspend fun loadPassportBundle() {
        if (idEngine != null) return

        val bundleData = context.assets.open("bundles/passport_rus.se").readBytes()
        idEngine = IdEngine.Create(bundleData, false, 1, false)
    }

    private suspend fun loadBarcodeCardBundle() {
        if (codeEngine != null) return

        val bundleData = context.assets.open("bundles/barcode_card.se").readBytes()
        codeEngine = CodeEngine.Create(bundleData, false)
    }

    private suspend fun loadPhoneOcrBundle() {
        if (textEngine != null) return

        val bundleData = context.assets.open("bundles/phone_ocr.se").readBytes()
        textEngine = TextEngine.Create(bundleData, false)
    }

    fun release() {
        idEngine?.delete()
        codeEngine?.delete()
        textEngine?.delete()
        idEngine = null
        codeEngine = null
        textEngine = null
    }
}
```

### 4.3 Сканер паспорта

```kotlin
// PassportScanner.kt
package com.docscan.sdk

import android.graphics.Bitmap
import com.docscan.sdk.internal.EngineManager
import com.docscan.sdk.models.PassportResult
import com.docscan.sdk.models.RegistrationResult
import com.smartengines.common.Image
import com.smartengines.p006id.IdSessionSettings

class PassportScanner internal constructor(
    private val engineManager: EngineManager
) {
    private val engine get() = engineManager.idEngine
        ?: throw IllegalStateException("Passport module not loaded")

    /**
     * Сканирование паспорта РФ (страницы 2-3)
     */
    fun scanMainPages(bitmap: Bitmap): Result<PassportResult> = runCatching {
        val settings = engine.CreateSessionSettings().apply {
            SetCurrentMode("rus")
            AddEnabledDocumentTypes("rus.passport.national")
        }

        val session = engine.SpawnSession(settings, "passport_scan", null)
        val image = Image.CreateFromBitmap(bitmap)

        session.ProcessImage(image)
        val result = session.GetCurrentResult()

        // Извлечение полей
        val document = result.GetDocument(0)
        PassportResult(
            surname = document.GetTextField("surname")?.GetValue()?.GetFirstString() ?: "",
            name = document.GetTextField("name")?.GetValue()?.GetFirstString() ?: "",
            patronymic = document.GetTextField("patronymic")?.GetValue()?.GetFirstString(),
            birthDate = document.GetTextField("birth_date")?.GetValue()?.GetFirstString() ?: "",
            birthPlace = document.GetTextField("birthplace")?.GetValue()?.GetFirstString() ?: "",
            gender = document.GetTextField("sex")?.GetValue()?.GetFirstString() ?: "",
            series = document.GetTextField("series")?.GetValue()?.GetFirstString() ?: "",
            number = document.GetTextField("number")?.GetValue()?.GetFirstString() ?: "",
            issueDate = document.GetTextField("issue_date")?.GetValue()?.GetFirstString() ?: "",
            issuedBy = document.GetTextField("authority")?.GetValue()?.GetFirstString() ?: "",
            departmentCode = document.GetTextField("authority_code")?.GetValue()?.GetFirstString() ?: "",
            confidence = document.GetConfidence().toFloat()
        ).also {
            session.delete()
        }
    }

    /**
     * Сканирование прописки (страницы 5-12)
     */
    fun scanRegistration(bitmap: Bitmap): Result<RegistrationResult> = runCatching {
        val settings = engine.CreateSessionSettings().apply {
            SetCurrentMode("rus")
            AddEnabledDocumentTypes("rus.passport.registration")
        }

        val session = engine.SpawnSession(settings, "registration_scan", null)
        val image = Image.CreateFromBitmap(bitmap)

        session.ProcessImage(image)
        val result = session.GetCurrentResult()

        val document = result.GetDocument(0)
        RegistrationResult(
            address = document.GetTextField("address")?.GetValue()?.GetFirstString() ?: "",
            registrationDate = document.GetTextField("registration_date")?.GetValue()?.GetFirstString(),
            isHandwritten = document.GetTextField("type")?.GetValue()?.GetFirstString() == "handwritten",
            confidence = document.GetConfidence().toFloat()
        ).also {
            session.delete()
        }
    }
}
```

---

## 5. Оценка размеров

### Исходные бандлы (полные)

| Бандл | Размер |
|-------|--------|
| bundle_international_faces_liveness.se | 119 MB |
| bundle_codeengine_full.se | 5.8 MB |
| bundle_textengine.se | 27 MB |
| **Итого** | **152 MB** |

### Минимальные бандлы

| Бандл | Содержимое | Размер (оценка) |
|-------|------------|-----------------|
| passport_rus.se | Паспорт + прописка | ~3 MB |
| barcode_card.se | Штрих-коды + карты | ~2 MB |
| phone_ocr.se | OCR телефонов | ~18 MB |
| **Итого** | | **~23 MB** |

### Итоговый размер SDK

| Компонент | Размер |
|-----------|--------|
| libjnimultiengine.so (arm64) | 42 MB |
| libjnimultiengine.so (arm32) | 35 MB |
| Минимальные бандлы | 23 MB |
| Kotlin обёртка | < 1 MB |
| **Android arm64 only** | **~66 MB** |
| **Android arm64 + arm32** | **~101 MB** |

---

## 6. План реализации

### Этап 1: Подготовка бандлов (1-2 дня)
- [ ] Создать скрипт извлечения файлов
- [ ] Собрать минимальные TAR архивы
- [ ] Зашифровать в .se формат
- [ ] Проверить загрузку через SmartEngines API

### Этап 2: Kotlin обёртка (2-3 дня)
- [ ] Реализовать EngineManager
- [ ] Реализовать PassportScanner
- [ ] Реализовать BarcodeScanner
- [ ] Реализовать CardScanner
- [ ] Реализовать PhoneOcrScanner

### Этап 3: Тестирование (2-3 дня)
- [ ] Unit тесты
- [ ] Интеграционные тесты с реальными изображениями
- [ ] Проверка на разных устройствах

### Этап 4: iOS порт (3-5 дней)
- [ ] Скомпилировать .framework
- [ ] Swift обёртка
- [ ] Тестирование

---

## 7. Альтернатива: Без пересборки бандлов

Если пересборка бандлов слишком сложна, можно использовать оригинальные бандлы с ленивой загрузкой:

```kotlin
class LazyDocumentScanner(context: Context) {
    // Загружать бандлы только при первом использовании модуля
    private val passportEngine by lazy {
        val data = context.assets.open("bundle_international_faces_liveness.se").readBytes()
        IdEngine.Create(data, false, 1, false)
    }

    private val codeEngine by lazy {
        val data = context.assets.open("bundle_codeengine_full.se").readBytes()
        CodeEngine.Create(data, false)
    }
}
```

**Размер**: ~200 MB, но загрузка по требованию.

---

*Документ создан: 2026-01-31*
