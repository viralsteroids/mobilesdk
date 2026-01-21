package com.smartengines.app.settings;

import kotlin.Metadata;

/* compiled from: IdSettings.kt */
@Metadata(m513d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0014H&¨\u0006\u0016"}, m514d2 = {"Lcom/smartengines/app/settings/IdSettingsWriter;", "", "writeVauthEnabled", "", "value", "", "writeEnableForensics", "writeMinInstrTime", "", "writeMaxInstrTime", "writeInstrCount", "writeInstrCountDelta", "resetInstrCountDelta", "writeInstrFailed", "writeAlwaysPass", "writeMinPassTime", "writeEnableVisualization", "writeFlashByDefault", "writeShowUndefChecks", "writeShowChecksFilter", "", "writeHideChecksFilter", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public interface IdSettingsWriter {
    void resetInstrCountDelta();

    void writeAlwaysPass(boolean value);

    void writeEnableForensics(boolean value);

    void writeEnableVisualization(boolean value);

    void writeFlashByDefault(boolean value);

    void writeHideChecksFilter(String value);

    void writeInstrCount(int value);

    void writeInstrCountDelta(int value);

    void writeInstrFailed(int value);

    void writeMaxInstrTime(int value);

    void writeMinInstrTime(int value);

    void writeMinPassTime(int value);

    void writeShowChecksFilter(String value);

    void writeShowUndefChecks(boolean value);

    void writeVauthEnabled(boolean value);
}
