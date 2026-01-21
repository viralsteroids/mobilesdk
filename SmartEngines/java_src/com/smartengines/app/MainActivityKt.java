package com.smartengines.app;

import kotlin.Metadata;

/* compiled from: MainActivity.kt */
@Metadata(m513d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0004"}, m514d2 = {"TAG", "", "exitApp", "", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class MainActivityKt {
    private static final String TAG = "myapp.MainActivity";

    public static final void exitApp() {
        MainActivity companion = MainActivity.INSTANCE.getInstance();
        if (companion != null) {
            companion.finishAndRemoveTask();
        }
    }
}
