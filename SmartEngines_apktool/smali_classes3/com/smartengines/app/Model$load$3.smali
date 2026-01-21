.class final Lcom/smartengines/app/Model$load$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "Model.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/Model;->load(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/smartengines/engine/Engine;",
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
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "engine",
        "Lcom/smartengines/engine/Engine;"
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
    c = "com.smartengines.app.Model$load$3"
    f = "Model.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Landroid/content/Context;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/smartengines/app/Model$load$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/app/Model$load$3;->$context:Landroid/content/Context;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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

    new-instance v0, Lcom/smartengines/app/Model$load$3;

    iget-object v1, p0, Lcom/smartengines/app/Model$load$3;->$context:Landroid/content/Context;

    invoke-direct {v0, v1, p2}, Lcom/smartengines/app/Model$load$3;-><init>(Landroid/content/Context;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/smartengines/app/Model$load$3;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public final invoke(Lcom/smartengines/engine/Engine;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/engine/Engine;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/Model$load$3;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/smartengines/app/Model$load$3;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/smartengines/app/Model$load$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/smartengines/engine/Engine;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/Model$load$3;->invoke(Lcom/smartengines/engine/Engine;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 319
    iget v0, p0, Lcom/smartengines/app/Model$load$3;->label:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/smartengines/app/Model$load$3;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/smartengines/engine/Engine;

    .line 322
    sget-object v0, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {v0}, Lcom/smartengines/app/Model;->getEngines()Lcom/smartengines/app/EngineList;

    move-result-object v0

    invoke-virtual {v0}, Lcom/smartengines/app/EngineList;->getId()Lcom/smartengines/app/EngineStaff;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/app/Model$load$3;->$context:Landroid/content/Context;

    const-string v2, "null cannot be cast to non-null type com.smartengines.engine.id.IdEngineWrapper"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/smartengines/engine/id/IdEngineWrapper;

    invoke-virtual {p1}, Lcom/smartengines/engine/id/IdEngineWrapper;->getIdEngine()Lcom/smartengines/id/IdEngine;

    move-result-object p1

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-static {v1, p1, v3, v2, v3}, Lcom/smartengines/app/targets/IdTargetsKt;->loadIdTargetList$default(Landroid/content/Context;Lcom/smartengines/id/IdEngine;Lcom/smartengines/targets/DocumentTypesStatistics;ILjava/lang/Object;)Lcom/smartengines/app/targets/TreeItem;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/smartengines/app/EngineStaff;->setTargets(Lcom/smartengines/app/targets/TreeItem;)V

    .line 323
    invoke-static {}, Lcom/smartengines/app/Model;->access$getTAG$p()Ljava/lang/String;

    move-result-object p1

    const-string v0, "id-engine target list is loaded"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 326
    sget-object p1, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {p1}, Lcom/smartengines/app/Model;->getBuildFlavor()Lcom/smartengines/app/settings/BuildFlavor;

    move-result-object p1

    sget-object v0, Lcom/smartengines/app/settings/BuildFlavor;->NIGHTLY:Lcom/smartengines/app/settings/BuildFlavor;

    if-ne p1, v0, :cond_0

    .line 327
    sget-object p1, Lcom/smartengines/app/targets/IdTargetTestUtils;->INSTANCE:Lcom/smartengines/app/targets/IdTargetTestUtils;

    invoke-virtual {p1}, Lcom/smartengines/app/targets/IdTargetTestUtils;->runTests()V

    .line 330
    :cond_0
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p1

    check-cast p1, Lkotlin/coroutines/CoroutineContext;

    invoke-static {p1}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v4

    new-instance p1, Lcom/smartengines/app/Model$load$3$1;

    invoke-direct {p1, v3}, Lcom/smartengines/app/Model$load$3$1;-><init>(Lkotlin/coroutines/Continuation;)V

    move-object v7, p1

    check-cast v7, Lkotlin/jvm/functions/Function2;

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 340
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 319
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
