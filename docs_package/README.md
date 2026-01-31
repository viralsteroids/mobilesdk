# SmartEngines SDK - Документация

## Содержание

### Основные документы

| Файл | Описание |
|------|----------|
| `CODE_RELATIONSHIPS.md` | **Главный документ** - полная карта взаимосвязей кода |
| `SDK_STRUCTURE.md` | Структура SDK, типы бандлов, нейросети |
| `BUNDLE_FORMAT_FINAL.md` | Технический формат .se файлов |
| `BUNDLE_FORMAT_SPECIFICATION.md` | Спецификация формата бандлов |
| `DECRYPTION_GUIDE.md` | Руководство по расшифровке |
| `INTEGRATION_GUIDE.md` | Интеграция SDK в приложения |

### Вспомогательные

| Файл | Описание |
|------|----------|
| `SE_BUNDLE_ANALYSIS.md` | Анализ содержимого бандлов |
| `FINAL_SUMMARY.md` | Итоговая сводка проекта |
| `DYNAMIC_CAPTURE_RUNBOOK.md` | Руководство по динамическому анализу |
| `SAMSUNG_ROOT_GUIDE.md` | Получение root на Samsung |

### Ключи и скрипты

| Файл | Описание |
|------|----------|
| `xor_key_128bytes.bin` | XOR ключ расшифровки (128 байт) |
| `scripts/decrypt_bundle.py` | Скрипт расшифровки .se бандлов |
| `scripts/_extract_xor_key.py` | Извлечение ключа из .so |

---

## Быстрый старт

### 1. Расшифровка бандла

```python
import hashlib
import zstandard as zstd

# Загрузить ключ
with open('xor_key_128bytes.bin', 'rb') as f:
    key = f.read()

# Загрузить бандл
with open('bundle_textengine.se', 'rb') as f:
    data = f.read()

# Парсинг заголовка
header_end = data.index(b'~', data.index(b'~', data.index(b'~') + 1) + 1) + 1
dec_len = int(data[:header_end].decode().split('~')[2][40:])
payload = data[header_end:]

# XOR расшифровка body
body_start = 20 + dec_len
body = bytearray()
for i, b in enumerate(payload[body_start:]):
    body.append(b ^ key[(body_start + i) & 0x7F])

# ZSTD декомпрессия
dctx = zstd.ZstdDecompressor()
tar_data = dctx.decompress(bytes(body))

# Результат - TAR архив с JSON и нейросетями
```

### 2. Структура расшифрованного бандла

```
bundle_name/
├── bundle_name.json          # Манифест
├── docs/                     # Шаблоны документов
├── recstr/
│   ├── netdata/final/        # Нейросети (.tar.zst)
│   └── special_nn/           # Специальные модели
├── postprocessor/            # Постобработка
└── vocs/                     # Словари
```

### 3. API использования

```kotlin
val engineLoader = EngineLoader(DocEngineWrapper())
engineLoader.load(context, "jnimultiengine", bundle) { engine ->
    val settings = engine.CreateSessionSettings()
    settings.AddEnabledDocumentTypes("rus.passport.*")
    val session = engine.SpawnSession(settings, "session", feedback)
    session.ProcessImage(image)
}
```

---

## Ключевые адреса в libjnimultiengine.so

| Компонент | Offset | Размер |
|-----------|--------|--------|
| XOR ключ | 0x3737888 | 128 bytes |
| SHA-1 | 0x027de380 | - |
| MD5 | 0x014099e0 | - |

---

## Статистика SDK

- **JNI методов**: 2,185
- **Стран**: 200+
- **Типов документов**: 699+
- **Нейросетей**: 280+
- **Размер бандлов**: 210 MB (сжатые) → 920 MB (распакованные)

---

*SmartEngines SDK v2.7.2 / v3.2.0*
