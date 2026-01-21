.class public Lorg/jmrtd/protocol/SecureMessagingAPDUSender;
.super Ljava/lang/Object;
.source "SecureMessagingAPDUSender.java"


# static fields
.field private static final LOGGER:Ljava/util/logging/Logger;


# instance fields
.field private apduCount:I

.field private service:Lnet/sf/scuba/smartcards/CardService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 57
    const-string v0, "org.jmrtd.protocol"

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->LOGGER:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lnet/sf/scuba/smartcards/CardService;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p1, p0, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->service:Lnet/sf/scuba/smartcards/CardService;

    const/4 p1, 0x0

    .line 70
    iput p1, p0, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->apduCount:I

    return-void
.end method

.method private continueSendingUsingResponseChaining(Lnet/sf/scuba/smartcards/APDUWrapper;S[B)[B
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    .line 202
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :goto_0
    const v0, 0xff00

    and-int/2addr v0, p2

    const/16 v2, 0x6100

    .line 204
    const-string v3, "Error closing stream"

    if-ne v0, v2, :cond_1

    .line 206
    :try_start_0
    invoke-virtual {v1, p3}, Ljava/io/ByteArrayOutputStream;->write([B)V

    and-int/lit16 v9, p2, 0xff

    if-gtz v9, :cond_0

    goto :goto_1

    .line 212
    :cond_0
    new-instance v4, Lnet/sf/scuba/smartcards/CommandAPDU;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/16 v6, -0x40

    invoke-direct/range {v4 .. v9}, Lnet/sf/scuba/smartcards/CommandAPDU;-><init>(IIIII)V

    .line 213
    invoke-virtual {p0, p1, v4}, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->transmit(Lnet/sf/scuba/smartcards/APDUWrapper;Lnet/sf/scuba/smartcards/CommandAPDU;)Lnet/sf/scuba/smartcards/ResponseAPDU;

    move-result-object p3

    .line 214
    invoke-virtual {p3}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getData()[B

    move-result-object v0

    .line 215
    invoke-virtual {p3}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getSW()I

    move-result p2

    int-to-short p2, p2

    move-object p3, v0

    goto :goto_0

    .line 218
    :cond_1
    :goto_1
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 224
    :try_start_1
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    move-object p2, v0

    .line 226
    sget-object p3, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->LOGGER:Ljava/util/logging/Logger;

    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {p3, v0, v3, p2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :catch_1
    move-exception v0

    move-object p1, v0

    .line 221
    :try_start_2
    new-instance p3, Lnet/sf/scuba/smartcards/CardServiceException;

    const-string v0, "Could not write to stream"

    invoke-direct {p3, v0, p1, p2}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;I)V

    throw p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 224
    :goto_2
    :try_start_3
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_3

    :catch_2
    move-exception v0

    move-object p2, v0

    .line 226
    sget-object p3, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->LOGGER:Ljava/util/logging/Logger;

    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {p3, v0, v3, p2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 228
    :goto_3
    throw p1
.end method

.method private sendUsingCommandChaining(Lnet/sf/scuba/smartcards/CommandAPDU;I)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/sf/scuba/smartcards/CommandAPDU;",
            "I)",
            "Ljava/util/List<",
            "Lnet/sf/scuba/smartcards/ResponseAPDU;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    .line 171
    invoke-virtual {p1}, Lnet/sf/scuba/smartcards/CommandAPDU;->getData()[B

    move-result-object v0

    .line 172
    invoke-static {p2, v0}, Lorg/jmrtd/Util;->partition(I[B)Ljava/util/List;

    move-result-object p2

    .line 173
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 175
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v10, v4

    check-cast v10, [B

    const/4 v4, 0x1

    add-int/2addr v3, v4

    .line 176
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v5

    if-lt v3, v5, :cond_0

    goto :goto_1

    :cond_0
    move v4, v2

    .line 177
    :goto_1
    invoke-virtual {p1}, Lnet/sf/scuba/smartcards/CommandAPDU;->getCLA()I

    move-result v5

    if-nez v4, :cond_1

    or-int/lit8 v5, v5, 0x10

    :cond_1
    move v6, v5

    .line 181
    new-instance v5, Lnet/sf/scuba/smartcards/CommandAPDU;

    invoke-virtual {p1}, Lnet/sf/scuba/smartcards/CommandAPDU;->getINS()I

    move-result v7

    invoke-virtual {p1}, Lnet/sf/scuba/smartcards/CommandAPDU;->getP1()I

    move-result v8

    invoke-virtual {p1}, Lnet/sf/scuba/smartcards/CommandAPDU;->getP2()I

    move-result v9

    invoke-virtual {p1}, Lnet/sf/scuba/smartcards/CommandAPDU;->getNe()I

    move-result v11

    invoke-direct/range {v5 .. v11}, Lnet/sf/scuba/smartcards/CommandAPDU;-><init>(IIII[BI)V

    .line 182
    iget-object v4, p0, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->service:Lnet/sf/scuba/smartcards/CardService;

    invoke-virtual {v4, v5}, Lnet/sf/scuba/smartcards/CardService;->transmit(Lnet/sf/scuba/smartcards/CommandAPDU;)Lnet/sf/scuba/smartcards/ResponseAPDU;

    move-result-object v4

    .line 183
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method


# virtual methods
.method public addAPDUListener(Lnet/sf/scuba/smartcards/APDUListener;)V
    .locals 1

    .line 129
    iget-object v0, p0, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->service:Lnet/sf/scuba/smartcards/CardService;

    invoke-virtual {v0, p1}, Lnet/sf/scuba/smartcards/CardService;->addAPDUListener(Lnet/sf/scuba/smartcards/APDUListener;)V

    return-void
.end method

.method public isExtendedAPDULengthSupported()Z
    .locals 1

    .line 120
    iget-object v0, p0, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->service:Lnet/sf/scuba/smartcards/CardService;

    invoke-virtual {v0}, Lnet/sf/scuba/smartcards/CardService;->isExtendedAPDULengthSupported()Z

    move-result v0

    return v0
.end method

.method protected notifyExchangedAPDU(Lnet/sf/scuba/smartcards/APDUEvent;)V
    .locals 2

    .line 148
    iget-object v0, p0, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->service:Lnet/sf/scuba/smartcards/CardService;

    invoke-virtual {v0}, Lnet/sf/scuba/smartcards/CardService;->getAPDUListeners()Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 149
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 153
    :cond_0
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/sf/scuba/smartcards/APDUListener;

    .line 154
    invoke-interface {v1, p1}, Lnet/sf/scuba/smartcards/APDUListener;->exchangedAPDU(Lnet/sf/scuba/smartcards/APDUEvent;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public removeAPDUListener(Lnet/sf/scuba/smartcards/APDUListener;)V
    .locals 1

    .line 139
    iget-object v0, p0, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->service:Lnet/sf/scuba/smartcards/CardService;

    invoke-virtual {v0, p1}, Lnet/sf/scuba/smartcards/CardService;->removeAPDUListener(Lnet/sf/scuba/smartcards/APDUListener;)V

    return-void
.end method

.method public transmit(Lnet/sf/scuba/smartcards/APDUWrapper;Lnet/sf/scuba/smartcards/CommandAPDU;)Lnet/sf/scuba/smartcards/ResponseAPDU;
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    const-string v1, "Exception during transmission of wrapped APDU, C="

    if-eqz p1, :cond_0

    .line 86
    invoke-interface {p1, p2}, Lnet/sf/scuba/smartcards/APDUWrapper;->wrap(Lnet/sf/scuba/smartcards/CommandAPDU;)Lnet/sf/scuba/smartcards/CommandAPDU;

    move-result-object v0

    move-object v8, v0

    goto :goto_0

    :cond_0
    move-object v8, p2

    .line 88
    :goto_0
    iget-object v0, p0, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->service:Lnet/sf/scuba/smartcards/CardService;

    invoke-virtual {v0, v8}, Lnet/sf/scuba/smartcards/CardService;->transmit(Lnet/sf/scuba/smartcards/CommandAPDU;)Lnet/sf/scuba/smartcards/ResponseAPDU;

    move-result-object v7

    .line 90
    invoke-virtual {v7}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getSW()I

    move-result v0

    int-to-short v2, v0

    if-nez p1, :cond_1

    .line 92
    new-instance v2, Lnet/sf/scuba/smartcards/APDUEvent;

    iget p1, p0, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->apduCount:I

    add-int/lit8 v5, p1, 0x1

    iput v5, p0, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->apduCount:I

    const-string v4, "PLAIN"

    move-object v3, p0

    move-object v6, v8

    invoke-direct/range {v2 .. v7}, Lnet/sf/scuba/smartcards/APDUEvent;-><init>(Ljava/lang/Object;Ljava/io/Serializable;ILnet/sf/scuba/smartcards/CommandAPDU;Lnet/sf/scuba/smartcards/ResponseAPDU;)V

    invoke-virtual {p0, v2}, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->notifyExchangedAPDU(Lnet/sf/scuba/smartcards/APDUEvent;)V

    return-object v7

    :cond_1
    move-object v3, p0

    .line 95
    :try_start_0
    invoke-virtual {v7}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getBytes()[B

    move-result-object v0

    array-length v0, v0
    :try_end_0
    .catch Lnet/sf/scuba/smartcards/CardServiceException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v4, 0x2

    if-le v0, v4, :cond_2

    move-object v9, v7

    .line 100
    :try_start_1
    invoke-interface {p1, v9}, Lnet/sf/scuba/smartcards/APDUWrapper;->unwrap(Lnet/sf/scuba/smartcards/ResponseAPDU;)Lnet/sf/scuba/smartcards/ResponseAPDU;

    move-result-object v7
    :try_end_1
    .catch Lnet/sf/scuba/smartcards/CardServiceException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    new-instance v2, Lorg/jmrtd/WrappedAPDUEvent;

    invoke-interface {p1}, Lnet/sf/scuba/smartcards/APDUWrapper;->getType()Ljava/lang/String;

    move-result-object v4

    iget p1, v3, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->apduCount:I

    add-int/lit8 v5, p1, 0x1

    iput v5, v3, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->apduCount:I

    move-object v6, p2

    invoke-direct/range {v2 .. v9}, Lorg/jmrtd/WrappedAPDUEvent;-><init>(Ljava/lang/Object;Ljava/io/Serializable;ILnet/sf/scuba/smartcards/CommandAPDU;Lnet/sf/scuba/smartcards/ResponseAPDU;Lnet/sf/scuba/smartcards/CommandAPDU;Lnet/sf/scuba/smartcards/ResponseAPDU;)V

    invoke-virtual {p0, v2}, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->notifyExchangedAPDU(Lnet/sf/scuba/smartcards/APDUEvent;)V

    return-object v7

    :catchall_0
    move-exception v0

    move-object v6, p2

    move-object v7, v9

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v6, p2

    move-object v7, v9

    goto :goto_2

    :catch_1
    move-exception v0

    move-object v6, p2

    move-object v7, v9

    goto :goto_3

    :cond_2
    move-object v6, p2

    .line 96
    :try_start_2
    new-instance p2, Lnet/sf/scuba/smartcards/CardServiceException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    invoke-virtual {v6}, Lnet/sf/scuba/smartcards/CommandAPDU;->getBytes()[B

    move-result-object v4

    invoke-static {v4}, Lnet/sf/scuba/util/Hex;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, v2}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;I)V

    throw p2
    :try_end_2
    .catch Lnet/sf/scuba/smartcards/CardServiceException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catch_2
    move-exception v0

    goto :goto_2

    :catch_3
    move-exception v0

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v6, p2

    :goto_1
    move-object p2, v0

    goto :goto_4

    :catch_4
    move-exception v0

    move-object v6, p2

    :goto_2
    move-object p2, v0

    .line 104
    :try_start_3
    new-instance v0, Lnet/sf/scuba/smartcards/CardServiceException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    invoke-virtual {v6}, Lnet/sf/scuba/smartcards/CommandAPDU;->getBytes()[B

    move-result-object v1

    invoke-static {v1}, Lnet/sf/scuba/util/Hex;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p2, v2}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;I)V

    throw v0

    :catch_5
    move-exception v0

    move-object v6, p2

    :goto_3
    move-object p2, v0

    .line 102
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v0

    goto :goto_1

    .line 107
    :goto_4
    new-instance v2, Lorg/jmrtd/WrappedAPDUEvent;

    invoke-interface {p1}, Lnet/sf/scuba/smartcards/APDUWrapper;->getType()Ljava/lang/String;

    move-result-object v4

    iget p1, v3, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->apduCount:I

    add-int/lit8 v5, p1, 0x1

    iput v5, v3, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->apduCount:I

    move-object v9, v7

    invoke-direct/range {v2 .. v9}, Lorg/jmrtd/WrappedAPDUEvent;-><init>(Ljava/lang/Object;Ljava/io/Serializable;ILnet/sf/scuba/smartcards/CommandAPDU;Lnet/sf/scuba/smartcards/ResponseAPDU;Lnet/sf/scuba/smartcards/CommandAPDU;Lnet/sf/scuba/smartcards/ResponseAPDU;)V

    invoke-virtual {p0, v2}, Lorg/jmrtd/protocol/SecureMessagingAPDUSender;->notifyExchangedAPDU(Lnet/sf/scuba/smartcards/APDUEvent;)V

    .line 108
    throw p2
.end method
