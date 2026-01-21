package com.smartengines.app.p004ui.settings;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.res.PainterResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.C3069R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Fragments.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$FragmentsKt {
    public static final ComposableSingletons$FragmentsKt INSTANCE = new ComposableSingletons$FragmentsKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2131lambda1 = ComposableLambdaKt.composableLambdaInstance(-2110396174, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$FragmentsKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C50@2130L35,51@2220L11,49@2100L161:Fragments.kt#v86m6v");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                IconKt.m2584Iconww6aTOc(PainterResources_androidKt.painterResource(C3069R.drawable.ic_back, composer, 0), "back", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), composer, 56, 4);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2132lambda2 = ComposableLambdaKt.composableLambdaInstance(1281832998, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$FragmentsKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C180@5570L36,180@5565L51:Fragments.kt#v86m6v");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                IconKt.m2584Iconww6aTOc(PainterResources_androidKt.painterResource(C3069R.drawable.ic_minus, composer, 0), "minus", (Modifier) null, 0L, composer, 56, 12);
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2133lambda3 = ComposableLambdaKt.composableLambdaInstance(662837789, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$FragmentsKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C189@5944L35,189@5939L48:Fragments.kt#v86m6v");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                IconKt.m2584Iconww6aTOc(PainterResources_androidKt.painterResource(C3069R.drawable.ic_plus, composer, 0), "plus", (Modifier) null, 0L, composer, 56, 12);
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f2134lambda4 = ComposableLambdaKt.composableLambdaInstance(1311919217, false, ComposableSingletons$FragmentsKt$lambda4$1.INSTANCE);

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f2135lambda5 = ComposableLambdaKt.composableLambdaInstance(-2056085158, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$FragmentsKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope SettingsScaffold, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(SettingsScaffold, "$this$SettingsScaffold");
            ComposerKt.sourceInformation(composer, "C200@6311L235:Fragments.kt#v86m6v");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                FragmentsKt.Section("Section", ComposableSingletons$FragmentsKt.INSTANCE.m7714getLambda4$app_storeRelease(), composer, 54, 0);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-6, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2136lambda6 = ComposableLambdaKt.composableLambdaInstance(-340670158, false, ComposableSingletons$FragmentsKt$lambda6$1.INSTANCE);

    /* renamed from: lambda-7, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f2137lambda7 = ComposableLambdaKt.composableLambdaInstance(237475155, false, ComposableSingletons$FragmentsKt$lambda7$1.INSTANCE);

    /* renamed from: lambda-8, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f2138lambda8 = ComposableLambdaKt.composableLambdaInstance(-1091445366, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.settings.ComposableSingletons$FragmentsKt$lambda-8$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope SettingsScaffold, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(SettingsScaffold, "$this$SettingsScaffold");
            ComposerKt.sourceInformation(composer, "C214@6768L235:Fragments.kt#v86m6v");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                FragmentsKt.Section("Section", ComposableSingletons$FragmentsKt.INSTANCE.m7717getLambda7$app_storeRelease(), composer, 54, 0);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-9, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2139lambda9 = ComposableLambdaKt.composableLambdaInstance(546812082, false, ComposableSingletons$FragmentsKt$lambda9$1.INSTANCE);

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7711getLambda1$app_storeRelease() {
        return f2131lambda1;
    }

    /* renamed from: getLambda-2$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7712getLambda2$app_storeRelease() {
        return f2132lambda2;
    }

    /* renamed from: getLambda-3$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7713getLambda3$app_storeRelease() {
        return f2133lambda3;
    }

    /* renamed from: getLambda-4$app_storeRelease, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7714getLambda4$app_storeRelease() {
        return f2134lambda4;
    }

    /* renamed from: getLambda-5$app_storeRelease, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7715getLambda5$app_storeRelease() {
        return f2135lambda5;
    }

    /* renamed from: getLambda-6$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7716getLambda6$app_storeRelease() {
        return f2136lambda6;
    }

    /* renamed from: getLambda-7$app_storeRelease, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7717getLambda7$app_storeRelease() {
        return f2137lambda7;
    }

    /* renamed from: getLambda-8$app_storeRelease, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7718getLambda8$app_storeRelease() {
        return f2138lambda8;
    }

    /* renamed from: getLambda-9$app_storeRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7719getLambda9$app_storeRelease() {
        return f2139lambda9;
    }
}
