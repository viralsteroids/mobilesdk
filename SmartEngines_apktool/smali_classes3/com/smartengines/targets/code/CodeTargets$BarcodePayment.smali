.class public final Lcom/smartengines/targets/code/CodeTargets$BarcodePayment;
.super Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;
.source "CodeTargets.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/targets/code/CodeTargets;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BarcodePayment"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/smartengines/targets/code/CodeTargets$BarcodePayment;",
        "Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;",
        "<init>",
        "()V",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 216
    invoke-direct {p0}, Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;-><init>()V

    return-void
.end method


# virtual methods
.method public fill(Lcom/smartengines/code/CodeEngineSessionSettings;Lcom/smartengines/engine/SessionType;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    invoke-static {}, Lcom/smartengines/targets/TargetSettingsKt;->getTargetSettings()Lcom/smartengines/targets/TargetSettings;

    move-result-object v0

    invoke-interface {v0}, Lcom/smartengines/targets/TargetSettings;->getCode()Lcom/smartengines/targets/code/CodeSettings;

    move-result-object v0

    .line 219
    sget-object v1, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v1, p1, v2, v3, v2}, Lcom/smartengines/targets/code/CodeTargets;->setGlobalOptions$default(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;ILjava/lang/Object;)V

    .line 221
    sget-object v1, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v2, "barcode.enabled"

    const-string/jumbo v3, "true"

    invoke-static {v1, p1, v2, v3}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    sget-object v1, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v2, "barcode"

    invoke-interface {v0}, Lcom/smartengines/targets/code/CodeSettings;->getBarcodeTypes()Ljava/util/Set;

    move-result-object v3

    invoke-static {v1, p1, v2, v3}, Lcom/smartengines/targets/code/CodeTargets;->access$fillEngineSupportedTypesByDisabled(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/util/Set;)V

    .line 225
    sget-object v1, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v2, "barcode.feedMode"

    const-string/jumbo v3, "single"

    invoke-static {v1, p1, v2, v3}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    sget-object v1, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v2, "barcode.effortLevel"

    invoke-interface {v0}, Lcom/smartengines/targets/code/CodeSettings;->getBarcodeEffort()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, p1, v2, v3}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    sget-object v1, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v2, "barcode.maxAllowedCodes"

    const-string v3, "1"

    invoke-static {v1, p1, v2, v3}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    sget-object v1, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    invoke-virtual {p2}, Lcom/smartengines/engine/SessionType;->isVideo()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {v0}, Lcom/smartengines/targets/code/CodeSettings;->getBarcodeRoi()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const-string p2, "anywhere"

    :goto_0
    const-string v2, "barcode.roiDetectionMode"

    invoke-static {v1, p1, v2, p2}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    sget-object p2, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    invoke-interface {v0}, Lcom/smartengines/targets/code/CodeSettings;->getBarcodeSmart()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    const-string v1, "barcode.smartPaymentBarDecoding"

    invoke-static {p2, p1, v1, v0}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    sget-object p2, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v0, "barcode.preset"

    const-string v1, "PAYMENT|URL"

    invoke-static {p2, p1, v0, v1}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
