.class public Lorg/bouncycastle/crypto/tls/TlsAEADCipher;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/tls/TlsCipher;


# static fields
.field static final NONCE_DRAFT_CHACHA20_POLY1305:I = 0x2

.field public static final NONCE_RFC5288:I = 0x1


# instance fields
.field protected context:Lorg/bouncycastle/crypto/tls/TlsContext;

.field protected decryptCipher:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

.field protected decryptImplicitNonce:[B

.field protected encryptCipher:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

.field protected encryptImplicitNonce:[B

.field protected macSize:I

.field protected nonceMode:I

.field protected record_iv_length:I


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/tls/TlsContext;Lorg/bouncycastle/crypto/modes/AEADBlockCipher;Lorg/bouncycastle/crypto/modes/AEADBlockCipher;II)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v6, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;-><init>(Lorg/bouncycastle/crypto/tls/TlsContext;Lorg/bouncycastle/crypto/modes/AEADBlockCipher;Lorg/bouncycastle/crypto/modes/AEADBlockCipher;III)V

    return-void
.end method

.method constructor <init>(Lorg/bouncycastle/crypto/tls/TlsContext;Lorg/bouncycastle/crypto/modes/AEADBlockCipher;Lorg/bouncycastle/crypto/modes/AEADBlockCipher;III)V
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->isTLSv12(Lorg/bouncycastle/crypto/tls/TlsContext;)Z

    move-result v7

    const/16 v8, 0x50

    if-eqz v7, :cond_4

    iput v6, v0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->nonceMode:I

    const/16 v7, 0x8

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v6, v9, :cond_1

    const/4 v11, 0x2

    if-ne v6, v11, :cond_0

    iput v10, v0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->record_iv_length:I

    const/16 v6, 0xc

    goto :goto_0

    :cond_0
    new-instance v1, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    invoke-direct {v1, v8}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v1

    :cond_1
    iput v7, v0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->record_iv_length:I

    const/4 v6, 0x4

    :goto_0
    iput-object v1, v0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->context:Lorg/bouncycastle/crypto/tls/TlsContext;

    iput v5, v0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->macSize:I

    mul-int/lit8 v11, v4, 0x2

    mul-int/lit8 v12, v6, 0x2

    add-int/2addr v11, v12

    invoke-static {v1, v11}, Lorg/bouncycastle/crypto/tls/TlsUtils;->calculateKeyBlock(Lorg/bouncycastle/crypto/tls/TlsContext;I)[B

    move-result-object v12

    new-instance v13, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-direct {v13, v12, v10, v4}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([BII)V

    new-instance v14, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-direct {v14, v12, v4, v4}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([BII)V

    add-int/2addr v4, v4

    add-int v15, v4, v6

    invoke-static {v12, v4, v15}, Lorg/bouncycastle/util/Arrays;->copyOfRange([BII)[B

    move-result-object v4

    move/from16 v16, v7

    add-int v7, v15, v6

    invoke-static {v12, v15, v7}, Lorg/bouncycastle/util/Arrays;->copyOfRange([BII)[B

    move-result-object v12

    if-ne v7, v11, :cond_3

    invoke-interface {v1}, Lorg/bouncycastle/crypto/tls/TlsContext;->isServer()Z

    move-result v1

    if-eqz v1, :cond_2

    iput-object v3, v0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->encryptCipher:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    iput-object v2, v0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->decryptCipher:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    iput-object v12, v0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->encryptImplicitNonce:[B

    iput-object v4, v0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->decryptImplicitNonce:[B

    move-object/from16 v17, v14

    move-object v14, v13

    move-object/from16 v13, v17

    goto :goto_1

    :cond_2
    iput-object v2, v0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->encryptCipher:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    iput-object v3, v0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->decryptCipher:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    iput-object v4, v0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->encryptImplicitNonce:[B

    iput-object v12, v0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->decryptImplicitNonce:[B

    :goto_1
    iget v1, v0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->record_iv_length:I

    add-int/2addr v6, v1

    new-array v1, v6, [B

    iget-object v2, v0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->encryptCipher:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    new-instance v3, Lorg/bouncycastle/crypto/params/AEADParameters;

    mul-int/lit8 v4, v5, 0x8

    invoke-direct {v3, v13, v4, v1}, Lorg/bouncycastle/crypto/params/AEADParameters;-><init>(Lorg/bouncycastle/crypto/params/KeyParameter;I[B)V

    invoke-interface {v2, v9, v3}, Lorg/bouncycastle/crypto/modes/AEADBlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    iget-object v2, v0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->decryptCipher:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    new-instance v3, Lorg/bouncycastle/crypto/params/AEADParameters;

    invoke-direct {v3, v14, v4, v1}, Lorg/bouncycastle/crypto/params/AEADParameters;-><init>(Lorg/bouncycastle/crypto/params/KeyParameter;I[B)V

    invoke-interface {v2, v10, v3}, Lorg/bouncycastle/crypto/modes/AEADBlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void

    :cond_3
    new-instance v1, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    invoke-direct {v1, v8}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v1

    :cond_4
    new-instance v1, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    invoke-direct {v1, v8}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw v1
.end method


# virtual methods
.method public decodeCiphertext(JS[BII)[B
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0, p6}, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->getPlaintextLimit(I)I

    move-result v0

    if-ltz v0, :cond_4

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->decryptImplicitNonce:[B

    array-length v1, v0

    iget v2, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->record_iv_length:I

    add-int/2addr v1, v2

    new-array v2, v1, [B

    iget v3, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->nonceMode:I

    const/16 v4, 0x50

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq v3, v5, :cond_1

    const/4 v0, 0x2

    if-ne v3, v0, :cond_0

    add-int/lit8 v1, v1, -0x8

    invoke-static {p1, p2, v2, v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint64(J[BI)V

    move v0, v6

    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->decryptImplicitNonce:[B

    array-length v3, v1

    if-ge v0, v3, :cond_2

    aget-byte v3, v2, v0

    aget-byte v1, v1, v0

    xor-int/2addr v1, v3

    int-to-byte v1, v1

    aput-byte v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    invoke-direct {p1, v4}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw p1

    :cond_1
    array-length v3, v0

    invoke-static {v0, v6, v2, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->record_iv_length:I

    sub-int/2addr v1, v0

    invoke-static {p4, p5, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    iget v0, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->record_iv_length:I

    add-int/2addr p5, v0

    sub-int/2addr p6, v0

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->decryptCipher:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    invoke-interface {v0, p6}, Lorg/bouncycastle/crypto/modes/AEADBlockCipher;->getOutputSize(I)I

    move-result v0

    move v1, p3

    move p3, p5

    new-array p5, v0, [B

    invoke-virtual {p0, p1, p2, v1, v0}, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->getAdditionalData(JSI)[B

    move-result-object p1

    new-instance p2, Lorg/bouncycastle/crypto/params/AEADParameters;

    iget v1, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->macSize:I

    mul-int/lit8 v1, v1, 0x8

    const/4 v3, 0x0

    invoke-direct {p2, v3, v1, v2, p1}, Lorg/bouncycastle/crypto/params/AEADParameters;-><init>(Lorg/bouncycastle/crypto/params/KeyParameter;I[B[B)V

    :try_start_0
    iget-object p1, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->decryptCipher:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    invoke-interface {p1, v6, p2}, Lorg/bouncycastle/crypto/modes/AEADBlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->decryptCipher:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    move-object p2, p4

    move p4, p6

    const/4 p6, 0x0

    invoke-interface/range {p1 .. p6}, Lorg/bouncycastle/crypto/modes/AEADBlockCipher;->processBytes([BII[BI)I

    move-result p1

    iget-object p2, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->decryptCipher:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    invoke-interface {p2, p5, p1}, Lorg/bouncycastle/crypto/modes/AEADBlockCipher;->doFinal([BI)I

    move-result p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr p1, p2

    if-ne p1, v0, :cond_3

    return-object p5

    :cond_3
    new-instance p1, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    invoke-direct {p1, v4}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw p1

    :catch_0
    move-exception v0

    move-object p1, v0

    new-instance p2, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 p3, 0x14

    invoke-direct {p2, p3, p1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(SLjava/lang/Throwable;)V

    throw p2

    :cond_4
    new-instance p1, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    const/16 p2, 0x32

    invoke-direct {p1, p2}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw p1
.end method

.method public encodePlaintext(JS[BII)[B
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->encryptImplicitNonce:[B

    array-length v1, v0

    iget v2, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->record_iv_length:I

    add-int/2addr v1, v2

    new-array v2, v1, [B

    iget v4, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->nonceMode:I

    const/16 v6, 0x50

    const/4 v5, 0x0

    const/4 v7, 0x1

    if-eq v4, v7, :cond_1

    const/4 v0, 0x2

    if-ne v4, v0, :cond_0

    add-int/lit8 v0, v1, -0x8

    invoke-static {p1, p2, v2, v0}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint64(J[BI)V

    move v0, v5

    :goto_0
    iget-object v4, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->encryptImplicitNonce:[B

    array-length v8, v4

    if-ge v0, v8, :cond_2

    aget-byte v8, v2, v0

    aget-byte v4, v4, v0

    xor-int/2addr v4, v8

    int-to-byte v4, v4

    aput-byte v4, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    invoke-direct {p1, v6}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw p1

    :cond_1
    array-length v4, v0

    invoke-static {v0, v5, v2, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->encryptImplicitNonce:[B

    array-length v0, v0

    invoke-static {p1, p2, v2, v0}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint64(J[BI)V

    :cond_2
    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->encryptCipher:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    invoke-interface {v0, p6}, Lorg/bouncycastle/crypto/modes/AEADBlockCipher;->getOutputSize(I)I

    move-result v0

    iget v4, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->record_iv_length:I

    add-int v8, v4, v0

    new-array v0, v8, [B

    if-eqz v4, :cond_3

    sub-int/2addr v1, v4

    invoke-static {v2, v1, v0, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    iget v5, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->record_iv_length:I

    invoke-virtual {p0, p1, p2, p3, p6}, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->getAdditionalData(JSI)[B

    move-result-object p1

    new-instance p2, Lorg/bouncycastle/crypto/params/AEADParameters;

    iget p3, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->macSize:I

    mul-int/lit8 p3, p3, 0x8

    const/4 v1, 0x0

    invoke-direct {p2, v1, p3, v2, p1}, Lorg/bouncycastle/crypto/params/AEADParameters;-><init>(Lorg/bouncycastle/crypto/params/KeyParameter;I[B[B)V

    :try_start_0
    iget-object p1, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->encryptCipher:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    invoke-interface {p1, v7, p2}, Lorg/bouncycastle/crypto/modes/AEADBlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    move-object v4, v0

    iget-object v0, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->encryptCipher:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    move-object v1, p4

    move v2, p5

    move v3, p6

    invoke-interface/range {v0 .. v5}, Lorg/bouncycastle/crypto/modes/AEADBlockCipher;->processBytes([BII[BI)I

    move-result p1

    add-int/2addr v5, p1

    iget-object p1, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->encryptCipher:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    invoke-interface {p1, v4, v5}, Lorg/bouncycastle/crypto/modes/AEADBlockCipher;->doFinal([BI)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr v5, p1

    if-ne v5, v8, :cond_4

    return-object v4

    :cond_4
    new-instance p1, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    invoke-direct {p1, v6}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(S)V

    throw p1

    :catch_0
    move-exception v0

    move-object p1, v0

    new-instance p2, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;

    invoke-direct {p2, v6, p1}, Lorg/bouncycastle/crypto/tls/TlsFatalAlert;-><init>(SLjava/lang/Throwable;)V

    throw p2
.end method

.method protected getAdditionalData(JSI)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0xd

    new-array v0, v0, [B

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint64(J[BI)V

    const/16 p1, 0x8

    invoke-static {p3, v0, p1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint8(S[BI)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->context:Lorg/bouncycastle/crypto/tls/TlsContext;

    invoke-interface {p1}, Lorg/bouncycastle/crypto/tls/TlsContext;->getServerVersion()Lorg/bouncycastle/crypto/tls/ProtocolVersion;

    move-result-object p1

    const/16 p2, 0x9

    invoke-static {p1, v0, p2}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeVersion(Lorg/bouncycastle/crypto/tls/ProtocolVersion;[BI)V

    const/16 p1, 0xb

    invoke-static {p4, v0, p1}, Lorg/bouncycastle/crypto/tls/TlsUtils;->writeUint16(I[BI)V

    return-object v0
.end method

.method public getPlaintextLimit(I)I
    .locals 1

    iget v0, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->macSize:I

    sub-int/2addr p1, v0

    iget v0, p0, Lorg/bouncycastle/crypto/tls/TlsAEADCipher;->record_iv_length:I

    sub-int/2addr p1, v0

    return p1
.end method
