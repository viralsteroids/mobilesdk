package com.smartengines.app.p004ui.settings;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.smartengines.app.mock.MockTextSettingsWriter;
import com.smartengines.app.settings.TextSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeText.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* renamed from: com.smartengines.app.ui.settings.ComposableSingletons$HomeTextKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$HomeTextKt$lambda1$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$HomeTextKt$lambda1$1 INSTANCE = new ComposableSingletons$HomeTextKt$lambda1$1();

    ComposableSingletons$HomeTextKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope SettingsScaffold, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(SettingsScaffold, "$this$SettingsScaffold");
        ComposerKt.sourceInformation(composer, "C39@1501L52:HomeText.kt#v86m6v");
        if ((i & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            HomeTextKt.HomeText(new Function1() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$HomeTextKt$lambda-1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$HomeTextKt$lambda1$1.invoke$lambda$0((String) obj);
                }
            }, new TextSettings(null, 1, null), new MockTextSettingsWriter(), composer, (TextSettings.$stable << 3) | 6, 0);
        }
    }
}
