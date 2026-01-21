.class public final synthetic Lcom/smartengines/app/ui/results/TextResultToHtmlKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Ljava/lang/StringBuilder;

.field public final synthetic f$1:Lcom/smartengines/engine/text/TextResultChunk;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/StringBuilder;Lcom/smartengines/engine/text/TextResultChunk;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/ui/results/TextResultToHtmlKt$$ExternalSyntheticLambda0;->f$0:Ljava/lang/StringBuilder;

    iput-object p2, p0, Lcom/smartengines/app/ui/results/TextResultToHtmlKt$$ExternalSyntheticLambda0;->f$1:Lcom/smartengines/engine/text/TextResultChunk;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/smartengines/app/ui/results/TextResultToHtmlKt$$ExternalSyntheticLambda0;->f$0:Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/smartengines/app/ui/results/TextResultToHtmlKt$$ExternalSyntheticLambda0;->f$1:Lcom/smartengines/engine/text/TextResultChunk;

    invoke-static {v0, v1}, Lcom/smartengines/app/ui/results/TextResultToHtmlKt;->$r8$lambda$Mz6MNJUyDdShDhEgbalI5lHRp5o(Ljava/lang/StringBuilder;Lcom/smartengines/engine/text/TextResultChunk;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
