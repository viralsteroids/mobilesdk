package com.smartengines.app;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.p004ui.AppContentKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: MainActivity.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$MainActivityKt {
    public static final ComposableSingletons$MainActivityKt INSTANCE = new ComposableSingletons$MainActivityKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f1957lambda1 = ComposableLambdaKt.composableLambdaInstance(695871706, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ComposableSingletons$MainActivityKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C23@684L12:MainActivity.kt#f2dr48");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                AppContentKt.AppContent(composer, 0);
            }
        }
    });

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7372getLambda1$app_storeRelease() {
        return f1957lambda1;
    }
}
