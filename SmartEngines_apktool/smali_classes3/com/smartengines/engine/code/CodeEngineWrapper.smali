.class public final Lcom/smartengines/engine/code/CodeEngineWrapper;
.super Ljava/lang/Object;
.source "CodeEngineWrapper.kt"

# interfaces
.implements Lcom/smartengines/engine/Engine;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0012\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u0008\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u0010\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/smartengines/engine/code/CodeEngineWrapper;",
        "Lcom/smartengines/engine/Engine;",
        "signature",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "getSignature",
        "()Ljava/lang/String;",
        "codeEngine",
        "Lcom/smartengines/code/CodeEngine;",
        "getCodeEngine",
        "()Lcom/smartengines/code/CodeEngine;",
        "setCodeEngine",
        "(Lcom/smartengines/code/CodeEngine;)V",
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


# instance fields
.field public codeEngine:Lcom/smartengines/code/CodeEngine;

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
    iput-object p1, p0, Lcom/smartengines/engine/code/CodeEngineWrapper;->signature:Ljava/lang/String;

    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lcom/smartengines/engine/code/CodeEngineWrapper;->isVideoModeAllowed:Z

    return-void
.end method


# virtual methods
.method public createEngine([B)V
    .locals 1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    .line 19
    invoke-static {p1, v0}, Lcom/smartengines/code/CodeEngine;->Create([BZ)Lcom/smartengines/code/CodeEngine;

    move-result-object p1

    goto :goto_0

    .line 20
    :cond_0
    invoke-static {v0}, Lcom/smartengines/code/CodeEngine;->CreateFromEmbeddedBundle(Z)Lcom/smartengines/code/CodeEngine;

    move-result-object p1

    .line 19
    :goto_0
    invoke-virtual {p0, p1}, Lcom/smartengines/engine/code/CodeEngineWrapper;->setCodeEngine(Lcom/smartengines/code/CodeEngine;)V

    return-void
.end method

.method public final getCodeEngine()Lcom/smartengines/code/CodeEngine;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/smartengines/engine/code/CodeEngineWrapper;->codeEngine:Lcom/smartengines/code/CodeEngine;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "codeEngine"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSignature()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/smartengines/engine/code/CodeEngineWrapper;->signature:Ljava/lang/String;

    return-object v0
.end method

.method public isVideoModeAllowed()Z
    .locals 1

    .line 15
    iget-boolean v0, p0, Lcom/smartengines/engine/code/CodeEngineWrapper;->isVideoModeAllowed:Z

    return v0
.end method

.method public final setCodeEngine(Lcom/smartengines/code/CodeEngine;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    iput-object p1, p0, Lcom/smartengines/engine/code/CodeEngineWrapper;->codeEngine:Lcom/smartengines/code/CodeEngine;

    return-void
.end method
