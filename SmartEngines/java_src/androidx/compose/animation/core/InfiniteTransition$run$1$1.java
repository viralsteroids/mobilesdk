package androidx.compose.animation.core;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.crypto.tls.CipherSuite;

/* compiled from: InfiniteTransition.kt */
@Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
@DebugMetadata(m532c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", m533f = "InfiniteTransition.kt", m534i = {0, 0, 1, 1}, m535l = {CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, 205}, m536m = "invokeSuspend", m537n = {"$this$LaunchedEffect", "durationScale", "$this$LaunchedEffect", "durationScale"}, m538s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes.dex */
final class InfiniteTransition$run$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<State<Long>> $toolingOverride;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InfiniteTransition this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InfiniteTransition$run$1$1(MutableState<State<Long>> mutableState, InfiniteTransition infiniteTransition, Continuation<? super InfiniteTransition$run$1$1> continuation) {
        super(2, continuation);
        this.$toolingOverride = mutableState;
        this.this$0 = infiniteTransition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InfiniteTransition$run$1$1 infiniteTransition$run$1$1 = new InfiniteTransition$run$1$1(this.$toolingOverride, this.this$0, continuation);
        infiniteTransition$run$1$1.L$0 = obj;
        return infiniteTransition$run$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InfiniteTransition$run$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Path cross not found for [B:11:0x0040, B:16:0x0062], limit reached: 18 */
    /* JADX WARN: Path cross not found for [B:16:0x0062, B:11:0x0040], limit reached: 18 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b A[PHI: r1 r8
  0x005b: PHI (r1v2 kotlin.jvm.internal.Ref$FloatRef) = (r1v3 kotlin.jvm.internal.Ref$FloatRef), (r1v5 kotlin.jvm.internal.Ref$FloatRef) binds: [B:12:0x0058, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x005b: PHI (r8v3 kotlinx.coroutines.CoroutineScope) = (r8v4 kotlinx.coroutines.CoroutineScope), (r8v5 kotlinx.coroutines.CoroutineScope) binds: [B:12:0x0058, B:9:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0060 -> B:11:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0082 -> B:11:0x0040). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final CoroutineScope coroutineScope;
        final Ref.FloatRef floatRef;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            floatRef = new Ref.FloatRef();
            floatRef.element = 1.0f;
        } else if (i == 1) {
            floatRef = (Ref.FloatRef) this.L$1;
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope = coroutineScope2;
            if (floatRef.element == 0.0f) {
                this.L$0 = coroutineScope;
                this.L$1 = floatRef;
                this.label = 2;
                if (FlowKt.first(SnapshotStateKt.snapshotFlow(new Function0<Float>() { // from class: androidx.compose.animation.core.InfiniteTransition$run$1$1.2
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(SuspendAnimationKt.getDurationScale(coroutineScope.getCoroutineContext()));
                    }
                }), new C04483(null), this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = (Ref.FloatRef) this.L$1;
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            coroutineScope = coroutineScope3;
        }
        final MutableState<State<Long>> mutableState = this.$toolingOverride;
        final InfiniteTransition infiniteTransition = this.this$0;
        this.L$0 = coroutineScope;
        this.L$1 = floatRef;
        this.label = 1;
        if (InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(new Function1<Long, Unit>() { // from class: androidx.compose.animation.core.InfiniteTransition$run$1$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                invoke(l.longValue());
                return Unit.INSTANCE;
            }

            public final void invoke(long j) {
                State<Long> value = mutableState.getValue();
                long jLongValue = value != null ? value.getValue().longValue() : j;
                int i2 = 0;
                if (infiniteTransition.startTimeNanos == Long.MIN_VALUE || floatRef.element != SuspendAnimationKt.getDurationScale(coroutineScope.getCoroutineContext())) {
                    infiniteTransition.startTimeNanos = j;
                    MutableVector mutableVector = infiniteTransition._animations;
                    int size = mutableVector.getSize();
                    if (size > 0) {
                        Object[] content = mutableVector.getContent();
                        int i3 = 0;
                        do {
                            ((InfiniteTransition.TransitionAnimationState) content[i3]).reset$animation_core_release();
                            i3++;
                        } while (i3 < size);
                    }
                    floatRef.element = SuspendAnimationKt.getDurationScale(coroutineScope.getCoroutineContext());
                }
                if (floatRef.element == 0.0f) {
                    MutableVector mutableVector2 = infiniteTransition._animations;
                    int size2 = mutableVector2.getSize();
                    if (size2 > 0) {
                        Object[] content2 = mutableVector2.getContent();
                        do {
                            ((InfiniteTransition.TransitionAnimationState) content2[i2]).skipToEnd$animation_core_release();
                            i2++;
                        } while (i2 < size2);
                        return;
                    }
                    return;
                }
                infiniteTransition.onFrame((long) ((jLongValue - infiniteTransition.startTimeNanos) / floatRef.element));
            }
        }, this) != coroutine_suspended) {
            if (floatRef.element == 0.0f) {
            }
            final MutableState<State<Long>> mutableState2 = this.$toolingOverride;
            final InfiniteTransition infiniteTransition2 = this.this$0;
            this.L$0 = coroutineScope;
            this.L$1 = floatRef;
            this.label = 1;
            if (InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(new Function1<Long, Unit>() { // from class: androidx.compose.animation.core.InfiniteTransition$run$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                    invoke(l.longValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(long j) {
                    State<Long> value = mutableState2.getValue();
                    long jLongValue = value != null ? value.getValue().longValue() : j;
                    int i2 = 0;
                    if (infiniteTransition2.startTimeNanos == Long.MIN_VALUE || floatRef.element != SuspendAnimationKt.getDurationScale(coroutineScope.getCoroutineContext())) {
                        infiniteTransition2.startTimeNanos = j;
                        MutableVector mutableVector = infiniteTransition2._animations;
                        int size = mutableVector.getSize();
                        if (size > 0) {
                            Object[] content = mutableVector.getContent();
                            int i3 = 0;
                            do {
                                ((InfiniteTransition.TransitionAnimationState) content[i3]).reset$animation_core_release();
                                i3++;
                            } while (i3 < size);
                        }
                        floatRef.element = SuspendAnimationKt.getDurationScale(coroutineScope.getCoroutineContext());
                    }
                    if (floatRef.element == 0.0f) {
                        MutableVector mutableVector2 = infiniteTransition2._animations;
                        int size2 = mutableVector2.getSize();
                        if (size2 > 0) {
                            Object[] content2 = mutableVector2.getContent();
                            do {
                                ((InfiniteTransition.TransitionAnimationState) content2[i2]).skipToEnd$animation_core_release();
                                i2++;
                            } while (i2 < size2);
                            return;
                        }
                        return;
                    }
                    infiniteTransition2.onFrame((long) ((jLongValue - infiniteTransition2.startTimeNanos) / floatRef.element));
                }
            }, this) != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    /* compiled from: InfiniteTransition.kt */
    @Metadata(m513d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m514d2 = {"<anonymous>", "", "it", ""}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
    @DebugMetadata(m532c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", m533f = "InfiniteTransition.kt", m534i = {}, m535l = {}, m536m = "invokeSuspend", m537n = {}, m538s = {})
    /* renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$1$3 */
    static final class C04483 extends SuspendLambda implements Function2<Float, Continuation<? super Boolean>, Object> {
        /* synthetic */ float F$0;
        int label;

        C04483(Continuation<? super C04483> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C04483 c04483 = new C04483(continuation);
            c04483.F$0 = ((Number) obj).floatValue();
            return c04483;
        }

        public final Object invoke(float f, Continuation<? super Boolean> continuation) {
            return ((C04483) create(Float.valueOf(f), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Float f, Continuation<? super Boolean> continuation) {
            return invoke(f.floatValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.F$0 > 0.0f);
        }
    }
}
