.class public Lorg/jmrtd/protocol/BACAPDUSender;
.super Ljava/lang/Object;
.source "BACAPDUSender.java"

# interfaces
.implements Lorg/jmrtd/APDULevelBACCapable;


# static fields
.field private static final BC_PROVIDER:Ljava/security/Provider;

.field private static final ZERO_IV_PARAM_SPEC:Ljavax/crypto/spec/IvParameterSpec;


# instance fields
.field private cipher:Ljavax/crypto/Cipher;

.field private mac:Ljavax/crypto/Mac;

.field private service:Lnet/sf/scuba/smartcards/CardService;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 33
    invoke-static {}, Lorg/jmrtd/Util;->getBouncyCastleProvider()Ljava/security/Provider;

    move-result-object v0

    sput-object v0, Lorg/jmrtd/protocol/BACAPDUSender;->BC_PROVIDER:Ljava/security/Provider;

    .line 36
    new-instance v0, Ljavax/crypto/spec/IvParameterSpec;

    const/16 v1, 0x8

    new-array v1, v1, [B

    fill-array-data v1, :array_0

    invoke-direct {v0, v1}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    sput-object v0, Lorg/jmrtd/protocol/BACAPDUSender;->ZERO_IV_PARAM_SPEC:Ljavax/crypto/spec/IvParameterSpec;

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(Lnet/sf/scuba/smartcards/CardService;)V
    .locals 2

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lorg/jmrtd/protocol/BACAPDUSender;->service:Lnet/sf/scuba/smartcards/CardService;

    .line 55
    :try_start_0
    const-string p1, "ISO9797Alg3Mac"

    sget-object v0, Lorg/jmrtd/protocol/BACAPDUSender;->BC_PROVIDER:Ljava/security/Provider;

    invoke-static {p1, v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Mac;

    move-result-object p1

    iput-object p1, p0, Lorg/jmrtd/protocol/BACAPDUSender;->mac:Ljavax/crypto/Mac;

    .line 56
    const-string p1, "DESede/CBC/NoPadding"

    invoke-static {p1}, Lorg/jmrtd/Util;->getCipher(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object p1

    iput-object p1, p0, Lorg/jmrtd/protocol/BACAPDUSender;->cipher:Ljavax/crypto/Cipher;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 58
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected security exception during initialization"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public declared-synchronized sendGetChallenge()[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    monitor-enter p0

    const/4 v0, 0x0

    .line 70
    :try_start_0
    invoke-virtual {p0, v0}, Lorg/jmrtd/protocol/BACAPDUSender;->sendGetChallenge(Lnet/sf/scuba/smartcards/APDUWrapper;)[B

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized sendGetChallenge(Lnet/sf/scuba/smartcards/APDUWrapper;)[B
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    monitor-enter p0

    .line 83
    :try_start_0
    new-instance v0, Lnet/sf/scuba/smartcards/CommandAPDU;

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v1, 0x0

    const/16 v2, -0x7c

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lnet/sf/scuba/smartcards/CommandAPDU;-><init>(IIIII)V

    .line 84
    iget-object p1, p0, Lorg/jmrtd/protocol/BACAPDUSender;->service:Lnet/sf/scuba/smartcards/CardService;

    invoke-virtual {p1, v0}, Lnet/sf/scuba/smartcards/CardService;->transmit(Lnet/sf/scuba/smartcards/CommandAPDU;)Lnet/sf/scuba/smartcards/ResponseAPDU;

    move-result-object p1

    .line 85
    invoke-virtual {p1}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getData()[B

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized sendMutualAuth([B[B[BLjavax/crypto/SecretKey;Ljavax/crypto/SecretKey;)[B
    .locals 22
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    const-string v6, "Cryptogram wrong length, was expecting 32, found "

    const-string v7, "Mutual authentication failed: expected length: 40 + 2, actual length: "

    const-string v8, "Cryptogram wrong length "

    monitor-enter p0

    if-eqz v0, :cond_c

    .line 109
    :try_start_0
    array-length v9, v0

    const/16 v10, 0x8

    if-ne v9, v10, :cond_c

    if-eqz v2, :cond_0

    .line 112
    array-length v9, v2

    if-eq v9, v10, :cond_1

    .line 113
    :cond_0
    new-array v2, v10, [B

    :cond_1
    if-eqz v3, :cond_b

    .line 115
    array-length v9, v3

    const/16 v11, 0x10

    if-ne v9, v11, :cond_b

    if-eqz v4, :cond_a

    if-eqz v5, :cond_9

    .line 125
    iget-object v9, v1, Lorg/jmrtd/protocol/BACAPDUSender;->cipher:Ljavax/crypto/Cipher;

    sget-object v12, Lorg/jmrtd/protocol/BACAPDUSender;->ZERO_IV_PARAM_SPEC:Ljavax/crypto/spec/IvParameterSpec;

    const/4 v13, 0x1

    invoke-virtual {v9, v13, v4, v12}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    const/16 v9, 0x20

    .line 126
    new-array v13, v9, [B

    const/4 v14, 0x0

    .line 127
    invoke-static {v0, v14, v13, v14, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 128
    invoke-static {v2, v14, v13, v10, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 129
    invoke-static {v3, v14, v13, v11, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 130
    iget-object v0, v1, Lorg/jmrtd/protocol/BACAPDUSender;->cipher:Ljavax/crypto/Cipher;

    invoke-virtual {v0, v13}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    .line 131
    array-length v2, v0

    if-ne v2, v9, :cond_8

    .line 135
    iget-object v2, v1, Lorg/jmrtd/protocol/BACAPDUSender;->mac:Ljavax/crypto/Mac;

    invoke-virtual {v2, v5}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 136
    iget-object v2, v1, Lorg/jmrtd/protocol/BACAPDUSender;->mac:Ljavax/crypto/Mac;

    invoke-static {v0, v10}, Lorg/jmrtd/Util;->pad([BI)[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljavax/crypto/Mac;->doFinal([B)[B

    move-result-object v2

    .line 137
    array-length v3, v2

    if-ne v3, v10, :cond_7

    const/16 v3, 0x28

    .line 144
    new-array v3, v3, [B

    .line 145
    invoke-static {v0, v14, v3, v14, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 146
    invoke-static {v2, v14, v3, v9, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 148
    new-instance v15, Lnet/sf/scuba/smartcards/CommandAPDU;

    const/16 v16, 0x0

    const/16 v17, -0x7e

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x28

    move-object/from16 v20, v3

    invoke-direct/range {v15 .. v21}, Lnet/sf/scuba/smartcards/CommandAPDU;-><init>(IIII[BI)V

    .line 149
    iget-object v0, v1, Lorg/jmrtd/protocol/BACAPDUSender;->service:Lnet/sf/scuba/smartcards/CardService;

    invoke-virtual {v0, v15}, Lnet/sf/scuba/smartcards/CardService;->transmit(Lnet/sf/scuba/smartcards/CommandAPDU;)Lnet/sf/scuba/smartcards/ResponseAPDU;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 155
    invoke-virtual {v0}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getBytes()[B

    move-result-object v2

    .line 156
    invoke-virtual {v0}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getSW()I

    move-result v0

    int-to-short v0, v0

    if-eqz v2, :cond_5

    const/16 v3, -0x7000

    if-eq v0, v3, :cond_2

    .line 164
    new-instance v15, Lnet/sf/scuba/smartcards/CommandAPDU;

    const/16 v16, 0x0

    const/16 v17, -0x7e

    const/16 v21, 0x0

    invoke-direct/range {v15 .. v21}, Lnet/sf/scuba/smartcards/CommandAPDU;-><init>(IIII[BI)V

    .line 165
    iget-object v0, v1, Lorg/jmrtd/protocol/BACAPDUSender;->service:Lnet/sf/scuba/smartcards/CardService;

    invoke-virtual {v0, v15}, Lnet/sf/scuba/smartcards/CardService;->transmit(Lnet/sf/scuba/smartcards/CommandAPDU;)Lnet/sf/scuba/smartcards/ResponseAPDU;

    move-result-object v0

    .line 166
    invoke-virtual {v0}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getBytes()[B

    move-result-object v2

    .line 167
    invoke-virtual {v0}, Lnet/sf/scuba/smartcards/ResponseAPDU;->getSW()I

    move-result v0

    int-to-short v0, v0

    .line 170
    :cond_2
    array-length v3, v2

    const/16 v5, 0x2a

    if-ne v3, v5, :cond_4

    .line 175
    iget-object v3, v1, Lorg/jmrtd/protocol/BACAPDUSender;->cipher:Ljavax/crypto/Cipher;

    const/4 v5, 0x2

    invoke-virtual {v3, v5, v4, v12}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 176
    iget-object v3, v1, Lorg/jmrtd/protocol/BACAPDUSender;->cipher:Ljavax/crypto/Cipher;

    array-length v4, v2

    add-int/lit8 v4, v4, -0xa

    invoke-virtual {v3, v2, v14, v4}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    move-result-object v2

    .line 177
    array-length v3, v2
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v3, v9, :cond_3

    .line 182
    monitor-exit p0

    return-object v2

    .line 179
    :cond_3
    :try_start_1
    new-instance v3, Lnet/sf/scuba/smartcards/CardServiceException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v2, v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2, v0}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;I)V

    throw v3

    .line 171
    :cond_4
    new-instance v3, Lorg/jmrtd/AccessDeniedException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v2, v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2, v0}, Lorg/jmrtd/AccessDeniedException;-><init>(Ljava/lang/String;I)V

    throw v3

    .line 158
    :cond_5
    new-instance v2, Lnet/sf/scuba/smartcards/CardServiceException;

    const-string v3, "Mutual authentication failed, received empty data in response APDU"

    invoke-direct {v2, v3, v0}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;I)V

    throw v2

    .line 152
    :cond_6
    new-instance v0, Lnet/sf/scuba/smartcards/CardServiceException;

    const-string v2, "Mutual authentication failed, received null response APDU"

    invoke-direct {v0, v2}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 138
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "MAC wrong length"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 132
    :cond_8
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length v0, v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 122
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "kMac == null"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 119
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "kEnc == null"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 116
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "kIFD wrong length"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 110
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "rndIFD wrong length"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 185
    :try_start_2
    new-instance v2, Lnet/sf/scuba/smartcards/CardServiceException;

    const-string v3, "Security exception during mutual auth"

    invoke-direct {v2, v3, v0}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method
