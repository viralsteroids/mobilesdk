.class public Lorg/jmrtd/protocol/ReadBinaryAPDUSender;
.super Ljava/lang/Object;
.source "ReadBinaryAPDUSender.java"

# interfaces
.implements Lorg/jmrtd/APDULevelReadBinaryCapable;


# static fields
.field private static final LOGGER:Ljava/util/logging/Logger;


# instance fields
.field private secureMessagingSender:Lorg/jmrtd/protocol/SecureMessagingAPDUSender;

.field private service:Lnet/sf/scuba/smartcards/CardService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 28
    const-string v0, "org.jmrtd.protocol"

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lorg/jmrtd/protocol/ReadBinaryAPDUSender;->LOGGER:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lnet/sf/scuba/smartcards/CardService;)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lorg/jmrtd/protocol/ReadBinaryAPDUSender;->service:Lnet/sf/scuba/smartcards/CardService;

    .line 41
    new-instance v0, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;

    invoke-direct {v0, p1}, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;-><init>(Lnet/sf/scuba/smartcards/CardService;)V

    iput-object v0, p0, Lorg/jmrtd/protocol/ReadBinaryAPDUSender;->secureMessagingSender:Lorg/jmrtd/protocol/SecureMessagingAPDUSender;

    return-void
.end method

