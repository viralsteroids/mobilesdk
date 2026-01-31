# Сборка минимального SDK на базе libjnimultiengine.so

## Целевые функции (расширенный набор)

| Функция | Страны/Типы | Размер |
|---------|-------------|--------|
| **Паспорта СНГ** | RUS, BLR, KAZ, UKR, UZB, ARM, AZE, GEO, KGZ, MDA, TJK | ~18 MB |
| **Прописка** | RUS, BLR | ~2 MB |
| **Face Liveness** | Проверка живости лица | ~6 MB |
| **Forensics** | Проверка подлинности документов | ~0.2 MB |
| **Handwritten OCR** | Рукописный текст (кириллица) | ~8 MB |
| **Штрих-коды** | QR, PDF417, DataMatrix, EAN | ~1 MB |
| **Банковские карты** | Visa, MC, Mir, etc. | ~1 MB |
| **OCR телефонов** | Извлечение номеров | ~9 MB |

**Итого моделей**: ~45 MB (вместо 200+ MB)

---

## 1. Страны СНГ - поддерживаемые паспорта

| Код | Страна | Типы паспортов | Размер |
|-----|--------|----------------|--------|
| `rus` | Россия | national, international, biometric, previous | 4.5 MB |
| `blr` | Беларусь | type1, type2, type3, registration | 1.6 MB |
| `kaz` | Казахстан | type1, type2, type3, type4 | 1.6 MB |
| `ukr` | Украина | national, type1, type2 | 2.1 MB |
| `uzb` | Узбекистан | type1, type2 | 1.2 MB |
| `arm` | Армения | type1, type2 | 1.3 MB |
| `aze` | Азербайджан | type1, type2 | 1.1 MB |
| `geo` | Грузия | type1-type6 | 3.7 MB |
| `kgz` | Кыргызстан | type1, type2 | 1.4 MB |
| `mda` | Молдова | type1-type4 | 2.6 MB |
| `tjk` | Таджикистан | type1-type4 | 0.9 MB |

---

## 2. Структура минимального SDK

```
MinimalDocumentSDK/
├── android/
│   ├── sdk/
│   │   └── src/main/
│   │       ├── kotlin/com/docscan/sdk/
│   │       │   ├── DocumentScanner.kt
│   │       │   ├── PassportScanner.kt       # СНГ паспорта
│   │       │   ├── RegistrationScanner.kt   # Прописка
│   │       │   ├── LivenessScanner.kt       # Face liveness
│   │       │   ├── ForensicsScanner.kt      # Проверка подлинности
│   │       │   ├── BarcodeScanner.kt
│   │       │   ├── CardScanner.kt
│   │       │   ├── PhoneOcrScanner.kt
│   │       │   └── models/
│   │       ├── jniLibs/
│   │       │   └── arm64-v8a/libjnimultiengine.so  # 42 MB
│   │       └── assets/bundles/
│   │           ├── passport_cis.se          # ~20 MB
│   │           ├── barcode_card.se          # ~2 MB
│   │           └── phone_ocr.se             # ~10 MB
│   └── sample/
└── ios/
```

---

## 3. Файлы для извлечения

### 3.1 Паспорта СНГ + Liveness + Forensics + Handwritten

**Из `bundle_international_faces_liveness/`:**

