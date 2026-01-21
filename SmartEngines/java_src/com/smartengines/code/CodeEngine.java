package com.smartengines.code;

/* loaded from: classes3.dex */
public class CodeEngine {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public CodeEngine(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(CodeEngine codeEngine) {
        if (codeEngine == null) {
            return 0L;
        }
        return codeEngine.swigCPtr;
    }

    public static long swigRelease(CodeEngine codeEngine) {
        if (codeEngine == null) {
            return 0L;
        }
        if (!codeEngine.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = codeEngine.swigCPtr;
        codeEngine.swigCMemOwn = false;
        codeEngine.delete();
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
                jnicodeengineJNI.delete_CodeEngine(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public static CodeEngine Create(String str, boolean z) {
        long jCodeEngine_Create__SWIG_0 = jnicodeengineJNI.CodeEngine_Create__SWIG_0(str, z);
        if (jCodeEngine_Create__SWIG_0 == 0) {
            return null;
        }
        return new CodeEngine(jCodeEngine_Create__SWIG_0, true);
    }

    public static CodeEngine Create(String str) {
        long jCodeEngine_Create__SWIG_1 = jnicodeengineJNI.CodeEngine_Create__SWIG_1(str);
        if (jCodeEngine_Create__SWIG_1 == 0) {
            return null;
        }
        return new CodeEngine(jCodeEngine_Create__SWIG_1, true);
    }

    public static CodeEngine Create(byte[] bArr, boolean z) {
        long jCodeEngine_Create__SWIG_2 = jnicodeengineJNI.CodeEngine_Create__SWIG_2(bArr, z);
        if (jCodeEngine_Create__SWIG_2 == 0) {
            return null;
        }
        return new CodeEngine(jCodeEngine_Create__SWIG_2, true);
    }

    public static CodeEngine Create(byte[] bArr) {
        long jCodeEngine_Create__SWIG_3 = jnicodeengineJNI.CodeEngine_Create__SWIG_3(bArr);
        if (jCodeEngine_Create__SWIG_3 == 0) {
            return null;
        }
        return new CodeEngine(jCodeEngine_Create__SWIG_3, true);
    }

    public static CodeEngine CreateFromEmbeddedBundle(boolean z) {
        long jCodeEngine_CreateFromEmbeddedBundle__SWIG_0 = jnicodeengineJNI.CodeEngine_CreateFromEmbeddedBundle__SWIG_0(z);
        if (jCodeEngine_CreateFromEmbeddedBundle__SWIG_0 == 0) {
            return null;
        }
        return new CodeEngine(jCodeEngine_CreateFromEmbeddedBundle__SWIG_0, true);
    }

    public static CodeEngine CreateFromEmbeddedBundle() {
        long jCodeEngine_CreateFromEmbeddedBundle__SWIG_1 = jnicodeengineJNI.CodeEngine_CreateFromEmbeddedBundle__SWIG_1();
        if (jCodeEngine_CreateFromEmbeddedBundle__SWIG_1 == 0) {
            return null;
        }
        return new CodeEngine(jCodeEngine_CreateFromEmbeddedBundle__SWIG_1, true);
    }

    public static String GetVersion() {
        return jnicodeengineJNI.CodeEngine_GetVersion();
    }

    public CodeEngineSessionSettings GetDefaultSessionSettings() {
        long jCodeEngine_GetDefaultSessionSettings = jnicodeengineJNI.CodeEngine_GetDefaultSessionSettings(this.swigCPtr, this);
        if (jCodeEngine_GetDefaultSessionSettings == 0) {
            return null;
        }
        return new CodeEngineSessionSettings(jCodeEngine_GetDefaultSessionSettings, true);
    }

    public CodeEngineSession SpawnSession(CodeEngineSessionSettings codeEngineSessionSettings, String str, CodeEngineWorkflowFeedback codeEngineWorkflowFeedback, CodeEngineVisualizationFeedback codeEngineVisualizationFeedback) {
        long jCodeEngine_SpawnSession__SWIG_0 = jnicodeengineJNI.CodeEngine_SpawnSession__SWIG_0(this.swigCPtr, this, CodeEngineSessionSettings.getCPtr(codeEngineSessionSettings), codeEngineSessionSettings, str, CodeEngineWorkflowFeedback.getCPtr(codeEngineWorkflowFeedback), codeEngineWorkflowFeedback, CodeEngineVisualizationFeedback.getCPtr(codeEngineVisualizationFeedback), codeEngineVisualizationFeedback);
        if (jCodeEngine_SpawnSession__SWIG_0 == 0) {
            return null;
        }
        return new CodeEngineSession(jCodeEngine_SpawnSession__SWIG_0, true);
    }

    public CodeEngineSession SpawnSession(CodeEngineSessionSettings codeEngineSessionSettings, String str, CodeEngineWorkflowFeedback codeEngineWorkflowFeedback) {
        long jCodeEngine_SpawnSession__SWIG_1 = jnicodeengineJNI.CodeEngine_SpawnSession__SWIG_1(this.swigCPtr, this, CodeEngineSessionSettings.getCPtr(codeEngineSessionSettings), codeEngineSessionSettings, str, CodeEngineWorkflowFeedback.getCPtr(codeEngineWorkflowFeedback), codeEngineWorkflowFeedback);
        if (jCodeEngine_SpawnSession__SWIG_1 == 0) {
            return null;
        }
        return new CodeEngineSession(jCodeEngine_SpawnSession__SWIG_1, true);
    }

    public CodeEngineSession SpawnSession(CodeEngineSessionSettings codeEngineSessionSettings, String str) {
        long jCodeEngine_SpawnSession__SWIG_2 = jnicodeengineJNI.CodeEngine_SpawnSession__SWIG_2(this.swigCPtr, this, CodeEngineSessionSettings.getCPtr(codeEngineSessionSettings), codeEngineSessionSettings, str);
        if (jCodeEngine_SpawnSession__SWIG_2 == 0) {
            return null;
        }
        return new CodeEngineSession(jCodeEngine_SpawnSession__SWIG_2, true);
    }

    public boolean IsEngineAvailable(CodeEngineType codeEngineType) {
        return jnicodeengineJNI.CodeEngine_IsEngineAvailable(this.swigCPtr, this, codeEngineType.swigValue());
    }
}
