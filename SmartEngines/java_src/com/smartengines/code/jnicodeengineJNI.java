package com.smartengines.code;

import com.smartengines.common.ByteString;
import com.smartengines.common.Image;
import com.smartengines.common.OcrString;
import com.smartengines.common.Quadrangle;

/* loaded from: classes3.dex */
public class jnicodeengineJNI {
    public static final native int BarcodePreset_AAMVA_get();

    public static final native int BarcodePreset_EMAIL_get();

    public static final native int BarcodePreset_GEO_get();

    public static final native int BarcodePreset_GS1_get();

    public static final native int BarcodePreset_ICALENDAR_get();

    public static final native int BarcodePreset_ISBN_get();

    public static final native int BarcodePreset_NONE_get();

    public static final native int BarcodePreset_PAYMENT_get();

    public static final native int BarcodePreset_PHONE_get();

    public static final native int BarcodePreset_SMS_get();

    public static final native int BarcodePreset_URL_get();

    public static final native int BarcodePreset_VCARD_get();

    public static final native int BarcodePreset_WIFI_get();

    public static final native long CodeEngineFeedbackContainer_GetQuadrangle(long j, CodeEngineFeedbackContainer codeEngineFeedbackContainer, String str);

    public static final native int CodeEngineFeedbackContainer_GetQuadranglesCount(long j, CodeEngineFeedbackContainer codeEngineFeedbackContainer);

    public static final native boolean CodeEngineFeedbackContainer_HasQuadrangle(long j, CodeEngineFeedbackContainer codeEngineFeedbackContainer, String str);

    public static final native long CodeEngineFeedbackContainer_QuadranglesBegin(long j, CodeEngineFeedbackContainer codeEngineFeedbackContainer);

    public static final native long CodeEngineFeedbackContainer_QuadranglesEnd(long j, CodeEngineFeedbackContainer codeEngineFeedbackContainer);

    public static final native void CodeEngineFeedbackContainer_RemoveQuadrangle(long j, CodeEngineFeedbackContainer codeEngineFeedbackContainer, String str);

    public static final native void CodeEngineFeedbackContainer_SetQuadrangle(long j, CodeEngineFeedbackContainer codeEngineFeedbackContainer, String str, long j2, Quadrangle quadrangle);

    public static final native long CodeEngineResult_GetCodeObject(long j, CodeEngineResult codeEngineResult, String str);

    public static final native int CodeEngineResult_GetObjectCount(long j, CodeEngineResult codeEngineResult);

    public static final native boolean CodeEngineResult_HasObject(long j, CodeEngineResult codeEngineResult, String str);

    public static final native boolean CodeEngineResult_IsTerminal(long j, CodeEngineResult codeEngineResult);

    public static final native long CodeEngineResult_ObjectsBegin(long j, CodeEngineResult codeEngineResult);

    public static final native long CodeEngineResult_ObjectsEnd(long j, CodeEngineResult codeEngineResult);

    public static final native void CodeEngineResult_Reset(long j, CodeEngineResult codeEngineResult);

    public static final native void CodeEngineResult_SetCodeObject(long j, CodeEngineResult codeEngineResult, String str, long j2, CodeObject codeObject);

    public static final native void CodeEngineResult_SetTerminal__SWIG_0(long j, CodeEngineResult codeEngineResult, boolean z);

    public static final native void CodeEngineResult_SetTerminal__SWIG_1(long j, CodeEngineResult codeEngineResult);

    public static final native long CodeEngineSessionSettings_Clone(long j, CodeEngineSessionSettings codeEngineSessionSettings);

    public static final native String CodeEngineSessionSettings_GetOption(long j, CodeEngineSessionSettings codeEngineSessionSettings, String str);

    public static final native boolean CodeEngineSessionSettings_HasOption(long j, CodeEngineSessionSettings codeEngineSessionSettings, String str);

    public static final native void CodeEngineSessionSettings_SetOption(long j, CodeEngineSessionSettings codeEngineSessionSettings, String str, String str2);

    public static final native long CodeEngineSessionSettings_SettingsBegin(long j, CodeEngineSessionSettings codeEngineSessionSettings);

    public static final native long CodeEngineSessionSettings_SettingsEnd(long j, CodeEngineSessionSettings codeEngineSessionSettings);

    public static final native void CodeEngineSession_Activate(long j, CodeEngineSession codeEngineSession, String str);

    public static final native String CodeEngineSession_GetActivationRequest(long j, CodeEngineSession codeEngineSession);

    public static final native long CodeEngineSession_GetCurrentResult(long j, CodeEngineSession codeEngineSession);

    public static final native boolean CodeEngineSession_IsActivated(long j, CodeEngineSession codeEngineSession);

    public static final native boolean CodeEngineSession_IsResultTerminal(long j, CodeEngineSession codeEngineSession);

