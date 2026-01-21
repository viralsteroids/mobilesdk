.class final Lcom/smartengines/engine/EngineLoader$load$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "EngineLoader.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/engine/EngineLoader;->load(Landroid/content/Context;Ljava/lang/String;Lcom/smartengines/engine/EngineBundle;Lkotlin/jvm/functions/Function2;)V
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
    c = "com.smartengines.engine.EngineLoader$load$1"
    f = "EngineLoader.kt"
    i = {
        0x1
    }
    l = {
        0x36,
        0x56,
        0x59,
        0x5f
    }
    m = "invokeSuspend"
    n = {
        "timeStart"
    }
    s = {
        "J$0"
    }
.end annotation


# instance fields
.field final synthetic $bundle:Lcom/smartengines/engine/EngineBundle;

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $jniLibrary:Ljava/lang/String;

.field final synthetic $onLoaded:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
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
.end field

.field J$0:J

.field label:I

.field final synthetic this$0:Lcom/smartengines/engine/EngineLoader;


# direct methods
.method constructor <init>(Lcom/smartengines/engine/EngineLoader;Ljava/lang/String;Lcom/smartengines/engine/EngineBundle;Landroid/content/Context;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/engine/EngineLoader;",
            "Ljava/lang/String;",
            "Lcom/smartengines/engine/EngineBundle;",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/smartengines/engine/Engine;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/smartengines/engine/EngineLoader$load$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/smartengines/engine/EngineLoader$load$1;->this$0:Lcom/smartengines/engine/EngineLoader;

    iput-object p2, p0, Lcom/smartengines/engine/EngineLoader$load$1;->$jniLibrary:Ljava/lang/String;

    iput-object p3, p0, Lcom/smartengines/engine/EngineLoader$load$1;->$bundle:Lcom/smartengines/engine/EngineBundle;

    iput-object p4, p0, Lcom/smartengines/engine/EngineLoader$load$1;->$context:Landroid/content/Context;

    iput-object p5, p0, Lcom/smartengines/engine/EngineLoader$load$1;->$onLoaded:Lkotlin/jvm/functions/Function2;

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

    new-instance v0, Lcom/smartengines/engine/EngineLoader$load$1;

    iget-object v1, p0, Lcom/smartengines/engine/EngineLoader$load$1;->this$0:Lcom/smartengines/engine/EngineLoader;

    iget-object v2, p0, Lcom/smartengines/engine/EngineLoader$load$1;->$jniLibrary:Ljava/lang/String;

    iget-object v3, p0, Lcom/smartengines/engine/EngineLoader$load$1;->$bundle:Lcom/smartengines/engine/EngineBundle;

    iget-object v4, p0, Lcom/smartengines/engine/EngineLoader$load$1;->$context:Landroid/content/Context;

    iget-object v5, p0, Lcom/smartengines/engine/EngineLoader$load$1;->$onLoaded:Lkotlin/jvm/functions/Function2;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/smartengines/engine/EngineLoader$load$1;-><init>(Lcom/smartengines/engine/EngineLoader;Ljava/lang/String;Lcom/smartengines/engine/EngineBundle;Landroid/content/Context;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/engine/EngineLoader$load$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/engine/EngineLoader$load$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/smartengines/engine/EngineLoader$load$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/smartengines/engine/EngineLoader$load$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 52
    iget v1, p0, Lcom/smartengines/engine/EngineLoader$load$1;->label:I

    const/4 v2, 0x4

    const/4 v3, 0x3

    const-string v4, "engine.Engine"

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v6, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_7

    :cond_2
    iget-wide v5, p0, Lcom/smartengines/engine/EngineLoader$load$1;->J$0:J

    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 54
    :try_start_2
    iget-object p1, p0, Lcom/smartengines/engine/EngineLoader$load$1;->this$0:Lcom/smartengines/engine/EngineLoader;

    invoke-static {p1}, Lcom/smartengines/engine/EngineLoader;->access$get_loadingState$p(Lcom/smartengines/engine/EngineLoader;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    sget-object v1, Lcom/smartengines/engine/EngineLoadingState$Loading;->INSTANCE:Lcom/smartengines/engine/EngineLoadingState$Loading;

    move-object v7, p0

    check-cast v7, Lkotlin/coroutines/Continuation;

    iput v6, p0, Lcom/smartengines/engine/EngineLoader$load$1;->label:I

    invoke-interface {p1, v1, v7}, Lkotlinx/coroutines/flow/MutableStateFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto/16 :goto_6

    .line 55
    :cond_5
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 58
    iget-object p1, p0, Lcom/smartengines/engine/EngineLoader$load$1;->$jniLibrary:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 61
    iget-object p1, p0, Lcom/smartengines/engine/EngineLoader$load$1;->$bundle:Lcom/smartengines/engine/EngineBundle;

    .line 63
    instance-of v1, p1, Lcom/smartengines/engine/EngineBundle$File;

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/smartengines/engine/EngineLoader$load$1;->$context:Landroid/content/Context;

    check-cast p1, Lcom/smartengines/engine/EngineBundle$File;

    invoke-virtual {p1}, Lcom/smartengines/engine/EngineBundle$File;->getFilePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/smartengines/utils/UtilsKt;->readAssetsFile(Landroid/content/Context;Ljava/lang/String;)[B

    move-result-object p1

    goto/16 :goto_3

    .line 65
    :cond_6
    instance-of v1, p1, Lcom/smartengines/engine/EngineBundle$FirstFound;

    const/4 v8, 0x0

    if-eqz v1, :cond_a

    .line 67
    iget-object p1, p0, Lcom/smartengines/engine/EngineLoader$load$1;->$context:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    iget-object v1, p0, Lcom/smartengines/engine/EngineLoader$load$1;->$bundle:Lcom/smartengines/engine/EngineBundle;

    check-cast v1, Lcom/smartengines/engine/EngineBundle$FirstFound;

    invoke-virtual {v1}, Lcom/smartengines/engine/EngineBundle$FirstFound;->getDirToSearch()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_8

    iget-object v1, p0, Lcom/smartengines/engine/EngineLoader$load$1;->$bundle:Lcom/smartengines/engine/EngineBundle;

    array-length v9, p1

    const/4 v10, 0x0

    move v11, v10

    :goto_1
    if-ge v11, v9, :cond_8

    aget-object v12, p1, v11

    .line 68
    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v13, v1

    check-cast v13, Lcom/smartengines/engine/EngineBundle$FirstFound;

    invoke-virtual {v13}, Lcom/smartengines/engine/EngineBundle$FirstFound;->getFileExtension()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13, v10, v5, v8}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    move-object v8, v12

    goto :goto_2

    :cond_7
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_8
    :goto_2
    if-eqz v8, :cond_9

    .line 71
    iget-object p1, p0, Lcom/smartengines/engine/EngineLoader$load$1;->$context:Landroid/content/Context;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, p0, Lcom/smartengines/engine/EngineLoader$load$1;->$bundle:Lcom/smartengines/engine/EngineBundle;

    check-cast v9, Lcom/smartengines/engine/EngineBundle$FirstFound;

    invoke-virtual {v9}, Lcom/smartengines/engine/EngineBundle$FirstFound;->getDirToSearch()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v9, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/smartengines/utils/UtilsKt;->readAssetsFile(Landroid/content/Context;Ljava/lang/String;)[B

    move-result-object p1

    goto :goto_3

    .line 70
    :cond_9
    new-instance p1, Ljava/lang/Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bundle file not found, dir: \"assets/"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v3, p0, Lcom/smartengines/engine/EngineLoader$load$1;->$bundle:Lcom/smartengines/engine/EngineBundle;

    check-cast v3, Lcom/smartengines/engine/EngineBundle$FirstFound;

    invoke-virtual {v3}, Lcom/smartengines/engine/EngineBundle$FirstFound;->getDirToSearch()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "\" file extension: \""

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v3, p0, Lcom/smartengines/engine/EngineLoader$load$1;->$bundle:Lcom/smartengines/engine/EngineBundle;

    check-cast v3, Lcom/smartengines/engine/EngineBundle$FirstFound;

    invoke-virtual {v3}, Lcom/smartengines/engine/EngineBundle$FirstFound;->getFileExtension()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/16 v3, 0x22

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    .line 74
    :cond_a
    sget-object v1, Lcom/smartengines/engine/EngineBundle$Embedded;->INSTANCE:Lcom/smartengines/engine/EngineBundle$Embedded;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_d

    move-object p1, v8

    :goto_3
    if-eqz p1, :cond_b

    .line 78
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "bundle data is loaded (size:"

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length v8, p1

    const v9, 0xf4240

    div-int/2addr v8, v9

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v8, "Mb)"

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 82
    :cond_b
    iget-object v1, p0, Lcom/smartengines/engine/EngineLoader$load$1;->this$0:Lcom/smartengines/engine/EngineLoader;

    invoke-virtual {v1}, Lcom/smartengines/engine/EngineLoader;->getEngine()Lcom/smartengines/engine/Engine;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/smartengines/engine/Engine;->createEngine([B)V

    .line 83
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/smartengines/engine/EngineLoader$load$1;->this$0:Lcom/smartengines/engine/EngineLoader;

    invoke-virtual {v1}, Lcom/smartengines/engine/EngineLoader;->getEngine()Lcom/smartengines/engine/Engine;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v1, ": engine is created"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    iget-object p1, p0, Lcom/smartengines/engine/EngineLoader$load$1;->$onLoaded:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, Lcom/smartengines/engine/EngineLoader$load$1;->this$0:Lcom/smartengines/engine/EngineLoader;

    invoke-virtual {v1}, Lcom/smartengines/engine/EngineLoader;->getEngine()Lcom/smartengines/engine/Engine;

    move-result-object v1

    iput-wide v6, p0, Lcom/smartengines/engine/EngineLoader$load$1;->J$0:J

    iput v5, p0, Lcom/smartengines/engine/EngineLoader$load$1;->label:I

    invoke-interface {p1, v1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_c

    goto :goto_6

    :cond_c
    move-wide v5, v6

    .line 89
    :goto_4
    iget-object p1, p0, Lcom/smartengines/engine/EngineLoader$load$1;->this$0:Lcom/smartengines/engine/EngineLoader;

    invoke-static {p1}, Lcom/smartengines/engine/EngineLoader;->access$get_loadingState$p(Lcom/smartengines/engine/EngineLoader;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    new-instance v1, Lcom/smartengines/engine/EngineLoadingState$Loaded;

    .line 90
    iget-object v7, p0, Lcom/smartengines/engine/EngineLoader$load$1;->this$0:Lcom/smartengines/engine/EngineLoader;

    invoke-virtual {v7}, Lcom/smartengines/engine/EngineLoader;->getEngine()Lcom/smartengines/engine/Engine;

    move-result-object v7

    .line 91
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sub-long/2addr v8, v5

    .line 89
    invoke-direct {v1, v7, v8, v9}, Lcom/smartengines/engine/EngineLoadingState$Loaded;-><init>(Lcom/smartengines/engine/Engine;J)V

    move-object v5, p0

    check-cast v5, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcom/smartengines/engine/EngineLoader$load$1;->label:I

    invoke-interface {p1, v1, v5}, Lkotlinx/coroutines/flow/MutableStateFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_e

    goto :goto_6

    .line 61
    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 94
    :goto_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/smartengines/engine/EngineLoader$load$1;->this$0:Lcom/smartengines/engine/EngineLoader;

    invoke-virtual {v3}, Lcom/smartengines/engine/EngineLoader;->getEngine()Lcom/smartengines/engine/Engine;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ": engine loading error"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 95
    iget-object v1, p0, Lcom/smartengines/engine/EngineLoader$load$1;->this$0:Lcom/smartengines/engine/EngineLoader;

    invoke-static {v1}, Lcom/smartengines/engine/EngineLoader;->access$get_loadingState$p(Lcom/smartengines/engine/EngineLoader;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v1

    new-instance v3, Lcom/smartengines/engine/EngineLoadingState$Error;

    iget-object v4, p0, Lcom/smartengines/engine/EngineLoader$load$1;->this$0:Lcom/smartengines/engine/EngineLoader;

    invoke-virtual {v4}, Lcom/smartengines/engine/EngineLoader;->getEngine()Lcom/smartengines/engine/Engine;

    move-result-object v4

    invoke-direct {v3, v4, p1}, Lcom/smartengines/engine/EngineLoadingState$Error;-><init>(Lcom/smartengines/engine/Engine;Ljava/lang/Throwable;)V

    move-object p1, p0

    check-cast p1, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/smartengines/engine/EngineLoader$load$1;->label:I

    invoke-interface {v1, v3, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_e

    :goto_6
    return-object v0

    .line 97
    :cond_e
    :goto_7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
