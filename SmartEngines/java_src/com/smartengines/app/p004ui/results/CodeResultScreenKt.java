package com.smartengines.app.p004ui.results;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.p000ui.graphics.FilterQuality;
import androidx.compose.p000ui.layout.ContentScale;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
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
import com.smartengines.app.C3069R;
import com.smartengines.app.Model;
import com.smartengines.app.mock.MockSelectorsKt;
import com.smartengines.app.p004ui.BodyBoxKt;
import com.smartengines.app.p004ui.ScreenDataKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.settings.CodeSettings;
import com.smartengines.app.settings.CommonSettings;
import com.smartengines.app.targets.TreeLeaf;
import com.smartengines.engine.code.CodeObjectData;
import com.smartengines.engine.code.CodeObjectField;
import com.smartengines.engine.code.CodeResultData;
import com.smartengines.nfc.PassportKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jmrtd.lds.LDSFile;

/* compiled from: CodeResultScreen.kt */
@Metadata(m513d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\u0010\f\u001a/\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0002\u0010\u000f\u001a%\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u0013\u001a\u001d\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, m514d2 = {"CodeResultScreen", "", "selectedTreeLeaf", "Lcom/smartengines/app/targets/TreeLeaf;", "codeResultData", "Lcom/smartengines/engine/code/CodeResultData;", "settings", "Lcom/smartengines/app/settings/CommonSettings;", "codeSettings", "Lcom/smartengines/app/settings/CodeSettings;", "passportKey", "Lcom/smartengines/nfc/PassportKey;", "(Lcom/smartengines/app/targets/TreeLeaf;Lcom/smartengines/engine/code/CodeResultData;Lcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/CodeSettings;Lcom/smartengines/nfc/PassportKey;Landroidx/compose/runtime/Composer;II)V", "CodeResultData", "resultData", "(Lcom/smartengines/engine/code/CodeResultData;Lcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/CodeSettings;Lcom/smartengines/nfc/PassportKey;Landroidx/compose/runtime/Composer;I)V", "CodeObjectScreen", "codeObject", "Lcom/smartengines/engine/code/CodeObjectData;", "(Lcom/smartengines/engine/code/CodeObjectData;Lcom/smartengines/app/settings/CommonSettings;Lcom/smartengines/app/settings/CodeSettings;Landroidx/compose/runtime/Composer;I)V", "FieldRow", "field", "Lcom/smartengines/engine/code/CodeObjectField;", "(Lcom/smartengines/engine/code/CodeObjectField;Lcom/smartengines/app/settings/CommonSettings;Landroidx/compose/runtime/Composer;I)V", "CodeResultScreen_Preview", "(Landroidx/compose/runtime/Composer;I)V", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class CodeResultScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CodeObjectScreen$lambda$6(CodeObjectData codeObject, CommonSettings settings, CodeSettings codeSettings, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(codeObject, "$codeObject");
        Intrinsics.checkNotNullParameter(settings, "$settings");
        Intrinsics.checkNotNullParameter(codeSettings, "$codeSettings");
        CodeObjectScreen(codeObject, settings, codeSettings, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CodeResultData$lambda$4(CodeResultData resultData, CommonSettings settings, CodeSettings codeSettings, PassportKey passportKey, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(resultData, "$resultData");
        Intrinsics.checkNotNullParameter(settings, "$settings");
        Intrinsics.checkNotNullParameter(codeSettings, "$codeSettings");
        CodeResultData(resultData, settings, codeSettings, passportKey, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CodeResultScreen$lambda$0(TreeLeaf selectedTreeLeaf, CodeResultData codeResultData, CommonSettings commonSettings, CodeSettings codeSettings, PassportKey passportKey, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(selectedTreeLeaf, "$selectedTreeLeaf");
        Intrinsics.checkNotNullParameter(codeResultData, "$codeResultData");
        CodeResultScreen(selectedTreeLeaf, codeResultData, commonSettings, codeSettings, passportKey, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CodeResultScreen_Preview$lambda$11(int i, Composer composer, int i2) {
        CodeResultScreen_Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FieldRow$lambda$10(CodeObjectField field, CommonSettings settings, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(field, "$field");
        Intrinsics.checkNotNullParameter(settings, "$settings");
        FieldRow(field, settings, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CodeResultScreen(final TreeLeaf selectedTreeLeaf, final CodeResultData codeResultData, CommonSettings commonSettings, CodeSettings codeSettings, PassportKey passportKey, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(selectedTreeLeaf, "selectedTreeLeaf");
        Intrinsics.checkNotNullParameter(codeResultData, "codeResultData");
        Composer composerStartRestartGroup = composer.startRestartGroup(1223641443);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CodeResultScreen)P(3!1,4)67@2701L377,67@2693L385:CodeResultScreen.kt#4ipo3i");
        if ((i2 & 4) != 0) {
            commonSettings = AppKt.getCommonSettingsStore().getData().getValue();
        }
        final CommonSettings commonSettings2 = commonSettings;
        if ((i2 & 8) != 0) {
            codeSettings = AppKt.getCodeSettingsStore().getData().getValue();
        }
        final CodeSettings codeSettings2 = codeSettings;
        if ((i2 & 16) != 0) {
            passportKey = Model.INSTANCE.getPassportReader().getPassportKeyFlow().getValue();
        }
        final PassportKey passportKey2 = passportKey;
        BodyBoxKt.BodyBox(ComposableLambdaKt.rememberComposableLambda(267150300, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.CodeResultScreenKt.CodeResultScreen.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                invoke(boxScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BoxScope BodyBox, Composer composer2, int i3) {
                Intrinsics.checkNotNullParameter(BodyBox, "$this$BodyBox");
                ComposerKt.sourceInformation(composer2, "C68@2711L361:CodeResultScreen.kt#4ipo3i");
                if ((i3 & 81) != 16 || !composer2.getSkipping()) {
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    TreeLeaf treeLeaf = selectedTreeLeaf;
                    CommonSettings commonSettings3 = commonSettings2;
                    CodeResultData codeResultData2 = codeResultData;
                    CodeSettings codeSettings3 = codeSettings2;
                    PassportKey passportKey3 = passportKey2;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
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
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 859656553, "C71@2780L45,74@2866L139,79@3045L17:CodeResultScreen.kt#4ipo3i");
                    ResFragmentsKt.ResultTitle(treeLeaf, null, commonSettings3, composer2, (CommonSettings.$stable << 6) | TreeLeaf.$stable | 48, 0);
                    Modifier modifierWeight$default = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM4088constructorimpl2 = Updater.m4088constructorimpl(composer2);
                    Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1226030271, "C75@2924L67:CodeResultScreen.kt#4ipo3i");
                    CodeResultScreenKt.CodeResultData(codeResultData2, commonSettings3, codeSettings3, passportKey3, composer2, (CommonSettings.$stable << 3) | 4104 | (CodeSettings.$stable << 6));
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ResFragmentsKt.ResultBottomBar(false, composer2, 0, 1);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.CodeResultScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CodeResultScreenKt.CodeResultScreen$lambda$0(selectedTreeLeaf, codeResultData, commonSettings2, codeSettings2, passportKey2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CodeResultData(final CodeResultData codeResultData, final CommonSettings commonSettings, final CodeSettings codeSettings, final PassportKey passportKey, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1467510525);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CodeResultData)P(2,3)94@3345L21,91@3254L416:CodeResultScreen.kt#4ipo3i");
        Modifier modifierM1437paddingVpY3zN4$default = PaddingKt.m1437paddingVpY3zN4$default(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), C1959Dp.m7055constructorimpl(10), 0.0f, 2, null);
        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
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
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1746440307, "C:CodeResultScreen.kt#4ipo3i");
        composerStartRestartGroup.startReplaceGroup(56337062);
        ComposerKt.sourceInformation(composerStartRestartGroup, "*100@3518L11");
        if (passportKey != null) {
            NfcScreenKt.NfcScreen(composerStartRestartGroup, 0);
        }
        composerStartRestartGroup.endReplaceGroup();
        composerStartRestartGroup.startReplaceGroup(56339915);
        ComposerKt.sourceInformation(composerStartRestartGroup, "*104@3610L44");
        Iterator<T> it = codeResultData.getObjects().iterator();
        while (it.hasNext()) {
            CodeObjectScreen((CodeObjectData) it.next(), commonSettings, codeSettings, composerStartRestartGroup, (CommonSettings.$stable << 3) | 8 | (i & LDSFile.EF_DG16_TAG) | (CodeSettings.$stable << 6) | (i & 896));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.CodeResultScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CodeResultScreenKt.CodeResultData$lambda$4(codeResultData, commonSettings, codeSettings, passportKey, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CodeObjectScreen(final CodeObjectData codeObject, final CommonSettings settings, final CodeSettings codeSettings, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(codeObject, "codeObject");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(codeSettings, "codeSettings");
        Composer composerStartRestartGroup = composer.startRestartGroup(966385882);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CodeObjectScreen)P(!1,2)*111@3831L1942,111@3820L1953:CodeResultScreen.kt#4ipo3i");
        ResFragmentsKt.ResultCard(null, ComposableLambdaKt.rememberComposableLambda(381177191, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.CodeResultScreenKt$CodeObjectScreen$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope ResultCard, Composer composer2, int i2) {
                Object obj;
                int i3;
                Intrinsics.checkNotNullParameter(ResultCard, "$this$ResultCard");
                ComposerKt.sourceInformation(composer2, "C118@4074L10,113@3865L245,*150@5289L460:CodeResultScreen.kt#4ipo3i");
                if ((i2 & 81) != 16 || !composer2.getSkipping()) {
                    float f = 10;
                    TextKt.m3128Text4IGK_g(codeObject.getType(), SizeKt.fillMaxWidth$default(PaddingKt.m1439paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1959Dp.m7055constructorimpl(f), 7, null), 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6937boximpl(TextAlign.INSTANCE.m6944getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleMedium(), composer2, 48, 0, 65020);
                    if (codeObject.getType().equals("BankCard")) {
                        composer2.startReplaceGroup(568277605);
                        ComposerKt.sourceInformation(composer2, "");
                        i3 = 1;
                        String[] strArr = {HintConstants.AUTOFILL_HINT_NAME, "number", "expiry_date"};
                        if (!codeSettings.getCardShowOptionalData()) {
                            composer2.startReplaceGroup(568401946);
                            ComposerKt.sourceInformation(composer2, "*129@4543L22");
                            List<CodeObjectField> fields = codeObject.getFields();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : fields) {
                                CodeObjectField codeObjectField = (CodeObjectField) obj2;
                                Log.e("BANK_CARD_FIELDS", codeObjectField.getName());
                                if (ArraysKt.contains(strArr, codeObjectField.getName())) {
                                    arrayList.add(obj2);
                                }
                            }
                            CommonSettings commonSettings = settings;
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                CodeResultScreenKt.FieldRow((CodeObjectField) it.next(), commonSettings, composer2, (CommonSettings.$stable << 3) | 8);
                            }
                            composer2.endReplaceGroup();
                            obj = null;
                        } else {
                            composer2.startReplaceGroup(568700011);
                            ComposerKt.sourceInformation(composer2, "*136@4862L22");
                            List<CodeObjectField> fields2 = codeObject.getFields();
                            CodeObjectData codeObjectData = codeObject;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj3 : fields2) {
                                CodeObjectField codeObjectField2 = (CodeObjectField) obj3;
                                if (StringsKt.startsWith$default(codeObjectField2.getName(), "optional_data", false, 2, (Object) null)) {
                                    List<CodeObjectField> fields3 = codeObjectData.getFields();
                                    if (!(fields3 instanceof Collection) || !fields3.isEmpty()) {
                                        for (CodeObjectField codeObjectField3 : fields3) {
                                            if (Intrinsics.areEqual(codeObjectField3, codeObjectField2) || !Intrinsics.areEqual(codeObjectField3.getValue(), codeObjectField2.getValue())) {
                                            }
                                        }
                                    }
                                }
                                arrayList2.add(obj3);
                            }
                            obj = null;
                            CommonSettings commonSettings2 = settings;
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                CodeResultScreenKt.FieldRow((CodeObjectField) it2.next(), commonSettings2, composer2, (CommonSettings.$stable << 3) | 8);
                            }
                            composer2.endReplaceGroup();
                        }
                        composer2.endReplaceGroup();
                    } else {
                        obj = null;
                        i3 = 1;
                        composer2.startReplaceGroup(569025511);
                        ComposerKt.sourceInformation(composer2, "*144@5171L22");
                        List<CodeObjectField> fields4 = codeObject.getFields();
                        CodeObjectData codeObjectData2 = codeObject;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj4 : fields4) {
                            CodeObjectField codeObjectField4 = (CodeObjectField) obj4;
                            if (StringsKt.startsWith$default(codeObjectField4.getName(), "optional_data", false, 2, (Object) null)) {
                                List<CodeObjectField> fields5 = codeObjectData2.getFields();
                                if (!(fields5 instanceof Collection) || !fields5.isEmpty()) {
                                    for (CodeObjectField codeObjectField5 : fields5) {
                                        if (Intrinsics.areEqual(codeObjectField5, codeObjectField4) || !Intrinsics.areEqual(codeObjectField5.getValue(), codeObjectField4.getValue())) {
                                        }
                                    }
                                }
                            }
                            arrayList3.add(obj4);
                        }
                        CommonSettings commonSettings3 = settings;
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            CodeResultScreenKt.FieldRow((CodeObjectField) it3.next(), commonSettings3, composer2, (CommonSettings.$stable << 3) | 8);
                        }
                        composer2.endReplaceGroup();
                    }
                    Bitmap image = codeObject.getImage();
                    if (image == null) {
                        return;
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i3, obj);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), composer2, 6);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
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
                    Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1168749272, "C151@5384L347:CodeResultScreen.kt#4ipo3i");
                    ImageKt.m1046Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(image), null, PaddingKt.m1439paddingqDBjuR0$default(SizeKt.fillMaxWidth(Modifier.INSTANCE, 0.5f), 0.0f, 0.0f, 0.0f, C1959Dp.m7055constructorimpl(f), 7, null), null, ContentScale.INSTANCE.getFillWidth(), 0.0f, null, FilterQuality.INSTANCE.m4697getNonefv9h1I(), composer2, 25016, 104);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.CodeResultScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CodeResultScreenKt.CodeObjectScreen$lambda$6(codeObject, settings, codeSettings, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FieldRow(final CodeObjectField codeObjectField, final CommonSettings commonSettings, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1964550458);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(FieldRow)*166@5894L424,178@6327L40:CodeResultScreen.kt#4ipo3i");
        Modifier modifierM1437paddingVpY3zN4$default = PaddingKt.m1437paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1959Dp.m7055constructorimpl(5), 1, null);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 496981623, "C171@6050L176,176@6260L48:CodeResultScreen.kt#4ipo3i");
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
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
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 99055655, "C172@6097L49,173@6163L49:CodeResultScreen.kt#4ipo3i");
        TextKt.m3128Text4IGK_g(codeObjectField.getName(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 0, 131068);
        ResFragmentsKt.ResultIcon(codeObjectField.isAccepted() || commonSettings.getAlwaysAccepted(), composerStartRestartGroup, 0);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        TextKt.m3128Text4IGK_g(codeObjectField.getValue(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ProfileVerifier.CompilationStatus.f285xf2722a21, 0, 131038);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        composerStartRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        SpacerKt.Spacer(SizeKt.m1466height3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(8)), composerStartRestartGroup, 6);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.CodeResultScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CodeResultScreenKt.FieldRow$lambda$10(codeObjectField, commonSettings, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CodeResultScreen_Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2102971525);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CodeResultScreen_Preview)188@6683L16,189@6731L7,235@8585L228,235@8549L264:CodeResultScreen.kt#4ipo3i");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ScreenDataKt.ReadScreenData(composerStartRestartGroup, 0);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final CodeResultData codeResultData = new CodeResultData(CollectionsKt.listOf((Object[]) new CodeObjectData[]{new CodeObjectData("MRZ", CollectionsKt.listOf(new CodeObjectField("full_mrz", "P<RUSMAYACHENKOV<<IGOR<<<<<<<<<<<<<<<<<<<<<<7114238741RUS7110276M2007221<<<<<<<<<<<<<<06", true)), null, null), new CodeObjectData("BankCard", CollectionsKt.listOf((Object[]) new CodeObjectField[]{new CodeObjectField(HintConstants.AUTOFILL_HINT_NAME, "field value 1", true), new CodeObjectField("number", "field value 2", false), new CodeObjectField("expiry_date", "3 03 ", true), new CodeObjectField("smth", "13 ", true), new CodeObjectField("optional_data", "143 ", true), new CodeObjectField("optional_data", "13 ", true)}), BitmapFactory.decodeResource(((Context) objConsume).getResources(), C3069R.drawable.ic_launcher_background), null)}));
            ThemeKt.SmartEnginesTheme(true, ComposableLambdaKt.rememberComposableLambda(1998172272, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.CodeResultScreenKt.CodeResultScreen_Preview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    ComposerKt.sourceInformation(composer2, "C236@8603L204,236@8595L212:CodeResultScreen.kt#4ipo3i");
                    if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                        final CodeResultData codeResultData2 = codeResultData;
                        SurfaceKt.m2978SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(873166773, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.results.CodeResultScreenKt.CodeResultScreen_Preview.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                ComposerKt.sourceInformation(composer3, "C237@8617L180:CodeResultScreen.kt#4ipo3i");
                                if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                    CodeResultScreenKt.CodeResultScreen(MockSelectorsKt.getMockSelectedTreeLeaf(), codeResultData2, new CommonSettings(null, 1, null), new CodeSettings(null, 1, null), new PassportKey("", "", ""), composer3, 32832 | TreeLeaf.$stable | (CommonSettings.$stable << 6) | (CodeSettings.$stable << 9), 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.results.CodeResultScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CodeResultScreenKt.CodeResultScreen_Preview$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
