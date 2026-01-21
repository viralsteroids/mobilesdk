.class public final Lcom/smartengines/utils/ImageStoreExternalKt;
.super Ljava/lang/Object;
.source "ImageStoreExternal.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "TAG",
        "",
        "primaryDirectory",
        "utils_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "myapp.ImageStorageExt"

.field private static final primaryDirectory:Ljava/lang/String; = "Pictures"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final synthetic access$getPrimaryDirectory$p()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/smartengines/utils/ImageStoreExternalKt;->primaryDirectory:Ljava/lang/String;

    return-object v0
.end method
