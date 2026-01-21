package androidx.compose.material3;

import androidx.autofill.HintConstants;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.C1750R;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.geometry.Size;
import androidx.compose.p000ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p000ui.graphics.GraphicsLayerScope;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.graphics.TransformOriginKt;
import androidx.compose.p000ui.graphics.drawscope.DrawScope;
import androidx.compose.p000ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p000ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p000ui.input.pointer.PointerInputScope;
import androidx.compose.p000ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.semantics.SemanticsModifierKt;
import androidx.compose.p000ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p000ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.p000ui.unit.Constraints;
import androidx.compose.p000ui.unit.IntSize;
import androidx.compose.p000ui.util.MathHelpersKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.jmrtd.lds.LDSFile;

/* compiled from: ModalBottomSheet.kt */
@Metadata(m513d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÄ\u0001\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00132\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\u00182\u0013\b\u0002\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u001a0\n¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0\u001e¢\u0006\u0002\b\u0018¢\u0006\u0002\b H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a0\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u00132\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010%\u001a\u00020&H\u0003ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a-\u0010)\u001a\u00020\u000e2\b\b\u0002\u0010*\u001a\u00020&2\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020&0\u001eH\u0007¢\u0006\u0002\u0010-\u001aó\u0001\u0010.\u001a\u00020\b*\u00020/2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203012\u0006\u00104\u001a\u0002052\f\u00106\u001a\b\u0012\u0004\u0012\u00020\b0\n2!\u00107\u001a\u001d\u0012\u0013\u0012\u001102¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\b0\u001e2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00042\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\u00182\u0013\b\u0002\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u001a0\n¢\u0006\u0002\b\u00182\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0\u001e¢\u0006\u0002\b\u0018¢\u0006\u0002\b H\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\u0014\u0010=\u001a\u000202*\u00020>2\u0006\u0010?\u001a\u000202H\u0002\u001a\u0014\u0010@\u001a\u000202*\u00020>2\u0006\u0010?\u001a\u000202H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A²\u0006\n\u0010B\u001a\u000202X\u008a\u0084\u0002"}, m514d2 = {"PredictiveBackChildTransformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "J", "PredictiveBackMaxScaleXDistance", "Landroidx/compose/ui/unit/Dp;", "F", "PredictiveBackMaxScaleYDistance", "ModalBottomSheet", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "Landroidx/compose/material3/SheetState;", "sheetMaxWidth", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "scrimColor", "dragHandle", "Landroidx/compose/runtime/Composable;", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "properties", "Landroidx/compose/material3/ModalBottomSheetProperties;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "ModalBottomSheet-dYc4hso", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Scrim", "color", "visible", "", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberModalBottomSheetState", "skipPartiallyExpanded", "confirmValueChange", "Landroidx/compose/material3/SheetValue;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "ModalBottomSheetContent", "Landroidx/compose/foundation/layout/BoxScope;", "predictiveBackProgress", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "animateToDismiss", "settleToDismiss", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "velocity", "ModalBottomSheetContent-IQkwcL4", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/animation/core/Animatable;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "calculatePredictiveBackScaleX", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", NotificationCompat.CATEGORY_PROGRESS, "calculatePredictiveBackScaleY", "material3_release", "alpha"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class ModalBottomSheetKt {
    private static final float PredictiveBackMaxScaleXDistance = C1959Dp.m7055constructorimpl(48);
    private static final float PredictiveBackMaxScaleYDistance = C1959Dp.m7055constructorimpl(24);
    private static final long PredictiveBackChildTransformOrigin = TransformOriginKt.TransformOrigin(0.5f, 0.0f);

    /* JADX WARN: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /* renamed from: ModalBottomSheet-dYc4hso, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2677ModalBottomSheetdYc4hso(final Function0<Unit> function0, Modifier modifier, SheetState sheetState, float f, Shape shape, long j, long j2, float f2, long j3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, ? extends WindowInsets> function22, ModalBottomSheetProperties modalBottomSheetProperties, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        final SheetState sheetStateRememberModalBottomSheetState;
        int i5;
        float f3;
        Shape shape2;
        long jM2364contentColorForek8zF_U;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32;
        int i15;
        Shape expandedShape;
        long containerColor;
        float f4;
        long scrimColor;
        ModalBottomSheetKt$ModalBottomSheet$1 modalBottomSheetKt$ModalBottomSheet$1;
        final float f5;
        ModalBottomSheetProperties properties;
        final float f6;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function24;
        final Shape shape3;
        final long j4;
        final Modifier modifier3;
        final long j5;
        final long j6;
        Object objRememberedValue;
        final CoroutineScope coroutineScope;
        boolean zChangedInstance;
        Object objRememberedValue2;
        boolean zChangedInstance2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        final Animatable animatable;
        boolean zChangedInstance3;
        Object objRememberedValue5;
        Composer composer2;
        final SheetState sheetState2;
        final ModalBottomSheetProperties modalBottomSheetProperties2;
        final float f7;
        final Shape shape4;
        final long j7;
        final long j8;
        final float f8;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function26;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i16;
        Composer composerStartRestartGroup = composer.startRestartGroup(2132719801);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ModalBottomSheet)P(6,5,11,10:c#ui.unit.Dp,9,0:c#ui.graphics.Color,2:c#ui.graphics.Color,12:c#ui.unit.Dp,8:c#ui.graphics.Color,4,3,7)121@6012L31,123@6143L13,124@6206L14,125@6248L31,127@6356L10,133@6697L24,134@6761L327,145@7142L149,151@7326L42,155@7458L708,167@8231L771,153@7374L1628,193@9077L21,193@9050L48:ModalBottomSheet.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i17 = i3 & 2;
        if (i17 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i3 & 4) == 0) {
                    sheetStateRememberModalBottomSheetState = sheetState;
                    int i18 = composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState) ? 256 : 128;
                    i4 |= i18;
                } else {
                    sheetStateRememberModalBottomSheetState = sheetState;
                }
                i4 |= i18;
            } else {
                sheetStateRememberModalBottomSheetState = sheetState;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    f3 = f;
                    i4 |= composerStartRestartGroup.changed(f3) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        shape2 = shape;
                        int i19 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                        i4 |= i19;
                    } else {
                        shape2 = shape;
                    }
                    i4 |= i19;
                } else {
                    shape2 = shape;
                }
                if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                    i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(j)) ? 131072 : 65536;
                }
                if ((i & 1572864) == 0) {
                    jM2364contentColorForek8zF_U = j2;
                    i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(jM2364contentColorForek8zF_U)) ? 1048576 : 524288;
                } else {
                    jM2364contentColorForek8zF_U = j2;
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changed(f2) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        i16 = i4;
                        int i20 = composerStartRestartGroup.changed(j3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        i7 = i16 | i20;
                    } else {
                        i16 = i4;
                    }
                    i7 = i16 | i20;
                } else {
                    i7 = i4;
                }
                i8 = i3 & 512;
                if (i8 != 0) {
                    i10 = i7 | 805306368;
                } else {
                    if ((i & 805306368) == 0) {
                        i9 = i7 | (composerStartRestartGroup.changedInstance(function2) ? PKIFailureInfo.duplicateCertReq : 268435456);
                    } else {
                        i9 = i7;
                    }
                    i10 = i9;
                }
                if ((i2 & 6) == 0) {
                    i11 = i6;
                    i12 = i2 | (((i3 & 1024) == 0 && composerStartRestartGroup.changedInstance(function22)) ? 4 : 2);
                } else {
                    i11 = i6;
                    i12 = i2;
                }
                i13 = i3 & 2048;
                if (i13 != 0) {
                    i12 |= 48;
                    i14 = i13;
                } else if ((i2 & 48) == 0) {
                    i14 = i13;
                    i12 |= composerStartRestartGroup.changed(modalBottomSheetProperties) ? 32 : 16;
                } else {
                    i14 = i13;
                }
                int i21 = i12;
                if ((i3 & 4096) == 0) {
                    if ((i2 & 384) == 0) {
                        function32 = function3;
                        i21 |= composerStartRestartGroup.changedInstance(function32) ? 256 : 128;
                    }
                    if ((306783379 & i10) == 306783378 || (i21 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i17 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                i10 &= -897;
                                sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                            }
                            float fM2227getSheetMaxWidthD9Ej5fM = i5 == 0 ? BottomSheetDefaults.INSTANCE.m2227getSheetMaxWidthD9Ej5fM() : f3;
                            if ((i3 & 16) == 0) {
                                i15 = 6;
                                expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                i10 &= -57345;
                            } else {
                                i15 = 6;
                                expandedShape = shape2;
                            }
                            if ((i3 & 32) == 0) {
                                i10 &= -458753;
                                containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, i15);
                            } else {
                                containerColor = j;
                            }
                            if ((i3 & 64) != 0) {
                                jM2364contentColorForek8zF_U = ColorSchemeKt.m2364contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i10 >> 15) & 14);
                                i10 &= -3670017;
                            }
                            int i22 = i10;
                            float fM7055constructorimpl = i11 == 0 ? C1959Dp.m7055constructorimpl(0) : f2;
                            if ((i3 & 256) == 0) {
                                f4 = fM7055constructorimpl;
                                scrimColor = BottomSheetDefaults.INSTANCE.getScrimColor(composerStartRestartGroup, 6);
                                i10 = i22 & (-234881025);
                            } else {
                                f4 = fM7055constructorimpl;
                                i10 = i22;
                                scrimColor = j3;
                            }
                            Function2<? super Composer, ? super Integer, Unit> function2M2404getLambda1$material3_release = i8 == 0 ? ComposableSingletons$ModalBottomSheetKt.INSTANCE.m2404getLambda1$material3_release() : function2;
                            if ((i3 & 1024) == 0) {
                                modalBottomSheetKt$ModalBottomSheet$1 = new Function2<Composer, Integer, WindowInsets>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$1
                                    public final WindowInsets invoke(Composer composer3, int i23) {
                                        composer3.startReplaceGroup(58488196);
                                        ComposerKt.sourceInformation(composer3, "C129@6530L12:ModalBottomSheet.kt#uh7d8r");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(58488196, i23, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:129)");
                                        }
                                        WindowInsets windowInsets = BottomSheetDefaults.INSTANCE.getWindowInsets(composer3, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer3.endReplaceGroup();
                                        return windowInsets;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ WindowInsets invoke(Composer composer3, Integer num) {
                                        return invoke(composer3, num.intValue());
                                    }
                                };
                                i21 &= -15;
                            } else {
                                modalBottomSheetKt$ModalBottomSheet$1 = function22;
                            }
                            if (i14 == 0) {
                                properties = ModalBottomSheetDefaults.INSTANCE.getProperties();
                                f5 = f4;
                            } else {
                                f5 = f4;
                                properties = modalBottomSheetProperties;
                            }
                            f6 = fM2227getSheetMaxWidthD9Ej5fM;
                            function23 = function2M2404getLambda1$material3_release;
                            function24 = modalBottomSheetKt$ModalBottomSheet$1;
                            shape3 = expandedShape;
                            j4 = containerColor;
                            modifier3 = modifier2;
                            j5 = jM2364contentColorForek8zF_U;
                            j6 = scrimColor;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i10 &= -897;
                            }
                            if ((i3 & 16) != 0) {
                                i10 &= -57345;
                            }
                            if ((i3 & 32) != 0) {
                                i10 &= -458753;
                            }
                            if ((i3 & 64) != 0) {
                                i10 &= -3670017;
                            }
                            if ((i3 & 256) != 0) {
                                i10 &= -234881025;
                            }
                            if ((i3 & 1024) != 0) {
                                i21 &= -15;
                            }
                            j4 = j;
                            f5 = f2;
                            j6 = j3;
                            function23 = function2;
                            function24 = function22;
                            properties = modalBottomSheetProperties;
                            f6 = f3;
                            shape3 = shape2;
                            modifier3 = modifier2;
                            j5 = jM2364contentColorForek8zF_U;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2132719801, i10, i21, "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:132)");
                        }
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954363344, "CC(remember):Effects.kt#9igjgp");
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                            composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                            objRememberedValue = compositionScopedCoroutineScopeCanceller;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2011393839, "CC(remember):ModalBottomSheet.kt#9igjgp");
                        int i23 = (i10 & 896) ^ 384;
                        int i24 = i10 & 14;
                        zChangedInstance = ((i23 <= 256 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) || (i10 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope) | (i24 == 4);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Hidden).booleanValue()) {
                                        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C14011(sheetStateRememberModalBottomSheetState, null), 3, null);
                                        final SheetState sheetState3 = sheetStateRememberModalBottomSheetState;
                                        final Function0<Unit> function02 = function0;
                                        jobLaunch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                                invoke2(th);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Throwable th) {
                                                if (sheetState3.isVisible()) {
                                                    return;
                                                }
                                                function02.invoke();
                                            }
                                        });
                                    }
                                }

                                /* compiled from: ModalBottomSheet.kt */
                                @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
                                @DebugMetadata(m532c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1", m533f = "ModalBottomSheet.kt", m534i = {}, m535l = {CipherSuite.TLS_PSK_WITH_RC4_128_SHA}, m536m = "invokeSuspend", m537n = {}, m538s = {})
                                /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1 */
                                static final class C14011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ SheetState $sheetState;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C14011(SheetState sheetState, Continuation<? super C14011> continuation) {
                                        super(2, continuation);
                                        this.$sheetState = sheetState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        return new C14011(this.$sheetState, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((C14011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            this.label = 1;
                                            if (this.$sheetState.hide(this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        final Function0 function02 = (Function0) objRememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2011381825, "CC(remember):ModalBottomSheet.kt#9igjgp");
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope) | ((i23 <= 256 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) || (i10 & 384) == 256) | (i24 == 4);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Float f9) {
                                    invoke(f9.floatValue());
                                    return Unit.INSTANCE;
                                }

                                /* compiled from: ModalBottomSheet.kt */
                                @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
                                @DebugMetadata(m532c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1", m533f = "ModalBottomSheet.kt", m534i = {}, m535l = {CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA}, m536m = "invokeSuspend", m537n = {}, m538s = {})
                                /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1 */
                                static final class C14031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ float $it;
                                    final /* synthetic */ SheetState $sheetState;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C14031(SheetState sheetState, float f, Continuation<? super C14031> continuation) {
                                        super(2, continuation);
                                        this.$sheetState = sheetState;
                                        this.$it = f;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        return new C14031(this.$sheetState, this.$it, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((C14031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            this.label = 1;
                                            if (this.$sheetState.settle$material3_release(this.$it, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }

                                public final void invoke(float f9) {
                                    Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C14031(sheetStateRememberModalBottomSheetState, f9, null), 3, null);
                                    final SheetState sheetState3 = sheetStateRememberModalBottomSheetState;
                                    final Function0<Unit> function03 = function0;
                                    jobLaunch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                            invoke2(th);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(Throwable th) {
                                            if (sheetState3.isVisible()) {
                                                return;
                                            }
                                            function03.invoke();
                                        }
                                    });
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        final Function1 function1 = (Function1) objRememberedValue3;
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2011376044, "CC(remember):ModalBottomSheet.kt#9igjgp");
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        animatable = (Animatable) objRememberedValue4;
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2011371154, "CC(remember):ModalBottomSheet.kt#9igjgp");
                        zChangedInstance3 = (i24 == 4) | ((i23 <= 256 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) || (i10 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(animatable);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (sheetStateRememberModalBottomSheetState.getCurrentValue() != SheetValue.Expanded || !sheetStateRememberModalBottomSheetState.getHasPartiallyExpandedState()) {
                                        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C13983(sheetStateRememberModalBottomSheetState, null), 3, null);
                                        final Function0<Unit> function03 = function0;
                                        jobLaunch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1.4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                                invoke2(th);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Throwable th) {
                                                function03.invoke();
                                            }
                                        });
                                    } else {
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C13961(animatable, null), 3, null);
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C13972(sheetStateRememberModalBottomSheetState, null), 3, null);
                                    }
                                }

                                /* compiled from: ModalBottomSheet.kt */
                                @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
                                @DebugMetadata(m532c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1", m533f = "ModalBottomSheet.kt", m534i = {}, m535l = {CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384}, m536m = "invokeSuspend", m537n = {}, m538s = {})
                                /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1 */
                                static final class C13961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ Animatable<Float, AnimationVector1D> $predictiveBackProgress;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C13961(Animatable<Float, AnimationVector1D> animatable, Continuation<? super C13961> continuation) {
                                        super(2, continuation);
                                        this.$predictiveBackProgress = animatable;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        return new C13961(this.$predictiveBackProgress, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((C13961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            this.label = 1;
                                            if (Animatable.animateTo$default(this.$predictiveBackProgress, Boxing.boxFloat(0.0f), null, null, null, this, 14, null) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }

                                /* compiled from: ModalBottomSheet.kt */
                                @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
                                @DebugMetadata(m532c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2", m533f = "ModalBottomSheet.kt", m534i = {}, m535l = {CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256}, m536m = "invokeSuspend", m537n = {}, m538s = {})
                                /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2 */
                                static final class C13972 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ SheetState $sheetState;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C13972(SheetState sheetState, Continuation<? super C13972> continuation) {
                                        super(2, continuation);
                                        this.$sheetState = sheetState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        return new C13972(this.$sheetState, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((C13972) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            this.label = 1;
                                            if (this.$sheetState.partialExpand(this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }

                                /* compiled from: ModalBottomSheet.kt */
                                @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
                                @DebugMetadata(m532c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3", m533f = "ModalBottomSheet.kt", m534i = {}, m535l = {CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256}, m536m = "invokeSuspend", m537n = {}, m538s = {})
                                /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3 */
                                static final class C13983 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                    final /* synthetic */ SheetState $sheetState;
                                    int label;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C13983(SheetState sheetState, Continuation<? super C13983> continuation) {
                                        super(2, continuation);
                                        this.$sheetState = sheetState;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                        return new C13983(this.$sheetState, continuation);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                        return ((C13983) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i = this.label;
                                        if (i == 0) {
                                            ResultKt.throwOnFailure(obj);
                                            this.label = 1;
                                            if (this.$sheetState.hide(this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function33 = function32;
                        final SheetState sheetState3 = sheetStateRememberModalBottomSheetState;
                        ModalBottomSheet_androidKt.ModalBottomSheetDialog((Function0) objRememberedValue5, properties, animatable, ComposableLambdaKt.rememberComposableLambda(-314673510, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3
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

                            public final void invoke(Composer composer3, int i25) {
                                ComposerKt.sourceInformation(composer3, "C168@8241L755:ModalBottomSheet.kt#uh7d8r");
                                if ((i25 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-314673510, i25, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:168)");
                                    }
                                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3.1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
                                        }
                                    }, 1, null);
                                    long j9 = j6;
                                    Function0<Unit> function03 = function02;
                                    SheetState sheetState4 = sheetState3;
                                    Animatable<Float, AnimationVector1D> animatable2 = animatable;
                                    CoroutineScope coroutineScope2 = coroutineScope;
                                    Function1<Float, Unit> function12 = function1;
                                    Modifier modifier4 = modifier3;
                                    float f9 = f6;
                                    Shape shape5 = shape3;
                                    long j10 = j4;
                                    long j11 = j5;
                                    float f10 = f5;
                                    Function2<Composer, Integer, Unit> function27 = function23;
                                    Function2<Composer, Integer, WindowInsets> function28 = function24;
                                    Function3<ColumnScope, Composer, Integer, Unit> function34 = function33;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierSemantics$default);
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
                                    Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composer3, 1107507610, "C169@8345L169,174@8527L459:ModalBottomSheet.kt#uh7d8r");
                                    ModalBottomSheetKt.m2679Scrim3JVO9M(j9, function03, sheetState4.getTargetValue() != SheetValue.Hidden, composer3, 0);
                                    ModalBottomSheetKt.m2678ModalBottomSheetContentIQkwcL4(boxScopeInstance, animatable2, coroutineScope2, function03, function12, modifier4, sheetState4, f9, shape5, j10, j11, f10, function27, function28, function34, composer3, (Animatable.$stable << 3) | 6, 0, 0);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
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
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, (i21 & LDSFile.EF_DG16_TAG) | 3072 | (Animatable.$stable << 6));
                        composer2 = composerStartRestartGroup;
                        if (sheetStateRememberModalBottomSheetState.getHasExpandedState()) {
                            ComposerKt.sourceInformationMarkerStart(composer2, -2011320033, "CC(remember):ModalBottomSheet.kt#9igjgp");
                            boolean z = (i23 > 256 && composer2.changed(sheetStateRememberModalBottomSheetState)) || (i10 & 384) == 256;
                            Object objRememberedValue6 = composer2.rememberedValue();
                            if (z || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = (Function2) new ModalBottomSheetKt$ModalBottomSheet$4$1(sheetStateRememberModalBottomSheetState, null);
                                composer2.updateRememberedValue(objRememberedValue6);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            EffectsKt.LaunchedEffect(sheetStateRememberModalBottomSheetState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composer2, (i10 >> 6) & 14);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        sheetState2 = sheetStateRememberModalBottomSheetState;
                        modalBottomSheetProperties2 = properties;
                        modifier2 = modifier3;
                        f7 = f6;
                        shape4 = shape3;
                        j7 = j4;
                        j8 = j5;
                        f8 = f5;
                        function25 = function23;
                        function26 = function24;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        j7 = j;
                        j6 = j3;
                        composer2 = composerStartRestartGroup;
                        f7 = f3;
                        shape4 = shape2;
                        sheetState2 = sheetStateRememberModalBottomSheetState;
                        j8 = jM2364contentColorForek8zF_U;
                        f8 = f2;
                        function25 = function2;
                        function26 = function22;
                        modalBottomSheetProperties2 = modalBottomSheetProperties;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier4 = modifier2;
                        final long j9 = j6;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$5
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

                            public final void invoke(Composer composer3, int i25) {
                                ModalBottomSheetKt.m2677ModalBottomSheetdYc4hso(function0, modifier4, sheetState2, f7, shape4, j7, j8, f8, j9, function25, function26, modalBottomSheetProperties2, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i21 |= 384;
                function32 = function3;
                if ((306783379 & i10) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                        }
                        if ((i3 & 4) != 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 16) == 0) {
                        }
                        if ((i3 & 32) == 0) {
                        }
                        if ((i3 & 64) != 0) {
                        }
                        int i222 = i10;
                        if (i11 == 0) {
                        }
                        if ((i3 & 256) == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if ((i3 & 1024) == 0) {
                        }
                        if (i14 == 0) {
                        }
                        f6 = fM2227getSheetMaxWidthD9Ej5fM;
                        function23 = function2M2404getLambda1$material3_release;
                        function24 = modalBottomSheetKt$ModalBottomSheet$1;
                        shape3 = expandedShape;
                        j4 = containerColor;
                        modifier3 = modifier2;
                        j5 = jM2364contentColorForek8zF_U;
                        j6 = scrimColor;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954363344, "CC(remember):Effects.kt#9igjgp");
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2011393839, "CC(remember):ModalBottomSheet.kt#9igjgp");
                        int i232 = (i10 & 896) ^ 384;
                        if (i232 <= 256) {
                            int i242 = i10 & 14;
                            zChangedInstance = ((i232 <= 256 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) || (i10 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope) | (i242 == 4);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance) {
                                objRememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Hidden).booleanValue()) {
                                            Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C14011(sheetStateRememberModalBottomSheetState, null), 3, null);
                                            final SheetState sheetState32 = sheetStateRememberModalBottomSheetState;
                                            final Function0<Unit> function022 = function0;
                                            jobLaunch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1.2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                                    invoke2(th);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(Throwable th) {
                                                    if (sheetState32.isVisible()) {
                                                        return;
                                                    }
                                                    function022.invoke();
                                                }
                                            });
                                        }
                                    }

                                    /* compiled from: ModalBottomSheet.kt */
                                    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
                                    @DebugMetadata(m532c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1", m533f = "ModalBottomSheet.kt", m534i = {}, m535l = {CipherSuite.TLS_PSK_WITH_RC4_128_SHA}, m536m = "invokeSuspend", m537n = {}, m538s = {})
                                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1 */
                                    static final class C14011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        final /* synthetic */ SheetState $sheetState;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        C14011(SheetState sheetState, Continuation<? super C14011> continuation) {
                                            super(2, continuation);
                                            this.$sheetState = sheetState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                            return new C14011(this.$sheetState, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                            return ((C14011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) {
                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                this.label = 1;
                                                if (this.$sheetState.hide(this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } else {
                                                if (i != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                ResultKt.throwOnFailure(obj);
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                final Function0<Unit> function022 = (Function0) objRememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2011381825, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                if (i232 <= 256) {
                                    zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope) | ((i232 <= 256 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) || (i10 & 384) == 256) | (i242 == 4);
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance2) {
                                        objRememberedValue3 = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Float f9) {
                                                invoke(f9.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* compiled from: ModalBottomSheet.kt */
                                            @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
                                            @DebugMetadata(m532c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1", m533f = "ModalBottomSheet.kt", m534i = {}, m535l = {CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA}, m536m = "invokeSuspend", m537n = {}, m538s = {})
                                            /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1 */
                                            static final class C14031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                final /* synthetic */ float $it;
                                                final /* synthetic */ SheetState $sheetState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                C14031(SheetState sheetState, float f, Continuation<? super C14031> continuation) {
                                                    super(2, continuation);
                                                    this.$sheetState = sheetState;
                                                    this.$it = f;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                    return new C14031(this.$sheetState, this.$it, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                    return ((C14031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final Object invokeSuspend(Object obj) {
                                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        this.label = 1;
                                                        if (this.$sheetState.settle$material3_release(this.$it, this) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj);
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }

                                            public final void invoke(float f9) {
                                                Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C14031(sheetStateRememberModalBottomSheetState, f9, null), 3, null);
                                                final SheetState sheetState32 = sheetStateRememberModalBottomSheetState;
                                                final Function0<Unit> function03 = function0;
                                                jobLaunch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                                        invoke2(th);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(Throwable th) {
                                                        if (sheetState32.isVisible()) {
                                                            return;
                                                        }
                                                        function03.invoke();
                                                    }
                                                });
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                        final Function1<? super Float, Unit> function12 = (Function1) objRememberedValue3;
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2011376044, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        }
                                        animatable = (Animatable) objRememberedValue4;
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2011371154, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                        if (i232 <= 256) {
                                            zChangedInstance3 = (i242 == 4) | ((i232 <= 256 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) || (i10 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(animatable);
                                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                            if (zChangedInstance3) {
                                                objRememberedValue5 = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                                        invoke2();
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        if (sheetStateRememberModalBottomSheetState.getCurrentValue() != SheetValue.Expanded || !sheetStateRememberModalBottomSheetState.getHasPartiallyExpandedState()) {
                                                            Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C13983(sheetStateRememberModalBottomSheetState, null), 3, null);
                                                            final Function0<Unit> function03 = function0;
                                                            jobLaunch$default.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1.4
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                                                                    invoke2(th);
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2(Throwable th) {
                                                                    function03.invoke();
                                                                }
                                                            });
                                                        } else {
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C13961(animatable, null), 3, null);
                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C13972(sheetStateRememberModalBottomSheetState, null), 3, null);
                                                        }
                                                    }

                                                    /* compiled from: ModalBottomSheet.kt */
                                                    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
                                                    @DebugMetadata(m532c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1", m533f = "ModalBottomSheet.kt", m534i = {}, m535l = {CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384}, m536m = "invokeSuspend", m537n = {}, m538s = {})
                                                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$1 */
                                                    static final class C13961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        final /* synthetic */ Animatable<Float, AnimationVector1D> $predictiveBackProgress;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        C13961(Animatable<Float, AnimationVector1D> animatable, Continuation<? super C13961> continuation) {
                                                            super(2, continuation);
                                                            this.$predictiveBackProgress = animatable;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                            return new C13961(this.$predictiveBackProgress, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                            return ((C13961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Object invokeSuspend(Object obj) {
                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                ResultKt.throwOnFailure(obj);
                                                                this.label = 1;
                                                                if (Animatable.animateTo$default(this.$predictiveBackProgress, Boxing.boxFloat(0.0f), null, null, null, this, 14, null) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                            } else {
                                                                if (i != 1) {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                ResultKt.throwOnFailure(obj);
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }

                                                    /* compiled from: ModalBottomSheet.kt */
                                                    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
                                                    @DebugMetadata(m532c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2", m533f = "ModalBottomSheet.kt", m534i = {}, m535l = {CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256}, m536m = "invokeSuspend", m537n = {}, m538s = {})
                                                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$2 */
                                                    static final class C13972 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        final /* synthetic */ SheetState $sheetState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        C13972(SheetState sheetState, Continuation<? super C13972> continuation) {
                                                            super(2, continuation);
                                                            this.$sheetState = sheetState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                            return new C13972(this.$sheetState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                            return ((C13972) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Object invokeSuspend(Object obj) {
                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                ResultKt.throwOnFailure(obj);
                                                                this.label = 1;
                                                                if (this.$sheetState.partialExpand(this) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                            } else {
                                                                if (i != 1) {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                ResultKt.throwOnFailure(obj);
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }

                                                    /* compiled from: ModalBottomSheet.kt */
                                                    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
                                                    @DebugMetadata(m532c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3", m533f = "ModalBottomSheet.kt", m534i = {}, m535l = {CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256}, m536m = "invokeSuspend", m537n = {}, m538s = {})
                                                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$2$1$3 */
                                                    static final class C13983 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                        final /* synthetic */ SheetState $sheetState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        C13983(SheetState sheetState, Continuation<? super C13983> continuation) {
                                                            super(2, continuation);
                                                            this.$sheetState = sheetState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                            return new C13983(this.$sheetState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                            return ((C13983) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Object invokeSuspend(Object obj) {
                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                ResultKt.throwOnFailure(obj);
                                                                this.label = 1;
                                                                if (this.$sheetState.hide(this) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                            } else {
                                                                if (i != 1) {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                ResultKt.throwOnFailure(obj);
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function332 = function32;
                                                final SheetState sheetState32 = sheetStateRememberModalBottomSheetState;
                                                ModalBottomSheet_androidKt.ModalBottomSheetDialog((Function0) objRememberedValue5, properties, animatable, ComposableLambdaKt.rememberComposableLambda(-314673510, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3
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

                                                    public final void invoke(Composer composer3, int i25) {
                                                        ComposerKt.sourceInformation(composer3, "C168@8241L755:ModalBottomSheet.kt#uh7d8r");
                                                        if ((i25 & 3) != 2 || !composer3.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-314673510, i25, -1, "androidx.compose.material3.ModalBottomSheet.<anonymous> (ModalBottomSheet.kt:168)");
                                                            }
                                                            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$3.1
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                    invoke2(semanticsPropertyReceiver);
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                    SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver, true);
                                                                }
                                                            }, 1, null);
                                                            long j92 = j6;
                                                            Function0<Unit> function03 = function022;
                                                            SheetState sheetState4 = sheetState32;
                                                            Animatable<Float, AnimationVector1D> animatable2 = animatable;
                                                            CoroutineScope coroutineScope2 = coroutineScope;
                                                            Function1<Float, Unit> function122 = function12;
                                                            Modifier modifier42 = modifier3;
                                                            float f9 = f6;
                                                            Shape shape5 = shape3;
                                                            long j10 = j4;
                                                            long j11 = j5;
                                                            float f10 = f5;
                                                            Function2<Composer, Integer, Unit> function27 = function23;
                                                            Function2<Composer, Integer, WindowInsets> function28 = function24;
                                                            Function3<ColumnScope, Composer, Integer, Unit> function34 = function332;
                                                            ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierSemantics$default);
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
                                                            Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                            if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                            }
                                                            Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                            ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                            ComposerKt.sourceInformationMarkerStart(composer3, 1107507610, "C169@8345L169,174@8527L459:ModalBottomSheet.kt#uh7d8r");
                                                            ModalBottomSheetKt.m2679Scrim3JVO9M(j92, function03, sheetState4.getTargetValue() != SheetValue.Hidden, composer3, 0);
                                                            ModalBottomSheetKt.m2678ModalBottomSheetContentIQkwcL4(boxScopeInstance, animatable2, coroutineScope2, function03, function122, modifier42, sheetState4, f9, shape5, j10, j11, f10, function27, function28, function34, composer3, (Animatable.$stable << 3) | 6, 0, 0);
                                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                                            ComposerKt.sourceInformationMarkerEnd(composer3);
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
                                                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i21 & LDSFile.EF_DG16_TAG) | 3072 | (Animatable.$stable << 6));
                                                composer2 = composerStartRestartGroup;
                                                if (sheetStateRememberModalBottomSheetState.getHasExpandedState()) {
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                sheetState2 = sheetStateRememberModalBottomSheetState;
                                                modalBottomSheetProperties2 = properties;
                                                modifier2 = modifier3;
                                                f7 = f6;
                                                shape4 = shape3;
                                                j7 = j4;
                                                j8 = j5;
                                                f8 = f5;
                                                function25 = function23;
                                                function26 = function24;
                                            }
                                        } else {
                                            zChangedInstance3 = (i242 == 4) | ((i232 <= 256 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) || (i10 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(animatable);
                                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                            if (zChangedInstance3) {
                                            }
                                        }
                                    }
                                } else {
                                    zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope) | ((i232 <= 256 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) || (i10 & 384) == 256) | (i242 == 4);
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance2) {
                                    }
                                }
                            }
                        } else {
                            int i2422 = i10 & 14;
                            zChangedInstance = ((i232 <= 256 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) || (i10 & 384) == 256) | composerStartRestartGroup.changedInstance(coroutineScope) | (i2422 == 4);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance) {
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            f3 = f;
            if ((i & 24576) == 0) {
            }
            if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i8 = i3 & 512;
            if (i8 != 0) {
            }
            if ((i2 & 6) == 0) {
            }
            i13 = i3 & 2048;
            if (i13 != 0) {
            }
            int i212 = i12;
            if ((i3 & 4096) == 0) {
            }
            function32 = function3;
            if ((306783379 & i10) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        f3 = f;
        if ((i & 24576) == 0) {
        }
        if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i8 = i3 & 512;
        if (i8 != 0) {
        }
        if ((i2 & 6) == 0) {
        }
        i13 = i3 & 2048;
        if (i13 != 0) {
        }
        int i2122 = i12;
        if ((i3 & 4096) == 0) {
        }
        function32 = function3;
        if ((306783379 & i10) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:296:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /* renamed from: ModalBottomSheetContent-IQkwcL4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2678ModalBottomSheetContentIQkwcL4(final BoxScope boxScope, final Animatable<Float, AnimationVector1D> animatable, final CoroutineScope coroutineScope, final Function0<Unit> function0, final Function1<? super Float, Unit> function1, Modifier modifier, SheetState sheetState, float f, Shape shape, long j, long j2, float f2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, ? extends WindowInsets> function22, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function0<Unit> function02;
        int i5;
        Modifier modifier2;
        final SheetState sheetStateRememberModalBottomSheetState;
        int i6;
        final Shape expandedShape;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i14;
        long containerColor;
        long jM2364contentColorForek8zF_U;
        Function2<? super Composer, ? super Integer, Unit> function2M2405getLambda2$material3_release;
        Shape shape2;
        long j3;
        int i15;
        Modifier modifier3;
        float f3;
        float f4;
        Function2<? super Composer, ? super Integer, ? extends WindowInsets> function24;
        final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function25;
        int i16;
        float f5;
        boolean z;
        Object objRememberedValue;
        boolean z2;
        Object objRememberedValue2;
        boolean z3;
        Object objRememberedValue3;
        boolean zChanged;
        Object objRememberedValue4;
        boolean z4;
        boolean z5;
        Object objRememberedValue5;
        Composer composer2;
        final SheetState sheetState2;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Function2<? super Composer, ? super Integer, ? extends WindowInsets> function27;
        final float f6;
        final Modifier modifier4;
        final float f7;
        final long j4;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i17;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1676960531);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ModalBottomSheetContent)P(7,8!1,9,6,12,11:c#ui.unit.Dp,10,1:c#ui.graphics.Color,3:c#ui.graphics.Color,13:c#ui.unit.Dp,5,4)205@9432L31,207@9563L13,208@9626L14,209@9668L31,215@10018L48,224@10294L324,232@10728L1476,267@12552L23,269@12621L112,273@12765L612,288@13518L2623,217@10072L6069:ModalBottomSheet.kt#uh7d8r");
        if ((Integer.MIN_VALUE & i3) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 1) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? composerStartRestartGroup.changed(animatable) : composerStartRestartGroup.changedInstance(animatable) ? 32 : 16;
        }
        if ((i3 & 2) != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(coroutineScope) ? 256 : 128;
            }
            if ((i3 & 4) == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function02 = function0;
                    i4 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
                }
                i5 = i3 & 16;
                if (i5 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                        i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                    }
                }
                if ((i & 1572864) == 0) {
                    sheetStateRememberModalBottomSheetState = sheetState;
                    i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) ? 1048576 : 524288;
                } else {
                    sheetStateRememberModalBottomSheetState = sheetState;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changed(f) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 128) == 0) {
                        expandedShape = shape;
                        int i18 = composerStartRestartGroup.changed(expandedShape) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        i4 |= i18;
                    } else {
                        expandedShape = shape;
                    }
                    i4 |= i18;
                } else {
                    expandedShape = shape;
                }
                if ((i & 805306368) == 0) {
                    if ((i3 & 256) == 0) {
                        i17 = i4;
                        int i19 = composerStartRestartGroup.changed(j) ? PKIFailureInfo.duplicateCertReq : 268435456;
                        i7 = i17 | i19;
                    } else {
                        i17 = i4;
                    }
                    i7 = i17 | i19;
                } else {
                    i7 = i4;
                }
                if ((i2 & 6) == 0) {
                    i8 = (((i3 & 512) == 0 && composerStartRestartGroup.changed(j2)) ? 4 : 2) | i2;
                } else {
                    i8 = i2;
                }
                int i20 = i8;
                i9 = i3 & 1024;
                if (i9 != 0) {
                    i12 = i20 | 48;
                    i10 = i9;
                } else if ((i2 & 48) == 0) {
                    i10 = i9;
                    i12 = i20 | (composerStartRestartGroup.changed(f2) ? 32 : 16);
                } else {
                    i10 = i9;
                    i11 = i20;
                    i13 = i3 & 2048;
                    if (i13 == 0) {
                        i11 |= 384;
                    } else {
                        if ((i2 & 384) == 0) {
                            function23 = function2;
                            i11 |= composerStartRestartGroup.changedInstance(function23) ? 256 : 128;
                        }
                        int i21 = i11;
                        if ((i2 & 3072) == 0) {
                            i14 = i21 | (((i3 & 4096) == 0 && composerStartRestartGroup.changedInstance(function22)) ? 2048 : 1024);
                        } else {
                            i14 = i21;
                        }
                        if ((i3 & 8192) == 0) {
                            if ((i2 & 24576) == 0) {
                                i14 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
                            }
                            if ((i7 & 306783379) == 306783378 || (i14 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i5 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if ((i3 & 32) != 0) {
                                        i7 &= -3670017;
                                        sheetStateRememberModalBottomSheetState = rememberModalBottomSheetState(false, null, composerStartRestartGroup, 0, 3);
                                    }
                                    float fM2227getSheetMaxWidthD9Ej5fM = i6 == 0 ? BottomSheetDefaults.INSTANCE.m2227getSheetMaxWidthD9Ej5fM() : f;
                                    if ((i3 & 128) != 0) {
                                        expandedShape = BottomSheetDefaults.INSTANCE.getExpandedShape(composerStartRestartGroup, 6);
                                        i7 &= -234881025;
                                    }
                                    if ((i3 & 256) == 0) {
                                        i7 = (-1879048193) & i7;
                                        containerColor = BottomSheetDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                    } else {
                                        containerColor = j;
                                    }
                                    if ((i3 & 512) == 0) {
                                        jM2364contentColorForek8zF_U = ColorSchemeKt.m2364contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i7 >> 27) & 14);
                                        i14 &= -15;
                                    } else {
                                        jM2364contentColorForek8zF_U = j2;
                                    }
                                    float fM2226getElevationD9Ej5fM = i10 == 0 ? BottomSheetDefaults.INSTANCE.m2226getElevationD9Ej5fM() : f2;
                                    function2M2405getLambda2$material3_release = i13 == 0 ? ComposableSingletons$ModalBottomSheetKt.INSTANCE.m2405getLambda2$material3_release() : function2;
                                    float f8 = fM2227getSheetMaxWidthD9Ej5fM;
                                    if ((i3 & 4096) == 0) {
                                        shape2 = expandedShape;
                                        j3 = containerColor;
                                        float f9 = fM2226getElevationD9Ej5fM;
                                        i15 = i14 & (-7169);
                                        modifier3 = modifier2;
                                        f3 = f9;
                                        function24 = new Function2<Composer, Integer, WindowInsets>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$1
                                            public final WindowInsets invoke(Composer composer3, int i22) {
                                                composer3.startReplaceGroup(-11444670);
                                                ComposerKt.sourceInformation(composer3, "C212@9919L12:ModalBottomSheet.kt#uh7d8r");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-11444670, i22, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:212)");
                                                }
                                                WindowInsets windowInsets = BottomSheetDefaults.INSTANCE.getWindowInsets(composer3, 6);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                composer3.endReplaceGroup();
                                                return windowInsets;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ WindowInsets invoke(Composer composer3, Integer num) {
                                                return invoke(composer3, num.intValue());
                                            }
                                        };
                                        f4 = f8;
                                    } else {
                                        shape2 = expandedShape;
                                        j3 = containerColor;
                                        float f10 = fM2226getElevationD9Ej5fM;
                                        i15 = i14;
                                        modifier3 = modifier2;
                                        f3 = f10;
                                        f4 = f8;
                                        function24 = function22;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 32) != 0) {
                                        i7 &= -3670017;
                                    }
                                    if ((i3 & 128) != 0) {
                                        i7 &= -234881025;
                                    }
                                    if ((i3 & 256) != 0) {
                                        i7 &= -1879048193;
                                    }
                                    if ((i3 & 512) != 0) {
                                        i14 &= -15;
                                    }
                                    if ((i3 & 4096) != 0) {
                                        i14 &= -7169;
                                    }
                                    f4 = f;
                                    jM2364contentColorForek8zF_U = j2;
                                    function24 = function22;
                                    i15 = i14;
                                    function2M2405getLambda2$material3_release = function23;
                                    shape2 = expandedShape;
                                    modifier3 = modifier2;
                                    j3 = j;
                                    f3 = f2;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    function25 = function24;
                                } else {
                                    function25 = function24;
                                    ComposerKt.traceEventStart(-1676960531, i7, i15, "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:214)");
                                }
                                Strings.Companion companion = Strings.INSTANCE;
                                final String strM3410getString2EP1pXo = Strings_androidKt.m3410getString2EP1pXo(Strings.m3340constructorimpl(C1455R.string.m3c_bottom_sheet_pane_title), composerStartRestartGroup, 0);
                                Modifier modifier5 = modifier3;
                                Shape shape3 = shape2;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m1487widthInVpY3zN4$default(boxScope.align(modifier3, Alignment.INSTANCE.getTopCenter()), 0.0f, f4, 1, null), 0.0f, 1, null);
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1237857395, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                i16 = (3670016 & i7) ^ 1572864;
                                if (i16 > 1048576 || !composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) {
                                    f5 = f4;
                                    if ((i7 & 1572864) != 1048576) {
                                        z = false;
                                    }
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetStateRememberModalBottomSheetState, Orientation.Vertical, function1);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    long j6 = j3;
                                    Modifier modifierNestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifierFillMaxWidth$default, (NestedScrollConnection) objRememberedValue, null, 2, null);
                                    AnchoredDraggableState<SheetValue> anchoredDraggableState$material3_release = sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release();
                                    Orientation orientation = Orientation.Vertical;
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1237872435, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                    z2 = (i16 <= 1048576 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) || (i7 & 1572864) == 1048576;
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = (Function2) new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue>>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1

                                            /* compiled from: ModalBottomSheet.kt */
                                            @Metadata(m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
                                            public /* synthetic */ class WhenMappings {
                                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                                static {
                                                    int[] iArr = new int[SheetValue.values().length];
                                                    try {
                                                        iArr[SheetValue.Hidden.ordinal()] = 1;
                                                    } catch (NoSuchFieldError unused) {
                                                    }
                                                    try {
                                                        iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                                                    } catch (NoSuchFieldError unused2) {
                                                    }
                                                    try {
                                                        iArr[SheetValue.Expanded.ordinal()] = 3;
                                                    } catch (NoSuchFieldError unused3) {
                                                    }
                                                    $EnumSwitchMapping$0 = iArr;
                                                }
                                            }

                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue> invoke(IntSize intSize, Constraints constraints) {
                                                return m2681invokeGpV2Q24(intSize.getPackedValue(), constraints.getValue());
                                            }

                                            /* renamed from: invoke-GpV2Q24, reason: not valid java name */
                                            public final Pair<DraggableAnchors<SheetValue>, SheetValue> m2681invokeGpV2Q24(final long j7, long j8) {
                                                SheetValue sheetValue;
                                                final float fM7007getMaxHeightimpl = Constraints.m7007getMaxHeightimpl(j8);
                                                final SheetState sheetState3 = sheetStateRememberModalBottomSheetState;
                                                DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<SheetValue>, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1$newAnchors$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                                        invoke2(draggableAnchorsConfig);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                                        draggableAnchorsConfig.m303at(SheetValue.Hidden, fM7007getMaxHeightimpl);
                                                        if (IntSize.m7224getHeightimpl(j7) > fM7007getMaxHeightimpl / 2 && !sheetState3.getSkipPartiallyExpanded()) {
                                                            draggableAnchorsConfig.m303at(SheetValue.PartiallyExpanded, fM7007getMaxHeightimpl / 2.0f);
                                                        }
                                                        if (IntSize.m7224getHeightimpl(j7) != 0) {
                                                            draggableAnchorsConfig.m303at(SheetValue.Expanded, Math.max(0.0f, fM7007getMaxHeightimpl - IntSize.m7224getHeightimpl(j7)));
                                                        }
                                                    }
                                                });
                                                int i22 = WhenMappings.$EnumSwitchMapping$0[sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release().getTargetValue().ordinal()];
                                                if (i22 == 1) {
                                                    sheetValue = SheetValue.Hidden;
                                                } else if (i22 == 2 || i22 == 3) {
                                                    if (DraggableAnchors.hasAnchorFor(SheetValue.PartiallyExpanded)) {
                                                        sheetValue = SheetValue.PartiallyExpanded;
                                                    } else {
                                                        sheetValue = DraggableAnchors.hasAnchorFor(SheetValue.Expanded) ? SheetValue.Expanded : SheetValue.Hidden;
                                                    }
                                                } else {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                return TuplesKt.m521to(DraggableAnchors, sheetValue);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    Modifier modifierDraggableAnchors = AnchoredDraggableKt.draggableAnchors(modifierNestedScroll$default, anchoredDraggableState$material3_release, orientation, (Function2) objRememberedValue2);
                                    DraggableState draggableState = sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release().getDraggableState();
                                    Orientation orientation2 = Orientation.Vertical;
                                    boolean zIsVisible = sheetStateRememberModalBottomSheetState.isVisible();
                                    boolean zIsAnimationRunning = sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release().isAnimationRunning();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1237929350, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                    z3 = (57344 & i7) != 16384;
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (!z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = (Function3) new ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    Modifier modifierDraggable$default = DraggableKt.draggable$default(modifierDraggableAnchors, draggableState, orientation2, zIsVisible, null, zIsAnimationRunning, null, (Function3) objRememberedValue3, false, 168, null);
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1237931647, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                    zChanged = composerStartRestartGroup.changed(strM3410getString2EP1pXo);
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$5$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                invoke2(semanticsPropertyReceiver);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM3410getString2EP1pXo);
                                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 0.0f);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    z4 = false;
                                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierDraggable$default, false, (Function1) objRememberedValue4, 1, null);
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1237936755, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                    boolean z6 = (i16 <= 1048576 && composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState)) || (i7 & 1572864) == 1048576;
                                    if ((i7 & LDSFile.EF_DG16_TAG) == 32 || ((i7 & 64) != 0 && composerStartRestartGroup.changedInstance(animatable))) {
                                        z4 = true;
                                    }
                                    z5 = z4 | z6;
                                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (!z5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$6$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                invoke2(graphicsLayerScope);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                                float offset = sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release().getOffset();
                                                float fM4420getHeightimpl = Size.m4420getHeightimpl(graphicsLayerScope.getSize());
                                                if (Float.isNaN(offset) || Float.isNaN(fM4420getHeightimpl) || fM4420getHeightimpl == 0.0f) {
                                                    return;
                                                }
                                                float fFloatValue = animatable.getValue().floatValue();
                                                graphicsLayerScope.setScaleX(ModalBottomSheetKt.calculatePredictiveBackScaleX(graphicsLayerScope, fFloatValue));
                                                graphicsLayerScope.setScaleY(ModalBottomSheetKt.calculatePredictiveBackScaleY(graphicsLayerScope, fFloatValue));
                                                graphicsLayerScope.mo4788setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.5f, (offset + fM4420getHeightimpl) / fM4420getHeightimpl));
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierSemantics$default, (Function1) objRememberedValue5);
                                    final SheetState sheetState3 = sheetStateRememberModalBottomSheetState;
                                    final Function0<Unit> function03 = function02;
                                    final Function2<? super Composer, ? super Integer, Unit> function28 = function2M2405getLambda2$material3_release;
                                    Function2<? super Composer, ? super Integer, ? extends WindowInsets> function29 = function25;
                                    int i22 = i7 >> 21;
                                    int i23 = i15 << 9;
                                    long j7 = jM2364contentColorForek8zF_U;
                                    composer2 = composerStartRestartGroup;
                                    SurfaceKt.m2978SurfaceT9BRK9s(modifierGraphicsLayer, shape3, j6, j7, f3, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-692668920, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7
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

                                        public final void invoke(Composer composer3, int i24) {
                                            String str;
                                            ComposerKt.sourceInformation(composer3, "C290@13592L21,290@13629L550,289@13528L2607:ModalBottomSheet.kt#uh7d8r");
                                            if ((i24 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-692668920, i24, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:289)");
                                                }
                                                Modifier modifierWindowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), function25.invoke(composer3, 0));
                                                ComposerKt.sourceInformationMarkerStart(composer3, 320924084, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                                boolean zChangedInstance = composer3.changedInstance(animatable);
                                                final Animatable<Float, AnimationVector1D> animatable2 = animatable;
                                                Object objRememberedValue6 = composer3.rememberedValue();
                                                if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue6 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                            invoke2(graphicsLayerScope);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                                            float fFloatValue = animatable2.getValue().floatValue();
                                                            float fCalculatePredictiveBackScaleX = ModalBottomSheetKt.calculatePredictiveBackScaleX(graphicsLayerScope, fFloatValue);
                                                            float fCalculatePredictiveBackScaleY = ModalBottomSheetKt.calculatePredictiveBackScaleY(graphicsLayerScope, fFloatValue);
                                                            graphicsLayerScope.setScaleY(fCalculatePredictiveBackScaleY == 0.0f ? 1.0f : fCalculatePredictiveBackScaleX / fCalculatePredictiveBackScaleY);
                                                            graphicsLayerScope.mo4788setTransformOrigin__ExYCQ(ModalBottomSheetKt.PredictiveBackChildTransformOrigin);
                                                        }
                                                    };
                                                    composer3.updateRememberedValue(objRememberedValue6);
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                Modifier modifierGraphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(modifierWindowInsetsPadding, (Function1) objRememberedValue6);
                                                Function2<Composer, Integer, Unit> function210 = function28;
                                                final SheetState sheetState4 = sheetState3;
                                                final Function0<Unit> function04 = function03;
                                                final CoroutineScope coroutineScope2 = coroutineScope;
                                                Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                                ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierGraphicsLayer2);
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
                                                ComposerKt.sourceInformationMarkerStart(composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(composer3, 806123989, "C340@16116L9:ModalBottomSheet.kt#uh7d8r");
                                                composer3.startReplaceGroup(-1636564008);
                                                ComposerKt.sourceInformation(composer3, "303@14272L54,304@14368L48,305@14457L47,309@14672L1346,306@14521L1568");
                                                if (function210 != null) {
                                                    Strings.Companion companion2 = Strings.INSTANCE;
                                                    final String strM3410getString2EP1pXo2 = Strings_androidKt.m3410getString2EP1pXo(Strings.m3340constructorimpl(C1455R.string.m3c_bottom_sheet_collapse_description), composer3, 0);
                                                    Strings.Companion companion3 = Strings.INSTANCE;
                                                    final String strM3410getString2EP1pXo3 = Strings_androidKt.m3410getString2EP1pXo(Strings.m3340constructorimpl(C1455R.string.m3c_bottom_sheet_dismiss_description), composer3, 0);
                                                    Strings.Companion companion4 = Strings.INSTANCE;
                                                    final String strM3410getString2EP1pXo4 = Strings_androidKt.m3410getString2EP1pXo(Strings.m3340constructorimpl(C1455R.string.m3c_bottom_sheet_expand_description), composer3, 0);
                                                    Modifier modifierAlign = columnScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally());
                                                    ComposerKt.sourceInformationMarkerStart(composer3, -1636549585, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                                    boolean zChanged2 = composer3.changed(sheetState4) | composer3.changed(strM3410getString2EP1pXo3) | composer3.changed(function04) | composer3.changed(strM3410getString2EP1pXo4) | composer3.changedInstance(coroutineScope2) | composer3.changed(strM3410getString2EP1pXo2);
                                                    Object objRememberedValue7 = composer3.rememberedValue();
                                                    if (zChanged2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                        str = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
                                                        objRememberedValue7 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                invoke2(semanticsPropertyReceiver);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                final SheetState sheetState5 = sheetState4;
                                                                String str2 = strM3410getString2EP1pXo3;
                                                                String str3 = strM3410getString2EP1pXo4;
                                                                String str4 = strM3410getString2EP1pXo2;
                                                                final Function0<Unit> function05 = function04;
                                                                final CoroutineScope coroutineScope3 = coroutineScope2;
                                                                SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str2, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(0);
                                                                    }

                                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Boolean invoke() {
                                                                        function05.invoke();
                                                                        return true;
                                                                    }
                                                                });
                                                                if (sheetState5.getCurrentValue() == SheetValue.PartiallyExpanded) {
                                                                    SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str3, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        /* compiled from: ModalBottomSheet.kt */
                                                                        @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
                                                                        @DebugMetadata(m532c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1", m533f = "ModalBottomSheet.kt", m534i = {}, m535l = {321}, m536m = "invokeSuspend", m537n = {}, m538s = {})
                                                                        /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1 */
                                                                        static final class C14051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                            final /* synthetic */ SheetState $sheetState;
                                                                            int label;

                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            C14051(SheetState sheetState, Continuation<? super C14051> continuation) {
                                                                                super(2, continuation);
                                                                                this.$sheetState = sheetState;
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                                return new C14051(this.$sheetState, continuation);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function2
                                                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                                return ((C14051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final Object invokeSuspend(Object obj) {
                                                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                int i = this.label;
                                                                                if (i == 0) {
                                                                                    ResultKt.throwOnFailure(obj);
                                                                                    this.label = 1;
                                                                                    if (this.$sheetState.expand(this) == coroutine_suspended) {
                                                                                        return coroutine_suspended;
                                                                                    }
                                                                                } else {
                                                                                    if (i != 1) {
                                                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                    }
                                                                                    ResultKt.throwOnFailure(obj);
                                                                                }
                                                                                return Unit.INSTANCE;
                                                                            }
                                                                        }

                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Boolean invoke() {
                                                                            if (sheetState5.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded).booleanValue()) {
                                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C14051(sheetState5, null), 3, null);
                                                                            }
                                                                            return true;
                                                                        }
                                                                    });
                                                                } else if (sheetState5.getHasPartiallyExpandedState()) {
                                                                    SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str4, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Boolean invoke() {
                                                                            if (sheetState5.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.PartiallyExpanded).booleanValue()) {
                                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C14061(sheetState5, null), 3, null);
                                                                            }
                                                                            return true;
                                                                        }

                                                                        /* compiled from: ModalBottomSheet.kt */
                                                                        @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
                                                                        @DebugMetadata(m532c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1", m533f = "ModalBottomSheet.kt", m534i = {}, m535l = {330}, m536m = "invokeSuspend", m537n = {}, m538s = {})
                                                                        /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1 */
                                                                        static final class C14061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                            final /* synthetic */ SheetState $this_with;
                                                                            int label;

                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            C14061(SheetState sheetState, Continuation<? super C14061> continuation) {
                                                                                super(2, continuation);
                                                                                this.$this_with = sheetState;
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                                return new C14061(this.$this_with, continuation);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function2
                                                                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                                return ((C14061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                            }

                                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                            public final Object invokeSuspend(Object obj) {
                                                                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                int i = this.label;
                                                                                if (i == 0) {
                                                                                    ResultKt.throwOnFailure(obj);
                                                                                    this.label = 1;
                                                                                    if (this.$this_with.partialExpand(this) == coroutine_suspended) {
                                                                                        return coroutine_suspended;
                                                                                    }
                                                                                } else {
                                                                                    if (i != 1) {
                                                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                    }
                                                                                    ResultKt.throwOnFailure(obj);
                                                                                }
                                                                                return Unit.INSTANCE;
                                                                            }
                                                                        }
                                                                    });
                                                                }
                                                            }
                                                        };
                                                        composer3.updateRememberedValue(objRememberedValue7);
                                                    } else {
                                                        str = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierAlign, true, (Function1) objRememberedValue7);
                                                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str);
                                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierSemantics);
                                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                    if (!(composer3.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer3.startReusableNode();
                                                    if (composer3.getInserting()) {
                                                        composer3.createNode(constructor2);
                                                    } else {
                                                        composer3.useNode();
                                                    }
                                                    Composer composerM4088constructorimpl2 = Updater.m4088constructorimpl(composer3);
                                                    Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                        composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                        composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                    }
                                                    Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                                    ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                    ComposerKt.sourceInformationMarkerStart(composer3, -760467413, "C337@16059L12:ModalBottomSheet.kt#uh7d8r");
                                                    function210.invoke(composer3, 0);
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    composer3.endNode();
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                                }
                                                composer3.endReplaceGroup();
                                                function32.invoke(columnScopeInstance, composer3, 6);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                ComposerKt.sourceInformationMarkerEnd(composer3);
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
                                    }, composerStartRestartGroup, 54), composer2, (i22 & 896) | (i22 & LDSFile.EF_DG16_TAG) | 12582912 | (i23 & 7168) | (i23 & 57344), 96);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    sheetState2 = sheetState3;
                                    function26 = function28;
                                    function27 = function29;
                                    expandedShape = shape3;
                                    f6 = f3;
                                    modifier4 = modifier5;
                                    f7 = f5;
                                    j4 = j7;
                                    j5 = j6;
                                } else {
                                    f5 = f4;
                                }
                                z = true;
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (z) {
                                    objRememberedValue = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetStateRememberModalBottomSheetState, Orientation.Vertical, function1);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    long j62 = j3;
                                    Modifier modifierNestedScroll$default2 = NestedScrollModifierKt.nestedScroll$default(modifierFillMaxWidth$default, (NestedScrollConnection) objRememberedValue, null, 2, null);
                                    AnchoredDraggableState<SheetValue> anchoredDraggableState$material3_release2 = sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release();
                                    Orientation orientation3 = Orientation.Vertical;
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1237872435, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                    if (i16 <= 1048576) {
                                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (z2) {
                                            objRememberedValue2 = (Function2) new Function2<IntSize, Constraints, Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue>>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1

                                                /* compiled from: ModalBottomSheet.kt */
                                                @Metadata(m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
                                                public /* synthetic */ class WhenMappings {
                                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                                    static {
                                                        int[] iArr = new int[SheetValue.values().length];
                                                        try {
                                                            iArr[SheetValue.Hidden.ordinal()] = 1;
                                                        } catch (NoSuchFieldError unused) {
                                                        }
                                                        try {
                                                            iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                                                        } catch (NoSuchFieldError unused2) {
                                                        }
                                                        try {
                                                            iArr[SheetValue.Expanded.ordinal()] = 3;
                                                        } catch (NoSuchFieldError unused3) {
                                                        }
                                                        $EnumSwitchMapping$0 = iArr;
                                                    }
                                                }

                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Pair<? extends DraggableAnchors<SheetValue>, ? extends SheetValue> invoke(IntSize intSize, Constraints constraints) {
                                                    return m2681invokeGpV2Q24(intSize.getPackedValue(), constraints.getValue());
                                                }

                                                /* renamed from: invoke-GpV2Q24, reason: not valid java name */
                                                public final Pair<DraggableAnchors<SheetValue>, SheetValue> m2681invokeGpV2Q24(final long j72, long j8) {
                                                    SheetValue sheetValue;
                                                    final float fM7007getMaxHeightimpl = Constraints.m7007getMaxHeightimpl(j8);
                                                    final SheetState sheetState32 = sheetStateRememberModalBottomSheetState;
                                                    DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new Function1<DraggableAnchorsConfig<SheetValue>, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$3$1$newAnchors$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                                            invoke2(draggableAnchorsConfig);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(DraggableAnchorsConfig<SheetValue> draggableAnchorsConfig) {
                                                            draggableAnchorsConfig.m303at(SheetValue.Hidden, fM7007getMaxHeightimpl);
                                                            if (IntSize.m7224getHeightimpl(j72) > fM7007getMaxHeightimpl / 2 && !sheetState32.getSkipPartiallyExpanded()) {
                                                                draggableAnchorsConfig.m303at(SheetValue.PartiallyExpanded, fM7007getMaxHeightimpl / 2.0f);
                                                            }
                                                            if (IntSize.m7224getHeightimpl(j72) != 0) {
                                                                draggableAnchorsConfig.m303at(SheetValue.Expanded, Math.max(0.0f, fM7007getMaxHeightimpl - IntSize.m7224getHeightimpl(j72)));
                                                            }
                                                        }
                                                    });
                                                    int i222 = WhenMappings.$EnumSwitchMapping$0[sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release().getTargetValue().ordinal()];
                                                    if (i222 == 1) {
                                                        sheetValue = SheetValue.Hidden;
                                                    } else if (i222 == 2 || i222 == 3) {
                                                        if (DraggableAnchors.hasAnchorFor(SheetValue.PartiallyExpanded)) {
                                                            sheetValue = SheetValue.PartiallyExpanded;
                                                        } else {
                                                            sheetValue = DraggableAnchors.hasAnchorFor(SheetValue.Expanded) ? SheetValue.Expanded : SheetValue.Hidden;
                                                        }
                                                    } else {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    return TuplesKt.m521to(DraggableAnchors, sheetValue);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            Modifier modifierDraggableAnchors2 = AnchoredDraggableKt.draggableAnchors(modifierNestedScroll$default2, anchoredDraggableState$material3_release2, orientation3, (Function2) objRememberedValue2);
                                            DraggableState draggableState2 = sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release().getDraggableState();
                                            Orientation orientation22 = Orientation.Vertical;
                                            boolean zIsVisible2 = sheetStateRememberModalBottomSheetState.isVisible();
                                            boolean zIsAnimationRunning2 = sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release().isAnimationRunning();
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1237929350, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                            if ((57344 & i7) != 16384) {
                                            }
                                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                            if (!z3) {
                                                objRememberedValue3 = (Function3) new ModalBottomSheetKt$ModalBottomSheetContent$4$1(function1, null);
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                Modifier modifierDraggable$default2 = DraggableKt.draggable$default(modifierDraggableAnchors2, draggableState2, orientation22, zIsVisible2, null, zIsAnimationRunning2, null, (Function3) objRememberedValue3, false, 168, null);
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1237931647, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                                zChanged = composerStartRestartGroup.changed(strM3410getString2EP1pXo);
                                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                                if (!zChanged) {
                                                    objRememberedValue4 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$5$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                            invoke2(semanticsPropertyReceiver);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                            SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, strM3410getString2EP1pXo);
                                                            SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 0.0f);
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    z4 = false;
                                                    Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(modifierDraggable$default2, false, (Function1) objRememberedValue4, 1, null);
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1237936755, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                                    if (i16 <= 1048576) {
                                                        if ((i7 & LDSFile.EF_DG16_TAG) == 32) {
                                                            z4 = true;
                                                            z5 = z4 | z6;
                                                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                                            if (!z5) {
                                                                objRememberedValue5 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$6$1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(1);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                                        invoke2(graphicsLayerScope);
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                                                        float offset = sheetStateRememberModalBottomSheetState.getAnchoredDraggableState$material3_release().getOffset();
                                                                        float fM4420getHeightimpl = Size.m4420getHeightimpl(graphicsLayerScope.getSize());
                                                                        if (Float.isNaN(offset) || Float.isNaN(fM4420getHeightimpl) || fM4420getHeightimpl == 0.0f) {
                                                                            return;
                                                                        }
                                                                        float fFloatValue = animatable.getValue().floatValue();
                                                                        graphicsLayerScope.setScaleX(ModalBottomSheetKt.calculatePredictiveBackScaleX(graphicsLayerScope, fFloatValue));
                                                                        graphicsLayerScope.setScaleY(ModalBottomSheetKt.calculatePredictiveBackScaleY(graphicsLayerScope, fFloatValue));
                                                                        graphicsLayerScope.mo4788setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.5f, (offset + fM4420getHeightimpl) / fM4420getHeightimpl));
                                                                    }
                                                                };
                                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                Modifier modifierGraphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(modifierSemantics$default2, (Function1) objRememberedValue5);
                                                                final SheetState sheetState32 = sheetStateRememberModalBottomSheetState;
                                                                final Function0<Unit> function032 = function02;
                                                                final Function2<? super Composer, ? super Integer, Unit> function282 = function2M2405getLambda2$material3_release;
                                                                Function2<? super Composer, ? super Integer, ? extends WindowInsets> function292 = function25;
                                                                int i222 = i7 >> 21;
                                                                int i232 = i15 << 9;
                                                                long j72 = jM2364contentColorForek8zF_U;
                                                                composer2 = composerStartRestartGroup;
                                                                SurfaceKt.m2978SurfaceT9BRK9s(modifierGraphicsLayer2, shape3, j62, j72, f3, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-692668920, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7
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

                                                                    public final void invoke(Composer composer3, int i24) {
                                                                        String str;
                                                                        ComposerKt.sourceInformation(composer3, "C290@13592L21,290@13629L550,289@13528L2607:ModalBottomSheet.kt#uh7d8r");
                                                                        if ((i24 & 3) != 2 || !composer3.getSkipping()) {
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventStart(-692668920, i24, -1, "androidx.compose.material3.ModalBottomSheetContent.<anonymous> (ModalBottomSheet.kt:289)");
                                                                            }
                                                                            Modifier modifierWindowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), function25.invoke(composer3, 0));
                                                                            ComposerKt.sourceInformationMarkerStart(composer3, 320924084, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                                                            boolean zChangedInstance = composer3.changedInstance(animatable);
                                                                            final Animatable<Float, AnimationVector1D> animatable2 = animatable;
                                                                            Object objRememberedValue6 = composer3.rememberedValue();
                                                                            if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                                                objRememberedValue6 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$1$1
                                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                    {
                                                                                        super(1);
                                                                                    }

                                                                                    @Override // kotlin.jvm.functions.Function1
                                                                                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                                                        invoke2(graphicsLayerScope);
                                                                                        return Unit.INSTANCE;
                                                                                    }

                                                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                                                                        float fFloatValue = animatable2.getValue().floatValue();
                                                                                        float fCalculatePredictiveBackScaleX = ModalBottomSheetKt.calculatePredictiveBackScaleX(graphicsLayerScope, fFloatValue);
                                                                                        float fCalculatePredictiveBackScaleY = ModalBottomSheetKt.calculatePredictiveBackScaleY(graphicsLayerScope, fFloatValue);
                                                                                        graphicsLayerScope.setScaleY(fCalculatePredictiveBackScaleY == 0.0f ? 1.0f : fCalculatePredictiveBackScaleX / fCalculatePredictiveBackScaleY);
                                                                                        graphicsLayerScope.mo4788setTransformOrigin__ExYCQ(ModalBottomSheetKt.PredictiveBackChildTransformOrigin);
                                                                                    }
                                                                                };
                                                                                composer3.updateRememberedValue(objRememberedValue6);
                                                                            }
                                                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                            Modifier modifierGraphicsLayer22 = GraphicsLayerModifierKt.graphicsLayer(modifierWindowInsetsPadding, (Function1) objRememberedValue6);
                                                                            Function2<Composer, Integer, Unit> function210 = function282;
                                                                            final SheetState sheetState4 = sheetState32;
                                                                            final Function0<Unit> function04 = function032;
                                                                            final CoroutineScope coroutineScope2 = coroutineScope;
                                                                            Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                                                            ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                                                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                                                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierGraphicsLayer22);
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
                                                                            ComposerKt.sourceInformationMarkerStart(composer3, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                                                                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                                            ComposerKt.sourceInformationMarkerStart(composer3, 806123989, "C340@16116L9:ModalBottomSheet.kt#uh7d8r");
                                                                            composer3.startReplaceGroup(-1636564008);
                                                                            ComposerKt.sourceInformation(composer3, "303@14272L54,304@14368L48,305@14457L47,309@14672L1346,306@14521L1568");
                                                                            if (function210 != null) {
                                                                                Strings.Companion companion2 = Strings.INSTANCE;
                                                                                final String strM3410getString2EP1pXo2 = Strings_androidKt.m3410getString2EP1pXo(Strings.m3340constructorimpl(C1455R.string.m3c_bottom_sheet_collapse_description), composer3, 0);
                                                                                Strings.Companion companion3 = Strings.INSTANCE;
                                                                                final String strM3410getString2EP1pXo3 = Strings_androidKt.m3410getString2EP1pXo(Strings.m3340constructorimpl(C1455R.string.m3c_bottom_sheet_dismiss_description), composer3, 0);
                                                                                Strings.Companion companion4 = Strings.INSTANCE;
                                                                                final String strM3410getString2EP1pXo4 = Strings_androidKt.m3410getString2EP1pXo(Strings.m3340constructorimpl(C1455R.string.m3c_bottom_sheet_expand_description), composer3, 0);
                                                                                Modifier modifierAlign = columnScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally());
                                                                                ComposerKt.sourceInformationMarkerStart(composer3, -1636549585, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                                                                boolean zChanged2 = composer3.changed(sheetState4) | composer3.changed(strM3410getString2EP1pXo3) | composer3.changed(function04) | composer3.changed(strM3410getString2EP1pXo4) | composer3.changedInstance(coroutineScope2) | composer3.changed(strM3410getString2EP1pXo2);
                                                                                Object objRememberedValue7 = composer3.rememberedValue();
                                                                                if (zChanged2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                                                    str = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
                                                                                    objRememberedValue7 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1
                                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                        {
                                                                                            super(1);
                                                                                        }

                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                                            invoke2(semanticsPropertyReceiver);
                                                                                            return Unit.INSTANCE;
                                                                                        }

                                                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                                            final SheetState sheetState5 = sheetState4;
                                                                                            String str2 = strM3410getString2EP1pXo3;
                                                                                            String str3 = strM3410getString2EP1pXo4;
                                                                                            String str4 = strM3410getString2EP1pXo2;
                                                                                            final Function0<Unit> function05 = function04;
                                                                                            final CoroutineScope coroutineScope3 = coroutineScope2;
                                                                                            SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str2, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$1
                                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                {
                                                                                                    super(0);
                                                                                                }

                                                                                                /* JADX WARN: Can't rename method to resolve collision */
                                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                                public final Boolean invoke() {
                                                                                                    function05.invoke();
                                                                                                    return true;
                                                                                                }
                                                                                            });
                                                                                            if (sheetState5.getCurrentValue() == SheetValue.PartiallyExpanded) {
                                                                                                SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str3, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2
                                                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                    {
                                                                                                        super(0);
                                                                                                    }

                                                                                                    /* compiled from: ModalBottomSheet.kt */
                                                                                                    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
                                                                                                    @DebugMetadata(m532c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1", m533f = "ModalBottomSheet.kt", m534i = {}, m535l = {321}, m536m = "invokeSuspend", m537n = {}, m538s = {})
                                                                                                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$2$1 */
                                                                                                    static final class C14051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                                                        final /* synthetic */ SheetState $sheetState;
                                                                                                        int label;

                                                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                        C14051(SheetState sheetState, Continuation<? super C14051> continuation) {
                                                                                                            super(2, continuation);
                                                                                                            this.$sheetState = sheetState;
                                                                                                        }

                                                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                                                            return new C14051(this.$sheetState, continuation);
                                                                                                        }

                                                                                                        @Override // kotlin.jvm.functions.Function2
                                                                                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                                                            return ((C14051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                                                        }

                                                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                        public final Object invokeSuspend(Object obj) {
                                                                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                                            int i = this.label;
                                                                                                            if (i == 0) {
                                                                                                                ResultKt.throwOnFailure(obj);
                                                                                                                this.label = 1;
                                                                                                                if (this.$sheetState.expand(this) == coroutine_suspended) {
                                                                                                                    return coroutine_suspended;
                                                                                                                }
                                                                                                            } else {
                                                                                                                if (i != 1) {
                                                                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                                }
                                                                                                                ResultKt.throwOnFailure(obj);
                                                                                                            }
                                                                                                            return Unit.INSTANCE;
                                                                                                        }
                                                                                                    }

                                                                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                                                                    @Override // kotlin.jvm.functions.Function0
                                                                                                    public final Boolean invoke() {
                                                                                                        if (sheetState5.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.Expanded).booleanValue()) {
                                                                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C14051(sheetState5, null), 3, null);
                                                                                                        }
                                                                                                        return true;
                                                                                                    }
                                                                                                });
                                                                                            } else if (sheetState5.getHasPartiallyExpandedState()) {
                                                                                                SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str4, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3
                                                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                    {
                                                                                                        super(0);
                                                                                                    }

                                                                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                                                                    @Override // kotlin.jvm.functions.Function0
                                                                                                    public final Boolean invoke() {
                                                                                                        if (sheetState5.getAnchoredDraggableState$material3_release().getConfirmValueChange$material3_release().invoke(SheetValue.PartiallyExpanded).booleanValue()) {
                                                                                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new C14061(sheetState5, null), 3, null);
                                                                                                        }
                                                                                                        return true;
                                                                                                    }

                                                                                                    /* compiled from: ModalBottomSheet.kt */
                                                                                                    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
                                                                                                    @DebugMetadata(m532c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1", m533f = "ModalBottomSheet.kt", m534i = {}, m535l = {330}, m536m = "invokeSuspend", m537n = {}, m538s = {})
                                                                                                    /* renamed from: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7$2$1$1$1$3$1 */
                                                                                                    static final class C14061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                                                        final /* synthetic */ SheetState $this_with;
                                                                                                        int label;

                                                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                        C14061(SheetState sheetState, Continuation<? super C14061> continuation) {
                                                                                                            super(2, continuation);
                                                                                                            this.$this_with = sheetState;
                                                                                                        }

                                                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                                                                            return new C14061(this.$this_with, continuation);
                                                                                                        }

                                                                                                        @Override // kotlin.jvm.functions.Function2
                                                                                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                                                                            return ((C14061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                                                                        }

                                                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                                                        public final Object invokeSuspend(Object obj) {
                                                                                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                                                            int i = this.label;
                                                                                                            if (i == 0) {
                                                                                                                ResultKt.throwOnFailure(obj);
                                                                                                                this.label = 1;
                                                                                                                if (this.$this_with.partialExpand(this) == coroutine_suspended) {
                                                                                                                    return coroutine_suspended;
                                                                                                                }
                                                                                                            } else {
                                                                                                                if (i != 1) {
                                                                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                                                }
                                                                                                                ResultKt.throwOnFailure(obj);
                                                                                                            }
                                                                                                            return Unit.INSTANCE;
                                                                                                        }
                                                                                                    }
                                                                                                });
                                                                                            }
                                                                                        }
                                                                                    };
                                                                                    composer3.updateRememberedValue(objRememberedValue7);
                                                                                } else {
                                                                                    str = "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh";
                                                                                }
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                                Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierAlign, true, (Function1) objRememberedValue7);
                                                                                ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str);
                                                                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierSemantics);
                                                                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                                if (!(composer3.getApplier() instanceof Applier)) {
                                                                                    ComposablesKt.invalidApplier();
                                                                                }
                                                                                composer3.startReusableNode();
                                                                                if (composer3.getInserting()) {
                                                                                    composer3.createNode(constructor2);
                                                                                } else {
                                                                                    composer3.useNode();
                                                                                }
                                                                                Composer composerM4088constructorimpl2 = Updater.m4088constructorimpl(composer3);
                                                                                Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                                Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                                if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                                    composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                                    composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                                                }
                                                                                Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                                                                ComposerKt.sourceInformationMarkerStart(composer3, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                                ComposerKt.sourceInformationMarkerStart(composer3, -760467413, "C337@16059L12:ModalBottomSheet.kt#uh7d8r");
                                                                                function210.invoke(composer3, 0);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                                composer3.endNode();
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                            }
                                                                            composer3.endReplaceGroup();
                                                                            function32.invoke(columnScopeInstance, composer3, 6);
                                                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                            ComposerKt.sourceInformationMarkerEnd(composer3);
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
                                                                }, composerStartRestartGroup, 54), composer2, (i222 & 896) | (i222 & LDSFile.EF_DG16_TAG) | 12582912 | (i232 & 7168) | (i232 & 57344), 96);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                sheetState2 = sheetState32;
                                                                function26 = function282;
                                                                function27 = function292;
                                                                expandedShape = shape3;
                                                                f6 = f3;
                                                                modifier4 = modifier5;
                                                                f7 = f5;
                                                                j4 = j72;
                                                                j5 = j62;
                                                            }
                                                        }
                                                    } else {
                                                        if ((i7 & LDSFile.EF_DG16_TAG) == 32) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (z2) {
                                        }
                                    }
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                j5 = j;
                                f6 = f2;
                                function27 = function22;
                                composer2 = composerStartRestartGroup;
                                function26 = function23;
                                sheetState2 = sheetStateRememberModalBottomSheetState;
                                modifier4 = modifier2;
                                f7 = f;
                                j4 = j2;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$8
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

                                    public final void invoke(Composer composer3, int i24) {
                                        ModalBottomSheetKt.m2678ModalBottomSheetContentIQkwcL4(boxScope, animatable, coroutineScope, function0, function1, modifier4, sheetState2, f7, expandedShape, j5, j4, f6, function26, function27, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i14 |= 24576;
                        if ((i7 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i5 != 0) {
                                }
                                if ((i3 & 32) != 0) {
                                }
                                if (i6 == 0) {
                                }
                                if ((i3 & 128) != 0) {
                                }
                                if ((i3 & 256) == 0) {
                                }
                                if ((i3 & 512) == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                float f82 = fM2227getSheetMaxWidthD9Ej5fM;
                                if ((i3 & 4096) == 0) {
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                Strings.Companion companion2 = Strings.INSTANCE;
                                final String strM3410getString2EP1pXo2 = Strings_androidKt.m3410getString2EP1pXo(Strings.m3340constructorimpl(C1455R.string.m3c_bottom_sheet_pane_title), composerStartRestartGroup, 0);
                                Modifier modifier52 = modifier3;
                                Shape shape32 = shape2;
                                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(SizeKt.m1487widthInVpY3zN4$default(boxScope.align(modifier3, Alignment.INSTANCE.getTopCenter()), 0.0f, f4, 1, null), 0.0f, 1, null);
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1237857395, "CC(remember):ModalBottomSheet.kt#9igjgp");
                                i16 = (3670016 & i7) ^ 1572864;
                                if (i16 > 1048576) {
                                    f5 = f4;
                                    if ((i7 & 1572864) != 1048576) {
                                        z = true;
                                    }
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (z) {
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    function23 = function2;
                    int i212 = i11;
                    if ((i2 & 3072) == 0) {
                    }
                    if ((i3 & 8192) == 0) {
                    }
                    if ((i7 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i11 = i12;
                i13 = i3 & 2048;
                if (i13 == 0) {
                }
                function23 = function2;
                int i2122 = i11;
                if ((i2 & 3072) == 0) {
                }
                if ((i3 & 8192) == 0) {
                }
                if ((i7 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function02 = function0;
            if ((i3 & 8) != 0) {
            }
            i5 = i3 & 16;
            if (i5 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) == 0) {
            }
            int i202 = i8;
            i9 = i3 & 1024;
            if (i9 != 0) {
            }
            i11 = i12;
            i13 = i3 & 2048;
            if (i13 == 0) {
            }
            function23 = function2;
            int i21222 = i11;
            if ((i2 & 3072) == 0) {
            }
            if ((i3 & 8192) == 0) {
            }
            if ((i7 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        function02 = function0;
        if ((i3 & 8) != 0) {
        }
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) == 0) {
        }
        int i2022 = i8;
        i9 = i3 & 1024;
        if (i9 != 0) {
        }
        i11 = i12;
        i13 = i3 & 2048;
        if (i13 == 0) {
        }
        function23 = function2;
        int i212222 = i11;
        if ((i2 & 3072) == 0) {
        }
        if ((i3 & 8192) == 0) {
        }
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleX(GraphicsLayerScope graphicsLayerScope, float f) {
        float fM4423getWidthimpl = Size.m4423getWidthimpl(graphicsLayerScope.getSize());
        if (Float.isNaN(fM4423getWidthimpl) || fM4423getWidthimpl == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo1127toPx0680j_4(PredictiveBackMaxScaleXDistance), fM4423getWidthimpl), f) / fM4423getWidthimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleY(GraphicsLayerScope graphicsLayerScope, float f) {
        float fM4420getHeightimpl = Size.m4420getHeightimpl(graphicsLayerScope.getSize());
        if (Float.isNaN(fM4420getHeightimpl) || fM4420getHeightimpl == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo1127toPx0680j_4(PredictiveBackMaxScaleYDistance), fM4420getHeightimpl), f) / fM4420getHeightimpl);
    }

    public static final SheetState rememberModalBottomSheetState(boolean z, Function1<? super SheetValue, Boolean> function1, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -778250030, "C(rememberModalBottomSheetState)P(1)400@18058L160:ModalBottomSheet.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            function1 = new Function1<SheetValue, Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt.rememberModalBottomSheetState.1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(SheetValue sheetValue) {
                    return true;
                }
            };
        }
        Function1<? super SheetValue, Boolean> function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-778250030, i, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.kt:400)");
        }
        SheetState sheetStateRememberSheetState = SheetDefaultsKt.rememberSheetState(z2, function12, SheetValue.Hidden, false, composer, (i & 14) | 384 | (i & LDSFile.EF_DG16_TAG), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return sheetStateRememberSheetState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m2679Scrim3JVO9M(final long j, final Function0<Unit> function0, final boolean z, Composer composer, final int i) {
        int i2;
        Modifier.Companion companionSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(951870469);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Scrim)P(0:c#ui.graphics.Color)410@18376L87,411@18489L29,426@19112L79,426@19062L129:ModalBottomSheet.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(951870469, i2, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.kt:407)");
            }
            if (j != 16) {
                int i3 = i2;
                final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                Strings.Companion companion = Strings.INSTANCE;
                final String strM3410getString2EP1pXo = Strings_androidKt.m3410getString2EP1pXo(Strings.m3340constructorimpl(C1750R.string.close_sheet), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1785653838);
                ComposerKt.sourceInformation(composerStartRestartGroup, "414@18629L44,415@18730L263");
                if (z) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1785652017, "CC(remember):ModalBottomSheet.kt#9igjgp");
                    int i4 = i3 & LDSFile.EF_DG16_TAG;
                    boolean z2 = i4 == 32;
                    ModalBottomSheetKt$Scrim$dismissSheet$1$1 modalBottomSheetKt$Scrim$dismissSheet$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2 || modalBottomSheetKt$Scrim$dismissSheet$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                        modalBottomSheetKt$Scrim$dismissSheet$1$1RememberedValue = new ModalBottomSheetKt$Scrim$dismissSheet$1$1(function0, null);
                        composerStartRestartGroup.updateRememberedValue(modalBottomSheetKt$Scrim$dismissSheet$1$1RememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) modalBottomSheetKt$Scrim$dismissSheet$1$1RememberedValue);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1785648566, "CC(remember):ModalBottomSheet.kt#9igjgp");
                    boolean zChanged = (i4 == 32) | composerStartRestartGroup.changed(strM3410getString2EP1pXo);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 1.0f);
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM3410getString2EP1pXo);
                                final Function0<Unit> function02 = function0;
                                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Boolean invoke() {
                                        function02.invoke();
                                        return true;
                                    }
                                }, 1, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    companionSemantics = SemanticsModifierKt.semantics(modifierPointerInput, true, (Function1) objRememberedValue);
                } else {
                    companionSemantics = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(companionSemantics);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1785636526, "CC(remember):ModalBottomSheet.kt#9igjgp");
                boolean zChanged2 = composerStartRestartGroup.changed(stateAnimateFloatAsState) | ((i3 & 14) == 4);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            DrawScope.m5145drawRectnJ9OG0$default(drawScope, j, 0L, 0L, RangesKt.coerceIn(ModalBottomSheetKt.Scrim_3J_VO9M$lambda$10(stateAnimateFloatAsState), 0.0f, 1.0f), null, null, 0, LDSFile.EF_DG4_TAG, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    ModalBottomSheetKt.m2679Scrim3JVO9M(j, function0, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$10(State<Float> state) {
        return state.getValue().floatValue();
    }
}
