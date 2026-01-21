.class public final Lorg/jmrtd/Util;
.super Ljava/lang/Object;
.source "Util.java"


# static fields
.field private static final BC_PROVIDER:Ljava/security/Provider;

.field public static final ENC_MODE:I = 0x1

.field private static final LOGGER:Ljava/util/logging/Logger;

.field public static final MAC_MODE:I = 0x2

.field public static final PACE_MODE:I = 0x3


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 108
    const-string v0, "org.jmrtd"

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lorg/jmrtd/Util;->LOGGER:Ljava/util/logging/Logger;

    .line 115
    new-instance v0, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;

    invoke-direct {v0}, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;-><init>()V

    sput-object v0, Lorg/jmrtd/Util;->BC_PROVIDER:Ljava/security/Provider;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static add(Ljava/security/spec/ECPoint;Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)Ljava/security/spec/ECPoint;
    .locals 0

    .line 1066
    invoke-static {p0, p2}, Lorg/jmrtd/Util;->toBouncyCastleECPoint(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p0

    .line 1067
    invoke-static {p1, p2}, Lorg/jmrtd/Util;->toBouncyCastleECPoint(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p1

    .line 1068
    invoke-virtual {p0, p1}, Lorg/bouncycastle/math/ec/ECPoint;->add(Lorg/bouncycastle/math/ec/ECPoint;)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p0

    .line 1069
    invoke-static {p0}, Lorg/jmrtd/Util;->fromBouncyCastleECPoint(Lorg/bouncycastle/math/ec/ECPoint;)Ljava/security/spec/ECPoint;

    move-result-object p0

    return-object p0
.end method

.method public static alignKeyDataToSize([BI)[B
    .locals 3

    .line 474
    new-array v0, p1, [B

    .line 475
    array-length v1, p0

    if-ge v1, p1, :cond_0

    .line 476
    array-length v1, p0

    goto :goto_0

    :cond_0
    move v1, p1

    .line 478
    :goto_0
    array-length v2, p0

    sub-int/2addr v2, v1

    sub-int/2addr p1, v1

    invoke-static {p0, v2, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public static computeAffineY(Ljava/math/BigInteger;Ljava/security/spec/ECParameterSpec;)Ljava/math/BigInteger;
    .locals 2

    .line 1184
    invoke-static {p1}, Lorg/jmrtd/Util;->toBouncyCastleECCurve(Ljava/security/spec/ECParameterSpec;)Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object p1

    .line 1185
    invoke-virtual {p1}, Lorg/bouncycastle/math/ec/ECCurve;->getA()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v0

    .line 1186
    invoke-virtual {p1}, Lorg/bouncycastle/math/ec/ECCurve;->getB()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v1

    .line 1187
    invoke-virtual {p1, p0}, Lorg/bouncycastle/math/ec/ECCurve;->fromBigInteger(Ljava/math/BigInteger;)Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object p0

    .line 1188
    invoke-virtual {p0, p0}, Lorg/bouncycastle/math/ec/ECFieldElement;->multiply(Lorg/bouncycastle/math/ec/ECFieldElement;)Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object p1

    invoke-virtual {p1, v0}, Lorg/bouncycastle/math/ec/ECFieldElement;->add(Lorg/bouncycastle/math/ec/ECFieldElement;)Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object p1

    invoke-virtual {p1, p0}, Lorg/bouncycastle/math/ec/ECFieldElement;->multiply(Lorg/bouncycastle/math/ec/ECFieldElement;)Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object p0

    invoke-virtual {p0, v1}, Lorg/bouncycastle/math/ec/ECFieldElement;->add(Lorg/bouncycastle/math/ec/ECFieldElement;)Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object p0

    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECFieldElement;->sqrt()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object p0

    .line 1190
    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECFieldElement;->toBigInteger()Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method

.method public static computeKeySeed(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 259
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 260
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 261
    invoke-static {p0}, Lorg/jmrtd/lds/icao/MRZInfo;->checkDigit(Ljava/lang/String;)C

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 262
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 263
    invoke-static {p1}, Lorg/jmrtd/lds/icao/MRZInfo;->checkDigit(Ljava/lang/String;)C

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 264
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 265
    invoke-static {p2}, Lorg/jmrtd/lds/icao/MRZInfo;->checkDigit(Ljava/lang/String;)C

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object p0

    .line 266
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 268
    invoke-static {p0, p3, p4}, Lorg/jmrtd/Util;->computeKeySeed(Ljava/lang/String;Ljava/lang/String;Z)[B

    move-result-object p0

    return-object p0
.end method

.method public static computeKeySeed(Ljava/lang/String;Ljava/lang/String;Z)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 284
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p1

    .line 286
    invoke-static {p0}, Lorg/jmrtd/Util;->getBytes(Ljava/lang/String;)[B

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/security/MessageDigest;->update([B)V

    .line 288
    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    if-eqz p2, :cond_0

    const/16 p1, 0x10

    .line 291
    new-array p2, p1, [B

    const/4 v0, 0x0

    .line 292
    invoke-static {p0, v0, p2, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p2

    :cond_0
    return-object p0
.end method

.method public static deriveKey([BI)Ljavax/crypto/SecretKey;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 144
    const-string v0, "DESede"

    const/16 v1, 0x80

    invoke-static {p0, v0, v1, p1}, Lorg/jmrtd/Util;->deriveKey([BLjava/lang/String;II)Ljavax/crypto/SecretKey;

    move-result-object p0

    return-object p0
.end method

.method public static deriveKey([BLjava/lang/String;II)Ljavax/crypto/SecretKey;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 160
    invoke-static {p0, p1, p2, v0, p3}, Lorg/jmrtd/Util;->deriveKey([BLjava/lang/String;I[BI)Ljavax/crypto/SecretKey;

    move-result-object p0

    return-object p0
.end method

.method public static deriveKey([BLjava/lang/String;I[BI)Ljavax/crypto/SecretKey;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    .line 177
    invoke-static/range {v0 .. v5}, Lorg/jmrtd/Util;->deriveKey([BLjava/lang/String;I[BIB)Ljavax/crypto/SecretKey;

    move-result-object p0

    return-object p0
.end method

.method public static deriveKey([BLjava/lang/String;I[BIB)Ljavax/crypto/SecretKey;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 195
    invoke-static {p1, p2}, Lorg/jmrtd/Util;->inferDigestAlgorithmFromCipherAlgorithmForKeyDerivation(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    .line 196
    invoke-static {v0}, Lorg/jmrtd/Util;->getMessageDigest(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    .line 197
    invoke-virtual {v0}, Ljava/security/MessageDigest;->reset()V

    .line 198
    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->update([B)V

    if-eqz p3, :cond_0

    .line 200
    invoke-virtual {v0, p3}, Ljava/security/MessageDigest;->update([B)V

    :cond_0
    int-to-byte p0, p4

    const/4 p3, 0x4

    .line 202
    new-array p3, p3, [B

    const/4 p4, 0x0

    aput-byte p4, p3, p4

    const/4 v1, 0x1

    aput-byte p4, p3, v1

    const/4 v1, 0x2

    aput-byte p4, p3, v1

    const/4 v1, 0x3

    aput-byte p0, p3, v1

    invoke-virtual {v0, p3}, Ljava/security/MessageDigest;->update([B)V

    .line 203
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    .line 205
    const-string p3, "DESede"

    invoke-virtual {p3, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p3

    const/16 v0, 0x80

    const/16 v1, 0x10

    const/16 v2, 0x18

    if-nez p3, :cond_7

    const-string p3, "3DES"

    invoke-virtual {p3, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_1

    goto :goto_1

    .line 218
    :cond_1
    const-string p3, "AES"

    invoke-virtual {p3, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {p1, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    goto :goto_4

    :cond_3
    :goto_0
    if-eq p2, v0, :cond_6

    const/16 p3, 0xc0

    if-eq p2, p3, :cond_5

    const/16 p3, 0x100

    if-ne p2, p3, :cond_4

    const/16 p2, 0x20

    .line 230
    new-array p3, p2, [B

    .line 231
    invoke-static {p0, p4, p3, p4, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p0, p3

    goto :goto_4

    .line 234
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "KDF can only use AES with 128-bit, 192-bit key or 256-bit length, found: "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, "-bit key length"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 226
    :cond_5
    new-array p2, v2, [B

    .line 227
    invoke-static {p0, p4, p2, p4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_3

    .line 222
    :cond_6
    new-array p2, v1, [B

    .line 223
    invoke-static {p0, p4, p2, p4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_3

    :cond_7
    :goto_1
    const/16 p3, 0x70

    if-eq p2, p3, :cond_9

    if-ne p2, v0, :cond_8

    goto :goto_2

    .line 216
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "KDF can only use DESede with 128-bit key length"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 210
    :cond_9
    :goto_2
    new-array p2, v2, [B

    const/16 p3, 0x8

    .line 211
    invoke-static {p0, p4, p2, p4, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 212
    invoke-static {p0, p3, p2, p3, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 213
    invoke-static {p0, p4, p2, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_3
    move-object p0, p2

    :goto_4
    if-nez p5, :cond_a

    .line 239
    new-instance p2, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {p2, p0, p1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    return-object p2

    .line 241
    :cond_a
    new-instance p2, Lorg/jmrtd/PACESecretKeySpec;

    invoke-direct {p2, p0, p1, p5}, Lorg/jmrtd/PACESecretKeySpec;-><init>([BLjava/lang/String;B)V

    return-object p2
.end method

.method public static ecPoint2OS(Ljava/security/spec/ECPoint;I)[B
    .locals 6

    .line 1024
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 1025
    invoke-virtual {p0}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    move-result-object v1

    .line 1026
    invoke-virtual {p0}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    move-result-object p0

    const/4 v2, 0x4

    .line 1028
    :try_start_0
    invoke-virtual {v0, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    int-to-double v2, p1

    const-wide/high16 v4, 0x4020000000000000L    # 8.0

    div-double/2addr v2, v4

    .line 1029
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int p1, v4

    invoke-static {v1, p1}, Lorg/jmrtd/Util;->i2os(Ljava/math/BigInteger;I)[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 1030
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int p1, v1

    invoke-static {p0, p1}, Lorg/jmrtd/Util;->i2os(Ljava/math/BigInteger;I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 1031
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1035
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    .line 1033
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Exception"

    invoke-direct {p1, v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static fromBouncyCastleECPoint(Lorg/bouncycastle/math/ec/ECPoint;)Ljava/security/spec/ECPoint;
    .locals 2

    .line 1214
    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECPoint;->normalize()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p0

    .line 1215
    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECPoint;->isValid()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1216
    sget-object v0, Lorg/jmrtd/Util;->LOGGER:Ljava/util/logging/Logger;

    const-string v1, "point not valid"

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 1218
    :cond_0
    new-instance v0, Ljava/security/spec/ECPoint;

    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECPoint;->getAffineXCoord()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v1

    invoke-virtual {v1}, Lorg/bouncycastle/math/ec/ECFieldElement;->toBigInteger()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECPoint;->getAffineYCoord()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object p0

    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECFieldElement;->toBigInteger()Ljava/math/BigInteger;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    return-object v0
.end method

.method public static getBouncyCastleProvider()Ljava/security/Provider;
    .locals 1

    .line 130
    sget-object v0, Lorg/jmrtd/Util;->BC_PROVIDER:Ljava/security/Provider;

    return-object v0
.end method

.method public static getBytes(Ljava/lang/String;)[B
    .locals 4

    .line 1118
    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    .line 1120
    :try_start_0
    const-string v1, "UTF-8"

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 1123
    sget-object v1, Lorg/jmrtd/Util;->LOGGER:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v3, "Exception"

    invoke-virtual {v1, v2, v3, p0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static getCertificateFactory(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1524
    :try_start_0
    invoke-static {p0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    .line 1526
    sget-object v1, Lorg/jmrtd/Util;->LOGGER:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v3, "Default provider could not provide this Certificate Factory, falling back ot explicit BC"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1527
    sget-object v0, Lorg/jmrtd/Util;->BC_PROVIDER:Ljava/security/Provider;

    invoke-static {p0, v0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/cert/CertificateFactory;

    move-result-object p0

    return-object p0
.end method

.method public static getCipher(Ljava/lang/String;)Ljavax/crypto/Cipher;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1329
    :try_start_0
    invoke-static {p0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    .line 1331
    sget-object v1, Lorg/jmrtd/Util;->LOGGER:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v3, "Default provider could not provide this cipher, falling back to explicit BC"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1332
    sget-object v0, Lorg/jmrtd/Util;->BC_PROVIDER:Ljava/security/Provider;

    invoke-static {p0, v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Cipher;

    move-result-object p0

    return-object p0
.end method

.method public static getCipher(Ljava/lang/String;ILjava/security/Key;)Ljavax/crypto/Cipher;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1352
    :try_start_0
    invoke-static {p0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    .line 1353
    invoke-virtual {v0, p1, p2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 1356
    sget-object v1, Lorg/jmrtd/Util;->LOGGER:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v3, "Default provider could not provide this Cipher, falling back to explicit BC"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1357
    sget-object v0, Lorg/jmrtd/Util;->BC_PROVIDER:Ljava/security/Provider;

    invoke-static {p0, v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Cipher;

    move-result-object p0

    .line 1358
    invoke-virtual {p0, p1, p2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    return-object p0
.end method

.method public static getCurveName(Ljava/security/spec/ECParameterSpec;)Ljava/lang/String;
    .locals 0

    .line 733
    invoke-static {p0}, Lorg/jmrtd/Util;->toNamedCurveSpec(Ljava/security/spec/ECParameterSpec;)Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 738
    :cond_0
    invoke-virtual {p0}, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getDetailedPrivateKeyAlgorithm(Ljava/security/PrivateKey;)Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    .line 706
    const-string p0, "null"

    return-object p0

    .line 709
    :cond_0
    invoke-interface {p0}, Ljava/security/PrivateKey;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    .line 710
    instance-of v1, p0, Ljava/security/interfaces/RSAPrivateKey;

    const-string v2, " ["

    if-eqz v1, :cond_1

    .line 711
    check-cast p0, Ljava/security/interfaces/RSAPrivateKey;

    .line 712
    invoke-interface {p0}, Ljava/security/interfaces/RSAPrivateKey;->getModulus()Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I

    move-result p0

    .line 713
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v0, " bit]"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 714
    :cond_1
    instance-of v1, p0, Ljava/security/interfaces/ECPrivateKey;

    if-eqz v1, :cond_2

    .line 715
    check-cast p0, Ljava/security/interfaces/ECPrivateKey;

    .line 716
    invoke-interface {p0}, Ljava/security/interfaces/ECPrivateKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object p0

    .line 717
    invoke-static {p0}, Lorg/jmrtd/Util;->getCurveName(Ljava/security/spec/ECParameterSpec;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 719
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v0, "]"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0
.end method

.method public static getDetailedPublicKeyAlgorithm(Ljava/security/PublicKey;)Ljava/lang/String;
    .locals 5

    if-nez p0, :cond_0

    .line 669
    const-string p0, "null"

    return-object p0

    .line 672
    :cond_0
    invoke-interface {p0}, Ljava/security/PublicKey;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    .line 673
    instance-of v1, p0, Ljava/security/interfaces/RSAPublicKey;

    const-string v2, " ["

    if-eqz v1, :cond_1

    .line 674
    check-cast p0, Ljava/security/interfaces/RSAPublicKey;

    .line 675
    invoke-interface {p0}, Ljava/security/interfaces/RSAPublicKey;->getModulus()Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I

    move-result p0

    .line 676
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v0, " bit]"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 677
    :cond_1
    instance-of v1, p0, Ljava/security/interfaces/ECPublicKey;

    const-string v3, "]"

    if-eqz v1, :cond_2

    .line 678
    check-cast p0, Ljava/security/interfaces/ECPublicKey;

    .line 679
    invoke-interface {p0}, Ljava/security/interfaces/ECPublicKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object p0

    .line 680
    invoke-static {p0}, Lorg/jmrtd/Util;->getCurveName(Ljava/security/spec/ECParameterSpec;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_3

    .line 682
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 684
    :cond_2
    instance-of v1, p0, Ljavax/crypto/interfaces/DHPublicKey;

    if-eqz v1, :cond_3

    .line 685
    check-cast p0, Ljavax/crypto/interfaces/DHPublicKey;

    .line 686
    invoke-interface {p0}, Ljavax/crypto/interfaces/DHPublicKey;->getY()Ljava/math/BigInteger;

    .line 687
    invoke-interface {p0}, Ljavax/crypto/interfaces/DHPublicKey;->getParams()Ljavax/crypto/spec/DHParameterSpec;

    move-result-object p0

    .line 688
    invoke-virtual {p0}, Ljavax/crypto/spec/DHParameterSpec;->getG()Ljava/math/BigInteger;

    move-result-object v1

    .line 689
    invoke-virtual {p0}, Ljavax/crypto/spec/DHParameterSpec;->getL()I

    move-result v2

    .line 690
    invoke-virtual {p0}, Ljavax/crypto/spec/DHParameterSpec;->getP()Ljava/math/BigInteger;

    move-result-object p0

    .line 691
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, " [p.length = "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v0, ", g.length = "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {v1}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v0, ", l = "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    return-object v0
.end method

.method public static getKeyAgreement(Ljava/lang/String;)Ljavax/crypto/KeyAgreement;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1376
    :try_start_0
    invoke-static {p0}, Ljavax/crypto/KeyAgreement;->getInstance(Ljava/lang/String;)Ljavax/crypto/KeyAgreement;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    .line 1378
    sget-object v1, Lorg/jmrtd/Util;->LOGGER:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v3, "Default provider could not provide this Key Agreement, falling back to explicit BC"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1379
    sget-object v0, Lorg/jmrtd/Util;->BC_PROVIDER:Ljava/security/Provider;

    invoke-static {p0, v0}, Ljavax/crypto/KeyAgreement;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/KeyAgreement;

    move-result-object p0

    return-object p0
.end method

.method public static getKeyPairGenerator(Ljava/lang/String;)Ljava/security/KeyPairGenerator;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1396
    :try_start_0
    invoke-static {p0}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    .line 1398
    sget-object v1, Lorg/jmrtd/Util;->LOGGER:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v3, "Default provider could not provide this Key Pair Generator, falling back to explicit BC"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1399
    sget-object v0, Lorg/jmrtd/Util;->BC_PROVIDER:Ljava/security/Provider;

    invoke-static {p0, v0}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyPairGenerator;

    move-result-object p0

    return-object p0
.end method

.method public static getMac(Ljava/lang/String;)Ljavax/crypto/Mac;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1416
    :try_start_0
    invoke-static {p0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    .line 1418
    sget-object v1, Lorg/jmrtd/Util;->LOGGER:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v3, "Default provider could not provide this Mac, falling back to explicit BC"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1419
    sget-object v0, Lorg/jmrtd/Util;->BC_PROVIDER:Ljava/security/Provider;

    invoke-static {p0, v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Mac;

    move-result-object p0

    return-object p0
.end method

.method public static getMac(Ljava/lang/String;Ljava/security/Key;)Ljavax/crypto/Mac;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1437
    :try_start_0
    invoke-static {p0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;)Ljavax/crypto/Mac;

    move-result-object v0

    .line 1438
    invoke-virtual {v0, p1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 1441
    sget-object v1, Lorg/jmrtd/Util;->LOGGER:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v3, "Default provider could not provide this Mac, falling back to explicit BC"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1442
    sget-object v0, Lorg/jmrtd/Util;->BC_PROVIDER:Ljava/security/Provider;

    invoke-static {p0, v0}, Ljavax/crypto/Mac;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/Mac;

    move-result-object p0

    .line 1443
    invoke-virtual {p0, p1}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    return-object p0
.end method

.method public static getMessageDigest(Ljava/lang/String;)Ljava/security/MessageDigest;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1461
    :try_start_0
    invoke-static {p0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    .line 1463
    sget-object v1, Lorg/jmrtd/Util;->LOGGER:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v3, "Default provider could not provide this Message Digest, falling back to explicit BC"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1464
    sget-object v0, Lorg/jmrtd/Util;->BC_PROVIDER:Ljava/security/Provider;

    invoke-static {p0, v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/MessageDigest;

    move-result-object p0

    return-object p0
.end method

.method public static getPrime(Ljava/security/spec/AlgorithmParameterSpec;)Ljava/math/BigInteger;
    .locals 3

    if-eqz p0, :cond_3

    .line 1143
    instance-of v0, p0, Ljavax/crypto/spec/DHParameterSpec;

    if-eqz v0, :cond_0

    .line 1144
    check-cast p0, Ljavax/crypto/spec/DHParameterSpec;

    invoke-virtual {p0}, Ljavax/crypto/spec/DHParameterSpec;->getP()Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    .line 1145
    :cond_0
    instance-of v0, p0, Ljava/security/spec/ECParameterSpec;

    if-eqz v0, :cond_2

    .line 1146
    check-cast p0, Ljava/security/spec/ECParameterSpec;

    invoke-virtual {p0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object p0

    .line 1147
    invoke-virtual {p0}, Ljava/security/spec/EllipticCurve;->getField()Ljava/security/spec/ECField;

    move-result-object p0

    .line 1148
    instance-of v0, p0, Ljava/security/spec/ECFieldFp;

    if-eqz v0, :cond_1

    .line 1151
    check-cast p0, Ljava/security/spec/ECFieldFp;

    invoke-virtual {p0}, Ljava/security/spec/ECFieldFp;->getP()Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    .line 1149
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Was expecting prime field of type ECFieldFp, found "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1153
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported agreement algorithm, was expecting DHParameterSpec or ECParameterSpec, found "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1140
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Parameters null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static getPublicKey(Ljava/lang/String;Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1483
    :try_start_0
    invoke-static {p0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v0

    .line 1484
    invoke-virtual {v0, p1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    .line 1486
    sget-object v1, Lorg/jmrtd/Util;->LOGGER:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v3, "Default provider could not provide this Key Factory or Public Key, falling back to explicit BC"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1487
    sget-object v0, Lorg/jmrtd/Util;->BC_PROVIDER:Ljava/security/Provider;

    invoke-static {p0, v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyFactory;

    move-result-object p0

    .line 1488
    invoke-virtual {p0, p1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p0

    return-object p0
.end method

.method public static getRawECDSASignature([BI)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 445
    new-instance v0, Lorg/bouncycastle/asn1/ASN1InputStream;

    invoke-direct {v0, p0}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>([B)V

    .line 446
    new-instance p0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 448
    :try_start_0
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1InputStream;->readObject()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v1

    check-cast v1, Lorg/bouncycastle/asn1/ASN1Sequence;

    .line 449
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjects()Ljava/util/Enumeration;

    move-result-object v1

    .line 450
    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 451
    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/bouncycastle/asn1/ASN1Integer;

    .line 452
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1Integer;->getValue()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v2

    .line 453
    invoke-static {v2, p1}, Lorg/jmrtd/Util;->alignKeyDataToSize([BI)[B

    move-result-object v2

    .line 454
    invoke-virtual {p0, v2}, Ljava/io/ByteArrayOutputStream;->write([B)V

    goto :goto_0

    .line 456
    :cond_0
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->flush()V

    .line 457
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 459
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1InputStream;->close()V

    .line 460
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    .line 459
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1InputStream;->close()V

    .line 460
    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 461
    throw p1
.end method

.method public static getSignature(Ljava/lang/String;)Ljava/security/Signature;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1504
    :try_start_0
    invoke-static {p0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    .line 1506
    sget-object v1, Lorg/jmrtd/Util;->LOGGER:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v3, "Default provider could not provide this Signature, falling back to explicit BC"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1507
    sget-object v0, Lorg/jmrtd/Util;->BC_PROVIDER:Ljava/security/Provider;

    invoke-static {p0, v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/Signature;

    move-result-object p0

    return-object p0
.end method

.method public static i2os(Ljava/math/BigInteger;)[B
    .locals 2

    const/16 v0, 0x10

    .line 510
    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    .line 511
    rem-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    .line 514
    :cond_0
    div-int/lit8 v0, v0, 0x2

    .line 515
    invoke-static {p0, v0}, Lorg/jmrtd/Util;->i2os(Ljava/math/BigInteger;I)[B

    move-result-object p0

    return-object p0
.end method

.method public static i2os(Ljava/math/BigInteger;I)[B
    .locals 5

    const-wide/16 v0, 0x100

    .line 492
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    .line 493
    new-array v1, p1, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    .line 495
    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    .line 496
    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    add-int/lit8 v4, p1, -0x1

    sub-int/2addr v4, v2

    .line 497
    invoke-virtual {v3}, Ljava/math/BigInteger;->intValue()I

    move-result v3

    int-to-byte v3, v3

    aput-byte v3, v1, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public static inferDigestAlgorithmFromCipherAlgorithmForKeyDerivation(Ljava/lang/String;I)Ljava/lang/String;
    .locals 3

    if-eqz p0, :cond_7

    .line 622
    const-string v0, "DESede"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "SHA-1"

    if-nez v0, :cond_6

    const-string v0, "AES-128"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 625
    :cond_0
    const-string v0, "AES"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v2, 0x80

    if-ne p1, v2, :cond_1

    return-object v1

    .line 628
    :cond_1
    const-string v1, "AES-256"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "SHA-256"

    if-nez v1, :cond_5

    const-string v1, "AES-192"

    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    .line 631
    :cond_2
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v0, 0xc0

    if-eq p1, v0, :cond_3

    const/16 v0, 0x100

    if-ne p1, v0, :cond_4

    :cond_3
    return-object v2

    .line 635
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported cipher algorithm or key length \""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v1, "\", "

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_0
    return-object v2

    :cond_6
    :goto_1
    return-object v1

    .line 620
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static inferDigestAlgorithmFromSignatureAlgorithm(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_6

    .line 583
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    .line 584
    const-string v0, "WITH"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 585
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    .line 586
    aget-object p0, p0, v0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 589
    :goto_0
    const-string v0, "SHA1"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 590
    const-string p0, "SHA-1"

    return-object p0

    .line 592
    :cond_1
    const-string v0, "SHA224"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 593
    const-string p0, "SHA-224"

    return-object p0

    .line 595
    :cond_2
    const-string v0, "SHA256"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 596
    const-string p0, "SHA-256"

    return-object p0

    .line 598
    :cond_3
    const-string v0, "SHA384"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 599
    const-string p0, "SHA-384"

    return-object p0

    .line 601
    :cond_4
    const-string v0, "SHA512"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 602
    const-string p0, "SHA-512"

    :cond_5
    return-object p0

    .line 579
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static inferKeyAgreementAlgorithm(Ljava/security/PublicKey;)Ljava/lang/String;
    .locals 3

    .line 1166
    instance-of v0, p0, Ljava/security/interfaces/ECPublicKey;

    if-eqz v0, :cond_0

    .line 1167
    const-string p0, "ECDH"

    return-object p0

    .line 1168
    :cond_0
    instance-of v0, p0, Ljavax/crypto/interfaces/DHPublicKey;

    if-eqz v0, :cond_1

    .line 1169
    const-string p0, "DH"

    return-object p0

    .line 1171
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported public key: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static inferProtocolIdentifier(Ljava/security/PublicKey;)Ljava/lang/String;
    .locals 1

    .line 1046
    invoke-interface {p0}, Ljava/security/PublicKey;->getAlgorithm()Ljava/lang/String;

    move-result-object p0

    .line 1047
    const-string v0, "EC"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "ECDH"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1049
    :cond_0
    const-string v0, "DH"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 1050
    sget-object p0, Lorg/jmrtd/lds/SecurityInfo;->ID_PK_DH:Ljava/lang/String;

    return-object p0

    .line 1052
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong key type. Was expecting ECDH or DH public key."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1048
    :cond_2
    :goto_0
    sget-object p0, Lorg/jmrtd/lds/SecurityInfo;->ID_PK_ECDH:Ljava/lang/String;

    return-object p0
.end method

.method public static isPointOnCurve(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)Z
    .locals 4

    .line 1097
    invoke-virtual {p0}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    move-result-object v0

    .line 1098
    invoke-virtual {p0}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    move-result-object p0

    .line 1099
    invoke-static {p1}, Lorg/jmrtd/Util;->getPrime(Ljava/security/spec/AlgorithmParameterSpec;)Ljava/math/BigInteger;

    move-result-object v1

    .line 1101
    invoke-virtual {p1}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object p1

    .line 1102
    invoke-virtual {p1}, Ljava/security/spec/EllipticCurve;->getA()Ljava/math/BigInteger;

    move-result-object v2

    .line 1103
    invoke-virtual {p1}, Ljava/security/spec/EllipticCurve;->getB()Ljava/math/BigInteger;

    move-result-object p1

    .line 1104
    invoke-virtual {p0, p0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    .line 1105
    invoke-virtual {v0, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v2, v0}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    .line 1107
    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static isValid(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)Z
    .locals 0

    .line 1230
    invoke-static {p0, p1}, Lorg/jmrtd/Util;->toBouncyCastleECPoint(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p0

    .line 1231
    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECPoint;->isValid()Z

    move-result p0

    return p0
.end method

.method public static multiply(Ljava/math/BigInteger;Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)Ljava/security/spec/ECPoint;
    .locals 0

    .line 1082
    invoke-static {p1, p2}, Lorg/jmrtd/Util;->toBouncyCastleECPoint(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p1

    .line 1083
    invoke-virtual {p1, p0}, Lorg/bouncycastle/math/ec/ECPoint;->multiply(Ljava/math/BigInteger;)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p0

    .line 1084
    invoke-static {p0}, Lorg/jmrtd/Util;->fromBouncyCastleECPoint(Lorg/bouncycastle/math/ec/ECPoint;)Ljava/security/spec/ECPoint;

    move-result-object p0

    return-object p0
.end method

.method public static normalize(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)Ljava/security/spec/ECPoint;
    .locals 0

    .line 1243
    invoke-static {p0, p1}, Lorg/jmrtd/Util;->toBouncyCastleECPoint(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p0

    .line 1244
    invoke-virtual {p0}, Lorg/bouncycastle/math/ec/ECPoint;->normalize()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p0

    .line 1245
    invoke-static {p0}, Lorg/jmrtd/Util;->fromBouncyCastleECPoint(Lorg/bouncycastle/math/ec/ECPoint;)Ljava/security/spec/ECPoint;

    move-result-object p0

    return-object p0
.end method

.method public static os2ECPoint([B)Ljava/security/spec/ECPoint;
    .locals 4

    .line 988
    const-string v0, "Error closing stream"

    new-instance v1, Ljava/io/DataInputStream;

    new-instance v2, Ljava/io/ByteArrayInputStream;

    invoke-direct {v2, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v1, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 990
    :try_start_0
    invoke-virtual {v1}, Ljava/io/DataInputStream;->read()I

    move-result v2

    const/4 v3, 0x4

    if-ne v2, v3, :cond_0

    .line 994
    array-length p0, p0

    add-int/lit8 p0, p0, -0x1

    div-int/lit8 p0, p0, 0x2

    .line 995
    new-array v2, p0, [B

    .line 996
    new-array p0, p0, [B

    .line 997
    invoke-virtual {v1, v2}, Ljava/io/DataInputStream;->readFully([B)V

    .line 998
    invoke-virtual {v1, p0}, Ljava/io/DataInputStream;->readFully([B)V

    .line 999
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V

    .line 1000
    invoke-static {v2}, Lorg/jmrtd/Util;->os2i([B)Ljava/math/BigInteger;

    move-result-object v2

    .line 1001
    invoke-static {p0}, Lorg/jmrtd/Util;->os2i([B)Ljava/math/BigInteger;

    move-result-object p0

    .line 1002
    new-instance v3, Ljava/security/spec/ECPoint;

    invoke-direct {v3, v2, p0}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1007
    :try_start_1
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v3

    :catch_0
    move-exception p0

    .line 1009
    sget-object v1, Lorg/jmrtd/Util;->LOGGER:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v1, v2, v0, p0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v3

    .line 992
    :cond_0
    :try_start_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Expected encoded ECPoint to start with 0x04"

    invoke-direct {p0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    .line 1004
    :try_start_3
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "Exception"

    invoke-direct {v2, v3, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1007
    :goto_0
    :try_start_4
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_1

    :catch_2
    move-exception v1

    .line 1009
    sget-object v2, Lorg/jmrtd/Util;->LOGGER:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v2, v3, v0, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1011
    :goto_1
    throw p0
.end method

.method public static os2fe([BLjava/math/BigInteger;)Ljava/math/BigInteger;
    .locals 0

    .line 567
    invoke-static {p0}, Lorg/jmrtd/Util;->os2i([B)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0
.end method

.method public static os2i([B)Ljava/math/BigInteger;
    .locals 2

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    .line 530
    array-length v1, p0

    invoke-static {p0, v0, v1}, Lorg/jmrtd/Util;->os2i([BII)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    .line 528
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static os2i([BII)Ljava/math/BigInteger;
    .locals 5

    if-eqz p0, :cond_1

    .line 548
    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    const-wide/16 v1, 0x100

    .line 549
    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v1

    move v2, p1

    :goto_0
    add-int v3, p1, p2

    if-ge v2, v3, :cond_0

    .line 551
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    .line 552
    aget-byte v3, p0, v2

    and-int/lit16 v3, v3, 0xff

    int-to-long v3, v3

    invoke-static {v3, v4}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    .line 545
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static pad([BI)[B
    .locals 2

    const/4 v0, 0x0

    .line 309
    array-length v1, p0

    invoke-static {p0, v0, v1, p1}, Lorg/jmrtd/Util;->pad([BIII)[B

    move-result-object p0

    return-object p0
.end method

.method public static pad([BIII)[B
    .locals 1

    .line 324
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 325
    invoke-virtual {v0, p0, p1, p2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    const/16 p0, -0x80

    .line 326
    invoke-virtual {v0, p0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 327
    :goto_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p0

    rem-int/2addr p0, p3

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    .line 328
    invoke-virtual {v0, p0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_0

    .line 330
    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method

.method public static partition(I[B)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[B)",
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation

    .line 1567
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_2

    if-lez p0, :cond_2

    .line 1573
    array-length v1, p1

    invoke-static {v1, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    .line 1575
    array-length v1, p1

    div-int/2addr v1, p0

    .line 1576
    array-length v2, p1

    rem-int/2addr v2, p0

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    if-ge v4, v1, :cond_0

    .line 1580
    new-array v6, p0, [B

    .line 1581
    invoke-static {p1, v5, v6, v3, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1582
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/2addr v5, p0

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_1

    .line 1587
    new-array p0, v2, [B

    .line 1588
    invoke-static {p1, v5, p0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1589
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    return-object v0

    .line 1569
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Cannot partition"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static reconstructPublicKey(Ljava/security/PublicKey;)Ljava/security/PublicKey;
    .locals 4

    .line 962
    instance-of v0, p0, Ljava/security/interfaces/ECPublicKey;

    if-nez v0, :cond_0

    return-object p0

    .line 967
    :cond_0
    :try_start_0
    move-object v0, p0

    check-cast v0, Ljava/security/interfaces/ECPublicKey;

    .line 968
    invoke-interface {v0}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v1

    .line 969
    invoke-interface {v0}, Ljava/security/interfaces/ECPublicKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    .line 970
    invoke-static {v0}, Lorg/jmrtd/Util;->toExplicitECParameterSpec(Ljava/security/spec/ECParameterSpec;)Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    .line 971
    new-instance v2, Ljava/security/spec/ECPublicKeySpec;

    invoke-direct {v2, v1, v0}, Ljava/security/spec/ECPublicKeySpec;-><init>(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)V

    .line 973
    const-string v0, "EC"

    sget-object v1, Lorg/jmrtd/Util;->BC_PROVIDER:Ljava/security/Provider;

    invoke-static {v0, v1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyFactory;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    .line 975
    sget-object v1, Lorg/jmrtd/Util;->LOGGER:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v3, "Could not make public key param spec explicit"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object p0
.end method

.method public static recoverMessage(I[B)[B
    .locals 6

    if-eqz p1, :cond_8

    .line 366
    array-length v0, p1

    const/4 v1, 0x1

    if-lt v0, v1, :cond_8

    .line 371
    array-length v0, p1

    sub-int/2addr v0, v1

    aget-byte v0, p1, v0

    and-int/lit8 v0, v0, 0xf

    xor-int/lit8 v0, v0, 0xc

    if-nez v0, :cond_7

    .line 381
    array-length v0, p1

    sub-int/2addr v0, v1

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    xor-int/lit16 v0, v0, 0xbc

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    .line 384
    :cond_0
    array-length v0, p1

    sub-int/2addr v0, v1

    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    xor-int/lit16 v0, v0, 0xcc

    if-nez v0, :cond_6

    const/4 v0, 0x2

    :goto_0
    const/4 v2, 0x0

    .line 396
    aget-byte v3, p1, v2

    and-int/lit16 v4, v3, 0xc0

    xor-int/lit8 v4, v4, 0x40

    const-string v5, "Could not get M1"

    if-nez v4, :cond_5

    and-int/lit8 v3, v3, 0x20

    if-eqz v3, :cond_4

    move v3, v2

    .line 410
    :goto_1
    array-length v4, p1

    if-ge v3, v4, :cond_2

    .line 412
    aget-byte v4, p1, v3

    and-int/lit8 v4, v4, 0xf

    xor-int/lit8 v4, v4, 0xa

    if-nez v4, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    add-int/2addr v3, v1

    .line 418
    array-length v1, p1

    sub-int/2addr v1, v0

    sub-int/2addr v1, p0

    sub-int/2addr v1, v3

    if-lez v1, :cond_3

    .line 428
    new-array p0, v1, [B

    .line 429
    invoke-static {p1, v3, p0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p0

    .line 423
    :cond_3
    new-instance p0, Ljava/lang/NumberFormatException;

    invoke-direct {p0, v5}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 405
    :cond_4
    new-instance p0, Ljava/lang/NumberFormatException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Could not get M1, first byte indicates partial recovery not enabled: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-byte p1, p1, v2

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 401
    :cond_5
    new-instance p0, Ljava/lang/NumberFormatException;

    invoke-direct {p0, v5}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 392
    :cond_6
    new-instance p0, Ljava/lang/NumberFormatException;

    const-string p1, "Not an ISO 9796-2 scheme 2 signature trailer"

    invoke-direct {p0, p1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 376
    :cond_7
    new-instance p0, Ljava/lang/NumberFormatException;

    const-string p1, "Could not get M1, malformed trailer"

    invoke-direct {p0, p1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 367
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Plaintext is too short to recover message"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static stripLeadingZeroes([B)[B
    .locals 4

    if-eqz p0, :cond_1

    .line 1604
    array-length v0, p0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    goto :goto_1

    .line 1608
    :cond_0
    :goto_0
    array-length v0, p0

    if-lez v0, :cond_1

    const/4 v0, 0x0

    aget-byte v2, p0, v0

    if-nez v2, :cond_1

    .line 1609
    array-length v2, p0

    sub-int/2addr v2, v1

    new-array v3, v2, [B

    .line 1610
    invoke-static {p0, v1, v3, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p0, v3

    goto :goto_0

    :cond_1
    :goto_1
    return-object p0
.end method

.method private static toBouncyCastleECCurve(Ljava/security/spec/ECParameterSpec;)Lorg/bouncycastle/math/ec/ECCurve;
    .locals 8

    .line 1257
    invoke-virtual {p0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v0

    .line 1258
    invoke-virtual {v0}, Ljava/security/spec/EllipticCurve;->getField()Ljava/security/spec/ECField;

    move-result-object v1

    .line 1259
    instance-of v2, v1, Ljava/security/spec/ECFieldFp;

    if-eqz v2, :cond_0

    .line 1262
    invoke-virtual {p0}, Ljava/security/spec/ECParameterSpec;->getCofactor()I

    move-result v1

    .line 1263
    invoke-virtual {p0}, Ljava/security/spec/ECParameterSpec;->getOrder()Ljava/math/BigInteger;

    move-result-object v6

    .line 1264
    invoke-virtual {v0}, Ljava/security/spec/EllipticCurve;->getA()Ljava/math/BigInteger;

    move-result-object v4

    .line 1265
    invoke-virtual {v0}, Ljava/security/spec/EllipticCurve;->getB()Ljava/math/BigInteger;

    move-result-object v5

    .line 1266
    invoke-static {p0}, Lorg/jmrtd/Util;->getPrime(Ljava/security/spec/AlgorithmParameterSpec;)Ljava/math/BigInteger;

    move-result-object v3

    .line 1267
    new-instance v2, Lorg/bouncycastle/math/ec/ECCurve$Fp;

    int-to-long v0, v1

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v7

    invoke-direct/range {v2 .. v7}, Lorg/bouncycastle/math/ec/ECCurve$Fp;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    return-object v2

    .line 1260
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Only prime field supported (for now), found "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static toBouncyCastleECPoint(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)Lorg/bouncycastle/math/ec/ECPoint;
    .locals 1

    .line 1202
    invoke-static {p1}, Lorg/jmrtd/Util;->toBouncyCastleECCurve(Ljava/security/spec/ECParameterSpec;)Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object p1

    .line 1203
    invoke-virtual {p0}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p0}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p1, v0, p0}, Lorg/bouncycastle/math/ec/ECCurve;->createPoint(Ljava/math/BigInteger;Ljava/math/BigInteger;)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p0

    return-object p0
.end method

.method public static toBouncyECDomainParameters(Ljava/security/spec/ECParameterSpec;)Lorg/bouncycastle/crypto/params/ECDomainParameters;
    .locals 6

    .line 1305
    invoke-static {p0}, Lorg/jmrtd/Util;->toBouncyCastleECCurve(Ljava/security/spec/ECParameterSpec;)Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v1

    .line 1306
    invoke-virtual {p0}, Ljava/security/spec/ECParameterSpec;->getGenerator()Ljava/security/spec/ECPoint;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/jmrtd/Util;->toBouncyCastleECPoint(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v2

    .line 1307
    invoke-virtual {p0}, Ljava/security/spec/ECParameterSpec;->getOrder()Ljava/math/BigInteger;

    move-result-object v3

    .line 1308
    invoke-virtual {p0}, Ljava/security/spec/ECParameterSpec;->getCofactor()I

    move-result v0

    int-to-long v4, v0

    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v4

    .line 1309
    invoke-virtual {p0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object p0

    invoke-virtual {p0}, Ljava/security/spec/EllipticCurve;->getSeed()[B

    move-result-object v5

    .line 1310
    new-instance v0, Lorg/bouncycastle/crypto/params/ECDomainParameters;

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/crypto/params/ECDomainParameters;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    return-object v0
.end method

.method public static toBouncyECPrivateKeyParameters(Ljava/security/interfaces/ECPrivateKey;)Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;
    .locals 2

    .line 1291
    invoke-interface {p0}, Ljava/security/interfaces/ECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object v0

    .line 1292
    invoke-interface {p0}, Ljava/security/interfaces/ECPrivateKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object p0

    invoke-static {p0}, Lorg/jmrtd/Util;->toBouncyECDomainParameters(Ljava/security/spec/ECParameterSpec;)Lorg/bouncycastle/crypto/params/ECDomainParameters;

    move-result-object p0

    .line 1293
    new-instance v1, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;

    invoke-direct {v1, v0, p0}, Lorg/bouncycastle/crypto/params/ECPrivateKeyParameters;-><init>(Ljava/math/BigInteger;Lorg/bouncycastle/crypto/params/ECDomainParameters;)V

    return-object v1
.end method

.method public static toBouncyECPublicKeyParameters(Ljava/security/interfaces/ECPublicKey;)Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;
    .locals 2

    .line 1278
    invoke-interface {p0}, Ljava/security/interfaces/ECPublicKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    .line 1279
    invoke-interface {p0}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object p0

    invoke-static {p0, v0}, Lorg/jmrtd/Util;->toBouncyCastleECPoint(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p0

    .line 1280
    new-instance v1, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;

    invoke-static {v0}, Lorg/jmrtd/Util;->toBouncyECDomainParameters(Ljava/security/spec/ECParameterSpec;)Lorg/bouncycastle/crypto/params/ECDomainParameters;

    move-result-object v0

    invoke-direct {v1, p0, v0}, Lorg/bouncycastle/crypto/params/ECPublicKeyParameters;-><init>(Lorg/bouncycastle/math/ec/ECPoint;Lorg/bouncycastle/crypto/params/ECDomainParameters;)V

    return-object v1
.end method

.method public static toECNamedCurveSpec(Lorg/bouncycastle/jce/spec/ECNamedCurveParameterSpec;)Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;
    .locals 7

    .line 832
    invoke-virtual {p0}, Lorg/bouncycastle/jce/spec/ECNamedCurveParameterSpec;->getName()Ljava/lang/String;

    move-result-object v1

    .line 833
    invoke-virtual {p0}, Lorg/bouncycastle/jce/spec/ECNamedCurveParameterSpec;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v2

    .line 834
    invoke-virtual {p0}, Lorg/bouncycastle/jce/spec/ECNamedCurveParameterSpec;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v3

    .line 835
    invoke-virtual {p0}, Lorg/bouncycastle/jce/spec/ECNamedCurveParameterSpec;->getN()Ljava/math/BigInteger;

    move-result-object v4

    .line 836
    invoke-virtual {p0}, Lorg/bouncycastle/jce/spec/ECNamedCurveParameterSpec;->getH()Ljava/math/BigInteger;

    move-result-object v5

    .line 837
    invoke-virtual {p0}, Lorg/bouncycastle/jce/spec/ECNamedCurveParameterSpec;->getSeed()[B

    move-result-object v6

    .line 838
    new-instance v0, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;

    invoke-direct/range {v0 .. v6}, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;-><init>(Ljava/lang/String;Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/math/ec/ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    return-object v0
.end method

.method public static toExplicitDHParameterSpec(Lorg/bouncycastle/crypto/params/DHParameters;)Ljavax/crypto/spec/DHParameterSpec;
    .locals 3

    .line 648
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/params/DHParameters;->getP()Ljava/math/BigInteger;

    move-result-object v0

    .line 649
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/params/DHParameters;->getG()Ljava/math/BigInteger;

    move-result-object v1

    .line 650
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/params/DHParameters;->getQ()Ljava/math/BigInteger;

    move-result-object v2

    .line 651
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/params/DHParameters;->getL()I

    move-result p0

    if-nez v2, :cond_0

    .line 653
    new-instance v2, Ljavax/crypto/spec/DHParameterSpec;

    invoke-direct {v2, v0, v1, p0}, Ljavax/crypto/spec/DHParameterSpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V

    return-object v2

    .line 655
    :cond_0
    new-instance p0, Lorg/jmrtd/lds/PACEInfo$DHCParameterSpec;

    invoke-direct {p0, v0, v1, v2}, Lorg/jmrtd/lds/PACEInfo$DHCParameterSpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    return-object p0
.end method

.method public static toExplicitECParameterSpec(Ljava/security/spec/ECParameterSpec;)Ljava/security/spec/ECParameterSpec;
    .locals 8

    .line 761
    const-string v0, "Could not make named EC param spec explicit"

    :try_start_0
    invoke-virtual {p0}, Ljava/security/spec/ECParameterSpec;->getGenerator()Ljava/security/spec/ECPoint;

    move-result-object v1

    .line 762
    invoke-virtual {p0}, Ljava/security/spec/ECParameterSpec;->getOrder()Ljava/math/BigInteger;

    move-result-object v2

    .line 763
    invoke-virtual {p0}, Ljava/security/spec/ECParameterSpec;->getCofactor()I

    move-result v3

    .line 764
    invoke-virtual {p0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v4

    .line 765
    invoke-virtual {v4}, Ljava/security/spec/EllipticCurve;->getA()Ljava/math/BigInteger;

    move-result-object v5

    .line 766
    invoke-virtual {v4}, Ljava/security/spec/EllipticCurve;->getB()Ljava/math/BigInteger;

    move-result-object v6

    .line 767
    invoke-virtual {v4}, Ljava/security/spec/EllipticCurve;->getField()Ljava/security/spec/ECField;

    move-result-object v4

    .line 768
    instance-of v7, v4, Ljava/security/spec/ECFieldFp;

    if-eqz v7, :cond_0

    .line 769
    check-cast v4, Ljava/security/spec/ECFieldFp;

    invoke-virtual {v4}, Ljava/security/spec/ECFieldFp;->getP()Ljava/math/BigInteger;

    move-result-object v4

    .line 770
    new-instance v7, Ljava/security/spec/ECFieldFp;

    invoke-direct {v7, v4}, Ljava/security/spec/ECFieldFp;-><init>(Ljava/math/BigInteger;)V

    .line 771
    new-instance v4, Ljava/security/spec/EllipticCurve;

    invoke-direct {v4, v7, v5, v6}, Ljava/security/spec/EllipticCurve;-><init>(Ljava/security/spec/ECField;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 772
    new-instance v5, Ljava/security/spec/ECParameterSpec;

    invoke-direct {v5, v4, v1, v2, v3}, Ljava/security/spec/ECParameterSpec;-><init>(Ljava/security/spec/EllipticCurve;Ljava/security/spec/ECPoint;Ljava/math/BigInteger;I)V

    return-object v5

    .line 773
    :cond_0
    instance-of v7, v4, Ljava/security/spec/ECFieldF2m;

    if-eqz v7, :cond_1

    .line 774
    check-cast v4, Ljava/security/spec/ECFieldF2m;

    invoke-virtual {v4}, Ljava/security/spec/ECFieldF2m;->getM()I

    move-result v4

    .line 775
    new-instance v7, Ljava/security/spec/ECFieldF2m;

    invoke-direct {v7, v4}, Ljava/security/spec/ECFieldF2m;-><init>(I)V

    .line 776
    new-instance v4, Ljava/security/spec/EllipticCurve;

    invoke-direct {v4, v7, v5, v6}, Ljava/security/spec/EllipticCurve;-><init>(Ljava/security/spec/ECField;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 777
    new-instance v5, Ljava/security/spec/ECParameterSpec;

    invoke-direct {v5, v4, v1, v2, v3}, Ljava/security/spec/ECParameterSpec;-><init>(Ljava/security/spec/EllipticCurve;Ljava/security/spec/ECPoint;Ljava/math/BigInteger;I)V

    return-object v5

    .line 779
    :cond_1
    sget-object v1, Lorg/jmrtd/Util;->LOGGER:Ljava/util/logging/Logger;

    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v1

    .line 783
    sget-object v2, Lorg/jmrtd/Util;->LOGGER:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    invoke-virtual {v2, v3, v0, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object p0
.end method

.method public static toExplicitECParameterSpec(Lorg/bouncycastle/jce/spec/ECNamedCurveParameterSpec;)Ljava/security/spec/ECParameterSpec;
    .locals 0

    .line 749
    invoke-static {p0}, Lorg/jmrtd/Util;->toECNamedCurveSpec(Lorg/bouncycastle/jce/spec/ECNamedCurveParameterSpec;)Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;

    move-result-object p0

    invoke-static {p0}, Lorg/jmrtd/Util;->toExplicitECParameterSpec(Ljava/security/spec/ECParameterSpec;)Ljava/security/spec/ECParameterSpec;

    move-result-object p0

    return-object p0
.end method

.method private static toNamedCurveSpec(Ljava/security/spec/ECParameterSpec;)Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;
    .locals 6

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 799
    :cond_0
    instance-of v1, p0, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;

    if-eqz v1, :cond_1

    .line 800
    check-cast p0, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;

    return-object p0

    .line 804
    :cond_1
    invoke-static {}, Lorg/bouncycastle/jce/ECNamedCurveTable;->getNames()Ljava/util/Enumeration;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v1

    .line 805
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 806
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 807
    invoke-static {v3}, Lorg/bouncycastle/jce/ECNamedCurveTable;->getParameterSpec(Ljava/lang/String;)Lorg/bouncycastle/jce/spec/ECNamedCurveParameterSpec;

    move-result-object v3

    invoke-static {v3}, Lorg/jmrtd/Util;->toECNamedCurveSpec(Lorg/bouncycastle/jce/spec/ECNamedCurveParameterSpec;)Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;

    move-result-object v3

    .line 808
    invoke-virtual {v3}, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v4

    invoke-virtual {p0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/security/spec/EllipticCurve;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 809
    invoke-virtual {v3}, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;->getGenerator()Ljava/security/spec/ECPoint;

    move-result-object v4

    invoke-virtual {p0}, Ljava/security/spec/ECParameterSpec;->getGenerator()Ljava/security/spec/ECPoint;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/security/spec/ECPoint;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 810
    invoke-virtual {v3}, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;->getOrder()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {p0}, Ljava/security/spec/ECParameterSpec;->getOrder()Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 811
    invoke-virtual {v3}, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;->getCofactor()I

    move-result v4

    invoke-virtual {p0}, Ljava/security/spec/ECParameterSpec;->getCofactor()I

    move-result v5

    if-ne v4, v5, :cond_2

    .line 812
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 815
    :cond_3
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_4

    return-object v0

    .line 817
    :cond_4
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p0

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, v0, :cond_5

    .line 818
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;

    return-object p0

    .line 820
    :cond_5
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/jce/spec/ECNamedCurveSpec;

    return-object p0
.end method

.method public static toOIDBytes(Ljava/lang/String;)[B
    .locals 4

    .line 1543
    :try_start_0
    new-instance v0, Lnet/sf/scuba/tlv/TLVInputStream;

    new-instance v1, Ljava/io/ByteArrayInputStream;

    new-instance v2, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-direct {v2, p0}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getEncoded()[B

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v0, v1}, Lnet/sf/scuba/tlv/TLVInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1545
    :try_start_1
    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVInputStream;->readTag()I

    .line 1546
    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVInputStream;->readLength()I

    .line 1547
    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVInputStream;->readValue()[B

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1549
    :try_start_2
    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVInputStream;->close()V

    const/16 v0, 0x80

    .line 1551
    invoke-static {v0, v1}, Lnet/sf/scuba/tlv/TLVUtil;->wrapDO(I[B)[B

    move-result-object p0

    return-object p0

    :catchall_0
    move-exception v1

    .line 1549
    invoke-virtual {v0}, Lnet/sf/scuba/tlv/TLVInputStream;->close()V

    .line 1550
    throw v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    .line 1553
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Illegal OID: \""

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static toPublicKey(Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;)Ljava/security/PublicKey;
    .locals 6

    .line 935
    const-string v0, "Exception"

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "DER"

    invoke-virtual {p0, v2}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getEncoded(Ljava/lang/String;)[B

    move-result-object p0

    .line 936
    new-instance v2, Ljava/security/spec/X509EncodedKeySpec;

    invoke-direct {v2, p0}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 938
    :try_start_1
    const-string p0, "DH"

    invoke-static {p0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object p0

    .line 939
    invoke-virtual {p0, v2}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p0
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    :catch_0
    move-exception p0

    .line 941
    :try_start_2
    sget-object v3, Lorg/jmrtd/Util;->LOGGER:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v5, "Not DH public key? Fine, let\'s try EC public key"

    invoke-virtual {v3, v4, v5, p0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 942
    const-string p0, "EC"

    sget-object v3, Lorg/jmrtd/Util;->BC_PROVIDER:Ljava/security/Provider;

    invoke-static {p0, v3}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyFactory;

    move-result-object p0

    .line 943
    invoke-virtual {p0, v2}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p0
    :try_end_2
    .catch Ljava/security/GeneralSecurityException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    return-object p0

    :catch_1
    move-exception p0

    .line 949
    sget-object v2, Lorg/jmrtd/Util;->LOGGER:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    invoke-virtual {v2, v3, v0, p0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1

    :catch_2
    move-exception p0

    .line 946
    sget-object v2, Lorg/jmrtd/Util;->LOGGER:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    invoke-virtual {v2, v3, v0, p0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public static toSubjectPublicKeyInfo(Ljava/security/PublicKey;)Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;
    .locals 11

    const-string v0, "Could not find X9.62 named curve for OID "

    const-string v1, "Was expecting id-ecPublicKey ("

    const-string v2, "Unrecognized key type, found "

    .line 859
    :try_start_0
    invoke-interface {p0}, Ljava/security/PublicKey;->getAlgorithm()Ljava/lang/String;

    move-result-object v3

    .line 860
    const-string v4, "EC"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    const-string v4, "ECDH"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    instance-of v4, p0, Ljava/security/interfaces/ECPublicKey;

    if-eqz v4, :cond_0

    goto/16 :goto_1

    .line 902
    :cond_0
    const-string v0, "DH"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    instance-of v0, p0, Ljavax/crypto/interfaces/DHPublicKey;

    if-eqz v0, :cond_1

    goto :goto_0

    .line 918
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/security/PublicKey;->getAlgorithm()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v1, ", should be DH or ECDH"

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 903
    :cond_2
    :goto_0
    new-instance v1, Lorg/bouncycastle/asn1/ASN1InputStream;

    invoke-interface {p0}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v0

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 905
    :try_start_1
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1InputStream;->readObject()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object v0

    .line 906
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getAlgorithm()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    .line 908
    check-cast p0, Ljavax/crypto/interfaces/DHPublicKey;

    .line 909
    invoke-interface {p0}, Ljavax/crypto/interfaces/DHPublicKey;->getParams()Ljavax/crypto/spec/DHParameterSpec;

    move-result-object v2

    .line 910
    new-instance v3, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    new-instance v4, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    .line 911
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v0

    new-instance v5, Lorg/bouncycastle/asn1/pkcs/DHParameter;

    .line 912
    invoke-virtual {v2}, Ljavax/crypto/spec/DHParameterSpec;->getP()Ljava/math/BigInteger;

    move-result-object v6

    invoke-virtual {v2}, Ljavax/crypto/spec/DHParameterSpec;->getG()Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v2}, Ljavax/crypto/spec/DHParameterSpec;->getL()I

    move-result v2

    invoke-direct {v5, v6, v7, v2}, Lorg/bouncycastle/asn1/pkcs/DHParameter;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/pkcs/DHParameter;->toASN1Primitive()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v2

    invoke-direct {v4, v0, v2}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    new-instance v0, Lorg/bouncycastle/asn1/ASN1Integer;

    .line 913
    invoke-interface {p0}, Ljavax/crypto/interfaces/DHPublicKey;->getY()Ljava/math/BigInteger;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/bouncycastle/asn1/ASN1Integer;-><init>(Ljava/math/BigInteger;)V

    invoke-direct {v3, v4, v0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;-><init>(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 915
    :try_start_2
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1InputStream;->close()V

    return-object v3

    :catchall_0
    move-exception v0

    move-object p0, v0

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1InputStream;->close()V

    .line 916
    throw p0

    .line 861
    :cond_3
    :goto_1
    new-instance v2, Lorg/bouncycastle/asn1/ASN1InputStream;

    invoke-interface {p0}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v3

    invoke-direct {v2, v3}, Lorg/bouncycastle/asn1/ASN1InputStream;-><init>([B)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 863
    :try_start_3
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1InputStream;->readObject()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v3

    invoke-static {v3}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getInstance(Ljava/lang/Object;)Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    move-result-object v3

    .line 864
    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getAlgorithm()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v4

    .line 865
    invoke-virtual {v4}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v5

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object v5

    .line 866
    sget-object v6, Lorg/jmrtd/lds/SecurityInfo;->ID_EC_PUBLIC_KEY:Ljava/lang/String;

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 869
    invoke-virtual {v4}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getParameters()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v1

    invoke-interface {v1}, Lorg/bouncycastle/asn1/ASN1Encodable;->toASN1Primitive()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v1

    .line 871
    instance-of v4, v1, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    if-eqz v4, :cond_5

    .line 872
    check-cast v1, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 875
    invoke-static {v1}, Lorg/bouncycastle/asn1/x9/X962NamedCurves;->getByOID(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Lorg/bouncycastle/asn1/x9/X9ECParameters;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 881
    invoke-virtual {v4}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->getG()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v0

    .line 882
    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECPoint;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v1

    .line 883
    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECPoint;->getAffineXCoord()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v5

    invoke-virtual {v5}, Lorg/bouncycastle/math/ec/ECFieldElement;->toBigInteger()Ljava/math/BigInteger;

    move-result-object v5

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECPoint;->getAffineYCoord()Lorg/bouncycastle/math/ec/ECFieldElement;

    move-result-object v0

    invoke-virtual {v0}, Lorg/bouncycastle/math/ec/ECFieldElement;->toBigInteger()Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v1, v5, v0}, Lorg/bouncycastle/math/ec/ECCurve;->createPoint(Ljava/math/BigInteger;Ljava/math/BigInteger;)Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object v0

    .line 884
    new-instance v5, Lorg/bouncycastle/asn1/x9/X9ECParameters;

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->getCurve()Lorg/bouncycastle/math/ec/ECCurve;

    move-result-object v6

    new-instance v7, Lorg/bouncycastle/asn1/x9/X9ECPoint;

    const/4 v1, 0x0

    invoke-direct {v7, v0, v1}, Lorg/bouncycastle/asn1/x9/X9ECPoint;-><init>(Lorg/bouncycastle/math/ec/ECPoint;Z)V

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->getN()Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->getH()Ljava/math/BigInteger;

    move-result-object v9

    invoke-virtual {v4}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->getSeed()[B

    move-result-object v10

    invoke-direct/range {v5 .. v10}, Lorg/bouncycastle/asn1/x9/X9ECParameters;-><init>(Lorg/bouncycastle/math/ec/ECCurve;Lorg/bouncycastle/asn1/x9/X9ECPoint;Ljava/math/BigInteger;Ljava/math/BigInteger;[B)V

    .line 890
    instance-of v0, p0, Lorg/bouncycastle/jce/interfaces/ECPublicKey;

    if-eqz v0, :cond_5

    .line 891
    check-cast p0, Lorg/bouncycastle/jce/interfaces/ECPublicKey;

    .line 892
    new-instance v0, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;->getAlgorithm()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v3

    invoke-virtual {v3}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;->getAlgorithm()Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    move-result-object v3

    invoke-virtual {v5}, Lorg/bouncycastle/asn1/x9/X9ECParameters;->toASN1Primitive()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 893
    invoke-interface {p0}, Lorg/bouncycastle/jce/interfaces/ECPublicKey;->getQ()Lorg/bouncycastle/math/ec/ECPoint;

    move-result-object p0

    .line 894
    new-instance v3, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    invoke-virtual {p0, v1}, Lorg/bouncycastle/math/ec/ECPoint;->getEncoded(Z)[B

    move-result-object p0

    invoke-direct {v3, v0, p0}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;-><init>(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B)V

    goto :goto_2

    .line 877
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 900
    :cond_5
    :goto_2
    :try_start_4
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-object v3

    .line 867
    :cond_6
    :try_start_5
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lorg/jmrtd/lds/SecurityInfo;->ID_EC_PUBLIC_KEY_TYPE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "), found "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v0

    move-object p0, v0

    .line 900
    :try_start_6
    invoke-virtual {v2}, Lorg/bouncycastle/asn1/ASN1InputStream;->close()V

    .line 901
    throw p0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    move-exception v0

    move-object p0, v0

    .line 921
    sget-object v0, Lorg/jmrtd/Util;->LOGGER:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v2, "Exception"

    invoke-virtual {v0, v1, v2, p0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static unpad([B)[B
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljavax/crypto/BadPaddingException;
        }
    .end annotation

    .line 343
    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    .line 344
    aget-byte v1, p0, v0

    if-nez v1, :cond_0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 347
    :cond_0
    aget-byte v1, p0, v0

    and-int/lit16 v1, v1, 0xff

    const/16 v2, 0x80

    if-ne v1, v2, :cond_1

    .line 350
    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 351
    invoke-static {p0, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1

    .line 348
    :cond_1
    new-instance v1, Ljavax/crypto/BadPaddingException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expected constant 0x80, found 0x"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-byte p0, p0, v0

    and-int/lit16 p0, p0, 0xff

    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljavax/crypto/BadPaddingException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
