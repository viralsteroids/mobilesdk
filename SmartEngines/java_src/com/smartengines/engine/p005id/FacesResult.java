package com.smartengines.engine.p005id;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Faces.kt */
@Metadata(m513d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m514d2 = {"Lcom/smartengines/engine/id/FacesResult;", "", "Success", "Error", "Exception", "Lcom/smartengines/engine/id/FacesResult$Error;", "Lcom/smartengines/engine/id/FacesResult$Exception;", "Lcom/smartengines/engine/id/FacesResult$Success;", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public interface FacesResult {

    /* compiled from: Faces.kt */
    @Metadata(m513d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m514d2 = {"Lcom/smartengines/engine/id/FacesResult$Success;", "Lcom/smartengines/engine/id/FacesResult;", "similarity", "", "<init>", "(D)V", "getSimilarity", "()D", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class Success implements FacesResult {
        private final double similarity;

        public static /* synthetic */ Success copy$default(Success success, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = success.similarity;
            }
            return success.copy(d);
        }

        /* renamed from: component1, reason: from getter */
        public final double getSimilarity() {
            return this.similarity;
        }

        public final Success copy(double similarity) {
            return new Success(similarity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Double.compare(this.similarity, ((Success) other).similarity) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.similarity);
        }

        public String toString() {
            return "Success(similarity=" + this.similarity + ')';
        }

        public Success(double d) {
            this.similarity = d;
        }

        public final double getSimilarity() {
            return this.similarity;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Faces.kt */
    @Metadata(m513d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m514d2 = {"Lcom/smartengines/engine/id/FacesResult$Error;", "Lcom/smartengines/engine/id/FacesResult;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", "AFaceNotFound", "BFaceNotFound", "FaceNotFound", "NoAccumulatedResult", "Companion", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class Error implements FacesResult {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Error[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int code;
        public static final Error AFaceNotFound = new Error("AFaceNotFound", 0, 2);
        public static final Error BFaceNotFound = new Error("BFaceNotFound", 1, 3);
        public static final Error FaceNotFound = new Error("FaceNotFound", 2, 4);
        public static final Error NoAccumulatedResult = new Error("NoAccumulatedResult", 3, 5);

        private static final /* synthetic */ Error[] $values() {
            return new Error[]{AFaceNotFound, BFaceNotFound, FaceNotFound, NoAccumulatedResult};
        }

        public static EnumEntries<Error> getEntries() {
            return $ENTRIES;
        }

        private Error(String str, int i, int i2) {
            this.code = i2;
        }

        public final int getCode() {
            return this.code;
        }

        static {
            Error[] errorArr$values = $values();
            $VALUES = errorArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(errorArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: Faces.kt */
        @Metadata(m513d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m514d2 = {"Lcom/smartengines/engine/id/FacesResult$Error$Companion;", "", "<init>", "()V", "fromInt", "Lcom/smartengines/engine/id/FacesResult$Error;", "value", "", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Error fromInt(int value) {
                for (Error error : Error.getEntries()) {
                    if (error.getCode() == value) {
                        return error;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }

        public static Error valueOf(String str) {
            return (Error) Enum.valueOf(Error.class, str);
        }

        public static Error[] values() {
            return (Error[]) $VALUES.clone();
        }
    }

    /* compiled from: Faces.kt */
    @Metadata(m513d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m514d2 = {"Lcom/smartengines/engine/id/FacesResult$Exception;", "Lcom/smartengines/engine/id/FacesResult;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class Exception implements FacesResult {
        private final String message;

        public static /* synthetic */ Exception copy$default(Exception exception, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = exception.message;
            }
            return exception.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final Exception copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Exception(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Exception) && Intrinsics.areEqual(this.message, ((Exception) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "Exception(message=" + this.message + ')';
        }

        public Exception(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public final String getMessage() {
            return this.message;
        }
    }
}
