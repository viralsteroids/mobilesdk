.class public Lcom/smartengines/text/jnitextengineJNI;
.super Ljava/lang/Object;
.source "jnitextengineJNI.java"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 115
    invoke-static {}, Lcom/smartengines/text/jnitextengineJNI;->swig_module_init()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static SwigDirector_TextFeedback_FeedbackReceived(Lcom/smartengines/text/TextFeedback;J)V
    .locals 2

    .line 104
    new-instance v0, Lcom/smartengines/text/TextFeedbackContainer;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/text/TextFeedbackContainer;-><init>(JZ)V

    invoke-virtual {p0, v0}, Lcom/smartengines/text/TextFeedback;->FeedbackReceived(Lcom/smartengines/text/TextFeedbackContainer;)V

    return-void
.end method

.method public static SwigDirector_TextFeedback_PagesLocalizationFeedbackReceived(Lcom/smartengines/text/TextFeedback;J)V
    .locals 2

    .line 107
    new-instance v0, Lcom/smartengines/text/TextPagesFeedbackContainer;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/text/TextPagesFeedbackContainer;-><init>(JZ)V

    invoke-virtual {p0, v0}, Lcom/smartengines/text/TextFeedback;->PagesLocalizationFeedbackReceived(Lcom/smartengines/text/TextPagesFeedbackContainer;)V

    return-void
.end method

.method public static SwigDirector_TextFeedback_TextLocalizationFeedbackReceived(Lcom/smartengines/text/TextFeedback;J)V
    .locals 2

    .line 110
    new-instance v0, Lcom/smartengines/text/TextLocalizationFeedbackContainer;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/smartengines/text/TextLocalizationFeedbackContainer;-><init>(JZ)V

    invoke-virtual {p0, v0}, Lcom/smartengines/text/TextFeedback;->TextLocalizationFeedbackReceived(Lcom/smartengines/text/TextLocalizationFeedbackContainer;)V

    return-void
.end method

.method public static final native TextChunkFeedback_GetQuadrangle(JLcom/smartengines/text/TextChunkFeedback;)J
.end method

.method public static final native TextChunk_AttributesBegin(JLcom/smartengines/text/TextChunk;)J
.end method

.method public static final native TextChunk_AttributesEnd(JLcom/smartengines/text/TextChunk;)J
.end method

.method public static final native TextChunk_GetAcceptFlag(JLcom/smartengines/text/TextChunk;)Z
.end method

