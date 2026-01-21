package com.smartengines.app.mock;

import com.smartengines.app.settings.IdSettingsWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MockSettingWriter.kt */
@Metadata(m513d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0016H\u0016¨\u0006\u0018"}, m514d2 = {"Lcom/smartengines/app/mock/MockIdSettingsWriter;", "Lcom/smartengines/app/settings/IdSettingsWriter;", "<init>", "()V", "writeVauthEnabled", "", "value", "", "writeEnableForensics", "writeMinInstrTime", "", "writeMaxInstrTime", "writeInstrCount", "writeInstrCountDelta", "resetInstrCountDelta", "writeInstrFailed", "writeAlwaysPass", "writeMinPassTime", "writeEnableVisualization", "writeFlashByDefault", "writeShowUndefChecks", "writeShowChecksFilter", "", "writeHideChecksFilter", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class MockIdSettingsWriter implements IdSettingsWriter {
    public static final int $stable = 0;

    @Override // com.smartengines.app.settings.IdSettingsWriter
    public void resetInstrCountDelta() {
    }

    @Override // com.smartengines.app.settings.IdSettingsWriter
    public void writeAlwaysPass(boolean value) {
    }

    @Override // com.smartengines.app.settings.IdSettingsWriter
    public void writeEnableForensics(boolean value) {
    }

    @Override // com.smartengines.app.settings.IdSettingsWriter
    public void writeEnableVisualization(boolean value) {
    }

    @Override // com.smartengines.app.settings.IdSettingsWriter
    public void writeFlashByDefault(boolean value) {
    }

    @Override // com.smartengines.app.settings.IdSettingsWriter
    public void writeHideChecksFilter(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // com.smartengines.app.settings.IdSettingsWriter
    public void writeInstrCount(int value) {
    }

    @Override // com.smartengines.app.settings.IdSettingsWriter
    public void writeInstrCountDelta(int value) {
    }

    @Override // com.smartengines.app.settings.IdSettingsWriter
    public void writeInstrFailed(int value) {
    }

    @Override // com.smartengines.app.settings.IdSettingsWriter
    public void writeMaxInstrTime(int value) {
    }

    @Override // com.smartengines.app.settings.IdSettingsWriter
    public void writeMinInstrTime(int value) {
    }

    @Override // com.smartengines.app.settings.IdSettingsWriter
    public void writeMinPassTime(int value) {
    }

    @Override // com.smartengines.app.settings.IdSettingsWriter
    public void writeShowChecksFilter(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // com.smartengines.app.settings.IdSettingsWriter
    public void writeShowUndefChecks(boolean value) {
    }

    @Override // com.smartengines.app.settings.IdSettingsWriter
    public void writeVauthEnabled(boolean value) {
    }
}
