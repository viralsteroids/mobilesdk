.class public final Lcom/smartengines/engine/doc/DocSessionWrapper;
.super Ljava/lang/Object;
.source "DocSessionWrapper.kt"

# interfaces
.implements Lcom/smartengines/engine/Session;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0008\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001bH\u0016J\u0008\u0010$\u001a\u00020!H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@RX\u0096\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u00158F\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u0018R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u00020&8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(\u00a8\u0006)"
    }
    d2 = {
        "Lcom/smartengines/engine/doc/DocSessionWrapper;",
        "Lcom/smartengines/engine/Session;",
        "docEngine",
        "Lcom/smartengines/doc/DocEngine;",
        "docSessionSettings",
        "Lcom/smartengines/doc/DocSessionSettings;",
        "signature",
        "",
        "<init>",
        "(Lcom/smartengines/doc/DocEngine;Lcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)V",
        "getDocSessionSettings",
        "()Lcom/smartengines/doc/DocSessionSettings;",
        "docSession",
        "Lcom/smartengines/doc/DocSession;",
        "getDocSession",
        "()Lcom/smartengines/doc/DocSession;",
        "value",
        "",
        "isEnded",
        "()Z",
        "visualizations",
        "",
        "Lcom/smartengines/visualization/Visualization;",
        "getVisualizations",
        "()Ljava/util/List;",
        "_processedImages",
        "Ljava/util/ArrayList;",
        "Landroid/graphics/Bitmap;",
        "processedImages",
        "getProcessedImages",
        "_result",
        "Lcom/smartengines/engine/doc/DocResultData;",
        "parseResult",
        "",
        "processImage",
        "bitmap",
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
.field private final _processedImages:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private _result:Lcom/smartengines/engine/doc/DocResultData;

.field private final docSession:Lcom/smartengines/doc/DocSession;

.field private final docSessionSettings:Lcom/smartengines/doc/DocSessionSettings;

.field private isEnded:Z

.field private final visualizations:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/smartengines/visualization/Visualization;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/smartengines/doc/DocEngine;Lcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)V
    .locals 1

    const-string v0, "docEngine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "docSessionSettings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "signature"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p2, p0, Lcom/smartengines/engine/doc/DocSessionWrapper;->docSessionSettings:Lcom/smartengines/doc/DocSessionSettings;

    .line 31
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/smartengines/engine/doc/DocSessionWrapper;->visualizations:Ljava/util/List;

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/smartengines/engine/doc/DocSessionWrapper;->_processedImages:Ljava/util/ArrayList;

    .line 47
    invoke-virtual {p1, p2, p3}, Lcom/smartengines/doc/DocEngine;->SpawnSession(Lcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)Lcom/smartengines/doc/DocSession;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/engine/doc/DocSessionWrapper;->docSession:Lcom/smartengines/doc/DocSession;

    .line 48
    const-string p1, "myapp.DocSessionWrapper"

    const-string p2, "Session created"

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private final parseResult()V
    .locals 2

    .line 40
    iget-object v0, p0, Lcom/smartengines/engine/doc/DocSessionWrapper;->docSession:Lcom/smartengines/doc/DocSession;

    invoke-virtual {v0}, Lcom/smartengines/doc/DocSession;->GetCurrentResult()Lcom/smartengines/doc/DocResult;

    move-result-object v0

    const-string v1, "GetCurrentResult(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-virtual {p0}, Lcom/smartengines/engine/doc/DocSessionWrapper;->getProcessedImages()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/smartengines/engine/doc/DocResultParserKt;->parse(Lcom/smartengines/doc/DocResult;Ljava/util/List;)Lcom/smartengines/engine/doc/DocResultData;

    move-result-object v0

    .line 42
    iget-object v1, p0, Lcom/smartengines/engine/doc/DocSessionWrapper;->docSessionSettings:Lcom/smartengines/doc/DocSessionSettings;

    invoke-static {v0, v1}, Lcom/smartengines/engine/doc/DocResultNamesFillerKt;->fillNames(Lcom/smartengines/engine/doc/DocResultData;Lcom/smartengines/doc/DocSessionSettings;)Lcom/smartengines/engine/doc/DocResultData;

    move-result-object v0

    .line 40
    iput-object v0, p0, Lcom/smartengines/engine/doc/DocSessionWrapper;->_result:Lcom/smartengines/engine/doc/DocResultData;

    return-void
