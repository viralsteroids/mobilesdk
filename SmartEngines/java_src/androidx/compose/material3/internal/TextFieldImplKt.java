package androidx.compose.material3.internal;

import androidx.autofill.HintConstants;
import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.Typography;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.CacheDrawScope;
import androidx.compose.p000ui.draw.DrawModifierKt;
import androidx.compose.p000ui.draw.DrawResult;
import androidx.compose.p000ui.geometry.Size;
import androidx.compose.p000ui.geometry.SizeKt;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ColorProducer;
import androidx.compose.p000ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p000ui.graphics.GraphicsLayerScope;
import androidx.compose.p000ui.graphics.Outline;
import androidx.compose.p000ui.graphics.OutlineKt;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.graphics.colorspace.ColorSpace;
import androidx.compose.p000ui.graphics.drawscope.DrawScope;
import androidx.compose.p000ui.layout.IntrinsicMeasurable;
import androidx.compose.p000ui.layout.LayoutIdKt;
import androidx.compose.p000ui.layout.LayoutIdParentData;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.layout.Placeable;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.semantics.SemanticsModifierKt;
import androidx.compose.p000ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p000ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p000ui.text.AnnotatedString;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.TextStyleKt;
import androidx.compose.p000ui.text.input.TransformedText;
import androidx.compose.p000ui.text.input.VisualTransformation;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.p000ui.unit.ConstraintsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jmrtd.lds.LDSFile;

