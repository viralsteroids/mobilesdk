.class public Lcom/smartengines/doc/jnidocengineJNI;
.super Ljava/lang/Object;
.source "jnidocengineJNI.java"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 989
    invoke-static {}, Lcom/smartengines/doc/jnidocengineJNI;->swig_module_init()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final native DocBarcodeField_GetBaseFieldInfo(JLcom/smartengines/doc/DocBarcodeField;)J
.end method

.method public static final native DocBarcodeField_GetDecodedString(JLcom/smartengines/doc/DocBarcodeField;)J
.end method

.method public static final native DocBarcodeField_GetMutableBaseFieldInfo(JLcom/smartengines/doc/DocBarcodeField;)J
.end method

.method public static final native DocBarcodeField_GetMutableDecodedString(JLcom/smartengines/doc/DocBarcodeField;)J
.end method

.method public static final native DocBarcodeField_Serialize(JLcom/smartengines/doc/DocBarcodeField;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native DocBarcodeField_SetDecodedString(JLcom/smartengines/doc/DocBarcodeField;JLcom/smartengines/common/MutableString;)V
.end method

.method public static final native DocBarcodeFieldsIterator_Advance(JLcom/smartengines/doc/DocBarcodeFieldsIterator;)V
.end method

.method public static final native DocBarcodeFieldsIterator_Equals(JLcom/smartengines/doc/DocBarcodeFieldsIterator;JLcom/smartengines/doc/DocBarcodeFieldsIterator;)Z
.end method

.method public static final native DocBarcodeFieldsIterator_GetField(JLcom/smartengines/doc/DocBarcodeFieldsIterator;)J
.end method

.method public static final native DocBarcodeFieldsIterator_GetKey(JLcom/smartengines/doc/DocBarcodeFieldsIterator;)Ljava/lang/String;
.end method

.method public static final native DocBarcodeObject_GetDecodedString(JLcom/smartengines/doc/DocBarcodeObject;)J
.end method

.method public static final native DocBarcodeObject_GetMutableDecodedString(JLcom/smartengines/doc/DocBarcodeObject;)J
.end method

.method public static final native DocBarcodeObject_ObjectTypeStatic()Ljava/lang/String;
.end method

.method public static final native DocBarcodeObject_SWIGUpcast(J)J
.end method

.method public static final native DocBarcodeObject_SetDecodedString(JLcom/smartengines/doc/DocBarcodeObject;JLcom/smartengines/common/MutableString;)V
.end method

.method public static final native DocBarcodeObjectsCrossPageIterator_Advance(JLcom/smartengines/doc/DocBarcodeObjectsCrossPageIterator;)V
.end method

.method public static final native DocBarcodeObjectsCrossPageIterator_Equals(JLcom/smartengines/doc/DocBarcodeObjectsCrossPageIterator;JLcom/smartengines/doc/DocBarcodeObjectsCrossPageIterator;)Z
.end method

.method public static final native DocBarcodeObjectsCrossPageIterator_GetBarcodeObject(JLcom/smartengines/doc/DocBarcodeObjectsCrossPageIterator;)J
.end method

.method public static final native DocBarcodeObjectsCrossPageIterator_GetBarcodeObjectPtr(JLcom/smartengines/doc/DocBarcodeObjectsCrossPageIterator;)J
.end method

.method public static final native DocBarcodeObjectsCrossPageIterator_GetObjectID(JLcom/smartengines/doc/DocBarcodeObjectsCrossPageIterator;)I
.end method

.method public static final native DocBarcodeObjectsCrossPageIterator_GetPhysicalPageID(JLcom/smartengines/doc/DocBarcodeObjectsCrossPageIterator;)I
.end method

.method public static final native DocBarcodeObjectsIterator_Advance(JLcom/smartengines/doc/DocBarcodeObjectsIterator;)V
.end method

.method public static final native DocBarcodeObjectsIterator_Equals(JLcom/smartengines/doc/DocBarcodeObjectsIterator;JLcom/smartengines/doc/DocBarcodeObjectsIterator;)Z
.end method

.method public static final native DocBarcodeObjectsIterator_GetBarcodeObject(JLcom/smartengines/doc/DocBarcodeObjectsIterator;)J
.end method

.method public static final native DocBarcodeObjectsIterator_GetBarcodeObjectPtr(JLcom/smartengines/doc/DocBarcodeObjectsIterator;)J
.end method

.method public static final native DocBaseFieldInfo_AttributesBegin(JLcom/smartengines/doc/DocBaseFieldInfo;)J
.end method

.method public static final native DocBaseFieldInfo_AttributesEnd(JLcom/smartengines/doc/DocBaseFieldInfo;)J
.end method

.method public static final native DocBaseFieldInfo_ConnectBasicObject(JLcom/smartengines/doc/DocBaseFieldInfo;II)V
.end method

.method public static final native DocBaseFieldInfo_ConnectedBarcodeObjectsBegin(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J
.end method

.method public static final native DocBaseFieldInfo_ConnectedBarcodeObjectsEnd(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J
.end method

.method public static final native DocBaseFieldInfo_ConnectedBasicObjectsBegin(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocGraphicalStructure;)J
.end method

.method public static final native DocBaseFieldInfo_ConnectedBasicObjectsEnd(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocGraphicalStructure;)J
.end method

.method public static final native DocBaseFieldInfo_ConnectedCheckboxObjectsBegin(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J
.end method

.method public static final native DocBaseFieldInfo_ConnectedCheckboxObjectsEnd(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J
.end method

.method public static final native DocBaseFieldInfo_ConnectedForensicCheckObjectsBegin(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J
.end method

.method public static final native DocBaseFieldInfo_ConnectedForensicCheckObjectsEnd(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J
.end method

.method public static final native DocBaseFieldInfo_ConnectedForensicObjectsBegin(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J
.end method

.method public static final native DocBaseFieldInfo_ConnectedForensicObjectsEnd(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J
.end method

.method public static final native DocBaseFieldInfo_ConnectedImageObjectsBegin(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J
.end method

.method public static final native DocBaseFieldInfo_ConnectedImageObjectsEnd(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J
.end method

.method public static final native DocBaseFieldInfo_ConnectedTableObjectsBegin(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J
.end method

.method public static final native DocBaseFieldInfo_ConnectedTableObjectsEnd(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J
.end method

.method public static final native DocBaseFieldInfo_ConnectedTextObjectsBegin(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J
.end method

.method public static final native DocBaseFieldInfo_ConnectedTextObjectsEnd(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocPhysicalDocument;)J
.end method

.method public static final native DocBaseFieldInfo_GetAcceptFlag(JLcom/smartengines/doc/DocBaseFieldInfo;)Z
.end method

.method public static final native DocBaseFieldInfo_GetAttribute(JLcom/smartengines/doc/DocBaseFieldInfo;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native DocBaseFieldInfo_GetAttributesCount(JLcom/smartengines/doc/DocBaseFieldInfo;)I
.end method

.method public static final native DocBaseFieldInfo_GetConfidence(JLcom/smartengines/doc/DocBaseFieldInfo;)D
.end method

.method public static final native DocBaseFieldInfo_GetName(JLcom/smartengines/doc/DocBaseFieldInfo;)Ljava/lang/String;
.end method

.method public static final native DocBaseFieldInfo_HasAttribute(JLcom/smartengines/doc/DocBaseFieldInfo;Ljava/lang/String;)Z
.end method

.method public static final native DocBaseFieldInfo_IsFictive(JLcom/smartengines/doc/DocBaseFieldInfo;)Z
.end method

.method public static final native DocBaseFieldInfo_IsValid(JLcom/smartengines/doc/DocBaseFieldInfo;)Z
.end method

.method public static final native DocBaseFieldInfo_MutableConnectedBasicObjectsBegin(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocGraphicalStructure;)J
.end method

.method public static final native DocBaseFieldInfo_MutableConnectedBasicObjectsEnd(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/doc/DocGraphicalStructure;)J
.end method

.method public static final native DocBaseFieldInfo_RemoveAttribute(JLcom/smartengines/doc/DocBaseFieldInfo;Ljava/lang/String;)V
.end method

.method public static final native DocBaseFieldInfo_Serialize(JLcom/smartengines/doc/DocBaseFieldInfo;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native DocBaseFieldInfo_SetAcceptFlag(JLcom/smartengines/doc/DocBaseFieldInfo;Z)V
.end method

.method public static final native DocBaseFieldInfo_SetAttribute(JLcom/smartengines/doc/DocBaseFieldInfo;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static final native DocBaseFieldInfo_SetConfidence(JLcom/smartengines/doc/DocBaseFieldInfo;D)V
.end method

.method public static final native DocBaseFieldInfo_SetName(JLcom/smartengines/doc/DocBaseFieldInfo;Ljava/lang/String;)V
.end method

.method public static final native DocBaseObjectInfo_AttributesBegin(JLcom/smartengines/doc/DocBaseObjectInfo;)J
.end method

.method public static final native DocBaseObjectInfo_AttributesEnd(JLcom/smartengines/doc/DocBaseObjectInfo;)J
.end method

.method public static final native DocBaseObjectInfo_GetAcceptFlag(JLcom/smartengines/doc/DocBaseObjectInfo;)Z
.end method

.method public static final native DocBaseObjectInfo_GetAttribute(JLcom/smartengines/doc/DocBaseObjectInfo;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native DocBaseObjectInfo_GetAttributesCount(JLcom/smartengines/doc/DocBaseObjectInfo;)I
.end method

.method public static final native DocBaseObjectInfo_GetConfidence(JLcom/smartengines/doc/DocBaseObjectInfo;)D
.end method

.method public static final native DocBaseObjectInfo_GetGeometry(JLcom/smartengines/doc/DocBaseObjectInfo;)J
.end method

.method public static final native DocBaseObjectInfo_GetGeometryOnPage(JLcom/smartengines/doc/DocBaseObjectInfo;)J
.end method

.method public static final native DocBaseObjectInfo_GetGeometryOnPagePtr(JLcom/smartengines/doc/DocBaseObjectInfo;)J
.end method

.method public static final native DocBaseObjectInfo_GetGeometryOnScene(JLcom/smartengines/doc/DocBaseObjectInfo;)J
.end method

.method public static final native DocBaseObjectInfo_GetGeometryOnScenePtr(JLcom/smartengines/doc/DocBaseObjectInfo;)J
.end method

.method public static final native DocBaseObjectInfo_GetMutableGeometry(JLcom/smartengines/doc/DocBaseObjectInfo;)J
.end method

.method public static final native DocBaseObjectInfo_GetViewID(JLcom/smartengines/doc/DocBaseObjectInfo;)I
.end method

.method public static final native DocBaseObjectInfo_HasAttribute(JLcom/smartengines/doc/DocBaseObjectInfo;Ljava/lang/String;)Z
.end method

.method public static final native DocBaseObjectInfo_RemoveAttribute(JLcom/smartengines/doc/DocBaseObjectInfo;Ljava/lang/String;)V
.end method

.method public static final native DocBaseObjectInfo_Serialize(JLcom/smartengines/doc/DocBaseObjectInfo;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native DocBaseObjectInfo_SetAcceptFlag(JLcom/smartengines/doc/DocBaseObjectInfo;Z)V
.end method

.method public static final native DocBaseObjectInfo_SetAttribute(JLcom/smartengines/doc/DocBaseObjectInfo;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static final native DocBaseObjectInfo_SetConfidence(JLcom/smartengines/doc/DocBaseObjectInfo;D)V
.end method

.method public static final native DocBaseObjectInfo_SetGeometry(JLcom/smartengines/doc/DocBaseObjectInfo;JLcom/smartengines/common/Polygon;)V
.end method

.method public static final native DocBaseObjectInfo_SetViewID(JLcom/smartengines/doc/DocBaseObjectInfo;I)V
.end method

.method public static final native DocBasicObject_BaseClassNameStatic()Ljava/lang/String;
.end method

.method public static final native DocBasicObject_GetBaseObjectInfo(JLcom/smartengines/doc/DocBasicObject;)J
.end method

.method public static final native DocBasicObject_GetMutableBaseObjectInfo(JLcom/smartengines/doc/DocBasicObject;)J
.end method

.method public static final native DocBasicObject_ObjectType(JLcom/smartengines/doc/DocBasicObject;)Ljava/lang/String;
.end method

.method public static final native DocBasicObject_Serialize(JLcom/smartengines/doc/DocBasicObject;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native DocBasicObjectsCrossSliceIterator_Advance(JLcom/smartengines/doc/DocBasicObjectsCrossSliceIterator;)V
.end method

.method public static final native DocBasicObjectsCrossSliceIterator_Equals(JLcom/smartengines/doc/DocBasicObjectsCrossSliceIterator;JLcom/smartengines/doc/DocBasicObjectsCrossSliceIterator;)Z
.end method

.method public static final native DocBasicObjectsCrossSliceIterator_GetBasicObject(JLcom/smartengines/doc/DocBasicObjectsCrossSliceIterator;)J
.end method

.method public static final native DocBasicObjectsCrossSliceIterator_GetCollectionID(JLcom/smartengines/doc/DocBasicObjectsCrossSliceIterator;)I
.end method

.method public static final native DocBasicObjectsCrossSliceIterator_GetObjectID(JLcom/smartengines/doc/DocBasicObjectsCrossSliceIterator;)I
.end method

.method public static final native DocBasicObjectsCrossSliceIterator_GetTags(JLcom/smartengines/doc/DocBasicObjectsCrossSliceIterator;)J
.end method

.method public static final native DocBasicObjectsIterator_Advance(JLcom/smartengines/doc/DocBasicObjectsIterator;)V
.end method

.method public static final native DocBasicObjectsIterator_Equals(JLcom/smartengines/doc/DocBasicObjectsIterator;JLcom/smartengines/doc/DocBasicObjectsIterator;)Z
.end method

.method public static final native DocBasicObjectsIterator_GetBasicObject(JLcom/smartengines/doc/DocBasicObjectsIterator;)J
.end method

.method public static final native DocBasicObjectsIterator_GetID(JLcom/smartengines/doc/DocBasicObjectsIterator;)I
.end method

.method public static final native DocBasicObjectsIterator_GetTags(JLcom/smartengines/doc/DocBasicObjectsIterator;)J
.end method

.method public static final native DocBasicObjectsMutableCrossSliceIterator_Advance(JLcom/smartengines/doc/DocBasicObjectsMutableCrossSliceIterator;)V
.end method

.method public static final native DocBasicObjectsMutableCrossSliceIterator_Equals(JLcom/smartengines/doc/DocBasicObjectsMutableCrossSliceIterator;JLcom/smartengines/doc/DocBasicObjectsMutableCrossSliceIterator;)Z
.end method

.method public static final native DocBasicObjectsMutableCrossSliceIterator_GetBasicObject(JLcom/smartengines/doc/DocBasicObjectsMutableCrossSliceIterator;)J
.end method

.method public static final native DocBasicObjectsMutableCrossSliceIterator_GetCollectionID(JLcom/smartengines/doc/DocBasicObjectsMutableCrossSliceIterator;)I
.end method

.method public static final native DocBasicObjectsMutableCrossSliceIterator_GetMutableBasicObject(JLcom/smartengines/doc/DocBasicObjectsMutableCrossSliceIterator;)J
.end method

.method public static final native DocBasicObjectsMutableCrossSliceIterator_GetObjectID(JLcom/smartengines/doc/DocBasicObjectsMutableCrossSliceIterator;)I
.end method

.method public static final native DocBasicObjectsMutableCrossSliceIterator_GetTags(JLcom/smartengines/doc/DocBasicObjectsMutableCrossSliceIterator;)J
.end method

.method public static final native DocBasicObjectsMutableIterator_Advance(JLcom/smartengines/doc/DocBasicObjectsMutableIterator;)V
.end method

.method public static final native DocBasicObjectsMutableIterator_Equals(JLcom/smartengines/doc/DocBasicObjectsMutableIterator;JLcom/smartengines/doc/DocBasicObjectsMutableIterator;)Z
.end method

.method public static final native DocBasicObjectsMutableIterator_GetBasicObject(JLcom/smartengines/doc/DocBasicObjectsMutableIterator;)J
.end method

.method public static final native DocBasicObjectsMutableIterator_GetID(JLcom/smartengines/doc/DocBasicObjectsMutableIterator;)I
.end method

.method public static final native DocBasicObjectsMutableIterator_GetMutableBasicObject(JLcom/smartengines/doc/DocBasicObjectsMutableIterator;)J
.end method

.method public static final native DocBasicObjectsMutableIterator_GetTags(JLcom/smartengines/doc/DocBasicObjectsMutableIterator;)J
.end method

.method public static final native DocBasicObjectsMutableSliceIterator_Advance(JLcom/smartengines/doc/DocBasicObjectsMutableSliceIterator;)V
.end method

.method public static final native DocBasicObjectsMutableSliceIterator_Finished(JLcom/smartengines/doc/DocBasicObjectsMutableSliceIterator;)Z
.end method

.method public static final native DocBasicObjectsMutableSliceIterator_GetBasicObject(JLcom/smartengines/doc/DocBasicObjectsMutableSliceIterator;)J
.end method

.method public static final native DocBasicObjectsMutableSliceIterator_GetID(JLcom/smartengines/doc/DocBasicObjectsMutableSliceIterator;)I
.end method

.method public static final native DocBasicObjectsMutableSliceIterator_GetMutableBasicObject(JLcom/smartengines/doc/DocBasicObjectsMutableSliceIterator;)J
.end method

.method public static final native DocBasicObjectsMutableSliceIterator_GetTags(JLcom/smartengines/doc/DocBasicObjectsMutableSliceIterator;)J
.end method

.method public static final native DocBasicObjectsSliceIterator_Advance(JLcom/smartengines/doc/DocBasicObjectsSliceIterator;)V
.end method

.method public static final native DocBasicObjectsSliceIterator_Finished(JLcom/smartengines/doc/DocBasicObjectsSliceIterator;)Z
.end method

.method public static final native DocBasicObjectsSliceIterator_GetBasicObject(JLcom/smartengines/doc/DocBasicObjectsSliceIterator;)J
.end method

.method public static final native DocBasicObjectsSliceIterator_GetID(JLcom/smartengines/doc/DocBasicObjectsSliceIterator;)I
.end method

.method public static final native DocBasicObjectsSliceIterator_GetTags(JLcom/smartengines/doc/DocBasicObjectsSliceIterator;)J
.end method

.method public static final native DocCheckboxField_GetBaseFieldInfo(JLcom/smartengines/doc/DocCheckboxField;)J
.end method

.method public static final native DocCheckboxField_GetMutableBaseFieldInfo(JLcom/smartengines/doc/DocCheckboxField;)J
.end method

.method public static final native DocCheckboxField_GetTickStatus(JLcom/smartengines/doc/DocCheckboxField;)Z
.end method

.method public static final native DocCheckboxField_Serialize(JLcom/smartengines/doc/DocCheckboxField;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native DocCheckboxField_SetTickStatus(JLcom/smartengines/doc/DocCheckboxField;Z)V
.end method

.method public static final native DocCheckboxFieldsIterator_Advance(JLcom/smartengines/doc/DocCheckboxFieldsIterator;)V
.end method

.method public static final native DocCheckboxFieldsIterator_Equals(JLcom/smartengines/doc/DocCheckboxFieldsIterator;JLcom/smartengines/doc/DocCheckboxFieldsIterator;)Z
.end method

.method public static final native DocCheckboxFieldsIterator_GetField(JLcom/smartengines/doc/DocCheckboxFieldsIterator;)J
.end method

.method public static final native DocCheckboxFieldsIterator_GetKey(JLcom/smartengines/doc/DocCheckboxFieldsIterator;)Ljava/lang/String;
.end method

.method public static final native DocCheckboxObject_GetMutableOcrString(JLcom/smartengines/doc/DocCheckboxObject;)J
.end method

.method public static final native DocCheckboxObject_GetOcrString(JLcom/smartengines/doc/DocCheckboxObject;)J
.end method

.method public static final native DocCheckboxObject_ObjectTypeStatic()Ljava/lang/String;
.end method

.method public static final native DocCheckboxObject_SWIGUpcast(J)J
.end method

.method public static final native DocCheckboxObject_SetOcrString(JLcom/smartengines/doc/DocCheckboxObject;JLcom/smartengines/common/OcrString;)V
.end method

.method public static final native DocCheckboxObjectsCrossPageIterator_Advance(JLcom/smartengines/doc/DocCheckboxObjectsCrossPageIterator;)V
.end method

.method public static final native DocCheckboxObjectsCrossPageIterator_Equals(JLcom/smartengines/doc/DocCheckboxObjectsCrossPageIterator;JLcom/smartengines/doc/DocCheckboxObjectsCrossPageIterator;)Z
.end method

.method public static final native DocCheckboxObjectsCrossPageIterator_GetCheckboxObject(JLcom/smartengines/doc/DocCheckboxObjectsCrossPageIterator;)J
.end method

.method public static final native DocCheckboxObjectsCrossPageIterator_GetObjectID(JLcom/smartengines/doc/DocCheckboxObjectsCrossPageIterator;)I
.end method

.method public static final native DocCheckboxObjectsCrossPageIterator_GetPhysicalPageID(JLcom/smartengines/doc/DocCheckboxObjectsCrossPageIterator;)I
.end method

.method public static final native DocCheckboxObjectsIterator_Advance(JLcom/smartengines/doc/DocCheckboxObjectsIterator;)V
.end method

.method public static final native DocCheckboxObjectsIterator_Equals(JLcom/smartengines/doc/DocCheckboxObjectsIterator;JLcom/smartengines/doc/DocCheckboxObjectsIterator;)Z
.end method

.method public static final native DocCheckboxObjectsIterator_GetCheckboxObject(JLcom/smartengines/doc/DocCheckboxObjectsIterator;)J
.end method

.method public static final native DocDocumentFieldInfo_DocumentTableFieldColumnsInfoInteratorBegin(JLcom/smartengines/doc/DocDocumentFieldInfo;)J
.end method

.method public static final native DocDocumentFieldInfo_DocumentTableFieldColumnsInfoInteratorEnd(JLcom/smartengines/doc/DocDocumentFieldInfo;)J
.end method

.method public static final native DocDocumentFieldInfo_GetDocumentFieldCategory(JLcom/smartengines/doc/DocDocumentFieldInfo;)Ljava/lang/String;
.end method

.method public static final native DocDocumentFieldInfo_GetDocumentFieldExtFormat(JLcom/smartengines/doc/DocDocumentFieldInfo;)Ljava/lang/String;
.end method

.method public static final native DocDocumentFieldInfo_GetDocumentFieldFormat(JLcom/smartengines/doc/DocDocumentFieldInfo;)Ljava/lang/String;
.end method

.method public static final native DocDocumentFieldInfo_GetDocumentFieldName(JLcom/smartengines/doc/DocDocumentFieldInfo;)Ljava/lang/String;
.end method

.method public static final native DocDocumentFieldInfo_GetDocumentFieldNameLocal(JLcom/smartengines/doc/DocDocumentFieldInfo;)Ljava/lang/String;
.end method

.method public static final native DocDocumentFieldInfo_GetDocumentFieldShortNameLocal(JLcom/smartengines/doc/DocDocumentFieldInfo;)Ljava/lang/String;
.end method

.method public static final native DocDocumentFieldInfo_GetDocumentFieldType(JLcom/smartengines/doc/DocDocumentFieldInfo;)Ljava/lang/String;
.end method

.method public static final native DocDocumentFieldInfo_GetDocumentTableFieldColumnInfo(JLcom/smartengines/doc/DocDocumentFieldInfo;Ljava/lang/String;)J
.end method

.method public static final native DocDocumentFieldInfo_GetDocumentTableFieldColumnInfoPtr(JLcom/smartengines/doc/DocDocumentFieldInfo;Ljava/lang/String;)J
.end method

.method public static final native DocDocumentFieldsInfoIterator_Advance(JLcom/smartengines/doc/DocDocumentFieldsInfoIterator;)V
.end method

.method public static final native DocDocumentFieldsInfoIterator_Equals(JLcom/smartengines/doc/DocDocumentFieldsInfoIterator;JLcom/smartengines/doc/DocDocumentFieldsInfoIterator;)Z
.end method

.method public static final native DocDocumentFieldsInfoIterator_GetDocumentFieldInfo(JLcom/smartengines/doc/DocDocumentFieldsInfoIterator;)J
.end method

.method public static final native DocDocumentFieldsInfoIterator_GetKey(JLcom/smartengines/doc/DocDocumentFieldsInfoIterator;)Ljava/lang/String;
.end method

.method public static final native DocDocumentInfo_DocumentFieldsInfoBegin(JLcom/smartengines/doc/DocDocumentInfo;)J
.end method

.method public static final native DocDocumentInfo_DocumentFieldsInfoEnd(JLcom/smartengines/doc/DocDocumentInfo;)J
.end method

.method public static final native DocDocumentInfo_GetDocumentFieldInfo(JLcom/smartengines/doc/DocDocumentInfo;Ljava/lang/String;)J
.end method

.method public static final native DocDocumentInfo_GetDocumentMultipageInfo(JLcom/smartengines/doc/DocDocumentInfo;)Z
.end method

.method public static final native DocDocumentInfo_GetDocumentName(JLcom/smartengines/doc/DocDocumentInfo;)Ljava/lang/String;
.end method

.method public static final native DocDocumentInfo_GetDocumentNameLocal(JLcom/smartengines/doc/DocDocumentInfo;)Ljava/lang/String;
.end method

.method public static final native DocDocumentInfo_GetDocumentNoFields(JLcom/smartengines/doc/DocDocumentInfo;)Z
.end method

.method public static final native DocDocumentInfo_GetDocumentShortNameLocal(JLcom/smartengines/doc/DocDocumentInfo;)Ljava/lang/String;
.end method

.method public static final native DocDocumentTableFieldColumnInfo_GetDocumentTableFieldColumnExtFormat(JLcom/smartengines/doc/DocDocumentTableFieldColumnInfo;)Ljava/lang/String;
.end method

.method public static final native DocDocumentTableFieldColumnInfo_GetDocumentTableFieldColumnFormat(JLcom/smartengines/doc/DocDocumentTableFieldColumnInfo;)Ljava/lang/String;
.end method

.method public static final native DocDocumentTableFieldColumnInfo_GetDocumentTableFieldColumnName(JLcom/smartengines/doc/DocDocumentTableFieldColumnInfo;)Ljava/lang/String;
.end method

.method public static final native DocDocumentTableFieldColumnInfo_GetDocumentTableFieldColumnNameLocal(JLcom/smartengines/doc/DocDocumentTableFieldColumnInfo;)Ljava/lang/String;
.end method

.method public static final native DocDocumentTableFieldColumnInfo_GetDocumentTableFieldColumnShortNameLocal(JLcom/smartengines/doc/DocDocumentTableFieldColumnInfo;)Ljava/lang/String;
.end method

.method public static final native DocDocumentTableFieldColumnInfo_GetDocumentTableFieldColumnType(JLcom/smartengines/doc/DocDocumentTableFieldColumnInfo;)Ljava/lang/String;
.end method

.method public static final native DocDocumentTableFieldColumnsInfoInterator_Advance(JLcom/smartengines/doc/DocDocumentTableFieldColumnsInfoInterator;)V
.end method

.method public static final native DocDocumentTableFieldColumnsInfoInterator_Equals(JLcom/smartengines/doc/DocDocumentTableFieldColumnsInfoInterator;JLcom/smartengines/doc/DocDocumentTableFieldColumnsInfoInterator;)Z
.end method

.method public static final native DocDocumentTableFieldColumnsInfoInterator_GetDocumentTableFieldColumnInfo(JLcom/smartengines/doc/DocDocumentTableFieldColumnsInfoInterator;)J
.end method

.method public static final native DocDocumentTableFieldColumnsInfoInterator_GetDocumentTableFieldColumnInfoPtr(JLcom/smartengines/doc/DocDocumentTableFieldColumnsInfoInterator;)J
.end method

.method public static final native DocDocumentTableFieldColumnsInfoInterator_GetKey(JLcom/smartengines/doc/DocDocumentTableFieldColumnsInfoInterator;)Ljava/lang/String;
.end method

.method public static final native DocEngine_CreateFromEmbeddedBundle__SWIG_0(Z)J
.end method

.method public static final native DocEngine_CreateFromEmbeddedBundle__SWIG_1()J
.end method

.method public static final native DocEngine_CreateSessionSettings(JLcom/smartengines/doc/DocEngine;)J
.end method

.method public static final native DocEngine_CreateVideoSessionSettings(JLcom/smartengines/doc/DocEngine;)J
.end method

.method public static final native DocEngine_Create__SWIG_0(Ljava/lang/String;Z)J
.end method

.method public static final native DocEngine_Create__SWIG_1(Ljava/lang/String;)J
.end method

.method public static final native DocEngine_Create__SWIG_2([BZ)J
.end method

.method public static final native DocEngine_Create__SWIG_3([B)J
.end method

.method public static final native DocEngine_GetVersion()Ljava/lang/String;
.end method

.method public static final native DocEngine_SpawnSession__SWIG_0(JLcom/smartengines/doc/DocEngine;JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;JLcom/smartengines/doc/DocFeedback;)J
.end method

.method public static final native DocEngine_SpawnSession__SWIG_1(JLcom/smartengines/doc/DocEngine;JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native DocEngine_SpawnSession__SWIG_2(JLcom/smartengines/doc/DocEngine;JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;JLcom/smartengines/doc/DocFeedback;JLcom/smartengines/doc/DocExternalProcessorInterface;)J
.end method

.method public static final native DocEngine_SpawnVideoSession__SWIG_0(JLcom/smartengines/doc/DocEngine;JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;JLcom/smartengines/doc/DocFeedback;)J
.end method

.method public static final native DocEngine_SpawnVideoSession__SWIG_1(JLcom/smartengines/doc/DocEngine;JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native DocExternalProcessorInterface_Process(JLcom/smartengines/doc/DocExternalProcessorInterface;JLcom/smartengines/doc/DocResult;JLcom/smartengines/doc/DocProcessingSettings;JLcom/smartengines/doc/DocProcessingArguments;)V
.end method

.method public static final native DocExternalProcessorInterface_change_ownership(Lcom/smartengines/doc/DocExternalProcessorInterface;JZ)V
.end method

.method public static final native DocExternalProcessorInterface_director_connect(Lcom/smartengines/doc/DocExternalProcessorInterface;JZZ)V
.end method

.method public static final native DocFeedbackContainer_FeedbackFieldIteratorBegin(JLcom/smartengines/doc/DocFeedbackContainer;)J
.end method

.method public static final native DocFeedbackContainer_FeedbackFieldIteratorEnd(JLcom/smartengines/doc/DocFeedbackContainer;)J
.end method

.method public static final native DocFeedbackContainer_FeedbackQuadIteratorBegin(JLcom/smartengines/doc/DocFeedbackContainer;)J
.end method

.method public static final native DocFeedbackContainer_FeedbackQuadIteratorEnd(JLcom/smartengines/doc/DocFeedbackContainer;)J
.end method

.method public static final native DocFeedbackContainer_SetFeedbackField(JLcom/smartengines/doc/DocFeedbackContainer;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static final native DocFeedbackContainer_SetFeedbackQuad(JLcom/smartengines/doc/DocFeedbackContainer;Ljava/lang/String;JLcom/smartengines/common/Quadrangle;)V
.end method

.method public static final native DocFeedback_AcceptsPagePreprocessingFeedback(JLcom/smartengines/doc/DocFeedback;)Z
.end method

.method public static final native DocFeedback_AcceptsPagePreprocessingFeedbackSwigExplicitDocFeedback(JLcom/smartengines/doc/DocFeedback;)Z
.end method

.method public static final native DocFeedback_AcceptsPagesLocalizationFeedback(JLcom/smartengines/doc/DocFeedback;)Z
.end method

.method public static final native DocFeedback_AcceptsPagesLocalizationFeedbackSwigExplicitDocFeedback(JLcom/smartengines/doc/DocFeedback;)Z
.end method

.method public static final native DocFeedback_AcceptsRawFieldsLocalizationFeedback(JLcom/smartengines/doc/DocFeedback;)Z
.end method

.method public static final native DocFeedback_AcceptsRawFieldsLocalizationFeedbackSwigExplicitDocFeedback(JLcom/smartengines/doc/DocFeedback;)Z
.end method

.method public static final native DocFeedback_AcceptsRawFieldsRecognitionFeedback(JLcom/smartengines/doc/DocFeedback;)Z
.end method

.method public static final native DocFeedback_AcceptsRawFieldsRecognitionFeedbackSwigExplicitDocFeedback(JLcom/smartengines/doc/DocFeedback;)Z
.end method

.method public static final native DocFeedback_FeedbackReceived(JLcom/smartengines/doc/DocFeedback;JLcom/smartengines/doc/DocFeedbackContainer;)V
.end method

.method public static final native DocFeedback_PagePrepocessingFeedbackReceived(JLcom/smartengines/doc/DocFeedback;JLcom/smartengines/doc/DocPagesFeedbackContainer;)V
.end method

.method public static final native DocFeedback_PagesLocalizationFeedbackReceived(JLcom/smartengines/doc/DocFeedback;JLcom/smartengines/doc/DocPagesFeedbackContainer;)V
.end method

.method public static final native DocFeedback_RawFiedlsRecognitionFeedbackReceived(JLcom/smartengines/doc/DocFeedback;JLcom/smartengines/doc/DocRawFieldsFeedbackContainer;)V
.end method

.method public static final native DocFeedback_RawFieldsLocalizationFeedbackReceived(JLcom/smartengines/doc/DocFeedback;JLcom/smartengines/doc/DocRawFieldsFeedbackContainer;)V
.end method

.method public static final native DocFeedback_ResultReceived(JLcom/smartengines/doc/DocFeedback;JLcom/smartengines/doc/DocResult;)V
.end method

.method public static final native DocFeedback_change_ownership(Lcom/smartengines/doc/DocFeedback;JZ)V
.end method

.method public static final native DocFeedback_director_connect(Lcom/smartengines/doc/DocFeedback;JZZ)V
.end method

.method public static final native DocForensicCheckField_GetBaseFieldInfo(JLcom/smartengines/doc/DocForensicCheckField;)J
.end method

.method public static final native DocForensicCheckField_GetMutableBaseFieldInfo(JLcom/smartengines/doc/DocForensicCheckField;)J
.end method

.method public static final native DocForensicCheckField_GetStatus(JLcom/smartengines/doc/DocForensicCheckField;)Ljava/lang/String;
.end method

.method public static final native DocForensicCheckField_Serialize(JLcom/smartengines/doc/DocForensicCheckField;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native DocForensicCheckField_SetStatus(JLcom/smartengines/doc/DocForensicCheckField;Ljava/lang/String;)V
.end method

.method public static final native DocForensicCheckFieldsIterator_Advance(JLcom/smartengines/doc/DocForensicCheckFieldsIterator;)V
.end method

.method public static final native DocForensicCheckFieldsIterator_Equals(JLcom/smartengines/doc/DocForensicCheckFieldsIterator;JLcom/smartengines/doc/DocForensicCheckFieldsIterator;)Z
.end method

.method public static final native DocForensicCheckFieldsIterator_GetField(JLcom/smartengines/doc/DocForensicCheckFieldsIterator;)J
.end method

.method public static final native DocForensicCheckFieldsIterator_GetKey(JLcom/smartengines/doc/DocForensicCheckFieldsIterator;)Ljava/lang/String;
.end method

.method public static final native DocForensicCheckObject_GetMutableOcrString(JLcom/smartengines/doc/DocForensicCheckObject;)J
.end method

.method public static final native DocForensicCheckObject_GetOcrString(JLcom/smartengines/doc/DocForensicCheckObject;)J
.end method

.method public static final native DocForensicCheckObject_ObjectTypeStatic()Ljava/lang/String;
.end method

.method public static final native DocForensicCheckObject_SWIGUpcast(J)J
.end method

.method public static final native DocForensicCheckObjectsCrossPageIterator_Advance(JLcom/smartengines/doc/DocForensicCheckObjectsCrossPageIterator;)V
.end method

.method public static final native DocForensicCheckObjectsCrossPageIterator_Equals(JLcom/smartengines/doc/DocForensicCheckObjectsCrossPageIterator;JLcom/smartengines/doc/DocForensicCheckObjectsCrossPageIterator;)Z
.end method

.method public static final native DocForensicCheckObjectsCrossPageIterator_GetForensicCheckObject(JLcom/smartengines/doc/DocForensicCheckObjectsCrossPageIterator;)J
.end method

.method public static final native DocForensicCheckObjectsCrossPageIterator_GetPhysicalPageID(JLcom/smartengines/doc/DocForensicCheckObjectsCrossPageIterator;)I
.end method

.method public static final native DocForensicCheckObjectsIterator_Advance(JLcom/smartengines/doc/DocForensicCheckObjectsIterator;)V
.end method

.method public static final native DocForensicCheckObjectsIterator_Equals(JLcom/smartengines/doc/DocForensicCheckObjectsIterator;JLcom/smartengines/doc/DocForensicCheckObjectsIterator;)Z
.end method

.method public static final native DocForensicCheckObjectsIterator_GetForensicCheckObject(JLcom/smartengines/doc/DocForensicCheckObjectsIterator;)J
.end method

.method public static final native DocForensicField_GetBaseFieldInfo(JLcom/smartengines/doc/DocForensicField;)J
.end method

.method public static final native DocForensicField_GetMutableBaseFieldInfo(JLcom/smartengines/doc/DocForensicField;)J
.end method

.method public static final native DocForensicField_GetStatus(JLcom/smartengines/doc/DocForensicField;)Ljava/lang/String;
.end method

.method public static final native DocForensicField_Serialize(JLcom/smartengines/doc/DocForensicField;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native DocForensicField_SetStatus(JLcom/smartengines/doc/DocForensicField;Ljava/lang/String;)V
.end method

.method public static final native DocForensicFieldsIterator_Advance(JLcom/smartengines/doc/DocForensicFieldsIterator;)V
.end method

.method public static final native DocForensicFieldsIterator_Equals(JLcom/smartengines/doc/DocForensicFieldsIterator;JLcom/smartengines/doc/DocForensicFieldsIterator;)Z
.end method

.method public static final native DocForensicFieldsIterator_GetField(JLcom/smartengines/doc/DocForensicFieldsIterator;)J
.end method

.method public static final native DocForensicFieldsIterator_GetKey(JLcom/smartengines/doc/DocForensicFieldsIterator;)Ljava/lang/String;
.end method

.method public static final native DocGraphicalStructure_AddCollection__SWIG_0(JLcom/smartengines/doc/DocGraphicalStructure;JLcom/smartengines/doc/DocObjectsCollection;)J
.end method

.method public static final native DocGraphicalStructure_AddCollection__SWIG_1(JLcom/smartengines/doc/DocGraphicalStructure;JLcom/smartengines/doc/DocObjectsCollection;JLcom/smartengines/doc/DocTagsCollection;)J
.end method

.method public static final native DocGraphicalStructure_GetCollection(JLcom/smartengines/doc/DocGraphicalStructure;I)J
.end method

.method public static final native DocGraphicalStructure_GetCollectionTags(JLcom/smartengines/doc/DocGraphicalStructure;I)J
.end method

.method public static final native DocGraphicalStructure_GetCollectionsCount(JLcom/smartengines/doc/DocGraphicalStructure;)I
.end method

.method public static final native DocGraphicalStructure_GetMutableCollection(JLcom/smartengines/doc/DocGraphicalStructure;I)J
.end method

.method public static final native DocGraphicalStructure_GetMutableViewsCollection(JLcom/smartengines/doc/DocGraphicalStructure;)J
.end method

.method public static final native DocGraphicalStructure_GetViewsCollection(JLcom/smartengines/doc/DocGraphicalStructure;)J
.end method

.method public static final native DocGraphicalStructure_HasCollection(JLcom/smartengines/doc/DocGraphicalStructure;I)Z
.end method

.method public static final native DocGraphicalStructure_MutableObjectsCollectionsBegin(JLcom/smartengines/doc/DocGraphicalStructure;)J
.end method

.method public static final native DocGraphicalStructure_MutableObjectsCollectionsEnd(JLcom/smartengines/doc/DocGraphicalStructure;)J
.end method

.method public static final native DocGraphicalStructure_MutableObjectsCollectionsSlice(JLcom/smartengines/doc/DocGraphicalStructure;Ljava/lang/String;)J
.end method

.method public static final native DocGraphicalStructure_ObjectsCollectionsBegin(JLcom/smartengines/doc/DocGraphicalStructure;)J
.end method

.method public static final native DocGraphicalStructure_ObjectsCollectionsEnd(JLcom/smartengines/doc/DocGraphicalStructure;)J
.end method

.method public static final native DocGraphicalStructure_ObjectsCollectionsSlice(JLcom/smartengines/doc/DocGraphicalStructure;Ljava/lang/String;)J
.end method

.method public static final native DocGraphicalStructure_RemoveCollection(JLcom/smartengines/doc/DocGraphicalStructure;I)V
.end method

.method public static final native DocGraphicalStructure_Serialize(JLcom/smartengines/doc/DocGraphicalStructure;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native DocGraphicalStructure_SetCollection(JLcom/smartengines/doc/DocGraphicalStructure;IJLcom/smartengines/doc/DocObjectsCollection;)V
.end method

.method public static final native DocImageField_GetBaseFieldInfo(JLcom/smartengines/doc/DocImageField;)J
.end method

.method public static final native DocImageField_GetImage(JLcom/smartengines/doc/DocImageField;)J
.end method

.method public static final native DocImageField_GetMutableBaseFieldInfo(JLcom/smartengines/doc/DocImageField;)J
.end method

.method public static final native DocImageField_GetMutableImage(JLcom/smartengines/doc/DocImageField;)J
.end method

.method public static final native DocImageField_Serialize(JLcom/smartengines/doc/DocImageField;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native DocImageField_SetImage(JLcom/smartengines/doc/DocImageField;JLcom/smartengines/common/Image;)V
.end method

.method public static final native DocImageFieldsIterator_Advance(JLcom/smartengines/doc/DocImageFieldsIterator;)V
.end method

.method public static final native DocImageFieldsIterator_Equals(JLcom/smartengines/doc/DocImageFieldsIterator;JLcom/smartengines/doc/DocImageFieldsIterator;)Z
.end method

.method public static final native DocImageFieldsIterator_GetField(JLcom/smartengines/doc/DocImageFieldsIterator;)J
.end method

.method public static final native DocImageFieldsIterator_GetKey(JLcom/smartengines/doc/DocImageFieldsIterator;)Ljava/lang/String;
.end method

.method public static final native DocImageObject_ObjectTypeStatic()Ljava/lang/String;
.end method

.method public static final native DocImageObject_SWIGUpcast(J)J
.end method

.method public static final native DocImageObjectsCrossPageIterator_Advance(JLcom/smartengines/doc/DocImageObjectsCrossPageIterator;)V
.end method

.method public static final native DocImageObjectsCrossPageIterator_Equals(JLcom/smartengines/doc/DocImageObjectsCrossPageIterator;JLcom/smartengines/doc/DocImageObjectsCrossPageIterator;)Z
.end method

.method public static final native DocImageObjectsCrossPageIterator_GetImageObject(JLcom/smartengines/doc/DocImageObjectsCrossPageIterator;)J
.end method

.method public static final native DocImageObjectsCrossPageIterator_GetObjectID(JLcom/smartengines/doc/DocImageObjectsCrossPageIterator;)I
.end method

.method public static final native DocImageObjectsCrossPageIterator_GetPhysicalPageID(JLcom/smartengines/doc/DocImageObjectsCrossPageIterator;)I
.end method

.method public static final native DocImageObjectsIterator_Advance(JLcom/smartengines/doc/DocImageObjectsIterator;)V
.end method

.method public static final native DocImageObjectsIterator_Equals(JLcom/smartengines/doc/DocImageObjectsIterator;JLcom/smartengines/doc/DocImageObjectsIterator;)Z
.end method

.method public static final native DocImageObjectsIterator_GetImageObject(JLcom/smartengines/doc/DocImageObjectsIterator;)J
.end method

.method public static final native DocLineObject_ObjectTypeStatic()Ljava/lang/String;
.end method

.method public static final native DocLineObject_SWIGUpcast(J)J
.end method

.method public static final native DocMarkObject_ObjectTypeStatic()Ljava/lang/String;
.end method

.method public static final native DocMarkObject_SWIGUpcast(J)J
.end method

.method public static final native DocMetaObject_GetMutableOcrString(JLcom/smartengines/doc/DocMetaObject;)J
.end method

.method public static final native DocMetaObject_GetOcrString(JLcom/smartengines/doc/DocMetaObject;)J
.end method

.method public static final native DocMetaObject_ObjectTypeStatic()Ljava/lang/String;
.end method

.method public static final native DocMetaObject_SWIGUpcast(J)J
.end method

.method public static final native DocMetaObject_SetOcrString(JLcom/smartengines/doc/DocMetaObject;JLcom/smartengines/common/OcrString;)V
.end method

.method public static final native DocMetaObjectsCrossPageIterator_Advance(JLcom/smartengines/doc/DocMetaObjectsCrossPageIterator;)V
.end method

.method public static final native DocMetaObjectsCrossPageIterator_Equals(JLcom/smartengines/doc/DocMetaObjectsCrossPageIterator;JLcom/smartengines/doc/DocMetaObjectsCrossPageIterator;)Z
.end method

.method public static final native DocMetaObjectsCrossPageIterator_GetMetaObject(JLcom/smartengines/doc/DocMetaObjectsCrossPageIterator;)J
.end method

.method public static final native DocMetaObjectsCrossPageIterator_GetMetaObjectPtr(JLcom/smartengines/doc/DocMetaObjectsCrossPageIterator;)J
.end method

.method public static final native DocMetaObjectsCrossPageIterator_GetPhysicalPageID(JLcom/smartengines/doc/DocMetaObjectsCrossPageIterator;)I
.end method

.method public static final native DocMetaObjectsIterator_Advance(JLcom/smartengines/doc/DocMetaObjectsIterator;)V
.end method

.method public static final native DocMetaObjectsIterator_Equals(JLcom/smartengines/doc/DocMetaObjectsIterator;JLcom/smartengines/doc/DocMetaObjectsIterator;)Z
.end method

.method public static final native DocMetaObjectsIterator_GetMetaObject(JLcom/smartengines/doc/DocMetaObjectsIterator;)J
.end method

.method public static final native DocMetaObjectsIterator_GetMetaObjectPtr(JLcom/smartengines/doc/DocMetaObjectsIterator;)J
.end method

.method public static final native DocMultiStringTextObject_GetMutableStringObject(JLcom/smartengines/doc/DocMultiStringTextObject;I)J
.end method

.method public static final native DocMultiStringTextObject_GetStringObject(JLcom/smartengines/doc/DocMultiStringTextObject;I)J
.end method

.method public static final native DocMultiStringTextObject_GetStringsCount(JLcom/smartengines/doc/DocMultiStringTextObject;)I
.end method

.method public static final native DocMultiStringTextObject_ObjectTypeStatic()Ljava/lang/String;
.end method

.method public static final native DocMultiStringTextObject_SWIGUpcast(J)J
.end method

.method public static final native DocMultiStringTextObject_SetStringObject(JLcom/smartengines/doc/DocMultiStringTextObject;IJLcom/smartengines/doc/DocTextObject;)V
.end method

.method public static final native DocMultiStringTextObject_SetStringsCount(JLcom/smartengines/doc/DocMultiStringTextObject;I)V
.end method

.method public static final native DocObjectsCollection_AddObject(JLcom/smartengines/doc/DocObjectsCollection;JLcom/smartengines/doc/DocBasicObject;)J
.end method

.method public static final native DocObjectsCollection_BaseClassNameStatic()Ljava/lang/String;
.end method

.method public static final native DocObjectsCollection_BasicObjectsBegin(JLcom/smartengines/doc/DocObjectsCollection;)J
.end method

.method public static final native DocObjectsCollection_BasicObjectsEnd(JLcom/smartengines/doc/DocObjectsCollection;)J
.end method

.method public static final native DocObjectsCollection_BasicObjectsSlice(JLcom/smartengines/doc/DocObjectsCollection;Ljava/lang/String;)J
.end method

.method public static final native DocObjectsCollection_Clone(JLcom/smartengines/doc/DocObjectsCollection;)J
.end method

.method public static final native DocObjectsCollection_Create(Ljava/lang/String;)J
.end method

.method public static final native DocObjectsCollection_CreateObject(JLcom/smartengines/doc/DocObjectsCollection;)J
.end method

.method public static final native DocObjectsCollection_GetFrameID(JLcom/smartengines/doc/DocObjectsCollection;)I
.end method

.method public static final native DocObjectsCollection_GetMutableObject(JLcom/smartengines/doc/DocObjectsCollection;I)J
.end method

.method public static final native DocObjectsCollection_GetObject(JLcom/smartengines/doc/DocObjectsCollection;I)J
.end method

.method public static final native DocObjectsCollection_GetObjectTags(JLcom/smartengines/doc/DocObjectsCollection;I)J
.end method

.method public static final native DocObjectsCollection_GetObjectsCount(JLcom/smartengines/doc/DocObjectsCollection;)I
.end method

.method public static final native DocObjectsCollection_HasObject(JLcom/smartengines/doc/DocObjectsCollection;I)Z
.end method

.method public static final native DocObjectsCollection_MutableBasicObjectsBegin(JLcom/smartengines/doc/DocObjectsCollection;)J
.end method

.method public static final native DocObjectsCollection_MutableBasicObjectsEnd(JLcom/smartengines/doc/DocObjectsCollection;)J
.end method

.method public static final native DocObjectsCollection_MutableBasicObjectsSlice(JLcom/smartengines/doc/DocObjectsCollection;Ljava/lang/String;)J
.end method

.method public static final native DocObjectsCollection_ObjectType(JLcom/smartengines/doc/DocObjectsCollection;)Ljava/lang/String;
.end method

.method public static final native DocObjectsCollection_RemoveObject(JLcom/smartengines/doc/DocObjectsCollection;I)V
.end method

.method public static final native DocObjectsCollection_RemoveObjectDeep(JLcom/smartengines/doc/DocObjectsCollection;IJLcom/smartengines/doc/DocViewsCollection;)V
.end method

.method public static final native DocObjectsCollection_Serialize(JLcom/smartengines/doc/DocObjectsCollection;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native DocObjectsCollection_SetFrameID(JLcom/smartengines/doc/DocObjectsCollection;I)V
.end method

.method public static final native DocObjectsCollection_SetObject(JLcom/smartengines/doc/DocObjectsCollection;IJLcom/smartengines/doc/DocBasicObject;)V
.end method

.method public static final native DocObjectsCollectionsIterator_Advance(JLcom/smartengines/doc/DocObjectsCollectionsIterator;)V
.end method

.method public static final native DocObjectsCollectionsIterator_Equals(JLcom/smartengines/doc/DocObjectsCollectionsIterator;JLcom/smartengines/doc/DocObjectsCollectionsIterator;)Z
.end method

.method public static final native DocObjectsCollectionsIterator_GetID(JLcom/smartengines/doc/DocObjectsCollectionsIterator;)I
.end method

.method public static final native DocObjectsCollectionsIterator_GetObjectsCollection(JLcom/smartengines/doc/DocObjectsCollectionsIterator;)J
.end method

.method public static final native DocObjectsCollectionsIterator_GetTags(JLcom/smartengines/doc/DocObjectsCollectionsIterator;)J
.end method

.method public static final native DocObjectsCollectionsMutableIterator_Advance(JLcom/smartengines/doc/DocObjectsCollectionsMutableIterator;)V
.end method

.method public static final native DocObjectsCollectionsMutableIterator_Equals(JLcom/smartengines/doc/DocObjectsCollectionsMutableIterator;JLcom/smartengines/doc/DocObjectsCollectionsMutableIterator;)Z
.end method

.method public static final native DocObjectsCollectionsMutableIterator_GetID(JLcom/smartengines/doc/DocObjectsCollectionsMutableIterator;)I
.end method

.method public static final native DocObjectsCollectionsMutableIterator_GetMutableObjectsCollection(JLcom/smartengines/doc/DocObjectsCollectionsMutableIterator;)J
.end method

.method public static final native DocObjectsCollectionsMutableIterator_GetObjectsCollection(JLcom/smartengines/doc/DocObjectsCollectionsMutableIterator;)J
.end method

.method public static final native DocObjectsCollectionsMutableIterator_GetTags(JLcom/smartengines/doc/DocObjectsCollectionsMutableIterator;)J
.end method

.method public static final native DocObjectsCollectionsMutableSliceIterator_Advance(JLcom/smartengines/doc/DocObjectsCollectionsMutableSliceIterator;)V
.end method

.method public static final native DocObjectsCollectionsMutableSliceIterator_Finished(JLcom/smartengines/doc/DocObjectsCollectionsMutableSliceIterator;)Z
.end method

.method public static final native DocObjectsCollectionsMutableSliceIterator_GetID(JLcom/smartengines/doc/DocObjectsCollectionsMutableSliceIterator;)I
.end method

.method public static final native DocObjectsCollectionsMutableSliceIterator_GetMutableObjectsCollection(JLcom/smartengines/doc/DocObjectsCollectionsMutableSliceIterator;)J
.end method

.method public static final native DocObjectsCollectionsMutableSliceIterator_GetObjectsCollection(JLcom/smartengines/doc/DocObjectsCollectionsMutableSliceIterator;)J
.end method

.method public static final native DocObjectsCollectionsMutableSliceIterator_GetTags(JLcom/smartengines/doc/DocObjectsCollectionsMutableSliceIterator;)J
.end method

.method public static final native DocObjectsCollectionsSliceIterator_Advance(JLcom/smartengines/doc/DocObjectsCollectionsSliceIterator;)V
.end method

.method public static final native DocObjectsCollectionsSliceIterator_Finished(JLcom/smartengines/doc/DocObjectsCollectionsSliceIterator;)Z
.end method

.method public static final native DocObjectsCollectionsSliceIterator_GetID(JLcom/smartengines/doc/DocObjectsCollectionsSliceIterator;)I
.end method

.method public static final native DocObjectsCollectionsSliceIterator_GetObjectsCollection(JLcom/smartengines/doc/DocObjectsCollectionsSliceIterator;)J
.end method

.method public static final native DocObjectsCollectionsSliceIterator_GetTags(JLcom/smartengines/doc/DocObjectsCollectionsSliceIterator;)J
.end method

.method public static final native DocPageFeedback_GetID(JLcom/smartengines/doc/DocPageFeedback;)I
.end method

.method public static final native DocPageFeedback_GetQuadrangle(JLcom/smartengines/doc/DocPageFeedback;)J
.end method

.method public static final native DocPageFeedback_GetType(JLcom/smartengines/doc/DocPageFeedback;)Ljava/lang/String;
.end method

.method public static final native DocPageFeedback_IsPageRejected(JLcom/smartengines/doc/DocPageFeedback;)Z
.end method

.method public static final native DocPageInfo_GarbageReason(JLcom/smartengines/doc/DocPageInfo;I)Ljava/lang/String;
.end method

.method public static final native DocPageInfo_GarbageReasonsCount(JLcom/smartengines/doc/DocPageInfo;)I
.end method

.method public static final native DocPageInfo_IsGarbage(JLcom/smartengines/doc/DocPageInfo;)Z
.end method

.method public static final native DocPagesFeedbackContainer_GetPageCount(JLcom/smartengines/doc/DocPagesFeedbackContainer;)I
.end method

.method public static final native DocPagesFeedbackContainer_GetPageFeedback(JLcom/smartengines/doc/DocPagesFeedbackContainer;I)J
.end method

.method public static final native DocPhysicalDocument_GetBarcodeObjectsCount(JLcom/smartengines/doc/DocPhysicalDocument;Ljava/lang/String;)I
.end method

.method public static final native DocPhysicalDocument_GetBasicObjectsCount(JLcom/smartengines/doc/DocPhysicalDocument;Ljava/lang/String;)I
.end method

.method public static final native DocPhysicalDocument_GetCheckboxObjectsCount(JLcom/smartengines/doc/DocPhysicalDocument;Ljava/lang/String;)I
.end method

.method public static final native DocPhysicalDocument_GetForensicCheckObjectsCount(JLcom/smartengines/doc/DocPhysicalDocument;Ljava/lang/String;)I
.end method

.method public static final native DocPhysicalDocument_GetForensicObjectsCount(JLcom/smartengines/doc/DocPhysicalDocument;Ljava/lang/String;)I
.end method

.method public static final native DocPhysicalDocument_GetImageObjectsCount(JLcom/smartengines/doc/DocPhysicalDocument;Ljava/lang/String;)I
.end method

.method public static final native DocPhysicalDocument_GetPagesCount(JLcom/smartengines/doc/DocPhysicalDocument;)I
.end method

.method public static final native DocPhysicalDocument_GetPhysicalPage(JLcom/smartengines/doc/DocPhysicalDocument;I)J
.end method

.method public static final native DocPhysicalDocument_GetPhysicalPagePtr(JLcom/smartengines/doc/DocPhysicalDocument;I)J
.end method

.method public static final native DocPhysicalDocument_GetTableObjectsCount(JLcom/smartengines/doc/DocPhysicalDocument;Ljava/lang/String;)I
.end method

.method public static final native DocPhysicalDocument_GetTextObjectsCount(JLcom/smartengines/doc/DocPhysicalDocument;Ljava/lang/String;)I
.end method

.method public static final native DocPhysicalPage_BarcodeObjectsBegin(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J
.end method

.method public static final native DocPhysicalPage_BarcodeObjectsEnd(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J
.end method

.method public static final native DocPhysicalPage_BasicObjectsBegin(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J
.end method

.method public static final native DocPhysicalPage_BasicObjectsEnd(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J
.end method

.method public static final native DocPhysicalPage_CheckboxObjectsBegin(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J
.end method

.method public static final native DocPhysicalPage_CheckboxObjectsEnd(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J
.end method

.method public static final native DocPhysicalPage_ForensicCheckObjectsBegin(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J
.end method

.method public static final native DocPhysicalPage_ForensicCheckObjectsEnd(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J
.end method

.method public static final native DocPhysicalPage_ForensicObjectsBegin(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J
.end method

.method public static final native DocPhysicalPage_ForensicObjectsEnd(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J
.end method

.method public static final native DocPhysicalPage_GetBarcodeObjectsCount(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)I
.end method

.method public static final native DocPhysicalPage_GetBasicObjectsCount(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)I
.end method

.method public static final native DocPhysicalPage_GetCheckboxObjectsCount(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)I
.end method

.method public static final native DocPhysicalPage_GetForensicCheckObjectsCount(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)I
.end method

.method public static final native DocPhysicalPage_GetForensicObjectsCount(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)I
.end method

.method public static final native DocPhysicalPage_GetFulltextBasicObjectsBegin(JLcom/smartengines/doc/DocPhysicalPage;)J
.end method

.method public static final native DocPhysicalPage_GetFulltextBasicObjectsEnd(JLcom/smartengines/doc/DocPhysicalPage;)J
.end method

.method public static final native DocPhysicalPage_GetImageObjectsCount(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)I
.end method

.method public static final native DocPhysicalPage_GetPageImageFromScene(JLcom/smartengines/doc/DocPhysicalPage;JLcom/smartengines/common/Image;)J
.end method

.method public static final native DocPhysicalPage_GetPageInfo(JLcom/smartengines/doc/DocPhysicalPage;)J
.end method

.method public static final native DocPhysicalPage_GetPageInfoPtr(JLcom/smartengines/doc/DocPhysicalPage;)J
.end method

.method public static final native DocPhysicalPage_GetPagePolygon(JLcom/smartengines/doc/DocPhysicalPage;)J
.end method

.method public static final native DocPhysicalPage_GetPagePolygonPtr(JLcom/smartengines/doc/DocPhysicalPage;)J
.end method

.method public static final native DocPhysicalPage_GetPageQuadrangle(JLcom/smartengines/doc/DocPhysicalPage;)J
.end method

.method public static final native DocPhysicalPage_GetPageQuadranglePtr(JLcom/smartengines/doc/DocPhysicalPage;)J
.end method

.method public static final native DocPhysicalPage_GetRawTextObject(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J
.end method

.method public static final native DocPhysicalPage_GetRawTextObjectsCount(JLcom/smartengines/doc/DocPhysicalPage;)I
.end method

.method public static final native DocPhysicalPage_GetSourceSceneID(JLcom/smartengines/doc/DocPhysicalPage;)I
.end method

.method public static final native DocPhysicalPage_GetTableObjectsCount(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)I
.end method

.method public static final native DocPhysicalPage_GetTextObjectsCount(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)I
.end method

.method public static final native DocPhysicalPage_HasBasicObjects(JLcom/smartengines/doc/DocPhysicalPage;)Z
.end method

.method public static final native DocPhysicalPage_HasRawTextObject(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)Z
.end method

.method public static final native DocPhysicalPage_ImageObjectsBegin(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J
.end method

.method public static final native DocPhysicalPage_ImageObjectsEnd(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J
.end method

.method public static final native DocPhysicalPage_RawTextObjectsBegin(JLcom/smartengines/doc/DocPhysicalPage;)J
.end method

.method public static final native DocPhysicalPage_RawTextObjectsEnd(JLcom/smartengines/doc/DocPhysicalPage;)J
.end method

.method public static final native DocPhysicalPage_TableObjectsBegin(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J
.end method

.method public static final native DocPhysicalPage_TableObjectsEnd(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J
.end method

.method public static final native DocPhysicalPage_TextObjectsBegin(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J
.end method

.method public static final native DocPhysicalPage_TextObjectsEnd(JLcom/smartengines/doc/DocPhysicalPage;Ljava/lang/String;)J
.end method

.method public static final native DocProcessingArguments_GetTagArgument(JLcom/smartengines/doc/DocProcessingArguments;I)Ljava/lang/String;
.end method

.method public static final native DocProcessingArguments_GetTagArgumentsCount(JLcom/smartengines/doc/DocProcessingArguments;)I
.end method

.method public static final native DocProcessingArguments_Resize(JLcom/smartengines/doc/DocProcessingArguments;I)V
.end method

.method public static final native DocProcessingArguments_SetTagArgument(JLcom/smartengines/doc/DocProcessingArguments;ILjava/lang/String;)V
.end method

.method public static final native DocProcessingSettings_AvailableRoutinesBegin(JLcom/smartengines/doc/DocProcessingSettings;)J
.end method

.method public static final native DocProcessingSettings_AvailableRoutinesEnd(JLcom/smartengines/doc/DocProcessingSettings;)J
.end method

.method public static final native DocProcessingSettings_BindFeedbackReporter(JLcom/smartengines/doc/DocProcessingSettings;JLcom/smartengines/doc/DocFeedback;)V
.end method

.method public static final native DocProcessingSettings_GetAvailableRoutinesCount(JLcom/smartengines/doc/DocProcessingSettings;)I
.end method

.method public static final native DocProcessingSettings_GetCurrentSourceID(JLcom/smartengines/doc/DocProcessingSettings;)I
.end method

.method public static final native DocProcessingSettings_GetEnabledDocumentType(JLcom/smartengines/doc/DocProcessingSettings;I)Ljava/lang/String;
.end method

.method public static final native DocProcessingSettings_GetEnabledDocumentTypesCount(JLcom/smartengines/doc/DocProcessingSettings;)I
.end method

.method public static final native DocProcessingSettings_GetFeedbackReporter(JLcom/smartengines/doc/DocProcessingSettings;)J
.end method

.method public static final native DocProcessingSettings_GetOption(JLcom/smartengines/doc/DocProcessingSettings;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native DocProcessingSettings_GetOptionsCount(JLcom/smartengines/doc/DocProcessingSettings;)I
.end method

.method public static final native DocProcessingSettings_GetSessionOption(JLcom/smartengines/doc/DocProcessingSettings;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native DocProcessingSettings_GetSessionOptionsCount(JLcom/smartengines/doc/DocProcessingSettings;)I
.end method

.method public static final native DocProcessingSettings_HasAvailableRoutine(JLcom/smartengines/doc/DocProcessingSettings;Ljava/lang/String;)Z
.end method

.method public static final native DocProcessingSettings_HasEnabledDocumentType(JLcom/smartengines/doc/DocProcessingSettings;Ljava/lang/String;)Z
.end method

.method public static final native DocProcessingSettings_HasOption(JLcom/smartengines/doc/DocProcessingSettings;Ljava/lang/String;)Z
.end method

.method public static final native DocProcessingSettings_HasSessionOption(JLcom/smartengines/doc/DocProcessingSettings;Ljava/lang/String;)Z
.end method

.method public static final native DocProcessingSettings_OptionsBegin(JLcom/smartengines/doc/DocProcessingSettings;)J
.end method

.method public static final native DocProcessingSettings_OptionsEnd(JLcom/smartengines/doc/DocProcessingSettings;)J
.end method

.method public static final native DocProcessingSettings_RemoveOption(JLcom/smartengines/doc/DocProcessingSettings;Ljava/lang/String;)V
.end method

.method public static final native DocProcessingSettings_RoutinesQueueClear(JLcom/smartengines/doc/DocProcessingSettings;)V
.end method

.method public static final native DocProcessingSettings_RoutinesQueueFront(JLcom/smartengines/doc/DocProcessingSettings;)Ljava/lang/String;
.end method

.method public static final native DocProcessingSettings_RoutinesQueuePop(JLcom/smartengines/doc/DocProcessingSettings;)V
.end method

.method public static final native DocProcessingSettings_RoutinesQueuePush(JLcom/smartengines/doc/DocProcessingSettings;Ljava/lang/String;)V
.end method

.method public static final native DocProcessingSettings_RoutinesQueueSize(JLcom/smartengines/doc/DocProcessingSettings;)I
.end method

.method public static final native DocProcessingSettings_SessionOptionsBegin(JLcom/smartengines/doc/DocProcessingSettings;)J
.end method

.method public static final native DocProcessingSettings_SessionOptionsEnd(JLcom/smartengines/doc/DocProcessingSettings;)J
.end method

.method public static final native DocProcessingSettings_SetCurrentSourceID(JLcom/smartengines/doc/DocProcessingSettings;I)V
.end method

.method public static final native DocProcessingSettings_SetOption(JLcom/smartengines/doc/DocProcessingSettings;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static final native DocRawFieldFeedback_GetName(JLcom/smartengines/doc/DocRawFieldFeedback;)Ljava/lang/String;
.end method

.method public static final native DocRawFieldFeedback_GetOcrString(JLcom/smartengines/doc/DocRawFieldFeedback;)J
.end method

.method public static final native DocRawFieldFeedback_GetQuadrangle(JLcom/smartengines/doc/DocRawFieldFeedback;)J
.end method

.method public static final native DocRawFieldFeedback_GetType(JLcom/smartengines/doc/DocRawFieldFeedback;)Ljava/lang/String;
.end method

.method public static final native DocRawFieldFeedback_HasQuadrangle(JLcom/smartengines/doc/DocRawFieldFeedback;)Z
.end method

.method public static final native DocRawFieldsFeedbackContainer_GetRawFieldCount(JLcom/smartengines/doc/DocRawFieldsFeedbackContainer;)I
.end method

.method public static final native DocRawFieldsFeedbackContainer_GetRawFieldFeedback(JLcom/smartengines/doc/DocRawFieldsFeedbackContainer;I)J
.end method

.method public static final native DocRawFieldsFeedbackContainer_GetSourcePageID(JLcom/smartengines/doc/DocRawFieldsFeedbackContainer;)I
.end method

.method public static final native DocResult_AddDocument(JLcom/smartengines/doc/DocResult;JLcom/smartengines/doc/Document;)J
.end method

.method public static final native DocResult_AddTextModesBegin(JLcom/smartengines/doc/DocResult;)J
.end method

.method public static final native DocResult_AddTextModesEnd(JLcom/smartengines/doc/DocResult;)J
.end method

.method public static final native DocResult_BuildPDFABuffer(JLcom/smartengines/doc/DocResult;)V
.end method

.method public static final native DocResult_CanBuildPDFABuffer(JLcom/smartengines/doc/DocResult;)Z
.end method

.method public static final native DocResult_Clone(JLcom/smartengines/doc/DocResult;)J
.end method

.method public static final native DocResult_DocumentsBegin(JLcom/smartengines/doc/DocResult;)J
.end method

.method public static final native DocResult_DocumentsEnd(JLcom/smartengines/doc/DocResult;)J
.end method

.method public static final native DocResult_DocumentsSlice(JLcom/smartengines/doc/DocResult;Ljava/lang/String;)J
.end method

.method public static final native DocResult_GetAddTextMode(JLcom/smartengines/doc/DocResult;)Ljava/lang/String;
.end method

.method public static final native DocResult_GetColourMode(JLcom/smartengines/doc/DocResult;)Z
.end method

.method public static final native DocResult_GetDocument(JLcom/smartengines/doc/DocResult;I)J
.end method

.method public static final native DocResult_GetDocumentTags(JLcom/smartengines/doc/DocResult;I)J
.end method

.method public static final native DocResult_GetDocumentsCount(JLcom/smartengines/doc/DocResult;)I
.end method

.method public static final native DocResult_GetGraphicalStructure(JLcom/smartengines/doc/DocResult;)J
.end method

.method public static final native DocResult_GetLastSceneInfo(JLcom/smartengines/doc/DocResult;)J
.end method

.method public static final native DocResult_GetLastSceneInfoPtr(JLcom/smartengines/doc/DocResult;)J
.end method

.method public static final native DocResult_GetMutableDocument(JLcom/smartengines/doc/DocResult;I)J
.end method

.method public static final native DocResult_GetMutableGraphicalStructure(JLcom/smartengines/doc/DocResult;)J
.end method

.method public static final native DocResult_GetPDFABuffer(JLcom/smartengines/doc/DocResult;[B)V
.end method

.method public static final native DocResult_GetPDFABufferSize(JLcom/smartengines/doc/DocResult;)I
.end method

.method public static final native DocResult_GetPhysicalDocument(JLcom/smartengines/doc/DocResult;I)J
.end method

.method public static final native DocResult_GetPhysicalDocumentPtr(JLcom/smartengines/doc/DocResult;I)J
.end method

.method public static final native DocResult_GetSceneInfo(JLcom/smartengines/doc/DocResult;I)J
.end method

.method public static final native DocResult_GetSceneInfoPtr(JLcom/smartengines/doc/DocResult;I)J
.end method

.method public static final native DocResult_GetScenesCount(JLcom/smartengines/doc/DocResult;)I
.end method

.method public static final native DocResult_GetTextTypeMode(JLcom/smartengines/doc/DocResult;)Ljava/lang/String;
.end method

.method public static final native DocResult_HasAddTextMode(JLcom/smartengines/doc/DocResult;Ljava/lang/String;)Z
.end method

.method public static final native DocResult_HasDocument(JLcom/smartengines/doc/DocResult;I)Z
.end method

.method public static final native DocResult_HasTextTypeMode(JLcom/smartengines/doc/DocResult;Ljava/lang/String;)Z
.end method

.method public static final native DocResult_MutableDocumentsBegin(JLcom/smartengines/doc/DocResult;)J
.end method

.method public static final native DocResult_MutableDocumentsEnd(JLcom/smartengines/doc/DocResult;)J
.end method

.method public static final native DocResult_MutableDocumentsSlice(JLcom/smartengines/doc/DocResult;Ljava/lang/String;)J
.end method

.method public static final native DocResult_PartialClone(JLcom/smartengines/doc/DocResult;)J
.end method

.method public static final native DocResult_RemoveDocument(JLcom/smartengines/doc/DocResult;I)V
.end method

.method public static final native DocResult_Serialize(JLcom/smartengines/doc/DocResult;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native DocResult_SetAddTextMode(JLcom/smartengines/doc/DocResult;Ljava/lang/String;)V
.end method

.method public static final native DocResult_SetColourMode(JLcom/smartengines/doc/DocResult;Z)V
.end method

.method public static final native DocResult_SetDocument(JLcom/smartengines/doc/DocResult;IJLcom/smartengines/doc/Document;)V
.end method

.method public static final native DocResult_SetTextTypeMode(JLcom/smartengines/doc/DocResult;Ljava/lang/String;)V
.end method

.method public static final native DocResult_TextTypeModesBegin(JLcom/smartengines/doc/DocResult;)J
.end method

.method public static final native DocResult_TextTypeModesEnd(JLcom/smartengines/doc/DocResult;)J
.end method

.method public static final native DocSceneInfo_ForensicCheckFieldsBegin(JLcom/smartengines/doc/DocSceneInfo;)J
.end method

.method public static final native DocSceneInfo_ForensicCheckFieldsEnd(JLcom/smartengines/doc/DocSceneInfo;)J
.end method

.method public static final native DocSceneInfo_GarbageReason(JLcom/smartengines/doc/DocSceneInfo;I)Ljava/lang/String;
.end method

.method public static final native DocSceneInfo_GarbageReasonsCount(JLcom/smartengines/doc/DocSceneInfo;)I
.end method

.method public static final native DocSceneInfo_GetForensicCheckField(JLcom/smartengines/doc/DocSceneInfo;Ljava/lang/String;)J
.end method

.method public static final native DocSceneInfo_GetForensicCheckFieldPtr(JLcom/smartengines/doc/DocSceneInfo;Ljava/lang/String;)J
.end method

.method public static final native DocSceneInfo_GetForensicCheckFieldsCount(JLcom/smartengines/doc/DocSceneInfo;)I
.end method

.method public static final native DocSceneInfo_GetSceneOriginType(JLcom/smartengines/doc/DocSceneInfo;)I
.end method

.method public static final native DocSceneInfo_HasForensicCheckField(JLcom/smartengines/doc/DocSceneInfo;Ljava/lang/String;)Z
.end method

.method public static final native DocSceneInfo_IsGarbage(JLcom/smartengines/doc/DocSceneInfo;)Z
.end method

.method public static final native DocSceneInfo_SceneID(JLcom/smartengines/doc/DocSceneInfo;)I
.end method

.method public static final native DocSceneInfo_SceneOriginType_DIGITAL_BORN_get()I
.end method

.method public static final native DocSceneInfo_SceneOriginType_OPTICAL_CAMERA_get()I
.end method

.method public static final native DocSceneInfo_SceneOriginType_OPTICAL_SCANNER_get()I
.end method

.method public static final native DocSceneInfo_SceneOriginType_UNDEFINED_get()I
.end method

.method public static final native DocSessionSettings_AddEnabledDocumentTypes(JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)V
.end method

.method public static final native DocSessionSettings_Clone(JLcom/smartengines/doc/DocSessionSettings;)J
.end method

.method public static final native DocSessionSettings_DisableForensics(JLcom/smartengines/doc/DocSessionSettings;)V
.end method

.method public static final native DocSessionSettings_EnableForensics(JLcom/smartengines/doc/DocSessionSettings;)V
.end method

.method public static final native DocSessionSettings_GetCurrentMode(JLcom/smartengines/doc/DocSessionSettings;)Ljava/lang/String;
.end method

.method public static final native DocSessionSettings_GetDocumentInfo(JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native DocSessionSettings_GetEnabledDocumentType(JLcom/smartengines/doc/DocSessionSettings;I)Ljava/lang/String;
.end method

.method public static final native DocSessionSettings_GetEnabledDocumentTypesCount(JLcom/smartengines/doc/DocSessionSettings;)I
.end method

.method public static final native DocSessionSettings_GetInternalEnginesCount(JLcom/smartengines/doc/DocSessionSettings;)I
.end method

.method public static final native DocSessionSettings_GetOption(JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native DocSessionSettings_GetOptionsCount(JLcom/smartengines/doc/DocSessionSettings;)I
.end method

.method public static final native DocSessionSettings_GetSupportedDocumentType(JLcom/smartengines/doc/DocSessionSettings;II)Ljava/lang/String;
.end method

.method public static final native DocSessionSettings_GetSupportedDocumentTypesCount(JLcom/smartengines/doc/DocSessionSettings;I)I
.end method

.method public static final native DocSessionSettings_GetSupportedMode(JLcom/smartengines/doc/DocSessionSettings;I)Ljava/lang/String;
.end method

.method public static final native DocSessionSettings_GetSupportedModesCount(JLcom/smartengines/doc/DocSessionSettings;)I
.end method

.method public static final native DocSessionSettings_HasEnabledDocumentType(JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)Z
.end method

.method public static final native DocSessionSettings_HasOption(JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)Z
.end method

.method public static final native DocSessionSettings_HasSupportedDocumentType(JLcom/smartengines/doc/DocSessionSettings;ILjava/lang/String;)Z
.end method

.method public static final native DocSessionSettings_HasSupportedMode(JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)Z
.end method

.method public static final native DocSessionSettings_IsForensicsEnabled(JLcom/smartengines/doc/DocSessionSettings;)Z
.end method

.method public static final native DocSessionSettings_OptionsBegin(JLcom/smartengines/doc/DocSessionSettings;)J
.end method

.method public static final native DocSessionSettings_OptionsEnd(JLcom/smartengines/doc/DocSessionSettings;)J
.end method

.method public static final native DocSessionSettings_PermissiblePrefixDocMasksBegin(JLcom/smartengines/doc/DocSessionSettings;)J
.end method

.method public static final native DocSessionSettings_PermissiblePrefixDocMasksEnd(JLcom/smartengines/doc/DocSessionSettings;)J
.end method

.method public static final native DocSessionSettings_RemoveEnabledDocumentTypes(JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)V
.end method

.method public static final native DocSessionSettings_RemoveOption(JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)V
.end method

.method public static final native DocSessionSettings_SetCurrentMode(JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)V
.end method

.method public static final native DocSessionSettings_SetOption(JLcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static final native DocSessionSettings_SupportedModesBegin(JLcom/smartengines/doc/DocSessionSettings;)J
.end method

.method public static final native DocSessionSettings_SupportedModesEnd(JLcom/smartengines/doc/DocSessionSettings;)J
.end method

.method public static final native DocSession_Activate(JLcom/smartengines/doc/DocSession;Ljava/lang/String;)V
.end method

.method public static final native DocSession_CreateProcessingSettings(JLcom/smartengines/doc/DocSession;)J
.end method

.method public static final native DocSession_GetActivationRequest(JLcom/smartengines/doc/DocSession;)Ljava/lang/String;
.end method

.method public static final native DocSession_GetCurrentResult(JLcom/smartengines/doc/DocSession;)J
.end method

.method public static final native DocSession_GetMutableCurrentResult(JLcom/smartengines/doc/DocSession;)J
.end method

.method public static final native DocSession_GetType(JLcom/smartengines/doc/DocSession;)Ljava/lang/String;
.end method

.method public static final native DocSession_IsActivated(JLcom/smartengines/doc/DocSession;)Z
.end method

.method public static final native DocSession_Process(JLcom/smartengines/doc/DocSession;JLcom/smartengines/doc/DocProcessingSettings;)V
.end method

.method public static final native DocSession_ProcessImage__SWIG_0(JLcom/smartengines/doc/DocSession;JLcom/smartengines/common/Image;JLcom/smartengines/doc/DocProcessingSettings;)V
.end method

.method public static final native DocSession_ProcessImage__SWIG_1(JLcom/smartengines/doc/DocSession;JLcom/smartengines/common/Image;)V
.end method

.method public static final native DocSession_RegisterImage(JLcom/smartengines/doc/DocSession;JLcom/smartengines/common/Image;)I
.end method

.method public static final native DocSession_Reset(JLcom/smartengines/doc/DocSession;)V
.end method

.method public static final native DocTableField_GetBaseFieldInfo(JLcom/smartengines/doc/DocTableField;)J
.end method

.method public static final native DocTableField_GetCell(JLcom/smartengines/doc/DocTableField;II)J
.end method

.method public static final native DocTableField_GetColName(JLcom/smartengines/doc/DocTableField;I)Ljava/lang/String;
.end method

.method public static final native DocTableField_GetColsCount(JLcom/smartengines/doc/DocTableField;)I
.end method

.method public static final native DocTableField_GetColumnIndexByName(JLcom/smartengines/doc/DocTableField;Ljava/lang/String;)I
.end method

.method public static final native DocTableField_GetHeaderCell(JLcom/smartengines/doc/DocTableField;II)J
.end method

.method public static final native DocTableField_GetHeaderCellPtr(JLcom/smartengines/doc/DocTableField;II)J
.end method

.method public static final native DocTableField_GetHeaderColsCount(JLcom/smartengines/doc/DocTableField;)I
.end method

.method public static final native DocTableField_GetHeaderMutableCell(JLcom/smartengines/doc/DocTableField;II)J
.end method

.method public static final native DocTableField_GetHeaderMutableCellPtr(JLcom/smartengines/doc/DocTableField;II)J
.end method

.method public static final native DocTableField_GetHeaderRowsCount(JLcom/smartengines/doc/DocTableField;)I
.end method

.method public static final native DocTableField_GetMutableBaseFieldInfo(JLcom/smartengines/doc/DocTableField;)J
.end method

.method public static final native DocTableField_GetMutableCell(JLcom/smartengines/doc/DocTableField;II)J
.end method

.method public static final native DocTableField_GetRowsCount(JLcom/smartengines/doc/DocTableField;)I
.end method

.method public static final native DocTableField_HasColumnIndexByName(JLcom/smartengines/doc/DocTableField;Ljava/lang/String;)Z
.end method

.method public static final native DocTableField_ResizeCols__SWIG_0(JLcom/smartengines/doc/DocTableField;I)V
.end method

.method public static final native DocTableField_ResizeCols__SWIG_1(JLcom/smartengines/doc/DocTableField;IJLcom/smartengines/doc/DocTextField;)V
.end method

.method public static final native DocTableField_ResizeHeaderCols__SWIG_0(JLcom/smartengines/doc/DocTableField;I)V
.end method

.method public static final native DocTableField_ResizeHeaderCols__SWIG_1(JLcom/smartengines/doc/DocTableField;IJLcom/smartengines/doc/DocTextField;)V
.end method

.method public static final native DocTableField_ResizeHeaderRows__SWIG_0(JLcom/smartengines/doc/DocTableField;I)V
.end method

.method public static final native DocTableField_ResizeHeaderRows__SWIG_1(JLcom/smartengines/doc/DocTableField;IJLcom/smartengines/doc/DocTextField;)V
.end method

.method public static final native DocTableField_ResizeRows__SWIG_0(JLcom/smartengines/doc/DocTableField;I)V
.end method

.method public static final native DocTableField_ResizeRows__SWIG_1(JLcom/smartengines/doc/DocTableField;IJLcom/smartengines/doc/DocTextField;)V
.end method

.method public static final native DocTableField_Serialize(JLcom/smartengines/doc/DocTableField;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native DocTableField_SetCell(JLcom/smartengines/doc/DocTableField;IIJLcom/smartengines/doc/DocTextField;)V
.end method

.method public static final native DocTableField_SetColName(JLcom/smartengines/doc/DocTableField;ILjava/lang/String;)V
.end method

.method public static final native DocTableField_SetHeaderCell(JLcom/smartengines/doc/DocTableField;IIJLcom/smartengines/doc/DocTextField;)V
.end method

.method public static final native DocTableFieldsIterator_Advance(JLcom/smartengines/doc/DocTableFieldsIterator;)V
.end method

.method public static final native DocTableFieldsIterator_Equals(JLcom/smartengines/doc/DocTableFieldsIterator;JLcom/smartengines/doc/DocTableFieldsIterator;)Z
.end method

.method public static final native DocTableFieldsIterator_GetField(JLcom/smartengines/doc/DocTableFieldsIterator;)J
.end method

.method public static final native DocTableFieldsIterator_GetKey(JLcom/smartengines/doc/DocTableFieldsIterator;)Ljava/lang/String;
.end method

.method public static final native DocTableObject_GetCell(JLcom/smartengines/doc/DocTableObject;II)J
.end method

.method public static final native DocTableObject_GetColName(JLcom/smartengines/doc/DocTableObject;II)Ljava/lang/String;
.end method

.method public static final native DocTableObject_GetColsCount(JLcom/smartengines/doc/DocTableObject;I)I
.end method

.method public static final native DocTableObject_GetMutableCell(JLcom/smartengines/doc/DocTableObject;II)J
.end method

.method public static final native DocTableObject_GetRowsCount(JLcom/smartengines/doc/DocTableObject;)I
.end method

.method public static final native DocTableObject_GetTextCell(JLcom/smartengines/doc/DocTableObject;II)J
.end method

.method public static final native DocTableObject_GetTextCellPtr(JLcom/smartengines/doc/DocTableObject;II)J
.end method

.method public static final native DocTableObject_ObjectTypeStatic()Ljava/lang/String;
.end method

.method public static final native DocTableObject_ResizeCols(JLcom/smartengines/doc/DocTableObject;II)V
.end method

.method public static final native DocTableObject_ResizeRows(JLcom/smartengines/doc/DocTableObject;I)V
.end method

.method public static final native DocTableObject_SWIGUpcast(J)J
.end method

.method public static final native DocTableObject_SetCell(JLcom/smartengines/doc/DocTableObject;IIJLcom/smartengines/doc/DocMultiStringTextObject;)V
.end method

.method public static final native DocTableObject_SetColName(JLcom/smartengines/doc/DocTableObject;IILjava/lang/String;)V
.end method

.method public static final native DocTableObjectsCrossPageIterator_Advance(JLcom/smartengines/doc/DocTableObjectsCrossPageIterator;)V
.end method

.method public static final native DocTableObjectsCrossPageIterator_Equals(JLcom/smartengines/doc/DocTableObjectsCrossPageIterator;JLcom/smartengines/doc/DocTableObjectsCrossPageIterator;)Z
.end method

.method public static final native DocTableObjectsCrossPageIterator_GetObjectID(JLcom/smartengines/doc/DocTableObjectsCrossPageIterator;)I
.end method

.method public static final native DocTableObjectsCrossPageIterator_GetPhysicalPageID(JLcom/smartengines/doc/DocTableObjectsCrossPageIterator;)I
.end method

.method public static final native DocTableObjectsCrossPageIterator_GetTableObject(JLcom/smartengines/doc/DocTableObjectsCrossPageIterator;)J
.end method

.method public static final native DocTableObjectsIterator_Advance(JLcom/smartengines/doc/DocTableObjectsIterator;)V
.end method

.method public static final native DocTableObjectsIterator_Equals(JLcom/smartengines/doc/DocTableObjectsIterator;JLcom/smartengines/doc/DocTableObjectsIterator;)Z
.end method

.method public static final native DocTableObjectsIterator_GetTableObject(JLcom/smartengines/doc/DocTableObjectsIterator;)J
.end method

.method public static final native DocTagsCollection_AddTag(JLcom/smartengines/doc/DocTagsCollection;Ljava/lang/String;)V
.end method

.method public static final native DocTagsCollection_Create()J
.end method

.method public static final native DocTagsCollection_GetTagsCount(JLcom/smartengines/doc/DocTagsCollection;)I
.end method

.method public static final native DocTagsCollection_HasTag(JLcom/smartengines/doc/DocTagsCollection;Ljava/lang/String;)Z
.end method

.method public static final native DocTagsCollection_RemoveTag(JLcom/smartengines/doc/DocTagsCollection;Ljava/lang/String;)V
.end method

.method public static final native DocTagsCollection_Serialize(JLcom/smartengines/doc/DocTagsCollection;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native DocTagsCollection_TagsBegin(JLcom/smartengines/doc/DocTagsCollection;)J
.end method

.method public static final native DocTagsCollection_TagsEnd(JLcom/smartengines/doc/DocTagsCollection;)J
.end method

.method public static final native DocTemplateObject_ObjectTypeStatic()Ljava/lang/String;
.end method

.method public static final native DocTemplateObject_SWIGUpcast(J)J
.end method

.method public static final native DocTextField_GetBaseFieldInfo(JLcom/smartengines/doc/DocTextField;)J
.end method

.method public static final native DocTextField_GetMutableBaseFieldInfo(JLcom/smartengines/doc/DocTextField;)J
.end method

.method public static final native DocTextField_GetMutableOcrString(JLcom/smartengines/doc/DocTextField;)J
.end method

.method public static final native DocTextField_GetOcrString(JLcom/smartengines/doc/DocTextField;)J
.end method

.method public static final native DocTextField_Serialize(JLcom/smartengines/doc/DocTextField;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native DocTextField_SetOcrString(JLcom/smartengines/doc/DocTextField;JLcom/smartengines/common/OcrString;)V
.end method

.method public static final native DocTextFieldsIterator_Advance(JLcom/smartengines/doc/DocTextFieldsIterator;)V
.end method

.method public static final native DocTextFieldsIterator_Equals(JLcom/smartengines/doc/DocTextFieldsIterator;JLcom/smartengines/doc/DocTextFieldsIterator;)Z
.end method

.method public static final native DocTextFieldsIterator_GetField(JLcom/smartengines/doc/DocTextFieldsIterator;)J
.end method

.method public static final native DocTextFieldsIterator_GetKey(JLcom/smartengines/doc/DocTextFieldsIterator;)Ljava/lang/String;
.end method

.method public static final native DocTextLineObject_CellQuadranglesOnPageBegin(JLcom/smartengines/doc/DocTextLineObject;)J
.end method

.method public static final native DocTextLineObject_CellQuadranglesOnPageEnd(JLcom/smartengines/doc/DocTextLineObject;)J
.end method

.method public static final native DocTextLineObject_CellQuadranglesOnSceneBegin(JLcom/smartengines/doc/DocTextLineObject;)J
.end method

.method public static final native DocTextLineObject_CellQuadranglesOnSceneEnd(JLcom/smartengines/doc/DocTextLineObject;)J
.end method

.method public static final native DocTextLineObject_GetCellQuadOnPage(JLcom/smartengines/doc/DocTextLineObject;I)J
.end method

.method public static final native DocTextLineObject_GetCellQuadOnScene(JLcom/smartengines/doc/DocTextLineObject;I)J
.end method

.method public static final native DocTextLineObject_GetOcrString(JLcom/smartengines/doc/DocTextLineObject;)J
.end method

.method public static final native DocTextLineObject_ObjectTypeStatic()Ljava/lang/String;
.end method

.method public static final native DocTextLineObject_SWIGUpcast(J)J
.end method

.method public static final native DocTextObject_GetMutableOcrString(JLcom/smartengines/doc/DocTextObject;)J
.end method

.method public static final native DocTextObject_GetOcrString(JLcom/smartengines/doc/DocTextObject;)J
.end method

.method public static final native DocTextObject_GetTextLineObject(JLcom/smartengines/doc/DocTextObject;I)J
.end method

.method public static final native DocTextObject_GetTextLineObjectPtr(JLcom/smartengines/doc/DocTextObject;I)J
.end method

.method public static final native DocTextObject_GetTextLineObjectsCount(JLcom/smartengines/doc/DocTextObject;)I
.end method

.method public static final native DocTextObject_ObjectTypeStatic()Ljava/lang/String;
.end method

.method public static final native DocTextObject_SWIGUpcast(J)J
.end method

.method public static final native DocTextObject_SetOcrString(JLcom/smartengines/doc/DocTextObject;JLcom/smartengines/common/OcrString;)V
.end method

.method public static final native DocTextObjectsCrossPageIterator_Advance(JLcom/smartengines/doc/DocTextObjectsCrossPageIterator;)V
.end method

.method public static final native DocTextObjectsCrossPageIterator_Equals(JLcom/smartengines/doc/DocTextObjectsCrossPageIterator;JLcom/smartengines/doc/DocTextObjectsCrossPageIterator;)Z
.end method

.method public static final native DocTextObjectsCrossPageIterator_GetObjectID(JLcom/smartengines/doc/DocTextObjectsCrossPageIterator;)I
.end method

.method public static final native DocTextObjectsCrossPageIterator_GetPhysicalPageID(JLcom/smartengines/doc/DocTextObjectsCrossPageIterator;)I
.end method

.method public static final native DocTextObjectsCrossPageIterator_GetTextObject(JLcom/smartengines/doc/DocTextObjectsCrossPageIterator;)J
.end method

.method public static final native DocTextObjectsIterator_Advance(JLcom/smartengines/doc/DocTextObjectsIterator;)V
.end method

.method public static final native DocTextObjectsIterator_Equals(JLcom/smartengines/doc/DocTextObjectsIterator;JLcom/smartengines/doc/DocTextObjectsIterator;)Z
.end method

.method public static final native DocTextObjectsIterator_GetTextObject(JLcom/smartengines/doc/DocTextObjectsIterator;)J
.end method

.method public static final native DocVideoSession_Activate(JLcom/smartengines/doc/DocVideoSession;Ljava/lang/String;)V
.end method

.method public static final native DocVideoSession_CreateProcessingSettings(JLcom/smartengines/doc/DocVideoSession;)J
.end method

.method public static final native DocVideoSession_GetActivationRequest(JLcom/smartengines/doc/DocVideoSession;)Ljava/lang/String;
.end method

.method public static final native DocVideoSession_GetCurrentResult(JLcom/smartengines/doc/DocVideoSession;)J
.end method

.method public static final native DocVideoSession_GetMutableCurrentResult(JLcom/smartengines/doc/DocVideoSession;)J
.end method

.method public static final native DocVideoSession_IsActivated(JLcom/smartengines/doc/DocVideoSession;)Z
.end method

.method public static final native DocVideoSession_ProcessImage(JLcom/smartengines/doc/DocVideoSession;JLcom/smartengines/common/Image;JLcom/smartengines/doc/DocProcessingSettings;)V
.end method

.method public static final native DocVideoSession_Reset(JLcom/smartengines/doc/DocVideoSession;)V
.end method

.method public static final native DocView_BaseClassNameStatic()Ljava/lang/String;
.end method

.method public static final native DocView_GetAncestorID(JLcom/smartengines/doc/DocView;)I
.end method

.method public static final native DocView_GetImage(JLcom/smartengines/doc/DocView;)J
.end method

.method public static final native DocView_GetMutableImage(JLcom/smartengines/doc/DocView;)J
.end method

.method public static final native DocView_GetMutableTransform(JLcom/smartengines/doc/DocView;)J
.end method

.method public static final native DocView_GetRootAncestorID(JLcom/smartengines/doc/DocView;)I
.end method

.method public static final native DocView_GetTransform(JLcom/smartengines/doc/DocView;)J
.end method

.method public static final native DocView_Serialize(JLcom/smartengines/doc/DocView;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native DocView_SetAncestorID(JLcom/smartengines/doc/DocView;I)V
.end method

.method public static final native DocView_SetImage(JLcom/smartengines/doc/DocView;JLcom/smartengines/common/Image;)V
.end method

.method public static final native DocView_SetRootAncestorID(JLcom/smartengines/doc/DocView;I)V
.end method

.method public static final native DocView_SetTransform(JLcom/smartengines/doc/DocView;JLcom/smartengines/common/ProjectiveTransform;)V
.end method

.method public static final native DocViewsCollection_BaseClassNameStatic()Ljava/lang/String;
.end method

.method public static final native DocViewsCollection_DeleteOrphans(JLcom/smartengines/doc/DocViewsCollection;)V
.end method

.method public static final native DocViewsCollection_DeleteView(JLcom/smartengines/doc/DocViewsCollection;I)V
.end method

.method public static final native DocViewsCollection_GetMutableView(JLcom/smartengines/doc/DocViewsCollection;I)J
.end method

.method public static final native DocViewsCollection_GetView(JLcom/smartengines/doc/DocViewsCollection;I)J
.end method

.method public static final native DocViewsCollection_GetViewTags(JLcom/smartengines/doc/DocViewsCollection;I)J
.end method

.method public static final native DocViewsCollection_GetViewsCount(JLcom/smartengines/doc/DocViewsCollection;)I
.end method

.method public static final native DocViewsCollection_HasView(JLcom/smartengines/doc/DocViewsCollection;I)Z
.end method

.method public static final native DocViewsCollection_MutableViewsBegin(JLcom/smartengines/doc/DocViewsCollection;)J
.end method

.method public static final native DocViewsCollection_MutableViewsEnd(JLcom/smartengines/doc/DocViewsCollection;)J
.end method

.method public static final native DocViewsCollection_MutableViewsSlice(JLcom/smartengines/doc/DocViewsCollection;Ljava/lang/String;)J
.end method

.method public static final native DocViewsCollection_RegisterDerivedView(JLcom/smartengines/doc/DocViewsCollection;JLcom/smartengines/common/Image;IJLcom/smartengines/common/ProjectiveTransform;)J
.end method

.method public static final native DocViewsCollection_RegisterView(JLcom/smartengines/doc/DocViewsCollection;JLcom/smartengines/common/Image;)J
.end method

.method public static final native DocViewsCollection_Serialize(JLcom/smartengines/doc/DocViewsCollection;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native DocViewsCollection_ViewsBegin(JLcom/smartengines/doc/DocViewsCollection;)J
.end method

.method public static final native DocViewsCollection_ViewsEnd(JLcom/smartengines/doc/DocViewsCollection;)J
.end method

.method public static final native DocViewsCollection_ViewsSlice(JLcom/smartengines/doc/DocViewsCollection;Ljava/lang/String;)J
.end method

.method public static final native DocViewsIterator_Advance(JLcom/smartengines/doc/DocViewsIterator;)V
.end method

.method public static final native DocViewsIterator_Equals(JLcom/smartengines/doc/DocViewsIterator;JLcom/smartengines/doc/DocViewsIterator;)Z
.end method

.method public static final native DocViewsIterator_GetID(JLcom/smartengines/doc/DocViewsIterator;)I
.end method

.method public static final native DocViewsIterator_GetTags(JLcom/smartengines/doc/DocViewsIterator;)J
.end method

.method public static final native DocViewsIterator_GetView(JLcom/smartengines/doc/DocViewsIterator;)J
.end method

.method public static final native DocViewsMutableIterator_Advance(JLcom/smartengines/doc/DocViewsMutableIterator;)V
.end method

.method public static final native DocViewsMutableIterator_Equals(JLcom/smartengines/doc/DocViewsMutableIterator;JLcom/smartengines/doc/DocViewsMutableIterator;)Z
.end method

.method public static final native DocViewsMutableIterator_GetID(JLcom/smartengines/doc/DocViewsMutableIterator;)I
.end method

.method public static final native DocViewsMutableIterator_GetMutableView(JLcom/smartengines/doc/DocViewsMutableIterator;)J
.end method

.method public static final native DocViewsMutableIterator_GetTags(JLcom/smartengines/doc/DocViewsMutableIterator;)J
.end method

.method public static final native DocViewsMutableIterator_GetView(JLcom/smartengines/doc/DocViewsMutableIterator;)J
.end method

.method public static final native DocViewsMutableSliceIterator_Advance(JLcom/smartengines/doc/DocViewsMutableSliceIterator;)V
.end method

.method public static final native DocViewsMutableSliceIterator_Finished(JLcom/smartengines/doc/DocViewsMutableSliceIterator;)Z
.end method

.method public static final native DocViewsMutableSliceIterator_GetID(JLcom/smartengines/doc/DocViewsMutableSliceIterator;)I
.end method

.method public static final native DocViewsMutableSliceIterator_GetMutableView(JLcom/smartengines/doc/DocViewsMutableSliceIterator;)J
.end method

.method public static final native DocViewsMutableSliceIterator_GetTags(JLcom/smartengines/doc/DocViewsMutableSliceIterator;)J
.end method

.method public static final native DocViewsMutableSliceIterator_GetView(JLcom/smartengines/doc/DocViewsMutableSliceIterator;)J
.end method

.method public static final native DocViewsSliceIterator_Advance(JLcom/smartengines/doc/DocViewsSliceIterator;)V
.end method

.method public static final native DocViewsSliceIterator_Finished(JLcom/smartengines/doc/DocViewsSliceIterator;)Z
.end method

.method public static final native DocViewsSliceIterator_GetID(JLcom/smartengines/doc/DocViewsSliceIterator;)I
.end method

.method public static final native DocViewsSliceIterator_GetTags(JLcom/smartengines/doc/DocViewsSliceIterator;)J
.end method

.method public static final native DocViewsSliceIterator_GetView(JLcom/smartengines/doc/DocViewsSliceIterator;)J
.end method

.method public static final native DocZoneObject_GetMutableSize(JLcom/smartengines/doc/DocZoneObject;)J
.end method

.method public static final native DocZoneObject_GetSize(JLcom/smartengines/doc/DocZoneObject;)J
.end method

.method public static final native DocZoneObject_ObjectTypeStatic()Ljava/lang/String;
.end method

.method public static final native DocZoneObject_SWIGUpcast(J)J
.end method

.method public static final native DocZoneObject_SetSize(JLcom/smartengines/doc/DocZoneObject;JLcom/smartengines/common/Size;)V
.end method

.method public static final native Document_AttributesBegin(JLcom/smartengines/doc/Document;)J
.end method

.method public static final native Document_AttributesEnd(JLcom/smartengines/doc/Document;)J
.end method

.method public static final native Document_BarcodeFieldsBegin(JLcom/smartengines/doc/Document;)J
.end method

.method public static final native Document_BarcodeFieldsEnd(JLcom/smartengines/doc/Document;)J
.end method

.method public static final native Document_BaseClassNameStatic()Ljava/lang/String;
.end method

.method public static final native Document_CheckboxFieldsBegin(JLcom/smartengines/doc/Document;)J
.end method

.method public static final native Document_CheckboxFieldsEnd(JLcom/smartengines/doc/Document;)J
.end method

.method public static final native Document_ForensicCheckFieldsBegin(JLcom/smartengines/doc/Document;)J
.end method

.method public static final native Document_ForensicCheckFieldsEnd(JLcom/smartengines/doc/Document;)J
.end method

.method public static final native Document_ForensicFieldsBegin(JLcom/smartengines/doc/Document;)J
.end method

.method public static final native Document_ForensicFieldsEnd(JLcom/smartengines/doc/Document;)J
.end method

.method public static final native Document_GetAttribute(JLcom/smartengines/doc/Document;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native Document_GetAttributesCount(JLcom/smartengines/doc/Document;)I
.end method

.method public static final native Document_GetBarcodeField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J
.end method

.method public static final native Document_GetBarcodeFieldsCount(JLcom/smartengines/doc/Document;)I
.end method

.method public static final native Document_GetCheckboxField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J
.end method

.method public static final native Document_GetCheckboxFieldsCount(JLcom/smartengines/doc/Document;)I
.end method

.method public static final native Document_GetForensicCheckField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J
.end method

.method public static final native Document_GetForensicCheckFieldPtr(JLcom/smartengines/doc/Document;Ljava/lang/String;)J
.end method

.method public static final native Document_GetForensicCheckFieldsCount(JLcom/smartengines/doc/Document;)I
.end method

.method public static final native Document_GetForensicField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J
.end method

.method public static final native Document_GetForensicFieldsCount(JLcom/smartengines/doc/Document;)I
.end method

.method public static final native Document_GetImageField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J
.end method

.method public static final native Document_GetImageFieldsCount(JLcom/smartengines/doc/Document;)I
.end method

.method public static final native Document_GetMutableBarcodeField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J
.end method

.method public static final native Document_GetMutableCheckboxField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J
.end method

.method public static final native Document_GetMutableForensicCheckField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J
.end method

.method public static final native Document_GetMutableForensicCheckFieldPtr(JLcom/smartengines/doc/Document;Ljava/lang/String;)J
.end method

.method public static final native Document_GetMutableForensicField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J
.end method

.method public static final native Document_GetMutableImageField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J
.end method

.method public static final native Document_GetMutableTableField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J
.end method

.method public static final native Document_GetMutableTextField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J
.end method

.method public static final native Document_GetPhysicalDocIdx(JLcom/smartengines/doc/Document;)I
.end method

.method public static final native Document_GetTableField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J
.end method

.method public static final native Document_GetTableFieldsCount(JLcom/smartengines/doc/Document;)I
.end method

.method public static final native Document_GetTextField(JLcom/smartengines/doc/Document;Ljava/lang/String;)J
.end method

.method public static final native Document_GetTextFieldsCount(JLcom/smartengines/doc/Document;)I
.end method

.method public static final native Document_GetType(JLcom/smartengines/doc/Document;)Ljava/lang/String;
.end method

.method public static final native Document_HasAttribute(JLcom/smartengines/doc/Document;Ljava/lang/String;)Z
.end method

.method public static final native Document_HasBarcodeField(JLcom/smartengines/doc/Document;Ljava/lang/String;)Z
.end method

.method public static final native Document_HasCheckboxField(JLcom/smartengines/doc/Document;Ljava/lang/String;)Z
.end method

.method public static final native Document_HasForensicCheckField(JLcom/smartengines/doc/Document;Ljava/lang/String;)Z
.end method

.method public static final native Document_HasForensicField(JLcom/smartengines/doc/Document;Ljava/lang/String;)Z
.end method

.method public static final native Document_HasImageField(JLcom/smartengines/doc/Document;Ljava/lang/String;)Z
.end method

.method public static final native Document_HasTableField(JLcom/smartengines/doc/Document;Ljava/lang/String;)Z
.end method

.method public static final native Document_HasTextField(JLcom/smartengines/doc/Document;Ljava/lang/String;)Z
.end method

.method public static final native Document_ImageFieldsBegin(JLcom/smartengines/doc/Document;)J
.end method

.method public static final native Document_ImageFieldsEnd(JLcom/smartengines/doc/Document;)J
.end method

.method public static final native Document_RemoveAttribute(JLcom/smartengines/doc/Document;Ljava/lang/String;)V
.end method

.method public static final native Document_RemoveBarcodeField(JLcom/smartengines/doc/Document;Ljava/lang/String;)V
.end method

.method public static final native Document_RemoveCheckboxField(JLcom/smartengines/doc/Document;Ljava/lang/String;)V
.end method

.method public static final native Document_RemoveForensicCheckField(JLcom/smartengines/doc/Document;Ljava/lang/String;)V
.end method

.method public static final native Document_RemoveForensicField(JLcom/smartengines/doc/Document;Ljava/lang/String;)V
.end method

.method public static final native Document_RemoveImageField(JLcom/smartengines/doc/Document;Ljava/lang/String;)V
.end method

.method public static final native Document_RemoveTableField(JLcom/smartengines/doc/Document;Ljava/lang/String;)V
.end method

.method public static final native Document_RemoveTextField(JLcom/smartengines/doc/Document;Ljava/lang/String;)V
.end method

.method public static final native Document_Serialize(JLcom/smartengines/doc/Document;JLcom/smartengines/common/Serializer;)V
.end method

.method public static final native Document_SetAttribute(JLcom/smartengines/doc/Document;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static final native Document_SetBarcodeField(JLcom/smartengines/doc/Document;Ljava/lang/String;JLcom/smartengines/doc/DocBarcodeField;)V
.end method

.method public static final native Document_SetCheckboxField(JLcom/smartengines/doc/Document;Ljava/lang/String;JLcom/smartengines/doc/DocCheckboxField;)V
.end method

.method public static final native Document_SetForensicCheckField(JLcom/smartengines/doc/Document;Ljava/lang/String;JLcom/smartengines/doc/DocForensicCheckField;)V
.end method

.method public static final native Document_SetForensicField(JLcom/smartengines/doc/Document;Ljava/lang/String;JLcom/smartengines/doc/DocForensicField;)V
.end method

.method public static final native Document_SetImageField(JLcom/smartengines/doc/Document;Ljava/lang/String;JLcom/smartengines/doc/DocImageField;)V
.end method

.method public static final native Document_SetTableField(JLcom/smartengines/doc/Document;Ljava/lang/String;JLcom/smartengines/doc/DocTableField;)V
.end method

.method public static final native Document_SetTextField(JLcom/smartengines/doc/Document;Ljava/lang/String;JLcom/smartengines/doc/DocTextField;)V
.end method

.method public static final native Document_TableFieldsBegin(JLcom/smartengines/doc/Document;)J
.end method

.method public static final native Document_TableFieldsEnd(JLcom/smartengines/doc/Document;)J
.end method

.method public static final native Document_TextFieldsBegin(JLcom/smartengines/doc/Document;)J
.end method

.method public static final native Document_TextFieldsEnd(JLcom/smartengines/doc/Document;)J
.end method

.method public static final native DocumentsIterator_Advance(JLcom/smartengines/doc/DocumentsIterator;)V
.end method

.method public static final native DocumentsIterator_Equals(JLcom/smartengines/doc/DocumentsIterator;JLcom/smartengines/doc/DocumentsIterator;)Z
.end method

.method public static final native DocumentsIterator_GetDocument(JLcom/smartengines/doc/DocumentsIterator;)J
.end method

.method public static final native DocumentsIterator_GetID(JLcom/smartengines/doc/DocumentsIterator;)I
.end method

.method public static final native DocumentsIterator_GetTags(JLcom/smartengines/doc/DocumentsIterator;)J
.end method

.method public static final native DocumentsMutableIterator_Advance(JLcom/smartengines/doc/DocumentsMutableIterator;)V
.end method

.method public static final native DocumentsMutableIterator_Equals(JLcom/smartengines/doc/DocumentsMutableIterator;JLcom/smartengines/doc/DocumentsMutableIterator;)Z
.end method

.method public static final native DocumentsMutableIterator_GetDocument(JLcom/smartengines/doc/DocumentsMutableIterator;)J
.end method

.method public static final native DocumentsMutableIterator_GetID(JLcom/smartengines/doc/DocumentsMutableIterator;)I
.end method

.method public static final native DocumentsMutableIterator_GetMutableDocument(JLcom/smartengines/doc/DocumentsMutableIterator;)J
.end method

.method public static final native DocumentsMutableIterator_GetTags(JLcom/smartengines/doc/DocumentsMutableIterator;)J
.end method

.method public static final native DocumentsMutableSliceIterator_Advance(JLcom/smartengines/doc/DocumentsMutableSliceIterator;)V
.end method

.method public static final native DocumentsMutableSliceIterator_Finished(JLcom/smartengines/doc/DocumentsMutableSliceIterator;)Z
.end method

.method public static final native DocumentsMutableSliceIterator_GetDocument(JLcom/smartengines/doc/DocumentsMutableSliceIterator;)J
.end method

.method public static final native DocumentsMutableSliceIterator_GetID(JLcom/smartengines/doc/DocumentsMutableSliceIterator;)I
.end method

.method public static final native DocumentsMutableSliceIterator_GetMutableDocument(JLcom/smartengines/doc/DocumentsMutableSliceIterator;)J
.end method

.method public static final native DocumentsMutableSliceIterator_GetTags(JLcom/smartengines/doc/DocumentsMutableSliceIterator;)J
.end method

.method public static final native DocumentsSliceIterator_Advance(JLcom/smartengines/doc/DocumentsSliceIterator;)V
.end method

.method public static final native DocumentsSliceIterator_Finished(JLcom/smartengines/doc/DocumentsSliceIterator;)Z
.end method

.method public static final native DocumentsSliceIterator_GetDocument(JLcom/smartengines/doc/DocumentsSliceIterator;)J
.end method

.method public static final native DocumentsSliceIterator_GetID(JLcom/smartengines/doc/DocumentsSliceIterator;)I
.end method

.method public static final native DocumentsSliceIterator_GetTags(JLcom/smartengines/doc/DocumentsSliceIterator;)J
.end method

.method public static SwigDirector_DocExternalProcessorInterface_Process(Lcom/smartengines/doc/DocExternalProcessorInterface;JJJ)V
    .locals 2

    .line 984
    new-instance v0, Lcom/smartengines/doc/DocResult;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/doc/DocResult;-><init>(JZ)V

    new-instance p1, Lcom/smartengines/doc/DocProcessingSettings;

    invoke-direct {p1, p3, p4, v1}, Lcom/smartengines/doc/DocProcessingSettings;-><init>(JZ)V

    new-instance p2, Lcom/smartengines/doc/DocProcessingArguments;

    invoke-direct {p2, p5, p6, v1}, Lcom/smartengines/doc/DocProcessingArguments;-><init>(JZ)V

    invoke-virtual {p0, v0, p1, p2}, Lcom/smartengines/doc/DocExternalProcessorInterface;->Process(Lcom/smartengines/doc/DocResult;Lcom/smartengines/doc/DocProcessingSettings;Lcom/smartengines/doc/DocProcessingArguments;)V

    return-void
.end method

.method public static SwigDirector_DocFeedback_AcceptsPagePreprocessingFeedback(Lcom/smartengines/doc/DocFeedback;)Z
    .locals 0

    .line 963
    invoke-virtual {p0}, Lcom/smartengines/doc/DocFeedback;->AcceptsPagePreprocessingFeedback()Z

    move-result p0

    return p0
.end method

.method public static SwigDirector_DocFeedback_AcceptsPagesLocalizationFeedback(Lcom/smartengines/doc/DocFeedback;)Z
    .locals 0

    .line 957
    invoke-virtual {p0}, Lcom/smartengines/doc/DocFeedback;->AcceptsPagesLocalizationFeedback()Z

    move-result p0

    return p0
.end method

.method public static SwigDirector_DocFeedback_AcceptsRawFieldsLocalizationFeedback(Lcom/smartengines/doc/DocFeedback;)Z
    .locals 0

    .line 969
    invoke-virtual {p0}, Lcom/smartengines/doc/DocFeedback;->AcceptsRawFieldsLocalizationFeedback()Z

    move-result p0

    return p0
.end method

.method public static SwigDirector_DocFeedback_AcceptsRawFieldsRecognitionFeedback(Lcom/smartengines/doc/DocFeedback;)Z
    .locals 0

    .line 975
    invoke-virtual {p0}, Lcom/smartengines/doc/DocFeedback;->AcceptsRawFieldsRecognitionFeedback()Z

    move-result p0

    return p0
.end method

.method public static SwigDirector_DocFeedback_FeedbackReceived(Lcom/smartengines/doc/DocFeedback;J)V
    .locals 2

    .line 954
    new-instance v0, Lcom/smartengines/doc/DocFeedbackContainer;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/doc/DocFeedbackContainer;-><init>(JZ)V

    invoke-virtual {p0, v0}, Lcom/smartengines/doc/DocFeedback;->FeedbackReceived(Lcom/smartengines/doc/DocFeedbackContainer;)V

    return-void
.end method

.method public static SwigDirector_DocFeedback_PagePrepocessingFeedbackReceived(Lcom/smartengines/doc/DocFeedback;J)V
    .locals 2

    .line 966
    new-instance v0, Lcom/smartengines/doc/DocPagesFeedbackContainer;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/doc/DocPagesFeedbackContainer;-><init>(JZ)V

    invoke-virtual {p0, v0}, Lcom/smartengines/doc/DocFeedback;->PagePrepocessingFeedbackReceived(Lcom/smartengines/doc/DocPagesFeedbackContainer;)V

    return-void
.end method

.method public static SwigDirector_DocFeedback_PagesLocalizationFeedbackReceived(Lcom/smartengines/doc/DocFeedback;J)V
    .locals 2

    .line 960
    new-instance v0, Lcom/smartengines/doc/DocPagesFeedbackContainer;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/doc/DocPagesFeedbackContainer;-><init>(JZ)V

    invoke-virtual {p0, v0}, Lcom/smartengines/doc/DocFeedback;->PagesLocalizationFeedbackReceived(Lcom/smartengines/doc/DocPagesFeedbackContainer;)V

    return-void
.end method

.method public static SwigDirector_DocFeedback_RawFiedlsRecognitionFeedbackReceived(Lcom/smartengines/doc/DocFeedback;J)V
    .locals 2

    .line 978
    new-instance v0, Lcom/smartengines/doc/DocRawFieldsFeedbackContainer;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/doc/DocRawFieldsFeedbackContainer;-><init>(JZ)V

    invoke-virtual {p0, v0}, Lcom/smartengines/doc/DocFeedback;->RawFiedlsRecognitionFeedbackReceived(Lcom/smartengines/doc/DocRawFieldsFeedbackContainer;)V

    return-void
.end method

.method public static SwigDirector_DocFeedback_RawFieldsLocalizationFeedbackReceived(Lcom/smartengines/doc/DocFeedback;J)V
    .locals 2

    .line 972
    new-instance v0, Lcom/smartengines/doc/DocRawFieldsFeedbackContainer;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/doc/DocRawFieldsFeedbackContainer;-><init>(JZ)V

    invoke-virtual {p0, v0}, Lcom/smartengines/doc/DocFeedback;->RawFieldsLocalizationFeedbackReceived(Lcom/smartengines/doc/DocRawFieldsFeedbackContainer;)V

    return-void
.end method

.method public static SwigDirector_DocFeedback_ResultReceived(Lcom/smartengines/doc/DocFeedback;J)V
    .locals 2

    .line 981
    new-instance v0, Lcom/smartengines/doc/DocResult;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/doc/DocResult;-><init>(JZ)V

    invoke-virtual {p0, v0}, Lcom/smartengines/doc/DocFeedback;->ResultReceived(Lcom/smartengines/doc/DocResult;)V

    return-void
.end method

.method public static final native delete_DocBarcodeField(J)V
.end method

.method public static final native delete_DocBarcodeFieldsIterator(J)V
.end method

.method public static final native delete_DocBarcodeObject(J)V
.end method

.method public static final native delete_DocBarcodeObjectsCrossPageIterator(J)V
.end method

.method public static final native delete_DocBarcodeObjectsIterator(J)V
.end method

.method public static final native delete_DocBaseFieldInfo(J)V
.end method

.method public static final native delete_DocBaseObjectInfo(J)V
.end method

.method public static final native delete_DocBasicObject(J)V
.end method

.method public static final native delete_DocBasicObjectsCrossSliceIterator(J)V
.end method

.method public static final native delete_DocBasicObjectsIterator(J)V
.end method

.method public static final native delete_DocBasicObjectsMutableCrossSliceIterator(J)V
.end method

.method public static final native delete_DocBasicObjectsMutableIterator(J)V
.end method

.method public static final native delete_DocBasicObjectsMutableSliceIterator(J)V
.end method

.method public static final native delete_DocBasicObjectsSliceIterator(J)V
.end method

.method public static final native delete_DocCheckboxField(J)V
.end method

.method public static final native delete_DocCheckboxFieldsIterator(J)V
.end method

.method public static final native delete_DocCheckboxObject(J)V
.end method

.method public static final native delete_DocCheckboxObjectsCrossPageIterator(J)V
.end method

.method public static final native delete_DocCheckboxObjectsIterator(J)V
.end method

.method public static final native delete_DocDocumentFieldInfo(J)V
.end method

.method public static final native delete_DocDocumentFieldsInfoIterator(J)V
.end method

.method public static final native delete_DocDocumentInfo(J)V
.end method

.method public static final native delete_DocDocumentTableFieldColumnInfo(J)V
.end method

.method public static final native delete_DocDocumentTableFieldColumnsInfoInterator(J)V
.end method

.method public static final native delete_DocEngine(J)V
.end method

.method public static final native delete_DocExternalProcessorInterface(J)V
.end method

.method public static final native delete_DocFeedback(J)V
.end method

.method public static final native delete_DocFeedbackContainer(J)V
.end method

.method public static final native delete_DocForensicCheckField(J)V
.end method

.method public static final native delete_DocForensicCheckFieldsIterator(J)V
.end method

.method public static final native delete_DocForensicCheckObject(J)V
.end method

.method public static final native delete_DocForensicCheckObjectsCrossPageIterator(J)V
.end method

.method public static final native delete_DocForensicCheckObjectsIterator(J)V
.end method

.method public static final native delete_DocForensicField(J)V
.end method

.method public static final native delete_DocForensicFieldsIterator(J)V
.end method

.method public static final native delete_DocGraphicalStructure(J)V
.end method

.method public static final native delete_DocImageField(J)V
.end method

.method public static final native delete_DocImageFieldsIterator(J)V
.end method

.method public static final native delete_DocImageObject(J)V
.end method

.method public static final native delete_DocImageObjectsCrossPageIterator(J)V
.end method

.method public static final native delete_DocImageObjectsIterator(J)V
.end method

.method public static final native delete_DocLineObject(J)V
.end method

.method public static final native delete_DocMarkObject(J)V
.end method

.method public static final native delete_DocMetaObject(J)V
.end method

.method public static final native delete_DocMetaObjectsCrossPageIterator(J)V
.end method

.method public static final native delete_DocMetaObjectsIterator(J)V
.end method

.method public static final native delete_DocMultiStringTextObject(J)V
.end method

.method public static final native delete_DocObjectsCollection(J)V
.end method

.method public static final native delete_DocObjectsCollectionsIterator(J)V
.end method

.method public static final native delete_DocObjectsCollectionsMutableIterator(J)V
.end method

.method public static final native delete_DocObjectsCollectionsMutableSliceIterator(J)V
.end method

.method public static final native delete_DocObjectsCollectionsSliceIterator(J)V
.end method

.method public static final native delete_DocPageFeedback(J)V
.end method

.method public static final native delete_DocPageInfo(J)V
.end method

.method public static final native delete_DocPagesFeedbackContainer(J)V
.end method

.method public static final native delete_DocPhysicalDocument(J)V
.end method

.method public static final native delete_DocPhysicalPage(J)V
.end method

.method public static final native delete_DocProcessingArguments(J)V
.end method

.method public static final native delete_DocProcessingSettings(J)V
.end method

.method public static final native delete_DocRawFieldFeedback(J)V
.end method

.method public static final native delete_DocRawFieldsFeedbackContainer(J)V
.end method

.method public static final native delete_DocResult(J)V
.end method

.method public static final native delete_DocSceneInfo(J)V
.end method

.method public static final native delete_DocSession(J)V
.end method

.method public static final native delete_DocSessionSettings(J)V
.end method

.method public static final native delete_DocTableField(J)V
.end method

.method public static final native delete_DocTableFieldsIterator(J)V
.end method

.method public static final native delete_DocTableObject(J)V
.end method

.method public static final native delete_DocTableObjectsCrossPageIterator(J)V
.end method

.method public static final native delete_DocTableObjectsIterator(J)V
.end method

.method public static final native delete_DocTagsCollection(J)V
.end method

.method public static final native delete_DocTemplateObject(J)V
.end method

.method public static final native delete_DocTextField(J)V
.end method

.method public static final native delete_DocTextFieldsIterator(J)V
.end method

.method public static final native delete_DocTextLineObject(J)V
.end method

.method public static final native delete_DocTextObject(J)V
.end method

.method public static final native delete_DocTextObjectsCrossPageIterator(J)V
.end method

.method public static final native delete_DocTextObjectsIterator(J)V
.end method

.method public static final native delete_DocVideoSession(J)V
.end method

.method public static final native delete_DocView(J)V
.end method

.method public static final native delete_DocViewsCollection(J)V
.end method

.method public static final native delete_DocViewsIterator(J)V
.end method

.method public static final native delete_DocViewsMutableIterator(J)V
.end method

.method public static final native delete_DocViewsMutableSliceIterator(J)V
.end method

.method public static final native delete_DocViewsSliceIterator(J)V
.end method

.method public static final native delete_DocZoneObject(J)V
.end method

.method public static final native delete_Document(J)V
.end method

.method public static final native delete_DocumentsIterator(J)V
.end method

.method public static final native delete_DocumentsMutableIterator(J)V
.end method

.method public static final native delete_DocumentsMutableSliceIterator(J)V
.end method

.method public static final native delete_DocumentsSliceIterator(J)V
.end method

.method public static final native new_DocBarcodeFieldsIterator(JLcom/smartengines/doc/DocBarcodeFieldsIterator;)J
.end method

.method public static final native new_DocBarcodeObjectsCrossPageIterator(JLcom/smartengines/doc/DocBarcodeObjectsCrossPageIterator;)J
.end method

.method public static final native new_DocBarcodeObjectsIterator(JLcom/smartengines/doc/DocBarcodeObjectsIterator;)J
.end method

.method public static final native new_DocBasicObjectsCrossSliceIterator(JLcom/smartengines/doc/DocBasicObjectsCrossSliceIterator;)J
.end method

.method public static final native new_DocBasicObjectsIterator(JLcom/smartengines/doc/DocBasicObjectsIterator;)J
.end method

.method public static final native new_DocBasicObjectsMutableCrossSliceIterator(JLcom/smartengines/doc/DocBasicObjectsMutableCrossSliceIterator;)J
.end method

.method public static final native new_DocBasicObjectsMutableIterator(JLcom/smartengines/doc/DocBasicObjectsMutableIterator;)J
.end method

.method public static final native new_DocBasicObjectsMutableSliceIterator(JLcom/smartengines/doc/DocBasicObjectsMutableSliceIterator;)J
.end method

.method public static final native new_DocBasicObjectsSliceIterator(JLcom/smartengines/doc/DocBasicObjectsSliceIterator;)J
.end method

.method public static final native new_DocCheckboxFieldsIterator(JLcom/smartengines/doc/DocCheckboxFieldsIterator;)J
.end method

.method public static final native new_DocCheckboxObjectsCrossPageIterator(JLcom/smartengines/doc/DocCheckboxObjectsCrossPageIterator;)J
.end method

.method public static final native new_DocCheckboxObjectsIterator(JLcom/smartengines/doc/DocCheckboxObjectsIterator;)J
.end method

.method public static final native new_DocDocumentFieldsInfoIterator(JLcom/smartengines/doc/DocDocumentFieldsInfoIterator;)J
.end method

.method public static final native new_DocDocumentTableFieldColumnsInfoInterator(JLcom/smartengines/doc/DocDocumentTableFieldColumnsInfoInterator;)J
.end method

.method public static final native new_DocExternalProcessorInterface()J
.end method

.method public static final native new_DocFeedback()J
.end method

.method public static final native new_DocForensicCheckFieldsIterator(JLcom/smartengines/doc/DocForensicCheckFieldsIterator;)J
.end method

.method public static final native new_DocForensicCheckObjectsCrossPageIterator(JLcom/smartengines/doc/DocForensicCheckObjectsCrossPageIterator;)J
.end method

.method public static final native new_DocForensicCheckObjectsIterator(JLcom/smartengines/doc/DocForensicCheckObjectsIterator;)J
.end method

.method public static final native new_DocForensicFieldsIterator(JLcom/smartengines/doc/DocForensicFieldsIterator;)J
.end method

.method public static final native new_DocImageFieldsIterator(JLcom/smartengines/doc/DocImageFieldsIterator;)J
.end method

.method public static final native new_DocImageObjectsCrossPageIterator(JLcom/smartengines/doc/DocImageObjectsCrossPageIterator;)J
.end method

.method public static final native new_DocImageObjectsIterator(JLcom/smartengines/doc/DocImageObjectsIterator;)J
.end method

.method public static final native new_DocMetaObjectsCrossPageIterator(JLcom/smartengines/doc/DocMetaObjectsCrossPageIterator;)J
.end method

.method public static final native new_DocMetaObjectsIterator(JLcom/smartengines/doc/DocMetaObjectsIterator;)J
.end method

.method public static final native new_DocObjectsCollectionsIterator(JLcom/smartengines/doc/DocObjectsCollectionsIterator;)J
.end method

.method public static final native new_DocObjectsCollectionsMutableIterator(JLcom/smartengines/doc/DocObjectsCollectionsMutableIterator;)J
.end method

.method public static final native new_DocObjectsCollectionsMutableSliceIterator(JLcom/smartengines/doc/DocObjectsCollectionsMutableSliceIterator;)J
.end method

.method public static final native new_DocObjectsCollectionsSliceIterator(JLcom/smartengines/doc/DocObjectsCollectionsSliceIterator;)J
.end method

.method public static final native new_DocTableFieldsIterator(JLcom/smartengines/doc/DocTableFieldsIterator;)J
.end method

.method public static final native new_DocTableObjectsCrossPageIterator(JLcom/smartengines/doc/DocTableObjectsCrossPageIterator;)J
.end method

.method public static final native new_DocTableObjectsIterator(JLcom/smartengines/doc/DocTableObjectsIterator;)J
.end method

.method public static final native new_DocTextFieldsIterator(JLcom/smartengines/doc/DocTextFieldsIterator;)J
.end method

.method public static final native new_DocTextObjectsCrossPageIterator(JLcom/smartengines/doc/DocTextObjectsCrossPageIterator;)J
.end method

.method public static final native new_DocTextObjectsIterator(JLcom/smartengines/doc/DocTextObjectsIterator;)J
.end method

.method public static final native new_DocViewsIterator(JLcom/smartengines/doc/DocViewsIterator;)J
.end method

.method public static final native new_DocViewsMutableIterator(JLcom/smartengines/doc/DocViewsMutableIterator;)J
.end method

.method public static final native new_DocViewsMutableSliceIterator(JLcom/smartengines/doc/DocViewsMutableSliceIterator;)J
.end method

.method public static final native new_DocViewsSliceIterator(JLcom/smartengines/doc/DocViewsSliceIterator;)J
.end method

.method public static final native new_DocumentsIterator(JLcom/smartengines/doc/DocumentsIterator;)J
.end method

.method public static final native new_DocumentsMutableIterator(JLcom/smartengines/doc/DocumentsMutableIterator;)J
.end method

.method public static final native new_DocumentsMutableSliceIterator(JLcom/smartengines/doc/DocumentsMutableSliceIterator;)J
.end method

.method public static final native new_DocumentsSliceIterator(JLcom/smartengines/doc/DocumentsSliceIterator;)J
.end method

.method private static final native swig_module_init()V
.end method
