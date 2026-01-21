package com.smartengines.p006id;

import com.smartengines.common.ByteString;
import com.smartengines.common.Image;
import com.smartengines.common.OcrString;
import com.smartengines.common.Quadrangle;
import com.smartengines.common.Rectangle;
import com.smartengines.common.Size;

/* loaded from: classes3.dex */
public class jniidengineJNI {
    public static final native void IdAnimatedField_AppendFrame(long j, IdAnimatedField idAnimatedField, long j2, Image image);

    public static final native void IdAnimatedField_ClearFrames(long j, IdAnimatedField idAnimatedField);

    public static final native long IdAnimatedField_GetBaseFieldInfo(long j, IdAnimatedField idAnimatedField);

    public static final native long IdAnimatedField_GetFrame(long j, IdAnimatedField idAnimatedField, int i);

    public static final native int IdAnimatedField_GetFramesCount(long j, IdAnimatedField idAnimatedField);

    public static final native long IdAnimatedField_GetMutableBaseFieldInfo(long j, IdAnimatedField idAnimatedField);

    public static final native String IdAnimatedField_GetName(long j, IdAnimatedField idAnimatedField);

    public static final native void IdAnimatedField_SetName(long j, IdAnimatedField idAnimatedField, String str);

    public static final native void IdAnimatedFieldsMapIterator_Advance(long j, IdAnimatedFieldsMapIterator idAnimatedFieldsMapIterator);

    public static final native boolean IdAnimatedFieldsMapIterator_Equals(long j, IdAnimatedFieldsMapIterator idAnimatedFieldsMapIterator, long j2, IdAnimatedFieldsMapIterator idAnimatedFieldsMapIterator2);

    public static final native String IdAnimatedFieldsMapIterator_GetKey(long j, IdAnimatedFieldsMapIterator idAnimatedFieldsMapIterator);

    public static final native long IdAnimatedFieldsMapIterator_GetValue(long j, IdAnimatedFieldsMapIterator idAnimatedFieldsMapIterator);

    public static final native long IdBaseFieldInfo_AttributesBegin(long j, IdBaseFieldInfo idBaseFieldInfo);

    public static final native long IdBaseFieldInfo_AttributesEnd(long j, IdBaseFieldInfo idBaseFieldInfo);

    public static final native String IdBaseFieldInfo_GetAttribute(long j, IdBaseFieldInfo idBaseFieldInfo, String str);

    public static final native int IdBaseFieldInfo_GetAttributesCount(long j, IdBaseFieldInfo idBaseFieldInfo);

    public static final native double IdBaseFieldInfo_GetConfidence(long j, IdBaseFieldInfo idBaseFieldInfo);

    public static final native boolean IdBaseFieldInfo_GetIsAccepted(long j, IdBaseFieldInfo idBaseFieldInfo);

    public static final native boolean IdBaseFieldInfo_HasAttribute(long j, IdBaseFieldInfo idBaseFieldInfo, String str);

    public static final native void IdBaseFieldInfo_RemoveAttribute(long j, IdBaseFieldInfo idBaseFieldInfo, String str);

    public static final native void IdBaseFieldInfo_SetAttribute(long j, IdBaseFieldInfo idBaseFieldInfo, String str, String str2);

    public static final native void IdBaseFieldInfo_SetConfidence(long j, IdBaseFieldInfo idBaseFieldInfo, double d);

    public static final native void IdBaseFieldInfo_SetIsAccepted(long j, IdBaseFieldInfo idBaseFieldInfo, boolean z);

    public static final native long IdCheckField_GetBaseFieldInfo(long j, IdCheckField idCheckField);

    public static final native long IdCheckField_GetMutableBaseFieldInfo(long j, IdCheckField idCheckField);

    public static final native String IdCheckField_GetName(long j, IdCheckField idCheckField);

    public static final native int IdCheckField_GetValue(long j, IdCheckField idCheckField);

    public static final native void IdCheckField_SetName(long j, IdCheckField idCheckField, String str);

    public static final native void IdCheckField_SetValue(long j, IdCheckField idCheckField, int i);

    public static final native void IdCheckFieldsMapIterator_Advance(long j, IdCheckFieldsMapIterator idCheckFieldsMapIterator);

    public static final native boolean IdCheckFieldsMapIterator_Equals(long j, IdCheckFieldsMapIterator idCheckFieldsMapIterator, long j2, IdCheckFieldsMapIterator idCheckFieldsMapIterator2);

    public static final native String IdCheckFieldsMapIterator_GetKey(long j, IdCheckFieldsMapIterator idCheckFieldsMapIterator);

    public static final native long IdCheckFieldsMapIterator_GetValue(long j, IdCheckFieldsMapIterator idCheckFieldsMapIterator);

    public static final native String IdDocumentInfo_GetDocumentDescription(long j, IdDocumentInfo idDocumentInfo);

    public static final native float IdDocumentInfo_GetDocumentFieldsRejectionThreshold(long j, IdDocumentInfo idDocumentInfo, String str);

    public static final native String IdDocumentInfo_GetDocumentName(long j, IdDocumentInfo idDocumentInfo);

    public static final native long IdDocumentInfo_GetDocumentTemplates(long j, IdDocumentInfo idDocumentInfo);

    public static final native long IdDocumentInfo_GetPradoLinks(long j, IdDocumentInfo idDocumentInfo);

    public static final native int IdDocumentInfo_HasContactChip(long j, IdDocumentInfo idDocumentInfo);

    public static final native int IdDocumentInfo_HasRFID(long j, IdDocumentInfo idDocumentInfo);

    public static final native int IdDocumentInfo_SupportedRFID(long j, IdDocumentInfo idDocumentInfo);

    public static final native long IdEngine_CreateFaceSessionSettings(long j, IdEngine idEngine);

    public static final native long IdEngine_CreateFieldProcessingSessionSettings(long j, IdEngine idEngine);

    public static final native long IdEngine_CreateFileAnalysisSessionSettings(long j, IdEngine idEngine);

    public static final native long IdEngine_CreateFromEmbeddedBundle__SWIG_0(boolean z, int i, boolean z2);

    public static final native long IdEngine_CreateFromEmbeddedBundle__SWIG_1(boolean z, int i);

    public static final native long IdEngine_CreateFromEmbeddedBundle__SWIG_2(boolean z);

    public static final native long IdEngine_CreateFromEmbeddedBundle__SWIG_3();

    public static final native long IdEngine_CreateSessionSettings(long j, IdEngine idEngine);

    public static final native long IdEngine_CreateVideoAuthenticationSessionSettings(long j, IdEngine idEngine);

    public static final native long IdEngine_Create__SWIG_0(String str, boolean z, int i, boolean z2);

    public static final native long IdEngine_Create__SWIG_1(String str, boolean z, int i);

    public static final native long IdEngine_Create__SWIG_2(String str, boolean z);

    public static final native long IdEngine_Create__SWIG_3(String str);

    public static final native long IdEngine_Create__SWIG_4(byte[] bArr, boolean z, int i, boolean z2);

    public static final native long IdEngine_Create__SWIG_5(byte[] bArr, boolean z, int i);

    public static final native long IdEngine_Create__SWIG_6(byte[] bArr, boolean z);

    public static final native long IdEngine_Create__SWIG_7(byte[] bArr);

    public static final native String IdEngine_GetVersion();

    public static final native long IdEngine_ProcessOneShotLiveness(long j, IdEngine idEngine, long j2, Image image);

    public static final native long IdEngine_SpawnFaceSession__SWIG_0(long j, IdEngine idEngine, long j2, IdFaceSessionSettings idFaceSessionSettings, String str, long j3, IdFaceFeedback idFaceFeedback);

    public static final native long IdEngine_SpawnFaceSession__SWIG_1(long j, IdEngine idEngine, long j2, IdFaceSessionSettings idFaceSessionSettings, String str);

    public static final native long IdEngine_SpawnFieldProcessingSession(long j, IdEngine idEngine, long j2, IdFieldProcessingSessionSettings idFieldProcessingSessionSettings, String str);

    public static final native long IdEngine_SpawnFileAnalysisSession(long j, IdEngine idEngine, long j2, IdFileAnalysisSessionSettings idFileAnalysisSessionSettings, String str);

    public static final native long IdEngine_SpawnSession__SWIG_0(long j, IdEngine idEngine, long j2, IdSessionSettings idSessionSettings, String str, long j3, IdFeedback idFeedback);

    public static final native long IdEngine_SpawnSession__SWIG_1(long j, IdEngine idEngine, long j2, IdSessionSettings idSessionSettings, String str);

    public static final native long IdEngine_SpawnVideoAuthenticationSession__SWIG_0(long j, IdEngine idEngine, long j2, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str, long j3, IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks, long j4, IdFeedback idFeedback, long j5, IdFaceFeedback idFaceFeedback);

    public static final native long IdEngine_SpawnVideoAuthenticationSession__SWIG_1(long j, IdEngine idEngine, long j2, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str, long j3, IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks, long j4, IdFeedback idFeedback);

    public static final native long IdEngine_SpawnVideoAuthenticationSession__SWIG_2(long j, IdEngine idEngine, long j2, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str, long j3, IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks);

    public static final native long IdEngine_SpawnVideoAuthenticationSession__SWIG_3(long j, IdEngine idEngine, long j2, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str);

    public static final native void IdFaceFeedback_MessageReceived(long j, IdFaceFeedback idFaceFeedback, String str);

    public static final native void IdFaceFeedback_change_ownership(IdFaceFeedback idFaceFeedback, long j, boolean z);

    public static final native void IdFaceFeedback_director_connect(IdFaceFeedback idFaceFeedback, long j, boolean z, boolean z2);

    public static final native double IdFaceLivenessResult_GetLivenessEstimation(long j, IdFaceLivenessResult idFaceLivenessResult);

    public static final native String IdFaceLivenessResult_GetLivenessInstruction(long j, IdFaceLivenessResult idFaceLivenessResult);

    public static final native void IdFaceLivenessResult_SetLivenessEstimation(long j, IdFaceLivenessResult idFaceLivenessResult, double d);

    public static final native void IdFaceLivenessResult_SetLivenessInstruction(long j, IdFaceLivenessResult idFaceLivenessResult, String str);

    public static final native boolean IdFaceOslResult_GetOSLEstimation(long j, IdFaceOslResult idFaceOslResult);

