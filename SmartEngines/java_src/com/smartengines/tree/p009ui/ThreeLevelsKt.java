package com.smartengines.tree.p009ui;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.exifinterface.media.ExifInterface;
import com.smartengines.tree.TreeNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreeLevels.kt */
@Metadata(m513d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0098\u0001\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\t2\u001d\u0010\n\u001a\u0019\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\r2\u001d\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\r2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\fX\u008a\u008e\u0002"}, m514d2 = {"ThreeLevelsAccordion", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/smartengines/tree/TreeNode;", "colNumber", "", "data", "", "onNodeClick", "Lkotlin/Function1;", "firstLevelNodeContent", "Lkotlin/Function2;", "", "Landroidx/compose/runtime/Composable;", "secondLevelNodeContent", "thirdLevelNodeContent", "(ILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "tree_release", "isExpanded"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ThreeLevelsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$8(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ThreeLevelsAccordion$lambda$7(int i, List data, Function1 onNodeClick, Function4 firstLevelNodeContent, Function4 secondLevelNodeContent, Function3 thirdLevelNodeContent, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(onNodeClick, "$onNodeClick");
        Intrinsics.checkNotNullParameter(firstLevelNodeContent, "$firstLevelNodeContent");
        Intrinsics.checkNotNullParameter(secondLevelNodeContent, "$secondLevelNodeContent");
        Intrinsics.checkNotNullParameter(thirdLevelNodeContent, "$thirdLevelNodeContent");
        ThreeLevelsAccordion(i, data, onNodeClick, firstLevelNodeContent, secondLevelNodeContent, thirdLevelNodeContent, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    public static final <T extends TreeNode> void ThreeLevelsAccordion(final int i, final List<? extends T> data, final Function1<? super T, Unit> function1, final Function4<? super T, ? super Boolean, ? super Composer, ? super Integer, Unit> firstLevelNodeContent, final Function4<? super T, ? super Boolean, ? super Composer, ? super Integer, Unit> function4, final Function3<? super T, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i2) {
        final Function1<? super T, Unit> onNodeClick = function1;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onNodeClick, "onNodeClick");
        Intrinsics.checkNotNullParameter(firstLevelNodeContent, "firstLevelNodeContent");
        Function4<? super T, ? super Boolean, ? super Composer, ? super Integer, Unit> secondLevelNodeContent = function4;
        Intrinsics.checkNotNullParameter(secondLevelNodeContent, "secondLevelNodeContent");
        final Function3<? super T, ? super Composer, ? super Integer, Unit> thirdLevelNodeContent = function3;
        Intrinsics.checkNotNullParameter(thirdLevelNodeContent, "thirdLevelNodeContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-586104381);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ThreeLevelsAccordion)P(!2,3)36@1391L1222:ThreeLevels.kt#snoj4b");
        SnapshotMutationPolicy snapshotMutationPolicy = null;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        ?? r15 = 0;
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
        String str = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        String str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
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
        Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 562225584, "C:ThreeLevels.kt#snoj4b");
        composerStartRestartGroup.startReplaceGroup(2096346446);
        ComposerKt.sourceInformation(composerStartRestartGroup, "*38@1505L50,41@1613L218,53@2159L438,49@1891L706");
        int i3 = 0;
        for (Object obj : data) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final TreeNode treeNode = (TreeNode) obj;
            composerStartRestartGroup.startReplaceGroup(-1178572850);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):ThreeLevels.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(treeNode);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf((PreviewKt.isPreview() && i3 == 0) ? true : r15), snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM1023clickableXHw0xAI$default = ClickableKt.m1023clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, new Function0() { // from class: com.smartengines.tree.ui.ThreeLevelsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ThreeLevelsKt.ThreeLevelsAccordion$lambda$6$lambda$5$lambda$3(treeNode, onNodeClick, mutableState);
                }
            }, 7, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r15);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, str);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, r15);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1023clickableXHw0xAI$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            String str3 = str;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, str2);
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
            Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 957730338, "C45@1779L38:ThreeLevels.kt#snoj4b");
            firstLevelNodeContent.invoke(treeNode, Boolean.valueOf(ThreeLevelsAccordion$lambda$6$lambda$5$lambda$1(mutableState)), composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 896));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Function4<? super T, ? super Boolean, ? super Composer, ? super Integer, Unit> function42 = secondLevelNodeContent;
            ColumnScopeInstance columnScopeInstance2 = columnScopeInstance;
            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance2, ThreeLevelsAccordion$lambda$6$lambda$5$lambda$1(mutableState), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-1285942348, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.smartengines.tree.ui.ThreeLevelsKt$ThreeLevelsAccordion$1$1$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    ComposerKt.sourceInformation(composer2, "C*55@2228L337:ThreeLevels.kt#snoj4b");
                    List<TreeNode> children = treeNode.getChildren();
                    if (children == null) {
                        return;
                    }
                    TwoLevelsKt.TwoLevelsIconsRows(i, children, function1, function42, thirdLevelNodeContent, composer2, 64);
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 30);
            secondLevelNodeContent = function4;
            thirdLevelNodeContent = function3;
            str2 = str2;
            columnScopeInstance = columnScopeInstance2;
            i3 = i4;
            str = str3;
            snapshotMutationPolicy = null;
            r15 = 0;
            onNodeClick = function1;
        }
        composerStartRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.tree.ui.ThreeLevelsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ThreeLevelsKt.ThreeLevelsAccordion$lambda$7(i, data, function1, firstLevelNodeContent, function4, function3, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final boolean ThreeLevelsAccordion$lambda$6$lambda$5$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ThreeLevelsAccordion$lambda$6$lambda$5$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ThreeLevelsAccordion$lambda$6$lambda$5$lambda$3(TreeNode node, Function1 onNodeClick, MutableState isExpanded$delegate) {
        Intrinsics.checkNotNullParameter(node, "$node");
        Intrinsics.checkNotNullParameter(onNodeClick, "$onNodeClick");
        Intrinsics.checkNotNullParameter(isExpanded$delegate, "$isExpanded$delegate");
        if (node.isLeaf()) {
            onNodeClick.invoke(node);
        } else {
            ThreeLevelsAccordion$lambda$6$lambda$5$lambda$2(isExpanded$delegate, !ThreeLevelsAccordion$lambda$6$lambda$5$lambda$1(isExpanded$delegate));
        }
        return Unit.INSTANCE;
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1448409336);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview)74@2822L434:ThreeLevels.kt#snoj4b");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            PreviewKt.setPreview(true);
            MaterialThemeKt.MaterialTheme(ColorSchemeKt.m2366darkColorSchemeCXl9yA$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null), null, null, ComposableSingletons$ThreeLevelsKt.INSTANCE.m7829getLambda5$tree_release(), composerStartRestartGroup, 3072, 6);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.tree.ui.ThreeLevelsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ThreeLevelsKt.Preview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
