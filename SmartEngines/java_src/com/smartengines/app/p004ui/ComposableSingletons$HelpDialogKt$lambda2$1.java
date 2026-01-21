package com.smartengines.app.p004ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.smartengines.app.C3069R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: HelpDialog.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* renamed from: com.smartengines.app.ui.ComposableSingletons$HelpDialogKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$HelpDialogKt$lambda2$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$HelpDialogKt$lambda2$1 INSTANCE = new ComposableSingletons$HelpDialogKt$lambda2$1();

    ComposableSingletons$HelpDialogKt$lambda2$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C81@2942L38:HelpDialog.kt#83idza");
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            HelpDialogKt.HelpDialog(C3069R.string.help_id_engine, new Function0() { // from class: com.smartengines.app.ui.ComposableSingletons$HelpDialogKt$lambda-2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, composer, 48, 0);
        }
    }
}
