.class public interface abstract Lcom/smartengines/engine/RecognitionTarget;
.super Ljava/lang/Object;
.source "RecognitionTarget.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0018\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/smartengines/engine/RecognitionTarget;",
        "",
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
.method public abstract createSession(Lcom/smartengines/engine/Engine;Lcom/smartengines/engine/SessionType;Lcom/smartengines/engine/SessionSettingsLogger;)Lcom/smartengines/engine/Session;
.end method

.method public abstract getEngineId()Lcom/smartengines/engine/EngineId;
.end method

.method public abstract getSessionTypes()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/smartengines/engine/SessionType;",
            ">;"
        }
    .end annotation
.end method
