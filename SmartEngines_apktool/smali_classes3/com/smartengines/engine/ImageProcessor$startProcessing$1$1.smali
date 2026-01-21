.class final Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ImageProcessor.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/engine/ImageProcessor;->startProcessing(Lcom/smartengines/engine/Engine;Lcom/smartengines/engine/RecognitionTarget;Lcom/smartengines/engine/SessionType;Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.smartengines.engine.ImageProcessor$startProcessing$1$1"
    f = "ImageProcessor.kt"
    i = {}
    l = {
        0x3e
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $engine:Lcom/smartengines/engine/Engine;

.field final synthetic $photo:Landroid/graphics/Bitmap;

.field final synthetic $sessionType:Lcom/smartengines/engine/SessionType;

.field final synthetic $target:Lcom/smartengines/engine/RecognitionTarget;

.field label:I

.field final synthetic this$0:Lcom/smartengines/engine/ImageProcessor;


# direct methods
.method constructor <init>(Lcom/smartengines/engine/ImageProcessor;Lcom/smartengines/engine/Engine;Lcom/smartengines/engine/RecognitionTarget;Lcom/smartengines/engine/SessionType;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/engine/ImageProcessor;",
            "Lcom/smartengines/engine/Engine;",
            "Lcom/smartengines/engine/RecognitionTarget;",
            "Lcom/smartengines/engine/SessionType;",
            "Landroid/graphics/Bitmap;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;->this$0:Lcom/smartengines/engine/ImageProcessor;

    iput-object p2, p0, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;->$engine:Lcom/smartengines/engine/Engine;

    iput-object p3, p0, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;->$target:Lcom/smartengines/engine/RecognitionTarget;

    iput-object p4, p0, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;->$sessionType:Lcom/smartengines/engine/SessionType;

    iput-object p5, p0, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;->$photo:Landroid/graphics/Bitmap;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;

    iget-object v1, p0, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;->this$0:Lcom/smartengines/engine/ImageProcessor;

    iget-object v2, p0, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;->$engine:Lcom/smartengines/engine/Engine;

    iget-object v3, p0, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;->$target:Lcom/smartengines/engine/RecognitionTarget;

    iget-object v4, p0, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;->$sessionType:Lcom/smartengines/engine/SessionType;

    iget-object v5, p0, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;->$photo:Landroid/graphics/Bitmap;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;-><init>(Lcom/smartengines/engine/ImageProcessor;Lcom/smartengines/engine/Engine;Lcom/smartengines/engine/RecognitionTarget;Lcom/smartengines/engine/SessionType;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 61
    iget v1, p0, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 62
    iget-object v1, p0, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;->this$0:Lcom/smartengines/engine/ImageProcessor;

    move p1, v2

    iget-object v2, p0, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;->$engine:Lcom/smartengines/engine/Engine;

    iget-object v3, p0, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;->$target:Lcom/smartengines/engine/RecognitionTarget;

    iget-object v4, p0, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;->$sessionType:Lcom/smartengines/engine/SessionType;

    iget-object v5, p0, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;->$photo:Landroid/graphics/Bitmap;

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput p1, p0, Lcom/smartengines/engine/ImageProcessor$startProcessing$1$1;->label:I

    invoke-static/range {v1 .. v6}, Lcom/smartengines/engine/ImageProcessor;->access$process(Lcom/smartengines/engine/ImageProcessor;Lcom/smartengines/engine/Engine;Lcom/smartengines/engine/RecognitionTarget;Lcom/smartengines/engine/SessionType;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    .line 63
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
