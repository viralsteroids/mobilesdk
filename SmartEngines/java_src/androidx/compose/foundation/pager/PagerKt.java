package androidx.compose.foundation.pager;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p000ui.semantics.SemanticsModifierKt;
import androidx.compose.p000ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p000ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jmrtd.lds.LDSFile;

/* compiled from: Pager.kt */
@Metadata(m513d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001aâ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e21\u0010\u001f\u001a-\u0012\u0004\u0012\u00020!\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00010 ¢\u0006\u0002\b#¢\u0006\u0002\b$H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001aâ\u0001\u0010'\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e21\u0010\u001f\u001a-\u0012\u0004\u0012\u00020!\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00010 ¢\u0006\u0002\b#¢\u0006\u0002\b$H\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001a\u0017\u0010,\u001a\u00020\u00012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0082\b\u001aL\u00100\u001a\u00020\u000b*\u00020\u001e2\u0006\u00101\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u000bH\u0000\u001a,\u00109\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u00132\u0006\u0010;\u001a\u00020<2\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, m514d2 = {"HorizontalPager", "", "state", "Landroidx/compose/foundation/pager/PagerState;", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "beyondViewportPageCount", "", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "flingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "userScrollEnabled", "", "reverseLayout", "key", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "index", "", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "pageContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "page", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "HorizontalPager-oI3XNZo", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "VerticalPager", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "VerticalPager-oI3XNZo", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "debugLog", "generateMsg", "Lkotlin/Function0;", "", "currentPageOffset", "layoutSize", "spaceBetweenPages", "beforeContentPadding", "afterContentPadding", "currentPage", "currentPageOffsetFraction", "", "pageCount", "pagerSemantics", "isVertical", "scope", "Lkotlinx/coroutines/CoroutineScope;", "foundation_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class PagerKt {
    private static final void debugLog(Function0<String> function0) {
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0109  */
    /* renamed from: HorizontalPager-oI3XNZo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1672HorizontalPageroI3XNZo(final PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i, float f, Alignment.Vertical vertical, TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, Function1<? super Integer, ? extends Object> function1, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, final Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        PageSize pageSize2;
        int i8;
        final int i9;
        int i10;
        float f2;
        int i11;
        Alignment.Vertical centerVertically;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z3;
        int i21;
        PagerState pagerState2;
        int i22;
        NestedScrollConnection nestedScrollConnectionPageNestedScrollConnection;
        final Function1<? super Integer, ? extends Object> function12;
        NestedScrollConnection nestedScrollConnection2;
        PaddingValues paddingValues2;
        Alignment.Vertical vertical2;
        TargetedFlingBehavior targetedFlingBehavior3;
        PageSize pageSize3;
        int i23;
        int i24;
        float f3;
        boolean z4;
        int i25;
        SnapPosition snapPosition2;
        Composer composer2;
        boolean z5;
        Modifier modifier3;
        Modifier modifier4;
        final PageSize pageSize4;
        final NestedScrollConnection nestedScrollConnection3;
        final boolean z6;
        final boolean z7;
        final float f4;
        final PaddingValues paddingValues3;
        final TargetedFlingBehavior targetedFlingBehavior4;
        final Alignment.Vertical vertical3;
        final SnapPosition snapPosition3;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1870896258);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(HorizontalPager)P(11,4,1,7!1,8:c#ui.unit.Dp,13!1,12,9!1,6,10)114@6534L28,118@6750L79,125@6952L661:Pager.kt#g6yjnt");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(pagerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i26 = i4 & 2;
        if (i26 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    i5 |= composerStartRestartGroup.changed(paddingValues) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        pageSize2 = pageSize;
                        i5 |= composerStartRestartGroup.changed(pageSize2) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            i9 = i;
                            i5 |= composerStartRestartGroup.changed(i9) ? 16384 : 8192;
                        }
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                            f2 = f;
                        } else {
                            f2 = f;
                            if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                                i5 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                            centerVertically = vertical;
                        } else {
                            centerVertically = vertical;
                            if ((i2 & 1572864) == 0) {
                                i5 |= composerStartRestartGroup.changed(centerVertically) ? 1048576 : 524288;
                            }
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i4 & 128) == 0) {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                                int i27 = composerStartRestartGroup.changed(targetedFlingBehavior2) ? 8388608 : 4194304;
                                i5 |= i27;
                            } else {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                            }
                            i5 |= i27;
                        } else {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                        }
                        i12 = i4 & 256;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i5 |= composerStartRestartGroup.changed(z) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i15 = i5 | 805306368;
                            i14 = i13;
                        } else {
                            if ((i2 & 805306368) == 0) {
                                i14 = i13;
                                i5 |= composerStartRestartGroup.changed(z2) ? PKIFailureInfo.duplicateCertReq : 268435456;
                            } else {
                                i14 = i13;
                            }
                            i15 = i5;
                        }
                        i16 = i4 & 1024;
                        if (i16 != 0) {
                            i17 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i17 = i3 | (composerStartRestartGroup.changedInstance(function1) ? 4 : 2);
                        } else {
                            i17 = i3;
                        }
                        if ((i3 & 48) == 0) {
                            i18 = i16;
                            i17 |= ((i4 & 2048) == 0 && composerStartRestartGroup.changedInstance(nestedScrollConnection)) ? 32 : 16;
                        } else {
                            i18 = i16;
                        }
                        int i28 = i17;
                        i19 = i4 & 4096;
                        if (i19 != 0) {
                            i20 = i28 | 384;
                        } else {
                            int i29 = i28;
                            if ((i3 & 384) == 0) {
                                i29 |= composerStartRestartGroup.changed(snapPosition) ? 256 : 128;
                            }
                            i20 = i29;
                        }
                        if ((i4 & 8192) == 0) {
                            if ((i3 & 3072) == 0) {
                                i20 |= composerStartRestartGroup.changedInstance(function4) ? 2048 : 1024;
                            }
                            if ((i15 & 306783379) == 306783378 || (i20 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier6 = i26 == 0 ? Modifier.INSTANCE : modifier2;
                                    PaddingValues paddingValuesM1428PaddingValues0680j_4 = i6 == 0 ? PaddingKt.m1428PaddingValues0680j_4(C1959Dp.m7055constructorimpl(0)) : paddingValues;
                                    PageSize pageSize5 = i7 == 0 ? PageSize.Fill.INSTANCE : pageSize2;
                                    int i30 = i8 == 0 ? 0 : i9;
                                    float fM7055constructorimpl = i10 == 0 ? C1959Dp.m7055constructorimpl(0) : f2;
                                    if (i11 != 0) {
                                        centerVertically = Alignment.INSTANCE.getCenterVertically();
                                    }
                                    if ((i4 & 128) == 0) {
                                        z3 = false;
                                        i21 = i19;
                                        pagerState2 = pagerState;
                                        i22 = i20;
                                        TargetedFlingBehavior targetedFlingBehaviorFlingBehavior = PagerDefaults.INSTANCE.flingBehavior(pagerState2, null, null, null, 0.0f, composerStartRestartGroup, (i15 & 14) | ProfileVerifier.CompilationStatus.f285xf2722a21, 30);
                                        i15 &= -29360129;
                                        targetedFlingBehavior2 = targetedFlingBehaviorFlingBehavior;
                                    } else {
                                        z3 = false;
                                        i21 = i19;
                                        pagerState2 = pagerState;
                                        i22 = i20;
                                    }
                                    boolean z8 = i12 == 0 ? true : z;
                                    if (i14 == 0) {
                                        z3 = z2;
                                    }
                                    Function1<? super Integer, ? extends Object> function13 = i18 == 0 ? null : function1;
                                    if ((i4 & 2048) == 0) {
                                        nestedScrollConnectionPageNestedScrollConnection = PagerDefaults.INSTANCE.pageNestedScrollConnection(pagerState2, Orientation.Horizontal, composerStartRestartGroup, (i15 & 14) | 432);
                                        i22 &= -113;
                                    } else {
                                        nestedScrollConnectionPageNestedScrollConnection = nestedScrollConnection;
                                    }
                                    if (i21 == 0) {
                                        function12 = function13;
                                        nestedScrollConnection2 = nestedScrollConnectionPageNestedScrollConnection;
                                        paddingValues2 = paddingValuesM1428PaddingValues0680j_4;
                                        vertical2 = centerVertically;
                                        targetedFlingBehavior3 = targetedFlingBehavior2;
                                        pageSize3 = pageSize5;
                                        i24 = i30;
                                        f3 = fM7055constructorimpl;
                                        z4 = z3;
                                        i25 = i15;
                                        snapPosition2 = SnapPosition.Start.INSTANCE;
                                        composer2 = composerStartRestartGroup;
                                        i23 = i22;
                                    } else {
                                        function12 = function13;
                                        nestedScrollConnection2 = nestedScrollConnectionPageNestedScrollConnection;
                                        paddingValues2 = paddingValuesM1428PaddingValues0680j_4;
                                        vertical2 = centerVertically;
                                        targetedFlingBehavior3 = targetedFlingBehavior2;
                                        pageSize3 = pageSize5;
                                        i23 = i22;
                                        i24 = i30;
                                        f3 = fM7055constructorimpl;
                                        z4 = z3;
                                        i25 = i15;
                                        snapPosition2 = snapPosition;
                                        composer2 = composerStartRestartGroup;
                                    }
                                    z5 = z8;
                                    modifier3 = modifier6;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i4 & 128) != 0) {
                                        i15 &= -29360129;
                                    }
                                    if ((i4 & 2048) != 0) {
                                        i20 &= -113;
                                    }
                                    pagerState2 = pagerState;
                                    paddingValues2 = paddingValues;
                                    function12 = function1;
                                    nestedScrollConnection2 = nestedScrollConnection;
                                    i23 = i20;
                                    pageSize3 = pageSize2;
                                    composer2 = composerStartRestartGroup;
                                    modifier3 = modifier2;
                                    vertical2 = centerVertically;
                                    i25 = i15;
                                    z5 = z;
                                    z4 = z2;
                                    snapPosition2 = snapPosition;
                                    f3 = f2;
                                    i24 = i9;
                                    targetedFlingBehavior3 = targetedFlingBehavior2;
                                }
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    modifier4 = modifier3;
                                } else {
                                    modifier4 = modifier3;
                                    ComposerKt.traceEventStart(1870896258, i25, i23, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:124)");
                                }
                                int i31 = i23;
                                Orientation orientation = Orientation.Horizontal;
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                int i32 = i25 >> 6;
                                int i33 = ((i25 >> 3) & 14) | 24576 | ((i25 << 3) & LDSFile.EF_DG16_TAG) | (i25 & 896) | ((i25 >> 18) & 7168) | (i32 & 458752) | (i32 & 3670016);
                                int i34 = i25 << 9;
                                int i35 = i33 | (i34 & 29360128) | (i34 & 234881024) | ((i25 << 18) & 1879048192);
                                int i36 = ((i31 >> 3) & 14) | 384 | ((i31 << 3) & LDSFile.EF_DG16_TAG) | ((i25 >> 9) & 7168);
                                int i37 = i31 << 6;
                                int i38 = i36 | (i37 & 57344) | (i37 & 458752);
                                Modifier modifier7 = modifier4;
                                LazyLayoutPagerKt.m1668PageruYRUAWA(modifier7, pagerState2, paddingValues2, z4, orientation, targetedFlingBehavior3, z5, i24, f3, pageSize3, nestedScrollConnection2, function12, centerHorizontally, vertical2, snapPosition2, function4, composer2, i35, i38, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                pageSize4 = pageSize3;
                                nestedScrollConnection3 = nestedScrollConnection2;
                                z6 = z4;
                                z7 = z5;
                                f4 = f3;
                                paddingValues3 = paddingValues2;
                                targetedFlingBehavior4 = targetedFlingBehavior3;
                                i9 = i24;
                                vertical3 = vertical2;
                                snapPosition3 = snapPosition2;
                                modifier5 = modifier7;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                z7 = z;
                                z6 = z2;
                                function12 = function1;
                                nestedScrollConnection3 = nestedScrollConnection;
                                snapPosition3 = snapPosition;
                                pageSize4 = pageSize2;
                                composer2 = composerStartRestartGroup;
                                f4 = f2;
                                modifier5 = modifier2;
                                vertical3 = centerVertically;
                                targetedFlingBehavior4 = targetedFlingBehavior2;
                                paddingValues3 = paddingValues;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$1
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
                                        PagerKt.m1672HorizontalPageroI3XNZo(pagerState, modifier5, paddingValues3, pageSize4, i9, f4, vertical3, targetedFlingBehavior4, z7, z6, function12, nestedScrollConnection3, snapPosition3, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i20 |= 3072;
                        if ((i15 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0) {
                                if (i26 == 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i11 != 0) {
                                }
                                if ((i4 & 128) == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i18 == 0) {
                                }
                                if ((i4 & 2048) == 0) {
                                }
                                if (i21 == 0) {
                                }
                                z5 = z8;
                                modifier3 = modifier6;
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i312 = i23;
                                Orientation orientation2 = Orientation.Horizontal;
                                Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                                int i322 = i25 >> 6;
                                int i332 = ((i25 >> 3) & 14) | 24576 | ((i25 << 3) & LDSFile.EF_DG16_TAG) | (i25 & 896) | ((i25 >> 18) & 7168) | (i322 & 458752) | (i322 & 3670016);
                                int i342 = i25 << 9;
                                int i352 = i332 | (i342 & 29360128) | (i342 & 234881024) | ((i25 << 18) & 1879048192);
                                int i362 = ((i312 >> 3) & 14) | 384 | ((i312 << 3) & LDSFile.EF_DG16_TAG) | ((i25 >> 9) & 7168);
                                int i372 = i312 << 6;
                                int i382 = i362 | (i372 & 57344) | (i372 & 458752);
                                Modifier modifier72 = modifier4;
                                LazyLayoutPagerKt.m1668PageruYRUAWA(modifier72, pagerState2, paddingValues2, z4, orientation2, targetedFlingBehavior3, z5, i24, f3, pageSize3, nestedScrollConnection2, function12, centerHorizontally2, vertical2, snapPosition2, function4, composer2, i352, i382, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                pageSize4 = pageSize3;
                                nestedScrollConnection3 = nestedScrollConnection2;
                                z6 = z4;
                                z7 = z5;
                                f4 = f3;
                                paddingValues3 = paddingValues2;
                                targetedFlingBehavior4 = targetedFlingBehavior3;
                                i9 = i24;
                                vertical3 = vertical2;
                                snapPosition3 = snapPosition2;
                                modifier5 = modifier72;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i12 = i4 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i16 = i4 & 1024;
                    if (i16 != 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    int i282 = i17;
                    i19 = i4 & 4096;
                    if (i19 != 0) {
                    }
                    if ((i4 & 8192) == 0) {
                    }
                    if ((i15 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                pageSize2 = pageSize;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i16 = i4 & 1024;
                if (i16 != 0) {
                }
                if ((i3 & 48) == 0) {
                }
                int i2822 = i17;
                i19 = i4 & 4096;
                if (i19 != 0) {
                }
                if ((i4 & 8192) == 0) {
                }
                if ((i15 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            pageSize2 = pageSize;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i16 = i4 & 1024;
            if (i16 != 0) {
            }
            if ((i3 & 48) == 0) {
            }
            int i28222 = i17;
            i19 = i4 & 4096;
            if (i19 != 0) {
            }
            if ((i4 & 8192) == 0) {
            }
            if ((i15 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        pageSize2 = pageSize;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i16 = i4 & 1024;
        if (i16 != 0) {
        }
        if ((i3 & 48) == 0) {
        }
        int i282222 = i17;
        i19 = i4 & 4096;
        if (i19 != 0) {
        }
        if ((i4 & 8192) == 0) {
        }
        if ((i15 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0109  */
    /* renamed from: VerticalPager-oI3XNZo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1673VerticalPageroI3XNZo(final PagerState pagerState, Modifier modifier, PaddingValues paddingValues, PageSize pageSize, int i, float f, Alignment.Horizontal horizontal, TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, Function1<? super Integer, ? extends Object> function1, NestedScrollConnection nestedScrollConnection, SnapPosition snapPosition, final Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int i7;
        PageSize pageSize2;
        int i8;
        final int i9;
        int i10;
        float f2;
        int i11;
        Alignment.Horizontal centerHorizontally;
        TargetedFlingBehavior targetedFlingBehavior2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z3;
        int i21;
        PagerState pagerState2;
        int i22;
        NestedScrollConnection nestedScrollConnectionPageNestedScrollConnection;
        final Function1<? super Integer, ? extends Object> function12;
        NestedScrollConnection nestedScrollConnection2;
        PaddingValues paddingValues2;
        Alignment.Horizontal horizontal2;
        TargetedFlingBehavior targetedFlingBehavior3;
        PageSize pageSize3;
        int i23;
        int i24;
        float f3;
        boolean z4;
        int i25;
        SnapPosition snapPosition2;
        Composer composer2;
        boolean z5;
        Modifier modifier3;
        Modifier modifier4;
        final PageSize pageSize4;
        final SnapPosition snapPosition3;
        final boolean z6;
        final float f4;
        final TargetedFlingBehavior targetedFlingBehavior4;
        final Alignment.Horizontal horizontal3;
        final NestedScrollConnection nestedScrollConnection3;
        final boolean z7;
        final PaddingValues paddingValues3;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(909160706);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(VerticalPager)P(12,5,1,8!1,9:c#ui.unit.Dp,3!1,13,10!1,7,11)201@11541L28,205@11757L77,212@11957L659:Pager.kt#g6yjnt");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(pagerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i26 = i4 & 2;
        if (i26 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    i5 |= composerStartRestartGroup.changed(paddingValues) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        pageSize2 = pageSize;
                        i5 |= composerStartRestartGroup.changed(pageSize2) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else {
                        if ((i2 & 24576) == 0) {
                            i9 = i;
                            i5 |= composerStartRestartGroup.changed(i9) ? 16384 : 8192;
                        }
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                            f2 = f;
                        } else {
                            f2 = f;
                            if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                                i5 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                            centerHorizontally = horizontal;
                        } else {
                            centerHorizontally = horizontal;
                            if ((i2 & 1572864) == 0) {
                                i5 |= composerStartRestartGroup.changed(centerHorizontally) ? 1048576 : 524288;
                            }
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i4 & 128) == 0) {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                                int i27 = composerStartRestartGroup.changed(targetedFlingBehavior2) ? 8388608 : 4194304;
                                i5 |= i27;
                            } else {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                            }
                            i5 |= i27;
                        } else {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                        }
                        i12 = i4 & 256;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i5 |= composerStartRestartGroup.changed(z) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        }
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i15 = i5 | 805306368;
                            i14 = i13;
                        } else {
                            if ((i2 & 805306368) == 0) {
                                i14 = i13;
                                i5 |= composerStartRestartGroup.changed(z2) ? PKIFailureInfo.duplicateCertReq : 268435456;
                            } else {
                                i14 = i13;
                            }
                            i15 = i5;
                        }
                        i16 = i4 & 1024;
                        if (i16 != 0) {
                            i17 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i17 = i3 | (composerStartRestartGroup.changedInstance(function1) ? 4 : 2);
                        } else {
                            i17 = i3;
                        }
                        if ((i3 & 48) == 0) {
                            i18 = i16;
                            i17 |= ((i4 & 2048) == 0 && composerStartRestartGroup.changedInstance(nestedScrollConnection)) ? 32 : 16;
                        } else {
                            i18 = i16;
                        }
                        int i28 = i17;
                        i19 = i4 & 4096;
                        if (i19 != 0) {
                            i20 = i28 | 384;
                        } else {
                            int i29 = i28;
                            if ((i3 & 384) == 0) {
                                i29 |= composerStartRestartGroup.changed(snapPosition) ? 256 : 128;
                            }
                            i20 = i29;
                        }
                        if ((i4 & 8192) == 0) {
                            if ((i3 & 3072) == 0) {
                                i20 |= composerStartRestartGroup.changedInstance(function4) ? 2048 : 1024;
                            }
                            if ((i15 & 306783379) == 306783378 || (i20 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier6 = i26 == 0 ? Modifier.INSTANCE : modifier2;
                                    PaddingValues paddingValuesM1428PaddingValues0680j_4 = i6 == 0 ? PaddingKt.m1428PaddingValues0680j_4(C1959Dp.m7055constructorimpl(0)) : paddingValues;
                                    PageSize pageSize5 = i7 == 0 ? PageSize.Fill.INSTANCE : pageSize2;
                                    int i30 = i8 == 0 ? 0 : i9;
                                    float fM7055constructorimpl = i10 == 0 ? C1959Dp.m7055constructorimpl(0) : f2;
                                    if (i11 != 0) {
                                        centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                    }
                                    if ((i4 & 128) == 0) {
                                        z3 = false;
                                        i21 = i19;
                                        pagerState2 = pagerState;
                                        i22 = i20;
                                        TargetedFlingBehavior targetedFlingBehaviorFlingBehavior = PagerDefaults.INSTANCE.flingBehavior(pagerState2, null, null, null, 0.0f, composerStartRestartGroup, (i15 & 14) | ProfileVerifier.CompilationStatus.f285xf2722a21, 30);
                                        i15 &= -29360129;
                                        targetedFlingBehavior2 = targetedFlingBehaviorFlingBehavior;
                                    } else {
                                        z3 = false;
                                        i21 = i19;
                                        pagerState2 = pagerState;
                                        i22 = i20;
                                    }
                                    boolean z8 = i12 == 0 ? true : z;
                                    if (i14 == 0) {
                                        z3 = z2;
                                    }
                                    Function1<? super Integer, ? extends Object> function13 = i18 == 0 ? null : function1;
                                    if ((i4 & 2048) == 0) {
                                        nestedScrollConnectionPageNestedScrollConnection = PagerDefaults.INSTANCE.pageNestedScrollConnection(pagerState2, Orientation.Vertical, composerStartRestartGroup, (i15 & 14) | 432);
                                        i22 &= -113;
                                    } else {
                                        nestedScrollConnectionPageNestedScrollConnection = nestedScrollConnection;
                                    }
                                    if (i21 == 0) {
                                        function12 = function13;
                                        nestedScrollConnection2 = nestedScrollConnectionPageNestedScrollConnection;
                                        paddingValues2 = paddingValuesM1428PaddingValues0680j_4;
                                        horizontal2 = centerHorizontally;
                                        targetedFlingBehavior3 = targetedFlingBehavior2;
                                        pageSize3 = pageSize5;
                                        i24 = i30;
                                        f3 = fM7055constructorimpl;
                                        z4 = z3;
                                        i25 = i15;
                                        snapPosition2 = SnapPosition.Start.INSTANCE;
                                        composer2 = composerStartRestartGroup;
                                        i23 = i22;
                                    } else {
                                        function12 = function13;
                                        nestedScrollConnection2 = nestedScrollConnectionPageNestedScrollConnection;
                                        paddingValues2 = paddingValuesM1428PaddingValues0680j_4;
                                        horizontal2 = centerHorizontally;
                                        targetedFlingBehavior3 = targetedFlingBehavior2;
                                        pageSize3 = pageSize5;
                                        i23 = i22;
                                        i24 = i30;
                                        f3 = fM7055constructorimpl;
                                        z4 = z3;
                                        i25 = i15;
                                        snapPosition2 = snapPosition;
                                        composer2 = composerStartRestartGroup;
                                    }
                                    z5 = z8;
                                    modifier3 = modifier6;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i4 & 128) != 0) {
                                        i15 &= -29360129;
                                    }
                                    if ((i4 & 2048) != 0) {
                                        i20 &= -113;
                                    }
                                    pagerState2 = pagerState;
                                    paddingValues2 = paddingValues;
                                    function12 = function1;
                                    nestedScrollConnection2 = nestedScrollConnection;
                                    i23 = i20;
                                    pageSize3 = pageSize2;
                                    composer2 = composerStartRestartGroup;
                                    modifier3 = modifier2;
                                    horizontal2 = centerHorizontally;
                                    i25 = i15;
                                    z5 = z;
                                    z4 = z2;
                                    snapPosition2 = snapPosition;
                                    f3 = f2;
                                    i24 = i9;
                                    targetedFlingBehavior3 = targetedFlingBehavior2;
                                }
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    modifier4 = modifier3;
                                } else {
                                    modifier4 = modifier3;
                                    ComposerKt.traceEventStart(909160706, i25, i23, "androidx.compose.foundation.pager.VerticalPager (Pager.kt:211)");
                                }
                                int i31 = i23;
                                Orientation orientation = Orientation.Vertical;
                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                int i32 = i25 >> 6;
                                int i33 = ((i25 >> 3) & 14) | 24576 | ((i25 << 3) & LDSFile.EF_DG16_TAG) | (i25 & 896) | ((i25 >> 18) & 7168) | (i32 & 458752) | (i32 & 3670016);
                                int i34 = i25 << 9;
                                int i35 = i33 | (i34 & 29360128) | (i34 & 234881024) | ((i25 << 18) & 1879048192);
                                int i36 = ((i31 >> 3) & 14) | 3072 | ((i31 << 3) & LDSFile.EF_DG16_TAG) | ((i25 >> 12) & 896);
                                int i37 = i31 << 6;
                                int i38 = i36 | (i37 & 57344) | (i37 & 458752);
                                Modifier modifier7 = modifier4;
                                LazyLayoutPagerKt.m1668PageruYRUAWA(modifier7, pagerState2, paddingValues2, z4, orientation, targetedFlingBehavior3, z5, i24, f3, pageSize3, nestedScrollConnection2, function12, horizontal2, centerVertically, snapPosition2, function4, composer2, i35, i38, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                pageSize4 = pageSize3;
                                snapPosition3 = snapPosition2;
                                z6 = z5;
                                f4 = f3;
                                targetedFlingBehavior4 = targetedFlingBehavior3;
                                i9 = i24;
                                horizontal3 = horizontal2;
                                nestedScrollConnection3 = nestedScrollConnection2;
                                z7 = z4;
                                paddingValues3 = paddingValues2;
                                modifier5 = modifier7;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                z6 = z;
                                z7 = z2;
                                function12 = function1;
                                nestedScrollConnection3 = nestedScrollConnection;
                                snapPosition3 = snapPosition;
                                pageSize4 = pageSize2;
                                composer2 = composerStartRestartGroup;
                                f4 = f2;
                                modifier5 = modifier2;
                                horizontal3 = centerHorizontally;
                                targetedFlingBehavior4 = targetedFlingBehavior2;
                                paddingValues3 = paddingValues;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.pager.PagerKt$VerticalPager$1
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
                                        PagerKt.m1673VerticalPageroI3XNZo(pagerState, modifier5, paddingValues3, pageSize4, i9, f4, horizontal3, targetedFlingBehavior4, z6, z7, function12, nestedScrollConnection3, snapPosition3, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i20 |= 3072;
                        if ((i15 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0) {
                                if (i26 == 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i11 != 0) {
                                }
                                if ((i4 & 128) == 0) {
                                }
                                if (i12 == 0) {
                                }
                                if (i14 == 0) {
                                }
                                if (i18 == 0) {
                                }
                                if ((i4 & 2048) == 0) {
                                }
                                if (i21 == 0) {
                                }
                                z5 = z8;
                                modifier3 = modifier6;
                                composer2.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i312 = i23;
                                Orientation orientation2 = Orientation.Vertical;
                                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                                int i322 = i25 >> 6;
                                int i332 = ((i25 >> 3) & 14) | 24576 | ((i25 << 3) & LDSFile.EF_DG16_TAG) | (i25 & 896) | ((i25 >> 18) & 7168) | (i322 & 458752) | (i322 & 3670016);
                                int i342 = i25 << 9;
                                int i352 = i332 | (i342 & 29360128) | (i342 & 234881024) | ((i25 << 18) & 1879048192);
                                int i362 = ((i312 >> 3) & 14) | 3072 | ((i312 << 3) & LDSFile.EF_DG16_TAG) | ((i25 >> 12) & 896);
                                int i372 = i312 << 6;
                                int i382 = i362 | (i372 & 57344) | (i372 & 458752);
                                Modifier modifier72 = modifier4;
                                LazyLayoutPagerKt.m1668PageruYRUAWA(modifier72, pagerState2, paddingValues2, z4, orientation2, targetedFlingBehavior3, z5, i24, f3, pageSize3, nestedScrollConnection2, function12, horizontal2, centerVertically2, snapPosition2, function4, composer2, i352, i382, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                pageSize4 = pageSize3;
                                snapPosition3 = snapPosition2;
                                z6 = z5;
                                f4 = f3;
                                targetedFlingBehavior4 = targetedFlingBehavior3;
                                i9 = i24;
                                horizontal3 = horizontal2;
                                nestedScrollConnection3 = nestedScrollConnection2;
                                z7 = z4;
                                paddingValues3 = paddingValues2;
                                modifier5 = modifier72;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i12 = i4 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i16 = i4 & 1024;
                    if (i16 != 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    int i282 = i17;
                    i19 = i4 & 4096;
                    if (i19 != 0) {
                    }
                    if ((i4 & 8192) == 0) {
                    }
                    if ((i15 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                pageSize2 = pageSize;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i16 = i4 & 1024;
                if (i16 != 0) {
                }
                if ((i3 & 48) == 0) {
                }
                int i2822 = i17;
                i19 = i4 & 4096;
                if (i19 != 0) {
                }
                if ((i4 & 8192) == 0) {
                }
                if ((i15 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            pageSize2 = pageSize;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i16 = i4 & 1024;
            if (i16 != 0) {
            }
            if ((i3 & 48) == 0) {
            }
            int i28222 = i17;
            i19 = i4 & 4096;
            if (i19 != 0) {
            }
            if ((i4 & 8192) == 0) {
            }
            if ((i15 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        pageSize2 = pageSize;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i16 = i4 & 1024;
        if (i16 != 0) {
        }
        if ((i3 & 48) == 0) {
        }
        int i282222 = i17;
        i19 = i4 & 4096;
        if (i19 != 0) {
        }
        if ((i4 & 8192) == 0) {
        }
        if ((i15 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final int currentPageOffset(SnapPosition snapPosition, int i, int i2, int i3, int i4, int i5, int i6, float f, int i7) {
        return MathKt.roundToInt(snapPosition.position(i, i2, i4, i5, i6, i7) - (f * (i2 + i3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performForwardPaging(PagerState pagerState, CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollForward()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(pagerState, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performBackwardPaging(PagerState pagerState, CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollBackward()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, null), 3, null);
        return true;
    }

    public static final Modifier pagerSemantics(Modifier modifier, final PagerState pagerState, final boolean z, final CoroutineScope coroutineScope, boolean z2) {
        if (z2) {
            return modifier.then(SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1
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
                    if (z) {
                        final PagerState pagerState2 = pagerState;
                        final CoroutineScope coroutineScope2 = coroutineScope;
                        SemanticsPropertiesKt.pageUp$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                return Boolean.valueOf(PagerKt.pagerSemantics$performBackwardPaging(pagerState2, coroutineScope2));
                            }
                        }, 1, null);
                        final PagerState pagerState3 = pagerState;
                        final CoroutineScope coroutineScope3 = coroutineScope;
                        SemanticsPropertiesKt.pageDown$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                return Boolean.valueOf(PagerKt.pagerSemantics$performForwardPaging(pagerState3, coroutineScope3));
                            }
                        }, 1, null);
                        return;
                    }
                    final PagerState pagerState4 = pagerState;
                    final CoroutineScope coroutineScope4 = coroutineScope;
                    SemanticsPropertiesKt.pageLeft$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(PagerKt.pagerSemantics$performBackwardPaging(pagerState4, coroutineScope4));
                        }
                    }, 1, null);
                    final PagerState pagerState5 = pagerState;
                    final CoroutineScope coroutineScope5 = coroutineScope;
                    SemanticsPropertiesKt.pageRight$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(PagerKt.pagerSemantics$performForwardPaging(pagerState5, coroutineScope5));
                        }
                    }, 1, null);
                }
            }, 1, null));
        }
        return modifier.then(Modifier.INSTANCE);
    }
}