```
ПАСПОРТА СНГ:
├── docs/rus.passport.national/              # 909 KB
├── docs/rus.passport.international/         # 453 KB
├── docs/rus.passport.national.additional_pages/  # 773 KB
├── docs/rus.passport.previous/              # 109 KB
├── docs/rus.passport.registration/          # 989 KB
├── docs/rus.passport.stamps/                # 1.3 MB
├── docs/blr/                                # 1.6 MB (включая blr.passport.registration)
├── docs/blr.passport.registration/          # Прописка Беларусь
├── docs/kaz/                                # 1.6 MB
├── docs/ukr/                                # 2.1 MB
├── docs/uzb/                                # 1.2 MB
├── docs/arm/                                # 1.3 MB
├── docs/aze/                                # 1.1 MB
├── docs/geo/                                # 3.7 MB
├── docs/kgz/                                # 1.4 MB
├── docs/mda/                                # 2.6 MB
└── docs/tjk/                                # 879 KB

FACE LIVENESS:
├── docs/face/                               # 44 KB
│   ├── face_liveness.json
│   ├── face_liveness_config.json
│   ├── face_liveness_zone_processor.json
│   ├── liveness.json
│   └── tpl__face_liveness.json
├── recstr/netdata/final/natural/face/       # 5.6 MB
│   ├── face_detector_yolo.tar.zst
│   ├── face_detector_yolo_new_aug2024.tar.zst
│   ├── face_embedder_tiny.tar.zst
│   ├── face_kp_detector_new.tar.zst
│   └── face_pnt_same_scale.tar.zst
└── smartid_root_files/face_liveness.json

FORENSICS (проверка подлинности):
├── forensics/                               # 171 KB
│   ├── basic_forensics.json
│   ├── check_attributes.json
│   ├── holo_form_estimation/
│   └── hologram_map_builder/
├── hologram_retriever/
├── flare_retriever/
└── docs/*/uv_*_passport*_analyzer/          # UV анализаторы по странам

HANDWRITTEN OCR:
├── recstr/netdata/final/synthetic/rus/
│   ├── rus_111_hw_fcr.tar.zst               # Рукописный русский
│   └── rus_111_fio_hw_comb_fcr.tar.zst      # ФИО рукописный
├── recstr/netdata/final/synthetic/digits/
│   └── dig_001_hw_numbers.tar.zst           # Рукописные цифры
├── recstr/netdata/final/synthetic/text_detector/
│   └── bin_vertsgm_hw.tar.zst               # Вертикальная сегментация
├── recstr/special_nn/
│   └── rus_psp_reg_hw_classifier.tar.zst    # Классификатор рукописного
└── ffe/YOLO_roi/
    └── regi_hw_fields_nn.tar.zst            # Детектор рукописных полей

ДЕТЕКТОРЫ (общие):
├── ffe/YOLO_roi/
│   ├── yolo_rus_psp_pages_roi.tar.zst       # 480 KB - детектор страниц
│   ├── yolo_rus_psp_pages23.tar.zst         # 360 KB
│   ├── yolo_rus_psp_stamps.tar.zst          # 288 KB - штампы прописки
│   ├── yolo_mrz_anywhere.tar.zst            # 392 KB - MRZ
│   ├── yolo_mrz_zone.tar.zst                # 132 KB
│   ├── yolo_id_roi.tar.zst                  # 436 KB - ID документы
│   ├── mrz_templates_classifier.tar.zst    # 112 KB
│   └── stamp_classifier.tar.zst            # 92 KB

OCR МОДЕЛИ:
├── recstr/netdata/final/synthetic/
│   ├── rus/                                 # Русский печатный + рукописный
│   ├── eng/eng_101_mrz_*.tar.zst           # MRZ OCR
│   ├── mlang/cyrillic_111_all_fcr.tar.zst  # Кириллица общий
│   └── digits/                              # Цифры
│
├── alphabet/                                # Алфавиты языков
└── vocs/                                    # Словари
```

### 3.2 Штрих-коды + Банковские карты

**Из `bundle_codeengine_full/`:**

```
ШТРИХ-КОДЫ:
├── docs/barcode/
│   ├── barcode_engine.json
│   ├── barcode_detector_micropdf417.json
│   └── segment_detection_*.json
├── ffe/YOLO_roi/
│   ├── yolo_barcode_anywhere_v03.tar.zst   # 484 KB
│   └── yolo_barcode_kp_classifier_v01.tar.zst # 84 KB
└── postprocessor/
    ├── gs1_interpreter.json
    ├── url_interpreter.json
    ├── vcard_interpreter.json
    ├── tel_interpreter.json
    ├── wifi_interpreter.json
    └── payment_interpreter.json

БАНКОВСКИЕ КАРТЫ:
├── docs/card/
│   ├── card_engine.json
│   ├── card_finder.json
│   ├── card_orient.tar.zst                 # 440 KB
│   └── dictionaries/
├── ffe/YOLO_roi/
│   └── yolo_cards_2.tar.zst                # 188 KB
├── recstr/special_nn/
│   ├── card_type.tar.zst                   # 24 KB
│   ├── card_embossed_symdig_fcr.tar.zst    # 100 KB
│   ├── card_indent_symdig_fcr.tar.zst      # 68 KB
│   ├── card_freeform.tar.zst               # 96 KB
│   └── card_text_detector.tar.zst          # 12 KB
└── postprocessor/card_*.json
```

