package com.smartengines.doc;

import com.smartengines.common.Image;
import com.smartengines.common.MutableString;
import com.smartengines.common.OcrString;
import com.smartengines.common.Polygon;
import com.smartengines.common.ProjectiveTransform;
import com.smartengines.common.Quadrangle;
import com.smartengines.common.Serializer;
import com.smartengines.common.Size;

/* loaded from: classes3.dex */
public class jnidocengineJNI {
    public static final native long DocBarcodeField_GetBaseFieldInfo(long j, DocBarcodeField docBarcodeField);

    public static final native long DocBarcodeField_GetDecodedString(long j, DocBarcodeField docBarcodeField);

    public static final native long DocBarcodeField_GetMutableBaseFieldInfo(long j, DocBarcodeField docBarcodeField);

    public static final native long DocBarcodeField_GetMutableDecodedString(long j, DocBarcodeField docBarcodeField);

    public static final native void DocBarcodeField_Serialize(long j, DocBarcodeField docBarcodeField, long j2, Serializer serializer);

    public static final native void DocBarcodeField_SetDecodedString(long j, DocBarcodeField docBarcodeField, long j2, MutableString mutableString);

    public static final native void DocBarcodeFieldsIterator_Advance(long j, DocBarcodeFieldsIterator docBarcodeFieldsIterator);

    public static final native boolean DocBarcodeFieldsIterator_Equals(long j, DocBarcodeFieldsIterator docBarcodeFieldsIterator, long j2, DocBarcodeFieldsIterator docBarcodeFieldsIterator2);

    public static final native long DocBarcodeFieldsIterator_GetField(long j, DocBarcodeFieldsIterator docBarcodeFieldsIterator);

    public static final native String DocBarcodeFieldsIterator_GetKey(long j, DocBarcodeFieldsIterator docBarcodeFieldsIterator);

    public static final native long DocBarcodeObject_GetDecodedString(long j, DocBarcodeObject docBarcodeObject);

    public static final native long DocBarcodeObject_GetMutableDecodedString(long j, DocBarcodeObject docBarcodeObject);

    public static final native String DocBarcodeObject_ObjectTypeStatic();

    public static final native long DocBarcodeObject_SWIGUpcast(long j);

    public static final native void DocBarcodeObject_SetDecodedString(long j, DocBarcodeObject docBarcodeObject, long j2, MutableString mutableString);

    public static final native void DocBarcodeObjectsCrossPageIterator_Advance(long j, DocBarcodeObjectsCrossPageIterator docBarcodeObjectsCrossPageIterator);

    public static final native boolean DocBarcodeObjectsCrossPageIterator_Equals(long j, DocBarcodeObjectsCrossPageIterator docBarcodeObjectsCrossPageIterator, long j2, DocBarcodeObjectsCrossPageIterator docBarcodeObjectsCrossPageIterator2);

    public static final native long DocBarcodeObjectsCrossPageIterator_GetBarcodeObject(long j, DocBarcodeObjectsCrossPageIterator docBarcodeObjectsCrossPageIterator);

    public static final native long DocBarcodeObjectsCrossPageIterator_GetBarcodeObjectPtr(long j, DocBarcodeObjectsCrossPageIterator docBarcodeObjectsCrossPageIterator);

    public static final native int DocBarcodeObjectsCrossPageIterator_GetObjectID(long j, DocBarcodeObjectsCrossPageIterator docBarcodeObjectsCrossPageIterator);

    public static final native int DocBarcodeObjectsCrossPageIterator_GetPhysicalPageID(long j, DocBarcodeObjectsCrossPageIterator docBarcodeObjectsCrossPageIterator);

    public static final native void DocBarcodeObjectsIterator_Advance(long j, DocBarcodeObjectsIterator docBarcodeObjectsIterator);

    public static final native boolean DocBarcodeObjectsIterator_Equals(long j, DocBarcodeObjectsIterator docBarcodeObjectsIterator, long j2, DocBarcodeObjectsIterator docBarcodeObjectsIterator2);

    public static final native long DocBarcodeObjectsIterator_GetBarcodeObject(long j, DocBarcodeObjectsIterator docBarcodeObjectsIterator);

    public static final native long DocBarcodeObjectsIterator_GetBarcodeObjectPtr(long j, DocBarcodeObjectsIterator docBarcodeObjectsIterator);

    public static final native long DocBaseFieldInfo_AttributesBegin(long j, DocBaseFieldInfo docBaseFieldInfo);

    public static final native long DocBaseFieldInfo_AttributesEnd(long j, DocBaseFieldInfo docBaseFieldInfo);

    public static final native void DocBaseFieldInfo_ConnectBasicObject(long j, DocBaseFieldInfo docBaseFieldInfo, int i, int i2);

    public static final native long DocBaseFieldInfo_ConnectedBarcodeObjectsBegin(long j, DocBaseFieldInfo docBaseFieldInfo, long j2, DocPhysicalDocument docPhysicalDocument);

    public static final native long DocBaseFieldInfo_ConnectedBarcodeObjectsEnd(long j, DocBaseFieldInfo docBaseFieldInfo, long j2, DocPhysicalDocument docPhysicalDocument);

    public static final native long DocBaseFieldInfo_ConnectedBasicObjectsBegin(long j, DocBaseFieldInfo docBaseFieldInfo, long j2, DocGraphicalStructure docGraphicalStructure);

    public static final native long DocBaseFieldInfo_ConnectedBasicObjectsEnd(long j, DocBaseFieldInfo docBaseFieldInfo, long j2, DocGraphicalStructure docGraphicalStructure);

    public static final native long DocBaseFieldInfo_ConnectedCheckboxObjectsBegin(long j, DocBaseFieldInfo docBaseFieldInfo, long j2, DocPhysicalDocument docPhysicalDocument);

    public static final native long DocBaseFieldInfo_ConnectedCheckboxObjectsEnd(long j, DocBaseFieldInfo docBaseFieldInfo, long j2, DocPhysicalDocument docPhysicalDocument);

    public static final native long DocBaseFieldInfo_ConnectedForensicCheckObjectsBegin(long j, DocBaseFieldInfo docBaseFieldInfo, long j2, DocPhysicalDocument docPhysicalDocument);

    public static final native long DocBaseFieldInfo_ConnectedForensicCheckObjectsEnd(long j, DocBaseFieldInfo docBaseFieldInfo, long j2, DocPhysicalDocument docPhysicalDocument);

    public static final native long DocBaseFieldInfo_ConnectedForensicObjectsBegin(long j, DocBaseFieldInfo docBaseFieldInfo, long j2, DocPhysicalDocument docPhysicalDocument);

    public static final native long DocBaseFieldInfo_ConnectedForensicObjectsEnd(long j, DocBaseFieldInfo docBaseFieldInfo, long j2, DocPhysicalDocument docPhysicalDocument);

    public static final native long DocBaseFieldInfo_ConnectedImageObjectsBegin(long j, DocBaseFieldInfo docBaseFieldInfo, long j2, DocPhysicalDocument docPhysicalDocument);

    public static final native long DocBaseFieldInfo_ConnectedImageObjectsEnd(long j, DocBaseFieldInfo docBaseFieldInfo, long j2, DocPhysicalDocument docPhysicalDocument);

    public static final native long DocBaseFieldInfo_ConnectedTableObjectsBegin(long j, DocBaseFieldInfo docBaseFieldInfo, long j2, DocPhysicalDocument docPhysicalDocument);

    public static final native long DocBaseFieldInfo_ConnectedTableObjectsEnd(long j, DocBaseFieldInfo docBaseFieldInfo, long j2, DocPhysicalDocument docPhysicalDocument);

    public static final native long DocBaseFieldInfo_ConnectedTextObjectsBegin(long j, DocBaseFieldInfo docBaseFieldInfo, long j2, DocPhysicalDocument docPhysicalDocument);

    public static final native long DocBaseFieldInfo_ConnectedTextObjectsEnd(long j, DocBaseFieldInfo docBaseFieldInfo, long j2, DocPhysicalDocument docPhysicalDocument);

    public static final native boolean DocBaseFieldInfo_GetAcceptFlag(long j, DocBaseFieldInfo docBaseFieldInfo);

    public static final native String DocBaseFieldInfo_GetAttribute(long j, DocBaseFieldInfo docBaseFieldInfo, String str);

    public static final native int DocBaseFieldInfo_GetAttributesCount(long j, DocBaseFieldInfo docBaseFieldInfo);

    public static final native double DocBaseFieldInfo_GetConfidence(long j, DocBaseFieldInfo docBaseFieldInfo);

    public static final native String DocBaseFieldInfo_GetName(long j, DocBaseFieldInfo docBaseFieldInfo);

    public static final native boolean DocBaseFieldInfo_HasAttribute(long j, DocBaseFieldInfo docBaseFieldInfo, String str);

    public static final native boolean DocBaseFieldInfo_IsFictive(long j, DocBaseFieldInfo docBaseFieldInfo);

    public static final native boolean DocBaseFieldInfo_IsValid(long j, DocBaseFieldInfo docBaseFieldInfo);

    public static final native long DocBaseFieldInfo_MutableConnectedBasicObjectsBegin(long j, DocBaseFieldInfo docBaseFieldInfo, long j2, DocGraphicalStructure docGraphicalStructure);

    public static final native long DocBaseFieldInfo_MutableConnectedBasicObjectsEnd(long j, DocBaseFieldInfo docBaseFieldInfo, long j2, DocGraphicalStructure docGraphicalStructure);

    public static final native void DocBaseFieldInfo_RemoveAttribute(long j, DocBaseFieldInfo docBaseFieldInfo, String str);

    public static final native void DocBaseFieldInfo_Serialize(long j, DocBaseFieldInfo docBaseFieldInfo, long j2, Serializer serializer);

    public static final native void DocBaseFieldInfo_SetAcceptFlag(long j, DocBaseFieldInfo docBaseFieldInfo, boolean z);

    public static final native void DocBaseFieldInfo_SetAttribute(long j, DocBaseFieldInfo docBaseFieldInfo, String str, String str2);

    public static final native void DocBaseFieldInfo_SetConfidence(long j, DocBaseFieldInfo docBaseFieldInfo, double d);

    public static final native void DocBaseFieldInfo_SetName(long j, DocBaseFieldInfo docBaseFieldInfo, String str);

    public static final native long DocBaseObjectInfo_AttributesBegin(long j, DocBaseObjectInfo docBaseObjectInfo);

    public static final native long DocBaseObjectInfo_AttributesEnd(long j, DocBaseObjectInfo docBaseObjectInfo);

    public static final native boolean DocBaseObjectInfo_GetAcceptFlag(long j, DocBaseObjectInfo docBaseObjectInfo);

    public static final native String DocBaseObjectInfo_GetAttribute(long j, DocBaseObjectInfo docBaseObjectInfo, String str);

    public static final native int DocBaseObjectInfo_GetAttributesCount(long j, DocBaseObjectInfo docBaseObjectInfo);

    public static final native double DocBaseObjectInfo_GetConfidence(long j, DocBaseObjectInfo docBaseObjectInfo);

    public static final native long DocBaseObjectInfo_GetGeometry(long j, DocBaseObjectInfo docBaseObjectInfo);

    public static final native long DocBaseObjectInfo_GetGeometryOnPage(long j, DocBaseObjectInfo docBaseObjectInfo);

    public static final native long DocBaseObjectInfo_GetGeometryOnPagePtr(long j, DocBaseObjectInfo docBaseObjectInfo);

    public static final native long DocBaseObjectInfo_GetGeometryOnScene(long j, DocBaseObjectInfo docBaseObjectInfo);

    public static final native long DocBaseObjectInfo_GetGeometryOnScenePtr(long j, DocBaseObjectInfo docBaseObjectInfo);

    public static final native long DocBaseObjectInfo_GetMutableGeometry(long j, DocBaseObjectInfo docBaseObjectInfo);

    public static final native int DocBaseObjectInfo_GetViewID(long j, DocBaseObjectInfo docBaseObjectInfo);

    public static final native boolean DocBaseObjectInfo_HasAttribute(long j, DocBaseObjectInfo docBaseObjectInfo, String str);

    public static final native void DocBaseObjectInfo_RemoveAttribute(long j, DocBaseObjectInfo docBaseObjectInfo, String str);

    public static final native void DocBaseObjectInfo_Serialize(long j, DocBaseObjectInfo docBaseObjectInfo, long j2, Serializer serializer);

    public static final native void DocBaseObjectInfo_SetAcceptFlag(long j, DocBaseObjectInfo docBaseObjectInfo, boolean z);

    public static final native void DocBaseObjectInfo_SetAttribute(long j, DocBaseObjectInfo docBaseObjectInfo, String str, String str2);

    public static final native void DocBaseObjectInfo_SetConfidence(long j, DocBaseObjectInfo docBaseObjectInfo, double d);

    public static final native void DocBaseObjectInfo_SetGeometry(long j, DocBaseObjectInfo docBaseObjectInfo, long j2, Polygon polygon);

    public static final native void DocBaseObjectInfo_SetViewID(long j, DocBaseObjectInfo docBaseObjectInfo, int i);

    public static final native String DocBasicObject_BaseClassNameStatic();

    public static final native long DocBasicObject_GetBaseObjectInfo(long j, DocBasicObject docBasicObject);

    public static final native long DocBasicObject_GetMutableBaseObjectInfo(long j, DocBasicObject docBasicObject);

    public static final native String DocBasicObject_ObjectType(long j, DocBasicObject docBasicObject);

    public static final native void DocBasicObject_Serialize(long j, DocBasicObject docBasicObject, long j2, Serializer serializer);

    public static final native void DocBasicObjectsCrossSliceIterator_Advance(long j, DocBasicObjectsCrossSliceIterator docBasicObjectsCrossSliceIterator);

    public static final native boolean DocBasicObjectsCrossSliceIterator_Equals(long j, DocBasicObjectsCrossSliceIterator docBasicObjectsCrossSliceIterator, long j2, DocBasicObjectsCrossSliceIterator docBasicObjectsCrossSliceIterator2);

    public static final native long DocBasicObjectsCrossSliceIterator_GetBasicObject(long j, DocBasicObjectsCrossSliceIterator docBasicObjectsCrossSliceIterator);

    public static final native int DocBasicObjectsCrossSliceIterator_GetCollectionID(long j, DocBasicObjectsCrossSliceIterator docBasicObjectsCrossSliceIterator);

