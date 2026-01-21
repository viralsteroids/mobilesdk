package com.smartengines.app.p004ui;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.CameraButtonsState;
import com.smartengines.app.PhotoTakingState;
import com.smartengines.app.mock.MockComposesKt;
import com.smartengines.app.mock.MockSelectorsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: ProcessingScreenWaiting.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ProcessingScreenWaitingKt {
    public static final ComposableSingletons$ProcessingScreenWaitingKt INSTANCE = new ComposableSingletons$ProcessingScreenWaitingKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2041lambda1 = ComposableLambdaKt.composableLambdaInstance(1336458606, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ComposableSingletons$ProcessingScreenWaitingKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C168@6595L21:ProcessingScreenWaiting.kt#83idza");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                MockComposesKt.MockProcessingTitle(composer, 0);
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2042lambda2 = ComposableLambdaKt.composableLambdaInstance(1447262670, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ComposableSingletons$ProcessingScreenWaitingKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C163@6408L12,164@6433L199:ProcessingScreenWaiting.kt#83idza");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                MockComposesKt.MockCamera(composer, 0);
                ProcessingScreenWaitingKt.ProcessingScreenWaiting(MockSelectorsKt.getMockSelectedTreeLeaf(), PhotoTakingState.Inactive.INSTANCE, new CameraButtonsState(false, false, false, false, 15, null), ComposableSingletons$ProcessingScreenWaitingKt.INSTANCE.m7497getLambda1$app_storeRelease(), composer, 3128, 0);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2043lambda3 = ComposableLambdaKt.composableLambdaInstance(452131657, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ComposableSingletons$ProcessingScreenWaitingKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C162@6386L256:ProcessingScreenWaiting.kt#83idza");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ProcessingScreenWaitingKt.INSTANCE.m7498getLambda2$app_storeRelease(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2044lambda4 = ComposableLambdaKt.composableLambdaInstance(-456032964, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ComposableSingletons$ProcessingScreenWaitingKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C184@7033L21:ProcessingScreenWaiting.kt#83idza");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                MockComposesKt.MockProcessingTitle(composer, 0);
            }
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2045lambda5 = ComposableLambdaKt.composableLambdaInstance(-234404644, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ComposableSingletons$ProcessingScreenWaitingKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C179@6845L12,180@6870L186:ProcessingScreenWaiting.kt#83idza");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                MockComposesKt.MockCamera(composer, 0);
                ProcessingScreenWaitingKt.ProcessingScreenWaiting(MockSelectorsKt.getMockSelectedTreeLeaf(), PhotoTakingState.InProgress.INSTANCE, new CameraButtonsState(false, false, false, false, 15, null), ComposableSingletons$ProcessingScreenWaitingKt.INSTANCE.m7500getLambda4$app_storeRelease(), composer, 3128, 0);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-6, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2046lambda6 = ComposableLambdaKt.composableLambdaInstance(-257451903, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ComposableSingletons$ProcessingScreenWaitingKt$lambda-6$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C178@6823L243:ProcessingScreenWaiting.kt#83idza");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ProcessingScreenWaitingKt.INSTANCE.m7501getLambda5$app_storeRelease(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-7, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2047lambda7 = ComposableLambdaKt.composableLambdaInstance(597390047, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ComposableSingletons$ProcessingScreenWaitingKt$lambda-7$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C202@7595L21:ProcessingScreenWaiting.kt#83idza");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                MockComposesKt.MockProcessingTitle(composer, 0);
            }
        }
    });

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7497getLambda1$app_storeRelease() {
        return f2041lambda1;
    }

    /* renamed from: getLambda-2$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7498getLambda2$app_storeRelease() {
        return f2042lambda2;
    }

    /* renamed from: getLambda-3$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7499getLambda3$app_storeRelease() {
        return f2043lambda3;
    }

    /* renamed from: getLambda-4$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7500getLambda4$app_storeRelease() {
        return f2044lambda4;
    }

    /* renamed from: getLambda-5$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7501getLambda5$app_storeRelease() {
        return f2045lambda5;
    }

    /* renamed from: getLambda-6$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7502getLambda6$app_storeRelease() {
        return f2046lambda6;
    }

    /* renamed from: getLambda-7$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7503getLambda7$app_storeRelease() {
        return f2047lambda7;
    }
}
