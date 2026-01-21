package com.smartengines.app.p004ui.settings;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.smartengines.app.settings.CodeSettings;
import com.smartengines.app.settings.CommonSettings;
import com.smartengines.app.settings.DocSettings;
import com.smartengines.app.settings.IdSettings;
import com.smartengines.app.settings.TextSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Home.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* renamed from: com.smartengines.app.ui.settings.ComposableSingletons$HomeKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$HomeKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$HomeKt$lambda1$1 INSTANCE = new ComposableSingletons$HomeKt$lambda1$1();

    ComposableSingletons$HomeKt$lambda1$1() {
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C78@2838L191:Home.kt#v86m6v");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            HomeKt.SettingsHome(new Function0() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$HomeKt$lambda-1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            }, new Function1() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$HomeKt$lambda-1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposableSingletons$HomeKt$lambda1$1.invoke$lambda$1((String) obj);
                }
            }, new CommonSettings(null, 1, null), new CodeSettings(null, 1, null), new IdSettings(null, 1, 0 == true ? 1 : 0), new DocSettings(null, 1, null), new TextSettings(null, 1, null), composer, (CommonSettings.$stable << 6) | 4150 | (IdSettings.$stable << 12) | (DocSettings.$stable << 15) | (TextSettings.$stable << 18));
        } else {
            composer.skipToGroupEnd();
        }
    }
}