    public static final native int DocBasicObjectsCrossSliceIterator_GetObjectID(long j, DocBasicObjectsCrossSliceIterator docBasicObjectsCrossSliceIterator);

    public static final native long DocBasicObjectsCrossSliceIterator_GetTags(long j, DocBasicObjectsCrossSliceIterator docBasicObjectsCrossSliceIterator);

    public static final native void DocBasicObjectsIterator_Advance(long j, DocBasicObjectsIterator docBasicObjectsIterator);

    public static final native boolean DocBasicObjectsIterator_Equals(long j, DocBasicObjectsIterator docBasicObjectsIterator, long j2, DocBasicObjectsIterator docBasicObjectsIterator2);

    public static final native long DocBasicObjectsIterator_GetBasicObject(long j, DocBasicObjectsIterator docBasicObjectsIterator);

    public static final native int DocBasicObjectsIterator_GetID(long j, DocBasicObjectsIterator docBasicObjectsIterator);

    public static final native long DocBasicObjectsIterator_GetTags(long j, DocBasicObjectsIterator docBasicObjectsIterator);

    public static final native void DocBasicObjectsMutableCrossSliceIterator_Advance(long j, DocBasicObjectsMutableCrossSliceIterator docBasicObjectsMutableCrossSliceIterator);

    public static final native boolean DocBasicObjectsMutableCrossSliceIterator_Equals(long j, DocBasicObjectsMutableCrossSliceIterator docBasicObjectsMutableCrossSliceIterator, long j2, DocBasicObjectsMutableCrossSliceIterator docBasicObjectsMutableCrossSliceIterator2);

    public static final native long DocBasicObjectsMutableCrossSliceIterator_GetBasicObject(long j, DocBasicObjectsMutableCrossSliceIterator docBasicObjectsMutableCrossSliceIterator);

    public static final native int DocBasicObjectsMutableCrossSliceIterator_GetCollectionID(long j, DocBasicObjectsMutableCrossSliceIterator docBasicObjectsMutableCrossSliceIterator);

    public static final native long DocBasicObjectsMutableCrossSliceIterator_GetMutableBasicObject(long j, DocBasicObjectsMutableCrossSliceIterator docBasicObjectsMutableCrossSliceIterator);

    public static final native int DocBasicObjectsMutableCrossSliceIterator_GetObjectID(long j, DocBasicObjectsMutableCrossSliceIterator docBasicObjectsMutableCrossSliceIterator);

    public static final native long DocBasicObjectsMutableCrossSliceIterator_GetTags(long j, DocBasicObjectsMutableCrossSliceIterator docBasicObjectsMutableCrossSliceIterator);

    public static final native void DocBasicObjectsMutableIterator_Advance(long j, DocBasicObjectsMutableIterator docBasicObjectsMutableIterator);

    public static final native boolean DocBasicObjectsMutableIterator_Equals(long j, DocBasicObjectsMutableIterator docBasicObjectsMutableIterator, long j2, DocBasicObjectsMutableIterator docBasicObjectsMutableIterator2);

    public static final native long DocBasicObjectsMutableIterator_GetBasicObject(long j, DocBasicObjectsMutableIterator docBasicObjectsMutableIterator);

    public static final native int DocBasicObjectsMutableIterator_GetID(long j, DocBasicObjectsMutableIterator docBasicObjectsMutableIterator);

    public static final native long DocBasicObjectsMutableIterator_GetMutableBasicObject(long j, DocBasicObjectsMutableIterator docBasicObjectsMutableIterator);

    public static final native long DocBasicObjectsMutableIterator_GetTags(long j, DocBasicObjectsMutableIterator docBasicObjectsMutableIterator);

    public static final native void DocBasicObjectsMutableSliceIterator_Advance(long j, DocBasicObjectsMutableSliceIterator docBasicObjectsMutableSliceIterator);

    public static final native boolean DocBasicObjectsMutableSliceIterator_Finished(long j, DocBasicObjectsMutableSliceIterator docBasicObjectsMutableSliceIterator);

    public static final native long DocBasicObjectsMutableSliceIterator_GetBasicObject(long j, DocBasicObjectsMutableSliceIterator docBasicObjectsMutableSliceIterator);

    public static final native int DocBasicObjectsMutableSliceIterator_GetID(long j, DocBasicObjectsMutableSliceIterator docBasicObjectsMutableSliceIterator);

    public static final native long DocBasicObjectsMutableSliceIterator_GetMutableBasicObject(long j, DocBasicObjectsMutableSliceIterator docBasicObjectsMutableSliceIterator);

    public static final native long DocBasicObjectsMutableSliceIterator_GetTags(long j, DocBasicObjectsMutableSliceIterator docBasicObjectsMutableSliceIterator);

    public static final native void DocBasicObjectsSliceIterator_Advance(long j, DocBasicObjectsSliceIterator docBasicObjectsSliceIterator);

    public static final native boolean DocBasicObjectsSliceIterator_Finished(long j, DocBasicObjectsSliceIterator docBasicObjectsSliceIterator);

    public static final native long DocBasicObjectsSliceIterator_GetBasicObject(long j, DocBasicObjectsSliceIterator docBasicObjectsSliceIterator);

    public static final native int DocBasicObjectsSliceIterator_GetID(long j, DocBasicObjectsSliceIterator docBasicObjectsSliceIterator);

    public static final native long DocBasicObjectsSliceIterator_GetTags(long j, DocBasicObjectsSliceIterator docBasicObjectsSliceIterator);

    public static final native long DocCheckboxField_GetBaseFieldInfo(long j, DocCheckboxField docCheckboxField);

    public static final native long DocCheckboxField_GetMutableBaseFieldInfo(long j, DocCheckboxField docCheckboxField);

    public static final native boolean DocCheckboxField_GetTickStatus(long j, DocCheckboxField docCheckboxField);

    public static final native void DocCheckboxField_Serialize(long j, DocCheckboxField docCheckboxField, long j2, Serializer serializer);

    public static final native void DocCheckboxField_SetTickStatus(long j, DocCheckboxField docCheckboxField, boolean z);

    public static final native void DocCheckboxFieldsIterator_Advance(long j, DocCheckboxFieldsIterator docCheckboxFieldsIterator);

    public static final native boolean DocCheckboxFieldsIterator_Equals(long j, DocCheckboxFieldsIterator docCheckboxFieldsIterator, long j2, DocCheckboxFieldsIterator docCheckboxFieldsIterator2);

    public static final native long DocCheckboxFieldsIterator_GetField(long j, DocCheckboxFieldsIterator docCheckboxFieldsIterator);

    public static final native String DocCheckboxFieldsIterator_GetKey(long j, DocCheckboxFieldsIterator docCheckboxFieldsIterator);

    public static final native long DocCheckboxObject_GetMutableOcrString(long j, DocCheckboxObject docCheckboxObject);

    public static final native long DocCheckboxObject_GetOcrString(long j, DocCheckboxObject docCheckboxObject);

    public static final native String DocCheckboxObject_ObjectTypeStatic();

    public static final native long DocCheckboxObject_SWIGUpcast(long j);

    public static final native void DocCheckboxObject_SetOcrString(long j, DocCheckboxObject docCheckboxObject, long j2, OcrString ocrString);

    public static final native void DocCheckboxObjectsCrossPageIterator_Advance(long j, DocCheckboxObjectsCrossPageIterator docCheckboxObjectsCrossPageIterator);

    public static final native boolean DocCheckboxObjectsCrossPageIterator_Equals(long j, DocCheckboxObjectsCrossPageIterator docCheckboxObjectsCrossPageIterator, long j2, DocCheckboxObjectsCrossPageIterator docCheckboxObjectsCrossPageIterator2);

    public static final native long DocCheckboxObjectsCrossPageIterator_GetCheckboxObject(long j, DocCheckboxObjectsCrossPageIterator docCheckboxObjectsCrossPageIterator);

    public static final native int DocCheckboxObjectsCrossPageIterator_GetObjectID(long j, DocCheckboxObjectsCrossPageIterator docCheckboxObjectsCrossPageIterator);

    public static final native int DocCheckboxObjectsCrossPageIterator_GetPhysicalPageID(long j, DocCheckboxObjectsCrossPageIterator docCheckboxObjectsCrossPageIterator);

    public static final native void DocCheckboxObjectsIterator_Advance(long j, DocCheckboxObjectsIterator docCheckboxObjectsIterator);

    public static final native boolean DocCheckboxObjectsIterator_Equals(long j, DocCheckboxObjectsIterator docCheckboxObjectsIterator, long j2, DocCheckboxObjectsIterator docCheckboxObjectsIterator2);

    public static final native long DocCheckboxObjectsIterator_GetCheckboxObject(long j, DocCheckboxObjectsIterator docCheckboxObjectsIterator);

    public static final native long DocDocumentFieldInfo_DocumentTableFieldColumnsInfoInteratorBegin(long j, DocDocumentFieldInfo docDocumentFieldInfo);

    public static final native long DocDocumentFieldInfo_DocumentTableFieldColumnsInfoInteratorEnd(long j, DocDocumentFieldInfo docDocumentFieldInfo);

    public static final native String DocDocumentFieldInfo_GetDocumentFieldCategory(long j, DocDocumentFieldInfo docDocumentFieldInfo);

    public static final native String DocDocumentFieldInfo_GetDocumentFieldExtFormat(long j, DocDocumentFieldInfo docDocumentFieldInfo);

    public static final native String DocDocumentFieldInfo_GetDocumentFieldFormat(long j, DocDocumentFieldInfo docDocumentFieldInfo);

    public static final native String DocDocumentFieldInfo_GetDocumentFieldName(long j, DocDocumentFieldInfo docDocumentFieldInfo);

    public static final native String DocDocumentFieldInfo_GetDocumentFieldNameLocal(long j, DocDocumentFieldInfo docDocumentFieldInfo);

    public static final native String DocDocumentFieldInfo_GetDocumentFieldShortNameLocal(long j, DocDocumentFieldInfo docDocumentFieldInfo);

    public static final native String DocDocumentFieldInfo_GetDocumentFieldType(long j, DocDocumentFieldInfo docDocumentFieldInfo);

    public static final native long DocDocumentFieldInfo_GetDocumentTableFieldColumnInfo(long j, DocDocumentFieldInfo docDocumentFieldInfo, String str);

    public static final native long DocDocumentFieldInfo_GetDocumentTableFieldColumnInfoPtr(long j, DocDocumentFieldInfo docDocumentFieldInfo, String str);

    public static final native void DocDocumentFieldsInfoIterator_Advance(long j, DocDocumentFieldsInfoIterator docDocumentFieldsInfoIterator);

    public static final native boolean DocDocumentFieldsInfoIterator_Equals(long j, DocDocumentFieldsInfoIterator docDocumentFieldsInfoIterator, long j2, DocDocumentFieldsInfoIterator docDocumentFieldsInfoIterator2);

    public static final native long DocDocumentFieldsInfoIterator_GetDocumentFieldInfo(long j, DocDocumentFieldsInfoIterator docDocumentFieldsInfoIterator);

    public static final native String DocDocumentFieldsInfoIterator_GetKey(long j, DocDocumentFieldsInfoIterator docDocumentFieldsInfoIterator);

    public static final native long DocDocumentInfo_DocumentFieldsInfoBegin(long j, DocDocumentInfo docDocumentInfo);

    public static final native long DocDocumentInfo_DocumentFieldsInfoEnd(long j, DocDocumentInfo docDocumentInfo);

    public static final native long DocDocumentInfo_GetDocumentFieldInfo(long j, DocDocumentInfo docDocumentInfo, String str);

    public static final native boolean DocDocumentInfo_GetDocumentMultipageInfo(long j, DocDocumentInfo docDocumentInfo);

    public static final native String DocDocumentInfo_GetDocumentName(long j, DocDocumentInfo docDocumentInfo);

    public static final native String DocDocumentInfo_GetDocumentNameLocal(long j, DocDocumentInfo docDocumentInfo);

    public static final native boolean DocDocumentInfo_GetDocumentNoFields(long j, DocDocumentInfo docDocumentInfo);

    public static final native String DocDocumentInfo_GetDocumentShortNameLocal(long j, DocDocumentInfo docDocumentInfo);

    /* renamed from: DocDocumentTableFieldColumnInfo_GetDocumentTableFieldColumnExtFormat */
    public static final native String m486xae3d91a1(long j, DocDocumentTableFieldColumnInfo docDocumentTableFieldColumnInfo);

    /* renamed from: DocDocumentTableFieldColumnInfo_GetDocumentTableFieldColumnFormat */
    public static final native String m487x9a26106e(long j, DocDocumentTableFieldColumnInfo docDocumentTableFieldColumnInfo);

    public static final native String DocDocumentTableFieldColumnInfo_GetDocumentTableFieldColumnName(long j, DocDocumentTableFieldColumnInfo docDocumentTableFieldColumnInfo);

    /* renamed from: DocDocumentTableFieldColumnInfo_GetDocumentTableFieldColumnNameLocal */
    public static final native String m488x501653c9(long j, DocDocumentTableFieldColumnInfo docDocumentTableFieldColumnInfo);

    /* renamed from: DocDocumentTableFieldColumnInfo_GetDocumentTableFieldColumnShortNameLocal */
    public static final native String m489x86eeebfb(long j, DocDocumentTableFieldColumnInfo docDocumentTableFieldColumnInfo);

    public static final native String DocDocumentTableFieldColumnInfo_GetDocumentTableFieldColumnType(long j, DocDocumentTableFieldColumnInfo docDocumentTableFieldColumnInfo);

    public static final native void DocDocumentTableFieldColumnsInfoInterator_Advance(long j, DocDocumentTableFieldColumnsInfoInterator docDocumentTableFieldColumnsInfoInterator);

    public static final native boolean DocDocumentTableFieldColumnsInfoInterator_Equals(long j, DocDocumentTableFieldColumnsInfoInterator docDocumentTableFieldColumnsInfoInterator, long j2, DocDocumentTableFieldColumnsInfoInterator docDocumentTableFieldColumnsInfoInterator2);

    /* renamed from: DocDocumentTableFieldColumnsInfoInterator_GetDocumentTableFieldColumnInfo */
    public static final native long m490xfa5add48(long j, DocDocumentTableFieldColumnsInfoInterator docDocumentTableFieldColumnsInfoInterator);

