.class public interface abstract Lcom/smartengines/engine/SessionSettingsLogger;
.super Ljava/lang/Object;
.source "SessionSettingsLogger.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/engine/SessionSettingsLogger$Action;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u0001:\u0001\u0013J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u0001H&J\u0008\u0010\u0012\u001a\u00020\u0003H&R\u0018\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u001e\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00010\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/smartengines/engine/SessionSettingsLogger;",
        "",
        "logAction",
        "",
        "action",
        "Lcom/smartengines/engine/SessionSettingsLogger$Action;",
        "actions",
        "",
        "getActions",
        "()Ljava/util/List;",
        "logData",
        "key",
        "",
        "value",
        "data",
        "",
        "getData",
        "()Ljava/util/Map;",
        "clear",
        "Action",
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


# virtual methods
.method public abstract clear()V
.end method

.method public abstract getActions()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/smartengines/engine/SessionSettingsLogger$Action;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getData()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method public abstract logAction(Lcom/smartengines/engine/SessionSettingsLogger$Action;)V
.end method

.method public abstract logData(Ljava/lang/String;Ljava/lang/Object;)V
.end method
