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

/* compiled from: DocAutoselectionModes.kt */
@Metadata(m513d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\b\u001a\u00020\t¨\u0006\u000b"}, m514d2 = {"Lcom/smartengines/dictionaries/DocAutoselectionModes;", "", "<init>", "()V", "loadDictionary", "", "", "Lcom/smartengines/dictionaries/DocAutoselectionModes$Item;", "context", "Landroid/content/Context;", "Item", "dictionaries_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class DocAutoselectionModes {
    public static final DocAutoselectionModes INSTANCE = new DocAutoselectionModes();

    private DocAutoselectionModes() {
    }

    /* compiled from: DocAutoselectionModes.kt */
    @Metadata(m513d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m514d2 = {"Lcom/smartengines/dictionaries/DocAutoselectionModes$Item;", "", HintConstants.AUTOFILL_HINT_NAME, "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "dictionaries_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class Item {
        private final String name;

        public static /* synthetic */ Item copy$default(Item item, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = item.name;
            }
            return item.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final Item copy(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new Item(name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Item) && Intrinsics.areEqual(this.name, ((Item) other).name);
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return "Item(name=" + this.name + ')';
        }

        public Item(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        public final String getName() {
            return this.name;
        }
    }

    public final Map<String, Item> loadDictionary(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final String currentLanguage = DicUtilsKt.getCurrentLanguage(context, CollectionsKt.listOf((Object[]) new String[]{"en", "ru"}));
        return DicUtilsKt.loadJSONObjectDictionary(context, false, "doc-autoselection-modes.json", new Function1() { // from class: com.smartengines.dictionaries.DocAutoselectionModes$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocAutoselectionModes.loadDictionary$lambda$0(currentLanguage, (JSONObject) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Item loadDictionary$lambda$0(String language, JSONObject json) throws JSONException {
        Intrinsics.checkNotNullParameter(language, "$language");
        Intrinsics.checkNotNullParameter(json, "json");
        String string = json.getJSONObject(HintConstants.AUTOFILL_HINT_NAME).getString(language);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new Item(string);
    }
}
