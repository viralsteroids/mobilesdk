package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.SearchBarTokens;
import androidx.compose.material3.tokens.SearchViewTokens;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.focus.FocusChangedModifierKt;
import androidx.compose.p000ui.focus.FocusManager;
import androidx.compose.p000ui.focus.FocusRequester;
import androidx.compose.p000ui.focus.FocusRequesterModifierKt;
import androidx.compose.p000ui.focus.FocusState;
import androidx.compose.p000ui.graphics.Brush;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.Shadow;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.graphics.SolidColor;
import androidx.compose.p000ui.graphics.drawscope.DrawStyle;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.semantics.SemanticsModifierKt;
import androidx.compose.p000ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p000ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p000ui.text.PlatformTextStyle;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontSynthesis;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.input.ImeAction;
import androidx.compose.p000ui.text.input.PlatformImeOptions;
import androidx.compose.p000ui.text.input.VisualTransformation;
import androidx.compose.p000ui.text.intl.LocaleList;
import androidx.compose.p000ui.text.style.BaselineShift;
import androidx.compose.p000ui.text.style.LineHeightStyle;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.text.style.TextGeometricTransform;
import androidx.compose.p000ui.text.style.TextIndent;
import androidx.compose.p000ui.text.style.TextMotion;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.jmrtd.lds.LDSFile;

