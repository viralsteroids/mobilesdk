package com.smartengines.app.p004ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.ColorFilter;
import androidx.compose.p000ui.graphics.painter.Painter;
import androidx.compose.p000ui.layout.ContentScale;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.PainterResources_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.smartengines.app.C3069R;
import com.smartengines.app.Model;
import com.smartengines.app.p004ui.TargetsScreenKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.targets.DocSection;
import com.smartengines.app.targets.DocSectionType;
import com.smartengines.app.targets.TreeGroup;
import com.smartengines.app.targets.TreeItem;
import com.smartengines.app.targets.TreeLeaf;
import com.smartengines.dictionaries.C3289R;
import com.smartengines.engine.EngineId;
import com.smartengines.engine.MockTarget;
import com.smartengines.engine.RecognitionTarget;
import com.smartengines.targets.doc.DocTarget;
import com.smartengines.targets.text.TextTarget;
import com.smartengines.tree.p009ui.MultiLevelKt;
import com.smartengines.tree.p009ui.MultiLevelTreeModel;
import com.smartengines.tree.p009ui.TreeViewOptions;
import com.smartengines.utils.Name;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jmrtd.lds.LDSFile;

/* compiled from: TargetsScreen.kt */
@Metadata(m513d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0002\u001a/\u0010\n\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u0010\u000e\u001a#\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0003¢\u0006\u0002\u0010\u0015\u001a#\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0018\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u008e\u0002"}, m514d2 = {"TargetsScreen", "", "viewModel", "Lcom/smartengines/app/ui/TargetsViewModel;", "(Lcom/smartengines/app/ui/TargetsViewModel;Landroidx/compose/runtime/Composer;I)V", "groupDocItemsBySections", "", "Lcom/smartengines/app/targets/DocSection;", "items", "Lcom/smartengines/app/targets/TreeItem;", "DocSectionsView", "sections", "onLeafClick", "Lkotlin/Function1;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ICON_SIZE", "", "ItemView", "node", "onClick", "Lkotlin/Function0;", "(Lcom/smartengines/app/targets/TreeItem;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AutoSelectItemView", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "app_storeRelease", "showInfoDialog", ""}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class TargetsScreenKt {
    private static final int ICON_SIZE = 28;

    /* compiled from: TargetsScreen.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocSectionType.values().length];
            try {
                iArr[DocSectionType.AUTO_SELECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AutoSelectItemView$lambda$30(TreeItem node, Function0 onClick, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(node, "$node");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        AutoSelectItemView(node, onClick, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DocSectionsView$lambda$12(List sections, Function1 onLeafClick, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(sections, "$sections");
        Intrinsics.checkNotNullParameter(onLeafClick, "$onLeafClick");
        DocSectionsView(sections, onLeafClick, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ItemView$lambda$17(TreeItem node, Function0 onClick, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(node, "$node");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        ItemView(node, onClick, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$31(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TargetsScreen$lambda$2(TargetsViewModel viewModel, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(viewModel, "$viewModel");
        TargetsScreen(viewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void TargetsScreen(final TargetsViewModel viewModel, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-271734152);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TargetsScreen)61@2435L170,65@2625L83,70@2836L2007,70@2828L2015:TargetsScreen.kt#83idza");
        Name title = viewModel.getTitle();
        composerStartRestartGroup.startReplaceGroup(-1351265980);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):TargetsScreen.kt#9igjgp");
        boolean zChanged = composerStartRestartGroup.changed(title);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = Boolean.valueOf(StringsKt.contains((CharSequence) viewModel.getTitle().toString(), (CharSequence) "Doc", true) || Model.INSTANCE.predictSelectedEngineId() == EngineId.DOC);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        boolean zBooleanValue = ((Boolean) objRememberedValue).booleanValue();
        composerStartRestartGroup.endReplaceGroup();
        List<TreeItem> children = viewModel.getTreeGroup().getChildren();
        composerStartRestartGroup.startReplaceGroup(-1351259987);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):TargetsScreen.kt#9igjgp");
        boolean zChanged2 = composerStartRestartGroup.changed(children);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = viewModel.getTreeGroup().getChildren();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceGroup();
        BodyBoxKt.BodyBox(ComposableLambdaKt.rememberComposableLambda(-1310455457, true, new C31661(viewModel, zBooleanValue, (List) objRememberedValue2), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.TargetsScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TargetsScreenKt.TargetsScreen$lambda$2(viewModel, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: TargetsScreen.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    /* renamed from: com.smartengines.app.ui.TargetsScreenKt$TargetsScreen$1 */
    static final class C31661 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ List<TreeItem> $allItems;
        final /* synthetic */ boolean $isDocEngine;
        final /* synthetic */ TargetsViewModel $viewModel;

        /* JADX WARN: Multi-variable type inference failed */
        C31661(TargetsViewModel targetsViewModel, boolean z, List<? extends TreeItem> list) {
            this.$viewModel = targetsViewModel;
            this.$isDocEngine = z;
            this.$allItems = list;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BodyBox, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BodyBox, "$this$BodyBox");
            ComposerKt.sourceInformation(composer, "C71@2846L1991:TargetsScreen.kt#83idza");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                TargetsViewModel targetsViewModel = this.$viewModel;
                boolean z = this.$isDocEngine;
                ArrayList arrayList = this.$allItems;
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierFillMaxSize$default);
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
                Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, 1357701936, "C73@2912L237,82@3183L1644:TargetsScreen.kt#83idza");
                FragmentsKt.AppTitle(targetsViewModel.getTitle().toString(), new TargetsScreenKt$TargetsScreen$1$1$1(Model.INSTANCE), false, false, true, false, composer, 28032, 32);
                Modifier modifierWeight$default = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierWeight$default);
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
                Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -781589721, "C:TargetsScreen.kt#83idza");
                composer.startReplaceGroup(-302308461);
                ComposerKt.sourceInformation(composer, "89@3416L154");
                if (targetsViewModel.getShowFilter()) {
                    TargetsFilterFieldKt.TargetsFilterField(targetsViewModel.getFilter(), new TargetsScreenKt$TargetsScreen$1$1$2$1(targetsViewModel), composer, 0);
                }
                composer.endReplaceGroup();
                if (z) {
                    composer.startReplaceGroup(-781322316);
                    ComposerKt.sourceInformation(composer, "105@4025L110,109@4157L150");
                    if (targetsViewModel.getFilter().length() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : arrayList) {
                            if (StringsKt.contains((CharSequence) ((TreeItem) obj).getName().toString(), (CharSequence) targetsViewModel.getFilter(), true)) {
                                arrayList2.add(obj);
                            }
                        }
                        arrayList = arrayList2;
                    }
                    composer.startReplaceGroup(-302287547);
                    ComposerKt.sourceInformation(composer, "CC(remember):TargetsScreen.kt#9igjgp");
                    boolean zChanged = composer.changed(arrayList);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = TargetsScreenKt.groupDocItemsBySections(arrayList);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    TargetsScreenKt.DocSectionsView((List) objRememberedValue, new Function1() { // from class: com.smartengines.app.ui.TargetsScreenKt$TargetsScreen$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return TargetsScreenKt.C31661.invoke$lambda$5$lambda$4$lambda$2((TreeItem) obj2);
                        }
                    }, composer, 56);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-780664279);
                    ComposerKt.sourceInformation(composer, "114@4353L442");
                    MultiLevelKt.MultiLevelTreeView(targetsViewModel.getMultiLevelTreeModel(), new Function1() { // from class: com.smartengines.app.ui.TargetsScreenKt$TargetsScreen$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return TargetsScreenKt.C31661.invoke$lambda$5$lambda$4$lambda$3((TreeItem) obj2);
                        }
                    }, new TreeViewOptions(0, null, 0, 5, null), ComposableSingletons$TargetsScreenKt.INSTANCE.m7518getLambda1$app_storeRelease(), composer, MultiLevelTreeModel.$stable | 3120 | (TreeViewOptions.$stable << 6));
                    composer.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$2(TreeItem it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Model.INSTANCE.onNodeClick(it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3(TreeItem it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Model.INSTANCE.onNodeClick(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<DocSection> groupDocItemsBySections(List<? extends TreeItem> list) {
        char c;
        char c2;
        boolean z;
        List<? extends TreeItem> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            TreeItem treeItem = (TreeItem) obj;
            if ((treeItem instanceof TreeLeaf) && (((TreeLeaf) treeItem).getTarget() instanceof TextTarget)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (true) {
            c = 2;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            TreeItem treeItem2 = (TreeItem) next;
            TreeLeaf treeLeaf = treeItem2 instanceof TreeLeaf ? (TreeLeaf) treeItem2 : null;
            if (((treeLeaf != null ? treeLeaf.getTarget() : null) instanceof DocTarget) && treeLeaf.getShowInfoButton()) {
                List listListOf = CollectionsKt.listOf((Object[]) new String[]{"primary_accounting", "hiring", "legal_entity_pack"});
                RecognitionTarget target = treeLeaf.getTarget();
                Intrinsics.checkNotNull(target, "null cannot be cast to non-null type com.smartengines.targets.doc.DocTarget");
                if (listListOf.contains(((DocTarget) target).getMode())) {
                    arrayList3.add(next);
                }
            }
        }
        ArrayList arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : list2) {
            TreeItem treeItem3 = (TreeItem) obj2;
            TreeLeaf treeLeaf2 = treeItem3 instanceof TreeLeaf ? (TreeLeaf) treeItem3 : null;
            if (treeLeaf2 == null) {
                c2 = c;
            } else {
                RecognitionTarget target2 = treeLeaf2.getTarget();
                boolean z2 = target2 instanceof TextTarget;
                c2 = c;
                if ((target2 instanceof DocTarget) && treeLeaf2.getShowInfoButton()) {
                    String[] strArr = new String[3];
                    strArr[0] = "primary_accounting";
                    strArr[1] = "hiring";
                    strArr[c2] = "legal_entity_pack";
                    if (CollectionsKt.listOf((Object[]) strArr).contains(((DocTarget) target2).getMode())) {
                        z = true;
                    }
                    if (!z2) {
                    }
                } else {
                    z = false;
                    if (!z2 || z) {
                    }
                }
                c = c2;
            }
            arrayList5.add(obj2);
            c = c2;
        }
        ArrayList arrayList6 = arrayList5;
        ArrayList arrayList7 = new ArrayList();
        if (!arrayList2.isEmpty()) {
            arrayList7.add(new DocSection(DocSectionType.TEXT_ENGINE, null, arrayList2, 2, null));
        }
        if (!arrayList4.isEmpty()) {
            arrayList7.add(new DocSection(DocSectionType.AUTO_SELECT, new Name("Autoselect", "Автовыбор"), arrayList4));
        }
        if (!arrayList6.isEmpty()) {
            arrayList7.add(new DocSection(DocSectionType.POPULAR_DOCUMENTS, new Name("Popular Documents", "Популярные документы"), arrayList6));
        }
        return arrayList7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DocSectionsView(final List<DocSection> list, final Function1<? super TreeItem, Unit> function1, Composer composer, final int i) {
        int i2;
        String str;
        DocSection docSection;
        Composer composerStartRestartGroup = composer.startRestartGroup(-723419060);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DocSectionsView)P(1)190@6718L21,189@6667L1528:TargetsScreen.kt#83idza");
        int i3 = 1;
        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1866527445, "C:TargetsScreen.kt#83idza");
        composerStartRestartGroup.startReplaceGroup(-632525819);
        String str2 = "";
        ComposerKt.sourceInformation(composerStartRestartGroup, "");
        for (DocSection docSection2 : list) {
            Name name = docSection2.getName();
            composerStartRestartGroup.startReplaceGroup(-632525285);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*196@6935L10,194@6843L409");
            if (name == null) {
                i2 = i3;
                str = str2;
                docSection = docSection2;
            } else {
                String string = name.toString();
                TextStyle titleMedium = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleMedium();
                float f = 16;
                Composer composer2 = composerStartRestartGroup;
                i2 = i3;
                str = str2;
                docSection = docSection2;
                TextKt.m3128Text4IGK_g(string, PaddingKt.m1438paddingqDBjuR0(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(f), C1959Dp.m7055constructorimpl(f), C1959Dp.m7055constructorimpl(f), C1959Dp.m7055constructorimpl(8)), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, titleMedium, composer2, ProfileVerifier.CompilationStatus.f285xf2722a21, 0, 65500);
                composerStartRestartGroup = composer2;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-632509580);
            ComposerKt.sourceInformation(composerStartRestartGroup, str);
            for (final TreeItem treeItem : docSection.getItems()) {
                if (WhenMappings.$EnumSwitchMapping$0[docSection.getType().ordinal()] == i2) {
                    composerStartRestartGroup.startReplaceGroup(-1431941940);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "210@7426L146");
                    AutoSelectItemView(treeItem, new Function0() { // from class: com.smartengines.app.ui.TargetsScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TargetsScreenKt.DocSectionsView$lambda$11$lambda$10$lambda$9$lambda$7(function1, treeItem);
                        }
                    }, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1431721034);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "216@7649L136");
                    ItemView(treeItem, new Function0() { // from class: com.smartengines.app.ui.TargetsScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TargetsScreenKt.DocSectionsView$lambda$11$lambda$10$lambda$9$lambda$8(function1, treeItem);
                        }
                    }, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.startReplaceGroup(-632492575);
                ComposerKt.sourceInformation(composerStartRestartGroup, "224@7926L102");
                if (!Intrinsics.areEqual(treeItem, CollectionsKt.last((List) docSection.getItems()))) {
                    DividerKt.m2506Divider9IZ8Weo(PaddingKt.m1437paddingVpY3zN4$default(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(16), 0.0f, 2, null), 0.0f, 0L, composerStartRestartGroup, 6, 6);
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-632485281);
            ComposerKt.sourceInformation(composerStartRestartGroup, "231@8124L41");
            if (!Intrinsics.areEqual(docSection, CollectionsKt.last((List) list))) {
                SpacerKt.Spacer(SizeKt.m1466height3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(16)), composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            i3 = i2;
            str2 = str;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.TargetsScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TargetsScreenKt.DocSectionsView$lambda$12(list, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DocSectionsView$lambda$11$lambda$10$lambda$9$lambda$7(Function1 onLeafClick, TreeItem item) {
        Intrinsics.checkNotNullParameter(onLeafClick, "$onLeafClick");
        Intrinsics.checkNotNullParameter(item, "$item");
        onLeafClick.invoke(item);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DocSectionsView$lambda$11$lambda$10$lambda$9$lambda$8(Function1 onLeafClick, TreeItem item) {
        Intrinsics.checkNotNullParameter(onLeafClick, "$onLeafClick");
        Intrinsics.checkNotNullParameter(item, "$item");
        onLeafClick.invoke(item);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ItemView(final TreeItem treeItem, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        String str;
        int i3;
        Composer composer2;
        String descr;
        Composer composerStartRestartGroup = composer.startRestartGroup(850160899);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ItemView)244@8319L991:TargetsScreen.kt#83idza");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(treeItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & LDSFile.EF_DG16_TAG) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            Unit unit = null;
            Modifier modifierM1023clickableXHw0xAI$default = ClickableKt.m1023clickableXHw0xAI$default(PaddingKt.m1437paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1959Dp.m7055constructorimpl(5), 1, null), false, null, null, function0, 7, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1023clickableXHw0xAI$default);
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
            Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1823838185, "C251@8521L28,260@8825L29,263@8888L416:TargetsScreen.kt#83idza");
            SpacerKt.Spacer(SizeKt.m1485width3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(8)), composerStartRestartGroup, 6);
            Integer icon = treeItem.getIcon();
            composerStartRestartGroup.startReplaceGroup(335929610);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*256@8692L19,254@8603L163");
            if (icon != null) {
                int iIntValue = icon.intValue();
                Modifier modifierM1480size3ABfNKs = SizeKt.m1480size3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(28));
                Painter painterPainterResource = PainterResources_androidKt.painterResource(iIntValue, composerStartRestartGroup, 0);
                str = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                i3 = 28;
                ImageKt.Image(painterPainterResource, "", modifierM1480size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, MenuKt.InTransitionDuration);
                composerStartRestartGroup = composerStartRestartGroup;
                unit = Unit.INSTANCE;
            } else {
                i3 = 28;
                str = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(335929309);
            ComposerKt.sourceInformation(composerStartRestartGroup, "259@8780L36");
            if (unit == null) {
                SpacerKt.Spacer(SizeKt.m1485width3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(i3)), composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m1485width3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(15)), composerStartRestartGroup, 6);
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, str);
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
            Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 444215169, "C265@8950L64:TargetsScreen.kt#83idza");
            Composer composer3 = composerStartRestartGroup;
            TextKt.m3128Text4IGK_g(treeItem.getName().toString(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
            composer3.startReplaceGroup(568522105);
            ComposerKt.sourceInformation(composer3, "*274@9220L10,272@9133L129");
            if (!(treeItem instanceof TreeLeaf) || (descr = ((TreeLeaf) treeItem).getDescr()) == null) {
                composer2 = composer3;
            } else {
                TextStyle bodySmall = MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall();
                composer2 = composer3;
                TextKt.m3128Text4IGK_g(descr, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, bodySmall, composer2, 0, 0, 65534);
            }
            composer2.endReplaceGroup();
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
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.TargetsScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TargetsScreenKt.ItemView$lambda$17(treeItem, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void AutoSelectItemView(final TreeItem treeItem, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        String str;
        String str2;
        int i3;
        String str3;
        final MutableState mutableState;
        Unit unit;
        String str4;
        Composer composer2;
        String descr;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1830994542);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AutoSelectItemView)287@9432L34,289@9472L1696,347@11272L26,384@12777L131,348@11320L169,354@11510L1237,346@11228L1690:TargetsScreen.kt#83idza");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(treeItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & LDSFile.EF_DG16_TAG) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startReplaceGroup(-679584967);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):TargetsScreen.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM1437paddingVpY3zN4$default = PaddingKt.m1437paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1959Dp.m7055constructorimpl(5), 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1437paddingVpY3zN4$default);
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
            Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -820191117, "C295@9632L1077:TargetsScreen.kt#83idza");
            Modifier modifierM1023clickableXHw0xAI$default = ClickableKt.m1023clickableXHw0xAI$default(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), false, null, null, function0, 7, null);
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1023clickableXHw0xAI$default);
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
            Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1546447355, "C301@9816L28,310@10156L29,313@10227L472:TargetsScreen.kt#83idza");
            float f = 8;
            SpacerKt.Spacer(SizeKt.m1485width3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(f)), composerStartRestartGroup, 6);
            Integer icon = treeItem.getIcon();
            composerStartRestartGroup.startReplaceGroup(1712455020);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*306@10007L19,304@9910L179");
            if (icon != null) {
                int iIntValue = icon.intValue();
                Modifier modifierM1480size3ABfNKs = SizeKt.m1480size3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(28));
                Painter painterPainterResource = PainterResources_androidKt.painterResource(iIntValue, composerStartRestartGroup, 0);
                str = "CC(remember):TargetsScreen.kt#9igjgp";
                str2 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                i3 = 0;
                str3 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                mutableState = mutableState2;
                ImageKt.Image(painterPainterResource, "", modifierM1480size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 440, MenuKt.InTransitionDuration);
                composerStartRestartGroup = composerStartRestartGroup;
                Unit unit2 = Unit.INSTANCE;
                unit = Unit.INSTANCE;
            } else {
                str = "CC(remember):TargetsScreen.kt#9igjgp";
                str2 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                str3 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                mutableState = mutableState2;
                i3 = 0;
                unit = null;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1712454719);
            ComposerKt.sourceInformation(composerStartRestartGroup, "309@10107L36");
            if (unit == null) {
                SpacerKt.Spacer(SizeKt.m1485width3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(28)), composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m1485width3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(15)), composerStartRestartGroup, 6);
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, i3);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, str2);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, i3);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, str3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4088constructorimpl3 = Updater.m4088constructorimpl(composerStartRestartGroup);
            Updater.m4095setimpl(composerM4088constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4095setimpl(composerM4088constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4088constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM4088constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM4088constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m4095setimpl(composerM4088constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 210058059, "C315@10297L72:TargetsScreen.kt#83idza");
            Composer composer3 = composerStartRestartGroup;
            TextKt.m3128Text4IGK_g(treeItem.getName().toString(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
            composerStartRestartGroup = composer3;
            composerStartRestartGroup.startReplaceGroup(1807895135);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*324@10599L10,322@10504L141");
            boolean z = treeItem instanceof TreeLeaf;
            if (z && (descr = ((TreeLeaf) treeItem).getDescr()) != null) {
                TextKt.m3128Text4IGK_g(descr, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodySmall(), composerStartRestartGroup, 0, 0, 65534);
                composerStartRestartGroup = composerStartRestartGroup;
                Unit unit3 = Unit.INSTANCE;
                Unit unit4 = Unit.INSTANCE;
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
            composerStartRestartGroup.startReplaceGroup(-2104634063);
            ComposerKt.sourceInformation(composerStartRestartGroup, "333@10816L25,332@10778L374");
            if (z && ((TreeLeaf) treeItem).getShowInfoButton()) {
                composerStartRestartGroup.startReplaceGroup(-2104631377);
                str4 = str;
                ComposerKt.sourceInformation(composerStartRestartGroup, str4);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.smartengines.app.ui.TargetsScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TargetsScreenKt.AutoSelectItemView$lambda$27$lambda$26$lambda$25(mutableState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                IconButtonKt.IconButton((Function0) objRememberedValue2, PaddingKt.m1439paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, C1959Dp.m7055constructorimpl(f), 0.0f, 11, null), false, null, null, ComposableSingletons$TargetsScreenKt.INSTANCE.m7519getLambda2$app_storeRelease(), composerStartRestartGroup, 196662, 28);
            } else {
                str4 = str;
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (AutoSelectItemView$lambda$19(mutableState) && z) {
                composerStartRestartGroup.startReplaceGroup(-679526095);
                ComposerKt.sourceInformation(composerStartRestartGroup, str4);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.smartengines.app.ui.TargetsScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TargetsScreenKt.AutoSelectItemView$lambda$29$lambda$28(mutableState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Composer composer4 = composerStartRestartGroup;
                AndroidAlertDialog_androidKt.m2195AlertDialogOix01E0((Function0) objRememberedValue3, ComposableLambdaKt.rememberComposableLambda(-52997765, true, new C31623(mutableState), composerStartRestartGroup, 54), null, null, null, ComposableLambdaKt.rememberComposableLambda(-1466190977, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.TargetsScreenKt.AutoSelectItemView.4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i4) {
                        ComposerKt.sourceInformation(composer5, "C351@11435L10,349@11338L137:TargetsScreen.kt#83idza");
                        if ((i4 & 11) != 2 || !composer5.getSkipping()) {
                            TextKt.m3128Text4IGK_g(((TreeLeaf) treeItem).getName().toString(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getTitleMedium(), composer5, 0, 0, 65534);
                        } else {
                            composer5.skipToGroupEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(327994368, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.TargetsScreenKt.AutoSelectItemView.5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i4) {
                        Composer composer6 = composer5;
                        ComposerKt.sourceInformation(composer6, "C359@11704L21,355@11528L1205:TargetsScreen.kt#83idza");
                        int i5 = 2;
                        if ((i4 & 11) != 2 || !composer6.getSkipping()) {
                            float f2 = 0.0f;
                            int i6 = 1;
                            Unit unit5 = null;
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.m1468heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1959Dp.m7055constructorimpl(400), 1, null), ScrollKt.rememberScrollState(0, composer6, 0, 1), false, null, false, 14, null);
                            TreeItem treeItem2 = treeItem;
                            ComposerKt.sourceInformationMarkerStart(composer6, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                            ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composer6.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer6, modifierVerticalScroll$default);
                            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer6, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer6.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer6.startReusableNode();
                            if (composer6.getInserting()) {
                                composer6.createNode(constructor4);
                            } else {
                                composer6.useNode();
                            }
                            Composer composerM4088constructorimpl4 = Updater.m4088constructorimpl(composer6);
                            Updater.m4095setimpl(composerM4088constructorimpl4, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4095setimpl(composerM4088constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM4088constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                composerM4088constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM4088constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            Updater.m4095setimpl(composerM4088constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer6, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer6, 1548384762, "C:TargetsScreen.kt#83idza");
                            List<String> doctypes = ((TreeLeaf) treeItem2).getDoctypes();
                            composer6.startReplaceGroup(1712516137);
                            ComposerKt.sourceInformation(composer6, "");
                            if (doctypes != null) {
                                if (doctypes.isEmpty()) {
                                    composer6.startReplaceGroup(212003153);
                                    ComposerKt.sourceInformation(composer6, "373@12407L10,371@12293L165");
                                    TextKt.m3128Text4IGK_g("sample text", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getBodyMedium(), composer5, 6, 0, 65534);
                                    composer6 = composer5;
                                    composer6.endReplaceGroup();
                                } else {
                                    composer6.startReplaceGroup(211600184);
                                    ComposerKt.sourceInformation(composer6, "*366@12064L10,364@11943L258");
                                    Iterator<T> it = doctypes.iterator();
                                    while (it.hasNext()) {
                                        TextKt.m3128Text4IGK_g("• " + ((String) it.next()), PaddingKt.m1437paddingVpY3zN4$default(Modifier.INSTANCE, f2, C1959Dp.m7055constructorimpl(i5), i6, unit5), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getBodyMedium(), composer5, 48, 0, 65532);
                                        composer6 = composer5;
                                        f2 = f2;
                                        i6 = i6;
                                        unit5 = unit5;
                                        i5 = i5;
                                    }
                                    composer6.endReplaceGroup();
                                }
                                unit5 = Unit.INSTANCE;
                            }
                            composer6.endReplaceGroup();
                            composer6.startReplaceGroup(1712515881);
                            ComposerKt.sourceInformation(composer6, "*379@12646L10,377@12540L153");
                            if (unit5 == null) {
                                TextKt.m3128Text4IGK_g("sample text", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getBodyMedium(), composer5, 6, 0, 65534);
                            }
                            composer5.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            composer5.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            ComposerKt.sourceInformationMarkerEnd(composer5);
                            return;
                        }
                        composer6.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer4, 1769526, 0, 16284);
                composer2 = composer4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.TargetsScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TargetsScreenKt.AutoSelectItemView$lambda$30(treeItem, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        composerStartRestartGroup.skipToGroupEnd();
        composer2 = composerStartRestartGroup;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final boolean AutoSelectItemView$lambda$19(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AutoSelectItemView$lambda$20(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AutoSelectItemView$lambda$27$lambda$26$lambda$25(MutableState showInfoDialog$delegate) {
        Intrinsics.checkNotNullParameter(showInfoDialog$delegate, "$showInfoDialog$delegate");
        AutoSelectItemView$lambda$20(showInfoDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AutoSelectItemView$lambda$29$lambda$28(MutableState showInfoDialog$delegate) {
        Intrinsics.checkNotNullParameter(showInfoDialog$delegate, "$showInfoDialog$delegate");
        AutoSelectItemView$lambda$20(showInfoDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* compiled from: TargetsScreen.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    /* renamed from: com.smartengines.app.ui.TargetsScreenKt$AutoSelectItemView$3 */
    static final class C31623 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ MutableState<Boolean> $showInfoDialog$delegate;

        C31623(MutableState<Boolean> mutableState) {
            this.$showInfoDialog$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(MutableState showInfoDialog$delegate) {
            Intrinsics.checkNotNullParameter(showInfoDialog$delegate, "$showInfoDialog$delegate");
            TargetsScreenKt.AutoSelectItemView$lambda$20(showInfoDialog$delegate, false);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C385@12816L26,385@12795L99:TargetsScreen.kt#83idza");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            composer.startReplaceGroup(-2104567376);
            ComposerKt.sourceInformation(composer, "CC(remember):TargetsScreen.kt#9igjgp");
            final MutableState<Boolean> mutableState = this.$showInfoDialog$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.smartengines.app.ui.TargetsScreenKt$AutoSelectItemView$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TargetsScreenKt.C31623.invoke$lambda$1$lambda$0(mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$TargetsScreenKt.INSTANCE.m7520getLambda3$app_storeRelease(), composer, 805306374, 510);
        }
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1736613708);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview)413@14032L16,414@14089L90,414@14053L126:TargetsScreen.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            final TreeGroup treeGroup = new TreeGroup(new Name("The page title"), null, CollectionsKt.listOf((Object[]) new TreeItem[]{new TreeGroup(new Name("Банкинг"), Integer.valueOf(C3069R.drawable.home_bank_card), null, 0, null, null, 60, null), new TreeGroup(new Name("Баркоды"), Integer.valueOf(C3069R.drawable.home_barcode), null, 0, null, null, 60, null), new TreeGroup(new Name("Счётчики"), Integer.valueOf(C3069R.drawable.home_meters), null, 0, null, null, 60, null), new TreeGroup(new Name("Телефоны"), Integer.valueOf(C3289R.drawable.code_phone_number), null, 0, null, null, 60, null), new TreeGroup(new Name("Номера авто"), Integer.valueOf(C3069R.drawable.home_license_plates), null, 0, null, null, 60, null), new TreeLeaf(new Name("MRZ"), Integer.valueOf(C3289R.drawable.code_mrz), "The MRZ description", 0, false, null, new MockTarget(), 56, null), new TreeLeaf(new Name("Without icon"), null, null, 0, false, null, new MockTarget(), 60, null)}), 0, null, null, 56, null);
            ScreenDataKt.ReadScreenData(composerStartRestartGroup, 0);
            ThemeKt.SmartEnginesTheme(true, ComposableLambdaKt.rememberComposableLambda(1424846633, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.TargetsScreenKt.Preview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposerKt.sourceInformation(composer2, "C415@14107L66,415@14099L74:TargetsScreen.kt#83idza");
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        final TreeGroup treeGroup2 = treeGroup;
                        SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1976803346, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.TargetsScreenKt.Preview.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                ComposerKt.sourceInformation(composer3, "C416@14121L42:TargetsScreen.kt#83idza");
                                if ((i3 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    TargetsScreenKt.TargetsScreen(new TargetsViewModel(treeGroup2), composer3, 8);
                                }
                            }
                        }, composer2, 54), composer2, 12582912, 127);
                    } else {
                        composer2.skipToGroupEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.TargetsScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TargetsScreenKt.Preview$lambda$31(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
