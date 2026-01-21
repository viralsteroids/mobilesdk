.class public final Lcom/smartengines/app/com/smartengines/app/Statistics;
.super Ljava/lang/Object;
.source "Statistics.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/app/com/smartengines/app/Statistics$State;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0017\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/smartengines/app/com/smartengines/app/Statistics;",
        "",
        "context",
        "Landroid/content/Context;",
        "engineType",
        "",
        "<init>",
        "(Landroid/content/Context;Ljava/lang/String;)V",
        "getEngineType",
        "()Ljava/lang/String;",
        "state",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/smartengines/app/com/smartengines/app/Statistics$State;",
        "getState",
        "()Lkotlinx/coroutines/flow/MutableStateFlow;",
        "State",
        "app_storeRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final engineType:Ljava/lang/String;

.field private final state:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/smartengines/app/com/smartengines/app/Statistics$State;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "engineType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/smartengines/app/com/smartengines/app/Statistics;->engineType:Ljava/lang/String;

    .line 25
    sget-object p2, Lcom/smartengines/app/com/smartengines/app/Statistics$State$Loading;->INSTANCE:Lcom/smartengines/app/com/smartengines/app/Statistics$State$Loading;

    invoke-static {p2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/smartengines/app/com/smartengines/app/Statistics;->state:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 28
    const-string p2, "myapp.Statistics"

    const-string v0, "init"

    invoke-static {p2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p2

    check-cast p2, Lkotlin/coroutines/CoroutineContext;

    invoke-static {p2}, Lkotlinx/coroutines/CoroutineScopeKt;->CoroutineScope(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v0

    new-instance p2, Lcom/smartengines/app/com/smartengines/app/Statistics$1;

    const/4 v1, 0x0

    invoke-direct {p2, p0, p1, v1}, Lcom/smartengines/app/com/smartengines/app/Statistics$1;-><init>(Lcom/smartengines/app/com/smartengines/app/Statistics;Landroid/content/Context;Lkotlin/coroutines/Continuation;)V

    move-object v3, p2

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method


# virtual methods
.method public final getEngineType()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/smartengines/app/com/smartengines/app/Statistics;->engineType:Ljava/lang/String;

    return-object v0
.end method

.method public final getState()Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/smartengines/app/com/smartengines/app/Statistics$State;",
            ">;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/smartengines/app/com/smartengines/app/Statistics;->state:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object v0
.end method
