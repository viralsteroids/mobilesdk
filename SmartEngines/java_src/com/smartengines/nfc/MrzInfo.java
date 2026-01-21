package com.smartengines.nfc;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jmrtd.lds.icao.MRZInfo;

/* compiled from: MrzInfo.kt */
@Metadata(m513d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u000e\u0010\u0012J\u0006\u0010\u001f\u001a\u00020\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003Jw\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014¨\u00062"}, m514d2 = {"Lcom/smartengines/nfc/MrzInfo;", "", "fullString", "", "documentCode", "issuingState", "primaryIdentifier", "secondaryIdentifier", "documentNumber", "nationality", "dateOfBirth", HintConstants.AUTOFILL_HINT_GENDER, "dateOfExpiry", "personalNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "jmrtdMRZInfo", "Lorg/jmrtd/lds/icao/MRZInfo;", "(Lorg/jmrtd/lds/icao/MRZInfo;)V", "getFullString", "()Ljava/lang/String;", "getDocumentCode", "getIssuingState", "getPrimaryIdentifier", "getSecondaryIdentifier", "getDocumentNumber", "getNationality", "getDateOfBirth", "getGender", "getDateOfExpiry", "getPersonalNumber", "toSingleLine", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "nfc_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MrzInfo {
    private final String dateOfBirth;
    private final String dateOfExpiry;
    private final String documentCode;
    private final String documentNumber;
    private final String fullString;
    private final String gender;
    private final String issuingState;
    private final String nationality;
    private final String personalNumber;
    private final String primaryIdentifier;
    private final String secondaryIdentifier;

    public static /* synthetic */ MrzInfo copy$default(MrzInfo mrzInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mrzInfo.fullString;
        }
        if ((i & 2) != 0) {
            str2 = mrzInfo.documentCode;
        }
        if ((i & 4) != 0) {
            str3 = mrzInfo.issuingState;
        }
        if ((i & 8) != 0) {
            str4 = mrzInfo.primaryIdentifier;
        }
        if ((i & 16) != 0) {
            str5 = mrzInfo.secondaryIdentifier;
        }
        if ((i & 32) != 0) {
            str6 = mrzInfo.documentNumber;
        }
        if ((i & 64) != 0) {
            str7 = mrzInfo.nationality;
        }
        if ((i & 128) != 0) {
            str8 = mrzInfo.dateOfBirth;
        }
        if ((i & 256) != 0) {
            str9 = mrzInfo.gender;
        }
        if ((i & 512) != 0) {
            str10 = mrzInfo.dateOfExpiry;
        }
        if ((i & 1024) != 0) {
            str11 = mrzInfo.personalNumber;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        String str17 = str7;
        String str18 = str5;
        String str19 = str3;
        return mrzInfo.copy(str, str2, str19, str4, str18, str16, str17, str14, str15, str12, str13);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFullString() {
        return this.fullString;
    }

    /* renamed from: component10, reason: from getter */
    public final String getDateOfExpiry() {
        return this.dateOfExpiry;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPersonalNumber() {
        return this.personalNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDocumentCode() {
        return this.documentCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIssuingState() {
        return this.issuingState;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPrimaryIdentifier() {
        return this.primaryIdentifier;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSecondaryIdentifier() {
        return this.secondaryIdentifier;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    /* renamed from: component7, reason: from getter */
    public final String getNationality() {
        return this.nationality;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* renamed from: component9, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    public final MrzInfo copy(String fullString, String documentCode, String issuingState, String primaryIdentifier, String secondaryIdentifier, String documentNumber, String nationality, String dateOfBirth, String gender, String dateOfExpiry, String personalNumber) {
        Intrinsics.checkNotNullParameter(fullString, "fullString");
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(issuingState, "issuingState");
        Intrinsics.checkNotNullParameter(primaryIdentifier, "primaryIdentifier");
        Intrinsics.checkNotNullParameter(secondaryIdentifier, "secondaryIdentifier");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        Intrinsics.checkNotNullParameter(personalNumber, "personalNumber");
        return new MrzInfo(fullString, documentCode, issuingState, primaryIdentifier, secondaryIdentifier, documentNumber, nationality, dateOfBirth, gender, dateOfExpiry, personalNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MrzInfo)) {
            return false;
        }
        MrzInfo mrzInfo = (MrzInfo) other;
        return Intrinsics.areEqual(this.fullString, mrzInfo.fullString) && Intrinsics.areEqual(this.documentCode, mrzInfo.documentCode) && Intrinsics.areEqual(this.issuingState, mrzInfo.issuingState) && Intrinsics.areEqual(this.primaryIdentifier, mrzInfo.primaryIdentifier) && Intrinsics.areEqual(this.secondaryIdentifier, mrzInfo.secondaryIdentifier) && Intrinsics.areEqual(this.documentNumber, mrzInfo.documentNumber) && Intrinsics.areEqual(this.nationality, mrzInfo.nationality) && Intrinsics.areEqual(this.dateOfBirth, mrzInfo.dateOfBirth) && Intrinsics.areEqual(this.gender, mrzInfo.gender) && Intrinsics.areEqual(this.dateOfExpiry, mrzInfo.dateOfExpiry) && Intrinsics.areEqual(this.personalNumber, mrzInfo.personalNumber);
    }

    public int hashCode() {
        return (((((((((((((((((((this.fullString.hashCode() * 31) + this.documentCode.hashCode()) * 31) + this.issuingState.hashCode()) * 31) + this.primaryIdentifier.hashCode()) * 31) + this.secondaryIdentifier.hashCode()) * 31) + this.documentNumber.hashCode()) * 31) + this.nationality.hashCode()) * 31) + this.dateOfBirth.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.dateOfExpiry.hashCode()) * 31) + this.personalNumber.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MrzInfo(fullString=");
        sb.append(this.fullString).append(", documentCode=").append(this.documentCode).append(", issuingState=").append(this.issuingState).append(", primaryIdentifier=").append(this.primaryIdentifier).append(", secondaryIdentifier=").append(this.secondaryIdentifier).append(", documentNumber=").append(this.documentNumber).append(", nationality=").append(this.nationality).append(", dateOfBirth=").append(this.dateOfBirth).append(", gender=").append(this.gender).append(", dateOfExpiry=").append(this.dateOfExpiry).append(", personalNumber=").append(this.personalNumber).append(')');
        return sb.toString();
    }

    public MrzInfo(String fullString, String documentCode, String issuingState, String primaryIdentifier, String secondaryIdentifier, String documentNumber, String nationality, String dateOfBirth, String gender, String dateOfExpiry, String personalNumber) {
        Intrinsics.checkNotNullParameter(fullString, "fullString");
        Intrinsics.checkNotNullParameter(documentCode, "documentCode");
        Intrinsics.checkNotNullParameter(issuingState, "issuingState");
        Intrinsics.checkNotNullParameter(primaryIdentifier, "primaryIdentifier");
        Intrinsics.checkNotNullParameter(secondaryIdentifier, "secondaryIdentifier");
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        Intrinsics.checkNotNullParameter(personalNumber, "personalNumber");
        this.fullString = fullString;
        this.documentCode = documentCode;
        this.issuingState = issuingState;
        this.primaryIdentifier = primaryIdentifier;
        this.secondaryIdentifier = secondaryIdentifier;
        this.documentNumber = documentNumber;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.dateOfExpiry = dateOfExpiry;
        this.personalNumber = personalNumber;
    }

    public final String getFullString() {
        return this.fullString;
    }

    public final String getDocumentCode() {
        return this.documentCode;
    }

    public final String getIssuingState() {
        return this.issuingState;
    }

    public final String getPrimaryIdentifier() {
        return this.primaryIdentifier;
    }

    public final String getSecondaryIdentifier() {
        return this.secondaryIdentifier;
    }

    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final String getNationality() {
        return this.nationality;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getDateOfExpiry() {
        return this.dateOfExpiry;
    }

    public final String getPersonalNumber() {
        return this.personalNumber;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MrzInfo(MRZInfo jmrtdMRZInfo) {
        Intrinsics.checkNotNullParameter(jmrtdMRZInfo, "jmrtdMRZInfo");
        String string = jmrtdMRZInfo.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String documentCode = jmrtdMRZInfo.getDocumentCode();
        Intrinsics.checkNotNullExpressionValue(documentCode, "getDocumentCode(...)");
        String issuingState = jmrtdMRZInfo.getIssuingState();
        Intrinsics.checkNotNullExpressionValue(issuingState, "getIssuingState(...)");
        String primaryIdentifier = jmrtdMRZInfo.getPrimaryIdentifier();
        Intrinsics.checkNotNullExpressionValue(primaryIdentifier, "getPrimaryIdentifier(...)");
        String secondaryIdentifier = jmrtdMRZInfo.getSecondaryIdentifier();
        Intrinsics.checkNotNullExpressionValue(secondaryIdentifier, "getSecondaryIdentifier(...)");
        String documentNumber = jmrtdMRZInfo.getDocumentNumber();
        Intrinsics.checkNotNullExpressionValue(documentNumber, "getDocumentNumber(...)");
        String nationality = jmrtdMRZInfo.getNationality();
        Intrinsics.checkNotNullExpressionValue(nationality, "getNationality(...)");
        String dateOfBirth = jmrtdMRZInfo.getDateOfBirth();
        Intrinsics.checkNotNullExpressionValue(dateOfBirth, "getDateOfBirth(...)");
        String string2 = jmrtdMRZInfo.getGender().toString();
        String dateOfExpiry = jmrtdMRZInfo.getDateOfExpiry();
        Intrinsics.checkNotNullExpressionValue(dateOfExpiry, "getDateOfExpiry(...)");
        String personalNumber = jmrtdMRZInfo.getPersonalNumber();
        Intrinsics.checkNotNullExpressionValue(personalNumber, "getPersonalNumber(...)");
        this(string, documentCode, issuingState, primaryIdentifier, secondaryIdentifier, documentNumber, nationality, dateOfBirth, string2, dateOfExpiry, personalNumber);
    }

    public final String toSingleLine() {
        return StringsKt.replace$default(this.fullString, "\n", "", false, 4, (Object) null);
    }
}
