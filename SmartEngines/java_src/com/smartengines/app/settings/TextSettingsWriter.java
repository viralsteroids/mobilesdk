package com.smartengines.app.settings;

import java.util.Set;
import kotlin.Metadata;

/* compiled from: TextSettings.kt */
@Metadata(m513d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&¨\u0006\t"}, m514d2 = {"Lcom/smartengines/app/settings/TextSettingsWriter;", "", "writeLanguages", "", "value", "", "", "writePageDetection", "", "app_storeRelease"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public interface TextSettingsWriter {
    void writeLanguages(Set<String> value);

    void writePageDetection(boolean value);
}
