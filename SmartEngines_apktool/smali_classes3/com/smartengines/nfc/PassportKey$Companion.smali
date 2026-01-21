.class public final Lcom/smartengines/nfc/PassportKey$Companion;
.super Ljava/lang/Object;
.source "PassportKey.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/smartengines/nfc/PassportKey;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/smartengines/nfc/PassportKey$Companion;",
        "",
        "<init>",
        "()V",
        "fromMRZ",
        "Lcom/smartengines/nfc/PassportKey;",
        "mrz",
        "",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/smartengines/nfc/PassportKey$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromMRZ(Ljava/lang/String;)Lcom/smartengines/nfc/PassportKey;
    .locals 4

    const-string v0, "mrz"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    :try_start_0
    new-instance v0, Lorg/jmrtd/lds/icao/MRZInfo;

    invoke-direct {v0, p1}, Lorg/jmrtd/lds/icao/MRZInfo;-><init>(Ljava/lang/String;)V

    .line 22
    new-instance p1, Lcom/smartengines/nfc/PassportKey;

    .line 23
    invoke-virtual {v0}, Lorg/jmrtd/lds/icao/MRZInfo;->getDocumentNumber()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getDocumentNumber(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-virtual {v0}, Lorg/jmrtd/lds/icao/MRZInfo;->getDateOfExpiry()Ljava/lang/String;

    move-result-object v2

    const-string v3, "getDateOfExpiry(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-virtual {v0}, Lorg/jmrtd/lds/icao/MRZInfo;->getDateOfBirth()Ljava/lang/String;

    move-result-object v0

    const-string v3, "getDateOfBirth(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p1, v1, v2, v0}, Lcom/smartengines/nfc/PassportKey;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 28
    new-instance v0, Ljava/lang/Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can\'t parse MRZ string: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
.end method
