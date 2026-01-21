.class public interface abstract Lcom/smartengines/targets/code/CodeSettings;
.super Ljava/lang/Object;
.source "CodeSettings.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0017\u0008f\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0008X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\rR\u0012\u0010\u0010\u001a\u00020\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0013R\u0012\u0010\u0016\u001a\u00020\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0013R\u0018\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u0006R\u0012\u0010\u001a\u001a\u00020\u0011X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0013R\u0018\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u0006R\u0012\u0010\u001e\u001a\u00020\u0008X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\nR\u0018\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\u0006R\u0012\u0010\"\u001a\u00020\u0008X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010\nR\u0018\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010\u0006R\u0012\u0010&\u001a\u00020\u0008X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010\n\u00a8\u0006("
    }
    d2 = {
        "Lcom/smartengines/targets/code/CodeSettings;",
        "",
        "barcodeTypes",
        "",
        "",
        "getBarcodeTypes",
        "()Ljava/util/Set;",
        "barcodeMax",
        "",
        "getBarcodeMax",
        "()I",
        "barcodeRoi",
        "getBarcodeRoi",
        "()Ljava/lang/String;",
        "barcodeEffort",
        "getBarcodeEffort",
        "barcodeDecode",
        "",
        "getBarcodeDecode",
        "()Z",
        "barcodeSmart",
        "getBarcodeSmart",
        "barcodeNonpayment",
        "getBarcodeNonpayment",
        "cardTypes",
        "getCardTypes",
        "cardShowOptionalData",
        "getCardShowOptionalData",
        "paymentTypes",
        "getPaymentTypes",
        "lineMax",
        "getLineMax",
        "lineTypes",
        "getLineTypes",
        "meterMax",
        "getMeterMax",
        "plateTypes",
        "getPlateTypes",
        "containerMax",
        "getContainerMax",
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


# virtual methods
.method public abstract getBarcodeDecode()Z
.end method

.method public abstract getBarcodeEffort()Ljava/lang/String;
.end method

.method public abstract getBarcodeMax()I
.end method

.method public abstract getBarcodeNonpayment()Z
.end method

.method public abstract getBarcodeRoi()Ljava/lang/String;
.end method

.method public abstract getBarcodeSmart()Z
.end method

.method public abstract getBarcodeTypes()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getCardShowOptionalData()Z
.end method

.method public abstract getCardTypes()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getContainerMax()I
.end method

.method public abstract getLineMax()I
.end method

.method public abstract getLineTypes()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getMeterMax()I
.end method

.method public abstract getPaymentTypes()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getPlateTypes()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method
