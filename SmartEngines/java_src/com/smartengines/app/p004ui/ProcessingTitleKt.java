package com.smartengines.app.p004ui;

import androidx.camera.core.ZoomState;
import androidx.camera.view.LifecycleCameraController;
import androidx.compose.foundation.BackgroundKt;
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
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Brush;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ColorKt;
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
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.lifecycle.LiveData;
import androidx.profileinstaller.ProfileVerifier;
import com.smartengines.app.C3069R;
import com.smartengines.app.Model;
import com.smartengines.app.p004ui.theme.ThemeKt;
import com.smartengines.app.targets.TreeLeaf;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.bouncycastle.i18n.TextBundle;
import org.jmrtd.lds.LDSFile;

/* compiled from: ProcessingTitle.kt */
@Metadata(m513d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\u001a\u001f\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001a)\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u001a\"\u0013\u0010\u0000\u001a\u00020\u0001¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0013\u0010\u0005\u001a\u00020\u0001¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0013\u0010\u0007\u001a\u00020\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u001b²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u008a\u0084\u0002²\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u008a\u0084\u0002"}, m514d2 = {"TEXT_COLOR", "Landroidx/compose/ui/graphics/Color;", "getTEXT_COLOR", "()J", "J", "TITLE_BG_COLOR", "getTITLE_BG_COLOR", "TITLE_HEIGHT", "Landroidx/compose/ui/unit/Dp;", "getTITLE_HEIGHT", "()F", "F", "ProcessingTitle", "", "selectedTreeLeaf", "Lcom/smartengines/app/targets/TreeLeaf;", "showButtons", "", "(Lcom/smartengines/app/targets/TreeLeaf;ZLandroidx/compose/runtime/Composer;II)V", TextBundle.TEXT_ENTRY, "", "isTorchActive", "zoomRatio", "", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Float;Landroidx/compose/runtime/Composer;I)V", "PreviewTitle", "(Landroidx/compose/runtime/Composer;I)V", "app_storeRelease", "torchState", "", "zoomState", "Landroidx/camera/core/ZoomState;"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ProcessingTitleKt {
    private static final long TEXT_COLOR = Color.INSTANCE.m4632getWhite0d7_KjU();
    private static final long TITLE_BG_COLOR = ColorKt.Color(2281701376L);
    private static final float TITLE_HEIGHT = C1959Dp.m7055constructorimpl(54);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewTitle$lambda$10(int i, Composer composer, int i2) {
        PreviewTitle(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProcessingTitle$lambda$3(TreeLeaf selectedTreeLeaf, boolean z, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(selectedTreeLeaf, "$selectedTreeLeaf");
        ProcessingTitle(selectedTreeLeaf, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProcessingTitle$lambda$9(String text, Boolean bool, Float f, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(text, "$text");
        ProcessingTitle(text, bool, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final long getTEXT_COLOR() {
        return TEXT_COLOR;
    }

    public static final long getTITLE_BG_COLOR() {
        return TITLE_BG_COLOR;
    }

    public static final float getTITLE_HEIGHT() {
        return TITLE_HEIGHT;
    }

    public static final void ProcessingTitle(final TreeLeaf selectedTreeLeaf, final boolean z, Composer composer, final int i, final int i2) {
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(selectedTreeLeaf, "selectedTreeLeaf");
        Composer composerStartRestartGroup = composer.startRestartGroup(1503716610);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ProcessingTitle):ProcessingTitle.kt#83idza");
        if ((i2 & 2) != 0) {
            z = true;
        }
        String strReplace$default = StringsKt.replace$default(selectedTreeLeaf.getName().toString(), '\n', ' ', false, 4, (Object) null);
        if (z) {
            composerStartRestartGroup.startReplaceGroup(-217254156);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*57@2219L16,58@2278L16,60@2308L192");
            LifecycleCameraController cameraController = Model.INSTANCE.getCameraController();
            if (cameraController != null) {
                LiveData<Integer> torchState = cameraController.getTorchState();
                Intrinsics.checkNotNullExpressionValue(torchState, "getTorchState(...)");
                State stateObserveAsState = LiveDataAdapterKt.observeAsState(torchState, composerStartRestartGroup, 8);
                LiveData<ZoomState> zoomState = cameraController.getZoomState();
                Intrinsics.checkNotNullExpressionValue(zoomState, "getZoomState(...)");
                State stateObserveAsState2 = LiveDataAdapterKt.observeAsState(zoomState, composerStartRestartGroup, 8);
                if (Model.INSTANCE.isFrontCamera()) {
                    boolValueOf = null;
                } else {
                    Integer numProcessingTitle$lambda$2$lambda$0 = ProcessingTitle$lambda$2$lambda$0(stateObserveAsState);
                    boolValueOf = Boolean.valueOf(numProcessingTitle$lambda$2$lambda$0 != null && numProcessingTitle$lambda$2$lambda$0.intValue() == 1);
                }
                ZoomState zoomStateProcessingTitle$lambda$2$lambda$1 = ProcessingTitle$lambda$2$lambda$1(stateObserveAsState2);
                ProcessingTitle(strReplace$default, boolValueOf, zoomStateProcessingTitle$lambda$2$lambda$1 != null ? Float.valueOf(zoomStateProcessingTitle$lambda$2$lambda$1.getZoomRatio()) : null, composerStartRestartGroup, 0);
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
        } else {
            composerStartRestartGroup.startReplaceGroup(-216882590);
            ComposerKt.sourceInformation(composerStartRestartGroup, "67@2530L31");
            ProcessingTitle(strReplace$default, (Boolean) null, (Float) null, composerStartRestartGroup, 432);
            composerStartRestartGroup.endReplaceGroup();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.ProcessingTitleKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProcessingTitleKt.ProcessingTitle$lambda$3(selectedTreeLeaf, z, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ProcessingTitle(final String text, Boolean bool, Float f, Composer composer, final int i) {
        int i2;
        final Boolean bool2;
        int i3;
        int i4;
        final Float f2 = f;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1758783907);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ProcessingTitle)P(1)84@3095L2095:ProcessingTitle.kt#83idza");
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & LDSFile.EF_DG16_TAG) == 0) {
            i2 |= composerStartRestartGroup.changed(bool) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment topStart = Alignment.INSTANCE.getTopStart();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(topStart, false);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1005805111, "C85@3172L2012:ProcessingTitle.kt#83idza");
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1610575433, "C86@3193L1658,133@4892L282:ProcessingTitle.kt#83idza");
            Modifier modifierM1466height3ABfNKs = SizeKt.m1466height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), TITLE_HEIGHT);
            long j = TITLE_BG_COLOR;
            Modifier modifierM990backgroundbw27NRU$default = BackgroundKt.m990backgroundbw27NRU$default(modifierM1466height3ABfNKs, j, null, 2, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM990backgroundbw27NRU$default);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
            Updater.m4095setimpl(composerM4088constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4095setimpl(composerM4088constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4088constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM4088constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM4088constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m4095setimpl(composerM4088constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 671747547, "C92@3434L235,103@3857L10,100@3724L263:ProcessingTitle.kt#83idza");
            IconButtonKt.IconButton(new ProcessingTitleKt$ProcessingTitle$3$1$1$1(Model.INSTANCE), null, false, null, null, ComposableSingletons$ProcessingTitleKt.INSTANCE.m7504getLambda1$app_storeRelease(), composerStartRestartGroup, ProfileVerifier.CompilationStatus.f285xf2722a21, 30);
            Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
            TextStyle titleMedium = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleMedium();
            int iM6944getCentere0LSkKk = TextAlign.INSTANCE.m6944getCentere0LSkKk();
            long j2 = TEXT_COLOR;
            TextKt.m3128Text4IGK_g(text, modifierWeight$default, j2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6937boximpl(iM6944getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, titleMedium, composerStartRestartGroup, (i2 & 14) | 384, 0, 65016);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.startReplaceGroup(437330176);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*110@4156L377,110@4079L454");
            bool2 = bool;
            if (bool2 == null) {
                i3 = 1;
            } else {
                final boolean zBooleanValue = bool2.booleanValue();
                i3 = 1;
                IconButtonKt.IconButton(new ProcessingTitleKt$ProcessingTitle$3$1$1$2$1(Model.INSTANCE), PaddingKt.m1439paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, C1959Dp.m7055constructorimpl(5), 0.0f, 11, null), false, null, null, ComposableLambdaKt.rememberComposableLambda(-244805155, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.ProcessingTitleKt$ProcessingTitle$3$1$1$2$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        ComposerKt.sourceInformation(composer2, "C112@4216L213,111@4182L329:ProcessingTitle.kt#83idza");
                        if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                            IconKt.m2584Iconww6aTOc(PainterResources_androidKt.painterResource(zBooleanValue ? C3069R.drawable.ic_flash_off : C3069R.drawable.ic_flash_on, composer2, 0), "flash", (Modifier) null, ProcessingTitleKt.getTEXT_COLOR(), composer2, 3128, 4);
                        } else {
                            composer2.skipToGroupEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 196656, 28);
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(437347573);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*124@4631L187");
            if (f == null) {
                f2 = f;
                i4 = i3;
            } else {
                float fFloatValue = f.floatValue();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("%.1fx", Arrays.copyOf(new Object[]{Float.valueOf(fFloatValue)}, i3));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                i4 = i3;
                f2 = f;
                TextKt.m3128Text4IGK_g(str, PaddingKt.m1439paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, C1959Dp.m7055constructorimpl(5), 0.0f, 11, null), j2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 432, 0, 131064);
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
            Modifier modifierM1466height3ABfNKs2 = SizeKt.m1466height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i4, null), C1959Dp.m7055constructorimpl(20));
            Brush.Companion companion2 = Brush.INSTANCE;
            Color[] colorArr = new Color[2];
            colorArr[0] = Color.m4585boximpl(j);
            colorArr[i4] = Color.m4585boximpl(Color.INSTANCE.m4630getTransparent0d7_KjU());
            SpacerKt.Spacer(BackgroundKt.background$default(modifierM1466height3ABfNKs2, Brush.Companion.m4552verticalGradient8A3gB4$default(companion2, CollectionsKt.listOf((Object[]) colorArr), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 6);
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
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            bool2 = bool;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.ProcessingTitleKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProcessingTitleKt.ProcessingTitle$lambda$9(text, bool2, f2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewTitle(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1173088865);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PreviewTitle)151@5406L123:ProcessingTitle.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$ProcessingTitleKt.INSTANCE.m7506getLambda3$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.ProcessingTitleKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProcessingTitleKt.PreviewTitle$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final Integer ProcessingTitle$lambda$2$lambda$0(State<Integer> state) {
        return state.getValue();
    }

    private static final ZoomState ProcessingTitle$lambda$2$lambda$1(State<? extends ZoomState> state) {
        return state.getValue();
    }
}
