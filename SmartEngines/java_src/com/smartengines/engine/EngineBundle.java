package com.smartengines.engine;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EngineBundle.kt */
@Metadata(m513d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m514d2 = {"Lcom/smartengines/engine/EngineBundle;", "", "File", "FirstFound", "Embedded", "Lcom/smartengines/engine/EngineBundle$Embedded;", "Lcom/smartengines/engine/EngineBundle$File;", "Lcom/smartengines/engine/EngineBundle$FirstFound;", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public interface EngineBundle {

    /* compiled from: EngineBundle.kt */
    @Metadata(m513d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m514d2 = {"Lcom/smartengines/engine/EngineBundle$File;", "Lcom/smartengines/engine/EngineBundle;", "filePath", "", "<init>", "(Ljava/lang/String;)V", "getFilePath", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class File implements EngineBundle {
        private final String filePath;

        public static /* synthetic */ File copy$default(File file, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = file.filePath;
            }
            return file.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFilePath() {
            return this.filePath;
        }

        public final File copy(String filePath) {
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            return new File(filePath);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof File) && Intrinsics.areEqual(this.filePath, ((File) other).filePath);
        }

        public int hashCode() {
            return this.filePath.hashCode();
        }

        public String toString() {
            return "File(filePath=" + this.filePath + ')';
        }

        public File(String filePath) {
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            this.filePath = filePath;
        }

        public final String getFilePath() {
            return this.filePath;
        }
    }

    /* compiled from: EngineBundle.kt */
    @Metadata(m513d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m514d2 = {"Lcom/smartengines/engine/EngineBundle$FirstFound;", "Lcom/smartengines/engine/EngineBundle;", "dirToSearch", "", "fileExtension", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDirToSearch", "()Ljava/lang/String;", "getFileExtension", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class FirstFound implements EngineBundle {
        private final String dirToSearch;
        private final String fileExtension;

        public static /* synthetic */ FirstFound copy$default(FirstFound firstFound, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = firstFound.dirToSearch;
            }
            if ((i & 2) != 0) {
                str2 = firstFound.fileExtension;
            }
            return firstFound.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDirToSearch() {
            return this.dirToSearch;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFileExtension() {
            return this.fileExtension;
        }

        public final FirstFound copy(String dirToSearch, String fileExtension) {
            Intrinsics.checkNotNullParameter(dirToSearch, "dirToSearch");
            Intrinsics.checkNotNullParameter(fileExtension, "fileExtension");
            return new FirstFound(dirToSearch, fileExtension);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FirstFound)) {
                return false;
            }
            FirstFound firstFound = (FirstFound) other;
            return Intrinsics.areEqual(this.dirToSearch, firstFound.dirToSearch) && Intrinsics.areEqual(this.fileExtension, firstFound.fileExtension);
        }

        public int hashCode() {
            return (this.dirToSearch.hashCode() * 31) + this.fileExtension.hashCode();
        }

        public String toString() {
            return "FirstFound(dirToSearch=" + this.dirToSearch + ", fileExtension=" + this.fileExtension + ')';
        }

        public FirstFound(String dirToSearch, String fileExtension) {
            Intrinsics.checkNotNullParameter(dirToSearch, "dirToSearch");
            Intrinsics.checkNotNullParameter(fileExtension, "fileExtension");
            this.dirToSearch = dirToSearch;
            this.fileExtension = fileExtension;
        }

        public final String getDirToSearch() {
            return this.dirToSearch;
        }

        public final String getFileExtension() {
            return this.fileExtension;
        }
    }

    /* compiled from: EngineBundle.kt */
    @Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m514d2 = {"Lcom/smartengines/engine/EngineBundle$Embedded;", "Lcom/smartengines/engine/EngineBundle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class Embedded implements EngineBundle {
        public static final Embedded INSTANCE = new Embedded();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Embedded)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -502645599;
        }

        public String toString() {
            return "Embedded";
        }

        private Embedded() {
        }
    }
}
