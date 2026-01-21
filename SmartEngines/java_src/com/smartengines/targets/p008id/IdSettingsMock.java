package com.smartengines.targets.p008id;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: IdSettings.kt */
@Metadata(m513d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J1\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000b¨\u0006%"}, m514d2 = {"Lcom/smartengines/targets/id/IdSettingsMock;", "Lcom/smartengines/targets/id/IdSettings;", "vauthEnabled", "", "enableForensics", "minInstrTime", "", "maxInstrTime", "<init>", "(ZZII)V", "getVauthEnabled", "()Z", "getEnableForensics", "getMinInstrTime", "()I", "getMaxInstrTime", "instrCount", "getInstrCount", "instrCountDeltaRandom", "getInstrCountDeltaRandom", "instrFailed", "getInstrFailed", "minPassTime", "getMinPassTime", "alwaysPass", "getAlwaysPass", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IdSettingsMock implements IdSettings {
    private final boolean alwaysPass;
    private final boolean enableForensics;
    private final int instrCount;
    private final int instrCountDeltaRandom;
    private final int instrFailed;
    private final int maxInstrTime;
    private final int minInstrTime;
    private final int minPassTime;
    private final boolean vauthEnabled;

    public IdSettingsMock() {
        this(false, false, 0, 0, 15, null);
    }

    public static /* synthetic */ IdSettingsMock copy$default(IdSettingsMock idSettingsMock, boolean z, boolean z2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = idSettingsMock.vauthEnabled;
        }
        if ((i3 & 2) != 0) {
            z2 = idSettingsMock.enableForensics;
        }
        if ((i3 & 4) != 0) {
            i = idSettingsMock.minInstrTime;
        }
        if ((i3 & 8) != 0) {
            i2 = idSettingsMock.maxInstrTime;
        }
        return idSettingsMock.copy(z, z2, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getVauthEnabled() {
        return this.vauthEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnableForensics() {
        return this.enableForensics;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMinInstrTime() {
        return this.minInstrTime;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMaxInstrTime() {
        return this.maxInstrTime;
    }

    public final IdSettingsMock copy(boolean vauthEnabled, boolean enableForensics, int minInstrTime, int maxInstrTime) {
        return new IdSettingsMock(vauthEnabled, enableForensics, minInstrTime, maxInstrTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdSettingsMock)) {
            return false;
        }
        IdSettingsMock idSettingsMock = (IdSettingsMock) other;
        return this.vauthEnabled == idSettingsMock.vauthEnabled && this.enableForensics == idSettingsMock.enableForensics && this.minInstrTime == idSettingsMock.minInstrTime && this.maxInstrTime == idSettingsMock.maxInstrTime;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.vauthEnabled) * 31) + Boolean.hashCode(this.enableForensics)) * 31) + Integer.hashCode(this.minInstrTime)) * 31) + Integer.hashCode(this.maxInstrTime);
    }

    public String toString() {
        return "IdSettingsMock(vauthEnabled=" + this.vauthEnabled + ", enableForensics=" + this.enableForensics + ", minInstrTime=" + this.minInstrTime + ", maxInstrTime=" + this.maxInstrTime + ')';
    }

    public IdSettingsMock(boolean z, boolean z2, int i, int i2) {
        this.vauthEnabled = z;
        this.enableForensics = z2;
        this.minInstrTime = i;
        this.maxInstrTime = i2;
        this.instrCount = 4;
        this.instrFailed = 1;
        this.minPassTime = 1000;
    }

    public /* synthetic */ IdSettingsMock(boolean z, boolean z2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? 6 : i, (i3 & 8) != 0 ? 7 : i2);
    }

    @Override // com.smartengines.targets.p008id.IdSettings
    public boolean getVauthEnabled() {
        return this.vauthEnabled;
    }

    @Override // com.smartengines.targets.p008id.IdSettings
    public boolean getEnableForensics() {
        return this.enableForensics;
    }

    @Override // com.smartengines.targets.p008id.IdSettings
    public int getMinInstrTime() {
        return this.minInstrTime;
    }

    @Override // com.smartengines.targets.p008id.IdSettings
    public int getMaxInstrTime() {
        return this.maxInstrTime;
    }

    @Override // com.smartengines.targets.p008id.IdSettings
    public int getInstrCount() {
        return this.instrCount;
    }

    @Override // com.smartengines.targets.p008id.IdSettings
    public int getInstrCountDeltaRandom() {
        return this.instrCountDeltaRandom;
    }

    @Override // com.smartengines.targets.p008id.IdSettings
    public int getInstrFailed() {
        return this.instrFailed;
    }

    @Override // com.smartengines.targets.p008id.IdSettings
    public int getMinPassTime() {
        return this.minPassTime;
    }

    @Override // com.smartengines.targets.p008id.IdSettings
    public boolean getAlwaysPass() {
        return this.alwaysPass;
    }
}
