package com.smartengines.targets;

import androidx.compose.p000ui.layout.LayoutKt;
import com.smartengines.targets.code.CodeSettings;
import com.smartengines.targets.code.CodeSettingsMock;
import com.smartengines.targets.p008id.IdSettings;
import com.smartengines.targets.p008id.IdSettingsMock;
import com.smartengines.targets.text.TextSettings;
import com.smartengines.targets.text.TextSettingsMock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: TargetSettings.kt */
@Metadata(m513d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m514d2 = {"Lcom/smartengines/targets/TargetSettingsMock;", "Lcom/smartengines/targets/TargetSettings;", "common", "Lcom/smartengines/targets/CommonSettings;", "code", "Lcom/smartengines/targets/code/CodeSettings;", "id", "Lcom/smartengines/targets/id/IdSettings;", TextBundle.TEXT_ENTRY, "Lcom/smartengines/targets/text/TextSettings;", "<init>", "(Lcom/smartengines/targets/CommonSettings;Lcom/smartengines/targets/code/CodeSettings;Lcom/smartengines/targets/id/IdSettings;Lcom/smartengines/targets/text/TextSettings;)V", "getCommon", "()Lcom/smartengines/targets/CommonSettings;", "getCode", "()Lcom/smartengines/targets/code/CodeSettings;", "getId", "()Lcom/smartengines/targets/id/IdSettings;", "getText", "()Lcom/smartengines/targets/text/TextSettings;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TargetSettingsMock implements TargetSettings {
    private final CodeSettings code;
    private final CommonSettings common;
    private final IdSettings id;
    private final TextSettings text;

    public TargetSettingsMock() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ TargetSettingsMock copy$default(TargetSettingsMock targetSettingsMock, CommonSettings commonSettings, CodeSettings codeSettings, IdSettings idSettings, TextSettings textSettings, int i, Object obj) {
        if ((i & 1) != 0) {
            commonSettings = targetSettingsMock.common;
        }
        if ((i & 2) != 0) {
            codeSettings = targetSettingsMock.code;
        }
        if ((i & 4) != 0) {
            idSettings = targetSettingsMock.id;
        }
        if ((i & 8) != 0) {
            textSettings = targetSettingsMock.text;
        }
        return targetSettingsMock.copy(commonSettings, codeSettings, idSettings, textSettings);
    }

    /* renamed from: component1, reason: from getter */
    public final CommonSettings getCommon() {
        return this.common;
    }

    /* renamed from: component2, reason: from getter */
    public final CodeSettings getCode() {
        return this.code;
    }

    /* renamed from: component3, reason: from getter */
    public final IdSettings getId() {
        return this.id;
    }

    /* renamed from: component4, reason: from getter */
    public final TextSettings getText() {
        return this.text;
    }

    public final TargetSettingsMock copy(CommonSettings common, CodeSettings code, IdSettings id, TextSettings text) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        return new TargetSettingsMock(common, code, id, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TargetSettingsMock)) {
            return false;
        }
        TargetSettingsMock targetSettingsMock = (TargetSettingsMock) other;
        return Intrinsics.areEqual(this.common, targetSettingsMock.common) && Intrinsics.areEqual(this.code, targetSettingsMock.code) && Intrinsics.areEqual(this.id, targetSettingsMock.id) && Intrinsics.areEqual(this.text, targetSettingsMock.text);
    }

    public int hashCode() {
        return (((((this.common.hashCode() * 31) + this.code.hashCode()) * 31) + this.id.hashCode()) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "TargetSettingsMock(common=" + this.common + ", code=" + this.code + ", id=" + this.id + ", text=" + this.text + ')';
    }

    public TargetSettingsMock(CommonSettings common, CodeSettings code, IdSettings id, TextSettings text) {
        Intrinsics.checkNotNullParameter(common, "common");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.common = common;
        this.code = code;
        this.id = id;
        this.text = text;
    }

    public /* synthetic */ TargetSettingsMock(CommonSettings commonSettings, CodeSettings codeSettings, IdSettings idSettings, TextSettings textSettings, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CommonSettingsMock(0, false, false, false, false, 31, null) : commonSettings, (i & 2) != 0 ? new CodeSettingsMock(null, 0, null, null, false, false, false, null, false, null, 0, null, 0, null, 0, LayoutKt.LargeDimension, null) : codeSettings, (i & 4) != 0 ? new IdSettingsMock(false, false, 0, 0, 15, null) : idSettings, (i & 8) != 0 ? new TextSettingsMock(null, false, 3, null) : textSettings);
    }

    @Override // com.smartengines.targets.TargetSettings
    public CommonSettings getCommon() {
        return this.common;
    }

    @Override // com.smartengines.targets.TargetSettings
    public CodeSettings getCode() {
        return this.code;
    }

    @Override // com.smartengines.targets.TargetSettings
    public IdSettings getId() {
        return this.id;
    }

    @Override // com.smartengines.targets.TargetSettings
    public TextSettings getText() {
        return this.text;
    }
}
