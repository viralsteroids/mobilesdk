package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.material3.tokens.FilterChipTokens;
import androidx.compose.material3.tokens.InputChipTokens;
import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p000ui.graphics.GraphicsLayerScope;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.layout.LayoutIdKt;
import androidx.compose.p000ui.layout.Measurable;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.layout.MeasureResult;
import androidx.compose.p000ui.layout.MeasureScope;
import androidx.compose.p000ui.layout.Placeable;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.semantics.Role;
import androidx.compose.p000ui.semantics.SemanticsModifierKt;
import androidx.compose.p000ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p000ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.p000ui.unit.Constraints;
import androidx.compose.p000ui.unit.ConstraintsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jmrtd.lds.LDSFile;

/* compiled from: Chip.kt */
@Metadata(m513d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a¨\u0001\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0002\u0010%\u001a¦\u0001\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\u0010'\u001a»\u0001\u0010(\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00012\b\u0010#\u001a\u0004\u0018\u00010$H\u0003ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a\u0094\u0001\u00101\u001a\u00020\u00112\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0006\u00103\u001a\u00020,2\u0006\u00104\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0001H\u0003ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a¨\u0001\u00107\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0002\u0010%\u001a¦\u0001\u00107\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\u0010'\u001a°\u0001\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020:2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0002\u0010<\u001a\u0091\u0001\u0010=\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010>\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0002\u0010?\u001a\u008f\u0001\u0010=\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010>\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\u0010@\u001a°\u0001\u0010A\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020:2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0002\u0010<\u001aÇ\u0001\u0010B\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020:2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010;2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0002\u0010C\u001aÐ\u0001\u0010D\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\u0006\u0010)\u001a\u00020*2\u0013\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0013\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020:2\b\u0010\u001f\u001a\u0004\u0018\u00010;2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00012\b\u0010#\u001a\u0004\u0018\u00010$H\u0003ø\u0001\u0000¢\u0006\u0004\bE\u0010F\u001a\u0091\u0001\u0010G\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010>\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0002\u0010?\u001a\u008f\u0001\u0010G\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0015\b\u0002\u0010>\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010#\u001a\u00020$H\u0007¢\u0006\u0002\u0010@\u001a&\u0010H\u001a\u00020\u00012\b\b\u0002\u0010I\u001a\u00020\u00192\b\b\u0002\u0010J\u001a\u00020\u00192\b\b\u0002\u0010K\u001a\u00020\u0019H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u000b\u001a\u00020\f*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006L"}, m514d2 = {"AssistChipPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "FilterChipPadding", "HorizontalElementsPadding", "Landroidx/compose/ui/unit/Dp;", "F", "LabelLayoutId", "", "LeadingIconLayoutId", "SuggestionChipPadding", "TrailingIconLayoutId", "defaultSuggestionChipColors", "Landroidx/compose/material3/ChipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultSuggestionChipColors", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ChipColors;", "AssistChip", "", "onClick", "Lkotlin/Function0;", "label", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", ChipKt.LeadingIconLayoutId, ChipKt.TrailingIconLayoutId, "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "elevation", "Landroidx/compose/material3/ChipElevation;", "border", "Landroidx/compose/foundation/BorderStroke;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/material3/ChipBorder;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "Chip", "labelTextStyle", "Landroidx/compose/ui/text/TextStyle;", "labelColor", "Landroidx/compose/ui/graphics/Color;", "minHeight", "paddingValues", "Chip-nkUnTEs", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "ChipContent", "avatar", "leadingIconColor", "trailingIconColor", "ChipContent-fe0OD_I", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "ElevatedAssistChip", "ElevatedFilterChip", "selected", "Landroidx/compose/material3/SelectableChipColors;", "Landroidx/compose/material3/SelectableChipElevation;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "ElevatedSuggestionChip", "icon", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "FilterChip", "InputChip", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "SelectableChip", "SelectableChip-u0RnIRE", "(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "SuggestionChip", "inputChipPadding", "hasAvatar", "hasLeadingIcon", "hasTrailingIcon", "material3_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class ChipKt {
    private static final PaddingValues AssistChipPadding;
    private static final PaddingValues FilterChipPadding;
    private static final float HorizontalElementsPadding;
    private static final String LabelLayoutId = "label";
    private static final String LeadingIconLayoutId = "leadingIcon";
    private static final PaddingValues SuggestionChipPadding;
    private static final String TrailingIconLayoutId = "trailingIcon";

    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AssistChip(final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i7;
        ChipColors chipColorsAssistChipColors;
        int i8;
        int i9;
        int i10;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Shape shape2;
        int i11;
        Modifier modifier3;
        int i12;
        int i13;
        ChipElevation chipElevationM2218assistChipElevationaqJV_2Y;
        boolean z3;
        BorderStroke borderStrokeM2216assistChipBorderh1eTWw;
        int i14;
        MutableInteractionSource mutableInteractionSource2;
        BorderStroke borderStroke2;
        int i15;
        Shape shape3;
        ChipElevation chipElevation2;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Modifier modifier4;
        Composer composer2;
        final Modifier modifier5;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Shape shape4;
        final ChipColors chipColors2;
        final ChipElevation chipElevation3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(313450168);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AssistChip)P(8,5,7,3,6,10,9,1,2)126@6277L5,127@6328L18,128@6399L21,129@6469L25,137@6729L5,132@6561L541:Chip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            function24 = function2;
        } else {
            function24 = function2;
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function24) ? 32 : 16;
            }
        }
        int i16 = i3 & 4;
        if (i16 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 == 0) {
                    if ((i & 24576) == 0) {
                        function25 = function22;
                        i4 |= composerStartRestartGroup.changedInstance(function25) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                    } else if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(shape)) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i3 & 128) == 0) {
                            chipColorsAssistChipColors = chipColors;
                            int i17 = composerStartRestartGroup.changed(chipColorsAssistChipColors) ? 8388608 : 4194304;
                            i4 |= i17;
                        } else {
                            chipColorsAssistChipColors = chipColors;
                        }
                        i4 |= i17;
                    } else {
                        chipColorsAssistChipColors = chipColors;
                    }
                    if ((i & 100663296) == 0) {
                        i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(chipElevation)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i & 805306368) == 0) {
                        i4 |= ((i3 & 512) == 0 && composerStartRestartGroup.changed(borderStroke)) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    }
                    i8 = i3 & 1024;
                    if (i8 == 0) {
                        i9 = i8;
                        i10 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i9 = i8;
                        i10 = i2 | (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                    } else {
                        i9 = i8;
                        i10 = i2;
                    }
                    int i18 = i4;
                    if ((i4 & 306783379) != 306783378 && (i10 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        function29 = function23;
                        chipElevation3 = chipElevation;
                        mutableInteractionSource3 = mutableInteractionSource;
                        z4 = z2;
                        composer2 = composerStartRestartGroup;
                        shape4 = shape;
                        chipColors2 = chipColorsAssistChipColors;
                        modifier5 = modifier2;
                        function28 = function25;
                        borderStroke3 = borderStroke;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        int i19 = i10;
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i16 == 0 ? Modifier.INSTANCE : modifier2;
                            boolean z5 = i5 == 0 ? true : z2;
                            function26 = i6 == 0 ? null : function25;
                            Function2<? super Composer, ? super Integer, Unit> function210 = i7 == 0 ? null : function23;
                            if ((i3 & 64) == 0) {
                                i11 = i18 & (-3670017);
                                shape2 = AssistChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            } else {
                                shape2 = shape;
                                i11 = i18;
                            }
                            if ((i3 & 128) != 0) {
                                chipColorsAssistChipColors = AssistChipDefaults.INSTANCE.assistChipColors(composerStartRestartGroup, 6);
                                i11 &= -29360129;
                            }
                            ChipColors chipColors3 = chipColorsAssistChipColors;
                            int i20 = i11;
                            if ((i3 & 256) == 0) {
                                modifier3 = companion;
                                i13 = i19;
                                i12 = 6;
                                i20 &= -234881025;
                                chipElevationM2218assistChipElevationaqJV_2Y = AssistChipDefaults.INSTANCE.m2218assistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            } else {
                                modifier3 = companion;
                                i12 = 6;
                                i13 = i19;
                                chipElevationM2218assistChipElevationaqJV_2Y = chipElevation;
                            }
                            if ((i3 & 512) == 0) {
                                z3 = z5;
                                borderStrokeM2216assistChipBorderh1eTWw = AssistChipDefaults.INSTANCE.m2216assistChipBorderh1eTWw(z3, 0L, 0L, 0.0f, composerStartRestartGroup, ((i20 >> 9) & 14) | 24576, 14);
                                i14 = i20 & (-1879048193);
                            } else {
                                z3 = z5;
                                borderStrokeM2216assistChipBorderh1eTWw = borderStroke;
                                i14 = i20;
                            }
                            if (i9 == 0) {
                                borderStroke2 = borderStrokeM2216assistChipBorderh1eTWw;
                                i15 = i14;
                                shape3 = shape2;
                                chipElevation2 = chipElevationM2218assistChipElevationaqJV_2Y;
                                mutableInteractionSource2 = null;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                                borderStroke2 = borderStrokeM2216assistChipBorderh1eTWw;
                                i15 = i14;
                                shape3 = shape2;
                                chipElevation2 = chipElevationM2218assistChipElevationaqJV_2Y;
                            }
                            chipColorsAssistChipColors = chipColors3;
                            function27 = function210;
                            modifier4 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            int i21 = (i3 & 64) != 0 ? i18 & (-3670017) : i18;
                            if ((i3 & 128) != 0) {
                                i21 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i21 &= -234881025;
                            }
                            if ((i3 & 512) != 0) {
                                i21 &= -1879048193;
                            }
                            function27 = function23;
                            shape3 = shape;
                            chipElevation2 = chipElevation;
                            borderStroke2 = borderStroke;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i15 = i21;
                            i12 = 6;
                            modifier4 = modifier2;
                            z3 = z2;
                            function26 = function25;
                            i13 = i19;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(313450168, i15, i13, "androidx.compose.material3.AssistChip (Chip.kt:132)");
                        }
                        TextStyle value = TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, i12);
                        long jM2299labelColorvNxB06k$material3_release = chipColorsAssistChipColors.m2299labelColorvNxB06k$material3_release(z3);
                        float fM2221getHeightD9Ej5fM = AssistChipDefaults.INSTANCE.m2221getHeightD9Ej5fM();
                        PaddingValues paddingValues = AssistChipPadding;
                        int i22 = i15 << 6;
                        int i23 = ((i15 >> 6) & 14) | ((i15 << 3) & LDSFile.EF_DG16_TAG) | ((i15 >> 3) & 896) | (i22 & 7168) | (3670016 & i22) | (29360128 & i22) | (234881024 & i22) | (i22 & 1879048192);
                        int i24 = i15 >> 24;
                        boolean z6 = z3;
                        ChipColors chipColors4 = chipColorsAssistChipColors;
                        m2308ChipnkUnTEs(modifier4, function0, z6, function24, value, jM2299labelColorvNxB06k$material3_release, function26, function27, shape3, chipColors4, chipElevation2, borderStroke2, fM2221getHeightD9Ej5fM, paddingValues, mutableInteractionSource2, composerStartRestartGroup, i23, (i24 & LDSFile.EF_DG16_TAG) | (i24 & 14) | 3456 | ((i13 << 12) & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2 = composerStartRestartGroup;
                        modifier5 = modifier4;
                        z4 = z6;
                        function28 = function26;
                        function29 = function27;
                        shape4 = shape3;
                        chipColors2 = chipColors4;
                        chipElevation3 = chipElevation2;
                        borderStroke3 = borderStroke2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.AssistChip.1
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
                                ChipKt.AssistChip(function0, function2, modifier5, z4, function28, function29, shape4, chipColors2, chipElevation3, borderStroke3, mutableInteractionSource3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 24576;
                function25 = function22;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i8 = i3 & 1024;
                if (i8 == 0) {
                }
                int i182 = i4;
                if ((i4 & 306783379) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    int i192 = i10;
                    if ((i & 1) != 0) {
                        if (i16 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i3 & 64) == 0) {
                        }
                        if ((i3 & 128) != 0) {
                        }
                        ChipColors chipColors32 = chipColorsAssistChipColors;
                        int i202 = i11;
                        if ((i3 & 256) == 0) {
                        }
                        if ((i3 & 512) == 0) {
                        }
                        if (i9 == 0) {
                        }
                        chipColorsAssistChipColors = chipColors32;
                        function27 = function210;
                        modifier4 = modifier3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        TextStyle value2 = TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, i12);
                        long jM2299labelColorvNxB06k$material3_release2 = chipColorsAssistChipColors.m2299labelColorvNxB06k$material3_release(z3);
                        float fM2221getHeightD9Ej5fM2 = AssistChipDefaults.INSTANCE.m2221getHeightD9Ej5fM();
                        PaddingValues paddingValues2 = AssistChipPadding;
                        int i222 = i15 << 6;
                        int i232 = ((i15 >> 6) & 14) | ((i15 << 3) & LDSFile.EF_DG16_TAG) | ((i15 >> 3) & 896) | (i222 & 7168) | (3670016 & i222) | (29360128 & i222) | (234881024 & i222) | (i222 & 1879048192);
                        int i242 = i15 >> 24;
                        boolean z62 = z3;
                        ChipColors chipColors42 = chipColorsAssistChipColors;
                        m2308ChipnkUnTEs(modifier4, function0, z62, function24, value2, jM2299labelColorvNxB06k$material3_release2, function26, function27, shape3, chipColors42, chipElevation2, borderStroke2, fM2221getHeightD9Ej5fM2, paddingValues2, mutableInteractionSource2, composerStartRestartGroup, i232, (i242 & LDSFile.EF_DG16_TAG) | (i242 & 14) | 3456 | ((i13 << 12) & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = composerStartRestartGroup;
                        modifier5 = modifier4;
                        z4 = z62;
                        function28 = function26;
                        function29 = function27;
                        shape4 = shape3;
                        chipColors2 = chipColors42;
                        chipElevation3 = chipElevation2;
                        borderStroke3 = borderStroke2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 == 0) {
            }
            function25 = function22;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i8 = i3 & 1024;
            if (i8 == 0) {
            }
            int i1822 = i4;
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        function25 = function22;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i8 = i3 & 1024;
        if (i8 == 0) {
        }
        int i18222 = i4;
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with AssistChip that take a BorderStroke instead", replaceWith = @ReplaceWith(expression = "AssistChip(onClick, label, modifier, enabled,leadingIcon, trailingIcon, shape, colors, elevation, border, interactionSource", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void AssistChip(final Function0 function0, final Function2 function2, Modifier modifier, boolean z, Function2 function22, Function2 function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function2 function24;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        Function2 function25;
        int i7;
        ChipColors chipColorsAssistChipColors;
        int i8;
        int i9;
        int i10;
        Function2 function26;
        Shape shape2;
        int i11;
        Modifier modifier3;
        int i12;
        Composer composer2;
        int i13;
        ChipElevation chipElevationM2218assistChipElevationaqJV_2Y;
        ChipBorder chipBorderM2215assistChipBorderd_3_b6Q;
        int i14;
        MutableInteractionSource mutableInteractionSource2;
        ChipElevation chipElevation2;
        Shape shape3;
        Function2 function27;
        Modifier modifier4;
        Composer composer3;
        final ChipBorder chipBorder2;
        final Modifier modifier5;
        final boolean z3;
        final Function2 function28;
        final Function2 function29;
        final Shape shape4;
        final ChipColors chipColors2;
        final ChipElevation chipElevation3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1932300596);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AssistChip)P(8,5,7,3,6,10,9,1,2)213@10395L5,214@10446L18,215@10517L21,216@10585L18,217@10655L39,224@10872L5,219@10704L571:Chip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            function24 = function2;
        } else {
            function24 = function2;
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function24) ? 32 : 16;
            }
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 == 0) {
                    if ((i & 24576) == 0) {
                        function25 = function22;
                        i4 |= composerStartRestartGroup.changedInstance(function25) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                    } else if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(shape)) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i3 & 128) == 0) {
                            chipColorsAssistChipColors = chipColors;
                            int i16 = composerStartRestartGroup.changed(chipColorsAssistChipColors) ? 8388608 : 4194304;
                            i4 |= i16;
                        } else {
                            chipColorsAssistChipColors = chipColors;
                        }
                        i4 |= i16;
                    } else {
                        chipColorsAssistChipColors = chipColors;
                    }
                    if ((i & 100663296) == 0) {
                        i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(chipElevation)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i & 805306368) == 0) {
                        i4 |= ((i3 & 512) == 0 && composerStartRestartGroup.changed(chipBorder)) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    }
                    i8 = i3 & 1024;
                    if (i8 == 0) {
                        i9 = i8;
                        i10 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i9 = i8;
                        i10 = i2 | (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                    } else {
                        i9 = i8;
                        i10 = i2;
                    }
                    int i17 = i4;
                    if ((i4 & 306783379) != 306783378 && (i10 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        function29 = function23;
                        chipElevation3 = chipElevation;
                        mutableInteractionSource3 = mutableInteractionSource;
                        composer3 = composerStartRestartGroup;
                        z3 = z2;
                        shape4 = shape;
                        chipColors2 = chipColorsAssistChipColors;
                        modifier5 = modifier2;
                        function28 = function25;
                        chipBorder2 = chipBorder;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        int i18 = i10;
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i15 == 0 ? Modifier.INSTANCE : modifier2;
                            boolean z4 = i5 == 0 ? true : z2;
                            function26 = i6 == 0 ? null : function25;
                            Function2 function210 = i7 == 0 ? null : function23;
                            if ((i3 & 64) == 0) {
                                i11 = i17 & (-3670017);
                                shape2 = AssistChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            } else {
                                shape2 = shape;
                                i11 = i17;
                            }
                            if ((i3 & 128) != 0) {
                                chipColorsAssistChipColors = AssistChipDefaults.INSTANCE.assistChipColors(composerStartRestartGroup, 6);
                                i11 &= -29360129;
                            }
                            ChipColors chipColors3 = chipColorsAssistChipColors;
                            int i19 = i11;
                            if ((i3 & 256) == 0) {
                                composer2 = composerStartRestartGroup;
                                modifier3 = companion;
                                i12 = 6;
                                i13 = i18;
                                i19 &= -234881025;
                                chipElevationM2218assistChipElevationaqJV_2Y = AssistChipDefaults.INSTANCE.m2218assistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, 1572864, 63);
                            } else {
                                modifier3 = companion;
                                i12 = 6;
                                composer2 = composerStartRestartGroup;
                                i13 = i18;
                                chipElevationM2218assistChipElevationaqJV_2Y = chipElevation;
                            }
                            if ((i3 & 512) == 0) {
                                composerStartRestartGroup = composer2;
                                chipBorderM2215assistChipBorderd_3_b6Q = AssistChipDefaults.INSTANCE.m2215assistChipBorderd_3_b6Q(0L, 0L, 0.0f, composerStartRestartGroup, 3072, 7);
                                i14 = i19 & (-1879048193);
                            } else {
                                composerStartRestartGroup = composer2;
                                chipBorderM2215assistChipBorderd_3_b6Q = chipBorder;
                                i14 = i19;
                            }
                            if (i9 == 0) {
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 267303551, "CC(remember):Chip.kt#9igjgp");
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            chipElevation2 = chipElevationM2218assistChipElevationaqJV_2Y;
                            shape3 = shape2;
                            z2 = z4;
                            chipColorsAssistChipColors = chipColors3;
                            function27 = function210;
                            modifier4 = modifier3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            int i20 = (i3 & 64) != 0 ? i17 & (-3670017) : i17;
                            if ((i3 & 128) != 0) {
                                i20 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i20 &= -234881025;
                            }
                            if ((i3 & 512) != 0) {
                                i20 &= -1879048193;
                            }
                            function27 = function23;
                            shape3 = shape;
                            chipElevation2 = chipElevation;
                            chipBorderM2215assistChipBorderd_3_b6Q = chipBorder;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i12 = 6;
                            modifier4 = modifier2;
                            function26 = function25;
                            i14 = i20;
                            i13 = i18;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1932300596, i14, i13, "androidx.compose.material3.AssistChip (Chip.kt:219)");
                        }
                        TextStyle value = TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, i12);
                        long jM2299labelColorvNxB06k$material3_release = chipColorsAssistChipColors.m2299labelColorvNxB06k$material3_release(z2);
                        composerStartRestartGroup.startReplaceGroup(267317901);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "231@11104L21");
                        State<BorderStroke> stateBorderStroke$material3_release = chipBorderM2215assistChipBorderd_3_b6Q != null ? null : chipBorderM2215assistChipBorderd_3_b6Q.borderStroke$material3_release(z2, composerStartRestartGroup, ((i14 >> 9) & 14) | ((i14 >> 24) & LDSFile.EF_DG16_TAG));
                        composerStartRestartGroup.endReplaceGroup();
                        int i21 = i14 << 6;
                        ChipColors chipColors4 = chipColorsAssistChipColors;
                        composer3 = composerStartRestartGroup;
                        boolean z5 = z2;
                        m2308ChipnkUnTEs(modifier4, function0, z5, function24, value, jM2299labelColorvNxB06k$material3_release, function26, function27, shape3, chipColors4, chipElevation2, stateBorderStroke$material3_release != null ? stateBorderStroke$material3_release.getValue() : null, AssistChipDefaults.INSTANCE.m2221getHeightD9Ej5fM(), AssistChipPadding, mutableInteractionSource2, composer3, ((i14 >> 6) & 14) | ((i14 << 3) & LDSFile.EF_DG16_TAG) | ((i14 >> 3) & 896) | (i21 & 7168) | (3670016 & i21) | (29360128 & i21) | (234881024 & i21) | (i21 & 1879048192), ((i14 >> 24) & 14) | 3456 | ((i13 << 12) & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        chipBorder2 = chipBorderM2215assistChipBorderd_3_b6Q;
                        modifier5 = modifier4;
                        z3 = z5;
                        function28 = function26;
                        function29 = function27;
                        shape4 = shape3;
                        chipColors2 = chipColors4;
                        chipElevation3 = chipElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.AssistChip.3
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

                            public final void invoke(Composer composer4, int i22) {
                                ChipKt.AssistChip(function0, function2, modifier5, z3, function28, function29, shape4, chipColors2, chipElevation3, chipBorder2, mutableInteractionSource3, composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 24576;
                function25 = function22;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i8 = i3 & 1024;
                if (i8 == 0) {
                }
                int i172 = i4;
                if ((i4 & 306783379) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    int i182 = i10;
                    if ((i & 1) != 0) {
                        if (i15 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i3 & 64) == 0) {
                        }
                        if ((i3 & 128) != 0) {
                        }
                        ChipColors chipColors32 = chipColorsAssistChipColors;
                        int i192 = i11;
                        if ((i3 & 256) == 0) {
                        }
                        if ((i3 & 512) == 0) {
                        }
                        if (i9 == 0) {
                        }
                        chipElevation2 = chipElevationM2218assistChipElevationaqJV_2Y;
                        shape3 = shape2;
                        z2 = z4;
                        chipColorsAssistChipColors = chipColors32;
                        function27 = function210;
                        modifier4 = modifier3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        TextStyle value2 = TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, i12);
                        long jM2299labelColorvNxB06k$material3_release2 = chipColorsAssistChipColors.m2299labelColorvNxB06k$material3_release(z2);
                        composerStartRestartGroup.startReplaceGroup(267317901);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "231@11104L21");
                        if (chipBorderM2215assistChipBorderd_3_b6Q != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        int i212 = i14 << 6;
                        ChipColors chipColors42 = chipColorsAssistChipColors;
                        composer3 = composerStartRestartGroup;
                        boolean z52 = z2;
                        m2308ChipnkUnTEs(modifier4, function0, z52, function24, value2, jM2299labelColorvNxB06k$material3_release2, function26, function27, shape3, chipColors42, chipElevation2, stateBorderStroke$material3_release != null ? stateBorderStroke$material3_release.getValue() : null, AssistChipDefaults.INSTANCE.m2221getHeightD9Ej5fM(), AssistChipPadding, mutableInteractionSource2, composer3, ((i14 >> 6) & 14) | ((i14 << 3) & LDSFile.EF_DG16_TAG) | ((i14 >> 3) & 896) | (i212 & 7168) | (3670016 & i212) | (29360128 & i212) | (234881024 & i212) | (i212 & 1879048192), ((i14 >> 24) & 14) | 3456 | ((i13 << 12) & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        chipBorder2 = chipBorderM2215assistChipBorderd_3_b6Q;
                        modifier5 = modifier4;
                        z3 = z52;
                        function28 = function26;
                        function29 = function27;
                        shape4 = shape3;
                        chipColors2 = chipColors42;
                        chipElevation3 = chipElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 == 0) {
            }
            function25 = function22;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i8 = i3 & 1024;
            if (i8 == 0) {
            }
            int i1722 = i4;
            if ((i4 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        function25 = function22;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i8 = i3 & 1024;
        if (i8 == 0) {
        }
        int i17222 = i4;
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedAssistChip(final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i7;
        ChipColors chipColorsElevatedAssistChipColors;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Shape shape2;
        int i13;
        Modifier modifier3;
        int i14;
        int i15;
        ChipElevation chipElevationM2220elevatedAssistChipElevationaqJV_2Y;
        int i16;
        MutableInteractionSource mutableInteractionSource2;
        ChipElevation chipElevation2;
        BorderStroke borderStroke2;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Modifier modifier4;
        Shape shape3;
        Composer composer2;
        final Modifier modifier5;
        final boolean z3;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Shape shape4;
        final ChipColors chipColors2;
        final ChipElevation chipElevation3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1594789934);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ElevatedAssistChip)P(8,5,7,3,6,10,9,1,2)289@14186L5,290@14237L26,291@14316L29,300@14613L5,295@14445L541:Chip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            function24 = function2;
        } else {
            function24 = function2;
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function24) ? 32 : 16;
            }
        }
        int i17 = i3 & 4;
        if (i17 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        function25 = function22;
                        i4 |= composerStartRestartGroup.changedInstance(function25) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                    } else if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(shape)) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i3 & 128) == 0) {
                            chipColorsElevatedAssistChipColors = chipColors;
                            int i18 = composerStartRestartGroup.changed(chipColorsElevatedAssistChipColors) ? 8388608 : 4194304;
                            i4 |= i18;
                        } else {
                            chipColorsElevatedAssistChipColors = chipColors;
                        }
                        i4 |= i18;
                    } else {
                        chipColorsElevatedAssistChipColors = chipColors;
                    }
                    if ((i & 100663296) == 0) {
                        i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(chipElevation)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i8 = i3 & 512;
                    if (i8 != 0) {
                        if ((i & 805306368) == 0) {
                            i9 = i8;
                            i4 |= composerStartRestartGroup.changed(borderStroke) ? PKIFailureInfo.duplicateCertReq : 268435456;
                        }
                        i10 = i3 & 1024;
                        if (i10 != 0) {
                            i11 = i10;
                            i12 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i11 = i10;
                            i12 = i2 | (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                        } else {
                            i11 = i10;
                            i12 = i2;
                        }
                        int i19 = i4;
                        if ((i4 & 306783379) == 306783378 && (i12 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            function29 = function23;
                            chipElevation3 = chipElevation;
                            mutableInteractionSource3 = mutableInteractionSource;
                            z3 = z2;
                            composer2 = composerStartRestartGroup;
                            shape4 = shape;
                            chipColors2 = chipColorsElevatedAssistChipColors;
                            modifier5 = modifier2;
                            function28 = function25;
                            borderStroke3 = borderStroke;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            int i20 = i12;
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i17 == 0 ? Modifier.INSTANCE : modifier2;
                                boolean z4 = i5 == 0 ? true : z2;
                                Function2<? super Composer, ? super Integer, Unit> function210 = i6 == 0 ? null : function25;
                                Function2<? super Composer, ? super Integer, Unit> function211 = i7 == 0 ? null : function23;
                                if ((i3 & 64) == 0) {
                                    i13 = i19 & (-3670017);
                                    shape2 = AssistChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                } else {
                                    shape2 = shape;
                                    i13 = i19;
                                }
                                if ((i3 & 128) != 0) {
                                    chipColorsElevatedAssistChipColors = AssistChipDefaults.INSTANCE.elevatedAssistChipColors(composerStartRestartGroup, 6);
                                    i13 &= -29360129;
                                }
                                ChipColors chipColors3 = chipColorsElevatedAssistChipColors;
                                int i21 = i13;
                                if ((i3 & 256) == 0) {
                                    modifier3 = companion;
                                    i15 = i20;
                                    i14 = 6;
                                    chipElevationM2220elevatedAssistChipElevationaqJV_2Y = AssistChipDefaults.INSTANCE.m2220elevatedAssistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                                    i16 = i21 & (-234881025);
                                } else {
                                    modifier3 = companion;
                                    i14 = 6;
                                    i15 = i20;
                                    chipElevationM2220elevatedAssistChipElevationaqJV_2Y = chipElevation;
                                    i16 = i21;
                                }
                                BorderStroke borderStroke4 = i9 == 0 ? null : borderStroke;
                                if (i11 == 0) {
                                    chipElevation2 = chipElevationM2220elevatedAssistChipElevationaqJV_2Y;
                                    borderStroke2 = borderStroke4;
                                    z2 = z4;
                                    mutableInteractionSource2 = null;
                                    function27 = function210;
                                    chipColorsElevatedAssistChipColors = chipColors3;
                                    function26 = function211;
                                    shape3 = shape2;
                                    modifier4 = modifier3;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    chipElevation2 = chipElevationM2220elevatedAssistChipElevationaqJV_2Y;
                                    borderStroke2 = borderStroke4;
                                    function26 = function211;
                                    z2 = z4;
                                    function27 = function210;
                                    chipColorsElevatedAssistChipColors = chipColors3;
                                    modifier4 = modifier3;
                                    shape3 = shape2;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                int i22 = (i3 & 64) != 0 ? i19 & (-3670017) : i19;
                                if ((i3 & 128) != 0) {
                                    i22 &= -29360129;
                                }
                                if ((i3 & 256) != 0) {
                                    i22 &= -234881025;
                                }
                                function26 = function23;
                                shape3 = shape;
                                chipElevation2 = chipElevation;
                                borderStroke2 = borderStroke;
                                mutableInteractionSource2 = mutableInteractionSource;
                                i14 = 6;
                                modifier4 = modifier2;
                                function27 = function25;
                                i16 = i22;
                                i15 = i20;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1594789934, i16, i15, "androidx.compose.material3.ElevatedAssistChip (Chip.kt:295)");
                            }
                            int i23 = i16 << 6;
                            int i24 = i16 >> 24;
                            ChipColors chipColors4 = chipColorsElevatedAssistChipColors;
                            boolean z5 = z2;
                            m2308ChipnkUnTEs(modifier4, function0, z5, function24, TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, i14), chipColorsElevatedAssistChipColors.m2299labelColorvNxB06k$material3_release(z2), function27, function26, shape3, chipColors4, chipElevation2, borderStroke2, AssistChipDefaults.INSTANCE.m2221getHeightD9Ej5fM(), AssistChipPadding, mutableInteractionSource2, composerStartRestartGroup, ((i16 >> 6) & 14) | ((i16 << 3) & LDSFile.EF_DG16_TAG) | ((i16 >> 3) & 896) | (i23 & 7168) | (3670016 & i23) | (29360128 & i23) | (234881024 & i23) | (i23 & 1879048192), (i24 & LDSFile.EF_DG16_TAG) | (i24 & 14) | 3456 | ((i15 << 12) & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2 = composerStartRestartGroup;
                            modifier5 = modifier4;
                            z3 = z5;
                            function28 = function27;
                            function29 = function26;
                            shape4 = shape3;
                            chipColors2 = chipColors4;
                            chipElevation3 = chipElevation2;
                            borderStroke3 = borderStroke2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.ElevatedAssistChip.1
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
                                    ChipKt.ElevatedAssistChip(function0, function2, modifier5, z3, function28, function29, shape4, chipColors2, chipElevation3, borderStroke3, mutableInteractionSource3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    i9 = i8;
                    i10 = i3 & 1024;
                    if (i10 != 0) {
                    }
                    int i192 = i4;
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        int i202 = i12;
                        if ((i & 1) != 0) {
                            if (i17 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if ((i3 & 64) == 0) {
                            }
                            if ((i3 & 128) != 0) {
                            }
                            ChipColors chipColors32 = chipColorsElevatedAssistChipColors;
                            int i212 = i13;
                            if ((i3 & 256) == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i232 = i16 << 6;
                            int i242 = i16 >> 24;
                            ChipColors chipColors42 = chipColorsElevatedAssistChipColors;
                            boolean z52 = z2;
                            m2308ChipnkUnTEs(modifier4, function0, z52, function24, TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, i14), chipColorsElevatedAssistChipColors.m2299labelColorvNxB06k$material3_release(z2), function27, function26, shape3, chipColors42, chipElevation2, borderStroke2, AssistChipDefaults.INSTANCE.m2221getHeightD9Ej5fM(), AssistChipPadding, mutableInteractionSource2, composerStartRestartGroup, ((i16 >> 6) & 14) | ((i16 << 3) & LDSFile.EF_DG16_TAG) | ((i16 >> 3) & 896) | (i232 & 7168) | (3670016 & i232) | (29360128 & i232) | (234881024 & i232) | (i232 & 1879048192), (i242 & LDSFile.EF_DG16_TAG) | (i242 & 14) | 3456 | ((i15 << 12) & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = composerStartRestartGroup;
                            modifier5 = modifier4;
                            z3 = z52;
                            function28 = function27;
                            function29 = function26;
                            shape4 = shape3;
                            chipColors2 = chipColors42;
                            chipElevation3 = chipElevation2;
                            borderStroke3 = borderStroke2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function25 = function22;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i8 = i3 & 512;
                if (i8 != 0) {
                }
                i9 = i8;
                i10 = i3 & 1024;
                if (i10 != 0) {
                }
                int i1922 = i4;
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            function25 = function22;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i8 = i3 & 512;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            int i19222 = i4;
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        function25 = function22;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i8 = i3 & 512;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        int i192222 = i4;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with ElevatedAssistChip that take a BorderStroke instead", replaceWith = @ReplaceWith(expression = "ElevatedAssistChip(onClick, label, modifier, enabled,leadingIcon, trailingIcon, shape, colors, elevation, border, interactionSource", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void ElevatedAssistChip(final Function0 function0, final Function2 function2, Modifier modifier, boolean z, Function2 function22, Function2 function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function2 function24;
        Modifier modifier2;
        int i5;
        boolean z2;
        int i6;
        Function2 function25;
        int i7;
        ChipColors chipColorsElevatedAssistChipColors;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Shape shape2;
        int i13;
        Modifier modifier3;
        int i14;
        int i15;
        ChipElevation chipElevationM2220elevatedAssistChipElevationaqJV_2Y;
        int i16;
        MutableInteractionSource mutableInteractionSource2;
        ChipElevation chipElevation2;
        ChipBorder chipBorder2;
        Function2 function26;
        Function2 function27;
        Shape shape3;
        Modifier modifier4;
        State<BorderStroke> stateBorderStroke$material3_release;
        final ChipBorder chipBorder3;
        Composer composer2;
        final Modifier modifier5;
        final boolean z3;
        final Function2 function28;
        final Function2 function29;
        final Shape shape4;
        final ChipColors chipColors2;
        final ChipElevation chipElevation3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1295844802);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ElevatedAssistChip)P(8,5,7,3,6,10,9,1,2)375@18287L5,376@18338L26,377@18417L29,379@18530L39,386@18746L5,381@18578L571:Chip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            function24 = function2;
        } else {
            function24 = function2;
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function24) ? 32 : 16;
            }
        }
        int i17 = i3 & 4;
        if (i17 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i4 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        function25 = function22;
                        i4 |= composerStartRestartGroup.changedInstance(function25) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                    } else if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(shape)) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i3 & 128) == 0) {
                            chipColorsElevatedAssistChipColors = chipColors;
                            int i18 = composerStartRestartGroup.changed(chipColorsElevatedAssistChipColors) ? 8388608 : 4194304;
                            i4 |= i18;
                        } else {
                            chipColorsElevatedAssistChipColors = chipColors;
                        }
                        i4 |= i18;
                    } else {
                        chipColorsElevatedAssistChipColors = chipColors;
                    }
                    if ((i & 100663296) == 0) {
                        i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(chipElevation)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i8 = i3 & 512;
                    if (i8 != 0) {
                        if ((i & 805306368) == 0) {
                            i9 = i8;
                            i4 |= composerStartRestartGroup.changed(chipBorder) ? PKIFailureInfo.duplicateCertReq : 268435456;
                        }
                        i10 = i3 & 1024;
                        if (i10 != 0) {
                            i11 = i10;
                            i12 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i11 = i10;
                            i12 = i2 | (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2);
                        } else {
                            i11 = i10;
                            i12 = i2;
                        }
                        int i19 = i4;
                        if ((i4 & 306783379) == 306783378 && (i12 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            function29 = function23;
                            chipElevation3 = chipElevation;
                            mutableInteractionSource3 = mutableInteractionSource;
                            z3 = z2;
                            composer2 = composerStartRestartGroup;
                            shape4 = shape;
                            chipColors2 = chipColorsElevatedAssistChipColors;
                            modifier5 = modifier2;
                            function28 = function25;
                            chipBorder3 = chipBorder;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            int i20 = i12;
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i17 == 0 ? Modifier.INSTANCE : modifier2;
                                boolean z4 = i5 == 0 ? true : z2;
                                Function2 function210 = i6 == 0 ? null : function25;
                                Function2 function211 = i7 == 0 ? null : function23;
                                if ((i3 & 64) == 0) {
                                    i13 = i19 & (-3670017);
                                    shape2 = AssistChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                } else {
                                    shape2 = shape;
                                    i13 = i19;
                                }
                                if ((i3 & 128) != 0) {
                                    chipColorsElevatedAssistChipColors = AssistChipDefaults.INSTANCE.elevatedAssistChipColors(composerStartRestartGroup, 6);
                                    i13 &= -29360129;
                                }
                                ChipColors chipColors3 = chipColorsElevatedAssistChipColors;
                                int i21 = i13;
                                if ((i3 & 256) == 0) {
                                    modifier3 = companion;
                                    i15 = i20;
                                    i14 = 6;
                                    chipElevationM2220elevatedAssistChipElevationaqJV_2Y = AssistChipDefaults.INSTANCE.m2220elevatedAssistChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                                    i16 = i21 & (-234881025);
                                } else {
                                    modifier3 = companion;
                                    i14 = 6;
                                    i15 = i20;
                                    chipElevationM2220elevatedAssistChipElevationaqJV_2Y = chipElevation;
                                    i16 = i21;
                                }
                                ChipBorder chipBorder4 = i9 == 0 ? null : chipBorder;
                                if (i11 == 0) {
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1551989929, "CC(remember):Chip.kt#9igjgp");
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    chipElevation2 = chipElevationM2220elevatedAssistChipElevationaqJV_2Y;
                                    chipBorder2 = chipBorder4;
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    chipElevation2 = chipElevationM2220elevatedAssistChipElevationaqJV_2Y;
                                    chipBorder2 = chipBorder4;
                                }
                                z2 = z4;
                                function26 = function210;
                                chipColorsElevatedAssistChipColors = chipColors3;
                                function27 = function211;
                                shape3 = shape2;
                                modifier4 = modifier3;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                int i22 = (i3 & 64) != 0 ? i19 & (-3670017) : i19;
                                if ((i3 & 128) != 0) {
                                    i22 &= -29360129;
                                }
                                if ((i3 & 256) != 0) {
                                    i22 &= -234881025;
                                }
                                function27 = function23;
                                shape3 = shape;
                                chipElevation2 = chipElevation;
                                chipBorder2 = chipBorder;
                                mutableInteractionSource2 = mutableInteractionSource;
                                i14 = 6;
                                modifier4 = modifier2;
                                function26 = function25;
                                i16 = i22;
                                i15 = i20;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1295844802, i16, i15, "androidx.compose.material3.ElevatedAssistChip (Chip.kt:381)");
                            }
                            TextStyle value = TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, i14);
                            BorderStroke value2 = null;
                            long jM2299labelColorvNxB06k$material3_release = chipColorsElevatedAssistChipColors.m2299labelColorvNxB06k$material3_release(z2);
                            float fM2221getHeightD9Ej5fM = AssistChipDefaults.INSTANCE.m2221getHeightD9Ej5fM();
                            PaddingValues paddingValues = AssistChipPadding;
                            composerStartRestartGroup.startReplaceGroup(1552007127);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "395@19068L21");
                            stateBorderStroke$material3_release = chipBorder2 != null ? null : chipBorder2.borderStroke$material3_release(z2, composerStartRestartGroup, ((i16 >> 9) & 14) | ((i16 >> 24) & LDSFile.EF_DG16_TAG));
                            composerStartRestartGroup.endReplaceGroup();
                            if (stateBorderStroke$material3_release != null) {
                                value2 = stateBorderStroke$material3_release.getValue();
                            }
                            int i23 = i16 << 6;
                            ChipColors chipColors4 = chipColorsElevatedAssistChipColors;
                            boolean z5 = z2;
                            m2308ChipnkUnTEs(modifier4, function0, z5, function24, value, jM2299labelColorvNxB06k$material3_release, function26, function27, shape3, chipColors4, chipElevation2, value2, fM2221getHeightD9Ej5fM, paddingValues, mutableInteractionSource2, composerStartRestartGroup, ((i16 >> 6) & 14) | ((i16 << 3) & LDSFile.EF_DG16_TAG) | ((i16 >> 3) & 896) | (i23 & 7168) | (3670016 & i23) | (29360128 & i23) | (234881024 & i23) | (i23 & 1879048192), ((i16 >> 24) & 14) | 3456 | ((i15 << 12) & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            chipBorder3 = chipBorder2;
                            composer2 = composerStartRestartGroup;
                            modifier5 = modifier4;
                            z3 = z5;
                            function28 = function26;
                            function29 = function27;
                            shape4 = shape3;
                            chipColors2 = chipColors4;
                            chipElevation3 = chipElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.ElevatedAssistChip.3
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
                                    ChipKt.ElevatedAssistChip(function0, function2, modifier5, z3, function28, function29, shape4, chipColors2, chipElevation3, chipBorder3, mutableInteractionSource3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    i9 = i8;
                    i10 = i3 & 1024;
                    if (i10 != 0) {
                    }
                    int i192 = i4;
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        int i202 = i12;
                        if ((i & 1) != 0) {
                            if (i17 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if ((i3 & 64) == 0) {
                            }
                            if ((i3 & 128) != 0) {
                            }
                            ChipColors chipColors32 = chipColorsElevatedAssistChipColors;
                            int i212 = i13;
                            if ((i3 & 256) == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            z2 = z4;
                            function26 = function210;
                            chipColorsElevatedAssistChipColors = chipColors32;
                            function27 = function211;
                            shape3 = shape2;
                            modifier4 = modifier3;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            TextStyle value3 = TypographyKt.getValue(AssistChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, i14);
                            BorderStroke value22 = null;
                            long jM2299labelColorvNxB06k$material3_release2 = chipColorsElevatedAssistChipColors.m2299labelColorvNxB06k$material3_release(z2);
                            float fM2221getHeightD9Ej5fM2 = AssistChipDefaults.INSTANCE.m2221getHeightD9Ej5fM();
                            PaddingValues paddingValues2 = AssistChipPadding;
                            composerStartRestartGroup.startReplaceGroup(1552007127);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "395@19068L21");
                            if (chipBorder2 != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (stateBorderStroke$material3_release != null) {
                            }
                            int i232 = i16 << 6;
                            ChipColors chipColors42 = chipColorsElevatedAssistChipColors;
                            boolean z52 = z2;
                            m2308ChipnkUnTEs(modifier4, function0, z52, function24, value3, jM2299labelColorvNxB06k$material3_release2, function26, function27, shape3, chipColors42, chipElevation2, value22, fM2221getHeightD9Ej5fM2, paddingValues2, mutableInteractionSource2, composerStartRestartGroup, ((i16 >> 6) & 14) | ((i16 << 3) & LDSFile.EF_DG16_TAG) | ((i16 >> 3) & 896) | (i232 & 7168) | (3670016 & i232) | (29360128 & i232) | (234881024 & i232) | (i232 & 1879048192), ((i16 >> 24) & 14) | 3456 | ((i15 << 12) & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            chipBorder3 = chipBorder2;
                            composer2 = composerStartRestartGroup;
                            modifier5 = modifier4;
                            z3 = z52;
                            function28 = function26;
                            function29 = function27;
                            shape4 = shape3;
                            chipColors2 = chipColors42;
                            chipElevation3 = chipElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function25 = function22;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i8 = i3 & 512;
                if (i8 != 0) {
                }
                i9 = i8;
                i10 = i3 & 1024;
                if (i10 != 0) {
                }
                int i1922 = i4;
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            function25 = function22;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i8 = i3 & 512;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            int i19222 = i4;
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        function25 = function22;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i8 = i3 & 512;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        int i192222 = i4;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilterChip(final boolean z, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        boolean z3;
        int i4;
        Function0<Unit> function02;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Modifier modifier2;
        int i5;
        boolean z4;
        int i6;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Shape shape2;
        SelectableChipColors selectableChipColors2;
        int i8;
        int i9;
        int i10;
        MutableInteractionSource mutableInteractionSource2;
        int i11;
        int i12;
        Shape shape3;
        SelectableChipColors selectableChipColorsFilterChipColors;
        Modifier modifier3;
        int i13;
        int i14;
        SelectableChipElevation selectableChipElevationM2547filterChipElevationaqJV_2Y;
        int i15;
        boolean z5;
        BorderStroke borderStrokeM2545filterChipBorder_7El2pE;
        MutableInteractionSource mutableInteractionSource3;
        SelectableChipElevation selectableChipElevation2;
        BorderStroke borderStroke2;
        boolean z6;
        int i16;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Shape shape4;
        SelectableChipColors selectableChipColors3;
        Modifier modifier4;
        Composer composer2;
        final Modifier modifier5;
        final boolean z7;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Shape shape5;
        final SelectableChipColors selectableChipColors4;
        final SelectableChipElevation selectableChipElevation3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1711985619);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(FilterChip)P(9,8,5,7,3,6,11,10,1,2)462@22511L5,463@22572L18,464@22653L21,465@22723L35,474@23031L5,468@22824L554:Chip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i4 = (composerStartRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i4 = i;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
            function24 = function2;
        } else {
            function24 = function2;
            if ((i & 384) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function24) ? 256 : 128;
            }
        }
        int i17 = i3 & 8;
        if (i17 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    z4 = z2;
                    i4 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                } else if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    function25 = function23;
                } else {
                    function25 = function23;
                    if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function25) ? 1048576 : 524288;
                    }
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        shape2 = shape;
                        int i18 = composerStartRestartGroup.changed(shape2) ? 8388608 : 4194304;
                        i4 |= i18;
                    } else {
                        shape2 = shape;
                    }
                    i4 |= i18;
                } else {
                    shape2 = shape;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        selectableChipColors2 = selectableChipColors;
                        int i19 = composerStartRestartGroup.changed(selectableChipColors2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        i4 |= i19;
                    } else {
                        selectableChipColors2 = selectableChipColors;
                    }
                    i4 |= i19;
                } else {
                    selectableChipColors2 = selectableChipColors;
                }
                if ((i & 805306368) == 0) {
                    i4 |= ((i3 & 512) == 0 && composerStartRestartGroup.changed(selectableChipElevation)) ? PKIFailureInfo.duplicateCertReq : 268435456;
                }
                if ((i2 & 6) == 0) {
                    i8 = i2 | (((i3 & 1024) == 0 && composerStartRestartGroup.changed(borderStroke)) ? 4 : 2);
                } else {
                    i8 = i2;
                }
                i9 = i3 & 2048;
                if (i9 != 0) {
                    i10 = i9;
                    i11 = i8 | 48;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    if ((i2 & 48) == 0) {
                        i10 = i9;
                        mutableInteractionSource2 = mutableInteractionSource;
                        i8 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 32 : 16;
                    } else {
                        i10 = i9;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    i11 = i8;
                }
                int i20 = i4;
                if ((i4 & 306783379) == 306783378 && (i11 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    borderStroke3 = borderStroke;
                    mutableInteractionSource4 = mutableInteractionSource2;
                    selectableChipColors4 = selectableChipColors2;
                    modifier5 = modifier2;
                    composer2 = composerStartRestartGroup;
                    function28 = function22;
                    function29 = function25;
                    shape5 = shape2;
                    z7 = z4;
                    selectableChipElevation3 = selectableChipElevation;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i17 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z8 = i5 == 0 ? true : z4;
                        Function2<? super Composer, ? super Integer, Unit> function210 = i6 == 0 ? null : function22;
                        Function2<? super Composer, ? super Integer, Unit> function211 = i7 == 0 ? null : function25;
                        if ((i3 & 128) == 0) {
                            i12 = i20 & (-29360129);
                            shape3 = FilterChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i12 = i20;
                            shape3 = shape2;
                        }
                        if ((i3 & 256) == 0) {
                            i12 &= -234881025;
                            selectableChipColorsFilterChipColors = FilterChipDefaults.INSTANCE.filterChipColors(composerStartRestartGroup, 6);
                        } else {
                            selectableChipColorsFilterChipColors = selectableChipColors2;
                        }
                        int i21 = i12;
                        if ((i3 & 512) == 0) {
                            modifier3 = companion;
                            i13 = 6;
                            i14 = i10;
                            selectableChipElevationM2547filterChipElevationaqJV_2Y = FilterChipDefaults.INSTANCE.m2547filterChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i15 = i21 & (-1879048193);
                        } else {
                            modifier3 = companion;
                            i13 = 6;
                            i14 = i10;
                            selectableChipElevationM2547filterChipElevationaqJV_2Y = selectableChipElevation;
                            i15 = i21;
                        }
                        if ((i3 & 1024) == 0) {
                            z5 = z8;
                            borderStrokeM2545filterChipBorder_7El2pE = FilterChipDefaults.INSTANCE.m2545filterChipBorder_7El2pE(z5, z3, 0L, 0L, 0L, 0L, 0.0f, 0.0f, composerStartRestartGroup, ((i15 >> 12) & 14) | 100663296 | ((i15 << 3) & LDSFile.EF_DG16_TAG), 252);
                            i11 &= -15;
                        } else {
                            z5 = z8;
                            borderStrokeM2545filterChipBorder_7El2pE = borderStroke;
                        }
                        if (i14 == 0) {
                            selectableChipElevation2 = selectableChipElevationM2547filterChipElevationaqJV_2Y;
                            borderStroke2 = borderStrokeM2545filterChipBorder_7El2pE;
                            z6 = z5;
                            i16 = i11;
                            mutableInteractionSource3 = null;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource;
                            selectableChipElevation2 = selectableChipElevationM2547filterChipElevationaqJV_2Y;
                            borderStroke2 = borderStrokeM2545filterChipBorder_7El2pE;
                            z6 = z5;
                            i16 = i11;
                        }
                        function26 = function210;
                        function27 = function211;
                        shape4 = shape3;
                        selectableChipColors3 = selectableChipColorsFilterChipColors;
                        modifier4 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        int i22 = (i3 & 128) != 0 ? i20 & (-29360129) : i20;
                        if ((i3 & 256) != 0) {
                            i22 &= -234881025;
                        }
                        if ((i3 & 512) != 0) {
                            i22 &= -1879048193;
                        }
                        if ((i3 & 1024) != 0) {
                            i11 &= -15;
                        }
                        function26 = function22;
                        selectableChipElevation2 = selectableChipElevation;
                        borderStroke2 = borderStroke;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        function27 = function25;
                        shape4 = shape2;
                        selectableChipColors3 = selectableChipColors2;
                        modifier4 = modifier2;
                        z6 = z4;
                        i15 = i22;
                        i13 = 6;
                        i16 = i11;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1711985619, i15, i16, "androidx.compose.material3.FilterChip (Chip.kt:468)");
                    }
                    int i23 = i15 << 3;
                    int i24 = i15 << 6;
                    int i25 = i15 >> 24;
                    m2310SelectableChipu0RnIRE(z, modifier4, function02, z6, function24, TypographyKt.getValue(FilterChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, i13), function26, null, function27, shape4, selectableChipColors3, selectableChipElevation2, borderStroke2, FilterChipDefaults.INSTANCE.m2548getHeightD9Ej5fM(), FilterChipPadding, mutableInteractionSource3, composerStartRestartGroup, (i15 & 14) | 12582912 | ((i15 >> 6) & LDSFile.EF_DG16_TAG) | (i23 & 896) | ((i15 >> 3) & 7168) | (57344 & i24) | (i23 & 3670016) | (234881024 & i24) | (1879048192 & i24), (i25 & LDSFile.EF_DG16_TAG) | (i25 & 14) | 27648 | ((i16 << 6) & 896) | ((i16 << 12) & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = composerStartRestartGroup;
                    modifier5 = modifier4;
                    z7 = z6;
                    function28 = function26;
                    function29 = function27;
                    shape5 = shape4;
                    selectableChipColors4 = selectableChipColors3;
                    selectableChipElevation3 = selectableChipElevation2;
                    borderStroke3 = borderStroke2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.FilterChip.1
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

                        public final void invoke(Composer composer3, int i26) {
                            ChipKt.FilterChip(z, function0, function2, modifier5, z7, function28, function29, shape5, selectableChipColors4, selectableChipElevation3, borderStroke3, mutableInteractionSource4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 24576;
            z4 = z2;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) == 0) {
            }
            i9 = i3 & 2048;
            if (i9 != 0) {
            }
            int i202 = i4;
            if ((i4 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i17 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if ((i3 & 128) == 0) {
                    }
                    if ((i3 & 256) == 0) {
                    }
                    int i212 = i12;
                    if ((i3 & 512) == 0) {
                    }
                    if ((i3 & 1024) == 0) {
                    }
                    if (i14 == 0) {
                    }
                    function26 = function210;
                    function27 = function211;
                    shape4 = shape3;
                    selectableChipColors3 = selectableChipColorsFilterChipColors;
                    modifier4 = modifier3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i232 = i15 << 3;
                    int i242 = i15 << 6;
                    int i252 = i15 >> 24;
                    m2310SelectableChipu0RnIRE(z, modifier4, function02, z6, function24, TypographyKt.getValue(FilterChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, i13), function26, null, function27, shape4, selectableChipColors3, selectableChipElevation2, borderStroke2, FilterChipDefaults.INSTANCE.m2548getHeightD9Ej5fM(), FilterChipPadding, mutableInteractionSource3, composerStartRestartGroup, (i15 & 14) | 12582912 | ((i15 >> 6) & LDSFile.EF_DG16_TAG) | (i232 & 896) | ((i15 >> 3) & 7168) | (57344 & i242) | (i232 & 3670016) | (234881024 & i242) | (1879048192 & i242), (i252 & LDSFile.EF_DG16_TAG) | (i252 & 14) | 27648 | ((i16 << 6) & 896) | ((i16 << 12) & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = composerStartRestartGroup;
                    modifier5 = modifier4;
                    z7 = z6;
                    function28 = function26;
                    function29 = function27;
                    shape5 = shape4;
                    selectableChipColors4 = selectableChipColors3;
                    selectableChipElevation3 = selectableChipElevation2;
                    borderStroke3 = borderStroke2;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        z4 = z2;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) == 0) {
        }
        i9 = i3 & 2048;
        if (i9 != 0) {
        }
        int i2022 = i4;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedFilterChip(final boolean z, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function0<Unit> function02;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Modifier modifier2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Shape shape2;
        SelectableChipColors selectableChipColors2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Shape shape3;
        SelectableChipColors selectableChipColorsElevatedFilterChipColors;
        Modifier modifier3;
        int i14;
        int i15;
        SelectableChipElevation selectableChipElevationM2544elevatedFilterChipElevationaqJV_2Y;
        int i16;
        MutableInteractionSource mutableInteractionSource2;
        SelectableChipElevation selectableChipElevation2;
        BorderStroke borderStroke2;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Shape shape4;
        int i17;
        boolean z4;
        int i18;
        Modifier modifier4;
        Composer composer2;
        final Modifier modifier5;
        final boolean z5;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final Shape shape5;
        final SelectableChipColors selectableChipColors3;
        final SelectableChipElevation selectableChipElevation3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-106647389);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ElevatedFilterChip)P(9,8,5,7,3,6,11,10,1,2)546@26622L5,547@26683L26,548@26772L29,558@27108L5,552@26901L554:Chip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
            function24 = function2;
        } else {
            function24 = function2;
            if ((i & 384) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function24) ? 256 : 128;
            }
        }
        int i19 = i3 & 8;
        if (i19 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    z3 = z2;
                    i4 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                } else if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    function25 = function23;
                } else {
                    function25 = function23;
                    if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function25) ? 1048576 : 524288;
                    }
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        shape2 = shape;
                        int i20 = composerStartRestartGroup.changed(shape2) ? 8388608 : 4194304;
                        i4 |= i20;
                    } else {
                        shape2 = shape;
                    }
                    i4 |= i20;
                } else {
                    shape2 = shape;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        selectableChipColors2 = selectableChipColors;
                        int i21 = composerStartRestartGroup.changed(selectableChipColors2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        i4 |= i21;
                    } else {
                        selectableChipColors2 = selectableChipColors;
                    }
                    i4 |= i21;
                } else {
                    selectableChipColors2 = selectableChipColors;
                }
                if ((i & 805306368) == 0) {
                    i4 |= ((i3 & 512) == 0 && composerStartRestartGroup.changed(selectableChipElevation)) ? PKIFailureInfo.duplicateCertReq : 268435456;
                }
                i8 = i3 & 1024;
                if (i8 != 0) {
                    i10 = i2 | 6;
                    i9 = i8;
                } else if ((i2 & 6) == 0) {
                    i9 = i8;
                    i10 = i2 | (composerStartRestartGroup.changed(borderStroke) ? 4 : 2);
                } else {
                    i9 = i8;
                    i10 = i2;
                }
                i11 = i3 & 2048;
                if (i11 != 0) {
                    i10 |= 48;
                    i12 = i11;
                } else if ((i2 & 48) == 0) {
                    i12 = i11;
                    i10 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
                } else {
                    i12 = i11;
                }
                int i22 = i10;
                int i23 = i4;
                if ((i4 & 306783379) == 306783378 && (i22 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    borderStroke3 = borderStroke;
                    mutableInteractionSource3 = mutableInteractionSource;
                    selectableChipColors3 = selectableChipColors2;
                    modifier5 = modifier2;
                    composer2 = composerStartRestartGroup;
                    function28 = function22;
                    function29 = function25;
                    shape5 = shape2;
                    z5 = z3;
                    selectableChipElevation3 = selectableChipElevation;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i19 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z6 = i5 == 0 ? true : z3;
                        Function2<? super Composer, ? super Integer, Unit> function210 = i6 == 0 ? null : function22;
                        Function2<? super Composer, ? super Integer, Unit> function211 = i7 == 0 ? null : function25;
                        if ((i3 & 128) == 0) {
                            i13 = i23 & (-29360129);
                            shape3 = FilterChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i13 = i23;
                            shape3 = shape2;
                        }
                        if ((i3 & 256) == 0) {
                            i13 &= -234881025;
                            selectableChipColorsElevatedFilterChipColors = FilterChipDefaults.INSTANCE.elevatedFilterChipColors(composerStartRestartGroup, 6);
                        } else {
                            selectableChipColorsElevatedFilterChipColors = selectableChipColors2;
                        }
                        int i24 = i13;
                        if ((i3 & 512) == 0) {
                            modifier3 = companion;
                            i15 = i22;
                            i14 = 6;
                            selectableChipElevationM2544elevatedFilterChipElevationaqJV_2Y = FilterChipDefaults.INSTANCE.m2544elevatedFilterChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                            i16 = i24 & (-1879048193);
                        } else {
                            modifier3 = companion;
                            i14 = 6;
                            i15 = i22;
                            selectableChipElevationM2544elevatedFilterChipElevationaqJV_2Y = selectableChipElevation;
                            i16 = i24;
                        }
                        BorderStroke borderStroke4 = i9 == 0 ? null : borderStroke;
                        if (i12 == 0) {
                            selectableChipElevation2 = selectableChipElevationM2544elevatedFilterChipElevationaqJV_2Y;
                            borderStroke2 = borderStroke4;
                            function26 = function210;
                            function27 = function211;
                            i17 = 12582912;
                            z4 = z6;
                            mutableInteractionSource2 = null;
                            i18 = -106647389;
                            modifier4 = modifier3;
                            shape4 = shape3;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            selectableChipElevation2 = selectableChipElevationM2544elevatedFilterChipElevationaqJV_2Y;
                            borderStroke2 = borderStroke4;
                            function26 = function210;
                            function27 = function211;
                            shape4 = shape3;
                            i17 = 12582912;
                            z4 = z6;
                            i18 = -106647389;
                            modifier4 = modifier3;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        int i25 = (i3 & 128) != 0 ? i23 & (-29360129) : i23;
                        if ((i3 & 256) != 0) {
                            i25 &= -234881025;
                        }
                        if ((i3 & 512) != 0) {
                            i25 &= -1879048193;
                        }
                        function26 = function22;
                        selectableChipElevation2 = selectableChipElevation;
                        borderStroke2 = borderStroke;
                        mutableInteractionSource2 = mutableInteractionSource;
                        i14 = 6;
                        function27 = function25;
                        shape4 = shape2;
                        selectableChipColorsElevatedFilterChipColors = selectableChipColors2;
                        modifier4 = modifier2;
                        i17 = 12582912;
                        i18 = -106647389;
                        i16 = i25;
                        z4 = z3;
                        i15 = i22;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(i18, i16, i15, "androidx.compose.material3.ElevatedFilterChip (Chip.kt:552)");
                    }
                    TextStyle value = TypographyKt.getValue(FilterChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, i14);
                    float fM2548getHeightD9Ej5fM = FilterChipDefaults.INSTANCE.m2548getHeightD9Ej5fM();
                    PaddingValues paddingValues = FilterChipPadding;
                    int i26 = i16 << 3;
                    int i27 = i16 << 6;
                    int i28 = i17 | (i16 & 14) | ((i16 >> 6) & LDSFile.EF_DG16_TAG) | (i26 & 896) | ((i16 >> 3) & 7168) | (57344 & i27) | (i26 & 3670016) | (234881024 & i27) | (1879048192 & i27);
                    int i29 = i16 >> 24;
                    m2310SelectableChipu0RnIRE(z, modifier4, function02, z4, function24, value, function26, null, function27, shape4, selectableChipColorsElevatedFilterChipColors, selectableChipElevation2, borderStroke2, fM2548getHeightD9Ej5fM, paddingValues, mutableInteractionSource2, composerStartRestartGroup, i28, (i29 & LDSFile.EF_DG16_TAG) | (i29 & 14) | 27648 | ((i15 << 6) & 896) | ((i15 << 12) & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = composerStartRestartGroup;
                    modifier5 = modifier4;
                    z5 = z4;
                    function28 = function26;
                    function29 = function27;
                    shape5 = shape4;
                    selectableChipColors3 = selectableChipColorsElevatedFilterChipColors;
                    selectableChipElevation3 = selectableChipElevation2;
                    borderStroke3 = borderStroke2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.ElevatedFilterChip.1
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
                            ChipKt.ElevatedFilterChip(z, function0, function2, modifier5, z5, function28, function29, shape5, selectableChipColors3, selectableChipElevation3, borderStroke3, mutableInteractionSource3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 24576;
            z3 = z2;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i8 = i3 & 1024;
            if (i8 != 0) {
            }
            i11 = i3 & 2048;
            if (i11 != 0) {
            }
            int i222 = i10;
            int i232 = i4;
            if ((i4 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i19 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if ((i3 & 128) == 0) {
                    }
                    if ((i3 & 256) == 0) {
                    }
                    int i242 = i13;
                    if ((i3 & 512) == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    TextStyle value2 = TypographyKt.getValue(FilterChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, i14);
                    float fM2548getHeightD9Ej5fM2 = FilterChipDefaults.INSTANCE.m2548getHeightD9Ej5fM();
                    PaddingValues paddingValues2 = FilterChipPadding;
                    int i262 = i16 << 3;
                    int i272 = i16 << 6;
                    int i282 = i17 | (i16 & 14) | ((i16 >> 6) & LDSFile.EF_DG16_TAG) | (i262 & 896) | ((i16 >> 3) & 7168) | (57344 & i272) | (i262 & 3670016) | (234881024 & i272) | (1879048192 & i272);
                    int i292 = i16 >> 24;
                    m2310SelectableChipu0RnIRE(z, modifier4, function02, z4, function24, value2, function26, null, function27, shape4, selectableChipColorsElevatedFilterChipColors, selectableChipElevation2, borderStroke2, fM2548getHeightD9Ej5fM2, paddingValues2, mutableInteractionSource2, composerStartRestartGroup, i282, (i292 & LDSFile.EF_DG16_TAG) | (i292 & 14) | 27648 | ((i15 << 6) & 896) | ((i15 << 12) & 458752));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = composerStartRestartGroup;
                    modifier5 = modifier4;
                    z5 = z4;
                    function28 = function26;
                    function29 = function27;
                    shape5 = shape4;
                    selectableChipColors3 = selectableChipColorsElevatedFilterChipColors;
                    selectableChipElevation3 = selectableChipElevation2;
                    borderStroke3 = borderStroke2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        z3 = z2;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i8 = i3 & 1024;
        if (i8 != 0) {
        }
        i11 = i3 & 2048;
        if (i11 != 0) {
        }
        int i2222 = i10;
        int i2322 = i4;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InputChip(final boolean z, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2, final int i3) {
        boolean z3;
        int i4;
        Function0<Unit> function02;
        int i5;
        int i6;
        boolean z4;
        int i7;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        int i8;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        int i9;
        Function2<? super Composer, ? super Integer, Unit> function27;
        int i10;
        int i11;
        int i12;
        int i13;
        Shape shape2;
        int i14;
        SelectableChipColors selectableChipColorsInputChipColors;
        int i15;
        int i16;
        SelectableChipElevation selectableChipElevationM2601inputChipElevationaqJV_2Y;
        int i17;
        BorderStroke borderStrokeM2599inputChipBorder_7El2pE;
        MutableInteractionSource mutableInteractionSource2;
        SelectableChipElevation selectableChipElevation2;
        BorderStroke borderStroke2;
        boolean z5;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        Shape shape3;
        SelectableChipColors selectableChipColors2;
        int i18;
        boolean z6;
        Composer composer2;
        final Modifier modifier2;
        final boolean z7;
        final Function2<? super Composer, ? super Integer, Unit> function210;
        final Shape shape4;
        final SelectableChipColors selectableChipColors3;
        final SelectableChipElevation selectableChipElevation3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1658928131);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(InputChip)P(10,9,6,8,4,7!1,12,11,2,3)638@30882L5,639@30942L17,640@31021L20,641@31089L34,671@32220L5,665@32014L745:Chip.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i4 = (composerStartRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i4 = i;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 == 0) {
                    if ((i & 24576) == 0) {
                        z4 = z2;
                        i4 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                        function25 = function22;
                    } else {
                        function25 = function22;
                        if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function25) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        function26 = function23;
                    } else {
                        function26 = function23;
                        if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function26) ? 1048576 : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                        function27 = function24;
                    } else {
                        function27 = function24;
                        if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function27) ? 8388608 : 4194304;
                        }
                    }
                    if ((i & 100663296) == 0) {
                        i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(shape)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i & 805306368) == 0) {
                        i4 |= ((i3 & 512) == 0 && composerStartRestartGroup.changed(selectableChipColors)) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    }
                    if ((i2 & 6) != 0) {
                        i10 = i2 | (((i3 & 1024) == 0 && composerStartRestartGroup.changed(selectableChipElevation)) ? 4 : 2);
                    } else {
                        i10 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i10 |= ((i3 & 2048) == 0 && composerStartRestartGroup.changed(borderStroke)) ? 32 : 16;
                    }
                    int i19 = i10;
                    i11 = i3 & 4096;
                    if (i11 == 0) {
                        i12 = i11;
                        i13 = i19 | 384;
                    } else {
                        int i20 = i19;
                        if ((i2 & 384) == 0) {
                            i20 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 256 : 128;
                        }
                        i12 = i11;
                        i13 = i20;
                    }
                    int i21 = i4;
                    if ((i4 & 306783379) == 306783378 || (i13 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        ComposableLambda composableLambdaRememberComposableLambda = null;
                        int i22 = i13;
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i5 == 0 ? Modifier.INSTANCE : modifier;
                            boolean z8 = i6 == 0 ? true : z4;
                            Function2<? super Composer, ? super Integer, Unit> function211 = i7 == 0 ? null : function25;
                            Function2<? super Composer, ? super Integer, Unit> function212 = i8 == 0 ? null : function26;
                            Function2<? super Composer, ? super Integer, Unit> function213 = i9 == 0 ? null : function27;
                            if ((i3 & 256) == 0) {
                                i14 = i21 & (-234881025);
                                shape2 = InputChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            } else {
                                shape2 = shape;
                                i14 = i21;
                            }
                            if ((i3 & 512) == 0) {
                                i14 &= -1879048193;
                                selectableChipColorsInputChipColors = InputChipDefaults.INSTANCE.inputChipColors(composerStartRestartGroup, 6);
                            } else {
                                selectableChipColorsInputChipColors = selectableChipColors;
                            }
                            int i23 = i14;
                            if ((i3 & 1024) == 0) {
                                modifier = companion;
                                i15 = 6;
                                i16 = i12;
                                selectableChipElevationM2601inputChipElevationaqJV_2Y = InputChipDefaults.INSTANCE.m2601inputChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                                i17 = i22 & (-15);
                            } else {
                                modifier = companion;
                                i15 = 6;
                                i16 = i12;
                                selectableChipElevationM2601inputChipElevationaqJV_2Y = selectableChipElevation;
                                i17 = i22;
                            }
                            boolean z9 = z8;
                            if ((i3 & 2048) == 0) {
                                borderStrokeM2599inputChipBorder_7El2pE = InputChipDefaults.INSTANCE.m2599inputChipBorder_7El2pE(z9, z3, 0L, 0L, 0L, 0L, 0.0f, 0.0f, composerStartRestartGroup, ((i23 >> 12) & 14) | 100663296 | ((i23 << 3) & LDSFile.EF_DG16_TAG), 252);
                                i17 &= -113;
                            } else {
                                borderStrokeM2599inputChipBorder_7El2pE = borderStroke;
                            }
                            if (i16 == 0) {
                                selectableChipElevation2 = selectableChipElevationM2601inputChipElevationaqJV_2Y;
                                borderStroke2 = borderStrokeM2599inputChipBorder_7El2pE;
                                z5 = z9;
                                mutableInteractionSource2 = null;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                                selectableChipElevation2 = selectableChipElevationM2601inputChipElevationaqJV_2Y;
                                borderStroke2 = borderStrokeM2599inputChipBorder_7El2pE;
                                z5 = z9;
                            }
                            function28 = function211;
                            function26 = function212;
                            function29 = function213;
                            shape3 = shape2;
                            selectableChipColors2 = selectableChipColorsInputChipColors;
                            i18 = i23;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            int i24 = (i3 & 256) != 0 ? i21 & (-234881025) : i21;
                            if ((i3 & 512) != 0) {
                                i24 &= -1879048193;
                            }
                            if ((i3 & 1024) != 0) {
                                i22 &= -15;
                            }
                            if ((i3 & 2048) != 0) {
                                i22 &= -113;
                            }
                            i18 = i24;
                            i15 = 6;
                            shape3 = shape;
                            selectableChipColors2 = selectableChipColors;
                            selectableChipElevation2 = selectableChipElevation;
                            borderStroke2 = borderStroke;
                            mutableInteractionSource2 = mutableInteractionSource;
                            z5 = z4;
                            function28 = function25;
                            function29 = function27;
                            i17 = i22;
                        }
                        Modifier modifier3 = modifier;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1658928131, i18, i17, "androidx.compose.material3.InputChip (Chip.kt:643)");
                        }
                        composerStartRestartGroup.startReplaceGroup(417920884);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "649@31531L5,651@31584L419");
                        if (function26 == null) {
                            final float f = z5 ? 1.0f : 0.38f;
                            final Shape value = ShapesKt.getValue(InputChipTokens.INSTANCE.getAvatarShape(), composerStartRestartGroup, i15);
                            z6 = true;
                            composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1154227507, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.InputChip.1
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
                                    ComposerKt.sourceInformation(composer3, "C654@31685L180,652@31602L387:Chip.kt#uh7d8r");
                                    if ((i25 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1154227507, i25, -1, "androidx.compose.material3.InputChip.<anonymous> (Chip.kt:652)");
                                        }
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer3, -724235578, "CC(remember):Chip.kt#9igjgp");
                                        boolean zChanged = composer3.changed(f) | composer3.changed(value);
                                        final float f2 = f;
                                        final Shape shape5 = value;
                                        Object objRememberedValue = composer3.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.ChipKt$InputChip$1$1$1
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
                                                    graphicsLayerScope.setAlpha(f2);
                                                    graphicsLayerScope.setShape(shape5);
                                                    graphicsLayerScope.setClip(true);
                                                }
                                            };
                                            composer3.updateRememberedValue(objRememberedValue);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion2, (Function1) objRememberedValue);
                                        Alignment center = Alignment.INSTANCE.getCenter();
                                        Function2<Composer, Integer, Unit> function214 = function26;
                                        ComposerKt.sourceInformationMarkerStart(composer3, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
                                        ComposerKt.sourceInformationMarkerStart(composer3, 1618257738, "C661@31963L8:Chip.kt#uh7d8r");
                                        function214.invoke(composer3, 0);
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
                            }, composerStartRestartGroup, 54);
                        } else {
                            z6 = true;
                        }
                        ComposableLambda composableLambda = composableLambdaRememberComposableLambda;
                        composerStartRestartGroup.endReplaceGroup();
                        TextStyle value2 = TypographyKt.getValue(InputChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, i15);
                        float fM2597getHeightD9Ej5fM = InputChipDefaults.INSTANCE.m2597getHeightD9Ej5fM();
                        PaddingValues paddingValuesInputChipPadding = inputChipPadding(composableLambda == null ? z6 : false, function28 == null ? z6 : false, function29 != null ? z6 : false);
                        int i25 = i18 << 3;
                        int i26 = (i18 & 14) | ((i18 >> 6) & LDSFile.EF_DG16_TAG) | (i25 & 896) | ((i18 >> 3) & 7168) | ((i18 << 6) & 57344) | (3670016 & i25) | (234881024 & i25) | (i25 & 1879048192);
                        int i27 = ((i18 >> 27) & 14) | 3072;
                        int i28 = i17 << 3;
                        m2310SelectableChipu0RnIRE(z, modifier3, function02, z5, function2, value2, function28, composableLambda, function29, shape3, selectableChipColors2, selectableChipElevation2, borderStroke2, fM2597getHeightD9Ej5fM, paddingValuesInputChipPadding, mutableInteractionSource2, composerStartRestartGroup, i26, i27 | (i28 & LDSFile.EF_DG16_TAG) | (i28 & 896) | ((i17 << 9) & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer2 = composerStartRestartGroup;
                        modifier2 = modifier3;
                        z7 = z5;
                        function25 = function28;
                        function210 = function29;
                        shape4 = shape3;
                        selectableChipColors3 = selectableChipColors2;
                        selectableChipElevation3 = selectableChipElevation2;
                        borderStroke3 = borderStroke2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        selectableChipElevation3 = selectableChipElevation;
                        borderStroke3 = borderStroke;
                        mutableInteractionSource3 = mutableInteractionSource;
                        z7 = z4;
                        composer2 = composerStartRestartGroup;
                        function210 = function27;
                        modifier2 = modifier;
                        shape4 = shape;
                        selectableChipColors3 = selectableChipColors;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.InputChip.2
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

                            public final void invoke(Composer composer3, int i29) {
                                ChipKt.InputChip(z, function0, function2, modifier2, z7, function25, function26, function210, shape4, selectableChipColors3, selectableChipElevation3, borderStroke3, mutableInteractionSource3, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 24576;
                z4 = z2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                if ((i2 & 48) == 0) {
                }
                int i192 = i10;
                i11 = i3 & 4096;
                if (i11 == 0) {
                }
                int i212 = i4;
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    ComposableLambda composableLambdaRememberComposableLambda2 = null;
                    int i222 = i13;
                    if ((i & 1) != 0) {
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if ((i3 & 256) == 0) {
                        }
                        if ((i3 & 512) == 0) {
                        }
                        int i232 = i14;
                        if ((i3 & 1024) == 0) {
                        }
                        boolean z92 = z8;
                        if ((i3 & 2048) == 0) {
                        }
                        if (i16 == 0) {
                        }
                        function28 = function211;
                        function26 = function212;
                        function29 = function213;
                        shape3 = shape2;
                        selectableChipColors2 = selectableChipColorsInputChipColors;
                        i18 = i232;
                        Modifier modifier32 = modifier;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceGroup(417920884);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "649@31531L5,651@31584L419");
                        if (function26 == null) {
                        }
                        ComposableLambda composableLambda2 = composableLambdaRememberComposableLambda2;
                        composerStartRestartGroup.endReplaceGroup();
                        TextStyle value22 = TypographyKt.getValue(InputChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, i15);
                        float fM2597getHeightD9Ej5fM2 = InputChipDefaults.INSTANCE.m2597getHeightD9Ej5fM();
                        PaddingValues paddingValuesInputChipPadding2 = inputChipPadding(composableLambda2 == null ? z6 : false, function28 == null ? z6 : false, function29 != null ? z6 : false);
                        int i252 = i18 << 3;
                        int i262 = (i18 & 14) | ((i18 >> 6) & LDSFile.EF_DG16_TAG) | (i252 & 896) | ((i18 >> 3) & 7168) | ((i18 << 6) & 57344) | (3670016 & i252) | (234881024 & i252) | (i252 & 1879048192);
                        int i272 = ((i18 >> 27) & 14) | 3072;
                        int i282 = i17 << 3;
                        m2310SelectableChipu0RnIRE(z, modifier32, function02, z5, function2, value22, function28, composableLambda2, function29, shape3, selectableChipColors2, selectableChipElevation2, borderStroke2, fM2597getHeightD9Ej5fM2, paddingValuesInputChipPadding2, mutableInteractionSource2, composerStartRestartGroup, i262, i272 | (i282 & LDSFile.EF_DG16_TAG) | (i282 & 896) | ((i17 << 9) & 458752));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = composerStartRestartGroup;
                        modifier2 = modifier32;
                        z7 = z5;
                        function25 = function28;
                        function210 = function29;
                        shape4 = shape3;
                        selectableChipColors3 = selectableChipColors2;
                        selectableChipElevation3 = selectableChipElevation2;
                        borderStroke3 = borderStroke2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i6 = i3 & 16;
            if (i6 == 0) {
            }
            z4 = z2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i1922 = i10;
            i11 = i3 & 4096;
            if (i11 == 0) {
            }
            int i2122 = i4;
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        z4 = z2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i19222 = i10;
        i11 = i3 & 4096;
        if (i11 == 0) {
        }
        int i21222 = i4;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SuggestionChip(final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function23;
        final Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Shape shape2;
        ChipColors chipColors2;
        int i6;
        ChipElevation chipElevationM2977suggestionChipElevationaqJV_2Y;
        int i7;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        int i9;
        Shape shape3;
        ChipColors chipColorsSuggestionChipColors;
        int i10;
        Modifier modifier3;
        int i11;
        boolean z3;
        BorderStroke borderStrokeM2975suggestionChipBorderh1eTWw;
        int i12;
        MutableInteractionSource mutableInteractionSource3;
        BorderStroke borderStroke2;
        int i13;
        Function2<? super Composer, ? super Integer, Unit> function25;
        ChipElevation chipElevation2;
        Shape shape4;
        boolean z4;
        Composer composer2;
        final boolean z5;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Shape shape5;
        final ChipColors chipColors3;
        final ChipElevation chipElevation3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1700130831);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SuggestionChip)P(8,6,7,3,4,9,1,2)740@35497L5,741@35552L22,742@35631L25,743@35709L29,751@35977L5,746@35805L538:Chip.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(function02) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function23) ? 32 : 16;
            }
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
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
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        function24 = function22;
                        i3 |= composerStartRestartGroup.changedInstance(function24) ? 16384 : 8192;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            int i15 = composerStartRestartGroup.changed(shape2) ? 131072 : 65536;
                            i3 |= i15;
                        } else {
                            shape2 = shape;
                        }
                        i3 |= i15;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            chipColors2 = chipColors;
                            int i16 = composerStartRestartGroup.changed(chipColors2) ? 1048576 : 524288;
                            i3 |= i16;
                        } else {
                            chipColors2 = chipColors;
                        }
                        i3 |= i16;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 12582912) != 0) {
                        i6 = 12582912;
                        if ((i2 & 128) == 0) {
                            chipElevationM2977suggestionChipElevationaqJV_2Y = chipElevation;
                            int i17 = composerStartRestartGroup.changed(chipElevationM2977suggestionChipElevationaqJV_2Y) ? 8388608 : 4194304;
                            i3 |= i17;
                        } else {
                            chipElevationM2977suggestionChipElevationaqJV_2Y = chipElevation;
                        }
                        i3 |= i17;
                    } else {
                        i6 = 12582912;
                        chipElevationM2977suggestionChipElevationaqJV_2Y = chipElevation;
                    }
                    if ((i & 100663296) == 0) {
                        i3 |= ((i2 & 256) == 0 && composerStartRestartGroup.changed(borderStroke)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i7 = i2 & 512;
                    if (i7 != 0) {
                        if ((i & 805306368) == 0) {
                            i8 = i7;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? PKIFailureInfo.duplicateCertReq : 268435456;
                        }
                        int i18 = i3;
                        if ((i3 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            z5 = z2;
                            function26 = function24;
                            composer2 = composerStartRestartGroup;
                            shape5 = shape2;
                            chipColors3 = chipColors2;
                            chipElevation3 = chipElevationM2977suggestionChipElevationaqJV_2Y;
                            borderStroke3 = borderStroke;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i14 == 0 ? Modifier.INSTANCE : modifier2;
                                boolean z6 = i4 == 0 ? true : z2;
                                Function2<? super Composer, ? super Integer, Unit> function27 = i5 == 0 ? null : function24;
                                if ((i2 & 32) == 0) {
                                    i9 = i18 & (-458753);
                                    shape3 = SuggestionChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                } else {
                                    i9 = i18;
                                    shape3 = shape2;
                                }
                                if ((i2 & 64) == 0) {
                                    i9 &= -3670017;
                                    chipColorsSuggestionChipColors = SuggestionChipDefaults.INSTANCE.suggestionChipColors(composerStartRestartGroup, 6);
                                } else {
                                    chipColorsSuggestionChipColors = chipColors2;
                                }
                                int i19 = i9;
                                if ((i2 & 128) == 0) {
                                    i19 &= -29360129;
                                    i10 = 6;
                                    chipElevationM2977suggestionChipElevationaqJV_2Y = SuggestionChipDefaults.INSTANCE.m2977suggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                                } else {
                                    i10 = 6;
                                }
                                if ((i2 & 256) == 0) {
                                    modifier3 = companion;
                                    i11 = i10;
                                    z3 = z6;
                                    borderStrokeM2975suggestionChipBorderh1eTWw = SuggestionChipDefaults.INSTANCE.m2975suggestionChipBorderh1eTWw(z3, 0L, 0L, 0.0f, composerStartRestartGroup, ((i19 >> 9) & 14) | 24576, 14);
                                    i12 = i19 & (-234881025);
                                } else {
                                    modifier3 = companion;
                                    i11 = i10;
                                    z3 = z6;
                                    borderStrokeM2975suggestionChipBorderh1eTWw = borderStroke;
                                    i12 = i19;
                                }
                                if (i8 == 0) {
                                    borderStroke2 = borderStrokeM2975suggestionChipBorderh1eTWw;
                                    i13 = i12;
                                    chipColors2 = chipColorsSuggestionChipColors;
                                    mutableInteractionSource3 = null;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    borderStroke2 = borderStrokeM2975suggestionChipBorderh1eTWw;
                                    i13 = i12;
                                    chipColors2 = chipColorsSuggestionChipColors;
                                }
                                function25 = function27;
                                modifier2 = modifier3;
                                chipElevation2 = chipElevationM2977suggestionChipElevationaqJV_2Y;
                                shape4 = shape3;
                                z4 = z3;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i18 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i18 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i18 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i18 &= -234881025;
                                }
                                borderStroke2 = borderStroke;
                                mutableInteractionSource3 = mutableInteractionSource;
                                i11 = 6;
                                function25 = function24;
                                shape4 = shape2;
                                chipElevation2 = chipElevationM2977suggestionChipElevationaqJV_2Y;
                                i13 = i18;
                                z4 = z2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1700130831, i13, -1, "androidx.compose.material3.SuggestionChip (Chip.kt:746)");
                            }
                            TextStyle value = TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, i11);
                            long jM2299labelColorvNxB06k$material3_release = chipColors2.m2299labelColorvNxB06k$material3_release(z4);
                            float fM2972getHeightD9Ej5fM = SuggestionChipDefaults.INSTANCE.m2972getHeightD9Ej5fM();
                            PaddingValues paddingValues = SuggestionChipPadding;
                            int i20 = i13 << 6;
                            int i21 = ((i13 >> 6) & 14) | i6 | ((i13 << 3) & LDSFile.EF_DG16_TAG) | ((i13 >> 3) & 896) | (i20 & 7168) | (i20 & 3670016);
                            int i22 = i13 << 9;
                            int i23 = i21 | (234881024 & i22) | (i22 & 1879048192);
                            int i24 = i13 >> 21;
                            ChipColors chipColors4 = chipColors2;
                            Function2<? super Composer, ? super Integer, Unit> function28 = function23;
                            Modifier modifier4 = modifier2;
                            m2308ChipnkUnTEs(modifier4, function02, z4, function28, value, jM2299labelColorvNxB06k$material3_release, function25, null, shape4, chipColors4, chipElevation2, borderStroke2, fM2972getHeightD9Ej5fM, paddingValues, mutableInteractionSource3, composerStartRestartGroup, i23, (i24 & LDSFile.EF_DG16_TAG) | (i24 & 14) | 3456 | ((i13 >> 15) & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2 = composerStartRestartGroup;
                            modifier2 = modifier4;
                            z5 = z4;
                            function26 = function25;
                            shape5 = shape4;
                            chipColors3 = chipColors4;
                            chipElevation3 = chipElevation2;
                            borderStroke3 = borderStroke2;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.SuggestionChip.1
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
                                    ChipKt.SuggestionChip(function0, function2, modifier2, z5, function26, shape5, chipColors3, chipElevation3, borderStroke3, mutableInteractionSource4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 805306368;
                    i8 = i7;
                    mutableInteractionSource2 = mutableInteractionSource;
                    int i182 = i3;
                    if ((i3 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i14 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if ((i2 & 32) == 0) {
                            }
                            if ((i2 & 64) == 0) {
                            }
                            int i192 = i9;
                            if ((i2 & 128) == 0) {
                            }
                            if ((i2 & 256) == 0) {
                            }
                            if (i8 == 0) {
                            }
                            function25 = function27;
                            modifier2 = modifier3;
                            chipElevation2 = chipElevationM2977suggestionChipElevationaqJV_2Y;
                            shape4 = shape3;
                            z4 = z3;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            TextStyle value2 = TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, i11);
                            long jM2299labelColorvNxB06k$material3_release2 = chipColors2.m2299labelColorvNxB06k$material3_release(z4);
                            float fM2972getHeightD9Ej5fM2 = SuggestionChipDefaults.INSTANCE.m2972getHeightD9Ej5fM();
                            PaddingValues paddingValues2 = SuggestionChipPadding;
                            int i202 = i13 << 6;
                            int i212 = ((i13 >> 6) & 14) | i6 | ((i13 << 3) & LDSFile.EF_DG16_TAG) | ((i13 >> 3) & 896) | (i202 & 7168) | (i202 & 3670016);
                            int i222 = i13 << 9;
                            int i232 = i212 | (234881024 & i222) | (i222 & 1879048192);
                            int i242 = i13 >> 21;
                            ChipColors chipColors42 = chipColors2;
                            Function2<? super Composer, ? super Integer, Unit> function282 = function23;
                            Modifier modifier42 = modifier2;
                            m2308ChipnkUnTEs(modifier42, function02, z4, function282, value2, jM2299labelColorvNxB06k$material3_release2, function25, null, shape4, chipColors42, chipElevation2, borderStroke2, fM2972getHeightD9Ej5fM2, paddingValues2, mutableInteractionSource3, composerStartRestartGroup, i232, (i242 & LDSFile.EF_DG16_TAG) | (i242 & 14) | 3456 | ((i13 >> 15) & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = composerStartRestartGroup;
                            modifier2 = modifier42;
                            z5 = z4;
                            function26 = function25;
                            shape5 = shape4;
                            chipColors3 = chipColors42;
                            chipElevation3 = chipElevation2;
                            borderStroke3 = borderStroke2;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function24 = function22;
                if ((196608 & i) != 0) {
                }
                if ((1572864 & i) != 0) {
                }
                if ((i & 12582912) != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i7 = i2 & 512;
                if (i7 != 0) {
                }
                i8 = i7;
                mutableInteractionSource2 = mutableInteractionSource;
                int i1822 = i3;
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function24 = function22;
            if ((196608 & i) != 0) {
            }
            if ((1572864 & i) != 0) {
            }
            if ((i & 12582912) != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i7 = i2 & 512;
            if (i7 != 0) {
            }
            i8 = i7;
            mutableInteractionSource2 = mutableInteractionSource;
            int i18222 = i3;
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function24 = function22;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i7 = i2 & 512;
        if (i7 != 0) {
        }
        i8 = i7;
        mutableInteractionSource2 = mutableInteractionSource;
        int i182222 = i3;
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0112  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with SuggestionChip that take a BorderStroke instead", replaceWith = @ReplaceWith(expression = "SuggestionChip(onClick, label, modifier, enabled, icon, shape, colors, elevation, border, interactionSource", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void SuggestionChip(final Function0 function0, final Function2 function2, Modifier modifier, boolean z, Function2 function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        Function0 function02;
        int i3;
        Function2 function23;
        final Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Function2 function24;
        Shape shape2;
        ChipColors chipColors2;
        int i6;
        ChipElevation chipElevationM2977suggestionChipElevationaqJV_2Y;
        int i7;
        int i8;
        MutableInteractionSource mutableInteractionSource2;
        int i9;
        Shape shape3;
        ChipColors chipColorsSuggestionChipColors;
        int i10;
        Composer composer2;
        ChipBorder chipBorderM2974suggestionChipBorderd_3_b6Q;
        MutableInteractionSource mutableInteractionSource3;
        ChipColors chipColors3;
        Function2 function25;
        int i11;
        ChipElevation chipElevation2;
        boolean z3;
        Shape shape4;
        Composer composer3;
        final ChipBorder chipBorder2;
        final boolean z4;
        final Function2 function26;
        final Shape shape5;
        final ChipColors chipColors4;
        final ChipElevation chipElevation3;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(170629701);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SuggestionChip)P(8,6,7,3,4,9,1,2)824@39441L5,825@39496L22,826@39575L25,827@39651L22,828@39725L39,835@39946L5,830@39774L568:Chip.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(function02) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function23) ? 32 : 16;
            }
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
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
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        function24 = function22;
                        i3 |= composerStartRestartGroup.changedInstance(function24) ? 16384 : 8192;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            int i13 = composerStartRestartGroup.changed(shape2) ? 131072 : 65536;
                            i3 |= i13;
                        } else {
                            shape2 = shape;
                        }
                        i3 |= i13;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            chipColors2 = chipColors;
                            int i14 = composerStartRestartGroup.changed(chipColors2) ? 1048576 : 524288;
                            i3 |= i14;
                        } else {
                            chipColors2 = chipColors;
                        }
                        i3 |= i14;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 12582912) != 0) {
                        i6 = 12582912;
                        if ((i2 & 128) == 0) {
                            chipElevationM2977suggestionChipElevationaqJV_2Y = chipElevation;
                            int i15 = composerStartRestartGroup.changed(chipElevationM2977suggestionChipElevationaqJV_2Y) ? 8388608 : 4194304;
                            i3 |= i15;
                        } else {
                            chipElevationM2977suggestionChipElevationaqJV_2Y = chipElevation;
                        }
                        i3 |= i15;
                    } else {
                        i6 = 12582912;
                        chipElevationM2977suggestionChipElevationaqJV_2Y = chipElevation;
                    }
                    if ((i & 100663296) == 0) {
                        i3 |= ((i2 & 256) == 0 && composerStartRestartGroup.changed(chipBorder)) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i7 = i2 & 512;
                    if (i7 != 0) {
                        if ((i & 805306368) == 0) {
                            i8 = i7;
                            mutableInteractionSource2 = mutableInteractionSource;
                            i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? PKIFailureInfo.duplicateCertReq : 268435456;
                        }
                        int i16 = i3;
                        if ((i3 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            z4 = z2;
                            composer3 = composerStartRestartGroup;
                            function26 = function24;
                            shape5 = shape2;
                            chipColors4 = chipColors2;
                            chipElevation3 = chipElevationM2977suggestionChipElevationaqJV_2Y;
                            chipBorder2 = chipBorder;
                            mutableInteractionSource4 = mutableInteractionSource2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i12 == 0 ? Modifier.INSTANCE : modifier2;
                                boolean z5 = i4 == 0 ? true : z2;
                                Function2 function27 = i5 == 0 ? null : function24;
                                if ((i2 & 32) == 0) {
                                    i9 = i16 & (-458753);
                                    shape3 = SuggestionChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                } else {
                                    i9 = i16;
                                    shape3 = shape2;
                                }
                                if ((i2 & 64) == 0) {
                                    i9 &= -3670017;
                                    chipColorsSuggestionChipColors = SuggestionChipDefaults.INSTANCE.suggestionChipColors(composerStartRestartGroup, 6);
                                } else {
                                    chipColorsSuggestionChipColors = chipColors2;
                                }
                                int i17 = i9;
                                if ((i2 & 128) == 0) {
                                    composer2 = composerStartRestartGroup;
                                    i17 &= -29360129;
                                    i10 = 6;
                                    chipElevationM2977suggestionChipElevationaqJV_2Y = SuggestionChipDefaults.INSTANCE.m2977suggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, 1572864, 63);
                                } else {
                                    i10 = 6;
                                    composer2 = composerStartRestartGroup;
                                }
                                if ((i2 & 256) == 0) {
                                    composerStartRestartGroup = composer2;
                                    chipBorderM2974suggestionChipBorderd_3_b6Q = SuggestionChipDefaults.INSTANCE.m2974suggestionChipBorderd_3_b6Q(0L, 0L, 0.0f, composerStartRestartGroup, 3072, 7);
                                    i17 &= -234881025;
                                } else {
                                    composerStartRestartGroup = composer2;
                                    chipBorderM2974suggestionChipBorderd_3_b6Q = chipBorder;
                                }
                                if (i8 == 0) {
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1248029210, "CC(remember):Chip.kt#9igjgp");
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    modifier2 = companion;
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    modifier2 = companion;
                                }
                                chipColors3 = chipColorsSuggestionChipColors;
                                function25 = function27;
                                i11 = i17;
                                chipElevation2 = chipElevationM2977suggestionChipElevationaqJV_2Y;
                                z3 = z5;
                                shape4 = shape3;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i16 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i16 &= -3670017;
                                }
                                if ((i2 & 128) != 0) {
                                    i16 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i16 &= -234881025;
                                }
                                chipBorderM2974suggestionChipBorderd_3_b6Q = chipBorder;
                                mutableInteractionSource3 = mutableInteractionSource;
                                function25 = function24;
                                shape4 = shape2;
                                chipColors3 = chipColors2;
                                chipElevation2 = chipElevationM2977suggestionChipElevationaqJV_2Y;
                                i10 = 6;
                                z3 = z2;
                                i11 = i16;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(170629701, i11, -1, "androidx.compose.material3.SuggestionChip (Chip.kt:830)");
                            }
                            TextStyle value = TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, i10);
                            long jM2299labelColorvNxB06k$material3_release = chipColors3.m2299labelColorvNxB06k$material3_release(z3);
                            composerStartRestartGroup.startReplaceGroup(1248043208);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "842@40163L21");
                            State<BorderStroke> stateBorderStroke$material3_release = chipBorderM2974suggestionChipBorderd_3_b6Q != null ? null : chipBorderM2974suggestionChipBorderd_3_b6Q.borderStroke$material3_release(z3, composerStartRestartGroup, ((i11 >> 9) & 14) | ((i11 >> 21) & LDSFile.EF_DG16_TAG));
                            composerStartRestartGroup.endReplaceGroup();
                            BorderStroke value2 = stateBorderStroke$material3_release != null ? stateBorderStroke$material3_release.getValue() : null;
                            float fM2972getHeightD9Ej5fM = SuggestionChipDefaults.INSTANCE.m2972getHeightD9Ej5fM();
                            PaddingValues paddingValues = SuggestionChipPadding;
                            int i18 = i11 << 6;
                            int i19 = ((i11 >> 6) & 14) | i6 | ((i11 << 3) & LDSFile.EF_DG16_TAG) | ((i11 >> 3) & 896) | (i18 & 7168) | (i18 & 3670016);
                            int i20 = i11 << 9;
                            ChipColors chipColors5 = chipColors3;
                            composer3 = composerStartRestartGroup;
                            Function2 function28 = function23;
                            Modifier modifier3 = modifier2;
                            m2308ChipnkUnTEs(modifier3, function02, z3, function28, value, jM2299labelColorvNxB06k$material3_release, function25, null, shape4, chipColors5, chipElevation2, value2, fM2972getHeightD9Ej5fM, paddingValues, mutableInteractionSource3, composer3, i19 | (234881024 & i20) | (i20 & 1879048192), ((i11 >> 21) & 14) | 3456 | ((i11 >> 15) & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            chipBorder2 = chipBorderM2974suggestionChipBorderd_3_b6Q;
                            modifier2 = modifier3;
                            z4 = z3;
                            function26 = function25;
                            shape5 = shape4;
                            chipColors4 = chipColors5;
                            chipElevation3 = chipElevation2;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.SuggestionChip.3
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

                                public final void invoke(Composer composer4, int i21) {
                                    ChipKt.SuggestionChip(function0, function2, modifier2, z4, function26, shape5, chipColors4, chipElevation3, chipBorder2, mutableInteractionSource4, composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 805306368;
                    i8 = i7;
                    mutableInteractionSource2 = mutableInteractionSource;
                    int i162 = i3;
                    if ((i3 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i12 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if ((i2 & 32) == 0) {
                            }
                            if ((i2 & 64) == 0) {
                            }
                            int i172 = i9;
                            if ((i2 & 128) == 0) {
                            }
                            if ((i2 & 256) == 0) {
                            }
                            if (i8 == 0) {
                            }
                            chipColors3 = chipColorsSuggestionChipColors;
                            function25 = function27;
                            i11 = i172;
                            chipElevation2 = chipElevationM2977suggestionChipElevationaqJV_2Y;
                            z3 = z5;
                            shape4 = shape3;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            TextStyle value3 = TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, i10);
                            long jM2299labelColorvNxB06k$material3_release2 = chipColors3.m2299labelColorvNxB06k$material3_release(z3);
                            composerStartRestartGroup.startReplaceGroup(1248043208);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "842@40163L21");
                            if (chipBorderM2974suggestionChipBorderd_3_b6Q != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            if (stateBorderStroke$material3_release != null) {
                            }
                            float fM2972getHeightD9Ej5fM2 = SuggestionChipDefaults.INSTANCE.m2972getHeightD9Ej5fM();
                            PaddingValues paddingValues2 = SuggestionChipPadding;
                            int i182 = i11 << 6;
                            int i192 = ((i11 >> 6) & 14) | i6 | ((i11 << 3) & LDSFile.EF_DG16_TAG) | ((i11 >> 3) & 896) | (i182 & 7168) | (i182 & 3670016);
                            int i202 = i11 << 9;
                            ChipColors chipColors52 = chipColors3;
                            composer3 = composerStartRestartGroup;
                            Function2 function282 = function23;
                            Modifier modifier32 = modifier2;
                            m2308ChipnkUnTEs(modifier32, function02, z3, function282, value3, jM2299labelColorvNxB06k$material3_release2, function25, null, shape4, chipColors52, chipElevation2, value2, fM2972getHeightD9Ej5fM2, paddingValues2, mutableInteractionSource3, composer3, i192 | (234881024 & i202) | (i202 & 1879048192), ((i11 >> 21) & 14) | 3456 | ((i11 >> 15) & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            chipBorder2 = chipBorderM2974suggestionChipBorderd_3_b6Q;
                            modifier2 = modifier32;
                            z4 = z3;
                            function26 = function25;
                            shape5 = shape4;
                            chipColors4 = chipColors52;
                            chipElevation3 = chipElevation2;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function24 = function22;
                if ((196608 & i) != 0) {
                }
                if ((1572864 & i) != 0) {
                }
                if ((i & 12582912) != 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i7 = i2 & 512;
                if (i7 != 0) {
                }
                i8 = i7;
                mutableInteractionSource2 = mutableInteractionSource;
                int i1622 = i3;
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function24 = function22;
            if ((196608 & i) != 0) {
            }
            if ((1572864 & i) != 0) {
            }
            if ((i & 12582912) != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i7 = i2 & 512;
            if (i7 != 0) {
            }
            i8 = i7;
            mutableInteractionSource2 = mutableInteractionSource;
            int i16222 = i3;
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function24 = function22;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i7 = i2 & 512;
        if (i7 != 0) {
        }
        i8 = i7;
        mutableInteractionSource2 = mutableInteractionSource;
        int i162222 = i3;
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedSuggestionChip(final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z, Function2<? super Composer, ? super Integer, Unit> function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function23;
        final Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Shape shape2;
        ChipColors chipColors2;
        int i6;
        ChipElevation chipElevationM2971elevatedSuggestionChipElevationaqJV_2Y;
        int i7;
        int i8;
        int i9;
        int i10;
        MutableInteractionSource mutableInteractionSource2;
        Modifier.Companion companion;
        int i11;
        Shape shape3;
        ChipColors chipColorsElevatedSuggestionChipColors;
        int i12;
        BorderStroke borderStroke2;
        int i13;
        MutableInteractionSource mutableInteractionSource3;
        Function2<? super Composer, ? super Integer, Unit> function25;
        ChipElevation chipElevation2;
        boolean z3;
        Shape shape4;
        Composer composer2;
        final boolean z4;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Shape shape5;
        final ChipColors chipColors3;
        final ChipElevation chipElevation3;
        final BorderStroke borderStroke3;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-818834969);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ElevatedSuggestionChip)P(8,6,7,3,4,9,1,2)897@43055L5,898@43110L30,899@43197L33,908@43503L5,903@43331L538:Chip.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(function02) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function23) ? 32 : 16;
            }
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
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
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        function24 = function22;
                        i3 |= composerStartRestartGroup.changedInstance(function24) ? 16384 : 8192;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            int i15 = composerStartRestartGroup.changed(shape2) ? 131072 : 65536;
                            i3 |= i15;
                        } else {
                            shape2 = shape;
                        }
                        i3 |= i15;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            chipColors2 = chipColors;
                            int i16 = composerStartRestartGroup.changed(chipColors2) ? 1048576 : 524288;
                            i3 |= i16;
                        } else {
                            chipColors2 = chipColors;
                        }
                        i3 |= i16;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 12582912) != 0) {
                        i6 = 12582912;
                        if ((i2 & 128) == 0) {
                            chipElevationM2971elevatedSuggestionChipElevationaqJV_2Y = chipElevation;
                            int i17 = composerStartRestartGroup.changed(chipElevationM2971elevatedSuggestionChipElevationaqJV_2Y) ? 8388608 : 4194304;
                            i3 |= i17;
                        } else {
                            chipElevationM2971elevatedSuggestionChipElevationaqJV_2Y = chipElevation;
                        }
                        i3 |= i17;
                    } else {
                        i6 = 12582912;
                        chipElevationM2971elevatedSuggestionChipElevationaqJV_2Y = chipElevation;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else {
                        if ((i & 100663296) == 0) {
                            i8 = i14;
                            i3 |= composerStartRestartGroup.changed(borderStroke) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i9 = i2 & 512;
                        if (i9 == 0) {
                            if ((i & 805306368) == 0) {
                                i10 = i9;
                                mutableInteractionSource2 = mutableInteractionSource;
                                i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? PKIFailureInfo.duplicateCertReq : 268435456;
                            }
                            int i18 = i3;
                            if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                    boolean z5 = i4 == 0 ? true : z2;
                                    Function2<? super Composer, ? super Integer, Unit> function27 = i5 == 0 ? null : function24;
                                    if ((i2 & 32) == 0) {
                                        i11 = i18 & (-458753);
                                        shape3 = SuggestionChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                    } else {
                                        i11 = i18;
                                        shape3 = shape2;
                                    }
                                    if ((i2 & 64) == 0) {
                                        i11 &= -3670017;
                                        chipColorsElevatedSuggestionChipColors = SuggestionChipDefaults.INSTANCE.elevatedSuggestionChipColors(composerStartRestartGroup, 6);
                                    } else {
                                        chipColorsElevatedSuggestionChipColors = chipColors2;
                                    }
                                    int i19 = i11;
                                    if ((i2 & 128) == 0) {
                                        i19 &= -29360129;
                                        i12 = 6;
                                        chipElevationM2971elevatedSuggestionChipElevationaqJV_2Y = SuggestionChipDefaults.INSTANCE.m2971elevatedSuggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                                    } else {
                                        i12 = 6;
                                    }
                                    int i20 = i19;
                                    borderStroke2 = i7 == 0 ? null : borderStroke;
                                    i13 = i20;
                                    if (i10 == 0) {
                                        chipColors2 = chipColorsElevatedSuggestionChipColors;
                                        mutableInteractionSource3 = null;
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource;
                                        chipColors2 = chipColorsElevatedSuggestionChipColors;
                                    }
                                    function25 = function27;
                                    chipElevation2 = chipElevationM2971elevatedSuggestionChipElevationaqJV_2Y;
                                    z3 = z5;
                                    shape4 = shape3;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 32) != 0) {
                                        i18 &= -458753;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i18 &= -3670017;
                                    }
                                    if ((i2 & 128) != 0) {
                                        i18 &= -29360129;
                                    }
                                    borderStroke2 = borderStroke;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    companion = modifier2;
                                    function25 = function24;
                                    shape4 = shape2;
                                    chipElevation2 = chipElevationM2971elevatedSuggestionChipElevationaqJV_2Y;
                                    i13 = i18;
                                    i12 = 6;
                                    z3 = z2;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-818834969, i13, -1, "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:903)");
                                }
                                TextStyle value = TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, i12);
                                long jM2299labelColorvNxB06k$material3_release = chipColors2.m2299labelColorvNxB06k$material3_release(z3);
                                float fM2972getHeightD9Ej5fM = SuggestionChipDefaults.INSTANCE.m2972getHeightD9Ej5fM();
                                PaddingValues paddingValues = SuggestionChipPadding;
                                int i21 = i13 << 6;
                                int i22 = ((i13 >> 6) & 14) | i6 | ((i13 << 3) & LDSFile.EF_DG16_TAG) | ((i13 >> 3) & 896) | (i21 & 7168) | (i21 & 3670016);
                                int i23 = i13 << 9;
                                int i24 = i22 | (234881024 & i23) | (i23 & 1879048192);
                                int i25 = i13 >> 21;
                                ChipColors chipColors4 = chipColors2;
                                Function2<? super Composer, ? super Integer, Unit> function28 = function23;
                                Modifier modifier3 = companion;
                                m2308ChipnkUnTEs(modifier3, function02, z3, function28, value, jM2299labelColorvNxB06k$material3_release, function25, null, shape4, chipColors4, chipElevation2, borderStroke2, fM2972getHeightD9Ej5fM, paddingValues, mutableInteractionSource3, composerStartRestartGroup, i24, (i25 & LDSFile.EF_DG16_TAG) | (i25 & 14) | 3456 | ((i13 >> 15) & 57344));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2 = composerStartRestartGroup;
                                modifier2 = modifier3;
                                z4 = z3;
                                function26 = function25;
                                shape5 = shape4;
                                chipColors3 = chipColors4;
                                chipElevation3 = chipElevation2;
                                borderStroke3 = borderStroke2;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                z4 = z2;
                                function26 = function24;
                                composer2 = composerStartRestartGroup;
                                shape5 = shape2;
                                chipColors3 = chipColors2;
                                chipElevation3 = chipElevationM2971elevatedSuggestionChipElevationaqJV_2Y;
                                borderStroke3 = borderStroke;
                                mutableInteractionSource4 = mutableInteractionSource2;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.ElevatedSuggestionChip.1
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

                                    public final void invoke(Composer composer3, int i26) {
                                        ChipKt.ElevatedSuggestionChip(function0, function2, modifier2, z4, function26, shape5, chipColors3, chipElevation3, borderStroke3, mutableInteractionSource4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 805306368;
                        i10 = i9;
                        mutableInteractionSource2 = mutableInteractionSource;
                        int i182 = i3;
                        if ((i3 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i8 == 0) {
                                }
                                if (i4 == 0) {
                                }
                                if (i5 == 0) {
                                }
                                if ((i2 & 32) == 0) {
                                }
                                if ((i2 & 64) == 0) {
                                }
                                int i192 = i11;
                                if ((i2 & 128) == 0) {
                                }
                                int i202 = i192;
                                borderStroke2 = i7 == 0 ? null : borderStroke;
                                i13 = i202;
                                if (i10 == 0) {
                                }
                                function25 = function27;
                                chipElevation2 = chipElevationM2971elevatedSuggestionChipElevationaqJV_2Y;
                                z3 = z5;
                                shape4 = shape3;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                TextStyle value2 = TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, i12);
                                long jM2299labelColorvNxB06k$material3_release2 = chipColors2.m2299labelColorvNxB06k$material3_release(z3);
                                float fM2972getHeightD9Ej5fM2 = SuggestionChipDefaults.INSTANCE.m2972getHeightD9Ej5fM();
                                PaddingValues paddingValues2 = SuggestionChipPadding;
                                int i212 = i13 << 6;
                                int i222 = ((i13 >> 6) & 14) | i6 | ((i13 << 3) & LDSFile.EF_DG16_TAG) | ((i13 >> 3) & 896) | (i212 & 7168) | (i212 & 3670016);
                                int i232 = i13 << 9;
                                int i242 = i222 | (234881024 & i232) | (i232 & 1879048192);
                                int i252 = i13 >> 21;
                                ChipColors chipColors42 = chipColors2;
                                Function2<? super Composer, ? super Integer, Unit> function282 = function23;
                                Modifier modifier32 = companion;
                                m2308ChipnkUnTEs(modifier32, function02, z3, function282, value2, jM2299labelColorvNxB06k$material3_release2, function25, null, shape4, chipColors42, chipElevation2, borderStroke2, fM2972getHeightD9Ej5fM2, paddingValues2, mutableInteractionSource3, composerStartRestartGroup, i242, (i252 & LDSFile.EF_DG16_TAG) | (i252 & 14) | 3456 | ((i13 >> 15) & 57344));
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composer2 = composerStartRestartGroup;
                                modifier2 = modifier32;
                                z4 = z3;
                                function26 = function25;
                                shape5 = shape4;
                                chipColors3 = chipColors42;
                                chipElevation3 = chipElevation2;
                                borderStroke3 = borderStroke2;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i8 = i14;
                    i9 = i2 & 512;
                    if (i9 == 0) {
                    }
                    i10 = i9;
                    mutableInteractionSource2 = mutableInteractionSource;
                    int i1822 = i3;
                    if ((i3 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function24 = function22;
                if ((196608 & i) != 0) {
                }
                if ((1572864 & i) != 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                i8 = i14;
                i9 = i2 & 512;
                if (i9 == 0) {
                }
                i10 = i9;
                mutableInteractionSource2 = mutableInteractionSource;
                int i18222 = i3;
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function24 = function22;
            if ((196608 & i) != 0) {
            }
            if ((1572864 & i) != 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            i8 = i14;
            i9 = i2 & 512;
            if (i9 == 0) {
            }
            i10 = i9;
            mutableInteractionSource2 = mutableInteractionSource;
            int i182222 = i3;
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function24 = function22;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i8 = i14;
        i9 = i2 & 512;
        if (i9 == 0) {
        }
        i10 = i9;
        mutableInteractionSource2 = mutableInteractionSource;
        int i1822222 = i3;
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ff  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with ElevatedSuggestionChip that take a BorderStroke instead", replaceWith = @ReplaceWith(expression = "ElevatedSuggestionChip(onClick, label, modifier, enabled, icon, shape, colors, elevation, border, interactionSource", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void ElevatedSuggestionChip(final Function0 function0, final Function2 function2, Modifier modifier, boolean z, Function2 function22, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        Function0 function02;
        int i3;
        Function2 function23;
        final Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Function2 function24;
        Shape shape2;
        ChipColors chipColors2;
        int i6;
        ChipElevation chipElevationM2971elevatedSuggestionChipElevationaqJV_2Y;
        int i7;
        int i8;
        int i9;
        int i10;
        MutableInteractionSource mutableInteractionSource2;
        Modifier.Companion companion;
        int i11;
        Shape shape3;
        ChipColors chipColorsElevatedSuggestionChipColors;
        int i12;
        ChipBorder chipBorder2;
        MutableInteractionSource mutableInteractionSource3;
        Function2 function25;
        int i13;
        ChipElevation chipElevation2;
        boolean z3;
        Shape shape4;
        final ChipBorder chipBorder3;
        Composer composer2;
        final boolean z4;
        final Function2 function26;
        final Shape shape5;
        final ChipColors chipColors3;
        final ChipElevation chipElevation3;
        final MutableInteractionSource mutableInteractionSource4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1668751803);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ElevatedSuggestionChip)P(8,6,7,3,4,9,1,2)980@46960L5,981@47015L30,982@47102L33,984@47219L39,991@47440L5,986@47268L568:Chip.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(function02) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function23 = function2;
        } else {
            function23 = function2;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function23) ? 32 : 16;
            }
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
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
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        function24 = function22;
                        i3 |= composerStartRestartGroup.changedInstance(function24) ? 16384 : 8192;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            int i15 = composerStartRestartGroup.changed(shape2) ? 131072 : 65536;
                            i3 |= i15;
                        } else {
                            shape2 = shape;
                        }
                        i3 |= i15;
                    } else {
                        shape2 = shape;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            chipColors2 = chipColors;
                            int i16 = composerStartRestartGroup.changed(chipColors2) ? 1048576 : 524288;
                            i3 |= i16;
                        } else {
                            chipColors2 = chipColors;
                        }
                        i3 |= i16;
                    } else {
                        chipColors2 = chipColors;
                    }
                    if ((i & 12582912) != 0) {
                        i6 = 12582912;
                        if ((i2 & 128) == 0) {
                            chipElevationM2971elevatedSuggestionChipElevationaqJV_2Y = chipElevation;
                            int i17 = composerStartRestartGroup.changed(chipElevationM2971elevatedSuggestionChipElevationaqJV_2Y) ? 8388608 : 4194304;
                            i3 |= i17;
                        } else {
                            chipElevationM2971elevatedSuggestionChipElevationaqJV_2Y = chipElevation;
                        }
                        i3 |= i17;
                    } else {
                        i6 = 12582912;
                        chipElevationM2971elevatedSuggestionChipElevationaqJV_2Y = chipElevation;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else {
                        if ((i & 100663296) == 0) {
                            i8 = i14;
                            i3 |= composerStartRestartGroup.changed(chipBorder) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i9 = i2 & 512;
                        if (i9 == 0) {
                            if ((i & 805306368) == 0) {
                                i10 = i9;
                                mutableInteractionSource2 = mutableInteractionSource;
                                i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? PKIFailureInfo.duplicateCertReq : 268435456;
                            }
                            int i18 = i3;
                            if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                    boolean z5 = i4 == 0 ? true : z2;
                                    Function2 function27 = i5 == 0 ? null : function24;
                                    if ((i2 & 32) == 0) {
                                        i11 = i18 & (-458753);
                                        shape3 = SuggestionChipDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                    } else {
                                        i11 = i18;
                                        shape3 = shape2;
                                    }
                                    if ((i2 & 64) == 0) {
                                        i11 &= -3670017;
                                        chipColorsElevatedSuggestionChipColors = SuggestionChipDefaults.INSTANCE.elevatedSuggestionChipColors(composerStartRestartGroup, 6);
                                    } else {
                                        chipColorsElevatedSuggestionChipColors = chipColors2;
                                    }
                                    int i19 = i11;
                                    if ((i2 & 128) == 0) {
                                        i19 &= -29360129;
                                        i12 = 6;
                                        chipElevationM2971elevatedSuggestionChipElevationaqJV_2Y = SuggestionChipDefaults.INSTANCE.m2971elevatedSuggestionChipElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 1572864, 63);
                                    } else {
                                        i12 = 6;
                                    }
                                    chipBorder2 = i7 == 0 ? null : chipBorder;
                                    if (i10 == 0) {
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2121795492, "CC(remember):Chip.kt#9igjgp");
                                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource;
                                    }
                                    chipColors2 = chipColorsElevatedSuggestionChipColors;
                                    function25 = function27;
                                    i13 = i19;
                                    chipElevation2 = chipElevationM2971elevatedSuggestionChipElevationaqJV_2Y;
                                    z3 = z5;
                                    shape4 = shape3;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 32) != 0) {
                                        i18 &= -458753;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i18 &= -3670017;
                                    }
                                    if ((i2 & 128) != 0) {
                                        i18 &= -29360129;
                                    }
                                    chipBorder2 = chipBorder;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    companion = modifier2;
                                    function25 = function24;
                                    shape4 = shape2;
                                    chipElevation2 = chipElevationM2971elevatedSuggestionChipElevationaqJV_2Y;
                                    i12 = 6;
                                    z3 = z2;
                                    i13 = i18;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1668751803, i13, -1, "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:986)");
                                }
                                TextStyle value = TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, i12);
                                long jM2299labelColorvNxB06k$material3_release = chipColors2.m2299labelColorvNxB06k$material3_release(z3);
                                float fM2972getHeightD9Ej5fM = SuggestionChipDefaults.INSTANCE.m2972getHeightD9Ej5fM();
                                PaddingValues paddingValues = SuggestionChipPadding;
                                composerStartRestartGroup.startReplaceGroup(2121812626);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "1000@47755L21");
                                State<BorderStroke> stateBorderStroke$material3_release = chipBorder2 != null ? null : chipBorder2.borderStroke$material3_release(z3, composerStartRestartGroup, ((i13 >> 9) & 14) | ((i13 >> 21) & LDSFile.EF_DG16_TAG));
                                composerStartRestartGroup.endReplaceGroup();
                                BorderStroke value2 = stateBorderStroke$material3_release != null ? stateBorderStroke$material3_release.getValue() : null;
                                int i20 = i13 << 6;
                                int i21 = ((i13 >> 6) & 14) | i6 | ((i13 << 3) & LDSFile.EF_DG16_TAG) | ((i13 >> 3) & 896) | (i20 & 7168) | (i20 & 3670016);
                                int i22 = i13 << 9;
                                ChipColors chipColors4 = chipColors2;
                                Function2 function28 = function23;
                                Modifier modifier3 = companion;
                                m2308ChipnkUnTEs(modifier3, function02, z3, function28, value, jM2299labelColorvNxB06k$material3_release, function25, null, shape4, chipColors4, chipElevation2, value2, fM2972getHeightD9Ej5fM, paddingValues, mutableInteractionSource3, composerStartRestartGroup, i21 | (234881024 & i22) | (i22 & 1879048192), ((i13 >> 21) & 14) | 3456 | ((i13 >> 15) & 57344));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                chipBorder3 = chipBorder2;
                                composer2 = composerStartRestartGroup;
                                modifier2 = modifier3;
                                z4 = z3;
                                function26 = function25;
                                shape5 = shape4;
                                chipColors3 = chipColors4;
                                chipElevation3 = chipElevation2;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                z4 = z2;
                                function26 = function24;
                                composer2 = composerStartRestartGroup;
                                shape5 = shape2;
                                chipColors3 = chipColors2;
                                chipElevation3 = chipElevationM2971elevatedSuggestionChipElevationaqJV_2Y;
                                chipBorder3 = chipBorder;
                                mutableInteractionSource4 = mutableInteractionSource2;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt.ElevatedSuggestionChip.3
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

                                    public final void invoke(Composer composer3, int i23) {
                                        ChipKt.ElevatedSuggestionChip(function0, function2, modifier2, z4, function26, shape5, chipColors3, chipElevation3, chipBorder3, mutableInteractionSource4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 805306368;
                        i10 = i9;
                        mutableInteractionSource2 = mutableInteractionSource;
                        int i182 = i3;
                        if ((i3 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i8 == 0) {
                                }
                                if (i4 == 0) {
                                }
                                if (i5 == 0) {
                                }
                                if ((i2 & 32) == 0) {
                                }
                                if ((i2 & 64) == 0) {
                                }
                                int i192 = i11;
                                if ((i2 & 128) == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                chipColors2 = chipColorsElevatedSuggestionChipColors;
                                function25 = function27;
                                i13 = i192;
                                chipElevation2 = chipElevationM2971elevatedSuggestionChipElevationaqJV_2Y;
                                z3 = z5;
                                shape4 = shape3;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                TextStyle value3 = TypographyKt.getValue(SuggestionChipTokens.INSTANCE.getLabelTextFont(), composerStartRestartGroup, i12);
                                long jM2299labelColorvNxB06k$material3_release2 = chipColors2.m2299labelColorvNxB06k$material3_release(z3);
                                float fM2972getHeightD9Ej5fM2 = SuggestionChipDefaults.INSTANCE.m2972getHeightD9Ej5fM();
                                PaddingValues paddingValues2 = SuggestionChipPadding;
                                composerStartRestartGroup.startReplaceGroup(2121812626);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "1000@47755L21");
                                if (chipBorder2 != null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                if (stateBorderStroke$material3_release != null) {
                                }
                                int i202 = i13 << 6;
                                int i212 = ((i13 >> 6) & 14) | i6 | ((i13 << 3) & LDSFile.EF_DG16_TAG) | ((i13 >> 3) & 896) | (i202 & 7168) | (i202 & 3670016);
                                int i222 = i13 << 9;
                                ChipColors chipColors42 = chipColors2;
                                Function2 function282 = function23;
                                Modifier modifier32 = companion;
                                m2308ChipnkUnTEs(modifier32, function02, z3, function282, value3, jM2299labelColorvNxB06k$material3_release2, function25, null, shape4, chipColors42, chipElevation2, value2, fM2972getHeightD9Ej5fM2, paddingValues2, mutableInteractionSource3, composerStartRestartGroup, i212 | (234881024 & i222) | (i222 & 1879048192), ((i13 >> 21) & 14) | 3456 | ((i13 >> 15) & 57344));
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                chipBorder3 = chipBorder2;
                                composer2 = composerStartRestartGroup;
                                modifier2 = modifier32;
                                z4 = z3;
                                function26 = function25;
                                shape5 = shape4;
                                chipColors3 = chipColors42;
                                chipElevation3 = chipElevation2;
                                mutableInteractionSource4 = mutableInteractionSource3;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i8 = i14;
                    i9 = i2 & 512;
                    if (i9 == 0) {
                    }
                    i10 = i9;
                    mutableInteractionSource2 = mutableInteractionSource;
                    int i1822 = i3;
                    if ((i3 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function24 = function22;
                if ((196608 & i) != 0) {
                }
                if ((1572864 & i) != 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                i8 = i14;
                i9 = i2 & 512;
                if (i9 == 0) {
                }
                i10 = i9;
                mutableInteractionSource2 = mutableInteractionSource;
                int i18222 = i3;
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function24 = function22;
            if ((196608 & i) != 0) {
            }
            if ((1572864 & i) != 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            i8 = i14;
            i9 = i2 & 512;
            if (i9 == 0) {
            }
            i10 = i9;
            mutableInteractionSource2 = mutableInteractionSource;
            int i182222 = i3;
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function24 = function22;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i8 = i14;
        i9 = i2 & 512;
        if (i9 == 0) {
        }
        i10 = i9;
        mutableInteractionSource2 = mutableInteractionSource;
        int i1822222 = i3;
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Chip-nkUnTEs, reason: not valid java name */
    public static final void m2308ChipnkUnTEs(final Modifier modifier, final Function0<Unit> function0, final boolean z, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final long j, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Shape shape, final ChipColors chipColors, final ChipElevation chipElevation, final BorderStroke borderStroke, final float f, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i4;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
        Composer composerStartRestartGroup = composer.startRestartGroup(1400504719);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Chip)P(10,11,3,5,7,6:c#ui.graphics.Color,8,14,13,1,2!1,9:c#ui.unit.Dp,12)1975@97230L477,1966@96860L847:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function24 = function2;
            i3 |= composerStartRestartGroup.changedInstance(function24) ? 2048 : 1024;
        } else {
            function24 = function2;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(textStyle) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function23) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changed(shape) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changed(chipColors) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changed(chipElevation) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(borderStroke) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(paddingValues) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
        }
        int i5 = i4;
        if ((i3 & 306783379) != 306783378 || (i5 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1400504719, i3, i5, "androidx.compose.material3.Chip (Chip.kt:1963)");
            }
            composerStartRestartGroup.startReplaceGroup(1985614987);
            ComposerKt.sourceInformation(composerStartRestartGroup, "1965@96816L39");
            if (mutableInteractionSource2 == null) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1985615638, "CC(remember):Chip.kt#9igjgp");
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ChipKt$Chip$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.m6369setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m6350getButtono7Vup1c());
                }
            }, 1, null);
            long jM2289containerColorvNxB06k$material3_release = chipColors.m2289containerColorvNxB06k$material3_release(z);
            composerStartRestartGroup.startReplaceGroup(1985624506);
            ComposerKt.sourceInformation(composerStartRestartGroup, "1972@97093L43");
            State<C1959Dp> stateShadowElevation$material3_release = chipElevation != null ? chipElevation.shadowElevation$material3_release(z, mutableInteractionSource2, composerStartRestartGroup, ((i3 >> 6) & 14) | ((i5 << 6) & 896)) : null;
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            int i6 = i3;
            final Function2<? super Composer, ? super Integer, Unit> function25 = function24;
            SurfaceKt.m2981Surfaceo_FOJdg(function0, modifierSemantics$default, z, shape, jM2289containerColorvNxB06k$material3_release, 0L, 0.0f, stateShadowElevation$material3_release != null ? stateShadowElevation$material3_release.getValue().m7069unboximpl() : C1959Dp.m7055constructorimpl(0), borderStroke, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(-1985962652, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$Chip$2
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

                public final void invoke(Composer composer3, int i7) {
                    ComposerKt.sourceInformation(composer3, "C1976@97240L461:Chip.kt#uh7d8r");
                    if ((i7 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1985962652, i7, -1, "androidx.compose.material3.Chip.<anonymous> (Chip.kt:1976)");
                        }
                        ChipKt.m2309ChipContentfe0OD_I(function25, textStyle, j, function22, null, function23, chipColors.m2300leadingIconContentColorvNxB06k$material3_release(z), chipColors.m2301trailingIconContentColorvNxB06k$material3_release(z), f, paddingValues, composer3, 24576);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composer2, 54), composer2, ((i6 >> 15) & 7168) | ((i6 >> 3) & 14) | (i6 & 896) | ((i5 << 21) & 234881024), 6, 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$Chip$3
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

                public final void invoke(Composer composer3, int i7) {
                    ChipKt.m2308ChipnkUnTEs(modifier, function0, z, function2, textStyle, j, function22, function23, shape, chipColors, chipElevation, borderStroke, f, paddingValues, mutableInteractionSource, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SelectableChip-u0RnIRE, reason: not valid java name */
    public static final void m2310SelectableChipu0RnIRE(final boolean z, final Modifier modifier, final Function0<Unit> function0, final boolean z2, final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final Shape shape, final SelectableChipColors selectableChipColors, final SelectableChipElevation selectableChipElevation, final BorderStroke borderStroke, final float f, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(402951308);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SelectableChip)P(13,10,11,4,6,7,8!1,15,14,2,3!1,9:c#ui.unit.Dp,12)2023@98879L525,2013@98468L936:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
            i3 |= composerStartRestartGroup.changed(textStyle) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function23) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function24) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changed(shape) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changed(selectableChipColors) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(selectableChipElevation) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(borderStroke) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(paddingValues) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
            i4 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
        }
        int i5 = i4;
        if ((i3 & 306783379) != 306783378 || (74899 & i5) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(402951308, i3, i5, "androidx.compose.material3.SelectableChip (Chip.kt:2009)");
            }
            composerStartRestartGroup.startReplaceGroup(2072749057);
            ComposerKt.sourceInformation(composerStartRestartGroup, "2011@98346L39");
            if (mutableInteractionSource == null) {
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2072749708, "CC(remember):Chip.kt#9igjgp");
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
            }
            composerStartRestartGroup.endReplaceGroup();
            int i6 = i3;
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ChipKt$SelectableChip$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.m6369setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m6351getCheckboxo7Vup1c());
                }
            }, 1, null);
            long jM2894containerColorWaAFU9c$material3_release = selectableChipColors.m2894containerColorWaAFU9c$material3_release(z2, z);
            composerStartRestartGroup.startReplaceGroup(2072762384);
            ComposerKt.sourceInformation(composerStartRestartGroup, "2020@98742L43");
            State<C1959Dp> stateShadowElevation$material3_release = selectableChipElevation != null ? selectableChipElevation.shadowElevation$material3_release(z2, mutableInteractionSource2, composerStartRestartGroup, ((i6 >> 9) & 14) | ((i5 << 3) & 896)) : null;
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            SurfaceKt.m2979Surfaced85dljk(z, function0, modifierSemantics$default, z2, shape, jM2894containerColorWaAFU9c$material3_release, 0L, 0.0f, stateShadowElevation$material3_release != null ? stateShadowElevation$material3_release.getValue().m7069unboximpl() : C1959Dp.m7055constructorimpl(0), borderStroke, mutableInteractionSource2, ComposableLambdaKt.rememberComposableLambda(-577614814, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$SelectableChip$2
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

                public final void invoke(Composer composer3, int i7) {
                    ComposerKt.sourceInformation(composer3, "C2024@98889L509:Chip.kt#uh7d8r");
                    if ((i7 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-577614814, i7, -1, "androidx.compose.material3.SelectableChip.<anonymous> (Chip.kt:2024)");
                        }
                        ChipKt.m2309ChipContentfe0OD_I(function2, textStyle, selectableChipColors.m2896labelColorWaAFU9c$material3_release(z2, z), function22, function23, function24, selectableChipColors.m2897leadingIconContentColorWaAFU9c$material3_release(z2, z), selectableChipColors.m2898trailingIconContentColorWaAFU9c$material3_release(z2, z), f, paddingValues, composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composer2, 54), composer2, (i6 & 14) | ((i6 >> 3) & LDSFile.EF_DG16_TAG) | (i6 & 7168) | ((i6 >> 15) & 57344) | ((i5 << 21) & 1879048192), 48, 192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$SelectableChip$3
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

                public final void invoke(Composer composer3, int i7) {
                    ChipKt.m2310SelectableChipu0RnIRE(z, modifier, function0, z2, function2, textStyle, function22, function23, function24, shape, selectableChipColors, selectableChipElevation, borderStroke, f, paddingValues, mutableInteractionSource, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ChipContent-fe0OD_I, reason: not valid java name */
    public static final void m2309ChipContentfe0OD_I(final Function2<? super Composer, ? super Integer, Unit> function2, final TextStyle textStyle, long j, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final Function2<? super Composer, ? super Integer, Unit> function24, final long j2, final long j3, final float f, final PaddingValues paddingValues, Composer composer, final int i) {
        int i2;
        long j4;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        long j5;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-782878228);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ChipContent)P(1,3,2:c#ui.graphics.Color,4!1,8,5:c#ui.graphics.Color,9:c#ui.graphics.Color,6:c#ui.unit.Dp)2055@99907L3519,2052@99781L3645:Chip.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j4 = j;
            i2 |= composerStartRestartGroup.changed(j4) ? 256 : 128;
        } else {
            j4 = j;
        }
        if ((i & 3072) == 0) {
            function25 = function22;
            i2 |= composerStartRestartGroup.changedInstance(function25) ? 2048 : 1024;
        } else {
            function25 = function22;
        }
        if ((i & 24576) == 0) {
            function26 = function23;
            i2 |= composerStartRestartGroup.changedInstance(function26) ? 16384 : 8192;
        } else {
            function26 = function23;
        }
        if ((196608 & i) == 0) {
            function27 = function24;
            i2 |= composerStartRestartGroup.changedInstance(function27) ? 131072 : 65536;
        } else {
            function27 = function24;
        }
        if ((1572864 & i) == 0) {
            j5 = j2;
            i2 |= composerStartRestartGroup.changed(j5) ? 1048576 : 524288;
        } else {
            j5 = j2;
        }
        if ((12582912 & i) == 0) {
            i3 = i2 | (composerStartRestartGroup.changed(j3) ? 8388608 : 4194304);
        } else {
            i3 = i2;
        }
        if ((100663296 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changed(paddingValues) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i3 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-782878228, i3, -1, "androidx.compose.material3.ChipContent (Chip.kt:2051)");
            }
            final Function2<? super Composer, ? super Integer, Unit> function28 = function25;
            final Function2<? super Composer, ? super Integer, Unit> function29 = function26;
            final Function2<? super Composer, ? super Integer, Unit> function210 = function27;
            final long j6 = j5;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4585boximpl(j4)), TextKt.getLocalTextStyle().provides(textStyle)}, ComposableLambdaKt.rememberComposableLambda(1748799148, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$ChipContent$1
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
                    ComposerKt.sourceInformation(composer2, "C2056@99917L3503:Chip.kt#uh7d8r");
                    if ((i4 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1748799148, i4, -1, "androidx.compose.material3.ChipContent.<anonymous> (Chip.kt:2056)");
                        }
                        Modifier modifierPadding = PaddingKt.padding(SizeKt.m1465defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, f, 1, null), paddingValues);
                        C12461 c12461 = new MeasurePolicy() { // from class: androidx.compose.material3.ChipKt$ChipContent$1.1
                            @Override // androidx.compose.p000ui.layout.MeasurePolicy
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo792measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j7) {
                                Measurable measurable;
                                Measurable measurable2;
                                int size = list.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= size) {
                                        measurable = null;
                                        break;
                                    }
                                    measurable = list.get(i5);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "leadingIcon")) {
                                        break;
                                    }
                                    i5++;
                                }
                                Measurable measurable3 = measurable;
                                final Placeable placeableMo5931measureBRTryo0 = measurable3 != null ? measurable3.mo5931measureBRTryo0(Constraints.m6999copyZbe2FdA$default(j7, 0, 0, 0, 0, 10, null)) : null;
                                final int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo5931measureBRTryo0);
                                final int iHeightOrZero = TextFieldImplKt.heightOrZero(placeableMo5931measureBRTryo0);
                                int size2 = list.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= size2) {
                                        measurable2 = null;
                                        break;
                                    }
                                    measurable2 = list.get(i6);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "trailingIcon")) {
                                        break;
                                    }
                                    i6++;
                                }
                                Measurable measurable4 = measurable2;
                                Placeable placeableMo5931measureBRTryo02 = measurable4 != null ? measurable4.mo5931measureBRTryo0(Constraints.m6999copyZbe2FdA$default(j7, 0, 0, 0, 0, 10, null)) : null;
                                int iWidthOrZero2 = TextFieldImplKt.widthOrZero(placeableMo5931measureBRTryo02);
                                final int iHeightOrZero2 = TextFieldImplKt.heightOrZero(placeableMo5931measureBRTryo02);
                                int size3 = list.size();
                                for (int i7 = 0; i7 < size3; i7++) {
                                    Measurable measurable5 = list.get(i7);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable5), AnnotatedPrivateKey.LABEL)) {
                                        final Placeable placeableMo5931measureBRTryo03 = measurable5.mo5931measureBRTryo0(ConstraintsKt.m7028offsetNN6EwU$default(j7, -(iWidthOrZero + iWidthOrZero2), 0, 2, null));
                                        int width = placeableMo5931measureBRTryo03.getWidth() + iWidthOrZero + iWidthOrZero2;
                                        final int iMax = Math.max(iHeightOrZero, Math.max(placeableMo5931measureBRTryo03.getHeight(), iHeightOrZero2));
                                        final Placeable placeable = placeableMo5931measureBRTryo02;
                                        return MeasureScope.layout$default(measureScope, width, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ChipKt.ChipContent.1.1.1
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
                                                Placeable.PlacementScope placementScope2;
                                                Placeable placeable2 = placeableMo5931measureBRTryo0;
                                                if (placeable2 != null) {
                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, 0, Alignment.INSTANCE.getCenterVertically().align(iHeightOrZero, iMax), 0.0f, 4, null);
                                                    placementScope2 = placementScope;
                                                } else {
                                                    placementScope2 = placementScope;
                                                }
                                                Placeable.PlacementScope.placeRelative$default(placementScope2, placeableMo5931measureBRTryo03, iWidthOrZero, 0, 0.0f, 4, null);
                                                Placeable placeable3 = placeable;
                                                if (placeable3 != null) {
                                                    Placeable.PlacementScope.placeRelative$default(placementScope2, placeable3, iWidthOrZero + placeableMo5931measureBRTryo03.getWidth(), Alignment.INSTANCE.getCenterVertically().align(iHeightOrZero2, iMax), 0.0f, 4, null);
                                                }
                                            }
                                        }, 4, null);
                                    }
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                        };
                        Function2<Composer, Integer, Unit> function211 = function29;
                        Function2<Composer, Integer, Unit> function212 = function28;
                        Function2<Composer, Integer, Unit> function213 = function210;
                        long j7 = j6;
                        Function2<Composer, Integer, Unit> function214 = function2;
                        long j8 = j3;
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierPadding);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM4088constructorimpl = Updater.m4088constructorimpl(composer2);
                        Updater.m4095setimpl(composerM4088constructorimpl, c12461, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -1433527257, "C2075@100797L325:Chip.kt#uh7d8r");
                        composer2.startReplaceGroup(-1293169671);
                        ComposerKt.sourceInformation(composer2, "2060@100124L638");
                        if (function211 != null || function212 != null) {
                            Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, "leadingIcon");
                            Alignment center = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierLayoutId);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM4088constructorimpl2 = Updater.m4088constructorimpl(composer2);
                            Updater.m4095setimpl(composerM4088constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4095setimpl(composerM4088constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM4088constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM4088constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM4088constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m4095setimpl(composerM4088constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, 832670363, "C:Chip.kt#uh7d8r");
                            if (function211 != null) {
                                composer2.startReplaceGroup(832680499);
                                ComposerKt.sourceInformation(composer2, "2065@100383L8");
                                function211.invoke(composer2, 0);
                                composer2.endReplaceGroup();
                            } else if (function212 != null) {
                                composer2.startReplaceGroup(832788565);
                                ComposerKt.sourceInformation(composer2, "2067@100486L198");
                                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4585boximpl(j7)), function212, composer2, ProvidedValue.$stable);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(833040347);
                                composer2.endReplaceGroup();
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierM1436paddingVpY3zN4 = PaddingKt.m1436paddingVpY3zN4(LayoutIdKt.layoutId(Modifier.INSTANCE, AnnotatedPrivateKey.LABEL), ChipKt.HorizontalElementsPadding, C1959Dp.m7055constructorimpl(0));
                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, composer2, 54);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM1436paddingVpY3zN4);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM4088constructorimpl3 = Updater.m4088constructorimpl(composer2);
                        Updater.m4095setimpl(composerM4088constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4095setimpl(composerM4088constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM4088constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM4088constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM4088constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m4095setimpl(composerM4088constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -407918630, "C100@5047L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer2, 833418517, "C2080@101095L7:Chip.kt#uh7d8r");
                        function214.invoke(composer2, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.startReplaceGroup(-1293135324);
                        ComposerKt.sourceInformation(composer2, "2083@101187L442");
                        if (function213 != null) {
                            Modifier modifierLayoutId2 = LayoutIdKt.layoutId(Modifier.INSTANCE, "trailingIcon");
                            Alignment center2 = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierLayoutId2);
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
                            Updater.m4095setimpl(composerM4088constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4095setimpl(composerM4088constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM4088constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                composerM4088constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM4088constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            Updater.m4095setimpl(composerM4088constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            ComposerKt.sourceInformationMarkerStart(composer2, 833719744, "C2087@101393L188:Chip.kt#uh7d8r");
                            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4585boximpl(j8)), function213, composer2, ProvidedValue.$stable);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                        }
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final long j7 = j4;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$ChipContent$2
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
                    ChipKt.m2309ChipContentfe0OD_I(function2, textStyle, j7, function22, function23, function24, j2, j3, f, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final ChipColors getDefaultSuggestionChipColors(ColorScheme colorScheme) {
        ChipColors defaultSuggestionChipColorsCached = colorScheme.getDefaultSuggestionChipColorsCached();
        if (defaultSuggestionChipColorsCached != null) {
            return defaultSuggestionChipColorsCached;
        }
        ChipColors chipColors = new ChipColors(Color.INSTANCE.m4630getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getLeadingIconColor()), Color.INSTANCE.m4631getUnspecified0d7_KjU(), Color.INSTANCE.m4630getTransparent0d7_KjU(), Color.m4594copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getDisabledLabelTextColor()), SuggestionChipTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m4594copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getDisabledLeadingIconColor()), SuggestionChipTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.INSTANCE.m4631getUnspecified0d7_KjU(), null);
        colorScheme.setDefaultSuggestionChipColorsCached$material3_release(chipColors);
        return chipColors;
    }

    static /* synthetic */ PaddingValues inputChipPadding$default(boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return inputChipPadding(z, z2, z3);
    }

    private static final PaddingValues inputChipPadding(boolean z, boolean z2, boolean z3) {
        return PaddingKt.m1432PaddingValuesa9UjIt4$default(C1959Dp.m7055constructorimpl((z || !z2) ? 4 : 8), 0.0f, C1959Dp.m7055constructorimpl(z3 ? 8 : 4), 0.0f, 10, null);
    }

    static {
        float fM7055constructorimpl = C1959Dp.m7055constructorimpl(8);
        HorizontalElementsPadding = fM7055constructorimpl;
        AssistChipPadding = PaddingKt.m1430PaddingValuesYgX7TsA$default(fM7055constructorimpl, 0.0f, 2, null);
        FilterChipPadding = PaddingKt.m1430PaddingValuesYgX7TsA$default(fM7055constructorimpl, 0.0f, 2, null);
        SuggestionChipPadding = PaddingKt.m1430PaddingValuesYgX7TsA$default(fM7055constructorimpl, 0.0f, 2, null);
    }
}
