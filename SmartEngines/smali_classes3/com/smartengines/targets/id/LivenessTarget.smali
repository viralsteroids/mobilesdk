.class public final Lcom/smartengines/targets/id/LivenessTarget;
.super Ljava/lang/Object;
.source "LivenessTarget.kt"

# interfaces
.implements Lcom/smartengines/engine/RecognitionTarget;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/smartengines/targets/id/LivenessTarget;",
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
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    sget-object v0, Lcom/smartengines/engine/EngineId;->ID:Lcom/smartengines/engine/EngineId;

    iput-object v0, p0, Lcom/smartengines/targets/id/LivenessTarget;->engineId:Lcom/smartengines/engine/EngineId;

    .line 20
    sget-object v0, Lcom/smartengines/engine/SessionType;->VIDEO_SESSION:Lcom/smartengines/engine/SessionType;

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/smartengines/targets/id/LivenessTarget;->sessionTypes:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public createSession(Lcom/smartengines/engine/Engine;Lcom/smartengines/engine/SessionType;Lcom/smartengines/engine/SessionSettingsLogger;)Lcom/smartengines/engine/Session;
    .locals 3

    const-string v0, "engine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    check-cast p1, Lcom/smartengines/engine/id/IdEngineWrapper;

    .line 27
    invoke-virtual {p1}, Lcom/smartengines/engine/id/IdEngineWrapper;->getIdEngine()Lcom/smartengines/id/IdEngine;

    move-result-object p2

    invoke-virtual {p2}, Lcom/smartengines/id/IdEngine;->CreateFaceSessionSettings()Lcom/smartengines/id/IdFaceSessionSettings;

    move-result-object p2

    .line 31
    invoke-static {}, Lcom/smartengines/targets/TargetSettingsKt;->getTargetSettings()Lcom/smartengines/targets/TargetSettings;

    move-result-object v0

    invoke-interface {v0}, Lcom/smartengines/targets/TargetSettings;->getCommon()Lcom/smartengines/targets/CommonSettings;

    move-result-object v0

    .line 32
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0}, Lcom/smartengines/targets/CommonSettings;->getMultiThreading()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    const-string v1, "common.enableMultiThreading"

    invoke-static {p2, v1, v0, p3}, Lcom/smartengines/targets/id/LivenessTargetKt;->access$setOption(Lcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 36
    invoke-static {}, Lcom/smartengines/targets/TargetSettingsKt;->getTargetSettings()Lcom/smartengines/targets/TargetSettings;

    move-result-object v0

    invoke-interface {v0}, Lcom/smartengines/targets/TargetSettings;->getId()Lcom/smartengines/targets/id/IdSettings;

    move-result-object v0

    .line 37
    invoke-interface {v0}, Lcom/smartengines/targets/id/IdSettings;->getMinInstrTime()I

    move-result v1

    mul-int/lit16 v1, v1, 0x3e8

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "faceMinInstructionTime"

    invoke-static {p2, v2, v1, p3}, Lcom/smartengines/targets/id/LivenessTargetKt;->access$setOption(Lcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 38
    invoke-interface {v0}, Lcom/smartengines/targets/id/IdSettings;->getMaxInstrTime()I

    move-result v1

    mul-int/lit16 v1, v1, 0x3e8

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "faceMaxInstructionTime"

    invoke-static {p2, v2, v1, p3}, Lcom/smartengines/targets/id/LivenessTargetKt;->access$setOption(Lcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 39
    invoke-interface {v0}, Lcom/smartengines/targets/id/IdSettings;->getAlwaysPass()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "alwaysPass"

    invoke-static {p2, v2, v1, p3}, Lcom/smartengines/targets/id/LivenessTargetKt;->access$setOption(Lcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 40
    invoke-interface {v0}, Lcom/smartengines/targets/id/IdSettings;->getInstrCount()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "instructionsCountBase"

    invoke-static {p2, v2, v1, p3}, Lcom/smartengines/targets/id/LivenessTargetKt;->access$setOption(Lcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 41
    invoke-interface {v0}, Lcom/smartengines/targets/id/IdSettings;->getInstrCountDeltaRandom()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "instructionsCountDeltaRandom"

    invoke-static {p2, v2, v1, p3}, Lcom/smartengines/targets/id/LivenessTargetKt;->access$setOption(Lcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 42
    invoke-interface {v0}, Lcom/smartengines/targets/id/IdSettings;->getInstrFailed()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "allowedNumberOfFailedInstructions"

    invoke-static {p2, v2, v1, p3}, Lcom/smartengines/targets/id/LivenessTargetKt;->access$setOption(Lcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 43
    invoke-interface {v0}, Lcom/smartengines/targets/id/IdSettings;->getMinPassTime()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "minPassTime"

    invoke-static {p2, v1, v0, p3}, Lcom/smartengines/targets/id/LivenessTargetKt;->access$setOption(Lcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    if-eqz p3, :cond_0

    .line 48
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p3, p2}, Lcom/smartengines/targets/id/LivenessTargetKt;->access$dump(Lcom/smartengines/engine/SessionSettingsLogger;Lcom/smartengines/id/IdFaceSessionSettings;)V

    .line 52
    :cond_0
    new-instance p3, Lcom/smartengines/engine/id/LvSessionWrapper;

    .line 53
    invoke-virtual {p1}, Lcom/smartengines/engine/id/IdEngineWrapper;->getIdEngine()Lcom/smartengines/id/IdEngine;

    move-result-object v0

    .line 54
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 55
    invoke-virtual {p1}, Lcom/smartengines/engine/id/IdEngineWrapper;->getSignature()Ljava/lang/String;

    move-result-object p1

    .line 52
    invoke-direct {p3, v0, p2, p1}, Lcom/smartengines/engine/id/LvSessionWrapper;-><init>(Lcom/smartengines/id/IdEngine;Lcom/smartengines/id/IdFaceSessionSettings;Ljava/lang/String;)V

    check-cast p3, Lcom/smartengines/engine/Session;

    return-object p3
.end method

.method public getEngineId()Lcom/smartengines/engine/EngineId;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/smartengines/targets/id/LivenessTarget;->engineId:Lcom/smartengines/engine/EngineId;

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

    .line 20
    iget-object v0, p0, Lcom/smartengines/targets/id/LivenessTarget;->sessionTypes:Ljava/util/Set;

    return-object v0
.end method
