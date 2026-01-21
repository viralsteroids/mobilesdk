.class final Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2;
.super Ljava/lang/Object;
.source "QuadsViewFading.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/visualization/QuadsViewFadingKt;->backgroundTask(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/FlowCollector;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $data:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/util/List<",
            "Lcom/smartengines/visualization/QuadFrame;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $deathTimer:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lkotlinx/coroutines/Job;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlinx/coroutines/flow/MutableStateFlow;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lkotlinx/coroutines/Job;",
            ">;",
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/util/List<",
            "Lcom/smartengines/visualization/QuadFrame;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2;->$deathTimer:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2;->$data:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/smartengines/visualization/QuadFrame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/visualization/QuadFrame;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2$emit$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2$emit$1;

    iget v1, v0, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2$emit$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p2, v0, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2$emit$1;->label:I

    sub-int/2addr p2, v2

    iput p2, v0, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2$emit$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2$emit$1;

    invoke-direct {v0, p0, p2}, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2$emit$1;-><init>(Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2$emit$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 71
    iget v2, v0, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2$emit$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2$emit$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 75
    iget-object p2, p0, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2;->$deathTimer:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object p2, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p2, Lkotlinx/coroutines/Job;

    if-eqz p2, :cond_3

    invoke-static {p2, v3, v4, v3}, Lkotlinx/coroutines/Job$DefaultImpls;->cancel$default(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 78
    :cond_3
    iget-object p2, p0, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2;->$data:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {p2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p0, v0, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2$emit$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2$emit$1;->label:I

    invoke-interface {p2, p1, v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object p1, p0

    .line 81
    :goto_1
    iget-object p2, p1, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2;->$deathTimer:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-interface {v0}, Lkotlin/coroutines/Continuation;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v4

    new-instance v0, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2$1;

    iget-object p1, p1, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2;->$data:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-direct {v0, p1, v3}, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2$1;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/coroutines/Continuation;)V

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function2;

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    iput-object p1, p2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 91
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 71
    check-cast p1, Lcom/smartengines/visualization/QuadFrame;

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/visualization/QuadsViewFadingKt$backgroundTask$2;->emit(Lcom/smartengines/visualization/QuadFrame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