.end method


# virtual methods
.method public delete()V
    .locals 2

    .line 81
    iget-object v0, p0, Lcom/smartengines/engine/doc/DocSessionWrapper;->docSession:Lcom/smartengines/doc/DocSession;

    invoke-virtual {v0}, Lcom/smartengines/doc/DocSession;->delete()V

    .line 82
    const-string v0, "myapp.DocSessionWrapper"

    const-string v1, "Session deleted"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public getCurrentResult()Lcom/smartengines/engine/Result;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/smartengines/engine/doc/DocSessionWrapper;->_result:Lcom/smartengines/engine/doc/DocResultData;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/smartengines/engine/doc/DocSessionWrapper;->parseResult()V

    .line 88
    :cond_0
    iget-object v0, p0, Lcom/smartengines/engine/doc/DocSessionWrapper;->_result:Lcom/smartengines/engine/doc/DocResultData;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Lcom/smartengines/engine/Result;

    return-object v0
.end method

.method public final getDocSession()Lcom/smartengines/doc/DocSession;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/smartengines/engine/doc/DocSessionWrapper;->docSession:Lcom/smartengines/doc/DocSession;

    return-object v0
.end method

.method public final getDocSessionSettings()Lcom/smartengines/doc/DocSessionSettings;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/smartengines/engine/doc/DocSessionWrapper;->docSessionSettings:Lcom/smartengines/doc/DocSessionSettings;

    return-object v0
.end method

.method public final getProcessedImages()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/smartengines/engine/doc/DocSessionWrapper;->_processedImages:Ljava/util/ArrayList;

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public bridge synthetic getVisualizations()Ljava/util/Collection;
    .locals 1

    .line 21
    invoke-virtual {p0}, Lcom/smartengines/engine/doc/DocSessionWrapper;->getVisualizations()Ljava/util/List;

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
            "Lcom/smartengines/visualization/Visualization;",
            ">;"
        }
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/smartengines/engine/doc/DocSessionWrapper;->visualizations:Ljava/util/List;

    return-object v0
.end method

.method public isEnded()Z
    .locals 1

    .line 28
    iget-boolean v0, p0, Lcom/smartengines/engine/doc/DocSessionWrapper;->isEnded:Z

    return v0
.end method

.method public processImage(Landroid/graphics/Bitmap;)V
    .locals 3

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    sget-object v0, Lcom/smartengines/engine/ImageFactory;->INSTANCE:Lcom/smartengines/engine/ImageFactory;

    invoke-virtual {v0, p1}, Lcom/smartengines/engine/ImageFactory;->imageFromBitmap(Landroid/graphics/Bitmap;)Lcom/smartengines/common/Image;

    move-result-object v0

    .line 56
    iget-object v1, p0, Lcom/smartengines/engine/doc/DocSessionWrapper;->docSession:Lcom/smartengines/doc/DocSession;

    invoke-virtual {v1}, Lcom/smartengines/doc/DocSession;->CreateProcessingSettings()Lcom/smartengines/doc/DocProcessingSettings;

    move-result-object v1

    .line 66
    iget-object v2, p0, Lcom/smartengines/engine/doc/DocSessionWrapper;->docSession:Lcom/smartengines/doc/DocSession;

    invoke-virtual {v2, v0, v1}, Lcom/smartengines/doc/DocSession;->ProcessImage(Lcom/smartengines/common/Image;Lcom/smartengines/doc/DocProcessingSettings;)V

    .line 69
    iget-object v0, p0, Lcom/smartengines/engine/doc/DocSessionWrapper;->_processedImages:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    .line 72
    iput-boolean p1, p0, Lcom/smartengines/engine/doc/DocSessionWrapper;->isEnded:Z

    .line 75
    invoke-direct {p0}, Lcom/smartengines/engine/doc/DocSessionWrapper;->parseResult()V

    .line 77
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "processImage finished, doc count: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/smartengines/engine/doc/DocSessionWrapper;->_result:Lcom/smartengines/engine/doc/DocResultData;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/smartengines/engine/doc/DocResultData;->getDocuments()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "myapp.DocSessionWrapper"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
