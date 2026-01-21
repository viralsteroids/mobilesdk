.class public Lorg/jmrtd/lds/TerminalAuthenticationInfo;
.super Lorg/jmrtd/lds/SecurityInfo;
.source "TerminalAuthenticationInfo.java"


# static fields
.field public static final VERSION_1:I = 0x1

.field private static final VERSION_2:I = 0x2

.field private static final serialVersionUID:J = 0x5653ae2555e8401cL


# instance fields
.field private transient efCVCA:Lorg/bouncycastle/asn1/ASN1Sequence;

.field private oid:Ljava/lang/String;

.field private version:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 103
    sget-object v0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->ID_TA:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lorg/jmrtd/lds/TerminalAuthenticationInfo;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 95
    invoke-direct {p0, p1, p2, v0}, Lorg/jmrtd/lds/TerminalAuthenticationInfo;-><init>(Ljava/lang/String;ILorg/bouncycastle/asn1/ASN1Sequence;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;ILorg/bouncycastle/asn1/ASN1Sequence;)V
    .locals 0

    .line 81
    invoke-direct {p0}, Lorg/jmrtd/lds/SecurityInfo;-><init>()V

    .line 82
    iput-object p1, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->oid:Ljava/lang/String;

    .line 83
    iput p2, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->version:I

    .line 84
    iput-object p3, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->efCVCA:Lorg/bouncycastle/asn1/ASN1Sequence;

    .line 85
    invoke-direct {p0}, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->checkFields()V

    return-void
.end method

.method public constructor <init>(SB)V
    .locals 2

    .line 115
    sget-object v0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->ID_TA:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {p1, p2}, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->constructEFCVCA(SB)Lorg/bouncycastle/asn1/ASN1Sequence;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Lorg/jmrtd/lds/TerminalAuthenticationInfo;-><init>(Ljava/lang/String;ILorg/bouncycastle/asn1/ASN1Sequence;)V

    return-void
.end method

