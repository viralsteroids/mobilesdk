package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p000ui.input.pointer.PointerEvent;
import androidx.compose.p000ui.input.pointer.PointerEventPass;
import androidx.compose.p000ui.input.pointer.PointerId;
import androidx.compose.p000ui.input.pointer.PointerInputChange;
import androidx.compose.p000ui.input.pointer.PointerInputScope;
import androidx.compose.p000ui.input.pointer.PointerType;
import androidx.compose.p000ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.crypto.tls.CipherSuite;

/* compiled from: StylusHandwriting.kt */
@Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m514d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
@DebugMetadata(m532c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1", m533f = "StylusHandwriting.kt", m534i = {}, m535l = {CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA}, m536m = "invokeSuspend", m537n = {}, m538s = {})
/* loaded from: classes.dex */
final class StylusHandwritingNode$suspendingPointerInputModifierNode$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StylusHandwritingNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StylusHandwritingNode$suspendingPointerInputModifierNode$1(StylusHandwritingNode stylusHandwritingNode, Continuation<? super StylusHandwritingNode$suspendingPointerInputModifierNode$1> continuation) {
        super(2, continuation);
        this.this$0 = stylusHandwritingNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        StylusHandwritingNode$suspendingPointerInputModifierNode$1 stylusHandwritingNode$suspendingPointerInputModifierNode$1 = new StylusHandwritingNode$suspendingPointerInputModifierNode$1(this.this$0, continuation);
        stylusHandwritingNode$suspendingPointerInputModifierNode$1.L$0 = obj;
        return stylusHandwritingNode$suspendingPointerInputModifierNode$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((StylusHandwritingNode$suspendingPointerInputModifierNode$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: StylusHandwriting.kt */
    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m514d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m515k = 3, m516mv = {1, 8, 0}, m518xi = 48)
    @DebugMetadata(m532c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", m533f = "StylusHandwriting.kt", m534i = {0, 1, 1, 1, 2, 2}, m535l = {134, 158, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256}, m536m = "invokeSuspend", m537n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "firstDown", "pass", "$this$awaitEachGesture", "firstDown"}, m538s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1 */
    static final class C10151 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ StylusHandwritingNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10151(StylusHandwritingNode stylusHandwritingNode, Continuation<? super C10151> continuation) {
            super(2, continuation);
            this.this$0 = stylusHandwritingNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C10151 c10151 = new C10151(this.this$0, continuation);
            c10151.L$0 = obj;
            return c10151;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C10151) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
        
            if (r8 == r1) goto L70;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
        
            if (r10 != r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0195, code lost:
        
            if (r5 != r1) goto L71;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0197, code lost:
        
            return r1;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00f0 -> B:42:0x00f4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0195 -> B:71:0x0198). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            Object objAwaitFirstDown;
            AwaitPointerEventScope awaitPointerEventScope2;
            PointerEventPass pointerEventPass;
            PointerInputChange pointerInputChange;
            PointerInputChange pointerInputChange2;
            Object objAwaitPointerEvent;
            PointerInputChange pointerInputChange3;
            PointerInputChange pointerInputChange4;
            PointerInputChange pointerInputChange5;
            AwaitPointerEventScope awaitPointerEventScope3;
            PointerInputChange pointerInputChange6;
            Object objAwaitPointerEvent2;
            PointerInputChange pointerInputChange7;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            int i2 = 2;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                objAwaitFirstDown = TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, true, PointerEventPass.Initial, this);
            } else if (i == 1) {
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                objAwaitFirstDown = obj;
            } else if (i == 2) {
                pointerEventPass = (PointerEventPass) this.L$2;
                pointerInputChange = (PointerInputChange) this.L$1;
                awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                objAwaitPointerEvent = obj;
                pointerInputChange2 = null;
                List<PointerInputChange> changes = ((PointerEvent) objAwaitPointerEvent).getChanges();
                int size = changes.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        pointerInputChange3 = pointerInputChange;
                        pointerInputChange4 = null;
                        break;
                    }
                    pointerInputChange4 = changes.get(i3);
                    PointerInputChange pointerInputChange8 = pointerInputChange4;
                    if (!pointerInputChange8.isConsumed()) {
                        pointerInputChange3 = pointerInputChange;
                        if (PointerId.m5784equalsimpl0(pointerInputChange8.getId(), pointerInputChange3.getId()) && pointerInputChange8.getPressed()) {
                            break;
                        }
                    } else {
                        pointerInputChange3 = pointerInputChange;
                    }
                    i3++;
                    pointerInputChange = pointerInputChange3;
                }
                PointerInputChange pointerInputChange9 = pointerInputChange4;
                if (pointerInputChange9 != null && pointerInputChange9.getUptimeMillis() - pointerInputChange3.getUptimeMillis() < awaitPointerEventScope2.getViewConfiguration().getLongPressTimeoutMillis()) {
                    if (Offset.m4352getDistanceimpl(Offset.m4358minusMKHz9U(pointerInputChange9.getPosition(), pointerInputChange3.getPosition())) > awaitPointerEventScope2.getViewConfiguration().getHandwritingSlop()) {
                        pointerInputChange2 = pointerInputChange9;
                    } else {
                        pointerInputChange = pointerInputChange3;
                        i2 = 2;
                        this.L$0 = awaitPointerEventScope2;
                        this.L$1 = pointerInputChange;
                        this.L$2 = pointerEventPass;
                        this.label = i2;
                        objAwaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, this);
                    }
                }
                if (pointerInputChange2 == null || !this.this$0.getOnHandwritingSlopExceeded().invoke().booleanValue()) {
                    return Unit.INSTANCE;
                }
                pointerInputChange2.consume();
                pointerInputChange5 = pointerInputChange3;
                awaitPointerEventScope3 = awaitPointerEventScope2;
                this.L$0 = awaitPointerEventScope3;
                this.L$1 = pointerInputChange5;
                pointerInputChange6 = null;
                this.L$2 = null;
                this.label = 3;
                objAwaitPointerEvent2 = awaitPointerEventScope3.awaitPointerEvent(PointerEventPass.Initial, this);
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pointerInputChange5 = (PointerInputChange) this.L$1;
                awaitPointerEventScope3 = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                objAwaitPointerEvent2 = obj;
                pointerInputChange6 = null;
                List<PointerInputChange> changes2 = ((PointerEvent) objAwaitPointerEvent2).getChanges();
                int size2 = changes2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        pointerInputChange7 = pointerInputChange6;
                        break;
                    }
                    pointerInputChange7 = changes2.get(i4);
                    PointerInputChange pointerInputChange10 = pointerInputChange7;
                    if (!pointerInputChange10.isConsumed() && PointerId.m5784equalsimpl0(pointerInputChange10.getId(), pointerInputChange5.getId()) && pointerInputChange10.getPressed()) {
                        break;
                    }
                    i4++;
                }
                PointerInputChange pointerInputChange11 = pointerInputChange7;
                if (pointerInputChange11 == null) {
                    return Unit.INSTANCE;
                }
                pointerInputChange11.consume();
                this.L$0 = awaitPointerEventScope3;
                this.L$1 = pointerInputChange5;
                pointerInputChange6 = null;
                this.L$2 = null;
                this.label = 3;
                objAwaitPointerEvent2 = awaitPointerEventScope3.awaitPointerEvent(PointerEventPass.Initial, this);
            }
            PointerInputChange pointerInputChange12 = (PointerInputChange) objAwaitFirstDown;
            if (!PointerType.m5874equalsimpl0(pointerInputChange12.getType(), PointerType.INSTANCE.m5880getStylusT8wyACA()) && !PointerType.m5874equalsimpl0(pointerInputChange12.getType(), PointerType.INSTANCE.m5878getEraserT8wyACA())) {
                return Unit.INSTANCE;
            }
            PointerEventPass pointerEventPass2 = (this.this$0.focused || (Offset.m4354getXimpl(pointerInputChange12.getPosition()) >= 0.0f && Offset.m4354getXimpl(pointerInputChange12.getPosition()) < ((float) IntSize.m7225getWidthimpl(awaitPointerEventScope.mo5713getSizeYbymL2g())) && Offset.m4355getYimpl(pointerInputChange12.getPosition()) >= 0.0f && Offset.m4355getYimpl(pointerInputChange12.getPosition()) < ((float) IntSize.m7224getHeightimpl(awaitPointerEventScope.mo5713getSizeYbymL2g())))) ? PointerEventPass.Initial : PointerEventPass.Main;
            awaitPointerEventScope2 = awaitPointerEventScope;
            pointerEventPass = pointerEventPass2;
            pointerInputChange = pointerInputChange12;
            pointerInputChange2 = null;
            this.L$0 = awaitPointerEventScope2;
            this.L$1 = pointerInputChange;
            this.L$2 = pointerEventPass;
            this.label = i2;
            objAwaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, this);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture((PointerInputScope) this.L$0, new C10151(this.this$0, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
