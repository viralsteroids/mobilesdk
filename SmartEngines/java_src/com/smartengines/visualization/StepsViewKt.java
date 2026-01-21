package com.smartengines.visualization;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ColorFilter;
import androidx.compose.p000ui.layout.ContentScale;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.PainterResources_androidKt;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.visualization.Visualization;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StepsView.kt */
@Metadata(m513d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\u0010\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u008a\u0084\u0002"}, m514d2 = {"StepsView", "", "visObject", "Lcom/smartengines/visualization/Visualization$Steps;", "(Lcom/smartengines/visualization/Visualization$Steps;Landroidx/compose/runtime/Composer;I)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "visualization_release", "data", "", "Lcom/smartengines/visualization/Visualization$Steps$StepState;"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class StepsViewKt {

    /* compiled from: StepsView.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Visualization.Steps.StepState.values().length];
            try {
                iArr[Visualization.Steps.StepState.NOT_COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Visualization.Steps.StepState.SUCCESSFUL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Visualization.Steps.StepState.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$8(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StepsView$lambda$1(Visualization.Steps visObject, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(visObject, "$visObject");
        StepsView(visObject, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StepsView$lambda$5(Visualization.Steps visObject, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(visObject, "$visObject");
        StepsView(visObject, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void StepsView(final Visualization.Steps visObject, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(visObject, "visObject");
        Composer composerStartRestartGroup = composer.startRestartGroup(2025363128);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(StepsView)25@991L16,28@1069L670:StepsView.kt#hal2ob");
        State stateCollectAsState = SnapshotStateKt.collectAsState(visObject.getDataFlow(), null, composerStartRestartGroup, 8, 1);
        if (StepsView$lambda$0(stateCollectAsState).isEmpty()) {
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.visualization.StepsViewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return StepsViewKt.StepsView$lambda$1(visObject, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        Alignment bottomCenter = Alignment.INSTANCE.getBottomCenter();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(bottomCenter, false);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composerStartRestartGroup);
        Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1078959373, "C29@1149L584:StepsView.kt#hal2ob");
        Modifier modifierM1439paddingqDBjuR0$default = PaddingKt.m1439paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1959Dp.m7055constructorimpl(100), 7, null);
        Arrangement.HorizontalOrVertical horizontalOrVerticalM1315spacedBy0680j_4 = Arrangement.INSTANCE.m1315spacedBy0680j_4(C1959Dp.m7055constructorimpl(5));
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM1315spacedBy0680j_4, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1439paddingqDBjuR0$default);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM4088constructorimpl2 = Updater.m4088constructorimpl(composerStartRestartGroup);
        Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2111576633, "C:StepsView.kt#hal2ob");
        composerStartRestartGroup.startReplaceGroup(-760851881);
        ComposerKt.sourceInformation(composerStartRestartGroup, "*32@1312L333,31@1285L424");
        Iterator<T> it = StepsView$lambda$0(stateCollectAsState).iterator();
        while (it.hasNext()) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[((Visualization.Steps.StepState) it.next()).ordinal()];
            if (i3 == 1) {
                i2 = C3315R.drawable.ic_ball_gray;
            } else if (i3 == 2) {
                i2 = C3315R.drawable.ic_ball_green;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = C3315R.drawable.ic_ball_red;
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(i2, composerStartRestartGroup, 0), "", SizeKt.m1480size3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, MenuKt.InTransitionDuration);
        }
        composerStartRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.smartengines.visualization.StepsViewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StepsViewKt.StepsView$lambda$5(visObject, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-867369815);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview)49@1944L341,57@2322L36,57@2290L68:StepsView.kt#hal2ob");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startReplaceGroup(-1177491814);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):StepsView.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object obj = objRememberedValue;
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Visualization.Steps steps = new Visualization.Steps(8);
                steps.onStepCompleted(Visualization.Steps.StepState.SUCCESSFUL);
                steps.onStepCompleted(Visualization.Steps.StepState.FAILED);
                steps.onStepCompleted(Visualization.Steps.StepState.SUCCESSFUL);
                steps.onStepCompleted(Visualization.Steps.StepState.SUCCESSFUL);
                composerStartRestartGroup.updateRememberedValue(steps);
                obj = steps;
            }
            final Visualization.Steps steps2 = (Visualization.Steps) obj;
            composerStartRestartGroup.endReplaceGroup();
            SurfaceKt.m2978SurfaceT9BRK9s(null, null, Color.INSTANCE.m4624getDarkGray0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-159618194, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.visualization.StepsViewKt.Preview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposerKt.sourceInformation(composer2, "C58@2332L20:StepsView.kt#hal2ob");
                    if ((i2 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        StepsViewKt.StepsView(steps2, composer2, 8);
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 12583296, 123);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.visualization.StepsViewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return StepsViewKt.Preview$lambda$8(i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final List<Visualization.Steps.StepState> StepsView$lambda$0(State<? extends List<? extends Visualization.Steps.StepState>> state) {
        return (List) state.getValue();
    }
}
