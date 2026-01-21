package com.smartengines.app.p004ui.results;

import android.util.Size;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.MutableState;
import com.smartengines.engine.text.TextResultChunk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TextResultScreenBodyNative.kt */
@Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
@DebugMetadata(m532c = "com.smartengines.app.ui.results.TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$3$1$1", m533f = "TextResultScreenBodyNative.kt", m534i = {}, m535l = {127}, m536m = "invokeSuspend", m537n = {}, m538s = {})
/* renamed from: com.smartengines.app.ui.results.TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$3$1$1 */
/* loaded from: classes3.dex */
final class C3191xe1df21de extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TextResultChunk $chunk;
    final /* synthetic */ Ref.FloatRef $imageScale;
    final /* synthetic */ Size $imageSize;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ MutableState<TextResultChunk> $selectedChunk;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3191xe1df21de(MutableState<TextResultChunk> mutableState, TextResultChunk textResultChunk, ScrollState scrollState, Size size, Ref.FloatRef floatRef, Continuation<? super C3191xe1df21de> continuation) {
        super(2, continuation);
        this.$selectedChunk = mutableState;
        this.$chunk = textResultChunk;
        this.$scrollState = scrollState;
        this.$imageSize = size;
        this.$imageScale = floatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C3191xe1df21de(this.$selectedChunk, this.$chunk, this.$scrollState, this.$imageSize, this.$imageScale, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C3191xe1df21de) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.$selectedChunk.setValue(this.$chunk);
            this.label = 1;
            if (ScrollState.animateScrollTo$default(this.$scrollState, (int) ((this.$chunk.getGeometry().getBounds().top - (this.$imageSize.getHeight() / 2)) * this.$imageScale.element), null, this, 2, null) == coroutine_suspended) {
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
