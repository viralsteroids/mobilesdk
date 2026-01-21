package com.smartengines.targets.code;

import androidx.compose.p000ui.layout.LayoutKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CodeSettings.kt */
@Metadata(m513d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B»\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0004HÆ\u0003J\t\u0010-\u001a\u00020\u0004HÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u00102\u001a\u00020\nHÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J½\u0001\u00109\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u000e\u001a\u00020\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00062\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00062\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0006HÆ\u0001J\u0013\u0010:\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020\u0006HÖ\u0001J\t\u0010>\u001a\u00020\u0004HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0014\u0010\f\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0014\u0010\u000e\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0014\u0010\u0010\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0014\u0010\u0012\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0014\u0010\u0014\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001a¨\u0006?"}, m514d2 = {"Lcom/smartengines/targets/code/CodeSettingsMock;", "Lcom/smartengines/targets/code/CodeSettings;", "barcodeTypes", "", "", "barcodeMax", "", "barcodeRoi", "barcodeEffort", "barcodeDecode", "", "barcodeSmart", "barcodeNonpayment", "cardTypes", "cardShowOptionalData", "paymentTypes", "lineMax", "lineTypes", "meterMax", "plateTypes", "containerMax", "<init>", "(Ljava/util/Set;ILjava/lang/String;Ljava/lang/String;ZZZLjava/util/Set;ZLjava/util/Set;ILjava/util/Set;ILjava/util/Set;I)V", "getBarcodeTypes", "()Ljava/util/Set;", "getBarcodeMax", "()I", "getBarcodeRoi", "()Ljava/lang/String;", "getBarcodeEffort", "getBarcodeDecode", "()Z", "getBarcodeSmart", "getBarcodeNonpayment", "getCardTypes", "getCardShowOptionalData", "getPaymentTypes", "getLineMax", "getLineTypes", "getMeterMax", "getPlateTypes", "getContainerMax", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "other", "", "hashCode", "toString", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CodeSettingsMock implements CodeSettings {
    private final boolean barcodeDecode;
    private final String barcodeEffort;
    private final int barcodeMax;
    private final boolean barcodeNonpayment;
    private final String barcodeRoi;
    private final boolean barcodeSmart;
    private final Set<String> barcodeTypes;
    private final boolean cardShowOptionalData;
    private final Set<String> cardTypes;
    private final int containerMax;
    private final int lineMax;
    private final Set<String> lineTypes;
    private final int meterMax;
    private final Set<String> paymentTypes;
    private final Set<String> plateTypes;

    public CodeSettingsMock() {
        this(null, 0, null, null, false, false, false, null, false, null, 0, null, 0, null, 0, LayoutKt.LargeDimension, null);
    }

    public final Set<String> component1() {
        return this.barcodeTypes;
    }

    public final Set<String> component10() {
        return this.paymentTypes;
    }

    /* renamed from: component11, reason: from getter */
    public final int getLineMax() {
        return this.lineMax;
    }

    public final Set<String> component12() {
        return this.lineTypes;
    }

    /* renamed from: component13, reason: from getter */
    public final int getMeterMax() {
        return this.meterMax;
    }

    public final Set<String> component14() {
        return this.plateTypes;
    }

    /* renamed from: component15, reason: from getter */
    public final int getContainerMax() {
        return this.containerMax;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBarcodeMax() {
        return this.barcodeMax;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBarcodeRoi() {
        return this.barcodeRoi;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBarcodeEffort() {
        return this.barcodeEffort;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getBarcodeDecode() {
        return this.barcodeDecode;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getBarcodeSmart() {
        return this.barcodeSmart;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getBarcodeNonpayment() {
        return this.barcodeNonpayment;
    }

    public final Set<String> component8() {
        return this.cardTypes;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getCardShowOptionalData() {
        return this.cardShowOptionalData;
    }

    public final CodeSettingsMock copy(Set<String> barcodeTypes, int barcodeMax, String barcodeRoi, String barcodeEffort, boolean barcodeDecode, boolean barcodeSmart, boolean barcodeNonpayment, Set<String> cardTypes, boolean cardShowOptionalData, Set<String> paymentTypes, int lineMax, Set<String> lineTypes, int meterMax, Set<String> plateTypes, int containerMax) {
        Intrinsics.checkNotNullParameter(barcodeTypes, "barcodeTypes");
        Intrinsics.checkNotNullParameter(barcodeRoi, "barcodeRoi");
        Intrinsics.checkNotNullParameter(barcodeEffort, "barcodeEffort");
        Intrinsics.checkNotNullParameter(cardTypes, "cardTypes");
        Intrinsics.checkNotNullParameter(paymentTypes, "paymentTypes");
        Intrinsics.checkNotNullParameter(lineTypes, "lineTypes");
        Intrinsics.checkNotNullParameter(plateTypes, "plateTypes");
        return new CodeSettingsMock(barcodeTypes, barcodeMax, barcodeRoi, barcodeEffort, barcodeDecode, barcodeSmart, barcodeNonpayment, cardTypes, cardShowOptionalData, paymentTypes, lineMax, lineTypes, meterMax, plateTypes, containerMax);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeSettingsMock)) {
            return false;
        }
        CodeSettingsMock codeSettingsMock = (CodeSettingsMock) other;
        return Intrinsics.areEqual(this.barcodeTypes, codeSettingsMock.barcodeTypes) && this.barcodeMax == codeSettingsMock.barcodeMax && Intrinsics.areEqual(this.barcodeRoi, codeSettingsMock.barcodeRoi) && Intrinsics.areEqual(this.barcodeEffort, codeSettingsMock.barcodeEffort) && this.barcodeDecode == codeSettingsMock.barcodeDecode && this.barcodeSmart == codeSettingsMock.barcodeSmart && this.barcodeNonpayment == codeSettingsMock.barcodeNonpayment && Intrinsics.areEqual(this.cardTypes, codeSettingsMock.cardTypes) && this.cardShowOptionalData == codeSettingsMock.cardShowOptionalData && Intrinsics.areEqual(this.paymentTypes, codeSettingsMock.paymentTypes) && this.lineMax == codeSettingsMock.lineMax && Intrinsics.areEqual(this.lineTypes, codeSettingsMock.lineTypes) && this.meterMax == codeSettingsMock.meterMax && Intrinsics.areEqual(this.plateTypes, codeSettingsMock.plateTypes) && this.containerMax == codeSettingsMock.containerMax;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.barcodeTypes.hashCode() * 31) + Integer.hashCode(this.barcodeMax)) * 31) + this.barcodeRoi.hashCode()) * 31) + this.barcodeEffort.hashCode()) * 31) + Boolean.hashCode(this.barcodeDecode)) * 31) + Boolean.hashCode(this.barcodeSmart)) * 31) + Boolean.hashCode(this.barcodeNonpayment)) * 31) + this.cardTypes.hashCode()) * 31) + Boolean.hashCode(this.cardShowOptionalData)) * 31) + this.paymentTypes.hashCode()) * 31) + Integer.hashCode(this.lineMax)) * 31) + this.lineTypes.hashCode()) * 31) + Integer.hashCode(this.meterMax)) * 31) + this.plateTypes.hashCode()) * 31) + Integer.hashCode(this.containerMax);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CodeSettingsMock(barcodeTypes=");
        sb.append(this.barcodeTypes).append(", barcodeMax=").append(this.barcodeMax).append(", barcodeRoi=").append(this.barcodeRoi).append(", barcodeEffort=").append(this.barcodeEffort).append(", barcodeDecode=").append(this.barcodeDecode).append(", barcodeSmart=").append(this.barcodeSmart).append(", barcodeNonpayment=").append(this.barcodeNonpayment).append(", cardTypes=").append(this.cardTypes).append(", cardShowOptionalData=").append(this.cardShowOptionalData).append(", paymentTypes=").append(this.paymentTypes).append(", lineMax=").append(this.lineMax).append(", lineTypes=");
        sb.append(this.lineTypes).append(", meterMax=").append(this.meterMax).append(", plateTypes=").append(this.plateTypes).append(", containerMax=").append(this.containerMax).append(')');
        return sb.toString();
    }

    public CodeSettingsMock(Set<String> barcodeTypes, int i, String barcodeRoi, String barcodeEffort, boolean z, boolean z2, boolean z3, Set<String> cardTypes, boolean z4, Set<String> paymentTypes, int i2, Set<String> lineTypes, int i3, Set<String> plateTypes, int i4) {
        Intrinsics.checkNotNullParameter(barcodeTypes, "barcodeTypes");
        Intrinsics.checkNotNullParameter(barcodeRoi, "barcodeRoi");
        Intrinsics.checkNotNullParameter(barcodeEffort, "barcodeEffort");
        Intrinsics.checkNotNullParameter(cardTypes, "cardTypes");
        Intrinsics.checkNotNullParameter(paymentTypes, "paymentTypes");
        Intrinsics.checkNotNullParameter(lineTypes, "lineTypes");
        Intrinsics.checkNotNullParameter(plateTypes, "plateTypes");
        this.barcodeTypes = barcodeTypes;
        this.barcodeMax = i;
        this.barcodeRoi = barcodeRoi;
        this.barcodeEffort = barcodeEffort;
        this.barcodeDecode = z;
        this.barcodeSmart = z2;
        this.barcodeNonpayment = z3;
        this.cardTypes = cardTypes;
        this.cardShowOptionalData = z4;
        this.paymentTypes = paymentTypes;
        this.lineMax = i2;
        this.lineTypes = lineTypes;
        this.meterMax = i3;
        this.plateTypes = plateTypes;
        this.containerMax = i4;
    }

    public /* synthetic */ CodeSettingsMock(Set set, int i, String str, String str2, boolean z, boolean z2, boolean z3, Set set2, boolean z4, Set set3, int i2, Set set4, int i3, Set set5, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? SetsKt.emptySet() : set, (i5 & 2) != 0 ? 3 : i, (i5 & 4) != 0 ? "focused" : str, (i5 & 8) != 0 ? "normal" : str2, (i5 & 16) != 0 ? true : z, (i5 & 32) != 0 ? false : z2, (i5 & 64) != 0 ? false : z3, (i5 & 128) != 0 ? SetsKt.emptySet() : set2, (i5 & 256) == 0 ? z4 : false, (i5 & 512) != 0 ? SetsKt.emptySet() : set3, (i5 & 1024) != 0 ? 2 : i2, (i5 & 2048) != 0 ? SetsKt.emptySet() : set4, (i5 & 4096) == 0 ? i3 : 3, (i5 & 8192) != 0 ? SetsKt.emptySet() : set5, (i5 & 16384) != 0 ? 10 : i4);
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public Set<String> getBarcodeTypes() {
        return this.barcodeTypes;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public int getBarcodeMax() {
        return this.barcodeMax;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public String getBarcodeRoi() {
        return this.barcodeRoi;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public String getBarcodeEffort() {
        return this.barcodeEffort;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public boolean getBarcodeDecode() {
        return this.barcodeDecode;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public boolean getBarcodeSmart() {
        return this.barcodeSmart;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public boolean getBarcodeNonpayment() {
        return this.barcodeNonpayment;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public Set<String> getCardTypes() {
        return this.cardTypes;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public boolean getCardShowOptionalData() {
        return this.cardShowOptionalData;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public Set<String> getPaymentTypes() {
        return this.paymentTypes;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public int getLineMax() {
        return this.lineMax;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public Set<String> getLineTypes() {
        return this.lineTypes;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public int getMeterMax() {
        return this.meterMax;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public Set<String> getPlateTypes() {
        return this.plateTypes;
    }

    @Override // com.smartengines.targets.code.CodeSettings
    public int getContainerMax() {
        return this.containerMax;
    }
}
