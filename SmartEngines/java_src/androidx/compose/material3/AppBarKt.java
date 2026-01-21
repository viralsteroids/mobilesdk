package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.BottomAppBarTokens;
import androidx.compose.material3.tokens.TopAppBarLargeTokens;
import androidx.compose.material3.tokens.TopAppBarMediumTokens;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.layout.AlignmentLineKt;
import androidx.compose.p000ui.layout.LayoutIdKt;
import androidx.compose.p000ui.layout.LayoutModifierKt;
import androidx.compose.p000ui.layout.Measurable;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.layout.MeasureResult;
import androidx.compose.p000ui.layout.MeasureScope;
import androidx.compose.p000ui.layout.Placeable;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.semantics.SemanticsModifierKt;
import androidx.compose.p000ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.p000ui.unit.Constraints;
import androidx.compose.p000ui.unit.Density;
import androidx.compose.p000ui.unit.Velocity;
import androidx.compose.p000ui.unit.VelocityKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.bouncycastle.i18n.MessageBundle;
import org.jmrtd.lds.LDSFile;

/* compiled from: AppBar.kt */
@Metadata(m513d1 = {"\u0000¶\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0083\u0001\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u008f\u0001\u0010\u0010\u001a\u00020\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001al\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\u001c\u0010)\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001ax\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\u001c\u0010)\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a \u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u000201H\u0007\u001a\u007f\u00104\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\u0010:\u001a\u008e\u0001\u00104\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010;\u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a\u007f\u0010>\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\u0010:\u001a\u0098\u0001\u0010>\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010?\u001a\u00020\u00012\b\b\u0002\u0010;\u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a\u007f\u0010B\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\u0010:\u001a\u0098\u0001\u0010B\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010?\u001a\u00020\u00012\b\b\u0002\u0010;\u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007ø\u0001\u0000¢\u0006\u0004\bC\u0010A\u001a\u0092\u0001\u0010D\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\u0006\u0010;\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\u0006\u00107\u001a\u0002082\b\u0010%\u001a\u0004\u0018\u000109H\u0003ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001a\u007f\u0010K\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007¢\u0006\u0002\u0010:\u001a\u008e\u0001\u0010K\u001a\u00020\u00112\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0013\b\u0002\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\b\b\u0002\u0010;\u001a\u00020\u00012\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u00107\u001a\u0002082\n\b\u0002\u0010%\u001a\u0004\u0018\u000109H\u0007ø\u0001\u0000¢\u0006\u0004\bL\u0010=\u001a£\u0001\u0010M\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020\u001c2\u0006\u0010R\u001a\u00020\u001c2\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u0010E\u001a\u00020F2\u0006\u0010S\u001a\u0002012\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020H2\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u0015H\u0003ø\u0001\u0000¢\u0006\u0004\b[\u0010\\\u001aµ\u0001\u0010]\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u0010E\u001a\u00020F2\u0006\u0010X\u001a\u00020\u00012\u0011\u0010^\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u0006\u0010_\u001a\u00020F2\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\u00110\u001a¢\u0006\u0002\b\u00152\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u00162\u0006\u0010?\u001a\u00020\u00012\u0006\u0010;\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\u0006\u00107\u001a\u0002082\b\u0010%\u001a\u0004\u0018\u000109H\u0003ø\u0001\u0000¢\u0006\u0004\b`\u0010a\u001a+\u0010b\u001a\u00020/2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u000201H\u0007¢\u0006\u0002\u0010c\u001a+\u0010d\u001a\u00020e2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u000201H\u0007¢\u0006\u0002\u0010f\u001a>\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020e2\u0006\u0010j\u001a\u0002012\u000e\u0010k\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010l2\u000e\u0010m\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010nH\u0082@¢\u0006\u0002\u0010o\u001a>\u0010p\u001a\u00020h2\u0006\u0010i\u001a\u00020/2\u0006\u0010j\u001a\u0002012\u000e\u0010k\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010l2\u000e\u0010m\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010nH\u0082@¢\u0006\u0002\u0010q\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0016\u0010\u0003\u001a\u00020\u0001X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0004\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\n\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006r²\u0006\n\u0010s\u001a\u000201X\u008a\u0084\u0002²\u0006\n\u0010t\u001a\u00020\u001cX\u008a\u0084\u0002"}, m514d2 = {"BottomAppBarHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "BottomAppBarVerticalPadding", "getBottomAppBarVerticalPadding", "()F", "FABHorizontalPadding", "FABVerticalPadding", "LargeTitleBottomPadding", "MediumTitleBottomPadding", "TopAppBarHorizontalPadding", "TopAppBarTitleInset", "TopTitleAlphaEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "getTopTitleAlphaEasing", "()Landroidx/compose/animation/core/CubicBezierEasing;", "BottomAppBar", "", "actions", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "floatingActionButton", "Lkotlin/Function0;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "BottomAppBar-Snr_uVM", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/runtime/Composer;II)V", "scrollBehavior", "Landroidx/compose/material3/BottomAppBarScrollBehavior;", "BottomAppBar-qhFBPw4", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/BottomAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "content", "BottomAppBar-1oL4kX8", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar-e-3WI5M", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/BottomAppBarScrollBehavior;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBarState", "Landroidx/compose/material3/BottomAppBarState;", "initialHeightOffsetLimit", "", "initialHeightOffset", "initialContentOffset", "CenterAlignedTopAppBar", MessageBundle.TITLE_ENTRY, "navigationIcon", "colors", "Landroidx/compose/material3/TopAppBarColors;", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "expandedHeight", "CenterAlignedTopAppBar-GHTll3U", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "LargeTopAppBar", "collapsedHeight", "LargeTopAppBar-oKE7A98", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "MediumTopAppBar", "MediumTopAppBar-oKE7A98", "SingleRowTopAppBar", "titleTextStyle", "Landroidx/compose/ui/text/TextStyle;", "centeredTitle", "", "SingleRowTopAppBar-cJHQLPU", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;II)V", "TopAppBar", "TopAppBar-GHTll3U", "TopAppBarLayout", "scrolledOffset", "Landroidx/compose/material3/ScrolledOffset;", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "titleAlpha", "titleVerticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "titleHorizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "titleBottomPadding", "", "hideTitleSemantics", "TopAppBarLayout-kXwM9vE", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/ScrolledOffset;JJJLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TwoRowsTopAppBar", "smallTitle", "smallTitleTextStyle", "TwoRowsTopAppBar-nS6u9G4", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/material3/TopAppBarColors;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;III)V", "rememberBottomAppBarState", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomAppBarState;", "rememberTopAppBarState", "Landroidx/compose/material3/TopAppBarState;", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarState;", "settleAppBar", "Landroidx/compose/ui/unit/Velocity;", "state", "velocity", "flingAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(Landroidx/compose/material3/TopAppBarState;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "settleAppBarBottom", "(Landroidx/compose/material3/BottomAppBarState;FLandroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3_release", "colorTransitionFraction", "appBarContainerColor"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class AppBarKt {
    private static final float BottomAppBarHorizontalPadding;
    private static final float BottomAppBarVerticalPadding;
    private static final float FABHorizontalPadding;
    private static final float FABVerticalPadding;
    private static final float LargeTitleBottomPadding;
    private static final float MediumTitleBottomPadding;
    private static final float TopAppBarHorizontalPadding;
    private static final float TopAppBarTitleInset;
    private static final CubicBezierEasing TopTitleAlphaEasing;

    /* compiled from: AppBar.kt */
    @Metadata(m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
    @DebugMetadata(m532c = "androidx.compose.material3.AppBarKt", m533f = "AppBar.kt", m534i = {0, 0, 0, 1}, m535l = {2501, 2515}, m536m = "settleAppBar", m537n = {"state", "snapAnimationSpec", "remainingVelocity", "remainingVelocity"}, m538s = {"L$0", "L$1", "L$2", "L$0"})
    /* renamed from: androidx.compose.material3.AppBarKt$settleAppBar$1 */
    static final class C12081 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C12081(Continuation<? super C12081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppBarKt.settleAppBar(null, 0.0f, null, null, this);
        }
    }

    /* compiled from: AppBar.kt */
    @Metadata(m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
    @DebugMetadata(m532c = "androidx.compose.material3.AppBarKt", m533f = "AppBar.kt", m534i = {0, 0, 0, 1}, m535l = {1803, 1817}, m536m = "settleAppBarBottom", m537n = {"state", "snapAnimationSpec", "remainingVelocity", "remainingVelocity"}, m538s = {"L$0", "L$1", "L$2", "L$0"})
    /* renamed from: androidx.compose.material3.AppBarKt$settleAppBarBottom$1 */
    static final class C12111 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C12111(Continuation<? super C12111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppBarKt.settleAppBarBottom(null, 0.0f, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0123  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of TopAppBar with expandedHeight parameter")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void TopAppBar(final Function2 function2, Modifier modifier, Function2 function22, Function3 function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        Function2 function23;
        int i3;
        Modifier modifier2;
        int i4;
        Function2 function2M2374getLambda1$material3_release;
        int i5;
        Function3 function3M2384getLambda2$material3_release;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i6;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        TopAppBarColors topAppBarColors3;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        Function3 function32;
        WindowInsets windowInsets3;
        Modifier modifier3;
        Function2 function24;
        int i7;
        Composer composer2;
        final Modifier modifier4;
        final Function2 function25;
        final Function3 function33;
        final WindowInsets windowInsets4;
        final TopAppBarColors topAppBarColors4;
        final TopAppBarScrollBehavior topAppBarScrollBehavior4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1906353009);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TopAppBar)P(5,2,3!1,6)142@6819L12,143@6881L17,146@6960L306:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(function23) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
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
                    function2M2374getLambda1$material3_release = function22;
                    i3 |= composerStartRestartGroup.changedInstance(function2M2374getLambda1$material3_release) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function3M2384getLambda2$material3_release = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function3M2384getLambda2$material3_release) ? 2048 : 1024;
                    }
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            windowInsets2 = windowInsets;
                            int i9 = composerStartRestartGroup.changed(windowInsets2) ? 16384 : 8192;
                            i3 |= i9;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i3 |= i9;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            topAppBarColors2 = topAppBarColors;
                            int i10 = composerStartRestartGroup.changed(topAppBarColors2) ? 131072 : 65536;
                            i3 |= i10;
                        } else {
                            topAppBarColors2 = topAppBarColors;
                        }
                        i3 |= i10;
                    } else {
                        topAppBarColors2 = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 != 0) {
                        if ((1572864 & i) == 0) {
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : 524288;
                        }
                        if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer2 = composerStartRestartGroup;
                            modifier4 = modifier2;
                            function25 = function2M2374getLambda1$material3_release;
                            function33 = function3M2384getLambda2$material3_release;
                            windowInsets4 = windowInsets2;
                            topAppBarColors4 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    function2M2374getLambda1$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m2374getLambda1$material3_release();
                                }
                                if (i5 != 0) {
                                    function3M2384getLambda2$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m2384getLambda2$material3_release();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    topAppBarColors2 = TopAppBarDefaults.INSTANCE.topAppBarColors(composerStartRestartGroup, 6);
                                }
                                if (i6 == 0) {
                                    topAppBarScrollBehavior3 = null;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors3 = topAppBarColors2;
                                    function24 = function2M2374getLambda1$material3_release;
                                    function32 = function3M2384getLambda2$material3_release;
                                    modifier3 = companion;
                                } else {
                                    topAppBarColors3 = topAppBarColors2;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                    function32 = function3M2384getLambda2$material3_release;
                                    windowInsets3 = windowInsets2;
                                    modifier3 = companion;
                                    function24 = function2M2374getLambda1$material3_release;
                                }
                                i7 = 1906353009;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                topAppBarColors3 = topAppBarColors2;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                i7 = 1906353009;
                                function32 = function3M2384getLambda2$material3_release;
                                windowInsets3 = windowInsets2;
                                modifier3 = modifier2;
                                function24 = function2M2374getLambda1$material3_release;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i7, i3, -1, "androidx.compose.material3.TopAppBar (AppBar.kt:146)");
                            }
                            float fM3296getTopAppBarExpandedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m3296getTopAppBarExpandedHeightD9Ej5fM();
                            int i11 = (i3 & 14) | 24576 | (i3 & LDSFile.EF_DG16_TAG) | (i3 & 896) | (i3 & 7168);
                            int i12 = i3 << 3;
                            composer2 = composerStartRestartGroup;
                            m2207TopAppBarGHTll3U(function23, modifier3, function24, function32, fM3296getTopAppBarExpandedHeightD9Ej5fM, windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, composer2, i11 | (458752 & i12) | (3670016 & i12) | (i12 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            function25 = function24;
                            function33 = function32;
                            windowInsets4 = windowInsets3;
                            topAppBarColors4 = topAppBarColors3;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.TopAppBar.1
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
                                    AppBarKt.TopAppBar(function2, modifier4, function25, function33, windowInsets4, topAppBarColors4, topAppBarScrollBehavior4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 1572864;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if ((599187 & i3) == 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i8 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if ((i2 & 16) != 0) {
                            }
                            if ((i2 & 32) != 0) {
                            }
                            if (i6 == 0) {
                            }
                            i7 = 1906353009;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            float fM3296getTopAppBarExpandedHeightD9Ej5fM2 = TopAppBarDefaults.INSTANCE.m3296getTopAppBarExpandedHeightD9Ej5fM();
                            int i112 = (i3 & 14) | 24576 | (i3 & LDSFile.EF_DG16_TAG) | (i3 & 896) | (i3 & 7168);
                            int i122 = i3 << 3;
                            composer2 = composerStartRestartGroup;
                            m2207TopAppBarGHTll3U(function23, modifier3, function24, function32, fM3296getTopAppBarExpandedHeightD9Ej5fM2, windowInsets3, topAppBarColors3, topAppBarScrollBehavior3, composer2, i112 | (458752 & i122) | (3670016 & i122) | (i122 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            function25 = function24;
                            function33 = function32;
                            windowInsets4 = windowInsets3;
                            topAppBarColors4 = topAppBarColors3;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function3M2384getLambda2$material3_release = function3;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if ((599187 & i3) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function2M2374getLambda1$material3_release = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function3M2384getLambda2$material3_release = function3;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if ((599187 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function2M2374getLambda1$material3_release = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function3M2384getLambda2$material3_release = function3;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011b  */
    /* renamed from: TopAppBar-GHTll3U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2207TopAppBarGHTll3U(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function2M2385getLambda3$material3_release;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M2386getLambda4$material3_release;
        int i6;
        float fM3296getTopAppBarExpandedHeightD9Ej5fM;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColors2;
        int i7;
        int i8;
        int i9;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Modifier modifier3;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        float f2;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors3;
        int i10;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Composer composer2;
        final float f3;
        final Modifier modifier4;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final WindowInsets windowInsets4;
        final TopAppBarColors topAppBarColors4;
        final TopAppBarScrollBehavior topAppBarScrollBehavior3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(226148675);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TopAppBar)P(6,3,4!1,2:c#ui.unit.Dp,7)204@9890L12,205@9952L17,211@10162L5,208@10031L579:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(function23) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
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
                    function2M2385getLambda3$material3_release = function22;
                    i3 |= composerStartRestartGroup.changedInstance(function2M2385getLambda3$material3_release) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function3M2386getLambda4$material3_release = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function3M2386getLambda4$material3_release) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            fM3296getTopAppBarExpandedHeightD9Ej5fM = f;
                            i3 |= composerStartRestartGroup.changed(fM3296getTopAppBarExpandedHeightD9Ej5fM) ? 16384 : 8192;
                        }
                        if ((196608 & i) == 0) {
                            if ((i2 & 32) == 0) {
                                windowInsets2 = windowInsets;
                                int i12 = composerStartRestartGroup.changed(windowInsets2) ? 131072 : 65536;
                                i3 |= i12;
                            } else {
                                windowInsets2 = windowInsets;
                            }
                            i3 |= i12;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                topAppBarColors2 = topAppBarColors;
                                int i13 = composerStartRestartGroup.changed(topAppBarColors2) ? 1048576 : 524288;
                                i3 |= i13;
                            } else {
                                topAppBarColors2 = topAppBarColors;
                            }
                            i3 |= i13;
                        } else {
                            topAppBarColors2 = topAppBarColors;
                        }
                        i7 = i2 & 128;
                        if (i7 == 0) {
                            if ((i & 12582912) == 0) {
                                i8 = i7;
                                i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior) ? 8388608 : 4194304;
                            }
                            int i14 = i3;
                            if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i11 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i4 != 0) {
                                        function2M2385getLambda3$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m2385getLambda3$material3_release();
                                    }
                                    if (i5 != 0) {
                                        function3M2386getLambda4$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m2386getLambda4$material3_release();
                                    }
                                    if (i6 != 0) {
                                        fM3296getTopAppBarExpandedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m3296getTopAppBarExpandedHeightD9Ej5fM();
                                    }
                                    if ((i2 & 32) == 0) {
                                        i9 = i14 & (-458753);
                                        windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                    } else {
                                        i9 = i14;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i9 &= -3670017;
                                        topAppBarColors2 = TopAppBarDefaults.INSTANCE.topAppBarColors(composerStartRestartGroup, 6);
                                    }
                                    if (i8 == 0) {
                                        modifier3 = companion;
                                        topAppBarScrollBehavior2 = null;
                                    } else {
                                        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                        modifier3 = companion;
                                    }
                                    function32 = function3M2386getLambda4$material3_release;
                                    f2 = fM3296getTopAppBarExpandedHeightD9Ej5fM;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors3 = topAppBarColors2;
                                    i10 = 226148675;
                                    function24 = function2M2385getLambda3$material3_release;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    int i15 = (i2 & 32) != 0 ? i14 & (-458753) : i14;
                                    if ((i2 & 64) != 0) {
                                        i15 &= -3670017;
                                    }
                                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                    modifier3 = modifier2;
                                    function32 = function3M2386getLambda4$material3_release;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors3 = topAppBarColors2;
                                    i10 = 226148675;
                                    i9 = i15;
                                    function24 = function2M2385getLambda3$material3_release;
                                    f2 = fM3296getTopAppBarExpandedHeightD9Ej5fM;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i10, i9, -1, "androidx.compose.material3.TopAppBar (AppBar.kt:208)");
                                }
                                int i16 = i9 << 6;
                                composer2 = composerStartRestartGroup;
                                m2206SingleRowTopAppBarcJHQLPU(modifier3, function23, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6), false, function24, function32, (!C1959Dp.m7060equalsimpl0(f2, C1959Dp.INSTANCE.m7075getUnspecifiedD9Ej5fM()) || C1959Dp.m7060equalsimpl0(f2, C1959Dp.INSTANCE.m7074getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m3296getTopAppBarExpandedHeightD9Ej5fM() : f2, windowInsets3, topAppBarColors3, topAppBarScrollBehavior2, composer2, ((i9 >> 3) & 14) | 3072 | ((i9 << 3) & LDSFile.EF_DG16_TAG) | (57344 & i16) | (458752 & i16) | (29360128 & i16) | (234881024 & i16) | (i16 & 1879048192), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f3 = f2;
                                modifier4 = modifier3;
                                function25 = function24;
                                function33 = function32;
                                windowInsets4 = windowInsets3;
                                topAppBarColors4 = topAppBarColors3;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                composer2 = composerStartRestartGroup;
                                modifier4 = modifier2;
                                function25 = function2M2385getLambda3$material3_release;
                                function33 = function3M2386getLambda4$material3_release;
                                f3 = fM3296getTopAppBarExpandedHeightD9Ej5fM;
                                windowInsets4 = windowInsets2;
                                topAppBarColors4 = topAppBarColors2;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.TopAppBar.2
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

                                    public final void invoke(Composer composer3, int i17) {
                                        AppBarKt.m2207TopAppBarGHTll3U(function2, modifier4, function25, function33, f3, windowInsets4, topAppBarColors4, topAppBarScrollBehavior3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 12582912;
                        i8 = i7;
                        int i142 = i3;
                        if ((i3 & 4793491) == 4793490) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i11 == 0) {
                                }
                                if (i4 != 0) {
                                }
                                if (i5 != 0) {
                                }
                                if (i6 != 0) {
                                }
                                if ((i2 & 32) == 0) {
                                }
                                if ((i2 & 64) != 0) {
                                }
                                if (i8 == 0) {
                                }
                                function32 = function3M2386getLambda4$material3_release;
                                f2 = fM3296getTopAppBarExpandedHeightD9Ej5fM;
                                windowInsets3 = windowInsets2;
                                topAppBarColors3 = topAppBarColors2;
                                i10 = 226148675;
                                function24 = function2M2385getLambda3$material3_release;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (C1959Dp.m7060equalsimpl0(f2, C1959Dp.INSTANCE.m7075getUnspecifiedD9Ej5fM())) {
                                    int i162 = i9 << 6;
                                    composer2 = composerStartRestartGroup;
                                    m2206SingleRowTopAppBarcJHQLPU(modifier3, function23, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6), false, function24, function32, (!C1959Dp.m7060equalsimpl0(f2, C1959Dp.INSTANCE.m7075getUnspecifiedD9Ej5fM()) || C1959Dp.m7060equalsimpl0(f2, C1959Dp.INSTANCE.m7074getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m3296getTopAppBarExpandedHeightD9Ej5fM() : f2, windowInsets3, topAppBarColors3, topAppBarScrollBehavior2, composer2, ((i9 >> 3) & 14) | 3072 | ((i9 << 3) & LDSFile.EF_DG16_TAG) | (57344 & i162) | (458752 & i162) | (29360128 & i162) | (234881024 & i162) | (i162 & 1879048192), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    f3 = f2;
                                    modifier4 = modifier3;
                                    function25 = function24;
                                    function33 = function32;
                                    windowInsets4 = windowInsets3;
                                    topAppBarColors4 = topAppBarColors3;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    fM3296getTopAppBarExpandedHeightD9Ej5fM = f;
                    if ((196608 & i) == 0) {
                    }
                    if ((1572864 & i) == 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                    }
                    i8 = i7;
                    int i1422 = i3;
                    if ((i3 & 4793491) == 4793490) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function3M2386getLambda4$material3_release = function3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                fM3296getTopAppBarExpandedHeightD9Ej5fM = f;
                if ((196608 & i) == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                i8 = i7;
                int i14222 = i3;
                if ((i3 & 4793491) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function2M2385getLambda3$material3_release = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function3M2386getLambda4$material3_release = function3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            fM3296getTopAppBarExpandedHeightD9Ej5fM = f;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            i8 = i7;
            int i142222 = i3;
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function2M2385getLambda3$material3_release = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function3M2386getLambda4$material3_release = function3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        fM3296getTopAppBarExpandedHeightD9Ej5fM = f;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        i8 = i7;
        int i1422222 = i3;
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0123  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of CenterAlignedTopAppBar with expandedHeight parameter")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void CenterAlignedTopAppBar(final Function2 function2, Modifier modifier, Function2 function22, Function3 function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        Function2 function23;
        int i3;
        Modifier modifier2;
        int i4;
        Function2 function2M2387getLambda5$material3_release;
        int i5;
        Function3 function3M2388getLambda6$material3_release;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColorsCenterAlignedTopAppBarColors;
        int i6;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        TopAppBarColors topAppBarColors2;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        Function3 function32;
        WindowInsets windowInsets3;
        Modifier modifier3;
        Function2 function24;
        int i7;
        Composer composer2;
        final Modifier modifier4;
        final Function2 function25;
        final Function3 function33;
        final WindowInsets windowInsets4;
        final TopAppBarColors topAppBarColors3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2139286460);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CenterAlignedTopAppBar)P(5,2,3!1,6)269@12968L12,270@13030L30,273@13122L319:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(function23) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
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
                    function2M2387getLambda5$material3_release = function22;
                    i3 |= composerStartRestartGroup.changedInstance(function2M2387getLambda5$material3_release) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function3M2388getLambda6$material3_release = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function3M2388getLambda6$material3_release) ? 2048 : 1024;
                    }
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            windowInsets2 = windowInsets;
                            int i9 = composerStartRestartGroup.changed(windowInsets2) ? 16384 : 8192;
                            i3 |= i9;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i3 |= i9;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            topAppBarColorsCenterAlignedTopAppBarColors = topAppBarColors;
                            int i10 = composerStartRestartGroup.changed(topAppBarColorsCenterAlignedTopAppBarColors) ? 131072 : 65536;
                            i3 |= i10;
                        } else {
                            topAppBarColorsCenterAlignedTopAppBarColors = topAppBarColors;
                        }
                        i3 |= i10;
                    } else {
                        topAppBarColorsCenterAlignedTopAppBarColors = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 != 0) {
                        if ((1572864 & i) == 0) {
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : 524288;
                        }
                        if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer2 = composerStartRestartGroup;
                            modifier4 = modifier2;
                            function25 = function2M2387getLambda5$material3_release;
                            function33 = function3M2388getLambda6$material3_release;
                            windowInsets4 = windowInsets2;
                            topAppBarColors3 = topAppBarColorsCenterAlignedTopAppBarColors;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    function2M2387getLambda5$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m2387getLambda5$material3_release();
                                }
                                if (i5 != 0) {
                                    function3M2388getLambda6$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m2388getLambda6$material3_release();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    topAppBarColorsCenterAlignedTopAppBarColors = TopAppBarDefaults.INSTANCE.centerAlignedTopAppBarColors(composerStartRestartGroup, 6);
                                }
                                if (i6 == 0) {
                                    topAppBarScrollBehavior3 = null;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors2 = topAppBarColorsCenterAlignedTopAppBarColors;
                                    function24 = function2M2387getLambda5$material3_release;
                                    function32 = function3M2388getLambda6$material3_release;
                                    modifier3 = companion;
                                } else {
                                    topAppBarColors2 = topAppBarColorsCenterAlignedTopAppBarColors;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                    function32 = function3M2388getLambda6$material3_release;
                                    windowInsets3 = windowInsets2;
                                    modifier3 = companion;
                                    function24 = function2M2387getLambda5$material3_release;
                                }
                                i7 = -2139286460;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                topAppBarColors2 = topAppBarColorsCenterAlignedTopAppBarColors;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                i7 = -2139286460;
                                function32 = function3M2388getLambda6$material3_release;
                                windowInsets3 = windowInsets2;
                                modifier3 = modifier2;
                                function24 = function2M2387getLambda5$material3_release;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i7, i3, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:273)");
                            }
                            float fM3296getTopAppBarExpandedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m3296getTopAppBarExpandedHeightD9Ej5fM();
                            int i11 = (i3 & 14) | 24576 | (i3 & LDSFile.EF_DG16_TAG) | (i3 & 896) | (i3 & 7168);
                            int i12 = i3 << 3;
                            composer2 = composerStartRestartGroup;
                            m2203CenterAlignedTopAppBarGHTll3U(function23, modifier3, function24, function32, fM3296getTopAppBarExpandedHeightD9Ej5fM, windowInsets3, topAppBarColors2, topAppBarScrollBehavior3, composer2, i11 | (458752 & i12) | (3670016 & i12) | (i12 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            function25 = function24;
                            function33 = function32;
                            windowInsets4 = windowInsets3;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.CenterAlignedTopAppBar.1
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
                                    AppBarKt.CenterAlignedTopAppBar(function2, modifier4, function25, function33, windowInsets4, topAppBarColors3, topAppBarScrollBehavior4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 1572864;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if ((599187 & i3) == 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i8 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if ((i2 & 16) != 0) {
                            }
                            if ((i2 & 32) != 0) {
                            }
                            if (i6 == 0) {
                            }
                            i7 = -2139286460;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            float fM3296getTopAppBarExpandedHeightD9Ej5fM2 = TopAppBarDefaults.INSTANCE.m3296getTopAppBarExpandedHeightD9Ej5fM();
                            int i112 = (i3 & 14) | 24576 | (i3 & LDSFile.EF_DG16_TAG) | (i3 & 896) | (i3 & 7168);
                            int i122 = i3 << 3;
                            composer2 = composerStartRestartGroup;
                            m2203CenterAlignedTopAppBarGHTll3U(function23, modifier3, function24, function32, fM3296getTopAppBarExpandedHeightD9Ej5fM2, windowInsets3, topAppBarColors2, topAppBarScrollBehavior3, composer2, i112 | (458752 & i122) | (3670016 & i122) | (i122 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            function25 = function24;
                            function33 = function32;
                            windowInsets4 = windowInsets3;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function3M2388getLambda6$material3_release = function3;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if ((599187 & i3) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function2M2387getLambda5$material3_release = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function3M2388getLambda6$material3_release = function3;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if ((599187 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function2M2387getLambda5$material3_release = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function3M2388getLambda6$material3_release = function3;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011b  */
    /* renamed from: CenterAlignedTopAppBar-GHTll3U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2203CenterAlignedTopAppBarGHTll3U(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, float f, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function2M2389getLambda7$material3_release;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M2390getLambda8$material3_release;
        int i6;
        float fM3296getTopAppBarExpandedHeightD9Ej5fM;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColorsCenterAlignedTopAppBarColors;
        int i7;
        int i8;
        int i9;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        Modifier modifier3;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        float f2;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors2;
        int i10;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Composer composer2;
        final float f3;
        final Modifier modifier4;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final WindowInsets windowInsets4;
        final TopAppBarColors topAppBarColors3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1952988048);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(CenterAlignedTopAppBar)P(6,3,4!1,2:c#ui.unit.Dp,7)328@16080L12,329@16142L30,335@16365L5,332@16234L578:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(function23) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
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
                    function2M2389getLambda7$material3_release = function22;
                    i3 |= composerStartRestartGroup.changedInstance(function2M2389getLambda7$material3_release) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function3M2390getLambda8$material3_release = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function3M2390getLambda8$material3_release) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            fM3296getTopAppBarExpandedHeightD9Ej5fM = f;
                            i3 |= composerStartRestartGroup.changed(fM3296getTopAppBarExpandedHeightD9Ej5fM) ? 16384 : 8192;
                        }
                        if ((196608 & i) == 0) {
                            if ((i2 & 32) == 0) {
                                windowInsets2 = windowInsets;
                                int i12 = composerStartRestartGroup.changed(windowInsets2) ? 131072 : 65536;
                                i3 |= i12;
                            } else {
                                windowInsets2 = windowInsets;
                            }
                            i3 |= i12;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                topAppBarColorsCenterAlignedTopAppBarColors = topAppBarColors;
                                int i13 = composerStartRestartGroup.changed(topAppBarColorsCenterAlignedTopAppBarColors) ? 1048576 : 524288;
                                i3 |= i13;
                            } else {
                                topAppBarColorsCenterAlignedTopAppBarColors = topAppBarColors;
                            }
                            i3 |= i13;
                        } else {
                            topAppBarColorsCenterAlignedTopAppBarColors = topAppBarColors;
                        }
                        i7 = i2 & 128;
                        if (i7 == 0) {
                            if ((i & 12582912) == 0) {
                                i8 = i7;
                                i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior) ? 8388608 : 4194304;
                            }
                            int i14 = i3;
                            if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i11 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i4 != 0) {
                                        function2M2389getLambda7$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m2389getLambda7$material3_release();
                                    }
                                    if (i5 != 0) {
                                        function3M2390getLambda8$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m2390getLambda8$material3_release();
                                    }
                                    if (i6 != 0) {
                                        fM3296getTopAppBarExpandedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m3296getTopAppBarExpandedHeightD9Ej5fM();
                                    }
                                    if ((i2 & 32) == 0) {
                                        i9 = i14 & (-458753);
                                        windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                    } else {
                                        i9 = i14;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i9 &= -3670017;
                                        topAppBarColorsCenterAlignedTopAppBarColors = TopAppBarDefaults.INSTANCE.centerAlignedTopAppBarColors(composerStartRestartGroup, 6);
                                    }
                                    if (i8 == 0) {
                                        modifier3 = companion;
                                        topAppBarScrollBehavior2 = null;
                                    } else {
                                        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                        modifier3 = companion;
                                    }
                                    function32 = function3M2390getLambda8$material3_release;
                                    f2 = fM3296getTopAppBarExpandedHeightD9Ej5fM;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors2 = topAppBarColorsCenterAlignedTopAppBarColors;
                                    i10 = 1952988048;
                                    function24 = function2M2389getLambda7$material3_release;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    int i15 = (i2 & 32) != 0 ? i14 & (-458753) : i14;
                                    if ((i2 & 64) != 0) {
                                        i15 &= -3670017;
                                    }
                                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                    modifier3 = modifier2;
                                    function32 = function3M2390getLambda8$material3_release;
                                    windowInsets3 = windowInsets2;
                                    topAppBarColors2 = topAppBarColorsCenterAlignedTopAppBarColors;
                                    i10 = 1952988048;
                                    i9 = i15;
                                    function24 = function2M2389getLambda7$material3_release;
                                    f2 = fM3296getTopAppBarExpandedHeightD9Ej5fM;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i10, i9, -1, "androidx.compose.material3.CenterAlignedTopAppBar (AppBar.kt:332)");
                                }
                                int i16 = i9 << 6;
                                composer2 = composerStartRestartGroup;
                                m2206SingleRowTopAppBarcJHQLPU(modifier3, function23, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6), true, function24, function32, (!C1959Dp.m7060equalsimpl0(f2, C1959Dp.INSTANCE.m7075getUnspecifiedD9Ej5fM()) || C1959Dp.m7060equalsimpl0(f2, C1959Dp.INSTANCE.m7074getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m3296getTopAppBarExpandedHeightD9Ej5fM() : f2, windowInsets3, topAppBarColors2, topAppBarScrollBehavior2, composer2, ((i9 >> 3) & 14) | 3072 | ((i9 << 3) & LDSFile.EF_DG16_TAG) | (57344 & i16) | (458752 & i16) | (29360128 & i16) | (234881024 & i16) | (i16 & 1879048192), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f3 = f2;
                                modifier4 = modifier3;
                                function25 = function24;
                                function33 = function32;
                                windowInsets4 = windowInsets3;
                                topAppBarColors3 = topAppBarColors2;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                composer2 = composerStartRestartGroup;
                                modifier4 = modifier2;
                                function25 = function2M2389getLambda7$material3_release;
                                function33 = function3M2390getLambda8$material3_release;
                                f3 = fM3296getTopAppBarExpandedHeightD9Ej5fM;
                                windowInsets4 = windowInsets2;
                                topAppBarColors3 = topAppBarColorsCenterAlignedTopAppBarColors;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.CenterAlignedTopAppBar.2
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

                                    public final void invoke(Composer composer3, int i17) {
                                        AppBarKt.m2203CenterAlignedTopAppBarGHTll3U(function2, modifier4, function25, function33, f3, windowInsets4, topAppBarColors3, topAppBarScrollBehavior3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 12582912;
                        i8 = i7;
                        int i142 = i3;
                        if ((i3 & 4793491) == 4793490) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i11 == 0) {
                                }
                                if (i4 != 0) {
                                }
                                if (i5 != 0) {
                                }
                                if (i6 != 0) {
                                }
                                if ((i2 & 32) == 0) {
                                }
                                if ((i2 & 64) != 0) {
                                }
                                if (i8 == 0) {
                                }
                                function32 = function3M2390getLambda8$material3_release;
                                f2 = fM3296getTopAppBarExpandedHeightD9Ej5fM;
                                windowInsets3 = windowInsets2;
                                topAppBarColors2 = topAppBarColorsCenterAlignedTopAppBarColors;
                                i10 = 1952988048;
                                function24 = function2M2389getLambda7$material3_release;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (C1959Dp.m7060equalsimpl0(f2, C1959Dp.INSTANCE.m7075getUnspecifiedD9Ej5fM())) {
                                    int i162 = i9 << 6;
                                    composer2 = composerStartRestartGroup;
                                    m2206SingleRowTopAppBarcJHQLPU(modifier3, function23, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6), true, function24, function32, (!C1959Dp.m7060equalsimpl0(f2, C1959Dp.INSTANCE.m7075getUnspecifiedD9Ej5fM()) || C1959Dp.m7060equalsimpl0(f2, C1959Dp.INSTANCE.m7074getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m3296getTopAppBarExpandedHeightD9Ej5fM() : f2, windowInsets3, topAppBarColors2, topAppBarScrollBehavior2, composer2, ((i9 >> 3) & 14) | 3072 | ((i9 << 3) & LDSFile.EF_DG16_TAG) | (57344 & i162) | (458752 & i162) | (29360128 & i162) | (234881024 & i162) | (i162 & 1879048192), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    f3 = f2;
                                    modifier4 = modifier3;
                                    function25 = function24;
                                    function33 = function32;
                                    windowInsets4 = windowInsets3;
                                    topAppBarColors3 = topAppBarColors2;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    fM3296getTopAppBarExpandedHeightD9Ej5fM = f;
                    if ((196608 & i) == 0) {
                    }
                    if ((1572864 & i) == 0) {
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                    }
                    i8 = i7;
                    int i1422 = i3;
                    if ((i3 & 4793491) == 4793490) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function3M2390getLambda8$material3_release = function3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                fM3296getTopAppBarExpandedHeightD9Ej5fM = f;
                if ((196608 & i) == 0) {
                }
                if ((1572864 & i) == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                i8 = i7;
                int i14222 = i3;
                if ((i3 & 4793491) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function2M2389getLambda7$material3_release = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function3M2390getLambda8$material3_release = function3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            fM3296getTopAppBarExpandedHeightD9Ej5fM = f;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            i8 = i7;
            int i142222 = i3;
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function2M2389getLambda7$material3_release = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function3M2390getLambda8$material3_release = function3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        fM3296getTopAppBarExpandedHeightD9Ej5fM = f;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        i8 = i7;
        int i1422222 = i3;
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of MediumTopAppBar with collapsedHeight and expandedHeight parameters")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void MediumTopAppBar(final Function2 function2, Modifier modifier, Function2 function22, Function3 function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        Function2 function23;
        int i3;
        Modifier modifier2;
        int i4;
        Function2 function2M2391getLambda9$material3_release;
        int i5;
        Function3 function3M2375getLambda10$material3_release;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColorsMediumTopAppBarColors;
        int i6;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        TopAppBarColors topAppBarColors2;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        int i7;
        Function3 function32;
        Modifier modifier3;
        WindowInsets windowInsets3;
        Composer composer2;
        final Modifier modifier4;
        final Function2 function24;
        final Function3 function33;
        final WindowInsets windowInsets4;
        final TopAppBarColors topAppBarColors3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1805417862);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(MediumTopAppBar)P(5,2,3!1,6)396@19336L12,397@19398L23,400@19483L388:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(function23) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
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
                    function2M2391getLambda9$material3_release = function22;
                    i3 |= composerStartRestartGroup.changedInstance(function2M2391getLambda9$material3_release) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function3M2375getLambda10$material3_release = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function3M2375getLambda10$material3_release) ? 2048 : 1024;
                    }
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            windowInsets2 = windowInsets;
                            int i9 = composerStartRestartGroup.changed(windowInsets2) ? 16384 : 8192;
                            i3 |= i9;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i3 |= i9;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            topAppBarColorsMediumTopAppBarColors = topAppBarColors;
                            int i10 = composerStartRestartGroup.changed(topAppBarColorsMediumTopAppBarColors) ? 131072 : 65536;
                            i3 |= i10;
                        } else {
                            topAppBarColorsMediumTopAppBarColors = topAppBarColors;
                        }
                        i3 |= i10;
                    } else {
                        topAppBarColorsMediumTopAppBarColors = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 != 0) {
                        if ((1572864 & i) == 0) {
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : 524288;
                        }
                        if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer2 = composerStartRestartGroup;
                            modifier4 = modifier2;
                            function24 = function2M2391getLambda9$material3_release;
                            function33 = function3M2375getLambda10$material3_release;
                            windowInsets4 = windowInsets2;
                            topAppBarColors3 = topAppBarColorsMediumTopAppBarColors;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    function2M2391getLambda9$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m2391getLambda9$material3_release();
                                }
                                if (i5 != 0) {
                                    function3M2375getLambda10$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m2375getLambda10$material3_release();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    topAppBarColorsMediumTopAppBarColors = TopAppBarDefaults.INSTANCE.mediumTopAppBarColors(composerStartRestartGroup, 6);
                                }
                                if (i6 == 0) {
                                    topAppBarScrollBehavior3 = null;
                                    topAppBarColors2 = topAppBarColorsMediumTopAppBarColors;
                                } else {
                                    topAppBarColors2 = topAppBarColorsMediumTopAppBarColors;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                }
                                i7 = 1805417862;
                                function32 = function3M2375getLambda10$material3_release;
                                modifier3 = companion;
                                windowInsets3 = windowInsets2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                topAppBarColors2 = topAppBarColorsMediumTopAppBarColors;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                i7 = 1805417862;
                                function32 = function3M2375getLambda10$material3_release;
                                windowInsets3 = windowInsets2;
                                modifier3 = modifier2;
                            }
                            Function2 function25 = function2M2391getLambda9$material3_release;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i7, i3, -1, "androidx.compose.material3.MediumTopAppBar (AppBar.kt:400)");
                            }
                            int i11 = i3 << 6;
                            composer2 = composerStartRestartGroup;
                            m2205MediumTopAppBaroKE7A98(function23, modifier3, function25, function32, TopAppBarDefaults.INSTANCE.m3294getMediumAppBarCollapsedHeightD9Ej5fM(), TopAppBarDefaults.INSTANCE.m3295getMediumAppBarExpandedHeightD9Ej5fM(), windowInsets3, topAppBarColors2, topAppBarScrollBehavior3, composer2, (3670016 & i11) | (i3 & 14) | 221184 | (i3 & LDSFile.EF_DG16_TAG) | (i3 & 896) | (i3 & 7168) | (29360128 & i11) | (i11 & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            function24 = function25;
                            function33 = function32;
                            windowInsets4 = windowInsets3;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.MediumTopAppBar.1
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
                                    AppBarKt.MediumTopAppBar(function2, modifier4, function24, function33, windowInsets4, topAppBarColors3, topAppBarScrollBehavior4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 1572864;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if ((599187 & i3) == 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i8 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if ((i2 & 16) != 0) {
                            }
                            if ((i2 & 32) != 0) {
                            }
                            if (i6 == 0) {
                            }
                            i7 = 1805417862;
                            function32 = function3M2375getLambda10$material3_release;
                            modifier3 = companion;
                            windowInsets3 = windowInsets2;
                            Function2 function252 = function2M2391getLambda9$material3_release;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i112 = i3 << 6;
                            composer2 = composerStartRestartGroup;
                            m2205MediumTopAppBaroKE7A98(function23, modifier3, function252, function32, TopAppBarDefaults.INSTANCE.m3294getMediumAppBarCollapsedHeightD9Ej5fM(), TopAppBarDefaults.INSTANCE.m3295getMediumAppBarExpandedHeightD9Ej5fM(), windowInsets3, topAppBarColors2, topAppBarScrollBehavior3, composer2, (3670016 & i112) | (i3 & 14) | 221184 | (i3 & LDSFile.EF_DG16_TAG) | (i3 & 896) | (i3 & 7168) | (29360128 & i112) | (i112 & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            function24 = function252;
                            function33 = function32;
                            windowInsets4 = windowInsets3;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function3M2375getLambda10$material3_release = function3;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if ((599187 & i3) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function2M2391getLambda9$material3_release = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function3M2375getLambda10$material3_release = function3;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if ((599187 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function2M2391getLambda9$material3_release = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function3M2375getLambda10$material3_release = function3;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fd  */
    /* renamed from: MediumTopAppBar-oKE7A98, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2205MediumTopAppBaroKE7A98(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function2M2376getLambda11$material3_release;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M2377getLambda12$material3_release;
        int i6;
        float fM3294getMediumAppBarCollapsedHeightD9Ej5fM;
        int i7;
        float fM3295getMediumAppBarExpandedHeightD9Ej5fM;
        int i8;
        int i9;
        WindowInsets windowInsets2;
        int i10;
        TopAppBarColors topAppBarColorsMediumTopAppBarColors;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors2;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        float f3;
        Modifier modifier3;
        int i11;
        Composer composer2;
        final float f4;
        final float f5;
        final Modifier modifier4;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final WindowInsets windowInsets4;
        final TopAppBarColors topAppBarColors3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1879191686);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(MediumTopAppBar)P(7,4,5!1,1:c#ui.unit.Dp,3:c#ui.unit.Dp,8)465@23246L12,466@23308L23,472@23523L5,473@23594L5,469@23393L947:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(function23) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
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
                    function2M2376getLambda11$material3_release = function22;
                    i3 |= composerStartRestartGroup.changedInstance(function2M2376getLambda11$material3_release) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function3M2377getLambda12$material3_release = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function3M2377getLambda12$material3_release) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            fM3294getMediumAppBarCollapsedHeightD9Ej5fM = f;
                            i3 |= composerStartRestartGroup.changed(fM3294getMediumAppBarCollapsedHeightD9Ej5fM) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                        } else {
                            if ((196608 & i) == 0) {
                                fM3295getMediumAppBarExpandedHeightD9Ej5fM = f2;
                                i3 |= composerStartRestartGroup.changed(fM3295getMediumAppBarExpandedHeightD9Ej5fM) ? 131072 : 65536;
                            }
                            if ((i & 1572864) == 0) {
                                i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changed(windowInsets)) ? 1048576 : 524288;
                            }
                            if ((i & 12582912) == 0) {
                                i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changed(topAppBarColors)) ? 8388608 : 4194304;
                            }
                            i8 = i2 & 256;
                            if (i8 != 0) {
                                if ((i & 100663296) == 0) {
                                    i9 = i8;
                                    i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                }
                                int i13 = i3;
                                if ((i3 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    windowInsets4 = windowInsets;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                    composer2 = composerStartRestartGroup;
                                    modifier4 = modifier2;
                                    function25 = function2M2376getLambda11$material3_release;
                                    function33 = function3M2377getLambda12$material3_release;
                                    f4 = fM3294getMediumAppBarCollapsedHeightD9Ej5fM;
                                    f5 = fM3295getMediumAppBarExpandedHeightD9Ej5fM;
                                    topAppBarColors3 = topAppBarColors;
                                } else {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if (i12 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i4 != 0) {
                                            function2M2376getLambda11$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m2376getLambda11$material3_release();
                                        }
                                        if (i5 != 0) {
                                            function3M2377getLambda12$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m2377getLambda12$material3_release();
                                        }
                                        if (i6 != 0) {
                                            fM3294getMediumAppBarCollapsedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m3294getMediumAppBarCollapsedHeightD9Ej5fM();
                                        }
                                        if (i7 != 0) {
                                            fM3295getMediumAppBarExpandedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m3295getMediumAppBarExpandedHeightD9Ej5fM();
                                        }
                                        if ((i2 & 64) == 0) {
                                            windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                            i10 = i13 & (-3670017);
                                        } else {
                                            windowInsets2 = windowInsets;
                                            i10 = i13;
                                        }
                                        if ((i2 & 128) == 0) {
                                            topAppBarColorsMediumTopAppBarColors = TopAppBarDefaults.INSTANCE.mediumTopAppBarColors(composerStartRestartGroup, 6);
                                            i10 &= -29360129;
                                        } else {
                                            topAppBarColorsMediumTopAppBarColors = topAppBarColors;
                                        }
                                        if (i9 == 0) {
                                            windowInsets3 = windowInsets2;
                                            topAppBarColors2 = topAppBarColorsMediumTopAppBarColors;
                                            function24 = function2M2376getLambda11$material3_release;
                                            topAppBarScrollBehavior2 = null;
                                        } else {
                                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                            windowInsets3 = windowInsets2;
                                            topAppBarColors2 = topAppBarColorsMediumTopAppBarColors;
                                            function24 = function2M2376getLambda11$material3_release;
                                        }
                                        function32 = function3M2377getLambda12$material3_release;
                                        f3 = fM3294getMediumAppBarCollapsedHeightD9Ej5fM;
                                        modifier3 = modifier2;
                                        i11 = i10;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        int i14 = (i2 & 64) != 0 ? i13 & (-3670017) : i13;
                                        if ((i2 & 128) != 0) {
                                            i14 &= -29360129;
                                        }
                                        Modifier modifier5 = modifier2;
                                        i11 = i14;
                                        f3 = fM3294getMediumAppBarCollapsedHeightD9Ej5fM;
                                        modifier3 = modifier5;
                                        windowInsets3 = windowInsets;
                                        topAppBarColors2 = topAppBarColors;
                                        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                        function24 = function2M2376getLambda11$material3_release;
                                        function32 = function3M2377getLambda12$material3_release;
                                    }
                                    float f6 = fM3295getMediumAppBarExpandedHeightD9Ej5fM;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1879191686, i11, -1, "androidx.compose.material3.MediumTopAppBar (AppBar.kt:469)");
                                    }
                                    int i15 = i11 << 12;
                                    composer2 = composerStartRestartGroup;
                                    m2209TwoRowsTopAppBarnS6u9G4(modifier3, function23, TypographyKt.getValue(TopAppBarMediumTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6), MediumTitleBottomPadding, function2, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6), function24, function32, (!C1959Dp.m7060equalsimpl0(f3, C1959Dp.INSTANCE.m7075getUnspecifiedD9Ej5fM()) || C1959Dp.m7060equalsimpl0(f3, C1959Dp.INSTANCE.m7074getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m3294getMediumAppBarCollapsedHeightD9Ej5fM() : f3, (!C1959Dp.m7060equalsimpl0(f6, C1959Dp.INSTANCE.m7075getUnspecifiedD9Ej5fM()) || C1959Dp.m7060equalsimpl0(f6, C1959Dp.INSTANCE.m7074getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m3295getMediumAppBarExpandedHeightD9Ej5fM() : f6, windowInsets3, topAppBarColors2, topAppBarScrollBehavior2, composer2, ((i11 >> 3) & 14) | 3072 | ((i11 << 3) & LDSFile.EF_DG16_TAG) | (57344 & i15) | (3670016 & i15) | (i15 & 29360128), (i11 >> 18) & 1022, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    f4 = f3;
                                    f5 = f6;
                                    modifier4 = modifier3;
                                    function25 = function24;
                                    function33 = function32;
                                    windowInsets4 = windowInsets3;
                                    topAppBarColors3 = topAppBarColors2;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.MediumTopAppBar.2
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

                                        public final void invoke(Composer composer3, int i16) {
                                            AppBarKt.m2205MediumTopAppBaroKE7A98(function2, modifier4, function25, function33, f4, f5, windowInsets4, topAppBarColors3, topAppBarScrollBehavior3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i3 |= 100663296;
                            i9 = i8;
                            int i132 = i3;
                            if ((i3 & 38347923) == 38347922) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if (i12 != 0) {
                                    }
                                    if (i4 != 0) {
                                    }
                                    if (i5 != 0) {
                                    }
                                    if (i6 != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if ((i2 & 64) == 0) {
                                    }
                                    if ((i2 & 128) == 0) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    function32 = function3M2377getLambda12$material3_release;
                                    f3 = fM3294getMediumAppBarCollapsedHeightD9Ej5fM;
                                    modifier3 = modifier2;
                                    i11 = i10;
                                    float f62 = fM3295getMediumAppBarExpandedHeightD9Ej5fM;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (C1959Dp.m7060equalsimpl0(f3, C1959Dp.INSTANCE.m7075getUnspecifiedD9Ej5fM())) {
                                        if (C1959Dp.m7060equalsimpl0(f62, C1959Dp.INSTANCE.m7075getUnspecifiedD9Ej5fM())) {
                                            int i152 = i11 << 12;
                                            composer2 = composerStartRestartGroup;
                                            m2209TwoRowsTopAppBarnS6u9G4(modifier3, function23, TypographyKt.getValue(TopAppBarMediumTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6), MediumTitleBottomPadding, function2, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6), function24, function32, (!C1959Dp.m7060equalsimpl0(f3, C1959Dp.INSTANCE.m7075getUnspecifiedD9Ej5fM()) || C1959Dp.m7060equalsimpl0(f3, C1959Dp.INSTANCE.m7074getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m3294getMediumAppBarCollapsedHeightD9Ej5fM() : f3, (!C1959Dp.m7060equalsimpl0(f62, C1959Dp.INSTANCE.m7075getUnspecifiedD9Ej5fM()) || C1959Dp.m7060equalsimpl0(f62, C1959Dp.INSTANCE.m7074getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m3295getMediumAppBarExpandedHeightD9Ej5fM() : f62, windowInsets3, topAppBarColors2, topAppBarScrollBehavior2, composer2, ((i11 >> 3) & 14) | 3072 | ((i11 << 3) & LDSFile.EF_DG16_TAG) | (57344 & i152) | (3670016 & i152) | (i152 & 29360128), (i11 >> 18) & 1022, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            f4 = f3;
                                            f5 = f62;
                                            modifier4 = modifier3;
                                            function25 = function24;
                                            function33 = function32;
                                            windowInsets4 = windowInsets3;
                                            topAppBarColors3 = topAppBarColors2;
                                            topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                        }
                                    }
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        fM3295getMediumAppBarExpandedHeightD9Ej5fM = f2;
                        if ((i & 1572864) == 0) {
                        }
                        if ((i & 12582912) == 0) {
                        }
                        i8 = i2 & 256;
                        if (i8 != 0) {
                        }
                        i9 = i8;
                        int i1322 = i3;
                        if ((i3 & 38347923) == 38347922) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    fM3294getMediumAppBarCollapsedHeightD9Ej5fM = f;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    fM3295getMediumAppBarExpandedHeightD9Ej5fM = f2;
                    if ((i & 1572864) == 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i8 = i2 & 256;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    int i13222 = i3;
                    if ((i3 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function3M2377getLambda12$material3_release = function3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                fM3294getMediumAppBarCollapsedHeightD9Ej5fM = f;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                fM3295getMediumAppBarExpandedHeightD9Ej5fM = f2;
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                }
                i9 = i8;
                int i132222 = i3;
                if ((i3 & 38347923) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function2M2376getLambda11$material3_release = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function3M2377getLambda12$material3_release = function3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            fM3294getMediumAppBarCollapsedHeightD9Ej5fM = f;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            fM3295getMediumAppBarExpandedHeightD9Ej5fM = f2;
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            i9 = i8;
            int i1322222 = i3;
            if ((i3 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function2M2376getLambda11$material3_release = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function3M2377getLambda12$material3_release = function3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        fM3294getMediumAppBarCollapsedHeightD9Ej5fM = f;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        fM3295getMediumAppBarExpandedHeightD9Ej5fM = f2;
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        i9 = i8;
        int i13222222 = i3;
        if ((i3 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of LargeTopAppBar with collapsedHeight and expandedHeight parameters")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LargeTopAppBar(final Function2 function2, Modifier modifier, Function2 function22, Function3 function3, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        Function2 function23;
        int i3;
        Modifier modifier2;
        int i4;
        Function2 function2M2378getLambda13$material3_release;
        int i5;
        Function3 function3M2379getLambda14$material3_release;
        WindowInsets windowInsets2;
        TopAppBarColors topAppBarColorsLargeTopAppBarColors;
        int i6;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        TopAppBarColors topAppBarColors2;
        TopAppBarScrollBehavior topAppBarScrollBehavior3;
        int i7;
        Function3 function32;
        Modifier modifier3;
        WindowInsets windowInsets3;
        Composer composer2;
        final Modifier modifier4;
        final Function2 function24;
        final Function3 function33;
        final WindowInsets windowInsets4;
        final TopAppBarColors topAppBarColors3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-474540752);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LargeTopAppBar)P(5,2,3!1,6)541@26855L12,542@26917L22,545@27001L385:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(function23) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
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
                    function2M2378getLambda13$material3_release = function22;
                    i3 |= composerStartRestartGroup.changedInstance(function2M2378getLambda13$material3_release) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function3M2379getLambda14$material3_release = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function3M2379getLambda14$material3_release) ? 2048 : 1024;
                    }
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            windowInsets2 = windowInsets;
                            int i9 = composerStartRestartGroup.changed(windowInsets2) ? 16384 : 8192;
                            i3 |= i9;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        i3 |= i9;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            topAppBarColorsLargeTopAppBarColors = topAppBarColors;
                            int i10 = composerStartRestartGroup.changed(topAppBarColorsLargeTopAppBarColors) ? 131072 : 65536;
                            i3 |= i10;
                        } else {
                            topAppBarColorsLargeTopAppBarColors = topAppBarColors;
                        }
                        i3 |= i10;
                    } else {
                        topAppBarColorsLargeTopAppBarColors = topAppBarColors;
                    }
                    i6 = i2 & 64;
                    if (i6 != 0) {
                        if ((1572864 & i) == 0) {
                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                            i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior2) ? 1048576 : 524288;
                        }
                        if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer2 = composerStartRestartGroup;
                            modifier4 = modifier2;
                            function24 = function2M2378getLambda13$material3_release;
                            function33 = function3M2379getLambda14$material3_release;
                            windowInsets4 = windowInsets2;
                            topAppBarColors3 = topAppBarColorsLargeTopAppBarColors;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i4 != 0) {
                                    function2M2378getLambda13$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m2378getLambda13$material3_release();
                                }
                                if (i5 != 0) {
                                    function3M2379getLambda14$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m2379getLambda14$material3_release();
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    topAppBarColorsLargeTopAppBarColors = TopAppBarDefaults.INSTANCE.largeTopAppBarColors(composerStartRestartGroup, 6);
                                }
                                if (i6 == 0) {
                                    topAppBarScrollBehavior3 = null;
                                    topAppBarColors2 = topAppBarColorsLargeTopAppBarColors;
                                } else {
                                    topAppBarColors2 = topAppBarColorsLargeTopAppBarColors;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                }
                                i7 = -474540752;
                                function32 = function3M2379getLambda14$material3_release;
                                modifier3 = companion;
                                windowInsets3 = windowInsets2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                topAppBarColors2 = topAppBarColorsLargeTopAppBarColors;
                                topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                i7 = -474540752;
                                function32 = function3M2379getLambda14$material3_release;
                                windowInsets3 = windowInsets2;
                                modifier3 = modifier2;
                            }
                            Function2 function25 = function2M2378getLambda13$material3_release;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i7, i3, -1, "androidx.compose.material3.LargeTopAppBar (AppBar.kt:545)");
                            }
                            int i11 = i3 << 6;
                            composer2 = composerStartRestartGroup;
                            m2204LargeTopAppBaroKE7A98(function23, modifier3, function25, function32, TopAppBarDefaults.INSTANCE.m3292getLargeAppBarCollapsedHeightD9Ej5fM(), TopAppBarDefaults.INSTANCE.m3293getLargeAppBarExpandedHeightD9Ej5fM(), windowInsets3, topAppBarColors2, topAppBarScrollBehavior3, composer2, (3670016 & i11) | (i3 & 14) | 221184 | (i3 & LDSFile.EF_DG16_TAG) | (i3 & 896) | (i3 & 7168) | (29360128 & i11) | (i11 & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            function24 = function25;
                            function33 = function32;
                            windowInsets4 = windowInsets3;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.LargeTopAppBar.1
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
                                    AppBarKt.LargeTopAppBar(function2, modifier4, function24, function33, windowInsets4, topAppBarColors3, topAppBarScrollBehavior4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 1572864;
                    topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                    if ((599187 & i3) == 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i8 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if ((i2 & 16) != 0) {
                            }
                            if ((i2 & 32) != 0) {
                            }
                            if (i6 == 0) {
                            }
                            i7 = -474540752;
                            function32 = function3M2379getLambda14$material3_release;
                            modifier3 = companion;
                            windowInsets3 = windowInsets2;
                            Function2 function252 = function2M2378getLambda13$material3_release;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i112 = i3 << 6;
                            composer2 = composerStartRestartGroup;
                            m2204LargeTopAppBaroKE7A98(function23, modifier3, function252, function32, TopAppBarDefaults.INSTANCE.m3292getLargeAppBarCollapsedHeightD9Ej5fM(), TopAppBarDefaults.INSTANCE.m3293getLargeAppBarExpandedHeightD9Ej5fM(), windowInsets3, topAppBarColors2, topAppBarScrollBehavior3, composer2, (3670016 & i112) | (i3 & 14) | 221184 | (i3 & LDSFile.EF_DG16_TAG) | (i3 & 896) | (i3 & 7168) | (29360128 & i112) | (i112 & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            function24 = function252;
                            function33 = function32;
                            windowInsets4 = windowInsets3;
                            topAppBarColors3 = topAppBarColors2;
                            topAppBarScrollBehavior4 = topAppBarScrollBehavior3;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function3M2379getLambda14$material3_release = function3;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                }
                topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                if ((599187 & i3) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function2M2378getLambda13$material3_release = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function3M2379getLambda14$material3_release = function3;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
            if ((599187 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function2M2378getLambda13$material3_release = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function3M2379getLambda14$material3_release = function3;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fd  */
    /* renamed from: LargeTopAppBar-oKE7A98, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2204LargeTopAppBaroKE7A98(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, float f, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function2M2380getLambda15$material3_release;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M2381getLambda16$material3_release;
        int i6;
        float fM3292getLargeAppBarCollapsedHeightD9Ej5fM;
        int i7;
        float fM3293getLargeAppBarExpandedHeightD9Ej5fM;
        int i8;
        int i9;
        WindowInsets windowInsets2;
        int i10;
        TopAppBarColors topAppBarColorsLargeTopAppBarColors;
        TopAppBarScrollBehavior topAppBarScrollBehavior2;
        WindowInsets windowInsets3;
        TopAppBarColors topAppBarColors2;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        float f3;
        Modifier modifier3;
        int i11;
        Composer composer2;
        final float f4;
        final float f5;
        final Modifier modifier4;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final WindowInsets windowInsets4;
        final TopAppBarColors topAppBarColors3;
        final TopAppBarScrollBehavior topAppBarScrollBehavior3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-630005584);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LargeTopAppBar)P(7,4,5!1,1:c#ui.unit.Dp,3:c#ui.unit.Dp,8)610@30747L12,611@30809L22,616@30993L5,617@31064L5,614@30893L943:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(function23) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
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
                    function2M2380getLambda15$material3_release = function22;
                    i3 |= composerStartRestartGroup.changedInstance(function2M2380getLambda15$material3_release) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function3M2381getLambda16$material3_release = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function3M2381getLambda16$material3_release) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            fM3292getLargeAppBarCollapsedHeightD9Ej5fM = f;
                            i3 |= composerStartRestartGroup.changed(fM3292getLargeAppBarCollapsedHeightD9Ej5fM) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                        } else {
                            if ((196608 & i) == 0) {
                                fM3293getLargeAppBarExpandedHeightD9Ej5fM = f2;
                                i3 |= composerStartRestartGroup.changed(fM3293getLargeAppBarExpandedHeightD9Ej5fM) ? 131072 : 65536;
                            }
                            if ((i & 1572864) == 0) {
                                i3 |= ((i2 & 64) == 0 && composerStartRestartGroup.changed(windowInsets)) ? 1048576 : 524288;
                            }
                            if ((i & 12582912) == 0) {
                                i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changed(topAppBarColors)) ? 8388608 : 4194304;
                            }
                            i8 = i2 & 256;
                            if (i8 != 0) {
                                if ((i & 100663296) == 0) {
                                    i9 = i8;
                                    i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                }
                                int i13 = i3;
                                if ((i3 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    windowInsets4 = windowInsets;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                    composer2 = composerStartRestartGroup;
                                    modifier4 = modifier2;
                                    function25 = function2M2380getLambda15$material3_release;
                                    function33 = function3M2381getLambda16$material3_release;
                                    f4 = fM3292getLargeAppBarCollapsedHeightD9Ej5fM;
                                    f5 = fM3293getLargeAppBarExpandedHeightD9Ej5fM;
                                    topAppBarColors3 = topAppBarColors;
                                } else {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if (i12 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i4 != 0) {
                                            function2M2380getLambda15$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m2380getLambda15$material3_release();
                                        }
                                        if (i5 != 0) {
                                            function3M2381getLambda16$material3_release = ComposableSingletons$AppBarKt.INSTANCE.m2381getLambda16$material3_release();
                                        }
                                        if (i6 != 0) {
                                            fM3292getLargeAppBarCollapsedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m3292getLargeAppBarCollapsedHeightD9Ej5fM();
                                        }
                                        if (i7 != 0) {
                                            fM3293getLargeAppBarExpandedHeightD9Ej5fM = TopAppBarDefaults.INSTANCE.m3293getLargeAppBarExpandedHeightD9Ej5fM();
                                        }
                                        if ((i2 & 64) == 0) {
                                            windowInsets2 = TopAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                            i10 = i13 & (-3670017);
                                        } else {
                                            windowInsets2 = windowInsets;
                                            i10 = i13;
                                        }
                                        if ((i2 & 128) == 0) {
                                            topAppBarColorsLargeTopAppBarColors = TopAppBarDefaults.INSTANCE.largeTopAppBarColors(composerStartRestartGroup, 6);
                                            i10 &= -29360129;
                                        } else {
                                            topAppBarColorsLargeTopAppBarColors = topAppBarColors;
                                        }
                                        if (i9 == 0) {
                                            windowInsets3 = windowInsets2;
                                            topAppBarColors2 = topAppBarColorsLargeTopAppBarColors;
                                            function24 = function2M2380getLambda15$material3_release;
                                            topAppBarScrollBehavior2 = null;
                                        } else {
                                            topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                            windowInsets3 = windowInsets2;
                                            topAppBarColors2 = topAppBarColorsLargeTopAppBarColors;
                                            function24 = function2M2380getLambda15$material3_release;
                                        }
                                        function32 = function3M2381getLambda16$material3_release;
                                        f3 = fM3292getLargeAppBarCollapsedHeightD9Ej5fM;
                                        modifier3 = modifier2;
                                        i11 = i10;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        int i14 = (i2 & 64) != 0 ? i13 & (-3670017) : i13;
                                        if ((i2 & 128) != 0) {
                                            i14 &= -29360129;
                                        }
                                        Modifier modifier5 = modifier2;
                                        i11 = i14;
                                        f3 = fM3292getLargeAppBarCollapsedHeightD9Ej5fM;
                                        modifier3 = modifier5;
                                        windowInsets3 = windowInsets;
                                        topAppBarColors2 = topAppBarColors;
                                        topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                        function24 = function2M2380getLambda15$material3_release;
                                        function32 = function3M2381getLambda16$material3_release;
                                    }
                                    float f6 = fM3293getLargeAppBarExpandedHeightD9Ej5fM;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-630005584, i11, -1, "androidx.compose.material3.LargeTopAppBar (AppBar.kt:614)");
                                    }
                                    int i15 = i11 << 12;
                                    composer2 = composerStartRestartGroup;
                                    m2209TwoRowsTopAppBarnS6u9G4(modifier3, function23, TypographyKt.getValue(TopAppBarLargeTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6), LargeTitleBottomPadding, function2, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6), function24, function32, (!C1959Dp.m7060equalsimpl0(f3, C1959Dp.INSTANCE.m7075getUnspecifiedD9Ej5fM()) || C1959Dp.m7060equalsimpl0(f3, C1959Dp.INSTANCE.m7074getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m3292getLargeAppBarCollapsedHeightD9Ej5fM() : f3, (!C1959Dp.m7060equalsimpl0(f6, C1959Dp.INSTANCE.m7075getUnspecifiedD9Ej5fM()) || C1959Dp.m7060equalsimpl0(f6, C1959Dp.INSTANCE.m7074getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m3293getLargeAppBarExpandedHeightD9Ej5fM() : f6, windowInsets3, topAppBarColors2, topAppBarScrollBehavior2, composer2, ((i11 >> 3) & 14) | 3072 | ((i11 << 3) & LDSFile.EF_DG16_TAG) | (57344 & i15) | (3670016 & i15) | (i15 & 29360128), (i11 >> 18) & 1022, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    f4 = f3;
                                    f5 = f6;
                                    modifier4 = modifier3;
                                    function25 = function24;
                                    function33 = function32;
                                    windowInsets4 = windowInsets3;
                                    topAppBarColors3 = topAppBarColors2;
                                    topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt.LargeTopAppBar.2
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

                                        public final void invoke(Composer composer3, int i16) {
                                            AppBarKt.m2204LargeTopAppBaroKE7A98(function2, modifier4, function25, function33, f4, f5, windowInsets4, topAppBarColors3, topAppBarScrollBehavior3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i3 |= 100663296;
                            i9 = i8;
                            int i132 = i3;
                            if ((i3 & 38347923) == 38347922) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if (i12 != 0) {
                                    }
                                    if (i4 != 0) {
                                    }
                                    if (i5 != 0) {
                                    }
                                    if (i6 != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if ((i2 & 64) == 0) {
                                    }
                                    if ((i2 & 128) == 0) {
                                    }
                                    if (i9 == 0) {
                                    }
                                    function32 = function3M2381getLambda16$material3_release;
                                    f3 = fM3292getLargeAppBarCollapsedHeightD9Ej5fM;
                                    modifier3 = modifier2;
                                    i11 = i10;
                                    float f62 = fM3293getLargeAppBarExpandedHeightD9Ej5fM;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    if (C1959Dp.m7060equalsimpl0(f3, C1959Dp.INSTANCE.m7075getUnspecifiedD9Ej5fM())) {
                                        if (C1959Dp.m7060equalsimpl0(f62, C1959Dp.INSTANCE.m7075getUnspecifiedD9Ej5fM())) {
                                            int i152 = i11 << 12;
                                            composer2 = composerStartRestartGroup;
                                            m2209TwoRowsTopAppBarnS6u9G4(modifier3, function23, TypographyKt.getValue(TopAppBarLargeTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6), LargeTitleBottomPadding, function2, TypographyKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineFont(), composerStartRestartGroup, 6), function24, function32, (!C1959Dp.m7060equalsimpl0(f3, C1959Dp.INSTANCE.m7075getUnspecifiedD9Ej5fM()) || C1959Dp.m7060equalsimpl0(f3, C1959Dp.INSTANCE.m7074getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m3292getLargeAppBarCollapsedHeightD9Ej5fM() : f3, (!C1959Dp.m7060equalsimpl0(f62, C1959Dp.INSTANCE.m7075getUnspecifiedD9Ej5fM()) || C1959Dp.m7060equalsimpl0(f62, C1959Dp.INSTANCE.m7074getInfinityD9Ej5fM())) ? TopAppBarDefaults.INSTANCE.m3293getLargeAppBarExpandedHeightD9Ej5fM() : f62, windowInsets3, topAppBarColors2, topAppBarScrollBehavior2, composer2, ((i11 >> 3) & 14) | 3072 | ((i11 << 3) & LDSFile.EF_DG16_TAG) | (57344 & i152) | (3670016 & i152) | (i152 & 29360128), (i11 >> 18) & 1022, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            f4 = f3;
                                            f5 = f62;
                                            modifier4 = modifier3;
                                            function25 = function24;
                                            function33 = function32;
                                            windowInsets4 = windowInsets3;
                                            topAppBarColors3 = topAppBarColors2;
                                            topAppBarScrollBehavior3 = topAppBarScrollBehavior2;
                                        }
                                    }
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        fM3293getLargeAppBarExpandedHeightD9Ej5fM = f2;
                        if ((i & 1572864) == 0) {
                        }
                        if ((i & 12582912) == 0) {
                        }
                        i8 = i2 & 256;
                        if (i8 != 0) {
                        }
                        i9 = i8;
                        int i1322 = i3;
                        if ((i3 & 38347923) == 38347922) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    fM3292getLargeAppBarCollapsedHeightD9Ej5fM = f;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    fM3293getLargeAppBarExpandedHeightD9Ej5fM = f2;
                    if ((i & 1572864) == 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i8 = i2 & 256;
                    if (i8 != 0) {
                    }
                    i9 = i8;
                    int i13222 = i3;
                    if ((i3 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function3M2381getLambda16$material3_release = function3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                fM3292getLargeAppBarCollapsedHeightD9Ej5fM = f;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                fM3293getLargeAppBarExpandedHeightD9Ej5fM = f2;
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                }
                i9 = i8;
                int i132222 = i3;
                if ((i3 & 38347923) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function2M2380getLambda15$material3_release = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function3M2381getLambda16$material3_release = function3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            fM3292getLargeAppBarCollapsedHeightD9Ej5fM = f;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            fM3293getLargeAppBarExpandedHeightD9Ej5fM = f2;
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            i9 = i8;
            int i1322222 = i3;
            if ((i3 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function2M2380getLambda15$material3_release = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function3M2381getLambda16$material3_release = function3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        fM3292getLargeAppBarCollapsedHeightD9Ej5fM = f;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        fM3293getLargeAppBarExpandedHeightD9Ej5fM = f2;
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        i9 = i8;
        int i13222222 = i3;
        if ((i3 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0117  */
    /* renamed from: BottomAppBar-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2200BottomAppBarSnr_uVM(final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, Composer composer, final int i, final int i2) {
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        int i3;
        Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function22;
        long containerColor;
        long jM2364contentColorForek8zF_U;
        int i5;
        float fM2224getContainerElevationD9Ej5fM;
        int i6;
        WindowInsets windowInsets2;
        PaddingValues paddingValues2;
        Modifier modifier3;
        Composer composer2;
        final Modifier modifier4;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final long j3;
        final long j4;
        final float f2;
        final PaddingValues paddingValues3;
        final WindowInsets windowInsets3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2141738945);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BottomAppBar)P(!1,5,4,1:c#ui.graphics.Color,2:c#ui.graphics.Color,6:c#ui.unit.Dp)678@33855L14,679@33897L31,682@34123L12,684@34145L355:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function32 = function3;
        } else {
            function32 = function3;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(function32) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
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
                    function22 = function2;
                    i3 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        containerColor = j;
                        int i8 = composerStartRestartGroup.changed(containerColor) ? 2048 : 1024;
                        i3 |= i8;
                    } else {
                        containerColor = j;
                    }
                    i3 |= i8;
                } else {
                    containerColor = j;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        jM2364contentColorForek8zF_U = j2;
                        int i9 = composerStartRestartGroup.changed(jM2364contentColorForek8zF_U) ? 16384 : 8192;
                        i3 |= i9;
                    } else {
                        jM2364contentColorForek8zF_U = j2;
                    }
                    i3 |= i9;
                } else {
                    jM2364contentColorForek8zF_U = j2;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        fM2224getContainerElevationD9Ej5fM = f;
                        i3 |= composerStartRestartGroup.changed(fM2224getContainerElevationD9Ej5fM) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(paddingValues) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changed(windowInsets)) ? 8388608 : 4194304;
                    }
                    if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i7 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                function22 = null;
                            }
                            if ((i2 & 8) != 0) {
                                containerColor = BottomAppBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                jM2364contentColorForek8zF_U = ColorSchemeKt.m2364contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i3 >> 9) & 14);
                                i3 &= -57345;
                            }
                            if (i5 != 0) {
                                fM2224getContainerElevationD9Ej5fM = BottomAppBarDefaults.INSTANCE.m2224getContainerElevationD9Ej5fM();
                            }
                            PaddingValues contentPadding = i6 == 0 ? BottomAppBarDefaults.INSTANCE.getContentPadding() : paddingValues;
                            if ((i2 & 128) == 0) {
                                i3 &= -29360129;
                                paddingValues2 = contentPadding;
                                modifier3 = modifier2;
                                windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                long j5 = containerColor;
                                long j6 = jM2364contentColorForek8zF_U;
                                float f3 = fM2224getContainerElevationD9Ej5fM;
                                Function2<? super Composer, ? super Integer, Unit> function24 = function22;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2141738945, i3, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:684)");
                                }
                                composer2 = composerStartRestartGroup;
                                m2202BottomAppBarqhFBPw4(function32, modifier3, function24, j5, j6, f3, paddingValues2, windowInsets2, null, composer2, (i3 & 14) | 100663296 | (i3 & LDSFile.EF_DG16_TAG) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                function23 = function24;
                                j3 = j5;
                                j4 = j6;
                                f2 = f3;
                                paddingValues3 = paddingValues2;
                                windowInsets3 = windowInsets2;
                            } else {
                                windowInsets2 = windowInsets;
                                paddingValues2 = contentPadding;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            paddingValues2 = paddingValues;
                            windowInsets2 = windowInsets;
                        }
                        modifier3 = modifier2;
                        long j52 = containerColor;
                        long j62 = jM2364contentColorForek8zF_U;
                        float f32 = fM2224getContainerElevationD9Ej5fM;
                        Function2<? super Composer, ? super Integer, Unit> function242 = function22;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = composerStartRestartGroup;
                        m2202BottomAppBarqhFBPw4(function32, modifier3, function242, j52, j62, f32, paddingValues2, windowInsets2, null, composer2, (i3 & 14) | 100663296 | (i3 & LDSFile.EF_DG16_TAG) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier3;
                        function23 = function242;
                        j3 = j52;
                        j4 = j62;
                        f2 = f32;
                        paddingValues3 = paddingValues2;
                        windowInsets3 = windowInsets2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier4 = modifier2;
                        function23 = function22;
                        j3 = containerColor;
                        j4 = jM2364contentColorForek8zF_U;
                        f2 = fM2224getContainerElevationD9Ej5fM;
                        paddingValues3 = paddingValues;
                        windowInsets3 = windowInsets;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$1
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
                                AppBarKt.m2200BottomAppBarSnr_uVM(function3, modifier4, function23, j3, j4, f2, paddingValues3, windowInsets3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                fM2224getContainerElevationD9Ej5fM = f;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i7 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i2 & 8) != 0) {
                        }
                        if ((i2 & 16) != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if ((i2 & 128) == 0) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function22 = function2;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            fM2224getContainerElevationD9Ej5fM = f;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function22 = function2;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        fM2224getContainerElevationD9Ej5fM = f;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fb  */
    /* renamed from: BottomAppBar-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2202BottomAppBarqhFBPw4(final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        long containerColor;
        long jM2364contentColorForek8zF_U;
        int i5;
        float f2;
        int i6;
        int i7;
        int i8;
        WindowInsets windowInsets2;
        BottomAppBarScrollBehavior bottomAppBarScrollBehavior2;
        float f3;
        PaddingValues paddingValues2;
        WindowInsets windowInsets3;
        int i9;
        Modifier modifier3;
        long j3;
        long j4;
        int i10;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Modifier modifier4;
        final long j5;
        final long j6;
        final float f4;
        final PaddingValues paddingValues3;
        final WindowInsets windowInsets4;
        final BottomAppBarScrollBehavior bottomAppBarScrollBehavior3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1044837119);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BottomAppBar)P(!1,5,4,1:c#ui.graphics.Color,2:c#ui.graphics.Color,7:c#ui.unit.Dp!1,8)743@37109L14,744@37151L31,747@37377L12,758@37741L539,750@37455L825:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
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
                    function22 = function2;
                    i3 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        containerColor = j;
                        int i12 = composerStartRestartGroup.changed(containerColor) ? 2048 : 1024;
                        i3 |= i12;
                    } else {
                        containerColor = j;
                    }
                    i3 |= i12;
                } else {
                    containerColor = j;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        jM2364contentColorForek8zF_U = j2;
                        int i13 = composerStartRestartGroup.changed(jM2364contentColorForek8zF_U) ? 16384 : 8192;
                        i3 |= i13;
                    } else {
                        jM2364contentColorForek8zF_U = j2;
                    }
                    i3 |= i13;
                } else {
                    jM2364contentColorForek8zF_U = j2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                } else {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        i3 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(paddingValues) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        i3 |= ((i2 & 128) == 0 && composerStartRestartGroup.changed(windowInsets)) ? 8388608 : 4194304;
                    }
                    i7 = i2 & 256;
                    if (i7 != 0) {
                        if ((i & 100663296) == 0) {
                            i8 = i7;
                            i3 |= composerStartRestartGroup.changed(bottomAppBarScrollBehavior) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        if ((i3 & 38347923) == 38347922 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer2 = composerStartRestartGroup;
                            modifier4 = modifier2;
                            function23 = function22;
                            j5 = containerColor;
                            j6 = jM2364contentColorForek8zF_U;
                            f4 = f2;
                            paddingValues3 = paddingValues;
                            windowInsets4 = windowInsets;
                            bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i11 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i4 != 0) {
                                    function22 = null;
                                }
                                if ((i2 & 8) != 0) {
                                    containerColor = BottomAppBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    jM2364contentColorForek8zF_U = ColorSchemeKt.m2364contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i3 >> 9) & 14);
                                    i3 &= -57345;
                                }
                                float fM2224getContainerElevationD9Ej5fM = i5 == 0 ? BottomAppBarDefaults.INSTANCE.m2224getContainerElevationD9Ej5fM() : f2;
                                PaddingValues contentPadding = i6 == 0 ? BottomAppBarDefaults.INSTANCE.getContentPadding() : paddingValues;
                                if ((i2 & 128) == 0) {
                                    windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    windowInsets2 = windowInsets;
                                }
                                bottomAppBarScrollBehavior2 = i8 == 0 ? null : bottomAppBarScrollBehavior;
                                f3 = fM2224getContainerElevationD9Ej5fM;
                                paddingValues2 = contentPadding;
                                windowInsets3 = windowInsets2;
                                i9 = 12582912;
                                modifier3 = modifier2;
                                j3 = containerColor;
                                j4 = jM2364contentColorForek8zF_U;
                                i10 = -1044837119;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                paddingValues2 = paddingValues;
                                windowInsets3 = windowInsets;
                                bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
                                modifier3 = modifier2;
                                f3 = f2;
                                i9 = 12582912;
                                i10 = -1044837119;
                                j3 = containerColor;
                                j4 = jM2364contentColorForek8zF_U;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i10, i3, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:750)");
                            }
                            int i14 = i9 | ((i3 >> 3) & 14);
                            int i15 = i3 >> 6;
                            composer2 = composerStartRestartGroup;
                            m2201BottomAppBare3WI5M(modifier3, j3, j4, f3, paddingValues2, windowInsets3, bottomAppBarScrollBehavior2, ComposableLambdaKt.rememberComposableLambda(1566394874, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    invoke(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope rowScope, Composer composer3, int i16) {
                                    int i17;
                                    ComposerKt.sourceInformation(composer3, "C759@37751L204,766@38012L252:AppBar.kt#uh7d8r");
                                    if ((i16 & 6) == 0) {
                                        i17 = i16 | (composer3.changed(rowScope) ? 4 : 2);
                                    } else {
                                        i17 = i16;
                                    }
                                    if ((i17 & 19) != 18 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1566394874, i17, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:759)");
                                        }
                                        Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer3, 54);
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierWeight$default);
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
                                        Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                                        function32.invoke(RowScopeInstance.INSTANCE, composer3, 6);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        if (function22 != null) {
                                            Modifier modifierM1439paddingqDBjuR0$default = PaddingKt.m1439paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, AppBarKt.FABVerticalPadding, AppBarKt.FABHorizontalPadding, 0.0f, 9, null);
                                            Alignment topStart = Alignment.INSTANCE.getTopStart();
                                            Function2<Composer, Integer, Unit> function24 = function22;
                                            ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(topStart, false);
                                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM1439paddingqDBjuR0$default);
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
                                            ComposerKt.sourceInformationMarkerStart(composer3, 553416911, "C771@38228L22:AppBar.kt#uh7d8r");
                                            function24.invoke(composer3, 0);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            composer3.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }, composerStartRestartGroup, 54), composer2, i14 | (i15 & LDSFile.EF_DG16_TAG) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (i15 & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function23 = function22;
                            modifier4 = modifier3;
                            j5 = j3;
                            j6 = j4;
                            f4 = f3;
                            paddingValues3 = paddingValues2;
                            windowInsets4 = windowInsets3;
                            bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$3
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

                                public final void invoke(Composer composer3, int i16) {
                                    AppBarKt.m2202BottomAppBarqhFBPw4(function3, modifier4, function23, j5, j6, f4, paddingValues3, windowInsets4, bottomAppBarScrollBehavior3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 100663296;
                    i8 = i7;
                    if ((i3 & 38347923) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i11 != 0) {
                            }
                            if (i4 != 0) {
                            }
                            if ((i2 & 8) != 0) {
                            }
                            if ((i2 & 16) != 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if ((i2 & 128) == 0) {
                            }
                            if (i8 == 0) {
                            }
                            f3 = fM2224getContainerElevationD9Ej5fM;
                            paddingValues2 = contentPadding;
                            windowInsets3 = windowInsets2;
                            i9 = 12582912;
                            modifier3 = modifier2;
                            j3 = containerColor;
                            j4 = jM2364contentColorForek8zF_U;
                            i10 = -1044837119;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i142 = i9 | ((i3 >> 3) & 14);
                            int i152 = i3 >> 6;
                            composer2 = composerStartRestartGroup;
                            m2201BottomAppBare3WI5M(modifier3, j3, j4, f3, paddingValues2, windowInsets3, bottomAppBarScrollBehavior2, ComposableLambdaKt.rememberComposableLambda(1566394874, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    invoke(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope rowScope, Composer composer3, int i16) {
                                    int i17;
                                    ComposerKt.sourceInformation(composer3, "C759@37751L204,766@38012L252:AppBar.kt#uh7d8r");
                                    if ((i16 & 6) == 0) {
                                        i17 = i16 | (composer3.changed(rowScope) ? 4 : 2);
                                    } else {
                                        i17 = i16;
                                    }
                                    if ((i17 & 19) != 18 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1566394874, i17, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:759)");
                                        }
                                        Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer3, 54);
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierWeight$default);
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
                                        Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                                        function32.invoke(RowScopeInstance.INSTANCE, composer3, 6);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        composer3.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        if (function22 != null) {
                                            Modifier modifierM1439paddingqDBjuR0$default = PaddingKt.m1439paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, AppBarKt.FABVerticalPadding, AppBarKt.FABHorizontalPadding, 0.0f, 9, null);
                                            Alignment topStart = Alignment.INSTANCE.getTopStart();
                                            Function2<Composer, Integer, Unit> function24 = function22;
                                            ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(topStart, false);
                                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM1439paddingqDBjuR0$default);
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
                                            ComposerKt.sourceInformationMarkerStart(composer3, 553416911, "C771@38228L22:AppBar.kt#uh7d8r");
                                            function24.invoke(composer3, 0);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            composer3.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }, composerStartRestartGroup, 54), composer2, i142 | (i152 & LDSFile.EF_DG16_TAG) | (i152 & 896) | (i152 & 7168) | (57344 & i152) | (458752 & i152) | (i152 & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function23 = function22;
                            modifier4 = modifier3;
                            j5 = j3;
                            j6 = j4;
                            f4 = f3;
                            paddingValues3 = paddingValues2;
                            windowInsets4 = windowInsets3;
                            bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior2;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                f2 = f;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                }
                i8 = i7;
                if ((i3 & 38347923) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function22 = function2;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i7 = i2 & 256;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i3 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function22 = function2;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i7 = i2 & 256;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i3 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f7  */
    /* renamed from: BottomAppBar-1oL4kX8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2199BottomAppBar1oL4kX8(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long containerColor;
        long jM2364contentColorForek8zF_U;
        float fM2224getContainerElevationD9Ej5fM;
        int i4;
        PaddingValues contentPadding;
        WindowInsets windowInsets2;
        Modifier modifier3;
        int i5;
        float f2;
        PaddingValues paddingValues2;
        WindowInsets windowInsets3;
        int i6;
        long j3;
        long j4;
        Composer composer2;
        final Modifier modifier4;
        final long j5;
        final long j6;
        final float f3;
        final PaddingValues paddingValues3;
        final WindowInsets windowInsets4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1391700845);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BottomAppBar)P(4,0:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.unit.Dp,3,6)807@39959L14,808@40001L31,811@40227L12,814@40294L302:AppBar.kt#uh7d8r");
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                containerColor = j;
                int i8 = composerStartRestartGroup.changed(containerColor) ? 32 : 16;
                i3 |= i8;
            } else {
                containerColor = j;
            }
            i3 |= i8;
        } else {
            containerColor = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                jM2364contentColorForek8zF_U = j2;
                int i9 = composerStartRestartGroup.changed(jM2364contentColorForek8zF_U) ? 256 : 128;
                i3 |= i9;
            } else {
                jM2364contentColorForek8zF_U = j2;
            }
            i3 |= i9;
        } else {
            jM2364contentColorForek8zF_U = j2;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                fM2224getContainerElevationD9Ej5fM = f;
                i3 |= composerStartRestartGroup.changed(fM2224getContainerElevationD9Ej5fM) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    contentPadding = paddingValues;
                    i3 |= composerStartRestartGroup.changed(contentPadding) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        windowInsets2 = windowInsets;
                        int i11 = composerStartRestartGroup.changed(windowInsets2) ? 131072 : 65536;
                        i3 |= i11;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i3 |= i11;
                } else {
                    windowInsets2 = windowInsets;
                }
                if ((i2 & 64) == 0) {
                    if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                    }
                    if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            if ((i2 & 2) != 0) {
                                containerColor = BottomAppBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                jM2364contentColorForek8zF_U = ColorSchemeKt.m2364contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i3 >> 3) & 14);
                                i3 &= -897;
                            }
                            if (i10 != 0) {
                                fM2224getContainerElevationD9Ej5fM = BottomAppBarDefaults.INSTANCE.m2224getContainerElevationD9Ej5fM();
                            }
                            if (i4 != 0) {
                                contentPadding = BottomAppBarDefaults.INSTANCE.getContentPadding();
                            }
                            if ((i2 & 32) == 0) {
                                i3 &= -458753;
                                float f4 = fM2224getContainerElevationD9Ej5fM;
                                modifier3 = companion;
                                i5 = 1572864;
                                f2 = f4;
                                windowInsets3 = BottomAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                                j4 = jM2364contentColorForek8zF_U;
                                paddingValues2 = contentPadding;
                                i6 = -1391700845;
                                j3 = containerColor;
                            } else {
                                float f5 = fM2224getContainerElevationD9Ej5fM;
                                modifier3 = companion;
                                i5 = 1572864;
                                f2 = f5;
                                paddingValues2 = contentPadding;
                                windowInsets3 = windowInsets2;
                                i6 = -1391700845;
                                j3 = containerColor;
                                j4 = jM2364contentColorForek8zF_U;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            paddingValues2 = contentPadding;
                            windowInsets3 = windowInsets2;
                            i5 = 1572864;
                            i6 = -1391700845;
                            j3 = containerColor;
                            j4 = jM2364contentColorForek8zF_U;
                            f2 = fM2224getContainerElevationD9Ej5fM;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(i6, i3, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:814)");
                        }
                        composer2 = composerStartRestartGroup;
                        m2201BottomAppBare3WI5M(modifier3, j3, j4, f2, paddingValues2, windowInsets3, null, function3, composer2, i5 | (i3 & 14) | (i3 & LDSFile.EF_DG16_TAG) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (29360128 & (i3 << 3)), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        j5 = j3;
                        j6 = j4;
                        f3 = f2;
                        paddingValues3 = paddingValues2;
                        windowInsets4 = windowInsets3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier4 = modifier2;
                        j5 = containerColor;
                        j6 = jM2364contentColorForek8zF_U;
                        f3 = fM2224getContainerElevationD9Ej5fM;
                        paddingValues3 = contentPadding;
                        windowInsets4 = windowInsets2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$4
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
                                AppBarKt.m2199BottomAppBar1oL4kX8(modifier4, j5, j6, f3, paddingValues3, windowInsets4, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                if ((i3 & 599187) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i7 == 0) {
                        }
                        if ((i2 & 2) != 0) {
                        }
                        if ((i2 & 4) != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i2 & 32) == 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = composerStartRestartGroup;
                        m2201BottomAppBare3WI5M(modifier3, j3, j4, f2, paddingValues2, windowInsets3, null, function3, composer2, i5 | (i3 & 14) | (i3 & LDSFile.EF_DG16_TAG) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (29360128 & (i3 << 3)), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier3;
                        j5 = j3;
                        j6 = j4;
                        f3 = f2;
                        paddingValues3 = paddingValues2;
                        windowInsets4 = windowInsets3;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            contentPadding = paddingValues;
            if ((196608 & i) == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        fM2224getContainerElevationD9Ej5fM = f;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        contentPadding = paddingValues;
        if ((196608 & i) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0116  */
    /* renamed from: BottomAppBar-e-3WI5M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2201BottomAppBare3WI5M(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, BottomAppBarScrollBehavior bottomAppBarScrollBehavior, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long containerColor;
        long jM2364contentColorForek8zF_U;
        float fM2224getContainerElevationD9Ej5fM;
        int i4;
        PaddingValues contentPadding;
        int i5;
        WindowInsets windowInsets2;
        final WindowInsets windowInsets3;
        final PaddingValues paddingValues2;
        long j3;
        int i6;
        int i7;
        long j4;
        final BottomAppBarScrollBehavior bottomAppBarScrollBehavior2;
        float f2;
        int i8;
        int i9;
        int i10;
        Modifier.Companion companionDraggable$default;
        boolean z;
        Object objRememberedValue;
        Composer composer2;
        final PaddingValues paddingValues3;
        final Modifier modifier3;
        final WindowInsets windowInsets4;
        final BottomAppBarScrollBehavior bottomAppBarScrollBehavior3;
        final long j5;
        final long j6;
        final float f3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(422438773);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BottomAppBar)P(4,0:c#ui.graphics.Color,2:c#ui.graphics.Color,6:c#ui.unit.Dp,3,7,5)860@42630L14,861@42672L31,864@42898L12,896@44292L5,899@44363L596,911@45008L364,891@44025L1347:AppBar.kt#uh7d8r");
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                containerColor = j;
                int i12 = composerStartRestartGroup.changed(containerColor) ? 32 : 16;
                i3 |= i12;
            } else {
                containerColor = j;
            }
            i3 |= i12;
        } else {
            containerColor = j;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                jM2364contentColorForek8zF_U = j2;
                int i13 = composerStartRestartGroup.changed(jM2364contentColorForek8zF_U) ? 256 : 128;
                i3 |= i13;
            } else {
                jM2364contentColorForek8zF_U = j2;
            }
            i3 |= i13;
        } else {
            jM2364contentColorForek8zF_U = j2;
        }
        int i14 = i2 & 8;
        if (i14 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                fM2224getContainerElevationD9Ej5fM = f;
                i3 |= composerStartRestartGroup.changed(fM2224getContainerElevationD9Ej5fM) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    contentPadding = paddingValues;
                    i3 |= composerStartRestartGroup.changed(contentPadding) ? 16384 : 8192;
                }
                if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                    i3 |= ((i2 & 32) == 0 && composerStartRestartGroup.changed(windowInsets)) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changed(bottomAppBarScrollBehavior) ? 1048576 : 524288;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                }
                if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 2) != 0) {
                            containerColor = BottomAppBarDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            jM2364contentColorForek8zF_U = ColorSchemeKt.m2364contentColorForek8zF_U(containerColor, composerStartRestartGroup, (i3 >> 3) & 14);
                            i3 &= -897;
                        }
                        if (i14 != 0) {
                            fM2224getContainerElevationD9Ej5fM = BottomAppBarDefaults.INSTANCE.m2224getContainerElevationD9Ej5fM();
                        }
                        if (i4 != 0) {
                            contentPadding = BottomAppBarDefaults.INSTANCE.getContentPadding();
                        }
                        if ((i2 & 32) == 0) {
                            windowInsets2 = BottomAppBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        } else {
                            windowInsets2 = windowInsets;
                        }
                        if (i5 == 0) {
                            int i15 = i3;
                            windowInsets3 = windowInsets2;
                            paddingValues2 = contentPadding;
                            j3 = containerColor;
                            i6 = i15;
                            long j7 = jM2364contentColorForek8zF_U;
                            i7 = 12582912;
                            j4 = j7;
                            f2 = fM2224getContainerElevationD9Ej5fM;
                            bottomAppBarScrollBehavior2 = null;
                        } else {
                            int i16 = i3;
                            windowInsets3 = windowInsets2;
                            paddingValues2 = contentPadding;
                            j3 = containerColor;
                            i6 = i16;
                            long j8 = jM2364contentColorForek8zF_U;
                            i7 = 12582912;
                            j4 = j8;
                            bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
                            f2 = fM2224getContainerElevationD9Ej5fM;
                        }
                        i8 = 422438773;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        long j9 = jM2364contentColorForek8zF_U;
                        i7 = 12582912;
                        j4 = j9;
                        f2 = fM2224getContainerElevationD9Ej5fM;
                        paddingValues2 = contentPadding;
                        i8 = 422438773;
                        j3 = containerColor;
                        bottomAppBarScrollBehavior2 = bottomAppBarScrollBehavior;
                        i6 = i3;
                        windowInsets3 = windowInsets;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(i8, i6, -1, "androidx.compose.material3.BottomAppBar (AppBar.kt:867)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1393560009);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "874@43358L55,874@43335L78,875@43447L289");
                    if (bottomAppBarScrollBehavior2 == null && !bottomAppBarScrollBehavior2.getIsPinned()) {
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Orientation orientation = Orientation.Vertical;
                        i9 = i7;
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1393566103, "CC(remember):AppBar.kt#9igjgp");
                        int i17 = i6 & 3670016;
                        i10 = 3670016;
                        boolean z2 = i17 == 1048576;
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$appBarDragModifier$1$1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Float f4) {
                                    invoke(f4.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(float f4) {
                                    BottomAppBarState state = bottomAppBarScrollBehavior2.getState();
                                    state.setHeightOffset(state.getHeightOffset() - f4);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        DraggableState draggableStateRememberDraggableState = DraggableKt.rememberDraggableState((Function1) objRememberedValue2, composerStartRestartGroup, 0);
                        Modifier.Companion companion2 = companion;
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1393569185, "CC(remember):AppBar.kt#9igjgp");
                        boolean z3 = i17 == 1048576;
                        AppBarKt$BottomAppBar$appBarDragModifier$2$1 appBarKt$BottomAppBar$appBarDragModifier$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z3 || appBarKt$BottomAppBar$appBarDragModifier$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                            appBarKt$BottomAppBar$appBarDragModifier$2$1RememberedValue = new AppBarKt$BottomAppBar$appBarDragModifier$2$1(bottomAppBarScrollBehavior2, null);
                            composerStartRestartGroup.updateRememberedValue(appBarKt$BottomAppBar$appBarDragModifier$2$1RememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        companionDraggable$default = DraggableKt.draggable$default(companion2, draggableStateRememberDraggableState, orientation, false, null, false, null, (Function3) appBarKt$BottomAppBar$appBarDragModifier$2$1RememberedValue, false, 188, null);
                    } else {
                        i9 = i7;
                        i10 = 3670016;
                        companionDraggable$default = Modifier.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Shape value = ShapesKt.getValue(BottomAppBarTokens.INSTANCE.getContainerShape(), composerStartRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1393598804, "CC(remember):AppBar.kt#9igjgp");
                    z = (i6 & i10) == 1048576;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = (Function3) new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$5$1
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                return m2213invoke3p2s80s(measureScope, measurable, constraints.getValue());
                            }

                            /* renamed from: invoke-3p2s80s, reason: not valid java name */
                            public final MeasureResult m2213invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
                                BottomAppBarState state;
                                BottomAppBarScrollBehavior bottomAppBarScrollBehavior4 = bottomAppBarScrollBehavior2;
                                BottomAppBarState state2 = bottomAppBarScrollBehavior4 != null ? bottomAppBarScrollBehavior4.getState() : null;
                                if (state2 != null) {
                                    state2.setHeightOffsetLimit(-measureScope.mo1127toPx0680j_4(BottomAppBarTokens.INSTANCE.m3452getContainerHeightD9Ej5fM()));
                                }
                                final Placeable placeableMo5931measureBRTryo0 = measurable.mo5931measureBRTryo0(j10);
                                float height = placeableMo5931measureBRTryo0.getHeight();
                                BottomAppBarScrollBehavior bottomAppBarScrollBehavior5 = bottomAppBarScrollBehavior2;
                                return MeasureScope.layout$default(measureScope, placeableMo5931measureBRTryo0.getWidth(), MathKt.roundToInt(height + ((bottomAppBarScrollBehavior5 == null || (state = bottomAppBarScrollBehavior5.getState()) == null) ? 0.0f : state.getHeightOffset())), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$5$1.1
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
                                        Placeable.PlacementScope.place$default(placementScope, placeableMo5931measureBRTryo0, 0, 0, 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    int i18 = i6 << 3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m2978SurfaceT9BRK9s(LayoutModifierKt.layout(modifier2, (Function3) objRememberedValue).then(companionDraggable$default), value, j3, j4, f2, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1243053520, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$6
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
                            ComposerKt.sourceInformation(composer3, "C912@45018L348:AppBar.kt#uh7d8r");
                            if ((i19 & 3) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1243053520, i19, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:912)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(SizeKt.m1466height3ABfNKs(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), windowInsets3), BottomAppBarTokens.INSTANCE.m3452getContainerHeightD9Ej5fM()), paddingValues2);
                                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer3, 54);
                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierPadding);
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
                                Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                                function32.invoke(RowScopeInstance.INSTANCE, composer3, 6);
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
                    }, composerStartRestartGroup, 54), composer2, (i18 & 896) | i9 | (i18 & 7168) | (i18 & 57344), 96);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    paddingValues3 = paddingValues2;
                    modifier3 = modifier2;
                    windowInsets4 = windowInsets3;
                    bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior2;
                    j5 = j3;
                    j6 = j4;
                    f3 = f2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior;
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    j5 = containerColor;
                    j6 = jM2364contentColorForek8zF_U;
                    f3 = fM2224getContainerElevationD9Ej5fM;
                    paddingValues3 = contentPadding;
                    windowInsets4 = windowInsets;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$7
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
                            AppBarKt.m2201BottomAppBare3WI5M(modifier3, j5, j6, f3, paddingValues3, windowInsets4, bottomAppBarScrollBehavior3, function3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            contentPadding = paddingValues;
            if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((4793491 & i3) != 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                    }
                    if ((i2 & 2) != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 32) == 0) {
                    }
                    if (i5 == 0) {
                    }
                    i8 = 422438773;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1393560009);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "874@43358L55,874@43335L78,875@43447L289");
                    if (bottomAppBarScrollBehavior2 == null) {
                        i9 = i7;
                        i10 = 3670016;
                        companionDraggable$default = Modifier.INSTANCE;
                        composerStartRestartGroup.endReplaceGroup();
                        Shape value2 = ShapesKt.getValue(BottomAppBarTokens.INSTANCE.getContainerShape(), composerStartRestartGroup, 6);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1393598804, "CC(remember):AppBar.kt#9igjgp");
                        if ((i6 & i10) == 1048576) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z) {
                            objRememberedValue = (Function3) new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$5$1
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                    return m2213invoke3p2s80s(measureScope, measurable, constraints.getValue());
                                }

                                /* renamed from: invoke-3p2s80s, reason: not valid java name */
                                public final MeasureResult m2213invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
                                    BottomAppBarState state;
                                    BottomAppBarScrollBehavior bottomAppBarScrollBehavior4 = bottomAppBarScrollBehavior2;
                                    BottomAppBarState state2 = bottomAppBarScrollBehavior4 != null ? bottomAppBarScrollBehavior4.getState() : null;
                                    if (state2 != null) {
                                        state2.setHeightOffsetLimit(-measureScope.mo1127toPx0680j_4(BottomAppBarTokens.INSTANCE.m3452getContainerHeightD9Ej5fM()));
                                    }
                                    final Placeable placeableMo5931measureBRTryo0 = measurable.mo5931measureBRTryo0(j10);
                                    float height = placeableMo5931measureBRTryo0.getHeight();
                                    BottomAppBarScrollBehavior bottomAppBarScrollBehavior5 = bottomAppBarScrollBehavior2;
                                    return MeasureScope.layout$default(measureScope, placeableMo5931measureBRTryo0.getWidth(), MathKt.roundToInt(height + ((bottomAppBarScrollBehavior5 == null || (state = bottomAppBarScrollBehavior5.getState()) == null) ? 0.0f : state.getHeightOffset())), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$5$1.1
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
                                            Placeable.PlacementScope.place$default(placementScope, placeableMo5931measureBRTryo0, 0, 0, 0.0f, 4, null);
                                        }
                                    }, 4, null);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            int i182 = i6 << 3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m2978SurfaceT9BRK9s(LayoutModifierKt.layout(modifier2, (Function3) objRememberedValue).then(companionDraggable$default), value2, j3, j4, f2, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1243053520, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$6
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
                                    ComposerKt.sourceInformation(composer3, "C912@45018L348:AppBar.kt#uh7d8r");
                                    if ((i19 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1243053520, i19, -1, "androidx.compose.material3.BottomAppBar.<anonymous> (AppBar.kt:912)");
                                        }
                                        Modifier modifierPadding = PaddingKt.padding(SizeKt.m1466height3ABfNKs(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), windowInsets3), BottomAppBarTokens.INSTANCE.m3452getContainerHeightD9Ej5fM()), paddingValues2);
                                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer3, 54);
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierPadding);
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
                                        Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                                        function32.invoke(RowScopeInstance.INSTANCE, composer3, 6);
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
                            }, composerStartRestartGroup, 54), composer2, (i182 & 896) | i9 | (i182 & 7168) | (i182 & 57344), 96);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            paddingValues3 = paddingValues2;
                            modifier3 = modifier2;
                            windowInsets4 = windowInsets3;
                            bottomAppBarScrollBehavior3 = bottomAppBarScrollBehavior2;
                            j5 = j3;
                            j6 = j4;
                            f3 = f2;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        fM2224getContainerElevationD9Ej5fM = f;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        contentPadding = paddingValues;
        if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((4793491 & i3) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final TopAppBarState rememberTopAppBarState(final float f, final float f2, final float f3, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1801969826, "C(rememberTopAppBarState)P(2,1)1292@62790L99,1292@62743L146:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            f = -3.4028235E38f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1801969826, i, -1, "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:1291)");
        }
        Object[] objArr = new Object[0];
        Saver<TopAppBarState, ?> saver = TopAppBarState.INSTANCE.getSaver();
        ComposerKt.sourceInformationMarkerStart(composer, 1949255933, "CC(remember):AppBar.kt#9igjgp");
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(f)) || (i & 6) == 4) | ((((i & LDSFile.EF_DG16_TAG) ^ 48) > 32 && composer.changed(f2)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(f3)) || (i & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = (Function0) new Function0<TopAppBarState>() { // from class: androidx.compose.material3.AppBarKt$rememberTopAppBarState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final TopAppBarState invoke() {
                    return new TopAppBarState(f, f2, f3);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        TopAppBarState topAppBarState = (TopAppBarState) RememberSaveableKt.m4181rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return topAppBarState;
    }

    public static final BottomAppBarState rememberBottomAppBarState(final float f, final float f2, final float f3, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1420874240, "C(rememberBottomAppBarState)P(2,1)1611@75546L102,1611@75496L152:AppBar.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            f = -3.4028235E38f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1420874240, i, -1, "androidx.compose.material3.rememberBottomAppBarState (AppBar.kt:1610)");
        }
        Object[] objArr = new Object[0];
        Saver<BottomAppBarState, ?> saver = BottomAppBarState.INSTANCE.getSaver();
        ComposerKt.sourceInformationMarkerStart(composer, -1399214710, "CC(remember):AppBar.kt#9igjgp");
        boolean z = ((((i & 14) ^ 6) > 4 && composer.changed(f)) || (i & 6) == 4) | ((((i & LDSFile.EF_DG16_TAG) ^ 48) > 32 && composer.changed(f2)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && composer.changed(f3)) || (i & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = (Function0) new Function0<BottomAppBarState>() { // from class: androidx.compose.material3.AppBarKt$rememberBottomAppBarState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final BottomAppBarState invoke() {
                    return AppBarKt.BottomAppBarState(f, f2, f3);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        BottomAppBarState bottomAppBarState = (BottomAppBarState) RememberSaveableKt.m4181rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return bottomAppBarState;
    }

    public static final BottomAppBarState BottomAppBarState(float f, float f2, float f3) {
        return new BottomAppBarStateImpl(f, f2, f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object settleAppBarBottom(BottomAppBarState bottomAppBarState, float f, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Continuation<? super Velocity> continuation) {
        C12111 c12111;
        final Ref.FloatRef floatRef;
        AnimationSpec<Float> animationSpec2;
        Ref.FloatRef floatRef2;
        final BottomAppBarState bottomAppBarState2 = bottomAppBarState;
        if (continuation instanceof C12111) {
            c12111 = (C12111) continuation;
            if ((c12111.label & Integer.MIN_VALUE) != 0) {
                c12111.label -= Integer.MIN_VALUE;
            } else {
                c12111 = new C12111(continuation);
            }
        }
        C12111 c121112 = c12111;
        Object obj = c121112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c121112.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (bottomAppBarState2.getCollapsedFraction() < 0.01f || bottomAppBarState2.getCollapsedFraction() == 1.0f) {
                return Velocity.m7283boximpl(Velocity.INSTANCE.m7303getZero9UxMQ8M());
            }
            floatRef = new Ref.FloatRef();
            floatRef.element = f;
            if (decayAnimationSpec != null && Math.abs(f) > 1.0f) {
                final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
                Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.AppBarKt.settleAppBarBottom.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        invoke2(animationScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                        float fFloatValue = animationScope.getValue().floatValue() - floatRef3.element;
                        float heightOffset = bottomAppBarState2.getHeightOffset();
                        bottomAppBarState2.setHeightOffset(heightOffset + fFloatValue);
                        float fAbs = Math.abs(heightOffset - bottomAppBarState2.getHeightOffset());
                        floatRef3.element = animationScope.getValue().floatValue();
                        floatRef.element = animationScope.getVelocity().floatValue();
                        if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                            animationScope.cancelAnimation();
                        }
                    }
                };
                c121112.L$0 = bottomAppBarState2;
                animationSpec2 = animationSpec;
                c121112.L$1 = animationSpec2;
                c121112.L$2 = floatRef;
                c121112.label = 1;
                if (SuspendAnimationKt.animateDecay$default(animationStateAnimationState$default, decayAnimationSpec, false, function1, c121112, 2, null) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            animationSpec2 = animationSpec;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                floatRef2 = (Ref.FloatRef) c121112.L$0;
                ResultKt.throwOnFailure(obj);
                floatRef = floatRef2;
                return Velocity.m7283boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
            }
            Ref.FloatRef floatRef4 = (Ref.FloatRef) c121112.L$2;
            AnimationSpec<Float> animationSpec3 = (AnimationSpec) c121112.L$1;
            BottomAppBarState bottomAppBarState3 = (BottomAppBarState) c121112.L$0;
            ResultKt.throwOnFailure(obj);
            floatRef = floatRef4;
            animationSpec2 = animationSpec3;
            bottomAppBarState2 = bottomAppBarState3;
        }
        AnimationSpec<Float> animationSpec4 = animationSpec2;
        if (animationSpec4 != null && bottomAppBarState2.getHeightOffset() < 0.0f && bottomAppBarState2.getHeightOffset() > bottomAppBarState2.getHeightOffsetLimit()) {
            AnimationState animationStateAnimationState$default2 = AnimationStateKt.AnimationState$default(bottomAppBarState2.getHeightOffset(), 0.0f, 0L, 0L, false, 30, null);
            Float fBoxFloat = Boxing.boxFloat(bottomAppBarState2.getCollapsedFraction() < 0.5f ? 0.0f : bottomAppBarState2.getHeightOffsetLimit());
            Function1<AnimationScope<Float, AnimationVector1D>, Unit> function12 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.AppBarKt.settleAppBarBottom.3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                    invoke2(animationScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                    bottomAppBarState2.setHeightOffset(animationScope.getValue().floatValue());
                }
            };
            c121112.L$0 = floatRef;
            c121112.L$1 = null;
            c121112.L$2 = null;
            c121112.label = 2;
            if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default2, fBoxFloat, animationSpec4, false, function12, c121112, 4, null) != coroutine_suspended) {
                floatRef2 = floatRef;
                floatRef = floatRef2;
            }
            return coroutine_suspended;
        }
        return Velocity.m7283boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
    }

    public static final float getBottomAppBarVerticalPadding() {
        return BottomAppBarVerticalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0102  */
    /* renamed from: SingleRowTopAppBar-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2206SingleRowTopAppBarcJHQLPU(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final boolean z, final Function2<? super Composer, ? super Integer, Unit> function22, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, final float f, final WindowInsets windowInsets, final TopAppBarColors topAppBarColors, final TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier.Companion companionDraggable$default;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-342194911);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SingleRowTopAppBar)P(4,7,8,1,5!1,3:c#ui.unit.Dp,9)*1865@85622L7,1866@85690L284,1866@85679L295,1879@86382L321,1887@86744L178,1894@87005L197,1926@88369L1014,1926@88285L1098:AppBar.kt#uh7d8r");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changed(textStyle) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
                    }
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
                        }
                        if ((i2 & 32) != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                        } else if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changed(f) ? 1048576 : 524288;
                        }
                        if ((i2 & 128) == 0) {
                            if ((i & 12582912) == 0) {
                                i3 |= composerStartRestartGroup.changed(windowInsets) ? 8388608 : 4194304;
                            }
                            if ((i2 & 256) == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i3 |= composerStartRestartGroup.changed(topAppBarColors) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            if ((i2 & 512) == 0) {
                                i3 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i3 |= composerStartRestartGroup.changed(topAppBarScrollBehavior) ? PKIFailureInfo.duplicateCertReq : 268435456;
                            }
                            if ((306783379 & i3) != 306783378 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                composer2 = composerStartRestartGroup;
                            } else {
                                if (i4 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-342194911, i3, -1, "androidx.compose.material3.SingleRowTopAppBar (AppBar.kt:1861)");
                                }
                                if (!Float.isNaN(f)) {
                                    if (!(f == Float.POSITIVE_INFINITY)) {
                                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object objConsume = composerStartRestartGroup.consume(localDensity);
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        final float fCoerceAtLeast = RangesKt.coerceAtLeast(((Density) objConsume).mo1127toPx0680j_4(f), 0.0f);
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1193658092, "CC(remember):AppBar.kt#9igjgp");
                                        int i5 = 1879048192 & i3;
                                        boolean zChanged = (i5 == 536870912) | composerStartRestartGroup.changed(fCoerceAtLeast);
                                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$2$1
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
                                                    TopAppBarState state;
                                                    TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                                    if (Intrinsics.areEqual((topAppBarScrollBehavior2 == null || (state = topAppBarScrollBehavior2.getState()) == null) ? null : Float.valueOf(state.getHeightOffsetLimit()), -fCoerceAtLeast)) {
                                                        return;
                                                    }
                                                    TopAppBarScrollBehavior topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                                    TopAppBarState state2 = topAppBarScrollBehavior3 != null ? topAppBarScrollBehavior3.getState() : null;
                                                    if (state2 == null) {
                                                        return;
                                                    }
                                                    state2.setHeightOffsetLimit(-fCoerceAtLeast);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1193635911, "CC(remember):AppBar.kt#9igjgp");
                                        boolean z2 = i5 == 536870912;
                                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$colorTransitionFraction$2$1
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Float invoke() {
                                                    TopAppBarState state;
                                                    TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                                    return Float.valueOf(((topAppBarScrollBehavior2 == null || (state = topAppBarScrollBehavior2.getState()) == null) ? 0.0f : state.getOverlappedFraction()) > 0.01f ? 1.0f : 0.0f);
                                                }
                                            });
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        State<Color> stateM868animateColorAsStateeuL9pac = SingleValueAnimationKt.m868animateColorAsStateeuL9pac(topAppBarColors.m3284containerColorvNxB06k$material3_release(SingleRowTopAppBar_cJHQLPU$lambda$9((State) objRememberedValue2)), AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), null, null, composerStartRestartGroup, 48, 12);
                                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1370231018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$actionsRow$1
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

                                            public final void invoke(Composer composer3, int i6) {
                                                ComposerKt.sourceInformation(composer3, "C1895@87019L173:AppBar.kt#uh7d8r");
                                                if ((i6 & 3) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1370231018, i6, -1, "androidx.compose.material3.SingleRowTopAppBar.<anonymous> (AppBar.kt:1895)");
                                                    }
                                                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                    Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                                    ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                                                    Modifier.Companion companion = Modifier.INSTANCE;
                                                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically, composer3, 54);
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
                                                    Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                    ComposerKt.sourceInformationMarkerStart(composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                                                    function32.invoke(RowScopeInstance.INSTANCE, composer3, 6);
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
                                        }, composerStartRestartGroup, 54);
                                        composerStartRestartGroup.startReplaceGroup(-1193605157);
                                        ComposerKt.sourceInformation(composerStartRestartGroup, "1908@87542L55,1908@87519L78,1909@87631L283");
                                        if (topAppBarScrollBehavior != null && !topAppBarScrollBehavior.getIsPinned()) {
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            Orientation orientation = Orientation.Vertical;
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1193599057, "CC(remember):AppBar.kt#9igjgp");
                                            boolean z3 = i5 == 536870912;
                                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue3 = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$appBarDragModifier$1$1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
                                                        invoke(f2.floatValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(float f2) {
                                                        TopAppBarState state = topAppBarScrollBehavior.getState();
                                                        state.setHeightOffset(state.getHeightOffset() + f2);
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            DraggableState draggableStateRememberDraggableState = DraggableKt.rememberDraggableState((Function1) objRememberedValue3, composerStartRestartGroup, 0);
                                            Modifier.Companion companion2 = companion;
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1193595981, "CC(remember):AppBar.kt#9igjgp");
                                            boolean z4 = i5 == 536870912;
                                            AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1 appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                                            if (z4 || appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                                appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1RememberedValue = new AppBarKt$SingleRowTopAppBar$appBarDragModifier$2$1(topAppBarScrollBehavior, null);
                                                composerStartRestartGroup.updateRememberedValue(appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1RememberedValue);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            companionDraggable$default = DraggableKt.draggable$default(companion2, draggableStateRememberDraggableState, orientation, false, null, false, null, (Function3) appBarKt$SingleRowTopAppBar$appBarDragModifier$2$1RememberedValue, false, 188, null);
                                        } else {
                                            companionDraggable$default = Modifier.INSTANCE;
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        SurfaceKt.m2978SurfaceT9BRK9s(modifier2.then(companionDraggable$default), null, SingleRowTopAppBar_cJHQLPU$lambda$10(stateM868animateColorAsStateeuL9pac), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1943739546, true, new AppBarKt$SingleRowTopAppBar$3(windowInsets, f, topAppBarScrollBehavior, topAppBarColors, function2, textStyle, z, function22, composableLambdaRememberComposableLambda), composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 122);
                                        composer2 = composerStartRestartGroup;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }
                                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite".toString());
                            }
                            final Modifier modifier3 = modifier2;
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$SingleRowTopAppBar$4
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

                                    public final void invoke(Composer composer3, int i6) {
                                        AppBarKt.m2206SingleRowTopAppBarcJHQLPU(modifier3, function2, textStyle, z, function22, function3, f, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 12582912;
                        if ((i2 & 256) == 0) {
                        }
                        if ((i2 & 512) == 0) {
                        }
                        if ((306783379 & i3) != 306783378) {
                            if (i4 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            if (!Float.isNaN(f)) {
                            }
                            throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite".toString());
                        }
                        final Modifier modifier32 = modifier2;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if ((i2 & 128) == 0) {
                    }
                    if ((i2 & 256) == 0) {
                    }
                    if ((i2 & 512) == 0) {
                    }
                    if ((306783379 & i3) != 306783378) {
                    }
                    final Modifier modifier322 = modifier2;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                if ((i2 & 512) == 0) {
                }
                if ((306783379 & i3) != 306783378) {
                }
                final Modifier modifier3222 = modifier2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i2 & 256) == 0) {
            }
            if ((i2 & 512) == 0) {
            }
            if ((306783379 & i3) != 306783378) {
            }
            final Modifier modifier32222 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        if ((i2 & 512) == 0) {
        }
        if ((306783379 & i3) != 306783378) {
        }
        final Modifier modifier322222 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0128  */
    /* renamed from: TwoRowsTopAppBar-nS6u9G4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2209TwoRowsTopAppBarnS6u9G4(Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final float f, final Function2<? super Composer, ? super Integer, Unit> function22, final TextStyle textStyle2, final Function2<? super Composer, ? super Integer, Unit> function23, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, final float f2, final float f3, final WindowInsets windowInsets, final TopAppBarColors topAppBarColors, final TopAppBarScrollBehavior topAppBarScrollBehavior, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        TextStyle textStyle3;
        int i5;
        final Modifier.Companion companion;
        Modifier.Companion companionDraggable$default;
        Composer composer2;
        TopAppBarState state;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1169193376);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TwoRowsTopAppBar)P(4,9,11,10:c#ui.unit.Dp,7,8,5!1,1:c#ui.unit.Dp,3:c#ui.unit.Dp,12)*1984@90586L7,1992@90915L205,1992@90904L216,2008@91751L197,2042@93233L2309,2042@93149L2393:AppBar.kt#uh7d8r");
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                textStyle3 = textStyle;
                i4 |= composerStartRestartGroup.changed(textStyle3) ? 256 : 128;
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
            }
            if ((i3 & 16) != 0) {
                if ((i & 24576) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function22) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                } else if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                    i4 |= composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function23) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= composerStartRestartGroup.changed(f2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((i3 & 512) != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i4 |= composerStartRestartGroup.changed(f3) ? PKIFailureInfo.duplicateCertReq : 268435456;
                }
                if ((i3 & 1024) != 0) {
                    i5 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    i5 = i2 | (composerStartRestartGroup.changed(windowInsets) ? 4 : 2);
                } else {
                    i5 = i2;
                }
                if ((i3 & 2048) != 0) {
                    i5 |= 48;
                } else if ((i2 & 48) == 0) {
                    i5 |= composerStartRestartGroup.changed(topAppBarColors) ? 32 : 16;
                }
                int i7 = i5;
                if ((i3 & 4096) != 0) {
                    i7 |= 384;
                } else if ((i2 & 384) == 0) {
                    i7 |= composerStartRestartGroup.changed(topAppBarScrollBehavior) ? 256 : 128;
                }
                if ((306783379 & i4) != 306783378 || (i7 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
                    companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1169193376, i4, i7, "androidx.compose.material3.TwoRowsTopAppBar (AppBar.kt:1971)");
                    }
                    if (!Float.isNaN(f2)) {
                        if (!(f2 == Float.POSITIVE_INFINITY)) {
                            if (!Float.isNaN(f3)) {
                                if (!(f3 == Float.POSITIVE_INFINITY)) {
                                    if (C1959Dp.m7054compareTo0680j_4(f3, f2) < 0) {
                                        throw new IllegalArgumentException("The expandedHeight is expected to be greater or equal to the collapsedHeight".toString());
                                    }
                                    final Ref.FloatRef floatRef = new Ref.FloatRef();
                                    final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                                    Ref.IntRef intRef = new Ref.IntRef();
                                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume = composerStartRestartGroup.consume(localDensity);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    Density density = (Density) objConsume;
                                    floatRef.element = density.mo1127toPx0680j_4(f3);
                                    floatRef2.element = density.mo1127toPx0680j_4(f2);
                                    intRef.element = density.mo1121roundToPx0680j_4(f);
                                    Unit unit = Unit.INSTANCE;
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1641215730, "CC(remember):AppBar.kt#9igjgp");
                                    int i8 = i7 & 896;
                                    boolean zChanged = (i8 == 256) | composerStartRestartGroup.changed(floatRef2.element) | composerStartRestartGroup.changed(floatRef.element);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$5$1
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
                                                TopAppBarState state2;
                                                TopAppBarScrollBehavior topAppBarScrollBehavior2 = topAppBarScrollBehavior;
                                                if (Intrinsics.areEqual((topAppBarScrollBehavior2 == null || (state2 = topAppBarScrollBehavior2.getState()) == null) ? null : Float.valueOf(state2.getHeightOffsetLimit()), floatRef2.element - floatRef.element)) {
                                                    return;
                                                }
                                                TopAppBarScrollBehavior topAppBarScrollBehavior3 = topAppBarScrollBehavior;
                                                TopAppBarState state3 = topAppBarScrollBehavior3 != null ? topAppBarScrollBehavior3.getState() : null;
                                                if (state3 == null) {
                                                    return;
                                                }
                                                state3.setHeightOffsetLimit(floatRef2.element - floatRef.element);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
                                    float collapsedFraction = (topAppBarScrollBehavior == null || (state = topAppBarScrollBehavior.getState()) == null) ? 0.0f : state.getCollapsedFraction();
                                    long jM3284containerColorvNxB06k$material3_release = topAppBarColors.m3284containerColorvNxB06k$material3_release(collapsedFraction);
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-89435287, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$actionsRow$1
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

                                        public final void invoke(Composer composer3, int i9) {
                                            ComposerKt.sourceInformation(composer3, "C2009@91765L173:AppBar.kt#uh7d8r");
                                            if ((i9 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-89435287, i9, -1, "androidx.compose.material3.TwoRowsTopAppBar.<anonymous> (AppBar.kt:2009)");
                                                }
                                                Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                Function3<RowScope, Composer, Integer, Unit> function32 = function3;
                                                ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically, composer3, 54);
                                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, companion2);
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
                                                Updater.m4095setimpl(composerM4088constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(composer3, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                                                function32.invoke(RowScopeInstance.INSTANCE, composer3, 6);
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
                                    }, composerStartRestartGroup, 54);
                                    float fTransform = TopTitleAlphaEasing.transform(collapsedFraction);
                                    float f4 = 1.0f - collapsedFraction;
                                    boolean z = collapsedFraction < 0.5f;
                                    boolean z2 = !z;
                                    composerStartRestartGroup.startReplaceGroup(1641266888);
                                    ComposerKt.sourceInformation(composerStartRestartGroup, "2028@92709L55,2028@92686L78,2029@92798L283");
                                    if (topAppBarScrollBehavior != null && !topAppBarScrollBehavior.getIsPinned()) {
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        Orientation orientation = Orientation.Vertical;
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1641272988, "CC(remember):AppBar.kt#9igjgp");
                                        boolean z3 = i8 == 256;
                                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = (Function1) new Function1<Float, Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$appBarDragModifier$1$1
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Float f5) {
                                                    invoke(f5.floatValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(float f5) {
                                                    TopAppBarState state2 = topAppBarScrollBehavior.getState();
                                                    state2.setHeightOffset(state2.getHeightOffset() + f5);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        DraggableState draggableStateRememberDraggableState = DraggableKt.rememberDraggableState((Function1) objRememberedValue2, composerStartRestartGroup, 0);
                                        Modifier.Companion companion3 = companion2;
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1641276064, "CC(remember):AppBar.kt#9igjgp");
                                        boolean z4 = i8 == 256;
                                        AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1 appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (z4 || appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                            appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1RememberedValue = new AppBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1(topAppBarScrollBehavior, null);
                                            composerStartRestartGroup.updateRememberedValue(appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1RememberedValue);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        companionDraggable$default = DraggableKt.draggable$default(companion3, draggableStateRememberDraggableState, orientation, false, null, false, null, (Function3) appBarKt$TwoRowsTopAppBar$appBarDragModifier$2$1RememberedValue, false, 188, null);
                                    } else {
                                        companionDraggable$default = Modifier.INSTANCE;
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    composer2 = composerStartRestartGroup;
                                    SurfaceKt.m2978SurfaceT9BRK9s(companion.then(companionDraggable$default), null, jM3284containerColorvNxB06k$material3_release, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1350062619, true, new AppBarKt$TwoRowsTopAppBar$6(windowInsets, f2, topAppBarColors, function22, textStyle2, fTransform, z, function23, composableLambdaRememberComposableLambda, f3, topAppBarScrollBehavior, function2, textStyle3, f4, intRef, z2), composerStartRestartGroup, 54), composer2, 12582912, 122);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }
                            throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite".toString());
                        }
                    }
                    throw new IllegalArgumentException("The collapsedHeight is expected to be specified and finite".toString());
                }
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                companion = modifier2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TwoRowsTopAppBar$7
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

                        public final void invoke(Composer composer3, int i9) {
                            AppBarKt.m2209TwoRowsTopAppBarnS6u9G4(companion, function2, textStyle, f, function22, textStyle2, function23, function3, f2, f3, windowInsets, topAppBarColors, topAppBarScrollBehavior, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 24576;
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            if ((i3 & 1024) != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            int i72 = i5;
            if ((i3 & 4096) != 0) {
            }
            if ((306783379 & i4) != 306783378) {
                if (i6 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!Float.isNaN(f2)) {
                }
                throw new IllegalArgumentException("The collapsedHeight is expected to be specified and finite".toString());
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        textStyle3 = textStyle;
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        if ((i3 & 1024) != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        int i722 = i5;
        if ((i3 & 4096) != 0) {
        }
        if ((306783379 & i4) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TopAppBarLayout-kXwM9vE, reason: not valid java name */
    public static final void m2208TopAppBarLayoutkXwM9vE(final Modifier modifier, final ScrolledOffset scrolledOffset, final long j, final long j2, final long j3, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final float f, final Arrangement.Vertical vertical, final Arrangement.Horizontal horizontal, final int i, final boolean z, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-742442296);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TopAppBarLayout)P(3,6,5:c#ui.graphics.Color,10:c#ui.graphics.Color,0:c#ui.graphics.Color,7,12,8,13,11,9,2,4)2163@98873L5882,2135@97725L7030:AppBar.kt#uh7d8r");
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? composerStartRestartGroup.changed(scrolledOffset) : composerStartRestartGroup.changedInstance(scrolledOffset) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        int i6 = i4;
        if ((i2 & 3072) == 0) {
            i6 |= composerStartRestartGroup.changed(j2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i6 |= composerStartRestartGroup.changed(j3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i6 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i6 |= composerStartRestartGroup.changed(textStyle) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i6 |= composerStartRestartGroup.changed(f) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i6 |= composerStartRestartGroup.changed(vertical) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i6 |= composerStartRestartGroup.changed(horizontal) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (composerStartRestartGroup.changed(i) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(function23) ? 2048 : 1024;
        }
        int i7 = i5;
        if ((i6 & 306783379) != 306783378 || (i7 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-742442296, i6, i7, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:2134)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1539011656, "CC(remember):AppBar.kt#9igjgp");
            boolean z2 = ((1879048192 & i6) == 536870912) | ((i6 & LDSFile.EF_DG16_TAG) == 32 || ((i6 & 64) != 0 && composerStartRestartGroup.changedInstance(scrolledOffset))) | ((234881024 & i6) == 67108864) | ((i7 & 14) == 4);
            MeasurePolicy measurePolicyRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || measurePolicyRememberedValue == Composer.INSTANCE.getEmpty()) {
                measurePolicyRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$1
                    @Override // androidx.compose.p000ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo792measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, final long j4) {
                        int iCoerceAtLeast;
                        int iM7007getMaxHeightimpl;
                        int size = list.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            Measurable measurable = list.get(i8);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "navigationIcon")) {
                                final Placeable placeableMo5931measureBRTryo0 = measurable.mo5931measureBRTryo0(Constraints.m6999copyZbe2FdA$default(j4, 0, 0, 0, 0, 14, null));
                                int size2 = list.size();
                                for (int i9 = 0; i9 < size2; i9++) {
                                    Measurable measurable2 = list.get(i9);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "actionIcons")) {
                                        final Placeable placeableMo5931measureBRTryo02 = measurable2.mo5931measureBRTryo0(Constraints.m6999copyZbe2FdA$default(j4, 0, 0, 0, 0, 14, null));
                                        if (Constraints.m7008getMaxWidthimpl(j4) == Integer.MAX_VALUE) {
                                            iCoerceAtLeast = Constraints.m7008getMaxWidthimpl(j4);
                                        } else {
                                            iCoerceAtLeast = RangesKt.coerceAtLeast((Constraints.m7008getMaxWidthimpl(j4) - placeableMo5931measureBRTryo0.getWidth()) - placeableMo5931measureBRTryo02.getWidth(), 0);
                                        }
                                        int i10 = iCoerceAtLeast;
                                        int size3 = list.size();
                                        for (int i11 = 0; i11 < size3; i11++) {
                                            Measurable measurable3 = list.get(i11);
                                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), MessageBundle.TITLE_ENTRY)) {
                                                final Placeable placeableMo5931measureBRTryo03 = measurable3.mo5931measureBRTryo0(Constraints.m6999copyZbe2FdA$default(j4, 0, i10, 0, 0, 12, null));
                                                final int i12 = placeableMo5931measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) != Integer.MIN_VALUE ? placeableMo5931measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) : 0;
                                                float fOffset = scrolledOffset.offset();
                                                int iRoundToInt = Float.isNaN(fOffset) ? 0 : MathKt.roundToInt(fOffset);
                                                if (Constraints.m7007getMaxHeightimpl(j4) == Integer.MAX_VALUE) {
                                                    iM7007getMaxHeightimpl = Constraints.m7007getMaxHeightimpl(j4);
                                                } else {
                                                    iM7007getMaxHeightimpl = Constraints.m7007getMaxHeightimpl(j4) + iRoundToInt;
                                                }
                                                final int i13 = iM7007getMaxHeightimpl;
                                                int iM7008getMaxWidthimpl = Constraints.m7008getMaxWidthimpl(j4);
                                                final Arrangement.Horizontal horizontal2 = horizontal;
                                                final Arrangement.Vertical vertical2 = vertical;
                                                final int i14 = i;
                                                return MeasureScope.layout$default(measureScope, iM7008getMaxWidthimpl, i13, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2$1.1
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
                                                        int iMax;
                                                        int i15;
                                                        int height;
                                                        int iM7008getMaxWidthimpl2;
                                                        Placeable placeable = placeableMo5931measureBRTryo0;
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, (i13 - placeable.getHeight()) / 2, 0.0f, 4, null);
                                                        Placeable placeable2 = placeableMo5931measureBRTryo03;
                                                        Arrangement.Horizontal horizontal3 = horizontal2;
                                                        if (Intrinsics.areEqual(horizontal3, Arrangement.INSTANCE.getCenter())) {
                                                            iMax = (Constraints.m7008getMaxWidthimpl(j4) - placeableMo5931measureBRTryo03.getWidth()) / 2;
                                                            if (iMax < placeableMo5931measureBRTryo0.getWidth()) {
                                                                iM7008getMaxWidthimpl2 = placeableMo5931measureBRTryo0.getWidth() - iMax;
                                                            } else if (placeableMo5931measureBRTryo03.getWidth() + iMax > Constraints.m7008getMaxWidthimpl(j4) - placeableMo5931measureBRTryo02.getWidth()) {
                                                                iM7008getMaxWidthimpl2 = (Constraints.m7008getMaxWidthimpl(j4) - placeableMo5931measureBRTryo02.getWidth()) - (placeableMo5931measureBRTryo03.getWidth() + iMax);
                                                            }
                                                            iMax += iM7008getMaxWidthimpl2;
                                                        } else if (!Intrinsics.areEqual(horizontal3, Arrangement.INSTANCE.getEnd())) {
                                                            iMax = Math.max(measureScope.mo1121roundToPx0680j_4(AppBarKt.TopAppBarTitleInset), placeableMo5931measureBRTryo0.getWidth());
                                                        } else {
                                                            iMax = (Constraints.m7008getMaxWidthimpl(j4) - placeableMo5931measureBRTryo03.getWidth()) - placeableMo5931measureBRTryo02.getWidth();
                                                        }
                                                        int i16 = iMax;
                                                        Arrangement.Vertical vertical3 = vertical2;
                                                        if (Intrinsics.areEqual(vertical3, Arrangement.INSTANCE.getCenter())) {
                                                            height = (i13 - placeableMo5931measureBRTryo03.getHeight()) / 2;
                                                        } else {
                                                            if (!Intrinsics.areEqual(vertical3, Arrangement.INSTANCE.getBottom())) {
                                                                i15 = 0;
                                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i16, i15, 0.0f, 4, null);
                                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5931measureBRTryo02, Constraints.m7008getMaxWidthimpl(j4) - placeableMo5931measureBRTryo02.getWidth(), (i13 - placeableMo5931measureBRTryo02.getHeight()) / 2, 0.0f, 4, null);
                                                            }
                                                            int i17 = i14;
                                                            if (i17 == 0) {
                                                                height = i13 - placeableMo5931measureBRTryo03.getHeight();
                                                            } else {
                                                                int height2 = i17 - (placeableMo5931measureBRTryo03.getHeight() - i12);
                                                                int height3 = placeableMo5931measureBRTryo03.getHeight() + height2;
                                                                if (height3 > Constraints.m7007getMaxHeightimpl(j4)) {
                                                                    height2 -= height3 - Constraints.m7007getMaxHeightimpl(j4);
                                                                }
                                                                height = (i13 - placeableMo5931measureBRTryo03.getHeight()) - Math.max(0, height2);
                                                            }
                                                        }
                                                        i15 = height;
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i16, i15, 0.0f, 4, null);
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5931measureBRTryo02, Constraints.m7008getMaxWidthimpl(j4) - placeableMo5931measureBRTryo02.getWidth(), (i13 - placeableMo5931measureBRTryo02.getHeight()) / 2, 0.0f, 4, null);
                                                    }
                                                }, 4, null);
                                            }
                                        }
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(measurePolicyRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) measurePolicyRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
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
            Updater.m4095setimpl(composerM4088constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 9049318, "C2137@97755L280,2143@98048L502,2155@98563L264:AppBar.kt#uh7d8r");
            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, "navigationIcon");
            float f2 = TopAppBarHorizontalPadding;
            Modifier modifierM1439paddingqDBjuR0$default = PaddingKt.m1439paddingqDBjuR0$default(modifierLayoutId, f2, 0.0f, 0.0f, 0.0f, 14, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int i8 = i6;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1439paddingqDBjuR0$default);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 249765716, "C2138@97858L163:AppBar.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4585boximpl(j)), function22, composerStartRestartGroup, ProvidedValue.$stable | ((i7 >> 3) & LDSFile.EF_DG16_TAG));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Modifier modifierM1437paddingVpY3zN4$default = PaddingKt.m1437paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, MessageBundle.TITLE_ENTRY), f2, 0.0f, 2, null);
            Modifier.Companion companionClearAndSetSemantics = Modifier.INSTANCE;
            if (z) {
                companionClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companionClearAndSetSemantics, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$1$2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }
                });
            }
            Modifier modifierM4756graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m4756graphicsLayerAp8cVGQ$default(modifierM1437paddingVpY3zN4$default.then(companionClearAndSetSemantics), 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131067, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM4756graphicsLayerAp8cVGQ$default);
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
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 250255454, "C2149@98351L185:AppBar.kt#uh7d8r");
            int i9 = i8 >> 9;
            ProvideContentColorTextStyleKt.m3338ProvideContentColorTextStyle3JVO9M(j2, textStyle, function2, composerStartRestartGroup, (i9 & 14) | ((i8 >> 15) & LDSFile.EF_DG16_TAG) | (i9 & 896));
            composer2 = composerStartRestartGroup;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Modifier modifierM1439paddingqDBjuR0$default2 = PaddingKt.m1439paddingqDBjuR0$default(LayoutIdKt.layoutId(Modifier.INSTANCE, "actionIcons"), 0.0f, 0.0f, f2, 0.0f, 11, null);
            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM1439paddingqDBjuR0$default2);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            Composer composerM4088constructorimpl4 = Updater.m4088constructorimpl(composer2);
            Updater.m4095setimpl(composerM4088constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4095setimpl(composerM4088constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4088constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM4088constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM4088constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m4095setimpl(composerM4088constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer2, 250561951, "C2156@98661L152:AppBar.kt#uh7d8r");
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4585boximpl(j3)), function23, composer2, ProvidedValue.$stable | ((i7 >> 6) & LDSFile.EF_DG16_TAG));
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$3
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
                    AppBarKt.m2208TopAppBarLayoutkXwM9vE(modifier, scrolledOffset, j, j2, j3, function2, textStyle, f, vertical, horizontal, i, z, function22, function23, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object settleAppBar(TopAppBarState topAppBarState, float f, DecayAnimationSpec<Float> decayAnimationSpec, AnimationSpec<Float> animationSpec, Continuation<? super Velocity> continuation) {
        C12081 c12081;
        final Ref.FloatRef floatRef;
        AnimationSpec<Float> animationSpec2;
        Ref.FloatRef floatRef2;
        final TopAppBarState topAppBarState2 = topAppBarState;
        if (continuation instanceof C12081) {
            c12081 = (C12081) continuation;
            if ((c12081.label & Integer.MIN_VALUE) != 0) {
                c12081.label -= Integer.MIN_VALUE;
            } else {
                c12081 = new C12081(continuation);
            }
        }
        C12081 c120812 = c12081;
        Object obj = c120812.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c120812.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (topAppBarState2.getCollapsedFraction() < 0.01f || topAppBarState2.getCollapsedFraction() == 1.0f) {
                return Velocity.m7283boximpl(Velocity.INSTANCE.m7303getZero9UxMQ8M());
            }
            floatRef = new Ref.FloatRef();
            floatRef.element = f;
            if (decayAnimationSpec != null && Math.abs(f) > 1.0f) {
                final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(0.0f, f, 0L, 0L, false, 28, null);
                Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.AppBarKt.settleAppBar.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        invoke2(animationScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                        float fFloatValue = animationScope.getValue().floatValue() - floatRef3.element;
                        float heightOffset = topAppBarState2.getHeightOffset();
                        topAppBarState2.setHeightOffset(heightOffset + fFloatValue);
                        float fAbs = Math.abs(heightOffset - topAppBarState2.getHeightOffset());
                        floatRef3.element = animationScope.getValue().floatValue();
                        floatRef.element = animationScope.getVelocity().floatValue();
                        if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                            animationScope.cancelAnimation();
                        }
                    }
                };
                c120812.L$0 = topAppBarState2;
                animationSpec2 = animationSpec;
                c120812.L$1 = animationSpec2;
                c120812.L$2 = floatRef;
                c120812.label = 1;
                if (SuspendAnimationKt.animateDecay$default(animationStateAnimationState$default, decayAnimationSpec, false, function1, c120812, 2, null) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            animationSpec2 = animationSpec;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                floatRef2 = (Ref.FloatRef) c120812.L$0;
                ResultKt.throwOnFailure(obj);
                floatRef = floatRef2;
                return Velocity.m7283boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
            }
            Ref.FloatRef floatRef4 = (Ref.FloatRef) c120812.L$2;
            AnimationSpec<Float> animationSpec3 = (AnimationSpec) c120812.L$1;
            TopAppBarState topAppBarState3 = (TopAppBarState) c120812.L$0;
            ResultKt.throwOnFailure(obj);
            floatRef = floatRef4;
            animationSpec2 = animationSpec3;
            topAppBarState2 = topAppBarState3;
        }
        AnimationSpec<Float> animationSpec4 = animationSpec2;
        if (animationSpec4 != null && topAppBarState2.getHeightOffset() < 0.0f && topAppBarState2.getHeightOffset() > topAppBarState2.getHeightOffsetLimit()) {
            AnimationState animationStateAnimationState$default2 = AnimationStateKt.AnimationState$default(topAppBarState2.getHeightOffset(), 0.0f, 0L, 0L, false, 30, null);
            Float fBoxFloat = Boxing.boxFloat(topAppBarState2.getCollapsedFraction() < 0.5f ? 0.0f : topAppBarState2.getHeightOffsetLimit());
            Function1<AnimationScope<Float, AnimationVector1D>, Unit> function12 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.material3.AppBarKt.settleAppBar.3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                    invoke2(animationScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                    topAppBarState2.setHeightOffset(animationScope.getValue().floatValue());
                }
            };
            c120812.L$0 = floatRef;
            c120812.L$1 = null;
            c120812.L$2 = null;
            c120812.label = 2;
            if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default2, fBoxFloat, animationSpec4, false, function12, c120812, 4, null) != coroutine_suspended) {
                floatRef2 = floatRef;
                floatRef = floatRef2;
            }
            return coroutine_suspended;
        }
        return Velocity.m7283boximpl(VelocityKt.Velocity(0.0f, floatRef.element));
    }

    public static final CubicBezierEasing getTopTitleAlphaEasing() {
        return TopTitleAlphaEasing;
    }

    private static final float SingleRowTopAppBar_cJHQLPU$lambda$9(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final long SingleRowTopAppBar_cJHQLPU$lambda$10(State<Color> state) {
        return state.getValue().m4605unboximpl();
    }

    static {
        float f = 16;
        float f2 = 12;
        float fM7055constructorimpl = C1959Dp.m7055constructorimpl(C1959Dp.m7055constructorimpl(f) - C1959Dp.m7055constructorimpl(f2));
        BottomAppBarHorizontalPadding = fM7055constructorimpl;
        float fM7055constructorimpl2 = C1959Dp.m7055constructorimpl(C1959Dp.m7055constructorimpl(f) - C1959Dp.m7055constructorimpl(f2));
        BottomAppBarVerticalPadding = fM7055constructorimpl2;
        FABHorizontalPadding = C1959Dp.m7055constructorimpl(C1959Dp.m7055constructorimpl(f) - fM7055constructorimpl);
        FABVerticalPadding = C1959Dp.m7055constructorimpl(C1959Dp.m7055constructorimpl(f2) - fM7055constructorimpl2);
        TopTitleAlphaEasing = new CubicBezierEasing(0.8f, 0.0f, 0.8f, 0.15f);
        MediumTitleBottomPadding = C1959Dp.m7055constructorimpl(24);
        LargeTitleBottomPadding = C1959Dp.m7055constructorimpl(28);
        float fM7055constructorimpl3 = C1959Dp.m7055constructorimpl(4);
        TopAppBarHorizontalPadding = fM7055constructorimpl3;
        TopAppBarTitleInset = C1959Dp.m7055constructorimpl(C1959Dp.m7055constructorimpl(f) - fM7055constructorimpl3);
    }
}
