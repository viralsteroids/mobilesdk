package com.smartengines.app.p004ui.results;

import android.util.Log;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: TextResultScreenSplit.kt */
@Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
@DebugMetadata(m532c = "com.smartengines.app.ui.results.TextResultScreenSplitKt$TextResultScreen13$1$1$1", m533f = "TextResultScreenSplit.kt", m534i = {}, m535l = {322}, m536m = "invokeSuspend", m537n = {}, m538s = {})
/* loaded from: classes3.dex */
final class TextResultScreenSplitKt$TextResultScreen13$1$1$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    TextResultScreenSplitKt$TextResultScreen13$1$1$1(Continuation<? super TextResultScreenSplitKt$TextResultScreen13$1$1$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TextResultScreenSplitKt$TextResultScreen13$1$1$1 textResultScreenSplitKt$TextResultScreen13$1$1$1 = new TextResultScreenSplitKt$TextResultScreen13$1$1$1(continuation);
        textResultScreenSplitKt$TextResultScreen13$1$1$1.L$0 = obj;
        return textResultScreenSplitKt$TextResultScreen13$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((TextResultScreenSplitKt$TextResultScreen13$1$1$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default((PointerInputScope) this.L$0, null, null, null, new Function1() { // from class: com.smartengines.app.ui.results.TextResultScreenSplitKt$TextResultScreen13$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TextResultScreenSplitKt$TextResultScreen13$1$1$1.invokeSuspend$lambda$0((Offset) obj2);
                }
            }, this, 7, null) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(Offset offset) {
        Log.e("myapp.TextResultScr", " ----> " + offset);
        return Unit.INSTANCE;
    }
}
