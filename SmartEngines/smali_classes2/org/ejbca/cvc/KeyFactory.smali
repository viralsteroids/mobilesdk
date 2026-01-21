.class public Lorg/ejbca/cvc/KeyFactory;
.super Ljava/lang/Object;
.source "KeyFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static copyField(Lorg/ejbca/cvc/CVCTagEnum;Lorg/ejbca/cvc/CVCTagEnum;Lorg/ejbca/cvc/GenericPublicKeyField;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/ejbca/cvc/exception/ConstructionException;
        }
    .end annotation

    .line 108
    invoke-virtual {p0}, Lorg/ejbca/cvc/CVCTagEnum;->getValue()I

    move-result v0

    invoke-virtual {p1}, Lorg/ejbca/cvc/CVCTagEnum;->getValue()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 111
    invoke-virtual {p2, p1}, Lorg/ejbca/cvc/GenericPublicKeyField;->getOptionalSubfield(Lorg/ejbca/cvc/CVCTagEnum;)Lorg/ejbca/cvc/CVCObject;

    move-result-object v0

    check-cast v0, Lorg/ejbca/cvc/ByteField;

    if-nez v0, :cond_0

    .line 114
    invoke-virtual {p2, p0}, Lorg/ejbca/cvc/GenericPublicKeyField;->getOptionalSubfield(Lorg/ejbca/cvc/CVCTagEnum;)Lorg/ejbca/cvc/CVCObject;

    move-result-object p0

    check-cast p0, Lorg/ejbca/cvc/ByteField;

    if-eqz p0, :cond_0

    .line 117
    new-instance v0, Lorg/ejbca/cvc/ByteField;

    invoke-virtual {p0}, Lorg/ejbca/cvc/ByteField;->getData()[B

    move-result-object p0

    invoke-direct {v0, p1, p0}, Lorg/ejbca/cvc/ByteField;-><init>(Lorg/ejbca/cvc/CVCTagEnum;[B)V

    invoke-virtual {p2, v0}, Lorg/ejbca/cvc/GenericPublicKeyField;->addSubfield(Lorg/ejbca/cvc/CVCObject;)V

    :cond_0
    return-void

    .line 109
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Tag values are not equal"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static createInstance(Ljava/security/PublicKey;Ljava/lang/String;Lorg/ejbca/cvc/AuthorizationRole;)Lorg/ejbca/cvc/CVCPublicKey;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/ejbca/cvc/exception/ConstructionException;
        }
    .end annotation

    .line 39
    instance-of v0, p0, Lorg/ejbca/cvc/CVCPublicKey;

    if-eqz v0, :cond_0

    .line 41
    check-cast p0, Lorg/ejbca/cvc/CVCPublicKey;

    return-object p0

    .line 47
    :cond_0
    invoke-static {p1}, Lorg/ejbca/cvc/AlgorithmUtil;->getOIDField(Ljava/lang/String;)Lorg/ejbca/cvc/OIDField;

    move-result-object p1

    .line 48
    invoke-virtual {p1}, Lorg/ejbca/cvc/OIDField;->getValue()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0.4.0.127.0.7.2.2.2.1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 50
    new-instance p2, Lorg/ejbca/cvc/PublicKeyRSA;

    check-cast p0, Ljava/security/interfaces/RSAPublicKey;

    invoke-direct {p2, p1, p0}, Lorg/ejbca/cvc/PublicKeyRSA;-><init>(Lorg/ejbca/cvc/OIDField;Ljava/security/interfaces/RSAPublicKey;)V

    return-object p2

    .line 52
    :cond_1
    invoke-virtual {p1}, Lorg/ejbca/cvc/OIDField;->getValue()Ljava/lang/String;

    move-result-object v0

    const-string v1, "0.4.0.127.0.7.2.2.2.2"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 54
    new-instance v0, Lorg/ejbca/cvc/PublicKeyEC;

    check-cast p0, Ljava/security/interfaces/ECPublicKey;

    invoke-direct {v0, p1, p0, p2}, Lorg/ejbca/cvc/PublicKeyEC;-><init>(Lorg/ejbca/cvc/OIDField;Ljava/security/interfaces/ECPublicKey;Lorg/ejbca/cvc/AuthorizationRole;)V

    return-object v0

    .line 57
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unknown key type: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static createInstance(Ljava/security/PublicKey;Ljava/lang/String;Lorg/ejbca/cvc/AuthorizationRoleEnum;)Lorg/ejbca/cvc/CVCPublicKey;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/ejbca/cvc/exception/ConstructionException;
        }
    .end annotation

    .line 68
    invoke-static {p0, p1, p2}, Lorg/ejbca/cvc/KeyFactory;->createInstance(Ljava/security/PublicKey;Ljava/lang/String;Lorg/ejbca/cvc/AuthorizationRole;)Lorg/ejbca/cvc/CVCPublicKey;

    move-result-object p0

    return-object p0
