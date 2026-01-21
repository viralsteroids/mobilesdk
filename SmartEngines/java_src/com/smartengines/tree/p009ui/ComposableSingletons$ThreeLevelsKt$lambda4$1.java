package com.smartengines.tree.p009ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreeLevels.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* renamed from: com.smartengines.tree.ui.ComposableSingletons$ThreeLevelsKt$lambda-4$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$ThreeLevelsKt$lambda4$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ThreeLevelsKt$lambda4$1 INSTANCE = new ComposableSingletons$ThreeLevelsKt$lambda4$1();

    ComposableSingletons$ThreeLevelsKt$lambda4$1() {
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
        ComposerKt.sourceInformation(composer, "C78@2916L324:ThreeLevels.kt#snoj4b");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            ThreeLevelsKt.ThreeLevelsAccordion(3, PreviewKt.getPreviewData(), new Function1() { // from class: com.smartengines.tree.ui.ComposableSingletons$ThreeLevelsKt$lambda-4$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$ThreeLevelsKt$lambda4$1.invoke$lambda$0((AppNode) obj);
                }
            }, ComposableSingletons$ThreeLevelsKt.INSTANCE.m7825getLambda1$tree_release(), ComposableSingletons$ThreeLevelsKt.INSTANCE.m7826getLambda2$tree_release(), ComposableSingletons$ThreeLevelsKt.INSTANCE.m7827getLambda3$tree_release(), composer, 224710);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
