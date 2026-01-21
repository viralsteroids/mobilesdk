package com.smartengines.app.p004ui.settings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.core.PreferencesFactory;
import com.smartengines.app.settings.CodeSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: Containers.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* renamed from: com.smartengines.app.ui.settings.ComposableSingletons$ContainersKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$ContainersKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ContainersKt$lambda1$1 INSTANCE = new ComposableSingletons$ContainersKt$lambda1$1();

    ComposableSingletons$ContainersKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C38@1222L85:Containers.kt#v86m6v");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            ContainersKt.SettingsContainers(new Function0() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$ContainersKt$lambda-1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, new CodeSettings(PreferencesFactory.createEmpty()), composer, 70);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
