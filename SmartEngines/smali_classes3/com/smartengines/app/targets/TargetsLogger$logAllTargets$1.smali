.class final Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "TargetsLogger.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/targets/TargetsLogger;->logAllTargets(Landroid/content/Context;)V
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
    c = "com.smartengines.app.targets.TargetsLogger$logAllTargets$1"
    f = "TargetsLogger.kt"
    i = {
        0x1
    }
    l = {
        0x45,
        0x51,
        0x68,
        0x6c
    }
    m = "invokeSuspend"
    n = {
        "json"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

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
            "Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;->$context:Landroid/content/Context;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
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

    new-instance p1, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;

    iget-object v0, p0, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;->$context:Landroid/content/Context;

    invoke-direct {p1, v0, p2}, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;-><init>(Landroid/content/Context;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v1, p0

    const-string v0, "data saved in file:\nDocuments/\n    "

    const-string v2, "SUCCESS. Targets data saved in file: "

    const-string v3, "SE LOG "

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 67
    iget v5, v1, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;->label:I

    const-string v6, "myapp.TargetsLogger"

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x1

    const/4 v10, 0x2

    const/4 v11, 0x0

    if-eqz v5, :cond_4

    if-eq v5, v9, :cond_3

    if-eq v5, v10, :cond_2

    if-eq v5, v8, :cond_1

    if-ne v5, v7, :cond_0

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_2

    :cond_2
    iget-object v5, v1, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v9, v1, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;->L$1:Ljava/lang/Object;

    check-cast v9, Lorg/json/JSONObject;

    iget-object v12, v1, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;->L$0:Ljava/lang/Object;

    check-cast v12, Lorg/json/JSONObject;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v13, v12

    move-object/from16 v12, p1

    goto :goto_1

    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :catch_0
    move-exception v0

    goto/16 :goto_3

    :cond_4
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 69
    :try_start_3
    sget-object v5, Lcom/smartengines/app/targets/TargetsLogger;->INSTANCE:Lcom/smartengines/app/targets/TargetsLogger;

    move-object v12, v1

    check-cast v12, Lkotlin/coroutines/Continuation;

    iput v9, v1, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;->label:I

    invoke-static {v5, v12}, Lcom/smartengines/app/targets/TargetsLogger;->access$startProgress(Lcom/smartengines/app/targets/TargetsLogger;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_5

    goto/16 :goto_4

    .line 70
    :cond_5
    :goto_0
    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 73
    sget-object v5, Lcom/smartengines/app/targets/TargetsLogger;->INSTANCE:Lcom/smartengines/app/targets/TargetsLogger;

    sget-object v5, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {v5}, Lcom/smartengines/app/Model;->getHomeScreenTargets()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v5}, Lcom/smartengines/app/targets/TargetsLogger;->access$setSize$p(I)V

    .line 80
    const-string v5, "quick_start"

    .line 81
    sget-object v12, Lcom/smartengines/app/targets/TargetsLogger;->INSTANCE:Lcom/smartengines/app/targets/TargetsLogger;

    sget-object v13, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {v13}, Lcom/smartengines/app/Model;->getHomeScreenTargets()Ljava/util/List;

    move-result-object v13

    move-object v14, v1

    check-cast v14, Lkotlin/coroutines/Continuation;

    iput-object v9, v1, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;->L$0:Ljava/lang/Object;

    iput-object v9, v1, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;->L$1:Ljava/lang/Object;

    iput-object v5, v1, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;->L$2:Ljava/lang/Object;

    iput v10, v1, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;->label:I

    invoke-static {v12, v13, v14}, Lcom/smartengines/app/targets/TargetsLogger;->access$processChildren(Lcom/smartengines/app/targets/TargetsLogger;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v4, :cond_6

    goto/16 :goto_4

    :cond_6
    move-object v13, v9

    .line 79
    :goto_1
    invoke-virtual {v9, v5, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 94
    invoke-virtual {v13, v10}, Lorg/json/JSONObject;->toString(I)Ljava/lang/String;

    move-result-object v5

    const-string/jumbo v9, "toString(...)"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v9, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v5, v9}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v14

    const-string v5, "getBytes(...)"

    invoke-static {v14, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v9, "YYYY-MM-dd HH.mm"

    invoke-direct {v3, v9}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v9, Ljava/util/Date;

    invoke-direct {v9}, Ljava/util/Date;-><init>()V

    invoke-virtual {v3, v9}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, ".json"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    .line 96
    sget-object v12, Lcom/smartengines/utils/MediaStoreWrapper;->INSTANCE:Lcom/smartengines/utils/MediaStoreWrapper;

    .line 97
    iget-object v13, v1, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;->$context:Landroid/content/Context;

    .line 99
    sget-object v15, Lcom/smartengines/utils/MediaStoreWrapper$FileDirectories;->Documents:Lcom/smartengines/utils/MediaStoreWrapper$FileDirectories;

    .line 101
    const-string v17, "application/json"

    .line 96
    invoke-virtual/range {v12 .. v17}, Lcom/smartengines/utils/MediaStoreWrapper;->saveFile(Landroid/content/Context;[BLcom/smartengines/utils/MediaStoreWrapper$FileDirectories;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v3, v16

    .line 103
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 104
    sget-object v2, Lcom/smartengines/app/targets/TargetsLogger;->INSTANCE:Lcom/smartengines/app/targets/TargetsLogger;

    invoke-virtual {v2}, Lcom/smartengines/app/targets/TargetsLogger;->getState()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v2

    new-instance v5, Lcom/smartengines/app/targets/TargetsLogger$State$Success;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/smartengines/app/targets/TargetsLogger$State$Success;-><init>(Ljava/lang/String;)V

    move-object v0, v1

    check-cast v0, Lkotlin/coroutines/Continuation;

    iput-object v11, v1, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;->L$0:Ljava/lang/Object;

    iput-object v11, v1, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;->L$1:Ljava/lang/Object;

    iput-object v11, v1, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;->L$2:Ljava/lang/Object;

    iput v8, v1, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;->label:I

    invoke-interface {v2, v5, v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne v0, v4, :cond_7

    goto :goto_4

    .line 110
    :cond_7
    :goto_2
    sget-object v0, Lcom/smartengines/app/targets/TargetsLogger;->INSTANCE:Lcom/smartengines/app/targets/TargetsLogger;

    invoke-static {v11}, Lcom/smartengines/app/targets/TargetsLogger;->access$setJob$p(Lkotlinx/coroutines/Job;)V

    goto :goto_5

    .line 106
    :goto_3
    :try_start_4
    const-string v2, "logAllTargets error"

    move-object v3, v0

    check-cast v3, Ljava/lang/Throwable;

    invoke-static {v6, v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 107
    sget-object v2, Lcom/smartengines/app/targets/TargetsLogger;->INSTANCE:Lcom/smartengines/app/targets/TargetsLogger;

    invoke-virtual {v2}, Lcom/smartengines/app/targets/TargetsLogger;->getState()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v2

    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lcom/smartengines/app/targets/TargetsLogger$State$Ready;->INSTANCE:Lcom/smartengines/app/targets/TargetsLogger$State$Ready;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    .line 108
    sget-object v2, Lcom/smartengines/app/targets/TargetsLogger;->INSTANCE:Lcom/smartengines/app/targets/TargetsLogger;

    invoke-virtual {v2}, Lcom/smartengines/app/targets/TargetsLogger;->getState()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v2

    new-instance v3, Lcom/smartengines/app/targets/TargetsLogger$State$Error;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_8

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v5

    :cond_8
    invoke-direct {v3, v5}, Lcom/smartengines/app/targets/TargetsLogger$State$Error;-><init>(Ljava/lang/String;)V

    move-object v0, v1

    check-cast v0, Lkotlin/coroutines/Continuation;

    iput-object v11, v1, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;->L$0:Ljava/lang/Object;

    iput-object v11, v1, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;->L$1:Ljava/lang/Object;

    iput-object v11, v1, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;->L$2:Ljava/lang/Object;

    iput v7, v1, Lcom/smartengines/app/targets/TargetsLogger$logAllTargets$1;->label:I

    invoke-interface {v2, v3, v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-ne v0, v4, :cond_7

    :goto_4
    return-object v4

    .line 112
    :goto_5
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 110
    :goto_6
    sget-object v2, Lcom/smartengines/app/targets/TargetsLogger;->INSTANCE:Lcom/smartengines/app/targets/TargetsLogger;

    invoke-static {v11}, Lcom/smartengines/app/targets/TargetsLogger;->access$setJob$p(Lkotlinx/coroutines/Job;)V

    throw v0
.end method
