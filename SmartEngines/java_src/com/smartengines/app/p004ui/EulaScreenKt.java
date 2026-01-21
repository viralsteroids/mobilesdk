package com.smartengines.app.p004ui;

import android.content.Context;
import android.content.res.Resources;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.AppKt;
import com.smartengines.app.C3069R;
import com.smartengines.app.p004ui.EulaScreenKt;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.settings.CommonSettingWriter;
import com.smartengines.app.settings.CommonSettingsStore;
import com.smartengines.utils.VersionKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* compiled from: EulaScreen.kt */
@Metadata(m513d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\u001a)\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002"}, m514d2 = {"EulaScreen", "", "writer", "Lcom/smartengines/app/settings/CommonSettingWriter;", "onClose", "Lkotlin/Function0;", "(Lcom/smartengines/app/settings/CommonSettingWriter;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "app_storeRelease", "agree", ""}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class EulaScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EulaScreen$lambda$4(CommonSettingWriter commonSettingWriter, Function0 function0, int i, int i2, Composer composer, int i3) {
        EulaScreen(commonSettingWriter, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$5(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EulaScreen(CommonSettingWriter commonSettingWriter, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        final CommonSettingsStore commonSettingsStore;
        int i3;
        final Function0<Unit> function02;
        Function0<Unit> function03;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1087117128);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(EulaScreen)P(1)47@2035L7,48@2060L34,57@2240L21,57@2264L3121,54@2159L3226:EulaScreen.kt#83idza");
        if ((i & 14) == 0) {
            if ((i2 & 1) == 0) {
                commonSettingsStore = commonSettingWriter;
                if (composerStartRestartGroup.changed(commonSettingsStore)) {
                    i4 = 4;
                }
                i3 = i4 | i;
            } else {
                commonSettingsStore = commonSettingWriter;
            }
            i4 = 2;
            i3 = i4 | i;
        } else {
            commonSettingsStore = commonSettingWriter;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & LDSFile.EF_DG16_TAG) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
            if ((i3 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if ((i2 & 1) != 0) {
                        commonSettingsStore = AppKt.getCommonSettingsStore();
                    }
                    if (i5 == 0) {
                        function03 = null;
                    }
                    composerStartRestartGroup.endDefaults();
                    ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume = composerStartRestartGroup.consume(localContext);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    Context context = (Context) objConsume;
                    composerStartRestartGroup.startReplaceGroup(-757158873);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EulaScreen.kt#9igjgp");
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    MutableState mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-757157295);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "*51@2123L24");
                    if (function03 != null) {
                        BackHandlerKt.BackHandler(false, function03, composerStartRestartGroup, 0, 1);
                        Unit unit = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    SurfaceKt.m2978SurfaceT9BRK9s(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-288364083, true, new C31242(function03, context, mutableState, commonSettingsStore), composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 126);
                    function02 = function03;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                }
                function03 = function02;
                composerStartRestartGroup.endDefaults();
                ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume2 = composerStartRestartGroup.consume(localContext2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Context context2 = (Context) objConsume2;
                composerStartRestartGroup.startReplaceGroup(-757158873);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EulaScreen.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                MutableState mutableState2 = (MutableState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-757157295);
                ComposerKt.sourceInformation(composerStartRestartGroup, "*51@2123L24");
                if (function03 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                SurfaceKt.m2978SurfaceT9BRK9s(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-288364083, true, new C31242(function03, context2, mutableState2, commonSettingsStore), composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 126);
                function02 = function03;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.EulaScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EulaScreenKt.EulaScreen$lambda$4(commonSettingsStore, function02, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        function02 = function0;
        if ((i3 & 91) == 18) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if ((i2 & 1) != 0) {
                }
                if (i5 == 0) {
                    function03 = function02;
                }
                composerStartRestartGroup.endDefaults();
                ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume22 = composerStartRestartGroup.consume(localContext22);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Context context22 = (Context) objConsume22;
                composerStartRestartGroup.startReplaceGroup(-757158873);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember):EulaScreen.kt#9igjgp");
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                MutableState mutableState22 = (MutableState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-757157295);
                ComposerKt.sourceInformation(composerStartRestartGroup, "*51@2123L24");
                if (function03 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                SurfaceKt.m2978SurfaceT9BRK9s(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-288364083, true, new C31242(function03, context22, mutableState22, commonSettingsStore), composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 126);
                function02 = function03;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean EulaScreen$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EulaScreen$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: EulaScreen.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    /* renamed from: com.smartengines.app.ui.EulaScreenKt$EulaScreen$2 */
    static final class C31242 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ MutableState<Boolean> $agree$delegate;
        final /* synthetic */ Context $context;
        final /* synthetic */ Function0<Unit> $onClose;
        final /* synthetic */ CommonSettingWriter $writer;

        C31242(Function0<Unit> function0, Context context, MutableState<Boolean> mutableState, CommonSettingWriter commonSettingWriter) {
            this.$onClose = function0;
            this.$context = context;
            this.$agree$delegate = mutableState;
            this.$writer = commonSettingWriter;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
            CommonSettingWriter commonSettingWriter;
            String str;
            Context context;
            String str2;
            String str3;
            int i2;
            String str4;
            Object obj;
            MutableState<Boolean> mutableState;
            Function0<Unit> function0;
            final MutableState<Boolean> mutableState2;
            TextStyle bodyMedium;
            String[] strArr;
            int i3;
            int i4;
            Composer composer2 = composer;
            ComposerKt.sourceInformation(composer2, "C58@2274L3105:EulaScreen.kt#83idza");
            if ((i & 11) != 2 || !composer2.getSkipping()) {
                float f = 0.0f;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Function0<Unit> function02 = this.$onClose;
                final Context context2 = this.$context;
                MutableState<Boolean> mutableState3 = this.$agree$delegate;
                CommonSettingWriter commonSettingWriter2 = this.$writer;
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
                Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, 1461037152, "C60@2329L3040:EulaScreen.kt#83idza");
                Modifier modifierM1437paddingVpY3zN4$default = PaddingKt.m1437paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1959Dp.m7055constructorimpl(15), 0.0f, 2, null);
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM1437paddingVpY3zN4$default);
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
                Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -684328072, "C:EulaScreen.kt#83idza");
                composer2.startReplaceGroup(-1961740040);
                ComposerKt.sourceInformation(composer2, "*67@2558L209,67@2533L234");
                if (function02 == null) {
                    i2 = 1;
                    str = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                    context = context2;
                    str2 = "C73@3429L9:Box.kt#2w3rfo";
                    str3 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                    str4 = "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo";
                    function0 = function02;
                    mutableState = mutableState3;
                    commonSettingWriter = commonSettingWriter2;
                    obj = null;
                } else {
                    commonSettingWriter = commonSettingWriter2;
                    str = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                    context = context2;
                    str2 = "C73@3429L9:Box.kt#2w3rfo";
                    str3 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                    i2 = 1;
                    str4 = "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo";
                    obj = null;
                    mutableState = mutableState3;
                    ButtonKt.TextButton(function02, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-451726855, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.EulaScreenKt$EulaScreen$2$1$1$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                            invoke(rowScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope TextButton, Composer composer3, int i5) {
                            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                            ComposerKt.sourceInformation(composer3, "C68@2589L35,68@2584L44,69@2653L29,70@2707L38:EulaScreen.kt#83idza");
                            if ((i5 & 81) != 16 || !composer3.getSkipping()) {
                                IconKt.m2584Iconww6aTOc(PainterResources_androidKt.painterResource(C3069R.drawable.ic_back, composer3, 0), "", (Modifier) null, 0L, composer3, 56, 12);
                                SpacerKt.Spacer(SizeKt.m1485width3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(10)), composer3, 6);
                                String string = context2.getString(C3069R.string.back);
                                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                TextKt.m3128Text4IGK_g(string, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, composer2, 54), composer2, 805306368, 510);
                    function0 = function02;
                    Unit unit = Unit.INSTANCE;
                    Unit unit2 = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-1961728008);
                ComposerKt.sourceInformation(composer2, "");
                String[] stringArray = context.getResources().getStringArray(C3069R.array.eula);
                Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
                String[] strArr2 = stringArray;
                int length = strArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length) {
                    int i7 = i6 + 1;
                    String str5 = strArr2[i5];
                    composer2.startReplaceGroup(-1961726414);
                    ComposerKt.sourceInformation(composer2, "77@3002L296");
                    if (!AppContentKt.isPreview() || i6 < 7) {
                        Intrinsics.checkNotNull(str5);
                        Modifier modifierM1437paddingVpY3zN4$default2 = PaddingKt.m1437paddingVpY3zN4$default(Modifier.INSTANCE, f, C1959Dp.m7055constructorimpl(3), i2, obj);
                        if (i6 == 0) {
                            composer2.startReplaceGroup(-134735061);
                            ComposerKt.sourceInformation(composer2, "80@3170L10");
                            bodyMedium = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleLarge();
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-134732373);
                            ComposerKt.sourceInformation(composer2, "81@3254L10");
                            bodyMedium = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium();
                            composer2.endReplaceGroup();
                        }
                        strArr = strArr2;
                        i3 = i5;
                        i4 = length;
                        TextKt.m3128Text4IGK_g(str5, modifierM1437paddingVpY3zN4$default2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, bodyMedium, composer, 48, 0, 65532);
                        composer2 = composer;
                    } else {
                        strArr = strArr2;
                        i4 = length;
                        i3 = i5;
                    }
                    composer2.endReplaceGroup();
                    i5 = i3 + 1;
                    i6 = i7;
                    strArr2 = strArr;
                    length = i4;
                    obj = null;
                    f = 0.0f;
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-1961708702);
                ComposerKt.sourceInformation(composer2, "100@4007L11,98@3882L168,103@4108L674,118@4803L534");
                if (function0 == null) {
                    float f2 = 10;
                    DividerKt.m2507HorizontalDivider9IZ8Weo(PaddingKt.m1437paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, C1959Dp.m7055constructorimpl(f2), i2, null), 0.0f, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface(), composer2, 6, 2);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i2, null);
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                    String str6 = str;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str6);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    String str7 = str3;
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str7);
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
                    Updater.m4095setimpl(composerM4088constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4095setimpl(composerM4088constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4088constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM4088constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM4088constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m4095setimpl(composerM4088constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, 119385130, "C109@4384L65,110@4474L286:EulaScreen.kt#83idza");
                    final Context context3 = context;
                    String string = context3.getString(C3069R.string.eula_check);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    TextKt.m3128Text4IGK_g(string, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 3.0f, false, 2, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131068);
                    Modifier modifierM1437paddingVpY3zN4$default3 = PaddingKt.m1437paddingVpY3zN4$default(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), C1959Dp.m7055constructorimpl(f2), 0.0f, 2, null);
                    ComposerKt.sourceInformationMarkerStart(composer, 733328855, str4);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str6);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierM1437paddingVpY3zN4$default3);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer, -692256719, str7);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor4);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4088constructorimpl4 = Updater.m4088constructorimpl(composer);
                    Updater.m4095setimpl(composerM4088constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4095setimpl(composerM4088constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4088constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM4088constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM4088constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m4095setimpl(composerM4088constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer, -2146769399, str2);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer, 2015296586, "C115@4719L14,115@4677L57:EulaScreen.kt#83idza");
                    boolean zEulaScreen$lambda$1 = EulaScreenKt.EulaScreen$lambda$1(mutableState);
                    composer.startReplaceGroup(2004673518);
                    ComposerKt.sourceInformation(composer, "CC(remember):EulaScreen.kt#9igjgp");
                    Object objRememberedValue = composer.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        mutableState2 = mutableState;
                        objRememberedValue = new Function1() { // from class: com.smartengines.app.ui.EulaScreenKt$EulaScreen$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return EulaScreenKt.C31242.invoke$lambda$9$lambda$8$lambda$5$lambda$4$lambda$3$lambda$2(mutableState2, ((Boolean) obj2).booleanValue());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    } else {
                        mutableState2 = mutableState;
                    }
                    composer.endReplaceGroup();
                    MutableState<Boolean> mutableState4 = mutableState2;
                    SwitchKt.Switch(zEulaScreen$lambda$1, (Function1) objRememberedValue, null, null, false, null, null, composer, 48, 124);
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
                    Modifier modifierM1439paddingqDBjuR0$default = PaddingKt.m1439paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, C1959Dp.m7055constructorimpl(20), 7, null);
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), composer, 6);
                    ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str6);
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer, modifierM1439paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer, -692256719, str7);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor5);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM4088constructorimpl5 = Updater.m4088constructorimpl(composer);
                    Updater.m4095setimpl(composerM4088constructorimpl5, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4095setimpl(composerM4088constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4088constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM4088constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM4088constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m4095setimpl(composerM4088constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer, 120046205, "C127@5214L101,124@5054L261:EulaScreen.kt#83idza");
                    final CommonSettingWriter commonSettingWriter3 = commonSettingWriter;
                    ButtonKt.Button(new Function0() { // from class: com.smartengines.app.ui.EulaScreenKt$EulaScreen$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EulaScreenKt.C31242.invoke$lambda$9$lambda$8$lambda$7$lambda$6(commonSettingWriter3, context3);
                        }
                    }, null, EulaScreenKt.EulaScreen$lambda$1(mutableState4), null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1672928184, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.EulaScreenKt$EulaScreen$2$1$1$4$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                            invoke(rowScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope Button, Composer composer3, int i8) {
                            Intrinsics.checkNotNullParameter(Button, "$this$Button");
                            ComposerKt.sourceInformation(composer3, "C128@5244L45:EulaScreen.kt#83idza");
                            if ((i8 & 81) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            String string2 = context3.getString(C3069R.string.eula_button);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                            TextKt.m3128Text4IGK_g(string2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                        }
                    }, composer, 54), composer, 805306368, 506);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                }
                composer.endReplaceGroup();
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
            composer2.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8$lambda$5$lambda$4$lambda$3$lambda$2(MutableState agree$delegate, boolean z) {
            Intrinsics.checkNotNullParameter(agree$delegate, "$agree$delegate");
            EulaScreenKt.EulaScreen$lambda$2(agree$delegate, z);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8$lambda$7$lambda$6(CommonSettingWriter commonSettingWriter, Context context) {
            Intrinsics.checkNotNullParameter(context, "$context");
            commonSettingWriter.writeEulaVersion(VersionKt.appVersionCode(context));
            return Unit.INSTANCE;
        }
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1395302395);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Preview)143@5616L126:EulaScreen.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            AppContentKt.setPreview(true);
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$EulaScreenKt.INSTANCE.m7436getLambda2$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.EulaScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EulaScreenKt.Preview$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
