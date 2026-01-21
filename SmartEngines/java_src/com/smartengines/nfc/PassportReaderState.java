package com.smartengines.nfc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PassportReaderState.kt */
@Metadata(m513d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, m514d2 = {"Lcom/smartengines/nfc/PassportReaderState;", "", "Disabled", "Waiting", "Reading", "Data", "Error", "NotSupported", "Lcom/smartengines/nfc/PassportReaderState$Data;", "Lcom/smartengines/nfc/PassportReaderState$Disabled;", "Lcom/smartengines/nfc/PassportReaderState$Error;", "Lcom/smartengines/nfc/PassportReaderState$NotSupported;", "Lcom/smartengines/nfc/PassportReaderState$Reading;", "Lcom/smartengines/nfc/PassportReaderState$Waiting;", "nfc_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public interface PassportReaderState {

    /* compiled from: PassportReaderState.kt */
    @Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m514d2 = {"Lcom/smartengines/nfc/PassportReaderState$Disabled;", "Lcom/smartengines/nfc/PassportReaderState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "nfc_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class Disabled implements PassportReaderState {
        public static final Disabled INSTANCE = new Disabled();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Disabled)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -27602262;
        }

        public String toString() {
            return "Disabled";
        }

        private Disabled() {
        }
    }

    /* compiled from: PassportReaderState.kt */
    @Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m514d2 = {"Lcom/smartengines/nfc/PassportReaderState$Waiting;", "Lcom/smartengines/nfc/PassportReaderState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "nfc_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class Waiting implements PassportReaderState {
        public static final Waiting INSTANCE = new Waiting();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Waiting)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 275398751;
        }

        public String toString() {
            return "Waiting";
        }

        private Waiting() {
        }
    }

    /* compiled from: PassportReaderState.kt */
    @Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m514d2 = {"Lcom/smartengines/nfc/PassportReaderState$Reading;", "Lcom/smartengines/nfc/PassportReaderState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "nfc_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class Reading implements PassportReaderState {
        public static final Reading INSTANCE = new Reading();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Reading)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 239499422;
        }

        public String toString() {
            return "Reading";
        }

        private Reading() {
        }
    }

    /* compiled from: PassportReaderState.kt */
    @Metadata(m513d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m514d2 = {"Lcom/smartengines/nfc/PassportReaderState$Data;", "Lcom/smartengines/nfc/PassportReaderState;", "data", "Lcom/smartengines/nfc/PassportData;", "<init>", "(Lcom/smartengines/nfc/PassportData;)V", "getData", "()Lcom/smartengines/nfc/PassportData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "nfc_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class Data implements PassportReaderState {
        private final PassportData data;

        public static /* synthetic */ Data copy$default(Data data, PassportData passportData, int i, Object obj) {
            if ((i & 1) != 0) {
                passportData = data.data;
            }
            return data.copy(passportData);
        }

        /* renamed from: component1, reason: from getter */
        public final PassportData getData() {
            return this.data;
        }

        public final Data copy(PassportData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new Data(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Data) && Intrinsics.areEqual(this.data, ((Data) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Data(data=" + this.data + ')';
        }

        public Data(PassportData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public final PassportData getData() {
            return this.data;
        }
    }

    /* compiled from: PassportReaderState.kt */
    @Metadata(m513d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m514d2 = {"Lcom/smartengines/nfc/PassportReaderState$Error;", "Lcom/smartengines/nfc/PassportReaderState;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "nfc_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class Error implements PassportReaderState {
        private final String message;

        public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final Error copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Error(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.message, ((Error) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.message + ')';
        }

        public Error(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: PassportReaderState.kt */
    @Metadata(m513d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m514d2 = {"Lcom/smartengines/nfc/PassportReaderState$NotSupported;", "Lcom/smartengines/nfc/PassportReaderState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "nfc_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final /* data */ class NotSupported implements PassportReaderState {
        public static final NotSupported INSTANCE = new NotSupported();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotSupported)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 431659081;
        }

        public String toString() {
            return "NotSupported";
        }

        private NotSupported() {
        }
    }
}
