.class public Lorg/bouncycastle/crypto/tls/TlsStreamCipher;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/tls/TlsCipher;


# instance fields
.field protected context:Lorg/bouncycastle/crypto/tls/TlsContext;

.field protected decryptCipher:Lorg/bouncycastle/crypto/StreamCipher;

.field protected encryptCipher:Lorg/bouncycastle/crypto/StreamCipher;

.field protected readMac:Lorg/bouncycastle/crypto/tls/TlsMac;

.field protected usesNonce:Z

.field protected writeMac:Lorg/bouncycastle/crypto/tls/TlsMac;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/tls/TlsContext;Lorg/bouncycastle/crypto/StreamCipher;Lorg/bouncycastle/crypto/StreamCipher;Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/Digest;IZ)V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move/from16 v2, p6

    move/from16 v3, p7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Lorg/bouncycastle/crypto/tls/TlsContext;->isServer()Z

    move-result v4

    iput-object p1, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->context:Lorg/bouncycastle/crypto/tls/TlsContext;

    iput-boolean v3, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->usesNonce:Z

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->encryptCipher:Lorg/bouncycastle/crypto/StreamCipher;

    iput-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->decryptCipher:Lorg/bouncycastle/crypto/StreamCipher;

    mul-int/lit8 v5, v2, 0x2

    invoke-interface/range {p4 .. p4}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v6

    add-int/2addr v5, v6

    invoke-interface/range {p5 .. p5}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v6

    add-int/2addr v5, v6

    invoke-static {p1, v5}, Lorg/bouncycastle/crypto/tls/TlsUtils;->calculateKeyBlock(Lorg/bouncycastle/crypto/tls/TlsContext;I)[B

    move-result-object v9

    new-instance v6, Lorg/bouncycastle/crypto/tls/TlsMac;

    invoke-interface/range {p4 .. p4}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v11

    const/4 v10, 0x0

    move-object v7, p1

    move-object/from16 v8, p4

    invoke-direct/range {v6 .. v11}, Lorg/bouncycastle/crypto/tls/TlsMac;-><init>(Lorg/bouncycastle/crypto/tls/TlsContext;Lorg/bouncycastle/crypto/Digest;[BII)V

    move-object v12, v6

    invoke-interface/range {p4 .. p4}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v10

    new-instance v6, Lorg/bouncycastle/crypto/tls/TlsMac;

    invoke-interface/range {p5 .. p5}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v11

    move-object/from16 v8, p5

    invoke-direct/range {v6 .. v11}, Lorg/bouncycastle/crypto/tls/TlsMac;-><init>(Lorg/bouncycastle/crypto/tls/TlsContext;Lorg/bouncycastle/crypto/Digest;[BII)V

    invoke-interface/range {p5 .. p5}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result p1

    add-int/2addr v10, p1

    new-instance p1, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-direct {p1, v9, v10, v2}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([BII)V

    add-int/2addr v10, v2

    new-instance v7, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-direct {v7, v9, v10, v2}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([BII)V

    add-int/2addr v10, v2

    if-ne v10, v5, :cond_2

    if-eqz v4, :cond_0

    iput-object v6, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->writeMac:Lorg/bouncycastle/crypto/tls/TlsMac;

    iput-object v12, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->readMac:Lorg/bouncycastle/crypto/tls/TlsMac;

    iput-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->encryptCipher:Lorg/bouncycastle/crypto/StreamCipher;

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->decryptCipher:Lorg/bouncycastle/crypto/StreamCipher;

    move-object v13, v7

    move-object v7, p1

    move-object p1, v13

    goto :goto_0

    :cond_0
    iput-object v12, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->writeMac:Lorg/bouncycastle/crypto/tls/TlsMac;

    iput-object v6, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->readMac:Lorg/bouncycastle/crypto/tls/TlsMac;

    iput-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->encryptCipher:Lorg/bouncycastle/crypto/StreamCipher;

    iput-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->decryptCipher:Lorg/bouncycastle/crypto/StreamCipher;

    :goto_0
    if-eqz v3, :cond_1

    const/16 v0, 0x8

    new-array v0, v0, [B

    new-instance v1, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-direct {v1, p1, v0}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    new-instance p1, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    invoke-direct {p1, v7, v0}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    move-object v7, p1

    move-object p1, v1

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->encryptCipher:Lorg/bouncycastle/crypto/StreamCipher;

    const/4 v1, 0x1

    invoke-interface {v0, v1, p1}, Lorg/bouncycastle/crypto/StreamCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->decryptCipher:Lorg/bouncycastle/crypto/StreamCipher;

    const/4 v0, 0x0

    invoke-interface {p1, v0, v7}, Lorg/bouncycastle/crypto/StreamCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void

    :cond_2
    new-instance p1, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 v0, 0x50

    invoke-direct {p1, v0}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw p1
.end method


# virtual methods
.method protected checkMAC(JS[BII[BII)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static/range {p4 .. p6}, Lorg/bouncycastle/util/Arrays;->copyOfRange([BII)[B

    move-result-object p4

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->readMac:Lorg/bouncycastle/crypto/tls/TlsMac;

    move-wide v1, p1

    move v3, p3

    move-object v4, p7

    move v5, p8

    move/from16 v6, p9

    invoke-virtual/range {v0 .. v6}, Lorg/bouncycastle/crypto/tls/TlsMac;->calculateMac(JS[BII)[B

    move-result-object p1

    invoke-static {p4, p1}, Lorg/bouncycastle/util/Arrays;->constantTimeAreEqual([B[B)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 p2, 0x14

    invoke-direct {p1, p2}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw p1
.end method

.method public decodeCiphertext(JS[BII)[B
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move/from16 v3, p6

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->usesNonce:Z

    const/4 v10, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->decryptCipher:Lorg/bouncycastle/crypto/StreamCipher;

    invoke-virtual {p0, v0, v10, p1, p2}, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->updateIV(Lorg/bouncycastle/crypto/StreamCipher;ZJ)V

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->readMac:Lorg/bouncycastle/crypto/tls/TlsMac;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/TlsMac;->getSize()I

    move-result v0

    if-lt v3, v0, :cond_1

    sub-int v6, v3, v0

    new-array v4, v3, [B

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->decryptCipher:Lorg/bouncycastle/crypto/StreamCipher;

    const/4 v5, 0x0

    move-object v1, p4

    move/from16 v2, p5

    invoke-interface/range {v0 .. v5}, Lorg/bouncycastle/crypto/StreamCipher;->processBytes([BII[BI)I

    const/4 v8, 0x0

    move-object v7, v4

    move v9, v6

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move v5, v6

    move/from16 v6, p6

    invoke-virtual/range {v0 .. v9}, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->checkMAC(JS[BII[BII)V

    invoke-static {v4, v10, v5}, Lorg/bouncycastle/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 p2, 0x32

    invoke-direct {p1, p2}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw p1
.end method

.method public encodePlaintext(JS[BII)[B
    .locals 11

    iget-boolean v0, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->usesNonce:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->encryptCipher:Lorg/bouncycastle/crypto/StreamCipher;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1, p1, p2}, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->updateIV(Lorg/bouncycastle/crypto/StreamCipher;ZJ)V

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->writeMac:Lorg/bouncycastle/crypto/tls/TlsMac;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/TlsMac;->getSize()I

    move-result v0

    add-int v0, p6, v0

    new-array v9, v0, [B

    iget-object v5, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->encryptCipher:Lorg/bouncycastle/crypto/StreamCipher;

    const/4 v10, 0x0

    move-object v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    invoke-interface/range {v5 .. v10}, Lorg/bouncycastle/crypto/StreamCipher;->processBytes([BII[BI)I

    iget-object v2, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->writeMac:Lorg/bouncycastle/crypto/tls/TlsMac;

    move-wide v3, p1

    move v5, p3

    invoke-virtual/range {v2 .. v8}, Lorg/bouncycastle/crypto/tls/TlsMac;->calculateMac(JS[BII)[B

    move-result-object v2

    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->encryptCipher:Lorg/bouncycastle/crypto/StreamCipher;

    const/4 v3, 0x0

    array-length v4, v2

    move/from16 v6, p6

    move-object v5, v9

    invoke-interface/range {v1 .. v6}, Lorg/bouncycastle/crypto/StreamCipher;->processBytes([BII[BI)I

    return-object v9
.end method

.method public getPlaintextLimit(I)I
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsStreamCipher;->writeMac:Lorg/bouncycastle/crypto/tls/TlsMac;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/tls/TlsMac;->getSize()I

    move-result v0

    sub-int/2addr p1, v0

    return p1
.end method

.method protected updateIV(Lorg/bouncycastle/crypto/StreamCipher;ZJ)V
    .locals 2

    const/16 v0, 0x8

    new-array v0, v0, [B

    const/4 v1, 0x0

    invoke-static {p3, p4, v0, v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint64(J[BI)V

    new-instance p3, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    const/4 p4, 0x0

    invoke-direct {p3, p4, v0}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    invoke-interface {p1, p2, p3}, Lorg/bouncycastle/crypto/StreamCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void
.end method
