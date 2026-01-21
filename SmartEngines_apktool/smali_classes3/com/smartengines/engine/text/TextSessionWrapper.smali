.class public final Lcom/smartengines/engine/text/TextSessionWrapper;
.super Ljava/lang/Object;
.source "TextSessionWrapper.kt"

# interfaces
.implements Lcom/smartengines/engine/Session;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001dH\u0017J\u0008\u0010*\u001a\u00020(H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@RX\u0096\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u00178F\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u001aR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%R\u0014\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"
    }
    d2 = {
        "Lcom/smartengines/engine/text/TextSessionWrapper;",
        "Lcom/smartengines/engine/Session;",
        "textEngine",
        "Lcom/smartengines/text/TextEngine;",
        "textSessionSettings",
        "Lcom/smartengines/text/TextSessionSettings;",
        "signature",
        "",
        "<init>",
        "(Lcom/smartengines/text/TextEngine;Lcom/smartengines/text/TextSessionSettings;Ljava/lang/String;)V",
        "getTextSessionSettings",
        "()Lcom/smartengines/text/TextSessionSettings;",
        "textSession",
        "Lcom/smartengines/text/TextSession;",
        "getTextSession",
        "()Lcom/smartengines/text/TextSession;",
        "callback",
        "Lcom/smartengines/engine/text/TextCallback;",
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
        "currentResult",
        "Lcom/smartengines/engine/Result;",
        "getCurrentResult",
        "()Lcom/smartengines/engine/Result;",
        "setCurrentResult",
        "(Lcom/smartengines/engine/Result;)V",
        "supportedTextIterators",
        "processImage",
        "",
        "bitmap",
        "delete",
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

.field private final callback:Lcom/smartengines/engine/text/TextCallback;

.field private currentResult:Lcom/smartengines/engine/Result;

.field private isEnded:Z

.field private final supportedTextIterators:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final textSession:Lcom/smartengines/text/TextSession;

.field private final textSessionSettings:Lcom/smartengines/text/TextSessionSettings;

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
.method public constructor <init>(Lcom/smartengines/text/TextEngine;Lcom/smartengines/text/TextSessionSettings;Ljava/lang/String;)V
    .locals 3

    const-string/jumbo v0, "textEngine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "textSessionSettings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "signature"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p2, p0, Lcom/smartengines/engine/text/TextSessionWrapper;->textSessionSettings:Lcom/smartengines/text/TextSessionSettings;

    .line 31
    new-instance v0, Lcom/smartengines/engine/text/TextCallback;

    invoke-direct {v0}, Lcom/smartengines/engine/text/TextCallback;-><init>()V

    iput-object v0, p0, Lcom/smartengines/engine/text/TextSessionWrapper;->callback:Lcom/smartengines/engine/text/TextCallback;

    .line 36
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/smartengines/engine/text/TextSessionWrapper;->visualizations:Ljava/util/List;

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/smartengines/engine/text/TextSessionWrapper;->_processedImages:Ljava/util/ArrayList;

    .line 47
    invoke-virtual {p2}, Lcom/smartengines/text/TextSessionSettings;->GetSupportedTextIteratorsCount()I

    move-result v0

    if-eqz v0, :cond_1

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 49
    invoke-virtual {p2}, Lcom/smartengines/text/TextSessionSettings;->SupportedTextIteratorsBegin()Lcom/smartengines/common/StringsSetIterator;

    move-result-object v1

    .line 50
    invoke-virtual {p2}, Lcom/smartengines/text/TextSessionSettings;->SupportedTextIteratorsEnd()Lcom/smartengines/common/StringsSetIterator;

    move-result-object p2

    .line 51
    :goto_0
    invoke-virtual {v1, p2}, Lcom/smartengines/common/StringsSetIterator;->Equals(Lcom/smartengines/common/StringsSetIterator;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 52
    invoke-virtual {v1}, Lcom/smartengines/common/StringsSetIterator;->GetValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    invoke-virtual {v1}, Lcom/smartengines/common/StringsSetIterator;->Advance()V

    goto :goto_0

    .line 48
    :cond_0
    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/smartengines/engine/text/TextSessionWrapper;->supportedTextIterators:Ljava/util/List;

    .line 59
    iget-object p2, p0, Lcom/smartengines/engine/text/TextSessionWrapper;->textSessionSettings:Lcom/smartengines/text/TextSessionSettings;

    .line 61
    iget-object v0, p0, Lcom/smartengines/engine/text/TextSessionWrapper;->callback:Lcom/smartengines/engine/text/TextCallback;

    check-cast v0, Lcom/smartengines/text/TextFeedback;

    .line 58
    invoke-virtual {p1, p2, p3, v0}, Lcom/smartengines/text/TextEngine;->SpawnSession(Lcom/smartengines/text/TextSessionSettings;Ljava/lang/String;Lcom/smartengines/text/TextFeedback;)Lcom/smartengines/text/TextSession;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/engine/text/TextSessionWrapper;->textSession:Lcom/smartengines/text/TextSession;

    .line 63
    const-string p1, "myapp.TextSessionWrapper"

    const-string p2, "Session created"

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/Exception;

    const-string p2, "GetSupportedTextIteratorsCount()==0"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public delete()V
    .locals 2

    .line 83
    iget-object v0, p0, Lcom/smartengines/engine/text/TextSessionWrapper;->textSession:Lcom/smartengines/text/TextSession;

    invoke-virtual {v0}, Lcom/smartengines/text/TextSession;->delete()V

    .line 84
    const-string v0, "myapp.TextSessionWrapper"

    const-string v1, "Session deleted"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public getCurrentResult()Lcom/smartengines/engine/Result;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/smartengines/engine/text/TextSessionWrapper;->currentResult:Lcom/smartengines/engine/Result;

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

    .line 40
    iget-object v0, p0, Lcom/smartengines/engine/text/TextSessionWrapper;->_processedImages:Ljava/util/ArrayList;

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getTextSession()Lcom/smartengines/text/TextSession;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/smartengines/engine/text/TextSessionWrapper;->textSession:Lcom/smartengines/text/TextSession;

    return-object v0
.end method

.method public final getTextSessionSettings()Lcom/smartengines/text/TextSessionSettings;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/smartengines/engine/text/TextSessionWrapper;->textSessionSettings:Lcom/smartengines/text/TextSessionSettings;

    return-object v0
.end method

.method public bridge synthetic getVisualizations()Ljava/util/Collection;
    .locals 1

    .line 23
    invoke-virtual {p0}, Lcom/smartengines/engine/text/TextSessionWrapper;->getVisualizations()Ljava/util/List;

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

    .line 36
    iget-object v0, p0, Lcom/smartengines/engine/text/TextSessionWrapper;->visualizations:Ljava/util/List;

    return-object v0
.end method

.method public isEnded()Z
    .locals 1

    .line 33
    iget-boolean v0, p0, Lcom/smartengines/engine/text/TextSessionWrapper;->isEnded:Z

    return v0
.end method

.method public processImage(Landroid/graphics/Bitmap;)V
    .locals 2

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    const-string v0, "myapp.TextSessionWrapper"

    const-string v1, "processImage"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 69
    sget-object v0, Lcom/smartengines/engine/ImageFactory;->INSTANCE:Lcom/smartengines/engine/ImageFactory;

    invoke-virtual {v0, p1}, Lcom/smartengines/engine/ImageFactory;->imageFromBitmap(Landroid/graphics/Bitmap;)Lcom/smartengines/common/Image;

    move-result-object v0

    .line 70
    iget-object v1, p0, Lcom/smartengines/engine/text/TextSessionWrapper;->textSession:Lcom/smartengines/text/TextSession;

    invoke-virtual {v1, v0}, Lcom/smartengines/text/TextSession;->ProcessImage(Lcom/smartengines/common/Image;)V

    const/4 v0, 0x1

    .line 71
    iput-boolean v0, p0, Lcom/smartengines/engine/text/TextSessionWrapper;->isEnded:Z

    .line 74
    iget-object v0, p0, Lcom/smartengines/engine/text/TextSessionWrapper;->_processedImages:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    iget-object p1, p0, Lcom/smartengines/engine/text/TextSessionWrapper;->textSession:Lcom/smartengines/text/TextSession;

    invoke-virtual {p1}, Lcom/smartengines/text/TextSession;->GetCurrentResult()Lcom/smartengines/text/TextResult;

    move-result-object p1

    .line 78
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/smartengines/engine/text/TextResultParserKt;->isInvalid(Lcom/smartengines/text/TextResult;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 79
    :cond_0
    invoke-static {p1}, Lcom/smartengines/engine/text/TextResultParserKt;->parse(Lcom/smartengines/text/TextResult;)Lcom/smartengines/engine/text/TextResultData;

    move-result-object p1

    :goto_0
    check-cast p1, Lcom/smartengines/engine/Result;

    .line 78
    invoke-virtual {p0, p1}, Lcom/smartengines/engine/text/TextSessionWrapper;->setCurrentResult(Lcom/smartengines/engine/Result;)V

    return-void
.end method

.method public setCurrentResult(Lcom/smartengines/engine/Result;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/smartengines/engine/text/TextSessionWrapper;->currentResult:Lcom/smartengines/engine/Result;

    return-void
.end method
