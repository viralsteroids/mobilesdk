package com.smartengines.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.autofill.HintConstants;
import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Utils.kt */
@Metadata(m513d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001\u001a\u0016\u0010\n\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001\u001a\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r\u001a\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r\u001a\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001\u001a\u0018\u0010\u0011\u001a\u00020\u0001*\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013\u001aD\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\u00180\u0017\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u0002H\u00180\u001d\u001a@\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0001\u001aR\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\u00180\u0017\"\u0004\b\u0000\u0010\u00182\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\u00180\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0001\u001a\u000e\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u0001\u001a\u000e\u0010)\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u000f\u001a\u0014\u0010+\u001a\u00020\u0003*\u00020\u000f2\b\b\u0002\u0010,\u001a\u00020-\u001a\u001e\u0010.\u001a\u00020/*\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020/0\u001d\u001aB\u0010.\u001a\u00020/*\u00020\u001e26\u00101\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(5\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020/02\u001aB\u00107\u001a\u00020/*\u00020\u001e26\u00101\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(5\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b3\u0012\b\b4\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020/02\u001a*\u0010<\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010=\u001a\u00020>2\b\b\u0001\u0010?\u001a\u00020>2\b\b\u0001\u0010@\u001a\u00020>\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0015\u0010\u0014\u001a\u00020\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0015\"\u0015\u00108\u001a\u000209*\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006A"}, m514d2 = {"TAG", "", "readFromStream4", "", "inputStream", "Ljava/io/InputStream;", "readAssetsFile", "context", "Landroid/content/Context;", "filePath", "readAssetsTextFile", "loadFile", "uri", "Landroid/net/Uri;", "loadBitmapFromFile", "Landroid/graphics/Bitmap;", "loadBitmapFromAssetFile", "getCurrentLanguage", "allowedLanguages", "", "currentLanguage", "(Landroid/content/Context;)Ljava/lang/String;", "loadJSONObjectDictionary", "", ExifInterface.GPS_DIRECTION_TRUE, "skipPrivate", "", "fileName", "loadItem", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "filterSetByActualKeys", "", "dictionary", "actualKeys", "logger", "Lcom/smartengines/utils/Logger;", "tag", "filterDictionaryByActualKeys", "bitmapFromBase64String", "base64String", "bitmapToBase64String", "bitmap", "toByteArray", "format", "Landroid/graphics/Bitmap$CompressFormat;", "forEachJsonObject", "", "Lorg/json/JSONArray;", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "key", "value", "forEachString", "size", "Landroid/util/Size;", "getSize", "(Landroid/graphics/Bitmap;)Landroid/util/Size;", "drawableToBitmap", "rscId", "", "tintColor", "bgColor", "utils_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class UtilsKt {
    private static final String TAG = "myapp.Utils";

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

    public static final byte[] readAssetsFile(Context context, String filePath) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        InputStream inputStreamOpen = context.getAssets().open(filePath, 2);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
        return readFromStream4(inputStreamOpen);
    }

    public static final String readAssetsTextFile(Context context, String filePath) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new String(readAssetsFile(context, filePath), Charsets.UTF_8);
    }

    public static final byte[] loadFile(Context context, Uri uri) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream != null) {
            byte[] fromStream4 = readFromStream4(inputStreamOpenInputStream);
            inputStreamOpenInputStream.close();
            return fromStream4;
        }
        throw new Exception("Can't open " + uri);
    }

    public static final Bitmap loadBitmapFromFile(Context context, Uri uri) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Log.d(TAG, "loadBitmapFromFile  uri: " + uri);
        byte[] bArrLoadFile = loadFile(context, uri);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrLoadFile, 0, bArrLoadFile.length);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeByteArray, "decodeByteArray(...)");
        return bitmapDecodeByteArray;
    }

    public static final Bitmap loadBitmapFromAssetFile(Context context, String filePath) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        InputStream inputStreamOpen = context.getAssets().open(filePath, 2);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
        byte[] fromStream4 = readFromStream4(inputStreamOpen);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(fromStream4, 0, fromStream4.length);
        Intrinsics.checkNotNull(bitmapDecodeByteArray);
        return bitmapDecodeByteArray;
    }

    public static final String getCurrentLanguage(Context context, Iterable<String> allowedLanguages) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(allowedLanguages, "allowedLanguages");
        String language = context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        if (!CollectionsKt.contains(allowedLanguages, language)) {
            return (String) CollectionsKt.first(allowedLanguages);
        }
        Intrinsics.checkNotNull(language);
        return language;
    }

    public static final String getCurrentLanguage(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        String language = context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        return language;
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
        Log.d(TAG, "dictionary " + fileName + " is loaded, size: " + map.size() + ' ');
        return map;
    }

    public static /* synthetic */ Set filterSetByActualKeys$default(Set set, Set set2, Logger logger, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            logger = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        return filterSetByActualKeys(set, set2, logger, str);
    }

    public static final Set<String> filterSetByActualKeys(Set<String> dictionary, Set<String> actualKeys, Logger logger, String str) {
        Intrinsics.checkNotNullParameter(dictionary, "dictionary");
        Intrinsics.checkNotNullParameter(actualKeys, "actualKeys");
        if (logger != null) {
            for (String str2 : actualKeys) {
                if (!dictionary.contains(str2)) {
                    logger.addLogMessage(str, "key: " + str2 + " not found in the dictionary");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : dictionary) {
            if (actualKeys.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.toSet(arrayList);
    }

    public static /* synthetic */ Map filterDictionaryByActualKeys$default(Map map, Set set, Logger logger, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            logger = null;
        }
        if ((i & 8) != 0) {
            str = null;
        }
        return filterDictionaryByActualKeys(map, set, logger, str);
    }

    public static final <T> Map<String, T> filterDictionaryByActualKeys(Map<String, ? extends T> dictionary, Set<String> actualKeys, Logger logger, String str) {
        Intrinsics.checkNotNullParameter(dictionary, "dictionary");
        Intrinsics.checkNotNullParameter(actualKeys, "actualKeys");
        if (logger != null) {
            for (String str2 : actualKeys) {
                if (!dictionary.containsKey(str2)) {
                    logger.addLogMessage(str, "key: " + str2 + " not found in the dictionary");
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends T> entry : dictionary.entrySet()) {
            if (actualKeys.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final Bitmap bitmapFromBase64String(String base64String) {
        Intrinsics.checkNotNullParameter(base64String, "base64String");
        byte[] bArrDecode = Base64.decode(base64String, 0);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeByteArray, "decodeByteArray(...)");
        return bitmapDecodeByteArray;
    }

    public static final String bitmapToBase64String(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public static /* synthetic */ byte[] toByteArray$default(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        return toByteArray(bitmap, compressFormat);
    }

    public static final byte[] toByteArray(Bitmap bitmap, Bitmap.CompressFormat format) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(format, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static final void forEachJsonObject(JSONArray jSONArray, Function1<? super JSONObject, Unit> action) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            action.invoke(jSONObject);
        }
    }

    public static final void forEachJsonObject(JSONObject jSONObject, Function2<? super String, ? super JSONObject, Unit> action) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Intrinsics.checkNotNull(next);
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
            action.invoke(next, jSONObject2);
        }
    }

    public static final void forEachString(JSONObject jSONObject, Function2<? super String, ? super String, Unit> action) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Intrinsics.checkNotNull(next);
            String string = jSONObject.getString(next);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            action.invoke(next, string);
        }
    }

    public static final Size getSize(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "<this>");
        return new Size(bitmap.getWidth(), bitmap.getHeight());
    }

    public static final Bitmap drawableToBitmap(Context context, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable drawable = AppCompatResources.getDrawable(context, i);
        Intrinsics.checkNotNull(drawable);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.setTint(i2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(i3);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }
}
