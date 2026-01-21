.class Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/tls/DatagramTransport;


# static fields
.field private static final MAX_FRAGMENT_LENGTH:I = 0x4000

.field private static final RECORD_HEADER_LENGTH:I = 0xd

.field private static final RETRANSMIT_TIMEOUT:J = 0x3a980L

.field private static final TCP_MSL:J = 0x1d4c0L


# instance fields
.field private volatile closed:Z

.field private final context:Lorg/bouncycastle/crypto/tls/TlsContext;

.field private currentEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

.field private volatile failed:Z

.field private volatile inHandshake:Z

.field private final peer:Lorg/bouncycastle/crypto/tls/TlsPeer;

.field private pendingEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

.field private volatile plaintextLimit:I

.field private readEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

.field private volatile readVersion:Lorg/bouncycastle/crypto/tls/ProtocolVersion;

.field private final recordQueue:Lorg/bouncycastle/crypto/tls/ByteQueue;

.field private retransmit:Lorg/bouncycastle/crypto/tls/DTLSHandshakeRetransmit;

.field private retransmitEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

.field private retransmitExpiry:J

.field private final transport:Lorg/bouncycastle/crypto/tls/DatagramTransport;

.field private writeEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

.field private volatile writeVersion:Lorg/bouncycastle/crypto/tls/ProtocolVersion;


# direct methods
.method constructor <init>(Lorg/bouncycastle/crypto/tls/DatagramTransport;Lorg/bouncycastle/crypto/tls/TlsContext;Lorg/bouncycastle/crypto/tls/TlsPeer;S)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p4, Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-direct {p4}, Lorg/bouncycastle/crypto/tls/ByteQueue;-><init>()V

    iput-object p4, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->recordQueue:Lorg/bouncycastle/crypto/tls/ByteQueue;

    const/4 p4, 0x0

    iput-boolean p4, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->closed:Z

    iput-boolean p4, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->failed:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->readVersion:Lorg/bouncycastle/crypto/tls/ProtocolVersion;

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->writeVersion:Lorg/bouncycastle/crypto/tls/ProtocolVersion;

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->retransmit:Lorg/bouncycastle/crypto/tls/DTLSHandshakeRetransmit;

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->retransmitEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->retransmitExpiry:J

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->transport:Lorg/bouncycastle/crypto/tls/DatagramTransport;

    iput-object p2, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->context:Lorg/bouncycastle/crypto/tls/TlsContext;

    iput-object p3, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->peer:Lorg/bouncycastle/crypto/tls/TlsPeer;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->inHandshake:Z

    new-instance p1, Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    new-instance p3, Lorg/bouncycastle/crypto/tls/TlsNullCipher;

    invoke-direct {p3, p2}, Lorg/bouncycastle/crypto/tls/TlsNullCipher;-><init>(Lorg/bouncycastle/crypto/tls/TlsContext;)V

    invoke-direct {p1, p4, p3}, Lorg/bouncycastle/crypto/tls/DTLSEpoch;-><init>(ILorg/bouncycastle/crypto/tls/TlsCipher;)V

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->currentEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->pendingEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->readEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->writeEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    const/16 p1, 0x4000

    invoke-virtual {p0, p1}, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->setPlaintextLimit(I)V

    return-void
.end method

