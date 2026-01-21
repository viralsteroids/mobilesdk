package com.smartengines.app.mock;

import com.smartengines.app.settings.TextSettingsWriter;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MockSettingWriter.kt */
@Metadata(m513d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH\u0016¨\u0006\u000b"}, m514d2 = {"Lcom/smartengines/app/mock/MockTextSettingsWriter;", "Lcom/smartengines/app/settings/TextSettingsWriter;", "<init>", "()V", "writeLanguages", "", "value", "", "", "writePageDetection", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class MockTextSettingsWriter implements TextSettingsWriter {
    public static final int $stable = 0;

    @Override // com.smartengines.app.settings.TextSettingsWriter
    public void writeLanguages(Set<String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // com.smartengines.app.settings.TextSettingsWriter
    public void writePageDetection(boolean value) {
    }
}
