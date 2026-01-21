.class public final Lcom/smartengines/nfc/ReadingEngineMock;
.super Ljava/lang/Object;
.source "ReadingEngineMock.kt"

# interfaces
.implements Lcom/smartengines/nfc/ReadingEngine;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0008\u0010\u000c\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0008\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0008\u0010\u0014\u001a\u00020\u0012H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/smartengines/nfc/ReadingEngineMock;",
        "Lcom/smartengines/nfc/ReadingEngine;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "getContext",
        "()Landroid/content/Context;",
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
        "generateAuthResult",
        "nfc-mock_release"
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
.field private final context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/smartengines/nfc/ReadingEngineMock;->context:Landroid/content/Context;

    return-void
.end method

.method private final generateAuthResult()Lcom/smartengines/nfc/AuthResult;
    .locals 4

    .line 48
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    sget-object v0, Lcom/smartengines/nfc/AuthResult$Passed;->INSTANCE:Lcom/smartengines/nfc/AuthResult$Passed;

    check-cast v0, Lcom/smartengines/nfc/AuthResult;

    return-object v0

    .line 49
    :cond_0
    new-instance v0, Lcom/smartengines/nfc/AuthResult$Failed;

    const-string v1, "Failed for debug"

    invoke-direct {v0, v1}, Lcom/smartengines/nfc/AuthResult$Failed;-><init>(Ljava/lang/String;)V

    check-cast v0, Lcom/smartengines/nfc/AuthResult;

    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 2

    .line 18
    const-string v0, "myapp.RdEngineMock"

    const-string v1, "close"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public doChipAuth()Lcom/smartengines/nfc/AuthResult;
    .locals 3

    .line 36
    invoke-direct {p0}, Lcom/smartengines/nfc/ReadingEngineMock;->generateAuthResult()Lcom/smartengines/nfc/AuthResult;

    move-result-object v0

    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "doChipAuth  "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "myapp.RdEngineMock"

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-object v0
.end method

.method public doDataAuth(Landroid/content/Context;)Lcom/smartengines/nfc/AuthResult;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-direct {p0}, Lcom/smartengines/nfc/ReadingEngineMock;->generateAuthResult()Lcom/smartengines/nfc/AuthResult;

    move-result-object p1

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "doDataAuth  "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "myapp.RdEngineMock"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-object p1
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/smartengines/nfc/ReadingEngineMock;->context:Landroid/content/Context;

    return-object v0
.end method

.method public open(Landroid/nfc/tech/IsoDep;)V
    .locals 2

    const-string v0, "isoDep"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "open,  isoDep: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "myapp.RdEngineMock"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public readPassportData(Lorg/jmrtd/BACKey;)Lcom/smartengines/nfc/PassportData;
    .locals 10

    const-string v0, "bacKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    new-instance p1, Lorg/jmrtd/lds/icao/DG1File;

    iget-object v0, p0, Lcom/smartengines/nfc/ReadingEngineMock;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "dg1-igor.mock"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/jmrtd/lds/icao/DG1File;-><init>(Ljava/io/InputStream;)V

    .line 24
    new-instance v0, Lorg/jmrtd/lds/icao/DG2File;

    iget-object v1, p0, Lcom/smartengines/nfc/ReadingEngineMock;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "dg2-igor.mock"

    invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/jmrtd/lds/icao/DG2File;-><init>(Ljava/io/InputStream;)V

    .line 27
    new-instance v2, Lcom/smartengines/nfc/PassportData;

    .line 28
    new-instance v3, Lcom/smartengines/nfc/MrzInfo;

    invoke-virtual {p1}, Lorg/jmrtd/lds/icao/DG1File;->getMRZInfo()Lorg/jmrtd/lds/icao/MRZInfo;

    move-result-object p1

    const-string v1, "getMRZInfo(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, p1}, Lcom/smartengines/nfc/MrzInfo;-><init>(Lorg/jmrtd/lds/icao/MRZInfo;)V

    .line 29
    invoke-virtual {v0}, Lorg/jmrtd/lds/icao/DG2File;->getFaceInfos()Ljava/util/List;

    move-result-object p1

    const-string v0, "getFaceInfos(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/smartengines/nfc/FaceImageDataKt;->toFaceImageDataList(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 27
    invoke-direct/range {v2 .. v9}, Lcom/smartengines/nfc/PassportData;-><init>(Lcom/smartengines/nfc/MrzInfo;Ljava/util/List;Ljava/util/Map;Lcom/smartengines/nfc/AuthResult;Lcom/smartengines/nfc/AuthResult;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method
