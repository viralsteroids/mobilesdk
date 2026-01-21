package com.smartengines.app.p004ui.results;

import android.util.Size;
import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.MutableState;
import com.smartengines.engine.text.TextResultChunk;
import com.smartengines.visualization.QuadPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TextResultScreenSplit.kt */
@Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
@DebugMetadata(m532c = "com.smartengines.app.ui.results.TextResultScreenSplitKt$TextResultScreen13$1$1$4$1$1", m533f = "TextResultScreenSplit.kt", m534i = {}, m535l = {370}, m536m = "invokeSuspend", m537n = {}, m538s = {})
/* loaded from: classes3.dex */
final class TextResultScreenSplitKt$TextResultScreen13$1$1$4$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TextResultChunk $chunk;
    final /* synthetic */ Size $imageSize;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ MutableState<TextResultChunk> $selectedChunk;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextResultScreenSplitKt$TextResultScreen13$1$1$4$1$1(MutableState<TextResultChunk> mutableState, TextResultChunk textResultChunk, ScrollState scrollState, Size size, Continuation<? super TextResultScreenSplitKt$TextResultScreen13$1$1$4$1$1> continuation) {
        super(2, continuation);
        this.$selectedChunk = mutableState;
        this.$chunk = textResultChunk;
        this.$scrollState = scrollState;
        this.$imageSize = size;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TextResultScreenSplitKt$TextResultScreen13$1$1$4$1$1(this.$selectedChunk, this.$chunk, this.$scrollState, this.$imageSize, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TextResultScreenSplitKt$TextResultScreen13$1$1$4$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.$selectedChunk.setValue(this.$chunk);
            this.label = 1;
            if (ScrollState.animateScrollTo$default(this.$scrollState, ((int) ((QuadPoint) CollectionsKt.first((List) this.$chunk.getGeometry().getPoints())).getY()) - (this.$imageSize.getHeight() / 2), null, this, 2, null) == coroutine_suspended) {
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
