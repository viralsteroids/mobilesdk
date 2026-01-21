package com.smartengines.app.mock;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MockComposes.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$MockComposesKt {
    public static final ComposableSingletons$MockComposesKt INSTANCE = new ComposableSingletons$MockComposesKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f1969lambda1 = ComposableLambdaKt.composableLambdaInstance(-320847183, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.mock.ComposableSingletons$MockComposesKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C35@1278L12:MockComposes.kt#vodxkg");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                MockComposesKt.MockCamera(composer, 0);
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f1970lambda2 = ComposableLambdaKt.composableLambdaInstance(2051087062, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.mock.ComposableSingletons$MockComposesKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C34@1256L44:MockComposes.kt#vodxkg");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$MockComposesKt.INSTANCE.m7388getLambda1$app_storeRelease(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7388getLambda1$app_storeRelease() {
        return f1969lambda1;
    }

    /* renamed from: getLambda-2$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7389getLambda2$app_storeRelease() {
        return f1970lambda2;
    }
}
