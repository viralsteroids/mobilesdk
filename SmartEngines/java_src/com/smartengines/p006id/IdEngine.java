package com.smartengines.p006id;

import com.smartengines.common.Image;

/* loaded from: classes3.dex */
public class IdEngine {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public IdEngine(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(IdEngine idEngine) {
        if (idEngine == null) {
            return 0L;
        }
        return idEngine.swigCPtr;
    }

    public static long swigRelease(IdEngine idEngine) {
        if (idEngine == null) {
            return 0L;
        }
        if (!idEngine.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = idEngine.swigCPtr;
        idEngine.swigCMemOwn = false;
        idEngine.delete();
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
                jniidengineJNI.delete_IdEngine(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public IdSessionSettings CreateSessionSettings() {
        long jIdEngine_CreateSessionSettings = jniidengineJNI.IdEngine_CreateSessionSettings(this.swigCPtr, this);
        if (jIdEngine_CreateSessionSettings == 0) {
            return null;
        }
        return new IdSessionSettings(jIdEngine_CreateSessionSettings, true);
    }

    public IdSession SpawnSession(IdSessionSettings idSessionSettings, String str, IdFeedback idFeedback) {
        long jIdEngine_SpawnSession__SWIG_0 = jniidengineJNI.IdEngine_SpawnSession__SWIG_0(this.swigCPtr, this, IdSessionSettings.getCPtr(idSessionSettings), idSessionSettings, str, IdFeedback.getCPtr(idFeedback), idFeedback);
        if (jIdEngine_SpawnSession__SWIG_0 == 0) {
            return null;
        }
        return new IdSession(jIdEngine_SpawnSession__SWIG_0, true);
    }

    public IdSession SpawnSession(IdSessionSettings idSessionSettings, String str) {
        long jIdEngine_SpawnSession__SWIG_1 = jniidengineJNI.IdEngine_SpawnSession__SWIG_1(this.swigCPtr, this, IdSessionSettings.getCPtr(idSessionSettings), idSessionSettings, str);
        if (jIdEngine_SpawnSession__SWIG_1 == 0) {
            return null;
        }
        return new IdSession(jIdEngine_SpawnSession__SWIG_1, true);
    }

    public IdFileAnalysisSessionSettings CreateFileAnalysisSessionSettings() {
        long jIdEngine_CreateFileAnalysisSessionSettings = jniidengineJNI.IdEngine_CreateFileAnalysisSessionSettings(this.swigCPtr, this);
        if (jIdEngine_CreateFileAnalysisSessionSettings == 0) {
            return null;
        }
        return new IdFileAnalysisSessionSettings(jIdEngine_CreateFileAnalysisSessionSettings, true);
    }

    public IdFileAnalysisSession SpawnFileAnalysisSession(IdFileAnalysisSessionSettings idFileAnalysisSessionSettings, String str) {
        long jIdEngine_SpawnFileAnalysisSession = jniidengineJNI.IdEngine_SpawnFileAnalysisSession(this.swigCPtr, this, IdFileAnalysisSessionSettings.getCPtr(idFileAnalysisSessionSettings), idFileAnalysisSessionSettings, str);
        if (jIdEngine_SpawnFileAnalysisSession == 0) {
            return null;
        }
        return new IdFileAnalysisSession(jIdEngine_SpawnFileAnalysisSession, true);
    }

    public IdFaceSessionSettings CreateFaceSessionSettings() {
        long jIdEngine_CreateFaceSessionSettings = jniidengineJNI.IdEngine_CreateFaceSessionSettings(this.swigCPtr, this);
        if (jIdEngine_CreateFaceSessionSettings == 0) {
            return null;
        }
        return new IdFaceSessionSettings(jIdEngine_CreateFaceSessionSettings, true);
    }

    public IdFaceSession SpawnFaceSession(IdFaceSessionSettings idFaceSessionSettings, String str, IdFaceFeedback idFaceFeedback) {
        long jIdEngine_SpawnFaceSession__SWIG_0 = jniidengineJNI.IdEngine_SpawnFaceSession__SWIG_0(this.swigCPtr, this, IdFaceSessionSettings.getCPtr(idFaceSessionSettings), idFaceSessionSettings, str, IdFaceFeedback.getCPtr(idFaceFeedback), idFaceFeedback);
        if (jIdEngine_SpawnFaceSession__SWIG_0 == 0) {
            return null;
        }
        return new IdFaceSession(jIdEngine_SpawnFaceSession__SWIG_0, true);
    }

    public IdFaceSession SpawnFaceSession(IdFaceSessionSettings idFaceSessionSettings, String str) {
        long jIdEngine_SpawnFaceSession__SWIG_1 = jniidengineJNI.IdEngine_SpawnFaceSession__SWIG_1(this.swigCPtr, this, IdFaceSessionSettings.getCPtr(idFaceSessionSettings), idFaceSessionSettings, str);
        if (jIdEngine_SpawnFaceSession__SWIG_1 == 0) {
            return null;
        }
        return new IdFaceSession(jIdEngine_SpawnFaceSession__SWIG_1, true);
    }

    public IdFaceOslResult ProcessOneShotLiveness(Image image) {
        long jIdEngine_ProcessOneShotLiveness = jniidengineJNI.IdEngine_ProcessOneShotLiveness(this.swigCPtr, this, Image.getCPtr(image), image);
        if (jIdEngine_ProcessOneShotLiveness == 0) {
            return null;
        }
        return new IdFaceOslResult(jIdEngine_ProcessOneShotLiveness, false);
    }

    public IdFieldProcessingSessionSettings CreateFieldProcessingSessionSettings() {
        long jIdEngine_CreateFieldProcessingSessionSettings = jniidengineJNI.IdEngine_CreateFieldProcessingSessionSettings(this.swigCPtr, this);
        if (jIdEngine_CreateFieldProcessingSessionSettings == 0) {
            return null;
        }
        return new IdFieldProcessingSessionSettings(jIdEngine_CreateFieldProcessingSessionSettings, true);
    }

    public IdFieldProcessingSession SpawnFieldProcessingSession(IdFieldProcessingSessionSettings idFieldProcessingSessionSettings, String str) {
        long jIdEngine_SpawnFieldProcessingSession = jniidengineJNI.IdEngine_SpawnFieldProcessingSession(this.swigCPtr, this, IdFieldProcessingSessionSettings.getCPtr(idFieldProcessingSessionSettings), idFieldProcessingSessionSettings, str);
        if (jIdEngine_SpawnFieldProcessingSession == 0) {
            return null;
        }
        return new IdFieldProcessingSession(jIdEngine_SpawnFieldProcessingSession, true);
    }

    public IdVideoAuthenticationSessionSettings CreateVideoAuthenticationSessionSettings() {
        long jIdEngine_CreateVideoAuthenticationSessionSettings = jniidengineJNI.IdEngine_CreateVideoAuthenticationSessionSettings(this.swigCPtr, this);
        if (jIdEngine_CreateVideoAuthenticationSessionSettings == 0) {
            return null;
        }
        return new IdVideoAuthenticationSessionSettings(jIdEngine_CreateVideoAuthenticationSessionSettings, true);
    }

    public IdVideoAuthenticationSession SpawnVideoAuthenticationSession(IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str, IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks, IdFeedback idFeedback, IdFaceFeedback idFaceFeedback) {
        long jIdEngine_SpawnVideoAuthenticationSession__SWIG_0 = jniidengineJNI.IdEngine_SpawnVideoAuthenticationSession__SWIG_0(this.swigCPtr, this, IdVideoAuthenticationSessionSettings.getCPtr(idVideoAuthenticationSessionSettings), idVideoAuthenticationSessionSettings, str, IdVideoAuthenticationCallbacks.getCPtr(idVideoAuthenticationCallbacks), idVideoAuthenticationCallbacks, IdFeedback.getCPtr(idFeedback), idFeedback, IdFaceFeedback.getCPtr(idFaceFeedback), idFaceFeedback);
        if (jIdEngine_SpawnVideoAuthenticationSession__SWIG_0 == 0) {
            return null;
        }
        return new IdVideoAuthenticationSession(jIdEngine_SpawnVideoAuthenticationSession__SWIG_0, true);
    }

    public IdVideoAuthenticationSession SpawnVideoAuthenticationSession(IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str, IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks, IdFeedback idFeedback) {
        long jIdEngine_SpawnVideoAuthenticationSession__SWIG_1 = jniidengineJNI.IdEngine_SpawnVideoAuthenticationSession__SWIG_1(this.swigCPtr, this, IdVideoAuthenticationSessionSettings.getCPtr(idVideoAuthenticationSessionSettings), idVideoAuthenticationSessionSettings, str, IdVideoAuthenticationCallbacks.getCPtr(idVideoAuthenticationCallbacks), idVideoAuthenticationCallbacks, IdFeedback.getCPtr(idFeedback), idFeedback);
        if (jIdEngine_SpawnVideoAuthenticationSession__SWIG_1 == 0) {
            return null;
        }
        return new IdVideoAuthenticationSession(jIdEngine_SpawnVideoAuthenticationSession__SWIG_1, true);
    }

    public IdVideoAuthenticationSession SpawnVideoAuthenticationSession(IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str, IdVideoAuthenticationCallbacks idVideoAuthenticationCallbacks) {
        long jIdEngine_SpawnVideoAuthenticationSession__SWIG_2 = jniidengineJNI.IdEngine_SpawnVideoAuthenticationSession__SWIG_2(this.swigCPtr, this, IdVideoAuthenticationSessionSettings.getCPtr(idVideoAuthenticationSessionSettings), idVideoAuthenticationSessionSettings, str, IdVideoAuthenticationCallbacks.getCPtr(idVideoAuthenticationCallbacks), idVideoAuthenticationCallbacks);
        if (jIdEngine_SpawnVideoAuthenticationSession__SWIG_2 == 0) {
            return null;
        }
        return new IdVideoAuthenticationSession(jIdEngine_SpawnVideoAuthenticationSession__SWIG_2, true);
    }

    public IdVideoAuthenticationSession SpawnVideoAuthenticationSession(IdVideoAuthenticationSessionSettings idVideoAuthenticationSessionSettings, String str) {
        long jIdEngine_SpawnVideoAuthenticationSession__SWIG_3 = jniidengineJNI.IdEngine_SpawnVideoAuthenticationSession__SWIG_3(this.swigCPtr, this, IdVideoAuthenticationSessionSettings.getCPtr(idVideoAuthenticationSessionSettings), idVideoAuthenticationSessionSettings, str);
        if (jIdEngine_SpawnVideoAuthenticationSession__SWIG_3 == 0) {
            return null;
        }
        return new IdVideoAuthenticationSession(jIdEngine_SpawnVideoAuthenticationSession__SWIG_3, true);
    }

    public static IdEngine Create(String str, boolean z, int i, boolean z2) {
        long jIdEngine_Create__SWIG_0 = jniidengineJNI.IdEngine_Create__SWIG_0(str, z, i, z2);
        if (jIdEngine_Create__SWIG_0 == 0) {
            return null;
        }
        return new IdEngine(jIdEngine_Create__SWIG_0, true);
    }

    public static IdEngine Create(String str, boolean z, int i) {
        long jIdEngine_Create__SWIG_1 = jniidengineJNI.IdEngine_Create__SWIG_1(str, z, i);
        if (jIdEngine_Create__SWIG_1 == 0) {
            return null;
        }
        return new IdEngine(jIdEngine_Create__SWIG_1, true);
    }

    public static IdEngine Create(String str, boolean z) {
        long jIdEngine_Create__SWIG_2 = jniidengineJNI.IdEngine_Create__SWIG_2(str, z);
        if (jIdEngine_Create__SWIG_2 == 0) {
            return null;
        }
        return new IdEngine(jIdEngine_Create__SWIG_2, true);
    }

    public static IdEngine Create(String str) {
        long jIdEngine_Create__SWIG_3 = jniidengineJNI.IdEngine_Create__SWIG_3(str);
        if (jIdEngine_Create__SWIG_3 == 0) {
            return null;
        }
        return new IdEngine(jIdEngine_Create__SWIG_3, true);
    }

    public static IdEngine Create(byte[] bArr, boolean z, int i, boolean z2) {
        long jIdEngine_Create__SWIG_4 = jniidengineJNI.IdEngine_Create__SWIG_4(bArr, z, i, z2);
        if (jIdEngine_Create__SWIG_4 == 0) {
            return null;
        }
        return new IdEngine(jIdEngine_Create__SWIG_4, true);
    }

    public static IdEngine Create(byte[] bArr, boolean z, int i) {
        long jIdEngine_Create__SWIG_5 = jniidengineJNI.IdEngine_Create__SWIG_5(bArr, z, i);
        if (jIdEngine_Create__SWIG_5 == 0) {
            return null;
        }
        return new IdEngine(jIdEngine_Create__SWIG_5, true);
    }

    public static IdEngine Create(byte[] bArr, boolean z) {
        long jIdEngine_Create__SWIG_6 = jniidengineJNI.IdEngine_Create__SWIG_6(bArr, z);
        if (jIdEngine_Create__SWIG_6 == 0) {
            return null;
        }
        return new IdEngine(jIdEngine_Create__SWIG_6, true);
    }

    public static IdEngine Create(byte[] bArr) {
        long jIdEngine_Create__SWIG_7 = jniidengineJNI.IdEngine_Create__SWIG_7(bArr);
        if (jIdEngine_Create__SWIG_7 == 0) {
            return null;
        }
        return new IdEngine(jIdEngine_Create__SWIG_7, true);
    }

    public static IdEngine CreateFromEmbeddedBundle(boolean z, int i, boolean z2) {
        long jIdEngine_CreateFromEmbeddedBundle__SWIG_0 = jniidengineJNI.IdEngine_CreateFromEmbeddedBundle__SWIG_0(z, i, z2);
        if (jIdEngine_CreateFromEmbeddedBundle__SWIG_0 == 0) {
            return null;
        }
        return new IdEngine(jIdEngine_CreateFromEmbeddedBundle__SWIG_0, true);
    }

    public static IdEngine CreateFromEmbeddedBundle(boolean z, int i) {
        long jIdEngine_CreateFromEmbeddedBundle__SWIG_1 = jniidengineJNI.IdEngine_CreateFromEmbeddedBundle__SWIG_1(z, i);
        if (jIdEngine_CreateFromEmbeddedBundle__SWIG_1 == 0) {
            return null;
        }
        return new IdEngine(jIdEngine_CreateFromEmbeddedBundle__SWIG_1, true);
    }

    public static IdEngine CreateFromEmbeddedBundle(boolean z) {
        long jIdEngine_CreateFromEmbeddedBundle__SWIG_2 = jniidengineJNI.IdEngine_CreateFromEmbeddedBundle__SWIG_2(z);
        if (jIdEngine_CreateFromEmbeddedBundle__SWIG_2 == 0) {
            return null;
        }
        return new IdEngine(jIdEngine_CreateFromEmbeddedBundle__SWIG_2, true);
    }

    public static IdEngine CreateFromEmbeddedBundle() {
        long jIdEngine_CreateFromEmbeddedBundle__SWIG_3 = jniidengineJNI.IdEngine_CreateFromEmbeddedBundle__SWIG_3();
        if (jIdEngine_CreateFromEmbeddedBundle__SWIG_3 == 0) {
            return null;
        }
        return new IdEngine(jIdEngine_CreateFromEmbeddedBundle__SWIG_3, true);
    }

    public static String GetVersion() {
        return jniidengineJNI.IdEngine_GetVersion();
    }
}
