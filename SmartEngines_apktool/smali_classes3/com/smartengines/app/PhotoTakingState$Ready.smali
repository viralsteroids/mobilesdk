.class public final Lcom/smartengines/app/PhotoTakingState$Ready;
.super Ljava/lang/Object;
.source "PhotoTakingState.kt"

# interfaces
.implements Lcom/smartengines/app/PhotoTakingState;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/app/PhotoTakingState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Ready"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c7\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d7\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d7\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d7\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/smartengines/app/PhotoTakingState$Ready;",
        "Lcom/smartengines/app/PhotoTakingState;",
        "photo",
        "Lcom/smartengines/app/Photo;",
        "fromGallery",
        "",
        "<init>",
        "(Lcom/smartengines/app/Photo;Z)V",
        "getPhoto",
        "()Lcom/smartengines/app/Photo;",
        "getFromGallery",
        "()Z",
        "component1",
        "component2",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
        "app_storeRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final fromGallery:Z

.field private final photo:Lcom/smartengines/app/Photo;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/smartengines/app/Photo;Z)V
    .locals 1

    const-string v0, "photo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/app/PhotoTakingState$Ready;->photo:Lcom/smartengines/app/Photo;

    iput-boolean p2, p0, Lcom/smartengines/app/PhotoTakingState$Ready;->fromGallery:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/app/PhotoTakingState$Ready;Lcom/smartengines/app/Photo;ZILjava/lang/Object;)Lcom/smartengines/app/PhotoTakingState$Ready;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/smartengines/app/PhotoTakingState$Ready;->photo:Lcom/smartengines/app/Photo;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lcom/smartengines/app/PhotoTakingState$Ready;->fromGallery:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/smartengines/app/PhotoTakingState$Ready;->copy(Lcom/smartengines/app/Photo;Z)Lcom/smartengines/app/PhotoTakingState$Ready;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/smartengines/app/Photo;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/app/PhotoTakingState$Ready;->photo:Lcom/smartengines/app/Photo;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/smartengines/app/PhotoTakingState$Ready;->fromGallery:Z

    return v0
.end method

.method public final copy(Lcom/smartengines/app/Photo;Z)Lcom/smartengines/app/PhotoTakingState$Ready;
    .locals 1

    const-string v0, "photo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/smartengines/app/PhotoTakingState$Ready;

    invoke-direct {v0, p1, p2}, Lcom/smartengines/app/PhotoTakingState$Ready;-><init>(Lcom/smartengines/app/Photo;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/app/PhotoTakingState$Ready;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/app/PhotoTakingState$Ready;

    iget-object v1, p0, Lcom/smartengines/app/PhotoTakingState$Ready;->photo:Lcom/smartengines/app/Photo;

    iget-object v3, p1, Lcom/smartengines/app/PhotoTakingState$Ready;->photo:Lcom/smartengines/app/Photo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/smartengines/app/PhotoTakingState$Ready;->fromGallery:Z

    iget-boolean p1, p1, Lcom/smartengines/app/PhotoTakingState$Ready;->fromGallery:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getFromGallery()Z
    .locals 1

    .line 6
    iget-boolean v0, p0, Lcom/smartengines/app/PhotoTakingState$Ready;->fromGallery:Z

    return v0
.end method

.method public final getPhoto()Lcom/smartengines/app/Photo;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/smartengines/app/PhotoTakingState$Ready;->photo:Lcom/smartengines/app/Photo;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/smartengines/app/PhotoTakingState$Ready;->photo:Lcom/smartengines/app/Photo;

    invoke-virtual {v0}, Lcom/smartengines/app/Photo;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/smartengines/app/PhotoTakingState$Ready;->fromGallery:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Ready(photo="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/app/PhotoTakingState$Ready;->photo:Lcom/smartengines/app/Photo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", fromGallery="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/smartengines/app/PhotoTakingState$Ready;->fromGallery:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
