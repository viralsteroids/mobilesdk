package com.smartengines.app.p004ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: TestScreen.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* renamed from: com.smartengines.app.ui.ComposableSingletons$TestScreenKt$lambda-4$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$TestScreenKt$lambda4$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$TestScreenKt$lambda4$1 INSTANCE = new ComposableSingletons$TestScreenKt$lambda4$1();

    ComposableSingletons$TestScreenKt$lambda4$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C88@3013L45:TestScreen.kt#83idza");
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            TestScreenKt.TestScreen(new Function0() { // from class: com.smartengines.app.ui.ComposableSingletons$TestScreenKt$lambda-4$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, CollectionsKt.listOf((Object[]) new String[]{"one", "two", "three"}), composer, 54);
        }
    }
}
