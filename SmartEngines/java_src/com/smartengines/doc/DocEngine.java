package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocEngine {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocEngine(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocEngine docEngine) {
        if (docEngine == null) {
            return 0L;
        }
        return docEngine.swigCPtr;
    }

    public static long swigRelease(DocEngine docEngine) {
        if (docEngine == null) {
            return 0L;
        }
        if (!docEngine.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docEngine.swigCPtr;
        docEngine.swigCMemOwn = false;
        docEngine.delete();
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
                jnidocengineJNI.delete_DocEngine(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DocSessionSettings CreateSessionSettings() {
        long jDocEngine_CreateSessionSettings = jnidocengineJNI.DocEngine_CreateSessionSettings(this.swigCPtr, this);
        if (jDocEngine_CreateSessionSettings == 0) {
            return null;
        }
        return new DocSessionSettings(jDocEngine_CreateSessionSettings, true);
    }

    public DocSession SpawnSession(DocSessionSettings docSessionSettings, String str, DocFeedback docFeedback) {
        long jDocEngine_SpawnSession__SWIG_0 = jnidocengineJNI.DocEngine_SpawnSession__SWIG_0(this.swigCPtr, this, DocSessionSettings.getCPtr(docSessionSettings), docSessionSettings, str, DocFeedback.getCPtr(docFeedback), docFeedback);
        if (jDocEngine_SpawnSession__SWIG_0 == 0) {
            return null;
        }
        return new DocSession(jDocEngine_SpawnSession__SWIG_0, true);
    }

    public DocSession SpawnSession(DocSessionSettings docSessionSettings, String str) {
        long jDocEngine_SpawnSession__SWIG_1 = jnidocengineJNI.DocEngine_SpawnSession__SWIG_1(this.swigCPtr, this, DocSessionSettings.getCPtr(docSessionSettings), docSessionSettings, str);
        if (jDocEngine_SpawnSession__SWIG_1 == 0) {
            return null;
        }
        return new DocSession(jDocEngine_SpawnSession__SWIG_1, true);
    }

    public static DocEngine Create(String str, boolean z) {
        long jDocEngine_Create__SWIG_0 = jnidocengineJNI.DocEngine_Create__SWIG_0(str, z);
        if (jDocEngine_Create__SWIG_0 == 0) {
            return null;
        }
        return new DocEngine(jDocEngine_Create__SWIG_0, true);
    }

    public static DocEngine Create(String str) {
        long jDocEngine_Create__SWIG_1 = jnidocengineJNI.DocEngine_Create__SWIG_1(str);
        if (jDocEngine_Create__SWIG_1 == 0) {
            return null;
        }
        return new DocEngine(jDocEngine_Create__SWIG_1, true);
    }

    public static DocEngine Create(byte[] bArr, boolean z) {
        long jDocEngine_Create__SWIG_2 = jnidocengineJNI.DocEngine_Create__SWIG_2(bArr, z);
        if (jDocEngine_Create__SWIG_2 == 0) {
            return null;
        }
        return new DocEngine(jDocEngine_Create__SWIG_2, true);
    }

    public static DocEngine Create(byte[] bArr) {
        long jDocEngine_Create__SWIG_3 = jnidocengineJNI.DocEngine_Create__SWIG_3(bArr);
        if (jDocEngine_Create__SWIG_3 == 0) {
            return null;
        }
        return new DocEngine(jDocEngine_Create__SWIG_3, true);
    }

    public static DocEngine CreateFromEmbeddedBundle(boolean z) {
        long jDocEngine_CreateFromEmbeddedBundle__SWIG_0 = jnidocengineJNI.DocEngine_CreateFromEmbeddedBundle__SWIG_0(z);
        if (jDocEngine_CreateFromEmbeddedBundle__SWIG_0 == 0) {
            return null;
        }
        return new DocEngine(jDocEngine_CreateFromEmbeddedBundle__SWIG_0, true);
    }

    public static DocEngine CreateFromEmbeddedBundle() {
        long jDocEngine_CreateFromEmbeddedBundle__SWIG_1 = jnidocengineJNI.DocEngine_CreateFromEmbeddedBundle__SWIG_1();
        if (jDocEngine_CreateFromEmbeddedBundle__SWIG_1 == 0) {
            return null;
        }
        return new DocEngine(jDocEngine_CreateFromEmbeddedBundle__SWIG_1, true);
    }

    public static String GetVersion() {
        return jnidocengineJNI.DocEngine_GetVersion();
    }

    public DocSession SpawnSession(DocSessionSettings docSessionSettings, String str, DocFeedback docFeedback, DocExternalProcessorInterface docExternalProcessorInterface) {
        long jDocEngine_SpawnSession__SWIG_2 = jnidocengineJNI.DocEngine_SpawnSession__SWIG_2(this.swigCPtr, this, DocSessionSettings.getCPtr(docSessionSettings), docSessionSettings, str, DocFeedback.getCPtr(docFeedback), docFeedback, DocExternalProcessorInterface.getCPtr(docExternalProcessorInterface), docExternalProcessorInterface);
        if (jDocEngine_SpawnSession__SWIG_2 == 0) {
            return null;
        }
        return new DocSession(jDocEngine_SpawnSession__SWIG_2, true);
    }

    public DocSessionSettings CreateVideoSessionSettings() {
        long jDocEngine_CreateVideoSessionSettings = jnidocengineJNI.DocEngine_CreateVideoSessionSettings(this.swigCPtr, this);
        if (jDocEngine_CreateVideoSessionSettings == 0) {
            return null;
        }
        return new DocSessionSettings(jDocEngine_CreateVideoSessionSettings, true);
    }

    public DocVideoSession SpawnVideoSession(DocSessionSettings docSessionSettings, String str, DocFeedback docFeedback) {
        long jDocEngine_SpawnVideoSession__SWIG_0 = jnidocengineJNI.DocEngine_SpawnVideoSession__SWIG_0(this.swigCPtr, this, DocSessionSettings.getCPtr(docSessionSettings), docSessionSettings, str, DocFeedback.getCPtr(docFeedback), docFeedback);
        if (jDocEngine_SpawnVideoSession__SWIG_0 == 0) {
            return null;
        }
        return new DocVideoSession(jDocEngine_SpawnVideoSession__SWIG_0, true);
    }

    public DocVideoSession SpawnVideoSession(DocSessionSettings docSessionSettings, String str) {
        long jDocEngine_SpawnVideoSession__SWIG_1 = jnidocengineJNI.DocEngine_SpawnVideoSession__SWIG_1(this.swigCPtr, this, DocSessionSettings.getCPtr(docSessionSettings), docSessionSettings, str);
        if (jDocEngine_SpawnVideoSession__SWIG_1 == 0) {
            return null;
        }
        return new DocVideoSession(jDocEngine_SpawnVideoSession__SWIG_1, true);
    }
}