### 3.3 OCR телефонов

**Из `bundle_textengine/`:**

```
├── textengine_docs/
│   ├── textengine_languages_base.json
│   ├── character_translation.json
│   └── languages_translation.json
├── recstr/netdata/final/synthetic/
│   ├── rus/rus_printed_111.tar.zst         # 8.5 MB
│   ├── text_detector/txtdet_common.tar.zst
│   └── digits/dig_printed.tar.zst
├── deskewer/
└── bundle_textengine.json

**Из `bundle_codeengine_full/`:**
└── docs/phone.lines/postprocessors/
    ├── phone_line_alph_rus.json
    ├── phone_number_final_selector.json
    └── punctuation_filter.json
```

---

## 4. Скрипт сборки бандлов

```python
#!/usr/bin/env python3
"""Build minimal bundles for Document Scanner SDK - Extended"""

import os
import shutil
import tarfile
import hashlib
import zstandard as zstd
from pathlib import Path
from glob import glob

# Пути
EXTRACTED_DIR = Path("C:/temp/MobileSDK/analysis/extracted_tar")
OUTPUT_DIR = Path("C:/temp/MobileSDK/minimal_sdk/bundles")
KEY_FILE = Path("C:/temp/MobileSDK/analysis/key_table_offset_3737888.bin")

# СНГ страны
CIS_COUNTRIES = ['rus', 'blr', 'kaz', 'ukr', 'uzb', 'arm', 'aze', 'geo', 'kgz', 'mda', 'tjk']

# Файлы для passport_cis.se
PASSPORT_CIS_PATTERNS = [
    # Российские паспорта (все типы)
    "bundle_international_faces_liveness/docs/rus.passport.*/**/*",
    "bundle_international_faces_liveness/docs/rus.passport.registration/**/*",

    # Паспорта СНГ
    *[f"bundle_international_faces_liveness/docs/{c}/**/*" for c in CIS_COUNTRIES],

    # Прописка Беларусь
    "bundle_international_faces_liveness/docs/blr.passport.registration/**/*",

    # Face Liveness
    "bundle_international_faces_liveness/docs/face/**/*",
    "bundle_international_faces_liveness/recstr/netdata/final/natural/face/**/*",
    "bundle_international_faces_liveness/smartid_root_files/face_liveness.json",
    "bundle_international_faces_liveness/smartid_root_files/documents/face_liveness_documents.json",

    # Forensics
    "bundle_international_faces_liveness/forensics/**/*",
    "bundle_international_faces_liveness/hologram_retriever/**/*",
    "bundle_international_faces_liveness/flare_retriever/**/*",

    # Handwritten OCR
    "bundle_international_faces_liveness/recstr/netdata/final/synthetic/rus/rus_111_hw_fcr.tar.zst",
    "bundle_international_faces_liveness/recstr/netdata/final/synthetic/rus/rus_111_fio_hw_comb_fcr.tar.zst",
    "bundle_international_faces_liveness/recstr/netdata/final/synthetic/digits/dig_001_hw_numbers.tar.zst",
    "bundle_international_faces_liveness/recstr/netdata/final/synthetic/text_detector/bin_vertsgm_hw.tar.zst",
    "bundle_international_faces_liveness/recstr/special_nn/rus_psp_reg_hw_classifier.tar.zst",
    "bundle_international_faces_liveness/ffe/YOLO_roi/regi_hw_fields_nn.tar.zst",

    # Детекторы
    "bundle_international_faces_liveness/ffe/YOLO_roi/yolo_rus_psp_*.tar.zst",
    "bundle_international_faces_liveness/ffe/YOLO_roi/yolo_mrz_*.tar.zst",
    "bundle_international_faces_liveness/ffe/YOLO_roi/yolo_id_roi.tar.zst",
    "bundle_international_faces_liveness/ffe/YOLO_roi/mrz_templates_classifier.tar.zst",
    "bundle_international_faces_liveness/ffe/YOLO_roi/stamp_classifier.tar.zst",

    # Печатный OCR (кириллица)
    "bundle_international_faces_liveness/recstr/netdata/final/synthetic/rus/**/*",
    "bundle_international_faces_liveness/recstr/netdata/final/synthetic/eng/eng_101_mrz_*.tar.zst",
    "bundle_international_faces_liveness/recstr/netdata/final/synthetic/mlang/cyrillic_*.tar.zst",
    "bundle_international_faces_liveness/recstr/netdata/final/synthetic/digits/**/*",

    # Общие конфиги
    "bundle_international_faces_liveness/alphabet/**/*",
    "bundle_international_faces_liveness/smartid.json",
    "bundle_international_faces_liveness/bundle_international_faces_liveness.json",
    "bundle_international_faces_liveness/smartid_root_files/rus.json",
    *[f"bundle_international_faces_liveness/smartid_root_files/{c}.json" for c in CIS_COUNTRIES],
    "bundle_international_faces_liveness/smartid_root_files/anycis.json",

    # Общие компоненты
    "bundle_international_faces_liveness/deskewer/**/*",
    "bundle_international_faces_liveness/docengine/**/*",
    "bundle_international_faces_liveness/content_detector/**/*",
    "bundle_international_faces_liveness/correct_color_detector/**/*",
    "bundle_international_faces_liveness/field_processors/**/*",
    "bundle_international_faces_liveness/integrator/**/*",
    "bundle_international_faces_liveness/postprocessor/**/*",
    "bundle_international_faces_liveness/vocs/**/*",
]

BARCODE_CARD_PATTERNS = [
    # Штрих-коды
    "bundle_codeengine_full/docs/barcode/**/*",
    "bundle_codeengine_full/ffe/YOLO_roi/yolo_barcode_*.tar.zst",
    "bundle_codeengine_full/postprocessor/*_interpreter.json",

    # Карты
    "bundle_codeengine_full/docs/card/**/*",
    "bundle_codeengine_full/ffe/YOLO_roi/yolo_cards_*.tar.zst",
    "bundle_codeengine_full/recstr/special_nn/card_*.tar.zst",
    "bundle_codeengine_full/postprocessor/card_*.json",

    # Общие
    "bundle_codeengine_full/codeengine.json",
    "bundle_codeengine_full/bundle_codeengine_full.json",
]

PHONE_OCR_PATTERNS = [
    # TextEngine
    "bundle_textengine/textengine_docs/**/*",
    "bundle_textengine/recstr/netdata/final/synthetic/rus/rus_printed_111.tar.zst",
    "bundle_textengine/recstr/netdata/final/synthetic/text_detector/txtdet_common.tar.zst",
    "bundle_textengine/recstr/netdata/final/synthetic/digits/dig_printed.tar.zst",
    "bundle_textengine/deskewer/**/*",
    "bundle_textengine/bundle_textengine.json",

    # Телефоны из codeengine
    "bundle_codeengine_full/docs/phone.lines/**/*",
]

def collect_files(patterns: list, base_dir: Path) -> list:
    """Collect files matching glob patterns"""
    files = set()
    for pattern in patterns:
        full_pattern = str(base_dir / pattern)
        for path in glob(full_pattern, recursive=True):
            p = Path(path)
            if p.is_file():
                files.add(p)
    return sorted(files)

def create_tar_zstd(files: list, base_dir: Path, bundle_name: str) -> bytes:
    """Create TAR.ZSTD archive"""
    import io

    tar_buffer = io.BytesIO()
    with tarfile.open(fileobj=tar_buffer, mode='w') as tar:
        for f in files:
            try:
                # Определяем какой бандл-источник
                rel_to_base = f.relative_to(base_dir)
                parts = rel_to_base.parts
                source_bundle = parts[0]  # bundle_international_faces_liveness, etc.
                inner_path = Path(*parts[1:])  # путь внутри бандла

                # Сохраняем с правильной структурой
                arcname = f"{bundle_name}/{inner_path}"
                tar.add(str(f), arcname=arcname)
            except Exception as e:
                print(f"  Warning: {e}")

    tar_data = tar_buffer.getvalue()

    # ZSTD compression (level 19 for max compression)
    cctx = zstd.ZstdCompressor(level=19)
    return cctx.compress(tar_data)

def create_sebundle(compressed_body: bytes, version: str, output_path: Path, key: bytes):
    """Create .se bundle with XOR encryption"""

    license_hash = "2688f026b0f34dea31b377bfe5fd1f6ecf2b9848"
    dec_len = 10
    header = f"sebundle1~{version}~{license_hash}{dec_len}~".encode('ascii')

    # SHA1 of header
    header_sha1 = hashlib.sha1(header).digest()

    # Mini section
    mini = b"1~se_demo~"

    # Build encrypted payload
    payload = bytearray()

    # 1. XOR encrypt SHA1 checksum
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

    # Write bundle
    output_path.parent.mkdir(parents=True, exist_ok=True)
    with open(output_path, 'wb') as f:
        f.write(header)
        f.write(bytes(payload))

    size_mb = output_path.stat().st_size / 1024 / 1024
    print(f"Created: {output_path.name} ({size_mb:.2f} MB)")

def build_bundles():
    """Build all minimal bundles"""

    key = KEY_FILE.read_bytes()

    bundles = [
        {
            'name': 'passport_cis',
            'patterns': PASSPORT_CIS_PATTERNS,
            'version': '2.7.2',
            'output': 'passport_cis.se'
        },
        {
            'name': 'barcode_card',
            'patterns': BARCODE_CARD_PATTERNS,
            'version': '2.7.2',
            'output': 'barcode_card.se'
        },
        {
            'name': 'phone_ocr',
            'patterns': PHONE_OCR_PATTERNS,
            'version': '2.6.4',
            'output': 'phone_ocr.se'
        }
    ]

    for bundle in bundles:
        print(f"\n{'='*60}")
        print(f"Building {bundle['name']}...")
        print('='*60)

        files = collect_files(bundle['patterns'], EXTRACTED_DIR)
        print(f"Collected {len(files)} files")

        if not files:
            print("WARNING: No files found!")
            continue

        total_size = sum(f.stat().st_size for f in files)
        print(f"Total uncompressed: {total_size / 1024 / 1024:.2f} MB")

        compressed = create_tar_zstd(files, EXTRACTED_DIR, bundle['name'])
        print(f"Compressed: {len(compressed) / 1024 / 1024:.2f} MB")

        output_path = OUTPUT_DIR / bundle['output']
        create_sebundle(compressed, bundle['version'], output_path, key)

    print(f"\n{'='*60}")
    print("All bundles created!")
    print('='*60)

    # Summary
    total = sum(f.stat().st_size for f in OUTPUT_DIR.glob('*.se'))
    print(f"Total bundle size: {total / 1024 / 1024:.2f} MB")

if __name__ == '__main__':
    build_bundles()
```

