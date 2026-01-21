package com.smartengines.tree.p009ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneLevel.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* renamed from: com.smartengines.tree.ui.ComposableSingletons$OneLevelKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$OneLevelKt$lambda2$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$OneLevelKt$lambda2$1 INSTANCE = new ComposableSingletons$OneLevelKt$lambda2$1();

    ComposableSingletons$OneLevelKt$lambda2$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(AppNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C85@2598L99:OneLevel.kt#snoj4b");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            OneLevelKt.OneLevelRows(PreviewKt.getPreviewData(), new Function1() { // from class: com.smartengines.tree.ui.ComposableSingletons$OneLevelKt$lambda-2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$OneLevelKt$lambda2$1.invoke$lambda$0((AppNode) obj);
                }
            }, ComposableSingletons$OneLevelKt.INSTANCE.m7817getLambda1$tree_release(), composer, 440);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
