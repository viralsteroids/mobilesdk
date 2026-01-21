.class public final Lcom/smartengines/engine/id/IdCallback;
.super Lcom/smartengines/id/IdFeedback;
.source "IdCallback.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B;\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0012\u0010\u0015\u001a\u00020\u00062\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0011H\u0016J\u0008\u0010 \u001a\u00020\u0006H\u0016R#\u0010\u0002\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR#\u0010\u0007\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0008\u0010\r\u001a\u0004\u0018\u00010\u0011@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006!"
    }
    d2 = {
        "Lcom/smartengines/engine/id/IdCallback;",
        "Lcom/smartengines/id/IdFeedback;",
        "onDetection",
        "Lkotlin/Function1;",
        "",
        "Lcom/smartengines/visualization/Quad;",
        "",
        "onSegmentation",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "getOnDetection",
        "()Lkotlin/jvm/functions/Function1;",
        "getOnSegmentation",
        "value",
        "",
        "isSessionEnded",
        "()Z",
        "Lcom/smartengines/id/IdResult;",
        "idResult",
        "getIdResult",
        "()Lcom/smartengines/id/IdResult;",
        "FeedbackReceived",
        "p0",
        "Lcom/smartengines/id/IdFeedbackContainer;",
        "TemplateDetectionResultReceived",
        "detectionResult",
        "Lcom/smartengines/id/IdTemplateDetectionResult;",
        "TemplateSegmentationResultReceived",
        "segmentationResult",
        "Lcom/smartengines/id/IdTemplateSegmentationResult;",
        "ResultReceived",
        "result",
        "SessionEnded",
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
.field private idResult:Lcom/smartengines/id/IdResult;

.field private isSessionEnded:Z

.field private final onDetection:Lkotlin/jvm/functions/Function1;
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

.field private final onSegmentation:Lkotlin/jvm/functions/Function1;
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

    const-string v0, "onDetection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSegmentation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-direct {p0}, Lcom/smartengines/id/IdFeedback;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/smartengines/engine/id/IdCallback;->onDetection:Lkotlin/jvm/functions/Function1;

    .line 26
    iput-object p2, p0, Lcom/smartengines/engine/id/IdCallback;->onSegmentation:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public FeedbackReceived(Lcom/smartengines/id/IdFeedbackContainer;)V
    .locals 0

    return-void
.end method

.method public ResultReceived(Lcom/smartengines/id/IdResult;)V
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "   ---> ResultReceived isTerminal="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/smartengines/id/IdResult;->GetIsTerminal()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "myapp.IdCallback"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 101
    iput-object p1, p0, Lcom/smartengines/engine/id/IdCallback;->idResult:Lcom/smartengines/id/IdResult;

    return-void
.end method

.method public SessionEnded()V
    .locals 2

    .line 105
    const-string v0, "myapp.IdCallback"

    const-string v1, "   ---> SessionEnded"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    .line 106
    iput-boolean v0, p0, Lcom/smartengines/engine/id/IdCallback;->isSessionEnded:Z

    return-void
.end method

.method public TemplateDetectionResultReceived(Lcom/smartengines/id/IdTemplateDetectionResult;)V
    .locals 11

    const-string v0, "document_presenter_face_rect"

    const-string v1, "document_presenter_face_quad"

    const-string v2, "   ---> TemplateDetectionResultReceived "

    const-string v3, "myapp.IdCallback"

    const-string v4, "   ---> face: "

    const-string v5, "detectionResult"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-virtual {p1}, Lcom/smartengines/id/IdTemplateDetectionResult;->GetTemplateName()Ljava/lang/String;

    move-result-object v5

    .line 37
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 40
    :try_start_0
    invoke-virtual {p1}, Lcom/smartengines/id/IdTemplateDetectionResult;->GetQuadrangle()Lcom/smartengines/common/Quadrangle;

    move-result-object v7

    const-string v8, "GetQuadrangle(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7}, Lcom/smartengines/engine/EngineUtilsKt;->toQuad(Lcom/smartengines/common/Quadrangle;)Lcom/smartengines/visualization/Quad;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 43
    invoke-virtual {p1, v1}, Lcom/smartengines/id/IdTemplateDetectionResult;->HasAttribute(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {p1, v1}, Lcom/smartengines/id/IdTemplateDetectionResult;->GetAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {p1, v0}, Lcom/smartengines/id/IdTemplateDetectionResult;->HasAttribute(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1, v0}, Lcom/smartengines/id/IdTemplateDetectionResult;->GetAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_3

    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 49
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move v4, v1

    :goto_1
    const/4 v7, 0x4

    if-ge v4, v7, :cond_2

    .line 51
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->optJSONArray(I)Lorg/json/JSONArray;

    move-result-object v7

    .line 53
    new-instance v8, Lcom/smartengines/visualization/QuadPoint;

    invoke-virtual {v7, v1}, Lorg/json/JSONArray;->getInt(I)I

    move-result v9

    int-to-float v9, v9

    const/4 v10, 0x1

    invoke-virtual {v7, v10}, Lorg/json/JSONArray;->getInt(I)I

    move-result v7

    int-to-float v7, v7

    invoke-direct {v8, v9, v7}, Lcom/smartengines/visualization/QuadPoint;-><init>(FF)V

    .line 52
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 57
    :cond_2
    new-instance v0, Lcom/smartengines/visualization/Quad;

    check-cast p1, Ljava/util/List;

    invoke-direct {v0, p1}, Lcom/smartengines/visualization/Quad;-><init>(Ljava/util/List;)V

    invoke-virtual {v6, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 61
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v0, ", quads: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v6}, Ljava/util/HashSet;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 62
    iget-object p1, p0, Lcom/smartengines/engine/id/IdCallback;->onDetection:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v3, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public TemplateSegmentationResultReceived(Lcom/smartengines/id/IdTemplateSegmentationResult;)V
    .locals 5

    const-string v0, "myapp.IdCallback"

    const-string v1, "segmentationResult"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 76
    :try_start_0
    invoke-virtual {p1}, Lcom/smartengines/id/IdTemplateSegmentationResult;->RawFieldQuadranglesBegin()Lcom/smartengines/common/QuadranglesMapIterator;

    move-result-object v2

    .line 77
    :goto_0
    invoke-virtual {p1}, Lcom/smartengines/id/IdTemplateSegmentationResult;->RawFieldQuadranglesEnd()Lcom/smartengines/common/QuadranglesMapIterator;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/smartengines/common/QuadranglesMapIterator;->Equals(Lcom/smartengines/common/QuadranglesMapIterator;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 79
    invoke-virtual {v2}, Lcom/smartengines/common/QuadranglesMapIterator;->GetValue()Lcom/smartengines/common/Quadrangle;

    move-result-object v3

    const-string v4, "GetValue(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lcom/smartengines/engine/EngineUtilsKt;->toQuad(Lcom/smartengines/common/Quadrangle;)Lcom/smartengines/visualization/Quad;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 80
    invoke-virtual {v2}, Lcom/smartengines/common/QuadranglesMapIterator;->Advance()V

    goto :goto_0

    .line 84
    :cond_0
    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 86
    const-string p1, "   ---> TemplateSegmentationResultReceived size: 0 => ignored"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 89
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "   ---> TemplateSegmentationResultReceived size: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    iget-object p1, p0, Lcom/smartengines/engine/id/IdCallback;->onSegmentation:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 94
    const-string v1, "   ---> TemplateSegmentationResultReceived"

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public final getIdResult()Lcom/smartengines/id/IdResult;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/smartengines/engine/id/IdCallback;->idResult:Lcom/smartengines/id/IdResult;

    return-object v0
.end method

.method public final getOnDetection()Lkotlin/jvm/functions/Function1;
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

    .line 25
    iget-object v0, p0, Lcom/smartengines/engine/id/IdCallback;->onDetection:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getOnSegmentation()Lkotlin/jvm/functions/Function1;
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

    .line 26
    iget-object v0, p0, Lcom/smartengines/engine/id/IdCallback;->onSegmentation:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final isSessionEnded()Z
    .locals 1

    .line 28
    iget-boolean v0, p0, Lcom/smartengines/engine/id/IdCallback;->isSessionEnded:Z

    return v0
.end method
