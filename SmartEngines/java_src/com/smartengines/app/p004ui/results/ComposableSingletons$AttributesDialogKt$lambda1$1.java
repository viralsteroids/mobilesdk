package com.smartengines.app.p004ui.results;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: AttributesDialog.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* renamed from: com.smartengines.app.ui.results.ComposableSingletons$AttributesDialogKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$AttributesDialogKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$AttributesDialogKt$lambda1$1 INSTANCE = new ComposableSingletons$AttributesDialogKt$lambda1$1();

    ComposableSingletons$AttributesDialogKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C67@2522L33:AttributesDialog.kt#4ipo3i");
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            AttributesDialogKt.AttributesDialog(CollectionsKt.emptyList(), new Function0() { // from class: com.smartengines.app.ui.results.ComposableSingletons$AttributesDialogKt$lambda-1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, composer, 54);
        }
    }
}
