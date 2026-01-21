package com.smartengines.targets;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TargetSettings.kt */
@Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m514d2 = {"targetSettings", "Lcom/smartengines/targets/TargetSettings;", "getTargetSettings", "()Lcom/smartengines/targets/TargetSettings;", "setTargetSettings", "(Lcom/smartengines/targets/TargetSettings;)V", "targets_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TargetSettingsKt {
    private static TargetSettings targetSettings = new TargetSettingsMock(null, null, null, null, 15, null);

    public static final TargetSettings getTargetSettings() {
        return targetSettings;
    }

    public static final void setTargetSettings(TargetSettings targetSettings2) {
        Intrinsics.checkNotNullParameter(targetSettings2, "<set-?>");
        targetSettings = targetSettings2;
    }
}
