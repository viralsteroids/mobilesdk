package androidx.camera.core.impl.stabilization;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class StabilizationMode {
    public static final int OFF = 1;

    /* renamed from: ON */
    public static final int f21ON = 2;
    public static final int UNSPECIFIED = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    private StabilizationMode() {
    }
}
