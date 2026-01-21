.class public interface abstract Lcom/smartengines/app/settings/CodeSettingsWriter;
.super Ljava/lang/Object;
.source "CodeSettings.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008f\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0008H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000cH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000cH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000cH&J\u0016\u0010\u000f\u001a\u00020\u00032\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000cH&J\u0016\u0010\u0011\u001a\u00020\u00032\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0008H&J\u0016\u0010\u0013\u001a\u00020\u00032\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0008H&J\u0016\u0010\u0015\u001a\u00020\u00032\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0008H&\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/smartengines/app/settings/CodeSettingsWriter;",
        "",
        "writeBarcodeTypes",
        "",
        "value",
        "",
        "",
        "writeBarcodeMax",
        "",
        "writeBarcodeRoi",
        "writeBarcodeEffort",
        "writeBarcodeDecode",
        "",
        "writeBarcodeSmart",
        "writeBarcodeNonpayment",
        "writeCardTypes",
        "writeShowOptionalData",
        "writePaymentTypes",
        "writeLineMax",
        "writeLineTypes",
        "writeMeterMax",
        "writePlateTypes",
        "writeContainerMax",
        "app_storeRelease"
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
.method public abstract writeBarcodeDecode(Z)V
.end method

.method public abstract writeBarcodeEffort(Ljava/lang/String;)V
.end method

.method public abstract writeBarcodeMax(I)V
.end method

.method public abstract writeBarcodeNonpayment(Z)V
.end method

.method public abstract writeBarcodeRoi(Ljava/lang/String;)V
.end method

.method public abstract writeBarcodeSmart(Z)V
.end method

.method public abstract writeBarcodeTypes(Ljava/util/Set;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract writeCardTypes(Ljava/util/Set;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract writeContainerMax(I)V
.end method

.method public abstract writeLineMax(I)V
.end method

.method public abstract writeLineTypes(Ljava/util/Set;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract writeMeterMax(I)V
.end method

.method public abstract writePaymentTypes(Ljava/util/Set;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract writePlateTypes(Ljava/util/Set;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract writeShowOptionalData(Z)V
.end method