.method private checkFields()V
    .locals 4

    const-string v0, "Wrong version. Was expecting 1 or 2, found "

    const-string v1, "Wrong identifier: "

    .line 246
    :try_start_0
    iget-object v2, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->oid:Ljava/lang/String;

    invoke-static {v2}, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->checkRequiredIdentifier(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 249
    iget v1, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->version:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    .line 250
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->version:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 253
    :cond_1
    :goto_0
    iget-object v0, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->efCVCA:Lorg/bouncycastle/asn1/ASN1Sequence;

    if-eqz v0, :cond_4

    const/4 v1, 0x0

    .line 254
    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DEROctetString;

    .line 255
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DEROctetString;->getOctets()[B

    move-result-object v0

    array-length v0, v0

    if-ne v0, v2, :cond_3

    .line 258
    iget-object v0, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->efCVCA:Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->size()I

    move-result v0

    if-ne v0, v2, :cond_4

    .line 259
    iget-object v0, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->efCVCA:Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-virtual {v0, v3}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v0

    check-cast v0, Lorg/bouncycastle/asn1/DEROctetString;

    .line 260
    invoke-virtual {v0}, Lorg/bouncycastle/asn1/DEROctetString;->getOctets()[B

    move-result-object v0

    array-length v0, v0

    if-ne v0, v3, :cond_2

    goto :goto_1

    .line 261
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Malformed SFI."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 256
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Malformed FID."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_1
    return-void

    .line 247
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->oid:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    .line 266
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Malformed TerminalAuthenticationInfo"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method static checkRequiredIdentifier(Ljava/lang/String;)Z
    .locals 1

    .line 238
    sget-object v0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->ID_TA:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static constructEFCVCA(SB)Lorg/bouncycastle/asn1/ASN1Sequence;
    .locals 7

    const/4 v0, -0x1

    const v1, 0xff00

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq p1, v0, :cond_0

    .line 280
    new-instance v0, Lorg/bouncycastle/asn1/DLSequence;

    new-array v5, v2, [Lorg/bouncycastle/asn1/ASN1Encodable;

    new-instance v6, Lorg/bouncycastle/asn1/DEROctetString;

    and-int/2addr v1, p0

    shr-int/lit8 v1, v1, 0x8

    int-to-byte v1, v1

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    new-array v2, v2, [B

    aput-byte v1, v2, v3

    aput-byte p0, v2, v4

    invoke-direct {v6, v2}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    aput-object v6, v5, v3

    new-instance p0, Lorg/bouncycastle/asn1/DEROctetString;

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    new-array v1, v4, [B

    aput-byte p1, v1, v3

    invoke-direct {p0, v1}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    aput-object p0, v5, v4

    invoke-direct {v0, v5}, Lorg/bouncycastle/asn1/DLSequence;-><init>([Lorg/bouncycastle/asn1/ASN1Encodable;)V

    return-object v0

    .line 284
    :cond_0
    new-instance p1, Lorg/bouncycastle/asn1/DLSequence;

    new-array v0, v4, [Lorg/bouncycastle/asn1/ASN1Encodable;

    new-instance v5, Lorg/bouncycastle/asn1/DEROctetString;

    and-int/2addr v1, p0

    shr-int/lit8 v1, v1, 0x8

    int-to-byte v1, v1

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    new-array v2, v2, [B

    aput-byte v1, v2, v3

    aput-byte p0, v2, v4

    invoke-direct {v5, v2}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    aput-object v5, v0, v3

    invoke-direct {p1, v0}, Lorg/bouncycastle/asn1/DLSequence;-><init>([Lorg/bouncycastle/asn1/ASN1Encodable;)V

    return-object p1
.end method

.method private static getFID(Lorg/bouncycastle/asn1/ASN1Sequence;)S
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    const/4 v0, 0x0

    .line 301
    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/asn1/DEROctetString;

    .line 302
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/DEROctetString;->getOctets()[B

    move-result-object p0

    .line 303
    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    const/4 v1, 0x1

    aget-byte p0, p0, v1

    and-int/lit16 p0, p0, 0xff

    or-int/2addr p0, v0

    int-to-short p0, p0

    return p0
.end method

.method private static getSFI(Lorg/bouncycastle/asn1/ASN1Sequence;)B
    .locals 3

    const/4 v0, -0x1

    if-nez p0, :cond_0

    return v0

    .line 317
    :cond_0
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/ASN1Sequence;->size()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    return v0

    :cond_1
    const/4 v0, 0x1

    .line 320
    invoke-virtual {p0, v0}, Lorg/bouncycastle/asn1/ASN1Sequence;->getObjectAt(I)Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object p0

    check-cast p0, Lorg/bouncycastle/asn1/DEROctetString;

    invoke-virtual {p0}, Lorg/bouncycastle/asn1/DEROctetString;->getOctets()[B

    move-result-object p0

    const/4 v0, 0x0

    aget-byte p0, p0, v0

    return p0
.end method

.method private toProtocolOIDString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 331
    sget-object v0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->ID_TA:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 332
    const-string p1, "id-TA"

    return-object p1

    .line 334
    :cond_0
    sget-object v0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->ID_TA_RSA:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 335
    const-string p1, "id-TA-RSA"

    return-object p1

    .line 337
    :cond_1
    sget-object v0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->ID_TA_RSA_V1_5_SHA_1:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 338
    const-string p1, "id-TA-RSA-v1-5-SHA-1"

    return-object p1

    .line 340
    :cond_2
    sget-object v0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->ID_TA_RSA_V1_5_SHA_256:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 341
    const-string p1, "id-TA-RSA-v1-5-SHA-256"

    return-object p1

    .line 343
    :cond_3
    sget-object v0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->ID_TA_RSA_PSS_SHA_1:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 344
    const-string p1, "id-TA-RSA-PSS-SHA-1"

    return-object p1

    .line 346
    :cond_4
    sget-object v0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->ID_TA_RSA_PSS_SHA_256:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 347
    const-string p1, "id-TA-RSA-PSS-SHA-256"

    return-object p1

    .line 349
    :cond_5
    sget-object v0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->ID_TA_ECDSA:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 350
    const-string p1, "id-TA-ECDSA"

    return-object p1

    .line 352
    :cond_6
    sget-object v0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->ID_TA_ECDSA_SHA_1:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 353
    const-string p1, "id-TA-ECDSA-SHA-1"

    return-object p1

    .line 355
    :cond_7
    sget-object v0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->ID_TA_ECDSA_SHA_224:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 356
    const-string p1, "id-TA-ECDSA-SHA-224"

    return-object p1

    .line 358
    :cond_8
    sget-object v0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->ID_TA_ECDSA_SHA_256:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 359
    const-string p1, "id-TA-ECDSA-SHA-256"

    :cond_9
    return-object p1
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    if-ne p1, p0, :cond_1

    const/4 p1, 0x1

    return p1

    .line 213
    :cond_1
    const-class v1, Lorg/jmrtd/lds/TerminalAuthenticationInfo;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    .line 216
    :cond_2
    check-cast p1, Lorg/jmrtd/lds/TerminalAuthenticationInfo;

    .line 217
    iget-object v1, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->efCVCA:Lorg/bouncycastle/asn1/ASN1Sequence;

    if-nez v1, :cond_3

    iget-object v2, p1, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->efCVCA:Lorg/bouncycastle/asn1/ASN1Sequence;

    if-eqz v2, :cond_3

    return v0

    :cond_3
    if-eqz v1, :cond_4

    .line 220
    iget-object v1, p1, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->efCVCA:Lorg/bouncycastle/asn1/ASN1Sequence;

    if-nez v1, :cond_4

    return v0

    .line 224
    :cond_4
    invoke-virtual {p0}, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->getDERObject()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v0

    invoke-virtual {p1}, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->getDERObject()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result p1

    return p1
.end method

.method public getDERObject()Lorg/bouncycastle/asn1/ASN1Primitive;
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 137
    new-instance v0, Lorg/bouncycastle/asn1/ASN1EncodableVector;

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ASN1EncodableVector;-><init>()V

    .line 138
    new-instance v1, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    iget-object v2, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->oid:Ljava/lang/String;

    invoke-direct {v1, v2}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 139
    new-instance v1, Lorg/bouncycastle/asn1/ASN1Integer;

    iget v2, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->version:I

    int-to-long v2, v2

    invoke-direct {v1, v2, v3}, Lorg/bouncycastle/asn1/ASN1Integer;-><init>(J)V

    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 140
    iget-object v1, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->efCVCA:Lorg/bouncycastle/asn1/ASN1Sequence;

    if-eqz v1, :cond_0

    .line 141
    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1EncodableVector;->add(Lorg/bouncycastle/asn1/ASN1Encodable;)V

    .line 143
    :cond_0
    new-instance v1, Lorg/bouncycastle/asn1/DLSequence;

    invoke-direct {v1, v0}, Lorg/bouncycastle/asn1/DLSequence;-><init>(Lorg/bouncycastle/asn1/ASN1EncodableVector;)V

    return-object v1
.end method

.method public getFileId()I
    .locals 1

    .line 172
    iget-object v0, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->efCVCA:Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-static {v0}, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->getFID(Lorg/bouncycastle/asn1/ASN1Sequence;)S

    move-result v0

    return v0
.end method

.method public getObjectIdentifier()Ljava/lang/String;
    .locals 1

    .line 153
    iget-object v0, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->oid:Ljava/lang/String;

    return-object v0
.end method

.method public getProtocolOIDString()Ljava/lang/String;
    .locals 1

    .line 163
    iget-object v0, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->oid:Ljava/lang/String;

    invoke-direct {p0, v0}, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->toProtocolOIDString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getShortFileId()B
    .locals 1

    .line 182
    iget-object v0, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->efCVCA:Lorg/bouncycastle/asn1/ASN1Sequence;

    invoke-static {v0}, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->getSFI(Lorg/bouncycastle/asn1/ASN1Sequence;)B

    move-result v0

    return v0
.end method

.method public getVersion()I
    .locals 1

    .line 124
    iget v0, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->version:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 199
    iget-object v0, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->oid:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 200
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x7

    add-int/lit8 v0, v0, 0x7b

    iget v1, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->version:I

    mul-int/lit8 v1, v1, 0x5

    add-int/2addr v0, v1

    iget-object v1, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->efCVCA:Lorg/bouncycastle/asn1/ASN1Sequence;

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    .line 202
    :cond_1
    invoke-virtual {v1}, Lorg/bouncycastle/asn1/ASN1Sequence;->hashCode()I

    move-result v1

    :goto_1
    mul-int/lit8 v1, v1, 0x3

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 187
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TerminalAuthenticationInfo [protocol: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    iget-object v1, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->oid:Ljava/lang/String;

    invoke-direct {p0, v1}, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->toProtocolOIDString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", version: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 190
    iget v1, p0, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->version:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", fileID: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 191
    invoke-virtual {p0}, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->getFileId()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shortFileID: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 192
    invoke-virtual {p0}, Lorg/jmrtd/lds/TerminalAuthenticationInfo;->getShortFileId()B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    .line 193
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 194
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
