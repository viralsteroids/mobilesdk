.class public final Lcom/smartengines/app/CameraButtonsModelKt;
.super Ljava/lang/Object;
.source "CameraButtonsModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u00a8\u0006\u0007"
    }
    d2 = {
        "calculateCropState",
        "",
        "target",
        "Lcom/smartengines/engine/RecognitionTarget;",
        "isVideoMode",
        "calculateIsGalleryAllowed",
        "isCrop",
        "app_storeRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic access$calculateCropState(Lcom/smartengines/engine/RecognitionTarget;Z)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/smartengines/app/CameraButtonsModelKt;->calculateCropState(Lcom/smartengines/engine/RecognitionTarget;Z)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$calculateIsGalleryAllowed(Lcom/smartengines/engine/RecognitionTarget;Z)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/smartengines/app/CameraButtonsModelKt;->calculateIsGalleryAllowed(Lcom/smartengines/engine/RecognitionTarget;Z)Z

    move-result p0

    return p0
.end method

.method private static final calculateCropState(Lcom/smartengines/engine/RecognitionTarget;Z)Z
    .locals 1

    .line 49
    instance-of v0, p0, Lcom/smartengines/targets/code/CodeTargets$PaymentDetails;

    if-eqz v0, :cond_0

    return p1

    .line 51
    :cond_0
    instance-of p1, p0, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineNumbers;

    if-nez p1, :cond_2

    .line 52
    instance-of p1, p0, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineIban;

    if-nez p1, :cond_2

    .line 53
    instance-of p1, p0, Lcom/smartengines/targets/code/CodeTargets$CodeTextLinePhone;

    if-nez p1, :cond_2

    .line 54
    instance-of p1, p0, Lcom/smartengines/targets/code/CodeTargets$CodeTextLinePhoneCis;

    if-nez p1, :cond_2

    .line 55
    instance-of p1, p0, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineCardNumber;

    if-nez p1, :cond_2

    .line 56
    instance-of p1, p0, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineInn;

    if-nez p1, :cond_2

    .line 57
    instance-of p1, p0, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineKpp;

    if-nez p1, :cond_2

    .line 58
    instance-of p1, p0, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineBic;

    if-nez p1, :cond_2

    .line 59
    instance-of p1, p0, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineBankAccount;

    if-nez p1, :cond_2

    .line 60
    instance-of p1, p0, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineVin;

    if-nez p1, :cond_2

    .line 61
    instance-of p0, p0, Lcom/smartengines/targets/code/CodeTargets$CodeTextLineContainerNumber;

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final calculateIsGalleryAllowed(Lcom/smartengines/engine/RecognitionTarget;Z)Z
    .locals 2

    .line 66
    invoke-interface {p0}, Lcom/smartengines/engine/RecognitionTarget;->getSessionTypes()Ljava/util/Set;

    move-result-object v0

    sget-object v1, Lcom/smartengines/engine/SessionType;->GALLERY_SESSION:Lcom/smartengines/engine/SessionType;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    if-eqz p1, :cond_1

    .line 70
    instance-of p0, p0, Lcom/smartengines/targets/code/CodeTargets$PaymentDetails;

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method