    public static final native int IdFaceOslResult_GetOSLVerdict(long j, IdFaceOslResult idFaceOslResult);

    public static final native void IdFaceOslResult_SetOSLEstimation(long j, IdFaceOslResult idFaceOslResult, boolean z);

    public static final native void IdFaceOslResult_SetOSLVerdict(long j, IdFaceOslResult idFaceOslResult, int i);

    public static final native void IdFaceRectsResult_AddFaceRect(long j, IdFaceRectsResult idFaceRectsResult, long j2, Rectangle rectangle);

    public static final native void IdFaceRectsResult_Clear(long j, IdFaceRectsResult idFaceRectsResult);

    public static final native long IdFaceRectsResult_RectanglesBegin(long j, IdFaceRectsResult idFaceRectsResult);

    public static final native long IdFaceRectsResult_RectanglesEnd(long j, IdFaceRectsResult idFaceRectsResult);

    public static final native int IdFaceRectsResult_Size(long j, IdFaceRectsResult idFaceRectsResult);

    public static final native long IdFaceSessionSettings_Clone(long j, IdFaceSessionSettings idFaceSessionSettings);

    public static final native String IdFaceSessionSettings_GetLivenessInstructionDescription(long j, IdFaceSessionSettings idFaceSessionSettings, String str);

    public static final native String IdFaceSessionSettings_GetOption(long j, IdFaceSessionSettings idFaceSessionSettings, String str);

    public static final native int IdFaceSessionSettings_GetOptionsCount(long j, IdFaceSessionSettings idFaceSessionSettings);

    public static final native int IdFaceSessionSettings_GetSupportedLivenessInstructionsCount(long j, IdFaceSessionSettings idFaceSessionSettings);

    public static final native boolean IdFaceSessionSettings_HasOption(long j, IdFaceSessionSettings idFaceSessionSettings, String str);

    public static final native boolean IdFaceSessionSettings_HasSupportedLivenessInstruction(long j, IdFaceSessionSettings idFaceSessionSettings, String str);

    public static final native long IdFaceSessionSettings_OptionsBegin(long j, IdFaceSessionSettings idFaceSessionSettings);

    public static final native long IdFaceSessionSettings_OptionsEnd(long j, IdFaceSessionSettings idFaceSessionSettings);

    public static final native void IdFaceSessionSettings_RemoveOption(long j, IdFaceSessionSettings idFaceSessionSettings, String str);

    public static final native void IdFaceSessionSettings_SetOption(long j, IdFaceSessionSettings idFaceSessionSettings, String str, String str2);

    public static final native long IdFaceSessionSettings_SupportedLivenessInstructionsBegin(long j, IdFaceSessionSettings idFaceSessionSettings);

    public static final native long IdFaceSessionSettings_SupportedLivenessInstructionsEnd(long j, IdFaceSessionSettings idFaceSessionSettings);

    public static final native void IdFaceSession_Activate(long j, IdFaceSession idFaceSession, String str);

    public static final native void IdFaceSession_AddFaceImage(long j, IdFaceSession idFaceSession, long j2, Image image);

    public static final native String IdFaceSession_GetActivationRequest(long j, IdFaceSession idFaceSession);

    public static final native long IdFaceSession_GetAllowedNumberOfFailedINstructions(long j, IdFaceSession idFaceSession);

    public static final native long IdFaceSession_GetInitializerInstructionTime(long j, IdFaceSession idFaceSession);

    public static final native long IdFaceSession_GetInstructionsCount(long j, IdFaceSession idFaceSession);

    public static final native long IdFaceSession_GetLivenessResult(long j, IdFaceSession idFaceSession);

    public static final native long IdFaceSession_GetPassAllInstruction(long j, IdFaceSession idFaceSession);

    public static final native long IdFaceSession_GetPushedImagesCount(long j, IdFaceSession idFaceSession);

    public static final native long IdFaceSession_GetRects(long j, IdFaceSession idFaceSession, long j2, Image image);

    public static final native long IdFaceSession_GetSimilarity(long j, IdFaceSession idFaceSession, long j2, Image image, long j3, Image image2);

    public static final native long IdFaceSession_GetSimilarityWith(long j, IdFaceSession idFaceSession, long j2, Image image);

    public static final native boolean IdFaceSession_HasAccumulatedImage(long j, IdFaceSession idFaceSession);

    public static final native boolean IdFaceSession_IsActivated(long j, IdFaceSession idFaceSession);

    public static final native void IdFaceSession_Reset(long j, IdFaceSession idFaceSession);

    public static final native void IdFaceSession_SetFaceToMatchWith(long j, IdFaceSession idFaceSession, long j2, Image image);

    public static final native int IdFaceSimilarityResult_GetSimilarity(long j, IdFaceSimilarityResult idFaceSimilarityResult);

    public static final native double IdFaceSimilarityResult_GetSimilarityEstimation(long j, IdFaceSimilarityResult idFaceSimilarityResult);

    public static final native int IdFaceSimilarityResult_GetStatus(long j, IdFaceSimilarityResult idFaceSimilarityResult);

    public static final native void IdFaceSimilarityResult_SetSimilarityEstimation(long j, IdFaceSimilarityResult idFaceSimilarityResult, double d);

    public static final native void IdFaceSimilarityResult_SetStatus(long j, IdFaceSimilarityResult idFaceSimilarityResult, int i);

    public static final native long IdFeedbackContainer_GetQuadrangle(long j, IdFeedbackContainer idFeedbackContainer, String str);

    public static final native int IdFeedbackContainer_GetQuadranglesCount(long j, IdFeedbackContainer idFeedbackContainer);

    public static final native boolean IdFeedbackContainer_HasQuadrangle(long j, IdFeedbackContainer idFeedbackContainer, String str);

    public static final native long IdFeedbackContainer_QuadranglesBegin(long j, IdFeedbackContainer idFeedbackContainer);

    public static final native long IdFeedbackContainer_QuadranglesEnd(long j, IdFeedbackContainer idFeedbackContainer);

    public static final native void IdFeedbackContainer_RemoveQuadrangle(long j, IdFeedbackContainer idFeedbackContainer, String str);

    public static final native void IdFeedbackContainer_SetQuadrangle(long j, IdFeedbackContainer idFeedbackContainer, String str, long j2, Quadrangle quadrangle);

    public static final native void IdFeedback_FeedbackReceived(long j, IdFeedback idFeedback, long j2, IdFeedbackContainer idFeedbackContainer);

    public static final native void IdFeedback_ResultReceived(long j, IdFeedback idFeedback, long j2, IdResult idResult);

    public static final native void IdFeedback_SessionEnded(long j, IdFeedback idFeedback);

    public static final native void IdFeedback_TemplateDetectionResultReceived(long j, IdFeedback idFeedback, long j2, IdTemplateDetectionResult idTemplateDetectionResult);

    public static final native void IdFeedback_TemplateSegmentationResultReceived(long j, IdFeedback idFeedback, long j2, IdTemplateSegmentationResult idTemplateSegmentationResult);

    public static final native void IdFeedback_change_ownership(IdFeedback idFeedback, long j, boolean z);

    public static final native void IdFeedback_director_connect(IdFeedback idFeedback, long j, boolean z, boolean z2);

    public static final native long IdFieldProcessingSessionSettings_Clone(long j, IdFieldProcessingSessionSettings idFieldProcessingSessionSettings);

    public static final native String IdFieldProcessingSessionSettings_GetCurrentFieldProcessor(long j, IdFieldProcessingSessionSettings idFieldProcessingSessionSettings);

    public static final native String IdFieldProcessingSessionSettings_GetOption(long j, IdFieldProcessingSessionSettings idFieldProcessingSessionSettings, String str);

    public static final native int IdFieldProcessingSessionSettings_GetOptionsCount(long j, IdFieldProcessingSessionSettings idFieldProcessingSessionSettings);

    /* renamed from: IdFieldProcessingSessionSettings_GetSupportedFieldProcessorsCount */
    public static final native int m497x5aa97904(long j, IdFieldProcessingSessionSettings idFieldProcessingSessionSettings);

    public static final native boolean IdFieldProcessingSessionSettings_HasOption(long j, IdFieldProcessingSessionSettings idFieldProcessingSessionSettings, String str);

    public static final native boolean IdFieldProcessingSessionSettings_HasSupportedFieldProcessor(long j, IdFieldProcessingSessionSettings idFieldProcessingSessionSettings, String str);

    public static final native long IdFieldProcessingSessionSettings_OptionsBegin(long j, IdFieldProcessingSessionSettings idFieldProcessingSessionSettings);

    public static final native long IdFieldProcessingSessionSettings_OptionsEnd(long j, IdFieldProcessingSessionSettings idFieldProcessingSessionSettings);

    public static final native void IdFieldProcessingSessionSettings_RemoveOption(long j, IdFieldProcessingSessionSettings idFieldProcessingSessionSettings, String str);

    public static final native void IdFieldProcessingSessionSettings_SetCurrentFieldProcessor(long j, IdFieldProcessingSessionSettings idFieldProcessingSessionSettings, String str);

    public static final native void IdFieldProcessingSessionSettings_SetOption(long j, IdFieldProcessingSessionSettings idFieldProcessingSessionSettings, String str, String str2);

    public static final native long IdFieldProcessingSessionSettings_SupportedFieldProcessorsBegin(long j, IdFieldProcessingSessionSettings idFieldProcessingSessionSettings);

    public static final native long IdFieldProcessingSessionSettings_SupportedFieldProcessorsEnd(long j, IdFieldProcessingSessionSettings idFieldProcessingSessionSettings);

    public static final native void IdFieldProcessingSession_Activate(long j, IdFieldProcessingSession idFieldProcessingSession, String str);

    public static final native long IdFieldProcessingSession_AnimatedFieldsBegin(long j, IdFieldProcessingSession idFieldProcessingSession);

    public static final native long IdFieldProcessingSession_AnimatedFieldsEnd(long j, IdFieldProcessingSession idFieldProcessingSession);

    public static final native long IdFieldProcessingSession_CheckFieldsBegin(long j, IdFieldProcessingSession idFieldProcessingSession);

    public static final native long IdFieldProcessingSession_CheckFieldsEnd(long j, IdFieldProcessingSession idFieldProcessingSession);

