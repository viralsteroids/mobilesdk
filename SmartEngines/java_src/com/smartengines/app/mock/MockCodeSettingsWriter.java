package com.smartengines.app.mock;

import com.smartengines.app.settings.CodeSettingsWriter;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MockSettingWriter.kt */
@Metadata(m513d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000eH\u0016J\u0016\u0010\u0011\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000eH\u0016J\u0016\u0010\u0013\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH\u0016J\u0016\u0010\u0015\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH\u0016J\u0016\u0010\u0017\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH\u0016¨\u0006\u0019"}, m514d2 = {"Lcom/smartengines/app/mock/MockCodeSettingsWriter;", "Lcom/smartengines/app/settings/CodeSettingsWriter;", "<init>", "()V", "writeBarcodeTypes", "", "value", "", "", "writeBarcodeMax", "", "writeBarcodeRoi", "writeBarcodeEffort", "writeBarcodeDecode", "", "writeBarcodeSmart", "writeBarcodeNonpayment", "writeCardTypes", "writeShowOptionalData", "writePaymentTypes", "writeLineMax", "writeLineTypes", "writeMeterMax", "writePlateTypes", "writeContainerMax", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class MockCodeSettingsWriter implements CodeSettingsWriter {
    public static final int $stable = 0;

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeBarcodeDecode(boolean value) {
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeBarcodeEffort(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeBarcodeMax(int value) {
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeBarcodeNonpayment(boolean value) {
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeBarcodeRoi(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeBarcodeSmart(boolean value) {
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeBarcodeTypes(Set<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeCardTypes(Set<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeContainerMax(int value) {
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeLineMax(int value) {
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeLineTypes(Set<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeMeterMax(int value) {
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writePaymentTypes(Set<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writePlateTypes(Set<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // com.smartengines.app.settings.CodeSettingsWriter
    public void writeShowOptionalData(boolean value) {
    }
}