/* compiled from: SearchBar.android.kt */
@Metadata(m513d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JÈ\u0001\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c0 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c0 2\u0006\u0010\"\u001a\u00020#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001c0 2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020#2\u0015\b\u0002\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u001c\u0018\u00010)¢\u0006\u0002\b*2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u001c\u0018\u00010)¢\u0006\u0002\b*2\u0015\b\u0002\u0010,\u001a\u000f\u0012\u0004\u0012\u00020\u001c\u0018\u00010)¢\u0006\u0002\b*2\b\b\u0002\u0010-\u001a\u00020.2\n\b\u0002\u0010/\u001a\u0004\u0018\u000100H\u0007¢\u0006\u0002\u00101J&\u0010-\u001a\u0002022\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u000204H\u0007ø\u0001\u0000¢\u0006\u0004\b6\u00107J0\u0010-\u001a\u0002022\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002042\b\b\u0002\u00108\u001a\u00020.H\u0007ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u008a\u0001\u00108\u001a\u00020.2\b\b\u0002\u0010;\u001a\u0002042\b\b\u0002\u0010<\u001a\u0002042\b\b\u0002\u0010=\u001a\u0002042\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u0002042\b\b\u0002\u0010A\u001a\u0002042\b\b\u0002\u0010B\u001a\u0002042\b\b\u0002\u0010C\u001a\u0002042\b\b\u0002\u0010D\u001a\u0002042\b\b\u0002\u0010E\u001a\u0002042\b\b\u0002\u0010F\u001a\u0002042\b\b\u0002\u0010G\u001a\u000204H\u0007ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u009e\u0001\u00108\u001a\u00020.2\b\b\u0002\u0010J\u001a\u0002042\b\b\u0002\u0010K\u001a\u0002042\b\b\u0002\u0010<\u001a\u0002042\b\b\u0002\u0010=\u001a\u0002042\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u0002042\b\b\u0002\u0010A\u001a\u0002042\b\b\u0002\u0010B\u001a\u0002042\b\b\u0002\u0010C\u001a\u0002042\b\b\u0002\u0010D\u001a\u0002042\b\b\u0002\u0010E\u001a\u0002042\b\b\u0002\u0010L\u001a\u0002042\b\b\u0002\u0010M\u001a\u0002042\b\b\u0002\u0010G\u001a\u000204H\u0007ø\u0001\u0000¢\u0006\u0004\bN\u0010OR$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0019\u0010\u000b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0019\u0010\r\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, m514d2 = {"Landroidx/compose/material3/SearchBarDefaults;", "", "()V", "Elevation", "Landroidx/compose/ui/unit/Dp;", "getElevation-D9Ej5fM$annotations", "getElevation-D9Ej5fM", "()F", "F", "InputFieldHeight", "getInputFieldHeight-D9Ej5fM", "ShadowElevation", "getShadowElevation-D9Ej5fM", "TonalElevation", "getTonalElevation-D9Ej5fM", "dockedShape", "Landroidx/compose/ui/graphics/Shape;", "getDockedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "fullScreenShape", "getFullScreenShape", "inputFieldShape", "getInputFieldShape", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "InputField", "", SearchIntents.EXTRA_QUERY, "", "onQueryChange", "Lkotlin/Function1;", "onSearch", "expanded", "", "onExpandedChange", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "placeholder", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "leadingIcon", "trailingIcon", "colors", "Landroidx/compose/material3/TextFieldColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/material3/SearchBarColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "dividerColor", "colors-dgg9oW8", "(JJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;", "inputFieldColors", "colors-Klgx-Pg", "(JJLandroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;", "textColor", "disabledTextColor", "cursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "placeholderColor", "disabledPlaceholderColor", "inputFieldColors--u-KgnY", "(JJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;", "focusedTextColor", "unfocusedTextColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "inputFieldColors-ITpI4ow", "(JJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;", "material3_release"}, m515k = 1, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class SearchBarDefaults {
    public static final int $stable = 0;
    private static final float Elevation;
    public static final SearchBarDefaults INSTANCE = new SearchBarDefaults();
    private static final float InputFieldHeight;
    private static final float ShadowElevation;
    private static final float TonalElevation;

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to TonalElevation. Not to be confused with ShadowElevation.", replaceWith = @ReplaceWith(expression = "TonalElevation", imports = {}))
    /* renamed from: getElevation-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2849getElevationD9Ej5fM$annotations() {
    }

    private SearchBarDefaults() {
    }

    static {
        float fM3608getLevel0D9Ej5fM = ElevationTokens.INSTANCE.m3608getLevel0D9Ej5fM();
        TonalElevation = fM3608getLevel0D9Ej5fM;
        ShadowElevation = ElevationTokens.INSTANCE.m3608getLevel0D9Ej5fM();
        Elevation = fM3608getLevel0D9Ej5fM;
        InputFieldHeight = SearchBarTokens.INSTANCE.m3909getContainerHeightD9Ej5fM();
    }

    /* renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m2855getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }

    /* renamed from: getShadowElevation-D9Ej5fM, reason: not valid java name */
    public final float m2854getShadowElevationD9Ej5fM() {
        return ShadowElevation;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m2852getElevationD9Ej5fM() {
        return Elevation;
    }

    /* renamed from: getInputFieldHeight-D9Ej5fM, reason: not valid java name */
    public final float m2853getInputFieldHeightD9Ej5fM() {
        return InputFieldHeight;
    }

    public final Shape getInputFieldShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -971556142, "C349@15770L5:SearchBar.android.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-971556142, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-inputFieldShape> (SearchBar.android.kt:349)");
        }
        Shape value = ShapesKt.getValue(SearchBarTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getFullScreenShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1665502056, "C353@15944L5:SearchBar.android.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1665502056, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-fullScreenShape> (SearchBar.android.kt:353)");
        }
        Shape value = ShapesKt.getValue(SearchViewTokens.INSTANCE.getFullScreenContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final Shape getDockedShape(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1006952150, "C357@16094L5:SearchBar.android.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1006952150, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-dockedShape> (SearchBar.android.kt:357)");
        }
        Shape value = ShapesKt.getValue(SearchViewTokens.INSTANCE.getDockedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return value;
    }

    public final WindowInsets getWindowInsets(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 2112270157, "C361@16229L10:SearchBar.android.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2112270157, i, -1, "androidx.compose.material3.SearchBarDefaults.<get-windowInsets> (SearchBar.android.kt:361)");
        }
        WindowInsets statusBars = WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return statusBars;
    }

    /* renamed from: colors-dgg9oW8, reason: not valid java name */
    public final SearchBarColors m2851colorsdgg9oW8(long j, long j2, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1507037523, "C(colors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color)375@16778L5,376@16845L5,381@17019L18:SearchBar.android.kt#uh7d8r");
        long value = (i2 & 1) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), composer, 6) : j;
        long value2 = (i2 & 2) != 0 ? ColorSchemeKt.getValue(SearchViewTokens.INSTANCE.getDividerColor(), composer, 6) : j2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1507037523, i, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.android.kt:378)");
        }
        SearchBarColors searchBarColors = new SearchBarColors(value, value2, m2857inputFieldColorsITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, (i << 6) & 57344, 16383), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return searchBarColors;
    }

    /* renamed from: inputFieldColors-ITpI4ow, reason: not valid java name */
    public final TextFieldColors m2857inputFieldColorsITpI4ow(long j, long j2, long j3, long j4, TextSelectionColors textSelectionColors, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i, int i2, int i3) {
        TextSelectionColors textSelectionColors2;
        ComposerKt.sourceInformationMarkerStart(composer, -602148837, "C(inputFieldColors)P(7:c#ui.graphics.Color,12:c#ui.graphics.Color,3:c#ui.graphics.Color,0:c#ui.graphics.Color,9,5:c#ui.graphics.Color,10:c#ui.graphics.Color,1:c#ui.graphics.Color,8:c#ui.graphics.Color,13:c#ui.graphics.Color,4:c#ui.graphics.Color,6:c#ui.graphics.Color,11:c#ui.graphics.Color,2:c#ui.graphics.Color)410@18829L5,411@18903L5,413@18998L5,416@19154L5,417@19233L7,418@19316L5,419@19399L5,421@19507L5,424@19683L5,425@19768L5,427@19878L5,430@20056L5,431@20142L5,433@20244L5,437@20389L847:SearchBar.android.kt#uh7d8r");
        long value = (i3 & 1) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j;
        long value2 = (i3 & 2) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j2;
        long jM4594copywmQWz5c$default = (i3 & 4) != 0 ? Color.m4594copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long value3 = (i3 & 8) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j4;
        if ((i3 & 16) != 0) {
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localTextSelectionColors);
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) objConsume;
        } else {
            textSelectionColors2 = textSelectionColors;
        }
        long value4 = (i3 & 32) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j5;
        long value5 = (i3 & 64) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j6;
        long jM4594copywmQWz5c$default2 = (i3 & 128) != 0 ? Color.m4594copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long value6 = (i3 & 256) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j8;
        long value7 = (i3 & 512) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j9;
        long jM4594copywmQWz5c$default3 = (i3 & 1024) != 0 ? Color.m4594copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long value8 = (i3 & 2048) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j11;
        long value9 = (i3 & 4096) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j12;
        long jM4594copywmQWz5c$default4 = (i3 & 8192) != 0 ? Color.m4594copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-602148837, i, i2, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.android.kt:437)");
        }
        int i4 = i2 << 18;
        TextFieldColors textFieldColorsM3109colors0hiis_0 = TextFieldDefaults.INSTANCE.m3109colors0hiis_0(value, value2, jM4594copywmQWz5c$default, 0L, 0L, 0L, 0L, 0L, value3, 0L, textSelectionColors2, 0L, 0L, 0L, 0L, value4, value5, jM4594copywmQWz5c$default2, 0L, value6, value7, jM4594copywmQWz5c$default3, 0L, 0L, 0L, 0L, 0L, value8, value9, jM4594copywmQWz5c$default4, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, (i & 1022) | ((i << 15) & 234881024), ((i >> 12) & 14) | (458752 & i) | (3670016 & i) | (i & 29360128) | ((i << 3) & 1879048192), ((i >> 27) & 14) | ((i2 << 3) & LDSFile.EF_DG16_TAG) | (i4 & 29360128) | (i4 & 234881024) | (i4 & 1879048192), 0, 3072, 1204058872, 4095);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return textFieldColorsM3109colors0hiis_0;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void InputField(final String str, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12, final boolean z, final Function1<? super Boolean, Unit> function13, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z3;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        MutableInteractionSource mutableInteractionSource2;
        int i15;
        Modifier.Companion companion;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i16;
        int i17;
        TextFieldColors textFieldColorsM2857inputFieldColorsITpI4ow;
        int i18;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource3;
        Composer composer3;
        MutableInteractionSource mutableInteractionSource4;
        Object objRememberedValue;
        final FocusRequester focusRequester;
        FocusManager focusManager;
        final String strM3410getString2EP1pXo;
        final String strM3410getString2EP1pXo2;
        long jM6570getColor0d7_KjU;
        boolean z4;
        Object objRememberedValue2;
        boolean zChanged;
        Object objRememberedValue3;
        boolean z5;
        Object objRememberedValue4;
        Composer composer4;
        boolean z6;
        boolean zChanged2;
        SearchBarDefaults$InputField$5$1 searchBarDefaults$InputField$5$1RememberedValue;
        Composer composer5;
        final MutableInteractionSource mutableInteractionSource5;
        final Modifier modifier3;
        final TextFieldColors textFieldColors2;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final boolean z7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1451366815);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(InputField)P(10,7,8,2,6,5,1,9,4,11)492@23517L18,498@23776L25,499@23837L29,500@23912L7,502@23951L34,503@24030L39,*506@24122L7,521@24685L44,522@24761L378,534@25242L7,537@25496L19,540@25625L1172,510@24250L2557,566@26894L320,566@26869L345:SearchBar.android.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function13) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
                z3 = z2;
            } else {
                z3 = z2;
                if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                }
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
                function24 = function2;
            } else {
                function24 = function2;
                if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function24) ? 8388608 : 4194304;
                }
            }
            i8 = i3 & 256;
            if (i8 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
            }
            i9 = i3 & 512;
            if (i9 == 0) {
                i4 |= 805306368;
            } else {
                if ((i & 805306368) == 0) {
                    i10 = i9;
                    i4 |= composerStartRestartGroup.changedInstance(function23) ? PKIFailureInfo.duplicateCertReq : 268435456;
                }
                if ((i2 & 6) == 0) {
                    i11 = i2 | (((i3 & 1024) == 0 && composerStartRestartGroup.changed(textFieldColors)) ? 4 : 2);
                } else {
                    i11 = i2;
                }
                i12 = i4;
                i13 = i3 & 2048;
                if (i13 != 0) {
                    i14 = i13;
                    i15 = i11 | 48;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    if ((i2 & 48) == 0) {
                        i14 = i13;
                        mutableInteractionSource2 = mutableInteractionSource;
                        i11 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 32 : 16;
                    } else {
                        i14 = i13;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    i15 = i11;
                }
                if ((i3 & 4096) == 0) {
                    if ((i2 & 384) == 0) {
                        i15 |= composerStartRestartGroup.changed(this) ? 256 : 128;
                    }
                    if ((i12 & 306783379) == 306783378 || (i15 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        int i19 = i15;
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            companion = i5 == 0 ? Modifier.INSTANCE : modifier2;
                            boolean z8 = i6 == 0 ? true : z3;
                            function25 = i7 == 0 ? null : function24;
                            function26 = i8 == 0 ? null : function22;
                            function27 = i10 == 0 ? null : function23;
                            if ((i3 & 1024) == 0) {
                                i17 = i14;
                                i16 = i12;
                                textFieldColorsM2857inputFieldColorsITpI4ow = m2857inputFieldColorsITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, (i19 << 6) & 57344, 16383);
                                composer2 = composerStartRestartGroup;
                                i18 = i19 & (-15);
                            } else {
                                i16 = i12;
                                i17 = i14;
                                textFieldColorsM2857inputFieldColorsITpI4ow = textFieldColors;
                                i18 = i19;
                                composer2 = composerStartRestartGroup;
                            }
                            if (i17 == 0) {
                                z3 = z8;
                                mutableInteractionSource3 = null;
                                composer3 = composer2;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource;
                                z3 = z8;
                                composer3 = composer2;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 1024) != 0) {
                                Modifier modifier4 = modifier2;
                                i18 = i19 & (-15);
                                companion = modifier4;
                                function26 = function22;
                                function27 = function23;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                function25 = function24;
                                i16 = i12;
                            } else {
                                function26 = function22;
                                function27 = function23;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                companion = modifier2;
                                function25 = function24;
                                i16 = i12;
                                i18 = i19;
                            }
                            textFieldColorsM2857inputFieldColorsITpI4ow = textFieldColors;
                            composer3 = composerStartRestartGroup;
                        }
                        composer3.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1451366815, i16, i18, "androidx.compose.material3.SearchBarDefaults.InputField (SearchBar.android.kt:494)");
                        }
                        composer3.startReplaceGroup(-320443616);
                        ComposerKt.sourceInformation(composer3, "496@23695L39");
                        if (mutableInteractionSource3 != null) {
                            ComposerKt.sourceInformationMarkerStart(composer3, -320442965, "CC(remember):SearchBar.android.kt#9igjgp");
                            Object objRememberedValue5 = composer3.rememberedValue();
                            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                                composer3.updateRememberedValue(objRememberedValue5);
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            mutableInteractionSource4 = (MutableInteractionSource) objRememberedValue5;
                        } else {
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        composer3.endReplaceGroup();
                        boolean zBooleanValue = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer3, 0).getValue().booleanValue();
                        ComposerKt.sourceInformationMarkerStart(composer3, -320438431, "CC(remember):SearchBar.android.kt#9igjgp");
                        objRememberedValue = composer3.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new FocusRequester();
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        focusRequester = (FocusRequester) objRememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                        Modifier modifier5 = companion;
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume = composer3.consume(localFocusManager);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        focusManager = (FocusManager) objConsume;
                        Strings.Companion companion2 = Strings.INSTANCE;
                        strM3410getString2EP1pXo = Strings_androidKt.m3410getString2EP1pXo(Strings.m3340constructorimpl(C1455R.string.m3c_search_bar_search), composer3, 0);
                        Strings.Companion companion3 = Strings.INSTANCE;
                        strM3410getString2EP1pXo2 = Strings_androidKt.m3410getString2EP1pXo(Strings.m3340constructorimpl(C1455R.string.m3c_suggestions_available), composer3, 0);
                        ProvidableCompositionLocal<TextStyle> localTextStyle = TextKt.getLocalTextStyle();
                        final MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume2 = composer3.consume(localTextStyle);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        jM6570getColor0d7_KjU = ((TextStyle) objConsume2).m6570getColor0d7_KjU();
                        if (jM6570getColor0d7_KjU == 16) {
                            jM6570getColor0d7_KjU = textFieldColorsM2857inputFieldColorsITpI4ow.m3097textColorXeAY9LY$material3_release(z3, false, zBooleanValue);
                        }
                        long j = jM6570getColor0d7_KjU;
                        Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.m1484sizeInqDBjuR0$default(modifier5, SearchBar_androidKt.getSearchBarMinWidth(), InputFieldHeight, SearchBar_androidKt.SearchBarMaxWidth, 0.0f, 8, null), focusRequester);
                        ComposerKt.sourceInformationMarkerStart(composer3, -320411280, "CC(remember):SearchBar.android.kt#9igjgp");
                        final boolean z9 = z3;
                        z4 = (57344 & i16) != 16384;
                        objRememberedValue2 = composer3.rememberedValue();
                        if (!z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (Function1) new Function1<FocusState, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                                    invoke2(focusState);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(FocusState focusState) {
                                    if (focusState.isFocused()) {
                                        function13.invoke(true);
                                    }
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue2);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue2);
                        ComposerKt.sourceInformationMarkerStart(composer3, -320408514, "CC(remember):SearchBar.android.kt#9igjgp");
                        zChanged = ((i16 & 7168) != 2048) | composer3.changed(strM3410getString2EP1pXo) | composer3.changed(strM3410getString2EP1pXo2);
                        objRememberedValue3 = composer3.rememberedValue();
                        if (!zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$2$1
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
                                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM3410getString2EP1pXo);
                                    if (z) {
                                        SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, strM3410getString2EP1pXo2);
                                    }
                                    final FocusRequester focusRequester2 = focusRequester;
                                    SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$2$1.1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Boolean invoke() {
                                            focusRequester2.requestFocus();
                                            return true;
                                        }
                                    }, 1, null);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierOnFocusChanged, false, (Function1) objRememberedValue3, 1, null);
                        ProvidableCompositionLocal<TextStyle> localTextStyle2 = TextKt.getLocalTextStyle();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume3 = composer3.consume(localTextStyle2);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        TextStyle textStyleMerge = ((TextStyle) objConsume3).merge(new TextStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                        SolidColor solidColor = new SolidColor(textFieldColorsM2857inputFieldColorsITpI4ow.m3047cursorColorvNxB06k$material3_release(false), null);
                        KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m6724getSearcheUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, LDSFile.EF_SOD_TAG, (DefaultConstructorMarker) null);
                        ComposerKt.sourceInformationMarkerStart(composer3, -320385353, "CC(remember):SearchBar.android.kt#9igjgp");
                        int i20 = i16 & 14;
                        z5 = ((i16 & 896) != 256) | (i20 != 4);
                        objRememberedValue4 = composer3.rememberedValue();
                        if (!z5 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = (Function1) new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                                    invoke2(keyboardActionScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(KeyboardActionScope keyboardActionScope) {
                                    function12.invoke(str);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        final TextFieldColors textFieldColors3 = textFieldColorsM2857inputFieldColorsITpI4ow;
                        final Function2<? super Composer, ? super Integer, Unit> function211 = function25;
                        final Function2<? super Composer, ? super Integer, Unit> function212 = function26;
                        final Function2<? super Composer, ? super Integer, Unit> function213 = function27;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-2029278807, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults.InputField.4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function214, Composer composer6, Integer num) {
                                invoke((Function2<? super Composer, ? super Integer, Unit>) function214, composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> function214, Composer composer6, int i21) {
                                int i22;
                                ComposerKt.sourceInformation(composer6, "C557@26571L15,541@25683L1096:SearchBar.android.kt#uh7d8r");
                                if ((i21 & 6) == 0) {
                                    i22 = i21 | (composer6.changedInstance(function214) ? 4 : 2);
                                } else {
                                    i22 = i21;
                                }
                                if ((i22 & 19) != 18 || !composer6.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2029278807, i22, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous> (SearchBar.android.kt:541)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                    int i23 = i22;
                                    String str2 = str;
                                    boolean z10 = z9;
                                    VisualTransformation none = VisualTransformation.INSTANCE.getNone();
                                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource6;
                                    Function2<Composer, Integer, Unit> function215 = function211;
                                    final Function2<Composer, Integer, Unit> function216 = function212;
                                    composer6.startReplaceGroup(-1102017390);
                                    ComposerKt.sourceInformation(composer6, "*551@26196L64");
                                    ComposableLambda composableLambdaRememberComposableLambda2 = function216 == null ? null : ComposableLambdaKt.rememberComposableLambda(-1401341985, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$4$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                            invoke(composer7, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer7, int i24) {
                                            ComposerKt.sourceInformation(composer7, "C551@26198L60:SearchBar.android.kt#uh7d8r");
                                            if ((i24 & 3) == 2 && composer7.getSkipping()) {
                                                composer7.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1401341985, i24, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:551)");
                                            }
                                            Modifier modifierM1396offsetVpY3zN4$default = OffsetKt.m1396offsetVpY3zN4$default(Modifier.INSTANCE, SearchBar_androidKt.SearchBarIconOffsetX, 0.0f, 2, null);
                                            Function2<Composer, Integer, Unit> function217 = function216;
                                            ComposerKt.sourceInformationMarkerStart(composer7, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                            ComposerKt.sourceInformationMarkerStart(composer7, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer7.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer7, modifierM1396offsetVpY3zN4$default);
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer7, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                            if (!(composer7.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer7.startReusableNode();
                                            if (composer7.getInserting()) {
                                                composer7.createNode(constructor);
                                            } else {
                                                composer7.useNode();
                                            }
                                            Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composer7);
                                            Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer7, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer7, -127763558, "C551@26247L9:SearchBar.android.kt#uh7d8r");
                                            function217.invoke(composer7, 0);
                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                            composer7.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer6, 54);
                                    composer6.endReplaceGroup();
                                    final Function2<Composer, Integer, Unit> function217 = function213;
                                    composer6.startReplaceGroup(-1102010155);
                                    ComposerKt.sourceInformation(composer6, "*555@26423L66");
                                    ComposableLambda composableLambdaRememberComposableLambda3 = function217 != null ? ComposableLambdaKt.rememberComposableLambda(907752083, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$4$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                            invoke(composer7, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer7, int i24) {
                                            ComposerKt.sourceInformation(composer7, "C555@26425L62:SearchBar.android.kt#uh7d8r");
                                            if ((i24 & 3) == 2 && composer7.getSkipping()) {
                                                composer7.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(907752083, i24, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:555)");
                                            }
                                            Modifier modifierM1396offsetVpY3zN4$default = OffsetKt.m1396offsetVpY3zN4$default(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(-SearchBar_androidKt.SearchBarIconOffsetX), 0.0f, 2, null);
                                            Function2<Composer, Integer, Unit> function218 = function217;
                                            ComposerKt.sourceInformationMarkerStart(composer7, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                            ComposerKt.sourceInformationMarkerStart(composer7, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer7.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer7, modifierM1396offsetVpY3zN4$default);
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer7, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                            if (!(composer7.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer7.startReusableNode();
                                            if (composer7.getInserting()) {
                                                composer7.createNode(constructor);
                                            } else {
                                                composer7.useNode();
                                            }
                                            Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composer7);
                                            Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer7, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer7, -127537351, "C555@26475L10:SearchBar.android.kt#uh7d8r");
                                            function218.invoke(composer7, 0);
                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                            composer7.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                            ComposerKt.sourceInformationMarkerEnd(composer7);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer6, 54) : null;
                                    composer6.endReplaceGroup();
                                    textFieldDefaults.DecorationBox(str2, function214, z10, true, none, mutableInteractionSource7, false, null, function215, composableLambdaRememberComposableLambda2, composableLambdaRememberComposableLambda3, null, null, null, SearchBarDefaults.INSTANCE.getInputFieldShape(composer6, 6), textFieldColors3, TextFieldDefaults.m3100contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), ComposableSingletons$SearchBar_androidKt.INSTANCE.m2412getLambda1$material3_release(), composer6, ((i23 << 3) & LDSFile.EF_DG16_TAG) | 27648, 113246208, 14528);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer6.skipToGroupEnd();
                            }
                        }, composer3, 54);
                        int i21 = i20 | 102236160 | (i16 & LDSFile.EF_DG16_TAG);
                        int i22 = i16 >> 9;
                        composer4 = composer3;
                        BasicTextFieldKt.BasicTextField(str, function1, modifierSemantics$default, z9, false, textStyleMerge, keyboardOptions, new KeyboardActions(null, null, null, null, (Function1) objRememberedValue4, null, 47, null), true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource6, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) composableLambdaRememberComposableLambda, composer4, i21 | (i22 & 7168), ProfileVerifier.CompilationStatus.f285xf2722a21, 7696);
                        z6 = z && zBooleanValue;
                        Boolean boolValueOf = Boolean.valueOf(z);
                        ComposerKt.sourceInformationMarkerStart(composer4, -320340316, "CC(remember):SearchBar.android.kt#9igjgp");
                        zChanged2 = composer4.changed(z6) | composer4.changedInstance(focusManager);
                        searchBarDefaults$InputField$5$1RememberedValue = composer4.rememberedValue();
                        if (!zChanged2 || searchBarDefaults$InputField$5$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                            searchBarDefaults$InputField$5$1RememberedValue = new SearchBarDefaults$InputField$5$1(z6, focusManager, null);
                            composer4.updateRememberedValue(searchBarDefaults$InputField$5$1RememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) searchBarDefaults$InputField$5$1RememberedValue, composer4, i22 & 14);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer5 = composer4;
                        mutableInteractionSource5 = mutableInteractionSource3;
                        modifier3 = modifier5;
                        textFieldColors2 = textFieldColors3;
                        function28 = function25;
                        function29 = function26;
                        function210 = function27;
                        z7 = z9;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        textFieldColors2 = textFieldColors;
                        composer5 = composerStartRestartGroup;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        modifier3 = modifier2;
                        z7 = z3;
                        function28 = function24;
                        function29 = function22;
                        function210 = function23;
                    }
                    scopeUpdateScopeEndRestartGroup = composer5.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults.InputField.6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                invoke(composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer6, int i23) {
                                SearchBarDefaults.this.InputField(str, function1, function12, z, function13, modifier3, z7, function28, function29, function210, textFieldColors2, mutableInteractionSource5, composer6, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i15 |= 384;
                if ((i12 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    int i192 = i15;
                    if ((i & 1) != 0) {
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if ((i3 & 1024) == 0) {
                        }
                        if (i17 == 0) {
                        }
                        composer3.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer3.startReplaceGroup(-320443616);
                        ComposerKt.sourceInformation(composer3, "496@23695L39");
                        if (mutableInteractionSource3 != null) {
                        }
                        composer3.endReplaceGroup();
                        boolean zBooleanValue2 = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource4, composer3, 0).getValue().booleanValue();
                        ComposerKt.sourceInformationMarkerStart(composer3, -320438431, "CC(remember):SearchBar.android.kt#9igjgp");
                        objRememberedValue = composer3.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        focusRequester = (FocusRequester) objRememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ProvidableCompositionLocal<FocusManager> localFocusManager2 = CompositionLocalsKt.getLocalFocusManager();
                        Modifier modifier52 = companion;
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume4 = composer3.consume(localFocusManager2);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        focusManager = (FocusManager) objConsume4;
                        Strings.Companion companion22 = Strings.INSTANCE;
                        strM3410getString2EP1pXo = Strings_androidKt.m3410getString2EP1pXo(Strings.m3340constructorimpl(C1455R.string.m3c_search_bar_search), composer3, 0);
                        Strings.Companion companion32 = Strings.INSTANCE;
                        strM3410getString2EP1pXo2 = Strings_androidKt.m3410getString2EP1pXo(Strings.m3340constructorimpl(C1455R.string.m3c_suggestions_available), composer3, 0);
                        ProvidableCompositionLocal<TextStyle> localTextStyle3 = TextKt.getLocalTextStyle();
                        final MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource4;
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume22 = composer3.consume(localTextStyle3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        jM6570getColor0d7_KjU = ((TextStyle) objConsume22).m6570getColor0d7_KjU();
                        if (jM6570getColor0d7_KjU == 16) {
                        }
                        long j2 = jM6570getColor0d7_KjU;
                        Modifier modifierFocusRequester2 = FocusRequesterModifierKt.focusRequester(SizeKt.m1484sizeInqDBjuR0$default(modifier52, SearchBar_androidKt.getSearchBarMinWidth(), InputFieldHeight, SearchBar_androidKt.SearchBarMaxWidth, 0.0f, 8, null), focusRequester);
                        ComposerKt.sourceInformationMarkerStart(composer3, -320411280, "CC(remember):SearchBar.android.kt#9igjgp");
                        final boolean z92 = z3;
                        if ((57344 & i16) != 16384) {
                        }
                        objRememberedValue2 = composer3.rememberedValue();
                        if (!z4) {
                            objRememberedValue2 = (Function1) new Function1<FocusState, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                                    invoke2(focusState);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(FocusState focusState) {
                                    if (focusState.isFocused()) {
                                        function13.invoke(true);
                                    }
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue2);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester2, (Function1) objRememberedValue2);
                            ComposerKt.sourceInformationMarkerStart(composer3, -320408514, "CC(remember):SearchBar.android.kt#9igjgp");
                            zChanged = ((i16 & 7168) != 2048) | composer3.changed(strM3410getString2EP1pXo) | composer3.changed(strM3410getString2EP1pXo2);
                            objRememberedValue3 = composer3.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue3 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$2$1
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
                                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM3410getString2EP1pXo);
                                        if (z) {
                                            SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, strM3410getString2EP1pXo2);
                                        }
                                        final FocusRequester focusRequester2 = focusRequester;
                                        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$2$1.1
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Boolean invoke() {
                                                focusRequester2.requestFocus();
                                                return true;
                                            }
                                        }, 1, null);
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(modifierOnFocusChanged2, false, (Function1) objRememberedValue3, 1, null);
                                ProvidableCompositionLocal<TextStyle> localTextStyle22 = TextKt.getLocalTextStyle();
                                ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object objConsume32 = composer3.consume(localTextStyle22);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                TextStyle textStyleMerge2 = ((TextStyle) objConsume32).merge(new TextStyle(j2, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777214, (DefaultConstructorMarker) null));
                                SolidColor solidColor2 = new SolidColor(textFieldColorsM2857inputFieldColorsITpI4ow.m3047cursorColorvNxB06k$material3_release(false), null);
                                KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m6724getSearcheUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, LDSFile.EF_SOD_TAG, (DefaultConstructorMarker) null);
                                ComposerKt.sourceInformationMarkerStart(composer3, -320385353, "CC(remember):SearchBar.android.kt#9igjgp");
                                int i202 = i16 & 14;
                                z5 = ((i16 & 896) != 256) | (i202 != 4);
                                objRememberedValue4 = composer3.rememberedValue();
                                if (!z5) {
                                    objRememberedValue4 = (Function1) new Function1<KeyboardActionScope, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(KeyboardActionScope keyboardActionScope) {
                                            invoke2(keyboardActionScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(KeyboardActionScope keyboardActionScope) {
                                            function12.invoke(str);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue4);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    final TextFieldColors textFieldColors32 = textFieldColorsM2857inputFieldColorsITpI4ow;
                                    final Function2<? super Composer, ? super Integer, Unit> function2112 = function25;
                                    final Function2<? super Composer, ? super Integer, Unit> function2122 = function26;
                                    final Function2<? super Composer, ? super Integer, Unit> function2132 = function27;
                                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-2029278807, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults.InputField.4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function214, Composer composer6, Integer num) {
                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function214, composer6, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> function214, Composer composer6, int i212) {
                                            int i222;
                                            ComposerKt.sourceInformation(composer6, "C557@26571L15,541@25683L1096:SearchBar.android.kt#uh7d8r");
                                            if ((i212 & 6) == 0) {
                                                i222 = i212 | (composer6.changedInstance(function214) ? 4 : 2);
                                            } else {
                                                i222 = i212;
                                            }
                                            if ((i222 & 19) != 18 || !composer6.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-2029278807, i222, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous> (SearchBar.android.kt:541)");
                                                }
                                                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                                int i23 = i222;
                                                String str2 = str;
                                                boolean z10 = z92;
                                                VisualTransformation none = VisualTransformation.INSTANCE.getNone();
                                                MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource62;
                                                Function2<Composer, Integer, Unit> function215 = function2112;
                                                final Function2<? super Composer, ? super Integer, Unit> function216 = function2122;
                                                composer6.startReplaceGroup(-1102017390);
                                                ComposerKt.sourceInformation(composer6, "*551@26196L64");
                                                ComposableLambda composableLambdaRememberComposableLambda22 = function216 == null ? null : ComposableLambdaKt.rememberComposableLambda(-1401341985, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$4$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                        invoke(composer7, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer7, int i24) {
                                                        ComposerKt.sourceInformation(composer7, "C551@26198L60:SearchBar.android.kt#uh7d8r");
                                                        if ((i24 & 3) == 2 && composer7.getSkipping()) {
                                                            composer7.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1401341985, i24, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:551)");
                                                        }
                                                        Modifier modifierM1396offsetVpY3zN4$default = OffsetKt.m1396offsetVpY3zN4$default(Modifier.INSTANCE, SearchBar_androidKt.SearchBarIconOffsetX, 0.0f, 2, null);
                                                        Function2<Composer, Integer, Unit> function217 = function216;
                                                        ComposerKt.sourceInformationMarkerStart(composer7, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                        ComposerKt.sourceInformationMarkerStart(composer7, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer7.getCurrentCompositionLocalMap();
                                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer7, modifierM1396offsetVpY3zN4$default);
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        ComposerKt.sourceInformationMarkerStart(composer7, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                        if (!(composer7.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer7.startReusableNode();
                                                        if (composer7.getInserting()) {
                                                            composer7.createNode(constructor);
                                                        } else {
                                                            composer7.useNode();
                                                        }
                                                        Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composer7);
                                                        Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(composer7, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        ComposerKt.sourceInformationMarkerStart(composer7, -127763558, "C551@26247L9:SearchBar.android.kt#uh7d8r");
                                                        function217.invoke(composer7, 0);
                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        composer7.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer6, 54);
                                                composer6.endReplaceGroup();
                                                final Function2<? super Composer, ? super Integer, Unit> function217 = function2132;
                                                composer6.startReplaceGroup(-1102010155);
                                                ComposerKt.sourceInformation(composer6, "*555@26423L66");
                                                ComposableLambda composableLambdaRememberComposableLambda3 = function217 != null ? ComposableLambdaKt.rememberComposableLambda(907752083, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$4$2$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                                        invoke(composer7, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer7, int i24) {
                                                        ComposerKt.sourceInformation(composer7, "C555@26425L62:SearchBar.android.kt#uh7d8r");
                                                        if ((i24 & 3) == 2 && composer7.getSkipping()) {
                                                            composer7.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(907752083, i24, -1, "androidx.compose.material3.SearchBarDefaults.InputField.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:555)");
                                                        }
                                                        Modifier modifierM1396offsetVpY3zN4$default = OffsetKt.m1396offsetVpY3zN4$default(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(-SearchBar_androidKt.SearchBarIconOffsetX), 0.0f, 2, null);
                                                        Function2<Composer, Integer, Unit> function218 = function217;
                                                        ComposerKt.sourceInformationMarkerStart(composer7, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                        ComposerKt.sourceInformationMarkerStart(composer7, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
                                                        CompositionLocalMap currentCompositionLocalMap = composer7.getCurrentCompositionLocalMap();
                                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer7, modifierM1396offsetVpY3zN4$default);
                                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                        ComposerKt.sourceInformationMarkerStart(composer7, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                        if (!(composer7.getApplier() instanceof Applier)) {
                                                            ComposablesKt.invalidApplier();
                                                        }
                                                        composer7.startReusableNode();
                                                        if (composer7.getInserting()) {
                                                            composer7.createNode(constructor);
                                                        } else {
                                                            composer7.useNode();
                                                        }
                                                        Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composer7);
                                                        Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                        Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                        if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                            composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                            composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                        }
                                                        Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                        ComposerKt.sourceInformationMarkerStart(composer7, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        ComposerKt.sourceInformationMarkerStart(composer7, -127537351, "C555@26475L10:SearchBar.android.kt#uh7d8r");
                                                        function218.invoke(composer7, 0);
                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        composer7.endNode();
                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer6, 54) : null;
                                                composer6.endReplaceGroup();
                                                textFieldDefaults.DecorationBox(str2, function214, z10, true, none, mutableInteractionSource7, false, null, function215, composableLambdaRememberComposableLambda22, composableLambdaRememberComposableLambda3, null, null, null, SearchBarDefaults.INSTANCE.getInputFieldShape(composer6, 6), textFieldColors32, TextFieldDefaults.m3100contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null), ComposableSingletons$SearchBar_androidKt.INSTANCE.m2412getLambda1$material3_release(), composer6, ((i23 << 3) & LDSFile.EF_DG16_TAG) | 27648, 113246208, 14528);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer6.skipToGroupEnd();
                                        }
                                    }, composer3, 54);
                                    int i212 = i202 | 102236160 | (i16 & LDSFile.EF_DG16_TAG);
                                    int i222 = i16 >> 9;
                                    composer4 = composer3;
                                    BasicTextFieldKt.BasicTextField(str, function1, modifierSemantics$default2, z92, false, textStyleMerge2, keyboardOptions2, new KeyboardActions(null, null, null, null, (Function1) objRememberedValue4, null, 47, null), true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource62, (Brush) solidColor2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) composableLambdaRememberComposableLambda2, composer4, i212 | (i222 & 7168), ProfileVerifier.CompilationStatus.f285xf2722a21, 7696);
                                    if (z) {
                                        Boolean boolValueOf2 = Boolean.valueOf(z);
                                        ComposerKt.sourceInformationMarkerStart(composer4, -320340316, "CC(remember):SearchBar.android.kt#9igjgp");
                                        zChanged2 = composer4.changed(z6) | composer4.changedInstance(focusManager);
                                        searchBarDefaults$InputField$5$1RememberedValue = composer4.rememberedValue();
                                        if (!zChanged2) {
                                            searchBarDefaults$InputField$5$1RememberedValue = new SearchBarDefaults$InputField$5$1(z6, focusManager, null);
                                            composer4.updateRememberedValue(searchBarDefaults$InputField$5$1RememberedValue);
                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                            EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) searchBarDefaults$InputField$5$1RememberedValue, composer4, i222 & 14);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            composer5 = composer4;
                                            mutableInteractionSource5 = mutableInteractionSource3;
                                            modifier3 = modifier52;
                                            textFieldColors2 = textFieldColors32;
                                            function28 = function25;
                                            function29 = function26;
                                            function210 = function27;
                                            z7 = z92;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer5.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i10 = i9;
            if ((i2 & 6) == 0) {
            }
            i12 = i4;
            i13 = i3 & 2048;
            if (i13 != 0) {
            }
            if ((i3 & 4096) == 0) {
            }
            if ((i12 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer5.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i2 & 6) == 0) {
        }
        i12 = i4;
        i13 = i3 & 2048;
        if (i13 != 0) {
        }
        if ((i3 & 4096) == 0) {
        }
        if ((i12 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer5.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @Deprecated(message = "Search bars now take the input field as a parameter. `inputFieldColors` should be passed explicitly to the input field. This parameter will be removed in a future version of the library.", replaceWith = @ReplaceWith(expression = "colors(containerColor, dividerColor)", imports = {}))
    /* renamed from: colors-Klgx-Pg, reason: not valid java name */
    public final SearchBarColors m2850colorsKlgxPg(long j, long j2, TextFieldColors textFieldColors, Composer composer, int i, int i2) {
        int i3;
        TextFieldColors textFieldColorsM2857inputFieldColorsITpI4ow;
        ComposerKt.sourceInformationMarkerStart(composer, -1216168196, "C(colors)P(0:c#ui.graphics.Color,1:c#ui.graphics.Color)586@27706L5,587@27773L5,588@27824L18:SearchBar.android.kt#uh7d8r");
        long value = (i2 & 1) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), composer, 6) : j;
        long value2 = (i2 & 2) != 0 ? ColorSchemeKt.getValue(SearchViewTokens.INSTANCE.getDividerColor(), composer, 6) : j2;
        if ((i2 & 4) != 0) {
            i3 = i;
            textFieldColorsM2857inputFieldColorsITpI4ow = m2857inputFieldColorsITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, (i << 3) & 57344, 16383);
        } else {
            i3 = i;
            textFieldColorsM2857inputFieldColorsITpI4ow = textFieldColors;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1216168196, i3, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.android.kt:590)");
        }
        SearchBarColors searchBarColors = new SearchBarColors(value, value2, textFieldColorsM2857inputFieldColorsITpI4ow, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return searchBarColors;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: inputFieldColors--u-KgnY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m2856inputFieldColorsuKgnY(long j, long j2, long j3, TextSelectionColors textSelectionColors, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, Composer composer, int i, int i2, int i3) {
        TextSelectionColors textSelectionColors2;
        ComposerKt.sourceInformationMarkerStart(composer, 355927049, "C(inputFieldColors)P(9:c#ui.graphics.Color,3:c#ui.graphics.Color,0:c#ui.graphics.Color,8,5:c#ui.graphics.Color,10:c#ui.graphics.Color,1:c#ui.graphics.Color,6:c#ui.graphics.Color,11:c#ui.graphics.Color,4:c#ui.graphics.Color,7:c#ui.graphics.Color,2:c#ui.graphics.Color)599@28228L5,601@28323L5,604@28479L5,605@28558L7,606@28641L5,607@28724L5,609@28832L5,612@29008L5,613@29093L5,615@29203L5,618@29374L5,620@29476L5,624@29586L825:SearchBar.android.kt#uh7d8r");
        long value = (i3 & 1) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j;
        long jM4594copywmQWz5c$default = (i3 & 2) != 0 ? Color.m4594copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long value2 = (i3 & 4) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j3;
        if ((i3 & 8) != 0) {
            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localTextSelectionColors);
            ComposerKt.sourceInformationMarkerEnd(composer);
            textSelectionColors2 = (TextSelectionColors) objConsume;
        } else {
            textSelectionColors2 = textSelectionColors;
        }
        long value3 = (i3 & 16) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j4;
        long value4 = (i3 & 32) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j5;
        long jM4594copywmQWz5c$default2 = (i3 & 64) != 0 ? Color.m4594copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long value5 = (i3 & 128) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j7;
        long value6 = (i3 & 256) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j8;
        long jM4594copywmQWz5c$default3 = (i3 & 512) != 0 ? Color.m4594copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long value7 = (i3 & 1024) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j10;
        long jM4594copywmQWz5c$default4 = (i3 & 2048) != 0 ? Color.m4594copywmQWz5c$default(ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), FilledTextFieldTokens.INSTANCE.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(355927049, i, i2, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.android.kt:624)");
        }
        int i4 = i << 3;
        int i5 = (i & 14) | (i4 & LDSFile.EF_DG16_TAG) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024) | (i4 & 1879048192);
        int i6 = i2 << 6;
        int i7 = ((i >> 27) & 14) | ((i2 << 3) & LDSFile.EF_DG16_TAG) | (i6 & 896) | (i6 & 7168) | (i6 & 57344);
        long j12 = value;
        long j13 = value2;
        long j14 = value3;
        long j15 = value4;
        long j16 = jM4594copywmQWz5c$default2;
        long j17 = value6;
        long j18 = value7;
        TextFieldColors textFieldColorsM2857inputFieldColorsITpI4ow = m2857inputFieldColorsITpI4ow(j12, j12, jM4594copywmQWz5c$default, j13, textSelectionColors2, j14, j15, j16, value5, j17, jM4594copywmQWz5c$default3, j18, j18, jM4594copywmQWz5c$default4, composer, i5, i7, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return textFieldColorsM2857inputFieldColorsITpI4ow;
    }
}