    public static final native String IdFieldProcessingSession_GetActivationRequest(long j, IdFieldProcessingSession idFieldProcessingSession);

    public static final native long IdFieldProcessingSession_GetAnimatedField(long j, IdFieldProcessingSession idFieldProcessingSession, String str);

    public static final native int IdFieldProcessingSession_GetAnimatedFieldsCount(long j, IdFieldProcessingSession idFieldProcessingSession);

    public static final native long IdFieldProcessingSession_GetCheckField(long j, IdFieldProcessingSession idFieldProcessingSession, String str);

    public static final native int IdFieldProcessingSession_GetCheckFieldsCount(long j, IdFieldProcessingSession idFieldProcessingSession);

    public static final native long IdFieldProcessingSession_GetImageField(long j, IdFieldProcessingSession idFieldProcessingSession, String str);

    public static final native int IdFieldProcessingSession_GetImageFieldsCount(long j, IdFieldProcessingSession idFieldProcessingSession);

    public static final native long IdFieldProcessingSession_GetTextField(long j, IdFieldProcessingSession idFieldProcessingSession, String str);

    public static final native int IdFieldProcessingSession_GetTextFieldsCount(long j, IdFieldProcessingSession idFieldProcessingSession);

    public static final native boolean IdFieldProcessingSession_HasAnimatedField(long j, IdFieldProcessingSession idFieldProcessingSession, String str);

    public static final native boolean IdFieldProcessingSession_HasCheckField(long j, IdFieldProcessingSession idFieldProcessingSession, String str);

    public static final native boolean IdFieldProcessingSession_HasImageField(long j, IdFieldProcessingSession idFieldProcessingSession, String str);

    public static final native boolean IdFieldProcessingSession_HasTextField(long j, IdFieldProcessingSession idFieldProcessingSession, String str);

    public static final native long IdFieldProcessingSession_ImageFieldsBegin(long j, IdFieldProcessingSession idFieldProcessingSession);

    public static final native long IdFieldProcessingSession_ImageFieldsEnd(long j, IdFieldProcessingSession idFieldProcessingSession);

    public static final native boolean IdFieldProcessingSession_IsActivated(long j, IdFieldProcessingSession idFieldProcessingSession);

    public static final native void IdFieldProcessingSession_Process(long j, IdFieldProcessingSession idFieldProcessingSession);

    public static final native void IdFieldProcessingSession_RemoveAnimatedField(long j, IdFieldProcessingSession idFieldProcessingSession, String str);

    public static final native void IdFieldProcessingSession_RemoveCheckField(long j, IdFieldProcessingSession idFieldProcessingSession, String str);

    public static final native void IdFieldProcessingSession_RemoveImageField(long j, IdFieldProcessingSession idFieldProcessingSession, String str);

    public static final native void IdFieldProcessingSession_RemoveTextField(long j, IdFieldProcessingSession idFieldProcessingSession, String str);

    public static final native void IdFieldProcessingSession_Reset(long j, IdFieldProcessingSession idFieldProcessingSession);

    public static final native void IdFieldProcessingSession_SetAnimatedField(long j, IdFieldProcessingSession idFieldProcessingSession, String str, long j2, IdAnimatedField idAnimatedField);

    public static final native void IdFieldProcessingSession_SetCheckField(long j, IdFieldProcessingSession idFieldProcessingSession, String str, long j2, IdCheckField idCheckField);

    public static final native void IdFieldProcessingSession_SetImageField(long j, IdFieldProcessingSession idFieldProcessingSession, String str, long j2, IdImageField idImageField);

    public static final native void IdFieldProcessingSession_SetTextField(long j, IdFieldProcessingSession idFieldProcessingSession, String str, long j2, IdTextField idTextField);

    public static final native long IdFieldProcessingSession_TextFieldsBegin(long j, IdFieldProcessingSession idFieldProcessingSession);

    public static final native long IdFieldProcessingSession_TextFieldsEnd(long j, IdFieldProcessingSession idFieldProcessingSession);

    public static final native long IdFileAnalysisSessionSettings_Clone(long j, IdFileAnalysisSessionSettings idFileAnalysisSessionSettings);

    public static final native void IdFileAnalysisSessionSettings_DisableForensicField(long j, IdFileAnalysisSessionSettings idFileAnalysisSessionSettings, String str);

    public static final native void IdFileAnalysisSessionSettings_EnableForensicField(long j, IdFileAnalysisSessionSettings idFileAnalysisSessionSettings, String str);

    public static final native long IdFileAnalysisSessionSettings_EnabledForensicFieldsBegin(long j, IdFileAnalysisSessionSettings idFileAnalysisSessionSettings);

    public static final native long IdFileAnalysisSessionSettings_EnabledForensicFieldsEnd(long j, IdFileAnalysisSessionSettings idFileAnalysisSessionSettings);

    public static final native int IdFileAnalysisSessionSettings_GetEnabledForensicFieldsCount(long j, IdFileAnalysisSessionSettings idFileAnalysisSessionSettings);

    public static final native String IdFileAnalysisSessionSettings_GetOption(long j, IdFileAnalysisSessionSettings idFileAnalysisSessionSettings, String str);

    public static final native int IdFileAnalysisSessionSettings_GetOptionsCount(long j, IdFileAnalysisSessionSettings idFileAnalysisSessionSettings);

    public static final native int IdFileAnalysisSessionSettings_GetSupportedForensicFieldsCount(long j, IdFileAnalysisSessionSettings idFileAnalysisSessionSettings);

    public static final native boolean IdFileAnalysisSessionSettings_HasEnabledForensicField(long j, IdFileAnalysisSessionSettings idFileAnalysisSessionSettings, String str);

    public static final native boolean IdFileAnalysisSessionSettings_HasOption(long j, IdFileAnalysisSessionSettings idFileAnalysisSessionSettings, String str);

    public static final native boolean IdFileAnalysisSessionSettings_HasSupportedForensicField(long j, IdFileAnalysisSessionSettings idFileAnalysisSessionSettings, String str);

    public static final native long IdFileAnalysisSessionSettings_OptionsBegin(long j, IdFileAnalysisSessionSettings idFileAnalysisSessionSettings);

    public static final native long IdFileAnalysisSessionSettings_OptionsEnd(long j, IdFileAnalysisSessionSettings idFileAnalysisSessionSettings);

    public static final native void IdFileAnalysisSessionSettings_RemoveOption(long j, IdFileAnalysisSessionSettings idFileAnalysisSessionSettings, String str);

    public static final native void IdFileAnalysisSessionSettings_SetOption(long j, IdFileAnalysisSessionSettings idFileAnalysisSessionSettings, String str, String str2);

    public static final native long IdFileAnalysisSessionSettings_SupportedForensicFieldsBegin(long j, IdFileAnalysisSessionSettings idFileAnalysisSessionSettings);

    public static final native long IdFileAnalysisSessionSettings_SupportedForensicFieldsEnd(long j, IdFileAnalysisSessionSettings idFileAnalysisSessionSettings);

    public static final native void IdFileAnalysisSession_Activate(long j, IdFileAnalysisSession idFileAnalysisSession, String str);

    public static final native String IdFileAnalysisSession_GetActivationRequest(long j, IdFileAnalysisSession idFileAnalysisSession);

    public static final native long IdFileAnalysisSession_GetCurrentResult(long j, IdFileAnalysisSession idFileAnalysisSession);

    public static final native boolean IdFileAnalysisSession_IsActivated(long j, IdFileAnalysisSession idFileAnalysisSession);

    public static final native long IdFileAnalysisSession_Process(long j, IdFileAnalysisSession idFileAnalysisSession, long j2, Image image);

    public static final native void IdFileAnalysisSession_Reset(long j, IdFileAnalysisSession idFileAnalysisSession);

    public static final native long IdImageField_GetBaseFieldInfo(long j, IdImageField idImageField);

    public static final native long IdImageField_GetMutableBaseFieldInfo(long j, IdImageField idImageField);

    public static final native String IdImageField_GetName(long j, IdImageField idImageField);

    public static final native long IdImageField_GetValue(long j, IdImageField idImageField);

    public static final native void IdImageField_SetName(long j, IdImageField idImageField, String str);

    public static final native void IdImageField_SetValue(long j, IdImageField idImageField, long j2, Image image);

    public static final native void IdImageFieldsMapIterator_Advance(long j, IdImageFieldsMapIterator idImageFieldsMapIterator);

    public static final native boolean IdImageFieldsMapIterator_Equals(long j, IdImageFieldsMapIterator idImageFieldsMapIterator, long j2, IdImageFieldsMapIterator idImageFieldsMapIterator2);

    public static final native String IdImageFieldsMapIterator_GetKey(long j, IdImageFieldsMapIterator idImageFieldsMapIterator);

    public static final native long IdImageFieldsMapIterator_GetValue(long j, IdImageFieldsMapIterator idImageFieldsMapIterator);

    public static final native long IdResult_AnimatedFieldsBegin(long j, IdResult idResult);

    public static final native long IdResult_AnimatedFieldsEnd(long j, IdResult idResult);

    public static final native void IdResult_AppendTemplateDetectionResult(long j, IdResult idResult, long j2, IdTemplateDetectionResult idTemplateDetectionResult);

    public static final native void IdResult_AppendTemplateSegmentationResult(long j, IdResult idResult, long j2, IdTemplateSegmentationResult idTemplateSegmentationResult);

    public static final native long IdResult_CheckFieldsBegin(long j, IdResult idResult);

    public static final native long IdResult_CheckFieldsEnd(long j, IdResult idResult);

    public static final native void IdResult_ClearTemplateDetectionResults(long j, IdResult idResult);

    public static final native void IdResult_ClearTemplateSegmentationResults(long j, IdResult idResult);

    public static final native long IdResult_CorrespondingFieldNamesBegin(long j, IdResult idResult, String str);

    public static final native long IdResult_CorrespondingFieldNamesEnd(long j, IdResult idResult, String str);

    public static final native long IdResult_CorrespondingRawFieldNamesBegin(long j, IdResult idResult, String str);

    public static final native long IdResult_CorrespondingRawFieldNamesEnd(long j, IdResult idResult, String str);

    public static final native long IdResult_ForensicAnimatedFieldsBegin(long j, IdResult idResult);

    public static final native long IdResult_ForensicAnimatedFieldsEnd(long j, IdResult idResult);

    public static final native long IdResult_ForensicCheckFieldsBegin(long j, IdResult idResult);

