.class public Lorg/jmrtd/protocol/EACTAResult;
.super Ljava/lang/Object;
.source "EACTAResult.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final LOGGER:Ljava/util/logging/Logger;

.field private static final serialVersionUID:J = -0x289b7796e5c47e6cL


# instance fields
.field private caReference:Lorg/jmrtd/cert/CVCPrincipal;

.field private cardChallenge:[B

.field private chipAuthenticationResult:Lorg/jmrtd/protocol/EACCAResult;

.field private documentNumber:Ljava/lang/String;

.field private terminalCertificates:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/jmrtd/cert/CardVerifiableCertificate;",
            ">;"
        }
    .end annotation
.end field

.field private terminalKey:Ljava/security/PrivateKey;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 51
    const-string v0, "org.jmrtd"

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lorg/jmrtd/protocol/EACTAResult;->LOGGER:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lorg/jmrtd/protocol/EACCAResult;Lorg/jmrtd/cert/CVCPrincipal;Ljava/util/List;Ljava/security/PrivateKey;Ljava/lang/String;[B)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/jmrtd/protocol/EACCAResult;",
            "Lorg/jmrtd/cert/CVCPrincipal;",
            "Ljava/util/List<",
            "Lorg/jmrtd/cert/CardVerifiableCertificate;",
            ">;",
            "Ljava/security/PrivateKey;",
            "Ljava/lang/String;",
            "[B)V"
        }
    .end annotation

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/jmrtd/protocol/EACTAResult;->terminalCertificates:Ljava/util/List;

    .line 73
    iput-object p1, p0, Lorg/jmrtd/protocol/EACTAResult;->chipAuthenticationResult:Lorg/jmrtd/protocol/EACCAResult;

    .line 74
    iput-object p2, p0, Lorg/jmrtd/protocol/EACTAResult;->caReference:Lorg/jmrtd/cert/CVCPrincipal;

    .line 75
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/jmrtd/cert/CardVerifiableCertificate;

    .line 76
    iget-object p3, p0, Lorg/jmrtd/protocol/EACTAResult;->terminalCertificates:Ljava/util/List;

    invoke-interface {p3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 78
    :cond_0
    iput-object p4, p0, Lorg/jmrtd/protocol/EACTAResult;->terminalKey:Ljava/security/PrivateKey;

    .line 79
    iput-object p5, p0, Lorg/jmrtd/protocol/EACTAResult;->documentNumber:Ljava/lang/String;

    .line 80
    iput-object p6, p0, Lorg/jmrtd/protocol/EACTAResult;->cardChallenge:[B

    return-void
.end method

.method private toString(Lorg/jmrtd/cert/CardVerifiableCertificate;)Ljava/lang/Object;
    .locals 4

    const-string v0, "holderReference: "

    .line 237
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "CardVerifiableCertificate ["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 240
    :try_start_0
    invoke-virtual {p1}, Lorg/jmrtd/cert/CardVerifiableCertificate;->getHolderReference()Lorg/jmrtd/cert/CVCPrincipal;

    move-result-object p1

    .line 241
    iget-object v2, p0, Lorg/jmrtd/protocol/EACTAResult;->caReference:Lorg/jmrtd/cert/CVCPrincipal;

    invoke-virtual {v2, p1}, Lorg/jmrtd/cert/CVCPrincipal;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 242
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 245
    const-string v0, "holderReference = ???"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    sget-object v0, Lorg/jmrtd/protocol/EACTAResult;->LOGGER:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v3, "Exception"

    invoke-virtual {v0, v2, v3, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 249
    :cond_0
    :goto_0
    const-string p1, "]"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
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

    .line 187
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    .line 190
    :cond_2
    check-cast p1, Lorg/jmrtd/protocol/EACTAResult;

    .line 191
    iget-object v2, p0, Lorg/jmrtd/protocol/EACTAResult;->caReference:Lorg/jmrtd/cert/CVCPrincipal;

    if-nez v2, :cond_3

    .line 192
    iget-object v2, p1, Lorg/jmrtd/protocol/EACTAResult;->caReference:Lorg/jmrtd/cert/CVCPrincipal;

    if-eqz v2, :cond_4

    return v1

    .line 195
    :cond_3
    iget-object v3, p1, Lorg/jmrtd/protocol/EACTAResult;->caReference:Lorg/jmrtd/cert/CVCPrincipal;

    invoke-virtual {v2, v3}, Lorg/jmrtd/cert/CVCPrincipal;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    .line 198
    :cond_4
    iget-object v2, p0, Lorg/jmrtd/protocol/EACTAResult;->cardChallenge:[B

    iget-object v3, p1, Lorg/jmrtd/protocol/EACTAResult;->cardChallenge:[B

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-nez v2, :cond_5

    return v1

    .line 201
    :cond_5
    iget-object v2, p0, Lorg/jmrtd/protocol/EACTAResult;->chipAuthenticationResult:Lorg/jmrtd/protocol/EACCAResult;

    if-nez v2, :cond_6

    .line 202
    iget-object v2, p1, Lorg/jmrtd/protocol/EACTAResult;->chipAuthenticationResult:Lorg/jmrtd/protocol/EACCAResult;

    if-eqz v2, :cond_7

    return v1

    .line 205
    :cond_6
    iget-object v3, p1, Lorg/jmrtd/protocol/EACTAResult;->chipAuthenticationResult:Lorg/jmrtd/protocol/EACCAResult;

    invoke-virtual {v2, v3}, Lorg/jmrtd/protocol/EACCAResult;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    return v1

    .line 208
    :cond_7
    iget-object v2, p0, Lorg/jmrtd/protocol/EACTAResult;->documentNumber:Ljava/lang/String;

    if-nez v2, :cond_8

    .line 209
    iget-object v2, p1, Lorg/jmrtd/protocol/EACTAResult;->documentNumber:Ljava/lang/String;

    if-eqz v2, :cond_9

    return v1

    .line 212
    :cond_8
    iget-object v3, p1, Lorg/jmrtd/protocol/EACTAResult;->documentNumber:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    return v1

    .line 215
    :cond_9
    iget-object v2, p0, Lorg/jmrtd/protocol/EACTAResult;->terminalCertificates:Ljava/util/List;

    if-nez v2, :cond_a

    .line 216
    iget-object v2, p1, Lorg/jmrtd/protocol/EACTAResult;->terminalCertificates:Ljava/util/List;

    if-eqz v2, :cond_b

    return v1

    .line 219
    :cond_a
    iget-object v3, p1, Lorg/jmrtd/protocol/EACTAResult;->terminalCertificates:Ljava/util/List;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    return v1

    .line 222
    :cond_b
    iget-object v2, p0, Lorg/jmrtd/protocol/EACTAResult;->terminalKey:Ljava/security/PrivateKey;

    if-nez v2, :cond_d

    .line 223
    iget-object p1, p1, Lorg/jmrtd/protocol/EACTAResult;->terminalKey:Ljava/security/PrivateKey;

    if-nez p1, :cond_c

    return v0

    :cond_c
    return v1

    .line 226
    :cond_d
    iget-object p1, p1, Lorg/jmrtd/protocol/EACTAResult;->terminalKey:Ljava/security/PrivateKey;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getCAReference()Lorg/jmrtd/cert/CVCPrincipal;
    .locals 1

    .line 98
    iget-object v0, p0, Lorg/jmrtd/protocol/EACTAResult;->caReference:Lorg/jmrtd/cert/CVCPrincipal;

    return-object v0
.end method

.method public getCVCertificates()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/jmrtd/cert/CardVerifiableCertificate;",
            ">;"
        }
    .end annotation

    .line 109
    iget-object v0, p0, Lorg/jmrtd/protocol/EACTAResult;->terminalCertificates:Ljava/util/List;

    return-object v0
.end method

.method public getCardChallenge()[B
    .locals 1

    .line 136
    iget-object v0, p0, Lorg/jmrtd/protocol/EACTAResult;->cardChallenge:[B

    return-object v0
.end method

.method public getChipAuthenticationResult()Lorg/jmrtd/protocol/EACCAResult;
    .locals 1

    .line 89
    iget-object v0, p0, Lorg/jmrtd/protocol/EACTAResult;->chipAuthenticationResult:Lorg/jmrtd/protocol/EACCAResult;

    return-object v0
.end method

.method public getDocumentNumber()Ljava/lang/String;
    .locals 1

    .line 127
    iget-object v0, p0, Lorg/jmrtd/protocol/EACTAResult;->documentNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getTerminalKey()Ljava/security/PrivateKey;
    .locals 1

    .line 118
    iget-object v0, p0, Lorg/jmrtd/protocol/EACTAResult;->terminalKey:Ljava/security/PrivateKey;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 170
    iget-object v0, p0, Lorg/jmrtd/protocol/EACTAResult;->caReference:Lorg/jmrtd/cert/CVCPrincipal;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lorg/jmrtd/cert/CVCPrincipal;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    add-int/2addr v0, v2

    mul-int/2addr v0, v2

    .line 171
    iget-object v3, p0, Lorg/jmrtd/protocol/EACTAResult;->cardChallenge:[B

    invoke-static {v3}, Ljava/util/Arrays;->hashCode([B)I

    move-result v3

    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    .line 172
    iget-object v3, p0, Lorg/jmrtd/protocol/EACTAResult;->chipAuthenticationResult:Lorg/jmrtd/protocol/EACCAResult;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lorg/jmrtd/protocol/EACCAResult;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    .line 173
    iget-object v3, p0, Lorg/jmrtd/protocol/EACTAResult;->documentNumber:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    .line 174
    iget-object v3, p0, Lorg/jmrtd/protocol/EACTAResult;->terminalCertificates:Ljava/util/List;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    .line 175
    iget-object v2, p0, Lorg/jmrtd/protocol/EACTAResult;->terminalKey:Ljava/security/PrivateKey;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 146
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 147
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "TAResult [chipAuthenticationResult: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lorg/jmrtd/protocol/EACTAResult;->chipAuthenticationResult:Lorg/jmrtd/protocol/EACCAResult;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "caReference: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lorg/jmrtd/protocol/EACTAResult;->caReference:Lorg/jmrtd/cert/CVCPrincipal;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, ", terminalCertificates: ["

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    iget-object v1, p0, Lorg/jmrtd/protocol/EACTAResult;->terminalCertificates:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/jmrtd/cert/CardVerifiableCertificate;

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    goto :goto_1

    .line 155
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    :goto_1
    invoke-direct {p0, v4}, Lorg/jmrtd/protocol/EACTAResult;->toString(Lorg/jmrtd/cert/CardVerifiableCertificate;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 159
    :cond_1
    const-string v1, "terminalKey = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lorg/jmrtd/protocol/EACTAResult;->terminalKey:Ljava/security/PrivateKey;

    invoke-static {v2}, Lorg/jmrtd/Util;->getDetailedPrivateKeyAlgorithm(Ljava/security/PrivateKey;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", documentNumber = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    iget-object v1, p0, Lorg/jmrtd/protocol/EACTAResult;->documentNumber:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", cardChallenge = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    iget-object v1, p0, Lorg/jmrtd/protocol/EACTAResult;->cardChallenge:[B

    invoke-static {v1}, Lnet/sf/scuba/util/Hex;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", ]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
