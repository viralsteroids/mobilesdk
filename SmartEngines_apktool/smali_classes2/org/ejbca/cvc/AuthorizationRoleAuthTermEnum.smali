.class public final enum Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;
.super Ljava/lang/Enum;
.source "AuthorizationRoleAuthTermEnum.java"

# interfaces
.implements Lorg/ejbca/cvc/AuthorizationRole;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;",
        ">;",
        "Lorg/ejbca/cvc/AuthorizationRole;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

.field public static final enum AUTHTERM:Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

.field public static final enum CVCA:Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

.field public static final enum DV_D:Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

.field public static final enum DV_F:Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;


# instance fields
.field private value:B


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 24
    new-instance v0, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

    const/16 v1, 0xc0

    const-string v2, "CVCA"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;->CVCA:Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

    .line 26
    new-instance v1, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

    const/4 v2, 0x1

    const/16 v4, 0x80

    const-string v5, "DV_D"

    invoke-direct {v1, v5, v2, v4}, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;->DV_D:Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

    .line 28
    new-instance v2, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

    const/4 v4, 0x2

    const/16 v5, 0x40

    const-string v6, "DV_F"

    invoke-direct {v2, v6, v4, v5}, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;->DV_F:Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

    .line 30
    new-instance v4, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

    const-string v5, "AUTHTERM"

    const/4 v6, 0x3

    invoke-direct {v4, v5, v6, v3}, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;->AUTHTERM:Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

    .line 22
    filled-new-array {v0, v1, v2, v4}, [Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

    move-result-object v0

    sput-object v0, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;->$VALUES:[Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 35
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    int-to-byte p1, p3

    .line 36
    iput-byte p1, p0, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;->value:B

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;
    .locals 1

    .line 22
    const-class v0, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

    return-object p0
.end method

.method public static values()[Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;
    .locals 1

    .line 22
    sget-object v0, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;->$VALUES:[Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

    invoke-virtual {v0}, [Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

    return-object v0
.end method


# virtual methods
.method public getValue()B
    .locals 1

    .line 45
    iget-byte v0, p0, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;->value:B

    return v0
.end method

.method public isAccreditationBodyDV()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isAuthenticationTerminal()Z
    .locals 1

    .line 85
    sget-object v0, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;->AUTHTERM:Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isCVCA()Z
    .locals 1

    .line 50
    sget-object v0, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;->CVCA:Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isCertificationServiceProviderDV()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isDV()Z
    .locals 1

    .line 55
    sget-object v0, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;->DV_D:Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

    if-eq p0, v0, :cond_1

    sget-object v0, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;->DV_F:Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public isDomesticDV()Z
    .locals 1

    .line 60
    sget-object v0, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;->DV_D:Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isForeignDV()Z
    .locals 1

    .line 65
    sget-object v0, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;->DV_F:Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isIS()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isSignatureTerminal()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 96
    sget-object v0, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum$1;->$SwitchMap$org$ejbca$cvc$AuthorizationRoleAuthTermEnum:[I

    invoke-virtual {p0}, Lorg/ejbca/cvc/AuthorizationRoleAuthTermEnum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 100
    const-string v0, "Authentication-Terminal"

    return-object v0

    .line 102
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Enum case not handled"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 99
    :cond_1
    const-string v0, "DV-foreign"

    return-object v0

    .line 98
    :cond_2
    const-string v0, "DV-domestic"

    return-object v0

    .line 97
    :cond_3
    const-string v0, "CVCA"

    return-object v0
.end method
