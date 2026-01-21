package com.smartengines.tree.p009ui;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OneLevel.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$OneLevelKt {
    public static final ComposableSingletons$OneLevelKt INSTANCE = new ComposableSingletons$OneLevelKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<AppNode, Composer, Integer, Unit> f2192lambda1 = ComposableLambdaKt.composableLambdaInstance(-819289978, false, new Function3<AppNode, Composer, Integer, Unit>() { // from class: com.smartengines.tree.ui.ComposableSingletons$OneLevelKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AppNode appNode, Composer composer, Integer num) {
            invoke(appNode, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AppNode it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            ComposerKt.sourceInformation(composer, "C86@2659L22:OneLevel.kt#snoj4b");
            PreviewKt.NodeRow(it, composer, 8);
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2193lambda2 = ComposableLambdaKt.composableLambdaInstance(-1020016083, false, ComposableSingletons$OneLevelKt$lambda2$1.INSTANCE);

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2194lambda3 = ComposableLambdaKt.composableLambdaInstance(-767840536, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.tree.ui.ComposableSingletons$OneLevelKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C84@2576L131:OneLevel.kt#snoj4b");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$OneLevelKt.INSTANCE.m7818getLambda2$tree_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function3<AppNode, Composer, Integer, Unit> f2195lambda4 = ComposableLambdaKt.composableLambdaInstance(-32267059, false, new Function3<AppNode, Composer, Integer, Unit>() { // from class: com.smartengines.tree.ui.ComposableSingletons$OneLevelKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AppNode appNode, Composer composer, Integer num) {
            invoke(appNode, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AppNode it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            ComposerKt.sourceInformation(composer, "C100@2983L30:OneLevel.kt#snoj4b");
            PreviewKt.NodeIcon(it, false, composer, 56);
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2196lambda5 = ComposableLambdaKt.composableLambdaInstance(430193192, false, ComposableSingletons$OneLevelKt$lambda5$1.INSTANCE);

    /* renamed from: lambda-6, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2197lambda6 = ComposableLambdaKt.composableLambdaInstance(-342299443, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.tree.ui.ComposableSingletons$OneLevelKt$lambda-6$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C97@2865L174:OneLevel.kt#snoj4b");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$OneLevelKt.INSTANCE.m7821getLambda5$tree_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$tree_release, reason: not valid java name */
    public final Function3<AppNode, Composer, Integer, Unit> m7817getLambda1$tree_release() {
        return f2192lambda1;
    }

    /* renamed from: getLambda-2$tree_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7818getLambda2$tree_release() {
        return f2193lambda2;
    }

    /* renamed from: getLambda-3$tree_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7819getLambda3$tree_release() {
        return f2194lambda3;
    }

    /* renamed from: getLambda-4$tree_release, reason: not valid java name */
    public final Function3<AppNode, Composer, Integer, Unit> m7820getLambda4$tree_release() {
        return f2195lambda4;
    }

    /* renamed from: getLambda-5$tree_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7821getLambda5$tree_release() {
        return f2196lambda5;
    }

    /* renamed from: getLambda-6$tree_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7822getLambda6$tree_release() {
        return f2197lambda6;
    }
}
