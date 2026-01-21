.class public final Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;
.super Ljava/lang/Object;
.source "ImageProcessingState.kt"

# interfaces
.implements Lcom/smartengines/engine/ImageProcessingState;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/engine/ImageProcessingState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "VIDEO_PROCESSING"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J%\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0010\u0008\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;",
        "Lcom/smartengines/engine/ImageProcessingState;",
        "target",
        "Lcom/smartengines/engine/RecognitionTarget;",
        "visualizations",
        "",
        "Lcom/smartengines/visualization/Visualization;",
        "<init>",
        "(Lcom/smartengines/engine/RecognitionTarget;Ljava/util/Collection;)V",
        "getTarget",
        "()Lcom/smartengines/engine/RecognitionTarget;",
        "getVisualizations",
        "()Ljava/util/Collection;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final target:Lcom/smartengines/engine/RecognitionTarget;

.field private final visualizations:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lcom/smartengines/visualization/Visualization;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/smartengines/engine/RecognitionTarget;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/engine/RecognitionTarget;",
            "Ljava/util/Collection<",
            "+",
            "Lcom/smartengines/visualization/Visualization;",
            ">;)V"
        }
    .end annotation

    const-string/jumbo v0, "target"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;->target:Lcom/smartengines/engine/RecognitionTarget;

    .line 24
    iput-object p2, p0, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;->visualizations:Ljava/util/Collection;

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;Lcom/smartengines/engine/RecognitionTarget;Ljava/util/Collection;ILjava/lang/Object;)Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;->target:Lcom/smartengines/engine/RecognitionTarget;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;->visualizations:Ljava/util/Collection;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;->copy(Lcom/smartengines/engine/RecognitionTarget;Ljava/util/Collection;)Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/smartengines/engine/RecognitionTarget;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;->target:Lcom/smartengines/engine/RecognitionTarget;

    return-object v0
.end method

.method public final component2()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/smartengines/visualization/Visualization;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;->visualizations:Ljava/util/Collection;

    return-object v0
.end method

.method public final copy(Lcom/smartengines/engine/RecognitionTarget;Ljava/util/Collection;)Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/smartengines/engine/RecognitionTarget;",
            "Ljava/util/Collection<",
            "+",
            "Lcom/smartengines/visualization/Visualization;",
            ">;)",
            "Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;"
        }
    .end annotation

    const-string/jumbo v0, "target"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;

    invoke-direct {v0, p1, p2}, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;-><init>(Lcom/smartengines/engine/RecognitionTarget;Ljava/util/Collection;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;

    iget-object v1, p0, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;->target:Lcom/smartengines/engine/RecognitionTarget;

    iget-object v3, p1, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;->target:Lcom/smartengines/engine/RecognitionTarget;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;->visualizations:Ljava/util/Collection;

    iget-object p1, p1, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;->visualizations:Ljava/util/Collection;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getTarget()Lcom/smartengines/engine/RecognitionTarget;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;->target:Lcom/smartengines/engine/RecognitionTarget;

    return-object v0
.end method

.method public final getVisualizations()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/smartengines/visualization/Visualization;",
            ">;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;->visualizations:Ljava/util/Collection;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;->target:Lcom/smartengines/engine/RecognitionTarget;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;->visualizations:Ljava/util/Collection;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "VIDEO_PROCESSING(target="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;->target:Lcom/smartengines/engine/RecognitionTarget;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", visualizations="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/engine/ImageProcessingState$VIDEO_PROCESSING;->visualizations:Ljava/util/Collection;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
