package com.smartengines.text;

import com.smartengines.common.Image;

/* loaded from: classes3.dex */
public class jnitextengineJNI {
    public static final native long TextChunkFeedback_GetQuadrangle(long j, TextChunkFeedback textChunkFeedback);

    public static final native long TextChunk_AttributesBegin(long j, TextChunk textChunk);

    public static final native long TextChunk_AttributesEnd(long j, TextChunk textChunk);

    public static final native boolean TextChunk_GetAcceptFlag(long j, TextChunk textChunk);

    public static final native String TextChunk_GetAttribute(long j, TextChunk textChunk, String str);

    public static final native int TextChunk_GetAttributesCount(long j, TextChunk textChunk);

    public static final native double TextChunk_GetConfidence(long j, TextChunk textChunk);

    public static final native long TextChunk_GetFilteredOcrString(long j, TextChunk textChunk, String str);

    public static final native long TextChunk_GetGeometry(long j, TextChunk textChunk);

    public static final native long TextChunk_GetMutableOcrString(long j, TextChunk textChunk);

    public static final native long TextChunk_GetOcrString(long j, TextChunk textChunk);

    public static final native boolean TextChunk_HasAttribute(long j, TextChunk textChunk, String str);

    public static final native long TextEngine_CreateFromEmbeddedBundle__SWIG_0(boolean z);

    public static final native long TextEngine_CreateFromEmbeddedBundle__SWIG_1();

    public static final native long TextEngine_CreateSessionSettings(long j, TextEngine textEngine);

    public static final native long TextEngine_Create__SWIG_0(String str, boolean z);

    public static final native long TextEngine_Create__SWIG_1(String str);

    public static final native long TextEngine_Create__SWIG_2(byte[] bArr, boolean z);

    public static final native long TextEngine_Create__SWIG_3(byte[] bArr);

    public static final native String TextEngine_GetVersion();

    public static final native long TextEngine_SpawnSession__SWIG_0(long j, TextEngine textEngine, long j2, TextSessionSettings textSessionSettings, String str, long j3, TextFeedback textFeedback);

    public static final native long TextEngine_SpawnSession__SWIG_1(long j, TextEngine textEngine, long j2, TextSessionSettings textSessionSettings, String str);

    public static final native void TextFeedback_FeedbackReceived(long j, TextFeedback textFeedback, long j2, TextFeedbackContainer textFeedbackContainer);

    public static final native void TextFeedback_PagesLocalizationFeedbackReceived(long j, TextFeedback textFeedback, long j2, TextPagesFeedbackContainer textPagesFeedbackContainer);

    public static final native void TextFeedback_TextLocalizationFeedbackReceived(long j, TextFeedback textFeedback, long j2, TextLocalizationFeedbackContainer textLocalizationFeedbackContainer);

    public static final native void TextFeedback_change_ownership(TextFeedback textFeedback, long j, boolean z);

    public static final native void TextFeedback_director_connect(TextFeedback textFeedback, long j, boolean z, boolean z2);

    public static final native void TextIterator_Advance(long j, TextIterator textIterator);

    public static final native boolean TextIterator_Equals(long j, TextIterator textIterator, long j2, TextIterator textIterator2);

    public static final native boolean TextIterator_Finished(long j, TextIterator textIterator);

    public static final native long TextIterator_GetMutableTextChunk(long j, TextIterator textIterator);

    public static final native long TextIterator_GetMutableTextChunkPtr(long j, TextIterator textIterator);

    public static final native long TextIterator_GetTextChunk(long j, TextIterator textIterator);

    public static final native long TextIterator_GetTextChunkPtr(long j, TextIterator textIterator);

    public static final native long TextLocalizationFeedbackContainer_GetTextChunkFeedback(long j, TextLocalizationFeedbackContainer textLocalizationFeedbackContainer, int i);

    public static final native int TextLocalizationFeedbackContainer_GetTextChunksCount(long j, TextLocalizationFeedbackContainer textLocalizationFeedbackContainer);

    public static final native long TextPageFeedback_GetQuadrangle(long j, TextPageFeedback textPageFeedback);

    public static final native boolean TextPageFeedback_IsPageRejected(long j, TextPageFeedback textPageFeedback);

    public static final native int TextPagesFeedbackContainer_GetPageCount(long j, TextPagesFeedbackContainer textPagesFeedbackContainer);

    public static final native long TextPagesFeedbackContainer_GetPageFeedback(long j, TextPagesFeedbackContainer textPagesFeedbackContainer, int i);

    public static final native long TextResult_GetCurrentScene(long j, TextResult textResult);

    public static final native long TextScene_CreateIterator__SWIG_0(long j, TextScene textScene, String str);

    public static final native long TextScene_CreateIterator__SWIG_1(long j, TextScene textScene);

