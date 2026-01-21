.class public interface abstract Lcom/smartengines/nfc/ReadingEngine;
.super Ljava/lang/Object;
.source "ReadingEngine.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0008\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\nH&J\u0008\u0010\u000b\u001a\u00020\u000cH&J\u0010\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000fH&\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/smartengines/nfc/ReadingEngine;",
        "",
        "open",
        "",
        "isoDep",
        "Landroid/nfc/tech/IsoDep;",
        "close",
        "readPassportData",
        "Lcom/smartengines/nfc/PassportData;",
        "bacKey",
        "Lorg/jmrtd/BACKey;",
        "doChipAuth",
        "Lcom/smartengines/nfc/AuthResult;",
        "doDataAuth",
        "context",
        "Landroid/content/Context;",
        "nfc_release"
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
.method public abstract close()V
.end method

.method public abstract doChipAuth()Lcom/smartengines/nfc/AuthResult;
.end method

.method public abstract doDataAuth(Landroid/content/Context;)Lcom/smartengines/nfc/AuthResult;
.end method

.method public abstract open(Landroid/nfc/tech/IsoDep;)V
.end method

.method public abstract readPassportData(Lorg/jmrtd/BACKey;)Lcom/smartengines/nfc/PassportData;
.end method
