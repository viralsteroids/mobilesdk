.class public final Lcom/smartengines/engine/code/CodeSessionWrapper;
.super Ljava/lang/Object;
.source "CodeSessionWrapper.kt"

# interfaces
.implements Lcom/smartengines/engine/Session;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0008\u0010 \u001a\u00020\u001dH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@RX\u0096\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0017X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lcom/smartengines/engine/code/CodeSessionWrapper;",
        "Lcom/smartengines/engine/Session;",
        "codeEngine",
        "Lcom/smartengines/code/CodeEngine;",
        "codeSessionSettings",
        "Lcom/smartengines/code/CodeEngineSessionSettings;",
        "signature",
        "",
        "<init>",
        "(Lcom/smartengines/code/CodeEngine;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;)V",
        "getCodeSessionSettings",
        "()Lcom/smartengines/code/CodeEngineSessionSettings;",
        "codeSession",
        "Lcom/smartengines/code/CodeEngineSession;",
        "getCodeSession",
        "()Lcom/smartengines/code/CodeEngineSession;",
        "value",
        "",
        "isEnded",
        "()Z",
        "quads",
        "Lcom/smartengines/visualization/Visualization$Quads;",
        "visualizations",
        "",
        "getVisualizations",
        "()Ljava/util/List;",
        "callback",
        "Lcom/smartengines/engine/code/CodeCallback;",
        "processImage",
        "",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "delete",
        "currentResult",
        "Lcom/smartengines/engine/Result;",
        "getCurrentResult",
        "()Lcom/smartengines/engine/Result;",
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
.field private final callback:Lcom/smartengines/engine/code/CodeCallback;

.field private final codeSession:Lcom/smartengines/code/CodeEngineSession;

.field private final codeSessionSettings:Lcom/smartengines/code/CodeEngineSessionSettings;

.field private isEnded:Z

.field private final quads:Lcom/smartengines/visualization/Visualization$Quads;

