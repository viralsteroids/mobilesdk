package androidx.compose.material3;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.material3.tokens.TypographyTokensKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ColorProducer;
import androidx.compose.p000ui.text.AnnotatedString;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.text.style.TextOverflow;
import androidx.compose.p000ui.unit.TextUnit;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.i18n.TextBundle;
import org.jmrtd.lds.LDSFile;

/* compiled from: Text.kt */
@Metadata(m513d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\u001aæ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001aÜ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001aÆ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010,\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00060-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001aÒ\u0001\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020*2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\u00142\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020&2\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u0006\u0018\u00010-2\b\b\u0002\u0010/\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00106\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00067"}, m514d2 = {"LocalTextStyle", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/text/TextStyle;", "getLocalTextStyle", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ProvideTextStyle", "", "value", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Text", TextBundle.TEXT_ENTRY, "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "letterSpacing", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "lineHeight", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "minLines", "inlineContent", "", "", "Landroidx/compose/foundation/text/InlineTextContent;", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "style", "Text-IbK3jfQ", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text--4IGK_g", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILjava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "Text-fLXpl1I", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V", "material3_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class TextKt {
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<TextStyle>() { // from class: androidx.compose.material3.TextKt$LocalTextStyle$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final TextStyle invoke() {
            return TypographyTokensKt.getDefaultTextStyle();
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:100:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:269:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011c  */
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3128Text4IGK_g(final String str, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        long jM4631getUnspecified0d7_KjU;
        int i9;
        int i10;
        long jM7259getUnspecifiedXSAIIZE;
        int i11;
        FontStyle fontStyle2;
        int i12;
        FontWeight fontWeight2;
        int i13;
        FontFamily fontFamily2;
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
        boolean z2;
        int i26;
        int i27;
        int i28;
        int i29;
        Modifier.Companion companion;
        final TextAlign textAlign2;
        final int iM6993getClipgIe3tQ8;
        int i30;
        int i31;
        Function1<? super TextLayoutResult, Unit> function12;
        TextStyle textStyle2;
        TextDecoration textDecoration2;
        FontStyle fontStyle3;
        long j5;
        FontWeight fontWeight3;
        FontFamily fontFamily3;
        long j6;
        long j7;
        long j8;
        Composer composer2;
        final Function1<? super TextLayoutResult, Unit> function13;
        final long j9;
        final int i32;
        final int i33;
        final TextStyle textStyle3;
        final FontWeight fontWeight4;
        final FontStyle fontStyle4;
        final FontFamily fontFamily4;
        final long j10;
        final TextDecoration textDecoration3;
        final long j11;
        final Modifier modifier2;
        final boolean z3;
        final long j12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2055108902);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Text)P(14,9,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,5:c#ui.unit.TextUnit,16,15:c#ui.text.style.TextAlign,6:c#ui.unit.TextUnit,11:c#ui.text.style.TextOverflow,12)108@5620L7,113@5732L530:Text.kt#uh7d8r");
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i34 = i6 & 2;
        if (i34 != 0) {
            i7 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                i7 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 == 0) {
                i9 = i7 | 384;
                jM4631getUnspecified0d7_KjU = j;
            } else {
                int i35 = i7;
                jM4631getUnspecified0d7_KjU = j;
                if ((i4 & 384) == 0) {
                    i35 |= composerStartRestartGroup.changed(jM4631getUnspecified0d7_KjU) ? 256 : 128;
                }
                i9 = i35;
            }
            i10 = i6 & 8;
            if (i10 == 0) {
                i9 |= 3072;
                jM7259getUnspecifiedXSAIIZE = j2;
            } else {
                jM7259getUnspecifiedXSAIIZE = j2;
                if ((i4 & 3072) == 0) {
                    i9 |= composerStartRestartGroup.changed(jM7259getUnspecifiedXSAIIZE) ? 2048 : 1024;
                }
            }
            i11 = i6 & 16;
            if (i11 == 0) {
                i9 |= 24576;
            } else {
                if ((i4 & 24576) == 0) {
                    fontStyle2 = fontStyle;
                    i9 |= composerStartRestartGroup.changed(fontStyle2) ? 16384 : 8192;
                }
                i12 = i6 & 32;
                if (i12 != 0) {
                    i9 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i4 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                        i9 |= composerStartRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                    }
                }
                i13 = i6 & 64;
                if (i13 != 0) {
                    i9 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i4 & 1572864) == 0) {
                        i9 |= composerStartRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
                    }
                }
                i14 = i6 & 128;
                if (i14 != 0) {
                    i9 |= 12582912;
                } else {
                    if ((i4 & 12582912) == 0) {
                        i15 = i9 | (composerStartRestartGroup.changed(j3) ? 8388608 : 4194304);
                    }
                    i16 = i6 & 256;
                    if (i16 == 0) {
                        i15 |= 100663296;
                    } else {
                        if ((i4 & 100663296) == 0) {
                            i17 = i16;
                            i15 |= composerStartRestartGroup.changed(textDecoration) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i18 = i6 & 512;
                        if (i18 != 0) {
                            i15 |= 805306368;
                            i19 = i18;
                        } else if ((i4 & 805306368) == 0) {
                            i19 = i18;
                            i15 |= composerStartRestartGroup.changed(textAlign) ? PKIFailureInfo.duplicateCertReq : 268435456;
                        } else {
                            i19 = i18;
                        }
                        i20 = i15;
                        i21 = i6 & 1024;
                        if (i21 != 0) {
                            i22 = i5 | 6;
                        } else if ((i5 & 6) == 0) {
                            i22 = i5 | (composerStartRestartGroup.changed(j4) ? 4 : 2);
                        } else {
                            i22 = i5;
                        }
                        i23 = i6 & 2048;
                        if (i23 != 0) {
                            i22 |= 48;
                            i24 = i23;
                        } else if ((i5 & 48) == 0) {
                            i24 = i23;
                            i22 |= composerStartRestartGroup.changed(i) ? 32 : 16;
                        } else {
                            i24 = i23;
                        }
                        int i36 = i22;
                        i25 = i6 & 4096;
                        if (i25 != 0) {
                            i36 |= 384;
                        } else {
                            if ((i5 & 384) == 0) {
                                z2 = z;
                                i36 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                            }
                            i26 = i6 & 8192;
                            if (i26 == 0) {
                                i27 = i36 | 3072;
                            } else {
                                int i37 = i36;
                                if ((i5 & 3072) == 0) {
                                    i27 = i37 | (composerStartRestartGroup.changed(i2) ? 2048 : 1024);
                                } else {
                                    i27 = i37;
                                }
                            }
                            i28 = i6 & 16384;
                            if (i28 != 0) {
                                if ((i5 & 24576) == 0) {
                                    i27 |= composerStartRestartGroup.changed(i3) ? 16384 : 8192;
                                }
                                i29 = i6 & 32768;
                                if (i29 != 0) {
                                    i27 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                                } else if ((i5 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                                    i27 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
                                }
                                if ((i5 & 1572864) == 0) {
                                    i27 |= ((i6 & 65536) == 0 && composerStartRestartGroup.changed(textStyle)) ? 1048576 : 524288;
                                }
                                if ((i20 & 306783379) != 306783378 || (599187 & i27) != 599186 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i4 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        companion = i34 == 0 ? Modifier.INSTANCE : modifier;
                                        if (i8 != 0) {
                                            jM4631getUnspecified0d7_KjU = Color.INSTANCE.m4631getUnspecified0d7_KjU();
                                        }
                                        if (i10 != 0) {
                                            jM7259getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m7259getUnspecifiedXSAIIZE();
                                        }
                                        if (i11 != 0) {
                                            fontStyle2 = null;
                                        }
                                        if (i12 != 0) {
                                            fontWeight2 = null;
                                        }
                                        if (i13 != 0) {
                                            fontFamily2 = null;
                                        }
                                        long jM7259getUnspecifiedXSAIIZE2 = i14 == 0 ? TextUnit.INSTANCE.m7259getUnspecifiedXSAIIZE() : j3;
                                        TextDecoration textDecoration4 = i17 == 0 ? null : textDecoration;
                                        textAlign2 = i19 == 0 ? null : textAlign;
                                        long jM7259getUnspecifiedXSAIIZE3 = i21 == 0 ? TextUnit.INSTANCE.m7259getUnspecifiedXSAIIZE() : j4;
                                        iM6993getClipgIe3tQ8 = i24 == 0 ? TextOverflow.INSTANCE.m6993getClipgIe3tQ8() : i;
                                        if (i25 != 0) {
                                            z2 = true;
                                        }
                                        i30 = i26 == 0 ? Integer.MAX_VALUE : i2;
                                        i31 = i28 == 0 ? i3 : 1;
                                        function12 = i29 == 0 ? function1 : null;
                                        if ((i6 & 65536) == 0) {
                                            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                            Modifier modifier3 = companion;
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume = composerStartRestartGroup.consume(providableCompositionLocal);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            i27 &= -3670017;
                                            function12 = function12;
                                            textStyle2 = (TextStyle) objConsume;
                                            textDecoration2 = textDecoration4;
                                            fontStyle3 = fontStyle2;
                                            j5 = jM7259getUnspecifiedXSAIIZE;
                                            fontWeight3 = fontWeight2;
                                            fontFamily3 = fontFamily2;
                                            j6 = jM7259getUnspecifiedXSAIIZE2;
                                            j7 = jM7259getUnspecifiedXSAIIZE3;
                                            companion = modifier3;
                                        } else {
                                            textStyle2 = textStyle;
                                            textDecoration2 = textDecoration4;
                                            fontStyle3 = fontStyle2;
                                            j5 = jM7259getUnspecifiedXSAIIZE;
                                            fontWeight3 = fontWeight2;
                                            fontFamily3 = fontFamily2;
                                            j6 = jM7259getUnspecifiedXSAIIZE2;
                                            j7 = jM7259getUnspecifiedXSAIIZE3;
                                        }
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i6 & 65536) != 0) {
                                            i27 &= -3670017;
                                        }
                                        companion = modifier;
                                        j6 = j3;
                                        textDecoration2 = textDecoration;
                                        textAlign2 = textAlign;
                                        j7 = j4;
                                        iM6993getClipgIe3tQ8 = i;
                                        i30 = i2;
                                        i31 = i3;
                                        function12 = function1;
                                        textStyle2 = textStyle;
                                        fontStyle3 = fontStyle2;
                                        j5 = jM7259getUnspecifiedXSAIIZE;
                                        fontWeight3 = fontWeight2;
                                        fontFamily3 = fontFamily2;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2055108902, i20, i27, "androidx.compose.material3.Text (Text.kt:109)");
                                    }
                                    composerStartRestartGroup.startReplaceGroup(-1827892941);
                                    ComposerKt.sourceInformation(composerStartRestartGroup, "");
                                    if (jM4631getUnspecified0d7_KjU == 16) {
                                        j8 = jM4631getUnspecified0d7_KjU;
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(-1827892168);
                                        ComposerKt.sourceInformation(composerStartRestartGroup, "*111@5715L7");
                                        long jM6570getColor0d7_KjU = textStyle2.m6570getColor0d7_KjU();
                                        if (jM6570getColor0d7_KjU == 16) {
                                            ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume2 = composerStartRestartGroup.consume(localContentColor);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            jM6570getColor0d7_KjU = ((Color) objConsume2).m4605unboximpl();
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        j8 = jM6570getColor0d7_KjU;
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    int i38 = (i20 & 126) | ((i27 >> 6) & 7168);
                                    int i39 = i27 << 9;
                                    BasicTextKt.m1731BasicTextVhcvRP8(str, companion, TextStyle.m6560mergedA7vx0o$default(textStyle2, j8, j5, fontWeight3, fontStyle3, null, fontFamily3, null, j6, null, null, null, 0L, textDecoration2, null, null, textAlign2 == null ? textAlign2.getValue() : TextAlign.INSTANCE.m6950getUnspecifiede0LSkKk(), 0, j7, null, null, 0, 0, null, null, 16609104, null), function12, iM6993getClipgIe3tQ8, z2, i30, i31, (ColorProducer) null, composerStartRestartGroup, i38 | (57344 & i39) | (458752 & i39) | (3670016 & i39) | (i39 & 29360128), 256);
                                    composer2 = composerStartRestartGroup;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    function13 = function12;
                                    j9 = jM4631getUnspecified0d7_KjU;
                                    i32 = i30;
                                    i33 = i31;
                                    textStyle3 = textStyle2;
                                    fontWeight4 = fontWeight3;
                                    fontStyle4 = fontStyle3;
                                    fontFamily4 = fontFamily3;
                                    j10 = j6;
                                    textDecoration3 = textDecoration2;
                                    j11 = j7;
                                    modifier2 = companion;
                                    z3 = z2;
                                    j12 = j5;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier2 = modifier;
                                    textAlign2 = textAlign;
                                    iM6993getClipgIe3tQ8 = i;
                                    i32 = i2;
                                    i33 = i3;
                                    function13 = function1;
                                    textStyle3 = textStyle;
                                    composer2 = composerStartRestartGroup;
                                    z3 = z2;
                                    j9 = jM4631getUnspecified0d7_KjU;
                                    fontStyle4 = fontStyle2;
                                    j12 = jM7259getUnspecifiedXSAIIZE;
                                    fontWeight4 = fontWeight2;
                                    fontFamily4 = fontFamily2;
                                    j10 = j3;
                                    textDecoration3 = textDecoration;
                                    j11 = j4;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$1
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
                                            TextKt.m3128Text4IGK_g(str, modifier2, j9, j12, fontStyle4, fontWeight4, fontFamily4, j10, textDecoration3, textAlign2, j11, iM6993getClipgIe3tQ8, z3, i32, i33, function13, textStyle3, composer3, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i27 |= 24576;
                            i29 = i6 & 32768;
                            if (i29 != 0) {
                            }
                            if ((i5 & 1572864) == 0) {
                            }
                            if ((i20 & 306783379) != 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i4 & 1) != 0) {
                                    if (i34 == 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i11 != 0) {
                                    }
                                    if (i12 != 0) {
                                    }
                                    if (i13 != 0) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i19 == 0) {
                                    }
                                    if (i21 == 0) {
                                    }
                                    if (i24 == 0) {
                                    }
                                    if (i25 != 0) {
                                    }
                                    if (i26 == 0) {
                                    }
                                    if (i28 == 0) {
                                    }
                                    if (i29 == 0) {
                                    }
                                    if ((i6 & 65536) == 0) {
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composerStartRestartGroup.startReplaceGroup(-1827892941);
                                    ComposerKt.sourceInformation(composerStartRestartGroup, "");
                                    if (jM4631getUnspecified0d7_KjU == 16) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    int i382 = (i20 & 126) | ((i27 >> 6) & 7168);
                                    int i392 = i27 << 9;
                                    BasicTextKt.m1731BasicTextVhcvRP8(str, companion, TextStyle.m6560mergedA7vx0o$default(textStyle2, j8, j5, fontWeight3, fontStyle3, null, fontFamily3, null, j6, null, null, null, 0L, textDecoration2, null, null, textAlign2 == null ? textAlign2.getValue() : TextAlign.INSTANCE.m6950getUnspecifiede0LSkKk(), 0, j7, null, null, 0, 0, null, null, 16609104, null), function12, iM6993getClipgIe3tQ8, z2, i30, i31, (ColorProducer) null, composerStartRestartGroup, i382 | (57344 & i392) | (458752 & i392) | (3670016 & i392) | (i392 & 29360128), 256);
                                    composer2 = composerStartRestartGroup;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    function13 = function12;
                                    j9 = jM4631getUnspecified0d7_KjU;
                                    i32 = i30;
                                    i33 = i31;
                                    textStyle3 = textStyle2;
                                    fontWeight4 = fontWeight3;
                                    fontStyle4 = fontStyle3;
                                    fontFamily4 = fontFamily3;
                                    j10 = j6;
                                    textDecoration3 = textDecoration2;
                                    j11 = j7;
                                    modifier2 = companion;
                                    z3 = z2;
                                    j12 = j5;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        z2 = z;
                        i26 = i6 & 8192;
                        if (i26 == 0) {
                        }
                        i28 = i6 & 16384;
                        if (i28 != 0) {
                        }
                        i29 = i6 & 32768;
                        if (i29 != 0) {
                        }
                        if ((i5 & 1572864) == 0) {
                        }
                        if ((i20 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i17 = i16;
                    i18 = i6 & 512;
                    if (i18 != 0) {
                    }
                    i20 = i15;
                    i21 = i6 & 1024;
                    if (i21 != 0) {
                    }
                    i23 = i6 & 2048;
                    if (i23 != 0) {
                    }
                    int i362 = i22;
                    i25 = i6 & 4096;
                    if (i25 != 0) {
                    }
                    z2 = z;
                    i26 = i6 & 8192;
                    if (i26 == 0) {
                    }
                    i28 = i6 & 16384;
                    if (i28 != 0) {
                    }
                    i29 = i6 & 32768;
                    if (i29 != 0) {
                    }
                    if ((i5 & 1572864) == 0) {
                    }
                    if ((i20 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i15 = i9;
                i16 = i6 & 256;
                if (i16 == 0) {
                }
                i17 = i16;
                i18 = i6 & 512;
                if (i18 != 0) {
                }
                i20 = i15;
                i21 = i6 & 1024;
                if (i21 != 0) {
                }
                i23 = i6 & 2048;
                if (i23 != 0) {
                }
                int i3622 = i22;
                i25 = i6 & 4096;
                if (i25 != 0) {
                }
                z2 = z;
                i26 = i6 & 8192;
                if (i26 == 0) {
                }
                i28 = i6 & 16384;
                if (i28 != 0) {
                }
                i29 = i6 & 32768;
                if (i29 != 0) {
                }
                if ((i5 & 1572864) == 0) {
                }
                if ((i20 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            fontStyle2 = fontStyle;
            i12 = i6 & 32;
            if (i12 != 0) {
            }
            i13 = i6 & 64;
            if (i13 != 0) {
            }
            i14 = i6 & 128;
            if (i14 != 0) {
            }
            i15 = i9;
            i16 = i6 & 256;
            if (i16 == 0) {
            }
            i17 = i16;
            i18 = i6 & 512;
            if (i18 != 0) {
            }
            i20 = i15;
            i21 = i6 & 1024;
            if (i21 != 0) {
            }
            i23 = i6 & 2048;
            if (i23 != 0) {
            }
            int i36222 = i22;
            i25 = i6 & 4096;
            if (i25 != 0) {
            }
            z2 = z;
            i26 = i6 & 8192;
            if (i26 == 0) {
            }
            i28 = i6 & 16384;
            if (i28 != 0) {
            }
            i29 = i6 & 32768;
            if (i29 != 0) {
            }
            if ((i5 & 1572864) == 0) {
            }
            if ((i20 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i10 = i6 & 8;
        if (i10 == 0) {
        }
        i11 = i6 & 16;
        if (i11 == 0) {
        }
        fontStyle2 = fontStyle;
        i12 = i6 & 32;
        if (i12 != 0) {
        }
        i13 = i6 & 64;
        if (i13 != 0) {
        }
        i14 = i6 & 128;
        if (i14 != 0) {
        }
        i15 = i9;
        i16 = i6 & 256;
        if (i16 == 0) {
        }
        i17 = i16;
        i18 = i6 & 512;
        if (i18 != 0) {
        }
        i20 = i15;
        i21 = i6 & 1024;
        if (i21 != 0) {
        }
        i23 = i6 & 2048;
        if (i23 != 0) {
        }
        int i362222 = i22;
        i25 = i6 & 4096;
        if (i25 != 0) {
        }
        z2 = z;
        i26 = i6 & 8192;
        if (i26 == 0) {
        }
        i28 = i6 & 16384;
        if (i28 != 0) {
        }
        i29 = i6 & 32768;
        if (i29 != 0) {
        }
        if ((i5 & 1572864) == 0) {
        }
        if ((i20 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011a  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: Text-fLXpl1I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m3130TextfLXpl1I(final String str, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Function1 function1, TextStyle textStyle, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        long jM4631getUnspecified0d7_KjU;
        int i8;
        int i9;
        long jM7259getUnspecifiedXSAIIZE;
        int i10;
        FontStyle fontStyle2;
        int i11;
        FontWeight fontWeight2;
        int i12;
        FontFamily fontFamily2;
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
        boolean z2;
        int i25;
        int i26;
        int i27;
        Modifier modifier2;
        TextAlign textAlign2;
        boolean z3;
        long j5;
        int i28;
        long j6;
        TextStyle textStyle2;
        Function1 function12;
        Modifier modifier3;
        TextAlign textAlign3;
        TextDecoration textDecoration2;
        long j7;
        FontWeight fontWeight3;
        FontFamily fontFamily3;
        long j8;
        int i29;
        Composer composer2;
        final Modifier modifier4;
        final long j9;
        final long j10;
        final FontStyle fontStyle3;
        final FontWeight fontWeight4;
        final FontFamily fontFamily4;
        final long j11;
        final TextDecoration textDecoration3;
        final TextAlign textAlign4;
        final long j12;
        final int i30;
        final boolean z4;
        final int i31;
        final Function1 function13;
        final TextStyle textStyle3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1968784669);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Text)P(13,8,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,5:c#ui.unit.TextUnit,15,14:c#ui.text.style.TextAlign,6:c#ui.unit.TextUnit,10:c#ui.text.style.TextOverflow,11)156@7042L7,158@7058L322:Text.kt#uh7d8r");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i32 = i5 & 2;
        if (i32 != 0) {
            i6 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i6 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i8 = i6 | 384;
                jM4631getUnspecified0d7_KjU = j;
            } else {
                int i33 = i6;
                jM4631getUnspecified0d7_KjU = j;
                if ((i3 & 384) == 0) {
                    i33 |= composerStartRestartGroup.changed(jM4631getUnspecified0d7_KjU) ? 256 : 128;
                }
                i8 = i33;
            }
            i9 = i5 & 8;
            if (i9 == 0) {
                i8 |= 3072;
                jM7259getUnspecifiedXSAIIZE = j2;
            } else {
                jM7259getUnspecifiedXSAIIZE = j2;
                if ((i3 & 3072) == 0) {
                    i8 |= composerStartRestartGroup.changed(jM7259getUnspecifiedXSAIIZE) ? 2048 : 1024;
                }
            }
            i10 = i5 & 16;
            if (i10 == 0) {
                i8 |= 24576;
            } else {
                if ((i3 & 24576) == 0) {
                    fontStyle2 = fontStyle;
                    i8 |= composerStartRestartGroup.changed(fontStyle2) ? 16384 : 8192;
                }
                i11 = i5 & 32;
                int i34 = 65536;
                if (i11 != 0) {
                    i8 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i3 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                        i8 |= composerStartRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                    }
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                    i8 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i3 & 1572864) == 0) {
                        i8 |= composerStartRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
                    }
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                    i8 |= 12582912;
                } else {
                    if ((i3 & 12582912) == 0) {
                        i14 = i8 | (composerStartRestartGroup.changed(j3) ? 8388608 : 4194304);
                    }
                    i15 = i5 & 256;
                    if (i15 == 0) {
                        i14 |= 100663296;
                    } else {
                        if ((i3 & 100663296) == 0) {
                            i16 = i15;
                            i14 |= composerStartRestartGroup.changed(textDecoration) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i17 = i5 & 512;
                        if (i17 != 0) {
                            i14 |= 805306368;
                            i18 = i17;
                        } else if ((i3 & 805306368) == 0) {
                            i18 = i17;
                            i14 |= composerStartRestartGroup.changed(textAlign) ? PKIFailureInfo.duplicateCertReq : 268435456;
                        } else {
                            i18 = i17;
                        }
                        i19 = i14;
                        i20 = i5 & 1024;
                        if (i20 != 0) {
                            i21 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            i21 = i4 | (composerStartRestartGroup.changed(j4) ? 4 : 2);
                        } else {
                            i21 = i4;
                        }
                        i22 = i5 & 2048;
                        if (i22 != 0) {
                            i21 |= 48;
                            i23 = i22;
                        } else if ((i4 & 48) == 0) {
                            i23 = i22;
                            i21 |= composerStartRestartGroup.changed(i) ? 32 : 16;
                        } else {
                            i23 = i22;
                        }
                        int i35 = i21;
                        i24 = i5 & 4096;
                        if (i24 != 0) {
                            i35 |= 384;
                        } else {
                            if ((i4 & 384) == 0) {
                                z2 = z;
                                i35 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                            }
                            i25 = i5 & 8192;
                            if (i25 == 0) {
                                i26 = i35 | 3072;
                            } else {
                                int i36 = i35;
                                if ((i4 & 3072) == 0) {
                                    i26 = i36 | (composerStartRestartGroup.changed(i2) ? 2048 : 1024);
                                } else {
                                    i26 = i36;
                                }
                            }
                            i27 = i5 & 16384;
                            if (i27 != 0) {
                                if ((i4 & 24576) == 0) {
                                    i26 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
                                }
                                if ((i4 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                                    if ((i5 & 32768) == 0 && composerStartRestartGroup.changed(textStyle)) {
                                        i34 = 131072;
                                    }
                                    i26 |= i34;
                                }
                                if ((i19 & 306783379) != 306783378 || (74899 & i26) != 74898 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        Modifier.Companion companion = i32 == 0 ? Modifier.INSTANCE : modifier;
                                        if (i7 != 0) {
                                            jM4631getUnspecified0d7_KjU = Color.INSTANCE.m4631getUnspecified0d7_KjU();
                                        }
                                        if (i9 != 0) {
                                            jM7259getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m7259getUnspecifiedXSAIIZE();
                                        }
                                        if (i10 != 0) {
                                            fontStyle2 = null;
                                        }
                                        if (i11 != 0) {
                                            fontWeight2 = null;
                                        }
                                        if (i12 != 0) {
                                            fontFamily2 = null;
                                        }
                                        long jM7259getUnspecifiedXSAIIZE2 = i13 == 0 ? TextUnit.INSTANCE.m7259getUnspecifiedXSAIIZE() : j3;
                                        TextDecoration textDecoration4 = i16 == 0 ? null : textDecoration;
                                        TextAlign textAlign5 = i18 == 0 ? textAlign : null;
                                        long jM7259getUnspecifiedXSAIIZE3 = i20 == 0 ? TextUnit.INSTANCE.m7259getUnspecifiedXSAIIZE() : j4;
                                        int iM6993getClipgIe3tQ8 = i23 == 0 ? TextOverflow.INSTANCE.m6993getClipgIe3tQ8() : i;
                                        if (i24 != 0) {
                                            z2 = true;
                                        }
                                        int i37 = i25 == 0 ? Integer.MAX_VALUE : i2;
                                        TextKt$Text$2 textKt$Text$2 = i27 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material3.TextKt$Text$2
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(TextLayoutResult textLayoutResult) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                invoke2(textLayoutResult);
                                                return Unit.INSTANCE;
                                            }
                                        } : function1;
                                        if ((i5 & 32768) == 0) {
                                            modifier2 = companion;
                                            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                            textAlign2 = textAlign5;
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume = composerStartRestartGroup.consume(providableCompositionLocal);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            i26 &= -458753;
                                            z3 = z2;
                                            j5 = jM4631getUnspecified0d7_KjU;
                                            i28 = iM6993getClipgIe3tQ8;
                                            j6 = jM7259getUnspecifiedXSAIIZE3;
                                            textStyle2 = (TextStyle) objConsume;
                                        } else {
                                            modifier2 = companion;
                                            textAlign2 = textAlign5;
                                            z3 = z2;
                                            j5 = jM4631getUnspecified0d7_KjU;
                                            i28 = iM6993getClipgIe3tQ8;
                                            j6 = jM7259getUnspecifiedXSAIIZE3;
                                            textStyle2 = textStyle;
                                        }
                                        function12 = textKt$Text$2;
                                        modifier3 = modifier2;
                                        int i38 = i37;
                                        textAlign3 = textAlign2;
                                        FontFamily fontFamily5 = fontFamily2;
                                        textDecoration2 = textDecoration4;
                                        j7 = jM7259getUnspecifiedXSAIIZE;
                                        fontWeight3 = fontWeight2;
                                        fontFamily3 = fontFamily5;
                                        j8 = jM7259getUnspecifiedXSAIIZE2;
                                        i29 = i38;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i5 & 32768) != 0) {
                                            i26 &= -458753;
                                        }
                                        modifier3 = modifier;
                                        textAlign3 = textAlign;
                                        j6 = j4;
                                        i28 = i;
                                        i29 = i2;
                                        function12 = function1;
                                        textStyle2 = textStyle;
                                        z3 = z2;
                                        j5 = jM4631getUnspecified0d7_KjU;
                                        j7 = jM7259getUnspecifiedXSAIIZE;
                                        fontWeight3 = fontWeight2;
                                        fontFamily3 = fontFamily2;
                                        j8 = j3;
                                        textDecoration2 = textDecoration;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1968784669, i19, i26, "androidx.compose.material3.Text (Text.kt:157)");
                                    }
                                    int i39 = i26 << 3;
                                    composer2 = composerStartRestartGroup;
                                    m3128Text4IGK_g(str, modifier3, j5, j7, fontStyle2, fontWeight3, fontFamily3, j8, textDecoration2, textAlign3, j6, i28, z3, i29, 1, (Function1<? super TextLayoutResult, Unit>) function12, textStyle2, composer2, i19 & 2147483646, (i26 & 14) | 24576 | (i26 & LDSFile.EF_DG16_TAG) | (i26 & 896) | (i26 & 7168) | (458752 & i39) | (i39 & 3670016), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier4 = modifier3;
                                    j9 = j5;
                                    j10 = j7;
                                    fontStyle3 = fontStyle2;
                                    fontWeight4 = fontWeight3;
                                    fontFamily4 = fontFamily3;
                                    j11 = j8;
                                    textDecoration3 = textDecoration2;
                                    textAlign4 = textAlign3;
                                    j12 = j6;
                                    i30 = i28;
                                    z4 = z3;
                                    i31 = i29;
                                    function13 = function12;
                                    textStyle3 = textStyle2;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier4 = modifier;
                                    textAlign4 = textAlign;
                                    i30 = i;
                                    i31 = i2;
                                    function13 = function1;
                                    textStyle3 = textStyle;
                                    composer2 = composerStartRestartGroup;
                                    z4 = z2;
                                    j9 = jM4631getUnspecified0d7_KjU;
                                    fontStyle3 = fontStyle2;
                                    j10 = jM7259getUnspecifiedXSAIIZE;
                                    fontWeight4 = fontWeight2;
                                    fontFamily4 = fontFamily2;
                                    j11 = j3;
                                    textDecoration3 = textDecoration;
                                    j12 = j4;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$3
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
                                            TextKt.m3130TextfLXpl1I(str, modifier4, j9, j10, fontStyle3, fontWeight4, fontFamily4, j11, textDecoration3, textAlign4, j12, i30, z4, i31, function13, textStyle3, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i26 |= 24576;
                            if ((i4 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                            }
                            if ((i19 & 306783379) != 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i3 & 1) != 0) {
                                    if (i32 == 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i11 != 0) {
                                    }
                                    if (i12 != 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    if (i18 == 0) {
                                    }
                                    if (i20 == 0) {
                                    }
                                    if (i23 == 0) {
                                    }
                                    if (i24 != 0) {
                                    }
                                    if (i25 == 0) {
                                    }
                                    if (i27 == 0) {
                                    }
                                    if ((i5 & 32768) == 0) {
                                    }
                                    function12 = textKt$Text$2;
                                    modifier3 = modifier2;
                                    int i382 = i37;
                                    textAlign3 = textAlign2;
                                    FontFamily fontFamily52 = fontFamily2;
                                    textDecoration2 = textDecoration4;
                                    j7 = jM7259getUnspecifiedXSAIIZE;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily52;
                                    j8 = jM7259getUnspecifiedXSAIIZE2;
                                    i29 = i382;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    int i392 = i26 << 3;
                                    composer2 = composerStartRestartGroup;
                                    m3128Text4IGK_g(str, modifier3, j5, j7, fontStyle2, fontWeight3, fontFamily3, j8, textDecoration2, textAlign3, j6, i28, z3, i29, 1, (Function1<? super TextLayoutResult, Unit>) function12, textStyle2, composer2, i19 & 2147483646, (i26 & 14) | 24576 | (i26 & LDSFile.EF_DG16_TAG) | (i26 & 896) | (i26 & 7168) | (458752 & i392) | (i392 & 3670016), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier4 = modifier3;
                                    j9 = j5;
                                    j10 = j7;
                                    fontStyle3 = fontStyle2;
                                    fontWeight4 = fontWeight3;
                                    fontFamily4 = fontFamily3;
                                    j11 = j8;
                                    textDecoration3 = textDecoration2;
                                    textAlign4 = textAlign3;
                                    j12 = j6;
                                    i30 = i28;
                                    z4 = z3;
                                    i31 = i29;
                                    function13 = function12;
                                    textStyle3 = textStyle2;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        z2 = z;
                        i25 = i5 & 8192;
                        if (i25 == 0) {
                        }
                        i27 = i5 & 16384;
                        if (i27 != 0) {
                        }
                        if ((i4 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                        }
                        if ((i19 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i16 = i15;
                    i17 = i5 & 512;
                    if (i17 != 0) {
                    }
                    i19 = i14;
                    i20 = i5 & 1024;
                    if (i20 != 0) {
                    }
                    i22 = i5 & 2048;
                    if (i22 != 0) {
                    }
                    int i352 = i21;
                    i24 = i5 & 4096;
                    if (i24 != 0) {
                    }
                    z2 = z;
                    i25 = i5 & 8192;
                    if (i25 == 0) {
                    }
                    i27 = i5 & 16384;
                    if (i27 != 0) {
                    }
                    if ((i4 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                    }
                    if ((i19 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i14 = i8;
                i15 = i5 & 256;
                if (i15 == 0) {
                }
                i16 = i15;
                i17 = i5 & 512;
                if (i17 != 0) {
                }
                i19 = i14;
                i20 = i5 & 1024;
                if (i20 != 0) {
                }
                i22 = i5 & 2048;
                if (i22 != 0) {
                }
                int i3522 = i21;
                i24 = i5 & 4096;
                if (i24 != 0) {
                }
                z2 = z;
                i25 = i5 & 8192;
                if (i25 == 0) {
                }
                i27 = i5 & 16384;
                if (i27 != 0) {
                }
                if ((i4 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                }
                if ((i19 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            fontStyle2 = fontStyle;
            i11 = i5 & 32;
            int i342 = 65536;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i8;
            i15 = i5 & 256;
            if (i15 == 0) {
            }
            i16 = i15;
            i17 = i5 & 512;
            if (i17 != 0) {
            }
            i19 = i14;
            i20 = i5 & 1024;
            if (i20 != 0) {
            }
            i22 = i5 & 2048;
            if (i22 != 0) {
            }
            int i35222 = i21;
            i24 = i5 & 4096;
            if (i24 != 0) {
            }
            z2 = z;
            i25 = i5 & 8192;
            if (i25 == 0) {
            }
            i27 = i5 & 16384;
            if (i27 != 0) {
            }
            if ((i4 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
            }
            if ((i19 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i9 = i5 & 8;
        if (i9 == 0) {
        }
        i10 = i5 & 16;
        if (i10 == 0) {
        }
        fontStyle2 = fontStyle;
        i11 = i5 & 32;
        int i3422 = 65536;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i8;
        i15 = i5 & 256;
        if (i15 == 0) {
        }
        i16 = i15;
        i17 = i5 & 512;
        if (i17 != 0) {
        }
        i19 = i14;
        i20 = i5 & 1024;
        if (i20 != 0) {
        }
        i22 = i5 & 2048;
        if (i22 != 0) {
        }
        int i352222 = i21;
        i24 = i5 & 4096;
        if (i24 != 0) {
        }
        z2 = z;
        i25 = i5 & 8192;
        if (i25 == 0) {
        }
        i27 = i5 & 16384;
        if (i27 != 0) {
        }
        if ((i4 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
        }
        if ((i19 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:280:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012f  */
    /* renamed from: Text-IbK3jfQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3129TextIbK3jfQ(final AnnotatedString annotatedString, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Map<String, InlineTextContent> map, Function1<? super TextLayoutResult, Unit> function1, TextStyle textStyle, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        long jM7259getUnspecifiedXSAIIZE;
        int i10;
        FontStyle fontStyle2;
        int i11;
        FontWeight fontWeight2;
        int i12;
        FontFamily fontFamily2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z2;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Modifier.Companion companion;
        long jM4631getUnspecified0d7_KjU;
        TextAlign textAlign2;
        int iM6993getClipgIe3tQ8;
        int i28;
        int i29;
        Map<String, InlineTextContent> mapEmptyMap;
        TextKt$Text$4 textKt$Text$4;
        TextStyle textStyle2;
        TextDecoration textDecoration2;
        FontStyle fontStyle3;
        long j5;
        FontWeight fontWeight3;
        FontFamily fontFamily3;
        long j6;
        int i30;
        long j7;
        long j8;
        final Modifier modifier2;
        Composer composer2;
        final TextAlign textAlign3;
        final Map<String, InlineTextContent> map2;
        final int i31;
        final int i32;
        final Function1<? super TextLayoutResult, Unit> function12;
        final long j9;
        final TextStyle textStyle3;
        final FontWeight fontWeight4;
        final FontStyle fontStyle4;
        final FontFamily fontFamily4;
        final long j10;
        final long j11;
        final boolean z3;
        final int i33;
        final long j12;
        final TextDecoration textDecoration3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2027001676);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Text)P(15,10,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,6:c#ui.unit.TextUnit,17,16:c#ui.text.style.TextAlign,7:c#ui.unit.TextUnit,12:c#ui.text.style.TextOverflow,13,8,9)254@11726L7,258@11837L706:Text.kt#uh7d8r");
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i7 = (composerStartRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i34 = i6 & 2;
        if (i34 != 0) {
            i7 |= 48;
        } else {
            if ((i4 & 48) == 0) {
                i7 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                i7 |= composerStartRestartGroup.changed(j) ? 256 : 128;
            }
            i9 = i6 & 8;
            if (i9 == 0) {
                i7 |= 3072;
                jM7259getUnspecifiedXSAIIZE = j2;
            } else {
                jM7259getUnspecifiedXSAIIZE = j2;
                if ((i4 & 3072) == 0) {
                    i7 |= composerStartRestartGroup.changed(jM7259getUnspecifiedXSAIIZE) ? 2048 : 1024;
                }
            }
            i10 = i6 & 16;
            if (i10 == 0) {
                i7 |= 24576;
            } else {
                if ((i4 & 24576) == 0) {
                    fontStyle2 = fontStyle;
                    i7 |= composerStartRestartGroup.changed(fontStyle2) ? 16384 : 8192;
                }
                i11 = i6 & 32;
                if (i11 != 0) {
                    i7 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i4 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                        i7 |= composerStartRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                    }
                }
                i12 = i6 & 64;
                if (i12 != 0) {
                    i7 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i4 & 1572864) == 0) {
                        i7 |= composerStartRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
                    }
                }
                i13 = i6 & 128;
                if (i13 != 0) {
                    i7 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i7 |= composerStartRestartGroup.changed(j3) ? 8388608 : 4194304;
                }
                i14 = i6 & 256;
                if (i14 != 0) {
                    i7 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    i7 |= composerStartRestartGroup.changed(textDecoration) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i15 = i6 & 512;
                if (i15 != 0) {
                    i7 |= 805306368;
                } else {
                    if ((i4 & 805306368) == 0) {
                        i16 = i15;
                        i7 |= composerStartRestartGroup.changed(textAlign) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    }
                    i17 = i6 & 1024;
                    if (i17 == 0) {
                        i18 = i5 | 6;
                    } else if ((i5 & 6) == 0) {
                        i18 = i5 | (composerStartRestartGroup.changed(j4) ? 4 : 2);
                    } else {
                        i18 = i5;
                    }
                    i19 = i6 & 2048;
                    if (i19 == 0) {
                        i18 |= 48;
                        i20 = i19;
                    } else if ((i5 & 48) == 0) {
                        i20 = i19;
                        i18 |= composerStartRestartGroup.changed(i) ? 32 : 16;
                    } else {
                        i20 = i19;
                    }
                    int i35 = i18;
                    i21 = i6 & 4096;
                    if (i21 == 0) {
                        i35 |= 384;
                    } else {
                        if ((i5 & 384) == 0) {
                            z2 = z;
                            i35 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                        }
                        i22 = i6 & 8192;
                        if (i22 != 0) {
                            i23 = i35 | 3072;
                        } else {
                            int i36 = i35;
                            if ((i5 & 3072) == 0) {
                                i23 = i36 | (composerStartRestartGroup.changed(i2) ? 2048 : 1024);
                            } else {
                                i23 = i36;
                            }
                        }
                        i24 = i6 & 16384;
                        if (i24 == 0) {
                            i25 = i23;
                            if ((i5 & 24576) == 0) {
                                i25 |= composerStartRestartGroup.changed(i3) ? 16384 : 8192;
                            }
                            i26 = i6 & 32768;
                            if (i26 == 0) {
                                i25 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                            } else if ((i5 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                                i25 |= composerStartRestartGroup.changedInstance(map) ? 131072 : 65536;
                            }
                            i27 = i6 & 65536;
                            if (i27 == 0) {
                                i25 |= 1572864;
                            } else if ((i5 & 1572864) == 0) {
                                i25 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                            }
                            if ((i5 & 12582912) == 0) {
                                i25 |= ((i6 & 131072) == 0 && composerStartRestartGroup.changed(textStyle)) ? 8388608 : 4194304;
                            }
                            if ((i7 & 306783379) == 306783378 || (i25 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i4 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    companion = i34 == 0 ? Modifier.INSTANCE : modifier;
                                    jM4631getUnspecified0d7_KjU = i8 == 0 ? Color.INSTANCE.m4631getUnspecified0d7_KjU() : j;
                                    if (i9 != 0) {
                                        jM7259getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m7259getUnspecifiedXSAIIZE();
                                    }
                                    if (i10 != 0) {
                                        fontStyle2 = null;
                                    }
                                    if (i11 != 0) {
                                        fontWeight2 = null;
                                    }
                                    if (i12 != 0) {
                                        fontFamily2 = null;
                                    }
                                    long jM7259getUnspecifiedXSAIIZE2 = i13 == 0 ? TextUnit.INSTANCE.m7259getUnspecifiedXSAIIZE() : j3;
                                    TextDecoration textDecoration4 = i14 == 0 ? null : textDecoration;
                                    textAlign2 = i16 == 0 ? textAlign : null;
                                    long jM7259getUnspecifiedXSAIIZE3 = i17 == 0 ? TextUnit.INSTANCE.m7259getUnspecifiedXSAIIZE() : j4;
                                    iM6993getClipgIe3tQ8 = i20 == 0 ? TextOverflow.INSTANCE.m6993getClipgIe3tQ8() : i;
                                    if (i21 != 0) {
                                        z2 = true;
                                    }
                                    i28 = i22 == 0 ? Integer.MAX_VALUE : i2;
                                    i29 = i24 == 0 ? i3 : 1;
                                    mapEmptyMap = i26 == 0 ? MapsKt.emptyMap() : map;
                                    textKt$Text$4 = i27 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material3.TextKt$Text$4
                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(TextLayoutResult textLayoutResult) {
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                            invoke2(textLayoutResult);
                                            return Unit.INSTANCE;
                                        }
                                    } : function1;
                                    if ((i6 & 131072) == 0) {
                                        Modifier modifier3 = companion;
                                        ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object objConsume = composerStartRestartGroup.consume(providableCompositionLocal);
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        textAlign2 = textAlign2;
                                        textStyle2 = (TextStyle) objConsume;
                                        textDecoration2 = textDecoration4;
                                        fontStyle3 = fontStyle2;
                                        j5 = jM7259getUnspecifiedXSAIIZE;
                                        fontWeight3 = fontWeight2;
                                        fontFamily3 = fontFamily2;
                                        j6 = jM7259getUnspecifiedXSAIIZE2;
                                        i30 = i25 & (-29360129);
                                        j7 = jM7259getUnspecifiedXSAIIZE3;
                                        companion = modifier3;
                                    } else {
                                        textStyle2 = textStyle;
                                        textDecoration2 = textDecoration4;
                                        fontStyle3 = fontStyle2;
                                        j5 = jM7259getUnspecifiedXSAIIZE;
                                        fontWeight3 = fontWeight2;
                                        fontFamily3 = fontFamily2;
                                        j6 = jM7259getUnspecifiedXSAIIZE2;
                                        i30 = i25;
                                        j7 = jM7259getUnspecifiedXSAIIZE3;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i6 & 131072) != 0) {
                                        i25 &= -29360129;
                                    }
                                    companion = modifier;
                                    jM4631getUnspecified0d7_KjU = j;
                                    j6 = j3;
                                    textDecoration2 = textDecoration;
                                    textAlign2 = textAlign;
                                    j7 = j4;
                                    iM6993getClipgIe3tQ8 = i;
                                    i28 = i2;
                                    i29 = i3;
                                    mapEmptyMap = map;
                                    textKt$Text$4 = function1;
                                    textStyle2 = textStyle;
                                    fontStyle3 = fontStyle2;
                                    j5 = jM7259getUnspecifiedXSAIIZE;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily2;
                                    i30 = i25;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2027001676, i7, i30, "androidx.compose.material3.Text (Text.kt:255)");
                                }
                                composerStartRestartGroup.startReplaceGroup(-1827697581);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "");
                                if (jM4631getUnspecified0d7_KjU == 16) {
                                    j8 = jM4631getUnspecified0d7_KjU;
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(-1827696808);
                                    ComposerKt.sourceInformation(composerStartRestartGroup, "*256@11820L7");
                                    long jM6570getColor0d7_KjU = textStyle2.m6570getColor0d7_KjU();
                                    if (jM6570getColor0d7_KjU == 16) {
                                        ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                        Object objConsume2 = composerStartRestartGroup.consume(localContentColor);
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        jM6570getColor0d7_KjU = ((Color) objConsume2).m4605unboximpl();
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    j8 = jM6570getColor0d7_KjU;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                int i37 = (i7 & 126) | ((i30 >> 9) & 7168);
                                int i38 = i30 << 9;
                                Modifier modifier4 = companion;
                                BasicTextKt.m1729BasicTextRWo7tUw(annotatedString, modifier4, TextStyle.m6560mergedA7vx0o$default(textStyle2, j8, j5, fontWeight3, fontStyle3, null, fontFamily3, null, j6, null, null, null, 0L, textDecoration2, null, null, textAlign2 == null ? textAlign2.getValue() : TextAlign.INSTANCE.m6950getUnspecifiede0LSkKk(), 0, j7, null, null, 0, 0, null, null, 16609104, null), textKt$Text$4, iM6993getClipgIe3tQ8, z2, i28, i29, mapEmptyMap, null, composerStartRestartGroup, (i38 & 234881024) | i37 | (57344 & i38) | (458752 & i38) | (3670016 & i38) | (29360128 & i38), 512);
                                modifier2 = modifier4;
                                composer2 = composerStartRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                textAlign3 = textAlign2;
                                map2 = mapEmptyMap;
                                i31 = iM6993getClipgIe3tQ8;
                                i32 = i28;
                                function12 = textKt$Text$4;
                                j9 = jM4631getUnspecified0d7_KjU;
                                textStyle3 = textStyle2;
                                fontWeight4 = fontWeight3;
                                fontStyle4 = fontStyle3;
                                fontFamily4 = fontFamily3;
                                j10 = j6;
                                j11 = j7;
                                z3 = z2;
                                i33 = i29;
                                j12 = j5;
                                textDecoration3 = textDecoration2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                textDecoration3 = textDecoration;
                                i31 = i;
                                i32 = i2;
                                i33 = i3;
                                map2 = map;
                                function12 = function1;
                                textStyle3 = textStyle;
                                composer2 = composerStartRestartGroup;
                                z3 = z2;
                                fontStyle4 = fontStyle2;
                                j12 = jM7259getUnspecifiedXSAIIZE;
                                fontWeight4 = fontWeight2;
                                fontFamily4 = fontFamily2;
                                j9 = j;
                                j10 = j3;
                                textAlign3 = textAlign;
                                j11 = j4;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$5
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
                                        TextKt.m3129TextIbK3jfQ(annotatedString, modifier2, j9, j12, fontStyle4, fontWeight4, fontFamily4, j10, textDecoration3, textAlign3, j11, i31, z3, i32, i33, map2, function12, textStyle3, composer3, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i25 = i23 | 24576;
                        i26 = i6 & 32768;
                        if (i26 == 0) {
                        }
                        i27 = i6 & 65536;
                        if (i27 == 0) {
                        }
                        if ((i5 & 12582912) == 0) {
                        }
                        if ((i7 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i4 & 1) != 0) {
                                if (i34 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 != 0) {
                                }
                                if (i10 != 0) {
                                }
                                if (i11 != 0) {
                                }
                                if (i12 != 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i16 == 0) {
                                }
                                if (i17 == 0) {
                                }
                                if (i20 == 0) {
                                }
                                if (i21 != 0) {
                                }
                                if (i22 == 0) {
                                }
                                if (i24 == 0) {
                                }
                                if (i26 == 0) {
                                }
                                if (i27 == 0) {
                                }
                                if ((i6 & 131072) == 0) {
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composerStartRestartGroup.startReplaceGroup(-1827697581);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "");
                                if (jM4631getUnspecified0d7_KjU == 16) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                int i372 = (i7 & 126) | ((i30 >> 9) & 7168);
                                int i382 = i30 << 9;
                                Modifier modifier42 = companion;
                                BasicTextKt.m1729BasicTextRWo7tUw(annotatedString, modifier42, TextStyle.m6560mergedA7vx0o$default(textStyle2, j8, j5, fontWeight3, fontStyle3, null, fontFamily3, null, j6, null, null, null, 0L, textDecoration2, null, null, textAlign2 == null ? textAlign2.getValue() : TextAlign.INSTANCE.m6950getUnspecifiede0LSkKk(), 0, j7, null, null, 0, 0, null, null, 16609104, null), textKt$Text$4, iM6993getClipgIe3tQ8, z2, i28, i29, mapEmptyMap, null, composerStartRestartGroup, (i382 & 234881024) | i372 | (57344 & i382) | (458752 & i382) | (3670016 & i382) | (29360128 & i382), 512);
                                modifier2 = modifier42;
                                composer2 = composerStartRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                textAlign3 = textAlign2;
                                map2 = mapEmptyMap;
                                i31 = iM6993getClipgIe3tQ8;
                                i32 = i28;
                                function12 = textKt$Text$4;
                                j9 = jM4631getUnspecified0d7_KjU;
                                textStyle3 = textStyle2;
                                fontWeight4 = fontWeight3;
                                fontStyle4 = fontStyle3;
                                fontFamily4 = fontFamily3;
                                j10 = j6;
                                j11 = j7;
                                z3 = z2;
                                i33 = i29;
                                j12 = j5;
                                textDecoration3 = textDecoration2;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    z2 = z;
                    i22 = i6 & 8192;
                    if (i22 != 0) {
                    }
                    i24 = i6 & 16384;
                    if (i24 == 0) {
                    }
                    i26 = i6 & 32768;
                    if (i26 == 0) {
                    }
                    i27 = i6 & 65536;
                    if (i27 == 0) {
                    }
                    if ((i5 & 12582912) == 0) {
                    }
                    if ((i7 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i16 = i15;
                i17 = i6 & 1024;
                if (i17 == 0) {
                }
                i19 = i6 & 2048;
                if (i19 == 0) {
                }
                int i352 = i18;
                i21 = i6 & 4096;
                if (i21 == 0) {
                }
                z2 = z;
                i22 = i6 & 8192;
                if (i22 != 0) {
                }
                i24 = i6 & 16384;
                if (i24 == 0) {
                }
                i26 = i6 & 32768;
                if (i26 == 0) {
                }
                i27 = i6 & 65536;
                if (i27 == 0) {
                }
                if ((i5 & 12582912) == 0) {
                }
                if ((i7 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            fontStyle2 = fontStyle;
            i11 = i6 & 32;
            if (i11 != 0) {
            }
            i12 = i6 & 64;
            if (i12 != 0) {
            }
            i13 = i6 & 128;
            if (i13 != 0) {
            }
            i14 = i6 & 256;
            if (i14 != 0) {
            }
            i15 = i6 & 512;
            if (i15 != 0) {
            }
            i16 = i15;
            i17 = i6 & 1024;
            if (i17 == 0) {
            }
            i19 = i6 & 2048;
            if (i19 == 0) {
            }
            int i3522 = i18;
            i21 = i6 & 4096;
            if (i21 == 0) {
            }
            z2 = z;
            i22 = i6 & 8192;
            if (i22 != 0) {
            }
            i24 = i6 & 16384;
            if (i24 == 0) {
            }
            i26 = i6 & 32768;
            if (i26 == 0) {
            }
            i27 = i6 & 65536;
            if (i27 == 0) {
            }
            if ((i5 & 12582912) == 0) {
            }
            if ((i7 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        if (i9 == 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        fontStyle2 = fontStyle;
        i11 = i6 & 32;
        if (i11 != 0) {
        }
        i12 = i6 & 64;
        if (i12 != 0) {
        }
        i13 = i6 & 128;
        if (i13 != 0) {
        }
        i14 = i6 & 256;
        if (i14 != 0) {
        }
        i15 = i6 & 512;
        if (i15 != 0) {
        }
        i16 = i15;
        i17 = i6 & 1024;
        if (i17 == 0) {
        }
        i19 = i6 & 2048;
        if (i19 == 0) {
        }
        int i35222 = i18;
        i21 = i6 & 4096;
        if (i21 == 0) {
        }
        z2 = z;
        i22 = i6 & 8192;
        if (i22 != 0) {
        }
        i24 = i6 & 16384;
        if (i24 == 0) {
        }
        i26 = i6 & 32768;
        if (i26 == 0) {
        }
        i27 = i6 & 65536;
        if (i27 == 0) {
        }
        if ((i5 & 12582912) == 0) {
        }
        if ((i7 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011c  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m3127Text4IGK_g(final AnnotatedString annotatedString, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Map map, Function1 function1, TextStyle textStyle, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        long jM4631getUnspecified0d7_KjU;
        int i8;
        int i9;
        long jM7259getUnspecifiedXSAIIZE;
        int i10;
        FontStyle fontStyle2;
        int i11;
        FontWeight fontWeight2;
        int i12;
        FontFamily fontFamily2;
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
        boolean z2;
        int i25;
        int i26;
        int i27;
        int i28;
        Modifier modifier2;
        TextAlign textAlign2;
        TextStyle textStyle2;
        int i29;
        Function1 function12;
        long j5;
        Map map2;
        Modifier modifier3;
        TextAlign textAlign3;
        boolean z3;
        long j6;
        int i30;
        TextDecoration textDecoration2;
        long j7;
        FontWeight fontWeight3;
        FontFamily fontFamily3;
        long j8;
        Composer composer2;
        final Modifier modifier4;
        final long j9;
        final long j10;
        final FontStyle fontStyle3;
        final FontWeight fontWeight4;
        final FontFamily fontFamily4;
        final long j11;
        final TextDecoration textDecoration3;
        final TextAlign textAlign4;
        final long j12;
        final int i31;
        final boolean z4;
        final int i32;
        final Map map3;
        final Function1 function13;
        final TextStyle textStyle3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(224529679);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(Text)P(14,9,0:c#ui.graphics.Color,2:c#ui.unit.TextUnit,3:c#ui.text.font.FontStyle,4!1,6:c#ui.unit.TextUnit,16,15:c#ui.text.style.TextAlign,7:c#ui.unit.TextUnit,11:c#ui.text.style.TextOverflow,12,8)304@13393L7,306@13409L345:Text.kt#uh7d8r");
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (composerStartRestartGroup.changed(annotatedString) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i33 = i5 & 2;
        if (i33 != 0) {
            i6 |= 48;
        } else {
            if ((i3 & 48) == 0) {
                i6 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i7 = i5 & 4;
            if (i7 == 0) {
                i8 = i6 | 384;
                jM4631getUnspecified0d7_KjU = j;
            } else {
                int i34 = i6;
                jM4631getUnspecified0d7_KjU = j;
                if ((i3 & 384) == 0) {
                    i34 |= composerStartRestartGroup.changed(jM4631getUnspecified0d7_KjU) ? 256 : 128;
                }
                i8 = i34;
            }
            i9 = i5 & 8;
            if (i9 == 0) {
                i8 |= 3072;
                jM7259getUnspecifiedXSAIIZE = j2;
            } else {
                jM7259getUnspecifiedXSAIIZE = j2;
                if ((i3 & 3072) == 0) {
                    i8 |= composerStartRestartGroup.changed(jM7259getUnspecifiedXSAIIZE) ? 2048 : 1024;
                }
            }
            i10 = i5 & 16;
            if (i10 == 0) {
                i8 |= 24576;
            } else {
                if ((i3 & 24576) == 0) {
                    fontStyle2 = fontStyle;
                    i8 |= composerStartRestartGroup.changed(fontStyle2) ? 16384 : 8192;
                }
                i11 = i5 & 32;
                if (i11 != 0) {
                    i8 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i3 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                        i8 |= composerStartRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                    }
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                    i8 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i3 & 1572864) == 0) {
                        i8 |= composerStartRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
                    }
                }
                i13 = i5 & 128;
                if (i13 != 0) {
                    i8 |= 12582912;
                } else {
                    if ((i3 & 12582912) == 0) {
                        i14 = i8 | (composerStartRestartGroup.changed(j3) ? 8388608 : 4194304);
                    }
                    i15 = i5 & 256;
                    if (i15 == 0) {
                        i14 |= 100663296;
                    } else {
                        if ((i3 & 100663296) == 0) {
                            i16 = i15;
                            i14 |= composerStartRestartGroup.changed(textDecoration) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i17 = i5 & 512;
                        if (i17 != 0) {
                            i14 |= 805306368;
                            i18 = i17;
                        } else if ((i3 & 805306368) == 0) {
                            i18 = i17;
                            i14 |= composerStartRestartGroup.changed(textAlign) ? PKIFailureInfo.duplicateCertReq : 268435456;
                        } else {
                            i18 = i17;
                        }
                        i19 = i14;
                        i20 = i5 & 1024;
                        if (i20 != 0) {
                            i21 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            i21 = i4 | (composerStartRestartGroup.changed(j4) ? 4 : 2);
                        } else {
                            i21 = i4;
                        }
                        i22 = i5 & 2048;
                        if (i22 != 0) {
                            i21 |= 48;
                            i23 = i22;
                        } else if ((i4 & 48) == 0) {
                            i23 = i22;
                            i21 |= composerStartRestartGroup.changed(i) ? 32 : 16;
                        } else {
                            i23 = i22;
                        }
                        int i35 = i21;
                        i24 = i5 & 4096;
                        if (i24 != 0) {
                            i35 |= 384;
                        } else {
                            if ((i4 & 384) == 0) {
                                z2 = z;
                                i35 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                            }
                            i25 = i5 & 8192;
                            if (i25 == 0) {
                                i26 = i35 | 3072;
                            } else {
                                int i36 = i35;
                                if ((i4 & 3072) == 0) {
                                    i26 = i36 | (composerStartRestartGroup.changed(i2) ? 2048 : 1024);
                                } else {
                                    i26 = i36;
                                }
                            }
                            i27 = i5 & 16384;
                            if (i27 != 0) {
                                if ((i4 & 24576) == 0) {
                                    i26 |= composerStartRestartGroup.changedInstance(map) ? 16384 : 8192;
                                }
                                i28 = i5 & 32768;
                                if (i28 != 0) {
                                    i26 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                                } else if ((i4 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                                    i26 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
                                }
                                if ((i4 & 1572864) == 0) {
                                    i26 |= ((i5 & 65536) == 0 && composerStartRestartGroup.changed(textStyle)) ? 1048576 : 524288;
                                }
                                if ((i19 & 306783379) != 306783378 || (599187 & i26) != 599186 || !composerStartRestartGroup.getSkipping()) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i3 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        Modifier.Companion companion = i33 == 0 ? Modifier.INSTANCE : modifier;
                                        if (i7 != 0) {
                                            jM4631getUnspecified0d7_KjU = Color.INSTANCE.m4631getUnspecified0d7_KjU();
                                        }
                                        if (i9 != 0) {
                                            jM7259getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m7259getUnspecifiedXSAIIZE();
                                        }
                                        if (i10 != 0) {
                                            fontStyle2 = null;
                                        }
                                        if (i11 != 0) {
                                            fontWeight2 = null;
                                        }
                                        if (i12 != 0) {
                                            fontFamily2 = null;
                                        }
                                        long jM7259getUnspecifiedXSAIIZE2 = i13 == 0 ? TextUnit.INSTANCE.m7259getUnspecifiedXSAIIZE() : j3;
                                        TextDecoration textDecoration4 = i16 == 0 ? null : textDecoration;
                                        TextAlign textAlign5 = i18 == 0 ? textAlign : null;
                                        long jM7259getUnspecifiedXSAIIZE3 = i20 == 0 ? TextUnit.INSTANCE.m7259getUnspecifiedXSAIIZE() : j4;
                                        int iM6993getClipgIe3tQ8 = i23 == 0 ? TextOverflow.INSTANCE.m6993getClipgIe3tQ8() : i;
                                        if (i24 != 0) {
                                            z2 = true;
                                        }
                                        int i37 = i25 == 0 ? Integer.MAX_VALUE : i2;
                                        Map mapEmptyMap = i27 == 0 ? MapsKt.emptyMap() : map;
                                        TextKt$Text$6 textKt$Text$6 = i28 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.material3.TextKt$Text$6
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(TextLayoutResult textLayoutResult) {
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                                invoke2(textLayoutResult);
                                                return Unit.INSTANCE;
                                            }
                                        } : function1;
                                        if ((i5 & 65536) == 0) {
                                            modifier2 = companion;
                                            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
                                            textAlign2 = textAlign5;
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                            Object objConsume = composerStartRestartGroup.consume(providableCompositionLocal);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            i26 &= -3670017;
                                            textStyle2 = (TextStyle) objConsume;
                                        } else {
                                            modifier2 = companion;
                                            textAlign2 = textAlign5;
                                            textStyle2 = textStyle;
                                        }
                                        i29 = iM6993getClipgIe3tQ8;
                                        function12 = textKt$Text$6;
                                        j5 = jM7259getUnspecifiedXSAIIZE3;
                                        map2 = mapEmptyMap;
                                        modifier3 = modifier2;
                                        int i38 = i37;
                                        textAlign3 = textAlign2;
                                        long j13 = jM7259getUnspecifiedXSAIIZE2;
                                        z3 = z2;
                                        j6 = jM4631getUnspecified0d7_KjU;
                                        i30 = i38;
                                        FontFamily fontFamily5 = fontFamily2;
                                        textDecoration2 = textDecoration4;
                                        j7 = jM7259getUnspecifiedXSAIIZE;
                                        fontWeight3 = fontWeight2;
                                        fontFamily3 = fontFamily5;
                                        j8 = j13;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i5 & 65536) != 0) {
                                            i26 &= -3670017;
                                        }
                                        modifier3 = modifier;
                                        textAlign3 = textAlign;
                                        j5 = j4;
                                        i29 = i;
                                        i30 = i2;
                                        map2 = map;
                                        function12 = function1;
                                        textStyle2 = textStyle;
                                        z3 = z2;
                                        j6 = jM4631getUnspecified0d7_KjU;
                                        j7 = jM7259getUnspecifiedXSAIIZE;
                                        fontWeight3 = fontWeight2;
                                        fontFamily3 = fontFamily2;
                                        j8 = j3;
                                        textDecoration2 = textDecoration;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(224529679, i19, i26, "androidx.compose.material3.Text (Text.kt:305)");
                                    }
                                    int i39 = i26 << 3;
                                    composer2 = composerStartRestartGroup;
                                    m3129TextIbK3jfQ(annotatedString, modifier3, j6, j7, fontStyle2, fontWeight3, fontFamily3, j8, textDecoration2, textAlign3, j5, i29, z3, i30, 1, map2, function12, textStyle2, composer2, i19 & 2147483646, (i26 & 14) | 24576 | (i26 & LDSFile.EF_DG16_TAG) | (i26 & 896) | (i26 & 7168) | (458752 & i39) | (3670016 & i39) | (i39 & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier4 = modifier3;
                                    j9 = j6;
                                    j10 = j7;
                                    fontStyle3 = fontStyle2;
                                    fontWeight4 = fontWeight3;
                                    fontFamily4 = fontFamily3;
                                    j11 = j8;
                                    textDecoration3 = textDecoration2;
                                    textAlign4 = textAlign3;
                                    j12 = j5;
                                    i31 = i29;
                                    z4 = z3;
                                    i32 = i30;
                                    map3 = map2;
                                    function13 = function12;
                                    textStyle3 = textStyle2;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier4 = modifier;
                                    textAlign4 = textAlign;
                                    i31 = i;
                                    i32 = i2;
                                    map3 = map;
                                    function13 = function1;
                                    textStyle3 = textStyle;
                                    composer2 = composerStartRestartGroup;
                                    z4 = z2;
                                    j9 = jM4631getUnspecified0d7_KjU;
                                    fontStyle3 = fontStyle2;
                                    j10 = jM7259getUnspecifiedXSAIIZE;
                                    fontWeight4 = fontWeight2;
                                    fontFamily4 = fontFamily2;
                                    j11 = j3;
                                    textDecoration3 = textDecoration;
                                    j12 = j4;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt$Text$7
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
                                            TextKt.m3127Text4IGK_g(annotatedString, modifier4, j9, j10, fontStyle3, fontWeight4, fontFamily4, j11, textDecoration3, textAlign4, j12, i31, z4, i32, map3, function13, textStyle3, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i26 |= 24576;
                            i28 = i5 & 32768;
                            if (i28 != 0) {
                            }
                            if ((i4 & 1572864) == 0) {
                            }
                            if ((i19 & 306783379) != 306783378) {
                                composerStartRestartGroup.startDefaults();
                                if ((i3 & 1) != 0) {
                                    if (i33 == 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i10 != 0) {
                                    }
                                    if (i11 != 0) {
                                    }
                                    if (i12 != 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if (i16 == 0) {
                                    }
                                    if (i18 == 0) {
                                    }
                                    if (i20 == 0) {
                                    }
                                    if (i23 == 0) {
                                    }
                                    if (i24 != 0) {
                                    }
                                    if (i25 == 0) {
                                    }
                                    if (i27 == 0) {
                                    }
                                    if (i28 == 0) {
                                    }
                                    if ((i5 & 65536) == 0) {
                                    }
                                    i29 = iM6993getClipgIe3tQ8;
                                    function12 = textKt$Text$6;
                                    j5 = jM7259getUnspecifiedXSAIIZE3;
                                    map2 = mapEmptyMap;
                                    modifier3 = modifier2;
                                    int i382 = i37;
                                    textAlign3 = textAlign2;
                                    long j132 = jM7259getUnspecifiedXSAIIZE2;
                                    z3 = z2;
                                    j6 = jM4631getUnspecified0d7_KjU;
                                    i30 = i382;
                                    FontFamily fontFamily52 = fontFamily2;
                                    textDecoration2 = textDecoration4;
                                    j7 = jM7259getUnspecifiedXSAIIZE;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily52;
                                    j8 = j132;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    int i392 = i26 << 3;
                                    composer2 = composerStartRestartGroup;
                                    m3129TextIbK3jfQ(annotatedString, modifier3, j6, j7, fontStyle2, fontWeight3, fontFamily3, j8, textDecoration2, textAlign3, j5, i29, z3, i30, 1, map2, function12, textStyle2, composer2, i19 & 2147483646, (i26 & 14) | 24576 | (i26 & LDSFile.EF_DG16_TAG) | (i26 & 896) | (i26 & 7168) | (458752 & i392) | (3670016 & i392) | (i392 & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier4 = modifier3;
                                    j9 = j6;
                                    j10 = j7;
                                    fontStyle3 = fontStyle2;
                                    fontWeight4 = fontWeight3;
                                    fontFamily4 = fontFamily3;
                                    j11 = j8;
                                    textDecoration3 = textDecoration2;
                                    textAlign4 = textAlign3;
                                    j12 = j5;
                                    i31 = i29;
                                    z4 = z3;
                                    i32 = i30;
                                    map3 = map2;
                                    function13 = function12;
                                    textStyle3 = textStyle2;
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        z2 = z;
                        i25 = i5 & 8192;
                        if (i25 == 0) {
                        }
                        i27 = i5 & 16384;
                        if (i27 != 0) {
                        }
                        i28 = i5 & 32768;
                        if (i28 != 0) {
                        }
                        if ((i4 & 1572864) == 0) {
                        }
                        if ((i19 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i16 = i15;
                    i17 = i5 & 512;
                    if (i17 != 0) {
                    }
                    i19 = i14;
                    i20 = i5 & 1024;
                    if (i20 != 0) {
                    }
                    i22 = i5 & 2048;
                    if (i22 != 0) {
                    }
                    int i352 = i21;
                    i24 = i5 & 4096;
                    if (i24 != 0) {
                    }
                    z2 = z;
                    i25 = i5 & 8192;
                    if (i25 == 0) {
                    }
                    i27 = i5 & 16384;
                    if (i27 != 0) {
                    }
                    i28 = i5 & 32768;
                    if (i28 != 0) {
                    }
                    if ((i4 & 1572864) == 0) {
                    }
                    if ((i19 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i14 = i8;
                i15 = i5 & 256;
                if (i15 == 0) {
                }
                i16 = i15;
                i17 = i5 & 512;
                if (i17 != 0) {
                }
                i19 = i14;
                i20 = i5 & 1024;
                if (i20 != 0) {
                }
                i22 = i5 & 2048;
                if (i22 != 0) {
                }
                int i3522 = i21;
                i24 = i5 & 4096;
                if (i24 != 0) {
                }
                z2 = z;
                i25 = i5 & 8192;
                if (i25 == 0) {
                }
                i27 = i5 & 16384;
                if (i27 != 0) {
                }
                i28 = i5 & 32768;
                if (i28 != 0) {
                }
                if ((i4 & 1572864) == 0) {
                }
                if ((i19 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            fontStyle2 = fontStyle;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & 128;
            if (i13 != 0) {
            }
            i14 = i8;
            i15 = i5 & 256;
            if (i15 == 0) {
            }
            i16 = i15;
            i17 = i5 & 512;
            if (i17 != 0) {
            }
            i19 = i14;
            i20 = i5 & 1024;
            if (i20 != 0) {
            }
            i22 = i5 & 2048;
            if (i22 != 0) {
            }
            int i35222 = i21;
            i24 = i5 & 4096;
            if (i24 != 0) {
            }
            z2 = z;
            i25 = i5 & 8192;
            if (i25 == 0) {
            }
            i27 = i5 & 16384;
            if (i27 != 0) {
            }
            i28 = i5 & 32768;
            if (i28 != 0) {
            }
            if ((i4 & 1572864) == 0) {
            }
            if ((i19 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i9 = i5 & 8;
        if (i9 == 0) {
        }
        i10 = i5 & 16;
        if (i10 == 0) {
        }
        fontStyle2 = fontStyle;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & 128;
        if (i13 != 0) {
        }
        i14 = i8;
        i15 = i5 & 256;
        if (i15 == 0) {
        }
        i16 = i15;
        i17 = i5 & 512;
        if (i17 != 0) {
        }
        i19 = i14;
        i20 = i5 & 1024;
        if (i20 != 0) {
        }
        i22 = i5 & 2048;
        if (i22 != 0) {
        }
        int i352222 = i21;
        i24 = i5 & 4096;
        if (i24 != 0) {
        }
        z2 = z;
        i25 = i5 & 8192;
        if (i25 == 0) {
        }
        i27 = i5 & 16384;
        if (i27 != 0) {
        }
        i28 = i5 & 32768;
        if (i28 != 0) {
        }
        if ((i4 & 1572864) == 0) {
        }
        if ((i19 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    public static final void ProvideTextStyle(final TextStyle textStyle, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-460300127);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ProvideTextStyle)P(1)347@14710L7,348@14735L80:Text.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(textStyle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-460300127, i2, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:346)");
            }
            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(providableCompositionLocal);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal.provides(((TextStyle) objConsume).merge(textStyle)), function2, composerStartRestartGroup, (i2 & LDSFile.EF_DG16_TAG) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextKt.ProvideTextStyle.1
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
                    TextKt.ProvideTextStyle(textStyle, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
