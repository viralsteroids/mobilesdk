.class public final Lorg/ejbca/cvc/example/GenerateCert;
.super Ljava/lang/Object;
.source "GenerateCert.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static main([Ljava/lang/String;)V
    .locals 6

    .line 45
    :try_start_0
    new-instance p0, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;

    invoke-direct {p0}, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;-><init>()V

    invoke-static {p0}, Ljava/security/Security;->addProvider(Ljava/security/Provider;)I

    .line 48
    const-string p0, "RSA"

    const-string v0, "BC"

    invoke-static {p0, v0}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    move-result-object p0

    .line 49
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    const/16 v1, 0x400

    invoke-virtual {p0, v1, v0}, Ljava/security/KeyPairGenerator;->initialize(ILjava/security/SecureRandom;)V

    .line 50
    invoke-virtual {p0}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    move-result-object p0

    .line 52
    new-instance v2, Lorg/ejbca/cvc/CAReferenceField;

    const-string v0, "SE"

    const-string v1, "PASS-CVCA"

    const-string v3, "00111"

    invoke-direct {v2, v0, v1, v3}, Lorg/ejbca/cvc/CAReferenceField;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    new-instance v3, Lorg/ejbca/cvc/HolderReferenceField;

    invoke-virtual {v2}, Lorg/ejbca/cvc/CAReferenceField;->getCountry()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lorg/ejbca/cvc/CAReferenceField;->getMnemonic()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lorg/ejbca/cvc/CAReferenceField;->getSequence()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v0, v1, v4}, Lorg/ejbca/cvc/HolderReferenceField;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    invoke-virtual {p0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v0

    invoke-virtual {p0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v1

    const-string v4, "SHA1WithRSA"

    sget-object v5, Lorg/ejbca/cvc/AuthorizationRoleEnum;->IS:Lorg/ejbca/cvc/AuthorizationRoleEnum;

    invoke-static/range {v0 .. v5}, Lorg/ejbca/cvc/CertificateGenerator;->createTestCertificate(Ljava/security/PublicKey;Ljava/security/PrivateKey;Lorg/ejbca/cvc/CAReferenceField;Lorg/ejbca/cvc/HolderReferenceField;Ljava/lang/String;Lorg/ejbca/cvc/AuthorizationRoleEnum;)Lorg/ejbca/cvc/CVCertificate;

    move-result-object p0

    .line 60
    invoke-virtual {p0}, Lorg/ejbca/cvc/CVCertificate;->getDEREncoded()[B

    move-result-object p0

    .line 63
    const-string v0, "C:/cv_certs/mycert1.cvcert"

    .line 64
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1, p0}, Lorg/ejbca/cvc/example/FileHelper;->writeFile(Ljava/io/File;[B)V

    .line 67
    new-instance p0, Ljava/io/File;

    invoke-direct {p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lorg/ejbca/cvc/example/FileHelper;->loadFile(Ljava/io/File;)[B

    move-result-object p0

    .line 68
    invoke-static {p0}, Lorg/ejbca/cvc/CertificateParser;->parseCertificate([B)Lorg/ejbca/cvc/CVCertificate;

    move-result-object p0

    .line 69
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v1, ""

    invoke-virtual {p0, v1}, Lorg/ejbca/cvc/CVCObject;->getAsText(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p0, v0

    .line 72
    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    return-void
.end method
