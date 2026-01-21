.class public Lcom/smartengines/id/jniidengineJNI;
.super Ljava/lang/Object;
.source "jniidengineJNI.java"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 706
    invoke-static {}, Lcom/smartengines/id/jniidengineJNI;->swig_module_init()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final native IdAnimatedField_AppendFrame(JLcom/smartengines/id/IdAnimatedField;JLcom/smartengines/common/Image;)V
.end method

.method public static final native IdAnimatedField_ClearFrames(JLcom/smartengines/id/IdAnimatedField;)V
.end method

.method public static final native IdAnimatedField_GetBaseFieldInfo(JLcom/smartengines/id/IdAnimatedField;)J
.end method

.method public static final native IdAnimatedField_GetFrame(JLcom/smartengines/id/IdAnimatedField;I)J
.end method

.method public static final native IdAnimatedField_GetFramesCount(JLcom/smartengines/id/IdAnimatedField;)I
.end method

.method public static final native IdAnimatedField_GetMutableBaseFieldInfo(JLcom/smartengines/id/IdAnimatedField;)J
.end method

.method public static final native IdAnimatedField_GetName(JLcom/smartengines/id/IdAnimatedField;)Ljava/lang/String;
.end method

.method public static final native IdAnimatedField_SetName(JLcom/smartengines/id/IdAnimatedField;Ljava/lang/String;)V
.end method

.method public static final native IdAnimatedFieldsMapIterator_Advance(JLcom/smartengines/id/IdAnimatedFieldsMapIterator;)V
.end method

.method public static final native IdAnimatedFieldsMapIterator_Equals(JLcom/smartengines/id/IdAnimatedFieldsMapIterator;JLcom/smartengines/id/IdAnimatedFieldsMapIterator;)Z
.end method

.method public static final native IdAnimatedFieldsMapIterator_GetKey(JLcom/smartengines/id/IdAnimatedFieldsMapIterator;)Ljava/lang/String;
.end method

.method public static final native IdAnimatedFieldsMapIterator_GetValue(JLcom/smartengines/id/IdAnimatedFieldsMapIterator;)J
.end method

.method public static final native IdBaseFieldInfo_AttributesBegin(JLcom/smartengines/id/IdBaseFieldInfo;)J
.end method

.method public static final native IdBaseFieldInfo_AttributesEnd(JLcom/smartengines/id/IdBaseFieldInfo;)J
.end method

