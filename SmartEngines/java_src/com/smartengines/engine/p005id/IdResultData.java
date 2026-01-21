package com.smartengines.engine.p005id;

import com.smartengines.engine.Result;
import com.smartengines.visualization.Quad;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdResultData.kt */
@Metadata(m513d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003J\u0015\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\u0089\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001J\u0013\u0010/\u001a\u00020\u001f2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u00065"}, m514d2 = {"Lcom/smartengines/engine/id/IdResultData;", "Lcom/smartengines/engine/Result;", "docType", "", "textFields", "", "Lcom/smartengines/engine/id/TextField;", "checkFields", "Lcom/smartengines/engine/id/CheckField;", "imageFields", "Lcom/smartengines/engine/id/ImageField;", "forensicCheckFields", "forensicTextFields", "forensicImageFields", "templates", "", "Lcom/smartengines/engine/id/Template;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "getDocType", "()Ljava/lang/String;", "getTextFields", "()Ljava/util/List;", "getCheckFields", "getImageFields", "getForensicCheckFields", "getForensicTextFields", "getForensicImageFields", "getTemplates", "()Ljava/util/Map;", "isEmpty", "", "()Z", "quads", "", "Lcom/smartengines/visualization/Quad;", "getQuads", "()Ljava/util/Collection;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IdResultData implements Result {
    private final List<CheckField> checkFields;
    private final String docType;
    private final List<CheckField> forensicCheckFields;
    private final List<ImageField> forensicImageFields;
    private final List<TextField> forensicTextFields;
    private final List<ImageField> imageFields;
    private final Map<String, Template> templates;
    private final List<TextField> textFields;

    public static /* synthetic */ IdResultData copy$default(IdResultData idResultData, String str, List list, List list2, List list3, List list4, List list5, List list6, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = idResultData.docType;
        }
        if ((i & 2) != 0) {
            list = idResultData.textFields;
        }
        if ((i & 4) != 0) {
            list2 = idResultData.checkFields;
        }
        if ((i & 8) != 0) {
            list3 = idResultData.imageFields;
        }
        if ((i & 16) != 0) {
            list4 = idResultData.forensicCheckFields;
        }
        if ((i & 32) != 0) {
            list5 = idResultData.forensicTextFields;
        }
        if ((i & 64) != 0) {
            list6 = idResultData.forensicImageFields;
        }
        if ((i & 128) != 0) {
            map = idResultData.templates;
        }
        List list7 = list6;
        Map map2 = map;
        List list8 = list4;
        List list9 = list5;
        return idResultData.copy(str, list, list2, list3, list8, list9, list7, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDocType() {
        return this.docType;
    }

    public final List<TextField> component2() {
        return this.textFields;
    }

    public final List<CheckField> component3() {
        return this.checkFields;
    }

    public final List<ImageField> component4() {
        return this.imageFields;
    }

    public final List<CheckField> component5() {
        return this.forensicCheckFields;
    }

    public final List<TextField> component6() {
        return this.forensicTextFields;
    }

    public final List<ImageField> component7() {
        return this.forensicImageFields;
    }

    public final Map<String, Template> component8() {
        return this.templates;
    }

    public final IdResultData copy(String docType, List<TextField> textFields, List<CheckField> checkFields, List<ImageField> imageFields, List<CheckField> forensicCheckFields, List<TextField> forensicTextFields, List<ImageField> forensicImageFields, Map<String, Template> templates) {
        Intrinsics.checkNotNullParameter(docType, "docType");
        Intrinsics.checkNotNullParameter(textFields, "textFields");
        Intrinsics.checkNotNullParameter(checkFields, "checkFields");
        Intrinsics.checkNotNullParameter(imageFields, "imageFields");
        Intrinsics.checkNotNullParameter(forensicCheckFields, "forensicCheckFields");
        Intrinsics.checkNotNullParameter(forensicTextFields, "forensicTextFields");
        Intrinsics.checkNotNullParameter(forensicImageFields, "forensicImageFields");
        Intrinsics.checkNotNullParameter(templates, "templates");
        return new IdResultData(docType, textFields, checkFields, imageFields, forensicCheckFields, forensicTextFields, forensicImageFields, templates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdResultData)) {
            return false;
        }
        IdResultData idResultData = (IdResultData) other;
        return Intrinsics.areEqual(this.docType, idResultData.docType) && Intrinsics.areEqual(this.textFields, idResultData.textFields) && Intrinsics.areEqual(this.checkFields, idResultData.checkFields) && Intrinsics.areEqual(this.imageFields, idResultData.imageFields) && Intrinsics.areEqual(this.forensicCheckFields, idResultData.forensicCheckFields) && Intrinsics.areEqual(this.forensicTextFields, idResultData.forensicTextFields) && Intrinsics.areEqual(this.forensicImageFields, idResultData.forensicImageFields) && Intrinsics.areEqual(this.templates, idResultData.templates);
    }

    public int hashCode() {
        return (((((((((((((this.docType.hashCode() * 31) + this.textFields.hashCode()) * 31) + this.checkFields.hashCode()) * 31) + this.imageFields.hashCode()) * 31) + this.forensicCheckFields.hashCode()) * 31) + this.forensicTextFields.hashCode()) * 31) + this.forensicImageFields.hashCode()) * 31) + this.templates.hashCode();
    }

    public String toString() {
        return "IdResultData(docType=" + this.docType + ", textFields=" + this.textFields + ", checkFields=" + this.checkFields + ", imageFields=" + this.imageFields + ", forensicCheckFields=" + this.forensicCheckFields + ", forensicTextFields=" + this.forensicTextFields + ", forensicImageFields=" + this.forensicImageFields + ", templates=" + this.templates + ')';
    }

    public IdResultData(String docType, List<TextField> textFields, List<CheckField> checkFields, List<ImageField> imageFields, List<CheckField> forensicCheckFields, List<TextField> forensicTextFields, List<ImageField> forensicImageFields, Map<String, Template> templates) {
        Intrinsics.checkNotNullParameter(docType, "docType");
        Intrinsics.checkNotNullParameter(textFields, "textFields");
        Intrinsics.checkNotNullParameter(checkFields, "checkFields");
        Intrinsics.checkNotNullParameter(imageFields, "imageFields");
        Intrinsics.checkNotNullParameter(forensicCheckFields, "forensicCheckFields");
        Intrinsics.checkNotNullParameter(forensicTextFields, "forensicTextFields");
        Intrinsics.checkNotNullParameter(forensicImageFields, "forensicImageFields");
        Intrinsics.checkNotNullParameter(templates, "templates");
        this.docType = docType;
        this.textFields = textFields;
        this.checkFields = checkFields;
        this.imageFields = imageFields;
        this.forensicCheckFields = forensicCheckFields;
        this.forensicTextFields = forensicTextFields;
        this.forensicImageFields = forensicImageFields;
        this.templates = templates;
    }

    public final String getDocType() {
        return this.docType;
    }

    public final List<TextField> getTextFields() {
        return this.textFields;
    }

    public final List<CheckField> getCheckFields() {
        return this.checkFields;
    }

    public final List<ImageField> getImageFields() {
        return this.imageFields;
    }

    public final List<CheckField> getForensicCheckFields() {
        return this.forensicCheckFields;
    }

    public final List<TextField> getForensicTextFields() {
        return this.forensicTextFields;
    }

    public final List<ImageField> getForensicImageFields() {
        return this.forensicImageFields;
    }

    public final Map<String, Template> getTemplates() {
        return this.templates;
    }

    @Override // com.smartengines.engine.Result
    public boolean isEmpty() {
        return this.docType.length() == 0;
    }

    @Override // com.smartengines.engine.Result
    public Collection<Quad> getQuads() {
        ArrayList arrayList = new ArrayList();
        for (Template template : this.templates.values()) {
            arrayList.add(template.getQuad());
            arrayList.addAll(template.getFieldQuads().values());
        }
        return arrayList;
    }
}
