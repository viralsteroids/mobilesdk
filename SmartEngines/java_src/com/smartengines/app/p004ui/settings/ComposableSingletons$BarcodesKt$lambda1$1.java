package com.smartengines.app.p004ui.settings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.core.PreferencesFactory;
import com.smartengines.app.mock.MockCodeSettingsWriter;
import com.smartengines.app.settings.CodeSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Barcodes.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* renamed from: com.smartengines.app.ui.settings.ComposableSingletons$BarcodesKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$BarcodesKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$BarcodesKt$lambda1$1 INSTANCE = new ComposableSingletons$BarcodesKt$lambda1$1();

    ComposableSingletons$BarcodesKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C105@3972L128:Barcodes.kt#v86m6v");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            BarcodesKt.SettingsBarcodes(new Function0() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$BarcodesKt$lambda-1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, new Function1() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$BarcodesKt$lambda-1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$BarcodesKt$lambda1$1.invoke$lambda$1((String) obj);
                }
            }, new CodeSettings(PreferencesFactory.createEmpty()), new MockCodeSettingsWriter(), composer, 566, 0);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
