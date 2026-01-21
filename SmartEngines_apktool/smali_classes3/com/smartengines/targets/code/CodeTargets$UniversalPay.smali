.class public final Lcom/smartengines/targets/code/CodeTargets$UniversalPay;
.super Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;
.source "CodeTargets.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/targets/code/CodeTargets;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "UniversalPay"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J\u0008\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/smartengines/targets/code/CodeTargets$UniversalPay;",
        "Lcom/smartengines/targets/code/CodeTargets$CodeTargetBase;",
        "<init>",
        "()V",
        "fill",
        "",
        "Lcom/smartengines/code/CodeEngineSessionSettings;",
        "sessionType",
        "Lcom/smartengines/engine/SessionType;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 411
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

    .line 413
    invoke-static {}, Lcom/smartengines/targets/TargetSettingsKt;->getTargetSettings()Lcom/smartengines/targets/TargetSettings;

    move-result-object p2

    invoke-interface {p2}, Lcom/smartengines/targets/TargetSettings;->getCode()Lcom/smartengines/targets/code/CodeSettings;

    move-result-object p2

    .line 414
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v1, v2, v1}, Lcom/smartengines/targets/code/CodeTargets;->setGlobalOptions$default(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;ILjava/lang/Object;)V

    .line 415
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v1, "_simulateROI"

    const-string/jumbo v2, "true"

    invoke-static {v0, p1, v1, v2}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 416
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v1, "_ROItype"

    const-string v3, "centered_roi"

    invoke-static {v0, p1, v1, v3}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 417
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v1, "_offsetX"

    const-string v3, "0"

    invoke-static {v0, p1, v1, v3}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 418
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v1, "_aspectRatio"

    const-string v3, "0.5"

    invoke-static {v0, p1, v1, v3}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 419
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v1, "global.workflow"

    const-string/jumbo v3, "universalPay"

    invoke-static {v0, p1, v1, v3}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 422
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v1, "barcode.enabled"

    invoke-static {v0, p1, v1, v2}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 423
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v1, "barcode.QR_CODE.enabled"

    invoke-static {v0, p1, v1, v2}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 424
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v1, "barcode.AZTEC.enabled"

    invoke-static {v0, p1, v1, v2}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 425
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v1, "barcode.DATA_MATRIX.enabled"

    invoke-static {v0, p1, v1, v2}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 426
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v1, "barcode.preset"

    const-string v3, "PAYMENT|URL"

    invoke-static {v0, p1, v1, v3}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 427
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v1, "barcode.feedMode"

    const-string v3, "sequence"

    invoke-static {v0, p1, v1, v3}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 428
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    invoke-interface {p2}, Lcom/smartengines/targets/code/CodeSettings;->getBarcodeSmart()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    const-string v3, "barcode.smartPaymentBarDecoding"

    invoke-static {v0, p1, v3, v1}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 429
    sget-object v0, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    invoke-interface {p2}, Lcom/smartengines/targets/code/CodeSettings;->getBarcodeNonpayment()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p2

    const-string v1, "global.universalPay.collectNonPaymentBarcodes"

    invoke-static {v0, p1, v1, p2}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 431
    sget-object p2, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v0, "bank_card.enabled"

    invoke-static {p2, p1, v0, v2}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    sget-object p2, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v0, "bank_card.extractBankCardImages.enabled"

    invoke-static {p2, p1, v0, v2}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 433
    sget-object p2, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v0, "bank_card.captureMode"

    const-string v1, "anywhere"

    invoke-static {p2, p1, v0, v1}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 435
    sget-object p2, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v0, "code_text_line.enabled"

    invoke-static {p2, p1, v0, v2}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 436
    sget-object p2, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v0, "code_text_line.phone_number.enabled"

    invoke-static {p2, p1, v0, v2}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    .line 437
    sget-object p2, Lcom/smartengines/targets/code/CodeTargets;->INSTANCE:Lcom/smartengines/targets/code/CodeTargets;

    const-string v0, "code_text_line.card_number.enabled"

    invoke-static {p2, p1, v0, v2}, Lcom/smartengines/targets/code/CodeTargets;->access$setOption(Lcom/smartengines/targets/code/CodeTargets;Lcom/smartengines/code/CodeEngineSessionSettings;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 441
    const-string v0, "UniversalPay: barcode + bank card + text lines"

    return-object v0
.end method
