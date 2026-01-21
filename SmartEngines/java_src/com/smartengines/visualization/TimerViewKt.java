package com.smartengines.visualization;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ColorKt;
import androidx.compose.p000ui.graphics.drawscope.DrawScope;
import androidx.compose.p000ui.graphics.drawscope.Stroke;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.p000ui.unit.Density;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.visualization.Visualization;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jmrtd.lds.LDSFile;

/* compiled from: TimerView.kt */
@Metadata(m513d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\u001a\u0015\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, m514d2 = {"TAG", "", "TimerView", "", "visObject", "Lcom/smartengines/visualization/Visualization$Timer;", "(Lcom/smartengines/visualization/Visualization$Timer;Landroidx/compose/runtime/Composer;I)V", "TimerIndicator", "fraction", "", "lineWidth", "(FFLandroidx/compose/runtime/Composer;I)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "visualization_release", "data", "Lcom/smartengines/visualization/Visualization$Timer$Data;"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TimerViewKt {
    private static final String TAG = "myapp.TimerView";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$13(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimerIndicator$lambda$10(float f, float f2, int i, Composer composer, int i2) {
        TimerIndicator(f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimerView$lambda$1(Visualization.Timer visObject, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(visObject, "$visObject");
        TimerView(visObject, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimerView$lambda$7(Visualization.Timer visObject, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(visObject, "$visObject");
        TimerView(visObject, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void TimerView(final Visualization.Timer visObject, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(visObject, "visObject");
        Composer composerStartRestartGroup = composer.startRestartGroup(-268673898);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TimerView)46@1914L16,49@2020L7,50@2048L40,55@2228L34,56@2288L257,56@2267L278,65@2551L232:TimerView.kt#hal2ob");
        State stateCollectAsState = SnapshotStateKt.collectAsState(visObject.getDataFlow(), null, composerStartRestartGroup, 8, 1);
        if (TimerView$lambda$0(stateCollectAsState).getLength() <= 0) {
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.visualization.TimerViewKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TimerViewKt.TimerView$lambda$1(visObject, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        Density density = (Density) objConsume;
        composerStartRestartGroup.startReplaceGroup(-1061910929);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):TimerView.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = Float.valueOf(density.mo1127toPx0680j_4(C1959Dp.m7055constructorimpl(3)));
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        float fFloatValue = ((Number) objRememberedValue).floatValue();
        composerStartRestartGroup.endReplaceGroup();
        composerStartRestartGroup.startReplaceGroup(-1061905175);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):TimerView.kt#9igjgp");
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = SnapshotLongStateKt.mutableLongStateOf(0L);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        MutableLongState mutableLongState = (MutableLongState) objRememberedValue2;
        composerStartRestartGroup.endReplaceGroup();
        Visualization.Timer.Data dataTimerView$lambda$0 = TimerView$lambda$0(stateCollectAsState);
        composerStartRestartGroup.startReplaceGroup(-1061903032);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):TimerView.kt#9igjgp");
        boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState);
        TimerViewKt$TimerView$2$1 timerViewKt$TimerView$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || timerViewKt$TimerView$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
            timerViewKt$TimerView$2$1RememberedValue = new TimerViewKt$TimerView$2$1(mutableLongState, stateCollectAsState, null);
            composerStartRestartGroup.updateRememberedValue(timerViewKt$TimerView$2$1RememberedValue);
        }
        composerStartRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(dataTimerView$lambda$0, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) timerViewKt$TimerView$2$1RememberedValue, composerStartRestartGroup, 64);
        Modifier modifierM1435padding3ABfNKs = PaddingKt.m1435padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), C1959Dp.m7055constructorimpl(10));
        Alignment center = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1435padding3ABfNKs);
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
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1302342036, "C66@2640L137:TimerView.kt#hal2ob");
        TimerIndicator(mutableLongState.getLongValue() / TimerView$lambda$0(stateCollectAsState).getLength(), fFloatValue, composerStartRestartGroup, 48);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.smartengines.visualization.TimerViewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TimerViewKt.TimerView$lambda$7(visObject, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void TimerIndicator(final float f, final float f2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1836644519);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TimerIndicator)75@2958L223,75@2899L282:TimerView.kt#hal2ob");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & LDSFile.EF_DG16_TAG) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifierAspectRatio$default = AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
            composerStartRestartGroup.startReplaceGroup(-300104372);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):TimerView.kt#9igjgp");
            boolean z = ((i2 & 14) == 4) | ((i2 & LDSFile.EF_DG16_TAG) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.smartengines.visualization.TimerViewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TimerViewKt.TimerIndicator$lambda$9$lambda$8(f, f2, (DrawScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(modifierAspectRatio$default, (Function1) objRememberedValue, composerStartRestartGroup, 6);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.visualization.TimerViewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TimerViewKt.TimerIndicator$lambda$10(f, f2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimerIndicator$lambda$9$lambda$8(float f, float f2, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.m5130drawArcyD3GUKo$default(Canvas, ColorKt.Color(4278255615L), -90.0f, f * 360.0f, false, 0L, 0L, 0.0f, new Stroke(f2, 0.0f, 0, 0, null, 30, null), null, 0, 880, null);
        return Unit.INSTANCE;
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1235520203);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview)91@3386L89,96@3512L36,96@3480L68:TimerView.kt#hal2ob");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startReplaceGroup(-1177445922);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):TimerView.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object obj = objRememberedValue;
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Visualization.Timer timer = new Visualization.Timer();
                timer.start(3000L);
                composerStartRestartGroup.updateRememberedValue(timer);
                obj = timer;
            }
            final Visualization.Timer timer2 = (Visualization.Timer) obj;
            composerStartRestartGroup.endReplaceGroup();
            SurfaceKt.m2978SurfaceT9BRK9s(null, null, Color.INSTANCE.m4624getDarkGray0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1943271824, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.visualization.TimerViewKt.Preview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposerKt.sourceInformation(composer2, "C97@3522L20:TimerView.kt#hal2ob");
                    if ((i2 & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        TimerViewKt.TimerView(timer2, composer2, 8);
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 12583296, 123);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.visualization.TimerViewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return TimerViewKt.Preview$lambda$13(i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Visualization.Timer.Data TimerView$lambda$0(State<Visualization.Timer.Data> state) {
        return state.getValue();
    }
}
