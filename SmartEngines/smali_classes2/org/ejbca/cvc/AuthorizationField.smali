.class public Lorg/ejbca/cvc/AuthorizationField;
.super Lorg/ejbca/cvc/AbstractDataField;
.source "AuthorizationField.java"


# static fields
.field private static final serialVersionUID:J = -0x4c06a81dff6de4fbL


# instance fields
.field private rights:Lorg/ejbca/cvc/AccessRights;

.field private role:Lorg/ejbca/cvc/AuthorizationRole;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 34
    sget-object v0, Lorg/ejbca/cvc/CVCTagEnum;->ROLE_AND_ACCESS_RIGHTS:Lorg/ejbca/cvc/CVCTagEnum;

    invoke-direct {p0, v0}, Lorg/ejbca/cvc/AbstractDataField;-><init>(Lorg/ejbca/cvc/CVCTagEnum;)V

    return-void
.end method

.method constructor <init>(Lorg/ejbca/cvc/AuthorizationRole;Lorg/ejbca/cvc/AccessRights;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lorg/ejbca/cvc/AuthorizationField;-><init>()V

    .line 45
    iput-object p1, p0, Lorg/ejbca/cvc/AuthorizationField;->role:Lorg/ejbca/cvc/AuthorizationRole;

    .line 46
    iput-object p2, p0, Lorg/ejbca/cvc/AuthorizationField;->rights:Lorg/ejbca/cvc/AccessRights;

    return-void
.end method

.method constructor <init>(Lorg/ejbca/cvc/AuthorizationRoleEnum;Lorg/ejbca/cvc/AccessRightEnum;)V
    .locals 0

    .line 50
    invoke-direct {p0, p1, p2}, Lorg/ejbca/cvc/AuthorizationField;-><init>(Lorg/ejbca/cvc/AuthorizationRole;Lorg/ejbca/cvc/AccessRights;)V

    return-void
.end method

.method constructor <init>([B)V
    .locals 2

    .line 60
    invoke-direct {p0}, Lorg/ejbca/cvc/AuthorizationField;-><init>()V

    .line 61
    array-length v0, p1

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    .line 64
    new-instance v0, Lorg/ejbca/cvc/AuthorizationRoleRawValue;

    const/4 v1, 0x0

    aget-byte v1, p1, v1

    invoke-direct {v0, v1}, Lorg/ejbca/cvc/AuthorizationRoleRawValue;-><init>(B)V

    iput-object v0, p0, Lorg/ejbca/cvc/AuthorizationField;->role:Lorg/ejbca/cvc/AuthorizationRole;

    .line 65
    new-instance v0, Lorg/ejbca/cvc/AccessRightsRawValue;

    invoke-direct {v0, p1}, Lorg/ejbca/cvc/AccessRightsRawValue;-><init>([B)V

    iput-object v0, p0, Lorg/ejbca/cvc/AuthorizationField;->rights:Lorg/ejbca/cvc/AccessRights;

    return-void

    .line 62
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "byte array length must be at least 1"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static getRightsFromBytes(Lorg/ejbca/cvc/OIDField;[B)Lorg/ejbca/cvc/AccessRights;
    .locals 5

    .line 159
    sget-object v0, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_EAC_ePassport:Lorg/ejbca/cvc/OIDField;

    invoke-virtual {v0, p0}, Lorg/ejbca/cvc/OIDField;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "byte array length must be 1, was "

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_3

    .line 160
    array-length p0, p1

    if-ne p0, v4, :cond_2

    .line 163
    aget-byte p0, p1, v3

    and-int/lit8 p0, p0, 0x3

    int-to-byte p0, p0

    .line 165
    invoke-static {}, Lorg/ejbca/cvc/AccessRightEnum;->values()[Lorg/ejbca/cvc/AccessRightEnum;

    move-result-object p1

    array-length v0, p1

    :goto_0
    if-ge v3, v0, :cond_1

    aget-object v1, p1, v3

    .line 166
    invoke-virtual {v1}, Lorg/ejbca/cvc/AccessRightEnum;->getValue()B

    move-result v4

    if-ne p0, v4, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v2

    .line 161
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length p1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 172
    :cond_3
    sget-object v0, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_EAC_roles_ST:Lorg/ejbca/cvc/OIDField;

    invoke-virtual {v0, p0}, Lorg/ejbca/cvc/OIDField;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 173
    array-length p0, p1

    if-ne p0, v4, :cond_6

    .line 176
    aget-byte p0, p1, v3

    and-int/lit8 p0, p0, 0x3

    int-to-byte p0, p0

    .line 178
    invoke-static {}, Lorg/ejbca/cvc/AccessRightSignTermEnum;->values()[Lorg/ejbca/cvc/AccessRightSignTermEnum;

    move-result-object p1

    array-length v0, p1

    :goto_1
    if-ge v3, v0, :cond_5

    aget-object v1, p1, v3

    .line 179
    invoke-virtual {v1}, Lorg/ejbca/cvc/AccessRightSignTermEnum;->getValue()B

    move-result v4

    if-ne p0, v4, :cond_4

    return-object v1

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    return-object v2

    .line 174
    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length p1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 185
    :cond_7
    sget-object v0, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_EAC_roles_AT:Lorg/ejbca/cvc/OIDField;

    invoke-virtual {v0, p0}, Lorg/ejbca/cvc/OIDField;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_9

    .line 186
    array-length p0, p1

    const/4 v0, 0x5

    if-ne p0, v0, :cond_8

    .line 189
    new-instance p0, Lorg/ejbca/cvc/AccessRightAuthTerm;

    invoke-direct {p0, p1}, Lorg/ejbca/cvc/AccessRightAuthTerm;-><init>([B)V

    return-object p0

    .line 187
    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "byte array length must be 5, was "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length p1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 191
    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "incorrect or unsupported OID"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static getRoleFromByte(Lorg/ejbca/cvc/OIDField;B)Lorg/ejbca/cvc/AuthorizationRole;
    .locals 4

    and-int/lit16 p1, p1, 0xc0

    int-to-byte p1, p1

    .line 137
    sget-object v0, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_EAC_ePassport:Lorg/ejbca/cvc/OIDField;

    invoke-virtual {v0, p0}, Lorg/ejbca/cvc/OIDField;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 138
    invoke-static {}, Lorg/ejbca/cvc/AuthorizationRoleEnum;->values()[Lorg/ejbca/cvc/AuthorizationRoleEnum;

    move-result-object p0

    goto :goto_0

    .line 139
    :cond_0
    sget-object v0, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_EAC_roles_ST:Lorg/ejbca/cvc/OIDField;

    invoke-virtual {v0, p0}, Lorg/ejbca/cvc/OIDField;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 140
    invoke-static {}, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;->values()[Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

    move-result-object p0

    goto :goto_0

    .line 141
    :cond_1
    sget-object v0, Lorg/ejbca/cvc/CVCObjectIdentifiers;->id_EAC_roles_AT:Lorg/ejbca/cvc/OIDField;

    invoke-virtual {v0, p0}, Lorg/ejbca/cvc/OIDField;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    .line 142
    invoke-static {}, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;->values()[Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

    move-result-object p0

    .line 148
    :goto_0
    array-length v0, p0

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_3

    aget-object v2, p0, v1

    .line 149
    invoke-interface {v2}, Lorg/ejbca/cvc/AuthorizationRole;->getValue()B

    move-result v3

    if-ne p1, v3, :cond_2

    return-object v2

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    const/4 p0, 0x0

    return-object p0

    .line 144
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "incorrect or unsupported OID"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method fixEnumTypes(Lorg/ejbca/cvc/OIDField;)V
    .locals 1

    .line 200
    iget-object v0, p0, Lorg/ejbca/cvc/AuthorizationField;->role:Lorg/ejbca/cvc/AuthorizationRole;

    invoke-interface {v0}, Lorg/ejbca/cvc/AuthorizationRole;->getValue()B

    move-result v0

    invoke-static {p1, v0}, Lorg/ejbca/cvc/AuthorizationField;->getRoleFromByte(Lorg/ejbca/cvc/OIDField;B)Lorg/ejbca/cvc/AuthorizationRole;

    move-result-object v0

    iput-object v0, p0, Lorg/ejbca/cvc/AuthorizationField;->role:Lorg/ejbca/cvc/AuthorizationRole;

    .line 201
    iget-object v0, p0, Lorg/ejbca/cvc/AuthorizationField;->rights:Lorg/ejbca/cvc/AccessRights;

    invoke-interface {v0}, Lorg/ejbca/cvc/AccessRights;->getEncoded()[B

    move-result-object v0

    invoke-static {p1, v0}, Lorg/ejbca/cvc/AuthorizationField;->getRightsFromBytes(Lorg/ejbca/cvc/OIDField;[B)Lorg/ejbca/cvc/AccessRights;

    move-result-object p1

    iput-object p1, p0, Lorg/ejbca/cvc/AuthorizationField;->rights:Lorg/ejbca/cvc/AccessRights;

    return-void
.end method

.method public getAccessRight()Lorg/ejbca/cvc/AccessRightEnum;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 103
    iget-object v0, p0, Lorg/ejbca/cvc/AuthorizationField;->rights:Lorg/ejbca/cvc/AccessRights;

    instance-of v1, v0, Lorg/ejbca/cvc/AccessRightEnum;

    if-eqz v1, :cond_0

    .line 106
    check-cast v0, Lorg/ejbca/cvc/AccessRightEnum;

    return-object v0

    .line 104
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Attempted to use deprecated getAccessRight method with an AT or ST certificate chain. It handles IS only."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getAccessRights()Lorg/ejbca/cvc/AccessRights;
    .locals 1

    .line 116
    iget-object v0, p0, Lorg/ejbca/cvc/AuthorizationField;->rights:Lorg/ejbca/cvc/AccessRights;

    return-object v0
.end method

.method public getAuthRole()Lorg/ejbca/cvc/AuthorizationRole;
    .locals 1

    .line 91
    iget-object v0, p0, Lorg/ejbca/cvc/AuthorizationField;->role:Lorg/ejbca/cvc/AuthorizationRole;

    return-object v0
.end method

.method protected getEncoded()[B
    .locals 4

    .line 121
    iget-object v0, p0, Lorg/ejbca/cvc/AuthorizationField;->rights:Lorg/ejbca/cvc/AccessRights;

    invoke-interface {v0}, Lorg/ejbca/cvc/AccessRights;->getEncoded()[B

    move-result-object v0

    const/4 v1, 0x0

    .line 122
    aget-byte v2, v0, v1

    iget-object v3, p0, Lorg/ejbca/cvc/AuthorizationField;->role:Lorg/ejbca/cvc/AuthorizationRole;

    invoke-interface {v3}, Lorg/ejbca/cvc/AuthorizationRole;->getValue()B

    move-result v3

    or-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    return-object v0
.end method

.method public getRole()Lorg/ejbca/cvc/AuthorizationRoleEnum;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 78
    iget-object v0, p0, Lorg/ejbca/cvc/AuthorizationField;->role:Lorg/ejbca/cvc/AuthorizationRole;

    instance-of v1, v0, Lorg/ejbca/cvc/AuthorizationRoleEnum;

    if-eqz v1, :cond_0

    .line 81
    check-cast v0, Lorg/ejbca/cvc/AuthorizationRoleEnum;

    return-object v0

    .line 79
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Attempted to use deprecated getRole method with in an AT or ST certificate chain. It handles IS only."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected valueAsText()Ljava/lang/String;
    .locals 2

    .line 128
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lorg/ejbca/cvc/AuthorizationField;->getEncoded()[B

    move-result-object v1

    invoke-static {v1}, Lorg/ejbca/cvc/util/StringConverter;->byteToHex([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/ejbca/cvc/AuthorizationField;->role:Lorg/ejbca/cvc/AuthorizationRole;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/ejbca/cvc/AuthorizationField;->rights:Lorg/ejbca/cvc/AccessRights;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
