.class public Lorg/jmrtd/protocol/PACEResult;
.super Ljava/lang/Object;
.source "PACEResult.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x5ea45b0f1c75ae7cL


# instance fields
.field private agreementAlg:Ljava/lang/String;

.field private cipherAlg:Ljava/lang/String;

.field private digestAlg:Ljava/lang/String;

.field private keyLength:I

.field private mappingResult:Lorg/jmrtd/protocol/PACEMappingResult;

.field private mappingType:Lorg/jmrtd/lds/PACEInfo$MappingType;

.field private paceKey:Lorg/jmrtd/AccessKeySpec;

.field private pcdKeyPair:Ljava/security/KeyPair;

.field private piccPublicKey:Ljava/security/PublicKey;

.field private wrapper:Lorg/jmrtd/protocol/SecureMessagingWrapper;


# direct methods
.method public constructor <init>(Lorg/jmrtd/AccessKeySpec;Lorg/jmrtd/lds/PACEInfo$MappingType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILorg/jmrtd/protocol/PACEMappingResult;Ljava/security/KeyPair;Ljava/security/PublicKey;Lorg/jmrtd/protocol/SecureMessagingWrapper;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput-object p1, p0, Lorg/jmrtd/protocol/PACEResult;->paceKey:Lorg/jmrtd/AccessKeySpec;

    .line 79
    iput-object p2, p0, Lorg/jmrtd/protocol/PACEResult;->mappingType:Lorg/jmrtd/lds/PACEInfo$MappingType;

    .line 80
    iput-object p3, p0, Lorg/jmrtd/protocol/PACEResult;->agreementAlg:Ljava/lang/String;

    .line 81
    iput-object p4, p0, Lorg/jmrtd/protocol/PACEResult;->cipherAlg:Ljava/lang/String;

    .line 82
    iput-object p5, p0, Lorg/jmrtd/protocol/PACEResult;->digestAlg:Ljava/lang/String;

    .line 83
    iput p6, p0, Lorg/jmrtd/protocol/PACEResult;->keyLength:I

    .line 84
    iput-object p7, p0, Lorg/jmrtd/protocol/PACEResult;->mappingResult:Lorg/jmrtd/protocol/PACEMappingResult;

    .line 85
    iput-object p8, p0, Lorg/jmrtd/protocol/PACEResult;->pcdKeyPair:Ljava/security/KeyPair;

    .line 86
    iput-object p9, p0, Lorg/jmrtd/protocol/PACEResult;->piccPublicKey:Ljava/security/PublicKey;

    .line 87
    iput-object p10, p0, Lorg/jmrtd/protocol/PACEResult;->wrapper:Lorg/jmrtd/protocol/SecureMessagingWrapper;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    .line 227
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    .line 231
    :cond_2
    check-cast p1, Lorg/jmrtd/protocol/PACEResult;

    .line 232
    iget-object v2, p0, Lorg/jmrtd/protocol/PACEResult;->paceKey:Lorg/jmrtd/AccessKeySpec;

    if-nez v2, :cond_3

    .line 233
    iget-object v2, p1, Lorg/jmrtd/protocol/PACEResult;->paceKey:Lorg/jmrtd/AccessKeySpec;

    if-eqz v2, :cond_4

    return v1

    .line 236
    :cond_3
    iget-object v3, p1, Lorg/jmrtd/protocol/PACEResult;->paceKey:Lorg/jmrtd/AccessKeySpec;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    .line 239
    :cond_4
    iget-object v2, p0, Lorg/jmrtd/protocol/PACEResult;->agreementAlg:Ljava/lang/String;

    if-nez v2, :cond_5

    .line 240
    iget-object v2, p1, Lorg/jmrtd/protocol/PACEResult;->agreementAlg:Ljava/lang/String;

    if-eqz v2, :cond_6

    return v1

    .line 243
    :cond_5
    iget-object v3, p1, Lorg/jmrtd/protocol/PACEResult;->agreementAlg:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    return v1

    .line 246
    :cond_6
    iget-object v2, p0, Lorg/jmrtd/protocol/PACEResult;->cipherAlg:Ljava/lang/String;

    if-nez v2, :cond_7

    .line 247
    iget-object v2, p1, Lorg/jmrtd/protocol/PACEResult;->cipherAlg:Ljava/lang/String;

    if-eqz v2, :cond_8

    return v1

    .line 250
    :cond_7
    iget-object v3, p1, Lorg/jmrtd/protocol/PACEResult;->cipherAlg:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    return v1

    .line 253
    :cond_8
    iget-object v2, p0, Lorg/jmrtd/protocol/PACEResult;->digestAlg:Ljava/lang/String;

    if-nez v2, :cond_9

    .line 254
    iget-object v2, p1, Lorg/jmrtd/protocol/PACEResult;->digestAlg:Ljava/lang/String;

    if-eqz v2, :cond_a

    return v1

    .line 257
    :cond_9
    iget-object v3, p1, Lorg/jmrtd/protocol/PACEResult;->digestAlg:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    return v1

    .line 260
    :cond_a
    iget-object v2, p0, Lorg/jmrtd/protocol/PACEResult;->mappingResult:Lorg/jmrtd/protocol/PACEMappingResult;

    if-nez v2, :cond_b

    .line 261
    iget-object v2, p1, Lorg/jmrtd/protocol/PACEResult;->mappingResult:Lorg/jmrtd/protocol/PACEMappingResult;

    if-eqz v2, :cond_c

    return v1

    .line 264
    :cond_b
    iget-object v3, p1, Lorg/jmrtd/protocol/PACEResult;->mappingResult:Lorg/jmrtd/protocol/PACEMappingResult;

    invoke-virtual {v2, v3}, Lorg/jmrtd/protocol/PACEMappingResult;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    return v1

    .line 267
    :cond_c
    iget v2, p0, Lorg/jmrtd/protocol/PACEResult;->keyLength:I

    iget v3, p1, Lorg/jmrtd/protocol/PACEResult;->keyLength:I

    if-eq v2, v3, :cond_d

    return v1

    .line 270
    :cond_d
    iget-object v2, p0, Lorg/jmrtd/protocol/PACEResult;->mappingType:Lorg/jmrtd/lds/PACEInfo$MappingType;

    iget-object v3, p1, Lorg/jmrtd/protocol/PACEResult;->mappingType:Lorg/jmrtd/lds/PACEInfo$MappingType;

    if-eq v2, v3, :cond_e

    return v1

    .line 273
    :cond_e
    iget-object v2, p0, Lorg/jmrtd/protocol/PACEResult;->pcdKeyPair:Ljava/security/KeyPair;

    if-nez v2, :cond_f

    .line 274
    iget-object v2, p1, Lorg/jmrtd/protocol/PACEResult;->pcdKeyPair:Ljava/security/KeyPair;

    if-eqz v2, :cond_10

    return v1

    .line 277
    :cond_f
    iget-object v3, p1, Lorg/jmrtd/protocol/PACEResult;->pcdKeyPair:Ljava/security/KeyPair;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    return v1

    .line 280
    :cond_10
    iget-object v2, p0, Lorg/jmrtd/protocol/PACEResult;->piccPublicKey:Ljava/security/PublicKey;

    if-nez v2, :cond_11

    .line 281
    iget-object v2, p1, Lorg/jmrtd/protocol/PACEResult;->piccPublicKey:Ljava/security/PublicKey;

    if-eqz v2, :cond_12

    return v1

    .line 284
    :cond_11
    iget-object v3, p1, Lorg/jmrtd/protocol/PACEResult;->piccPublicKey:Ljava/security/PublicKey;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    return v1

    .line 287
    :cond_12
    iget-object v2, p0, Lorg/jmrtd/protocol/PACEResult;->wrapper:Lorg/jmrtd/protocol/SecureMessagingWrapper;

    if-nez v2, :cond_13

    .line 288
    iget-object p1, p1, Lorg/jmrtd/protocol/PACEResult;->wrapper:Lorg/jmrtd/protocol/SecureMessagingWrapper;

    if-eqz p1, :cond_14

    return v1

    .line 291
    :cond_13
    iget-object p1, p1, Lorg/jmrtd/protocol/PACEResult;->wrapper:Lorg/jmrtd/protocol/SecureMessagingWrapper;

    invoke-virtual {v2, p1}, Lorg/jmrtd/protocol/SecureMessagingWrapper;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    return v1

    :cond_14
    return v0
.end method

.method public getAgreementAlg()Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Lorg/jmrtd/protocol/PACEResult;->agreementAlg:Ljava/lang/String;

    return-object v0
.end method

.method public getCipherAlg()Ljava/lang/String;
    .locals 1

    .line 141
    iget-object v0, p0, Lorg/jmrtd/protocol/PACEResult;->cipherAlg:Ljava/lang/String;

    return-object v0
.end method

.method public getDigestAlg()Ljava/lang/String;
    .locals 1

    .line 150
    iget-object v0, p0, Lorg/jmrtd/protocol/PACEResult;->digestAlg:Ljava/lang/String;

    return-object v0
.end method

.method public getKeyLength()I
    .locals 1

    .line 159
    iget v0, p0, Lorg/jmrtd/protocol/PACEResult;->keyLength:I

    return v0
.end method

.method public getMappingResult()Lorg/jmrtd/protocol/PACEMappingResult;
    .locals 1

    .line 105
    iget-object v0, p0, Lorg/jmrtd/protocol/PACEResult;->mappingResult:Lorg/jmrtd/protocol/PACEMappingResult;

    return-object v0
.end method

.method public getMappingType()Lorg/jmrtd/lds/PACEInfo$MappingType;
    .locals 1

    .line 123
    iget-object v0, p0, Lorg/jmrtd/protocol/PACEResult;->mappingType:Lorg/jmrtd/lds/PACEInfo$MappingType;

    return-object v0
.end method

.method public getPACEKey()Lorg/jmrtd/AccessKeySpec;
    .locals 1

    .line 96
    iget-object v0, p0, Lorg/jmrtd/protocol/PACEResult;->paceKey:Lorg/jmrtd/AccessKeySpec;

    return-object v0
.end method

.method public getPCDKeyPair()Ljava/security/KeyPair;
    .locals 1

    .line 168
    iget-object v0, p0, Lorg/jmrtd/protocol/PACEResult;->pcdKeyPair:Ljava/security/KeyPair;

    return-object v0
.end method

.method public getPICCPublicKey()Ljava/security/PublicKey;
    .locals 1

    .line 177
    iget-object v0, p0, Lorg/jmrtd/protocol/PACEResult;->piccPublicKey:Ljava/security/PublicKey;

    return-object v0
.end method

.method public getWrapper()Lorg/jmrtd/protocol/SecureMessagingWrapper;
    .locals 1

    .line 114
    iget-object v0, p0, Lorg/jmrtd/protocol/PACEResult;->wrapper:Lorg/jmrtd/protocol/SecureMessagingWrapper;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 206
    iget-object v0, p0, Lorg/jmrtd/protocol/PACEResult;->paceKey:Lorg/jmrtd/AccessKeySpec;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x558d

    add-int/2addr v2, v0

    mul-int/lit16 v2, v2, 0x7c7

    .line 207
    iget-object v0, p0, Lorg/jmrtd/protocol/PACEResult;->agreementAlg:Ljava/lang/String;

    if-nez v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_1
    add-int/2addr v2, v0

    mul-int/lit16 v2, v2, 0x7c7

    .line 208
    iget-object v0, p0, Lorg/jmrtd/protocol/PACEResult;->cipherAlg:Ljava/lang/String;

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_2
    add-int/2addr v2, v0

    mul-int/lit16 v2, v2, 0x7c7

    .line 209
    iget-object v0, p0, Lorg/jmrtd/protocol/PACEResult;->digestAlg:Ljava/lang/String;

    if-nez v0, :cond_3

    move v0, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v2, v0

    mul-int/lit16 v2, v2, 0x7c7

    .line 210
    iget-object v0, p0, Lorg/jmrtd/protocol/PACEResult;->mappingResult:Lorg/jmrtd/protocol/PACEMappingResult;

    if-nez v0, :cond_4

    move v0, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Lorg/jmrtd/protocol/PACEMappingResult;->hashCode()I

    move-result v0

    :goto_4
    add-int/2addr v2, v0

    mul-int/lit16 v2, v2, 0x7c7

    .line 211
    iget v0, p0, Lorg/jmrtd/protocol/PACEResult;->keyLength:I

    add-int/2addr v2, v0

    mul-int/lit16 v2, v2, 0x7c7

    .line 212
    iget-object v0, p0, Lorg/jmrtd/protocol/PACEResult;->mappingType:Lorg/jmrtd/lds/PACEInfo$MappingType;

    if-nez v0, :cond_5

    move v0, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v0}, Lorg/jmrtd/lds/PACEInfo$MappingType;->hashCode()I

    move-result v0

    :goto_5
    add-int/2addr v2, v0

    mul-int/lit16 v2, v2, 0x7c7

    .line 213
    iget-object v0, p0, Lorg/jmrtd/protocol/PACEResult;->pcdKeyPair:Ljava/security/KeyPair;

    if-nez v0, :cond_6

    move v0, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_6
    add-int/2addr v2, v0

    mul-int/lit16 v2, v2, 0x7c7

    .line 214
    iget-object v0, p0, Lorg/jmrtd/protocol/PACEResult;->piccPublicKey:Ljava/security/PublicKey;

    if-nez v0, :cond_7

    move v0, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_7
    add-int/2addr v2, v0

    mul-int/lit16 v2, v2, 0x7c7

    .line 215
    iget-object v0, p0, Lorg/jmrtd/protocol/PACEResult;->wrapper:Lorg/jmrtd/protocol/SecureMessagingWrapper;

    if-nez v0, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v0}, Lorg/jmrtd/protocol/SecureMessagingWrapper;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v2, v1

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 187
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PACEResult [paceKey: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    iget-object v1, p0, Lorg/jmrtd/protocol/PACEResult;->paceKey:Lorg/jmrtd/AccessKeySpec;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mappingType: "

    .line 190
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/jmrtd/protocol/PACEResult;->mappingType:Lorg/jmrtd/lds/PACEInfo$MappingType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ", agreementAlg: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lorg/jmrtd/protocol/PACEResult;->agreementAlg:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 191
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ", cipherAlg: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lorg/jmrtd/protocol/PACEResult;->cipherAlg:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 192
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ", digestAlg: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lorg/jmrtd/protocol/PACEResult;->digestAlg:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 193
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ", keyLength: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lorg/jmrtd/protocol/PACEResult;->keyLength:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 194
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ", mappingResult: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lorg/jmrtd/protocol/PACEResult;->mappingResult:Lorg/jmrtd/protocol/PACEMappingResult;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 195
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ", piccPublicKey: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lorg/jmrtd/protocol/PACEResult;->piccPublicKey:Ljava/security/PublicKey;

    .line 196
    invoke-static {v2}, Lorg/jmrtd/Util;->getDetailedPublicKeyAlgorithm(Ljava/security/PublicKey;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ", pcdPrivateKey: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lorg/jmrtd/protocol/PACEResult;->pcdKeyPair:Ljava/security/KeyPair;

    .line 197
    invoke-virtual {v2}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v2

    invoke-static {v2}, Lorg/jmrtd/Util;->getDetailedPrivateKeyAlgorithm(Ljava/security/PrivateKey;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ", pcdPublicKey: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lorg/jmrtd/protocol/PACEResult;->pcdKeyPair:Ljava/security/KeyPair;

    .line 198
    invoke-virtual {v2}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v2

    invoke-static {v2}, Lorg/jmrtd/Util;->getDetailedPublicKeyAlgorithm(Ljava/security/PublicKey;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 199
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
