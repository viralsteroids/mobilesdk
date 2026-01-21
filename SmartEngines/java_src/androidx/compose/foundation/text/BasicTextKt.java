package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNodeKt;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.geometry.Rect;
import androidx.compose.p000ui.graphics.ColorProducer;
import androidx.compose.p000ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p000ui.layout.Measurable;
import androidx.compose.p000ui.layout.Placeable;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.text.AnnotatedString;
import androidx.compose.p000ui.text.Placeholder;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.style.TextOverflow;
import androidx.compose.p000ui.unit.Constraints;
import androidx.compose.p000ui.unit.IntOffset;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.i18n.TextBundle;
import org.jmrtd.lds.LDSFile;

/* compiled from: BasicText.kt */
@Metadata(m513d1 = {"\u0000¦\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0084\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0090\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001az\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001ad\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001an\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010 \u001az\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010!\u001a°\u0001\u0010\"\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0006\u0010#\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0003ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a@\u0010,\u001a\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020/\u0012\f\u0012\n\u0012\u0004\u0012\u000201\u0018\u0001000.\u0018\u00010-2\f\u00102\u001a\b\u0012\u0004\u0012\u0002030-2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u000e00H\u0002\u001a\u001e\u00105\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000207062\b\u00108\u001a\u0004\u0018\u000109H\u0002\u001aÂ\u0001\u0010:\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%2\u0014\u0010;\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0<\u0018\u00010-2\u001c\u0010>\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010?0-\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0002ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006B²\u0006\n\u0010C\u001a\u00020\u0003X\u008a\u008e\u0002"}, m514d2 = {"BasicText", "", TextBundle.TEXT_ENTRY, "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "BasicText-VhcvRP8", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "color", "Landroidx/compose/ui/graphics/ColorProducer;", "BasicText-RWo7tUw", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "BasicText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V", "BasicText-BpD7jsM", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILandroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/runtime/Composer;II)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V", "LayoutWithLinksAndInlineContent", "hasInlineContent", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "selectionController", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "onShowTranslation", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "LayoutWithLinksAndInlineContent-vOo2fZY", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;ZLjava/util/Map;Landroidx/compose/ui/text/TextStyle;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "measureWithTextRangeMeasureConstraints", "", "Lkotlin/Pair;", "Landroidx/compose/ui/layout/Placeable;", "Lkotlin/Function0;", "Landroidx/compose/ui/unit/IntOffset;", "measurables", "Landroidx/compose/ui/layout/Measurable;", "shouldMeasureLinks", "selectionIdSaver", "Landroidx/compose/runtime/saveable/Saver;", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "textModifier", "placeholders", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "onPlaceholderLayout", "Landroidx/compose/ui/geometry/Rect;", "textModifier-cFh6CEA", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "foundation_release", "displayedText"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class BasicTextKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0104  */
    /* renamed from: BasicText-VhcvRP8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1731BasicTextVhcvRP8(final String str, Modifier modifier, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, ColorProducer colorProducer, Composer composer, final int i4, final int i5) {
        String str2;
        int i6;
        Modifier modifier2;
        int i7;
        TextStyle textStyle2;
        int i8;
        Function1<? super TextLayoutResult, Unit> function12;
        int i9;
        int iM6993getClipgIe3tQ8;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Modifier modifier3;
        SelectionController selectionController;
        final SelectionRegistrar selectionRegistrar;
        int i16;
        int i17;
        ColorProducer colorProducer2;
        Function1<? super TextLayoutResult, Unit> function13;
        Composer composer2;
        boolean z3;
        Modifier modifier4;
        int i18;
        Function1<? super TextLayoutResult, Unit> function14;
        Modifier modifierM1734textModifiercFh6CEA;
        ColorProducer colorProducer3;
        int currentCompositeKeyHash;
        Composer composerM4088constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer3;
        final TextStyle textStyle3;
        final ColorProducer colorProducer4;
        final boolean z4;
        final int i19;
        final int i20;
        final Modifier modifier5;
        final Function1<? super TextLayoutResult, Unit> function15;
        final int i21;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1186827822);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicText)P(8,3,7,4,5:c#ui.text.style.TextOverflow,6,1,2)101@5004L7,151@6858L41:BasicText.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i4 & 6) == 0) {
                i6 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i4;
            } else {
                i6 = i4;
            }
        }
        int i22 = i5 & 2;
        if (i22 != 0) {
            i6 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                modifier2 = modifier;
                i6 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else {
                if ((i4 & 384) == 0) {
                    textStyle2 = textStyle;
                    i6 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                }
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else {
                    if ((i4 & 3072) == 0) {
                        function12 = function1;
                        i6 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    }
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else {
                        if ((i4 & 24576) == 0) {
                            iM6993getClipgIe3tQ8 = i;
                            i6 |= composerStartRestartGroup.changed(iM6993getClipgIe3tQ8) ? 16384 : 8192;
                        }
                        i10 = i5 & 32;
                        if (i10 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                        } else {
                            if ((196608 & i4) == 0) {
                                z2 = z;
                                i6 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                            i11 = i5 & 64;
                            if (i11 == 0) {
                                i6 |= 1572864;
                            } else if ((i4 & 1572864) == 0) {
                                i6 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
                            }
                            i12 = i5 & 128;
                            if (i12 == 0) {
                                i6 |= 12582912;
                            } else {
                                if ((i4 & 12582912) == 0) {
                                    i13 = i12;
                                    i6 |= composerStartRestartGroup.changed(i3) ? 8388608 : 4194304;
                                }
                                i14 = i5 & 256;
                                if (i14 == 0) {
                                    if ((i4 & 100663296) == 0) {
                                        i15 = i14;
                                        i6 |= composerStartRestartGroup.changedInstance(colorProducer) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                    }
                                    if ((i6 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                        modifier3 = i22 == 0 ? Modifier.INSTANCE : modifier2;
                                        if (i7 != 0) {
                                            textStyle2 = TextStyle.INSTANCE.getDefault();
                                        }
                                        selectionController = null;
                                        if (i8 != 0) {
                                            function12 = null;
                                        }
                                        if (i9 != 0) {
                                            iM6993getClipgIe3tQ8 = TextOverflow.INSTANCE.m6993getClipgIe3tQ8();
                                        }
                                        if (i10 != 0) {
                                            z2 = true;
                                        }
                                        int i23 = i11 == 0 ? Integer.MAX_VALUE : i2;
                                        int i24 = i13 == 0 ? i3 : 1;
                                        ColorProducer colorProducer5 = i15 == 0 ? null : colorProducer;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1186827822, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:96)");
                                        }
                                        HeightInLinesModifierKt.validateMinMaxLines(i24, i23);
                                        ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar = SelectionRegistrarKt.getLocalSelectionRegistrar();
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object objConsume = composerStartRestartGroup.consume(localSelectionRegistrar);
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        selectionRegistrar = (SelectionRegistrar) objConsume;
                                        if (selectionRegistrar == null) {
                                            composerStartRestartGroup.startReplaceGroup(-1589202404);
                                            ComposerKt.sourceInformation(composerStartRestartGroup, "103@5140L7,105@5286L69,105@5203L152,108@5364L234");
                                            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume2 = composerStartRestartGroup.consume(localTextSelectionColors);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            function13 = function12;
                                            long backgroundColor = ((TextSelectionColors) objConsume2).getBackgroundColor();
                                            Object[] objArr = {selectionRegistrar};
                                            Saver<Long, Long> saverSelectionIdSaver = selectionIdSaver(selectionRegistrar);
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -328352935, "CC(remember):BasicText.kt#9igjgp");
                                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(selectionRegistrar);
                                            i16 = i24;
                                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = (Function0) new Function0<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectionController$selectableId$1$1
                                                    {
                                                        super(0);
                                                    }

                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Long invoke() {
                                                        return Long.valueOf(selectionRegistrar.nextSelectableId());
                                                    }
                                                };
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            Object objM4181rememberSaveable = RememberSaveableKt.m4181rememberSaveable(objArr, saverSelectionIdSaver, (String) null, (Function0<? extends Object>) objRememberedValue, composerStartRestartGroup, 0, 4);
                                            Composer composer4 = composerStartRestartGroup;
                                            i17 = i23;
                                            colorProducer2 = colorProducer5;
                                            long jLongValue = ((Number) objM4181rememberSaveable).longValue();
                                            ComposerKt.sourceInformationMarkerStart(composer4, -328350274, "CC(remember):BasicText.kt#9igjgp");
                                            boolean zChanged = composer4.changed(jLongValue) | composer4.changed(selectionRegistrar) | composer4.changed(backgroundColor);
                                            Object objRememberedValue2 = composer4.rememberedValue();
                                            if (!zChanged) {
                                                Object obj = objRememberedValue2;
                                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    Object selectionController2 = new SelectionController(jLongValue, selectionRegistrar, backgroundColor, null, 8, null);
                                                    composer4.updateRememberedValue(selectionController2);
                                                    obj = selectionController2;
                                                }
                                                selectionController = (SelectionController) obj;
                                                ComposerKt.sourceInformationMarkerEnd(composer4);
                                                composer4.endReplaceGroup();
                                                composer2 = composer4;
                                            }
                                        } else {
                                            i16 = i24;
                                            i17 = i23;
                                            colorProducer2 = colorProducer5;
                                            function13 = function12;
                                            Composer composer5 = composerStartRestartGroup;
                                            composer5.startReplaceGroup(-1588686502);
                                            composer5.endReplaceGroup();
                                            composer2 = composer5;
                                        }
                                        if (selectionController == null || function13 != null) {
                                            ColorProducer colorProducer6 = colorProducer2;
                                            z3 = z2;
                                            composer2.startReplaceGroup(-1588564052);
                                            ComposerKt.sourceInformation(composer2, "130@6178L7");
                                            modifier4 = modifier3;
                                            Modifier modifierM4756graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m4756graphicsLayerAp8cVGQ$default(modifier4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                            AnnotatedString annotatedString = new AnnotatedString(str, null, null, 6, null);
                                            ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver = CompositionLocalsKt.getLocalFontFamilyResolver();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume3 = composer2.consume(localFontFamilyResolver);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            i18 = iM6993getClipgIe3tQ8;
                                            function14 = function13;
                                            modifierM1734textModifiercFh6CEA = m1734textModifiercFh6CEA(modifierM4756graphicsLayerAp8cVGQ$default, annotatedString, textStyle2, function14, i18, z3, i17, i16, (FontFamily.Resolver) objConsume3, null, null, selectionController, colorProducer6, null);
                                            colorProducer3 = colorProducer6;
                                            composer2.endReplaceGroup();
                                        } else {
                                            composer2.startReplaceGroup(-1587866335);
                                            ComposerKt.sourceInformation(composer2, "143@6671L7");
                                            Modifier modifierM4756graphicsLayerAp8cVGQ$default2 = GraphicsLayerModifierKt.m4756graphicsLayerAp8cVGQ$default(modifier3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                            i18 = iM6993getClipgIe3tQ8;
                                            Modifier modifier6 = modifier3;
                                            ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver2 = CompositionLocalsKt.getLocalFontFamilyResolver();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume4 = composer2.consume(localFontFamilyResolver2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ColorProducer colorProducer7 = colorProducer2;
                                            z3 = z2;
                                            modifierM1734textModifiercFh6CEA = modifierM4756graphicsLayerAp8cVGQ$default2.then(new TextStringSimpleElement(str2, textStyle2, (FontFamily.Resolver) objConsume4, i18, z3, i17, i16, colorProducer7, null));
                                            composer2.endReplaceGroup();
                                            colorProducer3 = colorProducer7;
                                            modifier4 = modifier6;
                                            function14 = function13;
                                        }
                                        EmptyMeasurePolicy emptyMeasurePolicy = EmptyMeasurePolicy.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer2, 544976794, "CC(Layout)P(1)125@4862L23,128@5013L385:Layout.kt#80mrfh");
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1734textModifiercFh6CEA);
                                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer2, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer2.startReusableNode();
                                        if (!composer2.getInserting()) {
                                            composer2.createNode(constructor);
                                        } else {
                                            composer2.useNode();
                                        }
                                        composerM4088constructorimpl = Updater.m4088constructorimpl(composer2);
                                        Updater.m4095setimpl(composerM4088constructorimpl, emptyMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                        setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        composer2.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer3 = composer2;
                                        textStyle3 = textStyle2;
                                        colorProducer4 = colorProducer3;
                                        z4 = z3;
                                        i19 = i17;
                                        i20 = i16;
                                        modifier5 = modifier4;
                                        function15 = function14;
                                        i21 = i18;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        i19 = i2;
                                        colorProducer4 = colorProducer;
                                        composer3 = composerStartRestartGroup;
                                        modifier5 = modifier2;
                                        textStyle3 = textStyle2;
                                        function15 = function12;
                                        i21 = iM6993getClipgIe3tQ8;
                                        z4 = z2;
                                        i20 = i3;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
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

                                            public final void invoke(Composer composer6, int i25) {
                                                BasicTextKt.m1731BasicTextVhcvRP8(str, modifier5, textStyle3, function15, i21, z4, i19, i20, colorProducer4, composer6, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i6 |= 100663296;
                                i15 = i14;
                                if ((i6 & 38347923) == 38347922) {
                                    if (i22 == 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    selectionController = null;
                                    if (i8 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i11 == 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    HeightInLinesModifierKt.validateMinMaxLines(i24, i23);
                                    ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar2 = SelectionRegistrarKt.getLocalSelectionRegistrar();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume5 = composerStartRestartGroup.consume(localSelectionRegistrar2);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    selectionRegistrar = (SelectionRegistrar) objConsume5;
                                    if (selectionRegistrar == null) {
                                    }
                                    if (selectionController == null) {
                                        ColorProducer colorProducer62 = colorProducer2;
                                        z3 = z2;
                                        composer2.startReplaceGroup(-1588564052);
                                        ComposerKt.sourceInformation(composer2, "130@6178L7");
                                        modifier4 = modifier3;
                                        Modifier modifierM4756graphicsLayerAp8cVGQ$default3 = GraphicsLayerModifierKt.m4756graphicsLayerAp8cVGQ$default(modifier4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                        AnnotatedString annotatedString2 = new AnnotatedString(str, null, null, 6, null);
                                        ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver3 = CompositionLocalsKt.getLocalFontFamilyResolver();
                                        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object objConsume32 = composer2.consume(localFontFamilyResolver3);
                                        ComposerKt.sourceInformationMarkerEnd(composer2);
                                        i18 = iM6993getClipgIe3tQ8;
                                        function14 = function13;
                                        modifierM1734textModifiercFh6CEA = m1734textModifiercFh6CEA(modifierM4756graphicsLayerAp8cVGQ$default3, annotatedString2, textStyle2, function14, i18, z3, i17, i16, (FontFamily.Resolver) objConsume32, null, null, selectionController, colorProducer62, null);
                                        colorProducer3 = colorProducer62;
                                        composer2.endReplaceGroup();
                                        EmptyMeasurePolicy emptyMeasurePolicy2 = EmptyMeasurePolicy.INSTANCE;
                                        ComposerKt.sourceInformationMarkerStart(composer2, 544976794, "CC(Layout)P(1)125@4862L23,128@5013L385:Layout.kt#80mrfh");
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM1734textModifiercFh6CEA);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer2, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
                                        if (!(composer2.getApplier() instanceof Applier)) {
                                        }
                                        composer2.startReusableNode();
                                        if (!composer2.getInserting()) {
                                        }
                                        composerM4088constructorimpl = Updater.m4088constructorimpl(composer2);
                                        Updater.m4095setimpl(composerM4088constructorimpl, emptyMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                        setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!composerM4088constructorimpl.getInserting()) {
                                            composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            composer2.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            composer3 = composer2;
                                            textStyle3 = textStyle2;
                                            colorProducer4 = colorProducer3;
                                            z4 = z3;
                                            i19 = i17;
                                            i20 = i16;
                                            modifier5 = modifier4;
                                            function15 = function14;
                                            i21 = i18;
                                        }
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i13 = i12;
                            i14 = i5 & 256;
                            if (i14 == 0) {
                            }
                            i15 = i14;
                            if ((i6 & 38347923) == 38347922) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        z2 = z;
                        i11 = i5 & 64;
                        if (i11 == 0) {
                        }
                        i12 = i5 & 128;
                        if (i12 == 0) {
                        }
                        i13 = i12;
                        i14 = i5 & 256;
                        if (i14 == 0) {
                        }
                        i15 = i14;
                        if ((i6 & 38347923) == 38347922) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    iM6993getClipgIe3tQ8 = i;
                    i10 = i5 & 32;
                    if (i10 != 0) {
                    }
                    z2 = z;
                    i11 = i5 & 64;
                    if (i11 == 0) {
                    }
                    i12 = i5 & 128;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    i14 = i5 & 256;
                    if (i14 == 0) {
                    }
                    i15 = i14;
                    if ((i6 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function12 = function1;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                iM6993getClipgIe3tQ8 = i;
                i10 = i5 & 32;
                if (i10 != 0) {
                }
                z2 = z;
                i11 = i5 & 64;
                if (i11 == 0) {
                }
                i12 = i5 & 128;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i5 & 256;
                if (i14 == 0) {
                }
                i15 = i14;
                if ((i6 & 38347923) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            function12 = function1;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            iM6993getClipgIe3tQ8 = i;
            i10 = i5 & 32;
            if (i10 != 0) {
            }
            z2 = z;
            i11 = i5 & 64;
            if (i11 == 0) {
            }
            i12 = i5 & 128;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i5 & 256;
            if (i14 == 0) {
            }
            i15 = i14;
            if ((i6 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        function12 = function1;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        iM6993getClipgIe3tQ8 = i;
        i10 = i5 & 32;
        if (i10 != 0) {
        }
        z2 = z;
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i5 & 256;
        if (i14 == 0) {
        }
        i15 = i14;
        if ((i6 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* renamed from: BasicText-RWo7tUw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1729BasicTextRWo7tUw(final AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, Map<String, InlineTextContent> map, ColorProducer colorProducer, Composer composer, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        TextStyle textStyle2;
        int i8;
        Function1<? super TextLayoutResult, Unit> function12;
        int i9;
        int iM6993getClipgIe3tQ8;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Modifier modifier3;
        int i19;
        Map<String, InlineTextContent> mapEmptyMap;
        ColorProducer colorProducer2;
        final SelectionRegistrar selectionRegistrar;
        int i20;
        boolean z3;
        int i21;
        TextStyle textStyle3;
        SelectionController selectionController;
        boolean zHasInlineContent;
        Composer composer2;
        int i22;
        int i23;
        boolean z4;
        boolean z5;
        Object objRememberedValue;
        final MutableState mutableState;
        boolean zChanged;
        Object objRememberedValue2;
        Function1<? super TextLayoutResult, Unit> function13;
        int i24;
        final int i25;
        final ColorProducer colorProducer3;
        final Map<String, InlineTextContent> map2;
        final boolean z6;
        final int i26;
        final Function1<? super TextLayoutResult, Unit> function14;
        final TextStyle textStyle4;
        boolean zChanged2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1064305212);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicText)P(9,4,8,5,6:c#ui.text.style.TextOverflow,7,2,3,1)196@9257L7:BasicText.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i27 = i5 & 2;
        if (i27 != 0) {
            i6 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                modifier2 = modifier;
                i6 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else {
                if ((i4 & 384) == 0) {
                    textStyle2 = textStyle;
                    i6 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                }
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else {
                    if ((i4 & 3072) == 0) {
                        function12 = function1;
                        i6 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    }
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else {
                        if ((i4 & 24576) == 0) {
                            iM6993getClipgIe3tQ8 = i;
                            i6 |= composerStartRestartGroup.changed(iM6993getClipgIe3tQ8) ? 16384 : 8192;
                        }
                        i10 = i5 & 32;
                        if (i10 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                            z2 = z;
                        } else {
                            z2 = z;
                            if ((i4 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                                i6 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                        }
                        i11 = i5 & 64;
                        if (i11 != 0) {
                            i6 |= 1572864;
                            i12 = i2;
                        } else {
                            i12 = i2;
                            if ((i4 & 1572864) == 0) {
                                i6 |= composerStartRestartGroup.changed(i12) ? 1048576 : 524288;
                            }
                        }
                        i13 = i5 & 128;
                        if (i13 != 0) {
                            i6 |= 12582912;
                        } else {
                            if ((i4 & 12582912) == 0) {
                                i14 = i13;
                                i6 |= composerStartRestartGroup.changed(i3) ? 8388608 : 4194304;
                            }
                            i15 = i5 & 256;
                            if (i15 == 0) {
                                i6 |= 100663296;
                            } else {
                                if ((i4 & 100663296) == 0) {
                                    i16 = i15;
                                    i6 |= composerStartRestartGroup.changedInstance(map) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                }
                                i17 = i5 & 512;
                                if (i17 == 0) {
                                    if ((i4 & 805306368) == 0) {
                                        i18 = i17;
                                        i6 |= composerStartRestartGroup.changedInstance(colorProducer) ? PKIFailureInfo.duplicateCertReq : 268435456;
                                    }
                                    if ((i6 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                        modifier3 = i27 == 0 ? Modifier.INSTANCE : modifier2;
                                        if (i7 != 0) {
                                            textStyle2 = TextStyle.INSTANCE.getDefault();
                                        }
                                        if (i8 != 0) {
                                            function12 = null;
                                        }
                                        if (i9 != 0) {
                                            iM6993getClipgIe3tQ8 = TextOverflow.INSTANCE.m6993getClipgIe3tQ8();
                                        }
                                        if (i10 != 0) {
                                            z2 = true;
                                        }
                                        if (i11 != 0) {
                                            i12 = Integer.MAX_VALUE;
                                        }
                                        int i28 = i12;
                                        i19 = i14 == 0 ? 1 : i3;
                                        mapEmptyMap = i16 == 0 ? MapsKt.emptyMap() : map;
                                        colorProducer2 = i18 == 0 ? null : colorProducer;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1064305212, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:191)");
                                        }
                                        HeightInLinesModifierKt.validateMinMaxLines(i19, i28);
                                        ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar = SelectionRegistrarKt.getLocalSelectionRegistrar();
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object objConsume = composerStartRestartGroup.consume(localSelectionRegistrar);
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        selectionRegistrar = (SelectionRegistrar) objConsume;
                                        if (selectionRegistrar == null) {
                                            composerStartRestartGroup.startReplaceGroup(-1584983428);
                                            ComposerKt.sourceInformation(composerStartRestartGroup, "198@9393L7,200@9539L69,200@9456L152,203@9617L234");
                                            ProvidableCompositionLocal<TextSelectionColors> localTextSelectionColors = TextSelectionColorsKt.getLocalTextSelectionColors();
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume2 = composerStartRestartGroup.consume(localTextSelectionColors);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            textStyle3 = textStyle2;
                                            long backgroundColor = ((TextSelectionColors) objConsume2).getBackgroundColor();
                                            Object[] objArr = {selectionRegistrar};
                                            Saver<Long, Long> saverSelectionIdSaver = selectionIdSaver(selectionRegistrar);
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -328216839, "CC(remember):BasicText.kt#9igjgp");
                                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(selectionRegistrar);
                                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                            if (zChangedInstance) {
                                                i20 = i6;
                                            } else {
                                                i20 = i6;
                                                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                Number number = (Number) RememberSaveableKt.m4181rememberSaveable(objArr, (Saver) saverSelectionIdSaver, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 4);
                                                boolean z7 = z2;
                                                i21 = i28;
                                                long jLongValue = number.longValue();
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -328214178, "CC(remember):BasicText.kt#9igjgp");
                                                zChanged2 = composerStartRestartGroup.changed(jLongValue) | composerStartRestartGroup.changed(selectionRegistrar) | composerStartRestartGroup.changed(backgroundColor);
                                                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                                if (zChanged2) {
                                                    z3 = z7;
                                                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                    }
                                                    selectionController = (SelectionController) objRememberedValue4;
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                } else {
                                                    z3 = z7;
                                                }
                                                objRememberedValue4 = new SelectionController(jLongValue, selectionRegistrar, backgroundColor, null, 8, null);
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                                selectionController = (SelectionController) objRememberedValue4;
                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                composerStartRestartGroup.endReplaceGroup();
                                            }
                                            objRememberedValue3 = (Function0) new Function0<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectionController$selectableId$2$1
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Long invoke() {
                                                    return Long.valueOf(selectionRegistrar.nextSelectableId());
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            Number number2 = (Number) RememberSaveableKt.m4181rememberSaveable(objArr, (Saver) saverSelectionIdSaver, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 4);
                                            boolean z72 = z2;
                                            i21 = i28;
                                            long jLongValue2 = number2.longValue();
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -328214178, "CC(remember):BasicText.kt#9igjgp");
                                            zChanged2 = composerStartRestartGroup.changed(jLongValue2) | composerStartRestartGroup.changed(selectionRegistrar) | composerStartRestartGroup.changed(backgroundColor);
                                            Object objRememberedValue42 = composerStartRestartGroup.rememberedValue();
                                            if (zChanged2) {
                                            }
                                            objRememberedValue42 = new SelectionController(jLongValue2, selectionRegistrar, backgroundColor, null, 8, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue42);
                                            selectionController = (SelectionController) objRememberedValue42;
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            composerStartRestartGroup.endReplaceGroup();
                                        } else {
                                            i20 = i6;
                                            z3 = z2;
                                            i21 = i28;
                                            textStyle3 = textStyle2;
                                            composerStartRestartGroup.startReplaceGroup(-1584467526);
                                            composerStartRestartGroup.endReplaceGroup();
                                            selectionController = null;
                                        }
                                        zHasInlineContent = AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString);
                                        boolean zHasLinks = TextAnnotatedStringNodeKt.hasLinks(annotatedString);
                                        if (zHasInlineContent && !zHasLinks) {
                                            composerStartRestartGroup.startReplaceGroup(-1584294453);
                                            ComposerKt.sourceInformation(composerStartRestartGroup, "229@10603L7,217@10089L814");
                                            Modifier modifierM4756graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m4756graphicsLayerAp8cVGQ$default(modifier3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                            ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver = CompositionLocalsKt.getLocalFontFamilyResolver();
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume3 = composerStartRestartGroup.consume(localFontFamilyResolver);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            FontFamily.Resolver resolver = (FontFamily.Resolver) objConsume3;
                                            i22 = iM6993getClipgIe3tQ8;
                                            composer2 = composerStartRestartGroup;
                                            Function1<? super TextLayoutResult, Unit> function15 = function12;
                                            i23 = i21;
                                            z4 = z3;
                                            Modifier modifierM1734textModifiercFh6CEA = m1734textModifiercFh6CEA(modifierM4756graphicsLayerAp8cVGQ$default, annotatedString, textStyle3, function15, i22, z4, i23, i19, resolver, null, null, selectionController, colorProducer2, null);
                                            EmptyMeasurePolicy emptyMeasurePolicy = EmptyMeasurePolicy.INSTANCE;
                                            ComposerKt.sourceInformationMarkerStart(composer2, 544976794, "CC(Layout)P(1)125@4862L23,128@5013L385:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1734textModifiercFh6CEA);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 1405779621, "CC(ReusableComposeNode):Composables.kt#9igjgp");
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
                                            Updater.m4095setimpl(composerM4088constructorimpl, emptyMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            composer2.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endReplaceGroup();
                                            function13 = function15;
                                        } else {
                                            SelectionController selectionController2 = selectionController;
                                            composer2 = composerStartRestartGroup;
                                            i22 = iM6993getClipgIe3tQ8;
                                            i23 = i21;
                                            z4 = z3;
                                            composer2.startReplaceGroup(-1583391888);
                                            ComposerKt.sourceInformation(composer2, "241@11076L39,254@11574L7,257@11697L256,243@11125L838");
                                            ComposerKt.sourceInformationMarkerStart(composer2, -328167685, "CC(remember):BasicText.kt#9igjgp");
                                            z5 = (i20 & 14) != 4;
                                            objRememberedValue = composer2.rememberedValue();
                                            if (!z5 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(annotatedString, null, 2, null);
                                                composer2.updateRememberedValue(objRememberedValue);
                                            }
                                            mutableState = (MutableState) objRememberedValue;
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            AnnotatedString annotatedStringBasicText_RWo7tUw$lambda$5 = BasicText_RWo7tUw$lambda$5(mutableState);
                                            ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver2 = CompositionLocalsKt.getLocalFontFamilyResolver();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume4 = composer2.consume(localFontFamilyResolver2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            FontFamily.Resolver resolver2 = (FontFamily.Resolver) objConsume4;
                                            ComposerKt.sourceInformationMarkerStart(composer2, -328147596, "CC(remember):BasicText.kt#9igjgp");
                                            zChanged = composer2.changed(mutableState);
                                            objRememberedValue2 = composer2.rememberedValue();
                                            if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = (Function1) new Function1<TextAnnotatedStringNode.TextSubstitutionValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                                                        invoke2(textSubstitutionValue);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                                                        AnnotatedString original;
                                                        MutableState<AnnotatedString> mutableState2 = mutableState;
                                                        if (textSubstitutionValue.isShowingSubstitution()) {
                                                            original = textSubstitutionValue.getSubstitution();
                                                        } else {
                                                            original = textSubstitutionValue.getOriginal();
                                                        }
                                                        mutableState2.setValue(original);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue2);
                                            }
                                            Function1 function16 = (Function1) objRememberedValue2;
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            int i29 = i20 << 6;
                                            Function1<? super TextLayoutResult, Unit> function17 = function12;
                                            Modifier modifier4 = modifier3;
                                            m1732LayoutWithLinksAndInlineContentvOo2fZY(modifier4, annotatedStringBasicText_RWo7tUw$lambda$5, function17, zHasInlineContent, mapEmptyMap, textStyle3, i22, z4, i23, i19, resolver2, selectionController2, colorProducer2, function16, composer2, ((i20 >> 3) & 910) | ((i20 >> 12) & 57344) | ((i20 << 9) & 458752) | (3670016 & i29) | (29360128 & i29) | (234881024 & i29) | (i29 & 1879048192), (i20 >> 21) & 896, 0);
                                            function13 = function17;
                                            modifier3 = modifier4;
                                            composer2.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        i24 = i23;
                                        i25 = i19;
                                        colorProducer3 = colorProducer2;
                                        map2 = mapEmptyMap;
                                        modifier2 = modifier3;
                                        z6 = z4;
                                        i26 = i22;
                                        function14 = function13;
                                        textStyle4 = textStyle3;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        i25 = i3;
                                        colorProducer3 = colorProducer;
                                        composer2 = composerStartRestartGroup;
                                        i24 = i12;
                                        z6 = z2;
                                        textStyle4 = textStyle2;
                                        function14 = function12;
                                        i26 = iM6993getClipgIe3tQ8;
                                        map2 = map;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        final Modifier modifier5 = modifier2;
                                        final int i30 = i24;
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
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

                                            public final void invoke(Composer composer3, int i31) {
                                                BasicTextKt.m1729BasicTextRWo7tUw(annotatedString, modifier5, textStyle4, function14, i26, z6, i30, i25, map2, colorProducer3, composer3, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i6 |= 805306368;
                                i18 = i17;
                                if ((i6 & 306783379) == 306783378) {
                                    if (i27 == 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i11 != 0) {
                                    }
                                    int i282 = i12;
                                    if (i14 == 0) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    if (i18 == 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    HeightInLinesModifierKt.validateMinMaxLines(i19, i282);
                                    ProvidableCompositionLocal<SelectionRegistrar> localSelectionRegistrar2 = SelectionRegistrarKt.getLocalSelectionRegistrar();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume5 = composerStartRestartGroup.consume(localSelectionRegistrar2);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    selectionRegistrar = (SelectionRegistrar) objConsume5;
                                    if (selectionRegistrar == null) {
                                    }
                                    zHasInlineContent = AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString);
                                    boolean zHasLinks2 = TextAnnotatedStringNodeKt.hasLinks(annotatedString);
                                    if (zHasInlineContent) {
                                        SelectionController selectionController22 = selectionController;
                                        composer2 = composerStartRestartGroup;
                                        i22 = iM6993getClipgIe3tQ8;
                                        i23 = i21;
                                        z4 = z3;
                                        composer2.startReplaceGroup(-1583391888);
                                        ComposerKt.sourceInformation(composer2, "241@11076L39,254@11574L7,257@11697L256,243@11125L838");
                                        ComposerKt.sourceInformationMarkerStart(composer2, -328167685, "CC(remember):BasicText.kt#9igjgp");
                                        if ((i20 & 14) != 4) {
                                        }
                                        objRememberedValue = composer2.rememberedValue();
                                        if (!z5) {
                                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(annotatedString, null, 2, null);
                                            composer2.updateRememberedValue(objRememberedValue);
                                            mutableState = (MutableState) objRememberedValue;
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            AnnotatedString annotatedStringBasicText_RWo7tUw$lambda$52 = BasicText_RWo7tUw$lambda$5(mutableState);
                                            ProvidableCompositionLocal<FontFamily.Resolver> localFontFamilyResolver22 = CompositionLocalsKt.getLocalFontFamilyResolver();
                                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume42 = composer2.consume(localFontFamilyResolver22);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            FontFamily.Resolver resolver22 = (FontFamily.Resolver) objConsume42;
                                            ComposerKt.sourceInformationMarkerStart(composer2, -328147596, "CC(remember):BasicText.kt#9igjgp");
                                            zChanged = composer2.changed(mutableState);
                                            objRememberedValue2 = composer2.rememberedValue();
                                            if (!zChanged) {
                                                objRememberedValue2 = (Function1) new Function1<TextAnnotatedStringNode.TextSubstitutionValue, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$2$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                                                        invoke2(textSubstitutionValue);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
                                                        AnnotatedString original;
                                                        MutableState<AnnotatedString> mutableState2 = mutableState;
                                                        if (textSubstitutionValue.isShowingSubstitution()) {
                                                            original = textSubstitutionValue.getSubstitution();
                                                        } else {
                                                            original = textSubstitutionValue.getOriginal();
                                                        }
                                                        mutableState2.setValue(original);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue2);
                                                Function1 function162 = (Function1) objRememberedValue2;
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                int i292 = i20 << 6;
                                                Function1<? super TextLayoutResult, Unit> function172 = function12;
                                                Modifier modifier42 = modifier3;
                                                m1732LayoutWithLinksAndInlineContentvOo2fZY(modifier42, annotatedStringBasicText_RWo7tUw$lambda$52, function172, zHasInlineContent, mapEmptyMap, textStyle3, i22, z4, i23, i19, resolver22, selectionController22, colorProducer2, function162, composer2, ((i20 >> 3) & 910) | ((i20 >> 12) & 57344) | ((i20 << 9) & 458752) | (3670016 & i292) | (29360128 & i292) | (234881024 & i292) | (i292 & 1879048192), (i20 >> 21) & 896, 0);
                                                function13 = function172;
                                                modifier3 = modifier42;
                                                composer2.endReplaceGroup();
                                                if (ComposerKt.isTraceInProgress()) {
                                                }
                                                i24 = i23;
                                                i25 = i19;
                                                colorProducer3 = colorProducer2;
                                                map2 = mapEmptyMap;
                                                modifier2 = modifier3;
                                                z6 = z4;
                                                i26 = i22;
                                                function14 = function13;
                                                textStyle4 = textStyle3;
                                            }
                                        }
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i16 = i15;
                            i17 = i5 & 512;
                            if (i17 == 0) {
                            }
                            i18 = i17;
                            if ((i6 & 306783379) == 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i14 = i13;
                        i15 = i5 & 256;
                        if (i15 == 0) {
                        }
                        i16 = i15;
                        i17 = i5 & 512;
                        if (i17 == 0) {
                        }
                        i18 = i17;
                        if ((i6 & 306783379) == 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    iM6993getClipgIe3tQ8 = i;
                    i10 = i5 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i5 & 64;
                    if (i11 != 0) {
                    }
                    i13 = i5 & 128;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    i15 = i5 & 256;
                    if (i15 == 0) {
                    }
                    i16 = i15;
                    i17 = i5 & 512;
                    if (i17 == 0) {
                    }
                    i18 = i17;
                    if ((i6 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function12 = function1;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                iM6993getClipgIe3tQ8 = i;
                i10 = i5 & 32;
                if (i10 != 0) {
                }
                i11 = i5 & 64;
                if (i11 != 0) {
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                }
                i14 = i13;
                i15 = i5 & 256;
                if (i15 == 0) {
                }
                i16 = i15;
                i17 = i5 & 512;
                if (i17 == 0) {
                }
                i18 = i17;
                if ((i6 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            function12 = function1;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            iM6993getClipgIe3tQ8 = i;
            i10 = i5 & 32;
            if (i10 != 0) {
            }
            i11 = i5 & 64;
            if (i11 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i13;
            i15 = i5 & 256;
            if (i15 == 0) {
            }
            i16 = i15;
            i17 = i5 & 512;
            if (i17 == 0) {
            }
            i18 = i17;
            if ((i6 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        function12 = function1;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        iM6993getClipgIe3tQ8 = i;
        i10 = i5 & 32;
        if (i10 != 0) {
        }
        i11 = i5 & 64;
        if (i11 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i13;
        i15 = i5 & 256;
        if (i15 == 0) {
        }
        i16 = i15;
        i17 = i5 & 512;
        if (i17 == 0) {
        }
        i18 = i17;
        if ((i6 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final AnnotatedString BasicText_RWo7tUw$lambda$5(MutableState<AnnotatedString> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: BasicText-BpD7jsM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1728BasicTextBpD7jsM(final String str, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, Composer composer, final int i3, final int i4) {
        String str2;
        int i5;
        Modifier modifier2;
        int i6;
        TextStyle textStyle2;
        int i7;
        Function1 function12;
        int i8;
        int iM6993getClipgIe3tQ8;
        int i9;
        boolean z2;
        int i10;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final Function1 function13;
        final int i11;
        final int i12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1022429478);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicText)P(6,1,5,2,3:c#ui.text.style.TextOverflow,4)279@12355L234:BasicText.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i3 & 6) == 0) {
                i5 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i3;
            } else {
                i5 = i3;
            }
        }
        int i13 = i4 & 2;
        if (i13 != 0) {
            i5 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i3 & 384) == 0) {
                    textStyle2 = textStyle;
                    i5 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        function12 = function1;
                        i5 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i3 & 24576) == 0) {
                            iM6993getClipgIe3tQ8 = i;
                            i5 |= composerStartRestartGroup.changed(iM6993getClipgIe3tQ8) ? 16384 : 8192;
                        }
                        i9 = i4 & 32;
                        if (i9 == 0) {
                            if ((196608 & i3) == 0) {
                                z2 = z;
                                i5 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                            i10 = i4 & 64;
                            if (i10 == 0) {
                                i5 |= 1572864;
                            } else if ((i3 & 1572864) == 0) {
                                i5 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
                            }
                            if ((i5 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                                Modifier.Companion companion = i13 == 0 ? Modifier.INSTANCE : modifier2;
                                if (i6 != 0) {
                                    textStyle2 = TextStyle.INSTANCE.getDefault();
                                }
                                if (i7 != 0) {
                                    function12 = null;
                                }
                                if (i8 != 0) {
                                    iM6993getClipgIe3tQ8 = TextOverflow.INSTANCE.m6993getClipgIe3tQ8();
                                }
                                if (i9 != 0) {
                                    z2 = true;
                                }
                                int i14 = i10 == 0 ? Integer.MAX_VALUE : i2;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1022429478, i5, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:278)");
                                }
                                TextStyle textStyle4 = textStyle2;
                                int i15 = iM6993getClipgIe3tQ8;
                                Function1 function14 = function12;
                                Modifier modifier4 = companion;
                                m1731BasicTextVhcvRP8(str2, modifier4, textStyle4, (Function1<? super TextLayoutResult, Unit>) function14, i15, z2, i14, 1, (ColorProducer) null, composerStartRestartGroup, (i5 & 14) | 12582912 | (i5 & LDSFile.EF_DG16_TAG) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                textStyle3 = textStyle4;
                                function13 = function14;
                                i11 = i15;
                                i12 = i14;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                i12 = i2;
                                modifier3 = modifier2;
                                textStyle3 = textStyle2;
                                function13 = function12;
                                i11 = iM6993getClipgIe3tQ8;
                            }
                            final boolean z3 = z2;
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
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

                                    public final void invoke(Composer composer2, int i16) {
                                        BasicTextKt.m1728BasicTextBpD7jsM(str, modifier3, textStyle3, function13, i11, z3, i12, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i5 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                        z2 = z;
                        i10 = i4 & 64;
                        if (i10 == 0) {
                        }
                        if ((i5 & 599187) == 599186) {
                            if (i13 == 0) {
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
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            TextStyle textStyle42 = textStyle2;
                            int i152 = iM6993getClipgIe3tQ8;
                            Function1 function142 = function12;
                            Modifier modifier42 = companion;
                            m1731BasicTextVhcvRP8(str2, modifier42, textStyle42, (Function1<? super TextLayoutResult, Unit>) function142, i152, z2, i14, 1, (ColorProducer) null, composerStartRestartGroup, (i5 & 14) | 12582912 | (i5 & LDSFile.EF_DG16_TAG) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 256);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier42;
                            textStyle3 = textStyle42;
                            function13 = function142;
                            i11 = i152;
                            i12 = i14;
                        }
                        final boolean z32 = z2;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    iM6993getClipgIe3tQ8 = i;
                    i9 = i4 & 32;
                    if (i9 == 0) {
                    }
                    z2 = z;
                    i10 = i4 & 64;
                    if (i10 == 0) {
                    }
                    if ((i5 & 599187) == 599186) {
                    }
                    final boolean z322 = z2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function12 = function1;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                iM6993getClipgIe3tQ8 = i;
                i9 = i4 & 32;
                if (i9 == 0) {
                }
                z2 = z;
                i10 = i4 & 64;
                if (i10 == 0) {
                }
                if ((i5 & 599187) == 599186) {
                }
                final boolean z3222 = z2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            textStyle2 = textStyle;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            function12 = function1;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            iM6993getClipgIe3tQ8 = i;
            i9 = i4 & 32;
            if (i9 == 0) {
            }
            z2 = z;
            i10 = i4 & 64;
            if (i10 == 0) {
            }
            if ((i5 & 599187) == 599186) {
            }
            final boolean z32222 = z2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        textStyle2 = textStyle;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        function12 = function1;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        iM6993getClipgIe3tQ8 = i;
        i9 = i4 & 32;
        if (i9 == 0) {
        }
        z2 = z;
        i10 = i4 & 64;
        if (i10 == 0) {
        }
        if ((i5 & 599187) == 599186) {
        }
        final boolean z322222 = z2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: BasicText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1726BasicText4YKlhWE(final AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, Map map, Composer composer, final int i3, final int i4) {
        AnnotatedString annotatedString2;
        int i5;
        Modifier modifier2;
        int i6;
        TextStyle textStyle2;
        int i7;
        Function1 function12;
        int i8;
        int iM6993getClipgIe3tQ8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        int i12;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final Function1 function13;
        final int i13;
        final boolean z3;
        final int i14;
        final Map map2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-648605928);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicText)P(7,2,6,3,4:c#ui.text.style.TextOverflow,5,1)303@13046L273:BasicText.kt#423gt5");
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
            annotatedString2 = annotatedString;
        } else {
            annotatedString2 = annotatedString;
            if ((i3 & 6) == 0) {
                i5 = (composerStartRestartGroup.changed(annotatedString2) ? 4 : 2) | i3;
            } else {
                i5 = i3;
            }
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i3 & 384) == 0) {
                    textStyle2 = textStyle;
                    i5 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i3 & 3072) == 0) {
                        function12 = function1;
                        i5 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i3 & 24576) == 0) {
                            iM6993getClipgIe3tQ8 = i;
                            i5 |= composerStartRestartGroup.changed(iM6993getClipgIe3tQ8) ? 16384 : 8192;
                        }
                        i9 = i4 & 32;
                        if (i9 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                        } else {
                            if ((196608 & i3) == 0) {
                                z2 = z;
                                i5 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                            i10 = i4 & 64;
                            if (i10 == 0) {
                                i5 |= 1572864;
                            } else if ((i3 & 1572864) == 0) {
                                i5 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
                            }
                            i11 = i4 & 128;
                            if (i11 != 0) {
                                if ((i3 & 12582912) == 0) {
                                    i12 = i11;
                                    i5 |= composerStartRestartGroup.changedInstance(map) ? 8388608 : 4194304;
                                }
                                if ((i5 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                                    Modifier.Companion companion = i15 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i6 != 0) {
                                        textStyle2 = TextStyle.INSTANCE.getDefault();
                                    }
                                    if (i7 != 0) {
                                        function12 = null;
                                    }
                                    if (i8 != 0) {
                                        iM6993getClipgIe3tQ8 = TextOverflow.INSTANCE.m6993getClipgIe3tQ8();
                                    }
                                    if (i9 != 0) {
                                        z2 = true;
                                    }
                                    int i16 = i10 == 0 ? Integer.MAX_VALUE : i2;
                                    Map mapEmptyMap = i12 == 0 ? MapsKt.emptyMap() : map;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-648605928, i5, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:302)");
                                    }
                                    Modifier modifier4 = companion;
                                    int i17 = i16;
                                    Function1 function14 = function12;
                                    boolean z4 = z2;
                                    int i18 = iM6993getClipgIe3tQ8;
                                    TextStyle textStyle4 = textStyle2;
                                    m1729BasicTextRWo7tUw(annotatedString2, modifier4, textStyle4, function14, i18, z4, i17, 1, mapEmptyMap, null, composerStartRestartGroup, (i5 & 14) | 12582912 | (i5 & LDSFile.EF_DG16_TAG) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | ((i5 << 3) & 234881024), 512);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    textStyle3 = textStyle4;
                                    function13 = function14;
                                    i13 = i18;
                                    z3 = z4;
                                    i14 = i17;
                                    map2 = mapEmptyMap;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    i14 = i2;
                                    modifier3 = modifier2;
                                    textStyle3 = textStyle2;
                                    function13 = function12;
                                    i13 = iM6993getClipgIe3tQ8;
                                    z3 = z2;
                                    map2 = map;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$5
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

                                        public final void invoke(Composer composer2, int i19) {
                                            BasicTextKt.m1726BasicText4YKlhWE(annotatedString, modifier3, textStyle3, function13, i13, z3, i14, map2, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i5 |= 12582912;
                            i12 = i11;
                            if ((i5 & 4793491) != 4793490) {
                                if (i15 == 0) {
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
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                Modifier modifier42 = companion;
                                int i172 = i16;
                                Function1 function142 = function12;
                                boolean z42 = z2;
                                int i182 = iM6993getClipgIe3tQ8;
                                TextStyle textStyle42 = textStyle2;
                                m1729BasicTextRWo7tUw(annotatedString2, modifier42, textStyle42, function142, i182, z42, i172, 1, mapEmptyMap, null, composerStartRestartGroup, (i5 & 14) | 12582912 | (i5 & LDSFile.EF_DG16_TAG) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | ((i5 << 3) & 234881024), 512);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier42;
                                textStyle3 = textStyle42;
                                function13 = function142;
                                i13 = i182;
                                z3 = z42;
                                i14 = i172;
                                map2 = mapEmptyMap;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        z2 = z;
                        i10 = i4 & 64;
                        if (i10 == 0) {
                        }
                        i11 = i4 & 128;
                        if (i11 != 0) {
                        }
                        i12 = i11;
                        if ((i5 & 4793491) != 4793490) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    iM6993getClipgIe3tQ8 = i;
                    i9 = i4 & 32;
                    if (i9 != 0) {
                    }
                    z2 = z;
                    i10 = i4 & 64;
                    if (i10 == 0) {
                    }
                    i11 = i4 & 128;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    if ((i5 & 4793491) != 4793490) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function12 = function1;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                iM6993getClipgIe3tQ8 = i;
                i9 = i4 & 32;
                if (i9 != 0) {
                }
                z2 = z;
                i10 = i4 & 64;
                if (i10 == 0) {
                }
                i11 = i4 & 128;
                if (i11 != 0) {
                }
                i12 = i11;
                if ((i5 & 4793491) != 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            function12 = function1;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            iM6993getClipgIe3tQ8 = i;
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            z2 = z;
            i10 = i4 & 64;
            if (i10 == 0) {
            }
            i11 = i4 & 128;
            if (i11 != 0) {
            }
            i12 = i11;
            if ((i5 & 4793491) != 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        textStyle2 = textStyle;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        function12 = function1;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        iM6993getClipgIe3tQ8 = i;
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        z2 = z;
        i10 = i4 & 64;
        if (i10 == 0) {
        }
        i11 = i4 & 128;
        if (i11 != 0) {
        }
        i12 = i11;
        if ((i5 & 4793491) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0126  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    /* renamed from: BasicText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1727BasicText4YKlhWE(final String str, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, int i3, Composer composer, final int i4, final int i5) {
        String str2;
        int i6;
        Modifier modifier2;
        int i7;
        TextStyle textStyle2;
        int i8;
        Function1 function12;
        int i9;
        int iM6993getClipgIe3tQ8;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final Function1 function13;
        final int i14;
        final boolean z3;
        final int i15;
        final int i16;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1542716361);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicText)P(7,2,6,3,4:c#ui.text.style.TextOverflow,5)327@13717L86:BasicText.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i4 & 6) == 0) {
                i6 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i4;
            } else {
                i6 = i4;
            }
        }
        int i17 = i5 & 2;
        if (i17 != 0) {
            i6 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                modifier2 = modifier;
                i6 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else {
                if ((i4 & 384) == 0) {
                    textStyle2 = textStyle;
                    i6 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                }
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else {
                    if ((i4 & 3072) == 0) {
                        function12 = function1;
                        i6 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    }
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else {
                        if ((i4 & 24576) == 0) {
                            iM6993getClipgIe3tQ8 = i;
                            i6 |= composerStartRestartGroup.changed(iM6993getClipgIe3tQ8) ? 16384 : 8192;
                        }
                        i10 = i5 & 32;
                        if (i10 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                        } else {
                            if ((196608 & i4) == 0) {
                                z2 = z;
                                i6 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                            i11 = i5 & 64;
                            if (i11 == 0) {
                                i6 |= 1572864;
                            } else if ((i4 & 1572864) == 0) {
                                i6 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
                            }
                            i12 = i5 & 128;
                            if (i12 != 0) {
                                if ((i4 & 12582912) == 0) {
                                    i13 = i12;
                                    i6 |= composerStartRestartGroup.changed(i3) ? 8388608 : 4194304;
                                }
                                if ((i6 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    i15 = i2;
                                    modifier3 = modifier2;
                                    textStyle3 = textStyle2;
                                    function13 = function12;
                                    i14 = iM6993getClipgIe3tQ8;
                                    z3 = z2;
                                    i16 = i3;
                                } else {
                                    Modifier.Companion companion = i17 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i7 != 0) {
                                        textStyle2 = TextStyle.INSTANCE.getDefault();
                                    }
                                    if (i8 != 0) {
                                        function12 = null;
                                    }
                                    if (i9 != 0) {
                                        iM6993getClipgIe3tQ8 = TextOverflow.INSTANCE.m6993getClipgIe3tQ8();
                                    }
                                    if (i10 != 0) {
                                        z2 = true;
                                    }
                                    int i18 = i11 == 0 ? Integer.MAX_VALUE : i2;
                                    int i19 = i13 == 0 ? 1 : i3;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1542716361, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:327)");
                                    }
                                    Modifier modifier4 = companion;
                                    int i20 = i18;
                                    Function1 function14 = function12;
                                    boolean z4 = z2;
                                    int i21 = iM6993getClipgIe3tQ8;
                                    TextStyle textStyle4 = textStyle2;
                                    m1731BasicTextVhcvRP8(str2, modifier4, textStyle4, (Function1<? super TextLayoutResult, Unit>) function14, i21, z4, i20, i19, (ColorProducer) null, composerStartRestartGroup, i6 & 33554430, 256);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    textStyle3 = textStyle4;
                                    function13 = function14;
                                    i14 = i21;
                                    z3 = z4;
                                    i15 = i20;
                                    i16 = i19;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
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

                                        public final void invoke(Composer composer2, int i22) {
                                            BasicTextKt.m1727BasicText4YKlhWE(str, modifier3, textStyle3, function13, i14, z3, i15, i16, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i6 |= 12582912;
                            i13 = i12;
                            if ((i6 & 4793491) == 4793490) {
                                if (i17 == 0) {
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
                                if (i13 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                Modifier modifier42 = companion;
                                int i202 = i18;
                                Function1 function142 = function12;
                                boolean z42 = z2;
                                int i212 = iM6993getClipgIe3tQ8;
                                TextStyle textStyle42 = textStyle2;
                                m1731BasicTextVhcvRP8(str2, modifier42, textStyle42, (Function1<? super TextLayoutResult, Unit>) function142, i212, z42, i202, i19, (ColorProducer) null, composerStartRestartGroup, i6 & 33554430, 256);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier42;
                                textStyle3 = textStyle42;
                                function13 = function142;
                                i14 = i212;
                                z3 = z42;
                                i15 = i202;
                                i16 = i19;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        z2 = z;
                        i11 = i5 & 64;
                        if (i11 == 0) {
                        }
                        i12 = i5 & 128;
                        if (i12 != 0) {
                        }
                        i13 = i12;
                        if ((i6 & 4793491) == 4793490) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    iM6993getClipgIe3tQ8 = i;
                    i10 = i5 & 32;
                    if (i10 != 0) {
                    }
                    z2 = z;
                    i11 = i5 & 64;
                    if (i11 == 0) {
                    }
                    i12 = i5 & 128;
                    if (i12 != 0) {
                    }
                    i13 = i12;
                    if ((i6 & 4793491) == 4793490) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function12 = function1;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                iM6993getClipgIe3tQ8 = i;
                i10 = i5 & 32;
                if (i10 != 0) {
                }
                z2 = z;
                i11 = i5 & 64;
                if (i11 == 0) {
                }
                i12 = i5 & 128;
                if (i12 != 0) {
                }
                i13 = i12;
                if ((i6 & 4793491) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            function12 = function1;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            iM6993getClipgIe3tQ8 = i;
            i10 = i5 & 32;
            if (i10 != 0) {
            }
            z2 = z;
            i11 = i5 & 64;
            if (i11 == 0) {
            }
            i12 = i5 & 128;
            if (i12 != 0) {
            }
            i13 = i12;
            if ((i6 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        function12 = function1;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        iM6993getClipgIe3tQ8 = i;
        i10 = i5 & 32;
        if (i10 != 0) {
        }
        z2 = z;
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & 128;
        if (i12 != 0) {
        }
        i13 = i12;
        if ((i6 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0104  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    /* renamed from: BasicText-VhcvRP8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1730BasicTextVhcvRP8(final AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, int i3, Map map, Composer composer, final int i4, final int i5) {
        AnnotatedString annotatedString2;
        int i6;
        Modifier modifier2;
        int i7;
        TextStyle textStyle2;
        int i8;
        Function1 function12;
        int i9;
        int iM6993getClipgIe3tQ8;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final Function1 function13;
        final int i16;
        final boolean z3;
        final int i17;
        final int i18;
        final Map map2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(851408699);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(BasicText)P(8,3,7,4,5:c#ui.text.style.TextOverflow,6,1,2)341@14269L240:BasicText.kt#423gt5");
        if ((i5 & 1) != 0) {
            i6 = i4 | 6;
            annotatedString2 = annotatedString;
        } else {
            annotatedString2 = annotatedString;
            if ((i4 & 6) == 0) {
                i6 = (composerStartRestartGroup.changed(annotatedString2) ? 4 : 2) | i4;
            } else {
                i6 = i4;
            }
        }
        int i19 = i5 & 2;
        if (i19 != 0) {
            i6 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                modifier2 = modifier;
                i6 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else {
                if ((i4 & 384) == 0) {
                    textStyle2 = textStyle;
                    i6 |= composerStartRestartGroup.changed(textStyle2) ? 256 : 128;
                }
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else {
                    if ((i4 & 3072) == 0) {
                        function12 = function1;
                        i6 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    }
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else {
                        if ((i4 & 24576) == 0) {
                            iM6993getClipgIe3tQ8 = i;
                            i6 |= composerStartRestartGroup.changed(iM6993getClipgIe3tQ8) ? 16384 : 8192;
                        }
                        i10 = i5 & 32;
                        if (i10 != 0) {
                            i6 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                        } else {
                            if ((196608 & i4) == 0) {
                                z2 = z;
                                i6 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                            }
                            i11 = i5 & 64;
                            if (i11 == 0) {
                                i6 |= 1572864;
                            } else if ((i4 & 1572864) == 0) {
                                i6 |= composerStartRestartGroup.changed(i2) ? 1048576 : 524288;
                            }
                            i12 = i5 & 128;
                            if (i12 == 0) {
                                i6 |= 12582912;
                            } else {
                                if ((i4 & 12582912) == 0) {
                                    i13 = i12;
                                    i6 |= composerStartRestartGroup.changed(i3) ? 8388608 : 4194304;
                                }
                                i14 = i5 & 256;
                                if (i14 == 0) {
                                    if ((i4 & 100663296) == 0) {
                                        i15 = i14;
                                        i6 |= composerStartRestartGroup.changedInstance(map) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                    }
                                    if ((i6 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                        if (i19 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        if (i7 != 0) {
                                            textStyle2 = TextStyle.INSTANCE.getDefault();
                                        }
                                        if (i8 != 0) {
                                            function12 = null;
                                        }
                                        if (i9 != 0) {
                                            iM6993getClipgIe3tQ8 = TextOverflow.INSTANCE.m6993getClipgIe3tQ8();
                                        }
                                        if (i10 != 0) {
                                            z2 = true;
                                        }
                                        int i20 = i11 == 0 ? Integer.MAX_VALUE : i2;
                                        int i21 = i13 == 0 ? i3 : 1;
                                        Map mapEmptyMap = i15 == 0 ? MapsKt.emptyMap() : map;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(851408699, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:341)");
                                        }
                                        int i22 = i21;
                                        int i23 = i20;
                                        TextStyle textStyle4 = textStyle2;
                                        int i24 = iM6993getClipgIe3tQ8;
                                        boolean z4 = z2;
                                        Modifier modifier4 = modifier2;
                                        Function1 function14 = function12;
                                        m1729BasicTextRWo7tUw(annotatedString2, modifier4, textStyle4, function14, i24, z4, i23, i22, mapEmptyMap, null, composerStartRestartGroup, i6 & 268435454, 512);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier3 = modifier4;
                                        textStyle3 = textStyle4;
                                        function13 = function14;
                                        i16 = i24;
                                        z3 = z4;
                                        i17 = i23;
                                        i18 = i22;
                                        map2 = mapEmptyMap;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        i17 = i2;
                                        map2 = map;
                                        modifier3 = modifier2;
                                        textStyle3 = textStyle2;
                                        function13 = function12;
                                        i16 = iM6993getClipgIe3tQ8;
                                        z3 = z2;
                                        i18 = i3;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
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

                                            public final void invoke(Composer composer2, int i25) {
                                                BasicTextKt.m1730BasicTextVhcvRP8(annotatedString, modifier3, textStyle3, function13, i16, z3, i17, i18, map2, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i6 |= 100663296;
                                i15 = i14;
                                if ((i6 & 38347923) == 38347922) {
                                    if (i19 != 0) {
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
                                    if (i13 == 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    int i222 = i21;
                                    int i232 = i20;
                                    TextStyle textStyle42 = textStyle2;
                                    int i242 = iM6993getClipgIe3tQ8;
                                    boolean z42 = z2;
                                    Modifier modifier42 = modifier2;
                                    Function1 function142 = function12;
                                    m1729BasicTextRWo7tUw(annotatedString2, modifier42, textStyle42, function142, i242, z42, i232, i222, mapEmptyMap, null, composerStartRestartGroup, i6 & 268435454, 512);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier42;
                                    textStyle3 = textStyle42;
                                    function13 = function142;
                                    i16 = i242;
                                    z3 = z42;
                                    i17 = i232;
                                    i18 = i222;
                                    map2 = mapEmptyMap;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i13 = i12;
                            i14 = i5 & 256;
                            if (i14 == 0) {
                            }
                            i15 = i14;
                            if ((i6 & 38347923) == 38347922) {
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        z2 = z;
                        i11 = i5 & 64;
                        if (i11 == 0) {
                        }
                        i12 = i5 & 128;
                        if (i12 == 0) {
                        }
                        i13 = i12;
                        i14 = i5 & 256;
                        if (i14 == 0) {
                        }
                        i15 = i14;
                        if ((i6 & 38347923) == 38347922) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    iM6993getClipgIe3tQ8 = i;
                    i10 = i5 & 32;
                    if (i10 != 0) {
                    }
                    z2 = z;
                    i11 = i5 & 64;
                    if (i11 == 0) {
                    }
                    i12 = i5 & 128;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    i14 = i5 & 256;
                    if (i14 == 0) {
                    }
                    i15 = i14;
                    if ((i6 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function12 = function1;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                iM6993getClipgIe3tQ8 = i;
                i10 = i5 & 32;
                if (i10 != 0) {
                }
                z2 = z;
                i11 = i5 & 64;
                if (i11 == 0) {
                }
                i12 = i5 & 128;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i5 & 256;
                if (i14 == 0) {
                }
                i15 = i14;
                if ((i6 & 38347923) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            function12 = function1;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            iM6993getClipgIe3tQ8 = i;
            i10 = i5 & 32;
            if (i10 != 0) {
            }
            z2 = z;
            i11 = i5 & 64;
            if (i11 == 0) {
            }
            i12 = i5 & 128;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i5 & 256;
            if (i14 == 0) {
            }
            i15 = i14;
            if ((i6 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        function12 = function1;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        iM6993getClipgIe3tQ8 = i;
        i10 = i5 & 32;
        if (i10 != 0) {
        }
        z2 = z;
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i5 & 256;
        if (i14 == 0) {
        }
        i15 = i14;
        if ((i6 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final Saver<Long, Long> selectionIdSaver(final SelectionRegistrar selectionRegistrar) {
        return SaverKt.Saver(new Function2<SaverScope, Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt.selectionIdSaver.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Long invoke(SaverScope saverScope, Long l) {
                return invoke(saverScope, l.longValue());
            }

            public final Long invoke(SaverScope saverScope, long j) {
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
                    return Long.valueOf(j);
                }
                return null;
            }
        }, new Function1<Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt.selectionIdSaver.2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Long invoke(Long l) {
                return invoke(l.longValue());
            }

            public final Long invoke(long j) {
                return Long.valueOf(j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Pair<Placeable, Function0<IntOffset>>> measureWithTextRangeMeasureConstraints(List<? extends Measurable> list, Function0<Boolean> function0) {
        if (!function0.invoke().booleanValue()) {
            return null;
        }
        TextRangeLayoutMeasureScope textRangeLayoutMeasureScope = new TextRangeLayoutMeasureScope();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Measurable measurable = list.get(i);
            Object parentData = measurable.getParentData();
            Intrinsics.checkNotNull(parentData, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            TextRangeLayoutMeasureResult textRangeLayoutMeasureResultMeasure = ((TextRangeLayoutModifier) parentData).getMeasurePolicy().measure(textRangeLayoutMeasureScope);
            arrayList.add(new Pair(measurable.mo5931measureBRTryo0(Constraints.INSTANCE.m7017fitPrioritizingWidthZbe2FdA(textRangeLayoutMeasureResultMeasure.getWidth(), textRangeLayoutMeasureResultMeasure.getWidth(), textRangeLayoutMeasureResultMeasure.getHeight(), textRangeLayoutMeasureResultMeasure.getHeight())), textRangeLayoutMeasureResultMeasure.getPlace()));
        }
        return arrayList;
    }

    /* renamed from: textModifier-cFh6CEA, reason: not valid java name */
    private static final Modifier m1734textModifiercFh6CEA(Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, Function1<? super TextLayoutResult, Unit> function1, int i, boolean z, int i2, int i3, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, Function1<? super List<Rect>, Unit> function12, SelectionController selectionController, ColorProducer colorProducer, Function1<? super TextAnnotatedStringNode.TextSubstitutionValue, Unit> function13) {
        if (selectionController == null) {
            return modifier.then(Modifier.INSTANCE).then(new TextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function12, null, colorProducer, function13, null));
        }
        return modifier.then(selectionController.getModifier()).then(new SelectableTextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function12, selectionController, colorProducer, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:274:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /* renamed from: LayoutWithLinksAndInlineContent-vOo2fZY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1732LayoutWithLinksAndInlineContentvOo2fZY(final Modifier modifier, final AnnotatedString annotatedString, final Function1<? super TextLayoutResult, Unit> function1, final boolean z, Map<String, InlineTextContent> map, final TextStyle textStyle, final int i, final boolean z2, final int i2, final int i3, final FontFamily.Resolver resolver, final SelectionController selectionController, final ColorProducer colorProducer, final Function1<? super TextAnnotatedStringNode.TextSubstitutionValue, Unit> function12, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        Map<String, InlineTextContent> map2;
        TextStyle textStyle2;
        int i8;
        boolean z3;
        int i9;
        int i10;
        final TextLinkScope textLinkScope;
        Function0 function0;
        Pair<List<AnnotatedString.Range<Placeholder>>, List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>>> pair;
        Map<String, InlineTextContent> map3;
        List<AnnotatedString.Range<Function3<String, Composer, Integer, Unit>>> listComponent2;
        List<AnnotatedString.Range<Placeholder>> list;
        Function1 function13;
        final MutableState mutableState;
        boolean zChangedInstance;
        Object objRememberedValue;
        TextMeasurePolicy textMeasurePolicy;
        int currentCompositeKeyHash;
        Composer composerM4088constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Map<String, InlineTextContent> map4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(645129368);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LayoutWithLinksAndInlineContent)P(6,13,8,2,3,12,9:c#ui.text.style.TextOverflow,11,4,5,1,10)578@22283L117,565@21843L1459:BasicText.kt#423gt5");
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i6 & 2) != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            i7 |= composerStartRestartGroup.changed(annotatedString) ? 32 : 16;
        }
        if ((i6 & 4) != 0) {
            i7 |= 384;
        } else if ((i4 & 384) == 0) {
            i7 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i6 & 8) != 0) {
            i7 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i7 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i11 = i6 & 16;
        if (i11 != 0) {
            i7 |= 24576;
        } else {
            if ((i4 & 24576) == 0) {
                map2 = map;
                i7 |= composerStartRestartGroup.changedInstance(map2) ? 16384 : 8192;
            }
            if ((i6 & 32) == 0) {
                i7 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                textStyle2 = textStyle;
            } else {
                textStyle2 = textStyle;
                if ((i4 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                    i7 |= composerStartRestartGroup.changed(textStyle2) ? 131072 : 65536;
                }
            }
            if ((i6 & 64) == 0) {
                i7 |= 1572864;
                i8 = i;
            } else {
                i8 = i;
                if ((i4 & 1572864) == 0) {
                    i7 |= composerStartRestartGroup.changed(i8) ? 1048576 : 524288;
                }
            }
            if ((i6 & 128) == 0) {
                i7 |= 12582912;
            } else {
                if ((12582912 & i4) == 0) {
                    z3 = z2;
                    i7 |= composerStartRestartGroup.changed(z3) ? 8388608 : 4194304;
                }
                if ((i6 & 256) != 0) {
                    i7 |= 100663296;
                } else {
                    if ((100663296 & i4) == 0) {
                        i9 = i2;
                        i7 |= composerStartRestartGroup.changed(i9) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i6 & 512) == 0) {
                        i7 |= 805306368;
                    } else {
                        if ((805306368 & i4) == 0) {
                            i7 |= composerStartRestartGroup.changed(i3) ? PKIFailureInfo.duplicateCertReq : 268435456;
                        }
                        if ((i6 & 1024) != 0) {
                            i10 = i5 | 6;
                        } else if ((i5 & 6) == 0) {
                            i10 = i5 | (composerStartRestartGroup.changedInstance(resolver) ? 4 : 2);
                        } else {
                            i10 = i5;
                        }
                        if ((i6 & 2048) != 0) {
                            i10 |= 48;
                        } else if ((i5 & 48) == 0) {
                            i10 |= composerStartRestartGroup.changedInstance(selectionController) ? 32 : 16;
                        }
                        int i12 = i10;
                        if ((i6 & 4096) != 0) {
                            i12 |= 384;
                        } else {
                            if ((i5 & 384) == 0) {
                                i12 |= composerStartRestartGroup.changedInstance(colorProducer) ? 256 : 128;
                            }
                            if ((i6 & 8192) != 0) {
                                if ((i5 & 3072) == 0) {
                                    i12 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                                }
                                if ((i7 & 306783379) != 306783378 || (i12 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                                    Map<String, InlineTextContent> mapEmptyMap = i11 == 0 ? MapsKt.emptyMap() : map2;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(645129368, i7, i12, "androidx.compose.foundation.text.LayoutWithLinksAndInlineContent (BasicText.kt:536)");
                                    }
                                    if (!TextAnnotatedStringNodeKt.hasLinks(annotatedString)) {
                                        composerStartRestartGroup.startReplaceGroup(-619323167);
                                        ComposerKt.sourceInformation(composerStartRestartGroup, "539@20954L38");
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -297072527, "CC(remember):BasicText.kt#9igjgp");
                                        boolean z4 = (i7 & LDSFile.EF_DG16_TAG) == 32;
                                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                        if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new TextLinkScope(annotatedString);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        composerStartRestartGroup.endReplaceGroup();
                                        textLinkScope = (TextLinkScope) objRememberedValue2;
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(-619265198);
                                        composerStartRestartGroup.endReplaceGroup();
                                        textLinkScope = null;
                                    }
                                    if (!TextAnnotatedStringNodeKt.hasLinks(annotatedString)) {
                                        composerStartRestartGroup.startReplaceGroup(-619074547);
                                        ComposerKt.sourceInformation(composerStartRestartGroup, "545@21203L90");
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -297064507, "CC(remember):BasicText.kt#9igjgp");
                                        boolean zChanged = ((i7 & LDSFile.EF_DG16_TAG) == 32) | composerStartRestartGroup.changed(textLinkScope);
                                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                        if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = (Function0) new Function0<AnnotatedString>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$styledText$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final AnnotatedString invoke() {
                                                    AnnotatedString annotatedStringApplyAnnotators$foundation_release;
                                                    TextLinkScope textLinkScope2 = textLinkScope;
                                                    return (textLinkScope2 == null || (annotatedStringApplyAnnotators$foundation_release = textLinkScope2.applyAnnotators$foundation_release()) == null) ? annotatedString : annotatedStringApplyAnnotators$foundation_release;
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                        }
                                        function0 = (Function0) objRememberedValue3;
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(-618966357);
                                        ComposerKt.sourceInformation(composerStartRestartGroup, "548@21307L8");
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -297061261, "CC(remember):BasicText.kt#9igjgp");
                                        boolean z5 = (i7 & LDSFile.EF_DG16_TAG) == 32;
                                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                        if (z5 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue4 = (Function0) new Function0<AnnotatedString>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$styledText$2$1
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final AnnotatedString invoke() {
                                                    return annotatedString;
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        }
                                        function0 = (Function0) objRememberedValue4;
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        composerStartRestartGroup.endReplaceGroup();
                                    }
                                    if (!z) {
                                        pair = AnnotatedStringResolveInlineContentKt.resolveInlineContent(annotatedString, mapEmptyMap);
                                        map3 = mapEmptyMap;
                                    } else {
                                        map3 = mapEmptyMap;
                                        pair = new Pair<>(null, null);
                                    }
                                    List<AnnotatedString.Range<Placeholder>> listComponent1 = pair.component1();
                                    listComponent2 = pair.component2();
                                    if (!z) {
                                        list = listComponent1;
                                        composerStartRestartGroup.startReplaceGroup(-618671702);
                                        ComposerKt.sourceInformation(composerStartRestartGroup, "558@21610L61");
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -297051512, "CC(remember):BasicText.kt#9igjgp");
                                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                            function13 = null;
                                            objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                        } else {
                                            function13 = null;
                                        }
                                        mutableState = (MutableState) objRememberedValue5;
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else {
                                        list = listComponent1;
                                        function13 = null;
                                        composerStartRestartGroup.startReplaceGroup(-618591630);
                                        composerStartRestartGroup.endReplaceGroup();
                                        mutableState = null;
                                    }
                                    if (!z) {
                                        composerStartRestartGroup.startReplaceGroup(-618506565);
                                        ComposerKt.sourceInformation(composerStartRestartGroup, "562@21777L44");
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -297046185, "CC(remember):BasicText.kt#9igjgp");
                                        boolean zChanged2 = composerStartRestartGroup.changed(mutableState);
                                        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                        if (zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue6 = (Function1) new Function1<List<? extends Rect>, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$onPlaceholderLayout$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends Rect> list2) {
                                                    invoke2((List<Rect>) list2);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(List<Rect> list2) {
                                                    MutableState<List<Rect>> mutableState2 = mutableState;
                                                    if (mutableState2 == null) {
                                                        return;
                                                    }
                                                    mutableState2.setValue(list2);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                        }
                                        function13 = (Function1) objRememberedValue6;
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(-618442830);
                                        composerStartRestartGroup.endReplaceGroup();
                                    }
                                    Modifier modifierM4756graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m4756graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                    AnnotatedString annotatedString2 = (AnnotatedString) function0.invoke();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -297029920, "CC(remember):BasicText.kt#9igjgp");
                                    Function1 function14 = function13;
                                    zChangedInstance = composerStartRestartGroup.changedInstance(textLinkScope) | ((i7 & 896) == 256);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = (Function1) new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$2$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                invoke2(textLayoutResult);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(TextLayoutResult textLayoutResult) {
                                                TextLinkScope textLinkScope2 = textLinkScope;
                                                if (textLinkScope2 != null) {
                                                    textLinkScope2.setTextLayoutResult(textLayoutResult);
                                                }
                                                Function1<TextLayoutResult, Unit> function15 = function1;
                                                if (function15 != null) {
                                                    function15.invoke(textLayoutResult);
                                                }
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    Modifier modifierM1734textModifiercFh6CEA = m1734textModifiercFh6CEA(modifierM4756graphicsLayerAp8cVGQ$default, annotatedString2, textStyle2, (Function1) objRememberedValue, i8, z3, i9, i3, resolver, list, function14, selectionController, colorProducer, function12);
                                    if (z) {
                                        composerStartRestartGroup.startReplaceGroup(-617362851);
                                        ComposerKt.sourceInformation(composerStartRestartGroup, "595@22992L55");
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -297007294, "CC(remember):BasicText.kt#9igjgp");
                                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(textLinkScope);
                                        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue7 = (Function0) new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$3$1
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    TextLinkScope textLinkScope2 = textLinkScope;
                                                    return Boolean.valueOf(textLinkScope2 != null ? textLinkScope2.getShouldMeasureLinks().invoke().booleanValue() : false);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        LinksTextMeasurePolicy linksTextMeasurePolicy = new LinksTextMeasurePolicy((Function0) objRememberedValue7);
                                        composerStartRestartGroup.endReplaceGroup();
                                        textMeasurePolicy = linksTextMeasurePolicy;
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(-617202116);
                                        ComposerKt.sourceInformation(composerStartRestartGroup, "599@23147L55,600@23233L39");
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -297002334, "CC(remember):BasicText.kt#9igjgp");
                                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(textLinkScope);
                                        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                        if (zChangedInstance3 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue8 = (Function0) new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$4$1
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Can't rename method to resolve collision */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Boolean invoke() {
                                                    TextLinkScope textLinkScope2 = textLinkScope;
                                                    return Boolean.valueOf(textLinkScope2 != null ? textLinkScope2.getShouldMeasureLinks().invoke().booleanValue() : false);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                        }
                                        Function0 function02 = (Function0) objRememberedValue8;
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -296999598, "CC(remember):BasicText.kt#9igjgp");
                                        boolean zChanged3 = composerStartRestartGroup.changed(mutableState);
                                        Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                        if (zChanged3 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue9 = (Function0) new Function0<List<? extends Rect>>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$5$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final List<? extends Rect> invoke() {
                                                    MutableState<List<Rect>> mutableState2 = mutableState;
                                                    if (mutableState2 != null) {
                                                        return mutableState2.getValue();
                                                    }
                                                    return null;
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        TextMeasurePolicy textMeasurePolicy2 = new TextMeasurePolicy(function02, (Function0) objRememberedValue9);
                                        composerStartRestartGroup.endReplaceGroup();
                                        textMeasurePolicy = textMeasurePolicy2;
                                    }
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1734textModifiercFh6CEA);
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
                                    Updater.m4095setimpl(composerM4088constructorimpl, textMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -515487512, "C:BasicText.kt#423gt5");
                                    if (textLinkScope != null) {
                                        composerStartRestartGroup.startReplaceGroup(-515480539);
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(537560924);
                                        ComposerKt.sourceInformation(composerStartRestartGroup, "567@21894L18");
                                        textLinkScope.LinksComposables(composerStartRestartGroup, 0);
                                        composerStartRestartGroup.endReplaceGroup();
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    if (listComponent2 != null) {
                                        composerStartRestartGroup.startReplaceGroup(-515428893);
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(-515428892);
                                        ComposerKt.sourceInformation(composerStartRestartGroup, "*569@21966L48");
                                        AnnotatedStringResolveInlineContentKt.InlineChildren(annotatedString, listComponent2, composerStartRestartGroup, (i7 >> 3) & 14);
                                        Unit unit2 = Unit.INSTANCE;
                                        composerStartRestartGroup.endReplaceGroup();
                                        Unit unit3 = Unit.INSTANCE;
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    composerStartRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    map4 = map3;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    map4 = map2;
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$6
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
                                            BasicTextKt.m1732LayoutWithLinksAndInlineContentvOo2fZY(modifier, annotatedString, function1, z, map4, textStyle, i, z2, i2, i3, resolver, selectionController, colorProducer, function12, composer2, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i12 |= 3072;
                            if ((i7 & 306783379) != 306783378) {
                                if (i11 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                if (!TextAnnotatedStringNodeKt.hasLinks(annotatedString)) {
                                }
                                if (!TextAnnotatedStringNodeKt.hasLinks(annotatedString)) {
                                }
                                if (!z) {
                                }
                                List<AnnotatedString.Range<Placeholder>> listComponent12 = pair.component1();
                                listComponent2 = pair.component2();
                                if (!z) {
                                }
                                if (!z) {
                                }
                                Modifier modifierM4756graphicsLayerAp8cVGQ$default2 = GraphicsLayerModifierKt.m4756graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null);
                                AnnotatedString annotatedString22 = (AnnotatedString) function0.invoke();
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -297029920, "CC(remember):BasicText.kt#9igjgp");
                                Function1 function142 = function13;
                                zChangedInstance = composerStartRestartGroup.changedInstance(textLinkScope) | ((i7 & 896) == 256);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance) {
                                    objRememberedValue = (Function1) new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                            invoke2(textLayoutResult);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(TextLayoutResult textLayoutResult) {
                                            TextLinkScope textLinkScope2 = textLinkScope;
                                            if (textLinkScope2 != null) {
                                                textLinkScope2.setTextLayoutResult(textLayoutResult);
                                            }
                                            Function1<TextLayoutResult, Unit> function15 = function1;
                                            if (function15 != null) {
                                                function15.invoke(textLayoutResult);
                                            }
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    Modifier modifierM1734textModifiercFh6CEA2 = m1734textModifiercFh6CEA(modifierM4756graphicsLayerAp8cVGQ$default2, annotatedString22, textStyle2, (Function1) objRememberedValue, i8, z3, i9, i3, resolver, list, function142, selectionController, colorProducer, function12);
                                    if (z) {
                                    }
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1734textModifiercFh6CEA2);
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (!composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM4088constructorimpl = Updater.m4088constructorimpl(composerStartRestartGroup);
                                    Updater.m4095setimpl(composerM4088constructorimpl, textMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!composerM4088constructorimpl.getInserting()) {
                                        composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -515487512, "C:BasicText.kt#423gt5");
                                        if (textLinkScope != null) {
                                        }
                                        if (listComponent2 != null) {
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        composerStartRestartGroup.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        map4 = map3;
                                    }
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        if ((i6 & 8192) != 0) {
                        }
                        if ((i7 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    if ((i6 & 1024) != 0) {
                    }
                    if ((i6 & 2048) != 0) {
                    }
                    int i122 = i10;
                    if ((i6 & 4096) != 0) {
                    }
                    if ((i6 & 8192) != 0) {
                    }
                    if ((i7 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i9 = i2;
                if ((i6 & 512) == 0) {
                }
                if ((i6 & 1024) != 0) {
                }
                if ((i6 & 2048) != 0) {
                }
                int i1222 = i10;
                if ((i6 & 4096) != 0) {
                }
                if ((i6 & 8192) != 0) {
                }
                if ((i7 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z3 = z2;
            if ((i6 & 256) != 0) {
            }
            i9 = i2;
            if ((i6 & 512) == 0) {
            }
            if ((i6 & 1024) != 0) {
            }
            if ((i6 & 2048) != 0) {
            }
            int i12222 = i10;
            if ((i6 & 4096) != 0) {
            }
            if ((i6 & 8192) != 0) {
            }
            if ((i7 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        map2 = map;
        if ((i6 & 32) == 0) {
        }
        if ((i6 & 64) == 0) {
        }
        if ((i6 & 128) == 0) {
        }
        z3 = z2;
        if ((i6 & 256) != 0) {
        }
        i9 = i2;
        if ((i6 & 512) == 0) {
        }
        if ((i6 & 1024) != 0) {
        }
        if ((i6 & 2048) != 0) {
        }
        int i122222 = i10;
        if ((i6 & 4096) != 0) {
        }
        if ((i6 & 8192) != 0) {
        }
        if ((i7 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
