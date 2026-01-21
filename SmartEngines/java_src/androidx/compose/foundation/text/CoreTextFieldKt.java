package androidx.compose.foundation.text;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.handwriting.StylusHandwritingKt;
import androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNodeKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.DrawModifierKt;
import androidx.compose.p000ui.focus.FocusManager;
import androidx.compose.p000ui.focus.FocusRequester;
import androidx.compose.p000ui.focus.FocusState;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.geometry.Rect;
import androidx.compose.p000ui.graphics.Brush;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.SolidColor;
import androidx.compose.p000ui.graphics.drawscope.DrawScope;
import androidx.compose.p000ui.hapticfeedback.HapticFeedback;
import androidx.compose.p000ui.input.key.KeyEvent;
import androidx.compose.p000ui.input.key.KeyInputModifierKt;
import androidx.compose.p000ui.input.pointer.PointerIconKt;
import androidx.compose.p000ui.input.pointer.PointerInputScope;
import androidx.compose.p000ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p000ui.layout.AlignmentLineKt;
import androidx.compose.p000ui.layout.IntrinsicMeasurable;
import androidx.compose.p000ui.layout.IntrinsicMeasureScope;
import androidx.compose.p000ui.layout.LayoutCoordinates;
import androidx.compose.p000ui.layout.Measurable;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.layout.MeasureResult;
import androidx.compose.p000ui.layout.MeasureScope;
import androidx.compose.p000ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p000ui.layout.Placeable;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.ClipboardManager;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.platform.SoftwareKeyboardController;
import androidx.compose.p000ui.platform.TextToolbar;
import androidx.compose.p000ui.platform.WindowInfo;
import androidx.compose.p000ui.semantics.SemanticsModifierKt;
import androidx.compose.p000ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p000ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p000ui.text.AnnotatedString;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextRange;
import androidx.compose.p000ui.text.TextRangeKt;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.input.CommitTextCommand;
import androidx.compose.p000ui.text.input.DeleteAllCommand;
import androidx.compose.p000ui.text.input.EditCommand;
import androidx.compose.p000ui.text.input.FinishComposingTextCommand;
import androidx.compose.p000ui.text.input.ImeAction;
import androidx.compose.p000ui.text.input.ImeOptions;
import androidx.compose.p000ui.text.input.KeyboardType;
import androidx.compose.p000ui.text.input.OffsetMapping;
import androidx.compose.p000ui.text.input.PasswordVisualTransformation;
import androidx.compose.p000ui.text.input.TextFieldValue;
import androidx.compose.p000ui.text.input.TextInputService;
import androidx.compose.p000ui.text.input.TextInputSession;
import androidx.compose.p000ui.text.input.TransformedText;
import androidx.compose.p000ui.text.input.VisualTransformation;
import androidx.compose.p000ui.text.style.ResolvedTextDirection;
import androidx.compose.p000ui.unit.Density;
import androidx.compose.p000ui.unit.IntSize;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.jmrtd.lds.LDSFile;

