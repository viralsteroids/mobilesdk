.class public final Lcom/smartengines/engine/id/LvSessionWrapper;
.super Ljava/lang/Object;
.source "LvSessionWrapper.kt"

# interfaces
.implements Lcom/smartengines/engine/Session;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0008\u0010&\u001a\u00020#H\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001cX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\'\u001a\u00020(8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010*\u00a8\u0006+"
    }
    d2 = {
        "Lcom/smartengines/engine/id/LvSessionWrapper;",
        "Lcom/smartengines/engine/Session;",
        "idEngine",
        "Lcom/smartengines/id/IdEngine;",
        "lvSettings",
        "Lcom/smartengines/id/IdFaceSessionSettings;",
        "signature",
        "",
        "<init>",
        "(Lcom/smartengines/id/IdEngine;Lcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;)V",
        "lvSession",
        "Lcom/smartengines/id/IdFaceSession;",
        "getLvSession",
        "()Lcom/smartengines/id/IdFaceSession;",
        "isEnded",
        "",
        "()Z",
        "setEnded",
        "(Z)V",
        "instruction",
        "Lcom/smartengines/visualization/Visualization$Instruction;",
        "timer",
        "Lcom/smartengines/visualization/Visualization$Timer;",
        "steps",
        "Lcom/smartengines/visualization/Visualization$Steps;",
        "quads",
        "Lcom/smartengines/visualization/Visualization$Quads;",
        "visualizations",
        "",
        "Lcom/smartengines/visualization/Visualization;",
        "getVisualizations",
        "()Ljava/util/List;",
        "lvCallback",
        "Lcom/smartengines/engine/id/LvCallback;",
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
.field private final instruction:Lcom/smartengines/visualization/Visualization$Instruction;

.field private isEnded:Z

.field private final lvCallback:Lcom/smartengines/engine/id/LvCallback;

.field private final lvSession:Lcom/smartengines/id/IdFaceSession;

.field private final quads:Lcom/smartengines/visualization/Visualization$Quads;

.field private final steps:Lcom/smartengines/visualization/Visualization$Steps;

.field private final timer:Lcom/smartengines/visualization/Visualization$Timer;

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
.method public constructor <init>(Lcom/smartengines/id/IdEngine;Lcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;)V
    .locals 7

    const-string v0, "idEngine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lvSettings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "signature"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Lcom/smartengines/visualization/Visualization$Instruction;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lcom/smartengines/visualization/Visualization$Instruction;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/smartengines/engine/id/LvSessionWrapper;->instruction:Lcom/smartengines/visualization/Visualization$Instruction;

    .line 36
    new-instance v3, Lcom/smartengines/visualization/Visualization$Timer;

    invoke-direct {v3}, Lcom/smartengines/visualization/Visualization$Timer;-><init>()V

    iput-object v3, p0, Lcom/smartengines/engine/id/LvSessionWrapper;->timer:Lcom/smartengines/visualization/Visualization$Timer;

    .line 37
    new-instance v4, Lcom/smartengines/visualization/Visualization$Steps;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v2, v1}, Lcom/smartengines/visualization/Visualization$Steps;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v4, p0, Lcom/smartengines/engine/id/LvSessionWrapper;->steps:Lcom/smartengines/visualization/Visualization$Steps;

    .line 38
    new-instance v6, Lcom/smartengines/visualization/Visualization$Quads;

    invoke-direct {v6, v1, v2, v1}, Lcom/smartengines/visualization/Visualization$Quads;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v6, p0, Lcom/smartengines/engine/id/LvSessionWrapper;->quads:Lcom/smartengines/visualization/Visualization$Quads;

    const/4 v1, 0x4

    .line 39
    new-array v1, v1, [Lcom/smartengines/visualization/Visualization;

    aput-object v0, v1, v5

    aput-object v3, v1, v2

    const/4 v0, 0x2

    aput-object v4, v1, v0

    const/4 v0, 0x3

    aput-object v6, v1, v0

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/smartengines/engine/id/LvSessionWrapper;->visualizations:Ljava/util/List;

    .line 42
    new-instance v0, Lcom/smartengines/engine/id/LvCallback;

    invoke-direct {v0, v3, v4, v6}, Lcom/smartengines/engine/id/LvCallback;-><init>(Lcom/smartengines/visualization/Visualization$Timer;Lcom/smartengines/visualization/Visualization$Steps;Lcom/smartengines/visualization/Visualization$Quads;)V

    iput-object v0, p0, Lcom/smartengines/engine/id/LvSessionWrapper;->lvCallback:Lcom/smartengines/engine/id/LvCallback;

    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "supportedLivenessInstructionsCount:    "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/smartengines/id/IdFaceSessionSettings;->GetSupportedLivenessInstructionsCount()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "myapp.LvSessionWrapper"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    invoke-virtual {p2}, Lcom/smartengines/id/IdFaceSessionSettings;->SupportedLivenessInstructionsBegin()Lcom/smartengines/common/StringsMapIterator;

    move-result-object v0

    .line 48
    invoke-virtual {p2}, Lcom/smartengines/id/IdFaceSessionSettings;->SupportedLivenessInstructionsEnd()Lcom/smartengines/common/StringsMapIterator;

    move-result-object v2

    .line 49
    :goto_0
    invoke-virtual {v0, v2}, Lcom/smartengines/common/StringsMapIterator;->Equals(Lcom/smartengines/common/StringsMapIterator;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 50
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, " = supportedLivenessInstruction:    "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/smartengines/common/StringsMapIterator;->GetKey()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lcom/smartengines/common/StringsMapIterator;->GetValue()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    invoke-virtual {v0}, Lcom/smartengines/common/StringsMapIterator;->Advance()V

    goto :goto_0

    .line 55
    :cond_0
    iget-object v0, p0, Lcom/smartengines/engine/id/LvSessionWrapper;->lvCallback:Lcom/smartengines/engine/id/LvCallback;

    check-cast v0, Lcom/smartengines/id/IdFaceFeedback;

    invoke-virtual {p1, p2, p3, v0}, Lcom/smartengines/id/IdEngine;->SpawnFaceSession(Lcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;Lcom/smartengines/id/IdFaceFeedback;)Lcom/smartengines/id/IdFaceSession;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/engine/id/LvSessionWrapper;->lvSession:Lcom/smartengines/id/IdFaceSession;

    .line 56
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Session created   instructionsCount: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/smartengines/id/IdFaceSession;->GetInstructionsCount()J

    move-result-wide v2

    invoke-virtual {p2, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    iget-object p2, p0, Lcom/smartengines/engine/id/LvSessionWrapper;->steps:Lcom/smartengines/visualization/Visualization$Steps;

    invoke-virtual {p1}, Lcom/smartengines/id/IdFaceSession;->GetInstructionsCount()J

    move-result-wide v0

    long-to-int p1, v0

    invoke-virtual {p2, p1}, Lcom/smartengines/visualization/Visualization$Steps;->reset(I)V

    return-void
.end method


# virtual methods
.method public delete()V
    .locals 2

    .line 82
    iget-object v0, p0, Lcom/smartengines/engine/id/LvSessionWrapper;->lvSession:Lcom/smartengines/id/IdFaceSession;

    invoke-virtual {v0}, Lcom/smartengines/id/IdFaceSession;->delete()V

    .line 83
    const-string v0, "myapp.LvSessionWrapper"

    const-string v1, "Session deleted"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public getCurrentResult()Lcom/smartengines/engine/Result;
    .locals 3

    .line 87
    new-instance v0, Lcom/smartengines/engine/id/LvResultData;

    iget-object v1, p0, Lcom/smartengines/engine/id/LvSessionWrapper;->lvSession:Lcom/smartengines/id/IdFaceSession;

    invoke-virtual {v1}, Lcom/smartengines/id/IdFaceSession;->GetLivenessResult()Lcom/smartengines/id/IdFaceLivenessResult;

    move-result-object v1

    invoke-virtual {v1}, Lcom/smartengines/id/IdFaceLivenessResult;->GetLivenessEstimation()D

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lcom/smartengines/engine/id/LvResultData;-><init>(D)V

    check-cast v0, Lcom/smartengines/engine/Result;

    return-object v0
.end method

.method public final getLvSession()Lcom/smartengines/id/IdFaceSession;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/smartengines/engine/id/LvSessionWrapper;->lvSession:Lcom/smartengines/id/IdFaceSession;

    return-object v0
.end method

.method public bridge synthetic getVisualizations()Ljava/util/Collection;
    .locals 1

    .line 23
    invoke-virtual {p0}, Lcom/smartengines/engine/id/LvSessionWrapper;->getVisualizations()Ljava/util/List;

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

    .line 39
    iget-object v0, p0, Lcom/smartengines/engine/id/LvSessionWrapper;->visualizations:Ljava/util/List;

    return-object v0
.end method

.method public isEnded()Z
    .locals 1

    .line 32
    iget-boolean v0, p0, Lcom/smartengines/engine/id/LvSessionWrapper;->isEnded:Z

    return v0
.end method

.method public processImage(Landroid/graphics/Bitmap;)V
    .locals 2

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    iget-object v0, p0, Lcom/smartengines/engine/id/LvSessionWrapper;->quads:Lcom/smartengines/visualization/Visualization$Quads;

    invoke-static {p1}, Lcom/smartengines/utils/UtilsKt;->getSize(Landroid/graphics/Bitmap;)Landroid/util/Size;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/smartengines/visualization/Visualization$Quads;->setFrameSize(Landroid/util/Size;)V

    .line 67
    sget-object v0, Lcom/smartengines/engine/ImageFactory;->INSTANCE:Lcom/smartengines/engine/ImageFactory;

    invoke-virtual {v0, p1}, Lcom/smartengines/engine/ImageFactory;->imageFromBitmap(Landroid/graphics/Bitmap;)Lcom/smartengines/common/Image;

    move-result-object p1

    .line 68
    iget-object v0, p0, Lcom/smartengines/engine/id/LvSessionWrapper;->lvSession:Lcom/smartengines/id/IdFaceSession;

    invoke-virtual {v0, p1}, Lcom/smartengines/id/IdFaceSession;->AddFaceImage(Lcom/smartengines/common/Image;)V

    .line 70
    iget-object p1, p0, Lcom/smartengines/engine/id/LvSessionWrapper;->lvSession:Lcom/smartengines/id/IdFaceSession;

    invoke-virtual {p1}, Lcom/smartengines/id/IdFaceSession;->GetLivenessResult()Lcom/smartengines/id/IdFaceLivenessResult;

    move-result-object p1

    .line 72
    invoke-virtual {p1}, Lcom/smartengines/id/IdFaceLivenessResult;->GetLivenessInstruction()Ljava/lang/String;

    move-result-object p1

    .line 74
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, " ---> instruction: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "myapp.LvSessionWrapper"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    iget-object v0, p0, Lcom/smartengines/engine/id/LvSessionWrapper;->instruction:Lcom/smartengines/visualization/Visualization$Instruction;

    invoke-virtual {v0, p1}, Lcom/smartengines/visualization/Visualization$Instruction;->update(Ljava/lang/String;)V

    .line 77
    const-string v0, "CT"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 78
    invoke-virtual {p0, p1}, Lcom/smartengines/engine/id/LvSessionWrapper;->setEnded(Z)V

    :cond_0
    return-void
.end method

.method public setEnded(Z)V
    .locals 0

    .line 32
    iput-boolean p1, p0, Lcom/smartengines/engine/id/LvSessionWrapper;->isEnded:Z

    return-void
.end method
