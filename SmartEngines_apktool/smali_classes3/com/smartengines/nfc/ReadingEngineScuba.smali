.class public final Lcom/smartengines/nfc/ReadingEngineScuba;
.super Ljava/lang/Object;
.source "ReadingEngineScuba.kt"

# interfaces
.implements Lcom/smartengines/nfc/ReadingEngine;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0016J\u0008\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0008\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/smartengines/nfc/ReadingEngineScuba;",
        "Lcom/smartengines/nfc/ReadingEngine;",
        "<init>",
        "()V",
        "service",
        "Lorg/jmrtd/PassportService;",
        "dg1File",
        "Lorg/jmrtd/lds/icao/DG1File;",
        "dg2File",
        "Lorg/jmrtd/lds/icao/DG2File;",
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


# instance fields
.field private dg1File:Lorg/jmrtd/lds/icao/DG1File;

.field private dg2File:Lorg/jmrtd/lds/icao/DG2File;

.field private service:Lorg/jmrtd/PassportService;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 68
    :try_start_0
    iget-object v0, p0, Lcom/smartengines/nfc/ReadingEngineScuba;->service:Lorg/jmrtd/PassportService;

    if-nez v0, :cond_0

    const-string v0, "service"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lorg/jmrtd/PassportService;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public doChipAuth()Lcom/smartengines/nfc/AuthResult;
    .locals 2

    .line 233
    new-instance v0, Lkotlin/NotImplementedError;

    const-string v1, "An operation is not implemented: Not yet implemented"

    invoke-direct {v0, v1}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public doDataAuth(Landroid/content/Context;)Lcom/smartengines/nfc/AuthResult;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 237
    new-instance p1, Lkotlin/NotImplementedError;

    const-string v0, "An operation is not implemented: Not yet implemented"

    invoke-direct {p1, v0}, Lkotlin/NotImplementedError;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public open(Landroid/nfc/tech/IsoDep;)V
    .locals 7

    const-string v0, "isoDep"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "open "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "myapp.RdEngineScuba"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    const-string v0, "Creating a new passport service for accessing the passport."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/16 v0, 0x2710

    .line 53
    invoke-virtual {p1, v0}, Landroid/nfc/tech/IsoDep;->setTimeout(I)V

    .line 54
    invoke-static {p1}, Lnet/sf/scuba/smartcards/CardService;->getInstance(Ljava/lang/Object;)Lnet/sf/scuba/smartcards/CardService;

    move-result-object v2

    .line 55
    invoke-virtual {v2}, Lnet/sf/scuba/smartcards/CardService;->open()V

    .line 56
    new-instance v1, Lorg/jmrtd/PassportService;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v3, 0x100

    const/16 v4, 0xe0

    invoke-direct/range {v1 .. v6}, Lorg/jmrtd/PassportService;-><init>(Lnet/sf/scuba/smartcards/CardService;IIZZ)V

    iput-object v1, p0, Lcom/smartengines/nfc/ReadingEngineScuba;->service:Lorg/jmrtd/PassportService;

    .line 63
    invoke-virtual {v1}, Lorg/jmrtd/PassportService;->open()V

    return-void
.end method