.field private final visualizations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/smartengines/visualization/Visualization$Quads;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/smartengines/code/CodeEngine;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;)V
    .locals 4

    const-string v0, "codeEngine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "codeSessionSettings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "signature"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p2, p0, Lcom/smartengines/engine/code/CodeSessionWrapper;->codeSessionSettings:Lcom/smartengines/code/CodeEngineSessionSettings;

    .line 34
    new-instance v0, Lcom/smartengines/visualization/Visualization$Quads;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lcom/smartengines/visualization/Visualization$Quads;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/smartengines/engine/code/CodeSessionWrapper;->quads:Lcom/smartengines/visualization/Visualization$Quads;

    .line 35
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/smartengines/engine/code/CodeSessionWrapper;->visualizations:Ljava/util/List;

    .line 37
    new-instance v1, Lcom/smartengines/engine/code/CodeCallback;

    .line 38
    new-instance v3, Lcom/smartengines/engine/code/CodeSessionWrapper$callback$1;

    invoke-direct {v3, v0}, Lcom/smartengines/engine/code/CodeSessionWrapper$callback$1;-><init>(Ljava/lang/Object;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 37
    invoke-direct {v1, v3, v2}, Lcom/smartengines/engine/code/CodeCallback;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    iput-object v1, p0, Lcom/smartengines/engine/code/CodeSessionWrapper;->callback:Lcom/smartengines/engine/code/CodeCallback;

    .line 49
    check-cast v1, Lcom/smartengines/code/CodeEngineVisualizationFeedback;

    .line 45
    invoke-virtual {p1, p2, p3, v2, v1}, Lcom/smartengines/code/CodeEngine;->SpawnSession(Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Lcom/smartengines/code/CodeEngineWorkflowFeedback;Lcom/smartengines/code/CodeEngineVisualizationFeedback;)Lcom/smartengines/code/CodeEngineSession;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/engine/code/CodeSessionWrapper;->codeSession:Lcom/smartengines/code/CodeEngineSession;

    .line 51
    const-string p1, "myapp.CodeSessionWrapper"

    const-string p2, "Session created"

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public delete()V
    .locals 2

    .line 62
    iget-object v0, p0, Lcom/smartengines/engine/code/CodeSessionWrapper;->codeSession:Lcom/smartengines/code/CodeEngineSession;

    invoke-virtual {v0}, Lcom/smartengines/code/CodeEngineSession;->delete()V

    .line 63
    const-string v0, "myapp.CodeSessionWrapper"

    const-string v1, "Session deleted"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final getCodeSession()Lcom/smartengines/code/CodeEngineSession;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/smartengines/engine/code/CodeSessionWrapper;->codeSession:Lcom/smartengines/code/CodeEngineSession;

    return-object v0
.end method

.method public final getCodeSessionSettings()Lcom/smartengines/code/CodeEngineSessionSettings;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/smartengines/engine/code/CodeSessionWrapper;->codeSessionSettings:Lcom/smartengines/code/CodeEngineSessionSettings;

    return-object v0
.end method

.method public getCurrentResult()Lcom/smartengines/engine/Result;
    .locals 2

    .line 67
    iget-object v0, p0, Lcom/smartengines/engine/code/CodeSessionWrapper;->codeSession:Lcom/smartengines/code/CodeEngineSession;

    invoke-virtual {v0}, Lcom/smartengines/code/CodeEngineSession;->GetCurrentResult()Lcom/smartengines/code/CodeEngineResult;

    move-result-object v0

    const-string v1, "GetCurrentResult(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/smartengines/engine/code/CodeResultParserKt;->parse(Lcom/smartengines/code/CodeEngineResult;)Lcom/smartengines/engine/code/CodeResultData;

    move-result-object v0

    check-cast v0, Lcom/smartengines/engine/Result;

    return-object v0
.end method

.method public bridge synthetic getVisualizations()Ljava/util/Collection;
    .locals 1

    .line 22
    invoke-virtual {p0}, Lcom/smartengines/engine/code/CodeSessionWrapper;->getVisualizations()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public getVisualizations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/smartengines/visualization/Visualization$Quads;",
            ">;"
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/smartengines/engine/code/CodeSessionWrapper;->visualizations:Ljava/util/List;

    return-object v0
.end method

.method public isEnded()Z
    .locals 1

    .line 31
    iget-boolean v0, p0, Lcom/smartengines/engine/code/CodeSessionWrapper;->isEnded:Z

    return v0
.end method

.method public processImage(Landroid/graphics/Bitmap;)V
    .locals 2

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    iget-object v0, p0, Lcom/smartengines/engine/code/CodeSessionWrapper;->quads:Lcom/smartengines/visualization/Visualization$Quads;

    invoke-static {p1}, Lcom/smartengines/utils/UtilsKt;->getSize(Landroid/graphics/Bitmap;)Landroid/util/Size;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/smartengines/visualization/Visualization$Quads;->setFrameSize(Landroid/util/Size;)V

    .line 56
    sget-object v0, Lcom/smartengines/engine/ImageFactory;->INSTANCE:Lcom/smartengines/engine/ImageFactory;

    invoke-virtual {v0, p1}, Lcom/smartengines/engine/ImageFactory;->imageFromBitmap(Landroid/graphics/Bitmap;)Lcom/smartengines/common/Image;

    move-result-object p1

    .line 57
    iget-object v0, p0, Lcom/smartengines/engine/code/CodeSessionWrapper;->codeSession:Lcom/smartengines/code/CodeEngineSession;

    invoke-virtual {v0, p1}, Lcom/smartengines/code/CodeEngineSession;->Process(Lcom/smartengines/common/Image;)Lcom/smartengines/code/CodeEngineResult;

    move-result-object p1

    .line 58
    invoke-virtual {p1}, Lcom/smartengines/code/CodeEngineResult;->IsTerminal()Z

    move-result p1

    iput-boolean p1, p0, Lcom/smartengines/engine/code/CodeSessionWrapper;->isEnded:Z

    return-void
.end method
