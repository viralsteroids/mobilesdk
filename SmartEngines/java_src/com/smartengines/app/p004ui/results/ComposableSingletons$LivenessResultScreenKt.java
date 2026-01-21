package com.smartengines.app.p004ui.results;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.mock.MockSelectorsKt;
import com.smartengines.app.settings.CommonSettings;
import com.smartengines.engine.p005id.LvResultData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: LivenessResultScreen.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$LivenessResultScreenKt {
    public static final ComposableSingletons$LivenessResultScreenKt INSTANCE = new ComposableSingletons$LivenessResultScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2083lambda1 = ComposableLambdaKt.composableLambdaInstance(-82066818, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ComposableSingletons$LivenessResultScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C67@2327L141:LivenessResultScreen.kt#4ipo3i");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                LivenessResultScreenKt.LivenessResultScreen(MockSelectorsKt.getMockSelectedTreeLeaf(), new LvResultData(1.0d), new CommonSettings(null, 1, null), composer, 584, 0);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2084lambda2 = ComposableLambdaKt.composableLambdaInstance(-1093077533, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ComposableSingletons$LivenessResultScreenKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C66@2305L173:LivenessResultScreen.kt#4ipo3i");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$LivenessResultScreenKt.INSTANCE.m7608getLambda1$app_storeRelease(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7608getLambda1$app_storeRelease() {
        return f2083lambda1;
    }

    /* renamed from: getLambda-2$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7609getLambda2$app_storeRelease() {
        return f2084lambda2;
    }
}
