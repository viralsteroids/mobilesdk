.class public Lcom/smartengines/code/jnicodeengineJNI;
.super Ljava/lang/Object;
.source "jnicodeengineJNI.java"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 213
    invoke-static {}, Lcom/smartengines/code/jnicodeengineJNI;->swig_module_init()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final native BarcodePreset_AAMVA_get()I
.end method

.method public static final native BarcodePreset_EMAIL_get()I
.end method

.method public static final native BarcodePreset_GEO_get()I
.end method

.method public static final native BarcodePreset_GS1_get()I
.end method

.method public static final native BarcodePreset_ICALENDAR_get()I
.end method

.method public static final native BarcodePreset_ISBN_get()I
.end method

.method public static final native BarcodePreset_NONE_get()I
.end method

.method public static final native BarcodePreset_PAYMENT_get()I
.end method

.method public static final native BarcodePreset_PHONE_get()I
.end method

.method public static final native BarcodePreset_SMS_get()I
.end method

.method public static final native BarcodePreset_URL_get()I
.end method

.method public static final native BarcodePreset_VCARD_get()I
.end method

.method public static final native BarcodePreset_WIFI_get()I
.end method

.method public static final native CodeEngineFeedbackContainer_GetQuadrangle(JLcom/smartengines/code/CodeEngineFeedbackContainer;Ljava/lang/String;)J
.end method

.method public static final native CodeEngineFeedbackContainer_GetQuadranglesCount(JLcom/smartengines/code/CodeEngineFeedbackContainer;)I
.end method

.method public static final native CodeEngineFeedbackContainer_HasQuadrangle(JLcom/smartengines/code/CodeEngineFeedbackContainer;Ljava/lang/String;)Z
.end method

.method public static final native CodeEngineFeedbackContainer_QuadranglesBegin(JLcom/smartengines/code/CodeEngineFeedbackContainer;)J
.end method

.method public static final native CodeEngineFeedbackContainer_QuadranglesEnd(JLcom/smartengines/code/CodeEngineFeedbackContainer;)J
.end method

.method public static final native CodeEngineFeedbackContainer_RemoveQuadrangle(JLcom/smartengines/code/CodeEngineFeedbackContainer;Ljava/lang/String;)V
.end method

.method public static final native CodeEngineFeedbackContainer_SetQuadrangle(JLcom/smartengines/code/CodeEngineFeedbackContainer;Ljava/lang/String;JLcom/smartengines/common/Quadrangle;)V
.end method

.method public static final native CodeEngineResult_GetCodeObject(JLcom/smartengines/code/CodeEngineResult;Ljava/lang/String;)J
.end method

.method public static final native CodeEngineResult_GetObjectCount(JLcom/smartengines/code/CodeEngineResult;)I
.end method

.method public static final native CodeEngineResult_HasObject(JLcom/smartengines/code/CodeEngineResult;Ljava/lang/String;)Z
.end method

.method public static final native CodeEngineResult_IsTerminal(JLcom/smartengines/code/CodeEngineResult;)Z
.end method

.method public static final native CodeEngineResult_ObjectsBegin(JLcom/smartengines/code/CodeEngineResult;)J
.end method

.method public static final native CodeEngineResult_ObjectsEnd(JLcom/smartengines/code/CodeEngineResult;)J
.end method

.method public static final native CodeEngineResult_Reset(JLcom/smartengines/code/CodeEngineResult;)V
.end method

.method public static final native CodeEngineResult_SetCodeObject(JLcom/smartengines/code/CodeEngineResult;Ljava/lang/String;JLcom/smartengines/code/CodeObject;)V
.end method

.method public static final native CodeEngineResult_SetTerminal__SWIG_0(JLcom/smartengines/code/CodeEngineResult;Z)V
.end method

.method public static final native CodeEngineResult_SetTerminal__SWIG_1(JLcom/smartengines/code/CodeEngineResult;)V
.end method

.method public static final native CodeEngineSessionSettings_Clone(JLcom/smartengines/code/CodeEngineSessionSettings;)J
.end method