    /* renamed from: DocDocumentTableFieldColumnsInfoInterator_GetDocumentTableFieldColumnInfoPtr */
    public static final native long m491x13fdf886(long j, DocDocumentTableFieldColumnsInfoInterator docDocumentTableFieldColumnsInfoInterator);

    public static final native String DocDocumentTableFieldColumnsInfoInterator_GetKey(long j, DocDocumentTableFieldColumnsInfoInterator docDocumentTableFieldColumnsInfoInterator);

    public static final native long DocEngine_CreateFromEmbeddedBundle__SWIG_0(boolean z);

    public static final native long DocEngine_CreateFromEmbeddedBundle__SWIG_1();

    public static final native long DocEngine_CreateSessionSettings(long j, DocEngine docEngine);

    public static final native long DocEngine_CreateVideoSessionSettings(long j, DocEngine docEngine);

    public static final native long DocEngine_Create__SWIG_0(String str, boolean z);

    public static final native long DocEngine_Create__SWIG_1(String str);

    public static final native long DocEngine_Create__SWIG_2(byte[] bArr, boolean z);

    public static final native long DocEngine_Create__SWIG_3(byte[] bArr);

    public static final native String DocEngine_GetVersion();

    public static final native long DocEngine_SpawnSession__SWIG_0(long j, DocEngine docEngine, long j2, DocSessionSettings docSessionSettings, String str, long j3, DocFeedback docFeedback);

    public static final native long DocEngine_SpawnSession__SWIG_1(long j, DocEngine docEngine, long j2, DocSessionSettings docSessionSettings, String str);

    public static final native long DocEngine_SpawnSession__SWIG_2(long j, DocEngine docEngine, long j2, DocSessionSettings docSessionSettings, String str, long j3, DocFeedback docFeedback, long j4, DocExternalProcessorInterface docExternalProcessorInterface);

    public static final native long DocEngine_SpawnVideoSession__SWIG_0(long j, DocEngine docEngine, long j2, DocSessionSettings docSessionSettings, String str, long j3, DocFeedback docFeedback);

    public static final native long DocEngine_SpawnVideoSession__SWIG_1(long j, DocEngine docEngine, long j2, DocSessionSettings docSessionSettings, String str);

    public static final native void DocExternalProcessorInterface_Process(long j, DocExternalProcessorInterface docExternalProcessorInterface, long j2, DocResult docResult, long j3, DocProcessingSettings docProcessingSettings, long j4, DocProcessingArguments docProcessingArguments);

    public static final native void DocExternalProcessorInterface_change_ownership(DocExternalProcessorInterface docExternalProcessorInterface, long j, boolean z);

    public static final native void DocExternalProcessorInterface_director_connect(DocExternalProcessorInterface docExternalProcessorInterface, long j, boolean z, boolean z2);

    public static final native long DocFeedbackContainer_FeedbackFieldIteratorBegin(long j, DocFeedbackContainer docFeedbackContainer);

    public static final native long DocFeedbackContainer_FeedbackFieldIteratorEnd(long j, DocFeedbackContainer docFeedbackContainer);

    public static final native long DocFeedbackContainer_FeedbackQuadIteratorBegin(long j, DocFeedbackContainer docFeedbackContainer);

    public static final native long DocFeedbackContainer_FeedbackQuadIteratorEnd(long j, DocFeedbackContainer docFeedbackContainer);

    public static final native void DocFeedbackContainer_SetFeedbackField(long j, DocFeedbackContainer docFeedbackContainer, String str, String str2);

    public static final native void DocFeedbackContainer_SetFeedbackQuad(long j, DocFeedbackContainer docFeedbackContainer, String str, long j2, Quadrangle quadrangle);

    public static final native boolean DocFeedback_AcceptsPagePreprocessingFeedback(long j, DocFeedback docFeedback);

    /* renamed from: DocFeedback_AcceptsPagePreprocessingFeedbackSwigExplicitDocFeedback */
    public static final native boolean m492xf0f6c324(long j, DocFeedback docFeedback);

    public static final native boolean DocFeedback_AcceptsPagesLocalizationFeedback(long j, DocFeedback docFeedback);

    /* renamed from: DocFeedback_AcceptsPagesLocalizationFeedbackSwigExplicitDocFeedback */
    public static final native boolean m493xe7a9038e(long j, DocFeedback docFeedback);

    public static final native boolean DocFeedback_AcceptsRawFieldsLocalizationFeedback(long j, DocFeedback docFeedback);

    /* renamed from: DocFeedback_AcceptsRawFieldsLocalizationFeedbackSwigExplicitDocFeedback */
    public static final native boolean m494x56eeedb1(long j, DocFeedback docFeedback);

    public static final native boolean DocFeedback_AcceptsRawFieldsRecognitionFeedback(long j, DocFeedback docFeedback);

    /* renamed from: DocFeedback_AcceptsRawFieldsRecognitionFeedbackSwigExplicitDocFeedback */
    public static final native boolean m495x8c3cda83(long j, DocFeedback docFeedback);

    public static final native void DocFeedback_FeedbackReceived(long j, DocFeedback docFeedback, long j2, DocFeedbackContainer docFeedbackContainer);

    public static final native void DocFeedback_PagePrepocessingFeedbackReceived(long j, DocFeedback docFeedback, long j2, DocPagesFeedbackContainer docPagesFeedbackContainer);

    public static final native void DocFeedback_PagesLocalizationFeedbackReceived(long j, DocFeedback docFeedback, long j2, DocPagesFeedbackContainer docPagesFeedbackContainer);

    public static final native void DocFeedback_RawFiedlsRecognitionFeedbackReceived(long j, DocFeedback docFeedback, long j2, DocRawFieldsFeedbackContainer docRawFieldsFeedbackContainer);

    public static final native void DocFeedback_RawFieldsLocalizationFeedbackReceived(long j, DocFeedback docFeedback, long j2, DocRawFieldsFeedbackContainer docRawFieldsFeedbackContainer);

    public static final native void DocFeedback_ResultReceived(long j, DocFeedback docFeedback, long j2, DocResult docResult);

    public static final native void DocFeedback_change_ownership(DocFeedback docFeedback, long j, boolean z);

    public static final native void DocFeedback_director_connect(DocFeedback docFeedback, long j, boolean z, boolean z2);

    public static final native long DocForensicCheckField_GetBaseFieldInfo(long j, DocForensicCheckField docForensicCheckField);

    public static final native long DocForensicCheckField_GetMutableBaseFieldInfo(long j, DocForensicCheckField docForensicCheckField);

    public static final native String DocForensicCheckField_GetStatus(long j, DocForensicCheckField docForensicCheckField);

    public static final native void DocForensicCheckField_Serialize(long j, DocForensicCheckField docForensicCheckField, long j2, Serializer serializer);

    public static final native void DocForensicCheckField_SetStatus(long j, DocForensicCheckField docForensicCheckField, String str);

    public static final native void DocForensicCheckFieldsIterator_Advance(long j, DocForensicCheckFieldsIterator docForensicCheckFieldsIterator);

    public static final native boolean DocForensicCheckFieldsIterator_Equals(long j, DocForensicCheckFieldsIterator docForensicCheckFieldsIterator, long j2, DocForensicCheckFieldsIterator docForensicCheckFieldsIterator2);

    public static final native long DocForensicCheckFieldsIterator_GetField(long j, DocForensicCheckFieldsIterator docForensicCheckFieldsIterator);

    public static final native String DocForensicCheckFieldsIterator_GetKey(long j, DocForensicCheckFieldsIterator docForensicCheckFieldsIterator);

    public static final native long DocForensicCheckObject_GetMutableOcrString(long j, DocForensicCheckObject docForensicCheckObject);

    public static final native long DocForensicCheckObject_GetOcrString(long j, DocForensicCheckObject docForensicCheckObject);

    public static final native String DocForensicCheckObject_ObjectTypeStatic();

    public static final native long DocForensicCheckObject_SWIGUpcast(long j);

    public static final native void DocForensicCheckObjectsCrossPageIterator_Advance(long j, DocForensicCheckObjectsCrossPageIterator docForensicCheckObjectsCrossPageIterator);

    public static final native boolean DocForensicCheckObjectsCrossPageIterator_Equals(long j, DocForensicCheckObjectsCrossPageIterator docForensicCheckObjectsCrossPageIterator, long j2, DocForensicCheckObjectsCrossPageIterator docForensicCheckObjectsCrossPageIterator2);

    public static final native long DocForensicCheckObjectsCrossPageIterator_GetForensicCheckObject(long j, DocForensicCheckObjectsCrossPageIterator docForensicCheckObjectsCrossPageIterator);

    public static final native int DocForensicCheckObjectsCrossPageIterator_GetPhysicalPageID(long j, DocForensicCheckObjectsCrossPageIterator docForensicCheckObjectsCrossPageIterator);

    public static final native void DocForensicCheckObjectsIterator_Advance(long j, DocForensicCheckObjectsIterator docForensicCheckObjectsIterator);

    public static final native boolean DocForensicCheckObjectsIterator_Equals(long j, DocForensicCheckObjectsIterator docForensicCheckObjectsIterator, long j2, DocForensicCheckObjectsIterator docForensicCheckObjectsIterator2);

    public static final native long DocForensicCheckObjectsIterator_GetForensicCheckObject(long j, DocForensicCheckObjectsIterator docForensicCheckObjectsIterator);

    public static final native long DocForensicField_GetBaseFieldInfo(long j, DocForensicField docForensicField);

    public static final native long DocForensicField_GetMutableBaseFieldInfo(long j, DocForensicField docForensicField);

    public static final native String DocForensicField_GetStatus(long j, DocForensicField docForensicField);

    public static final native void DocForensicField_Serialize(long j, DocForensicField docForensicField, long j2, Serializer serializer);

    public static final native void DocForensicField_SetStatus(long j, DocForensicField docForensicField, String str);

    public static final native void DocForensicFieldsIterator_Advance(long j, DocForensicFieldsIterator docForensicFieldsIterator);

    public static final native boolean DocForensicFieldsIterator_Equals(long j, DocForensicFieldsIterator docForensicFieldsIterator, long j2, DocForensicFieldsIterator docForensicFieldsIterator2);

    public static final native long DocForensicFieldsIterator_GetField(long j, DocForensicFieldsIterator docForensicFieldsIterator);

    public static final native String DocForensicFieldsIterator_GetKey(long j, DocForensicFieldsIterator docForensicFieldsIterator);

    public static final native long DocGraphicalStructure_AddCollection__SWIG_0(long j, DocGraphicalStructure docGraphicalStructure, long j2, DocObjectsCollection docObjectsCollection);

    public static final native long DocGraphicalStructure_AddCollection__SWIG_1(long j, DocGraphicalStructure docGraphicalStructure, long j2, DocObjectsCollection docObjectsCollection, long j3, DocTagsCollection docTagsCollection);

    public static final native long DocGraphicalStructure_GetCollection(long j, DocGraphicalStructure docGraphicalStructure, int i);

    public static final native long DocGraphicalStructure_GetCollectionTags(long j, DocGraphicalStructure docGraphicalStructure, int i);

    public static final native int DocGraphicalStructure_GetCollectionsCount(long j, DocGraphicalStructure docGraphicalStructure);

    public static final native long DocGraphicalStructure_GetMutableCollection(long j, DocGraphicalStructure docGraphicalStructure, int i);

    public static final native long DocGraphicalStructure_GetMutableViewsCollection(long j, DocGraphicalStructure docGraphicalStructure);

    public static final native long DocGraphicalStructure_GetViewsCollection(long j, DocGraphicalStructure docGraphicalStructure);

    public static final native boolean DocGraphicalStructure_HasCollection(long j, DocGraphicalStructure docGraphicalStructure, int i);

    public static final native long DocGraphicalStructure_MutableObjectsCollectionsBegin(long j, DocGraphicalStructure docGraphicalStructure);

    public static final native long DocGraphicalStructure_MutableObjectsCollectionsEnd(long j, DocGraphicalStructure docGraphicalStructure);

    public static final native long DocGraphicalStructure_MutableObjectsCollectionsSlice(long j, DocGraphicalStructure docGraphicalStructure, String str);

    public static final native long DocGraphicalStructure_ObjectsCollectionsBegin(long j, DocGraphicalStructure docGraphicalStructure);

    public static final native long DocGraphicalStructure_ObjectsCollectionsEnd(long j, DocGraphicalStructure docGraphicalStructure);

    public static final native long DocGraphicalStructure_ObjectsCollectionsSlice(long j, DocGraphicalStructure docGraphicalStructure, String str);

    public static final native void DocGraphicalStructure_RemoveCollection(long j, DocGraphicalStructure docGraphicalStructure, int i);

    public static final native void DocGraphicalStructure_Serialize(long j, DocGraphicalStructure docGraphicalStructure, long j2, Serializer serializer);

    public static final native void DocGraphicalStructure_SetCollection(long j, DocGraphicalStructure docGraphicalStructure, int i, long j2, DocObjectsCollection docObjectsCollection);

    public static final native long DocImageField_GetBaseFieldInfo(long j, DocImageField docImageField);

    public static final native long DocImageField_GetImage(long j, DocImageField docImageField);

    public static final native long DocImageField_GetMutableBaseFieldInfo(long j, DocImageField docImageField);

    public static final native long DocImageField_GetMutableImage(long j, DocImageField docImageField);

    public static final native void DocImageField_Serialize(long j, DocImageField docImageField, long j2, Serializer serializer);

    public static final native void DocImageField_SetImage(long j, DocImageField docImageField, long j2, Image image);

    public static final native void DocImageFieldsIterator_Advance(long j, DocImageFieldsIterator docImageFieldsIterator);

    public static final native boolean DocImageFieldsIterator_Equals(long j, DocImageFieldsIterator docImageFieldsIterator, long j2, DocImageFieldsIterator docImageFieldsIterator2);

    public static final native long DocImageFieldsIterator_GetField(long j, DocImageFieldsIterator docImageFieldsIterator);

    public static final native String DocImageFieldsIterator_GetKey(long j, DocImageFieldsIterator docImageFieldsIterator);

    public static final native String DocImageObject_ObjectTypeStatic();

    public static final native long DocImageObject_SWIGUpcast(long j);

    public static final native void DocImageObjectsCrossPageIterator_Advance(long j, DocImageObjectsCrossPageIterator docImageObjectsCrossPageIterator);

