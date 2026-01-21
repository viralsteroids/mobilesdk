package com.smartengines.engine.doc;

import androidx.camera.video.AudioStats;
import com.smartengines.doc.DocDocumentFieldInfo;
import com.smartengines.doc.DocDocumentFieldsInfoIterator;
import com.smartengines.doc.DocDocumentInfo;
import com.smartengines.doc.DocSessionSettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.tls.CipherSuite;

/* compiled from: DocResultNamesFiller.kt */
@Metadata(m513d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a \u0010\u0005\u001a\u00020\u0006*\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0002\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\rH\u0002\u001a\u0018\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b*\u00020\rH\u0002¨\u0006\u000f"}, m514d2 = {"fillNames", "Lcom/smartengines/engine/doc/DocResultData;", "docSessionSettings", "Lcom/smartengines/doc/DocSessionSettings;", "Lcom/smartengines/engine/doc/DocumentData;", "fillName", "Lcom/smartengines/engine/doc/FieldInfo;", "dictionary", "", "", "Lcom/smartengines/engine/doc/SessionFieldInfo;", "parseDocName", "Lcom/smartengines/engine/doc/DocName;", "Lcom/smartengines/doc/DocDocumentInfo;", "parseFieldInfos", "engine_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class DocResultNamesFillerKt {
    public static final DocResultData fillNames(DocResultData docResultData, DocSessionSettings docSessionSettings) {
        Intrinsics.checkNotNullParameter(docResultData, "<this>");
        Intrinsics.checkNotNullParameter(docSessionSettings, "docSessionSettings");
        List<DocumentData> documents = docResultData.getDocuments();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(documents, 10));
        Iterator<T> it = documents.iterator();
        while (it.hasNext()) {
            arrayList.add(fillNames((DocumentData) it.next(), docSessionSettings));
        }
        return DocResultData.copy$default(docResultData, arrayList, null, 2, null);
    }

    private static final DocumentData fillNames(DocumentData documentData, DocSessionSettings docSessionSettings) {
        DocDocumentInfo docDocumentInfoGetDocumentInfo = docSessionSettings.GetDocumentInfo(documentData.getType());
        Intrinsics.checkNotNull(docDocumentInfoGetDocumentInfo);
        Map<String, SessionFieldInfo> fieldInfos = parseFieldInfos(docDocumentInfoGetDocumentInfo);
        DocName docName = parseDocName(docDocumentInfoGetDocumentInfo);
        Map<String, TextField> texts = documentData.getTexts();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(texts.size()));
        Iterator<T> it = texts.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), TextField.copy$default((TextField) entry.getValue(), fillName(((TextField) entry.getValue()).getInfo(), fieldInfos), null, 2, null));
        }
        Map<String, TableField> tables = documentData.getTables();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(tables.size()));
        Iterator<T> it2 = tables.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            linkedHashMap2.put(entry2.getKey(), TableField.copy$default((TableField) entry2.getValue(), fillName(((TableField) entry2.getValue()).getInfo(), fieldInfos), null, null, 6, null));
        }
        Map<String, ImageField> images = documentData.getImages();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt.mapCapacity(images.size()));
        Iterator<T> it3 = images.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it3.next();
            linkedHashMap3.put(entry3.getKey(), ImageField.copy$default((ImageField) entry3.getValue(), fillName(((ImageField) entry3.getValue()).getInfo(), fieldInfos), null, 2, null));
        }
        return DocumentData.copy$default(documentData, 0, null, docName, null, linkedHashMap, linkedHashMap2, linkedHashMap3, null, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, null);
    }

    private static final FieldInfo fillName(FieldInfo fieldInfo, Map<String, SessionFieldInfo> map) {
        SessionFieldInfo sessionFieldInfo = map.get(fieldInfo.getKey());
        return FieldInfo.copy$default(fieldInfo, null, sessionFieldInfo != null ? sessionFieldInfo.getName() : null, AudioStats.AUDIO_AMPLITUDE_NONE, false, null, 29, null);
    }

    private static final DocName parseDocName(DocDocumentInfo docDocumentInfo) {
        String strGetDocumentName = docDocumentInfo.GetDocumentName();
        Intrinsics.checkNotNullExpressionValue(strGetDocumentName, "GetDocumentName(...)");
        String strGetDocumentNameLocal = docDocumentInfo.GetDocumentNameLocal();
        Intrinsics.checkNotNullExpressionValue(strGetDocumentNameLocal, "GetDocumentNameLocal(...)");
        String strGetDocumentShortNameLocal = docDocumentInfo.GetDocumentShortNameLocal();
        Intrinsics.checkNotNullExpressionValue(strGetDocumentShortNameLocal, "GetDocumentShortNameLocal(...)");
        return new DocName(strGetDocumentName, strGetDocumentNameLocal, strGetDocumentShortNameLocal);
    }

    private static final Map<String, SessionFieldInfo> parseFieldInfos(DocDocumentInfo docDocumentInfo) {
        HashMap map = new HashMap();
        DocDocumentFieldsInfoIterator docDocumentFieldsInfoIteratorDocumentFieldsInfoBegin = docDocumentInfo.DocumentFieldsInfoBegin();
        DocDocumentFieldsInfoIterator docDocumentFieldsInfoIteratorDocumentFieldsInfoEnd = docDocumentInfo.DocumentFieldsInfoEnd();
        while (!docDocumentFieldsInfoIteratorDocumentFieldsInfoBegin.Equals(docDocumentFieldsInfoIteratorDocumentFieldsInfoEnd)) {
            DocDocumentFieldInfo docDocumentFieldInfoGetDocumentFieldInfo = docDocumentFieldsInfoIteratorDocumentFieldsInfoBegin.GetDocumentFieldInfo();
            String strGetKey = docDocumentFieldsInfoIteratorDocumentFieldsInfoBegin.GetKey();
            String strGetDocumentFieldName = docDocumentFieldInfoGetDocumentFieldInfo.GetDocumentFieldName();
            Intrinsics.checkNotNullExpressionValue(strGetDocumentFieldName, "GetDocumentFieldName(...)");
            String strGetDocumentFieldNameLocal = docDocumentFieldInfoGetDocumentFieldInfo.GetDocumentFieldNameLocal();
            Intrinsics.checkNotNullExpressionValue(strGetDocumentFieldNameLocal, "GetDocumentFieldNameLocal(...)");
            String strGetDocumentFieldShortNameLocal = docDocumentFieldInfoGetDocumentFieldInfo.GetDocumentFieldShortNameLocal();
            Intrinsics.checkNotNullExpressionValue(strGetDocumentFieldShortNameLocal, "GetDocumentFieldShortNameLocal(...)");
            DocName docName = new DocName(strGetDocumentFieldName, strGetDocumentFieldNameLocal, strGetDocumentFieldShortNameLocal);
            String strGetDocumentFieldType = docDocumentFieldInfoGetDocumentFieldInfo.GetDocumentFieldType();
            Intrinsics.checkNotNullExpressionValue(strGetDocumentFieldType, "GetDocumentFieldType(...)");
            String strGetDocumentFieldFormat = docDocumentFieldInfoGetDocumentFieldInfo.GetDocumentFieldFormat();
            Intrinsics.checkNotNullExpressionValue(strGetDocumentFieldFormat, "GetDocumentFieldFormat(...)");
            String strGetDocumentFieldExtFormat = docDocumentFieldInfoGetDocumentFieldInfo.GetDocumentFieldExtFormat();
            Intrinsics.checkNotNullExpressionValue(strGetDocumentFieldExtFormat, "GetDocumentFieldExtFormat(...)");
            docDocumentFieldsInfoIteratorDocumentFieldsInfoBegin.Advance();
        }
        return map;
    }
}
