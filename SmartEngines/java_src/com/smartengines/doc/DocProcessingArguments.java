package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocProcessingArguments {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocProcessingArguments(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocProcessingArguments docProcessingArguments) {
        if (docProcessingArguments == null) {
            return 0L;
        }
        return docProcessingArguments.swigCPtr;
    }

    public static long swigRelease(DocProcessingArguments docProcessingArguments) {
        if (docProcessingArguments == null) {
            return 0L;
        }
        if (!docProcessingArguments.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docProcessingArguments.swigCPtr;
        docProcessingArguments.swigCMemOwn = false;
        docProcessingArguments.delete();
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
                jnidocengineJNI.delete_DocProcessingArguments(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public int GetTagArgumentsCount() {
        return jnidocengineJNI.DocProcessingArguments_GetTagArgumentsCount(this.swigCPtr, this);
    }

    public String GetTagArgument(int i) {
        return jnidocengineJNI.DocProcessingArguments_GetTagArgument(this.swigCPtr, this, i);
    }

    public void SetTagArgument(int i, String str) {
        jnidocengineJNI.DocProcessingArguments_SetTagArgument(this.swigCPtr, this, i, str);
    }

    public void Resize(int i) {
        jnidocengineJNI.DocProcessingArguments_Resize(this.swigCPtr, this, i);
    }
}
