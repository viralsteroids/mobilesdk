.class public Lorg/ejbca/cvc/CVCAuthorizationTemplate;
.super Lorg/ejbca/cvc/AbstractSequence;
.source "CVCAuthorizationTemplate.java"


# static fields
.field private static allowedFields:[Lorg/ejbca/cvc/CVCTagEnum; = null

.field private static final serialVersionUID:J = 0x1L


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x2

    .line 29
    new-array v0, v0, [Lorg/ejbca/cvc/CVCTagEnum;

    const/4 v1, 0x0

    sget-object v2, Lorg/ejbca/cvc/CVCTagEnum;->OID:Lorg/ejbca/cvc/CVCTagEnum;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lorg/ejbca/cvc/CVCTagEnum;->ROLE_AND_ACCESS_RIGHTS:Lorg/ejbca/cvc/CVCTagEnum;

    aput-object v2, v0, v1

    sput-object v0, Lorg/ejbca/cvc/CVCAuthorizationTemplate;->allowedFields:[Lorg/ejbca/cvc/CVCTagEnum;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 43
    sget-object v0, Lorg/ejbca/cvc/CVCTagEnum;->HOLDER_AUTH_TEMPLATE:Lorg/ejbca/cvc/CVCTagEnum;

    invoke-direct {p0, v0}, Lorg/ejbca/cvc/AbstractSequence;-><init>(Lorg/ejbca/cvc/CVCTagEnum;)V

    return-void
.end method

.method public constructor <init>(Lorg/ejbca/cvc/AuthorizationRole;Lorg/ejbca/cvc/AccessRights;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/ejbca/cvc/exception/ConstructionException;
        }
    .end annotation

    .line 67
    invoke-direct {p0}, Lorg/ejbca/cvc/CVCAuthorizationTemplate;-><init>()V

    .line 69
    invoke-static {p1, p2}, Lorg/ejbca/cvc/CVCAuthorizationTemplate;->getOIDForEnums(Lorg/ejbca/cvc/AuthorizationRole;Lorg/ejbca/cvc/AccessRights;)Lorg/ejbca/cvc/OIDField;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/ejbca/cvc/CVCAuthorizationTemplate;->addSubfield(Lorg/ejbca/cvc/CVCObject;)V

    .line 70
    new-instance v0, Lorg/ejbca/cvc/AuthorizationField;

    invoke-direct {v0, p1, p2}, Lorg/ejbca/cvc/AuthorizationField;-><init>(Lorg/ejbca/cvc/AuthorizationRole;Lorg/ejbca/cvc/AccessRights;)V

    invoke-virtual {p0, v0}, Lorg/ejbca/cvc/CVCAuthorizationTemplate;->addSubfield(Lorg/ejbca/cvc/CVCObject;)V

    return-void
.end method

.method public constructor <init>(Lorg/ejbca/cvc/AuthorizationRoleEnum;Lorg/ejbca/cvc/AccessRightEnum;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/ejbca/cvc/exception/ConstructionException;
        }
    .end annotation

    .line 78
    invoke-direct {p0, p1, p2}, Lorg/ejbca/cvc/CVCAuthorizationTemplate;-><init>(Lorg/ejbca/cvc/AuthorizationRole;Lorg/ejbca/cvc/AccessRights;)V

    return-void
.end method

.method public static getOIDForEnums(Lorg/ejbca/cvc/AuthorizationRole;Lorg/ejbca/cvc/AccessRights;)Lorg/ejbca/cvc/OIDField;
    .locals 3

    .line 85
    instance-of v0, p0, Lorg/ejbca/cvc/AuthorizationRoleEnum;

    if-eqz v0, :cond_0

    instance-of v0, p1, Lorg/ejbca/cvc/AccessRightEnum;

    if-eqz v0, :cond_0

    .line 86
    sget-object p0, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_EAC_ePassport:Lorg/ejbca/cvc/OIDField;

    return-object p0

    .line 87
    :cond_0
    instance-of v0, p0, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

    if-eqz v0, :cond_1

    instance-of v0, p1, Lorg/ejbca/cvc/AccessRightAuthTerm;

    if-eqz v0, :cond_1

    .line 88
    sget-object p0, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_EAC_roles_AT:Lorg/ejbca/cvc/OIDField;

    return-object p0

    .line 89
    :cond_1
    instance-of v0, p0, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

    if-eqz v0, :cond_2

    instance-of v0, p1, Lorg/ejbca/cvc/AccessRightSignTermEnum;

    if-eqz v0, :cond_2

    .line 90
    sget-object p0, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_EAC_roles_ST:Lorg/ejbca/cvc/OIDField;

    return-object p0

    .line 92
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported roles/rights type (or mismatch). Got role of type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string v1, ", but rights of type "

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method addSubfield(Lorg/ejbca/cvc/CVCObject;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/ejbca/cvc/exception/ConstructionException;
        }
    .end annotation

    .line 48
    invoke-super {p0, p1}, Lorg/ejbca/cvc/AbstractSequence;->addSubfield(Lorg/ejbca/cvc/CVCObject;)V

    .line 50
    instance-of v0, p1, Lorg/ejbca/cvc/AuthorizationField;

    if-eqz v0, :cond_0

    .line 52
    :try_start_0
    check-cast p1, Lorg/ejbca/cvc/AuthorizationField;

    .line 53
    sget-object v0, Lorg/ejbca/cvc/CVCTagEnum;->OID:Lorg/ejbca/cvc/CVCTagEnum;

    invoke-virtual {p0, v0}, Lorg/ejbca/cvc/CVCAuthorizationTemplate;->getSubfield(Lorg/ejbca/cvc/CVCTagEnum;)Lorg/ejbca/cvc/CVCObject;

    move-result-object v0

    check-cast v0, Lorg/ejbca/cvc/OIDField;

    .line 54
    invoke-virtual {p1, v0}, Lorg/ejbca/cvc/AuthorizationField;->fixEnumTypes(Lorg/ejbca/cvc/OIDField;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 56
    new-instance v0, Lorg/ejbca/cvc/exception/ConstructionException;

    const-string v1, "Tried to add an AuthorizationField without an OID"

    invoke-direct {v0, v1, p1}, Lorg/ejbca/cvc/exception/ConstructionException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    return-void
.end method

.method protected getAllowedFields()[Lorg/ejbca/cvc/CVCTagEnum;
    .locals 1

    .line 36
    sget-object v0, Lorg/ejbca/cvc/CVCAuthorizationTemplate;->allowedFields:[Lorg/ejbca/cvc/CVCTagEnum;

    return-object v0
.end method

.method public getAuthorizationField()Lorg/ejbca/cvc/AuthorizationField;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchFieldException;
        }
    .end annotation

    .line 109
    sget-object v0, Lorg/ejbca/cvc/CVCTagEnum;->ROLE_AND_ACCESS_RIGHTS:Lorg/ejbca/cvc/CVCTagEnum;

    invoke-virtual {p0, v0}, Lorg/ejbca/cvc/CVCAuthorizationTemplate;->getSubfield(Lorg/ejbca/cvc/CVCTagEnum;)Lorg/ejbca/cvc/CVCObject;

    move-result-object v0

    check-cast v0, Lorg/ejbca/cvc/AuthorizationField;

    return-object v0
.end method

.method public getObjectIdentifier()Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NoSuchFieldException;
        }
    .end annotation

    .line 101
    sget-object v0, Lorg/ejbca/cvc/CVCTagEnum;->OID:Lorg/ejbca/cvc/CVCTagEnum;

    invoke-virtual {p0, v0}, Lorg/ejbca/cvc/CVCAuthorizationTemplate;->getSubfield(Lorg/ejbca/cvc/CVCTagEnum;)Lorg/ejbca/cvc/CVCObject;

    move-result-object v0

    check-cast v0, Lorg/ejbca/cvc/OIDField;

    invoke-virtual {v0}, Lorg/ejbca/cvc/OIDField;->getValue()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
