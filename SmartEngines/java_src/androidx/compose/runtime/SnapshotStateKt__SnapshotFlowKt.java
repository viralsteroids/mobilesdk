package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.jmrtd.lds.LDSFile;

/* compiled from: SnapshotFlow.kt */
@Metadata(m513d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0000\u0010\u0002*\u0002H\u0007\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\b\u001a\u0002H\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\r\u001a%\u0010\u000e\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013H\u0002¢\u0006\u0002\b\u0014¨\u0006\u0015"}, m514d2 = {"snapshotFlow", "Lkotlinx/coroutines/flow/Flow;", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function0;", "collectAsState", "Landroidx/compose/runtime/State;", "R", "initial", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Lkotlinx/coroutines/flow/StateFlow;", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "intersects", "", "Landroidx/collection/MutableScatterSet;", "", "set", "", "intersects$SnapshotStateKt__SnapshotFlowKt", "runtime_release"}, m515k = 5, m516mv = {1, 8, 0}, m518xi = 48, m519xs = "androidx/compose/runtime/SnapshotStateKt")
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {
    public static final <T> State<T> collectAsState(StateFlow<? extends T> stateFlow, CoroutineContext coroutineContext, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -1439883919, "C(collectAsState)49@1909L30:SnapshotFlow.kt#9igjgp");
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1439883919, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:49)");
        }
        State<T> stateCollectAsState = SnapshotStateKt.collectAsState(stateFlow, stateFlow.getValue(), coroutineContext2, composer, (i & 14) | ((i << 3) & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateCollectAsState;
    }

    public static final <T extends R, R> State<R> collectAsState(Flow<? extends T> flow, R r, CoroutineContext coroutineContext, Composer composer, int i, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, -606625098, "C(collectAsState)P(1)65@2578L149,65@2541L186:SnapshotFlow.kt#9igjgp");
        if ((i2 & 2) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-606625098, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:65)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, -498556383, "CC(remember):SnapshotFlow.kt#9igjgp");
        boolean zChangedInstance = composer.changedInstance(coroutineContext2) | composer.changedInstance(flow);
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1$1RememberedValue = composer.rememberedValue();
        if (zChangedInstance || snapshotStateKt__SnapshotFlowKt$collectAsState$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
            snapshotStateKt__SnapshotFlowKt$collectAsState$1$1RememberedValue = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(coroutineContext2, flow, null);
            composer.updateRememberedValue(snapshotStateKt__SnapshotFlowKt$collectAsState$1$1RememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        State<R> stateProduceState = SnapshotStateKt.produceState(r, flow, coroutineContext2, (Function2) snapshotStateKt__SnapshotFlowKt$collectAsState$1$1RememberedValue, composer, ((i >> 3) & 14) | ((i << 3) & LDSFile.EF_DG16_TAG) | (i & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateProduceState;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SnapshotFlow.kt */
    @Metadata(m513d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, m514d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;"}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
    @DebugMetadata(m532c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", m533f = "SnapshotFlow.kt", m534i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, m535l = {CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256}, m536m = "invokeSuspend", m537n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, m538s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 */
    static final class C16971<T> extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<T> $block;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C16971(Function0<? extends T> function0, Continuation<? super C16971> continuation) {
            super(2, continuation);
            this.$block = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C16971 c16971 = new C16971(this.$block, continuation);
            c16971.L$0 = obj;
            return c16971;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
            return ((C16971) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:31:0x00d5, B:35:0x00de], limit reached: 74 */
        /* JADX WARN: Path cross not found for [B:39:0x00ed, B:54:0x012e], limit reached: 74 */
        /* JADX WARN: Path cross not found for [B:54:0x012e, B:39:0x00ed], limit reached: 74 */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ed A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #1 {all -> 0x0052, blocks: (B:13:0x004d, B:29:0x00d1, B:31:0x00d5, B:36:0x00df, B:39:0x00ed, B:43:0x0103, B:45:0x010c, B:52:0x012a, B:53:0x012d, B:40:0x00f8, B:42:0x0100, B:49:0x0125, B:50:0x0128), top: B:66:0x004d, inners: #4 }] */
        /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v5 */
        /* JADX WARN: Type inference failed for: r10v6 */
        /* JADX WARN: Type inference failed for: r10v8, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r11v1 */
        /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r11v5 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            ObserverHandle observerHandleRegisterApplyObserver;
            ?? r10;
            final MutableScatterSet mutableScatterSet;
            Function1<Object, Unit> function1;
            final Channel channelChannel$default;
            Object objInvoke;
            ObserverHandle observerHandle;
            ?? r11;
            MutableScatterSet mutableScatterSet2;
            Function1<Object, Unit> function12;
            Channel channel;
            Object obj2;
            int i;
            Set set;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            int i3 = 0;
            int i4 = 1;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    r10 = (FlowCollector) this.L$0;
                    mutableScatterSet = new MutableScatterSet(i3, i4, null);
                    function1 = new Function1<Object, Unit>() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$readObserver$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Object obj3) {
                            invoke2(obj3);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Object obj3) {
                            if (obj3 instanceof StateObjectImpl) {
                                ReaderKind.Companion companion = ReaderKind.INSTANCE;
                                ((StateObjectImpl) obj3).m4199recordReadInh_f27i8$runtime_release(ReaderKind.m4186constructorimpl(4));
                            }
                            mutableScatterSet.add(obj3);
                        }
                    };
                    channelChannel$default = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                    observerHandleRegisterApplyObserver = Snapshot.INSTANCE.registerApplyObserver(new Function2<Set<? extends Object>, Snapshot, Unit>() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Set<? extends Object> set2, Snapshot snapshot) {
                            invoke2(set2, snapshot);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Set<? extends Object> set2, Snapshot snapshot) {
                            if (!(set2 instanceof ScatterSetWrapper)) {
                                Set<? extends Object> set3 = set2;
                                if ((set3 instanceof Collection) && set3.isEmpty()) {
                                    return;
                                }
                                for (Object obj3 : set3) {
                                    if (obj3 instanceof StateObjectImpl) {
                                        ReaderKind.Companion companion = ReaderKind.INSTANCE;
                                        if (((StateObjectImpl) obj3).m4198isReadInh_f27i8$runtime_release(ReaderKind.m4186constructorimpl(4))) {
                                        }
                                    }
                                }
                                return;
                            }
                            ScatterSet set$runtime_release = ((ScatterSetWrapper) set2).getSet$runtime_release();
                            Object[] objArr = set$runtime_release.elements;
                            long[] jArr = set$runtime_release.metadata;
                            int length = jArr.length - 2;
                            if (length < 0) {
                                return;
                            }
                            int i5 = 0;
                            loop0: while (true) {
                                long j = jArr[i5];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                                    for (int i7 = 0; i7 < i6; i7++) {
                                        if ((255 & j) < 128) {
                                            Object obj4 = objArr[(i5 << 3) + i7];
                                            if (!(obj4 instanceof StateObjectImpl)) {
                                                break loop0;
                                            }
                                            ReaderKind.Companion companion2 = ReaderKind.INSTANCE;
                                            if (((StateObjectImpl) obj4).m4198isReadInh_f27i8$runtime_release(ReaderKind.m4186constructorimpl(4))) {
                                                break loop0;
                                            }
                                        }
                                        j >>= 8;
                                    }
                                    if (i6 != 8) {
                                        return;
                                    }
                                }
                                if (i5 == length) {
                                    return;
                                } else {
                                    i5++;
                                }
                            }
                            channelChannel$default.mo9352trySendJP2dKIU(set2);
                        }
                    });
                    Snapshot snapshotTakeSnapshot = Snapshot.INSTANCE.takeSnapshot(function1);
                    Function0<T> function0 = this.$block;
                    try {
                        Snapshot snapshotMakeCurrent = snapshotTakeSnapshot.makeCurrent();
                        try {
                            objInvoke = function0.invoke();
                            snapshotTakeSnapshot.dispose();
                            this.L$0 = r10;
                            this.L$1 = mutableScatterSet;
                            this.L$2 = function1;
                            this.L$3 = channelChannel$default;
                            this.L$4 = observerHandleRegisterApplyObserver;
                            this.L$5 = objInvoke;
                            this.label = 1;
                            if (r10.emit(objInvoke, this) == coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        } finally {
                        }
                    } finally {
                    }
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        i = this.I$0;
                        obj2 = this.L$5;
                        observerHandle = (ObserverHandle) this.L$4;
                        channel = (Channel) this.L$3;
                        function12 = (Function1) this.L$2;
                        mutableScatterSet2 = (MutableScatterSet) this.L$1;
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            r11 = flowCollector;
                            set = (Set) obj;
                            do {
                                i = (i == 0 || SnapshotStateKt__SnapshotFlowKt.intersects$SnapshotStateKt__SnapshotFlowKt(mutableScatterSet2, set)) ? 1 : 0;
                                set = (Set) ChannelResult.m9367getOrNullimpl(channel.mo9357tryReceivePtdJZtk());
                            } while (set != null);
                            if (i != 0) {
                                mutableScatterSet2.clear();
                                Snapshot snapshotTakeSnapshot2 = Snapshot.INSTANCE.takeSnapshot(function12);
                                Function0<T> function02 = this.$block;
                                try {
                                    try {
                                        objInvoke = function02.invoke();
                                        snapshotTakeSnapshot2.dispose();
                                        if (!Intrinsics.areEqual(objInvoke, obj2)) {
                                            this.L$0 = r11;
                                            this.L$1 = mutableScatterSet2;
                                            this.L$2 = function12;
                                            this.L$3 = channel;
                                            this.L$4 = observerHandle;
                                            this.L$5 = objInvoke;
                                            this.label = 3;
                                            if (r11.emit(objInvoke, this) != coroutine_suspended) {
                                                observerHandleRegisterApplyObserver = observerHandle;
                                                channelChannel$default = channel;
                                                function1 = function12;
                                                mutableScatterSet = mutableScatterSet2;
                                                r10 = r11;
                                            }
                                            return coroutine_suspended;
                                        }
                                    } finally {
                                    }
                                    Snapshot snapshotMakeCurrent2 = snapshotTakeSnapshot2.makeCurrent();
                                } finally {
                                }
                            }
                            objInvoke = obj2;
                            observerHandleRegisterApplyObserver = observerHandle;
                            channelChannel$default = channel;
                            function1 = function12;
                            mutableScatterSet = mutableScatterSet2;
                            r10 = r11;
                        } catch (Throwable th) {
                            th = th;
                            observerHandleRegisterApplyObserver = observerHandle;
                            observerHandleRegisterApplyObserver.dispose();
                            throw th;
                        }
                    } else if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                objInvoke = this.L$5;
                observerHandleRegisterApplyObserver = (ObserverHandle) this.L$4;
                channelChannel$default = (Channel) this.L$3;
                function1 = (Function1) this.L$2;
                mutableScatterSet = (MutableScatterSet) this.L$1;
                r10 = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = r10;
                this.L$1 = mutableScatterSet;
                this.L$2 = function1;
                this.L$3 = channelChannel$default;
                this.L$4 = observerHandleRegisterApplyObserver;
                this.L$5 = objInvoke;
                this.I$0 = 0;
                this.label = 2;
                obj = channelChannel$default.receive(this);
                if (obj != coroutine_suspended) {
                    r11 = r10;
                    mutableScatterSet2 = mutableScatterSet;
                    function12 = function1;
                    channel = channelChannel$default;
                    observerHandle = observerHandleRegisterApplyObserver;
                    obj2 = objInvoke;
                    i = 0;
                    set = (Set) obj;
                    do {
                        if (i == 0) {
                        }
                        set = (Set) ChannelResult.m9367getOrNullimpl(channel.mo9357tryReceivePtdJZtk());
                    } while (set != null);
                    if (i != 0) {
                    }
                    objInvoke = obj2;
                    observerHandleRegisterApplyObserver = observerHandle;
                    channelChannel$default = channel;
                    function1 = function12;
                    mutableScatterSet = mutableScatterSet2;
                    r10 = r11;
                    this.L$0 = r10;
                    this.L$1 = mutableScatterSet;
                    this.L$2 = function1;
                    this.L$3 = channelChannel$default;
                    this.L$4 = observerHandleRegisterApplyObserver;
                    this.L$5 = objInvoke;
                    this.I$0 = 0;
                    this.label = 2;
                    obj = channelChannel$default.receive(this);
                    if (obj != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static final <T> Flow<T> snapshotFlow(Function0<? extends T> function0) {
        return FlowKt.flow(new C16971(function0, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean intersects$SnapshotStateKt__SnapshotFlowKt(MutableScatterSet<Object> mutableScatterSet, Set<? extends Object> set) {
        MutableScatterSet<Object> mutableScatterSet2 = mutableScatterSet;
        Object[] objArr = mutableScatterSet2.elements;
        long[] jArr = mutableScatterSet2.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && set.contains(objArr[(i << 3) + i3])) {
                            return true;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }
}