---

## 5. Kotlin API

### 5.1 Сканер паспортов СНГ

```kotlin
// PassportScanner.kt
class PassportScanner internal constructor(
    private val engineManager: EngineManager
) {
    /**
     * Поддерживаемые страны СНГ
     */
    enum class Country(val code: String, val displayName: String) {
        RUSSIA("rus", "Россия"),
        BELARUS("blr", "Беларусь"),
        KAZAKHSTAN("kaz", "Казахстан"),
        UKRAINE("ukr", "Украина"),
        UZBEKISTAN("uzb", "Узбекистан"),
        ARMENIA("arm", "Армения"),
        AZERBAIJAN("aze", "Азербайджан"),
        GEORGIA("geo", "Грузия"),
        KYRGYZSTAN("kgz", "Кыргызстан"),
        MOLDOVA("mda", "Молдова"),
        TAJIKISTAN("tjk", "Таджикистан");

        companion object {
            val CIS = values().toList()
        }
    }

    /**
     * Сканирование паспорта с автоопределением страны
     */
    fun scan(
        bitmap: Bitmap,
        countries: List<Country> = Country.CIS
    ): Result<PassportResult> = runCatching {
        val engine = engineManager.idEngine
            ?: throw IllegalStateException("Passport module not loaded")

        val settings = engine.CreateSessionSettings().apply {
            // Включаем все указанные страны
            for (country in countries) {
                SetCurrentMode(country.code)
                AddEnabledDocumentTypes("${country.code}.passport.*")
            }
        }

        val session = engine.SpawnSession(settings, "passport_scan", null)
        val image = Image.CreateFromBitmap(bitmap)

        session.ProcessImage(image)
        val result = session.GetCurrentResult()

        parsePassportResult(result).also {
            session.delete()
        }
    }

    /**
     * Сканирование только российского паспорта
     */
    fun scanRussian(bitmap: Bitmap): Result<RussianPassportResult> = runCatching {
        val result = scan(bitmap, listOf(Country.RUSSIA)).getOrThrow()
        RussianPassportResult.fromPassport(result)
    }

    /**
     * Сканирование прописки (Россия, Беларусь)
     */
    fun scanRegistration(bitmap: Bitmap): Result<RegistrationResult> = runCatching {
        val engine = engineManager.idEngine
            ?: throw IllegalStateException("Passport module not loaded")

        val settings = engine.CreateSessionSettings().apply {
            SetCurrentMode("rus")
            AddEnabledDocumentTypes("rus.passport.registration")
            AddEnabledDocumentTypes("blr.passport.registration")
        }

        val session = engine.SpawnSession(settings, "registration_scan", null)
        session.ProcessImage(Image.CreateFromBitmap(bitmap))

        parseRegistrationResult(session.GetCurrentResult()).also {
            session.delete()
        }
    }

    private fun parsePassportResult(result: IdResult): PassportResult {
        // ... извлечение полей
    }
}
```

