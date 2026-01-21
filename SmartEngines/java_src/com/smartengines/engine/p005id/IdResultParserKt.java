package com.smartengines.engine.p005id;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Log;
import com.smartengines.common.Image;
import com.smartengines.common.Quadrangle;
import com.smartengines.common.QuadranglesMapIterator;
import com.smartengines.common.Rectangle;
import com.smartengines.common.StringsMapIterator;
import com.smartengines.engine.EngineUtilsKt;
import com.smartengines.p006id.IdBaseFieldInfo;
import com.smartengines.p006id.IdCheckField;
import com.smartengines.p006id.IdCheckFieldsMapIterator;
import com.smartengines.p006id.IdImageField;
import com.smartengines.p006id.IdImageFieldsMapIterator;
import com.smartengines.p006id.IdResult;
import com.smartengines.p006id.IdTemplateDetectionResult;
import com.smartengines.p006id.IdTemplateSegmentationResult;
import com.smartengines.p006id.IdTextField;
import com.smartengines.p006id.IdTextFieldsMapIterator;
import com.smartengines.visualization.Quad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdResultParser.kt */
@Metadata(m513d1 = {"\u0000L\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006\u001a\u0016\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u0004\u001a:\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006\u001a\u0010\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\u00020\u000f\u001a\f\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0002\u001a\f\u0010\u0013\u001a\u00020\u0014*\u00020\u0015H\u0002\u001a\"\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002\u001a\u0010\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\r*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m514d2 = {"TAG", "", "parse", "Lcom/smartengines/engine/id/IdResultData;", "Lcom/smartengines/id/IdResult;", "templates", "", "Lcom/smartengines/engine/id/Template;", "parseTemplates", "mergeTemplates", "oldTemplates", "newTemplates", "parseAttributes", "", "Lcom/smartengines/engine/id/Attribute;", "Lcom/smartengines/id/IdBaseFieldInfo;", "parseTextField", "Lcom/smartengines/engine/id/TextField;", "Lcom/smartengines/id/IdTextField;", "parseCheckField", "Lcom/smartengines/engine/id/CheckField;", "Lcom/smartengines/id/IdCheckField;", "parseImageField", "Lcom/smartengines/engine/id/ImageField;", "Lcom/smartengines/id/IdImageField;", "parseForensicCheckFields", "engine_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class IdResultParserKt {
    private static final String TAG = "engine.IdResultParser";

    public static final IdResultData parse(IdResult idResult, Map<String, Template> templates) {
        Intrinsics.checkNotNullParameter(idResult, "<this>");
        Intrinsics.checkNotNullParameter(templates, "templates");
        String strGetDocumentType = idResult.GetDocumentType();
        Intrinsics.checkNotNull(strGetDocumentType);
        ArrayList arrayList = new ArrayList();
        IdTextFieldsMapIterator idTextFieldsMapIteratorTextFieldsBegin = idResult.TextFieldsBegin();
        IdTextFieldsMapIterator idTextFieldsMapIteratorTextFieldsEnd = idResult.TextFieldsEnd();
        while (!idTextFieldsMapIteratorTextFieldsBegin.Equals(idTextFieldsMapIteratorTextFieldsEnd)) {
            IdTextField idTextFieldGetValue = idTextFieldsMapIteratorTextFieldsBegin.GetValue();
            Intrinsics.checkNotNullExpressionValue(idTextFieldGetValue, "GetValue(...)");
            arrayList.add(parseTextField(idTextFieldGetValue));
            idTextFieldsMapIteratorTextFieldsBegin.Advance();
        }
        ArrayList arrayList2 = new ArrayList();
        IdCheckFieldsMapIterator idCheckFieldsMapIteratorCheckFieldsBegin = idResult.CheckFieldsBegin();
        IdCheckFieldsMapIterator idCheckFieldsMapIteratorCheckFieldsEnd = idResult.CheckFieldsEnd();
        while (!idCheckFieldsMapIteratorCheckFieldsBegin.Equals(idCheckFieldsMapIteratorCheckFieldsEnd)) {
            IdCheckField idCheckFieldGetValue = idCheckFieldsMapIteratorCheckFieldsBegin.GetValue();
            Intrinsics.checkNotNullExpressionValue(idCheckFieldGetValue, "GetValue(...)");
            arrayList2.add(parseCheckField(idCheckFieldGetValue));
            idCheckFieldsMapIteratorCheckFieldsBegin.Advance();
        }
        ArrayList arrayList3 = new ArrayList();
        IdImageFieldsMapIterator idImageFieldsMapIteratorImageFieldsBegin = idResult.ImageFieldsBegin();
        IdImageFieldsMapIterator idImageFieldsMapIteratorImageFieldsEnd = idResult.ImageFieldsEnd();
        while (!idImageFieldsMapIteratorImageFieldsBegin.Equals(idImageFieldsMapIteratorImageFieldsEnd)) {
            try {
                IdImageField idImageFieldGetValue = idImageFieldsMapIteratorImageFieldsBegin.GetValue();
                Intrinsics.checkNotNullExpressionValue(idImageFieldGetValue, "GetValue(...)");
                arrayList3.add(parseImageField(idImageFieldGetValue, templates));
            } catch (Exception e) {
                Log.e(TAG, "IdResult.parseImages", e);
            }
            idImageFieldsMapIteratorImageFieldsBegin.Advance();
        }
        ArrayList arrayList4 = new ArrayList();
        IdTextFieldsMapIterator idTextFieldsMapIteratorForensicTextFieldsBegin = idResult.ForensicTextFieldsBegin();
        IdTextFieldsMapIterator idTextFieldsMapIteratorForensicTextFieldsEnd = idResult.ForensicTextFieldsEnd();
        while (!idTextFieldsMapIteratorForensicTextFieldsBegin.Equals(idTextFieldsMapIteratorForensicTextFieldsEnd)) {
            IdTextField idTextFieldGetValue2 = idTextFieldsMapIteratorForensicTextFieldsBegin.GetValue();
            Intrinsics.checkNotNullExpressionValue(idTextFieldGetValue2, "GetValue(...)");
            arrayList4.add(parseTextField(idTextFieldGetValue2));
            idTextFieldsMapIteratorForensicTextFieldsBegin.Advance();
        }
        List<CheckField> forensicCheckFields = parseForensicCheckFields(idResult);
        ArrayList arrayList5 = new ArrayList();
        IdImageFieldsMapIterator idImageFieldsMapIteratorForensicImageFieldsBegin = idResult.ForensicImageFieldsBegin();
        IdImageFieldsMapIterator idImageFieldsMapIteratorForensicImageFieldsEnd = idResult.ForensicImageFieldsEnd();
        while (!idImageFieldsMapIteratorForensicImageFieldsBegin.Equals(idImageFieldsMapIteratorForensicImageFieldsEnd)) {
            try {
                IdImageField idImageFieldGetValue2 = idImageFieldsMapIteratorForensicImageFieldsBegin.GetValue();
                Intrinsics.checkNotNullExpressionValue(idImageFieldGetValue2, "GetValue(...)");
                arrayList5.add(parseImageField(idImageFieldGetValue2, templates));
            } catch (Exception e2) {
                Log.e(TAG, "IdResult.parseForensicImages", e2);
            }
            idImageFieldsMapIteratorForensicImageFieldsBegin.Advance();
        }
        return new IdResultData(strGetDocumentType, arrayList, arrayList2, arrayList3, forensicCheckFields, arrayList4, arrayList5, templates);
    }

    public static final Map<String, Template> parseTemplates(IdResult idResult) {
        Intrinsics.checkNotNullParameter(idResult, "<this>");
        HashMap map = new HashMap();
        int iGetTemplateDetectionResultsCount = idResult.GetTemplateDetectionResultsCount();
        for (int i = 0; i < iGetTemplateDetectionResultsCount; i++) {
            IdTemplateDetectionResult idTemplateDetectionResultGetTemplateDetectionResult = idResult.GetTemplateDetectionResult(i);
            String strGetTemplateName = idTemplateDetectionResultGetTemplateDetectionResult.GetTemplateName();
            Intrinsics.checkNotNullExpressionValue(strGetTemplateName, "GetTemplateName(...)");
            Quadrangle quadrangleGetQuadrangle = idTemplateDetectionResultGetTemplateDetectionResult.GetQuadrangle();
            Intrinsics.checkNotNullExpressionValue(quadrangleGetQuadrangle, "GetQuadrangle(...)");
            Quad quad = EngineUtilsKt.toQuad(quadrangleGetQuadrangle);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            IdTemplateSegmentationResult idTemplateSegmentationResultGetTemplateSegmentationResult = idResult.GetTemplateSegmentationResult(i);
            QuadranglesMapIterator quadranglesMapIteratorRawFieldQuadranglesBegin = idTemplateSegmentationResultGetTemplateSegmentationResult.RawFieldQuadranglesBegin();
            QuadranglesMapIterator quadranglesMapIteratorRawFieldQuadranglesEnd = idTemplateSegmentationResultGetTemplateSegmentationResult.RawFieldQuadranglesEnd();
            while (!quadranglesMapIteratorRawFieldQuadranglesBegin.Equals(quadranglesMapIteratorRawFieldQuadranglesEnd)) {
                String strGetKey = quadranglesMapIteratorRawFieldQuadranglesBegin.GetKey();
                Intrinsics.checkNotNullExpressionValue(strGetKey, "GetKey(...)");
                Quadrangle quadrangleGetValue = quadranglesMapIteratorRawFieldQuadranglesBegin.GetValue();
                Intrinsics.checkNotNullExpressionValue(quadrangleGetValue, "GetValue(...)");
                linkedHashMap.put(strGetKey, EngineUtilsKt.toQuad(quadrangleGetValue));
                quadranglesMapIteratorRawFieldQuadranglesBegin.Advance();
            }
            Unit unit = Unit.INSTANCE;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            IdTemplateSegmentationResult idTemplateSegmentationResultGetTemplateSegmentationResult2 = idResult.GetTemplateSegmentationResult(i);
            QuadranglesMapIterator quadranglesMapIteratorRawFieldTemplateQuadranglesBegin = idTemplateSegmentationResultGetTemplateSegmentationResult2.RawFieldTemplateQuadranglesBegin();
            QuadranglesMapIterator quadranglesMapIteratorRawFieldTemplateQuadranglesEnd = idTemplateSegmentationResultGetTemplateSegmentationResult2.RawFieldTemplateQuadranglesEnd();
            while (!quadranglesMapIteratorRawFieldTemplateQuadranglesBegin.Equals(quadranglesMapIteratorRawFieldTemplateQuadranglesEnd)) {
                String strGetKey2 = quadranglesMapIteratorRawFieldTemplateQuadranglesBegin.GetKey();
                Intrinsics.checkNotNullExpressionValue(strGetKey2, "GetKey(...)");
                Rectangle rectangleGetBoundingRectangle = quadranglesMapIteratorRawFieldTemplateQuadranglesBegin.GetValue().GetBoundingRectangle();
                Intrinsics.checkNotNullExpressionValue(rectangleGetBoundingRectangle, "GetBoundingRectangle(...)");
                linkedHashMap2.put(strGetKey2, rectangleGetBoundingRectangle);
                quadranglesMapIteratorRawFieldTemplateQuadranglesBegin.Advance();
            }
            Unit unit2 = Unit.INSTANCE;
            Template template = new Template(strGetTemplateName, quad, linkedHashMap, linkedHashMap2);
            map.put(template.getName(), template);
        }
        return map;
    }

    public static final Map<String, Template> mergeTemplates(Map<String, Template> oldTemplates, Map<String, Template> newTemplates) {
        Intrinsics.checkNotNullParameter(oldTemplates, "oldTemplates");
        Intrinsics.checkNotNullParameter(newTemplates, "newTemplates");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : SetsKt.plus((Set) oldTemplates.keySet(), (Iterable) newTemplates.keySet())) {
            Template templateCopy$default = newTemplates.get(str);
            Template template = oldTemplates.get(str);
            if (templateCopy$default == null) {
                Intrinsics.checkNotNull(template);
                templateCopy$default = template;
            } else if (template != null) {
                templateCopy$default = Template.copy$default(templateCopy$default, null, null, null, MapsKt.plus(template.getFieldTemplateRectangles(), templateCopy$default.getFieldTemplateRectangles()), 7, null);
            }
            linkedHashMap.put(str, templateCopy$default);
        }
        return linkedHashMap;
    }

    public static final List<Attribute> parseAttributes(IdBaseFieldInfo idBaseFieldInfo) {
        Intrinsics.checkNotNullParameter(idBaseFieldInfo, "<this>");
        ArrayList arrayList = new ArrayList();
        StringsMapIterator stringsMapIteratorAttributesBegin = idBaseFieldInfo.AttributesBegin();
        StringsMapIterator stringsMapIteratorAttributesEnd = idBaseFieldInfo.AttributesEnd();
        while (!stringsMapIteratorAttributesBegin.Equals(stringsMapIteratorAttributesEnd)) {
            String strGetKey = stringsMapIteratorAttributesBegin.GetKey();
            Intrinsics.checkNotNullExpressionValue(strGetKey, "GetKey(...)");
            String strGetValue = stringsMapIteratorAttributesBegin.GetValue();
            Intrinsics.checkNotNullExpressionValue(strGetValue, "GetValue(...)");
            arrayList.add(new Attribute(strGetKey, strGetValue));
            stringsMapIteratorAttributesBegin.Advance();
        }
        return arrayList;
    }

    private static final TextField parseTextField(IdTextField idTextField) {
        IdBaseFieldInfo idBaseFieldInfoGetBaseFieldInfo = idTextField.GetBaseFieldInfo();
        String strGetName = idTextField.GetName();
        Intrinsics.checkNotNullExpressionValue(strGetName, "GetName(...)");
        String strGetCStr = idTextField.GetValue().GetFirstString().GetCStr();
        Intrinsics.checkNotNullExpressionValue(strGetCStr, "GetCStr(...)");
        boolean zGetIsAccepted = idBaseFieldInfoGetBaseFieldInfo.GetIsAccepted();
        Intrinsics.checkNotNull(idBaseFieldInfoGetBaseFieldInfo);
        return new TextField(strGetName, strGetCStr, zGetIsAccepted, parseAttributes(idBaseFieldInfoGetBaseFieldInfo));
    }

    private static final CheckField parseCheckField(IdCheckField idCheckField) {
        CheckStatus checkStatus;
        IdBaseFieldInfo idBaseFieldInfoGetBaseFieldInfo = idCheckField.GetBaseFieldInfo();
        String strGetName = idCheckField.GetName();
        Intrinsics.checkNotNullExpressionValue(strGetName, "GetName(...)");
        int iSwigValue = idCheckField.GetValue().swigValue();
        if (iSwigValue == 0) {
            checkStatus = CheckStatus.UNDEFINED;
        } else if (iSwigValue == 1) {
            checkStatus = CheckStatus.PASSED;
        } else if (iSwigValue == 2) {
            checkStatus = CheckStatus.FAILED;
        } else {
            Log.e(TAG, "wrong IdCheckField value");
            checkStatus = CheckStatus.UNDEFINED;
        }
        Intrinsics.checkNotNull(idBaseFieldInfoGetBaseFieldInfo);
        return new CheckField(strGetName, checkStatus, parseAttributes(idBaseFieldInfoGetBaseFieldInfo));
    }

    private static final ImageField parseImageField(IdImageField idImageField, Map<String, Template> map) {
        Object next;
        Template template;
        Map<String, Rectangle> fieldTemplateRectangles;
        String strGetName = idImageField.GetName();
        IdBaseFieldInfo idBaseFieldInfoGetBaseFieldInfo = idImageField.GetBaseFieldInfo();
        Intrinsics.checkNotNull(idBaseFieldInfoGetBaseFieldInfo);
        List<Attribute> attributes = parseAttributes(idBaseFieldInfoGetBaseFieldInfo);
        Image imageGetValue = idImageField.GetValue();
        Iterator<T> it = attributes.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Attribute attribute = (Attribute) next;
            if (Intrinsics.areEqual(attribute.getKey(), "TemplateImage") && Intrinsics.areEqual(attribute.getValue(), "true")) {
                break;
            }
        }
        if (next != null && map != null && (template = map.get(strGetName)) != null && (fieldTemplateRectangles = template.getFieldTemplateRectangles()) != null) {
            for (Map.Entry<String, Rectangle> entry : fieldTemplateRectangles.entrySet()) {
                String key = entry.getKey();
                Rectangle value = entry.getValue();
                try {
                    imageGetValue.Mask(value, 5);
                } catch (Exception e) {
                    Log.e(TAG, "IdResult.parseImageField template=" + strGetName + "  field=" + key + "  image size=" + imageGetValue.GetWidth() + 'x' + imageGetValue.GetHeight() + " quad=" + EngineUtilsKt.toQuad(value), e);
                }
            }
        }
        byte[] bArrDecode = Base64.decode(imageGetValue.GetBase64String().GetCStr(), 0);
        Intrinsics.checkNotNull(strGetName);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeByteArray, "decodeByteArray(...)");
        return new ImageField(strGetName, bitmapDecodeByteArray, idBaseFieldInfoGetBaseFieldInfo.GetIsAccepted(), parseAttributes(idBaseFieldInfoGetBaseFieldInfo));
    }

    public static final List<CheckField> parseForensicCheckFields(IdResult idResult) {
        Intrinsics.checkNotNullParameter(idResult, "<this>");
        ArrayList arrayList = new ArrayList();
        IdCheckFieldsMapIterator idCheckFieldsMapIteratorForensicCheckFieldsBegin = idResult.ForensicCheckFieldsBegin();
        IdCheckFieldsMapIterator idCheckFieldsMapIteratorForensicCheckFieldsEnd = idResult.ForensicCheckFieldsEnd();
        while (!idCheckFieldsMapIteratorForensicCheckFieldsBegin.Equals(idCheckFieldsMapIteratorForensicCheckFieldsEnd)) {
            IdCheckField idCheckFieldGetValue = idCheckFieldsMapIteratorForensicCheckFieldsBegin.GetValue();
            Intrinsics.checkNotNullExpressionValue(idCheckFieldGetValue, "GetValue(...)");
            arrayList.add(parseCheckField(idCheckFieldGetValue));
            idCheckFieldsMapIteratorForensicCheckFieldsBegin.Advance();
        }
        return arrayList;
    }
}
