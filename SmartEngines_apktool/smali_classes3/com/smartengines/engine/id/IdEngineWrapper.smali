.class public final Lcom/smartengines/engine/id/IdEngineWrapper;
.super Ljava/lang/Object;
.source "IdEngineWrapper.kt"

# interfaces
.implements Lcom/smartengines/engine/Engine;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0012\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J*\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\t@BX\u0086.\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\u000eX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000f\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/smartengines/engine/id/IdEngineWrapper;",
        "Lcom/smartengines/engine/Engine;",
        "signature",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "getSignature",
        "()Ljava/lang/String;",
        "value",
        "Lcom/smartengines/id/IdEngine;",
        "idEngine",
        "getIdEngine",
        "()Lcom/smartengines/id/IdEngine;",
        "isVideoModeAllowed",
        "",
        "()Z",
        "createEngine",
        "",
        "bundle",
        "",
        "lazyConfiguration",
        "initConcurrency",
        "",
        "delayedInitialization",
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


# instance fields
.field private idEngine:Lcom/smartengines/id/IdEngine;

.field private final isVideoModeAllowed:Z

.field private final signature:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "signature"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/smartengines/engine/id/IdEngineWrapper;->signature:Ljava/lang/String;

    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lcom/smartengines/engine/id/IdEngineWrapper;->isVideoModeAllowed:Z

    return-void
.end method

.method private final createEngine([BZIZ)V
    .locals 0

    if-eqz p1, :cond_0

    .line 43
    invoke-static {p1, p2, p3, p4}, Lcom/smartengines/id/IdEngine;->Create([BZIZ)Lcom/smartengines/id/IdEngine;

    move-result-object p1

    goto :goto_0

    .line 48
    :cond_0
    invoke-static {p2, p3, p4}, Lcom/smartengines/id/IdEngine;->CreateFromEmbeddedBundle(ZIZ)Lcom/smartengines/id/IdEngine;

    move-result-object p1

    .line 43
    :goto_0
    iput-object p1, p0, Lcom/smartengines/engine/id/IdEngineWrapper;->idEngine:Lcom/smartengines/id/IdEngine;

    return-void
.end method


# virtual methods
.method public createEngine([B)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 20
    invoke-direct {p0, p1, v0, v1, v0}, Lcom/smartengines/engine/id/IdEngineWrapper;->createEngine([BZIZ)V

    return-void
.end method

.method public final getIdEngine()Lcom/smartengines/id/IdEngine;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/smartengines/engine/id/IdEngineWrapper;->idEngine:Lcom/smartengines/id/IdEngine;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "idEngine"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSignature()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/smartengines/engine/id/IdEngineWrapper;->signature:Ljava/lang/String;

    return-object v0
.end method

.method public isVideoModeAllowed()Z
    .locals 1

    .line 16
    iget-boolean v0, p0, Lcom/smartengines/engine/id/IdEngineWrapper;->isVideoModeAllowed:Z

    return v0
.end method