    public static final native long IdResult_ForensicCheckFieldsEnd(long j, IdResult idResult);

    public static final native long IdResult_ForensicImageFieldsBegin(long j, IdResult idResult);

    public static final native long IdResult_ForensicImageFieldsEnd(long j, IdResult idResult);

    public static final native long IdResult_ForensicTextFieldsBegin(long j, IdResult idResult);

    public static final native long IdResult_ForensicTextFieldsEnd(long j, IdResult idResult);

    public static final native long IdResult_GetAnimatedField(long j, IdResult idResult, String str);

    public static final native int IdResult_GetAnimatedFieldsCount(long j, IdResult idResult);

    public static final native long IdResult_GetCheckField(long j, IdResult idResult, String str);

    public static final native int IdResult_GetCheckFieldsCount(long j, IdResult idResult);

    public static final native int IdResult_GetCorrespondingFieldsCount(long j, IdResult idResult, String str);

    public static final native int IdResult_GetCorrespondingRawFieldsCount(long j, IdResult idResult, String str);

    public static final native String IdResult_GetDocumentType(long j, IdResult idResult);

    public static final native long IdResult_GetForensicAnimatedField(long j, IdResult idResult, String str);

    public static final native int IdResult_GetForensicAnimatedFieldsCount(long j, IdResult idResult);

    public static final native long IdResult_GetForensicCheckField(long j, IdResult idResult, String str);

    public static final native int IdResult_GetForensicCheckFieldsCount(long j, IdResult idResult);

    public static final native long IdResult_GetForensicImageField(long j, IdResult idResult, String str);

    public static final native int IdResult_GetForensicImageFieldsCount(long j, IdResult idResult);

    public static final native long IdResult_GetForensicTextField(long j, IdResult idResult, String str);

    public static final native int IdResult_GetForensicTextFieldsCount(long j, IdResult idResult);

    public static final native long IdResult_GetImageField(long j, IdResult idResult, String str);

    public static final native int IdResult_GetImageFieldsCount(long j, IdResult idResult);

    public static final native boolean IdResult_GetIsTerminal(long j, IdResult idResult);

    public static final native long IdResult_GetRawImageField(long j, IdResult idResult, String str);

    public static final native int IdResult_GetRawImageFieldsCount(long j, IdResult idResult);

    public static final native long IdResult_GetRawTextField(long j, IdResult idResult, String str);

    public static final native int IdResult_GetRawTextFieldsCount(long j, IdResult idResult);

    public static final native long IdResult_GetSeenTemplates(long j, IdResult idResult);

    public static final native long IdResult_GetTemplateDetectionResult(long j, IdResult idResult, int i);

    public static final native int IdResult_GetTemplateDetectionResultsCount(long j, IdResult idResult);

    public static final native long IdResult_GetTemplateSegmentationResult(long j, IdResult idResult, int i);

    public static final native int IdResult_GetTemplateSegmentationResultsCount(long j, IdResult idResult);

    public static final native long IdResult_GetTerminalTemplates(long j, IdResult idResult);

    public static final native long IdResult_GetTextField(long j, IdResult idResult, String str);

    public static final native int IdResult_GetTextFieldsCount(long j, IdResult idResult);

    public static final native boolean IdResult_HasAnimatedField(long j, IdResult idResult, String str);

    public static final native boolean IdResult_HasCheckField(long j, IdResult idResult, String str);

    public static final native boolean IdResult_HasCorrespondingField(long j, IdResult idResult, String str, String str2);

    public static final native boolean IdResult_HasCorrespondingRawField(long j, IdResult idResult, String str, String str2);

    public static final native boolean IdResult_HasForensicAnimatedField(long j, IdResult idResult, String str);

    public static final native boolean IdResult_HasForensicCheckField(long j, IdResult idResult, String str);

    public static final native boolean IdResult_HasForensicImageField(long j, IdResult idResult, String str);

    public static final native boolean IdResult_HasForensicTextField(long j, IdResult idResult, String str);

    public static final native boolean IdResult_HasImageField(long j, IdResult idResult, String str);

    public static final native boolean IdResult_HasRawImageField(long j, IdResult idResult, String str);

    public static final native boolean IdResult_HasRawTextField(long j, IdResult idResult, String str);

    public static final native boolean IdResult_HasTextField(long j, IdResult idResult, String str);

    public static final native long IdResult_ImageFieldsBegin(long j, IdResult idResult);

    public static final native long IdResult_ImageFieldsEnd(long j, IdResult idResult);

    public static final native long IdResult_RawImageFieldsBegin(long j, IdResult idResult);

    public static final native long IdResult_RawImageFieldsEnd(long j, IdResult idResult);

    public static final native long IdResult_RawTextFieldsBegin(long j, IdResult idResult);

    public static final native long IdResult_RawTextFieldsEnd(long j, IdResult idResult);

    public static final native void IdResult_RemoveAnimatedField(long j, IdResult idResult, String str);

    public static final native void IdResult_RemoveCheckField(long j, IdResult idResult, String str);

    public static final native void IdResult_RemoveForensicAnimatedField(long j, IdResult idResult, String str);

    public static final native void IdResult_RemoveForensicCheckField(long j, IdResult idResult, String str);

    public static final native void IdResult_RemoveForensicImageField(long j, IdResult idResult, String str);

    public static final native void IdResult_RemoveForensicTextField(long j, IdResult idResult, String str);

    public static final native void IdResult_RemoveImageField(long j, IdResult idResult, String str);

    public static final native void IdResult_RemoveRawImageField(long j, IdResult idResult, String str);

    public static final native void IdResult_RemoveRawTextField(long j, IdResult idResult, String str);

    public static final native void IdResult_RemoveTextField(long j, IdResult idResult, String str);

    public static final native void IdResult_SetAnimatedField(long j, IdResult idResult, String str, long j2, IdAnimatedField idAnimatedField);

    public static final native void IdResult_SetCheckField(long j, IdResult idResult, String str, long j2, IdCheckField idCheckField);

    public static final native void IdResult_SetDocumentType(long j, IdResult idResult, String str);

    public static final native void IdResult_SetForensicAnimatedField(long j, IdResult idResult, String str, long j2, IdAnimatedField idAnimatedField);

    public static final native void IdResult_SetForensicCheckField(long j, IdResult idResult, String str, long j2, IdCheckField idCheckField);

    public static final native void IdResult_SetForensicImageField(long j, IdResult idResult, String str, long j2, IdImageField idImageField);

    public static final native void IdResult_SetForensicTextField(long j, IdResult idResult, String str, long j2, IdTextField idTextField);

    public static final native void IdResult_SetImageField(long j, IdResult idResult, String str, long j2, IdImageField idImageField);

    public static final native void IdResult_SetIsTerminal(long j, IdResult idResult, boolean z);

    public static final native void IdResult_SetRawImageField(long j, IdResult idResult, String str, long j2, IdImageField idImageField);

    public static final native void IdResult_SetRawTextField(long j, IdResult idResult, String str, long j2, IdTextField idTextField);

    public static final native void IdResult_SetTextField(long j, IdResult idResult, String str, long j2, IdTextField idTextField);

    public static final native long IdResult_TextFieldsBegin(long j, IdResult idResult);

    public static final native long IdResult_TextFieldsEnd(long j, IdResult idResult);

    public static final native void IdSessionSettings_AddEnabledDocumentTypes(long j, IdSessionSettings idSessionSettings, String str);

    public static final native long IdSessionSettings_Clone(long j, IdSessionSettings idSessionSettings);

    public static final native void IdSessionSettings_DisableField(long j, IdSessionSettings idSessionSettings, String str, String str2);

    public static final native void IdSessionSettings_DisableForensicField(long j, IdSessionSettings idSessionSettings, String str, String str2);

    public static final native void IdSessionSettings_DisableForensics(long j, IdSessionSettings idSessionSettings);

    public static final native void IdSessionSettings_EnableField(long j, IdSessionSettings idSessionSettings, String str, String str2);

    public static final native void IdSessionSettings_EnableForensicField(long j, IdSessionSettings idSessionSettings, String str, String str2);

    public static final native void IdSessionSettings_EnableForensics(long j, IdSessionSettings idSessionSettings);

    public static final native long IdSessionSettings_EnabledDocumentTypesBegin(long j, IdSessionSettings idSessionSettings);

    public static final native long IdSessionSettings_EnabledDocumentTypesEnd(long j, IdSessionSettings idSessionSettings);

    public static final native long IdSessionSettings_EnabledFieldsBegin(long j, IdSessionSettings idSessionSettings, String str);

    public static final native long IdSessionSettings_EnabledFieldsEnd(long j, IdSessionSettings idSessionSettings, String str);

    public static final native long IdSessionSettings_EnabledForensicFieldsBegin(long j, IdSessionSettings idSessionSettings, String str);

    public static final native long IdSessionSettings_EnabledForensicFieldsEnd(long j, IdSessionSettings idSessionSettings, String str);

    public static final native String IdSessionSettings_GetCurrentMode(long j, IdSessionSettings idSessionSettings);

    public static final native long IdSessionSettings_GetDocumentInfo(long j, IdSessionSettings idSessionSettings, String str);

    public static final native int IdSessionSettings_GetEnabledDocumentTypesCount(long j, IdSessionSettings idSessionSettings);

    public static final native int IdSessionSettings_GetEnabledFieldsCount(long j, IdSessionSettings idSessionSettings, String str);

    public static final native int IdSessionSettings_GetEnabledForensicFieldsCount(long j, IdSessionSettings idSessionSettings, String str);

    public static final native int IdSessionSettings_GetFieldType(long j, IdSessionSettings idSessionSettings, String str, String str2);

    public static final native int IdSessionSettings_GetForensicFieldType(long j, IdSessionSettings idSessionSettings, String str, String str2);

    public static final native int IdSessionSettings_GetInternalEnginesCount(long j, IdSessionSettings idSessionSettings);

    public static final native String IdSessionSettings_GetOption(long j, IdSessionSettings idSessionSettings, String str);

    public static final native int IdSessionSettings_GetOptionsCount(long j, IdSessionSettings idSessionSettings);

    public static final native int IdSessionSettings_GetSupportedDocumentTypesCount(long j, IdSessionSettings idSessionSettings, String str);

