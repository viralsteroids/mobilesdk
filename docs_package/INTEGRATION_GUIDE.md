# SmartEngines SDK - Руководство по интеграции

Руководство по встраиванию SDK модулей распознавания в Android и iOS приложения.

## Обзор доступных модулей

| Модуль | Назначение | Движок | Bundle файл | Размер |
|--------|------------|--------|-------------|--------|
| **QRScanner** | QR-коды, штрихкоды | DocEngine | bundle_codeengine_full.se | ~5.6 MB |
| **CardScanner** | Банковские карты | IdEngine | bundle_newdocengine_demo_hiring_dsn.se | ~55 MB |
| **RegistrationScanner** | Страница прописки РФ | IdEngine | bundle_newdocengine_demo_hiring_dsn.se | ~55 MB |
| **TextScanner** | OCR произвольного текста | DocEngine | bundle_textengine.se | ~26 MB |

---

## Часть 1: Интеграция в Android

### 1.1 Структура файлов для интеграции

Из папки `TestApps_apk` вам понадобятся:

```
Ваш_проект/
├── app/
│   └── src/main/
│       ├── assets/
│       │   └── bundle_*.se          # Файл модели (из assets/)
│       ├── jniLibs/
│       │   └── arm64-v8a/
│       │       └── libjnimultiengine.so   # Нативная библиотека (~42 MB)
│       └── java/
│           └── com/smartengines/
│               ├── common/          # Базовые классы SDK
│               ├── id/              # IdEngine (карты, документы)
│               └── doc/             # DocEngine (QR, текст)
```

### 1.2 Извлечение необходимых файлов

#### Из APK-файла (рекомендуется):

```powershell
# 1. Распаковать APK с помощью apktool
java -jar apktool.jar d CardScanner_v5_aligned.apk -o CardScanner_extracted

# 2. Скопировать нужные файлы:
# - lib/arm64-v8a/libjnimultiengine.so -> jniLibs/arm64-v8a/
# - assets/bundle_*.se -> assets/
# - smali_classes3/com/smartengines/ -> конвертировать в .java или использовать JAR
```

#### Из исходников (если доступны):

```powershell
# Из TestApps/CardScanner/app/src/main/java/
# Скопировать пакеты:
# - com.smartengines.common.*
# - com.smartengines.id.*     (для IdEngine)
# - com.smartengines.doc.*    (для DocEngine)
```

### 1.2A Adding features from a scanner APK to another Android app

Use this when you want to transplant scanner functionality from one of the test APKs into another app (project or APK).

Two supported approaches:
- SDK-only (recommended): copy engine + bundles + core SDK classes and build your own UI.
- Full UI transplant: also copy the scanner app UI/resources and manifest entries.

Checklist (APK -> project):
1. Decompile source APK with apktool (or use the *_src folder).
2. Copy native libs and bundles:
   - lib/arm64-v8a/libjnimultiengine.so -> app/src/main/jniLibs/arm64-v8a/
   - assets/bundle_*.se -> app/src/main/assets/
3. Copy SDK classes:
   - com.smartengines.common.*
   - com.smartengines.id.* (IdEngine) or com.smartengines.doc.* (DocEngine)
   - If you want the built-in UI, also copy com.smartengines.app.* and any com.smartengines.* packages referenced by it.
4. Copy resources referenced by the UI (res/drawable, res/layout, res/values). Use build errors to find missing resources.
5. Merge manifest entries:
   - permissions: CAMERA (and NFC if used)
   - uses-feature: camera
   - activities/providers/services/receivers used by the scanner UI
6. Merge Gradle dependencies:
   - CameraX (camera-core, camera-camera2, camera-lifecycle, camera-view)
   - Guava ListenableFuture
   - If you copied Compose UI: compose runtime/material3 and activity-compose
7. Rebuild, sign, and test on an arm64 device.

