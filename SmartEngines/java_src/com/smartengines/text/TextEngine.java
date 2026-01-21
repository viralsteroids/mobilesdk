package com.smartengines.text;

/* loaded from: classes3.dex */
public class TextEngine {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public TextEngine(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(TextEngine textEngine) {
        if (textEngine == null) {
            return 0L;
        }
        return textEngine.swigCPtr;
    }

    public static long swigRelease(TextEngine textEngine) {
        if (textEngine == null) {
            return 0L;
        }
        if (!textEngine.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = textEngine.swigCPtr;
        textEngine.swigCMemOwn = false;
        textEngine.delete();
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
                jnitextengineJNI.delete_TextEngine(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public TextSessionSettings CreateSessionSettings() {
        long jTextEngine_CreateSessionSettings = jnitextengineJNI.TextEngine_CreateSessionSettings(this.swigCPtr, this);
        if (jTextEngine_CreateSessionSettings == 0) {
            return null;
        }
        return new TextSessionSettings(jTextEngine_CreateSessionSettings, true);
    }

    public TextSession SpawnSession(TextSessionSettings textSessionSettings, String str, TextFeedback textFeedback) {
        long jTextEngine_SpawnSession__SWIG_0 = jnitextengineJNI.TextEngine_SpawnSession__SWIG_0(this.swigCPtr, this, TextSessionSettings.getCPtr(textSessionSettings), textSessionSettings, str, TextFeedback.getCPtr(textFeedback), textFeedback);
        if (jTextEngine_SpawnSession__SWIG_0 == 0) {
            return null;
        }
        return new TextSession(jTextEngine_SpawnSession__SWIG_0, true);
    }

    public TextSession SpawnSession(TextSessionSettings textSessionSettings, String str) {
        long jTextEngine_SpawnSession__SWIG_1 = jnitextengineJNI.TextEngine_SpawnSession__SWIG_1(this.swigCPtr, this, TextSessionSettings.getCPtr(textSessionSettings), textSessionSettings, str);
        if (jTextEngine_SpawnSession__SWIG_1 == 0) {
            return null;
        }
        return new TextSession(jTextEngine_SpawnSession__SWIG_1, true);
    }

    public static TextEngine Create(String str, boolean z) {
        long jTextEngine_Create__SWIG_0 = jnitextengineJNI.TextEngine_Create__SWIG_0(str, z);
        if (jTextEngine_Create__SWIG_0 == 0) {
            return null;
        }
        return new TextEngine(jTextEngine_Create__SWIG_0, true);
    }

    public static TextEngine Create(String str) {
        long jTextEngine_Create__SWIG_1 = jnitextengineJNI.TextEngine_Create__SWIG_1(str);
        if (jTextEngine_Create__SWIG_1 == 0) {
            return null;
        }
        return new TextEngine(jTextEngine_Create__SWIG_1, true);
    }

    public static TextEngine Create(byte[] bArr, boolean z) {
        long jTextEngine_Create__SWIG_2 = jnitextengineJNI.TextEngine_Create__SWIG_2(bArr, z);
        if (jTextEngine_Create__SWIG_2 == 0) {
            return null;
        }
        return new TextEngine(jTextEngine_Create__SWIG_2, true);
    }

    public static TextEngine Create(byte[] bArr) {
        long jTextEngine_Create__SWIG_3 = jnitextengineJNI.TextEngine_Create__SWIG_3(bArr);
        if (jTextEngine_Create__SWIG_3 == 0) {
            return null;
        }
        return new TextEngine(jTextEngine_Create__SWIG_3, true);
    }

    public static TextEngine CreateFromEmbeddedBundle(boolean z) {
        long jTextEngine_CreateFromEmbeddedBundle__SWIG_0 = jnitextengineJNI.TextEngine_CreateFromEmbeddedBundle__SWIG_0(z);
        if (jTextEngine_CreateFromEmbeddedBundle__SWIG_0 == 0) {
            return null;
        }
        return new TextEngine(jTextEngine_CreateFromEmbeddedBundle__SWIG_0, true);
    }

    public static TextEngine CreateFromEmbeddedBundle() {
        long jTextEngine_CreateFromEmbeddedBundle__SWIG_1 = jnitextengineJNI.TextEngine_CreateFromEmbeddedBundle__SWIG_1();
        if (jTextEngine_CreateFromEmbeddedBundle__SWIG_1 == 0) {
            return null;
        }
        return new TextEngine(jTextEngine_CreateFromEmbeddedBundle__SWIG_1, true);
    }

    public static String GetVersion() {
        return jnitextengineJNI.TextEngine_GetVersion();
    }
}