    public static final native int IdSessionSettings_GetSupportedFieldsCount(long j, IdSessionSettings idSessionSettings, String str);

    public static final native int IdSessionSettings_GetSupportedForensicFieldsCount(long j, IdSessionSettings idSessionSettings, String str);

    public static final native int IdSessionSettings_GetSupportedModesCount(long j, IdSessionSettings idSessionSettings);

    public static final native boolean IdSessionSettings_HasEnabledDocumentType(long j, IdSessionSettings idSessionSettings, String str);

    public static final native boolean IdSessionSettings_HasEnabledField(long j, IdSessionSettings idSessionSettings, String str, String str2);

    public static final native boolean IdSessionSettings_HasEnabledForensicField(long j, IdSessionSettings idSessionSettings, String str, String str2);

    public static final native boolean IdSessionSettings_HasInternalEngine(long j, IdSessionSettings idSessionSettings, String str);

    public static final native boolean IdSessionSettings_HasOption(long j, IdSessionSettings idSessionSettings, String str);

    public static final native boolean IdSessionSettings_HasSupportedDocumentType(long j, IdSessionSettings idSessionSettings, String str, String str2);

    public static final native boolean IdSessionSettings_HasSupportedField(long j, IdSessionSettings idSessionSettings, String str, String str2);

    public static final native boolean IdSessionSettings_HasSupportedForensicField(long j, IdSessionSettings idSessionSettings, String str, String str2);

    public static final native boolean IdSessionSettings_HasSupportedMode(long j, IdSessionSettings idSessionSettings, String str);

    public static final native long IdSessionSettings_InternalEngineNamesBegin(long j, IdSessionSettings idSessionSettings);

    public static final native long IdSessionSettings_InternalEngineNamesEnd(long j, IdSessionSettings idSessionSettings);

    public static final native boolean IdSessionSettings_IsForensicsEnabled(long j, IdSessionSettings idSessionSettings);

    public static final native long IdSessionSettings_OptionsBegin(long j, IdSessionSettings idSessionSettings);

    public static final native long IdSessionSettings_OptionsEnd(long j, IdSessionSettings idSessionSettings);

    public static final native long IdSessionSettings_PermissiblePrefixDocMasksBegin(long j, IdSessionSettings idSessionSettings);

    public static final native long IdSessionSettings_PermissiblePrefixDocMasksEnd(long j, IdSessionSettings idSessionSettings);

    public static final native void IdSessionSettings_RemoveEnabledDocumentTypes(long j, IdSessionSettings idSessionSettings, String str);

    public static final native void IdSessionSettings_RemoveOption(long j, IdSessionSettings idSessionSettings, String str);

    public static final native void IdSessionSettings_SetCurrentMode(long j, IdSessionSettings idSessionSettings, String str);

    public static final native void IdSessionSettings_SetOption(long j, IdSessionSettings idSessionSettings, String str, String str2);

    public static final native long IdSessionSettings_SupportedDocumentTypesBegin(long j, IdSessionSettings idSessionSettings, String str);

    public static final native long IdSessionSettings_SupportedDocumentTypesEnd(long j, IdSessionSettings idSessionSettings, String str);

    public static final native long IdSessionSettings_SupportedFieldsBegin(long j, IdSessionSettings idSessionSettings, String str);

    public static final native long IdSessionSettings_SupportedFieldsEnd(long j, IdSessionSettings idSessionSettings, String str);

    public static final native long IdSessionSettings_SupportedForensicFieldsBegin(long j, IdSessionSettings idSessionSettings, String str);

    public static final native long IdSessionSettings_SupportedForensicFieldsEnd(long j, IdSessionSettings idSessionSettings, String str);

    public static final native long IdSessionSettings_SupportedModesBegin(long j, IdSessionSettings idSessionSettings);

    public static final native long IdSessionSettings_SupportedModesEnd(long j, IdSessionSettings idSessionSettings);

    public static final native void IdSession_Activate(long j, IdSession idSession, String str);

    public static final native String IdSession_GetActivationRequest(long j, IdSession idSession);

    public static final native long IdSession_GetCurrentResult(long j, IdSession idSession);

    public static final native boolean IdSession_IsActivated(long j, IdSession idSession);

    public static final native boolean IdSession_IsResultTerminal(long j, IdSession idSession);

    public static final native long IdSession_Process__SWIG_0(long j, IdSession idSession, long j2, Image image);

    public static final native long IdSession_Process__SWIG_1(long j, IdSession idSession, long j2, ByteString byteString);

    public static final native void IdSession_Reset(long j, IdSession idSession);

    public static final native long IdTemplateDetectionResult_AttributesBegin(long j, IdTemplateDetectionResult idTemplateDetectionResult);

    public static final native long IdTemplateDetectionResult_AttributesEnd(long j, IdTemplateDetectionResult idTemplateDetectionResult);

    public static final native String IdTemplateDetectionResult_GetAttribute(long j, IdTemplateDetectionResult idTemplateDetectionResult, String str);

    public static final native int IdTemplateDetectionResult_GetAttributesCount(long j, IdTemplateDetectionResult idTemplateDetectionResult);

    public static final native double IdTemplateDetectionResult_GetConfidence(long j, IdTemplateDetectionResult idTemplateDetectionResult);

    public static final native boolean IdTemplateDetectionResult_GetIsAccepted(long j, IdTemplateDetectionResult idTemplateDetectionResult);

    public static final native long IdTemplateDetectionResult_GetQuadrangle(long j, IdTemplateDetectionResult idTemplateDetectionResult);

    public static final native long IdTemplateDetectionResult_GetStandardSize(long j, IdTemplateDetectionResult idTemplateDetectionResult);

    public static final native String IdTemplateDetectionResult_GetTemplateName(long j, IdTemplateDetectionResult idTemplateDetectionResult);

    public static final native boolean IdTemplateDetectionResult_HasAttribute(long j, IdTemplateDetectionResult idTemplateDetectionResult, String str);

    public static final native void IdTemplateDetectionResult_RemoveAttribute(long j, IdTemplateDetectionResult idTemplateDetectionResult, String str);

    public static final native void IdTemplateDetectionResult_SetAttribute(long j, IdTemplateDetectionResult idTemplateDetectionResult, String str, String str2);

    public static final native void IdTemplateDetectionResult_SetConfidence(long j, IdTemplateDetectionResult idTemplateDetectionResult, double d);

    public static final native void IdTemplateDetectionResult_SetIsAccepted(long j, IdTemplateDetectionResult idTemplateDetectionResult, boolean z);

    public static final native void IdTemplateDetectionResult_SetQuadrangle(long j, IdTemplateDetectionResult idTemplateDetectionResult, long j2, Quadrangle quadrangle);

    public static final native void IdTemplateDetectionResult_SetStandardSize(long j, IdTemplateDetectionResult idTemplateDetectionResult, long j2, Size size);

    public static final native void IdTemplateDetectionResult_SetTemplateName(long j, IdTemplateDetectionResult idTemplateDetectionResult, String str);

    public static final native double IdTemplateSegmentationResult_GetConfidence(long j, IdTemplateSegmentationResult idTemplateSegmentationResult);

    public static final native boolean IdTemplateSegmentationResult_GetIsAccepted(long j, IdTemplateSegmentationResult idTemplateSegmentationResult);

    public static final native long IdTemplateSegmentationResult_GetRawFieldQuadrangle(long j, IdTemplateSegmentationResult idTemplateSegmentationResult, String str);

    public static final native long IdTemplateSegmentationResult_GetRawFieldTemplateQuadrangle(long j, IdTemplateSegmentationResult idTemplateSegmentationResult, String str);

    public static final native int IdTemplateSegmentationResult_GetRawFieldsCount(long j, IdTemplateSegmentationResult idTemplateSegmentationResult);

    public static final native boolean IdTemplateSegmentationResult_HasRawField(long j, IdTemplateSegmentationResult idTemplateSegmentationResult, String str);

    public static final native long IdTemplateSegmentationResult_RawFieldQuadranglesBegin(long j, IdTemplateSegmentationResult idTemplateSegmentationResult);

    public static final native long IdTemplateSegmentationResult_RawFieldQuadranglesEnd(long j, IdTemplateSegmentationResult idTemplateSegmentationResult);

    public static final native long IdTemplateSegmentationResult_RawFieldTemplateQuadranglesBegin(long j, IdTemplateSegmentationResult idTemplateSegmentationResult);

    public static final native long IdTemplateSegmentationResult_RawFieldTemplateQuadranglesEnd(long j, IdTemplateSegmentationResult idTemplateSegmentationResult);

    public static final native void IdTemplateSegmentationResult_RemoveRawField(long j, IdTemplateSegmentationResult idTemplateSegmentationResult, String str);

    public static final native void IdTemplateSegmentationResult_SetConfidence(long j, IdTemplateSegmentationResult idTemplateSegmentationResult, double d);

    public static final native void IdTemplateSegmentationResult_SetIsAccepted(long j, IdTemplateSegmentationResult idTemplateSegmentationResult, boolean z);

    public static final native void IdTemplateSegmentationResult_SetRawFieldQuadrangles(long j, IdTemplateSegmentationResult idTemplateSegmentationResult, String str, long j2, Quadrangle quadrangle, long j3, Quadrangle quadrangle2);

    public static final native long IdTextField_GetBaseFieldInfo(long j, IdTextField idTextField);

    public static final native long IdTextField_GetMutableBaseFieldInfo(long j, IdTextField idTextField);

    public static final native String IdTextField_GetName(long j, IdTextField idTextField);

    public static final native long IdTextField_GetValue(long j, IdTextField idTextField);

    public static final native void IdTextField_SetName(long j, IdTextField idTextField, String str);

    public static final native void IdTextField_SetValue__SWIG_0(long j, IdTextField idTextField, long j2, OcrString ocrString);

    public static final native void IdTextField_SetValue__SWIG_1(long j, IdTextField idTextField, String str);

    public static final native void IdTextFieldsMapIterator_Advance(long j, IdTextFieldsMapIterator idTextFieldsMapIterator);

    public static final native boolean IdTextFieldsMapIterator_Equals(long j, IdTextFieldsMapIterator idTextFieldsMapIterator, long j2, IdTextFieldsMapIterator idTextFieldsMapIterator2);

    public static final native String IdTextFieldsMapIterator_GetKey(long j, IdTextFieldsMapIterator idTextFieldsMapIterator);

