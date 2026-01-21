package com.smartengines.nfc;

import com.smartengines.targets.code.CodeTargets;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.icao.MRZInfo;

/* compiled from: PassportKey.kt */
@Metadata(m513d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, m514d2 = {"Lcom/smartengines/nfc/PassportKey;", "", "passportNumber", "", "expirationDate", "birthDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPassportNumber", "()Ljava/lang/String;", "getExpirationDate", "getBirthDate", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "nfc_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PassportKey {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String birthDate;
    private final String expirationDate;
    private final String passportNumber;

    public static /* synthetic */ PassportKey copy$default(PassportKey passportKey, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passportKey.passportNumber;
        }
        if ((i & 2) != 0) {
            str2 = passportKey.expirationDate;
        }
        if ((i & 4) != 0) {
            str3 = passportKey.birthDate;
        }
        return passportKey.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPassportNumber() {
        return this.passportNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBirthDate() {
        return this.birthDate;
    }

    public final PassportKey copy(String passportNumber, String expirationDate, String birthDate) {
        Intrinsics.checkNotNullParameter(passportNumber, "passportNumber");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        return new PassportKey(passportNumber, expirationDate, birthDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportKey)) {
            return false;
        }
        PassportKey passportKey = (PassportKey) other;
        return Intrinsics.areEqual(this.passportNumber, passportKey.passportNumber) && Intrinsics.areEqual(this.expirationDate, passportKey.expirationDate) && Intrinsics.areEqual(this.birthDate, passportKey.birthDate);
    }

    public int hashCode() {
        return (((this.passportNumber.hashCode() * 31) + this.expirationDate.hashCode()) * 31) + this.birthDate.hashCode();
    }

    public String toString() {
        return "PassportKey(passportNumber=" + this.passportNumber + ", expirationDate=" + this.expirationDate + ", birthDate=" + this.birthDate + ')';
    }

    public PassportKey(String passportNumber, String expirationDate, String birthDate) {
        Intrinsics.checkNotNullParameter(passportNumber, "passportNumber");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        this.passportNumber = passportNumber;
        this.expirationDate = expirationDate;
        this.birthDate = birthDate;
    }

    public final String getPassportNumber() {
        return this.passportNumber;
    }

    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public final String getBirthDate() {
        return this.birthDate;
    }

    /* compiled from: PassportKey.kt */
    @Metadata(m513d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m514d2 = {"Lcom/smartengines/nfc/PassportKey$Companion;", "", "<init>", "()V", "fromMRZ", "Lcom/smartengines/nfc/PassportKey;", CodeTargets.Mrz.INTERNAL_ENGINE, "", "nfc_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PassportKey fromMRZ(String mrz) throws Exception {
            Intrinsics.checkNotNullParameter(mrz, "mrz");
            try {
                MRZInfo mRZInfo = new MRZInfo(mrz);
                String documentNumber = mRZInfo.getDocumentNumber();
                Intrinsics.checkNotNullExpressionValue(documentNumber, "getDocumentNumber(...)");
                String dateOfExpiry = mRZInfo.getDateOfExpiry();
                Intrinsics.checkNotNullExpressionValue(dateOfExpiry, "getDateOfExpiry(...)");
                String dateOfBirth = mRZInfo.getDateOfBirth();
                Intrinsics.checkNotNullExpressionValue(dateOfBirth, "getDateOfBirth(...)");
                return new PassportKey(documentNumber, dateOfExpiry, dateOfBirth);
            } catch (Exception e) {
                throw new Exception("Can't parse MRZ string: " + e);
            }
        }
    }
}
