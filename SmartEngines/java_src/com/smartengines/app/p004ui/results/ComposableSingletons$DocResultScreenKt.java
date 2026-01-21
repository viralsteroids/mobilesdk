package com.smartengines.app.p004ui.results;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.mock.MockDocKt;
import com.smartengines.app.mock.MockSelectorsKt;
import com.smartengines.app.settings.CommonSettings;
import com.smartengines.app.settings.DocSettings;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: DocResultScreen.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$DocResultScreenKt {
    public static final ComposableSingletons$DocResultScreenKt INSTANCE = new ComposableSingletons$DocResultScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2081lambda1 = ComposableLambdaKt.composableLambdaInstance(-257982753, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ComposableSingletons$DocResultScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C69@2382L163:DocResultScreen.kt#4ipo3i");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                DocResultScreenKt.DocResultScreen(MockSelectorsKt.getMockSelectedTreeLeaf(), MockDocKt.getMockDocResult(), new CommonSettings(null, 1, null), new DocSettings(null, 1, null), composer, 4680, 0);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2082lambda2 = ComposableLambdaKt.composableLambdaInstance(886686404, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ComposableSingletons$DocResultScreenKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C68@2358L197:DocResultScreen.kt#4ipo3i");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$DocResultScreenKt.INSTANCE.m7606getLambda1$app_storeRelease(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7606getLambda1$app_storeRelease() {
        return f2081lambda1;
    }

    /* renamed from: getLambda-2$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7607getLambda2$app_storeRelease() {
        return f2082lambda2;
    }
}