    public static final native long IdTextFieldsMapIterator_GetValue(long j, IdTextFieldsMapIterator idTextFieldsMapIterator);

    public static final native long IdVideoAuthenticationAnomaly_GetBaseFieldInfo(long j, IdVideoAuthenticationAnomaly idVideoAuthenticationAnomaly);

    public static final native int IdVideoAuthenticationAnomaly_GetEndFrame(long j, IdVideoAuthenticationAnomaly idVideoAuthenticationAnomaly);

    public static final native long IdVideoAuthenticationAnomaly_GetMutableBaseFieldInfo(long j, IdVideoAuthenticationAnomaly idVideoAuthenticationAnomaly);

    public static final native String IdVideoAuthenticationAnomaly_GetName(long j, IdVideoAuthenticationAnomaly idVideoAuthenticationAnomaly);

    public static final native int IdVideoAuthenticationAnomaly_GetStartFrame(long j, IdVideoAuthenticationAnomaly idVideoAuthenticationAnomaly);

    public static final native void IdVideoAuthenticationAnomaly_SetEndFrame(long j, IdVideoAuthenticationAnomaly idVideoAuthenticationAnomaly, int i);

    public static final native void IdVideoAuthenticationAnomaly_SetName(long j, IdVideoAuthenticationAnomaly idVideoAuthenticationAnomaly, String str);

    public static final native void IdVideoAuthenticationAnomaly_SetStartFrame(long j, IdVideoAuthenticationAnomaly idVideoAuthenticationAnomaly, int i);

    public static final native void IdVideoAuthenticationCallbacks_AnomalyRegistered(long j, IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks, int i, long j2, IdVideoAuthenticationAnomaly idVideoAuthenticationAnomaly);

    public static final native void IdVideoAuthenticationCallbacks_AuthenticationStatusUpdated(long j, IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks, int i);

    public static final native void IdVideoAuthenticationCallbacks_DocumentResultUpdated(long j, IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks, long j2, IdResult idResult);

    public static final native void IdVideoAuthenticationCallbacks_FaceLivenessResultUpdated(long j, IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks, long j2, IdFaceLivenessResult idFaceLivenessResult);

    public static final native void IdVideoAuthenticationCallbacks_FaceMatchingResultUpdated(long j, IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks, long j2, IdFaceSimilarityResult idFaceSimilarityResult);

    public static final native void IdVideoAuthenticationCallbacks_GlobalTimeoutReached(long j, IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks);

    public static final native void IdVideoAuthenticationCallbacks_InstructionReceived(long j, IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks, int i, long j2, IdVideoAuthenticationInstruction idVideoAuthenticationInstruction);

    public static final native void IdVideoAuthenticationCallbacks_InstructionTimeoutReached(long j, IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks);

    public static final native void IdVideoAuthenticationCallbacks_MessageReceived(long j, IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks, String str);

    public static final native void IdVideoAuthenticationCallbacks_SessionEnded(long j, IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks);

    public static final native void IdVideoAuthenticationCallbacks_change_ownership(IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks, long j, boolean z);

    public static final native void IdVideoAuthenticationCallbacks_director_connect(IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks, long j, boolean z, boolean z2);

    public static final native int IdVideoAuthenticationFrameInfo_GetChannels(long j, IdVideoAuthenticationFrameInfo idVideoAuthenticationFrameInfo);

    public static final native int IdVideoAuthenticationFrameInfo_GetHeight(long j, IdVideoAuthenticationFrameInfo idVideoAuthenticationFrameInfo);

    public static final native long IdVideoAuthenticationFrameInfo_GetSize(long j, IdVideoAuthenticationFrameInfo idVideoAuthenticationFrameInfo);

    public static final native int IdVideoAuthenticationFrameInfo_GetStride(long j, IdVideoAuthenticationFrameInfo idVideoAuthenticationFrameInfo);

    public static final native int IdVideoAuthenticationFrameInfo_GetTimestamp(long j, IdVideoAuthenticationFrameInfo idVideoAuthenticationFrameInfo);

    public static final native int IdVideoAuthenticationFrameInfo_GetWidth(long j, IdVideoAuthenticationFrameInfo idVideoAuthenticationFrameInfo);

    public static final native void IdVideoAuthenticationFrameInfo_SetChannels(long j, IdVideoAuthenticationFrameInfo idVideoAuthenticationFrameInfo, int i);

    public static final native void IdVideoAuthenticationFrameInfo_SetHeight(long j, IdVideoAuthenticationFrameInfo idVideoAuthenticationFrameInfo, int i);

    public static final native void IdVideoAuthenticationFrameInfo_SetSize(long j, IdVideoAuthenticationFrameInfo idVideoAuthenticationFrameInfo, long j2, Size size);

    public static final native void IdVideoAuthenticationFrameInfo_SetStride(long j, IdVideoAuthenticationFrameInfo idVideoAuthenticationFrameInfo, int i);

    public static final native void IdVideoAuthenticationFrameInfo_SetTimestamp(long j, IdVideoAuthenticationFrameInfo idVideoAuthenticationFrameInfo, int i);

    public static final native void IdVideoAuthenticationFrameInfo_SetWidth(long j, IdVideoAuthenticationFrameInfo idVideoAuthenticationFrameInfo, int i);

    public static final native int IdVideoAuthenticationInstruction_GetFrameIndex(long j, IdVideoAuthenticationInstruction idVideoAuthenticationInstruction);

    public static final native String IdVideoAuthenticationInstruction_GetInstructionCode(long j, IdVideoAuthenticationInstruction idVideoAuthenticationInstruction);

    public static final native String IdVideoAuthenticationInstruction_GetParameter(long j, IdVideoAuthenticationInstruction idVideoAuthenticationInstruction, String str);

    public static final native int IdVideoAuthenticationInstruction_GetParametersCount(long j, IdVideoAuthenticationInstruction idVideoAuthenticationInstruction);

    public static final native boolean IdVideoAuthenticationInstruction_HasParameter(long j, IdVideoAuthenticationInstruction idVideoAuthenticationInstruction, String str);

    public static final native long IdVideoAuthenticationInstruction_ParametersBegin(long j, IdVideoAuthenticationInstruction idVideoAuthenticationInstruction);

    public static final native long IdVideoAuthenticationInstruction_ParametersEnd(long j, IdVideoAuthenticationInstruction idVideoAuthenticationInstruction);

    public static final native void IdVideoAuthenticationInstruction_RemoveParameter(long j, IdVideoAuthenticationInstruction idVideoAuthenticationInstruction, String str);

    public static final native void IdVideoAuthenticationInstruction_SetFrameIndex(long j, IdVideoAuthenticationInstruction idVideoAuthenticationInstruction, int i);

    public static final native void IdVideoAuthenticationInstruction_SetInstructionCode(long j, IdVideoAuthenticationInstruction idVideoAuthenticationInstruction, String str);

    public static final native void IdVideoAuthenticationInstruction_SetParameter(long j, IdVideoAuthenticationInstruction idVideoAuthenticationInstruction, String str, String str2);

    public static final native void IdVideoAuthenticationSessionSettings_AddEnabledDocumentTypes(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str);

    public static final native long IdVideoAuthenticationSessionSettings_Clone(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings);

    public static final native long IdVideoAuthenticationSessionSettings_EnabledDocumentTypesBegin(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings);

    public static final native long IdVideoAuthenticationSessionSettings_EnabledDocumentTypesEnd(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings);

    public static final native String IdVideoAuthenticationSessionSettings_GetCurrentMode(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings);

    /* renamed from: IdVideoAuthenticationSessionSettings_GetCurrentVideoAuthenticationMode */
    public static final native String m498xcee9c995(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings);

    public static final native long IdVideoAuthenticationSessionSettings_GetDocumentInfo(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str);

    /* renamed from: IdVideoAuthenticationSessionSettings_GetEnabledDocumentTypesCount */
    public static final native int m499x1c717e7a(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings);

    public static final native int IdVideoAuthenticationSessionSettings_GetInternalEnginesCount(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings);

    public static final native String IdVideoAuthenticationSessionSettings_GetOption(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str);

    public static final native int IdVideoAuthenticationSessionSettings_GetOptionsCount(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings);

    /* renamed from: IdVideoAuthenticationSessionSettings_GetSupportedDocumentTypesCount */
    public static final native int m500xcf89d4a7(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str);

    public static final native int IdVideoAuthenticationSessionSettings_GetSupportedModesCount(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings);

    /* renamed from: IdVideoAuthenticationSessionSettings_GetVideoAuthenticationModesCount */
    public static final native int m501x8fe371ba(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings);

    public static final native boolean IdVideoAuthenticationSessionSettings_HasEnabledDocumentType(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str);

    public static final native boolean IdVideoAuthenticationSessionSettings_HasInternalEngine(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str);

    public static final native boolean IdVideoAuthenticationSessionSettings_HasOption(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str);

    public static final native boolean IdVideoAuthenticationSessionSettings_HasSupportedDocumentType(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str, String str2);

    public static final native boolean IdVideoAuthenticationSessionSettings_HasSupportedMode(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str);

    public static final native boolean IdVideoAuthenticationSessionSettings_HasVideoAuthenticationMode(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str);

    public static final native long IdVideoAuthenticationSessionSettings_InternalEngineNamesBegin(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings);

    public static final native long IdVideoAuthenticationSessionSettings_InternalEngineNamesEnd(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings);

    public static final native boolean IdVideoAuthenticationSessionSettings_IsForensicsEnabled(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings);

    public static final native long IdVideoAuthenticationSessionSettings_OptionsBegin(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings);

    public static final native long IdVideoAuthenticationSessionSettings_OptionsEnd(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings);

    /* renamed from: IdVideoAuthenticationSessionSettings_PermissiblePrefixDocMasksBegin */
    public static final native long m502x29ae5f5b(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings);

    /* renamed from: IdVideoAuthenticationSessionSettings_PermissiblePrefixDocMasksEnd */
    public static final native long m503x1e69740d(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings);

    public static final native void IdVideoAuthenticationSessionSettings_RemoveEnabledDocumentTypes(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str);

    public static final native void IdVideoAuthenticationSessionSettings_RemoveOption(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str);

    public static final native void IdVideoAuthenticationSessionSettings_SetCurrentMode(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str);