### 5.2 Face Liveness

```kotlin
// LivenessScanner.kt
class LivenessScanner internal constructor(
    private val engineManager: EngineManager
) {
    /**
     * Проверка живости лица (anti-spoofing)
     */
    fun checkLiveness(bitmap: Bitmap): Result<LivenessResult> = runCatching {
        val engine = engineManager.idEngine
            ?: throw IllegalStateException("Liveness module not loaded")

        val result = engine.ProcessOneShotLiveness(Image.CreateFromBitmap(bitmap))

        LivenessResult(
            isAlive = result.GetIsAlive(),
            confidence = result.GetConfidence().toFloat(),
            faceDetected = result.GetFaceDetected(),
            faceRect = result.GetFaceRect()?.let {
                RectF(it.GetX(), it.GetY(),
                      it.GetX() + it.GetWidth(),
                      it.GetY() + it.GetHeight())
            }
        )
    }

    /**
     * Сравнение лиц (из паспорта и селфи)
     */
    fun compareFaces(
        passportPhoto: Bitmap,
        selfie: Bitmap
    ): Result<FaceComparisonResult> = runCatching {
        val engine = engineManager.idEngine
            ?: throw IllegalStateException("Liveness module not loaded")

        val settings = engine.CreateFaceSessionSettings()
        val session = engine.SpawnFaceSession(settings, "face_compare", null)

        session.ProcessImage(Image.CreateFromBitmap(passportPhoto))
        session.ProcessImage(Image.CreateFromBitmap(selfie))

        val result = session.GetFaceComparisonResult()

        FaceComparisonResult(
            isSamePerson = result.GetIsSamePerson(),
            similarity = result.GetSimilarity().toFloat(),
            confidence = result.GetConfidence().toFloat()
        ).also {
            session.delete()
        }
    }
}

data class LivenessResult(
    val isAlive: Boolean,
    val confidence: Float,
    val faceDetected: Boolean,
    val faceRect: RectF?
)

data class FaceComparisonResult(
    val isSamePerson: Boolean,
    val similarity: Float,
    val confidence: Float
)
```

