package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.p000ui.unit.C1959Dp;
import androidx.compose.p000ui.unit.Density;
import com.google.android.gms.common.ConnectionResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.bouncycastle.crypto.tls.CipherSuite;

/* compiled from: LazyAnimateScroll.kt */
@Metadata(m513d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082\b\u001a2\u0010\f\u001a\u00020\b*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0080@¢\u0006\u0002\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\u0004*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0016"}, m514d2 = {"BoundDistance", "Landroidx/compose/ui/unit/Dp;", "F", "DEBUG", "", "MinimumDistance", "TargetDistance", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "animateScrollToItem", "Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;", "index", "", "scrollOffset", "numOfItemsForTeleport", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateScrollScope;IIILandroidx/compose/ui/unit/Density;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isItemVisible", "foundation_release"}, m515k = 2, m516mv = {1, 8, 0}, m518xi = 48)
/* loaded from: classes.dex */
public final class LazyAnimateScrollKt {
    private static final boolean DEBUG = false;
    private static final float TargetDistance = C1959Dp.m7055constructorimpl(2500);
    private static final float BoundDistance = C1959Dp.m7055constructorimpl(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
    private static final float MinimumDistance = C1959Dp.m7055constructorimpl(50);

    private static final void debugLog(Function0<String> function0) {
    }

    public static final boolean isItemVisible(LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i) {
        return i <= lazyLayoutAnimateScrollScope.getLastVisibleItemIndex() && lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() <= i;
    }

    /* compiled from: LazyAnimateScroll.kt */
    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m514d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
    @DebugMetadata(m532c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", m533f = "LazyAnimateScroll.kt", m534i = {0, 0, 0, 0, 0, 0, 0, 0, 1}, m535l = {CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 272}, m536m = "invokeSuspend", m537n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", "minDistancePx", "forward", "$this$scroll"}, m538s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "F$2", "I$0", "L$0"})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2 */
    static final class C08362 extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Density $density;
        final /* synthetic */ int $index;
        final /* synthetic */ int $numOfItemsForTeleport;
        final /* synthetic */ int $scrollOffset;
        final /* synthetic */ LazyLayoutAnimateScrollScope $this_animateScrollToItem;
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08362(int i, Density density, LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i2, int i3, Continuation<? super C08362> continuation) {
            super(2, continuation);
            this.$index = i;
            this.$density = density;
            this.$this_animateScrollToItem = lazyLayoutAnimateScrollScope;
            this.$scrollOffset = i2;
            this.$numOfItemsForTeleport = i3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C08362 c08362 = new C08362(this.$index, this.$density, this.$this_animateScrollToItem, this.$scrollOffset, this.$numOfItemsForTeleport, continuation);
            c08362.L$0 = obj;
            return c08362;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
            return ((C08362) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00c5 A[Catch: ItemFoundInScroll -> 0x0045, TryCatch #1 {ItemFoundInScroll -> 0x0045, blocks: (B:10:0x003a, B:27:0x00c1, B:29:0x00c5, B:31:0x00cd, B:33:0x00e1, B:40:0x00f3, B:44:0x0131), top: B:81:0x003a }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00e1 A[Catch: ItemFoundInScroll -> 0x0045, TryCatch #1 {ItemFoundInScroll -> 0x0045, blocks: (B:10:0x003a, B:27:0x00c1, B:29:0x00c5, B:31:0x00cd, B:33:0x00e1, B:40:0x00f3, B:44:0x0131), top: B:81:0x003a }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0189  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x018b  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x01ed  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x01ef  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0217  */
        /* JADX WARN: Type inference failed for: r10v8, types: [T, androidx.compose.animation.core.AnimationState] */
        /* JADX WARN: Type inference failed for: r12v1, types: [T, androidx.compose.animation.core.AnimationState] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x018b -> B:85:0x018e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            float f;
            final ScrollScope scrollScope;
            float fMo1127toPx0680j_4;
            float fMo1127toPx0680j_42;
            float fMo1127toPx0680j_43;
            Ref.BooleanRef booleanRef;
            Ref.ObjectRef objectRef;
            final float f2;
            final Ref.BooleanRef booleanRef2;
            final Ref.IntRef intRef;
            float f3;
            float f4;
            int i;
            AnimationState animationStateCopy$default;
            final float itemOffset;
            final Ref.FloatRef floatRef;
            Float fBoxFloat;
            boolean z;
            ScrollScope scrollScope2;
            float fMax;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            float f5 = 0.0f;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                ScrollScope scrollScope3 = (ScrollScope) this.L$0;
                int i3 = this.$index;
                if (((float) i3) >= 0.0f) {
                    try {
                        fMo1127toPx0680j_4 = this.$density.mo1127toPx0680j_4(LazyAnimateScrollKt.TargetDistance);
                        fMo1127toPx0680j_42 = this.$density.mo1127toPx0680j_4(LazyAnimateScrollKt.BoundDistance);
                        fMo1127toPx0680j_43 = this.$density.mo1127toPx0680j_4(LazyAnimateScrollKt.MinimumDistance);
                        booleanRef = new Ref.BooleanRef();
                        booleanRef.element = true;
                        objectRef = new Ref.ObjectRef();
                        objectRef.element = AnimationStateKt.AnimationState$default(0.0f, 0.0f, 0L, 0L, false, 30, null);
                    } catch (ItemFoundInScroll e) {
                        e = e;
                        f = 0.0f;
                    }
                    if (LazyAnimateScrollKt.isItemVisible(this.$this_animateScrollToItem, this.$index)) {
                        f = 0.0f;
                        try {
                            throw new ItemFoundInScroll(MathKt.roundToInt(this.$this_animateScrollToItem.calculateDistanceTo(this.$index)), (AnimationState) objectRef.element);
                        } catch (ItemFoundInScroll e2) {
                            e = e2;
                            scrollScope = scrollScope3;
                            animationStateCopy$default = AnimationStateKt.copy$default((AnimationState) e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                            itemOffset = e.getItemOffset() + this.$scrollOffset;
                            floatRef = new Ref.FloatRef();
                            fBoxFloat = Boxing.boxFloat(itemOffset);
                            if (((Number) animationStateCopy$default.getVelocity()).floatValue() == f) {
                            }
                            this.L$0 = scrollScope;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 2;
                            if (SuspendAnimationKt.animateTo$default(animationStateCopy$default, fBoxFloat, null, !z, new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.animateScrollToItem.2.5
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
                                    float f6 = itemOffset;
                                    float fCoerceAtLeast = 0.0f;
                                    if (f6 > 0.0f) {
                                        fCoerceAtLeast = RangesKt.coerceAtMost(animationScope.getValue().floatValue(), itemOffset);
                                    } else if (f6 < 0.0f) {
                                        fCoerceAtLeast = RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), itemOffset);
                                    }
                                    float f7 = fCoerceAtLeast - floatRef.element;
                                    if (f7 != scrollScope.scrollBy(f7) || fCoerceAtLeast != animationScope.getValue().floatValue()) {
                                        animationScope.cancelAnimation();
                                    }
                                    floatRef.element += f7;
                                }
                            }, this, 2, null) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                    }
                    int i4 = this.$index > this.$this_animateScrollToItem.getFirstVisibleItemIndex() ? 1 : 0;
                    Ref.IntRef intRef2 = new Ref.IntRef();
                    intRef2.element = 1;
                    f2 = fMo1127toPx0680j_42;
                    booleanRef2 = booleanRef;
                    intRef = intRef2;
                    f3 = fMo1127toPx0680j_4;
                    scrollScope = scrollScope3;
                    f4 = fMo1127toPx0680j_43;
                    i = i4;
                    if (booleanRef2.element) {
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalArgumentException(("Index should be non-negative (" + i3 + ')').toString());
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                scrollScope2 = (ScrollScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.$this_animateScrollToItem.snapToItem(scrollScope2, this.$index, this.$scrollOffset);
                return Unit.INSTANCE;
            }
            i = this.I$0;
            f4 = this.F$2;
            float f6 = this.F$1;
            float f7 = this.F$0;
            Ref.IntRef intRef3 = (Ref.IntRef) this.L$3;
            objectRef = (Ref.ObjectRef) this.L$2;
            Ref.BooleanRef booleanRef3 = (Ref.BooleanRef) this.L$1;
            scrollScope = (ScrollScope) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                f = 0.0f;
                f2 = f6;
                f3 = f7;
                booleanRef2 = booleanRef3;
            } catch (ItemFoundInScroll e3) {
                e = e3;
                f = f5;
                animationStateCopy$default = AnimationStateKt.copy$default((AnimationState) e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                itemOffset = e.getItemOffset() + this.$scrollOffset;
                floatRef = new Ref.FloatRef();
                fBoxFloat = Boxing.boxFloat(itemOffset);
                z = ((Number) animationStateCopy$default.getVelocity()).floatValue() == f;
                this.L$0 = scrollScope;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                if (SuspendAnimationKt.animateTo$default(animationStateCopy$default, fBoxFloat, null, !z, new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.animateScrollToItem.2.5
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
                        float f62 = itemOffset;
                        float fCoerceAtLeast = 0.0f;
                        if (f62 > 0.0f) {
                            fCoerceAtLeast = RangesKt.coerceAtMost(animationScope.getValue().floatValue(), itemOffset);
                        } else if (f62 < 0.0f) {
                            fCoerceAtLeast = RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), itemOffset);
                        }
                        float f72 = fCoerceAtLeast - floatRef.element;
                        if (f72 != scrollScope.scrollBy(f72) || fCoerceAtLeast != animationScope.getValue().floatValue()) {
                            animationScope.cancelAnimation();
                        }
                        floatRef.element += f72;
                    }
                }, this, 2, null) != coroutine_suspended) {
                    scrollScope2 = scrollScope;
                    this.$this_animateScrollToItem.snapToItem(scrollScope2, this.$index, this.$scrollOffset);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            try {
                intRef3.element++;
                intRef = intRef3;
                f5 = f;
            } catch (ItemFoundInScroll e4) {
                e = e4;
                animationStateCopy$default = AnimationStateKt.copy$default((AnimationState) e.getPreviousAnimation(), 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                itemOffset = e.getItemOffset() + this.$scrollOffset;
                floatRef = new Ref.FloatRef();
                fBoxFloat = Boxing.boxFloat(itemOffset);
                if (((Number) animationStateCopy$default.getVelocity()).floatValue() == f) {
                }
                this.L$0 = scrollScope;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                if (SuspendAnimationKt.animateTo$default(animationStateCopy$default, fBoxFloat, null, !z, new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.animateScrollToItem.2.5
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
                        float f62 = itemOffset;
                        float fCoerceAtLeast = 0.0f;
                        if (f62 > 0.0f) {
                            fCoerceAtLeast = RangesKt.coerceAtMost(animationScope.getValue().floatValue(), itemOffset);
                        } else if (f62 < 0.0f) {
                            fCoerceAtLeast = RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), itemOffset);
                        }
                        float f72 = fCoerceAtLeast - floatRef.element;
                        if (f72 != scrollScope.scrollBy(f72) || fCoerceAtLeast != animationScope.getValue().floatValue()) {
                            animationScope.cancelAnimation();
                        }
                        floatRef.element += f72;
                    }
                }, this, 2, null) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (booleanRef2.element && this.$this_animateScrollToItem.getItemCount() > 0) {
                float fCalculateDistanceTo = this.$this_animateScrollToItem.calculateDistanceTo(this.$index) + this.$scrollOffset;
                if (Math.abs(fCalculateDistanceTo) >= f3) {
                    fMax = i != 0 ? f3 : -f3;
                } else {
                    fMax = Math.max(Math.abs(fCalculateDistanceTo), f4);
                    if (i == 0) {
                        fMax = -fMax;
                    }
                }
                objectRef.element = AnimationStateKt.copy$default((AnimationState) objectRef.element, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                AnimationState animationState = (AnimationState) objectRef.element;
                Float fBoxFloat2 = Boxing.boxFloat(fMax);
                boolean z2 = !(((Number) ((AnimationState) objectRef.element).getVelocity()).floatValue() != f5);
                float f8 = f3;
                final Ref.ObjectRef objectRef2 = objectRef;
                final float f9 = fMax;
                final LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope = this.$this_animateScrollToItem;
                final int i5 = this.$index;
                final boolean z3 = i == 0;
                f = f5;
                final int i6 = this.$numOfItemsForTeleport;
                final int i7 = this.$scrollOffset;
                Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.animateScrollToItem.2.3
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
                        float fCoerceAtLeast;
                        if (!LazyAnimateScrollKt.isItemVisible(lazyLayoutAnimateScrollScope, i5)) {
                            if (f9 > 0.0f) {
                                fCoerceAtLeast = RangesKt.coerceAtMost(animationScope.getValue().floatValue(), f9);
                            } else {
                                fCoerceAtLeast = RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), f9);
                            }
                            float f10 = fCoerceAtLeast - floatRef2.element;
                            float fScrollBy = scrollScope.scrollBy(f10);
                            if (!LazyAnimateScrollKt.isItemVisible(lazyLayoutAnimateScrollScope, i5) && !C08362.invokeSuspend$isOvershot(z3, lazyLayoutAnimateScrollScope, i5, i7)) {
                                if (f10 != fScrollBy) {
                                    animationScope.cancelAnimation();
                                    booleanRef2.element = false;
                                    return;
                                }
                                floatRef2.element += f10;
                                if (z3) {
                                    if (animationScope.getValue().floatValue() > f2) {
                                        animationScope.cancelAnimation();
                                    }
                                } else if (animationScope.getValue().floatValue() < (-f2)) {
                                    animationScope.cancelAnimation();
                                }
                                if (z3) {
                                    if (intRef.element >= 2) {
                                        int lastVisibleItemIndex = i5 - lazyLayoutAnimateScrollScope.getLastVisibleItemIndex();
                                        int i8 = i6;
                                        if (lastVisibleItemIndex > i8) {
                                            lazyLayoutAnimateScrollScope.snapToItem(scrollScope, i5 - i8, 0);
                                        }
                                    }
                                } else if (intRef.element >= 2) {
                                    int firstVisibleItemIndex = lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex();
                                    int i9 = i5;
                                    int i10 = firstVisibleItemIndex - i9;
                                    int i11 = i6;
                                    if (i10 > i11) {
                                        lazyLayoutAnimateScrollScope.snapToItem(scrollScope, i9 + i11, 0);
                                    }
                                }
                            }
                        }
                        if (C08362.invokeSuspend$isOvershot(z3, lazyLayoutAnimateScrollScope, i5, i7)) {
                            lazyLayoutAnimateScrollScope.snapToItem(scrollScope, i5, i7);
                            booleanRef2.element = false;
                            animationScope.cancelAnimation();
                            return;
                        }
                        if (LazyAnimateScrollKt.isItemVisible(lazyLayoutAnimateScrollScope, i5)) {
                            throw new ItemFoundInScroll(MathKt.roundToInt(lazyLayoutAnimateScrollScope.calculateDistanceTo(i5)), objectRef2.element);
                        }
                    }
                };
                float f10 = f2;
                intRef3 = intRef;
                objectRef = objectRef2;
                this.L$0 = scrollScope;
                this.L$1 = booleanRef2;
                this.L$2 = objectRef;
                this.L$3 = intRef3;
                this.F$0 = f8;
                this.F$1 = f10;
                this.F$2 = f4;
                this.I$0 = i;
                this.label = 1;
                if (SuspendAnimationKt.animateTo$default(animationState, fBoxFloat2, null, z2, function1, this, 2, null) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                f2 = f10;
                f3 = f8;
                intRef3.element++;
                intRef = intRef3;
                f5 = f;
                if (booleanRef2.element) {
                    float fCalculateDistanceTo2 = this.$this_animateScrollToItem.calculateDistanceTo(this.$index) + this.$scrollOffset;
                    if (Math.abs(fCalculateDistanceTo2) >= f3) {
                    }
                    objectRef.element = AnimationStateKt.copy$default((AnimationState) objectRef.element, 0.0f, 0.0f, 0L, 0L, false, 30, (Object) null);
                    final Ref.FloatRef floatRef22 = new Ref.FloatRef();
                    AnimationState animationState2 = (AnimationState) objectRef.element;
                    Float fBoxFloat22 = Boxing.boxFloat(fMax);
                    boolean z22 = !(((Number) ((AnimationState) objectRef.element).getVelocity()).floatValue() != f5);
                    float f82 = f3;
                    final Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> objectRef22 = objectRef;
                    final float f92 = fMax;
                    final LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope2 = this.$this_animateScrollToItem;
                    final int i52 = this.$index;
                    if (i == 0) {
                    }
                    f = f5;
                    final int i62 = this.$numOfItemsForTeleport;
                    final int i72 = this.$scrollOffset;
                    Function1<AnimationScope<Float, AnimationVector1D>, Unit> function12 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt.animateScrollToItem.2.3
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
                            float fCoerceAtLeast;
                            if (!LazyAnimateScrollKt.isItemVisible(lazyLayoutAnimateScrollScope2, i52)) {
                                if (f92 > 0.0f) {
                                    fCoerceAtLeast = RangesKt.coerceAtMost(animationScope.getValue().floatValue(), f92);
                                } else {
                                    fCoerceAtLeast = RangesKt.coerceAtLeast(animationScope.getValue().floatValue(), f92);
                                }
                                float f102 = fCoerceAtLeast - floatRef22.element;
                                float fScrollBy = scrollScope.scrollBy(f102);
                                if (!LazyAnimateScrollKt.isItemVisible(lazyLayoutAnimateScrollScope2, i52) && !C08362.invokeSuspend$isOvershot(z3, lazyLayoutAnimateScrollScope2, i52, i72)) {
                                    if (f102 != fScrollBy) {
                                        animationScope.cancelAnimation();
                                        booleanRef2.element = false;
                                        return;
                                    }
                                    floatRef22.element += f102;
                                    if (z3) {
                                        if (animationScope.getValue().floatValue() > f2) {
                                            animationScope.cancelAnimation();
                                        }
                                    } else if (animationScope.getValue().floatValue() < (-f2)) {
                                        animationScope.cancelAnimation();
                                    }
                                    if (z3) {
                                        if (intRef.element >= 2) {
                                            int lastVisibleItemIndex = i52 - lazyLayoutAnimateScrollScope2.getLastVisibleItemIndex();
                                            int i8 = i62;
                                            if (lastVisibleItemIndex > i8) {
                                                lazyLayoutAnimateScrollScope2.snapToItem(scrollScope, i52 - i8, 0);
                                            }
                                        }
                                    } else if (intRef.element >= 2) {
                                        int firstVisibleItemIndex = lazyLayoutAnimateScrollScope2.getFirstVisibleItemIndex();
                                        int i9 = i52;
                                        int i10 = firstVisibleItemIndex - i9;
                                        int i11 = i62;
                                        if (i10 > i11) {
                                            lazyLayoutAnimateScrollScope2.snapToItem(scrollScope, i9 + i11, 0);
                                        }
                                    }
                                }
                            }
                            if (C08362.invokeSuspend$isOvershot(z3, lazyLayoutAnimateScrollScope2, i52, i72)) {
                                lazyLayoutAnimateScrollScope2.snapToItem(scrollScope, i52, i72);
                                booleanRef2.element = false;
                                animationScope.cancelAnimation();
                                return;
                            }
                            if (LazyAnimateScrollKt.isItemVisible(lazyLayoutAnimateScrollScope2, i52)) {
                                throw new ItemFoundInScroll(MathKt.roundToInt(lazyLayoutAnimateScrollScope2.calculateDistanceTo(i52)), objectRef22.element);
                            }
                        }
                    };
                    float f102 = f2;
                    intRef3 = intRef;
                    objectRef = objectRef22;
                    this.L$0 = scrollScope;
                    this.L$1 = booleanRef2;
                    this.L$2 = objectRef;
                    this.L$3 = intRef3;
                    this.F$0 = f82;
                    this.F$1 = f102;
                    this.F$2 = f4;
                    this.I$0 = i;
                    this.label = 1;
                    if (SuspendAnimationKt.animateTo$default(animationState2, fBoxFloat22, null, z22, function12, this, 2, null) != coroutine_suspended) {
                    }
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$isOvershot(boolean z, LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i, int i2) {
            if (z) {
                if (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() > i) {
                    return true;
                }
                return lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() == i && lazyLayoutAnimateScrollScope.getFirstVisibleItemScrollOffset() > i2;
            }
            if (lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() < i) {
                return true;
            }
            return lazyLayoutAnimateScrollScope.getFirstVisibleItemIndex() == i && lazyLayoutAnimateScrollScope.getFirstVisibleItemScrollOffset() < i2;
        }
    }

    public static final Object animateScrollToItem(LazyLayoutAnimateScrollScope lazyLayoutAnimateScrollScope, int i, int i2, int i3, Density density, Continuation<? super Unit> continuation) {
        Object objScroll = lazyLayoutAnimateScrollScope.scroll(new C08362(i, density, lazyLayoutAnimateScrollScope, i2, i3, null), continuation);
        return objScroll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objScroll : Unit.INSTANCE;
    }
}
