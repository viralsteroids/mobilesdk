package com.smartengines.doc;

/* loaded from: classes3.dex */
public class DocSceneInfo {
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;

    public DocSceneInfo(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    public static long getCPtr(DocSceneInfo docSceneInfo) {
        if (docSceneInfo == null) {
            return 0L;
        }
        return docSceneInfo.swigCPtr;
    }

    public static long swigRelease(DocSceneInfo docSceneInfo) {
        if (docSceneInfo == null) {
            return 0L;
        }
        if (!docSceneInfo.swigCMemOwn) {
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        long j = docSceneInfo.swigCPtr;
        docSceneInfo.swigCMemOwn = false;
        docSceneInfo.delete();
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
                jnidocengineJNI.delete_DocSceneInfo(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public boolean IsGarbage() {
        return jnidocengineJNI.DocSceneInfo_IsGarbage(this.swigCPtr, this);
    }

    public int SceneID() {
        return jnidocengineJNI.DocSceneInfo_SceneID(this.swigCPtr, this);
    }

    public int GarbageReasonsCount() {
        return jnidocengineJNI.DocSceneInfo_GarbageReasonsCount(this.swigCPtr, this);
    }

    public String GarbageReason(int i) {
        return jnidocengineJNI.DocSceneInfo_GarbageReason(this.swigCPtr, this, i);
    }

    public SceneOriginType GetSceneOriginType() {
        return SceneOriginType.swigToEnum(jnidocengineJNI.DocSceneInfo_GetSceneOriginType(this.swigCPtr, this));
    }

    public int GetForensicCheckFieldsCount() {
        return jnidocengineJNI.DocSceneInfo_GetForensicCheckFieldsCount(this.swigCPtr, this);
    }

    public boolean HasForensicCheckField(String str) {
        return jnidocengineJNI.DocSceneInfo_HasForensicCheckField(this.swigCPtr, this, str);
    }

    public DocForensicCheckField GetForensicCheckField(String str) {
        return new DocForensicCheckField(jnidocengineJNI.DocSceneInfo_GetForensicCheckField(this.swigCPtr, this, str), false);
    }

    public DocForensicCheckField GetForensicCheckFieldPtr(String str) {
        long jDocSceneInfo_GetForensicCheckFieldPtr = jnidocengineJNI.DocSceneInfo_GetForensicCheckFieldPtr(this.swigCPtr, this, str);
        if (jDocSceneInfo_GetForensicCheckFieldPtr == 0) {
            return null;
        }
        return new DocForensicCheckField(jDocSceneInfo_GetForensicCheckFieldPtr, false);
    }

    public DocForensicCheckFieldsIterator ForensicCheckFieldsBegin() {
        return new DocForensicCheckFieldsIterator(jnidocengineJNI.DocSceneInfo_ForensicCheckFieldsBegin(this.swigCPtr, this), true);
    }

    public DocForensicCheckFieldsIterator ForensicCheckFieldsEnd() {
        return new DocForensicCheckFieldsIterator(jnidocengineJNI.DocSceneInfo_ForensicCheckFieldsEnd(this.swigCPtr, this), true);
    }

    public static final class SceneOriginType {
        public static final SceneOriginType DIGITAL_BORN;
        public static final SceneOriginType OPTICAL_CAMERA;
        public static final SceneOriginType OPTICAL_SCANNER;
        public static final SceneOriginType UNDEFINED;
        private static int swigNext;
        private static SceneOriginType[] swigValues;
        private final String swigName;
        private final int swigValue;

        static {
            SceneOriginType sceneOriginType = new SceneOriginType("UNDEFINED", jnidocengineJNI.DocSceneInfo_SceneOriginType_UNDEFINED_get());
            UNDEFINED = sceneOriginType;
            SceneOriginType sceneOriginType2 = new SceneOriginType("DIGITAL_BORN", jnidocengineJNI.DocSceneInfo_SceneOriginType_DIGITAL_BORN_get());
            DIGITAL_BORN = sceneOriginType2;
            SceneOriginType sceneOriginType3 = new SceneOriginType("OPTICAL_SCANNER", jnidocengineJNI.DocSceneInfo_SceneOriginType_OPTICAL_SCANNER_get());
            OPTICAL_SCANNER = sceneOriginType3;
            SceneOriginType sceneOriginType4 = new SceneOriginType("OPTICAL_CAMERA", jnidocengineJNI.DocSceneInfo_SceneOriginType_OPTICAL_CAMERA_get());
            OPTICAL_CAMERA = sceneOriginType4;
            swigValues = new SceneOriginType[]{sceneOriginType, sceneOriginType2, sceneOriginType3, sceneOriginType4};
            swigNext = 0;
        }

        public final int swigValue() {
            return this.swigValue;
        }

        public String toString() {
            return this.swigName;
        }

        public static SceneOriginType swigToEnum(int i) {
            SceneOriginType[] sceneOriginTypeArr = swigValues;
            if (i < sceneOriginTypeArr.length && i >= 0) {
                SceneOriginType sceneOriginType = sceneOriginTypeArr[i];
                if (sceneOriginType.swigValue == i) {
                    return sceneOriginType;
                }
            }
            int i2 = 0;
            while (true) {
                SceneOriginType[] sceneOriginTypeArr2 = swigValues;
                if (i2 < sceneOriginTypeArr2.length) {
                    SceneOriginType sceneOriginType2 = sceneOriginTypeArr2[i2];
                    if (sceneOriginType2.swigValue == i) {
                        return sceneOriginType2;
                    }
                    i2++;
                } else {
                    throw new IllegalArgumentException("No enum " + SceneOriginType.class + " with value " + i);
                }
            }
        }

        private SceneOriginType(String str) {
            this.swigName = str;
            int i = swigNext;
            swigNext = i + 1;
            this.swigValue = i;
        }

        private SceneOriginType(String str, int i) {
            this.swigName = str;
            this.swigValue = i;
            swigNext = i + 1;
        }

        private SceneOriginType(String str, SceneOriginType sceneOriginType) {
            this.swigName = str;
            int i = sceneOriginType.swigValue;
            this.swigValue = i;
            swigNext = i + 1;
        }
    }
}
