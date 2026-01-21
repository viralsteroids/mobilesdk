package com.smartengines.engine;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.crypto.tls.CipherSuite;

/* compiled from: ImageProcessor.kt */
@Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
@DebugMetadata(m532c = "com.smartengines.engine.ImageProcessor$startProcessing$1$1", m533f = "ImageProcessor.kt", m534i = {}, m535l = {CipherSuite.TLS_DH_DSS_WITH_AES_128_CBC_SHA256}, m536m = "invokeSuspend", m537n = {}, m538s = {})
/* loaded from: classes3.dex */
final class ImageProcessor$startProcessing$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Engine $engine;
    final /* synthetic */ Bitmap $photo;
    final /* synthetic */ SessionType $sessionType;
    final /* synthetic */ RecognitionTarget $target;
    int label;
    final /* synthetic */ ImageProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageProcessor$startProcessing$1$1(ImageProcessor imageProcessor, Engine engine, RecognitionTarget recognitionTarget, SessionType sessionType, Bitmap bitmap, Continuation<? super ImageProcessor$startProcessing$1$1> continuation) {
        super(2, continuation);
        this.this$0 = imageProcessor;
        this.$engine = engine;
        this.$target = recognitionTarget;
        this.$sessionType = sessionType;
        this.$photo = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ImageProcessor$startProcessing$1$1(this.this$0, this.$engine, this.$target, this.$sessionType, this.$photo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ImageProcessor$startProcessing$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (this.this$0.process(this.$engine, this.$target, this.$sessionType, this.$photo, this) == coroutine_suspended) {
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
