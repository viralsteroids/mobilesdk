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

/* compiled from: Plates.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$PlatesKt {
    public static final ComposableSingletons$PlatesKt INSTANCE = new ComposableSingletons$PlatesKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2178lambda1 = ComposableLambdaKt.composableLambdaInstance(-1171566825, false, ComposableSingletons$PlatesKt$lambda1$1.INSTANCE);

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2179lambda2 = ComposableLambdaKt.composableLambdaInstance(-1496270980, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$PlatesKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C63@2242L179:Plates.kt#v86m6v");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$PlatesKt.INSTANCE.m7767getLambda1$app_storeRelease(), composer, 12582918, 126);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2180lambda3 = ComposableLambdaKt.composableLambdaInstance(-663200831, false, ComposableSingletons$PlatesKt$lambda3$1.INSTANCE);

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2181lambda4 = ComposableLambdaKt.composableLambdaInstance(-2139095044, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$PlatesKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C76@2599L179:Plates.kt#v86m6v");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$PlatesKt.INSTANCE.m7769getLambda3$app_storeRelease(), composer, 12582918, 126);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7767getLambda1$app_storeRelease() {
        return f2178lambda1;
    }

    /* renamed from: getLambda-2$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7768getLambda2$app_storeRelease() {
        return f2179lambda2;
    }

    /* renamed from: getLambda-3$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7769getLambda3$app_storeRelease() {
        return f2180lambda3;
    }

    /* renamed from: getLambda-4$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7770getLambda4$app_storeRelease() {
        return f2181lambda4;
    }
}