    /* renamed from: IdVideoAuthenticationSessionSettings_SetCurrentVideoAuthenticationMode */
    public static final native void m504xb50699a1(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str);

    public static final native void IdVideoAuthenticationSessionSettings_SetOption(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str, String str2);

    public static final native long IdVideoAuthenticationSessionSettings_SupportedDocumentTypesBegin(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str);

    public static final native long IdVideoAuthenticationSessionSettings_SupportedDocumentTypesEnd(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str);

    public static final native long IdVideoAuthenticationSessionSettings_SupportedModesBegin(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings);

    public static final native long IdVideoAuthenticationSessionSettings_SupportedModesEnd(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings);

    /* renamed from: IdVideoAuthenticationSessionSettings_VideoAuthenticationModesBegin */
    public static final native long m505x728c06ce(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings);

    public static final native long IdVideoAuthenticationSessionSettings_VideoAuthenticationModesEnd(long j, IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings);

    public static final native void IdVideoAuthenticationSession_Activate(long j, IdVideoAuthenticationSession idVideoAuthenticationSession, String str);

    public static final native String IdVideoAuthenticationSession_GetActivationRequest(long j, IdVideoAuthenticationSession idVideoAuthenticationSession);

    public static final native int IdVideoAuthenticationSession_GetAuthenticationStatus(long j, IdVideoAuthenticationSession idVideoAuthenticationSession);

    public static final native long IdVideoAuthenticationSession_GetCurrentInstruction(long j, IdVideoAuthenticationSession idVideoAuthenticationSession);

    public static final native long IdVideoAuthenticationSession_GetDocumentResult(long j, IdVideoAuthenticationSession idVideoAuthenticationSession);

    public static final native long IdVideoAuthenticationSession_GetFaceLivenessResult(long j, IdVideoAuthenticationSession idVideoAuthenticationSession);

    public static final native long IdVideoAuthenticationSession_GetFaceMatchingResult(long j, IdVideoAuthenticationSession idVideoAuthenticationSession);

    public static final native long IdVideoAuthenticationSession_GetTranscript(long j, IdVideoAuthenticationSession idVideoAuthenticationSession);

    public static final native boolean IdVideoAuthenticationSession_HasDocumentResult(long j, IdVideoAuthenticationSession idVideoAuthenticationSession);

    public static final native boolean IdVideoAuthenticationSession_HasFaceLivenessResult(long j, IdVideoAuthenticationSession idVideoAuthenticationSession);

    public static final native boolean IdVideoAuthenticationSession_HasFaceMatchingResult(long j, IdVideoAuthenticationSession idVideoAuthenticationSession);

    public static final native boolean IdVideoAuthenticationSession_IsActivated(long j, IdVideoAuthenticationSession idVideoAuthenticationSession);

    public static final native void IdVideoAuthenticationSession_ProcessData(long j, IdVideoAuthenticationSession idVideoAuthenticationSession, long j2, ByteString byteString);

    public static final native void IdVideoAuthenticationSession_ProcessFrame(long j, IdVideoAuthenticationSession idVideoAuthenticationSession, long j2, Image image);

    public static final native void IdVideoAuthenticationSession_Reset(long j, IdVideoAuthenticationSession idVideoAuthenticationSession);

    public static final native void IdVideoAuthenticationSession_Resume(long j, IdVideoAuthenticationSession idVideoAuthenticationSession);

    public static final native void IdVideoAuthenticationSession_Suspend(long j, IdVideoAuthenticationSession idVideoAuthenticationSession);

    public static final native void IdVideoAuthenticationTranscript_AppendAnomaly(long j, IdVideoAuthenticationTranscript idVideoAuthenticationTranscript, long j2, IdVideoAuthenticationAnomaly idVideoAuthenticationAnomaly);

    public static final native void IdVideoAuthenticationTranscript_AppendFrameInfo(long j, IdVideoAuthenticationTranscript idVideoAuthenticationTranscript, long j2, IdVideoAuthenticationFrameInfo idVideoAuthenticationFrameInfo);

    public static final native void IdVideoAuthenticationTranscript_AppendInstruction(long j, IdVideoAuthenticationTranscript idVideoAuthenticationTranscript, long j2, IdVideoAuthenticationInstruction idVideoAuthenticationInstruction);

    public static final native int IdVideoAuthenticationTranscript_GetAnomaliesCount(long j, IdVideoAuthenticationTranscript idVideoAuthenticationTranscript);

    public static final native long IdVideoAuthenticationTranscript_GetAnomaly(long j, IdVideoAuthenticationTranscript idVideoAuthenticationTranscript, int i);

    public static final native long IdVideoAuthenticationTranscript_GetCurrentInstruction(long j, IdVideoAuthenticationTranscript idVideoAuthenticationTranscript);

    public static final native long IdVideoAuthenticationTranscript_GetFrameInfo(long j, IdVideoAuthenticationTranscript idVideoAuthenticationTranscript, int i);

    public static final native int IdVideoAuthenticationTranscript_GetFrameInfosCount(long j, IdVideoAuthenticationTranscript idVideoAuthenticationTranscript);

    public static final native long IdVideoAuthenticationTranscript_GetInstruction(long j, IdVideoAuthenticationTranscript idVideoAuthenticationTranscript, int i);

    public static final native int IdVideoAuthenticationTranscript_GetInstructionsCount(long j, IdVideoAuthenticationTranscript idVideoAuthenticationTranscript);

    public static final native long IdVideoAuthenticationTranscript_GetMutableAnomaly(long j, IdVideoAuthenticationTranscript idVideoAuthenticationTranscript, int i);

    public static final native long IdVideoAuthenticationTranscript_GetMutableCurrentInstruction(long j, IdVideoAuthenticationTranscript idVideoAuthenticationTranscript);

    public static final native long IdVideoAuthenticationTranscript_GetMutableFrameInfo(long j, IdVideoAuthenticationTranscript idVideoAuthenticationTranscript, int i);

    public static final native long IdVideoAuthenticationTranscript_GetMutableInstruction(long j, IdVideoAuthenticationTranscript idVideoAuthenticationTranscript, int i);

    public static final native void IdVideoAuthenticationTranscript_ResizeAnomaliesContainer(long j, IdVideoAuthenticationTranscript idVideoAuthenticationTranscript, int i);

    public static final native void IdVideoAuthenticationTranscript_ResizeFrameInfosContainer(long j, IdVideoAuthenticationTranscript idVideoAuthenticationTranscript, int i);

    public static final native void IdVideoAuthenticationTranscript_ResizeInstructionsContainer(long j, IdVideoAuthenticationTranscript idVideoAuthenticationTranscript, int i);

    public static final native void IdVideoAuthenticationTranscript_SetAnomaly(long j, IdVideoAuthenticationTranscript idVideoAuthenticationTranscript, int i, long j2, IdVideoAuthenticationAnomaly idVideoAuthenticationAnomaly);

    public static final native void IdVideoAuthenticationTranscript_SetCurrentInstruction(long j, IdVideoAuthenticationTranscript idVideoAuthenticationTranscript, long j2, IdVideoAuthenticationInstruction idVideoAuthenticationInstruction);

    public static final native void IdVideoAuthenticationTranscript_SetFrameInfo(long j, IdVideoAuthenticationTranscript idVideoAuthenticationTranscript, int i, long j2, IdVideoAuthenticationFrameInfo idVideoAuthenticationFrameInfo);

    public static final native void IdVideoAuthenticationTranscript_SetInstruction(long j, IdVideoAuthenticationTranscript idVideoAuthenticationTranscript, int i, long j2, IdVideoAuthenticationInstruction idVideoAuthenticationInstruction);

    public static final native void delete_IdAnimatedField(long j);

    public static final native void delete_IdAnimatedFieldsMapIterator(long j);

    public static final native void delete_IdBaseFieldInfo(long j);

    public static final native void delete_IdCheckField(long j);

    public static final native void delete_IdCheckFieldsMapIterator(long j);

    public static final native void delete_IdDocumentInfo(long j);

    public static final native void delete_IdEngine(long j);

    public static final native void delete_IdFaceFeedback(long j);

    public static final native void delete_IdFaceLivenessResult(long j);

    public static final native void delete_IdFaceOslResult(long j);

    public static final native void delete_IdFaceRectsResult(long j);

    public static final native void delete_IdFaceSession(long j);

    public static final native void delete_IdFaceSessionSettings(long j);

    public static final native void delete_IdFaceSimilarityResult(long j);

    public static final native void delete_IdFeedback(long j);

    public static final native void delete_IdFeedbackContainer(long j);

    public static final native void delete_IdFieldProcessingSession(long j);

    public static final native void delete_IdFieldProcessingSessionSettings(long j);

    public static final native void delete_IdFileAnalysisSession(long j);

    public static final native void delete_IdFileAnalysisSessionSettings(long j);

    public static final native void delete_IdImageField(long j);

    public static final native void delete_IdImageFieldsMapIterator(long j);

    public static final native void delete_IdResult(long j);

    public static final native void delete_IdSession(long j);

    public static final native void delete_IdSessionSettings(long j);

    public static final native void delete_IdTemplateDetectionResult(long j);

    public static final native void delete_IdTemplateSegmentationResult(long j);

    public static final native void delete_IdTextField(long j);

    public static final native void delete_IdTextFieldsMapIterator(long j);

    public static final native void delete_IdVideoAuthenticationAnomaly(long j);

    public static final native void delete_IdVideoAuthenticationCallbacks(long j);

    public static final native void delete_IdVideoAuthenticationFrameInfo(long j);

    public static final native void delete_IdVideoAuthenticationInstruction(long j);

    public static final native void delete_IdVideoAuthenticationSession(long j);

    public static final native void delete_IdVideoAuthenticationSessionSettings(long j);

    public static final native void delete_IdVideoAuthenticationTranscript(long j);

    public static final native long new_IdAnimatedField__SWIG_0();

    public static final native long new_IdAnimatedField__SWIG_1(String str, boolean z, double d);

    public static final native long new_IdAnimatedField__SWIG_2(String str, boolean z);

    public static final native long new_IdAnimatedField__SWIG_3(String str);

    public static final native long new_IdAnimatedField__SWIG_4(long j, IdAnimatedField idAnimatedField);

    public static final native long new_IdAnimatedFieldsMapIterator(long j, IdAnimatedFieldsMapIterator idAnimatedFieldsMapIterator);