.method public static final native IdBaseFieldInfo_GetAttribute(JLcom/smartengines/id/IdBaseFieldInfo;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native IdBaseFieldInfo_GetAttributesCount(JLcom/smartengines/id/IdBaseFieldInfo;)I
.end method

.method public static final native IdBaseFieldInfo_GetConfidence(JLcom/smartengines/id/IdBaseFieldInfo;)D
.end method

.method public static final native IdBaseFieldInfo_GetIsAccepted(JLcom/smartengines/id/IdBaseFieldInfo;)Z
.end method

.method public static final native IdBaseFieldInfo_HasAttribute(JLcom/smartengines/id/IdBaseFieldInfo;Ljava/lang/String;)Z
.end method

.method public static final native IdBaseFieldInfo_RemoveAttribute(JLcom/smartengines/id/IdBaseFieldInfo;Ljava/lang/String;)V
.end method

.method public static final native IdBaseFieldInfo_SetAttribute(JLcom/smartengines/id/IdBaseFieldInfo;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static final native IdBaseFieldInfo_SetConfidence(JLcom/smartengines/id/IdBaseFieldInfo;D)V
.end method

.method public static final native IdBaseFieldInfo_SetIsAccepted(JLcom/smartengines/id/IdBaseFieldInfo;Z)V
.end method

.method public static final native IdCheckField_GetBaseFieldInfo(JLcom/smartengines/id/IdCheckField;)J
.end method

.method public static final native IdCheckField_GetMutableBaseFieldInfo(JLcom/smartengines/id/IdCheckField;)J
.end method

.method public static final native IdCheckField_GetName(JLcom/smartengines/id/IdCheckField;)Ljava/lang/String;
.end method

.method public static final native IdCheckField_GetValue(JLcom/smartengines/id/IdCheckField;)I
.end method

.method public static final native IdCheckField_SetName(JLcom/smartengines/id/IdCheckField;Ljava/lang/String;)V
.end method

.method public static final native IdCheckField_SetValue(JLcom/smartengines/id/IdCheckField;I)V
.end method

.method public static final native IdCheckFieldsMapIterator_Advance(JLcom/smartengines/id/IdCheckFieldsMapIterator;)V
.end method

.method public static final native IdCheckFieldsMapIterator_Equals(JLcom/smartengines/id/IdCheckFieldsMapIterator;JLcom/smartengines/id/IdCheckFieldsMapIterator;)Z
.end method

.method public static final native IdCheckFieldsMapIterator_GetKey(JLcom/smartengines/id/IdCheckFieldsMapIterator;)Ljava/lang/String;
.end method

.method public static final native IdCheckFieldsMapIterator_GetValue(JLcom/smartengines/id/IdCheckFieldsMapIterator;)J
.end method

.method public static final native IdDocumentInfo_GetDocumentDescription(JLcom/smartengines/id/IdDocumentInfo;)Ljava/lang/String;
.end method

.method public static final native IdDocumentInfo_GetDocumentFieldsRejectionThreshold(JLcom/smartengines/id/IdDocumentInfo;Ljava/lang/String;)F
.end method

.method public static final native IdDocumentInfo_GetDocumentName(JLcom/smartengines/id/IdDocumentInfo;)Ljava/lang/String;
.end method

.method public static final native IdDocumentInfo_GetDocumentTemplates(JLcom/smartengines/id/IdDocumentInfo;)J
.end method

.method public static final native IdDocumentInfo_GetPradoLinks(JLcom/smartengines/id/IdDocumentInfo;)J
.end method

.method public static final native IdDocumentInfo_HasContactChip(JLcom/smartengines/id/IdDocumentInfo;)I
.end method

.method public static final native IdDocumentInfo_HasRFID(JLcom/smartengines/id/IdDocumentInfo;)I
.end method

.method public static final native IdDocumentInfo_SupportedRFID(JLcom/smartengines/id/IdDocumentInfo;)I
.end method

.method public static final native IdEngine_CreateFaceSessionSettings(JLcom/smartengines/id/IdEngine;)J
.end method

.method public static final native IdEngine_CreateFieldProcessingSessionSettings(JLcom/smartengines/id/IdEngine;)J
.end method

.method public static final native IdEngine_CreateFileAnalysisSessionSettings(JLcom/smartengines/id/IdEngine;)J
.end method

.method public static final native IdEngine_CreateFromEmbeddedBundle__SWIG_0(ZIZ)J
.end method

.method public static final native IdEngine_CreateFromEmbeddedBundle__SWIG_1(ZI)J
.end method

.method public static final native IdEngine_CreateFromEmbeddedBundle__SWIG_2(Z)J
.end method

.method public static final native IdEngine_CreateFromEmbeddedBundle__SWIG_3()J
.end method

.method public static final native IdEngine_CreateSessionSettings(JLcom/smartengines/id/IdEngine;)J
.end method

.method public static final native IdEngine_CreateVideoAuthenticationSessionSettings(JLcom/smartengines/id/IdEngine;)J
.end method

.method public static final native IdEngine_Create__SWIG_0(Ljava/lang/String;ZIZ)J
.end method

.method public static final native IdEngine_Create__SWIG_1(Ljava/lang/String;ZI)J
.end method

.method public static final native IdEngine_Create__SWIG_2(Ljava/lang/String;Z)J
.end method

.method public static final native IdEngine_Create__SWIG_3(Ljava/lang/String;)J
.end method

.method public static final native IdEngine_Create__SWIG_4([BZIZ)J
.end method

.method public static final native IdEngine_Create__SWIG_5([BZI)J
.end method

.method public static final native IdEngine_Create__SWIG_6([BZ)J
.end method

.method public static final native IdEngine_Create__SWIG_7([B)J
.end method

.method public static final native IdEngine_GetVersion()Ljava/lang/String;
.end method

.method public static final native IdEngine_ProcessOneShotLiveness(JLcom/smartengines/id/IdEngine;JLcom/smartengines/common/Image;)J
.end method

.method public static final native IdEngine_SpawnFaceSession__SWIG_0(JLcom/smartengines/id/IdEngine;JLcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;JLcom/smartengines/id/IdFaceFeedback;)J
.end method

.method public static final native IdEngine_SpawnFaceSession__SWIG_1(JLcom/smartengines/id/IdEngine;JLcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native IdEngine_SpawnFieldProcessingSession(JLcom/smartengines/id/IdEngine;JLcom/smartengines/id/IdFieldProcessingSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native IdEngine_SpawnFileAnalysisSession(JLcom/smartengines/id/IdEngine;JLcom/smartengines/id/IdFileAnalysisSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native IdEngine_SpawnSession__SWIG_0(JLcom/smartengines/id/IdEngine;JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;JLcom/smartengines/id/IdFeedback;)J
.end method

.method public static final native IdEngine_SpawnSession__SWIG_1(JLcom/smartengines/id/IdEngine;JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native IdEngine_SpawnVideoAuthenticationSession__SWIG_0(JLcom/smartengines/id/IdEngine;JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;JLcom/smartengines/id/IdVideoAuthenticationCallbacks;JLcom/smartengines/id/IdFeedback;JLcom/smartengines/id/IdFaceFeedback;)J
.end method

.method public static final native IdEngine_SpawnVideoAuthenticationSession__SWIG_1(JLcom/smartengines/id/IdEngine;JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;JLcom/smartengines/id/IdVideoAuthenticationCallbacks;JLcom/smartengines/id/IdFeedback;)J
.end method

.method public static final native IdEngine_SpawnVideoAuthenticationSession__SWIG_2(JLcom/smartengines/id/IdEngine;JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;JLcom/smartengines/id/IdVideoAuthenticationCallbacks;)J
.end method

.method public static final native IdEngine_SpawnVideoAuthenticationSession__SWIG_3(JLcom/smartengines/id/IdEngine;JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native IdFaceFeedback_MessageReceived(JLcom/smartengines/id/IdFaceFeedback;Ljava/lang/String;)V
.end method

.method public static final native IdFaceFeedback_change_ownership(Lcom/smartengines/id/IdFaceFeedback;JZ)V
.end method

.method public static final native IdFaceFeedback_director_connect(Lcom/smartengines/id/IdFaceFeedback;JZZ)V
.end method

.method public static final native IdFaceLivenessResult_GetLivenessEstimation(JLcom/smartengines/id/IdFaceLivenessResult;)D
.end method

.method public static final native IdFaceLivenessResult_GetLivenessInstruction(JLcom/smartengines/id/IdFaceLivenessResult;)Ljava/lang/String;
.end method

.method public static final native IdFaceLivenessResult_SetLivenessEstimation(JLcom/smartengines/id/IdFaceLivenessResult;D)V
.end method

.method public static final native IdFaceLivenessResult_SetLivenessInstruction(JLcom/smartengines/id/IdFaceLivenessResult;Ljava/lang/String;)V
.end method

.method public static final native IdFaceOslResult_GetOSLEstimation(JLcom/smartengines/id/IdFaceOslResult;)Z
.end method

.method public static final native IdFaceOslResult_GetOSLVerdict(JLcom/smartengines/id/IdFaceOslResult;)I
.end method

.method public static final native IdFaceOslResult_SetOSLEstimation(JLcom/smartengines/id/IdFaceOslResult;Z)V
.end method

.method public static final native IdFaceOslResult_SetOSLVerdict(JLcom/smartengines/id/IdFaceOslResult;I)V
.end method

.method public static final native IdFaceRectsResult_AddFaceRect(JLcom/smartengines/id/IdFaceRectsResult;JLcom/smartengines/common/Rectangle;)V
.end method

.method public static final native IdFaceRectsResult_Clear(JLcom/smartengines/id/IdFaceRectsResult;)V
.end method

.method public static final native IdFaceRectsResult_RectanglesBegin(JLcom/smartengines/id/IdFaceRectsResult;)J
.end method

.method public static final native IdFaceRectsResult_RectanglesEnd(JLcom/smartengines/id/IdFaceRectsResult;)J
.end method

.method public static final native IdFaceRectsResult_Size(JLcom/smartengines/id/IdFaceRectsResult;)I
.end method

.method public static final native IdFaceSessionSettings_Clone(JLcom/smartengines/id/IdFaceSessionSettings;)J
.end method

.method public static final native IdFaceSessionSettings_GetLivenessInstructionDescription(JLcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native IdFaceSessionSettings_GetOption(JLcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native IdFaceSessionSettings_GetOptionsCount(JLcom/smartengines/id/IdFaceSessionSettings;)I
.end method

.method public static final native IdFaceSessionSettings_GetSupportedLivenessInstructionsCount(JLcom/smartengines/id/IdFaceSessionSettings;)I
.end method

.method public static final native IdFaceSessionSettings_HasOption(JLcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;)Z
.end method

.method public static final native IdFaceSessionSettings_HasSupportedLivenessInstruction(JLcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;)Z
.end method

.method public static final native IdFaceSessionSettings_OptionsBegin(JLcom/smartengines/id/IdFaceSessionSettings;)J
.end method

.method public static final native IdFaceSessionSettings_OptionsEnd(JLcom/smartengines/id/IdFaceSessionSettings;)J
.end method

.method public static final native IdFaceSessionSettings_RemoveOption(JLcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;)V
.end method

.method public static final native IdFaceSessionSettings_SetOption(JLcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static final native IdFaceSessionSettings_SupportedLivenessInstructionsBegin(JLcom/smartengines/id/IdFaceSessionSettings;)J
.end method

.method public static final native IdFaceSessionSettings_SupportedLivenessInstructionsEnd(JLcom/smartengines/id/IdFaceSessionSettings;)J
.end method

.method public static final native IdFaceSession_Activate(JLcom/smartengines/id/IdFaceSession;Ljava/lang/String;)V
.end method

.method public static final native IdFaceSession_AddFaceImage(JLcom/smartengines/id/IdFaceSession;JLcom/smartengines/common/Image;)V
.end method

.method public static final native IdFaceSession_GetActivationRequest(JLcom/smartengines/id/IdFaceSession;)Ljava/lang/String;
.end method

.method public static final native IdFaceSession_GetAllowedNumberOfFailedINstructions(JLcom/smartengines/id/IdFaceSession;)J
.end method

.method public static final native IdFaceSession_GetInitializerInstructionTime(JLcom/smartengines/id/IdFaceSession;)J
.end method

.method public static final native IdFaceSession_GetInstructionsCount(JLcom/smartengines/id/IdFaceSession;)J
.end method

.method public static final native IdFaceSession_GetLivenessResult(JLcom/smartengines/id/IdFaceSession;)J
.end method

.method public static final native IdFaceSession_GetPassAllInstruction(JLcom/smartengines/id/IdFaceSession;)J
.end method

.method public static final native IdFaceSession_GetPushedImagesCount(JLcom/smartengines/id/IdFaceSession;)J
.end method

.method public static final native IdFaceSession_GetRects(JLcom/smartengines/id/IdFaceSession;JLcom/smartengines/common/Image;)J
.end method

.method public static final native IdFaceSession_GetSimilarity(JLcom/smartengines/id/IdFaceSession;JLcom/smartengines/common/Image;JLcom/smartengines/common/Image;)J
.end method

.method public static final native IdFaceSession_GetSimilarityWith(JLcom/smartengines/id/IdFaceSession;JLcom/smartengines/common/Image;)J
.end method

.method public static final native IdFaceSession_HasAccumulatedImage(JLcom/smartengines/id/IdFaceSession;)Z
.end method

.method public static final native IdFaceSession_IsActivated(JLcom/smartengines/id/IdFaceSession;)Z
.end method

.method public static final native IdFaceSession_Reset(JLcom/smartengines/id/IdFaceSession;)V
.end method

.method public static final native IdFaceSession_SetFaceToMatchWith(JLcom/smartengines/id/IdFaceSession;JLcom/smartengines/common/Image;)V
.end method

.method public static final native IdFaceSimilarityResult_GetSimilarity(JLcom/smartengines/id/IdFaceSimilarityResult;)I
.end method

.method public static final native IdFaceSimilarityResult_GetSimilarityEstimation(JLcom/smartengines/id/IdFaceSimilarityResult;)D
.end method

.method public static final native IdFaceSimilarityResult_GetStatus(JLcom/smartengines/id/IdFaceSimilarityResult;)I
.end method

.method public static final native IdFaceSimilarityResult_SetSimilarityEstimation(JLcom/smartengines/id/IdFaceSimilarityResult;D)V
.end method

.method public static final native IdFaceSimilarityResult_SetStatus(JLcom/smartengines/id/IdFaceSimilarityResult;I)V
.end method

.method public static final native IdFeedbackContainer_GetQuadrangle(JLcom/smartengines/id/IdFeedbackContainer;Ljava/lang/String;)J
.end method

.method public static final native IdFeedbackContainer_GetQuadranglesCount(JLcom/smartengines/id/IdFeedbackContainer;)I
.end method

.method public static final native IdFeedbackContainer_HasQuadrangle(JLcom/smartengines/id/IdFeedbackContainer;Ljava/lang/String;)Z
.end method

.method public static final native IdFeedbackContainer_QuadranglesBegin(JLcom/smartengines/id/IdFeedbackContainer;)J
.end method

.method public static final native IdFeedbackContainer_QuadranglesEnd(JLcom/smartengines/id/IdFeedbackContainer;)J
.end method

.method public static final native IdFeedbackContainer_RemoveQuadrangle(JLcom/smartengines/id/IdFeedbackContainer;Ljava/lang/String;)V
.end method

.method public static final native IdFeedbackContainer_SetQuadrangle(JLcom/smartengines/id/IdFeedbackContainer;Ljava/lang/String;JLcom/smartengines/common/Quadrangle;)V
.end method

.method public static final native IdFeedback_FeedbackReceived(JLcom/smartengines/id/IdFeedback;JLcom/smartengines/id/IdFeedbackContainer;)V
.end method

.method public static final native IdFeedback_ResultReceived(JLcom/smartengines/id/IdFeedback;JLcom/smartengines/id/IdResult;)V
.end method

.method public static final native IdFeedback_SessionEnded(JLcom/smartengines/id/IdFeedback;)V
.end method

.method public static final native IdFeedback_TemplateDetectionResultReceived(JLcom/smartengines/id/IdFeedback;JLcom/smartengines/id/IdTemplateDetectionResult;)V
.end method

.method public static final native IdFeedback_TemplateSegmentationResultReceived(JLcom/smartengines/id/IdFeedback;JLcom/smartengines/id/IdTemplateSegmentationResult;)V
.end method

.method public static final native IdFeedback_change_ownership(Lcom/smartengines/id/IdFeedback;JZ)V
.end method

.method public static final native IdFeedback_director_connect(Lcom/smartengines/id/IdFeedback;JZZ)V
.end method

.method public static final native IdFieldProcessingSessionSettings_Clone(JLcom/smartengines/id/IdFieldProcessingSessionSettings;)J
.end method

.method public static final native IdFieldProcessingSessionSettings_GetCurrentFieldProcessor(JLcom/smartengines/id/IdFieldProcessingSessionSettings;)Ljava/lang/String;
.end method

.method public static final native IdFieldProcessingSessionSettings_GetOption(JLcom/smartengines/id/IdFieldProcessingSessionSettings;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native IdFieldProcessingSessionSettings_GetOptionsCount(JLcom/smartengines/id/IdFieldProcessingSessionSettings;)I
.end method

.method public static final native IdFieldProcessingSessionSettings_GetSupportedFieldProcessorsCount(JLcom/smartengines/id/IdFieldProcessingSessionSettings;)I
.end method

.method public static final native IdFieldProcessingSessionSettings_HasOption(JLcom/smartengines/id/IdFieldProcessingSessionSettings;Ljava/lang/String;)Z
.end method

.method public static final native IdFieldProcessingSessionSettings_HasSupportedFieldProcessor(JLcom/smartengines/id/IdFieldProcessingSessionSettings;Ljava/lang/String;)Z
.end method

.method public static final native IdFieldProcessingSessionSettings_OptionsBegin(JLcom/smartengines/id/IdFieldProcessingSessionSettings;)J
.end method

.method public static final native IdFieldProcessingSessionSettings_OptionsEnd(JLcom/smartengines/id/IdFieldProcessingSessionSettings;)J
.end method

.method public static final native IdFieldProcessingSessionSettings_RemoveOption(JLcom/smartengines/id/IdFieldProcessingSessionSettings;Ljava/lang/String;)V
.end method

.method public static final native IdFieldProcessingSessionSettings_SetCurrentFieldProcessor(JLcom/smartengines/id/IdFieldProcessingSessionSettings;Ljava/lang/String;)V
.end method

.method public static final native IdFieldProcessingSessionSettings_SetOption(JLcom/smartengines/id/IdFieldProcessingSessionSettings;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static final native IdFieldProcessingSessionSettings_SupportedFieldProcessorsBegin(JLcom/smartengines/id/IdFieldProcessingSessionSettings;)J
.end method

.method public static final native IdFieldProcessingSessionSettings_SupportedFieldProcessorsEnd(JLcom/smartengines/id/IdFieldProcessingSessionSettings;)J
.end method

.method public static final native IdFieldProcessingSession_Activate(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)V
.end method

.method public static final native IdFieldProcessingSession_AnimatedFieldsBegin(JLcom/smartengines/id/IdFieldProcessingSession;)J
.end method

.method public static final native IdFieldProcessingSession_AnimatedFieldsEnd(JLcom/smartengines/id/IdFieldProcessingSession;)J
.end method

.method public static final native IdFieldProcessingSession_CheckFieldsBegin(JLcom/smartengines/id/IdFieldProcessingSession;)J
.end method

.method public static final native IdFieldProcessingSession_CheckFieldsEnd(JLcom/smartengines/id/IdFieldProcessingSession;)J
.end method

.method public static final native IdFieldProcessingSession_GetActivationRequest(JLcom/smartengines/id/IdFieldProcessingSession;)Ljava/lang/String;
.end method

.method public static final native IdFieldProcessingSession_GetAnimatedField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)J
.end method

.method public static final native IdFieldProcessingSession_GetAnimatedFieldsCount(JLcom/smartengines/id/IdFieldProcessingSession;)I
.end method

.method public static final native IdFieldProcessingSession_GetCheckField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)J
.end method

.method public static final native IdFieldProcessingSession_GetCheckFieldsCount(JLcom/smartengines/id/IdFieldProcessingSession;)I
.end method

.method public static final native IdFieldProcessingSession_GetImageField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)J
.end method

.method public static final native IdFieldProcessingSession_GetImageFieldsCount(JLcom/smartengines/id/IdFieldProcessingSession;)I
.end method

.method public static final native IdFieldProcessingSession_GetTextField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)J
.end method

.method public static final native IdFieldProcessingSession_GetTextFieldsCount(JLcom/smartengines/id/IdFieldProcessingSession;)I
.end method

.method public static final native IdFieldProcessingSession_HasAnimatedField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)Z
.end method

.method public static final native IdFieldProcessingSession_HasCheckField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)Z
.end method

.method public static final native IdFieldProcessingSession_HasImageField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)Z
.end method

.method public static final native IdFieldProcessingSession_HasTextField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)Z
.end method

.method public static final native IdFieldProcessingSession_ImageFieldsBegin(JLcom/smartengines/id/IdFieldProcessingSession;)J
.end method

.method public static final native IdFieldProcessingSession_ImageFieldsEnd(JLcom/smartengines/id/IdFieldProcessingSession;)J
.end method

.method public static final native IdFieldProcessingSession_IsActivated(JLcom/smartengines/id/IdFieldProcessingSession;)Z
.end method

.method public static final native IdFieldProcessingSession_Process(JLcom/smartengines/id/IdFieldProcessingSession;)V
.end method

.method public static final native IdFieldProcessingSession_RemoveAnimatedField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)V
.end method

.method public static final native IdFieldProcessingSession_RemoveCheckField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)V
.end method

.method public static final native IdFieldProcessingSession_RemoveImageField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)V
.end method

.method public static final native IdFieldProcessingSession_RemoveTextField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;)V
.end method

.method public static final native IdFieldProcessingSession_Reset(JLcom/smartengines/id/IdFieldProcessingSession;)V
.end method

.method public static final native IdFieldProcessingSession_SetAnimatedField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;JLcom/smartengines/id/IdAnimatedField;)V
.end method

.method public static final native IdFieldProcessingSession_SetCheckField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;JLcom/smartengines/id/IdCheckField;)V
.end method

.method public static final native IdFieldProcessingSession_SetImageField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;JLcom/smartengines/id/IdImageField;)V
.end method

.method public static final native IdFieldProcessingSession_SetTextField(JLcom/smartengines/id/IdFieldProcessingSession;Ljava/lang/String;JLcom/smartengines/id/IdTextField;)V
.end method

.method public static final native IdFieldProcessingSession_TextFieldsBegin(JLcom/smartengines/id/IdFieldProcessingSession;)J
.end method

.method public static final native IdFieldProcessingSession_TextFieldsEnd(JLcom/smartengines/id/IdFieldProcessingSession;)J
.end method

.method public static final native IdFileAnalysisSessionSettings_Clone(JLcom/smartengines/id/IdFileAnalysisSessionSettings;)J
.end method

.method public static final native IdFileAnalysisSessionSettings_DisableForensicField(JLcom/smartengines/id/IdFileAnalysisSessionSettings;Ljava/lang/String;)V
.end method

.method public static final native IdFileAnalysisSessionSettings_EnableForensicField(JLcom/smartengines/id/IdFileAnalysisSessionSettings;Ljava/lang/String;)V
.end method

.method public static final native IdFileAnalysisSessionSettings_EnabledForensicFieldsBegin(JLcom/smartengines/id/IdFileAnalysisSessionSettings;)J
.end method

.method public static final native IdFileAnalysisSessionSettings_EnabledForensicFieldsEnd(JLcom/smartengines/id/IdFileAnalysisSessionSettings;)J
.end method

.method public static final native IdFileAnalysisSessionSettings_GetEnabledForensicFieldsCount(JLcom/smartengines/id/IdFileAnalysisSessionSettings;)I
.end method

.method public static final native IdFileAnalysisSessionSettings_GetOption(JLcom/smartengines/id/IdFileAnalysisSessionSettings;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native IdFileAnalysisSessionSettings_GetOptionsCount(JLcom/smartengines/id/IdFileAnalysisSessionSettings;)I
.end method

.method public static final native IdFileAnalysisSessionSettings_GetSupportedForensicFieldsCount(JLcom/smartengines/id/IdFileAnalysisSessionSettings;)I
.end method

.method public static final native IdFileAnalysisSessionSettings_HasEnabledForensicField(JLcom/smartengines/id/IdFileAnalysisSessionSettings;Ljava/lang/String;)Z
.end method

.method public static final native IdFileAnalysisSessionSettings_HasOption(JLcom/smartengines/id/IdFileAnalysisSessionSettings;Ljava/lang/String;)Z
.end method

.method public static final native IdFileAnalysisSessionSettings_HasSupportedForensicField(JLcom/smartengines/id/IdFileAnalysisSessionSettings;Ljava/lang/String;)Z
.end method

.method public static final native IdFileAnalysisSessionSettings_OptionsBegin(JLcom/smartengines/id/IdFileAnalysisSessionSettings;)J
.end method

.method public static final native IdFileAnalysisSessionSettings_OptionsEnd(JLcom/smartengines/id/IdFileAnalysisSessionSettings;)J
.end method

.method public static final native IdFileAnalysisSessionSettings_RemoveOption(JLcom/smartengines/id/IdFileAnalysisSessionSettings;Ljava/lang/String;)V
.end method

.method public static final native IdFileAnalysisSessionSettings_SetOption(JLcom/smartengines/id/IdFileAnalysisSessionSettings;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static final native IdFileAnalysisSessionSettings_SupportedForensicFieldsBegin(JLcom/smartengines/id/IdFileAnalysisSessionSettings;)J
.end method

.method public static final native IdFileAnalysisSessionSettings_SupportedForensicFieldsEnd(JLcom/smartengines/id/IdFileAnalysisSessionSettings;)J
.end method

.method public static final native IdFileAnalysisSession_Activate(JLcom/smartengines/id/IdFileAnalysisSession;Ljava/lang/String;)V
.end method

.method public static final native IdFileAnalysisSession_GetActivationRequest(JLcom/smartengines/id/IdFileAnalysisSession;)Ljava/lang/String;
.end method

.method public static final native IdFileAnalysisSession_GetCurrentResult(JLcom/smartengines/id/IdFileAnalysisSession;)J
.end method

.method public static final native IdFileAnalysisSession_IsActivated(JLcom/smartengines/id/IdFileAnalysisSession;)Z
.end method

.method public static final native IdFileAnalysisSession_Process(JLcom/smartengines/id/IdFileAnalysisSession;JLcom/smartengines/common/Image;)J
.end method

.method public static final native IdFileAnalysisSession_Reset(JLcom/smartengines/id/IdFileAnalysisSession;)V
.end method

.method public static final native IdImageField_GetBaseFieldInfo(JLcom/smartengines/id/IdImageField;)J
.end method

.method public static final native IdImageField_GetMutableBaseFieldInfo(JLcom/smartengines/id/IdImageField;)J
.end method

.method public static final native IdImageField_GetName(JLcom/smartengines/id/IdImageField;)Ljava/lang/String;
.end method

.method public static final native IdImageField_GetValue(JLcom/smartengines/id/IdImageField;)J
.end method

.method public static final native IdImageField_SetName(JLcom/smartengines/id/IdImageField;Ljava/lang/String;)V
.end method

.method public static final native IdImageField_SetValue(JLcom/smartengines/id/IdImageField;JLcom/smartengines/common/Image;)V
.end method

.method public static final native IdImageFieldsMapIterator_Advance(JLcom/smartengines/id/IdImageFieldsMapIterator;)V
.end method

.method public static final native IdImageFieldsMapIterator_Equals(JLcom/smartengines/id/IdImageFieldsMapIterator;JLcom/smartengines/id/IdImageFieldsMapIterator;)Z
.end method

.method public static final native IdImageFieldsMapIterator_GetKey(JLcom/smartengines/id/IdImageFieldsMapIterator;)Ljava/lang/String;
.end method

.method public static final native IdImageFieldsMapIterator_GetValue(JLcom/smartengines/id/IdImageFieldsMapIterator;)J
.end method

.method public static final native IdResult_AnimatedFieldsBegin(JLcom/smartengines/id/IdResult;)J
.end method

.method public static final native IdResult_AnimatedFieldsEnd(JLcom/smartengines/id/IdResult;)J
.end method

.method public static final native IdResult_AppendTemplateDetectionResult(JLcom/smartengines/id/IdResult;JLcom/smartengines/id/IdTemplateDetectionResult;)V
.end method

.method public static final native IdResult_AppendTemplateSegmentationResult(JLcom/smartengines/id/IdResult;JLcom/smartengines/id/IdTemplateSegmentationResult;)V
.end method

.method public static final native IdResult_CheckFieldsBegin(JLcom/smartengines/id/IdResult;)J
.end method

.method public static final native IdResult_CheckFieldsEnd(JLcom/smartengines/id/IdResult;)J
.end method

.method public static final native IdResult_ClearTemplateDetectionResults(JLcom/smartengines/id/IdResult;)V
.end method

.method public static final native IdResult_ClearTemplateSegmentationResults(JLcom/smartengines/id/IdResult;)V
.end method

.method public static final native IdResult_CorrespondingFieldNamesBegin(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J
.end method

.method public static final native IdResult_CorrespondingFieldNamesEnd(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J
.end method

.method public static final native IdResult_CorrespondingRawFieldNamesBegin(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J
.end method

.method public static final native IdResult_CorrespondingRawFieldNamesEnd(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J
.end method

.method public static final native IdResult_ForensicAnimatedFieldsBegin(JLcom/smartengines/id/IdResult;)J
.end method

.method public static final native IdResult_ForensicAnimatedFieldsEnd(JLcom/smartengines/id/IdResult;)J
.end method

.method public static final native IdResult_ForensicCheckFieldsBegin(JLcom/smartengines/id/IdResult;)J
.end method

.method public static final native IdResult_ForensicCheckFieldsEnd(JLcom/smartengines/id/IdResult;)J
.end method

.method public static final native IdResult_ForensicImageFieldsBegin(JLcom/smartengines/id/IdResult;)J
.end method

.method public static final native IdResult_ForensicImageFieldsEnd(JLcom/smartengines/id/IdResult;)J
.end method

.method public static final native IdResult_ForensicTextFieldsBegin(JLcom/smartengines/id/IdResult;)J
.end method

.method public static final native IdResult_ForensicTextFieldsEnd(JLcom/smartengines/id/IdResult;)J
.end method

.method public static final native IdResult_GetAnimatedField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J
.end method

.method public static final native IdResult_GetAnimatedFieldsCount(JLcom/smartengines/id/IdResult;)I
.end method

.method public static final native IdResult_GetCheckField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J
.end method

.method public static final native IdResult_GetCheckFieldsCount(JLcom/smartengines/id/IdResult;)I
.end method

.method public static final native IdResult_GetCorrespondingFieldsCount(JLcom/smartengines/id/IdResult;Ljava/lang/String;)I
.end method

.method public static final native IdResult_GetCorrespondingRawFieldsCount(JLcom/smartengines/id/IdResult;Ljava/lang/String;)I
.end method

.method public static final native IdResult_GetDocumentType(JLcom/smartengines/id/IdResult;)Ljava/lang/String;
.end method

.method public static final native IdResult_GetForensicAnimatedField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J
.end method

.method public static final native IdResult_GetForensicAnimatedFieldsCount(JLcom/smartengines/id/IdResult;)I
.end method

.method public static final native IdResult_GetForensicCheckField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J
.end method

.method public static final native IdResult_GetForensicCheckFieldsCount(JLcom/smartengines/id/IdResult;)I
.end method

.method public static final native IdResult_GetForensicImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J
.end method

.method public static final native IdResult_GetForensicImageFieldsCount(JLcom/smartengines/id/IdResult;)I
.end method

.method public static final native IdResult_GetForensicTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J
.end method

.method public static final native IdResult_GetForensicTextFieldsCount(JLcom/smartengines/id/IdResult;)I
.end method

.method public static final native IdResult_GetImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J
.end method

.method public static final native IdResult_GetImageFieldsCount(JLcom/smartengines/id/IdResult;)I
.end method

.method public static final native IdResult_GetIsTerminal(JLcom/smartengines/id/IdResult;)Z
.end method

.method public static final native IdResult_GetRawImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J
.end method

.method public static final native IdResult_GetRawImageFieldsCount(JLcom/smartengines/id/IdResult;)I
.end method

.method public static final native IdResult_GetRawTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J
.end method

.method public static final native IdResult_GetRawTextFieldsCount(JLcom/smartengines/id/IdResult;)I
.end method

.method public static final native IdResult_GetSeenTemplates(JLcom/smartengines/id/IdResult;)J
.end method

.method public static final native IdResult_GetTemplateDetectionResult(JLcom/smartengines/id/IdResult;I)J
.end method

.method public static final native IdResult_GetTemplateDetectionResultsCount(JLcom/smartengines/id/IdResult;)I
.end method

.method public static final native IdResult_GetTemplateSegmentationResult(JLcom/smartengines/id/IdResult;I)J
.end method

.method public static final native IdResult_GetTemplateSegmentationResultsCount(JLcom/smartengines/id/IdResult;)I
.end method

.method public static final native IdResult_GetTerminalTemplates(JLcom/smartengines/id/IdResult;)J
.end method

.method public static final native IdResult_GetTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)J
.end method

.method public static final native IdResult_GetTextFieldsCount(JLcom/smartengines/id/IdResult;)I
.end method

.method public static final native IdResult_HasAnimatedField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)Z
.end method

.method public static final native IdResult_HasCheckField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)Z
.end method

.method public static final native IdResult_HasCorrespondingField(JLcom/smartengines/id/IdResult;Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public static final native IdResult_HasCorrespondingRawField(JLcom/smartengines/id/IdResult;Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public static final native IdResult_HasForensicAnimatedField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)Z
.end method

.method public static final native IdResult_HasForensicCheckField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)Z
.end method

.method public static final native IdResult_HasForensicImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)Z
.end method

.method public static final native IdResult_HasForensicTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)Z
.end method

.method public static final native IdResult_HasImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)Z
.end method

.method public static final native IdResult_HasRawImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)Z
.end method