### 5.3 Forensics (проверка подлинности)

```kotlin
// ForensicsScanner.kt
class ForensicsScanner internal constructor(
    private val engineManager: EngineManager
) {
    /**
     * Проверка подлинности документа
     */
    fun checkAuthenticity(bitmap: Bitmap): Result<ForensicsResult> = runCatching {
        val engine = engineManager.idEngine
            ?: throw IllegalStateException("Forensics module not loaded")

        val settings = engine.CreateSessionSettings().apply {
            EnableForensics()
        }

        val session = engine.SpawnSession(settings, "forensics_check", null)
        session.ProcessImage(Image.CreateFromBitmap(bitmap))

        val result = session.GetCurrentResult()
        val forensics = result.GetForensicsResult()

        ForensicsResult(
            isAuthentic = forensics?.GetIsAuthentic() ?: false,
            checks = parseForensicsChecks(forensics),
            hologramDetected = forensics?.GetHologramDetected() ?: false,
            uvFeaturesValid = forensics?.GetUvFeaturesValid(),
            overallScore = forensics?.GetOverallScore()?.toFloat() ?: 0f
        ).also {
            session.delete()
        }
    }

    private fun parseForensicsChecks(forensics: IdForensicsResult?): List<ForensicsCheck> {
        if (forensics == null) return emptyList()

        return listOf(
            ForensicsCheck("photo_substitution", forensics.GetPhotoSubstitutionCheck()),
            ForensicsCheck("text_alteration", forensics.GetTextAlterationCheck()),
            ForensicsCheck("document_structure", forensics.GetDocumentStructureCheck()),
            ForensicsCheck("security_features", forensics.GetSecurityFeaturesCheck())
        )
    }
}

data class ForensicsResult(
    val isAuthentic: Boolean,
    val checks: List<ForensicsCheck>,
    val hologramDetected: Boolean,
    val uvFeaturesValid: Boolean?,
    val overallScore: Float
)

data class ForensicsCheck(
    val name: String,
    val passed: Boolean,
    val confidence: Float = 0f,
    val details: String? = null
)
```

