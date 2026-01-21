package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.node.ComposeUiNode;
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
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* compiled from: ExpressiveNavigationBar.kt */
@Metadata(m513d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001aW\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\u0011\u0010+\u001a\r\u0012\u0004\u0012\u00020!0,¢\u0006\u0002\b-H\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a\u009d\u0001\u00100\u001a\u00020!2\u0006\u00101\u001a\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u00020!0,2\u0011\u00104\u001a\r\u0012\u0004\u0012\u00020!0,¢\u0006\u0002\b-2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u00105\u001a\u0002022\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020!\u0018\u00010,¢\u0006\u0002\b-2\u0015\b\u0002\u00107\u001a\u000f\u0012\u0004\u0012\u00020!\u0018\u00010,¢\u0006\u0002\b-2\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010:\u001a\u00020;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010=H\u0001ø\u0001\u0000¢\u0006\u0004\b>\u0010?\u001a\u0018\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020AH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b\"\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b\"\u0016\u0010\u000e\u001a\u00020\u0007X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000f\u0010\u0010\"\u0016\u0010\u0011\u001a\u00020\u0007X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0012\u0010\u0010\"\u0010\u0010\u0013\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b\"\u0016\u0010\u0014\u001a\u00020\u0007X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0015\u0010\u0010\"\u0016\u0010\u0016\u001a\u00020\u0007X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0017\u0010\u0010\"\u0016\u0010\u0018\u001a\u00020\u0007X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0019\u0010\u0010\"\u0016\u0010\u001a\u001a\u00020\u0007X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001b\u0010\u0010\"\u0010\u0010\u001c\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b\"\u0010\u0010\u001d\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b\"\u0016\u0010\u001e\u001a\u00020\u0007X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u001f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, m514d2 = {"ActiveIconColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActiveIndicatorColor", "ActiveIndicatorShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ActiveLabelTextColor", "IconSize", "Landroidx/compose/ui/unit/Dp;", "F", "InactiveIconColor", "InactiveLabelTextColor", "LabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "NavigationBarHeight", "StartIconIndicatorHorizontalPadding", "getStartIconIndicatorHorizontalPadding", "()F", "StartIconIndicatorVerticalPadding", "getStartIconIndicatorVerticalPadding", "StartIconItemActiveIndicatorHeight", "StartIconToLabelPadding", "getStartIconToLabelPadding", "TopIconIndicatorHorizontalPadding", "getTopIconIndicatorHorizontalPadding", "TopIconIndicatorToLabelPadding", "getTopIconIndicatorToLabelPadding", "TopIconIndicatorVerticalPadding", "getTopIconIndicatorVerticalPadding", "TopIconItemActiveIndicatorHeight", "TopIconItemActiveIndicatorWidth", "TopIconItemVerticalPadding", "getTopIconItemVerticalPadding", "ExpressiveNavigationBar", "", "modifier", "Landroidx/compose/ui/Modifier;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "arrangement", "Landroidx/compose/material3/NavigationBarArrangement;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "ExpressiveNavigationBar-NiJtXQ4", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/foundation/layout/WindowInsets;ILkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ExpressiveNavigationBarItem", "selected", "", "onClick", "icon", "enabled", AnnotatedPrivateKey.LABEL, "badge", "iconPosition", "Landroidx/compose/material3/NavigationItemIconPosition;", "colors", "Landroidx/compose/material3/NavigationItemColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "ExpressiveNavigationBarItem-pli-t6k", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILandroidx/compose/material3/NavigationItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "calculateCenteredContentHorizontalPadding", "", "itemsCount", "barWidth", "material3_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class ExpressiveNavigationBarKt {
    private static final ColorSchemeKeyTokens ActiveIconColor;
    private static final ColorSchemeKeyTokens ActiveIndicatorColor;
    private static final ShapeKeyTokens ActiveIndicatorShape;
    private static final ColorSchemeKeyTokens ActiveLabelTextColor;
    private static final float IconSize;
    private static final ColorSchemeKeyTokens InactiveIconColor;
    private static final ColorSchemeKeyTokens InactiveLabelTextColor;
    private static final TypographyKeyTokens LabelTextFont;
    private static final float NavigationBarHeight;
    private static final float StartIconIndicatorHorizontalPadding;
    private static final float StartIconIndicatorVerticalPadding;
    private static final float StartIconItemActiveIndicatorHeight;
    private static final float StartIconToLabelPadding;
    private static final float TopIconIndicatorHorizontalPadding;
    private static final float TopIconIndicatorToLabelPadding;
    private static final float TopIconIndicatorVerticalPadding;
    private static final float TopIconItemActiveIndicatorHeight;
    private static final float TopIconItemActiveIndicatorWidth;
    private static final float TopIconItemVerticalPadding;

    /* JADX WARN: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017c  */
    /* renamed from: ExpressiveNavigationBar-NiJtXQ4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2530ExpressiveNavigationBarNiJtXQ4(Modifier modifier, long j, long j2, WindowInsets windowInsets, int i, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long containerColor;
        long contentColor;
        final WindowInsets windowInsets2;
        int i5;
        final Modifier.Companion companion;
        final int iM2529getArrangementEbr7WPU;
        long j3;
        long j4;
        Composer composer2;
        final Modifier modifier3;
        final WindowInsets windowInsets3;
        final long j5;
        final int i6;
        final long j6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1171105467);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ExpressiveNavigationBar)P(4,1:c#ui.graphics.Color,3:c#ui.graphics.Color,5,0:c#material3.NavigationBarArrangement)83@3944L14,84@4018L12,85@4097L12,92@4328L779,89@4244L863:ExpressiveNavigationBar.kt#uh7d8r");
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i3 & 2) == 0) {
                containerColor = j;
                int i8 = composerStartRestartGroup.changed(containerColor) ? 32 : 16;
                i4 |= i8;
            } else {
                containerColor = j;
            }
            i4 |= i8;
        } else {
            containerColor = j;
        }
        if ((i2 & 384) == 0) {
            contentColor = j2;
            i4 |= ((i3 & 4) == 0 && composerStartRestartGroup.changed(contentColor)) ? 256 : 128;
        } else {
            contentColor = j2;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                windowInsets2 = windowInsets;
                int i9 = composerStartRestartGroup.changed(windowInsets2) ? 2048 : 1024;
                i4 |= i9;
            } else {
                windowInsets2 = windowInsets;
            }
            i4 |= i9;
        } else {
            windowInsets2 = windowInsets;
        }
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                i5 = i;
                int i10 = composerStartRestartGroup.changed(i5) ? 16384 : 8192;
                i4 |= i10;
            } else {
                i5 = i;
            }
            i4 |= i10;
        } else {
            i5 = i;
        }
        if ((i3 & 32) != 0) {
            i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
        } else if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((74899 & i4) != 74898 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i3 & 2) != 0) {
                    containerColor = ExpressiveNavigationBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    contentColor = ExpressiveNavigationBarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                    windowInsets2 = ExpressiveNavigationBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                }
                if ((i3 & 16) != 0) {
                    iM2529getArrangementEbr7WPU = ExpressiveNavigationBarDefaults.INSTANCE.m2529getArrangementEbr7WPU();
                    i4 &= -57345;
                    j3 = containerColor;
                    j4 = contentColor;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1171105467, i4, -1, "androidx.compose.material3.ExpressiveNavigationBar (ExpressiveNavigationBar.kt:88)");
                }
                int i11 = i4 << 3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m2978SurfaceT9BRK9s(null, null, j3, j4, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1573697866, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExpressiveNavigationBarKt$ExpressiveNavigationBar$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i12) {
                        CenteredContentMeasurePolicy centeredContentMeasurePolicy;
                        ComposerKt.sourceInformation(composer3, "C93@4338L763:ExpressiveNavigationBar.kt#uh7d8r");
                        if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1573697866, i12, -1, "androidx.compose.material3.ExpressiveNavigationBar.<anonymous> (ExpressiveNavigationBar.kt:93)");
                            }
                            Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(SizeKt.m1465defaultMinSizeVpY3zN4$default(WindowInsetsPaddingKt.windowInsetsPadding(companion, windowInsets2), 0.0f, ExpressiveNavigationBarKt.NavigationBarHeight, 1, null));
                            int i13 = iM2529getArrangementEbr7WPU;
                            if (NavigationBarArrangement.m2687equalsimpl0(i13, NavigationBarArrangement.INSTANCE.m2692getEqualWeightEbr7WPU())) {
                                centeredContentMeasurePolicy = new EqualWeightContentMeasurePolicy();
                            } else if (NavigationBarArrangement.m2687equalsimpl0(i13, NavigationBarArrangement.INSTANCE.m2691getCenteredEbr7WPU())) {
                                centeredContentMeasurePolicy = new CenteredContentMeasurePolicy();
                            } else {
                                throw new IllegalArgumentException("Invalid ItemsArrangement value.");
                            }
                            Function2<Composer, Integer, Unit> function22 = function2;
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierSelectableGroup);
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
                            Updater.m4095setimpl(composerM4088constructorimpl, centeredContentMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            function22.invoke(composer3, 0);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composer2, (i11 & 896) | 12582912 | (i11 & 7168), ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = companion;
                windowInsets3 = windowInsets2;
                j5 = j4;
                i6 = iM2529getArrangementEbr7WPU;
                j6 = j3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                }
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                }
                companion = modifier2;
            }
            j4 = contentColor;
            iM2529getArrangementEbr7WPU = i5;
            j3 = containerColor;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i112 = i4 << 3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m2978SurfaceT9BRK9s(null, null, j3, j4, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1573697866, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExpressiveNavigationBarKt$ExpressiveNavigationBar$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i12) {
                    CenteredContentMeasurePolicy centeredContentMeasurePolicy;
                    ComposerKt.sourceInformation(composer3, "C93@4338L763:ExpressiveNavigationBar.kt#uh7d8r");
                    if ((i12 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1573697866, i12, -1, "androidx.compose.material3.ExpressiveNavigationBar.<anonymous> (ExpressiveNavigationBar.kt:93)");
                        }
                        Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(SizeKt.m1465defaultMinSizeVpY3zN4$default(WindowInsetsPaddingKt.windowInsetsPadding(companion, windowInsets2), 0.0f, ExpressiveNavigationBarKt.NavigationBarHeight, 1, null));
                        int i13 = iM2529getArrangementEbr7WPU;
                        if (NavigationBarArrangement.m2687equalsimpl0(i13, NavigationBarArrangement.INSTANCE.m2692getEqualWeightEbr7WPU())) {
                            centeredContentMeasurePolicy = new EqualWeightContentMeasurePolicy();
                        } else if (NavigationBarArrangement.m2687equalsimpl0(i13, NavigationBarArrangement.INSTANCE.m2691getCenteredEbr7WPU())) {
                            centeredContentMeasurePolicy = new CenteredContentMeasurePolicy();
                        } else {
                            throw new IllegalArgumentException("Invalid ItemsArrangement value.");
                        }
                        Function2<Composer, Integer, Unit> function22 = function2;
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierSelectableGroup);
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
                        Updater.m4095setimpl(composerM4088constructorimpl, centeredContentMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        function22.invoke(composer3, 0);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composer2, (i112 & 896) | 12582912 | (i112 & 7168), ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = companion;
            windowInsets3 = windowInsets2;
            j5 = j4;
            i6 = iM2529getArrangementEbr7WPU;
            j6 = j3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
            j6 = containerColor;
            windowInsets3 = windowInsets2;
            j5 = contentColor;
            i6 = i5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExpressiveNavigationBarKt$ExpressiveNavigationBar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i12) {
                    ExpressiveNavigationBarKt.m2530ExpressiveNavigationBarNiJtXQ4(modifier3, j6, j5, windowInsets3, i6, function2, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0114  */
    /* renamed from: ExpressiveNavigationBarItem-pli-t6k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2531ExpressiveNavigationBarItemplit6k(final boolean z, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i, NavigationItemColors navigationItemColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i2, final int i3) {
        boolean z3;
        int i4;
        Function0<Unit> function02;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z4;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function26;
        int i9;
        int i10;
        int i11;
        int i12;
        int iM2745getTopxw1Ddg;
        NavigationItemColors navigationItemColorsColors;
        int i13;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        NavigationItemColors navigationItemColors2;
        boolean z5;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function2<? super Composer, ? super Integer, Unit> function28;
        MutableInteractionSource mutableInteractionSource3;
        boolean zM2740equalsimpl0;
        float f;
        float f2;
        Composer composer2;
        final MutableInteractionSource mutableInteractionSource4;
        final NavigationItemColors navigationItemColors3;
        final Modifier modifier4;
        final boolean z6;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final int i14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1250474866);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ExpressiveNavigationBarItem)P(9,8,3,7,2,6!1,4:c#material3.NavigationItemIconPosition)195@8610L8,219@9391L5,220@9444L5,215@9259L800:ExpressiveNavigationBar.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i2 & 6) == 0) {
                i4 = (composerStartRestartGroup.changed(z3) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                function24 = function2;
                i4 |= composerStartRestartGroup.changedInstance(function24) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        z4 = z2;
                        i4 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                    } else {
                        if ((196608 & i2) == 0) {
                            function25 = function22;
                            i4 |= composerStartRestartGroup.changedInstance(function25) ? 131072 : 65536;
                        }
                        i8 = i3 & 64;
                        if (i8 != 0) {
                            i4 |= 1572864;
                        } else {
                            if ((1572864 & i2) == 0) {
                                function26 = function23;
                                i4 |= composerStartRestartGroup.changedInstance(function26) ? 1048576 : 524288;
                            }
                            i9 = i3 & 128;
                            if (i9 == 0) {
                                i4 |= 12582912;
                            } else {
                                if ((i2 & 12582912) == 0) {
                                    i10 = i9;
                                    i4 |= composerStartRestartGroup.changed(i) ? 8388608 : 4194304;
                                }
                                if ((i2 & 100663296) == 0) {
                                    i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(navigationItemColors)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                }
                                i11 = i3 & 512;
                                if (i11 == 0) {
                                    if ((i2 & 805306368) == 0) {
                                        i12 = i11;
                                        i4 |= composerStartRestartGroup.changed(mutableInteractionSource) ? PKIFailureInfo.duplicateCertReq : 268435456;
                                    }
                                    int i15 = i4;
                                    if ((i4 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.startDefaults();
                                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                            if (i5 != 0) {
                                                modifier2 = Modifier.INSTANCE;
                                            }
                                            if (i6 != 0) {
                                                z4 = true;
                                            }
                                            if (i7 != 0) {
                                                function25 = null;
                                            }
                                            if (i8 != 0) {
                                                function26 = null;
                                            }
                                            iM2745getTopxw1Ddg = i10 == 0 ? NavigationItemIconPosition.INSTANCE.m2745getTopxw1Ddg() : i;
                                            if ((i3 & 256) == 0) {
                                                navigationItemColorsColors = ExpressiveNavigationBarItemDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                                i13 = i15 & (-234881025);
                                            } else {
                                                navigationItemColorsColors = navigationItemColors;
                                                i13 = i15;
                                            }
                                            mutableInteractionSource2 = i12 == 0 ? mutableInteractionSource : null;
                                            modifier3 = modifier2;
                                            navigationItemColors2 = navigationItemColorsColors;
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            if ((i3 & 256) != 0) {
                                                iM2745getTopxw1Ddg = i;
                                                navigationItemColors2 = navigationItemColors;
                                                i13 = i15 & (-234881025);
                                                modifier3 = modifier2;
                                                z5 = z4;
                                                function27 = function25;
                                                function28 = function26;
                                                mutableInteractionSource2 = mutableInteractionSource;
                                                composerStartRestartGroup.endDefaults();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1250474866, i13, -1, "androidx.compose.material3.ExpressiveNavigationBarItem (ExpressiveNavigationBar.kt:197)");
                                                }
                                                composerStartRestartGroup.startReplaceGroup(-986536477);
                                                ComposerKt.sourceInformation(composerStartRestartGroup, "199@8762L39");
                                                if (mutableInteractionSource2 == null) {
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -986535826, "CC(remember):ExpressiveNavigationBar.kt#9igjgp");
                                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                                } else {
                                                    mutableInteractionSource3 = mutableInteractionSource2;
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                zM2740equalsimpl0 = NavigationItemIconPosition.m2740equalsimpl0(iM2745getTopxw1Ddg, NavigationItemIconPosition.INSTANCE.m2745getTopxw1Ddg());
                                                if (zM2740equalsimpl0) {
                                                    f = TopIconIndicatorHorizontalPadding;
                                                } else {
                                                    f = StartIconIndicatorHorizontalPadding;
                                                }
                                                float f3 = f;
                                                if (zM2740equalsimpl0) {
                                                    f2 = TopIconIndicatorVerticalPadding;
                                                } else {
                                                    f2 = StartIconIndicatorVerticalPadding;
                                                }
                                                int i16 = i13 >> 3;
                                                composer2 = composerStartRestartGroup;
                                                int i17 = iM2745getTopxw1Ddg;
                                                NavigationItemKt.m2746NavigationItemSHbi2eg(z3, function02, function24, TypographyKt.getValue(LabelTextFont, composerStartRestartGroup, 6), ShapesKt.getValue(ActiveIndicatorShape, composerStartRestartGroup, 6), TopIconItemActiveIndicatorWidth, f3, f2, TopIconIndicatorToLabelPadding, StartIconToLabelPadding, TopIconItemVerticalPadding, navigationItemColors2, modifier3, z5, function27, function28, i17, mutableInteractionSource3, composer2, (i13 & 14) | 906166272 | (i13 & LDSFile.EF_DG16_TAG) | (i13 & 896), 6 | ((i13 >> 21) & LDSFile.EF_DG16_TAG) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (458752 & i16) | (i16 & 3670016));
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                mutableInteractionSource4 = mutableInteractionSource2;
                                                navigationItemColors3 = navigationItemColors2;
                                                modifier4 = modifier3;
                                                z6 = z5;
                                                function29 = function27;
                                                function210 = function28;
                                                i14 = i17;
                                            } else {
                                                iM2745getTopxw1Ddg = i;
                                                navigationItemColors2 = navigationItemColors;
                                                mutableInteractionSource2 = mutableInteractionSource;
                                                i13 = i15;
                                                modifier3 = modifier2;
                                            }
                                        }
                                        z5 = z4;
                                        function27 = function25;
                                        function28 = function26;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        composerStartRestartGroup.startReplaceGroup(-986536477);
                                        ComposerKt.sourceInformation(composerStartRestartGroup, "199@8762L39");
                                        if (mutableInteractionSource2 == null) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        zM2740equalsimpl0 = NavigationItemIconPosition.m2740equalsimpl0(iM2745getTopxw1Ddg, NavigationItemIconPosition.INSTANCE.m2745getTopxw1Ddg());
                                        if (zM2740equalsimpl0) {
                                        }
                                        float f32 = f;
                                        if (zM2740equalsimpl0) {
                                        }
                                        int i162 = i13 >> 3;
                                        composer2 = composerStartRestartGroup;
                                        int i172 = iM2745getTopxw1Ddg;
                                        NavigationItemKt.m2746NavigationItemSHbi2eg(z3, function02, function24, TypographyKt.getValue(LabelTextFont, composerStartRestartGroup, 6), ShapesKt.getValue(ActiveIndicatorShape, composerStartRestartGroup, 6), TopIconItemActiveIndicatorWidth, f32, f2, TopIconIndicatorToLabelPadding, StartIconToLabelPadding, TopIconItemVerticalPadding, navigationItemColors2, modifier3, z5, function27, function28, i172, mutableInteractionSource3, composer2, (i13 & 14) | 906166272 | (i13 & LDSFile.EF_DG16_TAG) | (i13 & 896), 6 | ((i13 >> 21) & LDSFile.EF_DG16_TAG) | (i162 & 896) | (i162 & 7168) | (57344 & i162) | (458752 & i162) | (i162 & 3670016));
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        mutableInteractionSource4 = mutableInteractionSource2;
                                        navigationItemColors3 = navigationItemColors2;
                                        modifier4 = modifier3;
                                        z6 = z5;
                                        function29 = function27;
                                        function210 = function28;
                                        i14 = i172;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        i14 = i;
                                        mutableInteractionSource4 = mutableInteractionSource;
                                        composer2 = composerStartRestartGroup;
                                        modifier4 = modifier2;
                                        z6 = z4;
                                        function29 = function25;
                                        function210 = function26;
                                        navigationItemColors3 = navigationItemColors;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExpressiveNavigationBarKt$ExpressiveNavigationBarItem$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i18) {
                                                ExpressiveNavigationBarKt.m2531ExpressiveNavigationBarItemplit6k(z, function0, function2, modifier4, z6, function29, function210, i14, navigationItemColors3, mutableInteractionSource4, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i4 |= 805306368;
                                i12 = i11;
                                int i152 = i4;
                                if ((i4 & 306783379) == 306783378) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i2 & 1) != 0) {
                                        if (i5 != 0) {
                                        }
                                        if (i6 != 0) {
                                        }
                                        if (i7 != 0) {
                                        }
                                        if (i8 != 0) {
                                        }
                                        if (i10 == 0) {
                                        }
                                        if ((i3 & 256) == 0) {
                                        }
                                        if (i12 == 0) {
                                        }
                                        modifier3 = modifier2;
                                        navigationItemColors2 = navigationItemColorsColors;
                                        z5 = z4;
                                        function27 = function25;
                                        function28 = function26;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        composerStartRestartGroup.startReplaceGroup(-986536477);
                                        ComposerKt.sourceInformation(composerStartRestartGroup, "199@8762L39");
                                        if (mutableInteractionSource2 == null) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        zM2740equalsimpl0 = NavigationItemIconPosition.m2740equalsimpl0(iM2745getTopxw1Ddg, NavigationItemIconPosition.INSTANCE.m2745getTopxw1Ddg());
                                        if (zM2740equalsimpl0) {
                                        }
                                        float f322 = f;
                                        if (zM2740equalsimpl0) {
                                        }
                                        int i1622 = i13 >> 3;
                                        composer2 = composerStartRestartGroup;
                                        int i1722 = iM2745getTopxw1Ddg;
                                        NavigationItemKt.m2746NavigationItemSHbi2eg(z3, function02, function24, TypographyKt.getValue(LabelTextFont, composerStartRestartGroup, 6), ShapesKt.getValue(ActiveIndicatorShape, composerStartRestartGroup, 6), TopIconItemActiveIndicatorWidth, f322, f2, TopIconIndicatorToLabelPadding, StartIconToLabelPadding, TopIconItemVerticalPadding, navigationItemColors2, modifier3, z5, function27, function28, i1722, mutableInteractionSource3, composer2, (i13 & 14) | 906166272 | (i13 & LDSFile.EF_DG16_TAG) | (i13 & 896), 6 | ((i13 >> 21) & LDSFile.EF_DG16_TAG) | (i1622 & 896) | (i1622 & 7168) | (57344 & i1622) | (458752 & i1622) | (i1622 & 3670016));
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        mutableInteractionSource4 = mutableInteractionSource2;
                                        navigationItemColors3 = navigationItemColors2;
                                        modifier4 = modifier3;
                                        z6 = z5;
                                        function29 = function27;
                                        function210 = function28;
                                        i14 = i1722;
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i10 = i9;
                            if ((i2 & 100663296) == 0) {
                            }
                            i11 = i3 & 512;
                            if (i11 == 0) {
                            }
                            i12 = i11;
                            int i1522 = i4;
                            if ((i4 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        function26 = function23;
                        i9 = i3 & 128;
                        if (i9 == 0) {
                        }
                        i10 = i9;
                        if ((i2 & 100663296) == 0) {
                        }
                        i11 = i3 & 512;
                        if (i11 == 0) {
                        }
                        i12 = i11;
                        int i15222 = i4;
                        if ((i4 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    function25 = function22;
                    i8 = i3 & 64;
                    if (i8 != 0) {
                    }
                    function26 = function23;
                    i9 = i3 & 128;
                    if (i9 == 0) {
                    }
                    i10 = i9;
                    if ((i2 & 100663296) == 0) {
                    }
                    i11 = i3 & 512;
                    if (i11 == 0) {
                    }
                    i12 = i11;
                    int i152222 = i4;
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z4 = z2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                function25 = function22;
                i8 = i3 & 64;
                if (i8 != 0) {
                }
                function26 = function23;
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i2 & 100663296) == 0) {
                }
                i11 = i3 & 512;
                if (i11 == 0) {
                }
                i12 = i11;
                int i1522222 = i4;
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            z4 = z2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            function25 = function22;
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            function26 = function23;
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i2 & 100663296) == 0) {
            }
            i11 = i3 & 512;
            if (i11 == 0) {
            }
            i12 = i11;
            int i15222222 = i4;
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function24 = function2;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        z4 = z2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        function25 = function22;
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        function26 = function23;
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i2 & 100663296) == 0) {
        }
        i11 = i3 & 512;
        if (i11 == 0) {
        }
        i12 = i11;
        int i152222222 = i4;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateCenteredContentHorizontalPadding(int i, int i2) {
        if (i > 6) {
            return 0;
        }
        return MathKt.roundToInt((((100 - ((i + 3) * 10)) / 2.0f) / 100) * i2);
    }

    public static final float getTopIconItemVerticalPadding() {
        return TopIconItemVerticalPadding;
    }

    public static final float getTopIconIndicatorVerticalPadding() {
        return TopIconIndicatorVerticalPadding;
    }

    public static final float getTopIconIndicatorHorizontalPadding() {
        return TopIconIndicatorHorizontalPadding;
    }

    public static final float getStartIconIndicatorVerticalPadding() {
        return StartIconIndicatorVerticalPadding;
    }

    public static final float getTopIconIndicatorToLabelPadding() {
        return TopIconIndicatorToLabelPadding;
    }

    public static final float getStartIconIndicatorHorizontalPadding() {
        return StartIconIndicatorHorizontalPadding;
    }

    public static final float getStartIconToLabelPadding() {
        return StartIconToLabelPadding;
    }

    static {
        float fM7055constructorimpl = C1959Dp.m7055constructorimpl((float) 24.0d);
        IconSize = fM7055constructorimpl;
        float fM7055constructorimpl2 = C1959Dp.m7055constructorimpl(56);
        TopIconItemActiveIndicatorWidth = fM7055constructorimpl2;
        float fM7055constructorimpl3 = C1959Dp.m7055constructorimpl(32);
        TopIconItemActiveIndicatorHeight = fM7055constructorimpl3;
        float fM7055constructorimpl4 = C1959Dp.m7055constructorimpl(40);
        StartIconItemActiveIndicatorHeight = fM7055constructorimpl4;
        LabelTextFont = TypographyKeyTokens.LabelMedium;
        ActiveIndicatorShape = ShapeKeyTokens.CornerFull;
        ActiveIconColor = ColorSchemeKeyTokens.Secondary;
        ActiveLabelTextColor = ColorSchemeKeyTokens.Secondary;
        ActiveIndicatorColor = ColorSchemeKeyTokens.SecondaryContainer;
        InactiveIconColor = ColorSchemeKeyTokens.OnSurfaceVariant;
        InactiveLabelTextColor = ColorSchemeKeyTokens.OnSurfaceVariant;
        NavigationBarHeight = C1959Dp.m7055constructorimpl(64);
        TopIconItemVerticalPadding = C1959Dp.m7055constructorimpl(6);
        float f = 2;
        TopIconIndicatorVerticalPadding = C1959Dp.m7055constructorimpl(C1959Dp.m7055constructorimpl(fM7055constructorimpl3 - fM7055constructorimpl) / f);
        TopIconIndicatorHorizontalPadding = C1959Dp.m7055constructorimpl(C1959Dp.m7055constructorimpl(fM7055constructorimpl2 - fM7055constructorimpl) / f);
        StartIconIndicatorVerticalPadding = C1959Dp.m7055constructorimpl(C1959Dp.m7055constructorimpl(fM7055constructorimpl4 - fM7055constructorimpl) / f);
        float f2 = 4;
        TopIconIndicatorToLabelPadding = C1959Dp.m7055constructorimpl(f2);
        StartIconIndicatorHorizontalPadding = C1959Dp.m7055constructorimpl(16);
        StartIconToLabelPadding = C1959Dp.m7055constructorimpl(f2);
    }
}
