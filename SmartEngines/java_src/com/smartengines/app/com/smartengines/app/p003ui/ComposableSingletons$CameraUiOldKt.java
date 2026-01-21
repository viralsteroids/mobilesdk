package com.smartengines.app.com.smartengines.app.p003ui;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: CameraUiOld.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$CameraUiOldKt {
    public static final ComposableSingletons$CameraUiOldKt INSTANCE = new ComposableSingletons$CameraUiOldKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f1962lambda1 = ComposableLambdaKt.composableLambdaInstance(1542839976, false, ComposableSingletons$CameraUiOldKt$lambda1$1.INSTANCE);

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f1963lambda2 = ComposableLambdaKt.composableLambdaInstance(2058272077, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.com.smartengines.app.ui.ComposableSingletons$CameraUiOldKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C64@2117L955:CameraUiOld.kt#bje8no");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$CameraUiOldKt.INSTANCE.m7380getLambda1$app_storeRelease(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7380getLambda1$app_storeRelease() {
        return f1962lambda1;
    }

    /* renamed from: getLambda-2$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7381getLambda2$app_storeRelease() {
        return f1963lambda2;
    }
}
