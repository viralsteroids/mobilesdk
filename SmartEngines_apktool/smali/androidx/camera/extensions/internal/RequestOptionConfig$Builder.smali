.class public Landroidx/camera/extensions/internal/RequestOptionConfig$Builder;
.super Ljava/lang/Object;
.source "RequestOptionConfig.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/extensions/internal/RequestOptionConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private mMutableOptionsBundle:Landroidx/camera/core/impl/MutableOptionsBundle;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    invoke-static {}, Landroidx/camera/core/impl/MutableOptionsBundle;->create()Landroidx/camera/core/impl/MutableOptionsBundle;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/extensions/internal/RequestOptionConfig$Builder;->mMutableOptionsBundle:Landroidx/camera/core/impl/MutableOptionsBundle;

    return-void
.end method

.method public static from(Landroidx/camera/core/impl/Config;)Landroidx/camera/extensions/internal/RequestOptionConfig$Builder;
    .locals 3

    .line 67
    new-instance v0, Landroidx/camera/extensions/internal/RequestOptionConfig$Builder;

    invoke-direct {v0}, Landroidx/camera/extensions/internal/RequestOptionConfig$Builder;-><init>()V

    .line 68
    new-instance v1, Landroidx/camera/extensions/internal/RequestOptionConfig$Builder$$ExternalSyntheticLambda0;

    invoke-direct {v1, v0, p0}, Landroidx/camera/extensions/internal/RequestOptionConfig$Builder$$ExternalSyntheticLambda0;-><init>(Landroidx/camera/extensions/internal/RequestOptionConfig$Builder;Landroidx/camera/core/impl/Config;)V

    const-string v2, "camera2.captureRequest.option."

    invoke-interface {p0, v2, v1}, Landroidx/camera/core/impl/Config;->findOptions(Ljava/lang/String;Landroidx/camera/core/impl/Config$OptionMatcher;)V

    return-object v0
.end method

.method static synthetic lambda$from$0(Landroidx/camera/extensions/internal/RequestOptionConfig$Builder;Landroidx/camera/core/impl/Config;Landroidx/camera/core/impl/Config$Option;)Z
    .locals 1

    .line 73
    iget-object p0, p0, Landroidx/camera/extensions/internal/RequestOptionConfig$Builder;->mMutableOptionsBundle:Landroidx/camera/core/impl/MutableOptionsBundle;

    .line 74
    invoke-interface {p1, p2}, Landroidx/camera/core/impl/Config;->getOptionPriority(Landroidx/camera/core/impl/Config$Option;)Landroidx/camera/core/impl/Config$OptionPriority;

    move-result-object v0

    .line 75
    invoke-interface {p1, p2}, Landroidx/camera/core/impl/Config;->retrieveOption(Landroidx/camera/core/impl/Config$Option;)Ljava/lang/Object;

    move-result-object p1

    .line 73
    invoke-virtual {p0, p2, v0, p1}, Landroidx/camera/core/impl/MutableOptionsBundle;->insertOption(Landroidx/camera/core/impl/Config$Option;Landroidx/camera/core/impl/Config$OptionPriority;Ljava/lang/Object;)V

    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public build()Landroidx/camera/extensions/internal/RequestOptionConfig;
    .locals 3

    .line 97
    new-instance v0, Landroidx/camera/extensions/internal/RequestOptionConfig;

    iget-object v1, p0, Landroidx/camera/extensions/internal/RequestOptionConfig$Builder;->mMutableOptionsBundle:Landroidx/camera/core/impl/MutableOptionsBundle;

    invoke-static {v1}, Landroidx/camera/core/impl/OptionsBundle;->from(Landroidx/camera/core/impl/Config;)Landroidx/camera/core/impl/OptionsBundle;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/camera/extensions/internal/RequestOptionConfig;-><init>(Landroidx/camera/core/impl/Config;Landroidx/camera/extensions/internal/RequestOptionConfig$1;)V

    return-object v0
.end method

.method public setCaptureRequestOption(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/extensions/internal/RequestOptionConfig$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/hardware/camera2/CaptureRequest$Key<",
            "TValueT;>;TValueT;)",
            "Landroidx/camera/extensions/internal/RequestOptionConfig$Builder;"
        }
    .end annotation

    .line 87
    invoke-static {p1}, Landroidx/camera/extensions/internal/RequestOptionConfig;->createOptionFromKey(Landroid/hardware/camera2/CaptureRequest$Key;)Landroidx/camera/core/impl/Config$Option;

    move-result-object p1

    .line 88
    iget-object v0, p0, Landroidx/camera/extensions/internal/RequestOptionConfig$Builder;->mMutableOptionsBundle:Landroidx/camera/core/impl/MutableOptionsBundle;

    invoke-virtual {v0, p1, p2}, Landroidx/camera/core/impl/MutableOptionsBundle;->insertOption(Landroidx/camera/core/impl/Config$Option;Ljava/lang/Object;)V

    return-object p0
.end method
