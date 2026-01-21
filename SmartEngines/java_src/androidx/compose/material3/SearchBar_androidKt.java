package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.activity.BackEventCompat;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.ZIndexModifierKt;
import androidx.compose.p000ui.geometry.CornerRadiusKt;
import androidx.compose.p000ui.geometry.RoundRectKt;
import androidx.compose.p000ui.geometry.Size;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p000ui.graphics.GraphicsLayerScope;
import androidx.compose.p000ui.graphics.Path;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.layout.LayoutIdKt;
import androidx.compose.p000ui.layout.Measurable;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.layout.MeasureResult;
import androidx.compose.p000ui.layout.MeasureScope;
import androidx.compose.p000ui.layout.Placeable;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.p000ui.unit.Constraints;
import androidx.compose.p000ui.unit.ConstraintsKt;
import androidx.compose.p000ui.unit.Density;
import androidx.compose.p000ui.unit.IntSize;
import androidx.compose.p000ui.unit.LayoutDirection;
import androidx.compose.p000ui.util.MathHelpersKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.gms.actions.SearchIntents;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jmrtd.lds.LDSFile;

/* compiled from: SearchBar.android.kt */
@Metadata(m513d1 = {"\u0000¾\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0091\u0001\u0010,\u001a\u00020-2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020-0/¢\u0006\u0002\b02\u0006\u00101\u001a\u0002022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020-042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020\u00152\b\b\u0002\u0010<\u001a\u00020\u00152\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04¢\u0006\u0002\b0¢\u0006\u0002\b?H\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a\u0089\u0002\u0010,\u001a\u00020-2\u0006\u0010B\u001a\u00020\u001a2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020-042\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020-042\u0006\u0010E\u001a\u0002022\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020-042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u0010G\u001a\u0002022\u0015\b\u0002\u0010H\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u0010I\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u0010J\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020\u00152\b\b\u0002\u0010<\u001a\u00020\u00152\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L2\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04¢\u0006\u0002\b0¢\u0006\u0002\b?H\u0007ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a\u009b\u0001\u0010O\u001a\u00020-2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020-0/¢\u0006\u0002\b02\u0006\u00101\u001a\u0002022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020-042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020\u00152\b\b\u0002\u0010<\u001a\u00020\u00152\b\b\u0002\u0010P\u001a\u00020Q2\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04¢\u0006\u0002\b0¢\u0006\u0002\b?H\u0007ø\u0001\u0000¢\u0006\u0004\bR\u0010S\u001a\u0093\u0002\u0010O\u001a\u00020-2\u0006\u0010B\u001a\u00020\u001a2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020-042\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020-042\u0006\u0010E\u001a\u0002022\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020-042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u0010G\u001a\u0002022\u0015\b\u0002\u0010H\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u0010I\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\u0015\b\u0002\u0010J\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b02\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020\u00152\b\b\u0002\u0010<\u001a\u00020\u00152\b\b\u0002\u0010P\u001a\u00020Q2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010L2\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04¢\u0006\u0002\b0¢\u0006\u0002\b?H\u0007ø\u0001\u0000¢\u0006\u0004\bT\u0010U\u001a»\u0001\u0010V\u001a\u00020-2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020Y0X2\u0006\u0010Z\u001a\u00020[2\u000e\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0]2\u000e\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0]2\b\b\u0002\u00105\u001a\u0002062\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020-0/¢\u0006\u0002\b02\b\b\u0002\u00107\u001a\u0002082\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020\u00152\b\b\u0002\u0010<\u001a\u00020\u00152\b\b\u0002\u0010P\u001a\u00020Q2\u001c\u0010=\u001a\u0018\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020-04¢\u0006\u0002\b0¢\u0006\u0002\b?H\u0001ø\u0001\u0000¢\u0006\u0004\b`\u0010a\u001a\u0094\u0001\u0010b\u001a\u00020-2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020Y0X2\u0006\u0010Z\u001a\u00020[2\u000e\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0]2\u000e\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0]2\u0006\u00105\u001a\u0002062\u0006\u0010P\u001a\u00020Q2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020-0/¢\u0006\u0002\b02\u0011\u0010c\u001a\r\u0012\u0004\u0012\u00020-0/¢\u0006\u0002\b02\u0013\u0010=\u001a\u000f\u0012\u0004\u0012\u00020-\u0018\u00010/¢\u0006\u0002\b0H\u0003¢\u0006\u0002\u0010d\u001a\"\u0010e\u001a\u00020\u00072\b\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010f\u001a\u00020\u00072\u0006\u0010Z\u001a\u00020\u0007H\u0002\u001aD\u0010g\u001a\u00020\u00012\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020\u00012\b\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010k\u001a\u00020l2\u0006\u0010f\u001a\u00020\u00072\u0006\u0010m\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\bn\u0010o\u001aN\u0010p\u001a\u00020\u00012\u0006\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020\u00012\b\u0010_\u001a\u0004\u0018\u00010^2\b\u0010\\\u001a\u0004\u0018\u00010^2\u0006\u0010q\u001a\u00020\u00012\u0006\u0010r\u001a\u00020\u00012\u0006\u0010m\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\bs\u0010t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0014\u001a\u00020\u0015X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017\"\u000e\u0010\u0019\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u001d\u001a\u00020\u0015X\u0082\u0004¢\u0006\n\n\u0002\u0010\u0018\u0012\u0004\b\u001e\u0010\u001f\"\u0010\u0010 \u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018\"\u0010\u0010!\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018\"\u0016\u0010\"\u001a\u00020\u0015X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b#\u0010\u0017\"\u000e\u0010$\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010%\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018\"\u0010\u0010&\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018\"\u000e\u0010'\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010(\u001a\u00020\u0015X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b)\u0010\u0017\"\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006u²\u0006\n\u0010v\u001a\u000202X\u008a\u0084\u0002²\u0006\n\u0010w\u001a\u000202X\u008a\u0084\u0002"}, m514d2 = {"AnimationDelayMillis", "", "AnimationEnterDurationMillis", "AnimationEnterEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "AnimationEnterFloatSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "AnimationEnterSizeSpec", "Landroidx/compose/ui/unit/IntSize;", "AnimationExitDurationMillis", "AnimationExitEasing", "AnimationExitFloatSpec", "AnimationExitSizeSpec", "AnimationPredictiveBackExitFloatSpec", "DockedEnterTransition", "Landroidx/compose/animation/EnterTransition;", "DockedExitTransition", "Landroidx/compose/animation/ExitTransition;", "DockedExpandedTableMaxHeightScreenRatio", "DockedExpandedTableMinHeight", "Landroidx/compose/ui/unit/Dp;", "getDockedExpandedTableMinHeight", "()F", "F", "LayoutIdInputField", "", "LayoutIdSearchContent", "LayoutIdSurface", "SearchBarCornerRadius", "getSearchBarCornerRadius$annotations", "()V", "SearchBarIconOffsetX", "SearchBarMaxWidth", "SearchBarMinWidth", "getSearchBarMinWidth", "SearchBarPredictiveBackMaxOffsetXRatio", "SearchBarPredictiveBackMaxOffsetY", "SearchBarPredictiveBackMinMargin", "SearchBarPredictiveBackMinScale", "SearchBarVerticalPadding", "getSearchBarVerticalPadding", "UnspecifiedTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "DockedSearchBar", "", "inputField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "expanded", "", "onExpandedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/SearchBarColors;", "tonalElevation", "shadowElevation", "content", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "DockedSearchBar-EQC0FA8", "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", SearchIntents.EXTRA_QUERY, "onQueryChange", "onSearch", "active", "onActiveChange", "enabled", "placeholder", "leadingIcon", "trailingIcon", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "DockedSearchBar-eWTbjVg", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SearchBar", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "SearchBar-Y92LkZI", "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SearchBar-WuY5d9Q", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SearchBarImpl", "animationProgress", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "finalBackProgress", "Landroidx/compose/runtime/MutableFloatState;", "firstBackEvent", "Landroidx/compose/runtime/MutableState;", "Landroidx/activity/BackEventCompat;", "currentBackEvent", "SearchBarImpl-j1jLAyQ", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SearchBarLayout", "surface", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/runtime/MutableFloatState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "calculatePredictiveBackMultiplier", NotificationCompat.CATEGORY_PROGRESS, "calculatePredictiveBackOffsetX", "constraints", "Landroidx/compose/ui/unit/Constraints;", "minMargin", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "predictiveBackMultiplier", "calculatePredictiveBackOffsetX-rOvwMX4", "(JILandroidx/activity/BackEventCompat;Landroidx/compose/ui/unit/LayoutDirection;FF)I", "calculatePredictiveBackOffsetY", "height", "maxOffsetY", "calculatePredictiveBackOffsetY-dzo92Q0", "(JILandroidx/activity/BackEventCompat;Landroidx/activity/BackEventCompat;IIF)I", "material3_release", "useFullScreenShape", "showContent"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class SearchBar_androidKt {
    private static final int AnimationDelayMillis = 100;
    private static final int AnimationEnterDurationMillis = 600;
    private static final CubicBezierEasing AnimationEnterEasing;
    private static final FiniteAnimationSpec<Float> AnimationEnterFloatSpec;
    private static final FiniteAnimationSpec<IntSize> AnimationEnterSizeSpec;
    private static final int AnimationExitDurationMillis = 350;
    private static final CubicBezierEasing AnimationExitEasing;
    private static final FiniteAnimationSpec<Float> AnimationExitFloatSpec;
    private static final FiniteAnimationSpec<IntSize> AnimationExitSizeSpec;
    private static final FiniteAnimationSpec<Float> AnimationPredictiveBackExitFloatSpec;
    private static final EnterTransition DockedEnterTransition;
    private static final ExitTransition DockedExitTransition;
    private static final float DockedExpandedTableMaxHeightScreenRatio = 0.6666667f;
    private static final String LayoutIdInputField = "InputField";
    private static final String LayoutIdSearchContent = "Content";
    private static final String LayoutIdSurface = "Surface";
    private static final float SearchBarPredictiveBackMaxOffsetXRatio = 0.05f;
    private static final float SearchBarPredictiveBackMinMargin;
    private static final float SearchBarPredictiveBackMinScale = 0.9f;
    private static final float SearchBarVerticalPadding;
    private static final TextFieldColors UnspecifiedTextFieldColors = new TextFieldColors(Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), new TextSelectionColors(Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), null), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4631getUnspecified0d7_KjU(), null);
    private static final float SearchBarCornerRadius = C1959Dp.m7055constructorimpl(SearchBarDefaults.INSTANCE.m2853getInputFieldHeightD9Ej5fM() / 2);
    private static final float DockedExpandedTableMinHeight = C1959Dp.m7055constructorimpl(240);
    private static final float SearchBarMinWidth = C1959Dp.m7055constructorimpl(360);
    private static final float SearchBarMaxWidth = C1959Dp.m7055constructorimpl(720);
    private static final float SearchBarIconOffsetX = C1959Dp.m7055constructorimpl(4);
    private static final float SearchBarPredictiveBackMaxOffsetY = C1959Dp.m7055constructorimpl(24);

    private static /* synthetic */ void getSearchBarCornerRadius$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010c  */
    /* renamed from: SearchBar-Y92LkZI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2861SearchBarY92LkZI(final Function2<? super Composer, ? super Integer, Unit> function2, final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Function2<? super Composer, ? super Integer, Unit> function22;
        int i3;
        int i4;
        Modifier modifier2;
        Shape shape2;
        SearchBarColors searchBarColors2;
        int i5;
        float f3;
        int i6;
        float f4;
        WindowInsets windowInsets2;
        int i7;
        Shape inputFieldShape;
        int i8;
        int i9;
        SearchBarColors searchBarColorsM2851colorsdgg9oW8;
        int i10;
        WindowInsets windowInsets3;
        Modifier modifier3;
        SearchBarColors searchBarColors3;
        int i11;
        float f5;
        float f6;
        Shape shape3;
        Object objRememberedValue;
        Animatable animatable;
        Object objRememberedValue2;
        MutableFloatState mutableFloatState;
        Object objRememberedValue3;
        MutableState mutableState;
        Object objRememberedValue4;
        MutableState mutableState2;
        int i12;
        boolean zChangedInstance;
        SearchBar_androidKt$SearchBar$1$1 searchBar_androidKt$SearchBar$1$1RememberedValue;
        Modifier modifier4;
        Shape shape4;
        int i13;
        String str;
        MutableFloatState mutableFloatState2;
        Object objRememberedValue5;
        MutatorMutex mutatorMutex;
        boolean zChangedInstance2;
        SearchBar_androidKt$SearchBar$2$1 searchBar_androidKt$SearchBar$2$1RememberedValue;
        Animatable animatable2;
        Composer composer2;
        final Modifier modifier5;
        final Shape shape5;
        final SearchBarColors searchBarColors4;
        final float f7;
        final float f8;
        final WindowInsets windowInsets4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1444649673);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SearchBar)P(3,2,5,4,7!1,8:c#ui.unit.Dp,6:c#ui.unit.Dp,9)171@8255L15,172@8320L8,175@8501L12,178@8596L64,179@8689L43,180@8758L51,181@8837L51,183@8919L638,183@8894L663,199@9582L27,200@9656L1062,200@9614L1104,226@10724L458:SearchBar.android.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function22 = function2;
        } else {
            function22 = function2;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(function22) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        int i14 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                        i3 |= i14;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i14;
                } else {
                    shape2 = shape;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        searchBarColors2 = searchBarColors;
                        int i15 = composerStartRestartGroup.changed(searchBarColors2) ? 131072 : 65536;
                        i3 |= i15;
                    } else {
                        searchBarColors2 = searchBarColors;
                    }
                    i3 |= i15;
                } else {
                    searchBarColors2 = searchBarColors;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else {
                    if ((1572864 & i) == 0) {
                        f3 = f;
                        i3 |= composerStartRestartGroup.changed(f3) ? 1048576 : 524288;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                        f4 = f2;
                    } else {
                        f4 = f2;
                        if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changed(f4) ? 8388608 : 4194304;
                        }
                    }
                    if ((i & 100663296) != 0) {
                        if ((i2 & 256) == 0) {
                            windowInsets2 = windowInsets;
                            int i16 = composerStartRestartGroup.changed(windowInsets2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            i3 |= i16;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i3 |= i16;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((i2 & 512) != 0) {
                        if ((i & 805306368) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function3) ? PKIFailureInfo.duplicateCertReq : 268435456;
                        }
                        int i17 = i3;
                        if ((i3 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                                if ((i2 & 16) == 0) {
                                    int i18 = i17 & (-57345);
                                    inputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape(composerStartRestartGroup, 6);
                                    i7 = i18;
                                } else {
                                    i7 = i17;
                                    inputFieldShape = shape2;
                                }
                                if ((i2 & 32) == 0) {
                                    i8 = -234881025;
                                    i9 = 6;
                                    searchBarColorsM2851colorsdgg9oW8 = SearchBarDefaults.INSTANCE.m2851colorsdgg9oW8(0L, 0L, composerStartRestartGroup, 384, 3);
                                    i10 = i7 & (-458753);
                                } else {
                                    i8 = -234881025;
                                    i9 = 6;
                                    searchBarColorsM2851colorsdgg9oW8 = searchBarColors2;
                                    i10 = i7;
                                }
                                float fM2855getTonalElevationD9Ej5fM = i5 == 0 ? SearchBarDefaults.INSTANCE.m2855getTonalElevationD9Ej5fM() : f;
                                float fM2854getShadowElevationD9Ej5fM = i6 == 0 ? SearchBarDefaults.INSTANCE.m2854getShadowElevationD9Ej5fM() : f4;
                                if ((i2 & 256) == 0) {
                                    i10 &= i8;
                                    modifier3 = companion;
                                    windowInsets3 = SearchBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, i9);
                                } else {
                                    windowInsets3 = windowInsets;
                                    modifier3 = companion;
                                }
                                searchBarColors3 = searchBarColorsM2851colorsdgg9oW8;
                                i11 = i10;
                                f5 = fM2855getTonalElevationD9Ej5fM;
                                f6 = fM2854getShadowElevationD9Ej5fM;
                                shape3 = inputFieldShape;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i17 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i17 &= -458753;
                                }
                                if ((i2 & 256) != 0) {
                                    i17 &= -234881025;
                                }
                                windowInsets3 = windowInsets2;
                                f6 = f4;
                                i11 = i17;
                                f5 = f3;
                                searchBarColors3 = searchBarColors2;
                                shape3 = shape2;
                                modifier3 = modifier2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1444649673, i11, -1, "androidx.compose.material3.SearchBar (SearchBar.android.kt:177)");
                            }
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 626005896, "CC(remember):SearchBar.android.kt#9igjgp");
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = AnimatableKt.Animatable$default(z ? 1.0f : 0.0f, 0.0f, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            animatable = (Animatable) objRememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 626008851, "CC(remember):SearchBar.android.kt#9igjgp");
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            mutableFloatState = (MutableFloatState) objRememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 626011067, "CC(remember):SearchBar.android.kt#9igjgp");
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            mutableState = (MutableState) objRememberedValue3;
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 626013595, "CC(remember):SearchBar.android.kt#9igjgp");
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            mutableState2 = (MutableState) objRememberedValue4;
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            Boolean boolValueOf = Boolean.valueOf(z);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 626016806, "CC(remember):SearchBar.android.kt#9igjgp");
                            i12 = i11;
                            zChangedInstance = composerStartRestartGroup.changedInstance(animatable) | ((i12 & LDSFile.EF_DG16_TAG) != 32);
                            searchBar_androidKt$SearchBar$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || searchBar_androidKt$SearchBar$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                modifier4 = modifier3;
                                shape4 = shape3;
                                i13 = i12;
                                str = "CC(remember):SearchBar.android.kt#9igjgp";
                                mutableFloatState2 = mutableFloatState;
                                searchBar_androidKt$SearchBar$1$1RememberedValue = new SearchBar_androidKt$SearchBar$1$1(animatable, z, mutableFloatState2, mutableState, mutableState2, null);
                                composerStartRestartGroup.updateRememberedValue(searchBar_androidKt$SearchBar$1$1RememberedValue);
                            } else {
                                modifier4 = modifier3;
                                shape4 = shape3;
                                i13 = i12;
                                str = "CC(remember):SearchBar.android.kt#9igjgp";
                                mutableFloatState2 = mutableFloatState;
                            }
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            int i19 = (i13 >> 3) & 14;
                            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) searchBar_androidKt$SearchBar$1$1RememberedValue, composerStartRestartGroup, i19);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 626037411, str);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new MutatorMutex();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            mutatorMutex = (MutatorMutex) objRememberedValue5;
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 626040814, str);
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(animatable) | ((i13 & 896) == 256);
                            searchBar_androidKt$SearchBar$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance2 || searchBar_androidKt$SearchBar$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                animatable2 = animatable;
                                searchBar_androidKt$SearchBar$2$1RememberedValue = new SearchBar_androidKt$SearchBar$2$1(mutatorMutex, mutableFloatState2, animatable2, function1, mutableState, mutableState2, null);
                                composerStartRestartGroup.updateRememberedValue(searchBar_androidKt$SearchBar$2$1RememberedValue);
                            } else {
                                animatable2 = animatable;
                            }
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            PredictiveBackHandlerKt.PredictiveBackHandler(z, (Function2) searchBar_androidKt$SearchBar$2$1RememberedValue, composerStartRestartGroup, i19, 0);
                            int i20 = i13 << 6;
                            Modifier modifier6 = modifier4;
                            Shape shape6 = shape4;
                            SearchBarColors searchBarColors5 = searchBarColors3;
                            float f9 = f5;
                            float f10 = f6;
                            WindowInsets windowInsets5 = windowInsets3;
                            m2862SearchBarImplj1jLAyQ(animatable2, mutableFloatState2, mutableState, mutableState2, modifier6, function22, shape6, searchBarColors5, f9, f10, windowInsets5, function3, composerStartRestartGroup, Animatable.$stable | 3504 | ((i13 << 3) & 57344) | ((i13 << 15) & 458752) | (3670016 & i20) | (29360128 & i20) | (234881024 & i20) | (i20 & 1879048192), (i13 >> 24) & 126, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2 = composerStartRestartGroup;
                            modifier5 = modifier6;
                            shape5 = shape6;
                            searchBarColors4 = searchBarColors5;
                            f7 = f9;
                            f8 = f10;
                            windowInsets4 = windowInsets5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            SearchBarColors searchBarColors6 = searchBarColors2;
                            windowInsets4 = windowInsets2;
                            modifier5 = modifier2;
                            searchBarColors4 = searchBarColors6;
                            shape5 = shape2;
                            composer2 = composerStartRestartGroup;
                            f7 = f3;
                            f8 = f4;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$3
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

                                public final void invoke(Composer composer3, int i21) {
                                    SearchBar_androidKt.m2861SearchBarY92LkZI(function2, z, function1, modifier5, shape5, searchBarColors4, f7, f8, windowInsets4, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 805306368;
                    int i172 = i3;
                    if ((i3 & 306783379) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i4 == 0) {
                            }
                            if ((i2 & 16) == 0) {
                            }
                            if ((i2 & 32) == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 256) == 0) {
                            }
                            searchBarColors3 = searchBarColorsM2851colorsdgg9oW8;
                            i11 = i10;
                            f5 = fM2855getTonalElevationD9Ej5fM;
                            f6 = fM2854getShadowElevationD9Ej5fM;
                            shape3 = inputFieldShape;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 626005896, "CC(remember):SearchBar.android.kt#9igjgp");
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            animatable = (Animatable) objRememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 626008851, "CC(remember):SearchBar.android.kt#9igjgp");
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            }
                            mutableFloatState = (MutableFloatState) objRememberedValue2;
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 626011067, "CC(remember):SearchBar.android.kt#9igjgp");
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            }
                            mutableState = (MutableState) objRememberedValue3;
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 626013595, "CC(remember):SearchBar.android.kt#9igjgp");
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            }
                            mutableState2 = (MutableState) objRememberedValue4;
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            Boolean boolValueOf2 = Boolean.valueOf(z);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 626016806, "CC(remember):SearchBar.android.kt#9igjgp");
                            i12 = i11;
                            zChangedInstance = composerStartRestartGroup.changedInstance(animatable) | ((i12 & LDSFile.EF_DG16_TAG) != 32);
                            searchBar_androidKt$SearchBar$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance) {
                                modifier4 = modifier3;
                                shape4 = shape3;
                                i13 = i12;
                                str = "CC(remember):SearchBar.android.kt#9igjgp";
                                mutableFloatState2 = mutableFloatState;
                                searchBar_androidKt$SearchBar$1$1RememberedValue = new SearchBar_androidKt$SearchBar$1$1(animatable, z, mutableFloatState2, mutableState, mutableState2, null);
                                composerStartRestartGroup.updateRememberedValue(searchBar_androidKt$SearchBar$1$1RememberedValue);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                int i192 = (i13 >> 3) & 14;
                                EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) searchBar_androidKt$SearchBar$1$1RememberedValue, composerStartRestartGroup, i192);
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 626037411, str);
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                }
                                mutatorMutex = (MutatorMutex) objRememberedValue5;
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 626040814, str);
                                zChangedInstance2 = composerStartRestartGroup.changedInstance(animatable) | ((i13 & 896) == 256);
                                searchBar_androidKt$SearchBar$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance2) {
                                    animatable2 = animatable;
                                    searchBar_androidKt$SearchBar$2$1RememberedValue = new SearchBar_androidKt$SearchBar$2$1(mutatorMutex, mutableFloatState2, animatable2, function1, mutableState, mutableState2, null);
                                    composerStartRestartGroup.updateRememberedValue(searchBar_androidKt$SearchBar$2$1RememberedValue);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    PredictiveBackHandlerKt.PredictiveBackHandler(z, (Function2) searchBar_androidKt$SearchBar$2$1RememberedValue, composerStartRestartGroup, i192, 0);
                                    int i202 = i13 << 6;
                                    Modifier modifier62 = modifier4;
                                    Shape shape62 = shape4;
                                    SearchBarColors searchBarColors52 = searchBarColors3;
                                    float f92 = f5;
                                    float f102 = f6;
                                    WindowInsets windowInsets52 = windowInsets3;
                                    m2862SearchBarImplj1jLAyQ(animatable2, mutableFloatState2, mutableState, mutableState2, modifier62, function22, shape62, searchBarColors52, f92, f102, windowInsets52, function3, composerStartRestartGroup, Animatable.$stable | 3504 | ((i13 << 3) & 57344) | ((i13 << 15) & 458752) | (3670016 & i202) | (29360128 & i202) | (234881024 & i202) | (i202 & 1879048192), (i13 >> 24) & 126, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composer2 = composerStartRestartGroup;
                                    modifier5 = modifier62;
                                    shape5 = shape62;
                                    searchBarColors4 = searchBarColors52;
                                    f7 = f92;
                                    f8 = f102;
                                    windowInsets4 = windowInsets52;
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                f3 = f;
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                if ((i & 100663296) != 0) {
                }
                if ((i2 & 512) != 0) {
                }
                int i1722 = i3;
                if ((i3 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            f3 = f;
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            if ((i & 100663296) != 0) {
            }
            if ((i2 & 512) != 0) {
            }
            int i17222 = i3;
            if ((i3 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        f3 = f;
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        if ((i & 100663296) != 0) {
        }
        if ((i2 & 512) != 0) {
        }
        int i172222 = i3;
        if ((i3 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0110  */
    /* renamed from: DockedSearchBar-EQC0FA8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2858DockedSearchBarEQC0FA8(final Function2<? super Composer, ? super Integer, Unit> function2, final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Shape shape2;
        SearchBarColors searchBarColors2;
        int i4;
        float f3;
        int i5;
        float f4;
        int i6;
        Shape dockedShape;
        int i7;
        Composer composer2;
        int i8;
        SearchBarColors searchBarColorsM2851colorsdgg9oW8;
        Shape shape3;
        float f5;
        float fM2854getShadowElevationD9Ej5fM;
        final SearchBarColors searchBarColors3;
        Composer composer3;
        boolean z2;
        Object objRememberedValue;
        final SearchBarColors searchBarColors4;
        final Modifier modifier3;
        final Shape shape4;
        final float f6;
        final float f7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1209217899);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DockedSearchBar)P(3,2,5,4,7!1,8:c#ui.unit.Dp,6:c#ui.unit.Dp)287@13410L11,288@13471L8,296@13752L38,300@13946L831,293@13658L1119,325@14815L27,325@14783L59:SearchBar.android.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    shape2 = shape;
                    int i10 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                    i3 |= i10;
                } else {
                    shape2 = shape;
                }
                i3 |= i10;
            } else {
                shape2 = shape;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    searchBarColors2 = searchBarColors;
                    int i11 = composerStartRestartGroup.changed(searchBarColors2) ? 131072 : 65536;
                    i3 |= i11;
                } else {
                    searchBarColors2 = searchBarColors;
                }
                i3 |= i11;
            } else {
                searchBarColors2 = searchBarColors;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    f3 = f;
                    i3 |= composerStartRestartGroup.changed(f3) ? 1048576 : 524288;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                    f4 = f2;
                } else {
                    f4 = f2;
                    if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(f4) ? 8388608 : 4194304;
                    }
                }
                if ((i2 & 256) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i6 = i3;
                if ((38347923 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 16) == 0) {
                            dockedShape = SearchBarDefaults.INSTANCE.getDockedShape(composerStartRestartGroup, 6);
                            i7 = i6 & (-57345);
                        } else {
                            dockedShape = shape2;
                            i7 = i6;
                        }
                        if ((i2 & 32) == 0) {
                            i8 = i5;
                            searchBarColorsM2851colorsdgg9oW8 = SearchBarDefaults.INSTANCE.m2851colorsdgg9oW8(0L, 0L, composerStartRestartGroup, 384, 3);
                            composer2 = composerStartRestartGroup;
                            i6 = (-458753) & i7;
                        } else {
                            composer2 = composerStartRestartGroup;
                            i8 = i5;
                            i6 = i7;
                            searchBarColorsM2851colorsdgg9oW8 = searchBarColors2;
                        }
                        float fM2855getTonalElevationD9Ej5fM = i4 == 0 ? SearchBarDefaults.INSTANCE.m2855getTonalElevationD9Ej5fM() : f;
                        if (i8 == 0) {
                            shape3 = dockedShape;
                            fM2854getShadowElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m2854getShadowElevationD9Ej5fM();
                            f5 = fM2855getTonalElevationD9Ej5fM;
                        } else {
                            shape3 = dockedShape;
                            f5 = fM2855getTonalElevationD9Ej5fM;
                            fM2854getShadowElevationD9Ej5fM = f4;
                        }
                        searchBarColors3 = searchBarColorsM2851colorsdgg9oW8;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i6 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i6 &= -458753;
                        }
                        fM2854getShadowElevationD9Ej5fM = f4;
                        searchBarColors3 = searchBarColors2;
                        f5 = f3;
                        composer2 = composerStartRestartGroup;
                        shape3 = shape2;
                    }
                    int i12 = i6;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1209217899, i12, -1, "androidx.compose.material3.DockedSearchBar (SearchBar.android.kt:292)");
                    }
                    int i13 = i12 >> 6;
                    Composer composer4 = composer2;
                    SurfaceKt.m2978SurfaceT9BRK9s(SizeKt.m1485width3ABfNKs(ZIndexModifierKt.zIndex(modifier2, 1.0f), SearchBarMinWidth), shape3, searchBarColors3.m2847getContainerColor0d7_KjU(), ColorSchemeKt.m2364contentColorForek8zF_U(searchBarColors3.m2847getContainerColor0d7_KjU(), composer2, 0), f5, fM2854getShadowElevationD9Ej5fM, null, ComposableLambdaKt.rememberComposableLambda(878471280, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer5, int i14) {
                            ComposerKt.sourceInformation(composer5, "C301@13956L815:SearchBar.android.kt#uh7d8r");
                            if ((i14 & 3) != 2 || !composer5.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(878471280, i14, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.android.kt:301)");
                                }
                                Function2<Composer, Integer, Unit> function22 = function2;
                                boolean z3 = z;
                                final SearchBarColors searchBarColors5 = searchBarColors3;
                                final Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                ComposerKt.sourceInformationMarkerStart(composer5, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer5, companion);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer5.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer5.startReusableNode();
                                if (composer5.getInserting()) {
                                    composer5.createNode(constructor);
                                } else {
                                    composer5.useNode();
                                }
                                Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composer5);
                                Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer5, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer5, 1812191551, "C302@13977L12,308@14165L596,304@14003L758:SearchBar.android.kt#uh7d8r");
                                function22.invoke(composer5, 0);
                                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z3, (Modifier) null, SearchBar_androidKt.DockedEnterTransition, SearchBar_androidKt.DockedExitTransition, (String) null, ComposableLambdaKt.rememberComposableLambda(-1743690306, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer6, Integer num) {
                                        invoke(animatedVisibilityScope, composer6, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer6, int i15) {
                                        ComposerKt.sourceInformation(composer6, "C*309@14221L7,311@14299L125,315@14477L76,317@14571L176:SearchBar.android.kt#uh7d8r");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1743690306, i15, -1, "androidx.compose.material3.DockedSearchBar.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:309)");
                                        }
                                        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                                        ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object objConsume = composer6.consume(localConfiguration);
                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                        float fM7055constructorimpl = C1959Dp.m7055constructorimpl(((Configuration) objConsume).screenHeightDp);
                                        ComposerKt.sourceInformationMarkerStart(composer6, 1708554480, "CC(remember):SearchBar.android.kt#9igjgp");
                                        boolean zChanged = composer6.changed(fM7055constructorimpl);
                                        Object objRememberedValue2 = composer6.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = C1959Dp.m7053boximpl(C1959Dp.m7055constructorimpl(fM7055constructorimpl * 0.6666667f));
                                            composer6.updateRememberedValue(objRememberedValue2);
                                        }
                                        float fM7069unboximpl = ((C1959Dp) objRememberedValue2).m7069unboximpl();
                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                        ComposerKt.sourceInformationMarkerStart(composer6, 1708560127, "CC(remember):SearchBar.android.kt#9igjgp");
                                        boolean zChanged2 = composer6.changed(fM7069unboximpl);
                                        Object objRememberedValue3 = composer6.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = C1959Dp.m7053boximpl(((C1959Dp) RangesKt.coerceAtMost(C1959Dp.m7053boximpl(SearchBar_androidKt.getDockedExpandedTableMinHeight()), C1959Dp.m7053boximpl(fM7069unboximpl))).m7069unboximpl());
                                            composer6.updateRememberedValue(objRememberedValue3);
                                        }
                                        float fM7069unboximpl2 = ((C1959Dp) objRememberedValue3).m7069unboximpl();
                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                        Modifier modifierM1467heightInVpY3zN4 = SizeKt.m1467heightInVpY3zN4(Modifier.INSTANCE, fM7069unboximpl2, fM7069unboximpl);
                                        SearchBarColors searchBarColors6 = searchBarColors5;
                                        Function3<ColumnScope, Composer, Integer, Unit> function33 = function32;
                                        ComposerKt.sourceInformationMarkerStart(composer6, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                        ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer6.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer6, modifierM1467heightInVpY3zN4);
                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer6, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer6.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer6.startReusableNode();
                                        if (composer6.getInserting()) {
                                            composer6.createNode(constructor2);
                                        } else {
                                            composer6.useNode();
                                        }
                                        Composer composerM4088constructorimpl2 = Updater.m4088constructorimpl(composer6);
                                        Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer6, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer6, 697724229, "C318@14653L46,319@14720L9:SearchBar.android.kt#uh7d8r");
                                        DividerKt.m2507HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors6.m2848getDividerColor0d7_KjU(), composer6, 0, 3);
                                        function33.invoke(columnScopeInstance2, composer6, 6);
                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                        composer6.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer5, 54), composer5, 1600518, 18);
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                composer5.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer5.skipToGroupEnd();
                        }
                    }, composer2, 54), composer4, ((i12 >> 9) & LDSFile.EF_DG16_TAG) | 12582912 | (i13 & 57344) | (i13 & 458752), 64);
                    composer3 = composer4;
                    ComposerKt.sourceInformationMarkerStart(composer3, -994322031, "CC(remember):SearchBar.android.kt#9igjgp");
                    z2 = (i12 & 896) == 256;
                    objRememberedValue = composer3.rememberedValue();
                    if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                function1.invoke(false);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composer3, (i12 >> 3) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    searchBarColors4 = searchBarColors3;
                    modifier3 = modifier2;
                    shape4 = shape3;
                    f6 = f5;
                    f7 = fM2854getShadowElevationD9Ej5fM;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    float f8 = f3;
                    composer3 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    f7 = f4;
                    f6 = f8;
                    shape4 = shape2;
                    searchBarColors4 = searchBarColors2;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer5, int i14) {
                            SearchBar_androidKt.m2858DockedSearchBarEQC0FA8(function2, z, function1, modifier3, shape4, searchBarColors4, f6, f7, function3, composer5, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            f3 = f;
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            i6 = i3;
            if ((38347923 & i3) != 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                    }
                    if ((i2 & 16) == 0) {
                    }
                    if ((i2 & 32) == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    searchBarColors3 = searchBarColorsM2851colorsdgg9oW8;
                    int i122 = i6;
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i132 = i122 >> 6;
                    Composer composer42 = composer2;
                    SurfaceKt.m2978SurfaceT9BRK9s(SizeKt.m1485width3ABfNKs(ZIndexModifierKt.zIndex(modifier2, 1.0f), SearchBarMinWidth), shape3, searchBarColors3.m2847getContainerColor0d7_KjU(), ColorSchemeKt.m2364contentColorForek8zF_U(searchBarColors3.m2847getContainerColor0d7_KjU(), composer2, 0), f5, fM2854getShadowElevationD9Ej5fM, null, ComposableLambdaKt.rememberComposableLambda(878471280, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                            invoke(composer5, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer5, int i14) {
                            ComposerKt.sourceInformation(composer5, "C301@13956L815:SearchBar.android.kt#uh7d8r");
                            if ((i14 & 3) != 2 || !composer5.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(878471280, i14, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.android.kt:301)");
                                }
                                Function2<Composer, Integer, Unit> function22 = function2;
                                boolean z3 = z;
                                final SearchBarColors searchBarColors5 = searchBarColors3;
                                final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32 = function3;
                                ComposerKt.sourceInformationMarkerStart(composer5, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer5, companion);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer5.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer5.startReusableNode();
                                if (composer5.getInserting()) {
                                    composer5.createNode(constructor);
                                } else {
                                    composer5.useNode();
                                }
                                Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composer5);
                                Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer5, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer5, 1812191551, "C302@13977L12,308@14165L596,304@14003L758:SearchBar.android.kt#uh7d8r");
                                function22.invoke(composer5, 0);
                                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z3, (Modifier) null, SearchBar_androidKt.DockedEnterTransition, SearchBar_androidKt.DockedExitTransition, (String) null, ComposableLambdaKt.rememberComposableLambda(-1743690306, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer6, Integer num) {
                                        invoke(animatedVisibilityScope, composer6, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer6, int i15) {
                                        ComposerKt.sourceInformation(composer6, "C*309@14221L7,311@14299L125,315@14477L76,317@14571L176:SearchBar.android.kt#uh7d8r");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1743690306, i15, -1, "androidx.compose.material3.DockedSearchBar.<anonymous>.<anonymous>.<anonymous> (SearchBar.android.kt:309)");
                                        }
                                        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
                                        ComposerKt.sourceInformationMarkerStart(composer6, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object objConsume = composer6.consume(localConfiguration);
                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                        float fM7055constructorimpl = C1959Dp.m7055constructorimpl(((Configuration) objConsume).screenHeightDp);
                                        ComposerKt.sourceInformationMarkerStart(composer6, 1708554480, "CC(remember):SearchBar.android.kt#9igjgp");
                                        boolean zChanged = composer6.changed(fM7055constructorimpl);
                                        Object objRememberedValue2 = composer6.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = C1959Dp.m7053boximpl(C1959Dp.m7055constructorimpl(fM7055constructorimpl * 0.6666667f));
                                            composer6.updateRememberedValue(objRememberedValue2);
                                        }
                                        float fM7069unboximpl = ((C1959Dp) objRememberedValue2).m7069unboximpl();
                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                        ComposerKt.sourceInformationMarkerStart(composer6, 1708560127, "CC(remember):SearchBar.android.kt#9igjgp");
                                        boolean zChanged2 = composer6.changed(fM7069unboximpl);
                                        Object objRememberedValue3 = composer6.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = C1959Dp.m7053boximpl(((C1959Dp) RangesKt.coerceAtMost(C1959Dp.m7053boximpl(SearchBar_androidKt.getDockedExpandedTableMinHeight()), C1959Dp.m7053boximpl(fM7069unboximpl))).m7069unboximpl());
                                            composer6.updateRememberedValue(objRememberedValue3);
                                        }
                                        float fM7069unboximpl2 = ((C1959Dp) objRememberedValue3).m7069unboximpl();
                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                        Modifier modifierM1467heightInVpY3zN4 = SizeKt.m1467heightInVpY3zN4(Modifier.INSTANCE, fM7069unboximpl2, fM7069unboximpl);
                                        SearchBarColors searchBarColors6 = searchBarColors5;
                                        Function3<ColumnScope, Composer, Integer, Unit> function33 = function32;
                                        ComposerKt.sourceInformationMarkerStart(composer6, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                                        ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer6.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer6, modifierM1467heightInVpY3zN4);
                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer6, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composer6.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer6.startReusableNode();
                                        if (composer6.getInserting()) {
                                            composer6.createNode(constructor2);
                                        } else {
                                            composer6.useNode();
                                        }
                                        Composer composerM4088constructorimpl2 = Updater.m4088constructorimpl(composer6);
                                        Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer6, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer6, 697724229, "C318@14653L46,319@14720L9:SearchBar.android.kt#uh7d8r");
                                        DividerKt.m2507HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors6.m2848getDividerColor0d7_KjU(), composer6, 0, 3);
                                        function33.invoke(columnScopeInstance2, composer6, 6);
                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                        composer6.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                        ComposerKt.sourceInformationMarkerEnd(composer6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer5, 54), composer5, 1600518, 18);
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                composer5.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer5.skipToGroupEnd();
                        }
                    }, composer2, 54), composer42, ((i122 >> 9) & LDSFile.EF_DG16_TAG) | 12582912 | (i132 & 57344) | (i132 & 458752), 64);
                    composer3 = composer42;
                    ComposerKt.sourceInformationMarkerStart(composer3, -994322031, "CC(remember):SearchBar.android.kt#9igjgp");
                    if ((i122 & 896) == 256) {
                    }
                    objRememberedValue = composer3.rememberedValue();
                    if (!z2) {
                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                function1.invoke(false);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        BackHandlerKt.BackHandler(z, (Function0) objRememberedValue, composer3, (i122 >> 3) & 14, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        searchBarColors4 = searchBarColors3;
                        modifier3 = modifier2;
                        shape4 = shape3;
                        f6 = f5;
                        f7 = fM2854getShadowElevationD9Ej5fM;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        f3 = f;
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        i6 = i3;
        if ((38347923 & i3) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012c  */
    @Deprecated(message = "Use overload which takes inputField as a parameter", replaceWith = @ReplaceWith(expression = "SearchBar(\n    inputField = {\n        SearchBarDefaults.InputField(\n            query = query,\n            onQueryChange = onQueryChange,\n            onSearch = onSearch,\n            expanded = active,\n            onExpandedChange = onActiveChange,\n            enabled = enabled,\n            placeholder = placeholder,\n            leadingIcon = leadingIcon,\n            trailingIcon = trailingIcon,\n            colors = colors.inputFieldColors,\n            interactionSource = interactionSource,\n        )\n    },\n    expanded = active,\n    onExpandedChange = onActiveChange,\n    modifier = modifier,\n    shape = shape,\n    colors = colors,\n    tonalElevation = tonalElevation,\n    shadowElevation = shadowElevation,\n    windowInsets = windowInsets,\n    content = content,\n)", imports = {}))
    /* renamed from: SearchBar-WuY5d9Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2860SearchBarWuY5d9Q(final String str, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12, final boolean z, final Function1<? super Boolean, Unit> function13, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, MutableInteractionSource mutableInteractionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function1<? super String, Unit> function14;
        int i5;
        final Modifier modifier2;
        int i6;
        boolean z3;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Shape inputFieldShape;
        Composer composer2;
        int i18;
        SearchBarColors searchBarColorsM2851colorsdgg9oW8;
        WindowInsets windowInsets2;
        final MutableInteractionSource mutableInteractionSource2;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final SearchBarColors searchBarColors2;
        float f3;
        float f4;
        WindowInsets windowInsets3;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        Shape shape2;
        Modifier modifier3;
        final boolean z4;
        int i19;
        final float f5;
        final WindowInsets windowInsets4;
        Composer composer3;
        final SearchBarColors searchBarColors3;
        final boolean z5;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final MutableInteractionSource mutableInteractionSource3;
        final float f6;
        final Shape shape3;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1001512593);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SearchBar)P(11,8,9!1,7,6,3,10,5,15,13!1,14:c#ui.unit.Dp,12:c#ui.unit.Dp,16,4)737@34012L15,738@34077L8,741@34258L12,746@34418L591,745@34386L925:SearchBar.android.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            function14 = function1;
        } else {
            function14 = function1;
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function14) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            int i20 = 8192;
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function13) ? 16384 : 8192;
                }
                i5 = i3 & 32;
                if (i5 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                        i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                    }
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                    z3 = z2;
                } else {
                    z3 = z2;
                    if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                    function24 = function2;
                } else {
                    function24 = function2;
                    if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function24) ? 8388608 : 4194304;
                    }
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i4 |= 100663296;
                    function25 = function22;
                } else {
                    function25 = function22;
                    if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function25) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= 805306368;
                } else {
                    if ((i & 805306368) == 0) {
                        i10 = i9;
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    }
                    if ((i2 & 6) != 0) {
                        i11 = i2 | (((i3 & 1024) == 0 && composerStartRestartGroup.changed(shape)) ? 4 : 2);
                    } else {
                        i11 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i11 |= ((i3 & 2048) == 0 && composerStartRestartGroup.changed(searchBarColors)) ? 32 : 16;
                    }
                    int i21 = i11;
                    i12 = i3 & 4096;
                    if (i12 == 0) {
                        i13 = i21 | 384;
                    } else {
                        int i22 = i21;
                        if ((i2 & 384) == 0) {
                            i22 |= composerStartRestartGroup.changed(f) ? 256 : 128;
                        }
                        i13 = i22;
                    }
                    i14 = i3 & 8192;
                    if (i14 == 0) {
                        i15 = i13 | 3072;
                    } else {
                        i15 = i13;
                        if ((i2 & 3072) == 0) {
                            i15 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
                        }
                        if ((i2 & 24576) == 0) {
                            if ((i3 & 16384) == 0 && composerStartRestartGroup.changed(windowInsets)) {
                                i20 = 16384;
                            }
                            i15 |= i20;
                        }
                        i16 = i3 & 32768;
                        if (i16 == 0) {
                            if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                                i17 = i14;
                                i15 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
                            }
                            if ((i3 & 65536) == 0) {
                                i15 |= 1572864;
                            } else if ((i2 & 1572864) == 0) {
                                i15 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                            }
                            if ((i4 & 306783379) != 306783378 && (i15 & 599187) == 599186 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                shape3 = shape;
                                searchBarColors3 = searchBarColors;
                                f5 = f;
                                windowInsets4 = windowInsets;
                                mutableInteractionSource3 = mutableInteractionSource;
                                function29 = function25;
                                z5 = z3;
                                function211 = function24;
                                composer3 = composerStartRestartGroup;
                                function210 = function23;
                                f6 = f2;
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i5 == 0 ? Modifier.INSTANCE : modifier2;
                                    boolean z6 = i6 == 0 ? true : z3;
                                    Function2<? super Composer, ? super Integer, Unit> function212 = i7 == 0 ? null : function24;
                                    if (i8 != 0) {
                                        function25 = null;
                                    }
                                    Function2<? super Composer, ? super Integer, Unit> function213 = i10 == 0 ? null : function23;
                                    if ((i3 & 1024) == 0) {
                                        i15 &= -15;
                                        inputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape(composerStartRestartGroup, 6);
                                    } else {
                                        inputFieldShape = shape;
                                    }
                                    if ((i3 & 2048) == 0) {
                                        composer2 = composerStartRestartGroup;
                                        i18 = i4;
                                        searchBarColorsM2851colorsdgg9oW8 = SearchBarDefaults.INSTANCE.m2851colorsdgg9oW8(0L, 0L, composer2, 384, 3);
                                        i15 &= -113;
                                    } else {
                                        composer2 = composerStartRestartGroup;
                                        i18 = i4;
                                        searchBarColorsM2851colorsdgg9oW8 = searchBarColors;
                                    }
                                    float fM2855getTonalElevationD9Ej5fM = i12 == 0 ? SearchBarDefaults.INSTANCE.m2855getTonalElevationD9Ej5fM() : f;
                                    float fM2854getShadowElevationD9Ej5fM = i17 == 0 ? SearchBarDefaults.INSTANCE.m2854getShadowElevationD9Ej5fM() : f2;
                                    if ((i3 & 16384) == 0) {
                                        windowInsets2 = SearchBarDefaults.INSTANCE.getWindowInsets(composer2, 6);
                                        i15 &= -57345;
                                    } else {
                                        windowInsets2 = windowInsets;
                                    }
                                    if (i16 == 0) {
                                        function26 = function25;
                                        searchBarColors2 = searchBarColorsM2851colorsdgg9oW8;
                                        f3 = fM2855getTonalElevationD9Ej5fM;
                                        f4 = fM2854getShadowElevationD9Ej5fM;
                                        windowInsets3 = windowInsets2;
                                        mutableInteractionSource2 = null;
                                    } else {
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        function26 = function25;
                                        searchBarColors2 = searchBarColorsM2851colorsdgg9oW8;
                                        f3 = fM2855getTonalElevationD9Ej5fM;
                                        f4 = fM2854getShadowElevationD9Ej5fM;
                                        windowInsets3 = windowInsets2;
                                    }
                                    function27 = function212;
                                    function28 = function213;
                                    shape2 = inputFieldShape;
                                    modifier3 = companion;
                                    z4 = z6;
                                    i19 = i15;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 1024) != 0) {
                                        i15 &= -15;
                                    }
                                    if ((i3 & 2048) != 0) {
                                        i15 &= -113;
                                    }
                                    if ((i3 & 16384) != 0) {
                                        i15 &= -57345;
                                    }
                                    function28 = function23;
                                    searchBarColors2 = searchBarColors;
                                    f4 = f2;
                                    windowInsets3 = windowInsets;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    function26 = function25;
                                    modifier3 = modifier2;
                                    z4 = z3;
                                    function27 = function24;
                                    composer2 = composerStartRestartGroup;
                                    i19 = i15;
                                    shape2 = shape;
                                    f3 = f;
                                    i18 = i4;
                                }
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1001512593, i18, i19, "androidx.compose.material3.SearchBar (SearchBar.android.kt:745)");
                                }
                                final Function1<? super String, Unit> function15 = function14;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1158111311, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$4
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
                                        ComposerKt.sourceInformation(composer4, "C747@34450L549:SearchBar.android.kt#uh7d8r");
                                        if ((i23 & 3) != 2 || !composer4.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1158111311, i23, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.android.kt:747)");
                                            }
                                            SearchBarDefaults.INSTANCE.InputField(str, function15, function12, z, function13, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z4, function27, function26, function28, searchBarColors2.getInputFieldColors(), mutableInteractionSource2, composer4, ProfileVerifier.CompilationStatus.f285xf2722a21, 384, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer4.skipToGroupEnd();
                                    }
                                }, composer2, 54);
                                int i23 = i18 >> 6;
                                int i24 = 6 | (i23 & LDSFile.EF_DG16_TAG) | (i23 & 896) | (i23 & 7168);
                                int i25 = i19 << 12;
                                Composer composer4 = composer2;
                                SearchBarColors searchBarColors4 = searchBarColors2;
                                m2861SearchBarY92LkZI(composableLambdaRememberComposableLambda, z, function13, modifier3, shape2, searchBarColors4, f3, f4, windowInsets3, function3, composer4, i24 | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (29360128 & i25) | (i25 & 234881024) | ((i19 << 9) & 1879048192), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier3;
                                f5 = f3;
                                windowInsets4 = windowInsets3;
                                composer3 = composer4;
                                searchBarColors3 = searchBarColors4;
                                z5 = z4;
                                function29 = function26;
                                function210 = function28;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                f6 = f4;
                                shape3 = shape2;
                                function211 = function27;
                            }
                            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i26) {
                                        SearchBar_androidKt.m2860SearchBarWuY5d9Q(str, function1, function12, z, function13, modifier2, z5, function211, function29, function210, shape3, searchBarColors3, f5, f6, windowInsets4, mutableInteractionSource3, function3, composer5, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i15 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                        i17 = i14;
                        if ((i3 & 65536) == 0) {
                        }
                        if ((i4 & 306783379) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i5 == 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 != 0) {
                                }
                                if (i10 == 0) {
                                }
                                if ((i3 & 1024) == 0) {
                                }
                                if ((i3 & 2048) == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if ((i3 & 16384) == 0) {
                                }
                                if (i16 == 0) {
                                }
                                function27 = function212;
                                function28 = function213;
                                shape2 = inputFieldShape;
                                modifier3 = companion;
                                z4 = z6;
                                i19 = i15;
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                final Function1<? super String, Unit> function152 = function14;
                                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1158111311, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBar$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer42, Integer num) {
                                        invoke(composer42, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer42, int i232) {
                                        ComposerKt.sourceInformation(composer42, "C747@34450L549:SearchBar.android.kt#uh7d8r");
                                        if ((i232 & 3) != 2 || !composer42.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1158111311, i232, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.android.kt:747)");
                                            }
                                            SearchBarDefaults.INSTANCE.InputField(str, function152, function12, z, function13, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z4, function27, function26, function28, searchBarColors2.getInputFieldColors(), mutableInteractionSource2, composer42, ProfileVerifier.CompilationStatus.f285xf2722a21, 384, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer42.skipToGroupEnd();
                                    }
                                }, composer2, 54);
                                int i232 = i18 >> 6;
                                int i242 = 6 | (i232 & LDSFile.EF_DG16_TAG) | (i232 & 896) | (i232 & 7168);
                                int i252 = i19 << 12;
                                Composer composer42 = composer2;
                                SearchBarColors searchBarColors42 = searchBarColors2;
                                m2861SearchBarY92LkZI(composableLambdaRememberComposableLambda2, z, function13, modifier3, shape2, searchBarColors42, f3, f4, windowInsets3, function3, composer42, i242 | (57344 & i252) | (458752 & i252) | (3670016 & i252) | (29360128 & i252) | (i252 & 234881024) | ((i19 << 9) & 1879048192), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier2 = modifier3;
                                f5 = f3;
                                windowInsets4 = windowInsets3;
                                composer3 = composer42;
                                searchBarColors3 = searchBarColors42;
                                z5 = z4;
                                function29 = function26;
                                function210 = function28;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                f6 = f4;
                                shape3 = shape2;
                                function211 = function27;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i2 & 24576) == 0) {
                    }
                    i16 = i3 & 32768;
                    if (i16 == 0) {
                    }
                    i17 = i14;
                    if ((i3 & 65536) == 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i10 = i9;
                if ((i2 & 6) != 0) {
                }
                if ((i2 & 48) == 0) {
                }
                int i212 = i11;
                i12 = i3 & 4096;
                if (i12 == 0) {
                }
                i14 = i3 & 8192;
                if (i14 == 0) {
                }
                if ((i2 & 24576) == 0) {
                }
                i16 = i3 & 32768;
                if (i16 == 0) {
                }
                i17 = i14;
                if ((i3 & 65536) == 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
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
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            i10 = i9;
            if ((i2 & 6) != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i2122 = i11;
            i12 = i3 & 4096;
            if (i12 == 0) {
            }
            i14 = i3 & 8192;
            if (i14 == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i16 = i3 & 32768;
            if (i16 == 0) {
            }
            i17 = i14;
            if ((i3 & 65536) == 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        int i202 = 8192;
        if ((i3 & 16) == 0) {
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
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        i10 = i9;
        if ((i2 & 6) != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i21222 = i11;
        i12 = i3 & 4096;
        if (i12 == 0) {
        }
        i14 = i3 & 8192;
        if (i14 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i16 = i3 & 32768;
        if (i16 == 0) {
        }
        i17 = i14;
        if ((i3 & 65536) == 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012c  */
    @Deprecated(message = "Use overload which takes inputField as a parameter", replaceWith = @ReplaceWith(expression = "DockedSearchBar(\n    inputField = {\n        SearchBarDefaults.InputField(\n            query = query,\n            onQueryChange = onQueryChange,\n            onSearch = onSearch,\n            expanded = active,\n            onExpandedChange = onActiveChange,\n            enabled = enabled,\n            placeholder = placeholder,\n            leadingIcon = leadingIcon,\n            trailingIcon = trailingIcon,\n            colors = colors.inputFieldColors,\n            interactionSource = interactionSource,\n        )\n    },\n    expanded = active,\n    onExpandedChange = onActiveChange,\n    modifier = modifier,\n    shape = shape,\n    colors = colors,\n    tonalElevation = tonalElevation,\n    shadowElevation = shadowElevation,\n    content = content,\n)", imports = {}))
    /* renamed from: DockedSearchBar-eWTbjVg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2859DockedSearchBareWTbjVg(final String str, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12, final boolean z, final Function1<? super Boolean, Unit> function13, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, SearchBarColors searchBarColors, float f, float f2, MutableInteractionSource mutableInteractionSource, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        String str2;
        int i4;
        int i5;
        final Modifier modifier2;
        int i6;
        boolean z3;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i8;
        Function2<? super Composer, ? super Integer, Unit> function25;
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
        Shape dockedShape;
        boolean z4;
        Composer composer2;
        int i20;
        SearchBarColors searchBarColorsM2851colorsdgg9oW8;
        int i21;
        final MutableInteractionSource mutableInteractionSource2;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final SearchBarColors searchBarColors2;
        float f3;
        float f4;
        Shape shape2;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final boolean z5;
        final float f5;
        Composer composer3;
        final SearchBarColors searchBarColors3;
        final boolean z6;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final MutableInteractionSource mutableInteractionSource3;
        final Shape shape3;
        final float f6;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Function2<? super Composer, ? super Integer, Unit> function211;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1299054533);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(DockedSearchBar)P(11,8,9!1,7,6,3,10,5,15,13!1,14:c#ui.unit.Dp,12:c#ui.unit.Dp,4)818@37222L11,819@37283L8,826@37565L591,825@37527L894:SearchBar.android.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 6) == 0) {
                i4 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
            } else {
                i4 = i;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function13) ? 16384 : 8192;
                }
                i5 = i3 & 32;
                if (i5 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                        i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                    }
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                    z3 = z2;
                } else {
                    z3 = z2;
                    if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                    function24 = function2;
                } else {
                    function24 = function2;
                    if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function24) ? 8388608 : 4194304;
                    }
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i4 |= 100663296;
                    function25 = function22;
                } else {
                    function25 = function22;
                    if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function25) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= 805306368;
                } else {
                    if ((i & 805306368) == 0) {
                        i10 = i9;
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    }
                    if ((i2 & 6) != 0) {
                        i11 = i2 | (((i3 & 1024) == 0 && composerStartRestartGroup.changed(shape)) ? 4 : 2);
                    } else {
                        i11 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i11 |= ((i3 & 2048) == 0 && composerStartRestartGroup.changed(searchBarColors)) ? 32 : 16;
                    }
                    int i22 = i11;
                    i12 = i3 & 4096;
                    if (i12 == 0) {
                        i13 = i22 | 384;
                    } else {
                        int i23 = i22;
                        if ((i2 & 384) == 0) {
                            i23 |= composerStartRestartGroup.changed(f) ? 256 : 128;
                        }
                        i13 = i23;
                    }
                    i14 = i3 & 8192;
                    if (i14 == 0) {
                        i15 = i13 | 3072;
                    } else {
                        int i24 = i13;
                        if ((i2 & 3072) == 0) {
                            i15 = i24 | (composerStartRestartGroup.changed(f2) ? 2048 : 1024);
                        } else {
                            i15 = i24;
                        }
                    }
                    i16 = i3 & 16384;
                    if (i16 == 0) {
                        i17 = i15 | 24576;
                    } else {
                        i17 = i15;
                        if ((i2 & 24576) == 0) {
                            i17 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                        }
                        if ((i3 & 32768) == 0) {
                            if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                                i18 = i16;
                                i17 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
                            }
                            if ((i4 & 306783379) != 306783378 && (i17 & 74899) == 74898 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                shape3 = shape;
                                searchBarColors3 = searchBarColors;
                                f5 = f2;
                                mutableInteractionSource3 = mutableInteractionSource;
                                function29 = function25;
                                z6 = z3;
                                function210 = function24;
                                composer3 = composerStartRestartGroup;
                                function211 = function23;
                                f6 = f;
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i5 == 0 ? Modifier.INSTANCE : modifier2;
                                    boolean z7 = i6 == 0 ? true : z3;
                                    Function2<? super Composer, ? super Integer, Unit> function212 = i7 == 0 ? null : function24;
                                    if (i8 != 0) {
                                        function25 = null;
                                    }
                                    Function2<? super Composer, ? super Integer, Unit> function213 = i10 == 0 ? null : function23;
                                    if ((i3 & 1024) == 0) {
                                        i19 = i17 & (-15);
                                        dockedShape = SearchBarDefaults.INSTANCE.getDockedShape(composerStartRestartGroup, 6);
                                    } else {
                                        i19 = i17;
                                        dockedShape = shape;
                                    }
                                    if ((i3 & 2048) == 0) {
                                        z4 = true;
                                        composer2 = composerStartRestartGroup;
                                        i20 = i4;
                                        searchBarColorsM2851colorsdgg9oW8 = SearchBarDefaults.INSTANCE.m2851colorsdgg9oW8(0L, 0L, composer2, 384, 3);
                                        i21 = i19 & (-113);
                                    } else {
                                        z4 = true;
                                        composer2 = composerStartRestartGroup;
                                        i20 = i4;
                                        searchBarColorsM2851colorsdgg9oW8 = searchBarColors;
                                        i21 = i19;
                                    }
                                    float fM2855getTonalElevationD9Ej5fM = i12 == 0 ? SearchBarDefaults.INSTANCE.m2855getTonalElevationD9Ej5fM() : f;
                                    float fM2854getShadowElevationD9Ej5fM = i14 == 0 ? SearchBarDefaults.INSTANCE.m2854getShadowElevationD9Ej5fM() : f2;
                                    if (i18 == 0) {
                                        function26 = function25;
                                        searchBarColors2 = searchBarColorsM2851colorsdgg9oW8;
                                        f3 = fM2855getTonalElevationD9Ej5fM;
                                        f4 = fM2854getShadowElevationD9Ej5fM;
                                        shape2 = dockedShape;
                                        mutableInteractionSource2 = null;
                                    } else {
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        function26 = function25;
                                        searchBarColors2 = searchBarColorsM2851colorsdgg9oW8;
                                        f3 = fM2855getTonalElevationD9Ej5fM;
                                        f4 = fM2854getShadowElevationD9Ej5fM;
                                        shape2 = dockedShape;
                                    }
                                    function27 = function213;
                                    modifier3 = companion;
                                    function28 = function212;
                                    z5 = z7;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 1024) != 0) {
                                        i17 &= -15;
                                    }
                                    if ((i3 & 2048) != 0) {
                                        i17 &= -113;
                                    }
                                    function27 = function23;
                                    searchBarColors2 = searchBarColors;
                                    f4 = f2;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    function26 = function25;
                                    z4 = true;
                                    modifier3 = modifier2;
                                    z5 = z3;
                                    function28 = function24;
                                    composer2 = composerStartRestartGroup;
                                    i21 = i17;
                                    shape2 = shape;
                                    f3 = f;
                                    i20 = i4;
                                }
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1299054533, i20, i21, "androidx.compose.material3.DockedSearchBar (SearchBar.android.kt:825)");
                                }
                                final String str3 = str2;
                                int i25 = i20 >> 6;
                                int i26 = i21 << 12;
                                Composer composer4 = composer2;
                                SearchBarColors searchBarColors4 = searchBarColors2;
                                m2858DockedSearchBarEQC0FA8(ComposableLambdaKt.rememberComposableLambda(-303118761, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i27) {
                                        ComposerKt.sourceInformation(composer5, "C827@37597L549:SearchBar.android.kt#uh7d8r");
                                        if ((i27 & 3) != 2 || !composer5.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-303118761, i27, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.android.kt:827)");
                                            }
                                            SearchBarDefaults.INSTANCE.InputField(str3, function1, function12, z, function13, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z5, function28, function26, function27, searchBarColors2.getInputFieldColors(), mutableInteractionSource2, composer5, ProfileVerifier.CompilationStatus.f285xf2722a21, 384, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                }, composer2, 54), z, function13, modifier3, shape2, searchBarColors4, f3, f4, function3, composer4, (i25 & 7168) | (i25 & LDSFile.EF_DG16_TAG) | 6 | (i25 & 896) | (57344 & i26) | (458752 & i26) | (3670016 & i26) | (i26 & 29360128) | ((i21 << 9) & 234881024), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier3;
                                f5 = f4;
                                composer3 = composer4;
                                searchBarColors3 = searchBarColors4;
                                z6 = z5;
                                function29 = function26;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                shape3 = shape2;
                                f6 = f3;
                                function210 = function28;
                                function211 = function27;
                            }
                            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i27) {
                                        SearchBar_androidKt.m2859DockedSearchBareWTbjVg(str, function1, function12, z, function13, modifier2, z6, function210, function29, function211, shape3, searchBarColors3, f6, f5, mutableInteractionSource3, function3, composer5, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i17 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                        i18 = i16;
                        if ((i4 & 306783379) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i5 == 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 != 0) {
                                }
                                if (i10 == 0) {
                                }
                                if ((i3 & 1024) == 0) {
                                }
                                if ((i3 & 2048) == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i18 == 0) {
                                }
                                function27 = function213;
                                modifier3 = companion;
                                function28 = function212;
                                z5 = z7;
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                final String str32 = str2;
                                int i252 = i20 >> 6;
                                int i262 = i21 << 12;
                                Composer composer42 = composer2;
                                SearchBarColors searchBarColors42 = searchBarColors2;
                                m2858DockedSearchBarEQC0FA8(ComposableLambdaKt.rememberComposableLambda(-303118761, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i27) {
                                        ComposerKt.sourceInformation(composer5, "C827@37597L549:SearchBar.android.kt#uh7d8r");
                                        if ((i27 & 3) != 2 || !composer5.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-303118761, i27, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.android.kt:827)");
                                            }
                                            SearchBarDefaults.INSTANCE.InputField(str32, function1, function12, z, function13, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), z5, function28, function26, function27, searchBarColors2.getInputFieldColors(), mutableInteractionSource2, composer5, ProfileVerifier.CompilationStatus.f285xf2722a21, 384, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer5.skipToGroupEnd();
                                    }
                                }, composer2, 54), z, function13, modifier3, shape2, searchBarColors42, f3, f4, function3, composer42, (i252 & 7168) | (i252 & LDSFile.EF_DG16_TAG) | 6 | (i252 & 896) | (57344 & i262) | (458752 & i262) | (3670016 & i262) | (i262 & 29360128) | ((i21 << 9) & 234881024), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier2 = modifier3;
                                f5 = f4;
                                composer3 = composer42;
                                searchBarColors3 = searchBarColors42;
                                z6 = z5;
                                function29 = function26;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                shape3 = shape2;
                                f6 = f3;
                                function210 = function28;
                                function211 = function27;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i3 & 32768) == 0) {
                    }
                    i18 = i16;
                    if ((i4 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i10 = i9;
                if ((i2 & 6) != 0) {
                }
                if ((i2 & 48) == 0) {
                }
                int i222 = i11;
                i12 = i3 & 4096;
                if (i12 == 0) {
                }
                i14 = i3 & 8192;
                if (i14 == 0) {
                }
                i16 = i3 & 16384;
                if (i16 == 0) {
                }
                if ((i3 & 32768) == 0) {
                }
                i18 = i16;
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
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
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            i10 = i9;
            if ((i2 & 6) != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i2222 = i11;
            i12 = i3 & 4096;
            if (i12 == 0) {
            }
            i14 = i3 & 8192;
            if (i14 == 0) {
            }
            i16 = i3 & 16384;
            if (i16 == 0) {
            }
            if ((i3 & 32768) == 0) {
            }
            i18 = i16;
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i3 & 16) == 0) {
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
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        i10 = i9;
        if ((i2 & 6) != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i22222 = i11;
        i12 = i3 & 4096;
        if (i12 == 0) {
        }
        i14 = i3 & 8192;
        if (i14 == 0) {
        }
        i16 = i3 & 16384;
        if (i16 == 0) {
        }
        if ((i3 & 32768) == 0) {
        }
        i18 = i16;
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /* renamed from: SearchBarImpl-j1jLAyQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2862SearchBarImplj1jLAyQ(final Animatable<Float, AnimationVector1D> animatable, final MutableFloatState mutableFloatState, final MutableState<BackEventCompat> mutableState, final MutableState<BackEventCompat> mutableState2, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        MutableState<BackEventCompat> mutableState3;
        Modifier modifier2;
        SearchBarColors searchBarColors2;
        int i5;
        int i6;
        int i7;
        int i8;
        float f3;
        WindowInsets windowInsets2;
        int i9;
        Shape inputFieldShape;
        Modifier modifier3;
        int i10;
        SearchBarColors searchBarColorsM2851colorsdgg9oW8;
        int i11;
        WindowInsets windowInsets3;
        int i12;
        final float f4;
        int i13;
        final SearchBarColors searchBarColors3;
        final float f5;
        Shape shape2;
        Modifier modifier4;
        WindowInsets windowInsets4;
        Shape inputFieldShape2;
        Object objRememberedValue;
        boolean zChanged;
        Object objRememberedValue2;
        GenericShape genericShape;
        Object objRememberedValue3;
        Composer composer2;
        final SearchBarColors searchBarColors4;
        final float f6;
        final float f7;
        final Shape shape3;
        final WindowInsets windowInsets5;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-440333505);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SearchBarImpl)P(!1,4,5,3,7,6,9!1,10:c#ui.unit.Dp,8:c#ui.unit.Dp,11)861@38824L15,862@38889L8,865@39070L12,868@39168L7,870@39228L15,871@39295L15,872@39341L101,876@39475L666,892@40180L333,903@40538L99,916@40970L362:SearchBar.android.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? composerStartRestartGroup.changed(animatable) : composerStartRestartGroup.changedInstance(animatable) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(mutableFloatState) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(mutableState) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
            mutableState3 = mutableState2;
        } else {
            mutableState3 = mutableState2;
            if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(mutableState3) ? 2048 : 1024;
            }
        }
        int i14 = i3 & 16;
        if (i14 != 0) {
            i4 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
            } else if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
            }
            if ((i & 1572864) == 0) {
                i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(shape)) ? 1048576 : 524288;
            }
            if ((i & 12582912) != 0) {
                if ((i3 & 128) == 0) {
                    searchBarColors2 = searchBarColors;
                    int i15 = composerStartRestartGroup.changed(searchBarColors2) ? 8388608 : 4194304;
                    i4 |= i15;
                } else {
                    searchBarColors2 = searchBarColors;
                }
                i4 |= i15;
            } else {
                searchBarColors2 = searchBarColors;
            }
            i5 = i3 & 256;
            if (i5 == 0) {
                i4 |= 100663296;
            } else {
                if ((i & 100663296) == 0) {
                    i6 = i5;
                    i4 |= composerStartRestartGroup.changed(f) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i7 = i3 & 512;
                if (i7 == 0) {
                    if ((i & 805306368) == 0) {
                        i8 = i7;
                        f3 = f2;
                        i4 |= composerStartRestartGroup.changed(f3) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    }
                    if ((i2 & 6) != 0) {
                        if ((i3 & 1024) == 0) {
                            windowInsets2 = windowInsets;
                            int i16 = composerStartRestartGroup.changed(windowInsets2) ? 4 : 2;
                            i9 = i2 | i16;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i9 = i2 | i16;
                    } else {
                        windowInsets2 = windowInsets;
                        i9 = i2;
                    }
                    if ((i3 & 2048) == 0) {
                        i9 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i9 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
                    }
                    if ((306783379 & i4) == 306783378 || (i9 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i14 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i3 & 64) == 0) {
                                i4 &= -3670017;
                                inputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape(composerStartRestartGroup, 6);
                            } else {
                                inputFieldShape = shape;
                            }
                            int i17 = i4;
                            if ((i3 & 128) == 0) {
                                modifier3 = companion;
                                i10 = 6;
                                searchBarColorsM2851colorsdgg9oW8 = SearchBarDefaults.INSTANCE.m2851colorsdgg9oW8(0L, 0L, composerStartRestartGroup, 384, 3);
                                i11 = i17 & (-29360129);
                            } else {
                                modifier3 = companion;
                                i10 = 6;
                                searchBarColorsM2851colorsdgg9oW8 = searchBarColors2;
                                i11 = i17;
                            }
                            float fM2855getTonalElevationD9Ej5fM = i6 == 0 ? SearchBarDefaults.INSTANCE.m2855getTonalElevationD9Ej5fM() : f;
                            float fM2854getShadowElevationD9Ej5fM = i8 == 0 ? SearchBarDefaults.INSTANCE.m2854getShadowElevationD9Ej5fM() : f2;
                            if ((i3 & 1024) == 0) {
                                i12 = i11;
                                windowInsets3 = SearchBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, i10);
                                i13 = i9 & (-15);
                                searchBarColors3 = searchBarColorsM2851colorsdgg9oW8;
                                f4 = fM2854getShadowElevationD9Ej5fM;
                                shape2 = inputFieldShape;
                                f5 = fM2855getTonalElevationD9Ej5fM;
                            } else {
                                windowInsets3 = windowInsets;
                                i12 = i11;
                                f4 = fM2854getShadowElevationD9Ej5fM;
                                i13 = i9;
                                searchBarColors3 = searchBarColorsM2851colorsdgg9oW8;
                                f5 = fM2855getTonalElevationD9Ej5fM;
                                shape2 = inputFieldShape;
                            }
                            modifier4 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            if ((i3 & 1024) != 0) {
                                i9 &= -15;
                            }
                            f5 = f;
                            windowInsets3 = windowInsets2;
                            i13 = i9;
                            f4 = f3;
                            searchBarColors3 = searchBarColors2;
                            modifier4 = modifier2;
                            i12 = i4;
                            shape2 = shape;
                        }
                        composerStartRestartGroup.endDefaults();
                        Modifier modifier6 = modifier4;
                        if (ComposerKt.isTraceInProgress()) {
                            windowInsets4 = windowInsets3;
                        } else {
                            windowInsets4 = windowInsets3;
                            ComposerKt.traceEventStart(-440333505, i12, i13, "androidx.compose.material3.SearchBarImpl (SearchBar.android.kt:867)");
                        }
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        int i18 = i13;
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume = composerStartRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        final Density density = (Density) objConsume;
                        inputFieldShape2 = SearchBarDefaults.INSTANCE.getInputFieldShape(composerStartRestartGroup, 6);
                        Shape fullScreenShape = SearchBarDefaults.INSTANCE.getFullScreenShape(composerStartRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1567245043, "CC(remember):SearchBar.android.kt#9igjgp");
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Boolean>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$useFullScreenShape$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    return Boolean.valueOf(animatable.getValue().floatValue() == 1.0f);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        State state = (State) objRememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        boolean zSearchBarImpl_j1jLAyQ$lambda$9 = SearchBarImpl_j1jLAyQ$lambda$9(state);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1567240190, "CC(remember):SearchBar.android.kt#9igjgp");
                        zChanged = composerStartRestartGroup.changed(zSearchBarImpl_j1jLAyQ$lambda$9) | ((((3670016 & i12) ^ 1572864) <= 1048576 && composerStartRestartGroup.changed(shape2)) || (i12 & 1572864) == 1048576);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            if (!Intrinsics.areEqual(shape2, inputFieldShape2)) {
                                genericShape = new GenericShape(new Function3<Path, Size, LayoutDirection, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$animatedShape$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Path path, Size size, LayoutDirection layoutDirection) {
                                        m2867invoke12SF9DM(path, size.getPackedValue(), layoutDirection);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke-12SF9DM, reason: not valid java name */
                                    public final void m2867invoke12SF9DM(Path path, long j, LayoutDirection layoutDirection) {
                                        Path.addRoundRect$default(path, RoundRectKt.m4409RoundRectsniSvfs(androidx.compose.p000ui.geometry.SizeKt.m4444toRectuvyYCjk(j), CornerRadiusKt.CornerRadius$default(density.mo1127toPx0680j_4(C1959Dp.m7055constructorimpl(SearchBar_androidKt.SearchBarCornerRadius * (1 - animatable.getValue().floatValue()))), 0.0f, 2, null)), null, 2, null);
                                    }
                                });
                            } else {
                                genericShape = SearchBarImpl_j1jLAyQ$lambda$9(state) ? fullScreenShape : shape2;
                            }
                            composerStartRestartGroup.updateRememberedValue(genericShape);
                            objRememberedValue2 = genericShape;
                        }
                        final Shape shape4 = (Shape) objRememberedValue2;
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-170534294, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$surface$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i19) {
                                ComposerKt.sourceInformation(composer3, "C896@40320L38,893@40194L309:SearchBar.android.kt#uh7d8r");
                                if ((i19 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-170534294, i19, -1, "androidx.compose.material3.SearchBarImpl.<anonymous> (SearchBar.android.kt:893)");
                                    }
                                    SurfaceKt.m2978SurfaceT9BRK9s(null, shape4, searchBarColors3.m2847getContainerColor0d7_KjU(), ColorSchemeKt.m2364contentColorForek8zF_U(searchBarColors3.m2847getContainerColor0d7_KjU(), composer3, 0), f5, f4, null, ComposableSingletons$SearchBar_androidKt.INSTANCE.m2413getLambda2$material3_release(), composer3, 12582912, 65);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composerStartRestartGroup, 54);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1567206741, "CC(remember):SearchBar.android.kt#9igjgp");
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Boolean>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$showContent$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    return Boolean.valueOf(animatable.getValue().floatValue() > 0.0f);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.startReplaceGroup(-1567201454);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "908@40729L215");
                        ComposableLambda composableLambdaRememberComposableLambda2 = !SearchBarImpl_j1jLAyQ$lambda$12((State) objRememberedValue3) ? ComposableLambdaKt.rememberComposableLambda(147843820, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$wrappedContent$1
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

                            public final void invoke(Composer composer3, int i19) {
                                ComposerKt.sourceInformation(composer3, "C909@40777L35,909@40747L183:SearchBar.android.kt#uh7d8r");
                                if ((i19 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(147843820, i19, -1, "androidx.compose.material3.SearchBarImpl.<anonymous> (SearchBar.android.kt:909)");
                                }
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                ComposerKt.sourceInformationMarkerStart(composer3, -502962614, "CC(remember):SearchBar.android.kt#9igjgp");
                                boolean zChangedInstance = composer3.changedInstance(animatable);
                                final Animatable<Float, AnimationVector1D> animatable2 = animatable;
                                Object objRememberedValue4 = composer3.rememberedValue();
                                if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$wrappedContent$1$1$1
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
                                            graphicsLayerScope.setAlpha(animatable2.getValue().floatValue());
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue4);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion2, (Function1) objRememberedValue4);
                                SearchBarColors searchBarColors5 = searchBarColors3;
                                Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                                ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
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
                                ComposerKt.sourceInformationMarkerStart(composer3, 1608207601, "C910@40836L46,911@40903L9:SearchBar.android.kt#uh7d8r");
                                DividerKt.m2507HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors5.m2848getDividerColor0d7_KjU(), composer3, 0, 3);
                                function32.invoke(columnScopeInstance, composer3, 6);
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
                        }, composerStartRestartGroup, 54) : null;
                        composerStartRestartGroup.endReplaceGroup();
                        int i19 = Animatable.$stable | 12582912 | (i12 & 14) | (i12 & LDSFile.EF_DG16_TAG) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | ((i18 << 15) & 458752) | ((i12 << 3) & 3670016);
                        Shape shape5 = shape2;
                        SearchBarColors searchBarColors5 = searchBarColors3;
                        float f8 = f4;
                        MutableState<BackEventCompat> mutableState4 = mutableState3;
                        float f9 = f5;
                        WindowInsets windowInsets6 = windowInsets4;
                        SearchBarLayout(animatable, mutableFloatState, mutableState, mutableState4, modifier6, windowInsets6, function2, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, composerStartRestartGroup, i19);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2 = composerStartRestartGroup;
                        searchBarColors4 = searchBarColors5;
                        f6 = f9;
                        f7 = f8;
                        shape3 = shape5;
                        windowInsets5 = windowInsets6;
                        modifier5 = modifier6;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        f7 = f3;
                        searchBarColors4 = searchBarColors2;
                        windowInsets5 = windowInsets2;
                        composer2 = composerStartRestartGroup;
                        modifier5 = modifier2;
                        shape3 = shape;
                        f6 = f;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$1
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

                            public final void invoke(Composer composer3, int i20) {
                                SearchBar_androidKt.m2862SearchBarImplj1jLAyQ(animatable, mutableFloatState, mutableState, mutableState2, modifier5, function2, shape3, searchBarColors4, f6, f7, windowInsets5, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 805306368;
                i8 = i7;
                f3 = f2;
                if ((i2 & 6) != 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                if ((306783379 & i4) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i14 == 0) {
                        }
                        if ((i3 & 64) == 0) {
                        }
                        int i172 = i4;
                        if ((i3 & 128) == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if ((i3 & 1024) == 0) {
                        }
                        modifier4 = modifier3;
                        composerStartRestartGroup.endDefaults();
                        Modifier modifier62 = modifier4;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                        int i182 = i13;
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume2 = composerStartRestartGroup.consume(localDensity2);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        final Density density2 = (Density) objConsume2;
                        inputFieldShape2 = SearchBarDefaults.INSTANCE.getInputFieldShape(composerStartRestartGroup, 6);
                        Shape fullScreenShape2 = SearchBarDefaults.INSTANCE.getFullScreenShape(composerStartRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1567245043, "CC(remember):SearchBar.android.kt#9igjgp");
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        State state2 = (State) objRememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        boolean zSearchBarImpl_j1jLAyQ$lambda$92 = SearchBarImpl_j1jLAyQ$lambda$9(state2);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1567240190, "CC(remember):SearchBar.android.kt#9igjgp");
                        if (((3670016 & i12) ^ 1572864) <= 1048576) {
                            zChanged = composerStartRestartGroup.changed(zSearchBarImpl_j1jLAyQ$lambda$92) | ((((3670016 & i12) ^ 1572864) <= 1048576 && composerStartRestartGroup.changed(shape2)) || (i12 & 1572864) == 1048576);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                if (!Intrinsics.areEqual(shape2, inputFieldShape2)) {
                                }
                                composerStartRestartGroup.updateRememberedValue(genericShape);
                                objRememberedValue2 = genericShape;
                                final Shape shape42 = (Shape) objRememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(-170534294, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarImpl$surface$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i192) {
                                        ComposerKt.sourceInformation(composer3, "C896@40320L38,893@40194L309:SearchBar.android.kt#uh7d8r");
                                        if ((i192 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-170534294, i192, -1, "androidx.compose.material3.SearchBarImpl.<anonymous> (SearchBar.android.kt:893)");
                                            }
                                            SurfaceKt.m2978SurfaceT9BRK9s(null, shape42, searchBarColors3.m2847getContainerColor0d7_KjU(), ColorSchemeKt.m2364contentColorForek8zF_U(searchBarColors3.m2847getContainerColor0d7_KjU(), composer3, 0), f5, f4, null, ComposableSingletons$SearchBar_androidKt.INSTANCE.m2413getLambda2$material3_release(), composer3, 12582912, 65);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composerStartRestartGroup, 54);
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1567206741, "CC(remember):SearchBar.android.kt#9igjgp");
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                }
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                composerStartRestartGroup.startReplaceGroup(-1567201454);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "908@40729L215");
                                if (!SearchBarImpl_j1jLAyQ$lambda$12((State) objRememberedValue3)) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                int i192 = Animatable.$stable | 12582912 | (i12 & 14) | (i12 & LDSFile.EF_DG16_TAG) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | ((i182 << 15) & 458752) | ((i12 << 3) & 3670016);
                                Shape shape52 = shape2;
                                SearchBarColors searchBarColors52 = searchBarColors3;
                                float f82 = f4;
                                MutableState<BackEventCompat> mutableState42 = mutableState3;
                                float f92 = f5;
                                WindowInsets windowInsets62 = windowInsets4;
                                SearchBarLayout(animatable, mutableFloatState, mutableState, mutableState42, modifier62, windowInsets62, function2, composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda2, composerStartRestartGroup, i192);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer2 = composerStartRestartGroup;
                                searchBarColors4 = searchBarColors52;
                                f6 = f92;
                                f7 = f82;
                                shape3 = shape52;
                                windowInsets5 = windowInsets62;
                                modifier5 = modifier62;
                            }
                        } else {
                            zChanged = composerStartRestartGroup.changed(zSearchBarImpl_j1jLAyQ$lambda$92) | ((((3670016 & i12) ^ 1572864) <= 1048576 && composerStartRestartGroup.changed(shape2)) || (i12 & 1572864) == 1048576);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i6 = i5;
            i7 = i3 & 512;
            if (i7 == 0) {
            }
            i8 = i7;
            f3 = f2;
            if ((i2 & 6) != 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            if ((306783379 & i4) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & 32) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i5 = i3 & 256;
        if (i5 == 0) {
        }
        i6 = i5;
        i7 = i3 & 512;
        if (i7 == 0) {
        }
        i8 = i7;
        f3 = f2;
        if ((i2 & 6) != 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        if ((306783379 & i4) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SearchBarLayout(final Animatable<Float, AnimationVector1D> animatable, final MutableFloatState mutableFloatState, final MutableState<BackEventCompat> mutableState, final MutableState<BackEventCompat> mutableState2, final Modifier modifier, final WindowInsets windowInsets, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, final int i) {
        int i2;
        final MutableFloatState mutableFloatState2;
        MutableState<BackEventCompat> mutableState3;
        MutableState<BackEventCompat> mutableState4;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(70029564);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SearchBarLayout)P(!1,3,4,2,6,8,5,7)945@42029L34,950@42191L120,965@42827L5009,946@42068L5768:SearchBar.android.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(animatable) : composerStartRestartGroup.changedInstance(animatable) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            mutableFloatState2 = mutableFloatState;
            i2 |= composerStartRestartGroup.changed(mutableFloatState2) ? 32 : 16;
        } else {
            mutableFloatState2 = mutableFloatState;
        }
        if ((i & 384) == 0) {
            mutableState3 = mutableState;
            i2 |= composerStartRestartGroup.changed(mutableState3) ? 256 : 128;
        } else {
            mutableState3 = mutableState;
        }
        if ((i & 3072) == 0) {
            mutableState4 = mutableState2;
            i2 |= composerStartRestartGroup.changed(mutableState4) ? 2048 : 1024;
        } else {
            mutableState4 = mutableState2;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(windowInsets) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function23) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((38347923 & i2) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(70029564, i2, -1, "androidx.compose.material3.SearchBarLayout (SearchBar.android.kt:941)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -660147884, "CC(remember):SearchBar.android.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new MutableWindowInsets(null, 1, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierZIndex = ZIndexModifierKt.zIndex(modifier, 1.0f);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -660142614, "CC(remember):SearchBar.android.kt#9igjgp");
            boolean z = (458752 & i2) == 131072;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = (Function1) new Function1<WindowInsets, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets2) {
                        invoke2(windowInsets2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(WindowInsets windowInsets2) {
                        mutableWindowInsets.setInsets(WindowInsetsKt.exclude(windowInsets, windowInsets2));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierConsumeWindowInsets = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifierZIndex, (Function1) objRememberedValue2), windowInsets);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -660117373, "CC(remember):SearchBar.android.kt#9igjgp");
            boolean z2 = ((i2 & 14) == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(animatable))) | ((i2 & 7168) == 2048) | ((i2 & LDSFile.EF_DG16_TAG) == 32) | ((i2 & 896) == 256);
            MeasurePolicy measurePolicyRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || measurePolicyRememberedValue == Composer.INSTANCE.getEmpty()) {
                final MutableState<BackEventCompat> mutableState5 = mutableState3;
                i3 = i2;
                final MutableState<BackEventCompat> mutableState6 = mutableState4;
                measurePolicyRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$2$1
                    @Override // androidx.compose.p000ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo792measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, final long j) {
                        Measurable measurable;
                        final Placeable placeableMo5931measureBRTryo0;
                        int i4;
                        int iM7007getMaxHeightimpl;
                        MeasureScope measureScope2 = measureScope;
                        long j2 = j;
                        final float fFloatValue = animatable.getValue().floatValue();
                        int size = list.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Measurable measurable2 = list.get(i5);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "InputField")) {
                                int size2 = list.size();
                                int i6 = 0;
                                while (i6 < size2) {
                                    Measurable measurable3 = list.get(i6);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "Surface")) {
                                        int size3 = list.size();
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= size3) {
                                                measurable = null;
                                                break;
                                            }
                                            measurable = list.get(i7);
                                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "Content")) {
                                                break;
                                            }
                                            i7++;
                                        }
                                        Measurable measurable4 = measurable;
                                        final int top = mutableWindowInsets.getTop(measureScope2) + measureScope2.mo1121roundToPx0680j_4(SearchBar_androidKt.getSearchBarVerticalPadding());
                                        int i8 = measureScope2.mo1121roundToPx0680j_4(SearchBar_androidKt.getSearchBarVerticalPadding());
                                        int iM7025constrainWidthK40F9xA = ConstraintsKt.m7025constrainWidthK40F9xA(j2, measurable2.maxIntrinsicWidth(Constraints.m7007getMaxHeightimpl(j2)));
                                        int iM7024constrainHeightK40F9xA = ConstraintsKt.m7024constrainHeightK40F9xA(j2, measurable2.minIntrinsicHeight(Constraints.m7008getMaxWidthimpl(j2)));
                                        int iRoundToInt = MathKt.roundToInt(Constraints.m7008getMaxWidthimpl(j2) * 0.9f);
                                        int iRoundToInt2 = MathKt.roundToInt(Constraints.m7007getMaxHeightimpl(j2) * 0.9f);
                                        final float fCalculatePredictiveBackMultiplier = SearchBar_androidKt.calculatePredictiveBackMultiplier(mutableState6.getValue(), fFloatValue, mutableFloatState2.getFloatValue());
                                        int iLerp = MathHelpersKt.lerp(iM7025constrainWidthK40F9xA, iRoundToInt, fCalculatePredictiveBackMultiplier);
                                        int i9 = top + iM7024constrainHeightK40F9xA;
                                        int iLerp2 = MathHelpersKt.lerp(i9, iRoundToInt2, fCalculatePredictiveBackMultiplier);
                                        int iM7008getMaxWidthimpl = Constraints.m7008getMaxWidthimpl(j2);
                                        int iM7007getMaxHeightimpl2 = Constraints.m7007getMaxHeightimpl(j2);
                                        int iLerp3 = MathHelpersKt.lerp(iLerp, iM7008getMaxWidthimpl, fFloatValue);
                                        final int iLerp4 = MathHelpersKt.lerp(iLerp2, iM7007getMaxHeightimpl2, fFloatValue);
                                        final int iLerp5 = MathHelpersKt.lerp(top, 0, fFloatValue);
                                        final int iLerp6 = MathHelpersKt.lerp(0, i8, fFloatValue);
                                        final Placeable placeableMo5931measureBRTryo02 = measurable2.mo5931measureBRTryo0(ConstraintsKt.Constraints(iLerp3, iM7008getMaxWidthimpl, iM7024constrainHeightK40F9xA, iM7024constrainHeightK40F9xA));
                                        int width = placeableMo5931measureBRTryo02.getWidth();
                                        final Placeable placeableMo5931measureBRTryo03 = measurable3.mo5931measureBRTryo0(Constraints.INSTANCE.m7018fixedJhjzzOo(width, iLerp4 - iLerp5));
                                        if (measurable4 != null) {
                                            if (Constraints.m7003getHasBoundedHeightimpl(j)) {
                                                i4 = 0;
                                                iM7007getMaxHeightimpl = RangesKt.coerceAtLeast(Constraints.m7007getMaxHeightimpl(j) - (i9 + i8), 0);
                                            } else {
                                                i4 = 0;
                                                iM7007getMaxHeightimpl = Constraints.m7007getMaxHeightimpl(j);
                                            }
                                            placeableMo5931measureBRTryo0 = measurable4.mo5931measureBRTryo0(ConstraintsKt.Constraints(width, width, i4, iM7007getMaxHeightimpl));
                                        } else {
                                            placeableMo5931measureBRTryo0 = null;
                                        }
                                        final MutableState<BackEventCompat> mutableState7 = mutableState6;
                                        final MutableState<BackEventCompat> mutableState8 = mutableState5;
                                        return MeasureScope.layout$default(measureScope, width, iLerp4, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$2$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                int i10 = measureScope.mo1121roundToPx0680j_4(SearchBar_androidKt.SearchBarPredictiveBackMinMargin);
                                                int iM2865calculatePredictiveBackOffsetXrOvwMX4 = SearchBar_androidKt.m2865calculatePredictiveBackOffsetXrOvwMX4(j, i10, mutableState7.getValue(), measureScope.getLayoutDirection(), fFloatValue, fCalculatePredictiveBackMultiplier);
                                                int iM2866calculatePredictiveBackOffsetYdzo92Q0 = SearchBar_androidKt.m2866calculatePredictiveBackOffsetYdzo92Q0(j, i10, mutableState7.getValue(), mutableState8.getValue(), iLerp4, measureScope.mo1121roundToPx0680j_4(SearchBar_androidKt.SearchBarPredictiveBackMaxOffsetY), fCalculatePredictiveBackMultiplier);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5931measureBRTryo03, iM2865calculatePredictiveBackOffsetXrOvwMX4, iM2866calculatePredictiveBackOffsetYdzo92Q0 + iLerp5, 0.0f, 4, null);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5931measureBRTryo02, iM2865calculatePredictiveBackOffsetXrOvwMX4, iM2866calculatePredictiveBackOffsetYdzo92Q0 + top, 0.0f, 4, null);
                                                Placeable placeable = placeableMo5931measureBRTryo0;
                                                if (placeable != null) {
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, iM2865calculatePredictiveBackOffsetXrOvwMX4, iM2866calculatePredictiveBackOffsetYdzo92Q0 + top + placeableMo5931measureBRTryo02.getHeight() + iLerp6, 0.0f, 4, null);
                                                }
                                            }
                                        }, 4, null);
                                    }
                                    i6++;
                                    measureScope2 = measureScope;
                                    j2 = j;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i5++;
                            measureScope2 = measureScope;
                            j2 = j;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(measurePolicyRememberedValue);
            } else {
                i3 = i2;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) measurePolicyRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierConsumeWindowInsets);
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
            Updater.m4095setimpl(composerM4088constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 36789781, "C955@42396L85,956@42494L119:SearchBar.android.kt#uh7d8r");
            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutIdSurface);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
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
            Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1442016074, "C955@42470L9:SearchBar.android.kt#uh7d8r");
            function22.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 21) & 14));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierLayoutId2 = LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutIdInputField);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId2);
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
            Updater.m4095setimpl(composerM4088constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4095setimpl(composerM4088constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4088constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM4088constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM4088constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m4095setimpl(composerM4088constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1442132231, "C957@42587L12:SearchBar.android.kt#uh7d8r");
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i3 >> 18) & 14));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.startReplaceGroup(-1107184481);
            ComposerKt.sourceInformation(composerStartRestartGroup, "*960@42668L127");
            if (function23 != null) {
                Modifier modifierLayoutId3 = LayoutIdKt.layoutId(Modifier.INSTANCE, LayoutIdSearchContent);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId3);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4088constructorimpl4 = Updater.m4088constructorimpl(composerStartRestartGroup);
                Updater.m4095setimpl(composerM4088constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4095setimpl(composerM4088constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4088constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM4088constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM4088constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m4095setimpl(composerM4088constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1302856683, "C961@42768L9:SearchBar.android.kt#uh7d8r");
                function23.invoke(composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SearchBar_androidKt.SearchBarLayout.4
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

                public final void invoke(Composer composer2, int i4) {
                    SearchBar_androidKt.SearchBarLayout(animatable, mutableFloatState, mutableState, mutableState2, modifier, windowInsets, function2, function22, function23, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackMultiplier(BackEventCompat backEventCompat, float f, float f2) {
        if (backEventCompat == null) {
            return 0.0f;
        }
        if (Float.isNaN(f2)) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        return f / f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculatePredictiveBackOffsetX-rOvwMX4, reason: not valid java name */
    public static final int m2865calculatePredictiveBackOffsetXrOvwMX4(long j, int i, BackEventCompat backEventCompat, LayoutDirection layoutDirection, float f, float f2) {
        if (backEventCompat == null || f2 == 0.0f) {
            return 0;
        }
        return MathKt.roundToInt(((Constraints.m7008getMaxWidthimpl(j) * SearchBarPredictiveBackMaxOffsetXRatio) - i) * (1 - f) * f2 * (backEventCompat.getSwipeEdge() == 0 ? 1 : -1) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculatePredictiveBackOffsetY-dzo92Q0, reason: not valid java name */
    public static final int m2866calculatePredictiveBackOffsetYdzo92Q0(long j, int i, BackEventCompat backEventCompat, BackEventCompat backEventCompat2, int i2, int i3, float f) {
        if (backEventCompat2 == null || backEventCompat == null || f == 0.0f) {
            return 0;
        }
        int iMin = Math.min(Math.max(0, ((Constraints.m7007getMaxHeightimpl(j) - i2) / 2) - i), i3);
        float touchY = backEventCompat.getTouchY() - backEventCompat2.getTouchY();
        float fAbs = Math.abs(touchY) / Constraints.m7007getMaxHeightimpl(j);
        return MathKt.roundToInt(MathHelpersKt.lerp(0, iMin, fAbs) * f * Math.signum(touchY));
    }

    static {
        float f = 8;
        SearchBarVerticalPadding = C1959Dp.m7055constructorimpl(f);
        SearchBarPredictiveBackMinMargin = C1959Dp.m7055constructorimpl(f);
        CubicBezierEasing easingEmphasizedDecelerateCubicBezier = MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier();
        AnimationEnterEasing = easingEmphasizedDecelerateCubicBezier;
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.0f, 1.0f, 0.0f, 1.0f);
        AnimationExitEasing = cubicBezierEasing;
        TweenSpec tweenSpecTween = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterFloatSpec = tweenSpecTween;
        TweenSpec tweenSpecTween2 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitFloatSpec = tweenSpecTween2;
        AnimationPredictiveBackExitFloatSpec = AnimationSpecKt.tween$default(AnimationExitDurationMillis, 0, cubicBezierEasing, 2, null);
        TweenSpec tweenSpecTween3 = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterSizeSpec = tweenSpecTween3;
        TweenSpec tweenSpecTween4 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitSizeSpec = tweenSpecTween4;
        DockedEnterTransition = EnterExitTransitionKt.fadeIn$default(tweenSpecTween, 0.0f, 2, null).plus(EnterExitTransitionKt.expandVertically$default(tweenSpecTween3, null, false, null, 14, null));
        DockedExitTransition = EnterExitTransitionKt.fadeOut$default(tweenSpecTween2, 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkVertically$default(tweenSpecTween4, null, false, null, 14, null));
    }

    public static final float getDockedExpandedTableMinHeight() {
        return DockedExpandedTableMinHeight;
    }

    public static final float getSearchBarMinWidth() {
        return SearchBarMinWidth;
    }

    public static final float getSearchBarVerticalPadding() {
        return SearchBarVerticalPadding;
    }

    private static final boolean SearchBarImpl_j1jLAyQ$lambda$9(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final boolean SearchBarImpl_j1jLAyQ$lambda$12(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
