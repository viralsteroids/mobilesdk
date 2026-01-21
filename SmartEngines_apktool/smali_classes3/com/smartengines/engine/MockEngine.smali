.class public final Lcom/smartengines/engine/MockEngine;
.super Ljava/lang/Object;
.source "Mock.kt"

# interfaces
.implements Lcom/smartengines/engine/Engine;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u00020\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0006\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/smartengines/engine/MockEngine;",
        "Lcom/smartengines/engine/Engine;",
        "<init>",
        "()V",
        "isVideoModeAllowed",
        "",
        "()Z",
        "createEngine",
        "",
        "bundle",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createEngine([B)V
    .locals 0

    return-void
.end method

.method public isVideoModeAllowed()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
