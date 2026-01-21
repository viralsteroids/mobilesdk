package com.smartengines.dictionaries;

import android.content.Context;
import androidx.autofill.HintConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DocDocumentTypes.kt */
@Metadata(m513d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\b\u001a\u00020\t¨\u0006\u000b"}, m514d2 = {"Lcom/smartengines/dictionaries/DocDocumentTypes;", "", "<init>", "()V", "loadDictionary", "", "", "Lcom/smartengines/dictionaries/DocDocumentTypes$DocumentType;", "context", "Landroid/content/Context;", "DocumentType", "dictionaries_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class DocDocumentTypes {
    public static final DocDocumentTypes INSTANCE = new DocDocumentTypes();

    private DocDocumentTypes() {
    }

    /* compiled from: DocDocumentTypes.kt */
    @Metadata(m513d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m514d2 = {"Lcom/smartengines/dictionaries/DocDocumentTypes$DocumentType;", "", HintConstants.AUTOFILL_HINT_NAME, "", "group", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getGroup", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "dictionaries_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class DocumentType {
        private final String group;
        private final String name;

        public static /* synthetic */ DocumentType copy$default(DocumentType documentType, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = documentType.name;
            }
            if ((i & 2) != 0) {
                str2 = documentType.group;
            }
            return documentType.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getGroup() {
            return this.group;
        }

        public final DocumentType copy(String name, String group) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new DocumentType(name, group);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentType)) {
                return false;
            }
            DocumentType documentType = (DocumentType) other;
            return Intrinsics.areEqual(this.name, documentType.name) && Intrinsics.areEqual(this.group, documentType.group);
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.group;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "DocumentType(name=" + this.name + ", group=" + this.group + ')';
        }

        public DocumentType(String name, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.group = str;
        }

        public final String getName() {
            return this.name;
        }

        public final String getGroup() {
            return this.group;
        }
    }

    public final Map<String, DocumentType> loadDictionary(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final String currentLanguage = DicUtilsKt.getCurrentLanguage(context, CollectionsKt.listOf((Object[]) new String[]{"en", "ru"}));
        return DicUtilsKt.loadJSONObjectDictionary(context, false, "doc-document-types.json", new Function1() { // from class: com.smartengines.dictionaries.DocDocumentTypes$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocDocumentTypes.loadDictionary$lambda$1(currentLanguage, (JSONObject) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DocumentType loadDictionary$lambda$1(String language, JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(language, "$language");
        Intrinsics.checkNotNullParameter(json, "json");
        String string = json.getJSONObject(HintConstants.AUTOFILL_HINT_NAME).getString(language);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String strOptString = json.optString("group");
        if (strOptString.length() == 0) {
            strOptString = null;
        }
        return new DocumentType(string, strOptString);
    }
}
