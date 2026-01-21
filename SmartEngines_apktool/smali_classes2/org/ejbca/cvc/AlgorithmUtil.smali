.class public Lorg/ejbca/cvc/AlgorithmUtil;
.super Ljava/lang/Object;
.source "AlgorithmUtil.java"


# static fields
.field private static algorithmMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lorg/ejbca/cvc/OIDField;",
            ">;"
        }
    .end annotation
.end field

.field private static conversionMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 25
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/ejbca/cvc/AlgorithmUtil;->algorithmMap:Ljava/util/HashMap;

    .line 26
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/ejbca/cvc/AlgorithmUtil;->conversionMap:Ljava/util/HashMap;

    .line 29
    sget-object v0, Lorg/ejbca/cvc/AlgorithmUtil;->algorithmMap:Ljava/util/HashMap;

    const-string v1, "SHA1WITHRSA"

    sget-object v2, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_TA_RSA_v1_5_SHA_1:Lorg/ejbca/cvc/OIDField;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    sget-object v0, Lorg/ejbca/cvc/AlgorithmUtil;->algorithmMap:Ljava/util/HashMap;

    const-string v1, "SHA256WITHRSA"

    sget-object v2, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_TA_RSA_v1_5_SHA_256:Lorg/ejbca/cvc/OIDField;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    sget-object v0, Lorg/ejbca/cvc/AlgorithmUtil;->algorithmMap:Ljava/util/HashMap;

    const-string v1, "SHA512WITHRSA"

    sget-object v2, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_TA_RSA_v1_5_SHA_512:Lorg/ejbca/cvc/OIDField;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    sget-object v0, Lorg/ejbca/cvc/AlgorithmUtil;->algorithmMap:Ljava/util/HashMap;

    const-string v1, "SHA1WITHRSAANDMGF1"

    sget-object v2, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_TA_RSA_PSS_SHA_1:Lorg/ejbca/cvc/OIDField;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    sget-object v0, Lorg/ejbca/cvc/AlgorithmUtil;->algorithmMap:Ljava/util/HashMap;

    const-string v1, "SHA256WITHRSAANDMGF1"

    sget-object v2, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_TA_RSA_PSS_SHA_256:Lorg/ejbca/cvc/OIDField;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    sget-object v0, Lorg/ejbca/cvc/AlgorithmUtil;->algorithmMap:Ljava/util/HashMap;

    const-string v1, "SHA512WITHRSAANDMGF1"

    sget-object v2, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_TA_RSA_PSS_SHA_512:Lorg/ejbca/cvc/OIDField;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    sget-object v0, Lorg/ejbca/cvc/AlgorithmUtil;->algorithmMap:Ljava/util/HashMap;

    sget-object v1, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_TA_ECDSA_SHA_1:Lorg/ejbca/cvc/OIDField;

    const-string v2, "SHA1WITHECDSA"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    sget-object v0, Lorg/ejbca/cvc/AlgorithmUtil;->algorithmMap:Ljava/util/HashMap;

    sget-object v1, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_TA_ECDSA_SHA_224:Lorg/ejbca/cvc/OIDField;

    const-string v3, "SHA224WITHECDSA"

    invoke-virtual {v0, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    sget-object v0, Lorg/ejbca/cvc/AlgorithmUtil;->algorithmMap:Ljava/util/HashMap;

    sget-object v1, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_TA_ECDSA_SHA_256:Lorg/ejbca/cvc/OIDField;

    const-string v4, "SHA256WITHECDSA"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    sget-object v0, Lorg/ejbca/cvc/AlgorithmUtil;->algorithmMap:Ljava/util/HashMap;

    sget-object v1, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_TA_ECDSA_SHA_384:Lorg/ejbca/cvc/OIDField;

    const-string v5, "SHA384WITHECDSA"

    invoke-virtual {v0, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    sget-object v0, Lorg/ejbca/cvc/AlgorithmUtil;->algorithmMap:Ljava/util/HashMap;

    sget-object v1, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_TA_ECDSA_SHA_512:Lorg/ejbca/cvc/OIDField;

    const-string v6, "SHA512WITHECDSA"

    invoke-virtual {v0, v6, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    sget-object v0, Lorg/ejbca/cvc/AlgorithmUtil;->conversionMap:Ljava/util/HashMap;

    invoke-virtual {v0, v2, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    sget-object v0, Lorg/ejbca/cvc/AlgorithmUtil;->conversionMap:Ljava/util/HashMap;

    invoke-virtual {v0, v3, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    sget-object v0, Lorg/ejbca/cvc/AlgorithmUtil;->conversionMap:Ljava/util/HashMap;

    invoke-virtual {v0, v4, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    sget-object v0, Lorg/ejbca/cvc/AlgorithmUtil;->conversionMap:Ljava/util/HashMap;

    invoke-virtual {v0, v5, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    sget-object v0, Lorg/ejbca/cvc/AlgorithmUtil;->conversionMap:Ljava/util/HashMap;

    invoke-virtual {v0, v6, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static convertAlgorithmNameToCVC(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 75
    sget-object v0, Lorg/ejbca/cvc/AlgorithmUtil;->conversionMap:Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    return-object v0

    .line 79
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getAlgorithmName(Lorg/ejbca/cvc/OIDField;)Ljava/lang/String;
    .locals 4

    .line 88
    sget-object v0, Lorg/ejbca/cvc/AlgorithmUtil;->algorithmMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 89
    sget-object v2, Lorg/ejbca/cvc/AlgorithmUtil;->algorithmMap:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/ejbca/cvc/OIDField;

    .line 90
    invoke-virtual {v2}, Lorg/ejbca/cvc/OIDField;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lorg/ejbca/cvc/OIDField;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    .line 94
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown OIDField: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/ejbca/cvc/OIDField;->getValue()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static getOIDField(Ljava/lang/String;)Lorg/ejbca/cvc/OIDField;
    .locals 3

    .line 63
    sget-object v0, Lorg/ejbca/cvc/AlgorithmUtil;->algorithmMap:Ljava/util/HashMap;

    invoke-static {p0}, Lorg/ejbca/cvc/AlgorithmUtil;->convertAlgorithmNameToCVC(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/ejbca/cvc/OIDField;

    if-eqz v0, :cond_0

    return-object v0

    .line 65
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported algorithmName: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
