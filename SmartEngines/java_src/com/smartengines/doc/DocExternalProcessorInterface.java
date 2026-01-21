package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocExternalProcessorInterface {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocExternalProcessorInterface(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocExternalProcessorInterface docExternalProcessorInterface) {
        if (docExternalProcessorInterface == null) {
            return 0L;
        }
        return docExternalProcessorInterface.swigCPtr;
    }

    public static long swigRelease(DocExternalProcessorInterface docExternalProcessorInterface) {
        if (docExternalProcessorInterface == null) {
            return 0L;
        }
        if (!docExternalProcessorInterface.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docExternalProcessorInterface.swigCPtr;
        docExternalProcessorInterface.swigCMemOwn = false;
        docExternalProcessorInterface.delete();
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
                jnidocengineJNI.delete_DocExternalProcessorInterface(j);
            }
            this.swigCPtr = 0L;
        }
    }

    protected void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        delete();
    }

    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        jnidocengineJNI.DocExternalProcessorInterface_change_ownership(this, this.swigCPtr, false);
    }

    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        jnidocengineJNI.DocExternalProcessorInterface_change_ownership(this, this.swigCPtr, true);
    }

    public void Process(DocResult docResult, DocProcessingSettings docProcessingSettings, DocProcessingArguments docProcessingArguments) {
        jnidocengineJNI.DocExternalProcessorInterface_Process(this.swigCPtr, this, DocResult.getCPtr(docResult), docResult, DocProcessingSettings.getCPtr(docProcessingSettings), docProcessingSettings, DocProcessingArguments.getCPtr(docProcessingArguments), docProcessingArguments);
    }

    public DocExternalProcessorInterface() {
        this(jnidocengineJNI.new_DocExternalProcessorInterface(), true);
        jnidocengineJNI.DocExternalProcessorInterface_director_connect(this, this.swigCPtr, true, true);
    }
}
