package com.smartengines.p006id;

import com.smartengines.common.StringsSet;
import com.smartengines.common.StringsSetIterator;

/* loaded from: classes3.dex */
public class IdResult {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdResult(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdResult idResult) {
        if (idResult == null) {
            return 0L;
        }
        return idResult.swigCPtr;
    }

    public static long swigRelease(IdResult idResult) {
        if (idResult == null) {
            return 0L;
        }
        if (!idResult.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idResult.swigCPtr;
        idResult.swigCMemOwn = false;
        idResult.delete();
        return j;
    }

    protected void finalize() {
        delete();
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                jniidengineJNI.delete_IdResult(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdResult(boolean z) {
        this(jniidengineJNI.new_IdResult__SWIG_0(z), true);
    }

    public IdResult() {
        this(jniidengineJNI.new_IdResult__SWIG_1(), true);
    }

    public IdResult(IdResult idResult) {
        this(jniidengineJNI.new_IdResult__SWIG_2(getCPtr(idResult), idResult), true);
    }

    public String GetDocumentType() {
        return jniidengineJNI.IdResult_GetDocumentType(this.swigCPtr, this);
    }

    public void SetDocumentType(String str) {
        jniidengineJNI.IdResult_SetDocumentType(this.swigCPtr, this, str);
    }

    public int GetTemplateDetectionResultsCount() {
        return jniidengineJNI.IdResult_GetTemplateDetectionResultsCount(this.swigCPtr, this);
    }

    public IdTemplateDetectionResult GetTemplateDetectionResult(int i) {
        return new IdTemplateDetectionResult(jniidengineJNI.IdResult_GetTemplateDetectionResult(this.swigCPtr, this, i), false);
    }

    public void AppendTemplateDetectionResult(IdTemplateDetectionResult idTemplateDetectionResult) {
        jniidengineJNI.IdResult_AppendTemplateDetectionResult(this.swigCPtr, this, IdTemplateDetectionResult.getCPtr(idTemplateDetectionResult), idTemplateDetectionResult);
    }

    public void ClearTemplateDetectionResults() {
        jniidengineJNI.IdResult_ClearTemplateDetectionResults(this.swigCPtr, this);
    }

    public int GetTemplateSegmentationResultsCount() {
        return jniidengineJNI.IdResult_GetTemplateSegmentationResultsCount(this.swigCPtr, this);
    }

    public IdTemplateSegmentationResult GetTemplateSegmentationResult(int i) {
        return new IdTemplateSegmentationResult(jniidengineJNI.IdResult_GetTemplateSegmentationResult(this.swigCPtr, this, i), false);
    }

    public void AppendTemplateSegmentationResult(IdTemplateSegmentationResult idTemplateSegmentationResult) {
        jniidengineJNI.IdResult_AppendTemplateSegmentationResult(this.swigCPtr, this, IdTemplateSegmentationResult.getCPtr(idTemplateSegmentationResult), idTemplateSegmentationResult);
    }

    public void ClearTemplateSegmentationResults() {
        jniidengineJNI.IdResult_ClearTemplateSegmentationResults(this.swigCPtr, this);
    }

    public boolean GetIsTerminal() {
        return jniidengineJNI.IdResult_GetIsTerminal(this.swigCPtr, this);
    }

    public void SetIsTerminal(boolean z) {
        jniidengineJNI.IdResult_SetIsTerminal(this.swigCPtr, this, z);
    }

    public StringsSet GetSeenTemplates() {
        return new StringsSet(jniidengineJNI.IdResult_GetSeenTemplates(this.swigCPtr, this), false);
    }

    public StringsSet GetTerminalTemplates() {
        return new StringsSet(jniidengineJNI.IdResult_GetTerminalTemplates(this.swigCPtr, this), false);
    }

    public int GetTextFieldsCount() {
        return jniidengineJNI.IdResult_GetTextFieldsCount(this.swigCPtr, this);
    }

    public boolean HasTextField(String str) {
        return jniidengineJNI.IdResult_HasTextField(this.swigCPtr, this, str);
    }

    public IdTextField GetTextField(String str) {
        return new IdTextField(jniidengineJNI.IdResult_GetTextField(this.swigCPtr, this, str), false);
    }

    public void SetTextField(String str, IdTextField idTextField) {
        jniidengineJNI.IdResult_SetTextField(this.swigCPtr, this, str, IdTextField.getCPtr(idTextField), idTextField);
    }

    public void RemoveTextField(String str) {
        jniidengineJNI.IdResult_RemoveTextField(this.swigCPtr, this, str);
    }

    public IdTextFieldsMapIterator TextFieldsBegin() {
        return new IdTextFieldsMapIterator(jniidengineJNI.IdResult_TextFieldsBegin(this.swigCPtr, this), true);
    }

    public IdTextFieldsMapIterator TextFieldsEnd() {
        return new IdTextFieldsMapIterator(jniidengineJNI.IdResult_TextFieldsEnd(this.swigCPtr, this), true);
    }

    public int GetImageFieldsCount() {
        return jniidengineJNI.IdResult_GetImageFieldsCount(this.swigCPtr, this);
    }

    public boolean HasImageField(String str) {
        return jniidengineJNI.IdResult_HasImageField(this.swigCPtr, this, str);
    }

    public IdImageField GetImageField(String str) {
        return new IdImageField(jniidengineJNI.IdResult_GetImageField(this.swigCPtr, this, str), false);
    }

    public void SetImageField(String str, IdImageField idImageField) {
        jniidengineJNI.IdResult_SetImageField(this.swigCPtr, this, str, IdImageField.getCPtr(idImageField), idImageField);
    }

    public void RemoveImageField(String str) {
        jniidengineJNI.IdResult_RemoveImageField(this.swigCPtr, this, str);
    }

    public IdImageFieldsMapIterator ImageFieldsBegin() {
        return new IdImageFieldsMapIterator(jniidengineJNI.IdResult_ImageFieldsBegin(this.swigCPtr, this), true);
    }

    public IdImageFieldsMapIterator ImageFieldsEnd() {
        return new IdImageFieldsMapIterator(jniidengineJNI.IdResult_ImageFieldsEnd(this.swigCPtr, this), true);
    }

    public int GetAnimatedFieldsCount() {
        return jniidengineJNI.IdResult_GetAnimatedFieldsCount(this.swigCPtr, this);
    }

    public boolean HasAnimatedField(String str) {
        return jniidengineJNI.IdResult_HasAnimatedField(this.swigCPtr, this, str);
    }

    public IdAnimatedField GetAnimatedField(String str) {
        return new IdAnimatedField(jniidengineJNI.IdResult_GetAnimatedField(this.swigCPtr, this, str), false);
    }

    public void SetAnimatedField(String str, IdAnimatedField idAnimatedField) {
        jniidengineJNI.IdResult_SetAnimatedField(this.swigCPtr, this, str, IdAnimatedField.getCPtr(idAnimatedField), idAnimatedField);
    }

    public void RemoveAnimatedField(String str) {
        jniidengineJNI.IdResult_RemoveAnimatedField(this.swigCPtr, this, str);
    }

    public IdAnimatedFieldsMapIterator AnimatedFieldsBegin() {
        return new IdAnimatedFieldsMapIterator(jniidengineJNI.IdResult_AnimatedFieldsBegin(this.swigCPtr, this), true);
    }

    public IdAnimatedFieldsMapIterator AnimatedFieldsEnd() {
        return new IdAnimatedFieldsMapIterator(jniidengineJNI.IdResult_AnimatedFieldsEnd(this.swigCPtr, this), true);
    }

    public int GetCheckFieldsCount() {
        return jniidengineJNI.IdResult_GetCheckFieldsCount(this.swigCPtr, this);
    }

    public boolean HasCheckField(String str) {
        return jniidengineJNI.IdResult_HasCheckField(this.swigCPtr, this, str);
    }

    public IdCheckField GetCheckField(String str) {
        return new IdCheckField(jniidengineJNI.IdResult_GetCheckField(this.swigCPtr, this, str), false);
    }

    public void SetCheckField(String str, IdCheckField idCheckField) {
        jniidengineJNI.IdResult_SetCheckField(this.swigCPtr, this, str, IdCheckField.getCPtr(idCheckField), idCheckField);
    }

    public void RemoveCheckField(String str) {
        jniidengineJNI.IdResult_RemoveCheckField(this.swigCPtr, this, str);
    }

    public IdCheckFieldsMapIterator CheckFieldsBegin() {
        return new IdCheckFieldsMapIterator(jniidengineJNI.IdResult_CheckFieldsBegin(this.swigCPtr, this), true);
    }

    public IdCheckFieldsMapIterator CheckFieldsEnd() {
        return new IdCheckFieldsMapIterator(jniidengineJNI.IdResult_CheckFieldsEnd(this.swigCPtr, this), true);
    }

    public int GetForensicTextFieldsCount() {
        return jniidengineJNI.IdResult_GetForensicTextFieldsCount(this.swigCPtr, this);
    }

    public boolean HasForensicTextField(String str) {
        return jniidengineJNI.IdResult_HasForensicTextField(this.swigCPtr, this, str);
    }

    public IdTextField GetForensicTextField(String str) {
        return new IdTextField(jniidengineJNI.IdResult_GetForensicTextField(this.swigCPtr, this, str), false);
    }

    public void SetForensicTextField(String str, IdTextField idTextField) {
        jniidengineJNI.IdResult_SetForensicTextField(this.swigCPtr, this, str, IdTextField.getCPtr(idTextField), idTextField);
    }

    public void RemoveForensicTextField(String str) {
        jniidengineJNI.IdResult_RemoveForensicTextField(this.swigCPtr, this, str);
    }

    public IdTextFieldsMapIterator ForensicTextFieldsBegin() {
        return new IdTextFieldsMapIterator(jniidengineJNI.IdResult_ForensicTextFieldsBegin(this.swigCPtr, this), true);
    }

    public IdTextFieldsMapIterator ForensicTextFieldsEnd() {
        return new IdTextFieldsMapIterator(jniidengineJNI.IdResult_ForensicTextFieldsEnd(this.swigCPtr, this), true);
    }

    public int GetForensicImageFieldsCount() {
        return jniidengineJNI.IdResult_GetForensicImageFieldsCount(this.swigCPtr, this);
    }

    public boolean HasForensicImageField(String str) {
        return jniidengineJNI.IdResult_HasForensicImageField(this.swigCPtr, this, str);
    }

    public IdImageField GetForensicImageField(String str) {
        return new IdImageField(jniidengineJNI.IdResult_GetForensicImageField(this.swigCPtr, this, str), false);
    }

    public void SetForensicImageField(String str, IdImageField idImageField) {
        jniidengineJNI.IdResult_SetForensicImageField(this.swigCPtr, this, str, IdImageField.getCPtr(idImageField), idImageField);
    }

    public void RemoveForensicImageField(String str) {
        jniidengineJNI.IdResult_RemoveForensicImageField(this.swigCPtr, this, str);
    }

    public IdImageFieldsMapIterator ForensicImageFieldsBegin() {
        return new IdImageFieldsMapIterator(jniidengineJNI.IdResult_ForensicImageFieldsBegin(this.swigCPtr, this), true);
    }

    public IdImageFieldsMapIterator ForensicImageFieldsEnd() {
        return new IdImageFieldsMapIterator(jniidengineJNI.IdResult_ForensicImageFieldsEnd(this.swigCPtr, this), true);
    }

    public int GetForensicAnimatedFieldsCount() {
        return jniidengineJNI.IdResult_GetForensicAnimatedFieldsCount(this.swigCPtr, this);
    }

    public boolean HasForensicAnimatedField(String str) {
        return jniidengineJNI.IdResult_HasForensicAnimatedField(this.swigCPtr, this, str);
    }

    public IdAnimatedField GetForensicAnimatedField(String str) {
        return new IdAnimatedField(jniidengineJNI.IdResult_GetForensicAnimatedField(this.swigCPtr, this, str), false);
    }

    public void SetForensicAnimatedField(String str, IdAnimatedField idAnimatedField) {
        jniidengineJNI.IdResult_SetForensicAnimatedField(this.swigCPtr, this, str, IdAnimatedField.getCPtr(idAnimatedField), idAnimatedField);
    }

    public void RemoveForensicAnimatedField(String str) {
        jniidengineJNI.IdResult_RemoveForensicAnimatedField(this.swigCPtr, this, str);
    }

    public IdAnimatedFieldsMapIterator ForensicAnimatedFieldsBegin() {
        return new IdAnimatedFieldsMapIterator(jniidengineJNI.IdResult_ForensicAnimatedFieldsBegin(this.swigCPtr, this), true);
    }

    public IdAnimatedFieldsMapIterator ForensicAnimatedFieldsEnd() {
        return new IdAnimatedFieldsMapIterator(jniidengineJNI.IdResult_ForensicAnimatedFieldsEnd(this.swigCPtr, this), true);
    }

    public int GetForensicCheckFieldsCount() {
        return jniidengineJNI.IdResult_GetForensicCheckFieldsCount(this.swigCPtr, this);
    }

    public boolean HasForensicCheckField(String str) {
        return jniidengineJNI.IdResult_HasForensicCheckField(this.swigCPtr, this, str);
    }

    public IdCheckField GetForensicCheckField(String str) {
        return new IdCheckField(jniidengineJNI.IdResult_GetForensicCheckField(this.swigCPtr, this, str), false);
    }

    public void SetForensicCheckField(String str, IdCheckField idCheckField) {
        jniidengineJNI.IdResult_SetForensicCheckField(this.swigCPtr, this, str, IdCheckField.getCPtr(idCheckField), idCheckField);
    }

    public void RemoveForensicCheckField(String str) {
        jniidengineJNI.IdResult_RemoveForensicCheckField(this.swigCPtr, this, str);
    }

    public IdCheckFieldsMapIterator ForensicCheckFieldsBegin() {
        return new IdCheckFieldsMapIterator(jniidengineJNI.IdResult_ForensicCheckFieldsBegin(this.swigCPtr, this), true);
    }

    public IdCheckFieldsMapIterator ForensicCheckFieldsEnd() {
        return new IdCheckFieldsMapIterator(jniidengineJNI.IdResult_ForensicCheckFieldsEnd(this.swigCPtr, this), true);
    }

    public int GetRawTextFieldsCount() {
        return jniidengineJNI.IdResult_GetRawTextFieldsCount(this.swigCPtr, this);
    }

    public boolean HasRawTextField(String str) {
        return jniidengineJNI.IdResult_HasRawTextField(this.swigCPtr, this, str);
    }

    public IdTextField GetRawTextField(String str) {
        return new IdTextField(jniidengineJNI.IdResult_GetRawTextField(this.swigCPtr, this, str), false);
    }

    public void SetRawTextField(String str, IdTextField idTextField) {
        jniidengineJNI.IdResult_SetRawTextField(this.swigCPtr, this, str, IdTextField.getCPtr(idTextField), idTextField);
    }

    public void RemoveRawTextField(String str) {
        jniidengineJNI.IdResult_RemoveRawTextField(this.swigCPtr, this, str);
    }

    public IdTextFieldsMapIterator RawTextFieldsBegin() {
        return new IdTextFieldsMapIterator(jniidengineJNI.IdResult_RawTextFieldsBegin(this.swigCPtr, this), true);
    }

    public IdTextFieldsMapIterator RawTextFieldsEnd() {
        return new IdTextFieldsMapIterator(jniidengineJNI.IdResult_RawTextFieldsEnd(this.swigCPtr, this), true);
    }

    public int GetRawImageFieldsCount() {
        return jniidengineJNI.IdResult_GetRawImageFieldsCount(this.swigCPtr, this);
    }

    public boolean HasRawImageField(String str) {
        return jniidengineJNI.IdResult_HasRawImageField(this.swigCPtr, this, str);
    }

    public IdImageField GetRawImageField(String str) {
        return new IdImageField(jniidengineJNI.IdResult_GetRawImageField(this.swigCPtr, this, str), false);
    }

    public void SetRawImageField(String str, IdImageField idImageField) {
        jniidengineJNI.IdResult_SetRawImageField(this.swigCPtr, this, str, IdImageField.getCPtr(idImageField), idImageField);
    }

    public void RemoveRawImageField(String str) {
        jniidengineJNI.IdResult_RemoveRawImageField(this.swigCPtr, this, str);
    }

    public IdImageFieldsMapIterator RawImageFieldsBegin() {
        return new IdImageFieldsMapIterator(jniidengineJNI.IdResult_RawImageFieldsBegin(this.swigCPtr, this), true);
    }

    public IdImageFieldsMapIterator RawImageFieldsEnd() {
        return new IdImageFieldsMapIterator(jniidengineJNI.IdResult_RawImageFieldsEnd(this.swigCPtr, this), true);
    }

    public int GetCorrespondingRawFieldsCount(String str) {
        return jniidengineJNI.IdResult_GetCorrespondingRawFieldsCount(this.swigCPtr, this, str);
    }

    public boolean HasCorrespondingRawField(String str, String str2) {
        return jniidengineJNI.IdResult_HasCorrespondingRawField(this.swigCPtr, this, str, str2);
    }

    public StringsSetIterator CorrespondingRawFieldNamesBegin(String str) {
        return new StringsSetIterator(jniidengineJNI.IdResult_CorrespondingRawFieldNamesBegin(this.swigCPtr, this, str), true);
    }

    public StringsSetIterator CorrespondingRawFieldNamesEnd(String str) {
        return new StringsSetIterator(jniidengineJNI.IdResult_CorrespondingRawFieldNamesEnd(this.swigCPtr, this, str), true);
    }

    public int GetCorrespondingFieldsCount(String str) {
        return jniidengineJNI.IdResult_GetCorrespondingFieldsCount(this.swigCPtr, this, str);
    }

    public boolean HasCorrespondingField(String str, String str2) {
        return jniidengineJNI.IdResult_HasCorrespondingField(this.swigCPtr, this, str, str2);
    }

    public StringsSetIterator CorrespondingFieldNamesBegin(String str) {
        return new StringsSetIterator(jniidengineJNI.IdResult_CorrespondingFieldNamesBegin(this.swigCPtr, this, str), true);
    }

    public StringsSetIterator CorrespondingFieldNamesEnd(String str) {
        return new StringsSetIterator(jniidengineJNI.IdResult_CorrespondingFieldNamesEnd(this.swigCPtr, this, str), true);
    }
}
