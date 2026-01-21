package com.smartengines.app.com.smartengines.app.p003ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: StatDialog.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* renamed from: com.smartengines.app.com.smartengines.app.ui.ComposableSingletons$StatDialogKt$lambda-4$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$StatDialogKt$lambda4$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$StatDialogKt$lambda4$1 INSTANCE = new ComposableSingletons$StatDialogKt$lambda4$1();

    ComposableSingletons$StatDialogKt$lambda4$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C151@6057L21:StatDialog.kt#bje8no");
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            StatDialogKt.StatDialog("id", new Function0() { // from class: com.smartengines.app.com.smartengines.app.ui.ComposableSingletons$StatDialogKt$lambda-4$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, composer, 54);
        }
    }
}
