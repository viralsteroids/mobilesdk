package androidx.compose.foundation.lazy;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.ScrollingContainerKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.GraphicsContext;
import androidx.compose.p000ui.layout.MeasureResult;
import androidx.compose.p000ui.layout.Placeable;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.unit.Constraints;
import androidx.compose.p000ui.unit.ConstraintsKt;
import androidx.compose.p000ui.unit.IntOffsetKt;
import androidx.compose.p000ui.unit.LayoutDirection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.jmrtd.lds.LDSFile;

/* compiled from: LazyList.kt */
@Metadata(m513d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0098\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0002\b\u001bH\u0001¢\u0006\u0002\u0010\u001c\u001a\u009a\u0001\u0010\u001d\u001a\u0019\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001e¢\u0006\u0002\b\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\tH\u0003¢\u0006\u0002\u0010*¨\u0006+"}, m514d2 = {"LazyList", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "beyondBoundsItemCount", "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "rememberLazyListMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "stickyHeadersEnabled", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;ZLandroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class LazyListKt {
    /* JADX WARN: Removed duplicated region for block: B:109:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyList(final Modifier modifier, LazyListState lazyListState, final PaddingValues paddingValues, final boolean z, final boolean z2, final FlingBehavior flingBehavior, final boolean z3, int i, Alignment.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, Arrangement.Horizontal horizontal2, final Function1<? super LazyListScope, Unit> function1, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        PaddingValues paddingValues2;
        boolean z4;
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
        Object objRememberedValue;
        final Alignment.Vertical vertical3;
        final Alignment.Horizontal horizontal3;
        final Arrangement.Horizontal horizontal4;
        final Arrangement.Vertical vertical4;
        final int i17;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final LazyListState lazyListState2 = lazyListState;
        Composer composerStartRestartGroup = composer.startRestartGroup(620764179);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(LazyList)P(7,9,2,8,6,3,10!1,4,12,11,5)81@3859L50,83@3935L48,84@4009L24,85@4081L7,86@4150L7,88@4183L395,109@4816L278,117@5164L153,123@5480L7,116@5108L481,128@5650L317,105@4671L1429:LazyList.kt#428nma");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(lazyListState2) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                paddingValues2 = paddingValues;
                i5 |= composerStartRestartGroup.changed(paddingValues2) ? 256 : 128;
            }
            if ((i4 & 8) == 0) {
                i5 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    z4 = z;
                    i5 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                }
                if ((i4 & 16) != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i5 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i4 & 32) != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                } else {
                    if ((i2 & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                        i5 |= composerStartRestartGroup.changed(flingBehavior) ? 131072 : 65536;
                    }
                    if ((i4 & 64) == 0) {
                        i5 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i5 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                    i6 = i4 & 128;
                    if (i6 == 0) {
                        i5 |= 12582912;
                        i7 = i;
                    } else {
                        i7 = i;
                        if ((i2 & 12582912) == 0) {
                            i5 |= composerStartRestartGroup.changed(i7) ? 8388608 : 4194304;
                        }
                    }
                    i8 = i4 & 256;
                    if (i8 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i5 |= composerStartRestartGroup.changed(horizontal) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i9 = i4 & 512;
                    if (i9 != 0) {
                        if ((i2 & 805306368) == 0) {
                            i10 = i9;
                            i5 |= composerStartRestartGroup.changed(vertical) ? PKIFailureInfo.duplicateCertReq : 268435456;
                        }
                        i11 = i4 & 1024;
                        if (i11 != 0) {
                            i13 = i3 | 6;
                            i12 = i11;
                        } else if ((i3 & 6) == 0) {
                            i12 = i11;
                            i13 = i3 | (composerStartRestartGroup.changed(vertical2) ? 4 : 2);
                        } else {
                            i12 = i11;
                            i13 = i3;
                        }
                        i14 = i4 & 2048;
                        if (i14 != 0) {
                            i13 |= 48;
                            i15 = i14;
                        } else if ((i3 & 48) == 0) {
                            i15 = i14;
                            i13 |= composerStartRestartGroup.changed(horizontal2) ? 32 : 16;
                        } else {
                            i15 = i14;
                        }
                        i16 = i13;
                        if ((i4 & 4096) != 0) {
                            i16 |= 384;
                        } else if ((i3 & 384) == 0) {
                            i16 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
                        }
                        if ((306783379 & i5) != 306783378 || (i16 & CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA) != 146 || !composerStartRestartGroup.getSkipping()) {
                            int i18 = i6 == 0 ? 0 : i7;
                            Alignment.Horizontal horizontal5 = i8 == 0 ? null : horizontal;
                            Arrangement.Vertical vertical5 = i10 == 0 ? null : vertical;
                            Alignment.Vertical vertical6 = i12 == 0 ? null : vertical2;
                            Arrangement.Horizontal horizontal6 = i15 == 0 ? horizontal2 : null;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(620764179, i5, i16, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:80)");
                            }
                            int i19 = (i5 >> 3) & 14;
                            Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState2, function1, composerStartRestartGroup, i19 | ((i16 >> 3) & LDSFile.EF_DG16_TAG));
                            int i20 = i5 >> 9;
                            LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState2, z2, composerStartRestartGroup, i19 | (i20 & LDSFile.EF_DG16_TAG));
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                objRememberedValue = compositionScopedCoroutineScopeCanceller;
                            }
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            ProvidableCompositionLocal<GraphicsContext> localGraphicsContext = CompositionLocalsKt.getLocalGraphicsContext();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume = composerStartRestartGroup.consume(localGraphicsContext);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            GraphicsContext graphicsContext = (GraphicsContext) objConsume;
                            CompositionLocal<Boolean> localScrollCaptureInProgress = CompositionLocalsKt.getLocalScrollCaptureInProgress();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume2 = composerStartRestartGroup.consume(localScrollCaptureInProgress);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            boolean z5 = !((Boolean) objConsume2).booleanValue();
                            int i21 = i5 & LDSFile.EF_DG16_TAG;
                            int i22 = i5 & 7168;
                            int i23 = i5 >> 6;
                            int i24 = i16 << 21;
                            int i25 = (i5 & 65520) | (i23 & 458752) | (i23 & 3670016) | (i24 & 29360128) | (i24 & 234881024) | (i5 & 1879048192);
                            int i26 = i5;
                            Alignment.Horizontal horizontal7 = horizontal5;
                            boolean z6 = z4;
                            Alignment.Vertical vertical7 = vertical6;
                            PaddingValues paddingValues3 = paddingValues2;
                            Arrangement.Vertical vertical8 = vertical5;
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda, lazyListState, paddingValues3, z6, z2, i18, horizontal7, vertical7, horizontal6, vertical8, coroutineScope, graphicsContext, z5, composerStartRestartGroup, i25, 0);
                            lazyListState2 = lazyListState;
                            Orientation orientation = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                            Modifier modifierLazyLayoutSemantics = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState2.getRemeasurementModifier()).then(lazyListState2.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda, lazyLayoutSemanticStateRememberLazyListSemanticState, orientation, z3, z, composerStartRestartGroup, (i23 & 57344) | ((i26 << 6) & 458752));
                            LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsStateRememberLazyListBeyondBoundsState = LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState2, i18, composerStartRestartGroup, i19 | ((i26 >> 18) & LDSFile.EF_DG16_TAG));
                            LazyLayoutBeyondBoundsInfo beyondBoundsInfo = lazyListState2.getBeyondBoundsInfo();
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume3 = composerStartRestartGroup.consume(localLayoutDirection);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            Modifier modifierScrollingContainer = ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(modifierLazyLayoutSemantics, lazyLayoutBeyondBoundsStateRememberLazyListBeyondBoundsState, beyondBoundsInfo, z, (LayoutDirection) objConsume3, orientation, z3, composerStartRestartGroup, (MutableVector.$stable << 6) | i22 | (i26 & 3670016)).then(lazyListState2.getItemAnimator$foundation_release().getModifier()), lazyListState2, orientation, z3, z, flingBehavior, lazyListState2.getInternalInteractionSource(), null, composerStartRestartGroup, i21 | (i20 & 7168) | (57344 & (i26 << 3)) | (i26 & 458752), 64);
                            composerStartRestartGroup = composerStartRestartGroup;
                            LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda, modifierScrollingContainer, lazyListState2.getPrefetchState(), function2RememberLazyListMeasurePolicy, composerStartRestartGroup, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            vertical3 = vertical7;
                            horizontal3 = horizontal7;
                            horizontal4 = horizontal6;
                            vertical4 = vertical8;
                            i17 = i18;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            horizontal3 = horizontal;
                            vertical4 = vertical;
                            vertical3 = vertical2;
                            horizontal4 = horizontal2;
                            i17 = i7;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.1
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

                                public final void invoke(Composer composer2, int i27) {
                                    LazyListKt.LazyList(modifier, lazyListState2, paddingValues, z, z2, flingBehavior, z3, i17, horizontal3, vertical4, vertical3, horizontal4, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 805306368;
                    i10 = i9;
                    i11 = i4 & 1024;
                    if (i11 != 0) {
                    }
                    i14 = i4 & 2048;
                    if (i14 != 0) {
                    }
                    i16 = i13;
                    if ((i4 & 4096) != 0) {
                    }
                    if ((306783379 & i5) != 306783378) {
                        if (i6 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        Arrangement.Horizontal horizontal62 = i15 == 0 ? horizontal2 : null;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i192 = (i5 >> 3) & 14;
                        Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda2 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState2, function1, composerStartRestartGroup, i192 | ((i16 >> 3) & LDSFile.EF_DG16_TAG));
                        int i202 = i5 >> 9;
                        LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState2 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState2, z2, composerStartRestartGroup, i192 | (i202 & LDSFile.EF_DG16_TAG));
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ProvidableCompositionLocal<GraphicsContext> localGraphicsContext2 = CompositionLocalsKt.getLocalGraphicsContext();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume4 = composerStartRestartGroup.consume(localGraphicsContext2);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        GraphicsContext graphicsContext2 = (GraphicsContext) objConsume4;
                        CompositionLocal<Boolean> localScrollCaptureInProgress2 = CompositionLocalsKt.getLocalScrollCaptureInProgress();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume22 = composerStartRestartGroup.consume(localScrollCaptureInProgress2);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        boolean z52 = !((Boolean) objConsume22).booleanValue();
                        int i212 = i5 & LDSFile.EF_DG16_TAG;
                        int i222 = i5 & 7168;
                        int i232 = i5 >> 6;
                        int i242 = i16 << 21;
                        int i252 = (i5 & 65520) | (i232 & 458752) | (i232 & 3670016) | (i242 & 29360128) | (i242 & 234881024) | (i5 & 1879048192);
                        int i262 = i5;
                        Alignment.Horizontal horizontal72 = horizontal5;
                        boolean z62 = z4;
                        Alignment.Vertical vertical72 = vertical6;
                        PaddingValues paddingValues32 = paddingValues2;
                        Arrangement.Vertical vertical82 = vertical5;
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy2 = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda2, lazyListState, paddingValues32, z62, z2, i18, horizontal72, vertical72, horizontal62, vertical82, coroutineScope2, graphicsContext2, z52, composerStartRestartGroup, i252, 0);
                        lazyListState2 = lazyListState;
                        Orientation orientation2 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                        Modifier modifierLazyLayoutSemantics2 = LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState2.getRemeasurementModifier()).then(lazyListState2.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda2, lazyLayoutSemanticStateRememberLazyListSemanticState2, orientation2, z3, z, composerStartRestartGroup, (i232 & 57344) | ((i262 << 6) & 458752));
                        LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsStateRememberLazyListBeyondBoundsState2 = LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState2, i18, composerStartRestartGroup, i192 | ((i262 >> 18) & LDSFile.EF_DG16_TAG));
                        LazyLayoutBeyondBoundsInfo beyondBoundsInfo2 = lazyListState2.getBeyondBoundsInfo();
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume32 = composerStartRestartGroup.consume(localLayoutDirection2);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        Modifier modifierScrollingContainer2 = ScrollingContainerKt.scrollingContainer(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(modifierLazyLayoutSemantics2, lazyLayoutBeyondBoundsStateRememberLazyListBeyondBoundsState2, beyondBoundsInfo2, z, (LayoutDirection) objConsume32, orientation2, z3, composerStartRestartGroup, (MutableVector.$stable << 6) | i222 | (i262 & 3670016)).then(lazyListState2.getItemAnimator$foundation_release().getModifier()), lazyListState2, orientation2, z3, z, flingBehavior, lazyListState2.getInternalInteractionSource(), null, composerStartRestartGroup, i212 | (i202 & 7168) | (57344 & (i262 << 3)) | (i262 & 458752), 64);
                        composerStartRestartGroup = composerStartRestartGroup;
                        LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda2, modifierScrollingContainer2, lazyListState2.getPrefetchState(), function2RememberLazyListMeasurePolicy2, composerStartRestartGroup, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        vertical3 = vertical72;
                        horizontal3 = horizontal72;
                        horizontal4 = horizontal62;
                        vertical4 = vertical82;
                        i17 = i18;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i4 & 64) == 0) {
                }
                i6 = i4 & 128;
                if (i6 == 0) {
                }
                i8 = i4 & 256;
                if (i8 == 0) {
                }
                i9 = i4 & 512;
                if (i9 != 0) {
                }
                i10 = i9;
                i11 = i4 & 1024;
                if (i11 != 0) {
                }
                i14 = i4 & 2048;
                if (i14 != 0) {
                }
                i16 = i13;
                if ((i4 & 4096) != 0) {
                }
                if ((306783379 & i5) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z4 = z;
            if ((i4 & 16) != 0) {
            }
            if ((i4 & 32) != 0) {
            }
            if ((i4 & 64) == 0) {
            }
            i6 = i4 & 128;
            if (i6 == 0) {
            }
            i8 = i4 & 256;
            if (i8 == 0) {
            }
            i9 = i4 & 512;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i4 & 1024;
            if (i11 != 0) {
            }
            i14 = i4 & 2048;
            if (i14 != 0) {
            }
            i16 = i13;
            if ((i4 & 4096) != 0) {
            }
            if ((306783379 & i5) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        paddingValues2 = paddingValues;
        if ((i4 & 8) == 0) {
        }
        z4 = z;
        if ((i4 & 16) != 0) {
        }
        if ((i4 & 32) != 0) {
        }
        if ((i4 & 64) == 0) {
        }
        i6 = i4 & 128;
        if (i6 == 0) {
        }
        i8 = i4 & 256;
        if (i8 == 0) {
        }
        i9 = i4 & 512;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i4 & 1024;
        if (i11 != 0) {
        }
        i14 = i4 & 2048;
        if (i14 != 0) {
        }
        i16 = i13;
        if ((i4 & 4096) != 0) {
        }
        if ((306783379 & i5) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0082 A[PHI: r4
  0x0082: PHI (r4v19 boolean) = (r4v17 boolean), (r4v20 boolean) binds: [B:36:0x0080, B:32:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e A[PHI: r9
  0x009e: PHI (r9v11 androidx.compose.ui.Alignment$Horizontal) = (r9v8 androidx.compose.ui.Alignment$Horizontal), (r9v12 androidx.compose.ui.Alignment$Horizontal) binds: [B:46:0x009c, B:42:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ba A[PHI: r12
  0x00ba: PHI (r12v12 androidx.compose.ui.Alignment$Vertical) = (r12v9 androidx.compose.ui.Alignment$Vertical), (r12v13 androidx.compose.ui.Alignment$Vertical) binds: [B:56:0x00b8, B:52:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d6 A[PHI: r13
  0x00d6: PHI (r13v12 androidx.compose.foundation.layout.Arrangement$Horizontal) = 
  (r13v9 androidx.compose.foundation.layout.Arrangement$Horizontal)
  (r13v13 androidx.compose.foundation.layout.Arrangement$Horizontal)
 binds: [B:66:0x00d4, B:62:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f2 A[PHI: r14
  0x00f2: PHI (r14v12 androidx.compose.foundation.layout.Arrangement$Vertical) = 
  (r14v9 androidx.compose.foundation.layout.Arrangement$Vertical)
  (r14v13 androidx.compose.foundation.layout.Arrangement$Vertical)
 binds: [B:76:0x00f0, B:72:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy(final Function0<? extends LazyListItemProvider> function0, final LazyListState lazyListState, final PaddingValues paddingValues, final boolean z, boolean z2, final int i, Alignment.Horizontal horizontal, Alignment.Vertical vertical, Arrangement.Horizontal horizontal2, Arrangement.Vertical vertical2, final CoroutineScope coroutineScope, final GraphicsContext graphicsContext, final boolean z3, Composer composer, int i2, int i3) {
        boolean z4;
        boolean z5;
        Alignment.Horizontal horizontal3;
        boolean z6;
        Alignment.Vertical vertical3;
        boolean z7;
        Arrangement.Horizontal horizontal4;
        boolean z8;
        Arrangement.Vertical vertical4;
        boolean z9;
        boolean zChanged;
        Object objRememberedValue;
        ComposerKt.sourceInformationMarkerStart(composer, 1972347046, "C(rememberLazyListMeasurePolicy)P(7,9,1,8,6!1,4,11,5,12)170@7305L8413:LazyList.kt#428nma");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1972347046, i2, i3, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:170)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 581121742, "CC(remember):LazyList.kt#9igjgp");
        boolean z10 = ((((i2 & LDSFile.EF_DG16_TAG) ^ 48) > 32 && composer.changed(lazyListState)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i2 & 384) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && composer.changed(z)) || (i2 & 3072) == 2048);
        if (((57344 & i2) ^ 24576) > 16384) {
            z4 = z2;
            if (composer.changed(z4)) {
                z5 = true;
            }
            boolean z11 = z10 | z5;
            if (((3670016 & i2) ^ 1572864) <= 1048576) {
                horizontal3 = horizontal;
                if (composer.changed(horizontal3)) {
                    z6 = true;
                }
                boolean z12 = z11 | z6;
                if (((29360128 & i2) ^ 12582912) > 8388608) {
                    vertical3 = vertical;
                    if (composer.changed(vertical3)) {
                        z7 = true;
                    }
                    boolean z13 = z12 | z7;
                    if (((234881024 & i2) ^ 100663296) <= 67108864) {
                        horizontal4 = horizontal2;
                        if (composer.changed(horizontal4)) {
                            z8 = true;
                        }
                        boolean z14 = z13 | z8;
                        if (((1879048192 & i2) ^ 805306368) > 536870912) {
                            vertical4 = vertical2;
                            if (composer.changed(vertical4)) {
                                z9 = true;
                            }
                            zChanged = z9 | z14 | composer.changed(graphicsContext) | ((((i3 & 896) ^ 384) <= 256 && composer.changed(z3)) || (i3 & 384) == 256);
                            objRememberedValue = composer.rememberedValue();
                            if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                final Arrangement.Vertical vertical5 = vertical4;
                                final Arrangement.Horizontal horizontal5 = horizontal4;
                                final Alignment.Horizontal horizontal6 = horizontal3;
                                final Alignment.Vertical vertical6 = vertical3;
                                final boolean z15 = z4;
                                objRememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                                        return m1537invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                                    }

                                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                    public final LazyListMeasureResult m1537invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                                        int i4;
                                        int i5;
                                        final int i6;
                                        float spacing;
                                        int iM7008getMaxWidthimpl;
                                        final long jIntOffset;
                                        float scrollToBeConsumed;
                                        List<Integer> listEmptyList;
                                        ObservableScopeInvalidator.m1609attachToScopeimpl(lazyListState.m1552getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                                        boolean z16 = lazyListState.getHasLookaheadPassOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                                        CheckScrollableContainerConstraintsKt.m1018checkScrollableContainerConstraintsK40F9xA(j, z15 ? Orientation.Vertical : Orientation.Horizontal);
                                        if (z15) {
                                            i4 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(paddingValues.mo1386calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                        } else {
                                            i4 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                        }
                                        if (z15) {
                                            i5 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(paddingValues.mo1387calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                        } else {
                                            i5 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                        }
                                        int i7 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(paddingValues.getTop());
                                        int i8 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(paddingValues.getBottom());
                                        final int i9 = i7 + i8;
                                        final int i10 = i4 + i5;
                                        boolean z17 = z15;
                                        int i11 = z17 ? i9 : i10;
                                        if (z17 && !z) {
                                            i6 = i7;
                                        } else if (z17 && z) {
                                            i6 = i8;
                                        } else {
                                            i6 = (z17 || z) ? i5 : i4;
                                        }
                                        final int i12 = i11 - i6;
                                        final long jM7027offsetNN6EwU = ConstraintsKt.m7027offsetNN6EwU(j, -i10, -i9);
                                        final LazyListItemProvider lazyListItemProviderInvoke = function0.invoke();
                                        lazyListItemProviderInvoke.getItemScope().setMaxSize(Constraints.m7008getMaxWidthimpl(jM7027offsetNN6EwU), Constraints.m7007getMaxHeightimpl(jM7027offsetNN6EwU));
                                        if (z15) {
                                            Arrangement.Vertical vertical7 = vertical5;
                                            if (vertical7 == null) {
                                                throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                                            }
                                            spacing = vertical7.getSpacing();
                                        } else {
                                            Arrangement.Horizontal horizontal7 = horizontal5;
                                            if (horizontal7 == null) {
                                                throw new IllegalArgumentException("null horizontalAlignment when isVertical == false".toString());
                                            }
                                            spacing = horizontal7.getSpacing();
                                        }
                                        final int i13 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(spacing);
                                        final int itemCount = lazyListItemProviderInvoke.getItemCount();
                                        if (z15) {
                                            iM7008getMaxWidthimpl = Constraints.m7007getMaxHeightimpl(j) - i9;
                                        } else {
                                            iM7008getMaxWidthimpl = Constraints.m7008getMaxWidthimpl(j) - i10;
                                        }
                                        int i14 = iM7008getMaxWidthimpl;
                                        if (!z || i14 > 0) {
                                            jIntOffset = IntOffsetKt.IntOffset(i4, i7);
                                        } else {
                                            boolean z18 = z15;
                                            if (!z18) {
                                                i4 += i14;
                                            }
                                            if (z18) {
                                                i7 += i14;
                                            }
                                            jIntOffset = IntOffsetKt.IntOffset(i4, i7);
                                        }
                                        final boolean z19 = z15;
                                        final Alignment.Horizontal horizontal8 = horizontal6;
                                        final Alignment.Vertical vertical8 = vertical6;
                                        final boolean z20 = z;
                                        final LazyListState lazyListState2 = lazyListState;
                                        LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(jM7027offsetNN6EwU, z19, lazyListItemProviderInvoke, lazyLayoutMeasureScope, itemCount, i13, horizontal8, vertical8, z20, i6, i12, jIntOffset, lazyListState2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
                                            final /* synthetic */ int $afterContentPadding;
                                            final /* synthetic */ int $beforeContentPadding;
                                            final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
                                            final /* synthetic */ boolean $isVertical;
                                            final /* synthetic */ int $itemsCount;
                                            final /* synthetic */ boolean $reverseLayout;
                                            final /* synthetic */ int $spaceBetweenItems;
                                            final /* synthetic */ LazyListState $state;
                                            final /* synthetic */ LazyLayoutMeasureScope $this_null;
                                            final /* synthetic */ Alignment.Vertical $verticalAlignment;
                                            final /* synthetic */ long $visualItemOffset;

                                            {
                                                this.$isVertical = z19;
                                                this.$this_null = lazyLayoutMeasureScope;
                                                this.$itemsCount = itemCount;
                                                this.$spaceBetweenItems = i13;
                                                this.$horizontalAlignment = horizontal8;
                                                this.$verticalAlignment = vertical8;
                                                this.$reverseLayout = z20;
                                                this.$beforeContentPadding = i6;
                                                this.$afterContentPadding = i12;
                                                this.$visualItemOffset = jIntOffset;
                                                this.$state = lazyListState2;
                                            }

                                            @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
                                            /* renamed from: createItem-X9ElhV4, reason: not valid java name */
                                            public LazyListMeasuredItem mo1538createItemX9ElhV4(int index, Object key, Object contentType, List<? extends Placeable> placeables, long constraints) {
                                                return new LazyListMeasuredItem(index, placeables, this.$isVertical, this.$horizontalAlignment, this.$verticalAlignment, this.$this_null.getLayoutDirection(), this.$reverseLayout, this.$beforeContentPadding, this.$afterContentPadding, index == this.$itemsCount + (-1) ? 0 : this.$spaceBetweenItems, this.$visualItemOffset, key, contentType, this.$state.getItemAnimator$foundation_release(), constraints, null);
                                            }
                                        };
                                        Snapshot.Companion companion = Snapshot.INSTANCE;
                                        LazyListState lazyListState3 = lazyListState;
                                        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                                        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                                        try {
                                            int iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyListState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProviderInvoke, lazyListState3.getFirstVisibleItemIndex());
                                            int firstVisibleItemScrollOffset = lazyListState3.getFirstVisibleItemScrollOffset();
                                            Unit unit = Unit.INSTANCE;
                                            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                                            List<Integer> listCalculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyListItemProviderInvoke, lazyListState.getPinnedItems(), lazyListState.getBeyondBoundsInfo());
                                            if (lazyLayoutMeasureScope.isLookingAhead() || !z16) {
                                                scrollToBeConsumed = lazyListState.getScrollToBeConsumed();
                                            } else {
                                                scrollToBeConsumed = lazyListState.getScrollDeltaBetweenPasses$foundation_release();
                                            }
                                            float f = scrollToBeConsumed;
                                            if (z3) {
                                                listEmptyList = lazyListItemProviderInvoke.getHeaderIndexes();
                                            } else {
                                                listEmptyList = CollectionsKt.emptyList();
                                            }
                                            LazyListMeasureResult lazyListMeasureResultM1542measureLazyListx0Ok8Vo = LazyListMeasureKt.m1542measureLazyListx0Ok8Vo(itemCount, lazyListMeasuredItemProvider, i14, i6, i12, i13, iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, f, jM7027offsetNN6EwU, z15, listEmptyList, vertical5, horizontal5, z, lazyLayoutMeasureScope, lazyListState.getItemAnimator$foundation_release(), i, listCalculateLazyLayoutPinnedIndices, z16, lazyLayoutMeasureScope.isLookingAhead(), lazyListState.getPostLookaheadLayoutInfo(), coroutineScope, lazyListState.m1553getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                                    return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                                }

                                                public final MeasureResult invoke(int i15, int i16, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                                    return lazyLayoutMeasureScope.layout(ConstraintsKt.m7025constrainWidthK40F9xA(j, i15 + i10), ConstraintsKt.m7024constrainHeightK40F9xA(j, i16 + i9), MapsKt.emptyMap(), function1);
                                                }
                                            });
                                            LazyListState.applyMeasureResult$foundation_release$default(lazyListState, lazyListMeasureResultM1542measureLazyListx0Ok8Vo, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                                            return lazyListMeasureResultM1542measureLazyListx0Ok8Vo;
                                        } catch (Throwable th) {
                                            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                                            throw th;
                                        }
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2 = (Function2) objRememberedValue;
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            return function2;
                        }
                        vertical4 = vertical2;
                        if ((i2 & 805306368) != 536870912) {
                            z9 = false;
                        }
                        zChanged = z9 | z14 | composer.changed(graphicsContext) | ((((i3 & 896) ^ 384) <= 256 && composer.changed(z3)) || (i3 & 384) == 256);
                        objRememberedValue = composer.rememberedValue();
                        if (!zChanged) {
                            final Arrangement.Vertical vertical52 = vertical4;
                            final Arrangement.Horizontal horizontal52 = horizontal4;
                            final Alignment.Horizontal horizontal62 = horizontal3;
                            final Alignment.Vertical vertical62 = vertical3;
                            final boolean z152 = z4;
                            objRememberedValue = (Function2) new Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                                    return m1537invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                                }

                                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                public final LazyListMeasureResult m1537invoke0kLqBqw(final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                                    int i4;
                                    int i5;
                                    final int i6;
                                    float spacing;
                                    int iM7008getMaxWidthimpl;
                                    final long jIntOffset;
                                    float scrollToBeConsumed;
                                    List<Integer> listEmptyList;
                                    ObservableScopeInvalidator.m1609attachToScopeimpl(lazyListState.m1552getMeasurementScopeInvalidatorzYiylxw$foundation_release());
                                    boolean z16 = lazyListState.getHasLookaheadPassOccurred() || lazyLayoutMeasureScope.isLookingAhead();
                                    CheckScrollableContainerConstraintsKt.m1018checkScrollableContainerConstraintsK40F9xA(j, z152 ? Orientation.Vertical : Orientation.Horizontal);
                                    if (z152) {
                                        i4 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(paddingValues.mo1386calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                    } else {
                                        i4 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                    }
                                    if (z152) {
                                        i5 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(paddingValues.mo1387calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                                    } else {
                                        i5 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                                    }
                                    int i7 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(paddingValues.getTop());
                                    int i8 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(paddingValues.getBottom());
                                    final int i9 = i7 + i8;
                                    final int i10 = i4 + i5;
                                    boolean z17 = z152;
                                    int i11 = z17 ? i9 : i10;
                                    if (z17 && !z) {
                                        i6 = i7;
                                    } else if (z17 && z) {
                                        i6 = i8;
                                    } else {
                                        i6 = (z17 || z) ? i5 : i4;
                                    }
                                    final int i12 = i11 - i6;
                                    final long jM7027offsetNN6EwU = ConstraintsKt.m7027offsetNN6EwU(j, -i10, -i9);
                                    final LazyListItemProvider lazyListItemProviderInvoke = function0.invoke();
                                    lazyListItemProviderInvoke.getItemScope().setMaxSize(Constraints.m7008getMaxWidthimpl(jM7027offsetNN6EwU), Constraints.m7007getMaxHeightimpl(jM7027offsetNN6EwU));
                                    if (z152) {
                                        Arrangement.Vertical vertical7 = vertical52;
                                        if (vertical7 == null) {
                                            throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                                        }
                                        spacing = vertical7.getSpacing();
                                    } else {
                                        Arrangement.Horizontal horizontal7 = horizontal52;
                                        if (horizontal7 == null) {
                                            throw new IllegalArgumentException("null horizontalAlignment when isVertical == false".toString());
                                        }
                                        spacing = horizontal7.getSpacing();
                                    }
                                    final int i13 = lazyLayoutMeasureScope.mo1121roundToPx0680j_4(spacing);
                                    final int itemCount = lazyListItemProviderInvoke.getItemCount();
                                    if (z152) {
                                        iM7008getMaxWidthimpl = Constraints.m7007getMaxHeightimpl(j) - i9;
                                    } else {
                                        iM7008getMaxWidthimpl = Constraints.m7008getMaxWidthimpl(j) - i10;
                                    }
                                    int i14 = iM7008getMaxWidthimpl;
                                    if (!z || i14 > 0) {
                                        jIntOffset = IntOffsetKt.IntOffset(i4, i7);
                                    } else {
                                        boolean z18 = z152;
                                        if (!z18) {
                                            i4 += i14;
                                        }
                                        if (z18) {
                                            i7 += i14;
                                        }
                                        jIntOffset = IntOffsetKt.IntOffset(i4, i7);
                                    }
                                    final boolean z19 = z152;
                                    final Alignment.Horizontal horizontal8 = horizontal62;
                                    final Alignment.Vertical vertical8 = vertical62;
                                    final boolean z20 = z;
                                    final LazyListState lazyListState2 = lazyListState;
                                    LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(jM7027offsetNN6EwU, z19, lazyListItemProviderInvoke, lazyLayoutMeasureScope, itemCount, i13, horizontal8, vertical8, z20, i6, i12, jIntOffset, lazyListState2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
                                        final /* synthetic */ int $afterContentPadding;
                                        final /* synthetic */ int $beforeContentPadding;
                                        final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
                                        final /* synthetic */ boolean $isVertical;
                                        final /* synthetic */ int $itemsCount;
                                        final /* synthetic */ boolean $reverseLayout;
                                        final /* synthetic */ int $spaceBetweenItems;
                                        final /* synthetic */ LazyListState $state;
                                        final /* synthetic */ LazyLayoutMeasureScope $this_null;
                                        final /* synthetic */ Alignment.Vertical $verticalAlignment;
                                        final /* synthetic */ long $visualItemOffset;

                                        {
                                            this.$isVertical = z19;
                                            this.$this_null = lazyLayoutMeasureScope;
                                            this.$itemsCount = itemCount;
                                            this.$spaceBetweenItems = i13;
                                            this.$horizontalAlignment = horizontal8;
                                            this.$verticalAlignment = vertical8;
                                            this.$reverseLayout = z20;
                                            this.$beforeContentPadding = i6;
                                            this.$afterContentPadding = i12;
                                            this.$visualItemOffset = jIntOffset;
                                            this.$state = lazyListState2;
                                        }

                                        @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
                                        /* renamed from: createItem-X9ElhV4, reason: not valid java name */
                                        public LazyListMeasuredItem mo1538createItemX9ElhV4(int index, Object key, Object contentType, List<? extends Placeable> placeables, long constraints) {
                                            return new LazyListMeasuredItem(index, placeables, this.$isVertical, this.$horizontalAlignment, this.$verticalAlignment, this.$this_null.getLayoutDirection(), this.$reverseLayout, this.$beforeContentPadding, this.$afterContentPadding, index == this.$itemsCount + (-1) ? 0 : this.$spaceBetweenItems, this.$visualItemOffset, key, contentType, this.$state.getItemAnimator$foundation_release(), constraints, null);
                                        }
                                    };
                                    Snapshot.Companion companion = Snapshot.INSTANCE;
                                    LazyListState lazyListState3 = lazyListState;
                                    Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
                                    Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                                    Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
                                    try {
                                        int iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyListState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProviderInvoke, lazyListState3.getFirstVisibleItemIndex());
                                        int firstVisibleItemScrollOffset = lazyListState3.getFirstVisibleItemScrollOffset();
                                        Unit unit = Unit.INSTANCE;
                                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                                        List<Integer> listCalculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyListItemProviderInvoke, lazyListState.getPinnedItems(), lazyListState.getBeyondBoundsInfo());
                                        if (lazyLayoutMeasureScope.isLookingAhead() || !z16) {
                                            scrollToBeConsumed = lazyListState.getScrollToBeConsumed();
                                        } else {
                                            scrollToBeConsumed = lazyListState.getScrollDeltaBetweenPasses$foundation_release();
                                        }
                                        float f = scrollToBeConsumed;
                                        if (z3) {
                                            listEmptyList = lazyListItemProviderInvoke.getHeaderIndexes();
                                        } else {
                                            listEmptyList = CollectionsKt.emptyList();
                                        }
                                        LazyListMeasureResult lazyListMeasureResultM1542measureLazyListx0Ok8Vo = LazyListMeasureKt.m1542measureLazyListx0Ok8Vo(itemCount, lazyListMeasuredItemProvider, i14, i6, i12, i13, iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, f, jM7027offsetNN6EwU, z152, listEmptyList, vertical52, horizontal52, z, lazyLayoutMeasureScope, lazyListState.getItemAnimator$foundation_release(), i, listCalculateLazyLayoutPinnedIndices, z16, lazyLayoutMeasureScope.isLookingAhead(), lazyListState.getPostLookaheadLayoutInfo(), coroutineScope, lazyListState.m1553getPlacementScopeInvalidatorzYiylxw$foundation_release(), graphicsContext, new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measureResult$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                                return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                            }

                                            public final MeasureResult invoke(int i15, int i16, Function1<? super Placeable.PlacementScope, Unit> function1) {
                                                return lazyLayoutMeasureScope.layout(ConstraintsKt.m7025constrainWidthK40F9xA(j, i15 + i10), ConstraintsKt.m7024constrainHeightK40F9xA(j, i16 + i9), MapsKt.emptyMap(), function1);
                                            }
                                        });
                                        LazyListState.applyMeasureResult$foundation_release$default(lazyListState, lazyListMeasureResultM1542measureLazyListx0Ok8Vo, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                                        return lazyListMeasureResultM1542measureLazyListx0Ok8Vo;
                                    } catch (Throwable th) {
                                        companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
                                        throw th;
                                    }
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function22 = (Function2) objRememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        return function22;
                    }
                    horizontal4 = horizontal2;
                    if ((100663296 & i2) == 67108864) {
                        z8 = false;
                    }
                    boolean z142 = z13 | z8;
                    if (((1879048192 & i2) ^ 805306368) > 536870912) {
                    }
                    if ((i2 & 805306368) != 536870912) {
                    }
                    zChanged = z9 | z142 | composer.changed(graphicsContext) | ((((i3 & 896) ^ 384) <= 256 && composer.changed(z3)) || (i3 & 384) == 256);
                    objRememberedValue = composer.rememberedValue();
                    if (!zChanged) {
                    }
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function222 = (Function2) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    return function222;
                }
                vertical3 = vertical;
                if ((12582912 & i2) != 8388608) {
                    z7 = false;
                }
                boolean z132 = z12 | z7;
                if (((234881024 & i2) ^ 100663296) <= 67108864) {
                }
                if ((100663296 & i2) == 67108864) {
                }
                boolean z1422 = z132 | z8;
                if (((1879048192 & i2) ^ 805306368) > 536870912) {
                }
                if ((i2 & 805306368) != 536870912) {
                }
                zChanged = z9 | z1422 | composer.changed(graphicsContext) | ((((i3 & 896) ^ 384) <= 256 && composer.changed(z3)) || (i3 & 384) == 256);
                objRememberedValue = composer.rememberedValue();
                if (!zChanged) {
                }
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2222 = (Function2) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                return function2222;
            }
            horizontal3 = horizontal;
            if ((1572864 & i2) == 1048576) {
                z6 = false;
            }
            boolean z122 = z11 | z6;
            if (((29360128 & i2) ^ 12582912) > 8388608) {
            }
            if ((12582912 & i2) != 8388608) {
            }
            boolean z1322 = z122 | z7;
            if (((234881024 & i2) ^ 100663296) <= 67108864) {
            }
            if ((100663296 & i2) == 67108864) {
            }
            boolean z14222 = z1322 | z8;
            if (((1879048192 & i2) ^ 805306368) > 536870912) {
            }
            if ((i2 & 805306368) != 536870912) {
            }
            zChanged = z9 | z14222 | composer.changed(graphicsContext) | ((((i3 & 896) ^ 384) <= 256 && composer.changed(z3)) || (i3 & 384) == 256);
            objRememberedValue = composer.rememberedValue();
            if (!zChanged) {
            }
            Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function22222 = (Function2) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            return function22222;
        }
        z4 = z2;
        if ((i2 & 24576) != 16384) {
            z5 = false;
        }
        boolean z112 = z10 | z5;
        if (((3670016 & i2) ^ 1572864) <= 1048576) {
        }
        if ((1572864 & i2) == 1048576) {
        }
        boolean z1222 = z112 | z6;
        if (((29360128 & i2) ^ 12582912) > 8388608) {
        }
        if ((12582912 & i2) != 8388608) {
        }
        boolean z13222 = z1222 | z7;
        if (((234881024 & i2) ^ 100663296) <= 67108864) {
        }
        if ((100663296 & i2) == 67108864) {
        }
        boolean z142222 = z13222 | z8;
        if (((1879048192 & i2) ^ 805306368) > 536870912) {
        }
        if ((i2 & 805306368) != 536870912) {
        }
        zChanged = z9 | z142222 | composer.changed(graphicsContext) | ((((i3 & 896) ^ 384) <= 256 && composer.changed(z3)) || (i3 & 384) == 256);
        objRememberedValue = composer.rememberedValue();
        if (!zChanged) {
        }
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function222222 = (Function2) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return function222222;
    }
}
