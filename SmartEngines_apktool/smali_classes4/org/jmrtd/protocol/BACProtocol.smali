.class public Lorg/jmrtd/protocol/BACProtocol;
.super Ljava/lang/Object;
.source "BACProtocol.java"


# instance fields
.field private maxTranceiveLength:I

.field private random:Ljava/util/Random;

.field private service:Lorg/jmrtd/APDULevelBACCapable;

.field private shouldCheckMAC:Z


# direct methods
.method public constructor <init>(Lorg/jmrtd/APDULevelBACCapable;IZ)V
    .locals 0

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, Lorg/jmrtd/protocol/BACProtocol;->service:Lorg/jmrtd/APDULevelBACCapable;

    .line 68
    iput p2, p0, Lorg/jmrtd/protocol/BACProtocol;->maxTranceiveLength:I

    .line 69
    iput-boolean p3, p0, Lorg/jmrtd/protocol/BACProtocol;->shouldCheckMAC:Z

    .line 70
    new-instance p1, Ljava/security/SecureRandom;

    invoke-direct {p1}, Ljava/security/SecureRandom;-><init>()V

    iput-object p1, p0, Lorg/jmrtd/protocol/BACProtocol;->random:Ljava/util/Random;

    return-void
.end method

.method private static computeKeySeedForBAC(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 215
    const-string v0, "SHA-1"

    const/4 v1, 0x1

    invoke-static {p0, p1, p2, v0, v1}, Lorg/jmrtd/Util;->computeKeySeed(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)[B

    move-result-object p0

    return-object p0
.end method

.method public static computeKeySeedForBAC(Lorg/jmrtd/BACKeySpec;)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 157
    invoke-interface {p0}, Lorg/jmrtd/BACKeySpec;->getDocumentNumber()Ljava/lang/String;

    move-result-object v0

    .line 158
    invoke-interface {p0}, Lorg/jmrtd/BACKeySpec;->getDateOfBirth()Ljava/lang/String;

    move-result-object v1

    .line 159
    invoke-interface {p0}, Lorg/jmrtd/BACKeySpec;->getDateOfExpiry()Ljava/lang/String;

    move-result-object p0

    if-eqz v1, :cond_2

    .line 161
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x6

    if-ne v2, v3, :cond_2

    if-eqz p0, :cond_1

    .line 164
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ne v2, v3, :cond_1

    if-eqz v0, :cond_0

    .line 171
    invoke-static {v0}, Lorg/jmrtd/protocol/BACProtocol;->fixDocumentNumber(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 173
    invoke-static {v0, v1, p0}, Lorg/jmrtd/protocol/BACProtocol;->computeKeySeedForBAC(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p0

    return-object p0

    .line 168
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong document number. Found "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 165
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Wrong date format used for date of expiry. Expected yyMMdd, found "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 162
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Wrong date format used for date of birth. Expected yyMMdd, found "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static computeSendSequenceCounter([B[B)J
    .locals 7

    if-eqz p0, :cond_2

    .line 186
    array-length v0, p0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    if-eqz p1, :cond_2

    array-length v0, p1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x4

    const-wide/16 v2, 0x0

    move v4, v0

    :goto_0
    if-ge v4, v1, :cond_0

    shl-long/2addr v2, v1

    .line 193
    aget-byte v5, p0, v4

    and-int/lit16 v5, v5, 0xff

    int-to-long v5, v5

    add-long/2addr v2, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-ge v0, v1, :cond_1

    shl-long/2addr v2, v1

    .line 197
    aget-byte p0, p1, v0

    and-int/lit16 p0, p0, 0xff

    int-to-long v4, p0

    add-long/2addr v2, v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-wide v2

    .line 188
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Wrong length input"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private doBACStep(Ljavax/crypto/SecretKey;Ljavax/crypto/SecretKey;)Lorg/jmrtd/protocol/SecureMessagingWrapper;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;,
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 127
    iget-object v0, p0, Lorg/jmrtd/protocol/BACProtocol;->service:Lorg/jmrtd/APDULevelBACCapable;

    invoke-interface {v0}, Lorg/jmrtd/APDULevelBACCapable;->sendGetChallenge()[B

    move-result-object v3

    const/16 v0, 0x8

    .line 128
    new-array v2, v0, [B

    .line 129
    iget-object v0, p0, Lorg/jmrtd/protocol/BACProtocol;->random:Ljava/util/Random;

    invoke-virtual {v0, v2}, Ljava/util/Random;->nextBytes([B)V

    const/16 v0, 0x10

    .line 130
    new-array v4, v0, [B

    .line 131
    iget-object v1, p0, Lorg/jmrtd/protocol/BACProtocol;->random:Ljava/util/Random;

    invoke-virtual {v1, v4}, Ljava/util/Random;->nextBytes([B)V

    .line 132
    iget-object v1, p0, Lorg/jmrtd/protocol/BACProtocol;->service:Lorg/jmrtd/APDULevelBACCapable;

    move-object v5, p1

    move-object v6, p2

    invoke-interface/range {v1 .. v6}, Lorg/jmrtd/APDULevelBACCapable;->sendMutualAuth([B[B[BLjavax/crypto/SecretKey;Ljavax/crypto/SecretKey;)[B

    move-result-object p1

    .line 133
    new-array p2, v0, [B

    const/4 v1, 0x0

    .line 134
    invoke-static {p1, v0, p2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 136
    new-array p1, v0, [B

    :goto_0
    if-ge v1, v0, :cond_0

    .line 138
    aget-byte v5, v4, v1

    and-int/lit16 v5, v5, 0xff

    aget-byte v6, p2, v1

    and-int/lit16 v6, v6, 0xff

    xor-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x1

    .line 140
    invoke-static {p1, p2}, Lorg/jmrtd/Util;->deriveKey([BI)Ljavax/crypto/SecretKey;

    move-result-object v5

    const/4 p2, 0x2

    .line 141
    invoke-static {p1, p2}, Lorg/jmrtd/Util;->deriveKey([BI)Ljavax/crypto/SecretKey;

    move-result-object v6

    .line 142
    invoke-static {v3, v2}, Lorg/jmrtd/protocol/BACProtocol;->computeSendSequenceCounter([B[B)J

    move-result-wide v9

    .line 144
    new-instance v4, Lorg/jmrtd/protocol/DESedeSecureMessagingWrapper;

    iget v7, p0, Lorg/jmrtd/protocol/BACProtocol;->maxTranceiveLength:I

    iget-boolean v8, p0, Lorg/jmrtd/protocol/BACProtocol;->shouldCheckMAC:Z

    invoke-direct/range {v4 .. v10}, Lorg/jmrtd/protocol/DESedeSecureMessagingWrapper;-><init>(Ljavax/crypto/SecretKey;Ljavax/crypto/SecretKey;IZJ)V

    return-object v4
.end method

.method private static fixDocumentNumber(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 226
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x3c

    if-nez p0, :cond_0

    const-string p0, ""

    goto :goto_0

    :cond_0
    const/16 v2, 0x20

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    :goto_0
    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 227
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    const/16 v2, 0x9

    if-ge p0, v2, :cond_1

    .line 228
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 230
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public doBAC(Ljavax/crypto/SecretKey;Ljavax/crypto/SecretKey;)Lorg/jmrtd/protocol/BACResult;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;,
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 112
    new-instance v0, Lorg/jmrtd/protocol/BACResult;

    invoke-direct {p0, p1, p2}, Lorg/jmrtd/protocol/BACProtocol;->doBACStep(Ljavax/crypto/SecretKey;Ljavax/crypto/SecretKey;)Lorg/jmrtd/protocol/SecureMessagingWrapper;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/jmrtd/protocol/BACResult;-><init>(Lorg/jmrtd/protocol/SecureMessagingWrapper;)V

    return-object v0
.end method

.method public doBAC(Lorg/jmrtd/AccessKeySpec;)Lorg/jmrtd/protocol/BACResult;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lnet/sf/scuba/smartcards/CardServiceException;
        }
    .end annotation

    .line 86
    :try_start_0
    invoke-interface {p1}, Lorg/jmrtd/AccessKeySpec;->getKey()[B

    move-result-object v0

    const/4 v1, 0x1

    .line 87
    invoke-static {v0, v1}, Lorg/jmrtd/Util;->deriveKey([BI)Ljavax/crypto/SecretKey;

    move-result-object v1

    const/4 v2, 0x2

    .line 88
    invoke-static {v0, v2}, Lorg/jmrtd/Util;->deriveKey([BI)Ljavax/crypto/SecretKey;

    move-result-object v0

    .line 90
    invoke-direct {p0, v1, v0}, Lorg/jmrtd/protocol/BACProtocol;->doBACStep(Ljavax/crypto/SecretKey;Ljavax/crypto/SecretKey;)Lorg/jmrtd/protocol/SecureMessagingWrapper;

    move-result-object v0

    .line 91
    new-instance v1, Lorg/jmrtd/protocol/BACResult;

    invoke-direct {v1, p1, v0}, Lorg/jmrtd/protocol/BACResult;-><init>(Lorg/jmrtd/AccessKeySpec;Lorg/jmrtd/protocol/SecureMessagingWrapper;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p1

    .line 93
    new-instance v0, Lnet/sf/scuba/smartcards/CardServiceException;

    const-string v1, "Error during BAC"

    invoke-direct {v0, v1, p1}, Lnet/sf/scuba/smartcards/CardServiceException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