    public static final native long CodeEngineSession_Process__SWIG_0(long j, CodeEngineSession codeEngineSession, long j2, Image image);

    public static final native long CodeEngineSession_Process__SWIG_1(long j, CodeEngineSession codeEngineSession, long j2, ByteString byteString);

    public static final native void CodeEngineSession_Reset(long j, CodeEngineSession codeEngineSession);

    public static final native void CodeEngineVisualizationFeedback_FeedbackReceived(long j, CodeEngineVisualizationFeedback codeEngineVisualizationFeedback, long j2, CodeEngineFeedbackContainer codeEngineFeedbackContainer);

    public static final native void CodeEngineVisualizationFeedback_change_ownership(CodeEngineVisualizationFeedback codeEngineVisualizationFeedback, long j, boolean z);

    public static final native void CodeEngineVisualizationFeedback_director_connect(CodeEngineVisualizationFeedback codeEngineVisualizationFeedback, long j, boolean z, boolean z2);

    public static final native void CodeEngineWorkflowFeedback_ResultReceived(long j, CodeEngineWorkflowFeedback codeEngineWorkflowFeedback, long j2, CodeEngineResult codeEngineResult);

    public static final native void CodeEngineWorkflowFeedback_SessionEnded(long j, CodeEngineWorkflowFeedback codeEngineWorkflowFeedback);

    public static final native void CodeEngineWorkflowFeedback_change_ownership(CodeEngineWorkflowFeedback codeEngineWorkflowFeedback, long j, boolean z);

    public static final native void CodeEngineWorkflowFeedback_director_connect(CodeEngineWorkflowFeedback codeEngineWorkflowFeedback, long j, boolean z, boolean z2);

    public static final native int CodeEngine_BankCard_get();

    public static final native int CodeEngine_Barcode_get();

    public static final native int CodeEngine_CodeTextLine_get();

    public static final native long CodeEngine_CreateFromEmbeddedBundle__SWIG_0(boolean z);

    public static final native long CodeEngine_CreateFromEmbeddedBundle__SWIG_1();

    public static final native long CodeEngine_Create__SWIG_0(String str, boolean z);

    public static final native long CodeEngine_Create__SWIG_1(String str);

    public static final native long CodeEngine_Create__SWIG_2(byte[] bArr, boolean z);

    public static final native long CodeEngine_Create__SWIG_3(byte[] bArr);

    public static final native long CodeEngine_GetDefaultSessionSettings(long j, CodeEngine codeEngine);

    public static final native String CodeEngine_GetVersion();

    public static final native boolean CodeEngine_IsEngineAvailable(long j, CodeEngine codeEngine, int i);

    public static final native int CodeEngine_LicensePlate_get();

    public static final native int CodeEngine_MRZ_get();

    public static final native int CodeEngine_PaymentDetails_get();

    public static final native int CodeEngine_RFID_get();

    public static final native int CodeEngine_ShippingContainer_get();

    public static final native long CodeEngine_SpawnSession__SWIG_0(long j, CodeEngine codeEngine, long j2, CodeEngineSessionSettings codeEngineSessionSettings, String str, long j3, CodeEngineWorkflowFeedback codeEngineWorkflowFeedback, long j4, CodeEngineVisualizationFeedback codeEngineVisualizationFeedback);

    public static final native long CodeEngine_SpawnSession__SWIG_1(long j, CodeEngine codeEngine, long j2, CodeEngineSessionSettings codeEngineSessionSettings, String str, long j3, CodeEngineWorkflowFeedback codeEngineWorkflowFeedback);

    public static final native long CodeEngine_SpawnSession__SWIG_2(long j, CodeEngine codeEngine, long j2, CodeEngineSessionSettings codeEngineSessionSettings, String str);

    public static final native long CodeField_GetBinaryRepresentation(long j, CodeField codeField);

    public static final native double CodeField_GetConfidence(long j, CodeField codeField);

    public static final native long CodeField_GetOcrString(long j, CodeField codeField);

    public static final native boolean CodeField_HasBinaryRepresentation(long j, CodeField codeField);

    public static final native boolean CodeField_HasOcrStringRepresentation(long j, CodeField codeField);

    public static final native boolean CodeField_IsAccepted(long j, CodeField codeField);

    public static final native boolean CodeField_IsTerminal(long j, CodeField codeField);

    public static final native String CodeField_Name(long j, CodeField codeField);

    public static final native void CodeField_SetBinaryRepresentation(long j, CodeField codeField, long j2, ByteString byteString);

    public static final native void CodeField_SetConfidence(long j, CodeField codeField, float f);

    public static final native void CodeField_SetIsAccepted(long j, CodeField codeField, boolean z);

    public static final native void CodeField_SetIsTerminal(long j, CodeField codeField, boolean z);

    public static final native void CodeField_SetName(long j, CodeField codeField, String str);

