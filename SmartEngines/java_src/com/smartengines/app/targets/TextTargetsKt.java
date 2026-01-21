package com.smartengines.app.targets;

import android.content.Context;
import com.smartengines.targets.DocumentTypesStatistics;
import com.smartengines.targets.text.TextSessionOptionsKt;
import com.smartengines.text.TextEngine;
import com.smartengines.text.TextSessionSettings;
import com.smartengines.utils.Name;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TextTargets.kt */
@Metadata(m513d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m514d2 = {"TAG", "", "loadTextTargetList", "Lcom/smartengines/app/targets/TreeItem;", "context", "Landroid/content/Context;", "textEngine", "Lcom/smartengines/text/TextEngine;", "stat", "Lcom/smartengines/targets/DocumentTypesStatistics;", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TextTargetsKt {
    private static final String TAG = "myapp.TextTargets";

    public static /* synthetic */ TreeItem loadTextTargetList$default(Context context, TextEngine textEngine, DocumentTypesStatistics documentTypesStatistics, int i, Object obj) {
        if ((i & 4) != 0) {
            documentTypesStatistics = null;
        }
        return loadTextTargetList(context, textEngine, documentTypesStatistics);
    }

    public static final TreeItem loadTextTargetList(Context context, TextEngine textEngine, DocumentTypesStatistics documentTypesStatistics) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textEngine, "textEngine");
        TextSessionSettings textSessionSettingsCreateSessionSettings = textEngine.CreateSessionSettings();
        Intrinsics.checkNotNullExpressionValue(textSessionSettingsCreateSessionSettings, "CreateSessionSettings(...)");
        TextSessionOptionsKt.parse(textSessionSettingsCreateSessionSettings);
        return new TreeGroup(new Name("text-engine"), null, CollectionsKt.emptyList(), 0, null, null, 56, null);
    }
}
