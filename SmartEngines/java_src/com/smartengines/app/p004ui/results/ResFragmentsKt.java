package com.smartengines.app.p004ui.results;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.painter.Painter;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.smartengines.app.AppKt;
import com.smartengines.app.AppViewModel;
import com.smartengines.app.C3069R;
import com.smartengines.app.FacesModel2;
import com.smartengines.app.Model;
import com.smartengines.app.mock.MockSelectorsKt;
import com.smartengines.app.p004ui.theme.ColorKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.settings.BuildFlavor;
import com.smartengines.app.settings.CommonSettings;
import com.smartengines.app.targets.TreeLeaf;
import com.smartengines.engine.p005id.CheckStatus;
import com.smartengines.utils.UtilsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* compiled from: ResFragments.kt */
@Metadata(m513d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u000f\u001a=\u0010\u0010\u001a\u00020\u00012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a\u0015\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u001b\u001a\u0015\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010 \u001a\r\u0010!\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010 \u001a\r\u0010\"\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010 \u001a\r\u0010#\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010 \u001a\r\u0010$\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010 ¨\u0006%"}, m514d2 = {"ResultTitle", "", "selectedTreeLeaf", "Lcom/smartengines/app/targets/TreeLeaf;", "photoToCompare", "Landroid/graphics/Bitmap;", "commonSettings", "Lcom/smartengines/app/settings/CommonSettings;", "(Lcom/smartengines/app/targets/TreeLeaf;Landroid/graphics/Bitmap;Lcom/smartengines/app/settings/CommonSettings;Landroidx/compose/runtime/Composer;II)V", "ResultBottomBar", "showNewPage", "", "(ZLandroidx/compose/runtime/Composer;II)V", "NoResult", "settings", "(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/app/settings/CommonSettings;Landroidx/compose/runtime/Composer;II)V", "ResultCard", "onClick", "Lkotlin/Function0;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ResultIcon", "isAccepted", "(ZLandroidx/compose/runtime/Composer;I)V", "checkStatus", "Lcom/smartengines/engine/id/CheckStatus;", "(Lcom/smartengines/engine/id/CheckStatus;Landroidx/compose/runtime/Composer;I)V", "Dark_TitlePreview", "(Landroidx/compose/runtime/Composer;I)V", "Dark_BottomBarPreview", "NoResult_Preview", "DarkCard_Preview", "LightCard_Preview", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ResFragmentsKt {

    /* compiled from: ResFragments.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CheckStatus.values().length];
            try {
                iArr[CheckStatus.PASSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckStatus.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DarkCard_Preview$lambda$22(int i, Composer composer, int i2) {
        DarkCard_Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dark_BottomBarPreview$lambda$20(int i, Composer composer, int i2) {
        Dark_BottomBarPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Dark_TitlePreview$lambda$19(int i, Composer composer, int i2) throws Exception {
        Dark_TitlePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LightCard_Preview$lambda$23(int i, Composer composer, int i2) {
        LightCard_Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoResult$lambda$12(TreeLeaf selectedTreeLeaf, CommonSettings commonSettings, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(selectedTreeLeaf, "$selectedTreeLeaf");
        NoResult(selectedTreeLeaf, commonSettings, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoResult_Preview$lambda$21(int i, Composer composer, int i2) {
        NoResult_Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResultBottomBar$lambda$9(boolean z, int i, int i2, Composer composer, int i3) {
        ResultBottomBar(z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResultCard$lambda$15(Function0 function0, Function3 content, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(content, "$content");
        ResultCard(function0, content, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResultIcon$lambda$16(boolean z, int i, Composer composer, int i2) {
        ResultIcon(z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResultIcon$lambda$17(CheckStatus checkStatus, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(checkStatus, "$checkStatus");
        ResultIcon(checkStatus, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResultTitle$lambda$4(TreeLeaf selectedTreeLeaf, Bitmap bitmap, CommonSettings commonSettings, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(selectedTreeLeaf, "$selectedTreeLeaf");
        ResultTitle(selectedTreeLeaf, bitmap, commonSettings, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void ResultTitle(final TreeLeaf selectedTreeLeaf, Bitmap bitmap, CommonSettings commonSettings, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(selectedTreeLeaf, "selectedTreeLeaf");
        Composer composerStartRestartGroup = composer.startRestartGroup(806856329);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ResultTitle)P(2,1)55@2257L1203:ResFragments.kt#4ipo3i");
        final Bitmap bitmap2 = (i2 & 2) != 0 ? null : bitmap;
        CommonSettings value = (i2 & 4) != 0 ? AppKt.getCommonSettingsStore().getData().getValue() : commonSettings;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1556624035, "C59@2380L161,69@2717L10,66@2580L212:ResFragments.kt#4ipo3i");
        IconButtonKt.IconButton(new ResFragmentsKt$ResultTitle$1$1(Model.INSTANCE), null, false, null, null, ComposableSingletons$ResFragmentsKt.INSTANCE.m7619getLambda1$app_storeRelease(), composerStartRestartGroup, ProfileVerifier.CompilationStatus.f285xf2722a21, 30);
        TextKt.m3128Text4IGK_g(selectedTreeLeaf.getName().toString(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6937boximpl(TextAlign.INSTANCE.m6944getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleMedium(), composerStartRestartGroup, 0, 0, 65020);
        composerStartRestartGroup.startReplaceGroup(1712795655);
        ComposerKt.sourceInformation(composerStartRestartGroup, "*75@2861L221");
        if (bitmap2 != null) {
            IconButtonKt.IconButton(new Function0() { // from class: com.smartengines.app.ui.results.ResFragmentsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ResFragmentsKt.ResultTitle$lambda$3$lambda$1$lambda$0(bitmap2);
                }
            }, PaddingKt.m1439paddingqDBjuR0$default(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(10), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, ComposableSingletons$ResFragmentsKt.INSTANCE.m7626getLambda2$app_storeRelease(), composerStartRestartGroup, 196656, 28);
        }
        composerStartRestartGroup.endReplaceGroup();
        composerStartRestartGroup.startReplaceGroup(1712805162);
        ComposerKt.sourceInformation(composerStartRestartGroup, "85@3225L219");
        if (Model.INSTANCE.getBuildFlavor() != BuildFlavor.STORE || value.getExtendedMode()) {
            IconButtonKt.IconButton(new Function0() { // from class: com.smartengines.app.ui.results.ResFragmentsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ResFragmentsKt.ResultTitle$lambda$3$lambda$2();
                }
            }, null, false, null, null, ComposableSingletons$ResFragmentsKt.INSTANCE.m7627getLambda3$app_storeRelease(), composerStartRestartGroup, 196614, 30);
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
            final Bitmap bitmap3 = bitmap2;
            final CommonSettings commonSettings2 = value;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.ResFragmentsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResFragmentsKt.ResultTitle$lambda$4(selectedTreeLeaf, bitmap3, commonSettings2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResultTitle$lambda$3$lambda$1$lambda$0(Bitmap it) {
        Intrinsics.checkNotNullParameter(it, "$it");
        AppViewModel.INSTANCE.setFacesModel(new FacesModel2(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResultTitle$lambda$3$lambda$2() {
        AppViewModel.INSTANCE.setShowSessionSettings(true);
        return Unit.INSTANCE;
    }

    public static final void ResultBottomBar(boolean z, Composer composer, final int i, final int i2) {
        final boolean z2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-235811728);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ResultBottomBar)98@3565L7,99@3577L759:ResFragments.kt#4ipo3i");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 14) == 0) {
            z2 = z;
            i3 = i | (composerStartRestartGroup.changed(z2) ? 4 : 2);
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i3 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            boolean z3 = i4 != 0 ? false : z2;
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final Context context = (Context) objConsume;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceAround = Arrangement.INSTANCE.getSpaceAround();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceAround, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1039753836, "C100@3702L71,100@3665L108,103@3817L69,103@3782L104:ResFragments.kt#4ipo3i");
            boolean z4 = z3;
            ButtonKt.TextButton(new Function0() { // from class: com.smartengines.app.ui.results.ResFragmentsKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ResFragmentsKt.ResultBottomBar$lambda$8$lambda$5();
                }
            }, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(277117137, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ResFragmentsKt$ResultBottomBar$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope TextButton, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                    ComposerKt.sourceInformation(composer2, "C101@3716L47:ResFragments.kt#4ipo3i");
                    if ((i5 & 81) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    String string = context.getString(C3069R.string.result_repeat);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    TextKt.m3128Text4IGK_g(string, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306374, 510);
            ButtonKt.TextButton(new Function0() { // from class: com.smartengines.app.ui.results.ResFragmentsKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ResFragmentsKt.ResultBottomBar$lambda$8$lambda$6();
                }
            }, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(398808584, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ResFragmentsKt$ResultBottomBar$1$4
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope TextButton, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                    ComposerKt.sourceInformation(composer2, "C104@3831L45:ResFragments.kt#4ipo3i");
                    if ((i5 & 81) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    String string = context.getString(C3069R.string.result_done);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    TextKt.m3128Text4IGK_g(string, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306374, 510);
            composerStartRestartGroup.startReplaceGroup(864831569);
            ComposerKt.sourceInformation(composerStartRestartGroup, "111@4139L11,110@4074L150,114@4239L81,107@3925L395");
            if (z4) {
                Function0 function0 = new Function0() { // from class: com.smartengines.app.ui.results.ResFragmentsKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ResFragmentsKt.ResultBottomBar$lambda$8$lambda$7();
                    }
                };
                RoundedCornerShape roundedCornerShapeM1718RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1718RoundedCornerShape0680j_4(C1959Dp.m7055constructorimpl(15));
                ButtonColors buttonColorsM2243buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m2243buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getPrimary(), Color.INSTANCE.m4632getWhite0d7_KjU(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 48, 12);
                composerStartRestartGroup = composerStartRestartGroup;
                ButtonKt.Button(function0, null, false, roundedCornerShapeM1718RoundedCornerShape0680j_4, buttonColorsM2243buttonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1724197983, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ResFragmentsKt$ResultBottomBar$1$6
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer2, int i5) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        ComposerKt.sourceInformation(composer2, "C115@4257L49:ResFragments.kt#4ipo3i");
                        if ((i5 & 81) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        String string = context.getString(C3069R.string.result_new_page);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        TextKt.m3128Text4IGK_g(string, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306374, 486);
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            z2 = z4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.ResFragmentsKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResFragmentsKt.ResultBottomBar$lambda$9(z2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResultBottomBar$lambda$8$lambda$5() {
        Model.INSTANCE.onResultRepeat();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResultBottomBar$lambda$8$lambda$6() {
        Model.INSTANCE.onResultDone();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResultBottomBar$lambda$8$lambda$7() {
        Model.INSTANCE.addNewPage();
        return Unit.INSTANCE;
    }

    public static final void NoResult(final TreeLeaf selectedTreeLeaf, CommonSettings commonSettings, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(selectedTreeLeaf, "selectedTreeLeaf");
        Composer composerStartRestartGroup = composer.startRestartGroup(795744629);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(NoResult)126@4495L7,127@4507L331:ResFragments.kt#4ipo3i");
        final CommonSettings value = (i2 & 2) != 0 ? AppKt.getCommonSettingsStore().getData().getValue() : commonSettings;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        Context context = (Context) objConsume;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
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
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1867488303, "C129@4567L45,131@4637L147,135@4815L17:ResFragments.kt#4ipo3i");
        ResultTitle(selectedTreeLeaf, null, value, composerStartRestartGroup, 568, 0);
        Modifier modifierWeight$default = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
        Alignment center = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1248359283, "C132@4728L46:ResFragments.kt#4ipo3i");
        String string = context.getString(C3069R.string.result_empty);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        TextKt.m3128Text4IGK_g(string, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 131070);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ResultBottomBar(false, composerStartRestartGroup, 0, 1);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.ResFragmentsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResFragmentsKt.NoResult$lambda$12(selectedTreeLeaf, value, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ResultCard(Function0<Unit> function0, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        final Function0<Unit> function02;
        int i3;
        Function0<Unit> function03;
        Modifier modifier;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(899538430);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ResultCard)P(1)150@5248L11,151@5275L150,144@4961L464:ResFragments.kt#4ipo3i");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            function02 = function0;
        } else if ((i & 14) == 0) {
            function02 = function0;
            i3 = (composerStartRestartGroup.changedInstance(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & LDSFile.EF_DG16_TAG) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            Function0<Unit> function04 = i4 != 0 ? null : function02;
            Modifier modifierM1439paddingqDBjuR0$default = PaddingKt.m1439paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C1959Dp.m7055constructorimpl(8), 7, null);
            if (function04 != null) {
                Modifier modifierM1023clickableXHw0xAI$default = ClickableKt.m1023clickableXHw0xAI$default(modifierM1439paddingqDBjuR0$default, false, null, null, function04, 7, null);
                function03 = function04;
                if (modifierM1023clickableXHw0xAI$default != null) {
                    modifier = modifierM1023clickableXHw0xAI$default;
                }
                SurfaceKt.m2978SurfaceT9BRK9s(modifier, RoundedCornerShapeKt.m1718RoundedCornerShape0680j_4(C1959Dp.m7055constructorimpl(10)), 0L, 0L, 0.0f, 0.0f, BorderStrokeKt.m1017BorderStrokecXLIe8U(C1959Dp.m7055constructorimpl(1), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getPrimary()), ComposableLambdaKt.rememberComposableLambda(1901334083, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ResFragmentsKt.ResultCard.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        ComposerKt.sourceInformation(composer2, "C152@5285L134:ResFragments.kt#4ipo3i");
                        if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                            Modifier modifierM1435padding3ABfNKs = PaddingKt.m1435padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1959Dp.m7055constructorimpl(10));
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1435padding3ABfNKs);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composer2);
                            Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            function3.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 60);
                function02 = function03;
            } else {
                function03 = function04;
            }
            modifier = modifierM1439paddingqDBjuR0$default;
            SurfaceKt.m2978SurfaceT9BRK9s(modifier, RoundedCornerShapeKt.m1718RoundedCornerShape0680j_4(C1959Dp.m7055constructorimpl(10)), 0L, 0L, 0.0f, 0.0f, BorderStrokeKt.m1017BorderStrokecXLIe8U(C1959Dp.m7055constructorimpl(1), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getPrimary()), ComposableLambdaKt.rememberComposableLambda(1901334083, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ResFragmentsKt.ResultCard.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    ComposerKt.sourceInformation(composer2, "C152@5285L134:ResFragments.kt#4ipo3i");
                    if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                        Modifier modifierM1435padding3ABfNKs = PaddingKt.m1435padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1959Dp.m7055constructorimpl(10));
                        Function3<ColumnScope, Composer, Integer, Unit> function3 = content;
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1435padding3ABfNKs);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composer2);
                        Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        function3.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 60);
            function02 = function03;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.ResFragmentsKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResFragmentsKt.ResultCard$lambda$15(function02, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ResultIcon(final boolean z, Composer composer, final int i) {
        int i2;
        int i3;
        long jM4605unboximpl;
        Composer composerStartRestartGroup = composer.startRestartGroup(-315812681);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ResultIcon)163@5486L180,163@5481L269:ResFragments.kt#4ipo3i");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (z) {
                i3 = C3069R.drawable.res_check_passed;
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = C3069R.drawable.res_check_undefined;
            }
            Painter painterPainterResource = PainterResources_androidKt.painterResource(i3, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1263601276);
            ComposerKt.sourceInformation(composerStartRestartGroup, "169@5737L7");
            if (z) {
                jM4605unboximpl = ColorKt.getPrimaryColor();
            } else {
                ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localContentColor);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                jM4605unboximpl = ((Color) objConsume).m4605unboximpl();
            }
            composerStartRestartGroup.endReplaceGroup();
            IconKt.m2584Iconww6aTOc(painterPainterResource, "", (Modifier) null, jM4605unboximpl, composerStartRestartGroup, 56, 4);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.ResFragmentsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResFragmentsKt.ResultIcon$lambda$16(z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ResultIcon(final CheckStatus checkStatus, Composer composer, final int i) {
        int i2;
        int i3;
        long jM4605unboximpl;
        Intrinsics.checkNotNullParameter(checkStatus, "checkStatus");
        Composer composerStartRestartGroup = composer.startRestartGroup(-336004567);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ResultIcon)174@5815L258,174@5810L368:ResFragments.kt#4ipo3i");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(checkStatus) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            int i4 = WhenMappings.$EnumSwitchMapping$0[checkStatus.ordinal()];
            if (i4 == 1) {
                i3 = C3069R.drawable.res_check_passed;
            } else if (i4 == 2) {
                i3 = C3069R.drawable.res_check_failed;
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = C3069R.drawable.res_check_undefined;
            }
            Painter painterPainterResource = PainterResources_androidKt.painterResource(i3, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1263614321);
            ComposerKt.sourceInformation(composerStartRestartGroup, "181@6165L7");
            if (checkStatus == CheckStatus.PASSED) {
                jM4605unboximpl = ColorKt.getPrimaryColor();
            } else {
                ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localContentColor);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                jM4605unboximpl = ((Color) objConsume).m4605unboximpl();
            }
            composerStartRestartGroup.endReplaceGroup();
            IconKt.m2584Iconww6aTOc(painterPainterResource, "", (Modifier) null, jM4605unboximpl, composerStartRestartGroup, 56, 4);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.ResFragmentsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResFragmentsKt.ResultIcon$lambda$17(checkStatus, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Dark_TitlePreview(Composer composer, final int i) throws Exception {
        Composer composerStartRestartGroup = composer.startRestartGroup(-896058736);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Dark_TitlePreview)190@6425L7,191@6449L65,192@6555L170,192@6519L206:ResFragments.kt#4ipo3i");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            composerStartRestartGroup.startReplaceGroup(826325102);
            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):ResFragments.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = UtilsKt.loadBitmapFromAssetFile(context, "sample_photo.png");
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Bitmap bitmap = (Bitmap) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            ThemeKt.SmartEnginesTheme(true, ComposableLambdaKt.rememberComposableLambda(1295074491, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ResFragmentsKt.Dark_TitlePreview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposerKt.sourceInformation(composer2, "C193@6575L144,193@6565L154:ResFragments.kt#4ipo3i");
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        final Bitmap bitmap2 = bitmap;
                        SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-2081204586, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.ResFragmentsKt.Dark_TitlePreview.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                ComposerKt.sourceInformation(composer3, "C194@6589L120:ResFragments.kt#4ipo3i");
                                if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                    ResFragmentsKt.ResultTitle(MockSelectorsKt.getMockSelectedTreeLeaf(), bitmap2, new CommonSettings(null, 1, null), composer3, 584, 0);
                                } else {
                                    composer3.skipToGroupEnd();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.ResFragmentsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResFragmentsKt.Dark_TitlePreview$lambda$19(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Dark_BottomBarPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-793299040);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Dark_BottomBarPreview)204@6836L121:ResFragments.kt#4ipo3i");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$ResFragmentsKt.INSTANCE.m7629getLambda5$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.ResFragmentsKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResFragmentsKt.Dark_BottomBarPreview$lambda$20(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void NoResult_Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1258782886);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(NoResult_Preview)214@7064L114:ResFragments.kt#4ipo3i");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$ResFragmentsKt.INSTANCE.m7631getLambda7$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.ResFragmentsKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResFragmentsKt.NoResult_Preview$lambda$21(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void DarkCard_Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(265794878);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DarkCard_Preview)223@7284L237:ResFragments.kt#4ipo3i");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$ResFragmentsKt.INSTANCE.m7621getLambda11$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.ResFragmentsKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResFragmentsKt.DarkCard_Preview$lambda$22(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void LightCard_Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(341438138);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LightCard_Preview)235@7628L238:ResFragments.kt#4ipo3i");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ThemeKt.SmartEnginesTheme(false, ComposableSingletons$ResFragmentsKt.INSTANCE.m7625getLambda15$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.ResFragmentsKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ResFragmentsKt.LightCard_Preview$lambda$23(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