Checklist (APK -> APK via smali):
1. Decompile both APKs with apktool.
2. Copy smali_classes*/com/smartengines/... packages from source to target.
3. Copy assets/bundle_*.se and lib/arm64-v8a/libjnimultiengine.so.
4. Copy required res/* and AndroidManifest.xml entries.
5. Rebuild, align, sign, and test.

### 1.3 Конфигурация build.gradle

```groovy
android {
    namespace 'com.yourapp.yourpackage'
    compileSdk 34

    defaultConfig {
        minSdk 24
        targetSdk 34

        // ВАЖНО: SDK поддерживает только arm64-v8a
        ndk {
            abiFilters 'arm64-v8a'
        }
    }

    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
        targetCompatibility JavaVersion.VERSION_1_8
    }

    // Путь к нативным библиотекам
    sourceSets {
        main {
            jniLibs.srcDirs = ['src/main/jniLibs']
        }
    }

    // ВАЖНО для больших .so файлов
    packagingOptions {
        jniLibs {
            useLegacyPackaging = true
        }
    }
}

dependencies {
    // Для работы с камерой (CameraX)
    def camerax_version = "1.3.0"
    implementation "androidx.camera:camera-core:${camerax_version}"
    implementation "androidx.camera:camera-camera2:${camerax_version}"
    implementation "androidx.camera:camera-lifecycle:${camerax_version}"
    implementation "androidx.camera:camera-view:${camerax_version}"

    // Для ListenableFuture
    implementation 'com.google.guava:guava:31.1-android'
}
```

### 1.4 AndroidManifest.xml

```xml
<manifest xmlns:android="http://schemas.android.com/apk/res/android">

    <!-- Разрешения -->
    <uses-permission android:name="android.permission.CAMERA" />
    <uses-feature android:name="android.hardware.camera" android:required="true" />

    <application
        android:extractNativeLibs="true"
        android:largeHeap="true">

        <!-- Ваши Activity -->

    </application>
</manifest>
```

### 1.5 Инициализация SDK

#### IdEngine (для карт и документов):

```java
import com.smartengines.id.*;
import com.smartengines.common.Image;

public class ScannerActivity extends AppCompatActivity {
    private IdEngine engine;
    private IdSession session;

    private void initEngine() {
        try {
            // 1. Загрузка нативной библиотеки
            System.loadLibrary("jnimultiengine");

            // 2. Копирование bundle из assets во внутреннее хранилище
            String bundlePath = copyAssetToInternal("bundle_newdocengine_demo_hiring_dsn.se");

            // 3. Создание движка
            engine = IdEngine.Create(bundlePath);

            // 4. Настройка сессии
            IdSessionSettings settings = engine.GetSessionSettings();

            // Маски документов:
            // "card.*"                    - банковские карты
            // "rus.passport.registration" - страница прописки
            // "rus.passport.main"         - главная страница паспорта
            settings.AddEnabledDocumentTypes("card.*");

            // 5. Создание сессии
            session = engine.SpawnSession(settings, "", null);

        } catch (Exception e) {
            Log.e(TAG, "Engine init failed", e);
        }
    }

    private String copyAssetToInternal(String assetName) {
        File outFile = new File(getFilesDir(), assetName);
        if (!outFile.exists()) {
            try (InputStream is = getAssets().open(assetName);
                 FileOutputStream fos = new FileOutputStream(outFile)) {
                byte[] buffer = new byte[8192];
                int read;
                while ((read = is.read(buffer)) != -1) {
                    fos.write(buffer, 0, read);
                }
            } catch (IOException e) {
                Log.e(TAG, "Failed to copy asset", e);
            }
        }
        return outFile.getAbsolutePath();
    }
}
```

#### DocEngine (для QR и текста):

```java
import com.smartengines.doc.*;
import com.smartengines.common.Image;

public class QRScannerActivity extends AppCompatActivity {
    private DocEngine engine;
    private DocSession session;

    private void initEngine() {
        try {
            System.loadLibrary("jnimultiengine");

            String bundlePath = copyAssetToInternal("bundle_codeengine_full.se");

            engine = DocEngine.Create(bundlePath);

            DocSessionSettings settings = engine.GetSessionSettings();

            // Маски для DocEngine:
            // "barcode.qr"       - QR-коды
            // "barcode.*"        - все штрихкоды
            // "text.*"           - произвольный текст
            settings.AddEnabledDocumentTypes("barcode.qr");

            session = engine.SpawnSession(settings);

        } catch (Exception e) {
            Log.e(TAG, "Engine init failed", e);
        }
    }
}
```

### 1.6 Обработка изображений

```java
// Конвертация ImageProxy (CameraX) в Image для SDK
private void processFrame(ImageProxy imageProxy) {
    try {
        // 1. Конвертируем в Bitmap
        Bitmap bitmap = imageProxyToBitmap(imageProxy);

        // 2. Конвертируем в RGB массив
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] pixels = new int[width * height];
        bitmap.getPixels(pixels, 0, width, 0, 0, width, height);

        byte[] rgb = new byte[width * height * 3];
        for (int i = 0; i < pixels.length; i++) {
            int pixel = pixels[i];
            rgb[i * 3]     = (byte) ((pixel >> 16) & 0xFF);  // R
            rgb[i * 3 + 1] = (byte) ((pixel >> 8) & 0xFF);   // G
            rgb[i * 3 + 2] = (byte) (pixel & 0xFF);          // B
        }

        // 3. Создаём Image для SDK
        Image image = Image.CreateFromRgbRawBuffer(
            width, height, rgb, width * 3);

        // 4. Обработка
        session.Process(image);

        // 5. Проверка результата
        if (session.IsResultTerminal()) {
            IdResult result = session.GetCurrentResult();
            displayResult(result);
        }

        // 6. Освобождение ресурсов
        image.delete();
        bitmap.recycle();

    } finally {
        imageProxy.close();
    }
}
```

### 1.7 Извлечение результатов

#### IdEngine (карты, документы):

```java
private void displayResult(IdResult result) {
    // Тип документа
    String docType = result.GetDocumentType();

    // Текстовые поля
    if (result.HasTextField("number")) {
        String cardNumber = result.GetTextField("number")
            .GetValue().GetUtf8String();
    }

    if (result.HasTextField("expiry_date")) {
        String expiry = result.GetTextField("expiry_date")
            .GetValue().GetUtf8String();
    }

    // Полный список полей для банковской карты:
    // - number        : номер карты
    // - expiry_date   : срок действия
    // - holder        : имя владельца
    // - bank          : название банка

    // Для паспорта (прописка):
    // - registration_region     : регион
    // - registration_area       : район
    // - registration_city       : город
    // - registration_street     : улица
    // - registration_house      : дом
    // - registration_apartment  : квартира
    // - registration_date       : дата регистрации
}
```

#### DocEngine (QR, текст):

```java
private void displayDocResult(DocResult result) {
    // Для QR/штрихкодов
    String docType = result.GetDocumentType();  // "barcode.qr", "barcode.code128", etc.

    // Значение кода
    if (result.HasTextField("value")) {
        String qrContent = result.GetTextField("value")
            .GetValue().GetUtf8String();
    }

    // Для OCR текста
    if (result.HasTextField("text")) {
        String recognizedText = result.GetTextField("text")
            .GetValue().GetUtf8String();
    }
}
```

### 1.8 Жизненный цикл

```java
@Override
protected void onDestroy() {
    super.onDestroy();

    // ВАЖНО: освобождение ресурсов
    if (session != null) {
        session.delete();
        session = null;
    }
    if (engine != null) {
        engine.delete();
        engine = null;
    }
}

// Для повторного сканирования
private void resetScanner() {
    if (session != null) {
        session.Reset();
    }
}
```

---

## Часть 2: Интеграция в iOS

### 2.1 Требуемые файлы

```
YourProject/
├── Frameworks/
│   └── SmartEnginesSDK.xcframework/   # Универсальный фреймворк
├── Resources/
│   └── bundle_*.se                     # Файл модели
└── Sources/
    └── ScannerViewController.swift
```

### 2.2 Подготовка framework

Из Android APK нельзя напрямую использовать `.so` файлы в iOS. Необходим отдельный iOS SDK от SmartEngines, который включает:

- `SmartEnginesSDK.xcframework` - универсальный фреймворк (arm64 + simulator)
- Или `libjnimultiengine.a` - статическая библиотека

### 2.3 Конфигурация Xcode

1. **Info.plist** - добавить разрешение камеры:
```xml
<key>NSCameraUsageDescription</key>
<string>Необходимо для сканирования документов</string>
```

2. **Build Settings**:
   - Other Linker Flags: `-ObjC`
   - Enable Bitcode: NO

3. **Linked Frameworks**:
   - AVFoundation.framework
   - CoreMedia.framework
   - CoreVideo.framework
   - Accelerate.framework

### 2.4 Swift интеграция (пример структуры)

```swift
import UIKit
import AVFoundation

class ScannerViewController: UIViewController {
    private var engine: SEIdEngine?
    private var session: SEIdSession?
    private var captureSession: AVCaptureSession?

    override func viewDidLoad() {
        super.viewDidLoad()
        initializeEngine()
        setupCamera()
    }

    private func initializeEngine() {
        guard let bundlePath = Bundle.main.path(
            forResource: "bundle_newdocengine_demo_hiring_dsn",
            ofType: "se"
        ) else {
            print("Bundle not found")
            return
        }

        do {
            // Создание движка
            engine = try SEIdEngine(bundlePath: bundlePath)

            // Настройка сессии
            let settings = engine?.getSessionSettings()
            settings?.addEnabledDocumentTypes("card.*")

            // Создание сессии
            session = try engine?.spawnSession(settings: settings!)

        } catch {
            print("Engine initialization failed: \(error)")
        }
    }

    // Обработка кадра из камеры
    func processFrame(_ sampleBuffer: CMSampleBuffer) {
        guard let pixelBuffer = CMSampleBufferGetImageBuffer(sampleBuffer),
              let session = session else { return }

        // Конвертация в RGB
        let ciImage = CIImage(cvPixelBuffer: pixelBuffer)
        // ... конвертация в RGB данные ...

        // Создание изображения SDK
        let image = SEImage.create(
            fromRgbRawBuffer: rgbData,
            width: Int32(width),
            height: Int32(height),
            stride: Int32(width * 3)
        )

        // Обработка
        session.process(image)

        // Проверка результата
        if session.isResultTerminal() {
            let result = session.getCurrentResult()
            DispatchQueue.main.async {
                self.displayResult(result)
            }
        }

        image?.delete()
    }
}
```

---

## Часть 3: Таблица масок документов

### IdEngine (bundle_newdocengine_demo_hiring_dsn.se)

| Маска | Описание |
|-------|----------|
| `card.*` | Все банковские карты |
| `card.visa` | Только Visa |
| `card.mastercard` | Только MasterCard |
| `card.mir` | Только МИР |
| `rus.passport.main` | Главная страница паспорта РФ |
| `rus.passport.registration` | Страница прописки |
| `rus.internal_passport.*` | Внутренний паспорт РФ |
| `rus.driver_license.*` | Водительское удостоверение РФ |

### DocEngine (bundle_codeengine_full.se)

| Маска | Описание |
|-------|----------|
| `barcode.qr` | QR-коды |
| `barcode.datamatrix` | DataMatrix |
| `barcode.ean13` | EAN-13 |
| `barcode.ean8` | EAN-8 |
| `barcode.code128` | Code 128 |
| `barcode.code39` | Code 39 |
| `barcode.*` | Все штрихкоды |

### DocEngine (bundle_textengine.se)

| Маска | Описание |
|-------|----------|
| `text.*` | Произвольный текст (OCR) |
| `text.rus` | Русский текст |
| `text.eng` | Английский текст |

---

## Часть 4: Минимальный пример интеграции

### 4.1 Добавление сканера карт в существующее приложение

1. **Скопируйте файлы** из `CardScanner_src`:
   - `lib/arm64-v8a/libjnimultiengine.so` -> `app/src/main/jniLibs/arm64-v8a/`
   - `assets/bundle_newdocengine_demo_hiring_dsn.se` -> `app/src/main/assets/`

2. **Добавьте Java классы** (из smali или JAR):
   ```
   com.smartengines.common.*
   com.smartengines.id.*
   ```

3. **Создайте Activity** для сканирования на основе примера из раздела 1.5

4. **Вызовите сканер** из вашего кода:
   ```java
   Intent intent = new Intent(this, CardScannerActivity.class);
   startActivityForResult(intent, SCAN_CARD_REQUEST);
   ```

5. **Получите результат**:
   ```java
   @Override
   protected void onActivityResult(int requestCode, int resultCode, Intent data) {
       if (requestCode == SCAN_CARD_REQUEST && resultCode == RESULT_OK) {
           String cardNumber = data.getStringExtra("card_number");
           String expiry = data.getStringExtra("expiry_date");
           // Используйте данные карты
       }
   }
   ```

---

## Часть 5: Решение проблем

### 5.1 Ошибка загрузки библиотеки

```
java.lang.UnsatisfiedLinkError: dlopen failed
```

**Решения:**
1. Проверьте, что `libjnimultiengine.so` находится в `jniLibs/arm64-v8a/`
2. Добавьте в build.gradle:
   ```groovy
   android {
       packagingOptions {
           jniLibs { useLegacyPackaging = true }
       }
   }
   ```
3. Убедитесь, что устройство arm64-v8a

### 5.2 Ошибка создания движка

```
Engine creation failed: Bundle not found
```

**Решения:**
1. Проверьте путь к bundle файлу
2. Скопируйте bundle из assets во внутреннее хранилище:
   ```java
   String bundlePath = copyAssetToInternal("bundle_*.se");
   ```

### 5.3 Низкая производительность

1. Используйте `STRATEGY_KEEP_ONLY_LATEST` для ImageAnalysis
2. Ограничьте разрешение камеры до 1920x1080
3. Обрабатывайте кадры в отдельном потоке

### 5.4 Лицензирование

SDK требует валидную лицензию от SmartEngines. Без лицензии:
- Движок работает в демо-режиме с watermark
- Или возвращает ошибку инициализации

Для получения лицензии обратитесь на [smartengines.com](https://smartengines.com)

---

## Часть 6: Размеры файлов

| Файл | Размер | Обязательность |
|------|--------|----------------|
| libjnimultiengine.so | ~42 MB | Обязательно |
| bundle_codeengine_full.se | ~5.6 MB | Для QR/штрихкодов |
| bundle_newdocengine_demo_hiring_dsn.se | ~55 MB | Для документов/карт |
| bundle_textengine.se | ~27 MB | Для OCR текста |
| bundle_international_faces_liveness.se | ~119 MB | Для Face ID/Liveness |

**Итого для CardScanner:** ~97 MB (APK ~260 MB с зависимостями)

---

## Часть 7: Исходный код примеров

Полные примеры доступны в директориях:
- `TestApps/CardScanner/` - сканер банковских карт
- `TestApps/QRScanner/` - сканер QR-кодов
- `TestApps/RegistrationScanner/` - сканер прописки
- `TestApps/TextScanner/` - OCR текста

Скомпилированные APK:
- `TestApps_apk/*_v5_aligned.apk` - готовые к установке версии
