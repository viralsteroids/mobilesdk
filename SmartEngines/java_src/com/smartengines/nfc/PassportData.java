package com.smartengines.nfc;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PassportData.kt */
@Metadata(m513d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006$"}, m514d2 = {"Lcom/smartengines/nfc/PassportData;", "", "mrzInfo", "Lcom/smartengines/nfc/MrzInfo;", "facesData", "", "Lcom/smartengines/nfc/FaceImageData;", "otherFields", "", "", "chipAuth", "Lcom/smartengines/nfc/AuthResult;", "dataAuth", "<init>", "(Lcom/smartengines/nfc/MrzInfo;Ljava/util/List;Ljava/util/Map;Lcom/smartengines/nfc/AuthResult;Lcom/smartengines/nfc/AuthResult;)V", "getMrzInfo", "()Lcom/smartengines/nfc/MrzInfo;", "getFacesData", "()Ljava/util/List;", "getOtherFields", "()Ljava/util/Map;", "getChipAuth", "()Lcom/smartengines/nfc/AuthResult;", "getDataAuth", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "nfc_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PassportData {
    private final AuthResult chipAuth;
    private final AuthResult dataAuth;
    private final List<FaceImageData> facesData;
    private final MrzInfo mrzInfo;
    private final Map<String, String> otherFields;

    public static /* synthetic */ PassportData copy$default(PassportData passportData, MrzInfo mrzInfo, List list, Map map, AuthResult authResult, AuthResult authResult2, int i, Object obj) {
        if ((i & 1) != 0) {
            mrzInfo = passportData.mrzInfo;
        }
        if ((i & 2) != 0) {
            list = passportData.facesData;
        }
        if ((i & 4) != 0) {
            map = passportData.otherFields;
        }
        if ((i & 8) != 0) {
            authResult = passportData.chipAuth;
        }
        if ((i & 16) != 0) {
            authResult2 = passportData.dataAuth;
        }
        AuthResult authResult3 = authResult2;
        Map map2 = map;
        return passportData.copy(mrzInfo, list, map2, authResult, authResult3);
    }

    /* renamed from: component1, reason: from getter */
    public final MrzInfo getMrzInfo() {
        return this.mrzInfo;
    }

    public final List<FaceImageData> component2() {
        return this.facesData;
    }

    public final Map<String, String> component3() {
        return this.otherFields;
    }

    /* renamed from: component4, reason: from getter */
    public final AuthResult getChipAuth() {
        return this.chipAuth;
    }

    /* renamed from: component5, reason: from getter */
    public final AuthResult getDataAuth() {
        return this.dataAuth;
    }

    public final PassportData copy(MrzInfo mrzInfo, List<FaceImageData> facesData, Map<String, String> otherFields, AuthResult chipAuth, AuthResult dataAuth) {
        Intrinsics.checkNotNullParameter(mrzInfo, "mrzInfo");
        Intrinsics.checkNotNullParameter(facesData, "facesData");
        Intrinsics.checkNotNullParameter(otherFields, "otherFields");
        return new PassportData(mrzInfo, facesData, otherFields, chipAuth, dataAuth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportData)) {
            return false;
        }
        PassportData passportData = (PassportData) other;
        return Intrinsics.areEqual(this.mrzInfo, passportData.mrzInfo) && Intrinsics.areEqual(this.facesData, passportData.facesData) && Intrinsics.areEqual(this.otherFields, passportData.otherFields) && Intrinsics.areEqual(this.chipAuth, passportData.chipAuth) && Intrinsics.areEqual(this.dataAuth, passportData.dataAuth);
    }

    public int hashCode() {
        int iHashCode = ((((this.mrzInfo.hashCode() * 31) + this.facesData.hashCode()) * 31) + this.otherFields.hashCode()) * 31;
        AuthResult authResult = this.chipAuth;
        int iHashCode2 = (iHashCode + (authResult == null ? 0 : authResult.hashCode())) * 31;
        AuthResult authResult2 = this.dataAuth;
        return iHashCode2 + (authResult2 != null ? authResult2.hashCode() : 0);
    }

    public String toString() {
        return "PassportData(mrzInfo=" + this.mrzInfo + ", facesData=" + this.facesData + ", otherFields=" + this.otherFields + ", chipAuth=" + this.chipAuth + ", dataAuth=" + this.dataAuth + ')';
    }

    public PassportData(MrzInfo mrzInfo, List<FaceImageData> facesData, Map<String, String> otherFields, AuthResult authResult, AuthResult authResult2) {
        Intrinsics.checkNotNullParameter(mrzInfo, "mrzInfo");
        Intrinsics.checkNotNullParameter(facesData, "facesData");
        Intrinsics.checkNotNullParameter(otherFields, "otherFields");
        this.mrzInfo = mrzInfo;
        this.facesData = facesData;
        this.otherFields = otherFields;
        this.chipAuth = authResult;
        this.dataAuth = authResult2;
    }

    public final MrzInfo getMrzInfo() {
        return this.mrzInfo;
    }

    public final List<FaceImageData> getFacesData() {
        return this.facesData;
    }

    public /* synthetic */ PassportData(MrzInfo mrzInfo, List list, Map map, AuthResult authResult, AuthResult authResult2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mrzInfo, list, (i & 4) != 0 ? MapsKt.emptyMap() : map, authResult, authResult2);
    }

    public final Map<String, String> getOtherFields() {
        return this.otherFields;
    }

    public final AuthResult getChipAuth() {
        return this.chipAuth;
    }

    public final AuthResult getDataAuth() {
        return this.dataAuth;
    }
}
