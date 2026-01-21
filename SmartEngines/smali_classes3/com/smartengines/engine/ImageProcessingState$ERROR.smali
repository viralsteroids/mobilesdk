.class public final Lcom/smartengines/engine/ImageProcessingState$ERROR;
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
    name = "ERROR"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0004j\u0002`\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0012\u0010\n\u001a\u00060\u0004j\u0002`\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0008J\u001c\u0010\u000b\u001a\u00020\u00002\u000c\u0008\u0002\u0010\u0002\u001a\u00060\u0004j\u0002`\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000cJ\u0013\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0017\u0010\u0002\u001a\u00060\u0004j\u0002`\u0003\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/smartengines/engine/ImageProcessingState$ERROR;",
        "Lcom/smartengines/engine/ImageProcessingState;",
        "error",
        "Lkotlin/Exception;",
        "Ljava/lang/Exception;",
        "<init>",
        "(Ljava/lang/Exception;)V",
        "getError",
        "()Ljava/lang/Exception;",
        "Ljava/lang/Exception;",
        "component1",
        "copy",
        "(Ljava/lang/Exception;)Lcom/smartengines/engine/ImageProcessingState$ERROR;",
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
.field private final error:Ljava/lang/Exception;


# direct methods
.method public constructor <init>(Ljava/lang/Exception;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/smartengines/engine/ImageProcessingState$ERROR;->error:Ljava/lang/Exception;

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/engine/ImageProcessingState$ERROR;Ljava/lang/Exception;ILjava/lang/Object;)Lcom/smartengines/engine/ImageProcessingState$ERROR;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/smartengines/engine/ImageProcessingState$ERROR;->error:Ljava/lang/Exception;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/smartengines/engine/ImageProcessingState$ERROR;->copy(Ljava/lang/Exception;)Lcom/smartengines/engine/ImageProcessingState$ERROR;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Exception;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/engine/ImageProcessingState$ERROR;->error:Ljava/lang/Exception;

    return-object v0
.end method

.method public final copy(Ljava/lang/Exception;)Lcom/smartengines/engine/ImageProcessingState$ERROR;
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/smartengines/engine/ImageProcessingState$ERROR;

    invoke-direct {v0, p1}, Lcom/smartengines/engine/ImageProcessingState$ERROR;-><init>(Ljava/lang/Exception;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/engine/ImageProcessingState$ERROR;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/engine/ImageProcessingState$ERROR;

    iget-object v1, p0, Lcom/smartengines/engine/ImageProcessingState$ERROR;->error:Ljava/lang/Exception;

    iget-object p1, p1, Lcom/smartengines/engine/ImageProcessingState$ERROR;->error:Ljava/lang/Exception;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getError()Ljava/lang/Exception;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/smartengines/engine/ImageProcessingState$ERROR;->error:Ljava/lang/Exception;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/smartengines/engine/ImageProcessingState$ERROR;->error:Ljava/lang/Exception;

    invoke-virtual {v0}, Ljava/lang/Exception;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ERROR(error="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/engine/ImageProcessingState$ERROR;->error:Ljava/lang/Exception;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
