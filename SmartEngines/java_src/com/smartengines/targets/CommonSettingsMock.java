package com.smartengines.targets;

import kotlin.Metadata;

/* compiled from: CommonSettings.kt */
@Metadata(m513d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\b\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, m514d2 = {"Lcom/smartengines/targets/CommonSettingsMock;", "Lcom/smartengines/targets/CommonSettings;", "sessionTimeout", "", "multiThreading", "", "computeMetrics", "ignoreTerminal", "enableStoppers", "<init>", "(IZZZZ)V", "getSessionTimeout", "()I", "getMultiThreading", "()Z", "getComputeMetrics", "getIgnoreTerminal", "getEnableStoppers", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CommonSettingsMock implements CommonSettings {
    private final boolean computeMetrics;
    private final boolean enableStoppers;
    private final boolean ignoreTerminal;
    private final boolean multiThreading;
    private final int sessionTimeout;

    public CommonSettingsMock() {
        this(0, false, false, false, false, 31, null);
    }

    public static /* synthetic */ CommonSettingsMock copy$default(CommonSettingsMock commonSettingsMock, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = commonSettingsMock.sessionTimeout;
        }
        if ((i2 & 2) != 0) {
            z = commonSettingsMock.multiThreading;
        }
        if ((i2 & 4) != 0) {
            z2 = commonSettingsMock.computeMetrics;
        }
        if ((i2 & 8) != 0) {
            z3 = commonSettingsMock.ignoreTerminal;
        }
        if ((i2 & 16) != 0) {
            z4 = commonSettingsMock.enableStoppers;
        }
        boolean z5 = z4;
        boolean z6 = z2;
        return commonSettingsMock.copy(i, z, z6, z3, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSessionTimeout() {
        return this.sessionTimeout;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getMultiThreading() {
        return this.multiThreading;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getComputeMetrics() {
        return this.computeMetrics;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIgnoreTerminal() {
        return this.ignoreTerminal;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getEnableStoppers() {
        return this.enableStoppers;
    }

    public final CommonSettingsMock copy(int sessionTimeout, boolean multiThreading, boolean computeMetrics, boolean ignoreTerminal, boolean enableStoppers) {
        return new CommonSettingsMock(sessionTimeout, multiThreading, computeMetrics, ignoreTerminal, enableStoppers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonSettingsMock)) {
            return false;
        }
        CommonSettingsMock commonSettingsMock = (CommonSettingsMock) other;
        return this.sessionTimeout == commonSettingsMock.sessionTimeout && this.multiThreading == commonSettingsMock.multiThreading && this.computeMetrics == commonSettingsMock.computeMetrics && this.ignoreTerminal == commonSettingsMock.ignoreTerminal && this.enableStoppers == commonSettingsMock.enableStoppers;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.sessionTimeout) * 31) + Boolean.hashCode(this.multiThreading)) * 31) + Boolean.hashCode(this.computeMetrics)) * 31) + Boolean.hashCode(this.ignoreTerminal)) * 31) + Boolean.hashCode(this.enableStoppers);
    }

    public String toString() {
        return "CommonSettingsMock(sessionTimeout=" + this.sessionTimeout + ", multiThreading=" + this.multiThreading + ", computeMetrics=" + this.computeMetrics + ", ignoreTerminal=" + this.ignoreTerminal + ", enableStoppers=" + this.enableStoppers + ')';
    }

    public CommonSettingsMock(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.sessionTimeout = i;
        this.multiThreading = z;
        this.computeMetrics = z2;
        this.ignoreTerminal = z3;
        this.enableStoppers = z4;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ CommonSettingsMock(int r2, boolean r3, boolean r4, boolean r5, boolean r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            r2 = 13
        L6:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            r4 = r0
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L16
            r5 = r0
        L16:
            r7 = r7 & 16
            if (r7 == 0) goto L21
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L27
        L21:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L27:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smartengines.targets.CommonSettingsMock.<init>(int, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Override // com.smartengines.targets.CommonSettings
    public int getSessionTimeout() {
        return this.sessionTimeout;
    }

    @Override // com.smartengines.targets.CommonSettings
    public boolean getMultiThreading() {
        return this.multiThreading;
    }

    @Override // com.smartengines.targets.CommonSettings
    public boolean getComputeMetrics() {
        return this.computeMetrics;
    }

    @Override // com.smartengines.targets.CommonSettings
    public boolean getIgnoreTerminal() {
        return this.ignoreTerminal;
    }

    @Override // com.smartengines.targets.CommonSettings
    public boolean getEnableStoppers() {
        return this.enableStoppers;
    }
}
