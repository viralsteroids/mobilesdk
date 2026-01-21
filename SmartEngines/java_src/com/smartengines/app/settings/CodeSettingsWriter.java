package com.smartengines.app.settings;

import java.util.Set;
import kotlin.Metadata;

/* compiled from: CodeSettings.kt */
@Metadata(m513d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\fH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\fH&J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\fH&J\u0016\u0010\u0011\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\u0016\u0010\u0013\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\u0016\u0010\u0015\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&¨\u0006\u0017"}, m514d2 = {"Lcom/smartengines/app/settings/CodeSettingsWriter;", "", "writeBarcodeTypes", "", "value", "", "", "writeBarcodeMax", "", "writeBarcodeRoi", "writeBarcodeEffort", "writeBarcodeDecode", "", "writeBarcodeSmart", "writeBarcodeNonpayment", "writeCardTypes", "writeShowOptionalData", "writePaymentTypes", "writeLineMax", "writeLineTypes", "writeMeterMax", "writePlateTypes", "writeContainerMax", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public interface CodeSettingsWriter {
    void writeBarcodeDecode(boolean value);

    void writeBarcodeEffort(String value);

    void writeBarcodeMax(int value);

    void writeBarcodeNonpayment(boolean value);

    void writeBarcodeRoi(String value);

    void writeBarcodeSmart(boolean value);

    void writeBarcodeTypes(Set<String> value);

    void writeCardTypes(Set<String> value);

    void writeContainerMax(int value);

    void writeLineMax(int value);

    void writeLineTypes(Set<String> value);

    void writeMeterMax(int value);

    void writePaymentTypes(Set<String> value);

    void writePlateTypes(Set<String> value);

    void writeShowOptionalData(boolean value);
}
