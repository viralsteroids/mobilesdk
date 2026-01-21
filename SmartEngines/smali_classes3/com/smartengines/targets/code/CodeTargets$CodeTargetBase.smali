.class public abstract Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;
.super Ljava/lang/Object;
.source "CodeTargets.kt"

# interfaces
.implements Lcom/smartengines/engine/RecognitionTarget;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/targets/code/CodeTargets;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "CodeTargetBase"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0008&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0014\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0011\u001a\u00020\nH&R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;",
        "Lcom/smartengines/engine/RecognitionTarget;",
        "<init>",
        "()V",
        "engineId",
        "Lcom/smartengines/engine/EngineId;",
        "getEngineId",
        "()Lcom/smartengines/engine/EngineId;",
        "sessionTypes",
        "",
        "Lcom/smartengines/engine/SessionType;",
        "getSessionTypes",
        "()Ljava/util/Set;",
        "createSession",
        "Lcom/smartengines/engine/Session;",
        "engine",
        "Lcom/smartengines/engine/Engine;",
        "sessionType",
        "logger",
        "Lcom/smartengines/engine/SessionSettingsLogger;",
        "fill",
        "",
        "Lcom/smartengines/code/CodeEngineSessionSettings;",
        "targets_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final engineId:Lcom/smartengines/engine/EngineId;

.field private final sessionTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/smartengines/engine/SessionType;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    sget-object v0, Lcom/smartengines/engine/EngineId;->CODE:Lcom/smartengines/engine/EngineId;

    iput-object v0, p0, Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;->engineId:Lcom/smartengines/engine/EngineId;

    const/4 v0, 0x3

    .line 111
    new-array v0, v0, [Lcom/smartengines/engine/SessionType;

    const/4 v1, 0x0

    sget-object v2, Lcom/smartengines/engine/SessionType;->VIDEO_SESSION:Lcom/smartengines/engine/SessionType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/smartengines/engine/SessionType;->PHOTO_SESSION:Lcom/smartengines/engine/SessionType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/smartengines/engine/SessionType;->GALLERY_SESSION:Lcom/smartengines/engine/SessionType;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;->sessionTypes:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public createSession(Lcom/smartengines/engine/Engine;Lcom/smartengines/engine/SessionType;Lcom/smartengines/engine/SessionSettingsLogger;)Lcom/smartengines/engine/Session;
    .locals 1

    const-string v0, "engine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    invoke-virtual {v0, p3}, Lcom/smartengines/targets/code/CodeTargets;->setSessionSettingsLogger(Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 117
    check-cast p1, Lcom/smartengines/engine/code/CodeEngineWrapper;

    .line 120
    invoke-virtual {p1}, Lcom/smartengines/engine/code/CodeEngineWrapper;->getCodeEngine()Lcom/smartengines/code/CodeEngine;

    move-result-object v0

    invoke-virtual {v0}, Lcom/smartengines/code/CodeEngine;->GetDefaultSessionSettings()Lcom/smartengines/code/CodeEngineSessionSettings;

    move-result-object v0

    .line 122
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0, v0, p2}, Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;->fill(Lcom/smartengines/code/CodeEngineSessionSettings;Lcom/smartengines/engine/SessionType;)V

    if-eqz p3, :cond_0

    .line 125
    invoke-static {p3, v0}, Lcom/smartengines/targets/code/CodeTargetsKt;->access$dump(Lcom/smartengines/engine/SessionSettingsLogger;Lcom/smartengines/code/CodeEngineSessionSettings;)V

    .line 138
    :cond_0
    new-instance p2, Lcom/smartengines/engine/code/CodeSessionWrapper;

    invoke-virtual {p1}, Lcom/smartengines/engine/code/CodeEngineWrapper;->getCodeEngine()Lcom/smartengines/code/CodeEngine;

    move-result-object p3

    invoke-virtual {p1}, Lcom/smartengines/engine/code/CodeEngineWrapper;->getSignature()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p3, v0, p1}, Lcom/smartengines/engine/code/CodeSessionWrapper;-><init>(Lcom/smartengines/code/CodeEngine;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;)V

    check-cast p2, Lcom/smartengines/engine/Session;

    return-object p2
.end method

.method public abstract fill(Lcom/smartengines/code/CodeEngineSessionSettings;Lcom/smartengines/engine/SessionType;)V
.end method

.method public getEngineId()Lcom/smartengines/engine/EngineId;
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;->engineId:Lcom/smartengines/engine/EngineId;

    return-object v0
.end method

.method public getSessionTypes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/smartengines/engine/SessionType;",
            ">;"
        }
    .end annotation

    .line 111
    iget-object v0, p0, Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;->sessionTypes:Ljava/util/Set;

    return-object v0
.end method
