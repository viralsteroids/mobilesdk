# Руководство по дешифрованию SmartEngines Bundle
## UPDATE 2026-01-29
XOR is applied starting at the text header end (offset 59), so the XOR output begins with the XORed 36-byte binary header. The shared post-XOR 16-byte block at 0x14..0x23 maps back to the binary header constant (see `analysis/postxor_constant_derivation.md`).


## Резюме (подтверждено)

- **Формат бандла**: `sebundle1~<version>~<license_hash>~<encrypted_payload>`
- **License hash одинаковый** во всех .se: `2688f026b0f34dea31b377bfe5fd1f6ecf2b984810`
- **Цепочка загрузки**: `DocEngine::Create -> FUN_00af296c -> FUN_00af449c -> FUN_010f9624`
  - `FUN_00af296c` это загрузчик/парсер конфигурации, **не дешифратор**
- **FUN_01a9e194 = SHA-1**, это не дешифрование
- **XOR-рутина `0x1309f00-0x130a3e4`** найдена, но связь с бандлом не подтверждена
- **ZSTD/libarchive** символы есть в бинаре, но статические callsite пока не подтверждены из-за разметки в Ghidra

## Формат бандла

```
sebundle1~<version>~<license_hash>~<encrypted_payload>
```

## Кандидат на крипто-рутину

### Адрес
`0x1309f00 - 0x130a3e4`

### Константы (кандидаты)
```
0x07d6, 0x0d87, 0x14ed, 0xe905, 0xa3f8, 0x02d9, 0x4c8a, 0xf681
0x6122, 0x380c, 0xea44, 0xcfa9, 0x4b60, 0xbc70, 0x7ec6, 0x27fa
0x3085, 0x1d05, 0xd039, 0x99e5, ...
```

Как байтовая последовательность (little-endian):
```
d6 07 87 0d ed 14 05 e9 f8 a3 d9 02 8a 4c 81 f6 22 61 0c 38
44 ea a9 cf 60 4b 70 bc c6 7e fa 27 85 30 05 1d 39 d0 e5 99
```

Примечание: связь этой рутины с загрузкой бандла не подтверждена.

## Проблемы с текущим подходом

### Что было попробовано
1. ✅ Простой XOR с константами как ключом
2. ✅ XOR с различными длинами ключа (16, 32, 64 байта)
3. ✅ Комбинации констант с license hash
4. ✅ Поиск ZSTD магии после дешифрования

### Результаты
- ❌ Простой XOR не дает валидных данных
- ❌ ZSTD магия не найдена после дешифрования
- ❌ Данные остаются с высокой энтропией

## Рекомендуемые следующие шаги

### Вариант 1: Динамический анализ с Frida (рекомендуется)

Цель: поймать момент, где буфер меняется с зашифрованного на расшифрованный.
Подробные шаги запуска см. в `DYNAMIC_ANALYSIS_GUIDE.md`.

```javascript
// После загрузки библиотеки:
var base = Module.findBaseAddress("libjnimultiengine.so");
var init1 = base.add(0x00af449c); // engine init wrapper
var init2 = base.add(0x010f9624); // bundle initialization

function hookBuffer(label, addr) {
    Interceptor.attach(addr, {
        onEnter: function(args) {
            try {
                var buf = args[1]; // часто это {ptr, size}
                var dataPtr = buf.readPointer();
                var dataSize = buf.add(8).readU64();
                console.log("[" + label + "] size=" + dataSize);
                console.log(hexdump(dataPtr.readByteArray(Math.min(256, dataSize))));
                this.dataPtr = dataPtr;
                this.dataSize = dataSize;
            } catch (e) {
                console.log("[" + label + "] buffer read failed: " + e);
            }
        },
        onLeave: function() {
            if (this.dataPtr) {
                console.log("[" + label + "] after:");
                console.log(hexdump(this.dataPtr.readByteArray(Math.min(256, this.dataSize))));
            }
        }
    });
}

hookBuffer("ENGINE_INIT", init1);
hookBuffer("BUNDLE_INIT", init2);
```

Также полезно:
- Hook чтения из file loader (open/read) и сравнивать буферы
- Hook `ZSTD_decompressStream` или `archive_read_open_memory2`, если используются

### Вариант 2: Интерактивный анализ в Ghidra

1. Переимпортировать ELF с segment-based loading или наложить overlay, чтобы корректно увидеть PLT callsites
2. Трассировать цепочку от `FUN_00af449c` и `FUN_010f9624`
3. Искать функции, которые работают с сырыми буферами и меняют энтропию

#### Короткий чек-лист переимпорта (PLT/memory map mismatch)

- Сравнить program headers и section headers: убедиться, что исполняемые сегменты реально попали в memory map.
- Открыть Memory Map и проверить, что адреса PLT callsites (из ELF-скана) лежат внутри exec-блоков, а не в `.bss` или вне блоков.
- Если адреса вне блоков: переимпортировать ELF с загрузкой по сегментам (program headers), а не по секциям.
- Если переимпорт не помогает: добавить overlay/новый блок для диапазона адресов callsites и пометить его как exec.
- После исправления разметки повторить поиск BL-callsites к PLT-стабам (ZSTD/libarchive).

### Вариант 3: Извлечение полного ключа из библиотеки

1. Извлечь все 16-битные константы из XOR-рутины
2. Сформировать ключевые последовательности
3. Протестировать на небольших блоках (поиск ZSTD магии)

### Вариант 4: Анализ дампа памяти

1. Запустить приложение и загрузить бандл
2. Снять дамп памяти процесса
3. Ищите строки JSON или сигнатуру `28 B5 2F FD`

## Созданные инструменты

### 1. `decrypt_bundle_xor.py`
Попытка дешифрования с использованием известных констант:
- Различные варианты ключей
- Поиск ZSTD магии
- Сохранение результатов

### 2. `extract_crypto_constants.py`
Извлечение констант из библиотеки:
- Поиск известных констант
- Поиск кластеров констант
- Извлечение потенциального ключевого материала

### 3. Frida скрипты
См. `frida_*.js` файлы для динамического анализа

## Структура файлов

```
SmartEngines_apktool/assets/
  ├── bundle_codeengine_full.se
  ├── bundle_international_faces_liveness.se
  ├── bundle_newdocengine_demo_hiring_dsn.se
  └── bundle_textengine.se

decrypted_bundles/
  ├── *_last_attempt.bin        # Последние попытки дешифрования
  └── *_decrypted_raw.bin        # Сырые данные (из других скриптов)
```

## Важные адреса

- **Config loader**: `0x00af296c` (FUN_00af296c)
- **Engine init wrapper**: `0x00af449c` (FUN_00af449c)
- **Bundle initialization**: `0x010f9624` (FUN_010f9624)
- **SHA-1**: `0x01a9e194`
- **XOR-рутина (кандидат)**: `0x1309f00 - 0x130a3e4`

## Выводы

Простой XOR не работает, а фактическая функция дешифрования еще не найдена. Самый быстрый путь вперед - **динамический анализ** с фиксацией буферов до и после `FUN_00af449c`/`FUN_010f9624`.
