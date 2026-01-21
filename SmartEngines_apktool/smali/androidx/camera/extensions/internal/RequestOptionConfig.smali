.class public Landroidx/camera/extensions/internal/RequestOptionConfig;
.super Ljava/lang/Object;
.source "RequestOptionConfig.java"

# interfaces
.implements Landroidx/camera/core/impl/ReadableConfig;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/extensions/internal/RequestOptionConfig$Builder;
    }
.end annotation


# static fields
.field static final CAPTURE_REQUEST_ID_STEM:Ljava/lang/String; = "camera2.captureRequest.option."


# instance fields
.field private mConfig:Landroidx/camera/core/impl/Config;


# direct methods
.method private constructor <init>(Landroidx/camera/core/impl/Config;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Landroidx/camera/extensions/internal/RequestOptionConfig;->mConfig:Landroidx/camera/core/impl/Config;

    return-void
.end method

.method synthetic constructor <init>(Landroidx/camera/core/impl/Config;Landroidx/camera/extensions/internal/RequestOptionConfig$1;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Landroidx/camera/extensions/internal/RequestOptionConfig;-><init>(Landroidx/camera/core/impl/Config;)V

    return-void
.end method

.method static createOptionFromKey(Landroid/hardware/camera2/CaptureRequest$Key;)Landroidx/camera/core/impl/Config$Option;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/camera2/CaptureRequest$Key<",
            "*>;)",
            "Landroidx/camera/core/impl/Config$Option<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "camera2.captureRequest.option."

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/hardware/camera2/CaptureRequest$Key;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-class v1, Ljava/lang/Object;

    invoke-static {v0, v1, p0}, Landroidx/camera/core/impl/Config$Option;->create(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Landroidx/camera/core/impl/Config$Option;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getConfig()Landroidx/camera/core/impl/Config;
    .locals 1

    .line 44
    iget-object v0, p0, Landroidx/camera/extensions/internal/RequestOptionConfig;->mConfig:Landroidx/camera/core/impl/Config;

    return-object v0
.end method