.method public static final native IdResult_HasRawTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)Z
.end method

.method public static final native IdResult_HasTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)Z
.end method

.method public static final native IdResult_ImageFieldsBegin(JLcom/smartengines/id/IdResult;)J
.end method

.method public static final native IdResult_ImageFieldsEnd(JLcom/smartengines/id/IdResult;)J
.end method

.method public static final native IdResult_RawImageFieldsBegin(JLcom/smartengines/id/IdResult;)J
.end method

.method public static final native IdResult_RawImageFieldsEnd(JLcom/smartengines/id/IdResult;)J
.end method

.method public static final native IdResult_RawTextFieldsBegin(JLcom/smartengines/id/IdResult;)J
.end method

.method public static final native IdResult_RawTextFieldsEnd(JLcom/smartengines/id/IdResult;)J
.end method

.method public static final native IdResult_RemoveAnimatedField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)V
.end method

.method public static final native IdResult_RemoveCheckField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)V
.end method

.method public static final native IdResult_RemoveForensicAnimatedField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)V
.end method

.method public static final native IdResult_RemoveForensicCheckField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)V
.end method

.method public static final native IdResult_RemoveForensicImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)V
.end method

.method public static final native IdResult_RemoveForensicTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)V
.end method

.method public static final native IdResult_RemoveImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)V
.end method

