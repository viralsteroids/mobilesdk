package com.smartengines.app.p004ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: Tutorial.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$TutorialKt {
    public static final ComposableSingletons$TutorialKt INSTANCE = new ComposableSingletons$TutorialKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2069lambda1 = ComposableLambdaKt.composableLambdaInstance(-469672250, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ComposableSingletons$TutorialKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C156@5916L10:Tutorial.kt#83idza");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                TutorialKt.Tutorial(composer, 0);
            }
        }
    });

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7528getLambda1$app_storeRelease() {
        return f2069lambda1;
    }
}
