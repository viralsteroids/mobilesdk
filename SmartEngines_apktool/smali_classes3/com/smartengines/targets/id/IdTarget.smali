.class public final Lcom/smartengines/targets/id/IdTarget;
.super Ljava/lang/Object;
.source "IdTarget.kt"

# interfaces
.implements Lcom/smartengines/engine/RecognitionTarget;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nIdTarget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdTarget.kt\ncom/smartengines/targets/id/IdTarget\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,232:1\n1863#2,2:233\n1863#2,2:235\n1863#2,2:237\n*S KotlinDebug\n*F\n+ 1 IdTarget.kt\ncom/smartengines/targets/id/IdTarget\n*L\n73#1:233,2\n115#1:235,2\n118#1:237,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\"\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00162\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0008\u0010 \u001a\u00020\u0003H\u0016J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010$\u001a\u00020%2\u0008\u0010&\u001a\u0004\u0018\u00010\'H\u00d6\u0003J\t\u0010(\u001a\u00020)H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008R\u0017\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006*"
    }
    d2 = {
        "Lcom/smartengines/targets/id/IdTarget;",
        "Lcom/smartengines/engine/RecognitionTarget;",
        "mode",
        "",
        "mask",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "getMode",
        "()Ljava/lang/String;",
        "getMask",
        "enabledMasks",
        "",
        "getEnabledMasks",
        "()Ljava/util/List;",
        "disabledMasks",
        "getDisabledMasks",
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
.field private final disabledMasks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final enabledMasks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

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
    .locals 8

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mask"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/smartengines/targets/id/IdTarget;->mode:Ljava/lang/String;

    .line 30
    iput-object p2, p0, Lcom/smartengines/targets/id/IdTarget;->mask:Ljava/lang/String;

    .line 35
    move-object v1, p2

    check-cast v1, Ljava/lang/CharSequence;

    const/4 p1, 0x1

    new-array v2, p1, [Ljava/lang/String;

    const-string p2, "/"

    const/4 v0, 0x0

    aput-object p2, v2, v0

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p2

    .line 36
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    new-array v3, p1, [Ljava/lang/String;

    const-string v1, ","

    aput-object v1, v3, v0

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/smartengines/targets/id/IdTarget;->enabledMasks:Ljava/util/List;

    .line 37
    invoke-static {p2, p1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_0

    move-object v2, p2

    check-cast v2, Ljava/lang/CharSequence;

    new-array v3, p1, [Ljava/lang/String;

    aput-object v1, v3, v0

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p2

    if-nez p2, :cond_1

    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    :cond_1
    iput-object p2, p0, Lcom/smartengines/targets/id/IdTarget;->disabledMasks:Ljava/util/List;

    .line 41
    sget-object p2, Lcom/smartengines/engine/EngineId;->ID:Lcom/smartengines/engine/EngineId;

    iput-object p2, p0, Lcom/smartengines/targets/id/IdTarget;->engineId:Lcom/smartengines/engine/EngineId;

    const/4 p2, 0x3

    .line 42
    new-array p2, p2, [Lcom/smartengines/engine/SessionType;

    sget-object v1, Lcom/smartengines/engine/SessionType;->VIDEO_SESSION:Lcom/smartengines/engine/SessionType;

    aput-object v1, p2, v0

    sget-object v0, Lcom/smartengines/engine/SessionType;->PHOTO_SESSION:Lcom/smartengines/engine/SessionType;

    aput-object v0, p2, p1

    const/4 p1, 0x2

    sget-object v0, Lcom/smartengines/engine/SessionType;->GALLERY_SESSION:Lcom/smartengines/engine/SessionType;

    aput-object v0, p2, p1

    invoke-static {p2}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/smartengines/targets/id/IdTarget;->sessionTypes:Ljava/util/Set;

    return-void
.end method

.method public static synthetic copy$default(Lcom/smartengines/targets/id/IdTarget;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/smartengines/targets/id/IdTarget;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/smartengines/targets/id/IdTarget;->mode:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/smartengines/targets/id/IdTarget;->mask:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/smartengines/targets/id/IdTarget;->copy(Ljava/lang/String;Ljava/lang/String;)Lcom/smartengines/targets/id/IdTarget;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/targets/id/IdTarget;->mode:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/smartengines/targets/id/IdTarget;->mask:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;)Lcom/smartengines/targets/id/IdTarget;
    .locals 1

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mask"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/smartengines/targets/id/IdTarget;

    invoke-direct {v0, p1, p2}, Lcom/smartengines/targets/id/IdTarget;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public createSession(Lcom/smartengines/engine/Engine;Lcom/smartengines/engine/SessionType;Lcom/smartengines/engine/SessionSettingsLogger;)Lcom/smartengines/engine/Session;
    .locals 11

    const-string v0, "engine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    check-cast p1, Lcom/smartengines/engine/id/IdEngineWrapper;

    .line 48
    invoke-static {}, Lcom/smartengines/targets/TargetSettingsKt;->getTargetSettings()Lcom/smartengines/targets/TargetSettings;

    move-result-object v0

    invoke-interface {v0}, Lcom/smartengines/targets/TargetSettings;->getId()Lcom/smartengines/targets/id/IdSettings;

    move-result-object v0

    invoke-interface {v0}, Lcom/smartengines/targets/id/IdSettings;->getVauthEnabled()Z

    move-result v0

    const-string v1, "common.extractTemplateImages"

    const-string v2, "common.enableStoppers"

    const-string v3, "common.ignoreInternalTerminality"

    const-string v4, "common.computeMetrics"

    const-string v5, "common.enableMultiThreading"

    const-string v6, "common.sessionTimeout"

    const-string/jumbo v7, "true"

    if-eqz v0, :cond_1

    sget-object v0, Lcom/smartengines/engine/SessionType;->VIDEO_SESSION:Lcom/smartengines/engine/SessionType;

    if-ne p2, v0, :cond_1

    .line 53
    invoke-virtual {p1}, Lcom/smartengines/engine/id/IdEngineWrapper;->getIdEngine()Lcom/smartengines/id/IdEngine;

    move-result-object p2

    invoke-virtual {p2}, Lcom/smartengines/id/IdEngine;->CreateVideoAuthenticationSessionSettings()Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;

    move-result-object p2

    const-string p3, "CreateVideoAuthenticationSessionSettings(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-static {}, Lcom/smartengines/targets/TargetSettingsKt;->getTargetSettings()Lcom/smartengines/targets/TargetSettings;

    move-result-object p3

    invoke-interface {p3}, Lcom/smartengines/targets/TargetSettings;->getCommon()Lcom/smartengines/targets/CommonSettings;

    move-result-object p3

    .line 57
    invoke-interface {p3}, Lcom/smartengines/targets/CommonSettings;->getSessionTimeout()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v6, v0}, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->SetOption(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    invoke-interface {p3}, Lcom/smartengines/targets/CommonSettings;->getMultiThreading()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v5, v0}, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->SetOption(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    invoke-interface {p3}, Lcom/smartengines/targets/CommonSettings;->getComputeMetrics()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v4, v0}, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->SetOption(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    invoke-interface {p3}, Lcom/smartengines/targets/CommonSettings;->getIgnoreTerminal()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v3, v0}, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->SetOption(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    invoke-interface {p3}, Lcom/smartengines/targets/CommonSettings;->getEnableStoppers()Z

    move-result p3

    invoke-static {p3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, v2, p3}, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->SetOption(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    invoke-virtual {p2, v1, v7}, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->SetOption(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    invoke-static {}, Lcom/smartengines/targets/TargetSettingsKt;->getTargetSettings()Lcom/smartengines/targets/TargetSettings;

    move-result-object p3

    invoke-interface {p3}, Lcom/smartengines/targets/TargetSettings;->getId()Lcom/smartengines/targets/id/IdSettings;

    .line 72
    iget-object p3, p0, Lcom/smartengines/targets/id/IdTarget;->mode:Ljava/lang/String;

    invoke-virtual {p2, p3}, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->SetCurrentMode(Ljava/lang/String;)V

    .line 73
    iget-object p3, p0, Lcom/smartengines/targets/id/IdTarget;->enabledMasks:Ljava/util/List;

    check-cast p3, Ljava/lang/Iterable;

    .line 233
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 74
    invoke-virtual {p2, v0}, Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;->AddEnabledDocumentTypes(Ljava/lang/String;)V

    goto :goto_0

    .line 79
    :cond_0
    new-instance p3, Lcom/smartengines/engine/id/VaSessionWrapper;

    .line 80
    invoke-virtual {p1}, Lcom/smartengines/engine/id/IdEngineWrapper;->getIdEngine()Lcom/smartengines/id/IdEngine;

    move-result-object v0

    .line 82
    invoke-virtual {p1}, Lcom/smartengines/engine/id/IdEngineWrapper;->getSignature()Ljava/lang/String;

    move-result-object p1

    .line 79
    invoke-direct {p3, v0, p2, p1}, Lcom/smartengines/engine/id/VaSessionWrapper;-><init>(Lcom/smartengines/id/IdEngine;Lcom/smartengines/id/IdVideoAuthenticationSessionSettings;Ljava/lang/String;)V

    check-cast p3, Lcom/smartengines/engine/Session;

    return-object p3

    .line 90
    :cond_1
    invoke-virtual {p1}, Lcom/smartengines/engine/id/IdEngineWrapper;->getIdEngine()Lcom/smartengines/id/IdEngine;

    move-result-object v0

    invoke-virtual {v0}, Lcom/smartengines/id/IdEngine;->CreateSessionSettings()Lcom/smartengines/id/IdSessionSettings;

    move-result-object v0

    const-string v8, "CreateSessionSettings(...)"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    invoke-static {}, Lcom/smartengines/targets/TargetSettingsKt;->getTargetSettings()Lcom/smartengines/targets/TargetSettings;

    move-result-object v8

    invoke-interface {v8}, Lcom/smartengines/targets/TargetSettings;->getCommon()Lcom/smartengines/targets/CommonSettings;

    move-result-object v8

    .line 94
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v8}, Lcom/smartengines/targets/CommonSettings;->getSessionTimeout()I

    move-result v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, ".0"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v0, v6, v9, p3}, Lcom/smartengines/targets/id/IdTargetKt;->access$setOption(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 95
    invoke-interface {v8}, Lcom/smartengines/targets/CommonSettings;->getMultiThreading()Z

    move-result v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v5, v6, p3}, Lcom/smartengines/targets/id/IdTargetKt;->access$setOption(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 96
    invoke-interface {v8}, Lcom/smartengines/targets/CommonSettings;->getComputeMetrics()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0, v4, v5, p3}, Lcom/smartengines/targets/id/IdTargetKt;->access$setOption(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 97
    invoke-interface {v8}, Lcom/smartengines/targets/CommonSettings;->getIgnoreTerminal()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v3, v4, p3}, Lcom/smartengines/targets/id/IdTargetKt;->access$setOption(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 98
    invoke-interface {v8}, Lcom/smartengines/targets/CommonSettings;->getEnableStoppers()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3, p3}, Lcom/smartengines/targets/id/IdTargetKt;->access$setOption(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 100
    invoke-static {v0, v1, v7, p3}, Lcom/smartengines/targets/id/IdTargetKt;->access$setOption(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 101
    const-string v1, "common.MRZCountriesListAddition"

    const-string v2, "UTO"

    invoke-static {v0, v1, v2, p3}, Lcom/smartengines/targets/id/IdTargetKt;->access$setOption(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 105
    invoke-virtual {p2}, Lcom/smartengines/engine/SessionType;->isSingleShot()Z

    move-result p2

    const-string v1, "face_control"

    if-eqz p2, :cond_4

    .line 106
    iget-object p2, p0, Lcom/smartengines/targets/id/IdTarget;->mode:Ljava/lang/String;

    .line 107
    const-string v2, "default"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string/jumbo p2, "singleshot"

    goto :goto_1

    .line 108
    :cond_2
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    move-object p2, v1

    goto :goto_1

    .line 109
    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/smartengines/targets/id/IdTarget;->mode:Ljava/lang/String;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string v2, "-singleshot"

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    .line 111
    :cond_4
    iget-object p2, p0, Lcom/smartengines/targets/id/IdTarget;->mode:Ljava/lang/String;

    .line 104
    :goto_1
    invoke-static {v0, p2, p3}, Lcom/smartengines/targets/id/IdTargetKt;->access$setCurrentMode(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 115
    iget-object p2, p0, Lcom/smartengines/targets/id/IdTarget;->enabledMasks:Ljava/util/List;

    check-cast p2, Ljava/lang/Iterable;

    .line 235
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 116
    invoke-static {v0, v2, p3}, Lcom/smartengines/targets/id/IdTargetKt;->access$addEnabledDocumentTypes(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    goto :goto_2

    .line 118
    :cond_5
    iget-object p2, p0, Lcom/smartengines/targets/id/IdTarget;->disabledMasks:Ljava/util/List;

    check-cast p2, Ljava/lang/Iterable;

    .line 237
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 119
    invoke-static {v0, v2, p3}, Lcom/smartengines/targets/id/IdTargetKt;->access$removeEnabledDocumentTypes(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    goto :goto_3

    .line 123
    :cond_6
    iget-object p2, p0, Lcom/smartengines/targets/id/IdTarget;->mode:Ljava/lang/String;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    .line 124
    const-string p2, "common.selfieWithPassportEnabled"

    invoke-static {v0, p2, v7, p3}, Lcom/smartengines/targets/id/IdTargetKt;->access$setOption(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 125
    const-string p2, "common.faceControlCheckEnabled"

    invoke-static {v0, p2, v7, p3}, Lcom/smartengines/targets/id/IdTargetKt;->access$setOption(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 126
    const-string p2, "common.reflectionEnabled"

    invoke-static {v0, p2, v7, p3}, Lcom/smartengines/targets/id/IdTargetKt;->access$setOption(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 130
    :cond_7
    invoke-static {}, Lcom/smartengines/targets/TargetSettingsKt;->getTargetSettings()Lcom/smartengines/targets/TargetSettings;

    move-result-object p2

    invoke-interface {p2}, Lcom/smartengines/targets/TargetSettings;->getId()Lcom/smartengines/targets/id/IdSettings;

    move-result-object p2

    invoke-interface {p2}, Lcom/smartengines/targets/id/IdSettings;->getEnableForensics()Z

    move-result p2

    if-eqz p2, :cond_8

    .line 131
    const-string p2, "myapp.IdTarget"

    const-string v1, "enable forensic"

    invoke-static {p2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 132
    const-string p2, "common.enableForensics"

    invoke-static {v0, p2, v7, p3}, Lcom/smartengines/targets/id/IdTargetKt;->access$setOption(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 133
    new-instance p2, Ljava/text/SimpleDateFormat;

    const-string v1, "dd.MM.yyyy"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {p2, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {p2, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "format(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "common.currentDate"

    invoke-static {v0, v1, p2, p3}, Lcom/smartengines/targets/id/IdTargetKt;->access$setOption(Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 134
    invoke-static {v0, p3}, Lcom/smartengines/targets/id/IdTargetKt;->access$enableForensics(Lcom/smartengines/id/IdSessionSettings;Lcom/smartengines/engine/SessionSettingsLogger;)V

    :cond_8
    if-eqz p3, :cond_9

    .line 140
    invoke-static {p3, v0}, Lcom/smartengines/targets/id/IdTargetKt;->access$dump(Lcom/smartengines/engine/SessionSettingsLogger;Lcom/smartengines/id/IdSessionSettings;)V

    .line 143
    :cond_9
    new-instance p2, Lcom/smartengines/engine/id/IdSessionWrapper;

    .line 144
    invoke-virtual {p1}, Lcom/smartengines/engine/id/IdEngineWrapper;->getIdEngine()Lcom/smartengines/id/IdEngine;

    move-result-object p3

    .line 146
    invoke-virtual {p1}, Lcom/smartengines/engine/id/IdEngineWrapper;->getSignature()Ljava/lang/String;

    move-result-object p1

    .line 143
    invoke-direct {p2, p3, v0, p1}, Lcom/smartengines/engine/id/IdSessionWrapper;-><init>(Lcom/smartengines/id/IdEngine;Lcom/smartengines/id/IdSessionSettings;Ljava/lang/String;)V

    check-cast p2, Lcom/smartengines/engine/Session;

    return-object p2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/smartengines/targets/id/IdTarget;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/smartengines/targets/id/IdTarget;

    iget-object v1, p0, Lcom/smartengines/targets/id/IdTarget;->mode:Ljava/lang/String;

    iget-object v3, p1, Lcom/smartengines/targets/id/IdTarget;->mode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/smartengines/targets/id/IdTarget;->mask:Ljava/lang/String;

    iget-object p1, p1, Lcom/smartengines/targets/id/IdTarget;->mask:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getDisabledMasks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/smartengines/targets/id/IdTarget;->disabledMasks:Ljava/util/List;

    return-object v0
.end method

.method public final getEnabledMasks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/smartengines/targets/id/IdTarget;->enabledMasks:Ljava/util/List;

    return-object v0
.end method

.method public getEngineId()Lcom/smartengines/engine/EngineId;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/smartengines/targets/id/IdTarget;->engineId:Lcom/smartengines/engine/EngineId;

    return-object v0
.end method

.method public final getMask()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/smartengines/targets/id/IdTarget;->mask:Ljava/lang/String;

    return-object v0
.end method

.method public final getMode()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/smartengines/targets/id/IdTarget;->mode:Ljava/lang/String;

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

    .line 42
    iget-object v0, p0, Lcom/smartengines/targets/id/IdTarget;->sessionTypes:Ljava/util/Set;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/smartengines/targets/id/IdTarget;->mode:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/smartengines/targets/id/IdTarget;->mask:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 152
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "IdTarget: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/smartengines/targets/id/IdTarget;->mode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/smartengines/targets/id/IdTarget;->mask:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
