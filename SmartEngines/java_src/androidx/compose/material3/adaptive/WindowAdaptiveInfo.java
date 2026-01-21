package androidx.compose.material3.adaptive;

import androidx.window.core.layout.WindowSizeClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WindowAdaptiveInfo.kt */
@Metadata(m513d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, m514d2 = {"Landroidx/compose/material3/adaptive/WindowAdaptiveInfo;", "", "windowSizeClass", "Landroidx/window/core/layout/WindowSizeClass;", "windowPosture", "Landroidx/compose/material3/adaptive/Posture;", "(Landroidx/window/core/layout/WindowSizeClass;Landroidx/compose/material3/adaptive/Posture;)V", "getWindowPosture", "()Landroidx/compose/material3/adaptive/Posture;", "getWindowSizeClass", "()Landroidx/window/core/layout/WindowSizeClass;", "equals", "", "other", "hashCode", "", "toString", "", "adaptive_release"}, m515k = 1, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class WindowAdaptiveInfo {
    public static final int $stable = 0;
    private final Posture windowPosture;
    private final WindowSizeClass windowSizeClass;

    public WindowAdaptiveInfo(WindowSizeClass windowSizeClass, Posture posture) {
        this.windowSizeClass = windowSizeClass;
        this.windowPosture = posture;
    }

    public final Posture getWindowPosture() {
        return this.windowPosture;
    }

    public final WindowSizeClass getWindowSizeClass() {
        return this.windowSizeClass;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WindowAdaptiveInfo)) {
            return false;
        }
        WindowAdaptiveInfo windowAdaptiveInfo = (WindowAdaptiveInfo) other;
        return Intrinsics.areEqual(this.windowSizeClass, windowAdaptiveInfo.windowSizeClass) && Intrinsics.areEqual(this.windowPosture, windowAdaptiveInfo.windowPosture);
    }

    public int hashCode() {
        return (this.windowSizeClass.hashCode() * 31) + this.windowPosture.hashCode();
    }

    public String toString() {
        return "WindowAdaptiveInfo(windowSizeClass=" + this.windowSizeClass + ", windowPosture=" + this.windowPosture + ')';
    }
}
