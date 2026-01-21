package com.smartengines.engine.doc;

import android.graphics.Rect;
import androidx.autofill.HintConstants;
import com.google.android.gms.common.internal.ImagesContract;
import com.smartengines.engine.Geometry;
import com.smartengines.utils.UtilsKt;
import com.smartengines.visualization.QuadPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DocResultJson.kt */
@Metadata(m513d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0001\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0001\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\b\u001a\n\u0010\t\u001a\u00020\b*\u00020\u0001\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\n\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\u0001\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\f\u001a\n\u0010\r\u001a\u00020\f*\u00020\u0001\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u000e\u001a\n\u0010\u000f\u001a\u00020\u000e*\u00020\u0001¨\u0006\u0010"}, m514d2 = {"toJson", "Lorg/json/JSONObject;", "Lcom/smartengines/engine/doc/DocResultData;", "toDocResultData", "Lcom/smartengines/engine/doc/DocumentData;", "toDocumentData", "Lcom/smartengines/engine/doc/TextField;", "toTextField", "Lcom/smartengines/engine/doc/TableField;", "toTableField", "Lcom/smartengines/engine/doc/FieldInfo;", "toFieldInfo", "Lcom/smartengines/engine/doc/DocName;", "toDocName", "Lcom/smartengines/engine/Geometry;", "toGeometry", "engine_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class DocResultJsonKt {
    public static final JSONObject toJson(DocResultData docResultData) throws JSONException {
        Intrinsics.checkNotNullParameter(docResultData, "<this>");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = docResultData.getDocuments().iterator();
        while (it.hasNext()) {
            jSONArray.put(toJson((DocumentData) it.next()));
        }
        Unit unit = Unit.INSTANCE;
        jSONObject.put("documents", jSONArray);
        return jSONObject;
    }

    public static final DocResultData toDocResultData(JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        final ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("documents");
        Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
        UtilsKt.forEachJsonObject(jSONArray, (Function1<? super JSONObject, Unit>) new Function1() { // from class: com.smartengines.engine.doc.DocResultJsonKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocResultJsonKt.toDocResultData$lambda$4$lambda$3(arrayList, (JSONObject) obj);
            }
        });
        return new DocResultData(arrayList, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toDocResultData$lambda$4$lambda$3(ArrayList this_apply, JSONObject it) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(it, "it");
        this_apply.add(toDocumentData(it));
        return Unit.INSTANCE;
    }

    public static final JSONObject toJson(DocumentData documentData) throws JSONException {
        Intrinsics.checkNotNullParameter(documentData, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", documentData.getId());
        jSONObject.put("type", documentData.getType());
        DocName name = documentData.getName();
        if (name != null) {
            jSONObject.put(HintConstants.AUTOFILL_HINT_NAME, toJson(name));
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, String> entry : documentData.getAttributes().entrySet()) {
            jSONObject2.put(entry.getKey(), entry.getValue());
        }
        Unit unit = Unit.INSTANCE;
        jSONObject.put("attributes", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        for (Map.Entry<String, TextField> entry2 : documentData.getTexts().entrySet()) {
            jSONObject3.put(entry2.getKey(), toJson(entry2.getValue()));
        }
        Unit unit2 = Unit.INSTANCE;
        jSONObject.put("texts", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        for (Map.Entry<String, TableField> entry3 : documentData.getTables().entrySet()) {
            jSONObject4.put(entry3.getKey(), toJson(entry3.getValue()));
        }
        Unit unit3 = Unit.INSTANCE;
        jSONObject.put("tables", jSONObject4);
        return jSONObject;
    }

    public static final DocumentData toDocumentData(JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        int i = jSONObject.getInt("id");
        String string = jSONObject.getString("type");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(HintConstants.AUTOFILL_HINT_NAME);
        DocName docName = jSONObjectOptJSONObject != null ? toDocName(jSONObjectOptJSONObject) : null;
        final HashMap map = new HashMap();
        JSONObject jSONObject2 = jSONObject.getJSONObject("attributes");
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
        UtilsKt.forEachString(jSONObject2, new Function2() { // from class: com.smartengines.engine.doc.DocResultJsonKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DocResultJsonKt.toDocumentData$lambda$14$lambda$13(map, (String) obj, (String) obj2);
            }
        });
        Unit unit = Unit.INSTANCE;
        final HashMap map2 = new HashMap();
        JSONObject jSONObject3 = jSONObject.getJSONObject("texts");
        Intrinsics.checkNotNullExpressionValue(jSONObject3, "getJSONObject(...)");
        UtilsKt.forEachJsonObject(jSONObject3, (Function2<? super String, ? super JSONObject, Unit>) new Function2() { // from class: com.smartengines.engine.doc.DocResultJsonKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DocResultJsonKt.toDocumentData$lambda$16$lambda$15(map2, (String) obj, (JSONObject) obj2);
            }
        });
        Unit unit2 = Unit.INSTANCE;
        HashMap map3 = map2;
        final HashMap map4 = new HashMap();
        JSONObject jSONObject4 = jSONObject.getJSONObject("tables");
        Intrinsics.checkNotNullExpressionValue(jSONObject4, "getJSONObject(...)");
        UtilsKt.forEachJsonObject(jSONObject4, (Function2<? super String, ? super JSONObject, Unit>) new Function2() { // from class: com.smartengines.engine.doc.DocResultJsonKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DocResultJsonKt.toDocumentData$lambda$18$lambda$17(map4, (String) obj, (JSONObject) obj2);
            }
        });
        Unit unit3 = Unit.INSTANCE;
        return new DocumentData(i, string, docName, map, map3, map4, MapsKt.emptyMap(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toDocumentData$lambda$14$lambda$13(HashMap this_apply, String key, String value) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this_apply.put(key, value);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toDocumentData$lambda$16$lambda$15(HashMap this_apply, String key, JSONObject value) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this_apply.put(key, toTextField(value));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toDocumentData$lambda$18$lambda$17(HashMap this_apply, String key, JSONObject value) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this_apply.put(key, toTableField(value));
        return Unit.INSTANCE;
    }

    public static final JSONObject toJson(TextField textField) throws JSONException {
        Intrinsics.checkNotNullParameter(textField, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("info", toJson(textField.getInfo()));
        jSONObject.put("value", textField.getValue());
        return jSONObject;
    }

    public static final TextField toTextField(JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        JSONObject jSONObject2 = jSONObject.getJSONObject("info");
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
        FieldInfo fieldInfo = toFieldInfo(jSONObject2);
        String string = jSONObject.getString("value");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new TextField(fieldInfo, string);
    }

    public static final JSONObject toJson(TableField tableField) throws JSONException {
        Intrinsics.checkNotNullParameter(tableField, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("info", toJson(tableField.getInfo()));
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = tableField.getHeader().iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        Unit unit = Unit.INSTANCE;
        jSONObject.put("header", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        Iterator<T> it2 = tableField.getRows().iterator();
        while (it2.hasNext()) {
            List list = (List) it2.next();
            JSONArray jSONArray3 = new JSONArray();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                jSONArray3.put(toJson((TextField) it3.next()));
            }
            jSONArray2.put(jSONArray3);
        }
        Unit unit2 = Unit.INSTANCE;
        jSONObject.put("rows", jSONArray2);
        return jSONObject;
    }

    public static final TableField toTableField(JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        JSONObject jSONObject2 = jSONObject.getJSONObject("info");
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
        FieldInfo fieldInfo = toFieldInfo(jSONObject2);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("header");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        JSONArray jSONArray2 = jSONObject.getJSONArray("rows");
        int length2 = jSONArray2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            ArrayList arrayList4 = new ArrayList();
            JSONArray jSONArray3 = jSONArray2.getJSONArray(i2);
            int length3 = jSONArray3.length();
            for (int i3 = 0; i3 < length3; i3++) {
                JSONObject jSONObject3 = jSONArray3.getJSONObject(i3);
                Intrinsics.checkNotNullExpressionValue(jSONObject3, "getJSONObject(...)");
                arrayList4.add(toTextField(jSONObject3));
            }
            arrayList3.add(arrayList4);
        }
        Unit unit = Unit.INSTANCE;
        return new TableField(fieldInfo, arrayList2, arrayList3);
    }

    public static final JSONObject toJson(FieldInfo fieldInfo) throws JSONException {
        Intrinsics.checkNotNullParameter(fieldInfo, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", fieldInfo.getKey());
        DocName name = fieldInfo.getName();
        if (name != null) {
            jSONObject.put(HintConstants.AUTOFILL_HINT_NAME, toJson(name));
        }
        jSONObject.put("confidence", fieldInfo.getConfidence());
        jSONObject.put("isAccepted", fieldInfo.isAccepted());
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, String> entry : fieldInfo.getAttributes().entrySet()) {
            jSONObject2.put(entry.getKey(), entry.getValue());
        }
        Unit unit = Unit.INSTANCE;
        jSONObject.put("attributes", jSONObject2);
        return jSONObject;
    }

    public static final FieldInfo toFieldInfo(JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        String string = jSONObject.getString("key");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(HintConstants.AUTOFILL_HINT_NAME);
        DocName docName = jSONObjectOptJSONObject != null ? toDocName(jSONObjectOptJSONObject) : null;
        double d = jSONObject.getDouble("confidence");
        boolean z = jSONObject.getBoolean("isAccepted");
        HashMap map = new HashMap();
        JSONObject jSONObject2 = jSONObject.getJSONObject("attributes");
        Iterator<String> itKeys = jSONObject2.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject2.getString(next));
        }
        Unit unit = Unit.INSTANCE;
        return new FieldInfo(string, docName, d, z, map);
    }

    public static final JSONObject toJson(DocName docName) throws JSONException {
        Intrinsics.checkNotNullParameter(docName, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("default", docName.getDefault());
        jSONObject.put(ImagesContract.LOCAL, docName.getLocal());
        jSONObject.put("shortLocal", docName.getShortLocal());
        return jSONObject;
    }

    public static final DocName toDocName(JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        String string = jSONObject.getString("default");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = jSONObject.getString(ImagesContract.LOCAL);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = jSONObject.getString("shortLocal");
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return new DocName(string, string2, string3);
    }

    public static final JSONObject toJson(Geometry geometry) throws JSONException {
        Intrinsics.checkNotNullParameter(geometry, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sceneId", geometry.getSceneId());
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = geometry.getPoints().iterator();
        while (it.hasNext()) {
            jSONArray.put(((QuadPoint) it.next()).getJson());
        }
        Unit unit = Unit.INSTANCE;
        jSONObject.put("points", jSONArray);
        return jSONObject;
    }

    public static final Geometry toGeometry(JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        int i = jSONObject.getInt("sceneId");
        final ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("points");
        Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
        UtilsKt.forEachJsonObject(jSONArray, (Function1<? super JSONObject, Unit>) new Function1() { // from class: com.smartengines.engine.doc.DocResultJsonKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocResultJsonKt.toGeometry$lambda$45$lambda$44(arrayList, (JSONObject) obj);
            }
        });
        Unit unit = Unit.INSTANCE;
        return new Geometry(i, arrayList, new Rect());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toGeometry$lambda$45$lambda$44(ArrayList this_apply, JSONObject it) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(it, "it");
        this_apply.add(new QuadPoint(it));
        return Unit.INSTANCE;
    }
}