.method public readPassportData(Lorg/jmrtd/BACKey;)Lcom/smartengines/nfc/PassportData;
    .locals 14

    const-string v1, "DG2"

    const-string v2, "encodeToString(...)"

    const-string v3, "service"

    const-string v0, "bacKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    const-string v0, "Performs the PACE 2.0 / SAC protocol. A secure messaging channel is set up as a result."

    const-string v4, "myapp.RdEngineScuba"

    invoke-static {v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 82
    :try_start_0
    new-instance v0, Lorg/jmrtd/lds/CardAccessFile;

    iget-object v7, p0, Lcom/smartengines/nfc/ReadingEngineScuba;->service:Lorg/jmrtd/PassportService;

    if-nez v7, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v7, v5

    :cond_0
    const/16 v8, 0x11c

    invoke-virtual {v7, v8}, Lorg/jmrtd/PassportService;->getInputStream(S)Lnet/sf/scuba/smartcards/CardFileInputStream;

    move-result-object v7

    check-cast v7, Ljava/io/InputStream;

    invoke-direct {v0, v7}, Lorg/jmrtd/lds/CardAccessFile;-><init>(Ljava/io/InputStream;)V

    .line 83
    invoke-virtual {v0}, Lorg/jmrtd/lds/CardAccessFile;->getSecurityInfos()Ljava/util/Collection;

    move-result-object v0

    .line 84
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    const-string v8, "next(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lorg/jmrtd/lds/SecurityInfo;

    .line 85
    instance-of v8, v7, Lorg/jmrtd/lds/PACEInfo;

    if-eqz v8, :cond_1

    .line 86
    iget-object v8, p0, Lcom/smartengines/nfc/ReadingEngineScuba;->service:Lorg/jmrtd/PassportService;

    if-nez v8, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v8, v5

    .line 87
    :cond_2
    move-object v9, p1

    check-cast v9, Lorg/jmrtd/AccessKeySpec;

    .line 88
    move-object v10, v7

    check-cast v10, Lorg/jmrtd/lds/PACEInfo;

    invoke-virtual {v10}, Lorg/jmrtd/lds/PACEInfo;->getObjectIdentifier()Ljava/lang/String;

    move-result-object v10

    .line 89
    check-cast v7, Lorg/jmrtd/lds/PACEInfo;

    invoke-virtual {v7}, Lorg/jmrtd/lds/PACEInfo;->getParameterId()Ljava/math/BigInteger;

    move-result-object v7

    invoke-static {v7}, Lorg/jmrtd/lds/PACEInfo;->toParameterSpec(Ljava/math/BigInteger;)Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v7

    .line 86
    invoke-virtual {v8, v9, v10, v7, v5}, Lorg/jmrtd/PassportService;->doPACE(Lorg/jmrtd/AccessKeySpec;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;Ljava/math/BigInteger;)Lorg/jmrtd/protocol/PACEResult;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v6, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    .line 96
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "doPACE: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 103
    :cond_3
    iget-object v0, p0, Lcom/smartengines/nfc/ReadingEngineScuba;->service:Lorg/jmrtd/PassportService;

    if-nez v0, :cond_4

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v5

    :cond_4
    invoke-virtual {v0, v6}, Lorg/jmrtd/PassportService;->sendSelectApplet(Z)V

    const/16 v0, 0x11e

    if-nez v6, :cond_7

    .line 106
    :try_start_1
    iget-object v6, p0, Lcom/smartengines/nfc/ReadingEngineScuba;->service:Lorg/jmrtd/PassportService;

    if-nez v6, :cond_5

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v6, v5

    :cond_5
    invoke-virtual {v6, v0}, Lorg/jmrtd/PassportService;->getInputStream(S)Lnet/sf/scuba/smartcards/CardFileInputStream;

    move-result-object v6

    invoke-virtual {v6}, Lnet/sf/scuba/smartcards/CardFileInputStream;->read()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 109
    :catch_1
    iget-object v6, p0, Lcom/smartengines/nfc/ReadingEngineScuba;->service:Lorg/jmrtd/PassportService;

    if-nez v6, :cond_6

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v6, v5

    :cond_6
    move-object v7, p1

    check-cast v7, Lorg/jmrtd/AccessKeySpec;

    invoke-virtual {v6, v7}, Lorg/jmrtd/PassportService;->doBAC(Lorg/jmrtd/AccessKeySpec;)Lorg/jmrtd/protocol/BACResult;

    .line 110
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "doBAC "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    :cond_7
    :goto_1
    iget-object p1, p0, Lcom/smartengines/nfc/ReadingEngineScuba;->service:Lorg/jmrtd/PassportService;

    if-nez p1, :cond_8

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v5

    :cond_8
    const/16 v6, 0x101

    invoke-virtual {p1, v6}, Lorg/jmrtd/PassportService;->getInputStream(S)Lnet/sf/scuba/smartcards/CardFileInputStream;

    move-result-object p1

    .line 116
    new-instance v7, Lorg/jmrtd/lds/icao/DG1File;

    check-cast p1, Ljava/io/InputStream;

    invoke-direct {v7, p1}, Lorg/jmrtd/lds/icao/DG1File;-><init>(Ljava/io/InputStream;)V

    iput-object v7, p0, Lcom/smartengines/nfc/ReadingEngineScuba;->dg1File:Lorg/jmrtd/lds/icao/DG1File;

    .line 117
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 119
    iget-object p1, p0, Lcom/smartengines/nfc/ReadingEngineScuba;->service:Lorg/jmrtd/PassportService;

    if-nez p1, :cond_9

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v5

    :cond_9
    const/16 v7, 0x102

    invoke-virtual {p1, v7}, Lorg/jmrtd/PassportService;->getInputStream(S)Lnet/sf/scuba/smartcards/CardFileInputStream;

    move-result-object p1

    .line 120
    new-instance v8, Lorg/jmrtd/lds/icao/DG2File;

    check-cast p1, Ljava/io/InputStream;

    invoke-direct {v8, p1}, Lorg/jmrtd/lds/icao/DG2File;-><init>(Ljava/io/InputStream;)V

    iput-object v8, p0, Lcom/smartengines/nfc/ReadingEngineScuba;->dg2File:Lorg/jmrtd/lds/icao/DG2File;

    .line 121
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 124
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    move-object v11, p1

    check-cast v11, Ljava/util/Map;

    const/4 p1, 0x2

    .line 142
    :try_start_2
    iget-object v8, p0, Lcom/smartengines/nfc/ReadingEngineScuba;->service:Lorg/jmrtd/PassportService;

    if-nez v8, :cond_a

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v8, v5

    :cond_a
    invoke-virtual {v8, v0}, Lorg/jmrtd/PassportService;->getInputStream(S)Lnet/sf/scuba/smartcards/CardFileInputStream;

    move-result-object v0

    .line 143
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Ljava/io/InputStream;

    invoke-static {v0}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v0

    .line 144
    const-string v8, "COM"

    invoke-static {v0, p1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v11, v8, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v0

    .line 147
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "COM reading error: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 152
    :goto_2
    :try_start_3
    iget-object v0, p0, Lcom/smartengines/nfc/ReadingEngineScuba;->service:Lorg/jmrtd/PassportService;

    if-nez v0, :cond_b

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v5

    :cond_b
    const/16 v8, 0x11d

    invoke-virtual {v0, v8}, Lorg/jmrtd/PassportService;->getInputStream(S)Lnet/sf/scuba/smartcards/CardFileInputStream;

    move-result-object v0

    .line 153
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Ljava/io/InputStream;

    invoke-static {v0}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v0

    .line 154
    const-string v8, "SOD"

    invoke-static {v0, p1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v11, v8, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catch_3
    move-exception v0

    .line 156
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "SOD reading error: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 160
    :goto_3
    :try_start_4
    iget-object v0, p0, Lcom/smartengines/nfc/ReadingEngineScuba;->service:Lorg/jmrtd/PassportService;

    if-nez v0, :cond_c

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v5

    :cond_c
    invoke-virtual {v0, v6}, Lorg/jmrtd/PassportService;->getInputStream(S)Lnet/sf/scuba/smartcards/CardFileInputStream;

    move-result-object v0

    .line 161
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Ljava/io/InputStream;

    invoke-static {v0}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v0

    .line 162
    const-string v6, "DG1"

    invoke-static {v0, p1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v11, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_4

    :catch_4
    move-exception v0

    .line 164
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "DG1 reading error: "

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 168
    :goto_4
    :try_start_5
    iget-object v0, p0, Lcom/smartengines/nfc/ReadingEngineScuba;->service:Lorg/jmrtd/PassportService;

    if-nez v0, :cond_d

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v5

    :cond_d
    invoke-virtual {v0, v7}, Lorg/jmrtd/PassportService;->getInputStream(S)Lnet/sf/scuba/smartcards/CardFileInputStream;

    move-result-object v0

    .line 169
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Ljava/io/InputStream;

    invoke-static {v0}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v0

    .line 170
    invoke-static {v0, p1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v11, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_5

    :catch_5
    move-exception v0

    .line 172
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "DG2 reading error: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 175
    :goto_5
    :try_start_6
    iget-object v0, p0, Lcom/smartengines/nfc/ReadingEngineScuba;->service:Lorg/jmrtd/PassportService;

    if-nez v0, :cond_e

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v5

    :cond_e
    const/16 v6, 0x107

    invoke-virtual {v0, v6}, Lorg/jmrtd/PassportService;->getInputStream(S)Lnet/sf/scuba/smartcards/CardFileInputStream;

    move-result-object v0

    .line 176
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Ljava/io/InputStream;

    invoke-static {v0}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v0

    .line 177
    const-string v6, "DG7"

    invoke-static {v0, p1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v11, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_6

    :catch_6
    move-exception v0

    .line 180
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "DG7 reading error: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 183
    :goto_6
    :try_start_7
    iget-object v0, p0, Lcom/smartengines/nfc/ReadingEngineScuba;->service:Lorg/jmrtd/PassportService;

    if-nez v0, :cond_f

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v5

    :cond_f
    const/16 v6, 0x10b

    invoke-virtual {v0, v6}, Lorg/jmrtd/PassportService;->getInputStream(S)Lnet/sf/scuba/smartcards/CardFileInputStream;

    move-result-object v0

    .line 184
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Ljava/io/InputStream;

    invoke-static {v0}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v0

    .line 185
    const-string v6, "DG11"

    invoke-static {v0, p1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v11, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    goto :goto_7

    :catch_7
    move-exception v0

    .line 188
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "DG11 reading error: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 191
    :goto_7
    :try_start_8
    iget-object v0, p0, Lcom/smartengines/nfc/ReadingEngineScuba;->service:Lorg/jmrtd/PassportService;

    if-nez v0, :cond_10

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v5

    :cond_10
    const/16 v6, 0x10c

    invoke-virtual {v0, v6}, Lorg/jmrtd/PassportService;->getInputStream(S)Lnet/sf/scuba/smartcards/CardFileInputStream;

    move-result-object v0

    .line 192
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Ljava/io/InputStream;

    invoke-static {v0}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v0

    .line 193
    const-string v6, "DG12"

    invoke-static {v0, p1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v11, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    goto :goto_8

    :catch_8
    move-exception v0

    .line 196
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "DG12 reading error: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 199
    :goto_8
    :try_start_9
    iget-object v0, p0, Lcom/smartengines/nfc/ReadingEngineScuba;->service:Lorg/jmrtd/PassportService;

    if-nez v0, :cond_11

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v5

    :cond_11
    const/16 v6, 0x10e

    invoke-virtual {v0, v6}, Lorg/jmrtd/PassportService;->getInputStream(S)Lnet/sf/scuba/smartcards/CardFileInputStream;

    move-result-object v0

    .line 200
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Ljava/io/InputStream;

    invoke-static {v0}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v0

    .line 201
    invoke-static {v0, p1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v11, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9

    goto :goto_9

    :catch_9
    move-exception v0

    .line 204
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v6, "DG14 reading error: "

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 207
    :goto_9
    :try_start_a
    iget-object v0, p0, Lcom/smartengines/nfc/ReadingEngineScuba;->service:Lorg/jmrtd/PassportService;

    if-nez v0, :cond_12

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v5

    :cond_12
    const/16 v1, 0x10f

    invoke-virtual {v0, v1}, Lorg/jmrtd/PassportService;->getInputStream(S)Lnet/sf/scuba/smartcards/CardFileInputStream;

    move-result-object v0

    .line 208
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Ljava/io/InputStream;

    invoke-static {v0}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v0

    .line 209
    const-string v1, "DG15"

    invoke-static {v0, p1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v11, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_a

    goto :goto_a

    :catch_a
    move-exception v0

    move-object p1, v0

    .line 212
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DG15 reading error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 215
    :goto_a
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "other fields: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 223
    new-instance v8, Lcom/smartengines/nfc/PassportData;

    .line 224
    new-instance v9, Lcom/smartengines/nfc/MrzInfo;

    iget-object p1, p0, Lcom/smartengines/nfc/ReadingEngineScuba;->dg1File:Lorg/jmrtd/lds/icao/DG1File;

    if-nez p1, :cond_13

    const-string p1, "dg1File"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, v5

    :cond_13
    invoke-virtual {p1}, Lorg/jmrtd/lds/icao/DG1File;->getMRZInfo()Lorg/jmrtd/lds/icao/MRZInfo;

    move-result-object p1

    const-string v0, "getMRZInfo(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v9, p1}, Lcom/smartengines/nfc/MrzInfo;-><init>(Lorg/jmrtd/lds/icao/MRZInfo;)V

    .line 225
    iget-object p1, p0, Lcom/smartengines/nfc/ReadingEngineScuba;->dg2File:Lorg/jmrtd/lds/icao/DG2File;

    if-nez p1, :cond_14

    const-string p1, "dg2File"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_b

    :cond_14
    move-object v5, p1

    :goto_b
    invoke-virtual {v5}, Lorg/jmrtd/lds/icao/DG2File;->getFaceInfos()Ljava/util/List;

    move-result-object p1

    const-string v0, "getFaceInfos(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/smartengines/nfc/FaceImageDataKt;->toFaceImageDataList(Ljava/util/List;)Ljava/util/List;

    move-result-object v10

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 223
    invoke-direct/range {v8 .. v13}, Lcom/smartengines/nfc/PassportData;-><init>(Lcom/smartengines/nfc/MrzInfo;Ljava/util/List;Ljava/util/Map;Lcom/smartengines/nfc/AuthResult;Lcom/smartengines/nfc/AuthResult;)V

    return-object v8
.end method
