package com.smartengines.app.p004ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.IconKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.res.PainterResources_androidKt;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.C3069R;
import com.smartengines.app.p004ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: FacesScreen2.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$FacesScreen2Kt {
    public static final ComposableSingletons$FacesScreen2Kt INSTANCE = new ComposableSingletons$FacesScreen2Kt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f1988lambda1 = ComposableLambdaKt.composableLambdaInstance(1323066579, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ComposableSingletons$FacesScreen2Kt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C201@7356L37,201@7351L165:FacesScreen2.kt#83idza");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                IconKt.m2584Iconww6aTOc(PainterResources_androidKt.painterResource(C3069R.drawable.ic_cancel, composer, 0), "clear", PaddingKt.m1439paddingqDBjuR0$default(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(10), 0.0f, 0.0f, 0.0f, 14, null), ColorKt.getPrimaryColor(), composer, 3512, 0);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7437getLambda1$app_storeRelease() {
        return f1988lambda1;
    }
}
