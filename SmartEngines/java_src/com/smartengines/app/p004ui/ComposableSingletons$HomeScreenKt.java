package com.smartengines.app.p004ui;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.targets.IdTargetTestUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeScreen.kt */
@Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$HomeScreenKt {
    public static final ComposableSingletons$HomeScreenKt INSTANCE = new ComposableSingletons$HomeScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f2014lambda1 = ComposableLambdaKt.composableLambdaInstance(2016905161, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ComposableSingletons$HomeScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            ComposerKt.sourceInformation(composer, "C78@3146L6:HomeScreen.kt#83idza");
            FragmentsKt.Logo(composer, 0);
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f2015lambda2 = ComposableLambdaKt.composableLambdaInstance(-334474595, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ComposableSingletons$HomeScreenKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            ComposerKt.sourceInformation(composer, "C94@3686L6:HomeScreen.kt#83idza");
            FragmentsKt.Logo(composer, 0);
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function3<AnimatedVisibilityScope, Composer, Integer, Unit> f2016lambda3 = ComposableLambdaKt.composableLambdaInstance(-1781144428, false, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ComposableSingletons$HomeScreenKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            ComposerKt.sourceInformation(composer, "C105@4113L16,106@4150L316:HomeScreen.kt#83idza");
            FragmentsKt.AppTitle("", null, true, true, false, !invoke$lambda$0(SnapshotStateKt.collectAsState(IdTargetTestUtils.INSTANCE.getErrors(), null, composer, 8, 1)).isEmpty(), composer, 28086, 0);
        }

        private static final List<String> invoke$lambda$0(State<? extends List<String>> state) {
            return state.getValue();
        }
    });

    /* renamed from: getLambda-1$app_storeRelease, reason: not valid java name */
    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> m7468getLambda1$app_storeRelease() {
        return f2014lambda1;
    }

    /* renamed from: getLambda-2$app_storeRelease, reason: not valid java name */
    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> m7469getLambda2$app_storeRelease() {
        return f2015lambda2;
    }

    /* renamed from: getLambda-3$app_storeRelease, reason: not valid java name */
    public final Function3<AnimatedVisibilityScope, Composer, Integer, Unit> m7470getLambda3$app_storeRelease() {
        return f2016lambda3;
    }
}
