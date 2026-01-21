package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.layout.LayoutKt;
import androidx.compose.p000ui.layout.Measurable;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.layout.MeasureResult;
import androidx.compose.p000ui.layout.MeasureScope;
import androidx.compose.p000ui.layout.MultiContentMeasurePolicy;
import androidx.compose.p000ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.p000ui.layout.Placeable;
import androidx.compose.p000ui.layout.SubcomposeLayoutKt;
import androidx.compose.p000ui.layout.SubcomposeMeasureScope;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.p000ui.unit.Constraints;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jmrtd.lds.LDSFile;

/* compiled from: TabRow.kt */
@Metadata(m513d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\u001a\u0094\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012\u001e\b\u0002\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0080\u0001\u0010\u001d\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u001e\b\u0002\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u009a\u0001\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012.\b\u0002\u0010\u0013\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\"0!¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u00162\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a\u0086\u0001\u0010(\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a \u0001\u0010+\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2,\u0010\u0013\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\"0!¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0006\u0010\r\u001a\u00020\u000eH\u0003ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a\u0094\u0001\u0010.\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012\u001e\b\u0002\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u001c\u001a\u0080\u0001\u00100\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u001e\b\u0002\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u001f\u001a\u0090\u0001\u00102\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102.\b\u0002\u0010\u0013\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\"0!¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u00162\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u001f\u001an\u00104\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a~\u00107\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102,\u0010\u0013\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\"0!¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\b0\u0014¢\u0006\u0002\b\u00162\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u00162\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\b0\u0019¢\u0006\u0002\b\u0016H\u0003ø\u0001\u0000¢\u0006\u0004\b8\u00106\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, m514d2 = {"ScrollableTabRowMinimumTabWidth", "Landroidx/compose/ui/unit/Dp;", "F", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "TabRowIndicatorSpec", "PrimaryScrollableTabRow", "", "selectedTabIndex", "", "modifier", "Landroidx/compose/ui/Modifier;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "edgePadding", "indicator", "Lkotlin/Function1;", "Landroidx/compose/material3/TabIndicatorScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "divider", "Lkotlin/Function0;", "tabs", "PrimaryScrollableTabRow-qhFBPw4", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PrimaryTabRow", "PrimaryTabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRow", "", "Landroidx/compose/material3/TabPosition;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "tabPositions", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRowImpl", "ScrollableTabRowImpl-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ScrollableTabRowWithSubcomposeImpl", "ScrollableTabRowWithSubcomposeImpl-qhFBPw4", "(ILkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V", "SecondaryScrollableTabRow", "SecondaryScrollableTabRow-qhFBPw4", "SecondaryTabRow", "SecondaryTabRow-pAZo6Ak", "TabRow", "TabRow-pAZo6Ak", "TabRowImpl", "TabRowImpl-DTcfvLk", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TabRowWithSubcomposeImpl", "TabRowWithSubcomposeImpl-DTcfvLk", "material3_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = C1959Dp.m7055constructorimpl(90);
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    private static final AnimationSpec<C1959Dp> TabRowIndicatorSpec = AnimationSpecKt.tween$default(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /* renamed from: PrimaryTabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3027PrimaryTabRowpAZo6Ak(final int i, Modifier modifier, long j, long j2, Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long primaryContainerColor;
        long primaryContentColor;
        int i5;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3RememberComposableLambda;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Function2<? super Composer, ? super Integer, Unit> function2M2417getLambda1$material3_release;
        Modifier modifier3;
        long j3;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function32;
        int i7;
        long j4;
        Composer composer2;
        final Modifier modifier4;
        final long j5;
        final long j6;
        final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function33;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1884787284);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PrimaryTabRow)P(5,4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)154@7555L21,155@7619L19,156@7698L189,165@8005L76:TabRow.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    primaryContainerColor = j;
                    int i9 = composerStartRestartGroup.changed(primaryContainerColor) ? 256 : 128;
                    i4 |= i9;
                } else {
                    primaryContainerColor = j;
                }
                i4 |= i9;
            } else {
                primaryContainerColor = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    primaryContentColor = j2;
                    int i10 = composerStartRestartGroup.changed(primaryContentColor) ? 2048 : 1024;
                    i4 |= i10;
                } else {
                    primaryContentColor = j2;
                }
                i4 |= i10;
            } else {
                primaryContentColor = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    function3RememberComposableLambda = function3;
                    i4 |= composerStartRestartGroup.changedInstance(function3RememberComposableLambda) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                } else {
                    if ((196608 & i2) == 0) {
                        function23 = function2;
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    }
                    if ((i3 & 64) != 0) {
                        if ((i2 & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                        }
                        if ((i4 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                            } else {
                                if (i8 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i3 & 4) != 0) {
                                    primaryContainerColor = TabRowDefaults.INSTANCE.getPrimaryContainerColor(composerStartRestartGroup, 6);
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    primaryContentColor = TabRowDefaults.INSTANCE.getPrimaryContentColor(composerStartRestartGroup, 6);
                                    i4 &= -7169;
                                }
                                if (i5 != 0) {
                                    function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-2021049253, true, new Function3<TabIndicatorScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$PrimaryTabRow$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(TabIndicatorScope tabIndicatorScope, Composer composer3, Integer num) {
                                            invoke(tabIndicatorScope, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(TabIndicatorScope tabIndicatorScope, Composer composer3, int i11) {
                                            int i12;
                                            ComposerKt.sourceInformation(composer3, "C157@7723L158:TabRow.kt#uh7d8r");
                                            if ((i11 & 6) == 0) {
                                                i12 = ((i11 & 8) == 0 ? composer3.changed(tabIndicatorScope) : composer3.changedInstance(tabIndicatorScope) ? 4 : 2) | i11;
                                            } else {
                                                i12 = i11;
                                            }
                                            if ((i12 & 19) != 18 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-2021049253, i12, -1, "androidx.compose.material3.PrimaryTabRow.<anonymous> (TabRow.kt:157)");
                                                }
                                                TabRowDefaults.INSTANCE.m3022PrimaryIndicator10LGxhE(tabIndicatorScope.tabIndicatorOffset(Modifier.INSTANCE, i, true), C1959Dp.INSTANCE.m7075getUnspecifiedD9Ej5fM(), 0.0f, 0L, null, composer3, 196656, 28);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }, composerStartRestartGroup, 54);
                                }
                                if (i6 == 0) {
                                    function2M2417getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m2417getLambda1$material3_release();
                                    modifier3 = modifier2;
                                    j3 = primaryContentColor;
                                    function32 = function3RememberComposableLambda;
                                    i7 = -1884787284;
                                    j4 = primaryContainerColor;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i7, i4, -1, "androidx.compose.material3.PrimaryTabRow (TabRow.kt:164)");
                                }
                                composer2 = composerStartRestartGroup;
                                m3034TabRowImplDTcfvLk(modifier3, j4, j3, function32, function2M2417getLambda1$material3_release, function22, composer2, (i4 >> 3) & 524286);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                j5 = j4;
                                j6 = j3;
                                function33 = function32;
                                function24 = function2M2417getLambda1$material3_release;
                            }
                            modifier3 = modifier2;
                            function32 = function3RememberComposableLambda;
                            function2M2417getLambda1$material3_release = function23;
                            i7 = -1884787284;
                            j4 = primaryContainerColor;
                            j3 = primaryContentColor;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = composerStartRestartGroup;
                            m3034TabRowImplDTcfvLk(modifier3, j4, j3, function32, function2M2417getLambda1$material3_release, function22, composer2, (i4 >> 3) & 524286);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            j5 = j4;
                            j6 = j3;
                            function33 = function32;
                            function24 = function2M2417getLambda1$material3_release;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer2 = composerStartRestartGroup;
                            modifier4 = modifier2;
                            j5 = primaryContainerColor;
                            j6 = primaryContentColor;
                            function33 = function3RememberComposableLambda;
                            function24 = function23;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$PrimaryTabRow$2
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

                                public final void invoke(Composer composer3, int i11) {
                                    TabRowKt.m3027PrimaryTabRowpAZo6Ak(i, modifier4, j5, j6, function33, function24, function22, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 1572864;
                    if ((i4 & 599187) != 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) == 0) {
                            if (i8 != 0) {
                            }
                            if ((i3 & 4) != 0) {
                            }
                            if ((i3 & 8) != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 == 0) {
                                modifier3 = modifier2;
                                function32 = function3RememberComposableLambda;
                                function2M2417getLambda1$material3_release = function23;
                                i7 = -1884787284;
                                j4 = primaryContainerColor;
                                j3 = primaryContentColor;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = composerStartRestartGroup;
                            m3034TabRowImplDTcfvLk(modifier3, j4, j3, function32, function2M2417getLambda1$material3_release, function22, composer2, (i4 >> 3) & 524286);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            j5 = j4;
                            j6 = j3;
                            function33 = function32;
                            function24 = function2M2417getLambda1$material3_release;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function23 = function2;
                if ((i3 & 64) != 0) {
                }
                if ((i4 & 599187) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function3RememberComposableLambda = function3;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function23 = function2;
            if ((i3 & 64) != 0) {
            }
            if ((i4 & 599187) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function3RememberComposableLambda = function3;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function23 = function2;
        if ((i3 & 64) != 0) {
        }
        if ((i4 & 599187) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /* renamed from: SecondaryTabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3032SecondaryTabRowpAZo6Ak(final int i, Modifier modifier, long j, long j2, Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long secondaryContainerColor;
        long secondaryContentColor;
        int i5;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3RememberComposableLambda;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Function2<? super Composer, ? super Integer, Unit> function2M2418getLambda2$material3_release;
        Modifier modifier3;
        long j3;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function32;
        int i7;
        long j4;
        Composer composer2;
        final Modifier modifier4;
        final long j5;
        final long j6;
        final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function33;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1909540706);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SecondaryTabRow)P(5,4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)208@10501L23,209@10567L21,211@10668L160,219@10946L76:TabRow.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    secondaryContainerColor = j;
                    int i9 = composerStartRestartGroup.changed(secondaryContainerColor) ? 256 : 128;
                    i4 |= i9;
                } else {
                    secondaryContainerColor = j;
                }
                i4 |= i9;
            } else {
                secondaryContainerColor = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    secondaryContentColor = j2;
                    int i10 = composerStartRestartGroup.changed(secondaryContentColor) ? 2048 : 1024;
                    i4 |= i10;
                } else {
                    secondaryContentColor = j2;
                }
                i4 |= i10;
            } else {
                secondaryContentColor = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    function3RememberComposableLambda = function3;
                    i4 |= composerStartRestartGroup.changedInstance(function3RememberComposableLambda) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                } else {
                    if ((196608 & i2) == 0) {
                        function23 = function2;
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    }
                    if ((i3 & 64) != 0) {
                        if ((i2 & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                        }
                        if ((i4 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                            } else {
                                if (i8 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i3 & 4) != 0) {
                                    secondaryContainerColor = TabRowDefaults.INSTANCE.getSecondaryContainerColor(composerStartRestartGroup, 6);
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    secondaryContentColor = TabRowDefaults.INSTANCE.getSecondaryContentColor(composerStartRestartGroup, 6);
                                    i4 &= -7169;
                                }
                                if (i5 != 0) {
                                    function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(286693261, true, new Function3<TabIndicatorScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$SecondaryTabRow$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(TabIndicatorScope tabIndicatorScope, Composer composer3, Integer num) {
                                            invoke(tabIndicatorScope, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(TabIndicatorScope tabIndicatorScope, Composer composer3, int i11) {
                                            ComposerKt.sourceInformation(composer3, "C212@10697L121:TabRow.kt#uh7d8r");
                                            if ((i11 & 6) == 0) {
                                                i11 |= (i11 & 8) == 0 ? composer3.changed(tabIndicatorScope) : composer3.changedInstance(tabIndicatorScope) ? 4 : 2;
                                            }
                                            if ((i11 & 19) != 18 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(286693261, i11, -1, "androidx.compose.material3.SecondaryTabRow.<anonymous> (TabRow.kt:212)");
                                                }
                                                TabRowDefaults.INSTANCE.m3023SecondaryIndicator9IZ8Weo(tabIndicatorScope.tabIndicatorOffset(Modifier.INSTANCE, i, false), 0.0f, 0L, composer3, 3072, 6);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }, composerStartRestartGroup, 54);
                                }
                                if (i6 == 0) {
                                    function2M2418getLambda2$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m2418getLambda2$material3_release();
                                    modifier3 = modifier2;
                                    j3 = secondaryContentColor;
                                    function32 = function3RememberComposableLambda;
                                    i7 = -1909540706;
                                    j4 = secondaryContainerColor;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i7, i4, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:218)");
                                }
                                composer2 = composerStartRestartGroup;
                                m3034TabRowImplDTcfvLk(modifier3, j4, j3, function32, function2M2418getLambda2$material3_release, function22, composer2, (i4 >> 3) & 524286);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                j5 = j4;
                                j6 = j3;
                                function33 = function32;
                                function24 = function2M2418getLambda2$material3_release;
                            }
                            modifier3 = modifier2;
                            function32 = function3RememberComposableLambda;
                            function2M2418getLambda2$material3_release = function23;
                            i7 = -1909540706;
                            j4 = secondaryContainerColor;
                            j3 = secondaryContentColor;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = composerStartRestartGroup;
                            m3034TabRowImplDTcfvLk(modifier3, j4, j3, function32, function2M2418getLambda2$material3_release, function22, composer2, (i4 >> 3) & 524286);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            j5 = j4;
                            j6 = j3;
                            function33 = function32;
                            function24 = function2M2418getLambda2$material3_release;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer2 = composerStartRestartGroup;
                            modifier4 = modifier2;
                            j5 = secondaryContainerColor;
                            j6 = secondaryContentColor;
                            function33 = function3RememberComposableLambda;
                            function24 = function23;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$SecondaryTabRow$2
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

                                public final void invoke(Composer composer3, int i11) {
                                    TabRowKt.m3032SecondaryTabRowpAZo6Ak(i, modifier4, j5, j6, function33, function24, function22, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 1572864;
                    if ((i4 & 599187) != 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) == 0) {
                            if (i8 != 0) {
                            }
                            if ((i3 & 4) != 0) {
                            }
                            if ((i3 & 8) != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 == 0) {
                                modifier3 = modifier2;
                                function32 = function3RememberComposableLambda;
                                function2M2418getLambda2$material3_release = function23;
                                i7 = -1909540706;
                                j4 = secondaryContainerColor;
                                j3 = secondaryContentColor;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = composerStartRestartGroup;
                            m3034TabRowImplDTcfvLk(modifier3, j4, j3, function32, function2M2418getLambda2$material3_release, function22, composer2, (i4 >> 3) & 524286);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            j5 = j4;
                            j6 = j3;
                            function33 = function32;
                            function24 = function2M2418getLambda2$material3_release;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function23 = function2;
                if ((i3 & 64) != 0) {
                }
                if ((i4 & 599187) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function3RememberComposableLambda = function3;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function23 = function2;
            if ((i3 & 64) != 0) {
            }
            if ((i4 & 599187) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function3RememberComposableLambda = function3;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function23 = function2;
        if ((i3 & 64) != 0) {
        }
        if ((i4 & 599187) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /* renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3033TabRowpAZo6Ak(final int i, Modifier modifier, long j, long j2, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long primaryContainerColor;
        long primaryContentColor;
        int i5;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3RememberComposableLambda;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Function2<? super Composer, ? super Integer, Unit> function2M2419getLambda3$material3_release;
        Modifier modifier3;
        long j3;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        int i7;
        long j4;
        Composer composer2;
        final Modifier modifier4;
        final long j5;
        final long j6;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1199178586);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TabRow)P(5,4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)302@15283L21,303@15347L19,305@15459L246,315@15823L90:TabRow.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    primaryContainerColor = j;
                    int i9 = composerStartRestartGroup.changed(primaryContainerColor) ? 256 : 128;
                    i4 |= i9;
                } else {
                    primaryContainerColor = j;
                }
                i4 |= i9;
            } else {
                primaryContainerColor = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    primaryContentColor = j2;
                    int i10 = composerStartRestartGroup.changed(primaryContentColor) ? 2048 : 1024;
                    i4 |= i10;
                } else {
                    primaryContentColor = j2;
                }
                i4 |= i10;
            } else {
                primaryContentColor = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    function3RememberComposableLambda = function3;
                    i4 |= composerStartRestartGroup.changedInstance(function3RememberComposableLambda) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                } else {
                    if ((196608 & i2) == 0) {
                        function23 = function2;
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    }
                    if ((i3 & 64) != 0) {
                        if ((i2 & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                        }
                        if ((i4 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                            } else {
                                if (i8 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i3 & 4) != 0) {
                                    primaryContainerColor = TabRowDefaults.INSTANCE.getPrimaryContainerColor(composerStartRestartGroup, 6);
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    primaryContentColor = TabRowDefaults.INSTANCE.getPrimaryContentColor(composerStartRestartGroup, 6);
                                    i4 &= -7169;
                                }
                                if (i5 != 0) {
                                    function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-2052073983, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer3, Integer num) {
                                            invoke((List<TabPosition>) list, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(List<TabPosition> list, Composer composer3, int i11) {
                                            ComposerKt.sourceInformation(composer3, "C307@15564L117:TabRow.kt#uh7d8r");
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-2052073983, i11, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:306)");
                                            }
                                            if (i < list.size()) {
                                                TabRowDefaults.INSTANCE.m3023SecondaryIndicator9IZ8Weo(TabRowDefaults.INSTANCE.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer3, 3072, 6);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54);
                                }
                                if (i6 == 0) {
                                    function2M2419getLambda3$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m2419getLambda3$material3_release();
                                    modifier3 = modifier2;
                                    j3 = primaryContentColor;
                                    function32 = function3RememberComposableLambda;
                                    i7 = -1199178586;
                                    j4 = primaryContainerColor;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i7, i4, -1, "androidx.compose.material3.TabRow (TabRow.kt:314)");
                                }
                                composer2 = composerStartRestartGroup;
                                m3035TabRowWithSubcomposeImplDTcfvLk(modifier3, j4, j3, function32, function2M2419getLambda3$material3_release, function22, composer2, (i4 >> 3) & 524286);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                j5 = j4;
                                j6 = j3;
                                function33 = function32;
                                function24 = function2M2419getLambda3$material3_release;
                            }
                            modifier3 = modifier2;
                            function32 = function3RememberComposableLambda;
                            function2M2419getLambda3$material3_release = function23;
                            i7 = -1199178586;
                            j4 = primaryContainerColor;
                            j3 = primaryContentColor;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = composerStartRestartGroup;
                            m3035TabRowWithSubcomposeImplDTcfvLk(modifier3, j4, j3, function32, function2M2419getLambda3$material3_release, function22, composer2, (i4 >> 3) & 524286);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            j5 = j4;
                            j6 = j3;
                            function33 = function32;
                            function24 = function2M2419getLambda3$material3_release;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer2 = composerStartRestartGroup;
                            modifier4 = modifier2;
                            j5 = primaryContainerColor;
                            j6 = primaryContentColor;
                            function33 = function3RememberComposableLambda;
                            function24 = function23;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
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

                                public final void invoke(Composer composer3, int i11) {
                                    TabRowKt.m3033TabRowpAZo6Ak(i, modifier4, j5, j6, function33, function24, function22, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 1572864;
                    if ((i4 & 599187) != 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) == 0) {
                            if (i8 != 0) {
                            }
                            if ((i3 & 4) != 0) {
                            }
                            if ((i3 & 8) != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 == 0) {
                                modifier3 = modifier2;
                                function32 = function3RememberComposableLambda;
                                function2M2419getLambda3$material3_release = function23;
                                i7 = -1199178586;
                                j4 = primaryContainerColor;
                                j3 = primaryContentColor;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = composerStartRestartGroup;
                            m3035TabRowWithSubcomposeImplDTcfvLk(modifier3, j4, j3, function32, function2M2419getLambda3$material3_release, function22, composer2, (i4 >> 3) & 524286);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            j5 = j4;
                            j6 = j3;
                            function33 = function32;
                            function24 = function2M2419getLambda3$material3_release;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function23 = function2;
                if ((i3 & 64) != 0) {
                }
                if ((i4 & 599187) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function3RememberComposableLambda = function3;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function23 = function2;
            if ((i3 & 64) != 0) {
            }
            if ((i4 & 599187) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function3RememberComposableLambda = function3;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function23 = function2;
        if ((i3 & 64) != 0) {
        }
        if ((i4 & 599187) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fe  */
    /* renamed from: PrimaryScrollableTabRow-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3026PrimaryScrollableTabRowqhFBPw4(final int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        ScrollState scrollStateRememberScrollState;
        long primaryContainerColor;
        long primaryContentColor;
        int i5;
        float fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM;
        int i6;
        int i7;
        int i8;
        int i9;
        long j3;
        float f2;
        ScrollState scrollState2;
        long j4;
        Function2<? super Composer, ? super Integer, Unit> function2M2420getLambda4$material3_release;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function32;
        Modifier modifier3;
        long j5;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function33;
        final float f3;
        final Modifier modifier4;
        final ScrollState scrollState3;
        final long j6;
        final long j7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1763241113);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PrimaryScrollableTabRow)P(7,5,6,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,4)357@18289L21,358@18355L21,359@18419L19,362@18589L198,371@18905L328:TabRow.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    scrollStateRememberScrollState = scrollState;
                    int i11 = composerStartRestartGroup.changed(scrollStateRememberScrollState) ? 256 : 128;
                    i4 |= i11;
                } else {
                    scrollStateRememberScrollState = scrollState;
                }
                i4 |= i11;
            } else {
                scrollStateRememberScrollState = scrollState;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    primaryContainerColor = j;
                    int i12 = composerStartRestartGroup.changed(primaryContainerColor) ? 2048 : 1024;
                    i4 |= i12;
                } else {
                    primaryContainerColor = j;
                }
                i4 |= i12;
            } else {
                primaryContainerColor = j;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    primaryContentColor = j2;
                    int i13 = composerStartRestartGroup.changed(primaryContentColor) ? 16384 : 8192;
                    i4 |= i13;
                } else {
                    primaryContentColor = j2;
                }
                i4 |= i13;
            } else {
                primaryContentColor = j2;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
            } else {
                if ((196608 & i2) == 0) {
                    fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
                    i4 |= composerStartRestartGroup.changed(fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM) ? 131072 : 65536;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else {
                    if ((i2 & 12582912) == 0) {
                        i8 = i7;
                        i4 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    if ((i3 & 256) != 0) {
                        if ((i2 & 100663296) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        if ((i4 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i10 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                                }
                                if ((i3 & 8) != 0) {
                                    primaryContainerColor = TabRowDefaults.INSTANCE.getPrimaryContainerColor(composerStartRestartGroup, 6);
                                    i4 &= -7169;
                                }
                                if ((i3 & 16) != 0) {
                                    primaryContentColor = TabRowDefaults.INSTANCE.getPrimaryContentColor(composerStartRestartGroup, 6);
                                    i4 &= -57345;
                                }
                                if (i5 != 0) {
                                    fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m3024getScrollableTabRowEdgeStartPaddingD9Ej5fM();
                                }
                                ComposableLambda composableLambdaRememberComposableLambda = i6 == 0 ? ComposableLambdaKt.rememberComposableLambda(1601820568, true, new Function3<TabIndicatorScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$PrimaryScrollableTabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(TabIndicatorScope tabIndicatorScope, Composer composer2, Integer num) {
                                        invoke(tabIndicatorScope, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(TabIndicatorScope tabIndicatorScope, Composer composer2, int i14) {
                                        int i15;
                                        ComposerKt.sourceInformation(composer2, "C363@18618L159:TabRow.kt#uh7d8r");
                                        if ((i14 & 6) == 0) {
                                            i15 = ((i14 & 8) == 0 ? composer2.changed(tabIndicatorScope) : composer2.changedInstance(tabIndicatorScope) ? 4 : 2) | i14;
                                        } else {
                                            i15 = i14;
                                        }
                                        if ((i15 & 19) != 18 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1601820568, i15, -1, "androidx.compose.material3.PrimaryScrollableTabRow.<anonymous> (TabRow.kt:363)");
                                            }
                                            TabRowDefaults.INSTANCE.m3022PrimaryIndicator10LGxhE(tabIndicatorScope.tabIndicatorOffset(Modifier.INSTANCE, i, true), C1959Dp.INSTANCE.m7075getUnspecifiedD9Ej5fM(), 0.0f, 0L, null, composer2, 196656, 28);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }, composerStartRestartGroup, 54) : function3;
                                if (i8 == 0) {
                                    i9 = i4;
                                    j4 = primaryContentColor;
                                    function32 = composableLambdaRememberComposableLambda;
                                    function2M2420getLambda4$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m2420getLambda4$material3_release();
                                    modifier3 = modifier2;
                                    j3 = primaryContainerColor;
                                    f2 = fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                    scrollState2 = scrollStateRememberScrollState;
                                } else {
                                    i9 = i4;
                                    j3 = primaryContainerColor;
                                    f2 = fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                    scrollState2 = scrollStateRememberScrollState;
                                    j4 = primaryContentColor;
                                    function2M2420getLambda4$material3_release = function2;
                                    function32 = composableLambdaRememberComposableLambda;
                                    modifier3 = modifier2;
                                }
                                j5 = j4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                }
                                i9 = i4;
                                modifier3 = modifier2;
                                j3 = primaryContainerColor;
                                f2 = fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                scrollState2 = scrollStateRememberScrollState;
                                j5 = primaryContentColor;
                                function32 = function3;
                                function2M2420getLambda4$material3_release = function2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1763241113, i9, -1, "androidx.compose.material3.PrimaryScrollableTabRow (TabRow.kt:370)");
                            }
                            int i14 = i9 >> 3;
                            m3029ScrollableTabRowImplsKfQg0A(i, modifier3, j3, j5, f2, scrollState2, function32, function2M2420getLambda4$material3_release, function22, composerStartRestartGroup, (i9 & 126) | (i14 & 896) | (i14 & 7168) | (i14 & 57344) | ((i9 << 9) & 458752) | (3670016 & i9) | (29360128 & i9) | (i9 & 234881024));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function23 = function2M2420getLambda4$material3_release;
                            function33 = function32;
                            f3 = f2;
                            long j8 = j3;
                            modifier4 = modifier3;
                            scrollState3 = scrollState2;
                            j6 = j5;
                            j7 = j8;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function23 = function2;
                            modifier4 = modifier2;
                            scrollState3 = scrollStateRememberScrollState;
                            j7 = primaryContainerColor;
                            j6 = primaryContentColor;
                            f3 = fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                            function33 = function3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$PrimaryScrollableTabRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i15) {
                                    TabRowKt.m3026PrimaryScrollableTabRowqhFBPw4(i, modifier4, scrollState3, j7, j6, f3, function33, function23, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 100663296;
                    if ((i4 & 38347923) != 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i10 != 0) {
                            }
                            if ((i3 & 4) != 0) {
                            }
                            if ((i3 & 8) != 0) {
                            }
                            if ((i3 & 16) != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            j5 = j4;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i142 = i9 >> 3;
                            m3029ScrollableTabRowImplsKfQg0A(i, modifier3, j3, j5, f2, scrollState2, function32, function2M2420getLambda4$material3_release, function22, composerStartRestartGroup, (i9 & 126) | (i142 & 896) | (i142 & 7168) | (i142 & 57344) | ((i9 << 9) & 458752) | (3670016 & i9) | (29360128 & i9) | (i9 & 234881024));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function23 = function2M2420getLambda4$material3_release;
                            function33 = function32;
                            f3 = f2;
                            long j82 = j3;
                            modifier4 = modifier3;
                            scrollState3 = scrollState2;
                            j6 = j5;
                            j7 = j82;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i8 = i7;
                if ((i3 & 256) != 0) {
                }
                if ((i4 & 38347923) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i3 & 256) != 0) {
            }
            if ((i4 & 38347923) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i3 & 256) != 0) {
        }
        if ((i4 & 38347923) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fe  */
    /* renamed from: SecondaryScrollableTabRow-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3031SecondaryScrollableTabRowqhFBPw4(final int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        ScrollState scrollStateRememberScrollState;
        long secondaryContainerColor;
        long secondaryContentColor;
        int i5;
        float fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM;
        int i6;
        int i7;
        int i8;
        int i9;
        long j3;
        float f2;
        ScrollState scrollState2;
        long j4;
        Function2<? super Composer, ? super Integer, Unit> function2M2421getLambda5$material3_release;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function32;
        Modifier modifier3;
        long j5;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function33;
        final float f3;
        final Modifier modifier4;
        final ScrollState scrollState3;
        final long j6;
        final long j7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1821940917);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SecondaryScrollableTabRow)P(7,5,6,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,4)427@21884L21,428@21950L23,429@22016L21,432@22188L160,440@22466L327:TabRow.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    scrollStateRememberScrollState = scrollState;
                    int i11 = composerStartRestartGroup.changed(scrollStateRememberScrollState) ? 256 : 128;
                    i4 |= i11;
                } else {
                    scrollStateRememberScrollState = scrollState;
                }
                i4 |= i11;
            } else {
                scrollStateRememberScrollState = scrollState;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    secondaryContainerColor = j;
                    int i12 = composerStartRestartGroup.changed(secondaryContainerColor) ? 2048 : 1024;
                    i4 |= i12;
                } else {
                    secondaryContainerColor = j;
                }
                i4 |= i12;
            } else {
                secondaryContainerColor = j;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    secondaryContentColor = j2;
                    int i13 = composerStartRestartGroup.changed(secondaryContentColor) ? 16384 : 8192;
                    i4 |= i13;
                } else {
                    secondaryContentColor = j2;
                }
                i4 |= i13;
            } else {
                secondaryContentColor = j2;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
            } else {
                if ((196608 & i2) == 0) {
                    fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
                    i4 |= composerStartRestartGroup.changed(fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM) ? 131072 : 65536;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else {
                    if ((i2 & 12582912) == 0) {
                        i8 = i7;
                        i4 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                    }
                    if ((i3 & 256) != 0) {
                        if ((i2 & 100663296) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        if ((i4 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i10 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                                }
                                if ((i3 & 8) != 0) {
                                    secondaryContainerColor = TabRowDefaults.INSTANCE.getSecondaryContainerColor(composerStartRestartGroup, 6);
                                    i4 &= -7169;
                                }
                                if ((i3 & 16) != 0) {
                                    secondaryContentColor = TabRowDefaults.INSTANCE.getSecondaryContentColor(composerStartRestartGroup, 6);
                                    i4 &= -57345;
                                }
                                if (i5 != 0) {
                                    fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m3024getScrollableTabRowEdgeStartPaddingD9Ej5fM();
                                }
                                ComposableLambda composableLambdaRememberComposableLambda = i6 == 0 ? ComposableLambdaKt.rememberComposableLambda(1535842470, true, new Function3<TabIndicatorScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$SecondaryScrollableTabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(TabIndicatorScope tabIndicatorScope, Composer composer2, Integer num) {
                                        invoke(tabIndicatorScope, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(TabIndicatorScope tabIndicatorScope, Composer composer2, int i14) {
                                        ComposerKt.sourceInformation(composer2, "C433@22217L121:TabRow.kt#uh7d8r");
                                        if ((i14 & 6) == 0) {
                                            i14 |= (i14 & 8) == 0 ? composer2.changed(tabIndicatorScope) : composer2.changedInstance(tabIndicatorScope) ? 4 : 2;
                                        }
                                        if ((i14 & 19) != 18 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1535842470, i14, -1, "androidx.compose.material3.SecondaryScrollableTabRow.<anonymous> (TabRow.kt:433)");
                                            }
                                            TabRowDefaults.INSTANCE.m3023SecondaryIndicator9IZ8Weo(tabIndicatorScope.tabIndicatorOffset(Modifier.INSTANCE, i, false), 0.0f, 0L, composer2, 3072, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }, composerStartRestartGroup, 54) : function3;
                                if (i8 == 0) {
                                    i9 = i4;
                                    j4 = secondaryContentColor;
                                    function32 = composableLambdaRememberComposableLambda;
                                    function2M2421getLambda5$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m2421getLambda5$material3_release();
                                    modifier3 = modifier2;
                                    j3 = secondaryContainerColor;
                                    f2 = fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                    scrollState2 = scrollStateRememberScrollState;
                                } else {
                                    i9 = i4;
                                    j3 = secondaryContainerColor;
                                    f2 = fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                    scrollState2 = scrollStateRememberScrollState;
                                    j4 = secondaryContentColor;
                                    function2M2421getLambda5$material3_release = function2;
                                    function32 = composableLambdaRememberComposableLambda;
                                    modifier3 = modifier2;
                                }
                                j5 = j4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                }
                                i9 = i4;
                                modifier3 = modifier2;
                                j3 = secondaryContainerColor;
                                f2 = fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                scrollState2 = scrollStateRememberScrollState;
                                j5 = secondaryContentColor;
                                function32 = function3;
                                function2M2421getLambda5$material3_release = function2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1821940917, i9, -1, "androidx.compose.material3.SecondaryScrollableTabRow (TabRow.kt:439)");
                            }
                            int i14 = i9 >> 3;
                            m3029ScrollableTabRowImplsKfQg0A(i, modifier3, j3, j5, f2, scrollState2, function32, function2M2421getLambda5$material3_release, function22, composerStartRestartGroup, (i9 & 126) | (i14 & 896) | (i14 & 7168) | (i14 & 57344) | ((i9 << 9) & 458752) | (3670016 & i9) | (29360128 & i9) | (i9 & 234881024));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function23 = function2M2421getLambda5$material3_release;
                            function33 = function32;
                            f3 = f2;
                            long j8 = j3;
                            modifier4 = modifier3;
                            scrollState3 = scrollState2;
                            j6 = j5;
                            j7 = j8;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function23 = function2;
                            modifier4 = modifier2;
                            scrollState3 = scrollStateRememberScrollState;
                            j7 = secondaryContainerColor;
                            j6 = secondaryContentColor;
                            f3 = fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                            function33 = function3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$SecondaryScrollableTabRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i15) {
                                    TabRowKt.m3031SecondaryScrollableTabRowqhFBPw4(i, modifier4, scrollState3, j7, j6, f3, function33, function23, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 100663296;
                    if ((i4 & 38347923) != 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i10 != 0) {
                            }
                            if ((i3 & 4) != 0) {
                            }
                            if ((i3 & 8) != 0) {
                            }
                            if ((i3 & 16) != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            j5 = j4;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i142 = i9 >> 3;
                            m3029ScrollableTabRowImplsKfQg0A(i, modifier3, j3, j5, f2, scrollState2, function32, function2M2421getLambda5$material3_release, function22, composerStartRestartGroup, (i9 & 126) | (i142 & 896) | (i142 & 7168) | (i142 & 57344) | ((i9 << 9) & 458752) | (3670016 & i9) | (29360128 & i9) | (i9 & 234881024));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function23 = function2M2421getLambda5$material3_release;
                            function33 = function32;
                            f3 = f2;
                            long j82 = j3;
                            modifier4 = modifier3;
                            scrollState3 = scrollState2;
                            j6 = j5;
                            j7 = j82;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i8 = i7;
                if ((i3 & 256) != 0) {
                }
                if ((i4 & 38347923) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i3 & 256) != 0) {
            }
            if ((i4 & 38347923) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i3 & 256) != 0) {
        }
        if ((i4 & 38347923) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0112  */
    /* renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3028ScrollableTabRowsKfQg0A(final int i, Modifier modifier, long j, long j2, float f, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long primaryContainerColor;
        long primaryContentColor;
        int i5;
        float fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM;
        int i6;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3RememberComposableLambda;
        int i7;
        int i8;
        final Modifier modifier3;
        final long j3;
        final long j4;
        final float f2;
        Function2<? super Composer, ? super Integer, Unit> function2M2422getLambda6$material3_release;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-497821003);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScrollableTabRow)P(6,5,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,4)495@25349L21,496@25413L19,499@25596L164,516@26202L21,507@25878L351:TabRow.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    primaryContainerColor = j;
                    int i10 = composerStartRestartGroup.changed(primaryContainerColor) ? 256 : 128;
                    i4 |= i10;
                } else {
                    primaryContainerColor = j;
                }
                i4 |= i10;
            } else {
                primaryContainerColor = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    primaryContentColor = j2;
                    int i11 = composerStartRestartGroup.changed(primaryContentColor) ? 2048 : 1024;
                    i4 |= i11;
                } else {
                    primaryContentColor = j2;
                }
                i4 |= i11;
            } else {
                primaryContentColor = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
                    i4 |= composerStartRestartGroup.changed(fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                } else {
                    if ((196608 & i2) == 0) {
                        function3RememberComposableLambda = function3;
                        i4 |= composerStartRestartGroup.changedInstance(function3RememberComposableLambda) ? 131072 : 65536;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) != 0) {
                        if ((i2 & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        }
                        if ((i4 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                            } else {
                                if (i9 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i3 & 4) != 0) {
                                    primaryContainerColor = TabRowDefaults.INSTANCE.getPrimaryContainerColor(composerStartRestartGroup, 6);
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    primaryContentColor = TabRowDefaults.INSTANCE.getPrimaryContentColor(composerStartRestartGroup, 6);
                                    i4 &= -7169;
                                }
                                if (i5 != 0) {
                                    fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m3024getScrollableTabRowEdgeStartPaddingD9Ej5fM();
                                }
                                if (i6 != 0) {
                                    function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-913748678, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                            invoke((List<TabPosition>) list, composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(List<TabPosition> list, Composer composer2, int i12) {
                                            ComposerKt.sourceInformation(composer2, "C500@25641L109:TabRow.kt#uh7d8r");
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-913748678, i12, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:500)");
                                            }
                                            TabRowDefaults.INSTANCE.m3023SecondaryIndicator9IZ8Weo(TabRowDefaults.INSTANCE.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54);
                                }
                                if (i7 == 0) {
                                    i8 = i4;
                                    modifier3 = modifier2;
                                    j3 = primaryContainerColor;
                                    j4 = primaryContentColor;
                                    f2 = fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                    function2M2422getLambda6$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m2422getLambda6$material3_release();
                                    function32 = function3RememberComposableLambda;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-497821003, i8, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:506)");
                                }
                                int i12 = i8 << 3;
                                m3030ScrollableTabRowWithSubcomposeImplqhFBPw4(i, function32, modifier3, j3, j4, f2, function2M2422getLambda6$material3_release, function22, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), composerStartRestartGroup, (i12 & 896) | (i8 & 14) | ((i8 >> 12) & LDSFile.EF_DG16_TAG) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i8) | (i8 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function23 = function2M2422getLambda6$material3_release;
                                function33 = function32;
                            }
                            i8 = i4;
                            modifier3 = modifier2;
                            j3 = primaryContainerColor;
                            j4 = primaryContentColor;
                            f2 = fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                            function32 = function3RememberComposableLambda;
                            function2M2422getLambda6$material3_release = function2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i122 = i8 << 3;
                            m3030ScrollableTabRowWithSubcomposeImplqhFBPw4(i, function32, modifier3, j3, j4, f2, function2M2422getLambda6$material3_release, function22, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), composerStartRestartGroup, (i122 & 896) | (i8 & 14) | ((i8 >> 12) & LDSFile.EF_DG16_TAG) | (i122 & 7168) | (57344 & i122) | (458752 & i122) | (3670016 & i8) | (i8 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function23 = function2M2422getLambda6$material3_release;
                            function33 = function32;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            function23 = function2;
                            modifier3 = modifier2;
                            j3 = primaryContainerColor;
                            j4 = primaryContentColor;
                            f2 = fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                            function33 = function3RememberComposableLambda;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i13) {
                                    TabRowKt.m3028ScrollableTabRowsKfQg0A(i, modifier3, j3, j4, f2, function33, function23, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 12582912;
                    if ((i4 & 4793491) != 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) == 0) {
                            if (i9 != 0) {
                            }
                            if ((i3 & 4) != 0) {
                            }
                            if ((i3 & 8) != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 == 0) {
                                i8 = i4;
                                modifier3 = modifier2;
                                j3 = primaryContainerColor;
                                j4 = primaryContentColor;
                                f2 = fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                function32 = function3RememberComposableLambda;
                                function2M2422getLambda6$material3_release = function2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i1222 = i8 << 3;
                            m3030ScrollableTabRowWithSubcomposeImplqhFBPw4(i, function32, modifier3, j3, j4, f2, function2M2422getLambda6$material3_release, function22, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), composerStartRestartGroup, (i1222 & 896) | (i8 & 14) | ((i8 >> 12) & LDSFile.EF_DG16_TAG) | (i1222 & 7168) | (57344 & i1222) | (458752 & i1222) | (3670016 & i8) | (i8 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function23 = function2M2422getLambda6$material3_release;
                            function33 = function32;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function3RememberComposableLambda = function3;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i3 & 128) != 0) {
                }
                if ((i4 & 4793491) != 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function3RememberComposableLambda = function3;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i4 & 4793491) != 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function3RememberComposableLambda = function3;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i4 & 4793491) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TabRowImpl-DTcfvLk, reason: not valid java name */
    public static final void m3034TabRowImplDTcfvLk(Modifier modifier, final long j, final long j2, final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        Modifier modifier2;
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1757425411);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TabRowImpl)P(4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)575@27973L4041,571@27843L4171:TabRow.kt#uh7d8r");
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i2 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1757425411, i2, -1, "androidx.compose.material3.TabRowImpl (TabRow.kt:570)");
            }
            int i3 = i2 << 3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m2978SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, j, j2, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-65106680, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1
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

                public final void invoke(Composer composer3, int i4) {
                    ComposerKt.sourceInformation(composer3, "C576@27995L1274,617@29457L21,619@29508L2500,611@29279L2729:TabRow.kt#uh7d8r");
                    if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-65106680, i4, -1, "androidx.compose.material3.TabRowImpl.<anonymous> (TabRow.kt:576)");
                        }
                        ComposerKt.sourceInformationMarkerStart(composer3, 1811397697, "CC(remember):TabRow.kt#9igjgp");
                        Object objRememberedValue = composer3.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new TabRowKt$TabRowImpl$1$scope$1$1();
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        final TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1 = (TabRowKt$TabRowImpl$1$scope$1$1) objRememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        final Function3<TabIndicatorScope, Composer, Integer, Unit> function32 = function3;
                        List listListOf = CollectionsKt.listOf((Object[]) new Function2[]{function22, function2, ComposableLambdaKt.rememberComposableLambda(1236693605, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i5) {
                                ComposerKt.sourceInformation(composer4, "C617@29465L11:TabRow.kt#uh7d8r");
                                if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1236693605, i5, -1, "androidx.compose.material3.TabRowImpl.<anonymous>.<anonymous> (TabRow.kt:617)");
                                }
                                function32.invoke(tabRowKt$TabRowImpl$1$scope$1$1, composer4, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54)});
                        ComposerKt.sourceInformationMarkerStart(composer3, 1811447339, "CC(remember):TabRow.kt#9igjgp");
                        MultiContentMeasurePolicy multiContentMeasurePolicyRememberedValue = composer3.rememberedValue();
                        if (multiContentMeasurePolicyRememberedValue == Composer.INSTANCE.getEmpty()) {
                            multiContentMeasurePolicyRememberedValue = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1
                                @Override // androidx.compose.p000ui.layout.MultiContentMeasurePolicy
                                /* renamed from: measure-3p2s80s */
                                public final MeasureResult mo1383measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j3) {
                                    MeasureScope measureScope2 = measureScope;
                                    List<? extends Measurable> list2 = list.get(0);
                                    List<? extends Measurable> list3 = list.get(1);
                                    int i5 = 2;
                                    List<? extends Measurable> list4 = list.get(2);
                                    int iM7008getMaxWidthimpl = Constraints.m7008getMaxWidthimpl(j3);
                                    int size = list2.size();
                                    final Ref.IntRef intRef = new Ref.IntRef();
                                    if (size > 0) {
                                        intRef.element = iM7008getMaxWidthimpl / size;
                                    }
                                    int iValueOf = 0;
                                    int size2 = list2.size();
                                    for (int i6 = 0; i6 < size2; i6++) {
                                        iValueOf = Integer.valueOf(Math.max(list2.get(i6).maxIntrinsicHeight(intRef.element), iValueOf.intValue()));
                                    }
                                    final int iIntValue = iValueOf.intValue();
                                    TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$12 = tabRowKt$TabRowImpl$1$scope$1$1;
                                    ArrayList arrayList = new ArrayList(size);
                                    int i7 = 0;
                                    while (i7 < size) {
                                        arrayList.add(new TabPosition(C1959Dp.m7055constructorimpl(measureScope2.mo1124toDpu2uoSUM(intRef.element) * i7), measureScope2.mo1124toDpu2uoSUM(intRef.element), ((C1959Dp) ComparisonsKt.maxOf(C1959Dp.m7053boximpl(C1959Dp.m7055constructorimpl(measureScope2.mo1124toDpu2uoSUM(Math.min(list2.get(i7).maxIntrinsicWidth(iIntValue), intRef.element)) - C1959Dp.m7055constructorimpl(TabKt.getHorizontalTextPadding() * i5))), C1959Dp.m7053boximpl(C1959Dp.m7055constructorimpl(24)))).m7069unboximpl(), null));
                                        i7++;
                                        measureScope2 = measureScope;
                                        i5 = 2;
                                    }
                                    tabRowKt$TabRowImpl$1$scope$1$12.setTabPositions(arrayList);
                                    ArrayList arrayList2 = new ArrayList(list2.size());
                                    int size3 = list2.size();
                                    for (int i8 = 0; i8 < size3; i8++) {
                                        Measurable measurable = list2.get(i8);
                                        int i9 = iIntValue;
                                        long jM6998copyZbe2FdA = Constraints.m6998copyZbe2FdA(j3, intRef.element, intRef.element, i9, iIntValue);
                                        iIntValue = i9;
                                        arrayList2.add(measurable.mo5931measureBRTryo0(jM6998copyZbe2FdA));
                                    }
                                    final ArrayList arrayList3 = arrayList2;
                                    ArrayList arrayList4 = new ArrayList(list3.size());
                                    int size4 = list3.size();
                                    for (int i10 = 0; i10 < size4; i10++) {
                                        arrayList4.add(list3.get(i10).mo5931measureBRTryo0(Constraints.m6999copyZbe2FdA$default(j3, 0, 0, 0, 0, 11, null)));
                                    }
                                    final ArrayList arrayList5 = arrayList4;
                                    ArrayList arrayList6 = new ArrayList(list4.size());
                                    int size5 = list4.size();
                                    int i11 = 0;
                                    while (i11 < size5) {
                                        int i12 = iIntValue;
                                        iIntValue = i12;
                                        arrayList6.add(list4.get(i11).mo5931measureBRTryo0(Constraints.m6998copyZbe2FdA(j3, intRef.element, intRef.element, 0, i12)));
                                        i11++;
                                        list4 = list4;
                                        arrayList6 = arrayList6;
                                    }
                                    final ArrayList arrayList7 = arrayList6;
                                    return MeasureScope.layout$default(measureScope, iM7008getMaxWidthimpl, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                            invoke2(placementScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Placeable.PlacementScope placementScope) {
                                            List<Placeable> list5 = arrayList3;
                                            Ref.IntRef intRef2 = intRef;
                                            int size6 = list5.size();
                                            for (int i13 = 0; i13 < size6; i13++) {
                                                Placeable.PlacementScope.placeRelative$default(placementScope, list5.get(i13), i13 * intRef2.element, 0, 0.0f, 4, null);
                                            }
                                            List<Placeable> list6 = arrayList5;
                                            int i14 = iIntValue;
                                            int size7 = list6.size();
                                            for (int i15 = 0; i15 < size7; i15++) {
                                                Placeable placeable = list6.get(i15);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i14 - placeable.getHeight(), 0.0f, 4, null);
                                            }
                                            List<Placeable> list7 = arrayList7;
                                            int i16 = iIntValue;
                                            int size8 = list7.size();
                                            for (int i17 = 0; i17 < size8; i17++) {
                                                Placeable placeable2 = list7.get(i17);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, 0, i16 - placeable2.getHeight(), 0.0f, 4, null);
                                            }
                                        }
                                    }, 4, null);
                                }
                            };
                            composer3.updateRememberedValue(multiContentMeasurePolicyRememberedValue);
                        }
                        MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) multiContentMeasurePolicyRememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerStart(composer3, 1399185516, "CC(Layout)P(!1,2)173@6976L62,170@6862L182:Layout.kt#80mrfh");
                        Function2<Composer, Integer, Unit> function2CombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listListOf);
                        ComposerKt.sourceInformationMarkerStart(composer3, -290761997, "CC(remember):Layout.kt#9igjgp");
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default);
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
                        Updater.m4095setimpl(composerM4088constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        function2CombineAsVirtualLayouts.invoke(composer3, 0);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
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
            }, composerStartRestartGroup, 54), composer2, (i3 & 896) | 12582912 | (i3 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$2
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

                public final void invoke(Composer composer3, int i4) {
                    TabRowKt.m3034TabRowImplDTcfvLk(modifier3, j, j2, function3, function2, function22, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ScrollableTabRowImpl-sKfQg0A, reason: not valid java name */
    public static final void m3029ScrollableTabRowImplsKfQg0A(final int i, final Modifier modifier, final long j, final long j2, final float f, final ScrollState scrollState, final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2) {
        int i3;
        float f2;
        ScrollState scrollState2;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function32;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1594140035);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScrollableTabRowImpl)P(7,5,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,6,4)709@32727L5081,699@32393L5415:TabRow.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            f2 = f;
            i3 |= composerStartRestartGroup.changed(f2) ? 16384 : 8192;
        } else {
            f2 = f;
        }
        if ((196608 & i2) == 0) {
            scrollState2 = scrollState;
            i3 |= composerStartRestartGroup.changed(scrollState2) ? 131072 : 65536;
        } else {
            scrollState2 = scrollState;
        }
        if ((1572864 & i2) == 0) {
            function32 = function3;
            i3 |= composerStartRestartGroup.changedInstance(function32) ? 1048576 : 524288;
        } else {
            function32 = function3;
        }
        if ((i2 & 12582912) == 0) {
            function23 = function2;
            i3 |= composerStartRestartGroup.changedInstance(function23) ? 8388608 : 4194304;
        } else {
            function23 = function2;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i3 & 38347923) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1594140035, i3, -1, "androidx.compose.material3.ScrollableTabRowImpl (TabRow.kt:698)");
            }
            Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollState2, false, null, false, 14, null)));
            final Function2<? super Composer, ? super Integer, Unit> function24 = function23;
            final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function33 = function32;
            final float f3 = f2;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m2978SurfaceT9BRK9s(modifierClipToBounds, null, j, j2, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1556158104, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1
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

                public final void invoke(Composer composer3, int i4) {
                    ComposerKt.sourceInformation(composer3, "C710@32758L24,712@32827L147,716@32996L1274,756@34410L21,758@34461L3341,751@34280L3522:TabRow.kt#uh7d8r");
                    if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1556158104, i4, -1, "androidx.compose.material3.ScrollableTabRowImpl.<anonymous> (TabRow.kt:710)");
                        }
                        ComposerKt.sourceInformationMarkerStart(composer3, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                        ComposerKt.sourceInformationMarkerStart(composer3, -954363344, "CC(remember):Effects.kt#9igjgp");
                        Object objRememberedValue = composer3.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                            composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerStart(composer3, 413417697, "CC(remember):TabRow.kt#9igjgp");
                        boolean zChanged = composer3.changed(scrollState) | composer3.changed(coroutineScope);
                        ScrollState scrollState3 = scrollState;
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new ScrollableTabData(scrollState3, coroutineScope);
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerStart(composer3, 413424232, "CC(remember):TabRow.kt#9igjgp");
                        Object objRememberedValue3 = composer3.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new TabRowKt$ScrollableTabRowImpl$1$scope$1$1();
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        final TabRowKt$ScrollableTabRowImpl$1$scope$1$1 tabRowKt$ScrollableTabRowImpl$1$scope$1$1 = (TabRowKt$ScrollableTabRowImpl$1$scope$1$1) objRememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        final Function3<TabIndicatorScope, Composer, Integer, Unit> function34 = function33;
                        List listListOf = CollectionsKt.listOf((Object[]) new Function2[]{function22, function24, ComposableLambdaKt.rememberComposableLambda(-1530560661, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i5) {
                                ComposerKt.sourceInformation(composer4, "C756@34418L11:TabRow.kt#uh7d8r");
                                if ((i5 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1530560661, i5, -1, "androidx.compose.material3.ScrollableTabRowImpl.<anonymous>.<anonymous> (TabRow.kt:756)");
                                }
                                function34.invoke(tabRowKt$ScrollableTabRowImpl$1$scope$1$1, composer4, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54)});
                        ComposerKt.sourceInformationMarkerStart(composer3, 413473179, "CC(remember):TabRow.kt#9igjgp");
                        boolean zChanged2 = composer3.changed(f3) | composer3.changed(i) | composer3.changedInstance(scrollableTabData);
                        final float f4 = f3;
                        final int i5 = i;
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = (MultiContentMeasurePolicy) new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$2$1
                                @Override // androidx.compose.p000ui.layout.MultiContentMeasurePolicy
                                /* renamed from: measure-3p2s80s */
                                public final MeasureResult mo1383measure3p2s80s(final MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j3) {
                                    MeasureScope measureScope2 = measureScope;
                                    List<? extends Measurable> list2 = list.get(0);
                                    List<? extends Measurable> list3 = list.get(1);
                                    List<? extends Measurable> list4 = list.get(2);
                                    final int i6 = measureScope2.mo1121roundToPx0680j_4(f4);
                                    int size = list2.size();
                                    int i7 = measureScope2.mo1121roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                    int iValueOf = 0;
                                    int size2 = list2.size();
                                    for (int i8 = 0; i8 < size2; i8++) {
                                        iValueOf = Integer.valueOf(Math.max(iValueOf.intValue(), list2.get(i8).maxIntrinsicHeight(Integer.MAX_VALUE)));
                                    }
                                    int iIntValue = iValueOf.intValue();
                                    int i9 = i6 * 2;
                                    long jM6999copyZbe2FdA$default = Constraints.m6999copyZbe2FdA$default(j3, i7, 0, iIntValue, iIntValue, 2, null);
                                    final Ref.FloatRef floatRef = new Ref.FloatRef();
                                    floatRef.element = f4;
                                    ArrayList arrayList = new ArrayList(list2.size());
                                    int size3 = list2.size();
                                    for (int i10 = 0; i10 < size3; i10++) {
                                        arrayList.add(list2.get(i10).mo5931measureBRTryo0(jM6999copyZbe2FdA$default));
                                    }
                                    ArrayList arrayList2 = arrayList;
                                    ArrayList arrayList3 = new ArrayList(size);
                                    int i11 = 0;
                                    while (i11 < size) {
                                        float fM7069unboximpl = ((C1959Dp) ComparisonsKt.maxOf(C1959Dp.m7053boximpl(TabRowKt.ScrollableTabRowMinimumTabWidth), C1959Dp.m7053boximpl(measureScope2.mo1124toDpu2uoSUM(((Placeable) arrayList2.get(i11)).getWidth())))).m7069unboximpl();
                                        i9 += measureScope2.mo1121roundToPx0680j_4(fM7069unboximpl);
                                        TabPosition tabPosition = new TabPosition(floatRef.element, fM7069unboximpl, ((C1959Dp) ComparisonsKt.maxOf(C1959Dp.m7053boximpl(C1959Dp.m7055constructorimpl(fM7069unboximpl - C1959Dp.m7055constructorimpl(TabKt.getHorizontalTextPadding() * 2))), C1959Dp.m7053boximpl(C1959Dp.m7055constructorimpl(24)))).m7069unboximpl(), null);
                                        floatRef.element = C1959Dp.m7055constructorimpl(floatRef.element + fM7069unboximpl);
                                        arrayList3.add(tabPosition);
                                        i11++;
                                        arrayList2 = arrayList2;
                                    }
                                    final ArrayList arrayList4 = arrayList2;
                                    final ArrayList arrayList5 = arrayList3;
                                    tabRowKt$ScrollableTabRowImpl$1$scope$1$1.setTabPositions(arrayList5);
                                    ArrayList arrayList6 = new ArrayList(list3.size());
                                    int size4 = list3.size();
                                    int i12 = 0;
                                    while (i12 < size4) {
                                        int i13 = i9;
                                        arrayList6.add(list3.get(i12).mo5931measureBRTryo0(Constraints.m6999copyZbe2FdA$default(j3, i13, i9, 0, 0, 8, null)));
                                        i12++;
                                        list3 = list3;
                                        arrayList6 = arrayList6;
                                        i9 = i13;
                                    }
                                    int i14 = i9;
                                    final ArrayList arrayList7 = arrayList6;
                                    int i15 = i5;
                                    ArrayList arrayList8 = new ArrayList(list4.size());
                                    int size5 = list4.size();
                                    int i16 = 0;
                                    while (i16 < size5) {
                                        int i17 = iIntValue;
                                        iIntValue = i17;
                                        arrayList8.add(list4.get(i16).mo5931measureBRTryo0(Constraints.m6998copyZbe2FdA(j3, 0, measureScope2.mo1121roundToPx0680j_4(((TabPosition) arrayList5.get(i15)).getWidth()), 0, i17)));
                                        i16++;
                                        measureScope2 = measureScope;
                                        list4 = list4;
                                    }
                                    final ArrayList arrayList9 = arrayList8;
                                    final float f5 = f4;
                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                    final int i18 = i5;
                                    final int i19 = iIntValue;
                                    return MeasureScope.layout$default(measureScope, i14, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$2$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                            invoke2(placementScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Placeable.PlacementScope placementScope) {
                                            floatRef.element = f5;
                                            List<Placeable> list5 = arrayList4;
                                            MeasureScope measureScope3 = measureScope;
                                            Ref.FloatRef floatRef2 = floatRef;
                                            List<TabPosition> list6 = arrayList5;
                                            int size6 = list5.size();
                                            for (int i20 = 0; i20 < size6; i20++) {
                                                Placeable.PlacementScope.placeRelative$default(placementScope, list5.get(i20), measureScope3.mo1121roundToPx0680j_4(floatRef2.element), 0, 0.0f, 4, null);
                                                floatRef2.element = C1959Dp.m7055constructorimpl(floatRef2.element + list6.get(i20).getWidth());
                                            }
                                            List<Placeable> list7 = arrayList7;
                                            int i21 = i19;
                                            int size7 = list7.size();
                                            for (int i22 = 0; i22 < size7; i22++) {
                                                Placeable placeable = list7.get(i22);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i21 - placeable.getHeight(), 0.0f, 4, null);
                                            }
                                            List<Placeable> list8 = arrayList9;
                                            MeasureScope measureScope4 = measureScope;
                                            List<TabPosition> list9 = arrayList5;
                                            int i23 = i18;
                                            int i24 = i19;
                                            int size8 = list8.size();
                                            for (int i25 = 0; i25 < size8; i25++) {
                                                Placeable placeable2 = list8.get(i25);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, Math.max(0, (measureScope4.mo1121roundToPx0680j_4(list9.get(i23).getWidth()) - placeable2.getWidth()) / 2), i24 - placeable2.getHeight(), 0.0f, 4, null);
                                            }
                                            scrollableTabData2.onLaidOut(measureScope, i6, arrayList5, i18);
                                        }
                                    }, 4, null);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) objRememberedValue4;
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerStart(composer3, 1399185516, "CC(Layout)P(!1,2)173@6976L62,170@6862L182:Layout.kt#80mrfh");
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Function2<Composer, Integer, Unit> function2CombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listListOf);
                        ComposerKt.sourceInformationMarkerStart(composer3, -290761997, "CC(remember):Layout.kt#9igjgp");
                        boolean zChanged3 = composer3.changed(multiContentMeasurePolicy);
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue5;
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, companion);
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
                        Updater.m4095setimpl(composerM4088constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        function2CombineAsVirtualLayouts.invoke(composer3, 0);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
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
            }, composerStartRestartGroup, 54), composer2, (i3 & 896) | 12582912 | (i3 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$2
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

                public final void invoke(Composer composer3, int i4) {
                    TabRowKt.m3029ScrollableTabRowImplsKfQg0A(i, modifier, j, j2, f, scrollState, function3, function2, function22, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TabRowWithSubcomposeImpl-DTcfvLk, reason: not valid java name */
    public static final void m3035TabRowWithSubcomposeImplDTcfvLk(Modifier modifier, final long j, final long j2, final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        Modifier modifier2;
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-160898917);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TabRowWithSubcomposeImpl)P(4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)947@41323L2218,943@41193L2348:TabRow.kt#uh7d8r");
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i2 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-160898917, i2, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl (TabRow.kt:942)");
            }
            int i3 = i2 << 3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m2978SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, j, j2, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1617702432, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1
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

                public final void invoke(Composer composer3, int i4) {
                    ComposerKt.sourceInformation(composer3, "C948@41375L2160,948@41333L2202:TabRow.kt#uh7d8r");
                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1617702432, i4, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:948)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1807613681, "CC(remember):TabRow.kt#9igjgp");
                    boolean zChanged = composer3.changed(function22) | composer3.changed(function2) | composer3.changed(function3);
                    final Function2<Composer, Integer, Unit> function23 = function22;
                    final Function2<Composer, Integer, Unit> function24 = function2;
                    final Function3<List<TabPosition>, Composer, Integer, Unit> function32 = function3;
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m3043invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m3043invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j3) {
                                int iM7008getMaxWidthimpl = Constraints.m7008getMaxWidthimpl(j3);
                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function23);
                                int size = listSubcompose.size();
                                final Ref.IntRef intRef = new Ref.IntRef();
                                if (size > 0) {
                                    intRef.element = iM7008getMaxWidthimpl / size;
                                }
                                int iValueOf = 0;
                                int size2 = listSubcompose.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    iValueOf = Integer.valueOf(Math.max(listSubcompose.get(i5).maxIntrinsicHeight(intRef.element), iValueOf.intValue()));
                                }
                                final int iIntValue = iValueOf.intValue();
                                ArrayList arrayList = new ArrayList(listSubcompose.size());
                                int size3 = listSubcompose.size();
                                int i6 = 0;
                                while (i6 < size3) {
                                    arrayList.add(listSubcompose.get(i6).mo5931measureBRTryo0(Constraints.m6998copyZbe2FdA(j3, intRef.element, intRef.element, iIntValue, iIntValue)));
                                    i6++;
                                    iM7008getMaxWidthimpl = iM7008getMaxWidthimpl;
                                }
                                final int i7 = iM7008getMaxWidthimpl;
                                final ArrayList arrayList2 = arrayList;
                                ArrayList arrayList3 = new ArrayList(size);
                                for (int i8 = 0; i8 < size; i8++) {
                                    arrayList3.add(new TabPosition(C1959Dp.m7055constructorimpl(subcomposeMeasureScope.mo1124toDpu2uoSUM(intRef.element) * i8), subcomposeMeasureScope.mo1124toDpu2uoSUM(intRef.element), ((C1959Dp) ComparisonsKt.maxOf(C1959Dp.m7053boximpl(C1959Dp.m7055constructorimpl(subcomposeMeasureScope.mo1124toDpu2uoSUM(Math.min(listSubcompose.get(i8).maxIntrinsicWidth(iIntValue), intRef.element)) - C1959Dp.m7055constructorimpl(TabKt.getHorizontalTextPadding() * 2))), C1959Dp.m7053boximpl(C1959Dp.m7055constructorimpl(24)))).m7069unboximpl(), null));
                                }
                                final ArrayList arrayList4 = arrayList3;
                                final Function2<Composer, Integer, Unit> function25 = function24;
                                final Function3<List<TabPosition>, Composer, Integer, Unit> function33 = function32;
                                return MeasureScope.layout$default(subcomposeMeasureScope, i7, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                        List<Placeable> list = arrayList2;
                                        Ref.IntRef intRef2 = intRef;
                                        int size4 = list.size();
                                        for (int i9 = 0; i9 < size4; i9++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i9), i9 * intRef2.element, 0, 0.0f, 4, null);
                                        }
                                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function25);
                                        long j4 = j3;
                                        int i10 = iIntValue;
                                        int size5 = listSubcompose2.size();
                                        for (int i11 = 0; i11 < size5; i11++) {
                                            Placeable placeableMo5931measureBRTryo0 = listSubcompose2.get(i11).mo5931measureBRTryo0(Constraints.m6999copyZbe2FdA$default(j4, 0, 0, 0, 0, 11, null));
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5931measureBRTryo0, 0, i10 - placeableMo5931measureBRTryo0.getHeight(), 0.0f, 4, null);
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<List<TabPosition>, Composer, Integer, Unit> function34 = function33;
                                        final List<TabPosition> list2 = arrayList4;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(1621992604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.TabRowWithSubcomposeImpl.1.1.1.1.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i12) {
                                                ComposerKt.sourceInformation(composer4, "C994@43328L23:TabRow.kt#uh7d8r");
                                                if ((i12 & 3) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1621992604, i12, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:994)");
                                                }
                                                function34.invoke(list2, composer4, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        int i12 = i7;
                                        int i13 = iIntValue;
                                        int size6 = listSubcompose3.size();
                                        for (int i14 = 0; i14 < size6; i14++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i14).mo5931measureBRTryo0(Constraints.INSTANCE.m7018fixedJhjzzOo(i12, i13)), 0, 0, 0.0f, 4, null);
                                        }
                                    }
                                }, 4, null);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer3, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, (i3 & 896) | 12582912 | (i3 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$2
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

                public final void invoke(Composer composer3, int i4) {
                    TabRowKt.m3035TabRowWithSubcomposeImplDTcfvLk(modifier3, j, j2, function3, function2, function22, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /* renamed from: ScrollableTabRowWithSubcomposeImpl-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3030ScrollableTabRowWithSubcomposeImplqhFBPw4(final int i, final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, long j, long j2, float f, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final ScrollState scrollState, Composer composer, final int i2, final int i3) {
        int i4;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        int i5;
        Modifier modifier2;
        long primaryContainerColor;
        long primaryContentColor;
        int i6;
        float fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function2M2423getLambda7$material3_release;
        Composer composer2;
        final float f2;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Modifier modifier3;
        final long j3;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-955409947);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScrollableTabRowWithSubcomposeImpl)P(7,4,5,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp!1,8)1008@43780L21,1009@43844L19,1015@44165L3880,1015@44083L3962:TabRow.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function32 = function3;
                i4 |= composerStartRestartGroup.changedInstance(function32) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        primaryContainerColor = j;
                        int i8 = composerStartRestartGroup.changed(primaryContainerColor) ? 2048 : 1024;
                        i4 |= i8;
                    } else {
                        primaryContainerColor = j;
                    }
                    i4 |= i8;
                } else {
                    primaryContainerColor = j;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        primaryContentColor = j2;
                        int i9 = composerStartRestartGroup.changed(primaryContentColor) ? 16384 : 8192;
                        i4 |= i9;
                    } else {
                        primaryContentColor = j2;
                    }
                    i4 |= i9;
                } else {
                    primaryContentColor = j2;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                } else {
                    if ((196608 & i2) == 0) {
                        fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
                        i4 |= composerStartRestartGroup.changed(fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM) ? 131072 : 65536;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) == 0) {
                        i4 |= 12582912;
                    } else {
                        if ((i2 & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        }
                        if ((i3 & 256) == 0) {
                            if ((i2 & 100663296) == 0) {
                                i4 |= composerStartRestartGroup.changed(scrollState) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            if ((i4 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i2 & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 8) != 0) {
                                        i4 &= -7169;
                                    }
                                    if ((i3 & 16) != 0) {
                                        i4 &= -57345;
                                    }
                                } else {
                                    if (i5 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if ((i3 & 8) != 0) {
                                        primaryContainerColor = TabRowDefaults.INSTANCE.getPrimaryContainerColor(composerStartRestartGroup, 6);
                                        i4 &= -7169;
                                    }
                                    if ((i3 & 16) != 0) {
                                        primaryContentColor = TabRowDefaults.INSTANCE.getPrimaryContentColor(composerStartRestartGroup, 6);
                                        i4 &= -57345;
                                    }
                                    if (i6 != 0) {
                                        fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m3024getScrollableTabRowEdgeStartPaddingD9Ej5fM();
                                    }
                                    if (i7 == 0) {
                                        function2M2423getLambda7$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m2423getLambda7$material3_release();
                                    }
                                    long j5 = primaryContentColor;
                                    final float f3 = fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                    Modifier modifier4 = modifier2;
                                    long j6 = primaryContainerColor;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-955409947, i4, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl (TabRow.kt:1014)");
                                    }
                                    final Function2<? super Composer, ? super Integer, Unit> function24 = function2M2423getLambda7$material3_release;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33 = function32;
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1572959552, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1
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

                                        public final void invoke(Composer composer3, int i10) {
                                            ComposerKt.sourceInformation(composer3, "C1016@44196L24,1018@44265L147,1027@44663L3376,1021@44421L3618:TabRow.kt#uh7d8r");
                                            if ((i10 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1572959552, i10, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:1016)");
                                                }
                                                ComposerKt.sourceInformationMarkerStart(composer3, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                                                ComposerKt.sourceInformationMarkerStart(composer3, -954363344, "CC(remember):Effects.kt#9igjgp");
                                                Object objRememberedValue = composer3.rememberedValue();
                                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                                                    composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                                    objRememberedValue = compositionScopedCoroutineScopeCanceller;
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ComposerKt.sourceInformationMarkerStart(composer3, -702892231, "CC(remember):TabRow.kt#9igjgp");
                                                boolean zChanged = composer3.changed(scrollState) | composer3.changed(coroutineScope);
                                                ScrollState scrollState2 = scrollState;
                                                Object objRememberedValue2 = composer3.rememberedValue();
                                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue2 = new ScrollableTabData(scrollState2, coroutineScope);
                                                    composer3.updateRememberedValue(objRememberedValue2);
                                                }
                                                final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollState, false, null, false, 14, null)));
                                                ComposerKt.sourceInformationMarkerStart(composer3, -702876266, "CC(remember):TabRow.kt#9igjgp");
                                                boolean zChanged2 = composer3.changed(f3) | composer3.changed(function22) | composer3.changed(function24) | composer3.changed(function33) | composer3.changedInstance(scrollableTabData) | composer3.changed(i);
                                                final float f4 = f3;
                                                final Function2<Composer, Integer, Unit> function25 = function22;
                                                final Function2<Composer, Integer, Unit> function26 = function24;
                                                final int i11 = i;
                                                final Function3<List<TabPosition>, Composer, Integer, Unit> function34 = function33;
                                                Object objRememberedValue3 = composer3.rememberedValue();
                                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue3 = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                            return m3041invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                                        }

                                                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                                        public final MeasureResult m3041invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j7) {
                                                            int i12 = subcomposeMeasureScope.mo1121roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                                            final int i13 = subcomposeMeasureScope.mo1121roundToPx0680j_4(f4);
                                                            List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function25);
                                                            int iValueOf = 0;
                                                            int size = listSubcompose.size();
                                                            for (int i14 = 0; i14 < size; i14++) {
                                                                iValueOf = Integer.valueOf(Math.max(iValueOf.intValue(), listSubcompose.get(i14).maxIntrinsicHeight(Integer.MAX_VALUE)));
                                                            }
                                                            final int iIntValue = iValueOf.intValue();
                                                            long jM6999copyZbe2FdA$default = Constraints.m6999copyZbe2FdA$default(j7, i12, 0, iIntValue, iIntValue, 2, null);
                                                            final ArrayList arrayList = new ArrayList();
                                                            final ArrayList arrayList2 = new ArrayList();
                                                            int size2 = listSubcompose.size();
                                                            for (int i15 = 0; i15 < size2; i15++) {
                                                                Measurable measurable = listSubcompose.get(i15);
                                                                Placeable placeableMo5931measureBRTryo0 = measurable.mo5931measureBRTryo0(jM6999copyZbe2FdA$default);
                                                                float fM7055constructorimpl = C1959Dp.m7055constructorimpl(subcomposeMeasureScope.mo1124toDpu2uoSUM(Math.min(measurable.maxIntrinsicWidth(placeableMo5931measureBRTryo0.getHeight()), placeableMo5931measureBRTryo0.getWidth())) - C1959Dp.m7055constructorimpl(TabKt.getHorizontalTextPadding() * 2));
                                                                arrayList.add(placeableMo5931measureBRTryo0);
                                                                arrayList2.add(C1959Dp.m7053boximpl(fM7055constructorimpl));
                                                            }
                                                            Integer numValueOf = Integer.valueOf(i13 * 2);
                                                            int size3 = arrayList.size();
                                                            for (int i16 = 0; i16 < size3; i16++) {
                                                                numValueOf = Integer.valueOf(numValueOf.intValue() + ((Placeable) arrayList.get(i16)).getWidth());
                                                            }
                                                            final int iIntValue2 = numValueOf.intValue();
                                                            final Function2<Composer, Integer, Unit> function27 = function26;
                                                            final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                            final int i17 = i11;
                                                            final Function3<List<TabPosition>, Composer, Integer, Unit> function35 = function34;
                                                            return MeasureScope.layout$default(subcomposeMeasureScope, iIntValue2, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1.2
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                    invoke2(placementScope);
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                    final ArrayList arrayList3 = new ArrayList();
                                                                    int i18 = i13;
                                                                    List<Placeable> list = arrayList;
                                                                    SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                                    List<C1959Dp> list2 = arrayList2;
                                                                    int size4 = list.size();
                                                                    int width = i18;
                                                                    for (int i19 = 0; i19 < size4; i19++) {
                                                                        Placeable placeable = list.get(i19);
                                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width, 0, 0.0f, 4, null);
                                                                        arrayList3.add(new TabPosition(subcomposeMeasureScope2.mo1124toDpu2uoSUM(width), subcomposeMeasureScope2.mo1124toDpu2uoSUM(placeable.getWidth()), list2.get(i19).m7069unboximpl(), null));
                                                                        width += placeable.getWidth();
                                                                    }
                                                                    List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                                    long j8 = j7;
                                                                    int i20 = iIntValue2;
                                                                    int i21 = iIntValue;
                                                                    int size5 = listSubcompose2.size();
                                                                    for (int i22 = 0; i22 < size5; i22++) {
                                                                        Placeable placeableMo5931measureBRTryo02 = listSubcompose2.get(i22).mo5931measureBRTryo0(Constraints.m6999copyZbe2FdA$default(j8, i20, i20, 0, 0, 8, null));
                                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5931measureBRTryo02, 0, i21 - placeableMo5931measureBRTryo02.getHeight(), 0.0f, 4, null);
                                                                    }
                                                                    SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                                    TabSlots tabSlots = TabSlots.Indicator;
                                                                    final Function3<List<TabPosition>, Composer, Integer, Unit> function36 = function35;
                                                                    List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(1734082948, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRowWithSubcomposeImpl.1.1.1.2.3
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        /* JADX WARN: Multi-variable type inference failed */
                                                                        {
                                                                            super(2);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                            invoke(composer4, num.intValue());
                                                                            return Unit.INSTANCE;
                                                                        }

                                                                        public final void invoke(Composer composer4, int i23) {
                                                                            ComposerKt.sourceInformation(composer4, "C1094@47573L23:TabRow.kt#uh7d8r");
                                                                            if ((i23 & 3) == 2 && composer4.getSkipping()) {
                                                                                composer4.skipToGroupEnd();
                                                                                return;
                                                                            }
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventStart(1734082948, i23, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:1094)");
                                                                            }
                                                                            function36.invoke(arrayList3, composer4, 0);
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventEnd();
                                                                            }
                                                                        }
                                                                    }));
                                                                    int i23 = iIntValue2;
                                                                    int i24 = iIntValue;
                                                                    int size6 = listSubcompose3.size();
                                                                    for (int i25 = 0; i25 < size6; i25++) {
                                                                        Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i25).mo5931measureBRTryo0(Constraints.INSTANCE.m7018fixedJhjzzOo(i23, i24)), 0, 0, 0.0f, 4, null);
                                                                    }
                                                                    scrollableTabData2.onLaidOut(subcomposeMeasureScope, i13, arrayList3, i17);
                                                                }
                                                            }, 4, null);
                                                        }
                                                    };
                                                    composer3.updateRememberedValue(objRememberedValue3);
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, (Function2) objRememberedValue3, composer3, 0, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }, composerStartRestartGroup, 54);
                                    int i10 = ((i4 >> 6) & 14) | 12582912;
                                    int i11 = i4 >> 3;
                                    composer2 = composerStartRestartGroup;
                                    SurfaceKt.m2978SurfaceT9BRK9s(modifier4, null, j6, j5, 0.0f, 0.0f, null, composableLambdaRememberComposableLambda, composer2, i10 | (i11 & 896) | (i11 & 7168), 114);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    f2 = f3;
                                    function23 = function24;
                                    modifier3 = modifier4;
                                    j3 = j6;
                                    j4 = j5;
                                }
                                function2M2423getLambda7$material3_release = function2;
                                long j52 = primaryContentColor;
                                final float f32 = fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                Modifier modifier42 = modifier2;
                                long j62 = primaryContainerColor;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                final Function2<? super Composer, ? super Integer, Unit> function242 = function2M2423getLambda7$material3_release;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function332 = function32;
                                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1572959552, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1
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

                                    public final void invoke(Composer composer3, int i102) {
                                        ComposerKt.sourceInformation(composer3, "C1016@44196L24,1018@44265L147,1027@44663L3376,1021@44421L3618:TabRow.kt#uh7d8r");
                                        if ((i102 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1572959552, i102, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:1016)");
                                            }
                                            ComposerKt.sourceInformationMarkerStart(composer3, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                                            ComposerKt.sourceInformationMarkerStart(composer3, -954363344, "CC(remember):Effects.kt#9igjgp");
                                            Object objRememberedValue = composer3.rememberedValue();
                                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                                                composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                                objRememberedValue = compositionScopedCoroutineScopeCanceller;
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerStart(composer3, -702892231, "CC(remember):TabRow.kt#9igjgp");
                                            boolean zChanged = composer3.changed(scrollState) | composer3.changed(coroutineScope);
                                            ScrollState scrollState2 = scrollState;
                                            Object objRememberedValue2 = composer3.rememberedValue();
                                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = new ScrollableTabData(scrollState2, coroutineScope);
                                                composer3.updateRememberedValue(objRememberedValue2);
                                            }
                                            final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollState, false, null, false, 14, null)));
                                            ComposerKt.sourceInformationMarkerStart(composer3, -702876266, "CC(remember):TabRow.kt#9igjgp");
                                            boolean zChanged2 = composer3.changed(f32) | composer3.changed(function22) | composer3.changed(function242) | composer3.changed(function332) | composer3.changedInstance(scrollableTabData) | composer3.changed(i);
                                            final float f4 = f32;
                                            final Function2<? super Composer, ? super Integer, Unit> function25 = function22;
                                            final Function2<? super Composer, ? super Integer, Unit> function26 = function242;
                                            final int i112 = i;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function332;
                                            Object objRememberedValue3 = composer3.rememberedValue();
                                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue3 = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                        return m3041invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                                    }

                                                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                                    public final MeasureResult m3041invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j7) {
                                                        int i12 = subcomposeMeasureScope.mo1121roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                                        final int i13 = subcomposeMeasureScope.mo1121roundToPx0680j_4(f4);
                                                        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function25);
                                                        int iValueOf = 0;
                                                        int size = listSubcompose.size();
                                                        for (int i14 = 0; i14 < size; i14++) {
                                                            iValueOf = Integer.valueOf(Math.max(iValueOf.intValue(), listSubcompose.get(i14).maxIntrinsicHeight(Integer.MAX_VALUE)));
                                                        }
                                                        final int iIntValue = iValueOf.intValue();
                                                        long jM6999copyZbe2FdA$default = Constraints.m6999copyZbe2FdA$default(j7, i12, 0, iIntValue, iIntValue, 2, null);
                                                        final List<Placeable> arrayList = new ArrayList();
                                                        final List<C1959Dp> arrayList2 = new ArrayList();
                                                        int size2 = listSubcompose.size();
                                                        for (int i15 = 0; i15 < size2; i15++) {
                                                            Measurable measurable = listSubcompose.get(i15);
                                                            Placeable placeableMo5931measureBRTryo0 = measurable.mo5931measureBRTryo0(jM6999copyZbe2FdA$default);
                                                            float fM7055constructorimpl = C1959Dp.m7055constructorimpl(subcomposeMeasureScope.mo1124toDpu2uoSUM(Math.min(measurable.maxIntrinsicWidth(placeableMo5931measureBRTryo0.getHeight()), placeableMo5931measureBRTryo0.getWidth())) - C1959Dp.m7055constructorimpl(TabKt.getHorizontalTextPadding() * 2));
                                                            arrayList.add(placeableMo5931measureBRTryo0);
                                                            arrayList2.add(C1959Dp.m7053boximpl(fM7055constructorimpl));
                                                        }
                                                        Integer numValueOf = Integer.valueOf(i13 * 2);
                                                        int size3 = arrayList.size();
                                                        for (int i16 = 0; i16 < size3; i16++) {
                                                            numValueOf = Integer.valueOf(numValueOf.intValue() + ((Placeable) arrayList.get(i16)).getWidth());
                                                        }
                                                        final int iIntValue2 = numValueOf.intValue();
                                                        final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                                        final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                        final int i17 = i112;
                                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function35 = function34;
                                                        return MeasureScope.layout$default(subcomposeMeasureScope, iIntValue2, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1.2
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                invoke2(placementScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                final List<TabPosition> arrayList3 = new ArrayList();
                                                                int i18 = i13;
                                                                List<Placeable> list = arrayList;
                                                                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                                List<C1959Dp> list2 = arrayList2;
                                                                int size4 = list.size();
                                                                int width = i18;
                                                                for (int i19 = 0; i19 < size4; i19++) {
                                                                    Placeable placeable = list.get(i19);
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width, 0, 0.0f, 4, null);
                                                                    arrayList3.add(new TabPosition(subcomposeMeasureScope2.mo1124toDpu2uoSUM(width), subcomposeMeasureScope2.mo1124toDpu2uoSUM(placeable.getWidth()), list2.get(i19).m7069unboximpl(), null));
                                                                    width += placeable.getWidth();
                                                                }
                                                                List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                                long j8 = j7;
                                                                int i20 = iIntValue2;
                                                                int i21 = iIntValue;
                                                                int size5 = listSubcompose2.size();
                                                                for (int i22 = 0; i22 < size5; i22++) {
                                                                    Placeable placeableMo5931measureBRTryo02 = listSubcompose2.get(i22).mo5931measureBRTryo0(Constraints.m6999copyZbe2FdA$default(j8, i20, i20, 0, 0, 8, null));
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5931measureBRTryo02, 0, i21 - placeableMo5931measureBRTryo02.getHeight(), 0.0f, 4, null);
                                                                }
                                                                SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                                TabSlots tabSlots = TabSlots.Indicator;
                                                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function35;
                                                                List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(1734082948, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRowWithSubcomposeImpl.1.1.1.2.3
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                    {
                                                                        super(2);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                        invoke(composer4, num.intValue());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    public final void invoke(Composer composer4, int i23) {
                                                                        ComposerKt.sourceInformation(composer4, "C1094@47573L23:TabRow.kt#uh7d8r");
                                                                        if ((i23 & 3) == 2 && composer4.getSkipping()) {
                                                                            composer4.skipToGroupEnd();
                                                                            return;
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(1734082948, i23, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:1094)");
                                                                        }
                                                                        function36.invoke(arrayList3, composer4, 0);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                        }
                                                                    }
                                                                }));
                                                                int i23 = iIntValue2;
                                                                int i24 = iIntValue;
                                                                int size6 = listSubcompose3.size();
                                                                for (int i25 = 0; i25 < size6; i25++) {
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i25).mo5931measureBRTryo0(Constraints.INSTANCE.m7018fixedJhjzzOo(i23, i24)), 0, 0, 0.0f, 4, null);
                                                                }
                                                                scrollableTabData2.onLaidOut(subcomposeMeasureScope, i13, arrayList3, i17);
                                                            }
                                                        }, 4, null);
                                                    }
                                                };
                                                composer3.updateRememberedValue(objRememberedValue3);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, (Function2) objRememberedValue3, composer3, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composerStartRestartGroup, 54);
                                int i102 = ((i4 >> 6) & 14) | 12582912;
                                int i112 = i4 >> 3;
                                composer2 = composerStartRestartGroup;
                                SurfaceKt.m2978SurfaceT9BRK9s(modifier42, null, j62, j52, 0.0f, 0.0f, null, composableLambdaRememberComposableLambda2, composer2, i102 | (i112 & 896) | (i112 & 7168), 114);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                f2 = f32;
                                function23 = function242;
                                modifier3 = modifier42;
                                j3 = j62;
                                j4 = j52;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                composer2 = composerStartRestartGroup;
                                modifier3 = modifier2;
                                j3 = primaryContainerColor;
                                j4 = primaryContentColor;
                                f2 = fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                function23 = function2;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$2
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
                                        TabRowKt.m3030ScrollableTabRowWithSubcomposeImplqhFBPw4(i, function3, modifier3, j3, j4, f2, function23, function22, scrollState, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 100663296;
                        if ((i4 & 38347923) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) == 0) {
                                if (i5 != 0) {
                                }
                                if ((i3 & 8) != 0) {
                                }
                                if ((i3 & 16) != 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i7 == 0) {
                                    function2M2423getLambda7$material3_release = function2;
                                }
                                long j522 = primaryContentColor;
                                final float f322 = fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                Modifier modifier422 = modifier2;
                                long j622 = primaryContainerColor;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                final Function2<? super Composer, ? super Integer, Unit> function2422 = function2M2423getLambda7$material3_release;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3322 = function32;
                                ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambdaKt.rememberComposableLambda(-1572959552, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1
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

                                    public final void invoke(Composer composer3, int i1022) {
                                        ComposerKt.sourceInformation(composer3, "C1016@44196L24,1018@44265L147,1027@44663L3376,1021@44421L3618:TabRow.kt#uh7d8r");
                                        if ((i1022 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1572959552, i1022, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:1016)");
                                            }
                                            ComposerKt.sourceInformationMarkerStart(composer3, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                                            ComposerKt.sourceInformationMarkerStart(composer3, -954363344, "CC(remember):Effects.kt#9igjgp");
                                            Object objRememberedValue = composer3.rememberedValue();
                                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                                                composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                                objRememberedValue = compositionScopedCoroutineScopeCanceller;
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerStart(composer3, -702892231, "CC(remember):TabRow.kt#9igjgp");
                                            boolean zChanged = composer3.changed(scrollState) | composer3.changed(coroutineScope);
                                            ScrollState scrollState2 = scrollState;
                                            Object objRememberedValue2 = composer3.rememberedValue();
                                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = new ScrollableTabData(scrollState2, coroutineScope);
                                                composer3.updateRememberedValue(objRememberedValue2);
                                            }
                                            final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollState, false, null, false, 14, null)));
                                            ComposerKt.sourceInformationMarkerStart(composer3, -702876266, "CC(remember):TabRow.kt#9igjgp");
                                            boolean zChanged2 = composer3.changed(f322) | composer3.changed(function22) | composer3.changed(function2422) | composer3.changed(function3322) | composer3.changedInstance(scrollableTabData) | composer3.changed(i);
                                            final float f4 = f322;
                                            final Function2<? super Composer, ? super Integer, Unit> function25 = function22;
                                            final Function2<? super Composer, ? super Integer, Unit> function26 = function2422;
                                            final int i1122 = i;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function3322;
                                            Object objRememberedValue3 = composer3.rememberedValue();
                                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue3 = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                        return m3041invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                                    }

                                                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                                    public final MeasureResult m3041invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j7) {
                                                        int i12 = subcomposeMeasureScope.mo1121roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                                        final int i13 = subcomposeMeasureScope.mo1121roundToPx0680j_4(f4);
                                                        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function25);
                                                        int iValueOf = 0;
                                                        int size = listSubcompose.size();
                                                        for (int i14 = 0; i14 < size; i14++) {
                                                            iValueOf = Integer.valueOf(Math.max(iValueOf.intValue(), listSubcompose.get(i14).maxIntrinsicHeight(Integer.MAX_VALUE)));
                                                        }
                                                        final int iIntValue = iValueOf.intValue();
                                                        long jM6999copyZbe2FdA$default = Constraints.m6999copyZbe2FdA$default(j7, i12, 0, iIntValue, iIntValue, 2, null);
                                                        final List<Placeable> arrayList = new ArrayList();
                                                        final List<C1959Dp> arrayList2 = new ArrayList();
                                                        int size2 = listSubcompose.size();
                                                        for (int i15 = 0; i15 < size2; i15++) {
                                                            Measurable measurable = listSubcompose.get(i15);
                                                            Placeable placeableMo5931measureBRTryo0 = measurable.mo5931measureBRTryo0(jM6999copyZbe2FdA$default);
                                                            float fM7055constructorimpl = C1959Dp.m7055constructorimpl(subcomposeMeasureScope.mo1124toDpu2uoSUM(Math.min(measurable.maxIntrinsicWidth(placeableMo5931measureBRTryo0.getHeight()), placeableMo5931measureBRTryo0.getWidth())) - C1959Dp.m7055constructorimpl(TabKt.getHorizontalTextPadding() * 2));
                                                            arrayList.add(placeableMo5931measureBRTryo0);
                                                            arrayList2.add(C1959Dp.m7053boximpl(fM7055constructorimpl));
                                                        }
                                                        Integer numValueOf = Integer.valueOf(i13 * 2);
                                                        int size3 = arrayList.size();
                                                        for (int i16 = 0; i16 < size3; i16++) {
                                                            numValueOf = Integer.valueOf(numValueOf.intValue() + ((Placeable) arrayList.get(i16)).getWidth());
                                                        }
                                                        final int iIntValue2 = numValueOf.intValue();
                                                        final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                                        final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                        final int i17 = i1122;
                                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function35 = function34;
                                                        return MeasureScope.layout$default(subcomposeMeasureScope, iIntValue2, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1.2
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                invoke2(placementScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                final List<TabPosition> arrayList3 = new ArrayList();
                                                                int i18 = i13;
                                                                List<Placeable> list = arrayList;
                                                                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                                List<C1959Dp> list2 = arrayList2;
                                                                int size4 = list.size();
                                                                int width = i18;
                                                                for (int i19 = 0; i19 < size4; i19++) {
                                                                    Placeable placeable = list.get(i19);
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width, 0, 0.0f, 4, null);
                                                                    arrayList3.add(new TabPosition(subcomposeMeasureScope2.mo1124toDpu2uoSUM(width), subcomposeMeasureScope2.mo1124toDpu2uoSUM(placeable.getWidth()), list2.get(i19).m7069unboximpl(), null));
                                                                    width += placeable.getWidth();
                                                                }
                                                                List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                                long j8 = j7;
                                                                int i20 = iIntValue2;
                                                                int i21 = iIntValue;
                                                                int size5 = listSubcompose2.size();
                                                                for (int i22 = 0; i22 < size5; i22++) {
                                                                    Placeable placeableMo5931measureBRTryo02 = listSubcompose2.get(i22).mo5931measureBRTryo0(Constraints.m6999copyZbe2FdA$default(j8, i20, i20, 0, 0, 8, null));
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5931measureBRTryo02, 0, i21 - placeableMo5931measureBRTryo02.getHeight(), 0.0f, 4, null);
                                                                }
                                                                SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                                TabSlots tabSlots = TabSlots.Indicator;
                                                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function35;
                                                                List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(1734082948, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRowWithSubcomposeImpl.1.1.1.2.3
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                    {
                                                                        super(2);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                        invoke(composer4, num.intValue());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    public final void invoke(Composer composer4, int i23) {
                                                                        ComposerKt.sourceInformation(composer4, "C1094@47573L23:TabRow.kt#uh7d8r");
                                                                        if ((i23 & 3) == 2 && composer4.getSkipping()) {
                                                                            composer4.skipToGroupEnd();
                                                                            return;
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(1734082948, i23, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:1094)");
                                                                        }
                                                                        function36.invoke(arrayList3, composer4, 0);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                        }
                                                                    }
                                                                }));
                                                                int i23 = iIntValue2;
                                                                int i24 = iIntValue;
                                                                int size6 = listSubcompose3.size();
                                                                for (int i25 = 0; i25 < size6; i25++) {
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i25).mo5931measureBRTryo0(Constraints.INSTANCE.m7018fixedJhjzzOo(i23, i24)), 0, 0, 0.0f, 4, null);
                                                                }
                                                                scrollableTabData2.onLaidOut(subcomposeMeasureScope, i13, arrayList3, i17);
                                                            }
                                                        }, 4, null);
                                                    }
                                                };
                                                composer3.updateRememberedValue(objRememberedValue3);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, (Function2) objRememberedValue3, composer3, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composerStartRestartGroup, 54);
                                int i1022 = ((i4 >> 6) & 14) | 12582912;
                                int i1122 = i4 >> 3;
                                composer2 = composerStartRestartGroup;
                                SurfaceKt.m2978SurfaceT9BRK9s(modifier422, null, j622, j522, 0.0f, 0.0f, null, composableLambdaRememberComposableLambda22, composer2, i1022 | (i1122 & 896) | (i1122 & 7168), 114);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                f2 = f322;
                                function23 = function2422;
                                modifier3 = modifier422;
                                j3 = j622;
                                j4 = j522;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i3 & 256) == 0) {
                    }
                    if ((i4 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                if ((i3 & 256) == 0) {
                }
                if ((i4 & 38347923) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            if ((i3 & 256) == 0) {
            }
            if ((i4 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function32 = function3;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        fM3024getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if ((i4 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
