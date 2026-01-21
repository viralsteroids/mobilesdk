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

/* compiled from: Liveness.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$LivenessKt {
    public static final ComposableSingletons$LivenessKt INSTANCE = new ComposableSingletons$LivenessKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2168lambda1 = ComposableLambdaKt.composableLambdaInstance(-2020377359, false, ComposableSingletons$LivenessKt$lambda1$1.INSTANCE);

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2169lambda2 = ComposableLambdaKt.composableLambdaInstance(-528457706, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$LivenessKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C100@3825L177:Liveness.kt#v86m6v");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$LivenessKt.INSTANCE.m7757getLambda1$app_storeRelease(), composer, 12582918, 126);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7757getLambda1$app_storeRelease() {
        return f2168lambda1;
    }

    /* renamed from: getLambda-2$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7758getLambda2$app_storeRelease() {
        return f2169lambda2;
    }
}
