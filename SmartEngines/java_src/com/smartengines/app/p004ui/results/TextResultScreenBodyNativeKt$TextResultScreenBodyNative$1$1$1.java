package com.smartengines.app.p004ui.results;

import android.util.Log;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.MutableState;
import com.smartengines.engine.text.TextResultChunk;
import com.smartengines.engine.text.TextResultData;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.eac.EACTags;

/* compiled from: TextResultScreenBodyNative.kt */
@Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
@DebugMetadata(m532c = "com.smartengines.app.ui.results.TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1", m533f = "TextResultScreenBodyNative.kt", m534i = {}, m535l = {EACTags.HISTORICAL_BYTES}, m536m = "invokeSuspend", m537n = {}, m538s = {})
/* loaded from: classes3.dex */
final class TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ HashMap<Integer, Float> $dataChunkPositions;
    final /* synthetic */ Ref.FloatRef $imageScale;
    final /* synthetic */ TextResultData $resultData;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ MutableState<TextResultChunk> $selectedChunk;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1(TextResultData textResultData, Ref.FloatRef floatRef, ScrollState scrollState, MutableState<TextResultChunk> mutableState, HashMap<Integer, Float> map, CoroutineScope coroutineScope, Continuation<? super TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1> continuation) {
        super(2, continuation);
        this.$resultData = textResultData;
        this.$imageScale = floatRef;
        this.$scrollState = scrollState;
        this.$selectedChunk = mutableState;
        this.$dataChunkPositions = map;
        this.$coroutineScope = coroutineScope;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1 textResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1 = new TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1(this.$resultData, this.$imageScale, this.$scrollState, this.$selectedChunk, this.$dataChunkPositions, this.$coroutineScope, continuation);
        textResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1.L$0 = obj;
        return textResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            final TextResultData textResultData = this.$resultData;
            final Ref.FloatRef floatRef = this.$imageScale;
            final ScrollState scrollState = this.$scrollState;
            final MutableState<TextResultChunk> mutableState = this.$selectedChunk;
            final HashMap<Integer, Float> map = this.$dataChunkPositions;
            final CoroutineScope coroutineScope = this.$coroutineScope;
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new Function1() { // from class: com.smartengines.app.ui.results.TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TextResultScreenBodyNativeKt$TextResultScreenBodyNative$1$1$1.invokeSuspend$lambda$2(textResultData, floatRef, scrollState, mutableState, map, coroutineScope, (Offset) obj2);
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
    public static final Unit invokeSuspend$lambda$2(TextResultData textResultData, Ref.FloatRef floatRef, ScrollState scrollState, MutableState mutableState, HashMap map, CoroutineScope coroutineScope, Offset offset) {
        Integer numM7670findChunkIndexByCoordinatesUv8p0NA = TextResultScreenBodyNativeKt.m7670findChunkIndexByCoordinatesUv8p0NA(textResultData, Offset.m4349divtuRUvjQ(offset.getPackedValue(), floatRef.element));
        Log.e("myapp.TextResultScr", " ----> " + offset + " of " + scrollState.getViewportSize());
        if (numM7670findChunkIndexByCoordinatesUv8p0NA != null) {
            numM7670findChunkIndexByCoordinatesUv8p0NA.intValue();
            mutableState.setValue(textResultData.getChunks().get(numM7670findChunkIndexByCoordinatesUv8p0NA.intValue()));
            Float f = (Float) map.get(numM7670findChunkIndexByCoordinatesUv8p0NA);
            if (f != null) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C3190x8f273eb6(scrollState, f.floatValue(), null), 3, null);
            }
        }
        return Unit.INSTANCE;
    }
}
