package com.smartengines.app.p004ui;

import android.content.Context;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.adaptive.AndroidWindowAdaptiveInfo_androidKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
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
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.window.core.layout.WindowHeightSizeClass;
import androidx.window.core.layout.WindowSizeClass;
import androidx.window.core.layout.WindowWidthSizeClass;
import com.smartengines.app.C3069R;
import com.smartengines.app.Model;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.targets.HomeScreenTargetsKt;
import com.smartengines.app.targets.TreeItem;
import com.smartengines.engine.EngineId;
import com.smartengines.engine.EngineLoadingState;
import com.smartengines.tree.p009ui.OneLevelKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: HomeScreenContent.kt */
@Metadata(m513d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001b\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a-\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0016\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0019\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u0011X\u008a\u0084\u0002"}, m514d2 = {"TAG", "", "HomeScreenContent", "", "homeScreenTargets", "", "Lcom/smartengines/app/targets/TreeItem;", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "Title", TextBundle.TEXT_ENTRY, "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "EngineButton", "scope", "Landroidx/compose/foundation/layout/RowScope;", "engineId", "Lcom/smartengines/engine/EngineId;", "state", "Lcom/smartengines/engine/EngineLoadingState;", "(Landroidx/compose/foundation/layout/RowScope;Lcom/smartengines/engine/EngineId;Ljava/lang/String;Lcom/smartengines/engine/EngineLoadingState;Landroidx/compose/runtime/Composer;I)V", "HomeScreen_Preview", "(Landroidx/compose/runtime/Composer;I)V", "HomeScreen_PreviewWide", "Preview", "app_storeRelease", "codeLoadingState", "docLoadingState", "idLoadingState"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class HomeScreenContentKt {
    private static final String TAG = "myapp.HomeScreenContent";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EngineButton$lambda$10(RowScope scope, EngineId engineId, String text, EngineLoadingState state, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(scope, "$scope");
        Intrinsics.checkNotNullParameter(engineId, "$engineId");
        Intrinsics.checkNotNullParameter(text, "$text");
        Intrinsics.checkNotNullParameter(state, "$state");
        EngineButton(scope, engineId, text, state, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreenContent$lambda$7(List homeScreenTargets, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(homeScreenTargets, "$homeScreenTargets");
        HomeScreenContent(homeScreenTargets, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen_Preview$lambda$11(int i, Composer composer, int i2) {
        HomeScreen_Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen_PreviewWide$lambda$12(int i, Composer composer, int i2) {
        HomeScreen_PreviewWide(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$13(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Title$lambda$8(String text, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(text, "$text");
        Title(text, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void HomeScreenContent(final List<? extends TreeItem> homeScreenTargets, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(homeScreenTargets, "homeScreenTargets");
        Composer composerStartRestartGroup = composer.startRestartGroup(1340883068);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(HomeScreenContent)58@2504L7,59@2579L16,60@2662L16,61@2744L16,64@2909L27,67@3172L53,70@3245L1514:HomeScreenContent.kt#83idza");
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        Context context = (Context) objConsume;
        State stateCollectAsState = SnapshotStateKt.collectAsState(Model.INSTANCE.getEngines().getCode().getLoader().getLoadingState(), null, composerStartRestartGroup, 8, 1);
        State stateCollectAsState2 = SnapshotStateKt.collectAsState(Model.INSTANCE.getEngines().getDoc().getLoader().getLoadingState(), null, composerStartRestartGroup, 8, 1);
        State stateCollectAsState3 = SnapshotStateKt.collectAsState(Model.INSTANCE.getEngines().getId().getLoader().getLoadingState(), null, composerStartRestartGroup, 8, 1);
        WindowSizeClass windowSizeClass = AndroidWindowAdaptiveInfo_androidKt.currentWindowAdaptiveInfo(composerStartRestartGroup, 0).getWindowSizeClass();
        boolean zAreEqual = Intrinsics.areEqual(windowSizeClass.getWindowHeightSizeClass(), WindowHeightSizeClass.COMPACT);
        int i2 = Intrinsics.areEqual(windowSizeClass.getWindowWidthSizeClass(), WindowWidthSizeClass.COMPACT) ? 3 : 4;
        composerStartRestartGroup.startReplaceGroup(771766959);
        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):HomeScreenContent.kt#9igjgp");
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = C1959Dp.m7053boximpl(HomeCardKt.measureCardSize(i2));
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final float fM7069unboximpl = ((C1959Dp) objRememberedValue).m7069unboximpl();
        composerStartRestartGroup.endReplaceGroup();
        composerStartRestartGroup.startReplaceGroup(771770300);
        ComposerKt.sourceInformation(composerStartRestartGroup, "");
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceGroup(771770728);
        ComposerKt.sourceInformation(composerStartRestartGroup, "71@3329L21");
        if (zAreEqual) {
            modifierFillMaxSize$default = ScrollKt.verticalScroll$default(modifierFillMaxSize$default, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
        }
        composerStartRestartGroup.endReplaceGroup();
        composerStartRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -905168718, "C74@3385L27,76@3422L46,81@3620L199,77@3477L342,90@3829L27,92@3866L47,93@3922L792,115@4724L29:HomeScreenContent.kt#83idza");
        SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
        String string = context.getString(C3069R.string.home_quick);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Title(string, composerStartRestartGroup, 0);
        OneLevelKt.OneLevelIcons(i2, homeScreenTargets, new HomeScreenContentKt$HomeScreenContent$2$1(Model.INSTANCE), ComposableLambdaKt.rememberComposableLambda(1651649873, true, new Function3<TreeItem, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.HomeScreenContentKt$HomeScreenContent$2$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(TreeItem treeItem, Composer composer2, Integer num) {
                invoke(treeItem, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(TreeItem it, Composer composer2, int i3) {
                Intrinsics.checkNotNullParameter(it, "it");
                ComposerKt.sourceInformation(composer2, "C83@3677L132:HomeScreenContent.kt#83idza");
                if ((i3 & 14) == 0) {
                    i3 |= composer2.changed(it) ? 4 : 2;
                }
                if ((i3 & 91) != 18 || !composer2.getSkipping()) {
                    HomeCardKt.m7550HomeCard942rkJo(it.getName().toString(), it.getIcon(), fM7069unboximpl, null, composer2, 384, 8);
                } else {
                    composer2.skipToGroupEnd();
                }
            }
        }, composerStartRestartGroup, 54), composerStartRestartGroup, 3136);
        SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
        String string2 = context.getString(C3069R.string.home_engines);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Title(string2, composerStartRestartGroup, 0);
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2004445017, "C94@4014L36,95@4063L159,100@4235L36,101@4284L154,106@4451L36,107@4500L155,112@4668L36:HomeScreenContent.kt#83idza");
        SpacerKt.Spacer(SizeKt.m1485width3ABfNKs(Modifier.INSTANCE, HomeCardKt.getMENU_PADDING()), composerStartRestartGroup, 6);
        EngineId engineId = EngineId.CODE;
        String string3 = context.getString(C3069R.string.code_engine_name);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        EngineButton(rowScopeInstance, engineId, string3, HomeScreenContent$lambda$0(stateCollectAsState), composerStartRestartGroup, 4150);
        SpacerKt.Spacer(SizeKt.m1485width3ABfNKs(Modifier.INSTANCE, HomeCardKt.getMENU_PADDING()), composerStartRestartGroup, 6);
        EngineId engineId2 = EngineId.f368ID;
        String string4 = context.getString(C3069R.string.id_engine_button);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        EngineButton(rowScopeInstance, engineId2, string4, HomeScreenContent$lambda$2(stateCollectAsState3), composerStartRestartGroup, 4150);
        SpacerKt.Spacer(SizeKt.m1485width3ABfNKs(Modifier.INSTANCE, HomeCardKt.getMENU_PADDING()), composerStartRestartGroup, 6);
        EngineId engineId3 = EngineId.DOC;
        String string5 = context.getString(C3069R.string.doc_engine_name);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        EngineButton(rowScopeInstance, engineId3, string5, HomeScreenContent$lambda$1(stateCollectAsState2), composerStartRestartGroup, 4150);
        SpacerKt.Spacer(SizeKt.m1485width3ABfNKs(Modifier.INSTANCE, HomeCardKt.getMENU_PADDING()), composerStartRestartGroup, 6);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 0.2f, false, 2, null), composerStartRestartGroup, 0);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.HomeScreenContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreenContentKt.HomeScreenContent$lambda$7(homeScreenTargets, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Title(final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(780227123);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Title)125@4946L10,121@4811L239:HomeScreenContent.kt#83idza");
        if ((i & 14) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            composer2 = composerStartRestartGroup;
            TextKt.m3128Text4IGK_g(str, PaddingKt.m1439paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C1959Dp.m7055constructorimpl(10), 7, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6937boximpl(TextAlign.INSTANCE.m6944getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleMedium(), composer2, (i2 & 14) | 196656, 0, 64988);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.HomeScreenContentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreenContentKt.Title$lambda$8(str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EngineButton(final RowScope rowScope, final EngineId engineId, final String str, final EngineLoadingState engineLoadingState, Composer composer, final int i) {
        long jM2345getPrimary0d7_KjU;
        Composer composerStartRestartGroup = composer.startRestartGroup(963669331);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(EngineButton)P(1!1,3)*140@5441L959,136@5195L1205:HomeScreenContent.kt#83idza");
        Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
        if (engineLoadingState instanceof EngineLoadingState.Error) {
            composerStartRestartGroup.startReplaceGroup(645001071);
            ComposerKt.sourceInformation(composerStartRestartGroup, "137@5296L11");
            jM2345getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getTertiary();
            composerStartRestartGroup.endReplaceGroup();
        } else {
            composerStartRestartGroup.startReplaceGroup(645002990);
            ComposerKt.sourceInformation(composerStartRestartGroup, "138@5356L11");
            jM2345getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getPrimary();
            composerStartRestartGroup.endReplaceGroup();
        }
        SurfaceKt.m2978SurfaceT9BRK9s(modifierWeight$default, RoundedCornerShapeKt.m1718RoundedCornerShape0680j_4(HomeCardKt.getCORNER_RADIUS()), jM2345getPrimary0d7_KjU, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-915721495, true, new HomeScreenContentKt$EngineButton$1$1(engineLoadingState, engineId, str), composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, MenuKt.InTransitionDuration);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.HomeScreenContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreenContentKt.EngineButton$lambda$10(rowScope, engineId, str, engineLoadingState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void HomeScreen_Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1263352540);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(HomeScreen_Preview)185@6868L7,186@6880L16,187@6937L97,187@6901L133:HomeScreenContent.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Context context = (Context) objConsume;
            ScreenDataKt.ReadScreenData(composerStartRestartGroup, 0);
            ThemeKt.SmartEnginesTheme(true, ComposableLambdaKt.rememberComposableLambda(849990599, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.HomeScreenContentKt.HomeScreen_Preview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposerKt.sourceInformation(composer2, "C188@6955L73,188@6947L81:HomeScreenContent.kt#83idza");
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        final Context context2 = context;
                        SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1861001314, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.HomeScreenContentKt.HomeScreen_Preview.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                ComposerKt.sourceInformation(composer3, "C189@6969L49:HomeScreenContent.kt#83idza");
                                if ((i3 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    HomeScreenContentKt.HomeScreenContent(HomeScreenTargetsKt.loadHomeScreenTargets(context2), composer3, 8);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.HomeScreenContentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreenContentKt.HomeScreen_Preview$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void HomeScreen_PreviewWide(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-541718961);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(HomeScreen_PreviewWide)196@7202L7,197@7214L16,198@7271L97,198@7235L133:HomeScreenContent.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Context context = (Context) objConsume;
            ScreenDataKt.ReadScreenData(composerStartRestartGroup, 0);
            ThemeKt.SmartEnginesTheme(true, ComposableLambdaKt.rememberComposableLambda(603337146, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.HomeScreenContentKt.HomeScreen_PreviewWide.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposerKt.sourceInformation(composer2, "C199@7289L73,199@7281L81:HomeScreenContent.kt#83idza");
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        final Context context2 = context;
                        SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1300547371, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.HomeScreenContentKt.HomeScreen_PreviewWide.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                ComposerKt.sourceInformation(composer3, "C200@7303L49:HomeScreenContent.kt#83idza");
                                if ((i3 & 11) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                } else {
                                    HomeScreenContentKt.HomeScreenContent(HomeScreenTargetsKt.loadHomeScreenTargets(context2), composer3, 8);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.HomeScreenContentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreenContentKt.HomeScreen_PreviewWide$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-518199436);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview)208@7466L675:HomeScreenContent.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$HomeScreenContentKt.INSTANCE.m7467getLambda2$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.HomeScreenContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreenContentKt.Preview$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final EngineLoadingState HomeScreenContent$lambda$0(State<? extends EngineLoadingState> state) {
        return state.getValue();
    }

    private static final EngineLoadingState HomeScreenContent$lambda$1(State<? extends EngineLoadingState> state) {
        return state.getValue();
    }

    private static final EngineLoadingState HomeScreenContent$lambda$2(State<? extends EngineLoadingState> state) {
        return state.getValue();
    }
}
