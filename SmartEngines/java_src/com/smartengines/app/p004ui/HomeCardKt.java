package com.smartengines.app.p004ui;

import android.util.Log;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.res.PainterResources_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.p000ui.unit.TextUnitKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.smartengines.app.C3069R;
import com.smartengines.app.p004ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jmrtd.lds.LDSFile;

/* compiled from: HomeCard.kt */
@Metadata(m513d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000e\u001a=\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0013\u0010\u0007\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\b\u0010\u0005\"\u0010\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u001b"}, m514d2 = {"TAG", "", "MENU_PADDING", "Landroidx/compose/ui/unit/Dp;", "getMENU_PADDING", "()F", "F", "CORNER_RADIUS", "getCORNER_RADIUS", "DEFAULT_CARD_WIDTH", "MAX_CARD_WIDTH", "measureCardSize", "cardsInRow", "", "(I)F", "HomeCard", "", TextBundle.TEXT_ENTRY, "icon", "width", "onClick", "Lkotlin/Function0;", "HomeCard-942rkJo", "(Ljava/lang/String;Ljava/lang/Integer;FLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "MenuCard_Dark", "(Landroidx/compose/runtime/Composer;I)V", "MenuCard_Light", "app_storeRelease"}, m515k = 2, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class HomeCardKt {
    private static final String TAG = "myapp.Menu";
    private static final float MENU_PADDING = C1959Dp.m7055constructorimpl(10);
    private static final float CORNER_RADIUS = C1959Dp.m7055constructorimpl(20);
    private static final float DEFAULT_CARD_WIDTH = C1959Dp.m7055constructorimpl(96);
    private static final float MAX_CARD_WIDTH = C1959Dp.m7055constructorimpl(MenuKt.InTransitionDuration);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeCard_942rkJo$lambda$2(String text, Integer num, float f, Function0 function0, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(text, "$text");
        m7550HomeCard942rkJo(text, num, f, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuCard_Dark$lambda$3(int i, Composer composer, int i2) {
        MenuCard_Dark(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MenuCard_Light$lambda$4(int i, Composer composer, int i2) {
        MenuCard_Light(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final float getMENU_PADDING() {
        return MENU_PADDING;
    }

    public static final float getCORNER_RADIUS() {
        return CORNER_RADIUS;
    }

    public static final float measureCardSize(int i) {
        float fM7055constructorimpl = C1959Dp.m7055constructorimpl(C1959Dp.m7055constructorimpl(C1959Dp.m7055constructorimpl(ScreenDataKt.getScreenData().m7576getWidthD9Ej5fM() * ScreenDataKt.getScreenData().getBodyWidthFraction()) - C1959Dp.m7055constructorimpl(MENU_PADDING * (i + 1))) / i);
        Log.d(TAG, "measureCardSize: " + ((Object) C1959Dp.m7066toStringimpl(fM7055constructorimpl)));
        return fM7055constructorimpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* renamed from: HomeCard-942rkJo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7550HomeCard942rkJo(final String text, final Integer num, float f, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        float f2;
        int i4;
        Function0<Unit> function02;
        final float f3;
        Function0<Unit> function03;
        Composer composer2;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(1582817076);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(HomeCard)P(2!1,3:c#ui.unit.Dp)*62@2243L11,68@2521L1087,63@2266L1342:HomeCard.kt#83idza");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & LDSFile.EF_DG16_TAG) == 0) {
            i3 |= composerStartRestartGroup.changed(num) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 896) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                if ((i3 & 5851) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    f3 = i5 == 0 ? DEFAULT_CARD_WIDTH : f2;
                    function03 = i4 == 0 ? null : function02;
                    Modifier modifierM1439paddingqDBjuR0$default = PaddingKt.m1439paddingqDBjuR0$default(SizeKt.m1480size3ABfNKs(Modifier.INSTANCE, f3), 0.0f, 0.0f, 0.0f, MENU_PADDING, 7, null);
                    final ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable);
                    RoundedCornerShape roundedCornerShapeM1718RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1718RoundedCornerShape0680j_4(CORNER_RADIUS);
                    if (function03 != null) {
                        modifierM1439paddingqDBjuR0$default = ClickableKt.m1023clickableXHw0xAI$default(modifierM1439paddingqDBjuR0$default, false, null, null, function03, 7, null);
                    }
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m2978SurfaceT9BRK9s(modifierM1439paddingqDBjuR0$default, roundedCornerShapeM1718RoundedCornerShape0680j_4, 0L, 0L, 0.0f, 0.0f, BorderStrokeKt.m1017BorderStrokecXLIe8U(C1959Dp.m7055constructorimpl((float) 0.5d), colorScheme.getPrimary()), ComposableLambdaKt.rememberComposableLambda(-1865452373, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.HomeCardKt$HomeCard$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                            invoke(composer3, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            ComposerKt.sourceInformation(composer3, "C69@2535L1063:HomeCard.kt#83idza");
                            if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                Integer num2 = num;
                                String str = text;
                                float f4 = f3;
                                ColorScheme colorScheme2 = colorScheme;
                                ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxSize$default);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composer3);
                                Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer3, -1788459706, "C73@2723L27,78@2910L46,77@2874L285,85@3177L27,92@3459L10,89@3328L211,96@3557L27:HomeCard.kt#83idza");
                                SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 3.0f, false, 2, null), composer3, 0);
                                IconKt.m2584Iconww6aTOc(PainterResources_androidKt.painterResource(num2 != null ? num2.intValue() : C3069R.drawable.ic_default, composer3, 0), str, SizeKt.m1466height3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(f4 * 0.4f)), colorScheme2.getPrimary(), composer3, 8, 0);
                                SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer3, 0);
                                int iM6944getCentere0LSkKk = TextAlign.INSTANCE.m6944getCentere0LSkKk();
                                TextKt.m3128Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6937boximpl(iM6944getCentere0LSkKk), TextUnitKt.getEm(1), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelMedium(), composer3, 0, 6, 63998);
                                SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 3.0f, false, 2, null), composer3, 0);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, composerStartRestartGroup, 54), composer2, 12582912, 60);
                    function04 = function03;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    f3 = f2;
                    function04 = function02;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.HomeCardKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return HomeCardKt.HomeCard_942rkJo$lambda$2(text, num, f3, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            function02 = function0;
            if ((i3 & 5851) != 1170) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                Modifier modifierM1439paddingqDBjuR0$default2 = PaddingKt.m1439paddingqDBjuR0$default(SizeKt.m1480size3ABfNKs(Modifier.INSTANCE, f3), 0.0f, 0.0f, 0.0f, MENU_PADDING, 7, null);
                final ColorScheme colorScheme2 = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable);
                RoundedCornerShape roundedCornerShapeM1718RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1718RoundedCornerShape0680j_4(CORNER_RADIUS);
                if (function03 != null) {
                }
                composer2 = composerStartRestartGroup;
                SurfaceKt.m2978SurfaceT9BRK9s(modifierM1439paddingqDBjuR0$default2, roundedCornerShapeM1718RoundedCornerShape0680j_42, 0L, 0L, 0.0f, 0.0f, BorderStrokeKt.m1017BorderStrokecXLIe8U(C1959Dp.m7055constructorimpl((float) 0.5d), colorScheme2.getPrimary()), ComposableLambdaKt.rememberComposableLambda(-1865452373, true, new Function2<Composer, Integer, Unit>() { // from class: com.smartengines.app.ui.HomeCardKt$HomeCard$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                        invoke(composer3, num2.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        ComposerKt.sourceInformation(composer3, "C69@2535L1063:HomeCard.kt#83idza");
                        if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            Integer num2 = num;
                            String str = text;
                            float f4 = f3;
                            ColorScheme colorScheme22 = colorScheme2;
                            ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxSize$default);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composer3);
                            Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer3, -1788459706, "C73@2723L27,78@2910L46,77@2874L285,85@3177L27,92@3459L10,89@3328L211,96@3557L27:HomeCard.kt#83idza");
                            SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 3.0f, false, 2, null), composer3, 0);
                            IconKt.m2584Iconww6aTOc(PainterResources_androidKt.painterResource(num2 != null ? num2.intValue() : C3069R.drawable.ic_default, composer3, 0), str, SizeKt.m1466height3ABfNKs(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(f4 * 0.4f)), colorScheme22.getPrimary(), composer3, 8, 0);
                            SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer3, 0);
                            int iM6944getCentere0LSkKk = TextAlign.INSTANCE.m6944getCentere0LSkKk();
                            TextKt.m3128Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6937boximpl(iM6944getCentere0LSkKk), TextUnitKt.getEm(1), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelMedium(), composer3, 0, 6, 63998);
                            SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 3.0f, false, 2, null), composer3, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composer2, 12582912, 60);
                function04 = function03;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        f2 = f;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((i3 & 5851) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void MenuCard_Dark(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1080016543);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(MenuCard_Dark)106@3819L438:HomeCard.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ThemeKt.SmartEnginesTheme(true, ComposableSingletons$HomeCardKt.INSTANCE.m7461getLambda2$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.HomeCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeCardKt.MenuCard_Dark$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void MenuCard_Light(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1401690627);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(MenuCard_Light)121@4361L447:HomeCard.kt#83idza");
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            ThemeKt.SmartEnginesTheme(false, ComposableSingletons$HomeCardKt.INSTANCE.m7463getLambda4$app_storeRelease(), composerStartRestartGroup, 54);
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.smartengines.app.ui.HomeCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeCardKt.MenuCard_Light$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