/* compiled from: TextFieldImpl.kt */
@Metadata(m513d1 = {"\u0000º\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0002\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u00012\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b42\u0006\u00105\u001a\u0002062\u0013\u00107\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u00108\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u00109\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010:\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010;\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010<\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\u0015\b\u0002\u0010=\u001a\u000f\u0012\u0004\u0012\u00020.\u0018\u000103¢\u0006\u0002\b42\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020?2\b\b\u0002\u0010A\u001a\u00020?2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0011\u0010H\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b4H\u0001¢\u0006\u0002\u0010I\u001a-\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020L2\u0011\u0010M\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b4H\u0003ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a5\u0010J\u001a\u00020.2\u0006\u0010K\u001a\u00020L2\u0006\u0010P\u001a\u00020Q2\u0011\u0010M\u001a\r\u0012\u0004\u0012\u00020.03¢\u0006\u0002\b4H\u0003ø\u0001\u0000¢\u0006\u0004\bR\u0010S\u001a×\u0001\u0010T\u001a\u00020.2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020L2\u0006\u0010X\u001a\u00020L2\u0006\u0010Y\u001a\u00020L2\u0006\u0010Z\u001a\u00020?2\u0099\u0001\u0010M\u001a\u0094\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020]0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(`\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020L0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(a\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020L0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020]0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(c\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020]0\\¢\u0006\f\b^\u0012\b\b_\u0012\u0004\b\b(d\u0012\u0004\u0012\u00020.0[¢\u0006\u0002\b4H\u0083\bø\u0001\u0000¢\u0006\u0004\be\u0010f\u001aH\u0010g\u001a\b\u0012\u0004\u0012\u00020h0\\2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020?2\u0006\u0010i\u001a\u00020?2\u0006\u0010F\u001a\u00020G2\u0006\u0010j\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0004\bl\u0010m\u001a\u0012\u0010n\u001a\u00020\u00142\b\u0010o\u001a\u0004\u0018\u00010pH\u0000\u001a\u0012\u0010q\u001a\u00020\u00142\b\u0010o\u001a\u0004\u0018\u00010pH\u0000\u001a\u001c\u0010r\u001a\u00020\b*\u00020\b2\u0006\u0010A\u001a\u00020?2\u0006\u0010s\u001a\u00020\u0001H\u0000\u001a\u001c\u0010t\u001a\u00020\b*\u00020\b2\u0006\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020xH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\r\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u000e\u0010\u0005\"\u0016\u0010\u000f\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0010\u0010\u0005\"\u0016\u0010\u0011\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0012\u0010\u0005\"\u000e\u0010\u0013\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0014X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0018\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u0019\u0010\u0005\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u001c\u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b\u001d\u0010\u0005\"\u000e\u0010\u001e\u001a\u00020\u0014X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010 \u001a\u00020\u0003X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0006\u001a\u0004\b!\u0010\u0005\"\u000e\u0010\"\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010#\u001a\u00020$X\u0080\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&\"\u001a\u0010(\u001a\u0004\u0018\u00010)*\u00020*8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006y²\u0006\n\u0010z\u001a\u00020?X\u008a\u0084\u0002²\u0006\n\u0010{\u001a\u00020?X\u008a\u0084\u0002"}, m514d2 = {"ContainerId", "", "HorizontalIconPadding", "Landroidx/compose/ui/unit/Dp;", "getHorizontalIconPadding", "()F", "F", "IconDefaultSizeModifier", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "LabelId", "LeadingId", "MinFocusedLabelLineHeight", "getMinFocusedLabelLineHeight", "MinSupportingTextLineHeight", "getMinSupportingTextLineHeight", "MinTextLineHeight", "getMinTextLineHeight", "PlaceholderAnimationDelayOrDuration", "", "PlaceholderAnimationDuration", "PlaceholderId", "PrefixId", "PrefixSuffixTextPadding", "getPrefixSuffixTextPadding", "SuffixId", "SupportingId", "SupportingTopPadding", "getSupportingTopPadding", "TextFieldAnimationDuration", "TextFieldId", "TextFieldPadding", "getTextFieldPadding", "TrailingId", "ZeroConstraints", "Landroidx/compose/ui/unit/Constraints;", "getZeroConstraints", "()J", "J", "layoutId", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "CommonDecorationBox", "", "type", "Landroidx/compose/material3/internal/TextFieldType;", "value", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", AnnotatedPrivateKey.LABEL, "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "singleLine", "", "enabled", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "colors", "Landroidx/compose/material3/TextFieldColors;", "container", "(Landroidx/compose/material3/internal/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material3/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Decoration", "contentColor", "Landroidx/compose/ui/graphics/Color;", "content", "Decoration-Iv8Zu3U", "(JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "Decoration-3J-VO9M", "(JLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TextFieldTransitionScope", "inputState", "Landroidx/compose/material3/internal/InputPhase;", "focusedLabelTextStyleColor", "unfocusedLabelTextStyleColor", "labelColor", "showLabel", "Lkotlin/Function5;", "Landroidx/compose/runtime/State;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "labelProgress", "labelTextStyleColor", "labelContentColor", "placeholderOpacity", "prefixSuffixOpacity", "TextFieldTransitionScope-Jy8F4Js", "(Landroidx/compose/material3/internal/InputPhase;JJJZLkotlin/jvm/functions/Function7;Landroidx/compose/runtime/Composer;I)V", "animateBorderStrokeAsState", "Landroidx/compose/foundation/BorderStroke;", "focused", "focusedBorderThickness", "unfocusedBorderThickness", "animateBorderStrokeAsState-NuRrP5Q", "(ZZZLandroidx/compose/material3/TextFieldColors;FFLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "heightOrZero", "placeable", "Landroidx/compose/ui/layout/Placeable;", "widthOrZero", "defaultErrorSemantics", "defaultErrorMessage", "textFieldBackground", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "shape", "Landroidx/compose/ui/graphics/Shape;", "material3_release", "showPlaceholder", "showPrefixSuffix"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class TextFieldImplKt {
    public static final String ContainerId = "Container";
    private static final Modifier IconDefaultSizeModifier;
    public static final String LabelId = "Label";
    public static final String LeadingId = "Leading";
    private static final float MinFocusedLabelLineHeight;
    private static final float MinSupportingTextLineHeight;
    private static final int PlaceholderAnimationDelayOrDuration = 67;
    private static final int PlaceholderAnimationDuration = 83;
    public static final String PlaceholderId = "Hint";
    public static final String PrefixId = "Prefix";
    public static final String SuffixId = "Suffix";
    public static final String SupportingId = "Supporting";
    public static final int TextFieldAnimationDuration = 150;
    public static final String TextFieldId = "TextField";
    private static final float TextFieldPadding;
    public static final String TrailingId = "Trailing";
    private static final long ZeroConstraints = ConstraintsKt.Constraints(0, 0, 0, 0);
    private static final float HorizontalIconPadding = C1959Dp.m7055constructorimpl(12);
    private static final float SupportingTopPadding = C1959Dp.m7055constructorimpl(4);
    private static final float PrefixSuffixTextPadding = C1959Dp.m7055constructorimpl(2);
    private static final float MinTextLineHeight = C1959Dp.m7055constructorimpl(24);

    /* compiled from: TextFieldImpl.kt */
    @Metadata(m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            try {
                iArr[TextFieldType.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldType.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InputPhase.values().length];
            try {
                iArr2[InputPhase.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x079a  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x094a  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x09a4  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0a11  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0a56  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0a70  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0a72  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0a97  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0a9c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0ac5  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0acb  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0aed  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0ba9  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0c0a  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0c1f  */
    /* JADX WARN: Removed duplicated region for block: B:517:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CommonDecorationBox(final TextFieldType textFieldType, final String str, final Function2<? super Composer, ? super Integer, Unit> function2, final VisualTransformation visualTransformation, final Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, Function2<? super Composer, ? super Integer, Unit> function28, boolean z, boolean z2, boolean z3, final InteractionSource interactionSource, final PaddingValues paddingValues, final TextFieldColors textFieldColors, Function2<? super Composer, ? super Integer, Unit> function29, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function210;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Function2<? super Composer, ? super Integer, Unit> function211;
        boolean z4;
        Object objRememberedValue;
        long jM3091labelColorXeAY9LY$material3_release;
        boolean z5;
        long jM6570getColor0d7_KjU;
        long jM6570getColor0d7_KjU2;
        long j;
        int i23;
        float f;
        Float f2;
        InputPhase inputPhase;
        int i24;
        float f3;
        Transition transition;
        TwoWayConverter<Float, AnimationVector1D> twoWayConverter;
        InputPhase inputPhase2;
        int i25;
        float f4;
        Float f5;
        InputPhase inputPhase3;
        int i26;
        float f6;
        TwoWayConverter<Float, AnimationVector1D> twoWayConverter2;
        InputPhase inputPhase4;
        int i27;
        float f7;
        Float f8;
        InputPhase inputPhase5;
        int i28;
        float f9;
        final State stateCreateTransitionAnimation;
        Function2<? super Composer, ? super Integer, Unit> function212;
        Transition transition2;
        InputPhase inputPhase6;
        ColorSpace colorSpaceM4599getColorSpaceimpl;
        boolean zChanged;
        Object objRememberedValue2;
        InputPhase inputPhase7;
        TwoWayConverter twoWayConverter3;
        Color color;
        InputPhase inputPhase8;
        State state;
        Transition transition3;
        ColorSpace colorSpaceM4599getColorSpaceimpl2;
        boolean zChanged2;
        Object objRememberedValue3;
        int i29;
        Composer composer2;
        TextStyle textStyle;
        final TextStyle textStyle2;
        final float f10;
        ComposableLambda composableLambdaRememberComposableLambda;
        Object objRememberedValue4;
        final TextStyle textStyle3;
        Function2<? super Composer, ? super Integer, Unit> function213;
        ComposableLambda composableLambdaRememberComposableLambda2;
        Object objRememberedValue5;
        State state2;
        final TextStyle textStyle4;
        State state3;
        final State state4;
        Function2<? super Composer, ? super Integer, Unit> function214;
        ComposableLambda composableLambda;
        ComposableLambda composableLambdaRememberComposableLambda3;
        ComposableLambda composableLambda2;
        final Function2<? super Composer, ? super Integer, Unit> function215;
        ComposableLambda composableLambdaRememberComposableLambda4;
        ComposableLambda composableLambda3;
        ComposableLambda composableLambdaRememberComposableLambda5;
        final Function2<? super Composer, ? super Integer, Unit> function216;
        int i30;
        ComposableLambda composableLambdaRememberComposableLambda6;
        int i31;
        final Function2<? super Composer, ? super Integer, Unit> function217;
        final boolean z6;
        final Function2<? super Composer, ? super Integer, Unit> function218;
        final boolean z7;
        final Function2<? super Composer, ? super Integer, Unit> function219;
        final Function2<? super Composer, ? super Integer, Unit> function220;
        final boolean z8;
        final Function2<? super Composer, ? super Integer, Unit> function221;
        final Function2<? super Composer, ? super Integer, Unit> function222;
        final Function2<? super Composer, ? super Integer, Unit> function223;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i32;
        int i33;
        Composer composerStartRestartGroup = composer.startRestartGroup(1514469103);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CommonDecorationBox)P(15,16,4,17,7,9,8,14,10,12,13,11,3,6,5,2)98@4054L121,104@4251L25,114@4594L10,121@4911L7503:TextFieldImpl.kt#mqatfk");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(textFieldType) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(str) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changed(visualTransformation) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
                }
                i5 = i3 & 32;
                if (i5 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                    function210 = function23;
                } else {
                    function210 = function23;
                    if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function210) ? 131072 : 65536;
                    }
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function24) ? 1048576 : 524288;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else {
                    if ((i & 12582912) == 0) {
                        i8 = i7;
                        i4 |= composerStartRestartGroup.changedInstance(function25) ? 8388608 : 4194304;
                    }
                    i9 = i3 & 256;
                    if (i9 == 0) {
                        i4 |= 100663296;
                    } else {
                        if ((i & 100663296) == 0) {
                            i10 = i9;
                            i4 |= composerStartRestartGroup.changedInstance(function26) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i11 = i3 & 512;
                        if (i11 != 0) {
                            i4 |= 805306368;
                        } else {
                            if ((i & 805306368) == 0) {
                                i12 = i11;
                                i4 |= composerStartRestartGroup.changedInstance(function27) ? PKIFailureInfo.duplicateCertReq : 268435456;
                            }
                            i13 = i3 & 1024;
                            if (i13 == 0) {
                                i15 = i2 | 6;
                                i14 = i13;
                            } else if ((i2 & 6) == 0) {
                                i14 = i13;
                                i15 = i2 | (composerStartRestartGroup.changedInstance(function28) ? 4 : 2);
                            } else {
                                i14 = i13;
                                i15 = i2;
                            }
                            i16 = i3 & 2048;
                            if (i16 == 0) {
                                i15 |= 48;
                                i17 = i16;
                            } else if ((i2 & 48) == 0) {
                                i17 = i16;
                                i15 |= composerStartRestartGroup.changed(z) ? 32 : 16;
                            } else {
                                i17 = i16;
                            }
                            int i34 = i15;
                            i18 = i3 & 4096;
                            if (i18 == 0) {
                                i19 = i34 | 384;
                            } else {
                                int i35 = i34;
                                if ((i2 & 384) == 0) {
                                    i35 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                                }
                                i19 = i35;
                            }
                            i20 = i3 & 8192;
                            if (i20 == 0) {
                                i21 = i19 | 3072;
                            } else {
                                int i36 = i19;
                                if ((i2 & 3072) == 0) {
                                    i36 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                                }
                                i21 = i36;
                            }
                            if ((i3 & 16384) == 0) {
                                i21 |= 24576;
                            } else if ((i2 & 24576) == 0) {
                                i21 |= composerStartRestartGroup.changed(interactionSource) ? 16384 : 8192;
                            }
                            if ((32768 & i3) == 0) {
                                i22 = ProfileVerifier.CompilationStatus.f285xf2722a21;
                            } else {
                                if ((196608 & i2) == 0) {
                                    i22 = composerStartRestartGroup.changed(paddingValues) ? 131072 : 65536;
                                }
                                if ((65536 & i3) == 0) {
                                    i33 = (1572864 & i2) == 0 ? composerStartRestartGroup.changed(textFieldColors) ? 1048576 : 524288 : 1572864;
                                    if ((131072 & i3) != 0) {
                                        i32 = (12582912 & i2) == 0 ? composerStartRestartGroup.changedInstance(function29) ? 8388608 : 4194304 : 12582912;
                                        if ((306783379 & i4) == 306783378 && (4793491 & i21) == 4793490 && composerStartRestartGroup.getSkipping()) {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            function222 = function24;
                                            function220 = function26;
                                            function221 = function27;
                                            function218 = function28;
                                            z8 = z;
                                            z7 = z3;
                                            function217 = function29;
                                            composer2 = composerStartRestartGroup;
                                            function223 = function210;
                                            function219 = function25;
                                            z6 = z2;
                                        } else {
                                            if (i5 != 0) {
                                                function210 = null;
                                            }
                                            final Function2<? super Composer, ? super Integer, Unit> function224 = i6 == 0 ? null : function24;
                                            final Function2<? super Composer, ? super Integer, Unit> function225 = i8 == 0 ? null : function25;
                                            Function2<? super Composer, ? super Integer, Unit> function226 = i10 == 0 ? null : function26;
                                            Function2<? super Composer, ? super Integer, Unit> function227 = i12 == 0 ? null : function27;
                                            Function2<? super Composer, ? super Integer, Unit> function228 = i14 == 0 ? null : function28;
                                            boolean z9 = i17 == 0 ? false : z;
                                            boolean z10 = i18 == 0 ? true : z2;
                                            boolean z11 = i20 == 0 ? false : z3;
                                            if (ComposerKt.isTraceInProgress()) {
                                                function211 = function210;
                                            } else {
                                                function211 = function210;
                                                ComposerKt.traceEventStart(1514469103, i4, i21, "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:96)");
                                            }
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 318599163, "CC(remember):TextFieldImpl.kt#9igjgp");
                                            int i37 = i21;
                                            z4 = ((i4 & LDSFile.EF_DG16_TAG) != 32) | ((i4 & 7168) != 2048);
                                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            if (!z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = visualTransformation.filter(new AnnotatedString(str, null, null, 6, null));
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            String text = ((TransformedText) objRememberedValue).getText().getText();
                                            boolean zBooleanValue = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composerStartRestartGroup, (i37 >> 12) & 14).getValue().booleanValue();
                                            InputPhase inputPhase9 = !zBooleanValue ? InputPhase.Focused : text.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
                                            jM3091labelColorXeAY9LY$material3_release = textFieldColors.m3091labelColorXeAY9LY$material3_release(z10, z11, zBooleanValue);
                                            int i38 = i4;
                                            Typography typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                                            final TextStyle bodyLarge = typography.getBodyLarge();
                                            final TextStyle bodySmall = typography.getBodySmall();
                                            z5 = (Color.m4596equalsimpl0(bodyLarge.m6570getColor0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU()) && !Color.m4596equalsimpl0(bodySmall.m6570getColor0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU())) || (!Color.m4596equalsimpl0(bodyLarge.m6570getColor0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU()) && Color.m4596equalsimpl0(bodySmall.m6570getColor0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU()));
                                            jM6570getColor0d7_KjU = bodySmall.m6570getColor0d7_KjU();
                                            if (z5 && jM6570getColor0d7_KjU == 16) {
                                                jM6570getColor0d7_KjU = jM3091labelColorXeAY9LY$material3_release;
                                            }
                                            jM6570getColor0d7_KjU2 = bodyLarge.m6570getColor0d7_KjU();
                                            if (z5 && jM6570getColor0d7_KjU2 == 16) {
                                                jM6570getColor0d7_KjU2 = jM3091labelColorXeAY9LY$material3_release;
                                            }
                                            boolean z12 = function22 != null;
                                            final boolean z13 = z5;
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1087703202, "CC(TextFieldTransitionScope)P(2,1:c#ui.graphics.Color,5:c#ui.graphics.Color,3:c#ui.graphics.Color,4)349@14528L59,352@14632L334,364@15016L1126,394@16193L363,406@16607L318,418@17028L197,424@17231L150:TextFieldImpl.kt#mqatfk");
                                            boolean z14 = z12;
                                            Transition transitionUpdateTransition = TransitionKt.updateTransition(inputPhase9, "TextFieldInputState", composerStartRestartGroup, 48, 0);
                                            TextFieldImplKt$TextFieldTransitionScope$labelProgress$1 textFieldImplKt$TextFieldTransitionScope$labelProgress$1 = TextFieldImplKt$TextFieldTransitionScope$labelProgress$1.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                            InputPhase inputPhase10 = (InputPhase) transitionUpdateTransition.getCurrentState();
                                            composerStartRestartGroup.startReplaceGroup(-2036730335);
                                            ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                            if (ComposerKt.isTraceInProgress()) {
                                                j = jM6570getColor0d7_KjU;
                                                ComposerKt.traceEventStart(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                                            } else {
                                                j = jM6570getColor0d7_KjU;
                                            }
                                            i23 = WhenMappings.$EnumSwitchMapping$1[inputPhase10.ordinal()];
                                            if (i23 == 1) {
                                                f = 1.0f;
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                Float fValueOf = Float.valueOf(f);
                                                InputPhase inputPhase11 = (InputPhase) transitionUpdateTransition.getTargetState();
                                                composerStartRestartGroup.startReplaceGroup(-2036730335);
                                                ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    f2 = fValueOf;
                                                    inputPhase = inputPhase11;
                                                    ComposerKt.traceEventStart(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
                                                } else {
                                                    f2 = fValueOf;
                                                    inputPhase = inputPhase11;
                                                }
                                                i24 = WhenMappings.$EnumSwitchMapping$1[inputPhase.ordinal()];
                                                if (i24 == 1) {
                                                    f3 = 1.0f;
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                    composerStartRestartGroup.endReplaceGroup();
                                                    State stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, f2, Float.valueOf(f3), textFieldImplKt$TextFieldTransitionScope$labelProgress$1.invoke((TextFieldImplKt$TextFieldTransitionScope$labelProgress$1) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f285xf2722a21);
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 = TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.INSTANCE;
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                                    TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                    InputPhase inputPhase12 = (InputPhase) transitionUpdateTransition.getCurrentState();
                                                    composerStartRestartGroup.startReplaceGroup(1435837472);
                                                    ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        transition = transitionUpdateTransition;
                                                        twoWayConverter = vectorConverter2;
                                                        inputPhase2 = inputPhase12;
                                                        ComposerKt.traceEventStart(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                                                    } else {
                                                        transition = transitionUpdateTransition;
                                                        twoWayConverter = vectorConverter2;
                                                        inputPhase2 = inputPhase12;
                                                    }
                                                    i25 = WhenMappings.$EnumSwitchMapping$1[inputPhase2.ordinal()];
                                                    if (i25 == 1) {
                                                        f4 = 1.0f;
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                        composerStartRestartGroup.endReplaceGroup();
                                                        Float fValueOf2 = Float.valueOf(f4);
                                                        InputPhase inputPhase13 = (InputPhase) transition.getTargetState();
                                                        composerStartRestartGroup.startReplaceGroup(1435837472);
                                                        ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            f5 = fValueOf2;
                                                            inputPhase3 = inputPhase13;
                                                            ComposerKt.traceEventStart(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                                                        } else {
                                                            f5 = fValueOf2;
                                                            inputPhase3 = inputPhase13;
                                                        }
                                                        i26 = WhenMappings.$EnumSwitchMapping$1[inputPhase3.ordinal()];
                                                        if (i26 == 1) {
                                                            f6 = 1.0f;
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                            composerStartRestartGroup.endReplaceGroup();
                                                            final State stateCreateTransitionAnimation3 = TransitionKt.createTransitionAnimation(transition, f5, Float.valueOf(f6), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) transition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f285xf2722a21);
                                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                            TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
                                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                                            TwoWayConverter<Float, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                            InputPhase inputPhase14 = (InputPhase) transition.getCurrentState();
                                                            composerStartRestartGroup.startReplaceGroup(1128033978);
                                                            ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                twoWayConverter2 = vectorConverter3;
                                                                inputPhase4 = inputPhase14;
                                                                ComposerKt.traceEventStart(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                                                            } else {
                                                                twoWayConverter2 = vectorConverter3;
                                                                inputPhase4 = inputPhase14;
                                                            }
                                                            i27 = WhenMappings.$EnumSwitchMapping$1[inputPhase4.ordinal()];
                                                            if (i27 == 1) {
                                                                f7 = 1.0f;
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                                composerStartRestartGroup.endReplaceGroup();
                                                                Float fValueOf3 = Float.valueOf(f7);
                                                                InputPhase inputPhase15 = (InputPhase) transition.getTargetState();
                                                                composerStartRestartGroup.startReplaceGroup(1128033978);
                                                                ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    f8 = fValueOf3;
                                                                    inputPhase5 = inputPhase15;
                                                                    ComposerKt.traceEventStart(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                                                                } else {
                                                                    f8 = fValueOf3;
                                                                    inputPhase5 = inputPhase15;
                                                                }
                                                                i28 = WhenMappings.$EnumSwitchMapping$1[inputPhase5.ordinal()];
                                                                if (i28 == 1) {
                                                                    f9 = 1.0f;
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                    }
                                                                    composerStartRestartGroup.endReplaceGroup();
                                                                    stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transition, f8, Float.valueOf(f9), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) transition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter2, "PrefixSuffixOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f285xf2722a21);
                                                                    Transition transition4 = transition;
                                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                    TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
                                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                                                    InputPhase inputPhase16 = (InputPhase) transition4.getTargetState();
                                                                    composerStartRestartGroup.startReplaceGroup(-107432127);
                                                                    ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        transition2 = transition4;
                                                                        function212 = function228;
                                                                        inputPhase6 = inputPhase16;
                                                                        ComposerKt.traceEventStart(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                                                                    } else {
                                                                        function212 = function228;
                                                                        transition2 = transition4;
                                                                        inputPhase6 = inputPhase16;
                                                                    }
                                                                    long j2 = WhenMappings.$EnumSwitchMapping$1[inputPhase6.ordinal()] == 1 ? j : jM6570getColor0d7_KjU2;
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                    }
                                                                    composerStartRestartGroup.endReplaceGroup();
                                                                    colorSpaceM4599getColorSpaceimpl = Color.m4599getColorSpaceimpl(j2);
                                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                                                    zChanged = composerStartRestartGroup.changed(colorSpaceM4599getColorSpaceimpl);
                                                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                                        objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM4599getColorSpaceimpl);
                                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                                    }
                                                                    TwoWayConverter twoWayConverter4 = (TwoWayConverter) objRememberedValue2;
                                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                                    InputPhase inputPhase17 = (InputPhase) transition2.getCurrentState();
                                                                    composerStartRestartGroup.startReplaceGroup(-107432127);
                                                                    ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        inputPhase7 = inputPhase17;
                                                                        twoWayConverter3 = twoWayConverter4;
                                                                    } else {
                                                                        inputPhase7 = inputPhase17;
                                                                        twoWayConverter3 = twoWayConverter4;
                                                                        ComposerKt.traceEventStart(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                                                                    }
                                                                    long j3 = WhenMappings.$EnumSwitchMapping$1[inputPhase7.ordinal()] != 1 ? j : jM6570getColor0d7_KjU2;
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                    }
                                                                    composerStartRestartGroup.endReplaceGroup();
                                                                    Color colorM4585boximpl = Color.m4585boximpl(j3);
                                                                    InputPhase inputPhase18 = (InputPhase) transition2.getTargetState();
                                                                    composerStartRestartGroup.startReplaceGroup(-107432127);
                                                                    ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        color = colorM4585boximpl;
                                                                        inputPhase8 = inputPhase18;
                                                                    } else {
                                                                        color = colorM4585boximpl;
                                                                        inputPhase8 = inputPhase18;
                                                                        ComposerKt.traceEventStart(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                                                                    }
                                                                    long j4 = WhenMappings.$EnumSwitchMapping$1[inputPhase8.ordinal()] != 1 ? j : jM6570getColor0d7_KjU2;
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                    }
                                                                    composerStartRestartGroup.endReplaceGroup();
                                                                    State stateCreateTransitionAnimation4 = TransitionKt.createTransitionAnimation(transition2, color, Color.m4585boximpl(j4), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) transition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter3, "LabelTextStyleColor", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f285xf2722a21);
                                                                    Transition transition5 = transition2;
                                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                    TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$1 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
                                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                                                    composerStartRestartGroup.startReplaceGroup(1023351670);
                                                                    ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        state = stateCreateTransitionAnimation4;
                                                                        transition3 = transition5;
                                                                    } else {
                                                                        state = stateCreateTransitionAnimation4;
                                                                        transition3 = transition5;
                                                                        ComposerKt.traceEventStart(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                    }
                                                                    composerStartRestartGroup.endReplaceGroup();
                                                                    colorSpaceM4599getColorSpaceimpl2 = Color.m4599getColorSpaceimpl(jM3091labelColorXeAY9LY$material3_release);
                                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                                                    zChanged2 = composerStartRestartGroup.changed(colorSpaceM4599getColorSpaceimpl2);
                                                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                                                    if (!zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                                        objRememberedValue3 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM4599getColorSpaceimpl2);
                                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                                                    }
                                                                    TwoWayConverter twoWayConverter5 = (TwoWayConverter) objRememberedValue3;
                                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                                    composerStartRestartGroup.startReplaceGroup(1023351670);
                                                                    ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                    }
                                                                    composerStartRestartGroup.endReplaceGroup();
                                                                    Color colorM4585boximpl2 = Color.m4585boximpl(jM3091labelColorXeAY9LY$material3_release);
                                                                    composerStartRestartGroup.startReplaceGroup(1023351670);
                                                                    ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        i29 = 0;
                                                                    } else {
                                                                        i29 = 0;
                                                                        ComposerKt.traceEventStart(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                    }
                                                                    composerStartRestartGroup.endReplaceGroup();
                                                                    final State stateCreateTransitionAnimation5 = TransitionKt.createTransitionAnimation(transition3, colorM4585boximpl2, Color.m4585boximpl(jM3091labelColorXeAY9LY$material3_release), textFieldImplKt$TextFieldTransitionScope$labelContentColor$1.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) transition3.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) Integer.valueOf(i29)), twoWayConverter5, "LabelContentColor", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f285xf2722a21);
                                                                    composer2 = composerStartRestartGroup;
                                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                    ComposerKt.sourceInformationMarkerStart(composer2, -571896332, "CP(1,2)155@6472L107,172@7259L108:TextFieldImpl.kt#mqatfk");
                                                                    final float fFloatValue = ((Number) stateCreateTransitionAnimation2.getValue()).floatValue();
                                                                    composer2.startReplaceGroup(-156998101);
                                                                    ComposerKt.sourceInformation(composer2, "*138@5668L506");
                                                                    if (function22 != null) {
                                                                        f10 = fFloatValue;
                                                                        textStyle = bodyLarge;
                                                                        textStyle2 = bodySmall;
                                                                        composableLambdaRememberComposableLambda = null;
                                                                    } else {
                                                                        final State state5 = state;
                                                                        Function2<Composer, Integer, Unit> function229 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
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

                                                                            public final void invoke(Composer composer3, int i39) {
                                                                                ComposerKt.sourceInformation(composer3, "C147@6101L55:TextFieldImpl.kt#mqatfk");
                                                                                if ((i39 & 3) != 2 || !composer3.getSkipping()) {
                                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                                        ComposerKt.traceEventStart(-1236585568, i39, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:139)");
                                                                                    }
                                                                                    TextStyle textStyleLerp = TextStyleKt.lerp(bodyLarge, bodySmall, fFloatValue);
                                                                                    boolean z15 = z13;
                                                                                    State<Color> state6 = state5;
                                                                                    if (z15) {
                                                                                        textStyleLerp = TextStyle.m6553copyp1EtxEg$default(textStyleLerp, state6.getValue().m4605unboximpl(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                                                                                    }
                                                                                    TextFieldImplKt.m3412Decoration3JVO9M(stateCreateTransitionAnimation5.getValue().m4605unboximpl(), textStyleLerp, function22, composer3, 0);
                                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                                        ComposerKt.traceEventEnd();
                                                                                        return;
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                composer3.skipToGroupEnd();
                                                                            }
                                                                        };
                                                                        textStyle = bodyLarge;
                                                                        textStyle2 = bodySmall;
                                                                        f10 = fFloatValue;
                                                                        composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1236585568, true, function229, composer2, 54);
                                                                    }
                                                                    composer2.endReplaceGroup();
                                                                    final long jM3093placeholderColorXeAY9LY$material3_release = textFieldColors.m3093placeholderColorXeAY9LY$material3_release(z10, z11, zBooleanValue);
                                                                    ComposerKt.sourceInformationMarkerStart(composer2, -156971732, "CC(remember):TextFieldImpl.kt#9igjgp");
                                                                    objRememberedValue4 = composer2.rememberedValue();
                                                                    textStyle3 = textStyle;
                                                                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                                        objRememberedValue4 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Boolean>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$showPlaceholder$2$1
                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            {
                                                                                super(0);
                                                                            }

                                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                                            @Override // kotlin.jvm.functions.Function0
                                                                            public final Boolean invoke() {
                                                                                return Boolean.valueOf(stateCreateTransitionAnimation3.getValue().floatValue() > 0.0f);
                                                                            }
                                                                        });
                                                                        composer2.updateRememberedValue(objRememberedValue4);
                                                                    }
                                                                    State state6 = (State) objRememberedValue4;
                                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                    composer2.startReplaceGroup(-156965270);
                                                                    ComposerKt.sourceInformation(composer2, "160@6765L362");
                                                                    if (function211 == null && text.length() == 0 && CommonDecorationBox$lambda$15$lambda$7(state6)) {
                                                                        final Function2<? super Composer, ? super Integer, Unit> function230 = function211;
                                                                        Function3<Modifier, Composer, Integer, Unit> function3 = new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            /* JADX WARN: Multi-variable type inference failed */
                                                                            {
                                                                                super(3);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function3
                                                                            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer3, Integer num) {
                                                                                invoke(modifier, composer3, num.intValue());
                                                                                return Unit.INSTANCE;
                                                                            }

                                                                            public final void invoke(Modifier modifier, Composer composer3, int i39) {
                                                                                ComposerKt.sourceInformation(composer3, "C161@6826L34,161@6799L310:TextFieldImpl.kt#mqatfk");
                                                                                if ((i39 & 6) == 0) {
                                                                                    i39 |= composer3.changed(modifier) ? 4 : 2;
                                                                                }
                                                                                if ((i39 & 19) == 18 && composer3.getSkipping()) {
                                                                                    composer3.skipToGroupEnd();
                                                                                    return;
                                                                                }
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventStart(-660524084, i39, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:161)");
                                                                                }
                                                                                ComposerKt.sourceInformationMarkerStart(composer3, -1325817438, "CC(remember):TextFieldImpl.kt#9igjgp");
                                                                                boolean zChanged3 = composer3.changed(stateCreateTransitionAnimation3);
                                                                                final State<Float> state7 = stateCreateTransitionAnimation3;
                                                                                Object objRememberedValue6 = composer3.rememberedValue();
                                                                                if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                                                    objRememberedValue6 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1$1$1
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
                                                                                            graphicsLayerScope.setAlpha(state7.getValue().floatValue());
                                                                                        }
                                                                                    };
                                                                                    composer3.updateRememberedValue(objRememberedValue6);
                                                                                }
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifier, (Function1) objRememberedValue6);
                                                                                long j5 = jM3093placeholderColorXeAY9LY$material3_release;
                                                                                TextStyle textStyle5 = textStyle3;
                                                                                Function2<Composer, Integer, Unit> function231 = function230;
                                                                                ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierGraphicsLayer);
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
                                                                                ComposerKt.sourceInformationMarkerStart(composer3, -1245776707, "C162@6888L199:TextFieldImpl.kt#mqatfk");
                                                                                TextFieldImplKt.m3412Decoration3JVO9M(j5, textStyle5, function231, composer3, 0);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                                composer3.endNode();
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventEnd();
                                                                                }
                                                                            }
                                                                        };
                                                                        function213 = function230;
                                                                        textStyle3 = textStyle3;
                                                                        composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-660524084, true, function3, composer2, 54);
                                                                    } else {
                                                                        function213 = function211;
                                                                        composableLambdaRememberComposableLambda2 = null;
                                                                    }
                                                                    composer2.endReplaceGroup();
                                                                    final long jM3094prefixColorXeAY9LY$material3_release = textFieldColors.m3094prefixColorXeAY9LY$material3_release(z10, z11, zBooleanValue);
                                                                    ComposerKt.sourceInformationMarkerStart(composer2, -156946547, "CC(remember):TextFieldImpl.kt#9igjgp");
                                                                    objRememberedValue5 = composer2.rememberedValue();
                                                                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                                        objRememberedValue5 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Boolean>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$showPrefixSuffix$2$1
                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            {
                                                                                super(0);
                                                                            }

                                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                                            @Override // kotlin.jvm.functions.Function0
                                                                            public final Boolean invoke() {
                                                                                return Boolean.valueOf(stateCreateTransitionAnimation.getValue().floatValue() > 0.0f);
                                                                            }
                                                                        });
                                                                        composer2.updateRememberedValue(objRememberedValue5);
                                                                    }
                                                                    state2 = (State) objRememberedValue5;
                                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                    composer2.startReplaceGroup(-156940524);
                                                                    ComposerKt.sourceInformation(composer2, "177@7507L341");
                                                                    if (function226 == null && CommonDecorationBox$lambda$15$lambda$9(state2)) {
                                                                        textStyle4 = textStyle3;
                                                                        state4 = stateCreateTransitionAnimation;
                                                                        final Function2<? super Composer, ? super Integer, Unit> function231 = function226;
                                                                        Function2<Composer, Integer, Unit> function232 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1
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

                                                                            public final void invoke(Composer composer3, int i39) {
                                                                                ComposerKt.sourceInformation(composer3, "C178@7556L35,178@7529L301:TextFieldImpl.kt#mqatfk");
                                                                                if ((i39 & 3) == 2 && composer3.getSkipping()) {
                                                                                    composer3.skipToGroupEnd();
                                                                                    return;
                                                                                }
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventStart(274398694, i39, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:178)");
                                                                                }
                                                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                                                ComposerKt.sourceInformationMarkerStart(composer3, -1325794077, "CC(remember):TextFieldImpl.kt#9igjgp");
                                                                                boolean zChanged3 = composer3.changed(state4);
                                                                                final State<Float> state7 = state4;
                                                                                Object objRememberedValue6 = composer3.rememberedValue();
                                                                                if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                                                    objRememberedValue6 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1$1$1
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
                                                                                            graphicsLayerScope.setAlpha(state7.getValue().floatValue());
                                                                                        }
                                                                                    };
                                                                                    composer3.updateRememberedValue(objRememberedValue6);
                                                                                }
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) objRememberedValue6);
                                                                                long j5 = jM3094prefixColorXeAY9LY$material3_release;
                                                                                TextStyle textStyle5 = textStyle4;
                                                                                Function2<Composer, Integer, Unit> function233 = function231;
                                                                                ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierGraphicsLayer);
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
                                                                                ComposerKt.sourceInformationMarkerStart(composer3, -1245051865, "C179@7619L189:TextFieldImpl.kt#mqatfk");
                                                                                TextFieldImplKt.m3412Decoration3JVO9M(j5, textStyle5, function233, composer3, 0);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                                composer3.endNode();
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventEnd();
                                                                                }
                                                                            }
                                                                        };
                                                                        state3 = state2;
                                                                        function214 = function231;
                                                                        composableLambda = composableLambdaRememberComposableLambda2;
                                                                        composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(274398694, true, function232, composer2, 54);
                                                                    } else {
                                                                        textStyle4 = textStyle3;
                                                                        state3 = state2;
                                                                        state4 = stateCreateTransitionAnimation;
                                                                        function214 = function226;
                                                                        composableLambda = composableLambdaRememberComposableLambda2;
                                                                        composableLambdaRememberComposableLambda3 = null;
                                                                    }
                                                                    composer2.endReplaceGroup();
                                                                    final long jM3095suffixColorXeAY9LY$material3_release = textFieldColors.m3095suffixColorXeAY9LY$material3_release(z10, z11, zBooleanValue);
                                                                    composer2.startReplaceGroup(-156921964);
                                                                    ComposerKt.sourceInformation(composer2, "191@8087L341");
                                                                    if (function227 == null && CommonDecorationBox$lambda$15$lambda$9(state3)) {
                                                                        function215 = function227;
                                                                        composableLambda2 = composableLambdaRememberComposableLambda3;
                                                                        composableLambdaRememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(-1526229403, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1
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

                                                                            public final void invoke(Composer composer3, int i39) {
                                                                                ComposerKt.sourceInformation(composer3, "C192@8136L35,192@8109L301:TextFieldImpl.kt#mqatfk");
                                                                                if ((i39 & 3) == 2 && composer3.getSkipping()) {
                                                                                    composer3.skipToGroupEnd();
                                                                                    return;
                                                                                }
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventStart(-1526229403, i39, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:192)");
                                                                                }
                                                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                                                ComposerKt.sourceInformationMarkerStart(composer3, -1325775517, "CC(remember):TextFieldImpl.kt#9igjgp");
                                                                                boolean zChanged3 = composer3.changed(state4);
                                                                                final State<Float> state7 = state4;
                                                                                Object objRememberedValue6 = composer3.rememberedValue();
                                                                                if (zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                                                    objRememberedValue6 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1$1$1
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
                                                                                            graphicsLayerScope.setAlpha(state7.getValue().floatValue());
                                                                                        }
                                                                                    };
                                                                                    composer3.updateRememberedValue(objRememberedValue6);
                                                                                }
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) objRememberedValue6);
                                                                                long j5 = jM3095suffixColorXeAY9LY$material3_release;
                                                                                TextStyle textStyle5 = textStyle4;
                                                                                Function2<Composer, Integer, Unit> function233 = function215;
                                                                                ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                                                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierGraphicsLayer);
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
                                                                                ComposerKt.sourceInformationMarkerStart(composer3, -1244476505, "C193@8199L189:TextFieldImpl.kt#mqatfk");
                                                                                TextFieldImplKt.m3412Decoration3JVO9M(j5, textStyle5, function233, composer3, 0);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                                composer3.endNode();
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventEnd();
                                                                                }
                                                                            }
                                                                        }, composer2, 54);
                                                                    } else {
                                                                        composableLambda2 = composableLambdaRememberComposableLambda3;
                                                                        function215 = function227;
                                                                        composableLambdaRememberComposableLambda4 = null;
                                                                    }
                                                                    composer2.endReplaceGroup();
                                                                    final long jM3092leadingIconColorXeAY9LY$material3_release = textFieldColors.m3092leadingIconColorXeAY9LY$material3_release(z10, z11, zBooleanValue);
                                                                    composer2.startReplaceGroup(-156902962);
                                                                    ComposerKt.sourceInformation(composer2, "*205@8655L61");
                                                                    ComposableLambda composableLambdaRememberComposableLambda7 = function224 != null ? null : ComposableLambdaKt.rememberComposableLambda(-130107406, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
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

                                                                        public final void invoke(Composer composer3, int i39) {
                                                                            ComposerKt.sourceInformation(composer3, "C205@8657L57:TextFieldImpl.kt#mqatfk");
                                                                            if ((i39 & 3) == 2 && composer3.getSkipping()) {
                                                                                composer3.skipToGroupEnd();
                                                                                return;
                                                                            }
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventStart(-130107406, i39, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:205)");
                                                                            }
                                                                            TextFieldImplKt.m3413DecorationIv8Zu3U(jM3092leadingIconColorXeAY9LY$material3_release, function224, composer3, 0);
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventEnd();
                                                                            }
                                                                        }
                                                                    }, composer2, 54);
                                                                    composer2.endReplaceGroup();
                                                                    final long jM3098trailingIconColorXeAY9LY$material3_release = textFieldColors.m3098trailingIconColorXeAY9LY$material3_release(z10, z11, zBooleanValue);
                                                                    composer2.startReplaceGroup(-156893937);
                                                                    ComposerKt.sourceInformation(composer2, "*211@8937L62");
                                                                    if (function225 != null) {
                                                                        composableLambda3 = composableLambdaRememberComposableLambda7;
                                                                        composableLambdaRememberComposableLambda5 = null;
                                                                    } else {
                                                                        composableLambda3 = composableLambdaRememberComposableLambda7;
                                                                        composableLambdaRememberComposableLambda5 = ComposableLambdaKt.rememberComposableLambda(2079816678, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
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

                                                                            public final void invoke(Composer composer3, int i39) {
                                                                                ComposerKt.sourceInformation(composer3, "C211@8939L58:TextFieldImpl.kt#mqatfk");
                                                                                if ((i39 & 3) == 2 && composer3.getSkipping()) {
                                                                                    composer3.skipToGroupEnd();
                                                                                    return;
                                                                                }
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventStart(2079816678, i39, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:211)");
                                                                                }
                                                                                TextFieldImplKt.m3413DecorationIv8Zu3U(jM3098trailingIconColorXeAY9LY$material3_release, function225, composer3, 0);
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventEnd();
                                                                                }
                                                                            }
                                                                        }, composer2, 54);
                                                                    }
                                                                    composer2.endReplaceGroup();
                                                                    final long jM3096supportingTextColorXeAY9LY$material3_release = textFieldColors.m3096supportingTextColorXeAY9LY$material3_release(z10, z11, zBooleanValue);
                                                                    composer2.startReplaceGroup(-156884470);
                                                                    ComposerKt.sourceInformation(composer2, "*217@9228L217");
                                                                    if (function212 != null) {
                                                                        function216 = function212;
                                                                        i30 = 1;
                                                                        composableLambdaRememberComposableLambda6 = null;
                                                                    } else {
                                                                        function216 = function212;
                                                                        i30 = 1;
                                                                        composableLambdaRememberComposableLambda6 = ComposableLambdaKt.rememberComposableLambda(1263707005, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1
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

                                                                            public final void invoke(Composer composer3, int i39) {
                                                                                ComposerKt.sourceInformation(composer3, "C218@9250L177:TextFieldImpl.kt#mqatfk");
                                                                                if ((i39 & 3) != 2 || !composer3.getSkipping()) {
                                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                                        ComposerKt.traceEventStart(1263707005, i39, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:218)");
                                                                                    }
                                                                                    TextFieldImplKt.m3412Decoration3JVO9M(jM3096supportingTextColorXeAY9LY$material3_release, textStyle2, function216, composer3, 0);
                                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                                        ComposerKt.traceEventEnd();
                                                                                        return;
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                composer3.skipToGroupEnd();
                                                                            }
                                                                        }, composer2, 54);
                                                                    }
                                                                    composer2.endReplaceGroup();
                                                                    i31 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                                                    if (i31 != i30) {
                                                                        function217 = function29;
                                                                        composer2.startReplaceGroup(-568105095);
                                                                        ComposerKt.sourceInformation(composer2, "228@9583L167,234@9768L769");
                                                                        TextFieldKt.TextFieldLayout(Modifier.INSTANCE, function2, composableLambdaRememberComposableLambda, composableLambda, composableLambda3, composableLambdaRememberComposableLambda5, composableLambda2, composableLambdaRememberComposableLambda4, z9, f10, ComposableLambdaKt.rememberComposableLambda(1750327932, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
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

                                                                            public final void invoke(Composer composer3, int i39) {
                                                                                ComposerKt.sourceInformation(composer3, "C229@9605L127:TextFieldImpl.kt#mqatfk");
                                                                                if ((i39 & 3) != 2 || !composer3.getSkipping()) {
                                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                                        ComposerKt.traceEventStart(1750327932, i39, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:229)");
                                                                                    }
                                                                                    Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.ContainerId);
                                                                                    Function2<Composer, Integer, Unit> function233 = function217;
                                                                                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                                                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierLayoutId);
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
                                                                                    ComposerKt.sourceInformationMarkerStart(composer3, -1242994023, "C230@9699L11:TextFieldImpl.kt#mqatfk");
                                                                                    function233.invoke(composer3, 0);
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
                                                                        }, composer2, 54), composableLambdaRememberComposableLambda6, paddingValues, composer2, ((i38 >> 3) & LDSFile.EF_DG16_TAG) | 6 | ((i37 << 21) & 234881024), ((i37 >> 9) & 896) | 6);
                                                                        composer2.endReplaceGroup();
                                                                        Unit unit = Unit.INSTANCE;
                                                                    } else if (i31 != 2) {
                                                                        composer2.startReplaceGroup(-565271199);
                                                                        composer2.endReplaceGroup();
                                                                        Unit unit2 = Unit.INSTANCE;
                                                                        function217 = function29;
                                                                    } else {
                                                                        composer2.startReplaceGroup(-567018607);
                                                                        ComposerKt.sourceInformation(composer2, "253@10659L38,254@10766L314,275@11639L463,264@11098L1286");
                                                                        ComposerKt.sourceInformationMarkerStart(composer2, -156837817, "CC(remember):TextFieldImpl.kt#9igjgp");
                                                                        Object objRememberedValue6 = composer2.rememberedValue();
                                                                        if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                                            objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m4411boximpl(Size.INSTANCE.m4432getZeroNHjbRc()), null, 2, null);
                                                                            composer2.updateRememberedValue(objRememberedValue6);
                                                                        }
                                                                        final MutableState mutableState = (MutableState) objRememberedValue6;
                                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                        function217 = function29;
                                                                        ComposableLambda composableLambdaRememberComposableLambda8 = ComposableLambdaKt.rememberComposableLambda(157291737, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1
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

                                                                            public final void invoke(Composer composer3, int i39) {
                                                                                ComposerKt.sourceInformation(composer3, "C255@10788L274:TextFieldImpl.kt#mqatfk");
                                                                                if ((i39 & 3) != 2 || !composer3.getSkipping()) {
                                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                                        ComposerKt.traceEventStart(157291737, i39, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:255)");
                                                                                    }
                                                                                    Modifier modifierOutlineCutout = OutlinedTextFieldKt.outlineCutout(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.ContainerId), new MutablePropertyReference0Impl(mutableState) { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1.1
                                                                                        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                                                                                        public Object get() {
                                                                                            return ((MutableState) this.receiver).getValue();
                                                                                        }

                                                                                        @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                                                                                        public void set(Object obj) {
                                                                                            ((MutableState) this.receiver).setValue(obj);
                                                                                        }
                                                                                    }, paddingValues);
                                                                                    Function2<Composer, Integer, Unit> function233 = function217;
                                                                                    ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                                                                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierOutlineCutout);
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
                                                                                    ComposerKt.sourceInformationMarkerStart(composer3, -1241674663, "C260@11029L11:TextFieldImpl.kt#mqatfk");
                                                                                    function233.invoke(composer3, 0);
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
                                                                        }, composer2, 54);
                                                                        Modifier.Companion companion = Modifier.INSTANCE;
                                                                        ComposerKt.sourceInformationMarkerStart(composer2, -156806032, "CC(remember):TextFieldImpl.kt#9igjgp");
                                                                        boolean zChanged3 = composer2.changed(f10);
                                                                        Object objRememberedValue7 = composer2.rememberedValue();
                                                                        if (zChanged3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                                            objRememberedValue7 = (Function1) new Function1<Size, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$1$1
                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                {
                                                                                    super(1);
                                                                                }

                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                public /* bridge */ /* synthetic */ Unit invoke(Size size) {
                                                                                    m3418invokeuvyYCjk(size.getPackedValue());
                                                                                    return Unit.INSTANCE;
                                                                                }

                                                                                /* renamed from: invoke-uvyYCjk, reason: not valid java name */
                                                                                public final void m3418invokeuvyYCjk(long j5) {
                                                                                    float fM4423getWidthimpl = Size.m4423getWidthimpl(j5) * f10;
                                                                                    float fM4420getHeightimpl = Size.m4420getHeightimpl(j5) * f10;
                                                                                    if (Size.m4423getWidthimpl(mutableState.getValue().getPackedValue()) == fM4423getWidthimpl && Size.m4420getHeightimpl(mutableState.getValue().getPackedValue()) == fM4420getHeightimpl) {
                                                                                        return;
                                                                                    }
                                                                                    mutableState.setValue(Size.m4411boximpl(SizeKt.Size(fM4423getWidthimpl, fM4420getHeightimpl)));
                                                                                }
                                                                            };
                                                                            composer2.updateRememberedValue(objRememberedValue7);
                                                                        }
                                                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                        OutlinedTextFieldKt.OutlinedTextFieldLayout(companion, function2, composableLambda, composableLambdaRememberComposableLambda, composableLambda3, composableLambdaRememberComposableLambda5, composableLambda2, composableLambdaRememberComposableLambda4, z9, f10, (Function1) objRememberedValue7, composableLambdaRememberComposableLambda8, composableLambdaRememberComposableLambda6, paddingValues, composer2, ((i38 >> 3) & LDSFile.EF_DG16_TAG) | 6 | ((i37 << 21) & 234881024), ((i37 >> 6) & 7168) | 48);
                                                                        composer2.endReplaceGroup();
                                                                        Unit unit3 = Unit.INSTANCE;
                                                                    }
                                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                    }
                                                                    z6 = z10;
                                                                    function218 = function216;
                                                                    z7 = z11;
                                                                    function219 = function225;
                                                                    function220 = function214;
                                                                    z8 = z9;
                                                                    function221 = function215;
                                                                    function222 = function224;
                                                                    function223 = function213;
                                                                } else {
                                                                    if (i28 == 2) {
                                                                        if (z14) {
                                                                            f9 = 0.0f;
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                        }
                                                                        composerStartRestartGroup.endReplaceGroup();
                                                                        stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transition, f8, Float.valueOf(f9), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) transition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter2, "PrefixSuffixOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f285xf2722a21);
                                                                        Transition transition42 = transition;
                                                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                        TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
                                                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                                                        InputPhase inputPhase162 = (InputPhase) transition42.getTargetState();
                                                                        composerStartRestartGroup.startReplaceGroup(-107432127);
                                                                        ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                        }
                                                                        if (WhenMappings.$EnumSwitchMapping$1[inputPhase6.ordinal()] == 1) {
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                        }
                                                                        composerStartRestartGroup.endReplaceGroup();
                                                                        colorSpaceM4599getColorSpaceimpl = Color.m4599getColorSpaceimpl(j2);
                                                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                                                        zChanged = composerStartRestartGroup.changed(colorSpaceM4599getColorSpaceimpl);
                                                                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                                                        if (zChanged) {
                                                                            objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM4599getColorSpaceimpl);
                                                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                                            TwoWayConverter twoWayConverter42 = (TwoWayConverter) objRememberedValue2;
                                                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                                            InputPhase inputPhase172 = (InputPhase) transition2.getCurrentState();
                                                                            composerStartRestartGroup.startReplaceGroup(-107432127);
                                                                            ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                            }
                                                                            if (WhenMappings.$EnumSwitchMapping$1[inputPhase7.ordinal()] != 1) {
                                                                            }
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                            }
                                                                            composerStartRestartGroup.endReplaceGroup();
                                                                            Color colorM4585boximpl3 = Color.m4585boximpl(j3);
                                                                            InputPhase inputPhase182 = (InputPhase) transition2.getTargetState();
                                                                            composerStartRestartGroup.startReplaceGroup(-107432127);
                                                                            ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                            }
                                                                            if (WhenMappings.$EnumSwitchMapping$1[inputPhase8.ordinal()] != 1) {
                                                                            }
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                            }
                                                                            composerStartRestartGroup.endReplaceGroup();
                                                                            State stateCreateTransitionAnimation42 = TransitionKt.createTransitionAnimation(transition2, color, Color.m4585boximpl(j4), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) transition2.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter3, "LabelTextStyleColor", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f285xf2722a21);
                                                                            Transition transition52 = transition2;
                                                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                            TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$12 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
                                                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                                                            composerStartRestartGroup.startReplaceGroup(1023351670);
                                                                            ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                            }
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                            }
                                                                            composerStartRestartGroup.endReplaceGroup();
                                                                            colorSpaceM4599getColorSpaceimpl2 = Color.m4599getColorSpaceimpl(jM3091labelColorXeAY9LY$material3_release);
                                                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                                                            zChanged2 = composerStartRestartGroup.changed(colorSpaceM4599getColorSpaceimpl2);
                                                                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                                                            if (!zChanged2) {
                                                                                objRememberedValue3 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM4599getColorSpaceimpl2);
                                                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                                                                TwoWayConverter twoWayConverter52 = (TwoWayConverter) objRememberedValue3;
                                                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                                                composerStartRestartGroup.startReplaceGroup(1023351670);
                                                                                ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                }
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                }
                                                                                composerStartRestartGroup.endReplaceGroup();
                                                                                Color colorM4585boximpl22 = Color.m4585boximpl(jM3091labelColorXeAY9LY$material3_release);
                                                                                composerStartRestartGroup.startReplaceGroup(1023351670);
                                                                                ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                }
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                }
                                                                                composerStartRestartGroup.endReplaceGroup();
                                                                                final State<Color> stateCreateTransitionAnimation52 = TransitionKt.createTransitionAnimation(transition3, colorM4585boximpl22, Color.m4585boximpl(jM3091labelColorXeAY9LY$material3_release), textFieldImplKt$TextFieldTransitionScope$labelContentColor$12.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) transition3.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) Integer.valueOf(i29)), twoWayConverter52, "LabelContentColor", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f285xf2722a21);
                                                                                composer2 = composerStartRestartGroup;
                                                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                ComposerKt.sourceInformationMarkerStart(composer2, -571896332, "CP(1,2)155@6472L107,172@7259L108:TextFieldImpl.kt#mqatfk");
                                                                                final float fFloatValue2 = ((Number) stateCreateTransitionAnimation2.getValue()).floatValue();
                                                                                composer2.startReplaceGroup(-156998101);
                                                                                ComposerKt.sourceInformation(composer2, "*138@5668L506");
                                                                                if (function22 != null) {
                                                                                }
                                                                                composer2.endReplaceGroup();
                                                                                final long jM3093placeholderColorXeAY9LY$material3_release2 = textFieldColors.m3093placeholderColorXeAY9LY$material3_release(z10, z11, zBooleanValue);
                                                                                ComposerKt.sourceInformationMarkerStart(composer2, -156971732, "CC(remember):TextFieldImpl.kt#9igjgp");
                                                                                objRememberedValue4 = composer2.rememberedValue();
                                                                                textStyle3 = textStyle;
                                                                                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                                                }
                                                                                State state62 = (State) objRememberedValue4;
                                                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                composer2.startReplaceGroup(-156965270);
                                                                                ComposerKt.sourceInformation(composer2, "160@6765L362");
                                                                                if (function211 == null) {
                                                                                    function213 = function211;
                                                                                    composableLambdaRememberComposableLambda2 = null;
                                                                                    composer2.endReplaceGroup();
                                                                                    final long jM3094prefixColorXeAY9LY$material3_release2 = textFieldColors.m3094prefixColorXeAY9LY$material3_release(z10, z11, zBooleanValue);
                                                                                    ComposerKt.sourceInformationMarkerStart(composer2, -156946547, "CC(remember):TextFieldImpl.kt#9igjgp");
                                                                                    objRememberedValue5 = composer2.rememberedValue();
                                                                                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                                                    }
                                                                                    state2 = (State) objRememberedValue5;
                                                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                    composer2.startReplaceGroup(-156940524);
                                                                                    ComposerKt.sourceInformation(composer2, "177@7507L341");
                                                                                    if (function226 == null) {
                                                                                        textStyle4 = textStyle3;
                                                                                        state3 = state2;
                                                                                        state4 = stateCreateTransitionAnimation;
                                                                                        function214 = function226;
                                                                                        composableLambda = composableLambdaRememberComposableLambda2;
                                                                                        composableLambdaRememberComposableLambda3 = null;
                                                                                        composer2.endReplaceGroup();
                                                                                        final long jM3095suffixColorXeAY9LY$material3_release2 = textFieldColors.m3095suffixColorXeAY9LY$material3_release(z10, z11, zBooleanValue);
                                                                                        composer2.startReplaceGroup(-156921964);
                                                                                        ComposerKt.sourceInformation(composer2, "191@8087L341");
                                                                                        if (function227 == null) {
                                                                                            composableLambda2 = composableLambdaRememberComposableLambda3;
                                                                                            function215 = function227;
                                                                                            composableLambdaRememberComposableLambda4 = null;
                                                                                            composer2.endReplaceGroup();
                                                                                            final long jM3092leadingIconColorXeAY9LY$material3_release2 = textFieldColors.m3092leadingIconColorXeAY9LY$material3_release(z10, z11, zBooleanValue);
                                                                                            composer2.startReplaceGroup(-156902962);
                                                                                            ComposerKt.sourceInformation(composer2, "*205@8655L61");
                                                                                            if (function224 != null) {
                                                                                            }
                                                                                            composer2.endReplaceGroup();
                                                                                            final long jM3098trailingIconColorXeAY9LY$material3_release2 = textFieldColors.m3098trailingIconColorXeAY9LY$material3_release(z10, z11, zBooleanValue);
                                                                                            composer2.startReplaceGroup(-156893937);
                                                                                            ComposerKt.sourceInformation(composer2, "*211@8937L62");
                                                                                            if (function225 != null) {
                                                                                            }
                                                                                            composer2.endReplaceGroup();
                                                                                            final long jM3096supportingTextColorXeAY9LY$material3_release2 = textFieldColors.m3096supportingTextColorXeAY9LY$material3_release(z10, z11, zBooleanValue);
                                                                                            composer2.startReplaceGroup(-156884470);
                                                                                            ComposerKt.sourceInformation(composer2, "*217@9228L217");
                                                                                            if (function212 != null) {
                                                                                            }
                                                                                            composer2.endReplaceGroup();
                                                                                            i31 = WhenMappings.$EnumSwitchMapping$0[textFieldType.ordinal()];
                                                                                            if (i31 != i30) {
                                                                                            }
                                                                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                            }
                                                                                            z6 = z10;
                                                                                            function218 = function216;
                                                                                            z7 = z11;
                                                                                            function219 = function225;
                                                                                            function220 = function214;
                                                                                            z8 = z9;
                                                                                            function221 = function215;
                                                                                            function222 = function224;
                                                                                            function223 = function213;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (i28 != 3) {
                                                                        throw new NoWhenBranchMatchedException();
                                                                    }
                                                                    f9 = 1.0f;
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    composerStartRestartGroup.endReplaceGroup();
                                                                    stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transition, f8, Float.valueOf(f9), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) transition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter2, "PrefixSuffixOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f285xf2722a21);
                                                                    Transition transition422 = transition;
                                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                    TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
                                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                                                                    InputPhase inputPhase1622 = (InputPhase) transition422.getTargetState();
                                                                    composerStartRestartGroup.startReplaceGroup(-107432127);
                                                                    ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    if (WhenMappings.$EnumSwitchMapping$1[inputPhase6.ordinal()] == 1) {
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    composerStartRestartGroup.endReplaceGroup();
                                                                    colorSpaceM4599getColorSpaceimpl = Color.m4599getColorSpaceimpl(j2);
                                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1918408083, "CC(remember):Transition.kt#9igjgp");
                                                                    zChanged = composerStartRestartGroup.changed(colorSpaceM4599getColorSpaceimpl);
                                                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                                                    if (zChanged) {
                                                                    }
                                                                }
                                                            } else {
                                                                if (i27 == 2) {
                                                                    if (z14) {
                                                                        f7 = 0.0f;
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    composerStartRestartGroup.endReplaceGroup();
                                                                    Float fValueOf32 = Float.valueOf(f7);
                                                                    InputPhase inputPhase152 = (InputPhase) transition.getTargetState();
                                                                    composerStartRestartGroup.startReplaceGroup(1128033978);
                                                                    ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    i28 = WhenMappings.$EnumSwitchMapping$1[inputPhase5.ordinal()];
                                                                    if (i28 == 1) {
                                                                    }
                                                                } else if (i27 != 3) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                f7 = 1.0f;
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                composerStartRestartGroup.endReplaceGroup();
                                                                Float fValueOf322 = Float.valueOf(f7);
                                                                InputPhase inputPhase1522 = (InputPhase) transition.getTargetState();
                                                                composerStartRestartGroup.startReplaceGroup(1128033978);
                                                                ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                i28 = WhenMappings.$EnumSwitchMapping$1[inputPhase5.ordinal()];
                                                                if (i28 == 1) {
                                                                }
                                                            }
                                                        } else {
                                                            if (i26 == 2) {
                                                                if (z14) {
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                composerStartRestartGroup.endReplaceGroup();
                                                                final State<Float> stateCreateTransitionAnimation32 = TransitionKt.createTransitionAnimation(transition, f5, Float.valueOf(f6), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) transition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f285xf2722a21);
                                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
                                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                                                TwoWayConverter<Float, AnimationVector1D> vectorConverter32 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                                InputPhase inputPhase142 = (InputPhase) transition.getCurrentState();
                                                                composerStartRestartGroup.startReplaceGroup(1128033978);
                                                                ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                }
                                                                i27 = WhenMappings.$EnumSwitchMapping$1[inputPhase4.ordinal()];
                                                                if (i27 == 1) {
                                                                }
                                                            } else if (i26 != 3) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            f6 = 0.0f;
                                                            if (ComposerKt.isTraceInProgress()) {
                                                            }
                                                            composerStartRestartGroup.endReplaceGroup();
                                                            final State<Float> stateCreateTransitionAnimation322 = TransitionKt.createTransitionAnimation(transition, f5, Float.valueOf(f6), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) transition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), twoWayConverter, "PlaceholderOpacity", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f285xf2722a21);
                                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                            TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$122 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
                                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                                            TwoWayConverter<Float, AnimationVector1D> vectorConverter322 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                            InputPhase inputPhase1422 = (InputPhase) transition.getCurrentState();
                                                            composerStartRestartGroup.startReplaceGroup(1128033978);
                                                            ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                            if (ComposerKt.isTraceInProgress()) {
                                                            }
                                                            i27 = WhenMappings.$EnumSwitchMapping$1[inputPhase4.ordinal()];
                                                            if (i27 == 1) {
                                                            }
                                                        }
                                                    } else {
                                                        if (i25 == 2) {
                                                            if (z14) {
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                            }
                                                            composerStartRestartGroup.endReplaceGroup();
                                                            Float fValueOf22 = Float.valueOf(f4);
                                                            InputPhase inputPhase132 = (InputPhase) transition.getTargetState();
                                                            composerStartRestartGroup.startReplaceGroup(1435837472);
                                                            ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                            if (ComposerKt.isTraceInProgress()) {
                                                            }
                                                            i26 = WhenMappings.$EnumSwitchMapping$1[inputPhase3.ordinal()];
                                                            if (i26 == 1) {
                                                            }
                                                        } else if (i25 != 3) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        f4 = 0.0f;
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        composerStartRestartGroup.endReplaceGroup();
                                                        Float fValueOf222 = Float.valueOf(f4);
                                                        InputPhase inputPhase1322 = (InputPhase) transition.getTargetState();
                                                        composerStartRestartGroup.startReplaceGroup(1435837472);
                                                        ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        i26 = WhenMappings.$EnumSwitchMapping$1[inputPhase3.ordinal()];
                                                        if (i26 == 1) {
                                                        }
                                                    }
                                                } else if (i24 != 2) {
                                                    if (i24 != 3) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    f3 = 1.0f;
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    composerStartRestartGroup.endReplaceGroup();
                                                    State stateCreateTransitionAnimation22 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, f2, Float.valueOf(f3), textFieldImplKt$TextFieldTransitionScope$labelProgress$1.invoke((TextFieldImplKt$TextFieldTransitionScope$labelProgress$1) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f285xf2722a21);
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$12 = TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.INSTANCE;
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                                    TwoWayConverter<Float, AnimationVector1D> vectorConverter22 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                    InputPhase inputPhase122 = (InputPhase) transitionUpdateTransition.getCurrentState();
                                                    composerStartRestartGroup.startReplaceGroup(1435837472);
                                                    ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    i25 = WhenMappings.$EnumSwitchMapping$1[inputPhase2.ordinal()];
                                                    if (i25 == 1) {
                                                    }
                                                } else {
                                                    f3 = 0.0f;
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    composerStartRestartGroup.endReplaceGroup();
                                                    State stateCreateTransitionAnimation222 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, f2, Float.valueOf(f3), textFieldImplKt$TextFieldTransitionScope$labelProgress$1.invoke((TextFieldImplKt$TextFieldTransitionScope$labelProgress$1) transitionUpdateTransition.getSegment(), (Transition.Segment) composerStartRestartGroup, (Composer) 0), vectorConverter, "LabelProgress", composerStartRestartGroup, ProfileVerifier.CompilationStatus.f285xf2722a21);
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$122 = TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.INSTANCE;
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                                    TwoWayConverter<Float, AnimationVector1D> vectorConverter222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                    InputPhase inputPhase1222 = (InputPhase) transitionUpdateTransition.getCurrentState();
                                                    composerStartRestartGroup.startReplaceGroup(1435837472);
                                                    ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    i25 = WhenMappings.$EnumSwitchMapping$1[inputPhase2.ordinal()];
                                                    if (i25 == 1) {
                                                    }
                                                }
                                            } else if (i23 != 2) {
                                                if (i23 != 3) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                f = 1.0f;
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                Float fValueOf4 = Float.valueOf(f);
                                                InputPhase inputPhase112 = (InputPhase) transitionUpdateTransition.getTargetState();
                                                composerStartRestartGroup.startReplaceGroup(-2036730335);
                                                ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                i24 = WhenMappings.$EnumSwitchMapping$1[inputPhase.ordinal()];
                                                if (i24 == 1) {
                                                }
                                            } else {
                                                f = 0.0f;
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                composerStartRestartGroup.endReplaceGroup();
                                                Float fValueOf42 = Float.valueOf(f);
                                                InputPhase inputPhase1122 = (InputPhase) transitionUpdateTransition.getTargetState();
                                                composerStartRestartGroup.startReplaceGroup(-2036730335);
                                                ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                i24 = WhenMappings.$EnumSwitchMapping$1[inputPhase.ordinal()];
                                                if (i24 == 1) {
                                                }
                                            }
                                        }
                                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                        if (scopeUpdateScopeEndRestartGroup != null) {
                                            final Function2<? super Composer, ? super Integer, Unit> function233 = function217;
                                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt.CommonDecorationBox.4
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

                                                public final void invoke(Composer composer3, int i39) {
                                                    TextFieldImplKt.CommonDecorationBox(textFieldType, str, function2, visualTransformation, function22, function223, function222, function219, function220, function221, function218, z8, z6, z7, interactionSource, paddingValues, textFieldColors, function233, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i21 |= i32;
                                    if ((306783379 & i4) == 306783378) {
                                        if (i5 != 0) {
                                        }
                                        if (i6 == 0) {
                                        }
                                        if (i8 == 0) {
                                        }
                                        if (i10 == 0) {
                                        }
                                        if (i12 == 0) {
                                        }
                                        if (i14 == 0) {
                                        }
                                        if (i17 == 0) {
                                        }
                                        if (i18 == 0) {
                                        }
                                        if (i20 == 0) {
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 318599163, "CC(remember):TextFieldImpl.kt#9igjgp");
                                        int i372 = i21;
                                        z4 = ((i4 & LDSFile.EF_DG16_TAG) != 32) | ((i4 & 7168) != 2048);
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (!z4) {
                                            objRememberedValue = visualTransformation.filter(new AnnotatedString(str, null, null, 6, null));
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            String text2 = ((TransformedText) objRememberedValue).getText().getText();
                                            boolean zBooleanValue2 = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composerStartRestartGroup, (i372 >> 12) & 14).getValue().booleanValue();
                                            InputPhase inputPhase92 = !zBooleanValue2 ? InputPhase.Focused : text2.length() == 0 ? InputPhase.UnfocusedEmpty : InputPhase.UnfocusedNotEmpty;
                                            jM3091labelColorXeAY9LY$material3_release = textFieldColors.m3091labelColorXeAY9LY$material3_release(z10, z11, zBooleanValue2);
                                            int i382 = i4;
                                            Typography typography2 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                                            final TextStyle bodyLarge2 = typography2.getBodyLarge();
                                            final TextStyle bodySmall2 = typography2.getBodySmall();
                                            if (Color.m4596equalsimpl0(bodyLarge2.m6570getColor0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU())) {
                                                jM6570getColor0d7_KjU = bodySmall2.m6570getColor0d7_KjU();
                                                if (z5) {
                                                }
                                                jM6570getColor0d7_KjU2 = bodyLarge2.m6570getColor0d7_KjU();
                                                if (z5) {
                                                }
                                                if (function22 != null) {
                                                }
                                                final boolean z132 = z5;
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1087703202, "CC(TextFieldTransitionScope)P(2,1:c#ui.graphics.Color,5:c#ui.graphics.Color,3:c#ui.graphics.Color,4)349@14528L59,352@14632L334,364@15016L1126,394@16193L363,406@16607L318,418@17028L197,424@17231L150:TextFieldImpl.kt#mqatfk");
                                                boolean z142 = z12;
                                                Transition transitionUpdateTransition2 = TransitionKt.updateTransition(inputPhase92, "TextFieldInputState", composerStartRestartGroup, 48, 0);
                                                TextFieldImplKt$TextFieldTransitionScope$labelProgress$1 textFieldImplKt$TextFieldTransitionScope$labelProgress$12 = TextFieldImplKt$TextFieldTransitionScope$labelProgress$1.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                                TwoWayConverter<Float, AnimationVector1D> vectorConverter4 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                InputPhase inputPhase102 = (InputPhase) transitionUpdateTransition2.getCurrentState();
                                                composerStartRestartGroup.startReplaceGroup(-2036730335);
                                                ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                i23 = WhenMappings.$EnumSwitchMapping$1[inputPhase102.ordinal()];
                                                if (i23 == 1) {
                                                }
                                            } else {
                                                jM6570getColor0d7_KjU = bodySmall2.m6570getColor0d7_KjU();
                                                if (z5) {
                                                    jM6570getColor0d7_KjU = jM3091labelColorXeAY9LY$material3_release;
                                                }
                                                jM6570getColor0d7_KjU2 = bodyLarge2.m6570getColor0d7_KjU();
                                                if (z5) {
                                                    jM6570getColor0d7_KjU2 = jM3091labelColorXeAY9LY$material3_release;
                                                }
                                                if (function22 != null) {
                                                }
                                                final boolean z1322 = z5;
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1087703202, "CC(TextFieldTransitionScope)P(2,1:c#ui.graphics.Color,5:c#ui.graphics.Color,3:c#ui.graphics.Color,4)349@14528L59,352@14632L334,364@15016L1126,394@16193L363,406@16607L318,418@17028L197,424@17231L150:TextFieldImpl.kt#mqatfk");
                                                boolean z1422 = z12;
                                                Transition transitionUpdateTransition22 = TransitionKt.updateTransition(inputPhase92, "TextFieldInputState", composerStartRestartGroup, 48, 0);
                                                TextFieldImplKt$TextFieldTransitionScope$labelProgress$1 textFieldImplKt$TextFieldTransitionScope$labelProgress$122 = TextFieldImplKt$TextFieldTransitionScope$labelProgress$1.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                                                TwoWayConverter<Float, AnimationVector1D> vectorConverter42 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                                                InputPhase inputPhase1022 = (InputPhase) transitionUpdateTransition22.getCurrentState();
                                                composerStartRestartGroup.startReplaceGroup(-2036730335);
                                                ComposerKt.sourceInformation(composerStartRestartGroup, "C:TextFieldImpl.kt#mqatfk");
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                i23 = WhenMappings.$EnumSwitchMapping$1[inputPhase1022.ordinal()];
                                                if (i23 == 1) {
                                                }
                                            }
                                        }
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup != null) {
                                    }
                                }
                                i21 |= i33;
                                if ((131072 & i3) != 0) {
                                }
                                i21 |= i32;
                                if ((306783379 & i4) == 306783378) {
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                }
                            }
                            i21 |= i22;
                            if ((65536 & i3) == 0) {
                            }
                            i21 |= i33;
                            if ((131072 & i3) != 0) {
                            }
                            i21 |= i32;
                            if ((306783379 & i4) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i12 = i11;
                        i13 = i3 & 1024;
                        if (i13 == 0) {
                        }
                        i16 = i3 & 2048;
                        if (i16 == 0) {
                        }
                        int i342 = i15;
                        i18 = i3 & 4096;
                        if (i18 == 0) {
                        }
                        i20 = i3 & 8192;
                        if (i20 == 0) {
                        }
                        if ((i3 & 16384) == 0) {
                        }
                        if ((32768 & i3) == 0) {
                        }
                        i21 |= i22;
                        if ((65536 & i3) == 0) {
                        }
                        i21 |= i33;
                        if ((131072 & i3) != 0) {
                        }
                        i21 |= i32;
                        if ((306783379 & i4) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i10 = i9;
                    i11 = i3 & 512;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    i13 = i3 & 1024;
                    if (i13 == 0) {
                    }
                    i16 = i3 & 2048;
                    if (i16 == 0) {
                    }
                    int i3422 = i15;
                    i18 = i3 & 4096;
                    if (i18 == 0) {
                    }
                    i20 = i3 & 8192;
                    if (i20 == 0) {
                    }
                    if ((i3 & 16384) == 0) {
                    }
                    if ((32768 & i3) == 0) {
                    }
                    i21 |= i22;
                    if ((65536 & i3) == 0) {
                    }
                    i21 |= i33;
                    if ((131072 & i3) != 0) {
                    }
                    i21 |= i32;
                    if ((306783379 & i4) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i8 = i7;
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                i10 = i9;
                i11 = i3 & 512;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i3 & 1024;
                if (i13 == 0) {
                }
                i16 = i3 & 2048;
                if (i16 == 0) {
                }
                int i34222 = i15;
                i18 = i3 & 4096;
                if (i18 == 0) {
                }
                i20 = i3 & 8192;
                if (i20 == 0) {
                }
                if ((i3 & 16384) == 0) {
                }
                if ((32768 & i3) == 0) {
                }
                i21 |= i22;
                if ((65536 & i3) == 0) {
                }
                i21 |= i33;
                if ((131072 & i3) != 0) {
                }
                i21 |= i32;
                if ((306783379 & i4) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            i5 = i3 & 32;
            if (i5 != 0) {
            }
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i3 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i3 & 1024;
            if (i13 == 0) {
            }
            i16 = i3 & 2048;
            if (i16 == 0) {
            }
            int i342222 = i15;
            i18 = i3 & 4096;
            if (i18 == 0) {
            }
            i20 = i3 & 8192;
            if (i20 == 0) {
            }
            if ((i3 & 16384) == 0) {
            }
            if ((32768 & i3) == 0) {
            }
            i21 |= i22;
            if ((65536 & i3) == 0) {
            }
            i21 |= i33;
            if ((131072 & i3) != 0) {
            }
            i21 |= i32;
            if ((306783379 & i4) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        i5 = i3 & 32;
        if (i5 != 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i3 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i3 & 1024;
        if (i13 == 0) {
        }
        i16 = i3 & 2048;
        if (i16 == 0) {
        }
        int i3422222 = i15;
        i18 = i3 & 4096;
        if (i18 == 0) {
        }
        i20 = i3 & 8192;
        if (i20 == 0) {
        }
        if ((i3 & 16384) == 0) {
        }
        if ((32768 & i3) == 0) {
        }
        i21 |= i22;
        if ((65536 & i3) == 0) {
        }
        i21 |= i33;
        if ((131072 & i3) != 0) {
        }
        i21 |= i32;
        if ((306783379 & i4) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Decoration-3J-VO9M, reason: not valid java name */
    public static final void m3412Decoration3JVO9M(long j, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        final long j2;
        final TextStyle textStyle2;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        Composer composerStartRestartGroup = composer.startRestartGroup(1208685580);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Decoration)P(1:c#ui.graphics.Color,2)298@12599L62:TextFieldImpl.kt#mqatfk");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function22 = function2;
            textStyle2 = textStyle;
            j2 = j;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1208685580, i2, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:298)");
            }
            ProvideContentColorTextStyleKt.m3338ProvideContentColorTextStyle3JVO9M(j, textStyle, function2, composerStartRestartGroup, i2 & 1022);
            j2 = j;
            textStyle2 = textStyle;
            function22 = function2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$Decoration$1
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

                public final void invoke(Composer composer2, int i3) {
                    TextFieldImplKt.m3412Decoration3JVO9M(j2, textStyle2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Decoration-Iv8Zu3U, reason: not valid java name */
    public static final void m3413DecorationIv8Zu3U(final long j, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(660142980);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Decoration)P(1:c#ui.graphics.Color)303@12806L84:TextFieldImpl.kt#mqatfk");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(660142980, i2, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:303)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4585boximpl(j)), function2, composerStartRestartGroup, (i2 & LDSFile.EF_DG16_TAG) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt$Decoration$2
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

                public final void invoke(Composer composer2, int i3) {
                    TextFieldImplKt.m3413DecorationIv8Zu3U(j, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final Modifier defaultErrorSemantics(Modifier modifier, boolean z, final String str) {
        return z ? SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt.defaultErrorSemantics.1
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
                SemanticsPropertiesKt.error(semanticsPropertyReceiver, str);
            }
        }, 1, null) : modifier;
    }

    public static final Modifier textFieldBackground(Modifier modifier, final ColorProducer colorProducer, final Shape shape) {
        return DrawModifierKt.drawWithCache(modifier, new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.material3.internal.TextFieldImplKt.textFieldBackground.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                final Outline outlineMo1038createOutlinePq9zytI = shape.mo1038createOutlinePq9zytI(cacheDrawScope.m4244getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                final ColorProducer colorProducer2 = colorProducer;
                return cacheDrawScope.onDrawBehind(new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.internal.TextFieldImplKt.textFieldBackground.1.1
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
                        OutlineKt.m4854drawOutlinewDX37Ww$default(drawScope, outlineMo1038createOutlinePq9zytI, colorProducer2.mo2495invoke0d7_KjU(), 0.0f, null, null, 0, 60, null);
                    }
                });
            }
        });
    }

    public static final int widthOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }

    public static final int heightOrZero(Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022d  */
    /* renamed from: TextFieldTransitionScope-Jy8F4Js, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m3414TextFieldTransitionScopeJy8F4Js(InputPhase inputPhase, long j, long j2, long j3, boolean z, Function7<? super State<Float>, ? super State<Color>, ? super State<Color>, ? super State<Float>, ? super State<Float>, ? super Composer, ? super Integer, Unit> function7, Composer composer, int i) {
        float f;
        float f2;
        int i2;
        float f3;
        int i3;
        float f4;
        int i4;
        int i5;
        float f5;
        int i6;
        ColorSpace colorSpaceM4599getColorSpaceimpl;
        boolean zChanged;
        Object objRememberedValue;
        ColorSpace colorSpaceM4599getColorSpaceimpl2;
        boolean zChanged2;
        Object objRememberedValue2;
        ComposerKt.sourceInformationMarkerStart(composer, -1087703202, "CC(TextFieldTransitionScope)P(2,1:c#ui.graphics.Color,5:c#ui.graphics.Color,3:c#ui.graphics.Color,4)349@14528L59,352@14632L334,364@15016L1126,394@16193L363,406@16607L318,418@17028L197,424@17231L150:TextFieldImpl.kt#mqatfk");
        Transition transitionUpdateTransition = TransitionKt.updateTransition(inputPhase, "TextFieldInputState", composer, (i & 14) | 48, 0);
        TextFieldImplKt$TextFieldTransitionScope$labelProgress$1 textFieldImplKt$TextFieldTransitionScope$labelProgress$1 = TextFieldImplKt$TextFieldTransitionScope$labelProgress$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        InputPhase inputPhase2 = (InputPhase) transitionUpdateTransition.getCurrentState();
        composer.startReplaceGroup(-2036730335);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
        }
        int i7 = WhenMappings.$EnumSwitchMapping$1[inputPhase2.ordinal()];
        float f6 = 0.0f;
        if (i7 == 1) {
            f = 1.0f;
        } else if (i7 != 2) {
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        Float fValueOf = Float.valueOf(f);
        InputPhase inputPhase3 = (InputPhase) transitionUpdateTransition.getTargetState();
        composer.startReplaceGroup(-2036730335);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2036730335, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:356)");
        }
        int i8 = WhenMappings.$EnumSwitchMapping$1[inputPhase3.ordinal()];
        if (i8 == 1) {
            f2 = 1.0f;
        } else if (i8 != 2) {
            if (i8 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        State stateCreateTransitionAnimation = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf, Float.valueOf(f2), textFieldImplKt$TextFieldTransitionScope$labelProgress$1.invoke((TextFieldImplKt$TextFieldTransitionScope$labelProgress$1) transitionUpdateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), vectorConverter, "LabelProgress", composer, ProfileVerifier.CompilationStatus.f285xf2722a21);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 = TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        InputPhase inputPhase4 = (InputPhase) transitionUpdateTransition.getCurrentState();
        composer.startReplaceGroup(1435837472);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
        }
        int i9 = WhenMappings.$EnumSwitchMapping$1[inputPhase4.ordinal()];
        if (i9 != 1) {
            if (i9 == 2) {
                i2 = 3;
                if (z) {
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                Float fValueOf2 = Float.valueOf(f3);
                InputPhase inputPhase5 = (InputPhase) transitionUpdateTransition.getTargetState();
                composer.startReplaceGroup(1435837472);
                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1435837472, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:386)");
                }
                i3 = WhenMappings.$EnumSwitchMapping$1[inputPhase5.ordinal()];
                if (i3 == 1) {
                    f4 = 1.0f;
                } else {
                    if (i3 != 2) {
                        if (i3 != i2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z) {
                    }
                    f4 = 0.0f;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                State stateCreateTransitionAnimation2 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf2, Float.valueOf(f4), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) transitionUpdateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), vectorConverter2, "PlaceholderOpacity", composer, ProfileVerifier.CompilationStatus.f285xf2722a21);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
                TwoWayConverter<Float, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                InputPhase inputPhase6 = (InputPhase) transitionUpdateTransition.getCurrentState();
                composer.startReplaceGroup(1128033978);
                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                }
                i4 = WhenMappings.$EnumSwitchMapping$1[inputPhase6.ordinal()];
                if (i4 == 1) {
                    i5 = 3;
                } else {
                    if (i4 == 2) {
                        i5 = 3;
                        if (z) {
                            f5 = 0.0f;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer.endReplaceGroup();
                        Float fValueOf3 = Float.valueOf(f5);
                        InputPhase inputPhase7 = (InputPhase) transitionUpdateTransition.getTargetState();
                        composer.startReplaceGroup(1128033978);
                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1128033978, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:398)");
                        }
                        i6 = WhenMappings.$EnumSwitchMapping$1[inputPhase7.ordinal()];
                        if (i6 == 1) {
                            f6 = 1.0f;
                        } else {
                            if (i6 != 2) {
                                if (i6 != i5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else if (!z) {
                            }
                            f6 = 1.0f;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer.endReplaceGroup();
                        State stateCreateTransitionAnimation3 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf3, Float.valueOf(f6), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) transitionUpdateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), vectorConverter3, "PrefixSuffixOpacity", composer, ProfileVerifier.CompilationStatus.f285xf2722a21);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                        InputPhase inputPhase8 = (InputPhase) transitionUpdateTransition.getTargetState();
                        composer.startReplaceGroup(-107432127);
                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        long j4 = WhenMappings.$EnumSwitchMapping$1[inputPhase8.ordinal()] != 1 ? j : j2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer.endReplaceGroup();
                        colorSpaceM4599getColorSpaceimpl = Color.m4599getColorSpaceimpl(j4);
                        ComposerKt.sourceInformationMarkerStart(composer, 1918408083, "CC(remember):Transition.kt#9igjgp");
                        zChanged = composer.changed(colorSpaceM4599getColorSpaceimpl);
                        objRememberedValue = composer.rememberedValue();
                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM4599getColorSpaceimpl);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        TwoWayConverter twoWayConverter = (TwoWayConverter) objRememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                        InputPhase inputPhase9 = (InputPhase) transitionUpdateTransition.getCurrentState();
                        composer.startReplaceGroup(-107432127);
                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        long j5 = WhenMappings.$EnumSwitchMapping$1[inputPhase9.ordinal()] != 1 ? j : j2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer.endReplaceGroup();
                        Color colorM4585boximpl = Color.m4585boximpl(j5);
                        InputPhase inputPhase10 = (InputPhase) transitionUpdateTransition.getTargetState();
                        composer.startReplaceGroup(-107432127);
                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-107432127, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:410)");
                        }
                        long j6 = WhenMappings.$EnumSwitchMapping$1[inputPhase10.ordinal()] != 1 ? j : j2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer.endReplaceGroup();
                        State stateCreateTransitionAnimation4 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM4585boximpl, Color.m4585boximpl(j6), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) transitionUpdateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), twoWayConverter, "LabelTextStyleColor", composer, ProfileVerifier.CompilationStatus.f285xf2722a21);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$1 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                        composer.startReplaceGroup(1023351670);
                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer.endReplaceGroup();
                        colorSpaceM4599getColorSpaceimpl2 = Color.m4599getColorSpaceimpl(j3);
                        ComposerKt.sourceInformationMarkerStart(composer, 1918408083, "CC(remember):Transition.kt#9igjgp");
                        zChanged2 = composer.changed(colorSpaceM4599getColorSpaceimpl2);
                        objRememberedValue2 = composer.rememberedValue();
                        if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM4599getColorSpaceimpl2);
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        TwoWayConverter twoWayConverter2 = (TwoWayConverter) objRememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                        composer.startReplaceGroup(1023351670);
                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer.endReplaceGroup();
                        Color colorM4585boximpl2 = Color.m4585boximpl(j3);
                        composer.startReplaceGroup(1023351670);
                        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1023351670, 0, -1, "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:421)");
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer.endReplaceGroup();
                        State stateCreateTransitionAnimation5 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM4585boximpl2, Color.m4585boximpl(j3), textFieldImplKt$TextFieldTransitionScope$labelContentColor$1.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) transitionUpdateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), twoWayConverter2, "LabelContentColor", composer, ProfileVerifier.CompilationStatus.f285xf2722a21);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        function7.invoke(stateCreateTransitionAnimation, stateCreateTransitionAnimation4, stateCreateTransitionAnimation5, stateCreateTransitionAnimation2, stateCreateTransitionAnimation3, composer, Integer.valueOf(i & 458752));
                        ComposerKt.sourceInformationMarkerEnd(composer);
                    }
                    i5 = 3;
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                f5 = 1.0f;
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                Float fValueOf32 = Float.valueOf(f5);
                InputPhase inputPhase72 = (InputPhase) transitionUpdateTransition.getTargetState();
                composer.startReplaceGroup(1128033978);
                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                i6 = WhenMappings.$EnumSwitchMapping$1[inputPhase72.ordinal()];
                if (i6 == 1) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                State stateCreateTransitionAnimation32 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf32, Float.valueOf(f6), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) transitionUpdateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), vectorConverter3, "PrefixSuffixOpacity", composer, ProfileVerifier.CompilationStatus.f285xf2722a21);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                InputPhase inputPhase82 = (InputPhase) transitionUpdateTransition.getTargetState();
                composer.startReplaceGroup(-107432127);
                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                if (WhenMappings.$EnumSwitchMapping$1[inputPhase82.ordinal()] != 1) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                colorSpaceM4599getColorSpaceimpl = Color.m4599getColorSpaceimpl(j4);
                ComposerKt.sourceInformationMarkerStart(composer, 1918408083, "CC(remember):Transition.kt#9igjgp");
                zChanged = composer.changed(colorSpaceM4599getColorSpaceimpl);
                objRememberedValue = composer.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM4599getColorSpaceimpl);
                    composer.updateRememberedValue(objRememberedValue);
                }
                TwoWayConverter twoWayConverter3 = (TwoWayConverter) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                InputPhase inputPhase92 = (InputPhase) transitionUpdateTransition.getCurrentState();
                composer.startReplaceGroup(-107432127);
                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                if (WhenMappings.$EnumSwitchMapping$1[inputPhase92.ordinal()] != 1) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                Color colorM4585boximpl3 = Color.m4585boximpl(j5);
                InputPhase inputPhase102 = (InputPhase) transitionUpdateTransition.getTargetState();
                composer.startReplaceGroup(-107432127);
                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                if (WhenMappings.$EnumSwitchMapping$1[inputPhase102.ordinal()] != 1) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                State stateCreateTransitionAnimation42 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM4585boximpl3, Color.m4585boximpl(j6), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$12.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) transitionUpdateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), twoWayConverter3, "LabelTextStyleColor", composer, ProfileVerifier.CompilationStatus.f285xf2722a21);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$12 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
                composer.startReplaceGroup(1023351670);
                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                colorSpaceM4599getColorSpaceimpl2 = Color.m4599getColorSpaceimpl(j3);
                ComposerKt.sourceInformationMarkerStart(composer, 1918408083, "CC(remember):Transition.kt#9igjgp");
                zChanged2 = composer.changed(colorSpaceM4599getColorSpaceimpl2);
                objRememberedValue2 = composer.rememberedValue();
                if (!zChanged2) {
                    objRememberedValue2 = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM4599getColorSpaceimpl2);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                TwoWayConverter twoWayConverter22 = (TwoWayConverter) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
                composer.startReplaceGroup(1023351670);
                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                Color colorM4585boximpl22 = Color.m4585boximpl(j3);
                composer.startReplaceGroup(1023351670);
                ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
                if (ComposerKt.isTraceInProgress()) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composer.endReplaceGroup();
                State stateCreateTransitionAnimation52 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM4585boximpl22, Color.m4585boximpl(j3), textFieldImplKt$TextFieldTransitionScope$labelContentColor$12.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) transitionUpdateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), twoWayConverter22, "LabelContentColor", composer, ProfileVerifier.CompilationStatus.f285xf2722a21);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                function7.invoke(stateCreateTransitionAnimation, stateCreateTransitionAnimation42, stateCreateTransitionAnimation52, stateCreateTransitionAnimation2, stateCreateTransitionAnimation32, composer, Integer.valueOf(i & 458752));
                ComposerKt.sourceInformationMarkerEnd(composer);
            }
            i2 = 3;
            if (i9 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            f3 = 0.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            composer.endReplaceGroup();
            Float fValueOf22 = Float.valueOf(f3);
            InputPhase inputPhase52 = (InputPhase) transitionUpdateTransition.getTargetState();
            composer.startReplaceGroup(1435837472);
            ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
            if (ComposerKt.isTraceInProgress()) {
            }
            i3 = WhenMappings.$EnumSwitchMapping$1[inputPhase52.ordinal()];
            if (i3 == 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer.endReplaceGroup();
            State stateCreateTransitionAnimation22 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf22, Float.valueOf(f4), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) transitionUpdateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), vectorConverter2, "PlaceholderOpacity", composer, ProfileVerifier.CompilationStatus.f285xf2722a21);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter32 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
            InputPhase inputPhase62 = (InputPhase) transitionUpdateTransition.getCurrentState();
            composer.startReplaceGroup(1128033978);
            ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
            if (ComposerKt.isTraceInProgress()) {
            }
            i4 = WhenMappings.$EnumSwitchMapping$1[inputPhase62.ordinal()];
            if (i4 == 1) {
            }
            f5 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            composer.endReplaceGroup();
            Float fValueOf322 = Float.valueOf(f5);
            InputPhase inputPhase722 = (InputPhase) transitionUpdateTransition.getTargetState();
            composer.startReplaceGroup(1128033978);
            ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
            if (ComposerKt.isTraceInProgress()) {
            }
            i6 = WhenMappings.$EnumSwitchMapping$1[inputPhase722.ordinal()];
            if (i6 == 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer.endReplaceGroup();
            State stateCreateTransitionAnimation322 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf322, Float.valueOf(f6), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$12.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) transitionUpdateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), vectorConverter32, "PrefixSuffixOpacity", composer, ProfileVerifier.CompilationStatus.f285xf2722a21);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
            InputPhase inputPhase822 = (InputPhase) transitionUpdateTransition.getTargetState();
            composer.startReplaceGroup(-107432127);
            ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
            if (ComposerKt.isTraceInProgress()) {
            }
            if (WhenMappings.$EnumSwitchMapping$1[inputPhase822.ordinal()] != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer.endReplaceGroup();
            colorSpaceM4599getColorSpaceimpl = Color.m4599getColorSpaceimpl(j4);
            ComposerKt.sourceInformationMarkerStart(composer, 1918408083, "CC(remember):Transition.kt#9igjgp");
            zChanged = composer.changed(colorSpaceM4599getColorSpaceimpl);
            objRememberedValue = composer.rememberedValue();
            if (!zChanged) {
            }
            TwoWayConverter twoWayConverter32 = (TwoWayConverter) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
            InputPhase inputPhase922 = (InputPhase) transitionUpdateTransition.getCurrentState();
            composer.startReplaceGroup(-107432127);
            ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
            if (ComposerKt.isTraceInProgress()) {
            }
            if (WhenMappings.$EnumSwitchMapping$1[inputPhase922.ordinal()] != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer.endReplaceGroup();
            Color colorM4585boximpl32 = Color.m4585boximpl(j5);
            InputPhase inputPhase1022 = (InputPhase) transitionUpdateTransition.getTargetState();
            composer.startReplaceGroup(-107432127);
            ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
            if (ComposerKt.isTraceInProgress()) {
            }
            if (WhenMappings.$EnumSwitchMapping$1[inputPhase1022.ordinal()] != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer.endReplaceGroup();
            State stateCreateTransitionAnimation422 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM4585boximpl32, Color.m4585boximpl(j6), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$122.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) transitionUpdateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), twoWayConverter32, "LabelTextStyleColor", composer, ProfileVerifier.CompilationStatus.f285xf2722a21);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$122 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
            composer.startReplaceGroup(1023351670);
            ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
            if (ComposerKt.isTraceInProgress()) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer.endReplaceGroup();
            colorSpaceM4599getColorSpaceimpl2 = Color.m4599getColorSpaceimpl(j3);
            ComposerKt.sourceInformationMarkerStart(composer, 1918408083, "CC(remember):Transition.kt#9igjgp");
            zChanged2 = composer.changed(colorSpaceM4599getColorSpaceimpl2);
            objRememberedValue2 = composer.rememberedValue();
            if (!zChanged2) {
            }
            TwoWayConverter twoWayConverter222 = (TwoWayConverter) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
            composer.startReplaceGroup(1023351670);
            ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
            if (ComposerKt.isTraceInProgress()) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer.endReplaceGroup();
            Color colorM4585boximpl222 = Color.m4585boximpl(j3);
            composer.startReplaceGroup(1023351670);
            ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
            if (ComposerKt.isTraceInProgress()) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer.endReplaceGroup();
            State stateCreateTransitionAnimation522 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM4585boximpl222, Color.m4585boximpl(j3), textFieldImplKt$TextFieldTransitionScope$labelContentColor$122.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) transitionUpdateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), twoWayConverter222, "LabelContentColor", composer, ProfileVerifier.CompilationStatus.f285xf2722a21);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            function7.invoke(stateCreateTransitionAnimation, stateCreateTransitionAnimation422, stateCreateTransitionAnimation522, stateCreateTransitionAnimation22, stateCreateTransitionAnimation322, composer, Integer.valueOf(i & 458752));
            ComposerKt.sourceInformationMarkerEnd(composer);
        }
        i2 = 3;
        f3 = 1.0f;
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        Float fValueOf222 = Float.valueOf(f3);
        InputPhase inputPhase522 = (InputPhase) transitionUpdateTransition.getTargetState();
        composer.startReplaceGroup(1435837472);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        i3 = WhenMappings.$EnumSwitchMapping$1[inputPhase522.ordinal()];
        if (i3 == 1) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        State stateCreateTransitionAnimation222 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf222, Float.valueOf(f4), textFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1.invoke((TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1) transitionUpdateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), vectorConverter2, "PlaceholderOpacity", composer, ProfileVerifier.CompilationStatus.f285xf2722a21);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$122 = TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, -1338768149, "CC(animateFloat)P(2)1966@80444L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> vectorConverter322 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        InputPhase inputPhase622 = (InputPhase) transitionUpdateTransition.getCurrentState();
        composer.startReplaceGroup(1128033978);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        i4 = WhenMappings.$EnumSwitchMapping$1[inputPhase622.ordinal()];
        if (i4 == 1) {
        }
        f5 = 1.0f;
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        Float fValueOf3222 = Float.valueOf(f5);
        InputPhase inputPhase7222 = (InputPhase) transitionUpdateTransition.getTargetState();
        composer.startReplaceGroup(1128033978);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        i6 = WhenMappings.$EnumSwitchMapping$1[inputPhase7222.ordinal()];
        if (i6 == 1) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        State stateCreateTransitionAnimation3222 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, fValueOf3222, Float.valueOf(f6), textFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$122.invoke((TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1) transitionUpdateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), vectorConverter322, "PrefixSuffixOpacity", composer, ProfileVerifier.CompilationStatus.f285xf2722a21);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1222 = TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
        InputPhase inputPhase8222 = (InputPhase) transitionUpdateTransition.getTargetState();
        composer.startReplaceGroup(-107432127);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        if (WhenMappings.$EnumSwitchMapping$1[inputPhase8222.ordinal()] != 1) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        colorSpaceM4599getColorSpaceimpl = Color.m4599getColorSpaceimpl(j4);
        ComposerKt.sourceInformationMarkerStart(composer, 1918408083, "CC(remember):Transition.kt#9igjgp");
        zChanged = composer.changed(colorSpaceM4599getColorSpaceimpl);
        objRememberedValue = composer.rememberedValue();
        if (!zChanged) {
        }
        TwoWayConverter twoWayConverter322 = (TwoWayConverter) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        InputPhase inputPhase9222 = (InputPhase) transitionUpdateTransition.getCurrentState();
        composer.startReplaceGroup(-107432127);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        if (WhenMappings.$EnumSwitchMapping$1[inputPhase9222.ordinal()] != 1) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        Color colorM4585boximpl322 = Color.m4585boximpl(j5);
        InputPhase inputPhase10222 = (InputPhase) transitionUpdateTransition.getTargetState();
        composer.startReplaceGroup(-107432127);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        if (WhenMappings.$EnumSwitchMapping$1[inputPhase10222.ordinal()] != 1) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        State stateCreateTransitionAnimation4222 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM4585boximpl322, Color.m4585boximpl(j6), textFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1) transitionUpdateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), twoWayConverter322, "LabelTextStyleColor", composer, ProfileVerifier.CompilationStatus.f285xf2722a21);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 textFieldImplKt$TextFieldTransitionScope$labelContentColor$1222 = TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1.INSTANCE;
        ComposerKt.sourceInformationMarkerStart(composer, -1939694975, "CC(animateColor)P(2)68@3220L31,69@3287L70,73@3370L70:Transition.kt#xbi5r1");
        composer.startReplaceGroup(1023351670);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        colorSpaceM4599getColorSpaceimpl2 = Color.m4599getColorSpaceimpl(j3);
        ComposerKt.sourceInformationMarkerStart(composer, 1918408083, "CC(remember):Transition.kt#9igjgp");
        zChanged2 = composer.changed(colorSpaceM4599getColorSpaceimpl2);
        objRememberedValue2 = composer.rememberedValue();
        if (!zChanged2) {
        }
        TwoWayConverter twoWayConverter2222 = (TwoWayConverter) objRememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -142660079, "CC(animateValue)P(3,2)1883@77007L32,1884@77062L31,1885@77118L23,1887@77154L89:Transition.kt#pdpnli");
        composer.startReplaceGroup(1023351670);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        Color colorM4585boximpl2222 = Color.m4585boximpl(j3);
        composer.startReplaceGroup(1023351670);
        ComposerKt.sourceInformation(composer, "C:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        State stateCreateTransitionAnimation5222 = TransitionKt.createTransitionAnimation(transitionUpdateTransition, colorM4585boximpl2222, Color.m4585boximpl(j3), textFieldImplKt$TextFieldTransitionScope$labelContentColor$1222.invoke((TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1) transitionUpdateTransition.getSegment(), (Transition.Segment) composer, (Composer) 0), twoWayConverter2222, "LabelContentColor", composer, ProfileVerifier.CompilationStatus.f285xf2722a21);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        function7.invoke(stateCreateTransitionAnimation, stateCreateTransitionAnimation4222, stateCreateTransitionAnimation5222, stateCreateTransitionAnimation222, stateCreateTransitionAnimation3222, composer, Integer.valueOf(i & 458752));
        ComposerKt.sourceInformationMarkerEnd(composer);
    }

    /* renamed from: animateBorderStrokeAsState-NuRrP5Q, reason: not valid java name */
    public static final State<BorderStroke> m3417animateBorderStrokeAsStateNuRrP5Q(boolean z, boolean z2, boolean z3, TextFieldColors textFieldColors, float f, float f2, Composer composer, int i) {
        State<Color> stateRememberUpdatedState;
        State<C1959Dp> stateRememberUpdatedState2;
        Composer composer2 = composer;
        ComposerKt.sourceInformationMarkerStart(composer2, 2047013045, "C(animateBorderStrokeAsState)P(1,4,2!1,3:c#ui.unit.Dp,5:c#ui.unit.Dp)458@18252L73:TextFieldImpl.kt#mqatfk");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2047013045, i, -1, "androidx.compose.material3.internal.animateBorderStrokeAsState (TextFieldImpl.kt:441)");
        }
        long jM3090indicatorColorXeAY9LY$material3_release = textFieldColors.m3090indicatorColorXeAY9LY$material3_release(z, z2, z3);
        if (z) {
            composer2.startReplaceGroup(1023053998);
            ComposerKt.sourceInformation(composer2, "445@17754L84");
            stateRememberUpdatedState = SingleValueAnimationKt.m868animateColorAsStateeuL9pac(jM3090indicatorColorXeAY9LY$material3_release, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer2 = composer;
            composer2.endReplaceGroup();
        } else {
            composer2.startReplaceGroup(1023165505);
            ComposerKt.sourceInformation(composer2, "447@17868L33");
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m4585boximpl(jM3090indicatorColorXeAY9LY$material3_release), composer2, 0);
            composer2.endReplaceGroup();
        }
        State<Color> state = stateRememberUpdatedState;
        if (z) {
            composer2.startReplaceGroup(1023269417);
            ComposerKt.sourceInformation(composer2, "453@18068L85");
            stateRememberUpdatedState2 = AnimateAsStateKt.m882animateDpAsStateAjpBEmI(z3 ? f : f2, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer2, 48, 12);
            composer2.endReplaceGroup();
        } else {
            composer2.startReplaceGroup(1023478388);
            ComposerKt.sourceInformation(composer2, "455@18183L46");
            stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(C1959Dp.m7053boximpl(f2), composer2, (i >> 15) & 14);
            composer2.endReplaceGroup();
        }
        State<BorderStroke> stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(BorderStrokeKt.m1017BorderStrokecXLIe8U(stateRememberUpdatedState2.getValue().m7069unboximpl(), state.getValue().m4605unboximpl()), composer2, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer2);
        return stateRememberUpdatedState3;
    }

    public static final Object getLayoutId(IntrinsicMeasurable intrinsicMeasurable) {
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    static {
        float f = 16;
        TextFieldPadding = C1959Dp.m7055constructorimpl(f);
        MinFocusedLabelLineHeight = C1959Dp.m7055constructorimpl(f);
        MinSupportingTextLineHeight = C1959Dp.m7055constructorimpl(f);
        float f2 = 48;
        IconDefaultSizeModifier = androidx.compose.foundation.layout.SizeKt.m1464defaultMinSizeVpY3zN4(Modifier.INSTANCE, C1959Dp.m7055constructorimpl(f2), C1959Dp.m7055constructorimpl(f2));
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }

    public static final float getTextFieldPadding() {
        return TextFieldPadding;
    }

    public static final float getHorizontalIconPadding() {
        return HorizontalIconPadding;
    }

    public static final float getSupportingTopPadding() {
        return SupportingTopPadding;
    }

    public static final float getPrefixSuffixTextPadding() {
        return PrefixSuffixTextPadding;
    }

    public static final float getMinTextLineHeight() {
        return MinTextLineHeight;
    }

    public static final float getMinFocusedLabelLineHeight() {
        return MinFocusedLabelLineHeight;
    }

    public static final float getMinSupportingTextLineHeight() {
        return MinSupportingTextLineHeight;
    }

    public static final Modifier getIconDefaultSizeModifier() {
        return IconDefaultSizeModifier;
    }

    private static final boolean CommonDecorationBox$lambda$15$lambda$7(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean CommonDecorationBox$lambda$15$lambda$9(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
