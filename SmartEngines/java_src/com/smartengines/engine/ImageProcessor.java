package com.smartengines.engine;

import android.graphics.Bitmap;
import android.util.Log;
import android.util.Size;
import androidx.compose.runtime.ComposerKt;
import com.smartengines.camera.Frame;
import com.smartengines.engine.ImageProcessingState;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.bouncycastle.crypto.tls.CipherSuite;

/* compiled from: ImageProcessor.kt */
@Metadata(m513d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u0017\u001a\u00020\fH\u0002J(\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"J\u000e\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\fJ\u0006\u0010'\u001a\u00020\fJ\u0006\u0010(\u001a\u00020\fJ0\u0010/\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0082@¢\u0006\u0002\u00100R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010-\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, m514d2 = {"Lcom/smartengines/engine/ImageProcessor;", "", "sessionSettingsLogger", "Lcom/smartengines/engine/SessionSettingsLogger;", "<init>", "(Lcom/smartengines/engine/SessionSettingsLogger;)V", "getSessionSettingsLogger", "()Lcom/smartengines/engine/SessionSettingsLogger;", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/smartengines/engine/ImageProcessingState;", "setState", "", "newState", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "value", "Lcom/smartengines/engine/Session;", "session", "getSession", "()Lcom/smartengines/engine/Session;", "deleteSession", "stopProcessingFlag", "", "startProcessing", "engine", "Lcom/smartengines/engine/Engine;", "target", "Lcom/smartengines/engine/RecognitionTarget;", "sessionType", "Lcom/smartengines/engine/SessionType;", "photo", "Landroid/graphics/Bitmap;", "addFrame", "frame", "Lcom/smartengines/camera/Frame;", "restart", "clear", "stopProcessing", "scope", "Lkotlinx/coroutines/CoroutineScope;", "processingJob", "Lkotlinx/coroutines/Job;", "frameChannel", "Lkotlinx/coroutines/channels/Channel;", "process", "(Lcom/smartengines/engine/Engine;Lcom/smartengines/engine/RecognitionTarget;Lcom/smartengines/engine/SessionType;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "engine_release"}, m515k = 1, m516mv = {2, 0, 0}, m518xi = 48)
/* loaded from: classes3.dex */
public final class ImageProcessor {
    private final MutableStateFlow<ImageProcessingState> _state;
    private Channel<Frame> frameChannel;
    private Job processingJob;
    private final CoroutineScope scope;
    private Session session;
    private final SessionSettingsLogger sessionSettingsLogger;
    private final StateFlow<ImageProcessingState> state;
    private boolean stopProcessingFlag;

    /* compiled from: ImageProcessor.kt */
    @Metadata(m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.engine.ImageProcessor", m533f = "ImageProcessor.kt", m534i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, m535l = {CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, ComposerKt.providerKey}, m536m = "process", m537n = {"this", "target", "sessionType", "photo", "session", "this", "target", "sessionType", "photo", "session", "this", "sessionType", "session", "framesLimit", "framesProcessed", "this", "sessionType", "session", "lastProcessedImage", "framesLimit", "framesProcessed"}, m538s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
    /* renamed from: com.smartengines.engine.ImageProcessor$process$1 */
    static final class C32921 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        C32921(Continuation<? super C32921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImageProcessor.this.process(null, null, null, null, this);
        }
    }

    public ImageProcessor(SessionSettingsLogger sessionSettingsLogger) {
        this.sessionSettingsLogger = sessionSettingsLogger;
        MutableStateFlow<ImageProcessingState> MutableStateFlow = StateFlowKt.MutableStateFlow(ImageProcessingState.WAITING.INSTANCE);
        this._state = MutableStateFlow;
        this.state = FlowKt.asStateFlow(MutableStateFlow);
        this.scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
    }

    public final SessionSettingsLogger getSessionSettingsLogger() {
        return this.sessionSettingsLogger;
    }

    private final void setState(ImageProcessingState newState) {
        Log.w("engine.ImageProcessor", " >>> setState: " + newState);
        this._state.setValue(newState);
    }

    public final StateFlow<ImageProcessingState> getState() {
        return this.state;
    }

    public final Session getSession() {
        return this.session;
    }

    private final void deleteSession() {
        Session session = this.session;
        if (session != null) {
            session.delete();
        }
        this.session = null;
    }

    public final void startProcessing(Engine engine, RecognitionTarget target, SessionType sessionType, Bitmap photo) {
        Intrinsics.checkNotNullParameter(engine, "engine");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        Log.w("engine.ImageProcessor", " ---> startProcessing");
        ImageProcessingState value = this.state.getValue();
        if (value instanceof ImageProcessingState.WAITING) {
            this.processingJob = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new ImageProcessor$startProcessing$1$1(this, engine, target, sessionType, photo, null), 3, null);
        } else {
            Log.e("engine.ImageProcessor", "startProcessing: incorrect state " + value);
        }
    }

    /* compiled from: ImageProcessor.kt */
    @Metadata(m513d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m514d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m515k = 3, m516mv = {2, 0, 0}, m518xi = 48)
    @DebugMetadata(m532c = "com.smartengines.engine.ImageProcessor$addFrame$1", m533f = "ImageProcessor.kt", m534i = {}, m535l = {75}, m536m = "invokeSuspend", m537n = {}, m538s = {})
    /* renamed from: com.smartengines.engine.ImageProcessor$addFrame$1 */
    static final class C32911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Frame $frame;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32911(Frame frame, Continuation<? super C32911> continuation) {
            super(2, continuation);
            this.$frame = frame;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ImageProcessor.this.new C32911(this.$frame, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Log.w("engine.ImageProcessor", " ---> onFrame");
                    Channel channel = ImageProcessor.this.frameChannel;
                    Intrinsics.checkNotNull(channel);
                    this.label = 1;
                    if (channel.send(this.$frame, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception unused) {
                this.$frame.close();
            }
            return Unit.INSTANCE;
        }
    }

    public final void addFrame(Frame frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C32911(frame, null), 3, null);
    }

    public final void restart() {
        ImageProcessingState.ERROR error;
        Log.w("engine.ImageProcessor", " ---> restart");
        if (this.state.getValue() instanceof ImageProcessingState.FINISHED) {
            error = ImageProcessingState.WAITING.INSTANCE;
        } else {
            error = new ImageProcessingState.ERROR(new Exception("wrong ImageProcessor state"));
        }
        setState(error);
    }

    public final void clear() {
        Log.w("engine.ImageProcessor", " ---> clear");
        if (Intrinsics.areEqual(this.state.getValue(), ImageProcessingState.WAITING.INSTANCE)) {
            return;
        }
        setState(ImageProcessingState.WAITING.INSTANCE);
        Job job = this.processingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        } else {
            deleteSession();
        }
    }

    public final void stopProcessing() {
        Log.w("engine.ImageProcessor", " ---> stopProcessing");
        this.stopProcessingFlag = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0226, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1, r5) != r6) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:10:0x0036, B:37:0x00cc], limit reached: 98 */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014f A[Catch: Exception -> 0x00c5, CancellationException -> 0x00c9, TRY_LEAVE, TryCatch #5 {CancellationException -> 0x00c9, Exception -> 0x00c5, blocks: (B:32:0x00bb, B:51:0x013e, B:55:0x0148, B:57:0x014f), top: B:101:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0187 A[Catch: Exception -> 0x007c, CancellationException -> 0x025a, TryCatch #7 {CancellationException -> 0x025a, Exception -> 0x007c, blocks: (B:15:0x0052, B:78:0x0229, B:81:0x0231, B:71:0x01a5, B:75:0x01c9, B:85:0x0239, B:21:0x0075, B:63:0x017c, B:68:0x0187, B:70:0x019f, B:69:0x0193), top: B:97:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0193 A[Catch: Exception -> 0x007c, CancellationException -> 0x025a, TryCatch #7 {CancellationException -> 0x025a, Exception -> 0x007c, blocks: (B:15:0x0052, B:78:0x0229, B:81:0x0231, B:71:0x01a5, B:75:0x01c9, B:85:0x0239, B:21:0x0075, B:63:0x017c, B:68:0x0187, B:70:0x019f, B:69:0x0193), top: B:97:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v17, types: [com.smartengines.engine.ImageProcessor] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0226 -> B:17:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object process(Engine engine, RecognitionTarget recognitionTarget, SessionType sessionType, Bitmap bitmap, Continuation<? super Unit> continuation) {
        C32921 c32921;
        ImageProcessor imageProcessor;
        ImageProcessingState.VIDEO_PROCESSING video_processing;
        Session session;
        ImageProcessor imageProcessor2;
        Channel<Frame> channelChannel$default;
        ImageProcessor imageProcessor3;
        RecognitionTarget recognitionTarget2;
        ImageProcessor imageProcessor4;
        ImageProcessor imageProcessor5;
        SessionType sessionType2;
        Channel<Frame> channel;
        Bitmap bitmap2;
        Session session2;
        int i;
        ImageProcessingState.VIDEO_PROCESSING video_processing2;
        int i2;
        ImageProcessor imageProcessor6;
        SessionType sessionType3;
        Session session3;
        int i3;
        Bitmap bitmap3;
        ImageProcessor imageProcessor7;
        Object objReceive;
        RecognitionTarget recognitionTarget3 = recognitionTarget;
        SessionType sessionType4 = sessionType;
        Bitmap bitmap4 = bitmap;
        if (continuation instanceof C32921) {
            c32921 = (C32921) continuation;
            if ((c32921.label & Integer.MIN_VALUE) != 0) {
                c32921.label -= Integer.MIN_VALUE;
            } else {
                c32921 = new C32921(continuation);
            }
        }
        Object obj = c32921.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c32921.label;
        int i5 = 3;
        ImageProcessor imageProcessor8 = 2;
        imageProcessor8 = 2;
        try {
        } catch (CancellationException unused) {
        } catch (Exception e) {
            e = e;
        }
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            Log.w("engine.ImageProcessor", "processing thread started:  " + Thread.currentThread().getId() + ' ' + Thread.currentThread().getName());
            try {
                if (bitmap4 != null) {
                    video_processing = new ImageProcessingState.PHOTO_PROCESSING(recognitionTarget3, null, bitmap4);
                } else {
                    video_processing = new ImageProcessingState.VIDEO_PROCESSING(recognitionTarget3, null);
                }
                setState(video_processing);
                SessionSettingsLogger sessionSettingsLogger = this.sessionSettingsLogger;
                if (sessionSettingsLogger != null) {
                    sessionSettingsLogger.clear();
                }
                if (this.session == null) {
                    this.session = recognitionTarget3.createSession(engine, sessionType4, this.sessionSettingsLogger);
                }
                session = this.session;
                Intrinsics.checkNotNull(session);
                c32921.L$0 = this;
                c32921.L$1 = recognitionTarget3;
                c32921.L$2 = sessionType4;
                c32921.L$3 = bitmap4;
                c32921.L$4 = session;
                c32921.label = 1;
                if (DelayKt.delay(1L, c32921) != coroutine_suspended) {
                    imageProcessor2 = this;
                    new Size(1, 1);
                    channelChannel$default = ChannelKt.Channel$default(bitmap4 == null ? 1 : 0, null, null, 6, null);
                    if (bitmap4 != null) {
                    }
                }
                return coroutine_suspended;
            } catch (CancellationException unused2) {
                imageProcessor8 = this;
                Log.e("engine.ImageProcessor", "image processing cancelled");
                imageProcessor8.deleteSession();
                imageProcessor = imageProcessor8;
                Log.w("engine.ImageProcessor", "processing thread finished: " + Thread.currentThread().getId() + ' ' + Thread.currentThread().getName());
                imageProcessor.processingJob = null;
                imageProcessor.frameChannel = null;
                return Unit.INSTANCE;
            } catch (Exception e2) {
                e = e2;
                imageProcessor8 = this;
                Log.e("engine.ImageProcessor", "image processing", e);
                imageProcessor8.setState(new ImageProcessingState.ERROR(e));
                imageProcessor = imageProcessor8;
                Log.w("engine.ImageProcessor", "processing thread finished: " + Thread.currentThread().getId() + ' ' + Thread.currentThread().getName());
                imageProcessor.processingJob = null;
                imageProcessor.frameChannel = null;
                return Unit.INSTANCE;
            }
        }
        if (i4 == 1) {
            Session session4 = (Session) c32921.L$4;
            Bitmap bitmap5 = (Bitmap) c32921.L$3;
            SessionType sessionType5 = (SessionType) c32921.L$2;
            RecognitionTarget recognitionTarget4 = (RecognitionTarget) c32921.L$1;
            imageProcessor2 = (ImageProcessor) c32921.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                bitmap4 = bitmap5;
                sessionType4 = sessionType5;
                session = session4;
                recognitionTarget3 = recognitionTarget4;
                new Size(1, 1);
                channelChannel$default = ChannelKt.Channel$default(bitmap4 == null ? 1 : 0, null, null, 6, null);
                if (bitmap4 != null) {
                    imageProcessor3 = imageProcessor2;
                    imageProcessor2.frameChannel = channelChannel$default;
                    if (bitmap4 != null) {
                    }
                    if (bitmap4 != null) {
                    }
                    imageProcessor3.setState(video_processing2);
                    i2 = 0;
                    imageProcessor3.stopProcessingFlag = false;
                    imageProcessor7 = imageProcessor3;
                    Channel<Frame> channel2 = imageProcessor7.frameChannel;
                    Intrinsics.checkNotNull(channel2);
                    c32921.L$0 = imageProcessor7;
                    c32921.L$1 = sessionType4;
                    c32921.L$2 = session;
                    c32921.L$3 = null;
                    c32921.L$4 = null;
                    c32921.L$5 = null;
                    c32921.L$6 = null;
                    c32921.I$0 = i;
                    c32921.I$1 = i2;
                    c32921.label = i5;
                    objReceive = channel2.receive(c32921);
                    if (objReceive != coroutine_suspended) {
                    }
                } else {
                    Frame frame = new Frame(bitmap4, null);
                    c32921.L$0 = imageProcessor2;
                    c32921.L$1 = recognitionTarget3;
                    c32921.L$2 = sessionType4;
                    c32921.L$3 = bitmap4;
                    c32921.L$4 = session;
                    c32921.L$5 = channelChannel$default;
                    c32921.L$6 = imageProcessor2;
                    c32921.label = 2;
                    if (channelChannel$default.send(frame, c32921) != coroutine_suspended) {
                        recognitionTarget2 = recognitionTarget3;
                        imageProcessor4 = imageProcessor2;
                        imageProcessor5 = imageProcessor4;
                        sessionType2 = sessionType4;
                        channel = channelChannel$default;
                        bitmap2 = bitmap4;
                        session2 = session;
                        session = session2;
                        bitmap4 = bitmap2;
                        channelChannel$default = channel;
                        sessionType4 = sessionType2;
                        imageProcessor2 = imageProcessor4;
                        recognitionTarget3 = recognitionTarget2;
                        imageProcessor3 = imageProcessor5;
                        imageProcessor2.frameChannel = channelChannel$default;
                        if (bitmap4 != null) {
                        }
                        if (bitmap4 != null) {
                        }
                        imageProcessor3.setState(video_processing2);
                        i2 = 0;
                        imageProcessor3.stopProcessingFlag = false;
                        imageProcessor7 = imageProcessor3;
                        Channel<Frame> channel22 = imageProcessor7.frameChannel;
                        Intrinsics.checkNotNull(channel22);
                        c32921.L$0 = imageProcessor7;
                        c32921.L$1 = sessionType4;
                        c32921.L$2 = session;
                        c32921.L$3 = null;
                        c32921.L$4 = null;
                        c32921.L$5 = null;
                        c32921.L$6 = null;
                        c32921.I$0 = i;
                        c32921.I$1 = i2;
                        c32921.label = i5;
                        objReceive = channel22.receive(c32921);
                        if (objReceive != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
            } catch (CancellationException unused3) {
                imageProcessor8 = imageProcessor2;
                Log.e("engine.ImageProcessor", "image processing cancelled");
                imageProcessor8.deleteSession();
                imageProcessor = imageProcessor8;
                Log.w("engine.ImageProcessor", "processing thread finished: " + Thread.currentThread().getId() + ' ' + Thread.currentThread().getName());
                imageProcessor.processingJob = null;
                imageProcessor.frameChannel = null;
                return Unit.INSTANCE;
            } catch (Exception e3) {
                e = e3;
                imageProcessor8 = imageProcessor2;
                Log.e("engine.ImageProcessor", "image processing", e);
                imageProcessor8.setState(new ImageProcessingState.ERROR(e));
                imageProcessor = imageProcessor8;
                Log.w("engine.ImageProcessor", "processing thread finished: " + Thread.currentThread().getId() + ' ' + Thread.currentThread().getName());
                imageProcessor.processingJob = null;
                imageProcessor.frameChannel = null;
                return Unit.INSTANCE;
            }
        } else if (i4 == 2) {
            imageProcessor4 = (ImageProcessor) c32921.L$6;
            channel = (Channel) c32921.L$5;
            session2 = (Session) c32921.L$4;
            bitmap2 = (Bitmap) c32921.L$3;
            sessionType2 = (SessionType) c32921.L$2;
            recognitionTarget2 = (RecognitionTarget) c32921.L$1;
            imageProcessor5 = (ImageProcessor) c32921.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                session = session2;
                bitmap4 = bitmap2;
                channelChannel$default = channel;
                sessionType4 = sessionType2;
                imageProcessor2 = imageProcessor4;
                recognitionTarget3 = recognitionTarget2;
                imageProcessor3 = imageProcessor5;
                imageProcessor2.frameChannel = channelChannel$default;
                i = bitmap4 != null ? 1 : Integer.MAX_VALUE;
                if (bitmap4 != null) {
                    video_processing2 = new ImageProcessingState.PHOTO_PROCESSING(recognitionTarget3, session.getVisualizations(), bitmap4);
                } else {
                    video_processing2 = new ImageProcessingState.VIDEO_PROCESSING(recognitionTarget3, session.getVisualizations());
                }
                imageProcessor3.setState(video_processing2);
                i2 = 0;
                imageProcessor3.stopProcessingFlag = false;
                imageProcessor7 = imageProcessor3;
                Channel<Frame> channel222 = imageProcessor7.frameChannel;
                Intrinsics.checkNotNull(channel222);
                c32921.L$0 = imageProcessor7;
                c32921.L$1 = sessionType4;
                c32921.L$2 = session;
                c32921.L$3 = null;
                c32921.L$4 = null;
                c32921.L$5 = null;
                c32921.L$6 = null;
                c32921.I$0 = i;
                c32921.I$1 = i2;
                c32921.label = i5;
                objReceive = channel222.receive(c32921);
                if (objReceive != coroutine_suspended) {
                }
            } catch (CancellationException unused4) {
                imageProcessor8 = imageProcessor5;
                Log.e("engine.ImageProcessor", "image processing cancelled");
                imageProcessor8.deleteSession();
                imageProcessor = imageProcessor8;
                Log.w("engine.ImageProcessor", "processing thread finished: " + Thread.currentThread().getId() + ' ' + Thread.currentThread().getName());
                imageProcessor.processingJob = null;
                imageProcessor.frameChannel = null;
                return Unit.INSTANCE;
            } catch (Exception e4) {
                e = e4;
                imageProcessor8 = imageProcessor5;
                Log.e("engine.ImageProcessor", "image processing", e);
                imageProcessor8.setState(new ImageProcessingState.ERROR(e));
                imageProcessor = imageProcessor8;
                Log.w("engine.ImageProcessor", "processing thread finished: " + Thread.currentThread().getId() + ' ' + Thread.currentThread().getName());
                imageProcessor.processingJob = null;
                imageProcessor.frameChannel = null;
                return Unit.INSTANCE;
            }
        } else {
            if (i4 != 3) {
                if (i4 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = c32921.I$1;
                i3 = c32921.I$0;
                bitmap3 = (Bitmap) c32921.L$3;
                session3 = (Session) c32921.L$2;
                sessionType3 = (SessionType) c32921.L$1;
                ImageProcessor imageProcessor9 = (ImageProcessor) c32921.L$0;
                ResultKt.throwOnFailure(obj);
                imageProcessor8 = imageProcessor9;
                session = session3;
                i = i3;
                sessionType4 = sessionType3;
                if (!session.getIsEnded() && i2 < i && !imageProcessor8.stopProcessingFlag) {
                    i5 = 3;
                    imageProcessor7 = imageProcessor8;
                    Channel<Frame> channel2222 = imageProcessor7.frameChannel;
                    Intrinsics.checkNotNull(channel2222);
                    c32921.L$0 = imageProcessor7;
                    c32921.L$1 = sessionType4;
                    c32921.L$2 = session;
                    c32921.L$3 = null;
                    c32921.L$4 = null;
                    c32921.L$5 = null;
                    c32921.L$6 = null;
                    c32921.I$0 = i;
                    c32921.I$1 = i2;
                    c32921.label = i5;
                    objReceive = channel2222.receive(c32921);
                    if (objReceive != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sessionType3 = sessionType4;
                    i3 = i;
                    session3 = session;
                    obj = objReceive;
                    imageProcessor6 = imageProcessor7;
                    Frame frame2 = (Frame) obj;
                    i2++;
                    Bitmap bitmap6 = frame2.getBitmap();
                    Log.d("engine.ImageProcessor", "frame #" + i2 + ' ' + new Size(bitmap6.getWidth(), bitmap6.getHeight()) + " is processing...");
                    bitmap3 = frame2.getBitmap();
                    System.currentTimeMillis();
                    session3.processImage(bitmap3);
                    System.currentTimeMillis();
                    frame2.close();
                    c32921.L$0 = imageProcessor6;
                    c32921.L$1 = sessionType3;
                    c32921.L$2 = session3;
                    c32921.L$3 = bitmap3;
                    c32921.I$0 = i3;
                    c32921.I$1 = i2;
                    c32921.label = 4;
                    imageProcessor8 = imageProcessor6;
                }
                imageProcessor8.setState(new ImageProcessingState.FINISHED(sessionType4, bitmap3));
                imageProcessor = imageProcessor8;
                Log.w("engine.ImageProcessor", "processing thread finished: " + Thread.currentThread().getId() + ' ' + Thread.currentThread().getName());
                imageProcessor.processingJob = null;
                imageProcessor.frameChannel = null;
                return Unit.INSTANCE;
            }
            i2 = c32921.I$1;
            i3 = c32921.I$0;
            Session session5 = (Session) c32921.L$2;
            SessionType sessionType6 = (SessionType) c32921.L$1;
            ImageProcessor imageProcessor10 = (ImageProcessor) c32921.L$0;
            ResultKt.throwOnFailure(obj);
            sessionType3 = sessionType6;
            session3 = session5;
            imageProcessor6 = imageProcessor10;
            Frame frame22 = (Frame) obj;
            i2++;
            Bitmap bitmap62 = frame22.getBitmap();
            Log.d("engine.ImageProcessor", "frame #" + i2 + ' ' + new Size(bitmap62.getWidth(), bitmap62.getHeight()) + " is processing...");
            bitmap3 = frame22.getBitmap();
            System.currentTimeMillis();
            session3.processImage(bitmap3);
            System.currentTimeMillis();
            frame22.close();
            c32921.L$0 = imageProcessor6;
            c32921.L$1 = sessionType3;
            c32921.L$2 = session3;
            c32921.L$3 = bitmap3;
            c32921.I$0 = i3;
            c32921.I$1 = i2;
            c32921.label = 4;
            imageProcessor8 = imageProcessor6;
        }
    }
}