.method public static final native IdResult_RemoveRawImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)V
.end method

.method public static final native IdResult_RemoveRawTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)V
.end method

.method public static final native IdResult_RemoveTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;)V
.end method

.method public static final native IdResult_SetAnimatedField(JLcom/smartengines/id/IdResult;Ljava/lang/String;JLcom/smartengines/id/IdAnimatedField;)V
.end method

.method public static final native IdResult_SetCheckField(JLcom/smartengines/id/IdResult;Ljava/lang/String;JLcom/smartengines/id/IdCheckField;)V
.end method

.method public static final native IdResult_SetDocumentType(JLcom/smartengines/id/IdResult;Ljava/lang/String;)V
.end method

.method public static final native IdResult_SetForensicAnimatedField(JLcom/smartengines/id/IdResult;Ljava/lang/String;JLcom/smartengines/id/IdAnimatedField;)V
.end method

.method public static final native IdResult_SetForensicCheckField(JLcom/smartengines/id/IdResult;Ljava/lang/String;JLcom/smartengines/id/IdCheckField;)V
.end method

.method public static final native IdResult_SetForensicImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;JLcom/smartengines/id/IdImageField;)V
.end method

.method public static final native IdResult_SetForensicTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;JLcom/smartengines/id/IdTextField;)V
.end method

.method public static final native IdResult_SetImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;JLcom/smartengines/id/IdImageField;)V
.end method

.method public static final native IdResult_SetIsTerminal(JLcom/smartengines/id/IdResult;Z)V
.end method

.method public static final native IdResult_SetRawImageField(JLcom/smartengines/id/IdResult;Ljava/lang/String;JLcom/smartengines/id/IdImageField;)V
.end method

.method public static final native IdResult_SetRawTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;JLcom/smartengines/id/IdTextField;)V
.end method

.method public static final native IdResult_SetTextField(JLcom/smartengines/id/IdResult;Ljava/lang/String;JLcom/smartengines/id/IdTextField;)V
.end method

.method public static final native IdResult_TextFieldsBegin(JLcom/smartengines/id/IdResult;)J
.end method

.method public static final native IdResult_TextFieldsEnd(JLcom/smartengines/id/IdResult;)J
.end method

.method public static final native IdSessionSettings_AddEnabledDocumentTypes(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)V
.end method

.method public static final native IdSessionSettings_Clone(JLcom/smartengines/id/IdSessionSettings;)J
.end method

