.class public final Lorg/ejbca/cvc/CertificateGenerator;
.super Ljava/lang/Object;
.source "CertificateGenerator.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createAuthenticatedRequest(Lorg/ejbca/cvc/CVCertificate;Ljava/security/KeyPair;Ljava/lang/String;Lorg/ejbca/cvc/CAReferenceField;)Lorg/ejbca/cvc/CVCAuthenticatedRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/NoSuchProviderException;,
            Ljava/security/InvalidKeyException;,
            Ljava/security/SignatureException;,
            Lorg/ejbca/cvc/exception/ConstructionException;
        }
    .end annotation

    .line 305
    const-string v0, "BC"

    invoke-static {p0, p1, p2, p3, v0}, Lorg/ejbca/cvc/CertificateGenerator;->createAuthenticatedRequest(Lorg/ejbca/cvc/CVCertificate;Ljava/security/KeyPair;Ljava/lang/String;Lorg/ejbca/cvc/CAReferenceField;Ljava/lang/String;)Lorg/ejbca/cvc/CVCAuthenticatedRequest;

    move-result-object p0

    return-object p0
.end method

.method public static createAuthenticatedRequest(Lorg/ejbca/cvc/CVCertificate;Ljava/security/KeyPair;Ljava/lang/String;Lorg/ejbca/cvc/CAReferenceField;Ljava/lang/String;)Lorg/ejbca/cvc/CVCAuthenticatedRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/NoSuchProviderException;,
            Ljava/security/InvalidKeyException;,
            Ljava/security/SignatureException;,
            Lorg/ejbca/cvc/exception/ConstructionException;
        }
    .end annotation

    .line 331
    new-instance v0, Lorg/ejbca/cvc/CVCAuthenticatedRequest;

    invoke-direct {v0, p0, p3}, Lorg/ejbca/cvc/CVCAuthenticatedRequest;-><init>(Lorg/ejbca/cvc/CVCertificate;Lorg/ejbca/cvc/CAReferenceField;)V

    .line 334
    invoke-static {p2}, Lorg/ejbca/cvc/AlgorithmUtil;->convertAlgorithmNameToCVC(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p4}, Ljava/security/Signature;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/Signature;

    move-result-object p0

    .line 335
    invoke-virtual {p1}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    .line 336
    invoke-virtual {v0}, Lorg/ejbca/cvc/CVCAuthenticatedRequest;->getTBS()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/security/Signature;->update([B)V

    .line 337
    invoke-virtual {p0}, Ljava/security/Signature;->sign()[B

    move-result-object p0

    .line 340
    invoke-static {p2, p0}, Lorg/ejbca/cvc/util/BCECUtil;->convertX962SigToCVC(Ljava/lang/String;[B)[B

    move-result-object p0

    .line 343
    invoke-virtual {v0, p0}, Lorg/ejbca/cvc/CVCAuthenticatedRequest;->setSignature([B)V

    return-object v0
.end method

.method public static createCertificate(Ljava/security/PublicKey;Ljava/security/PrivateKey;Ljava/lang/String;Lorg/ejbca/cvc/CAReferenceField;Lorg/ejbca/cvc/HolderReferenceField;Lorg/ejbca/cvc/AuthorizationRole;Lorg/ejbca/cvc/AccessRights;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)Lorg/ejbca/cvc/CVCertificate;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/NoSuchProviderException;,
            Ljava/security/InvalidKeyException;,
            Ljava/security/SignatureException;,
            Lorg/ejbca/cvc/exception/ConstructionException;
        }
    .end annotation

    .line 126
    invoke-static {p0, p2, p5}, Lorg/ejbca/cvc/KeyFactory;->createInstance(Ljava/security/PublicKey;Ljava/lang/String;Lorg/ejbca/cvc/AuthorizationRole;)Lorg/ejbca/cvc/CVCPublicKey;

    move-result-object v2

    .line 129
    new-instance v0, Lorg/ejbca/cvc/CVCertificateBody;

    move-object v1, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object v6, p7

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lorg/ejbca/cvc/CVCertificateBody;-><init>(Lorg/ejbca/cvc/CAReferenceField;Lorg/ejbca/cvc/CVCPublicKey;Lorg/ejbca/cvc/HolderReferenceField;Lorg/ejbca/cvc/AuthorizationRole;Lorg/ejbca/cvc/AccessRights;Ljava/util/Date;Ljava/util/Date;)V

    .line 138
    new-instance p0, Lorg/ejbca/cvc/CVCertificate;

    invoke-direct {p0, v0}, Lorg/ejbca/cvc/CVCertificate;-><init>(Lorg/ejbca/cvc/CVCertificateBody;)V

    .line 141
    invoke-static {p2}, Lorg/ejbca/cvc/AlgorithmUtil;->convertAlgorithmNameToCVC(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    move-object/from16 p4, p9

    invoke-static {p3, p4}, Ljava/security/Signature;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/Signature;

    move-result-object p3

    .line 142
    invoke-virtual {p3, p1}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    .line 143
    invoke-virtual {p0}, Lorg/ejbca/cvc/CVCertificate;->getTBS()[B

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/security/Signature;->update([B)V

    .line 144
    invoke-virtual {p3}, Ljava/security/Signature;->sign()[B

    move-result-object p1

    .line 147
    invoke-static {p2, p1}, Lorg/ejbca/cvc/util/BCECUtil;->convertX962SigToCVC(Ljava/lang/String;[B)[B

    move-result-object p1

    .line 149
    invoke-virtual {p0, p1}, Lorg/ejbca/cvc/CVCertificate;->setSignature([B)V

    return-object p0
.end method

.method public static createCertificate(Ljava/security/PublicKey;Ljava/security/PrivateKey;Ljava/lang/String;Lorg/ejbca/cvc/CAReferenceField;Lorg/ejbca/cvc/HolderReferenceField;Lorg/ejbca/cvc/AuthorizationRoleEnum;Lorg/ejbca/cvc/AccessRightEnum;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)Lorg/ejbca/cvc/CVCertificate;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/NoSuchProviderException;,
            Ljava/security/InvalidKeyException;,
            Ljava/security/SignatureException;,
            Lorg/ejbca/cvc/exception/ConstructionException;
        }
    .end annotation

    .line 169
    invoke-static/range {p0 .. p9}, Lorg/ejbca/cvc/CertificateGenerator;->createCertificate(Ljava/security/PublicKey;Ljava/security/PrivateKey;Ljava/lang/String;Lorg/ejbca/cvc/CAReferenceField;Lorg/ejbca/cvc/HolderReferenceField;Lorg/ejbca/cvc/AuthorizationRole;Lorg/ejbca/cvc/AccessRights;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)Lorg/ejbca/cvc/CVCertificate;

    move-result-object p0

    return-object p0
.end method

.method public static createRequest(Ljava/security/KeyPair;Ljava/lang/String;Lorg/ejbca/cvc/CAReferenceField;Lorg/ejbca/cvc/HolderReferenceField;)Lorg/ejbca/cvc/CVCertificate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/NoSuchProviderException;,
            Ljava/security/InvalidKeyException;,
            Ljava/security/SignatureException;,
            Lorg/ejbca/cvc/exception/ConstructionException;
        }
    .end annotation

    .line 236
    const-string v0, "BC"

    invoke-static {p0, p1, p2, p3, v0}, Lorg/ejbca/cvc/CertificateGenerator;->createRequest(Ljava/security/KeyPair;Ljava/lang/String;Lorg/ejbca/cvc/CAReferenceField;Lorg/ejbca/cvc/HolderReferenceField;Ljava/lang/String;)Lorg/ejbca/cvc/CVCertificate;

    move-result-object p0

    return-object p0
.end method

.method public static createRequest(Ljava/security/KeyPair;Ljava/lang/String;Lorg/ejbca/cvc/CAReferenceField;Lorg/ejbca/cvc/HolderReferenceField;Ljava/lang/String;)Lorg/ejbca/cvc/CVCertificate;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/NoSuchProviderException;,
            Ljava/security/InvalidKeyException;,
            Ljava/security/SignatureException;,
            Lorg/ejbca/cvc/exception/ConstructionException;
        }
    .end annotation

    .line 261
    invoke-virtual {p0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lorg/ejbca/cvc/KeyFactory;->createInstance(Ljava/security/PublicKey;Ljava/lang/String;Lorg/ejbca/cvc/AuthorizationRoleEnum;)Lorg/ejbca/cvc/CVCPublicKey;

    move-result-object v0

    .line 264
    new-instance v1, Lorg/ejbca/cvc/CVCertificateBody;

    invoke-direct {v1, p2, v0, p3}, Lorg/ejbca/cvc/CVCertificateBody;-><init>(Lorg/ejbca/cvc/CAReferenceField;Lorg/ejbca/cvc/CVCPublicKey;Lorg/ejbca/cvc/HolderReferenceField;)V

    .line 269
    new-instance p2, Lorg/ejbca/cvc/CVCertificate;

    invoke-direct {p2, v1}, Lorg/ejbca/cvc/CVCertificate;-><init>(Lorg/ejbca/cvc/CVCertificateBody;)V

    .line 272
    invoke-static {p1}, Lorg/ejbca/cvc/AlgorithmUtil;->convertAlgorithmNameToCVC(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, p4}, Ljava/security/Signature;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/Signature;

    move-result-object p3

    .line 273
    invoke-virtual {p0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object p0

    invoke-virtual {p3, p0}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    .line 274
    invoke-virtual {p2}, Lorg/ejbca/cvc/CVCertificate;->getTBS()[B

    move-result-object p0

    invoke-virtual {p3, p0}, Ljava/security/Signature;->update([B)V

    .line 275
    invoke-virtual {p3}, Ljava/security/Signature;->sign()[B

    move-result-object p0

    .line 278
    invoke-static {p1, p0}, Lorg/ejbca/cvc/util/BCECUtil;->convertX962SigToCVC(Ljava/lang/String;[B)[B

    move-result-object p0

    .line 281
    invoke-virtual {p2, p0}, Lorg/ejbca/cvc/CVCertificate;->setSignature([B)V

    return-object p2
.end method

.method public static createRequest(Ljava/security/KeyPair;Ljava/lang/String;Lorg/ejbca/cvc/HolderReferenceField;)Lorg/ejbca/cvc/CVCertificate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/NoSuchProviderException;,
            Ljava/security/InvalidKeyException;,
            Ljava/security/SignatureException;,
            Lorg/ejbca/cvc/exception/ConstructionException;
        }
    .end annotation

    .line 190
    const-string v0, "BC"

    invoke-static {p0, p1, p2, v0}, Lorg/ejbca/cvc/CertificateGenerator;->createRequest(Ljava/security/KeyPair;Ljava/lang/String;Lorg/ejbca/cvc/HolderReferenceField;Ljava/lang/String;)Lorg/ejbca/cvc/CVCertificate;

    move-result-object p0

    return-object p0
.end method

.method public static createRequest(Ljava/security/KeyPair;Ljava/lang/String;Lorg/ejbca/cvc/HolderReferenceField;Ljava/lang/String;)Lorg/ejbca/cvc/CVCertificate;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/NoSuchProviderException;,
            Ljava/security/InvalidKeyException;,
            Ljava/security/SignatureException;,
            Lorg/ejbca/cvc/exception/ConstructionException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 213
    invoke-static {p0, p1, v0, p2, p3}, Lorg/ejbca/cvc/CertificateGenerator;->createRequest(Ljava/security/KeyPair;Ljava/lang/String;Lorg/ejbca/cvc/CAReferenceField;Lorg/ejbca/cvc/HolderReferenceField;Ljava/lang/String;)Lorg/ejbca/cvc/CVCertificate;

    move-result-object p0

    return-object p0
.end method

.method public static createTestCertificate(Ljava/security/PublicKey;Ljava/security/PrivateKey;Lorg/ejbca/cvc/CAReferenceField;Lorg/ejbca/cvc/HolderReferenceField;Ljava/lang/String;Lorg/ejbca/cvc/AuthorizationRoleEnum;)Lorg/ejbca/cvc/CVCertificate;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/NoSuchProviderException;,
            Ljava/security/InvalidKeyException;,
            Ljava/security/SignatureException;,
            Lorg/ejbca/cvc/exception/ConstructionException;
        }
    .end annotation

    .line 74
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 75
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v8

    .line 77
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x3

    .line 78
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->add(II)V

    .line 79
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v9

    .line 80
    sget-object v7, Lorg/ejbca/cvc/AccessRightEnum;->READ_ACCESS_DG3_AND_DG4:Lorg/ejbca/cvc/AccessRightEnum;

    const-string v10, "BC"

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    move-object v3, p4

    move-object/from16 v6, p5

    invoke-static/range {v1 .. v10}, Lorg/ejbca/cvc/CertificateGenerator;->createCertificate(Ljava/security/PublicKey;Ljava/security/PrivateKey;Ljava/lang/String;Lorg/ejbca/cvc/CAReferenceField;Lorg/ejbca/cvc/HolderReferenceField;Lorg/ejbca/cvc/AuthorizationRoleEnum;Lorg/ejbca/cvc/AccessRightEnum;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)Lorg/ejbca/cvc/CVCertificate;

    move-result-object p0

    return-object p0
.end method
