package com.smartengines.engine.doc;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Log;
import com.smartengines.common.Image;
import com.smartengines.common.OcrString;
import com.smartengines.common.Polygon;
import com.smartengines.common.StringsMapIterator;
import com.smartengines.doc.DocBaseFieldInfo;
import com.smartengines.doc.DocBaseObjectInfo;
import com.smartengines.doc.DocBasicObjectsIterator;
import com.smartengines.doc.DocImageField;
import com.smartengines.doc.DocImageFieldsIterator;
import com.smartengines.doc.DocPhysicalDocument;
import com.smartengines.doc.DocPhysicalPage;
import com.smartengines.doc.DocResult;
import com.smartengines.doc.DocTableField;
import com.smartengines.doc.DocTableFieldsIterator;
import com.smartengines.doc.DocTextField;
import com.smartengines.doc.DocTextFieldsIterator;
import com.smartengines.doc.DocTextObject;
import com.smartengines.doc.DocTextObjectsIterator;
import com.smartengines.doc.DocViewsSliceIterator;
import com.smartengines.doc.Document;
import com.smartengines.doc.DocumentsIterator;
import com.smartengines.engine.Geometry;
import com.smartengines.engine.GeometryKt;
import com.smartengines.engine.ImageFactory;
import com.smartengines.utils.UtilsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DocResultParser.kt */
@Metadata(m513d1 = {"\u0000~\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u001a \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u001a\u0018\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\t*\u00020\rH\u0002\u001a\u0018\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\t*\u00020\u000eH\u0002\u001a\f\u0010\u0002\u001a\u00020\u000f*\u00020\u000eH\u0002\u001a\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0014H\u0002\u001a\u0018\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\t*\u00020\rH\u0002\u001a\f\u0010\u0002\u001a\u00020\u0016*\u00020\u0017H\u0002\u001a\u0018\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00190\t*\u00020\rH\u0002\u001a\f\u0010\u0002\u001a\u00020\u0019*\u00020\u001aH\u0002\u001a\u0018\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001c0\t*\u00020\rH\u0002\u001a\f\u0010\u0002\u001a\u00020\u001c*\u00020\u001dH\u0002\u001a\u000e\u0010\u001e\u001a\u0004\u0018\u00010\u0007*\u00020\u0004H\u0002\u001a(\u0010\u0002\u001a\u00020\u001f*\u00020\u00122\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010!H\u0002\u001a0\u0010\u0002\u001a\u00020\"*\u00020#2\u0006\u0010$\u001a\u00020%2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010!H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006&"}, m514d2 = {"TAG", "", "parse", "Lcom/smartengines/engine/doc/DocResultData;", "Lcom/smartengines/doc/DocResult;", "processedImages", "", "Landroid/graphics/Bitmap;", "parseMap", "", "Lcom/smartengines/common/StringsMapIterator;", "end", "parseAttributes", "Lcom/smartengines/doc/Document;", "Lcom/smartengines/doc/DocBaseFieldInfo;", "Lcom/smartengines/engine/doc/FieldInfo;", "parseFieldGeometries", "Lcom/smartengines/engine/Geometry;", "Lcom/smartengines/doc/DocPhysicalDocument;", "fieldKey", "Lcom/smartengines/common/OcrString;", "parseTextFields", "Lcom/smartengines/engine/doc/TextField;", "Lcom/smartengines/doc/DocTextField;", "parseTableFields", "Lcom/smartengines/engine/doc/TableField;", "Lcom/smartengines/doc/DocTableField;", "parseImageFields", "Lcom/smartengines/engine/doc/ImageField;", "Lcom/smartengines/doc/DocImageField;", "parseCropBitmap", "Lcom/smartengines/engine/doc/PhysicalDocumentData;", "fieldIds", "", "Lcom/smartengines/engine/doc/PhysicalPageData;", "Lcom/smartengines/doc/DocPhysicalPage;", "pageId", "", "engine_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class DocResultParserKt {
    private static final String TAG = "engine.DocResultParser";

    public static final DocResultData parse(DocResult docResult, List<Bitmap> processedImages) {
        Intrinsics.checkNotNullParameter(docResult, "<this>");
        Intrinsics.checkNotNullParameter(processedImages, "processedImages");
        ArrayList arrayList = new ArrayList();
        DocumentsIterator documentsIteratorDocumentsBegin = docResult.DocumentsBegin();
        DocumentsIterator documentsIteratorDocumentsEnd = docResult.DocumentsEnd();
        while (!documentsIteratorDocumentsBegin.Equals(documentsIteratorDocumentsEnd)) {
            Document documentGetDocument = documentsIteratorDocumentsBegin.GetDocument();
            int iGetPhysicalDocIdx = documentGetDocument.GetPhysicalDocIdx();
            DocPhysicalDocument docPhysicalDocumentGetPhysicalDocument = docResult.GetPhysicalDocument(iGetPhysicalDocIdx);
            Intrinsics.checkNotNull(documentGetDocument);
            Map<String, TextField> textFields = parseTextFields(documentGetDocument);
            Map<String, TableField> tableFields = parseTableFields(documentGetDocument);
            Map<String, ImageField> imageFields = parseImageFields(documentGetDocument);
            String strGetType = documentGetDocument.GetType();
            Intrinsics.checkNotNullExpressionValue(strGetType, "GetType(...)");
            Map<String, String> attributes = parseAttributes(documentGetDocument);
            Intrinsics.checkNotNull(docPhysicalDocumentGetPhysicalDocument);
            arrayList.add(new DocumentData(iGetPhysicalDocIdx, strGetType, null, attributes, textFields, tableFields, imageFields, parse(docPhysicalDocumentGetPhysicalDocument, processedImages, SetsKt.plus(SetsKt.plus((Set) textFields.keySet(), (Iterable) imageFields.keySet()), (Iterable) tableFields.keySet()))));
            documentsIteratorDocumentsBegin.Advance();
        }
        DocResultData docResultData = new DocResultData(arrayList, processedImages);
        Log.d(TAG, "DocResult, documents.size: " + docResultData.getDocuments().size());
        return docResultData;
    }

    private static final Map<String, String> parseMap(StringsMapIterator stringsMapIterator, StringsMapIterator stringsMapIterator2) {
        HashMap map = new HashMap();
        while (!stringsMapIterator.Equals(stringsMapIterator2)) {
            map.put(stringsMapIterator.GetKey(), stringsMapIterator.GetValue());
            stringsMapIterator.Advance();
        }
        return map;
    }

    private static final Map<String, String> parseAttributes(Document document) {
        StringsMapIterator stringsMapIteratorAttributesBegin = document.AttributesBegin();
        Intrinsics.checkNotNullExpressionValue(stringsMapIteratorAttributesBegin, "AttributesBegin(...)");
        StringsMapIterator stringsMapIteratorAttributesEnd = document.AttributesEnd();
        Intrinsics.checkNotNullExpressionValue(stringsMapIteratorAttributesEnd, "AttributesEnd(...)");
        return parseMap(stringsMapIteratorAttributesBegin, stringsMapIteratorAttributesEnd);
    }

    private static final Map<String, String> parseAttributes(DocBaseFieldInfo docBaseFieldInfo) {
        StringsMapIterator stringsMapIteratorAttributesBegin = docBaseFieldInfo.AttributesBegin();
        Intrinsics.checkNotNullExpressionValue(stringsMapIteratorAttributesBegin, "AttributesBegin(...)");
        StringsMapIterator stringsMapIteratorAttributesEnd = docBaseFieldInfo.AttributesEnd();
        Intrinsics.checkNotNullExpressionValue(stringsMapIteratorAttributesEnd, "AttributesEnd(...)");
        return parseMap(stringsMapIteratorAttributesBegin, stringsMapIteratorAttributesEnd);
    }

    private static final FieldInfo parse(DocBaseFieldInfo docBaseFieldInfo) throws IsFictiveException {
        String strGetName = docBaseFieldInfo.GetName();
        if (docBaseFieldInfo.IsFictive()) {
            throw new IsFictiveException("The field " + strGetName + " is fictive");
        }
        Intrinsics.checkNotNull(strGetName);
        return new FieldInfo(strGetName, null, docBaseFieldInfo.GetConfidence(), docBaseFieldInfo.GetAcceptFlag(), parseAttributes(docBaseFieldInfo));
    }

    private static final List<Geometry> parseFieldGeometries(DocPhysicalDocument docPhysicalDocument, String str) {
        ArrayList arrayList = new ArrayList();
        if (str.length() > 0) {
            int iGetPagesCount = docPhysicalDocument.GetPagesCount();
            for (int i = 0; i < iGetPagesCount; i++) {
                DocPhysicalPage docPhysicalPageGetPhysicalPage = docPhysicalDocument.GetPhysicalPage(i);
                DocBasicObjectsIterator docBasicObjectsIteratorBasicObjectsBegin = docPhysicalPageGetPhysicalPage.BasicObjectsBegin(str);
                DocBasicObjectsIterator docBasicObjectsIteratorBasicObjectsEnd = docPhysicalPageGetPhysicalPage.BasicObjectsEnd(str);
                while (!docBasicObjectsIteratorBasicObjectsBegin.Equals(docBasicObjectsIteratorBasicObjectsEnd)) {
                    Polygon polygonGetGeometryOnScene = docBasicObjectsIteratorBasicObjectsBegin.GetBasicObject().GetBaseObjectInfo().GetGeometryOnScene();
                    Intrinsics.checkNotNull(polygonGetGeometryOnScene);
                    arrayList.add(GeometryKt.toGeometry(polygonGetGeometryOnScene, docPhysicalPageGetPhysicalPage.GetSourceSceneID()));
                    docBasicObjectsIteratorBasicObjectsBegin.Advance();
                }
            }
        }
        return arrayList;
    }

    private static final String parse(OcrString ocrString) {
        String strGetCStr = ocrString.GetFirstString().GetCStr();
        Intrinsics.checkNotNullExpressionValue(strGetCStr, "GetCStr(...)");
        return strGetCStr;
    }

    private static final Map<String, TextField> parseTextFields(Document document) {
        HashMap map = new HashMap();
        DocTextFieldsIterator docTextFieldsIteratorTextFieldsBegin = document.TextFieldsBegin();
        DocTextFieldsIterator docTextFieldsIteratorTextFieldsEnd = document.TextFieldsEnd();
        while (!docTextFieldsIteratorTextFieldsBegin.Equals(docTextFieldsIteratorTextFieldsEnd)) {
            String strGetKey = docTextFieldsIteratorTextFieldsBegin.GetKey();
            try {
                DocTextField docTextFieldGetField = docTextFieldsIteratorTextFieldsBegin.GetField();
                Intrinsics.checkNotNullExpressionValue(docTextFieldGetField, "GetField(...)");
                map.put(strGetKey, parse(docTextFieldGetField));
            } catch (IsFictiveException unused) {
                Log.e(TAG, "text field \"" + strGetKey + "\" is fictive, so ignored");
            }
            docTextFieldsIteratorTextFieldsBegin.Advance();
        }
        return map;
    }

    private static final TextField parse(DocTextField docTextField) throws IsFictiveException {
        DocBaseFieldInfo docBaseFieldInfoGetBaseFieldInfo = docTextField.GetBaseFieldInfo();
        Intrinsics.checkNotNullExpressionValue(docBaseFieldInfoGetBaseFieldInfo, "GetBaseFieldInfo(...)");
        FieldInfo fieldInfo = parse(docBaseFieldInfoGetBaseFieldInfo);
        OcrString ocrStringGetOcrString = docTextField.GetOcrString();
        Intrinsics.checkNotNullExpressionValue(ocrStringGetOcrString, "GetOcrString(...)");
        return new TextField(fieldInfo, parse(ocrStringGetOcrString));
    }

    private static final Map<String, TableField> parseTableFields(Document document) {
        HashMap map = new HashMap();
        DocTableFieldsIterator docTableFieldsIteratorTableFieldsBegin = document.TableFieldsBegin();
        DocTableFieldsIterator docTableFieldsIteratorTableFieldsEnd = document.TableFieldsEnd();
        while (!docTableFieldsIteratorTableFieldsBegin.Equals(docTableFieldsIteratorTableFieldsEnd)) {
            while (!docTableFieldsIteratorTableFieldsBegin.Equals(docTableFieldsIteratorTableFieldsEnd)) {
                String strGetKey = docTableFieldsIteratorTableFieldsBegin.GetKey();
                try {
                    DocTableField docTableFieldGetField = docTableFieldsIteratorTableFieldsBegin.GetField();
                    Intrinsics.checkNotNullExpressionValue(docTableFieldGetField, "GetField(...)");
                    map.put(strGetKey, parse(docTableFieldGetField));
                } catch (IsFictiveException unused) {
                    Log.e(TAG, "table field \"" + strGetKey + "\" is fictive, so ignored");
                }
                docTableFieldsIteratorTableFieldsBegin.Advance();
            }
        }
        return map;
    }

    private static final TableField parse(DocTableField docTableField) throws IsFictiveException {
        int iGetColsCount = docTableField.GetColsCount();
        int iGetRowsCount = docTableField.GetRowsCount();
        DocBaseFieldInfo docBaseFieldInfoGetBaseFieldInfo = docTableField.GetBaseFieldInfo();
        Intrinsics.checkNotNullExpressionValue(docBaseFieldInfoGetBaseFieldInfo, "GetBaseFieldInfo(...)");
        FieldInfo fieldInfo = parse(docBaseFieldInfoGetBaseFieldInfo);
        ArrayList arrayList = new ArrayList(iGetColsCount);
        for (int i = 0; i < iGetColsCount; i++) {
            arrayList.add(docTableField.GetColName(i));
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(iGetRowsCount);
        for (int i2 = 0; i2 < iGetRowsCount; i2++) {
            ArrayList arrayList4 = new ArrayList(iGetColsCount);
            for (int i3 = 0; i3 < iGetColsCount; i3++) {
                DocTextField docTextFieldGetCell = docTableField.GetCell(i2, i3);
                Intrinsics.checkNotNullExpressionValue(docTextFieldGetCell, "GetCell(...)");
                arrayList4.add(parse(docTextFieldGetCell));
            }
            arrayList3.add(arrayList4);
        }
        Unit unit = Unit.INSTANCE;
        return new TableField(fieldInfo, arrayList2, arrayList3);
    }

    private static final Map<String, ImageField> parseImageFields(Document document) {
        HashMap map = new HashMap();
        DocImageFieldsIterator docImageFieldsIteratorImageFieldsBegin = document.ImageFieldsBegin();
        DocImageFieldsIterator docImageFieldsIteratorImageFieldsEnd = document.ImageFieldsEnd();
        while (!docImageFieldsIteratorImageFieldsBegin.Equals(docImageFieldsIteratorImageFieldsEnd)) {
            String strGetKey = docImageFieldsIteratorImageFieldsBegin.GetKey();
            try {
                DocImageField docImageFieldGetField = docImageFieldsIteratorImageFieldsBegin.GetField();
                Intrinsics.checkNotNull(docImageFieldGetField);
                map.put(strGetKey, parse(docImageFieldGetField));
            } catch (IsFictiveException unused) {
                Log.e(TAG, "image field \"" + strGetKey + "\" is fictive, so ignored");
            } catch (Exception e) {
                Log.e(TAG, "IdResult.parseImages", e);
            }
            docImageFieldsIteratorImageFieldsBegin.Advance();
        }
        return map;
    }

    private static final ImageField parse(DocImageField docImageField) throws IsFictiveException {
        DocBaseFieldInfo docBaseFieldInfoGetBaseFieldInfo = docImageField.GetBaseFieldInfo();
        Intrinsics.checkNotNullExpressionValue(docBaseFieldInfoGetBaseFieldInfo, "GetBaseFieldInfo(...)");
        FieldInfo fieldInfo = parse(docBaseFieldInfoGetBaseFieldInfo);
        String strGetCStr = docImageField.GetImage().GetBase64String().GetCStr();
        Intrinsics.checkNotNullExpressionValue(strGetCStr, "GetCStr(...)");
        return new ImageField(fieldInfo, UtilsKt.bitmapFromBase64String(strGetCStr));
    }

    private static final Bitmap parseCropBitmap(DocResult docResult) {
        try {
            DocViewsSliceIterator docViewsSliceIteratorViewsSlice = docResult.GetGraphicalStructure().GetViewsCollection().ViewsSlice("final");
            if (docViewsSliceIteratorViewsSlice.Finished()) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(docViewsSliceIteratorViewsSlice.GetView().GetImage().GetBase64String().GetCStr(), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception e) {
            Log.e(TAG, "DocResult.parse()", e);
            return null;
        }
    }

    private static final PhysicalDocumentData parse(DocPhysicalDocument docPhysicalDocument, List<Bitmap> list, Collection<String> collection) {
        ArrayList arrayList = new ArrayList();
        int iGetPagesCount = docPhysicalDocument.GetPagesCount();
        for (int i = 0; i < iGetPagesCount; i++) {
            DocPhysicalPage docPhysicalPageGetPhysicalPage = docPhysicalDocument.GetPhysicalPage(i);
            Intrinsics.checkNotNull(docPhysicalPageGetPhysicalPage);
            arrayList.add(parse(docPhysicalPageGetPhysicalPage, i, list, collection));
        }
        return new PhysicalDocumentData(arrayList);
    }

    private static final PhysicalPageData parse(DocPhysicalPage docPhysicalPage, int i, List<Bitmap> list, Collection<String> collection) {
        Image imageGetPageImageFromScene = docPhysicalPage.GetPageImageFromScene(ImageFactory.INSTANCE.imageFromBitmap(list.get(docPhysicalPage.GetSourceSceneID())));
        HashMap map = new HashMap();
        for (String str : collection) {
            ArrayList arrayList = new ArrayList();
            DocBasicObjectsIterator docBasicObjectsIteratorBasicObjectsBegin = docPhysicalPage.BasicObjectsBegin(str);
            DocBasicObjectsIterator docBasicObjectsIteratorBasicObjectsEnd = docPhysicalPage.BasicObjectsEnd(str);
            while (!docBasicObjectsIteratorBasicObjectsBegin.Equals(docBasicObjectsIteratorBasicObjectsEnd)) {
                Polygon polygonGetGeometryOnPage = docBasicObjectsIteratorBasicObjectsBegin.GetBasicObject().GetBaseObjectInfo().GetGeometryOnPage();
                Intrinsics.checkNotNull(polygonGetGeometryOnPage);
                arrayList.add(GeometryKt.toGeometry(polygonGetGeometryOnPage, i));
                docBasicObjectsIteratorBasicObjectsBegin.Advance();
            }
            Unit unit = Unit.INSTANCE;
            map.put(str, new PhysicalFieldInfo(arrayList));
        }
        ArrayList arrayList2 = new ArrayList();
        DocTextObjectsIterator docTextObjectsIteratorGetFulltextBasicObjectsBegin = docPhysicalPage.GetFulltextBasicObjectsBegin();
        DocTextObjectsIterator docTextObjectsIteratorGetFulltextBasicObjectsEnd = docPhysicalPage.GetFulltextBasicObjectsEnd();
        while (!docTextObjectsIteratorGetFulltextBasicObjectsBegin.Equals(docTextObjectsIteratorGetFulltextBasicObjectsEnd)) {
            DocTextObject docTextObjectGetTextObject = docTextObjectsIteratorGetFulltextBasicObjectsBegin.GetTextObject();
            DocBaseObjectInfo docBaseObjectInfoGetBaseObjectInfo = docTextObjectGetTextObject.GetBaseObjectInfo();
            OcrString ocrStringGetOcrString = docTextObjectGetTextObject.GetOcrString();
            Intrinsics.checkNotNullExpressionValue(ocrStringGetOcrString, "GetOcrString(...)");
            String str2 = parse(ocrStringGetOcrString);
            Polygon polygonGetGeometryOnPage2 = docBaseObjectInfoGetBaseObjectInfo.GetGeometryOnPage();
            Intrinsics.checkNotNullExpressionValue(polygonGetGeometryOnPage2, "GetGeometryOnPage(...)");
            arrayList2.add(new BasicTextObject(str2, GeometryKt.toGeometry(polygonGetGeometryOnPage2, i), docBaseObjectInfoGetBaseObjectInfo.GetAcceptFlag()));
            docTextObjectsIteratorGetFulltextBasicObjectsBegin.Advance();
        }
        int iGetWidth = imageGetPageImageFromScene.GetWidth();
        int iGetHeight = imageGetPageImageFromScene.GetHeight();
        String strGetCStr = imageGetPageImageFromScene.GetBase64String().GetCStr();
        Intrinsics.checkNotNullExpressionValue(strGetCStr, "GetCStr(...)");
        return new PhysicalPageData(iGetWidth, iGetHeight, strGetCStr, map, arrayList2);
    }
}