.method public static final native CodeEngineSessionSettings_GetOption(JLcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native CodeEngineSessionSettings_HasOption(JLcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;)Z
.end method

.method public static final native CodeEngineSessionSettings_SetOption(JLcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static final native CodeEngineSessionSettings_SettingsBegin(JLcom/smartengines/code/CodeEngineSessionSettings;)J
.end method

.method public static final native CodeEngineSessionSettings_SettingsEnd(JLcom/smartengines/code/CodeEngineSessionSettings;)J
.end method

.method public static final native CodeEngineSession_Activate(JLcom/smartengines/code/CodeEngineSession;Ljava/lang/String;)V
.end method

.method public static final native CodeEngineSession_GetActivationRequest(JLcom/smartengines/code/CodeEngineSession;)Ljava/lang/String;
.end method

.method public static final native CodeEngineSession_GetCurrentResult(JLcom/smartengines/code/CodeEngineSession;)J
.end method

.method public static final native CodeEngineSession_IsActivated(JLcom/smartengines/code/CodeEngineSession;)Z
.end method

.method public static final native CodeEngineSession_IsResultTerminal(JLcom/smartengines/code/CodeEngineSession;)Z
.end method

.method public static final native CodeEngineSession_Process__SWIG_0(JLcom/smartengines/code/CodeEngineSession;JLcom/smartengines/common/Image;)J
.end method

.method public static final native CodeEngineSession_Process__SWIG_1(JLcom/smartengines/code/CodeEngineSession;JLcom/smartengines/common/ByteString;)J
.end method

.method public static final native CodeEngineSession_Reset(JLcom/smartengines/code/CodeEngineSession;)V
.end method

.method public static final native CodeEngineVisualizationFeedback_FeedbackReceived(JLcom/smartengines/code/CodeEngineVisualizationFeedback;JLcom/smartengines/code/CodeEngineFeedbackContainer;)V
.end method

.method public static final native CodeEngineVisualizationFeedback_change_ownership(Lcom/smartengines/code/CodeEngineVisualizationFeedback;JZ)V
.end method

.method public static final native CodeEngineVisualizationFeedback_director_connect(Lcom/smartengines/code/CodeEngineVisualizationFeedback;JZZ)V
.end method

.method public static final native CodeEngineWorkflowFeedback_ResultReceived(JLcom/smartengines/code/CodeEngineWorkflowFeedback;JLcom/smartengines/code/CodeEngineResult;)V
.end method

.method public static final native CodeEngineWorkflowFeedback_SessionEnded(JLcom/smartengines/code/CodeEngineWorkflowFeedback;)V
.end method

.method public static final native CodeEngineWorkflowFeedback_change_ownership(Lcom/smartengines/code/CodeEngineWorkflowFeedback;JZ)V
.end method

.method public static final native CodeEngineWorkflowFeedback_director_connect(Lcom/smartengines/code/CodeEngineWorkflowFeedback;JZZ)V
.end method

.method public static final native CodeEngine_BankCard_get()I
.end method

.method public static final native CodeEngine_Barcode_get()I
.end method

.method public static final native CodeEngine_CodeTextLine_get()I
.end method

.method public static final native CodeEngine_CreateFromEmbeddedBundle__SWIG_0(Z)J
.end method

.method public static final native CodeEngine_CreateFromEmbeddedBundle__SWIG_1()J
.end method

.method public static final native CodeEngine_Create__SWIG_0(Ljava/lang/String;Z)J
.end method

.method public static final native CodeEngine_Create__SWIG_1(Ljava/lang/String;)J
.end method

.method public static final native CodeEngine_Create__SWIG_2([BZ)J
.end method

.method public static final native CodeEngine_Create__SWIG_3([B)J
.end method

.method public static final native CodeEngine_GetDefaultSessionSettings(JLcom/smartengines/code/CodeEngine;)J
.end method

.method public static final native CodeEngine_GetVersion()Ljava/lang/String;
.end method

.method public static final native CodeEngine_IsEngineAvailable(JLcom/smartengines/code/CodeEngine;I)Z
.end method

.method public static final native CodeEngine_LicensePlate_get()I
.end method

.method public static final native CodeEngine_MRZ_get()I
.end method

.method public static final native CodeEngine_PaymentDetails_get()I
.end method

.method public static final native CodeEngine_RFID_get()I
.end method

.method public static final native CodeEngine_ShippingContainer_get()I
.end method

.method public static final native CodeEngine_SpawnSession__SWIG_0(JLcom/smartengines/code/CodeEngine;JLcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;JLcom/smartengines/code/CodeEngineWorkflowFeedback;JLcom/smartengines/code/CodeEngineVisualizationFeedback;)J
.end method

.method public static final native CodeEngine_SpawnSession__SWIG_1(JLcom/smartengines/code/CodeEngine;JLcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;JLcom/smartengines/code/CodeEngineWorkflowFeedback;)J
.end method

.method public static final native CodeEngine_SpawnSession__SWIG_2(JLcom/smartengines/code/CodeEngine;JLcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native CodeField_GetBinaryRepresentation(JLcom/smartengines/code/CodeField;)J
.end method

.method public static final native CodeField_GetConfidence(JLcom/smartengines/code/CodeField;)D
.end method

.method public static final native CodeField_GetOcrString(JLcom/smartengines/code/CodeField;)J
.end method

.method public static final native CodeField_HasBinaryRepresentation(JLcom/smartengines/code/CodeField;)Z
.end method

.method public static final native CodeField_HasOcrStringRepresentation(JLcom/smartengines/code/CodeField;)Z
.end method

.method public static final native CodeField_IsAccepted(JLcom/smartengines/code/CodeField;)Z
.end method

.method public static final native CodeField_IsTerminal(JLcom/smartengines/code/CodeField;)Z
.end method

.method public static final native CodeField_Name(JLcom/smartengines/code/CodeField;)Ljava/lang/String;
.end method

.method public static final native CodeField_SetBinaryRepresentation(JLcom/smartengines/code/CodeField;JLcom/smartengines/common/ByteString;)V
.end method

.method public static final native CodeField_SetConfidence(JLcom/smartengines/code/CodeField;F)V
.end method

.method public static final native CodeField_SetIsAccepted(JLcom/smartengines/code/CodeField;Z)V
.end method

.method public static final native CodeField_SetIsTerminal(JLcom/smartengines/code/CodeField;Z)V
.end method

.method public static final native CodeField_SetName(JLcom/smartengines/code/CodeField;Ljava/lang/String;)V
.end method

.method public static final native CodeField_SetOcrStringRepresentation(JLcom/smartengines/code/CodeField;JLcom/smartengines/common/OcrString;)V
.end method

.method public static final native CodeFieldsMapIterator_Advance(JLcom/smartengines/code/CodeFieldsMapIterator;)V
.end method

.method public static final native CodeFieldsMapIterator_Equals(JLcom/smartengines/code/CodeFieldsMapIterator;JLcom/smartengines/code/CodeFieldsMapIterator;)Z
.end method

.method public static final native CodeFieldsMapIterator_GetKey(JLcom/smartengines/code/CodeFieldsMapIterator;)Ljava/lang/String;
.end method

.method public static final native CodeFieldsMapIterator_GetValue(JLcom/smartengines/code/CodeFieldsMapIterator;)J
.end method

.method public static final native CodeObject_AttributesBegin(JLcom/smartengines/code/CodeObject;)J
.end method

.method public static final native CodeObject_AttributesEnd(JLcom/smartengines/code/CodeObject;)J
.end method

.method public static final native CodeObject_BankCard_get()I
.end method

.method public static final native CodeObject_CodeTextLine_get()I
.end method

.method public static final native CodeObject_ComponentsBegin(JLcom/smartengines/code/CodeObject;)J
.end method

.method public static final native CodeObject_ComponentsEnd(JLcom/smartengines/code/CodeObject;)J
.end method

.method public static final native CodeObject_Container_get()I
.end method

.method public static final native CodeObject_Face_get()I
.end method

.method public static final native CodeObject_FieldsBegin(JLcom/smartengines/code/CodeObject;)J
.end method

.method public static final native CodeObject_FieldsEnd(JLcom/smartengines/code/CodeObject;)J
.end method

.method public static final native CodeObject_GetAttribute(JLcom/smartengines/code/CodeObject;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native CodeObject_GetAttributesCount(JLcom/smartengines/code/CodeObject;)I
.end method

.method public static final native CodeObject_GetComponent(JLcom/smartengines/code/CodeObject;Ljava/lang/String;)J
.end method

.method public static final native CodeObject_GetComponentsCount(JLcom/smartengines/code/CodeObject;)I
.end method

.method public static final native CodeObject_GetConfidence(JLcom/smartengines/code/CodeObject;)F
.end method

.method public static final native CodeObject_GetField(JLcom/smartengines/code/CodeObject;Ljava/lang/String;)J
.end method

.method public static final native CodeObject_GetFieldsCount(JLcom/smartengines/code/CodeObject;)I
.end method

.method public static final native CodeObject_GetFirstDetectedFrame(JLcom/smartengines/code/CodeObject;)I
.end method

.method public static final native CodeObject_GetID(JLcom/smartengines/code/CodeObject;)I
.end method

.method public static final native CodeObject_GetImage(JLcom/smartengines/code/CodeObject;)J
.end method

.method public static final native CodeObject_GetIsTerminal(JLcom/smartengines/code/CodeObject;)Z
.end method

.method public static final native CodeObject_GetLastUpdatedFrame(JLcom/smartengines/code/CodeObject;)I
.end method

.method public static final native CodeObject_GetName(JLcom/smartengines/code/CodeObject;)Ljava/lang/String;
.end method

.method public static final native CodeObject_GetQuadrangle(JLcom/smartengines/code/CodeObject;)J
.end method

.method public static final native CodeObject_GetType(JLcom/smartengines/code/CodeObject;)I
.end method

.method public static final native CodeObject_GetTypeStr(JLcom/smartengines/code/CodeObject;)Ljava/lang/String;
.end method

.method public static final native CodeObject_HasAttribute(JLcom/smartengines/code/CodeObject;Ljava/lang/String;)Z
.end method

.method public static final native CodeObject_HasComponent(JLcom/smartengines/code/CodeObject;Ljava/lang/String;)Z
.end method

.method public static final native CodeObject_HasField(JLcom/smartengines/code/CodeObject;Ljava/lang/String;)Z
.end method

.method public static final native CodeObject_HasImage(JLcom/smartengines/code/CodeObject;)Z
.end method

.method public static final native CodeObject_HasQuadrangle(JLcom/smartengines/code/CodeObject;)Z
.end method

.method public static final native CodeObject_IsAccepted(JLcom/smartengines/code/CodeObject;)Z
.end method

.method public static final native CodeObject_IsValidated(JLcom/smartengines/code/CodeObject;)Z
.end method

.method public static final native CodeObject_LinearBarcode_get()I
.end method

.method public static final native CodeObject_MRZ_get()I
.end method

.method public static final native CodeObject_MatrixBarcode_get()I
.end method

.method public static final native CodeObject_PaymentDetails_get()I
.end method

.method public static final native CodeObject_RFID_get()I
.end method

.method public static final native CodeObject_RemoveField(JLcom/smartengines/code/CodeObject;Ljava/lang/String;)V
.end method

.method public static final native CodeObject_RemoveImage(JLcom/smartengines/code/CodeObject;)V
.end method

.method public static final native CodeObject_SetAttribute(JLcom/smartengines/code/CodeObject;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static final native CodeObject_SetComponent(JLcom/smartengines/code/CodeObject;Ljava/lang/String;JLcom/smartengines/common/Quadrangle;)V
.end method

.method public static final native CodeObject_SetField(JLcom/smartengines/code/CodeObject;Ljava/lang/String;JLcom/smartengines/code/CodeField;)V
.end method

.method public static final native CodeObject_SetFirstDetectedFrame(JLcom/smartengines/code/CodeObject;I)V
.end method

.method public static final native CodeObject_SetImage(JLcom/smartengines/code/CodeObject;JLcom/smartengines/common/Image;)V
.end method

.method public static final native CodeObject_SetIsTerminal(JLcom/smartengines/code/CodeObject;Z)V
.end method

.method public static final native CodeObject_SetLastUpdatedFrame(JLcom/smartengines/code/CodeObject;I)V
.end method

.method public static final native CodeObject_SetQuadrangle(JLcom/smartengines/code/CodeObject;JLcom/smartengines/common/Quadrangle;)V
.end method

.method public static final native CodeObjectsMapIterator_Advance(JLcom/smartengines/code/CodeObjectsMapIterator;)V
.end method

.method public static final native CodeObjectsMapIterator_Equals(JLcom/smartengines/code/CodeObjectsMapIterator;JLcom/smartengines/code/CodeObjectsMapIterator;)Z
.end method

.method public static final native CodeObjectsMapIterator_GetKey(JLcom/smartengines/code/CodeObjectsMapIterator;)Ljava/lang/String;
.end method

.method public static final native CodeObjectsMapIterator_GetValue(JLcom/smartengines/code/CodeObjectsMapIterator;)J
.end method

.method public static final native EngineSettingsGroup_Barcode_get()I
.end method

.method public static final native EngineSettingsGroup_Card_get()I
.end method

.method public static final native EngineSettingsGroup_CodeTextLine_get()I
.end method

.method public static final native EngineSettingsGroup_Global_get()I
.end method

.method public static final native EngineSettingsGroup_LicensePlate_get()I
.end method

.method public static final native EngineSettingsGroup_Mrz_get()I
.end method

.method public static final native EngineSettingsGroup_PaymentDetails_get()I
.end method

.method public static final native EngineSettingsGroup_RFID_get()I
.end method

.method public static final native EngineSettingsGroup_ShippingContainer_get()I
.end method

.method public static SwigDirector_CodeEngineVisualizationFeedback_FeedbackReceived(Lcom/smartengines/code/CodeEngineVisualizationFeedback;J)V
    .locals 2

    .line 202
    new-instance v0, Lcom/smartengines/code/CodeEngineFeedbackContainer;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/code/CodeEngineFeedbackContainer;-><init>(JZ)V

    invoke-virtual {p0, v0}, Lcom/smartengines/code/CodeEngineVisualizationFeedback;->FeedbackReceived(Lcom/smartengines/code/CodeEngineFeedbackContainer;)V

    return-void
.end method

.method public static SwigDirector_CodeEngineWorkflowFeedback_ResultReceived(Lcom/smartengines/code/CodeEngineWorkflowFeedback;J)V
    .locals 2

    .line 205
    new-instance v0, Lcom/smartengines/code/CodeEngineResult;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/code/CodeEngineResult;-><init>(JZ)V

    invoke-virtual {p0, v0}, Lcom/smartengines/code/CodeEngineWorkflowFeedback;->ResultReceived(Lcom/smartengines/code/CodeEngineResult;)V

    return-void
.end method

.method public static SwigDirector_CodeEngineWorkflowFeedback_SessionEnded(Lcom/smartengines/code/CodeEngineWorkflowFeedback;)V
    .locals 0

    .line 208
    invoke-virtual {p0}, Lcom/smartengines/code/CodeEngineWorkflowFeedback;->SessionEnded()V

    return-void
.end method

.method public static final native delete_CodeEngine(J)V
.end method

.method public static final native delete_CodeEngineFeedbackContainer(J)V
.end method

.method public static final native delete_CodeEngineResult(J)V
.end method

.method public static final native delete_CodeEngineSession(J)V
.end method

.method public static final native delete_CodeEngineSessionSettings(J)V
.end method

.method public static final native delete_CodeEngineVisualizationFeedback(J)V
.end method

.method public static final native delete_CodeEngineWorkflowFeedback(J)V
.end method

.method public static final native delete_CodeField(J)V
.end method

.method public static final native delete_CodeFieldsMapIterator(J)V
.end method

.method public static final native delete_CodeObject(J)V
.end method

.method public static final native delete_CodeObjectsMapIterator(J)V
.end method

.method public static final native engineSettingsGroupFromString(Ljava/lang/String;)I
.end method

.method public static final native new_CodeEngineFeedbackContainer__SWIG_0()J
.end method

.method public static final native new_CodeEngineFeedbackContainer__SWIG_1(JLcom/smartengines/code/CodeEngineFeedbackContainer;)J
.end method

.method public static final native new_CodeEngineResult__SWIG_0(Z)J
.end method

.method public static final native new_CodeEngineResult__SWIG_1()J
.end method

.method public static final native new_CodeEngineResult__SWIG_2(JLcom/smartengines/code/CodeEngineResult;)J
.end method

.method public static final native new_CodeEngineVisualizationFeedback()J
.end method

.method public static final native new_CodeEngineWorkflowFeedback()J
.end method

.method public static final native new_CodeField__SWIG_0()J
.end method

.method public static final native new_CodeField__SWIG_1(Ljava/lang/String;JLcom/smartengines/common/ByteString;ZF)J
.end method

.method public static final native new_CodeField__SWIG_2(Ljava/lang/String;JLcom/smartengines/common/ByteString;Z)J
.end method

.method public static final native new_CodeField__SWIG_3(Ljava/lang/String;JLcom/smartengines/common/ByteString;)J
.end method

.method public static final native new_CodeField__SWIG_4(Ljava/lang/String;JLcom/smartengines/common/OcrString;ZF)J
.end method

.method public static final native new_CodeField__SWIG_5(Ljava/lang/String;JLcom/smartengines/common/OcrString;Z)J
.end method

.method public static final native new_CodeField__SWIG_6(Ljava/lang/String;JLcom/smartengines/common/OcrString;)J
.end method

.method public static final native new_CodeField__SWIG_7(JLcom/smartengines/code/CodeField;)J
.end method

.method public static final native new_CodeFieldsMapIterator(JLcom/smartengines/code/CodeFieldsMapIterator;)J
.end method

.method public static final native new_CodeObject__SWIG_0()J
.end method

.method public static final native new_CodeObject__SWIG_1(Ljava/lang/String;IZF)J
.end method

.method public static final native new_CodeObject__SWIG_2(Ljava/lang/String;IZ)J
.end method

.method public static final native new_CodeObject__SWIG_3(Ljava/lang/String;I)J
.end method

.method public static final native new_CodeObject__SWIG_4(JLcom/smartengines/code/CodeObject;)J
.end method

.method public static final native new_CodeObjectsMapIterator(JLcom/smartengines/code/CodeObjectsMapIterator;)J
.end method

.method public static final native presetToString(I)Ljava/lang/String;
.end method

.method private static final native swig_module_init()V
.end method

.method public static final native toString(I)Ljava/lang/String;
.end method
