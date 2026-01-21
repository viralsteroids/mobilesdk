package com.smartengines.app.p004ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: IntroScreen.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* renamed from: com.smartengines.app.ui.ComposableSingletons$IntroScreenKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$IntroScreenKt$lambda3$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$IntroScreenKt$lambda3$1 INSTANCE = new ComposableSingletons$IntroScreenKt$lambda3$1();

    ComposableSingletons$IntroScreenKt$lambda3$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(boolean z) {
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C93@4943L32:IntroScreen.kt#83idza");
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            IntroScreenKt.IntroScreen("The title", new Function0() { // from class: com.smartengines.app.ui.ComposableSingletons$IntroScreenKt$lambda-3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, new Function1() { // from class: com.smartengines.app.ui.ComposableSingletons$IntroScreenKt$lambda-3$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$IntroScreenKt$lambda3$1.invoke$lambda$1(((Boolean) obj).booleanValue());
                }
            }, composer, 438);
        }
    }
}
