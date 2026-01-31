# Engine config summary (selected)

## analysis\extracted_tar\bundle_codeengine_full\docs\barcode\barcode_engine.json
- keys: barcode_reader, encoding_guessing_postprocessor, postpocessors
- barcode_reader: :/zone_processors/barcode/barcode_reader_config.json
- encoding_guessing_postprocessor: :/docs/barcode/postprocessors/encoding_guessing_postprocessor.json

## analysis\extracted_tar\bundle_codeengine_full\docs\card\card_engine.json
- keys: card_finder, cardreader_engines
- card_finder: :/docs/card/card_finder.json

## analysis\extracted_tar\bundle_codeengine_full\docs\payment_details\payment_details_engine.json
- keys: cross_type_subs_num_diffs, in_type_matcher_dist, max_lev_dist, text_recog_config
- cross_type_subs_num_diffs: 2
- max_lev_dist: 1

## analysis\extracted_tar\bundle_codeengine_full\docs\shipping_container\shipping_container_engine.json
- keys: ___inversion_detector_settings, ___ustom_alphabet, custom_alphabet, field_integrators, field_rejectors, field_selectors, iou_filter_threshold, multithreading_enabled, postprocessor, str_min_length, str_min_w2h_ratio, text_detection_settings, text_recognition_settings, zone_base_size
- ___ustom_alphabet:  .0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ
- custom_alphabet:  0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ
- field_selectors: field_selectors/shipping_container_field_selector.json
- iou_filter_threshold: 0.3
- multithreading_enabled: True
- postprocessor: :/docs/shipping_container/postprocessors/check_digit_postprocesor.json
- str_min_length: 1
- str_min_w2h_ratio: 0.0
- zone_base_size: 1200

## analysis\extracted_tar\bundle_newdocengine_demo_hiring_dsn\docengine_newcore_docs\adireg_engine.json

## analysis\extracted_tar\bundle_newdocengine_demo_hiring_dsn\docengine_newcore_docs\bundle_newdocengine_hiring_demo_dsn_engine.json
- keys: doc_preprocessing, doc_preselector, doc_ranker, documentation, features_extractors, fields_integrating, flex_documents, new_rigid_documents, old_core_engines, options, page_preprocessing, rigid_documents, scene_to_pages, tpl_extractor_path_tmp, tpp_processor, upp_processor
- doc_preselector: :/docengine/bow_doc_preselector.json
- doc_ranker: :/docengine/doc_ranker_simple.json
- flex_documents: :/docengine_newcore_docs/bundle_newdocengine_hiring_demo_dsn_engine_all_flex_documents.json
- new_rigid_documents: :/docengine_newcore_docs/rigid_forms/bundle_newdocengine_hiring_demo_dsn_engine_new_rigid_documents.json
- rigid_documents: :/smartid_root_files/documents/bundle_newdocengine_hiring_demo_dsn_engine_all_rigid_documents.json
- tpl_extractor_path_tmp: docengine/tpl_info_features_extractor.json
- tpp_processor: :/docengine/simple_typified_page_processor.json
- upp_processor: :/docengine/fulltext_untypified_page_processor.json

## analysis\extracted_tar\bundle_newdocengine_demo_hiring_dsn\docs\barcode\barcode_engine.json
- keys: barcode_reader, encoding_guessing_postprocessor, postpocessors
- barcode_reader: :/zone_processors/barcode/barcode_reader_config.json
- encoding_guessing_postprocessor: :/docs/barcode/postprocessors/encoding_guessing_postprocessor.json
