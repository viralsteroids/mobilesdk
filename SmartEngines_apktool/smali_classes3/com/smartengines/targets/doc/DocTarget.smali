.class public final Lcom/smartengines/targets/doc/DocTarget;
.super Ljava/lang/Object;
.source "DocTarget.kt"

# interfaces
.implements Lcom/smartengines/engine/RecognitionTarget;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00102\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0008\u0010\u001a\u001a\u00020\u0003H\u0016J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u001d\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\u0008\u0010 \u001a\u0004\u0018\u00010!H\u00d6\u0003J\t\u0010\"\u001a\u00020#H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u001a\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006$"
    }
    d2 = {
        "Lcom/smartengines/targets/doc/DocTarget;",
        "Lcom/smartengines/engine/RecognitionTarget;",
        "mode",
        "",
        "mask",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "getMode",
        "()Ljava/lang/String;",
        "getMask",
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
        "toString",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
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

.field private final mask:Ljava/lang/String;

.field private final mode:Ljava/lang/String;

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
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mask"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/smartengines/targets/doc/DocTarget;->mode:Ljava/lang/String;

    .line 19
    iput-object p2, p0, Lcom/smartengines/targets/doc/DocTarget;->mask:Ljava/lang/String;

    .line 21
    sget-object p1, Lcom/smartengines/engine/EngineId;->DOC:Lcom/smartengines/engine/EngineId;

    iput-object p1, p0, Lcom/smartengines/targets/doc/DocTarget;->engineId:Lcom/smartengines/engine/EngineId;

    const/4 p1, 0x2

    .line 22
    new-array p1, p1, [Lcom/smartengines/engine/SessionType;

    const/4 p2, 0x0

    sget-object v0, Lcom/smartengines/engine/SessionType;->PHOTO_SESSION:Lcom/smartengines/engine/SessionType;

    aput-object v0, p1, p2

    const/4 p2, 0x1

    sget-object v0, Lcom/smartengines/engine/SessionType;->GALLERY_SESSION:Lcom/smartengines/engine/SessionType;

    aput-object v0, p1, p2

    invoke-static {p1}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/targets/doc/DocTarget;->sessionTypes:Ljava/util/Set;

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/targets/doc/DocTarget;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/smartengines/targets/doc/DocTarget;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/smartengines/targets/doc/DocTarget;->mode:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/smartengines/targets/doc/DocTarget;->mask:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/smartengines/targets/doc/DocTarget;->copy(Ljava/lang/String;Ljava/lang/String;)Lcom/smartengines/targets/doc/DocTarget;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/targets/doc/DocTarget;->mode:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/targets/doc/DocTarget;->mask:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;)Lcom/smartengines/targets/doc/DocTarget;
    .locals 1

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mask"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/smartengines/targets/doc/DocTarget;

    invoke-direct {v0, p1, p2}, Lcom/smartengines/targets/doc/DocTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public createSession(Lcom/smartengines/engine/Engine;Lcom/smartengines/engine/SessionType;Lcom/smartengines/engine/SessionSettingsLogger;)Lcom/smartengines/engine/Session;
    .locals 2

    const-string v0, "engine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    check-cast p1, Lcom/smartengines/engine/doc/DocEngineWrapper;

    .line 28
    invoke-virtual {p1}, Lcom/smartengines/engine/doc/DocEngineWrapper;->getDocEngine()Lcom/smartengines/doc/DocEngine;

    move-result-object p2

    invoke-virtual {p2}, Lcom/smartengines/doc/DocEngine;->CreateSessionSettings()Lcom/smartengines/doc/DocSessionSettings;

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

    const-string v1, "enableMultiThreading"

    invoke-static {p2, v1, v0, p3}, Lcom/smartengines/targets/doc/DocTargetKt;->access$setOption(Lcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 36
    iget-object v0, p0, Lcom/smartengines/targets/doc/DocTarget;->mode:Ljava/lang/String;

    invoke-static {p2, v0, p3}, Lcom/smartengines/targets/doc/DocTargetKt;->access$setCurrentMode(Lcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 37
    iget-object v0, p0, Lcom/smartengines/targets/doc/DocTarget;->mask:Ljava/lang/String;

    invoke-static {p2, v0, p3}, Lcom/smartengines/targets/doc/DocTargetKt;->access$addEnabledDocumentTypes(Lcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    if-eqz p3, :cond_0

    .line 41
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p3, p2}, Lcom/smartengines/targets/doc/DocTargetKt;->access$dump(Lcom/smartengines/engine/SessionSettingsLogger;Lcom/smartengines/doc/DocSessionSettings;)V

    .line 44
    :cond_0
    new-instance p3, Lcom/smartengines/engine/doc/DocSessionWrapper;

    invoke-virtual {p1}, Lcom/smartengines/engine/doc/DocEngineWrapper;->getDocEngine()Lcom/smartengines/doc/DocEngine;

    move-result-object v0

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/smartengines/engine/doc/DocEngineWrapper;->getSignature()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, v0, p2, p1}, Lcom/smartengines/engine/doc/DocSessionWrapper;-><init>(Lcom/smartengines/doc/DocEngine;Lcom/smartengines/doc/DocSessionSettings;Ljava/lang/String;)V

    check-cast p3, Lcom/smartengines/engine/Session;

    return-object p3
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/targets/doc/DocTarget;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/targets/doc/DocTarget;

    iget-object v1, p0, Lcom/smartengines/targets/doc/DocTarget;->mode:Ljava/lang/String;

    iget-object v3, p1, Lcom/smartengines/targets/doc/DocTarget;->mode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/smartengines/targets/doc/DocTarget;->mask:Ljava/lang/String;

    iget-object p1, p1, Lcom/smartengines/targets/doc/DocTarget;->mask:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public getEngineId()Lcom/smartengines/engine/EngineId;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/smartengines/targets/doc/DocTarget;->engineId:Lcom/smartengines/engine/EngineId;

    return-object v0
.end method

.method public final getMask()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/smartengines/targets/doc/DocTarget;->mask:Ljava/lang/String;

    return-object v0
.end method

.method public final getMode()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/smartengines/targets/doc/DocTarget;->mode:Ljava/lang/String;

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

    .line 22
    iget-object v0, p0, Lcom/smartengines/targets/doc/DocTarget;->sessionTypes:Ljava/util/Set;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/smartengines/targets/doc/DocTarget;->mode:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/targets/doc/DocTarget;->mask:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DocTarget: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/targets/doc/DocTarget;->mode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/targets/doc/DocTarget;->mask:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
