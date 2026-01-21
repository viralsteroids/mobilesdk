.class public final Lcom/smartengines/app/CameraButtonsState;
.super Ljava/lang/Object;
.source "CameraButtonsState.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003H\u00c7\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d7\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d7\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d7\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\t\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/smartengines/app/CameraButtonsState;",
        "",
        "isCrop",
        "",
        "isVideoMode",
        "isVideoPhotoSwitchAllowed",
        "isGalleryAllowed",
        "<init>",
        "(ZZZZ)V",
        "()Z",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
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
.field public static final $stable:I


# instance fields
.field private final isCrop:Z

.field private final isGalleryAllowed:Z

.field private final isVideoMode:Z

.field private final isVideoPhotoSwitchAllowed:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/smartengines/app/CameraButtonsState;-><init>(ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZZZ)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-boolean p1, p0, Lcom/smartengines/app/CameraButtonsState;->isCrop:Z

    .line 6
    iput-boolean p2, p0, Lcom/smartengines/app/CameraButtonsState;->isVideoMode:Z

    .line 7
    iput-boolean p3, p0, Lcom/smartengines/app/CameraButtonsState;->isVideoPhotoSwitchAllowed:Z

    .line 8
    iput-boolean p4, p0, Lcom/smartengines/app/CameraButtonsState;->isGalleryAllowed:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x1

    if-eqz p6, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move p4, v0

    .line 4
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/smartengines/app/CameraButtonsState;-><init>(ZZZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/app/CameraButtonsState;ZZZZILjava/lang/Object;)Lcom/smartengines/app/CameraButtonsState;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lcom/smartengines/app/CameraButtonsState;->isCrop:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Lcom/smartengines/app/CameraButtonsState;->isVideoMode:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lcom/smartengines/app/CameraButtonsState;->isVideoPhotoSwitchAllowed:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcom/smartengines/app/CameraButtonsState;->isGalleryAllowed:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/smartengines/app/CameraButtonsState;->copy(ZZZZ)Lcom/smartengines/app/CameraButtonsState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/smartengines/app/CameraButtonsState;->isCrop:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/smartengines/app/CameraButtonsState;->isVideoMode:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/smartengines/app/CameraButtonsState;->isVideoPhotoSwitchAllowed:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/smartengines/app/CameraButtonsState;->isGalleryAllowed:Z

    return v0
.end method

.method public final copy(ZZZZ)Lcom/smartengines/app/CameraButtonsState;
    .locals 1

    new-instance v0, Lcom/smartengines/app/CameraButtonsState;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/smartengines/app/CameraButtonsState;-><init>(ZZZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/app/CameraButtonsState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/app/CameraButtonsState;

    iget-boolean v1, p0, Lcom/smartengines/app/CameraButtonsState;->isCrop:Z

    iget-boolean v3, p1, Lcom/smartengines/app/CameraButtonsState;->isCrop:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/smartengines/app/CameraButtonsState;->isVideoMode:Z

    iget-boolean v3, p1, Lcom/smartengines/app/CameraButtonsState;->isVideoMode:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/smartengines/app/CameraButtonsState;->isVideoPhotoSwitchAllowed:Z

    iget-boolean v3, p1, Lcom/smartengines/app/CameraButtonsState;->isVideoPhotoSwitchAllowed:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/smartengines/app/CameraButtonsState;->isGalleryAllowed:Z

    iget-boolean p1, p1, Lcom/smartengines/app/CameraButtonsState;->isGalleryAllowed:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/smartengines/app/CameraButtonsState;->isCrop:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/smartengines/app/CameraButtonsState;->isVideoMode:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/smartengines/app/CameraButtonsState;->isVideoPhotoSwitchAllowed:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/smartengines/app/CameraButtonsState;->isGalleryAllowed:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isCrop()Z
    .locals 1

    .line 5
    iget-boolean v0, p0, Lcom/smartengines/app/CameraButtonsState;->isCrop:Z

    return v0
.end method

.method public final isGalleryAllowed()Z
    .locals 1

    .line 8
    iget-boolean v0, p0, Lcom/smartengines/app/CameraButtonsState;->isGalleryAllowed:Z

    return v0
.end method

.method public final isVideoMode()Z
    .locals 1

    .line 6
    iget-boolean v0, p0, Lcom/smartengines/app/CameraButtonsState;->isVideoMode:Z

    return v0
.end method

.method public final isVideoPhotoSwitchAllowed()Z
    .locals 1

    .line 7
    iget-boolean v0, p0, Lcom/smartengines/app/CameraButtonsState;->isVideoPhotoSwitchAllowed:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CameraButtonsState(isCrop="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/smartengines/app/CameraButtonsState;->isCrop:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isVideoMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/smartengines/app/CameraButtonsState;->isVideoMode:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isVideoPhotoSwitchAllowed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/smartengines/app/CameraButtonsState;->isVideoPhotoSwitchAllowed:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isGalleryAllowed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/smartengines/app/CameraButtonsState;->isGalleryAllowed:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
