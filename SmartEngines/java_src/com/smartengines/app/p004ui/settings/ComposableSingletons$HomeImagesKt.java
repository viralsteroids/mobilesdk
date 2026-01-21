package com.smartengines.app.p004ui.settings;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeImages.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$HomeImagesKt {
    public static final ComposableSingletons$HomeImagesKt INSTANCE = new ComposableSingletons$HomeImagesKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f2152lambda1 = ComposableLambdaKt.composableLambdaInstance(-1613030150, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$HomeImagesKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope SettingsScaffold, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(SettingsScaffold, "$this$SettingsScaffold");
            ComposerKt.sourceInformation(composer, "C62@2429L13:HomeImages.kt#v86m6v");
            if ((i & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                HomeImagesKt.HomeImages(composer, 0);
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2153lambda2 = ComposableLambdaKt.composableLambdaInstance(25227298, false, ComposableSingletons$HomeImagesKt$lambda2$1.INSTANCE);

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7739getLambda1$app_storeRelease() {
        return f2152lambda1;
    }

    /* renamed from: getLambda-2$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7740getLambda2$app_storeRelease() {
        return f2153lambda2;
    }
}