    public static final native void CodeField_SetOcrStringRepresentation(long j, CodeField codeField, long j2, OcrString ocrString);

    public static final native void CodeFieldsMapIterator_Advance(long j, CodeFieldsMapIterator codeFieldsMapIterator);

    public static final native boolean CodeFieldsMapIterator_Equals(long j, CodeFieldsMapIterator codeFieldsMapIterator, long j2, CodeFieldsMapIterator codeFieldsMapIterator2);

    public static final native String CodeFieldsMapIterator_GetKey(long j, CodeFieldsMapIterator codeFieldsMapIterator);

    public static final native long CodeFieldsMapIterator_GetValue(long j, CodeFieldsMapIterator codeFieldsMapIterator);

    public static final native long CodeObject_AttributesBegin(long j, CodeObject codeObject);

    public static final native long CodeObject_AttributesEnd(long j, CodeObject codeObject);

    public static final native int CodeObject_BankCard_get();

    public static final native int CodeObject_CodeTextLine_get();

    public static final native long CodeObject_ComponentsBegin(long j, CodeObject codeObject);

    public static final native long CodeObject_ComponentsEnd(long j, CodeObject codeObject);

    public static final native int CodeObject_Container_get();

    public static final native int CodeObject_Face_get();

    public static final native long CodeObject_FieldsBegin(long j, CodeObject codeObject);

    public static final native long CodeObject_FieldsEnd(long j, CodeObject codeObject);

    public static final native String CodeObject_GetAttribute(long j, CodeObject codeObject, String str);

    public static final native int CodeObject_GetAttributesCount(long j, CodeObject codeObject);

    public static final native long CodeObject_GetComponent(long j, CodeObject codeObject, String str);

    public static final native int CodeObject_GetComponentsCount(long j, CodeObject codeObject);

    public static final native float CodeObject_GetConfidence(long j, CodeObject codeObject);

    public static final native long CodeObject_GetField(long j, CodeObject codeObject, String str);

    public static final native int CodeObject_GetFieldsCount(long j, CodeObject codeObject);

    public static final native int CodeObject_GetFirstDetectedFrame(long j, CodeObject codeObject);

    public static final native int CodeObject_GetID(long j, CodeObject codeObject);

    public static final native long CodeObject_GetImage(long j, CodeObject codeObject);

    public static final native boolean CodeObject_GetIsTerminal(long j, CodeObject codeObject);

    public static final native int CodeObject_GetLastUpdatedFrame(long j, CodeObject codeObject);

    public static final native String CodeObject_GetName(long j, CodeObject codeObject);

    public static final native long CodeObject_GetQuadrangle(long j, CodeObject codeObject);

    public static final native int CodeObject_GetType(long j, CodeObject codeObject);

    public static final native String CodeObject_GetTypeStr(long j, CodeObject codeObject);

    public static final native boolean CodeObject_HasAttribute(long j, CodeObject codeObject, String str);

    public static final native boolean CodeObject_HasComponent(long j, CodeObject codeObject, String str);

    public static final native boolean CodeObject_HasField(long j, CodeObject codeObject, String str);

    public static final native boolean CodeObject_HasImage(long j, CodeObject codeObject);

    public static final native boolean CodeObject_HasQuadrangle(long j, CodeObject codeObject);

    public static final native boolean CodeObject_IsAccepted(long j, CodeObject codeObject);

    public static final native boolean CodeObject_IsValidated(long j, CodeObject codeObject);

    public static final native int CodeObject_LinearBarcode_get();

    public static final native int CodeObject_MRZ_get();

    public static final native int CodeObject_MatrixBarcode_get();

    public static final native int CodeObject_PaymentDetails_get();

    public static final native int CodeObject_RFID_get();

    public static final native void CodeObject_RemoveField(long j, CodeObject codeObject, String str);

    public static final native void CodeObject_RemoveImage(long j, CodeObject codeObject);

    public static final native void CodeObject_SetAttribute(long j, CodeObject codeObject, String str, String str2);

    public static final native void CodeObject_SetComponent(long j, CodeObject codeObject, String str, long j2, Quadrangle quadrangle);

    public static final native void CodeObject_SetField(long j, CodeObject codeObject, String str, long j2, CodeField codeField);

    public static final native void CodeObject_SetFirstDetectedFrame(long j, CodeObject codeObject, int i);

    public static final native void CodeObject_SetImage(long j, CodeObject codeObject, long j2, Image image);

    public static final native void CodeObject_SetIsTerminal(long j, CodeObject codeObject, boolean z);

    public static final native void CodeObject_SetLastUpdatedFrame(long j, CodeObject codeObject, int i);

    public static final native void CodeObject_SetQuadrangle(long j, CodeObject codeObject, long j2, Quadrangle quadrangle);

