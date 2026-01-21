package com.smartengines.dictionaries;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DicUtils.kt */
@Metadata(m513d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001aD\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002H\u000b0\u0011¨\u0006\u0013"}, m514d2 = {"getCurrentLanguage", "", "Landroid/content/Context;", "allowedLanguages", "", "readFromStream4", "", "inputStream", "Ljava/io/InputStream;", "loadJSONObjectDictionary", "", ExifInterface.GPS_DIRECTION_TRUE, "context", "skipPrivate", "", "fileName", "loadItem", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "dictionaries_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class DicUtilsKt {
    public static final String getCurrentLanguage(Context context, Iterable<String> iterable) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        String language = context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        Set of = SetsKt.setOf((Object[]) new String[]{"en", "ru"});
        if (iterable != null) {
            of = CollectionsKt.intersect(of, iterable);
        }
        if (!of.contains(language)) {
            return (String) CollectionsKt.first(of);
        }
        Intrinsics.checkNotNull(language);
        return language;
    }

    public static final byte[] readFromStream4(InputStream inputStream) throws Exception {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        int iAvailable = inputStream.available();
        byte[] bArr = new byte[iAvailable];
        int i = inputStream.read(bArr);
        inputStream.close();
        if (i == iAvailable) {
            return bArr;
        }
        throw new Exception("stream reading error");
    }

    public static final <T> Map<String, T> loadJSONObjectDictionary(Context context, boolean z, String fileName, Function1<? super JSONObject, ? extends T> loadItem) throws JSONException, IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(loadItem, "loadItem");
        HashMap map = new HashMap();
        InputStream inputStreamOpen = context.getAssets().open(fileName, 2);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
        JSONObject jSONObject = new JSONObject(new String(readFromStream4(inputStreamOpen), Charsets.UTF_8));
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            if (!z || !jSONObject2.optBoolean("private", false)) {
                Intrinsics.checkNotNull(jSONObject2);
                map.put(next, loadItem.invoke(jSONObject2));
            }
        }
        return map;
    }
}
