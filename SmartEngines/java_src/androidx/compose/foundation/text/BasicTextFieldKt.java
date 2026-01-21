package androidx.compose.foundation.text;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.foundation.text.input.internal.SingleLineCodepointTransformation;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifier;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifier;
import androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifier;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.graphics.Brush;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.SolidColor;
import androidx.compose.p000ui.hapticfeedback.HapticFeedback;
import androidx.compose.p000ui.input.pointer.PointerIconKt;
import androidx.compose.p000ui.input.pointer.PointerInputScope;
import androidx.compose.p000ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.ClipboardManager;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.platform.TextToolbar;
import androidx.compose.p000ui.platform.WindowInfo;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextRange;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.input.ImeOptions;
import androidx.compose.p000ui.text.input.TextFieldValue;
import androidx.compose.p000ui.text.input.VisualTransformation;
import androidx.compose.p000ui.text.style.ResolvedTextDirection;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.p000ui.unit.Density;
import androidx.compose.p000ui.unit.DpKt;
import androidx.compose.p000ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jmrtd.lds.LDSFile;

/* compiled from: BasicTextField.kt */
@Metadata(m513d1 = {"\u0000Ê\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÛ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u001728\b\u0002\u0010\u0018\u001a2\u0012\u0004\u0012\u00020\u001a\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019¢\u0006\u0002\b 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010(\u001a\u00020)H\u0007¢\u0006\u0002\u0010*\u001añ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u001728\b\u0002\u0010\u0018\u001a2\u0012\u0004\u0012\u00020\u001a\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019¢\u0006\u0002\b 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010-\u001a\u00020\fH\u0001¢\u0006\u0002\u0010.\u001aâ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\f2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$23\b\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b;¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b;H\u0007¢\u0006\u0002\u0010=\u001aî\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\f2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u0010>\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$23\b\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b;¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b;H\u0007¢\u0006\u0002\u0010?\u001aâ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u00020@2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\f2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$23\b\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b;¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b;H\u0007¢\u0006\u0002\u0010A\u001aî\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u00020@2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\f2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u0010>\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$23\b\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b;¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b;H\u0007¢\u0006\u0002\u0010B\u001a\u0015\u0010C\u001a\u00020\u00062\u0006\u0010D\u001a\u00020EH\u0001¢\u0006\u0002\u0010F\u001a\u0015\u0010G\u001a\u00020\u00062\u0006\u0010D\u001a\u00020EH\u0001¢\u0006\u0002\u0010F\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006H²\u0006\n\u0010I\u001a\u00020JX\u008a\u0084\u0002²\u0006\n\u0010K\u001a\u00020JX\u008a\u0084\u0002²\u0006\n\u0010L\u001a\u00020JX\u008a\u0084\u0002²\u0006\n\u0010M\u001a\u000200X\u008a\u008e\u0002²\u0006\n\u0010N\u001a\u00020@X\u008a\u008e\u0002"}, m514d2 = {"DefaultTextFieldDecorator", "Landroidx/compose/foundation/text/input/TextFieldDecorator;", "MinTouchTargetSizeForHandles", "Landroidx/compose/ui/unit/DpSize;", "J", "BasicTextField", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "lineLimits", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "getResult", "Lkotlin/ExtensionFunctionType;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "decorator", "scrollState", "Landroidx/compose/foundation/ScrollState;", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V", "codepointTransformation", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "isPassword", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/internal/CodepointTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/runtime/Composer;III)V", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "decorationBox", "Landroidx/compose/runtime/Composable;", "innerTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "minLines", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "TextFieldCursorHandle", "selectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/runtime/Composer;I)V", "TextFieldSelectionHandles", "foundation_release", "cursorHandleState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "startHandleState", "endHandleState", "textFieldValueState", "lastTextValue"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class BasicTextFieldKt {
    private static final TextFieldDecorator DefaultTextFieldDecorator = BasicTextFieldKt$DefaultTextFieldDecorator$1.INSTANCE;
    private static final long MinTouchTargetSizeForHandles;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2, MutableInteractionSource mutableInteractionSource, Brush brush, OutputTransformation outputTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        InputTransformation inputTransformation2;
        int i8;
        TextStyle textStyle2;
        int i9;
        KeyboardOptions keyboardOptions2;
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
        int i23;
        KeyboardOptions keyboardOptions3;
        TextFieldLineLimits textFieldLineLimits2;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function22;
        TextFieldDecorator textFieldDecorator2;
        TextStyle textStyle3;
        KeyboardActionHandler keyboardActionHandler2;
        MutableInteractionSource mutableInteractionSource2;
        OutputTransformation outputTransformation2;
        Brush brush2;
        ScrollState scrollStateRememberScrollState;
        Composer composer2;
        final Modifier modifier3;
        final boolean z5;
        final boolean z6;
        final InputTransformation inputTransformation3;
        final TextStyle textStyle4;
        final KeyboardOptions keyboardOptions4;
        final KeyboardActionHandler keyboardActionHandler3;
        final TextFieldLineLimits textFieldLineLimits3;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function23;
        final MutableInteractionSource mutableInteractionSource3;
        final Brush brush3;
        final OutputTransformation outputTransformation3;
        final TextFieldDecorator textFieldDecorator3;
        final ScrollState scrollState2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(469439921);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicTextField)P(13,7,2,11,3,14,5,8,6,9,4!1,10)184@10988L21,188@11134L610:BasicTextField.kt#423gt5");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(textFieldState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i24 = i3 & 2;
        if (i24 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z3 = z;
                    i4 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        z4 = z2;
                        i4 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    int i25 = 8192;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            inputTransformation2 = inputTransformation;
                            i4 |= composerStartRestartGroup.changed(inputTransformation2) ? 16384 : 8192;
                        }
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                            textStyle2 = textStyle;
                        } else {
                            textStyle2 = textStyle;
                            if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                                i4 |= composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536;
                            }
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                            keyboardOptions2 = keyboardOptions;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                            if ((i & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288;
                            }
                        }
                        i10 = i3 & 128;
                        if (i10 != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changed(keyboardActionHandler) ? 8388608 : 4194304;
                        }
                        i11 = i3 & 256;
                        if (i11 != 0) {
                            i4 |= 100663296;
                        } else {
                            if ((i & 100663296) == 0) {
                                i12 = i11;
                                i4 |= composerStartRestartGroup.changed(textFieldLineLimits) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            i13 = i3 & 512;
                            if (i13 != 0) {
                                if ((i & 805306368) == 0) {
                                    i14 = i13;
                                    i4 |= composerStartRestartGroup.changedInstance(function2) ? PKIFailureInfo.duplicateCertReq : 268435456;
                                }
                                i15 = i3 & 1024;
                                if (i15 != 0) {
                                    i17 = i2 | 6;
                                    i16 = i15;
                                } else if ((i2 & 6) == 0) {
                                    i16 = i15;
                                    i17 = i2 | (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                                } else {
                                    i16 = i15;
                                    i17 = i2;
                                }
                                i18 = i3 & 2048;
                                if (i18 != 0) {
                                    i17 |= 48;
                                    i19 = i18;
                                } else if ((i2 & 48) == 0) {
                                    i19 = i18;
                                    i17 |= composerStartRestartGroup.changed(brush) ? 32 : 16;
                                } else {
                                    i19 = i18;
                                }
                                int i26 = i17;
                                i20 = i3 & 4096;
                                if (i20 != 0) {
                                    i21 = i26 | 384;
                                } else if ((i2 & 384) == 0) {
                                    i21 = i26 | (composerStartRestartGroup.changed(outputTransformation) ? 256 : 128);
                                } else {
                                    i21 = i26;
                                }
                                i22 = i3 & 8192;
                                if (i22 != 0) {
                                    i23 = i21 | 3072;
                                } else {
                                    int i27 = i21;
                                    if ((i2 & 3072) == 0) {
                                        i23 = i27 | ((i2 & 4096) == 0 ? composerStartRestartGroup.changed(textFieldDecorator) : composerStartRestartGroup.changedInstance(textFieldDecorator) ? 2048 : 1024);
                                    } else {
                                        i23 = i27;
                                    }
                                }
                                if ((i2 & 24576) == 0) {
                                    if ((i3 & 16384) == 0 && composerStartRestartGroup.changed(scrollState)) {
                                        i25 = 16384;
                                    }
                                    i23 |= i25;
                                }
                                if ((i4 & 306783379) != 306783378 || (i23 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if (i24 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i5 != 0) {
                                            z3 = true;
                                        }
                                        if (i6 != 0) {
                                            z4 = false;
                                        }
                                        if (i7 != 0) {
                                            inputTransformation2 = null;
                                        }
                                        if (i8 != 0) {
                                            textStyle2 = TextStyle.INSTANCE.getDefault();
                                        }
                                        keyboardOptions3 = i9 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions2;
                                        KeyboardActionHandler keyboardActionHandler4 = i10 == 0 ? null : keyboardActionHandler;
                                        textFieldLineLimits2 = i12 == 0 ? TextFieldLineLimits.INSTANCE.getDefault() : textFieldLineLimits;
                                        function22 = i14 == 0 ? null : function2;
                                        MutableInteractionSource mutableInteractionSource4 = i16 == 0 ? null : mutableInteractionSource;
                                        SolidColor cursorBrush = i19 == 0 ? BasicTextFieldDefaults.INSTANCE.getCursorBrush() : brush;
                                        OutputTransformation outputTransformation4 = i20 == 0 ? null : outputTransformation;
                                        TextFieldDecorator textFieldDecorator4 = i22 == 0 ? textFieldDecorator : null;
                                        if ((i3 & 16384) == 0) {
                                            i23 &= -57345;
                                            Brush brush4 = cursorBrush;
                                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                                            outputTransformation2 = outputTransformation4;
                                            brush2 = brush4;
                                            MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                                            textFieldDecorator2 = textFieldDecorator4;
                                            textStyle3 = textStyle2;
                                            keyboardActionHandler2 = keyboardActionHandler4;
                                            mutableInteractionSource2 = mutableInteractionSource5;
                                        } else {
                                            MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource4;
                                            textFieldDecorator2 = textFieldDecorator4;
                                            textStyle3 = textStyle2;
                                            keyboardActionHandler2 = keyboardActionHandler4;
                                            mutableInteractionSource2 = mutableInteractionSource6;
                                            outputTransformation2 = outputTransformation4;
                                            brush2 = cursorBrush;
                                            scrollStateRememberScrollState = scrollState;
                                        }
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i3 & 16384) != 0) {
                                            i23 &= -57345;
                                        }
                                        textFieldLineLimits2 = textFieldLineLimits;
                                        function22 = function2;
                                        brush2 = brush;
                                        outputTransformation2 = outputTransformation;
                                        textFieldDecorator2 = textFieldDecorator;
                                        scrollStateRememberScrollState = scrollState;
                                        textStyle3 = textStyle2;
                                        keyboardOptions3 = keyboardOptions2;
                                        keyboardActionHandler2 = keyboardActionHandler;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(469439921, i4, i23, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:187)");
                                    }
                                    int i28 = (i23 & 14) | 384 | (i23 & LDSFile.EF_DG16_TAG);
                                    int i29 = i23 << 3;
                                    Modifier modifier4 = modifier2;
                                    TextFieldLineLimits textFieldLineLimits4 = textFieldLineLimits2;
                                    composer2 = composerStartRestartGroup;
                                    InputTransformation inputTransformation4 = inputTransformation2;
                                    KeyboardOptions keyboardOptions5 = keyboardOptions3;
                                    Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function24 = function22;
                                    OutputTransformation outputTransformation5 = outputTransformation2;
                                    BasicTextField(textFieldState, modifier4, z3, z4, inputTransformation4, textStyle3, keyboardOptions5, keyboardActionHandler2, textFieldLineLimits4, function24, mutableInteractionSource2, brush2, null, outputTransformation5, textFieldDecorator2, scrollStateRememberScrollState, false, composer2, i4 & 2147483646, i28 | (i29 & 7168) | (57344 & i29) | (i29 & 458752), 65536);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    z5 = z3;
                                    z6 = z4;
                                    inputTransformation3 = inputTransformation4;
                                    textStyle4 = textStyle3;
                                    keyboardOptions4 = keyboardOptions5;
                                    keyboardActionHandler3 = keyboardActionHandler2;
                                    textFieldLineLimits3 = textFieldLineLimits4;
                                    function23 = function24;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    brush3 = brush2;
                                    outputTransformation3 = outputTransformation5;
                                    textFieldDecorator3 = textFieldDecorator2;
                                    scrollState2 = scrollStateRememberScrollState;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    textFieldLineLimits3 = textFieldLineLimits;
                                    function23 = function2;
                                    textFieldDecorator3 = textFieldDecorator;
                                    composer2 = composerStartRestartGroup;
                                    z5 = z3;
                                    z6 = z4;
                                    inputTransformation3 = inputTransformation2;
                                    textStyle4 = textStyle2;
                                    modifier3 = modifier2;
                                    keyboardOptions4 = keyboardOptions2;
                                    keyboardActionHandler3 = keyboardActionHandler;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    brush3 = brush;
                                    outputTransformation3 = outputTransformation;
                                    scrollState2 = scrollState;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.1
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

                                        public final void invoke(Composer composer3, int i30) {
                                            BasicTextFieldKt.BasicTextField(textFieldState, modifier3, z5, z6, inputTransformation3, textStyle4, keyboardOptions4, keyboardActionHandler3, textFieldLineLimits3, function23, mutableInteractionSource3, brush3, outputTransformation3, textFieldDecorator3, scrollState2, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i4 |= 805306368;
                            i14 = i13;
                            i15 = i3 & 1024;
                            if (i15 != 0) {
                            }
                            i18 = i3 & 2048;
                            if (i18 != 0) {
                            }
                            int i262 = i17;
                            i20 = i3 & 4096;
                            if (i20 != 0) {
                            }
                            i22 = i3 & 8192;
                            if (i22 != 0) {
                            }
                            if ((i2 & 24576) == 0) {
                            }
                            if ((i4 & 306783379) != 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if (i24 != 0) {
                                    }
                                    if (i5 != 0) {
                                    }
                                    if (i6 != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    if (i20 == 0) {
                                    }
                                    if (i22 == 0) {
                                    }
                                    if ((i3 & 16384) == 0) {
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    int i282 = (i23 & 14) | 384 | (i23 & LDSFile.EF_DG16_TAG);
                                    int i292 = i23 << 3;
                                    Modifier modifier42 = modifier2;
                                    TextFieldLineLimits textFieldLineLimits42 = textFieldLineLimits2;
                                    composer2 = composerStartRestartGroup;
                                    InputTransformation inputTransformation42 = inputTransformation2;
                                    KeyboardOptions keyboardOptions52 = keyboardOptions3;
                                    Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function242 = function22;
                                    OutputTransformation outputTransformation52 = outputTransformation2;
                                    BasicTextField(textFieldState, modifier42, z3, z4, inputTransformation42, textStyle3, keyboardOptions52, keyboardActionHandler2, textFieldLineLimits42, function242, mutableInteractionSource2, brush2, null, outputTransformation52, textFieldDecorator2, scrollStateRememberScrollState, false, composer2, i4 & 2147483646, i282 | (i292 & 7168) | (57344 & i292) | (i292 & 458752), 65536);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier42;
                                    z5 = z3;
                                    z6 = z4;
                                    inputTransformation3 = inputTransformation42;
                                    textStyle4 = textStyle3;
                                    keyboardOptions4 = keyboardOptions52;
                                    keyboardActionHandler3 = keyboardActionHandler2;
                                    textFieldLineLimits3 = textFieldLineLimits42;
                                    function23 = function242;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    brush3 = brush2;
                                    outputTransformation3 = outputTransformation52;
                                    textFieldDecorator3 = textFieldDecorator2;
                                    scrollState2 = scrollStateRememberScrollState;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i12 = i11;
                        i13 = i3 & 512;
                        if (i13 != 0) {
                        }
                        i14 = i13;
                        i15 = i3 & 1024;
                        if (i15 != 0) {
                        }
                        i18 = i3 & 2048;
                        if (i18 != 0) {
                        }
                        int i2622 = i17;
                        i20 = i3 & 4096;
                        if (i20 != 0) {
                        }
                        i22 = i3 & 8192;
                        if (i22 != 0) {
                        }
                        if ((i2 & 24576) == 0) {
                        }
                        if ((i4 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    inputTransformation2 = inputTransformation;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i3 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    i13 = i3 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    i15 = i3 & 1024;
                    if (i15 != 0) {
                    }
                    i18 = i3 & 2048;
                    if (i18 != 0) {
                    }
                    int i26222 = i17;
                    i20 = i3 & 4096;
                    if (i20 != 0) {
                    }
                    i22 = i3 & 8192;
                    if (i22 != 0) {
                    }
                    if ((i2 & 24576) == 0) {
                    }
                    if ((i4 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z4 = z2;
                i7 = i3 & 16;
                int i252 = 8192;
                if (i7 == 0) {
                }
                inputTransformation2 = inputTransformation;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i3 & 512;
                if (i13 != 0) {
                }
                i14 = i13;
                i15 = i3 & 1024;
                if (i15 != 0) {
                }
                i18 = i3 & 2048;
                if (i18 != 0) {
                }
                int i262222 = i17;
                i20 = i3 & 4096;
                if (i20 != 0) {
                }
                i22 = i3 & 8192;
                if (i22 != 0) {
                }
                if ((i2 & 24576) == 0) {
                }
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z3 = z;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            z4 = z2;
            i7 = i3 & 16;
            int i2522 = 8192;
            if (i7 == 0) {
            }
            inputTransformation2 = inputTransformation;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i3 & 512;
            if (i13 != 0) {
            }
            i14 = i13;
            i15 = i3 & 1024;
            if (i15 != 0) {
            }
            i18 = i3 & 2048;
            if (i18 != 0) {
            }
            int i2622222 = i17;
            i20 = i3 & 4096;
            if (i20 != 0) {
            }
            i22 = i3 & 8192;
            if (i22 != 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z3 = z;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        z4 = z2;
        i7 = i3 & 16;
        int i25222 = 8192;
        if (i7 == 0) {
        }
        inputTransformation2 = inputTransformation;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i3 & 512;
        if (i13 != 0) {
        }
        i14 = i13;
        i15 = i3 & 1024;
        if (i15 != 0) {
        }
        i18 = i3 & 2048;
        if (i18 != 0) {
        }
        int i26222222 = i17;
        i20 = i3 & 4096;
        if (i20 != 0) {
        }
        i22 = i3 & 8192;
        if (i22 != 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:356:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, InputTransformation inputTransformation, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2, MutableInteractionSource mutableInteractionSource, Brush brush, CodepointTransformation codepointTransformation, OutputTransformation outputTransformation, TextFieldDecorator textFieldDecorator, ScrollState scrollState, boolean z3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        InputTransformation inputTransformation2;
        int i8;
        TextStyle textStyle2;
        int i9;
        KeyboardOptions keyboardOptions2;
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
        int i23;
        int i24;
        int i25;
        int i26;
        TextFieldLineLimits textFieldLineLimits2;
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function22;
        MutableInteractionSource mutableInteractionSource2;
        SolidColor cursorBrush;
        CodepointTransformation codepointTransformation2;
        ScrollState scrollStateRememberScrollState;
        int i27;
        TextFieldDecorator textFieldDecorator2;
        OutputTransformation outputTransformation2;
        boolean z6;
        int i28;
        KeyboardActionHandler keyboardActionHandler2;
        Density density;
        boolean z7;
        WindowInfo windowInfo;
        MutableInteractionSource mutableInteractionSource3;
        final boolean zBooleanValue;
        final boolean zIsWindowFocused;
        boolean z8;
        Object objRememberedValue;
        SingleLineCodepointTransformation singleLineCodepointTransformation;
        TransformedTextFieldState transformedTextFieldState;
        boolean zChanged;
        Object objRememberedValue2;
        TextLayoutState textLayoutState;
        boolean zChanged2;
        Object objRememberedValue3;
        Density density2;
        boolean z9;
        boolean z10;
        boolean z11;
        final TextFieldSelectionState textFieldSelectionState;
        final InputTransformation inputTransformation3;
        final HapticFeedback hapticFeedback;
        final ClipboardManager clipboardManager;
        final TextToolbar textToolbar;
        boolean zChanged3;
        InputTransformation inputTransformation4;
        final TextFieldSelectionState textFieldSelectionState2;
        Object obj;
        boolean zChangedInstance;
        Object objRememberedValue4;
        int currentCompositeKeyHash;
        Composer composerM4088constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final InputTransformation inputTransformation5;
        final TextStyle textStyle3;
        final boolean z12;
        final MutableInteractionSource mutableInteractionSource4;
        final CodepointTransformation codepointTransformation3;
        final ScrollState scrollState2;
        final boolean z13;
        final TextFieldLineLimits textFieldLineLimits3;
        final boolean z14;
        final OutputTransformation outputTransformation3;
        final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function23;
        final KeyboardActionHandler keyboardActionHandler3;
        final KeyboardOptions keyboardOptions3;
        final TextFieldDecorator textFieldDecorator3;
        final Modifier modifier3;
        final Brush brush2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(965149429);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicTextField)P(15,9,3,13,4,16,7,10,8,11,5,1!1,12!1,14)234@12943L21,239@13149L7,240@13204L7,241@13249L7,247@13619L25,248@13693L25,251@13806L797,271@14801L48,273@14885L357,284@15295L7,285@15359L7,286@15413L7,287@15436L520,287@15425L531,303@16004L83,303@15962L125,342@17504L3096:BasicTextField.kt#423gt5");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(textFieldState) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i29 = i3 & 2;
        if (i29 != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z4 = z;
                    i4 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        z5 = z2;
                        i4 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            inputTransformation2 = inputTransformation;
                            i4 |= composerStartRestartGroup.changed(inputTransformation2) ? 16384 : 8192;
                        }
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                            textStyle2 = textStyle;
                        } else {
                            textStyle2 = textStyle;
                            if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                                i4 |= composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536;
                            }
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                            keyboardOptions2 = keyboardOptions;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                            if ((i & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288;
                            }
                        }
                        i10 = i3 & 128;
                        if (i10 != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changed(keyboardActionHandler) ? 8388608 : 4194304;
                        }
                        i11 = i3 & 256;
                        if (i11 != 0) {
                            i4 |= 100663296;
                        } else {
                            if ((i & 100663296) == 0) {
                                i12 = i11;
                                i4 |= composerStartRestartGroup.changed(textFieldLineLimits) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            i13 = i3 & 512;
                            if (i13 != 0) {
                                if ((i & 805306368) == 0) {
                                    i14 = i13;
                                    i4 |= composerStartRestartGroup.changedInstance(function2) ? PKIFailureInfo.duplicateCertReq : 268435456;
                                }
                                i15 = i3 & 1024;
                                if (i15 != 0) {
                                    i17 = i2 | 6;
                                    i16 = i15;
                                } else if ((i2 & 6) == 0) {
                                    i16 = i15;
                                    i17 = i2 | (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                                } else {
                                    i16 = i15;
                                    i17 = i2;
                                }
                                i18 = i3 & 2048;
                                if (i18 != 0) {
                                    i17 |= 48;
                                    i19 = i18;
                                } else if ((i2 & 48) == 0) {
                                    i19 = i18;
                                    i17 |= composerStartRestartGroup.changed(brush) ? 32 : 16;
                                } else {
                                    i19 = i18;
                                }
                                int i30 = i17;
                                i20 = i3 & 4096;
                                if (i20 != 0) {
                                    i21 = i30 | 384;
                                } else if ((i2 & 384) == 0) {
                                    i21 = i30 | (composerStartRestartGroup.changed(codepointTransformation) ? 256 : 128);
                                } else {
                                    i21 = i30;
                                }
                                i22 = i3 & 8192;
                                if (i22 != 0) {
                                    i23 = i21 | 3072;
                                } else {
                                    int i31 = i21;
                                    if ((i2 & 3072) == 0) {
                                        i23 = i31 | (composerStartRestartGroup.changed(outputTransformation) ? 2048 : 1024);
                                    } else {
                                        i23 = i31;
                                    }
                                }
                                i24 = i3 & 16384;
                                if (i24 != 0) {
                                    i25 = i23 | 24576;
                                } else {
                                    int i32 = i23;
                                    if ((i2 & 24576) == 0) {
                                        i25 = i32 | ((i2 & 32768) == 0 ? composerStartRestartGroup.changed(textFieldDecorator) : composerStartRestartGroup.changedInstance(textFieldDecorator) ? 16384 : 8192);
                                    } else {
                                        i25 = i32;
                                    }
                                }
                                if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                                    i25 |= ((i3 & 32768) == 0 && composerStartRestartGroup.changed(scrollState)) ? 131072 : 65536;
                                }
                                i26 = i3 & 65536;
                                if (i26 != 0) {
                                    i25 |= 1572864;
                                } else if ((i2 & 1572864) == 0) {
                                    i25 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                                }
                                int i33 = i25;
                                if ((i4 & 306783379) != 306783378 || (i33 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if (i29 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i5 != 0) {
                                            z4 = true;
                                        }
                                        if (i6 != 0) {
                                            z5 = false;
                                        }
                                        if (i7 != 0) {
                                            inputTransformation2 = null;
                                        }
                                        if (i8 != 0) {
                                            textStyle2 = TextStyle.INSTANCE.getDefault();
                                        }
                                        if (i9 != 0) {
                                            keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                                        }
                                        KeyboardActionHandler keyboardActionHandler4 = i10 == 0 ? null : keyboardActionHandler;
                                        textFieldLineLimits2 = i12 == 0 ? TextFieldLineLimits.INSTANCE.getDefault() : textFieldLineLimits;
                                        function22 = i14 == 0 ? null : function2;
                                        mutableInteractionSource2 = i16 == 0 ? null : mutableInteractionSource;
                                        cursorBrush = i19 == 0 ? BasicTextFieldDefaults.INSTANCE.getCursorBrush() : brush;
                                        codepointTransformation2 = i20 == 0 ? null : codepointTransformation;
                                        OutputTransformation outputTransformation4 = i22 == 0 ? null : outputTransformation;
                                        TextFieldDecorator textFieldDecorator4 = i24 == 0 ? null : textFieldDecorator;
                                        KeyboardActionHandler keyboardActionHandler5 = keyboardActionHandler4;
                                        if ((i3 & 32768) == 0) {
                                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                                            i27 = i33 & (-458753);
                                        } else {
                                            scrollStateRememberScrollState = scrollState;
                                            i27 = i33;
                                        }
                                        OutputTransformation outputTransformation5 = outputTransformation4;
                                        textFieldDecorator2 = textFieldDecorator4;
                                        outputTransformation2 = outputTransformation5;
                                        if (i26 == 0) {
                                            i28 = i27;
                                            z6 = false;
                                        } else {
                                            z6 = z3;
                                            i28 = i27;
                                        }
                                        keyboardActionHandler2 = keyboardActionHandler5;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i3 & 32768) != 0) {
                                            textFieldLineLimits2 = textFieldLineLimits;
                                            function22 = function2;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                            cursorBrush = brush;
                                            codepointTransformation2 = codepointTransformation;
                                            outputTransformation2 = outputTransformation;
                                            textFieldDecorator2 = textFieldDecorator;
                                            scrollStateRememberScrollState = scrollState;
                                            z6 = z3;
                                            i28 = i33 & (-458753);
                                            keyboardActionHandler2 = keyboardActionHandler;
                                        } else {
                                            keyboardActionHandler2 = keyboardActionHandler;
                                            textFieldLineLimits2 = textFieldLineLimits;
                                            function22 = function2;
                                            mutableInteractionSource2 = mutableInteractionSource;
                                            cursorBrush = brush;
                                            codepointTransformation2 = codepointTransformation;
                                            outputTransformation2 = outputTransformation;
                                            textFieldDecorator2 = textFieldDecorator;
                                            scrollStateRememberScrollState = scrollState;
                                            z6 = z3;
                                            i28 = i33;
                                        }
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    KeyboardActionHandler keyboardActionHandler6 = keyboardActionHandler2;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(965149429, i4, i28, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:238)");
                                    }
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume = composerStartRestartGroup.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    density = (Density) objConsume;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume2 = composerStartRestartGroup.consume(localLayoutDirection);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
                                    z7 = z4;
                                    ProvidableCompositionLocal<WindowInfo> localWindowInfo = CompositionLocalsKt.getLocalWindowInfo();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume3 = composerStartRestartGroup.consume(localWindowInfo);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    WindowInfo windowInfo2 = (WindowInfo) objConsume3;
                                    final boolean zAreEqual = Intrinsics.areEqual(textFieldLineLimits2, TextFieldLineLimits.SingleLine.INSTANCE);
                                    final TextFieldLineLimits textFieldLineLimits4 = textFieldLineLimits2;
                                    if (mutableInteractionSource2 != null) {
                                        composerStartRestartGroup.startReplaceGroup(96938805);
                                        ComposerKt.sourceInformation(composerStartRestartGroup, "245@13454L39");
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243798931, "CC(remember):BasicTextField.kt#9igjgp");
                                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                        windowInfo = windowInfo2;
                                        if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        composerStartRestartGroup.endReplaceGroup();
                                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue5;
                                    } else {
                                        windowInfo = windowInfo2;
                                        composerStartRestartGroup.startReplaceGroup(-1243799582);
                                        composerStartRestartGroup.endReplaceGroup();
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                    }
                                    Orientation orientation = !zAreEqual ? Orientation.Horizontal : Orientation.Vertical;
                                    MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                    final TextStyle textStyle4 = textStyle2;
                                    zBooleanValue = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource5, composerStartRestartGroup, 0).getValue().booleanValue();
                                    final boolean zBooleanValue2 = HoverInteractionKt.collectIsHoveredAsState(mutableInteractionSource5, composerStartRestartGroup, 0).getValue().booleanValue();
                                    zIsWindowFocused = windowInfo.isWindowFocused();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243786909, "CC(remember):BasicTextField.kt#9igjgp");
                                    int i34 = i28;
                                    z8 = ((i28 & 7168) != 2048) | ((i4 & 14) != 4) | ((i28 & 896) != 256);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (!z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        if (codepointTransformation2 != null) {
                                            SingleLineCodepointTransformation singleLineCodepointTransformation2 = SingleLineCodepointTransformation.INSTANCE;
                                            if (!zAreEqual) {
                                                singleLineCodepointTransformation2 = null;
                                            }
                                            singleLineCodepointTransformation = singleLineCodepointTransformation2;
                                        } else {
                                            singleLineCodepointTransformation = codepointTransformation2;
                                        }
                                        objRememberedValue = new TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation, outputTransformation2);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    transformedTextFieldState = (TransformedTextFieldState) objRememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243755818, "CC(remember):BasicTextField.kt#9igjgp");
                                    zChanged = composerStartRestartGroup.changed(transformedTextFieldState);
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new TextLayoutState();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    textLayoutState = (TextLayoutState) objRememberedValue2;
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243752821, "CC(remember):BasicTextField.kt#9igjgp");
                                    zChanged2 = composerStartRestartGroup.changed(transformedTextFieldState);
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        boolean z15 = z5;
                                        boolean z16 = z6;
                                        objRememberedValue3 = new TextFieldSelectionState(transformedTextFieldState, textLayoutState, density, z7, z15, !zBooleanValue && zIsWindowFocused, z16);
                                        transformedTextFieldState = transformedTextFieldState;
                                        textLayoutState = textLayoutState;
                                        density2 = density;
                                        z9 = z7;
                                        z10 = z15;
                                        z11 = z16;
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    } else {
                                        density2 = density;
                                        z11 = z6;
                                        z10 = z5;
                                        z9 = z7;
                                    }
                                    textFieldSelectionState = (TextFieldSelectionState) objRememberedValue3;
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    OutputTransformation outputTransformation6 = outputTransformation2;
                                    ProvidableCompositionLocal<HapticFeedback> localHapticFeedback = CompositionLocalsKt.getLocalHapticFeedback();
                                    inputTransformation3 = inputTransformation2;
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume4 = composerStartRestartGroup.consume(localHapticFeedback);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    hapticFeedback = (HapticFeedback) objConsume4;
                                    final TextLayoutState textLayoutState2 = textLayoutState;
                                    ProvidableCompositionLocal<ClipboardManager> localClipboardManager = CompositionLocalsKt.getLocalClipboardManager();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume5 = composerStartRestartGroup.consume(localClipboardManager);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    clipboardManager = (ClipboardManager) objConsume5;
                                    final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function24 = function22;
                                    ProvidableCompositionLocal<TextToolbar> localTextToolbar = CompositionLocalsKt.getLocalTextToolbar();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume6 = composerStartRestartGroup.consume(localTextToolbar);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    textToolbar = (TextToolbar) objConsume6;
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243735026, "CC(remember):BasicTextField.kt#9igjgp");
                                    zChanged3 = ((i4 & 896) != 256) | composerStartRestartGroup.changed(transformedTextFieldState) | ((57344 & i4) != 16384) | composerStartRestartGroup.changedInstance(textFieldSelectionState) | composerStartRestartGroup.changedInstance(hapticFeedback) | composerStartRestartGroup.changedInstance(clipboardManager) | composerStartRestartGroup.changedInstance(textToolbar) | composerStartRestartGroup.changed(density2) | ((i4 & 7168) != 2048) | ((i34 & 3670016) != 1048576);
                                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged3 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        final Density density3 = density2;
                                        final TransformedTextFieldState transformedTextFieldState2 = transformedTextFieldState;
                                        final boolean z17 = z9;
                                        final boolean z18 = z10;
                                        final boolean z19 = z11;
                                        Object obj2 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1
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
                                                transformedTextFieldState2.update(inputTransformation3);
                                                textFieldSelectionState.update(hapticFeedback, clipboardManager, textToolbar, density3, z17, z18, z19);
                                            }
                                        };
                                        inputTransformation4 = inputTransformation3;
                                        textFieldSelectionState2 = textFieldSelectionState;
                                        obj = (Function0) obj2;
                                        composerStartRestartGroup.updateRememberedValue(obj);
                                    } else {
                                        textFieldSelectionState2 = textFieldSelectionState;
                                        obj = objRememberedValue6;
                                        inputTransformation4 = inputTransformation3;
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    EffectsKt.SideEffect((Function0) obj, composerStartRestartGroup, 0);
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243717287, "CC(remember):BasicTextField.kt#9igjgp");
                                    zChangedInstance = composerStartRestartGroup.changedInstance(textFieldSelectionState2);
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (!zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                final TextFieldSelectionState textFieldSelectionState3 = textFieldSelectionState2;
                                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1$invoke$$inlined$onDispose$1
                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                    public void dispose() {
                                                        textFieldSelectionState3.dispose();
                                                    }
                                                };
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    EffectsKt.DisposableEffect(textFieldSelectionState2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
                                    final TextFieldSelectionState textFieldSelectionState3 = textFieldSelectionState2;
                                    MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                                    final Orientation orientation2 = orientation;
                                    Modifier modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(ScrollableKt.scrollable$default(FocusableKt.focusable(modifier2.then(new TextFieldDecoratorModifier(transformedTextFieldState, textLayoutState2, textFieldSelectionState3, inputTransformation4, z9, z10, keyboardOptions2, keyboardActionHandler6, zAreEqual, mutableInteractionSource6)), z9, mutableInteractionSource6), scrollStateRememberScrollState, orientation2, !z9 && textFieldSelectionState3.getDirectDragGestureInitiator() == TextFieldSelectionState.InputType.None, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection, orientation, false), null, mutableInteractionSource6, 16, null), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPointerHoverIcon$default);
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (!composerStartRestartGroup.getInserting()) {
                                        composerStartRestartGroup.createNode(constructor);
                                    } else {
                                        composerStartRestartGroup.useNode();
                                    }
                                    composerM4088constructorimpl = Updater.m4088constructorimpl(composerStartRestartGroup);
                                    Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1236622543, "C343@17621L2973,343@17571L3023:BasicTextField.kt#423gt5");
                                    final TransformedTextFieldState transformedTextFieldState3 = transformedTextFieldState;
                                    final boolean z20 = z9;
                                    final TextFieldDecorator textFieldDecorator5 = textFieldDecorator2;
                                    final Brush brush3 = cursorBrush;
                                    final ScrollState scrollState3 = scrollStateRememberScrollState;
                                    final boolean z21 = z10;
                                    ContextMenu_androidKt.ContextMenuArea(textFieldSelectionState3, z9, ComposableLambdaKt.rememberComposableLambda(-673241599, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
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

                                        public final void invoke(Composer composer3, int i35) {
                                            ComposerKt.sourceInformation(composer3, "C345@17737L2847,345@17726L2858:BasicTextField.kt#423gt5");
                                            if ((i35 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-673241599, i35, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:344)");
                                                }
                                                TextFieldDecorator textFieldDecorator6 = textFieldDecorator5;
                                                if (textFieldDecorator6 == null) {
                                                    textFieldDecorator6 = BasicTextFieldKt.DefaultTextFieldDecorator;
                                                }
                                                final TextFieldLineLimits textFieldLineLimits5 = textFieldLineLimits4;
                                                final TextLayoutState textLayoutState3 = textLayoutState2;
                                                final TextStyle textStyle5 = textStyle4;
                                                final boolean z22 = zBooleanValue;
                                                final boolean z23 = zIsWindowFocused;
                                                final boolean z24 = zBooleanValue2;
                                                final TransformedTextFieldState transformedTextFieldState4 = transformedTextFieldState3;
                                                final TextFieldSelectionState textFieldSelectionState4 = textFieldSelectionState3;
                                                final Brush brush4 = brush3;
                                                final boolean z25 = z20;
                                                final boolean z26 = z21;
                                                final ScrollState scrollState4 = scrollState3;
                                                final Orientation orientation3 = orientation2;
                                                final boolean z27 = zAreEqual;
                                                final Function2<Density, Function0<TextLayoutResult>, Unit> function25 = function24;
                                                textFieldDecorator6.Decoration(ComposableLambdaKt.rememberComposableLambda(1969169726, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1.1
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

                                                    public final void invoke(Composer composer4, int i36) {
                                                        int minHeightInLines;
                                                        int maxHeightInLines;
                                                        ComposerKt.sourceInformation(composer4, "C356@18098L2472:BasicTextField.kt#423gt5");
                                                        if ((i36 & 3) != 2 || !composer4.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1969169726, i36, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:346)");
                                                            }
                                                            TextFieldLineLimits textFieldLineLimits6 = textFieldLineLimits5;
                                                            if (textFieldLineLimits6 instanceof TextFieldLineLimits.MultiLine) {
                                                                minHeightInLines = ((TextFieldLineLimits.MultiLine) textFieldLineLimits6).getMinHeightInLines();
                                                                maxHeightInLines = ((TextFieldLineLimits.MultiLine) textFieldLineLimits5).getMaxHeightInLines();
                                                            } else {
                                                                minHeightInLines = 1;
                                                                maxHeightInLines = 1;
                                                            }
                                                            Modifier modifierThen = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m1468heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState3.m1970getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle5, minHeightInLines, maxHeightInLines), textStyle5)).then(new TextFieldCoreModifier(z22 && z23, z24, textLayoutState3, transformedTextFieldState4, textFieldSelectionState4, brush4, z25 && !z26, scrollState4, orientation3));
                                                            TextLayoutState textLayoutState4 = textLayoutState3;
                                                            TransformedTextFieldState transformedTextFieldState5 = transformedTextFieldState4;
                                                            TextStyle textStyle6 = textStyle5;
                                                            boolean z28 = z27;
                                                            Function2<Density, Function0<TextLayoutResult>, Unit> function26 = function25;
                                                            boolean z29 = z25;
                                                            boolean z30 = z22;
                                                            boolean z31 = z23;
                                                            TextFieldSelectionState textFieldSelectionState5 = textFieldSelectionState4;
                                                            boolean z32 = z26;
                                                            ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierThen);
                                                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                                ComposablesKt.invalidApplier();
                                                            }
                                                            composer4.startReusableNode();
                                                            if (composer4.getInserting()) {
                                                                composer4.createNode(constructor2);
                                                            } else {
                                                                composer4.useNode();
                                                            }
                                                            Composer composerM4088constructorimpl2 = Updater.m4088constructorimpl(composer4);
                                                            Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                            Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                            if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                            }
                                                            Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                                            ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                            ComposerKt.sourceInformationMarkerStart(composer4, -1326300454, "C381@19361L648:BasicTextField.kt#423gt5");
                                                            BoxKt.Box(BringIntoViewRequesterKt.bringIntoViewRequester(Modifier.INSTANCE, textLayoutState4.getBringIntoViewRequester()).then(new TextFieldTextLayoutModifier(textLayoutState4, transformedTextFieldState5, textStyle6, z28, function26)), composer4, 0);
                                                            if (z29 && z30 && z31 && textFieldSelectionState5.isInTouchMode()) {
                                                                composer4.startReplaceGroup(-1325530694);
                                                                ComposerKt.sourceInformation(composer4, "398@20188L121");
                                                                BasicTextFieldKt.TextFieldSelectionHandles(textFieldSelectionState5, composer4, 0);
                                                                if (!z32) {
                                                                    composer4.startReplaceGroup(-1325351669);
                                                                    ComposerKt.sourceInformation(composer4, "402@20379L125");
                                                                    BasicTextFieldKt.TextFieldCursorHandle(textFieldSelectionState5, composer4, 0);
                                                                    composer4.endReplaceGroup();
                                                                } else {
                                                                    composer4.startReplaceGroup(-1325177728);
                                                                    composer4.endReplaceGroup();
                                                                }
                                                                composer4.endReplaceGroup();
                                                            } else {
                                                                composer4.startReplaceGroup(-1325155904);
                                                                composer4.endReplaceGroup();
                                                            }
                                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                                            composer4.endNode();
                                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer4.skipToGroupEnd();
                                                    }
                                                }, composer3, 54), composer3, 6);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & LDSFile.EF_DG16_TAG) | 384);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    composerStartRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2 = composerStartRestartGroup;
                                    inputTransformation5 = inputTransformation4;
                                    textStyle3 = textStyle4;
                                    z12 = z9;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    codepointTransformation3 = codepointTransformation2;
                                    scrollState2 = scrollStateRememberScrollState;
                                    z13 = z10;
                                    textFieldLineLimits3 = textFieldLineLimits4;
                                    z14 = z11;
                                    outputTransformation3 = outputTransformation6;
                                    function23 = function24;
                                    keyboardActionHandler3 = keyboardActionHandler6;
                                    keyboardOptions3 = keyboardOptions2;
                                    textFieldDecorator3 = textFieldDecorator5;
                                    modifier3 = modifier2;
                                    brush2 = cursorBrush;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    textFieldLineLimits3 = textFieldLineLimits;
                                    codepointTransformation3 = codepointTransformation;
                                    scrollState2 = scrollState;
                                    z14 = z3;
                                    composer2 = composerStartRestartGroup;
                                    inputTransformation5 = inputTransformation2;
                                    z12 = z4;
                                    textStyle3 = textStyle2;
                                    modifier3 = modifier2;
                                    z13 = z5;
                                    keyboardOptions3 = keyboardOptions2;
                                    keyboardActionHandler3 = keyboardActionHandler;
                                    function23 = function2;
                                    mutableInteractionSource4 = mutableInteractionSource;
                                    brush2 = brush;
                                    outputTransformation3 = outputTransformation;
                                    textFieldDecorator3 = textFieldDecorator;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.5
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

                                        public final void invoke(Composer composer3, int i35) {
                                            BasicTextFieldKt.BasicTextField(textFieldState, modifier3, z12, z13, inputTransformation5, textStyle3, keyboardOptions3, keyboardActionHandler3, textFieldLineLimits3, function23, mutableInteractionSource4, brush2, codepointTransformation3, outputTransformation3, textFieldDecorator3, scrollState2, z14, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i4 |= 805306368;
                            i14 = i13;
                            i15 = i3 & 1024;
                            if (i15 != 0) {
                            }
                            i18 = i3 & 2048;
                            if (i18 != 0) {
                            }
                            int i302 = i17;
                            i20 = i3 & 4096;
                            if (i20 != 0) {
                            }
                            i22 = i3 & 8192;
                            if (i22 != 0) {
                            }
                            i24 = i3 & 16384;
                            if (i24 != 0) {
                            }
                            if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                            }
                            i26 = i3 & 65536;
                            if (i26 != 0) {
                            }
                            int i332 = i25;
                            if ((i4 & 306783379) != 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if (i29 != 0) {
                                    }
                                    if (i5 != 0) {
                                    }
                                    if (i6 != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    if (i20 == 0) {
                                    }
                                    if (i22 == 0) {
                                    }
                                    if (i24 == 0) {
                                    }
                                    KeyboardActionHandler keyboardActionHandler52 = keyboardActionHandler4;
                                    if ((i3 & 32768) == 0) {
                                    }
                                    OutputTransformation outputTransformation52 = outputTransformation4;
                                    textFieldDecorator2 = textFieldDecorator4;
                                    outputTransformation2 = outputTransformation52;
                                    if (i26 == 0) {
                                    }
                                    keyboardActionHandler2 = keyboardActionHandler52;
                                    composerStartRestartGroup.endDefaults();
                                    KeyboardActionHandler keyboardActionHandler62 = keyboardActionHandler2;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume7 = composerStartRestartGroup.consume(localDensity2);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    density = (Density) objConsume7;
                                    ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume22 = composerStartRestartGroup.consume(localLayoutDirection2);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    LayoutDirection layoutDirection2 = (LayoutDirection) objConsume22;
                                    z7 = z4;
                                    ProvidableCompositionLocal<WindowInfo> localWindowInfo2 = CompositionLocalsKt.getLocalWindowInfo();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume32 = composerStartRestartGroup.consume(localWindowInfo2);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    WindowInfo windowInfo22 = (WindowInfo) objConsume32;
                                    final boolean zAreEqual2 = Intrinsics.areEqual(textFieldLineLimits2, TextFieldLineLimits.SingleLine.INSTANCE);
                                    final TextFieldLineLimits textFieldLineLimits42 = textFieldLineLimits2;
                                    if (mutableInteractionSource2 != null) {
                                    }
                                    if (!zAreEqual2) {
                                    }
                                    MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                                    final TextStyle textStyle42 = textStyle2;
                                    zBooleanValue = FocusInteractionKt.collectIsFocusedAsState(mutableInteractionSource52, composerStartRestartGroup, 0).getValue().booleanValue();
                                    final boolean zBooleanValue22 = HoverInteractionKt.collectIsHoveredAsState(mutableInteractionSource52, composerStartRestartGroup, 0).getValue().booleanValue();
                                    zIsWindowFocused = windowInfo.isWindowFocused();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243786909, "CC(remember):BasicTextField.kt#9igjgp");
                                    int i342 = i28;
                                    z8 = ((i28 & 7168) != 2048) | ((i4 & 14) != 4) | ((i28 & 896) != 256);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (!z8) {
                                        if (codepointTransformation2 != null) {
                                        }
                                        objRememberedValue = new TransformedTextFieldState(textFieldState, inputTransformation2, singleLineCodepointTransformation, outputTransformation2);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        transformedTextFieldState = (TransformedTextFieldState) objRememberedValue;
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243755818, "CC(remember):BasicTextField.kt#9igjgp");
                                        zChanged = composerStartRestartGroup.changed(transformedTextFieldState);
                                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (!zChanged) {
                                            objRememberedValue2 = new TextLayoutState();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                            textLayoutState = (TextLayoutState) objRememberedValue2;
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243752821, "CC(remember):BasicTextField.kt#9igjgp");
                                            zChanged2 = composerStartRestartGroup.changed(transformedTextFieldState);
                                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                            if (zChanged2) {
                                                if (zBooleanValue) {
                                                    boolean z152 = z5;
                                                    boolean z162 = z6;
                                                    objRememberedValue3 = new TextFieldSelectionState(transformedTextFieldState, textLayoutState, density, z7, z152, !zBooleanValue && zIsWindowFocused, z162);
                                                    transformedTextFieldState = transformedTextFieldState;
                                                    textLayoutState = textLayoutState;
                                                    density2 = density;
                                                    z9 = z7;
                                                    z10 = z152;
                                                    z11 = z162;
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                                    textFieldSelectionState = (TextFieldSelectionState) objRememberedValue3;
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    OutputTransformation outputTransformation62 = outputTransformation2;
                                                    ProvidableCompositionLocal<HapticFeedback> localHapticFeedback2 = CompositionLocalsKt.getLocalHapticFeedback();
                                                    inputTransformation3 = inputTransformation2;
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                    Object objConsume42 = composerStartRestartGroup.consume(localHapticFeedback2);
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    hapticFeedback = (HapticFeedback) objConsume42;
                                                    final TextLayoutState textLayoutState22 = textLayoutState;
                                                    ProvidableCompositionLocal<ClipboardManager> localClipboardManager2 = CompositionLocalsKt.getLocalClipboardManager();
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                    Object objConsume52 = composerStartRestartGroup.consume(localClipboardManager2);
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    clipboardManager = (ClipboardManager) objConsume52;
                                                    final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function242 = function22;
                                                    ProvidableCompositionLocal<TextToolbar> localTextToolbar2 = CompositionLocalsKt.getLocalTextToolbar();
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                    Object objConsume62 = composerStartRestartGroup.consume(localTextToolbar2);
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    textToolbar = (TextToolbar) objConsume62;
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243735026, "CC(remember):BasicTextField.kt#9igjgp");
                                                    zChanged3 = ((i4 & 896) != 256) | composerStartRestartGroup.changed(transformedTextFieldState) | ((57344 & i4) != 16384) | composerStartRestartGroup.changedInstance(textFieldSelectionState) | composerStartRestartGroup.changedInstance(hapticFeedback) | composerStartRestartGroup.changedInstance(clipboardManager) | composerStartRestartGroup.changedInstance(textToolbar) | composerStartRestartGroup.changed(density2) | ((i4 & 7168) != 2048) | ((i342 & 3670016) != 1048576);
                                                    Object objRememberedValue62 = composerStartRestartGroup.rememberedValue();
                                                    if (zChanged3) {
                                                        final Density density32 = density2;
                                                        final TransformedTextFieldState transformedTextFieldState22 = transformedTextFieldState;
                                                        final boolean z172 = z9;
                                                        final boolean z182 = z10;
                                                        final boolean z192 = z11;
                                                        Object obj22 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$2$1
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
                                                                transformedTextFieldState22.update(inputTransformation3);
                                                                textFieldSelectionState.update(hapticFeedback, clipboardManager, textToolbar, density32, z172, z182, z192);
                                                            }
                                                        };
                                                        inputTransformation4 = inputTransformation3;
                                                        textFieldSelectionState2 = textFieldSelectionState;
                                                        obj = (Function0) obj22;
                                                        composerStartRestartGroup.updateRememberedValue(obj);
                                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                        EffectsKt.SideEffect((Function0) obj, composerStartRestartGroup, 0);
                                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243717287, "CC(remember):BasicTextField.kt#9igjgp");
                                                        zChangedInstance = composerStartRestartGroup.changedInstance(textFieldSelectionState2);
                                                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                                        if (!zChangedInstance) {
                                                            objRememberedValue4 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                                    final TextFieldSelectionState textFieldSelectionState32 = textFieldSelectionState2;
                                                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$3$1$invoke$$inlined$onDispose$1
                                                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                                                        public void dispose() {
                                                                            textFieldSelectionState32.dispose();
                                                                        }
                                                                    };
                                                                }
                                                            };
                                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                            EffectsKt.DisposableEffect(textFieldSelectionState2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
                                                            final TextFieldSelectionState textFieldSelectionState32 = textFieldSelectionState2;
                                                            MutableInteractionSource mutableInteractionSource62 = mutableInteractionSource3;
                                                            if (z9) {
                                                                final Orientation orientation22 = orientation;
                                                                Modifier modifierPointerHoverIcon$default2 = PointerIconKt.pointerHoverIcon$default(ScrollableKt.scrollable$default(FocusableKt.focusable(modifier2.then(new TextFieldDecoratorModifier(transformedTextFieldState, textLayoutState22, textFieldSelectionState32, inputTransformation4, z9, z10, keyboardOptions2, keyboardActionHandler62, zAreEqual2, mutableInteractionSource62)), z9, mutableInteractionSource62), scrollStateRememberScrollState, orientation22, !z9 && textFieldSelectionState32.getDirectDragGestureInitiator() == TextFieldSelectionState.InputType.None, ScrollableDefaults.INSTANCE.reverseDirection(layoutDirection2, orientation, false), null, mutableInteractionSource62, 16, null), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPointerHoverIcon$default2);
                                                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                                                }
                                                                composerStartRestartGroup.startReusableNode();
                                                                if (!composerStartRestartGroup.getInserting()) {
                                                                }
                                                                composerM4088constructorimpl = Updater.m4088constructorimpl(composerStartRestartGroup);
                                                                Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                if (!composerM4088constructorimpl.getInserting()) {
                                                                    composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                    composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                    Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1236622543, "C343@17621L2973,343@17571L3023:BasicTextField.kt#423gt5");
                                                                    final TransformedTextFieldState transformedTextFieldState32 = transformedTextFieldState;
                                                                    final boolean z202 = z9;
                                                                    final TextFieldDecorator textFieldDecorator52 = textFieldDecorator2;
                                                                    final Brush brush32 = cursorBrush;
                                                                    final ScrollState scrollState32 = scrollStateRememberScrollState;
                                                                    final boolean z212 = z10;
                                                                    ContextMenu_androidKt.ContextMenuArea(textFieldSelectionState32, z9, ComposableLambdaKt.rememberComposableLambda(-673241599, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1
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

                                                                        public final void invoke(Composer composer3, int i35) {
                                                                            ComposerKt.sourceInformation(composer3, "C345@17737L2847,345@17726L2858:BasicTextField.kt#423gt5");
                                                                            if ((i35 & 3) != 2 || !composer3.getSkipping()) {
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventStart(-673241599, i35, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:344)");
                                                                                }
                                                                                TextFieldDecorator textFieldDecorator6 = textFieldDecorator52;
                                                                                if (textFieldDecorator6 == null) {
                                                                                    textFieldDecorator6 = BasicTextFieldKt.DefaultTextFieldDecorator;
                                                                                }
                                                                                final TextFieldLineLimits textFieldLineLimits5 = textFieldLineLimits42;
                                                                                final TextLayoutState textLayoutState3 = textLayoutState22;
                                                                                final TextStyle textStyle5 = textStyle42;
                                                                                final boolean z22 = zBooleanValue;
                                                                                final boolean z23 = zIsWindowFocused;
                                                                                final boolean z24 = zBooleanValue22;
                                                                                final TransformedTextFieldState transformedTextFieldState4 = transformedTextFieldState32;
                                                                                final TextFieldSelectionState textFieldSelectionState4 = textFieldSelectionState32;
                                                                                final Brush brush4 = brush32;
                                                                                final boolean z25 = z202;
                                                                                final boolean z26 = z212;
                                                                                final ScrollState scrollState4 = scrollState32;
                                                                                final Orientation orientation3 = orientation22;
                                                                                final boolean z27 = zAreEqual2;
                                                                                final Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function25 = function242;
                                                                                textFieldDecorator6.Decoration(ComposableLambdaKt.rememberComposableLambda(1969169726, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$4$1.1
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

                                                                                    public final void invoke(Composer composer4, int i36) {
                                                                                        int minHeightInLines;
                                                                                        int maxHeightInLines;
                                                                                        ComposerKt.sourceInformation(composer4, "C356@18098L2472:BasicTextField.kt#423gt5");
                                                                                        if ((i36 & 3) != 2 || !composer4.getSkipping()) {
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventStart(1969169726, i36, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:346)");
                                                                                            }
                                                                                            TextFieldLineLimits textFieldLineLimits6 = textFieldLineLimits5;
                                                                                            if (textFieldLineLimits6 instanceof TextFieldLineLimits.MultiLine) {
                                                                                                minHeightInLines = ((TextFieldLineLimits.MultiLine) textFieldLineLimits6).getMinHeightInLines();
                                                                                                maxHeightInLines = ((TextFieldLineLimits.MultiLine) textFieldLineLimits5).getMaxHeightInLines();
                                                                                            } else {
                                                                                                minHeightInLines = 1;
                                                                                                maxHeightInLines = 1;
                                                                                            }
                                                                                            Modifier modifierThen = ClipKt.clipToBounds(TextFieldSizeKt.textFieldMinSize(HeightInLinesModifierKt.heightInLines(SizeKt.m1468heightInVpY3zN4$default(Modifier.INSTANCE, textLayoutState3.m1970getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle5, minHeightInLines, maxHeightInLines), textStyle5)).then(new TextFieldCoreModifier(z22 && z23, z24, textLayoutState3, transformedTextFieldState4, textFieldSelectionState4, brush4, z25 && !z26, scrollState4, orientation3));
                                                                                            TextLayoutState textLayoutState4 = textLayoutState3;
                                                                                            TransformedTextFieldState transformedTextFieldState5 = transformedTextFieldState4;
                                                                                            TextStyle textStyle6 = textStyle5;
                                                                                            boolean z28 = z27;
                                                                                            Function2<Density, Function0<TextLayoutResult>, Unit> function26 = function25;
                                                                                            boolean z29 = z25;
                                                                                            boolean z30 = z22;
                                                                                            boolean z31 = z23;
                                                                                            TextFieldSelectionState textFieldSelectionState5 = textFieldSelectionState4;
                                                                                            boolean z32 = z26;
                                                                                            ComposerKt.sourceInformationMarkerStart(composer4, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                                                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                                                                            ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                                                                            CompositionLocalMap currentCompositionLocalMap22 = composer4.getCurrentCompositionLocalMap();
                                                                                            Modifier modifierMaterializeModifier22 = ComposedModifierKt.materializeModifier(composer4, modifierThen);
                                                                                            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                                                                                            ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                                                            if (!(composer4.getApplier() instanceof Applier)) {
                                                                                                ComposablesKt.invalidApplier();
                                                                                            }
                                                                                            composer4.startReusableNode();
                                                                                            if (composer4.getInserting()) {
                                                                                                composer4.createNode(constructor22);
                                                                                            } else {
                                                                                                composer4.useNode();
                                                                                            }
                                                                                            Composer composerM4088constructorimpl2 = Updater.m4088constructorimpl(composer4);
                                                                                            Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                                            Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                                            if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                                                composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                                                composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                                                            }
                                                                                            Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                                                                                            ComposerKt.sourceInformationMarkerStart(composer4, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                                                            BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                                                                                            ComposerKt.sourceInformationMarkerStart(composer4, -1326300454, "C381@19361L648:BasicTextField.kt#423gt5");
                                                                                            BoxKt.Box(BringIntoViewRequesterKt.bringIntoViewRequester(Modifier.INSTANCE, textLayoutState4.getBringIntoViewRequester()).then(new TextFieldTextLayoutModifier(textLayoutState4, transformedTextFieldState5, textStyle6, z28, function26)), composer4, 0);
                                                                                            if (z29 && z30 && z31 && textFieldSelectionState5.isInTouchMode()) {
                                                                                                composer4.startReplaceGroup(-1325530694);
                                                                                                ComposerKt.sourceInformation(composer4, "398@20188L121");
                                                                                                BasicTextFieldKt.TextFieldSelectionHandles(textFieldSelectionState5, composer4, 0);
                                                                                                if (!z32) {
                                                                                                    composer4.startReplaceGroup(-1325351669);
                                                                                                    ComposerKt.sourceInformation(composer4, "402@20379L125");
                                                                                                    BasicTextFieldKt.TextFieldCursorHandle(textFieldSelectionState5, composer4, 0);
                                                                                                    composer4.endReplaceGroup();
                                                                                                } else {
                                                                                                    composer4.startReplaceGroup(-1325177728);
                                                                                                    composer4.endReplaceGroup();
                                                                                                }
                                                                                                composer4.endReplaceGroup();
                                                                                            } else {
                                                                                                composer4.startReplaceGroup(-1325155904);
                                                                                                composer4.endReplaceGroup();
                                                                                            }
                                                                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                                                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                                                                            composer4.endNode();
                                                                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                                                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                                                                            ComposerKt.sourceInformationMarkerEnd(composer4);
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventEnd();
                                                                                                return;
                                                                                            }
                                                                                            return;
                                                                                        }
                                                                                        composer4.skipToGroupEnd();
                                                                                    }
                                                                                }, composer3, 54), composer3, 6);
                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                    ComposerKt.traceEventEnd();
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            composer3.skipToGroupEnd();
                                                                        }
                                                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & LDSFile.EF_DG16_TAG) | 384);
                                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                    composerStartRestartGroup.endNode();
                                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                    }
                                                                    composer2 = composerStartRestartGroup;
                                                                    inputTransformation5 = inputTransformation4;
                                                                    textStyle3 = textStyle42;
                                                                    z12 = z9;
                                                                    mutableInteractionSource4 = mutableInteractionSource2;
                                                                    codepointTransformation3 = codepointTransformation2;
                                                                    scrollState2 = scrollStateRememberScrollState;
                                                                    z13 = z10;
                                                                    textFieldLineLimits3 = textFieldLineLimits42;
                                                                    z14 = z11;
                                                                    outputTransformation3 = outputTransformation62;
                                                                    function23 = function242;
                                                                    keyboardActionHandler3 = keyboardActionHandler62;
                                                                    keyboardOptions3 = keyboardOptions2;
                                                                    textFieldDecorator3 = textFieldDecorator52;
                                                                    modifier3 = modifier2;
                                                                    brush2 = cursorBrush;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i12 = i11;
                        i13 = i3 & 512;
                        if (i13 != 0) {
                        }
                        i14 = i13;
                        i15 = i3 & 1024;
                        if (i15 != 0) {
                        }
                        i18 = i3 & 2048;
                        if (i18 != 0) {
                        }
                        int i3022 = i17;
                        i20 = i3 & 4096;
                        if (i20 != 0) {
                        }
                        i22 = i3 & 8192;
                        if (i22 != 0) {
                        }
                        i24 = i3 & 16384;
                        if (i24 != 0) {
                        }
                        if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                        }
                        i26 = i3 & 65536;
                        if (i26 != 0) {
                        }
                        int i3322 = i25;
                        if ((i4 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    inputTransformation2 = inputTransformation;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i3 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    i13 = i3 & 512;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    i15 = i3 & 1024;
                    if (i15 != 0) {
                    }
                    i18 = i3 & 2048;
                    if (i18 != 0) {
                    }
                    int i30222 = i17;
                    i20 = i3 & 4096;
                    if (i20 != 0) {
                    }
                    i22 = i3 & 8192;
                    if (i22 != 0) {
                    }
                    i24 = i3 & 16384;
                    if (i24 != 0) {
                    }
                    if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                    }
                    i26 = i3 & 65536;
                    if (i26 != 0) {
                    }
                    int i33222 = i25;
                    if ((i4 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z5 = z2;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                inputTransformation2 = inputTransformation;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i3 & 512;
                if (i13 != 0) {
                }
                i14 = i13;
                i15 = i3 & 1024;
                if (i15 != 0) {
                }
                i18 = i3 & 2048;
                if (i18 != 0) {
                }
                int i302222 = i17;
                i20 = i3 & 4096;
                if (i20 != 0) {
                }
                i22 = i3 & 8192;
                if (i22 != 0) {
                }
                i24 = i3 & 16384;
                if (i24 != 0) {
                }
                if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                }
                i26 = i3 & 65536;
                if (i26 != 0) {
                }
                int i332222 = i25;
                if ((i4 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z4 = z;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            z5 = z2;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            inputTransformation2 = inputTransformation;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i3 & 512;
            if (i13 != 0) {
            }
            i14 = i13;
            i15 = i3 & 1024;
            if (i15 != 0) {
            }
            i18 = i3 & 2048;
            if (i18 != 0) {
            }
            int i3022222 = i17;
            i20 = i3 & 4096;
            if (i20 != 0) {
            }
            i22 = i3 & 8192;
            if (i22 != 0) {
            }
            i24 = i3 & 16384;
            if (i24 != 0) {
            }
            if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
            }
            i26 = i3 & 65536;
            if (i26 != 0) {
            }
            int i3322222 = i25;
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        z4 = z;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        z5 = z2;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        inputTransformation2 = inputTransformation;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i3 & 512;
        if (i13 != 0) {
        }
        i14 = i13;
        i15 = i3 & 1024;
        if (i15 != 0) {
        }
        i18 = i3 & 2048;
        if (i18 != 0) {
        }
        int i30222222 = i17;
        i20 = i3 & 4096;
        if (i20 != 0) {
        }
        i22 = i3 & 8192;
        if (i22 != 0) {
        }
        i24 = i3 & 16384;
        if (i24 != 0) {
        }
        if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
        }
        i26 = i3 & 65536;
        if (i26 != 0) {
        }
        int i33222222 = i25;
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void TextFieldCursorHandle(final TextFieldSelectionState textFieldSelectionState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1991581797);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextFieldCursorHandle)417@20797L128:BasicTextField.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1991581797, i2, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (BasicTextField.kt:414)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -425876476, "CC(remember):BasicTextField.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(textFieldSelectionState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$cursorHandleState$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final TextFieldHandleState invoke() {
                        return textFieldSelectionState.getCursorHandleState$foundation_release(false);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (TextFieldCursorHandle$lambda$9((State) objRememberedValue).getVisible()) {
                composerStartRestartGroup.startReplaceGroup(-317096444);
                ComposerKt.sourceInformation(composerStartRestartGroup, "422@21014L142,428@21236L87,421@20971L426");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -425869518, "CC(remember):BasicTextField.kt#9igjgp");
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                OffsetProvider offsetProviderRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || offsetProviderRememberedValue == Composer.INSTANCE.getEmpty()) {
                    offsetProviderRememberedValue = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0, reason: not valid java name */
                        public final long mo1725provideF1C5BW0() {
                            return textFieldSelectionState.getCursorHandleState$foundation_release(true).m1999getPositionF1C5BW0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(offsetProviderRememberedValue);
                }
                OffsetProvider offsetProvider = (OffsetProvider) offsetProviderRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -425862469, "CC(remember):BasicTextField.kt#9igjgp");
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                BasicTextFieldKt$TextFieldCursorHandle$2$1 basicTextFieldKt$TextFieldCursorHandle$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || basicTextFieldKt$TextFieldCursorHandle$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    basicTextFieldKt$TextFieldCursorHandle$2$1RememberedValue = new BasicTextFieldKt$TextFieldCursorHandle$2$1(textFieldSelectionState, null);
                    composerStartRestartGroup.updateRememberedValue(basicTextFieldKt$TextFieldCursorHandle$2$1RememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                AndroidCursorHandle_androidKt.m1721CursorHandleUSBMPiE(offsetProvider, SuspendingPointerInputFilterKt.pointerInput(companion, textFieldSelectionState, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) basicTextFieldKt$TextFieldCursorHandle$2$1RememberedValue), MinTouchTargetSizeForHandles, composerStartRestartGroup, 384, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-316671682);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.TextFieldCursorHandle.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    BasicTextFieldKt.TextFieldCursorHandle(textFieldSelectionState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void TextFieldSelectionHandles(final TextFieldSelectionState textFieldSelectionState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2025287684);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextFieldSelectionHandles)441@21601L149,464@22479L150:BasicTextField.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2025287684, i2, -1, "androidx.compose.foundation.text.TextFieldSelectionHandles (BasicTextField.kt:439)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1983345574, "CC(remember):BasicTextField.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$startHandleState$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final TextFieldHandleState invoke() {
                        return textFieldSelectionState.getSelectionHandleState$foundation_release(true, false);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            State state = (State) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (TextFieldSelectionHandles$lambda$13(state).getVisible()) {
                composerStartRestartGroup.startReplaceGroup(-1353974139);
                ComposerKt.sourceInformation(composerStartRestartGroup, "448@21841L167,456@22219L86,447@21795L584");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1983337876, "CC(remember):BasicTextField.kt#9igjgp");
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                OffsetProvider offsetProviderRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || offsetProviderRememberedValue == Composer.INSTANCE.getEmpty()) {
                    offsetProviderRememberedValue = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo1725provideF1C5BW0() {
                            return textFieldSelectionState.getSelectionHandleState$foundation_release(true, true).m1999getPositionF1C5BW0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(offsetProviderRememberedValue);
                }
                OffsetProvider offsetProvider = (OffsetProvider) offsetProviderRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ResolvedTextDirection direction = TextFieldSelectionHandles$lambda$13(state).getDirection();
                boolean handlesCrossed = TextFieldSelectionHandles$lambda$13(state).getHandlesCrossed();
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1983325861, "CC(remember):BasicTextField.kt#9igjgp");
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                BasicTextFieldKt$TextFieldSelectionHandles$2$1 basicTextFieldKt$TextFieldSelectionHandles$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || basicTextFieldKt$TextFieldSelectionHandles$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    basicTextFieldKt$TextFieldSelectionHandles$2$1RememberedValue = new BasicTextFieldKt$TextFieldSelectionHandles$2$1(textFieldSelectionState, null);
                    composerStartRestartGroup.updateRememberedValue(basicTextFieldKt$TextFieldSelectionHandles$2$1RememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                AndroidSelectionHandles_androidKt.m2078SelectionHandlepzduO1o(offsetProvider, true, direction, handlesCrossed, MinTouchTargetSizeForHandles, SuspendingPointerInputFilterKt.pointerInput(companion, textFieldSelectionState, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) basicTextFieldKt$TextFieldSelectionHandles$2$1RememberedValue), composerStartRestartGroup, 24624, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1353397539);
                composerStartRestartGroup.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1983317477, "CC(remember):BasicTextField.kt#9igjgp");
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$endHandleState$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final TextFieldHandleState invoke() {
                        return textFieldSelectionState.getSelectionHandleState$foundation_release(false, false);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            State state2 = (State) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (TextFieldSelectionHandles$lambda$17(state2).getVisible()) {
                composerStartRestartGroup.startReplaceGroup(-1353104186);
                ComposerKt.sourceInformation(composerStartRestartGroup, "471@22718L168,479@23094L87,470@22672L583");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1983309811, "CC(remember):BasicTextField.kt#9igjgp");
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                OffsetProvider offsetProviderRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || offsetProviderRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    offsetProviderRememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$3$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo1725provideF1C5BW0() {
                            return textFieldSelectionState.getSelectionHandleState$foundation_release(false, true).m1999getPositionF1C5BW0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(offsetProviderRememberedValue2);
                }
                OffsetProvider offsetProvider2 = (OffsetProvider) offsetProviderRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ResolvedTextDirection direction2 = TextFieldSelectionHandles$lambda$17(state2).getDirection();
                boolean handlesCrossed2 = TextFieldSelectionHandles$lambda$17(state2).getHandlesCrossed();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1983297860, "CC(remember):BasicTextField.kt#9igjgp");
                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                BasicTextFieldKt$TextFieldSelectionHandles$4$1 basicTextFieldKt$TextFieldSelectionHandles$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4 || basicTextFieldKt$TextFieldSelectionHandles$4$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    basicTextFieldKt$TextFieldSelectionHandles$4$1RememberedValue = new BasicTextFieldKt$TextFieldSelectionHandles$4$1(textFieldSelectionState, null);
                    composerStartRestartGroup.updateRememberedValue(basicTextFieldKt$TextFieldSelectionHandles$4$1RememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                AndroidSelectionHandles_androidKt.m2078SelectionHandlepzduO1o(offsetProvider2, false, direction2, handlesCrossed2, MinTouchTargetSizeForHandles, SuspendingPointerInputFilterKt.pointerInput(companion2, textFieldSelectionState, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) basicTextFieldKt$TextFieldSelectionHandles$4$1RememberedValue), composerStartRestartGroup, 24624, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1352528547);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.TextFieldSelectionHandles.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    BasicTextFieldKt.TextFieldSelectionHandles(textFieldSelectionState, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    static {
        float f = 40;
        MinTouchTargetSizeForHandles = DpKt.m7077DpSizeYgX7TsA(C1959Dp.m7055constructorimpl(f), C1959Dp.m7055constructorimpl(f));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final String str, final Function1<? super String, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, int i2, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        int i9;
        TextStyle textStyle2;
        int i10;
        KeyboardOptions keyboardOptions2;
        int i11;
        KeyboardActions keyboardActions2;
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
        int i23;
        int i24;
        int i25;
        VisualTransformation none;
        C09386 c09386;
        KeyboardActions keyboardActions3;
        boolean z6;
        SolidColor solidColor;
        boolean z7;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3M1741getLambda1$foundation_release;
        int i26;
        int i27;
        boolean z8;
        TextStyle textStyle3;
        Modifier modifier3;
        KeyboardActions keyboardActions4;
        Brush brush2;
        KeyboardOptions keyboardOptions3;
        MutableInteractionSource mutableInteractionSource2;
        Object objRememberedValue;
        int i28;
        boolean zChanged;
        Modifier modifier4;
        boolean z9;
        Object objRememberedValue2;
        final MutableState mutableState;
        boolean zChanged2;
        Object objRememberedValue3;
        Composer composer2;
        final KeyboardOptions keyboardOptions4;
        final TextStyle textStyle4;
        final MutableInteractionSource mutableInteractionSource3;
        final Brush brush3;
        final boolean z10;
        final boolean z11;
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function32;
        final boolean z12;
        final Modifier modifier5;
        final VisualTransformation visualTransformation2;
        final Function1<? super TextLayoutResult, Unit> function13;
        final KeyboardActions keyboardActions5;
        final int i29;
        final int i30;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(945255183);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicTextField)P(14,10,8,2,11,13,5,4,12,6,7,15,9,3)613@31179L57,619@31532L216,619@31521L227,628@32069L41,632@32187L373,630@32116L1032:BasicTextField.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i31 = i5 & 4;
        if (i31 != 0) {
            i6 |= 384;
        } else {
            if ((i3 & 384) == 0) {
                modifier2 = modifier;
                i6 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    z4 = z;
                    i6 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                }
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else {
                    if ((i3 & 24576) == 0) {
                        z5 = z2;
                        i6 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
                    }
                    i9 = i5 & 32;
                    if (i9 == 0) {
                        i6 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                        textStyle2 = textStyle;
                    } else {
                        textStyle2 = textStyle;
                        if ((i3 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                            i6 |= composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536;
                        }
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i6 |= 1572864;
                        keyboardOptions2 = keyboardOptions;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                        if ((i3 & 1572864) == 0) {
                            i6 |= composerStartRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288;
                        }
                    }
                    i11 = i5 & 128;
                    if (i11 == 0) {
                        i6 |= 12582912;
                        keyboardActions2 = keyboardActions;
                    } else {
                        keyboardActions2 = keyboardActions;
                        if ((i3 & 12582912) == 0) {
                            i6 |= composerStartRestartGroup.changed(keyboardActions2) ? 8388608 : 4194304;
                        }
                    }
                    i12 = i5 & 256;
                    if (i12 == 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i6 |= composerStartRestartGroup.changed(z3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i3 & 805306368) == 0) {
                        i6 |= ((i5 & 512) == 0 && composerStartRestartGroup.changed(i)) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    }
                    i13 = i5 & 1024;
                    if (i13 == 0) {
                        i15 = i4 | 6;
                        i14 = i13;
                    } else if ((i4 & 6) == 0) {
                        i14 = i13;
                        i15 = i4 | (composerStartRestartGroup.changed(i2) ? 4 : 2);
                    } else {
                        i14 = i13;
                        i15 = i4;
                    }
                    i16 = i5 & 2048;
                    if (i16 == 0) {
                        i15 |= 48;
                        i17 = i16;
                    } else if ((i4 & 48) == 0) {
                        i17 = i16;
                        i15 |= composerStartRestartGroup.changed(visualTransformation) ? 32 : 16;
                    } else {
                        i17 = i16;
                    }
                    int i32 = i15;
                    i18 = i5 & 4096;
                    if (i18 == 0) {
                        i19 = i32 | 384;
                    } else if ((i4 & 384) == 0) {
                        i19 = i32 | (composerStartRestartGroup.changedInstance(function12) ? 256 : 128);
                    } else {
                        i19 = i32;
                    }
                    i20 = i5 & 8192;
                    if (i20 == 0) {
                        i21 = i19 | 3072;
                    } else {
                        int i33 = i19;
                        if ((i4 & 3072) == 0) {
                            i21 = i33 | (composerStartRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024);
                        } else {
                            i21 = i33;
                        }
                    }
                    i22 = i5 & 16384;
                    if (i22 != 0) {
                        i23 = i21;
                        if ((i4 & 24576) == 0) {
                            i23 |= composerStartRestartGroup.changed(brush) ? 16384 : 8192;
                        }
                        i24 = i5 & 32768;
                        if (i24 != 0) {
                            i23 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                        } else if ((i4 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                            i23 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
                        }
                        int i34 = i23;
                        if ((i6 & 306783379) != 306783378 || (74899 & i34) != 74898 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i31 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i7 != 0) {
                                    z4 = true;
                                }
                                if (i8 != 0) {
                                    z5 = false;
                                }
                                if (i9 != 0) {
                                    textStyle2 = TextStyle.INSTANCE.getDefault();
                                }
                                if (i10 != 0) {
                                    keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                                }
                                KeyboardActions keyboardActions6 = i11 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions2;
                                boolean z13 = i12 == 0 ? false : z3;
                                if ((i5 & 512) == 0) {
                                    i25 = z13 ? 1 : Integer.MAX_VALUE;
                                    i6 &= -1879048193;
                                } else {
                                    i25 = i;
                                }
                                int i35 = i14 == 0 ? 1 : i2;
                                none = i17 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                c09386 = i18 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.6
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TextLayoutResult textLayoutResult) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                } : function12;
                                MutableInteractionSource mutableInteractionSource4 = i20 == 0 ? null : mutableInteractionSource;
                                if (i22 == 0) {
                                    z6 = z13;
                                    keyboardActions3 = keyboardActions6;
                                    solidColor = new SolidColor(Color.INSTANCE.m4621getBlack0d7_KjU(), null);
                                } else {
                                    keyboardActions3 = keyboardActions6;
                                    z6 = z13;
                                    solidColor = brush;
                                }
                                if (i24 == 0) {
                                    function3M1741getLambda1$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m1741getLambda1$foundation_release();
                                    i26 = i25;
                                    i27 = i35;
                                    z8 = z5;
                                    textStyle3 = textStyle2;
                                    modifier3 = modifier2;
                                    z7 = z6;
                                } else {
                                    z7 = z6;
                                    function3M1741getLambda1$foundation_release = function3;
                                    i26 = i25;
                                    i27 = i35;
                                    z8 = z5;
                                    textStyle3 = textStyle2;
                                    modifier3 = modifier2;
                                }
                                keyboardActions4 = keyboardActions3;
                                brush2 = solidColor;
                                keyboardOptions3 = keyboardOptions2;
                                mutableInteractionSource2 = mutableInteractionSource4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i5 & 512) != 0) {
                                    i6 &= -1879048193;
                                }
                                keyboardActions4 = keyboardActions2;
                                textStyle3 = textStyle2;
                                z7 = z3;
                                i26 = i;
                                i27 = i2;
                                none = visualTransformation;
                                c09386 = function12;
                                function3M1741getLambda1$foundation_release = function3;
                                keyboardOptions3 = keyboardOptions2;
                                z8 = z5;
                                modifier3 = modifier2;
                                mutableInteractionSource2 = mutableInteractionSource;
                                brush2 = brush;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(945255183, i6, i34, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:610)");
                            }
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243231713, "CC(remember):BasicTextField.kt#9igjgp");
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue != Composer.INSTANCE.getEmpty()) {
                                i28 = i26;
                                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                                objRememberedValue = mutableStateMutableStateOf$default;
                            } else {
                                i28 = i26;
                            }
                            final MutableState mutableState2 = (MutableState) objRememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            final TextFieldValue textFieldValueM6783copy3r_uNRQ$default = TextFieldValue.m6783copy3r_uNRQ$default(BasicTextField$lambda$21(mutableState2), str, 0L, (TextRange) null, 6, (Object) null);
                            int i36 = i27;
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243220258, "CC(remember):BasicTextField.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(textFieldValueM6783copy3r_uNRQ$default);
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                modifier4 = modifier3;
                                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                }
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243203249, "CC(remember):BasicTextField.kt#9igjgp");
                                z9 = (i6 & 14) == 4;
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (z9 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                mutableState = (MutableState) objRememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                ImeOptions imeOptions$foundation_release = keyboardOptions3.toImeOptions$foundation_release(z7);
                                boolean z14 = !z7;
                                boolean z15 = z4;
                                Function1<? super TextLayoutResult, Unit> function14 = c09386;
                                int i37 = !z7 ? 1 : i36;
                                int i38 = !z7 ? 1 : i28;
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243199141, "CC(remember):BasicTextField.kt#9igjgp");
                                zChanged2 = composerStartRestartGroup.changed(mutableState) | ((i6 & LDSFile.EF_DG16_TAG) != 32);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                            invoke2(textFieldValue);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(TextFieldValue textFieldValue) {
                                            mutableState2.setValue(textFieldValue);
                                            boolean zAreEqual = Intrinsics.areEqual(BasicTextFieldKt.BasicTextField$lambda$25(mutableState), textFieldValue.getText());
                                            mutableState.setValue(textFieldValue.getText());
                                            if (zAreEqual) {
                                                return;
                                            }
                                            function1.invoke(textFieldValue.getText());
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                int i39 = i34 << 9;
                                Modifier modifier6 = modifier4;
                                composer2 = composerStartRestartGroup;
                                CoreTextFieldKt.CoreTextField(textFieldValueM6783copy3r_uNRQ$default, (Function1) objRememberedValue3, modifier6, textStyle3, none, function14, mutableInteractionSource2, brush2, z14, i38, i37, imeOptions$foundation_release, keyboardActions4, z15, z8, function3M1741getLambda1$foundation_release, composer2, (i6 & 896) | ((i6 >> 6) & 7168) | (57344 & i39) | (458752 & i39) | (3670016 & i39) | (i39 & 29360128), (i6 & 57344) | ((i6 >> 15) & 896) | (i6 & 7168) | (i34 & 458752), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                keyboardOptions4 = keyboardOptions3;
                                textStyle4 = textStyle3;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                brush3 = brush2;
                                z10 = z15;
                                z11 = z8;
                                function32 = function3M1741getLambda1$foundation_release;
                                z12 = z7;
                                modifier5 = modifier6;
                                visualTransformation2 = none;
                                function13 = function14;
                                keyboardActions5 = keyboardActions4;
                                i29 = i36;
                                i30 = i28;
                            } else {
                                modifier4 = modifier3;
                            }
                            objRememberedValue4 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
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
                                    if (TextRange.m6533equalsimpl0(textFieldValueM6783copy3r_uNRQ$default.getSelection(), BasicTextFieldKt.BasicTextField$lambda$21(mutableState2).getSelection()) && Intrinsics.areEqual(textFieldValueM6783copy3r_uNRQ$default.getComposition(), BasicTextFieldKt.BasicTextField$lambda$21(mutableState2).getComposition())) {
                                        return;
                                    }
                                    mutableState2.setValue(textFieldValueM6783copy3r_uNRQ$default);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243203249, "CC(remember):BasicTextField.kt#9igjgp");
                            if ((i6 & 14) == 4) {
                            }
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (z9) {
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                mutableState = (MutableState) objRememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                ImeOptions imeOptions$foundation_release2 = keyboardOptions3.toImeOptions$foundation_release(z7);
                                boolean z142 = !z7;
                                boolean z152 = z4;
                                Function1<? super TextLayoutResult, Unit> function142 = c09386;
                                if (!z7) {
                                }
                                if (!z7) {
                                }
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243199141, "CC(remember):BasicTextField.kt#9igjgp");
                                zChanged2 = composerStartRestartGroup.changed(mutableState) | ((i6 & LDSFile.EF_DG16_TAG) != 32);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue3 = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$8$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                                            invoke2(textFieldValue);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(TextFieldValue textFieldValue) {
                                            mutableState2.setValue(textFieldValue);
                                            boolean zAreEqual = Intrinsics.areEqual(BasicTextFieldKt.BasicTextField$lambda$25(mutableState), textFieldValue.getText());
                                            mutableState.setValue(textFieldValue.getText());
                                            if (zAreEqual) {
                                                return;
                                            }
                                            function1.invoke(textFieldValue.getText());
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    int i392 = i34 << 9;
                                    Modifier modifier62 = modifier4;
                                    composer2 = composerStartRestartGroup;
                                    CoreTextFieldKt.CoreTextField(textFieldValueM6783copy3r_uNRQ$default, (Function1) objRememberedValue3, modifier62, textStyle3, none, function142, mutableInteractionSource2, brush2, z142, i38, i37, imeOptions$foundation_release2, keyboardActions4, z152, z8, function3M1741getLambda1$foundation_release, composer2, (i6 & 896) | ((i6 >> 6) & 7168) | (57344 & i392) | (458752 & i392) | (3670016 & i392) | (i392 & 29360128), (i6 & 57344) | ((i6 >> 15) & 896) | (i6 & 7168) | (i34 & 458752), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    keyboardOptions4 = keyboardOptions3;
                                    textStyle4 = textStyle3;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    brush3 = brush2;
                                    z10 = z152;
                                    z11 = z8;
                                    function32 = function3M1741getLambda1$foundation_release;
                                    z12 = z7;
                                    modifier5 = modifier62;
                                    visualTransformation2 = none;
                                    function13 = function142;
                                    keyboardActions5 = keyboardActions4;
                                    i29 = i36;
                                    i30 = i28;
                                }
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            i30 = i;
                            function32 = function3;
                            composer2 = composerStartRestartGroup;
                            keyboardActions5 = keyboardActions2;
                            z10 = z4;
                            keyboardOptions4 = keyboardOptions2;
                            z11 = z5;
                            textStyle4 = textStyle2;
                            modifier5 = modifier2;
                            z12 = z3;
                            i29 = i2;
                            visualTransformation2 = visualTransformation;
                            function13 = function12;
                            mutableInteractionSource3 = mutableInteractionSource;
                            brush3 = brush;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.9
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

                                public final void invoke(Composer composer3, int i40) {
                                    BasicTextFieldKt.BasicTextField(str, function1, modifier5, z10, z11, textStyle4, keyboardOptions4, keyboardActions5, z12, i30, i29, visualTransformation2, function13, mutableInteractionSource3, brush3, function32, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i23 = i21 | 24576;
                    i24 = i5 & 32768;
                    if (i24 != 0) {
                    }
                    int i342 = i23;
                    if ((i6 & 306783379) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i31 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if ((i5 & 512) == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i20 == 0) {
                            }
                            if (i22 == 0) {
                            }
                            if (i24 == 0) {
                            }
                            keyboardActions4 = keyboardActions3;
                            brush2 = solidColor;
                            keyboardOptions3 = keyboardOptions2;
                            mutableInteractionSource2 = mutableInteractionSource4;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243231713, "CC(remember):BasicTextField.kt#9igjgp");
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue != Composer.INSTANCE.getEmpty()) {
                            }
                            final MutableState<TextFieldValue> mutableState22 = (MutableState) objRememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            final TextFieldValue textFieldValueM6783copy3r_uNRQ$default2 = TextFieldValue.m6783copy3r_uNRQ$default(BasicTextField$lambda$21(mutableState22), str, 0L, (TextRange) null, 6, (Object) null);
                            int i362 = i27;
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243220258, "CC(remember):BasicTextField.kt#9igjgp");
                            zChanged = composerStartRestartGroup.changed(textFieldValueM6783copy3r_uNRQ$default2);
                            Object objRememberedValue42 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                            }
                            objRememberedValue42 = (Function0) new Function0<Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$7$1
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
                                    if (TextRange.m6533equalsimpl0(textFieldValueM6783copy3r_uNRQ$default2.getSelection(), BasicTextFieldKt.BasicTextField$lambda$21(mutableState22).getSelection()) && Intrinsics.areEqual(textFieldValueM6783copy3r_uNRQ$default2.getComposition(), BasicTextFieldKt.BasicTextField$lambda$21(mutableState22).getComposition())) {
                                        return;
                                    }
                                    mutableState22.setValue(textFieldValueM6783copy3r_uNRQ$default2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue42);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            EffectsKt.SideEffect((Function0) objRememberedValue42, composerStartRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1243203249, "CC(remember):BasicTextField.kt#9igjgp");
                            if ((i6 & 14) == 4) {
                            }
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (z9) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z5 = z2;
                i9 = i5 & 32;
                if (i9 == 0) {
                }
                i10 = i5 & 64;
                if (i10 == 0) {
                }
                i11 = i5 & 128;
                if (i11 == 0) {
                }
                i12 = i5 & 256;
                if (i12 == 0) {
                }
                if ((i3 & 805306368) == 0) {
                }
                i13 = i5 & 1024;
                if (i13 == 0) {
                }
                i16 = i5 & 2048;
                if (i16 == 0) {
                }
                int i322 = i15;
                i18 = i5 & 4096;
                if (i18 == 0) {
                }
                i20 = i5 & 8192;
                if (i20 == 0) {
                }
                i22 = i5 & 16384;
                if (i22 != 0) {
                }
                i24 = i5 & 32768;
                if (i24 != 0) {
                }
                int i3422 = i23;
                if ((i6 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z4 = z;
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            z5 = z2;
            i9 = i5 & 32;
            if (i9 == 0) {
            }
            i10 = i5 & 64;
            if (i10 == 0) {
            }
            i11 = i5 & 128;
            if (i11 == 0) {
            }
            i12 = i5 & 256;
            if (i12 == 0) {
            }
            if ((i3 & 805306368) == 0) {
            }
            i13 = i5 & 1024;
            if (i13 == 0) {
            }
            i16 = i5 & 2048;
            if (i16 == 0) {
            }
            int i3222 = i15;
            i18 = i5 & 4096;
            if (i18 == 0) {
            }
            i20 = i5 & 8192;
            if (i20 == 0) {
            }
            i22 = i5 & 16384;
            if (i22 != 0) {
            }
            i24 = i5 & 32768;
            if (i24 != 0) {
            }
            int i34222 = i23;
            if ((i6 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        z4 = z;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        z5 = z2;
        i9 = i5 & 32;
        if (i9 == 0) {
        }
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        i11 = i5 & 128;
        if (i11 == 0) {
        }
        i12 = i5 & 256;
        if (i12 == 0) {
        }
        if ((i3 & 805306368) == 0) {
        }
        i13 = i5 & 1024;
        if (i13 == 0) {
        }
        i16 = i5 & 2048;
        if (i16 == 0) {
        }
        int i32222 = i15;
        i18 = i5 & 4096;
        if (i18 == 0) {
        }
        i20 = i5 & 8192;
        if (i20 == 0) {
        }
        i22 = i5 & 16384;
        if (i22 != 0) {
        }
        i24 = i5 & 32768;
        if (i24 != 0) {
        }
        int i342222 = i23;
        if ((i6 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue BasicTextField$lambda$21(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BasicTextField$lambda$25(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:261:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicTextField(final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, int i2, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        int i9;
        TextStyle textStyle2;
        int i10;
        KeyboardOptions keyboardOptions2;
        int i11;
        KeyboardActions keyboardActions2;
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
        int i23;
        int i24;
        int i25;
        VisualTransformation none;
        C093010 c093010;
        MutableInteractionSource mutableInteractionSource2;
        KeyboardActions keyboardActions3;
        int i26;
        SolidColor solidColor;
        Brush brush2;
        boolean z6;
        int i27;
        int i28;
        TextStyle textStyle3;
        KeyboardOptions keyboardOptions3;
        KeyboardActions keyboardActions4;
        int i29;
        boolean z7;
        boolean z8;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3M1742getLambda2$foundation_release;
        boolean z9;
        Object objRememberedValue;
        final KeyboardActions keyboardActions5;
        Composer composer2;
        final int i30;
        final int i31;
        final boolean z10;
        final VisualTransformation visualTransformation2;
        final boolean z11;
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function32;
        final Function1<? super TextLayoutResult, Unit> function13;
        final Brush brush3;
        final boolean z12;
        final KeyboardOptions keyboardOptions4;
        final MutableInteractionSource mutableInteractionSource3;
        final TextStyle textStyle4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1804514146);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicTextField)P(14,10,8,2,11,13,5,4,12,6,7,15,9,3)765@39981L90,763@39919L740:BasicTextField.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(textFieldValue) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i32 = i5 & 4;
        if (i32 != 0) {
            i6 |= 384;
        } else {
            if ((i3 & 384) == 0) {
                modifier2 = modifier;
                i6 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else {
                if ((i3 & 3072) == 0) {
                    z4 = z;
                    i6 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                }
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else {
                    if ((i3 & 24576) == 0) {
                        z5 = z2;
                        i6 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
                    }
                    i9 = i5 & 32;
                    if (i9 == 0) {
                        i6 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                        textStyle2 = textStyle;
                    } else {
                        textStyle2 = textStyle;
                        if ((i3 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                            i6 |= composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536;
                        }
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i6 |= 1572864;
                        keyboardOptions2 = keyboardOptions;
                    } else {
                        keyboardOptions2 = keyboardOptions;
                        if ((i3 & 1572864) == 0) {
                            i6 |= composerStartRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288;
                        }
                    }
                    i11 = i5 & 128;
                    if (i11 == 0) {
                        i6 |= 12582912;
                        keyboardActions2 = keyboardActions;
                    } else {
                        keyboardActions2 = keyboardActions;
                        if ((i3 & 12582912) == 0) {
                            i6 |= composerStartRestartGroup.changed(keyboardActions2) ? 8388608 : 4194304;
                        }
                    }
                    i12 = i5 & 256;
                    if (i12 == 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i6 |= composerStartRestartGroup.changed(z3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i3 & 805306368) == 0) {
                        i6 |= ((i5 & 512) == 0 && composerStartRestartGroup.changed(i)) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    }
                    i13 = i5 & 1024;
                    if (i13 == 0) {
                        i15 = i4 | 6;
                        i14 = i13;
                    } else if ((i4 & 6) == 0) {
                        i14 = i13;
                        i15 = i4 | (composerStartRestartGroup.changed(i2) ? 4 : 2);
                    } else {
                        i14 = i13;
                        i15 = i4;
                    }
                    i16 = i5 & 2048;
                    if (i16 == 0) {
                        i15 |= 48;
                        i17 = i16;
                    } else if ((i4 & 48) == 0) {
                        i17 = i16;
                        i15 |= composerStartRestartGroup.changed(visualTransformation) ? 32 : 16;
                    } else {
                        i17 = i16;
                    }
                    int i33 = i15;
                    i18 = i5 & 4096;
                    if (i18 == 0) {
                        i19 = i33 | 384;
                    } else if ((i4 & 384) == 0) {
                        i19 = i33 | (composerStartRestartGroup.changedInstance(function12) ? 256 : 128);
                    } else {
                        i19 = i33;
                    }
                    i20 = i5 & 8192;
                    if (i20 == 0) {
                        i21 = i19 | 3072;
                    } else {
                        int i34 = i19;
                        if ((i4 & 3072) == 0) {
                            i21 = i34 | (composerStartRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024);
                        } else {
                            i21 = i34;
                        }
                    }
                    i22 = i5 & 16384;
                    if (i22 != 0) {
                        i23 = i21;
                        if ((i4 & 24576) == 0) {
                            i23 |= composerStartRestartGroup.changed(brush) ? 16384 : 8192;
                        }
                        i24 = i5 & 32768;
                        if (i24 != 0) {
                            i23 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                        } else if ((i4 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                            i23 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
                        }
                        int i35 = i23;
                        if ((i6 & 306783379) != 306783378 || (74899 & i35) != 74898 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i32 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i7 != 0) {
                                    z4 = true;
                                }
                                if (i8 != 0) {
                                    z5 = false;
                                }
                                if (i9 != 0) {
                                    textStyle2 = TextStyle.INSTANCE.getDefault();
                                }
                                if (i10 != 0) {
                                    keyboardOptions2 = KeyboardOptions.INSTANCE.getDefault();
                                }
                                KeyboardActions keyboardActions6 = i11 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions2;
                                boolean z13 = i12 == 0 ? false : z3;
                                if ((i5 & 512) == 0) {
                                    i25 = z13 ? 1 : Integer.MAX_VALUE;
                                    i6 &= -1879048193;
                                } else {
                                    i25 = i;
                                }
                                int i36 = i14 == 0 ? 1 : i2;
                                none = i17 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                c093010 = i18 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.10
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TextLayoutResult textLayoutResult) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                } : function12;
                                mutableInteractionSource2 = i20 == 0 ? null : mutableInteractionSource;
                                if (i22 == 0) {
                                    keyboardActions3 = keyboardActions6;
                                    i26 = i6;
                                    solidColor = new SolidColor(Color.INSTANCE.m4621getBlack0d7_KjU(), null);
                                } else {
                                    keyboardActions3 = keyboardActions6;
                                    i26 = i6;
                                    solidColor = brush;
                                }
                                if (i24 == 0) {
                                    brush2 = solidColor;
                                    z6 = z13;
                                    i27 = i25;
                                    i28 = i36;
                                    textStyle3 = textStyle2;
                                    keyboardActions4 = keyboardActions3;
                                    i29 = i26;
                                    z7 = z4;
                                    function3M1742getLambda2$foundation_release = ComposableSingletons$BasicTextFieldKt.INSTANCE.m1742getLambda2$foundation_release();
                                    keyboardOptions3 = keyboardOptions2;
                                    z8 = z5;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1804514146, i29, i35, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:762)");
                                    }
                                    ImeOptions imeOptions$foundation_release = keyboardOptions3.toImeOptions$foundation_release(z6);
                                    Modifier modifier4 = modifier2;
                                    Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function33 = function3M1742getLambda2$foundation_release;
                                    boolean z14 = !z6;
                                    int i37 = !z6 ? 1 : i28;
                                    int i38 = !z6 ? 1 : i27;
                                    TextStyle textStyle5 = textStyle3;
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1242950016, "CC(remember):BasicTextField.kt#9igjgp");
                                    z9 = ((i29 & 14) != 4) | ((i29 & LDSFile.EF_DG16_TAG) == 32);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (!z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$11$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                                invoke2(textFieldValue2);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(TextFieldValue textFieldValue2) {
                                                if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                                    return;
                                                }
                                                function1.invoke(textFieldValue2);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    int i39 = i35 << 9;
                                    int i40 = ((i29 >> 6) & 7168) | (i29 & 910) | (i39 & 57344) | (i39 & 458752) | (i39 & 3670016) | (i39 & 29360128);
                                    int i41 = (i29 & 7168) | ((i29 >> 15) & 896) | (57344 & i29) | (i35 & 458752);
                                    boolean z15 = z6;
                                    Function1<? super TextLayoutResult, Unit> function14 = c093010;
                                    KeyboardOptions keyboardOptions5 = keyboardOptions3;
                                    VisualTransformation visualTransformation3 = none;
                                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                    CoreTextFieldKt.CoreTextField(textFieldValue, (Function1) objRememberedValue, modifier4, textStyle5, visualTransformation3, function14, mutableInteractionSource4, brush2, z14, i38, i37, imeOptions$foundation_release, keyboardActions4, z7, z8, function33, composerStartRestartGroup, i40, i41, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    keyboardActions5 = keyboardActions4;
                                    composer2 = composerStartRestartGroup;
                                    i30 = i27;
                                    i31 = i28;
                                    z10 = z15;
                                    visualTransformation2 = visualTransformation3;
                                    z11 = z7;
                                    function32 = function33;
                                    function13 = function14;
                                    brush3 = brush2;
                                    z12 = z8;
                                    keyboardOptions4 = keyboardOptions5;
                                    mutableInteractionSource3 = mutableInteractionSource4;
                                    textStyle4 = textStyle5;
                                    modifier3 = modifier4;
                                } else {
                                    brush2 = solidColor;
                                    z6 = z13;
                                    i27 = i25;
                                    i28 = i36;
                                    textStyle3 = textStyle2;
                                    keyboardOptions3 = keyboardOptions2;
                                    keyboardActions4 = keyboardActions3;
                                    i29 = i26;
                                    z7 = z4;
                                    z8 = z5;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i5 & 512) != 0) {
                                    i6 &= -1879048193;
                                }
                                z6 = z3;
                                i27 = i;
                                i28 = i2;
                                none = visualTransformation;
                                c093010 = function12;
                                mutableInteractionSource2 = mutableInteractionSource;
                                keyboardActions4 = keyboardActions2;
                                textStyle3 = textStyle2;
                                keyboardOptions3 = keyboardOptions2;
                                i29 = i6;
                                z7 = z4;
                                z8 = z5;
                                brush2 = brush;
                            }
                            function3M1742getLambda2$foundation_release = function3;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ImeOptions imeOptions$foundation_release2 = keyboardOptions3.toImeOptions$foundation_release(z6);
                            Modifier modifier42 = modifier2;
                            Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function332 = function3M1742getLambda2$foundation_release;
                            boolean z142 = !z6;
                            if (!z6) {
                            }
                            if (!z6) {
                            }
                            TextStyle textStyle52 = textStyle3;
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1242950016, "CC(remember):BasicTextField.kt#9igjgp");
                            z9 = ((i29 & 14) != 4) | ((i29 & LDSFile.EF_DG16_TAG) == 32);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z9) {
                                objRememberedValue = (Function1) new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$11$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue2) {
                                        invoke2(textFieldValue2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TextFieldValue textFieldValue2) {
                                        if (Intrinsics.areEqual(textFieldValue, textFieldValue2)) {
                                            return;
                                        }
                                        function1.invoke(textFieldValue2);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                int i392 = i35 << 9;
                                int i402 = ((i29 >> 6) & 7168) | (i29 & 910) | (i392 & 57344) | (i392 & 458752) | (i392 & 3670016) | (i392 & 29360128);
                                int i412 = (i29 & 7168) | ((i29 >> 15) & 896) | (57344 & i29) | (i35 & 458752);
                                boolean z152 = z6;
                                Function1<? super TextLayoutResult, Unit> function142 = c093010;
                                KeyboardOptions keyboardOptions52 = keyboardOptions3;
                                VisualTransformation visualTransformation32 = none;
                                MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                                CoreTextFieldKt.CoreTextField(textFieldValue, (Function1) objRememberedValue, modifier42, textStyle52, visualTransformation32, function142, mutableInteractionSource42, brush2, z142, i38, i37, imeOptions$foundation_release2, keyboardActions4, z7, z8, function332, composerStartRestartGroup, i402, i412, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                keyboardActions5 = keyboardActions4;
                                composer2 = composerStartRestartGroup;
                                i30 = i27;
                                i31 = i28;
                                z10 = z152;
                                visualTransformation2 = visualTransformation32;
                                z11 = z7;
                                function32 = function332;
                                function13 = function142;
                                brush3 = brush2;
                                z12 = z8;
                                keyboardOptions4 = keyboardOptions52;
                                mutableInteractionSource3 = mutableInteractionSource42;
                                textStyle4 = textStyle52;
                                modifier3 = modifier42;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            i30 = i;
                            visualTransformation2 = visualTransformation;
                            function32 = function3;
                            composer2 = composerStartRestartGroup;
                            z11 = z4;
                            keyboardActions5 = keyboardActions2;
                            z12 = z5;
                            textStyle4 = textStyle2;
                            keyboardOptions4 = keyboardOptions2;
                            modifier3 = modifier2;
                            z10 = z3;
                            i31 = i2;
                            function13 = function12;
                            mutableInteractionSource3 = mutableInteractionSource;
                            brush3 = brush;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.12
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

                                public final void invoke(Composer composer3, int i42) {
                                    BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifier3, z11, z12, textStyle4, keyboardOptions4, keyboardActions5, z10, i30, i31, visualTransformation2, function13, mutableInteractionSource3, brush3, function32, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i23 = i21 | 24576;
                    i24 = i5 & 32768;
                    if (i24 != 0) {
                    }
                    int i352 = i23;
                    if ((i6 & 306783379) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i3 & 1) != 0) {
                            if (i32 != 0) {
                            }
                            if (i7 != 0) {
                            }
                            if (i8 != 0) {
                            }
                            if (i9 != 0) {
                            }
                            if (i10 != 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if ((i5 & 512) == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if (i20 == 0) {
                            }
                            if (i22 == 0) {
                            }
                            if (i24 == 0) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z5 = z2;
                i9 = i5 & 32;
                if (i9 == 0) {
                }
                i10 = i5 & 64;
                if (i10 == 0) {
                }
                i11 = i5 & 128;
                if (i11 == 0) {
                }
                i12 = i5 & 256;
                if (i12 == 0) {
                }
                if ((i3 & 805306368) == 0) {
                }
                i13 = i5 & 1024;
                if (i13 == 0) {
                }
                i16 = i5 & 2048;
                if (i16 == 0) {
                }
                int i332 = i15;
                i18 = i5 & 4096;
                if (i18 == 0) {
                }
                i20 = i5 & 8192;
                if (i20 == 0) {
                }
                i22 = i5 & 16384;
                if (i22 != 0) {
                }
                i24 = i5 & 32768;
                if (i24 != 0) {
                }
                int i3522 = i23;
                if ((i6 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z4 = z;
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            z5 = z2;
            i9 = i5 & 32;
            if (i9 == 0) {
            }
            i10 = i5 & 64;
            if (i10 == 0) {
            }
            i11 = i5 & 128;
            if (i11 == 0) {
            }
            i12 = i5 & 256;
            if (i12 == 0) {
            }
            if ((i3 & 805306368) == 0) {
            }
            i13 = i5 & 1024;
            if (i13 == 0) {
            }
            i16 = i5 & 2048;
            if (i16 == 0) {
            }
            int i3322 = i15;
            i18 = i5 & 4096;
            if (i18 == 0) {
            }
            i20 = i5 & 8192;
            if (i20 == 0) {
            }
            i22 = i5 & 16384;
            if (i22 != 0) {
            }
            i24 = i5 & 32768;
            if (i24 != 0) {
            }
            int i35222 = i23;
            if ((i6 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        z4 = z;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        z5 = z2;
        i9 = i5 & 32;
        if (i9 == 0) {
        }
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        i11 = i5 & 128;
        if (i11 == 0) {
        }
        i12 = i5 & 256;
        if (i12 == 0) {
        }
        if ((i3 & 805306368) == 0) {
        }
        i13 = i5 & 1024;
        if (i13 == 0) {
        }
        i16 = i5 & 2048;
        if (i16 == 0) {
        }
        int i33222 = i15;
        i18 = i5 & 4096;
        if (i18 == 0) {
        }
        i20 = i5 & 8192;
        if (i20 == 0) {
        }
        i22 = i5 & 16384;
        if (i22 != 0) {
        }
        i24 = i5 & 32768;
        if (i24 != 0) {
        }
        int i352222 = i23;
        if ((i6 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012b  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void BasicTextField(final String str, final Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3 function3, Composer composer, final int i2, final int i3, final int i4) {
        String str2;
        int i5;
        Function1 function13;
        int i6;
        Modifier modifier2;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        int i9;
        TextStyle textStyle2;
        int i10;
        KeyboardOptions keyboardOptions2;
        int i11;
        KeyboardActions keyboardActions2;
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
        int i23;
        int i24;
        int i25;
        boolean z6;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        boolean z7;
        int i26;
        Brush solidColor;
        Composer composer2;
        final Modifier modifier3;
        final boolean z8;
        final boolean z9;
        final TextStyle textStyle3;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final boolean z10;
        final int i27;
        final VisualTransformation visualTransformation2;
        final Function1 function14;
        final MutableInteractionSource mutableInteractionSource4;
        final Brush brush2;
        final Function3 function32;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-454732590);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicTextField)P(13,9,7,2,10,12,5,4,11,6,14,8,3)802@41349L39,807@41589L579:BasicTextField.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
            str2 = str;
        } else if ((i2 & 6) == 0) {
            str2 = str;
            i5 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function13 = function1;
                i5 |= composerStartRestartGroup.changedInstance(function13) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    modifier2 = modifier;
                    i5 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        z4 = z;
                        i5 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            z5 = z2;
                            i5 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
                        }
                        i9 = i4 & 32;
                        if (i9 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                            textStyle2 = textStyle;
                        } else {
                            textStyle2 = textStyle;
                            if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                                i5 |= composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536;
                            }
                        }
                        i10 = i4 & 64;
                        if (i10 != 0) {
                            i5 |= 1572864;
                            keyboardOptions2 = keyboardOptions;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                            if ((i2 & 1572864) == 0) {
                                i5 |= composerStartRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288;
                            }
                        }
                        i11 = i4 & 128;
                        if (i11 != 0) {
                            i5 |= 12582912;
                            keyboardActions2 = keyboardActions;
                        } else {
                            keyboardActions2 = keyboardActions;
                            if ((i2 & 12582912) == 0) {
                                i5 |= composerStartRestartGroup.changed(keyboardActions2) ? 8388608 : 4194304;
                            }
                        }
                        i12 = i4 & 256;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i5 |= composerStartRestartGroup.changed(z3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i13 = i4 & 512;
                        if (i13 == 0) {
                            if ((i2 & 805306368) == 0) {
                                i14 = i13;
                                i5 |= composerStartRestartGroup.changed(i) ? PKIFailureInfo.duplicateCertReq : 268435456;
                            }
                            i15 = i4 & 1024;
                            if (i15 == 0) {
                                i17 = i3 | 6;
                                i16 = i15;
                            } else if ((i3 & 6) == 0) {
                                i16 = i15;
                                i17 = i3 | (composerStartRestartGroup.changed(visualTransformation) ? 4 : 2);
                            } else {
                                i16 = i15;
                                i17 = i3;
                            }
                            i18 = i4 & 2048;
                            if (i18 == 0) {
                                i17 |= 48;
                                i19 = i18;
                            } else if ((i3 & 48) == 0) {
                                i19 = i18;
                                i17 |= composerStartRestartGroup.changedInstance(function12) ? 32 : 16;
                            } else {
                                i19 = i18;
                            }
                            int i28 = i17;
                            i20 = i4 & 4096;
                            if (i20 == 0) {
                                i21 = i28 | 384;
                            } else {
                                int i29 = i28;
                                if ((i3 & 384) == 0) {
                                    i29 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                                }
                                i21 = i29;
                            }
                            i22 = i4 & 8192;
                            if (i22 == 0) {
                                i23 = i21 | 3072;
                            } else {
                                int i30 = i21;
                                if ((i3 & 3072) == 0) {
                                    i23 = i30 | (composerStartRestartGroup.changed(brush) ? 2048 : 1024);
                                } else {
                                    i23 = i30;
                                }
                            }
                            i24 = i4 & 16384;
                            if (i24 == 0) {
                                i25 = i23 | 24576;
                            } else {
                                int i31 = i23;
                                if ((i3 & 24576) == 0) {
                                    i31 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
                                }
                                i25 = i31;
                            }
                            if ((i5 & 306783379) == 306783378 || (i25 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                                if (i6 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                boolean z11 = i7 == 0 ? true : z4;
                                boolean z12 = i8 == 0 ? false : z5;
                                TextStyle textStyle4 = i9 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle2;
                                KeyboardOptions keyboardOptions4 = i10 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions2;
                                KeyboardActions keyboardActions4 = i11 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions2;
                                boolean z13 = i12 == 0 ? false : z3;
                                int i32 = i14 == 0 ? Integer.MAX_VALUE : i;
                                VisualTransformation none = i16 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                Function1 function15 = i19 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.13
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TextLayoutResult textLayoutResult) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                } : function12;
                                if (i20 == 0) {
                                    z6 = z11;
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1242906291, "CC(remember):BasicTextField.kt#9igjgp");
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                } else {
                                    z6 = z11;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if (i22 == 0) {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    z7 = z12;
                                    i26 = i24;
                                    solidColor = new SolidColor(Color.INSTANCE.m4621getBlack0d7_KjU(), null);
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    z7 = z12;
                                    i26 = i24;
                                    solidColor = brush;
                                }
                                Function3 function3M1743getLambda3$foundation_release = i26 == 0 ? ComposableSingletons$BasicTextFieldKt.INSTANCE.m1743getLambda3$foundation_release() : function3;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-454732590, i5, i25, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:806)");
                                }
                                int i33 = i25 << 3;
                                boolean z14 = z7;
                                MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                composer2 = composerStartRestartGroup;
                                String str3 = str2;
                                Function1 function16 = function13;
                                TextStyle textStyle5 = textStyle4;
                                Modifier modifier4 = modifier2;
                                VisualTransformation visualTransformation3 = none;
                                boolean z15 = z6;
                                BasicTextField(str3, (Function1<? super String, Unit>) function16, modifier4, z15, z14, textStyle5, keyboardOptions4, keyboardActions4, z13, i32, 1, visualTransformation3, (Function1<? super TextLayoutResult, Unit>) function15, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3M1743getLambda3$foundation_release, composer2, i5 & 2147483646, (i33 & LDSFile.EF_DG16_TAG) | 6 | (i33 & 896) | (i33 & 7168) | (57344 & i33) | (i33 & 458752), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                z8 = z15;
                                z9 = z14;
                                textStyle3 = textStyle5;
                                keyboardOptions3 = keyboardOptions4;
                                keyboardActions3 = keyboardActions4;
                                z10 = z13;
                                i27 = i32;
                                visualTransformation2 = visualTransformation3;
                                function14 = function15;
                                mutableInteractionSource4 = mutableInteractionSource5;
                                brush2 = solidColor;
                                function32 = function3M1743getLambda3$foundation_release;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                z10 = z3;
                                function14 = function12;
                                mutableInteractionSource4 = mutableInteractionSource;
                                composer2 = composerStartRestartGroup;
                                z8 = z4;
                                z9 = z5;
                                textStyle3 = textStyle2;
                                keyboardOptions3 = keyboardOptions2;
                                keyboardActions3 = keyboardActions2;
                                modifier3 = modifier2;
                                i27 = i;
                                visualTransformation2 = visualTransformation;
                                brush2 = brush;
                                function32 = function3;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.15
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

                                    public final void invoke(Composer composer3, int i34) {
                                        BasicTextFieldKt.BasicTextField(str, function1, modifier3, z8, z9, textStyle3, keyboardOptions3, keyboardActions3, z10, i27, visualTransformation2, function14, mutableInteractionSource4, brush2, function32, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= 805306368;
                        i14 = i13;
                        i15 = i4 & 1024;
                        if (i15 == 0) {
                        }
                        i18 = i4 & 2048;
                        if (i18 == 0) {
                        }
                        int i282 = i17;
                        i20 = i4 & 4096;
                        if (i20 == 0) {
                        }
                        i22 = i4 & 8192;
                        if (i22 == 0) {
                        }
                        i24 = i4 & 16384;
                        if (i24 == 0) {
                        }
                        if ((i5 & 306783379) == 306783378) {
                            if (i6 != 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            if (i20 == 0) {
                            }
                            if (i22 == 0) {
                            }
                            if (i26 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i332 = i25 << 3;
                            boolean z142 = z7;
                            MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                            composer2 = composerStartRestartGroup;
                            String str32 = str2;
                            Function1 function162 = function13;
                            TextStyle textStyle52 = textStyle4;
                            Modifier modifier42 = modifier2;
                            VisualTransformation visualTransformation32 = none;
                            boolean z152 = z6;
                            BasicTextField(str32, (Function1<? super String, Unit>) function162, modifier42, z152, z142, textStyle52, keyboardOptions4, keyboardActions4, z13, i32, 1, visualTransformation32, (Function1<? super TextLayoutResult, Unit>) function15, mutableInteractionSource52, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3M1743getLambda3$foundation_release, composer2, i5 & 2147483646, (i332 & LDSFile.EF_DG16_TAG) | 6 | (i332 & 896) | (i332 & 7168) | (57344 & i332) | (i332 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier42;
                            z8 = z152;
                            z9 = z142;
                            textStyle3 = textStyle52;
                            keyboardOptions3 = keyboardOptions4;
                            keyboardActions3 = keyboardActions4;
                            z10 = z13;
                            i27 = i32;
                            visualTransformation2 = visualTransformation32;
                            function14 = function15;
                            mutableInteractionSource4 = mutableInteractionSource52;
                            brush2 = solidColor;
                            function32 = function3M1743getLambda3$foundation_release;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    z5 = z2;
                    i9 = i4 & 32;
                    if (i9 != 0) {
                    }
                    i10 = i4 & 64;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i4 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i4 & 512;
                    if (i13 == 0) {
                    }
                    i14 = i13;
                    i15 = i4 & 1024;
                    if (i15 == 0) {
                    }
                    i18 = i4 & 2048;
                    if (i18 == 0) {
                    }
                    int i2822 = i17;
                    i20 = i4 & 4096;
                    if (i20 == 0) {
                    }
                    i22 = i4 & 8192;
                    if (i22 == 0) {
                    }
                    i24 = i4 & 16384;
                    if (i24 == 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z4 = z;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                z5 = z2;
                i9 = i4 & 32;
                if (i9 != 0) {
                }
                i10 = i4 & 64;
                if (i10 != 0) {
                }
                i11 = i4 & 128;
                if (i11 != 0) {
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                }
                i13 = i4 & 512;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i4 & 1024;
                if (i15 == 0) {
                }
                i18 = i4 & 2048;
                if (i18 == 0) {
                }
                int i28222 = i17;
                i20 = i4 & 4096;
                if (i20 == 0) {
                }
                i22 = i4 & 8192;
                if (i22 == 0) {
                }
                i24 = i4 & 16384;
                if (i24 == 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            z4 = z;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            z5 = z2;
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            i10 = i4 & 64;
            if (i10 != 0) {
            }
            i11 = i4 & 128;
            if (i11 != 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i4 & 512;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i4 & 1024;
            if (i15 == 0) {
            }
            i18 = i4 & 2048;
            if (i18 == 0) {
            }
            int i282222 = i17;
            i20 = i4 & 4096;
            if (i20 == 0) {
            }
            i22 = i4 & 8192;
            if (i22 == 0) {
            }
            i24 = i4 & 16384;
            if (i24 == 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function13 = function1;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        modifier2 = modifier;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        z4 = z;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        z5 = z2;
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        i10 = i4 & 64;
        if (i10 != 0) {
        }
        i11 = i4 & 128;
        if (i11 != 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i4 & 512;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i4 & 1024;
        if (i15 == 0) {
        }
        i18 = i4 & 2048;
        if (i18 == 0) {
        }
        int i2822222 = i17;
        i20 = i4 & 4096;
        if (i20 == 0) {
        }
        i22 = i4 & 8192;
        if (i22 == 0) {
        }
        i24 = i4 & 16384;
        if (i24 == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012b  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void BasicTextField(final TextFieldValue textFieldValue, final Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z3, int i, VisualTransformation visualTransformation, Function1 function12, MutableInteractionSource mutableInteractionSource, Brush brush, Function3 function3, Composer composer, final int i2, final int i3, final int i4) {
        TextFieldValue textFieldValue2;
        int i5;
        Function1 function13;
        int i6;
        Modifier modifier2;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        int i9;
        TextStyle textStyle2;
        int i10;
        KeyboardOptions keyboardOptions2;
        int i11;
        KeyboardActions keyboardActions2;
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
        int i23;
        int i24;
        int i25;
        boolean z6;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        boolean z7;
        int i26;
        Brush solidColor;
        Composer composer2;
        final Modifier modifier3;
        final boolean z8;
        final boolean z9;
        final TextStyle textStyle3;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final boolean z10;
        final int i27;
        final VisualTransformation visualTransformation2;
        final Function1 function14;
        final MutableInteractionSource mutableInteractionSource4;
        final Brush brush2;
        final Function3 function32;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-560482651);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicTextField)P(13,9,7,2,10,12,5,4,11,6,14,8,3)842@42874L39,847@43114L579:BasicTextField.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
            textFieldValue2 = textFieldValue;
        } else if ((i2 & 6) == 0) {
            textFieldValue2 = textFieldValue;
            i5 = (composerStartRestartGroup.changed(textFieldValue2) ? 4 : 2) | i2;
        } else {
            textFieldValue2 = textFieldValue;
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                function13 = function1;
                i5 |= composerStartRestartGroup.changedInstance(function13) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    modifier2 = modifier;
                    i5 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        z4 = z;
                        i5 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            z5 = z2;
                            i5 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
                        }
                        i9 = i4 & 32;
                        if (i9 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                            textStyle2 = textStyle;
                        } else {
                            textStyle2 = textStyle;
                            if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                                i5 |= composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536;
                            }
                        }
                        i10 = i4 & 64;
                        if (i10 != 0) {
                            i5 |= 1572864;
                            keyboardOptions2 = keyboardOptions;
                        } else {
                            keyboardOptions2 = keyboardOptions;
                            if ((i2 & 1572864) == 0) {
                                i5 |= composerStartRestartGroup.changed(keyboardOptions2) ? 1048576 : 524288;
                            }
                        }
                        i11 = i4 & 128;
                        if (i11 != 0) {
                            i5 |= 12582912;
                            keyboardActions2 = keyboardActions;
                        } else {
                            keyboardActions2 = keyboardActions;
                            if ((i2 & 12582912) == 0) {
                                i5 |= composerStartRestartGroup.changed(keyboardActions2) ? 8388608 : 4194304;
                            }
                        }
                        i12 = i4 & 256;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i5 |= composerStartRestartGroup.changed(z3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i13 = i4 & 512;
                        if (i13 == 0) {
                            if ((i2 & 805306368) == 0) {
                                i14 = i13;
                                i5 |= composerStartRestartGroup.changed(i) ? PKIFailureInfo.duplicateCertReq : 268435456;
                            }
                            i15 = i4 & 1024;
                            if (i15 == 0) {
                                i17 = i3 | 6;
                                i16 = i15;
                            } else if ((i3 & 6) == 0) {
                                i16 = i15;
                                i17 = i3 | (composerStartRestartGroup.changed(visualTransformation) ? 4 : 2);
                            } else {
                                i16 = i15;
                                i17 = i3;
                            }
                            i18 = i4 & 2048;
                            if (i18 == 0) {
                                i17 |= 48;
                                i19 = i18;
                            } else if ((i3 & 48) == 0) {
                                i19 = i18;
                                i17 |= composerStartRestartGroup.changedInstance(function12) ? 32 : 16;
                            } else {
                                i19 = i18;
                            }
                            int i28 = i17;
                            i20 = i4 & 4096;
                            if (i20 == 0) {
                                i21 = i28 | 384;
                            } else {
                                int i29 = i28;
                                if ((i3 & 384) == 0) {
                                    i29 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                                }
                                i21 = i29;
                            }
                            i22 = i4 & 8192;
                            if (i22 == 0) {
                                i23 = i21 | 3072;
                            } else {
                                int i30 = i21;
                                if ((i3 & 3072) == 0) {
                                    i23 = i30 | (composerStartRestartGroup.changed(brush) ? 2048 : 1024);
                                } else {
                                    i23 = i30;
                                }
                            }
                            i24 = i4 & 16384;
                            if (i24 == 0) {
                                i25 = i23 | 24576;
                            } else {
                                int i31 = i23;
                                if ((i3 & 24576) == 0) {
                                    i31 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
                                }
                                i25 = i31;
                            }
                            if ((i5 & 306783379) == 306783378 || (i25 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                                if (i6 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                boolean z11 = i7 == 0 ? true : z4;
                                boolean z12 = i8 == 0 ? false : z5;
                                TextStyle textStyle4 = i9 == 0 ? TextStyle.INSTANCE.getDefault() : textStyle2;
                                KeyboardOptions keyboardOptions4 = i10 == 0 ? KeyboardOptions.INSTANCE.getDefault() : keyboardOptions2;
                                KeyboardActions keyboardActions4 = i11 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions2;
                                boolean z13 = i12 == 0 ? false : z3;
                                int i32 = i14 == 0 ? Integer.MAX_VALUE : i;
                                VisualTransformation none = i16 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                Function1 function15 = i19 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.16
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(TextLayoutResult textLayoutResult) {
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                } : function12;
                                if (i20 == 0) {
                                    z6 = z11;
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1242857491, "CC(remember):BasicTextField.kt#9igjgp");
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                } else {
                                    z6 = z11;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                                if (i22 == 0) {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    z7 = z12;
                                    i26 = i24;
                                    solidColor = new SolidColor(Color.INSTANCE.m4621getBlack0d7_KjU(), null);
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    z7 = z12;
                                    i26 = i24;
                                    solidColor = brush;
                                }
                                Function3 function3M1744getLambda4$foundation_release = i26 == 0 ? ComposableSingletons$BasicTextFieldKt.INSTANCE.m1744getLambda4$foundation_release() : function3;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-560482651, i5, i25, "androidx.compose.foundation.text.BasicTextField (BasicTextField.kt:846)");
                                }
                                int i33 = i25 << 3;
                                boolean z14 = z7;
                                MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                composer2 = composerStartRestartGroup;
                                TextFieldValue textFieldValue3 = textFieldValue2;
                                Function1 function16 = function13;
                                TextStyle textStyle5 = textStyle4;
                                Modifier modifier4 = modifier2;
                                VisualTransformation visualTransformation3 = none;
                                boolean z15 = z6;
                                BasicTextField(textFieldValue3, (Function1<? super TextFieldValue, Unit>) function16, modifier4, z15, z14, textStyle5, keyboardOptions4, keyboardActions4, z13, i32, 1, visualTransformation3, (Function1<? super TextLayoutResult, Unit>) function15, mutableInteractionSource5, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3M1744getLambda4$foundation_release, composer2, i5 & 2147483646, (i33 & LDSFile.EF_DG16_TAG) | 6 | (i33 & 896) | (i33 & 7168) | (57344 & i33) | (i33 & 458752), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                z8 = z15;
                                z9 = z14;
                                textStyle3 = textStyle5;
                                keyboardOptions3 = keyboardOptions4;
                                keyboardActions3 = keyboardActions4;
                                z10 = z13;
                                i27 = i32;
                                visualTransformation2 = visualTransformation3;
                                function14 = function15;
                                mutableInteractionSource4 = mutableInteractionSource5;
                                brush2 = solidColor;
                                function32 = function3M1744getLambda4$foundation_release;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                z10 = z3;
                                function14 = function12;
                                mutableInteractionSource4 = mutableInteractionSource;
                                composer2 = composerStartRestartGroup;
                                z8 = z4;
                                z9 = z5;
                                textStyle3 = textStyle2;
                                keyboardOptions3 = keyboardOptions2;
                                keyboardActions3 = keyboardActions2;
                                modifier3 = modifier2;
                                i27 = i;
                                visualTransformation2 = visualTransformation;
                                brush2 = brush;
                                function32 = function3;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField.18
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

                                    public final void invoke(Composer composer3, int i34) {
                                        BasicTextFieldKt.BasicTextField(textFieldValue, function1, modifier3, z8, z9, textStyle3, keyboardOptions3, keyboardActions3, z10, i27, visualTransformation2, function14, mutableInteractionSource4, brush2, function32, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= 805306368;
                        i14 = i13;
                        i15 = i4 & 1024;
                        if (i15 == 0) {
                        }
                        i18 = i4 & 2048;
                        if (i18 == 0) {
                        }
                        int i282 = i17;
                        i20 = i4 & 4096;
                        if (i20 == 0) {
                        }
                        i22 = i4 & 8192;
                        if (i22 == 0) {
                        }
                        i24 = i4 & 16384;
                        if (i24 == 0) {
                        }
                        if ((i5 & 306783379) == 306783378) {
                            if (i6 != 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i19 == 0) {
                            }
                            if (i20 == 0) {
                            }
                            if (i22 == 0) {
                            }
                            if (i26 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i332 = i25 << 3;
                            boolean z142 = z7;
                            MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                            composer2 = composerStartRestartGroup;
                            TextFieldValue textFieldValue32 = textFieldValue2;
                            Function1 function162 = function13;
                            TextStyle textStyle52 = textStyle4;
                            Modifier modifier42 = modifier2;
                            VisualTransformation visualTransformation32 = none;
                            boolean z152 = z6;
                            BasicTextField(textFieldValue32, (Function1<? super TextFieldValue, Unit>) function162, modifier42, z152, z142, textStyle52, keyboardOptions4, keyboardActions4, z13, i32, 1, visualTransformation32, (Function1<? super TextLayoutResult, Unit>) function15, mutableInteractionSource52, solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) function3M1744getLambda4$foundation_release, composer2, i5 & 2147483646, (i332 & LDSFile.EF_DG16_TAG) | 6 | (i332 & 896) | (i332 & 7168) | (57344 & i332) | (i332 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier42;
                            z8 = z152;
                            z9 = z142;
                            textStyle3 = textStyle52;
                            keyboardOptions3 = keyboardOptions4;
                            keyboardActions3 = keyboardActions4;
                            z10 = z13;
                            i27 = i32;
                            visualTransformation2 = visualTransformation32;
                            function14 = function15;
                            mutableInteractionSource4 = mutableInteractionSource52;
                            brush2 = solidColor;
                            function32 = function3M1744getLambda4$foundation_release;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    z5 = z2;
                    i9 = i4 & 32;
                    if (i9 != 0) {
                    }
                    i10 = i4 & 64;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i4 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i4 & 512;
                    if (i13 == 0) {
                    }
                    i14 = i13;
                    i15 = i4 & 1024;
                    if (i15 == 0) {
                    }
                    i18 = i4 & 2048;
                    if (i18 == 0) {
                    }
                    int i2822 = i17;
                    i20 = i4 & 4096;
                    if (i20 == 0) {
                    }
                    i22 = i4 & 8192;
                    if (i22 == 0) {
                    }
                    i24 = i4 & 16384;
                    if (i24 == 0) {
                    }
                    if ((i5 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z4 = z;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                z5 = z2;
                i9 = i4 & 32;
                if (i9 != 0) {
                }
                i10 = i4 & 64;
                if (i10 != 0) {
                }
                i11 = i4 & 128;
                if (i11 != 0) {
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                }
                i13 = i4 & 512;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i4 & 1024;
                if (i15 == 0) {
                }
                i18 = i4 & 2048;
                if (i18 == 0) {
                }
                int i28222 = i17;
                i20 = i4 & 4096;
                if (i20 == 0) {
                }
                i22 = i4 & 8192;
                if (i22 == 0) {
                }
                i24 = i4 & 16384;
                if (i24 == 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            z4 = z;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            z5 = z2;
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            i10 = i4 & 64;
            if (i10 != 0) {
            }
            i11 = i4 & 128;
            if (i11 != 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i4 & 512;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i4 & 1024;
            if (i15 == 0) {
            }
            i18 = i4 & 2048;
            if (i18 == 0) {
            }
            int i282222 = i17;
            i20 = i4 & 4096;
            if (i20 == 0) {
            }
            i22 = i4 & 8192;
            if (i22 == 0) {
            }
            i24 = i4 & 16384;
            if (i24 == 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function13 = function1;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        modifier2 = modifier;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        z4 = z;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        z5 = z2;
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        i10 = i4 & 64;
        if (i10 != 0) {
        }
        i11 = i4 & 128;
        if (i11 != 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i4 & 512;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i4 & 1024;
        if (i15 == 0) {
        }
        i18 = i4 & 2048;
        if (i18 == 0) {
        }
        int i2822222 = i17;
        i20 = i4 & 4096;
        if (i20 == 0) {
        }
        i22 = i4 & 8192;
        if (i22 == 0) {
        }
        i24 = i4 & 16384;
        if (i24 == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final TextFieldHandleState TextFieldCursorHandle$lambda$9(State<TextFieldHandleState> state) {
        return state.getValue();
    }

    private static final TextFieldHandleState TextFieldSelectionHandles$lambda$13(State<TextFieldHandleState> state) {
        return state.getValue();
    }

    private static final TextFieldHandleState TextFieldSelectionHandles$lambda$17(State<TextFieldHandleState> state) {
        return state.getValue();
    }
}
