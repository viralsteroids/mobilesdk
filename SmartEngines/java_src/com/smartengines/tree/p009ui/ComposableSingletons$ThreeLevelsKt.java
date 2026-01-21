package com.smartengines.tree.p009ui;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* compiled from: ThreeLevels.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ThreeLevelsKt {
    public static final ComposableSingletons$ThreeLevelsKt INSTANCE = new ComposableSingletons$ThreeLevelsKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function4<AppNode, Boolean, Composer, Integer, Unit> f2198lambda1 = ComposableLambdaKt.composableLambdaInstance(2001296237, false, new Function4<AppNode, Boolean, Composer, Integer, Unit>() { // from class: com.smartengines.tree.ui.ComposableSingletons$ThreeLevelsKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AppNode appNode, Boolean bool, Composer composer, Integer num) {
            invoke(appNode, bool.booleanValue(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AppNode node, boolean z, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(node, "node");
            ComposerKt.sourceInformation(composer, "C79@3015L42:ThreeLevels.kt#snoj4b");
            PreviewKt.NodeRowAccordion(node, z, composer, (i & LDSFile.EF_DG16_TAG) | 8);
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function4<AppNode, Boolean, Composer, Integer, Unit> f2199lambda2 = ComposableLambdaKt.composableLambdaInstance(1327229452, false, new Function4<AppNode, Boolean, Composer, Integer, Unit>() { // from class: com.smartengines.tree.ui.ComposableSingletons$ThreeLevelsKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AppNode appNode, Boolean bool, Composer composer, Integer num) {
            invoke(appNode, bool.booleanValue(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AppNode node, boolean z, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(node, "node");
            ComposerKt.sourceInformation(composer, "C80@3121L34:ThreeLevels.kt#snoj4b");
            PreviewKt.NodeIcon(node, z, composer, (i & LDSFile.EF_DG16_TAG) | 8);
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function3<AppNode, Composer, Integer, Unit> f2200lambda3 = ComposableLambdaKt.composableLambdaInstance(1681294927, false, new Function3<AppNode, Composer, Integer, Unit>() { // from class: com.smartengines.tree.ui.ComposableSingletons$ThreeLevelsKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AppNode appNode, Composer composer, Integer num) {
            invoke(appNode, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AppNode it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(it, "it");
            ComposerKt.sourceInformation(composer, "C81@3201L22:ThreeLevels.kt#snoj4b");
            PreviewKt.NodeRow(it, composer, 8);
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2201lambda4 = ComposableLambdaKt.composableLambdaInstance(632318159, false, ComposableSingletons$ThreeLevelsKt$lambda4$1.INSTANCE);

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f2202lambda5 = ComposableLambdaKt.composableLambdaInstance(-1576304460, false, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.tree.ui.ComposableSingletons$ThreeLevelsKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C77@2894L356:ThreeLevels.kt#snoj4b");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$ThreeLevelsKt.INSTANCE.m7828getLambda4$tree_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$tree_release, reason: not valid java name */
    public final Function4<AppNode, Boolean, Composer, Integer, Unit> m7825getLambda1$tree_release() {
        return f2198lambda1;
    }

    /* renamed from: getLambda-2$tree_release, reason: not valid java name */
    public final Function4<AppNode, Boolean, Composer, Integer, Unit> m7826getLambda2$tree_release() {
        return f2199lambda2;
    }

    /* renamed from: getLambda-3$tree_release, reason: not valid java name */
    public final Function3<AppNode, Composer, Integer, Unit> m7827getLambda3$tree_release() {
        return f2200lambda3;
    }

    /* renamed from: getLambda-4$tree_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7828getLambda4$tree_release() {
        return f2201lambda4;
    }

    /* renamed from: getLambda-5$tree_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7829getLambda5$tree_release() {
        return f2202lambda5;
    }
}
