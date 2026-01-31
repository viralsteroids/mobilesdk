import json
from pathlib import Path


def main():
    out = []
    out.append('# Engine config summary (selected)')
    out.append('')
    targets = [
        Path('analysis/extracted_tar/bundle_codeengine_full/docs/barcode/barcode_engine.json'),
        Path('analysis/extracted_tar/bundle_codeengine_full/docs/card/card_engine.json'),
        Path('analysis/extracted_tar/bundle_codeengine_full/docs/payment_details/payment_details_engine.json'),
        Path('analysis/extracted_tar/bundle_codeengine_full/docs/shipping_container/shipping_container_engine.json'),
        Path('analysis/extracted_tar/bundle_newdocengine_demo_hiring_dsn/docengine_newcore_docs/adireg_engine.json'),
        Path('analysis/extracted_tar/bundle_newdocengine_demo_hiring_dsn/docengine_newcore_docs/bundle_newdocengine_hiring_demo_dsn_engine.json'),
        Path('analysis/extracted_tar/bundle_newdocengine_demo_hiring_dsn/docs/barcode/barcode_engine.json'),
    ]
    for p in targets:
        if not p.exists():
            continue
        try:
            data = json.loads(p.read_text(encoding='utf-8'))
        except Exception:
            continue
        out.append(f'## {p}')
        if isinstance(data, dict):
            keys = sorted(data.keys())
            out.append(f'- keys: {", ".join(keys)}')
            for k in keys:
                if isinstance(data[k], (str, int, float, bool)):
                    out.append(f'- {k}: {data[k]}')
        out.append('')
    Path('analysis/engine_config_summary.md').write_text('\n'.join(out), encoding='utf-8')


if __name__ == '__main__':
    main()
