.class final Lcom/smartengines/app/com/smartengines/app/Statistics$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "Statistics.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/com/smartengines/app/Statistics;-><init>(Landroid/content/Context;Ljava/lang/String;)V
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
    c = "com.smartengines.app.com.smartengines.app.Statistics$1"
    f = "Statistics.kt"
    i = {}
    l = {
        0x1f,
        0x2e,
        0x30
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field label:I

.field final synthetic this$0:Lcom/smartengines/app/com/smartengines/app/Statistics;


# direct methods
.method constructor <init>(Lcom/smartengines/app/com/smartengines/app/Statistics;Landroid/content/Context;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/app/com/smartengines/app/Statistics;",
            "Landroid/content/Context;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/smartengines/app/com/smartengines/app/Statistics$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/app/com/smartengines/app/Statistics$1;->this$0:Lcom/smartengines/app/com/smartengines/app/Statistics;

    iput-object p2, p0, Lcom/smartengines/app/com/smartengines/app/Statistics$1;->$context:Landroid/content/Context;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance p1, Lcom/smartengines/app/com/smartengines/app/Statistics$1;

    iget-object v0, p0, Lcom/smartengines/app/com/smartengines/app/Statistics$1;->this$0:Lcom/smartengines/app/com/smartengines/app/Statistics;

    iget-object v1, p0, Lcom/smartengines/app/com/smartengines/app/Statistics$1;->$context:Landroid/content/Context;

    invoke-direct {p1, v0, v1, p2}, Lcom/smartengines/app/com/smartengines/app/Statistics$1;-><init>(Lcom/smartengines/app/com/smartengines/app/Statistics;Landroid/content/Context;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/com/smartengines/app/Statistics$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/com/smartengines/app/Statistics$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/smartengines/app/com/smartengines/app/Statistics$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/smartengines/app/com/smartengines/app/Statistics$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const-string v0, "Unknown engine type: "

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 29
    iget v2, p0, Lcom/smartengines/app/com/smartengines/app/Statistics$1;->label:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_2

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 31
    :try_start_1
    iget-object p1, p0, Lcom/smartengines/app/com/smartengines/app/Statistics$1;->this$0:Lcom/smartengines/app/com/smartengines/app/Statistics;

    invoke-virtual {p1}, Lcom/smartengines/app/com/smartengines/app/Statistics;->getState()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    sget-object v2, Lcom/smartengines/app/com/smartengines/app/Statistics$State$Loading;->INSTANCE:Lcom/smartengines/app/com/smartengines/app/Statistics$State$Loading;

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput v5, p0, Lcom/smartengines/app/com/smartengines/app/Statistics$1;->label:I

    invoke-interface {p1, v2, v6}, Lkotlinx/coroutines/flow/MutableStateFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto/16 :goto_3

    .line 36
    :cond_4
    :goto_0
    new-instance p1, Lcom/smartengines/targets/DocumentTypesStatistics;

    const/4 v2, 0x0

    invoke-direct {p1, v2, v5, v2}, Lcom/smartengines/targets/DocumentTypesStatistics;-><init>(Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    iget-object v2, p0, Lcom/smartengines/app/com/smartengines/app/Statistics$1;->this$0:Lcom/smartengines/app/com/smartengines/app/Statistics;

    invoke-virtual {v2}, Lcom/smartengines/app/com/smartengines/app/Statistics;->getEngineType()Ljava/lang/String;

    move-result-object v2

    .line 39
    const-string v5, "id"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    iget-object v0, p0, Lcom/smartengines/app/com/smartengines/app/Statistics$1;->$context:Landroid/content/Context;

    sget-object v2, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {v2}, Lcom/smartengines/app/Model;->getEngines()Lcom/smartengines/app/EngineList;

    move-result-object v2

    invoke-virtual {v2}, Lcom/smartengines/app/EngineList;->getId()Lcom/smartengines/app/EngineStaff;

    move-result-object v2

    invoke-virtual {v2}, Lcom/smartengines/app/EngineStaff;->getLoader()Lcom/smartengines/engine/EngineLoader;

    move-result-object v2

    invoke-virtual {v2}, Lcom/smartengines/engine/EngineLoader;->getEngine()Lcom/smartengines/engine/Engine;

    move-result-object v2

    const-string v5, "null cannot be cast to non-null type com.smartengines.engine.id.IdEngineWrapper"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/smartengines/engine/id/IdEngineWrapper;

    invoke-virtual {v2}, Lcom/smartengines/engine/id/IdEngineWrapper;->getIdEngine()Lcom/smartengines/id/IdEngine;

    move-result-object v2

    invoke-static {v0, v2, p1}, Lcom/smartengines/app/targets/IdTargetsKt;->loadIdTargetList(Landroid/content/Context;Lcom/smartengines/id/IdEngine;Lcom/smartengines/targets/DocumentTypesStatistics;)Lcom/smartengines/app/targets/TreeItem;

    goto :goto_1

    .line 40
    :cond_5
    const-string v5, "doc"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v0, p0, Lcom/smartengines/app/com/smartengines/app/Statistics$1;->$context:Landroid/content/Context;

    sget-object v2, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {v2}, Lcom/smartengines/app/Model;->getEngines()Lcom/smartengines/app/EngineList;

    move-result-object v2

    invoke-virtual {v2}, Lcom/smartengines/app/EngineList;->getDoc()Lcom/smartengines/app/EngineStaff;

    move-result-object v2

    invoke-virtual {v2}, Lcom/smartengines/app/EngineStaff;->getLoader()Lcom/smartengines/engine/EngineLoader;

    move-result-object v2

    invoke-virtual {v2}, Lcom/smartengines/engine/EngineLoader;->getEngine()Lcom/smartengines/engine/Engine;

    move-result-object v2

    const-string v5, "null cannot be cast to non-null type com.smartengines.engine.doc.DocEngineWrapper"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/smartengines/engine/doc/DocEngineWrapper;

    invoke-virtual {v2}, Lcom/smartengines/engine/doc/DocEngineWrapper;->getDocEngine()Lcom/smartengines/doc/DocEngine;

    move-result-object v2

    invoke-static {v0, v2, p1}, Lcom/smartengines/app/targets/DocTargetsListKt;->loadDocTargetList(Landroid/content/Context;Lcom/smartengines/doc/DocEngine;Lcom/smartengines/targets/DocumentTypesStatistics;)Lcom/smartengines/app/targets/TreeItem;

    .line 44
    :goto_1
    invoke-virtual {p1}, Lcom/smartengines/targets/DocumentTypesStatistics;->calculate()Lcom/smartengines/targets/DocumentTypesStatistics$Calculated;

    move-result-object p1

    .line 46
    iget-object v0, p0, Lcom/smartengines/app/com/smartengines/app/Statistics$1;->this$0:Lcom/smartengines/app/com/smartengines/app/Statistics;

    invoke-virtual {v0}, Lcom/smartengines/app/com/smartengines/app/Statistics;->getState()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    new-instance v2, Lcom/smartengines/app/com/smartengines/app/Statistics$State$Success;

    invoke-direct {v2, p1}, Lcom/smartengines/app/com/smartengines/app/Statistics$State$Success;-><init>(Lcom/smartengines/targets/DocumentTypesStatistics$Calculated;)V

    move-object p1, p0

    check-cast p1, Lkotlin/coroutines/Continuation;

    iput v4, p0, Lcom/smartengines/app/com/smartengines/app/Statistics$1;->label:I

    invoke-interface {v0, v2, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_3

    .line 41
    :cond_6
    new-instance p1, Ljava/lang/Exception;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/smartengines/app/com/smartengines/app/Statistics$1;->this$0:Lcom/smartengines/app/com/smartengines/app/Statistics;

    invoke-virtual {v0}, Lcom/smartengines/app/com/smartengines/app/Statistics;->getEngineType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 48
    :goto_2
    iget-object v0, p0, Lcom/smartengines/app/com/smartengines/app/Statistics$1;->this$0:Lcom/smartengines/app/com/smartengines/app/Statistics;

    invoke-virtual {v0}, Lcom/smartengines/app/com/smartengines/app/Statistics;->getState()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    new-instance v2, Lcom/smartengines/app/com/smartengines/app/Statistics$State$Error;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_7

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v4

    :cond_7
    invoke-direct {v2, v4}, Lcom/smartengines/app/com/smartengines/app/Statistics$State$Error;-><init>(Ljava/lang/String;)V

    move-object p1, p0

    check-cast p1, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcom/smartengines/app/com/smartengines/app/Statistics$1;->label:I

    invoke-interface {v0, v2, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_3
    return-object v1

    .line 52
    :cond_8
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
