.class public final synthetic Lcom/smartengines/app/ui/HomeScreenContentKt$EngineButton$1$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/smartengines/engine/EngineLoadingState;

.field public final synthetic f$1:Lcom/smartengines/engine/EngineId;


# direct methods
.method public synthetic constructor <init>(Lcom/smartengines/engine/EngineLoadingState;Lcom/smartengines/engine/EngineId;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/HomeScreenContentKt$EngineButton$1$1$$ExternalSyntheticLambda0;->f$0:Lcom/smartengines/engine/EngineLoadingState;

    iput-object p2, p0, Lcom/smartengines/app/ui/HomeScreenContentKt$EngineButton$1$1$$ExternalSyntheticLambda0;->f$1:Lcom/smartengines/engine/EngineId;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/HomeScreenContentKt$EngineButton$1$1$$ExternalSyntheticLambda0;->f$0:Lcom/smartengines/engine/EngineLoadingState;

    iget-object v1, p0, Lcom/smartengines/app/ui/HomeScreenContentKt$EngineButton$1$1$$ExternalSyntheticLambda0;->f$1:Lcom/smartengines/engine/EngineId;

    invoke-static {v0, v1}, Lcom/smartengines/app/ui/HomeScreenContentKt$EngineButton$1$1;->$r8$lambda$Z7BPx2s9wLmstYlZSFYU3f3JlKY(Lcom/smartengines/engine/EngineLoadingState;Lcom/smartengines/engine/EngineId;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
