.class public final Lcom/smartengines/engine/doc/DocEngineWrapper;
.super Ljava/lang/Object;
.source "DocEngineWrapper.kt"

# interfaces
.implements Lcom/smartengines/engine/Engine;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0012\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\t@BX\u0086.\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u00020\u000eX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000f\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/smartengines/engine/doc/DocEngineWrapper;",
        "Lcom/smartengines/engine/Engine;",
        "signature",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "getSignature",
        "()Ljava/lang/String;",
        "value",
        "Lcom/smartengines/doc/DocEngine;",
        "docEngine",
        "getDocEngine",
        "()Lcom/smartengines/doc/DocEngine;",
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
.field private docEngine:Lcom/smartengines/doc/DocEngine;

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
    iput-object p1, p0, Lcom/smartengines/engine/doc/DocEngineWrapper;->signature:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public createEngine([B)V
    .locals 1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    .line 20
    invoke-static {p1, v0}, Lcom/smartengines/doc/DocEngine;->Create([BZ)Lcom/smartengines/doc/DocEngine;

    move-result-object p1

    goto :goto_0

    .line 21
    :cond_0
    invoke-static {v0}, Lcom/smartengines/doc/DocEngine;->CreateFromEmbeddedBundle(Z)Lcom/smartengines/doc/DocEngine;

    move-result-object p1

    .line 20
    :goto_0
    iput-object p1, p0, Lcom/smartengines/engine/doc/DocEngineWrapper;->docEngine:Lcom/smartengines/doc/DocEngine;

    return-void
.end method

.method public final getDocEngine()Lcom/smartengines/doc/DocEngine;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/smartengines/engine/doc/DocEngineWrapper;->docEngine:Lcom/smartengines/doc/DocEngine;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "docEngine"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSignature()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/smartengines/engine/doc/DocEngineWrapper;->signature:Ljava/lang/String;

    return-object v0
.end method

.method public isVideoModeAllowed()Z
    .locals 1

    .line 16
    iget-boolean v0, p0, Lcom/smartengines/engine/doc/DocEngineWrapper;->isVideoModeAllowed:Z

    return v0
.end method
