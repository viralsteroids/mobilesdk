.class public final Lcom/smartengines/app/CameraButtonsModel;
.super Ljava/lang/Object;
.source "CameraButtonsModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0003\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000fR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/smartengines/app/CameraButtonsModel;",
        "",
        "<init>",
        "()V",
        "stateFlow",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/smartengines/app/CameraButtonsState;",
        "getStateFlow",
        "()Lkotlinx/coroutines/flow/MutableStateFlow;",
        "target",
        "Lcom/smartengines/engine/RecognitionTarget;",
        "onTargetChanged",
        "",
        "switchIsVideoMode",
        "isVideoMode",
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

.field public static final INSTANCE:Lcom/smartengines/app/CameraButtonsModel;

.field private static final stateFlow:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/smartengines/app/CameraButtonsState;",
            ">;"
        }
    .end annotation
.end field

.field private static target:Lcom/smartengines/engine/RecognitionTarget;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/smartengines/app/CameraButtonsModel;

    invoke-direct {v0}, Lcom/smartengines/app/CameraButtonsModel;-><init>()V

    sput-object v0, Lcom/smartengines/app/CameraButtonsModel;->INSTANCE:Lcom/smartengines/app/CameraButtonsModel;

    .line 12
    new-instance v1, Lcom/smartengines/app/CameraButtonsState;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/smartengines/app/CameraButtonsState;-><init>(ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    sput-object v0, Lcom/smartengines/app/CameraButtonsModel;->stateFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    const/16 v0, 0x8

    sput v0, Lcom/smartengines/app/CameraButtonsModel;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getStateFlow()Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/smartengines/app/CameraButtonsState;",
            ">;"
        }
    .end annotation

    .line 12
    sget-object v0, Lcom/smartengines/app/CameraButtonsModel;->stateFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object v0
.end method

.method public final onTargetChanged(Lcom/smartengines/engine/RecognitionTarget;)V
    .locals 7

    const-string/jumbo v0, "target"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    sput-object p1, Lcom/smartengines/app/CameraButtonsModel;->target:Lcom/smartengines/engine/RecognitionTarget;

    .line 22
    invoke-interface {p1}, Lcom/smartengines/engine/RecognitionTarget;->getSessionTypes()Ljava/util/Set;

    move-result-object v0

    .line 25
    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->first(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lcom/smartengines/engine/SessionType;->VIDEO_SESSION:Lcom/smartengines/engine/SessionType;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v4

    .line 26
    :goto_0
    invoke-static {p1, v1}, Lcom/smartengines/app/CameraButtonsModelKt;->access$calculateCropState(Lcom/smartengines/engine/RecognitionTarget;Z)Z

    move-result v2

    .line 27
    sget-object v5, Lcom/smartengines/app/CameraButtonsModel;->stateFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 29
    sget-object v6, Lcom/smartengines/engine/SessionType;->VIDEO_SESSION:Lcom/smartengines/engine/SessionType;

    invoke-interface {v0, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 30
    sget-object v6, Lcom/smartengines/engine/SessionType;->PHOTO_SESSION:Lcom/smartengines/engine/SessionType;

    invoke-interface {v0, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move v3, v4

    .line 31
    :goto_1
    invoke-static {p1, v2}, Lcom/smartengines/app/CameraButtonsModelKt;->access$calculateIsGalleryAllowed(Lcom/smartengines/engine/RecognitionTarget;Z)Z

    move-result p1

    .line 27
    new-instance v0, Lcom/smartengines/app/CameraButtonsState;

    invoke-direct {v0, v2, v1, v3, p1}, Lcom/smartengines/app/CameraButtonsState;-><init>(ZZZZ)V

    invoke-interface {v5, v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final switchIsVideoMode(Z)V
    .locals 9

    .line 38
    sget-object v0, Lcom/smartengines/app/CameraButtonsModel;->stateFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/smartengines/app/CameraButtonsState;

    .line 40
    sget-object v1, Lcom/smartengines/app/CameraButtonsModel;->target:Lcom/smartengines/engine/RecognitionTarget;

    if-nez v1, :cond_0

    const-string/jumbo v1, "target"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v1, 0x0

    :cond_0
    invoke-static {v1, p1}, Lcom/smartengines/app/CameraButtonsModelKt;->access$calculateCropState(Lcom/smartengines/engine/RecognitionTarget;Z)Z

    move-result v3

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v4, p1

    .line 38
    invoke-static/range {v2 .. v8}, Lcom/smartengines/app/CameraButtonsState;->copy$default(Lcom/smartengines/app/CameraButtonsState;ZZZZILjava/lang/Object;)Lcom/smartengines/app/CameraButtonsState;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method
