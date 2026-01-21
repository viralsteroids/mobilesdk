.class public Lorg/jmrtd/protocol/AAAPDUSender;
.super Ljava/lang/Object;
.source "AAAPDUSender.java"

# interfaces
.implements Lorg/jmrtd/APDULevelAACapable;


# static fields
.field private static final LOGGER:Ljava/util/logging/Logger;


# instance fields
.field private secureMessagingSender:Lorg/jmrtd/protocol/SecureMessagingAPDUSender;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 49
    const-string v0, "org.jmrtd.protocol"

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lorg/jmrtd/protocol/AAAPDUSender;->LOGGER:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lnet/sf/scuba/smartcards/CardService;)V
    .locals 1

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    new-instance v0, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;

    invoke-direct {v0, p1}, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;-><init>(Lnet/sf/scuba/smartcards/CardService;)V

    iput-object v0, p0, Lorg/jmrtd/protocol/AAAPDUSender;->secureMessagingSender:Lorg/jmrtd/protocol/SecureMessagingAPDUSender;

    return-void
.end method


# virtual methods
.method public declared-synchronized sendInternalAuthenticate(Lnet/sf/scuba/smartcards/APDUWrapper;[B)[B
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    const-string v9, "Internal Authenticate may not have succeeded, got status word "

    const-string v10, "Exception during transmission of command APDU = "

    monitor-enter p0

    if-eqz p2, :cond_a

    .line 74
    :try_start_0
    array-length v0, p2

    const/16 v2, 0x8

    if-ne v0, v2, :cond_a

    .line 78
    new-instance v2, Lnet/sf/scuba/smartcards/CommandAPDU;

    const/4 v6, 0x0

    const/16 v8, 0x100

    const/4 v3, 0x0

    const/16 v4, -0x78

    const/4 v5, 0x0

    move-object v7, p2

    invoke-direct/range {v2 .. v8}, Lnet/sf/scuba/smartcards/CommandAPDU;-><init>(IIII[BI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v11, 0x0

    .line 83
    :try_start_1
    iget-object v0, p0, Lorg/jmrtd/protocol/AAAPDUSender;->secureMessagingSender:Lorg/jmrtd/protocol/SecureMessagingAPDUSender;

    invoke-virtual {v0, p1, v2}, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->transmit(Lnet/sf/scuba/smartcards/APDUWrapper;Lnet/sf/scuba/smartcards/CommandAPDU;)Lnet/sf/scuba/smartcards/ResponseAPDU;

    move-result-object v3
    :try_end_1
    .catch Lnet/sf/scuba/smartcards/CardServiceException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    :try_start_2
    invoke-virtual {v3}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getSW()I

    move-result v0
    :try_end_2
    .catch Lnet/sf/scuba/smartcards/CardServiceException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    int-to-short v0, v0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v3, v11

    .line 86
    :goto_1
    :try_start_3
    sget-object v4, Lorg/jmrtd/protocol/AAAPDUSender;->LOGGER:Ljava/util/logging/Logger;

    sget-object v5, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lnet/sf/scuba/smartcards/CommandAPDU;->getBytes()[B

    move-result-object v2

    invoke-static {v2}, Lnet/sf/scuba/util/Hex;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v5, v2, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    invoke-virtual {v0}, Lnet/sf/scuba/smartcards/CardServiceException;->getSW()I

    move-result v0

    goto :goto_0

    :goto_2
    const/16 v2, -0x7000

    if-ne v0, v2, :cond_0

    if-eqz v3, :cond_0

    .line 91
    invoke-virtual {v3}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getData()[B

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_0
    const v2, 0xff00

    and-int/2addr v2, v0

    const/16 v4, 0x6100

    if-ne v2, v4, :cond_8

    if-nez v3, :cond_1

    move-object v9, v11

    goto :goto_3

    .line 93
    :cond_1
    :try_start_4
    invoke-virtual {v3}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getData()[B

    move-result-object v2

    move-object v9, v2

    .line 96
    :goto_3
    new-instance v2, Lnet/sf/scuba/smartcards/CommandAPDU;

    const/4 v6, 0x0

    const/high16 v8, 0x10000

    const/4 v3, 0x0

    const/16 v4, -0x78

    const/4 v5, 0x0

    move-object v7, p2

    invoke-direct/range {v2 .. v8}, Lnet/sf/scuba/smartcards/CommandAPDU;-><init>(IIII[BI)V

    .line 97
    iget-object v3, p0, Lorg/jmrtd/protocol/AAAPDUSender;->secureMessagingSender:Lorg/jmrtd/protocol/SecureMessagingAPDUSender;

    invoke-virtual {v3, p1, v2}, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->transmit(Lnet/sf/scuba/smartcards/APDUWrapper;Lnet/sf/scuba/smartcards/CommandAPDU;)Lnet/sf/scuba/smartcards/ResponseAPDU;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_4

    .line 98
    :cond_2
    invoke-virtual {v1}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getData()[B

    move-result-object v11

    :goto_4
    if-nez v9, :cond_4

    if-eqz v11, :cond_3

    goto :goto_5

    .line 101
    :cond_3
    new-instance v1, Lnet/sf/scuba/smartcards/CardServiceException;

    const-string v2, "Internal Authenticate failed"

    invoke-direct {v1, v2, v0}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;I)V

    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_4
    :goto_5
    if-eqz v9, :cond_5

    if-nez v11, :cond_5

    .line 104
    monitor-exit p0

    return-object v9

    :cond_5
    if-nez v9, :cond_6

    if-eqz v11, :cond_6

    .line 107
    monitor-exit p0

    return-object v11

    .line 111
    :cond_6
    :try_start_5
    array-length v0, v9

    array-length v1, v11
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-le v0, v1, :cond_7

    .line 112
    monitor-exit p0

    return-object v9

    .line 114
    :cond_7
    monitor-exit p0

    return-object v11

    :cond_8
    if-eqz v3, :cond_9

    .line 116
    :try_start_6
    invoke-virtual {v3}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getData()[B

    move-result-object v1

    if-eqz v1, :cond_9

    .line 118
    sget-object v1, Lorg/jmrtd/protocol/AAAPDUSender;->LOGGER:Ljava/util/logging/Logger;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const v4, 0xffff

    and-int/2addr v0, v4

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 119
    invoke-virtual {v3}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getData()[B

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    monitor-exit p0

    return-object v0

    .line 122
    :cond_9
    :try_start_7
    new-instance v1, Lnet/sf/scuba/smartcards/CardServiceException;

    const-string v2, "Internal Authenticate failed"

    invoke-direct {v1, v2, v0}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;I)V

    throw v1

    .line 75
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "rndIFD wrong length"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    throw v0
.end method