.method private closeTransport()V
    .locals 2

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->closed:Z

    if-nez v0, :cond_1

    :try_start_0
    iget-boolean v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->failed:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->warn(SLjava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->transport:Lorg/bouncycastle/crypto/tls/DatagramTransport;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/tls/DatagramTransport;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->closed:Z

    :cond_1
    return-void
.end method

.method private static getMacSequenceNumber(IJ)J
    .locals 4

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    const/16 p0, 0x30

    shl-long/2addr v0, p0

    or-long p0, v0, p1

    return-wide p0
.end method

.method private raiseAlert(SSLjava/lang/String;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->peer:Lorg/bouncycastle/crypto/tls/TlsPeer;

    invoke-interface {v0, p1, p2, p3, p4}, Lorg/bouncycastle/crypto/tls/TlsPeer;->notifyAlertRaised(SSLjava/lang/String;Ljava/lang/Throwable;)V

    int-to-byte p1, p1

    int-to-byte p2, p2

    const/4 p3, 0x2

    new-array p4, p3, [B

    const/4 v0, 0x0

    aput-byte p1, p4, v0

    const/4 p1, 0x1

    aput-byte p2, p4, p1

    const/16 p1, 0x15

    invoke-direct {p0, p1, p4, v0, p3}, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->sendRecord(S[BII)V

    return-void
.end method

.method private receiveRecord([BIII)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->recordQueue:Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/ByteQueue;->available()I

    move-result v0

    const/16 v1, 0xd

    if-lez v0, :cond_1

    iget-object p3, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->recordQueue:Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-virtual {p3}, Lorg/bouncycastle/crypto/tls/ByteQueue;->available()I

    move-result p3

    const/4 p4, 0x0

    if-lt p3, v1, :cond_0

    const/4 p3, 0x2

    new-array v0, p3, [B

    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->recordQueue:Lorg/bouncycastle/crypto/tls/ByteQueue;

    const/16 v3, 0xb

    invoke-virtual {v2, v0, p4, p3, v3}, Lorg/bouncycastle/crypto/tls/ByteQueue;->read([BIII)V

    invoke-static {v0, p4}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readUint16([BI)I

    move-result p3

    goto :goto_0

    :cond_0
    move p3, p4

    :goto_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->recordQueue:Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/ByteQueue;->available()I

    move-result v0

    add-int/2addr p3, v1

    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->recordQueue:Lorg/bouncycastle/crypto/tls/ByteQueue;

    invoke-virtual {v0, p1, p2, p3, p4}, Lorg/bouncycastle/crypto/tls/ByteQueue;->removeData([BIII)V

    return p3

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->transport:Lorg/bouncycastle/crypto/tls/DatagramTransport;

    invoke-interface {v0, p1, p2, p3, p4}, Lorg/bouncycastle/crypto/tls/DatagramTransport;->receive([BIII)I

    move-result p3

    if-lt p3, v1, :cond_2

    add-int/lit8 p4, p2, 0xb

    invoke-static {p1, p4}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readUint16([BI)I

    move-result p4

    add-int/2addr p4, v1

    if-le p3, p4, :cond_2

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->recordQueue:Lorg/bouncycastle/crypto/tls/ByteQueue;

    add-int/2addr p2, p4

    sub-int/2addr p3, p4

    invoke-virtual {v0, p1, p2, p3}, Lorg/bouncycastle/crypto/tls/ByteQueue;->addData([BII)V

    return p4

    :cond_2
    return p3
.end method

.method private sendRecord(S[BII)V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move v6, p4

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->writeVersion:Lorg/bouncycastle/crypto/tls/ProtocolVersion;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->plaintextLimit:I

    const/16 v1, 0x50

    if-gt v6, v0, :cond_3

    const/4 v7, 0x1

    if-ge v6, v7, :cond_2

    const/16 v0, 0x17

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0

    :cond_2
    :goto_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->writeEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/DTLSEpoch;->getEpoch()I

    move-result v8

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->writeEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/DTLSEpoch;->allocateSequenceNumber()J

    move-result-wide v9

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->writeEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/DTLSEpoch;->getCipher()Lorg/bouncycastle/crypto/tls/TlsCipher;

    move-result-object v0

    invoke-static {v8, v9, v10}, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->getMacSequenceNumber(IJ)J

    move-result-wide v1

    move v3, p1

    move-object v4, p2

    move v5, p3

    invoke-interface/range {v0 .. v6}, Lorg/bouncycastle/crypto/tls/TlsCipher;->encodePlaintext(JS[BII)[B

    move-result-object v0

    array-length v1, v0

    const/16 v2, 0xd

    add-int/2addr v1, v2

    new-array v4, v1, [B

    const/4 v5, 0x0

    invoke-static {p1, v4, v5}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint8(S[BI)V

    iget-object v3, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->writeVersion:Lorg/bouncycastle/crypto/tls/ProtocolVersion;

    invoke-static {v3, v4, v7}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeVersion(Lorg/bouncycastle/crypto/tls/ProtocolVersion;[BI)V

    const/4 v3, 0x3

    invoke-static {v8, v4, v3}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint16(I[BI)V

    const/4 v3, 0x5

    invoke-static {v9, v10, v4, v3}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint48(J[BI)V

    array-length v3, v0

    const/16 v6, 0xb

    invoke-static {v3, v4, v6}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint16(I[BI)V

    array-length v3, v0

    invoke-static {v0, v5, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->transport:Lorg/bouncycastle/crypto/tls/DatagramTransport;

    invoke-interface {v0, v4, v5, v1}, Lorg/bouncycastle/crypto/tls/DatagramTransport;->send([BII)V

    return-void

    :cond_3
    new-instance v0, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v0
.end method


# virtual methods
.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->closed:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->inHandshake:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x5a

    const-string v1, "User canceled handshake"

    invoke-virtual {p0, v0, v1}, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->warn(SLjava/lang/String;)V

    :cond_0
    invoke-direct {p0}, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->closeTransport()V

    :cond_1
    return-void
.end method

.method fail(S)V
    .locals 2

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->closed:Z

    if-nez v0, :cond_0

    const/4 v0, 0x2

    const/4 v1, 0x0

    :try_start_0
    invoke-direct {p0, v0, p1, v1, v1}, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->raiseAlert(SSLjava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->failed:Z

    invoke-direct {p0}, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->closeTransport()V

    :cond_0
    return-void
.end method

.method failed()V
    .locals 1

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->closed:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->failed:Z

    invoke-direct {p0}, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->closeTransport()V

    :cond_0
    return-void
.end method

.method getReadEpoch()I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->readEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/DTLSEpoch;->getEpoch()I

    move-result v0

    return v0
.end method

.method getReadVersion()Lorg/bouncycastle/crypto/tls/ProtocolVersion;
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->readVersion:Lorg/bouncycastle/crypto/tls/ProtocolVersion;

    return-object v0
.end method

.method public getReceiveLimit()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->plaintextLimit:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->readEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/tls/DTLSEpoch;->getCipher()Lorg/bouncycastle/crypto/tls/TlsCipher;

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->transport:Lorg/bouncycastle/crypto/tls/DatagramTransport;

    invoke-interface {v2}, Lorg/bouncycastle/crypto/tls/DatagramTransport;->getReceiveLimit()I

    move-result v2

    add-int/lit8 v2, v2, -0xd

    invoke-interface {v1, v2}, Lorg/bouncycastle/crypto/tls/TlsCipher;->getPlaintextLimit(I)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public getSendLimit()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->plaintextLimit:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->writeEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/tls/DTLSEpoch;->getCipher()Lorg/bouncycastle/crypto/tls/TlsCipher;

    move-result-object v1

    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->transport:Lorg/bouncycastle/crypto/tls/DatagramTransport;

    invoke-interface {v2}, Lorg/bouncycastle/crypto/tls/DatagramTransport;->getSendLimit()I

    move-result v2

    add-int/lit8 v2, v2, -0xd

    invoke-interface {v1, v2}, Lorg/bouncycastle/crypto/tls/TlsCipher;->getPlaintextLimit(I)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method handshakeSuccessful(Lorg/bouncycastle/crypto/tls/DTLSHandshakeRetransmit;)V
    .locals 4

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->readEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->currentEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->writeEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    if-eq v0, v1, :cond_1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->retransmit:Lorg/bouncycastle/crypto/tls/DTLSHandshakeRetransmit;

    iput-object v1, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->retransmitEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/32 v2, 0x3a980

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->retransmitExpiry:J

    :cond_0
    const/4 p1, 0x0

    iput-boolean p1, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->inHandshake:Z

    iget-object p1, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->pendingEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->currentEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    const/4 p1, 0x0

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->pendingEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method initPendingEpoch(Lorg/bouncycastle/crypto/tls/TlsCipher;)V
    .locals 2

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->pendingEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    if-nez v0, :cond_0

    new-instance v0, Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->writeEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/tls/DTLSEpoch;->getEpoch()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v0, v1, p1}, Lorg/bouncycastle/crypto/tls/DTLSEpoch;-><init>(ILorg/bouncycastle/crypto/tls/TlsCipher;)V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->pendingEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method isClosed()Z
    .locals 1

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->closed:Z

    return v0
.end method

.method public receive([BIII)I
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->getReceiveLimit()I

    move-result v3

    move/from16 v4, p3

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    const/16 v5, 0xd

    add-int/2addr v3, v5

    if-eqz v2, :cond_0

    array-length v6, v2

    if-ge v6, v3, :cond_1

    :cond_0
    new-array v2, v3, [B

    :cond_1
    move-object v10, v2

    iget-object v2, v0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->retransmit:Lorg/bouncycastle/crypto/tls/DTLSHandshakeRetransmit;

    if-eqz v2, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    iget-wide v8, v0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->retransmitExpiry:J

    cmp-long v2, v6, v8

    if-lez v2, :cond_2

    iput-object v1, v0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->retransmit:Lorg/bouncycastle/crypto/tls/DTLSHandshakeRetransmit;

    iput-object v1, v0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->retransmitEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    :cond_2
    const/4 v2, 0x0

    move/from16 v13, p4

    invoke-direct {v0, v10, v2, v3, v13}, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->receiveRecord([BIII)I

    move-result v3

    if-gez v3, :cond_3

    return v3

    :cond_3
    if-ge v3, v5, :cond_4

    :goto_1
    move-object/from16 v2, p1

    move/from16 v3, p2

    goto/16 :goto_8

    :cond_4
    const/16 v6, 0xb

    invoke-static {v10, v6}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readUint16([BI)I

    move-result v6

    add-int/2addr v6, v5

    if-eq v3, v6, :cond_5

    goto :goto_1

    :cond_5
    invoke-static {v10, v2}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readUint8([BI)S

    move-result v9

    packed-switch v9, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const/4 v5, 0x3

    invoke-static {v10, v5}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readUint16([BI)I

    move-result v5

    iget-object v6, v0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->readEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    invoke-virtual {v6}, Lorg/bouncycastle/crypto/tls/DTLSEpoch;->getEpoch()I

    move-result v6

    if-ne v5, v6, :cond_6

    iget-object v6, v0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->readEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    :goto_2
    move-object v14, v6

    goto :goto_3

    :cond_6
    const/16 v6, 0x16

    if-ne v9, v6, :cond_7

    iget-object v6, v0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->retransmitEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Lorg/bouncycastle/crypto/tls/DTLSEpoch;->getEpoch()I

    move-result v6

    if-ne v5, v6, :cond_7

    iget-object v6, v0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->retransmitEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    goto :goto_2

    :cond_7
    move-object v14, v1

    :goto_3
    if-nez v14, :cond_8

    goto :goto_1

    :cond_8
    const/4 v6, 0x5

    invoke-static {v10, v6}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readUint48([BI)J

    move-result-wide v6

    invoke-virtual {v14}, Lorg/bouncycastle/crypto/tls/DTLSEpoch;->getReplayWindow()Lorg/bouncycastle/crypto/tls/DTLSReplayWindow;

    move-result-object v8

    invoke-virtual {v8, v6, v7}, Lorg/bouncycastle/crypto/tls/DTLSReplayWindow;->shouldDiscard(J)Z

    move-result v8

    if-eqz v8, :cond_9

    goto :goto_1

    :cond_9
    const/4 v15, 0x1

    invoke-static {v10, v15}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readVersion([BI)Lorg/bouncycastle/crypto/tls/ProtocolVersion;

    move-result-object v8

    invoke-virtual {v8}, Lorg/bouncycastle/crypto/tls/ProtocolVersion;->isDTLS()Z

    move-result v11

    if-nez v11, :cond_a

    goto :goto_1

    :cond_a
    iget-object v11, v0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->readVersion:Lorg/bouncycastle/crypto/tls/ProtocolVersion;

    if-eqz v11, :cond_b

    iget-object v11, v0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->readVersion:Lorg/bouncycastle/crypto/tls/ProtocolVersion;

    invoke-virtual {v11, v8}, Lorg/bouncycastle/crypto/tls/ProtocolVersion;->equals(Lorg/bouncycastle/crypto/tls/ProtocolVersion;)Z

    move-result v11

    if-nez v11, :cond_b

    goto :goto_1

    :cond_b
    invoke-virtual {v14}, Lorg/bouncycastle/crypto/tls/DTLSEpoch;->getCipher()Lorg/bouncycastle/crypto/tls/TlsCipher;

    move-result-object v11

    invoke-virtual {v14}, Lorg/bouncycastle/crypto/tls/DTLSEpoch;->getEpoch()I

    move-result v12

    invoke-static {v12, v6, v7}, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->getMacSequenceNumber(IJ)J

    move-result-wide v16

    add-int/lit8 v12, v3, -0xd

    move-wide/from16 v18, v6

    move-object v6, v11

    const/16 v11, 0xd

    move-object v3, v8

    move-wide/from16 v7, v16

    move-wide/from16 v1, v18

    invoke-interface/range {v6 .. v12}, Lorg/bouncycastle/crypto/tls/TlsCipher;->decodeCiphertext(JS[BII)[B

    move-result-object v6

    invoke-virtual {v14}, Lorg/bouncycastle/crypto/tls/DTLSEpoch;->getReplayWindow()Lorg/bouncycastle/crypto/tls/DTLSReplayWindow;

    move-result-object v7

    invoke-virtual {v7, v1, v2}, Lorg/bouncycastle/crypto/tls/DTLSReplayWindow;->reportAuthenticated(J)V

    array-length v1, v6

    iget v2, v0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->plaintextLimit:I

    if-le v1, v2, :cond_d

    :cond_c
    :goto_4
    :pswitch_1
    move-object/from16 v2, p1

    move/from16 v3, p2

    const/4 v1, 0x0

    goto/16 :goto_8

    :cond_d
    iget-object v1, v0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->readVersion:Lorg/bouncycastle/crypto/tls/ProtocolVersion;

    if-nez v1, :cond_e

    iput-object v3, v0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->readVersion:Lorg/bouncycastle/crypto/tls/ProtocolVersion;

    :cond_e
    packed-switch v9, :pswitch_data_1

    goto :goto_7

    :pswitch_2
    iget-boolean v1, v0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->inHandshake:Z

    if-eqz v1, :cond_12

    goto :goto_4

    :pswitch_3
    iget-boolean v1, v0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->inHandshake:Z

    if-nez v1, :cond_12

    iget-object v1, v0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->retransmit:Lorg/bouncycastle/crypto/tls/DTLSHandshakeRetransmit;

    if-eqz v1, :cond_c

    array-length v2, v6

    const/4 v3, 0x0

    invoke-interface {v1, v5, v6, v3, v2}, Lorg/bouncycastle/crypto/tls/DTLSHandshakeRetransmit;->receivedHandshakeRecord(I[BII)V

    goto :goto_4

    :pswitch_4
    const/4 v3, 0x0

    array-length v1, v6

    const/4 v2, 0x2

    if-ne v1, v2, :cond_c

    aget-byte v1, v6, v3

    int-to-short v1, v1

    aget-byte v3, v6, v15

    int-to-short v3, v3

    iget-object v5, v0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->peer:Lorg/bouncycastle/crypto/tls/TlsPeer;

    invoke-interface {v5, v1, v3}, Lorg/bouncycastle/crypto/tls/TlsPeer;->notifyAlertReceived(SS)V

    if-eq v1, v2, :cond_f

    if-nez v3, :cond_c

    invoke-direct {v0}, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->closeTransport()V

    goto :goto_4

    :cond_f
    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->failed()V

    new-instance v1, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    invoke-direct {v1, v3}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v1

    :pswitch_5
    const/4 v2, 0x0

    :goto_5
    array-length v1, v6

    if-ge v2, v1, :cond_c

    invoke-static {v6, v2}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readUint8([BI)S

    move-result v1

    if-eq v1, v15, :cond_10

    goto :goto_6

    :cond_10
    iget-object v1, v0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->pendingEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    if-eqz v1, :cond_11

    iput-object v1, v0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->readEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    :cond_11
    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_12
    :goto_7
    iget-boolean v1, v0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->inHandshake:Z

    if-nez v1, :cond_13

    iget-object v1, v0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->retransmit:Lorg/bouncycastle/crypto/tls/DTLSHandshakeRetransmit;

    if-eqz v1, :cond_13

    const/4 v1, 0x0

    iput-object v1, v0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->retransmit:Lorg/bouncycastle/crypto/tls/DTLSHandshakeRetransmit;

    iput-object v1, v0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->retransmitEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    :cond_13
    array-length v1, v6

    move-object/from16 v2, p1

    move/from16 v3, p2

    const/4 v4, 0x0

    invoke-static {v6, v4, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v1, v6

    return v1

    :goto_8
    move-object v2, v10

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x14
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method resetWriteEpoch()V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->retransmitEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    if-eqz v0, :cond_0

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->writeEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    return-void

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->currentEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->writeEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    return-void
.end method

.method public send([BII)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->inHandshake:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->writeEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->retransmitEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x17

    goto :goto_3

    :cond_1
    :goto_0
    invoke-static {p1, p2}, Lorg/bouncycastle/crypto/tls/TlsUtils;->readUint8([BI)S

    move-result v0

    const/16 v1, 0x14

    if-ne v0, v1, :cond_5

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->inHandshake:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->pendingEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->writeEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->retransmitEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    if-ne v0, v2, :cond_3

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->currentEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_4

    const/4 v2, 0x1

    new-array v3, v2, [B

    const/4 v4, 0x0

    aput-byte v2, v3, v4

    invoke-direct {p0, v1, v3, v4, v2}, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->sendRecord(S[BII)V

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->writeEpoch:Lorg/bouncycastle/crypto/tls/DTLSEpoch;

    goto :goto_2

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_5
    :goto_2
    const/16 v0, 0x16

    :goto_3
    invoke-direct {p0, v0, p1, p2, p3}, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->sendRecord(S[BII)V

    return-void
.end method

.method setPlaintextLimit(I)V
    .locals 0

    iput p1, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->plaintextLimit:I

    return-void
.end method

.method setReadVersion(Lorg/bouncycastle/crypto/tls/ProtocolVersion;)V
    .locals 0

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->readVersion:Lorg/bouncycastle/crypto/tls/ProtocolVersion;

    return-void
.end method

.method setWriteVersion(Lorg/bouncycastle/crypto/tls/ProtocolVersion;)V
    .locals 0

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->writeVersion:Lorg/bouncycastle/crypto/tls/ProtocolVersion;

    return-void
.end method

.method warn(SLjava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, p2, v1}, Lorg/bouncycastle/crypto/tls/DTLSRecordLayer;->raiseAlert(SSLjava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