/* compiled from: CoreTextField.kt */
@Metadata(m513d1 = {"\u0000\u009a\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aî\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u001323\b\u0002\u0010\u001d\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00010\u001e¢\u0006\u0002\b\u001f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u001fH\u0001¢\u0006\u0002\u0010#\u001a0\u0010$\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010%\u001a\u00020&2\u0011\u0010'\u001a\r\u0012\u0004\u0012\u00020\u00010\u001e¢\u0006\u0002\b\u001fH\u0003¢\u0006\u0002\u0010(\u001a\u001d\u0010)\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\u0006\u0010*\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010+\u001a\u0015\u0010,\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\u0010-\u001a\u0010\u0010.\u001a\u00020\u00012\u0006\u0010/\u001a\u000200H\u0002\u001a \u00101\u001a\u00020\u00012\u0006\u0010/\u001a\u0002002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00102\u001a\u000203H\u0002\u001a0\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u0002062\u0006\u0010/\u001a\u0002002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u00102\u001a\u000203H\u0002\u001a \u00107\u001a\u00020\u00012\u0006\u0010/\u001a\u0002002\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0013H\u0002\u001a2\u0010;\u001a\u00020\u0001*\u00020<2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\r2\u0006\u00102\u001a\u000203H\u0080@¢\u0006\u0002\u0010@\u001a\u001c\u0010A\u001a\u00020\u0007*\u00020\u00072\u0006\u0010/\u001a\u0002002\u0006\u0010%\u001a\u00020&H\u0002¨\u0006B²\u0006\n\u0010C\u001a\u00020\u0013X\u008a\u0084\u0002"}, m514d2 = {"CoreTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "softWrap", "", "maxLines", "", "minLines", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "enabled", "readOnly", "decorationBox", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "innerTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "CoreTextFieldRootBox", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "content", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SelectionToolbarAndHandles", "show", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V", "TextFieldCursorHandle", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "endInputSession", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "notifyFocusedRect", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "startInputSession", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "tapToFocus", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "allowKeyboard", "bringSelectionEndIntoView", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "textDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "textLayoutResult", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "previewKeyEventToDeselectOnBack", "foundation_release", "writeable"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class CoreTextFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06fb A[PHI: r33 r52
  0x06fb: PHI (r33v15 androidx.compose.ui.text.input.ImeOptions) = (r33v8 androidx.compose.ui.text.input.ImeOptions), (r33v17 androidx.compose.ui.text.input.ImeOptions) binds: [B:321:0x06f9, B:318:0x06ea] A[DONT_GENERATE, DONT_INLINE]
  0x06fb: PHI (r52v14 boolean) = (r52v5 boolean), (r52v15 boolean) binds: [B:321:0x06f9, B:318:0x06ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x080f  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x092a  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x096a  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x096c  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0977  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x09be  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0a00  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0a3c  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0a64  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0a66  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0a6c  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0a72  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0a88  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0ab0  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0ab3  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0b04  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0b0c  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0b6f  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0b72  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0b7b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0bc6  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0bea  */
    /* JADX WARN: Removed duplicated region for block: B:497:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CoreTextField(final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, Modifier modifier, TextStyle textStyle, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, Unit> function12, MutableInteractionSource mutableInteractionSource, Brush brush, boolean z, int i, int i2, ImeOptions imeOptions, KeyboardActions keyboardActions, boolean z2, boolean z3, Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        Modifier modifier2;
        int i8;
        TextStyle textStyle2;
        int i9;
        int i10;
        C09531 c09531;
        int i11;
        MutableInteractionSource mutableInteractionSource2;
        int i12;
        Brush brush2;
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
        int i27;
        ImeOptions imeOptions2;
        MutableInteractionSource mutableInteractionSource3;
        int i28;
        Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function3M1745getLambda1$foundation_release;
        VisualTransformation visualTransformation2;
        Modifier modifier3;
        boolean z4;
        final boolean z5;
        boolean z6;
        TextStyle textStyle3;
        KeyboardActions keyboardActions2;
        final Function1<? super TextLayoutResult, Unit> function13;
        ImeOptions imeOptions3;
        int i29;
        boolean z7;
        Object objRememberedValue;
        Object objRememberedValue2;
        Object objRememberedValue3;
        int i30;
        Orientation orientation;
        boolean zChanged;
        int i31;
        boolean z8;
        Object objRememberedValue4;
        TextRange composition;
        ImeOptions imeOptions4;
        WindowInfo windowInfo;
        boolean zChanged2;
        TransformedText transformedText;
        AnnotatedString annotatedString;
        TextStyle textStyle4;
        boolean z9;
        FontFamily.Resolver resolver;
        Object objRememberedValue5;
        FocusManager focusManager;
        Object objRememberedValue6;
        Object objRememberedValue7;
        Object objRememberedValue8;
        int i32;
        ImeOptions imeOptions5;
        ImeOptions imeOptions6;
        final boolean z10;
        boolean zChangedInstance;
        final LegacyTextFieldState legacyTextFieldState;
        TextInputService textInputService;
        ImeOptions imeOptions7;
        final TextFieldSelectionManager textFieldSelectionManager;
        BringIntoViewRequester bringIntoViewRequester;
        VisualTransformation visualTransformation3;
        boolean z11;
        Object obj;
        boolean zChanged3;
        boolean z12;
        boolean z13;
        boolean z14;
        State state;
        final TextInputService textInputService2;
        CoreTextFieldKt$CoreTextField$2$1 coreTextFieldKt$CoreTextField$2$1;
        boolean zChangedInstance2;
        Object objRememberedValue9;
        boolean zChangedInstance3;
        boolean z15;
        Object obj2;
        final boolean z16;
        boolean zChangedInstance4;
        Object obj3;
        final WindowInfo windowInfo2;
        boolean zChangedInstance5;
        Object objRememberedValue10;
        boolean z17;
        final boolean z18;
        final boolean z19;
        boolean zChangedInstance6;
        boolean z20;
        final ImeOptions imeOptions8;
        final FocusRequester focusRequester;
        Object obj4;
        boolean zChangedInstance7;
        OffsetMapping offsetMapping;
        boolean zChangedInstance8;
        Object objRememberedValue11;
        boolean zChangedInstance9;
        Object objRememberedValue12;
        final boolean z21;
        Modifier.Companion companionTextFieldMagnifier;
        final int i33;
        final int i34;
        Composer composer2;
        final boolean z22;
        final Function1<? super TextLayoutResult, Unit> function14;
        final MutableInteractionSource mutableInteractionSource4;
        final Brush brush3;
        final KeyboardActions keyboardActions3;
        final ImeOptions imeOptions9;
        final boolean z23;
        final boolean z24;
        final TextStyle textStyle5;
        final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function32;
        final VisualTransformation visualTransformation4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-958708118);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CoreTextField)P(14,10,8,13,15,9,4!1,12,6,7,3,5,2,11)221@12329L29,222@12399L58,223@12503L72,228@12633L7,229@12694L7,230@12762L7,231@12827L7,232@12872L7,233@12941L7,241@13250L42,238@13157L135,244@13333L269,257@13907L21,258@13945L403,287@14747L26,290@14833L51,296@15136L7,297@15187L7,298@15244L7,303@15385L24,304@15443L37,311@15672L1487,352@17266L42,353@17334L970,353@17313L991,379@18375L28,380@18467L907,408@19636L516,425@20215L1473,462@21825L6646,616@28696L60,616@28670L86,620@28791L458,620@28762L487,647@29739L1132,694@31923L4765,694@31870L4818:CoreTextField.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(textFieldValue) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i6 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else {
                if ((i3 & 384) == 0) {
                    modifier2 = modifier;
                    i6 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        textStyle2 = textStyle;
                        i6 |= composerStartRestartGroup.changed(textStyle2) ? 2048 : 1024;
                    }
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else {
                        if ((i3 & 24576) == 0) {
                            i6 |= composerStartRestartGroup.changed(visualTransformation) ? 16384 : 8192;
                        }
                        i10 = i5 & 32;
                        if (i10 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                            c09531 = function12;
                        } else {
                            c09531 = function12;
                            if ((i3 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                                i6 |= composerStartRestartGroup.changedInstance(c09531) ? 131072 : 65536;
                            }
                        }
                        i11 = i5 & 64;
                        if (i11 != 0) {
                            i6 |= 1572864;
                            mutableInteractionSource2 = mutableInteractionSource;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            if ((i3 & 1572864) == 0) {
                                i6 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                            }
                        }
                        i12 = i5 & 128;
                        if (i12 != 0) {
                            i6 |= 12582912;
                            brush2 = brush;
                        } else {
                            brush2 = brush;
                            if ((i3 & 12582912) == 0) {
                                i6 |= composerStartRestartGroup.changed(brush2) ? 8388608 : 4194304;
                            }
                        }
                        i13 = i5 & 256;
                        if (i13 != 0) {
                            i6 |= 100663296;
                        } else {
                            if ((i3 & 100663296) == 0) {
                                i14 = i13;
                                i6 |= composerStartRestartGroup.changed(z) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            i15 = i5 & 512;
                            if (i15 != 0) {
                                if ((i3 & 805306368) == 0) {
                                    i16 = i15;
                                    i6 |= composerStartRestartGroup.changed(i) ? PKIFailureInfo.duplicateCertReq : 268435456;
                                }
                                i17 = i5 & 1024;
                                if (i17 != 0) {
                                    i19 = i4 | 6;
                                    i18 = i17;
                                } else if ((i4 & 6) == 0) {
                                    i18 = i17;
                                    i19 = i4 | (composerStartRestartGroup.changed(i2) ? 4 : 2);
                                } else {
                                    i18 = i17;
                                    i19 = i4;
                                }
                                if ((i4 & 48) == 0) {
                                    i19 |= ((i5 & 2048) == 0 && composerStartRestartGroup.changed(imeOptions)) ? 32 : 16;
                                }
                                int i35 = i19;
                                i20 = i5 & 4096;
                                if (i20 != 0) {
                                    i21 = i35 | 384;
                                } else if ((i4 & 384) == 0) {
                                    i21 = i35 | (composerStartRestartGroup.changed(keyboardActions) ? 256 : 128);
                                } else {
                                    i21 = i35;
                                }
                                i22 = i5 & 8192;
                                if (i22 != 0) {
                                    i23 = i21 | 3072;
                                } else {
                                    int i36 = i21;
                                    if ((i4 & 3072) == 0) {
                                        i23 = i36 | (composerStartRestartGroup.changed(z2) ? 2048 : 1024);
                                    } else {
                                        i23 = i36;
                                    }
                                }
                                i24 = i5 & 16384;
                                if (i24 != 0) {
                                    i25 = i23 | 24576;
                                } else {
                                    int i37 = i23;
                                    if ((i4 & 24576) == 0) {
                                        i25 = i37 | (composerStartRestartGroup.changed(z3) ? 16384 : 8192);
                                    } else {
                                        i25 = i37;
                                    }
                                }
                                i26 = i5 & 32768;
                                if (i26 != 0) {
                                    i25 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                                } else if ((i4 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                                    i25 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
                                }
                                if ((i6 & 306783379) != 306783378 || (i25 & 74899) != 74898 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if (i7 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i8 != 0) {
                                            textStyle2 = TextStyle.INSTANCE.getDefault();
                                        }
                                        VisualTransformation none = i9 == 0 ? VisualTransformation.INSTANCE.getNone() : visualTransformation;
                                        if (i10 != 0) {
                                            c09531 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.1
                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(TextLayoutResult textLayoutResult) {
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                    invoke2(textLayoutResult);
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                        }
                                        if (i11 != 0) {
                                            mutableInteractionSource2 = null;
                                        }
                                        SolidColor solidColor = i12 == 0 ? new SolidColor(Color.INSTANCE.m4631getUnspecified0d7_KjU(), null) : brush2;
                                        boolean z25 = i14 == 0 ? true : z;
                                        int i38 = i16 == 0 ? Integer.MAX_VALUE : i;
                                        i27 = i18 == 0 ? 1 : i2;
                                        if ((i5 & 2048) == 0) {
                                            imeOptions2 = ImeOptions.INSTANCE.getDefault();
                                            i25 &= -113;
                                        } else {
                                            imeOptions2 = imeOptions;
                                        }
                                        KeyboardActions keyboardActions4 = i20 == 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
                                        boolean z26 = i22 == 0 ? true : z2;
                                        boolean z27 = i24 == 0 ? false : z3;
                                        if (i26 == 0) {
                                            function3M1745getLambda1$foundation_release = ComposableSingletons$CoreTextFieldKt.INSTANCE.m1745getLambda1$foundation_release();
                                            int i39 = i38;
                                            brush2 = solidColor;
                                            mutableInteractionSource3 = mutableInteractionSource2;
                                            i28 = i39;
                                        } else {
                                            int i40 = i38;
                                            brush2 = solidColor;
                                            mutableInteractionSource3 = mutableInteractionSource2;
                                            i28 = i40;
                                            function3M1745getLambda1$foundation_release = function3;
                                        }
                                        visualTransformation2 = none;
                                        modifier3 = modifier2;
                                        z4 = z26;
                                        z5 = z27;
                                        z6 = z25;
                                        textStyle3 = textStyle2;
                                        keyboardActions2 = keyboardActions4;
                                        function13 = c09531;
                                        imeOptions3 = imeOptions2;
                                        i29 = i25;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i5 & 2048) != 0) {
                                            i25 &= -113;
                                        }
                                        visualTransformation2 = visualTransformation;
                                        z6 = z;
                                        i27 = i2;
                                        z5 = z3;
                                        function3M1745getLambda1$foundation_release = function3;
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                        function13 = c09531;
                                        textStyle3 = textStyle2;
                                        modifier3 = modifier2;
                                        i29 = i25;
                                        i28 = i;
                                        imeOptions3 = imeOptions;
                                        keyboardActions2 = keyboardActions;
                                        z4 = z2;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    TextStyle textStyle6 = textStyle3;
                                    if (ComposerKt.isTraceInProgress()) {
                                        z7 = z6;
                                    } else {
                                        z7 = z6;
                                        ComposerKt.traceEventStart(-958708118, i6, i29, "androidx.compose.foundation.text.CoreTextField (CoreTextField.kt:220)");
                                    }
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705356604, "CC(remember):CoreTextField.kt#9igjgp");
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    int i41 = i6;
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new FocusRequester();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    final FocusRequester focusRequester2 = (FocusRequester) objRememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705354335, "CC(remember):CoreTextField.kt#9igjgp");
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    Brush brush4 = brush2;
                                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = LegacyPlatformTextInputServiceAdapter_androidKt.createLegacyPlatformTextInputServiceAdapter();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    final LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter = (LegacyPlatformTextInputServiceAdapter) objRememberedValue2;
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705350993, "CC(remember):CoreTextField.kt#9igjgp");
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    final int i42 = i27;
                                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new TextInputService(legacyPlatformTextInputServiceAdapter);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    }
                                    final TextInputService textInputService3 = (TextInputService) objRememberedValue3;
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    KeyboardActions keyboardActions5 = keyboardActions2;
                                    int i43 = i29;
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume = composerStartRestartGroup.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    Density density = (Density) objConsume;
                                    ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver = CompositionLocalsKt.getLocalFontFamilyResolver();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume2 = composerStartRestartGroup.consume(localFontFamilyResolver);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    FontFamily.Resolver resolver2 = (FontFamily.Resolver) objConsume2;
                                    ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume3 = composerStartRestartGroup.consume(localTextSelectionColors);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    long backgroundColor = ((TextSelectionColors) objConsume3).getBackgroundColor();
                                    ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume4 = composerStartRestartGroup.consume(localFocusManager);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    FocusManager focusManager2 = (FocusManager) objConsume4;
                                    ProvidableCompositionLocal<WindowInfo> localWindowInfo = CompositionLocalsKt.getLocalWindowInfo();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume5 = composerStartRestartGroup.consume(localWindowInfo);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    WindowInfo windowInfo3 = (WindowInfo) objConsume5;
                                    ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController = CompositionLocalsKt.getLocalSoftwareKeyboardController();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume6 = composerStartRestartGroup.consume(localSoftwareKeyboardController);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) objConsume6;
                                    if (i28 != 1) {
                                        i30 = i43;
                                        if (!z7 && imeOptions3.getSingleLine()) {
                                            orientation = Orientation.Horizontal;
                                        }
                                        final Orientation orientation2 = orientation;
                                        Object[] objArr = {orientation2};
                                        Saver<TextFieldScrollerPosition, Object> saver = TextFieldScrollerPosition.INSTANCE.getSaver();
                                        Modifier modifier5 = modifier3;
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705327119, "CC(remember):CoreTextField.kt#9igjgp");
                                        zChanged = composerStartRestartGroup.changed(orientation2);
                                        Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                                        if (zChanged) {
                                            i31 = i28;
                                        } else {
                                            i31 = i28;
                                            if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            final TextFieldScrollerPosition textFieldScrollerPosition = (TextFieldScrollerPosition) RememberSaveableKt.m4181rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue13, composerStartRestartGroup, 0, 4);
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705324236, "CC(remember):CoreTextField.kt#9igjgp");
                                            int i44 = i41 & 14;
                                            z8 = (i44 != 4) | ((i41 & 57344) != 16384);
                                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                            if (!z8 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                TransformedText transformedTextFilterWithValidation = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, textFieldValue.getAnnotatedString());
                                                composition = textFieldValue.getComposition();
                                                imeOptions4 = imeOptions3;
                                                if (composition == null) {
                                                    windowInfo = windowInfo3;
                                                    objRememberedValue4 = TextFieldDelegate.INSTANCE.m1820applyCompositionDecoration72CqOWE(composition.getPackedValue(), transformedTextFilterWithValidation);
                                                    if (objRememberedValue4 == null) {
                                                    }
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                                } else {
                                                    windowInfo = windowInfo3;
                                                }
                                                objRememberedValue4 = transformedTextFilterWithValidation;
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                            } else {
                                                imeOptions4 = imeOptions3;
                                                windowInfo = windowInfo3;
                                            }
                                            TransformedText transformedText2 = (TransformedText) objRememberedValue4;
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            AnnotatedString text = transformedText2.getText();
                                            final OffsetMapping offsetMapping2 = transformedText2.getOffsetMapping();
                                            RecomposeScope currentRecomposeScope = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705304518, "CC(remember):CoreTextField.kt#9igjgp");
                                            zChanged2 = composerStartRestartGroup.changed(softwareKeyboardController);
                                            Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                                            if (zChanged2) {
                                                transformedText = transformedText2;
                                                if (objRememberedValue14 != Composer.INSTANCE.getEmpty()) {
                                                    annotatedString = text;
                                                    textStyle4 = textStyle6;
                                                    z9 = z7;
                                                    resolver = resolver2;
                                                }
                                                final LegacyTextFieldState legacyTextFieldState2 = (LegacyTextFieldState) objRememberedValue14;
                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                final Density density2 = density;
                                                legacyTextFieldState2.m1776updatefnh65Uc(textFieldValue.getAnnotatedString(), annotatedString, textStyle4, z9, density2, resolver, function1, keyboardActions5, focusManager2, backgroundColor);
                                                legacyTextFieldState2.getProcessor().reset(textFieldValue, legacyTextFieldState2.getInputSession());
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705279231, "CC(remember):CoreTextField.kt#9igjgp");
                                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                    focusManager = focusManager2;
                                                    objRememberedValue5 = new UndoManager(0, 1, null);
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                                } else {
                                                    focusManager = focusManager2;
                                                }
                                                UndoManager undoManager = (UndoManager) objRememberedValue5;
                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                UndoManager.snapshotIfNeeded$default(undoManager, textFieldValue, 0L, 2, null);
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705276454, "CC(remember):CoreTextField.kt#9igjgp");
                                                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue6 = new TextFieldSelectionManager(undoManager);
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                                }
                                                final TextFieldSelectionManager textFieldSelectionManager2 = (TextFieldSelectionManager) objRememberedValue6;
                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                textFieldSelectionManager2.setOffsetMapping$foundation_release(offsetMapping2);
                                                textFieldSelectionManager2.setVisualTransformation$foundation_release(visualTransformation2);
                                                textFieldSelectionManager2.setOnValueChange$foundation_release(legacyTextFieldState2.getOnValueChange());
                                                textFieldSelectionManager2.setState$foundation_release(legacyTextFieldState2);
                                                textFieldSelectionManager2.setValue$foundation_release(textFieldValue);
                                                ProvidableCompositionLocal<ClipboardManager> localClipboardManager = CompositionLocalsKt.getLocalClipboardManager();
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                Object objConsume7 = composerStartRestartGroup.consume(localClipboardManager);
                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                textFieldSelectionManager2.setClipboardManager$foundation_release((ClipboardManager) objConsume7);
                                                ProvidableCompositionLocal<TextToolbar> localTextToolbar = CompositionLocalsKt.getLocalTextToolbar();
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                Object objConsume8 = composerStartRestartGroup.consume(localTextToolbar);
                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                textFieldSelectionManager2.setTextToolbar((TextToolbar) objConsume8);
                                                ProvidableCompositionLocal<HapticFeedback> localHapticFeedback = CompositionLocalsKt.getLocalHapticFeedback();
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                                Object objConsume9 = composerStartRestartGroup.consume(localHapticFeedback);
                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                textFieldSelectionManager2.setHapticFeedBack((HapticFeedback) objConsume9);
                                                textFieldSelectionManager2.setFocusRequester(focusRequester2);
                                                textFieldSelectionManager2.setEditable(!z5);
                                                textFieldSelectionManager2.setEnabled(z4);
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                                                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                                    objRememberedValue7 = compositionScopedCoroutineScopeCanceller;
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705256948, "CC(remember):CoreTextField.kt#9igjgp");
                                                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                                if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue8 = BringIntoViewRequesterKt.BringIntoViewRequester();
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                                }
                                                final BringIntoViewRequester bringIntoViewRequester2 = (BringIntoViewRequester) objRememberedValue8;
                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705248170, "CC(remember):CoreTextField.kt#9igjgp");
                                                int i45 = i30 & 7168;
                                                int i46 = i30 & 57344;
                                                int i47 = i30;
                                                boolean zChangedInstance10 = (i44 == 4) | composerStartRestartGroup.changedInstance(legacyTextFieldState2) | (i45 == 2048) | (i46 == 16384) | composerStartRestartGroup.changedInstance(textInputService3);
                                                i32 = (i47 & LDSFile.EF_DG16_TAG) ^ 48;
                                                if (i32 > 32) {
                                                    imeOptions5 = imeOptions4;
                                                    if (composerStartRestartGroup.changed(imeOptions5)) {
                                                        imeOptions6 = imeOptions5;
                                                        z10 = z4;
                                                    }
                                                    zChangedInstance = zChangedInstance10 | z | composerStartRestartGroup.changedInstance(offsetMapping2) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(bringIntoViewRequester2) | composerStartRestartGroup.changedInstance(textFieldSelectionManager2);
                                                    Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                                                    if (!zChangedInstance || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                                        final boolean z28 = z5;
                                                        final ImeOptions imeOptions10 = imeOptions6;
                                                        Object obj5 = new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                                TextLayoutResultProxy layoutResult;
                                                                if (legacyTextFieldState2.getHasFocus() == focusState.isFocused()) {
                                                                    return;
                                                                }
                                                                legacyTextFieldState2.setHasFocus(focusState.isFocused());
                                                                if (!legacyTextFieldState2.getHasFocus() || !z10 || z28) {
                                                                    CoreTextFieldKt.endInputSession(legacyTextFieldState2);
                                                                } else {
                                                                    CoreTextFieldKt.startInputSession(textInputService3, legacyTextFieldState2, textFieldValue, imeOptions10, offsetMapping2);
                                                                }
                                                                if (focusState.isFocused() && (layoutResult = legacyTextFieldState2.getLayoutResult()) != null) {
                                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(bringIntoViewRequester2, textFieldValue, legacyTextFieldState2, layoutResult, offsetMapping2, null), 3, null);
                                                                }
                                                                if (focusState.isFocused()) {
                                                                    return;
                                                                }
                                                                TextFieldSelectionManager.m2150deselect_kEHs6E$foundation_release$default(textFieldSelectionManager2, null, 1, null);
                                                            }
                                                        };
                                                        legacyTextFieldState = legacyTextFieldState2;
                                                        textInputService = textInputService3;
                                                        imeOptions7 = imeOptions10;
                                                        textFieldSelectionManager = textFieldSelectionManager2;
                                                        bringIntoViewRequester = bringIntoViewRequester2;
                                                        visualTransformation3 = visualTransformation2;
                                                        z11 = z10;
                                                        obj = (Function1) obj5;
                                                        composerStartRestartGroup.updateRememberedValue(obj);
                                                    } else {
                                                        textInputService = textInputService3;
                                                        bringIntoViewRequester = bringIntoViewRequester2;
                                                        obj = objRememberedValue15;
                                                        imeOptions7 = imeOptions6;
                                                        visualTransformation3 = visualTransformation2;
                                                        textFieldSelectionManager = textFieldSelectionManager2;
                                                        legacyTextFieldState = legacyTextFieldState2;
                                                        z11 = z10;
                                                    }
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    Modifier modifierTextFieldFocusModifier = TextFieldGestureModifiersKt.textFieldFocusModifier(companion, z11, focusRequester2, mutableInteractionSource3, (Function1) obj);
                                                    State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf((z11 || z5) ? false : true), composerStartRestartGroup, 0);
                                                    Unit unit = Unit.INSTANCE;
                                                    final boolean z29 = z11;
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705195503, "CC(remember):CoreTextField.kt#9igjgp");
                                                    zChanged3 = composerStartRestartGroup.changed(stateRememberUpdatedState) | composerStartRestartGroup.changedInstance(legacyTextFieldState) | composerStartRestartGroup.changedInstance(textInputService) | composerStartRestartGroup.changedInstance(textFieldSelectionManager);
                                                    TextInputService textInputService4 = textInputService;
                                                    if (i32 > 32 || !composerStartRestartGroup.changed(imeOptions7)) {
                                                        z12 = zChanged3;
                                                        if ((i47 & 48) != 32) {
                                                            z13 = false;
                                                        }
                                                        z14 = z12 | z13;
                                                        Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                                                        if (z14 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                                            state = stateRememberUpdatedState;
                                                            textInputService2 = textInputService4;
                                                            coreTextFieldKt$CoreTextField$2$1 = new CoreTextFieldKt$CoreTextField$2$1(legacyTextFieldState, stateRememberUpdatedState, textInputService4, textFieldSelectionManager, imeOptions7, null);
                                                            composerStartRestartGroup.updateRememberedValue(coreTextFieldKt$CoreTextField$2$1);
                                                        } else {
                                                            coreTextFieldKt$CoreTextField$2$1 = objRememberedValue16;
                                                            state = stateRememberUpdatedState;
                                                            textInputService2 = textInputService4;
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                        State state2 = state;
                                                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) coreTextFieldKt$CoreTextField$2$1, composerStartRestartGroup, 6);
                                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705163133, "CC(remember):CoreTextField.kt#9igjgp");
                                                        zChangedInstance2 = composerStartRestartGroup.changedInstance(legacyTextFieldState);
                                                        objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                                        if (!zChangedInstance2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue9 = (Function1) new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1$1
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                                                    invoke(bool.booleanValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                public final void invoke(boolean z30) {
                                                                    legacyTextFieldState.setInTouchMode(z30);
                                                                }
                                                            };
                                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                        Modifier modifierUpdateSelectionTouchMode = SelectionGesturesKt.updateSelectionTouchMode(companion2, (Function1) objRememberedValue9);
                                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705159310, "CC(remember):CoreTextField.kt#9igjgp");
                                                        zChangedInstance3 = composerStartRestartGroup.changedInstance(legacyTextFieldState) | (i46 != 16384) | (i45 != 2048) | composerStartRestartGroup.changedInstance(offsetMapping2) | composerStartRestartGroup.changedInstance(textFieldSelectionManager);
                                                        Object objRememberedValue17 = composerStartRestartGroup.rememberedValue();
                                                        if (!zChangedInstance3 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                                            final LegacyTextFieldState legacyTextFieldState3 = legacyTextFieldState;
                                                            final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager;
                                                            final boolean z30 = z5;
                                                            z15 = z29;
                                                            obj2 = (Function1) new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                                                    m1746invokek4lQ0M(offset.getPackedValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                                                public final void m1746invokek4lQ0M(long j) {
                                                                    CoreTextFieldKt.tapToFocus(legacyTextFieldState3, focusRequester2, !z30);
                                                                    if (legacyTextFieldState3.getHasFocus() && z29) {
                                                                        if (legacyTextFieldState3.getHandleState() != HandleState.Selection) {
                                                                            TextLayoutResultProxy layoutResult = legacyTextFieldState3.getLayoutResult();
                                                                            if (layoutResult != null) {
                                                                                LegacyTextFieldState legacyTextFieldState4 = legacyTextFieldState3;
                                                                                TextFieldDelegate.INSTANCE.m1823setCursorOffsetULxng0E$foundation_release(j, layoutResult, legacyTextFieldState4.getProcessor(), offsetMapping2, legacyTextFieldState4.getOnValueChange());
                                                                                if (legacyTextFieldState4.getTextDelegate().getText().length() > 0) {
                                                                                    legacyTextFieldState4.setHandleState(HandleState.Cursor);
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        textFieldSelectionManager3.m2154deselect_kEHs6E$foundation_release(Offset.m4343boximpl(j));
                                                                    }
                                                                }
                                                            };
                                                            composerStartRestartGroup.updateRememberedValue(obj2);
                                                        } else {
                                                            obj2 = objRememberedValue17;
                                                            z15 = z29;
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                        z16 = z15;
                                                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                                                        Modifier modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(SelectionGesturesKt.selectionGestureInput(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(modifierUpdateSelectionTouchMode, mutableInteractionSource3, z15, (Function1) obj2), textFieldSelectionManager.getMouseSelectionObserver(), textFieldSelectionManager.getTouchSelectionObserver()), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705122293, "CC(remember):CoreTextField.kt#9igjgp");
                                                        zChangedInstance4 = composerStartRestartGroup.changedInstance(legacyTextFieldState) | (i44 != 4) | composerStartRestartGroup.changedInstance(offsetMapping2);
                                                        Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
                                                        if (!zChangedInstance4 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                                                            obj3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1$1
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
                                                                    TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
                                                                    if (layoutResult != null) {
                                                                        TextFieldValue textFieldValue2 = textFieldValue;
                                                                        LegacyTextFieldState legacyTextFieldState4 = legacyTextFieldState;
                                                                        OffsetMapping offsetMapping3 = offsetMapping2;
                                                                        TextFieldDelegate.INSTANCE.m1821drawQ1vqE60$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue2, legacyTextFieldState4.m1771getSelectionPreviewHighlightRanged9O1mEE(), legacyTextFieldState4.m1768getDeletionPreviewHighlightRanged9O1mEE(), offsetMapping3, layoutResult.getValue(), legacyTextFieldState4.getHighlightPaint(), legacyTextFieldState4.getSelectionBackgroundColor());
                                                                    }
                                                                }
                                                            };
                                                            composerStartRestartGroup.updateRememberedValue(obj3);
                                                        } else {
                                                            obj3 = objRememberedValue18;
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                        final Modifier modifierDrawBehind = DrawModifierKt.drawBehind(companion3, (Function1) obj3);
                                                        Modifier.Companion companion4 = Modifier.INSTANCE;
                                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705102808, "CC(remember):CoreTextField.kt#9igjgp");
                                                        windowInfo2 = windowInfo;
                                                        zChangedInstance5 = (i45 != 2048) | composerStartRestartGroup.changedInstance(legacyTextFieldState) | composerStartRestartGroup.changed(windowInfo2) | composerStartRestartGroup.changedInstance(textFieldSelectionManager) | (i44 != 4) | composerStartRestartGroup.changedInstance(offsetMapping2);
                                                        objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                                                        if (!zChangedInstance5 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                                            final LegacyTextFieldState legacyTextFieldState4 = legacyTextFieldState;
                                                            final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager;
                                                            z17 = z16;
                                                            objRememberedValue10 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                                                    invoke2(layoutCoordinates);
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                                                    legacyTextFieldState4.setLayoutCoordinates(layoutCoordinates);
                                                                    TextLayoutResultProxy layoutResult = legacyTextFieldState4.getLayoutResult();
                                                                    if (layoutResult != null) {
                                                                        layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                                                                    }
                                                                    if (z16) {
                                                                        if (legacyTextFieldState4.getHandleState() == HandleState.Selection) {
                                                                            if (legacyTextFieldState4.getShowFloatingToolbar() && windowInfo2.isWindowFocused()) {
                                                                                textFieldSelectionManager4.showSelectionToolbar$foundation_release();
                                                                            } else {
                                                                                textFieldSelectionManager4.hideSelectionToolbar$foundation_release();
                                                                            }
                                                                            legacyTextFieldState4.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager4, true));
                                                                            legacyTextFieldState4.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager4, false));
                                                                            legacyTextFieldState4.setShowCursorHandle(TextRange.m6534getCollapsedimpl(textFieldValue.getSelection()));
                                                                        } else if (legacyTextFieldState4.getHandleState() == HandleState.Cursor) {
                                                                            legacyTextFieldState4.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager4, true));
                                                                        }
                                                                        CoreTextFieldKt.notifyFocusedRect(legacyTextFieldState4, textFieldValue, offsetMapping2);
                                                                        TextLayoutResultProxy layoutResult2 = legacyTextFieldState4.getLayoutResult();
                                                                        if (layoutResult2 != null) {
                                                                            LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState4;
                                                                            TextFieldValue textFieldValue2 = textFieldValue;
                                                                            OffsetMapping offsetMapping3 = offsetMapping2;
                                                                            TextInputSession inputSession = legacyTextFieldState5.getInputSession();
                                                                            if (inputSession == null || !legacyTextFieldState5.getHasFocus()) {
                                                                                return;
                                                                            }
                                                                            TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue2, offsetMapping3, layoutResult2);
                                                                        }
                                                                    }
                                                                }
                                                            };
                                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                                                        } else {
                                                            z17 = z16;
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                        final Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion4, (Function1) objRememberedValue10);
                                                        final VisualTransformation visualTransformation5 = visualTransformation3;
                                                        z18 = visualTransformation5 instanceof PasswordVisualTransformation;
                                                        Modifier.Companion companion5 = Modifier.INSTANCE;
                                                        z19 = z17;
                                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705046115, "CC(remember):CoreTextField.kt#9igjgp");
                                                        zChangedInstance6 = composerStartRestartGroup.changedInstance(transformedText) | (i44 != 4) | (i45 != 2048) | composerStartRestartGroup.changed(z18) | (i46 != 16384) | composerStartRestartGroup.changedInstance(legacyTextFieldState) | composerStartRestartGroup.changedInstance(offsetMapping2) | composerStartRestartGroup.changedInstance(textFieldSelectionManager) | ((i32 <= 32 && composerStartRestartGroup.changed(imeOptions7)) || (i47 & 48) == 32);
                                                        Object objRememberedValue19 = composerStartRestartGroup.rememberedValue();
                                                        if (zChangedInstance6 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                                                            final LegacyTextFieldState legacyTextFieldState5 = legacyTextFieldState;
                                                            final ImeOptions imeOptions11 = imeOptions7;
                                                            final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager;
                                                            final boolean z31 = z5;
                                                            final TransformedText transformedText3 = transformedText;
                                                            Object obj6 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1
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
                                                                public final void invoke2(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                    SemanticsPropertyReceiver semanticsPropertyReceiver2 = semanticsPropertyReceiver;
                                                                    SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, transformedText3.getText());
                                                                    SemanticsPropertiesKt.m6370setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, textFieldValue.getSelection());
                                                                    if (!z19) {
                                                                        SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                                                                    }
                                                                    if (z18) {
                                                                        SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                                                                    }
                                                                    boolean z32 = z19 && !z31;
                                                                    SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z32);
                                                                    final LegacyTextFieldState legacyTextFieldState6 = legacyTextFieldState5;
                                                                    SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.1
                                                                        {
                                                                            super(1);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public final Boolean invoke(List<TextLayoutResult> list) {
                                                                            boolean z33;
                                                                            if (legacyTextFieldState6.getLayoutResult() != null) {
                                                                                TextLayoutResultProxy layoutResult = legacyTextFieldState6.getLayoutResult();
                                                                                Intrinsics.checkNotNull(layoutResult);
                                                                                list.add(layoutResult.getValue());
                                                                                z33 = true;
                                                                            } else {
                                                                                z33 = false;
                                                                            }
                                                                            return Boolean.valueOf(z33);
                                                                        }
                                                                    }, 1, null);
                                                                    if (z32) {
                                                                        final LegacyTextFieldState legacyTextFieldState7 = legacyTextFieldState5;
                                                                        SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.2
                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            {
                                                                                super(1);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public final Boolean invoke(AnnotatedString annotatedString2) {
                                                                                Unit unit2;
                                                                                TextInputSession inputSession = legacyTextFieldState7.getInputSession();
                                                                                if (inputSession != null) {
                                                                                    LegacyTextFieldState legacyTextFieldState8 = legacyTextFieldState7;
                                                                                    TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(annotatedString2, 1)}), legacyTextFieldState8.getProcessor(), legacyTextFieldState8.getOnValueChange(), inputSession);
                                                                                    unit2 = Unit.INSTANCE;
                                                                                } else {
                                                                                    unit2 = null;
                                                                                }
                                                                                if (unit2 == null) {
                                                                                    legacyTextFieldState7.getOnValueChange().invoke(new TextFieldValue(annotatedString2.getText(), TextRangeKt.TextRange(annotatedString2.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                                                }
                                                                                return true;
                                                                            }
                                                                        }, 1, null);
                                                                        final boolean z33 = z31;
                                                                        final boolean z34 = z19;
                                                                        final LegacyTextFieldState legacyTextFieldState8 = legacyTextFieldState5;
                                                                        final TextFieldValue textFieldValue2 = textFieldValue;
                                                                        semanticsPropertyReceiver2 = semanticsPropertyReceiver;
                                                                        SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.3
                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            {
                                                                                super(1);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public final Boolean invoke(AnnotatedString annotatedString2) {
                                                                                Unit unit2;
                                                                                if (z33 || !z34) {
                                                                                    return false;
                                                                                }
                                                                                TextInputSession inputSession = legacyTextFieldState8.getInputSession();
                                                                                if (inputSession != null) {
                                                                                    LegacyTextFieldState legacyTextFieldState9 = legacyTextFieldState8;
                                                                                    TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(annotatedString2, 1)}), legacyTextFieldState9.getProcessor(), legacyTextFieldState9.getOnValueChange(), inputSession);
                                                                                    unit2 = Unit.INSTANCE;
                                                                                } else {
                                                                                    unit2 = null;
                                                                                }
                                                                                if (unit2 == null) {
                                                                                    TextFieldValue textFieldValue3 = textFieldValue2;
                                                                                    legacyTextFieldState8.getOnValueChange().invoke(new TextFieldValue(StringsKt.replaceRange((CharSequence) textFieldValue3.getText(), TextRange.m6540getStartimpl(textFieldValue3.getSelection()), TextRange.m6535getEndimpl(textFieldValue3.getSelection()), (CharSequence) annotatedString2).toString(), TextRangeKt.TextRange(TextRange.m6540getStartimpl(textFieldValue3.getSelection()) + annotatedString2.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                                                }
                                                                                return true;
                                                                            }
                                                                        }, 1, null);
                                                                    }
                                                                    final OffsetMapping offsetMapping3 = offsetMapping2;
                                                                    final boolean z35 = z19;
                                                                    final TextFieldValue textFieldValue3 = textFieldValue;
                                                                    final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager5;
                                                                    final LegacyTextFieldState legacyTextFieldState9 = legacyTextFieldState5;
                                                                    SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.4
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(3);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function3
                                                                        public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                                                                            return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                                                                        }

                                                                        public final Boolean invoke(int i48, int i49, boolean z36) {
                                                                            if (!z36) {
                                                                                i48 = offsetMapping3.transformedToOriginal(i48);
                                                                            }
                                                                            if (!z36) {
                                                                                i49 = offsetMapping3.transformedToOriginal(i49);
                                                                            }
                                                                            boolean z37 = false;
                                                                            if (z35 && (i48 != TextRange.m6540getStartimpl(textFieldValue3.getSelection()) || i49 != TextRange.m6535getEndimpl(textFieldValue3.getSelection()))) {
                                                                                if (Math.min(i48, i49) >= 0 && Math.max(i48, i49) <= textFieldValue3.getAnnotatedString().length()) {
                                                                                    if (z36 || i48 == i49) {
                                                                                        textFieldSelectionManager6.exitSelectionMode$foundation_release();
                                                                                    } else {
                                                                                        TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager6, false, 1, null);
                                                                                    }
                                                                                    legacyTextFieldState9.getOnValueChange().invoke(new TextFieldValue(textFieldValue3.getAnnotatedString(), TextRangeKt.TextRange(i48, i49), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                                                    z37 = true;
                                                                                } else {
                                                                                    textFieldSelectionManager6.exitSelectionMode$foundation_release();
                                                                                }
                                                                            }
                                                                            return Boolean.valueOf(z37);
                                                                        }
                                                                    }, 1, null);
                                                                    int imeAction = imeOptions11.getImeAction();
                                                                    final LegacyTextFieldState legacyTextFieldState10 = legacyTextFieldState5;
                                                                    final ImeOptions imeOptions12 = imeOptions11;
                                                                    SemanticsPropertiesKt.m6365onImeAction9UiTYpY$default(semanticsPropertyReceiver2, imeAction, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.5
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Boolean invoke() {
                                                                            legacyTextFieldState10.getOnImeActionPerformed().invoke(ImeAction.m6702boximpl(imeOptions12.getImeAction()));
                                                                            return true;
                                                                        }
                                                                    }, 2, null);
                                                                    final LegacyTextFieldState legacyTextFieldState11 = legacyTextFieldState5;
                                                                    final FocusRequester focusRequester3 = focusRequester2;
                                                                    final boolean z36 = z31;
                                                                    SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.6
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Boolean invoke() {
                                                                            CoreTextFieldKt.tapToFocus(legacyTextFieldState11, focusRequester3, !z36);
                                                                            return true;
                                                                        }
                                                                    }, 1, null);
                                                                    final TextFieldSelectionManager textFieldSelectionManager7 = textFieldSelectionManager5;
                                                                    SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.7
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Boolean invoke() {
                                                                            TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager7, false, 1, null);
                                                                            return true;
                                                                        }
                                                                    }, 1, null);
                                                                    if (!TextRange.m6534getCollapsedimpl(textFieldValue.getSelection()) && !z18) {
                                                                        final TextFieldSelectionManager textFieldSelectionManager8 = textFieldSelectionManager5;
                                                                        SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.8
                                                                            {
                                                                                super(0);
                                                                            }

                                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                                            @Override // kotlin.jvm.functions.Function0
                                                                            public final Boolean invoke() {
                                                                                TextFieldSelectionManager.copy$foundation_release$default(textFieldSelectionManager8, false, 1, null);
                                                                                return true;
                                                                            }
                                                                        }, 1, null);
                                                                        if (z19 && !z31) {
                                                                            final TextFieldSelectionManager textFieldSelectionManager9 = textFieldSelectionManager5;
                                                                            SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.9
                                                                                {
                                                                                    super(0);
                                                                                }

                                                                                /* JADX WARN: Can't rename method to resolve collision */
                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                public final Boolean invoke() {
                                                                                    textFieldSelectionManager9.cut$foundation_release();
                                                                                    return true;
                                                                                }
                                                                            }, 1, null);
                                                                        }
                                                                    }
                                                                    if (!z19 || z31) {
                                                                        return;
                                                                    }
                                                                    final TextFieldSelectionManager textFieldSelectionManager10 = textFieldSelectionManager5;
                                                                    SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.10
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                        @Override // kotlin.jvm.functions.Function0
                                                                        public final Boolean invoke() {
                                                                            textFieldSelectionManager10.paste$foundation_release();
                                                                            return true;
                                                                        }
                                                                    }, 1, null);
                                                                }
                                                            };
                                                            z20 = z19;
                                                            imeOptions8 = imeOptions11;
                                                            focusRequester = focusRequester2;
                                                            obj4 = (Function1) obj6;
                                                            composerStartRestartGroup.updateRememberedValue(obj4);
                                                        } else {
                                                            focusRequester = focusRequester2;
                                                            obj4 = objRememberedValue19;
                                                            imeOptions8 = imeOptions7;
                                                            z20 = z19;
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                        Modifier modifierSemantics = SemanticsModifierKt.semantics(companion5, true, (Function1) obj4);
                                                        final LegacyTextFieldState legacyTextFieldState6 = legacyTextFieldState;
                                                        final Modifier modifierCursor = TextFieldCursorKt.cursor(Modifier.INSTANCE, legacyTextFieldState6, textFieldValue, offsetMapping2, brush4, (z20 || z5 || !windowInfo2.isWindowFocused() || legacyTextFieldState.hasHighlight()) ? false : true);
                                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1704832829, "CC(remember):CoreTextField.kt#9igjgp");
                                                        zChangedInstance7 = composerStartRestartGroup.changedInstance(textFieldSelectionManager);
                                                        Object objRememberedValue20 = composerStartRestartGroup.rememberedValue();
                                                        if (zChangedInstance7) {
                                                            offsetMapping = offsetMapping2;
                                                            if (objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                                                            }
                                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                            EffectsKt.DisposableEffect(textFieldSelectionManager, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue20, composerStartRestartGroup, 0);
                                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1704829391, "CC(remember):CoreTextField.kt#9igjgp");
                                                            zChangedInstance8 = (i44 == 4) | composerStartRestartGroup.changedInstance(legacyTextFieldState6) | composerStartRestartGroup.changedInstance(textInputService2) | ((i32 > 32 && composerStartRestartGroup.changed(imeOptions8)) || (i47 & 48) == 32);
                                                            objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                                                            if (zChangedInstance8 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                                                objRememberedValue11 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(1);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                                        if (legacyTextFieldState6.getHasFocus()) {
                                                                            legacyTextFieldState6.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(textInputService2, textFieldValue, legacyTextFieldState6.getProcessor(), imeOptions8, legacyTextFieldState6.getOnValueChange(), legacyTextFieldState6.getOnImeActionPerformed()));
                                                                        }
                                                                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1$invoke$$inlined$onDispose$1
                                                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                                                            public void dispose() {
                                                                            }
                                                                        };
                                                                    }
                                                                };
                                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                                                            }
                                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                            EffectsKt.DisposableEffect(imeOptions8, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue11, composerStartRestartGroup, (i47 >> 3) & 14);
                                                            final int i48 = i31;
                                                            Modifier modifierM1830textFieldKeyInput2WJ9YEU = TextFieldKeyInputKt.m1830textFieldKeyInput2WJ9YEU(Modifier.INSTANCE, legacyTextFieldState6, textFieldSelectionManager, textFieldValue, legacyTextFieldState6.getOnValueChange(), !z5, i48 != 1, offsetMapping, undoManager, imeOptions8.getImeAction());
                                                            final OffsetMapping offsetMapping3 = offsetMapping;
                                                            Modifier.Companion companion6 = Modifier.INSTANCE;
                                                            boolean zCoreTextField$lambda$11 = CoreTextField$lambda$11(state2);
                                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1704798381, "CC(remember):CoreTextField.kt#9igjgp");
                                                            zChangedInstance9 = composerStartRestartGroup.changedInstance(legacyTextFieldState6) | ((i32 <= 32 && composerStartRestartGroup.changed(imeOptions8)) || (i47 & 48) == 32) | composerStartRestartGroup.changedInstance(legacyPlatformTextInputServiceAdapter);
                                                            objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                                                            if (zChangedInstance9 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                                                objRememberedValue12 = (Function0) new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(0);
                                                                    }

                                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Boolean invoke() {
                                                                        if (!legacyTextFieldState6.getHasFocus()) {
                                                                            focusRequester.requestFocus();
                                                                        }
                                                                        if (!KeyboardType.m6758equalsimpl0(imeOptions8.getKeyboardType(), KeyboardType.INSTANCE.m6777getPasswordPjHm6EE()) && !KeyboardType.m6758equalsimpl0(imeOptions8.getKeyboardType(), KeyboardType.INSTANCE.m6776getNumberPasswordPjHm6EE())) {
                                                                            legacyPlatformTextInputServiceAdapter.startStylusHandwriting();
                                                                        }
                                                                        return true;
                                                                    }
                                                                };
                                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                                                            }
                                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                            Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(LegacyAdaptingPlatformTextInputModifierNodeKt.legacyTextInputAdapter(modifier5, legacyPlatformTextInputServiceAdapter, legacyTextFieldState6, textFieldSelectionManager).then(StylusHandwritingKt.stylusHandwriting(companion6, zCoreTextField$lambda$11, (Function0) objRememberedValue12)).then(modifierTextFieldFocusModifier), legacyTextFieldState6, focusManager), legacyTextFieldState6, textFieldSelectionManager).then(modifierM1830textFieldKeyInput2WJ9YEU), textFieldScrollerPosition, mutableInteractionSource5, z20).then(modifierPointerHoverIcon$default).then(modifierSemantics), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                                                    invoke2(layoutCoordinates);
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                                                    TextLayoutResultProxy layoutResult = legacyTextFieldState6.getLayoutResult();
                                                                    if (layoutResult == null) {
                                                                        return;
                                                                    }
                                                                    layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
                                                                }
                                                            });
                                                            z21 = !z20 && legacyTextFieldState6.getHasFocus() && legacyTextFieldState6.isInTouchMode() && windowInfo2.isWindowFocused();
                                                            if (!z21) {
                                                                companionTextFieldMagnifier = TextFieldSelectionManager_androidKt.textFieldMagnifier(Modifier.INSTANCE, textFieldSelectionManager);
                                                            } else {
                                                                companionTextFieldMagnifier = Modifier.INSTANCE;
                                                            }
                                                            final Modifier modifier6 = companionTextFieldMagnifier;
                                                            boolean z32 = z20;
                                                            final BringIntoViewRequester bringIntoViewRequester3 = bringIntoViewRequester;
                                                            final TextStyle textStyle7 = textStyle4;
                                                            ImeOptions imeOptions12 = imeOptions8;
                                                            final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function33 = function3M1745getLambda1$foundation_release;
                                                            CoreTextFieldRootBox(modifierOnGloballyPositioned2, textFieldSelectionManager, ComposableLambdaKt.rememberComposableLambda(-374338080, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5
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

                                                                public final void invoke(Composer composer3, int i49) {
                                                                    ComposerKt.sourceInformation(composer3, "C695@31947L4735,695@31933L4749:CoreTextField.kt#423gt5");
                                                                    if ((i49 & 3) != 2 || !composer3.getSkipping()) {
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(-374338080, i49, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:695)");
                                                                        }
                                                                        Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function34 = function33;
                                                                        final LegacyTextFieldState legacyTextFieldState7 = legacyTextFieldState6;
                                                                        final TextStyle textStyle8 = textStyle7;
                                                                        final int i50 = i42;
                                                                        final int i51 = i48;
                                                                        final TextFieldScrollerPosition textFieldScrollerPosition2 = textFieldScrollerPosition;
                                                                        final TextFieldValue textFieldValue2 = textFieldValue;
                                                                        final VisualTransformation visualTransformation6 = visualTransformation5;
                                                                        final Modifier modifier7 = modifierCursor;
                                                                        final Modifier modifier8 = modifierDrawBehind;
                                                                        final Modifier modifier9 = modifierOnGloballyPositioned;
                                                                        final Modifier modifier10 = modifier6;
                                                                        final BringIntoViewRequester bringIntoViewRequester4 = bringIntoViewRequester3;
                                                                        final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager;
                                                                        final boolean z33 = z21;
                                                                        final boolean z34 = z5;
                                                                        final Function1<TextLayoutResult, Unit> function15 = function13;
                                                                        final OffsetMapping offsetMapping4 = offsetMapping3;
                                                                        final Density density3 = density2;
                                                                        function34.invoke(ComposableLambdaKt.rememberComposableLambda(2032502107, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1
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

                                                                            public final void invoke(Composer composer4, int i52) {
                                                                                ComposerKt.sourceInformation(composer4, "C711@32801L22,720@33160L3512,720@33124L3548:CoreTextField.kt#423gt5");
                                                                                if ((i52 & 3) != 2 || !composer4.getSkipping()) {
                                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                                        ComposerKt.traceEventStart(2032502107, i52, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)");
                                                                                    }
                                                                                    Modifier modifierHeightInLines = HeightInLinesModifierKt.heightInLines(SizeKt.m1468heightInVpY3zN4$default(Modifier.INSTANCE, legacyTextFieldState7.m1769getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle8, i50, i51);
                                                                                    TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition2;
                                                                                    TextFieldValue textFieldValue3 = textFieldValue2;
                                                                                    VisualTransformation visualTransformation7 = visualTransformation6;
                                                                                    ComposerKt.sourceInformationMarkerStart(composer4, 713189947, "CC(remember):CoreTextField.kt#9igjgp");
                                                                                    boolean zChangedInstance11 = composer4.changedInstance(legacyTextFieldState7);
                                                                                    final LegacyTextFieldState legacyTextFieldState8 = legacyTextFieldState7;
                                                                                    Object objRememberedValue21 = composer4.rememberedValue();
                                                                                    if (zChangedInstance11 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                                                                        objRememberedValue21 = (Function0) new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1$1
                                                                                            {
                                                                                                super(0);
                                                                                            }

                                                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                                                            @Override // kotlin.jvm.functions.Function0
                                                                                            public final TextLayoutResultProxy invoke() {
                                                                                                return legacyTextFieldState8.getLayoutResult();
                                                                                            }
                                                                                        };
                                                                                        composer4.updateRememberedValue(objRememberedValue21);
                                                                                    }
                                                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                                                    Modifier modifierBringIntoViewRequester = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(modifierHeightInLines, textFieldScrollerPosition3, textFieldValue3, visualTransformation7, (Function0) objRememberedValue21).then(modifier7).then(modifier8), textStyle8).then(modifier9).then(modifier10), bringIntoViewRequester4);
                                                                                    final TextFieldSelectionManager textFieldSelectionManager7 = textFieldSelectionManager6;
                                                                                    final LegacyTextFieldState legacyTextFieldState9 = legacyTextFieldState7;
                                                                                    final boolean z35 = z33;
                                                                                    final boolean z36 = z34;
                                                                                    final Function1<TextLayoutResult, Unit> function16 = function15;
                                                                                    final TextFieldValue textFieldValue4 = textFieldValue2;
                                                                                    final OffsetMapping offsetMapping5 = offsetMapping4;
                                                                                    final Density density4 = density3;
                                                                                    final int i53 = i51;
                                                                                    SimpleLayoutKt.SimpleLayout(modifierBringIntoViewRequester, ComposableLambdaKt.rememberComposableLambda(-363167407, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
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

                                                                                        /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
                                                                                        /*
                                                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                                                        */
                                                                                        public final void invoke(Composer composer5, int i54) {
                                                                                            boolean z37;
                                                                                            ComposerKt.sourceInformation(composer5, "C721@33178L2880,776@36076L322:CoreTextField.kt#423gt5");
                                                                                            if ((i54 & 3) != 2 || !composer5.getSkipping()) {
                                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                                    ComposerKt.traceEventStart(-363167407, i54, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:721)");
                                                                                                }
                                                                                                final LegacyTextFieldState legacyTextFieldState10 = legacyTextFieldState9;
                                                                                                final Function1<TextLayoutResult, Unit> function17 = function16;
                                                                                                final TextFieldValue textFieldValue5 = textFieldValue4;
                                                                                                final OffsetMapping offsetMapping6 = offsetMapping5;
                                                                                                final Density density5 = density4;
                                                                                                final int i55 = i53;
                                                                                                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                                                                    @Override // androidx.compose.p000ui.layout.MeasurePolicy
                                                                                                    /* renamed from: measure-3p2s80s */
                                                                                                    public MeasureResult mo792measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                                                                                        Snapshot.Companion companion7 = Snapshot.INSTANCE;
                                                                                                        LegacyTextFieldState legacyTextFieldState11 = legacyTextFieldState10;
                                                                                                        Snapshot currentThreadSnapshot = companion7.getCurrentThreadSnapshot();
                                                                                                        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                                                                                        Snapshot snapshotMakeCurrentNonObservable = companion7.makeCurrentNonObservable(currentThreadSnapshot);
                                                                                                        try {
                                                                                                            TextLayoutResultProxy layoutResult = legacyTextFieldState11.getLayoutResult();
                                                                                                            TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                                                                            Triple<Integer, Integer, TextLayoutResult> tripleM1822layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m1822layout_EkL_Y$foundation_release(legacyTextFieldState10.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                                                                            int iIntValue = tripleM1822layout_EkL_Y$foundation_release.component1().intValue();
                                                                                                            int iIntValue2 = tripleM1822layout_EkL_Y$foundation_release.component2().intValue();
                                                                                                            TextLayoutResult textLayoutResultComponent3 = tripleM1822layout_EkL_Y$foundation_release.component3();
                                                                                                            if (!Intrinsics.areEqual(value, textLayoutResultComponent3)) {
                                                                                                                legacyTextFieldState10.setLayoutResult(new TextLayoutResultProxy(textLayoutResultComponent3, null, layoutResult != null ? layoutResult.getDecorationBoxCoordinates() : null, 2, null));
                                                                                                                function17.invoke(textLayoutResultComponent3);
                                                                                                                CoreTextFieldKt.notifyFocusedRect(legacyTextFieldState10, textFieldValue5, offsetMapping6);
                                                                                                            }
                                                                                                            legacyTextFieldState10.m1773setMinHeightForSingleLineField0680j_4(density5.mo1124toDpu2uoSUM(i55 == 1 ? TextDelegateKt.ceilToIntPx(textLayoutResultComponent3.getLineBottom(0)) : 0));
                                                                                                            return measureScope.layout(iIntValue, iIntValue2, MapsKt.mapOf(TuplesKt.m521to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(textLayoutResultComponent3.getFirstBaseline()))), TuplesKt.m521to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(textLayoutResultComponent3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                                                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                                                                }

                                                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                                                                    invoke2(placementScope);
                                                                                                                    return Unit.INSTANCE;
                                                                                                                }
                                                                                                            });
                                                                                                        } finally {
                                                                                                            companion7.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                                                                                                        }
                                                                                                    }

                                                                                                    @Override // androidx.compose.p000ui.layout.MeasurePolicy
                                                                                                    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i56) {
                                                                                                        legacyTextFieldState10.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                                                                        return legacyTextFieldState10.getTextDelegate().getMaxIntrinsicWidth();
                                                                                                    }
                                                                                                };
                                                                                                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                                                                Modifier.Companion companion7 = Modifier.INSTANCE;
                                                                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                                                                CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                                                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer5, companion7);
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
                                                                                                Updater.m4095setimpl(composerM4088constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                                                Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                                                if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                                                    composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                                                    composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                                                }
                                                                                                Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                                                                ComposerKt.sourceInformationMarkerStart(composer5, -1674249312, "C:CoreTextField.kt#423gt5");
                                                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                                                composer5.endNode();
                                                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                                                TextFieldSelectionManager textFieldSelectionManager8 = textFieldSelectionManager7;
                                                                                                if (legacyTextFieldState9.getHandleState() == HandleState.None || legacyTextFieldState9.getLayoutCoordinates() == null) {
                                                                                                    z37 = false;
                                                                                                } else {
                                                                                                    LayoutCoordinates layoutCoordinates = legacyTextFieldState9.getLayoutCoordinates();
                                                                                                    Intrinsics.checkNotNull(layoutCoordinates);
                                                                                                    if (layoutCoordinates.isAttached() && z35) {
                                                                                                        z37 = true;
                                                                                                    }
                                                                                                }
                                                                                                CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager8, z37, composer5, 0);
                                                                                                if (legacyTextFieldState9.getHandleState() == HandleState.Cursor && !z36 && z35) {
                                                                                                    composer5.startReplaceGroup(-2032274);
                                                                                                    ComposerKt.sourceInformation(composer5, "789@36600L40");
                                                                                                    CoreTextFieldKt.TextFieldCursorHandle(textFieldSelectionManager7, composer5, 0);
                                                                                                    composer5.endReplaceGroup();
                                                                                                } else {
                                                                                                    composer5.startReplaceGroup(-1955394);
                                                                                                    composer5.endReplaceGroup();
                                                                                                }
                                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                                    ComposerKt.traceEventEnd();
                                                                                                    return;
                                                                                                }
                                                                                                return;
                                                                                            }
                                                                                            composer5.skipToGroupEnd();
                                                                                        }
                                                                                    }, composer4, 54), composer4, 48, 0);
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
                                                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                            i33 = i42;
                                                            i34 = i48;
                                                            composer2 = composerStartRestartGroup;
                                                            z22 = z5;
                                                            function14 = function13;
                                                            mutableInteractionSource4 = mutableInteractionSource5;
                                                            brush3 = brush4;
                                                            keyboardActions3 = keyboardActions5;
                                                            imeOptions9 = imeOptions12;
                                                            z23 = z9;
                                                            z24 = z32;
                                                            textStyle5 = textStyle4;
                                                            function32 = function33;
                                                            visualTransformation4 = visualTransformation5;
                                                            modifier4 = modifier5;
                                                        } else {
                                                            offsetMapping = offsetMapping2;
                                                        }
                                                        objRememberedValue20 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                                final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager;
                                                                return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1$invoke$$inlined$onDispose$1
                                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                                    public void dispose() {
                                                                        textFieldSelectionManager6.hideSelectionToolbar$foundation_release();
                                                                    }
                                                                };
                                                            }
                                                        };
                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue20);
                                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                        EffectsKt.DisposableEffect(textFieldSelectionManager, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue20, composerStartRestartGroup, 0);
                                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1704829391, "CC(remember):CoreTextField.kt#9igjgp");
                                                        if (i32 > 32) {
                                                            zChangedInstance8 = (i44 == 4) | composerStartRestartGroup.changedInstance(legacyTextFieldState6) | composerStartRestartGroup.changedInstance(textInputService2) | ((i32 > 32 && composerStartRestartGroup.changed(imeOptions8)) || (i47 & 48) == 32);
                                                            objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                                                            if (zChangedInstance8) {
                                                                objRememberedValue11 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(1);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                                        if (legacyTextFieldState6.getHasFocus()) {
                                                                            legacyTextFieldState6.setInputSession(TextFieldDelegate.INSTANCE.restartInput$foundation_release(textInputService2, textFieldValue, legacyTextFieldState6.getProcessor(), imeOptions8, legacyTextFieldState6.getOnValueChange(), legacyTextFieldState6.getOnImeActionPerformed()));
                                                                        }
                                                                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$1$invoke$$inlined$onDispose$1
                                                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                                                            public void dispose() {
                                                                            }
                                                                        };
                                                                    }
                                                                };
                                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                EffectsKt.DisposableEffect(imeOptions8, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue11, composerStartRestartGroup, (i47 >> 3) & 14);
                                                                final int i482 = i31;
                                                                Modifier modifierM1830textFieldKeyInput2WJ9YEU2 = TextFieldKeyInputKt.m1830textFieldKeyInput2WJ9YEU(Modifier.INSTANCE, legacyTextFieldState6, textFieldSelectionManager, textFieldValue, legacyTextFieldState6.getOnValueChange(), !z5, i482 != 1, offsetMapping, undoManager, imeOptions8.getImeAction());
                                                                final OffsetMapping offsetMapping32 = offsetMapping;
                                                                Modifier.Companion companion62 = Modifier.INSTANCE;
                                                                boolean zCoreTextField$lambda$112 = CoreTextField$lambda$11(state2);
                                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1704798381, "CC(remember):CoreTextField.kt#9igjgp");
                                                                if (i32 <= 32) {
                                                                    zChangedInstance9 = composerStartRestartGroup.changedInstance(legacyTextFieldState6) | ((i32 <= 32 && composerStartRestartGroup.changed(imeOptions8)) || (i47 & 48) == 32) | composerStartRestartGroup.changedInstance(legacyPlatformTextInputServiceAdapter);
                                                                    objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                                                                    if (zChangedInstance9) {
                                                                        objRememberedValue12 = (Function0) new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$stylusHandwritingModifier$1$1
                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            {
                                                                                super(0);
                                                                            }

                                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                                            @Override // kotlin.jvm.functions.Function0
                                                                            public final Boolean invoke() {
                                                                                if (!legacyTextFieldState6.getHasFocus()) {
                                                                                    focusRequester.requestFocus();
                                                                                }
                                                                                if (!KeyboardType.m6758equalsimpl0(imeOptions8.getKeyboardType(), KeyboardType.INSTANCE.m6777getPasswordPjHm6EE()) && !KeyboardType.m6758equalsimpl0(imeOptions8.getKeyboardType(), KeyboardType.INSTANCE.m6776getNumberPasswordPjHm6EE())) {
                                                                                    legacyPlatformTextInputServiceAdapter.startStylusHandwriting();
                                                                                }
                                                                                return true;
                                                                            }
                                                                        };
                                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                                                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                        Modifier modifierOnGloballyPositioned22 = OnGloballyPositionedModifierKt.onGloballyPositioned(TextFieldScrollKt.textFieldScrollable(previewKeyEventToDeselectOnBack(TextFieldFocusModifier_androidKt.interceptDPadAndMoveFocus(LegacyAdaptingPlatformTextInputModifierNodeKt.legacyTextInputAdapter(modifier5, legacyPlatformTextInputServiceAdapter, legacyTextFieldState6, textFieldSelectionManager).then(StylusHandwritingKt.stylusHandwriting(companion62, zCoreTextField$lambda$112, (Function0) objRememberedValue12)).then(modifierTextFieldFocusModifier), legacyTextFieldState6, focusManager), legacyTextFieldState6, textFieldSelectionManager).then(modifierM1830textFieldKeyInput2WJ9YEU2), textFieldScrollerPosition, mutableInteractionSource5, z20).then(modifierPointerHoverIcon$default).then(modifierSemantics), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$decorationBoxModifier$1
                                                                            {
                                                                                super(1);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                                                                invoke2(layoutCoordinates);
                                                                                return Unit.INSTANCE;
                                                                            }

                                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                                                                TextLayoutResultProxy layoutResult = legacyTextFieldState6.getLayoutResult();
                                                                                if (layoutResult == null) {
                                                                                    return;
                                                                                }
                                                                                layoutResult.setDecorationBoxCoordinates(layoutCoordinates);
                                                                            }
                                                                        });
                                                                        if (z20) {
                                                                            if (!z21) {
                                                                            }
                                                                            final Modifier modifier62 = companionTextFieldMagnifier;
                                                                            boolean z322 = z20;
                                                                            final BringIntoViewRequester bringIntoViewRequester32 = bringIntoViewRequester;
                                                                            final TextStyle textStyle72 = textStyle4;
                                                                            ImeOptions imeOptions122 = imeOptions8;
                                                                            final Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> function332 = function3M1745getLambda1$foundation_release;
                                                                            CoreTextFieldRootBox(modifierOnGloballyPositioned22, textFieldSelectionManager, ComposableLambdaKt.rememberComposableLambda(-374338080, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5
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

                                                                                public final void invoke(Composer composer3, int i49) {
                                                                                    ComposerKt.sourceInformation(composer3, "C695@31947L4735,695@31933L4749:CoreTextField.kt#423gt5");
                                                                                    if ((i49 & 3) != 2 || !composer3.getSkipping()) {
                                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                                            ComposerKt.traceEventStart(-374338080, i49, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:695)");
                                                                                        }
                                                                                        Function3<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> function34 = function332;
                                                                                        final LegacyTextFieldState legacyTextFieldState7 = legacyTextFieldState6;
                                                                                        final TextStyle textStyle8 = textStyle72;
                                                                                        final int i50 = i42;
                                                                                        final int i51 = i482;
                                                                                        final TextFieldScrollerPosition textFieldScrollerPosition2 = textFieldScrollerPosition;
                                                                                        final TextFieldValue textFieldValue2 = textFieldValue;
                                                                                        final VisualTransformation visualTransformation6 = visualTransformation5;
                                                                                        final Modifier modifier7 = modifierCursor;
                                                                                        final Modifier modifier8 = modifierDrawBehind;
                                                                                        final Modifier modifier9 = modifierOnGloballyPositioned;
                                                                                        final Modifier modifier10 = modifier62;
                                                                                        final BringIntoViewRequester bringIntoViewRequester4 = bringIntoViewRequester32;
                                                                                        final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager;
                                                                                        final boolean z33 = z21;
                                                                                        final boolean z34 = z5;
                                                                                        final Function1<? super TextLayoutResult, Unit> function15 = function13;
                                                                                        final OffsetMapping offsetMapping4 = offsetMapping32;
                                                                                        final Density density3 = density2;
                                                                                        function34.invoke(ComposableLambdaKt.rememberComposableLambda(2032502107, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1
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

                                                                                            public final void invoke(Composer composer4, int i52) {
                                                                                                ComposerKt.sourceInformation(composer4, "C711@32801L22,720@33160L3512,720@33124L3548:CoreTextField.kt#423gt5");
                                                                                                if ((i52 & 3) != 2 || !composer4.getSkipping()) {
                                                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                                                        ComposerKt.traceEventStart(2032502107, i52, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:698)");
                                                                                                    }
                                                                                                    Modifier modifierHeightInLines = HeightInLinesModifierKt.heightInLines(SizeKt.m1468heightInVpY3zN4$default(Modifier.INSTANCE, legacyTextFieldState7.m1769getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null), textStyle8, i50, i51);
                                                                                                    TextFieldScrollerPosition textFieldScrollerPosition3 = textFieldScrollerPosition2;
                                                                                                    TextFieldValue textFieldValue3 = textFieldValue2;
                                                                                                    VisualTransformation visualTransformation7 = visualTransformation6;
                                                                                                    ComposerKt.sourceInformationMarkerStart(composer4, 713189947, "CC(remember):CoreTextField.kt#9igjgp");
                                                                                                    boolean zChangedInstance11 = composer4.changedInstance(legacyTextFieldState7);
                                                                                                    final LegacyTextFieldState legacyTextFieldState8 = legacyTextFieldState7;
                                                                                                    Object objRememberedValue21 = composer4.rememberedValue();
                                                                                                    if (zChangedInstance11 || objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                                                                                                        objRememberedValue21 = (Function0) new Function0<TextLayoutResultProxy>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1$1
                                                                                                            {
                                                                                                                super(0);
                                                                                                            }

                                                                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                                                                            @Override // kotlin.jvm.functions.Function0
                                                                                                            public final TextLayoutResultProxy invoke() {
                                                                                                                return legacyTextFieldState8.getLayoutResult();
                                                                                                            }
                                                                                                        };
                                                                                                        composer4.updateRememberedValue(objRememberedValue21);
                                                                                                    }
                                                                                                    ComposerKt.sourceInformationMarkerEnd(composer4);
                                                                                                    Modifier modifierBringIntoViewRequester = BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(modifierHeightInLines, textFieldScrollerPosition3, textFieldValue3, visualTransformation7, (Function0) objRememberedValue21).then(modifier7).then(modifier8), textStyle8).then(modifier9).then(modifier10), bringIntoViewRequester4);
                                                                                                    final TextFieldSelectionManager textFieldSelectionManager7 = textFieldSelectionManager6;
                                                                                                    final LegacyTextFieldState legacyTextFieldState9 = legacyTextFieldState7;
                                                                                                    final boolean z35 = z33;
                                                                                                    final boolean z36 = z34;
                                                                                                    final Function1<? super TextLayoutResult, Unit> function16 = function15;
                                                                                                    final TextFieldValue textFieldValue4 = textFieldValue2;
                                                                                                    final OffsetMapping offsetMapping5 = offsetMapping4;
                                                                                                    final Density density4 = density3;
                                                                                                    final int i53 = i51;
                                                                                                    SimpleLayoutKt.SimpleLayout(modifierBringIntoViewRequester, ComposableLambdaKt.rememberComposableLambda(-363167407, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1
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

                                                                                                        /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
                                                                                                        /*
                                                                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                                                                        */
                                                                                                        public final void invoke(Composer composer5, int i54) {
                                                                                                            boolean z37;
                                                                                                            ComposerKt.sourceInformation(composer5, "C721@33178L2880,776@36076L322:CoreTextField.kt#423gt5");
                                                                                                            if ((i54 & 3) != 2 || !composer5.getSkipping()) {
                                                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                                                    ComposerKt.traceEventStart(-363167407, i54, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:721)");
                                                                                                                }
                                                                                                                final LegacyTextFieldState legacyTextFieldState10 = legacyTextFieldState9;
                                                                                                                final Function1<? super TextLayoutResult, Unit> function17 = function16;
                                                                                                                final TextFieldValue textFieldValue5 = textFieldValue4;
                                                                                                                final OffsetMapping offsetMapping6 = offsetMapping5;
                                                                                                                final Density density5 = density4;
                                                                                                                final int i55 = i53;
                                                                                                                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.5.1.1.2
                                                                                                                    @Override // androidx.compose.p000ui.layout.MeasurePolicy
                                                                                                                    /* renamed from: measure-3p2s80s */
                                                                                                                    public MeasureResult mo792measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                                                                                                        Snapshot.Companion companion7 = Snapshot.INSTANCE;
                                                                                                                        LegacyTextFieldState legacyTextFieldState11 = legacyTextFieldState10;
                                                                                                                        Snapshot currentThreadSnapshot = companion7.getCurrentThreadSnapshot();
                                                                                                                        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                                                                                                        Snapshot snapshotMakeCurrentNonObservable = companion7.makeCurrentNonObservable(currentThreadSnapshot);
                                                                                                                        try {
                                                                                                                            TextLayoutResultProxy layoutResult = legacyTextFieldState11.getLayoutResult();
                                                                                                                            TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
                                                                                                                            Triple<Integer, Integer, TextLayoutResult> tripleM1822layout_EkL_Y$foundation_release = TextFieldDelegate.INSTANCE.m1822layout_EkL_Y$foundation_release(legacyTextFieldState10.getTextDelegate(), j, measureScope.getLayoutDirection(), value);
                                                                                                                            int iIntValue = tripleM1822layout_EkL_Y$foundation_release.component1().intValue();
                                                                                                                            int iIntValue2 = tripleM1822layout_EkL_Y$foundation_release.component2().intValue();
                                                                                                                            TextLayoutResult textLayoutResultComponent3 = tripleM1822layout_EkL_Y$foundation_release.component3();
                                                                                                                            if (!Intrinsics.areEqual(value, textLayoutResultComponent3)) {
                                                                                                                                legacyTextFieldState10.setLayoutResult(new TextLayoutResultProxy(textLayoutResultComponent3, null, layoutResult != null ? layoutResult.getDecorationBoxCoordinates() : null, 2, null));
                                                                                                                                function17.invoke(textLayoutResultComponent3);
                                                                                                                                CoreTextFieldKt.notifyFocusedRect(legacyTextFieldState10, textFieldValue5, offsetMapping6);
                                                                                                                            }
                                                                                                                            legacyTextFieldState10.m1773setMinHeightForSingleLineField0680j_4(density5.mo1124toDpu2uoSUM(i55 == 1 ? TextDelegateKt.ceilToIntPx(textLayoutResultComponent3.getLineBottom(0)) : 0));
                                                                                                                            return measureScope.layout(iIntValue, iIntValue2, MapsKt.mapOf(TuplesKt.m521to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(Math.round(textLayoutResultComponent3.getFirstBaseline()))), TuplesKt.m521to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(Math.round(textLayoutResultComponent3.getLastBaseline())))), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2$measure$2
                                                                                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                                                                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                                                                                }

                                                                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                                                                                    invoke2(placementScope);
                                                                                                                                    return Unit.INSTANCE;
                                                                                                                                }
                                                                                                                            });
                                                                                                                        } finally {
                                                                                                                            companion7.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                                                                                                                        }
                                                                                                                    }

                                                                                                                    @Override // androidx.compose.p000ui.layout.MeasurePolicy
                                                                                                                    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i56) {
                                                                                                                        legacyTextFieldState10.getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                                                                                                                        return legacyTextFieldState10.getTextDelegate().getMaxIntrinsicWidth();
                                                                                                                    }
                                                                                                                };
                                                                                                                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                                                                                Modifier.Companion companion7 = Modifier.INSTANCE;
                                                                                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                                                                                CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                                                                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer5, companion7);
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
                                                                                                                Updater.m4095setimpl(composerM4088constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                                                                                Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                                                                                if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                                                                    composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                                                                    composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                                                                                }
                                                                                                                Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                                                                                ComposerKt.sourceInformationMarkerStart(composer5, -1674249312, "C:CoreTextField.kt#423gt5");
                                                                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                                                                composer5.endNode();
                                                                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                                                                                TextFieldSelectionManager textFieldSelectionManager8 = textFieldSelectionManager7;
                                                                                                                if (legacyTextFieldState9.getHandleState() == HandleState.None || legacyTextFieldState9.getLayoutCoordinates() == null) {
                                                                                                                    z37 = false;
                                                                                                                } else {
                                                                                                                    LayoutCoordinates layoutCoordinates = legacyTextFieldState9.getLayoutCoordinates();
                                                                                                                    Intrinsics.checkNotNull(layoutCoordinates);
                                                                                                                    if (layoutCoordinates.isAttached() && z35) {
                                                                                                                        z37 = true;
                                                                                                                    }
                                                                                                                }
                                                                                                                CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager8, z37, composer5, 0);
                                                                                                                if (legacyTextFieldState9.getHandleState() == HandleState.Cursor && !z36 && z35) {
                                                                                                                    composer5.startReplaceGroup(-2032274);
                                                                                                                    ComposerKt.sourceInformation(composer5, "789@36600L40");
                                                                                                                    CoreTextFieldKt.TextFieldCursorHandle(textFieldSelectionManager7, composer5, 0);
                                                                                                                    composer5.endReplaceGroup();
                                                                                                                } else {
                                                                                                                    composer5.startReplaceGroup(-1955394);
                                                                                                                    composer5.endReplaceGroup();
                                                                                                                }
                                                                                                                if (ComposerKt.isTraceInProgress()) {
                                                                                                                    ComposerKt.traceEventEnd();
                                                                                                                    return;
                                                                                                                }
                                                                                                                return;
                                                                                                            }
                                                                                                            composer5.skipToGroupEnd();
                                                                                                        }
                                                                                                    }, composer4, 54), composer4, 48, 0);
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
                                                                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384);
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                            }
                                                                            i33 = i42;
                                                                            i34 = i482;
                                                                            composer2 = composerStartRestartGroup;
                                                                            z22 = z5;
                                                                            function14 = function13;
                                                                            mutableInteractionSource4 = mutableInteractionSource5;
                                                                            brush3 = brush4;
                                                                            keyboardActions3 = keyboardActions5;
                                                                            imeOptions9 = imeOptions122;
                                                                            z23 = z9;
                                                                            z24 = z322;
                                                                            textStyle5 = textStyle4;
                                                                            function32 = function332;
                                                                            visualTransformation4 = visualTransformation5;
                                                                            modifier4 = modifier5;
                                                                        }
                                                                    }
                                                                } else {
                                                                    zChangedInstance9 = composerStartRestartGroup.changedInstance(legacyTextFieldState6) | ((i32 <= 32 && composerStartRestartGroup.changed(imeOptions8)) || (i47 & 48) == 32) | composerStartRestartGroup.changedInstance(legacyPlatformTextInputServiceAdapter);
                                                                    objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                                                                    if (zChangedInstance9) {
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            zChangedInstance8 = (i44 == 4) | composerStartRestartGroup.changedInstance(legacyTextFieldState6) | composerStartRestartGroup.changedInstance(textInputService2) | ((i32 > 32 && composerStartRestartGroup.changed(imeOptions8)) || (i47 & 48) == 32);
                                                            objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                                                            if (zChangedInstance8) {
                                                            }
                                                        }
                                                    } else {
                                                        z12 = zChanged3;
                                                    }
                                                    z13 = true;
                                                    z14 = z12 | z13;
                                                    Object objRememberedValue162 = composerStartRestartGroup.rememberedValue();
                                                    if (z14) {
                                                        state = stateRememberUpdatedState;
                                                        textInputService2 = textInputService4;
                                                        coreTextFieldKt$CoreTextField$2$1 = new CoreTextFieldKt$CoreTextField$2$1(legacyTextFieldState, stateRememberUpdatedState, textInputService4, textFieldSelectionManager, imeOptions7, null);
                                                        composerStartRestartGroup.updateRememberedValue(coreTextFieldKt$CoreTextField$2$1);
                                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                        State state22 = state;
                                                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) coreTextFieldKt$CoreTextField$2$1, composerStartRestartGroup, 6);
                                                        Modifier.Companion companion22 = Modifier.INSTANCE;
                                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705163133, "CC(remember):CoreTextField.kt#9igjgp");
                                                        zChangedInstance2 = composerStartRestartGroup.changedInstance(legacyTextFieldState);
                                                        objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                                        if (!zChangedInstance2) {
                                                            objRememberedValue9 = (Function1) new Function1<Boolean, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$1$1
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                                                    invoke(bool.booleanValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                public final void invoke(boolean z302) {
                                                                    legacyTextFieldState.setInTouchMode(z302);
                                                                }
                                                            };
                                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                            Modifier modifierUpdateSelectionTouchMode2 = SelectionGesturesKt.updateSelectionTouchMode(companion22, (Function1) objRememberedValue9);
                                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705159310, "CC(remember):CoreTextField.kt#9igjgp");
                                                            zChangedInstance3 = composerStartRestartGroup.changedInstance(legacyTextFieldState) | (i46 != 16384) | (i45 != 2048) | composerStartRestartGroup.changedInstance(offsetMapping2) | composerStartRestartGroup.changedInstance(textFieldSelectionManager);
                                                            Object objRememberedValue172 = composerStartRestartGroup.rememberedValue();
                                                            if (zChangedInstance3) {
                                                                final LegacyTextFieldState legacyTextFieldState32 = legacyTextFieldState;
                                                                final TextFieldSelectionManager textFieldSelectionManager32 = textFieldSelectionManager;
                                                                final boolean z302 = z5;
                                                                z15 = z29;
                                                                obj2 = (Function1) new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$pointerModifier$2$1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(1);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                                                                        m1746invokek4lQ0M(offset.getPackedValue());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                                                                    public final void m1746invokek4lQ0M(long j) {
                                                                        CoreTextFieldKt.tapToFocus(legacyTextFieldState32, focusRequester2, !z302);
                                                                        if (legacyTextFieldState32.getHasFocus() && z29) {
                                                                            if (legacyTextFieldState32.getHandleState() != HandleState.Selection) {
                                                                                TextLayoutResultProxy layoutResult = legacyTextFieldState32.getLayoutResult();
                                                                                if (layoutResult != null) {
                                                                                    LegacyTextFieldState legacyTextFieldState42 = legacyTextFieldState32;
                                                                                    TextFieldDelegate.INSTANCE.m1823setCursorOffsetULxng0E$foundation_release(j, layoutResult, legacyTextFieldState42.getProcessor(), offsetMapping2, legacyTextFieldState42.getOnValueChange());
                                                                                    if (legacyTextFieldState42.getTextDelegate().getText().length() > 0) {
                                                                                        legacyTextFieldState42.setHandleState(HandleState.Cursor);
                                                                                        return;
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            textFieldSelectionManager32.m2154deselect_kEHs6E$foundation_release(Offset.m4343boximpl(j));
                                                                        }
                                                                    }
                                                                };
                                                                composerStartRestartGroup.updateRememberedValue(obj2);
                                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                z16 = z15;
                                                                MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                                                                Modifier modifierPointerHoverIcon$default2 = PointerIconKt.pointerHoverIcon$default(SelectionGesturesKt.selectionGestureInput(TextFieldPressGestureFilterKt.tapPressTextFieldModifier(modifierUpdateSelectionTouchMode2, mutableInteractionSource3, z15, (Function1) obj2), textFieldSelectionManager.getMouseSelectionObserver(), textFieldSelectionManager.getTouchSelectionObserver()), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
                                                                Modifier.Companion companion32 = Modifier.INSTANCE;
                                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705122293, "CC(remember):CoreTextField.kt#9igjgp");
                                                                zChangedInstance4 = composerStartRestartGroup.changedInstance(legacyTextFieldState) | (i44 != 4) | composerStartRestartGroup.changedInstance(offsetMapping2);
                                                                Object objRememberedValue182 = composerStartRestartGroup.rememberedValue();
                                                                if (zChangedInstance4) {
                                                                    obj3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$drawModifier$1$1
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
                                                                            TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
                                                                            if (layoutResult != null) {
                                                                                TextFieldValue textFieldValue2 = textFieldValue;
                                                                                LegacyTextFieldState legacyTextFieldState42 = legacyTextFieldState;
                                                                                OffsetMapping offsetMapping33 = offsetMapping2;
                                                                                TextFieldDelegate.INSTANCE.m1821drawQ1vqE60$foundation_release(drawScope.getDrawContext().getCanvas(), textFieldValue2, legacyTextFieldState42.m1771getSelectionPreviewHighlightRanged9O1mEE(), legacyTextFieldState42.m1768getDeletionPreviewHighlightRanged9O1mEE(), offsetMapping33, layoutResult.getValue(), legacyTextFieldState42.getHighlightPaint(), legacyTextFieldState42.getSelectionBackgroundColor());
                                                                            }
                                                                        }
                                                                    };
                                                                    composerStartRestartGroup.updateRememberedValue(obj3);
                                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                    final Modifier modifierDrawBehind2 = DrawModifierKt.drawBehind(companion32, (Function1) obj3);
                                                                    Modifier.Companion companion42 = Modifier.INSTANCE;
                                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705102808, "CC(remember):CoreTextField.kt#9igjgp");
                                                                    windowInfo2 = windowInfo;
                                                                    zChangedInstance5 = (i45 != 2048) | composerStartRestartGroup.changedInstance(legacyTextFieldState) | composerStartRestartGroup.changed(windowInfo2) | composerStartRestartGroup.changedInstance(textFieldSelectionManager) | (i44 != 4) | composerStartRestartGroup.changedInstance(offsetMapping2);
                                                                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                                                                    if (zChangedInstance5) {
                                                                        final LegacyTextFieldState legacyTextFieldState42 = legacyTextFieldState;
                                                                        final TextFieldSelectionManager textFieldSelectionManager42 = textFieldSelectionManager;
                                                                        z17 = z16;
                                                                        objRememberedValue10 = (Function1) new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$onPositionedModifier$1$1
                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            {
                                                                                super(1);
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                                                                                invoke2(layoutCoordinates);
                                                                                return Unit.INSTANCE;
                                                                            }

                                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                                                                                legacyTextFieldState42.setLayoutCoordinates(layoutCoordinates);
                                                                                TextLayoutResultProxy layoutResult = legacyTextFieldState42.getLayoutResult();
                                                                                if (layoutResult != null) {
                                                                                    layoutResult.setInnerTextFieldCoordinates(layoutCoordinates);
                                                                                }
                                                                                if (z16) {
                                                                                    if (legacyTextFieldState42.getHandleState() == HandleState.Selection) {
                                                                                        if (legacyTextFieldState42.getShowFloatingToolbar() && windowInfo2.isWindowFocused()) {
                                                                                            textFieldSelectionManager42.showSelectionToolbar$foundation_release();
                                                                                        } else {
                                                                                            textFieldSelectionManager42.hideSelectionToolbar$foundation_release();
                                                                                        }
                                                                                        legacyTextFieldState42.setShowSelectionHandleStart(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager42, true));
                                                                                        legacyTextFieldState42.setShowSelectionHandleEnd(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager42, false));
                                                                                        legacyTextFieldState42.setShowCursorHandle(TextRange.m6534getCollapsedimpl(textFieldValue.getSelection()));
                                                                                    } else if (legacyTextFieldState42.getHandleState() == HandleState.Cursor) {
                                                                                        legacyTextFieldState42.setShowCursorHandle(TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(textFieldSelectionManager42, true));
                                                                                    }
                                                                                    CoreTextFieldKt.notifyFocusedRect(legacyTextFieldState42, textFieldValue, offsetMapping2);
                                                                                    TextLayoutResultProxy layoutResult2 = legacyTextFieldState42.getLayoutResult();
                                                                                    if (layoutResult2 != null) {
                                                                                        LegacyTextFieldState legacyTextFieldState52 = legacyTextFieldState42;
                                                                                        TextFieldValue textFieldValue2 = textFieldValue;
                                                                                        OffsetMapping offsetMapping33 = offsetMapping2;
                                                                                        TextInputSession inputSession = legacyTextFieldState52.getInputSession();
                                                                                        if (inputSession == null || !legacyTextFieldState52.getHasFocus()) {
                                                                                            return;
                                                                                        }
                                                                                        TextFieldDelegate.INSTANCE.updateTextLayoutResult$foundation_release(inputSession, textFieldValue2, offsetMapping33, layoutResult2);
                                                                                    }
                                                                                }
                                                                            }
                                                                        };
                                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                                                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                        final Modifier modifierOnGloballyPositioned3 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion42, (Function1) objRememberedValue10);
                                                                        final VisualTransformation visualTransformation52 = visualTransformation3;
                                                                        z18 = visualTransformation52 instanceof PasswordVisualTransformation;
                                                                        Modifier.Companion companion52 = Modifier.INSTANCE;
                                                                        z19 = z17;
                                                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705046115, "CC(remember):CoreTextField.kt#9igjgp");
                                                                        if (i32 <= 32) {
                                                                            zChangedInstance6 = composerStartRestartGroup.changedInstance(transformedText) | (i44 != 4) | (i45 != 2048) | composerStartRestartGroup.changed(z18) | (i46 != 16384) | composerStartRestartGroup.changedInstance(legacyTextFieldState) | composerStartRestartGroup.changedInstance(offsetMapping2) | composerStartRestartGroup.changedInstance(textFieldSelectionManager) | ((i32 <= 32 && composerStartRestartGroup.changed(imeOptions7)) || (i47 & 48) == 32);
                                                                            Object objRememberedValue192 = composerStartRestartGroup.rememberedValue();
                                                                            if (zChangedInstance6) {
                                                                                final LegacyTextFieldState legacyTextFieldState52 = legacyTextFieldState;
                                                                                final ImeOptions imeOptions112 = imeOptions7;
                                                                                final TextFieldSelectionManager textFieldSelectionManager52 = textFieldSelectionManager;
                                                                                final boolean z312 = z5;
                                                                                final TransformedText transformedText32 = transformedText;
                                                                                Object obj62 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1
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
                                                                                    public final void invoke2(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                                                        SemanticsPropertyReceiver semanticsPropertyReceiver2 = semanticsPropertyReceiver;
                                                                                        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, transformedText32.getText());
                                                                                        SemanticsPropertiesKt.m6370setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, textFieldValue.getSelection());
                                                                                        if (!z19) {
                                                                                            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                                                                                        }
                                                                                        if (z18) {
                                                                                            SemanticsPropertiesKt.password(semanticsPropertyReceiver);
                                                                                        }
                                                                                        boolean z323 = z19 && !z312;
                                                                                        SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z323);
                                                                                        final LegacyTextFieldState legacyTextFieldState62 = legacyTextFieldState52;
                                                                                        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.1
                                                                                            {
                                                                                                super(1);
                                                                                            }

                                                                                            @Override // kotlin.jvm.functions.Function1
                                                                                            public final Boolean invoke(List<TextLayoutResult> list) {
                                                                                                boolean z33;
                                                                                                if (legacyTextFieldState62.getLayoutResult() != null) {
                                                                                                    TextLayoutResultProxy layoutResult = legacyTextFieldState62.getLayoutResult();
                                                                                                    Intrinsics.checkNotNull(layoutResult);
                                                                                                    list.add(layoutResult.getValue());
                                                                                                    z33 = true;
                                                                                                } else {
                                                                                                    z33 = false;
                                                                                                }
                                                                                                return Boolean.valueOf(z33);
                                                                                            }
                                                                                        }, 1, null);
                                                                                        if (z323) {
                                                                                            final LegacyTextFieldState legacyTextFieldState7 = legacyTextFieldState52;
                                                                                            SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.2
                                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                {
                                                                                                    super(1);
                                                                                                }

                                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                                public final Boolean invoke(AnnotatedString annotatedString2) {
                                                                                                    Unit unit2;
                                                                                                    TextInputSession inputSession = legacyTextFieldState7.getInputSession();
                                                                                                    if (inputSession != null) {
                                                                                                        LegacyTextFieldState legacyTextFieldState8 = legacyTextFieldState7;
                                                                                                        TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(annotatedString2, 1)}), legacyTextFieldState8.getProcessor(), legacyTextFieldState8.getOnValueChange(), inputSession);
                                                                                                        unit2 = Unit.INSTANCE;
                                                                                                    } else {
                                                                                                        unit2 = null;
                                                                                                    }
                                                                                                    if (unit2 == null) {
                                                                                                        legacyTextFieldState7.getOnValueChange().invoke(new TextFieldValue(annotatedString2.getText(), TextRangeKt.TextRange(annotatedString2.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                                                                    }
                                                                                                    return true;
                                                                                                }
                                                                                            }, 1, null);
                                                                                            final boolean z33 = z312;
                                                                                            final boolean z34 = z19;
                                                                                            final LegacyTextFieldState legacyTextFieldState8 = legacyTextFieldState52;
                                                                                            final TextFieldValue textFieldValue2 = textFieldValue;
                                                                                            semanticsPropertyReceiver2 = semanticsPropertyReceiver;
                                                                                            SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.3
                                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                                {
                                                                                                    super(1);
                                                                                                }

                                                                                                @Override // kotlin.jvm.functions.Function1
                                                                                                public final Boolean invoke(AnnotatedString annotatedString2) {
                                                                                                    Unit unit2;
                                                                                                    if (z33 || !z34) {
                                                                                                        return false;
                                                                                                    }
                                                                                                    TextInputSession inputSession = legacyTextFieldState8.getInputSession();
                                                                                                    if (inputSession != null) {
                                                                                                        LegacyTextFieldState legacyTextFieldState9 = legacyTextFieldState8;
                                                                                                        TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt.listOf((Object[]) new EditCommand[]{new FinishComposingTextCommand(), new CommitTextCommand(annotatedString2, 1)}), legacyTextFieldState9.getProcessor(), legacyTextFieldState9.getOnValueChange(), inputSession);
                                                                                                        unit2 = Unit.INSTANCE;
                                                                                                    } else {
                                                                                                        unit2 = null;
                                                                                                    }
                                                                                                    if (unit2 == null) {
                                                                                                        TextFieldValue textFieldValue3 = textFieldValue2;
                                                                                                        legacyTextFieldState8.getOnValueChange().invoke(new TextFieldValue(StringsKt.replaceRange((CharSequence) textFieldValue3.getText(), TextRange.m6540getStartimpl(textFieldValue3.getSelection()), TextRange.m6535getEndimpl(textFieldValue3.getSelection()), (CharSequence) annotatedString2).toString(), TextRangeKt.TextRange(TextRange.m6540getStartimpl(textFieldValue3.getSelection()) + annotatedString2.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                                                                    }
                                                                                                    return true;
                                                                                                }
                                                                                            }, 1, null);
                                                                                        }
                                                                                        final OffsetMapping offsetMapping33 = offsetMapping2;
                                                                                        final boolean z35 = z19;
                                                                                        final TextFieldValue textFieldValue3 = textFieldValue;
                                                                                        final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager52;
                                                                                        final LegacyTextFieldState legacyTextFieldState9 = legacyTextFieldState52;
                                                                                        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.4
                                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                            {
                                                                                                super(3);
                                                                                            }

                                                                                            @Override // kotlin.jvm.functions.Function3
                                                                                            public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Integer num2, Boolean bool) {
                                                                                                return invoke(num.intValue(), num2.intValue(), bool.booleanValue());
                                                                                            }

                                                                                            public final Boolean invoke(int i483, int i49, boolean z36) {
                                                                                                if (!z36) {
                                                                                                    i483 = offsetMapping33.transformedToOriginal(i483);
                                                                                                }
                                                                                                if (!z36) {
                                                                                                    i49 = offsetMapping33.transformedToOriginal(i49);
                                                                                                }
                                                                                                boolean z37 = false;
                                                                                                if (z35 && (i483 != TextRange.m6540getStartimpl(textFieldValue3.getSelection()) || i49 != TextRange.m6535getEndimpl(textFieldValue3.getSelection()))) {
                                                                                                    if (Math.min(i483, i49) >= 0 && Math.max(i483, i49) <= textFieldValue3.getAnnotatedString().length()) {
                                                                                                        if (z36 || i483 == i49) {
                                                                                                            textFieldSelectionManager6.exitSelectionMode$foundation_release();
                                                                                                        } else {
                                                                                                            TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager6, false, 1, null);
                                                                                                        }
                                                                                                        legacyTextFieldState9.getOnValueChange().invoke(new TextFieldValue(textFieldValue3.getAnnotatedString(), TextRangeKt.TextRange(i483, i49), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                                                                                        z37 = true;
                                                                                                    } else {
                                                                                                        textFieldSelectionManager6.exitSelectionMode$foundation_release();
                                                                                                    }
                                                                                                }
                                                                                                return Boolean.valueOf(z37);
                                                                                            }
                                                                                        }, 1, null);
                                                                                        int imeAction = imeOptions112.getImeAction();
                                                                                        final LegacyTextFieldState legacyTextFieldState10 = legacyTextFieldState52;
                                                                                        final ImeOptions imeOptions123 = imeOptions112;
                                                                                        SemanticsPropertiesKt.m6365onImeAction9UiTYpY$default(semanticsPropertyReceiver2, imeAction, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.5
                                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                            {
                                                                                                super(0);
                                                                                            }

                                                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                                                            @Override // kotlin.jvm.functions.Function0
                                                                                            public final Boolean invoke() {
                                                                                                legacyTextFieldState10.getOnImeActionPerformed().invoke(ImeAction.m6702boximpl(imeOptions123.getImeAction()));
                                                                                                return true;
                                                                                            }
                                                                                        }, 2, null);
                                                                                        final LegacyTextFieldState legacyTextFieldState11 = legacyTextFieldState52;
                                                                                        final FocusRequester focusRequester3 = focusRequester2;
                                                                                        final boolean z36 = z312;
                                                                                        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.6
                                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                            {
                                                                                                super(0);
                                                                                            }

                                                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                                                            @Override // kotlin.jvm.functions.Function0
                                                                                            public final Boolean invoke() {
                                                                                                CoreTextFieldKt.tapToFocus(legacyTextFieldState11, focusRequester3, !z36);
                                                                                                return true;
                                                                                            }
                                                                                        }, 1, null);
                                                                                        final TextFieldSelectionManager textFieldSelectionManager7 = textFieldSelectionManager52;
                                                                                        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.7
                                                                                            {
                                                                                                super(0);
                                                                                            }

                                                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                                                            @Override // kotlin.jvm.functions.Function0
                                                                                            public final Boolean invoke() {
                                                                                                TextFieldSelectionManager.enterSelectionMode$foundation_release$default(textFieldSelectionManager7, false, 1, null);
                                                                                                return true;
                                                                                            }
                                                                                        }, 1, null);
                                                                                        if (!TextRange.m6534getCollapsedimpl(textFieldValue.getSelection()) && !z18) {
                                                                                            final TextFieldSelectionManager textFieldSelectionManager8 = textFieldSelectionManager52;
                                                                                            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.8
                                                                                                {
                                                                                                    super(0);
                                                                                                }

                                                                                                /* JADX WARN: Can't rename method to resolve collision */
                                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                                public final Boolean invoke() {
                                                                                                    TextFieldSelectionManager.copy$foundation_release$default(textFieldSelectionManager8, false, 1, null);
                                                                                                    return true;
                                                                                                }
                                                                                            }, 1, null);
                                                                                            if (z19 && !z312) {
                                                                                                final TextFieldSelectionManager textFieldSelectionManager9 = textFieldSelectionManager52;
                                                                                                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.9
                                                                                                    {
                                                                                                        super(0);
                                                                                                    }

                                                                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                                                                    @Override // kotlin.jvm.functions.Function0
                                                                                                    public final Boolean invoke() {
                                                                                                        textFieldSelectionManager9.cut$foundation_release();
                                                                                                        return true;
                                                                                                    }
                                                                                                }, 1, null);
                                                                                            }
                                                                                        }
                                                                                        if (!z19 || z312) {
                                                                                            return;
                                                                                        }
                                                                                        final TextFieldSelectionManager textFieldSelectionManager10 = textFieldSelectionManager52;
                                                                                        SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$semanticsModifier$1$1.10
                                                                                            {
                                                                                                super(0);
                                                                                            }

                                                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                                                            @Override // kotlin.jvm.functions.Function0
                                                                                            public final Boolean invoke() {
                                                                                                textFieldSelectionManager10.paste$foundation_release();
                                                                                                return true;
                                                                                            }
                                                                                        }, 1, null);
                                                                                    }
                                                                                };
                                                                                z20 = z19;
                                                                                imeOptions8 = imeOptions112;
                                                                                focusRequester = focusRequester2;
                                                                                obj4 = (Function1) obj62;
                                                                                composerStartRestartGroup.updateRememberedValue(obj4);
                                                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                                Modifier modifierSemantics2 = SemanticsModifierKt.semantics(companion52, true, (Function1) obj4);
                                                                                if (z20) {
                                                                                    final LegacyTextFieldState legacyTextFieldState62 = legacyTextFieldState;
                                                                                    final Modifier modifierCursor2 = TextFieldCursorKt.cursor(Modifier.INSTANCE, legacyTextFieldState62, textFieldValue, offsetMapping2, brush4, (z20 || z5 || !windowInfo2.isWindowFocused() || legacyTextFieldState.hasHighlight()) ? false : true);
                                                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1704832829, "CC(remember):CoreTextField.kt#9igjgp");
                                                                                    zChangedInstance7 = composerStartRestartGroup.changedInstance(textFieldSelectionManager);
                                                                                    Object objRememberedValue202 = composerStartRestartGroup.rememberedValue();
                                                                                    if (zChangedInstance7) {
                                                                                    }
                                                                                    objRememberedValue202 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1
                                                                                        {
                                                                                            super(1);
                                                                                        }

                                                                                        @Override // kotlin.jvm.functions.Function1
                                                                                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                                                            final TextFieldSelectionManager textFieldSelectionManager6 = textFieldSelectionManager;
                                                                                            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$3$1$invoke$$inlined$onDispose$1
                                                                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                                                                public void dispose() {
                                                                                                    textFieldSelectionManager6.hideSelectionToolbar$foundation_release();
                                                                                                }
                                                                                            };
                                                                                        }
                                                                                    };
                                                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue202);
                                                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                                                    EffectsKt.DisposableEffect(textFieldSelectionManager, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue202, composerStartRestartGroup, 0);
                                                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1704829391, "CC(remember):CoreTextField.kt#9igjgp");
                                                                                }
                                                                            }
                                                                        } else {
                                                                            zChangedInstance6 = composerStartRestartGroup.changedInstance(transformedText) | (i44 != 4) | (i45 != 2048) | composerStartRestartGroup.changed(z18) | (i46 != 16384) | composerStartRestartGroup.changedInstance(legacyTextFieldState) | composerStartRestartGroup.changedInstance(offsetMapping2) | composerStartRestartGroup.changedInstance(textFieldSelectionManager) | ((i32 <= 32 && composerStartRestartGroup.changed(imeOptions7)) || (i47 & 48) == 32);
                                                                            Object objRememberedValue1922 = composerStartRestartGroup.rememberedValue();
                                                                            if (zChangedInstance6) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    imeOptions5 = imeOptions4;
                                                }
                                                imeOptions6 = imeOptions5;
                                                z10 = z4;
                                                boolean z33 = (i47 & 48) == 32;
                                                zChangedInstance = zChangedInstance10 | z33 | composerStartRestartGroup.changedInstance(offsetMapping2) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(bringIntoViewRequester2) | composerStartRestartGroup.changedInstance(textFieldSelectionManager2);
                                                Object objRememberedValue152 = composerStartRestartGroup.rememberedValue();
                                                if (zChangedInstance) {
                                                    final boolean z282 = z5;
                                                    final ImeOptions imeOptions102 = imeOptions6;
                                                    Object obj52 = new Function1<FocusState, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                                            TextLayoutResultProxy layoutResult;
                                                            if (legacyTextFieldState2.getHasFocus() == focusState.isFocused()) {
                                                                return;
                                                            }
                                                            legacyTextFieldState2.setHasFocus(focusState.isFocused());
                                                            if (!legacyTextFieldState2.getHasFocus() || !z10 || z282) {
                                                                CoreTextFieldKt.endInputSession(legacyTextFieldState2);
                                                            } else {
                                                                CoreTextFieldKt.startInputSession(textInputService3, legacyTextFieldState2, textFieldValue, imeOptions102, offsetMapping2);
                                                            }
                                                            if (focusState.isFocused() && (layoutResult = legacyTextFieldState2.getLayoutResult()) != null) {
                                                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1(bringIntoViewRequester2, textFieldValue, legacyTextFieldState2, layoutResult, offsetMapping2, null), 3, null);
                                                            }
                                                            if (focusState.isFocused()) {
                                                                return;
                                                            }
                                                            TextFieldSelectionManager.m2150deselect_kEHs6E$foundation_release$default(textFieldSelectionManager2, null, 1, null);
                                                        }
                                                    };
                                                    legacyTextFieldState = legacyTextFieldState2;
                                                    textInputService = textInputService3;
                                                    imeOptions7 = imeOptions102;
                                                    textFieldSelectionManager = textFieldSelectionManager2;
                                                    bringIntoViewRequester = bringIntoViewRequester2;
                                                    visualTransformation3 = visualTransformation2;
                                                    z11 = z10;
                                                    obj = (Function1) obj52;
                                                    composerStartRestartGroup.updateRememberedValue(obj);
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    Modifier modifierTextFieldFocusModifier2 = TextFieldGestureModifiersKt.textFieldFocusModifier(companion, z11, focusRequester2, mutableInteractionSource3, (Function1) obj);
                                                    if (z11) {
                                                        State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(Boolean.valueOf((z11 || z5) ? false : true), composerStartRestartGroup, 0);
                                                        Unit unit2 = Unit.INSTANCE;
                                                        final boolean z292 = z11;
                                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705195503, "CC(remember):CoreTextField.kt#9igjgp");
                                                        zChanged3 = composerStartRestartGroup.changed(stateRememberUpdatedState2) | composerStartRestartGroup.changedInstance(legacyTextFieldState) | composerStartRestartGroup.changedInstance(textInputService) | composerStartRestartGroup.changedInstance(textFieldSelectionManager);
                                                        TextInputService textInputService42 = textInputService;
                                                        if (i32 > 32) {
                                                            z12 = zChanged3;
                                                            if ((i47 & 48) != 32) {
                                                                z13 = true;
                                                            }
                                                            z14 = z12 | z13;
                                                            Object objRememberedValue1622 = composerStartRestartGroup.rememberedValue();
                                                            if (z14) {
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                transformedText = transformedText2;
                                            }
                                            boolean z34 = z7;
                                            TextDelegate textDelegate = new TextDelegate(text, textStyle6, 0, 0, z34, 0, density, resolver2, null, 300, null);
                                            annotatedString = text;
                                            textStyle4 = textStyle6;
                                            z9 = z34;
                                            resolver = resolver2;
                                            density = density;
                                            objRememberedValue14 = new LegacyTextFieldState(textDelegate, currentRecomposeScope, softwareKeyboardController);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                                            final LegacyTextFieldState legacyTextFieldState22 = (LegacyTextFieldState) objRememberedValue14;
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            final Density density22 = density;
                                            legacyTextFieldState22.m1776updatefnh65Uc(textFieldValue.getAnnotatedString(), annotatedString, textStyle4, z9, density22, resolver, function1, keyboardActions5, focusManager2, backgroundColor);
                                            legacyTextFieldState22.getProcessor().reset(textFieldValue, legacyTextFieldState22.getInputSession());
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705279231, "CC(remember):CoreTextField.kt#9igjgp");
                                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            }
                                            UndoManager undoManager2 = (UndoManager) objRememberedValue5;
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            UndoManager.snapshotIfNeeded$default(undoManager2, textFieldValue, 0L, 2, null);
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705276454, "CC(remember):CoreTextField.kt#9igjgp");
                                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                            }
                                            final TextFieldSelectionManager textFieldSelectionManager22 = (TextFieldSelectionManager) objRememberedValue6;
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            textFieldSelectionManager22.setOffsetMapping$foundation_release(offsetMapping2);
                                            textFieldSelectionManager22.setVisualTransformation$foundation_release(visualTransformation2);
                                            textFieldSelectionManager22.setOnValueChange$foundation_release(legacyTextFieldState22.getOnValueChange());
                                            textFieldSelectionManager22.setState$foundation_release(legacyTextFieldState22);
                                            textFieldSelectionManager22.setValue$foundation_release(textFieldValue);
                                            ProvidableCompositionLocal<ClipboardManager> localClipboardManager2 = CompositionLocalsKt.getLocalClipboardManager();
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume72 = composerStartRestartGroup.consume(localClipboardManager2);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            textFieldSelectionManager22.setClipboardManager$foundation_release((ClipboardManager) objConsume72);
                                            ProvidableCompositionLocal<TextToolbar> localTextToolbar2 = CompositionLocalsKt.getLocalTextToolbar();
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume82 = composerStartRestartGroup.consume(localTextToolbar2);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            textFieldSelectionManager22.setTextToolbar((TextToolbar) objConsume82);
                                            ProvidableCompositionLocal<HapticFeedback> localHapticFeedback2 = CompositionLocalsKt.getLocalHapticFeedback();
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume92 = composerStartRestartGroup.consume(localHapticFeedback2);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            textFieldSelectionManager22.setHapticFeedBack((HapticFeedback) objConsume92);
                                            textFieldSelectionManager22.setFocusRequester(focusRequester2);
                                            textFieldSelectionManager22.setEditable(!z5);
                                            textFieldSelectionManager22.setEnabled(z4);
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            final CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705256948, "CC(remember):CoreTextField.kt#9igjgp");
                                            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                            }
                                            final BringIntoViewRequester bringIntoViewRequester22 = (BringIntoViewRequester) objRememberedValue8;
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            Modifier.Companion companion7 = Modifier.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705248170, "CC(remember):CoreTextField.kt#9igjgp");
                                            int i452 = i30 & 7168;
                                            int i462 = i30 & 57344;
                                            int i472 = i30;
                                            boolean zChangedInstance102 = (i44 == 4) | composerStartRestartGroup.changedInstance(legacyTextFieldState22) | (i452 == 2048) | (i462 == 16384) | composerStartRestartGroup.changedInstance(textInputService3);
                                            i32 = (i472 & LDSFile.EF_DG16_TAG) ^ 48;
                                            if (i32 > 32) {
                                            }
                                            imeOptions6 = imeOptions5;
                                            z10 = z4;
                                            if ((i472 & 48) == 32) {
                                            }
                                            zChangedInstance = zChangedInstance102 | z33 | composerStartRestartGroup.changedInstance(offsetMapping2) | composerStartRestartGroup.changedInstance(coroutineScope2) | composerStartRestartGroup.changedInstance(bringIntoViewRequester22) | composerStartRestartGroup.changedInstance(textFieldSelectionManager22);
                                            Object objRememberedValue1522 = composerStartRestartGroup.rememberedValue();
                                            if (zChangedInstance) {
                                            }
                                        }
                                        objRememberedValue13 = (Function0) new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final TextFieldScrollerPosition invoke() {
                                                return new TextFieldScrollerPosition(orientation2, 0.0f, 2, null);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        final TextFieldScrollerPosition textFieldScrollerPosition2 = (TextFieldScrollerPosition) RememberSaveableKt.m4181rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue13, composerStartRestartGroup, 0, 4);
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705324236, "CC(remember):CoreTextField.kt#9igjgp");
                                        int i442 = i41 & 14;
                                        z8 = (i442 != 4) | ((i41 & 57344) != 16384);
                                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                        if (z8) {
                                            TransformedText transformedTextFilterWithValidation2 = ValidatingOffsetMappingKt.filterWithValidation(visualTransformation2, textFieldValue.getAnnotatedString());
                                            composition = textFieldValue.getComposition();
                                            imeOptions4 = imeOptions3;
                                            if (composition == null) {
                                            }
                                            objRememberedValue4 = transformedTextFilterWithValidation2;
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                            TransformedText transformedText22 = (TransformedText) objRememberedValue4;
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            AnnotatedString text2 = transformedText22.getText();
                                            final OffsetMapping offsetMapping22 = transformedText22.getOffsetMapping();
                                            RecomposeScope currentRecomposeScope2 = ComposablesKt.getCurrentRecomposeScope(composerStartRestartGroup, 0);
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705304518, "CC(remember):CoreTextField.kt#9igjgp");
                                            zChanged2 = composerStartRestartGroup.changed(softwareKeyboardController);
                                            Object objRememberedValue142 = composerStartRestartGroup.rememberedValue();
                                            if (zChanged2) {
                                            }
                                            boolean z342 = z7;
                                            TextDelegate textDelegate2 = new TextDelegate(text2, textStyle6, 0, 0, z342, 0, density, resolver2, null, 300, null);
                                            annotatedString = text2;
                                            textStyle4 = textStyle6;
                                            z9 = z342;
                                            resolver = resolver2;
                                            density = density;
                                            objRememberedValue142 = new LegacyTextFieldState(textDelegate2, currentRecomposeScope2, softwareKeyboardController);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue142);
                                            final LegacyTextFieldState legacyTextFieldState222 = (LegacyTextFieldState) objRememberedValue142;
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            final Density density222 = density;
                                            legacyTextFieldState222.m1776updatefnh65Uc(textFieldValue.getAnnotatedString(), annotatedString, textStyle4, z9, density222, resolver, function1, keyboardActions5, focusManager2, backgroundColor);
                                            legacyTextFieldState222.getProcessor().reset(textFieldValue, legacyTextFieldState222.getInputSession());
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705279231, "CC(remember):CoreTextField.kt#9igjgp");
                                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            }
                                            UndoManager undoManager22 = (UndoManager) objRememberedValue5;
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            UndoManager.snapshotIfNeeded$default(undoManager22, textFieldValue, 0L, 2, null);
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705276454, "CC(remember):CoreTextField.kt#9igjgp");
                                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                            }
                                            final TextFieldSelectionManager textFieldSelectionManager222 = (TextFieldSelectionManager) objRememberedValue6;
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            textFieldSelectionManager222.setOffsetMapping$foundation_release(offsetMapping22);
                                            textFieldSelectionManager222.setVisualTransformation$foundation_release(visualTransformation2);
                                            textFieldSelectionManager222.setOnValueChange$foundation_release(legacyTextFieldState222.getOnValueChange());
                                            textFieldSelectionManager222.setState$foundation_release(legacyTextFieldState222);
                                            textFieldSelectionManager222.setValue$foundation_release(textFieldValue);
                                            ProvidableCompositionLocal<ClipboardManager> localClipboardManager22 = CompositionLocalsKt.getLocalClipboardManager();
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume722 = composerStartRestartGroup.consume(localClipboardManager22);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            textFieldSelectionManager222.setClipboardManager$foundation_release((ClipboardManager) objConsume722);
                                            ProvidableCompositionLocal<TextToolbar> localTextToolbar22 = CompositionLocalsKt.getLocalTextToolbar();
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume822 = composerStartRestartGroup.consume(localTextToolbar22);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            textFieldSelectionManager222.setTextToolbar((TextToolbar) objConsume822);
                                            ProvidableCompositionLocal<HapticFeedback> localHapticFeedback22 = CompositionLocalsKt.getLocalHapticFeedback();
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume922 = composerStartRestartGroup.consume(localHapticFeedback22);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            textFieldSelectionManager222.setHapticFeedBack((HapticFeedback) objConsume922);
                                            textFieldSelectionManager222.setFocusRequester(focusRequester2);
                                            textFieldSelectionManager222.setEditable(!z5);
                                            textFieldSelectionManager222.setEnabled(z4);
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                                            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            final CoroutineScope coroutineScope22 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue7).getCoroutineScope();
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705256948, "CC(remember):CoreTextField.kt#9igjgp");
                                            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                            }
                                            final BringIntoViewRequester bringIntoViewRequester222 = (BringIntoViewRequester) objRememberedValue8;
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            Modifier.Companion companion72 = Modifier.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705248170, "CC(remember):CoreTextField.kt#9igjgp");
                                            int i4522 = i30 & 7168;
                                            int i4622 = i30 & 57344;
                                            int i4722 = i30;
                                            boolean zChangedInstance1022 = (i442 == 4) | composerStartRestartGroup.changedInstance(legacyTextFieldState222) | (i4522 == 2048) | (i4622 == 16384) | composerStartRestartGroup.changedInstance(textInputService3);
                                            i32 = (i4722 & LDSFile.EF_DG16_TAG) ^ 48;
                                            if (i32 > 32) {
                                            }
                                            imeOptions6 = imeOptions5;
                                            z10 = z4;
                                            if ((i4722 & 48) == 32) {
                                            }
                                            zChangedInstance = zChangedInstance1022 | z33 | composerStartRestartGroup.changedInstance(offsetMapping22) | composerStartRestartGroup.changedInstance(coroutineScope22) | composerStartRestartGroup.changedInstance(bringIntoViewRequester222) | composerStartRestartGroup.changedInstance(textFieldSelectionManager222);
                                            Object objRememberedValue15222 = composerStartRestartGroup.rememberedValue();
                                            if (zChangedInstance) {
                                            }
                                        }
                                    } else {
                                        i30 = i43;
                                    }
                                    orientation = Orientation.Vertical;
                                    final Orientation orientation22 = orientation;
                                    Object[] objArr2 = {orientation22};
                                    Saver<TextFieldScrollerPosition, Object> saver2 = TextFieldScrollerPosition.INSTANCE.getSaver();
                                    Modifier modifier52 = modifier3;
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705327119, "CC(remember):CoreTextField.kt#9igjgp");
                                    zChanged = composerStartRestartGroup.changed(orientation22);
                                    Object objRememberedValue132 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged) {
                                    }
                                    objRememberedValue132 = (Function0) new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final TextFieldScrollerPosition invoke() {
                                            return new TextFieldScrollerPosition(orientation22, 0.0f, 2, null);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue132);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    final TextFieldScrollerPosition textFieldScrollerPosition22 = (TextFieldScrollerPosition) RememberSaveableKt.m4181rememberSaveable(objArr2, (Saver) saver2, (String) null, (Function0) objRememberedValue132, composerStartRestartGroup, 0, 4);
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705324236, "CC(remember):CoreTextField.kt#9igjgp");
                                    int i4422 = i41 & 14;
                                    z8 = (i4422 != 4) | ((i41 & 57344) != 16384);
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (z8) {
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    visualTransformation4 = visualTransformation;
                                    i33 = i2;
                                    keyboardActions3 = keyboardActions;
                                    z22 = z3;
                                    function32 = function3;
                                    composer2 = composerStartRestartGroup;
                                    brush3 = brush2;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    function14 = c09531;
                                    textStyle5 = textStyle2;
                                    modifier4 = modifier2;
                                    z23 = z;
                                    i34 = i;
                                    imeOptions9 = imeOptions;
                                    z24 = z2;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField.6
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

                                        public final void invoke(Composer composer3, int i49) {
                                            CoreTextFieldKt.CoreTextField(textFieldValue, function1, modifier4, textStyle5, visualTransformation4, function14, mutableInteractionSource4, brush3, z23, i34, i33, imeOptions9, keyboardActions3, z24, z22, function32, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i6 |= 805306368;
                            i16 = i15;
                            i17 = i5 & 1024;
                            if (i17 != 0) {
                            }
                            if ((i4 & 48) == 0) {
                            }
                            int i352 = i19;
                            i20 = i5 & 4096;
                            if (i20 != 0) {
                            }
                            i22 = i5 & 8192;
                            if (i22 != 0) {
                            }
                            i24 = i5 & 16384;
                            if (i24 != 0) {
                            }
                            i26 = i5 & 32768;
                            if (i26 != 0) {
                            }
                            if ((i6 & 306783379) != 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i3 & 1) != 0) {
                                    if (i7 != 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i11 != 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    if (i18 == 0) {
                                    }
                                    if ((i5 & 2048) == 0) {
                                    }
                                    if (i20 == 0) {
                                    }
                                    if (i22 == 0) {
                                    }
                                    if (i24 == 0) {
                                    }
                                    if (i26 == 0) {
                                    }
                                    visualTransformation2 = none;
                                    modifier3 = modifier2;
                                    z4 = z26;
                                    z5 = z27;
                                    z6 = z25;
                                    textStyle3 = textStyle2;
                                    keyboardActions2 = keyboardActions4;
                                    function13 = c09531;
                                    imeOptions3 = imeOptions2;
                                    i29 = i25;
                                    composerStartRestartGroup.endDefaults();
                                    TextStyle textStyle62 = textStyle3;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705356604, "CC(remember):CoreTextField.kt#9igjgp");
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    int i412 = i6;
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    }
                                    final FocusRequester focusRequester22 = (FocusRequester) objRememberedValue;
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705354335, "CC(remember):CoreTextField.kt#9igjgp");
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    Brush brush42 = brush2;
                                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    final LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter2 = (LegacyPlatformTextInputServiceAdapter) objRememberedValue2;
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705350993, "CC(remember):CoreTextField.kt#9igjgp");
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    final int i422 = i27;
                                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    }
                                    final TextInputService textInputService32 = (TextInputService) objRememberedValue3;
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                                    KeyboardActions keyboardActions52 = keyboardActions2;
                                    int i432 = i29;
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume10 = composerStartRestartGroup.consume(localDensity2);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    Density density3 = (Density) objConsume10;
                                    ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver2 = CompositionLocalsKt.getLocalFontFamilyResolver();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume22 = composerStartRestartGroup.consume(localFontFamilyResolver2);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    FontFamily.Resolver resolver22 = (FontFamily.Resolver) objConsume22;
                                    ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors2 = TextSelectionColorsKt.getLocalTextSelectionColors();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume32 = composerStartRestartGroup.consume(localTextSelectionColors2);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    long backgroundColor2 = ((TextSelectionColors) objConsume32).getBackgroundColor();
                                    ProvidableCompositionLocal<FocusManager> localFocusManager2 = CompositionLocalsKt.getLocalFocusManager();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume42 = composerStartRestartGroup.consume(localFocusManager2);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    FocusManager focusManager22 = (FocusManager) objConsume42;
                                    ProvidableCompositionLocal<WindowInfo> localWindowInfo2 = CompositionLocalsKt.getLocalWindowInfo();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume52 = composerStartRestartGroup.consume(localWindowInfo2);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    WindowInfo windowInfo32 = (WindowInfo) objConsume52;
                                    ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController2 = CompositionLocalsKt.getLocalSoftwareKeyboardController();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume62 = composerStartRestartGroup.consume(localSoftwareKeyboardController2);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    SoftwareKeyboardController softwareKeyboardController2 = (SoftwareKeyboardController) objConsume62;
                                    if (i28 != 1) {
                                    }
                                    orientation = Orientation.Vertical;
                                    final Orientation orientation222 = orientation;
                                    Object[] objArr22 = {orientation222};
                                    Saver<TextFieldScrollerPosition, Object> saver22 = TextFieldScrollerPosition.INSTANCE.getSaver();
                                    Modifier modifier522 = modifier3;
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705327119, "CC(remember):CoreTextField.kt#9igjgp");
                                    zChanged = composerStartRestartGroup.changed(orientation222);
                                    Object objRememberedValue1322 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged) {
                                    }
                                    objRememberedValue1322 = (Function0) new Function0<TextFieldScrollerPosition>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$scrollerPosition$1$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final TextFieldScrollerPosition invoke() {
                                            return new TextFieldScrollerPosition(orientation222, 0.0f, 2, null);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue1322);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    final TextFieldScrollerPosition textFieldScrollerPosition222 = (TextFieldScrollerPosition) RememberSaveableKt.m4181rememberSaveable(objArr22, (Saver) saver22, (String) null, (Function0) objRememberedValue1322, composerStartRestartGroup, 0, 4);
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1705324236, "CC(remember):CoreTextField.kt#9igjgp");
                                    int i44222 = i412 & 14;
                                    z8 = (i44222 != 4) | ((i412 & 57344) != 16384);
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (z8) {
                                    }
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i14 = i13;
                        i15 = i5 & 512;
                        if (i15 != 0) {
                        }
                        i16 = i15;
                        i17 = i5 & 1024;
                        if (i17 != 0) {
                        }
                        if ((i4 & 48) == 0) {
                        }
                        int i3522 = i19;
                        i20 = i5 & 4096;
                        if (i20 != 0) {
                        }
                        i22 = i5 & 8192;
                        if (i22 != 0) {
                        }
                        i24 = i5 & 16384;
                        if (i24 != 0) {
                        }
                        i26 = i5 & 32768;
                        if (i26 != 0) {
                        }
                        if ((i6 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i10 = i5 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i5 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 128;
                    if (i12 != 0) {
                    }
                    i13 = i5 & 256;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    i15 = i5 & 512;
                    if (i15 != 0) {
                    }
                    i16 = i15;
                    i17 = i5 & 1024;
                    if (i17 != 0) {
                    }
                    if ((i4 & 48) == 0) {
                    }
                    int i35222 = i19;
                    i20 = i5 & 4096;
                    if (i20 != 0) {
                    }
                    i22 = i5 & 8192;
                    if (i22 != 0) {
                    }
                    i24 = i5 & 16384;
                    if (i24 != 0) {
                    }
                    i26 = i5 & 32768;
                    if (i26 != 0) {
                    }
                    if ((i6 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                textStyle2 = textStyle;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i5 & 32;
                if (i10 != 0) {
                }
                i11 = i5 & 64;
                if (i11 != 0) {
                }
                i12 = i5 & 128;
                if (i12 != 0) {
                }
                i13 = i5 & 256;
                if (i13 != 0) {
                }
                i14 = i13;
                i15 = i5 & 512;
                if (i15 != 0) {
                }
                i16 = i15;
                i17 = i5 & 1024;
                if (i17 != 0) {
                }
                if ((i4 & 48) == 0) {
                }
                int i352222 = i19;
                i20 = i5 & 4096;
                if (i20 != 0) {
                }
                i22 = i5 & 8192;
                if (i22 != 0) {
                }
                i24 = i5 & 16384;
                if (i24 != 0) {
                }
                i26 = i5 & 32768;
                if (i26 != 0) {
                }
                if ((i6 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            textStyle2 = textStyle;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i5 & 32;
            if (i10 != 0) {
            }
            i11 = i5 & 64;
            if (i11 != 0) {
            }
            i12 = i5 & 128;
            if (i12 != 0) {
            }
            i13 = i5 & 256;
            if (i13 != 0) {
            }
            i14 = i13;
            i15 = i5 & 512;
            if (i15 != 0) {
            }
            i16 = i15;
            i17 = i5 & 1024;
            if (i17 != 0) {
            }
            if ((i4 & 48) == 0) {
            }
            int i3522222 = i19;
            i20 = i5 & 4096;
            if (i20 != 0) {
            }
            i22 = i5 & 8192;
            if (i22 != 0) {
            }
            i24 = i5 & 16384;
            if (i24 != 0) {
            }
            i26 = i5 & 32768;
            if (i26 != 0) {
            }
            if ((i6 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        modifier2 = modifier;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        textStyle2 = textStyle;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i5 & 32;
        if (i10 != 0) {
        }
        i11 = i5 & 64;
        if (i11 != 0) {
        }
        i12 = i5 & 128;
        if (i12 != 0) {
        }
        i13 = i5 & 256;
        if (i13 != 0) {
        }
        i14 = i13;
        i15 = i5 & 512;
        if (i15 != 0) {
        }
        i16 = i15;
        i17 = i5 & 1024;
        if (i17 != 0) {
        }
        if ((i4 & 48) == 0) {
        }
        int i35222222 = i19;
        i20 = i5 & 4096;
        if (i20 != 0) {
        }
        i22 = i5 & 8192;
        if (i22 != 0) {
        }
        i24 = i5 & 16384;
        if (i24 != 0) {
        }
        i26 = i5 & 32768;
        if (i26 != 0) {
        }
        if ((i6 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CoreTextFieldRootBox(final Modifier modifier, final TextFieldSelectionManager textFieldSelectionManager, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-20551815);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CoreTextFieldRootBox)P(2,1)802@36846L95:CoreTextField.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(textFieldSelectionManager) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-20551815, i2, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:801)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1183915871, "C803@36902L33:CoreTextField.kt#423gt5");
            ContextMenu_androidKt.ContextMenuArea(textFieldSelectionManager, function2, composerStartRestartGroup, (i2 >> 3) & 126);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextFieldRootBox.2
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
                    CoreTextFieldKt.CoreTextFieldRootBox(modifier, textFieldSelectionManager, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final Modifier previewKeyEventToDeselectOnBack(Modifier modifier, final LegacyTextFieldState legacyTextFieldState, final TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.previewKeyEventToDeselectOnBack.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m1748invokeZmokQxo(keyEvent.m5649unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m1748invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z;
                if (legacyTextFieldState.getHandleState() == HandleState.Selection && KeyEventHelpers_androidKt.m1750cancelsTextSelectionZmokQxo(keyEvent)) {
                    z = true;
                    TextFieldSelectionManager.m2150deselect_kEHs6E$foundation_release$default(textFieldSelectionManager, null, 1, null);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tapToFocus(LegacyTextFieldState legacyTextFieldState, FocusRequester focusRequester, boolean z) {
        SoftwareKeyboardController keyboardController;
        if (!legacyTextFieldState.getHasFocus()) {
            focusRequester.requestFocus();
        } else {
            if (!z || (keyboardController = legacyTextFieldState.getKeyboardController()) == null) {
                return;
            }
            keyboardController.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startInputSession(TextInputService textInputService, LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping) {
        legacyTextFieldState.setInputSession(TextFieldDelegate.INSTANCE.onFocus$foundation_release(textInputService, textFieldValue, legacyTextFieldState.getProcessor(), imeOptions, legacyTextFieldState.getOnValueChange(), legacyTextFieldState.getOnImeActionPerformed()));
        notifyFocusedRect(legacyTextFieldState, textFieldValue, offsetMapping);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endInputSession(LegacyTextFieldState legacyTextFieldState) {
        TextInputSession inputSession = legacyTextFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.INSTANCE.onBlur$foundation_release(inputSession, legacyTextFieldState.getProcessor(), legacyTextFieldState.getOnValueChange());
        }
        legacyTextFieldState.setInputSession(null);
    }

    public static final Object bringSelectionEndIntoView(BringIntoViewRequester bringIntoViewRequester, TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, Continuation<? super Unit> continuation) {
        Rect rect;
        int iOriginalToTransformed = offsetMapping.originalToTransformed(TextRange.m6537getMaximpl(textFieldValue.getSelection()));
        if (iOriginalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
            rect = textLayoutResult.getBoundingBox(iOriginalToTransformed);
        } else if (iOriginalToTransformed != 0) {
            rect = textLayoutResult.getBoundingBox(iOriginalToTransformed - 1);
        } else {
            rect = new Rect(0.0f, 0.0f, 1.0f, IntSize.m7224getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
        }
        Object objBringIntoView = bringIntoViewRequester.bringIntoView(rect, continuation);
        return objBringIntoView == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objBringIntoView : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SelectionToolbarAndHandles(final TextFieldSelectionManager textFieldSelectionManager, final boolean z, Composer composer, final int i) {
        int i2;
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        Composer composerStartRestartGroup = composer.startRestartGroup(626339208);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SelectionToolbarAndHandles):CoreTextField.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(626339208, i2, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1146)");
            }
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1286242594);
                ComposerKt.sourceInformation(composerStartRestartGroup, "");
                LegacyTextFieldState state = textFieldSelectionManager.getState();
                TextLayoutResult textLayoutResult = null;
                if (state != null && (layoutResult = state.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                    LegacyTextFieldState state2 = textFieldSelectionManager.getState();
                    if (!(state2 != null ? state2.getIsLayoutResultStale() : true)) {
                        textLayoutResult = value;
                    }
                }
                if (textLayoutResult == null) {
                    composerStartRestartGroup.startReplaceGroup(-1285984396);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1285984395);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "");
                    if (!TextRange.m6534getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().getSelection())) {
                        composerStartRestartGroup.startReplaceGroup(-1680616096);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "");
                        int iOriginalToTransformed = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m6540getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                        int iOriginalToTransformed2 = textFieldSelectionManager.getOffsetMapping().originalToTransformed(TextRange.m6535getEndimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()));
                        ResolvedTextDirection bidiRunDirection = textLayoutResult.getBidiRunDirection(iOriginalToTransformed);
                        ResolvedTextDirection bidiRunDirection2 = textLayoutResult.getBidiRunDirection(Math.max(iOriginalToTransformed2 - 1, 0));
                        LegacyTextFieldState state3 = textFieldSelectionManager.getState();
                        if (state3 != null && state3.getShowSelectionHandleStart()) {
                            composerStartRestartGroup.startReplaceGroup(-1680216289);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "1158@51449L203");
                            TextFieldSelectionManagerKt.TextFieldSelectionHandle(true, bidiRunDirection, textFieldSelectionManager, composerStartRestartGroup, ((i2 << 6) & 896) | 6);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1679975078);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        LegacyTextFieldState state4 = textFieldSelectionManager.getState();
                        if (state4 != null && state4.getShowSelectionHandleEnd()) {
                            composerStartRestartGroup.startReplaceGroup(-1679895904);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "1165@51772L202");
                            TextFieldSelectionManagerKt.TextFieldSelectionHandle(false, bidiRunDirection2, textFieldSelectionManager, composerStartRestartGroup, ((i2 << 6) & 896) | 6);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1679655654);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1679637798);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    LegacyTextFieldState state5 = textFieldSelectionManager.getState();
                    if (state5 != null) {
                        if (textFieldSelectionManager.isTextChanged$foundation_release()) {
                            state5.setShowFloatingToolbar(false);
                        }
                        if (state5.getHasFocus()) {
                            if (state5.getShowFloatingToolbar()) {
                                textFieldSelectionManager.showSelectionToolbar$foundation_release();
                            } else {
                                textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(651305535);
                composerStartRestartGroup.endReplaceGroup();
                textFieldSelectionManager.hideSelectionToolbar$foundation_release();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.SelectionToolbarAndHandles.2
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
                    CoreTextFieldKt.SelectionToolbarAndHandles(textFieldSelectionManager, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void TextFieldCursorHandle(final TextFieldSelectionManager textFieldSelectionManager, Composer composer, final int i) {
        int i2;
        AnnotatedString transformedText$foundation_release;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1436003720);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TextFieldCursorHandle):CoreTextField.kt#423gt5");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1436003720, i2, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1189)");
            }
            LegacyTextFieldState state = textFieldSelectionManager.getState();
            if (state != null && state.getShowCursorHandle() && (transformedText$foundation_release = textFieldSelectionManager.getTransformedText$foundation_release()) != null && transformedText$foundation_release.length() > 0) {
                composerStartRestartGroup.startReplaceGroup(-285446808);
                ComposerKt.sourceInformation(composerStartRestartGroup, "1191@52866L50,1192@52979L7,1194@53039L12,1196@53125L601,1208@53754L309,1193@52996L1077");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -424850346, "CC(remember):CoreTextField.kt#9igjgp");
                boolean zChanged = composerStartRestartGroup.changed(textFieldSelectionManager);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = textFieldSelectionManager.cursorDragObserver$foundation_release();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                TextDragObserver textDragObserver = (TextDragObserver) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localDensity);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                final long jM2156getCursorPositiontuRUvjQ$foundation_release = textFieldSelectionManager.m2156getCursorPositiontuRUvjQ$foundation_release((Density) objConsume);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -424844848, "CC(remember):CoreTextField.kt#9igjgp");
                boolean zChanged2 = composerStartRestartGroup.changed(jM2156getCursorPositiontuRUvjQ$foundation_release);
                OffsetProvider offsetProviderRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || offsetProviderRememberedValue == Composer.INSTANCE.getEmpty()) {
                    offsetProviderRememberedValue = new OffsetProvider() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo1725provideF1C5BW0() {
                            return jM2156getCursorPositiontuRUvjQ$foundation_release;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(offsetProviderRememberedValue);
                }
                OffsetProvider offsetProvider = (OffsetProvider) offsetProviderRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -424841507, "CC(remember):CoreTextField.kt#9igjgp");
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(textDragObserver) | composerStartRestartGroup.changedInstance(textFieldSelectionManager);
                CoreTextFieldKt$TextFieldCursorHandle$2$1 coreTextFieldKt$TextFieldCursorHandle$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || coreTextFieldKt$TextFieldCursorHandle$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    coreTextFieldKt$TextFieldCursorHandle$2$1RememberedValue = new CoreTextFieldKt$TextFieldCursorHandle$2$1(textDragObserver, textFieldSelectionManager, null);
                    composerStartRestartGroup.updateRememberedValue(coreTextFieldKt$TextFieldCursorHandle$2$1RememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, textDragObserver, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) coreTextFieldKt$TextFieldCursorHandle$2$1RememberedValue);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -424821671, "CC(remember):CoreTextField.kt#9igjgp");
                boolean zChanged3 = composerStartRestartGroup.changed(jM2156getCursorPositiontuRUvjQ$foundation_release);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$3$1
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
                            semanticsPropertyReceiver.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(Handle.Cursor, jM2156getCursorPositiontuRUvjQ$foundation_release, SelectionHandleAnchor.Middle, true, null));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                AndroidCursorHandle_androidKt.m1721CursorHandleUSBMPiE(offsetProvider, SemanticsModifierKt.semantics$default(modifierPointerInput, false, (Function1) objRememberedValue2, 1, null), 0L, composerStartRestartGroup, 0, 4);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-284257090);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle.4
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
                    CoreTextFieldKt.TextFieldCursorHandle(textFieldSelectionManager, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyFocusedRect(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
            if (layoutResult == null) {
                return;
            }
            TextInputSession inputSession = legacyTextFieldState.getInputSession();
            if (inputSession == null) {
                return;
            }
            LayoutCoordinates layoutCoordinates = legacyTextFieldState.getLayoutCoordinates();
            if (layoutCoordinates == null) {
                return;
            }
            TextFieldDelegate.INSTANCE.notifyFocusedRect$foundation_release(textFieldValue, legacyTextFieldState.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, inputSession, legacyTextFieldState.getHasFocus(), offsetMapping);
            Unit unit = Unit.INSTANCE;
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CoreTextField$lambda$11(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