.method public static final native TextChunk_GetAttribute(JLcom/smartengines/text/TextChunk;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native TextChunk_GetAttributesCount(JLcom/smartengines/text/TextChunk;)I
.end method

.method public static final native TextChunk_GetConfidence(JLcom/smartengines/text/TextChunk;)D
.end method

.method public static final native TextChunk_GetFilteredOcrString(JLcom/smartengines/text/TextChunk;Ljava/lang/String;)J
.end method

.method public static final native TextChunk_GetGeometry(JLcom/smartengines/text/TextChunk;)J
.end method

.method public static final native TextChunk_GetMutableOcrString(JLcom/smartengines/text/TextChunk;)J
.end method

.method public static final native TextChunk_GetOcrString(JLcom/smartengines/text/TextChunk;)J
.end method

.method public static final native TextChunk_HasAttribute(JLcom/smartengines/text/TextChunk;Ljava/lang/String;)Z
.end method

.method public static final native TextEngine_CreateFromEmbeddedBundle__SWIG_0(Z)J
.end method

.method public static final native TextEngine_CreateFromEmbeddedBundle__SWIG_1()J
.end method

.method public static final native TextEngine_CreateSessionSettings(JLcom/smartengines/text/TextEngine;)J
.end method

.method public static final native TextEngine_Create__SWIG_0(Ljava/lang/String;Z)J
.end method

.method public static final native TextEngine_Create__SWIG_1(Ljava/lang/String;)J
.end method

.method public static final native TextEngine_Create__SWIG_2([BZ)J
.end method

.method public static final native TextEngine_Create__SWIG_3([B)J
.end method

.method public static final native TextEngine_GetVersion()Ljava/lang/String;
.end method

.method public static final native TextEngine_SpawnSession__SWIG_0(JLcom/smartengines/text/TextEngine;JLcom/smartengines/text/TextSessionSettings;Ljava/lang/String;JLcom/smartengines/text/TextFeedback;)J
.end method

.method public static final native TextEngine_SpawnSession__SWIG_1(JLcom/smartengines/text/TextEngine;JLcom/smartengines/text/TextSessionSettings;Ljava/lang/String;)J
.end method

.method public static final native TextFeedback_FeedbackReceived(JLcom/smartengines/text/TextFeedback;JLcom/smartengines/text/TextFeedbackContainer;)V
.end method

.method public static final native TextFeedback_PagesLocalizationFeedbackReceived(JLcom/smartengines/text/TextFeedback;JLcom/smartengines/text/TextPagesFeedbackContainer;)V
.end method

.method public static final native TextFeedback_TextLocalizationFeedbackReceived(JLcom/smartengines/text/TextFeedback;JLcom/smartengines/text/TextLocalizationFeedbackContainer;)V
.end method

.method public static final native TextFeedback_change_ownership(Lcom/smartengines/text/TextFeedback;JZ)V
.end method

.method public static final native TextFeedback_director_connect(Lcom/smartengines/text/TextFeedback;JZZ)V
.end method

.method public static final native TextIterator_Advance(JLcom/smartengines/text/TextIterator;)V
.end method

.method public static final native TextIterator_Equals(JLcom/smartengines/text/TextIterator;JLcom/smartengines/text/TextIterator;)Z
.end method

.method public static final native TextIterator_Finished(JLcom/smartengines/text/TextIterator;)Z
.end method

.method public static final native TextIterator_GetMutableTextChunk(JLcom/smartengines/text/TextIterator;)J
.end method

.method public static final native TextIterator_GetMutableTextChunkPtr(JLcom/smartengines/text/TextIterator;)J
.end method

.method public static final native TextIterator_GetTextChunk(JLcom/smartengines/text/TextIterator;)J
.end method

.method public static final native TextIterator_GetTextChunkPtr(JLcom/smartengines/text/TextIterator;)J
.end method

.method public static final native TextLocalizationFeedbackContainer_GetTextChunkFeedback(JLcom/smartengines/text/TextLocalizationFeedbackContainer;I)J
.end method

.method public static final native TextLocalizationFeedbackContainer_GetTextChunksCount(JLcom/smartengines/text/TextLocalizationFeedbackContainer;)I
.end method

.method public static final native TextPageFeedback_GetQuadrangle(JLcom/smartengines/text/TextPageFeedback;)J
.end method

.method public static final native TextPageFeedback_IsPageRejected(JLcom/smartengines/text/TextPageFeedback;)Z
.end method

.method public static final native TextPagesFeedbackContainer_GetPageCount(JLcom/smartengines/text/TextPagesFeedbackContainer;)I
.end method

.method public static final native TextPagesFeedbackContainer_GetPageFeedback(JLcom/smartengines/text/TextPagesFeedbackContainer;I)J
.end method

.method public static final native TextResult_GetCurrentScene(JLcom/smartengines/text/TextResult;)J
.end method

.method public static final native TextScene_CreateIterator__SWIG_0(JLcom/smartengines/text/TextScene;Ljava/lang/String;)J
.end method

.method public static final native TextScene_CreateIterator__SWIG_1(JLcom/smartengines/text/TextScene;)J
.end method

.method public static final native TextScene_GetPageImage(JLcom/smartengines/text/TextScene;)J
.end method

.method public static final native TextScene_IsGarbage(JLcom/smartengines/text/TextScene;)Z
.end method

.method public static final native TextSessionSettings_AddEnabledLanguages(JLcom/smartengines/text/TextSessionSettings;Ljava/lang/String;)V
.end method

.method public static final native TextSessionSettings_Clone(JLcom/smartengines/text/TextSessionSettings;)J
.end method

.method public static final native TextSessionSettings_DisableAllLanguages(JLcom/smartengines/text/TextSessionSettings;)V
.end method

.method public static final native TextSessionSettings_DisableLanguages(JLcom/smartengines/text/TextSessionSettings;Ljava/lang/String;)V
.end method

.method public static final native TextSessionSettings_EnabledLanguagesBegin(JLcom/smartengines/text/TextSessionSettings;)J
.end method

.method public static final native TextSessionSettings_EnabledLanguagesEnd(JLcom/smartengines/text/TextSessionSettings;)J
.end method

.method public static final native TextSessionSettings_GetEnabledLanguagesCount(JLcom/smartengines/text/TextSessionSettings;)I
.end method

.method public static final native TextSessionSettings_GetLanguageAlphabet(JLcom/smartengines/text/TextSessionSettings;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native TextSessionSettings_GetOption(JLcom/smartengines/text/TextSessionSettings;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static final native TextSessionSettings_GetOptionsCount(JLcom/smartengines/text/TextSessionSettings;)I
.end method

.method public static final native TextSessionSettings_GetSupportedLanguagesCount(JLcom/smartengines/text/TextSessionSettings;)I
.end method

.method public static final native TextSessionSettings_GetSupportedTextIteratorsCount(JLcom/smartengines/text/TextSessionSettings;)I
.end method

.method public static final native TextSessionSettings_HasOption(JLcom/smartengines/text/TextSessionSettings;Ljava/lang/String;)Z
.end method

.method public static final native TextSessionSettings_OptionsBegin(JLcom/smartengines/text/TextSessionSettings;)J
.end method

.method public static final native TextSessionSettings_OptionsEnd(JLcom/smartengines/text/TextSessionSettings;)J
.end method

.method public static final native TextSessionSettings_RemoveOption(JLcom/smartengines/text/TextSessionSettings;Ljava/lang/String;)V
.end method

.method public static final native TextSessionSettings_SetOption(JLcom/smartengines/text/TextSessionSettings;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static final native TextSessionSettings_SupportedLanguagesBegin(JLcom/smartengines/text/TextSessionSettings;)J
.end method

.method public static final native TextSessionSettings_SupportedLanguagesEnd(JLcom/smartengines/text/TextSessionSettings;)J
.end method

.method public static final native TextSessionSettings_SupportedTextIteratorsBegin(JLcom/smartengines/text/TextSessionSettings;)J
.end method

.method public static final native TextSessionSettings_SupportedTextIteratorsEnd(JLcom/smartengines/text/TextSessionSettings;)J
.end method

.method public static final native TextSession_Activate(JLcom/smartengines/text/TextSession;Ljava/lang/String;)V
.end method

.method public static final native TextSession_GetActivationRequest(JLcom/smartengines/text/TextSession;)Ljava/lang/String;
.end method

.method public static final native TextSession_GetCurrentResult(JLcom/smartengines/text/TextSession;)J
.end method

.method public static final native TextSession_IsActivated(JLcom/smartengines/text/TextSession;)Z
.end method

.method public static final native TextSession_ProcessImage(JLcom/smartengines/text/TextSession;JLcom/smartengines/common/Image;)V
.end method

.method public static final native TextSession_Reset(JLcom/smartengines/text/TextSession;)V
.end method

.method public static final native delete_TextChunk(J)V
.end method

.method public static final native delete_TextChunkFeedback(J)V
.end method

.method public static final native delete_TextEngine(J)V
.end method

.method public static final native delete_TextFeedback(J)V
.end method

.method public static final native delete_TextFeedbackContainer(J)V
.end method

.method public static final native delete_TextIterator(J)V
.end method

.method public static final native delete_TextLocalizationFeedbackContainer(J)V
.end method

.method public static final native delete_TextPageFeedback(J)V
.end method

.method public static final native delete_TextPagesFeedbackContainer(J)V
.end method

.method public static final native delete_TextResult(J)V
.end method

.method public static final native delete_TextScene(J)V
.end method

.method public static final native delete_TextSession(J)V
.end method

.method public static final native delete_TextSessionSettings(J)V
.end method

.method public static final native new_TextFeedback()J
.end method

.method public static final native new_TextFeedbackContainer()J
.end method

.method public static final native new_TextIterator(JLcom/smartengines/text/TextIterator;)J
.end method

.method private static final native swig_module_init()V
.end method
