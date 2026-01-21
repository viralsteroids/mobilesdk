package com.smartengines.targets.code;

import java.util.Set;
import kotlin.Metadata;

/* compiled from: CodeSettings.kt */
@Metadata(m513d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0012\u0010\u0016\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0006R\u0012\u0010\u001a\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013R\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0006R\u0012\u0010\u001e\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\nR\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0006R\u0012\u0010\"\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\nR\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0006R\u0012\u0010&\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\n¨\u0006("}, m514d2 = {"Lcom/smartengines/targets/code/CodeSettings;", "", "barcodeTypes", "", "", "getBarcodeTypes", "()Ljava/util/Set;", "barcodeMax", "", "getBarcodeMax", "()I", "barcodeRoi", "getBarcodeRoi", "()Ljava/lang/String;", "barcodeEffort", "getBarcodeEffort", "barcodeDecode", "", "getBarcodeDecode", "()Z", "barcodeSmart", "getBarcodeSmart", "barcodeNonpayment", "getBarcodeNonpayment", "cardTypes", "getCardTypes", "cardShowOptionalData", "getCardShowOptionalData", "paymentTypes", "getPaymentTypes", "lineMax", "getLineMax", "lineTypes", "getLineTypes", "meterMax", "getMeterMax", "plateTypes", "getPlateTypes", "containerMax", "getContainerMax", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public interface CodeSettings {
    boolean getBarcodeDecode();

    String getBarcodeEffort();

    int getBarcodeMax();

    boolean getBarcodeNonpayment();

    String getBarcodeRoi();

    boolean getBarcodeSmart();

    Set<String> getBarcodeTypes();

    boolean getCardShowOptionalData();

    Set<String> getCardTypes();

    int getContainerMax();

    int getLineMax();

    Set<String> getLineTypes();

    int getMeterMax();

    Set<String> getPaymentTypes();

    Set<String> getPlateTypes();
}
