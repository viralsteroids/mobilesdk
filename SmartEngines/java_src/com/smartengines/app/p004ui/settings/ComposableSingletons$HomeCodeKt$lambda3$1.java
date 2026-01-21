package com.smartengines.app.p004ui.settings;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.core.PreferencesFactory;
import com.smartengines.app.settings.CodeSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeCode.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* renamed from: com.smartengines.app.ui.settings.ComposableSingletons$HomeCodeKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$HomeCodeKt$lambda3$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$HomeCodeKt$lambda3$1 INSTANCE = new ComposableSingletons$HomeCodeKt$lambda3$1();

    ComposableSingletons$HomeCodeKt$lambda3$1() {
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
        ComposerKt.sourceInformation(composer, "C47@1828L75:HomeCode.kt#v86m6v");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            HomeCodeKt.HomeCode(new Function1() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$HomeCodeKt$lambda-3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$HomeCodeKt$lambda3$1.invoke$lambda$0((String) obj);
                }
            }, new CodeSettings(PreferencesFactory.createEmpty()), composer, 70);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
