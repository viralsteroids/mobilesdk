.class public interface abstract Lorg/ejbca/cvc/CVCObjectIdentifiers;
.super Ljava/lang/Object;
.source "CVCObjectIdentifiers.java"


# static fields
.field public static final bsi_de:Ljava/lang/String; = "0.4.0.127.0.7"

.field public static final id_EAC_ePassport:Lorg/ejbca/cvc/OIDField;

.field public static final id_EAC_roles_AT:Lorg/ejbca/cvc/OIDField;

.field public static final id_EAC_roles_ST:Lorg/ejbca/cvc/OIDField;

.field public static final id_TA:Ljava/lang/String; = "0.4.0.127.0.7.2.2.2"

.field public static final id_TA_ECDSA:Ljava/lang/String; = "0.4.0.127.0.7.2.2.2.2"

.field public static final id_TA_ECDSA_SHA_1:Lorg/ejbca/cvc/OIDField;

.field public static final id_TA_ECDSA_SHA_224:Lorg/ejbca/cvc/OIDField;

.field public static final id_TA_ECDSA_SHA_256:Lorg/ejbca/cvc/OIDField;

.field public static final id_TA_ECDSA_SHA_384:Lorg/ejbca/cvc/OIDField;

.field public static final id_TA_ECDSA_SHA_512:Lorg/ejbca/cvc/OIDField;

.field public static final id_TA_RSA:Ljava/lang/String; = "0.4.0.127.0.7.2.2.2.1"

.field public static final id_TA_RSA_PSS_SHA_1:Lorg/ejbca/cvc/OIDField;

.field public static final id_TA_RSA_PSS_SHA_256:Lorg/ejbca/cvc/OIDField;

.field public static final id_TA_RSA_PSS_SHA_512:Lorg/ejbca/cvc/OIDField;

.field public static final id_TA_RSA_v1_5_SHA_1:Lorg/ejbca/cvc/OIDField;

.field public static final id_TA_RSA_v1_5_SHA_256:Lorg/ejbca/cvc/OIDField;

.field public static final id_TA_RSA_v1_5_SHA_512:Lorg/ejbca/cvc/OIDField;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 39
    new-instance v0, Lorg/ejbca/cvc/OIDField;

    const-string v1, "0.4.0.127.0.7.2.2.2.1.1"

    invoke-direct {v0, v1}, Lorg/ejbca/cvc/OIDField;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_TA_RSA_v1_5_SHA_1:Lorg/ejbca/cvc/OIDField;

    .line 40
    new-instance v0, Lorg/ejbca/cvc/OIDField;

    const-string v1, "0.4.0.127.0.7.2.2.2.1.2"

    invoke-direct {v0, v1}, Lorg/ejbca/cvc/OIDField;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_TA_RSA_v1_5_SHA_256:Lorg/ejbca/cvc/OIDField;

    .line 41
    new-instance v0, Lorg/ejbca/cvc/OIDField;

    const-string v1, "0.4.0.127.0.7.2.2.2.1.5"

    invoke-direct {v0, v1}, Lorg/ejbca/cvc/OIDField;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_TA_RSA_v1_5_SHA_512:Lorg/ejbca/cvc/OIDField;

    .line 42
    new-instance v0, Lorg/ejbca/cvc/OIDField;

    const-string v1, "0.4.0.127.0.7.2.2.2.1.3"

    invoke-direct {v0, v1}, Lorg/ejbca/cvc/OIDField;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_TA_RSA_PSS_SHA_1:Lorg/ejbca/cvc/OIDField;

    .line 43
    new-instance v0, Lorg/ejbca/cvc/OIDField;

    const-string v1, "0.4.0.127.0.7.2.2.2.1.4"

    invoke-direct {v0, v1}, Lorg/ejbca/cvc/OIDField;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_TA_RSA_PSS_SHA_256:Lorg/ejbca/cvc/OIDField;

    .line 44
    new-instance v0, Lorg/ejbca/cvc/OIDField;

    const-string v1, "0.4.0.127.0.7.2.2.2.1.6"

    invoke-direct {v0, v1}, Lorg/ejbca/cvc/OIDField;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_TA_RSA_PSS_SHA_512:Lorg/ejbca/cvc/OIDField;

    .line 47
    new-instance v0, Lorg/ejbca/cvc/OIDField;

    const-string v1, "0.4.0.127.0.7.2.2.2.2.1"

    invoke-direct {v0, v1}, Lorg/ejbca/cvc/OIDField;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_TA_ECDSA_SHA_1:Lorg/ejbca/cvc/OIDField;

    .line 48
    new-instance v0, Lorg/ejbca/cvc/OIDField;

    const-string v1, "0.4.0.127.0.7.2.2.2.2.2"

    invoke-direct {v0, v1}, Lorg/ejbca/cvc/OIDField;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_TA_ECDSA_SHA_224:Lorg/ejbca/cvc/OIDField;

    .line 49
    new-instance v0, Lorg/ejbca/cvc/OIDField;

    const-string v1, "0.4.0.127.0.7.2.2.2.2.3"

    invoke-direct {v0, v1}, Lorg/ejbca/cvc/OIDField;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_TA_ECDSA_SHA_256:Lorg/ejbca/cvc/OIDField;

    .line 50
    new-instance v0, Lorg/ejbca/cvc/OIDField;

    const-string v1, "0.4.0.127.0.7.2.2.2.2.4"

    invoke-direct {v0, v1}, Lorg/ejbca/cvc/OIDField;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_TA_ECDSA_SHA_384:Lorg/ejbca/cvc/OIDField;

    .line 51
    new-instance v0, Lorg/ejbca/cvc/OIDField;

    const-string v1, "0.4.0.127.0.7.2.2.2.2.5"

    invoke-direct {v0, v1}, Lorg/ejbca/cvc/OIDField;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_TA_ECDSA_SHA_512:Lorg/ejbca/cvc/OIDField;

    .line 57
    new-instance v0, Lorg/ejbca/cvc/OIDField;

    const-string v1, "0.4.0.127.0.7.3.1.2.1"

    invoke-direct {v0, v1}, Lorg/ejbca/cvc/OIDField;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_EAC_ePassport:Lorg/ejbca/cvc/OIDField;

    .line 58
    new-instance v0, Lorg/ejbca/cvc/OIDField;

    const-string v1, "0.4.0.127.0.7.3.1.2.2"

    invoke-direct {v0, v1}, Lorg/ejbca/cvc/OIDField;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_EAC_roles_AT:Lorg/ejbca/cvc/OIDField;

    .line 59
    new-instance v0, Lorg/ejbca/cvc/OIDField;

    const-string v1, "0.4.0.127.0.7.3.1.2.3"

    invoke-direct {v0, v1}, Lorg/ejbca/cvc/OIDField;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_EAC_roles_ST:Lorg/ejbca/cvc/OIDField;

    return-void
.end method
