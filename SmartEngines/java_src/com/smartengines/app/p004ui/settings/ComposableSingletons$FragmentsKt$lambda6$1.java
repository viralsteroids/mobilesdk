package com.smartengines.app.p004ui.settings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: Fragments.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* renamed from: com.smartengines.app.ui.settings.ComposableSingletons$FragmentsKt$lambda-6$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$FragmentsKt$lambda6$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$FragmentsKt$lambda6$1 INSTANCE = new ComposableSingletons$FragmentsKt$lambda6$1();

    ComposableSingletons$FragmentsKt$lambda6$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C199@6256L300:Fragments.kt#v86m6v");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            FragmentsKt.SettingsScaffold("Settings Scaffold", new Function0() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$FragmentsKt$lambda-6$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, ComposableSingletons$FragmentsKt.INSTANCE.m7715getLambda5$app_storeRelease(), composer, 438);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