    public static final native void CodeObjectsMapIterator_Advance(long j, CodeObjectsMapIterator codeObjectsMapIterator);

    public static final native boolean CodeObjectsMapIterator_Equals(long j, CodeObjectsMapIterator codeObjectsMapIterator, long j2, CodeObjectsMapIterator codeObjectsMapIterator2);

    public static final native String CodeObjectsMapIterator_GetKey(long j, CodeObjectsMapIterator codeObjectsMapIterator);

    public static final native long CodeObjectsMapIterator_GetValue(long j, CodeObjectsMapIterator codeObjectsMapIterator);

    public static final native int EngineSettingsGroup_Barcode_get();

    public static final native int EngineSettingsGroup_Card_get();

    public static final native int EngineSettingsGroup_CodeTextLine_get();

    public static final native int EngineSettingsGroup_Global_get();

    public static final native int EngineSettingsGroup_LicensePlate_get();

    public static final native int EngineSettingsGroup_Mrz_get();

    public static final native int EngineSettingsGroup_PaymentDetails_get();

    public static final native int EngineSettingsGroup_RFID_get();

    public static final native int EngineSettingsGroup_ShippingContainer_get();

    public static final native void delete_CodeEngine(long j);

    public static final native void delete_CodeEngineFeedbackContainer(long j);

    public static final native void delete_CodeEngineResult(long j);

    public static final native void delete_CodeEngineSession(long j);

    public static final native void delete_CodeEngineSessionSettings(long j);

    public static final native void delete_CodeEngineVisualizationFeedback(long j);

    public static final native void delete_CodeEngineWorkflowFeedback(long j);

    public static final native void delete_CodeField(long j);

    public static final native void delete_CodeFieldsMapIterator(long j);

    public static final native void delete_CodeObject(long j);

    public static final native void delete_CodeObjectsMapIterator(long j);

    public static final native int engineSettingsGroupFromString(String str);

    public static final native long new_CodeEngineFeedbackContainer__SWIG_0();

    public static final native long new_CodeEngineFeedbackContainer__SWIG_1(long j, CodeEngineFeedbackContainer codeEngineFeedbackContainer);

    public static final native long new_CodeEngineResult__SWIG_0(boolean z);

    public static final native long new_CodeEngineResult__SWIG_1();

    public static final native long new_CodeEngineResult__SWIG_2(long j, CodeEngineResult codeEngineResult);

    public static final native long new_CodeEngineVisualizationFeedback();

    public static final native long new_CodeEngineWorkflowFeedback();

    public static final native long new_CodeField__SWIG_0();

    public static final native long new_CodeField__SWIG_1(String str, long j, ByteString byteString, boolean z, float f);

    public static final native long new_CodeField__SWIG_2(String str, long j, ByteString byteString, boolean z);

    public static final native long new_CodeField__SWIG_3(String str, long j, ByteString byteString);

    public static final native long new_CodeField__SWIG_4(String str, long j, OcrString ocrString, boolean z, float f);

    public static final native long new_CodeField__SWIG_5(String str, long j, OcrString ocrString, boolean z);

    public static final native long new_CodeField__SWIG_6(String str, long j, OcrString ocrString);

    public static final native long new_CodeField__SWIG_7(long j, CodeField codeField);

    public static final native long new_CodeFieldsMapIterator(long j, CodeFieldsMapIterator codeFieldsMapIterator);

    public static final native long new_CodeObject__SWIG_0();

    public static final native long new_CodeObject__SWIG_1(String str, int i, boolean z, float f);

    public static final native long new_CodeObject__SWIG_2(String str, int i, boolean z);

    public static final native long new_CodeObject__SWIG_3(String str, int i);

    public static final native long new_CodeObject__SWIG_4(long j, CodeObject codeObject);

    public static final native long new_CodeObjectsMapIterator(long j, CodeObjectsMapIterator codeObjectsMapIterator);

    public static final native String presetToString(int i);

    private static final native void swig_module_init();

    public static final native String toString(int i);

    public static void SwigDirector_CodeEngineVisualizationFeedback_FeedbackReceived(CodeEngineVisualizationFeedback codeEngineVisualizationFeedback, long j) {
        codeEngineVisualizationFeedback.FeedbackReceived(new CodeEngineFeedbackContainer(j, false));
    }

    public static void SwigDirector_CodeEngineWorkflowFeedback_ResultReceived(CodeEngineWorkflowFeedback codeEngineWorkflowFeedback, long j) {
        codeEngineWorkflowFeedback.ResultReceived(new CodeEngineResult(j, false));
    }

    public static void SwigDirector_CodeEngineWorkflowFeedback_SessionEnded(CodeEngineWorkflowFeedback codeEngineWorkflowFeedback) {
        codeEngineWorkflowFeedback.SessionEnded();
    }

    static {
        swig_module_init();
    }
}
