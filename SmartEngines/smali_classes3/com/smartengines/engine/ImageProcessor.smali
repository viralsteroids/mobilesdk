.class public final Lcom/smartengines/engine/ImageProcessor;
.super Ljava/lang/Object;
.source "ImageProcessor.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nImageProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageProcessor.kt\ncom/smartengines/engine/ImageProcessor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n1#2:224\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0008\u0010\u0017\u001a\u00020\u000cH\u0002J(\u0010\u001a\u001a\u00020\u000c2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0008\u0010!\u001a\u0004\u0018\u00010\"J\u000e\u0010#\u001a\u00020\u000c2\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\u000cJ\u0006\u0010\'\u001a\u00020\u000cJ\u0006\u0010(\u001a\u00020\u000cJ0\u0010/\u001a\u00020\u000c2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0008\u0010!\u001a\u0004\u0018\u00010\"H\u0082@\u00a2\u0006\u0002\u00100R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010-\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010.X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"
    }
    d2 = {
        "Lcom/smartengines/engine/ImageProcessor;",
        "",
        "sessionSettingsLogger",
        "Lcom/smartengines/engine/SessionSettingsLogger;",
        "<init>",
        "(Lcom/smartengines/engine/SessionSettingsLogger;)V",
        "getSessionSettingsLogger",
        "()Lcom/smartengines/engine/SessionSettingsLogger;",
        "_state",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/smartengines/engine/ImageProcessingState;",
        "setState",
        "",
        "newState",
        "state",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "value",
        "Lcom/smartengines/engine/Session;",
        "session",
        "getSession",
        "()Lcom/smartengines/engine/Session;",
        "deleteSession",
        "stopProcessingFlag",
        "",
        "startProcessing",
        "engine",
        "Lcom/smartengines/engine/Engine;",
        "target",
        "Lcom/smartengines/engine/RecognitionTarget;",
        "sessionType",
        "Lcom/smartengines/engine/SessionType;",
        "photo",
        "Landroid/graphics/Bitmap;",
        "addFrame",
        "frame",
        "Lcom/smartengines/camera/Frame;",
        "restart",
        "clear",
        "stopProcessing",
        "scope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "processingJob",
        "Lkotlinx/coroutines/Job;",
        "frameChannel",
        "Lkotlinx/coroutines/channels/Channel;",
        "process",
        "(Lcom/smartengines/engine/Engine;Lcom/smartengines/engine/RecognitionTarget;Lcom/smartengines/engine/SessionType;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "engine_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final _state:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/smartengines/engine/ImageProcessingState;",
            ">;"
        }
    .end annotation
.end field

.field private frameChannel:Lkotlinx/coroutines/channels/Channel;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/channels/Channel<",
            "Lcom/smartengines/camera/Frame;",
            ">;"
        }
    .end annotation
.end field

.field private processingJob:Lkotlinx/coroutines/Job;

.field private final scope:Lkotlinx/coroutines/CoroutineScope;

.field private session:Lcom/smartengines/engine/Session;

.field private final sessionSettingsLogger:Lcom/smartengines/engine/SessionSettingsLogger;

.field private final state:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/smartengines/engine/ImageProcessingState;",
            ">;"
        }
    .end annotation
.end field

.field private stopProcessingFlag:Z