.method public static final native IdSessionSettings_DisableField(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static final native IdSessionSettings_DisableForensicField(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static final native IdSessionSettings_DisableForensics(JLcom/smartengines/id/IdSessionSettings;)V
.end method

.method public static final native IdSessionSettings_EnableField(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static final native IdSessionSettings_EnableForensicField(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static final native IdSessionSettings_EnableForensics(JLcom/smartengines/id/IdSessionSettings;)V
.end method

.method public static final native IdSessionSettings_EnabledDocumentTypesBegin(JLcom/smartengines/id/IdSessionSettings;)J
.end method

.method public static final native IdSessionSettings_EnabledDocumentTypesEnd(JLcom/smartengines/id/IdSessionSettings;)J
.end method

.method public static final native IdSessionSettings_EnabledFieldsBegin(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native IdSessionSettings_EnabledFieldsEnd(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native IdSessionSettings_EnabledForensicFieldsBegin(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native IdSessionSettings_EnabledForensicFieldsEnd(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native IdSessionSettings_GetCurrentMode(JLcom/smartengines/id/IdSessionSettings;)Ljava/lang/String;
.end method

.method public static final native IdSessionSettings_GetDocumentInfo(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native IdSessionSettings_GetEnabledDocumentTypesCount(JLcom/smartengines/id/IdSessionSettings;)I
.end method

.method public static final native IdSessionSettings_GetEnabledFieldsCount(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)I
.end method

.method public static final native IdSessionSettings_GetEnabledForensicFieldsCount(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)I
.end method

.method public static final native IdSessionSettings_GetFieldType(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public static final native IdSessionSettings_GetForensicFieldType(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public static final native IdSessionSettings_GetInternalEnginesCount(JLcom/smartengines/id/IdSessionSettings;)I
.end method

.method public static final native IdSessionSettings_GetOption(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native IdSessionSettings_GetOptionsCount(JLcom/smartengines/id/IdSessionSettings;)I
.end method

.method public static final native IdSessionSettings_GetSupportedDocumentTypesCount(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)I
.end method

.method public static final native IdSessionSettings_GetSupportedFieldsCount(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)I
.end method

.method public static final native IdSessionSettings_GetSupportedForensicFieldsCount(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)I
.end method

.method public static final native IdSessionSettings_GetSupportedModesCount(JLcom/smartengines/id/IdSessionSettings;)I
.end method

.method public static final native IdSessionSettings_HasEnabledDocumentType(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)Z
.end method

.method public static final native IdSessionSettings_HasEnabledField(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public static final native IdSessionSettings_HasEnabledForensicField(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public static final native IdSessionSettings_HasInternalEngine(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)Z
.end method

.method public static final native IdSessionSettings_HasOption(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)Z
.end method

.method public static final native IdSessionSettings_HasSupportedDocumentType(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public static final native IdSessionSettings_HasSupportedField(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public static final native IdSessionSettings_HasSupportedForensicField(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public static final native IdSessionSettings_HasSupportedMode(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)Z
.end method

.method public static final native IdSessionSettings_InternalEngineNamesBegin(JLcom/smartengines/id/IdSessionSettings;)J
.end method

.method public static final native IdSessionSettings_InternalEngineNamesEnd(JLcom/smartengines/id/IdSessionSettings;)J
.end method

.method public static final native IdSessionSettings_IsForensicsEnabled(JLcom/smartengines/id/IdSessionSettings;)Z
.end method

.method public static final native IdSessionSettings_OptionsBegin(JLcom/smartengines/id/IdSessionSettings;)J
.end method

.method public static final native IdSessionSettings_OptionsEnd(JLcom/smartengines/id/IdSessionSettings;)J
.end method

.method public static final native IdSessionSettings_PermissiblePrefixDocMasksBegin(JLcom/smartengines/id/IdSessionSettings;)J
.end method

.method public static final native IdSessionSettings_PermissiblePrefixDocMasksEnd(JLcom/smartengines/id/IdSessionSettings;)J
.end method

.method public static final native IdSessionSettings_RemoveEnabledDocumentTypes(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)V
.end method

.method public static final native IdSessionSettings_RemoveOption(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)V
.end method

.method public static final native IdSessionSettings_SetCurrentMode(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)V
.end method

.method public static final native IdSessionSettings_SetOption(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static final native IdSessionSettings_SupportedDocumentTypesBegin(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native IdSessionSettings_SupportedDocumentTypesEnd(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native IdSessionSettings_SupportedFieldsBegin(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native IdSessionSettings_SupportedFieldsEnd(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native IdSessionSettings_SupportedForensicFieldsBegin(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native IdSessionSettings_SupportedForensicFieldsEnd(JLcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native IdSessionSettings_SupportedModesBegin(JLcom/smartengines/id/IdSessionSettings;)J
.end method

.method public static final native IdSessionSettings_SupportedModesEnd(JLcom/smartengines/id/IdSessionSettings;)J
.end method

.method public static final native IdSession_Activate(JLcom/smartengines/id/IdSession;Ljava/lang/String;)V
.end method

.method public static final native IdSession_GetActivationRequest(JLcom/smartengines/id/IdSession;)Ljava/lang/String;
.end method

.method public static final native IdSession_GetCurrentResult(JLcom/smartengines/id/IdSession;)J
.end method

.method public static final native IdSession_IsActivated(JLcom/smartengines/id/IdSession;)Z
.end method

.method public static final native IdSession_IsResultTerminal(JLcom/smartengines/id/IdSession;)Z
.end method

.method public static final native IdSession_Process__SWIG_0(JLcom/smartengines/id/IdSession;JLcom/smartengines/common/Image;)J
.end method

.method public static final native IdSession_Process__SWIG_1(JLcom/smartengines/id/IdSession;JLcom/smartengines/common/ByteString;)J
.end method

.method public static final native IdSession_Reset(JLcom/smartengines/id/IdSession;)V
.end method

.method public static final native IdTemplateDetectionResult_AttributesBegin(JLcom/smartengines/id/IdTemplateDetectionResult;)J
.end method

.method public static final native IdTemplateDetectionResult_AttributesEnd(JLcom/smartengines/id/IdTemplateDetectionResult;)J
.end method

.method public static final native IdTemplateDetectionResult_GetAttribute(JLcom/smartengines/id/IdTemplateDetectionResult;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native IdTemplateDetectionResult_GetAttributesCount(JLcom/smartengines/id/IdTemplateDetectionResult;)I
.end method

.method public static final native IdTemplateDetectionResult_GetConfidence(JLcom/smartengines/id/IdTemplateDetectionResult;)D
.end method

.method public static final native IdTemplateDetectionResult_GetIsAccepted(JLcom/smartengines/id/IdTemplateDetectionResult;)Z
.end method

.method public static final native IdTemplateDetectionResult_GetQuadrangle(JLcom/smartengines/id/IdTemplateDetectionResult;)J
.end method

.method public static final native IdTemplateDetectionResult_GetStandardSize(JLcom/smartengines/id/IdTemplateDetectionResult;)J
.end method

.method public static final native IdTemplateDetectionResult_GetTemplateName(JLcom/smartengines/id/IdTemplateDetectionResult;)Ljava/lang/String;
.end method

.method public static final native IdTemplateDetectionResult_HasAttribute(JLcom/smartengines/id/IdTemplateDetectionResult;Ljava/lang/String;)Z
.end method

.method public static final native IdTemplateDetectionResult_RemoveAttribute(JLcom/smartengines/id/IdTemplateDetectionResult;Ljava/lang/String;)V
.end method

.method public static final native IdTemplateDetectionResult_SetAttribute(JLcom/smartengines/id/IdTemplateDetectionResult;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static final native IdTemplateDetectionResult_SetConfidence(JLcom/smartengines/id/IdTemplateDetectionResult;D)V
.end method

.method public static final native IdTemplateDetectionResult_SetIsAccepted(JLcom/smartengines/id/IdTemplateDetectionResult;Z)V
.end method

.method public static final native IdTemplateDetectionResult_SetQuadrangle(JLcom/smartengines/id/IdTemplateDetectionResult;JLcom/smartengines/common/Quadrangle;)V
.end method

.method public static final native IdTemplateDetectionResult_SetStandardSize(JLcom/smartengines/id/IdTemplateDetectionResult;JLcom/smartengines/common/Size;)V
.end method

.method public static final native IdTemplateDetectionResult_SetTemplateName(JLcom/smartengines/id/IdTemplateDetectionResult;Ljava/lang/String;)V
.end method

.method public static final native IdTemplateSegmentationResult_GetConfidence(JLcom/smartengines/id/IdTemplateSegmentationResult;)D
.end method

.method public static final native IdTemplateSegmentationResult_GetIsAccepted(JLcom/smartengines/id/IdTemplateSegmentationResult;)Z
.end method

.method public static final native IdTemplateSegmentationResult_GetRawFieldQuadrangle(JLcom/smartengines/id/IdTemplateSegmentationResult;Ljava/lang/String;)J
.end method

.method public static final native IdTemplateSegmentationResult_GetRawFieldTemplateQuadrangle(JLcom/smartengines/id/IdTemplateSegmentationResult;Ljava/lang/String;)J
.end method

.method public static final native IdTemplateSegmentationResult_GetRawFieldsCount(JLcom/smartengines/id/IdTemplateSegmentationResult;)I
.end method

.method public static final native IdTemplateSegmentationResult_HasRawField(JLcom/smartengines/id/IdTemplateSegmentationResult;Ljava/lang/String;)Z
.end method

.method public static final native IdTemplateSegmentationResult_RawFieldQuadranglesBegin(JLcom/smartengines/id/IdTemplateSegmentationResult;)J
.end method

.method public static final native IdTemplateSegmentationResult_RawFieldQuadranglesEnd(JLcom/smartengines/id/IdTemplateSegmentationResult;)J
.end method

.method public static final native IdTemplateSegmentationResult_RawFieldTemplateQuadranglesBegin(JLcom/smartengines/id/IdTemplateSegmentationResult;)J
.end method

.method public static final native IdTemplateSegmentationResult_RawFieldTemplateQuadranglesEnd(JLcom/smartengines/id/IdTemplateSegmentationResult;)J
.end method

.method public static final native IdTemplateSegmentationResult_RemoveRawField(JLcom/smartengines/id/IdTemplateSegmentationResult;Ljava/lang/String;)V
.end method

.method public static final native IdTemplateSegmentationResult_SetConfidence(JLcom/smartengines/id/IdTemplateSegmentationResult;D)V
.end method

.method public static final native IdTemplateSegmentationResult_SetIsAccepted(JLcom/smartengines/id/IdTemplateSegmentationResult;Z)V
.end method

.method public static final native IdTemplateSegmentationResult_SetRawFieldQuadrangles(JLcom/smartengines/id/IdTemplateSegmentationResult;Ljava/lang/String;JLcom/smartengines/common/Quadrangle;JLcom/smartengines/common/Quadrangle;)V
.end method

.method public static final native IdTextField_GetBaseFieldInfo(JLcom/smartengines/id/IdTextField;)J
.end method

.method public static final native IdTextField_GetMutableBaseFieldInfo(JLcom/smartengines/id/IdTextField;)J
.end method

.method public static final native IdTextField_GetName(JLcom/smartengines/id/IdTextField;)Ljava/lang/String;
.end method

.method public static final native IdTextField_GetValue(JLcom/smartengines/id/IdTextField;)J
.end method

.method public static final native IdTextField_SetName(JLcom/smartengines/id/IdTextField;Ljava/lang/String;)V
.end method

.method public static final native IdTextField_SetValue__SWIG_0(JLcom/smartengines/id/IdTextField;JLcom/smartengines/common/OcrString;)V
.end method

.method public static final native IdTextField_SetValue__SWIG_1(JLcom/smartengines/id/IdTextField;Ljava/lang/String;)V
.end method

.method public static final native IdTextFieldsMapIterator_Advance(JLcom/smartengines/id/IdTextFieldsMapIterator;)V
.end method

.method public static final native IdTextFieldsMapIterator_Equals(JLcom/smartengines/id/IdTextFieldsMapIterator;JLcom/smartengines/id/IdTextFieldsMapIterator;)Z
.end method

.method public static final native IdTextFieldsMapIterator_GetKey(JLcom/smartengines/id/IdTextFieldsMapIterator;)Ljava/lang/String;
.end method

.method public static final native IdTextFieldsMapIterator_GetValue(JLcom/smartengines/id/IdTextFieldsMapIterator;)J
.end method

.method public static final native IdVideoAuthenticationAnomaly_GetBaseFieldInfo(JLcom/smartengines/id/IdVideoAuthenticationAnomaly;)J
.end method

.method public static final native IdVideoAuthenticationAnomaly_GetEndFrame(JLcom/smartengines/id/IdVideoAuthenticationAnomaly;)I
.end method

.method public static final native IdVideoAuthenticationAnomaly_GetMutableBaseFieldInfo(JLcom/smartengines/id/IdVideoAuthenticationAnomaly;)J
.end method

.method public static final native IdVideoAuthenticationAnomaly_GetName(JLcom/smartengines/id/IdVideoAuthenticationAnomaly;)Ljava/lang/String;
.end method

.method public static final native IdVideoAuthenticationAnomaly_GetStartFrame(JLcom/smartengines/id/IdVideoAuthenticationAnomaly;)I
.end method

.method public static final native IdVideoAuthenticationAnomaly_SetEndFrame(JLcom/smartengines/id/IdVideoAuthenticationAnomaly;I)V
.end method

.method public static final native IdVideoAuthenticationAnomaly_SetName(JLcom/smartengines/id/IdVideoAuthenticationAnomaly;Ljava/lang/String;)V
.end method

.method public static final native IdVideoAuthenticationAnomaly_SetStartFrame(JLcom/smartengines/id/IdVideoAuthenticationAnomaly;I)V
.end method

.method public static final native IdVideoAuthenticationCallbacks_AnomalyRegistered(JLcom/smartengines/id/IdVideoAuthenticationCallbacks;IJLcom/smartengines/id/IdVideoAuthenticationAnomaly;)V
.end method

.method public static final native IdVideoAuthenticationCallbacks_AuthenticationStatusUpdated(JLcom/smartengines/id/IdVideoAuthenticationCallbacks;I)V
.end method

.method public static final native IdVideoAuthenticationCallbacks_DocumentResultUpdated(JLcom/smartengines/id/IdVideoAuthenticationCallbacks;JLcom/smartengines/id/IdResult;)V
.end method

.method public static final native IdVideoAuthenticationCallbacks_FaceLivenessResultUpdated(JLcom/smartengines/id/IdVideoAuthenticationCallbacks;JLcom/smartengines/id/IdFaceLivenessResult;)V
.end method

.method public static final native IdVideoAuthenticationCallbacks_FaceMatchingResultUpdated(JLcom/smartengines/id/IdVideoAuthenticationCallbacks;JLcom/smartengines/id/IdFaceSimilarityResult;)V
.end method

.method public static final native IdVideoAuthenticationCallbacks_GlobalTimeoutReached(JLcom/smartengines/id/IdVideoAuthenticationCallbacks;)V
.end method

.method public static final native IdVideoAuthenticationCallbacks_InstructionReceived(JLcom/smartengines/id/IdVideoAuthenticationCallbacks;IJLcom/smartengines/id/IdVideoAuthenticationInstruction;)V
.end method

.method public static final native IdVideoAuthenticationCallbacks_InstructionTimeoutReached(JLcom/smartengines/id/IdVideoAuthenticationCallbacks;)V
.end method

.method public static final native IdVideoAuthenticationCallbacks_MessageReceived(JLcom/smartengines/id/IdVideoAuthenticationCallbacks;Ljava/lang/String;)V
.end method

.method public static final native IdVideoAuthenticationCallbacks_SessionEnded(JLcom/smartengines/id/IdVideoAuthenticationCallbacks;)V
.end method

.method public static final native IdVideoAuthenticationCallbacks_change_ownership(Lcom/smartengines/id/IdVideoAuthenticationCallbacks;JZ)V
.end method

.method public static final native IdVideoAuthenticationCallbacks_director_connect(Lcom/smartengines/id/IdVideoAuthenticationCallbacks;JZZ)V
.end method

.method public static final native IdVideoAuthenticationFrameInfo_GetChannels(JLcom/smartengines/id/IdVideoAuthenticationFrameInfo;)I
.end method

.method public static final native IdVideoAuthenticationFrameInfo_GetHeight(JLcom/smartengines/id/IdVideoAuthenticationFrameInfo;)I
.end method

.method public static final native IdVideoAuthenticationFrameInfo_GetSize(JLcom/smartengines/id/IdVideoAuthenticationFrameInfo;)J
.end method

.method public static final native IdVideoAuthenticationFrameInfo_GetStride(JLcom/smartengines/id/IdVideoAuthenticationFrameInfo;)I
.end method

.method public static final native IdVideoAuthenticationFrameInfo_GetTimestamp(JLcom/smartengines/id/IdVideoAuthenticationFrameInfo;)I
.end method

.method public static final native IdVideoAuthenticationFrameInfo_GetWidth(JLcom/smartengines/id/IdVideoAuthenticationFrameInfo;)I
.end method

.method public static final native IdVideoAuthenticationFrameInfo_SetChannels(JLcom/smartengines/id/IdVideoAuthenticationFrameInfo;I)V
.end method

.method public static final native IdVideoAuthenticationFrameInfo_SetHeight(JLcom/smartengines/id/IdVideoAuthenticationFrameInfo;I)V
.end method

.method public static final native IdVideoAuthenticationFrameInfo_SetSize(JLcom/smartengines/id/IdVideoAuthenticationFrameInfo;JLcom/smartengines/common/Size;)V
.end method

.method public static final native IdVideoAuthenticationFrameInfo_SetStride(JLcom/smartengines/id/IdVideoAuthenticationFrameInfo;I)V
.end method

.method public static final native IdVideoAuthenticationFrameInfo_SetTimestamp(JLcom/smartengines/id/IdVideoAuthenticationFrameInfo;I)V
.end method

.method public static final native IdVideoAuthenticationFrameInfo_SetWidth(JLcom/smartengines/id/IdVideoAuthenticationFrameInfo;I)V
.end method

.method public static final native IdVideoAuthenticationInstruction_GetFrameIndex(JLcom/smartengines/id/IdVideoAuthenticationInstruction;)I
.end method

.method public static final native IdVideoAuthenticationInstruction_GetInstructionCode(JLcom/smartengines/id/IdVideoAuthenticationInstruction;)Ljava/lang/String;
.end method

.method public static final native IdVideoAuthenticationInstruction_GetParameter(JLcom/smartengines/id/IdVideoAuthenticationInstruction;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native IdVideoAuthenticationInstruction_GetParametersCount(JLcom/smartengines/id/IdVideoAuthenticationInstruction;)I
.end method

.method public static final native IdVideoAuthenticationInstruction_HasParameter(JLcom/smartengines/id/IdVideoAuthenticationInstruction;Ljava/lang/String;)Z
.end method

.method public static final native IdVideoAuthenticationInstruction_ParametersBegin(JLcom/smartengines/id/IdVideoAuthenticationInstruction;)J
.end method

.method public static final native IdVideoAuthenticationInstruction_ParametersEnd(JLcom/smartengines/id/IdVideoAuthenticationInstruction;)J
.end method

.method public static final native IdVideoAuthenticationInstruction_RemoveParameter(JLcom/smartengines/id/IdVideoAuthenticationInstruction;Ljava/lang/String;)V
.end method

.method public static final native IdVideoAuthenticationInstruction_SetFrameIndex(JLcom/smartengines/id/IdVideoAuthenticationInstruction;I)V
.end method

.method public static final native IdVideoAuthenticationInstruction_SetInstructionCode(JLcom/smartengines/id/IdVideoAuthenticationInstruction;Ljava/lang/String;)V
.end method

.method public static final native IdVideoAuthenticationInstruction_SetParameter(JLcom/smartengines/id/IdVideoAuthenticationInstruction;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static final native IdVideoAuthenticationSessionSettings_AddEnabledDocumentTypes(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)V
.end method

.method public static final native IdVideoAuthenticationSessionSettings_Clone(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J
.end method

.method public static final native IdVideoAuthenticationSessionSettings_EnabledDocumentTypesBegin(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J
.end method

.method public static final native IdVideoAuthenticationSessionSettings_EnabledDocumentTypesEnd(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J
.end method

.method public static final native IdVideoAuthenticationSessionSettings_GetCurrentMode(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)Ljava/lang/String;
.end method

.method public static final native IdVideoAuthenticationSessionSettings_GetCurrentVideoAuthenticationMode(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)Ljava/lang/String;
.end method

.method public static final native IdVideoAuthenticationSessionSettings_GetDocumentInfo(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native IdVideoAuthenticationSessionSettings_GetEnabledDocumentTypesCount(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)I
.end method

.method public static final native IdVideoAuthenticationSessionSettings_GetInternalEnginesCount(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)I
.end method

.method public static final native IdVideoAuthenticationSessionSettings_GetOption(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native IdVideoAuthenticationSessionSettings_GetOptionsCount(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)I
.end method

.method public static final native IdVideoAuthenticationSessionSettings_GetSupportedDocumentTypesCount(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)I
.end method

.method public static final native IdVideoAuthenticationSessionSettings_GetSupportedModesCount(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)I
.end method

.method public static final native IdVideoAuthenticationSessionSettings_GetVideoAuthenticationModesCount(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)I
.end method

.method public static final native IdVideoAuthenticationSessionSettings_HasEnabledDocumentType(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)Z
.end method

.method public static final native IdVideoAuthenticationSessionSettings_HasInternalEngine(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)Z
.end method

.method public static final native IdVideoAuthenticationSessionSettings_HasOption(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)Z
.end method

.method public static final native IdVideoAuthenticationSessionSettings_HasSupportedDocumentType(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public static final native IdVideoAuthenticationSessionSettings_HasSupportedMode(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)Z
.end method

.method public static final native IdVideoAuthenticationSessionSettings_HasVideoAuthenticationMode(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)Z
.end method

.method public static final native IdVideoAuthenticationSessionSettings_InternalEngineNamesBegin(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J
.end method

.method public static final native IdVideoAuthenticationSessionSettings_InternalEngineNamesEnd(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J
.end method

.method public static final native IdVideoAuthenticationSessionSettings_IsForensicsEnabled(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)Z
.end method

.method public static final native IdVideoAuthenticationSessionSettings_OptionsBegin(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J
.end method

.method public static final native IdVideoAuthenticationSessionSettings_OptionsEnd(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J
.end method

.method public static final native IdVideoAuthenticationSessionSettings_PermissiblePrefixDocMasksBegin(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J
.end method

.method public static final native IdVideoAuthenticationSessionSettings_PermissiblePrefixDocMasksEnd(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J
.end method

.method public static final native IdVideoAuthenticationSessionSettings_RemoveEnabledDocumentTypes(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)V
.end method

.method public static final native IdVideoAuthenticationSessionSettings_RemoveOption(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)V
.end method

.method public static final native IdVideoAuthenticationSessionSettings_SetCurrentMode(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)V
.end method

.method public static final native IdVideoAuthenticationSessionSettings_SetCurrentVideoAuthenticationMode(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)V
.end method

.method public static final native IdVideoAuthenticationSessionSettings_SetOption(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static final native IdVideoAuthenticationSessionSettings_SupportedDocumentTypesBegin(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native IdVideoAuthenticationSessionSettings_SupportedDocumentTypesEnd(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native IdVideoAuthenticationSessionSettings_SupportedModesBegin(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J
.end method

.method public static final native IdVideoAuthenticationSessionSettings_SupportedModesEnd(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J
.end method

.method public static final native IdVideoAuthenticationSessionSettings_VideoAuthenticationModesBegin(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J
.end method

.method public static final native IdVideoAuthenticationSessionSettings_VideoAuthenticationModesEnd(JLcom/smartengines/id/IdVideoAuthenticationSessionSettings;)J
.end method

.method public static final native IdVideoAuthenticationSession_Activate(JLcom/smartengines/id/IdVideoAuthenticationSession;Ljava/lang/String;)V
.end method

.method public static final native IdVideoAuthenticationSession_GetActivationRequest(JLcom/smartengines/id/IdVideoAuthenticationSession;)Ljava/lang/String;
.end method

.method public static final native IdVideoAuthenticationSession_GetAuthenticationStatus(JLcom/smartengines/id/IdVideoAuthenticationSession;)I
.end method

.method public static final native IdVideoAuthenticationSession_GetCurrentInstruction(JLcom/smartengines/id/IdVideoAuthenticationSession;)J
.end method

.method public static final native IdVideoAuthenticationSession_GetDocumentResult(JLcom/smartengines/id/IdVideoAuthenticationSession;)J
.end method

.method public static final native IdVideoAuthenticationSession_GetFaceLivenessResult(JLcom/smartengines/id/IdVideoAuthenticationSession;)J
.end method

.method public static final native IdVideoAuthenticationSession_GetFaceMatchingResult(JLcom/smartengines/id/IdVideoAuthenticationSession;)J
.end method

.method public static final native IdVideoAuthenticationSession_GetTranscript(JLcom/smartengines/id/IdVideoAuthenticationSession;)J
.end method

.method public static final native IdVideoAuthenticationSession_HasDocumentResult(JLcom/smartengines/id/IdVideoAuthenticationSession;)Z
.end method

.method public static final native IdVideoAuthenticationSession_HasFaceLivenessResult(JLcom/smartengines/id/IdVideoAuthenticationSession;)Z
.end method

.method public static final native IdVideoAuthenticationSession_HasFaceMatchingResult(JLcom/smartengines/id/IdVideoAuthenticationSession;)Z
.end method

.method public static final native IdVideoAuthenticationSession_IsActivated(JLcom/smartengines/id/IdVideoAuthenticationSession;)Z
.end method

.method public static final native IdVideoAuthenticationSession_ProcessData(JLcom/smartengines/id/IdVideoAuthenticationSession;JLcom/smartengines/common/ByteString;)V
.end method

.method public static final native IdVideoAuthenticationSession_ProcessFrame(JLcom/smartengines/id/IdVideoAuthenticationSession;JLcom/smartengines/common/Image;)V
.end method

.method public static final native IdVideoAuthenticationSession_Reset(JLcom/smartengines/id/IdVideoAuthenticationSession;)V
.end method

.method public static final native IdVideoAuthenticationSession_Resume(JLcom/smartengines/id/IdVideoAuthenticationSession;)V
.end method

.method public static final native IdVideoAuthenticationSession_Suspend(JLcom/smartengines/id/IdVideoAuthenticationSession;)V
.end method

.method public static final native IdVideoAuthenticationTranscript_AppendAnomaly(JLcom/smartengines/id/IdVideoAuthenticationTranscript;JLcom/smartengines/id/IdVideoAuthenticationAnomaly;)V
.end method

.method public static final native IdVideoAuthenticationTranscript_AppendFrameInfo(JLcom/smartengines/id/IdVideoAuthenticationTranscript;JLcom/smartengines/id/IdVideoAuthenticationFrameInfo;)V
.end method

.method public static final native IdVideoAuthenticationTranscript_AppendInstruction(JLcom/smartengines/id/IdVideoAuthenticationTranscript;JLcom/smartengines/id/IdVideoAuthenticationInstruction;)V
.end method

.method public static final native IdVideoAuthenticationTranscript_GetAnomaliesCount(JLcom/smartengines/id/IdVideoAuthenticationTranscript;)I
.end method

.method public static final native IdVideoAuthenticationTranscript_GetAnomaly(JLcom/smartengines/id/IdVideoAuthenticationTranscript;I)J
.end method

.method public static final native IdVideoAuthenticationTranscript_GetCurrentInstruction(JLcom/smartengines/id/IdVideoAuthenticationTranscript;)J
.end method

.method public static final native IdVideoAuthenticationTranscript_GetFrameInfo(JLcom/smartengines/id/IdVideoAuthenticationTranscript;I)J
.end method

.method public static final native IdVideoAuthenticationTranscript_GetFrameInfosCount(JLcom/smartengines/id/IdVideoAuthenticationTranscript;)I
.end method

.method public static final native IdVideoAuthenticationTranscript_GetInstruction(JLcom/smartengines/id/IdVideoAuthenticationTranscript;I)J
.end method

.method public static final native IdVideoAuthenticationTranscript_GetInstructionsCount(JLcom/smartengines/id/IdVideoAuthenticationTranscript;)I
.end method

.method public static final native IdVideoAuthenticationTranscript_GetMutableAnomaly(JLcom/smartengines/id/IdVideoAuthenticationTranscript;I)J
.end method

.method public static final native IdVideoAuthenticationTranscript_GetMutableCurrentInstruction(JLcom/smartengines/id/IdVideoAuthenticationTranscript;)J
.end method

.method public static final native IdVideoAuthenticationTranscript_GetMutableFrameInfo(JLcom/smartengines/id/IdVideoAuthenticationTranscript;I)J
.end method

.method public static final native IdVideoAuthenticationTranscript_GetMutableInstruction(JLcom/smartengines/id/IdVideoAuthenticationTranscript;I)J
.end method

.method public static final native IdVideoAuthenticationTranscript_ResizeAnomaliesContainer(JLcom/smartengines/id/IdVideoAuthenticationTranscript;I)V
.end method

.method public static final native IdVideoAuthenticationTranscript_ResizeFrameInfosContainer(JLcom/smartengines/id/IdVideoAuthenticationTranscript;I)V
.end method

.method public static final native IdVideoAuthenticationTranscript_ResizeInstructionsContainer(JLcom/smartengines/id/IdVideoAuthenticationTranscript;I)V
.end method

.method public static final native IdVideoAuthenticationTranscript_SetAnomaly(JLcom/smartengines/id/IdVideoAuthenticationTranscript;IJLcom/smartengines/id/IdVideoAuthenticationAnomaly;)V
.end method

.method public static final native IdVideoAuthenticationTranscript_SetCurrentInstruction(JLcom/smartengines/id/IdVideoAuthenticationTranscript;JLcom/smartengines/id/IdVideoAuthenticationInstruction;)V
.end method

.method public static final native IdVideoAuthenticationTranscript_SetFrameInfo(JLcom/smartengines/id/IdVideoAuthenticationTranscript;IJLcom/smartengines/id/IdVideoAuthenticationFrameInfo;)V
.end method

.method public static final native IdVideoAuthenticationTranscript_SetInstruction(JLcom/smartengines/id/IdVideoAuthenticationTranscript;IJLcom/smartengines/id/IdVideoAuthenticationInstruction;)V
.end method

.method public static SwigDirector_IdFaceFeedback_MessageReceived(Lcom/smartengines/id/IdFaceFeedback;Ljava/lang/String;)V
    .locals 0

    .line 656
    invoke-virtual {p0, p1}, Lcom/smartengines/id/IdFaceFeedback;->MessageReceived(Ljava/lang/String;)V

    return-void
.end method

.method public static SwigDirector_IdFeedback_FeedbackReceived(Lcom/smartengines/id/IdFeedback;J)V
    .locals 2

    .line 659
    new-instance v0, Lcom/smartengines/id/IdFeedbackContainer;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/id/IdFeedbackContainer;-><init>(JZ)V

    invoke-virtual {p0, v0}, Lcom/smartengines/id/IdFeedback;->FeedbackReceived(Lcom/smartengines/id/IdFeedbackContainer;)V

    return-void
.end method

.method public static SwigDirector_IdFeedback_ResultReceived(Lcom/smartengines/id/IdFeedback;J)V
    .locals 2

    .line 668
    new-instance v0, Lcom/smartengines/id/IdResult;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/id/IdResult;-><init>(JZ)V

    invoke-virtual {p0, v0}, Lcom/smartengines/id/IdFeedback;->ResultReceived(Lcom/smartengines/id/IdResult;)V

    return-void
.end method

.method public static SwigDirector_IdFeedback_SessionEnded(Lcom/smartengines/id/IdFeedback;)V
    .locals 0

    .line 671
    invoke-virtual {p0}, Lcom/smartengines/id/IdFeedback;->SessionEnded()V

    return-void
.end method

.method public static SwigDirector_IdFeedback_TemplateDetectionResultReceived(Lcom/smartengines/id/IdFeedback;J)V
    .locals 2

    .line 662
    new-instance v0, Lcom/smartengines/id/IdTemplateDetectionResult;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/id/IdTemplateDetectionResult;-><init>(JZ)V

    invoke-virtual {p0, v0}, Lcom/smartengines/id/IdFeedback;->TemplateDetectionResultReceived(Lcom/smartengines/id/IdTemplateDetectionResult;)V

    return-void
.end method

.method public static SwigDirector_IdFeedback_TemplateSegmentationResultReceived(Lcom/smartengines/id/IdFeedback;J)V
    .locals 2

    .line 665
    new-instance v0, Lcom/smartengines/id/IdTemplateSegmentationResult;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/id/IdTemplateSegmentationResult;-><init>(JZ)V

    invoke-virtual {p0, v0}, Lcom/smartengines/id/IdFeedback;->TemplateSegmentationResultReceived(Lcom/smartengines/id/IdTemplateSegmentationResult;)V

    return-void
.end method

.method public static SwigDirector_IdVideoAuthenticationCallbacks_AnomalyRegistered(Lcom/smartengines/id/IdVideoAuthenticationCallbacks;IJ)V
    .locals 2

    .line 677
    new-instance v0, Lcom/smartengines/id/IdVideoAuthenticationAnomaly;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p3, v1}, Lcom/smartengines/id/IdVideoAuthenticationAnomaly;-><init>(JZ)V

    invoke-virtual {p0, p1, v0}, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->AnomalyRegistered(ILcom/smartengines/id/IdVideoAuthenticationAnomaly;)V

    return-void
.end method

.method public static SwigDirector_IdVideoAuthenticationCallbacks_AuthenticationStatusUpdated(Lcom/smartengines/id/IdVideoAuthenticationCallbacks;I)V
    .locals 0

    .line 689
    invoke-static {p1}, Lcom/smartengines/id/IdCheckStatus;->swigToEnum(I)Lcom/smartengines/id/IdCheckStatus;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->AuthenticationStatusUpdated(Lcom/smartengines/id/IdCheckStatus;)V

    return-void
.end method

.method public static SwigDirector_IdVideoAuthenticationCallbacks_DocumentResultUpdated(Lcom/smartengines/id/IdVideoAuthenticationCallbacks;J)V
    .locals 2

    .line 680
    new-instance v0, Lcom/smartengines/id/IdResult;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/id/IdResult;-><init>(JZ)V

    invoke-virtual {p0, v0}, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->DocumentResultUpdated(Lcom/smartengines/id/IdResult;)V

    return-void
.end method

.method public static SwigDirector_IdVideoAuthenticationCallbacks_FaceLivenessResultUpdated(Lcom/smartengines/id/IdVideoAuthenticationCallbacks;J)V
    .locals 2

    .line 686
    new-instance v0, Lcom/smartengines/id/IdFaceLivenessResult;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/id/IdFaceLivenessResult;-><init>(JZ)V

    invoke-virtual {p0, v0}, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->FaceLivenessResultUpdated(Lcom/smartengines/id/IdFaceLivenessResult;)V

    return-void
.end method

.method public static SwigDirector_IdVideoAuthenticationCallbacks_FaceMatchingResultUpdated(Lcom/smartengines/id/IdVideoAuthenticationCallbacks;J)V
    .locals 2

    .line 683
    new-instance v0, Lcom/smartengines/id/IdFaceSimilarityResult;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/id/IdFaceSimilarityResult;-><init>(JZ)V

    invoke-virtual {p0, v0}, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->FaceMatchingResultUpdated(Lcom/smartengines/id/IdFaceSimilarityResult;)V

    return-void
.end method

.method public static SwigDirector_IdVideoAuthenticationCallbacks_GlobalTimeoutReached(Lcom/smartengines/id/IdVideoAuthenticationCallbacks;)V
    .locals 0

    .line 692
    invoke-virtual {p0}, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->GlobalTimeoutReached()V

    return-void
.end method

.method public static SwigDirector_IdVideoAuthenticationCallbacks_InstructionReceived(Lcom/smartengines/id/IdVideoAuthenticationCallbacks;IJ)V
    .locals 2

    .line 674
    new-instance v0, Lcom/smartengines/id/IdVideoAuthenticationInstruction;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p3, v1}, Lcom/smartengines/id/IdVideoAuthenticationInstruction;-><init>(JZ)V

    invoke-virtual {p0, p1, v0}, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->InstructionReceived(ILcom/smartengines/id/IdVideoAuthenticationInstruction;)V

    return-void
.end method

.method public static SwigDirector_IdVideoAuthenticationCallbacks_InstructionTimeoutReached(Lcom/smartengines/id/IdVideoAuthenticationCallbacks;)V
    .locals 0

    .line 695
    invoke-virtual {p0}, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->InstructionTimeoutReached()V

    return-void
.end method

.method public static SwigDirector_IdVideoAuthenticationCallbacks_MessageReceived(Lcom/smartengines/id/IdVideoAuthenticationCallbacks;Ljava/lang/String;)V
    .locals 0

    .line 701
    invoke-virtual {p0, p1}, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->MessageReceived(Ljava/lang/String;)V

    return-void
.end method

.method public static SwigDirector_IdVideoAuthenticationCallbacks_SessionEnded(Lcom/smartengines/id/IdVideoAuthenticationCallbacks;)V
    .locals 0

    .line 698
    invoke-virtual {p0}, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;->SessionEnded()V

    return-void
.end method

.method public static final native delete_IdAnimatedField(J)V
.end method

.method public static final native delete_IdAnimatedFieldsMapIterator(J)V
.end method

.method public static final native delete_IdBaseFieldInfo(J)V
.end method

.method public static final native delete_IdCheckField(J)V
.end method

.method public static final native delete_IdCheckFieldsMapIterator(J)V
.end method

.method public static final native delete_IdDocumentInfo(J)V
.end method

.method public static final native delete_IdEngine(J)V
.end method

.method public static final native delete_IdFaceFeedback(J)V
.end method

.method public static final native delete_IdFaceLivenessResult(J)V
.end method

.method public static final native delete_IdFaceOslResult(J)V
.end method

.method public static final native delete_IdFaceRectsResult(J)V
.end method

.method public static final native delete_IdFaceSession(J)V
.end method

.method public static final native delete_IdFaceSessionSettings(J)V
.end method

.method public static final native delete_IdFaceSimilarityResult(J)V
.end method

.method public static final native delete_IdFeedback(J)V
.end method

.method public static final native delete_IdFeedbackContainer(J)V
.end method

.method public static final native delete_IdFieldProcessingSession(J)V
.end method

.method public static final native delete_IdFieldProcessingSessionSettings(J)V
.end method

.method public static final native delete_IdFileAnalysisSession(J)V
.end method

.method public static final native delete_IdFileAnalysisSessionSettings(J)V
.end method

.method public static final native delete_IdImageField(J)V
.end method

.method public static final native delete_IdImageFieldsMapIterator(J)V
.end method

.method public static final native delete_IdResult(J)V
.end method

.method public static final native delete_IdSession(J)V
.end method

.method public static final native delete_IdSessionSettings(J)V
.end method

.method public static final native delete_IdTemplateDetectionResult(J)V
.end method

.method public static final native delete_IdTemplateSegmentationResult(J)V
.end method

.method public static final native delete_IdTextField(J)V
.end method

.method public static final native delete_IdTextFieldsMapIterator(J)V
.end method

.method public static final native delete_IdVideoAuthenticationAnomaly(J)V
.end method

.method public static final native delete_IdVideoAuthenticationCallbacks(J)V
.end method

.method public static final native delete_IdVideoAuthenticationFrameInfo(J)V
.end method

.method public static final native delete_IdVideoAuthenticationInstruction(J)V
.end method

.method public static final native delete_IdVideoAuthenticationSession(J)V
.end method

.method public static final native delete_IdVideoAuthenticationSessionSettings(J)V
.end method

.method public static final native delete_IdVideoAuthenticationTranscript(J)V
.end method

.method public static final native new_IdAnimatedField__SWIG_0()J
.end method

.method public static final native new_IdAnimatedField__SWIG_1(Ljava/lang/String;ZD)J
.end method

.method public static final native new_IdAnimatedField__SWIG_2(Ljava/lang/String;Z)J
.end method

.method public static final native new_IdAnimatedField__SWIG_3(Ljava/lang/String;)J
.end method

.method public static final native new_IdAnimatedField__SWIG_4(JLcom/smartengines/id/IdAnimatedField;)J
.end method

.method public static final native new_IdAnimatedFieldsMapIterator(JLcom/smartengines/id/IdAnimatedFieldsMapIterator;)J
.end method

.method public static final native new_IdBaseFieldInfo__SWIG_0(ZD)J
.end method

.method public static final native new_IdBaseFieldInfo__SWIG_1(Z)J
.end method

.method public static final native new_IdBaseFieldInfo__SWIG_2()J
.end method

.method public static final native new_IdBaseFieldInfo__SWIG_3(JLcom/smartengines/id/IdBaseFieldInfo;)J
.end method

.method public static final native new_IdCheckField__SWIG_0()J
.end method

.method public static final native new_IdCheckField__SWIG_1(Ljava/lang/String;IZD)J
.end method

.method public static final native new_IdCheckField__SWIG_2(Ljava/lang/String;IZ)J
.end method

.method public static final native new_IdCheckField__SWIG_3(Ljava/lang/String;I)J
.end method

.method public static final native new_IdCheckField__SWIG_4(JLcom/smartengines/id/IdCheckField;)J
.end method

.method public static final native new_IdCheckFieldsMapIterator(JLcom/smartengines/id/IdCheckFieldsMapIterator;)J
.end method

.method public static final native new_IdFaceFeedback()J
.end method

.method public static final native new_IdFaceLivenessResult__SWIG_0(D)J
.end method

.method public static final native new_IdFaceLivenessResult__SWIG_1()J
.end method

.method public static final native new_IdFaceLivenessResult__SWIG_2(JLcom/smartengines/id/IdFaceLivenessResult;)J
.end method

.method public static final native new_IdFaceOslResult__SWIG_0(ZI)J
.end method

.method public static final native new_IdFaceOslResult__SWIG_1(Z)J
.end method

.method public static final native new_IdFaceOslResult__SWIG_2()J
.end method

.method public static final native new_IdFaceOslResult__SWIG_3(JLcom/smartengines/id/IdFaceOslResult;)J
.end method

.method public static final native new_IdFaceRectsResult__SWIG_0()J
.end method

.method public static final native new_IdFaceRectsResult__SWIG_1(JLcom/smartengines/id/IdFaceRectsResult;)J
.end method

.method public static final native new_IdFaceSimilarityResult__SWIG_0(DI)J
.end method

.method public static final native new_IdFaceSimilarityResult__SWIG_1(D)J
.end method

.method public static final native new_IdFaceSimilarityResult__SWIG_2()J
.end method

.method public static final native new_IdFaceSimilarityResult__SWIG_3(JLcom/smartengines/id/IdFaceSimilarityResult;)J
.end method

.method public static final native new_IdFeedback()J
.end method

.method public static final native new_IdFeedbackContainer__SWIG_0()J
.end method

.method public static final native new_IdFeedbackContainer__SWIG_1(JLcom/smartengines/id/IdFeedbackContainer;)J
.end method

.method public static final native new_IdImageField__SWIG_0()J
.end method

.method public static final native new_IdImageField__SWIG_1(Ljava/lang/String;JLcom/smartengines/common/Image;ZD)J
.end method

.method public static final native new_IdImageField__SWIG_2(Ljava/lang/String;JLcom/smartengines/common/Image;Z)J
.end method

.method public static final native new_IdImageField__SWIG_3(Ljava/lang/String;JLcom/smartengines/common/Image;)J
.end method

.method public static final native new_IdImageField__SWIG_4(JLcom/smartengines/id/IdImageField;)J
.end method

.method public static final native new_IdImageFieldsMapIterator(JLcom/smartengines/id/IdImageFieldsMapIterator;)J
.end method

.method public static final native new_IdResult__SWIG_0(Z)J
.end method

.method public static final native new_IdResult__SWIG_1()J
.end method

.method public static final native new_IdResult__SWIG_2(JLcom/smartengines/id/IdResult;)J
.end method

.method public static final native new_IdTemplateDetectionResult__SWIG_0(Ljava/lang/String;JLcom/smartengines/common/Quadrangle;ZDJLcom/smartengines/common/Size;)J
.end method

.method public static final native new_IdTemplateDetectionResult__SWIG_1(Ljava/lang/String;JLcom/smartengines/common/Quadrangle;ZD)J
.end method

.method public static final native new_IdTemplateDetectionResult__SWIG_2(Ljava/lang/String;JLcom/smartengines/common/Quadrangle;Z)J
.end method

.method public static final native new_IdTemplateDetectionResult__SWIG_3(Ljava/lang/String;JLcom/smartengines/common/Quadrangle;)J
.end method

.method public static final native new_IdTemplateDetectionResult__SWIG_4(JLcom/smartengines/id/IdTemplateDetectionResult;)J
.end method

.method public static final native new_IdTemplateSegmentationResult__SWIG_0(ZD)J
.end method

.method public static final native new_IdTemplateSegmentationResult__SWIG_1(Z)J
.end method

.method public static final native new_IdTemplateSegmentationResult__SWIG_2()J
.end method

.method public static final native new_IdTemplateSegmentationResult__SWIG_3(JLcom/smartengines/id/IdTemplateSegmentationResult;)J
.end method

.method public static final native new_IdTextField__SWIG_0()J
.end method

.method public static final native new_IdTextField__SWIG_1(Ljava/lang/String;JLcom/smartengines/common/OcrString;ZD)J
.end method

.method public static final native new_IdTextField__SWIG_2(Ljava/lang/String;JLcom/smartengines/common/OcrString;Z)J
.end method

.method public static final native new_IdTextField__SWIG_3(Ljava/lang/String;JLcom/smartengines/common/OcrString;)J
.end method

.method public static final native new_IdTextField__SWIG_4(Ljava/lang/String;Ljava/lang/String;ZD)J
.end method

.method public static final native new_IdTextField__SWIG_5(Ljava/lang/String;Ljava/lang/String;Z)J
.end method

.method public static final native new_IdTextField__SWIG_6(Ljava/lang/String;Ljava/lang/String;)J
.end method

.method public static final native new_IdTextField__SWIG_7(JLcom/smartengines/id/IdTextField;)J
.end method

.method public static final native new_IdTextFieldsMapIterator(JLcom/smartengines/id/IdTextFieldsMapIterator;)J
.end method

.method public static final native new_IdVideoAuthenticationAnomaly__SWIG_0(Ljava/lang/String;IIZD)J
.end method

.method public static final native new_IdVideoAuthenticationAnomaly__SWIG_1(Ljava/lang/String;IIZ)J
.end method

.method public static final native new_IdVideoAuthenticationAnomaly__SWIG_2(Ljava/lang/String;II)J
.end method

.method public static final native new_IdVideoAuthenticationAnomaly__SWIG_3(JLcom/smartengines/id/IdVideoAuthenticationAnomaly;)J
.end method

.method public static final native new_IdVideoAuthenticationCallbacks()J
.end method

.method public static final native new_IdVideoAuthenticationFrameInfo__SWIG_0()J
.end method

.method public static final native new_IdVideoAuthenticationFrameInfo__SWIG_1(JLcom/smartengines/common/Image;I)J
.end method

.method public static final native new_IdVideoAuthenticationFrameInfo__SWIG_2(JLcom/smartengines/id/IdVideoAuthenticationFrameInfo;)J
.end method

.method public static final native new_IdVideoAuthenticationInstruction__SWIG_0(ILjava/lang/String;)J
.end method

.method public static final native new_IdVideoAuthenticationInstruction__SWIG_1(JLcom/smartengines/id/IdVideoAuthenticationInstruction;)J
.end method

.method public static final native new_IdVideoAuthenticationTranscript__SWIG_0(JLcom/smartengines/id/IdVideoAuthenticationInstruction;)J
.end method

.method public static final native new_IdVideoAuthenticationTranscript__SWIG_1(JLcom/smartengines/id/IdVideoAuthenticationTranscript;)J
.end method

.method private static final native swig_module_init()V
.end method
