.class public Lnet/sf/scuba/smartcards/IsoDepCardService;
.super Lnet/sf/scuba/smartcards/CardService;
.source "IsoDepCardService.java"


# static fields
.field private static final LOGGER:Ljava/util/logging/Logger;


# instance fields
.field private apduCount:I

.field private isoDep:Landroid/nfc/tech/IsoDep;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 55
    const-string v0, "net.sf.scuba"

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lnet/sf/scuba/smartcards/IsoDepCardService;->LOGGER:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Landroid/nfc/tech/IsoDep;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Lnet/sf/scuba/smartcards/CardService;-><init>()V

    .line 66
    iput-object p1, p0, Lnet/sf/scuba/smartcards/IsoDepCardService;->isoDep:Landroid/nfc/tech/IsoDep;

    const/4 p1, 0x0

    .line 67
    iput p1, p0, Lnet/sf/scuba/smartcards/IsoDepCardService;->apduCount:I

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 167
    :try_start_0
    iget-object v0, p0, Lnet/sf/scuba/smartcards/IsoDepCardService;->isoDep:Landroid/nfc/tech/IsoDep;

    invoke-virtual {v0}, Landroid/nfc/tech/IsoDep;->close()V

    const/4 v0, 0x0

    .line 168
    iput v0, p0, Lnet/sf/scuba/smartcards/IsoDepCardService;->state:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public getATR()[B
    .locals 2

    .line 130
    iget-object v0, p0, Lnet/sf/scuba/smartcards/IsoDepCardService;->isoDep:Landroid/nfc/tech/IsoDep;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 134
    :cond_0
    invoke-virtual {v0}, Landroid/nfc/tech/IsoDep;->getTag()Landroid/nfc/Tag;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v1

    .line 139
    :cond_1
    invoke-static {v0}, Landroid/nfc/tech/NfcA;->get(Landroid/nfc/Tag;)Landroid/nfc/tech/NfcA;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 141
    iget-object v0, p0, Lnet/sf/scuba/smartcards/IsoDepCardService;->isoDep:Landroid/nfc/tech/IsoDep;

    invoke-virtual {v0}, Landroid/nfc/tech/IsoDep;->getHistoricalBytes()[B

    move-result-object v0

    return-object v0

    .line 144
    :cond_2
    invoke-static {v0}, Landroid/nfc/tech/NfcB;->get(Landroid/nfc/Tag;)Landroid/nfc/tech/NfcB;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 146
    iget-object v0, p0, Lnet/sf/scuba/smartcards/IsoDepCardService;->isoDep:Landroid/nfc/tech/IsoDep;

    invoke-virtual {v0}, Landroid/nfc/tech/IsoDep;->getHiLayerResponse()[B

    move-result-object v0

    return-object v0

    .line 149
    :cond_3
    iget-object v0, p0, Lnet/sf/scuba/smartcards/IsoDepCardService;->isoDep:Landroid/nfc/tech/IsoDep;

    invoke-virtual {v0}, Landroid/nfc/tech/IsoDep;->getHistoricalBytes()[B

    move-result-object v0

    return-object v0
.end method

.method public isConnectionLost(Ljava/lang/Exception;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 186
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 188
    const-string v3, "TagLostException"

    invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    return v2

    .line 193
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    .line 195
    const-string p1, ""

    .line 198
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v1, "tag was lost"

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public isExtendedAPDULengthSupported()Z
    .locals 1

    .line 155
    iget-object v0, p0, Lnet/sf/scuba/smartcards/IsoDepCardService;->isoDep:Landroid/nfc/tech/IsoDep;

    invoke-virtual {v0}, Landroid/nfc/tech/IsoDep;->isExtendedLengthApduSupported()Z

    move-result v0

    return v0
.end method

.method public isOpen()Z
    .locals 1

    .line 94
    iget-object v0, p0, Lnet/sf/scuba/smartcards/IsoDepCardService;->isoDep:Landroid/nfc/tech/IsoDep;

    invoke-virtual {v0}, Landroid/nfc/tech/IsoDep;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 95
    iput v0, p0, Lnet/sf/scuba/smartcards/IsoDepCardService;->state:I

    return v0

    :cond_0
    const/4 v0, 0x0

    .line 98
    iput v0, p0, Lnet/sf/scuba/smartcards/IsoDepCardService;->state:I

    return v0
.end method

.method public open()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    .line 74
    const-string v0, "Failed to connect"

    invoke-virtual {p0}, Lnet/sf/scuba/smartcards/IsoDepCardService;->isOpen()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 79
    :cond_0
    :try_start_0
    iget-object v1, p0, Lnet/sf/scuba/smartcards/IsoDepCardService;->isoDep:Landroid/nfc/tech/IsoDep;

    invoke-virtual {v1}, Landroid/nfc/tech/IsoDep;->connect()V

    .line 80
    iget-object v1, p0, Lnet/sf/scuba/smartcards/IsoDepCardService;->isoDep:Landroid/nfc/tech/IsoDep;

    invoke-virtual {v1}, Landroid/nfc/tech/IsoDep;->isConnected()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    .line 83
    iput v1, p0, Lnet/sf/scuba/smartcards/IsoDepCardService;->state:I

    return-void

    .line 81
    :cond_1
    new-instance v1, Lnet/sf/scuba/smartcards/CardServiceException;

    invoke-direct {v1, v0}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v1

    .line 85
    sget-object v2, Lnet/sf/scuba/smartcards/IsoDepCardService;->LOGGER:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    invoke-virtual {v2, v3, v0, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    new-instance v0, Lnet/sf/scuba/smartcards/CardServiceException;

    invoke-virtual {v1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public transmit(Lnet/sf/scuba/smartcards/CommandAPDU;)Lnet/sf/scuba/smartcards/ResponseAPDU;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    .line 112
    :try_start_0
    iget-object v0, p0, Lnet/sf/scuba/smartcards/IsoDepCardService;->isoDep:Landroid/nfc/tech/IsoDep;

    invoke-virtual {v0}, Landroid/nfc/tech/IsoDep;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 115
    iget-object v0, p0, Lnet/sf/scuba/smartcards/IsoDepCardService;->isoDep:Landroid/nfc/tech/IsoDep;

    invoke-virtual {p1}, Lnet/sf/scuba/smartcards/CommandAPDU;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/nfc/tech/IsoDep;->transceive([B)[B

    move-result-object v0

    if-eqz v0, :cond_0

    .line 116
    array-length v1, v0

    const/4 v2, 0x2

    if-lt v1, v2, :cond_0

    .line 119
    new-instance v8, Lnet/sf/scuba/smartcards/ResponseAPDU;

    invoke-direct {v8, v0}, Lnet/sf/scuba/smartcards/ResponseAPDU;-><init>([B)V

    .line 120
    new-instance v3, Lnet/sf/scuba/smartcards/APDUEvent;

    const-string v5, "ISODep"

    iget v0, p0, Lnet/sf/scuba/smartcards/IsoDepCardService;->apduCount:I

    add-int/lit8 v6, v0, 0x1

    iput v6, p0, Lnet/sf/scuba/smartcards/IsoDepCardService;->apduCount:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    move-object v4, p0

    move-object v7, p1

    :try_start_1
    invoke-direct/range {v3 .. v8}, Lnet/sf/scuba/smartcards/APDUEvent;-><init>(Ljava/lang/Object;Ljava/io/Serializable;ILnet/sf/scuba/smartcards/CommandAPDU;Lnet/sf/scuba/smartcards/ResponseAPDU;)V

    invoke-virtual {p0, v3}, Lnet/sf/scuba/smartcards/IsoDepCardService;->notifyExchangedAPDU(Lnet/sf/scuba/smartcards/APDUEvent;)V

    return-object v8

    :cond_0
    move-object v4, p0

    .line 117
    new-instance p1, Lnet/sf/scuba/smartcards/CardServiceException;

    const-string v0, "Failed response"

    invoke-direct {p1, v0}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    move-object v4, p0

    .line 113
    new-instance p1, Lnet/sf/scuba/smartcards/CardServiceException;

    const-string v0, "Not connected"

    invoke-direct {p1, v0}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    move-object v4, p0

    :goto_0
    move-object p1, v0

    .line 125
    new-instance v0, Lnet/sf/scuba/smartcards/CardServiceException;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_3
    move-exception v0

    move-object v4, p0

    :goto_1
    move-object p1, v0

    .line 123
    new-instance v0, Lnet/sf/scuba/smartcards/CardServiceException;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