    public static final native boolean DocImageObjectsCrossPageIterator_Equals(long j, DocImageObjectsCrossPageIterator docImageObjectsCrossPageIterator, long j2, DocImageObjectsCrossPageIterator docImageObjectsCrossPageIterator2);

    public static final native long DocImageObjectsCrossPageIterator_GetImageObject(long j, DocImageObjectsCrossPageIterator docImageObjectsCrossPageIterator);

    public static final native int DocImageObjectsCrossPageIterator_GetObjectID(long j, DocImageObjectsCrossPageIterator docImageObjectsCrossPageIterator);

    public static final native int DocImageObjectsCrossPageIterator_GetPhysicalPageID(long j, DocImageObjectsCrossPageIterator docImageObjectsCrossPageIterator);

    public static final native void DocImageObjectsIterator_Advance(long j, DocImageObjectsIterator docImageObjectsIterator);

    public static final native boolean DocImageObjectsIterator_Equals(long j, DocImageObjectsIterator docImageObjectsIterator, long j2, DocImageObjectsIterator docImageObjectsIterator2);

    public static final native long DocImageObjectsIterator_GetImageObject(long j, DocImageObjectsIterator docImageObjectsIterator);

    public static final native String DocLineObject_ObjectTypeStatic();

    public static final native long DocLineObject_SWIGUpcast(long j);

    public static final native String DocMarkObject_ObjectTypeStatic();

    public static final native long DocMarkObject_SWIGUpcast(long j);

    public static final native long DocMetaObject_GetMutableOcrString(long j, DocMetaObject docMetaObject);

    public static final native long DocMetaObject_GetOcrString(long j, DocMetaObject docMetaObject);

    public static final native String DocMetaObject_ObjectTypeStatic();

    public static final native long DocMetaObject_SWIGUpcast(long j);

    public static final native void DocMetaObject_SetOcrString(long j, DocMetaObject docMetaObject, long j2, OcrString ocrString);

    public static final native void DocMetaObjectsCrossPageIterator_Advance(long j, DocMetaObjectsCrossPageIterator docMetaObjectsCrossPageIterator);

    public static final native boolean DocMetaObjectsCrossPageIterator_Equals(long j, DocMetaObjectsCrossPageIterator docMetaObjectsCrossPageIterator, long j2, DocMetaObjectsCrossPageIterator docMetaObjectsCrossPageIterator2);

    public static final native long DocMetaObjectsCrossPageIterator_GetMetaObject(long j, DocMetaObjectsCrossPageIterator docMetaObjectsCrossPageIterator);

    public static final native long DocMetaObjectsCrossPageIterator_GetMetaObjectPtr(long j, DocMetaObjectsCrossPageIterator docMetaObjectsCrossPageIterator);

    public static final native int DocMetaObjectsCrossPageIterator_GetPhysicalPageID(long j, DocMetaObjectsCrossPageIterator docMetaObjectsCrossPageIterator);

    public static final native void DocMetaObjectsIterator_Advance(long j, DocMetaObjectsIterator docMetaObjectsIterator);

    public static final native boolean DocMetaObjectsIterator_Equals(long j, DocMetaObjectsIterator docMetaObjectsIterator, long j2, DocMetaObjectsIterator docMetaObjectsIterator2);

    public static final native long DocMetaObjectsIterator_GetMetaObject(long j, DocMetaObjectsIterator docMetaObjectsIterator);

    public static final native long DocMetaObjectsIterator_GetMetaObjectPtr(long j, DocMetaObjectsIterator docMetaObjectsIterator);

    public static final native long DocMultiStringTextObject_GetMutableStringObject(long j, DocMultiStringTextObject docMultiStringTextObject, int i);

    public static final native long DocMultiStringTextObject_GetStringObject(long j, DocMultiStringTextObject docMultiStringTextObject, int i);

    public static final native int DocMultiStringTextObject_GetStringsCount(long j, DocMultiStringTextObject docMultiStringTextObject);

    public static final native String DocMultiStringTextObject_ObjectTypeStatic();

    public static final native long DocMultiStringTextObject_SWIGUpcast(long j);

    public static final native void DocMultiStringTextObject_SetStringObject(long j, DocMultiStringTextObject docMultiStringTextObject, int i, long j2, DocTextObject docTextObject);

    public static final native void DocMultiStringTextObject_SetStringsCount(long j, DocMultiStringTextObject docMultiStringTextObject, int i);

    public static final native long DocObjectsCollection_AddObject(long j, DocObjectsCollection docObjectsCollection, long j2, DocBasicObject docBasicObject);

    public static final native String DocObjectsCollection_BaseClassNameStatic();

    public static final native long DocObjectsCollection_BasicObjectsBegin(long j, DocObjectsCollection docObjectsCollection);

    public static final native long DocObjectsCollection_BasicObjectsEnd(long j, DocObjectsCollection docObjectsCollection);

    public static final native long DocObjectsCollection_BasicObjectsSlice(long j, DocObjectsCollection docObjectsCollection, String str);

    public static final native long DocObjectsCollection_Clone(long j, DocObjectsCollection docObjectsCollection);

    public static final native long DocObjectsCollection_Create(String str);

    public static final native long DocObjectsCollection_CreateObject(long j, DocObjectsCollection docObjectsCollection);

    public static final native int DocObjectsCollection_GetFrameID(long j, DocObjectsCollection docObjectsCollection);

    public static final native long DocObjectsCollection_GetMutableObject(long j, DocObjectsCollection docObjectsCollection, int i);

    public static final native long DocObjectsCollection_GetObject(long j, DocObjectsCollection docObjectsCollection, int i);

    public static final native long DocObjectsCollection_GetObjectTags(long j, DocObjectsCollection docObjectsCollection, int i);

    public static final native int DocObjectsCollection_GetObjectsCount(long j, DocObjectsCollection docObjectsCollection);

    public static final native boolean DocObjectsCollection_HasObject(long j, DocObjectsCollection docObjectsCollection, int i);

    public static final native long DocObjectsCollection_MutableBasicObjectsBegin(long j, DocObjectsCollection docObjectsCollection);

    public static final native long DocObjectsCollection_MutableBasicObjectsEnd(long j, DocObjectsCollection docObjectsCollection);

    public static final native long DocObjectsCollection_MutableBasicObjectsSlice(long j, DocObjectsCollection docObjectsCollection, String str);

    public static final native String DocObjectsCollection_ObjectType(long j, DocObjectsCollection docObjectsCollection);

    public static final native void DocObjectsCollection_RemoveObject(long j, DocObjectsCollection docObjectsCollection, int i);

    public static final native void DocObjectsCollection_RemoveObjectDeep(long j, DocObjectsCollection docObjectsCollection, int i, long j2, DocViewsCollection docViewsCollection);

    public static final native void DocObjectsCollection_Serialize(long j, DocObjectsCollection docObjectsCollection, long j2, Serializer serializer);

    public static final native void DocObjectsCollection_SetFrameID(long j, DocObjectsCollection docObjectsCollection, int i);

    public static final native void DocObjectsCollection_SetObject(long j, DocObjectsCollection docObjectsCollection, int i, long j2, DocBasicObject docBasicObject);

    public static final native void DocObjectsCollectionsIterator_Advance(long j, DocObjectsCollectionsIterator docObjectsCollectionsIterator);

    public static final native boolean DocObjectsCollectionsIterator_Equals(long j, DocObjectsCollectionsIterator docObjectsCollectionsIterator, long j2, DocObjectsCollectionsIterator docObjectsCollectionsIterator2);

    public static final native int DocObjectsCollectionsIterator_GetID(long j, DocObjectsCollectionsIterator docObjectsCollectionsIterator);

    public static final native long DocObjectsCollectionsIterator_GetObjectsCollection(long j, DocObjectsCollectionsIterator docObjectsCollectionsIterator);

    public static final native long DocObjectsCollectionsIterator_GetTags(long j, DocObjectsCollectionsIterator docObjectsCollectionsIterator);

    public static final native void DocObjectsCollectionsMutableIterator_Advance(long j, DocObjectsCollectionsMutableIterator docObjectsCollectionsMutableIterator);

    public static final native boolean DocObjectsCollectionsMutableIterator_Equals(long j, DocObjectsCollectionsMutableIterator docObjectsCollectionsMutableIterator, long j2, DocObjectsCollectionsMutableIterator docObjectsCollectionsMutableIterator2);

    public static final native int DocObjectsCollectionsMutableIterator_GetID(long j, DocObjectsCollectionsMutableIterator docObjectsCollectionsMutableIterator);

    public static final native long DocObjectsCollectionsMutableIterator_GetMutableObjectsCollection(long j, DocObjectsCollectionsMutableIterator docObjectsCollectionsMutableIterator);

    public static final native long DocObjectsCollectionsMutableIterator_GetObjectsCollection(long j, DocObjectsCollectionsMutableIterator docObjectsCollectionsMutableIterator);

    public static final native long DocObjectsCollectionsMutableIterator_GetTags(long j, DocObjectsCollectionsMutableIterator docObjectsCollectionsMutableIterator);

    public static final native void DocObjectsCollectionsMutableSliceIterator_Advance(long j, DocObjectsCollectionsMutableSliceIterator docObjectsCollectionsMutableSliceIterator);

    public static final native boolean DocObjectsCollectionsMutableSliceIterator_Finished(long j, DocObjectsCollectionsMutableSliceIterator docObjectsCollectionsMutableSliceIterator);

    public static final native int DocObjectsCollectionsMutableSliceIterator_GetID(long j, DocObjectsCollectionsMutableSliceIterator docObjectsCollectionsMutableSliceIterator);

    /* renamed from: DocObjectsCollectionsMutableSliceIterator_GetMutableObjectsCollection */
    public static final native long m496xb2923eb6(long j, DocObjectsCollectionsMutableSliceIterator docObjectsCollectionsMutableSliceIterator);

    public static final native long DocObjectsCollectionsMutableSliceIterator_GetObjectsCollection(long j, DocObjectsCollectionsMutableSliceIterator docObjectsCollectionsMutableSliceIterator);

    public static final native long DocObjectsCollectionsMutableSliceIterator_GetTags(long j, DocObjectsCollectionsMutableSliceIterator docObjectsCollectionsMutableSliceIterator);

    public static final native void DocObjectsCollectionsSliceIterator_Advance(long j, DocObjectsCollectionsSliceIterator docObjectsCollectionsSliceIterator);

    public static final native boolean DocObjectsCollectionsSliceIterator_Finished(long j, DocObjectsCollectionsSliceIterator docObjectsCollectionsSliceIterator);

    public static final native int DocObjectsCollectionsSliceIterator_GetID(long j, DocObjectsCollectionsSliceIterator docObjectsCollectionsSliceIterator);

    public static final native long DocObjectsCollectionsSliceIterator_GetObjectsCollection(long j, DocObjectsCollectionsSliceIterator docObjectsCollectionsSliceIterator);

    public static final native long DocObjectsCollectionsSliceIterator_GetTags(long j, DocObjectsCollectionsSliceIterator docObjectsCollectionsSliceIterator);

    public static final native int DocPageFeedback_GetID(long j, DocPageFeedback docPageFeedback);

    public static final native long DocPageFeedback_GetQuadrangle(long j, DocPageFeedback docPageFeedback);

    public static final native String DocPageFeedback_GetType(long j, DocPageFeedback docPageFeedback);

    public static final native boolean DocPageFeedback_IsPageRejected(long j, DocPageFeedback docPageFeedback);

    public static final native String DocPageInfo_GarbageReason(long j, DocPageInfo docPageInfo, int i);

    public static final native int DocPageInfo_GarbageReasonsCount(long j, DocPageInfo docPageInfo);

    public static final native boolean DocPageInfo_IsGarbage(long j, DocPageInfo docPageInfo);

    public static final native int DocPagesFeedbackContainer_GetPageCount(long j, DocPagesFeedbackContainer docPagesFeedbackContainer);

    public static final native long DocPagesFeedbackContainer_GetPageFeedback(long j, DocPagesFeedbackContainer docPagesFeedbackContainer, int i);

    public static final native int DocPhysicalDocument_GetBarcodeObjectsCount(long j, DocPhysicalDocument docPhysicalDocument, String str);

    public static final native int DocPhysicalDocument_GetBasicObjectsCount(long j, DocPhysicalDocument docPhysicalDocument, String str);

    public static final native int DocPhysicalDocument_GetCheckboxObjectsCount(long j, DocPhysicalDocument docPhysicalDocument, String str);

    public static final native int DocPhysicalDocument_GetForensicCheckObjectsCount(long j, DocPhysicalDocument docPhysicalDocument, String str);

    public static final native int DocPhysicalDocument_GetForensicObjectsCount(long j, DocPhysicalDocument docPhysicalDocument, String str);

    public static final native int DocPhysicalDocument_GetImageObjectsCount(long j, DocPhysicalDocument docPhysicalDocument, String str);

    public static final native int DocPhysicalDocument_GetPagesCount(long j, DocPhysicalDocument docPhysicalDocument);

    public static final native long DocPhysicalDocument_GetPhysicalPage(long j, DocPhysicalDocument docPhysicalDocument, int i);

    public static final native long DocPhysicalDocument_GetPhysicalPagePtr(long j, DocPhysicalDocument docPhysicalDocument, int i);

    public static final native int DocPhysicalDocument_GetTableObjectsCount(long j, DocPhysicalDocument docPhysicalDocument, String str);

    public static final native int DocPhysicalDocument_GetTextObjectsCount(long j, DocPhysicalDocument docPhysicalDocument, String str);

