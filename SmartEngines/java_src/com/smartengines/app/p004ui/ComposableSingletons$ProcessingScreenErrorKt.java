package com.smartengines.app.p004ui;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.mock.MockSelectorsKt;
import com.smartengines.engine.ImageProcessingState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ProcessingScreenError.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ProcessingScreenErrorKt {
    public static final ComposableSingletons$ProcessingScreenErrorKt INSTANCE = new ComposableSingletons$ProcessingScreenErrorKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2030lambda1 = ComposableLambdaKt.composableLambdaInstance(-1994761933, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ComposableSingletons$ProcessingScreenErrorKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C57@1771L213:ProcessingScreenError.kt#83idza");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                ProcessingScreenErrorKt.ProcessingScreenError(new ImageProcessingState.ERROR(new Exception("Failed to spawn CodeEngine session: no enabled engines")), MockSelectorsKt.getMockSelectedTreeLeaf(), composer, 72);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2031lambda2 = ComposableLambdaKt.composableLambdaInstance(824311150, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ComposableSingletons$ProcessingScreenErrorKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C56@1749L245:ProcessingScreenError.kt#83idza");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ProcessingScreenErrorKt.INSTANCE.m7486getLambda1$app_storeRelease(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7486getLambda1$app_storeRelease() {
        return f2030lambda1;
    }

    /* renamed from: getLambda-2$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7487getLambda2$app_storeRelease() {
        return f2031lambda2;
    }
}
