package androidx.compose.animation;

import android.R;
import androidx.autofill.HintConstants;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.LayoutModifierKt;
import androidx.compose.p000ui.layout.Measurable;
import androidx.compose.p000ui.layout.MeasureResult;
import androidx.compose.p000ui.layout.MeasureScope;
import androidx.compose.p000ui.layout.Placeable;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.unit.Constraints;
import androidx.compose.p000ui.unit.IntSize;
import androidx.compose.p000ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.exifinterface.media.ExifInterface;
import androidx.profileinstaller.ProfileVerifier;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jmrtd.lds.LDSFile;

/* compiled from: AnimatedContent.kt */
@Metadata(m513d1 = {"\u0000x\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a´\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000721\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u0017\u001aP\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2>\b\u0002\u0010\u001c\u001a8\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0 0\u0014\u001a¬\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020!2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001f\b\u0002\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000721\u0010\u0013\u001a-\u0012\u0004\u0012\u00020\u0015\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\"\u001a\u0015\u0010#\u001a\u00020\t*\u00020$2\u0006\u0010%\u001a\u00020&H\u0086\u0004\u001a\u0015\u0010'\u001a\u00020\t*\u00020$2\u0006\u0010%\u001a\u00020&H\u0087\u0004¨\u0006("}, m514d2 = {"AnimatedContent", "", ExifInterface.LATITUDE_SOUTH, "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/compose/animation/ContentTransform;", "Lkotlin/ExtensionFunctionType;", "contentAlignment", "Landroidx/compose/ui/Alignment;", AnnotatedPrivateKey.LABEL, "", "contentKey", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "", "content", "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedContentScope;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "SizeTransform", "Landroidx/compose/animation/SizeTransform;", "clip", "", "sizeAnimationSpec", "Landroidx/compose/ui/unit/IntSize;", "initialSize", "targetSize", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/animation/core/Transition;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "togetherWith", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", "with", "animation_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class AnimatedContentKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void AnimatedContent(final S s, Modifier modifier, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function1, Alignment alignment, String str, Function1<? super S, ? extends Object> function12, final Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function13;
        int i5;
        Alignment topStart;
        int i6;
        String str2;
        int i7;
        Function1<? super S, ? extends Object> function14;
        Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function42;
        final String str3;
        final Modifier modifier3;
        final Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function15;
        final Alignment alignment2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2132720749);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AnimatedContent)P(5,4,6,1,3,2)141@7507L58,142@7581L136:AnimatedContent.kt#xbi5r1");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(s) : composerStartRestartGroup.changedInstance(s) ? 4 : 2) | i;
        } else {
            i3 = i;
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
                    function13 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function13) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        topStart = alignment;
                        i3 |= composerStartRestartGroup.changed(topStart) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            str2 = str;
                            i3 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                        } else {
                            if ((196608 & i) == 0) {
                                function14 = function12;
                                i3 |= composerStartRestartGroup.changedInstance(function14) ? 131072 : 65536;
                            }
                            if ((i2 & 64) != 0) {
                                if ((i & 1572864) == 0) {
                                    function42 = function4;
                                    i3 |= composerStartRestartGroup.changedInstance(function42) ? 1048576 : 524288;
                                }
                                if ((i3 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
                                    Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i4 != 0) {
                                        function13 = new Function1<AnimatedContentTransitionScope<S>, ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final ContentTransform invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m828scaleInL8ZKhE$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
                                            }
                                        };
                                    }
                                    if (i5 != 0) {
                                        topStart = Alignment.INSTANCE.getTopStart();
                                    }
                                    String str4 = i6 == 0 ? "AnimatedContent" : str2;
                                    if (i7 != 0) {
                                        function14 = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final S invoke(S s2) {
                                                return s2;
                                            }
                                        };
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2132720749, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:140)");
                                    }
                                    Transition transitionUpdateTransition = androidx.compose.animation.core.TransitionKt.updateTransition(s, str4, composerStartRestartGroup, (i3 & 14) | ((i3 >> 9) & LDSFile.EF_DG16_TAG), 0);
                                    int i9 = i3 & 8176;
                                    int i10 = i3 >> 3;
                                    Modifier modifier4 = companion;
                                    Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function16 = function13;
                                    Alignment alignment3 = topStart;
                                    AnimatedContent(transitionUpdateTransition, modifier4, function16, alignment3, function14, function42, composerStartRestartGroup, i9 | (57344 & i10) | (i10 & 458752), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    str3 = str4;
                                    modifier3 = modifier4;
                                    function15 = function16;
                                    alignment2 = alignment3;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier3 = modifier2;
                                    function15 = function13;
                                    alignment2 = topStart;
                                    str3 = str2;
                                }
                                final Function1<? super S, ? extends Object> function17 = function14;
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.3
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

                                        public final void invoke(Composer composer2, int i11) {
                                            AnimatedContentKt.AnimatedContent(s, modifier3, function15, alignment2, str3, function17, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i3 |= 1572864;
                            function42 = function4;
                            if ((i3 & 599187) != 599186) {
                                if (i8 == 0) {
                                }
                                if (i4 != 0) {
                                }
                                if (i5 != 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i7 != 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                Transition transitionUpdateTransition2 = androidx.compose.animation.core.TransitionKt.updateTransition(s, str4, composerStartRestartGroup, (i3 & 14) | ((i3 >> 9) & LDSFile.EF_DG16_TAG), 0);
                                int i92 = i3 & 8176;
                                int i102 = i3 >> 3;
                                Modifier modifier42 = companion;
                                Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function162 = function13;
                                Alignment alignment32 = topStart;
                                AnimatedContent(transitionUpdateTransition2, modifier42, function162, alignment32, function14, function42, composerStartRestartGroup, i92 | (57344 & i102) | (i102 & 458752), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                str3 = str4;
                                modifier3 = modifier42;
                                function15 = function162;
                                alignment2 = alignment32;
                            }
                            final Function1<? super S, ? extends Object> function172 = function14;
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        function14 = function12;
                        if ((i2 & 64) != 0) {
                        }
                        function42 = function4;
                        if ((i3 & 599187) != 599186) {
                        }
                        final Function1<? super S, ? extends Object> function1722 = function14;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    str2 = str;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    function14 = function12;
                    if ((i2 & 64) != 0) {
                    }
                    function42 = function4;
                    if ((i3 & 599187) != 599186) {
                    }
                    final Function1<? super S, ? extends Object> function17222 = function14;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                topStart = alignment;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                function14 = function12;
                if ((i2 & 64) != 0) {
                }
                function42 = function4;
                if ((i3 & 599187) != 599186) {
                }
                final Function1<? super S, ? extends Object> function172222 = function14;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function13 = function1;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            topStart = alignment;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            function14 = function12;
            if ((i2 & 64) != 0) {
            }
            function42 = function4;
            if ((i3 & 599187) != 599186) {
            }
            final Function1<? super S, ? extends Object> function1722222 = function14;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function13 = function1;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        topStart = alignment;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        function14 = function12;
        if ((i2 & 64) != 0) {
        }
        function42 = function4;
        if ((i3 & 599187) != 599186) {
        }
        final Function1<? super S, ? extends Object> function17222222 = function14;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            function2 = new Function2<IntSize, IntSize, SpringSpec<IntSize>>() { // from class: androidx.compose.animation.AnimatedContentKt.SizeTransform.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ SpringSpec<IntSize> invoke(IntSize intSize, IntSize intSize2) {
                    return m791invokeTemP2vQ(intSize.getPackedValue(), intSize2.getPackedValue());
                }

                /* renamed from: invoke-TemP2vQ, reason: not valid java name */
                public final SpringSpec<IntSize> m791invokeTemP2vQ(long j, long j2) {
                    return AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m7217boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 1, null);
                }
            };
        }
        return SizeTransform(z, function2);
    }

    public static final SizeTransform SizeTransform(boolean z, Function2<? super IntSize, ? super IntSize, ? extends FiniteAnimationSpec<IntSize>> function2) {
        return new SizeTransformImpl(z, function2);
    }

    public static final ContentTransform togetherWith(EnterTransition enterTransition, ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    @Deprecated(message = "Infix fun EnterTransition.with(ExitTransition) has been renamed to togetherWith", replaceWith = @ReplaceWith(expression = "togetherWith(exit)", imports = {}))
    public static final ContentTransform with(EnterTransition enterTransition, ExitTransition exitTransition) {
        return new ContentTransform(enterTransition, exitTransition, 0.0f, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x027f A[LOOP:2: B:154:0x027d->B:155:0x027f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void AnimatedContent(final Transition<S> transition, Modifier modifier, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function1, Alignment alignment, Function1<? super S, ? extends Object> function12, final Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function13;
        int i5;
        Alignment topStart;
        int i6;
        Function1<? super S, ? extends Object> function14;
        Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function42;
        final C03564 c03564;
        LayoutDirection layoutDirection;
        boolean z;
        Object objRememberedValue;
        final AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl;
        boolean z2;
        Object objRememberedValue2;
        final SnapshotStateList snapshotStateList;
        boolean z3;
        Object objRememberedValue3;
        MutableScatterMap mutableScatterMap;
        int size;
        int i7;
        MutableScatterMap mutableScatterMap2;
        SnapshotStateList snapshotStateList2;
        boolean zChanged;
        ContentTransform contentTransformRememberedValue;
        Object objRememberedValue4;
        int currentCompositeKeyHash;
        Composer composerM4088constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int size2;
        int i8;
        final Modifier modifier3;
        Iterator<T> it;
        int i9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Transition<S> transition2 = transition;
        Composer composerStartRestartGroup = composer.startRestartGroup(-114689412);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(AnimatedContent)P(3,4,1,2)714@34537L7,715@34565L106,719@34759L51,720@34832L69,808@39387L58,809@39479L45,819@39798L52,810@39529L327:AnimatedContent.kt#xbi5r1");
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(transition2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 2;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function13 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function13) ? 256 : 128;
                }
                i5 = i2 & 4;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        topStart = alignment;
                        i3 |= composerStartRestartGroup.changed(topStart) ? 2048 : 1024;
                    }
                    i6 = i2 & 8;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            function14 = function12;
                            i3 |= composerStartRestartGroup.changedInstance(function14) ? 16384 : 8192;
                        }
                        if ((i2 & 16) == 0) {
                            if ((i & ProfileVerifier.CompilationStatus.f285xf2722a21) == 0) {
                                function42 = function4;
                                i3 |= composerStartRestartGroup.changedInstance(function42) ? 131072 : 65536;
                            }
                            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                                Modifier modifier4 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                                c03564 = i4 == 0 ? new Function1<AnimatedContentTransitionScope<S>, ContentTransform>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final ContentTransform invoke(AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
                                        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m828scaleInL8ZKhE$default(AnimationSpecKt.tween$default(220, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
                                    }
                                } : function13;
                                if (i5 != 0) {
                                    topStart = Alignment.INSTANCE.getTopStart();
                                }
                                if (i6 != 0) {
                                    function14 = new Function1<S, S>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final S invoke(S s) {
                                            return s;
                                        }
                                    };
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-114689412, i3, -1, "androidx.compose.animation.AnimatedContent (AnimatedContent.kt:713)");
                                }
                                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object objConsume = composerStartRestartGroup.consume(localLayoutDirection);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                layoutDirection = (LayoutDirection) objConsume;
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -801903883, "CC(remember):AnimatedContent.kt#9igjgp");
                                int i11 = i3 & 14;
                                z = i11 != 4;
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new AnimatedContentTransitionScopeImpl(transition2, topStart, layoutDirection);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                animatedContentTransitionScopeImpl = objRememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -801897730, "CC(remember):AnimatedContent.kt#9igjgp");
                                z2 = i11 != 4;
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = SnapshotStateKt.mutableStateListOf(transition2.getCurrentState());
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                snapshotStateList = (SnapshotStateList) objRememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -801895376, "CC(remember):AnimatedContent.kt#9igjgp");
                                z3 = i11 != 4;
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = ScatterMapKt.mutableScatterMapOf();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                mutableScatterMap = (MutableScatterMap) objRememberedValue3;
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                if (!snapshotStateList.contains(transition2.getCurrentState())) {
                                    snapshotStateList.clear();
                                    snapshotStateList.add(transition2.getCurrentState());
                                }
                                if (Intrinsics.areEqual(transition2.getCurrentState(), transition2.getTargetState())) {
                                    if (snapshotStateList.size() != 1 || !Intrinsics.areEqual(snapshotStateList.get(0), transition2.getCurrentState())) {
                                        snapshotStateList.clear();
                                        snapshotStateList.add(transition2.getCurrentState());
                                    }
                                    if (mutableScatterMap.get_size() != 1 || mutableScatterMap.containsKey(transition2.getCurrentState())) {
                                        mutableScatterMap.clear();
                                    }
                                    animatedContentTransitionScopeImpl.setContentAlignment(topStart);
                                    animatedContentTransitionScopeImpl.setLayoutDirection$animation_release(layoutDirection);
                                }
                                if (!Intrinsics.areEqual(transition2.getCurrentState(), transition2.getTargetState()) && !snapshotStateList.contains(transition2.getTargetState())) {
                                    it = snapshotStateList.iterator();
                                    i9 = 0;
                                    while (true) {
                                        if (it.hasNext()) {
                                            i9 = -1;
                                            break;
                                        } else if (Intrinsics.areEqual(function14.invoke((Object) it.next()), function14.invoke(transition2.getTargetState()))) {
                                            break;
                                        } else {
                                            i9++;
                                        }
                                    }
                                    if (i9 != -1) {
                                        snapshotStateList.add(transition2.getTargetState());
                                    } else {
                                        snapshotStateList.set(i9, transition2.getTargetState());
                                    }
                                }
                                if (mutableScatterMap.containsKey(transition2.getTargetState()) || !mutableScatterMap.containsKey(transition2.getCurrentState())) {
                                    composerStartRestartGroup.startReplaceGroup(912931457);
                                    ComposerKt.sourceInformation(composerStartRestartGroup, "*756@36778L2565");
                                    mutableScatterMap.clear();
                                    SnapshotStateList snapshotStateList3 = snapshotStateList;
                                    size = snapshotStateList3.size();
                                    i7 = 0;
                                    while (i7 < size) {
                                        MutableScatterMap mutableScatterMap3 = mutableScatterMap;
                                        final T t = snapshotStateList3.get(i7);
                                        final Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function43 = function42;
                                        mutableScatterMap3.set(t, ComposableLambdaKt.rememberComposableLambda(885640742, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
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

                                            /* JADX WARN: Multi-variable type inference failed */
                                            public final void invoke(Composer composer2, int i12) {
                                                ComposerKt.sourceInformation(composer2, "C757@36814L38,761@37028L323,768@37384L125,779@37953L328,775@37761L25,786@38417L233,791@38669L660,773@37692L1637:AnimatedContent.kt#xbi5r1");
                                                if ((i12 & 3) == 2 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(885640742, i12, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:757)");
                                                }
                                                ComposerKt.sourceInformationMarkerStart(composer2, 1908224079, "CC(remember):AnimatedContent.kt#9igjgp");
                                                Function1<AnimatedContentTransitionScope<S>, ContentTransform> function15 = c03564;
                                                Object obj = animatedContentTransitionScopeImpl;
                                                ContentTransform contentTransformRememberedValue2 = composer2.rememberedValue();
                                                if (contentTransformRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    contentTransformRememberedValue2 = function15.invoke(obj);
                                                    composer2.updateRememberedValue(contentTransformRememberedValue2);
                                                }
                                                final ContentTransform contentTransform = (ContentTransform) contentTransformRememberedValue2;
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                boolean zAreEqual = Intrinsics.areEqual(transition2.getSegment().getTargetState(), t);
                                                ComposerKt.sourceInformationMarkerStart(composer2, 1908231212, "CC(remember):AnimatedContent.kt#9igjgp");
                                                boolean zChanged2 = composer2.changed(zAreEqual);
                                                Transition<S> transition3 = transition2;
                                                S s = t;
                                                Function1<AnimatedContentTransitionScope<S>, ContentTransform> function16 = c03564;
                                                Object obj2 = animatedContentTransitionScopeImpl;
                                                Object objRememberedValue5 = composer2.rememberedValue();
                                                if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue5 = Intrinsics.areEqual(transition3.getSegment().getTargetState(), s) ? ExitTransition.INSTANCE.getNone() : function16.invoke(obj2).getInitialContentExit();
                                                    composer2.updateRememberedValue(objRememberedValue5);
                                                }
                                                final ExitTransition exitTransition = (ExitTransition) objRememberedValue5;
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                ComposerKt.sourceInformationMarkerStart(composer2, 1908242406, "CC(remember):AnimatedContent.kt#9igjgp");
                                                S s2 = t;
                                                Transition<S> transition4 = transition2;
                                                Object objRememberedValue6 = composer2.rememberedValue();
                                                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue6 = new AnimatedContentTransitionScopeImpl.ChildData(Intrinsics.areEqual(s2, transition4.getTargetState()));
                                                    composer2.updateRememberedValue(objRememberedValue6);
                                                }
                                                AnimatedContentTransitionScopeImpl.ChildData childData = (AnimatedContentTransitionScopeImpl.ChildData) objRememberedValue6;
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                EnterTransition targetContentEnter = contentTransform.getTargetContentEnter();
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                ComposerKt.sourceInformationMarkerStart(composer2, 1908260817, "CC(remember):AnimatedContent.kt#9igjgp");
                                                boolean zChangedInstance = composer2.changedInstance(contentTransform);
                                                Object objRememberedValue7 = composer2.rememberedValue();
                                                if (zChangedInstance || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue7 = (Function3) new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                                        {
                                                            super(3);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                                            return m790invoke3p2s80s(measureScope, measurable, constraints.getValue());
                                                        }

                                                        /* renamed from: invoke-3p2s80s, reason: not valid java name */
                                                        public final MeasureResult m790invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                                                            final Placeable placeableMo5931measureBRTryo0 = measurable.mo5931measureBRTryo0(j);
                                                            int width = placeableMo5931measureBRTryo0.getWidth();
                                                            int height = placeableMo5931measureBRTryo0.getHeight();
                                                            final ContentTransform contentTransform2 = contentTransform;
                                                            return MeasureScope.layout$default(measureScope, width, height, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
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
                                                                    placementScope.place(placeableMo5931measureBRTryo0, 0, 0, contentTransform2.getTargetContentZIndex());
                                                                }
                                                            }, 4, null);
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(objRememberedValue7);
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                Modifier modifierLayout = LayoutModifierKt.layout(companion, (Function3) objRememberedValue7);
                                                childData.setTarget(Intrinsics.areEqual(t, transition2.getTargetState()));
                                                Modifier modifierThen = modifierLayout.then(childData);
                                                Transition<S> transition5 = transition2;
                                                ComposerKt.sourceInformationMarkerStart(composer2, 1908254370, "CC(remember):AnimatedContent.kt#9igjgp");
                                                boolean zChangedInstance2 = composer2.changedInstance(t);
                                                final S s3 = t;
                                                Object objRememberedValue8 = composer2.rememberedValue();
                                                if (zChangedInstance2 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue8 = (Function1) new Function1<S, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Boolean invoke(S s4) {
                                                            return Boolean.valueOf(Intrinsics.areEqual(s4, s3));
                                                        }

                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Boolean invoke(Object obj3) {
                                                            return invoke((AnimatedContentKt$AnimatedContent$6$1$3$1<S>) obj3);
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(objRememberedValue8);
                                                }
                                                Function1 function17 = (Function1) objRememberedValue8;
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                ComposerKt.sourceInformationMarkerStart(composer2, 1908275570, "CC(remember):AnimatedContent.kt#9igjgp");
                                                boolean zChanged3 = composer2.changed(exitTransition);
                                                Object objRememberedValue9 = composer2.rememberedValue();
                                                if (zChanged3 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue9 = (Function2) new Function2<EnterExitState, EnterExitState, Boolean>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
                                                            return Boolean.valueOf(enterExitState == EnterExitState.PostExit && enterExitState2 == EnterExitState.PostExit && !exitTransition.getData().getHold());
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(objRememberedValue9);
                                                }
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                final SnapshotStateList<S> snapshotStateList4 = snapshotStateList;
                                                final S s4 = t;
                                                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                                                final Function4<AnimatedContentScope, S, Composer, Integer, Unit> function44 = function43;
                                                AnimatedVisibilityKt.AnimatedEnterExitImpl(transition5, function17, modifierThen, targetContentEnter, exitTransition, (Function2) objRememberedValue9, null, ComposableLambdaKt.rememberComposableLambda(-616195562, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                                        invoke(animatedVisibilityScope, composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, int i13) {
                                                        ComposerKt.sourceInformation(composer3, "C793@38802L230,793@38779L253,*801@39194L43,802@39265L24:AnimatedContent.kt#xbi5r1");
                                                        if ((i13 & 6) == 0) {
                                                            i13 |= (i13 & 8) == 0 ? composer3.changed(animatedVisibilityScope) : composer3.changedInstance(animatedVisibilityScope) ? 4 : 2;
                                                        }
                                                        if ((i13 & 19) == 18 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-616195562, i13, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:793)");
                                                        }
                                                        ComposerKt.sourceInformationMarkerStart(composer3, 641996302, "CC(remember):AnimatedContent.kt#9igjgp");
                                                        boolean zChanged4 = composer3.changed(snapshotStateList4) | composer3.changedInstance(s4) | composer3.changedInstance(animatedContentTransitionScopeImpl2);
                                                        final SnapshotStateList<S> snapshotStateList5 = snapshotStateList4;
                                                        final S s5 = s4;
                                                        final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl3 = animatedContentTransitionScopeImpl2;
                                                        Object objRememberedValue10 = composer3.rememberedValue();
                                                        if (zChanged4 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue10 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                                    final SnapshotStateList<S> snapshotStateList6 = snapshotStateList5;
                                                                    final S s6 = s5;
                                                                    final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl4 = animatedContentTransitionScopeImpl3;
                                                                    return new DisposableEffectResult() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1$invoke$$inlined$onDispose$1
                                                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                                                        public void dispose() {
                                                                            snapshotStateList6.remove(s6);
                                                                            animatedContentTransitionScopeImpl4.getTargetSizeMap$animation_release().remove(s6);
                                                                        }
                                                                    };
                                                                }
                                                            };
                                                            composer3.updateRememberedValue(objRememberedValue10);
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                                        EffectsKt.DisposableEffect(animatedVisibilityScope, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue10, composer3, i13 & 14);
                                                        MutableScatterMap targetSizeMap$animation_release = animatedContentTransitionScopeImpl2.getTargetSizeMap$animation_release();
                                                        S s6 = s4;
                                                        Intrinsics.checkNotNull(animatedVisibilityScope, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                                        targetSizeMap$animation_release.set(s6, ((AnimatedVisibilityScopeImpl) animatedVisibilityScope).getTargetSize$animation_release());
                                                        ComposerKt.sourceInformationMarkerStart(composer3, 642008659, "CC(remember):AnimatedContent.kt#9igjgp");
                                                        Object objRememberedValue11 = composer3.rememberedValue();
                                                        if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                                            objRememberedValue11 = new AnimatedContentScopeImpl(animatedVisibilityScope);
                                                            composer3.updateRememberedValue(objRememberedValue11);
                                                        }
                                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                                        function44.invoke((AnimatedContentScopeImpl) objRememberedValue11, s4, composer3, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer2, 54), composer2, 12582912, 64);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composerStartRestartGroup, 54));
                                        i7++;
                                        transition2 = transition;
                                        snapshotStateList = snapshotStateList;
                                        mutableScatterMap = mutableScatterMap3;
                                        function42 = function4;
                                    }
                                    mutableScatterMap2 = mutableScatterMap;
                                    snapshotStateList2 = snapshotStateList;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(915535767);
                                    composerStartRestartGroup.endReplaceGroup();
                                    mutableScatterMap2 = mutableScatterMap;
                                    snapshotStateList2 = snapshotStateList;
                                }
                                Transition.Segment<S> segment = transition.getSegment();
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -801749627, "CC(remember):AnimatedContent.kt#9igjgp");
                                zChanged = composerStartRestartGroup.changed(segment) | composerStartRestartGroup.changed(animatedContentTransitionScopeImpl);
                                contentTransformRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (!zChanged || contentTransformRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    contentTransformRememberedValue = c03564.invoke(animatedContentTransitionScopeImpl);
                                    composerStartRestartGroup.updateRememberedValue(contentTransformRememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                Modifier modifierThen = modifier4.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release((ContentTransform) contentTransformRememberedValue, composerStartRestartGroup, 0));
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -801736481, "CC(remember):AnimatedContent.kt#9igjgp");
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                AnimatedContentMeasurePolicy animatedContentMeasurePolicy = (AnimatedContentMeasurePolicy) objRememberedValue4;
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
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
                                Updater.m4095setimpl(composerM4088constructorimpl, animatedContentMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!composerM4088constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4088constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1023567688, "C:AnimatedContent.kt#xbi5r1");
                                composerStartRestartGroup.startReplaceGroup(-1491001814);
                                ComposerKt.sourceInformation(composerStartRestartGroup, "");
                                SnapshotStateList snapshotStateList4 = snapshotStateList2;
                                size2 = snapshotStateList4.size();
                                for (i8 = 0; i8 < size2; i8++) {
                                    R.animator animatorVar = (Object) snapshotStateList4.get(i8);
                                    composerStartRestartGroup.startMovableGroup(1908315325, function14.invoke(animatorVar));
                                    ComposerKt.sourceInformation(composerStartRestartGroup, "");
                                    Function2 function2 = (Function2) mutableScatterMap2.get(animatorVar);
                                    if (function2 == null) {
                                        composerStartRestartGroup.startReplaceGroup(-971711888);
                                        composerStartRestartGroup.endReplaceGroup();
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(1908317105);
                                        ComposerKt.sourceInformation(composerStartRestartGroup, "815@39722L8");
                                        function2.invoke(composerStartRestartGroup, 0);
                                        composerStartRestartGroup.endReplaceGroup();
                                    }
                                    composerStartRestartGroup.endMovableGroup();
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                composerStartRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                c03564 = function13;
                            }
                            final Alignment alignment2 = topStart;
                            final Function1<? super S, ? extends Object> function15 = function14;
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedContentKt.AnimatedContent.9
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

                                    public final void invoke(Composer composer2, int i12) {
                                        AnimatedContentKt.AnimatedContent(transition, modifier3, c03564, alignment2, function15, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= ProfileVerifier.CompilationStatus.f285xf2722a21;
                        function42 = function4;
                        if ((74899 & i3) == 74898) {
                            if (i10 == 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume2 = composerStartRestartGroup.consume(localLayoutDirection2);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            layoutDirection = (LayoutDirection) objConsume2;
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -801903883, "CC(remember):AnimatedContent.kt#9igjgp");
                            int i112 = i3 & 14;
                            if (i112 != 4) {
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z) {
                                objRememberedValue = new AnimatedContentTransitionScopeImpl(transition2, topStart, layoutDirection);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                animatedContentTransitionScopeImpl = objRememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -801897730, "CC(remember):AnimatedContent.kt#9igjgp");
                                if (i112 != 4) {
                                }
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!z2) {
                                    objRememberedValue2 = SnapshotStateKt.mutableStateListOf(transition2.getCurrentState());
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    snapshotStateList = (SnapshotStateList) objRememberedValue2;
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -801895376, "CC(remember):AnimatedContent.kt#9igjgp");
                                    if (i112 != 4) {
                                    }
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (!z3) {
                                        objRememberedValue3 = ScatterMapKt.mutableScatterMapOf();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                        mutableScatterMap = (MutableScatterMap) objRememberedValue3;
                                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                        if (!snapshotStateList.contains(transition2.getCurrentState())) {
                                        }
                                        if (Intrinsics.areEqual(transition2.getCurrentState(), transition2.getTargetState())) {
                                        }
                                        if (!Intrinsics.areEqual(transition2.getCurrentState(), transition2.getTargetState())) {
                                            it = snapshotStateList.iterator();
                                            i9 = 0;
                                            while (true) {
                                                if (it.hasNext()) {
                                                }
                                                i9++;
                                            }
                                            if (i9 != -1) {
                                            }
                                        }
                                        if (mutableScatterMap.containsKey(transition2.getTargetState())) {
                                            composerStartRestartGroup.startReplaceGroup(912931457);
                                            ComposerKt.sourceInformation(composerStartRestartGroup, "*756@36778L2565");
                                            mutableScatterMap.clear();
                                            SnapshotStateList snapshotStateList32 = snapshotStateList;
                                            size = snapshotStateList32.size();
                                            i7 = 0;
                                            while (i7 < size) {
                                            }
                                            mutableScatterMap2 = mutableScatterMap;
                                            snapshotStateList2 = snapshotStateList;
                                            composerStartRestartGroup.endReplaceGroup();
                                            Transition.Segment<S> segment2 = transition.getSegment();
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -801749627, "CC(remember):AnimatedContent.kt#9igjgp");
                                            zChanged = composerStartRestartGroup.changed(segment2) | composerStartRestartGroup.changed(animatedContentTransitionScopeImpl);
                                            contentTransformRememberedValue = composerStartRestartGroup.rememberedValue();
                                            if (!zChanged) {
                                                contentTransformRememberedValue = c03564.invoke(animatedContentTransitionScopeImpl);
                                                composerStartRestartGroup.updateRememberedValue(contentTransformRememberedValue);
                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                Modifier modifierThen2 = modifier4.then(animatedContentTransitionScopeImpl.createSizeAnimationModifier$animation_release((ContentTransform) contentTransformRememberedValue, composerStartRestartGroup, 0));
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -801736481, "CC(remember):AnimatedContent.kt#9igjgp");
                                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                }
                                                AnimatedContentMeasurePolicy animatedContentMeasurePolicy2 = (AnimatedContentMeasurePolicy) objRememberedValue4;
                                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen2);
                                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                                }
                                                composerStartRestartGroup.startReusableNode();
                                                if (!composerStartRestartGroup.getInserting()) {
                                                }
                                                composerM4088constructorimpl = Updater.m4088constructorimpl(composerStartRestartGroup);
                                                Updater.m4095setimpl(composerM4088constructorimpl, animatedContentMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m4095setimpl(composerM4088constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (!composerM4088constructorimpl.getInserting()) {
                                                    composerM4088constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM4088constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    Updater.m4095setimpl(composerM4088constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1023567688, "C:AnimatedContent.kt#xbi5r1");
                                                    composerStartRestartGroup.startReplaceGroup(-1491001814);
                                                    ComposerKt.sourceInformation(composerStartRestartGroup, "");
                                                    SnapshotStateList snapshotStateList42 = snapshotStateList2;
                                                    size2 = snapshotStateList42.size();
                                                    while (i8 < size2) {
                                                    }
                                                    composerStartRestartGroup.endReplaceGroup();
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    composerStartRestartGroup.endNode();
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    modifier3 = modifier4;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        final Alignment alignment22 = topStart;
                        final Function1<? super S, ? extends Object> function152 = function14;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    function14 = function12;
                    if ((i2 & 16) == 0) {
                    }
                    function42 = function4;
                    if ((74899 & i3) == 74898) {
                    }
                    final Alignment alignment222 = topStart;
                    final Function1<? super S, ? extends Object> function1522 = function14;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                topStart = alignment;
                i6 = i2 & 8;
                if (i6 == 0) {
                }
                function14 = function12;
                if ((i2 & 16) == 0) {
                }
                function42 = function4;
                if ((74899 & i3) == 74898) {
                }
                final Alignment alignment2222 = topStart;
                final Function1<? super S, ? extends Object> function15222 = function14;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function13 = function1;
            i5 = i2 & 4;
            if (i5 != 0) {
            }
            topStart = alignment;
            i6 = i2 & 8;
            if (i6 == 0) {
            }
            function14 = function12;
            if ((i2 & 16) == 0) {
            }
            function42 = function4;
            if ((74899 & i3) == 74898) {
            }
            final Alignment alignment22222 = topStart;
            final Function1<? super S, ? extends Object> function152222 = function14;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 2;
        if (i4 == 0) {
        }
        function13 = function1;
        i5 = i2 & 4;
        if (i5 != 0) {
        }
        topStart = alignment;
        i6 = i2 & 8;
        if (i6 == 0) {
        }
        function14 = function12;
        if ((i2 & 16) == 0) {
        }
        function42 = function4;
        if ((74899 & i3) == 74898) {
        }
        final Alignment alignment222222 = topStart;
        final Function1<? super S, ? extends Object> function1522222 = function14;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
