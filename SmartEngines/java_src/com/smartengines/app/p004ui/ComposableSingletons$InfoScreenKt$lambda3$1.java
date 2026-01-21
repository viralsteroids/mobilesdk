package com.smartengines.app.p004ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.smartengines.app.settings.CommonSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: InfoScreen.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* renamed from: com.smartengines.app.ui.ComposableSingletons$InfoScreenKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$InfoScreenKt$lambda3$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$InfoScreenKt$lambda3$1 INSTANCE = new ComposableSingletons$InfoScreenKt$lambda3$1();

    ComposableSingletons$InfoScreenKt$lambda3$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C271@10879L49:InfoScreen.kt#83idza");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            InfoScreenKt.InfoScreen(new Function0() { // from class: com.smartengines.app.ui.ComposableSingletons$InfoScreenKt$lambda-3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, new CommonSettings(null, 1, null), composer, 70);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
