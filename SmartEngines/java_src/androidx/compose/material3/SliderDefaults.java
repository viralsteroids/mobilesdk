package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.RotateKt;
import androidx.compose.p000ui.geometry.CornerRadiusKt;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.geometry.OffsetKt;
import androidx.compose.p000ui.geometry.RectKt;
import androidx.compose.p000ui.geometry.RoundRect;
import androidx.compose.p000ui.geometry.RoundRectKt;
import androidx.compose.p000ui.geometry.Size;
import androidx.compose.p000ui.graphics.AndroidPath_androidKt;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ColorKt;
import androidx.compose.p000ui.graphics.Path;
import androidx.compose.p000ui.graphics.PointMode;
import androidx.compose.p000ui.graphics.StrokeCap;
import androidx.compose.p000ui.graphics.drawscope.DrawScope;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.p000ui.unit.DpSize;
import androidx.compose.p000ui.unit.LayoutDirection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.jmrtd.lds.LDSFile;

/* compiled from: Slider.kt */
@Metadata(m513d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JB\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010!J\u0096\u0001\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u0017\u001a\u00020\r2!\b\u0002\u0010\"\u001a\u001b\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010#¢\u0006\u0002\b&2%\b\u0002\u0010'\u001a\u001f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(¢\u0006\u0002\b&2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-J3\u0010\u001e\u001a\u00020\u00122\u0006\u0010.\u001a\u00020/2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u00100J3\u0010\u001e\u001a\u00020\u00122\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u00103J\u0096\u0001\u0010\u001e\u001a\u00020\u00122\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u0017\u001a\u00020\r2!\b\u0002\u0010\"\u001a\u001b\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010#¢\u0006\u0002\b&2%\b\u0002\u0010'\u001a\u001f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(¢\u0006\u0002\b&2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u00104J\r\u0010\u0017\u001a\u00020\rH\u0007¢\u0006\u0002\u00105Jv\u0010\u0017\u001a\u00020\r2\b\b\u0002\u00106\u001a\u00020)2\b\b\u0002\u00107\u001a\u00020)2\b\b\u0002\u00108\u001a\u00020)2\b\b\u0002\u00109\u001a\u00020)2\b\b\u0002\u0010:\u001a\u00020)2\b\b\u0002\u0010;\u001a\u00020)2\b\b\u0002\u0010<\u001a\u00020)2\b\b\u0002\u0010=\u001a\u00020)2\b\b\u0002\u0010>\u001a\u00020)2\b\b\u0002\u0010?\u001a\u00020)H\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ2\u0010\"\u001a\u00020\u00122\u0006\u0010B\u001a\u00020$2\u0006\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020\u00042\u0006\u0010E\u001a\u00020)H\u0002ø\u0001\u0000¢\u0006\u0004\bF\u0010GJÄ\u0001\u0010H\u001a\u00020\u0012*\u00020$2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020L2\u0006\u00109\u001a\u00020)2\u0006\u00107\u001a\u00020)2\u0006\u0010:\u001a\u00020)2\u0006\u00108\u001a\u00020)2\u0006\u0010N\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u001f\u0010\"\u001a\u001b\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010#¢\u0006\u0002\b&2#\u0010'\u001a\u001f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(¢\u0006\u0002\b&2\u0006\u0010Q\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ>\u0010T\u001a\u00020\u0012*\u00020$2\u0006\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020U2\u0006\u0010E\u001a\u00020)2\u0006\u0010V\u001a\u00020L2\u0006\u0010W\u001a\u00020LH\u0002ø\u0001\u0000¢\u0006\u0004\bX\u0010YR\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\u00020\r*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, m514d2 = {"Landroidx/compose/material3/SliderDefaults;", "", "()V", "TickSize", "Landroidx/compose/ui/unit/Dp;", "getTickSize-D9Ej5fM", "()F", "F", "TrackStopIndicatorSize", "getTrackStopIndicatorSize-D9Ej5fM", "trackPath", "Landroidx/compose/ui/graphics/Path;", "defaultSliderColors", "Landroidx/compose/material3/SliderColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultSliderColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SliderColors;", "Thumb", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "modifier", "Landroidx/compose/ui/Modifier;", "colors", "enabled", "", "thumbSize", "Landroidx/compose/ui/unit/DpSize;", "Thumb-9LiSoMs", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJLandroidx/compose/runtime/Composer;II)V", "Track", "rangeSliderState", "Landroidx/compose/material3/RangeSliderState;", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "drawStopIndicator", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "drawTick", "Lkotlin/Function3;", "Landroidx/compose/ui/graphics/Color;", "thumbTrackGapSize", "trackInsideCornerSize", "Track-4EFweAY", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V", "sliderPositions", "Landroidx/compose/material3/SliderPositions;", "(Landroidx/compose/material3/SliderPositions;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "sliderState", "Landroidx/compose/material3/SliderState;", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SliderColors;", "thumbColor", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "colors-q0g_0yA", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;", "drawScope", "offset", "size", "color", "drawStopIndicator-x3O1jOs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFJ)V", "drawTrack", "tickFractions", "", "activeRangeStart", "", "activeRangeEnd", "height", "startThumbWidth", "endThumbWidth", "isRangeSlider", "drawTrack-ngJ0SCU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;[FFFJJJJFFFFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Z)V", "drawTrackPath", "Landroidx/compose/ui/geometry/Size;", "startCornerRadius", "endCornerRadius", "drawTrackPath-Cx2C_VA", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFF)V", "material3_release"}, m515k = 1, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final SliderDefaults INSTANCE = new SliderDefaults();
    private static final float TrackStopIndicatorSize = SliderTokens.INSTANCE.m3934getStopIndicatorSizeD9Ej5fM();
    private static final float TickSize = SliderTokens.INSTANCE.m3934getStopIndicatorSizeD9Ej5fM();
    private static final Path trackPath = AndroidPath_androidKt.Path();

    private SliderDefaults() {
    }

    public final SliderColors colors(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1376295968, "C(colors)845@36907L11:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1376295968, i, -1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:845)");
        }
        SliderColors defaultSliderColors$material3_release = getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultSliderColors$material3_release;
    }

    /* renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m2930colorsq0g_0yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, Composer composer, int i, int i2, int i3) {
        ComposerKt.sourceInformationMarkerStart(composer, 885588574, "C(colors)P(9:c#ui.graphics.Color,1:c#ui.graphics.Color,0:c#ui.graphics.Color,8:c#ui.graphics.Color,7:c#ui.graphics.Color,6:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.graphics.Color,4:c#ui.graphics.Color)887@39230L11:Slider.kt#uh7d8r");
        long jM4631getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m4631getUnspecified0d7_KjU() : j;
        long jM4631getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.INSTANCE.m4631getUnspecified0d7_KjU() : j2;
        long jM4631getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.INSTANCE.m4631getUnspecified0d7_KjU() : j3;
        long jM4631getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.INSTANCE.m4631getUnspecified0d7_KjU() : j4;
        long jM4631getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.INSTANCE.m4631getUnspecified0d7_KjU() : j5;
        long jM4631getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.INSTANCE.m4631getUnspecified0d7_KjU() : j6;
        long jM4631getUnspecified0d7_KjU7 = (i3 & 64) != 0 ? Color.INSTANCE.m4631getUnspecified0d7_KjU() : j7;
        long jM4631getUnspecified0d7_KjU8 = (i3 & 128) != 0 ? Color.INSTANCE.m4631getUnspecified0d7_KjU() : j8;
        long jM4631getUnspecified0d7_KjU9 = (i3 & 256) != 0 ? Color.INSTANCE.m4631getUnspecified0d7_KjU() : j9;
        long jM4631getUnspecified0d7_KjU10 = (i3 & 512) != 0 ? Color.INSTANCE.m4631getUnspecified0d7_KjU() : j10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(885588574, i, i2, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:887)");
        }
        SliderColors sliderColorsM2908copyK518z4 = getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2908copyK518z4(jM4631getUnspecified0d7_KjU, jM4631getUnspecified0d7_KjU2, jM4631getUnspecified0d7_KjU3, jM4631getUnspecified0d7_KjU4, jM4631getUnspecified0d7_KjU5, jM4631getUnspecified0d7_KjU6, jM4631getUnspecified0d7_KjU7, jM4631getUnspecified0d7_KjU8, jM4631getUnspecified0d7_KjU9, jM4631getUnspecified0d7_KjU10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return sliderColorsM2908copyK518z4;
    }

    public final SliderColors getDefaultSliderColors$material3_release(ColorScheme colorScheme) {
        SliderColors defaultSliderColorsCached = colorScheme.getDefaultSliderColorsCached();
        if (defaultSliderColorsCached != null) {
            return defaultSliderColorsCached;
        }
        SliderColors sliderColors = new SliderColors(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getHandleColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getActiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getInactiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getInactiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getActiveTrackColor()), ColorKt.m4640compositeOverOWjLjI(Color.m4594copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledHandleColor()), SliderTokens.INSTANCE.getDisabledHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), Color.m4594copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledActiveTrackColor()), SliderTokens.INSTANCE.getDisabledActiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4594copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledInactiveTrackColor()), SliderTokens.INSTANCE.getDisabledInactiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4594copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledInactiveTrackColor()), SliderTokens.INSTANCE.getDisabledInactiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4594copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledActiveTrackColor()), SliderTokens.INSTANCE.getDisabledActiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultSliderColorsCached$material3_release(sliderColors);
        return sliderColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012d  */
    /* renamed from: Thumb-9LiSoMs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2927Thumb9LiSoMs(final MutableInteractionSource mutableInteractionSource, Modifier modifier, SliderColors sliderColors, boolean z, long j, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        int i5;
        long j2;
        long j3;
        Object objRememberedValue;
        SnapshotStateList snapshotStateList;
        boolean z3;
        SliderDefaults$Thumb$1$1 sliderDefaults$Thumb$1$1RememberedValue;
        int i6;
        long jM7146copyDwJknco$default;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-290277409);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Thumb)P(2,3!,4:c#ui.unit.DpSize)947@42562L8,951@42678L46,952@42767L658,952@42733L692,975@43824L5,971@43620L220:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    int i8 = composerStartRestartGroup.changed(sliderColors2) ? 256 : 128;
                    i3 |= i8;
                } else {
                    sliderColors2 = sliderColors;
                }
                i3 |= i8;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        j2 = j;
                        i3 |= composerStartRestartGroup.changed(j2) ? 16384 : 8192;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                    } else if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                        i3 |= composerStartRestartGroup.changed(this) ? 131072 : 65536;
                    }
                    if ((i3 & 74899) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                        } else {
                            if (i7 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                SliderColors sliderColorsColors = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                                i3 &= -897;
                                sliderColors2 = sliderColorsColors;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if (i5 == 0) {
                                j3 = SliderKt.ThumbSize;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-290277409, i3, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:950)");
                            }
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1068636116, "CC(remember):Slider.kt#9igjgp");
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            snapshotStateList = (SnapshotStateList) objRememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1068632656, "CC(remember):Slider.kt#9igjgp");
                            int i9 = i3 & 14;
                            z3 = i9 == 4;
                            sliderDefaults$Thumb$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z3 || sliderDefaults$Thumb$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                                composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) sliderDefaults$Thumb$1$1RememberedValue, composerStartRestartGroup, i9);
                            if (snapshotStateList.isEmpty()) {
                                i6 = 2;
                                jM7146copyDwJknco$default = DpSize.m7146copyDwJknco$default(j3, C1959Dp.m7055constructorimpl(DpSize.m7153getWidthD9Ej5fM(j3) / 2), 0.0f, 2, null);
                            } else {
                                i6 = 2;
                                jM7146copyDwJknco$default = j3;
                            }
                            SpacerKt.Spacer(BackgroundKt.m989backgroundbw27NRU(HoverableKt.hoverable$default(SizeKt.m1481size6HolHcs(modifier2, jM7146copyDwJknco$default), mutableInteractionSource, false, i6, null), sliderColors2.m2919thumbColorvNxB06k$material3_release(z2), ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            j4 = j3;
                        }
                        j3 = j2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1068636116, "CC(remember):Slider.kt#9igjgp");
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        snapshotStateList = (SnapshotStateList) objRememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1068632656, "CC(remember):Slider.kt#9igjgp");
                        int i92 = i3 & 14;
                        if (i92 == 4) {
                        }
                        sliderDefaults$Thumb$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z3) {
                            sliderDefaults$Thumb$1$1RememberedValue = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                            composerStartRestartGroup.updateRememberedValue(sliderDefaults$Thumb$1$1RememberedValue);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) sliderDefaults$Thumb$1$1RememberedValue, composerStartRestartGroup, i92);
                            if (snapshotStateList.isEmpty()) {
                            }
                            SpacerKt.Spacer(BackgroundKt.m989backgroundbw27NRU(HoverableKt.hoverable$default(SizeKt.m1481size6HolHcs(modifier2, jM7146copyDwJknco$default), mutableInteractionSource, false, i6, null), sliderColors2.m2919thumbColorvNxB06k$material3_release(z2), ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6)), composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            j4 = j3;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        j4 = j2;
                    }
                    final SliderColors sliderColors3 = sliderColors2;
                    final boolean z4 = z2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier3 = modifier2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Thumb$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i10) {
                                this.$tmp2_rcvr.m2927Thumb9LiSoMs(mutableInteractionSource, modifier3, sliderColors3, z4, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                j2 = j;
                if ((i2 & 32) == 0) {
                }
                if ((i3 & 74899) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i7 != 0) {
                        }
                        if ((i2 & 4) != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 == 0) {
                            j3 = j2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1068636116, "CC(remember):Slider.kt#9igjgp");
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        snapshotStateList = (SnapshotStateList) objRememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1068632656, "CC(remember):Slider.kt#9igjgp");
                        int i922 = i3 & 14;
                        if (i922 == 4) {
                        }
                        sliderDefaults$Thumb$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z3) {
                        }
                    }
                }
                final SliderColors sliderColors32 = sliderColors2;
                final boolean z42 = z2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            j2 = j;
            if ((i2 & 32) == 0) {
            }
            if ((i3 & 74899) == 74898) {
            }
            final SliderColors sliderColors322 = sliderColors2;
            final boolean z422 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        j2 = j;
        if ((i2 & 32) == 0) {
        }
        if ((i3 & 74899) == 74898) {
        }
        final SliderColors sliderColors3222 = sliderColors2;
        final boolean z4222 = z2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0173  */
    @Deprecated(message = "Use version that supports slider state")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Track(final SliderPositions sliderPositions, Modifier modifier, SliderColors sliderColors, boolean z, Composer composer, final int i, final int i2) {
        final SliderPositions sliderPositions2;
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        Modifier.Companion companion;
        int i5;
        SliderColors sliderColors3;
        boolean z3;
        final long jM2921trackColorWaAFU9c$material3_release;
        final long jM2921trackColorWaAFU9c$material3_release2;
        final long jM2920tickColorWaAFU9c$material3_release;
        final long jM2920tickColorWaAFU9c$material3_release2;
        boolean zChanged;
        Object objRememberedValue;
        boolean z4;
        final SliderColors sliderColors4;
        final boolean z5;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1546713545);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Track)P(3,2)997@44755L8,1004@45160L1834,1004@45108L1886:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            sliderPositions2 = sliderPositions;
        } else {
            sliderPositions2 = sliderPositions;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(sliderPositions2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    int i7 = composerStartRestartGroup.changed(sliderColors2) ? 256 : 128;
                    i3 |= i7;
                } else {
                    sliderColors2 = sliderColors;
                }
                i3 |= i7;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            SliderColors sliderColorsColors = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -897;
                            sliderColors2 = sliderColorsColors;
                        }
                        SliderColors sliderColors5 = sliderColors2;
                        i5 = i3;
                        sliderColors3 = sliderColors5;
                        if (i4 == 0) {
                            z3 = true;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1546713545, i5, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:999)");
                        }
                        int i8 = i5;
                        jM2921trackColorWaAFU9c$material3_release = sliderColors3.m2921trackColorWaAFU9c$material3_release(z3, false);
                        jM2921trackColorWaAFU9c$material3_release2 = sliderColors3.m2921trackColorWaAFU9c$material3_release(z3, true);
                        Modifier modifier4 = companion;
                        jM2920tickColorWaAFU9c$material3_release = sliderColors3.m2920tickColorWaAFU9c$material3_release(z3, false);
                        jM2920tickColorWaAFU9c$material3_release2 = sliderColors3.m2920tickColorWaAFU9c$material3_release(z3, true);
                        SliderColors sliderColors6 = sliderColors3;
                        Modifier modifierM1466height3ABfNKs = SizeKt.m1466height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), SliderKt.getTrackHeight());
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -801023075, "CC(remember):Slider.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(jM2921trackColorWaAFU9c$material3_release) | ((i8 & 14) == 4) | composerStartRestartGroup.changed(jM2921trackColorWaAFU9c$material3_release2) | composerStartRestartGroup.changed(jM2920tickColorWaAFU9c$material3_release) | composerStartRestartGroup.changed(jM2920tickColorWaAFU9c$material3_release2);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            z4 = z3;
                            objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
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
                                    ArrayList arrayList;
                                    long j;
                                    long j2;
                                    boolean z6 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                                    long jOffset = OffsetKt.Offset(0.0f, Offset.m4355getYimpl(drawScope.mo5150getCenterF1C5BW0()));
                                    long jOffset2 = OffsetKt.Offset(Size.m4423getWidthimpl(drawScope.mo5151getSizeNHjbRc()), Offset.m4355getYimpl(drawScope.mo5150getCenterF1C5BW0()));
                                    long j3 = jOffset;
                                    long j4 = z6 ? jOffset2 : j3;
                                    if (!z6) {
                                        j3 = jOffset2;
                                    }
                                    float f = drawScope.mo1127toPx0680j_4(SliderDefaults.INSTANCE.m2931getTickSizeD9Ej5fM());
                                    float f2 = drawScope.mo1127toPx0680j_4(SliderKt.getTrackHeight());
                                    DrawScope.m5137drawLineNGM6Ib0$default(drawScope, jM2921trackColorWaAFU9c$material3_release, j4, j3, f2, StrokeCap.INSTANCE.m4949getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                    long j5 = j4;
                                    long j6 = j3;
                                    DrawScope.m5137drawLineNGM6Ib0$default(drawScope, jM2921trackColorWaAFU9c$material3_release2, OffsetKt.Offset(Offset.m4354getXimpl(j4) + ((Offset.m4354getXimpl(j3) - Offset.m4354getXimpl(j4)) * sliderPositions2.getActiveRange().getStart().floatValue()), Offset.m4355getYimpl(drawScope.mo5150getCenterF1C5BW0())), OffsetKt.Offset(Offset.m4354getXimpl(j4) + ((Offset.m4354getXimpl(j3) - Offset.m4354getXimpl(j4)) * sliderPositions2.getActiveRange().getEndInclusive().floatValue()), Offset.m4355getYimpl(drawScope.mo5150getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4949getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                    float[] tickFractions = sliderPositions2.getTickFractions();
                                    SliderPositions sliderPositions3 = sliderPositions2;
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    int length = tickFractions.length;
                                    for (int i9 = 0; i9 < length; i9++) {
                                        float f3 = tickFractions[i9];
                                        Boolean boolValueOf = Boolean.valueOf(f3 > sliderPositions3.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions3.getActiveRange().getStart().floatValue());
                                        Object obj = linkedHashMap.get(boolValueOf);
                                        if (obj == null) {
                                            obj = (List) new ArrayList();
                                            linkedHashMap.put(boolValueOf, obj);
                                        }
                                        ((List) obj).add(Float.valueOf(f3));
                                    }
                                    long j7 = jM2920tickColorWaAFU9c$material3_release;
                                    long j8 = jM2920tickColorWaAFU9c$material3_release2;
                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                        boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                                        List list = (List) entry.getValue();
                                        ArrayList arrayList2 = new ArrayList(list.size());
                                        int size = list.size();
                                        for (int i10 = 0; i10 < size; i10++) {
                                            arrayList2.add(Offset.m4343boximpl(OffsetKt.Offset(Offset.m4354getXimpl(OffsetKt.m4377lerpWko1d7g(j5, j6, ((Number) list.get(i10)).floatValue())), Offset.m4355getYimpl(drawScope.mo5150getCenterF1C5BW0()))));
                                        }
                                        long j9 = j5;
                                        long j10 = j6;
                                        ArrayList arrayList3 = arrayList2;
                                        int iM4901getPointsr_lszbg = PointMode.INSTANCE.m4901getPointsr_lszbg();
                                        if (zBooleanValue) {
                                            j = j8;
                                            arrayList = arrayList3;
                                            j2 = j7;
                                        } else {
                                            arrayList = arrayList3;
                                            j = j8;
                                            j2 = j;
                                        }
                                        DrawScope.m5142drawPointsF8ZwMP8$default(drawScope, arrayList, iM4901getPointsr_lszbg, j2, f, StrokeCap.INSTANCE.m4949getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                        j6 = j10;
                                        j8 = j;
                                        j5 = j9;
                                    }
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            z4 = z3;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        CanvasKt.Canvas(modifierM1466height3ABfNKs, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        sliderColors4 = sliderColors6;
                        z5 = z4;
                        modifier3 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        SliderColors sliderColors7 = sliderColors2;
                        i5 = i3;
                        sliderColors3 = sliderColors7;
                        companion = modifier2;
                    }
                    z3 = z2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i82 = i5;
                    jM2921trackColorWaAFU9c$material3_release = sliderColors3.m2921trackColorWaAFU9c$material3_release(z3, false);
                    jM2921trackColorWaAFU9c$material3_release2 = sliderColors3.m2921trackColorWaAFU9c$material3_release(z3, true);
                    Modifier modifier42 = companion;
                    jM2920tickColorWaAFU9c$material3_release = sliderColors3.m2920tickColorWaAFU9c$material3_release(z3, false);
                    jM2920tickColorWaAFU9c$material3_release2 = sliderColors3.m2920tickColorWaAFU9c$material3_release(z3, true);
                    SliderColors sliderColors62 = sliderColors3;
                    Modifier modifierM1466height3ABfNKs2 = SizeKt.m1466height3ABfNKs(SizeKt.fillMaxWidth$default(modifier42, 0.0f, 1, null), SliderKt.getTrackHeight());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -801023075, "CC(remember):Slider.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(jM2921trackColorWaAFU9c$material3_release) | ((i82 & 14) == 4) | composerStartRestartGroup.changed(jM2921trackColorWaAFU9c$material3_release2) | composerStartRestartGroup.changed(jM2920tickColorWaAFU9c$material3_release) | composerStartRestartGroup.changed(jM2920tickColorWaAFU9c$material3_release2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        z4 = z3;
                        objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
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
                                ArrayList arrayList;
                                long j;
                                long j2;
                                boolean z6 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                                long jOffset = OffsetKt.Offset(0.0f, Offset.m4355getYimpl(drawScope.mo5150getCenterF1C5BW0()));
                                long jOffset2 = OffsetKt.Offset(Size.m4423getWidthimpl(drawScope.mo5151getSizeNHjbRc()), Offset.m4355getYimpl(drawScope.mo5150getCenterF1C5BW0()));
                                long j3 = jOffset;
                                long j4 = z6 ? jOffset2 : j3;
                                if (!z6) {
                                    j3 = jOffset2;
                                }
                                float f = drawScope.mo1127toPx0680j_4(SliderDefaults.INSTANCE.m2931getTickSizeD9Ej5fM());
                                float f2 = drawScope.mo1127toPx0680j_4(SliderKt.getTrackHeight());
                                DrawScope.m5137drawLineNGM6Ib0$default(drawScope, jM2921trackColorWaAFU9c$material3_release, j4, j3, f2, StrokeCap.INSTANCE.m4949getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                long j5 = j4;
                                long j6 = j3;
                                DrawScope.m5137drawLineNGM6Ib0$default(drawScope, jM2921trackColorWaAFU9c$material3_release2, OffsetKt.Offset(Offset.m4354getXimpl(j4) + ((Offset.m4354getXimpl(j3) - Offset.m4354getXimpl(j4)) * sliderPositions2.getActiveRange().getStart().floatValue()), Offset.m4355getYimpl(drawScope.mo5150getCenterF1C5BW0())), OffsetKt.Offset(Offset.m4354getXimpl(j4) + ((Offset.m4354getXimpl(j3) - Offset.m4354getXimpl(j4)) * sliderPositions2.getActiveRange().getEndInclusive().floatValue()), Offset.m4355getYimpl(drawScope.mo5150getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4949getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                float[] tickFractions = sliderPositions2.getTickFractions();
                                SliderPositions sliderPositions3 = sliderPositions2;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                int length = tickFractions.length;
                                for (int i9 = 0; i9 < length; i9++) {
                                    float f3 = tickFractions[i9];
                                    Boolean boolValueOf = Boolean.valueOf(f3 > sliderPositions3.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions3.getActiveRange().getStart().floatValue());
                                    Object obj = linkedHashMap.get(boolValueOf);
                                    if (obj == null) {
                                        obj = (List) new ArrayList();
                                        linkedHashMap.put(boolValueOf, obj);
                                    }
                                    ((List) obj).add(Float.valueOf(f3));
                                }
                                long j7 = jM2920tickColorWaAFU9c$material3_release;
                                long j8 = jM2920tickColorWaAFU9c$material3_release2;
                                for (Map.Entry entry : linkedHashMap.entrySet()) {
                                    boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                                    List list = (List) entry.getValue();
                                    ArrayList arrayList2 = new ArrayList(list.size());
                                    int size = list.size();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        arrayList2.add(Offset.m4343boximpl(OffsetKt.Offset(Offset.m4354getXimpl(OffsetKt.m4377lerpWko1d7g(j5, j6, ((Number) list.get(i10)).floatValue())), Offset.m4355getYimpl(drawScope.mo5150getCenterF1C5BW0()))));
                                    }
                                    long j9 = j5;
                                    long j10 = j6;
                                    ArrayList arrayList3 = arrayList2;
                                    int iM4901getPointsr_lszbg = PointMode.INSTANCE.m4901getPointsr_lszbg();
                                    if (zBooleanValue) {
                                        j = j8;
                                        arrayList = arrayList3;
                                        j2 = j7;
                                    } else {
                                        arrayList = arrayList3;
                                        j = j8;
                                        j2 = j;
                                    }
                                    DrawScope.m5142drawPointsF8ZwMP8$default(drawScope, arrayList, iM4901getPointsr_lszbg, j2, f, StrokeCap.INSTANCE.m4949getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                    j6 = j10;
                                    j8 = j;
                                    j5 = j9;
                                }
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        CanvasKt.Canvas(modifierM1466height3ABfNKs2, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        sliderColors4 = sliderColors62;
                        z5 = z4;
                        modifier3 = modifier42;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    sliderColors4 = sliderColors2;
                    z5 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i9) {
                            SliderDefaults.this.Track(sliderPositions, modifier3, sliderColors4, z5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 == 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    SliderColors sliderColors52 = sliderColors2;
                    i5 = i3;
                    sliderColors3 = sliderColors52;
                    if (i4 == 0) {
                        z3 = z2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i822 = i5;
                    jM2921trackColorWaAFU9c$material3_release = sliderColors3.m2921trackColorWaAFU9c$material3_release(z3, false);
                    jM2921trackColorWaAFU9c$material3_release2 = sliderColors3.m2921trackColorWaAFU9c$material3_release(z3, true);
                    Modifier modifier422 = companion;
                    jM2920tickColorWaAFU9c$material3_release = sliderColors3.m2920tickColorWaAFU9c$material3_release(z3, false);
                    jM2920tickColorWaAFU9c$material3_release2 = sliderColors3.m2920tickColorWaAFU9c$material3_release(z3, true);
                    SliderColors sliderColors622 = sliderColors3;
                    Modifier modifierM1466height3ABfNKs22 = SizeKt.m1466height3ABfNKs(SizeKt.fillMaxWidth$default(modifier422, 0.0f, 1, null), SliderKt.getTrackHeight());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -801023075, "CC(remember):Slider.kt#9igjgp");
                    zChanged = composerStartRestartGroup.changed(jM2921trackColorWaAFU9c$material3_release) | ((i822 & 14) == 4) | composerStartRestartGroup.changed(jM2921trackColorWaAFU9c$material3_release2) | composerStartRestartGroup.changed(jM2920tickColorWaAFU9c$material3_release) | composerStartRestartGroup.changed(jM2920tickColorWaAFU9c$material3_release2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the overload that takes `drawStopIndicator`, `drawTick`, `thumbTrackGapSize` and `trackInsideCornerSize`, see `LegacySliderSample` on how to restore the previous behavior", replaceWith = @ReplaceWith(expression = "Track(sliderState, modifier, enabled, colors, drawStopIndicator, drawTick, thumbTrackGapSize, trackInsideCornerSize)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void Track(final SliderState sliderState, Modifier modifier, SliderColors sliderColors, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        Modifier.Companion companion;
        SliderColors sliderColorsColors;
        int i5;
        boolean z3;
        final SliderColors sliderColors3;
        final boolean z4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(593554206);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Track)P(3,2)1079@48295L8,1082@48353L213:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(sliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    int i7 = composerStartRestartGroup.changed(sliderColors2) ? 256 : 128;
                    i3 |= i7;
                } else {
                    sliderColors2 = sliderColors;
                }
                i3 |= i7;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) == 0) {
                            sliderColorsColors = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -897;
                        } else {
                            sliderColorsColors = sliderColors2;
                        }
                        if (i4 == 0) {
                            i5 = i3;
                            z3 = true;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(593554206, i5, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1081)");
                        }
                        Modifier modifier4 = companion;
                        sliderColors3 = sliderColorsColors;
                        m2929Track4EFweAY(sliderState, modifier4, z3, sliderColors3, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, SliderKt.ThumbTrackGapSize, SliderKt.TrackInsideCornerSize, composerStartRestartGroup, (i5 & 14) | 14155776 | (i5 & LDSFile.EF_DG16_TAG) | ((i5 >> 3) & 896) | ((i5 << 3) & 7168) | ((i5 << 12) & 234881024), 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z3;
                        modifier3 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        companion = modifier2;
                        sliderColorsColors = sliderColors2;
                    }
                    i5 = i3;
                    z3 = z2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifier42 = companion;
                    sliderColors3 = sliderColorsColors;
                    m2929Track4EFweAY(sliderState, modifier42, z3, sliderColors3, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, SliderKt.ThumbTrackGapSize, SliderKt.TrackInsideCornerSize, composerStartRestartGroup, (i5 & 14) | 14155776 | (i5 & LDSFile.EF_DG16_TAG) | ((i5 >> 3) & 896) | ((i5 << 3) & 7168) | ((i5 << 12) & 234881024), 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z4 = z3;
                    modifier3 = modifier42;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    sliderColors3 = sliderColors2;
                    z4 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i8) {
                            SliderDefaults.this.Track(sliderState, modifier3, sliderColors3, z4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 == 0) {
                    }
                    if ((i2 & 4) == 0) {
                    }
                    if (i4 == 0) {
                        i5 = i3;
                        z3 = z2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifier422 = companion;
                    sliderColors3 = sliderColorsColors;
                    m2929Track4EFweAY(sliderState, modifier422, z3, sliderColors3, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, SliderKt.ThumbTrackGapSize, SliderKt.TrackInsideCornerSize, composerStartRestartGroup, (i5 & 14) | 14155776 | (i5 & LDSFile.EF_DG16_TAG) | ((i5 >> 3) & 896) | ((i5 << 3) & 7168) | ((i5 << 12) & 234881024), 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z4 = z3;
                    modifier3 = modifier422;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0283 A[PHI: r2
  0x0283: PHI (r2v12 kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit>) = 
  (r2v9 kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit>)
  (r2v13 kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit>)
 binds: [B:171:0x0281, B:167:0x027a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    /* renamed from: Track-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2929Track4EFweAY(final SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, Function2<? super DrawScope, ? super Offset, Unit> function2, Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final boolean z2;
        final SliderColors sliderColors2;
        final Function2<? super DrawScope, ? super Offset, Unit> function22;
        int i5;
        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function32;
        int i6;
        float f3;
        int i7;
        final float f4;
        int i8;
        Function2<? super DrawScope, ? super Offset, Unit> function23;
        boolean z3;
        boolean z4;
        Object objRememberedValue;
        Composer composer2;
        SliderColors sliderColors3;
        final float f5;
        boolean z5;
        final float f6;
        final boolean z6;
        final SliderColors sliderColors4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(49984771);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Track)P(5,4,3!3,6:c#ui.unit.Dp,7:c#ui.unit.Dp)1114@49756L8,1115@49825L232,1137@50806L7,1138@50862L595,1133@50659L798:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(sliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        sliderColors2 = sliderColors;
                        int i11 = composerStartRestartGroup.changed(sliderColors2) ? 2048 : 1024;
                        i3 |= i11;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i3 |= i11;
                } else {
                    sliderColors2 = sliderColors;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        function22 = function2;
                        int i12 = composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
                        i3 |= i12;
                    } else {
                        function22 = function2;
                    }
                    i3 |= i12;
                } else {
                    function22 = function2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                    function32 = function3;
                } else {
                    function32 = function3;
                    if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function32) ? 131072 : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    f3 = f;
                } else {
                    f3 = f;
                    if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(f3) ? 1048576 : 524288;
                    }
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                    f4 = f2;
                } else {
                    f4 = f2;
                    if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(f4) ? 8388608 : 4194304;
                    }
                }
                if ((i2 & 256) == 0) {
                    i9 = (i & 100663296) == 0 ? composerStartRestartGroup.changed(this) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                    if ((38347923 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i10 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                SliderColors sliderColorsColors = colors(composerStartRestartGroup, (i3 >> 24) & 14);
                                i3 &= -7169;
                                sliderColors2 = sliderColorsColors;
                            }
                            if ((i2 & 16) != 0) {
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -800875397, "CC(remember):Slider.kt#9igjgp");
                                boolean z7 = ((((i3 & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(sliderColors2)) || (i3 & 3072) == 2048) | ((i3 & 896) == 256);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (z7 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function2) new Function2<DrawScope, Offset, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$4$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Offset offset) {
                                            m2934invokeUv8p0NA(drawScope, offset.getPackedValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                                        public final void m2934invokeUv8p0NA(DrawScope drawScope, long j) {
                                            SliderDefaults.INSTANCE.m2924drawStopIndicatorx3O1jOs(drawScope, j, SliderDefaults.INSTANCE.m2932getTrackStopIndicatorSizeD9Ej5fM(), sliderColors2.m2921trackColorWaAFU9c$material3_release(z2, true));
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                i3 &= -57345;
                                function22 = (Function2) objRememberedValue2;
                            }
                            if (i5 != 0) {
                                function32 = new Function3<DrawScope, Offset, Color, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.5
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Offset offset, Color color) {
                                        m2935invokewPWG1Vc(drawScope, offset.getPackedValue(), color.m4605unboximpl());
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke-wPWG1Vc, reason: not valid java name */
                                    public final void m2935invokewPWG1Vc(DrawScope drawScope, long j, long j2) {
                                        SliderDefaults.INSTANCE.m2924drawStopIndicatorx3O1jOs(drawScope, j, SliderDefaults.INSTANCE.m2931getTickSizeD9Ej5fM(), j2);
                                    }
                                };
                            }
                            if (i6 != 0) {
                                f3 = SliderKt.ThumbTrackGapSize;
                            }
                            if (i7 != 0) {
                                f4 = SliderKt.TrackInsideCornerSize;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                        }
                        i8 = i3;
                        Modifier modifier4 = modifier2;
                        SliderColors sliderColors5 = sliderColors2;
                        float f7 = f3;
                        boolean z8 = z2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(49984771, i8, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1128)");
                        }
                        final long jM2921trackColorWaAFU9c$material3_release = sliderColors5.m2921trackColorWaAFU9c$material3_release(z8, false);
                        final long jM2921trackColorWaAFU9c$material3_release2 = sliderColors5.m2921trackColorWaAFU9c$material3_release(z8, true);
                        float f8 = f4;
                        Function2<? super DrawScope, ? super Offset, Unit> function24 = function22;
                        final long jM2920tickColorWaAFU9c$material3_release = sliderColors5.m2920tickColorWaAFU9c$material3_release(z8, false);
                        final long jM2920tickColorWaAFU9c$material3_release2 = sliderColors5.m2920tickColorWaAFU9c$material3_release(z8, true);
                        Modifier modifierM1466height3ABfNKs = SizeKt.m1466height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), SliderKt.getTrackHeight());
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume = composerStartRestartGroup.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        Modifier modifierRotate = RotateKt.rotate(modifierM1466height3ABfNKs, objConsume != LayoutDirection.Rtl ? 180.0f : 0.0f);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -800841850, "CC(remember):Slider.kt#9igjgp");
                        boolean zChangedInstance = ((3670016 & i8) != 1048576) | composerStartRestartGroup.changedInstance(sliderState) | composerStartRestartGroup.changed(jM2921trackColorWaAFU9c$material3_release) | composerStartRestartGroup.changed(jM2921trackColorWaAFU9c$material3_release2) | composerStartRestartGroup.changed(jM2920tickColorWaAFU9c$material3_release) | composerStartRestartGroup.changed(jM2920tickColorWaAFU9c$material3_release2) | ((29360128 & i8) != 8388608);
                        if (((57344 & i8) ^ 24576) <= 16384) {
                            function23 = function24;
                            if (composerStartRestartGroup.changed(function23)) {
                                z3 = true;
                                z4 = zChangedInstance | z3 | ((458752 & i8) == 131072);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    composer2 = composerStartRestartGroup;
                                    sliderColors3 = sliderColors5;
                                    f5 = f7;
                                    function22 = function23;
                                    f4 = f8;
                                    z5 = z8;
                                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$6$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
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
                                            SliderDefaults.INSTANCE.m2925drawTrackngJ0SCU(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.getCoercedValueAsFraction$material3_release(), jM2921trackColorWaAFU9c$material3_release, jM2921trackColorWaAFU9c$material3_release2, jM2920tickColorWaAFU9c$material3_release, jM2920tickColorWaAFU9c$material3_release2, drawScope.mo1123toDpu2uoSUM(sliderState.getTrackHeight$material3_release()), drawScope.mo1124toDpu2uoSUM(0), drawScope.mo1123toDpu2uoSUM(sliderState.getThumbWidth$material3_release()), f5, f4, function22, function32, false);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                } else {
                                    f5 = f7;
                                    f4 = f8;
                                    function22 = function23;
                                    z5 = z8;
                                    composer2 = composerStartRestartGroup;
                                    sliderColors3 = sliderColors5;
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                CanvasKt.Canvas(modifierRotate, (Function1) objRememberedValue, composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f6 = f5;
                                z6 = z5;
                                sliderColors4 = sliderColors3;
                                modifier3 = modifier4;
                            }
                        } else {
                            function23 = function24;
                        }
                        if ((i8 & 24576) == 16384) {
                            z3 = false;
                        }
                        z4 = zChangedInstance | z3 | ((458752 & i8) == 131072);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z4) {
                            composer2 = composerStartRestartGroup;
                            sliderColors3 = sliderColors5;
                            f5 = f7;
                            function22 = function23;
                            f4 = f8;
                            z5 = z8;
                            objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$6$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    SliderDefaults.INSTANCE.m2925drawTrackngJ0SCU(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.getCoercedValueAsFraction$material3_release(), jM2921trackColorWaAFU9c$material3_release, jM2921trackColorWaAFU9c$material3_release2, jM2920tickColorWaAFU9c$material3_release, jM2920tickColorWaAFU9c$material3_release2, drawScope.mo1123toDpu2uoSUM(sliderState.getTrackHeight$material3_release()), drawScope.mo1124toDpu2uoSUM(0), drawScope.mo1123toDpu2uoSUM(sliderState.getThumbWidth$material3_release()), f5, f4, function22, function32, false);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            CanvasKt.Canvas(modifierRotate, (Function1) objRememberedValue, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            f6 = f5;
                            z6 = z5;
                            sliderColors4 = sliderColors3;
                            modifier3 = modifier4;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        sliderColors4 = sliderColors2;
                        f6 = f3;
                        z6 = z2;
                    }
                    final float f9 = f4;
                    final Function2<? super DrawScope, ? super Offset, Unit> function25 = function22;
                    final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function33 = function32;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.7
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

                            public final void invoke(Composer composer3, int i13) {
                                SliderDefaults.this.m2929Track4EFweAY(sliderState, modifier3, z6, sliderColors4, function25, function33, f6, f9, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= i9;
                if ((38347923 & i3) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i2 & 8) != 0) {
                        }
                        if ((i2 & 16) != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        i8 = i3;
                        Modifier modifier42 = modifier2;
                        SliderColors sliderColors52 = sliderColors2;
                        float f72 = f3;
                        boolean z82 = z2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final long jM2921trackColorWaAFU9c$material3_release3 = sliderColors52.m2921trackColorWaAFU9c$material3_release(z82, false);
                        final long jM2921trackColorWaAFU9c$material3_release22 = sliderColors52.m2921trackColorWaAFU9c$material3_release(z82, true);
                        float f82 = f4;
                        Function2<? super DrawScope, ? super Offset, Unit> function242 = function22;
                        final long jM2920tickColorWaAFU9c$material3_release3 = sliderColors52.m2920tickColorWaAFU9c$material3_release(z82, false);
                        final long jM2920tickColorWaAFU9c$material3_release22 = sliderColors52.m2920tickColorWaAFU9c$material3_release(z82, true);
                        Modifier modifierM1466height3ABfNKs2 = SizeKt.m1466height3ABfNKs(SizeKt.fillMaxWidth$default(modifier42, 0.0f, 1, null), SliderKt.getTrackHeight());
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume2 = composerStartRestartGroup.consume(localLayoutDirection2);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        Modifier modifierRotate2 = RotateKt.rotate(modifierM1466height3ABfNKs2, objConsume2 != LayoutDirection.Rtl ? 180.0f : 0.0f);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -800841850, "CC(remember):Slider.kt#9igjgp");
                        boolean zChangedInstance2 = ((3670016 & i8) != 1048576) | composerStartRestartGroup.changedInstance(sliderState) | composerStartRestartGroup.changed(jM2921trackColorWaAFU9c$material3_release3) | composerStartRestartGroup.changed(jM2921trackColorWaAFU9c$material3_release22) | composerStartRestartGroup.changed(jM2920tickColorWaAFU9c$material3_release3) | composerStartRestartGroup.changed(jM2920tickColorWaAFU9c$material3_release22) | ((29360128 & i8) != 8388608);
                        if (((57344 & i8) ^ 24576) <= 16384) {
                        }
                        if ((i8 & 24576) == 16384) {
                        }
                        z4 = zChangedInstance2 | z3 | ((458752 & i8) == 131072);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z4) {
                        }
                    }
                }
                final float f92 = f4;
                final Function2<? super DrawScope, ? super Offset, Unit> function252 = function22;
                final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function332 = function32;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i3 |= i9;
            if ((38347923 & i3) == 38347922) {
            }
            final float f922 = f4;
            final Function2<? super DrawScope, ? super Offset, Unit> function2522 = function22;
            final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3322 = function32;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i3 |= i9;
        if ((38347923 & i3) == 38347922) {
        }
        final float f9222 = f4;
        final Function2<? super DrawScope, ? super Offset, Unit> function25222 = function22;
        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function33222 = function32;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the overload that takes `drawStopIndicator`, `drawTick`, `thumbTrackGapSize` and `trackInsideCornerSize`, see `LegacyRangeSliderSample` on how to restore the previous behavior", replaceWith = @ReplaceWith(expression = "Track(rangeSliderState, modifier, colors, enabled, drawStopIndicator, drawTick, thumbTrackGapSize, trackInsideCornerSize)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void Track(final RangeSliderState rangeSliderState, Modifier modifier, SliderColors sliderColors, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        Modifier.Companion companion;
        SliderColors sliderColorsColors;
        int i5;
        boolean z3;
        final SliderColors sliderColors3;
        final boolean z4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1617869097);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Track)P(3,2)1187@52807L8,1190@52865L218:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(rangeSliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    int i7 = composerStartRestartGroup.changed(sliderColors2) ? 256 : 128;
                    i3 |= i7;
                } else {
                    sliderColors2 = sliderColors;
                }
                i3 |= i7;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) == 0) {
                            sliderColorsColors = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -897;
                        } else {
                            sliderColorsColors = sliderColors2;
                        }
                        if (i4 == 0) {
                            i5 = i3;
                            z3 = true;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1617869097, i5, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1189)");
                        }
                        Modifier modifier4 = companion;
                        sliderColors3 = sliderColorsColors;
                        m2928Track4EFweAY(rangeSliderState, modifier4, z3, sliderColors3, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, SliderKt.ThumbTrackGapSize, SliderKt.TrackInsideCornerSize, composerStartRestartGroup, (i5 & 14) | 14155776 | (i5 & LDSFile.EF_DG16_TAG) | ((i5 >> 3) & 896) | ((i5 << 3) & 7168) | ((i5 << 12) & 234881024), 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z3;
                        modifier3 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        companion = modifier2;
                        sliderColorsColors = sliderColors2;
                    }
                    i5 = i3;
                    z3 = z2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifier42 = companion;
                    sliderColors3 = sliderColorsColors;
                    m2928Track4EFweAY(rangeSliderState, modifier42, z3, sliderColors3, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, SliderKt.ThumbTrackGapSize, SliderKt.TrackInsideCornerSize, composerStartRestartGroup, (i5 & 14) | 14155776 | (i5 & LDSFile.EF_DG16_TAG) | ((i5 >> 3) & 896) | ((i5 << 3) & 7168) | ((i5 << 12) & 234881024), 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z4 = z3;
                    modifier3 = modifier42;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    sliderColors3 = sliderColors2;
                    z4 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i8) {
                            SliderDefaults.this.Track(rangeSliderState, modifier3, sliderColors3, z4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 == 0) {
                    }
                    if ((i2 & 4) == 0) {
                    }
                    if (i4 == 0) {
                        i5 = i3;
                        z3 = z2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifier422 = companion;
                    sliderColors3 = sliderColorsColors;
                    m2928Track4EFweAY(rangeSliderState, modifier422, z3, sliderColors3, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, SliderKt.ThumbTrackGapSize, SliderKt.TrackInsideCornerSize, composerStartRestartGroup, (i5 & 14) | 14155776 | (i5 & LDSFile.EF_DG16_TAG) | ((i5 >> 3) & 896) | ((i5 << 3) & 7168) | ((i5 << 12) & 234881024), 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z4 = z3;
                    modifier3 = modifier422;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0283 A[PHI: r2
  0x0283: PHI (r2v12 kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit>) = 
  (r2v9 kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit>)
  (r2v13 kotlin.jvm.functions.Function2<? super androidx.compose.ui.graphics.drawscope.DrawScope, ? super androidx.compose.ui.geometry.Offset, kotlin.Unit>)
 binds: [B:171:0x0281, B:167:0x027a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    /* renamed from: Track-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2928Track4EFweAY(final RangeSliderState rangeSliderState, Modifier modifier, boolean z, SliderColors sliderColors, Function2<? super DrawScope, ? super Offset, Unit> function2, Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final boolean z2;
        final SliderColors sliderColors2;
        final Function2<? super DrawScope, ? super Offset, Unit> function22;
        int i5;
        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function32;
        int i6;
        float f3;
        int i7;
        final float f4;
        int i8;
        Function2<? super DrawScope, ? super Offset, Unit> function23;
        boolean z3;
        boolean z4;
        Object objRememberedValue;
        Composer composer2;
        SliderColors sliderColors3;
        final float f5;
        boolean z5;
        final float f6;
        final boolean z6;
        final SliderColors sliderColors4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(-541824132);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Track)P(5,4,3!3,6:c#ui.unit.Dp,7:c#ui.unit.Dp)1222@54320L8,1223@54389L232,1245@55370L7,1246@55426L706,1241@55223L909:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(rangeSliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        sliderColors2 = sliderColors;
                        int i11 = composerStartRestartGroup.changed(sliderColors2) ? 2048 : 1024;
                        i3 |= i11;
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i3 |= i11;
                } else {
                    sliderColors2 = sliderColors;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        function22 = function2;
                        int i12 = composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
                        i3 |= i12;
                    } else {
                        function22 = function2;
                    }
                    i3 |= i12;
                } else {
                    function22 = function2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                    function32 = function3;
                } else {
                    function32 = function3;
                    if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function32) ? 131072 : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    f3 = f;
                } else {
                    f3 = f;
                    if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(f3) ? 1048576 : 524288;
                    }
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                    f4 = f2;
                } else {
                    f4 = f2;
                    if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(f4) ? 8388608 : 4194304;
                    }
                }
                if ((i2 & 256) == 0) {
                    i9 = (i & 100663296) == 0 ? composerStartRestartGroup.changed(this) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                    if ((38347923 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i10 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                SliderColors sliderColorsColors = colors(composerStartRestartGroup, (i3 >> 24) & 14);
                                i3 &= -7169;
                                sliderColors2 = sliderColorsColors;
                            }
                            if ((i2 & 16) != 0) {
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -800729349, "CC(remember):Slider.kt#9igjgp");
                                boolean z7 = ((((i3 & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(sliderColors2)) || (i3 & 3072) == 2048) | ((i3 & 896) == 256);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (z7 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function2) new Function2<DrawScope, Offset, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$9$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Offset offset) {
                                            m2936invokeUv8p0NA(drawScope, offset.getPackedValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                                        public final void m2936invokeUv8p0NA(DrawScope drawScope, long j) {
                                            SliderDefaults.INSTANCE.m2924drawStopIndicatorx3O1jOs(drawScope, j, SliderDefaults.INSTANCE.m2932getTrackStopIndicatorSizeD9Ej5fM(), sliderColors2.m2921trackColorWaAFU9c$material3_release(z2, true));
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                i3 &= -57345;
                                function22 = (Function2) objRememberedValue2;
                            }
                            if (i5 != 0) {
                                function32 = new Function3<DrawScope, Offset, Color, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.10
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Offset offset, Color color) {
                                        m2933invokewPWG1Vc(drawScope, offset.getPackedValue(), color.m4605unboximpl());
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke-wPWG1Vc, reason: not valid java name */
                                    public final void m2933invokewPWG1Vc(DrawScope drawScope, long j, long j2) {
                                        SliderDefaults.INSTANCE.m2924drawStopIndicatorx3O1jOs(drawScope, j, SliderDefaults.INSTANCE.m2931getTickSizeD9Ej5fM(), j2);
                                    }
                                };
                            }
                            if (i6 != 0) {
                                f3 = SliderKt.ThumbTrackGapSize;
                            }
                            if (i7 != 0) {
                                f4 = SliderKt.TrackInsideCornerSize;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                        }
                        i8 = i3;
                        Modifier modifier4 = modifier2;
                        SliderColors sliderColors5 = sliderColors2;
                        float f7 = f3;
                        boolean z8 = z2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-541824132, i8, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1236)");
                        }
                        final long jM2921trackColorWaAFU9c$material3_release = sliderColors5.m2921trackColorWaAFU9c$material3_release(z8, false);
                        final long jM2921trackColorWaAFU9c$material3_release2 = sliderColors5.m2921trackColorWaAFU9c$material3_release(z8, true);
                        float f8 = f4;
                        Function2<? super DrawScope, ? super Offset, Unit> function24 = function22;
                        final long jM2920tickColorWaAFU9c$material3_release = sliderColors5.m2920tickColorWaAFU9c$material3_release(z8, false);
                        final long jM2920tickColorWaAFU9c$material3_release2 = sliderColors5.m2920tickColorWaAFU9c$material3_release(z8, true);
                        Modifier modifierM1466height3ABfNKs = SizeKt.m1466height3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), SliderKt.getTrackHeight());
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume = composerStartRestartGroup.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        Modifier modifierRotate = RotateKt.rotate(modifierM1466height3ABfNKs, objConsume != LayoutDirection.Rtl ? 180.0f : 0.0f);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -800695691, "CC(remember):Slider.kt#9igjgp");
                        boolean zChangedInstance = ((3670016 & i8) != 1048576) | composerStartRestartGroup.changedInstance(rangeSliderState) | composerStartRestartGroup.changed(jM2921trackColorWaAFU9c$material3_release) | composerStartRestartGroup.changed(jM2921trackColorWaAFU9c$material3_release2) | composerStartRestartGroup.changed(jM2920tickColorWaAFU9c$material3_release) | composerStartRestartGroup.changed(jM2920tickColorWaAFU9c$material3_release2) | ((29360128 & i8) != 8388608);
                        if (((57344 & i8) ^ 24576) <= 16384) {
                            function23 = function24;
                            if (composerStartRestartGroup.changed(function23)) {
                                z3 = true;
                                z4 = zChangedInstance | z3 | ((458752 & i8) == 131072);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    composer2 = composerStartRestartGroup;
                                    sliderColors3 = sliderColors5;
                                    f5 = f7;
                                    function22 = function23;
                                    f4 = f8;
                                    z5 = z8;
                                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$11$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
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
                                            SliderDefaults.INSTANCE.m2925drawTrackngJ0SCU(drawScope, rangeSliderState.getTickFractions(), rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release(), rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release(), jM2921trackColorWaAFU9c$material3_release, jM2921trackColorWaAFU9c$material3_release2, jM2920tickColorWaAFU9c$material3_release, jM2920tickColorWaAFU9c$material3_release2, drawScope.mo1123toDpu2uoSUM(rangeSliderState.getTrackHeight$material3_release()), drawScope.mo1123toDpu2uoSUM(rangeSliderState.getStartThumbWidth$material3_release()), drawScope.mo1123toDpu2uoSUM(rangeSliderState.getEndThumbWidth$material3_release()), f5, f4, function22, function32, true);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                } else {
                                    f5 = f7;
                                    f4 = f8;
                                    function22 = function23;
                                    z5 = z8;
                                    composer2 = composerStartRestartGroup;
                                    sliderColors3 = sliderColors5;
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                CanvasKt.Canvas(modifierRotate, (Function1) objRememberedValue, composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f6 = f5;
                                z6 = z5;
                                sliderColors4 = sliderColors3;
                                modifier3 = modifier4;
                            }
                        } else {
                            function23 = function24;
                        }
                        if ((i8 & 24576) == 16384) {
                            z3 = false;
                        }
                        z4 = zChangedInstance | z3 | ((458752 & i8) == 131072);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z4) {
                            composer2 = composerStartRestartGroup;
                            sliderColors3 = sliderColors5;
                            f5 = f7;
                            function22 = function23;
                            f4 = f8;
                            z5 = z8;
                            objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$11$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    SliderDefaults.INSTANCE.m2925drawTrackngJ0SCU(drawScope, rangeSliderState.getTickFractions(), rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release(), rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release(), jM2921trackColorWaAFU9c$material3_release, jM2921trackColorWaAFU9c$material3_release2, jM2920tickColorWaAFU9c$material3_release, jM2920tickColorWaAFU9c$material3_release2, drawScope.mo1123toDpu2uoSUM(rangeSliderState.getTrackHeight$material3_release()), drawScope.mo1123toDpu2uoSUM(rangeSliderState.getStartThumbWidth$material3_release()), drawScope.mo1123toDpu2uoSUM(rangeSliderState.getEndThumbWidth$material3_release()), f5, f4, function22, function32, true);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            CanvasKt.Canvas(modifierRotate, (Function1) objRememberedValue, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            f6 = f5;
                            z6 = z5;
                            sliderColors4 = sliderColors3;
                            modifier3 = modifier4;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        sliderColors4 = sliderColors2;
                        f6 = f3;
                        z6 = z2;
                    }
                    final float f9 = f4;
                    final Function2<? super DrawScope, ? super Offset, Unit> function25 = function22;
                    final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function33 = function32;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.12
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

                            public final void invoke(Composer composer3, int i13) {
                                SliderDefaults.this.m2928Track4EFweAY(rangeSliderState, modifier3, z6, sliderColors4, function25, function33, f6, f9, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= i9;
                if ((38347923 & i3) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i2 & 8) != 0) {
                        }
                        if ((i2 & 16) != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        i8 = i3;
                        Modifier modifier42 = modifier2;
                        SliderColors sliderColors52 = sliderColors2;
                        float f72 = f3;
                        boolean z82 = z2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final long jM2921trackColorWaAFU9c$material3_release3 = sliderColors52.m2921trackColorWaAFU9c$material3_release(z82, false);
                        final long jM2921trackColorWaAFU9c$material3_release22 = sliderColors52.m2921trackColorWaAFU9c$material3_release(z82, true);
                        float f82 = f4;
                        Function2<? super DrawScope, ? super Offset, Unit> function242 = function22;
                        final long jM2920tickColorWaAFU9c$material3_release3 = sliderColors52.m2920tickColorWaAFU9c$material3_release(z82, false);
                        final long jM2920tickColorWaAFU9c$material3_release22 = sliderColors52.m2920tickColorWaAFU9c$material3_release(z82, true);
                        Modifier modifierM1466height3ABfNKs2 = SizeKt.m1466height3ABfNKs(SizeKt.fillMaxWidth$default(modifier42, 0.0f, 1, null), SliderKt.getTrackHeight());
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume2 = composerStartRestartGroup.consume(localLayoutDirection2);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        Modifier modifierRotate2 = RotateKt.rotate(modifierM1466height3ABfNKs2, objConsume2 != LayoutDirection.Rtl ? 180.0f : 0.0f);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -800695691, "CC(remember):Slider.kt#9igjgp");
                        boolean zChangedInstance2 = ((3670016 & i8) != 1048576) | composerStartRestartGroup.changedInstance(rangeSliderState) | composerStartRestartGroup.changed(jM2921trackColorWaAFU9c$material3_release3) | composerStartRestartGroup.changed(jM2921trackColorWaAFU9c$material3_release22) | composerStartRestartGroup.changed(jM2920tickColorWaAFU9c$material3_release3) | composerStartRestartGroup.changed(jM2920tickColorWaAFU9c$material3_release22) | ((29360128 & i8) != 8388608);
                        if (((57344 & i8) ^ 24576) <= 16384) {
                        }
                        if ((i8 & 24576) == 16384) {
                        }
                        z4 = zChangedInstance2 | z3 | ((458752 & i8) == 131072);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z4) {
                        }
                    }
                }
                final float f92 = f4;
                final Function2<? super DrawScope, ? super Offset, Unit> function252 = function22;
                final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function332 = function32;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i3 |= i9;
            if ((38347923 & i3) == 38347922) {
            }
            final float f922 = f4;
            final Function2<? super DrawScope, ? super Offset, Unit> function2522 = function22;
            final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3322 = function32;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i3 |= i9;
        if ((38347923 & i3) == 38347922) {
        }
        final float f9222 = f4;
        final Function2<? super DrawScope, ? super Offset, Unit> function25222 = function22;
        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function33222 = function32;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c1  */
    /* renamed from: drawTrack-ngJ0SCU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2925drawTrackngJ0SCU(DrawScope drawScope, float[] fArr, float f, float f2, long j, long j2, long j3, long j4, float f3, float f4, float f5, float f6, float f7, Function2<? super DrawScope, ? super Offset, Unit> function2, Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3, boolean z) {
        float f8;
        float f9;
        float f10;
        int i;
        float f11;
        float f12;
        long jOffset = OffsetKt.Offset(0.0f, Offset.m4355getYimpl(drawScope.mo5150getCenterF1C5BW0()));
        long jOffset2 = OffsetKt.Offset(Size.m4423getWidthimpl(drawScope.mo5151getSizeNHjbRc()), Offset.m4355getYimpl(drawScope.mo5150getCenterF1C5BW0()));
        float f13 = drawScope.mo1127toPx0680j_4(f3);
        long jOffset3 = OffsetKt.Offset(Offset.m4354getXimpl(jOffset) + ((Offset.m4354getXimpl(jOffset2) - Offset.m4354getXimpl(jOffset)) * f2), Offset.m4355getYimpl(drawScope.mo5150getCenterF1C5BW0()));
        long jOffset4 = OffsetKt.Offset(Offset.m4354getXimpl(jOffset) + ((Offset.m4354getXimpl(jOffset2) - Offset.m4354getXimpl(jOffset)) * f), Offset.m4355getYimpl(drawScope.mo5150getCenterF1C5BW0()));
        float f14 = 2;
        float f15 = f13 / f14;
        float f16 = drawScope.mo1127toPx0680j_4(f7);
        if (C1959Dp.m7054compareTo0680j_4(f6, C1959Dp.m7055constructorimpl(0)) > 0) {
            f8 = (drawScope.mo1127toPx0680j_4(f4) / f14) + drawScope.mo1127toPx0680j_4(f6);
            f9 = (drawScope.mo1127toPx0680j_4(f5) / f14) + drawScope.mo1127toPx0680j_4(f6);
        } else {
            f8 = 0.0f;
            f9 = 0.0f;
        }
        if (!z || Offset.m4354getXimpl(jOffset4) <= Offset.m4354getXimpl(jOffset) + f8 + f15) {
            f10 = f13;
            i = 0;
        } else {
            float fM4354getXimpl = Offset.m4354getXimpl(jOffset);
            f10 = f13;
            i = 0;
            m2926drawTrackPathCx2C_VA(drawScope, Offset.INSTANCE.m4370getZeroF1C5BW0(), androidx.compose.p000ui.geometry.SizeKt.Size((Offset.m4354getXimpl(jOffset4) - f8) - fM4354getXimpl, f13), j, f15, f16);
            if (function2 != null) {
                function2.invoke(drawScope, Offset.m4343boximpl(OffsetKt.Offset(fM4354getXimpl + f15, Offset.m4355getYimpl(drawScope.mo5150getCenterF1C5BW0()))));
            }
        }
        if (Offset.m4354getXimpl(jOffset3) < (Offset.m4354getXimpl(jOffset2) - f9) - f15) {
            float fM4354getXimpl2 = Offset.m4354getXimpl(jOffset3) + f9;
            float fM4354getXimpl3 = Offset.m4354getXimpl(jOffset2);
            float f17 = f10;
            f12 = f17;
            m2926drawTrackPathCx2C_VA(drawScope, OffsetKt.Offset(fM4354getXimpl2, 0.0f), androidx.compose.p000ui.geometry.SizeKt.Size(fM4354getXimpl3 - fM4354getXimpl2, f17), j, f16, f15);
            f11 = f15;
            f16 = f16;
            if (function2 != null) {
                function2.invoke(drawScope, Offset.m4343boximpl(OffsetKt.Offset(fM4354getXimpl3 - f11, Offset.m4355getYimpl(drawScope.mo5150getCenterF1C5BW0()))));
            }
        } else {
            f11 = f15;
            f12 = f10;
        }
        float fM4354getXimpl4 = z ? Offset.m4354getXimpl(jOffset4) + f8 : 0.0f;
        float fM4354getXimpl5 = Offset.m4354getXimpl(jOffset3) - f9;
        float f18 = z ? f16 : f11;
        float f19 = fM4354getXimpl5 - fM4354getXimpl4;
        if (f19 > f18) {
            m2926drawTrackPathCx2C_VA(drawScope, OffsetKt.Offset(fM4354getXimpl4, 0.0f), androidx.compose.p000ui.geometry.SizeKt.Size(f19, f12), j2, f18, f16);
        }
        long jOffset5 = OffsetKt.Offset(Offset.m4354getXimpl(jOffset) + f11, Offset.m4355getYimpl(jOffset));
        long jOffset6 = OffsetKt.Offset(Offset.m4354getXimpl(jOffset2) - f11, Offset.m4355getYimpl(jOffset2));
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = RangesKt.rangeTo(Offset.m4354getXimpl(jOffset4) - f8, Offset.m4354getXimpl(jOffset4) + f8);
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo2 = RangesKt.rangeTo(Offset.m4354getXimpl(jOffset3) - f9, Offset.m4354getXimpl(jOffset3) + f9);
        int length = fArr.length;
        int i2 = i;
        int i3 = i2;
        while (i2 < length) {
            float f20 = fArr[i2];
            int i4 = i3 + 1;
            int i5 = 1;
            if (function2 == null || ((!z || i3 != 0) && i3 != fArr.length - 1)) {
                if (f20 <= f2 && f20 >= f) {
                    i5 = i;
                }
                long jOffset7 = OffsetKt.Offset(Offset.m4354getXimpl(OffsetKt.m4377lerpWko1d7g(jOffset5, jOffset6, f20)), Offset.m4355getYimpl(drawScope.mo5150getCenterF1C5BW0()));
                if ((!z || !closedFloatingPointRangeRangeTo.contains(Float.valueOf(Offset.m4354getXimpl(jOffset7)))) && !closedFloatingPointRangeRangeTo2.contains(Float.valueOf(Offset.m4354getXimpl(jOffset7)))) {
                    function3.invoke(drawScope, Offset.m4343boximpl(jOffset7), Color.m4585boximpl(i5 != 0 ? j3 : j4));
                }
            }
            i2++;
            i3 = i4;
        }
    }

    /* renamed from: drawTrackPath-Cx2C_VA, reason: not valid java name */
    private final void m2926drawTrackPathCx2C_VA(DrawScope drawScope, long j, long j2, long j3, float f, float f2) {
        long jCornerRadius = CornerRadiusKt.CornerRadius(f, f);
        long jCornerRadius2 = CornerRadiusKt.CornerRadius(f2, f2);
        RoundRect roundRectM4406RoundRectZAM2FJo = RoundRectKt.m4406RoundRectZAM2FJo(RectKt.m4394Recttz77jQw(OffsetKt.Offset(Offset.m4354getXimpl(j), 0.0f), androidx.compose.p000ui.geometry.SizeKt.Size(Size.m4423getWidthimpl(j2), Size.m4420getHeightimpl(j2))), jCornerRadius, jCornerRadius2, jCornerRadius2, jCornerRadius);
        Path path = trackPath;
        Path.addRoundRect$default(path, roundRectM4406RoundRectZAM2FJo, null, 2, null);
        DrawScope.m5141drawPathLG529CI$default(drawScope, path, j3, 0.0f, null, null, 0, 60, null);
        path.rewind();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawStopIndicator-x3O1jOs, reason: not valid java name */
    public final void m2924drawStopIndicatorx3O1jOs(DrawScope drawScope, long offset, float size, long color) {
        DrawScope.m5132drawCircleVaOC9Bg$default(drawScope, color, drawScope.mo1127toPx0680j_4(size) / 2.0f, offset, 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
    }

    /* renamed from: getTrackStopIndicatorSize-D9Ej5fM, reason: not valid java name */
    public final float m2932getTrackStopIndicatorSizeD9Ej5fM() {
        return TrackStopIndicatorSize;
    }

    /* renamed from: getTickSize-D9Ej5fM, reason: not valid java name */
    public final float m2931getTickSizeD9Ej5fM() {
        return TickSize;
    }
}
