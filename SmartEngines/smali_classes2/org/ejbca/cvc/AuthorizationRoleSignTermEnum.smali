.class public final enum Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;
.super Ljava/lang/Enum;
.source "AuthorizationRoleSignTermEnum.java"

# interfaces
.implements Lorg/ejbca/cvc/AuthorizationRole;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;",
        ">;",
        "Lorg/ejbca/cvc/AuthorizationRole;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

.field public static final enum CVCA:Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

.field public static final enum DV_AB:Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

.field public static final enum DV_CSP:Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

.field public static final enum SIGNTERM:Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;


# instance fields
.field private value:B


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 23
    new-instance v0, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

    const/16 v1, 0xc0

    const-string v2, "CVCA"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;->CVCA:Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

    .line 25
    new-instance v1, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

    const/4 v2, 0x1

    const/16 v4, 0x80

    const-string v5, "DV_AB"

    invoke-direct {v1, v5, v2, v4}, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;->DV_AB:Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

    .line 27
    new-instance v2, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

    const/4 v4, 0x2

    const/16 v5, 0x40

    const-string v6, "DV_CSP"

    invoke-direct {v2, v6, v4, v5}, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;->DV_CSP:Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

    .line 29
    new-instance v4, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

    const-string v5, "SIGNTERM"

    const/4 v6, 0x3

    invoke-direct {v4, v5, v6, v3}, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;->SIGNTERM:Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

    .line 21
    filled-new-array {v0, v1, v2, v4}, [Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

    move-result-object v0

    sput-object v0, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;->$VALUES:[Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 34
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    int-to-byte p1, p3

    .line 35
    iput-byte p1, p0, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;->value:B

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;
    .locals 1

    .line 21
    const-class v0, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

    return-object p0
.end method

.method public static values()[Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;
    .locals 1

    .line 21
    sget-object v0, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;->$VALUES:[Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

    invoke-virtual {v0}, [Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

    return-object v0
.end method


# virtual methods
.method public getValue()B
    .locals 1

    .line 44
    iget-byte v0, p0, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;->value:B

    return v0
.end method

.method public isAccreditationBodyDV()Z
    .locals 1

    .line 69
    sget-object v0, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;->DV_AB:Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isAuthenticationTerminal()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isCVCA()Z
    .locals 1

    .line 49
    sget-object v0, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;->CVCA:Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isCertificationServiceProviderDV()Z
    .locals 1

    .line 74
    sget-object v0, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;->DV_CSP:Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isDV()Z
    .locals 1

    .line 54
    sget-object v0, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;->DV_AB:Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

    if-eq p0, v0, :cond_1

    sget-object v0, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;->DV_CSP:Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

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

    const/4 v0, 0x0

    return v0
.end method

.method public isForeignDV()Z
    .locals 1

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

    .line 89
    sget-object v0, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;->SIGNTERM:Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 95
    sget-object v0, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum$1;->$SwitchMap$org$ejbca$cvc$AuthorizationRoleSignTermEnum:[I

    invoke-virtual {p0}, Lorg/ejbca/cvc/AuthorizationRoleSignTermEnum;->ordinal()I

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

    .line 99
    const-string v0, "Signature-Terminal"

    return-object v0

    .line 101
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Enum case not handled"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 98
    :cond_1
    const-string v0, "DV-Certification-Service-Provider"

    return-object v0

    .line 97
    :cond_2
    const-string v0, "DV-Accreditation-Body"

    return-object v0

    .line 96
    :cond_3
    const-string v0, "CVCA"

    return-object v0
.end method
