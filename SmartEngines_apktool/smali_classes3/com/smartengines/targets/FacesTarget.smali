.class public final Lcom/smartengines/targets/FacesTarget;
.super Ljava/lang/Object;
.source "FacesTarget.kt"

# interfaces
.implements Lcom/smartengines/engine/RecognitionTarget;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\"\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\u0019\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u001a\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0015X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\""
    }
    d2 = {
        "Lcom/smartengines/targets/FacesTarget;",
        "Lcom/smartengines/engine/RecognitionTarget;",
        "photo",
        "Landroid/graphics/Bitmap;",
        "<init>",
        "(Landroid/graphics/Bitmap;)V",
        "getPhoto",
        "()Landroid/graphics/Bitmap;",
        "engineId",
        "Lcom/smartengines/engine/EngineId;",
        "getEngineId",
        "()Lcom/smartengines/engine/EngineId;",
        "createSession",
        "Lcom/smartengines/engine/Session;",
        "engine",
        "Lcom/smartengines/engine/Engine;",
        "sessionType",
        "Lcom/smartengines/engine/SessionType;",
        "logger",
        "Lcom/smartengines/engine/SessionSettingsLogger;",
        "sessionTypes",
        "",
        "getSessionTypes",
        "()Ljava/util/Set;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
        "targets_release"
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
.field private final engineId:Lcom/smartengines/engine/EngineId;

.field private final photo:Landroid/graphics/Bitmap;

.field private final sessionTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/smartengines/engine/SessionType;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/smartengines/targets/FacesTarget;->photo:Landroid/graphics/Bitmap;

    .line 18
    sget-object p1, Lcom/smartengines/engine/EngineId;->ID:Lcom/smartengines/engine/EngineId;

    iput-object p1, p0, Lcom/smartengines/targets/FacesTarget;->engineId:Lcom/smartengines/engine/EngineId;

    .line 24
    sget-object p1, Lcom/smartengines/engine/SessionType;->PHOTO_SESSION:Lcom/smartengines/engine/SessionType;

    invoke-static {p1}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/targets/FacesTarget;->sessionTypes:Ljava/util/Set;

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/targets/FacesTarget;Landroid/graphics/Bitmap;ILjava/lang/Object;)Lcom/smartengines/targets/FacesTarget;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/smartengines/targets/FacesTarget;->photo:Landroid/graphics/Bitmap;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/smartengines/targets/FacesTarget;->copy(Landroid/graphics/Bitmap;)Lcom/smartengines/targets/FacesTarget;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/targets/FacesTarget;->photo:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final copy(Landroid/graphics/Bitmap;)Lcom/smartengines/targets/FacesTarget;
    .locals 1

    new-instance v0, Lcom/smartengines/targets/FacesTarget;

    invoke-direct {v0, p1}, Lcom/smartengines/targets/FacesTarget;-><init>(Landroid/graphics/Bitmap;)V

    return-object v0
.end method

.method public createSession(Lcom/smartengines/engine/Engine;Lcom/smartengines/engine/SessionType;Lcom/smartengines/engine/SessionSettingsLogger;)Lcom/smartengines/engine/Session;
    .locals 0

    const-string p3, "engine"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "sessionType"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    new-instance p1, Lkotlin/NotImplementedError;

    const-string p2, "An operation is not implemented: Not yet implemented"

    invoke-direct {p1, p2}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/targets/FacesTarget;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/targets/FacesTarget;

    iget-object v1, p0, Lcom/smartengines/targets/FacesTarget;->photo:Landroid/graphics/Bitmap;

    iget-object p1, p1, Lcom/smartengines/targets/FacesTarget;->photo:Landroid/graphics/Bitmap;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getEngineId()Lcom/smartengines/engine/EngineId;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/smartengines/targets/FacesTarget;->engineId:Lcom/smartengines/engine/EngineId;

    return-object v0
.end method

.method public final getPhoto()Landroid/graphics/Bitmap;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/smartengines/targets/FacesTarget;->photo:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public getSessionTypes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/smartengines/engine/SessionType;",
            ">;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/smartengines/targets/FacesTarget;->sessionTypes:Ljava/util/Set;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/smartengines/targets/FacesTarget;->photo:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FacesTarget(photo="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/targets/FacesTarget;->photo:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
