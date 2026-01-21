package com.smartengines.app.p004ui.settings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListSelectors.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* renamed from: com.smartengines.app.ui.settings.ComposableSingletons$ListSelectorsKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$ListSelectorsKt$lambda3$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ListSelectorsKt$lambda3$1 INSTANCE = new ComposableSingletons$ListSelectorsKt$lambda3$1();

    ComposableSingletons$ListSelectorsKt$lambda3$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C268@9597L176:ListSelectors.kt#v86m6v");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            ListSelectorsKt.SingleFromList("Single from List", "two", new Function1() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$ListSelectorsKt$lambda-3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$ListSelectorsKt$lambda3$1.invoke$lambda$0((String) obj);
                }
            }, ListSelectorsKt.getPreviewChoices(), composer, 4534);
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
