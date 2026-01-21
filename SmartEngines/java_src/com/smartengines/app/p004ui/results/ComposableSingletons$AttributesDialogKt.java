package com.smartengines.app.p004ui.results;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: AttributesDialog.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$AttributesDialogKt {
    public static final ComposableSingletons$AttributesDialogKt INSTANCE = new ComposableSingletons$AttributesDialogKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2072lambda1 = ComposableLambdaKt.composableLambdaInstance(1729488582, false, ComposableSingletons$AttributesDialogKt$lambda1$1.INSTANCE);

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2073lambda2 = ComposableLambdaKt.composableLambdaInstance(452927489, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ComposableSingletons$AttributesDialogKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C66@2500L65:AttributesDialog.kt#4ipo3i");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$AttributesDialogKt.INSTANCE.m7596getLambda1$app_storeRelease(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2074lambda3 = ComposableLambdaKt.composableLambdaInstance(1252197289, false, ComposableSingletons$AttributesDialogKt$lambda3$1.INSTANCE);

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2075lambda4 = ComposableLambdaKt.composableLambdaInstance(333509070, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ComposableSingletons$AttributesDialogKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C79@2876L563:AttributesDialog.kt#4ipo3i");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$AttributesDialogKt.INSTANCE.m7598getLambda3$app_storeRelease(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7596getLambda1$app_storeRelease() {
        return f2072lambda1;
    }

    /* renamed from: getLambda-2$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7597getLambda2$app_storeRelease() {
        return f2073lambda2;
    }

    /* renamed from: getLambda-3$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7598getLambda3$app_storeRelease() {
        return f2074lambda3;
    }

    /* renamed from: getLambda-4$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7599getLambda4$app_storeRelease() {
        return f2075lambda4;
    }
}