# direct methods
.method public constructor <init>(Lcom/smartengines/engine/SessionSettingsLogger;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/engine/ImageProcessor;->sessionSettingsLogger:Lcom/smartengines/engine/SessionSettingsLogger;

    .line 39
    sget-object p1, Lcom/smartengines/engine/ImageProcessingState$WAITING;->INSTANCE:Lcom/smartengines/engine/ImageProcessingState$WAITING;

    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/engine/ImageProcessor;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 44
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/engine/ImageProcessor;->state:Lkotlinx/coroutines/flow/StateFlow;

    .line 123
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p1

    check-cast p1, Lkotlin/coroutines/CoroutineContext;

    invoke-static {p1}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/engine/ImageProcessor;->scope:Lkotlinx/coroutines/CoroutineScope;

    return-void
.end method

.method public static final synthetic access$getFrameChannel$p(Lcom/smartengines/engine/ImageProcessor;)Lkotlinx/coroutines/channels/Channel;
    .locals 0

    .line 34
    iget-object p0, p0, Lcom/smartengines/engine/ImageProcessor;->frameChannel:Lkotlinx/coroutines/channels/Channel;

    return-object p0
.end method

.method public static final synthetic access$process(Lcom/smartengines/engine/ImageProcessor;Lcom/smartengines/engine/Engine;Lcom/smartengines/engine/RecognitionTarget;Lcom/smartengines/engine/SessionType;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 34
    invoke-direct/range {p0 .. p5}, Lcom/smartengines/engine/ImageProcessor;->process(Lcom/smartengines/engine/Engine;Lcom/smartengines/engine/RecognitionTarget;Lcom/smartengines/engine/SessionType;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final deleteSession()V
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/smartengines/engine/ImageProcessor;->session:Lcom/smartengines/engine/Session;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/smartengines/engine/Session;->delete()V

    :cond_0
    const/4 v0, 0x0

    .line 50
    iput-object v0, p0, Lcom/smartengines/engine/ImageProcessor;->session:Lcom/smartengines/engine/Session;

    return-void
.end method

.method private final process(Lcom/smartengines/engine/Engine;Lcom/smartengines/engine/RecognitionTarget;Lcom/smartengines/engine/SessionType;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/engine/Engine;",
            "Lcom/smartengines/engine/RecognitionTarget;",
            "Lcom/smartengines/engine/SessionType;",
            "Landroid/graphics/Bitmap;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    instance-of v5, v4, Lcom/smartengines/engine/ImageProcessor$process$1;

    if-eqz v5, :cond_0

    move-object v5, v4

    check-cast v5, Lcom/smartengines/engine/ImageProcessor$process$1;

    iget v6, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->label:I

    const/high16 v7, -0x80000000

    and-int/2addr v6, v7

    if-eqz v6, :cond_0

    iget v4, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->label:I

    sub-int/2addr v4, v7

    iput v4, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v5, Lcom/smartengines/engine/ImageProcessor$process$1;

    invoke-direct {v5, v1, v4}, Lcom/smartengines/engine/ImageProcessor$process$1;-><init>(Lcom/smartengines/engine/ImageProcessor;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v4, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v6

    .line 128
    iget v7, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->label:I

    const/4 v10, 0x4

    const/4 v11, 0x3

    const/4 v12, 0x2

    const/16 v14, 0x20

    const-string v15, "engine.ImageProcessor"

    const/4 v13, 0x1

    const/4 v8, 0x0

    if-eqz v7, :cond_6

    if-eq v7, v13, :cond_5

    if-eq v7, v12, :cond_4

    if-eq v7, v11, :cond_3

    if-ne v7, v10, :cond_2

    iget v0, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->I$1:I

    iget v2, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->I$0:I

    iget-object v3, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$3:Ljava/lang/Object;

    check-cast v3, Landroid/graphics/Bitmap;

    iget-object v7, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$2:Ljava/lang/Object;

    check-cast v7, Lcom/smartengines/engine/Session;

    iget-object v9, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$1:Ljava/lang/Object;

    check-cast v9, Lcom/smartengines/engine/SessionType;

    iget-object v12, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$0:Ljava/lang/Object;

    check-cast v12, Lcom/smartengines/engine/ImageProcessor;

    :try_start_0
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_7
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-wide/16 v10, 0x1

    :cond_1
    move-object v4, v7

    move v7, v2

    move-object v2, v9

    goto/16 :goto_b

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget v0, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->I$1:I

    iget v2, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->I$0:I

    iget-object v3, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lcom/smartengines/engine/Session;

    iget-object v7, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lcom/smartengines/engine/SessionType;

    iget-object v9, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$0:Ljava/lang/Object;

    move-object v12, v9

    check-cast v12, Lcom/smartengines/engine/ImageProcessor;

    :try_start_1
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v9, v7

    move-object v7, v3

    goto/16 :goto_9

    :catch_0
    move-exception v0

    goto/16 :goto_d

    :cond_4
    iget-object v0, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$6:Ljava/lang/Object;

    check-cast v0, Lcom/smartengines/engine/ImageProcessor;

    iget-object v2, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$5:Ljava/lang/Object;

    check-cast v2, Lkotlinx/coroutines/channels/Channel;

    iget-object v3, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$4:Ljava/lang/Object;

    check-cast v3, Lcom/smartengines/engine/Session;

    iget-object v7, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$3:Ljava/lang/Object;

    check-cast v7, Landroid/graphics/Bitmap;

    iget-object v9, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$2:Ljava/lang/Object;

    check-cast v9, Lcom/smartengines/engine/SessionType;

    iget-object v12, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$1:Ljava/lang/Object;

    check-cast v12, Lcom/smartengines/engine/RecognitionTarget;

    iget-object v10, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$0:Ljava/lang/Object;

    check-cast v10, Lcom/smartengines/engine/ImageProcessor;

    :try_start_2
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_4

    :catch_1
    move-exception v0

    move-object v12, v10

    goto/16 :goto_d

    :catch_2
    move-object v12, v10

    goto/16 :goto_e

    :cond_5
    iget-object v0, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$4:Ljava/lang/Object;

    check-cast v0, Lcom/smartengines/engine/Session;

    iget-object v2, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$3:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/Bitmap;

    iget-object v3, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lcom/smartengines/engine/SessionType;

    iget-object v7, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lcom/smartengines/engine/RecognitionTarget;

    iget-object v9, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lcom/smartengines/engine/ImageProcessor;

    :try_start_3
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    move-object v4, v3

    move-object v3, v2

    move-object v2, v4

    move-object v4, v0

    move-object v0, v7

    goto/16 :goto_2

    :catch_3
    move-exception v0

    move-object v12, v9

    goto/16 :goto_d

    :catch_4
    move-object v12, v9

    goto/16 :goto_e

    :cond_6
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 134
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v7, "processing thread started:  "

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Thread;->getId()J

    move-result-wide v9

    invoke-virtual {v4, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v15, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v3, :cond_7

    .line 138
    :try_start_4
    new-instance v4, Lcom/smartengines/engine/ImageProcessingState$PHOTO_PROCESSING;

    invoke-direct {v4, v0, v8, v3}, Lcom/smartengines/engine/ImageProcessingState$PHOTO_PROCESSING;-><init>(Lcom/smartengines/engine/RecognitionTarget;Ljava/util/Collection;Landroid/graphics/Bitmap;)V

    check-cast v4, Lcom/smartengines/engine/ImageProcessingState;

    goto :goto_1

    .line 143
    :cond_7
    new-instance v4, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;

    invoke-direct {v4, v0, v8}, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;-><init>(Lcom/smartengines/engine/RecognitionTarget;Ljava/util/Collection;)V

    check-cast v4, Lcom/smartengines/engine/ImageProcessingState;

    .line 137
    :goto_1
    invoke-direct {v1, v4}, Lcom/smartengines/engine/ImageProcessor;->setState(Lcom/smartengines/engine/ImageProcessingState;)V

    .line 150
    iget-object v4, v1, Lcom/smartengines/engine/ImageProcessor;->sessionSettingsLogger:Lcom/smartengines/engine/SessionSettingsLogger;

    if-eqz v4, :cond_8

    invoke-interface {v4}, Lcom/smartengines/engine/SessionSettingsLogger;->clear()V

    .line 151
    :cond_8
    iget-object v4, v1, Lcom/smartengines/engine/ImageProcessor;->session:Lcom/smartengines/engine/Session;

    if-nez v4, :cond_9

    .line 154
    iget-object v4, v1, Lcom/smartengines/engine/ImageProcessor;->sessionSettingsLogger:Lcom/smartengines/engine/SessionSettingsLogger;

    move-object/from16 v7, p1

    .line 151
    invoke-interface {v0, v7, v2, v4}, Lcom/smartengines/engine/RecognitionTarget;->createSession(Lcom/smartengines/engine/Engine;Lcom/smartengines/engine/SessionType;Lcom/smartengines/engine/SessionSettingsLogger;)Lcom/smartengines/engine/Session;

    move-result-object v4

    iput-object v4, v1, Lcom/smartengines/engine/ImageProcessor;->session:Lcom/smartengines/engine/Session;

    .line 156
    :cond_9
    iget-object v4, v1, Lcom/smartengines/engine/ImageProcessor;->session:Lcom/smartengines/engine/Session;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 157
    iput-object v1, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$0:Ljava/lang/Object;

    iput-object v0, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$1:Ljava/lang/Object;

    iput-object v2, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$2:Ljava/lang/Object;

    iput-object v3, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$3:Ljava/lang/Object;

    iput-object v4, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$4:Ljava/lang/Object;

    iput v13, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->label:I

    const-wide/16 v9, 0x1

    invoke-static {v9, v10, v5}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v7
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_6
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5

    if-ne v7, v6, :cond_a

    goto/16 :goto_a

    :cond_a
    move-object v9, v1

    .line 160
    :goto_2
    :try_start_5
    new-instance v7, Landroid/util/Size;

    invoke-direct {v7, v13, v13}, Landroid/util/Size;-><init>(II)V

    if-eqz v3, :cond_b

    move v7, v13

    goto :goto_3

    :cond_b
    const/4 v7, 0x0

    :goto_3
    const/4 v10, 0x6

    .line 163
    invoke-static {v7, v8, v8, v10, v8}, Lkotlinx/coroutines/channels/ChannelKt;->Channel$default(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/Channel;

    move-result-object v7

    if-eqz v3, :cond_d

    .line 165
    new-instance v10, Lcom/smartengines/camera/Frame;

    invoke-direct {v10, v3, v8}, Lcom/smartengines/camera/Frame;-><init>(Landroid/graphics/Bitmap;Landroidx/camera/core/ImageProxy;)V

    iput-object v9, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$0:Ljava/lang/Object;

    iput-object v0, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$1:Ljava/lang/Object;

    iput-object v2, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$2:Ljava/lang/Object;

    iput-object v3, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$3:Ljava/lang/Object;

    iput-object v4, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$4:Ljava/lang/Object;

    iput-object v7, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$5:Ljava/lang/Object;

    iput-object v9, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$6:Ljava/lang/Object;

    iput v12, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->label:I

    invoke-interface {v7, v10, v5}, Lkotlinx/coroutines/channels/Channel;->send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v10
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    if-ne v10, v6, :cond_c

    goto/16 :goto_a

    :cond_c
    move-object v12, v0

    move-object v0, v9

    move-object v10, v0

    move-object v9, v2

    move-object v2, v7

    move-object v7, v3

    move-object v3, v4

    :goto_4
    move-object v4, v3

    move-object v3, v7

    move-object v7, v2

    move-object v2, v9

    move-object v9, v0

    move-object v0, v12

    move-object v12, v10

    goto :goto_5

    :cond_d
    move-object v12, v9

    .line 163
    :goto_5
    :try_start_6
    iput-object v7, v9, Lcom/smartengines/engine/ImageProcessor;->frameChannel:Lkotlinx/coroutines/channels/Channel;

    if-eqz v3, :cond_e

    move v7, v13

    goto :goto_6

    :cond_e
    const v7, 0x7fffffff

    :goto_6
    if-eqz v3, :cond_f

    .line 172
    new-instance v9, Lcom/smartengines/engine/ImageProcessingState$PHOTO_PROCESSING;

    invoke-interface {v4}, Lcom/smartengines/engine/Session;->getVisualizations()Ljava/util/Collection;

    move-result-object v10

    invoke-direct {v9, v0, v10, v3}, Lcom/smartengines/engine/ImageProcessingState$PHOTO_PROCESSING;-><init>(Lcom/smartengines/engine/RecognitionTarget;Ljava/util/Collection;Landroid/graphics/Bitmap;)V

    check-cast v9, Lcom/smartengines/engine/ImageProcessingState;

    goto :goto_7

    .line 173
    :cond_f
    new-instance v3, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;

    invoke-interface {v4}, Lcom/smartengines/engine/Session;->getVisualizations()Ljava/util/Collection;

    move-result-object v9

    invoke-direct {v3, v0, v9}, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;-><init>(Lcom/smartengines/engine/RecognitionTarget;Ljava/util/Collection;)V

    move-object v9, v3

    check-cast v9, Lcom/smartengines/engine/ImageProcessingState;

    .line 171
    :goto_7
    invoke-direct {v12, v9}, Lcom/smartengines/engine/ImageProcessor;->setState(Lcom/smartengines/engine/ImageProcessingState;)V

    const/4 v0, 0x0

    .line 177
    iput-boolean v0, v12, Lcom/smartengines/engine/ImageProcessor;->stopProcessingFlag:Z

    .line 181
    :goto_8
    iget-object v3, v12, Lcom/smartengines/engine/ImageProcessor;->frameChannel:Lkotlinx/coroutines/channels/Channel;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object v12, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$0:Ljava/lang/Object;

    iput-object v2, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$1:Ljava/lang/Object;

    iput-object v4, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$2:Ljava/lang/Object;

    iput-object v8, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$3:Ljava/lang/Object;

    iput-object v8, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$4:Ljava/lang/Object;

    iput-object v8, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$5:Ljava/lang/Object;

    iput-object v8, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$6:Ljava/lang/Object;

    iput v7, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->I$0:I

    iput v0, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->I$1:I

    iput v11, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->label:I

    invoke-interface {v3, v5}, Lkotlinx/coroutines/channels/Channel;->receive(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v6, :cond_10

    goto :goto_a

    :cond_10
    move-object v9, v2

    move v2, v7

    move-object v7, v4

    move-object v4, v3

    .line 128
    :goto_9
    check-cast v4, Lcom/smartengines/camera/Frame;

    add-int/2addr v0, v13

    .line 183
    invoke-virtual {v4}, Lcom/smartengines/camera/Frame;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v3

    new-instance v10, Landroid/util/Size;

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v11

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-direct {v10, v11, v3}, Landroid/util/Size;-><init>(II)V

    .line 184
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "frame #"

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v10, " is processing..."

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v15, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 188
    invoke-virtual {v4}, Lcom/smartengines/camera/Frame;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v3

    .line 191
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 192
    invoke-interface {v7, v3}, Lcom/smartengines/engine/Session;->processImage(Landroid/graphics/Bitmap;)V

    .line 193
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 197
    invoke-virtual {v4}, Lcom/smartengines/camera/Frame;->close()V

    .line 201
    iput-object v12, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$0:Ljava/lang/Object;

    iput-object v9, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$1:Ljava/lang/Object;

    iput-object v7, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$2:Ljava/lang/Object;

    iput-object v3, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->L$3:Ljava/lang/Object;

    iput v2, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->I$0:I

    iput v0, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->I$1:I

    const/4 v4, 0x4

    iput v4, v5, Lcom/smartengines/engine/ImageProcessor$process$1;->label:I

    const-wide/16 v10, 0x1

    invoke-static {v10, v11, v5}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v6, :cond_1

    :goto_a
    return-object v6

    .line 204
    :goto_b
    invoke-interface {v4}, Lcom/smartengines/engine/Session;->isEnded()Z

    move-result v9

    if-nez v9, :cond_12

    if-ge v0, v7, :cond_12

    .line 206
    iget-boolean v9, v12, Lcom/smartengines/engine/ImageProcessor;->stopProcessingFlag:Z

    if-eqz v9, :cond_11

    goto :goto_c

    :cond_11
    const/4 v11, 0x3

    goto/16 :goto_8

    .line 209
    :cond_12
    :goto_c
    new-instance v0, Lcom/smartengines/engine/ImageProcessingState$FINISHED;

    invoke-direct {v0, v2, v3}, Lcom/smartengines/engine/ImageProcessingState$FINISHED;-><init>(Lcom/smartengines/engine/SessionType;Landroid/graphics/Bitmap;)V

    check-cast v0, Lcom/smartengines/engine/ImageProcessingState;

    invoke-direct {v12, v0}, Lcom/smartengines/engine/ImageProcessor;->setState(Lcom/smartengines/engine/ImageProcessingState;)V
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_7
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    goto :goto_f

    :catch_5
    move-exception v0

    move-object v12, v1

    .line 215
    :goto_d
    const-string v2, "image processing"

    move-object v3, v0

    check-cast v3, Ljava/lang/Throwable;

    invoke-static {v15, v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 216
    new-instance v2, Lcom/smartengines/engine/ImageProcessingState$ERROR;

    invoke-direct {v2, v0}, Lcom/smartengines/engine/ImageProcessingState$ERROR;-><init>(Ljava/lang/Exception;)V

    check-cast v2, Lcom/smartengines/engine/ImageProcessingState;

    invoke-direct {v12, v2}, Lcom/smartengines/engine/ImageProcessor;->setState(Lcom/smartengines/engine/ImageProcessingState;)V

    goto :goto_f

    :catch_6
    move-object v12, v1

    .line 212
    :catch_7
    :goto_e
    const-string v0, "image processing cancelled"

    invoke-static {v15, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 213
    invoke-direct {v12}, Lcom/smartengines/engine/ImageProcessor;->deleteSession()V

    .line 219
    :goto_f
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "processing thread finished: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 220
    iput-object v8, v12, Lcom/smartengines/engine/ImageProcessor;->processingJob:Lkotlinx/coroutines/Job;

    .line 221
    iput-object v8, v12, Lcom/smartengines/engine/ImageProcessor;->frameChannel:Lkotlinx/coroutines/channels/Channel;

    .line 222
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private final setState(Lcom/smartengines/engine/ImageProcessingState;)V
    .locals 2

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, " >>> setState: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "engine.ImageProcessor"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    iget-object v0, p0, Lcom/smartengines/engine/ImageProcessor;->_state:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final addFrame(Lcom/smartengines/camera/Frame;)V
    .locals 7

    const-string v0, "frame"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    iget-object v1, p0, Lcom/smartengines/engine/ImageProcessor;->scope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v0, Lcom/smartengines/engine/ImageProcessor$addFrame$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/smartengines/engine/ImageProcessor$addFrame$1;-><init>(Lcom/smartengines/engine/ImageProcessor;Lcom/smartengines/camera/Frame;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final clear()V
    .locals 3

    .line 103
    const-string v0, "engine.ImageProcessor"

    const-string v1, " ---> clear"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 104
    iget-object v0, p0, Lcom/smartengines/engine/ImageProcessor;->state:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/smartengines/engine/ImageProcessingState$WAITING;->INSTANCE:Lcom/smartengines/engine/ImageProcessingState$WAITING;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 105
    sget-object v0, Lcom/smartengines/engine/ImageProcessingState$WAITING;->INSTANCE:Lcom/smartengines/engine/ImageProcessingState$WAITING;

    check-cast v0, Lcom/smartengines/engine/ImageProcessingState;

    invoke-direct {p0, v0}, Lcom/smartengines/engine/ImageProcessor;->setState(Lcom/smartengines/engine/ImageProcessingState;)V

    .line 106
    iget-object v0, p0, Lcom/smartengines/engine/ImageProcessor;->processingJob:Lkotlinx/coroutines/Job;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/Job$DefaultImpls;->cancel$default(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void

    :cond_0
    move-object v0, p0

    check-cast v0, Lcom/smartengines/engine/ImageProcessor;

    .line 107
    invoke-direct {p0}, Lcom/smartengines/engine/ImageProcessor;->deleteSession()V

    :cond_1
    return-void
.end method

.method public final getSession()Lcom/smartengines/engine/Session;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/smartengines/engine/ImageProcessor;->session:Lcom/smartengines/engine/Session;

    return-object v0
.end method

.method public final getSessionSettingsLogger()Lcom/smartengines/engine/SessionSettingsLogger;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/smartengines/engine/ImageProcessor;->sessionSettingsLogger:Lcom/smartengines/engine/SessionSettingsLogger;

    return-object v0
.end method

.method public final getState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/smartengines/engine/ImageProcessingState;",
            ">;"
        }
    .end annotation

    .line 44
    iget-object v0, p0, Lcom/smartengines/engine/ImageProcessor;->state:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final restart()V
    .locals 3

    .line 89
    const-string v0, "engine.ImageProcessor"

    const-string v1, " ---> restart"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    iget-object v0, p0, Lcom/smartengines/engine/ImageProcessor;->state:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/engine/ImageProcessingState;

    .line 91
    instance-of v0, v0, Lcom/smartengines/engine/ImageProcessingState$FINISHED;

    if-eqz v0, :cond_0

    .line 92
    sget-object v0, Lcom/smartengines/engine/ImageProcessingState$WAITING;->INSTANCE:Lcom/smartengines/engine/ImageProcessingState$WAITING;

    check-cast v0, Lcom/smartengines/engine/ImageProcessingState;

    goto :goto_0

    .line 94
    :cond_0
    new-instance v0, Lcom/smartengines/engine/ImageProcessingState$ERROR;

    new-instance v1, Ljava/lang/Exception;

    const-string/jumbo v2, "wrong ImageProcessor state"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/smartengines/engine/ImageProcessingState$ERROR;-><init>(Ljava/lang/Exception;)V

    check-cast v0, Lcom/smartengines/engine/ImageProcessingState;

    .line 90
    :goto_0
    invoke-direct {p0, v0}, Lcom/smartengines/engine/ImageProcessor;->setState(Lcom/smartengines/engine/ImageProcessingState;)V

    return-void
.end method

.method public final startProcessing(Lcom/smartengines/engine/Engine;Lcom/smartengines/engine/RecognitionTarget;Lcom/smartengines/engine/SessionType;Landroid/graphics/Bitmap;)V
    .locals 11

    const-string v0, "engine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "target"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    const-string v0, " ---> startProcessing"

    const-string v1, "engine.ImageProcessor"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    iget-object v0, p0, Lcom/smartengines/engine/ImageProcessor;->state:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/smartengines/engine/ImageProcessingState;

    .line 60
    instance-of v2, v0, Lcom/smartengines/engine/ImageProcessingState$WAITING;

    if-eqz v2, :cond_0

    .line 61
    iget-object v3, p0, Lcom/smartengines/engine/ImageProcessor;->scope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v4, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;

    const/4 v10, 0x0

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    move-object v9, p4

    invoke-direct/range {v4 .. v10}, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;-><init>(Lcom/smartengines/engine/ImageProcessor;Lcom/smartengines/engine/Engine;Lcom/smartengines/engine/RecognitionTarget;Lcom/smartengines/engine/SessionType;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)V

    move-object p1, v5

    move-object v6, v4

    check-cast v6, Lkotlin/jvm/functions/Function2;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p2

    iput-object p2, p1, Lcom/smartengines/engine/ImageProcessor;->processingJob:Lkotlinx/coroutines/Job;

    return-void

    :cond_0
    move-object p1, p0

    .line 66
    new-instance p2, Ljava/lang/StringBuilder;

    const-string/jumbo p3, "startProcessing: incorrect state "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final stopProcessing()V
    .locals 2

    .line 115
    const-string v0, "engine.ImageProcessor"

    const-string v1, " ---> stopProcessing"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    .line 116
    iput-boolean v0, p0, Lcom/smartengines/engine/ImageProcessor;->stopProcessingFlag:Z

    return-void
.end method
