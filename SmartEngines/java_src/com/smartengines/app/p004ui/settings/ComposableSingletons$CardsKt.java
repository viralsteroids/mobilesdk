package com.smartengines.app.p004ui.settings;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: Cards.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$CardsKt {
    public static final ComposableSingletons$CardsKt INSTANCE = new ComposableSingletons$CardsKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2119lambda1 = ComposableLambdaKt.composableLambdaInstance(1266764279, false, ComposableSingletons$CardsKt$lambda1$1.INSTANCE);

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2120lambda2 = ComposableLambdaKt.composableLambdaInstance(-267730702, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$CardsKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C50@1848L178:Cards.kt#v86m6v");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$CardsKt.INSTANCE.m7697getLambda1$app_storeRelease(), composer, 12582918, 126);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2121lambda3 = ComposableLambdaKt.composableLambdaInstance(174784525, false, ComposableSingletons$CardsKt$lambda3$1.INSTANCE);

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2122lambda4 = ComposableLambdaKt.composableLambdaInstance(-149919630, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$CardsKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C63@2204L178:Cards.kt#v86m6v");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$CardsKt.INSTANCE.m7699getLambda3$app_storeRelease(), composer, 12582918, 126);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7697getLambda1$app_storeRelease() {
        return f2119lambda1;
    }

    /* renamed from: getLambda-2$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7698getLambda2$app_storeRelease() {
        return f2120lambda2;
    }

    /* renamed from: getLambda-3$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7699getLambda3$app_storeRelease() {
        return f2121lambda3;
    }

    /* renamed from: getLambda-4$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7700getLambda4$app_storeRelease() {
        return f2122lambda4;
    }
}
