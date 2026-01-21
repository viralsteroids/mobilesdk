package com.smartengines.targets;

import com.smartengines.targets.code.CodeSettings;
import com.smartengines.targets.p008id.IdSettings;
import com.smartengines.targets.text.TextSettings;
import kotlin.Metadata;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: TargetSettings.kt */
@Metadata(m513d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m514d2 = {"Lcom/smartengines/targets/TargetSettings;", "", "common", "Lcom/smartengines/targets/CommonSettings;", "getCommon", "()Lcom/smartengines/targets/CommonSettings;", "code", "Lcom/smartengines/targets/code/CodeSettings;", "getCode", "()Lcom/smartengines/targets/code/CodeSettings;", "id", "Lcom/smartengines/targets/id/IdSettings;", "getId", "()Lcom/smartengines/targets/id/IdSettings;", TextBundle.TEXT_ENTRY, "Lcom/smartengines/targets/text/TextSettings;", "getText", "()Lcom/smartengines/targets/text/TextSettings;", "targets_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public interface TargetSettings {
    CodeSettings getCode();

    CommonSettings getCommon();

    IdSettings getId();

    TextSettings getText();
}
