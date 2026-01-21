.class final Lcom/smartengines/app/FacesModel2$onSlotsChanged$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "FacesModel2.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/FacesModel2;->onSlotsChanged()V
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
    c = "com.smartengines.app.FacesModel2$onSlotsChanged$1"
    f = "FacesModel2.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $photoA:Lcom/smartengines/app/Photo;

.field final synthetic $photoB:Lcom/smartengines/app/Photo;

.field label:I

.field final synthetic this$0:Lcom/smartengines/app/FacesModel2;


# direct methods
.method constructor <init>(Lcom/smartengines/app/FacesModel2;Lcom/smartengines/app/Photo;Lcom/smartengines/app/Photo;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/app/FacesModel2;",
            "Lcom/smartengines/app/Photo;",
            "Lcom/smartengines/app/Photo;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/smartengines/app/FacesModel2$onSlotsChanged$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/app/FacesModel2$onSlotsChanged$1;->this$0:Lcom/smartengines/app/FacesModel2;

    iput-object p2, p0, Lcom/smartengines/app/FacesModel2$onSlotsChanged$1;->$photoA:Lcom/smartengines/app/Photo;

    iput-object p3, p0, Lcom/smartengines/app/FacesModel2$onSlotsChanged$1;->$photoB:Lcom/smartengines/app/Photo;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance p1, Lcom/smartengines/app/FacesModel2$onSlotsChanged$1;

    iget-object v0, p0, Lcom/smartengines/app/FacesModel2$onSlotsChanged$1;->this$0:Lcom/smartengines/app/FacesModel2;

    iget-object v1, p0, Lcom/smartengines/app/FacesModel2$onSlotsChanged$1;->$photoA:Lcom/smartengines/app/Photo;

    iget-object v2, p0, Lcom/smartengines/app/FacesModel2$onSlotsChanged$1;->$photoB:Lcom/smartengines/app/Photo;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/smartengines/app/FacesModel2$onSlotsChanged$1;-><init>(Lcom/smartengines/app/FacesModel2;Lcom/smartengines/app/Photo;Lcom/smartengines/app/Photo;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/FacesModel2$onSlotsChanged$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/FacesModel2$onSlotsChanged$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/smartengines/app/FacesModel2$onSlotsChanged$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/smartengines/app/FacesModel2$onSlotsChanged$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 60
    iget v0, p0, Lcom/smartengines/app/FacesModel2$onSlotsChanged$1;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    sget-object p1, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {p1}, Lcom/smartengines/app/Model;->getEngines()Lcom/smartengines/app/EngineList;

    move-result-object p1

    invoke-virtual {p1}, Lcom/smartengines/app/EngineList;->getId()Lcom/smartengines/app/EngineStaff;

    move-result-object p1

    invoke-virtual {p1}, Lcom/smartengines/app/EngineStaff;->getLoader()Lcom/smartengines/engine/EngineLoader;

    move-result-object p1

    invoke-virtual {p1}, Lcom/smartengines/engine/EngineLoader;->getEngine()Lcom/smartengines/engine/Engine;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.smartengines.engine.id.IdEngineWrapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/smartengines/engine/id/IdEngineWrapper;

    .line 62
    iget-object v0, p0, Lcom/smartengines/app/FacesModel2$onSlotsChanged$1;->this$0:Lcom/smartengines/app/FacesModel2;

    iget-object v1, p0, Lcom/smartengines/app/FacesModel2$onSlotsChanged$1;->$photoA:Lcom/smartengines/app/Photo;

    invoke-virtual {v1}, Lcom/smartengines/app/Photo;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    iget-object v2, p0, Lcom/smartengines/app/FacesModel2$onSlotsChanged$1;->$photoB:Lcom/smartengines/app/Photo;

    invoke-virtual {v2}, Lcom/smartengines/app/Photo;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-static {p1, v1, v2}, Lcom/smartengines/engine/id/FacesKt;->compareFaces(Lcom/smartengines/engine/id/IdEngineWrapper;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)Lcom/smartengines/engine/id/FacesResult;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/smartengines/app/FacesModel2;->setResult(Lcom/smartengines/engine/id/FacesResult;)V

    .line 63
    iget-object p1, p0, Lcom/smartengines/app/FacesModel2$onSlotsChanged$1;->this$0:Lcom/smartengines/app/FacesModel2;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/smartengines/app/FacesModel2;->access$setProcessingJob$p(Lcom/smartengines/app/FacesModel2;Lkotlinx/coroutines/Job;)V

    .line 64
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 60
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
