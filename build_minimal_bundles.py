#!/usr/bin/env python3
"""Build minimal bundles for Document Scanner SDK - Extended"""

import os
import tarfile
import hashlib
import io
from pathlib import Path
from glob import glob

try:
    import zstandard as zstd
except ImportError:
    print("Installing zstandard...")
    os.system("pip install zstandard")
    import zstandard as zstd

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
    print(f"  Created: {output_path.name} ({size_mb:.2f} MB)")


def build_bundles():
    """Build all minimal bundles"""

    print("=" * 60)
    print("Building Minimal Document Scanner SDK Bundles")
    print("=" * 60)

    # Check paths
    if not EXTRACTED_DIR.exists():
        print(f"ERROR: Extracted bundles not found at {EXTRACTED_DIR}")
        return False

    if not KEY_FILE.exists():
        print(f"ERROR: XOR key not found at {KEY_FILE}")
        return False

    key = KEY_FILE.read_bytes()
    print(f"Loaded XOR key: {len(key)} bytes")

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
        print(f"\n{'=' * 60}")
        print(f"Building {bundle['name']}...")
        print('=' * 60)

        files = collect_files(bundle['patterns'], EXTRACTED_DIR)
        print(f"  Collected {len(files)} files")

        if not files:
            print("  WARNING: No files found!")
            continue

        total_size = sum(f.stat().st_size for f in files)
        print(f"  Total uncompressed: {total_size / 1024 / 1024:.2f} MB")

        print("  Compressing with ZSTD (level 19)...")
        compressed = create_tar_zstd(files, EXTRACTED_DIR, bundle['name'])
        print(f"  Compressed size: {len(compressed) / 1024 / 1024:.2f} MB")

        print("  Encrypting with XOR...")
        output_path = OUTPUT_DIR / bundle['output']
        create_sebundle(compressed, bundle['version'], output_path, key)

    print(f"\n{'=' * 60}")
    print("BUILD COMPLETE!")
    print('=' * 60)

    # Summary
    if OUTPUT_DIR.exists():
        print("\nGenerated bundles:")
        total = 0
        for f in sorted(OUTPUT_DIR.glob('*.se')):
            size = f.stat().st_size
            total += size
            print(f"  {f.name}: {size / 1024 / 1024:.2f} MB")
        print(f"\n  TOTAL: {total / 1024 / 1024:.2f} MB")
        print(f"\n  Output directory: {OUTPUT_DIR}")

    return True


if __name__ == '__main__':
    success = build_bundles()
    exit(0 if success else 1)
