.class public final Lcom/smartengines/engine/code/CodeCallback;
.super Lcom/smartengines/code/CodeEngineVisualizationFeedback;
.source "CodeCallback.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B=\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u001a\u0010\u0007\u001a\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R#\u0010\u0002\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR%\u0010\u0007\u001a\u0016\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000b\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/smartengines/engine/code/CodeCallback;",
        "Lcom/smartengines/code/CodeEngineVisualizationFeedback;",
        "onQuads",
        "Lkotlin/Function1;",
        "",
        "Lcom/smartengines/visualization/Quad;",
        "",
        "onRoi",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "getOnQuads",
        "()Lkotlin/jvm/functions/Function1;",
        "getOnRoi",
        "FeedbackReceived",
        "feedbackContainer",
        "Lcom/smartengines/code/CodeEngineFeedbackContainer;",
        "engine_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final onQuads:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/util/Set<",
            "Lcom/smartengines/visualization/Quad;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final onRoi:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/util/Set<",
            "Lcom/smartengines/visualization/Quad;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/Set<",
            "Lcom/smartengines/visualization/Quad;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/Set<",
            "Lcom/smartengines/visualization/Quad;",
            ">;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "onQuads"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Lcom/smartengines/code/CodeEngineVisualizationFeedback;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/smartengines/engine/code/CodeCallback;->onQuads:Lkotlin/jvm/functions/Function1;

    .line 20
    iput-object p2, p0, Lcom/smartengines/engine/code/CodeCallback;->onRoi:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public FeedbackReceived(Lcom/smartengines/code/CodeEngineFeedbackContainer;)V
    .locals 9

    const-string v0, "feedbackContainer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    const-string v0, "===> FeedbackReceived"

    const-string v1, "myapp.CodeCallback"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    check-cast v0, Ljava/util/Set;

    .line 27
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    check-cast v2, Ljava/util/Set;

    .line 29
    :try_start_0
    invoke-virtual {p1}, Lcom/smartengines/code/CodeEngineFeedbackContainer;->QuadranglesBegin()Lcom/smartengines/common/QuadranglesMapIterator;

    move-result-object v3

    .line 30
    :goto_0
    invoke-virtual {p1}, Lcom/smartengines/code/CodeEngineFeedbackContainer;->QuadranglesEnd()Lcom/smartengines/common/QuadranglesMapIterator;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/smartengines/common/QuadranglesMapIterator;->Equals(Lcom/smartengines/common/QuadranglesMapIterator;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 32
    invoke-virtual {v3}, Lcom/smartengines/common/QuadranglesMapIterator;->GetKey()Ljava/lang/String;

    move-result-object v4

    .line 34
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v5, "roi"

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static {v4, v5, v8, v6, v7}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v5, "GetValue(...)"

    if-eqz v4, :cond_0

    .line 35
    :try_start_1
    invoke-virtual {v3}, Lcom/smartengines/common/QuadranglesMapIterator;->GetValue()Lcom/smartengines/common/Quadrangle;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lcom/smartengines/engine/EngineUtilsKt;->toQuad(Lcom/smartengines/common/Quadrangle;)Lcom/smartengines/visualization/Quad;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 37
    :cond_0
    invoke-virtual {v3}, Lcom/smartengines/common/QuadranglesMapIterator;->GetValue()Lcom/smartengines/common/Quadrangle;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lcom/smartengines/engine/EngineUtilsKt;->toQuad(Lcom/smartengines/common/Quadrangle;)Lcom/smartengines/visualization/Quad;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 39
    :goto_1
    invoke-virtual {v3}, Lcom/smartengines/common/QuadranglesMapIterator;->Advance()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 42
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "quads calculation error "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 47
    :cond_1
    iget-object p1, p0, Lcom/smartengines/engine/code/CodeCallback;->onQuads:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    iget-object p1, p0, Lcom/smartengines/engine/code/CodeCallback;->onRoi:Lkotlin/jvm/functions/Function1;

    if-eqz p1, :cond_2

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method public final getOnQuads()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/util/Set<",
            "Lcom/smartengines/visualization/Quad;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 19
    iget-object v0, p0, Lcom/smartengines/engine/code/CodeCallback;->onQuads:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOnRoi()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/util/Set<",
            "Lcom/smartengines/visualization/Quad;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 20
    iget-object v0, p0, Lcom/smartengines/engine/code/CodeCallback;->onRoi:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method
