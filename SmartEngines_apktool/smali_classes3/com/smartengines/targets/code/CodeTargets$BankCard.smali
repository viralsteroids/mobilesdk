.class public final Lcom/smartengines/targets/code/CodeTargets$BankCard;
.super Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;
.source "CodeTargets.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/targets/code/CodeTargets;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BankCard"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/smartengines/targets/code/CodeTargets$BankCard$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0008\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/smartengines/targets/code/CodeTargets$BankCard;",
        "Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;",
        "<init>",
        "()V",
        "internalEngine",
        "",
        "getInternalEngine",
        "()Ljava/lang/String;",
        "fill",
        "",
        "Lcom/smartengines/code/CodeEngineSessionSettings;",
        "sessionType",
        "Lcom/smartengines/engine/SessionType;",
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
.field private final internalEngine:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 150
    invoke-direct {p0}, Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;-><init>()V

    .line 151
    const-string v0, "bank_card"

    iput-object v0, p0, Lcom/smartengines/targets/code/CodeTargets$BankCard;->internalEngine:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public fill(Lcom/smartengines/code/CodeEngineSessionSettings;Lcom/smartengines/engine/SessionType;)V
    .locals 5

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v1, v2, v1}, Lcom/smartengines/targets/code/CodeTargets;->setGlobalOptions$default(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;ILjava/lang/Object;)V

    .line 155
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v1, "bank_card.enabled"

    const-string/jumbo v3, "true"

    invoke-static {v0, p1, v1, v3}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    invoke-static {}, Lcom/smartengines/targets/TargetSettingsKt;->getTargetSettings()Lcom/smartengines/targets/TargetSettings;

    move-result-object v1

    invoke-interface {v1}, Lcom/smartengines/targets/TargetSettings;->getCode()Lcom/smartengines/targets/code/CodeSettings;

    move-result-object v1

    invoke-interface {v1}, Lcom/smartengines/targets/code/CodeSettings;->getCardTypes()Ljava/util/Set;

    move-result-object v1

    const-string v4, "bank_card"

    invoke-static {v0, p1, v4, v1}, Lcom/smartengines/targets/code/CodeTargets;->access$fillEngineSupportedTypesByDisabled(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/util/Set;)V

    .line 159
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    invoke-static {}, Lcom/smartengines/targets/TargetSettingsKt;->getTargetSettings()Lcom/smartengines/targets/TargetSettings;

    move-result-object v1

    invoke-interface {v1}, Lcom/smartengines/targets/TargetSettings;->getCommon()Lcom/smartengines/targets/CommonSettings;

    move-result-object v1

    invoke-interface {v1}, Lcom/smartengines/targets/CommonSettings;->getEnableStoppers()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    const-string v4, "bank_card.enableStoppers"

    invoke-static {v0, p1, v4, v1}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v1, "bank_card.extractBankCardImages.enabled"

    invoke-static {v0, p1, v1, v3}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets$BankCard$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Lcom/smartengines/engine/SessionType;->ordinal()I

    move-result p2

    aget p2, v0, p2

    if-eq p2, v2, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    const/4 p1, 0x3

    if-ne p2, p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 164
    :cond_1
    sget-object p2, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v0, "bank_card.captureMode"

    const-string v1, "anywhere"

    invoke-static {p2, p1, v0, v1}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final getInternalEngine()Ljava/lang/String;
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/smartengines/targets/code/CodeTargets$BankCard;->internalEngine:Ljava/lang/String;

    return-object v0
.end method
