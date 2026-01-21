.class public final Lcom/smartengines/engine/id/VaCallback;
.super Lcom/smartengines/id/IdVideoAuthenticationCallbacks;
.source "VaCallback.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00052\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0008\u0010\u001a\u001a\u00020\u0005H\u0016J\u0012\u0010\u001b\u001a\u00020\u00052\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u00052\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u00052\u0008\u0010\u0011\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0008\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0008\u0010$\u001a\u00020\u0005H\u0016J\u0008\u0010%\u001a\u00020\u0005H\u0016R\u001f\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000f\u00a8\u0006&"
    }
    d2 = {
        "Lcom/smartengines/engine/id/VaCallback;",
        "Lcom/smartengines/id/IdVideoAuthenticationCallbacks;",
        "onInstruction",
        "Lkotlin/Function1;",
        "",
        "",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;)V",
        "getOnInstruction",
        "()Lkotlin/jvm/functions/Function1;",
        "sessionEnded",
        "",
        "getSessionEnded",
        "()Z",
        "setSessionEnded",
        "(Z)V",
        "InstructionReceived",
        "p0",
        "",
        "instr",
        "Lcom/smartengines/id/IdVideoAuthenticationInstruction;",
        "MessageReceived",
        "message",
        "AuthenticationStatusUpdated",
        "status",
        "Lcom/smartengines/id/IdCheckStatus;",
        "GlobalTimeoutReached",
        "DocumentResultUpdated",
        "Lcom/smartengines/id/IdResult;",
        "FaceLivenessResultUpdated",
        "Lcom/smartengines/id/IdFaceLivenessResult;",
        "FaceMatchingResultUpdated",
        "Lcom/smartengines/id/IdFaceSimilarityResult;",
        "AnomalyRegistered",
        "p1",
        "Lcom/smartengines/id/IdVideoAuthenticationAnomaly;",
        "InstructionTimeoutReached",
        "SessionEnded",
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
.field private final onInstruction:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private sessionEnded:Z


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "onInstruction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Lcom/smartengines/id/IdVideoAuthenticationCallbacks;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/smartengines/engine/id/VaCallback;->onInstruction:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public AnomalyRegistered(ILcom/smartengines/id/IdVideoAuthenticationAnomaly;)V
    .locals 0

    .line 48
    const-string p1, "myapp.VaCallback"

    const-string p2, "   ---> AnomalyRegistered"

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public AuthenticationStatusUpdated(Lcom/smartengines/id/IdCheckStatus;)V
    .locals 2

    const-string/jumbo v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "   ---> AuthenticationStatusUpdated "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "myapp.VaCallback"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public DocumentResultUpdated(Lcom/smartengines/id/IdResult;)V
    .locals 1

    .line 39
    const-string p1, "myapp.VaCallback"

    const-string v0, "   ---> DocumentResultUpdated"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public FaceLivenessResultUpdated(Lcom/smartengines/id/IdFaceLivenessResult;)V
    .locals 1

    .line 42
    const-string p1, "myapp.VaCallback"

    const-string v0, "   ---> FaceLivenessResultUpdated"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public FaceMatchingResultUpdated(Lcom/smartengines/id/IdFaceSimilarityResult;)V
    .locals 1

    .line 45
    const-string p1, "myapp.VaCallback"

    const-string v0, "   ---> FaceMatchingResultUpdated"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public GlobalTimeoutReached()V
    .locals 2

    .line 36
    const-string v0, "myapp.VaCallback"

    const-string v1, "   ---> GlobalTimeoutReached"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public InstructionReceived(ILcom/smartengines/id/IdVideoAuthenticationInstruction;)V
    .locals 2

    const-string v0, "instr"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-virtual {p2}, Lcom/smartengines/id/IdVideoAuthenticationInstruction;->GetInstructionCode()Ljava/lang/String;

    move-result-object p2

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "   ---> InstructionReceived "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "myapp.VaCallback"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    iget-object p1, p0, Lcom/smartengines/engine/id/VaCallback;->onInstruction:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public InstructionTimeoutReached()V
    .locals 2

    .line 51
    const-string v0, "myapp.VaCallback"

    const-string v1, "   ---> InstructionTimeoutReached"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public MessageReceived(Ljava/lang/String;)V
    .locals 2

    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "   ---> MessageReceived "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "myapp.VaCallback"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public SessionEnded()V
    .locals 2

    .line 54
    const-string v0, "myapp.VaCallback"

    const-string v1, "   ---> SessionEnded"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    .line 55
    iput-boolean v0, p0, Lcom/smartengines/engine/id/VaCallback;->sessionEnded:Z

    return-void
.end method

.method public final getOnInstruction()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/smartengines/engine/id/VaCallback;->onInstruction:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getSessionEnded()Z
    .locals 1

    .line 21
    iget-boolean v0, p0, Lcom/smartengines/engine/id/VaCallback;->sessionEnded:Z

    return v0
.end method

.method public final setSessionEnded(Z)V
    .locals 0

    .line 21
    iput-boolean p1, p0, Lcom/smartengines/engine/id/VaCallback;->sessionEnded:Z

    return-void
.end method
