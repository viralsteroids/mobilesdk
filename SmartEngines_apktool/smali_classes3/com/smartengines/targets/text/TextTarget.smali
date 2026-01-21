.class public final Lcom/smartengines/targets/text/TextTarget;
.super Ljava/lang/Object;
.source "TextTarget.kt"

# interfaces
.implements Lcom/smartengines/engine/RecognitionTarget;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTextTarget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextTarget.kt\ncom/smartengines/targets/text/TextTarget\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n1863#2,2:112\n*S KotlinDebug\n*F\n+ 1 TextTarget.kt\ncom/smartengines/targets/text/TextTarget\n*L\n47#1:112,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\"\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0008\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/smartengines/targets/text/TextTarget;",
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
        "toString",
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

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    sget-object v0, Lcom/smartengines/engine/EngineId;->TEXT:Lcom/smartengines/engine/EngineId;

    iput-object v0, p0, Lcom/smartengines/targets/text/TextTarget;->engineId:Lcom/smartengines/engine/EngineId;

    const/4 v0, 0x2

    .line 19
    new-array v0, v0, [Lcom/smartengines/engine/SessionType;

    const/4 v1, 0x0

    sget-object v2, Lcom/smartengines/engine/SessionType;->PHOTO_SESSION:Lcom/smartengines/engine/SessionType;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/smartengines/engine/SessionType;->GALLERY_SESSION:Lcom/smartengines/engine/SessionType;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lcom/smartengines/targets/text/TextTarget;->sessionTypes:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public createSession(Lcom/smartengines/engine/Engine;Lcom/smartengines/engine/SessionType;Lcom/smartengines/engine/SessionSettingsLogger;)Lcom/smartengines/engine/Session;
    .locals 5

    const-string v0, "engine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    check-cast p1, Lcom/smartengines/engine/text/TextEngineWrapper;

    .line 25
    invoke-virtual {p1}, Lcom/smartengines/engine/text/TextEngineWrapper;->getTextEngine()Lcom/smartengines/text/TextEngine;

    move-result-object p2

    invoke-virtual {p2}, Lcom/smartengines/text/TextEngine;->CreateSessionSettings()Lcom/smartengines/text/TextSessionSettings;

    move-result-object p2

    .line 27
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p2}, Lcom/smartengines/targets/text/TextSessionOptionsKt;->parse(Lcom/smartengines/text/TextSessionSettings;)Lcom/smartengines/targets/text/TextSessionOptions;

    move-result-object v0

    .line 30
    invoke-static {}, Lcom/smartengines/targets/TargetSettingsKt;->getTargetSettings()Lcom/smartengines/targets/TargetSettings;

    move-result-object v1

    invoke-interface {v1}, Lcom/smartengines/targets/TargetSettings;->getCommon()Lcom/smartengines/targets/CommonSettings;

    move-result-object v1

    .line 31
    invoke-interface {v1}, Lcom/smartengines/targets/CommonSettings;->getMultiThreading()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "enableMultiThreading"

    invoke-static {p2, v2, v1, p3}, Lcom/smartengines/targets/text/TextTargetKt;->access$setOption(Lcom/smartengines/text/TextSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 36
    invoke-static {}, Lcom/smartengines/targets/TargetSettingsKt;->getTargetSettings()Lcom/smartengines/targets/TargetSettings;

    move-result-object v1

    invoke-interface {v1}, Lcom/smartengines/targets/TargetSettings;->getText()Lcom/smartengines/targets/text/TextSettings;

    move-result-object v1

    invoke-interface {v1}, Lcom/smartengines/targets/text/TextSettings;->getPageDetection()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "page"

    goto :goto_0

    .line 37
    :cond_0
    const-string/jumbo v1, "standard"

    .line 35
    :goto_0
    const-string v2, "mode"

    invoke-static {p2, v2, v1, p3}, Lcom/smartengines/targets/text/TextTargetKt;->access$setOption(Lcom/smartengines/text/TextSessionSettings;Ljava/lang/String;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 42
    const-string v1, "punct"

    invoke-static {p2, v1, p3}, Lcom/smartengines/targets/text/TextTargetKt;->access$addEnabledLanguages(Lcom/smartengines/text/TextSessionSettings;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    .line 44
    invoke-static {}, Lcom/smartengines/targets/TargetSettingsKt;->getTargetSettings()Lcom/smartengines/targets/TargetSettings;

    move-result-object v1

    invoke-interface {v1}, Lcom/smartengines/targets/TargetSettings;->getText()Lcom/smartengines/targets/text/TextSettings;

    move-result-object v1

    invoke-interface {v1}, Lcom/smartengines/targets/text/TextSettings;->getLanguages()Ljava/util/Set;

    move-result-object v1

    .line 45
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "enabled languages: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "myapp.TextTarget"

    invoke-static {v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 46
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "options.languages: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/smartengines/targets/text/TextSessionOptions;->getLanguages()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    invoke-virtual {v0}, Lcom/smartengines/targets/text/TextSessionOptions;->getLanguages()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 112
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 48
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 49
    invoke-static {p2, v2, p3}, Lcom/smartengines/targets/text/TextTargetKt;->access$addEnabledLanguages(Lcom/smartengines/text/TextSessionSettings;Ljava/lang/String;Lcom/smartengines/engine/SessionSettingsLogger;)V

    goto :goto_1

    :cond_2
    if-eqz p3, :cond_3

    .line 54
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p3, p2}, Lcom/smartengines/targets/text/TextTargetKt;->access$dump(Lcom/smartengines/engine/SessionSettingsLogger;Lcom/smartengines/text/TextSessionSettings;)V

    .line 57
    :cond_3
    new-instance p3, Lcom/smartengines/engine/text/TextSessionWrapper;

    invoke-virtual {p1}, Lcom/smartengines/engine/text/TextEngineWrapper;->getTextEngine()Lcom/smartengines/text/TextEngine;

    move-result-object v0

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/smartengines/engine/text/TextEngineWrapper;->getSignature()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, v0, p2, p1}, Lcom/smartengines/engine/text/TextSessionWrapper;-><init>(Lcom/smartengines/text/TextEngine;Lcom/smartengines/text/TextSessionSettings;Ljava/lang/String;)V

    check-cast p3, Lcom/smartengines/engine/Session;

    return-object p3
.end method

.method public getEngineId()Lcom/smartengines/engine/EngineId;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/smartengines/targets/text/TextTarget;->engineId:Lcom/smartengines/engine/EngineId;

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

    .line 19
    iget-object v0, p0, Lcom/smartengines/targets/text/TextTarget;->sessionTypes:Ljava/util/Set;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 61
    const-string v0, "TextTarget"

    return-object v0
.end method