    public static final native long TextScene_GetPageImage(long j, TextScene textScene);

    public static final native boolean TextScene_IsGarbage(long j, TextScene textScene);

    public static final native void TextSessionSettings_AddEnabledLanguages(long j, TextSessionSettings textSessionSettings, String str);

    public static final native long TextSessionSettings_Clone(long j, TextSessionSettings textSessionSettings);

    public static final native void TextSessionSettings_DisableAllLanguages(long j, TextSessionSettings textSessionSettings);

    public static final native void TextSessionSettings_DisableLanguages(long j, TextSessionSettings textSessionSettings, String str);

    public static final native long TextSessionSettings_EnabledLanguagesBegin(long j, TextSessionSettings textSessionSettings);

    public static final native long TextSessionSettings_EnabledLanguagesEnd(long j, TextSessionSettings textSessionSettings);

    public static final native int TextSessionSettings_GetEnabledLanguagesCount(long j, TextSessionSettings textSessionSettings);

    public static final native String TextSessionSettings_GetLanguageAlphabet(long j, TextSessionSettings textSessionSettings, String str);

    public static final native String TextSessionSettings_GetOption(long j, TextSessionSettings textSessionSettings, String str);

    public static final native int TextSessionSettings_GetOptionsCount(long j, TextSessionSettings textSessionSettings);

    public static final native int TextSessionSettings_GetSupportedLanguagesCount(long j, TextSessionSettings textSessionSettings);

    public static final native int TextSessionSettings_GetSupportedTextIteratorsCount(long j, TextSessionSettings textSessionSettings);

    public static final native boolean TextSessionSettings_HasOption(long j, TextSessionSettings textSessionSettings, String str);

    public static final native long TextSessionSettings_OptionsBegin(long j, TextSessionSettings textSessionSettings);

    public static final native long TextSessionSettings_OptionsEnd(long j, TextSessionSettings textSessionSettings);

    public static final native void TextSessionSettings_RemoveOption(long j, TextSessionSettings textSessionSettings, String str);

    public static final native void TextSessionSettings_SetOption(long j, TextSessionSettings textSessionSettings, String str, String str2);

    public static final native long TextSessionSettings_SupportedLanguagesBegin(long j, TextSessionSettings textSessionSettings);

    public static final native long TextSessionSettings_SupportedLanguagesEnd(long j, TextSessionSettings textSessionSettings);

    public static final native long TextSessionSettings_SupportedTextIteratorsBegin(long j, TextSessionSettings textSessionSettings);

    public static final native long TextSessionSettings_SupportedTextIteratorsEnd(long j, TextSessionSettings textSessionSettings);

    public static final native void TextSession_Activate(long j, TextSession textSession, String str);

    public static final native String TextSession_GetActivationRequest(long j, TextSession textSession);

    public static final native long TextSession_GetCurrentResult(long j, TextSession textSession);

    public static final native boolean TextSession_IsActivated(long j, TextSession textSession);

    public static final native void TextSession_ProcessImage(long j, TextSession textSession, long j2, Image image);

    public static final native void TextSession_Reset(long j, TextSession textSession);

    public static final native void delete_TextChunk(long j);

    public static final native void delete_TextChunkFeedback(long j);

    public static final native void delete_TextEngine(long j);

    public static final native void delete_TextFeedback(long j);

    public static final native void delete_TextFeedbackContainer(long j);

    public static final native void delete_TextIterator(long j);

    public static final native void delete_TextLocalizationFeedbackContainer(long j);

    public static final native void delete_TextPageFeedback(long j);

    public static final native void delete_TextPagesFeedbackContainer(long j);

    public static final native void delete_TextResult(long j);

    public static final native void delete_TextScene(long j);

    public static final native void delete_TextSession(long j);

    public static final native void delete_TextSessionSettings(long j);

    public static final native long new_TextFeedback();

    public static final native long new_TextFeedbackContainer();

    public static final native long new_TextIterator(long j, TextIterator textIterator);

    private static final native void swig_module_init();

    public static void SwigDirector_TextFeedback_FeedbackReceived(TextFeedback textFeedback, long j) {
        textFeedback.FeedbackReceived(new TextFeedbackContainer(j, false));
    }

    public static void SwigDirector_TextFeedback_PagesLocalizationFeedbackReceived(TextFeedback textFeedback, long j) {
        textFeedback.PagesLocalizationFeedbackReceived(new TextPagesFeedbackContainer(j, false));
    }

    public static void SwigDirector_TextFeedback_TextLocalizationFeedbackReceived(TextFeedback textFeedback, long j) {
        textFeedback.TextLocalizationFeedbackReceived(new TextLocalizationFeedbackContainer(j, false));
    }

    static {
        swig_module_init();
    }
}