.end method

.method static createInstance(Lorg/ejbca/cvc/GenericPublicKeyField;)Lorg/ejbca/cvc/CVCPublicKey;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/ejbca/cvc/exception/ConstructionException;
        }
    .end annotation

    const-string v0, "Unknown public key OID: "

    .line 80
    :try_start_0
    sget-object v1, Lorg/ejbca/cvc/CVCTagEnum;->OID:Lorg/ejbca/cvc/CVCTagEnum;

    invoke-virtual {p0, v1}, Lorg/ejbca/cvc/GenericPublicKeyField;->getOptionalSubfield(Lorg/ejbca/cvc/CVCTagEnum;)Lorg/ejbca/cvc/CVCObject;

    move-result-object v1

    check-cast v1, Lorg/ejbca/cvc/OIDField;

    .line 81
    invoke-virtual {v1}, Lorg/ejbca/cvc/OIDField;->getValue()Ljava/lang/String;

    move-result-object v2

    const-string v3, "0.4.0.127.0.7.2.2.2.1"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 82
    sget-object v0, Lorg/ejbca/cvc/CVCTagEnum;->COEFFICIENT_A:Lorg/ejbca/cvc/CVCTagEnum;

    sget-object v1, Lorg/ejbca/cvc/CVCTagEnum;->EXPONENT:Lorg/ejbca/cvc/CVCTagEnum;

    invoke-static {v0, v1, p0}, Lorg/ejbca/cvc/KeyFactory;->copyField(Lorg/ejbca/cvc/CVCTagEnum;Lorg/ejbca/cvc/CVCTagEnum;Lorg/ejbca/cvc/GenericPublicKeyField;)V

    .line 83
    new-instance v0, Lorg/ejbca/cvc/PublicKeyRSA;

    invoke-direct {v0, p0}, Lorg/ejbca/cvc/PublicKeyRSA;-><init>(Lorg/ejbca/cvc/GenericPublicKeyField;)V

    return-object v0

    .line 85
    :cond_0
    invoke-virtual {v1}, Lorg/ejbca/cvc/OIDField;->getValue()Ljava/lang/String;

    move-result-object v2

    const-string v3, "0.4.0.127.0.7.2.2.2.2"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 86
    sget-object v0, Lorg/ejbca/cvc/CVCTagEnum;->EXPONENT:Lorg/ejbca/cvc/CVCTagEnum;

    sget-object v1, Lorg/ejbca/cvc/CVCTagEnum;->COEFFICIENT_A:Lorg/ejbca/cvc/CVCTagEnum;

    invoke-static {v0, v1, p0}, Lorg/ejbca/cvc/KeyFactory;->copyField(Lorg/ejbca/cvc/CVCTagEnum;Lorg/ejbca/cvc/CVCTagEnum;Lorg/ejbca/cvc/GenericPublicKeyField;)V

    .line 87
    new-instance v0, Lorg/ejbca/cvc/PublicKeyEC;

    invoke-direct {v0, p0}, Lorg/ejbca/cvc/PublicKeyEC;-><init>(Lorg/ejbca/cvc/GenericPublicKeyField;)V

    return-object v0

    .line 90
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lorg/ejbca/cvc/OIDField;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 94
    new-instance v0, Lorg/ejbca/cvc/exception/ConstructionException;

    invoke-direct {v0, p0}, Lorg/ejbca/cvc/exception/ConstructionException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
