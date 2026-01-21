.class public final Lcom/smartengines/engine/id/VaSessionWrapper;
.super Ljava/lang/Object;
.source "VaSessionWrapper.kt"

# interfaces
.implements Lcom/smartengines/engine/Session;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0016J\u0008\u0010(\u001a\u00020%H\u0016J\u000e\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u0007R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0019X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0016\u0010)\u001a\u0004\u0018\u00010*8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010,\u00a8\u0006/"
    }
    d2 = {
        "Lcom/smartengines/engine/id/VaSessionWrapper;",
        "Lcom/smartengines/engine/Session;",
        "idEngine",
        "Lcom/smartengines/id/IdEngine;",
        "vaSessionSettings",
        "Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;",
        "signature",
        "",
        "<init>",
        "(Lcom/smartengines/id/IdEngine;Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)V",
        "getVaSessionSettings",
        "()Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;",
        "vaSession",
        "Lcom/smartengines/id/IdVideoAuthenticationSession;",
        "getVaSession",
        "()Lcom/smartengines/id/IdVideoAuthenticationSession;",
        "isEnded",
        "",
        "()Z",
        "quadsPrimary",
        "Lcom/smartengines/visualization/Visualization$Quads;",
        "quadsSecondary",
        "instruction",
        "Lcom/smartengines/visualization/Visualization$Instruction;",
        "visualizations",
        "",
        "getVisualizations",
        "()Ljava/util/List;",
        "idCallback",
        "Lcom/smartengines/engine/id/IdCallback;",
        "getIdCallback",
        "()Lcom/smartengines/engine/id/IdCallback;",
        "vaCallback",
        "Lcom/smartengines/engine/id/VaCallback;",
        "getVaCallback",
        "()Lcom/smartengines/engine/id/VaCallback;",
        "processImage",
        "",
        "bitmap",
        "Landroid/graphics/Bitmap;",
        "delete",
        "currentResult",
        "Lcom/smartengines/engine/Result;",
        "getCurrentResult",
        "()Lcom/smartengines/engine/Result;",
        "hasRFID",
        "docType",
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
.field private final idCallback:Lcom/smartengines/engine/id/IdCallback;

.field private final instruction:Lcom/smartengines/visualization/Visualization$Instruction;

.field private final quadsPrimary:Lcom/smartengines/visualization/Visualization$Quads;

.field private final quadsSecondary:Lcom/smartengines/visualization/Visualization$Quads;

.field private final vaCallback:Lcom/smartengines/engine/id/VaCallback;

.field private final vaSession:Lcom/smartengines/id/IdVideoAuthenticationSession;

.field private final vaSessionSettings:Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;

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
.method public constructor <init>(Lcom/smartengines/id/IdEngine;Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)V
    .locals 6

    const-string v0, "idEngine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "vaSessionSettings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "signature"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p2, p0, Lcom/smartengines/engine/id/VaSessionWrapper;->vaSessionSettings:Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;

    .line 33
    new-instance v0, Lcom/smartengines/visualization/Visualization$Quads;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lcom/smartengines/visualization/Visualization$Quads;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/smartengines/engine/id/VaSessionWrapper;->quadsPrimary:Lcom/smartengines/visualization/Visualization$Quads;

    .line 34
    new-instance v3, Lcom/smartengines/visualization/Visualization$Quads;

    invoke-direct {v3, v1, v2, v1}, Lcom/smartengines/visualization/Visualization$Quads;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v3, p0, Lcom/smartengines/engine/id/VaSessionWrapper;->quadsSecondary:Lcom/smartengines/visualization/Visualization$Quads;

    .line 35
    new-instance v4, Lcom/smartengines/visualization/Visualization$Instruction;

    invoke-direct {v4, v1, v2, v1}, Lcom/smartengines/visualization/Visualization$Instruction;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v4, p0, Lcom/smartengines/engine/id/VaSessionWrapper;->instruction:Lcom/smartengines/visualization/Visualization$Instruction;

    const/4 v1, 0x2

    .line 36
    new-array v1, v1, [Lcom/smartengines/visualization/Visualization$Quads;

    const/4 v5, 0x0

    aput-object v0, v1, v5

    aput-object v3, v1, v2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/smartengines/engine/id/VaSessionWrapper;->visualizations:Ljava/util/List;

    .line 39
    new-instance v1, Lcom/smartengines/engine/id/IdCallback;

    .line 40
    new-instance v2, Lcom/smartengines/engine/id/VaSessionWrapper$idCallback$1;

    invoke-direct {v2, v0}, Lcom/smartengines/engine/id/VaSessionWrapper$idCallback$1;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 41
    new-instance v0, Lcom/smartengines/engine/id/VaSessionWrapper$idCallback$2;

    invoke-direct {v0, v3}, Lcom/smartengines/engine/id/VaSessionWrapper$idCallback$2;-><init>(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 39
    invoke-direct {v1, v2, v0}, Lcom/smartengines/engine/id/IdCallback;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    iput-object v1, p0, Lcom/smartengines/engine/id/VaSessionWrapper;->idCallback:Lcom/smartengines/engine/id/IdCallback;

    .line 43
    new-instance v0, Lcom/smartengines/engine/id/VaCallback;

    .line 44
    new-instance v2, Lcom/smartengines/engine/id/VaSessionWrapper$vaCallback$1;

    invoke-direct {v2, v4}, Lcom/smartengines/engine/id/VaSessionWrapper$vaCallback$1;-><init>(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 43
    invoke-direct {v0, v2}, Lcom/smartengines/engine/id/VaCallback;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lcom/smartengines/engine/id/VaSessionWrapper;->vaCallback:Lcom/smartengines/engine/id/VaCallback;

    .line 51
    check-cast v0, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;

    .line 52
    check-cast v1, Lcom/smartengines/id/IdFeedback;

    .line 48
    invoke-virtual {p1, p2, p3, v0, v1}, Lcom/smartengines/id/IdEngine;->SpawnVideoAuthenticationSession(Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;Lcom/smartengines/id/IdVideoAuthenticationCallbacks;Lcom/smartengines/id/IdFeedback;)Lcom/smartengines/id/IdVideoAuthenticationSession;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/engine/id/VaSessionWrapper;->vaSession:Lcom/smartengines/id/IdVideoAuthenticationSession;

    .line 54
    const-string p1, "myapp.VaSessionWrapper"

    const-string p2, "Session created"

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public delete()V
    .locals 2

    .line 65
    iget-object v0, p0, Lcom/smartengines/engine/id/VaSessionWrapper;->vaSession:Lcom/smartengines/id/IdVideoAuthenticationSession;

    invoke-virtual {v0}, Lcom/smartengines/id/IdVideoAuthenticationSession;->delete()V

    .line 66
    const-string v0, "myapp.VaSessionWrapper"

    const-string v1, "Session deleted"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public getCurrentResult()Lcom/smartengines/engine/Result;
    .locals 2

    .line 70
    iget-object v0, p0, Lcom/smartengines/engine/id/VaSessionWrapper;->vaSession:Lcom/smartengines/id/IdVideoAuthenticationSession;

    invoke-virtual {v0}, Lcom/smartengines/id/IdVideoAuthenticationSession;->GetDocumentResult()Lcom/smartengines/id/IdResult;

    move-result-object v0

    const-string v1, "GetDocumentResult(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/smartengines/engine/id/IdResultParserKt;->parse(Lcom/smartengines/id/IdResult;Ljava/util/Map;)Lcom/smartengines/engine/id/IdResultData;

    move-result-object v0

    check-cast v0, Lcom/smartengines/engine/Result;

    return-object v0
.end method

.method public final getIdCallback()Lcom/smartengines/engine/id/IdCallback;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/smartengines/engine/id/VaSessionWrapper;->idCallback:Lcom/smartengines/engine/id/IdCallback;

    return-object v0
.end method

.method public final getVaCallback()Lcom/smartengines/engine/id/VaCallback;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/smartengines/engine/id/VaSessionWrapper;->vaCallback:Lcom/smartengines/engine/id/VaCallback;

    return-object v0
.end method

.method public final getVaSession()Lcom/smartengines/id/IdVideoAuthenticationSession;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/smartengines/engine/id/VaSessionWrapper;->vaSession:Lcom/smartengines/id/IdVideoAuthenticationSession;

    return-object v0
.end method

.method public final getVaSessionSettings()Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/smartengines/engine/id/VaSessionWrapper;->vaSessionSettings:Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;

    return-object v0
.end method

.method public bridge synthetic getVisualizations()Ljava/util/Collection;
    .locals 1

    .line 21
    invoke-virtual {p0}, Lcom/smartengines/engine/id/VaSessionWrapper;->getVisualizations()Ljava/util/List;

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

    .line 36
    iget-object v0, p0, Lcom/smartengines/engine/id/VaSessionWrapper;->visualizations:Ljava/util/List;

    return-object v0
.end method

.method public final hasRFID(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "docType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    iget-object v0, p0, Lcom/smartengines/engine/id/VaSessionWrapper;->vaSessionSettings:Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;

    invoke-virtual {v0, p1}, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->GetDocumentInfo(Ljava/lang/String;)Lcom/smartengines/id/IdDocumentInfo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/smartengines/id/IdDocumentInfo;->SupportedRFID()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public isEnded()Z
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/smartengines/engine/id/VaSessionWrapper;->vaCallback:Lcom/smartengines/engine/id/VaCallback;

    invoke-virtual {v0}, Lcom/smartengines/engine/id/VaCallback;->getSessionEnded()Z

    move-result v0

    return v0
.end method

.method public processImage(Landroid/graphics/Bitmap;)V
    .locals 2

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    iget-object v0, p0, Lcom/smartengines/engine/id/VaSessionWrapper;->quadsPrimary:Lcom/smartengines/visualization/Visualization$Quads;

    invoke-static {p1}, Lcom/smartengines/utils/UtilsKt;->getSize(Landroid/graphics/Bitmap;)Landroid/util/Size;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/smartengines/visualization/Visualization$Quads;->setFrameSize(Landroid/util/Size;)V

    .line 59
    iget-object v0, p0, Lcom/smartengines/engine/id/VaSessionWrapper;->quadsSecondary:Lcom/smartengines/visualization/Visualization$Quads;

    invoke-static {p1}, Lcom/smartengines/utils/UtilsKt;->getSize(Landroid/graphics/Bitmap;)Landroid/util/Size;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/smartengines/visualization/Visualization$Quads;->setFrameSize(Landroid/util/Size;)V

    .line 60
    sget-object v0, Lcom/smartengines/engine/ImageFactory;->INSTANCE:Lcom/smartengines/engine/ImageFactory;

    invoke-virtual {v0, p1}, Lcom/smartengines/engine/ImageFactory;->imageFromBitmap(Landroid/graphics/Bitmap;)Lcom/smartengines/common/Image;

    move-result-object p1

    .line 61
    iget-object v0, p0, Lcom/smartengines/engine/id/VaSessionWrapper;->vaSession:Lcom/smartengines/id/IdVideoAuthenticationSession;

    invoke-virtual {v0, p1}, Lcom/smartengines/id/IdVideoAuthenticationSession;->ProcessFrame(Lcom/smartengines/common/Image;)V

    return-void
.end method