    public static final native long DocPhysicalPage_BarcodeObjectsBegin(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native long DocPhysicalPage_BarcodeObjectsEnd(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native long DocPhysicalPage_BasicObjectsBegin(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native long DocPhysicalPage_BasicObjectsEnd(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native long DocPhysicalPage_CheckboxObjectsBegin(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native long DocPhysicalPage_CheckboxObjectsEnd(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native long DocPhysicalPage_ForensicCheckObjectsBegin(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native long DocPhysicalPage_ForensicCheckObjectsEnd(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native long DocPhysicalPage_ForensicObjectsBegin(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native long DocPhysicalPage_ForensicObjectsEnd(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native int DocPhysicalPage_GetBarcodeObjectsCount(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native int DocPhysicalPage_GetBasicObjectsCount(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native int DocPhysicalPage_GetCheckboxObjectsCount(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native int DocPhysicalPage_GetForensicCheckObjectsCount(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native int DocPhysicalPage_GetForensicObjectsCount(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native long DocPhysicalPage_GetFulltextBasicObjectsBegin(long j, DocPhysicalPage docPhysicalPage);

    public static final native long DocPhysicalPage_GetFulltextBasicObjectsEnd(long j, DocPhysicalPage docPhysicalPage);

    public static final native int DocPhysicalPage_GetImageObjectsCount(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native long DocPhysicalPage_GetPageImageFromScene(long j, DocPhysicalPage docPhysicalPage, long j2, Image image);

    public static final native long DocPhysicalPage_GetPageInfo(long j, DocPhysicalPage docPhysicalPage);

    public static final native long DocPhysicalPage_GetPageInfoPtr(long j, DocPhysicalPage docPhysicalPage);

    public static final native long DocPhysicalPage_GetPagePolygon(long j, DocPhysicalPage docPhysicalPage);

    public static final native long DocPhysicalPage_GetPagePolygonPtr(long j, DocPhysicalPage docPhysicalPage);

    public static final native long DocPhysicalPage_GetPageQuadrangle(long j, DocPhysicalPage docPhysicalPage);

    public static final native long DocPhysicalPage_GetPageQuadranglePtr(long j, DocPhysicalPage docPhysicalPage);

    public static final native long DocPhysicalPage_GetRawTextObject(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native int DocPhysicalPage_GetRawTextObjectsCount(long j, DocPhysicalPage docPhysicalPage);

    public static final native int DocPhysicalPage_GetSourceSceneID(long j, DocPhysicalPage docPhysicalPage);

    public static final native int DocPhysicalPage_GetTableObjectsCount(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native int DocPhysicalPage_GetTextObjectsCount(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native boolean DocPhysicalPage_HasBasicObjects(long j, DocPhysicalPage docPhysicalPage);

    public static final native boolean DocPhysicalPage_HasRawTextObject(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native long DocPhysicalPage_ImageObjectsBegin(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native long DocPhysicalPage_ImageObjectsEnd(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native long DocPhysicalPage_RawTextObjectsBegin(long j, DocPhysicalPage docPhysicalPage);

    public static final native long DocPhysicalPage_RawTextObjectsEnd(long j, DocPhysicalPage docPhysicalPage);

    public static final native long DocPhysicalPage_TableObjectsBegin(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native long DocPhysicalPage_TableObjectsEnd(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native long DocPhysicalPage_TextObjectsBegin(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native long DocPhysicalPage_TextObjectsEnd(long j, DocPhysicalPage docPhysicalPage, String str);

    public static final native String DocProcessingArguments_GetTagArgument(long j, DocProcessingArguments docProcessingArguments, int i);

    public static final native int DocProcessingArguments_GetTagArgumentsCount(long j, DocProcessingArguments docProcessingArguments);

    public static final native void DocProcessingArguments_Resize(long j, DocProcessingArguments docProcessingArguments, int i);

    public static final native void DocProcessingArguments_SetTagArgument(long j, DocProcessingArguments docProcessingArguments, int i, String str);

    public static final native long DocProcessingSettings_AvailableRoutinesBegin(long j, DocProcessingSettings docProcessingSettings);

    public static final native long DocProcessingSettings_AvailableRoutinesEnd(long j, DocProcessingSettings docProcessingSettings);

    public static final native void DocProcessingSettings_BindFeedbackReporter(long j, DocProcessingSettings docProcessingSettings, long j2, DocFeedback docFeedback);

    public static final native int DocProcessingSettings_GetAvailableRoutinesCount(long j, DocProcessingSettings docProcessingSettings);

    public static final native int DocProcessingSettings_GetCurrentSourceID(long j, DocProcessingSettings docProcessingSettings);

    public static final native String DocProcessingSettings_GetEnabledDocumentType(long j, DocProcessingSettings docProcessingSettings, int i);

    public static final native int DocProcessingSettings_GetEnabledDocumentTypesCount(long j, DocProcessingSettings docProcessingSettings);

    public static final native long DocProcessingSettings_GetFeedbackReporter(long j, DocProcessingSettings docProcessingSettings);

    public static final native String DocProcessingSettings_GetOption(long j, DocProcessingSettings docProcessingSettings, String str);

    public static final native int DocProcessingSettings_GetOptionsCount(long j, DocProcessingSettings docProcessingSettings);

    public static final native String DocProcessingSettings_GetSessionOption(long j, DocProcessingSettings docProcessingSettings, String str);

    public static final native int DocProcessingSettings_GetSessionOptionsCount(long j, DocProcessingSettings docProcessingSettings);

    public static final native boolean DocProcessingSettings_HasAvailableRoutine(long j, DocProcessingSettings docProcessingSettings, String str);

    public static final native boolean DocProcessingSettings_HasEnabledDocumentType(long j, DocProcessingSettings docProcessingSettings, String str);

    public static final native boolean DocProcessingSettings_HasOption(long j, DocProcessingSettings docProcessingSettings, String str);

    public static final native boolean DocProcessingSettings_HasSessionOption(long j, DocProcessingSettings docProcessingSettings, String str);

    public static final native long DocProcessingSettings_OptionsBegin(long j, DocProcessingSettings docProcessingSettings);

    public static final native long DocProcessingSettings_OptionsEnd(long j, DocProcessingSettings docProcessingSettings);

    public static final native void DocProcessingSettings_RemoveOption(long j, DocProcessingSettings docProcessingSettings, String str);

    public static final native void DocProcessingSettings_RoutinesQueueClear(long j, DocProcessingSettings docProcessingSettings);

    public static final native String DocProcessingSettings_RoutinesQueueFront(long j, DocProcessingSettings docProcessingSettings);

    public static final native void DocProcessingSettings_RoutinesQueuePop(long j, DocProcessingSettings docProcessingSettings);

    public static final native void DocProcessingSettings_RoutinesQueuePush(long j, DocProcessingSettings docProcessingSettings, String str);

    public static final native int DocProcessingSettings_RoutinesQueueSize(long j, DocProcessingSettings docProcessingSettings);

    public static final native long DocProcessingSettings_SessionOptionsBegin(long j, DocProcessingSettings docProcessingSettings);

    public static final native long DocProcessingSettings_SessionOptionsEnd(long j, DocProcessingSettings docProcessingSettings);

    public static final native void DocProcessingSettings_SetCurrentSourceID(long j, DocProcessingSettings docProcessingSettings, int i);

    public static final native void DocProcessingSettings_SetOption(long j, DocProcessingSettings docProcessingSettings, String str, String str2);

    public static final native String DocRawFieldFeedback_GetName(long j, DocRawFieldFeedback docRawFieldFeedback);

    public static final native long DocRawFieldFeedback_GetOcrString(long j, DocRawFieldFeedback docRawFieldFeedback);

    public static final native long DocRawFieldFeedback_GetQuadrangle(long j, DocRawFieldFeedback docRawFieldFeedback);

    public static final native String DocRawFieldFeedback_GetType(long j, DocRawFieldFeedback docRawFieldFeedback);

    public static final native boolean DocRawFieldFeedback_HasQuadrangle(long j, DocRawFieldFeedback docRawFieldFeedback);

    public static final native int DocRawFieldsFeedbackContainer_GetRawFieldCount(long j, DocRawFieldsFeedbackContainer docRawFieldsFeedbackContainer);

    public static final native long DocRawFieldsFeedbackContainer_GetRawFieldFeedback(long j, DocRawFieldsFeedbackContainer docRawFieldsFeedbackContainer, int i);

    public static final native int DocRawFieldsFeedbackContainer_GetSourcePageID(long j, DocRawFieldsFeedbackContainer docRawFieldsFeedbackContainer);

    public static final native long DocResult_AddDocument(long j, DocResult docResult, long j2, Document document);

    public static final native long DocResult_AddTextModesBegin(long j, DocResult docResult);

    public static final native long DocResult_AddTextModesEnd(long j, DocResult docResult);

    public static final native void DocResult_BuildPDFABuffer(long j, DocResult docResult);

    public static final native boolean DocResult_CanBuildPDFABuffer(long j, DocResult docResult);

    public static final native long DocResult_Clone(long j, DocResult docResult);

    public static final native long DocResult_DocumentsBegin(long j, DocResult docResult);

    public static final native long DocResult_DocumentsEnd(long j, DocResult docResult);

    public static final native long DocResult_DocumentsSlice(long j, DocResult docResult, String str);

    public static final native String DocResult_GetAddTextMode(long j, DocResult docResult);

    public static final native boolean DocResult_GetColourMode(long j, DocResult docResult);

    public static final native long DocResult_GetDocument(long j, DocResult docResult, int i);

    public static final native long DocResult_GetDocumentTags(long j, DocResult docResult, int i);

    public static final native int DocResult_GetDocumentsCount(long j, DocResult docResult);

    public static final native long DocResult_GetGraphicalStructure(long j, DocResult docResult);

    public static final native long DocResult_GetLastSceneInfo(long j, DocResult docResult);

    public static final native long DocResult_GetLastSceneInfoPtr(long j, DocResult docResult);

    public static final native long DocResult_GetMutableDocument(long j, DocResult docResult, int i);

    public static final native long DocResult_GetMutableGraphicalStructure(long j, DocResult docResult);

    public static final native void DocResult_GetPDFABuffer(long j, DocResult docResult, byte[] bArr);

    public static final native int DocResult_GetPDFABufferSize(long j, DocResult docResult);

    public static final native long DocResult_GetPhysicalDocument(long j, DocResult docResult, int i);

    public static final native long DocResult_GetPhysicalDocumentPtr(long j, DocResult docResult, int i);

    public static final native long DocResult_GetSceneInfo(long j, DocResult docResult, int i);

    public static final native long DocResult_GetSceneInfoPtr(long j, DocResult docResult, int i);

    public static final native int DocResult_GetScenesCount(long j, DocResult docResult);

    public static final native String DocResult_GetTextTypeMode(long j, DocResult docResult);

    public static final native boolean DocResult_HasAddTextMode(long j, DocResult docResult, String str);

    public static final native boolean DocResult_HasDocument(long j, DocResult docResult, int i);

    public static final native boolean DocResult_HasTextTypeMode(long j, DocResult docResult, String str);

    public static final native long DocResult_MutableDocumentsBegin(long j, DocResult docResult);

    public static final native long DocResult_MutableDocumentsEnd(long j, DocResult docResult);

    public static final native long DocResult_MutableDocumentsSlice(long j, DocResult docResult, String str);

    public static final native long DocResult_PartialClone(long j, DocResult docResult);

    public static final native void DocResult_RemoveDocument(long j, DocResult docResult, int i);

    public static final native void DocResult_Serialize(long j, DocResult docResult, long j2, Serializer serializer);

    public static final native void DocResult_SetAddTextMode(long j, DocResult docResult, String str);

    public static final native void DocResult_SetColourMode(long j, DocResult docResult, boolean z);

    public static final native void DocResult_SetDocument(long j, DocResult docResult, int i, long j2, Document document);

    public static final native void DocResult_SetTextTypeMode(long j, DocResult docResult, String str);

    public static final native long DocResult_TextTypeModesBegin(long j, DocResult docResult);

    public static final native long DocResult_TextTypeModesEnd(long j, DocResult docResult);

    public static final native long DocSceneInfo_ForensicCheckFieldsBegin(long j, DocSceneInfo docSceneInfo);

    public static final native long DocSceneInfo_ForensicCheckFieldsEnd(long j, DocSceneInfo docSceneInfo);

    public static final native String DocSceneInfo_GarbageReason(long j, DocSceneInfo docSceneInfo, int i);

    public static final native int DocSceneInfo_GarbageReasonsCount(long j, DocSceneInfo docSceneInfo);

    public static final native long DocSceneInfo_GetForensicCheckField(long j, DocSceneInfo docSceneInfo, String str);

    public static final native long DocSceneInfo_GetForensicCheckFieldPtr(long j, DocSceneInfo docSceneInfo, String str);

    public static final native int DocSceneInfo_GetForensicCheckFieldsCount(long j, DocSceneInfo docSceneInfo);

    public static final native int DocSceneInfo_GetSceneOriginType(long j, DocSceneInfo docSceneInfo);

    public static final native boolean DocSceneInfo_HasForensicCheckField(long j, DocSceneInfo docSceneInfo, String str);

    public static final native boolean DocSceneInfo_IsGarbage(long j, DocSceneInfo docSceneInfo);

    public static final native int DocSceneInfo_SceneID(long j, DocSceneInfo docSceneInfo);

    public static final native int DocSceneInfo_SceneOriginType_DIGITAL_BORN_get();

    public static final native int DocSceneInfo_SceneOriginType_OPTICAL_CAMERA_get();

    public static final native int DocSceneInfo_SceneOriginType_OPTICAL_SCANNER_get();

    public static final native int DocSceneInfo_SceneOriginType_UNDEFINED_get();

    public static final native void DocSessionSettings_AddEnabledDocumentTypes(long j, DocSessionSettings docSessionSettings, String str);

    public static final native long DocSessionSettings_Clone(long j, DocSessionSettings docSessionSettings);

    public static final native void DocSessionSettings_DisableForensics(long j, DocSessionSettings docSessionSettings);

    public static final native void DocSessionSettings_EnableForensics(long j, DocSessionSettings docSessionSettings);

    public static final native String DocSessionSettings_GetCurrentMode(long j, DocSessionSettings docSessionSettings);

    public static final native long DocSessionSettings_GetDocumentInfo(long j, DocSessionSettings docSessionSettings, String str);

    public static final native String DocSessionSettings_GetEnabledDocumentType(long j, DocSessionSettings docSessionSettings, int i);

    public static final native int DocSessionSettings_GetEnabledDocumentTypesCount(long j, DocSessionSettings docSessionSettings);

    public static final native int DocSessionSettings_GetInternalEnginesCount(long j, DocSessionSettings docSessionSettings);

    public static final native String DocSessionSettings_GetOption(long j, DocSessionSettings docSessionSettings, String str);

    public static final native int DocSessionSettings_GetOptionsCount(long j, DocSessionSettings docSessionSettings);

    public static final native String DocSessionSettings_GetSupportedDocumentType(long j, DocSessionSettings docSessionSettings, int i, int i2);

    public static final native int DocSessionSettings_GetSupportedDocumentTypesCount(long j, DocSessionSettings docSessionSettings, int i);

    public static final native String DocSessionSettings_GetSupportedMode(long j, DocSessionSettings docSessionSettings, int i);

    public static final native int DocSessionSettings_GetSupportedModesCount(long j, DocSessionSettings docSessionSettings);

    public static final native boolean DocSessionSettings_HasEnabledDocumentType(long j, DocSessionSettings docSessionSettings, String str);

    public static final native boolean DocSessionSettings_HasOption(long j, DocSessionSettings docSessionSettings, String str);

    public static final native boolean DocSessionSettings_HasSupportedDocumentType(long j, DocSessionSettings docSessionSettings, int i, String str);

    public static final native boolean DocSessionSettings_HasSupportedMode(long j, DocSessionSettings docSessionSettings, String str);

    public static final native boolean DocSessionSettings_IsForensicsEnabled(long j, DocSessionSettings docSessionSettings);

    public static final native long DocSessionSettings_OptionsBegin(long j, DocSessionSettings docSessionSettings);

    public static final native long DocSessionSettings_OptionsEnd(long j, DocSessionSettings docSessionSettings);

    public static final native long DocSessionSettings_PermissiblePrefixDocMasksBegin(long j, DocSessionSettings docSessionSettings);

    public static final native long DocSessionSettings_PermissiblePrefixDocMasksEnd(long j, DocSessionSettings docSessionSettings);

    public static final native void DocSessionSettings_RemoveEnabledDocumentTypes(long j, DocSessionSettings docSessionSettings, String str);

    public static final native void DocSessionSettings_RemoveOption(long j, DocSessionSettings docSessionSettings, String str);

    public static final native void DocSessionSettings_SetCurrentMode(long j, DocSessionSettings docSessionSettings, String str);

    public static final native void DocSessionSettings_SetOption(long j, DocSessionSettings docSessionSettings, String str, String str2);

    public static final native long DocSessionSettings_SupportedModesBegin(long j, DocSessionSettings docSessionSettings);

    public static final native long DocSessionSettings_SupportedModesEnd(long j, DocSessionSettings docSessionSettings);

    public static final native void DocSession_Activate(long j, DocSession docSession, String str);

    public static final native long DocSession_CreateProcessingSettings(long j, DocSession docSession);

    public static final native String DocSession_GetActivationRequest(long j, DocSession docSession);

    public static final native long DocSession_GetCurrentResult(long j, DocSession docSession);

    public static final native long DocSession_GetMutableCurrentResult(long j, DocSession docSession);

    public static final native String DocSession_GetType(long j, DocSession docSession);

    public static final native boolean DocSession_IsActivated(long j, DocSession docSession);

    public static final native void DocSession_Process(long j, DocSession docSession, long j2, DocProcessingSettings docProcessingSettings);

    public static final native void DocSession_ProcessImage__SWIG_0(long j, DocSession docSession, long j2, Image image, long j3, DocProcessingSettings docProcessingSettings);

    public static final native void DocSession_ProcessImage__SWIG_1(long j, DocSession docSession, long j2, Image image);

    public static final native int DocSession_RegisterImage(long j, DocSession docSession, long j2, Image image);

    public static final native void DocSession_Reset(long j, DocSession docSession);

    public static final native long DocTableField_GetBaseFieldInfo(long j, DocTableField docTableField);

    public static final native long DocTableField_GetCell(long j, DocTableField docTableField, int i, int i2);

    public static final native String DocTableField_GetColName(long j, DocTableField docTableField, int i);

    public static final native int DocTableField_GetColsCount(long j, DocTableField docTableField);

    public static final native int DocTableField_GetColumnIndexByName(long j, DocTableField docTableField, String str);

    public static final native long DocTableField_GetHeaderCell(long j, DocTableField docTableField, int i, int i2);

    public static final native long DocTableField_GetHeaderCellPtr(long j, DocTableField docTableField, int i, int i2);

    public static final native int DocTableField_GetHeaderColsCount(long j, DocTableField docTableField);

    public static final native long DocTableField_GetHeaderMutableCell(long j, DocTableField docTableField, int i, int i2);

    public static final native long DocTableField_GetHeaderMutableCellPtr(long j, DocTableField docTableField, int i, int i2);

    public static final native int DocTableField_GetHeaderRowsCount(long j, DocTableField docTableField);

    public static final native long DocTableField_GetMutableBaseFieldInfo(long j, DocTableField docTableField);

    public static final native long DocTableField_GetMutableCell(long j, DocTableField docTableField, int i, int i2);

    public static final native int DocTableField_GetRowsCount(long j, DocTableField docTableField);

    public static final native boolean DocTableField_HasColumnIndexByName(long j, DocTableField docTableField, String str);

    public static final native void DocTableField_ResizeCols__SWIG_0(long j, DocTableField docTableField, int i);

    public static final native void DocTableField_ResizeCols__SWIG_1(long j, DocTableField docTableField, int i, long j2, DocTextField docTextField);

    public static final native void DocTableField_ResizeHeaderCols__SWIG_0(long j, DocTableField docTableField, int i);

    public static final native void DocTableField_ResizeHeaderCols__SWIG_1(long j, DocTableField docTableField, int i, long j2, DocTextField docTextField);

    public static final native void DocTableField_ResizeHeaderRows__SWIG_0(long j, DocTableField docTableField, int i);

    public static final native void DocTableField_ResizeHeaderRows__SWIG_1(long j, DocTableField docTableField, int i, long j2, DocTextField docTextField);

    public static final native void DocTableField_ResizeRows__SWIG_0(long j, DocTableField docTableField, int i);

    public static final native void DocTableField_ResizeRows__SWIG_1(long j, DocTableField docTableField, int i, long j2, DocTextField docTextField);

    public static final native void DocTableField_Serialize(long j, DocTableField docTableField, long j2, Serializer serializer);

    public static final native void DocTableField_SetCell(long j, DocTableField docTableField, int i, int i2, long j2, DocTextField docTextField);

    public static final native void DocTableField_SetColName(long j, DocTableField docTableField, int i, String str);

    public static final native void DocTableField_SetHeaderCell(long j, DocTableField docTableField, int i, int i2, long j2, DocTextField docTextField);

    public static final native void DocTableFieldsIterator_Advance(long j, DocTableFieldsIterator docTableFieldsIterator);

    public static final native boolean DocTableFieldsIterator_Equals(long j, DocTableFieldsIterator docTableFieldsIterator, long j2, DocTableFieldsIterator docTableFieldsIterator2);

    public static final native long DocTableFieldsIterator_GetField(long j, DocTableFieldsIterator docTableFieldsIterator);

    public static final native String DocTableFieldsIterator_GetKey(long j, DocTableFieldsIterator docTableFieldsIterator);

    public static final native long DocTableObject_GetCell(long j, DocTableObject docTableObject, int i, int i2);

    public static final native String DocTableObject_GetColName(long j, DocTableObject docTableObject, int i, int i2);

    public static final native int DocTableObject_GetColsCount(long j, DocTableObject docTableObject, int i);

    public static final native long DocTableObject_GetMutableCell(long j, DocTableObject docTableObject, int i, int i2);

    public static final native int DocTableObject_GetRowsCount(long j, DocTableObject docTableObject);

    public static final native long DocTableObject_GetTextCell(long j, DocTableObject docTableObject, int i, int i2);

    public static final native long DocTableObject_GetTextCellPtr(long j, DocTableObject docTableObject, int i, int i2);

    public static final native String DocTableObject_ObjectTypeStatic();

    public static final native void DocTableObject_ResizeCols(long j, DocTableObject docTableObject, int i, int i2);

    public static final native void DocTableObject_ResizeRows(long j, DocTableObject docTableObject, int i);

    public static final native long DocTableObject_SWIGUpcast(long j);

    public static final native void DocTableObject_SetCell(long j, DocTableObject docTableObject, int i, int i2, long j2, DocMultiStringTextObject docMultiStringTextObject);

    public static final native void DocTableObject_SetColName(long j, DocTableObject docTableObject, int i, int i2, String str);

    public static final native void DocTableObjectsCrossPageIterator_Advance(long j, DocTableObjectsCrossPageIterator docTableObjectsCrossPageIterator);

    public static final native boolean DocTableObjectsCrossPageIterator_Equals(long j, DocTableObjectsCrossPageIterator docTableObjectsCrossPageIterator, long j2, DocTableObjectsCrossPageIterator docTableObjectsCrossPageIterator2);

    public static final native int DocTableObjectsCrossPageIterator_GetObjectID(long j, DocTableObjectsCrossPageIterator docTableObjectsCrossPageIterator);

    public static final native int DocTableObjectsCrossPageIterator_GetPhysicalPageID(long j, DocTableObjectsCrossPageIterator docTableObjectsCrossPageIterator);

    public static final native long DocTableObjectsCrossPageIterator_GetTableObject(long j, DocTableObjectsCrossPageIterator docTableObjectsCrossPageIterator);

    public static final native void DocTableObjectsIterator_Advance(long j, DocTableObjectsIterator docTableObjectsIterator);

    public static final native boolean DocTableObjectsIterator_Equals(long j, DocTableObjectsIterator docTableObjectsIterator, long j2, DocTableObjectsIterator docTableObjectsIterator2);

    public static final native long DocTableObjectsIterator_GetTableObject(long j, DocTableObjectsIterator docTableObjectsIterator);

    public static final native void DocTagsCollection_AddTag(long j, DocTagsCollection docTagsCollection, String str);

    public static final native long DocTagsCollection_Create();

    public static final native int DocTagsCollection_GetTagsCount(long j, DocTagsCollection docTagsCollection);

    public static final native boolean DocTagsCollection_HasTag(long j, DocTagsCollection docTagsCollection, String str);

    public static final native void DocTagsCollection_RemoveTag(long j, DocTagsCollection docTagsCollection, String str);

    public static final native void DocTagsCollection_Serialize(long j, DocTagsCollection docTagsCollection, long j2, Serializer serializer);

    public static final native long DocTagsCollection_TagsBegin(long j, DocTagsCollection docTagsCollection);

    public static final native long DocTagsCollection_TagsEnd(long j, DocTagsCollection docTagsCollection);

    public static final native String DocTemplateObject_ObjectTypeStatic();

    public static final native long DocTemplateObject_SWIGUpcast(long j);

    public static final native long DocTextField_GetBaseFieldInfo(long j, DocTextField docTextField);

    public static final native long DocTextField_GetMutableBaseFieldInfo(long j, DocTextField docTextField);

    public static final native long DocTextField_GetMutableOcrString(long j, DocTextField docTextField);

    public static final native long DocTextField_GetOcrString(long j, DocTextField docTextField);

    public static final native void DocTextField_Serialize(long j, DocTextField docTextField, long j2, Serializer serializer);

    public static final native void DocTextField_SetOcrString(long j, DocTextField docTextField, long j2, OcrString ocrString);

    public static final native void DocTextFieldsIterator_Advance(long j, DocTextFieldsIterator docTextFieldsIterator);

    public static final native boolean DocTextFieldsIterator_Equals(long j, DocTextFieldsIterator docTextFieldsIterator, long j2, DocTextFieldsIterator docTextFieldsIterator2);

    public static final native long DocTextFieldsIterator_GetField(long j, DocTextFieldsIterator docTextFieldsIterator);

    public static final native String DocTextFieldsIterator_GetKey(long j, DocTextFieldsIterator docTextFieldsIterator);

    public static final native long DocTextLineObject_CellQuadranglesOnPageBegin(long j, DocTextLineObject docTextLineObject);

    public static final native long DocTextLineObject_CellQuadranglesOnPageEnd(long j, DocTextLineObject docTextLineObject);

    public static final native long DocTextLineObject_CellQuadranglesOnSceneBegin(long j, DocTextLineObject docTextLineObject);

    public static final native long DocTextLineObject_CellQuadranglesOnSceneEnd(long j, DocTextLineObject docTextLineObject);

    public static final native long DocTextLineObject_GetCellQuadOnPage(long j, DocTextLineObject docTextLineObject, int i);

    public static final native long DocTextLineObject_GetCellQuadOnScene(long j, DocTextLineObject docTextLineObject, int i);

    public static final native long DocTextLineObject_GetOcrString(long j, DocTextLineObject docTextLineObject);

    public static final native String DocTextLineObject_ObjectTypeStatic();

    public static final native long DocTextLineObject_SWIGUpcast(long j);

    public static final native long DocTextObject_GetMutableOcrString(long j, DocTextObject docTextObject);

    public static final native long DocTextObject_GetOcrString(long j, DocTextObject docTextObject);

    public static final native long DocTextObject_GetTextLineObject(long j, DocTextObject docTextObject, int i);

    public static final native long DocTextObject_GetTextLineObjectPtr(long j, DocTextObject docTextObject, int i);

    public static final native int DocTextObject_GetTextLineObjectsCount(long j, DocTextObject docTextObject);

    public static final native String DocTextObject_ObjectTypeStatic();

    public static final native long DocTextObject_SWIGUpcast(long j);

    public static final native void DocTextObject_SetOcrString(long j, DocTextObject docTextObject, long j2, OcrString ocrString);

    public static final native void DocTextObjectsCrossPageIterator_Advance(long j, DocTextObjectsCrossPageIterator docTextObjectsCrossPageIterator);

    public static final native boolean DocTextObjectsCrossPageIterator_Equals(long j, DocTextObjectsCrossPageIterator docTextObjectsCrossPageIterator, long j2, DocTextObjectsCrossPageIterator docTextObjectsCrossPageIterator2);

    public static final native int DocTextObjectsCrossPageIterator_GetObjectID(long j, DocTextObjectsCrossPageIterator docTextObjectsCrossPageIterator);

    public static final native int DocTextObjectsCrossPageIterator_GetPhysicalPageID(long j, DocTextObjectsCrossPageIterator docTextObjectsCrossPageIterator);

    public static final native long DocTextObjectsCrossPageIterator_GetTextObject(long j, DocTextObjectsCrossPageIterator docTextObjectsCrossPageIterator);

    public static final native void DocTextObjectsIterator_Advance(long j, DocTextObjectsIterator docTextObjectsIterator);

    public static final native boolean DocTextObjectsIterator_Equals(long j, DocTextObjectsIterator docTextObjectsIterator, long j2, DocTextObjectsIterator docTextObjectsIterator2);

    public static final native long DocTextObjectsIterator_GetTextObject(long j, DocTextObjectsIterator docTextObjectsIterator);

    public static final native void DocVideoSession_Activate(long j, DocVideoSession docVideoSession, String str);

    public static final native long DocVideoSession_CreateProcessingSettings(long j, DocVideoSession docVideoSession);

    public static final native String DocVideoSession_GetActivationRequest(long j, DocVideoSession docVideoSession);

    public static final native long DocVideoSession_GetCurrentResult(long j, DocVideoSession docVideoSession);

    public static final native long DocVideoSession_GetMutableCurrentResult(long j, DocVideoSession docVideoSession);

    public static final native boolean DocVideoSession_IsActivated(long j, DocVideoSession docVideoSession);

    public static final native void DocVideoSession_ProcessImage(long j, DocVideoSession docVideoSession, long j2, Image image, long j3, DocProcessingSettings docProcessingSettings);

    public static final native void DocVideoSession_Reset(long j, DocVideoSession docVideoSession);

    public static final native String DocView_BaseClassNameStatic();

    public static final native int DocView_GetAncestorID(long j, DocView docView);

    public static final native long DocView_GetImage(long j, DocView docView);

    public static final native long DocView_GetMutableImage(long j, DocView docView);

    public static final native long DocView_GetMutableTransform(long j, DocView docView);

    public static final native int DocView_GetRootAncestorID(long j, DocView docView);

    public static final native long DocView_GetTransform(long j, DocView docView);

    public static final native void DocView_Serialize(long j, DocView docView, long j2, Serializer serializer);

    public static final native void DocView_SetAncestorID(long j, DocView docView, int i);

    public static final native void DocView_SetImage(long j, DocView docView, long j2, Image image);

    public static final native void DocView_SetRootAncestorID(long j, DocView docView, int i);

    public static final native void DocView_SetTransform(long j, DocView docView, long j2, ProjectiveTransform projectiveTransform);

    public static final native String DocViewsCollection_BaseClassNameStatic();

    public static final native void DocViewsCollection_DeleteOrphans(long j, DocViewsCollection docViewsCollection);

    public static final native void DocViewsCollection_DeleteView(long j, DocViewsCollection docViewsCollection, int i);

    public static final native long DocViewsCollection_GetMutableView(long j, DocViewsCollection docViewsCollection, int i);

    public static final native long DocViewsCollection_GetView(long j, DocViewsCollection docViewsCollection, int i);

    public static final native long DocViewsCollection_GetViewTags(long j, DocViewsCollection docViewsCollection, int i);

    public static final native int DocViewsCollection_GetViewsCount(long j, DocViewsCollection docViewsCollection);

    public static final native boolean DocViewsCollection_HasView(long j, DocViewsCollection docViewsCollection, int i);

    public static final native long DocViewsCollection_MutableViewsBegin(long j, DocViewsCollection docViewsCollection);

    public static final native long DocViewsCollection_MutableViewsEnd(long j, DocViewsCollection docViewsCollection);

    public static final native long DocViewsCollection_MutableViewsSlice(long j, DocViewsCollection docViewsCollection, String str);

    public static final native long DocViewsCollection_RegisterDerivedView(long j, DocViewsCollection docViewsCollection, long j2, Image image, int i, long j3, ProjectiveTransform projectiveTransform);

    public static final native long DocViewsCollection_RegisterView(long j, DocViewsCollection docViewsCollection, long j2, Image image);

    public static final native void DocViewsCollection_Serialize(long j, DocViewsCollection docViewsCollection, long j2, Serializer serializer);

    public static final native long DocViewsCollection_ViewsBegin(long j, DocViewsCollection docViewsCollection);

    public static final native long DocViewsCollection_ViewsEnd(long j, DocViewsCollection docViewsCollection);

    public static final native long DocViewsCollection_ViewsSlice(long j, DocViewsCollection docViewsCollection, String str);

    public static final native void DocViewsIterator_Advance(long j, DocViewsIterator docViewsIterator);

    public static final native boolean DocViewsIterator_Equals(long j, DocViewsIterator docViewsIterator, long j2, DocViewsIterator docViewsIterator2);

    public static final native int DocViewsIterator_GetID(long j, DocViewsIterator docViewsIterator);

    public static final native long DocViewsIterator_GetTags(long j, DocViewsIterator docViewsIterator);

    public static final native long DocViewsIterator_GetView(long j, DocViewsIterator docViewsIterator);

    public static final native void DocViewsMutableIterator_Advance(long j, DocViewsMutableIterator docViewsMutableIterator);

    public static final native boolean DocViewsMutableIterator_Equals(long j, DocViewsMutableIterator docViewsMutableIterator, long j2, DocViewsMutableIterator docViewsMutableIterator2);

    public static final native int DocViewsMutableIterator_GetID(long j, DocViewsMutableIterator docViewsMutableIterator);

    public static final native long DocViewsMutableIterator_GetMutableView(long j, DocViewsMutableIterator docViewsMutableIterator);

    public static final native long DocViewsMutableIterator_GetTags(long j, DocViewsMutableIterator docViewsMutableIterator);

    public static final native long DocViewsMutableIterator_GetView(long j, DocViewsMutableIterator docViewsMutableIterator);

    public static final native void DocViewsMutableSliceIterator_Advance(long j, DocViewsMutableSliceIterator docViewsMutableSliceIterator);

    public static final native boolean DocViewsMutableSliceIterator_Finished(long j, DocViewsMutableSliceIterator docViewsMutableSliceIterator);

    public static final native int DocViewsMutableSliceIterator_GetID(long j, DocViewsMutableSliceIterator docViewsMutableSliceIterator);

    public static final native long DocViewsMutableSliceIterator_GetMutableView(long j, DocViewsMutableSliceIterator docViewsMutableSliceIterator);

    public static final native long DocViewsMutableSliceIterator_GetTags(long j, DocViewsMutableSliceIterator docViewsMutableSliceIterator);

    public static final native long DocViewsMutableSliceIterator_GetView(long j, DocViewsMutableSliceIterator docViewsMutableSliceIterator);

    public static final native void DocViewsSliceIterator_Advance(long j, DocViewsSliceIterator docViewsSliceIterator);

    public static final native boolean DocViewsSliceIterator_Finished(long j, DocViewsSliceIterator docViewsSliceIterator);

    public static final native int DocViewsSliceIterator_GetID(long j, DocViewsSliceIterator docViewsSliceIterator);

    public static final native long DocViewsSliceIterator_GetTags(long j, DocViewsSliceIterator docViewsSliceIterator);

    public static final native long DocViewsSliceIterator_GetView(long j, DocViewsSliceIterator docViewsSliceIterator);

    public static final native long DocZoneObject_GetMutableSize(long j, DocZoneObject docZoneObject);

    public static final native long DocZoneObject_GetSize(long j, DocZoneObject docZoneObject);

    public static final native String DocZoneObject_ObjectTypeStatic();

    public static final native long DocZoneObject_SWIGUpcast(long j);

    public static final native void DocZoneObject_SetSize(long j, DocZoneObject docZoneObject, long j2, Size size);

    public static final native long Document_AttributesBegin(long j, Document document);

    public static final native long Document_AttributesEnd(long j, Document document);

    public static final native long Document_BarcodeFieldsBegin(long j, Document document);

    public static final native long Document_BarcodeFieldsEnd(long j, Document document);

    public static final native String Document_BaseClassNameStatic();

    public static final native long Document_CheckboxFieldsBegin(long j, Document document);

    public static final native long Document_CheckboxFieldsEnd(long j, Document document);

    public static final native long Document_ForensicCheckFieldsBegin(long j, Document document);

    public static final native long Document_ForensicCheckFieldsEnd(long j, Document document);

    public static final native long Document_ForensicFieldsBegin(long j, Document document);

    public static final native long Document_ForensicFieldsEnd(long j, Document document);

    public static final native String Document_GetAttribute(long j, Document document, String str);

    public static final native int Document_GetAttributesCount(long j, Document document);

    public static final native long Document_GetBarcodeField(long j, Document document, String str);

    public static final native int Document_GetBarcodeFieldsCount(long j, Document document);

    public static final native long Document_GetCheckboxField(long j, Document document, String str);

    public static final native int Document_GetCheckboxFieldsCount(long j, Document document);

    public static final native long Document_GetForensicCheckField(long j, Document document, String str);

    public static final native long Document_GetForensicCheckFieldPtr(long j, Document document, String str);

    public static final native int Document_GetForensicCheckFieldsCount(long j, Document document);

    public static final native long Document_GetForensicField(long j, Document document, String str);

    public static final native int Document_GetForensicFieldsCount(long j, Document document);

    public static final native long Document_GetImageField(long j, Document document, String str);

    public static final native int Document_GetImageFieldsCount(long j, Document document);

    public static final native long Document_GetMutableBarcodeField(long j, Document document, String str);

    public static final native long Document_GetMutableCheckboxField(long j, Document document, String str);

    public static final native long Document_GetMutableForensicCheckField(long j, Document document, String str);

    public static final native long Document_GetMutableForensicCheckFieldPtr(long j, Document document, String str);

    public static final native long Document_GetMutableForensicField(long j, Document document, String str);

    public static final native long Document_GetMutableImageField(long j, Document document, String str);

    public static final native long Document_GetMutableTableField(long j, Document document, String str);

    public static final native long Document_GetMutableTextField(long j, Document document, String str);

    public static final native int Document_GetPhysicalDocIdx(long j, Document document);

    public static final native long Document_GetTableField(long j, Document document, String str);

    public static final native int Document_GetTableFieldsCount(long j, Document document);

    public static final native long Document_GetTextField(long j, Document document, String str);

    public static final native int Document_GetTextFieldsCount(long j, Document document);

    public static final native String Document_GetType(long j, Document document);

    public static final native boolean Document_HasAttribute(long j, Document document, String str);

    public static final native boolean Document_HasBarcodeField(long j, Document document, String str);

    public static final native boolean Document_HasCheckboxField(long j, Document document, String str);

    public static final native boolean Document_HasForensicCheckField(long j, Document document, String str);

    public static final native boolean Document_HasForensicField(long j, Document document, String str);

    public static final native boolean Document_HasImageField(long j, Document document, String str);

    public static final native boolean Document_HasTableField(long j, Document document, String str);

    public static final native boolean Document_HasTextField(long j, Document document, String str);

    public static final native long Document_ImageFieldsBegin(long j, Document document);

    public static final native long Document_ImageFieldsEnd(long j, Document document);

    public static final native void Document_RemoveAttribute(long j, Document document, String str);

    public static final native void Document_RemoveBarcodeField(long j, Document document, String str);

    public static final native void Document_RemoveCheckboxField(long j, Document document, String str);

    public static final native void Document_RemoveForensicCheckField(long j, Document document, String str);

    public static final native void Document_RemoveForensicField(long j, Document document, String str);

    public static final native void Document_RemoveImageField(long j, Document document, String str);

    public static final native void Document_RemoveTableField(long j, Document document, String str);

    public static final native void Document_RemoveTextField(long j, Document document, String str);

    public static final native void Document_Serialize(long j, Document document, long j2, Serializer serializer);

    public static final native void Document_SetAttribute(long j, Document document, String str, String str2);

    public static final native void Document_SetBarcodeField(long j, Document document, String str, long j2, DocBarcodeField docBarcodeField);

    public static final native void Document_SetCheckboxField(long j, Document document, String str, long j2, DocCheckboxField docCheckboxField);

    public static final native void Document_SetForensicCheckField(long j, Document document, String str, long j2, DocForensicCheckField docForensicCheckField);

    public static final native void Document_SetForensicField(long j, Document document, String str, long j2, DocForensicField docForensicField);

    public static final native void Document_SetImageField(long j, Document document, String str, long j2, DocImageField docImageField);

    public static final native void Document_SetTableField(long j, Document document, String str, long j2, DocTableField docTableField);

    public static final native void Document_SetTextField(long j, Document document, String str, long j2, DocTextField docTextField);

    public static final native long Document_TableFieldsBegin(long j, Document document);

    public static final native long Document_TableFieldsEnd(long j, Document document);

    public static final native long Document_TextFieldsBegin(long j, Document document);

    public static final native long Document_TextFieldsEnd(long j, Document document);

    public static final native void DocumentsIterator_Advance(long j, DocumentsIterator documentsIterator);

    public static final native boolean DocumentsIterator_Equals(long j, DocumentsIterator documentsIterator, long j2, DocumentsIterator documentsIterator2);

    public static final native long DocumentsIterator_GetDocument(long j, DocumentsIterator documentsIterator);

    public static final native int DocumentsIterator_GetID(long j, DocumentsIterator documentsIterator);

    public static final native long DocumentsIterator_GetTags(long j, DocumentsIterator documentsIterator);

    public static final native void DocumentsMutableIterator_Advance(long j, DocumentsMutableIterator documentsMutableIterator);

    public static final native boolean DocumentsMutableIterator_Equals(long j, DocumentsMutableIterator documentsMutableIterator, long j2, DocumentsMutableIterator documentsMutableIterator2);

    public static final native long DocumentsMutableIterator_GetDocument(long j, DocumentsMutableIterator documentsMutableIterator);

    public static final native int DocumentsMutableIterator_GetID(long j, DocumentsMutableIterator documentsMutableIterator);

    public static final native long DocumentsMutableIterator_GetMutableDocument(long j, DocumentsMutableIterator documentsMutableIterator);

    public static final native long DocumentsMutableIterator_GetTags(long j, DocumentsMutableIterator documentsMutableIterator);

    public static final native void DocumentsMutableSliceIterator_Advance(long j, DocumentsMutableSliceIterator documentsMutableSliceIterator);

    public static final native boolean DocumentsMutableSliceIterator_Finished(long j, DocumentsMutableSliceIterator documentsMutableSliceIterator);

    public static final native long DocumentsMutableSliceIterator_GetDocument(long j, DocumentsMutableSliceIterator documentsMutableSliceIterator);

    public static final native int DocumentsMutableSliceIterator_GetID(long j, DocumentsMutableSliceIterator documentsMutableSliceIterator);

    public static final native long DocumentsMutableSliceIterator_GetMutableDocument(long j, DocumentsMutableSliceIterator documentsMutableSliceIterator);

    public static final native long DocumentsMutableSliceIterator_GetTags(long j, DocumentsMutableSliceIterator documentsMutableSliceIterator);

    public static final native void DocumentsSliceIterator_Advance(long j, DocumentsSliceIterator documentsSliceIterator);

    public static final native boolean DocumentsSliceIterator_Finished(long j, DocumentsSliceIterator documentsSliceIterator);

    public static final native long DocumentsSliceIterator_GetDocument(long j, DocumentsSliceIterator documentsSliceIterator);

    public static final native int DocumentsSliceIterator_GetID(long j, DocumentsSliceIterator documentsSliceIterator);

    public static final native long DocumentsSliceIterator_GetTags(long j, DocumentsSliceIterator documentsSliceIterator);

    public static final native void delete_DocBarcodeField(long j);

    public static final native void delete_DocBarcodeFieldsIterator(long j);

    public static final native void delete_DocBarcodeObject(long j);

    public static final native void delete_DocBarcodeObjectsCrossPageIterator(long j);

    public static final native void delete_DocBarcodeObjectsIterator(long j);

    public static final native void delete_DocBaseFieldInfo(long j);

    public static final native void delete_DocBaseObjectInfo(long j);

    public static final native void delete_DocBasicObject(long j);

    public static final native void delete_DocBasicObjectsCrossSliceIterator(long j);

    public static final native void delete_DocBasicObjectsIterator(long j);

    public static final native void delete_DocBasicObjectsMutableCrossSliceIterator(long j);

    public static final native void delete_DocBasicObjectsMutableIterator(long j);

    public static final native void delete_DocBasicObjectsMutableSliceIterator(long j);

    public static final native void delete_DocBasicObjectsSliceIterator(long j);

    public static final native void delete_DocCheckboxField(long j);

    public static final native void delete_DocCheckboxFieldsIterator(long j);

    public static final native void delete_DocCheckboxObject(long j);

    public static final native void delete_DocCheckboxObjectsCrossPageIterator(long j);

    public static final native void delete_DocCheckboxObjectsIterator(long j);

    public static final native void delete_DocDocumentFieldInfo(long j);

    public static final native void delete_DocDocumentFieldsInfoIterator(long j);

    public static final native void delete_DocDocumentInfo(long j);

    public static final native void delete_DocDocumentTableFieldColumnInfo(long j);

    public static final native void delete_DocDocumentTableFieldColumnsInfoInterator(long j);

    public static final native void delete_DocEngine(long j);

    public static final native void delete_DocExternalProcessorInterface(long j);

    public static final native void delete_DocFeedback(long j);

    public static final native void delete_DocFeedbackContainer(long j);

    public static final native void delete_DocForensicCheckField(long j);

    public static final native void delete_DocForensicCheckFieldsIterator(long j);

    public static final native void delete_DocForensicCheckObject(long j);

    public static final native void delete_DocForensicCheckObjectsCrossPageIterator(long j);

    public static final native void delete_DocForensicCheckObjectsIterator(long j);

    public static final native void delete_DocForensicField(long j);

    public static final native void delete_DocForensicFieldsIterator(long j);

    public static final native void delete_DocGraphicalStructure(long j);

    public static final native void delete_DocImageField(long j);

    public static final native void delete_DocImageFieldsIterator(long j);

    public static final native void delete_DocImageObject(long j);

    public static final native void delete_DocImageObjectsCrossPageIterator(long j);

    public static final native void delete_DocImageObjectsIterator(long j);

    public static final native void delete_DocLineObject(long j);

    public static final native void delete_DocMarkObject(long j);

    public static final native void delete_DocMetaObject(long j);

    public static final native void delete_DocMetaObjectsCrossPageIterator(long j);

    public static final native void delete_DocMetaObjectsIterator(long j);

    public static final native void delete_DocMultiStringTextObject(long j);

    public static final native void delete_DocObjectsCollection(long j);

    public static final native void delete_DocObjectsCollectionsIterator(long j);

    public static final native void delete_DocObjectsCollectionsMutableIterator(long j);

    public static final native void delete_DocObjectsCollectionsMutableSliceIterator(long j);

    public static final native void delete_DocObjectsCollectionsSliceIterator(long j);

    public static final native void delete_DocPageFeedback(long j);

    public static final native void delete_DocPageInfo(long j);

    public static final native void delete_DocPagesFeedbackContainer(long j);

    public static final native void delete_DocPhysicalDocument(long j);

    public static final native void delete_DocPhysicalPage(long j);

    public static final native void delete_DocProcessingArguments(long j);

    public static final native void delete_DocProcessingSettings(long j);

    public static final native void delete_DocRawFieldFeedback(long j);

    public static final native void delete_DocRawFieldsFeedbackContainer(long j);

    public static final native void delete_DocResult(long j);

    public static final native void delete_DocSceneInfo(long j);

    public static final native void delete_DocSession(long j);

    public static final native void delete_DocSessionSettings(long j);

    public static final native void delete_DocTableField(long j);

    public static final native void delete_DocTableFieldsIterator(long j);

    public static final native void delete_DocTableObject(long j);

    public static final native void delete_DocTableObjectsCrossPageIterator(long j);

    public static final native void delete_DocTableObjectsIterator(long j);

    public static final native void delete_DocTagsCollection(long j);

    public static final native void delete_DocTemplateObject(long j);

    public static final native void delete_DocTextField(long j);

    public static final native void delete_DocTextFieldsIterator(long j);

    public static final native void delete_DocTextLineObject(long j);

    public static final native void delete_DocTextObject(long j);

    public static final native void delete_DocTextObjectsCrossPageIterator(long j);

    public static final native void delete_DocTextObjectsIterator(long j);

    public static final native void delete_DocVideoSession(long j);

    public static final native void delete_DocView(long j);

    public static final native void delete_DocViewsCollection(long j);

    public static final native void delete_DocViewsIterator(long j);

    public static final native void delete_DocViewsMutableIterator(long j);

    public static final native void delete_DocViewsMutableSliceIterator(long j);

    public static final native void delete_DocViewsSliceIterator(long j);

    public static final native void delete_DocZoneObject(long j);

    public static final native void delete_Document(long j);

    public static final native void delete_DocumentsIterator(long j);

    public static final native void delete_DocumentsMutableIterator(long j);

    public static final native void delete_DocumentsMutableSliceIterator(long j);

    public static final native void delete_DocumentsSliceIterator(long j);

    public static final native long new_DocBarcodeFieldsIterator(long j, DocBarcodeFieldsIterator docBarcodeFieldsIterator);

    public static final native long new_DocBarcodeObjectsCrossPageIterator(long j, DocBarcodeObjectsCrossPageIterator docBarcodeObjectsCrossPageIterator);

    public static final native long new_DocBarcodeObjectsIterator(long j, DocBarcodeObjectsIterator docBarcodeObjectsIterator);

    public static final native long new_DocBasicObjectsCrossSliceIterator(long j, DocBasicObjectsCrossSliceIterator docBasicObjectsCrossSliceIterator);

    public static final native long new_DocBasicObjectsIterator(long j, DocBasicObjectsIterator docBasicObjectsIterator);

    public static final native long new_DocBasicObjectsMutableCrossSliceIterator(long j, DocBasicObjectsMutableCrossSliceIterator docBasicObjectsMutableCrossSliceIterator);

    public static final native long new_DocBasicObjectsMutableIterator(long j, DocBasicObjectsMutableIterator docBasicObjectsMutableIterator);

    public static final native long new_DocBasicObjectsMutableSliceIterator(long j, DocBasicObjectsMutableSliceIterator docBasicObjectsMutableSliceIterator);

    public static final native long new_DocBasicObjectsSliceIterator(long j, DocBasicObjectsSliceIterator docBasicObjectsSliceIterator);

    public static final native long new_DocCheckboxFieldsIterator(long j, DocCheckboxFieldsIterator docCheckboxFieldsIterator);

    public static final native long new_DocCheckboxObjectsCrossPageIterator(long j, DocCheckboxObjectsCrossPageIterator docCheckboxObjectsCrossPageIterator);

    public static final native long new_DocCheckboxObjectsIterator(long j, DocCheckboxObjectsIterator docCheckboxObjectsIterator);

    public static final native long new_DocDocumentFieldsInfoIterator(long j, DocDocumentFieldsInfoIterator docDocumentFieldsInfoIterator);

    public static final native long new_DocDocumentTableFieldColumnsInfoInterator(long j, DocDocumentTableFieldColumnsInfoInterator docDocumentTableFieldColumnsInfoInterator);

    public static final native long new_DocExternalProcessorInterface();

    public static final native long new_DocFeedback();

    public static final native long new_DocForensicCheckFieldsIterator(long j, DocForensicCheckFieldsIterator docForensicCheckFieldsIterator);

    public static final native long new_DocForensicCheckObjectsCrossPageIterator(long j, DocForensicCheckObjectsCrossPageIterator docForensicCheckObjectsCrossPageIterator);

    public static final native long new_DocForensicCheckObjectsIterator(long j, DocForensicCheckObjectsIterator docForensicCheckObjectsIterator);

    public static final native long new_DocForensicFieldsIterator(long j, DocForensicFieldsIterator docForensicFieldsIterator);

    public static final native long new_DocImageFieldsIterator(long j, DocImageFieldsIterator docImageFieldsIterator);

    public static final native long new_DocImageObjectsCrossPageIterator(long j, DocImageObjectsCrossPageIterator docImageObjectsCrossPageIterator);

    public static final native long new_DocImageObjectsIterator(long j, DocImageObjectsIterator docImageObjectsIterator);

    public static final native long new_DocMetaObjectsCrossPageIterator(long j, DocMetaObjectsCrossPageIterator docMetaObjectsCrossPageIterator);

    public static final native long new_DocMetaObjectsIterator(long j, DocMetaObjectsIterator docMetaObjectsIterator);

    public static final native long new_DocObjectsCollectionsIterator(long j, DocObjectsCollectionsIterator docObjectsCollectionsIterator);

    public static final native long new_DocObjectsCollectionsMutableIterator(long j, DocObjectsCollectionsMutableIterator docObjectsCollectionsMutableIterator);

    public static final native long new_DocObjectsCollectionsMutableSliceIterator(long j, DocObjectsCollectionsMutableSliceIterator docObjectsCollectionsMutableSliceIterator);

    public static final native long new_DocObjectsCollectionsSliceIterator(long j, DocObjectsCollectionsSliceIterator docObjectsCollectionsSliceIterator);

    public static final native long new_DocTableFieldsIterator(long j, DocTableFieldsIterator docTableFieldsIterator);

    public static final native long new_DocTableObjectsCrossPageIterator(long j, DocTableObjectsCrossPageIterator docTableObjectsCrossPageIterator);

    public static final native long new_DocTableObjectsIterator(long j, DocTableObjectsIterator docTableObjectsIterator);

    public static final native long new_DocTextFieldsIterator(long j, DocTextFieldsIterator docTextFieldsIterator);

    public static final native long new_DocTextObjectsCrossPageIterator(long j, DocTextObjectsCrossPageIterator docTextObjectsCrossPageIterator);

    public static final native long new_DocTextObjectsIterator(long j, DocTextObjectsIterator docTextObjectsIterator);

    public static final native long new_DocViewsIterator(long j, DocViewsIterator docViewsIterator);

    public static final native long new_DocViewsMutableIterator(long j, DocViewsMutableIterator docViewsMutableIterator);

    public static final native long new_DocViewsMutableSliceIterator(long j, DocViewsMutableSliceIterator docViewsMutableSliceIterator);

    public static final native long new_DocViewsSliceIterator(long j, DocViewsSliceIterator docViewsSliceIterator);

    public static final native long new_DocumentsIterator(long j, DocumentsIterator documentsIterator);

    public static final native long new_DocumentsMutableIterator(long j, DocumentsMutableIterator documentsMutableIterator);

    public static final native long new_DocumentsMutableSliceIterator(long j, DocumentsMutableSliceIterator documentsMutableSliceIterator);

    public static final native long new_DocumentsSliceIterator(long j, DocumentsSliceIterator documentsSliceIterator);

    private static final native void swig_module_init();

    public static void SwigDirector_DocFeedback_FeedbackReceived(DocFeedback docFeedback, long j) {
        docFeedback.FeedbackReceived(new DocFeedbackContainer(j, false));
    }

    public static boolean SwigDirector_DocFeedback_AcceptsPagesLocalizationFeedback(DocFeedback docFeedback) {
        return docFeedback.AcceptsPagesLocalizationFeedback();
    }

    public static void SwigDirector_DocFeedback_PagesLocalizationFeedbackReceived(DocFeedback docFeedback, long j) {
        docFeedback.PagesLocalizationFeedbackReceived(new DocPagesFeedbackContainer(j, false));
    }

    public static boolean SwigDirector_DocFeedback_AcceptsPagePreprocessingFeedback(DocFeedback docFeedback) {
        return docFeedback.AcceptsPagePreprocessingFeedback();
    }

    public static void SwigDirector_DocFeedback_PagePrepocessingFeedbackReceived(DocFeedback docFeedback, long j) {
        docFeedback.PagePrepocessingFeedbackReceived(new DocPagesFeedbackContainer(j, false));
    }

    public static boolean SwigDirector_DocFeedback_AcceptsRawFieldsLocalizationFeedback(DocFeedback docFeedback) {
        return docFeedback.AcceptsRawFieldsLocalizationFeedback();
    }

    public static void SwigDirector_DocFeedback_RawFieldsLocalizationFeedbackReceived(DocFeedback docFeedback, long j) {
        docFeedback.RawFieldsLocalizationFeedbackReceived(new DocRawFieldsFeedbackContainer(j, false));
    }

    public static boolean SwigDirector_DocFeedback_AcceptsRawFieldsRecognitionFeedback(DocFeedback docFeedback) {
        return docFeedback.AcceptsRawFieldsRecognitionFeedback();
    }

    public static void SwigDirector_DocFeedback_RawFiedlsRecognitionFeedbackReceived(DocFeedback docFeedback, long j) {
        docFeedback.RawFiedlsRecognitionFeedbackReceived(new DocRawFieldsFeedbackContainer(j, false));
    }

    public static void SwigDirector_DocFeedback_ResultReceived(DocFeedback docFeedback, long j) {
        docFeedback.ResultReceived(new DocResult(j, false));
    }

    public static void SwigDirector_DocExternalProcessorInterface_Process(DocExternalProcessorInterface docExternalProcessorInterface, long j, long j2, long j3) {
        docExternalProcessorInterface.Process(new DocResult(j, false), new DocProcessingSettings(j2, false), new DocProcessingArguments(j3, false));
    }

    static {
        swig_module_init();
    }
}