    public static final native long new_IdBaseFieldInfo__SWIG_0(boolean z, double d);

    public static final native long new_IdBaseFieldInfo__SWIG_1(boolean z);

    public static final native long new_IdBaseFieldInfo__SWIG_2();

    public static final native long new_IdBaseFieldInfo__SWIG_3(long j, IdBaseFieldInfo idBaseFieldInfo);

    public static final native long new_IdCheckField__SWIG_0();

    public static final native long new_IdCheckField__SWIG_1(String str, int i, boolean z, double d);

    public static final native long new_IdCheckField__SWIG_2(String str, int i, boolean z);

    public static final native long new_IdCheckField__SWIG_3(String str, int i);

    public static final native long new_IdCheckField__SWIG_4(long j, IdCheckField idCheckField);

    public static final native long new_IdCheckFieldsMapIterator(long j, IdCheckFieldsMapIterator idCheckFieldsMapIterator);

    public static final native long new_IdFaceFeedback();

    public static final native long new_IdFaceLivenessResult__SWIG_0(double d);

    public static final native long new_IdFaceLivenessResult__SWIG_1();

    public static final native long new_IdFaceLivenessResult__SWIG_2(long j, IdFaceLivenessResult idFaceLivenessResult);

    public static final native long new_IdFaceOslResult__SWIG_0(boolean z, int i);

    public static final native long new_IdFaceOslResult__SWIG_1(boolean z);

    public static final native long new_IdFaceOslResult__SWIG_2();

    public static final native long new_IdFaceOslResult__SWIG_3(long j, IdFaceOslResult idFaceOslResult);

    public static final native long new_IdFaceRectsResult__SWIG_0();

    public static final native long new_IdFaceRectsResult__SWIG_1(long j, IdFaceRectsResult idFaceRectsResult);

    public static final native long new_IdFaceSimilarityResult__SWIG_0(double d, int i);

    public static final native long new_IdFaceSimilarityResult__SWIG_1(double d);

    public static final native long new_IdFaceSimilarityResult__SWIG_2();

    public static final native long new_IdFaceSimilarityResult__SWIG_3(long j, IdFaceSimilarityResult idFaceSimilarityResult);

    public static final native long new_IdFeedback();

    public static final native long new_IdFeedbackContainer__SWIG_0();

    public static final native long new_IdFeedbackContainer__SWIG_1(long j, IdFeedbackContainer idFeedbackContainer);

    public static final native long new_IdImageField__SWIG_0();

    public static final native long new_IdImageField__SWIG_1(String str, long j, Image image, boolean z, double d);

    public static final native long new_IdImageField__SWIG_2(String str, long j, Image image, boolean z);

    public static final native long new_IdImageField__SWIG_3(String str, long j, Image image);

    public static final native long new_IdImageField__SWIG_4(long j, IdImageField idImageField);

    public static final native long new_IdImageFieldsMapIterator(long j, IdImageFieldsMapIterator idImageFieldsMapIterator);

    public static final native long new_IdResult__SWIG_0(boolean z);

    public static final native long new_IdResult__SWIG_1();

    public static final native long new_IdResult__SWIG_2(long j, IdResult idResult);

    public static final native long new_IdTemplateDetectionResult__SWIG_0(String str, long j, Quadrangle quadrangle, boolean z, double d, long j2, Size size);

    public static final native long new_IdTemplateDetectionResult__SWIG_1(String str, long j, Quadrangle quadrangle, boolean z, double d);

    public static final native long new_IdTemplateDetectionResult__SWIG_2(String str, long j, Quadrangle quadrangle, boolean z);

    public static final native long new_IdTemplateDetectionResult__SWIG_3(String str, long j, Quadrangle quadrangle);

    public static final native long new_IdTemplateDetectionResult__SWIG_4(long j, IdTemplateDetectionResult idTemplateDetectionResult);

    public static final native long new_IdTemplateSegmentationResult__SWIG_0(boolean z, double d);

    public static final native long new_IdTemplateSegmentationResult__SWIG_1(boolean z);

    public static final native long new_IdTemplateSegmentationResult__SWIG_2();

    public static final native long new_IdTemplateSegmentationResult__SWIG_3(long j, IdTemplateSegmentationResult idTemplateSegmentationResult);

    public static final native long new_IdTextField__SWIG_0();

    public static final native long new_IdTextField__SWIG_1(String str, long j, OcrString ocrString, boolean z, double d);

    public static final native long new_IdTextField__SWIG_2(String str, long j, OcrString ocrString, boolean z);

    public static final native long new_IdTextField__SWIG_3(String str, long j, OcrString ocrString);

    public static final native long new_IdTextField__SWIG_4(String str, String str2, boolean z, double d);

    public static final native long new_IdTextField__SWIG_5(String str, String str2, boolean z);

    public static final native long new_IdTextField__SWIG_6(String str, String str2);

    public static final native long new_IdTextField__SWIG_7(long j, IdTextField idTextField);

    public static final native long new_IdTextFieldsMapIterator(long j, IdTextFieldsMapIterator idTextFieldsMapIterator);

    public static final native long new_IdVideoAuthenticationAnomaly__SWIG_0(String str, int i, int i2, boolean z, double d);

    public static final native long new_IdVideoAuthenticationAnomaly__SWIG_1(String str, int i, int i2, boolean z);

    public static final native long new_IdVideoAuthenticationAnomaly__SWIG_2(String str, int i, int i2);

    public static final native long new_IdVideoAuthenticationAnomaly__SWIG_3(long j, IdVideoAuthenticationAnomaly idVideoAuthenticationAnomaly);

    public static final native long new_IdVideoAuthenticationCallbacks();

    public static final native long new_IdVideoAuthenticationFrameInfo__SWIG_0();

    public static final native long new_IdVideoAuthenticationFrameInfo__SWIG_1(long j, Image image, int i);

    public static final native long new_IdVideoAuthenticationFrameInfo__SWIG_2(long j, IdVideoAuthenticationFrameInfo idVideoAuthenticationFrameInfo);

    public static final native long new_IdVideoAuthenticationInstruction__SWIG_0(int i, String str);

    public static final native long new_IdVideoAuthenticationInstruction__SWIG_1(long j, IdVideoAuthenticationInstruction idVideoAuthenticationInstruction);

    public static final native long new_IdVideoAuthenticationTranscript__SWIG_0(long j, IdVideoAuthenticationInstruction idVideoAuthenticationInstruction);

    public static final native long new_IdVideoAuthenticationTranscript__SWIG_1(long j, IdVideoAuthenticationTranscript idVideoAuthenticationTranscript);

    private static final native void swig_module_init();

    public static void SwigDirector_IdFaceFeedback_MessageReceived(IdFaceFeedback idFaceFeedback, String str) {
        idFaceFeedback.MessageReceived(str);
    }

    public static void SwigDirector_IdFeedback_FeedbackReceived(IdFeedback idFeedback, long j) {
        idFeedback.FeedbackReceived(new IdFeedbackContainer(j, false));
    }

    public static void SwigDirector_IdFeedback_TemplateDetectionResultReceived(IdFeedback idFeedback, long j) {
        idFeedback.TemplateDetectionResultReceived(new IdTemplateDetectionResult(j, false));
    }

    public static void SwigDirector_IdFeedback_TemplateSegmentationResultReceived(IdFeedback idFeedback, long j) {
        idFeedback.TemplateSegmentationResultReceived(new IdTemplateSegmentationResult(j, false));
    }

    public static void SwigDirector_IdFeedback_ResultReceived(IdFeedback idFeedback, long j) {
        idFeedback.ResultReceived(new IdResult(j, false));
    }

    public static void SwigDirector_IdFeedback_SessionEnded(IdFeedback idFeedback) {
        idFeedback.SessionEnded();
    }

    public static void SwigDirector_IdVideoAuthenticationCallbacks_InstructionReceived(IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks, int i, long j) {
        idVideoAuthenticationCallbacks.InstructionReceived(i, new IdVideoAuthenticationInstruction(j, false));
    }

    public static void SwigDirector_IdVideoAuthenticationCallbacks_AnomalyRegistered(IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks, int i, long j) {
        idVideoAuthenticationCallbacks.AnomalyRegistered(i, new IdVideoAuthenticationAnomaly(j, false));
    }

    /* renamed from: SwigDirector_IdVideoAuthenticationCallbacks_DocumentResultUpdated */
    public static void m507x5f64194b(IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks, long j) {
        idVideoAuthenticationCallbacks.DocumentResultUpdated(new IdResult(j, false));
    }

    /* renamed from: SwigDirector_IdVideoAuthenticationCallbacks_FaceMatchingResultUpdated */
    public static void m509xc44edf4c(IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks, long j) {
        idVideoAuthenticationCallbacks.FaceMatchingResultUpdated(new IdFaceSimilarityResult(j, false));
    }

    /* renamed from: SwigDirector_IdVideoAuthenticationCallbacks_FaceLivenessResultUpdated */
    public static void m508xce9f67c6(IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks, long j) {
        idVideoAuthenticationCallbacks.FaceLivenessResultUpdated(new IdFaceLivenessResult(j, false));
    }

    /* renamed from: SwigDirector_IdVideoAuthenticationCallbacks_AuthenticationStatusUpdated */
    public static void m506x3559f99(IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks, int i) {
        idVideoAuthenticationCallbacks.AuthenticationStatusUpdated(IdCheckStatus.swigToEnum(i));
    }

    public static void SwigDirector_IdVideoAuthenticationCallbacks_GlobalTimeoutReached(IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks) {
        idVideoAuthenticationCallbacks.GlobalTimeoutReached();
    }

    /* renamed from: SwigDirector_IdVideoAuthenticationCallbacks_InstructionTimeoutReached */
    public static void m510x1a8115a7(IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks) {
        idVideoAuthenticationCallbacks.InstructionTimeoutReached();
    }

    public static void SwigDirector_IdVideoAuthenticationCallbacks_SessionEnded(IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks) {
        idVideoAuthenticationCallbacks.SessionEnded();
    }

    public static void SwigDirector_IdVideoAuthenticationCallbacks_MessageReceived(IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks, String str) {
        idVideoAuthenticationCallbacks.MessageReceived(str);
    }

    static {
        swig_module_init();
    }
}
