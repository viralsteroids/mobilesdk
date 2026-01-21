package com.smartengines.dictionaries;

import android.content.Context;
import androidx.autofill.HintConstants;
import com.smartengines.utils.UtilsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TextLanguages.kt */
@Metadata(m513d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¨\u0006\f"}, m514d2 = {"Lcom/smartengines/dictionaries/TextLanguages;", "", "<init>", "()V", "loadDictionary", "", "Lcom/smartengines/dictionaries/KeyName;", "context", "Landroid/content/Context;", "allowedKeys", "", "", "dictionaries_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TextLanguages {
    public static final TextLanguages INSTANCE = new TextLanguages();

    private TextLanguages() {
    }

    public final List<KeyName> loadDictionary(Context context, final Set<String> allowedKeys) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        final ArrayList arrayList = new ArrayList();
        final String currentLanguage = UtilsKt.getCurrentLanguage(context);
        UtilsKt.forEachJsonObject(new JSONObject(UtilsKt.readAssetsTextFile(context, "text-languages.json")), (Function2<? super String, ? super JSONObject, Unit>) new Function2() { // from class: com.smartengines.dictionaries.TextLanguages$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TextLanguages.loadDictionary$lambda$1$lambda$0(allowedKeys, arrayList, currentLanguage, (String) obj, (JSONObject) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadDictionary$lambda$1$lambda$0(Set set, ArrayList this_apply, String language, String key, JSONObject value) throws JSONException {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(language, "$language");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (set == null || set.contains(key)) {
            String string = value.getJSONObject(HintConstants.AUTOFILL_HINT_NAME).getString(language);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            this_apply.add(new KeyName(key, string));
        }
        return Unit.INSTANCE;
    }
}
