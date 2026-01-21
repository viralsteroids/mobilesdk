.class public Lorg/ejbca/cvc/AuthorizationRoleRawValue;
.super Ljava/lang/Object;
.source "AuthorizationRoleRawValue.java"

# interfaces
.implements Lorg/ejbca/cvc/AuthorizationRole;


# static fields
.field private static final EXCEPTION_MSG:Ljava/lang/String; = "Authorization Role object does not know its type/OID yet. This is a bug."


# instance fields
.field private final value:B


# direct methods
.method constructor <init>(B)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-byte p1, p0, Lorg/ejbca/cvc/AuthorizationRoleRawValue;->value:B

    return-void
.end method


# virtual methods
.method public getValue()B
    .locals 1

    .line 79
    iget-byte v0, p0, Lorg/ejbca/cvc/AuthorizationRoleRawValue;->value:B

    return v0
.end method

.method public isAccreditationBodyDV()Z
    .locals 2

    .line 54
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Authorization Role object does not know its type/OID yet. This is a bug."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public isAuthenticationTerminal()Z
    .locals 2

    .line 69
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Authorization Role object does not know its type/OID yet. This is a bug."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public isCVCA()Z
    .locals 2

    .line 34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Authorization Role object does not know its type/OID yet. This is a bug."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public isCertificationServiceProviderDV()Z
    .locals 2

    .line 59
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Authorization Role object does not know its type/OID yet. This is a bug."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public isDV()Z
    .locals 2

    .line 39
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Authorization Role object does not know its type/OID yet. This is a bug."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public isDomesticDV()Z
    .locals 2

    .line 44
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Authorization Role object does not know its type/OID yet. This is a bug."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public isForeignDV()Z
    .locals 2

    .line 49
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Authorization Role object does not know its type/OID yet. This is a bug."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public isIS()Z
    .locals 2

    .line 64
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Authorization Role object does not know its type/OID yet. This is a bug."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public isSignatureTerminal()Z
    .locals 2

    .line 74
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Authorization Role object does not know its type/OID yet. This is a bug."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public name()Ljava/lang/String;
    .locals 2

    .line 84
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Authorization Role object does not know its type/OID yet. This is a bug."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
