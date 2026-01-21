package com.smartengines.app.p004ui.settings;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.core.PreferencesFactory;
import com.smartengines.app.mock.MockIdSettingsWriter;
import com.smartengines.app.settings.IdSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeId.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* renamed from: com.smartengines.app.ui.settings.ComposableSingletons$HomeIdKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$HomeIdKt$lambda1$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$HomeIdKt$lambda1$1 INSTANCE = new ComposableSingletons$HomeIdKt$lambda1$1();

    ComposableSingletons$HomeIdKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope SettingsScaffold, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(SettingsScaffold, "$this$SettingsScaffold");
        ComposerKt.sourceInformation(composer, "C60@2268L111:HomeId.kt#v86m6v");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            HomeIdKt.HomeId(new Function1() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$HomeIdKt$lambda-1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$HomeIdKt$lambda1$1.invoke$lambda$0((String) obj);
                }
            }, new IdSettings(PreferencesFactory.createEmpty()), new MockIdSettingsWriter(), composer, (IdSettings.$stable << 3) | 6, 0);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
