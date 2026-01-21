.class public final Lcom/smartengines/engine/EngineLoadingState$Error;
.super Ljava/lang/Object;
.source "EngineLoadingState.kt"

# interfaces
.implements Lcom/smartengines/engine/EngineLoadingState;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/engine/EngineLoadingState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Error"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/smartengines/engine/EngineLoadingState$Error;",
        "Lcom/smartengines/engine/EngineLoadingState;",
        "engine",
        "Lcom/smartengines/engine/Engine;",
        "error",
        "",
        "<init>",
        "(Lcom/smartengines/engine/Engine;Ljava/lang/Throwable;)V",
        "getEngine",
        "()Lcom/smartengines/engine/Engine;",
        "getError",
        "()Ljava/lang/Throwable;",
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
.field private final engine:Lcom/smartengines/engine/Engine;

.field private final error:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Lcom/smartengines/engine/Engine;Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "engine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/smartengines/engine/EngineLoadingState$Error;->engine:Lcom/smartengines/engine/Engine;

    .line 23
    iput-object p2, p0, Lcom/smartengines/engine/EngineLoadingState$Error;->error:Ljava/lang/Throwable;

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/engine/EngineLoadingState$Error;Lcom/smartengines/engine/Engine;Ljava/lang/Throwable;ILjava/lang/Object;)Lcom/smartengines/engine/EngineLoadingState$Error;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/smartengines/engine/EngineLoadingState$Error;->engine:Lcom/smartengines/engine/Engine;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/smartengines/engine/EngineLoadingState$Error;->error:Ljava/lang/Throwable;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/smartengines/engine/EngineLoadingState$Error;->copy(Lcom/smartengines/engine/Engine;Ljava/lang/Throwable;)Lcom/smartengines/engine/EngineLoadingState$Error;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/smartengines/engine/Engine;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/engine/EngineLoadingState$Error;->engine:Lcom/smartengines/engine/Engine;

    return-object v0
.end method

.method public final component2()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/engine/EngineLoadingState$Error;->error:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final copy(Lcom/smartengines/engine/Engine;Ljava/lang/Throwable;)Lcom/smartengines/engine/EngineLoadingState$Error;
    .locals 1

    const-string v0, "engine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/smartengines/engine/EngineLoadingState$Error;

    invoke-direct {v0, p1, p2}, Lcom/smartengines/engine/EngineLoadingState$Error;-><init>(Lcom/smartengines/engine/Engine;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/engine/EngineLoadingState$Error;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/engine/EngineLoadingState$Error;

    iget-object v1, p0, Lcom/smartengines/engine/EngineLoadingState$Error;->engine:Lcom/smartengines/engine/Engine;

    iget-object v3, p1, Lcom/smartengines/engine/EngineLoadingState$Error;->engine:Lcom/smartengines/engine/Engine;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/smartengines/engine/EngineLoadingState$Error;->error:Ljava/lang/Throwable;

    iget-object p1, p1, Lcom/smartengines/engine/EngineLoadingState$Error;->error:Ljava/lang/Throwable;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getEngine()Lcom/smartengines/engine/Engine;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/smartengines/engine/EngineLoadingState$Error;->engine:Lcom/smartengines/engine/Engine;

    return-object v0
.end method

.method public final getError()Ljava/lang/Throwable;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/smartengines/engine/EngineLoadingState$Error;->error:Ljava/lang/Throwable;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/smartengines/engine/EngineLoadingState$Error;->engine:Lcom/smartengines/engine/Engine;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/engine/EngineLoadingState$Error;->error:Ljava/lang/Throwable;

    invoke-virtual {v1}, Ljava/lang/Throwable;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Error(engine="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/engine/EngineLoadingState$Error;->engine:Lcom/smartengines/engine/Engine;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/engine/EngineLoadingState$Error;->error:Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
