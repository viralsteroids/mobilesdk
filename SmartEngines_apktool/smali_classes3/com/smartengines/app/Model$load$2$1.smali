.class final Lcom/smartengines/app/Model$load$2$1;
.super Ljava/lang/Object;
.source "Model.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/smartengines/app/Model$load$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public static final INSTANCE:Lcom/smartengines/app/Model$load$2$1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/smartengines/app/Model$load$2$1<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/smartengines/app/Model$load$2$1;

    invoke-direct {v0}, Lcom/smartengines/app/Model$load$2$1;-><init>()V

    sput-object v0, Lcom/smartengines/app/Model$load$2$1;->INSTANCE:Lcom/smartengines/app/Model$load$2$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/smartengines/engine/ImageProcessingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
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

    .line 306
    invoke-static {}, Lcom/smartengines/app/Model;->access$getTAG$p()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "image processor state: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 307
    instance-of p2, p1, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;

    if-eqz p2, :cond_0

    check-cast p1, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;

    invoke-virtual {p1}, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;->getVisualizations()Ljava/util/Collection;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 308
    sget-object p1, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-static {p1}, Lcom/smartengines/app/Model;->access$startVideo(Lcom/smartengines/app/Model;)V

    goto :goto_0

    .line 310
    :cond_0
    sget-object p1, Lcom/smartengines/app/Model;->INSTANCE:Lcom/smartengines/app/Model;

    invoke-static {p1}, Lcom/smartengines/app/Model;->access$stopVideo(Lcom/smartengines/app/Model;)V

    .line 312
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 305
    check-cast p1, Lcom/smartengines/engine/ImageProcessingState;

    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/Model$load$2$1;->emit(Lcom/smartengines/engine/ImageProcessingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