.method private static checkStatusWordAfterFileOperation(Lnet/sf/scuba/smartcards/CommandAPDU;Lnet/sf/scuba/smartcards/ResponseAPDU;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    .line 212
    invoke-virtual {p1}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getSW()I

    move-result v0

    int-to-short v0, v0

    .line 213
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "CAPDU = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lnet/sf/scuba/smartcards/CommandAPDU;->getBytes()[B

    move-result-object p0

    invoke-static {p0}, Lnet/sf/scuba/util/Hex;->bytesToHexString([B)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v1, ", RAPDU = "

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p1}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getBytes()[B

    move-result-object p1

    invoke-static {p1}, Lnet/sf/scuba/util/Hex;->bytesToHexString([B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/16 p1, -0x7000

    if-eq v0, p1, :cond_2

    const/16 p1, 0x6982

    if-eq v0, p1, :cond_1

    const/16 p1, 0x6a82

    if-eq v0, p1, :cond_0

    const/16 p1, 0x6985

    if-eq v0, p1, :cond_1

    const/16 p1, 0x6986

    if-eq v0, p1, :cond_1

    .line 226
    new-instance p1, Lnet/sf/scuba/smartcards/CardServiceException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error occured, "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0, v0}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;I)V

    throw p1

    .line 218
    :cond_0
    new-instance p1, Lnet/sf/scuba/smartcards/CardServiceException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "File not found, "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0, v0}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;I)V

    throw p1

    .line 224
    :cond_1
    new-instance p1, Lnet/sf/scuba/smartcards/CardServiceException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Access to file denied, "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0, v0}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;I)V

    throw p1

    :cond_2
    return-void
.end method

.method private static getResponseData(Lnet/sf/scuba/smartcards/ResponseAPDU;Z)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 177
    :cond_0
    invoke-virtual {p0}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getData()[B

    move-result-object p0

    .line 178
    const-string v0, "Malformed read binary long response data"

    if-eqz p0, :cond_4

    if-nez p1, :cond_1

    return-object p0

    :cond_1
    const/4 p1, 0x0

    .line 191
    aget-byte v1, p0, p1

    const/16 v2, 0x53

    if-ne v1, v2, :cond_3

    const/4 v0, 0x1

    .line 194
    aget-byte v1, p0, v0

    and-int/lit16 v2, v1, 0x80

    int-to-byte v2, v2

    const/16 v3, -0x80

    if-ne v2, v3, :cond_2

    and-int/lit8 v1, v1, 0xf

    add-int/2addr v1, v0

    goto :goto_0

    :cond_2
    move v1, v0

    :goto_0
    add-int/2addr v1, v0

    .line 198
    array-length v0, p0

    sub-int/2addr v0, v1

    new-array v2, v0, [B

    .line 199
    invoke-static {p0, v1, v2, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2

    .line 192
    :cond_3
    new-instance p0, Lnet/sf/scuba/smartcards/CardServiceException;

    invoke-direct {p0, v0}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 179
    :cond_4
    new-instance p0, Lnet/sf/scuba/smartcards/CardServiceException;

    invoke-direct {p0, v0}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public declared-synchronized sendReadBinary(Lnet/sf/scuba/smartcards/APDUWrapper;IIIZZ)[B
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v0, p3

    move/from16 v7, p4

    move/from16 v8, p6

    const-string v9, "Empty response data: response APDU bytes = "

    monitor-enter p0

    const/4 v10, 0x0

    if-nez v7, :cond_0

    .line 106
    monitor-exit p0

    return-object v10

    :cond_0
    const v2, 0xff00

    and-int/2addr v2, v0

    shr-int/lit8 v2, v2, 0x8

    int-to-byte v5, v2

    and-int/lit16 v0, v0, 0xff

    int-to-byte v6, v0

    if-eqz v8, :cond_4

    const/16 v0, 0x80

    const/16 v2, 0x100

    if-ge v7, v0, :cond_1

    add-int/lit8 v0, v7, 0x2

    goto :goto_0

    :cond_1
    if-ge v7, v2, :cond_2

    add-int/lit8 v0, v7, 0x3

    goto :goto_0

    :cond_2
    move v0, v7

    :goto_0
    if-le v0, v2, :cond_3

    move/from16 v17, v2

    goto :goto_1

    :cond_3
    move/from16 v17, v0

    :goto_1
    const/4 v0, 0x4

    .line 124
    :try_start_0
    new-array v0, v0, [B

    const/4 v2, 0x0

    const/16 v3, 0x54

    aput-byte v3, v0, v2

    const/4 v2, 0x1

    const/4 v3, 0x2

    aput-byte v3, v0, v2

    aput-byte v5, v0, v3

    const/4 v2, 0x3

    aput-byte v6, v0, v2

    .line 125
    new-instance v11, Lnet/sf/scuba/smartcards/CommandAPDU;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/16 v13, -0x4f

    move-object/from16 v16, v0

    invoke-direct/range {v11 .. v17}, Lnet/sf/scuba/smartcards/CommandAPDU;-><init>(IIII[BI)V

    move/from16 v2, v17

    goto :goto_3

    :cond_4
    if-eqz p5, :cond_5

    .line 127
    new-instance v2, Lnet/sf/scuba/smartcards/CommandAPDU;

    const/16 v4, -0x50

    move/from16 v0, p2

    int-to-byte v5, v0

    const/4 v3, 0x0

    invoke-direct/range {v2 .. v7}, Lnet/sf/scuba/smartcards/CommandAPDU;-><init>(IIIII)V

    goto :goto_2

    .line 129
    :cond_5
    new-instance v2, Lnet/sf/scuba/smartcards/CommandAPDU;

    const/4 v3, 0x0

    const/16 v4, -0x50

    move/from16 v7, p4

    invoke-direct/range {v2 .. v7}, Lnet/sf/scuba/smartcards/CommandAPDU;-><init>(IIIII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    move-object v11, v2

    move/from16 v2, p4

    .line 134
    :goto_3
    :try_start_1
    iget-object v0, v1, Lorg/jmrtd/protocol/ReadBinaryAPDUSender;->secureMessagingSender:Lorg/jmrtd/protocol/SecureMessagingAPDUSender;

    move-object/from16 v3, p1

    invoke-virtual {v0, v3, v11}, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->transmit(Lnet/sf/scuba/smartcards/APDUWrapper;Lnet/sf/scuba/smartcards/CommandAPDU;)Lnet/sf/scuba/smartcards/ResponseAPDU;

    move-result-object v10

    .line 135
    invoke-virtual {v10}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getSW()I

    move-result v0
    :try_end_1
    .catch Lnet/sf/scuba/smartcards/CardServiceException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_4
    int-to-short v0, v0

    goto :goto_5

    :catch_0
    move-exception v0

    .line 137
    :try_start_2
    iget-object v3, v1, Lorg/jmrtd/protocol/ReadBinaryAPDUSender;->service:Lnet/sf/scuba/smartcards/CardService;

    invoke-virtual {v3, v0}, Lnet/sf/scuba/smartcards/CardService;->isConnectionLost(Ljava/lang/Exception;)Z

    move-result v3

    if-nez v3, :cond_8

    .line 146
    sget-object v3, Lorg/jmrtd/protocol/ReadBinaryAPDUSender;->LOGGER:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v5, "Exception during READ BINARY"

    invoke-virtual {v3, v4, v5, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 147
    invoke-virtual {v0}, Lnet/sf/scuba/smartcards/CardServiceException;->getSW()I

    move-result v0

    goto :goto_4

    .line 150
    :goto_5
    invoke-static {v10, v8}, Lorg/jmrtd/protocol/ReadBinaryAPDUSender;->getResponseData(Lnet/sf/scuba/smartcards/ResponseAPDU;Z)[B

    move-result-object v3

    if-eqz v3, :cond_7

    .line 151
    array-length v4, v3

    if-nez v4, :cond_6

    goto :goto_6

    .line 154
    :cond_6
    invoke-static {v11, v10}, Lorg/jmrtd/protocol/ReadBinaryAPDUSender;->checkStatusWordAfterFileOperation(Lnet/sf/scuba/smartcards/CommandAPDU;Lnet/sf/scuba/smartcards/ResponseAPDU;)V

    goto :goto_7

    .line 152
    :cond_7
    :goto_6
    sget-object v4, Lorg/jmrtd/protocol/ReadBinaryAPDUSender;->LOGGER:Ljava/util/logging/Logger;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ", le = "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, ", sw = "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 157
    :goto_7
    monitor-exit p0

    return-object v3

    .line 143
    :cond_8
    :try_start_3
    throw v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public declared-synchronized sendSelectApplet(Lnet/sf/scuba/smartcards/APDUWrapper;[B)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    monitor-enter p0

    if-eqz p2, :cond_0

    .line 56
    :try_start_0
    new-instance v0, Lnet/sf/scuba/smartcards/CommandAPDU;

    const/4 v3, 0x4

    const/16 v4, 0xc

    const/4 v1, 0x0

    const/16 v2, -0x5c

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lnet/sf/scuba/smartcards/CommandAPDU;-><init>(IIII[B)V

    .line 57
    iget-object p2, p0, Lorg/jmrtd/protocol/ReadBinaryAPDUSender;->secureMessagingSender:Lorg/jmrtd/protocol/SecureMessagingAPDUSender;

    invoke-virtual {p2, p1, v0}, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->transmit(Lnet/sf/scuba/smartcards/APDUWrapper;Lnet/sf/scuba/smartcards/CommandAPDU;)Lnet/sf/scuba/smartcards/ResponseAPDU;

    move-result-object p1

    .line 58
    invoke-static {v0, p1}, Lorg/jmrtd/protocol/ReadBinaryAPDUSender;->checkStatusWordAfterFileOperation(Lnet/sf/scuba/smartcards/CommandAPDU;Lnet/sf/scuba/smartcards/ResponseAPDU;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    .line 54
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "AID cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized sendSelectFile(Lnet/sf/scuba/smartcards/APDUWrapper;S)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    monitor-enter p0

    shr-int/lit8 v0, p2, 0x8

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    and-int/lit16 p2, p2, 0xff

    int-to-byte p2, p2

    const/4 v1, 0x2

    .line 71
    :try_start_0
    new-array v7, v1, [B

    const/4 v1, 0x0

    aput-byte v0, v7, v1

    const/4 v0, 0x1

    aput-byte p2, v7, v0

    .line 72
    new-instance v2, Lnet/sf/scuba/smartcards/CommandAPDU;

    const/16 v6, 0xc

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/16 v4, -0x5c

    const/4 v5, 0x2

    invoke-direct/range {v2 .. v8}, Lnet/sf/scuba/smartcards/CommandAPDU;-><init>(IIII[BI)V

    .line 73
    iget-object p2, p0, Lorg/jmrtd/protocol/ReadBinaryAPDUSender;->secureMessagingSender:Lorg/jmrtd/protocol/SecureMessagingAPDUSender;

    invoke-virtual {p2, p1, v2}, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->transmit(Lnet/sf/scuba/smartcards/APDUWrapper;Lnet/sf/scuba/smartcards/CommandAPDU;)Lnet/sf/scuba/smartcards/ResponseAPDU;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 76
    monitor-exit p0

    return-void

    .line 79
    :cond_0
    :try_start_1
    invoke-static {v2, p1}, Lorg/jmrtd/protocol/ReadBinaryAPDUSender;->checkStatusWordAfterFileOperation(Lnet/sf/scuba/smartcards/CommandAPDU;Lnet/sf/scuba/smartcards/ResponseAPDU;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    monitor-exit p0

    return-void

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_0
.end method
