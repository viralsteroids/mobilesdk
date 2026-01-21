.class final Lcom/smartengines/app/Model$1$1;
.super Ljava/lang/Object;
.source "Model.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/Model$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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


# static fields
.field public static final INSTANCE:Lcom/smartengines/app/Model$1$1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/smartengines/app/Model$1$1<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/Model$1$1;

    invoke-direct {v0}, Lcom/smartengines/app/Model$1$1;-><init>()V

    sput-object v0, Lcom/smartengines/app/Model$1$1;->INSTANCE:Lcom/smartengines/app/Model$1$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/smartengines/engine/ImageProcessingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/engine/ImageProcessingState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 454
    invoke-static {}, Lcom/smartengines/app/Model;->access$getTAG$p()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "===================== imageProcessor state: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 456
    instance-of v0, p1, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;

    const/4 v1, 0x0

    if-nez v0, :cond_3

    .line 457
    instance-of v0, p1, Lcom/smartengines/engine/ImageProcessingState$PHOTO_PROCESSING;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 465
    :cond_0
    instance-of p1, p1, Lcom/smartengines/engine/ImageProcessingState$FINISHED;

    if-eqz p1, :cond_2

    .line 467
    sget-object p1, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {p1}, Lcom/smartengines/app/Model;->getResult()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    sget-object p2, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {p2}, Lcom/smartengines/app/Model;->getSession()Lcom/smartengines/engine/Session;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/smartengines/engine/Session;->getCurrentResult()Lcom/smartengines/engine/Result;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 468
    sget-object v0, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {v0, p2}, Lcom/smartengines/app/Model;->calculatePassportKey(Ljava/lang/Object;)V

    move-object v1, p2

    .line 467
    :cond_1
    invoke-interface {p1, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    goto :goto_1

    .line 473
    :cond_2
    sget-object p1, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {p1}, Lcom/smartengines/app/Model;->getResult()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    invoke-interface {p1, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    goto :goto_1

    .line 459
    :cond_3
    :goto_0
    sget-object p1, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-virtual {p1}, Lcom/smartengines/app/Model;->getBuildFlavor()Lcom/smartengines/app/settings/BuildFlavor;

    move-result-object p1

    sget-object v0, Lcom/smartengines/app/settings/BuildFlavor;->FORENSIC:Lcom/smartengines/app/settings/BuildFlavor;

    if-ne p1, v0, :cond_5

    invoke-static {}, Lcom/smartengines/app/AppKt;->getIdSettingsStore()Lcom/smartengines/app/settings/IdSettingsStore;

    move-result-object p1

    invoke-virtual {p1}, Lcom/smartengines/app/settings/IdSettingsStore;->getData()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/smartengines/app/settings/IdSettings;

    invoke-virtual {p1}, Lcom/smartengines/app/settings/IdSettings;->getFlashByDefault()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 460
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object p1

    check-cast p1, Lkotlin/coroutines/CoroutineContext;

    new-instance v0, Lcom/smartengines/app/Model$1$1$1;

    invoke-direct {v0, v1}, Lcom/smartengines/app/Model$1$1$1;-><init>(Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-static {p1, v0, p2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_4

    return-object p1

    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 476
    :cond_5
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 453
    check-cast p1, Lcom/smartengines/engine/ImageProcessingState;

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/Model$1$1;->emit(Lcom/smartengines/engine/ImageProcessingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
