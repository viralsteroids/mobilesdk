package com.smartengines.engine.doc;

import androidx.autofill.HintConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocResultData.kt */
@Metadata(m513d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\u0005J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0015\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003J\u0015\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003J\u0015\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\tHÆ\u0003J\u0015\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\tHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u008d\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00062"}, m514d2 = {"Lcom/smartengines/engine/doc/DocumentData;", "", "id", "", "type", "", HintConstants.AUTOFILL_HINT_NAME, "Lcom/smartengines/engine/doc/DocName;", "attributes", "", "texts", "Lcom/smartengines/engine/doc/TextField;", "tables", "Lcom/smartengines/engine/doc/TableField;", "images", "Lcom/smartengines/engine/doc/ImageField;", "physicalDoc", "Lcom/smartengines/engine/doc/PhysicalDocumentData;", "<init>", "(ILjava/lang/String;Lcom/smartengines/engine/doc/DocName;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/smartengines/engine/doc/PhysicalDocumentData;)V", "getId", "()I", "getType", "()Ljava/lang/String;", "getName", "()Lcom/smartengines/engine/doc/DocName;", "getAttributes", "()Ljava/util/Map;", "getTexts", "getTables", "getImages", "getPhysicalDoc", "()Lcom/smartengines/engine/doc/PhysicalDocumentData;", "getFieldInfo", "Lcom/smartengines/engine/doc/FieldInfo;", "fieldKey", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DocumentData {
    private final Map<String, String> attributes;
    private final int id;
    private final Map<String, ImageField> images;
    private final DocName name;
    private final PhysicalDocumentData physicalDoc;
    private final Map<String, TableField> tables;
    private final Map<String, TextField> texts;
    private final String type;

    public static /* synthetic */ DocumentData copy$default(DocumentData documentData, int i, String str, DocName docName, Map map, Map map2, Map map3, Map map4, PhysicalDocumentData physicalDocumentData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = documentData.id;
        }
        if ((i2 & 2) != 0) {
            str = documentData.type;
        }
        if ((i2 & 4) != 0) {
            docName = documentData.name;
        }
        if ((i2 & 8) != 0) {
            map = documentData.attributes;
        }
        if ((i2 & 16) != 0) {
            map2 = documentData.texts;
        }
        if ((i2 & 32) != 0) {
            map3 = documentData.tables;
        }
        if ((i2 & 64) != 0) {
            map4 = documentData.images;
        }
        if ((i2 & 128) != 0) {
            physicalDocumentData = documentData.physicalDoc;
        }
        Map map5 = map4;
        PhysicalDocumentData physicalDocumentData2 = physicalDocumentData;
        Map map6 = map2;
        Map map7 = map3;
        return documentData.copy(i, str, docName, map, map6, map7, map5, physicalDocumentData2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final DocName getName() {
        return this.name;
    }

    public final Map<String, String> component4() {
        return this.attributes;
    }

    public final Map<String, TextField> component5() {
        return this.texts;
    }

    public final Map<String, TableField> component6() {
        return this.tables;
    }

    public final Map<String, ImageField> component7() {
        return this.images;
    }

    /* renamed from: component8, reason: from getter */
    public final PhysicalDocumentData getPhysicalDoc() {
        return this.physicalDoc;
    }

    public final DocumentData copy(int id, String type, DocName name, Map<String, String> attributes, Map<String, TextField> texts, Map<String, TableField> tables, Map<String, ImageField> images, PhysicalDocumentData physicalDoc) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(texts, "texts");
        Intrinsics.checkNotNullParameter(tables, "tables");
        Intrinsics.checkNotNullParameter(images, "images");
        return new DocumentData(id, type, name, attributes, texts, tables, images, physicalDoc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentData)) {
            return false;
        }
        DocumentData documentData = (DocumentData) other;
        return this.id == documentData.id && Intrinsics.areEqual(this.type, documentData.type) && Intrinsics.areEqual(this.name, documentData.name) && Intrinsics.areEqual(this.attributes, documentData.attributes) && Intrinsics.areEqual(this.texts, documentData.texts) && Intrinsics.areEqual(this.tables, documentData.tables) && Intrinsics.areEqual(this.images, documentData.images) && Intrinsics.areEqual(this.physicalDoc, documentData.physicalDoc);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.id) * 31) + this.type.hashCode()) * 31;
        DocName docName = this.name;
        int iHashCode2 = (((((((((iHashCode + (docName == null ? 0 : docName.hashCode())) * 31) + this.attributes.hashCode()) * 31) + this.texts.hashCode()) * 31) + this.tables.hashCode()) * 31) + this.images.hashCode()) * 31;
        PhysicalDocumentData physicalDocumentData = this.physicalDoc;
        return iHashCode2 + (physicalDocumentData != null ? physicalDocumentData.hashCode() : 0);
    }

    public String toString() {
        return "DocumentData(id=" + this.id + ", type=" + this.type + ", name=" + this.name + ", attributes=" + this.attributes + ", texts=" + this.texts + ", tables=" + this.tables + ", images=" + this.images + ", physicalDoc=" + this.physicalDoc + ')';
    }

    public DocumentData(int i, String type, DocName docName, Map<String, String> attributes, Map<String, TextField> texts, Map<String, TableField> tables, Map<String, ImageField> images, PhysicalDocumentData physicalDocumentData) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(texts, "texts");
        Intrinsics.checkNotNullParameter(tables, "tables");
        Intrinsics.checkNotNullParameter(images, "images");
        this.id = i;
        this.type = type;
        this.name = docName;
        this.attributes = attributes;
        this.texts = texts;
        this.tables = tables;
        this.images = images;
        this.physicalDoc = physicalDocumentData;
    }

    public final int getId() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }

    public final DocName getName() {
        return this.name;
    }

    public final Map<String, String> getAttributes() {
        return this.attributes;
    }

    public final Map<String, TextField> getTexts() {
        return this.texts;
    }

    public final Map<String, TableField> getTables() {
        return this.tables;
    }

    public final Map<String, ImageField> getImages() {
        return this.images;
    }

    public final PhysicalDocumentData getPhysicalDoc() {
        return this.physicalDoc;
    }

    public final FieldInfo getFieldInfo(String fieldKey) {
        FieldInfo info;
        Intrinsics.checkNotNullParameter(fieldKey, "fieldKey");
        ImageField imageField = this.images.get(fieldKey);
        if (imageField != null && (info = imageField.getInfo()) != null) {
            return info;
        }
        TextField textField = this.texts.get(fieldKey);
        if (textField != null) {
            return textField.getInfo();
        }
        TableField tableField = this.tables.get(fieldKey);
        if (tableField != null) {
            return tableField.getInfo();
        }
        return null;
    }
}