---

## 6. Оценка размеров

### Минимальные бандлы

| Бандл | Содержимое | Размер |
|-------|------------|--------|
| **passport_cis.se** | 11 стран + liveness + forensics + handwritten | ~20 MB |
| **barcode_card.se** | Штрих-коды + карты | ~2 MB |
| **phone_ocr.se** | OCR телефонов | ~10 MB |
| **Итого бандлы** | | **~32 MB** |

### Полный SDK

| Компонент | Размер |
|-----------|--------|
| libjnimultiengine.so (arm64) | 42 MB |
| libjnimultiengine.so (arm32) | 35 MB |
| Бандлы | 32 MB |
| Kotlin код | < 1 MB |
| **Android arm64** | **~75 MB** |
| **Android arm64 + arm32** | **~110 MB** |

---

## 7. Сравнение с оригиналом

| Метрика | Оригинал | Минимальный |
|---------|----------|-------------|
| Бандлы | 200 MB | 32 MB |
| Страны | 200+ | 11 (СНГ) |
| Face Liveness | ✓ | ✓ |
| Forensics | ✓ | ✓ |
| Handwritten OCR | ✓ | ✓ |
| Штрих-коды | ✓ | ✓ |
| Банковские карты | ✓ | ✓ |
| OCR телефонов | ✓ | ✓ |
| **Экономия** | | **~85%** |

---

*Документ обновлён: 2026-01-31*
