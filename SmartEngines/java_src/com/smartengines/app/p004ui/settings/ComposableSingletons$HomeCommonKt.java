package com.smartengines.app.p004ui.settings;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.mock.MockCommonSettingsWriter;
import com.smartengines.app.settings.BuildFlavor;
import com.smartengines.app.settings.CommonSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeCommon.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$HomeCommonKt {
    public static final ComposableSingletons$HomeCommonKt INSTANCE = new ComposableSingletons$HomeCommonKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f2144lambda1 = ComposableLambdaKt.composableLambdaInstance(2073386151, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$HomeCommonKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope SettingsScaffold, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(SettingsScaffold, "$this$SettingsScaffold");
            ComposerKt.sourceInformation(composer, "C88@3411L139:HomeCommon.kt#v86m6v");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                HomeCommonKt.HomeCommon(new CommonSettings(null, 1, null), new MockCommonSettingsWriter(), BuildFlavor.NIGHTLY, composer, CommonSettings.$stable | 384, 0);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2145lambda2 = ComposableLambdaKt.composableLambdaInstance(-583323697, false, ComposableSingletons$HomeCommonKt$lambda2$1.INSTANCE);

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f2146lambda3 = ComposableLambdaKt.composableLambdaInstance(1912448631, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$HomeCommonKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope SettingsScaffold, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(SettingsScaffold, "$this$SettingsScaffold");
            ComposerKt.sourceInformation(composer, "C102@3785L103:HomeCommon.kt#v86m6v");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                HomeCommonKt.HomeCommon(new CommonSettings(null, 1, null), new MockCommonSettingsWriter(), null, composer, CommonSettings.$stable, 4);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2147lambda4 = ComposableLambdaKt.composableLambdaInstance(1158821967, false, ComposableSingletons$HomeCommonKt$lambda4$1.INSTANCE);

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7729getLambda1$app_storeRelease() {
        return f2144lambda1;
    }

    /* renamed from: getLambda-2$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7730getLambda2$app_storeRelease() {
        return f2145lambda2;
    }

    /* renamed from: getLambda-3$app_storeRelease, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7731getLambda3$app_storeRelease() {
        return f2146lambda3;
    }

    /* renamed from: getLambda-4$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7732getLambda4$app_storeRelease() {
        return f2147lambda4;
    }
}
