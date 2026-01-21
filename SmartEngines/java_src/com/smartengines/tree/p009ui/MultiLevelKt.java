package com.smartengines.tree.p009ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.exifinterface.media.ExifInterface;
import com.smartengines.tree.C3297R;
import com.smartengines.tree.TreeNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.tls.CipherSuite;

/* compiled from: MultiLevel.kt */
@Metadata(m513d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aZ\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m514d2 = {"MultiLevelTreeView", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/smartengines/tree/TreeNode;", "model", "Lcom/smartengines/tree/ui/MultiLevelTreeModel;", "onLeafClick", "Lkotlin/Function1;", "options", "Lcom/smartengines/tree/ui/TreeViewOptions;", "nodeContent", "Landroidx/compose/runtime/Composable;", "(Lcom/smartengines/tree/ui/MultiLevelTreeModel;Lkotlin/jvm/functions/Function1;Lcom/smartengines/tree/ui/TreeViewOptions;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "PreviewRows", "(Landroidx/compose/runtime/Composer;I)V", "tree_release"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class MultiLevelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiLevelTreeView$lambda$7(MultiLevelTreeModel model, Function1 onLeafClick, TreeViewOptions options, Function3 nodeContent, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(model, "$model");
        Intrinsics.checkNotNullParameter(onLeafClick, "$onLeafClick");
        Intrinsics.checkNotNullParameter(options, "$options");
        Intrinsics.checkNotNullParameter(nodeContent, "$nodeContent");
        MultiLevelTreeView(model, onLeafClick, options, nodeContent, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewRows$lambda$8(int i, Composer composer, int i2) {
        PreviewRows(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final <T extends TreeNode> void MultiLevelTreeView(final MultiLevelTreeModel<T> model, final Function1<? super T, Unit> onLeafClick, final TreeViewOptions options, final Function3<? super T, ? super Composer, ? super Integer, Unit> nodeContent, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(onLeafClick, "onLeafClick");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(nodeContent, "nodeContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1218736660);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(MultiLevelTreeView)P(!1,2,3)43@1561L1751:MultiLevel.kt#snoj4b");
        LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), model.getLazyListState(), PaddingKt.m1430PaddingValuesYgX7TsA$default(0.0f, C1959Dp.m7055constructorimpl(options.getSpaceBetweenRows()), 1, null), false, Arrangement.INSTANCE.m1315spacedBy0680j_4(C1959Dp.m7055constructorimpl(options.getSpaceBetweenRows())), null, null, false, new Function1() { // from class: com.smartengines.tree.ui.MultiLevelKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiLevelKt.MultiLevelTreeView$lambda$6(model, onLeafClick, options, nodeContent, (LazyListScope) obj);
            }
        }, composerStartRestartGroup, 6, 232);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.tree.ui.MultiLevelKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MultiLevelKt.MultiLevelTreeView$lambda$7(model, onLeafClick, options, nodeContent, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiLevelTreeView$lambda$6(final MultiLevelTreeModel model, final Function1 onLeafClick, final TreeViewOptions options, final Function3 nodeContent, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(model, "$model");
        Intrinsics.checkNotNullParameter(onLeafClick, "$onLeafClick");
        Intrinsics.checkNotNullParameter(options, "$options");
        Intrinsics.checkNotNullParameter(nodeContent, "$nodeContent");
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List<RowData> value = model.getRows$tree_release().getValue();
        final Function1 function1 = new Function1() { // from class: com.smartengines.tree.ui.MultiLevelKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MultiLevelKt.MultiLevelTreeView$lambda$6$lambda$0((RowData) obj);
            }
        };
        final C3304xb3691d32 c3304xb3691d32 = new Function1() { // from class: com.smartengines.tree.ui.MultiLevelKt$MultiLevelTreeView$lambda$6$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(RowData rowData) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((RowData) obj);
            }
        };
        LazyColumn.items(value.size(), new Function1<Integer, Object>() { // from class: com.smartengines.tree.ui.MultiLevelKt$MultiLevelTreeView$lambda$6$$inlined$items$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function1.invoke(value.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.smartengines.tree.ui.MultiLevelKt$MultiLevelTreeView$lambda$6$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c3304xb3691d32.invoke(value.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.smartengines.tree.ui.MultiLevelKt$MultiLevelTreeView$lambda$6$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                String str;
                String str2;
                int i4;
                Composer composer2;
                ComposerKt.sourceInformation(composer, "C152@7074L22:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if ((i3 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                final RowData rowData = (RowData) value.get(i);
                composer.startReplaceGroup(-993950169);
                ComposerKt.sourceInformation(composer, "C*53@1939L1357:MultiLevel.kt#snoj4b");
                Modifier modifierAnimateItem$default = LazyItemScope.animateItem$default(lazyItemScope, Modifier.INSTANCE, null, null, null, 7, null);
                final Function1 function12 = onLeafClick;
                final MultiLevelTreeModel multiLevelTreeModel = model;
                Modifier modifierM1023clickableXHw0xAI$default = ClickableKt.m1023clickableXHw0xAI$default(modifierAnimateItem$default, false, null, null, new Function0<Unit>() { // from class: com.smartengines.tree.ui.MultiLevelKt$MultiLevelTreeView$1$2$1
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (rowData.getNode().isLeaf()) {
                            Function1<T, Unit> function13 = function12;
                            TreeNode node = rowData.getNode();
                            Intrinsics.checkNotNull(node, "null cannot be cast to non-null type T of com.smartengines.tree.ui.MultiLevelKt.MultiLevelTreeView$lambda$6$lambda$5");
                            function13.invoke(node);
                            return;
                        }
                        multiLevelTreeModel.onBranchRowClick$tree_release(rowData);
                    }
                }, 7, null);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1023clickableXHw0xAI$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composer);
                Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -2112840466, "C68@2475L61,85@3185L97:MultiLevel.kt#snoj4b");
                SpacerKt.Spacer(SizeKt.m1485width3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(rowData.getLevel() * options.getLevelPadding())), composer, 0);
                Integer expandIconWidth = options.getExpandIconWidth();
                composer.startReplaceGroup(1178774228);
                ComposerKt.sourceInformation(composer, "*72@2647L474");
                if (expandIconWidth == null) {
                    str = "C73@3429L9:Box.kt#2w3rfo";
                    str2 = "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo";
                    i4 = 733328855;
                    composer2 = composer;
                } else {
                    Modifier modifierM1485width3ABfNKs = SizeKt.m1485width3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(expandIconWidth.intValue()));
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM1485width3ABfNKs);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4088constructorimpl2 = Updater.m4088constructorimpl(composer);
                    Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer, 581401229, "C:MultiLevel.kt#snoj4b");
                    composer.startReplaceGroup(-258339786);
                    ComposerKt.sourceInformation(composer, "75@2827L212,74@2789L284");
                    if (rowData.getNode().isLeaf()) {
                        str = "C73@3429L9:Box.kt#2w3rfo";
                        str2 = "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo";
                        i4 = 733328855;
                    } else {
                        str = "C73@3429L9:Box.kt#2w3rfo";
                        str2 = "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo";
                        i4 = 733328855;
                        IconKt.m2584Iconww6aTOc(PainterResources_androidKt.painterResource(rowData.getExpanded() ? C3297R.drawable.ic_tree_node_expanded : C3297R.drawable.ic_tree_node_collapsed, composer, 0), "", (Modifier) null, 0L, composer, 56, 12);
                    }
                    composer2 = composer;
                    composer2.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                }
                composer2.endReplaceGroup();
                Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                ComposerKt.sourceInformationMarkerStart(composer2, i4, str2);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM4088constructorimpl3 = Updater.m4088constructorimpl(composer2);
                Updater.m4095setimpl(composerM4088constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4095setimpl(composerM4088constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4088constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM4088constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM4088constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m4095setimpl(composerM4088constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, str);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -1576115307, "C86@3243L21:MultiLevel.kt#snoj4b");
                Function3 function3 = nodeContent;
                TreeNode node = rowData.getNode();
                Intrinsics.checkNotNull(node, "null cannot be cast to non-null type T of com.smartengines.tree.ui.MultiLevelKt.MultiLevelTreeView$lambda$6$lambda$5$lambda$4$lambda$3");
                function3.invoke(node, composer2, 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object MultiLevelTreeView$lambda$6$lambda$0(RowData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.hashCode());
    }

    private static final void PreviewRows(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1071899687);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PreviewRows)111@3878L376:MultiLevel.kt#snoj4b");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            MaterialThemeKt.MaterialTheme(ColorSchemeKt.m2366darkColorSchemeCXl9yA$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15, null), null, null, ComposableSingletons$MultiLevelKt.INSTANCE.m7816getLambda2$tree_release(), composerStartRestartGroup, 3072, 6);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.tree.ui.MultiLevelKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MultiLevelKt.PreviewRows$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
